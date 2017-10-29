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
import com.tools20022.repository.choice.ReportingSource1Choice;
import com.tools20022.repository.codeset.CopyDuplicate1Code;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max500Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.CashBalance;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides further details of the account notification.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountNotification12#Identification
 * AccountNotification12.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountNotification12#NotificationPagination
 * AccountNotification12.NotificationPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountNotification12#ElectronicSequenceNumber
 * AccountNotification12.ElectronicSequenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountNotification12#LegalSequenceNumber
 * AccountNotification12.LegalSequenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountNotification12#CreationDateTime
 * AccountNotification12.CreationDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountNotification12#FromToDate
 * AccountNotification12.FromToDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountNotification12#CopyDuplicateIndicator
 * AccountNotification12.CopyDuplicateIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountNotification12#ReportingSource
 * AccountNotification12.ReportingSource}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountNotification12#Account
 * AccountNotification12.Account}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountNotification12#RelatedAccount
 * AccountNotification12.RelatedAccount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountNotification12#Interest
 * AccountNotification12.Interest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountNotification12#TransactionsSummary
 * AccountNotification12.TransactionsSummary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountNotification12#Entry
 * AccountNotification12.Entry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountNotification12#AdditionalNotificationInformation
 * AccountNotification12.AdditionalNotificationInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CashBalance
 * CashBalance}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerDebitCreditNotificationV06#Notification
 * BankToCustomerDebitCreditNotificationV06.Notification}</li>
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
 * "AccountNotification12"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides further details of the account notification."</li>
 * </ul>
 */
