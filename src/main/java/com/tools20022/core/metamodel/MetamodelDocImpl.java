package com.tools20022.core.metamodel;

import com.tools20022.core.metamodel.ISODoc.Basis;

public class MetamodelDocImpl  {
	final String documentation;
	final Basis basis;
	final String description;

	public MetamodelDocImpl(String documentation, Basis basis, String description) {
		if (documentation == null && basis == null)
			throw new IllegalArgumentException("Can not both null");
		this.documentation = documentation;
		this.basis = basis;
		this.description = description;
	}

	public String getDocumentation() {
		return documentation;
	}

	public Basis getExtBasis() {
		return basis;
	}

	public String getExtDescription() {
		return description;
	}

	@Override
	public String toString() {
		return documentation == null ? ""
				: documentation + (basis != null
						? "\n(" + (basis + description == null ? "" : " : " + description) + ")" : "");
	}

}
