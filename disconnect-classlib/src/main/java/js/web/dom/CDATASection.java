package js.web.dom;

import org.teavm.jso.JSBody;

/**
 * A CDATA section that can be used within XML to include extended portions of unescaped text. The symbols &lt; and
 * &amp;
 * don’t need escaping as they normally do when inside a CDATA section.
 */
public interface CDATASection extends Text {
	@JSBody(script = "return CDATASection.prototype")
	static CDATASection prototype() {
		throw new UnsupportedOperationException("Available only in JavaScript");
	}

	@JSBody(script = "return new CDATASection()")
	static CDATASection create() {
		throw new UnsupportedOperationException("Available only in JavaScript");
	}


}
