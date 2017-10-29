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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.entity.CashAccountContract;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Reports to a corporate on the actual set up up of the account, related
 * services and mandates.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AccountReport15#Account
 * AccountReport15.Account}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountReport15#UnderlyingMasterAgreement
 * AccountReport15.UnderlyingMasterAgreement}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountReport15#ContractDates
 * AccountReport15.ContractDates}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountReport15#Mandate
 * AccountReport15.Mandate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountReport15#Group
 * AccountReport15.Group}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountReport15#ReferenceAccount
 * AccountReport15.ReferenceAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountReport15#BalanceTransferAccount
 * AccountReport15.BalanceTransferAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountReport15#TransferAccountServicerIdentification
 * AccountReport15.TransferAccountServicerIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CashAccountContract
 * CashAccountContract}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.area.acmt.AccountReportV02#Report
 * AccountReportV02.Report}</li>
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
 * "AccountReport15"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Reports to a corporate on the actual set up up of the account, related services and mandates."
 * </li>
 * </ul>
 */
public class AccountReport15 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Characteristics of the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CustomerAccount5
	 * CustomerAccount5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountContract#CashAccount
	 * CashAccountContract.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountReport15
	 * AccountReport15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Acct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Characteristics of the account."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Account = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AccountReport15.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CashAccountContract.CashAccount;
			isDerived = false;
			xmlTag = "Acct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Account";
			definition = "Characteristics of the account.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CustomerAccount5.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Account contract established between the organisation or the group to
	 * which the organisation belongs, and the account servicer. This contract
	 * has to be applied for the new account to be opened and maintained.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ContractDocument1
	 * ContractDocument1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountContract
	 * CashAccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountReport15
	 * AccountReport15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UndrlygMstrAgrmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingMasterAgreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account contract established between the organisation or the group to which the organisation belongs, and the account servicer. This contract has to be applied for the new account to be opened and maintained."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd UnderlyingMasterAgreement = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AccountReport15.mmObject();
			businessComponentTrace_lazy = () -> CashAccountContract.mmObject();
			isDerived = false;
			xmlTag = "UndrlygMstrAgrmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingMasterAgreement";
			definition = "Account contract established between the organisation or the group to which the organisation belongs, and the account servicer. This contract has to be applied for the new account to be opened and maintained.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> ContractDocument1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Specifies target and actual dates.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AccountContract3
	 * AccountContract3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountContract
	 * CashAccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountReport15
	 * AccountReport15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrctDts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContractDates"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies target and actual dates."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd ContractDates = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AccountReport15.mmObject();
			businessComponentTrace_lazy = () -> CashAccountContract.mmObject();
			isDerived = false;
			xmlTag = "CtrctDts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContractDates";
			definition = "Specifies target and actual dates.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> AccountContract3.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Information specifying the account mandate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OperationMandate2
	 * OperationMandate2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountService#CashAccountMandate
	 * CashAccountService.CashAccountMandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountReport15
	 * AccountReport15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Mndt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Mandate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information specifying the account mandate."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Mandate = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AccountReport15.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CashAccountService.CashAccountMandate;
			isDerived = false;
			xmlTag = "Mndt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Mandate";
			definition = "Information specifying the account mandate.";
			minOccurs = 0;
			type_lazy = () -> OperationMandate2.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Definition of a group of parties.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Group1 Group1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountReport15
	 * AccountReport15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Grp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Group"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Definition of a group of parties."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute Group = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AccountReport15.mmObject();
			isDerived = false;
			xmlTag = "Grp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Group";
			definition = "Definition of a group of parties.";
			minOccurs = 0;
			complexType_lazy = () -> Group1.mmObject();
		}
	};
	/**
	 * Unique and unambiguous identification of the account used as a reference
	 * for the opening of another account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount24
	 * CashAccount24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountContract#CashAccount
	 * CashAccountContract.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountReport15
	 * AccountReport15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RefAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferenceAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification of the account used as a reference for the opening of another account."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd ReferenceAccount = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AccountReport15.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CashAccountContract.CashAccount;
			isDerived = false;
			xmlTag = "RefAcct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceAccount";
			definition = "Unique and unambiguous identification of the account used as a reference for the opening of another account.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CashAccount24.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Unique and unambiguous identification of the account where to transfer
	 * the balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AccountForAction1
	 * AccountForAction1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#CashAccount
	 * PaymentPartyRole.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountReport15
	 * AccountReport15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BalTrfAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceTransferAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification of the account where to transfer the balance."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd BalanceTransferAccount = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AccountReport15.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentPartyRole.CashAccount;
			isDerived = false;
			xmlTag = "BalTrfAcct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceTransferAccount";
			definition = "Unique and unambiguous identification of the account where to transfer the balance.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> AccountForAction1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Identification of the transfer account servicer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5
	 * BranchAndFinancialInstitutionIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#OrganisationIdentification
	 * Organisation.OrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountReport15
	 * AccountReport15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfAcctSvcrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferAccountServicerIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of  the transfer account servicer."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd TransferAccountServicerIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AccountReport15.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Organisation.OrganisationIdentification;
			isDerived = false;
			xmlTag = "TrfAcctSvcrId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferAccountServicerIdentification";
			definition = "Identification of  the transfer account servicer.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification5.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountReport15.Account, com.tools20022.repository.msg.AccountReport15.UnderlyingMasterAgreement,
						com.tools20022.repository.msg.AccountReport15.ContractDates, com.tools20022.repository.msg.AccountReport15.Mandate, com.tools20022.repository.msg.AccountReport15.Group,
						com.tools20022.repository.msg.AccountReport15.ReferenceAccount, com.tools20022.repository.msg.AccountReport15.BalanceTransferAccount,
						com.tools20022.repository.msg.AccountReport15.TransferAccountServicerIdentification);
				trace_lazy = () -> CashAccountContract.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.acmt.AccountReportV02.Report);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AccountReport15";
				definition = "Reports to a corporate on the actual set up up of the account, related services and mandates.";
			}
		});
		return mmObject_lazy.get();
	}
}