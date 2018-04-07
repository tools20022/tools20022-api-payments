package com.tools20022.core.metamodel;

import com.tools20022.core.metamodel.Metamodel.MetamodelType;

public interface GeneratedMetamodelBean {
	
	default MetamodelType<? extends GeneratedMetamodelBean> getMetamodel() {
		return null; // XXX
	}

	GeneratedMetamodelBean getContainer();

}
