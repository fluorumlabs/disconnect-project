package js.lang.external.vaadin.vaadin_notification;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.FunctionalInterface;
import javax.annotation.Nullable;
import js.lang.Any;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSFunctor;

@FunctionalInterface
@JSFunctor
@NpmPackage(
    name = "@vaadin/vaadin-notification",
    version = "^1.6.0-alpha2"
)
@Import(
    module = "@vaadin/vaadin-notification/vaadin-notification.js"
)
public interface NotificationRenderer extends Any {
  void apply(HTMLElement root, @Nullable NotificationElement notification);
}
