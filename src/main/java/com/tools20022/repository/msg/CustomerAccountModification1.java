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
import com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceAmendmentRequestV02;
import com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceRequestV02;
import com.tools20022.repository.choice.AccountIdentification4Choice;
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Account owned by a customer.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1#mmIdentification
 * CustomerAccountModification1.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1#mmName
 * CustomerAccountModification1.mmName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1#mmStatus
 * CustomerAccountModification1.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1#mmType
 * CustomerAccountModification1.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1#mmCurrency
 * CustomerAccountModification1.mmCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1#mmMonthlyPaymentValue
 * CustomerAccountModification1.mmMonthlyPaymentValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1#mmMonthlyReceivedValue
 * CustomerAccountModification1.mmMonthlyReceivedValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1#mmMonthlyTransactionNumber
 * CustomerAccountModification1.mmMonthlyTransactionNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1#mmAverageBalance
 * CustomerAccountModification1.mmAverageBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1#mmAccountPurpose
 * CustomerAccountModification1.mmAccountPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1#mmFloorNotificationAmount
 * CustomerAccountModification1.mmFloorNotificationAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1#mmCeilingNotificationAmount
 * CustomerAccountModification1.mmCeilingNotificationAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1#mmStatementFrequencyAndFormat
 * CustomerAccountModification1.mmStatementFrequencyAndFormat}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1#mmClosingDate
 * CustomerAccountModification1.mmClosingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1#mmRestriction
 * CustomerAccountModification1.mmRestriction}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CashAccount
 * CashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceAmendmentRequestV02#mmAccount
 * AccountExcludedMandateMaintenanceAmendmentRequestV02.mmAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceRequestV02#mmAccount
 * AccountExcludedMandateMaintenanceRequestV02.mmAccount}</li>
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
 * "CustomerAccountModification1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Account owned by a customer."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CustomerAccount5 CustomerAccount5}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CustomerAccountModification1", propOrder = {"identification", "name", "status", "type", "currency", "monthlyPaymentValue", "monthlyReceivedValue", "monthlyTransactionNumber", "averageBalance", "accountPurpose",
		"floorNotificationAmount", "ceilingNotificationAmount", "statementFrequencyAndFormat", "closingDate", "restriction"})
