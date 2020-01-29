package js.web.webgl;

import js.extras.JsEnum;
import js.web.canvas.OffscreenRenderingContext;
import js.web.canvas.RenderingContext;
import org.teavm.jso.JSBody;

/**
 * Provides an interface to the OpenGL ES 2.0 graphics rendering context for the drawing surface of an HTML <canvas> element.
 */
public interface WebGLRenderingContext extends WebGLRenderingContextBase, WebGLRenderingContextOverloads, RenderingContext, OffscreenRenderingContext {
    int ACTIVE_TEXTURE = JsEnum.from("return WebGLRenderingContext.ACTIVE_TEXTURE").intValue();

    int ACTIVE_UNIFORMS = JsEnum.from("return WebGLRenderingContext.ACTIVE_UNIFORMS").intValue();

    int ALIASED_LINE_WIDTH_RANGE = JsEnum.from("return WebGLRenderingContext.ALIASED_LINE_WIDTH_RANGE").intValue();

    int ALIASED_POINT_SIZE_RANGE = JsEnum.from("return WebGLRenderingContext.ALIASED_POINT_SIZE_RANGE").intValue();

    int ALPHA = JsEnum.from("return WebGLRenderingContext.ALPHA").intValue();

    int ALPHA_BITS = JsEnum.from("return WebGLRenderingContext.ALPHA_BITS").intValue();

    int ALWAYS = JsEnum.from("return WebGLRenderingContext.ALWAYS").intValue();

    int ARRAY_BUFFER = JsEnum.from("return WebGLRenderingContext.ARRAY_BUFFER").intValue();

    int ARRAY_BUFFER_BINDING = JsEnum.from("return WebGLRenderingContext.ARRAY_BUFFER_BINDING").intValue();

    int ATTACHED_SHADERS = JsEnum.from("return WebGLRenderingContext.ATTACHED_SHADERS").intValue();

    int BACK = JsEnum.from("return WebGLRenderingContext.BACK").intValue();

    int BLEND = JsEnum.from("return WebGLRenderingContext.BLEND").intValue();

    int BLEND_COLOR = JsEnum.from("return WebGLRenderingContext.BLEND_COLOR").intValue();

    int BLEND_DST_ALPHA = JsEnum.from("return WebGLRenderingContext.BLEND_DST_ALPHA").intValue();

    int BLEND_DST_RGB = JsEnum.from("return WebGLRenderingContext.BLEND_DST_RGB").intValue();

    int BLEND_EQUATION = JsEnum.from("return WebGLRenderingContext.BLEND_EQUATION").intValue();

    int BLEND_EQUATION_ALPHA = JsEnum.from("return WebGLRenderingContext.BLEND_EQUATION_ALPHA").intValue();

    int BLEND_EQUATION_RGB = JsEnum.from("return WebGLRenderingContext.BLEND_EQUATION_RGB").intValue();

    int BLEND_SRC_ALPHA = JsEnum.from("return WebGLRenderingContext.BLEND_SRC_ALPHA").intValue();

    int BLEND_SRC_RGB = JsEnum.from("return WebGLRenderingContext.BLEND_SRC_RGB").intValue();

    int BLUE_BITS = JsEnum.from("return WebGLRenderingContext.BLUE_BITS").intValue();

    int BOOL = JsEnum.from("return WebGLRenderingContext.BOOL").intValue();

    int BOOL_VEC2 = JsEnum.from("return WebGLRenderingContext.BOOL_VEC2").intValue();

    int BOOL_VEC3 = JsEnum.from("return WebGLRenderingContext.BOOL_VEC3").intValue();

    int BOOL_VEC4 = JsEnum.from("return WebGLRenderingContext.BOOL_VEC4").intValue();

    int BROWSER_DEFAULT_WEBGL = JsEnum.from("return WebGLRenderingContext.BROWSER_DEFAULT_WEBGL").intValue();

    int BUFFER_SIZE = JsEnum.from("return WebGLRenderingContext.BUFFER_SIZE").intValue();

    int BUFFER_USAGE = JsEnum.from("return WebGLRenderingContext.BUFFER_USAGE").intValue();

    int BYTE = JsEnum.from("return WebGLRenderingContext.BYTE").intValue();

    int CCW = JsEnum.from("return WebGLRenderingContext.CCW").intValue();

    int CLAMP_TO_EDGE = JsEnum.from("return WebGLRenderingContext.CLAMP_TO_EDGE").intValue();

    int COLOR_ATTACHMENT0 = JsEnum.from("return WebGLRenderingContext.COLOR_ATTACHMENT0").intValue();

    int COLOR_BUFFER_BIT = JsEnum.from("return WebGLRenderingContext.COLOR_BUFFER_BIT").intValue();

    int COLOR_CLEAR_VALUE = JsEnum.from("return WebGLRenderingContext.COLOR_CLEAR_VALUE").intValue();

    int COLOR_WRITEMASK = JsEnum.from("return WebGLRenderingContext.COLOR_WRITEMASK").intValue();

