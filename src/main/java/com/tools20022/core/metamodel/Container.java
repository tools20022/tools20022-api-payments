package com.tools20022.core.metamodel;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marks an attribute as container. Used on metamodel property getters.  
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target( {ElementType.FIELD,ElementType.METHOD})
public @interface Container {
}
