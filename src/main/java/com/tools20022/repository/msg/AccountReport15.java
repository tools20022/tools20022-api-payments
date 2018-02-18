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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.acmt.AccountReportV02;
import com.tools20022.repository.entity.CashAccountContract;
import com.tools20022.repository.entity.CashAccountService;
import com.tools20022.repository.entity.Organisation;
import com.tools20022.repository.entity.PaymentPartyRole;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * <li>{@linkplain com.tools20022.repository.msg.AccountReport15#mmAccount
 * AccountReport15.mmAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountReport15#mmUnderlyingMasterAgreement
 * AccountReport15.mmUnderlyingMasterAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountReport15#mmContractDates
 * AccountReport15.mmContractDates}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountReport15#mmMandate
 * AccountReport15.mmMandate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountReport15#mmGroup
 * AccountReport15.mmGroup}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountReport15#mmReferenceAccount
 * AccountReport15.mmReferenceAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountReport15#mmBalanceTransferAccount
 * AccountReport15.mmBalanceTransferAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountReport15#mmTransferAccountServicerIdentification
 * AccountReport15.mmTransferAccountServicerIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CashAccountContract
 * CashAccountContract}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountReportV02#mmReport
 * AccountReportV02.mmReport}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintContractDates1Rule#forAccountReport15
 * ConstraintContractDates1Rule.forAccountReport15}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintContractDates2Rule#forAccountReport15
 * ConstraintContractDates2Rule.forAccountReport15}</li>
 * </ul>
 * </li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AccountReport15", propOrder = {"account", "underlyingMasterAgreement", "contractDates", "mandate", "group", "referenceAccount", "balanceTransferAccount", "transferAccountServicerIdentification"})
