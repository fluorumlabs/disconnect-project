package org.vaadin.disconnect.toolchain;

import org.vaadin.disconnect.core.client.Convert;
import org.vaadin.disconnect.core.client.Component;
import org.vaadin.disconnect.core.client.HasStyleModule;
import org.vaadin.disconnect.core.client.internals.AccessorBase;
import org.apache.commons.lang3.StringUtils;
import org.teavm.common.OptionalPredicate;
import org.teavm.jso.JSObject;
import org.teavm.model.*;
import org.teavm.model.instructions.*;
import org.teavm.vm.spi.TeaVMHost;

import java.io.Serializable;

/**
 * Created by Artem Godin on 8/19/2019.
 */
public class DisconnectReactClassTransformer implements ClassHolderTransformer {
    private final TeaVMHost host;

    public DisconnectReactClassTransformer(TeaVMHost host) {
        this.host = host;
    }

    @Override
    public void transformClass(ClassHolder cls, ClassHolderTransformerContext context) {
        OptionalPredicate<String> isReactComponent = context.getHierarchy().getSuperclassPredicate(Component.class.getName());
        OptionalPredicate<String> isRWMapper = context.getHierarchy().getSuperclassPredicate(AccessorBase.class.getName());

        if (cls.getInterfaces().contains(HasStyleModule.class.getName())) {
            overrideGetClassName(cls);
        }

        // Add Model interface
        if (isReactComponent.test(cls.getName(), false)
                && !Component.class.getName().equals(cls.getName())
        ) {
            ClassReader classReader = context.getHierarchy().getClassSource().get(cls.getName());
            GenericValueType.Object genericParent = classReader.getGenericParent();

            if (genericParent.getArguments().length == 2) {
                String propertiesClassName = ((GenericValueType.Object)genericParent.getArguments()[0].getValue()).getClassName();
                String stateClassName = ((GenericValueType.Object)genericParent.getArguments()[1].getValue()).getClassName();

                addAccessor(cls, propertiesClassName, "propertiesAccessor");
                addAccessor(cls, stateClassName, "stateAccessor");
            }
        }

        if (isRWMapper.test(cls.getName(), false)
                && !AccessorBase.class.getName().equals(cls.getName())
                && cls.getModifiers().contains(ElementModifier.INTERFACE)) {
            // Mutate to class
            cls.getModifiers().remove(ElementModifier.INTERFACE);
            cls.getModifiers().add(ElementModifier.ABSTRACT);
            cls.setParent(Component.Accessor.class.getName());
            // Augment getters and setters
            cls.getMethods().stream()
                    .filter(methodHolder -> methodHolder.getModifiers().contains(ElementModifier.ABSTRACT))
                    .forEach(methodHolder -> {
                        if (methodHolder.getName().startsWith("is") && methodHolder.parameterCount() == 0) {
                            addGetterImplementation(StringUtils.uncapitalize(StringUtils.removeStart(methodHolder.getName(), "is")), methodHolder);
                        } else if (methodHolder.getName().startsWith("get") && methodHolder.parameterCount() == 0) {
                            addGetterImplementation(StringUtils.uncapitalize(StringUtils.removeStart(methodHolder.getName(), "get")), methodHolder);
                        } else if (methodHolder.getName().startsWith("set") && methodHolder.parameterCount() == 1) {
                            addSetterImplementation(StringUtils.uncapitalize(StringUtils.removeStart(methodHolder.getName(), "set")), methodHolder);
                        }
                        methodHolder.getModifiers().remove(ElementModifier.ABSTRACT);
                    });
        }
    }

    private void overrideGetClassName(ClassHolder cls) {
        MethodHolder newMethod = new MethodHolder("getClassName", new ValueType.Object(String.class.getName()), new ValueType.Object(String.class.getName()));
        newMethod.setLevel(AccessLevel.PROTECTED);

        Program program = new Program();
        Variable that = program.createVariable(); //this

        Variable className = program.createVariable();
        Variable result = program.createVariable();

        BasicBlock block = program.createBasicBlock();

        InvokeInstruction invokeInstruction = new InvokeInstruction();
        invokeInstruction.setType(InvocationType.SPECIAL);
        invokeInstruction.setMethod(new MethodReference(cls.getName()+"$Style", "get", new ValueType.Object(String.class.getName()), new ValueType.Object(String.class.getName())));
        invokeInstruction.setArguments(className);
        invokeInstruction.setReceiver(result);

        ExitInstruction exitInstruction = new ExitInstruction();
        exitInstruction.setValueToReturn(result);

        block.add(invokeInstruction);
        block.add(exitInstruction);

        newMethod.setProgram(program);

        cls.addMethod(newMethod);
    }

