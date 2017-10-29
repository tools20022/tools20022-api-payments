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
import com.tools20022.repository.codeset.CardAccountTypeCode;
import com.tools20022.repository.codeset.CardTypeCode;
import com.tools20022.repository.codeset.CSCManagementCode;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.msg.CardSecurityInformation1;
import com.tools20022.repository.msg.PaymentCard4;
import com.tools20022.repository.msg.PlainCardData1;
import com.tools20022.repository.msg.TrackData1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Electronic money product that provides the cardholder with a portable and
 * specialised computer device that typically contains a microprocessor.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PaymentCard" src="doc-files/PaymentCard.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#Payment
 * PaymentCard.Payment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#Type
 * PaymentCard.Type}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#Number
 * PaymentCard.Number}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#StartDate
 * PaymentCard.StartDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#ExpiryDate
 * PaymentCard.ExpiryDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#SecurityCode
 * PaymentCard.SecurityCode}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#SequenceNumber
 * PaymentCard.SequenceNumber}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#ServiceCode
 * PaymentCard.ServiceCode}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#TrackValue
 * PaymentCard.TrackValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentCard#SecurityCodeManagement
 * PaymentCard.SecurityCodeManagement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#CardBrand
 * PaymentCard.CardBrand}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#RelatedAccount
 * PaymentCard.RelatedAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#ProfileNumber
 * PaymentCard.ProfileNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentCard#RelatedAccountType
 * PaymentCard.RelatedAccountType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentCard#CreditAvailableAmount
 * PaymentCard.CreditAvailableAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#Limit
 * PaymentCard.Limit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentCard#CardCurrencyCode
 * PaymentCard.CardCurrencyCode}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#Interest
 * PaymentCard.Interest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#CardCountryCode
 * PaymentCard.CardCountryCode}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#CardProgramme
 * PaymentCard.CardProgramme}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Country#RelatedPaymentCard
 * Country.RelatedPaymentCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#RelatedPaymentCard
 * CashAccount.RelatedPaymentCard}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CardPayment#PaymentCard
 * CardPayment.PaymentCard}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Limit#RelatedPaymentCard
 * Limit.RelatedPaymentCard}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#RelatedPaymentCard
 * Interest.RelatedPaymentCard}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData1#TrackData
 * PlainCardData1.TrackData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PlainCardData1#CardSecurityCode
 * PlainCardData1.CardSecurityCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard4#PlainCardData
 * PaymentCard4.PlainCardData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TrackData1 TrackData1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardSecurityInformation1
 * CardSecurityInformation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData1 PlainCardData1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard4 PaymentCard4}</li>
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
 * "PaymentCard"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Electronic money product that provides the cardholder with a portable and specialised computer device that typically contains a microprocessor."
 * </li>
 * </ul>
 */
