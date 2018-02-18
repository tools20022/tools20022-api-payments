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
import com.tools20022.repository.codeset.FATCASourceStatusCode;
import com.tools20022.repository.codeset.FATCAStatusCode;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

/**
 * Foreign Account Tax Compliance Act (FATCA) status and the status source of
 * the investor.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="FATCAStatus" src="doc-files/FATCAStatus.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.FATCAStatus#mmFATCAStatus
 * FATCAStatus.mmFATCAStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FATCAStatus#mmFATCASourceStatus
 * FATCAStatus.mmFATCASourceStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FATCAStatus#mmInvestmentAccountParty
 * FATCAStatus.mmInvestmentAccountParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FATCAStatus#mmFATCAReportingDate
 * FATCAStatus.mmFATCAReportingDate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole#mmFATCAStatus
 * InvestmentAccountPartyRole.mmFATCAStatus}</li>
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
 * "FATCAStatus"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Foreign Account Tax Compliance Act (FATCA) status and the status source of the investor."
 * </li>
 * </ul>
 */
public class FATCAStatus {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected FATCAStatusCode fATCAStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FATCAStatusCode
	 * FATCAStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.FATCAStatus FATCAStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FATCAStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Foreign Account Tax Compliance Act (FATCA) status of the investor."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmFATCAStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.FATCAStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FATCAStatus";
			definition = "Foreign Account Tax Compliance Act (FATCA) status of the investor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FATCAStatusCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return FATCAStatus.class.getMethod("getFATCAStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected FATCASourceStatusCode fATCASourceStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FATCASourceStatusCode
	 * FATCASourceStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.FATCAStatus FATCAStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FATCASourceStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Source of the Foreign Account Tax Compliance Act (FATCA) status."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmFATCASourceStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.FATCAStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FATCASourceStatus";
			definition = "Source of the Foreign Account Tax Compliance Act (FATCA) status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FATCASourceStatusCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return FATCAStatus.class.getMethod("getFATCASourceStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.InvestmentAccountPartyRole> investmentAccountParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole#mmFATCAStatus
	 * InvestmentAccountPartyRole.mmFATCAStatus}</li>
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
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.FATCAStatus FATCAStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccountParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Foreign Account Tax Compliance Act (FATCA) status linked to an investment account and played by a party in that context."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmInvestmentAccountParty = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.FATCAStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentAccountParty";
			definition = "Foreign Account Tax Compliance Act (FATCA) status linked to an investment account and played by a party in that context.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccountPartyRole.mmFATCAStatus;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentAccountPartyRole.mmObject();
		}
	};
	protected ISODate fATCAReportingDate;
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
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.FATCAStatus FATCAStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FATCAReportingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date provided by the account owner to inform the account servicer of the date on which the holdings must be reported before the account is subsequently closed."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmFATCAReportingDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.FATCAStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FATCAReportingDate";
			definition = "Date provided by the account owner to inform the account servicer of the date on which the holdings must be reported before the account is subsequently closed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return FATCAStatus.class.getMethod("getFATCAReportingDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FATCAStatus";
				definition = "Foreign Account Tax Compliance Act (FATCA) status and the status source of the investor.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentAccountPartyRole.mmFATCAStatus);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.FATCAStatus.mmFATCAStatus, com.tools20022.repository.entity.FATCAStatus.mmFATCASourceStatus,
						com.tools20022.repository.entity.FATCAStatus.mmInvestmentAccountParty, com.tools20022.repository.entity.FATCAStatus.mmFATCAReportingDate);
			}

			@Override
			public Class<?> getInstanceClass() {
				return FATCAStatus.class;
			}
		});
		return mmObject_lazy.get();
	}

	public FATCAStatusCode getFATCAStatus() {
		return fATCAStatus;
	}

	public FATCAStatus setFATCAStatus(FATCAStatusCode fATCAStatus) {
		this.fATCAStatus = Objects.requireNonNull(fATCAStatus);
		return this;
	}

	public FATCASourceStatusCode getFATCASourceStatus() {
		return fATCASourceStatus;
	}

	public FATCAStatus setFATCASourceStatus(FATCASourceStatusCode fATCASourceStatus) {
		this.fATCASourceStatus = Objects.requireNonNull(fATCASourceStatus);
		return this;
	}

	public List<InvestmentAccountPartyRole> getInvestmentAccountParty() {
		return investmentAccountParty == null ? investmentAccountParty = new ArrayList<>() : investmentAccountParty;
	}

	public FATCAStatus setInvestmentAccountParty(List<com.tools20022.repository.entity.InvestmentAccountPartyRole> investmentAccountParty) {
		this.investmentAccountParty = Objects.requireNonNull(investmentAccountParty);
		return this;
	}

	public ISODate getFATCAReportingDate() {
		return fATCAReportingDate;
	}

	public FATCAStatus setFATCAReportingDate(ISODate fATCAReportingDate) {
		this.fATCAReportingDate = Objects.requireNonNull(fATCAReportingDate);
		return this;
	}
}