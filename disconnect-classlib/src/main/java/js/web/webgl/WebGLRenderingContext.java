package js.web.webgl;

import js.extras.JsEnum;
import js.web.canvas.OffscreenRenderingContext;
import js.web.canvas.RenderingContext;
import org.teavm.jso.JSBody;

/**
 * Provides an interface to the OpenGL ES 2.0 graphics rendering context for the drawing surface of an HTML &lt;canvas&gt; element.
 */
public interface WebGLRenderingContext extends WebGLRenderingContextBase, WebGLRenderingContextOverloads, RenderingContext, OffscreenRenderingContext {
    int ACTIVE_TEXTURE = JsEnum.from("WebGLRenderingContext.ACTIVE_TEXTURE").intValue();

    int ACTIVE_UNIFORMS = JsEnum.from("WebGLRenderingContext.ACTIVE_UNIFORMS").intValue();

    int ALIASED_LINE_WIDTH_RANGE = JsEnum.from("WebGLRenderingContext.ALIASED_LINE_WIDTH_RANGE").intValue();

    int ALIASED_POINT_SIZE_RANGE = JsEnum.from("WebGLRenderingContext.ALIASED_POINT_SIZE_RANGE").intValue();

    int ALPHA = JsEnum.from("WebGLRenderingContext.ALPHA").intValue();

    int ALPHA_BITS = JsEnum.from("WebGLRenderingContext.ALPHA_BITS").intValue();

    int ALWAYS = JsEnum.from("WebGLRenderingContext.ALWAYS").intValue();

    int ARRAY_BUFFER = JsEnum.from("WebGLRenderingContext.ARRAY_BUFFER").intValue();

    int ARRAY_BUFFER_BINDING = JsEnum.from("WebGLRenderingContext.ARRAY_BUFFER_BINDING").intValue();

    int ATTACHED_SHADERS = JsEnum.from("WebGLRenderingContext.ATTACHED_SHADERS").intValue();

    int BACK = JsEnum.from("WebGLRenderingContext.BACK").intValue();

    int BLEND = JsEnum.from("WebGLRenderingContext.BLEND").intValue();

    int BLEND_COLOR = JsEnum.from("WebGLRenderingContext.BLEND_COLOR").intValue();

    int BLEND_DST_ALPHA = JsEnum.from("WebGLRenderingContext.BLEND_DST_ALPHA").intValue();

    int BLEND_DST_RGB = JsEnum.from("WebGLRenderingContext.BLEND_DST_RGB").intValue();

    int BLEND_EQUATION = JsEnum.from("WebGLRenderingContext.BLEND_EQUATION").intValue();

    int BLEND_EQUATION_ALPHA = JsEnum.from("WebGLRenderingContext.BLEND_EQUATION_ALPHA").intValue();

    int BLEND_EQUATION_RGB = JsEnum.from("WebGLRenderingContext.BLEND_EQUATION_RGB").intValue();

    int BLEND_SRC_ALPHA = JsEnum.from("WebGLRenderingContext.BLEND_SRC_ALPHA").intValue();

    int BLEND_SRC_RGB = JsEnum.from("WebGLRenderingContext.BLEND_SRC_RGB").intValue();

    int BLUE_BITS = JsEnum.from("WebGLRenderingContext.BLUE_BITS").intValue();

    int BOOL = JsEnum.from("WebGLRenderingContext.BOOL").intValue();

    int BOOL_VEC2 = JsEnum.from("WebGLRenderingContext.BOOL_VEC2").intValue();

    int BOOL_VEC3 = JsEnum.from("WebGLRenderingContext.BOOL_VEC3").intValue();

    int BOOL_VEC4 = JsEnum.from("WebGLRenderingContext.BOOL_VEC4").intValue();

    int BROWSER_DEFAULT_WEBGL = JsEnum.from("WebGLRenderingContext.BROWSER_DEFAULT_WEBGL").intValue();

    int BUFFER_SIZE = JsEnum.from("WebGLRenderingContext.BUFFER_SIZE").intValue();

    int BUFFER_USAGE = JsEnum.from("WebGLRenderingContext.BUFFER_USAGE").intValue();

    int BYTE = JsEnum.from("WebGLRenderingContext.BYTE").intValue();

    int CCW = JsEnum.from("WebGLRenderingContext.CCW").intValue();

    int CLAMP_TO_EDGE = JsEnum.from("WebGLRenderingContext.CLAMP_TO_EDGE").intValue();

    int COLOR_ATTACHMENT0 = JsEnum.from("WebGLRenderingContext.COLOR_ATTACHMENT0").intValue();

    int COLOR_BUFFER_BIT = JsEnum.from("WebGLRenderingContext.COLOR_BUFFER_BIT").intValue();

    int COLOR_CLEAR_VALUE = JsEnum.from("WebGLRenderingContext.COLOR_CLEAR_VALUE").intValue();

