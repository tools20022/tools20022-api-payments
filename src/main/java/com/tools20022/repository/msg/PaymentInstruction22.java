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
import com.tools20022.repository.choice.DateAndDateTimeChoice;
import com.tools20022.repository.codeset.ChargeBearerType1Code;
import com.tools20022.repository.codeset.PaymentMethod3Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.CreditTransfer;
import com.tools20022.repository.entity.PaymentInstruction;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Characteristics that apply to the debit side of the payment transactions
 * included in the credit transfer initiation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22#PaymentInformationIdentification
 * PaymentInstruction22.PaymentInformationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22#PaymentMethod
 * PaymentInstruction22.PaymentMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22#BatchBooking
 * PaymentInstruction22.BatchBooking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22#NumberOfTransactions
 * PaymentInstruction22.NumberOfTransactions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22#ControlSum
 * PaymentInstruction22.ControlSum}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22#PaymentTypeInformation
 * PaymentInstruction22.PaymentTypeInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22#RequestedExecutionDate
 * PaymentInstruction22.RequestedExecutionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22#PoolingAdjustmentDate
 * PaymentInstruction22.PoolingAdjustmentDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentInstruction22#Debtor
 * PaymentInstruction22.Debtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22#DebtorAccount
 * PaymentInstruction22.DebtorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22#DebtorAgent
 * PaymentInstruction22.DebtorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22#DebtorAgentAccount
 * PaymentInstruction22.DebtorAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22#InstructionForDebtorAgent
 * PaymentInstruction22.InstructionForDebtorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22#UltimateDebtor
 * PaymentInstruction22.UltimateDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22#ChargeBearer
 * PaymentInstruction22.ChargeBearer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22#ChargesAccount
 * PaymentInstruction22.ChargesAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22#ChargesAccountAgent
 * PaymentInstruction22.ChargesAccountAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22#CreditTransferTransactionInformation
 * PaymentInstruction22.CreditTransferTransactionInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PaymentInstruction
 * PaymentInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerCreditTransferInitiationV08#PaymentInformation
 * CustomerCreditTransferInitiationV08.PaymentInformation}</li>
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
 * "PaymentInstruction22"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Characteristics that apply to the debit side of the payment transactions included in the credit transfer initiation."
 * </li>
 * </ul>
 */
