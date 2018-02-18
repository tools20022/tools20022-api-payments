package com.tools20022.core.repo;

@FunctionalInterface
public interface Validator<T> {
	
    /**
     * Validates an object against a specific constraint. 
     * If validation fails throws an {@link Exception}
     *
     * @param obj object to validate
     */
    void check(T obj) throws Exception;

}
