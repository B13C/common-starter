package com.geoxus.resource.autoconfiguration.annotations;

import java.lang.annotation.*;

@Documented
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface CommonAnnotation {
    String name();
}
