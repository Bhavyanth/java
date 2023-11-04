package com.java.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // When to run the annotation
@Target(ElementType.TYPE) // Where to apply this annotation (Type is generic)
public @interface MarkerAnnotation {

    // Empty interface with no metadata logic
}
