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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.TradeIdentification;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the different identifications associated with a payment
 * transaction.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PaymentIdentification"
 * src="doc-files/PaymentIdentification.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#ExecutionIdentification
 * PaymentIdentification.ExecutionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#EndToEndIdentification
 * PaymentIdentification.EndToEndIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#InstructionIdentification
 * PaymentIdentification.InstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#TransactionIdentification
 * PaymentIdentification.TransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#ClearingSystemReference
 * PaymentIdentification.ClearingSystemReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#CreditorReference
 * PaymentIdentification.CreditorReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#Payment
 * PaymentIdentification.Payment}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#PaymentRelatedIdentifications
 * Payment.PaymentRelatedIdentifications}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.TradeIdentification
 * TradeIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentIdentification1
 * PaymentIdentification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CreditorReferenceInformation2
 * CreditorReferenceInformation2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentIdentification3
 * PaymentIdentification3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentIdentification4
 * PaymentIdentification4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionReferences4
 * TransactionReferences4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CertificateIdentification1
 * CertificateIdentification1}</li>
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
 * "PaymentIdentification"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the different identifications associated with a payment transaction."
 * </li>
 * </ul>
 */
public class PaymentIdentification extends TradeIdentification {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Unique and unambiguous identifier for a payment execution, as assigned by
	 * the clearing agent or the initiating party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader58#MessageIdentification
	 * GroupHeader58.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader48#MessageIdentification
	 * GroupHeader48.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader55#MessageIdentification
	 * GroupHeader55.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation3#OriginalMessageIdentification
	 * OriginalGroupInformation3.OriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader56#MessageIdentification
	 * GroupHeader56.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader3#OriginalMessageIdentification
	 * OriginalGroupHeader3.OriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader52#MessageIdentification
	 * GroupHeader52.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader50#MessageIdentification
	 * GroupHeader50.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader53#MessageIdentification
	 * GroupHeader53.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader47#MessageIdentification
	 * GroupHeader47.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader2#OriginalMessageIdentification
	 * OriginalGroupHeader2.OriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader46#MessageIdentification
	 * GroupHeader46.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader45#MessageIdentification
	 * GroupHeader45.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader59#MessageIdentification
	 * GroupHeader59.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader5#OriginalGroupCancellationIdentification
	 * OriginalGroupHeader5.OriginalGroupCancellationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader5#OriginalMessageIdentification
	 * OriginalGroupHeader5.OriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader60#MessageIdentification
	 * GroupHeader60.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader63#MessageIdentification
	 * GroupHeader63.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader62#MessageIdentification
	 * GroupHeader62.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader70#MessageIdentification
	 * GroupHeader70.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader72#MessageIdentification
	 * GroupHeader72.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader71#MessageIdentification
	 * GroupHeader71.MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItem5#OriginalItemIdentification
	 * OriginalItem5.OriginalItemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalMessage2#OriginalMessageIdentification
	 * OriginalMessage2.OriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalMessage3#OriginalMessageIdentification
	 * OriginalMessage3.OriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation27#OriginalMessageIdentification
	 * OriginalGroupInformation27.OriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader7#OriginalMessageIdentification
	 * OriginalGroupHeader7.OriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification6#InstructionIdentification
	 * RequestedModification6.InstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation28#OriginalMessageIdentification
	 * OriginalGroupInformation28.OriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction22#OriginalPaymentInformationCancellationIdentification
	 * OriginalPaymentInstruction22.
	 * OriginalPaymentInformationCancellationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction20#PaymentCancellationIdentification
	 * OriginalPaymentInstruction20.PaymentCancellationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction3#OriginalPaymentInformationIdentification
	 * UnderlyingPaymentInstruction3.OriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader6#OriginalMessageIdentification
	 * OriginalGroupHeader6.OriginalMessageIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification
	 * PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExecutionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for a payment execution, as assigned by the clearing agent or the initiating party."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ExecutionIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.GroupHeader58.MessageIdentification, com.tools20022.repository.msg.GroupHeader48.MessageIdentification,
					com.tools20022.repository.msg.GroupHeader55.MessageIdentification, com.tools20022.repository.msg.OriginalGroupInformation3.OriginalMessageIdentification,
					com.tools20022.repository.msg.GroupHeader56.MessageIdentification, com.tools20022.repository.msg.OriginalGroupHeader3.OriginalMessageIdentification, com.tools20022.repository.msg.GroupHeader52.MessageIdentification,
					com.tools20022.repository.msg.GroupHeader50.MessageIdentification, com.tools20022.repository.msg.GroupHeader53.MessageIdentification, com.tools20022.repository.msg.GroupHeader47.MessageIdentification,
					com.tools20022.repository.msg.OriginalGroupHeader2.OriginalMessageIdentification, com.tools20022.repository.msg.GroupHeader46.MessageIdentification, com.tools20022.repository.msg.GroupHeader45.MessageIdentification,
					com.tools20022.repository.msg.GroupHeader59.MessageIdentification, com.tools20022.repository.msg.OriginalGroupHeader5.OriginalGroupCancellationIdentification,
					com.tools20022.repository.msg.OriginalGroupHeader5.OriginalMessageIdentification, com.tools20022.repository.msg.GroupHeader60.MessageIdentification, com.tools20022.repository.msg.GroupHeader63.MessageIdentification,
					com.tools20022.repository.msg.GroupHeader62.MessageIdentification, com.tools20022.repository.msg.GroupHeader70.MessageIdentification, com.tools20022.repository.msg.GroupHeader72.MessageIdentification,
					com.tools20022.repository.msg.GroupHeader71.MessageIdentification, com.tools20022.repository.msg.OriginalItem5.OriginalItemIdentification, com.tools20022.repository.msg.OriginalMessage2.OriginalMessageIdentification,
					com.tools20022.repository.msg.OriginalMessage3.OriginalMessageIdentification, com.tools20022.repository.msg.OriginalGroupInformation27.OriginalMessageIdentification,
					com.tools20022.repository.msg.OriginalGroupHeader7.OriginalMessageIdentification, com.tools20022.repository.msg.RequestedModification6.InstructionIdentification,
					com.tools20022.repository.msg.OriginalGroupInformation28.OriginalMessageIdentification, com.tools20022.repository.msg.OriginalPaymentInstruction22.OriginalPaymentInformationCancellationIdentification,
					com.tools20022.repository.msg.OriginalPaymentInstruction20.PaymentCancellationIdentification, com.tools20022.repository.msg.UnderlyingPaymentInstruction3.OriginalPaymentInformationIdentification,
					com.tools20022.repository.msg.OriginalGroupHeader6.OriginalMessageIdentification);
			elementContext_lazy = () -> PaymentIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExecutionIdentification";
			definition = "Unique and unambiguous identifier for a payment execution, as assigned by the clearing agent or the initiating party.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Unique and unambiguous identifier for a payment as assigned by the
	 * originator. The payment transaction reference is used for reconciliation
	 * or to link tasks relating to the payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentIdentification1#EndToEndIdentification
	 * PaymentIdentification1.EndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences3#EndToEndIdentification
	 * TransactionReferences3.EndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentIdentification3#EndToEndIdentification
	 * PaymentIdentification3.EndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentIdentification4#EndToEndIdentification
	 * PaymentIdentification4.EndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectiveInterbankTransaction1#EndToEndIdentification
	 * CorrectiveInterbankTransaction1.EndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentTransaction2#OriginalEndToEndIdentification
	 * UnderlyingPaymentTransaction2.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences4#EndToEndIdentification
	 * TransactionReferences4.EndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CertificateIdentification1#EndToEndIdentification
	 * CertificateIdentification1.EndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItem5#OriginalEndToEndIdentification
	 * OriginalItem5.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus5#OriginalEndToEndIdentification
	 * OriginalItemAndStatus5.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem6#EndToEndIdentification
	 * NotificationItem6.EndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction73#OriginalEndToEndIdentification
	 * PaymentTransaction73.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction80#OriginalEndToEndIdentification
	 * PaymentTransaction80.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction81#OriginalEndToEndIdentification
	 * PaymentTransaction81.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification6#EndToEndIdentification
	 * RequestedModification6.EndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification6#TransactionIdentification
	 * RequestedModification6.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction76#OriginalEndToEndIdentification
	 * PaymentTransaction76.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction78#OriginalEndToEndIdentification
	 * PaymentTransaction78.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction74#OriginalEndToEndIdentification
	 * PaymentTransaction74.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction83#OriginalEndToEndIdentification
	 * PaymentTransaction83.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction77#OriginalEndToEndIdentification
	 * PaymentTransaction77.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInitiation2#EndToEndIdentification
	 * CorrectivePaymentInitiation2.EndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction3#OriginalEndToEndIdentification
	 * UnderlyingPaymentInstruction3.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction75#OriginalEndToEndIdentification
	 * PaymentTransaction75.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction82#OriginalEndToEndIdentification
	 * PaymentTransaction82.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79#OriginalEndToEndIdentification
	 * PaymentTransaction79.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#EndToEndIdentification
	 * PaymentComplementaryInformation6.EndToEndIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification
	 * PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndToEndIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for a payment as assigned by the originator. The payment transaction reference is used for reconciliation or to link tasks relating to the payment."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute EndToEndIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentIdentification1.EndToEndIdentification, com.tools20022.repository.msg.TransactionReferences3.EndToEndIdentification,
					com.tools20022.repository.msg.PaymentIdentification3.EndToEndIdentification, com.tools20022.repository.msg.PaymentIdentification4.EndToEndIdentification,
					com.tools20022.repository.msg.CorrectiveInterbankTransaction1.EndToEndIdentification, com.tools20022.repository.msg.UnderlyingPaymentTransaction2.OriginalEndToEndIdentification,
					com.tools20022.repository.msg.TransactionReferences4.EndToEndIdentification, com.tools20022.repository.msg.CertificateIdentification1.EndToEndIdentification,
					com.tools20022.repository.msg.OriginalItem5.OriginalEndToEndIdentification, com.tools20022.repository.msg.OriginalItemAndStatus5.OriginalEndToEndIdentification,
					com.tools20022.repository.msg.NotificationItem6.EndToEndIdentification, com.tools20022.repository.msg.PaymentTransaction73.OriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransaction80.OriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentTransaction81.OriginalEndToEndIdentification,
					com.tools20022.repository.msg.RequestedModification6.EndToEndIdentification, com.tools20022.repository.msg.RequestedModification6.TransactionIdentification,
					com.tools20022.repository.msg.PaymentTransaction76.OriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentTransaction78.OriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransaction74.OriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentTransaction83.OriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransaction77.OriginalEndToEndIdentification, com.tools20022.repository.msg.CorrectivePaymentInitiation2.EndToEndIdentification,
					com.tools20022.repository.msg.UnderlyingPaymentInstruction3.OriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentTransaction75.OriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransaction82.OriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentTransaction79.OriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentComplementaryInformation6.EndToEndIdentification);
			elementContext_lazy = () -> PaymentIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EndToEndIdentification";
			definition = "Unique and unambiguous identifier for a payment as assigned by the originator. The payment transaction reference is used for reconciliation or to link tasks relating to the payment.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Unique identification assigned by an instructing party for an instructed
	 * party to unambiguously identify the instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentIdentification1#InstructionIdentification
	 * PaymentIdentification1.InstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences3#InstructionIdentification
	 * TransactionReferences3.InstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentIdentification3#InstructionIdentification
	 * PaymentIdentification3.InstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentIdentification4#InstructionIdentification
	 * PaymentIdentification4.InstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectiveInterbankTransaction1#InstructionIdentification
	 * CorrectiveInterbankTransaction1.InstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentTransaction2#OriginalInstructionIdentification
	 * UnderlyingPaymentTransaction2.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences4#InstructionIdentification
	 * TransactionReferences4.InstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CertificateIdentification1#InstructionIdentification
	 * CertificateIdentification1.InstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction73#OriginalInstructionIdentification
	 * PaymentTransaction73.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction80#OriginalInstructionIdentification
	 * PaymentTransaction80.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction81#OriginalInstructionIdentification
	 * PaymentTransaction81.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction21#ReversalPaymentInformationIdentification
	 * OriginalPaymentInstruction21.ReversalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction76#OriginalInstructionIdentification
	 * PaymentTransaction76.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction78#OriginalInstructionIdentification
	 * PaymentTransaction78.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction74#OriginalInstructionIdentification
	 * PaymentTransaction74.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction83#OriginalInstructionIdentification
	 * PaymentTransaction83.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction77#OriginalInstructionIdentification
	 * PaymentTransaction77.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInitiation2#InstructionIdentification
	 * CorrectivePaymentInitiation2.InstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction3#OriginalInstructionIdentification
	 * UnderlyingPaymentInstruction3.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction75#OriginalInstructionIdentification
	 * PaymentTransaction75.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction82#OriginalInstructionIdentification
	 * PaymentTransaction82.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79#OriginalInstructionIdentification
	 * PaymentTransaction79.OriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#InstructionIdentification
	 * PaymentComplementaryInformation6.InstructionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification
	 * PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification assigned by an instructing party for an instructed party to unambiguously identify the instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute InstructionIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentIdentification1.InstructionIdentification, com.tools20022.repository.msg.TransactionReferences3.InstructionIdentification,
					com.tools20022.repository.msg.PaymentIdentification3.InstructionIdentification, com.tools20022.repository.msg.PaymentIdentification4.InstructionIdentification,
					com.tools20022.repository.msg.CorrectiveInterbankTransaction1.InstructionIdentification, com.tools20022.repository.msg.UnderlyingPaymentTransaction2.OriginalInstructionIdentification,
					com.tools20022.repository.msg.TransactionReferences4.InstructionIdentification, com.tools20022.repository.msg.CertificateIdentification1.InstructionIdentification,
					com.tools20022.repository.msg.PaymentTransaction73.OriginalInstructionIdentification, com.tools20022.repository.msg.PaymentTransaction80.OriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentTransaction81.OriginalInstructionIdentification, com.tools20022.repository.msg.OriginalPaymentInstruction21.ReversalPaymentInformationIdentification,
					com.tools20022.repository.msg.PaymentTransaction76.OriginalInstructionIdentification, com.tools20022.repository.msg.PaymentTransaction78.OriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentTransaction74.OriginalInstructionIdentification, com.tools20022.repository.msg.PaymentTransaction83.OriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentTransaction77.OriginalInstructionIdentification, com.tools20022.repository.msg.CorrectivePaymentInitiation2.InstructionIdentification,
					com.tools20022.repository.msg.UnderlyingPaymentInstruction3.OriginalInstructionIdentification, com.tools20022.repository.msg.PaymentTransaction75.OriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentTransaction82.OriginalInstructionIdentification, com.tools20022.repository.msg.PaymentTransaction79.OriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentComplementaryInformation6.InstructionIdentification);
			elementContext_lazy = () -> PaymentIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InstructionIdentification";
			definition = "Unique identification assigned by an instructing party for an instructed party to unambiguously identify the instruction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Unique identification assigned by the first instructing agent to
	 * unambiguously identify the transaction and passed on, unchanged,
	 * throughout the entire interbank chain.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences3#TransactionIdentification
	 * TransactionReferences3.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentIdentification3#TransactionIdentification
	 * PaymentIdentification3.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentIdentification4#TransactionIdentification
	 * PaymentIdentification4.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectiveInterbankTransaction1#TransactionIdentification
	 * CorrectiveInterbankTransaction1.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentTransaction2#OriginalTransactionIdentification
	 * UnderlyingPaymentTransaction2.OriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences4#TransactionIdentification
	 * TransactionReferences4.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction73#OriginalTransactionIdentification
	 * PaymentTransaction73.OriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction80#OriginalTransactionIdentification
	 * PaymentTransaction80.OriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction81#OriginalTransactionIdentification
	 * PaymentTransaction81.OriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction76#OriginalTransactionIdentification
	 * PaymentTransaction76.OriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction75#OriginalTransactionIdentification
	 * PaymentTransaction75.OriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79#OriginalTransactionIdentification
	 * PaymentTransaction79.OriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#TransactionIdentification
	 * PaymentComplementaryInformation6.TransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification
	 * PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification assigned by the first instructing agent to unambiguously identify the transaction and passed on, unchanged, throughout the entire interbank chain. "
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TransactionIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionReferences3.TransactionIdentification, com.tools20022.repository.msg.PaymentIdentification3.TransactionIdentification,
					com.tools20022.repository.msg.PaymentIdentification4.TransactionIdentification, com.tools20022.repository.msg.CorrectiveInterbankTransaction1.TransactionIdentification,
					com.tools20022.repository.msg.UnderlyingPaymentTransaction2.OriginalTransactionIdentification, com.tools20022.repository.msg.TransactionReferences4.TransactionIdentification,
					com.tools20022.repository.msg.PaymentTransaction73.OriginalTransactionIdentification, com.tools20022.repository.msg.PaymentTransaction80.OriginalTransactionIdentification,
					com.tools20022.repository.msg.PaymentTransaction81.OriginalTransactionIdentification, com.tools20022.repository.msg.PaymentTransaction76.OriginalTransactionIdentification,
					com.tools20022.repository.msg.PaymentTransaction75.OriginalTransactionIdentification, com.tools20022.repository.msg.PaymentTransaction79.OriginalTransactionIdentification,
					com.tools20022.repository.msg.PaymentComplementaryInformation6.TransactionIdentification);
			elementContext_lazy = () -> PaymentIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransactionIdentification";
			definition = "Unique identification assigned by the first instructing agent to unambiguously identify the transaction and passed on, unchanged, throughout the entire interbank chain. ";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Unique and unambiguous identifier for a payment instruction, as assigned
	 * by the clearing system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences3#ClearingSystemReference
	 * TransactionReferences3.ClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentIdentification3#ClearingSystemReference
	 * PaymentIdentification3.ClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentIdentification4#ClearingSystemReference
	 * PaymentIdentification4.ClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction73#ClearingSystemReference
	 * PaymentTransaction73.ClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction80#ClearingSystemReference
	 * PaymentTransaction80.ClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction81#OriginalClearingSystemReference
	 * PaymentTransaction81.OriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction76#OriginalClearingSystemReference
	 * PaymentTransaction76.OriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction83#ClearingSystemReference
	 * PaymentTransaction83.ClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction75#OriginalClearingSystemReference
	 * PaymentTransaction75.OriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction82#ClearingSystemReference
	 * PaymentTransaction82.ClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79#OriginalClearingSystemReference
	 * PaymentTransaction79.OriginalClearingSystemReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification
	 * PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingSystemReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for a payment instruction, as assigned by the clearing system."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ClearingSystemReference = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionReferences3.ClearingSystemReference, com.tools20022.repository.msg.PaymentIdentification3.ClearingSystemReference,
					com.tools20022.repository.msg.PaymentIdentification4.ClearingSystemReference, com.tools20022.repository.msg.PaymentTransaction73.ClearingSystemReference,
					com.tools20022.repository.msg.PaymentTransaction80.ClearingSystemReference, com.tools20022.repository.msg.PaymentTransaction81.OriginalClearingSystemReference,
					com.tools20022.repository.msg.PaymentTransaction76.OriginalClearingSystemReference, com.tools20022.repository.msg.PaymentTransaction83.ClearingSystemReference,
					com.tools20022.repository.msg.PaymentTransaction75.OriginalClearingSystemReference, com.tools20022.repository.msg.PaymentTransaction82.ClearingSystemReference,
					com.tools20022.repository.msg.PaymentTransaction79.OriginalClearingSystemReference);
			elementContext_lazy = () -> PaymentIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClearingSystemReference";
			definition = "Unique and unambiguous identifier for a payment instruction, as assigned by the clearing system.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Unique and unambiguous reference assigned by the creditor to refer to the
	 * payment obligation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditorReferenceInformation2#Reference
	 * CreditorReferenceInformation2.Reference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation13#CreditorReferenceInformation
	 * StructuredRemittanceInformation13.CreditorReferenceInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification
	 * PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous reference assigned by the creditor to refer to the payment obligation."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CreditorReference = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CreditorReferenceInformation2.Reference, com.tools20022.repository.msg.StructuredRemittanceInformation13.CreditorReferenceInformation);
			elementContext_lazy = () -> PaymentIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditorReference";
			definition = "Unique and unambiguous reference assigned by the creditor to refer to the payment obligation.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Payment for which identifications are provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Payment#PaymentRelatedIdentifications
	 * Payment.PaymentRelatedIdentifications}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification
	 * PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Payment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment for which identifications are provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Payment = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Payment";
			definition = "Payment for which identifications are provided.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.PaymentRelatedIdentifications;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PaymentIdentification";
				definition = "Specifies the different identifications associated with a payment transaction.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Payment.PaymentRelatedIdentifications);
				superType_lazy = () -> TradeIdentification.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentIdentification.ExecutionIdentification, com.tools20022.repository.entity.PaymentIdentification.EndToEndIdentification,
						com.tools20022.repository.entity.PaymentIdentification.InstructionIdentification, com.tools20022.repository.entity.PaymentIdentification.TransactionIdentification,
						com.tools20022.repository.entity.PaymentIdentification.ClearingSystemReference, com.tools20022.repository.entity.PaymentIdentification.CreditorReference,
						com.tools20022.repository.entity.PaymentIdentification.Payment);
				derivationComponent_lazy = () -> Arrays.asList(PaymentIdentification1.mmObject(), CreditorReferenceInformation2.mmObject(), PaymentIdentification3.mmObject(), PaymentIdentification4.mmObject(),
						TransactionReferences4.mmObject(), CertificateIdentification1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}