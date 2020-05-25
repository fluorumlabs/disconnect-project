package com.github.fluorumlabs.disconnect.zero.toolchain;

import com.google.auto.service.AutoService;
import org.teavm.platform.plugin.PlatformPlugin;
import org.teavm.vm.spi.Before;
import org.teavm.vm.spi.TeaVMHost;
import org.teavm.vm.spi.TeaVMPlugin;


@AutoService(TeaVMPlugin.class)
@Before(PlatformPlugin.class)
public class DisconnectZeroTeaVMPlugin implements TeaVMPlugin {
    @Override
    public void install(TeaVMHost host) {
        host.add(new DisconnectZeroClassTransformer(host));
    }
}
