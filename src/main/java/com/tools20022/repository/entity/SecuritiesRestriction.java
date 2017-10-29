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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.InvestorRestrictionTypeCode;
import com.tools20022.repository.codeset.InvestorTypeCode;
import com.tools20022.repository.codeset.LegalRestrictionsCode;
import com.tools20022.repository.codeset.RestrictionTypeCode;
import com.tools20022.repository.datatype.PercentageRate;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Restrictions applicable to the security.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesRestriction"
 * src="doc-files/SecuritiesRestriction.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesRestriction#Security
 * SecuritiesRestriction.Security}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesRestriction#LegalRestrictionType
 * SecuritiesRestriction.LegalRestrictionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesRestriction#Jurisdiction
 * SecuritiesRestriction.Jurisdiction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesRestriction#RestrictionType
 * SecuritiesRestriction.RestrictionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesRestriction#InvestorStatusRestrictionType
 * SecuritiesRestriction.InvestorStatusRestrictionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesRestriction#EffectivePeriod
 * SecuritiesRestriction.EffectivePeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesRestriction#Rate
 * SecuritiesRestriction.Rate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesRestriction#InvestorType
 * SecuritiesRestriction.InvestorType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#Restriction
 * Security.Restriction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Jurisdiction#SecuritiesRestriction
 * Jurisdiction.SecuritiesRestriction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesRestriction"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Restrictions applicable to the security."</li>
 * </ul>
 */
public class SecuritiesRestriction {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Security for which restriction information is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#Restriction
	 * Security.Restriction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesRestriction
	 * SecuritiesRestriction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Security"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security for which restriction information is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Security = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesRestriction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Security for which restriction information is provided.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Security.Restriction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the regulatory restrictions applicable to a security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.LegalRestrictionsCode
	 * LegalRestrictionsCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesRestriction
	 * SecuritiesRestriction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegalRestrictionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the regulatory restrictions applicable to a security."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute LegalRestrictionType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesRestriction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LegalRestrictionType";
			definition = "Specifies the regulatory restrictions applicable to a security.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> LegalRestrictionsCode.mmObject();
		}
	};
	/**
	 * Jurisdiction (country, county, state, province, city) where the
	 * restriction applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Jurisdiction#SecuritiesRestriction
	 * Jurisdiction.SecuritiesRestriction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Jurisdiction
	 * Jurisdiction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesRestriction
	 * SecuritiesRestriction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Jurisdiction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Jurisdiction (country, county, state, province, city) where the restriction applies."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Jurisdiction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesRestriction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Jurisdiction";
			definition = "Jurisdiction (country, county, state, province, city) where the restriction applies.";
			minOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Jurisdiction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Jurisdiction.SecuritiesRestriction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Type of the restriction, for example, selling restriction, buying
	 * restriction, placing restriction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RestrictionTypeCode
	 * RestrictionTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesRestriction
	 * SecuritiesRestriction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RestrictionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of the restriction, for example, selling restriction, buying restriction, placing restriction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RestrictionType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesRestriction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RestrictionType";
			definition = "Type of the restriction, for example, selling restriction, buying restriction, placing restriction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> RestrictionTypeCode.mmObject();
		}
	};
	/**
	 * Specifies whether the restriction to be applied is relevant for citizen,
	 * resident, country.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InvestorRestrictionTypeCode
	 * InvestorRestrictionTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesRestriction
	 * SecuritiesRestriction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestorStatusRestrictionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the restriction to be applied is relevant for citizen, resident, country."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute InvestorStatusRestrictionType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesRestriction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestorStatusRestrictionType";
			definition = "Specifies whether the restriction to be applied is relevant for citizen, resident, country.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> InvestorRestrictionTypeCode.mmObject();
		}
	};
	/**
	 * Period during which the restriction applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesRestriction
	 * SecuritiesRestriction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectivePeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period during which the restriction applies."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute EffectivePeriod = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesRestriction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EffectivePeriod";
			definition = "Period during which the restriction applies.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> DateTimePeriod.mmObject();
		}
	};
	/**
	 * Rate used for the calculation of the restriction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesRestriction
	 * SecuritiesRestriction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate used for the calculation of the restriction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Rate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesRestriction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Rate";
			definition = "Rate used for the calculation of the restriction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Type of investor that is allowed to hold the security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InvestorTypeCode
	 * InvestorTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesRestriction
	 * SecuritiesRestriction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestorType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of investor that is allowed to hold the security."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute InvestorType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesRestriction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestorType";
			definition = "Type of investor that is allowed to hold the security.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> InvestorTypeCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesRestriction";
				definition = "Restrictions applicable to the security.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.Restriction, com.tools20022.repository.entity.Jurisdiction.SecuritiesRestriction);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesRestriction.Security, com.tools20022.repository.entity.SecuritiesRestriction.LegalRestrictionType,
						com.tools20022.repository.entity.SecuritiesRestriction.Jurisdiction, com.tools20022.repository.entity.SecuritiesRestriction.RestrictionType,
						com.tools20022.repository.entity.SecuritiesRestriction.InvestorStatusRestrictionType, com.tools20022.repository.entity.SecuritiesRestriction.EffectivePeriod,
						com.tools20022.repository.entity.SecuritiesRestriction.Rate, com.tools20022.repository.entity.SecuritiesRestriction.InvestorType);
			}
		});
		return mmObject_lazy.get();
	}
}