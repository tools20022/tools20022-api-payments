/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.metamodel;

import com.tools20022.core.metamodel.Containment;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.core.metamodel.Metamodel.MetamodelConstraint;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.core.metamodel.Opposite;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newConstraint;
import com.tools20022.metamodel.constraints.MessageElementsHaveUniqueNames;
import com.tools20022.metamodel.constraints.TechnicalElement;
import com.tools20022.metamodel.MMMessageComponentType;
import com.tools20022.metamodel.MMMessageElement;
import java.util.function.Supplier;
import java.util.List;

/**
 * Re-usable Dictionary Item that is a building block for assembling
 * MessageDefinitions, composed of a sequence of MessageElements
 */
public interface MMMessageElementContainer extends MMMessageComponentType {

	/**
	 * a semantic property of a MessageComponentType
	 */
	public final static MetamodelAttribute<MMMessageElementContainer, List<MMMessageElement>> messageElementAttribute = newAttribute();
	/**
	 * All MessageElements contained in this MessageComponentContainer must have
	 * different names. messageElement-&gt;forAll(el1,el2 | el1 &lt;&gt; el2
	 * implies el1.name &lt;&gt; el2.name)
	 */
	public final static MetamodelConstraint<MMMessageElementContainer> checkMessageElementsHaveUniqueNames = newConstraint(b -> {
		new MessageElementsHaveUniqueNames().accept(b);
	});
	/**
	 * All the elements belonging to a technical MessageComponentContainer must
	 * be technical. self.isTechnical implies messageElement -&gt;
	 * forAll(messageElement|messageElement.isTechnical)
	 */
	public final static MetamodelConstraint<MMMessageElementContainer> checktechnicalElement = newConstraint(b -> {
		new TechnicalElement().accept(b);
	});

	public static MetamodelType<MMMessageElementContainer> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(MMMessageElementContainer.class);
	}

	/**
	 * a semantic property of a MessageComponentType
	 * 
	 * @see MMMessageElement#getComponentContext()
	 */
	@Opposite(bean = MMMessageElement.class, attribute = "componentContext")
	@Containment
	public List<MMMessageElement> getMessageElement();
}