public class AccountNotification12 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Unique identification, as assigned by the account servicer, to
	 * unambiguously identify the account notification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification12
	 * AccountNotification12}</li>
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
	 * definition} =
	 * "Unique identification, as assigned by the account servicer, to unambiguously identify the account notification."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute Identification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AccountNotification12.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique identification, as assigned by the account servicer, to unambiguously identify the account notification.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Provides details on the page number of the notification.<br>
	 * <br>
	 * Usage: The pagination of the notification is only allowed when agreed
	 * between the parties.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Pagination
	 * Pagination}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification12
	 * AccountNotification12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtfctnPgntn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotificationPagination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details on the page number of the notification.\r\n\r\nUsage: The pagination of the notification is only allowed when agreed between the parties."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute NotificationPagination = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AccountNotification12.mmObject();
			isDerived = false;
			xmlTag = "NtfctnPgntn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotificationPagination";
			definition = "Provides details on the page number of the notification.\r\n\r\nUsage: The pagination of the notification is only allowed when agreed between the parties.";
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> Pagination.mmObject();
		}
	};
	/**
	 * Sequential number of the notification, as assigned by the account
	 * servicer. Usage: The sequential number is increased incrementally for
	 * each notification sent electronically.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification12
	 * AccountNotification12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ElctrncSeqNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectronicSequenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sequential number of the notification, as assigned by the account servicer. \nUsage: The sequential number is increased incrementally for each notification sent electronically."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute ElectronicSequenceNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AccountNotification12.mmObject();
			isDerived = false;
			xmlTag = "ElctrncSeqNb";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectronicSequenceNumber";
			definition = "Sequential number of the notification, as assigned by the account servicer. \nUsage: The sequential number is increased incrementally for each notification sent electronically.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Legal sequential number of the notification, as assigned by the account
	 * servicer. It is increased incrementally for each notification sent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification12
	 * AccountNotification12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LglSeqNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegalSequenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Legal sequential number of the notification, as assigned by the account servicer. It is increased incrementally for each notification sent."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute LegalSequenceNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AccountNotification12.mmObject();
			isDerived = false;
			xmlTag = "LglSeqNb";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegalSequenceNumber";
			definition = "Legal sequential number of the notification, as assigned by the account servicer. It is increased incrementally for each notification sent.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Date and time at which the message was created.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification12
	 * AccountNotification12}</li>
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
	 * definition} = "Date and time at which the message was created."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute CreationDateTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AccountNotification12.mmObject();
			isDerived = false;
			xmlTag = "CreDtTm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreationDateTime";
			definition = "Date and time at which the message was created.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Range of time between a start date and an end date for which the account
	 * notification is issued.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DateTimePeriodDetails
	 * DateTimePeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#ReportedPeriod
	 * Account.ReportedPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification12
	 * AccountNotification12}</li>
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
	 * "Range of time between a start date and an end date for which the account notification is issued."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd FromToDate = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AccountNotification12.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Account.ReportedPeriod;
			isDerived = false;
			xmlTag = "FrToDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FromToDate";
			definition = "Range of time between a start date and an end date for which the account notification is issued.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriodDetails.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Indicates whether the document is a copy, a duplicate, or a duplicate of
	 * a copy.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CopyDuplicate1Code
	 * CopyDuplicate1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification12
	 * AccountNotification12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CpyDplctInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CopyDuplicateIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the document is a copy, a duplicate, or a duplicate of a copy."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute CopyDuplicateIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AccountNotification12.mmObject();
			isDerived = false;
			xmlTag = "CpyDplctInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CopyDuplicateIndicator";
			definition = "Indicates whether the document is a copy, a duplicate, or a duplicate of a copy.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> CopyDuplicate1Code.mmObject();
		}
	};
	/**
	 * Specifies the application used to generate the reporting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ReportingSource1Choice
	 * ReportingSource1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification12
	 * AccountNotification12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptgSrc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportingSource"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the application used to generate the reporting."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd ReportingSource = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AccountNotification12.mmObject();
			isDerived = false;
			xmlTag = "RptgSrc";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportingSource";
			definition = "Specifies the application used to generate the reporting.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> ReportingSource1Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Unambiguous identification of the account to which credit and debit
	 * entries are made.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount25
	 * CashAccount25}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashBalance#CashAccount
	 * CashBalance.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification12
	 * AccountNotification12}</li>
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
	 * definition} =
	 * "Unambiguous identification of the account to which credit and debit entries are made."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Account = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AccountNotification12.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CashBalance.CashAccount;
			isDerived = false;
			xmlTag = "Acct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Account";
			definition = "Unambiguous identification of the account to which credit and debit entries are made.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CashAccount25.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Identifies the parent account of the account for which the notification
	 * has been issued.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount24
	 * CashAccount24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashBalance#CashAccount
	 * CashBalance.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification12
	 * AccountNotification12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the parent account of the account for which the notification has been issued."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd RelatedAccount = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AccountNotification12.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CashBalance.CashAccount;
			isDerived = false;
			xmlTag = "RltdAcct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedAccount";
			definition = "Identifies the parent account of the account for which the notification has been issued.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CashAccount24.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Provides general interest information that applies to the account at a
	 * particular moment in time.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AccountInterest3
	 * AccountInterest3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#InterestCalculation
	 * Interest.InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification12
	 * AccountNotification12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Intrst"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides general interest information that applies to the account at a particular moment in time."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Interest = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AccountNotification12.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Interest.InterestCalculation;
			isDerived = false;
			xmlTag = "Intrst";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Interest";
			definition = "Provides general interest information that applies to the account at a particular moment in time.";
			minOccurs = 0;
			type_lazy = () -> AccountInterest3.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Provides summary information on entries.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TotalTransactions5
	 * TotalTransactions5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification12
	 * AccountNotification12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxsSummry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionsSummary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides summary information on entries."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd TransactionsSummary = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AccountNotification12.mmObject();
			isDerived = false;
			xmlTag = "TxsSummry";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionsSummary";
			definition = "Provides summary information on entries.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> TotalTransactions5.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Specifies an entry in the debit credit notification.<br>
	 * Usage: At least one reference must be provided to identify the entry and
	 * its underlying transaction(s).<br>
	 * <br>
	 * Usage Rule: In case of a Payments R-transaction the creditor / debtor
	 * referenced of the original payment initiation messages is also used for
	 * reporting of the R-transaction. The original debtor/creditor in the
	 * reporting of R-Transactions is not inverted. <br>
	 * Following elements all defined in the TransactionDetails in
	 * RelatedParties or RelatedAgents are impacted by this usage rule:<br>
	 * Creditor, UltimateCreditor, CreditorAccount, CreditorAgent, Debtor,
	 * UltimateDebtor, DebtorAccount and DebtorAgent.<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ReportEntry8
	 * ReportEntry8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashBalance#CashBalanceEntry
	 * CashBalance.CashBalanceEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification12
	 * AccountNotification12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Entry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies an entry in the debit credit notification.\r\nUsage: At least one reference must be provided to identify the entry and its underlying transaction(s).\r\n\r\nUsage Rule:  In case of a Payments R-transaction the creditor / debtor referenced of the original payment initiation messages is also used for reporting of the R-transaction. The original debtor/creditor in the reporting of R-Transactions is not inverted. \r\nFollowing elements all defined in the TransactionDetails in RelatedParties or RelatedAgents are impacted by this usage rule:\r\nCreditor, UltimateCreditor, CreditorAccount, CreditorAgent, Debtor, UltimateDebtor, DebtorAccount and DebtorAgent.\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Entry = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AccountNotification12.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CashBalance.CashBalanceEntry;
			isDerived = false;
			xmlTag = "Ntry";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Entry";
			definition = "Specifies an entry in the debit credit notification.\r\nUsage: At least one reference must be provided to identify the entry and its underlying transaction(s).\r\n\r\nUsage Rule:  In case of a Payments R-transaction the creditor / debtor referenced of the original payment initiation messages is also used for reporting of the R-transaction. The original debtor/creditor in the reporting of R-Transactions is not inverted. \r\nFollowing elements all defined in the TransactionDetails in RelatedParties or RelatedAgents are impacted by this usage rule:\r\nCreditor, UltimateCreditor, CreditorAccount, CreditorAgent, Debtor, UltimateDebtor, DebtorAccount and DebtorAgent.\r\n";
			minOccurs = 0;
			type_lazy = () -> ReportEntry8.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Further details of the account notification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max500Text
	 * Max500Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification12
	 * AccountNotification12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlNtfctnInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalNotificationInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Further details of the account notification."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute AdditionalNotificationInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AccountNotification12.mmObject();
			isDerived = false;
			xmlTag = "AddtlNtfctnInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalNotificationInformation";
			definition = "Further details of the account notification.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max500Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountNotification12.Identification, com.tools20022.repository.msg.AccountNotification12.NotificationPagination,
						com.tools20022.repository.msg.AccountNotification12.ElectronicSequenceNumber, com.tools20022.repository.msg.AccountNotification12.LegalSequenceNumber,
						com.tools20022.repository.msg.AccountNotification12.CreationDateTime, com.tools20022.repository.msg.AccountNotification12.FromToDate, com.tools20022.repository.msg.AccountNotification12.CopyDuplicateIndicator,
						com.tools20022.repository.msg.AccountNotification12.ReportingSource, com.tools20022.repository.msg.AccountNotification12.Account, com.tools20022.repository.msg.AccountNotification12.RelatedAccount,
						com.tools20022.repository.msg.AccountNotification12.Interest, com.tools20022.repository.msg.AccountNotification12.TransactionsSummary, com.tools20022.repository.msg.AccountNotification12.Entry,
						com.tools20022.repository.msg.AccountNotification12.AdditionalNotificationInformation);
				trace_lazy = () -> CashBalance.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.BankToCustomerDebitCreditNotificationV06.Notification);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AccountNotification12";
				definition = "Provides further details of the account notification.";
			}
		});
		return mmObject_lazy.get();
	}
}