public class CustomerAccountModification1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected List<AccountIdentification4Choice> identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
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
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1
	 * CustomerAccountModification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the account."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccountModification1.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification of the account.";
			minOccurs = 1;
			complexType_lazy = () -> AccountIdentification4Choice.mmObject();
		}
	};
	@XmlElement(name = "Nm")
	protected NameModification1 name;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.NameModification1
	 * NameModification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification#mmName
	 * AccountIdentification.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1
	 * CustomerAccountModification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Nm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name of the account. It provides an additional means of identification, and is designated by the account servicer in agreement with the account owner."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AccountIdentification.mmName;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccountModification1.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Name of the account. It provides an additional means of identification, and is designated by the account servicer in agreement with the account owner.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.NameModification1.mmObject();
		}
	};
	@XmlElement(name = "Sts")
	protected AccountStatusModification1 status;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AccountStatusModification1
	 * AccountStatusModification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountStatus#mmStatus
	 * AccountStatus.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1
	 * CustomerAccountModification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the current state of an account, eg, enabled or deleted."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AccountStatus.mmStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccountModification1.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Specifies the current state of an account, eg, enabled or deleted.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AccountStatusModification1.mmObject();
		}
	};
	@XmlElement(name = "Tp")
	protected TypeModification1 type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TypeModification1
	 * TypeModification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1
	 * CustomerAccountModification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of the account."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmType = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> CashAccount.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccountModification1.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Type of the account.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.TypeModification1.mmObject();
		}
	};
	@XmlElement(name = "Ccy", required = true)
	protected ActiveCurrencyCode currency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveCurrencyCode
	 * ActiveCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmReportingCurrency
	 * Account.mmReportingCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1
	 * CustomerAccountModification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ccy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Medium of exchange of value."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Account.mmReportingCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccountModification1.mmObject();
			isDerived = false;
			xmlTag = "Ccy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Medium of exchange of value.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}
	};
	@XmlElement(name = "MnthlyPmtVal")
	protected AmountModification1 monthlyPaymentValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountModification1
	 * AmountModification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountReportedMovement#mmMonthlyPaymentValue
	 * AccountReportedMovement.mmMonthlyPaymentValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1
	 * CustomerAccountModification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MnthlyPmtVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MonthlyPaymentValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Monthly average of the payment amounts (that is, payments going out) over a year."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMonthlyPaymentValue = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AccountReportedMovement.mmMonthlyPaymentValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccountModification1.mmObject();
			isDerived = false;
			xmlTag = "MnthlyPmtVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MonthlyPaymentValue";
			definition = "Monthly average of the payment amounts (that is, payments going out) over a year.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountModification1.mmObject();
		}
	};
	@XmlElement(name = "MnthlyRcvdVal")
	protected AmountModification1 monthlyReceivedValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountModification1
	 * AmountModification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountReportedMovement#mmMonthlyReceivedValue
	 * AccountReportedMovement.mmMonthlyReceivedValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1
	 * CustomerAccountModification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MnthlyRcvdVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MonthlyReceivedValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Monthly average of the received amounts over a year (that is, payments coming in)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMonthlyReceivedValue = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AccountReportedMovement.mmMonthlyReceivedValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccountModification1.mmObject();
			isDerived = false;
			xmlTag = "MnthlyRcvdVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MonthlyReceivedValue";
			definition = "Monthly average of the received amounts over a year (that is, payments coming in).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountModification1.mmObject();
		}
	};
	@XmlElement(name = "MnthlyTxNb")
	protected NumberModification1 monthlyTransactionNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.NumberModification1
	 * NumberModification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountReportedMovement#mmMonthlyTransactionNumber
	 * AccountReportedMovement.mmMonthlyTransactionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1
	 * CustomerAccountModification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MnthlyTxNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MonthlyTransactionNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Monthly average of the number of payments (coming in and going out) over a year."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMonthlyTransactionNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AccountReportedMovement.mmMonthlyTransactionNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccountModification1.mmObject();
			isDerived = false;
			xmlTag = "MnthlyTxNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MonthlyTransactionNumber";
			definition = "Monthly average of the number of payments (coming in and going out) over a year.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.NumberModification1.mmObject();
		}
	};
	@XmlElement(name = "AvrgBal")
	protected AmountModification1 averageBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountModification1
	 * AmountModification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountReportedMovement#mmAverageBalance
	 * AccountReportedMovement.mmAverageBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1
	 * CustomerAccountModification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AvrgBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AverageBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sum of the end of day balances over a month divided by the number of business days in the month."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAverageBalance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AccountReportedMovement.mmAverageBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccountModification1.mmObject();
			isDerived = false;
			xmlTag = "AvrgBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AverageBalance";
			definition = "Sum of the end of day balances over a month divided by the number of business days in the month.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountModification1.mmObject();
		}
	};
	@XmlElement(name = "AcctPurp")
	protected PurposeModification1 accountPurpose;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PurposeModification1
	 * PurposeModification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmPurpose
	 * Account.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1
	 * CustomerAccountModification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctPurp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountPurpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the purpose of the account."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountPurpose = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Account.mmPurpose;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccountModification1.mmObject();
			isDerived = false;
			xmlTag = "AcctPurp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountPurpose";
			definition = "Specifies the purpose of the account.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.PurposeModification1.mmObject();
		}
	};
	@XmlElement(name = "FlrNtfctnAmt")
	protected AmountModification1 floorNotificationAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountModification1
	 * AmountModification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ReportingService#mmFloorNotificationAmount
	 * ReportingService.mmFloorNotificationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1
	 * CustomerAccountModification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FlrNtfctnAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FloorNotificationAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the value of the balance under which a notification will be sent to the account owner."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFloorNotificationAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ReportingService.mmFloorNotificationAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccountModification1.mmObject();
			isDerived = false;
			xmlTag = "FlrNtfctnAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FloorNotificationAmount";
			definition = "Specifies the value of the balance under which a notification will be sent to the account owner.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountModification1.mmObject();
		}
	};
	@XmlElement(name = "ClngNtfctnAmt")
	protected AmountModification1 ceilingNotificationAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountModification1
	 * AmountModification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ReportingService#mmCeilingNotificationAmount
	 * ReportingService.mmCeilingNotificationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1
	 * CustomerAccountModification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClngNtfctnAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CeilingNotificationAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the value of the balance above which a notification will be sent to the account owner."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCeilingNotificationAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ReportingService.mmCeilingNotificationAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccountModification1.mmObject();
			isDerived = false;
			xmlTag = "ClngNtfctnAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CeilingNotificationAmount";
			definition = "Specifies the value of the balance above which a notification will be sent to the account owner.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountModification1.mmObject();
		}
	};
	@XmlElement(name = "StmtFrqcyAndFrmt")
	protected List<com.tools20022.repository.msg.StatementFrequencyAndFormModification1> statementFrequencyAndFormat;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.StatementFrequencyAndFormModification1
	 * StatementFrequencyAndFormModification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ReportingService#mmStatementFrequency
	 * ReportingService.mmStatementFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1
	 * CustomerAccountModification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmtFrqcyAndFrmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementFrequencyAndFormat"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies how often statements (for audit purposes) will be sent, in which format, to which address."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatementFrequencyAndFormat = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ReportingService.mmStatementFrequency;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccountModification1.mmObject();
			isDerived = false;
			xmlTag = "StmtFrqcyAndFrmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementFrequencyAndFormat";
			definition = "Specifies how often statements (for audit purposes) will be sent, in which format, to which address.";
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.StatementFrequencyAndFormModification1.mmObject();
		}
	};
	@XmlElement(name = "ClsgDt")
	protected DateModification1 closingDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DateModification1
	 * DateModification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmClosingDate
	 * Account.mmClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1
	 * CustomerAccountModification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClsgDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date when the account will be or was closed."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClosingDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Account.mmClosingDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccountModification1.mmObject();
			isDerived = false;
			xmlTag = "ClsgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingDate";
			definition = "Date when the account will be or was closed.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.DateModification1.mmObject();
		}
	};
	@XmlElement(name = "Rstrctn")
	protected List<com.tools20022.repository.msg.RestrictionModification1> restriction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.RestrictionModification1
	 * RestrictionModification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmAccountRestriction
	 * Account.mmAccountRestriction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1
	 * CustomerAccountModification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rstrctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Restriction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Restriction on capability or operations allowed."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRestriction = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Account.mmAccountRestriction;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccountModification1.mmObject();
			isDerived = false;
			xmlTag = "Rstrctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Restriction";
			definition = "Restriction on capability or operations allowed.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.RestrictionModification1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CustomerAccountModification1.mmIdentification, com.tools20022.repository.msg.CustomerAccountModification1.mmName,
						com.tools20022.repository.msg.CustomerAccountModification1.mmStatus, com.tools20022.repository.msg.CustomerAccountModification1.mmType, com.tools20022.repository.msg.CustomerAccountModification1.mmCurrency,
						com.tools20022.repository.msg.CustomerAccountModification1.mmMonthlyPaymentValue, com.tools20022.repository.msg.CustomerAccountModification1.mmMonthlyReceivedValue,
						com.tools20022.repository.msg.CustomerAccountModification1.mmMonthlyTransactionNumber, com.tools20022.repository.msg.CustomerAccountModification1.mmAverageBalance,
						com.tools20022.repository.msg.CustomerAccountModification1.mmAccountPurpose, com.tools20022.repository.msg.CustomerAccountModification1.mmFloorNotificationAmount,
						com.tools20022.repository.msg.CustomerAccountModification1.mmCeilingNotificationAmount, com.tools20022.repository.msg.CustomerAccountModification1.mmStatementFrequencyAndFormat,
						com.tools20022.repository.msg.CustomerAccountModification1.mmClosingDate, com.tools20022.repository.msg.CustomerAccountModification1.mmRestriction);
				messageBuildingBlock_lazy = () -> Arrays.asList(AccountExcludedMandateMaintenanceAmendmentRequestV02.mmAccount, AccountExcludedMandateMaintenanceRequestV02.mmAccount);
				trace_lazy = () -> CashAccount.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CustomerAccountModification1";
				definition = "Account owned by a customer.";
				previousVersion_lazy = () -> CustomerAccount5.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<AccountIdentification4Choice> getIdentification() {
		return identification == null ? identification = new ArrayList<>() : identification;
	}

	public CustomerAccountModification1 setIdentification(List<AccountIdentification4Choice> identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Optional<NameModification1> getName() {
		return name == null ? Optional.empty() : Optional.of(name);
	}

	public CustomerAccountModification1 setName(com.tools20022.repository.msg.NameModification1 name) {
		this.name = name;
		return this;
	}

	public Optional<AccountStatusModification1> getStatus() {
		return status == null ? Optional.empty() : Optional.of(status);
	}

	public CustomerAccountModification1 setStatus(com.tools20022.repository.msg.AccountStatusModification1 status) {
		this.status = status;
		return this;
	}

	public Optional<TypeModification1> getType() {
		return type == null ? Optional.empty() : Optional.of(type);
	}

	public CustomerAccountModification1 setType(com.tools20022.repository.msg.TypeModification1 type) {
		this.type = type;
		return this;
	}

	public ActiveCurrencyCode getCurrency() {
		return currency;
	}

	public CustomerAccountModification1 setCurrency(ActiveCurrencyCode currency) {
		this.currency = Objects.requireNonNull(currency);
		return this;
	}

	public Optional<AmountModification1> getMonthlyPaymentValue() {
		return monthlyPaymentValue == null ? Optional.empty() : Optional.of(monthlyPaymentValue);
	}

	public CustomerAccountModification1 setMonthlyPaymentValue(com.tools20022.repository.msg.AmountModification1 monthlyPaymentValue) {
		this.monthlyPaymentValue = monthlyPaymentValue;
		return this;
	}

	public Optional<AmountModification1> getMonthlyReceivedValue() {
		return monthlyReceivedValue == null ? Optional.empty() : Optional.of(monthlyReceivedValue);
	}

	public CustomerAccountModification1 setMonthlyReceivedValue(com.tools20022.repository.msg.AmountModification1 monthlyReceivedValue) {
		this.monthlyReceivedValue = monthlyReceivedValue;
		return this;
	}

	public Optional<NumberModification1> getMonthlyTransactionNumber() {
		return monthlyTransactionNumber == null ? Optional.empty() : Optional.of(monthlyTransactionNumber);
	}

	public CustomerAccountModification1 setMonthlyTransactionNumber(com.tools20022.repository.msg.NumberModification1 monthlyTransactionNumber) {
		this.monthlyTransactionNumber = monthlyTransactionNumber;
		return this;
	}

	public Optional<AmountModification1> getAverageBalance() {
		return averageBalance == null ? Optional.empty() : Optional.of(averageBalance);
	}

	public CustomerAccountModification1 setAverageBalance(com.tools20022.repository.msg.AmountModification1 averageBalance) {
		this.averageBalance = averageBalance;
		return this;
	}

	public Optional<PurposeModification1> getAccountPurpose() {
		return accountPurpose == null ? Optional.empty() : Optional.of(accountPurpose);
	}

	public CustomerAccountModification1 setAccountPurpose(com.tools20022.repository.msg.PurposeModification1 accountPurpose) {
		this.accountPurpose = accountPurpose;
		return this;
	}

	public Optional<AmountModification1> getFloorNotificationAmount() {
		return floorNotificationAmount == null ? Optional.empty() : Optional.of(floorNotificationAmount);
	}

	public CustomerAccountModification1 setFloorNotificationAmount(com.tools20022.repository.msg.AmountModification1 floorNotificationAmount) {
		this.floorNotificationAmount = floorNotificationAmount;
		return this;
	}

	public Optional<AmountModification1> getCeilingNotificationAmount() {
		return ceilingNotificationAmount == null ? Optional.empty() : Optional.of(ceilingNotificationAmount);
	}

	public CustomerAccountModification1 setCeilingNotificationAmount(com.tools20022.repository.msg.AmountModification1 ceilingNotificationAmount) {
		this.ceilingNotificationAmount = ceilingNotificationAmount;
		return this;
	}

	public List<StatementFrequencyAndFormModification1> getStatementFrequencyAndFormat() {
		return statementFrequencyAndFormat == null ? statementFrequencyAndFormat = new ArrayList<>() : statementFrequencyAndFormat;
	}

	public CustomerAccountModification1 setStatementFrequencyAndFormat(List<com.tools20022.repository.msg.StatementFrequencyAndFormModification1> statementFrequencyAndFormat) {
		this.statementFrequencyAndFormat = Objects.requireNonNull(statementFrequencyAndFormat);
		return this;
	}

	public Optional<DateModification1> getClosingDate() {
		return closingDate == null ? Optional.empty() : Optional.of(closingDate);
	}

	public CustomerAccountModification1 setClosingDate(com.tools20022.repository.msg.DateModification1 closingDate) {
		this.closingDate = closingDate;
		return this;
	}

	public List<RestrictionModification1> getRestriction() {
		return restriction == null ? restriction = new ArrayList<>() : restriction;
	}

	public CustomerAccountModification1 setRestriction(List<com.tools20022.repository.msg.RestrictionModification1> restriction) {
		this.restriction = Objects.requireNonNull(restriction);
		return this;
	}
}