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
import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.core.metamodel.Metamodel.MetamodelConstraint;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.core.metamodel.Opposite;
import com.tools20022.core.metamodel.OrphanMetamodelType;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newConstraint;
import com.tools20022.metamodel.constraints.GeneratedForDerivation;
import com.tools20022.metamodel.derived.DeriveMMSyntax_generatedFor;
import com.tools20022.metamodel.MMEncoding;
import com.tools20022.metamodel.MMMessageSet;
import com.tools20022.metamodel.MMModelEntity;
import com.tools20022.metamodel.StandardMetamodel2013;
import java.util.Collections;
import java.util.function.Supplier;
import java.util.List;
import java.util.Optional;

/**
 * a particular syntax for a MessageInstance
 */
public class MMSyntax implements OrphanMetamodelType, MMModelEntity {

	/**
	 * the set of possible encodings for a given Syntax
	 */
	public final static MetamodelAttribute<MMSyntax, List<MMEncoding>> possibleEncodingsAttribute = newAttribute();
	/**
	 * the scheme in which a syntax is encoded
	 */
	public final static MetamodelAttribute<MMSyntax, List<MMMessageSet>> generatedForAttribute = newAttribute();
	/**
	 * the syntax that is valid for a MessageSet, based on the Encoding used
	 * generatedFor-&gt; asBag()=possibleEncodings.messageSet
	 */
	public final static MetamodelConstraint<MMSyntax> checkGeneratedForDerivation = newConstraint(b -> {
		new GeneratedForDerivation().accept(b);
	});
	protected Supplier<List<MMEncoding>> possibleEncodings_lazy;
	protected Supplier<List<MMModelEntity>> nextVersions_lazy;
	protected Supplier<MMModelEntity> previousVersion_lazy;
	protected String objectIdentifier;

	@Override
	public GeneratedMetamodelBean getContainer() {
		return null;
	}

	@Override
	public MetamodelType<? extends MMSyntax> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMSyntax> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(MMSyntax.class);
	}

	/**
	 * the set of possible encodings for a given Syntax
	 * 
	 * @see MMEncoding#getSyntax()
	 */
	@Opposite(bean = MMEncoding.class, attribute = "syntax")
	public List<MMEncoding> getPossibleEncodings() {
		return possibleEncodings_lazy == null ? Collections.emptyList() : possibleEncodings_lazy.get();
	}

	/**
	 * the scheme in which a syntax is encoded
	 * 
	 * @see MMMessageSet#getGeneratedSyntax()
	 */
	@Derived
	@Opposite(bean = MMMessageSet.class, attribute = "generatedSyntax")
	public List<MMMessageSet> getGeneratedFor() {
		return (new DeriveMMSyntax_generatedFor()).apply(this);
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