    int COMPILE_STATUS = JsEnum.from("return WebGLRenderingContext.COMPILE_STATUS").intValue();

    int COMPRESSED_TEXTURE_FORMATS = JsEnum.from("return WebGLRenderingContext.COMPRESSED_TEXTURE_FORMATS").intValue();

    int CONSTANT_ALPHA = JsEnum.from("return WebGLRenderingContext.CONSTANT_ALPHA").intValue();

    int CONSTANT_COLOR = JsEnum.from("return WebGLRenderingContext.CONSTANT_COLOR").intValue();

    int CONTEXT_LOST_WEBGL = JsEnum.from("return WebGLRenderingContext.CONTEXT_LOST_WEBGL").intValue();

    int CULL_FACE = JsEnum.from("return WebGLRenderingContext.CULL_FACE").intValue();

    int CULL_FACE_MODE = JsEnum.from("return WebGLRenderingContext.CULL_FACE_MODE").intValue();

    int CURRENT_PROGRAM = JsEnum.from("return WebGLRenderingContext.CURRENT_PROGRAM").intValue();

    int CURRENT_VERTEX_ATTRIB = JsEnum.from("return WebGLRenderingContext.CURRENT_VERTEX_ATTRIB").intValue();

    int CW = JsEnum.from("return WebGLRenderingContext.CW").intValue();

    int DECR = JsEnum.from("return WebGLRenderingContext.DECR").intValue();

    int DECR_WRAP = JsEnum.from("return WebGLRenderingContext.DECR_WRAP").intValue();

    int DELETE_STATUS = JsEnum.from("return WebGLRenderingContext.DELETE_STATUS").intValue();

    int DEPTH_ATTACHMENT = JsEnum.from("return WebGLRenderingContext.DEPTH_ATTACHMENT").intValue();

    int DEPTH_BITS = JsEnum.from("return WebGLRenderingContext.DEPTH_BITS").intValue();

    int DEPTH_BUFFER_BIT = JsEnum.from("return WebGLRenderingContext.DEPTH_BUFFER_BIT").intValue();

    int DEPTH_CLEAR_VALUE = JsEnum.from("return WebGLRenderingContext.DEPTH_CLEAR_VALUE").intValue();

    int DEPTH_COMPONENT = JsEnum.from("return WebGLRenderingContext.DEPTH_COMPONENT").intValue();

    int DEPTH_COMPONENT16 = JsEnum.from("return WebGLRenderingContext.DEPTH_COMPONENT16").intValue();

    int DEPTH_FUNC = JsEnum.from("return WebGLRenderingContext.DEPTH_FUNC").intValue();

    int DEPTH_RANGE = JsEnum.from("return WebGLRenderingContext.DEPTH_RANGE").intValue();

    int DEPTH_STENCIL = JsEnum.from("return WebGLRenderingContext.DEPTH_STENCIL").intValue();

    int DEPTH_STENCIL_ATTACHMENT = JsEnum.from("return WebGLRenderingContext.DEPTH_STENCIL_ATTACHMENT").intValue();

    int DEPTH_TEST = JsEnum.from("return WebGLRenderingContext.DEPTH_TEST").intValue();

    int DEPTH_WRITEMASK = JsEnum.from("return WebGLRenderingContext.DEPTH_WRITEMASK").intValue();

    int DITHER = JsEnum.from("return WebGLRenderingContext.DITHER").intValue();

    int DONT_CARE = JsEnum.from("return WebGLRenderingContext.DONT_CARE").intValue();

    int DST_ALPHA = JsEnum.from("return WebGLRenderingContext.DST_ALPHA").intValue();

    int DST_COLOR = JsEnum.from("return WebGLRenderingContext.DST_COLOR").intValue();

    int DYNAMIC_DRAW = JsEnum.from("return WebGLRenderingContext.DYNAMIC_DRAW").intValue();

    int ELEMENT_ARRAY_BUFFER = JsEnum.from("return WebGLRenderingContext.ELEMENT_ARRAY_BUFFER").intValue();

    int ELEMENT_ARRAY_BUFFER_BINDING = JsEnum.from("return WebGLRenderingContext.ELEMENT_ARRAY_BUFFER_BINDING").intValue();

    int EQUAL = JsEnum.from("return WebGLRenderingContext.EQUAL").intValue();

    int FASTEST = JsEnum.from("return WebGLRenderingContext.FASTEST").intValue();

    int FLOAT = JsEnum.from("return WebGLRenderingContext.FLOAT").intValue();

    int FLOAT_MAT2 = JsEnum.from("return WebGLRenderingContext.FLOAT_MAT2").intValue();

    int FLOAT_MAT3 = JsEnum.from("return WebGLRenderingContext.FLOAT_MAT3").intValue();

    int FLOAT_MAT4 = JsEnum.from("return WebGLRenderingContext.FLOAT_MAT4").intValue();