public class PaymentCard {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Payment for which a payment card is used.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#PaymentCard
	 * CardPayment.PaymentCard}</li>
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
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Payment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment for which a payment card is used."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Payment = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentCard.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Payment";
			definition = "Payment for which a payment card is used.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CardPayment.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CardPayment.PaymentCard;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Type of card, eg, credit card.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CardTypeCode
	 * CardTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of card, eg, credit card."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PaymentCard.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Type of card, eg, credit card.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CardTypeCode.mmObject();
		}
	};
	/**
	 * Number embossed on a card that links the card to the account owner and
	 * account servicer (sometimes called personal account number or PAN).
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
	 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData1#PAN
	 * PlainCardData1.PAN}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Number"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number embossed on a card that links the card to the account owner and account servicer (sometimes called personal account number or PAN)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Number = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PlainCardData1.PAN);
			elementContext_lazy = () -> PaymentCard.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Number";
			definition = "Number embossed on a card that links the card to the account owner and account servicer (sometimes called personal account number or PAN).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Year and month the card is available for use.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ISOYearMonth ISOYearMonth}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData1#EffectiveDate
	 * PlainCardData1.EffectiveDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StartDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Year and month the card is available for use."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute StartDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PlainCardData1.EffectiveDate);
			elementContext_lazy = () -> PaymentCard.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StartDate";
			definition = "Year and month the card is available for use.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISOYearMonth.mmObject();
		}
	};
	/**
	 * Year and month the card expires.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ISOYearMonth ISOYearMonth}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData1#ExpiryDate
	 * PlainCardData1.ExpiryDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Year and month the card expires."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ExpiryDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PlainCardData1.ExpiryDate);
			elementContext_lazy = () -> PaymentCard.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExpiryDate";
			definition = "Year and month the card expires.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISOYearMonth.mmObject();
		}
	};
	/**
	 * Security code written on the card, sometimes called card security code
	 * (CSC).
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
	 * {@linkplain com.tools20022.repository.msg.CardSecurityInformation1#CSCValue
	 * CardSecurityInformation1.CSCValue}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Security code written on the card, sometimes called card security code (CSC)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SecurityCode = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardSecurityInformation1.CSCValue);
			elementContext_lazy = () -> PaymentCard.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecurityCode";
			definition = "Security code written on the card, sometimes called card security code (CSC).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Identifies a card inside a set of cards with the same number (or PAN).
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
	 * {@linkplain com.tools20022.repository.msg.PlainCardData1#CardSequenceNumber
	 * PlainCardData1.CardSequenceNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SequenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies a card inside a set of cards with the same number (or PAN)."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SequenceNumber = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PlainCardData1.CardSequenceNumber);
			elementContext_lazy = () -> PaymentCard.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SequenceNumber";
			definition = "Identifies a card inside a set of cards with the same number (or PAN).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Services attached to the card.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact3NumericText
	 * Exact3NumericText}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData1#ServiceCode
	 * PlainCardData1.ServiceCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServiceCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Services attached to the card."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ServiceCode = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PlainCardData1.ServiceCode);
			elementContext_lazy = () -> PaymentCard.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ServiceCode";
			definition = "Services attached to the card.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Exact3NumericText.mmObject();
		}
	};
	/**
	 * Card track content or equivalent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TrackData1#TrackValue
	 * TrackData1.TrackValue}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TrackValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Card track content or equivalent."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TrackValue = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TrackData1.TrackValue);
			elementContext_lazy = () -> PaymentCard.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TrackValue";
			definition = "Card track content or equivalent.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	/**
	 * Card Security Code management associated with the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CSCManagementCode
	 * CSCManagementCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardSecurityInformation1#CSCManagement
	 * CardSecurityInformation1.CSCManagement}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityCodeManagement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Card Security Code management associated with the transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SecurityCodeManagement = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardSecurityInformation1.CSCManagement);
			elementContext_lazy = () -> PaymentCard.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecurityCodeManagement";
			definition = "Card Security Code management associated with the transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CSCManagementCode.mmObject();
		}
	};
	/**
	 * Brand name of the card.
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
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard4#CardBrand
	 * PaymentCard4.CardBrand}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardBrand"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Brand name of the card."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CardBrand = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentCard4.CardBrand);
			elementContext_lazy = () -> PaymentCard.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CardBrand";
			definition = "Brand name of the card.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Account linked to the card.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#RelatedPaymentCard
	 * CashAccount.RelatedPaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccount
	 * CashAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction2#PrePaidAccount
	 * CardTransaction2.PrePaidAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardEntry2#PrePaidAccount
	 * CardEntry2.PrePaidAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account linked to the card."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardTransaction2.PrePaidAccount, com.tools20022.repository.msg.CardEntry2.PrePaidAccount);
			elementContext_lazy = () -> PaymentCard.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedAccount";
			definition = "Account linked to the card.";
			minOccurs = 0;
			type_lazy = () -> CashAccount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.RelatedPaymentCard;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Defines a category of cards related the acceptance processing rules
	 * defined by the acquirer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max5NumericText
	 * Max5NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProfileNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines a category of cards related the acceptance processing rules defined by the acquirer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ProfileNumber = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PaymentCard.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProfileNumber";
			definition = "Defines a category of cards related the acceptance processing rules defined by the acquirer.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max5NumericText.mmObject();
		}
	};
	/**
	 * Type of cardholder account used for the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountTypeCode
	 * CardAccountTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedAccountType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of cardholder account used for the transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RelatedAccountType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PaymentCard.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedAccountType";
			definition = "Type of cardholder account used for the transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CardAccountTypeCode.mmObject();
		}
	};
	/**
	 * Monetary value of the credit available for this financial card.
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
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditAvailableAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Monetary value of the credit available for this financial card."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CreditAvailableAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PaymentCard.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditAvailableAmount";
			definition = "Monetary value of the credit available for this financial card.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Limit specified on a payment card.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Limit#RelatedPaymentCard
	 * Limit.RelatedPaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Limit Limit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Limit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Limit specified on a payment card."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Limit = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentCard.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Limit";
			definition = "Limit specified on a payment card.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Limit.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Limit.RelatedPaymentCard;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Currency code of the card issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardCurrencyCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency code of the card issuer."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CardCurrencyCode = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PaymentCard.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CardCurrencyCode";
			definition = "Currency code of the card issuer.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Interest applied on amounts due for credit card payments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Interest#RelatedPaymentCard
	 * Interest.RelatedPaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Interest Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Interest applied on amounts due for credit card payments."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Interest = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentCard.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Interest";
			definition = "Interest applied on amounts due for credit card payments.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Interest.RelatedPaymentCard;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Country code attached to the card by the card issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Country#RelatedPaymentCard
	 * Country.RelatedPaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Country Country}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard4#CardCountryCode
	 * PaymentCard4.CardCountryCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardCountryCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country code attached to the card by the card issuer."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CardCountryCode = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentCard4.CardCountryCode);
			elementContext_lazy = () -> PaymentCard.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CardCountryCode";
			definition = "Country code attached to the card by the card issuer.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Country.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Country.RelatedPaymentCard;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * The card programme associated by a retailer to a cardholder among a
	 * series of payment programmes offered by the retailer.
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
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardProgramme"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The card programme associated by a retailer to a cardholder among a series of payment programmes offered by the retailer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CardProgramme = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PaymentCard.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CardProgramme";
			definition = "The card programme associated by a retailer to a cardholder among a series of payment programmes offered by the retailer.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PaymentCard";
				definition = "Electronic money product that provides the cardholder with a portable and specialised computer device that typically contains a microprocessor.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Country.RelatedPaymentCard, com.tools20022.repository.entity.CashAccount.RelatedPaymentCard,
						com.tools20022.repository.entity.CardPayment.PaymentCard, com.tools20022.repository.entity.Limit.RelatedPaymentCard, com.tools20022.repository.entity.Interest.RelatedPaymentCard);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PlainCardData1.TrackData, com.tools20022.repository.msg.PlainCardData1.CardSecurityCode, com.tools20022.repository.msg.PaymentCard4.PlainCardData);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentCard.Payment, com.tools20022.repository.entity.PaymentCard.Type, com.tools20022.repository.entity.PaymentCard.Number,
						com.tools20022.repository.entity.PaymentCard.StartDate, com.tools20022.repository.entity.PaymentCard.ExpiryDate, com.tools20022.repository.entity.PaymentCard.SecurityCode,
						com.tools20022.repository.entity.PaymentCard.SequenceNumber, com.tools20022.repository.entity.PaymentCard.ServiceCode, com.tools20022.repository.entity.PaymentCard.TrackValue,
						com.tools20022.repository.entity.PaymentCard.SecurityCodeManagement, com.tools20022.repository.entity.PaymentCard.CardBrand, com.tools20022.repository.entity.PaymentCard.RelatedAccount,
						com.tools20022.repository.entity.PaymentCard.ProfileNumber, com.tools20022.repository.entity.PaymentCard.RelatedAccountType, com.tools20022.repository.entity.PaymentCard.CreditAvailableAmount,
						com.tools20022.repository.entity.PaymentCard.Limit, com.tools20022.repository.entity.PaymentCard.CardCurrencyCode, com.tools20022.repository.entity.PaymentCard.Interest,
						com.tools20022.repository.entity.PaymentCard.CardCountryCode, com.tools20022.repository.entity.PaymentCard.CardProgramme);
				derivationComponent_lazy = () -> Arrays.asList(TrackData1.mmObject(), CardSecurityInformation1.mmObject(), PlainCardData1.mmObject(), PaymentCard4.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}