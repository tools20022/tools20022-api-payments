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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.TradeIdentification;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;

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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.TradeIdentification
 * TradeIdentification}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmExecutionIdentification
 * PaymentIdentification.mmExecutionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmEndToEndIdentification
 * PaymentIdentification.mmEndToEndIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmInstructionIdentification
 * PaymentIdentification.mmInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmTransactionIdentification
 * PaymentIdentification.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmClearingSystemReference
 * PaymentIdentification.mmClearingSystemReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmCreditorReference
 * PaymentIdentification.mmCreditorReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmPayment
 * PaymentIdentification.mmPayment}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#mmPaymentRelatedIdentifications
 * Payment.mmPaymentRelatedIdentifications}</li>
 * </ul>
 * </li>
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
	protected Max35Text executionIdentification;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.GroupHeader58#mmMessageIdentification
	 * GroupHeader58.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader48#mmMessageIdentification
	 * GroupHeader48.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader55#mmMessageIdentification
	 * GroupHeader55.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation3#mmOriginalMessageIdentification
	 * OriginalGroupInformation3.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader56#mmMessageIdentification
	 * GroupHeader56.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader3#mmOriginalMessageIdentification
	 * OriginalGroupHeader3.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader52#mmMessageIdentification
	 * GroupHeader52.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader50#mmMessageIdentification
	 * GroupHeader50.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader53#mmMessageIdentification
	 * GroupHeader53.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader47#mmMessageIdentification
	 * GroupHeader47.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader2#mmOriginalMessageIdentification
	 * OriginalGroupHeader2.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader46#mmMessageIdentification
	 * GroupHeader46.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader45#mmMessageIdentification
	 * GroupHeader45.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader59#mmMessageIdentification
	 * GroupHeader59.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader5#mmOriginalGroupCancellationIdentification
	 * OriginalGroupHeader5.mmOriginalGroupCancellationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader5#mmOriginalMessageIdentification
	 * OriginalGroupHeader5.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader60#mmMessageIdentification
	 * GroupHeader60.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader63#mmMessageIdentification
	 * GroupHeader63.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader62#mmMessageIdentification
	 * GroupHeader62.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader70#mmMessageIdentification
	 * GroupHeader70.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader72#mmMessageIdentification
	 * GroupHeader72.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader71#mmMessageIdentification
	 * GroupHeader71.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItem5#mmOriginalItemIdentification
	 * OriginalItem5.mmOriginalItemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalMessage2#mmOriginalMessageIdentification
	 * OriginalMessage2.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalMessage3#mmOriginalMessageIdentification
	 * OriginalMessage3.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation27#mmOriginalMessageIdentification
	 * OriginalGroupInformation27.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader7#mmOriginalMessageIdentification
	 * OriginalGroupHeader7.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification6#mmInstructionIdentification
	 * RequestedModification6.mmInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation28#mmOriginalMessageIdentification
	 * OriginalGroupInformation28.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction22#mmOriginalPaymentInformationCancellationIdentification
	 * OriginalPaymentInstruction22.
	 * mmOriginalPaymentInformationCancellationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction20#mmPaymentCancellationIdentification
	 * OriginalPaymentInstruction20.mmPaymentCancellationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction3#mmOriginalPaymentInformationIdentification
	 * UnderlyingPaymentInstruction3.mmOriginalPaymentInformationIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader6#mmOriginalMessageIdentification
	 * OriginalGroupHeader6.mmOriginalMessageIdentification}</li>
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
	public static final MMBusinessAttribute mmExecutionIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(GroupHeader58.mmMessageIdentification, GroupHeader48.mmMessageIdentification, GroupHeader55.mmMessageIdentification, OriginalGroupInformation3.mmOriginalMessageIdentification,
					GroupHeader56.mmMessageIdentification, OriginalGroupHeader3.mmOriginalMessageIdentification, GroupHeader52.mmMessageIdentification, GroupHeader50.mmMessageIdentification, GroupHeader53.mmMessageIdentification,
					GroupHeader47.mmMessageIdentification, OriginalGroupHeader2.mmOriginalMessageIdentification, GroupHeader46.mmMessageIdentification, GroupHeader45.mmMessageIdentification, GroupHeader59.mmMessageIdentification,
					OriginalGroupHeader5.mmOriginalGroupCancellationIdentification, OriginalGroupHeader5.mmOriginalMessageIdentification, GroupHeader60.mmMessageIdentification, GroupHeader63.mmMessageIdentification,
					GroupHeader62.mmMessageIdentification, GroupHeader70.mmMessageIdentification, GroupHeader72.mmMessageIdentification, GroupHeader71.mmMessageIdentification, OriginalItem5.mmOriginalItemIdentification,
					OriginalMessage2.mmOriginalMessageIdentification, OriginalMessage3.mmOriginalMessageIdentification, OriginalGroupInformation27.mmOriginalMessageIdentification, OriginalGroupHeader7.mmOriginalMessageIdentification,
					RequestedModification6.mmInstructionIdentification, OriginalGroupInformation28.mmOriginalMessageIdentification, OriginalPaymentInstruction22.mmOriginalPaymentInformationCancellationIdentification,
					OriginalPaymentInstruction20.mmPaymentCancellationIdentification, UnderlyingPaymentInstruction3.mmOriginalPaymentInformationIdentification, OriginalGroupHeader6.mmOriginalMessageIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExecutionIdentification";
			definition = "Unique and unambiguous identifier for a payment execution, as assigned by the clearing agent or the initiating party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentIdentification.class.getMethod("getExecutionIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text endToEndIdentification;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.PaymentIdentification1#mmEndToEndIdentification
	 * PaymentIdentification1.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences3#mmEndToEndIdentification
	 * TransactionReferences3.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentIdentification3#mmEndToEndIdentification
	 * PaymentIdentification3.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentIdentification4#mmEndToEndIdentification
	 * PaymentIdentification4.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectiveInterbankTransaction1#mmEndToEndIdentification
	 * CorrectiveInterbankTransaction1.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentTransaction2#mmOriginalEndToEndIdentification
	 * UnderlyingPaymentTransaction2.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences4#mmEndToEndIdentification
	 * TransactionReferences4.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CertificateIdentification1#mmEndToEndIdentification
	 * CertificateIdentification1.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItem5#mmOriginalEndToEndIdentification
	 * OriginalItem5.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus5#mmOriginalEndToEndIdentification
	 * OriginalItemAndStatus5.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem6#mmEndToEndIdentification
	 * NotificationItem6.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction73#mmOriginalEndToEndIdentification
	 * PaymentTransaction73.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction80#mmOriginalEndToEndIdentification
	 * PaymentTransaction80.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction81#mmOriginalEndToEndIdentification
	 * PaymentTransaction81.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification6#mmEndToEndIdentification
	 * RequestedModification6.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification6#mmTransactionIdentification
	 * RequestedModification6.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction76#mmOriginalEndToEndIdentification
	 * PaymentTransaction76.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction78#mmOriginalEndToEndIdentification
	 * PaymentTransaction78.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction74#mmOriginalEndToEndIdentification
	 * PaymentTransaction74.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction83#mmOriginalEndToEndIdentification
	 * PaymentTransaction83.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction77#mmOriginalEndToEndIdentification
	 * PaymentTransaction77.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInitiation2#mmEndToEndIdentification
	 * CorrectivePaymentInitiation2.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction3#mmOriginalEndToEndIdentification
	 * UnderlyingPaymentInstruction3.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction75#mmOriginalEndToEndIdentification
	 * PaymentTransaction75.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction82#mmOriginalEndToEndIdentification
	 * PaymentTransaction82.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79#mmOriginalEndToEndIdentification
	 * PaymentTransaction79.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#mmEndToEndIdentification
	 * PaymentComplementaryInformation6.mmEndToEndIdentification}</li>
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
	public static final MMBusinessAttribute mmEndToEndIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentIdentification1.mmEndToEndIdentification, TransactionReferences3.mmEndToEndIdentification, PaymentIdentification3.mmEndToEndIdentification,
					PaymentIdentification4.mmEndToEndIdentification, CorrectiveInterbankTransaction1.mmEndToEndIdentification, UnderlyingPaymentTransaction2.mmOriginalEndToEndIdentification, TransactionReferences4.mmEndToEndIdentification,
					CertificateIdentification1.mmEndToEndIdentification, OriginalItem5.mmOriginalEndToEndIdentification, OriginalItemAndStatus5.mmOriginalEndToEndIdentification, NotificationItem6.mmEndToEndIdentification,
					PaymentTransaction73.mmOriginalEndToEndIdentification, PaymentTransaction80.mmOriginalEndToEndIdentification, PaymentTransaction81.mmOriginalEndToEndIdentification, RequestedModification6.mmEndToEndIdentification,
					RequestedModification6.mmTransactionIdentification, PaymentTransaction76.mmOriginalEndToEndIdentification, PaymentTransaction78.mmOriginalEndToEndIdentification, PaymentTransaction74.mmOriginalEndToEndIdentification,
					PaymentTransaction83.mmOriginalEndToEndIdentification, PaymentTransaction77.mmOriginalEndToEndIdentification, CorrectivePaymentInitiation2.mmEndToEndIdentification,
					UnderlyingPaymentInstruction3.mmOriginalEndToEndIdentification, PaymentTransaction75.mmOriginalEndToEndIdentification, PaymentTransaction82.mmOriginalEndToEndIdentification,
					PaymentTransaction79.mmOriginalEndToEndIdentification, PaymentComplementaryInformation6.mmEndToEndIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EndToEndIdentification";
			definition = "Unique and unambiguous identifier for a payment as assigned by the originator. The payment transaction reference is used for reconciliation or to link tasks relating to the payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentIdentification.class.getMethod("getEndToEndIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text instructionIdentification;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.PaymentIdentification1#mmInstructionIdentification
	 * PaymentIdentification1.mmInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences3#mmInstructionIdentification
	 * TransactionReferences3.mmInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentIdentification3#mmInstructionIdentification
	 * PaymentIdentification3.mmInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentIdentification4#mmInstructionIdentification
	 * PaymentIdentification4.mmInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectiveInterbankTransaction1#mmInstructionIdentification
	 * CorrectiveInterbankTransaction1.mmInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentTransaction2#mmOriginalInstructionIdentification
	 * UnderlyingPaymentTransaction2.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences4#mmInstructionIdentification
	 * TransactionReferences4.mmInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CertificateIdentification1#mmInstructionIdentification
	 * CertificateIdentification1.mmInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction73#mmOriginalInstructionIdentification
	 * PaymentTransaction73.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction80#mmOriginalInstructionIdentification
	 * PaymentTransaction80.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction81#mmOriginalInstructionIdentification
	 * PaymentTransaction81.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction21#mmReversalPaymentInformationIdentification
	 * OriginalPaymentInstruction21.mmReversalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction76#mmOriginalInstructionIdentification
	 * PaymentTransaction76.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction78#mmOriginalInstructionIdentification
	 * PaymentTransaction78.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction74#mmOriginalInstructionIdentification
	 * PaymentTransaction74.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction83#mmOriginalInstructionIdentification
	 * PaymentTransaction83.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction77#mmOriginalInstructionIdentification
	 * PaymentTransaction77.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInitiation2#mmInstructionIdentification
	 * CorrectivePaymentInitiation2.mmInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction3#mmOriginalInstructionIdentification
	 * UnderlyingPaymentInstruction3.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction75#mmOriginalInstructionIdentification
	 * PaymentTransaction75.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction82#mmOriginalInstructionIdentification
	 * PaymentTransaction82.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79#mmOriginalInstructionIdentification
	 * PaymentTransaction79.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#mmInstructionIdentification
	 * PaymentComplementaryInformation6.mmInstructionIdentification}</li>
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
	public static final MMBusinessAttribute mmInstructionIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentIdentification1.mmInstructionIdentification, TransactionReferences3.mmInstructionIdentification, PaymentIdentification3.mmInstructionIdentification,
					PaymentIdentification4.mmInstructionIdentification, CorrectiveInterbankTransaction1.mmInstructionIdentification, UnderlyingPaymentTransaction2.mmOriginalInstructionIdentification,
					TransactionReferences4.mmInstructionIdentification, CertificateIdentification1.mmInstructionIdentification, PaymentTransaction73.mmOriginalInstructionIdentification,
					PaymentTransaction80.mmOriginalInstructionIdentification, PaymentTransaction81.mmOriginalInstructionIdentification, OriginalPaymentInstruction21.mmReversalPaymentInformationIdentification,
					PaymentTransaction76.mmOriginalInstructionIdentification, PaymentTransaction78.mmOriginalInstructionIdentification, PaymentTransaction74.mmOriginalInstructionIdentification,
					PaymentTransaction83.mmOriginalInstructionIdentification, PaymentTransaction77.mmOriginalInstructionIdentification, CorrectivePaymentInitiation2.mmInstructionIdentification,
					UnderlyingPaymentInstruction3.mmOriginalInstructionIdentification, PaymentTransaction75.mmOriginalInstructionIdentification, PaymentTransaction82.mmOriginalInstructionIdentification,
					PaymentTransaction79.mmOriginalInstructionIdentification, PaymentComplementaryInformation6.mmInstructionIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InstructionIdentification";
			definition = "Unique identification assigned by an instructing party for an instructed party to unambiguously identify the instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentIdentification.class.getMethod("getInstructionIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text transactionIdentification;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences3#mmTransactionIdentification
	 * TransactionReferences3.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentIdentification3#mmTransactionIdentification
	 * PaymentIdentification3.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentIdentification4#mmTransactionIdentification
	 * PaymentIdentification4.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectiveInterbankTransaction1#mmTransactionIdentification
	 * CorrectiveInterbankTransaction1.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentTransaction2#mmOriginalTransactionIdentification
	 * UnderlyingPaymentTransaction2.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences4#mmTransactionIdentification
	 * TransactionReferences4.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction73#mmOriginalTransactionIdentification
	 * PaymentTransaction73.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction80#mmOriginalTransactionIdentification
	 * PaymentTransaction80.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction81#mmOriginalTransactionIdentification
	 * PaymentTransaction81.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction76#mmOriginalTransactionIdentification
	 * PaymentTransaction76.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction75#mmOriginalTransactionIdentification
	 * PaymentTransaction75.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79#mmOriginalTransactionIdentification
	 * PaymentTransaction79.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#mmTransactionIdentification
	 * PaymentComplementaryInformation6.mmTransactionIdentification}</li>
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
	public static final MMBusinessAttribute mmTransactionIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TransactionReferences3.mmTransactionIdentification, PaymentIdentification3.mmTransactionIdentification, PaymentIdentification4.mmTransactionIdentification,
					CorrectiveInterbankTransaction1.mmTransactionIdentification, UnderlyingPaymentTransaction2.mmOriginalTransactionIdentification, TransactionReferences4.mmTransactionIdentification,
					PaymentTransaction73.mmOriginalTransactionIdentification, PaymentTransaction80.mmOriginalTransactionIdentification, PaymentTransaction81.mmOriginalTransactionIdentification,
					PaymentTransaction76.mmOriginalTransactionIdentification, PaymentTransaction75.mmOriginalTransactionIdentification, PaymentTransaction79.mmOriginalTransactionIdentification,
					PaymentComplementaryInformation6.mmTransactionIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransactionIdentification";
			definition = "Unique identification assigned by the first instructing agent to unambiguously identify the transaction and passed on, unchanged, throughout the entire interbank chain. ";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentIdentification.class.getMethod("getTransactionIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text clearingSystemReference;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences3#mmClearingSystemReference
	 * TransactionReferences3.mmClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentIdentification3#mmClearingSystemReference
	 * PaymentIdentification3.mmClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentIdentification4#mmClearingSystemReference
	 * PaymentIdentification4.mmClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction73#mmClearingSystemReference
	 * PaymentTransaction73.mmClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction80#mmClearingSystemReference
	 * PaymentTransaction80.mmClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction81#mmOriginalClearingSystemReference
	 * PaymentTransaction81.mmOriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction76#mmOriginalClearingSystemReference
	 * PaymentTransaction76.mmOriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction83#mmClearingSystemReference
	 * PaymentTransaction83.mmClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction75#mmOriginalClearingSystemReference
	 * PaymentTransaction75.mmOriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction82#mmClearingSystemReference
	 * PaymentTransaction82.mmClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79#mmOriginalClearingSystemReference
	 * PaymentTransaction79.mmOriginalClearingSystemReference}</li>
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
	public static final MMBusinessAttribute mmClearingSystemReference = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TransactionReferences3.mmClearingSystemReference, PaymentIdentification3.mmClearingSystemReference, PaymentIdentification4.mmClearingSystemReference,
					PaymentTransaction73.mmClearingSystemReference, PaymentTransaction80.mmClearingSystemReference, PaymentTransaction81.mmOriginalClearingSystemReference, PaymentTransaction76.mmOriginalClearingSystemReference,
					PaymentTransaction83.mmClearingSystemReference, PaymentTransaction75.mmOriginalClearingSystemReference, PaymentTransaction82.mmClearingSystemReference, PaymentTransaction79.mmOriginalClearingSystemReference);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClearingSystemReference";
			definition = "Unique and unambiguous identifier for a payment instruction, as assigned by the clearing system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentIdentification.class.getMethod("getClearingSystemReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text creditorReference;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CreditorReferenceInformation2#mmReference
	 * CreditorReferenceInformation2.mmReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation13#mmCreditorReferenceInformation
	 * StructuredRemittanceInformation13.mmCreditorReferenceInformation}</li>
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
	public static final MMBusinessAttribute mmCreditorReference = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CreditorReferenceInformation2.mmReference, StructuredRemittanceInformation13.mmCreditorReferenceInformation);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreditorReference";
			definition = "Unique and unambiguous reference assigned by the creditor to refer to the payment obligation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentIdentification.class.getMethod("getCreditorReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Payment payment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmPaymentRelatedIdentifications
	 * Payment.mmPaymentRelatedIdentifications}</li>
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
	public static final MMBusinessAssociationEnd mmPayment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Payment";
			definition = "Payment for which identifications are provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.mmPaymentRelatedIdentifications;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentIdentification";
				definition = "Specifies the different identifications associated with a payment transaction.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Payment.mmPaymentRelatedIdentifications);
				superType_lazy = () -> TradeIdentification.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentIdentification.mmExecutionIdentification, com.tools20022.repository.entity.PaymentIdentification.mmEndToEndIdentification,
						com.tools20022.repository.entity.PaymentIdentification.mmInstructionIdentification, com.tools20022.repository.entity.PaymentIdentification.mmTransactionIdentification,
						com.tools20022.repository.entity.PaymentIdentification.mmClearingSystemReference, com.tools20022.repository.entity.PaymentIdentification.mmCreditorReference,
						com.tools20022.repository.entity.PaymentIdentification.mmPayment);
				derivationComponent_lazy = () -> Arrays.asList(PaymentIdentification1.mmObject(), CreditorReferenceInformation2.mmObject(), PaymentIdentification3.mmObject(), PaymentIdentification4.mmObject(),
						TransactionReferences4.mmObject(), CertificateIdentification1.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return PaymentIdentification.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getExecutionIdentification() {
		return executionIdentification;
	}

	public PaymentIdentification setExecutionIdentification(Max35Text executionIdentification) {
		this.executionIdentification = Objects.requireNonNull(executionIdentification);
		return this;
	}

	public Max35Text getEndToEndIdentification() {
		return endToEndIdentification;
	}

	public PaymentIdentification setEndToEndIdentification(Max35Text endToEndIdentification) {
		this.endToEndIdentification = Objects.requireNonNull(endToEndIdentification);
		return this;
	}

	public Max35Text getInstructionIdentification() {
		return instructionIdentification;
	}

	public PaymentIdentification setInstructionIdentification(Max35Text instructionIdentification) {
		this.instructionIdentification = Objects.requireNonNull(instructionIdentification);
		return this;
	}

	public Max35Text getTransactionIdentification() {
		return transactionIdentification;
	}

	public PaymentIdentification setTransactionIdentification(Max35Text transactionIdentification) {
		this.transactionIdentification = Objects.requireNonNull(transactionIdentification);
		return this;
	}

	public Max35Text getClearingSystemReference() {
		return clearingSystemReference;
	}

	public PaymentIdentification setClearingSystemReference(Max35Text clearingSystemReference) {
		this.clearingSystemReference = Objects.requireNonNull(clearingSystemReference);
		return this;
	}

	public Max35Text getCreditorReference() {
		return creditorReference;
	}

	public PaymentIdentification setCreditorReference(Max35Text creditorReference) {
		this.creditorReference = Objects.requireNonNull(creditorReference);
		return this;
	}

	public Payment getPayment() {
		return payment;
	}

	public PaymentIdentification setPayment(com.tools20022.repository.entity.Payment payment) {
		this.payment = Objects.requireNonNull(payment);
		return this;
	}
}