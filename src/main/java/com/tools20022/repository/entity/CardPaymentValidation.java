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
import com.tools20022.repository.codeset.CardholderAddressVerificationResultCode;
import com.tools20022.repository.codeset.CSCResultCode;
import com.tools20022.repository.codeset.FailureReasonCode;
import com.tools20022.repository.codeset.OnLineReasonCode;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max500Text;
import com.tools20022.repository.datatype.Min6Max8Text;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#TransactionSuccess
 * CardPaymentValidation.TransactionSuccess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#MerchantOverride
 * CardPaymentValidation.MerchantOverride}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#ValidityDate
 * CardPaymentValidation.ValidityDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#CardPayment
 * CardPaymentValidation.CardPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#Response
 * CardPaymentValidation.Response}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#AuthorisationCode
 * CardPaymentValidation.AuthorisationCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#OnLineReason
 * CardPaymentValidation.OnLineReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#Balance
 * CardPaymentValidation.Balance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#CardholderAddressVerificationResult
 * CardPaymentValidation.CardholderAddressVerificationResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#CSCResult
 * CardPaymentValidation.CSCResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#DeclinedProductCode
 * CardPaymentValidation.DeclinedProductCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#ElectronicCommerceAuthenticationResult
 * CardPaymentValidation.ElectronicCommerceAuthenticationResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#FailureReason
 * CardPaymentValidation.FailureReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#Signature
 * CardPaymentValidation.Signature}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashBalance#RelatedCardPaymentValidationProcess
 * CashBalance.RelatedCardPaymentValidationProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Signature#CardPaymentValidation
 * Signature.CardPaymentValidation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#Validation
 * CardPaymentAcquiring.Validation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductCategory#RelatedCardPaymentValidation
 * ProductCategory.RelatedCardPaymentValidation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Response#RelatedCardPaymentValidation
 * Response.RelatedCardPaymentValidation}</li>
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
 * "CardPaymentValidation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Results and parameters of the card payment verification."</li>
 * </ul>
 */
public class CardPaymentValidation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
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
	public static final MMBusinessAttribute TransactionSuccess = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CardPaymentValidation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransactionSuccess";
			definition = "Outcome of the transaction at the acceptor.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
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
	public static final MMBusinessAttribute MerchantOverride = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CardPaymentValidation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MerchantOverride";
			definition = "Indicate that the acceptor has forced the transaction in spite of the authorisation result (online or offline), or incident to complete the transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
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
	public static final MMBusinessAttribute ValidityDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CardPaymentValidation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValidityDate";
			definition = "Transaction authorisation deadline to complete the related payment.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Card payment to which the validation process applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#Validation
	 * CardPaymentAcquiring.Validation}</li>
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
	public static final MMBusinessAssociationEnd CardPayment = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CardPaymentValidation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CardPayment";
			definition = "Card payment to which the validation process applies.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CardPaymentAcquiring.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.Validation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Response to an authorisation request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Response#RelatedCardPaymentValidation
	 * Response.RelatedCardPaymentValidation}</li>
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
	public static final MMBusinessAssociationEnd Response = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CardPaymentValidation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Response";
			definition = "Response to an authorisation request.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Response.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Response.RelatedCardPaymentValidation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	public static final MMBusinessAttribute AuthorisationCode = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CardPaymentValidation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AuthorisationCode";
			definition = "Value assigned by the authorising party.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Min6Max8Text.mmObject();
		}
	};
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
	public static final MMBusinessAttribute OnLineReason = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CardPaymentValidation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OnLineReason";
			definition = "Reason to process an online authorisation.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> OnLineReasonCode.mmObject();
		}
	};
	/**
	 * Balance of the account attached to the payment card.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashBalance#RelatedCardPaymentValidationProcess
	 * CashBalance.RelatedCardPaymentValidationProcess}</li>
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
	public static final MMBusinessAssociationEnd Balance = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CardPaymentValidation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Balance";
			definition = "Balance of the account attached to the payment card.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CashBalance.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashBalance.RelatedCardPaymentValidationProcess;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	public static final MMBusinessAttribute CardholderAddressVerificationResult = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CardPaymentValidation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CardholderAddressVerificationResult";
			definition = "Result of the cardholder verification address checks on the street number and the postal code.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CardholderAddressVerificationResultCode.mmObject();
		}
	};
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
	public static final MMBusinessAttribute CSCResult = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CardPaymentValidation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CSCResult";
			definition = "Result of the printed CSC (Card Security Code) validation.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CSCResultCode.mmObject();
		}
	};
	/**
	 * Product code for which the payment authorisation was declined.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductCategory#RelatedCardPaymentValidation
	 * ProductCategory.RelatedCardPaymentValidation}</li>
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
	public static final MMBusinessAssociationEnd DeclinedProductCode = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CardPaymentValidation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DeclinedProductCode";
			definition = "Product code for which the payment authorisation was declined.";
			minOccurs = 0;
			type_lazy = () -> ProductCategory.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ProductCategory.RelatedCardPaymentValidation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	public static final MMBusinessAttribute ElectronicCommerceAuthenticationResult = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CardPaymentValidation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ElectronicCommerceAuthenticationResult";
			definition = "Result of an e-commerce authentication process.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max500Text.mmObject();
		}
	};
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
	public static final MMBusinessAttribute FailureReason = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CardPaymentValidation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FailureReason";
			definition = "Incident occuring during the transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> FailureReasonCode.mmObject();
		}
	};
	/**
	 * Signature of the message to display or print.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Signature#CardPaymentValidation
	 * Signature.CardPaymentValidation}</li>
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
	public static final MMBusinessAssociationEnd Signature = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CardPaymentValidation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Signature";
			definition = "Signature of the message to display or print.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Signature.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Signature.CardPaymentValidation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CardPaymentValidation";
				definition = "Results and parameters of the card payment verification.";
				associationDomain_lazy = () -> Arrays
						.asList(com.tools20022.repository.entity.CashBalance.RelatedCardPaymentValidationProcess, com.tools20022.repository.entity.Signature.CardPaymentValidation,
								com.tools20022.repository.entity.CardPaymentAcquiring.Validation, com.tools20022.repository.entity.ProductCategory.RelatedCardPaymentValidation,
								com.tools20022.repository.entity.Response.RelatedCardPaymentValidation);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CardPaymentValidation.TransactionSuccess, com.tools20022.repository.entity.CardPaymentValidation.MerchantOverride,
						com.tools20022.repository.entity.CardPaymentValidation.ValidityDate, com.tools20022.repository.entity.CardPaymentValidation.CardPayment, com.tools20022.repository.entity.CardPaymentValidation.Response,
						com.tools20022.repository.entity.CardPaymentValidation.AuthorisationCode, com.tools20022.repository.entity.CardPaymentValidation.OnLineReason, com.tools20022.repository.entity.CardPaymentValidation.Balance,
						com.tools20022.repository.entity.CardPaymentValidation.CardholderAddressVerificationResult, com.tools20022.repository.entity.CardPaymentValidation.CSCResult,
						com.tools20022.repository.entity.CardPaymentValidation.DeclinedProductCode, com.tools20022.repository.entity.CardPaymentValidation.ElectronicCommerceAuthenticationResult,
						com.tools20022.repository.entity.CardPaymentValidation.FailureReason, com.tools20022.repository.entity.CardPaymentValidation.Signature);
			}
		});
		return mmObject_lazy.get();
	}
}