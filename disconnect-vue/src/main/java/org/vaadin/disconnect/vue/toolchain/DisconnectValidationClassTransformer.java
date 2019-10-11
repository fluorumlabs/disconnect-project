package org.vaadin.disconnect.vue.toolchain;

import org.teavm.model.*;
import org.teavm.model.emit.ProgramEmitter;
import org.teavm.model.instructions.*;
import org.vaadin.disconnect.vue.client.validation.Validation;

import javax.validation.ConstraintValidator;
import java.util.*;
import java.util.function.Consumer;

/**
 * Created by Artem Godin on 8/19/2019.
 */
public class DisconnectValidationClassTransformer implements ClassHolderTransformer {
    private final ClassLoader classLoader;

    private final static Map<String, Boolean> validatedFields = new HashMap<>();

    public DisconnectValidationClassTransformer(ClassLoader classLoader) {
        this.classLoader = classLoader;
    }

    @Override
    public void transformClass(ClassHolder cls, ClassHolderTransformerContext context) {
        if (!cls.getName().contains(Validation.class.getName())) {
            addValidationCalls(cls, context);
        }

        if (context.getHierarchy().isSuperType(ConstraintValidator.class.getName(), cls.getName(), false)) {
            fixHibernateValidator(cls, context);
        }
    }

    private void fixHibernateValidator(ClassHolder cls, ClassHolderTransformerContext context) {
        MethodHolder validateParameters = cls.getMethod(new MethodDescriptor("validateParameters", void.class));
        if ( validateParameters != null) {
            ProgramEmitter $ = ProgramEmitter.create(validateParameters, context.getHierarchy());
            $.exit();
        }

        if (cls.getField("LOG") != null ) {
            cls.removeField(cls.getField("LOG"));
        }

        if (cls.getMethod(new MethodDescriptor("<clinit>", void.class)) != null ){
            cls.removeMethod(cls.getMethod(new MethodDescriptor("<clinit>", void.class)));
        }
    }

    private void addValidationCalls(ClassHolder cls, ClassHolderTransformerContext context) {
        for (MethodHolder method : cls.getMethods()) {
            Program program = method.getProgram();
            if (program != null) {
                for (BasicBlock basicBlock : program.getBasicBlocks()) {
                    addValidationCalls(basicBlock, cls, context);
                }
            }
        }

    }

    private void addValidationCalls(BasicBlock basicBlock, ClassHolder cls, ClassHolderTransformerContext context) {
        Instruction instruction = basicBlock.getFirstInstruction();

        while (instruction != null) {
            if (instruction instanceof GetFieldInstruction) {
                GetFieldInstruction getFieldInstruction = (GetFieldInstruction) instruction;
                FieldHolder fieldHolder = (FieldHolder)(context.getHierarchy().getClassSource().resolve(getFieldInstruction.getField()));
                if (fieldHolder != null && isValidated(fieldHolder, context)) {
                    Variable clazz = basicBlock.getProgram().createVariable();
                    Variable fieldName = basicBlock.getProgram().createVariable();

                    StringConstantInstruction sci = new StringConstantInstruction();
                    sci.setReceiver(fieldName);
                    sci.setConstant(fieldHolder.getName());

                    ClassConstantInstruction cci = new ClassConstantInstruction();
                    cci.setReceiver(clazz);
                    cci.setConstant(new ValueType.Object(fieldHolder.getOwnerName()));

                    InvokeInstruction invokeInstruction = new InvokeInstruction();
                    invokeInstruction.setMethod(new MethodReference(Validation.class, "validate", Class.class, Object.class, String.class, void.class));
                    invokeInstruction.setType(InvocationType.SPECIAL);
                    invokeInstruction.setArguments(clazz, getFieldInstruction.getInstance(), fieldName);
                    getFieldInstruction.insertNext(invokeInstruction);
                    getFieldInstruction.insertPrevious(sci);
                    getFieldInstruction.insertPrevious(cci);
                }
            }
            instruction = instruction.getNext();
        }
    }

    private boolean isValidated(FieldHolder fh, ClassHolderTransformerContext context) {
        return validatedFields.computeIfAbsent(fh.getOwnerName()+":"+fh.getName(), k -> {
            List<AnnotationReader> annotations = new ArrayList<>();
            for (AnnotationHolder annotationHolder : fh.getAnnotations().all()) {
                collectAnnotations(annotationHolder, annotations::add, context);
            }
            return annotations.stream().anyMatch(annotationReader -> annotationReader.getType().equals("javax.validation.Constraint"));
        });
    }


    private void collectAnnotations(AnnotationReader holder, Consumer<AnnotationReader> consumer, ClassHolderTransformerContext context) {
        if (holder.getType().startsWith("java.lang.annotation")) {
            return;
        }

        consumer.accept(holder);
        AnnotationValue value = holder.getValue("value");
        if (value != null && value.getType() == AnnotationValue.LIST) {
            List<AnnotationValue> list = value.getList();
            for (AnnotationValue annotationValue : list) {
                if (annotationValue.getType() == AnnotationValue.ANNOTATION) {
                    collectAnnotations(annotationValue.getAnnotation(), consumer, context);
                }
            }
        }

        ClassReader classReader = context.getHierarchy().getClassSource().get(holder.getType());

        if (classReader != null) {
            for (AnnotationReader annotationReader : classReader.getAnnotations().all()) {
                collectAnnotations(annotationReader, consumer, context);
            }
        }
    }

}
