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
import com.tools20022.repository.entity.DateTimePeriod;
import com.tools20022.repository.entity.Jurisdiction;
import com.tools20022.repository.entity.Security;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
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
	protected Security security;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<SecuritiesRestriction, Optional<Security>> mmSecurity = new MMBusinessAssociationEnd<SecuritiesRestriction, Optional<Security>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesRestriction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Security for which restriction information is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Security.mmRestriction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Security.mmObject();
		}

		@Override
		public Optional<Security> getValue(SecuritiesRestriction obj) {
			return obj.getSecurity();
		}

		@Override
		public void setValue(SecuritiesRestriction obj, Optional<Security> value) {
			obj.setSecurity(value.orElse(null));
		}
	};
	protected LegalRestrictionsCode legalRestrictionType;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<SecuritiesRestriction, LegalRestrictionsCode> mmLegalRestrictionType = new MMBusinessAttribute<SecuritiesRestriction, LegalRestrictionsCode>() {
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

		@Override
		public LegalRestrictionsCode getValue(SecuritiesRestriction obj) {
			return obj.getLegalRestrictionType();
		}

		@Override
		public void setValue(SecuritiesRestriction obj, LegalRestrictionsCode value) {
			obj.setLegalRestrictionType(value);
		}
	};
	protected List<Jurisdiction> jurisdiction;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<SecuritiesRestriction, List<Jurisdiction>> mmJurisdiction = new MMBusinessAssociationEnd<SecuritiesRestriction, List<Jurisdiction>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesRestriction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Jurisdiction";
			definition = "Jurisdiction (country, county, state, province, city) where the restriction applies.";
			minOccurs = 1;
			opposite_lazy = () -> Jurisdiction.mmSecuritiesRestriction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Jurisdiction.mmObject();
		}

		@Override
		public List<Jurisdiction> getValue(SecuritiesRestriction obj) {
			return obj.getJurisdiction();
		}

		@Override
		public void setValue(SecuritiesRestriction obj, List<Jurisdiction> value) {
			obj.setJurisdiction(value);
		}
	};
	protected RestrictionTypeCode restrictionType;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<SecuritiesRestriction, RestrictionTypeCode> mmRestrictionType = new MMBusinessAttribute<SecuritiesRestriction, RestrictionTypeCode>() {
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

		@Override
		public RestrictionTypeCode getValue(SecuritiesRestriction obj) {
			return obj.getRestrictionType();
		}

		@Override
		public void setValue(SecuritiesRestriction obj, RestrictionTypeCode value) {
			obj.setRestrictionType(value);
		}
	};
	protected InvestorRestrictionTypeCode investorStatusRestrictionType;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<SecuritiesRestriction, InvestorRestrictionTypeCode> mmInvestorStatusRestrictionType = new MMBusinessAttribute<SecuritiesRestriction, InvestorRestrictionTypeCode>() {
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

		@Override
		public InvestorRestrictionTypeCode getValue(SecuritiesRestriction obj) {
			return obj.getInvestorStatusRestrictionType();
		}

		@Override
		public void setValue(SecuritiesRestriction obj, InvestorRestrictionTypeCode value) {
			obj.setInvestorStatusRestrictionType(value);
		}
	};
	protected DateTimePeriod effectivePeriod;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<SecuritiesRestriction, DateTimePeriod> mmEffectivePeriod = new MMBusinessAttribute<SecuritiesRestriction, DateTimePeriod>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesRestriction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EffectivePeriod";
			definition = "Period during which the restriction applies.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateTimePeriod.mmObject();
		}

		@Override
		public DateTimePeriod getValue(SecuritiesRestriction obj) {
			return obj.getEffectivePeriod();
		}

		@Override
		public void setValue(SecuritiesRestriction obj, DateTimePeriod value) {
			obj.setEffectivePeriod(value);
		}
	};
	protected PercentageRate rate;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<SecuritiesRestriction, PercentageRate> mmRate = new MMBusinessAttribute<SecuritiesRestriction, PercentageRate>() {
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

		@Override
		public PercentageRate getValue(SecuritiesRestriction obj) {
			return obj.getRate();
		}

		@Override
		public void setValue(SecuritiesRestriction obj, PercentageRate value) {
			obj.setRate(value);
		}
	};
	protected InvestorTypeCode investorType;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<SecuritiesRestriction, InvestorTypeCode> mmInvestorType = new MMBusinessAttribute<SecuritiesRestriction, InvestorTypeCode>() {
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

		@Override
		public InvestorTypeCode getValue(SecuritiesRestriction obj) {
			return obj.getInvestorType();
		}

		@Override
		public void setValue(SecuritiesRestriction obj, InvestorTypeCode value) {
			obj.setInvestorType(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesRestriction";
				definition = "Restrictions applicable to the security.";
				associationDomain_lazy = () -> Arrays.asList(Security.mmRestriction, Jurisdiction.mmSecuritiesRestriction);
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

	public Optional<Security> getSecurity() {
		return security == null ? Optional.empty() : Optional.of(security);
	}

	public SecuritiesRestriction setSecurity(Security security) {
		this.security = security;
		return this;
	}

	public LegalRestrictionsCode getLegalRestrictionType() {
		return legalRestrictionType;
	}

	public SecuritiesRestriction setLegalRestrictionType(LegalRestrictionsCode legalRestrictionType) {
		this.legalRestrictionType = Objects.requireNonNull(legalRestrictionType);
		return this;
	}

	public List<Jurisdiction> getJurisdiction() {
		return jurisdiction == null ? jurisdiction = new ArrayList<>() : jurisdiction;
	}

	public SecuritiesRestriction setJurisdiction(List<Jurisdiction> jurisdiction) {
		this.jurisdiction = Objects.requireNonNull(jurisdiction);
		return this;
	}

	public RestrictionTypeCode getRestrictionType() {
		return restrictionType;
	}

	public SecuritiesRestriction setRestrictionType(RestrictionTypeCode restrictionType) {
		this.restrictionType = Objects.requireNonNull(restrictionType);
		return this;
	}

	public InvestorRestrictionTypeCode getInvestorStatusRestrictionType() {
		return investorStatusRestrictionType;
	}

	public SecuritiesRestriction setInvestorStatusRestrictionType(InvestorRestrictionTypeCode investorStatusRestrictionType) {
		this.investorStatusRestrictionType = Objects.requireNonNull(investorStatusRestrictionType);
		return this;
	}

	public DateTimePeriod getEffectivePeriod() {
		return effectivePeriod;
	}

	public SecuritiesRestriction setEffectivePeriod(DateTimePeriod effectivePeriod) {
		this.effectivePeriod = Objects.requireNonNull(effectivePeriod);
		return this;
	}

	public PercentageRate getRate() {
		return rate;
	}

	public SecuritiesRestriction setRate(PercentageRate rate) {
		this.rate = Objects.requireNonNull(rate);
		return this;
	}

	public InvestorTypeCode getInvestorType() {
		return investorType;
	}

	public SecuritiesRestriction setInvestorType(InvestorTypeCode investorType) {
		this.investorType = Objects.requireNonNull(investorType);
		return this;
	}
}