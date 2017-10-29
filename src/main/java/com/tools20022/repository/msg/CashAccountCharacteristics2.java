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
import com.tools20022.repository.choice.AccountIdentification4Choice;
import com.tools20022.repository.codeset.AccountLevel2Code;
import com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode;
import com.tools20022.repository.codeset.CompensationMethod1Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max105Text;
import com.tools20022.repository.entity.OrganisationIdentification;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#AccountLevel
 * CashAccountCharacteristics2.AccountLevel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#CashAccount
 * CashAccountCharacteristics2.CashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#AccountServicer
 * CashAccountCharacteristics2.AccountServicer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#ParentAccount
 * CashAccountCharacteristics2.ParentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#CompensationMethod
 * CashAccountCharacteristics2.CompensationMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#DebitAccount
 * CashAccountCharacteristics2.DebitAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#DelayedDebitDate
 * CashAccountCharacteristics2.DelayedDebitDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#SettlementAdvice
 * CashAccountCharacteristics2.SettlementAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#AccountBalanceCurrencyCode
 * CashAccountCharacteristics2.AccountBalanceCurrencyCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#SettlementCurrencyCode
 * CashAccountCharacteristics2.SettlementCurrencyCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#HostCurrencyCode
 * CashAccountCharacteristics2.HostCurrencyCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#Tax
 * CashAccountCharacteristics2.Tax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#AccountServicerContact
 * CashAccountCharacteristics2.AccountServicerContact}</li>
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
public class CashAccountCharacteristics2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Defines the account level within an account hierarchy.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.CashAccount#Level
	 * CashAccount.Level}</li>
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
	public static final MMMessageAttribute AccountLevel = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CashAccountCharacteristics2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CashAccount.Level;
			isDerived = false;
			xmlTag = "AcctLvl";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountLevel";
			definition = "Defines the account level within an account hierarchy.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> AccountLevel2Code.mmObject();
		}
	};
	/**
	 * Account to or from which a cash entry is made.
	 * <p>
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
	public static final MMMessageAssociationEnd CashAccount = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CashAccountCharacteristics2.mmObject();
			businessComponentTrace_lazy = () -> com.tools20022.repository.entity.CashAccount.mmObject();
			isDerived = false;
			xmlTag = "CshAcct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccount";
			definition = "Account to or from which a cash entry is made.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CashAccount24.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Usage: the account servicer is the domicile agent servicing the local
	 * account.
	 * <p>
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
	public static final MMMessageAttribute AccountServicer = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CashAccountCharacteristics2.mmObject();
			businessComponentTrace_lazy = () -> OrganisationIdentification.mmObject();
			isDerived = false;
			xmlTag = "AcctSvcr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicer";
			definition = "Usage: the account servicer is the domicile agent servicing the local account.";
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> BranchAndFinancialInstitutionIdentification5.mmObject();
		}
	};
	/**
	 * Defines a parent account to which the cash account is related to.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ParentCashAccount2
	 * ParentCashAccount2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#ParentAccount
	 * Account.ParentAccount}</li>
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
	public static final MMMessageAssociationEnd ParentAccount = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CashAccountCharacteristics2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Account.ParentAccount;
			isDerived = false;
			xmlTag = "PrntAcct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParentAccount";
			definition = "Defines a parent account to which the cash account is related to.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> ParentCashAccount2.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Defines if and how charges and taxes due are paid to the financial
	 * institution.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.CashAccountService#CompensationMethod
	 * CashAccountService.CompensationMethod}</li>
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
	public static final MMMessageAttribute CompensationMethod = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CashAccountCharacteristics2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CashAccountService.CompensationMethod;
			isDerived = false;
			xmlTag = "CompstnMtd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompensationMethod";
			definition = "Defines if and how charges and taxes due are paid to the financial institution.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CompensationMethod1Code.mmObject();
		}
	};
	/**
	 * Defines the account debited for charges and taxes due on the cash
	 * account, if different from the cash account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification4Choice
	 * AccountIdentification4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#Identification
	 * Account.Identification}</li>
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
	public static final MMMessageAssociationEnd DebitAccount = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CashAccountCharacteristics2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Account.Identification;
			isDerived = false;
			xmlTag = "DbtAcct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebitAccount";
			definition = "Defines the account debited for charges and taxes due on the cash account, if different from the cash account.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> AccountIdentification4Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Future date on which the account will be automatically debited for
	 * charges and taxes due.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Entry#ValueDate
	 * Entry.ValueDate}</li>
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
	public static final MMMessageAttribute DelayedDebitDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CashAccountCharacteristics2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Entry.ValueDate;
			isDerived = false;
			xmlTag = "DelydDbtDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DelayedDebitDate";
			definition = "Future date on which the account will be automatically debited for charges and taxes due.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Free form message advising the customer about the settlement of charges
	 * and taxes due.
	 * <p>
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
	public static final MMMessageAttribute SettlementAdvice = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CashAccountCharacteristics2.mmObject();
			isDerived = false;
			xmlTag = "SttlmAdvc";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAdvice";
			definition = "Free form message advising the customer about the settlement of charges and taxes due.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max105Text.mmObject();
		}
	};
	/**
	 * Currency used to specify the account's balance currency.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.Account#ReportingCurrency
	 * Account.ReportingCurrency}</li>
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
	public static final MMMessageAttribute AccountBalanceCurrencyCode = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CashAccountCharacteristics2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Account.ReportingCurrency;
			isDerived = false;
			xmlTag = "AcctBalCcyCd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountBalanceCurrencyCode";
			definition = "Currency used to specify the account's balance currency.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}
	};
	/**
	 * Currency used to specify the account's settlement currency
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.CashAccount#SettlementCurrency
	 * CashAccount.SettlementCurrency}</li>
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
	 * "Currency used to specify the account's settlement currency"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute SettlementCurrencyCode = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CashAccountCharacteristics2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CashAccount.SettlementCurrency;
			isDerived = false;
			xmlTag = "SttlmCcyCd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementCurrencyCode";
			definition = "Currency used to specify the account's settlement currency";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}
	};
	/**
	 * Currency used to specify the account's taxing host currency.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.Tax#Currency Tax.Currency}</li>
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
	public static final MMMessageAttribute HostCurrencyCode = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CashAccountCharacteristics2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Tax.Currency;
			isDerived = false;
			xmlTag = "HstCcyCd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HostCurrencyCode";
			definition = "Currency used to specify the account's taxing host currency.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}
	};
	/**
	 * Describes account taxing parameters.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AccountTax1
	 * AccountTax1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#Tax
	 * CashAccount.Tax}</li>
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
	public static final MMMessageAssociationEnd Tax = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CashAccountCharacteristics2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CashAccount.Tax;
			isDerived = false;
			xmlTag = "Tax";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tax";
			definition = "Describes account taxing parameters.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> AccountTax1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Individual to contact at the financial institution's location regarding
	 * problems of a business nature.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.ContactDetails3
	 * ContactDetails3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Person#PersonIdentification
	 * Person.PersonIdentification}</li>
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
	public static final MMMessageAttribute AccountServicerContact = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CashAccountCharacteristics2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Person.PersonIdentification;
			isDerived = false;
			xmlTag = "AcctSvcrCtct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerContact";
			definition = "Individual to contact at the financial institution's location regarding problems of a business nature.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> ContactDetails3.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashAccountCharacteristics2.AccountLevel, com.tools20022.repository.msg.CashAccountCharacteristics2.CashAccount,
						com.tools20022.repository.msg.CashAccountCharacteristics2.AccountServicer, com.tools20022.repository.msg.CashAccountCharacteristics2.ParentAccount,
						com.tools20022.repository.msg.CashAccountCharacteristics2.CompensationMethod, com.tools20022.repository.msg.CashAccountCharacteristics2.DebitAccount,
						com.tools20022.repository.msg.CashAccountCharacteristics2.DelayedDebitDate, com.tools20022.repository.msg.CashAccountCharacteristics2.SettlementAdvice,
						com.tools20022.repository.msg.CashAccountCharacteristics2.AccountBalanceCurrencyCode, com.tools20022.repository.msg.CashAccountCharacteristics2.SettlementCurrencyCode,
						com.tools20022.repository.msg.CashAccountCharacteristics2.HostCurrencyCode, com.tools20022.repository.msg.CashAccountCharacteristics2.Tax,
						com.tools20022.repository.msg.CashAccountCharacteristics2.AccountServicerContact);
				trace_lazy = () -> com.tools20022.repository.entity.CashAccount.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CashAccountCharacteristics2";
				definition = "Specifies the characteristics of the cash account.";
			}
		});
		return mmObject_lazy.get();
	}
}