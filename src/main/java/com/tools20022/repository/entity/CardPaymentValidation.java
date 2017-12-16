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
import com.tools20022.repository.codeset.CardholderAddressVerificationResultCode;
import com.tools20022.repository.codeset.CSCResultCode;
import com.tools20022.repository.codeset.FailureReasonCode;
import com.tools20022.repository.codeset.OnLineReasonCode;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max500Text;
import com.tools20022.repository.datatype.Min6Max8Text;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Results and parameters of the card payment verification.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CardPaymentValidation"
 * src="doc-files/CardPaymentValidation.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#mmTransactionSuccess
 * CardPaymentValidation.mmTransactionSuccess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#mmMerchantOverride
 * CardPaymentValidation.mmMerchantOverride}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#mmValidityDate
 * CardPaymentValidation.mmValidityDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#mmCardPayment
 * CardPaymentValidation.mmCardPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#mmResponse
 * CardPaymentValidation.mmResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#mmAuthorisationCode
 * CardPaymentValidation.mmAuthorisationCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#mmOnLineReason
 * CardPaymentValidation.mmOnLineReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#mmBalance
 * CardPaymentValidation.mmBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#mmCardholderAddressVerificationResult
 * CardPaymentValidation.mmCardholderAddressVerificationResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#mmCSCResult
 * CardPaymentValidation.mmCSCResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#mmDeclinedProductCode
 * CardPaymentValidation.mmDeclinedProductCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#mmElectronicCommerceAuthenticationResult
 * CardPaymentValidation.mmElectronicCommerceAuthenticationResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#mmFailureReason
 * CardPaymentValidation.mmFailureReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#mmSignature
 * CardPaymentValidation.mmSignature}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashBalance#mmRelatedCardPaymentValidationProcess
 * CashBalance.mmRelatedCardPaymentValidationProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Signature#mmCardPaymentValidation
 * Signature.mmCardPaymentValidation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmValidation
 * CardPaymentAcquiring.mmValidation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductCategory#mmRelatedCardPaymentValidation
 * ProductCategory.mmRelatedCardPaymentValidation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Response#mmRelatedCardPaymentValidation
 * Response.mmRelatedCardPaymentValidation}</li>
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
 * "CardPaymentValidation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Results and parameters of the card payment verification."</li>
 * </ul>
 */