    int FLOAT_VEC2 = JsEnum.from("return WebGLRenderingContext.FLOAT_VEC2").intValue();

    int FLOAT_VEC3 = JsEnum.from("return WebGLRenderingContext.FLOAT_VEC3").intValue();

    int FLOAT_VEC4 = JsEnum.from("return WebGLRenderingContext.FLOAT_VEC4").intValue();

    int FRAGMENT_SHADER = JsEnum.from("return WebGLRenderingContext.FRAGMENT_SHADER").intValue();

    int FRAMEBUFFER = JsEnum.from("return WebGLRenderingContext.FRAMEBUFFER").intValue();

    int FRAMEBUFFER_ATTACHMENT_OBJECT_NAME = JsEnum.from("return WebGLRenderingContext.FRAMEBUFFER_ATTACHMENT_OBJECT_NAME").intValue();

    int FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE = JsEnum.from("return WebGLRenderingContext.FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE").intValue();

    int FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE = JsEnum.from("return WebGLRenderingContext.FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE").intValue();

    int FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL = JsEnum.from("return WebGLRenderingContext.FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL").intValue();

    int FRAMEBUFFER_BINDING = JsEnum.from("return WebGLRenderingContext.FRAMEBUFFER_BINDING").intValue();

    int FRAMEBUFFER_COMPLETE = JsEnum.from("return WebGLRenderingContext.FRAMEBUFFER_COMPLETE").intValue();

    int FRAMEBUFFER_INCOMPLETE_ATTACHMENT = JsEnum.from("return WebGLRenderingContext.FRAMEBUFFER_INCOMPLETE_ATTACHMENT").intValue();

    int FRAMEBUFFER_INCOMPLETE_DIMENSIONS = JsEnum.from("return WebGLRenderingContext.FRAMEBUFFER_INCOMPLETE_DIMENSIONS").intValue();

    int FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT = JsEnum.from("return WebGLRenderingContext.FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT").intValue();

    int FRAMEBUFFER_UNSUPPORTED = JsEnum.from("return WebGLRenderingContext.FRAMEBUFFER_UNSUPPORTED").intValue();

    int FRONT = JsEnum.from("return WebGLRenderingContext.FRONT").intValue();

    int FRONT_AND_BACK = JsEnum.from("return WebGLRenderingContext.FRONT_AND_BACK").intValue();

    int FRONT_FACE = JsEnum.from("return WebGLRenderingContext.FRONT_FACE").intValue();

    int FUNC_ADD = JsEnum.from("return WebGLRenderingContext.FUNC_ADD").intValue();

    int FUNC_REVERSE_SUBTRACT = JsEnum.from("return WebGLRenderingContext.FUNC_REVERSE_SUBTRACT").intValue();

    int FUNC_SUBTRACT = JsEnum.from("return WebGLRenderingContext.FUNC_SUBTRACT").intValue();

    int GENERATE_MIPMAP_HINT = JsEnum.from("return WebGLRenderingContext.GENERATE_MIPMAP_HINT").intValue();

    int GEQUAL = JsEnum.from("return WebGLRenderingContext.GEQUAL").intValue();

    int GREATER = JsEnum.from("return WebGLRenderingContext.GREATER").intValue();

    int GREEN_BITS = JsEnum.from("return WebGLRenderingContext.GREEN_BITS").intValue();

    int HIGH_FLOAT = JsEnum.from("return WebGLRenderingContext.HIGH_FLOAT").intValue();

    int HIGH_INT = JsEnum.from("return WebGLRenderingContext.HIGH_INT").intValue();

    int IMPLEMENTATION_COLOR_READ_FORMAT = JsEnum.from("return WebGLRenderingContext.IMPLEMENTATION_COLOR_READ_FORMAT").intValue();

    int IMPLEMENTATION_COLOR_READ_TYPE = JsEnum.from("return WebGLRenderingContext.IMPLEMENTATION_COLOR_READ_TYPE").intValue();

    int INCR = JsEnum.from("return WebGLRenderingContext.INCR").intValue();

    int INCR_WRAP = JsEnum.from("return WebGLRenderingContext.INCR_WRAP").intValue();

    int INT = JsEnum.from("return WebGLRenderingContext.INT").intValue();

    int INT_VEC2 = JsEnum.from("return WebGLRenderingContext.INT_VEC2").intValue();

    int INT_VEC3 = JsEnum.from("return WebGLRenderingContext.INT_VEC3").intValue();

    int INT_VEC4 = JsEnum.from("return WebGLRenderingContext.INT_VEC4").intValue();

    int INVALID_ENUM = JsEnum.from("return WebGLRenderingContext.INVALID_ENUM").intValue();

    int INVALID_FRAMEBUFFER_OPERATION = JsEnum.from("return WebGLRenderingContext.INVALID_FRAMEBUFFER_OPERATION").intValue();

    int INVALID_OPERATION = JsEnum.from("return WebGLRenderingContext.INVALID_OPERATION").intValue();

