package org.vaadin.disconnect.toolchain;

import com.google.auto.service.AutoService;
import org.teavm.jso.impl.JSOPlugin;
import org.teavm.vm.spi.After;
import org.teavm.vm.spi.TeaVMHost;
import org.teavm.vm.spi.TeaVMPlugin;

/**
 * Created by Artem Godin on 8/19/2019.
 */
@AutoService(TeaVMPlugin.class)
@After(JSOPlugin.class)
public class DisconnectTeaVMPlugin implements TeaVMPlugin {
    @Override
    public void install(TeaVMHost host) {
        host.add(new DisconnectClassTransformer(host));
        host.add(new DisconnectReactClassTransformer(host));
    }
}
