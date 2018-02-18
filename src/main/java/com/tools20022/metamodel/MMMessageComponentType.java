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
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.core.metamodel.Opposite;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.metamodel.*;
import java.util.function.Supplier;
import java.util.List;
import java.util.Optional;

/**
 * MessageComponent, ExternalSchema, UserDefined or ChoiceComponent
 */
public interface MMMessageComponentType extends MMTopLevelDictionaryEntry, MMLogicalType, MMMessageConcept {

	/**
	 * The MessageBuildingBlock that is the context for this
	 * MessageComponentType
	 */
	public final static MetamodelAttribute<MMMessageComponentType, List<MMMessageBuildingBlock>> messageBuildingBlockAttribute = newAttribute();
	/**
	 * A property indicating the absense of a semantic relationship to a
	 * BusinessComponent, i.e. it is not derived from a BusinessComponent
	 */
	public final static MetamodelAttribute<MMMessageComponentType, Boolean> isTechnicalAttribute = newAttribute();
	/**
	 * The BusinessComponent that this MessageComponentType is derived from.
	 */
	public final static MetamodelAttribute<MMMessageComponentType, Optional<MMBusinessComponent>> traceAttribute = newAttribute();

	public static MetamodelType<MMMessageComponentType> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(MMMessageComponentType.class);
	}

	/**
	 * The MessageBuildingBlock that is the context for this
	 * MessageComponentType
	 * 
	 * @see MMMessageBuildingBlock#getComplexType()
	 */
	@Opposite(bean = MMMessageBuildingBlock.class, attribute = "complexType")
	public List<MMMessageBuildingBlock> getMessageBuildingBlock();

	/**
	 * A property indicating the absense of a semantic relationship to a
	 * BusinessComponent, i.e. it is not derived from a BusinessComponent
	 */
	@Derived
	public boolean isIsTechnical();

	/**
	 * The BusinessComponent that this MessageComponentType is derived from.
	 * 
	 * @see MMBusinessComponent#getDerivationComponent()
	 */
	@Opposite(bean = MMBusinessComponent.class, attribute = "derivationComponent")
	public Optional<MMBusinessComponent> getTrace();
}