    int COLOR_WRITEMASK = JsEnum.from("WebGLRenderingContext.COLOR_WRITEMASK").intValue();

    int COMPILE_STATUS = JsEnum.from("WebGLRenderingContext.COMPILE_STATUS").intValue();

    int COMPRESSED_TEXTURE_FORMATS = JsEnum.from("WebGLRenderingContext.COMPRESSED_TEXTURE_FORMATS").intValue();

    int CONSTANT_ALPHA = JsEnum.from("WebGLRenderingContext.CONSTANT_ALPHA").intValue();

    int CONSTANT_COLOR = JsEnum.from("WebGLRenderingContext.CONSTANT_COLOR").intValue();

    int CONTEXT_LOST_WEBGL = JsEnum.from("WebGLRenderingContext.CONTEXT_LOST_WEBGL").intValue();

    int CULL_FACE = JsEnum.from("WebGLRenderingContext.CULL_FACE").intValue();

    int CULL_FACE_MODE = JsEnum.from("WebGLRenderingContext.CULL_FACE_MODE").intValue();

    int CURRENT_PROGRAM = JsEnum.from("WebGLRenderingContext.CURRENT_PROGRAM").intValue();

    int CURRENT_VERTEX_ATTRIB = JsEnum.from("WebGLRenderingContext.CURRENT_VERTEX_ATTRIB").intValue();

    int CW = JsEnum.from("WebGLRenderingContext.CW").intValue();

    int DECR = JsEnum.from("WebGLRenderingContext.DECR").intValue();

    int DECR_WRAP = JsEnum.from("WebGLRenderingContext.DECR_WRAP").intValue();

    int DELETE_STATUS = JsEnum.from("WebGLRenderingContext.DELETE_STATUS").intValue();

    int DEPTH_ATTACHMENT = JsEnum.from("WebGLRenderingContext.DEPTH_ATTACHMENT").intValue();

    int DEPTH_BITS = JsEnum.from("WebGLRenderingContext.DEPTH_BITS").intValue();

    int DEPTH_BUFFER_BIT = JsEnum.from("WebGLRenderingContext.DEPTH_BUFFER_BIT").intValue();

    int DEPTH_CLEAR_VALUE = JsEnum.from("WebGLRenderingContext.DEPTH_CLEAR_VALUE").intValue();

    int DEPTH_COMPONENT = JsEnum.from("WebGLRenderingContext.DEPTH_COMPONENT").intValue();

    int DEPTH_COMPONENT16 = JsEnum.from("WebGLRenderingContext.DEPTH_COMPONENT16").intValue();

    int DEPTH_FUNC = JsEnum.from("WebGLRenderingContext.DEPTH_FUNC").intValue();

    int DEPTH_RANGE = JsEnum.from("WebGLRenderingContext.DEPTH_RANGE").intValue();

    int DEPTH_STENCIL = JsEnum.from("WebGLRenderingContext.DEPTH_STENCIL").intValue();

    int DEPTH_STENCIL_ATTACHMENT = JsEnum.from("WebGLRenderingContext.DEPTH_STENCIL_ATTACHMENT").intValue();

    int DEPTH_TEST = JsEnum.from("WebGLRenderingContext.DEPTH_TEST").intValue();

    int DEPTH_WRITEMASK = JsEnum.from("WebGLRenderingContext.DEPTH_WRITEMASK").intValue();

    int DITHER = JsEnum.from("WebGLRenderingContext.DITHER").intValue();

    int DONT_CARE = JsEnum.from("WebGLRenderingContext.DONT_CARE").intValue();

    int DST_ALPHA = JsEnum.from("WebGLRenderingContext.DST_ALPHA").intValue();

    int DST_COLOR = JsEnum.from("WebGLRenderingContext.DST_COLOR").intValue();

    int DYNAMIC_DRAW = JsEnum.from("WebGLRenderingContext.DYNAMIC_DRAW").intValue();

    int ELEMENT_ARRAY_BUFFER = JsEnum.from("WebGLRenderingContext.ELEMENT_ARRAY_BUFFER").intValue();

    int ELEMENT_ARRAY_BUFFER_BINDING = JsEnum.from("WebGLRenderingContext.ELEMENT_ARRAY_BUFFER_BINDING").intValue();

    int EQUAL = JsEnum.from("WebGLRenderingContext.EQUAL").intValue();

    int FASTEST = JsEnum.from("WebGLRenderingContext.FASTEST").intValue();

    int FLOAT = JsEnum.from("WebGLRenderingContext.FLOAT").intValue();

    int FLOAT_MAT2 = JsEnum.from("WebGLRenderingContext.FLOAT_MAT2").intValue();

    int FLOAT_MAT3 = JsEnum.from("WebGLRenderingContext.FLOAT_MAT3").intValue();

    int FLOAT_MAT4 = JsEnum.from("WebGLRenderingContext.FLOAT_MAT4").intValue();

