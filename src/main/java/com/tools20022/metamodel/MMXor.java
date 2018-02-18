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
 * A rule which enforces a choice amongst a set of Message Elements contained
 * either within a Message Definition or a Message Component.
 */
public class MMXor implements MMRepositoryConcept {

	/**
	 * Message Elements impacted by the XOR.
	 */
	public final static MetamodelAttribute<MMXor, List<MMMessageElement>> impactedElementsAttribute = newAttribute();
	/**
	 * Message Component owning the XOR.
	 */
	public final static MetamodelAttribute<MMXor, Optional<MMMessageComponent>> messageComponentAttribute = newAttribute();
	/**
	 * MessageBuildingBlocks impacted by the XOR.
	 */
	public final static MetamodelAttribute<MMXor, List<MMMessageBuildingBlock>> impactedMessageBuildingBlocksAttribute = newAttribute();
	/**
	 * Message Definition owning the XOR.
	 */
	public final static MetamodelAttribute<MMXor, Optional<MMMessageDefinition>> messageDefinitionAttribute = newAttribute();
	protected Supplier<List<MMMessageElement>> impactedElements_lazy;
	protected Supplier<MMMessageComponent> messageComponent_lazy;
	protected Supplier<List<MMMessageBuildingBlock>> impactedMessageBuildingBlocks_lazy;
	protected Supplier<MMMessageDefinition> messageDefinition_lazy;
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
	public MMRepositoryType getContainer() {
		if (getMessageComponent().isPresent())
			return getMessageComponent().get();
		if (getMessageDefinition().isPresent())
			return getMessageDefinition().get();
		throw new IllegalStateException("The " + toString() + " hasn't container!");
	}

	@Override
	public MetamodelType<? extends MMXor> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMXor> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(MMXor.class);
	}

	/**
	 * Message Elements impacted by the XOR.
	 */
	public List<MMMessageElement> getImpactedElements() {
		return impactedElements_lazy == null ? Collections.emptyList() : impactedElements_lazy.get();
	}

	/**
	 * Message Component owning the XOR.
	 * 
	 * @see MMMessageComponent#getXors()
	 */
	@Opposite(bean = MMMessageComponent.class, attribute = "xors")
	@Container
	public Optional<MMMessageComponent> getMessageComponent() {
		return messageComponent_lazy == null ? Optional.empty() : Optional.of(messageComponent_lazy.get());
	}

	/**
	 * MessageBuildingBlocks impacted by the XOR.
	 */
	public List<MMMessageBuildingBlock> getImpactedMessageBuildingBlocks() {
		return impactedMessageBuildingBlocks_lazy == null ? Collections.emptyList() : impactedMessageBuildingBlocks_lazy.get();
	}

	/**
	 * Message Definition owning the XOR.
	 * 
	 * @see MMMessageDefinition#getXors()
	 */
	@Opposite(bean = MMMessageDefinition.class, attribute = "xors")
	@Container
	public Optional<MMMessageDefinition> getMessageDefinition() {
		return messageDefinition_lazy == null ? Optional.empty() : Optional.of(messageDefinition_lazy.get());
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