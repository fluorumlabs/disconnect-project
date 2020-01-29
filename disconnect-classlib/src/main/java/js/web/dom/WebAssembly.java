package js.web.dom;

import js.extras.JsEnum;
import js.lang.Any;
import js.lang.JsFunction;
import js.lang.Promise;
import js.lang.Unknown;
import js.util.Record;
import js.util.buffers.ArrayBuffer;
import js.util.collections.Array;
import js.web.fetch.Response;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * Created by Artem Godin on 1/23/2020.
 */
public interface WebAssembly {
    Promise<Module> compile(BufferSource bytes);

    Promise<Module> compileStreaming(Response source);

    Promise<Module> compileStreaming(Promise<Response> source);

    Promise<WebAssemblyInstantiatedSource> instantiate(BufferSource bytes, Record<Record<Unknown>> importObject);

    Promise<WebAssemblyInstantiatedSource> instantiate(BufferSource bytes);

    Promise<Instance> instantiate(Module moduleObject, Record<Record<Unknown>> importObject);

    Promise<Instance> instantiate(Module moduleObject);

    Promise<WebAssemblyInstantiatedSource> instantiateStreaming(Response response, Record<Record<Unknown>> importObject);

    Promise<WebAssemblyInstantiatedSource> instantiateStreaming(Promise<Response> response, Record<Record<Unknown>> importObject);

    Promise<WebAssemblyInstantiatedSource> instantiateStreaming(Response response);

    Promise<WebAssemblyInstantiatedSource> instantiateStreaming(Promise<Response> response);

    boolean validate(BufferSource bytes);

    interface CompileError extends Any {
        @JSBody(script = "return WebAssembly.CompileError.prototype")
        static WebAssembly.CompileError prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new WebAssembly.CompileError()")
        static WebAssembly.CompileError create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

    }

    interface Global extends Any {
        @JSBody(script = "return WebAssembly.Global.prototype")
        static WebAssembly.Global prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(params = "descriptor", script = "return new WebAssembly.Global(descriptor)")
        static WebAssembly.Global create(GlobalDescriptor descriptor) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(params = {"descriptor", "v"}, script = "return new WebAssembly.Global(descriptor, v)")
        static WebAssembly.Global create(GlobalDescriptor descriptor, Any v) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSProperty
        Unknown getValue();

        @JSProperty
        void setValue(Any value);

        Unknown valueOf();

    }

    interface Instance extends Any {
        @JSBody(script = "return WebAssembly.Instance.prototype")
        static WebAssembly.Instance prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(params = "module", script = "return new WebAssembly.Instance(module)")
        static WebAssembly.Instance create(Module module) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(params = {"module", "impoerObject"}, script = "return new WebAssembly.Instance(module, impoerObject)")
        static WebAssembly.Instance create(Module module, Record<Record<Unknown>> impoerObject) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSProperty
        Record<Unknown> getExports();

    }

    interface LinkError extends Any {
        @JSBody(script = "return WebAssembly.LinkError.prototype")
        static WebAssembly.LinkError prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new WebAssembly.LinkError()")
        static WebAssembly.LinkError create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

    }

    interface Memory extends Any {
        @JSBody(script = "return WebAssembly.Memory.prototype")
        static WebAssembly.Memory prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(params = "descriptor", script = "return new WebAssembly.Memory(descriptor)")
        static WebAssembly.Memory create(MemoryDescriptor descriptor) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSProperty
        ArrayBuffer getBuffer();

        int grow(int delta);

    }

    interface Module extends Any {
        @JSBody(script = "return WebAssembly.Module.prototype")
        static WebAssembly.Module prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(params = "bytes", script = "return new WebAssembly.Module(bytes)")
        static WebAssembly.Module create(BufferSource bytes) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(params = {"moduleObject", "sectionName"}, script = "return WebAssembly.Module.customSections(moduleObject, sectionName)")
        static Array<ArrayBuffer> customSections(Module moduleObject, String sectionName) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(params = {"moduleObject"}, script = "return WebAssembly.Module.exports(moduleObject)")
        static Array<ModuleExportDescriptor> exports(Module moduleObject) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(params = {"moduleObject"}, script = "return WebAssembly.Module.imports(moduleObject)")
        static Array<ModuleImportDescriptor> imports(Module moduleObject) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }


    }

    interface RuntimeError extends Any {
        @JSBody(script = "return WebAssembly.RuntimeError.prototype")
        static WebAssembly.RuntimeError prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new WebAssembly.RuntimeError()")
        static WebAssembly.RuntimeError create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

    }

    interface Table extends Any {
        @JSBody(script = "return WebAssembly.Table.prototype")
        static WebAssembly.Table prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(params = "descriptor", script = "return new WebAssembly.Table(descriptor)")
        static WebAssembly.Table create(TableDescriptor descriptor) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSProperty
        int getLength();

        @Nullable
        JsFunction get(int index);

        int grow(int delta);

        void set(int index, @Nullable JsFunction value);

    }

    interface GlobalDescriptor extends Any {
        @JSProperty
        @Nullable
        boolean isMutable();

        @JSProperty
        void setMutable(boolean mutable);

        @JSProperty
        ValueType getValue();

        @JSProperty
        void setValue(ValueType value);

    }

    interface MemoryDescriptor extends Any {
        @JSProperty
        double getInitial();

        @JSProperty
        void setInitial(double initial);

        @JSProperty
        @Nullable
        double getMaximum();

        @JSProperty
        void setMaximum(double maximum);

    }

    interface ModuleExportDescriptor extends Any {
        @JSProperty
        ImportExportKind getKind();

        @JSProperty
        void setKind(ImportExportKind kind);

        @JSProperty
        String getName();

        @JSProperty
        void setName(String name);

    }

    interface ModuleImportDescriptor extends Any {
        @JSProperty
        ImportExportKind getKind();

        @JSProperty
        void setKind(ImportExportKind kind);

        @JSProperty
        String getModule();

        @JSProperty
        void setModule(String module);

        @JSProperty
        String getName();

        @JSProperty
        void setName(String name);

    }

    interface TableDescriptor extends Any {
        @JSProperty
        TableKind getElement();

        @JSProperty
        void setElement(TableKind element);

        @JSProperty
        double getInitial();

        @JSProperty
        void setInitial(double initial);

        @JSProperty
        @Nullable
        double getMaximum();

        @JSProperty
        void setMaximum(double maximum);

    }

    interface WebAssemblyInstantiatedSource extends Any {
        @JSProperty
        Instance getInstance();

        @JSProperty
        void setInstance(Instance instance);

        @JSProperty
        Module getModule();

        @JSProperty
        void setModule(Module module);

    }

    abstract class ImportExportKind extends JsEnum {
        public static final ImportExportKind FUNCTION = JsEnum.of("function");

        public static final ImportExportKind TABLE = JsEnum.of("table");

        public static final ImportExportKind MEMORY = JsEnum.of("memory");

        public static final ImportExportKind GLOBAL = JsEnum.of("global");

    }

    abstract class TableKind extends JsEnum {
        public static final TableKind ANYFUNC = JsEnum.of("anyfUnc");

    }

    abstract class ValueType extends JsEnum {
        public static final ValueType TYPE_I32 = JsEnum.of("i32");

        public static final ValueType TYPE_I64 = JsEnum.of("i64");

        public static final ValueType TYPE_F32 = JsEnum.of("f32");

        public static final ValueType TYPE_F64 = JsEnum.of("f64");

    }
}