    int FLOAT_VEC2 = JsEnum.from("WebGLRenderingContext.FLOAT_VEC2").intValue();

    int FLOAT_VEC3 = JsEnum.from("WebGLRenderingContext.FLOAT_VEC3").intValue();

    int FLOAT_VEC4 = JsEnum.from("WebGLRenderingContext.FLOAT_VEC4").intValue();

    int FRAGMENT_SHADER = JsEnum.from("WebGLRenderingContext.FRAGMENT_SHADER").intValue();

    int FRAMEBUFFER = JsEnum.from("WebGLRenderingContext.FRAMEBUFFER").intValue();

    int FRAMEBUFFER_ATTACHMENT_OBJECT_NAME = JsEnum.from("WebGLRenderingContext.FRAMEBUFFER_ATTACHMENT_OBJECT_NAME").intValue();

    int FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE = JsEnum.from("WebGLRenderingContext.FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE").intValue();

    int FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE = JsEnum.from("WebGLRenderingContext.FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE").intValue();

    int FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL = JsEnum.from("WebGLRenderingContext.FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL").intValue();

    int FRAMEBUFFER_BINDING = JsEnum.from("WebGLRenderingContext.FRAMEBUFFER_BINDING").intValue();

    int FRAMEBUFFER_COMPLETE = JsEnum.from("WebGLRenderingContext.FRAMEBUFFER_COMPLETE").intValue();

    int FRAMEBUFFER_INCOMPLETE_ATTACHMENT = JsEnum.from("WebGLRenderingContext.FRAMEBUFFER_INCOMPLETE_ATTACHMENT").intValue();

    int FRAMEBUFFER_INCOMPLETE_DIMENSIONS = JsEnum.from("WebGLRenderingContext.FRAMEBUFFER_INCOMPLETE_DIMENSIONS").intValue();

    int FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT = JsEnum.from("WebGLRenderingContext.FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT").intValue();

    int FRAMEBUFFER_UNSUPPORTED = JsEnum.from("WebGLRenderingContext.FRAMEBUFFER_UNSUPPORTED").intValue();

    int FRONT = JsEnum.from("WebGLRenderingContext.FRONT").intValue();

    int FRONT_AND_BACK = JsEnum.from("WebGLRenderingContext.FRONT_AND_BACK").intValue();

    int FRONT_FACE = JsEnum.from("WebGLRenderingContext.FRONT_FACE").intValue();

    int FUNC_ADD = JsEnum.from("WebGLRenderingContext.FUNC_ADD").intValue();

    int FUNC_REVERSE_SUBTRACT = JsEnum.from("WebGLRenderingContext.FUNC_REVERSE_SUBTRACT").intValue();

    int FUNC_SUBTRACT = JsEnum.from("WebGLRenderingContext.FUNC_SUBTRACT").intValue();

    int GENERATE_MIPMAP_HINT = JsEnum.from("WebGLRenderingContext.GENERATE_MIPMAP_HINT").intValue();

    int GEQUAL = JsEnum.from("WebGLRenderingContext.GEQUAL").intValue();

    int GREATER = JsEnum.from("WebGLRenderingContext.GREATER").intValue();

    int GREEN_BITS = JsEnum.from("WebGLRenderingContext.GREEN_BITS").intValue();

    int HIGH_FLOAT = JsEnum.from("WebGLRenderingContext.HIGH_FLOAT").intValue();

    int HIGH_INT = JsEnum.from("WebGLRenderingContext.HIGH_INT").intValue();

    int IMPLEMENTATION_COLOR_READ_FORMAT = JsEnum.from("WebGLRenderingContext.IMPLEMENTATION_COLOR_READ_FORMAT").intValue();

    int IMPLEMENTATION_COLOR_READ_TYPE = JsEnum.from("WebGLRenderingContext.IMPLEMENTATION_COLOR_READ_TYPE").intValue();

    int INCR = JsEnum.from("WebGLRenderingContext.INCR").intValue();

    int INCR_WRAP = JsEnum.from("WebGLRenderingContext.INCR_WRAP").intValue();

    int INT = JsEnum.from("WebGLRenderingContext.INT").intValue();

    int INT_VEC2 = JsEnum.from("WebGLRenderingContext.INT_VEC2").intValue();

    int INT_VEC3 = JsEnum.from("WebGLRenderingContext.INT_VEC3").intValue();

    int INT_VEC4 = JsEnum.from("WebGLRenderingContext.INT_VEC4").intValue();

    int INVALID_ENUM = JsEnum.from("WebGLRenderingContext.INVALID_ENUM").intValue();

    int INVALID_FRAMEBUFFER_OPERATION = JsEnum.from("WebGLRenderingContext.INVALID_FRAMEBUFFER_OPERATION").intValue();

    int INVALID_OPERATION = JsEnum.from("WebGLRenderingContext.INVALID_OPERATION").intValue();

