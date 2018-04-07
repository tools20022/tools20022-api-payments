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
import com.tools20022.repository.choice.AccountIdentification4Choice;
import com.tools20022.repository.codeset.AccountLevel2Code;
import com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode;
import com.tools20022.repository.codeset.CompensationMethod1Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max105Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the characteristics of the cash account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#mmAccountLevel
 * CashAccountCharacteristics2.mmAccountLevel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#mmCashAccount
 * CashAccountCharacteristics2.mmCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#mmAccountServicer
 * CashAccountCharacteristics2.mmAccountServicer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#mmParentAccount
 * CashAccountCharacteristics2.mmParentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#mmCompensationMethod
 * CashAccountCharacteristics2.mmCompensationMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#mmDebitAccount
 * CashAccountCharacteristics2.mmDebitAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#mmDelayedDebitDate
 * CashAccountCharacteristics2.mmDelayedDebitDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#mmSettlementAdvice
 * CashAccountCharacteristics2.mmSettlementAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#mmAccountBalanceCurrencyCode
 * CashAccountCharacteristics2.mmAccountBalanceCurrencyCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#mmSettlementCurrencyCode
 * CashAccountCharacteristics2.mmSettlementCurrencyCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#mmHostCurrencyCode
 * CashAccountCharacteristics2.mmHostCurrencyCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#mmTax
 * CashAccountCharacteristics2.mmTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#mmAccountServicerContact
 * CashAccountCharacteristics2.mmAccountServicerContact}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CashAccount
 * CashAccount}</li>
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
 * "CashAccountCharacteristics2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the characteristics of the cash account."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CashAccountCharacteristics2", propOrder = {"accountLevel", "cashAccount", "accountServicer", "parentAccount", "compensationMethod", "debitAccount", "delayedDebitDate", "settlementAdvice", "accountBalanceCurrencyCode",
		"settlementCurrencyCode", "hostCurrencyCode", "tax", "accountServicerContact"})
