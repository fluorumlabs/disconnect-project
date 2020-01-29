package js.web.beacon;

import js.lang.Any;
import js.web.dom.Blob;
import js.web.dom.BufferSource;
import js.web.dom.FormData;


public interface NavigatorBeacon extends Any {
        boolean sendBeacon(String url);
        boolean sendBeacon(String url, Blob data);
        boolean sendBeacon(String url, BufferSource data);
        boolean sendBeacon(String url, FormData data);
        boolean sendBeacon(String url, String data);
        }
