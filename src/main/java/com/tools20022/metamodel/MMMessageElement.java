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
import com.tools20022.core.metamodel.Metamodel.MetamodelConstraint;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.core.metamodel.Opposite;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newConstraint;
import com.tools20022.metamodel.constraints.CardinalityAlignment;
import com.tools20022.metamodel.constraints.NoMoreThanOneTrace;
import com.tools20022.metamodel.*;
import java.util.function.Supplier;
import java.util.Optional;

/**
 * Characteristic of a MessageComponent / ChoiceComponent, having a unique
 * meaning within the scope of that MessageComponent / ChoiceComponent
 */
public interface MMMessageElement extends MMMessageConstruct, MMMessageConcept {

	/**
	 * a property of a MessageElement indicating whether it has a semantic
	 * relationship to a BusinessComponent / BusinessElement, i.e. whether it is
	 * derived from a BusinessComponent / BusinessElement
	 */
	public final static MetamodelAttribute<MMMessageElement, Boolean> isTechnicalAttribute = newAttribute();
	/**
	 * the trace of a MessageElement to the BusinessComponent from which it is
	 * derived
	 */
	public final static MetamodelAttribute<MMMessageElement, Optional<MMBusinessComponent>> businessComponentTraceAttribute = newAttribute();
	/**
	 * The trace of a MessageElement to the BusinessElement from which the
	 * MessageElement is derived
	 */
	public final static MetamodelAttribute<MMMessageElement, Optional<MMBusinessElement>> businessElementTraceAttribute = newAttribute();
	/**
	 * the MessageComponent that describes the context within which the
	 * MessageElement is defined
	 */
	public final static MetamodelAttribute<MMMessageElement, MMMessageElementContainer> componentContextAttribute = newAttribute();
	/**
	 * a Property of a MessageElement specifying whether a MessageElement can be
	 * computed using other MessageElements, but that is shown for clarity even
	 * though it adds no semantic information
	 */
	public final static MetamodelAttribute<MMMessageElement, Boolean> isDerivedAttribute = newAttribute();
	/**
	 * A MessageElement may not trace to both a BusinessComponent and a
	 * BusinessElement businessComponentTrace-&gt;size( ) +
	 * businessElementTrace-&gt;size( ) &lt;= 1
	 */
	public final static MetamodelConstraint<MMMessageElement> checkNoMoreThanOneTrace = newConstraint(b -> {
		new NoMoreThanOneTrace().accept(b);
	});
	/**
	 * A trace can only raise the minimum cardinality and can only lower the
	 * maximum cardinality minOccurs &gt;= businessElementTrace.minOccurs and
	 * (businessElementTrace.maxOccurs.oclIsUndefined() or maxOccurs &lt;=
	 * businessElementTrace.maxOccurs)
	 */
	public final static MetamodelConstraint<MMMessageElement> checkCardinalityAlignment = newConstraint(b -> {
		new CardinalityAlignment().accept(b);
	});

	public static MetamodelType<MMMessageElement> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(MMMessageElement.class);
	}

	/**
	 * a property of a MessageElement indicating whether it has a semantic
	 * relationship to a BusinessComponent / BusinessElement, i.e. whether it is
	 * derived from a BusinessComponent / BusinessElement
	 */
	@Derived
	public boolean isIsTechnical();

	/**
	 * the trace of a MessageElement to the BusinessComponent from which it is
	 * derived
	 * 
	 * @see MMBusinessComponent#getDerivationElement()
	 */
	@Opposite(bean = MMBusinessComponent.class, attribute = "derivationElement")
	public Optional<MMBusinessComponent> getBusinessComponentTrace();

	/**
	 * The trace of a MessageElement to the BusinessElement from which the
	 * MessageElement is derived
	 * 
	 * @see MMBusinessElement#getDerivation()
	 */
	@Opposite(bean = MMBusinessElement.class, attribute = "derivation")
	public Optional<MMBusinessElement> getBusinessElementTrace();

	/**
	 * the MessageComponent that describes the context within which the
	 * MessageElement is defined
	 * 
	 * @see MMMessageElementContainer#getMessageElement()
	 */
	@Opposite(bean = MMMessageElementContainer.class, attribute = "messageElement")
	@Container
	public MMMessageElementContainer getComponentContext();

	/**
	 * a Property of a MessageElement specifying whether a MessageElement can be
	 * computed using other MessageElements, but that is shown for clarity even
	 * though it adds no semantic information
	 */
	public boolean isIsDerived();
}