package com.tools20022.core.metamodel;

public interface RuntimePropertyAware<T,V> {
	
	default V getValue(T obj )  {
		throw new RuntimeException("Should override in concrate classes!");
	}
	
	default void setValue(T obj, V value)  {
		throw new RuntimeException("Should override in concrate classes!");
	};
	
	// TODO void addPropertyChangeListener();
}