public class PaymentInstruction22 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Unique identification, as assigned by a sending party, to unambiguously
	 * identify the payment information group within the message.
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
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#Identification
	 * TradeIdentification.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22
	 * PaymentInstruction22}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtInfId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentInformationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification, as assigned by a sending party, to unambiguously identify the payment information group within the message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute PaymentInformationIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentInstruction22.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.TradeIdentification.Identification;
			isDerived = false;
			xmlTag = "PmtInfId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInformationIdentification";
			definition = "Unique identification, as assigned by a sending party, to unambiguously identify the payment information group within the message.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Specifies the means of payment that will be used to move the amount of
	 * money.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentMethod3Code
	 * PaymentMethod3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CreditInstrument#Method
	 * CreditInstrument.Method}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22
	 * PaymentInstruction22}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtMtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the means of payment that will be used to move the amount of money."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute PaymentMethod = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentInstruction22.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CreditInstrument.Method;
			isDerived = false;
			xmlTag = "PmtMtd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentMethod";
			definition = "Specifies the means of payment that will be used to move the amount of money.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PaymentMethod3Code.mmObject();
		}
	};
	/**
	 * Identifies whether a single entry per individual transaction or a batch
	 * entry for the sum of the amounts of all transactions within the group of
	 * a message is requested. Usage: Batch booking is used to request and not
	 * order a possible batch booking.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.BatchBookingIndicator
	 * BatchBookingIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22
	 * PaymentInstruction22}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BtchBookg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BatchBooking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies whether a single entry per individual transaction or a batch entry for the sum of the amounts of all transactions within the group of a message is requested.\nUsage: Batch booking is used to request and not order a possible batch booking."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute BatchBooking = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentInstruction22.mmObject();
			isDerived = false;
			xmlTag = "BtchBookg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BatchBooking";
			definition = "Identifies whether a single entry per individual transaction or a batch entry for the sum of the amounts of all transactions within the group of a message is requested.\nUsage: Batch booking is used to request and not order a possible batch booking.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> BatchBookingIndicator.mmObject();
		}
	};
	/**
	 * Number of individual transactions contained in the payment information
	 * group.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max15NumericText
	 * Max15NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22
	 * PaymentInstruction22}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NbOfTxs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfTransactions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of individual transactions contained in the payment information group."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute NumberOfTransactions = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentInstruction22.mmObject();
			isDerived = false;
			xmlTag = "NbOfTxs";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfTransactions";
			definition = "Number of individual transactions contained in the payment information group.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}
	};
	/**
	 * Total of all individual amounts included in the group, irrespective of
	 * currencies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22
	 * PaymentInstruction22}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrlSum"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ControlSum"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total of all individual amounts included in the group, irrespective of currencies."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute ControlSum = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentInstruction22.mmObject();
			isDerived = false;
			xmlTag = "CtrlSum";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ControlSum";
			definition = "Total of all individual amounts included in the group, irrespective of currencies.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	/**
	 * Set of elements used to further specify the type of transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation19
	 * PaymentTypeInformation19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution#ProcessingInstructions
	 * PaymentExecution.ProcessingInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22
	 * PaymentInstruction22}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtTpInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentTypeInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to further specify the type of transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd PaymentTypeInformation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PaymentInstruction22.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentExecution.ProcessingInstructions;
			isDerived = false;
			xmlTag = "PmtTpInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentTypeInformation";
			definition = "Set of elements used to further specify the type of transaction.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> PaymentTypeInformation19.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Date at which the initiating party requests the clearing agent to process
	 * the payment. Usage: This is the date on which the debtor's account is to
	 * be debited. If payment by cheque, the date when the cheque must be
	 * generated by the bank.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution#RequestedExecutionDate
	 * PaymentExecution.RequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22
	 * PaymentInstruction22}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdExctnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedExecutionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date at which the initiating party requests the clearing agent to process the payment. \nUsage: This is the date on which the debtor's account is to be debited. If payment by cheque, the date when the cheque must be generated by the bank."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute RequestedExecutionDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentInstruction22.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentExecution.RequestedExecutionDate;
			isDerived = false;
			xmlTag = "ReqdExctnDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedExecutionDate";
			definition = "Date at which the initiating party requests the clearing agent to process the payment. \nUsage: This is the date on which the debtor's account is to be debited. If payment by cheque, the date when the cheque must be generated by the bank.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	/**
	 * Date used for the correction of the value date of a cash pool movement
	 * that has been posted with a different value date.
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
	 * {@linkplain com.tools20022.repository.entity.Payment#PoolingAdjustmentDate
	 * Payment.PoolingAdjustmentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22
	 * PaymentInstruction22}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PoolgAdjstmntDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PoolingAdjustmentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date used for the correction of the value date of a cash pool movement that has been posted with a different value date."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute PoolingAdjustmentDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentInstruction22.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Payment.PoolingAdjustmentDate;
			isDerived = false;
			xmlTag = "PoolgAdjstmntDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoolingAdjustmentDate";
			definition = "Date used for the correction of the value date of a cash pool movement that has been posted with a different value date.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Party that owes an amount of money to the (ultimate) creditor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification43
	 * PartyIdentification43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#Identification
	 * Party.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22
	 * PaymentInstruction22}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dbtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Debtor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that owes an amount of money to the (ultimate) creditor."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Debtor = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PaymentInstruction22.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.Identification;
			isDerived = false;
			xmlTag = "Dbtr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Debtor";
			definition = "Party that owes an amount of money to the (ultimate) creditor.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> PartyIdentification43.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Unambiguous identification of the account of the debtor to which a debit
	 * entry will be made as a result of the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount24
	 * CashAccount24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#CashAccount
	 * PaymentPartyRole.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22
	 * PaymentInstruction22}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DbtrAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtorAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the account of the debtor to which a debit entry will be made as a result of the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd DebtorAccount = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PaymentInstruction22.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentPartyRole.CashAccount;
			isDerived = false;
			xmlTag = "DbtrAcct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAccount";
			definition = "Unambiguous identification of the account of the debtor to which a debit entry will be made as a result of the transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CashAccount24.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Financial institution servicing an account for the debtor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5
	 * BranchAndFinancialInstitutionIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#OrganisationIdentification
	 * Organisation.OrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22
	 * PaymentInstruction22}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DbtrAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtorAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial institution servicing an account for the debtor."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd DebtorAgent = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PaymentInstruction22.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Organisation.OrganisationIdentification;
			isDerived = false;
			xmlTag = "DbtrAgt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAgent";
			definition = "Financial institution servicing an account for the debtor.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification5.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Unambiguous identification of the account of the debtor agent at its
	 * servicing agent in the payment chain.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount24
	 * CashAccount24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#CashAccount
	 * PaymentPartyRole.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22
	 * PaymentInstruction22}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DbtrAgtAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtorAgentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the account of the debtor agent at its servicing agent in the payment chain."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd DebtorAgentAccount = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PaymentInstruction22.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentPartyRole.CashAccount;
			isDerived = false;
			xmlTag = "DbtrAgtAcct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAgentAccount";
			definition = "Unambiguous identification of the account of the debtor agent at its servicing agent in the payment chain.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CashAccount24.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Further information related to the processing of the payment instruction,
	 * that may need to be acted upon by the debtor agent, depending on
	 * agreement between debtor and the debtor agent.<br>
	 * <br>
	 * Usage: when present, then the instructions for the debtor agent apply for
	 * all credit transfer transaction information occurrences, present in the
	 * payment information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#InstructionForDebtorAgent
	 * Payment.InstructionForDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22
	 * PaymentInstruction22}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrForDbtrAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionForDebtorAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Further information related to the processing of the payment instruction, that may need to be acted upon by the debtor agent, depending on agreement between debtor and the debtor agent.\r\n\r\nUsage: when present, then the instructions for the debtor agent apply for all credit transfer transaction information occurrences, present in the payment information."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute InstructionForDebtorAgent = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentInstruction22.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Payment.InstructionForDebtorAgent;
			isDerived = false;
			xmlTag = "InstrForDbtrAgt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionForDebtorAgent";
			definition = "Further information related to the processing of the payment instruction, that may need to be acted upon by the debtor agent, depending on agreement between debtor and the debtor agent.\r\n\r\nUsage: when present, then the instructions for the debtor agent apply for all credit transfer transaction information occurrences, present in the payment information.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	/**
	 * Ultimate party that owes an amount of money to the (ultimate) creditor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification43
	 * PartyIdentification43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#Identification
	 * Party.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22
	 * PaymentInstruction22}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UltmtDbtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateDebtor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Ultimate party that owes an amount of money to the (ultimate) creditor."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd UltimateDebtor = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PaymentInstruction22.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.Identification;
			isDerived = false;
			xmlTag = "UltmtDbtr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtor";
			definition = "Ultimate party that owes an amount of money to the (ultimate) creditor.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> PartyIdentification43.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Specifies which party/parties will bear the charges associated with the
	 * processing of the payment transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeBearerType1Code
	 * ChargeBearerType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Charges#BearerType
	 * Charges.BearerType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22
	 * PaymentInstruction22}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChrgBr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeBearer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies which party/parties will bear the charges associated with the processing of the payment transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute ChargeBearer = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentInstruction22.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Charges.BearerType;
			isDerived = false;
			xmlTag = "ChrgBr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeBearer";
			definition = "Specifies which party/parties will bear the charges associated with the processing of the payment transaction.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ChargeBearerType1Code.mmObject();
		}
	};
	/**
	 * Account used to process charges associated with a transaction.
	 * 
	 * Usage: Charges account should be used when charges have to be booked to
	 * an account different from the account identified in debtor's account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount24
	 * CashAccount24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Charges#ChargesDebitAccount
	 * Charges.ChargesDebitAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22
	 * PaymentInstruction22}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChrgsAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargesAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account used to process charges associated with a transaction.\n\nUsage: Charges account should be used when charges have to be booked to an account different from the account identified in debtor's account."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd ChargesAccount = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PaymentInstruction22.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Charges.ChargesDebitAccount;
			isDerived = false;
			xmlTag = "ChrgsAcct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargesAccount";
			definition = "Account used to process charges associated with a transaction.\n\nUsage: Charges account should be used when charges have to be booked to an account different from the account identified in debtor's account.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CashAccount24.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Agent that services a charges account.
	 * 
	 * Usage: Charges account agent should only be used when the charges account
	 * agent is different from the debtor agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5
	 * BranchAndFinancialInstitutionIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#OrganisationIdentification
	 * Organisation.OrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22
	 * PaymentInstruction22}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChrgsAcctAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargesAccountAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agent that services a charges account.\n\nUsage: Charges account agent should only be used when the charges account agent is different from the debtor agent."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd ChargesAccountAgent = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PaymentInstruction22.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Organisation.OrganisationIdentification;
			isDerived = false;
			xmlTag = "ChrgsAcctAgt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargesAccountAgent";
			definition = "Agent that services a charges account.\n\nUsage: Charges account agent should only be used when the charges account agent is different from the debtor agent.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification5.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Provides information on the individual transaction(s) included in the
	 * message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26
	 * CreditTransferTransaction26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CreditTransfer
	 * CreditTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22
	 * PaymentInstruction22}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtTrfTxInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditTransferTransactionInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information on the individual transaction(s) included in the message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd CreditTransferTransactionInformation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PaymentInstruction22.mmObject();
			businessComponentTrace_lazy = () -> CreditTransfer.mmObject();
			isDerived = false;
			xmlTag = "CdtTrfTxInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditTransferTransactionInformation";
			definition = "Provides information on the individual transaction(s) included in the message.";
			minOccurs = 1;
			type_lazy = () -> CreditTransferTransaction26.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentInstruction22.PaymentInformationIdentification, com.tools20022.repository.msg.PaymentInstruction22.PaymentMethod,
						com.tools20022.repository.msg.PaymentInstruction22.BatchBooking, com.tools20022.repository.msg.PaymentInstruction22.NumberOfTransactions, com.tools20022.repository.msg.PaymentInstruction22.ControlSum,
						com.tools20022.repository.msg.PaymentInstruction22.PaymentTypeInformation, com.tools20022.repository.msg.PaymentInstruction22.RequestedExecutionDate,
						com.tools20022.repository.msg.PaymentInstruction22.PoolingAdjustmentDate, com.tools20022.repository.msg.PaymentInstruction22.Debtor, com.tools20022.repository.msg.PaymentInstruction22.DebtorAccount,
						com.tools20022.repository.msg.PaymentInstruction22.DebtorAgent, com.tools20022.repository.msg.PaymentInstruction22.DebtorAgentAccount, com.tools20022.repository.msg.PaymentInstruction22.InstructionForDebtorAgent,
						com.tools20022.repository.msg.PaymentInstruction22.UltimateDebtor, com.tools20022.repository.msg.PaymentInstruction22.ChargeBearer, com.tools20022.repository.msg.PaymentInstruction22.ChargesAccount,
						com.tools20022.repository.msg.PaymentInstruction22.ChargesAccountAgent, com.tools20022.repository.msg.PaymentInstruction22.CreditTransferTransactionInformation);
				trace_lazy = () -> PaymentInstruction.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.pain.CustomerCreditTransferInitiationV08.PaymentInformation);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PaymentInstruction22";
				definition = "Characteristics that apply to the debit side of the payment transactions included in the credit transfer initiation.";
			}
		});
		return mmObject_lazy.get();
	}
}