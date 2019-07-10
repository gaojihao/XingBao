package com.lizhi.xingbao.mapper;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
public @interface Mapper {
    Class<?>[] uses() default {};
    Class<?>[] imports() default {};

    String componentModel() default "default";

    String implementationName() default "<CLASS_NAME>Impl";

    String implementationPackage() default "<PACKAGE_NAME>";

    Class<?> config() default void.class;


}
