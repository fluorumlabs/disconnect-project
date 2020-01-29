package js.web.notifications;

import js.lang.Any;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface NotificationAction extends Any {
    @JSProperty
    String getAction();

    @JSProperty
    void setAction(String action);

    @JSProperty
    @Nullable
    String getIcon();

    @JSProperty
    void setIcon(String icon);

    @JSProperty
    String getTitle();

    @JSProperty
    void setTitle(String title);

}
