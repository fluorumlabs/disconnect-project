package com.github.fluorumlabs.disconnect.maven.internals;

import org.takes.HttpException;
import org.takes.Request;
import org.takes.Response;
import org.takes.Take;
import org.takes.rq.RqHref;
import org.takes.rs.RsWithBody;
import org.takes.rs.RsWithType;
import org.takes.tk.TkWrap;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.nio.file.Files;


public class TkMimeAwareFiles extends TkWrap {

    /**
     * Ctor.
     *
     * @param base Base directory
     */
    public TkMimeAwareFiles(final String base) {
        this(new File(base));
    }

    /**
     * Ctor.
     *
     * @param base Base directory
     */
    public TkMimeAwareFiles(final File base) {
        super(
                new Take() {
                    @Override
                    public Response act(final Request request) throws IOException {
                        final File file = new File(
                                base, new RqHref.Base(request).href().path()
                        );
                        if (!file.exists()) {
                            throw new HttpException(
                                    HttpURLConnection.HTTP_NOT_FOUND,
                                    String.format(
                                            "%s not found", file.getAbsolutePath()
                                    )
                            );
                        }
                        String mimeType = file.getAbsolutePath().endsWith(".js") ? "application/javascript" : Files.probeContentType(file.toPath());
                        return new RsWithType(new RsWithBody(Files.newInputStream(file.toPath())),
                                mimeType);
                    }
                }
        );
    }


}
