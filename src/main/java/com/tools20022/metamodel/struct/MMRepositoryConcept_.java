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
import com.tools20022.metamodel.struct.MMModelEntity_;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface MMRepositoryConcept_ extends MMModelEntity_ {

	/**
	 * a word or set of words by which a RepositoryConcept is known, addressed
	 * or referred to
	 */
	MetamodelAttribute<MMRepositoryConcept, String> name = newAttribute();
	/**
	 * describes the semantic meaning of a RepositoryConcept
	 */
	MetamodelAttribute<MMRepositoryConcept, Optional<String>> definition = newAttribute();
	/**
	 * Enables modelers to markup elements of the Repository with semantic
	 * metadata.
	 */
	MetamodelAttribute<MMRepositoryConcept, List<MMSemanticMarkup>> semanticMarkup = newAttribute();
	/**
	 * Doclets of the entity, used for documentation.
	 */
	MetamodelAttribute<MMRepositoryConcept, List<MMDoclet>> doclet = newAttribute();
	/**
	 * provides a representative instance of a RepositoryConcept
	 */
	MetamodelAttribute<MMRepositoryConcept, List<String>> example = newAttribute();
	/**
	 * a property of a RepositoryConcept specifying a semantic condition or
	 * restriction expressed in natural language text and potentially in a
	 * formal notation
	 */
	MetamodelAttribute<MMRepositoryConcept, List<MMConstraint>> constraint = newAttribute();
	/**
	 * specifies in which stage of the registration lifecycle a
	 * RepositoryConcept is in
	 */
	MetamodelAttribute<MMRepositoryConcept, MMRegistrationStatus> registrationStatus = newAttribute();
	/**
	 * specifies the date at which a RepositoryConcept will cease or has ceased
	 * to be part of the Repository
	 */
	MetamodelAttribute<MMRepositoryConcept, Optional<Date>> removalDate = newAttribute();
	/**
	 * If a removalDate is specified then the registrationStatus must be
	 * OBSOLETE removalDate-&gt;notEmpty( ) implies registrationStatus =
	 * RegistrationStatus::OBSOLETE
	 */
	MetamodelConstraint<MMRepositoryConcept> checkRemovalDateRegistrationStatus = newConstraint(b -> {
		throw new RuntimeException("Not implemented!");
	});
	/**
	 * First letter of name shall be upper case. [A-Z] Set
	 * {'A','B','C','D','E','F'
	 * ,'G','H','I','J','K','L','M','N','O','P','Q','R','S'
	 * ,'T','U','V','W','X','Y','Z'}-&gt;exists(x|x=name.substring(1,1))
	 */
	MetamodelConstraint<MMRepositoryConcept> checkNameFirstLetterUppercase = newConstraint(b -> {
		throw new RuntimeException("Not implemented!");
	});
}