package com.tools20022.core.metamodel;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target( {ElementType.FIELD,ElementType.METHOD})
public @interface ISODoc {
	
	enum Basis {
		EMPTY, IMPLEMENTATION_ENHANCEMENT, IMPLEMENTATION_CONSTRAINT, LEGACY, RepositoryManagement
	}

	String value();
	Basis basis() default Basis.EMPTY;
	String ext() default "";
}
