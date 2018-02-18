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

import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.metamodel.*;
import java.util.Collections;
import java.util.Date;
import java.util.function.Supplier;
import java.util.List;
import java.util.Optional;

/**
 * A quantity or amount measured with respect to another measured quantity or
 * amount
 */
public class MMRate extends MMDecimal {

	/**
	 * specifies the ratio between the base value and the actual value
	 */
	public final static MetamodelAttribute<MMRate, Double> baseValueAttribute = newAttribute();
	/**
	 * specifies unit code required to qualify this rate
	 */
	public final static MetamodelAttribute<MMRate, Optional<String>> baseUnitCodeAttribute = newAttribute();
	protected Double baseValue;
	protected String baseUnitCode;
	protected String minInclusive;
	protected String minExclusive;
	protected String maxInclusive;
	protected String maxExclusive;
	protected Integer totalDigits;
	protected Integer fractionDigits;
	protected String pattern;
	protected Supplier<MMDataDictionary> dataDictionary_lazy;
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
	public MMDataDictionary getContainer() {
		return getDataDictionary();
	}

	@Override
	public MetamodelType<? extends MMRate> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMRate> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(MMRate.class);
	}

	/**
	 * specifies the ratio between the base value and the actual value
	 */
	public Double getBaseValue() {
		return baseValue;
	}

	/**
	 * specifies unit code required to qualify this rate
	 */
	public Optional<String> getBaseUnitCode() {
		return baseUnitCode == null ? Optional.empty() : Optional.of(baseUnitCode);
	}

	@Override
	public Optional<String> getMinInclusive() {
		return minInclusive == null ? Optional.empty() : Optional.of(minInclusive);
	}

	@Override
	public Optional<String> getMinExclusive() {
		return minExclusive == null ? Optional.empty() : Optional.of(minExclusive);
	}

	@Override
	public Optional<String> getMaxInclusive() {
		return maxInclusive == null ? Optional.empty() : Optional.of(maxInclusive);
	}

	@Override
	public Optional<String> getMaxExclusive() {
		return maxExclusive == null ? Optional.empty() : Optional.of(maxExclusive);
	}

	@Override
	public Optional<Integer> getTotalDigits() {
		return totalDigits == null ? Optional.empty() : Optional.of(totalDigits);
	}

	@Override
	public Optional<Integer> getFractionDigits() {
		return fractionDigits == null ? Optional.empty() : Optional.of(fractionDigits);
	}

	@Override
	public Optional<String> getPattern() {
		return pattern == null ? Optional.empty() : Optional.of(pattern);
	}

	@Override
	public MMDataDictionary getDataDictionary() {
		return dataDictionary_lazy.get();
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