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
import com.tools20022.repository.codeset.BillingStatementStatus1Code;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details of the statement reporting the bank services billing.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingStatement2#mmStatementIdentification
 * BillingStatement2.mmStatementIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingStatement2#mmFromToDate
 * BillingStatement2.mmFromToDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingStatement2#mmCreationDateTime
 * BillingStatement2.mmCreationDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingStatement2#mmStatus
 * BillingStatement2.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingStatement2#mmAccountCharacteristics
 * BillingStatement2.mmAccountCharacteristics}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingStatement2#mmRateData
 * BillingStatement2.mmRateData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingStatement2#mmCurrencyExchange
 * BillingStatement2.mmCurrencyExchange}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingStatement2#mmBalance
 * BillingStatement2.mmBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingStatement2#mmCompensation
 * BillingStatement2.mmCompensation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingStatement2#mmService
 * BillingStatement2.mmService}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingStatement2#mmTaxRegion
 * BillingStatement2.mmTaxRegion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingStatement2#mmBalanceAdjustment
 * BillingStatement2.mmBalanceAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingStatement2#mmServiceAdjustment
 * BillingStatement2.mmServiceAdjustment}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Invoice Invoice}</li>
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
 * "BillingStatement2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details of the statement reporting the bank services billing."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "BillingStatement2", propOrder = {"statementIdentification", "fromToDate", "creationDateTime", "status", "accountCharacteristics", "rateData", "currencyExchange", "balance", "compensation", "service", "taxRegion",
		"balanceAdjustment", "serviceAdjustment"})
