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
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.codeset.CRSSourceStatusCode;
import com.tools20022.repository.codeset.CRSStatusCode;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.entity.InvestmentAccountPartyRole;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;

/**
 * Common Reporting Standard (CRS) status and the status source of the investor.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CRSStatus" src="doc-files/CRSStatus.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CRSStatus#mmCRSStatus
 * CRSStatus.mmCRSStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CRSStatus#mmExceptionalReportingCountry
 * CRSStatus.mmExceptionalReportingCountry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CRSStatus#mmCRSSourceStatus
 * CRSStatus.mmCRSSourceStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CRSStatus#mmCRSReportingDate
 * CRSStatus.mmCRSReportingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CRSStatus#mmInvestmentAccountParty
 * CRSStatus.mmInvestmentAccountParty}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole#mmCRSStatus
 * InvestmentAccountPartyRole.mmCRSStatus}</li>
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
 * "CRSStatus"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Common Reporting Standard (CRS) status and the status source of the investor."
 * </li>
 * </ul>
 */
public class CRSStatus {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CRSStatusCode cRSStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CRSStatusCode
	 * CRSStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.CRSStatus
	 * CRSStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CRSStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Common Reporting Standard (CRS) status of the investor."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CRSStatus, CRSStatusCode> mmCRSStatus = new MMBusinessAttribute<CRSStatus, CRSStatusCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CRSStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CRSStatus";
			definition = "Common Reporting Standard (CRS) status of the investor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CRSStatusCode.mmObject();
		}

		@Override
		public CRSStatusCode getValue(CRSStatus obj) {
			return obj.getCRSStatus();
		}

		@Override
		public void setValue(CRSStatus obj, CRSStatusCode value) {
			obj.setCRSStatus(value);
		}
	};
	protected CountryCode exceptionalReportingCountry;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.CRSStatus
	 * CRSStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExceptionalReportingCountry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reporting country for the CRS status when there is an exception at the country level."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CRSStatus, CountryCode> mmExceptionalReportingCountry = new MMBusinessAttribute<CRSStatus, CountryCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CRSStatus.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExceptionalReportingCountry";
			definition = "Reporting country for the CRS status when there is an exception at the country level.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		@Override
		public CountryCode getValue(CRSStatus obj) {
			return obj.getExceptionalReportingCountry();
		}

		@Override
		public void setValue(CRSStatus obj, CountryCode value) {
			obj.setExceptionalReportingCountry(value);
		}
	};
	protected CRSSourceStatusCode cRSSourceStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CRSSourceStatusCode
	 * CRSSourceStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.CRSStatus
	 * CRSStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CRSSourceStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Source of the Common Reporting Standard (CRS) status expressed as a code."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CRSStatus, CRSSourceStatusCode> mmCRSSourceStatus = new MMBusinessAttribute<CRSStatus, CRSSourceStatusCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CRSStatus.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CRSSourceStatus";
			definition = "Source of the Common Reporting Standard (CRS) status expressed as a code.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CRSSourceStatusCode.mmObject();
		}

		@Override
		public CRSSourceStatusCode getValue(CRSStatus obj) {
			return obj.getCRSSourceStatus();
		}

		@Override
		public void setValue(CRSStatus obj, CRSSourceStatusCode value) {
			obj.setCRSSourceStatus(value);
		}
	};
	protected ISODate cRSReportingDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.CRSStatus
	 * CRSStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CRSReportingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date provided by the account owner to inform the account servicer of the date on which the holdings must be reported before the account is subsequently closed."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CRSStatus, ISODate> mmCRSReportingDate = new MMBusinessAttribute<CRSStatus, ISODate>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CRSStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CRSReportingDate";
			definition = "Date provided by the account owner to inform the account servicer of the date on which the holdings must be reported before the account is subsequently closed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(CRSStatus obj) {
			return obj.getCRSReportingDate();
		}

		@Override
		public void setValue(CRSStatus obj, ISODate value) {
			obj.setCRSReportingDate(value);
		}
	};
	protected InvestmentAccountPartyRole investmentAccountParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole#mmCRSStatus
	 * InvestmentAccountPartyRole.mmCRSStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole
	 * InvestmentAccountPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.CRSStatus
	 * CRSStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccountParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Common Reporting Standard (CRS) status linked to an investment account and played by a party in that context."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CRSStatus, InvestmentAccountPartyRole> mmInvestmentAccountParty = new MMBusinessAssociationEnd<CRSStatus, InvestmentAccountPartyRole>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CRSStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentAccountParty";
			definition = "Common Reporting Standard (CRS) status linked to an investment account and played by a party in that context.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> InvestmentAccountPartyRole.mmCRSStatus;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> InvestmentAccountPartyRole.mmObject();
		}

		@Override
		public InvestmentAccountPartyRole getValue(CRSStatus obj) {
			return obj.getInvestmentAccountParty();
		}

		@Override
		public void setValue(CRSStatus obj, InvestmentAccountPartyRole value) {
			obj.setInvestmentAccountParty(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CRSStatus";
				definition = "Common Reporting Standard (CRS) status and the status source of the investor.";
				associationDomain_lazy = () -> Arrays.asList(InvestmentAccountPartyRole.mmCRSStatus);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CRSStatus.mmCRSStatus, com.tools20022.repository.entity.CRSStatus.mmExceptionalReportingCountry,
						com.tools20022.repository.entity.CRSStatus.mmCRSSourceStatus, com.tools20022.repository.entity.CRSStatus.mmCRSReportingDate, com.tools20022.repository.entity.CRSStatus.mmInvestmentAccountParty);
			}

			@Override
			public Class<?> getInstanceClass() {
				return CRSStatus.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CRSStatusCode getCRSStatus() {
		return cRSStatus;
	}

	public CRSStatus setCRSStatus(CRSStatusCode cRSStatus) {
		this.cRSStatus = Objects.requireNonNull(cRSStatus);
		return this;
	}

	public CountryCode getExceptionalReportingCountry() {
		return exceptionalReportingCountry;
	}

	public CRSStatus setExceptionalReportingCountry(CountryCode exceptionalReportingCountry) {
		this.exceptionalReportingCountry = Objects.requireNonNull(exceptionalReportingCountry);
		return this;
	}

	public CRSSourceStatusCode getCRSSourceStatus() {
		return cRSSourceStatus;
	}

	public CRSStatus setCRSSourceStatus(CRSSourceStatusCode cRSSourceStatus) {
		this.cRSSourceStatus = Objects.requireNonNull(cRSSourceStatus);
		return this;
	}

	public ISODate getCRSReportingDate() {
		return cRSReportingDate;
	}

	public CRSStatus setCRSReportingDate(ISODate cRSReportingDate) {
		this.cRSReportingDate = Objects.requireNonNull(cRSReportingDate);
		return this;
	}

	public InvestmentAccountPartyRole getInvestmentAccountParty() {
		return investmentAccountParty;
	}

	public CRSStatus setInvestmentAccountParty(InvestmentAccountPartyRole investmentAccountParty) {
		this.investmentAccountParty = Objects.requireNonNull(investmentAccountParty);
		return this;
	}
}