    private void addGetterImplementation(String property, MethodHolder methodHolder) {
        Program program = methodHolder.getProgram();

        Variable varThis = program.variableAt(0);

        Variable varProperty = program.createVariable();
        Variable varNative = program.createVariable();
        Variable varResult = program.createVariable();

        BasicBlock block = program.createBasicBlock();
        block.add(createStringConstantInstruction(varProperty, property));

        InvokeInstruction getNative = new InvokeInstruction();
        getNative.setType(InvocationType.SPECIAL);
        getNative.setReceiver(varNative);
        getNative.setArguments(varProperty);
        getNative.setInstance(varThis);
        getNative.setMethod(new MethodReference(Component.Accessor.class, "get", String.class, JSObject.class));
        block.add(getNative);

        ValueType resultType = methodHolder.getResultType();
        if (resultType instanceof ValueType.Primitive) {
            ValueType.Primitive primitiveType = (ValueType.Primitive) resultType;
            InvokeInstruction toPrimitive = new InvokeInstruction();
            toPrimitive.setType(InvocationType.SPECIAL);
            toPrimitive.setReceiver(varResult);
            toPrimitive.setArguments(varNative);

            switch (primitiveType.getKind()) {
                case BOOLEAN:
                    toPrimitive.setMethod(new MethodReference(Convert.class, "toBoolean", JSObject.class, boolean.class));
                    break;
                case BYTE:
                    toPrimitive.setMethod(new MethodReference(Convert.class, "toByte", JSObject.class, byte.class));
                    break;
                case CHARACTER:
                    toPrimitive.setMethod(new MethodReference(Convert.class, "toChar", JSObject.class, char.class));
                    break;
                case SHORT:
                    toPrimitive.setMethod(new MethodReference(Convert.class, "toShort", JSObject.class, short.class));
                    break;
                case INTEGER:
                    toPrimitive.setMethod(new MethodReference(Convert.class, "toInt", JSObject.class, int.class));
                    break;
                case LONG:
                    toPrimitive.setMethod(new MethodReference(Convert.class, "toLong", JSObject.class, long.class));
                    break;
                case FLOAT:
                    toPrimitive.setMethod(new MethodReference(Convert.class, "toFloat", JSObject.class, float.class));
                    break;
                case DOUBLE:
                    toPrimitive.setMethod(new MethodReference(Convert.class, "toDouble", JSObject.class, double.class));
                    break;
            }

            block.add(toPrimitive);
        } else if (resultType.isObject(String.class)) {
            InvokeInstruction toString = new InvokeInstruction();
            toString.setType(InvocationType.SPECIAL);
            toString.setReceiver(varResult);
            toString.setArguments(varNative);
            toString.setMethod(new MethodReference(Convert.class, "toString", JSObject.class, String.class));
            block.add(toString);
        } else if (resultType.isSubtypeOf(new ValueType.Object(Serializable.class.getName()))) {
            Variable varClass = program.createVariable();

            block.add(createClassConstantInstruction(varClass, resultType));

            InvokeInstruction toSerializable = new InvokeInstruction();
            toSerializable.setType(InvocationType.SPECIAL);
            toSerializable.setReceiver(varResult);
            toSerializable.setArguments(varNative, varClass);
            toSerializable.setMethod(new MethodReference(Convert.class, "toSerializable", JSObject.class, Class.class, Serializable.class));
            block.add(toSerializable);

            Variable varCastResult = program.createVariable();

            CastInstruction castInstruction = new CastInstruction();
            castInstruction.setReceiver(varCastResult);
            castInstruction.setValue(varResult);
            castInstruction.setTargetType(resultType);
            block.add(castInstruction);
        }

        ExitInstruction exitInstruction = new ExitInstruction();
        exitInstruction.setValueToReturn(varResult);
        block.add(exitInstruction);
    }