public class CashAccountCharacteristics2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AcctLvl", required = true)
	protected AccountLevel2Code accountLevel;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AccountLevel2Code
	 * AccountLevel2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmLevel
	 * CashAccount.mmLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2
	 * CashAccountCharacteristics2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctLvl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountLevel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines the account level within an account hierarchy."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashAccountCharacteristics2, AccountLevel2Code> mmAccountLevel = new MMMessageAttribute<CashAccountCharacteristics2, AccountLevel2Code>() {
		{
			businessElementTrace_lazy = () -> CashAccount.mmLevel;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccountCharacteristics2.mmObject();
			isDerived = false;
			xmlTag = "AcctLvl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountLevel";
			definition = "Defines the account level within an account hierarchy.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AccountLevel2Code.mmObject();
		}

		@Override
		public AccountLevel2Code getValue(CashAccountCharacteristics2 obj) {
			return obj.getAccountLevel();
		}

		@Override
		public void setValue(CashAccountCharacteristics2 obj, AccountLevel2Code value) {
			obj.setAccountLevel(value);
		}
	};
	@XmlElement(name = "CshAcct", required = true)
	protected CashAccount24 cashAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount24
	 * CashAccount24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2
	 * CashAccountCharacteristics2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account to or from which a cash entry is made."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CashAccountCharacteristics2, CashAccount24> mmCashAccount = new MMMessageAssociationEnd<CashAccountCharacteristics2, CashAccount24>() {
		{
			businessComponentTrace_lazy = () -> CashAccount.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccountCharacteristics2.mmObject();
			isDerived = false;
			xmlTag = "CshAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccount";
			definition = "Account to or from which a cash entry is made.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CashAccount24.mmObject();
		}

		@Override
		public CashAccount24 getValue(CashAccountCharacteristics2 obj) {
			return obj.getCashAccount();
		}

		@Override
		public void setValue(CashAccountCharacteristics2 obj, CashAccount24 value) {
			obj.setCashAccount(value);
		}
	};
	@XmlElement(name = "AcctSvcr")
	protected BranchAndFinancialInstitutionIdentification5 accountServicer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5
	 * BranchAndFinancialInstitutionIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification
	 * OrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2
	 * CashAccountCharacteristics2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctSvcr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Usage: the account servicer is the domicile agent servicing the local account."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashAccountCharacteristics2, Optional<BranchAndFinancialInstitutionIdentification5>> mmAccountServicer = new MMMessageAttribute<CashAccountCharacteristics2, Optional<BranchAndFinancialInstitutionIdentification5>>() {
		{
			businessComponentTrace_lazy = () -> OrganisationIdentification.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccountCharacteristics2.mmObject();
			isDerived = false;
			xmlTag = "AcctSvcr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicer";
			definition = "Usage: the account servicer is the domicile agent servicing the local account.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BranchAndFinancialInstitutionIdentification5.mmObject();
		}

		@Override
		public Optional<BranchAndFinancialInstitutionIdentification5> getValue(CashAccountCharacteristics2 obj) {
			return obj.getAccountServicer();
		}

		@Override
		public void setValue(CashAccountCharacteristics2 obj, Optional<BranchAndFinancialInstitutionIdentification5> value) {
			obj.setAccountServicer(value.orElse(null));
		}
	};
	@XmlElement(name = "PrntAcct")
	protected ParentCashAccount2 parentAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ParentCashAccount2
	 * ParentCashAccount2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmParentAccount
	 * Account.mmParentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2
	 * CashAccountCharacteristics2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrntAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines a parent account to which the cash account is related to."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CashAccountCharacteristics2, Optional<ParentCashAccount2>> mmParentAccount = new MMMessageAssociationEnd<CashAccountCharacteristics2, Optional<ParentCashAccount2>>() {
		{
			businessElementTrace_lazy = () -> Account.mmParentAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccountCharacteristics2.mmObject();
			isDerived = false;
			xmlTag = "PrntAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParentAccount";
			definition = "Defines a parent account to which the cash account is related to.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ParentCashAccount2.mmObject();
		}

		@Override
		public Optional<ParentCashAccount2> getValue(CashAccountCharacteristics2 obj) {
			return obj.getParentAccount();
		}

		@Override
		public void setValue(CashAccountCharacteristics2 obj, Optional<ParentCashAccount2> value) {
			obj.setParentAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "CompstnMtd", required = true)
	protected CompensationMethod1Code compensationMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CompensationMethod1Code
	 * CompensationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountService#mmCompensationMethod
	 * CashAccountService.mmCompensationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2
	 * CashAccountCharacteristics2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CompstnMtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompensationMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines if and how charges and taxes due are paid to the financial institution."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashAccountCharacteristics2, CompensationMethod1Code> mmCompensationMethod = new MMMessageAttribute<CashAccountCharacteristics2, CompensationMethod1Code>() {
		{
			businessElementTrace_lazy = () -> CashAccountService.mmCompensationMethod;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccountCharacteristics2.mmObject();
			isDerived = false;
			xmlTag = "CompstnMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompensationMethod";
			definition = "Defines if and how charges and taxes due are paid to the financial institution.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CompensationMethod1Code.mmObject();
		}

		@Override
		public CompensationMethod1Code getValue(CashAccountCharacteristics2 obj) {
			return obj.getCompensationMethod();
		}

		@Override
		public void setValue(CashAccountCharacteristics2 obj, CompensationMethod1Code value) {
			obj.setCompensationMethod(value);
		}
	};
	@XmlElement(name = "DbtAcct")
	protected AccountIdentification4Choice debitAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification4Choice
	 * AccountIdentification4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2
	 * CashAccountCharacteristics2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DbtAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebitAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the account debited for charges and taxes due on the cash account, if different from the cash account."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CashAccountCharacteristics2, Optional<AccountIdentification4Choice>> mmDebitAccount = new MMMessageAssociationEnd<CashAccountCharacteristics2, Optional<AccountIdentification4Choice>>() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccountCharacteristics2.mmObject();
			isDerived = false;
			xmlTag = "DbtAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebitAccount";
			definition = "Defines the account debited for charges and taxes due on the cash account, if different from the cash account.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AccountIdentification4Choice.mmObject();
		}

		@Override
		public Optional<AccountIdentification4Choice> getValue(CashAccountCharacteristics2 obj) {
			return obj.getDebitAccount();
		}

		@Override
		public void setValue(CashAccountCharacteristics2 obj, Optional<AccountIdentification4Choice> value) {
			obj.setDebitAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "DelydDbtDt")
	protected ISODate delayedDebitDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Entry#mmValueDate
	 * Entry.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2
	 * CashAccountCharacteristics2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DelydDbtDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DelayedDebitDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Future date on which the account will be automatically debited for charges and taxes due."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashAccountCharacteristics2, Optional<ISODate>> mmDelayedDebitDate = new MMMessageAttribute<CashAccountCharacteristics2, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> Entry.mmValueDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccountCharacteristics2.mmObject();
			isDerived = false;
			xmlTag = "DelydDbtDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DelayedDebitDate";
			definition = "Future date on which the account will be automatically debited for charges and taxes due.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(CashAccountCharacteristics2 obj) {
			return obj.getDelayedDebitDate();
		}

		@Override
		public void setValue(CashAccountCharacteristics2 obj, Optional<ISODate> value) {
			obj.setDelayedDebitDate(value.orElse(null));
		}
	};
	@XmlElement(name = "SttlmAdvc")
	protected Max105Text settlementAdvice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max105Text
	 * Max105Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2
	 * CashAccountCharacteristics2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmAdvc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAdvice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Free form message advising the customer about the settlement of charges and taxes due."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashAccountCharacteristics2, Optional<Max105Text>> mmSettlementAdvice = new MMMessageAttribute<CashAccountCharacteristics2, Optional<Max105Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccountCharacteristics2.mmObject();
			isDerived = false;
			xmlTag = "SttlmAdvc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAdvice";
			definition = "Free form message advising the customer about the settlement of charges and taxes due.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max105Text.mmObject();
		}

		@Override
		public Optional<Max105Text> getValue(CashAccountCharacteristics2 obj) {
			return obj.getSettlementAdvice();
		}

		@Override
		public void setValue(CashAccountCharacteristics2 obj, Optional<Max105Text> value) {
			obj.setSettlementAdvice(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctBalCcyCd", required = true)
	protected ActiveOrHistoricCurrencyCode accountBalanceCurrencyCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode
	 * ActiveOrHistoricCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmReportingCurrency
	 * Account.mmReportingCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2
	 * CashAccountCharacteristics2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctBalCcyCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountBalanceCurrencyCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency used to specify the account's balance currency."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashAccountCharacteristics2, ActiveOrHistoricCurrencyCode> mmAccountBalanceCurrencyCode = new MMMessageAttribute<CashAccountCharacteristics2, ActiveOrHistoricCurrencyCode>() {
		{
			businessElementTrace_lazy = () -> Account.mmReportingCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccountCharacteristics2.mmObject();
			isDerived = false;
			xmlTag = "AcctBalCcyCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountBalanceCurrencyCode";
			definition = "Currency used to specify the account's balance currency.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}

		@Override
		public ActiveOrHistoricCurrencyCode getValue(CashAccountCharacteristics2 obj) {
			return obj.getAccountBalanceCurrencyCode();
		}

		@Override
		public void setValue(CashAccountCharacteristics2 obj, ActiveOrHistoricCurrencyCode value) {
			obj.setAccountBalanceCurrencyCode(value);
		}
	};
	@XmlElement(name = "SttlmCcyCd")
	protected ActiveOrHistoricCurrencyCode settlementCurrencyCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode
	 * ActiveOrHistoricCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmSettlementCurrency
	 * CashAccount.mmSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2
	 * CashAccountCharacteristics2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmCcyCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementCurrencyCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency used to specify the account's settlement currency."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashAccountCharacteristics2, Optional<ActiveOrHistoricCurrencyCode>> mmSettlementCurrencyCode = new MMMessageAttribute<CashAccountCharacteristics2, Optional<ActiveOrHistoricCurrencyCode>>() {
		{
			businessElementTrace_lazy = () -> CashAccount.mmSettlementCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccountCharacteristics2.mmObject();
			isDerived = false;
			xmlTag = "SttlmCcyCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementCurrencyCode";
			definition = "Currency used to specify the account's settlement currency.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}

		@Override
		public Optional<ActiveOrHistoricCurrencyCode> getValue(CashAccountCharacteristics2 obj) {
			return obj.getSettlementCurrencyCode();
		}

		@Override
		public void setValue(CashAccountCharacteristics2 obj, Optional<ActiveOrHistoricCurrencyCode> value) {
			obj.setSettlementCurrencyCode(value.orElse(null));
		}
	};
	@XmlElement(name = "HstCcyCd")
	protected ActiveOrHistoricCurrencyCode hostCurrencyCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode
	 * ActiveOrHistoricCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmCurrency
	 * Tax.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2
	 * CashAccountCharacteristics2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HstCcyCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HostCurrencyCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency used to specify the account's taxing host currency."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashAccountCharacteristics2, Optional<ActiveOrHistoricCurrencyCode>> mmHostCurrencyCode = new MMMessageAttribute<CashAccountCharacteristics2, Optional<ActiveOrHistoricCurrencyCode>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccountCharacteristics2.mmObject();
			isDerived = false;
			xmlTag = "HstCcyCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HostCurrencyCode";
			definition = "Currency used to specify the account's taxing host currency.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}

		@Override
		public Optional<ActiveOrHistoricCurrencyCode> getValue(CashAccountCharacteristics2 obj) {
			return obj.getHostCurrencyCode();
		}

		@Override
		public void setValue(CashAccountCharacteristics2 obj, Optional<ActiveOrHistoricCurrencyCode> value) {
			obj.setHostCurrencyCode(value.orElse(null));
		}
	};
	@XmlElement(name = "Tax")
	protected AccountTax1 tax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AccountTax1
	 * AccountTax1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmTax
	 * CashAccount.mmTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2
	 * CashAccountCharacteristics2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Describes account taxing parameters."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CashAccountCharacteristics2, Optional<AccountTax1>> mmTax = new MMMessageAssociationEnd<CashAccountCharacteristics2, Optional<AccountTax1>>() {
		{
			businessElementTrace_lazy = () -> CashAccount.mmTax;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccountCharacteristics2.mmObject();
			isDerived = false;
			xmlTag = "Tax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tax";
			definition = "Describes account taxing parameters.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AccountTax1.mmObject();
		}

		@Override
		public Optional<AccountTax1> getValue(CashAccountCharacteristics2 obj) {
			return obj.getTax();
		}

		@Override
		public void setValue(CashAccountCharacteristics2 obj, Optional<AccountTax1> value) {
			obj.setTax(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctSvcrCtct", required = true)
	protected ContactDetails3 accountServicerContact;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.ContactDetails3
	 * ContactDetails3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Person#mmPersonIdentification
	 * Person.mmPersonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2
	 * CashAccountCharacteristics2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctSvcrCtct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerContact"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Individual to contact at the financial institution's location regarding problems of a business nature."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashAccountCharacteristics2, ContactDetails3> mmAccountServicerContact = new MMMessageAttribute<CashAccountCharacteristics2, ContactDetails3>() {
		{
			businessElementTrace_lazy = () -> Person.mmPersonIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccountCharacteristics2.mmObject();
			isDerived = false;
			xmlTag = "AcctSvcrCtct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerContact";
			definition = "Individual to contact at the financial institution's location regarding problems of a business nature.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ContactDetails3.mmObject();
		}

		@Override
		public ContactDetails3 getValue(CashAccountCharacteristics2 obj) {
			return obj.getAccountServicerContact();
		}

		@Override
		public void setValue(CashAccountCharacteristics2 obj, ContactDetails3 value) {
			obj.setAccountServicerContact(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashAccountCharacteristics2.mmAccountLevel, com.tools20022.repository.msg.CashAccountCharacteristics2.mmCashAccount,
						com.tools20022.repository.msg.CashAccountCharacteristics2.mmAccountServicer, com.tools20022.repository.msg.CashAccountCharacteristics2.mmParentAccount,
						com.tools20022.repository.msg.CashAccountCharacteristics2.mmCompensationMethod, com.tools20022.repository.msg.CashAccountCharacteristics2.mmDebitAccount,
						com.tools20022.repository.msg.CashAccountCharacteristics2.mmDelayedDebitDate, com.tools20022.repository.msg.CashAccountCharacteristics2.mmSettlementAdvice,
						com.tools20022.repository.msg.CashAccountCharacteristics2.mmAccountBalanceCurrencyCode, com.tools20022.repository.msg.CashAccountCharacteristics2.mmSettlementCurrencyCode,
						com.tools20022.repository.msg.CashAccountCharacteristics2.mmHostCurrencyCode, com.tools20022.repository.msg.CashAccountCharacteristics2.mmTax,
						com.tools20022.repository.msg.CashAccountCharacteristics2.mmAccountServicerContact);
				trace_lazy = () -> CashAccount.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CashAccountCharacteristics2";
				definition = "Specifies the characteristics of the cash account.";
			}
		});
		return mmObject_lazy.get();
	}

	public AccountLevel2Code getAccountLevel() {
		return accountLevel;
	}

	public CashAccountCharacteristics2 setAccountLevel(AccountLevel2Code accountLevel) {
		this.accountLevel = Objects.requireNonNull(accountLevel);
		return this;
	}

	public CashAccount24 getCashAccount() {
		return cashAccount;
	}

	public CashAccountCharacteristics2 setCashAccount(CashAccount24 cashAccount) {
		this.cashAccount = Objects.requireNonNull(cashAccount);
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification5> getAccountServicer() {
		return accountServicer == null ? Optional.empty() : Optional.of(accountServicer);
	}

	public CashAccountCharacteristics2 setAccountServicer(BranchAndFinancialInstitutionIdentification5 accountServicer) {
		this.accountServicer = accountServicer;
		return this;
	}

	public Optional<ParentCashAccount2> getParentAccount() {
		return parentAccount == null ? Optional.empty() : Optional.of(parentAccount);
	}

	public CashAccountCharacteristics2 setParentAccount(ParentCashAccount2 parentAccount) {
		this.parentAccount = parentAccount;
		return this;
	}

	public CompensationMethod1Code getCompensationMethod() {
		return compensationMethod;
	}

	public CashAccountCharacteristics2 setCompensationMethod(CompensationMethod1Code compensationMethod) {
		this.compensationMethod = Objects.requireNonNull(compensationMethod);
		return this;
	}

	public Optional<AccountIdentification4Choice> getDebitAccount() {
		return debitAccount == null ? Optional.empty() : Optional.of(debitAccount);
	}

	public CashAccountCharacteristics2 setDebitAccount(AccountIdentification4Choice debitAccount) {
		this.debitAccount = debitAccount;
		return this;
	}

	public Optional<ISODate> getDelayedDebitDate() {
		return delayedDebitDate == null ? Optional.empty() : Optional.of(delayedDebitDate);
	}

	public CashAccountCharacteristics2 setDelayedDebitDate(ISODate delayedDebitDate) {
		this.delayedDebitDate = delayedDebitDate;
		return this;
	}

	public Optional<Max105Text> getSettlementAdvice() {
		return settlementAdvice == null ? Optional.empty() : Optional.of(settlementAdvice);
	}

	public CashAccountCharacteristics2 setSettlementAdvice(Max105Text settlementAdvice) {
		this.settlementAdvice = settlementAdvice;
		return this;
	}

	public ActiveOrHistoricCurrencyCode getAccountBalanceCurrencyCode() {
		return accountBalanceCurrencyCode;
	}

	public CashAccountCharacteristics2 setAccountBalanceCurrencyCode(ActiveOrHistoricCurrencyCode accountBalanceCurrencyCode) {
		this.accountBalanceCurrencyCode = Objects.requireNonNull(accountBalanceCurrencyCode);
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyCode> getSettlementCurrencyCode() {
		return settlementCurrencyCode == null ? Optional.empty() : Optional.of(settlementCurrencyCode);
	}

	public CashAccountCharacteristics2 setSettlementCurrencyCode(ActiveOrHistoricCurrencyCode settlementCurrencyCode) {
		this.settlementCurrencyCode = settlementCurrencyCode;
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyCode> getHostCurrencyCode() {
		return hostCurrencyCode == null ? Optional.empty() : Optional.of(hostCurrencyCode);
	}

	public CashAccountCharacteristics2 setHostCurrencyCode(ActiveOrHistoricCurrencyCode hostCurrencyCode) {
		this.hostCurrencyCode = hostCurrencyCode;
		return this;
	}

	public Optional<AccountTax1> getTax() {
		return tax == null ? Optional.empty() : Optional.of(tax);
	}

	public CashAccountCharacteristics2 setTax(AccountTax1 tax) {
		this.tax = tax;
		return this;
	}

	public ContactDetails3 getAccountServicerContact() {
		return accountServicerContact;
	}

	public CashAccountCharacteristics2 setAccountServicerContact(ContactDetails3 accountServicerContact) {
		this.accountServicerContact = Objects.requireNonNull(accountServicerContact);
		return this;
	}
}