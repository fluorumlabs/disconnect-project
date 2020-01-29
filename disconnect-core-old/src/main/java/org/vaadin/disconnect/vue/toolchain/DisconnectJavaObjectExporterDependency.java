package org.vaadin.disconnect.vue.toolchain;

import org.teavm.dependency.AbstractDependencyListener;
import org.teavm.dependency.DependencyAgent;
import org.teavm.dependency.DependencyNode;
import org.teavm.dependency.MethodDependency;
import org.vaadin.disconnect.core.client.internals.DisconnectUtils;

/**
 * Created by Artem Godin on 9/30/2019.
 */
public class DisconnectJavaObjectExporterDependency extends AbstractDependencyListener {
    DependencyNode node;

    @Override
    public void started(DependencyAgent agent) {
        node = agent.createNode();
    }

    @Override
    public void methodReached(DependencyAgent agent, MethodDependency method) {
        if (method.getMethod().getOwnerName().equals(DisconnectUtils.class.getName())) {
            switch (method.getMethod().getName()) {
                case "asJsObject":
                    method.getVariable(1).connect(node);
                    break;
                case "asJavaObject":
                    node.connect(method.getResult());
                    break;
            }
        }
    }
}
