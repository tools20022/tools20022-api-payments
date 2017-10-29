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
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Set of elements used to provide information on the corrective payment
 * initiation transaction, to which the resolution message refers.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInitiation2#GroupHeader
 * CorrectivePaymentInitiation2.GroupHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInitiation2#PaymentInformationIdentification
 * CorrectivePaymentInitiation2.PaymentInformationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInitiation2#InstructionIdentification
 * CorrectivePaymentInitiation2.InstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInitiation2#EndToEndIdentification
 * CorrectivePaymentInitiation2.EndToEndIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInitiation2#InstructedAmount
 * CorrectivePaymentInitiation2.InstructedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInitiation2#RequestedExecutionDate
 * CorrectivePaymentInitiation2.RequestedExecutionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInitiation2#RequestedCollectionDate
 * CorrectivePaymentInitiation2.RequestedCollectionDate}</li>
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
 * "CorrectivePaymentInitiation2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of elements used to provide information on the corrective payment initiation transaction, to which the resolution message refers."
 * </li>
 * </ul>
 */
public class CorrectivePaymentInitiation2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Set of elements used to provide corrective information for the group
	 * header of the message under investigation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CorrectiveGroupInformation1
	 * CorrectiveGroupInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInitiation2
	 * CorrectivePaymentInitiation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrpHdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupHeader"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to provide corrective information for the group header of the message under investigation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd GroupHeader = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorrectivePaymentInitiation2.mmObject();
			isDerived = false;
			xmlTag = "GrpHdr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeader";
			definition = "Set of elements used to provide corrective information for the group header of the message under investigation.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CorrectiveGroupInformation1.mmObject();
			isComposite = true;
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInitiation2
	 * CorrectivePaymentInitiation2}</li>
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
			componentContext_lazy = () -> CorrectivePaymentInitiation2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.TradeIdentification.Identification;
			isDerived = false;
			xmlTag = "PmtInfId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInformationIdentification";
			definition = "Unique identification, as assigned by a sending party, to unambiguously identify the payment information group within the message.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Unique identification, as assigned by an instructing party for an
	 * instructed party, to unambiguously identify the instruction.
	 * 
	 * Usage: The instruction identification is a point to point reference that
	 * can be used between the instructing party and the instructed party to
	 * refer to the individual instruction. It can be included in several
	 * messages related to the instruction.
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
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#InstructionIdentification
	 * PaymentIdentification.InstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInitiation2
	 * CorrectivePaymentInitiation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification, as assigned by an instructing party for an instructed party, to unambiguously identify the instruction.\n\nUsage: The instruction identification is a point to point reference that can be used between the instructing party and the instructed party to refer to the individual instruction. It can be included in several messages related to the instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute InstructionIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorrectivePaymentInitiation2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentIdentification.InstructionIdentification;
			isDerived = false;
			xmlTag = "InstrId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionIdentification";
			definition = "Unique identification, as assigned by an instructing party for an instructed party, to unambiguously identify the instruction.\n\nUsage: The instruction identification is a point to point reference that can be used between the instructing party and the instructed party to refer to the individual instruction. It can be included in several messages related to the instruction.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Unique identification, as assigned by the initiating party, to
	 * unambiguously identify the transaction. This identification is passed on,
	 * unchanged, throughout the entire end-to-end chain.
	 * 
	 * Usage: The end-to-end identification can be used for reconciliation or to
	 * link tasks relating to the transaction. It can be included in several
	 * messages related to the transaction.
	 * 
	 * Usage: In case there are technical limitations to pass on multiple
	 * references, the end-to-end identification must be passed on throughout
	 * the entire end-to-end chain.
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
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#EndToEndIdentification
	 * PaymentIdentification.EndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInitiation2
	 * CorrectivePaymentInitiation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EndToEndId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndToEndIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification, as assigned by the initiating party, to unambiguously identify the transaction. This identification is passed on, unchanged, throughout the entire end-to-end chain.\n\nUsage: The end-to-end identification can be used for reconciliation or to link tasks relating to the transaction. It can be included in several messages related to the transaction.\n\nUsage: In case there are technical limitations to pass on multiple references, the end-to-end identification must be passed on throughout the entire end-to-end chain."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute EndToEndIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorrectivePaymentInitiation2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentIdentification.EndToEndIdentification;
			isDerived = false;
			xmlTag = "EndToEndId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndToEndIdentification";
			definition = "Unique identification, as assigned by the initiating party, to unambiguously identify the transaction. This identification is passed on, unchanged, throughout the entire end-to-end chain.\n\nUsage: The end-to-end identification can be used for reconciliation or to link tasks relating to the transaction. It can be included in several messages related to the transaction.\n\nUsage: In case there are technical limitations to pass on multiple references, the end-to-end identification must be passed on throughout the entire end-to-end chain.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Amount of money to be moved between the debtor and creditor, before
	 * deduction of charges, expressed in the currency as ordered by the
	 * initiating party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#InstructedAmount
	 * Payment.InstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInitiation2
	 * CorrectivePaymentInitiation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstdAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money to be moved between the debtor and creditor, before deduction of charges, expressed in the currency as ordered by the initiating party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute InstructedAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorrectivePaymentInitiation2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Payment.InstructedAmount;
			isDerived = false;
			xmlTag = "InstdAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedAmount";
			definition = "Amount of money to be moved between the debtor and creditor, before deduction of charges, expressed in the currency as ordered by the initiating party.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Date or date time at which the initiating party requests the clearing
	 * agent to process the payment. <br>
	 * Usage: This is the date or date time on which the debtor's account is to
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
	 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInitiation2
	 * CorrectivePaymentInitiation2}</li>
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
	 * "Date or date time at which the initiating party requests the clearing agent to process the payment. \r\nUsage: This is the date or date time on which the debtor's account is to be debited. If payment by cheque, the date when the cheque must be generated by the bank."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute RequestedExecutionDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorrectivePaymentInitiation2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentExecution.RequestedExecutionDate;
			isDerived = false;
			xmlTag = "ReqdExctnDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedExecutionDate";
			definition = "Date or date time at which the initiating party requests the clearing agent to process the payment. \r\nUsage: This is the date or date time on which the debtor's account is to be debited. If payment by cheque, the date when the cheque must be generated by the bank.";
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	/**
	 * Date at which the creditor requests the amount of money to be collected
	 * from the debtor.
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
	 * {@linkplain com.tools20022.repository.entity.Obligation#RequestedSettlementDate
	 * Obligation.RequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInitiation2
	 * CorrectivePaymentInitiation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdColltnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedCollectionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date at which the creditor requests the amount of money to be collected from the debtor."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute RequestedCollectionDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorrectivePaymentInitiation2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Obligation.RequestedSettlementDate;
			isDerived = false;
			xmlTag = "ReqdColltnDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedCollectionDate";
			definition = "Date at which the creditor requests the amount of money to be collected from the debtor.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorrectivePaymentInitiation2.GroupHeader, com.tools20022.repository.msg.CorrectivePaymentInitiation2.PaymentInformationIdentification,
						com.tools20022.repository.msg.CorrectivePaymentInitiation2.InstructionIdentification, com.tools20022.repository.msg.CorrectivePaymentInitiation2.EndToEndIdentification,
						com.tools20022.repository.msg.CorrectivePaymentInitiation2.InstructedAmount, com.tools20022.repository.msg.CorrectivePaymentInitiation2.RequestedExecutionDate,
						com.tools20022.repository.msg.CorrectivePaymentInitiation2.RequestedCollectionDate);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorrectivePaymentInitiation2";
				definition = "Set of elements used to provide information on the corrective payment initiation transaction, to which the resolution message refers.";
			}
		});
		return mmObject_lazy.get();
	}
}