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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Method used to authenticate a cardholder.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode#UnknownMethod
 * AuthenticationMethodCode.UnknownMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode#Bypass
 * AuthenticationMethodCode.Bypass}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode#OnLinePIN
 * AuthenticationMethodCode.OnLinePIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode#OfflinePIN
 * AuthenticationMethodCode.OfflinePIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode#SignatureCapture
 * AuthenticationMethodCode.SignatureCapture}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode#PaperSignature
 * AuthenticationMethodCode.PaperSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode#ManualVerification
 * AuthenticationMethodCode.ManualVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode#MerchantAuthentication
 * AuthenticationMethodCode.MerchantAuthentication}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode#SecureCertificate
 * AuthenticationMethodCode.SecureCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode#SecureNoCertificate
 * AuthenticationMethodCode.SecureNoCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode#SecuredChannel
 * AuthenticationMethodCode.SecuredChannel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode#Password
 * AuthenticationMethodCode.Password}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode#BillingAddressVerification
 * AuthenticationMethodCode.BillingAddressVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode#Biometry
 * AuthenticationMethodCode.Biometry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode#CardholderIdentificationData
 * AuthenticationMethodCode.CardholderIdentificationData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode#CryptogramVerification
 * AuthenticationMethodCode.CryptogramVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode#CSCVerification
 * AuthenticationMethodCode.CSCVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode#PassiveAuthentication
 * AuthenticationMethodCode.PassiveAuthentication}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode#SecureElectronicCommerce
 * AuthenticationMethodCode.SecureElectronicCommerce}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode#ShippingAddressVerification
 * AuthenticationMethodCode.ShippingAddressVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode#TokenAuthentication
 * AuthenticationMethodCode.TokenAuthentication}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode#PaymentToken
 * AuthenticationMethodCode.PaymentToken}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode#AuthenticationToken
 * AuthenticationMethodCode.AuthenticationToken}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode#Mobile
 * AuthenticationMethodCode.Mobile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode#Other
 * AuthenticationMethodCode.Other}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.AuthenticationMethod1Code
 * AuthenticationMethod1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"UKNW"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AuthenticationMethodCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Method used to authenticate a cardholder."</li>
 * </ul>
 */
