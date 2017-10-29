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

package com.tools20022.metamodel.struct;

import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.core.metamodel.Metamodel.MetamodelConstraint;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newConstraint;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMBusinessElement;
import com.tools20022.metamodel.MMMessageElement;
import com.tools20022.metamodel.MMMessageElementContainer;
import com.tools20022.metamodel.struct.MMMessageConcept_;
import com.tools20022.metamodel.struct.MMMessageConstruct_;
import java.util.Optional;

public interface MMMessageElement_ extends MMMessageConstruct_, MMMessageConcept_ {

	/**
	 * a property of a MessageElement indicating whether it has a semantic
	 * relationship to a BusinessComponent / BusinessElement, i.e. whether it is
	 * derived from a BusinessComponent / BusinessElement
	 */
	MetamodelAttribute<MMMessageElement, Boolean> isTechnical = newAttribute();
	/**
	 * the trace of a MessageElement to the BusinessComponent from which it is
	 * derived
	 */
	MetamodelAttribute<MMMessageElement, Optional<MMBusinessComponent>> businessComponentTrace = newAttribute();
	/**
	 * The trace of a MessageElement to the BusinessElement from which the
	 * MessageElement is derived
	 */
	MetamodelAttribute<MMMessageElement, Optional<MMBusinessElement>> businessElementTrace = newAttribute();
	/**
	 * the MessageComponent that describes the context within which the
	 * MessageElement is defined
	 */
	MetamodelAttribute<MMMessageElement, MMMessageElementContainer> componentContext = newAttribute();
	/**
	 * a Property of a MessageElement specifying whether a MessageElement can be
	 * computed using other MessageElements, but that is shown for clarity even
	 * though it adds no semantic information
	 */
	MetamodelAttribute<MMMessageElement, Boolean> isDerived = newAttribute();
	/**
	 * A MessageElement may not trace to both a BusinessComponent and a
	 * BusinessElement businessComponentTrace-&gt;size( ) +
	 * businessElementTrace-&gt;size( ) &lt;= 1
	 */
	MetamodelConstraint<MMMessageElement> checkNoMoreThanOneTrace = newConstraint(b -> {
		throw new RuntimeException("Not implemented!");
	});
	/**
	 * A trace can only raise the minimum cardinality and can only lower the
	 * maximum cardinality minOccurs &gt;= businessElementTrace.minOccurs and
	 * (businessElementTrace.maxOccurs.oclIsUndefined() or maxOccurs &lt;=
	 * businessElementTrace.maxOccurs)
	 */
	MetamodelConstraint<MMMessageElement> checkCardinalityAlignment = newConstraint(b -> {
		throw new RuntimeException("Not implemented!");
	});
}