    private void addSetterImplementation(String property, MethodHolder methodHolder) {
        Program program = methodHolder.getProgram();
        Variable varThis = program.variableAt(0);
        Variable varValue = program.variableAt(1);

        Variable varProperty = program.createVariable();
        Variable varResult = program.createVariable();

        BasicBlock block = program.createBasicBlock();
        block.add(createStringConstantInstruction(varProperty, property));

        ValueType valueType = methodHolder.getParameterTypes()[0];
        if (valueType instanceof ValueType.Primitive) {
            ValueType.Primitive primitiveType = (ValueType.Primitive) valueType;
            InvokeInstruction toPrimitive = new InvokeInstruction();
            toPrimitive.setType(InvocationType.SPECIAL);
            toPrimitive.setReceiver(varResult);
            toPrimitive.setArguments(varValue);

            switch (primitiveType.getKind()) {
                case BOOLEAN:
                    toPrimitive.setMethod(new MethodReference(Convert.class, "toJSObject", boolean.class, JSObject.class));
                    break;
                case BYTE:
                    toPrimitive.setMethod(new MethodReference(Convert.class, "toJSObject", byte.class, JSObject.class));
                    break;
                case CHARACTER:
                    toPrimitive.setMethod(new MethodReference(Convert.class, "toJSObject", char.class, JSObject.class));
                    break;
                case SHORT:
                    toPrimitive.setMethod(new MethodReference(Convert.class, "toJSObject", short.class, JSObject.class));
                    break;
                case INTEGER:
                    toPrimitive.setMethod(new MethodReference(Convert.class, "toJSObject", int.class, JSObject.class));
                    break;
                case LONG:
                    toPrimitive.setMethod(new MethodReference(Convert.class, "toJSObject", long.class, JSObject.class));
                    break;
                case FLOAT:
                    toPrimitive.setMethod(new MethodReference(Convert.class, "toJSObject", float.class, JSObject.class));
                    break;
                case DOUBLE:
                    toPrimitive.setMethod(new MethodReference(Convert.class, "toJSObject", double.class, JSObject.class));
                    break;
            }

            block.add(toPrimitive);
        } else if (valueType.isObject(String.class)) {
            InvokeInstruction toString = new InvokeInstruction();
            toString.setType(InvocationType.SPECIAL);
            toString.setReceiver(varResult);
            toString.setArguments(varValue);
            toString.setMethod(new MethodReference(Convert.class, "toJSObject", String.class, JSObject.class));
            block.add(toString);
        } else if (valueType.isSubtypeOf(new ValueType.Object(Serializable.class.getName()))) {
            Variable varSerializable = program.createVariable();

            CastInstruction castInstruction = new CastInstruction();
            castInstruction.setReceiver(varSerializable);
            castInstruction.setValue(varValue);
            castInstruction.setTargetType(new ValueType.Object(Serializable.class.getName()));
            block.add(castInstruction);

            InvokeInstruction toSerializable = new InvokeInstruction();
            toSerializable.setType(InvocationType.SPECIAL);
            toSerializable.setReceiver(varResult);
            toSerializable.setArguments(varSerializable);
            toSerializable.setMethod(new MethodReference(Convert.class, "toJSObject", Serializable.class, JSObject.class));
            block.add(toSerializable);
        }

        InvokeInstruction setNative = new InvokeInstruction();
        setNative.setType(InvocationType.SPECIAL);
        setNative.setInstance(varThis);
        setNative.setArguments(varProperty, varResult);
        setNative.setMethod(new MethodReference(Component.Accessor.class, "set", String.class, JSObject.class, void.class));
        block.add(setNative);

        ExitInstruction exitInstruction = new ExitInstruction();
        block.add(exitInstruction);
    }

    private void addAccessor(ClassHolder cls, String targetClass, String methodName) {
        MethodHolder newMethod = new MethodHolder(methodName, new ValueType.Object(JSObject.class.getName()), new ValueType.Object(JSObject.class.getName()), new ValueType.Object(AccessorBase.class.getName()));
        newMethod.setLevel(AccessLevel.PROTECTED);

        Program program = new Program();
        Variable that = program.createVariable(); //this

        Variable reader = program.createVariable(); // reader
        Variable writer = program.createVariable(); // writer

        Variable targetInstance = program.createVariable();

        BasicBlock block = program.createBasicBlock();

        ConstructInstruction constructInstruction = new ConstructInstruction();
        constructInstruction.setType(targetClass);
        constructInstruction.setReceiver(targetInstance);

        InvokeInstruction invokeInstruction = new InvokeInstruction();
        invokeInstruction.setType(InvocationType.SPECIAL);
        invokeInstruction.setMethod(new MethodReference(Component.Accessor.class.getName(), "<init>", new ValueType.Object(JSObject.class.getName()), new ValueType.Object(JSObject.class.getName()), ValueType.VOID));
        invokeInstruction.setInstance(targetInstance);
        invokeInstruction.setArguments(reader, writer);

        ExitInstruction exitInstruction = new ExitInstruction();
        exitInstruction.setValueToReturn(targetInstance);

        block.add(constructInstruction);
        block.add(invokeInstruction);
        block.add(exitInstruction);

        newMethod.setProgram(program);

        cls.addMethod(newMethod);
    }

    private Instruction createStringConstantInstruction(Variable receiver, String value) {
        StringConstantInstruction instruction = new StringConstantInstruction();
        instruction.setConstant(value);
        instruction.setReceiver(receiver);
        return instruction;
    }

    private Instruction createClassConstantInstruction(Variable receiver, ValueType value) {
        ClassConstantInstruction instruction = new ClassConstantInstruction();
        instruction.setConstant(value);
        instruction.setReceiver(receiver);
        return instruction;
    }

}
