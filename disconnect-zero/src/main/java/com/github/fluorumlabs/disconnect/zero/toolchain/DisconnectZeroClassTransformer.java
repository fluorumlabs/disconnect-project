package com.github.fluorumlabs.disconnect.zero.toolchain;

import com.github.fluorumlabs.disconnect.zero.annotations.Attribute;
import com.github.fluorumlabs.disconnect.zero.annotations.DefaultSlot;
import com.github.fluorumlabs.disconnect.zero.annotations.NamedSlot;
import com.github.fluorumlabs.disconnect.zero.annotations.Query;
import com.github.fluorumlabs.disconnect.zero.component.CustomElementComponent;
import com.github.fluorumlabs.disconnect.zero.component.HasElement;
import com.github.fluorumlabs.disconnect.zero.container.ComponentList;
import com.github.fluorumlabs.disconnect.zero.container.SlotComponentList;
import com.github.fluorumlabs.disconnect.zero.internals.CustomElementRegistration;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableValue;
import js.web.dom.Element;
import org.apache.commons.lang3.StringUtils;
import org.teavm.model.*;
import org.teavm.model.emit.ProgramEmitter;
import org.teavm.model.emit.ValueEmitter;
import org.teavm.model.instructions.ClassConstantInstruction;
import org.teavm.model.instructions.PutFieldInstruction;
import org.teavm.vm.spi.TeaVMHost;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.*;

import static com.github.fluorumlabs.disconnect.core.internals.CamelCaseUtils.toKebabCase;


public class DisconnectZeroClassTransformer implements ClassHolderTransformer {

    private final Map<String, Class<?>> CUSTOM_ELEMENTS;

    public DisconnectZeroClassTransformer(TeaVMHost host) {
        ComponentData.clear();
        ComponentData.setRoot(new File(host.getProperties().getProperty("frontend.directory")));
        ComponentData.setArtifactId(host.getProperties().getProperty("frontend.artifactId"));

        CUSTOM_ELEMENTS = new HashMap<>();
        for (CustomElementRegistration registration : ServiceLoader.load(CustomElementRegistration.class, host.getClassLoader())) {
            CUSTOM_ELEMENTS.put(registration.getTagName(), registration.getComponentClass());
        }
    }

    @Override
    public void transformClass(ClassHolder cls, ClassHolderTransformerContext context) {
        Set<String> dependents = ComponentData.add(cls, context);

        int index = 0;
        for (String dependent : dependents) {
            Class<?> aClass = CUSTOM_ELEMENTS.get(dependent);
            if (aClass != null) {
                FieldHolder holder = new FieldHolder("$$dep$$"+index);
                holder.setType(ValueType.parse(Class.class));
                holder.setLevel(AccessLevel.PRIVATE);
                holder.getModifiers().add(ElementModifier.FINAL);
                holder.getModifiers().add(ElementModifier.STATIC);
                cls.addField(holder);
                addClinitInitializer(cls, holder, aClass, context);
                index++;
            }
        }

        if (!CustomElementComponent.class.getName().equals(cls.getName()) &&
                ComponentData.descendsFrom(cls, context.getHierarchy().getClassSource(), CustomElementComponent.class.getName())) {
            try {
                Class<?> componentClass = Class.forName(cls.getName());
                implementConstructor(componentClass, cls, context);
            } catch (ClassNotFoundException e) {
                // ignore
            }
        }

    }