    int INVALID_VALUE = JsEnum.from("return WebGLRenderingContext.INVALID_VALUE").intValue();

    int INVERT = JsEnum.from("return WebGLRenderingContext.INVERT").intValue();

    int KEEP = JsEnum.from("return WebGLRenderingContext.KEEP").intValue();

    int LEQUAL = JsEnum.from("return WebGLRenderingContext.LEQUAL").intValue();

    int LESS = JsEnum.from("return WebGLRenderingContext.LESS").intValue();

    int LINEAR = JsEnum.from("return WebGLRenderingContext.LINEAR").intValue();

    int LINEAR_MIPMAP_LINEAR = JsEnum.from("return WebGLRenderingContext.LINEAR_MIPMAP_LINEAR").intValue();

    int LINEAR_MIPMAP_NEAREST = JsEnum.from("return WebGLRenderingContext.LINEAR_MIPMAP_NEAREST").intValue();

    int LINES = JsEnum.from("return WebGLRenderingContext.LINES").intValue();

    int LINE_LOOP = JsEnum.from("return WebGLRenderingContext.LINE_LOOP").intValue();

    int LINE_STRIP = JsEnum.from("return WebGLRenderingContext.LINE_STRIP").intValue();

    int LINE_WIDTH = JsEnum.from("return WebGLRenderingContext.LINE_WIDTH").intValue();

    int LINK_STATUS = JsEnum.from("return WebGLRenderingContext.LINK_STATUS").intValue();

    int LOW_FLOAT = JsEnum.from("return WebGLRenderingContext.LOW_FLOAT").intValue();

    int LOW_INT = JsEnum.from("return WebGLRenderingContext.LOW_INT").intValue();

    int LUMINANCE = JsEnum.from("return WebGLRenderingContext.LUMINANCE").intValue();

    int LUMINANCE_ALPHA = JsEnum.from("return WebGLRenderingContext.LUMINANCE_ALPHA").intValue();

    int MAX_COMBINED_TEXTURE_IMAGE_UNITS = JsEnum.from("return WebGLRenderingContext.MAX_COMBINED_TEXTURE_IMAGE_UNITS").intValue();

    int MAX_CUBE_MAP_TEXTURE_SIZE = JsEnum.from("return WebGLRenderingContext.MAX_CUBE_MAP_TEXTURE_SIZE").intValue();

    int MAX_FRAGMENT_UNIFORM_VECTORS = JsEnum.from("return WebGLRenderingContext.MAX_FRAGMENT_UNIFORM_VECTORS").intValue();

    int MAX_RENDERBUFFER_SIZE = JsEnum.from("return WebGLRenderingContext.MAX_RENDERBUFFER_SIZE").intValue();

    int MAX_TEXTURE_IMAGE_UNITS = JsEnum.from("return WebGLRenderingContext.MAX_TEXTURE_IMAGE_UNITS").intValue();

    int MAX_TEXTURE_SIZE = JsEnum.from("return WebGLRenderingContext.MAX_TEXTURE_SIZE").intValue();

    int MAX_VARYING_VECTORS = JsEnum.from("return WebGLRenderingContext.MAX_VARYING_VECTORS").intValue();

    int MAX_VERTEX_ATTRIBS = JsEnum.from("return WebGLRenderingContext.MAX_VERTEX_ATTRIBS").intValue();

    int MAX_VERTEX_TEXTURE_IMAGE_UNITS = JsEnum.from("return WebGLRenderingContext.MAX_VERTEX_TEXTURE_IMAGE_UNITS").intValue();

    int MAX_VERTEX_UNIFORM_VECTORS = JsEnum.from("return WebGLRenderingContext.MAX_VERTEX_UNIFORM_VECTORS").intValue();

    int MAX_VIEWPORT_DIMS = JsEnum.from("return WebGLRenderingContext.MAX_VIEWPORT_DIMS").intValue();

    int MEDIUM_FLOAT = JsEnum.from("return WebGLRenderingContext.MEDIUM_FLOAT").intValue();

    int MEDIUM_INT = JsEnum.from("return WebGLRenderingContext.MEDIUM_INT").intValue();

    int MIRRORED_REPEAT = JsEnum.from("return WebGLRenderingContext.MIRRORED_REPEAT").intValue();

    int NEAREST = JsEnum.from("return WebGLRenderingContext.NEAREST").intValue();

    int NEAREST_MIPMAP_LINEAR = JsEnum.from("return WebGLRenderingContext.NEAREST_MIPMAP_LINEAR").intValue();

    int NEAREST_MIPMAP_NEAREST = JsEnum.from("return WebGLRenderingContext.NEAREST_MIPMAP_NEAREST").intValue();

    int NEVER = JsEnum.from("return WebGLRenderingContext.NEVER").intValue();

    int NICEST = JsEnum.from("return WebGLRenderingContext.NICEST").intValue();

    int NONE = JsEnum.from("return WebGLRenderingContext.NONE").intValue();

