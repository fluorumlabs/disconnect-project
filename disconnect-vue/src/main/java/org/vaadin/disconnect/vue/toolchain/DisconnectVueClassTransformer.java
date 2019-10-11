package org.vaadin.disconnect.vue.toolchain;

import org.apache.commons.lang3.StringUtils;
import org.teavm.jso.JSObject;
import org.teavm.model.*;
import org.teavm.model.emit.ProgramEmitter;
import org.teavm.model.emit.ValueEmitter;
import org.teavm.model.instructions.*;
import org.vaadin.disconnect.core.annotations.ImportObject;
import org.vaadin.disconnect.vue.annotations.*;
import org.vaadin.disconnect.vue.client.internals.ComponentDefinition;
import org.vaadin.disconnect.vue.client.internals.ComponentDefinitionAccessor;
import org.vaadin.disconnect.vue.client.router.RouteRecord;
import org.vaadin.disconnect.vue.client.router.RouteConfiguration;
import org.vaadin.disconnect.vue.client.router.VueRouter;
import org.vaadin.disconnect.vue.client.ui.Component;

import java.util.*;
import java.util.stream.Stream;

/**
 * Created by Artem Godin on 8/19/2019.
 */
public class DisconnectVueClassTransformer implements ClassHolderTransformer {
    private final ClassLoader classLoader;

    public DisconnectVueClassTransformer(ClassLoader classLoader) {
        this.classLoader = classLoader;
    }

    @Override
    public void transformClass(ClassHolder cls, ClassHolderTransformerContext context) {
        if (cls.getAnnotations().get(ImportComponent.class.getName()) != null) {
            transformImportComponent(cls, context);
        }

        if (cls.getAnnotations().get(VueComponent.class.getName()) != null) {
            transformVueComponentClass(cls, context);
        }

        if (cls.getName().equals(VueRouter.class.getName())) {
            transformVueRouter(cls.getMethod(new MethodDescriptor("getRouteConfiguration", new ValueType.Array(new ValueType.Object(RouteRecord.class.getName())))), context);
        }

        transformStateReferences(cls, context);
    }

    private void transformVueRouter(MethodHolder getRouteConfiguration, ClassHolderTransformerContext context) {
        ProgramEmitter $ = ProgramEmitter.create(getRouteConfiguration, context.getHierarchy());

        List<RouteConfiguration> routes = new ArrayList<>();
        Map<Class<?>, List<RouteConfiguration>> subRoutes = new HashMap<>();

        ServiceLoader.load(RouteConfiguration.class, classLoader).forEach(routes::add);

        routes.forEach(rc -> {
            if (rc.layout() != null) {
                subRoutes.computeIfAbsent(rc.layout(), (layout) -> new ArrayList<>()).add(rc);
            }
        });

        routes.removeIf(rc -> rc.layout() != null);
        routes.sort(Comparator.comparingInt((rc) -> -rc.path().length() + (rc.path().contains("*")?1000:0)));
        subRoutes.values().forEach(sr -> sr.sort(Comparator.comparingInt((rc) -> rc.path().length() + (rc.path().contains("*")?1000:0))));

        ValueEmitter jsRoutes = $.constructArray(RouteRecord.class, routes.size());
        for (int i = 0; i < routes.size(); i++) {
            jsRoutes.setElement(i, createRouteJsConfig($, routes.get(i), subRoutes.get(routes.get(i).view()), subRoutes));
        }

        jsRoutes.returnValue();
    }

    private ValueEmitter createRouteJsConfig(ProgramEmitter $, RouteConfiguration route, List<RouteConfiguration> subRoutes, Map<Class<?>, List<RouteConfiguration>> subRoutesMap) {
        ValueEmitter path = $.constant(route.path());
        ValueEmitter clazz = $.constant(route.view());
        ValueEmitter aliases = $.constructArray(String.class, route.aliases() != null ? route.aliases().length : 0);
        for (int i = 0; i < route.aliases().length; i++) {
            aliases.setElement(i, $.constant(route.aliases()[i]));
        }
        ValueEmitter children = $.constructArray(RouteRecord.class, subRoutes != null?subRoutes.size():0);
        if (subRoutes != null) {
            for (int i = 0; i < subRoutes.size(); i++) {
                children.setElement(i, createRouteJsConfig($, subRoutes.get(i), subRoutesMap.get(subRoutes.get(i).view()), subRoutesMap));
            }
        }

        return $.invoke(RouteRecord.class, "create", RouteRecord.class,
                path,
                $.invoke(ComponentDefinitionAccessor.class, "getComponentDefinition", ComponentDefinition.class, clazz),
                aliases,
                children);
    }

