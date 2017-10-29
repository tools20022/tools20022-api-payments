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
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.msg.PaymentContext3;
import com.tools20022.repository.msg.TransactionIdentifier1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Payment processes initiated by a payment card.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CardPaymentAcquiring" src="doc-files/CardPaymentAcquiring.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#PointOfInteraction
 * CardPaymentAcquiring.PointOfInteraction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#CardPaymentService
 * CardPaymentAcquiring.CardPaymentService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#TransactionIdentification
 * CardPaymentAcquiring.TransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#TransactionDateTime
 * CardPaymentAcquiring.TransactionDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#ICCRelatedData
 * CardPaymentAcquiring.ICCRelatedData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#RelatedCardPayment
 * CardPaymentAcquiring.RelatedCardPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#CardPresent
 * CardPaymentAcquiring.CardPresent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#CardholderPresent
 * CardPaymentAcquiring.CardholderPresent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#OnLineContext
 * CardPaymentAcquiring.OnLineContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#AttendanceContext
 * CardPaymentAcquiring.AttendanceContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#TransactionEnvironment
 * CardPaymentAcquiring.TransactionEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#TransactionChannel
 * CardPaymentAcquiring.TransactionChannel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#AttendantMessageCapable
 * CardPaymentAcquiring.AttendantMessageCapable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#AttendantLanguage
 * CardPaymentAcquiring.AttendantLanguage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#CardDataEntryMode
 * CardPaymentAcquiring.CardDataEntryMode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#FallbackIndicator
 * CardPaymentAcquiring.FallbackIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#TMSTrigger
 * CardPaymentAcquiring.TMSTrigger}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#InitiatorTransactionIdentifier
 * CardPaymentAcquiring.InitiatorTransactionIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#Reversal
 * CardPaymentAcquiring.Reversal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#InterchangeData
 * CardPaymentAcquiring.InterchangeData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#UnattendedLevelCategory
 * CardPaymentAcquiring.UnattendedLevelCategory}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#Validation
 * CardPaymentAcquiring.Validation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#CompletionRequired
 * CardPaymentAcquiring.CompletionRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#ActionType
 * CardPaymentAcquiring.ActionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#ActionMessage
 * CardPaymentAcquiring.ActionMessage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#CaptureIndicator
 * CardPaymentAcquiring.CaptureIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#RecipientTransactionIdentification
 * CardPaymentAcquiring.RecipientTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#Location
 * CardPaymentAcquiring.Location}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#Country
 * CardPaymentAcquiring.Country}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Country#RelatedCardPayment
 * Country.RelatedCardPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPayment#CardPaymentAcquiring
 * CardPayment.CardPaymentAcquiring}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#CardPaymentAcquiring
 * PointOfInteraction.CardPaymentAcquiring}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem#CardPaymentAcquiring
 * TerminalManagementSystem.CardPaymentAcquiring}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#CardPayment
 * CardPaymentValidation.CardPayment}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifier1
 * TransactionIdentifier1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentContext3
 * PaymentContext3}</li>
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
 * "CardPaymentAcquiring"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Payment processes initiated by a payment card."</li>
 * </ul>
 */
