package com.tools20022.core.metamodel;

public interface RuntimeInstanceAware {

	default Class<?> getInstanceClass() {
		throw new RuntimeException("Should override in concrate classes!");
	}
	
}
