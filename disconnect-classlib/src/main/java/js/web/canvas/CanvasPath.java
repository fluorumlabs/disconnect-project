package js.web.canvas;

import js.lang.Any;


public interface CanvasPath extends Any {
    void arc(double x, double y, double radius, double startAngle, double endAngle, boolean anticlockwise);

    void arc(double x, double y, double radius, double startAngle, double endAngle);

    void arcTo(double x1, double y1, double x2, double y2, double radius);

    void bezierCurveTo(double cp1x, double cp1y, double cp2x, double cp2y, double x, double y);

    void closePath();

    void ellipse(double x, double y, double radiusX, double radiusY, double rotation, double startAngle, double endAngle, boolean anticlockwise);

    void ellipse(double x, double y, double radiusX, double radiusY, double rotation, double startAngle, double endAngle);

    void lineTo(double x, double y);

    void moveTo(double x, double y);

    void quadraticCurveTo(double cpx, double cpy, double x, double y);

    void rect(double x, double y, double w, double h);
}