public class AccountReport15 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Acct", required = true)
	protected CustomerAccount5 account;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CustomerAccount5
	 * CustomerAccount5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountContract#mmCashAccount
	 * CashAccountContract.mmCashAccount}</li>
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
	public static final MMMessageAssociationEnd mmAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CashAccountContract.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountReport15.mmObject();
			isDerived = false;
			xmlTag = "Acct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Account";
			definition = "Characteristics of the account.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CustomerAccount5.mmObject();
		}
	};
	@XmlElement(name = "UndrlygMstrAgrmt")
	protected ContractDocument1 underlyingMasterAgreement;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd mmUnderlyingMasterAgreement = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CashAccountContract.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountReport15.mmObject();
			isDerived = false;
			xmlTag = "UndrlygMstrAgrmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingMasterAgreement";
			definition = "Account contract established between the organisation or the group to which the organisation belongs, and the account servicer. This contract has to be applied for the new account to be opened and maintained.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ContractDocument1.mmObject();
		}
	};
	@XmlElement(name = "CtrctDts")
	protected AccountContract3 contractDates;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd mmContractDates = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CashAccountContract.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountReport15.mmObject();
			isDerived = false;
			xmlTag = "CtrctDts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContractDates";
			definition = "Specifies target and actual dates.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AccountContract3.mmObject();
		}
	};
	@XmlElement(name = "Mndt")
	protected List<com.tools20022.repository.msg.OperationMandate2> mandate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OperationMandate2
	 * OperationMandate2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountService#mmCashAccountMandate
	 * CashAccountService.mmCashAccountMandate}</li>
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
	public static final MMMessageAssociationEnd mmMandate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CashAccountService.mmCashAccountMandate;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountReport15.mmObject();
			isDerived = false;
			xmlTag = "Mndt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Mandate";
			definition = "Information specifying the account mandate.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.OperationMandate2.mmObject();
		}
	};
	@XmlElement(name = "Grp")
	protected List<com.tools20022.repository.msg.Group1> group;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute mmGroup = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountReport15.mmObject();
			isDerived = false;
			xmlTag = "Grp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Group";
			definition = "Definition of a group of parties.";
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Group1.mmObject();
		}
	};
	@XmlElement(name = "RefAcct")
	protected CashAccount24 referenceAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount24
	 * CashAccount24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountContract#mmCashAccount
	 * CashAccountContract.mmCashAccount}</li>
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
	public static final MMMessageAssociationEnd mmReferenceAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CashAccountContract.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountReport15.mmObject();
			isDerived = false;
			xmlTag = "RefAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceAccount";
			definition = "Unique and unambiguous identification of the account used as a reference for the opening of another account.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount24.mmObject();
		}
	};
	@XmlElement(name = "BalTrfAcct")
	protected AccountForAction1 balanceTransferAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AccountForAction1
	 * AccountForAction1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmCashAccount
	 * PaymentPartyRole.mmCashAccount}</li>
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
	public static final MMMessageAssociationEnd mmBalanceTransferAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentPartyRole.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountReport15.mmObject();
			isDerived = false;
			xmlTag = "BalTrfAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceTransferAccount";
			definition = "Unique and unambiguous identification of the account where to transfer the balance.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AccountForAction1.mmObject();
		}
	};
	@XmlElement(name = "TrfAcctSvcrId")
	protected BranchAndFinancialInstitutionIdentification5 transferAccountServicerIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5
	 * BranchAndFinancialInstitutionIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
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
	public static final MMMessageAssociationEnd mmTransferAccountServicerIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountReport15.mmObject();
			isDerived = false;
			xmlTag = "TrfAcctSvcrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferAccountServicerIdentification";
			definition = "Identification of  the transfer account servicer.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountReport15.mmAccount, com.tools20022.repository.msg.AccountReport15.mmUnderlyingMasterAgreement,
						com.tools20022.repository.msg.AccountReport15.mmContractDates, com.tools20022.repository.msg.AccountReport15.mmMandate, com.tools20022.repository.msg.AccountReport15.mmGroup,
						com.tools20022.repository.msg.AccountReport15.mmReferenceAccount, com.tools20022.repository.msg.AccountReport15.mmBalanceTransferAccount,
						com.tools20022.repository.msg.AccountReport15.mmTransferAccountServicerIdentification);
				messageBuildingBlock_lazy = () -> Arrays.asList(AccountReportV02.mmReport);
				trace_lazy = () -> CashAccountContract.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintContractDates1Rule.forAccountReport15, com.tools20022.repository.constraints.ConstraintContractDates2Rule.forAccountReport15);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountReport15";
				definition = "Reports to a corporate on the actual set up up of the account, related services and mandates.";
			}
		});
		return mmObject_lazy.get();
	}

	public CustomerAccount5 getAccount() {
		return account;
	}

	public AccountReport15 setAccount(com.tools20022.repository.msg.CustomerAccount5 account) {
		this.account = Objects.requireNonNull(account);
		return this;
	}

	public Optional<ContractDocument1> getUnderlyingMasterAgreement() {
		return underlyingMasterAgreement == null ? Optional.empty() : Optional.of(underlyingMasterAgreement);
	}

	public AccountReport15 setUnderlyingMasterAgreement(com.tools20022.repository.msg.ContractDocument1 underlyingMasterAgreement) {
		this.underlyingMasterAgreement = underlyingMasterAgreement;
		return this;
	}

	public Optional<AccountContract3> getContractDates() {
		return contractDates == null ? Optional.empty() : Optional.of(contractDates);
	}

	public AccountReport15 setContractDates(com.tools20022.repository.msg.AccountContract3 contractDates) {
		this.contractDates = contractDates;
		return this;
	}

	public List<OperationMandate2> getMandate() {
		return mandate == null ? mandate = new ArrayList<>() : mandate;
	}

	public AccountReport15 setMandate(List<com.tools20022.repository.msg.OperationMandate2> mandate) {
		this.mandate = Objects.requireNonNull(mandate);
		return this;
	}

	public List<Group1> getGroup() {
		return group == null ? group = new ArrayList<>() : group;
	}

	public AccountReport15 setGroup(List<com.tools20022.repository.msg.Group1> group) {
		this.group = Objects.requireNonNull(group);
		return this;
	}

	public Optional<CashAccount24> getReferenceAccount() {
		return referenceAccount == null ? Optional.empty() : Optional.of(referenceAccount);
	}

	public AccountReport15 setReferenceAccount(com.tools20022.repository.msg.CashAccount24 referenceAccount) {
		this.referenceAccount = referenceAccount;
		return this;
	}

	public Optional<AccountForAction1> getBalanceTransferAccount() {
		return balanceTransferAccount == null ? Optional.empty() : Optional.of(balanceTransferAccount);
	}

	public AccountReport15 setBalanceTransferAccount(com.tools20022.repository.msg.AccountForAction1 balanceTransferAccount) {
		this.balanceTransferAccount = balanceTransferAccount;
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification5> getTransferAccountServicerIdentification() {
		return transferAccountServicerIdentification == null ? Optional.empty() : Optional.of(transferAccountServicerIdentification);
	}

	public AccountReport15 setTransferAccountServicerIdentification(com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5 transferAccountServicerIdentification) {
		this.transferAccountServicerIdentification = transferAccountServicerIdentification;
		return this;
	}
}