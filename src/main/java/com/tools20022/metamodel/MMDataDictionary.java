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
import com.tools20022.core.metamodel.Containment;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.core.metamodel.Opposite;
import com.tools20022.metamodel.MMModelEntity;
import com.tools20022.metamodel.MMRepository;
import com.tools20022.metamodel.MMTopLevelDictionaryEntry;
import com.tools20022.metamodel.StandardMetamodel2013;
import java.util.Collections;
import java.util.function.Supplier;
import java.util.List;
import java.util.Optional;

/**
 * Part of the ISO 20022 Repository that contains all items that can be re-used
 * during business process modelling and message definition activities.
 */
public class MMDataDictionary implements MMModelEntity {

	protected Supplier<List<MMTopLevelDictionaryEntry>> topLevelDictionaryEntry_lazy;
	protected Supplier<MMRepository> repository_lazy;
	protected Supplier<List<MMModelEntity>> nextVersions_lazy;
	protected Supplier<MMModelEntity> previousVersion_lazy;
	protected String objectIdentifier;

	@Override
	public MMRepository getContainer() {
		return getRepository();
	}

	@Override
	public MetamodelType<? extends MMDataDictionary> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMDataDictionary> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(MMDataDictionary.class);
	}

	/**
	 * a TopLevelDictionaryEntry in the DataDictionary
	 * 
	 * @see MMTopLevelDictionaryEntry#getDataDictionary()
	 */
	@Opposite(bean = MMTopLevelDictionaryEntry.class, attribute = "dataDictionary")
	@Containment
	public List<MMTopLevelDictionaryEntry> getTopLevelDictionaryEntry() {
		return topLevelDictionaryEntry_lazy == null ? Collections.emptyList() : topLevelDictionaryEntry_lazy.get();
	}

	/**
	 * The Repository that owns the DataDictionary.
	 * 
	 * @see MMRepository#getDataDictionary()
	 */
	@Opposite(bean = MMRepository.class, attribute = "dataDictionary")
	@Container
	public MMRepository getRepository() {
		return repository_lazy.get();
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