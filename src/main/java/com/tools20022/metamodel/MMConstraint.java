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
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.core.metamodel.Opposite;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.metamodel.*;
import java.util.Collections;
import java.util.Date;
import java.util.function.Supplier;
import java.util.List;
import java.util.Optional;

/**
 * A rule that must be universally satisfied i.e. all conditions required for
 * the Constraint to be applicable, are known.
 */
public class MMConstraint implements MMRepositoryConcept {

	/**
	 * The description of a Constraint in a specific language, defined in
	 * expressionLanguage
	 */
	public final static MetamodelAttribute<MMConstraint, Optional<String>> expressionAttribute = newAttribute();
	/**
	 * The language in which a Constraint in expressed.
	 */
	public final static MetamodelAttribute<MMConstraint, Optional<String>> expressionLanguageAttribute = newAttribute();
	/**
	 * The owner of the Rule.
	 */
	public final static MetamodelAttribute<MMConstraint, MMRepositoryConcept> ownerAttribute = newAttribute();
	protected String expression;
	protected String expressionLanguage;
	protected Supplier<MMRepositoryConcept> owner_lazy;
	protected String name;
	protected String definition;
	protected Supplier<List<MMSemanticMarkup>> semanticMarkup_lazy;
	protected Supplier<List<MMDoclet>> doclet_lazy;
	protected List<String> example;
	protected Supplier<List<MMConstraint>> constraint_lazy;
	protected MMRegistrationStatus registrationStatus;
	protected Date removalDate;
	protected Supplier<List<MMModelEntity>> nextVersions_lazy;
	protected Supplier<MMModelEntity> previousVersion_lazy;
	protected String objectIdentifier;

	@Override
	public MMRepositoryConcept getContainer() {
		return getOwner();
	}

	@Override
	public MetamodelType<? extends MMConstraint> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMConstraint> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(MMConstraint.class);
	}

	/**
	 * The description of a Constraint in a specific language, defined in
	 * expressionLanguage
	 */
	public Optional<String> getExpression() {
		return expression == null ? Optional.empty() : Optional.of(expression);
	}

	/**
	 * The language in which a Constraint in expressed.
	 */
	public Optional<String> getExpressionLanguage() {
		return expressionLanguage == null ? Optional.empty() : Optional.of(expressionLanguage);
	}

	/**
	 * The owner of the Rule.
	 * 
	 * @see MMRepositoryConcept#getConstraint()
	 */
	@Opposite(bean = MMRepositoryConcept.class, attribute = "constraint")
	@Container
	public MMRepositoryConcept getOwner() {
		return owner_lazy.get();
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Optional<String> getDefinition() {
		return definition == null ? Optional.empty() : Optional.of(definition);
	}

	@Override
	public List<MMSemanticMarkup> getSemanticMarkup() {
		return semanticMarkup_lazy == null ? Collections.emptyList() : semanticMarkup_lazy.get();
	}

	@Override
	public List<MMDoclet> getDoclet() {
		return doclet_lazy == null ? Collections.emptyList() : doclet_lazy.get();
	}

	@Override
	public List<String> getExample() {
		return example == null ? Collections.emptyList() : example;
	}

	@Override
	public List<MMConstraint> getConstraint() {
		return constraint_lazy == null ? Collections.emptyList() : constraint_lazy.get();
	}

	@Override
	public MMRegistrationStatus getRegistrationStatus() {
		return registrationStatus;
	}

	@Override
	public Optional<Date> getRemovalDate() {
		return removalDate == null ? Optional.empty() : Optional.of(removalDate);
	}

	@Override
	public List<MMModelEntity> getNextVersions() {
		return nextVersions_lazy == null ? Collections.emptyList() : nextVersions_lazy.get();
	}

	@Override
	public Optional<MMModelEntity> getPreviousVersion() {
		return previousVersion_lazy == null ? Optional.empty() : Optional.of(previousVersion_lazy.get());
	}

	@Override
	public Optional<String> getObjectIdentifier() {
		return objectIdentifier == null ? Optional.empty() : Optional.of(objectIdentifier);
	}
}