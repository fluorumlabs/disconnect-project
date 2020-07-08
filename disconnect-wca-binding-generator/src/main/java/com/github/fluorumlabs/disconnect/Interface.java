package com.github.fluorumlabs.disconnect;

import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by Artem Godin on 6/2/2020.
 */
@Data
public class Interface {
    private String jsClassName;
    private ClassName className;
    private TypeName builderClassName;
    private TypeSpec.Builder builder;
    private TypeSpec.Builder builderBuilder;
    private ClassName extendedClassName;

    private Set<Interface> innerInterfaces = new LinkedHashSet<>();
    private Set<TypeName> superInterfaces = new HashSet<>();

    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Interface parent;
    private Module parentModule;

    private Set<String> symbols = new HashSet<>();

    private boolean buildable = true;
    private boolean requiresConstructor = true;
    private boolean rendered = false;
}
