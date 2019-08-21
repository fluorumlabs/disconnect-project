package com.github.fluorumlabs.disconnect.vue.toolchain;

import com.github.fluorumlabs.disconnect.core.client.Convert;
import com.github.fluorumlabs.disconnect.vue.client.VueComponent;
import com.github.fluorumlabs.disconnect.vue.client.VueComponentModel;
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
public class DisconnectVueClassTransformer implements ClassHolderTransformer {
    private final TeaVMHost host;

    public DisconnectVueClassTransformer(TeaVMHost host) {
        this.host = host;
    }

    @Override
    public void transformClass(ClassHolder cls, ClassHolderTransformerContext context) {
        OptionalPredicate<String> isVueComponent = context.getHierarchy().getSuperclassPredicate(VueComponent.class.getName());
        OptionalPredicate<String> isVueComponentModel = context.getHierarchy().getSuperclassPredicate(VueComponentModel.class.getName());

        // Add Model interface
        if (isVueComponent.test(cls.getName(), false)
                && !VueComponent.class.getName().equals(cls.getName())
        ) {
            ClassReader classReader = context.getHierarchy().getClassSource().get(cls.getName());
            GenericValueType.Object genericParent = classReader.getGenericParent();

            if (genericParent.getArguments().length > 0) {
                String modelClass = ((GenericValueType.Object)genericParent.getArguments()[0].getValue()).getClassName();
                String proxyClassName = modelClass + "$Instance";

                addModelInitialization(cls, proxyClassName);
            }
        }

        if (isVueComponentModel.test(cls.getName(), false)
                && !VueComponentModel.class.getName().equals(cls.getName())
                && cls.getModifiers().contains(ElementModifier.INTERFACE)) {
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

        // Add method registration for @Callable
        if (isVueComponent.test(cls.getName(), false)) {
            String methodRegistrationClassName = cls.getName() + "$MethodRegistration";

            if (context.getHierarchy().getClassSource().get(methodRegistrationClassName) != null) {
                addMethodRegistration(cls, methodRegistrationClassName);
            }
        }
    }

    private void addGetterImplementation(String property, MethodHolder methodHolder) {
        Program program = methodHolder.getProgram();

        Variable varThis = program.variableAt(0);

        Variable varProperty = program.createVariable();
        Variable varNative = program.createVariable();
        Variable varResult = program.createVariable();

        BasicBlock block = program.createBasicBlock();
        block.add(createStringConstantInstruction(varProperty, property));


        Variable varInstance = program.createVariable();

        InvokeInstruction getInstance = new InvokeInstruction();
        getInstance.setType(InvocationType.VIRTUAL);
        getInstance.setInstance(varThis);
        getInstance.setReceiver(varInstance);
        getInstance.setMethod(new MethodReference(VueComponentModel.class, "getInstance", VueComponent.class));
        block.add(getInstance);

        InvokeInstruction getNative = new InvokeInstruction();
        getNative.setType(InvocationType.SPECIAL);
        getNative.setReceiver(varNative);
        getNative.setArguments(varProperty);
        getNative.setInstance(varInstance);
        getNative.setMethod(new MethodReference(VueComponent.class, "getNative", String.class, JSObject.class));
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

        Variable varInstance = program.createVariable();

        InvokeInstruction getInstance = new InvokeInstruction();
        getInstance.setType(InvocationType.VIRTUAL);
        getInstance.setInstance(varThis);
        getInstance.setReceiver(varInstance);
        getInstance.setMethod(new MethodReference(VueComponentModel.class, "getInstance", VueComponent.class));
        block.add(getInstance);

        InvokeInstruction setNative = new InvokeInstruction();
        setNative.setType(InvocationType.SPECIAL);
        setNative.setInstance(varInstance);
        setNative.setArguments(varProperty, varResult);
        setNative.setMethod(new MethodReference(VueComponent.class, "setNative", String.class, JSObject.class, void.class));
        block.add(setNative);

        ExitInstruction exitInstruction = new ExitInstruction();
        block.add(exitInstruction);
    }

    private void addMethodRegistration(ClassHolder cls, String methodRegistrationClassName) {
        cls.getMethods().stream()
                .filter(methodHolder -> methodHolder.getName().equals("<init>"))
                .forEach(methodHolder -> {
                    Program program = methodHolder.getProgram();
                    BasicBlock block = program.basicBlockAt(program.basicBlockCount() - 1);

                    InvokeInstruction invokeInstruction = new InvokeInstruction();
                    invokeInstruction.setType(InvocationType.SPECIAL);
                    invokeInstruction.setArguments(program.variableAt(0));
                    invokeInstruction.setMethod(new MethodReference(methodRegistrationClassName, "apply", new ValueType.Object(cls.getName()), ValueType.VOID));

                    block.getLastInstruction().insertPrevious(invokeInstruction);
                });
    }

    private void addModelInitialization(ClassHolder cls, String className) {
        MethodHolder newMethod = new MethodHolder("createModel", new ValueType.Object(VueComponentModel.class.getName()));
        newMethod.setLevel(AccessLevel.PROTECTED);

        Program program = new Program();
        Variable that = program.createVariable(); //this

        Variable modelInstance = program.createVariable();
        Variable result = program.createVariable();

        BasicBlock block = program.createBasicBlock();

        ConstructInstruction constructInstruction = new ConstructInstruction();
        constructInstruction.setType(className);
        constructInstruction.setReceiver(modelInstance);

        CastInstruction castInstruction = new CastInstruction();
        castInstruction.setTargetType(new ValueType.Object(VueComponentModel.class.getName()));
        castInstruction.setValue(modelInstance);
        castInstruction.setReceiver(result);

        InvokeInstruction setInstance = new InvokeInstruction();
        setInstance.setType(InvocationType.VIRTUAL);
        setInstance.setInstance(modelInstance);
        setInstance.setArguments(that);
        setInstance.setMethod(new MethodReference(VueComponentModel.class, "setInstance", VueComponent.class, void.class));

        ExitInstruction exitInstruction = new ExitInstruction();
        exitInstruction.setValueToReturn(result);

        block.add(constructInstruction);
        block.add(castInstruction);
        block.add(setInstance);
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