    int NOTEQUAL = JsEnum.from("return WebGLRenderingContext.NOTEQUAL").intValue();

    int NO_ERROR = JsEnum.from("return WebGLRenderingContext.NO_ERROR").intValue();

    int ONE = JsEnum.from("return WebGLRenderingContext.ONE").intValue();

    int ONE_MINUS_CONSTANT_ALPHA = JsEnum.from("return WebGLRenderingContext.ONE_MINUS_CONSTANT_ALPHA").intValue();

    int ONE_MINUS_CONSTANT_COLOR = JsEnum.from("return WebGLRenderingContext.ONE_MINUS_CONSTANT_COLOR").intValue();

    int ONE_MINUS_DST_ALPHA = JsEnum.from("return WebGLRenderingContext.ONE_MINUS_DST_ALPHA").intValue();

    int ONE_MINUS_DST_COLOR = JsEnum.from("return WebGLRenderingContext.ONE_MINUS_DST_COLOR").intValue();

    int ONE_MINUS_SRC_ALPHA = JsEnum.from("return WebGLRenderingContext.ONE_MINUS_SRC_ALPHA").intValue();

    int ONE_MINUS_SRC_COLOR = JsEnum.from("return WebGLRenderingContext.ONE_MINUS_SRC_COLOR").intValue();

    int OUT_OF_MEMORY = JsEnum.from("return WebGLRenderingContext.OUT_OF_MEMORY").intValue();

    int PACK_ALIGNMENT = JsEnum.from("return WebGLRenderingContext.PACK_ALIGNMENT").intValue();

    int POINTS = JsEnum.from("return WebGLRenderingContext.POINTS").intValue();

    int POLYGON_OFFSET_FACTOR = JsEnum.from("return WebGLRenderingContext.POLYGON_OFFSET_FACTOR").intValue();

    int POLYGON_OFFSET_FILL = JsEnum.from("return WebGLRenderingContext.POLYGON_OFFSET_FILL").intValue();

    int POLYGON_OFFSET_UNITS = JsEnum.from("return WebGLRenderingContext.POLYGON_OFFSET_UNITS").intValue();

    int RED_BITS = JsEnum.from("return WebGLRenderingContext.RED_BITS").intValue();

    int RENDERBUFFER = JsEnum.from("return WebGLRenderingContext.RENDERBUFFER").intValue();

    int RENDERBUFFER_ALPHA_SIZE = JsEnum.from("return WebGLRenderingContext.RENDERBUFFER_ALPHA_SIZE").intValue();

    int RENDERBUFFER_BINDING = JsEnum.from("return WebGLRenderingContext.RENDERBUFFER_BINDING").intValue();

    int RENDERBUFFER_BLUE_SIZE = JsEnum.from("return WebGLRenderingContext.RENDERBUFFER_BLUE_SIZE").intValue();

    int RENDERBUFFER_DEPTH_SIZE = JsEnum.from("return WebGLRenderingContext.RENDERBUFFER_DEPTH_SIZE").intValue();

    int RENDERBUFFER_GREEN_SIZE = JsEnum.from("return WebGLRenderingContext.RENDERBUFFER_GREEN_SIZE").intValue();

    int RENDERBUFFER_HEIGHT = JsEnum.from("return WebGLRenderingContext.RENDERBUFFER_HEIGHT").intValue();

    int RENDERBUFFER_INTERNAL_FORMAT = JsEnum.from("return WebGLRenderingContext.RENDERBUFFER_INTERNAL_FORMAT").intValue();

    int RENDERBUFFER_RED_SIZE = JsEnum.from("return WebGLRenderingContext.RENDERBUFFER_RED_SIZE").intValue();

    int RENDERBUFFER_STENCIL_SIZE = JsEnum.from("return WebGLRenderingContext.RENDERBUFFER_STENCIL_SIZE").intValue();

    int RENDERBUFFER_WIDTH = JsEnum.from("return WebGLRenderingContext.RENDERBUFFER_WIDTH").intValue();

    int RENDERER = JsEnum.from("return WebGLRenderingContext.RENDERER").intValue();

    int REPEAT = JsEnum.from("return WebGLRenderingContext.REPEAT").intValue();

    int REPLACE = JsEnum.from("return WebGLRenderingContext.REPLACE").intValue();

    int RGB = JsEnum.from("return WebGLRenderingContext.RGB").intValue();

    int RGB565 = JsEnum.from("return WebGLRenderingContext.RGB565").intValue();

    int RGB5_A1 = JsEnum.from("return WebGLRenderingContext.RGB5_A1").intValue();

    int RGBA = JsEnum.from("return WebGLRenderingContext.RGBA").intValue();

    int RGBA4 = JsEnum.from("return WebGLRenderingContext.RGBA4").intValue();

    int SAMPLER_2D = JsEnum.from("return WebGLRenderingContext.SAMPLER_2D").intValue();

    int SAMPLER_CUBE = JsEnum.from("return WebGLRenderingContext.SAMPLER_CUBE").intValue();

