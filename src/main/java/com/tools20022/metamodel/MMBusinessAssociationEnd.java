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

import com.tools20022.core.metamodel.Derived;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.core.metamodel.Opposite;
import com.tools20022.metamodel.constraints.DeriveMMBusinessAssociationEnd_businessElementType;
import com.tools20022.metamodel.constraints.DeriveMMBusinessAssociationEnd_memberType;
import com.tools20022.metamodel.*;
import java.util.Collections;
import java.util.Date;
import java.util.function.Supplier;
import java.util.List;
import java.util.Optional;

/**
 * The context of a BusinessAssociation must be the type of its opposite and
 * vice-versa
 */
public class MMBusinessAssociationEnd implements MMBusinessElement {

	protected Supplier<MMBusinessAssociationEnd> opposite_lazy;
	protected MMAggregation aggregation;
	protected Supplier<MMBusinessComponent> type_lazy;
	protected boolean isDerived;
	protected Supplier<List<MMMessageElement>> derivation_lazy;
	protected Supplier<MMBusinessComponent> elementContext_lazy;
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
	protected Integer maxOccurs;
	protected Integer minOccurs;

	@Override
	public MMBusinessComponent getContainer() {
		return getElementContext();
	}

	@Override
	public MetamodelType<? extends MMBusinessAssociationEnd> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMBusinessAssociationEnd> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(MMBusinessAssociationEnd.class);
	}

	/**
	 * Opposite end of a bi-directional relationship between 2
	 * BusinessComponents.
	 */
	public Optional<MMBusinessAssociationEnd> getOpposite() {
		return opposite_lazy == null ? Optional.empty() : Optional.of(opposite_lazy.get());
	}

	/**
	 * Expresses the strength of the semantic relationship between two
	 * BusinessComponents.
	 */
	public MMAggregation getAggregation() {
		return aggregation;
	}

	/**
	 * Specifies that a BusinessAssociationEnd always has a complex content
	 * model and is therefore always typed by a BusinessComponent, contrarily to
	 * a BusinessAttribute which may be typed by a data type.
	 * 
	 * @see MMBusinessComponent#getAssociationDomain()
	 */
	@Opposite(bean = MMBusinessComponent.class, attribute = "associationDomain")
	public MMBusinessComponent getType() {
		return type_lazy.get();
	}

	@Override
	public boolean isIsDerived() {
		return isDerived;
	}

	@Override
	public List<MMMessageElement> getDerivation() {
		return derivation_lazy == null ? Collections.emptyList() : derivation_lazy.get();
	}

	@Derived
	@Override
	public MMBusinessElementType getBusinessElementType() {
		return (new DeriveMMBusinessAssociationEnd_businessElementType()).apply(this);
	}

	@Override
	public MMBusinessComponent getElementContext() {
		return elementContext_lazy.get();
	}

	@Derived
	@Override
	public MMRepositoryType getMemberType() {
		return (new DeriveMMBusinessAssociationEnd_memberType()).apply(this);
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

	@Override
	public Optional<Integer> getMaxOccurs() {
		return maxOccurs == null ? Optional.empty() : Optional.of(maxOccurs);
	}

	@Override
	public Optional<Integer> getMinOccurs() {
		return minOccurs == null ? Optional.empty() : Optional.of(minOccurs);
	}
}