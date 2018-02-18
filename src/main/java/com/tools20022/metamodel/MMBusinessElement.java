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

import com.tools20022.core.metamodel.Container;
import com.tools20022.core.metamodel.Derived;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.core.metamodel.Opposite;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.metamodel.*;
import java.util.function.Supplier;
import java.util.List;

/**
 * Property of a BusinessComponent that has a distinctive meaning within the
 * scope of that BusinessComponent.
 */
public interface MMBusinessElement extends MMConstruct, MMBusinessConcept {

	/**
	 * Specifies whether a BusinessElement can be computed using other
	 * BusinessElements, but that is shown for clarity even though it adds no
	 * semantic information.
	 */
	public final static MetamodelAttribute<MMBusinessElement, Boolean> isDerivedAttribute = newAttribute();
	/**
	 * All of the MessageElements that derive from one BusinessElement in a
	 * specific BusinessComponent.
	 */
	public final static MetamodelAttribute<MMBusinessElement, List<MMMessageElement>> derivationAttribute = newAttribute();
	/**
	 * Derived direct reference to the type of the BusinessElement.
	 */
	public final static MetamodelAttribute<MMBusinessElement, MMBusinessElementType> businessElementTypeAttribute = newAttribute();
	/**
	 * The business context in which the BusinessElement is used
	 */
	public final static MetamodelAttribute<MMBusinessElement, MMBusinessComponent> elementContextAttribute = newAttribute();

	public static MetamodelType<MMBusinessElement> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(MMBusinessElement.class);
	}

	/**
	 * Specifies whether a BusinessElement can be computed using other
	 * BusinessElements, but that is shown for clarity even though it adds no
	 * semantic information.
	 */
	public boolean isIsDerived();

	/**
	 * All of the MessageElements that derive from one BusinessElement in a
	 * specific BusinessComponent.
	 * 
	 * @see MMMessageElement#getBusinessElementTrace()
	 */
	@Opposite(bean = MMMessageElement.class, attribute = "businessElementTrace")
	public List<MMMessageElement> getDerivation();

	/**
	 * Derived direct reference to the type of the BusinessElement.
	 */
	@Derived
	public MMBusinessElementType getBusinessElementType();

	/**
	 * The business context in which the BusinessElement is used
	 * 
	 * @see MMBusinessComponent#getElement()
	 */
	@Opposite(bean = MMBusinessComponent.class, attribute = "element")
	@Container
	public MMBusinessComponent getElementContext();
}