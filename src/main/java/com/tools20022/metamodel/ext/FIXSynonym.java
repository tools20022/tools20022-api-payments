package com.tools20022.metamodel.ext;

import java.util.Arrays;

import com.tools20022.metamodel.MMRepositoryConcept;
import com.tools20022.metamodel.MMSemanticMarkup;
import com.tools20022.metamodel.MMSemanticMarkupElement;

public class FIXSynonym extends MMSemanticMarkup {
	
	public FIXSynonym( MMRepositoryConcept container, String fixSynonym ) {
		this.container = container;
		this.type = "Synonym";
		
		MMSemanticMarkupElement contextElem = new MMSemanticMarkupElement() {{
			this.name = "context";
			this.value = "FIX";
		}};
		MMSemanticMarkupElement valueElem = new MMSemanticMarkupElement() {{
			this.name = "value";
			this.value = fixSynonym;
		}};
		
		this.elements_lazy = ()-> Arrays.asList(contextElem, valueElem );
	}
	
	public String getSynonym() {
		return elements_lazy.get().get(1).getValue().get();
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + ":" + getSynonym();
	}
	
	
}
