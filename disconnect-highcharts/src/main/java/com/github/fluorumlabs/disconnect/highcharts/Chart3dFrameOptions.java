package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) Provides the option to draw a frame around the charts by
 * defining a bottom, front and back panel.
 *
 * @see <a href="https://api.highcharts.com/highcharts/chart.options3d.frame">https://api.highcharts.com/highcharts/chart.options3d.frame</a>
 *
 */
public interface Chart3dFrameOptions extends Any {
  /**
   * (Highcharts) The back side of the frame around a 3D chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.options3d.frame.back">https://api.highcharts.com/highcharts/chart.options3d.frame.back</a>
   *
   * @implspec back?: Chart3dFrameBackOptions;
   *
   */
  @JSProperty("back")
  @Nullable
  Chart3dFrameBackOptions getBack();

  /**
   * (Highcharts) The back side of the frame around a 3D chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.options3d.frame.back">https://api.highcharts.com/highcharts/chart.options3d.frame.back</a>
   *
   * @implspec back?: Chart3dFrameBackOptions;
   *
   */
  @JSProperty("back")
  void setBack(Chart3dFrameBackOptions value);

  /**
   * (Highcharts) The bottom of the frame around a 3D chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.options3d.frame.bottom">https://api.highcharts.com/highcharts/chart.options3d.frame.bottom</a>
   *
   * @implspec bottom?: Chart3dFrameBottomOptions;
   *
   */
  @JSProperty("bottom")
  @Nullable
  Chart3dFrameBottomOptions getBottom();

  /**
   * (Highcharts) The bottom of the frame around a 3D chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.options3d.frame.bottom">https://api.highcharts.com/highcharts/chart.options3d.frame.bottom</a>
   *
   * @implspec bottom?: Chart3dFrameBottomOptions;
   *
   */
  @JSProperty("bottom")
  void setBottom(Chart3dFrameBottomOptions value);

  /**
   * (Highcharts) The front of the frame around a 3D chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.options3d.frame.front">https://api.highcharts.com/highcharts/chart.options3d.frame.front</a>
   *
   * @implspec front?: Chart3dFrameFrontOptions;
   *
   */
  @JSProperty("front")
  @Nullable
  Chart3dFrameFrontOptions getFront();

  /**
   * (Highcharts) The front of the frame around a 3D chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.options3d.frame.front">https://api.highcharts.com/highcharts/chart.options3d.frame.front</a>
   *
   * @implspec front?: Chart3dFrameFrontOptions;
   *
   */
  @JSProperty("front")
  void setFront(Chart3dFrameFrontOptions value);

  /**
   * (Highcharts) The left side of the frame around a 3D chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.options3d.frame.left">https://api.highcharts.com/highcharts/chart.options3d.frame.left</a>
   *
   * @implspec left?: Chart3dFrameLeftOptions;
   *
   */
  @JSProperty("left")
  @Nullable
  Chart3dFrameLeftOptions getLeft();

  /**
   * (Highcharts) The left side of the frame around a 3D chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.options3d.frame.left">https://api.highcharts.com/highcharts/chart.options3d.frame.left</a>
   *
   * @implspec left?: Chart3dFrameLeftOptions;
   *
   */
  @JSProperty("left")
  void setLeft(Chart3dFrameLeftOptions value);

  /**
   * (Highcharts) The right of the frame around a 3D chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.options3d.frame.right">https://api.highcharts.com/highcharts/chart.options3d.frame.right</a>
   *
   * @implspec right?: Chart3dFrameRightOptions;
   *
   */
  @JSProperty("right")
  @Nullable
  Chart3dFrameRightOptions getRight();

  /**
   * (Highcharts) The right of the frame around a 3D chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.options3d.frame.right">https://api.highcharts.com/highcharts/chart.options3d.frame.right</a>
   *
   * @implspec right?: Chart3dFrameRightOptions;
   *
   */
  @JSProperty("right")
  void setRight(Chart3dFrameRightOptions value);

  /**
   * (Highcharts) Note: As of v5.0.12, <code>frame.left</code> or <code>frame.right</code> should be
   * used instead.
   *
   * The side for the frame around a 3D chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.options3d.frame.side">https://api.highcharts.com/highcharts/chart.options3d.frame.side</a>
   *
   * @implspec side?: Chart3dFrameSideOptions;
   *
   */
  @JSProperty("side")
  @Nullable
  Chart3dFrameSideOptions getSide();

  /**
   * (Highcharts) Note: As of v5.0.12, <code>frame.left</code> or <code>frame.right</code> should be
   * used instead.
   *
   * The side for the frame around a 3D chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.options3d.frame.side">https://api.highcharts.com/highcharts/chart.options3d.frame.side</a>
   *
   * @implspec side?: Chart3dFrameSideOptions;
   *
   */
  @JSProperty("side")
  void setSide(Chart3dFrameSideOptions value);

  /**
   * (Highcharts) General pixel thickness for the frame faces.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.options3d.frame.size">https://api.highcharts.com/highcharts/chart.options3d.frame.size</a>
   *
   * @implspec size?: number;
   *
   */
  @JSProperty("size")
  double getSize();

  /**
   * (Highcharts) General pixel thickness for the frame faces.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.options3d.frame.size">https://api.highcharts.com/highcharts/chart.options3d.frame.size</a>
   *
   * @implspec size?: number;
   *
   */
  @JSProperty("size")
  void setSize(double value);

  /**
   * (Highcharts) The top of the frame around a 3D chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.options3d.frame.top">https://api.highcharts.com/highcharts/chart.options3d.frame.top</a>
   *
   * @implspec top?: Chart3dFrameTopOptions;
   *
   */
  @JSProperty("top")
  @Nullable
  Chart3dFrameTopOptions getTop();

  /**
   * (Highcharts) The top of the frame around a 3D chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.options3d.frame.top">https://api.highcharts.com/highcharts/chart.options3d.frame.top</a>
   *
   * @implspec top?: Chart3dFrameTopOptions;
   *
   */
  @JSProperty("top")
  void setTop(Chart3dFrameTopOptions value);

  /**
   * (Highcharts) Whether the frames are visible.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.options3d.frame.visible">https://api.highcharts.com/highcharts/chart.options3d.frame.visible</a>
   *
   * @implspec visible?: string;
   *
   */
  @JSProperty("visible")
  @Nullable
  String getVisible();

  /**
   * (Highcharts) Whether the frames are visible.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.options3d.frame.visible">https://api.highcharts.com/highcharts/chart.options3d.frame.visible</a>
   *
   * @implspec visible?: string;
   *
   */
  @JSProperty("visible")
  void setVisible(String value);
}
