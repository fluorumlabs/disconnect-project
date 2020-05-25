package com.github.fluorumlabs.disconnect.core.internals;

import com.github.fluorumlabs.disconnect.core.components.CustomElementComponent;
import com.github.fluorumlabs.disconnect.core.toolchain.ComponentData;
import com.github.fluorumlabs.disconnect.core.utils.Styler;
import com.github.fluorumlabs.disconnect.core.utils.Templater;
import org.teavm.metaprogramming.*;

import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;

import static org.teavm.metaprogramming.Metaprogramming.*;

/**
 * Created by Artem Godin on 5/7/2020.
 */
@CompileTime
public final class TagRegistryManager {
    private TagRegistryManager() {
    }

    public static void registerTags() {
        processRegistrations(TagRegistryManager.class);
    }

    @Meta
    private static native void processRegistrations(Class<TagRegistryManager> dummyClass);

    private static void processRegistrations(ReflectClass<TagRegistryManager> dummyClass) {
        ComponentData.documentStyles().forEach(id -> {
            emit(() -> Styler.registerStyle(null, id, "DOCUMENT"));
        });

        ComponentData.globalStyles().forEach(id -> {
            emit(() -> Styler.registerStyle(null, id, "GLOBAL"));
        });

        ComponentData.componentStyles().forEach(pair -> {
            ReflectClass<?> componentClass = Metaprogramming.findClass(pair.getKey());
            Set<String> ids = pair.getValue();
            for (String id : ids) {
                emit(() -> Styler.registerStyle(componentClass.asJavaClass(), id, "COMPONENT"));
            }
        });

        ComponentData.templates().forEach(pair -> {
            ReflectClass<?> componentClass = Metaprogramming.findClass(pair.getKey());
            String id = pair.getValue();
            emit(() -> Templater.registerTemplate(componentClass.asJavaClass(), id));
        });

        for (ComponentData cd : ComponentData.stream().filter(ComponentData::isValid).collect(Collectors.toList())) {
            if (cd.isCustomElement()) {
                Value<ArrayList<String>> attributeArray = emit(() -> new ArrayList<String>());

                for (String observedAttribute : cd.getObservedAttributes()) {
                    Value<ArrayList<String>> attributeArrayFinal = attributeArray;
                    attributeArray = lazy(() -> {
                        ArrayList<String> intermediate = attributeArrayFinal.get();
                        intermediate.add(observedAttribute);
                        return intermediate;
                    });
                }

                Value<ArrayList<String>> attributeArrayFinal = attributeArray;
                Class<?> componentClass = cd.getComponentClass();
                String tagName = cd.getOwnTagName().get().toLowerCase();
                emit(() -> {
                    TagRegistry.register(tagName, componentClass);
                    CustomElementComponent.register(tagName, attributeArrayFinal.get(), componentClass);
                });
            } else if (cd.isImmediate() && cd.getOwnTagName().isPresent()) {
                Class<?> componentClass = cd.getComponentClass();
                String tagName = cd.getOwnTagName().get();
                emit(() -> TagRegistry.register(tagName, componentClass));

            } else if (cd.isInherited() && cd.getInheritedTagName().isPresent()) {
                Class<?> componentClass = cd.getComponentClass();
                String tagName = cd.getInheritedTagName().get();
                emit(() -> TagRegistry.registerInherited(tagName, componentClass));
            }
        }
        exit();

        ComponentData.clear();
    }

}
