package org.vaadin.disconnect.vue.toolchain;

import org.teavm.model.*;
import org.teavm.model.emit.ProgramEmitter;
import org.teavm.model.instructions.*;
import org.vaadin.disconnect.core.annotations.ImportObject;
import org.vaadin.disconnect.vue.annotations.ImportComponent;
import org.vaadin.disconnect.vue.annotations.Mutation;
import org.vaadin.disconnect.vue.annotations.State;
import org.vaadin.disconnect.vue.annotations.VueComponent;
import org.vaadin.disconnect.vue.client.internals.ComponentDefinition;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

/**
 * Created by Artem Godin on 8/19/2019.
 */
public class DisconnectVueClassTransformer implements ClassHolderTransformer {
    @Override
    public void transformClass(ClassHolder cls, ClassHolderTransformerContext context) {
        if (cls.getAnnotations().get(ImportComponent.class.getName()) != null) {
            transformImportComponent(cls, context);
        }

        if (cls.getAnnotations().get(VueComponent.class.getName()) != null) {
            transformVueComponentClass(cls, context);
        }
        transformStateReferences(cls, context);
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
