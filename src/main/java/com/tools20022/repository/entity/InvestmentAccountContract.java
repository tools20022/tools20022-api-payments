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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.AccountContract;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Contract defining the related investment account.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="InvestmentAccountContract"
 * src="doc-files/InvestmentAccountContract.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.AccountContract
 * AccountContract}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountContract#mmLetterIntentReference
 * InvestmentAccountContract.mmLetterIntentReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountContract#mmAccumulationRightReference
 * InvestmentAccountContract.mmAccumulationRightReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountContract#mmInvestmentAccount
 * InvestmentAccountContract.mmInvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountContract#mmServices
 * InvestmentAccountContract.mmServices}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountContract#mmModeledAccount
 * InvestmentAccountContract.mmModeledAccount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmInvestmentAccountContract
 * InvestmentAccount.mmInvestmentAccountContract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#mmInvestmentAccountContract
 * InvestmentAccountService.mmInvestmentAccountContract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ManagedAccountProduct#mmInvestmentAccountContract
 * ManagedAccountProduct.mmInvestmentAccountContract}</li>
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
 * "InvestmentAccountContract"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Contract defining the related investment account."</li>
 * </ul>
 */
public class InvestmentAccountContract extends AccountContract {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text letterIntentReference;
	/**
	 * Reference of a letter of intent program, in which sales commissions are
	 * reduced based on the aggregate of a customer's actual purchase and
	 * anticipated purchases, over a specific period of time, and as agreed by
	 * the customer. A letter of intent program is mainly used in the US market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountContract
	 * InvestmentAccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LetterIntentReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference of a letter of intent program, in which sales commissions are reduced based on the aggregate of a customer's actual purchase and anticipated purchases, over a specific period of time, and as agreed by the customer. A letter of intent program is mainly used in the US market."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmLetterIntentReference = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentAccountContract.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LetterIntentReference";
			definition = "Reference of a letter of intent program, in which sales commissions are reduced based on the aggregate of a customer's actual purchase and anticipated purchases, over a specific period of time, and as agreed by the customer. A letter of intent program is mainly used in the US market.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentAccountContract.class.getMethod("getLetterIntentReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text accumulationRightReference;
	/**
	 * Reference of an accumulation rights program, in which sales commissions
	 * are based on a customer's present purchases of shares and the aggregate
	 * quantity previously purchased by the customer. An accumulation rights
	 * program is mainly used in the US market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountContract
	 * InvestmentAccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccumulationRightReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference of an accumulation rights program, in which sales commissions are based on a customer's present purchases of shares and the aggregate quantity previously purchased by the customer. An accumulation rights program is mainly used in the US market."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAccumulationRightReference = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentAccountContract.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccumulationRightReference";
			definition = "Reference of an accumulation rights program, in which sales commissions are based on a customer's present purchases of shares and the aggregate quantity previously purchased by the customer. An accumulation rights program is mainly used in the US market.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentAccountContract.class.getMethod("getAccumulationRightReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.InvestmentAccount> investmentAccount;
	/**
	 * Specifies the account for which the service is offered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmInvestmentAccountContract
	 * InvestmentAccount.mmInvestmentAccountContract}</li>
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountContract
	 * InvestmentAccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the account for which the service is offered."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmInvestmentAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentAccountContract.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentAccount";
			definition = "Specifies the account for which the service is offered.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.mmInvestmentAccountContract;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.InvestmentAccountService> services;
	/**
	 * Services linked to an account which are available to the account owner or
	 * to the holder of a mandate. The exercise of these services may be
	 * submitted to a limit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#mmInvestmentAccountContract
	 * InvestmentAccountService.mmInvestmentAccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService
	 * InvestmentAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountContract
	 * InvestmentAccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Services"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Services linked to an account which are available to the account owner or to the holder of a mandate. The exercise of these services may be submitted to a limit."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmServices = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentAccountContract.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Services";
			definition = "Services linked to an account which are available to the account owner or to the holder of a mandate. The exercise of these services may be submitted to a limit.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccountService.mmInvestmentAccountContract;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentAccountService.mmObject();
		}
	};
	protected ManagedAccountProduct modeledAccount;
	/**
	 * Product which provides guidance to investors to manage their portfolios.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ManagedAccountProduct#mmInvestmentAccountContract
	 * ManagedAccountProduct.mmInvestmentAccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.ManagedAccountProduct
	 * ManagedAccountProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountContract
	 * InvestmentAccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModeledAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Product which provides guidance to investors to manage their portfolios."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmModeledAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentAccountContract.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModeledAccount";
			definition = "Product which provides guidance to investors to manage their portfolios.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ManagedAccountProduct.mmInvestmentAccountContract;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ManagedAccountProduct.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvestmentAccountContract";
				definition = "Contract defining the related investment account.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentAccount.mmInvestmentAccountContract, com.tools20022.repository.entity.InvestmentAccountService.mmInvestmentAccountContract,
						com.tools20022.repository.entity.ManagedAccountProduct.mmInvestmentAccountContract);
				superType_lazy = () -> AccountContract.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentAccountContract.mmLetterIntentReference, com.tools20022.repository.entity.InvestmentAccountContract.mmAccumulationRightReference,
						com.tools20022.repository.entity.InvestmentAccountContract.mmInvestmentAccount, com.tools20022.repository.entity.InvestmentAccountContract.mmServices,
						com.tools20022.repository.entity.InvestmentAccountContract.mmModeledAccount);
			}

			@Override
			public Class<?> getInstanceClass() {
				return InvestmentAccountContract.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getLetterIntentReference() {
		return letterIntentReference;
	}

	public void setLetterIntentReference(Max35Text letterIntentReference) {
		this.letterIntentReference = letterIntentReference;
	}

	public Max35Text getAccumulationRightReference() {
		return accumulationRightReference;
	}

	public void setAccumulationRightReference(Max35Text accumulationRightReference) {
		this.accumulationRightReference = accumulationRightReference;
	}

	public List<InvestmentAccount> getInvestmentAccount() {
		return investmentAccount;
	}

	public void setInvestmentAccount(List<com.tools20022.repository.entity.InvestmentAccount> investmentAccount) {
		this.investmentAccount = investmentAccount;
	}

	public List<InvestmentAccountService> getServices() {
		return services;
	}

	public void setServices(List<com.tools20022.repository.entity.InvestmentAccountService> services) {
		this.services = services;
	}

	public ManagedAccountProduct getModeledAccount() {
		return modeledAccount;
	}

	public void setModeledAccount(com.tools20022.repository.entity.ManagedAccountProduct modeledAccount) {
		this.modeledAccount = modeledAccount;
	}
}