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
import com.tools20022.metamodel.*;
import com.tools20022.metamodel.struct.MMBusinessConcept_;
import com.tools20022.metamodel.struct.MMBusinessElementType_;
import com.tools20022.metamodel.struct.MMTopLevelDictionaryEntry_;
import java.util.List;
import java.util.Optional;

public interface MMBusinessComponent_ extends MMTopLevelDictionaryEntry_, MMBusinessElementType_, MMBusinessConcept_ {

	/**
	 * The BusinessComponents that specialize this BusinessComponent.
	 */
	MetamodelAttribute<MMBusinessComponent, List<MMBusinessComponent>> subType = newAttribute();
	/**
	 * The BusinessComponent that is specialized by this BusinessComponent.
	 */
	MetamodelAttribute<MMBusinessComponent, Optional<MMBusinessComponent>> superType = newAttribute();
	/**
	 * A semantic property of a BusinessComponent.
	 */
	MetamodelAttribute<MMBusinessComponent, List<MMBusinessElement>> element = newAttribute();
	/**
	 * All of the MessageComponentTypes that derive from this BusinessComponent.
	 */
	MetamodelAttribute<MMBusinessComponent, List<MMMessageComponentType>> derivationComponent = newAttribute();
	/**
	 * Describes the semantics that determine how the BusinessComponent may
	 * participate in the BusinessAssociation.
	 */
	MetamodelAttribute<MMBusinessComponent, List<MMBusinessAssociationEnd>> associationDomain = newAttribute();
	/**
	 * All of the MessageElements that derive from this BusinessComponent.
	 */
	MetamodelAttribute<MMBusinessComponent, List<MMMessageElement>> derivationElement = newAttribute();
	/**
	 * All BusinessElements contained by this BusinessComponents have different
	 * names element-&gt;forAll(el1,el2 : BusinessElement| el1 &lt;&gt; el2
	 * implies el1.name &lt;&gt; el2.name)
	 */
	MetamodelConstraint<MMBusinessComponent> checkBusinessElementsHaveUniqueNames = newConstraint(b -> {
		throw new RuntimeException("Not implemented!");
	});
}