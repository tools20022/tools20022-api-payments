package com.tools20022.core.metamodel;

public interface RuntimeValidatorAware {

	default void executeValidator(Object obj ) throws Exception {
		throw new RuntimeException("Should override in concrate classes!");
	}
		
}
