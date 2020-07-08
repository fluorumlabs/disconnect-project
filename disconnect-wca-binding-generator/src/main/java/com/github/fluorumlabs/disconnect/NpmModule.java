package com.github.fluorumlabs.disconnect;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.nio.file.Path;

/**
 * Created by Artem Godin on 7/1/2020.
 */
@Data
@AllArgsConstructor
public class NpmModule {
    private String name;
    private String version;
    private Path path;
}
