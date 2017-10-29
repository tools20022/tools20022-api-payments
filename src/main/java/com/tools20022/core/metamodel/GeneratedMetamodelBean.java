package com.tools20022.core.metamodel;

import com.tools20022.core.metamodel.Metamodel.MetamodelType;

public interface GeneratedMetamodelBean {
	
	MetamodelType<? extends GeneratedMetamodelBean> getMetamodel();

	GeneratedMetamodelBean getContainer();

}
