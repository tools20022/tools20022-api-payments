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
import com.tools20022.repository.codeset.BillingStatementStatus1Code;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.CashAccountService;
import com.tools20022.repository.entity.Invoice;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.msg.BillingStatement2#StatementIdentification
 * BillingStatement2.StatementIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingStatement2#FromToDate
 * BillingStatement2.FromToDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingStatement2#CreationDateTime
 * BillingStatement2.CreationDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingStatement2#Status
 * BillingStatement2.Status}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingStatement2#AccountCharacteristics
 * BillingStatement2.AccountCharacteristics}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingStatement2#RateData
 * BillingStatement2.RateData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingStatement2#CurrencyExchange
 * BillingStatement2.CurrencyExchange}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingStatement2#Balance
 * BillingStatement2.Balance}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingStatement2#Compensation
 * BillingStatement2.Compensation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingStatement2#Service
 * BillingStatement2.Service}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingStatement2#TaxRegion
 * BillingStatement2.TaxRegion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingStatement2#BalanceAdjustment
 * BillingStatement2.BalanceAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingStatement2#ServiceAdjustment
 * BillingStatement2.ServiceAdjustment}</li>
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
public class BillingStatement2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Identification of the customer billing statement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#Identification
	 * GenericIdentification.Identification}</li>
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
	public static final MMMessageAttribute StatementIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BillingStatement2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.GenericIdentification.Identification;
			isDerived = false;
			xmlTag = "StmtId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementIdentification";
			definition = "Identification of the customer billing statement.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Date range between the start date and the end date for which the
	 * statement is issued.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.DatePeriod1
	 * DatePeriod1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Invoice#PeriodCovered
	 * Invoice.PeriodCovered}</li>
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
	public static final MMMessageAttribute FromToDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BillingStatement2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Invoice.PeriodCovered;
			isDerived = false;
			xmlTag = "FrToDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FromToDate";
			definition = "Date range between the start date and the end date for which the statement is issued.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> DatePeriod1.mmObject();
		}
	};
	/**
	 * Date the statement message was created.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document#IssueDate
	 * Document.IssueDate}</li>
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
	public static final MMMessageAttribute CreationDateTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BillingStatement2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Document.IssueDate;
			isDerived = false;
			xmlTag = "CreDtTm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreationDateTime";
			definition = "Date the statement message was created.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Defines the status of the statement.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.Document#Status
	 * Document.Status}</li>
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
	public static final MMMessageAttribute Status = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BillingStatement2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Document.Status;
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Defines the status of the statement.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> BillingStatementStatus1Code.mmObject();
		}
	};
	/**
	 * Specifies the details of the account characteristics.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2
	 * CashAccountCharacteristics2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountContract#CashAccount
	 * CashAccountContract.CashAccount}</li>
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
	public static final MMMessageAssociationEnd AccountCharacteristics = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> BillingStatement2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CashAccountContract.CashAccount;
			isDerived = false;
			xmlTag = "AcctChrtcs";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountCharacteristics";
			definition = "Specifies the details of the account characteristics.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CashAccountCharacteristics2.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Identifies the non tax per annum rate and factor values used within the
	 * statement along with any time dependent charge basis.
	 * <p>
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
	public static final MMMessageAssociationEnd RateData = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> BillingStatement2.mmObject();
			isDerived = false;
			xmlTag = "RateData";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateData";
			definition = "Identifies the non tax per annum rate and factor values used within the statement along with any time dependent charge basis.";
			minOccurs = 0;
			type_lazy = () -> BillingRate1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Specifies details related to currency exchange data.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CurrencyExchange6
	 * CurrencyExchange6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Invoice#CurrencyExchange
	 * Invoice.CurrencyExchange}</li>
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
	public static final MMMessageAssociationEnd CurrencyExchange = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> BillingStatement2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Invoice.CurrencyExchange;
			isDerived = false;
			xmlTag = "CcyXchg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyExchange";
			definition = "Specifies details related to currency exchange data.";
			minOccurs = 0;
			type_lazy = () -> CurrencyExchange6.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Identifies the average value of balances held within the statement
	 * period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BillingBalance1
	 * BillingBalance1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#CashBalance
	 * CashAccount.CashBalance}</li>
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
	public static final MMMessageAssociationEnd Balance = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> BillingStatement2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CashAccount.CashBalance;
			isDerived = false;
			xmlTag = "Bal";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Balance";
			definition = "Identifies the average value of balances held within the statement period.";
			minOccurs = 0;
			type_lazy = () -> BillingBalance1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Identifies the set of values and totals that are used to provide
	 * compensation information, service and tax totals.
	 * <p>
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
	public static final MMMessageAssociationEnd Compensation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> BillingStatement2.mmObject();
			businessComponentTrace_lazy = () -> CashAccountService.mmObject();
			isDerived = false;
			xmlTag = "Compstn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Compensation";
			definition = "Identifies the set of values and totals that are used to provide compensation information, service and tax totals.";
			minOccurs = 0;
			type_lazy = () -> BillingCompensation1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Specifies the values used for every line item service in the statement.
	 * <p>
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
	public static final MMMessageAssociationEnd Service = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> BillingStatement2.mmObject();
			businessComponentTrace_lazy = () -> CashAccountService.mmObject();
			isDerived = false;
			xmlTag = "Svc";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Service";
			definition = "Specifies the values used for every line item service in the statement.";
			minOccurs = 0;
			type_lazy = () -> BillingService2.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Tax region(s) that levy a tax on the services within this statement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BillingTaxRegion1
	 * BillingTaxRegion1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#AdministrationZone
	 * Tax.AdministrationZone}</li>
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
	public static final MMMessageAssociationEnd TaxRegion = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> BillingStatement2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Tax.AdministrationZone;
			isDerived = false;
			xmlTag = "TaxRgn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxRegion";
			definition = "Tax region(s) that levy a tax on the services within this statement.";
			minOccurs = 0;
			type_lazy = () -> BillingTaxRegion1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * One or more sections that identify balance or float adjustments to the
	 * account. They can reflect either adjustments to the current statement or
	 * adjustments to statements from prior reporting periods.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BalanceAdjustment1
	 * BalanceAdjustment1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#CashBalance
	 * CashAccount.CashBalance}</li>
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
	public static final MMMessageAssociationEnd BalanceAdjustment = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> BillingStatement2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CashAccount.CashBalance;
			isDerived = false;
			xmlTag = "BalAdjstmnt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceAdjustment";
			definition = "One or more sections that identify balance or float adjustments to the account. They can reflect either adjustments to the current statement or adjustments to statements from prior reporting periods.";
			minOccurs = 0;
			type_lazy = () -> BalanceAdjustment1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * One or more sections that identify line item service adjustments to the
	 * account. They reflect adjustments to statements from prior reporting
	 * periods.
	 * <p>
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
	public static final MMMessageAssociationEnd ServiceAdjustment = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> BillingStatement2.mmObject();
			businessComponentTrace_lazy = () -> CashAccountService.mmObject();
			isDerived = false;
			xmlTag = "SvcAdjstmnt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceAdjustment";
			definition = "One or more sections that identify line item service adjustments to the account. They reflect adjustments to statements from prior reporting periods.";
			minOccurs = 0;
			type_lazy = () -> BillingServiceAdjustment1.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BillingStatement2.StatementIdentification, com.tools20022.repository.msg.BillingStatement2.FromToDate,
						com.tools20022.repository.msg.BillingStatement2.CreationDateTime, com.tools20022.repository.msg.BillingStatement2.Status, com.tools20022.repository.msg.BillingStatement2.AccountCharacteristics,
						com.tools20022.repository.msg.BillingStatement2.RateData, com.tools20022.repository.msg.BillingStatement2.CurrencyExchange, com.tools20022.repository.msg.BillingStatement2.Balance,
						com.tools20022.repository.msg.BillingStatement2.Compensation, com.tools20022.repository.msg.BillingStatement2.Service, com.tools20022.repository.msg.BillingStatement2.TaxRegion,
						com.tools20022.repository.msg.BillingStatement2.BalanceAdjustment, com.tools20022.repository.msg.BillingStatement2.ServiceAdjustment);
				trace_lazy = () -> Invoice.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BillingStatement2";
				definition = "Details of the statement reporting the bank services billing.";
			}
		});
		return mmObject_lazy.get();
	}
}