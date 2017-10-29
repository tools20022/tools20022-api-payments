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
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.AccountContract;
import com.tools20022.repository.msg.AccountContract2;
import com.tools20022.repository.msg.AccountContract3;
import com.tools20022.repository.msg.AccountContract4;
import com.tools20022.repository.msg.AccountReport15;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Account contract established between the organisation or the group to which
 * the organisation belongs, and the account servicer.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CashAccountContract" src="doc-files/CashAccountContract.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccountContract#CashAccount
 * CashAccountContract.CashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccountContract#TransferCashAccount
 * CashAccountContract.TransferCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccountContract#Services
 * CashAccountContract.Services}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccountContract#BalanceTransfer
 * CashAccountContract.BalanceTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccountContract#CashAccountMandate
 * CashAccountContract.CashAccountMandate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#CashAccountContract
 * CashAccount.CashAccountContract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#ClosedAccountContract
 * CashAccount.ClosedAccountContract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#RelatedAccountClosingTerms
 * PaymentObligation.RelatedAccountClosingTerms}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccountService#CashAccountContract
 * CashAccountService.CashAccountContract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccountMandate#CashAccountContract
 * CashAccountMandate.CashAccountContract}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountReport15#UnderlyingMasterAgreement
 * AccountReport15.UnderlyingMasterAgreement}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountReport15#ContractDates
 * AccountReport15.ContractDates}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.AccountContract
 * AccountContract}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AccountContract4
 * AccountContract4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountContract2
 * AccountContract2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountContract3
 * AccountContract3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountReport15
 * AccountReport15}</li>
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
 * "CashAccountContract"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Account contract established between the organisation or the group to which the organisation belongs, and the account servicer."
 * </li>
 * </ul>
 */
public class CashAccountContract extends AccountContract {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the account which is managed by the stipulations of the
	 * contract. it is derived from the association between AccountContract and
	 * Account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#CashAccountContract
	 * CashAccount.CashAccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccount
	 * CashAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountReport15#Account
	 * AccountReport15.Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountReport15#ReferenceAccount
	 * AccountReport15.ReferenceAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportingRequest3#Account
	 * ReportingRequest3.Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingStatement2#AccountCharacteristics
	 * BillingStatement2.AccountCharacteristics}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountContract
	 * CashAccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the account which is managed by the stipulations of the contract. it is derived from the association between AccountContract and Account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CashAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountReport15.Account, com.tools20022.repository.msg.AccountReport15.ReferenceAccount, com.tools20022.repository.msg.ReportingRequest3.Account,
					com.tools20022.repository.msg.BillingStatement2.AccountCharacteristics);
			elementContext_lazy = () -> CashAccountContract.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashAccount";
			definition = "Specifies the account which is managed by the stipulations of the contract. it is derived from the association between AccountContract and Account.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.CashAccount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.CashAccountContract;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Identification of the account to/from which the balance of the account
	 * must be transferred.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#ClosedAccountContract
	 * CashAccount.ClosedAccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccount
	 * CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountContract
	 * CashAccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferCashAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the account to/from which the balance of the account must be transferred."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TransferCashAccount = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashAccountContract.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferCashAccount";
			definition = "Identification of the account to/from which the balance of the account must be transferred.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.CashAccount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.ClosedAccountContract;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Operations on a bank account that are allowed as part of the services
	 * offered to the owners of a bank account. It is derived from the
	 * association between AccountContract and AccountService.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountService#CashAccountContract
	 * CashAccountService.CashAccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccountService
	 * CashAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountContract
	 * CashAccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Services"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Operations on a bank account that are allowed as part of the services offered to the owners of a bank account. It is derived from the association between AccountContract and AccountService."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Services = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashAccountContract.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Services";
			definition = "Operations on a bank account that are allowed as part of the services offered to the owners of a bank account. It is derived from the association between AccountContract and AccountService.";
			minOccurs = 0;
			type_lazy = () -> CashAccountService.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccountService.CashAccountContract;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the transfer of a positive balance (fully or partially) or the
	 * transfer of cash to compensate a negative balance. This transfer occurs
	 * at the closing of the account. It contains the identification of the
	 * account to which or from which the amount must be transferred.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#RelatedAccountClosingTerms
	 * PaymentObligation.RelatedAccountClosingTerms}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountContract
	 * CashAccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the transfer of a positive balance (fully or partially) or the transfer of cash to compensate a negative balance. This transfer occurs at the closing of the account. It contains the identification of the account to which or from which the amount must be transferred."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd BalanceTransfer = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashAccountContract.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BalanceTransfer";
			definition = "Specifies the transfer of a positive balance (fully or partially) or the transfer of cash to compensate a negative balance. This transfer occurs at the closing of the account. It contains the identification of the account to which or from which the amount must be transferred.";
			minOccurs = 0;
			type_lazy = () -> PaymentObligation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentObligation.RelatedAccountClosingTerms;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Mandate associated with a cash account contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountMandate#CashAccountContract
	 * CashAccountMandate.CashAccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccountMandate
	 * CashAccountMandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountContract
	 * CashAccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccountMandate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Mandate associated with a cash account contract."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CashAccountMandate = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashAccountContract.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashAccountMandate";
			definition = "Mandate associated with a cash account contract.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CashAccountMandate.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccountMandate.CashAccountContract;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CashAccountContract";
				definition = "Account contract established between the organisation or the group to which the organisation belongs, and the account servicer.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccount.CashAccountContract, com.tools20022.repository.entity.CashAccount.ClosedAccountContract,
						com.tools20022.repository.entity.PaymentObligation.RelatedAccountClosingTerms, com.tools20022.repository.entity.CashAccountService.CashAccountContract,
						com.tools20022.repository.entity.CashAccountMandate.CashAccountContract);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountReport15.UnderlyingMasterAgreement, com.tools20022.repository.msg.AccountReport15.ContractDates);
				superType_lazy = () -> AccountContract.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccountContract.CashAccount, com.tools20022.repository.entity.CashAccountContract.TransferCashAccount,
						com.tools20022.repository.entity.CashAccountContract.Services, com.tools20022.repository.entity.CashAccountContract.BalanceTransfer, com.tools20022.repository.entity.CashAccountContract.CashAccountMandate);
				derivationComponent_lazy = () -> Arrays.asList(AccountContract4.mmObject(), AccountContract2.mmObject(), AccountContract3.mmObject(), AccountReport15.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}