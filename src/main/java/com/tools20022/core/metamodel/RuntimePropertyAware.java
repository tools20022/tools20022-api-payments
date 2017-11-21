package com.tools20022.core.metamodel;

import java.lang.reflect.Method;

public interface RuntimePropertyAware {
	
	default Method getGetterMethod()  {
		throw new RuntimeException("Should override in concrate classes!");
	}
	
	default Method getSetterMethod()  {
		throw new RuntimeException("Should override in concrate classes!");
	};
	
	// TODO void addPropertyChangeListener();
}