    int INVALID_VALUE = JsEnum.from("WebGLRenderingContext.INVALID_VALUE").intValue();

    int INVERT = JsEnum.from("WebGLRenderingContext.INVERT").intValue();

    int KEEP = JsEnum.from("WebGLRenderingContext.KEEP").intValue();

    int LEQUAL = JsEnum.from("WebGLRenderingContext.LEQUAL").intValue();

    int LESS = JsEnum.from("WebGLRenderingContext.LESS").intValue();

    int LINEAR = JsEnum.from("WebGLRenderingContext.LINEAR").intValue();

    int LINEAR_MIPMAP_LINEAR = JsEnum.from("WebGLRenderingContext.LINEAR_MIPMAP_LINEAR").intValue();

    int LINEAR_MIPMAP_NEAREST = JsEnum.from("WebGLRenderingContext.LINEAR_MIPMAP_NEAREST").intValue();

    int LINES = JsEnum.from("WebGLRenderingContext.LINES").intValue();

    int LINE_LOOP = JsEnum.from("WebGLRenderingContext.LINE_LOOP").intValue();

    int LINE_STRIP = JsEnum.from("WebGLRenderingContext.LINE_STRIP").intValue();

    int LINE_WIDTH = JsEnum.from("WebGLRenderingContext.LINE_WIDTH").intValue();

    int LINK_STATUS = JsEnum.from("WebGLRenderingContext.LINK_STATUS").intValue();

    int LOW_FLOAT = JsEnum.from("WebGLRenderingContext.LOW_FLOAT").intValue();

    int LOW_INT = JsEnum.from("WebGLRenderingContext.LOW_INT").intValue();

    int LUMINANCE = JsEnum.from("WebGLRenderingContext.LUMINANCE").intValue();

    int LUMINANCE_ALPHA = JsEnum.from("WebGLRenderingContext.LUMINANCE_ALPHA").intValue();

    int MAX_COMBINED_TEXTURE_IMAGE_UNITS = JsEnum.from("WebGLRenderingContext.MAX_COMBINED_TEXTURE_IMAGE_UNITS").intValue();

    int MAX_CUBE_MAP_TEXTURE_SIZE = JsEnum.from("WebGLRenderingContext.MAX_CUBE_MAP_TEXTURE_SIZE").intValue();

    int MAX_FRAGMENT_UNIFORM_VECTORS = JsEnum.from("WebGLRenderingContext.MAX_FRAGMENT_UNIFORM_VECTORS").intValue();

    int MAX_RENDERBUFFER_SIZE = JsEnum.from("WebGLRenderingContext.MAX_RENDERBUFFER_SIZE").intValue();

    int MAX_TEXTURE_IMAGE_UNITS = JsEnum.from("WebGLRenderingContext.MAX_TEXTURE_IMAGE_UNITS").intValue();

    int MAX_TEXTURE_SIZE = JsEnum.from("WebGLRenderingContext.MAX_TEXTURE_SIZE").intValue();

    int MAX_VARYING_VECTORS = JsEnum.from("WebGLRenderingContext.MAX_VARYING_VECTORS").intValue();

    int MAX_VERTEX_ATTRIBS = JsEnum.from("WebGLRenderingContext.MAX_VERTEX_ATTRIBS").intValue();

    int MAX_VERTEX_TEXTURE_IMAGE_UNITS = JsEnum.from("WebGLRenderingContext.MAX_VERTEX_TEXTURE_IMAGE_UNITS").intValue();

    int MAX_VERTEX_UNIFORM_VECTORS = JsEnum.from("WebGLRenderingContext.MAX_VERTEX_UNIFORM_VECTORS").intValue();

    int MAX_VIEWPORT_DIMS = JsEnum.from("WebGLRenderingContext.MAX_VIEWPORT_DIMS").intValue();

    int MEDIUM_FLOAT = JsEnum.from("WebGLRenderingContext.MEDIUM_FLOAT").intValue();

    int MEDIUM_INT = JsEnum.from("WebGLRenderingContext.MEDIUM_INT").intValue();

    int MIRRORED_REPEAT = JsEnum.from("WebGLRenderingContext.MIRRORED_REPEAT").intValue();

    int NEAREST = JsEnum.from("WebGLRenderingContext.NEAREST").intValue();

    int NEAREST_MIPMAP_LINEAR = JsEnum.from("WebGLRenderingContext.NEAREST_MIPMAP_LINEAR").intValue();

    int NEAREST_MIPMAP_NEAREST = JsEnum.from("WebGLRenderingContext.NEAREST_MIPMAP_NEAREST").intValue();

    int NEVER = JsEnum.from("WebGLRenderingContext.NEVER").intValue();

    int NICEST = JsEnum.from("WebGLRenderingContext.NICEST").intValue();

    int NONE = JsEnum.from("WebGLRenderingContext.NONE").intValue();

