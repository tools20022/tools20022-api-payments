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
import com.tools20022.repository.codeset.FATCAFormTypeCode;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.AccountPartyRole;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Specifies roles played by a party that are related to an investment account.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="InvestmentAccountPartyRole"
 * src="doc-files/InvestmentAccountPartyRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.AccountPartyRole
 * AccountPartyRole}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole#mmOwnershipBeneficiaryRate
 * InvestmentAccountPartyRole.mmOwnershipBeneficiaryRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole#mmInvestmentAccount
 * InvestmentAccountPartyRole.mmInvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole#mmFATCAFormType
 * InvestmentAccountPartyRole.mmFATCAFormType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole#mmFATCAStatus
 * InvestmentAccountPartyRole.mmFATCAStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole#mmCRSStatus
 * InvestmentAccountPartyRole.mmCRSStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmInvestmentAccountPartyRole
 * InvestmentAccount.mmInvestmentAccountPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FATCAStatus#mmInvestmentAccountParty
 * FATCAStatus.mmInvestmentAccountParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CRSStatus#mmInvestmentAccountParty
 * CRSStatus.mmInvestmentAccountParty}</li>
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
 * "InvestmentAccountPartyRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies roles played by a party that are related to an investment account."
 * </li>
 * </ul>
 */
public class InvestmentAccountPartyRole extends AccountPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected PercentageRate ownershipBeneficiaryRate;
	/**
	 * Percentage of ownership or of beneficial ownership of the shares/units in
	 * the account. All subsequent subscriptions and or redemptions will be
	 * allocated using the same percentage.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole
	 * InvestmentAccountPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OwnershipBeneficiaryRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage of ownership or of beneficial ownership of the shares/units in the account. All subsequent subscriptions and or redemptions will be allocated using the same percentage."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmOwnershipBeneficiaryRate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentAccountPartyRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OwnershipBeneficiaryRate";
			definition = "Percentage of ownership or of beneficial ownership of the shares/units in the account. All subsequent subscriptions and or redemptions will be allocated using the same percentage.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentAccountPartyRole.class.getMethod("getOwnershipBeneficiaryRate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.InvestmentAccount> investmentAccount;
	/**
	 * Specifies the account for which the party plays a role. It is derived
	 * from the association between AccountPartyRole and Account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmInvestmentAccountPartyRole
	 * InvestmentAccount.mmInvestmentAccountPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole
	 * InvestmentAccountPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the account for which the party plays a role. It is derived from the association between AccountPartyRole and Account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmInvestmentAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentAccountPartyRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentAccount";
			definition = "Specifies the account for which the party plays a role. It is derived from the association between AccountPartyRole and Account.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.mmInvestmentAccountPartyRole;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.mmObject();
		}
	};
	protected FATCAFormTypeCode fATCAFormType;
	/**
	 * Type of Foreign Account Tax Compliance Act (FATCA) form submitted by the
	 * investor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FATCAFormTypeCode
	 * FATCAFormTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole
	 * InvestmentAccountPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FATCAFormType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of Foreign Account Tax Compliance Act (FATCA) form submitted by the investor."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmFATCAFormType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentAccountPartyRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FATCAFormType";
			definition = "Type of Foreign Account Tax Compliance Act (FATCA) form submitted by the investor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FATCAFormTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentAccountPartyRole.class.getMethod("getFATCAFormType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.FATCAStatus> fATCAStatus;
	/**
	 * Foreign Account Tax Compliance Act (FATCA) status of the investor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.FATCAStatus#mmInvestmentAccountParty
	 * FATCAStatus.mmInvestmentAccountParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.FATCAStatus
	 * FATCAStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole
	 * InvestmentAccountPartyRole}</li>
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
	public static final MMBusinessAssociationEnd mmFATCAStatus = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentAccountPartyRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FATCAStatus";
			definition = "Foreign Account Tax Compliance Act (FATCA) status of the investor.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.FATCAStatus.mmInvestmentAccountParty;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.FATCAStatus.mmObject();
		}
	};
	protected CRSStatus cRSStatus;
	/**
	 * Common Reporting Standard (CRS) status of the investor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CRSStatus#mmInvestmentAccountParty
	 * CRSStatus.mmInvestmentAccountParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CRSStatus CRSStatus}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole
	 * InvestmentAccountPartyRole}</li>
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
	public static final MMBusinessAssociationEnd mmCRSStatus = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentAccountPartyRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CRSStatus";
			definition = "Common Reporting Standard (CRS) status of the investor.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CRSStatus.mmInvestmentAccountParty;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CRSStatus.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvestmentAccountPartyRole";
				definition = "Specifies roles played by a party that are related to an investment account.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentAccount.mmInvestmentAccountPartyRole, com.tools20022.repository.entity.FATCAStatus.mmInvestmentAccountParty,
						com.tools20022.repository.entity.CRSStatus.mmInvestmentAccountParty);
				superType_lazy = () -> AccountPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentAccountPartyRole.mmOwnershipBeneficiaryRate, com.tools20022.repository.entity.InvestmentAccountPartyRole.mmInvestmentAccount,
						com.tools20022.repository.entity.InvestmentAccountPartyRole.mmFATCAFormType, com.tools20022.repository.entity.InvestmentAccountPartyRole.mmFATCAStatus,
						com.tools20022.repository.entity.InvestmentAccountPartyRole.mmCRSStatus);
			}

			@Override
			public Class<?> getInstanceClass() {
				return InvestmentAccountPartyRole.class;
			}
		});
		return mmObject_lazy.get();
	}

	public PercentageRate getOwnershipBeneficiaryRate() {
		return ownershipBeneficiaryRate;
	}

	public void setOwnershipBeneficiaryRate(PercentageRate ownershipBeneficiaryRate) {
		this.ownershipBeneficiaryRate = ownershipBeneficiaryRate;
	}

	public List<InvestmentAccount> getInvestmentAccount() {
		return investmentAccount;
	}

	public void setInvestmentAccount(List<com.tools20022.repository.entity.InvestmentAccount> investmentAccount) {
		this.investmentAccount = investmentAccount;
	}

	public FATCAFormTypeCode getFATCAFormType() {
		return fATCAFormType;
	}

	public void setFATCAFormType(FATCAFormTypeCode fATCAFormType) {
		this.fATCAFormType = fATCAFormType;
	}

	public List<FATCAStatus> getFATCAStatus() {
		return fATCAStatus;
	}

	public void setFATCAStatus(List<com.tools20022.repository.entity.FATCAStatus> fATCAStatus) {
		this.fATCAStatus = fATCAStatus;
	}

	public CRSStatus getCRSStatus() {
		return cRSStatus;
	}

	public void setCRSStatus(com.tools20022.repository.entity.CRSStatus cRSStatus) {
		this.cRSStatus = cRSStatus;
	}
}