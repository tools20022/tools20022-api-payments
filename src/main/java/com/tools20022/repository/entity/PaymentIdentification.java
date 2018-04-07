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
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.entity.TradeIdentification;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
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
	 * {@linkplain com.tools20022.repository.msg.GroupHeader48#mmMessageIdentification
	 * GroupHeader48.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader55#mmMessageIdentification
	 * GroupHeader55.mmMessageIdentification}</li>
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
	 * {@linkplain com.tools20022.repository.msg.GroupHeader46#mmMessageIdentification
	 * GroupHeader46.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader45#mmMessageIdentification
	 * GroupHeader45.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader59#mmMessageIdentification
	 * GroupHeader59.mmMessageIdentification}</li>
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
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation28#mmOriginalMessageIdentification
	 * OriginalGroupInformation28.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification7#mmInstructionIdentification
	 * RequestedModification7.mmInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction26#mmOriginalPaymentInformationCancellationIdentification
	 * OriginalPaymentInstruction26.
	 * mmOriginalPaymentInformationCancellationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction4#mmOriginalPaymentInformationIdentification
	 * UnderlyingPaymentInstruction4.mmOriginalPaymentInformationIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader9#mmOriginalGroupCancellationIdentification
	 * OriginalGroupHeader9.mmOriginalGroupCancellationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader9#mmOriginalMessageIdentification
	 * OriginalGroupHeader9.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction29#mmPaymentCancellationIdentification
	 * OriginalPaymentInstruction29.mmPaymentCancellationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader13#mmOriginalMessageIdentification
	 * OriginalGroupHeader13.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader74#mmMessageIdentification
	 * GroupHeader74.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader73#mmMessageIdentification
	 * GroupHeader73.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader12#mmOriginalMessageIdentification
	 * OriginalGroupHeader12.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader11#mmOriginalMessageIdentification
	 * OriginalGroupHeader11.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader75#mmMessageIdentification
	 * GroupHeader75.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader76#mmMessageIdentification
	 * GroupHeader76.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader10#mmOriginalMessageIdentification
	 * OriginalGroupHeader10.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation29#mmOriginalMessageIdentification
	 * OriginalGroupInformation29.mmOriginalMessageIdentification}</li>
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
	public static final MMBusinessAttribute<PaymentIdentification, Max35Text> mmExecutionIdentification = new MMBusinessAttribute<PaymentIdentification, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(GroupHeader48.mmMessageIdentification, GroupHeader55.mmMessageIdentification, GroupHeader50.mmMessageIdentification, GroupHeader53.mmMessageIdentification,
					GroupHeader47.mmMessageIdentification, GroupHeader46.mmMessageIdentification, GroupHeader45.mmMessageIdentification, GroupHeader59.mmMessageIdentification, GroupHeader60.mmMessageIdentification,
					GroupHeader63.mmMessageIdentification, GroupHeader62.mmMessageIdentification, GroupHeader70.mmMessageIdentification, GroupHeader72.mmMessageIdentification, GroupHeader71.mmMessageIdentification,
					OriginalItem5.mmOriginalItemIdentification, OriginalMessage2.mmOriginalMessageIdentification, OriginalMessage3.mmOriginalMessageIdentification, OriginalGroupInformation27.mmOriginalMessageIdentification,
					OriginalGroupInformation28.mmOriginalMessageIdentification, RequestedModification7.mmInstructionIdentification, OriginalPaymentInstruction26.mmOriginalPaymentInformationCancellationIdentification,
					UnderlyingPaymentInstruction4.mmOriginalPaymentInformationIdentification, OriginalGroupHeader9.mmOriginalGroupCancellationIdentification, OriginalGroupHeader9.mmOriginalMessageIdentification,
					OriginalPaymentInstruction29.mmPaymentCancellationIdentification, OriginalGroupHeader13.mmOriginalMessageIdentification, GroupHeader74.mmMessageIdentification, GroupHeader73.mmMessageIdentification,
					OriginalGroupHeader12.mmOriginalMessageIdentification, OriginalGroupHeader11.mmOriginalMessageIdentification, GroupHeader75.mmMessageIdentification, GroupHeader76.mmMessageIdentification,
					OriginalGroupHeader10.mmOriginalMessageIdentification, OriginalGroupInformation29.mmOriginalMessageIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExecutionIdentification";
			definition = "Unique and unambiguous identifier for a payment execution, as assigned by the clearing agent or the initiating party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PaymentIdentification obj) {
			return obj.getExecutionIdentification();
		}

		@Override
		public void setValue(PaymentIdentification obj, Max35Text value) {
			obj.setExecutionIdentification(value);
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
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction83#mmOriginalEndToEndIdentification
	 * PaymentTransaction83.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation7#mmEndToEndIdentification
	 * PaymentComplementaryInformation7.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction87#mmOriginalEndToEndIdentification
	 * PaymentTransaction87.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction88#mmOriginalEndToEndIdentification
	 * PaymentTransaction88.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification7#mmEndToEndIdentification
	 * RequestedModification7.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification7#mmTransactionIdentification
	 * RequestedModification7.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction90#mmOriginalEndToEndIdentification
	 * PaymentTransaction90.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction91#mmOriginalEndToEndIdentification
	 * PaymentTransaction91.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction85#mmOriginalEndToEndIdentification
	 * PaymentTransaction85.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction89#mmOriginalEndToEndIdentification
	 * PaymentTransaction89.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction84#mmOriginalEndToEndIdentification
	 * PaymentTransaction84.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction4#mmOriginalEndToEndIdentification
	 * UnderlyingPaymentInstruction4.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentTransaction3#mmOriginalEndToEndIdentification
	 * UnderlyingPaymentTransaction3.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInitiation3#mmEndToEndIdentification
	 * CorrectivePaymentInitiation3.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction94#mmOriginalEndToEndIdentification
	 * PaymentTransaction94.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction92#mmOriginalEndToEndIdentification
	 * PaymentTransaction92.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction95#mmOriginalEndToEndIdentification
	 * PaymentTransaction95.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction93#mmOriginalEndToEndIdentification
	 * PaymentTransaction93.mmOriginalEndToEndIdentification}</li>
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
	public static final MMBusinessAttribute<PaymentIdentification, Max35Text> mmEndToEndIdentification = new MMBusinessAttribute<PaymentIdentification, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentIdentification1.mmEndToEndIdentification, TransactionReferences3.mmEndToEndIdentification, PaymentIdentification3.mmEndToEndIdentification,
					PaymentIdentification4.mmEndToEndIdentification, CorrectiveInterbankTransaction1.mmEndToEndIdentification, TransactionReferences4.mmEndToEndIdentification, CertificateIdentification1.mmEndToEndIdentification,
					OriginalItem5.mmOriginalEndToEndIdentification, OriginalItemAndStatus5.mmOriginalEndToEndIdentification, NotificationItem6.mmEndToEndIdentification, PaymentTransaction83.mmOriginalEndToEndIdentification,
					PaymentComplementaryInformation7.mmEndToEndIdentification, PaymentTransaction87.mmOriginalEndToEndIdentification, PaymentTransaction88.mmOriginalEndToEndIdentification, RequestedModification7.mmEndToEndIdentification,
					RequestedModification7.mmTransactionIdentification, PaymentTransaction90.mmOriginalEndToEndIdentification, PaymentTransaction91.mmOriginalEndToEndIdentification, PaymentTransaction85.mmOriginalEndToEndIdentification,
					PaymentTransaction89.mmOriginalEndToEndIdentification, PaymentTransaction84.mmOriginalEndToEndIdentification, UnderlyingPaymentInstruction4.mmOriginalEndToEndIdentification,
					UnderlyingPaymentTransaction3.mmOriginalEndToEndIdentification, CorrectivePaymentInitiation3.mmEndToEndIdentification, PaymentTransaction94.mmOriginalEndToEndIdentification,
					PaymentTransaction92.mmOriginalEndToEndIdentification, PaymentTransaction95.mmOriginalEndToEndIdentification, PaymentTransaction93.mmOriginalEndToEndIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EndToEndIdentification";
			definition = "Unique and unambiguous identifier for a payment as assigned by the originator. The payment transaction reference is used for reconciliation or to link tasks relating to the payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PaymentIdentification obj) {
			return obj.getEndToEndIdentification();
		}

		@Override
		public void setValue(PaymentIdentification obj, Max35Text value) {
			obj.setEndToEndIdentification(value);
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
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences4#mmInstructionIdentification
	 * TransactionReferences4.mmInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CertificateIdentification1#mmInstructionIdentification
	 * CertificateIdentification1.mmInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction83#mmOriginalInstructionIdentification
	 * PaymentTransaction83.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation7#mmInstructionIdentification
	 * PaymentComplementaryInformation7.mmInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction87#mmOriginalInstructionIdentification
	 * PaymentTransaction87.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction88#mmOriginalInstructionIdentification
	 * PaymentTransaction88.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction90#mmOriginalInstructionIdentification
	 * PaymentTransaction90.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction91#mmOriginalInstructionIdentification
	 * PaymentTransaction91.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction85#mmOriginalInstructionIdentification
	 * PaymentTransaction85.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction89#mmOriginalInstructionIdentification
	 * PaymentTransaction89.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction84#mmOriginalInstructionIdentification
	 * PaymentTransaction84.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction4#mmOriginalInstructionIdentification
	 * UnderlyingPaymentInstruction4.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentTransaction3#mmOriginalInstructionIdentification
	 * UnderlyingPaymentTransaction3.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInitiation3#mmInstructionIdentification
	 * CorrectivePaymentInitiation3.mmInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction28#mmReversalPaymentInformationIdentification
	 * OriginalPaymentInstruction28.mmReversalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction94#mmOriginalInstructionIdentification
	 * PaymentTransaction94.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction92#mmOriginalInstructionIdentification
	 * PaymentTransaction92.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction95#mmOriginalInstructionIdentification
	 * PaymentTransaction95.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction93#mmOriginalInstructionIdentification
	 * PaymentTransaction93.mmOriginalInstructionIdentification}</li>
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
	public static final MMBusinessAttribute<PaymentIdentification, Max35Text> mmInstructionIdentification = new MMBusinessAttribute<PaymentIdentification, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentIdentification1.mmInstructionIdentification, TransactionReferences3.mmInstructionIdentification, PaymentIdentification3.mmInstructionIdentification,
					PaymentIdentification4.mmInstructionIdentification, CorrectiveInterbankTransaction1.mmInstructionIdentification, TransactionReferences4.mmInstructionIdentification,
					CertificateIdentification1.mmInstructionIdentification, PaymentTransaction83.mmOriginalInstructionIdentification, PaymentComplementaryInformation7.mmInstructionIdentification,
					PaymentTransaction87.mmOriginalInstructionIdentification, PaymentTransaction88.mmOriginalInstructionIdentification, PaymentTransaction90.mmOriginalInstructionIdentification,
					PaymentTransaction91.mmOriginalInstructionIdentification, PaymentTransaction85.mmOriginalInstructionIdentification, PaymentTransaction89.mmOriginalInstructionIdentification,
					PaymentTransaction84.mmOriginalInstructionIdentification, UnderlyingPaymentInstruction4.mmOriginalInstructionIdentification, UnderlyingPaymentTransaction3.mmOriginalInstructionIdentification,
					CorrectivePaymentInitiation3.mmInstructionIdentification, OriginalPaymentInstruction28.mmReversalPaymentInformationIdentification, PaymentTransaction94.mmOriginalInstructionIdentification,
					PaymentTransaction92.mmOriginalInstructionIdentification, PaymentTransaction95.mmOriginalInstructionIdentification, PaymentTransaction93.mmOriginalInstructionIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InstructionIdentification";
			definition = "Unique identification assigned by an instructing party for an instructed party to unambiguously identify the instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PaymentIdentification obj) {
			return obj.getInstructionIdentification();
		}

		@Override
		public void setValue(PaymentIdentification obj, Max35Text value) {
			obj.setInstructionIdentification(value);
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
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences4#mmTransactionIdentification
	 * TransactionReferences4.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation7#mmTransactionIdentification
	 * PaymentComplementaryInformation7.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction87#mmOriginalTransactionIdentification
	 * PaymentTransaction87.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction88#mmOriginalTransactionIdentification
	 * PaymentTransaction88.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction90#mmOriginalTransactionIdentification
	 * PaymentTransaction90.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction91#mmOriginalTransactionIdentification
	 * PaymentTransaction91.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction85#mmOriginalTransactionIdentification
	 * PaymentTransaction85.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction89#mmOriginalTransactionIdentification
	 * PaymentTransaction89.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentTransaction3#mmOriginalTransactionIdentification
	 * UnderlyingPaymentTransaction3.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction94#mmOriginalTransactionIdentification
	 * PaymentTransaction94.mmOriginalTransactionIdentification}</li>
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
	public static final MMBusinessAttribute<PaymentIdentification, Max35Text> mmTransactionIdentification = new MMBusinessAttribute<PaymentIdentification, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(TransactionReferences3.mmTransactionIdentification, PaymentIdentification3.mmTransactionIdentification, PaymentIdentification4.mmTransactionIdentification,
					CorrectiveInterbankTransaction1.mmTransactionIdentification, TransactionReferences4.mmTransactionIdentification, PaymentComplementaryInformation7.mmTransactionIdentification,
					PaymentTransaction87.mmOriginalTransactionIdentification, PaymentTransaction88.mmOriginalTransactionIdentification, PaymentTransaction90.mmOriginalTransactionIdentification,
					PaymentTransaction91.mmOriginalTransactionIdentification, PaymentTransaction85.mmOriginalTransactionIdentification, PaymentTransaction89.mmOriginalTransactionIdentification,
					UnderlyingPaymentTransaction3.mmOriginalTransactionIdentification, PaymentTransaction94.mmOriginalTransactionIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransactionIdentification";
			definition = "Unique identification assigned by the first instructing agent to unambiguously identify the transaction and passed on, unchanged, throughout the entire interbank chain. ";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PaymentIdentification obj) {
			return obj.getTransactionIdentification();
		}

		@Override
		public void setValue(PaymentIdentification obj, Max35Text value) {
			obj.setTransactionIdentification(value);
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
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction83#mmClearingSystemReference
	 * PaymentTransaction83.mmClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction87#mmOriginalClearingSystemReference
	 * PaymentTransaction87.mmOriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction87#mmClearingSystemReference
	 * PaymentTransaction87.mmClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction88#mmOriginalClearingSystemReference
	 * PaymentTransaction88.mmOriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction90#mmOriginalClearingSystemReference
	 * PaymentTransaction90.mmOriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction91#mmClearingSystemReference
	 * PaymentTransaction91.mmClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction85#mmOriginalClearingSystemReference
	 * PaymentTransaction85.mmOriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction89#mmOriginalClearingSystemReference
	 * PaymentTransaction89.mmOriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction94#mmClearingSystemReference
	 * PaymentTransaction94.mmClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction92#mmClearingSystemReference
	 * PaymentTransaction92.mmClearingSystemReference}</li>
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
	public static final MMBusinessAttribute<PaymentIdentification, Max35Text> mmClearingSystemReference = new MMBusinessAttribute<PaymentIdentification, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(TransactionReferences3.mmClearingSystemReference, PaymentIdentification3.mmClearingSystemReference, PaymentIdentification4.mmClearingSystemReference,
					PaymentTransaction83.mmClearingSystemReference, PaymentTransaction87.mmOriginalClearingSystemReference, PaymentTransaction87.mmClearingSystemReference, PaymentTransaction88.mmOriginalClearingSystemReference,
					PaymentTransaction90.mmOriginalClearingSystemReference, PaymentTransaction91.mmClearingSystemReference, PaymentTransaction85.mmOriginalClearingSystemReference, PaymentTransaction89.mmOriginalClearingSystemReference,
					PaymentTransaction94.mmClearingSystemReference, PaymentTransaction92.mmClearingSystemReference);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClearingSystemReference";
			definition = "Unique and unambiguous identifier for a payment instruction, as assigned by the clearing system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PaymentIdentification obj) {
			return obj.getClearingSystemReference();
		}

		@Override
		public void setValue(PaymentIdentification obj, Max35Text value) {
			obj.setClearingSystemReference(value);
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation14#mmCreditorReferenceInformation
	 * StructuredRemittanceInformation14.mmCreditorReferenceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation15#mmCreditorReferenceInformation
	 * StructuredRemittanceInformation15.mmCreditorReferenceInformation}</li>
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
	public static final MMBusinessAttribute<PaymentIdentification, Max35Text> mmCreditorReference = new MMBusinessAttribute<PaymentIdentification, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(CreditorReferenceInformation2.mmReference, StructuredRemittanceInformation13.mmCreditorReferenceInformation, StructuredRemittanceInformation14.mmCreditorReferenceInformation,
					StructuredRemittanceInformation15.mmCreditorReferenceInformation);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreditorReference";
			definition = "Unique and unambiguous reference assigned by the creditor to refer to the payment obligation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PaymentIdentification obj) {
			return obj.getCreditorReference();
		}

		@Override
		public void setValue(PaymentIdentification obj, Max35Text value) {
			obj.setCreditorReference(value);
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
	public static final MMBusinessAssociationEnd<PaymentIdentification, com.tools20022.repository.entity.Payment> mmPayment = new MMBusinessAssociationEnd<PaymentIdentification, com.tools20022.repository.entity.Payment>() {
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

		@Override
		public com.tools20022.repository.entity.Payment getValue(PaymentIdentification obj) {
			return obj.getPayment();
		}

		@Override
		public void setValue(PaymentIdentification obj, com.tools20022.repository.entity.Payment value) {
			obj.setPayment(value);
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