    int NOTEQUAL = JsEnum.from("WebGLRenderingContext.NOTEQUAL").intValue();

    int NO_ERROR = JsEnum.from("WebGLRenderingContext.NO_ERROR").intValue();

    int ONE = JsEnum.from("WebGLRenderingContext.ONE").intValue();

    int ONE_MINUS_CONSTANT_ALPHA = JsEnum.from("WebGLRenderingContext.ONE_MINUS_CONSTANT_ALPHA").intValue();

    int ONE_MINUS_CONSTANT_COLOR = JsEnum.from("WebGLRenderingContext.ONE_MINUS_CONSTANT_COLOR").intValue();

    int ONE_MINUS_DST_ALPHA = JsEnum.from("WebGLRenderingContext.ONE_MINUS_DST_ALPHA").intValue();

    int ONE_MINUS_DST_COLOR = JsEnum.from("WebGLRenderingContext.ONE_MINUS_DST_COLOR").intValue();

    int ONE_MINUS_SRC_ALPHA = JsEnum.from("WebGLRenderingContext.ONE_MINUS_SRC_ALPHA").intValue();

    int ONE_MINUS_SRC_COLOR = JsEnum.from("WebGLRenderingContext.ONE_MINUS_SRC_COLOR").intValue();

    int OUT_OF_MEMORY = JsEnum.from("WebGLRenderingContext.OUT_OF_MEMORY").intValue();

    int PACK_ALIGNMENT = JsEnum.from("WebGLRenderingContext.PACK_ALIGNMENT").intValue();

    int POINTS = JsEnum.from("WebGLRenderingContext.POINTS").intValue();

    int POLYGON_OFFSET_FACTOR = JsEnum.from("WebGLRenderingContext.POLYGON_OFFSET_FACTOR").intValue();

    int POLYGON_OFFSET_FILL = JsEnum.from("WebGLRenderingContext.POLYGON_OFFSET_FILL").intValue();

    int POLYGON_OFFSET_UNITS = JsEnum.from("WebGLRenderingContext.POLYGON_OFFSET_UNITS").intValue();

    int RED_BITS = JsEnum.from("WebGLRenderingContext.RED_BITS").intValue();

    int RENDERBUFFER = JsEnum.from("WebGLRenderingContext.RENDERBUFFER").intValue();

    int RENDERBUFFER_ALPHA_SIZE = JsEnum.from("WebGLRenderingContext.RENDERBUFFER_ALPHA_SIZE").intValue();

    int RENDERBUFFER_BINDING = JsEnum.from("WebGLRenderingContext.RENDERBUFFER_BINDING").intValue();

    int RENDERBUFFER_BLUE_SIZE = JsEnum.from("WebGLRenderingContext.RENDERBUFFER_BLUE_SIZE").intValue();

    int RENDERBUFFER_DEPTH_SIZE = JsEnum.from("WebGLRenderingContext.RENDERBUFFER_DEPTH_SIZE").intValue();

    int RENDERBUFFER_GREEN_SIZE = JsEnum.from("WebGLRenderingContext.RENDERBUFFER_GREEN_SIZE").intValue();

    int RENDERBUFFER_HEIGHT = JsEnum.from("WebGLRenderingContext.RENDERBUFFER_HEIGHT").intValue();

    int RENDERBUFFER_INTERNAL_FORMAT = JsEnum.from("WebGLRenderingContext.RENDERBUFFER_INTERNAL_FORMAT").intValue();

    int RENDERBUFFER_RED_SIZE = JsEnum.from("WebGLRenderingContext.RENDERBUFFER_RED_SIZE").intValue();

    int RENDERBUFFER_STENCIL_SIZE = JsEnum.from("WebGLRenderingContext.RENDERBUFFER_STENCIL_SIZE").intValue();

    int RENDERBUFFER_WIDTH = JsEnum.from("WebGLRenderingContext.RENDERBUFFER_WIDTH").intValue();

    int RENDERER = JsEnum.from("WebGLRenderingContext.RENDERER").intValue();

    int REPEAT = JsEnum.from("WebGLRenderingContext.REPEAT").intValue();

    int REPLACE = JsEnum.from("WebGLRenderingContext.REPLACE").intValue();

    int RGB = JsEnum.from("WebGLRenderingContext.RGB").intValue();

    int RGB565 = JsEnum.from("WebGLRenderingContext.RGB565").intValue();

    int RGB5_A1 = JsEnum.from("WebGLRenderingContext.RGB5_A1").intValue();

    int RGBA = JsEnum.from("WebGLRenderingContext.RGBA").intValue();

    int RGBA4 = JsEnum.from("WebGLRenderingContext.RGBA4").intValue();

    int SAMPLER_2D = JsEnum.from("WebGLRenderingContext.SAMPLER_2D").intValue();

    int SAMPLER_CUBE = JsEnum.from("WebGLRenderingContext.SAMPLER_CUBE").intValue();

