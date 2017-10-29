package com.tools20022.core.repo;

import java.util.LinkedHashMap;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.core.metamodel.Metamodel;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;

public class ReflectionBasedRepository implements Repository {

	private final Metamodel metamodel;
	
	private final LinkedHashMap<? extends MetamodelType<?>,? extends GeneratedMetamodelBean> instancesByMMType = new LinkedHashMap<>();
	
	protected ReflectionBasedRepository(Metamodel metamodel) {
		this.metamodel = metamodel;
	}

}