    int SAMPLES = JsEnum.from("return WebGLRenderingContext.SAMPLES").intValue();

    int SAMPLE_ALPHA_TO_COVERAGE = JsEnum.from("return WebGLRenderingContext.SAMPLE_ALPHA_TO_COVERAGE").intValue();

    int SAMPLE_BUFFERS = JsEnum.from("return WebGLRenderingContext.SAMPLE_BUFFERS").intValue();

    int SAMPLE_COVERAGE = JsEnum.from("return WebGLRenderingContext.SAMPLE_COVERAGE").intValue();

    int SAMPLE_COVERAGE_INVERT = JsEnum.from("return WebGLRenderingContext.SAMPLE_COVERAGE_INVERT").intValue();

    int SAMPLE_COVERAGE_VALUE = JsEnum.from("return WebGLRenderingContext.SAMPLE_COVERAGE_VALUE").intValue();

    int SCISSOR_BOX = JsEnum.from("return WebGLRenderingContext.SCISSOR_BOX").intValue();

    int SCISSOR_TEST = JsEnum.from("return WebGLRenderingContext.SCISSOR_TEST").intValue();

    int SHADER_TYPE = JsEnum.from("return WebGLRenderingContext.SHADER_TYPE").intValue();

    int SHADING_LANGUAGE_VERSION = JsEnum.from("return WebGLRenderingContext.SHADING_LANGUAGE_VERSION").intValue();

    int SHORT = JsEnum.from("return WebGLRenderingContext.SHORT").intValue();

    int SRC_ALPHA = JsEnum.from("return WebGLRenderingContext.SRC_ALPHA").intValue();

    int SRC_ALPHA_SATURATE = JsEnum.from("return WebGLRenderingContext.SRC_ALPHA_SATURATE").intValue();

    int SRC_COLOR = JsEnum.from("return WebGLRenderingContext.SRC_COLOR").intValue();

    int STATIC_DRAW = JsEnum.from("return WebGLRenderingContext.STATIC_DRAW").intValue();

    int STENCIL_ATTACHMENT = JsEnum.from("return WebGLRenderingContext.STENCIL_ATTACHMENT").intValue();

    int STENCIL_BACK_FAIL = JsEnum.from("return WebGLRenderingContext.STENCIL_BACK_FAIL").intValue();

    int STENCIL_BACK_FUNC = JsEnum.from("return WebGLRenderingContext.STENCIL_BACK_FUNC").intValue();

    int STENCIL_BACK_PASS_DEPTH_FAIL = JsEnum.from("return WebGLRenderingContext.STENCIL_BACK_PASS_DEPTH_FAIL").intValue();

    int STENCIL_BACK_PASS_DEPTH_PASS = JsEnum.from("return WebGLRenderingContext.STENCIL_BACK_PASS_DEPTH_PASS").intValue();

    int STENCIL_BACK_REF = JsEnum.from("return WebGLRenderingContext.STENCIL_BACK_REF").intValue();

    int STENCIL_BACK_VALUE_MASK = JsEnum.from("return WebGLRenderingContext.STENCIL_BACK_VALUE_MASK").intValue();

    int STENCIL_BACK_WRITEMASK = JsEnum.from("return WebGLRenderingContext.STENCIL_BACK_WRITEMASK").intValue();

    int STENCIL_BITS = JsEnum.from("return WebGLRenderingContext.STENCIL_BITS").intValue();

    int STENCIL_BUFFER_BIT = JsEnum.from("return WebGLRenderingContext.STENCIL_BUFFER_BIT").intValue();

    int STENCIL_CLEAR_VALUE = JsEnum.from("return WebGLRenderingContext.STENCIL_CLEAR_VALUE").intValue();

    int STENCIL_FAIL = JsEnum.from("return WebGLRenderingContext.STENCIL_FAIL").intValue();

    int STENCIL_FUNC = JsEnum.from("return WebGLRenderingContext.STENCIL_FUNC").intValue();

    int STENCIL_INDEX8 = JsEnum.from("return WebGLRenderingContext.STENCIL_INDEX8").intValue();

    int STENCIL_PASS_DEPTH_FAIL = JsEnum.from("return WebGLRenderingContext.STENCIL_PASS_DEPTH_FAIL").intValue();

    int STENCIL_PASS_DEPTH_PASS = JsEnum.from("return WebGLRenderingContext.STENCIL_PASS_DEPTH_PASS").intValue();

    int STENCIL_REF = JsEnum.from("return WebGLRenderingContext.STENCIL_REF").intValue();

    int STENCIL_TEST = JsEnum.from("return WebGLRenderingContext.STENCIL_TEST").intValue();

    int STENCIL_VALUE_MASK = JsEnum.from("return WebGLRenderingContext.STENCIL_VALUE_MASK").intValue();

    int STENCIL_WRITEMASK = JsEnum.from("return WebGLRenderingContext.STENCIL_WRITEMASK").intValue();

