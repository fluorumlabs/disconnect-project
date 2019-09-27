package org.vaadin.disconnect.vue.client.internals;

import org.teavm.metaprogramming.CompileTime;
import org.teavm.metaprogramming.Meta;
import org.teavm.metaprogramming.ReflectClass;
import org.teavm.metaprogramming.reflect.ReflectField;

import static org.teavm.metaprogramming.Metaprogramming.exit;

/**
 * Created by Artem Godin on 9/20/2019.
 */
@CompileTime
public class ComponentDefinitionAccessor {
    @Meta
    public static native ComponentDefinition getComponentDefinition(Class<?> cls);

    private static void getComponentDefinition(ReflectClass<Object> cls) {
        ReflectField field = cls.getField("__DEFINITION__");
        if (field != null) {
            exit(() -> field.get(null));
        } else {
            exit(() -> null);
        }
    }
}
