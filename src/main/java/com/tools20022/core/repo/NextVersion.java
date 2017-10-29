package com.tools20022.core.repo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Repeatable(NextVersions.class)
@Retention(RetentionPolicy.RUNTIME)
@Target( {ElementType.TYPE})
public @interface NextVersion {
	Class<?> value();
	// TODO: change to this:
	// Class<? extends GeneratedRepoBean<?>> value();
}
