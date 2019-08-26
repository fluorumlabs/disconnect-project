package com.github.fluorumlabs.disconnect.preact.toolchain;

import com.google.auto.service.AutoService;
import org.teavm.vm.spi.TeaVMHost;
import org.teavm.vm.spi.TeaVMPlugin;

/**
 * Created by Artem Godin on 8/19/2019.
 */
@AutoService(TeaVMPlugin.class)
public class DisconnectVueTeaVMPlugin implements TeaVMPlugin {
    @Override
    public void install(TeaVMHost host) {
        host.add(new DisconnectReactClassTransformer(host));
    }
}