    int STREAM_DRAW = JsEnum.from("return WebGLRenderingContext.STREAM_DRAW").intValue();

    int SUBPIXEL_BITS = JsEnum.from("return WebGLRenderingContext.SUBPIXEL_BITS").intValue();

    int TEXTURE = JsEnum.from("return WebGLRenderingContext.TEXTURE").intValue();

    int TEXTURE0 = JsEnum.from("return WebGLRenderingContext.TEXTURE0").intValue();

    int TEXTURE1 = JsEnum.from("return WebGLRenderingContext.TEXTURE1").intValue();

    int TEXTURE10 = JsEnum.from("return WebGLRenderingContext.TEXTURE10").intValue();

    int TEXTURE11 = JsEnum.from("return WebGLRenderingContext.TEXTURE11").intValue();

    int TEXTURE12 = JsEnum.from("return WebGLRenderingContext.TEXTURE12").intValue();

    int TEXTURE13 = JsEnum.from("return WebGLRenderingContext.TEXTURE13").intValue();

    int TEXTURE14 = JsEnum.from("return WebGLRenderingContext.TEXTURE14").intValue();

    int TEXTURE15 = JsEnum.from("return WebGLRenderingContext.TEXTURE15").intValue();

    int TEXTURE16 = JsEnum.from("return WebGLRenderingContext.TEXTURE16").intValue();

    int TEXTURE17 = JsEnum.from("return WebGLRenderingContext.TEXTURE17").intValue();

    int TEXTURE18 = JsEnum.from("return WebGLRenderingContext.TEXTURE18").intValue();

    int TEXTURE19 = JsEnum.from("return WebGLRenderingContext.TEXTURE19").intValue();

    int TEXTURE2 = JsEnum.from("return WebGLRenderingContext.TEXTURE2").intValue();

    int TEXTURE20 = JsEnum.from("return WebGLRenderingContext.TEXTURE20").intValue();

    int TEXTURE21 = JsEnum.from("return WebGLRenderingContext.TEXTURE21").intValue();

    int TEXTURE22 = JsEnum.from("return WebGLRenderingContext.TEXTURE22").intValue();

    int TEXTURE23 = JsEnum.from("return WebGLRenderingContext.TEXTURE23").intValue();

    int TEXTURE24 = JsEnum.from("return WebGLRenderingContext.TEXTURE24").intValue();

    int TEXTURE25 = JsEnum.from("return WebGLRenderingContext.TEXTURE25").intValue();

    int TEXTURE26 = JsEnum.from("return WebGLRenderingContext.TEXTURE26").intValue();

    int TEXTURE27 = JsEnum.from("return WebGLRenderingContext.TEXTURE27").intValue();

    int TEXTURE28 = JsEnum.from("return WebGLRenderingContext.TEXTURE28").intValue();

    int TEXTURE29 = JsEnum.from("return WebGLRenderingContext.TEXTURE29").intValue();

    int TEXTURE3 = JsEnum.from("return WebGLRenderingContext.TEXTURE3").intValue();

    int TEXTURE30 = JsEnum.from("return WebGLRenderingContext.TEXTURE30").intValue();

    int TEXTURE31 = JsEnum.from("return WebGLRenderingContext.TEXTURE31").intValue();

    int TEXTURE4 = JsEnum.from("return WebGLRenderingContext.TEXTURE4").intValue();

    int TEXTURE5 = JsEnum.from("return WebGLRenderingContext.TEXTURE5").intValue();

    int TEXTURE6 = JsEnum.from("return WebGLRenderingContext.TEXTURE6").intValue();

    int TEXTURE7 = JsEnum.from("return WebGLRenderingContext.TEXTURE7").intValue();

    int TEXTURE8 = JsEnum.from("return WebGLRenderingContext.TEXTURE8").intValue();

    int TEXTURE9 = JsEnum.from("return WebGLRenderingContext.TEXTURE9").intValue();

    int TEXTURE_2D = JsEnum.from("return WebGLRenderingContext.TEXTURE_2D").intValue();

    int TEXTURE_BINDING_2D = JsEnum.from("return WebGLRenderingContext.TEXTURE_BINDING_2D").intValue();

    int TEXTURE_BINDING_CUBE_MAP = JsEnum.from("return WebGLRenderingContext.TEXTURE_BINDING_CUBE_MAP").intValue();

    int TEXTURE_CUBE_MAP = JsEnum.from("return WebGLRenderingContext.TEXTURE_CUBE_MAP").intValue();

    int TEXTURE_CUBE_MAP_NEGATIVE_X = JsEnum.from("return WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_X").intValue();

    int TEXTURE_CUBE_MAP_NEGATIVE_Y = JsEnum.from("return WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Y").intValue();

    int TEXTURE_CUBE_MAP_NEGATIVE_Z = JsEnum.from("return WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Z").intValue();

    int TEXTURE_CUBE_MAP_POSITIVE_X = JsEnum.from("return WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_X").intValue();