public class BillingStatement2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "StmtId", required = true)
	protected Max35Text statementIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingStatement2
	 * BillingStatement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmtId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the customer billing statement."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatementIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingStatement2.mmObject();
			isDerived = false;
			xmlTag = "StmtId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementIdentification";
			definition = "Identification of the customer billing statement.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "FrToDt", required = true)
	protected DatePeriod1 fromToDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.DatePeriod1
	 * DatePeriod1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Invoice#mmPeriodCovered
	 * Invoice.mmPeriodCovered}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingStatement2
	 * BillingStatement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrToDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FromToDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date range between the start date and the end date for which the statement is issued."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFromToDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Invoice.mmPeriodCovered;
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingStatement2.mmObject();
			isDerived = false;
			xmlTag = "FrToDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FromToDate";
			definition = "Date range between the start date and the end date for which the statement is issued.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.DatePeriod1.mmObject();
		}
	};
	@XmlElement(name = "CreDtTm", required = true)
	protected ISODateTime creationDateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmIssueDate
	 * Document.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingStatement2
	 * BillingStatement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CreDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreationDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date the statement message was created."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCreationDateTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Document.mmIssueDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingStatement2.mmObject();
			isDerived = false;
			xmlTag = "CreDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreationDateTime";
			definition = "Date the statement message was created.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	@XmlElement(name = "Sts", required = true)
	protected BillingStatementStatus1Code status;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BillingStatementStatus1Code
	 * BillingStatementStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmStatus
	 * Document.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingStatement2
	 * BillingStatement2}</li>
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
	 * definition} = "Defines the status of the statement."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Document.mmStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingStatement2.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Defines the status of the statement.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BillingStatementStatus1Code.mmObject();
		}
	};
	@XmlElement(name = "AcctChrtcs", required = true)
	protected CashAccountCharacteristics2 accountCharacteristics;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2
	 * CashAccountCharacteristics2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountContract#mmCashAccount
	 * CashAccountContract.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingStatement2
	 * BillingStatement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctChrtcs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountCharacteristics"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the details of the account characteristics."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountCharacteristics = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CashAccountContract.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingStatement2.mmObject();
			isDerived = false;
			xmlTag = "AcctChrtcs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountCharacteristics";
			definition = "Specifies the details of the account characteristics.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccountCharacteristics2.mmObject();
		}
	};
	@XmlElement(name = "RateData")
	protected List<com.tools20022.repository.msg.BillingRate1> rateData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BillingRate1
	 * BillingRate1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingStatement2
	 * BillingStatement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RateData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the non tax per annum rate and factor values used within the statement along with any time dependent charge basis."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRateData = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingStatement2.mmObject();
			isDerived = false;
			xmlTag = "RateData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateData";
			definition = "Identifies the non tax per annum rate and factor values used within the statement along with any time dependent charge basis.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BillingRate1.mmObject();
		}
	};
	@XmlElement(name = "CcyXchg")
	protected List<com.tools20022.repository.msg.CurrencyExchange6> currencyExchange;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CurrencyExchange6
	 * CurrencyExchange6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Invoice#mmCurrencyExchange
	 * Invoice.mmCurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingStatement2
	 * BillingStatement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CcyXchg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies details related to currency exchange data."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCurrencyExchange = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Invoice.mmCurrencyExchange;
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingStatement2.mmObject();
			isDerived = false;
			xmlTag = "CcyXchg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyExchange";
			definition = "Specifies details related to currency exchange data.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CurrencyExchange6.mmObject();
		}
	};
	@XmlElement(name = "Bal")
	protected List<com.tools20022.repository.msg.BillingBalance1> balance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BillingBalance1
	 * BillingBalance1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmCashBalance
	 * CashAccount.mmCashBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingStatement2
	 * BillingStatement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Bal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Balance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the average value of balances held within the statement period."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBalance = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CashAccount.mmCashBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingStatement2.mmObject();
			isDerived = false;
			xmlTag = "Bal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Balance";
			definition = "Identifies the average value of balances held within the statement period.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BillingBalance1.mmObject();
		}
	};
	@XmlElement(name = "Compstn")
	protected List<com.tools20022.repository.msg.BillingCompensation1> compensation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BillingCompensation1
	 * BillingCompensation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountService
	 * CashAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingStatement2
	 * BillingStatement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Compstn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Compensation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the set of values and totals that are used to provide compensation information, service and tax totals."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCompensation = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CashAccountService.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingStatement2.mmObject();
			isDerived = false;
			xmlTag = "Compstn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Compensation";
			definition = "Identifies the set of values and totals that are used to provide compensation information, service and tax totals.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BillingCompensation1.mmObject();
		}
	};
	@XmlElement(name = "Svc")
	protected List<com.tools20022.repository.msg.BillingService2> service;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BillingService2
	 * BillingService2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountService
	 * CashAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingStatement2
	 * BillingStatement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Svc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Service"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the values used for every line item service in the statement."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmService = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CashAccountService.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingStatement2.mmObject();
			isDerived = false;
			xmlTag = "Svc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Service";
			definition = "Specifies the values used for every line item service in the statement.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BillingService2.mmObject();
		}
	};
	@XmlElement(name = "TaxRgn")
	protected List<com.tools20022.repository.msg.BillingTaxRegion1> taxRegion;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BillingTaxRegion1
	 * BillingTaxRegion1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAdministrationZone
	 * Tax.mmAdministrationZone}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingStatement2
	 * BillingStatement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxRgn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRegion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Tax region(s) that levy a tax on the services within this statement."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTaxRegion = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Tax.mmAdministrationZone;
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingStatement2.mmObject();
			isDerived = false;
			xmlTag = "TaxRgn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxRegion";
			definition = "Tax region(s) that levy a tax on the services within this statement.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BillingTaxRegion1.mmObject();
		}
	};
	@XmlElement(name = "BalAdjstmnt")
	protected List<com.tools20022.repository.msg.BalanceAdjustment1> balanceAdjustment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BalanceAdjustment1
	 * BalanceAdjustment1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmCashBalance
	 * CashAccount.mmCashBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingStatement2
	 * BillingStatement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BalAdjstmnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceAdjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "One or more sections that identify balance or float adjustments to the account. They can reflect either adjustments to the current statement or adjustments to statements from prior reporting periods."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBalanceAdjustment = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CashAccount.mmCashBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingStatement2.mmObject();
			isDerived = false;
			xmlTag = "BalAdjstmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceAdjustment";
			definition = "One or more sections that identify balance or float adjustments to the account. They can reflect either adjustments to the current statement or adjustments to statements from prior reporting periods.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BalanceAdjustment1.mmObject();
		}
	};
	@XmlElement(name = "SvcAdjstmnt")
	protected List<com.tools20022.repository.msg.BillingServiceAdjustment1> serviceAdjustment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1
	 * BillingServiceAdjustment1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountService
	 * CashAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingStatement2
	 * BillingStatement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SvcAdjstmnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServiceAdjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "One or more sections that identify line item service adjustments to the account. They reflect adjustments to statements from prior reporting periods."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmServiceAdjustment = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CashAccountService.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingStatement2.mmObject();
			isDerived = false;
			xmlTag = "SvcAdjstmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceAdjustment";
			definition = "One or more sections that identify line item service adjustments to the account. They reflect adjustments to statements from prior reporting periods.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BillingServiceAdjustment1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BillingStatement2.mmStatementIdentification, com.tools20022.repository.msg.BillingStatement2.mmFromToDate,
						com.tools20022.repository.msg.BillingStatement2.mmCreationDateTime, com.tools20022.repository.msg.BillingStatement2.mmStatus, com.tools20022.repository.msg.BillingStatement2.mmAccountCharacteristics,
						com.tools20022.repository.msg.BillingStatement2.mmRateData, com.tools20022.repository.msg.BillingStatement2.mmCurrencyExchange, com.tools20022.repository.msg.BillingStatement2.mmBalance,
						com.tools20022.repository.msg.BillingStatement2.mmCompensation, com.tools20022.repository.msg.BillingStatement2.mmService, com.tools20022.repository.msg.BillingStatement2.mmTaxRegion,
						com.tools20022.repository.msg.BillingStatement2.mmBalanceAdjustment, com.tools20022.repository.msg.BillingStatement2.mmServiceAdjustment);
				trace_lazy = () -> Invoice.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BillingStatement2";
				definition = "Details of the statement reporting the bank services billing.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getStatementIdentification() {
		return statementIdentification;
	}

	public BillingStatement2 setStatementIdentification(Max35Text statementIdentification) {
		this.statementIdentification = Objects.requireNonNull(statementIdentification);
		return this;
	}

	public DatePeriod1 getFromToDate() {
		return fromToDate;
	}

	public BillingStatement2 setFromToDate(com.tools20022.repository.msg.DatePeriod1 fromToDate) {
		this.fromToDate = Objects.requireNonNull(fromToDate);
		return this;
	}

	public ISODateTime getCreationDateTime() {
		return creationDateTime;
	}

	public BillingStatement2 setCreationDateTime(ISODateTime creationDateTime) {
		this.creationDateTime = Objects.requireNonNull(creationDateTime);
		return this;
	}

	public BillingStatementStatus1Code getStatus() {
		return status;
	}

	public BillingStatement2 setStatus(BillingStatementStatus1Code status) {
		this.status = Objects.requireNonNull(status);
		return this;
	}

	public CashAccountCharacteristics2 getAccountCharacteristics() {
		return accountCharacteristics;
	}

	public BillingStatement2 setAccountCharacteristics(com.tools20022.repository.msg.CashAccountCharacteristics2 accountCharacteristics) {
		this.accountCharacteristics = Objects.requireNonNull(accountCharacteristics);
		return this;
	}

	public List<BillingRate1> getRateData() {
		return rateData == null ? rateData = new ArrayList<>() : rateData;
	}

	public BillingStatement2 setRateData(List<com.tools20022.repository.msg.BillingRate1> rateData) {
		this.rateData = Objects.requireNonNull(rateData);
		return this;
	}

	public List<CurrencyExchange6> getCurrencyExchange() {
		return currencyExchange == null ? currencyExchange = new ArrayList<>() : currencyExchange;
	}

	public BillingStatement2 setCurrencyExchange(List<com.tools20022.repository.msg.CurrencyExchange6> currencyExchange) {
		this.currencyExchange = Objects.requireNonNull(currencyExchange);
		return this;
	}

	public List<BillingBalance1> getBalance() {
		return balance == null ? balance = new ArrayList<>() : balance;
	}

	public BillingStatement2 setBalance(List<com.tools20022.repository.msg.BillingBalance1> balance) {
		this.balance = Objects.requireNonNull(balance);
		return this;
	}

	public List<BillingCompensation1> getCompensation() {
		return compensation == null ? compensation = new ArrayList<>() : compensation;
	}

	public BillingStatement2 setCompensation(List<com.tools20022.repository.msg.BillingCompensation1> compensation) {
		this.compensation = Objects.requireNonNull(compensation);
		return this;
	}

	public List<BillingService2> getService() {
		return service == null ? service = new ArrayList<>() : service;
	}

	public BillingStatement2 setService(List<com.tools20022.repository.msg.BillingService2> service) {
		this.service = Objects.requireNonNull(service);
		return this;
	}

	public List<BillingTaxRegion1> getTaxRegion() {
		return taxRegion == null ? taxRegion = new ArrayList<>() : taxRegion;
	}

	public BillingStatement2 setTaxRegion(List<com.tools20022.repository.msg.BillingTaxRegion1> taxRegion) {
		this.taxRegion = Objects.requireNonNull(taxRegion);
		return this;
	}

	public List<BalanceAdjustment1> getBalanceAdjustment() {
		return balanceAdjustment == null ? balanceAdjustment = new ArrayList<>() : balanceAdjustment;
	}

	public BillingStatement2 setBalanceAdjustment(List<com.tools20022.repository.msg.BalanceAdjustment1> balanceAdjustment) {
		this.balanceAdjustment = Objects.requireNonNull(balanceAdjustment);
		return this;
	}

	public List<BillingServiceAdjustment1> getServiceAdjustment() {
		return serviceAdjustment == null ? serviceAdjustment = new ArrayList<>() : serviceAdjustment;
	}

	public BillingStatement2 setServiceAdjustment(List<com.tools20022.repository.msg.BillingServiceAdjustment1> serviceAdjustment) {
		this.serviceAdjustment = Objects.requireNonNull(serviceAdjustment);
		return this;
	}
}