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

import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.UnderlyingTransaction3Choice;
import com.tools20022.repository.codeset.InstructionCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.entity.PaymentExecution;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.PaymentExecution
 * PaymentExecution}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#mmProcessingValidityTime
 * PaymentInstruction.mmProcessingValidityTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#mmInstructionForNextAgent
 * PaymentInstruction.mmInstructionForNextAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#mmSettlementInstruction
 * PaymentInstruction.mmSettlementInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#mmClearingChargeAmount
 * PaymentInstruction.mmClearingChargeAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#mmStandingOrder
 * PaymentInstruction.mmStandingOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#mmPrevious
 * PaymentInstruction.mmPrevious}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmPaymentInstruction
 * DateTimePeriod.mmPaymentInstruction}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentExecution#mmNext
 * PaymentExecution.mmNext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmRelatedPaymentInstruction
 * CashSettlement.mmRelatedPaymentInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingOrder#mmPaymentInstructionTrigger
 * StandingOrder.mmPaymentInstructionTrigger}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalNotification10#mmOriginalNotificationReference
 * OriginalNotification10.mmOriginalNotificationReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalNotification9#mmOriginalNotificationReference
 * OriginalNotification9.mmOriginalNotificationReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnderlyingTransaction3Choice#mmInitiation
 * UnderlyingTransaction3Choice.mmInitiation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction16#mmOriginalGroupInformationAndCancellation
 * UnderlyingTransaction16.mmOriginalGroupInformationAndCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation13#mmOriginalPaymentInformation
 * RemittanceInformation13.mmOriginalPaymentInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateAcceptance5#mmOriginalMessageInformation
 * MandateAcceptance5.mmOriginalMessageInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction17#mmOriginalGroupInformationAndStatus
 * UnderlyingTransaction17.mmOriginalGroupInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction17#mmOriginalPaymentInformationAndStatus
 * UnderlyingTransaction17.mmOriginalPaymentInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction15#mmOriginalGroupInformationAndCancellation
 * UnderlyingTransaction15.mmOriginalGroupInformationAndCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction15#mmOriginalPaymentInformationAndCancellation
 * UnderlyingTransaction15.mmOriginalPaymentInformationAndCancellation}</li>
 * </ul>
 * </li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	protected DateTimePeriod processingValidityTime;
	/**
	 * Date and time range within which the payment instruction must be
	 * processed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmPaymentInstruction
	 * DateTimePeriod.mmPaymentInstruction}</li>
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
	public static final MMBusinessAssociationEnd mmProcessingValidityTime = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentInstruction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProcessingValidityTime";
			definition = "Date and time range within which the payment instruction must be processed.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmPaymentInstruction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected InstructionCode instructionForNextAgent;
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
	 * {@linkplain com.tools20022.repository.msg.InstructionForNextAgent1#mmCode
	 * InstructionForNextAgent1.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#mmInstructionForNextAgent
	 * CreditTransferTransaction23.mmInstructionForNextAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#mmInstructionForNextAgent
	 * CreditTransferTransaction25.mmInstructionForNextAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction24#mmInstructionForNextAgent
	 * CreditTransferTransaction24.mmInstructionForNextAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification6#mmInstructionForNextAgent
	 * RequestedModification6.mmInstructionForNextAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#mmInstructionForNextAgent
	 * PaymentComplementaryInformation6.mmInstructionForNextAgent}</li>
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
	public static final MMBusinessAttribute mmInstructionForNextAgent = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(InstructionForNextAgent1.mmCode, CreditTransferTransaction23.mmInstructionForNextAgent, CreditTransferTransaction25.mmInstructionForNextAgent,
					CreditTransferTransaction24.mmInstructionForNextAgent, RequestedModification6.mmInstructionForNextAgent, PaymentComplementaryInformation6.mmInstructionForNextAgent);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentInstruction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InstructionForNextAgent";
			definition = "Further information related to the processing of the payment instruction that may need to be acted upon by the next agent. \r\nUsage: The next agent may not be the creditor agent.\r\nThe instruction can relate to a level of service, can be an instruction that has to be executed by the agent, or can be information required by the next agent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InstructionCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentInstruction.class.getMethod("getInstructionForNextAgent", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CashSettlement settlementInstruction;
	/**
	 * Instruction for the cash settlement between two clearing agents.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmRelatedPaymentInstruction
	 * CashSettlement.mmRelatedPaymentInstruction}</li>
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
	 * {@linkplain com.tools20022.repository.msg.GroupHeader50#mmSettlementInformation
	 * GroupHeader50.mmSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#mmSettlementTimeIndication
	 * CreditTransferTransaction23.mmSettlementTimeIndication}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader70#mmSettlementInformation
	 * GroupHeader70.mmSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#mmSettlementTimeIndication
	 * CreditTransferTransaction25.mmSettlementTimeIndication}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader72#mmSettlementInformation
	 * GroupHeader72.mmSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader71#mmSettlementInformation
	 * GroupHeader71.mmSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference24#mmSettlementInformation
	 * OriginalTransactionReference24.mmSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79#mmResolutionRelatedInformation
	 * PaymentTransaction79.mmResolutionRelatedInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#mmSettlementInformation
	 * PaymentComplementaryInformation6.mmSettlementInformation}</li>
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
	public static final MMBusinessAssociationEnd mmSettlementInstruction = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(GroupHeader50.mmSettlementInformation, CreditTransferTransaction23.mmSettlementTimeIndication, GroupHeader70.mmSettlementInformation, CreditTransferTransaction25.mmSettlementTimeIndication,
					GroupHeader72.mmSettlementInformation, GroupHeader71.mmSettlementInformation, OriginalTransactionReference24.mmSettlementInformation, PaymentTransaction79.mmResolutionRelatedInformation,
					PaymentComplementaryInformation6.mmSettlementInformation);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentInstruction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementInstruction";
			definition = "Instruction for the cash settlement between two clearing agents.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CashSettlement.mmRelatedPaymentInstruction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashSettlement.mmObject();
		}
	};
	protected CurrencyAndAmount clearingChargeAmount;
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
	public static final MMBusinessAttribute mmClearingChargeAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentInstruction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClearingChargeAmount";
			definition = "Amount of money taken by a clearing agent as compensation for the processing of the payment instruction. This charge is paid either by the debtor or by the creditor or shared between them.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentInstruction.class.getMethod("getClearingChargeAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected StandingOrder standingOrder;
	/**
	 * Instruction given by an account holder to an account servicer to make
	 * regular transfers on given dates to the same beneficiary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.StandingOrder#mmPaymentInstructionTrigger
	 * StandingOrder.mmPaymentInstructionTrigger}</li>
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
	public static final MMBusinessAssociationEnd mmStandingOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentInstruction.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingOrder";
			definition = "Instruction given by an account holder to an account servicer to make regular transfers on given dates to the same beneficiary.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.StandingOrder.mmPaymentInstructionTrigger;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.StandingOrder.mmObject();
		}
	};
	protected List<PaymentExecution> previous;
	/**
	 * Specifies that a payment instruction may be preceeded by another payment
	 * instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmNext
	 * PaymentExecution.mmNext}</li>
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
	public static final MMBusinessAssociationEnd mmPrevious = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentInstruction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Previous";
			definition = "Specifies that a payment instruction may be preceeded by another payment instruction.";
			minOccurs = 0;
			opposite_lazy = () -> PaymentExecution.mmNext;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PaymentExecution.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentInstruction";
				definition = "Instruction to pay an amount of money to an ultimate beneficiary, on behalf of an originator. This instruction may have to be forwarded several times to complete the settlement chain.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DateTimePeriod.mmPaymentInstruction, PaymentExecution.mmNext, com.tools20022.repository.entity.CashSettlement.mmRelatedPaymentInstruction,
						com.tools20022.repository.entity.StandingOrder.mmPaymentInstructionTrigger);
				derivationElement_lazy = () -> Arrays.asList(OriginalNotification10.mmOriginalNotificationReference, OriginalNotification9.mmOriginalNotificationReference, UnderlyingTransaction3Choice.mmInitiation,
						UnderlyingTransaction16.mmOriginalGroupInformationAndCancellation, RemittanceInformation13.mmOriginalPaymentInformation, MandateAcceptance5.mmOriginalMessageInformation,
						UnderlyingTransaction17.mmOriginalGroupInformationAndStatus, UnderlyingTransaction17.mmOriginalPaymentInformationAndStatus, UnderlyingTransaction15.mmOriginalGroupInformationAndCancellation,
						UnderlyingTransaction15.mmOriginalPaymentInformationAndCancellation);
				superType_lazy = () -> PaymentExecution.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentInstruction.mmProcessingValidityTime, com.tools20022.repository.entity.PaymentInstruction.mmInstructionForNextAgent,
						com.tools20022.repository.entity.PaymentInstruction.mmSettlementInstruction, com.tools20022.repository.entity.PaymentInstruction.mmClearingChargeAmount,
						com.tools20022.repository.entity.PaymentInstruction.mmStandingOrder, com.tools20022.repository.entity.PaymentInstruction.mmPrevious);
				derivationComponent_lazy = () -> Arrays.asList(InstructionForNextAgent1.mmObject(), OriginalMessageInformation1.mmObject(), UnderlyingPaymentTransaction2.mmObject(), OriginalNotification10.mmObject(),
						OriginalNotification9.mmObject(), OriginalNotificationReference8.mmObject(), OriginalNotificationReference7.mmObject(), PaymentInstruction21.mmObject(), UnderlyingTransaction16.mmObject(),
						RequestedModification6.mmObject(), PaymentInstruction23.mmObject(), UnderlyingTransaction17.mmObject(), PaymentInstruction22.mmObject(), UnderlyingTransaction15.mmObject(), UnderlyingPaymentInstruction3.mmObject(),
						PaymentComplementaryInformation6.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return PaymentInstruction.class;
			}
		});
		return mmObject_lazy.get();
	}

	public DateTimePeriod getProcessingValidityTime() {
		return processingValidityTime;
	}

	public void setProcessingValidityTime(com.tools20022.repository.entity.DateTimePeriod processingValidityTime) {
		this.processingValidityTime = processingValidityTime;
	}

	public InstructionCode getInstructionForNextAgent() {
		return instructionForNextAgent;
	}

	public void setInstructionForNextAgent(InstructionCode instructionForNextAgent) {
		this.instructionForNextAgent = instructionForNextAgent;
	}

	public CashSettlement getSettlementInstruction() {
		return settlementInstruction;
	}

	public void setSettlementInstruction(com.tools20022.repository.entity.CashSettlement settlementInstruction) {
		this.settlementInstruction = settlementInstruction;
	}

	public CurrencyAndAmount getClearingChargeAmount() {
		return clearingChargeAmount;
	}

	public void setClearingChargeAmount(CurrencyAndAmount clearingChargeAmount) {
		this.clearingChargeAmount = clearingChargeAmount;
	}

	public StandingOrder getStandingOrder() {
		return standingOrder;
	}

	public void setStandingOrder(com.tools20022.repository.entity.StandingOrder standingOrder) {
		this.standingOrder = standingOrder;
	}

	public List<PaymentExecution> getPrevious() {
		return previous;
	}

	public void setPrevious(List<PaymentExecution> previous) {
		this.previous = previous;
	}
}