public class AuthenticationMethodCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Authentication method is performed unknown.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode
	 * AuthenticationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UKNW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnknownMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Authentication method is performed unknown."</li>
	 * </ul>
	 */
	public static final MMCode UnknownMethod = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnknownMethod";
			definition = "Authentication method is performed unknown.";
			owner_lazy = () -> AuthenticationMethodCode.mmObject();
			codeName = "UKNW";
		}
	};
	/**
	 * Authentication bypassed by the merchant.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode
	 * AuthenticationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BYPS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bypass"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Authentication bypassed by the merchant."</li>
	 * </ul>
	 */
	public static final MMCode Bypass = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Bypass";
			definition = "Authentication bypassed by the merchant.";
			owner_lazy = () -> AuthenticationMethodCode.mmObject();
			codeName = "BYPS";
		}
	};
	/**
	 * On-line PIN authentication (Personal Identification Number).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode
	 * AuthenticationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NPIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnLinePIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "On-line PIN  authentication (Personal Identification Number)."</li>
	 * </ul>
	 */
	public static final MMCode OnLinePIN = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OnLinePIN";
			definition = "On-line PIN  authentication (Personal Identification Number).";
			owner_lazy = () -> AuthenticationMethodCode.mmObject();
			codeName = "NPIN";
		}
	};
	/**
	 * Off-line PIN authentication (Personal Identification Number).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode
	 * AuthenticationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FPIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfflinePIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Off-line PIN authentication (Personal Identification Number)."</li>
	 * </ul>
	 */
	public static final MMCode OfflinePIN = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OfflinePIN";
			definition = "Off-line PIN authentication (Personal Identification Number).";
			owner_lazy = () -> AuthenticationMethodCode.mmObject();
			codeName = "FPIN";
		}
	};
	/**
	 * Electronic signature capture (handwritten signature).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode
	 * AuthenticationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CPSG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignatureCapture"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Electronic signature capture (handwritten signature)."</li>
	 * </ul>
	 */
	public static final MMCode SignatureCapture = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SignatureCapture";
			definition = "Electronic signature capture (handwritten signature).";
			owner_lazy = () -> AuthenticationMethodCode.mmObject();
			codeName = "CPSG";
		}
	};
	/**
	 * Handwritten paper signature.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode
	 * AuthenticationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PPSG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaperSignature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Handwritten paper signature."</li>
	 * </ul>
	 */
	public static final MMCode PaperSignature = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaperSignature";
			definition = "Handwritten paper signature.";
			owner_lazy = () -> AuthenticationMethodCode.mmObject();
			codeName = "PPSG";
		}
	};
	/**
	 * Manual verification, for example passport or drivers license.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode
	 * AuthenticationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MANU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ManualVerification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Manual verification, for example passport or drivers license."</li>
	 * </ul>
	 */
	public static final MMCode ManualVerification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ManualVerification";
			definition = "Manual verification, for example passport or drivers license.";
			owner_lazy = () -> AuthenticationMethodCode.mmObject();
			codeName = "MANU";
		}
	};
	/**
	 * Merchant-related authentication.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode
	 * AuthenticationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MERC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MerchantAuthentication"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Merchant-related authentication."</li>
	 * </ul>
	 */
	public static final MMCode MerchantAuthentication = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MerchantAuthentication";
			definition = "Merchant-related authentication.";
			owner_lazy = () -> AuthenticationMethodCode.mmObject();
			codeName = "MERC";
		}
	};
	/**
	 * Electronic commerce transaction secured with the X.509 certificate of a
	 * customer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode
	 * AuthenticationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCRT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecureCertificate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Electronic commerce transaction secured with the X.509 certificate of a customer."
	 * </li>
	 * </ul>
	 */
	public static final MMCode SecureCertificate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecureCertificate";
			definition = "Electronic commerce transaction secured with the X.509 certificate of a customer.";
			owner_lazy = () -> AuthenticationMethodCode.mmObject();
			codeName = "SCRT";
		}
	};
	/**
	 * Secure electronic transaction without cardholder certificate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode
	 * AuthenticationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SNCT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecureNoCertificate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Secure electronic transaction without cardholder certificate."</li>
	 * </ul>
	 */
	public static final MMCode SecureNoCertificate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecureNoCertificate";
			definition = "Secure electronic transaction without cardholder certificate.";
			owner_lazy = () -> AuthenticationMethodCode.mmObject();
			codeName = "SNCT";
		}
	};
	/**
	 * Channel-encrypted transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode
	 * AuthenticationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCNL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuredChannel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Channel-encrypted transaction."</li>
	 * </ul>
	 */
	public static final MMCode SecuredChannel = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuredChannel";
			definition = "Channel-encrypted transaction.";
			owner_lazy = () -> AuthenticationMethodCode.mmObject();
			codeName = "SCNL";
		}
	};
	/**
	 * Authentication by a password.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode
	 * AuthenticationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PSWD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Password"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Authentication by a password."</li>
	 * </ul>
	 */
	public static final MMCode Password = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Password";
			definition = "Authentication by a password.";
			owner_lazy = () -> AuthenticationMethodCode.mmObject();
			codeName = "PSWD";
		}
	};
	/**
	 * Cardholder billing address verification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode
	 * AuthenticationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ADDB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BillingAddressVerification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cardholder billing address verification."</li>
	 * </ul>
	 */
	public static final MMCode BillingAddressVerification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BillingAddressVerification";
			definition = "Cardholder billing address verification.";
			owner_lazy = () -> AuthenticationMethodCode.mmObject();
			codeName = "ADDB";
		}
	};
	/**
	 * Biometric authentication of the cardholder.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode
	 * AuthenticationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BIOM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Biometry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Biometric authentication of the cardholder."</li>
	 * </ul>
	 */
	public static final MMCode Biometry = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Biometry";
			definition = "Biometric authentication of the cardholder.";
			owner_lazy = () -> AuthenticationMethodCode.mmObject();
			codeName = "BIOM";
		}
	};
	/**
	 * Cardholder data provided for verification, for instance social security
	 * number, driver license number, passport number.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode
	 * AuthenticationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CDHI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardholderIdentificationData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cardholder data provided for verification, for instance social security number, driver license number, passport number."
	 * </li>
	 * </ul>
	 */
	public static final MMCode CardholderIdentificationData = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardholderIdentificationData";
			definition = "Cardholder data provided for verification, for instance social security number, driver license number, passport number.";
			owner_lazy = () -> AuthenticationMethodCode.mmObject();
			codeName = "CDHI";
		}
	};
	/**
	 * Verification of a cryptogram generated by a chip card or another device,
	 * for instance ARQC (Authorisation Request Cryptogram).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode
	 * AuthenticationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRYP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CryptogramVerification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Verification of a cryptogram generated by a chip card or another device, for instance ARQC (Authorisation Request Cryptogram)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode CryptogramVerification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CryptogramVerification";
			definition = "Verification of a cryptogram generated by a chip card or another device, for instance ARQC (Authorisation Request Cryptogram).";
			owner_lazy = () -> AuthenticationMethodCode.mmObject();
			codeName = "CRYP";
		}
	};
	/**
	 * Verification of Card Security Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode
	 * AuthenticationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CSCV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSCVerification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Verification of Card Security Code."</li>
	 * </ul>
	 */
	public static final MMCode CSCVerification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSCVerification";
			definition = "Verification of Card Security Code.";
			owner_lazy = () -> AuthenticationMethodCode.mmObject();
			codeName = "CSCV";
		}
	};
	/**
	 * Authentication based on statistical cardholder behaviour.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode
	 * AuthenticationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PSVE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PassiveAuthentication"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Authentication based on statistical cardholder behaviour."
	 * </li>
	 * </ul>
	 */
	public static final MMCode PassiveAuthentication = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PassiveAuthentication";
			definition = "Authentication based on statistical cardholder behaviour.";
			owner_lazy = () -> AuthenticationMethodCode.mmObject();
			codeName = "PSVE";
		}
	};
	/**
	 * Authentication performed during a secure electronic commerce transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode
	 * AuthenticationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CSEC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecureElectronicCommerce"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Authentication performed during a secure electronic commerce transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMCode SecureElectronicCommerce = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecureElectronicCommerce";
			definition = "Authentication performed during a secure electronic commerce transaction.";
			owner_lazy = () -> AuthenticationMethodCode.mmObject();
			codeName = "CSEC";
		}
	};
	/**
	 * Cardholder shipping address verification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode
	 * AuthenticationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ADDS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShippingAddressVerification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cardholder shipping address verification."</li>
	 * </ul>
	 */
	public static final MMCode ShippingAddressVerification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShippingAddressVerification";
			definition = "Cardholder shipping address verification.";
			owner_lazy = () -> AuthenticationMethodCode.mmObject();
			codeName = "ADDS";
		}
	};
	/**
	 * Cryptogram generated by the token requestor or a customer device to
	 * validate the authorised use of a token.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode
	 * AuthenticationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TOKN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TokenAuthentication"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cryptogram generated by the token requestor or a customer device to validate the authorised use of a token."
	 * </li>
	 * </ul>
	 */
	public static final MMCode TokenAuthentication = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TokenAuthentication";
			definition = "Cryptogram generated by the token requestor or a customer device to validate the authorised use of a token.";
			owner_lazy = () -> AuthenticationMethodCode.mmObject();
			codeName = "TOKN";
		}
	};
	/**
	 * Verification or authentication related to the use of a payment token, for
	 * instance the validation of the authorised use of a token.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode
	 * AuthenticationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TOKP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentToken"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Verification or authentication related to the use of a payment token, for instance the validation of the authorised use of a token."
	 * </li>
	 * </ul>
	 */
	public static final MMCode PaymentToken = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentToken";
			definition = "Verification or authentication related to the use of a payment token, for instance the validation of the authorised use of a token.";
			owner_lazy = () -> AuthenticationMethodCode.mmObject();
			codeName = "TOKP";
		}
	};
	/**
	 * A token is used to verify an already performed authentication.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode
	 * AuthenticationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TOKA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthenticationToken"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A token is used to verify an already performed authentication."</li>
	 * </ul>
	 */
	public static final MMCode AuthenticationToken = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthenticationToken";
			definition = "A token is used to verify an already performed authentication.";
			owner_lazy = () -> AuthenticationMethodCode.mmObject();
			codeName = "TOKA";
		}
	};
	/**
	 * Customer mobile device.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode
	 * AuthenticationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MOBL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Mobile"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Customer mobile device."</li>
	 * </ul>
	 */
	public static final MMCode Mobile = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Mobile";
			definition = "Customer mobile device.";
			owner_lazy = () -> AuthenticationMethodCode.mmObject();
			codeName = "MOBL";
		}
	};
	/**
	 * Other customer authentication.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode
	 * AuthenticationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other customer authentication."</li>
	 * </ul>
	 */
	public static final MMCode Other = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Other customer authentication.";
			owner_lazy = () -> AuthenticationMethodCode.mmObject();
			codeName = "OTHR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("UKNW");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AuthenticationMethodCode";
				definition = "Method used to authenticate a cardholder.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AuthenticationMethodCode.UnknownMethod, com.tools20022.repository.codeset.AuthenticationMethodCode.Bypass,
						com.tools20022.repository.codeset.AuthenticationMethodCode.OnLinePIN, com.tools20022.repository.codeset.AuthenticationMethodCode.OfflinePIN,
						com.tools20022.repository.codeset.AuthenticationMethodCode.SignatureCapture, com.tools20022.repository.codeset.AuthenticationMethodCode.PaperSignature,
						com.tools20022.repository.codeset.AuthenticationMethodCode.ManualVerification, com.tools20022.repository.codeset.AuthenticationMethodCode.MerchantAuthentication,
						com.tools20022.repository.codeset.AuthenticationMethodCode.SecureCertificate, com.tools20022.repository.codeset.AuthenticationMethodCode.SecureNoCertificate,
						com.tools20022.repository.codeset.AuthenticationMethodCode.SecuredChannel, com.tools20022.repository.codeset.AuthenticationMethodCode.Password,
						com.tools20022.repository.codeset.AuthenticationMethodCode.BillingAddressVerification, com.tools20022.repository.codeset.AuthenticationMethodCode.Biometry,
						com.tools20022.repository.codeset.AuthenticationMethodCode.CardholderIdentificationData, com.tools20022.repository.codeset.AuthenticationMethodCode.CryptogramVerification,
						com.tools20022.repository.codeset.AuthenticationMethodCode.CSCVerification, com.tools20022.repository.codeset.AuthenticationMethodCode.PassiveAuthentication,
						com.tools20022.repository.codeset.AuthenticationMethodCode.SecureElectronicCommerce, com.tools20022.repository.codeset.AuthenticationMethodCode.ShippingAddressVerification,
						com.tools20022.repository.codeset.AuthenticationMethodCode.TokenAuthentication, com.tools20022.repository.codeset.AuthenticationMethodCode.PaymentToken,
						com.tools20022.repository.codeset.AuthenticationMethodCode.AuthenticationToken, com.tools20022.repository.codeset.AuthenticationMethodCode.Mobile, com.tools20022.repository.codeset.AuthenticationMethodCode.Other);
				derivation_lazy = () -> Arrays.asList(AuthenticationMethod1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}