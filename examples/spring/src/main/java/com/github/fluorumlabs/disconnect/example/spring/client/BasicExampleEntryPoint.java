package com.github.fluorumlabs.disconnect.example.spring.client;

import com.github.fluorumlabs.disconnect.core.ObjectMirror;
import com.github.fluorumlabs.disconnect.core.annotations.EntryPoint;
import com.github.fluorumlabs.disconnect.core.internals.DisconnectUtils;
import com.github.fluorumlabs.disconnect.example.spring.TestService;
import js.lang.Any;
import js.util.JS;
import js.util.JSON;
import org.teavm.jso.JSBody;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static js.web.dom.Window.CONSOLE;


@EntryPoint
public class BasicExampleEntryPoint implements Runnable {

	@Resource
	private TestService testService;

    public static class DummyBean implements Serializable {
        public List<String> list;
        public String value1;
        public String value2;
        public Boolean value3 = false;
        public boolean value4 = true;
        public int x = 5;
        public Byte y = null;
        public String s = null;
        private DummyBean nested;

        public DummyBean getNested() {
            return nested;
        }

        public void setNested(DummyBean nested) {
            this.nested = nested;
        }
    }


    @JSBody(params = "x", script = "window.z = x")
    public static native void setReference(Any x);

    @Override
    public void run() {
        CONSOLE.log(testService.hello());
        CONSOLE.log(testService.helloInt(42, 12));
        CONSOLE.log(testService.getNumber());
        CONSOLE.log(testService.getDouble());

        DummyBean dummyBean = new DummyBean();
        dummyBean.value1 = "test";

        CONSOLE.log(dummyBean.value1);
        CONSOLE.log(DisconnectUtils.asJsObject(dummyBean));

        ObjectMirror<DummyBean> mirror = ObjectMirror.from(dummyBean);

        setReference(mirror);
        CONSOLE.log(mirror);
        CONSOLE.log(dummyBean.value1);

        JS.eval("z.value2 = 'zxxzx'");
        CONSOLE.log(JSON.stringify(mirror));

        dummyBean.list = new ArrayList<>(Arrays.asList("test","test2"));
        CONSOLE.log(JSON.stringify(mirror));

        DummyBean dummyBean2 = ObjectMirror.from(DummyBean.class, mirror);
        CONSOLE.log(dummyBean.value2);

        JS.eval("z.nested = {value1: 'new test string'}");
        CONSOLE.log(JSON.stringify(mirror));
        dummyBean.nested.value2="untest";
        CONSOLE.log(JSON.stringify(mirror));

        JS.eval("z.list.push('aaa')");
        CONSOLE.log(JSON.stringify(mirror));

        CONSOLE.log(testService.helloBean(dummyBean));
    }

}
