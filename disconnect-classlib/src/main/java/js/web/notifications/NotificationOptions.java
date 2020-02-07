package js.web.notifications;

import js.lang.Any;
import js.lang.Unknown;
import js.util.collections.Array;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface NotificationOptions extends Any {
    @JSProperty
    @Nullable
    Array<NotificationAction> getActions();

    @JSProperty
    void setActions(NotificationAction... actions);

    @JSProperty
    void setActions(Array<NotificationAction> actions);

    @JSProperty
    @Nullable
    String getBadge();

    @JSProperty
    void setBadge(String badge);

    @JSProperty
    @Nullable
    String getBody();

    @JSProperty
    void setBody(String body);

    @JSProperty
    @Nullable
    Any getData();

    @JSProperty
    void setData(Any data);

    @JSProperty
    @Nullable
    NotificationDirection getDir();

    @JSProperty
    void setDir(NotificationDirection dir);

    @JSProperty
    @Nullable
    String getIcon();

    @JSProperty
    void setIcon(String icon);

    @JSProperty
    @Nullable
    String getImage();

    @JSProperty
    void setImage(String image);

    @JSProperty
    @Nullable
    String getLang();

    @JSProperty
    void setLang(String lang);

    @JSProperty
    boolean isRenotify();

    @JSProperty
    void setRenotify(boolean renotify);

    @JSProperty
    boolean isRequireInteraction();

    @JSProperty
    void setRequireInteraction(boolean requireInteraction);

    @JSProperty
    boolean isSilent();

    @JSProperty
    void setSilent(boolean silent);

    @JSProperty
    @Nullable
    String getTag();

    @JSProperty
    void setTag(String tag);

    @JSProperty
    @Nullable
    double getTimestamp();

    @JSProperty
    void setTimestamp(double timestamp);

    @JSProperty
    @Nullable
    Unknown getVibrate();

    @JSProperty
    void setVibrate(double vibrate);

    @JSProperty
    void setVibrate(double... vibrate);

}
