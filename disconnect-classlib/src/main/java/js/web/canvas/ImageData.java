package js.web.canvas;

import js.web.webgl.TexImageSource;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import js.lang.Any;
import js.util.buffers.Uint8ClampedArray;

/** The underlying pixel data of an area of a <canvas> element. It is created using the ImageData() constructor or creator methods on the CanvasRenderingContext2D object associated with a createImageData canvas() and getImageData(). It can also be used to set a part of the canvas by using putImageData(). */
        public interface ImageData extends Any, ImageBitmapSource, TexImageSource {
        /**
         * Returns the one-dimensional array containing the data in RGBA order, as integers in the range 0 to 255.
         */
        @JSProperty
        Uint8ClampedArray getData();

        /**
         * Returns the actual dimensions of the data in the ImageData object, in pixels.
         */
        @JSProperty
        int getHeight();

        /**
         * Returns the actual dimensions of the data in the ImageData object, in pixels.
         */
        @JSProperty
        int getWidth();


        @JSBody(script = "return ImageData.prototype")
        static ImageData prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(params={"width","height"}, script = "return new ImageData(width, height)")
        static ImageData create(int width, int height) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(params={"array","width","height"}, script = "return new ImageData(array, width, height)")
        static ImageData create(Uint8ClampedArray array, int width, int height) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }


        }
