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
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.DebitCreditCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Process required for executing an end to end payment. It consists of a
 * payment initiation which may be followed by a series of instructions.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PaymentExecution" src="doc-files/PaymentExecution.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentExecution#CreditDebitIndicator
 * PaymentExecution.CreditDebitIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentExecution#CreationDate
 * PaymentExecution.CreationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentExecution#AcceptanceDateTime
 * PaymentExecution.AcceptanceDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentExecution#Payment
 * PaymentExecution.Payment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentExecution#ProcessingInstructions
 * PaymentExecution.ProcessingInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentExecution#RequestedExecutionDate
 * PaymentExecution.RequestedExecutionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentExecution#RelatedInvestigationCase
 * PaymentExecution.RelatedInvestigationCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentExecution#RelatedInvestigationCaseResolution
 * PaymentExecution.RelatedInvestigationCaseResolution}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentExecution#Next
 * PaymentExecution.Next}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentExecution#CurrencyExchange
 * PaymentExecution.CurrencyExchange}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#PaymentExecution
 * Payment.PaymentExecution}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentInstruction#Previous
 * PaymentInstruction.Previous}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#PaymentExecution
 * PaymentProcessing.PaymentExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#PaymentExecution
 * CurrencyExchange.PaymentExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase#UnderlyingInstruction
 * PaymentInvestigationCase.UnderlyingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#PaymentExecutionCorrection
 * PaymentInvestigationCaseResolution.PaymentExecutionCorrection}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification6#PaymentTypeInformation
 * RequestedModification6.PaymentTypeInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentInstruction
 * PaymentInstruction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDates2
 * TransactionDates2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalGroupHeader3
 * OriginalGroupHeader3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalGroupHeader2
 * OriginalGroupHeader2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalGroupHeader5
 * OriginalGroupHeader5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalGroupHeader7
 * OriginalGroupHeader7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalGroupHeader6
 * OriginalGroupHeader6}</li>
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
 * "PaymentExecution"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Process required for executing an end to end payment. It consists of a payment initiation which may be followed by a series of instructions."
 * </li>
 * </ul>
 */
