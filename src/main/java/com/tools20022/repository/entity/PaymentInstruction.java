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
import com.tools20022.repository.codeset.InstructionCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.entity.PaymentExecution;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Instruction to pay an amount of money to an ultimate beneficiary, on behalf
 * of an originator. This instruction may have to be forwarded several times to
 * complete the settlement chain.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PaymentInstruction" src="doc-files/PaymentInstruction.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#ProcessingValidityTime
 * PaymentInstruction.ProcessingValidityTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#InstructionForNextAgent
 * PaymentInstruction.InstructionForNextAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#SettlementInstruction
 * PaymentInstruction.SettlementInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#ClearingChargeAmount
 * PaymentInstruction.ClearingChargeAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#StandingOrder
 * PaymentInstruction.StandingOrder}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentInstruction#Previous
 * PaymentInstruction.Previous}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#PaymentInstruction
 * DateTimePeriod.PaymentInstruction}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentExecution#Next
 * PaymentExecution.Next}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlement#RelatedPaymentInstruction
 * CashSettlement.RelatedPaymentInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingOrder#PaymentInstructionTrigger
 * StandingOrder.PaymentInstructionTrigger}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalNotification10#OriginalNotificationReference
 * OriginalNotification10.OriginalNotificationReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalNotification9#OriginalNotificationReference
 * OriginalNotification9.OriginalNotificationReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnderlyingTransaction3Choice#Initiation
 * UnderlyingTransaction3Choice.Initiation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction16#OriginalGroupInformationAndCancellation
 * UnderlyingTransaction16.OriginalGroupInformationAndCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation13#OriginalPaymentInformation
 * RemittanceInformation13.OriginalPaymentInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateAcceptance5#OriginalMessageInformation
 * MandateAcceptance5.OriginalMessageInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction17#OriginalGroupInformationAndStatus
 * UnderlyingTransaction17.OriginalGroupInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction17#OriginalPaymentInformationAndStatus
 * UnderlyingTransaction17.OriginalPaymentInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction15#OriginalGroupInformationAndCancellation
 * UnderlyingTransaction15.OriginalGroupInformationAndCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction15#OriginalPaymentInformationAndCancellation
 * UnderlyingTransaction15.OriginalPaymentInformationAndCancellation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.PaymentExecution
 * PaymentExecution}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.InstructionForNextAgent1
 * InstructionForNextAgent1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalMessageInformation1
 * OriginalMessageInformation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnderlyingPaymentTransaction2
 * UnderlyingPaymentTransaction2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalNotification10
 * OriginalNotification10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalNotification9
 * OriginalNotification9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalNotificationReference8
 * OriginalNotificationReference8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalNotificationReference7
 * OriginalNotificationReference7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentInstruction21
 * PaymentInstruction21}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnderlyingTransaction16
 * UnderlyingTransaction16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RequestedModification6
 * RequestedModification6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentInstruction23
 * PaymentInstruction23}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnderlyingTransaction17
 * UnderlyingTransaction17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentInstruction22
 * PaymentInstruction22}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnderlyingTransaction15
 * UnderlyingTransaction15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction3
 * UnderlyingPaymentInstruction3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6
 * PaymentComplementaryInformation6}</li>
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
 * "PaymentInstruction"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Instruction to pay an amount of money to an ultimate beneficiary, on behalf of an originator. This instruction may have to be forwarded several times to complete the settlement chain."
 * </li>
 * </ul>
 */
