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
import com.tools20022.repository.codeset.CardAccountTypeCode;
import com.tools20022.repository.codeset.CardTypeCode;
import com.tools20022.repository.codeset.CSCManagementCode;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.*;
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
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#mmPayment
 * PaymentCard.mmPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#mmType
 * PaymentCard.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#mmNumber
 * PaymentCard.mmNumber}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#mmStartDate
 * PaymentCard.mmStartDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#mmExpiryDate
 * PaymentCard.mmExpiryDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#mmSecurityCode
 * PaymentCard.mmSecurityCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentCard#mmSequenceNumber
 * PaymentCard.mmSequenceNumber}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#mmServiceCode
 * PaymentCard.mmServiceCode}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#mmTrackValue
 * PaymentCard.mmTrackValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentCard#mmSecurityCodeManagement
 * PaymentCard.mmSecurityCodeManagement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#mmCardBrand
 * PaymentCard.mmCardBrand}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentCard#mmRelatedAccount
 * PaymentCard.mmRelatedAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#mmProfileNumber
 * PaymentCard.mmProfileNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentCard#mmRelatedAccountType
 * PaymentCard.mmRelatedAccountType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentCard#mmCreditAvailableAmount
 * PaymentCard.mmCreditAvailableAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#mmLimit
 * PaymentCard.mmLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentCard#mmCardCurrencyCode
 * PaymentCard.mmCardCurrencyCode}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#mmInterest
 * PaymentCard.mmInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentCard#mmCardCountryCode
 * PaymentCard.mmCardCountryCode}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#mmCardProgramme
 * PaymentCard.mmCardProgramme}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Country#mmRelatedPaymentCard
 * Country.mmRelatedPaymentCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#mmRelatedPaymentCard
 * CashAccount.mmRelatedPaymentCard}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CardPayment#mmPaymentCard
 * CardPayment.mmPaymentCard}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Limit#mmRelatedPaymentCard
 * Limit.mmRelatedPaymentCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#mmRelatedPaymentCard
 * Interest.mmRelatedPaymentCard}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData1#mmTrackData
 * PlainCardData1.mmTrackData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PlainCardData1#mmCardSecurityCode
 * PlainCardData1.mmCardSecurityCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard4#mmPlainCardData
 * PaymentCard4.mmPlainCardData}</li>
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
	protected CardPayment payment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#mmPaymentCard
	 * CardPayment.mmPaymentCard}</li>
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
	public static final MMBusinessAssociationEnd mmPayment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentCard.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Payment";
			definition = "Payment for which a payment card is used.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CardPayment.mmPaymentCard;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CardPayment.mmObject();
		}
	};
	protected CardTypeCode type;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute mmType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentCard.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Type of card, eg, credit card.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CardTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentCard.class.getMethod("getType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text number;
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
	 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData1#mmPAN
	 * PlainCardData1.mmPAN}</li>
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
	public static final MMBusinessAttribute mmNumber = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PlainCardData1.mmPAN);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentCard.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Number";
			definition = "Number embossed on a card that links the card to the account owner and account servicer (sometimes called personal account number or PAN).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentCard.class.getMethod("getNumber", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISOYearMonth startDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.PlainCardData1#mmEffectiveDate
	 * PlainCardData1.mmEffectiveDate}</li>
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
	public static final MMBusinessAttribute mmStartDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PlainCardData1.mmEffectiveDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentCard.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StartDate";
			definition = "Year and month the card is available for use.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISOYearMonth.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentCard.class.getMethod("getStartDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISOYearMonth expiryDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.PlainCardData1#mmExpiryDate
	 * PlainCardData1.mmExpiryDate}</li>
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
	public static final MMBusinessAttribute mmExpiryDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PlainCardData1.mmExpiryDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentCard.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExpiryDate";
			definition = "Year and month the card expires.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISOYearMonth.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentCard.class.getMethod("getExpiryDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text securityCode;
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
	 * {@linkplain com.tools20022.repository.msg.CardSecurityInformation1#mmCSCValue
	 * CardSecurityInformation1.mmCSCValue}</li>
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
	public static final MMBusinessAttribute mmSecurityCode = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CardSecurityInformation1.mmCSCValue);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentCard.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecurityCode";
			definition = "Security code written on the card, sometimes called card security code (CSC).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentCard.class.getMethod("getSecurityCode", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text sequenceNumber;
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
	 * {@linkplain com.tools20022.repository.msg.PlainCardData1#mmCardSequenceNumber
	 * PlainCardData1.mmCardSequenceNumber}</li>
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
	public static final MMBusinessAttribute mmSequenceNumber = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PlainCardData1.mmCardSequenceNumber);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentCard.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SequenceNumber";
			definition = "Identifies a card inside a set of cards with the same number (or PAN).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentCard.class.getMethod("getSequenceNumber", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Exact3NumericText serviceCode;
	/**
	 * 
	 <p>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData1#mmServiceCode
	 * PlainCardData1.mmServiceCode}</li>
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
	public static final MMBusinessAttribute mmServiceCode = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PlainCardData1.mmServiceCode);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentCard.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ServiceCode";
			definition = "Services attached to the card.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Exact3NumericText.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentCard.class.getMethod("getServiceCode", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max140Text trackValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TrackData1#mmTrackValue
	 * TrackData1.mmTrackValue}</li>
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
	public static final MMBusinessAttribute mmTrackValue = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TrackData1.mmTrackValue);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentCard.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TrackValue";
			definition = "Card track content or equivalent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentCard.class.getMethod("getTrackValue", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CSCManagementCode securityCodeManagement;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CardSecurityInformation1#mmCSCManagement
	 * CardSecurityInformation1.mmCSCManagement}</li>
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
	public static final MMBusinessAttribute mmSecurityCodeManagement = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CardSecurityInformation1.mmCSCManagement);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentCard.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecurityCodeManagement";
			definition = "Card Security Code management associated with the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CSCManagementCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentCard.class.getMethod("getSecurityCodeManagement", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text cardBrand;
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
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard4#mmCardBrand
	 * PaymentCard4.mmCardBrand}</li>
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
	public static final MMBusinessAttribute mmCardBrand = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentCard4.mmCardBrand);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentCard.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CardBrand";
			definition = "Brand name of the card.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentCard.class.getMethod("getCardBrand", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.CashAccount> relatedAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmRelatedPaymentCard
	 * CashAccount.mmRelatedPaymentCard}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardTransaction2#mmPrePaidAccount
	 * CardTransaction2.mmPrePaidAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardEntry2#mmPrePaidAccount
	 * CardEntry2.mmPrePaidAccount}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CardTransaction2.mmPrePaidAccount, CardEntry2.mmPrePaidAccount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentCard.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedAccount";
			definition = "Account linked to the card.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.mmRelatedPaymentCard;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccount.mmObject();
		}
	};
	protected Max5NumericText profileNumber;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute mmProfileNumber = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentCard.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProfileNumber";
			definition = "Defines a category of cards related the acceptance processing rules defined by the acquirer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max5NumericText.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentCard.class.getMethod("getProfileNumber", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CardAccountTypeCode relatedAccountType;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute mmRelatedAccountType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentCard.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedAccountType";
			definition = "Type of cardholder account used for the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CardAccountTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentCard.class.getMethod("getRelatedAccountType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount creditAvailableAmount;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute mmCreditAvailableAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentCard.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreditAvailableAmount";
			definition = "Monetary value of the credit available for this financial card.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentCard.class.getMethod("getCreditAvailableAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.Limit> limit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Limit#mmRelatedPaymentCard
	 * Limit.mmRelatedPaymentCard}</li>
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
	public static final MMBusinessAssociationEnd mmLimit = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentCard.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Limit";
			definition = "Limit specified on a payment card.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Limit.mmRelatedPaymentCard;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Limit.mmObject();
		}
	};
	protected CurrencyCode cardCurrencyCode;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute mmCardCurrencyCode = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentCard.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CardCurrencyCode";
			definition = "Currency code of the card issuer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentCard.class.getMethod("getCardCurrencyCode", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Interest interest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmRelatedPaymentCard
	 * Interest.mmRelatedPaymentCard}</li>
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
	public static final MMBusinessAssociationEnd mmInterest = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentCard.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Interest";
			definition = "Interest applied on amounts due for credit card payments.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Interest.mmRelatedPaymentCard;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
		}
	};
	protected Country cardCountryCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Country#mmRelatedPaymentCard
	 * Country.mmRelatedPaymentCard}</li>
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
	 * {@linkplain com.tools20022.repository.msg.PaymentCard4#mmCardCountryCode
	 * PaymentCard4.mmCardCountryCode}</li>
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
	public static final MMBusinessAssociationEnd mmCardCountryCode = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentCard4.mmCardCountryCode);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentCard.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CardCountryCode";
			definition = "Country code attached to the card by the card issuer.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Country.mmRelatedPaymentCard;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Country.mmObject();
		}
	};
	protected Max35Text cardProgramme;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute mmCardProgramme = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentCard.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CardProgramme";
			definition = "The card programme associated by a retailer to a cardholder among a series of payment programmes offered by the retailer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentCard.class.getMethod("getCardProgramme", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentCard";
				definition = "Electronic money product that provides the cardholder with a portable and specialised computer device that typically contains a microprocessor.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Country.mmRelatedPaymentCard, com.tools20022.repository.entity.CashAccount.mmRelatedPaymentCard,
						com.tools20022.repository.entity.CardPayment.mmPaymentCard, com.tools20022.repository.entity.Limit.mmRelatedPaymentCard, com.tools20022.repository.entity.Interest.mmRelatedPaymentCard);
				derivationElement_lazy = () -> Arrays.asList(PlainCardData1.mmTrackData, PlainCardData1.mmCardSecurityCode, PaymentCard4.mmPlainCardData);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentCard.mmPayment, com.tools20022.repository.entity.PaymentCard.mmType, com.tools20022.repository.entity.PaymentCard.mmNumber,
						com.tools20022.repository.entity.PaymentCard.mmStartDate, com.tools20022.repository.entity.PaymentCard.mmExpiryDate, com.tools20022.repository.entity.PaymentCard.mmSecurityCode,
						com.tools20022.repository.entity.PaymentCard.mmSequenceNumber, com.tools20022.repository.entity.PaymentCard.mmServiceCode, com.tools20022.repository.entity.PaymentCard.mmTrackValue,
						com.tools20022.repository.entity.PaymentCard.mmSecurityCodeManagement, com.tools20022.repository.entity.PaymentCard.mmCardBrand, com.tools20022.repository.entity.PaymentCard.mmRelatedAccount,
						com.tools20022.repository.entity.PaymentCard.mmProfileNumber, com.tools20022.repository.entity.PaymentCard.mmRelatedAccountType, com.tools20022.repository.entity.PaymentCard.mmCreditAvailableAmount,
						com.tools20022.repository.entity.PaymentCard.mmLimit, com.tools20022.repository.entity.PaymentCard.mmCardCurrencyCode, com.tools20022.repository.entity.PaymentCard.mmInterest,
						com.tools20022.repository.entity.PaymentCard.mmCardCountryCode, com.tools20022.repository.entity.PaymentCard.mmCardProgramme);
				derivationComponent_lazy = () -> Arrays.asList(TrackData1.mmObject(), CardSecurityInformation1.mmObject(), PlainCardData1.mmObject(), PaymentCard4.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return PaymentCard.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<CardPayment> getPayment() {
		return payment == null ? Optional.empty() : Optional.of(payment);
	}

	public PaymentCard setPayment(com.tools20022.repository.entity.CardPayment payment) {
		this.payment = payment;
		return this;
	}

	public CardTypeCode getType() {
		return type;
	}

	public PaymentCard setType(CardTypeCode type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public Max35Text getNumber() {
		return number;
	}

	public PaymentCard setNumber(Max35Text number) {
		this.number = Objects.requireNonNull(number);
		return this;
	}

	public ISOYearMonth getStartDate() {
		return startDate;
	}

	public PaymentCard setStartDate(ISOYearMonth startDate) {
		this.startDate = Objects.requireNonNull(startDate);
		return this;
	}

	public ISOYearMonth getExpiryDate() {
		return expiryDate;
	}

	public PaymentCard setExpiryDate(ISOYearMonth expiryDate) {
		this.expiryDate = Objects.requireNonNull(expiryDate);
		return this;
	}

	public Max35Text getSecurityCode() {
		return securityCode;
	}

	public PaymentCard setSecurityCode(Max35Text securityCode) {
		this.securityCode = Objects.requireNonNull(securityCode);
		return this;
	}

	public Max35Text getSequenceNumber() {
		return sequenceNumber;
	}

	public PaymentCard setSequenceNumber(Max35Text sequenceNumber) {
		this.sequenceNumber = Objects.requireNonNull(sequenceNumber);
		return this;
	}

	public Exact3NumericText getServiceCode() {
		return serviceCode;
	}

	public PaymentCard setServiceCode(Exact3NumericText serviceCode) {
		this.serviceCode = Objects.requireNonNull(serviceCode);
		return this;
	}

	public Max140Text getTrackValue() {
		return trackValue;
	}

	public PaymentCard setTrackValue(Max140Text trackValue) {
		this.trackValue = Objects.requireNonNull(trackValue);
		return this;
	}

	public CSCManagementCode getSecurityCodeManagement() {
		return securityCodeManagement;
	}

	public PaymentCard setSecurityCodeManagement(CSCManagementCode securityCodeManagement) {
		this.securityCodeManagement = Objects.requireNonNull(securityCodeManagement);
		return this;
	}

	public Max35Text getCardBrand() {
		return cardBrand;
	}

	public PaymentCard setCardBrand(Max35Text cardBrand) {
		this.cardBrand = Objects.requireNonNull(cardBrand);
		return this;
	}

	public List<CashAccount> getRelatedAccount() {
		return relatedAccount == null ? relatedAccount = new ArrayList<>() : relatedAccount;
	}

	public PaymentCard setRelatedAccount(List<com.tools20022.repository.entity.CashAccount> relatedAccount) {
		this.relatedAccount = Objects.requireNonNull(relatedAccount);
		return this;
	}

	public Max5NumericText getProfileNumber() {
		return profileNumber;
	}

	public PaymentCard setProfileNumber(Max5NumericText profileNumber) {
		this.profileNumber = Objects.requireNonNull(profileNumber);
		return this;
	}

	public CardAccountTypeCode getRelatedAccountType() {
		return relatedAccountType;
	}

	public PaymentCard setRelatedAccountType(CardAccountTypeCode relatedAccountType) {
		this.relatedAccountType = Objects.requireNonNull(relatedAccountType);
		return this;
	}

	public CurrencyAndAmount getCreditAvailableAmount() {
		return creditAvailableAmount;
	}

	public PaymentCard setCreditAvailableAmount(CurrencyAndAmount creditAvailableAmount) {
		this.creditAvailableAmount = Objects.requireNonNull(creditAvailableAmount);
		return this;
	}

	public List<Limit> getLimit() {
		return limit == null ? limit = new ArrayList<>() : limit;
	}

	public PaymentCard setLimit(List<com.tools20022.repository.entity.Limit> limit) {
		this.limit = Objects.requireNonNull(limit);
		return this;
	}

	public CurrencyCode getCardCurrencyCode() {
		return cardCurrencyCode;
	}

	public PaymentCard setCardCurrencyCode(CurrencyCode cardCurrencyCode) {
		this.cardCurrencyCode = Objects.requireNonNull(cardCurrencyCode);
		return this;
	}

	public Interest getInterest() {
		return interest;
	}

	public PaymentCard setInterest(com.tools20022.repository.entity.Interest interest) {
		this.interest = Objects.requireNonNull(interest);
		return this;
	}

	public Country getCardCountryCode() {
		return cardCountryCode;
	}

	public PaymentCard setCardCountryCode(com.tools20022.repository.entity.Country cardCountryCode) {
		this.cardCountryCode = Objects.requireNonNull(cardCountryCode);
		return this;
	}

	public Max35Text getCardProgramme() {
		return cardProgramme;
	}

	public PaymentCard setCardProgramme(Max35Text cardProgramme) {
		this.cardProgramme = Objects.requireNonNull(cardProgramme);
		return this;
	}
}