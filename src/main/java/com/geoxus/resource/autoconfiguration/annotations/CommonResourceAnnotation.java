package com.geoxus.resource.autoconfiguration.annotations;

import java.lang.annotation.*;

@Documented
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CommonResourceAnnotation {
    String url();
}
