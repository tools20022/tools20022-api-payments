package com.tools20022.core.metamodel;

public interface RuntimeValidatorAware<T> {

	default void executeValidator(T obj ) throws Exception {
		throw new RuntimeException("Should override in concrate classes!");
	}
		
}