    int SAMPLES = JsEnum.from("WebGLRenderingContext.SAMPLES").intValue();

    int SAMPLE_ALPHA_TO_COVERAGE = JsEnum.from("WebGLRenderingContext.SAMPLE_ALPHA_TO_COVERAGE").intValue();

    int SAMPLE_BUFFERS = JsEnum.from("WebGLRenderingContext.SAMPLE_BUFFERS").intValue();

    int SAMPLE_COVERAGE = JsEnum.from("WebGLRenderingContext.SAMPLE_COVERAGE").intValue();

    int SAMPLE_COVERAGE_INVERT = JsEnum.from("WebGLRenderingContext.SAMPLE_COVERAGE_INVERT").intValue();

    int SAMPLE_COVERAGE_VALUE = JsEnum.from("WebGLRenderingContext.SAMPLE_COVERAGE_VALUE").intValue();

    int SCISSOR_BOX = JsEnum.from("WebGLRenderingContext.SCISSOR_BOX").intValue();

    int SCISSOR_TEST = JsEnum.from("WebGLRenderingContext.SCISSOR_TEST").intValue();

    int SHADER_TYPE = JsEnum.from("WebGLRenderingContext.SHADER_TYPE").intValue();

    int SHADING_LANGUAGE_VERSION = JsEnum.from("WebGLRenderingContext.SHADING_LANGUAGE_VERSION").intValue();

    int SHORT = JsEnum.from("WebGLRenderingContext.SHORT").intValue();

    int SRC_ALPHA = JsEnum.from("WebGLRenderingContext.SRC_ALPHA").intValue();

    int SRC_ALPHA_SATURATE = JsEnum.from("WebGLRenderingContext.SRC_ALPHA_SATURATE").intValue();

    int SRC_COLOR = JsEnum.from("WebGLRenderingContext.SRC_COLOR").intValue();

    int STATIC_DRAW = JsEnum.from("WebGLRenderingContext.STATIC_DRAW").intValue();

    int STENCIL_ATTACHMENT = JsEnum.from("WebGLRenderingContext.STENCIL_ATTACHMENT").intValue();

    int STENCIL_BACK_FAIL = JsEnum.from("WebGLRenderingContext.STENCIL_BACK_FAIL").intValue();

    int STENCIL_BACK_FUNC = JsEnum.from("WebGLRenderingContext.STENCIL_BACK_FUNC").intValue();

    int STENCIL_BACK_PASS_DEPTH_FAIL = JsEnum.from("WebGLRenderingContext.STENCIL_BACK_PASS_DEPTH_FAIL").intValue();

    int STENCIL_BACK_PASS_DEPTH_PASS = JsEnum.from("WebGLRenderingContext.STENCIL_BACK_PASS_DEPTH_PASS").intValue();

    int STENCIL_BACK_REF = JsEnum.from("WebGLRenderingContext.STENCIL_BACK_REF").intValue();

    int STENCIL_BACK_VALUE_MASK = JsEnum.from("WebGLRenderingContext.STENCIL_BACK_VALUE_MASK").intValue();

    int STENCIL_BACK_WRITEMASK = JsEnum.from("WebGLRenderingContext.STENCIL_BACK_WRITEMASK").intValue();

    int STENCIL_BITS = JsEnum.from("WebGLRenderingContext.STENCIL_BITS").intValue();

    int STENCIL_BUFFER_BIT = JsEnum.from("WebGLRenderingContext.STENCIL_BUFFER_BIT").intValue();

    int STENCIL_CLEAR_VALUE = JsEnum.from("WebGLRenderingContext.STENCIL_CLEAR_VALUE").intValue();

    int STENCIL_FAIL = JsEnum.from("WebGLRenderingContext.STENCIL_FAIL").intValue();

    int STENCIL_FUNC = JsEnum.from("WebGLRenderingContext.STENCIL_FUNC").intValue();

    int STENCIL_INDEX8 = JsEnum.from("WebGLRenderingContext.STENCIL_INDEX8").intValue();

    int STENCIL_PASS_DEPTH_FAIL = JsEnum.from("WebGLRenderingContext.STENCIL_PASS_DEPTH_FAIL").intValue();

    int STENCIL_PASS_DEPTH_PASS = JsEnum.from("WebGLRenderingContext.STENCIL_PASS_DEPTH_PASS").intValue();

    int STENCIL_REF = JsEnum.from("WebGLRenderingContext.STENCIL_REF").intValue();

    int STENCIL_TEST = JsEnum.from("WebGLRenderingContext.STENCIL_TEST").intValue();

    int STENCIL_VALUE_MASK = JsEnum.from("WebGLRenderingContext.STENCIL_VALUE_MASK").intValue();

    int STENCIL_WRITEMASK = JsEnum.from("WebGLRenderingContext.STENCIL_WRITEMASK").intValue();