    private void transformStateReferences(ClassHolder cls, ClassHolderTransformerContext context) {
        Map<String, String> states = new HashMap<>();

        for (FieldHolder field : cls.getFields()) {
            if (field.getAnnotations().get(State.class.getName()) != null && field.getType() instanceof ValueType.Object) {
                states.put(field.getName(), ((ValueType.Object)field.getType()).getClassName() + "$$Store");
            }
        }

        for (MethodHolder method : cls.getMethods()) {
            Program program = method.getProgram();
            if (program != null) {
                for (BasicBlock basicBlock : program.getBasicBlocks()) {
                    transformStateReferences(basicBlock, states, cls, context);
                }
            }
        }
    }

    private void transformStateReferences(BasicBlock basicBlock, Map<String,String> states, ClassHolder cls, ClassHolderTransformerContext context) {
        Instruction instruction = basicBlock.getFirstInstruction();

        while (instruction != null) {
            if ( instruction instanceof GetFieldInstruction) {
                GetFieldInstruction getInstruction = (GetFieldInstruction) instruction;
                if (states.containsKey(getInstruction.getField().getFieldName())) {
                    InvokeInstruction invokeInstruction = new InvokeInstruction();
                    invokeInstruction.setMethod(new MethodReference(states.get(getInstruction.getField().getFieldName()), "getInstance", getInstruction.getFieldType()));
                    invokeInstruction.setType(InvocationType.SPECIAL);
                    invokeInstruction.setReceiver(getInstruction.getReceiver());
                    getInstruction.replace(invokeInstruction);
                    instruction = invokeInstruction;
                }
            } else if ( instruction instanceof InvokeInstruction && !cls.getName().endsWith("$$Store")) {
                InvokeInstruction invokeInstruction = (InvokeInstruction)instruction;
                if ( states.values().contains(invokeInstruction.getMethod().getClassName()+"$$Store") ) {
                    MethodReader method = context.getHierarchy().resolve(invokeInstruction.getMethod());
                    invokeInstruction.setType(InvocationType.SPECIAL);
                    invokeInstruction.setInstance(null);

                    ValueType[] signature = Stream.concat(Arrays.stream(method.getParameterTypes()),
                            Stream.of(method.getResultType())).toArray(ValueType[]::new);

                    invokeInstruction.setMethod(new MethodReference(
                            method.getOwnerName()+"$$Store", method.getName(), signature
                    ));
                }
            }
            instruction = instruction.getNext();
        }
    }

    private void transformImportComponent(ClassHolder cls, ClassHolderTransformerContext context) {
        createImportedDefinitionField(cls, context);
    }

    private void transformVueComponentClass(ClassHolder cls, ClassHolderTransformerContext context) {
        createDefinitionField(cls, context);
        createAccessors("Prop", Property.class.getName(), cls, context);
        createAccessors("RouteParam", PathParameter.class.getName(), cls, context);
        createAccessors("QueryParam", QueryParameter.class.getName(), cls, context);
    }

