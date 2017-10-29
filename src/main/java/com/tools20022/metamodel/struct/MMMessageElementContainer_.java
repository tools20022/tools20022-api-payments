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
import com.tools20022.metamodel.MMMessageElement;
import com.tools20022.metamodel.MMMessageElementContainer;
import com.tools20022.metamodel.struct.MMMessageComponentType_;
import java.util.List;

public interface MMMessageElementContainer_ extends MMMessageComponentType_ {

	/**
	 * a semantic property of a MessageComponentType
	 */
	MetamodelAttribute<MMMessageElementContainer, List<MMMessageElement>> messageElement = newAttribute();
	/**
	 * All MessageElements contained in this MessageComponentContainer must have
	 * different names. messageElement-&gt;forAll(el1,el2 | el1 &lt;&gt; el2
	 * implies el1.name &lt;&gt; el2.name)
	 */
	MetamodelConstraint<MMMessageElementContainer> checkMessageElementsHaveUniqueNames = newConstraint(b -> {
		throw new RuntimeException("Not implemented!");
	});
	/**
	 * All the elements belonging to a technical MessageComponentContainer must
	 * be technical. self.isTechnical implies messageElement -&gt;
	 * forAll(messageElement|messageElement.isTechnical)
	 */
	MetamodelConstraint<MMMessageElementContainer> checktechnicalElement = newConstraint(b -> {
		throw new RuntimeException("Not implemented!");
	});
}