package com.tools20022.metamodel.ext;

import java.util.Arrays;

import com.tools20022.metamodel.MMRepositoryConcept;
import com.tools20022.metamodel.MMSemanticMarkup;
import com.tools20022.metamodel.MMSemanticMarkupElement;

public class ISO15022Synonym extends MMSemanticMarkup {
	
	public ISO15022Synonym( MMRepositoryConcept container, String iso15022synonym ) {
		this.container = container;
		this.type = "Synonym";
		
		MMSemanticMarkupElement contextElem = new MMSemanticMarkupElement() {{
			this.name = "context";
			this.value = "ISO 15022";
		}};
		MMSemanticMarkupElement valueElem = new MMSemanticMarkupElement() {{
			this.name = "value";
			this.value = iso15022synonym;
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
