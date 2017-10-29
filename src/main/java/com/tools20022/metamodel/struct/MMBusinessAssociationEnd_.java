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
import com.tools20022.metamodel.MMAggregation;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.struct.MMBusinessElement_;
import java.util.Optional;

public interface MMBusinessAssociationEnd_ extends MMBusinessElement_ {

	/**
	 * Opposite end of a bi-directional relationship between 2
	 * BusinessComponents.
	 */
	MetamodelAttribute<MMBusinessAssociationEnd, Optional<MMBusinessAssociationEnd>> opposite = newAttribute();
	/**
	 * Expresses the strength of the semantic relationship between two
	 * BusinessComponents.
	 */
	MetamodelAttribute<MMBusinessAssociationEnd, MMAggregation> aggregation = newAttribute();
	/**
	 * Specifies that a BusinessAssociationEnd always has a complex content
	 * model and is therefore always typed by a BusinessComponent, contrarily to
	 * a BusinessAttribute which may be typed by a data type.
	 */
	MetamodelAttribute<MMBusinessAssociationEnd, MMBusinessComponent> type = newAttribute();
	/**
	 * Two opposite association ends may not have composite or shared
	 * aggregation at the same time not(aggregation &lt;&gt; Aggregation::NONE
	 * and opposite.aggregation &lt;&gt; Aggregation::NONE)
	 */
	MetamodelConstraint<MMBusinessAssociationEnd> checkAtMostOneAggregatedEnd = newConstraint(b -> {
		throw new RuntimeException("Not implemented!");
	});
	/**
	 * The context of this end must be the type of the opposite and vice-versa
	 * opposite.elementContext = type and elementContext = opposite.type
	 */
	MetamodelConstraint<MMBusinessAssociationEnd> checkContextConsistentWithType = newConstraint(b -> {
		throw new RuntimeException("Not implemented!");
	});
}