    int STREAM_DRAW = JsEnum.from("WebGLRenderingContext.STREAM_DRAW").intValue();

    int SUBPIXEL_BITS = JsEnum.from("WebGLRenderingContext.SUBPIXEL_BITS").intValue();

    int TEXTURE = JsEnum.from("WebGLRenderingContext.TEXTURE").intValue();

    int TEXTURE0 = JsEnum.from("WebGLRenderingContext.TEXTURE0").intValue();

    int TEXTURE1 = JsEnum.from("WebGLRenderingContext.TEXTURE1").intValue();

    int TEXTURE10 = JsEnum.from("WebGLRenderingContext.TEXTURE10").intValue();

    int TEXTURE11 = JsEnum.from("WebGLRenderingContext.TEXTURE11").intValue();

    int TEXTURE12 = JsEnum.from("WebGLRenderingContext.TEXTURE12").intValue();

    int TEXTURE13 = JsEnum.from("WebGLRenderingContext.TEXTURE13").intValue();

    int TEXTURE14 = JsEnum.from("WebGLRenderingContext.TEXTURE14").intValue();

    int TEXTURE15 = JsEnum.from("WebGLRenderingContext.TEXTURE15").intValue();

    int TEXTURE16 = JsEnum.from("WebGLRenderingContext.TEXTURE16").intValue();

    int TEXTURE17 = JsEnum.from("WebGLRenderingContext.TEXTURE17").intValue();

    int TEXTURE18 = JsEnum.from("WebGLRenderingContext.TEXTURE18").intValue();

    int TEXTURE19 = JsEnum.from("WebGLRenderingContext.TEXTURE19").intValue();

    int TEXTURE2 = JsEnum.from("WebGLRenderingContext.TEXTURE2").intValue();

    int TEXTURE20 = JsEnum.from("WebGLRenderingContext.TEXTURE20").intValue();

    int TEXTURE21 = JsEnum.from("WebGLRenderingContext.TEXTURE21").intValue();

    int TEXTURE22 = JsEnum.from("WebGLRenderingContext.TEXTURE22").intValue();

    int TEXTURE23 = JsEnum.from("WebGLRenderingContext.TEXTURE23").intValue();

    int TEXTURE24 = JsEnum.from("WebGLRenderingContext.TEXTURE24").intValue();

    int TEXTURE25 = JsEnum.from("WebGLRenderingContext.TEXTURE25").intValue();

    int TEXTURE26 = JsEnum.from("WebGLRenderingContext.TEXTURE26").intValue();

    int TEXTURE27 = JsEnum.from("WebGLRenderingContext.TEXTURE27").intValue();

    int TEXTURE28 = JsEnum.from("WebGLRenderingContext.TEXTURE28").intValue();

    int TEXTURE29 = JsEnum.from("WebGLRenderingContext.TEXTURE29").intValue();

    int TEXTURE3 = JsEnum.from("WebGLRenderingContext.TEXTURE3").intValue();

    int TEXTURE30 = JsEnum.from("WebGLRenderingContext.TEXTURE30").intValue();

    int TEXTURE31 = JsEnum.from("WebGLRenderingContext.TEXTURE31").intValue();

    int TEXTURE4 = JsEnum.from("WebGLRenderingContext.TEXTURE4").intValue();

    int TEXTURE5 = JsEnum.from("WebGLRenderingContext.TEXTURE5").intValue();

    int TEXTURE6 = JsEnum.from("WebGLRenderingContext.TEXTURE6").intValue();

    int TEXTURE7 = JsEnum.from("WebGLRenderingContext.TEXTURE7").intValue();

    int TEXTURE8 = JsEnum.from("WebGLRenderingContext.TEXTURE8").intValue();

    int TEXTURE9 = JsEnum.from("WebGLRenderingContext.TEXTURE9").intValue();

    int TEXTURE_2D = JsEnum.from("WebGLRenderingContext.TEXTURE_2D").intValue();

    int TEXTURE_BINDING_2D = JsEnum.from("WebGLRenderingContext.TEXTURE_BINDING_2D").intValue();

    int TEXTURE_BINDING_CUBE_MAP = JsEnum.from("WebGLRenderingContext.TEXTURE_BINDING_CUBE_MAP").intValue();

    int TEXTURE_CUBE_MAP = JsEnum.from("WebGLRenderingContext.TEXTURE_CUBE_MAP").intValue();

    int TEXTURE_CUBE_MAP_NEGATIVE_X = JsEnum.from("WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_X").intValue();

    int TEXTURE_CUBE_MAP_NEGATIVE_Y = JsEnum.from("WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Y").intValue();

    int TEXTURE_CUBE_MAP_NEGATIVE_Z = JsEnum.from("WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Z").intValue();

    int TEXTURE_CUBE_MAP_POSITIVE_X = JsEnum.from("WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_X").intValue();