public class PaymentInstruction extends PaymentExecution {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Date and time range within which the payment instruction must be
	 * processed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#PaymentInstruction
	 * DateTimePeriod.PaymentInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction
	 * PaymentInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingValidityTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time range within which the payment instruction must be processed."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ProcessingValidityTime = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProcessingValidityTime";
			definition = "Date and time range within which the payment instruction must be processed.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.PaymentInstruction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Further information related to the processing of the payment instruction
	 * that may need to be acted upon by the next agent. <br>
	 * Usage: The next agent may not be the creditor agent.<br>
	 * The instruction can relate to a level of service, can be an instruction
	 * that has to be executed by the agent, or can be information required by
	 * the next agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionCode
	 * InstructionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructionForNextAgent1#Code
	 * InstructionForNextAgent1.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#InstructionForNextAgent
	 * CreditTransferTransaction23.InstructionForNextAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#InstructionForNextAgent
	 * CreditTransferTransaction25.InstructionForNextAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction24#InstructionForNextAgent
	 * CreditTransferTransaction24.InstructionForNextAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification6#InstructionForNextAgent
	 * RequestedModification6.InstructionForNextAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#InstructionForNextAgent
	 * PaymentComplementaryInformation6.InstructionForNextAgent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction
	 * PaymentInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionForNextAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Further information related to the processing of the payment instruction that may need to be acted upon by the next agent. \r\nUsage: The next agent may not be the creditor agent.\r\nThe instruction can relate to a level of service, can be an instruction that has to be executed by the agent, or can be information required by the next agent."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute InstructionForNextAgent = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InstructionForNextAgent1.Code, com.tools20022.repository.msg.CreditTransferTransaction23.InstructionForNextAgent,
					com.tools20022.repository.msg.CreditTransferTransaction25.InstructionForNextAgent, com.tools20022.repository.msg.CreditTransferTransaction24.InstructionForNextAgent,
					com.tools20022.repository.msg.RequestedModification6.InstructionForNextAgent, com.tools20022.repository.msg.PaymentComplementaryInformation6.InstructionForNextAgent);
			elementContext_lazy = () -> PaymentInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InstructionForNextAgent";
			definition = "Further information related to the processing of the payment instruction that may need to be acted upon by the next agent. \r\nUsage: The next agent may not be the creditor agent.\r\nThe instruction can relate to a level of service, can be an instruction that has to be executed by the agent, or can be information required by the next agent.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> InstructionCode.mmObject();
		}
	};
	/**
	 * Instruction for the cash settlement between two clearing agents.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement#RelatedPaymentInstruction
	 * CashSettlement.RelatedPaymentInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashSettlement
	 * CashSettlement}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader50#SettlementInformation
	 * GroupHeader50.SettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#SettlementTimeIndication
	 * CreditTransferTransaction23.SettlementTimeIndication}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader70#SettlementInformation
	 * GroupHeader70.SettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#SettlementTimeIndication
	 * CreditTransferTransaction25.SettlementTimeIndication}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader72#SettlementInformation
	 * GroupHeader72.SettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader71#SettlementInformation
	 * GroupHeader71.SettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference24#SettlementInformation
	 * OriginalTransactionReference24.SettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79#ResolutionRelatedInformation
	 * PaymentTransaction79.ResolutionRelatedInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#SettlementInformation
	 * PaymentComplementaryInformation6.SettlementInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction
	 * PaymentInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction for the cash settlement between two clearing agents."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SettlementInstruction = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.GroupHeader50.SettlementInformation, com.tools20022.repository.msg.CreditTransferTransaction23.SettlementTimeIndication,
					com.tools20022.repository.msg.GroupHeader70.SettlementInformation, com.tools20022.repository.msg.CreditTransferTransaction25.SettlementTimeIndication, com.tools20022.repository.msg.GroupHeader72.SettlementInformation,
					com.tools20022.repository.msg.GroupHeader71.SettlementInformation, com.tools20022.repository.msg.OriginalTransactionReference24.SettlementInformation,
					com.tools20022.repository.msg.PaymentTransaction79.ResolutionRelatedInformation, com.tools20022.repository.msg.PaymentComplementaryInformation6.SettlementInformation);
			elementContext_lazy = () -> PaymentInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementInstruction";
			definition = "Instruction for the cash settlement between two clearing agents.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CashSettlement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashSettlement.RelatedPaymentInstruction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Amount of money taken by a clearing agent as compensation for the
	 * processing of the payment instruction. This charge is paid either by the
	 * debtor or by the creditor or shared between them.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction
	 * PaymentInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingChargeAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money taken by a clearing agent as compensation for the processing of the payment instruction. This charge is paid either by the debtor or by the creditor or shared between them."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ClearingChargeAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PaymentInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClearingChargeAmount";
			definition = "Amount of money taken by a clearing agent as compensation for the processing of the payment instruction. This charge is paid either by the debtor or by the creditor or shared between them.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Instruction given by an account holder to an account servicer to make
	 * regular transfers on given dates to the same beneficiary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.StandingOrder#PaymentInstructionTrigger
	 * StandingOrder.PaymentInstructionTrigger}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.StandingOrder
	 * StandingOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction
	 * PaymentInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction given by an account holder to an account servicer to make regular transfers on given dates to the same beneficiary."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd StandingOrder = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingOrder";
			definition = "Instruction given by an account holder to an account servicer to make regular transfers on given dates to the same beneficiary.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.StandingOrder.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.StandingOrder.PaymentInstructionTrigger;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies that a payment instruction may be preceeded by another payment
	 * instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution#Next
	 * PaymentExecution.Next}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentExecution
	 * PaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction
	 * PaymentInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Previous"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that a payment instruction may be preceeded by another payment instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Previous = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Previous";
			definition = "Specifies that a payment instruction may be preceeded by another payment instruction.";
			minOccurs = 0;
			type_lazy = () -> PaymentExecution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentExecution.Next;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PaymentInstruction";
				definition = "Instruction to pay an amount of money to an ultimate beneficiary, on behalf of an originator. This instruction may have to be forwarded several times to complete the settlement chain.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DateTimePeriod.PaymentInstruction, com.tools20022.repository.entity.PaymentExecution.Next,
						com.tools20022.repository.entity.CashSettlement.RelatedPaymentInstruction, com.tools20022.repository.entity.StandingOrder.PaymentInstructionTrigger);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OriginalNotification10.OriginalNotificationReference, com.tools20022.repository.msg.OriginalNotification9.OriginalNotificationReference,
						com.tools20022.repository.choice.UnderlyingTransaction3Choice.Initiation, com.tools20022.repository.msg.UnderlyingTransaction16.OriginalGroupInformationAndCancellation,
						com.tools20022.repository.msg.RemittanceInformation13.OriginalPaymentInformation, com.tools20022.repository.msg.MandateAcceptance5.OriginalMessageInformation,
						com.tools20022.repository.msg.UnderlyingTransaction17.OriginalGroupInformationAndStatus, com.tools20022.repository.msg.UnderlyingTransaction17.OriginalPaymentInformationAndStatus,
						com.tools20022.repository.msg.UnderlyingTransaction15.OriginalGroupInformationAndCancellation, com.tools20022.repository.msg.UnderlyingTransaction15.OriginalPaymentInformationAndCancellation);
				superType_lazy = () -> PaymentExecution.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentInstruction.ProcessingValidityTime, com.tools20022.repository.entity.PaymentInstruction.InstructionForNextAgent,
						com.tools20022.repository.entity.PaymentInstruction.SettlementInstruction, com.tools20022.repository.entity.PaymentInstruction.ClearingChargeAmount, com.tools20022.repository.entity.PaymentInstruction.StandingOrder,
						com.tools20022.repository.entity.PaymentInstruction.Previous);
				derivationComponent_lazy = () -> Arrays.asList(InstructionForNextAgent1.mmObject(), OriginalMessageInformation1.mmObject(), UnderlyingPaymentTransaction2.mmObject(), OriginalNotification10.mmObject(),
						OriginalNotification9.mmObject(), OriginalNotificationReference8.mmObject(), OriginalNotificationReference7.mmObject(), PaymentInstruction21.mmObject(), UnderlyingTransaction16.mmObject(),
						RequestedModification6.mmObject(), PaymentInstruction23.mmObject(), UnderlyingTransaction17.mmObject(), PaymentInstruction22.mmObject(), UnderlyingTransaction15.mmObject(), UnderlyingPaymentInstruction3.mmObject(),
						PaymentComplementaryInformation6.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}