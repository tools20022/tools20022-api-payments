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
import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.core.metamodel.Opposite;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.metamodel.MMBusinessProcessCatalogue;
import com.tools20022.metamodel.MMDataDictionary;
import com.tools20022.metamodel.MMModelEntity;
import com.tools20022.metamodel.StandardMetamodel2013;
import java.util.Collections;
import java.util.function.Supplier;
import java.util.List;
import java.util.Optional;

/**
 * place where all RepositoryConcepts are stored
 */
public class MMRepository implements MMModelEntity {

	/**
	 * the DataDictionary owned by the ISO 20022 Repository
	 */
	public final static MetamodelAttribute<MMRepository, MMDataDictionary> dataDictionaryAttribute = newAttribute();
	/**
	 * the BusinessProcessCatalogue owned by the ISO 20022 Repository
	 */
	public final static MetamodelAttribute<MMRepository, MMBusinessProcessCatalogue> businessProcessCatalogueAttribute = newAttribute();
	protected Supplier<MMDataDictionary> dataDictionary_lazy;
	protected Supplier<MMBusinessProcessCatalogue> businessProcessCatalogue_lazy;
	protected Supplier<List<MMModelEntity>> nextVersions_lazy;
	protected Supplier<MMModelEntity> previousVersion_lazy;
	protected String objectIdentifier;

	@Override
	public GeneratedMetamodelBean getContainer() {
		return null;
	}

	@Override
	public MetamodelType<? extends MMRepository> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMRepository> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(MMRepository.class);
	}

	/**
	 * the DataDictionary owned by the ISO 20022 Repository
	 * 
	 * @see MMDataDictionary#getRepository()
	 */
	@Opposite(bean = MMDataDictionary.class, attribute = "repository")
	@Containment
	public MMDataDictionary getDataDictionary() {
		return dataDictionary_lazy.get();
	}

	/**
	 * the BusinessProcessCatalogue owned by the ISO 20022 Repository
	 * 
	 * @see MMBusinessProcessCatalogue#getRepository()
	 */
	@Opposite(bean = MMBusinessProcessCatalogue.class, attribute = "repository")
	@Containment
	public MMBusinessProcessCatalogue getBusinessProcessCatalogue() {
		return businessProcessCatalogue_lazy.get();
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