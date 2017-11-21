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

import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.metamodel.MMDataType;
import java.util.Optional;

/**
 * Abstract definition of a data type whose properties are common to all kinds
 * of time-related concepts.
 */
public interface MMAbstractDateTimeConcept extends MMDataType {

	/**
	 * the lowest value in the allowed set of values
	 */
	public final static MetamodelAttribute<MMAbstractDateTimeConcept, Optional<String>> minInclusiveAttribute = newAttribute();
	/**
	 * the lowest but one value in the allowed set of values
	 */
	public final static MetamodelAttribute<MMAbstractDateTimeConcept, Optional<String>> minExclusiveAttribute = newAttribute();
	/**
	 * the highest value in the allowed set of values
	 */
	public final static MetamodelAttribute<MMAbstractDateTimeConcept, Optional<String>> maxInclusiveAttribute = newAttribute();
	/**
	 * the highest but one value in the allowed set of values
	 */
	public final static MetamodelAttribute<MMAbstractDateTimeConcept, Optional<String>> maxExclusiveAttribute = newAttribute();
	/**
	 * A constraint on the value space of a datatype which is achieved by
	 * constraining the lexical space to literals which match a specific
	 * pattern.
	 */
	public final static MetamodelAttribute<MMAbstractDateTimeConcept, Optional<String>> patternAttribute = newAttribute();

	public static MetamodelType<MMAbstractDateTimeConcept> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(MMAbstractDateTimeConcept.class);
	}

	/**
	 * the lowest value in the allowed set of values
	 */
	public Optional<String> getMinInclusive();

	/**
	 * the lowest but one value in the allowed set of values
	 */
	public Optional<String> getMinExclusive();

	/**
	 * the highest value in the allowed set of values
	 */
	public Optional<String> getMaxInclusive();

	/**
	 * the highest but one value in the allowed set of values
	 */
	public Optional<String> getMaxExclusive();

	/**
	 * A constraint on the value space of a datatype which is achieved by
	 * constraining the lexical space to literals which match a specific
	 * pattern.
	 */
	public Optional<String> getPattern();
}