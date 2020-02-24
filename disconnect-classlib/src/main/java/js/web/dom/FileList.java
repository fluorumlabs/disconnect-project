package js.web.dom;

import js.util.collections.ArrayLike;
import org.teavm.jso.JSBody;

import javax.annotation.Nullable;


/**
 * An object of this type is returned by the files property of the HTML &lt;input&gt; element; this lets you access
 * the list of files selected with the &lt;input type="file"&gt; element. It's also used for a list of files dropped
 * into
 * web content when using the drag and drop API; see the DataTransfer object for details on this usage.
 */
public interface FileList extends ArrayLike<File> {
	@JSBody(script = "return FileList.prototype")
	static FileList prototype() {
		throw new UnsupportedOperationException("Available only in JavaScript");
	}

	@JSBody(script = "return new FileList()")
	static FileList create() {
		throw new UnsupportedOperationException("Available only in JavaScript");
	}

	@Nullable
	File item(int index);

}