    private void createAccessors(String type, String annotationClass, ClassHolder cls, ClassHolderTransformerContext context) {
        cls.getMethods().stream()
                .filter(m -> m.getModifiers().contains(ElementModifier.NATIVE))
                .filter(m -> m.getAnnotations().get(annotationClass) != null)
                .filter(m -> m.getParameterTypes().length == 0 && (m.getName().startsWith("get") || m.getName().startsWith("is")))
                .forEach(m -> {
                    String name = m.getName();
                    if (name.startsWith("get")) {
                        name = StringUtils.uncapitalize(StringUtils.removeStart(name, "get"));
                    } else if (name.startsWith("is")) {
                        name = StringUtils.uncapitalize(StringUtils.removeStart(name, "is"));
                    }

                    name = Optional.ofNullable(m.getAnnotations().get(annotationClass).getValues().getOrDefault("value", null))
                            .map(AnnotationValue::getString).orElse(name);

                    ValueType resultValueType = m.getResultType();
                    String resultType;
                    if ( resultValueType instanceof ValueType.Primitive) {
                        switch (((ValueType.Primitive) resultValueType).getKind()) {
                            case BYTE:
                                resultType = "byte"; break;
                            case LONG:
                                resultType = "long"; break;
                            case FLOAT:
                                resultType = "float"; break;
                            case SHORT:
                                resultType = "short"; break;
                            case DOUBLE:
                                resultType = "double"; break;
                            case BOOLEAN:
                                resultType = "boolean"; break;
                            case INTEGER:
                                resultType = "int"; break;
                            case CHARACTER:
                            default:
                                resultType = "char"; break;
                        }
                    } else if ( context.getHierarchy().isSuperType(new ValueType.Object(JSObject.class.getName()), resultValueType, false)) {
                        resultType = "JSObject";
                        resultValueType = new ValueType.Object(JSObject.class.getName());
                    } else if ( context.getHierarchy().isSuperType(new ValueType.Object(String.class.getName()), resultValueType, false)) {
                        resultType = "String";
                    } else{
                        resultType = "Object";
                        resultValueType = new ValueType.Object(Object.class.getName());
                    }

                    createAccessorImplementation(type, name, resultType, resultValueType, m, cls, context);
                });
    }

    private void createAccessorImplementation(String type, String name, String resultType, ValueType actualResultType, MethodHolder m, ClassHolder cls, ClassHolderTransformerContext context) {
        m.getModifiers().remove(ElementModifier.NATIVE);
        ProgramEmitter $ = ProgramEmitter.create(m, context.getHierarchy());

        ValueEmitter that = $.var(0, Component.class);

        ValueEmitter result = $.invoke(Component.Internals.class.getName(), resultType + type, actualResultType, that, $.constant(name));

        result.cast(m.getResultType()).returnValue();
    }

    private void createImportedDefinitionField(ClassHolder cls, ClassHolderTransformerContext context) {
        FieldHolder definitionField = new FieldHolder("__DEFINITION__");
        definitionField.setType(new ValueType.Object(ComponentDefinition.class.getName()));
        definitionField.getModifiers().add(ElementModifier.STATIC);
        definitionField.setLevel(AccessLevel.PUBLIC);
        AnnotationHolder importComponent = cls.getAnnotations().get(ImportComponent.class.getName());
        AnnotationHolder importObject = new AnnotationHolder(ImportObject.class.getName());
        importObject.getValues().putAll(importComponent.getValues());
        definitionField.getAnnotations().add(importObject);

        cls.addField(definitionField);
    }

    private void createDefinitionField(ClassHolder cls, ClassHolderTransformerContext context) {
        FieldHolder definitionField = new FieldHolder("__DEFINITION__");
        definitionField.setType(new ValueType.Object(ComponentDefinition.class.getName()));
        definitionField.getModifiers().add(ElementModifier.STATIC);
        definitionField.setLevel(AccessLevel.PUBLIC);
        cls.addField(definitionField);

        MethodHolder clinit = cls.getMethod(new MethodDescriptor("<clinit>", ValueType.VOID));
        if (clinit == null) {
            clinit = new MethodHolder("<clinit>", ValueType.VOID);
            clinit.getModifiers().add(ElementModifier.STATIC);

            ProgramEmitter $ = ProgramEmitter.create(clinit, context.getHierarchy());
            $.exit();

            cls.addMethod(clinit);
        }

        Program clinitProgram = clinit.getProgram();
        BasicBlock basicBlock = clinitProgram.basicBlockAt(clinitProgram.basicBlockCount() - 1);
        basicBlock.getLastInstruction().delete();

        ProgramEmitter $ = ProgramEmitter.create(clinitProgram, context.getHierarchy());

        $.enter(basicBlock);
        $.setField(
                definitionField.getReference(),
                $.invoke(cls.getName() + "$$Generated", "getComponentDefinition", new ValueType.Object(ComponentDefinition.class.getName())
                )
        );
        $.exit();
    }
}