public class PaymentExecution {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates whether the payment is a debit or a credit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DebitCreditCode
	 * DebitCreditCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution
	 * PaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the payment is a debit or a credit."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CreditDebitIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PaymentExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates whether the payment is a debit or a credit.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DebitCreditCode.mmObject();
		}
	};
	/**
	 * Date and time at which the payment execution was created by the
	 * instructing agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader58#CreationDateTime
	 * GroupHeader58.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader48#CreationDateTime
	 * GroupHeader48.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader55#CreationDateTime
	 * GroupHeader55.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation3#OriginalCreationDateTime
	 * OriginalGroupInformation3.OriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader56#CreationDateTime
	 * GroupHeader56.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader3#OriginalCreationDateTime
	 * OriginalGroupHeader3.OriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader52#CreationDateTime
	 * GroupHeader52.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader50#CreationDateTime
	 * GroupHeader50.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader53#CreationDateTime
	 * GroupHeader53.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader47#CreationDateTime
	 * GroupHeader47.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader2#OriginalCreationDateTime
	 * OriginalGroupHeader2.OriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader46#CreationDateTime
	 * GroupHeader46.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader45#CreationDateTime
	 * GroupHeader45.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader59#CreationDateTime
	 * GroupHeader59.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader5#OriginalCreationDateTime
	 * OriginalGroupHeader5.OriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader60#CreationDateTime
	 * GroupHeader60.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader63#CreationDateTime
	 * GroupHeader63.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader62#CreationDateTime
	 * GroupHeader62.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader70#CreationDateTime
	 * GroupHeader70.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification10#OriginalCreationDateTime
	 * OriginalNotification10.OriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification9#OriginalCreationDateTime
	 * OriginalNotification9.OriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader72#CreationDateTime
	 * GroupHeader72.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader71#CreationDateTime
	 * GroupHeader71.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalMessage2#OriginalCreationDateTime
	 * OriginalMessage2.OriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalMessage3#OriginalCreationDateTime
	 * OriginalMessage3.OriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation27#OriginalCreationDateTime
	 * OriginalGroupInformation27.OriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader7#OriginalCreationDateTime
	 * OriginalGroupHeader7.OriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation28#OriginalCreationDateTime
	 * OriginalGroupInformation28.OriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader6#OriginalCreationDateTime
	 * OriginalGroupHeader6.OriginalCreationDateTime}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution
	 * PaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which the payment execution was created by the instructing agent."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CreationDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.GroupHeader58.CreationDateTime, com.tools20022.repository.msg.GroupHeader48.CreationDateTime, com.tools20022.repository.msg.GroupHeader55.CreationDateTime,
					com.tools20022.repository.msg.OriginalGroupInformation3.OriginalCreationDateTime, com.tools20022.repository.msg.GroupHeader56.CreationDateTime,
					com.tools20022.repository.msg.OriginalGroupHeader3.OriginalCreationDateTime, com.tools20022.repository.msg.GroupHeader52.CreationDateTime, com.tools20022.repository.msg.GroupHeader50.CreationDateTime,
					com.tools20022.repository.msg.GroupHeader53.CreationDateTime, com.tools20022.repository.msg.GroupHeader47.CreationDateTime, com.tools20022.repository.msg.OriginalGroupHeader2.OriginalCreationDateTime,
					com.tools20022.repository.msg.GroupHeader46.CreationDateTime, com.tools20022.repository.msg.GroupHeader45.CreationDateTime, com.tools20022.repository.msg.GroupHeader59.CreationDateTime,
					com.tools20022.repository.msg.OriginalGroupHeader5.OriginalCreationDateTime, com.tools20022.repository.msg.GroupHeader60.CreationDateTime, com.tools20022.repository.msg.GroupHeader63.CreationDateTime,
					com.tools20022.repository.msg.GroupHeader62.CreationDateTime, com.tools20022.repository.msg.GroupHeader70.CreationDateTime, com.tools20022.repository.msg.OriginalNotification10.OriginalCreationDateTime,
					com.tools20022.repository.msg.OriginalNotification9.OriginalCreationDateTime, com.tools20022.repository.msg.GroupHeader72.CreationDateTime, com.tools20022.repository.msg.GroupHeader71.CreationDateTime,
					com.tools20022.repository.msg.OriginalMessage2.OriginalCreationDateTime, com.tools20022.repository.msg.OriginalMessage3.OriginalCreationDateTime,
					com.tools20022.repository.msg.OriginalGroupInformation27.OriginalCreationDateTime, com.tools20022.repository.msg.OriginalGroupHeader7.OriginalCreationDateTime,
					com.tools20022.repository.msg.OriginalGroupInformation28.OriginalCreationDateTime, com.tools20022.repository.msg.OriginalGroupHeader6.OriginalCreationDateTime);
			elementContext_lazy = () -> PaymentExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreationDate";
			definition = "Date and time at which the payment execution was created by the instructing agent.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date and time at which all processing conditions for execution of the
	 * payment are met and adequate financial cover is available at the account
	 * servicing agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDates2#AcceptanceDateTime
	 * TransactionDates2.AcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#AcceptanceDateTime
	 * CreditTransferTransaction25.AcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction73#AcceptanceDateTime
	 * PaymentTransaction73.AcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction80#AcceptanceDateTime
	 * PaymentTransaction80.AcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction83#AcceptanceDateTime
	 * PaymentTransaction83.AcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction82#AcceptanceDateTime
	 * PaymentTransaction82.AcceptanceDateTime}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution
	 * PaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptanceDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which all processing conditions for execution of the payment are met and adequate financial cover is available at the account servicing agent."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AcceptanceDateTime = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionDates2.AcceptanceDateTime, com.tools20022.repository.msg.CreditTransferTransaction25.AcceptanceDateTime,
					com.tools20022.repository.msg.PaymentTransaction73.AcceptanceDateTime, com.tools20022.repository.msg.PaymentTransaction80.AcceptanceDateTime, com.tools20022.repository.msg.PaymentTransaction83.AcceptanceDateTime,
					com.tools20022.repository.msg.PaymentTransaction82.AcceptanceDateTime);
			elementContext_lazy = () -> PaymentExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AcceptanceDateTime";
			definition = "Date and time at which all processing conditions for execution of the payment are met and adequate financial cover is available at the account servicing agent.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Specifies the end to end payment which is at the origin of the payment
	 * instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Payment#PaymentExecution
	 * Payment.PaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference8#OriginalItem
	 * OriginalNotificationReference8.OriginalItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference7#OriginalItemAndStatus
	 * OriginalNotificationReference7.OriginalItemAndStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction73#OriginalGroupInformation
	 * PaymentTransaction73.OriginalGroupInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction80#OriginalGroupInformation
	 * PaymentTransaction80.OriginalGroupInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction16#TransactionInformation
	 * UnderlyingTransaction16.TransactionInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction17#TransactionInformationAndStatus
	 * UnderlyingTransaction17.TransactionInformationAndStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution
	 * PaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Payment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the end to end payment which is at the origin of the payment instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Payment = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OriginalNotificationReference8.OriginalItem, com.tools20022.repository.msg.OriginalNotificationReference7.OriginalItemAndStatus,
					com.tools20022.repository.msg.PaymentTransaction73.OriginalGroupInformation, com.tools20022.repository.msg.PaymentTransaction80.OriginalGroupInformation,
					com.tools20022.repository.msg.UnderlyingTransaction16.TransactionInformation, com.tools20022.repository.msg.UnderlyingTransaction17.TransactionInformationAndStatus);
			elementContext_lazy = () -> PaymentExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Payment";
			definition = "Specifies the end to end payment which is at the origin of the payment instruction.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.PaymentExecution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies how the payment must be processed, for instance through which
	 * specific clearing channel.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#PaymentExecution
	 * PaymentProcessing.PaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentProcessing
	 * PaymentProcessing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader50#PaymentTypeInformation
	 * GroupHeader50.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction9#PaymentTypeInformation
	 * CreditTransferTransaction9.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#PaymentTypeInformation
	 * CreditTransferTransaction23.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader70#PaymentTypeInformation
	 * GroupHeader70.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#PaymentTypeInformation
	 * CreditTransferTransaction25.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#PaymentTypeInformation
	 * CreditTransferTransaction26.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction22#PaymentTypeInformation
	 * CreditTransferTransaction22.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction21#PaymentTypeInformation
	 * PaymentInstruction21.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction23#PaymentTypeInformation
	 * PaymentInstruction23.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22#PaymentTypeInformation
	 * PaymentInstruction22.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference24#PaymentTypeInformation
	 * OriginalTransactionReference24.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation7#PaymentTypeInformation
	 * OriginalPaymentInformation7.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference26#PaymentTypeInformation
	 * OriginalTransactionReference26.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#PaymentTypeInformation
	 * PaymentComplementaryInformation6.PaymentTypeInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution
	 * PaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingInstructions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies how the payment must be processed, for instance through which specific clearing channel."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ProcessingInstructions = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.GroupHeader50.PaymentTypeInformation, com.tools20022.repository.msg.CreditTransferTransaction9.PaymentTypeInformation,
					com.tools20022.repository.msg.CreditTransferTransaction23.PaymentTypeInformation, com.tools20022.repository.msg.GroupHeader70.PaymentTypeInformation,
					com.tools20022.repository.msg.CreditTransferTransaction25.PaymentTypeInformation, com.tools20022.repository.msg.CreditTransferTransaction26.PaymentTypeInformation,
					com.tools20022.repository.msg.CreditTransferTransaction22.PaymentTypeInformation, com.tools20022.repository.msg.PaymentInstruction21.PaymentTypeInformation,
					com.tools20022.repository.msg.PaymentInstruction23.PaymentTypeInformation, com.tools20022.repository.msg.PaymentInstruction22.PaymentTypeInformation,
					com.tools20022.repository.msg.OriginalTransactionReference24.PaymentTypeInformation, com.tools20022.repository.msg.OriginalPaymentInformation7.PaymentTypeInformation,
					com.tools20022.repository.msg.OriginalTransactionReference26.PaymentTypeInformation, com.tools20022.repository.msg.PaymentComplementaryInformation6.PaymentTypeInformation);
			elementContext_lazy = () -> PaymentExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProcessingInstructions";
			definition = "Specifies how the payment must be processed, for instance through which specific clearing channel.";
			minOccurs = 0;
			type_lazy = () -> PaymentProcessing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.PaymentExecution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Date at which the initiating party requests the clearing agent to process
	 * the payment. <br>
	 * Usage: This is the date on which the debtor's account is to be debited.
	 * If payment by cheque, the date when the cheque must be generated by the
	 * bank.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction21#RequestedCollectionDate
	 * PaymentInstruction21.RequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction23#RequestedExecutionDate
	 * PaymentInstruction23.RequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22#RequestedExecutionDate
	 * PaymentInstruction22.RequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation7#RequestedExecutionDate
	 * OriginalPaymentInformation7.RequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInitiation2#RequestedExecutionDate
	 * CorrectivePaymentInitiation2.RequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction3#RequestedExecutionDate
	 * UnderlyingPaymentInstruction3.RequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#RequestedExecutionDate
	 * PaymentComplementaryInformation6.RequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#RequestedCollectionDate
	 * PaymentComplementaryInformation6.RequestedCollectionDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution
	 * PaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedExecutionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date at which the initiating party requests the clearing agent to process the payment. \r\nUsage: This is the date on which the debtor's account is to be debited. If payment by cheque, the date when the cheque must be generated by the bank."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RequestedExecutionDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentInstruction21.RequestedCollectionDate, com.tools20022.repository.msg.PaymentInstruction23.RequestedExecutionDate,
					com.tools20022.repository.msg.PaymentInstruction22.RequestedExecutionDate, com.tools20022.repository.msg.OriginalPaymentInformation7.RequestedExecutionDate,
					com.tools20022.repository.msg.CorrectivePaymentInitiation2.RequestedExecutionDate, com.tools20022.repository.msg.UnderlyingPaymentInstruction3.RequestedExecutionDate,
					com.tools20022.repository.msg.PaymentComplementaryInformation6.RequestedExecutionDate, com.tools20022.repository.msg.PaymentComplementaryInformation6.RequestedCollectionDate);
			elementContext_lazy = () -> PaymentExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RequestedExecutionDate";
			definition = "Date at which the initiating party requests the clearing agent to process the payment. \r\nUsage: This is the date on which the debtor's account is to be debited. If payment by cheque, the date when the cheque must be generated by the bank.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Investigation case assigned to the payment execution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase#UnderlyingInstruction
	 * PaymentInvestigationCase.UnderlyingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase
	 * PaymentInvestigationCase}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader5#ResolvedCase
	 * OriginalGroupHeader5.ResolvedCase}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OriginalGroupHeader6#Case
	 * OriginalGroupHeader6.Case}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution
	 * PaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedInvestigationCase"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Investigation case assigned to the payment execution."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedInvestigationCase = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OriginalGroupHeader5.ResolvedCase, com.tools20022.repository.msg.OriginalGroupHeader6.Case);
			elementContext_lazy = () -> PaymentExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestigationCase";
			definition = "Investigation case assigned to the payment execution.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> PaymentInvestigationCase.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCase.UnderlyingInstruction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Payment investigation case resolution which is the source of the
	 * corrected payment execution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#PaymentExecutionCorrection
	 * PaymentInvestigationCaseResolution.PaymentExecutionCorrection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution
	 * PaymentInvestigationCaseResolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution
	 * PaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedInvestigationCaseResolution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment investigation case resolution which is the source of the corrected payment execution."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedInvestigationCaseResolution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestigationCaseResolution";
			definition = "Payment investigation case resolution which is the source of the corrected payment execution.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> PaymentInvestigationCaseResolution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCaseResolution.PaymentExecutionCorrection;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the next payment instruction in the payment end-to-end chain.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#Previous
	 * PaymentInstruction.Previous}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentInstruction
	 * PaymentInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution
	 * PaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Next"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the next payment instruction in the payment end-to-end chain."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Next = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Next";
			definition = "Specifies the next payment instruction in the payment end-to-end chain.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> PaymentInstruction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentInstruction.Previous;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Rate used to transform the original amount into the credited amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#PaymentExecution
	 * CurrencyExchange.PaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution
	 * PaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate used to transform the original amount into the credited amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CurrencyExchange = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchange";
			definition = "Rate used to transform the original amount into the credited amount.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.PaymentExecution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PaymentExecution";
				definition = "Process required for executing an end to end payment. It consists of a payment initiation which may be followed by a series of instructions.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Payment.PaymentExecution, com.tools20022.repository.entity.PaymentInstruction.Previous,
						com.tools20022.repository.entity.PaymentProcessing.PaymentExecution, com.tools20022.repository.entity.CurrencyExchange.PaymentExecution,
						com.tools20022.repository.entity.PaymentInvestigationCase.UnderlyingInstruction, com.tools20022.repository.entity.PaymentInvestigationCaseResolution.PaymentExecutionCorrection);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RequestedModification6.PaymentTypeInformation);
				subType_lazy = () -> Arrays.asList(PaymentInstruction.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentExecution.CreditDebitIndicator, com.tools20022.repository.entity.PaymentExecution.CreationDate,
						com.tools20022.repository.entity.PaymentExecution.AcceptanceDateTime, com.tools20022.repository.entity.PaymentExecution.Payment, com.tools20022.repository.entity.PaymentExecution.ProcessingInstructions,
						com.tools20022.repository.entity.PaymentExecution.RequestedExecutionDate, com.tools20022.repository.entity.PaymentExecution.RelatedInvestigationCase,
						com.tools20022.repository.entity.PaymentExecution.RelatedInvestigationCaseResolution, com.tools20022.repository.entity.PaymentExecution.Next, com.tools20022.repository.entity.PaymentExecution.CurrencyExchange);
				derivationComponent_lazy = () -> Arrays.asList(TransactionDates2.mmObject(), OriginalGroupHeader3.mmObject(), OriginalGroupHeader2.mmObject(), OriginalGroupHeader5.mmObject(), OriginalGroupHeader7.mmObject(),
						OriginalGroupHeader6.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}