public class CardPaymentAcquiring {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Describes the Point of Interaction through which the payment by card was
	 * initiated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#CardPaymentAcquiring
	 * PointOfInteraction.CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PointOfInteraction
	 * PointOfInteraction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.CardTransaction2#POI
	 * CardTransaction2.POI}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardEntry2#POI
	 * CardEntry2.POI}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PointOfInteraction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Describes the Point of Interaction through which the payment by card was initiated."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PointOfInteraction = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardTransaction2.POI, com.tools20022.repository.msg.CardEntry2.POI);
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PointOfInteraction";
			definition = "Describes the Point of Interaction through which the payment by card was initiated.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.PointOfInteraction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PointOfInteraction.CardPaymentAcquiring;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Type of service provided by the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAggregated1#AdditionalService
	 * CardAggregated1.AdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction2#AdditionalService
	 * CardIndividualTransaction2.AdditionalService}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardPaymentService"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of service provided by the transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CardPaymentService = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardAggregated1.AdditionalService, com.tools20022.repository.msg.CardIndividualTransaction2.AdditionalService);
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CardPaymentService";
			definition = "Type of service provided by the transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CardPaymentServiceTypeCode.mmObject();
		}
	};
	/**
	 * Identification of the transaction assigned by the POI (Point Of
	 * Interaction).
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
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifier1#TransactionReference
	 * TransactionIdentifier1.TransactionReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction2#TransactionIdentification
	 * CardIndividualTransaction2.TransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the transaction assigned by the POI (Point Of Interaction)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TransactionIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionIdentifier1.TransactionReference, com.tools20022.repository.msg.CardIndividualTransaction2.TransactionIdentification);
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransactionIdentification";
			definition = "Identification of the transaction assigned by the POI (Point Of Interaction).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Local date and time of the transaction assigned by the POI (Point Of
	 * Interaction).
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
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifier1#TransactionDateTime
	 * TransactionIdentifier1.TransactionDateTime}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Local date and time of the transaction assigned by the POI (Point Of Interaction)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TransactionDateTime = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionIdentifier1.TransactionDateTime);
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransactionDateTime";
			definition = "Local date and time of the transaction assigned by the POI (Point Of Interaction).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Data related to the interface of an integrated circuit card application.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max10000Binary
	 * Max10000Binary}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction2#ICCRelatedData
	 * CardIndividualTransaction2.ICCRelatedData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ICCRelatedData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Data related to the interface of an integrated circuit card application."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ICCRelatedData = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardIndividualTransaction2.ICCRelatedData);
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ICCRelatedData";
			definition = "Data related to the interface of an integrated circuit card application.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max10000Binary.mmObject();
		}
	};
	/**
	 * Card payment which is at the origin of the acquiring process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#CardPaymentAcquiring
	 * CardPayment.CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CardPayment
	 * CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCardPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Card payment which is at the origin of the acquiring process."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedCardPayment = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCardPayment";
			definition = "Card payment which is at the origin of the acquiring process.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CardPayment.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CardPayment.CardPaymentAcquiring;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates whether the transaction has been initiated by a card physically
	 * present or not.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext3#CardPresent
	 * PaymentContext3.CardPresent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardPresent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the transaction has been initiated by a card physically present or not."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CardPresent = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentContext3.CardPresent);
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CardPresent";
			definition = "Indicates whether the transaction has been initiated by a card physically present or not.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether the transaction has been initiated in presence of the
	 * cardholder or not.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext3#CardholderPresent
	 * PaymentContext3.CardholderPresent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardholderPresent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the transaction has been initiated in presence of the cardholder or not."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CardholderPresent = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentContext3.CardholderPresent);
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CardholderPresent";
			definition = "Indicates whether the transaction has been initiated in presence of the cardholder or not.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	/**
	 * On-line or off-line context of the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext3#OnLineContext
	 * PaymentContext3.OnLineContext}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnLineContext"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "On-line or off-line context of the transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute OnLineContext = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentContext3.OnLineContext);
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OnLineContext";
			definition = "On-line or off-line context of the transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	/**
	 * Human attendance at the POI location during the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AttendanceContextCode
	 * AttendanceContextCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext3#AttendanceContext
	 * PaymentContext3.AttendanceContext}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AttendanceContext"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Human attendance at the POI location during the transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AttendanceContext = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentContext3.AttendanceContext);
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AttendanceContext";
			definition = "Human attendance at the POI location during the transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> AttendanceContextCode.mmObject();
		}
	};
	/**
	 * Indicates the environment of the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionEnvironmentCode
	 * TransactionEnvironmentCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext3#TransactionEnvironment
	 * PaymentContext3.TransactionEnvironment}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionEnvironment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the environment of the transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TransactionEnvironment = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentContext3.TransactionEnvironment);
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransactionEnvironment";
			definition = "Indicates the environment of the transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TransactionEnvironmentCode.mmObject();
		}
	};
	/**
	 * Identifies the type of the communication channels used by the cardholder
	 * to the acceptor system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannelCode
	 * TransactionChannelCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext3#TransactionChannel
	 * PaymentContext3.TransactionChannel}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionChannel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the type of the communication channels used by the cardholder to the acceptor system."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TransactionChannel = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentContext3.TransactionChannel);
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransactionChannel";
			definition = "Identifies the type of the communication channels used by the cardholder to the acceptor system.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TransactionChannelCode.mmObject();
		}
	};
	/**
	 * Indicates whether a message can be sent or not on an attendant display
	 * (attendant display present or not).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext3#AttendantMessageCapable
	 * PaymentContext3.AttendantMessageCapable}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AttendantMessageCapable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether a message can be sent or not on an attendant display (attendant display present or not)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AttendantMessageCapable = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentContext3.AttendantMessageCapable);
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AttendantMessageCapable";
			definition = "Indicates whether a message can be sent or not on an attendant display (attendant display present or not).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	/**
	 * Language used to display messages to the attendant.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ISO2ALanguageCode
	 * ISO2ALanguageCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext3#AttendantLanguage
	 * PaymentContext3.AttendantLanguage}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AttendantLanguage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Language used to display messages to the attendant."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AttendantLanguage = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentContext3.AttendantLanguage);
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AttendantLanguage";
			definition = "Language used to display messages to the attendant.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISO2ALanguageCode.mmObject();
		}
	};
	/**
	 * Entry mode of the card data.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReadingCode
	 * CardDataReadingCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext3#CardDataEntryMode
	 * PaymentContext3.CardDataEntryMode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardDataEntryMode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Entry mode of the card data."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CardDataEntryMode = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentContext3.CardDataEntryMode);
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CardDataEntryMode";
			definition = "Entry mode of the card data.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CardDataReadingCode.mmObject();
		}
	};
	/**
	 * Indicator of a transaction fallback.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext3#FallbackIndicator
	 * PaymentContext3.FallbackIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FallbackIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicator of a transaction fallback."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute FallbackIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentContext3.FallbackIndicator);
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FallbackIndicator";
			definition = "Indicator of a transaction fallback.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	/**
	 * Instructs the POI (Point Of Interaction) how to contact the host of the
	 * terminal management system (TMS), to initiate the maintenance of the
	 * terminal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem#CardPaymentAcquiring
	 * TerminalManagementSystem.CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem
	 * TerminalManagementSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TMSTrigger"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instructs the POI (Point Of Interaction) how to contact the host of the terminal management system (TMS), to initiate the maintenance of the terminal."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TMSTrigger = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TMSTrigger";
			definition = "Instructs the POI (Point Of Interaction) how to contact the host of the terminal management system (TMS), to initiate the maintenance of the terminal.";
			minOccurs = 0;
			type_lazy = () -> TerminalManagementSystem.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TerminalManagementSystem.CardPaymentAcquiring;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Identification of the transaction assigned by the initiating party for
	 * the recipient party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InitiatorTransactionIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the transaction assigned by the initiating party for the recipient party."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute InitiatorTransactionIdentifier = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InitiatorTransactionIdentifier";
			definition = "Identification of the transaction assigned by the initiating party for the recipient party.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Notify that a previous transaction has to be reversed if this original
	 * transaction has been approved by the acquirer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reversal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Notify that a previous transaction has to be reversed if this original transaction has been approved by the acquirer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Reversal = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Reversal";
			definition = "Notify that a previous transaction has to be reversed if this original transaction has been approved by the acquirer.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	/**
	 * Interchange information related to the card scheme.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterchangeData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Interchange information related to the card scheme."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute InterchangeData = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InterchangeData";
			definition = "Interchange information related to the card scheme.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Transaction category level on an unattended POI (Point Of Interaction).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max35NumericText
	 * Max35NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnattendedLevelCategory"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction category level on an unattended POI (Point Of Interaction)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute UnattendedLevelCategory = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnattendedLevelCategory";
			definition = "Transaction category level on an unattended POI (Point Of Interaction).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35NumericText.mmObject();
		}
	};
	/**
	 * Results and parameters of the card payment verification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#CardPayment
	 * CardPaymentValidation.CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation
	 * CardPaymentValidation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Validation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Results and parameters of the card payment verification."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Validation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Validation";
			definition = "Results and parameters of the card payment verification.";
			minOccurs = 0;
			type_lazy = () -> CardPaymentValidation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CardPaymentValidation.CardPayment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates whether the acquirer requires a further exchange after the
	 * completion of the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompletionRequired"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the acquirer requires a further exchange after the completion of the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CompletionRequired = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CompletionRequired";
			definition = "Indicates whether the acquirer requires a further exchange after the completion of the transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	/**
	 * Type of action to be performed by the POI (Point Of Interaction) system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActionTypeCode
	 * ActionTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of action to be performed by the POI (Point Of Interaction) system."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ActionType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ActionType";
			definition = "Type of action to be performed by the POI (Point Of Interaction) system.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActionTypeCode.mmObject();
		}
	};
	/**
	 * Message to be displayed or printed to the cardholder or the cashier.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max256Text
	 * Max256Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActionMessage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Message to be displayed or printed to the cardholder or the cashier."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ActionMessage = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ActionMessage";
			definition = "Message to be displayed or printed to the cardholder or the cashier.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max256Text.mmObject();
		}
	};
	/**
	 * Indicates whether the transaction is captured or not.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CaptureIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the transaction is captured or not."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CaptureIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CaptureIndicator";
			definition = "Indicates whether the transaction is captured or not.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	/**
	 * Identification of the transaction assigned by the recipient party for the
	 * initiating party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecipientTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the transaction assigned by the recipient party for the initiating party."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RecipientTransactionIdentification = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RecipientTransactionIdentification";
			definition = "Identification of the transaction assigned by the recipient party for the initiating party.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Location category of the place where the merchant actually performed the
	 * transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.LocationCategoryCode
	 * LocationCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Location"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Location category of the place where the merchant actually performed the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Location = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Location";
			definition = "Location category of the place where the merchant actually performed the transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> LocationCategoryCode.mmObject();
		}
	};
	/**
	 * Country of the merchant where the transaction took place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Country#RelatedCardPayment
	 * Country.RelatedCardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Country Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Country"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country of the merchant where the transaction took place."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Country = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Country";
			definition = "Country of the merchant where the transaction took place.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Country.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Country.RelatedCardPayment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CardPaymentAcquiring";
				definition = "Payment processes initiated by a payment card.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Country.RelatedCardPayment, com.tools20022.repository.entity.CardPayment.CardPaymentAcquiring,
						com.tools20022.repository.entity.PointOfInteraction.CardPaymentAcquiring, com.tools20022.repository.entity.TerminalManagementSystem.CardPaymentAcquiring,
						com.tools20022.repository.entity.CardPaymentValidation.CardPayment);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CardPaymentAcquiring.PointOfInteraction, com.tools20022.repository.entity.CardPaymentAcquiring.CardPaymentService,
						com.tools20022.repository.entity.CardPaymentAcquiring.TransactionIdentification, com.tools20022.repository.entity.CardPaymentAcquiring.TransactionDateTime,
						com.tools20022.repository.entity.CardPaymentAcquiring.ICCRelatedData, com.tools20022.repository.entity.CardPaymentAcquiring.RelatedCardPayment, com.tools20022.repository.entity.CardPaymentAcquiring.CardPresent,
						com.tools20022.repository.entity.CardPaymentAcquiring.CardholderPresent, com.tools20022.repository.entity.CardPaymentAcquiring.OnLineContext, com.tools20022.repository.entity.CardPaymentAcquiring.AttendanceContext,
						com.tools20022.repository.entity.CardPaymentAcquiring.TransactionEnvironment, com.tools20022.repository.entity.CardPaymentAcquiring.TransactionChannel,
						com.tools20022.repository.entity.CardPaymentAcquiring.AttendantMessageCapable, com.tools20022.repository.entity.CardPaymentAcquiring.AttendantLanguage,
						com.tools20022.repository.entity.CardPaymentAcquiring.CardDataEntryMode, com.tools20022.repository.entity.CardPaymentAcquiring.FallbackIndicator, com.tools20022.repository.entity.CardPaymentAcquiring.TMSTrigger,
						com.tools20022.repository.entity.CardPaymentAcquiring.InitiatorTransactionIdentifier, com.tools20022.repository.entity.CardPaymentAcquiring.Reversal,
						com.tools20022.repository.entity.CardPaymentAcquiring.InterchangeData, com.tools20022.repository.entity.CardPaymentAcquiring.UnattendedLevelCategory, com.tools20022.repository.entity.CardPaymentAcquiring.Validation,
						com.tools20022.repository.entity.CardPaymentAcquiring.CompletionRequired, com.tools20022.repository.entity.CardPaymentAcquiring.ActionType, com.tools20022.repository.entity.CardPaymentAcquiring.ActionMessage,
						com.tools20022.repository.entity.CardPaymentAcquiring.CaptureIndicator, com.tools20022.repository.entity.CardPaymentAcquiring.RecipientTransactionIdentification,
						com.tools20022.repository.entity.CardPaymentAcquiring.Location, com.tools20022.repository.entity.CardPaymentAcquiring.Country);
				derivationComponent_lazy = () -> Arrays.asList(TransactionIdentifier1.mmObject(), PaymentContext3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}