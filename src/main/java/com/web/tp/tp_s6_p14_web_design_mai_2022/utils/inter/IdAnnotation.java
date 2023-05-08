package com.web.tp.tp_s6_p14_web_design_mai_2022.utils.inter;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface IdAnnotation {
    String name() default "id";
    String sequence() default "";
}
