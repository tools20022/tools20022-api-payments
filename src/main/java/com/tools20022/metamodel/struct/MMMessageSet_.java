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
import com.tools20022.metamodel.MMEncoding;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageSet;
import com.tools20022.metamodel.MMSyntax;
import com.tools20022.metamodel.struct.MMTopLevelCatalogueEntry_;
import java.util.List;

public interface MMMessageSet_ extends MMTopLevelCatalogueEntry_ {

	/**
	 * identification of the syntax for a specific EncodingScheme
	 */
	MetamodelAttribute<MMMessageSet, List<MMSyntax>> generatedSyntax = newAttribute();
	/**
	 * the set of encodings considered ISO 20022 valid for this MessageSet
	 */
	MetamodelAttribute<MMMessageSet, List<MMEncoding>> validEncoding = newAttribute();
	/**
	 * the MessageDefinition that belongs to the MessageSet
	 */
	MetamodelAttribute<MMMessageSet, List<MMMessageDefinition>> messageDefinition = newAttribute();
	/**
	 * the generated syntax is derived from the syntax for a validEncoding
	 * generatedSyntax-&gt;asBag() = validEncoding.syntax
	 */
	MetamodelConstraint<MMMessageSet> checkGeneratedSyntaxDerivation = newConstraint(b -> {
		throw new RuntimeException("Not implemented!");
	});
}