    private static void implementConstructor(Class<?> componentClass, ClassHolder cls, ClassHolderTransformerContext context) {
        MethodHolder constructor = new MethodHolder("constructor", ValueType.VOID);
        constructor.setLevel(AccessLevel.PUBLIC);

        ProgramEmitter $ = ProgramEmitter.create(constructor, context.getHierarchy());
        ValueEmitter that = $.var(0, componentClass);

        that.invokeSpecial(componentClass.getSuperclass(), "constructor");
        ValueEmitter root = that.invokeVirtual("getRoot", ComponentList.class);

        for (Field field : componentClass.getDeclaredFields()) {
            Attribute attribute = field.getAnnotation(Attribute.class);
            if (field.getType().equals(ObservableValue.class) && attribute != null) {
                String attributeName = StringUtils.defaultIfEmpty(attribute.name(), toKebabCase(field.getName()));
                String defaultValue = attribute.defaultValue();

                Type[] actualTypeArguments = ((ParameterizedType) (field.getGenericType())).getActualTypeArguments();
                if (actualTypeArguments.length == 1) {
                    if (actualTypeArguments[0].equals(String.class)) {
                        that.setField(field.getName(), that.invokeSpecial(CustomElementComponent.class.getName(), "addStringAttribute", ValueType.object(ObservableValue.class.getName()), $.constant(attributeName), $.constant(defaultValue)));
                    } else if (actualTypeArguments[0].equals(Integer.class)) {
                        that.setField(field.getName(), that.invokeSpecial(CustomElementComponent.class.getName(), "addIntegerAttribute", ValueType.object(ObservableValue.class.getName()), $.constant(attributeName), $.constant(defaultValue)));
                    } else if (actualTypeArguments[0].equals(Double.class)) {
                        that.setField(field.getName(), that.invokeSpecial(CustomElementComponent.class.getName(), "addDoubleAttribute", ValueType.object(ObservableValue.class.getName()), $.constant(attributeName), $.constant(defaultValue)));
                    } else if (actualTypeArguments[0].equals(Boolean.class)) {
                        that.setField(field.getName(), that.invokeSpecial(CustomElementComponent.class.getName(), "addBooleanAttribute", ValueType.object(ObservableValue.class.getName()), $.constant(attributeName), $.constant(defaultValue)));
                    }
                }
            }

            Query query = field.getAnnotation(Query.class);
            if (query != null && HasElement.class.isAssignableFrom(field.getType())) {
                ValueEmitter componentInstance = root.invokeVirtual("find", Optional.class, $.constant(query.value())).invokeVirtual("orElse", Object.class, $.constantNull(Object.class)).cast(componentClass);
                that.setField(field.getName(), componentInstance);
            }

            NamedSlot namedSlot = field.getAnnotation(NamedSlot.class);
            if (namedSlot != null && Collection.class.isAssignableFrom(field.getType())) {
                ValueEmitter componentList = $.construct(SlotComponentList.class, that.invokeVirtual("getElement", Element.class), $.constant(namedSlot.value()));
                that.setField(field.getName(), componentList.cast(field.getType()));
            }

            DefaultSlot defaultSlot = field.getAnnotation(DefaultSlot.class);
            if (defaultSlot != null && Collection.class.isAssignableFrom(field.getType())) {
                ValueEmitter componentList = $.construct(SlotComponentList.class, that.invokeVirtual("getElement", Element.class), $.constant(""));
                that.setField(field.getName(), componentList.cast(field.getType()));
            }
        }

        $.exit();

        cls.addMethod(constructor);
    }

    private void addClinitInitializer(ClassHolder cls, FieldHolder fh, Class<?> value, ClassHolderTransformerContext context) {
        MethodHolder clinit = cls.getMethod(new MethodDescriptor("<clinit>", ValueType.VOID));
        if (clinit == null) {
            clinit = new MethodHolder("<clinit>", ValueType.VOID);
            clinit.getModifiers().add(ElementModifier.STATIC);

            ProgramEmitter $ = ProgramEmitter.create(clinit, context.getHierarchy());
            $.exit();

            cls.addMethod(clinit);
        }

        Program clinitProgram = clinit.getProgram();
        BasicBlock basicBlock = clinitProgram.basicBlockAt(0);

        Instruction first = basicBlock.getFirstInstruction();

        Variable varValue = clinitProgram.createVariable();

        ClassConstantInstruction classConstantInstruction = new ClassConstantInstruction();
        classConstantInstruction.setConstant(ValueType.object(value.getName()));
        classConstantInstruction.setReceiver(varValue);

        first.insertPrevious(classConstantInstruction);

        PutFieldInstruction putFieldInstruction = new PutFieldInstruction();
        putFieldInstruction.setValue(varValue);
        putFieldInstruction.setField(fh.getReference());
        putFieldInstruction.setFieldType(fh.getType());

        first.insertPrevious(putFieldInstruction);
    }

}
