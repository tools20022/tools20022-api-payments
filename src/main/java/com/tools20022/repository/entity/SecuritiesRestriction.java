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

import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.InvestorRestrictionTypeCode;
import com.tools20022.repository.codeset.InvestorTypeCode;
import com.tools20022.repository.codeset.LegalRestrictionsCode;
import com.tools20022.repository.codeset.RestrictionTypeCode;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.entity.SecuritiesRestriction#mmSecurity
 * SecuritiesRestriction.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesRestriction#mmLegalRestrictionType
 * SecuritiesRestriction.mmLegalRestrictionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesRestriction#mmJurisdiction
 * SecuritiesRestriction.mmJurisdiction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesRestriction#mmRestrictionType
 * SecuritiesRestriction.mmRestrictionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesRestriction#mmInvestorStatusRestrictionType
 * SecuritiesRestriction.mmInvestorStatusRestrictionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesRestriction#mmEffectivePeriod
 * SecuritiesRestriction.mmEffectivePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesRestriction#mmRate
 * SecuritiesRestriction.mmRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesRestriction#mmInvestorType
 * SecuritiesRestriction.mmInvestorType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmRestriction
 * Security.mmRestriction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Jurisdiction#mmSecuritiesRestriction
 * Jurisdiction.mmSecuritiesRestriction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	protected Security security;
	/**
	 * Security for which restriction information is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmRestriction
	 * Security.mmRestriction}</li>
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
	public static final MMBusinessAssociationEnd mmSecurity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesRestriction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Security for which restriction information is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.mmRestriction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
		}
	};
	protected LegalRestrictionsCode legalRestrictionType;
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
	public static final MMBusinessAttribute mmLegalRestrictionType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesRestriction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LegalRestrictionType";
			definition = "Specifies the regulatory restrictions applicable to a security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LegalRestrictionsCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesRestriction.class.getMethod("getLegalRestrictionType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.Jurisdiction> jurisdiction;
	/**
	 * Jurisdiction (country, county, state, province, city) where the
	 * restriction applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Jurisdiction#mmSecuritiesRestriction
	 * Jurisdiction.mmSecuritiesRestriction}</li>
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
	public static final MMBusinessAssociationEnd mmJurisdiction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesRestriction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Jurisdiction";
			definition = "Jurisdiction (country, county, state, province, city) where the restriction applies.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Jurisdiction.mmSecuritiesRestriction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Jurisdiction.mmObject();
		}
	};
	protected RestrictionTypeCode restrictionType;
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
	public static final MMBusinessAttribute mmRestrictionType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesRestriction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RestrictionType";
			definition = "Type of the restriction, for example, selling restriction, buying restriction, placing restriction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RestrictionTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesRestriction.class.getMethod("getRestrictionType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected InvestorRestrictionTypeCode investorStatusRestrictionType;
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
	public static final MMBusinessAttribute mmInvestorStatusRestrictionType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesRestriction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestorStatusRestrictionType";
			definition = "Specifies whether the restriction to be applied is relevant for citizen, resident, country.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InvestorRestrictionTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesRestriction.class.getMethod("getInvestorStatusRestrictionType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DateTimePeriod effectivePeriod;
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
	public static final MMBusinessAttribute mmEffectivePeriod = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesRestriction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EffectivePeriod";
			definition = "Period during which the restriction applies.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesRestriction.class.getMethod("getEffectivePeriod", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PercentageRate rate;
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
	public static final MMBusinessAttribute mmRate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesRestriction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Rate";
			definition = "Rate used for the calculation of the restriction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesRestriction.class.getMethod("getRate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected InvestorTypeCode investorType;
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
	public static final MMBusinessAttribute mmInvestorType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesRestriction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestorType";
			definition = "Type of investor that is allowed to hold the security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InvestorTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesRestriction.class.getMethod("getInvestorType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesRestriction";
				definition = "Restrictions applicable to the security.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.mmRestriction, com.tools20022.repository.entity.Jurisdiction.mmSecuritiesRestriction);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesRestriction.mmSecurity, com.tools20022.repository.entity.SecuritiesRestriction.mmLegalRestrictionType,
						com.tools20022.repository.entity.SecuritiesRestriction.mmJurisdiction, com.tools20022.repository.entity.SecuritiesRestriction.mmRestrictionType,
						com.tools20022.repository.entity.SecuritiesRestriction.mmInvestorStatusRestrictionType, com.tools20022.repository.entity.SecuritiesRestriction.mmEffectivePeriod,
						com.tools20022.repository.entity.SecuritiesRestriction.mmRate, com.tools20022.repository.entity.SecuritiesRestriction.mmInvestorType);
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesRestriction.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Security getSecurity() {
		return security;
	}

	public void setSecurity(com.tools20022.repository.entity.Security security) {
		this.security = security;
	}

	public LegalRestrictionsCode getLegalRestrictionType() {
		return legalRestrictionType;
	}

	public void setLegalRestrictionType(LegalRestrictionsCode legalRestrictionType) {
		this.legalRestrictionType = legalRestrictionType;
	}

	public List<Jurisdiction> getJurisdiction() {
		return jurisdiction;
	}

	public void setJurisdiction(List<com.tools20022.repository.entity.Jurisdiction> jurisdiction) {
		this.jurisdiction = jurisdiction;
	}

	public RestrictionTypeCode getRestrictionType() {
		return restrictionType;
	}

	public void setRestrictionType(RestrictionTypeCode restrictionType) {
		this.restrictionType = restrictionType;
	}

	public InvestorRestrictionTypeCode getInvestorStatusRestrictionType() {
		return investorStatusRestrictionType;
	}

	public void setInvestorStatusRestrictionType(InvestorRestrictionTypeCode investorStatusRestrictionType) {
		this.investorStatusRestrictionType = investorStatusRestrictionType;
	}

	public DateTimePeriod getEffectivePeriod() {
		return effectivePeriod;
	}

	public void setEffectivePeriod(com.tools20022.repository.entity.DateTimePeriod effectivePeriod) {
		this.effectivePeriod = effectivePeriod;
	}

	public PercentageRate getRate() {
		return rate;
	}

	public void setRate(PercentageRate rate) {
		this.rate = rate;
	}

	public InvestorTypeCode getInvestorType() {
		return investorType;
	}

	public void setInvestorType(InvestorTypeCode investorType) {
		this.investorType = investorType;
	}
}