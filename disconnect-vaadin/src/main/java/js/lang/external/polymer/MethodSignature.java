package js.lang.external.polymer;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import js.lang.Any;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "@polymer/polymer",
    version = "^3.4.1"
)
@Import(
    module = "@polymer/polymer/polymer-element.js"
)
public interface MethodSignature extends Any {
  @JSProperty("methodName")
  String getMethodName();

  @JSProperty("methodName")
  void setMethodName(String value);

  @JSProperty("static")
  boolean getStaticValue();

  @JSProperty("static")
  void setStaticValue(boolean value);

  @JSProperty("args")
  MethodArg[] getArgs();

  @JSProperty("args")
  void setArgs(MethodArg[] value);

  @JSProperty("dynamicFn")
  boolean getDynamicFn();

  @JSProperty("dynamicFn")
  void setDynamicFn(boolean value);

  class Builder {
    private final MethodSignature object = Any.empty();

    public MethodSignature build() {
      return object;
    }

    public Builder methodName(String value) {
      object.setMethodName(value);
      return this;
    }

    public Builder staticValue(boolean value) {
      object.setStaticValue(value);
      return this;
    }

    public Builder args(MethodArg[] value) {
      object.setArgs(value);
      return this;
    }

    public Builder dynamicFn(boolean value) {
      object.setDynamicFn(value);
      return this;
    }
  }
}