    int TEXTURE_CUBE_MAP_POSITIVE_Y = JsEnum.from("WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Y").intValue();

    int TEXTURE_CUBE_MAP_POSITIVE_Z = JsEnum.from("WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Z").intValue();

    int TEXTURE_MAG_FILTER = JsEnum.from("WebGLRenderingContext.TEXTURE_MAG_FILTER").intValue();

    int TEXTURE_MIN_FILTER = JsEnum.from("WebGLRenderingContext.TEXTURE_MIN_FILTER").intValue();

    int TEXTURE_WRAP_S = JsEnum.from("WebGLRenderingContext.TEXTURE_WRAP_S").intValue();

    int TEXTURE_WRAP_T = JsEnum.from("WebGLRenderingContext.TEXTURE_WRAP_T").intValue();

    int TRIANGLES = JsEnum.from("WebGLRenderingContext.TRIANGLES").intValue();

    int TRIANGLE_FAN = JsEnum.from("WebGLRenderingContext.TRIANGLE_FAN").intValue();

    int TRIANGLE_STRIP = JsEnum.from("WebGLRenderingContext.TRIANGLE_STRIP").intValue();

    int UNPACK_ALIGNMENT = JsEnum.from("WebGLRenderingContext.UNPACK_ALIGNMENT").intValue();

    int UNPACK_COLORSPACE_CONVERSION_WEBGL = JsEnum.from("WebGLRenderingContext.UNPACK_COLORSPACE_CONVERSION_WEBGL").intValue();

    int UNPACK_FLIP_Y_WEBGL = JsEnum.from("WebGLRenderingContext.UNPACK_FLIP_Y_WEBGL").intValue();

    int UNPACK_PREMULTIPLY_ALPHA_WEBGL = JsEnum.from("WebGLRenderingContext.UNPACK_PREMULTIPLY_ALPHA_WEBGL").intValue();

    int UNSIGNED_BYTE = JsEnum.from("WebGLRenderingContext.UNSIGNED_BYTE").intValue();

    int UNSIGNED_INT = JsEnum.from("WebGLRenderingContext.UNSIGNED_INT").intValue();

    int UNSIGNED_SHORT = JsEnum.from("WebGLRenderingContext.UNSIGNED_SHORT").intValue();

    int UNSIGNED_SHORT_4_4_4_4 = JsEnum.from("WebGLRenderingContext.UNSIGNED_SHORT_4_4_4_4").intValue();

    int UNSIGNED_SHORT_5_5_5_1 = JsEnum.from("WebGLRenderingContext.UNSIGNED_SHORT_5_5_5_1").intValue();

    int UNSIGNED_SHORT_5_6_5 = JsEnum.from("WebGLRenderingContext.UNSIGNED_SHORT_5_6_5").intValue();

    int VALIDATE_STATUS = JsEnum.from("WebGLRenderingContext.VALIDATE_STATUS").intValue();

    int VENDOR = JsEnum.from("WebGLRenderingContext.VENDOR").intValue();

    int VERSION = JsEnum.from("WebGLRenderingContext.VERSION").intValue();

    int VERTEX_ATTRIB_ARRAY_BUFFER_BINDING = JsEnum.from("WebGLRenderingContext.VERTEX_ATTRIB_ARRAY_BUFFER_BINDING").intValue();

    int VERTEX_ATTRIB_ARRAY_ENABLED = JsEnum.from("WebGLRenderingContext.VERTEX_ATTRIB_ARRAY_ENABLED").intValue();

    int VERTEX_ATTRIB_ARRAY_NORMALIZED = JsEnum.from("WebGLRenderingContext.VERTEX_ATTRIB_ARRAY_NORMALIZED").intValue();

    int VERTEX_ATTRIB_ARRAY_POINTER = JsEnum.from("WebGLRenderingContext.VERTEX_ATTRIB_ARRAY_POINTER").intValue();

    int VERTEX_ATTRIB_ARRAY_SIZE = JsEnum.from("WebGLRenderingContext.VERTEX_ATTRIB_ARRAY_SIZE").intValue();

    int VERTEX_ATTRIB_ARRAY_STRIDE = JsEnum.from("WebGLRenderingContext.VERTEX_ATTRIB_ARRAY_STRIDE").intValue();

    int VERTEX_ATTRIB_ARRAY_TYPE = JsEnum.from("WebGLRenderingContext.VERTEX_ATTRIB_ARRAY_TYPE").intValue();

    int VERTEX_SHADER = JsEnum.from("WebGLRenderingContext.VERTEX_SHADER").intValue();

    int VIEWPORT = JsEnum.from("WebGLRenderingContext.VIEWPORT").intValue();

    int ZERO = JsEnum.from("WebGLRenderingContext.ZERO").intValue();

    @JSBody(script = "return WebGLRenderingContext.prototype")
    static WebGLRenderingContext prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new WebGLRenderingContext()")
    static WebGLRenderingContext create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