    int TEXTURE_CUBE_MAP_POSITIVE_Y = JsEnum.from("return WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Y").intValue();

    int TEXTURE_CUBE_MAP_POSITIVE_Z = JsEnum.from("return WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Z").intValue();

    int TEXTURE_MAG_FILTER = JsEnum.from("return WebGLRenderingContext.TEXTURE_MAG_FILTER").intValue();

    int TEXTURE_MIN_FILTER = JsEnum.from("return WebGLRenderingContext.TEXTURE_MIN_FILTER").intValue();

    int TEXTURE_WRAP_S = JsEnum.from("return WebGLRenderingContext.TEXTURE_WRAP_S").intValue();

    int TEXTURE_WRAP_T = JsEnum.from("return WebGLRenderingContext.TEXTURE_WRAP_T").intValue();

    int TRIANGLES = JsEnum.from("return WebGLRenderingContext.TRIANGLES").intValue();

    int TRIANGLE_FAN = JsEnum.from("return WebGLRenderingContext.TRIANGLE_FAN").intValue();

    int TRIANGLE_STRIP = JsEnum.from("return WebGLRenderingContext.TRIANGLE_STRIP").intValue();

    int UNPACK_ALIGNMENT = JsEnum.from("return WebGLRenderingContext.UNPACK_ALIGNMENT").intValue();

    int UNPACK_COLORSPACE_CONVERSION_WEBGL = JsEnum.from("return WebGLRenderingContext.UNPACK_COLORSPACE_CONVERSION_WEBGL").intValue();

    int UNPACK_FLIP_Y_WEBGL = JsEnum.from("return WebGLRenderingContext.UNPACK_FLIP_Y_WEBGL").intValue();

    int UNPACK_PREMULTIPLY_ALPHA_WEBGL = JsEnum.from("return WebGLRenderingContext.UNPACK_PREMULTIPLY_ALPHA_WEBGL").intValue();

    int UNSIGNED_BYTE = JsEnum.from("return WebGLRenderingContext.UNSIGNED_BYTE").intValue();

    int UNSIGNED_INT = JsEnum.from("return WebGLRenderingContext.UNSIGNED_INT").intValue();

    int UNSIGNED_SHORT = JsEnum.from("return WebGLRenderingContext.UNSIGNED_SHORT").intValue();

    int UNSIGNED_SHORT_4_4_4_4 = JsEnum.from("return WebGLRenderingContext.UNSIGNED_SHORT_4_4_4_4").intValue();

    int UNSIGNED_SHORT_5_5_5_1 = JsEnum.from("return WebGLRenderingContext.UNSIGNED_SHORT_5_5_5_1").intValue();

    int UNSIGNED_SHORT_5_6_5 = JsEnum.from("return WebGLRenderingContext.UNSIGNED_SHORT_5_6_5").intValue();

    int VALIDATE_STATUS = JsEnum.from("return WebGLRenderingContext.VALIDATE_STATUS").intValue();

    int VENDOR = JsEnum.from("return WebGLRenderingContext.VENDOR").intValue();

    int VERSION = JsEnum.from("return WebGLRenderingContext.VERSION").intValue();

    int VERTEX_ATTRIB_ARRAY_BUFFER_BINDING = JsEnum.from("return WebGLRenderingContext.VERTEX_ATTRIB_ARRAY_BUFFER_BINDING").intValue();

    int VERTEX_ATTRIB_ARRAY_ENABLED = JsEnum.from("return WebGLRenderingContext.VERTEX_ATTRIB_ARRAY_ENABLED").intValue();

    int VERTEX_ATTRIB_ARRAY_NORMALIZED = JsEnum.from("return WebGLRenderingContext.VERTEX_ATTRIB_ARRAY_NORMALIZED").intValue();

    int VERTEX_ATTRIB_ARRAY_POINTER = JsEnum.from("return WebGLRenderingContext.VERTEX_ATTRIB_ARRAY_POINTER").intValue();

    int VERTEX_ATTRIB_ARRAY_SIZE = JsEnum.from("return WebGLRenderingContext.VERTEX_ATTRIB_ARRAY_SIZE").intValue();

    int VERTEX_ATTRIB_ARRAY_STRIDE = JsEnum.from("return WebGLRenderingContext.VERTEX_ATTRIB_ARRAY_STRIDE").intValue();

    int VERTEX_ATTRIB_ARRAY_TYPE = JsEnum.from("return WebGLRenderingContext.VERTEX_ATTRIB_ARRAY_TYPE").intValue();

    int VERTEX_SHADER = JsEnum.from("return WebGLRenderingContext.VERTEX_SHADER").intValue();

    int VIEWPORT = JsEnum.from("return WebGLRenderingContext.VIEWPORT").intValue();

    int ZERO = JsEnum.from("return WebGLRenderingContext.ZERO").intValue();

    @JSBody(script = "return WebGLRenderingContext.prototype")
    static WebGLRenderingContext prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new WebGLRenderingContext()")
    static WebGLRenderingContext create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
