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

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.core.metamodel.Opposite;
import com.tools20022.core.metamodel.OrphanMetamodelType;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.metamodel.MMMessageSet;
import com.tools20022.metamodel.MMModelEntity;
import com.tools20022.metamodel.MMSyntax;
import com.tools20022.metamodel.StandardMetamodel2013;
import java.util.Collections;
import java.util.function.Supplier;
import java.util.List;
import java.util.Optional;

/**
 * A particular set of encoding rules for a MessageInstance.
 */
public class MMEncoding implements OrphanMetamodelType, MMModelEntity {

	/**
	 * The MessageSets for which this Encoding is a valid ISO 20022 encoding
	 */
	public final static MetamodelAttribute<MMEncoding, List<MMMessageSet>> messageSetAttribute = newAttribute();
	/**
	 * The source syntax on which an encoding applies
	 */
	public final static MetamodelAttribute<MMEncoding, MMSyntax> syntaxAttribute = newAttribute();
	protected Supplier<List<MMMessageSet>> messageSet_lazy;
	protected Supplier<MMSyntax> syntax_lazy;
	protected Supplier<List<MMModelEntity>> nextVersions_lazy;
	protected Supplier<MMModelEntity> previousVersion_lazy;
	protected String objectIdentifier;

	@Override
	public GeneratedMetamodelBean getContainer() {
		return null;
	}

	@Override
	public MetamodelType<? extends MMEncoding> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMEncoding> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(MMEncoding.class);
	}

	/**
	 * The MessageSets for which this Encoding is a valid ISO 20022 encoding
	 * 
	 * @see MMMessageSet#getValidEncoding()
	 */
	@Opposite(bean = MMMessageSet.class, attribute = "validEncoding")
	public List<MMMessageSet> getMessageSet() {
		return messageSet_lazy == null ? Collections.emptyList() : messageSet_lazy.get();
	}

	/**
	 * The source syntax on which an encoding applies
	 * 
	 * @see MMSyntax#getPossibleEncodings()
	 */
	@Opposite(bean = MMSyntax.class, attribute = "possibleEncodings")
	public MMSyntax getSyntax() {
		return syntax_lazy.get();
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