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
import com.tools20022.metamodel.constraints.NameFirstLetterUppercase;
import com.tools20022.metamodel.constraints.RemovalDateRegistrationStatus;
import com.tools20022.metamodel.*;
import java.util.Date;
import java.util.function.Supplier;
import java.util.List;
import java.util.Optional;

/**
 * artefact that has been defined during the development of an ISO 20022
 * MessageDefinition and which is stored in the Repository
 */
public interface MMRepositoryConcept extends MMModelEntity {

	/**
	 * a word or set of words by which a RepositoryConcept is known, addressed
	 * or referred to
	 */
	public final static MetamodelAttribute<MMRepositoryConcept, String> nameAttribute = newAttribute();
	/**
	 * describes the semantic meaning of a RepositoryConcept
	 */
	public final static MetamodelAttribute<MMRepositoryConcept, Optional<String>> definitionAttribute = newAttribute();
	/**
	 * Enables modelers to markup elements of the Repository with semantic
	 * metadata.
	 */
	public final static MetamodelAttribute<MMRepositoryConcept, List<MMSemanticMarkup>> semanticMarkupAttribute = newAttribute();
	/**
	 * Doclets of the entity, used for documentation.
	 */
	public final static MetamodelAttribute<MMRepositoryConcept, List<MMDoclet>> docletAttribute = newAttribute();
	/**
	 * provides a representative instance of a RepositoryConcept
	 */
	public final static MetamodelAttribute<MMRepositoryConcept, List<String>> exampleAttribute = newAttribute();
	/**
	 * a property of a RepositoryConcept specifying a semantic condition or
	 * restriction expressed in natural language text and potentially in a
	 * formal notation
	 */
	public final static MetamodelAttribute<MMRepositoryConcept, List<MMConstraint>> constraintAttribute = newAttribute();
	/**
	 * specifies in which stage of the registration lifecycle a
	 * RepositoryConcept is in
	 */
	public final static MetamodelAttribute<MMRepositoryConcept, MMRegistrationStatus> registrationStatusAttribute = newAttribute();
	/**
	 * specifies the date at which a RepositoryConcept will cease or has ceased
	 * to be part of the Repository
	 */
	public final static MetamodelAttribute<MMRepositoryConcept, Optional<Date>> removalDateAttribute = newAttribute();
	/**
	 * If a removalDate is specified then the registrationStatus must be
	 * OBSOLETE removalDate-&gt;notEmpty( ) implies registrationStatus =
	 * RegistrationStatus::OBSOLETE
	 */
	public final static MetamodelConstraint<MMRepositoryConcept> checkRemovalDateRegistrationStatus = newConstraint(b -> {
		new RemovalDateRegistrationStatus().accept(b);
	});
	/**
	 * First letter of name shall be upper case. [A-Z] Set
	 * {'A','B','C','D','E','F'
	 * ,'G','H','I','J','K','L','M','N','O','P','Q','R','S'
	 * ,'T','U','V','W','X','Y','Z'}-&gt;exists(x|x=name.substring(1,1))
	 */
	public final static MetamodelConstraint<MMRepositoryConcept> checkNameFirstLetterUppercase = newConstraint(b -> {
		new NameFirstLetterUppercase().accept(b);
	});

	public static MetamodelType<MMRepositoryConcept> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(MMRepositoryConcept.class);
	}

	/**
	 * a word or set of words by which a RepositoryConcept is known, addressed
	 * or referred to
	 */
	public String getName();

	/**
	 * describes the semantic meaning of a RepositoryConcept
	 */
	public Optional<String> getDefinition();

	/**
	 * Enables modelers to markup elements of the Repository with semantic
	 * metadata.
	 */
	@Containment
	public List<MMSemanticMarkup> getSemanticMarkup();

	/**
	 * Doclets of the entity, used for documentation.
	 */
	@Containment
	public List<MMDoclet> getDoclet();

	/**
	 * provides a representative instance of a RepositoryConcept
	 */
	public List<String> getExample();

	/**
	 * a property of a RepositoryConcept specifying a semantic condition or
	 * restriction expressed in natural language text and potentially in a
	 * formal notation
	 * 
	 * @see MMConstraint#getOwner()
	 */
	@Opposite(bean = MMConstraint.class, attribute = "owner")
	@Containment
	public List<MMConstraint> getConstraint();

	/**
	 * specifies in which stage of the registration lifecycle a
	 * RepositoryConcept is in
	 */
	public MMRegistrationStatus getRegistrationStatus();

	/**
	 * specifies the date at which a RepositoryConcept will cease or has ceased
	 * to be part of the Repository
	 */
	public Optional<Date> getRemovalDate();
}