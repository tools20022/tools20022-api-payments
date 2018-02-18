package com.tools20022.metamodel.ext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringJoiner;

import com.tools20022.metamodel.MMRepositoryConcept;
import com.tools20022.metamodel.MMSemanticMarkup;
import com.tools20022.metamodel.MMSemanticMarkupElement;

public class OtherSemanticMarkup extends MMSemanticMarkup {
	
	public OtherSemanticMarkup( MMRepositoryConcept container, String type, String[] ... nameValuePairs ) {
		this.container = container;
		this.type = type;
		
		ArrayList<MMSemanticMarkupElement> elems = new ArrayList<>(); 
		for( String[] nameValuePair: nameValuePairs ) {
			if( nameValuePair.length != 2 )
				throw new IllegalArgumentException();
			MMSemanticMarkupElement elem = new MMSemanticMarkupElement() {{
				this.name = nameValuePair[0];
				this.value = nameValuePair[1];
			}};
			elems.add(elem);
		}
		this.elements_lazy = ()-> elems;
	}
	
	@Override
	public String toString() {
		StringJoiner sj = new StringJoiner(", ");
		for( MMSemanticMarkupElement elem : elements_lazy.get() ) {
			sj.add(elem.getName().orElse(null) + "=" + elem.getValue().orElse(null));
		}
		return getClass().getSimpleName() + " (type=" + type + "): " + sj.toString();
	}

}