public class CardPaymentValidation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected TrueFalseIndicator transactionSuccess;
	/**
	 * Outcome of the transaction at the acceptor.
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
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation
	 * CardPaymentValidation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionSuccess"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Outcome of the transaction at the acceptor."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTransactionSuccess = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPaymentValidation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransactionSuccess";
			definition = "Outcome of the transaction at the acceptor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CardPaymentValidation.class.getMethod("getTransactionSuccess", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TrueFalseIndicator merchantOverride;
	/**
	 * Indicate that the acceptor has forced the transaction in spite of the
	 * authorisation result (online or offline), or incident to complete the
	 * transaction.
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
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation
	 * CardPaymentValidation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MerchantOverride"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicate that the acceptor has forced the transaction in spite of the authorisation result (online or offline), or incident to complete the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMerchantOverride = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPaymentValidation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MerchantOverride";
			definition = "Indicate that the acceptor has forced the transaction in spite of the authorisation result (online or offline), or incident to complete the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CardPaymentValidation.class.getMethod("getMerchantOverride", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODate validityDate;
	/**
	 * Transaction authorisation deadline to complete the related payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation
	 * CardPaymentValidation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidityDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction authorisation deadline to complete the related payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmValidityDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPaymentValidation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ValidityDate";
			definition = "Transaction authorisation deadline to complete the related payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CardPaymentValidation.class.getMethod("getValidityDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CardPaymentAcquiring cardPayment;
	/**
	 * Card payment to which the validation process applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmValidation
	 * CardPaymentAcquiring.mmValidation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation
	 * CardPaymentValidation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Card payment to which the validation process applies."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCardPayment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPaymentValidation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CardPayment";
			definition = "Card payment to which the validation process applies.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.mmValidation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Response> response;
	/**
	 * Response to an authorisation request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Response#mmRelatedCardPaymentValidation
	 * Response.mmRelatedCardPaymentValidation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Response Response}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation
	 * CardPaymentValidation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Response"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Response to an authorisation request."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmResponse = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPaymentValidation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Response";
			definition = "Response to an authorisation request.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Response.mmRelatedCardPaymentValidation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Response.mmObject();
		}
	};
	protected Min6Max8Text authorisationCode;
	/**
	 * Value assigned by the authorising party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Min6Max8Text Min6Max8Text}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation
	 * CardPaymentValidation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthorisationCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value assigned by the authorising party."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAuthorisationCode = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPaymentValidation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AuthorisationCode";
			definition = "Value assigned by the authorising party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Min6Max8Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CardPaymentValidation.class.getMethod("getAuthorisationCode", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected OnLineReasonCode onLineReason;
	/**
	 * Reason to process an online authorisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OnLineReasonCode
	 * OnLineReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation
	 * CardPaymentValidation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnLineReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason to process an online authorisation."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmOnLineReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPaymentValidation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OnLineReason";
			definition = "Reason to process an online authorisation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OnLineReasonCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CardPaymentValidation.class.getMethod("getOnLineReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CashBalance balance;
	/**
	 * Balance of the account attached to the payment card.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashBalance#mmRelatedCardPaymentValidationProcess
	 * CashBalance.mmRelatedCardPaymentValidationProcess}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashBalance
	 * CashBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation
	 * CardPaymentValidation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Balance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance of the account attached to the payment card."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmBalance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPaymentValidation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Balance";
			definition = "Balance of the account attached to the payment card.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashBalance.mmRelatedCardPaymentValidationProcess;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashBalance.mmObject();
		}
	};
	protected CardholderAddressVerificationResultCode cardholderAddressVerificationResult;
	/**
	 * Result of the cardholder verification address checks on the street number
	 * and the postal code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderAddressVerificationResultCode
	 * CardholderAddressVerificationResultCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation
	 * CardPaymentValidation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardholderAddressVerificationResult"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Result of the cardholder verification address checks on the street number and the postal code."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCardholderAddressVerificationResult = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPaymentValidation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CardholderAddressVerificationResult";
			definition = "Result of the cardholder verification address checks on the street number and the postal code.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CardholderAddressVerificationResultCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CardPaymentValidation.class.getMethod("getCardholderAddressVerificationResult", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CSCResultCode cSCResult;
	/**
	 * Result of the printed CSC (Card Security Code) validation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CSCResultCode
	 * CSCResultCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation
	 * CardPaymentValidation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSCResult"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Result of the printed CSC (Card Security Code) validation."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCSCResult = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPaymentValidation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CSCResult";
			definition = "Result of the printed CSC (Card Security Code) validation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CSCResultCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CardPaymentValidation.class.getMethod("getCSCResult", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.ProductCategory> declinedProductCode;
	/**
	 * Product code for which the payment authorisation was declined.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductCategory#mmRelatedCardPaymentValidation
	 * ProductCategory.mmRelatedCardPaymentValidation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ProductCategory
	 * ProductCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation
	 * CardPaymentValidation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclinedProductCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Product code for which the payment authorisation was declined."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmDeclinedProductCode = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPaymentValidation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeclinedProductCode";
			definition = "Product code for which the payment authorisation was declined.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ProductCategory.mmRelatedCardPaymentValidation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ProductCategory.mmObject();
		}
	};
	protected Max500Text electronicCommerceAuthenticationResult;
	/**
	 * Result of an e-commerce authentication process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max500Text
	 * Max500Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation
	 * CardPaymentValidation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectronicCommerceAuthenticationResult"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Result of an e-commerce authentication process."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmElectronicCommerceAuthenticationResult = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPaymentValidation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ElectronicCommerceAuthenticationResult";
			definition = "Result of an e-commerce authentication process.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max500Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CardPaymentValidation.class.getMethod("getElectronicCommerceAuthenticationResult", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected FailureReasonCode failureReason;
	/**
	 * Incident occuring during the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReasonCode
	 * FailureReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation
	 * CardPaymentValidation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FailureReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Incident occuring during the transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmFailureReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPaymentValidation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FailureReason";
			definition = "Incident occuring during the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FailureReasonCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CardPaymentValidation.class.getMethod("getFailureReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.Signature> signature;
	/**
	 * Signature of the message to display or print.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Signature#mmCardPaymentValidation
	 * Signature.mmCardPaymentValidation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Signature Signature}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation
	 * CardPaymentValidation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Signature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Signature of the message to display or print."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSignature = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPaymentValidation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Signature";
			definition = "Signature of the message to display or print.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Signature.mmCardPaymentValidation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Signature.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardPaymentValidation";
				definition = "Results and parameters of the card payment verification.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashBalance.mmRelatedCardPaymentValidationProcess, com.tools20022.repository.entity.Signature.mmCardPaymentValidation,
						com.tools20022.repository.entity.CardPaymentAcquiring.mmValidation, com.tools20022.repository.entity.ProductCategory.mmRelatedCardPaymentValidation,
						com.tools20022.repository.entity.Response.mmRelatedCardPaymentValidation);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CardPaymentValidation.mmTransactionSuccess, com.tools20022.repository.entity.CardPaymentValidation.mmMerchantOverride,
						com.tools20022.repository.entity.CardPaymentValidation.mmValidityDate, com.tools20022.repository.entity.CardPaymentValidation.mmCardPayment, com.tools20022.repository.entity.CardPaymentValidation.mmResponse,
						com.tools20022.repository.entity.CardPaymentValidation.mmAuthorisationCode, com.tools20022.repository.entity.CardPaymentValidation.mmOnLineReason, com.tools20022.repository.entity.CardPaymentValidation.mmBalance,
						com.tools20022.repository.entity.CardPaymentValidation.mmCardholderAddressVerificationResult, com.tools20022.repository.entity.CardPaymentValidation.mmCSCResult,
						com.tools20022.repository.entity.CardPaymentValidation.mmDeclinedProductCode, com.tools20022.repository.entity.CardPaymentValidation.mmElectronicCommerceAuthenticationResult,
						com.tools20022.repository.entity.CardPaymentValidation.mmFailureReason, com.tools20022.repository.entity.CardPaymentValidation.mmSignature);
			}

			@Override
			public Class<?> getInstanceClass() {
				return CardPaymentValidation.class;
			}
		});
		return mmObject_lazy.get();
	}

	public TrueFalseIndicator getTransactionSuccess() {
		return transactionSuccess;
	}

	public void setTransactionSuccess(TrueFalseIndicator transactionSuccess) {
		this.transactionSuccess = transactionSuccess;
	}

	public TrueFalseIndicator getMerchantOverride() {
		return merchantOverride;
	}

	public void setMerchantOverride(TrueFalseIndicator merchantOverride) {
		this.merchantOverride = merchantOverride;
	}

	public ISODate getValidityDate() {
		return validityDate;
	}

	public void setValidityDate(ISODate validityDate) {
		this.validityDate = validityDate;
	}

	public CardPaymentAcquiring getCardPayment() {
		return cardPayment;
	}

	public void setCardPayment(com.tools20022.repository.entity.CardPaymentAcquiring cardPayment) {
		this.cardPayment = cardPayment;
	}

	public List<Response> getResponse() {
		return response;
	}

	public void setResponse(List<com.tools20022.repository.entity.Response> response) {
		this.response = response;
	}

	public Min6Max8Text getAuthorisationCode() {
		return authorisationCode;
	}

	public void setAuthorisationCode(Min6Max8Text authorisationCode) {
		this.authorisationCode = authorisationCode;
	}

	public OnLineReasonCode getOnLineReason() {
		return onLineReason;
	}

	public void setOnLineReason(OnLineReasonCode onLineReason) {
		this.onLineReason = onLineReason;
	}

	public CashBalance getBalance() {
		return balance;
	}

	public void setBalance(com.tools20022.repository.entity.CashBalance balance) {
		this.balance = balance;
	}

	public CardholderAddressVerificationResultCode getCardholderAddressVerificationResult() {
		return cardholderAddressVerificationResult;
	}

	public void setCardholderAddressVerificationResult(CardholderAddressVerificationResultCode cardholderAddressVerificationResult) {
		this.cardholderAddressVerificationResult = cardholderAddressVerificationResult;
	}

	public CSCResultCode getCSCResult() {
		return cSCResult;
	}

	public void setCSCResult(CSCResultCode cSCResult) {
		this.cSCResult = cSCResult;
	}

	public List<ProductCategory> getDeclinedProductCode() {
		return declinedProductCode;
	}

	public void setDeclinedProductCode(List<com.tools20022.repository.entity.ProductCategory> declinedProductCode) {
		this.declinedProductCode = declinedProductCode;
	}

	public Max500Text getElectronicCommerceAuthenticationResult() {
		return electronicCommerceAuthenticationResult;
	}

	public void setElectronicCommerceAuthenticationResult(Max500Text electronicCommerceAuthenticationResult) {
		this.electronicCommerceAuthenticationResult = electronicCommerceAuthenticationResult;
	}

	public FailureReasonCode getFailureReason() {
		return failureReason;
	}

	public void setFailureReason(FailureReasonCode failureReason) {
		this.failureReason = failureReason;
	}

	public List<Signature> getSignature() {
		return signature;
	}

	public void setSignature(List<com.tools20022.repository.entity.Signature> signature) {
		this.signature = signature;
	}
}