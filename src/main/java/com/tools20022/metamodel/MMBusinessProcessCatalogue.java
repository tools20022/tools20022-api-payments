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
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.core.metamodel.Metamodel.MetamodelConstraint;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.core.metamodel.Opposite;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newConstraint;
import com.tools20022.metamodel.constraints.BusinessProcessCatalogueEntriesHaveUniqueName;
import com.tools20022.metamodel.MMModelEntity;
import com.tools20022.metamodel.MMRepository;
import com.tools20022.metamodel.MMTopLevelCatalogueEntry;
import com.tools20022.metamodel.StandardMetamodel2013;
import java.util.Collections;
import java.util.function.Supplier;
import java.util.List;
import java.util.Optional;

/**
 * Part of the ISO 20022 Repository that contains all Business Process and
 * BusinessTransaction related items.
 */
public class MMBusinessProcessCatalogue implements MMModelEntity {

	/**
	 * The Repository that owns the BusinessProcessCatalogue.
	 */
	public final static MetamodelAttribute<MMBusinessProcessCatalogue, MMRepository> repositoryAttribute = newAttribute();
	/**
	 * a TopLevelCatalogueEntry in the BusinessProcessCatalague
	 */
	public final static MetamodelAttribute<MMBusinessProcessCatalogue, List<MMTopLevelCatalogueEntry>> topLevelCatalogueEntryAttribute = newAttribute();
	/**
	 * All TopLevelCatalogueEntries of a BusinessProcessCatalogue must have
	 * different names topLevelCatalogueEntry-&gt;forAll(entry1,entry2 | entry1
	 * &lt;&gt; entry2 implies entry1.name &lt;&gt; entry2.name)
	 */
	public final static MetamodelConstraint<MMBusinessProcessCatalogue> checkEntriesHaveUniqueName = newConstraint(b -> {
		new BusinessProcessCatalogueEntriesHaveUniqueName().accept(b);
	});
	protected Supplier<MMRepository> repository_lazy;
	protected Supplier<List<MMTopLevelCatalogueEntry>> topLevelCatalogueEntry_lazy;
	protected Supplier<List<MMModelEntity>> nextVersions_lazy;
	protected Supplier<MMModelEntity> previousVersion_lazy;
	protected String objectIdentifier;

	@Override
	public MMRepository getContainer() {
		return getRepository();
	}

	@Override
	public MetamodelType<? extends MMBusinessProcessCatalogue> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMBusinessProcessCatalogue> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(MMBusinessProcessCatalogue.class);
	}

	/**
	 * The Repository that owns the BusinessProcessCatalogue.
	 * 
	 * @see MMRepository#getBusinessProcessCatalogue()
	 */
	@Opposite(bean = MMRepository.class, attribute = "businessProcessCatalogue")
	@Container
	public MMRepository getRepository() {
		return repository_lazy.get();
	}

	/**
	 * a TopLevelCatalogueEntry in the BusinessProcessCatalague
	 * 
	 * @see MMTopLevelCatalogueEntry#getBusinessProcessCatalogue()
	 */
	@Opposite(bean = MMTopLevelCatalogueEntry.class, attribute = "businessProcessCatalogue")
	@Containment
	public List<MMTopLevelCatalogueEntry> getTopLevelCatalogueEntry() {
		return topLevelCatalogueEntry_lazy == null ? Collections.emptyList() : topLevelCatalogueEntry_lazy.get();
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