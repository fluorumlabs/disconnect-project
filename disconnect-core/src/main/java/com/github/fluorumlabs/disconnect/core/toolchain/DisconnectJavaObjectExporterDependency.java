package com.github.fluorumlabs.disconnect.core.toolchain;

import com.github.fluorumlabs.disconnect.core.internals.DisconnectUtils;
import org.teavm.dependency.AbstractDependencyListener;
import org.teavm.dependency.DependencyAgent;
import org.teavm.dependency.DependencyNode;
import org.teavm.dependency.MethodDependency;


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
