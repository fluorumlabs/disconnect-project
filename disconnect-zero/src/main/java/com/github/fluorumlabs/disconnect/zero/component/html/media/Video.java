package com.github.fluorumlabs.disconnect.zero.component.html.media;

import com.github.fluorumlabs.disconnect.zero.annotations.Tag;
import js.web.dom.HTMLVideoElement;
import js.web.mse.VideoPlaybackQuality;


@Tag("video")
public class Video extends HtmlMediaComponent<HTMLVideoElement> {
    /**
     * Gets or sets the height of the video element.
     */
    public double getHeight() {
        return getElement().getHeight();
    }

    public void setHeight(double height) {
        getElement().setHeight(height);
    }

    /**
     * Gets or sets a URL of an image to display, for example, like a movie poster. This can be a still frame from the video, or another image if no video data is available.
     */
    public String getPoster() {
        return getElement().getPoster();
    }

    public void setPoster(String poster) {
        getElement().setPoster(poster);
    }

    /**
     * Gets the intrinsic height of a video in CSS pixels, or zero if the dimensions are not known.
     */
    public double getVideoHeight() {
        return getElement().getVideoHeight();
    }

    /**
     * Gets the intrinsic width of a video in CSS pixels, or zero if the dimensions are not known.
     */
    public double getVideoWidth() {
        return getElement().getVideoWidth();
    }

    /**
     * Gets or sets the width of the video element.
     */
    public double getWidth() {
        return getElement().getWidth();
    }

    public void setWidth(double width) {
        getElement().setWidth(width);
    }

    public VideoPlaybackQuality getVideoPlaybackQuality() {
        return getElement().getVideoPlaybackQuality();
    }
}

