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
 * Cardholder verification capabilities of the POI (Personal Identification
 * Number) performing the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode#ManualSignature
 * CardholderVerificationCapabilityCode.ManualSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode#OnLinePIN
 * CardholderVerificationCapabilityCode.OnLinePIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode#OfflinePINClear
 * CardholderVerificationCapabilityCode.OfflinePINClear}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode#OfflinePINEncrypted
 * CardholderVerificationCapabilityCode.OfflinePINEncrypted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode#OfflineDigitalSignature
 * CardholderVerificationCapabilityCode.OfflineDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode#OfflineBiometrics
 * CardholderVerificationCapabilityCode.OfflineBiometrics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode#ManualVerification
 * CardholderVerificationCapabilityCode.ManualVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode#OfflineBiographics
 * CardholderVerificationCapabilityCode.OfflineBiographics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode#AccountDigitalSignature
 * CardholderVerificationCapabilityCode.AccountDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode#PKISignature
 * CardholderVerificationCapabilityCode.PKISignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode#CardholderData
 * CardholderVerificationCapabilityCode.CardholderData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode#SecureElectronicCommerce
 * CardholderVerificationCapabilityCode.SecureElectronicCommerce}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode#Unknown
 * CardholderVerificationCapabilityCode.Unknown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode#PersonalCode
 * CardholderVerificationCapabilityCode.PersonalCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode#NoCapabilities
 * CardholderVerificationCapabilityCode.NoCapabilities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode#OnLineBiometrics
 * CardholderVerificationCapabilityCode.OnLineBiometrics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode#Other
 * CardholderVerificationCapabilityCode.Other}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability1Code
 * CardholderVerificationCapability1Code}</li>
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
 * <li>"MNSG"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CardholderVerificationCapabilityCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Cardholder verification capabilities of the POI (Personal Identification Number) performing the transaction."
 * </li>
 * </ul>
 */
public class CardholderVerificationCapabilityCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Manual signature verification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode
	 * CardholderVerificationCapabilityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MNSG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ManualSignature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Manual signature verification."</li>
	 * </ul>
	 */
	public static final MMCode ManualSignature = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ManualSignature";
			definition = "Manual signature verification.";
			owner_lazy = () -> CardholderVerificationCapabilityCode.mmObject();
			codeName = "MNSG";
		}
	};
	/**
	 * Online PIN (Personal Identification Number).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode
	 * CardholderVerificationCapabilityCode}</li>
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
	 * definition} = "Online PIN (Personal Identification Number)."</li>
	 * </ul>
	 */
	public static final MMCode OnLinePIN = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OnLinePIN";
			definition = "Online PIN (Personal Identification Number).";
			owner_lazy = () -> CardholderVerificationCapabilityCode.mmObject();
			codeName = "NPIN";
		}
	};
	/**
	 * Offline PIN in clear (Personal Identification Number).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode
	 * CardholderVerificationCapabilityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FCPN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfflinePINClear"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Offline PIN in clear (Personal Identification Number)."</li>
	 * </ul>
	 */
	public static final MMCode OfflinePINClear = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OfflinePINClear";
			definition = "Offline PIN in clear (Personal Identification Number).";
			owner_lazy = () -> CardholderVerificationCapabilityCode.mmObject();
			codeName = "FCPN";
		}
	};
	/**
	 * Offline PIN encrypted (Personal Identification Number).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode
	 * CardholderVerificationCapabilityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FEPN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfflinePINEncrypted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Offline PIN encrypted (Personal Identification Number)."</li>
	 * </ul>
	 */
	public static final MMCode OfflinePINEncrypted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OfflinePINEncrypted";
			definition = "Offline PIN encrypted (Personal Identification Number).";
			owner_lazy = () -> CardholderVerificationCapabilityCode.mmObject();
			codeName = "FEPN";
		}
	};
	/**
	 * Offline digital signature analysis.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode
	 * CardholderVerificationCapabilityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FDSG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfflineDigitalSignature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Offline digital signature analysis."</li>
	 * </ul>
	 */
	public static final MMCode OfflineDigitalSignature = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OfflineDigitalSignature";
			definition = "Offline digital signature analysis.";
			owner_lazy = () -> CardholderVerificationCapabilityCode.mmObject();
			codeName = "FDSG";
		}
	};
	/**
	 * Offline biometrics.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode
	 * CardholderVerificationCapabilityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FBIO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfflineBiometrics"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Offline biometrics."</li>
	 * </ul>
	 */
	public static final MMCode OfflineBiometrics = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OfflineBiometrics";
			definition = "Offline biometrics.";
			owner_lazy = () -> CardholderVerificationCapabilityCode.mmObject();
			codeName = "FBIO";
		}
	};
	/**
	 * Other manual verification, for example passport or drivers license.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode
	 * CardholderVerificationCapabilityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MNVR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ManualVerification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Other manual verification, for example passport or drivers license."</li>
	 * </ul>
	 */
	public static final MMCode ManualVerification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ManualVerification";
			definition = "Other manual verification, for example passport or drivers license.";
			owner_lazy = () -> CardholderVerificationCapabilityCode.mmObject();
			codeName = "MNVR";
		}
	};
	/**
	 * Offline biographics.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode
	 * CardholderVerificationCapabilityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FBIG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfflineBiographics"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Offline biographics."</li>
	 * </ul>
	 */
	public static final MMCode OfflineBiographics = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OfflineBiographics";
			definition = "Offline biographics.";
			owner_lazy = () -> CardholderVerificationCapabilityCode.mmObject();
			codeName = "FBIG";
		}
	};
	/**
	 * Account based digital signature.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode
	 * CardholderVerificationCapabilityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "APKI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountDigitalSignature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account based digital signature."</li>
	 * </ul>
	 */
	public static final MMCode AccountDigitalSignature = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccountDigitalSignature";
			definition = "Account based digital signature.";
			owner_lazy = () -> CardholderVerificationCapabilityCode.mmObject();
			codeName = "APKI";
		}
	};
	/**
	 * PKI (Public Key Infrastructure) based digital signature.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode
	 * CardholderVerificationCapabilityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PKIS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PKISignature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "PKI (Public Key Infrastructure) based digital signature."</li>
	 * </ul>
	 */
	public static final MMCode PKISignature = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PKISignature";
			definition = "PKI (Public Key Infrastructure) based digital signature.";
			owner_lazy = () -> CardholderVerificationCapabilityCode.mmObject();
			codeName = "PKIS";
		}
	};
	/**
	 * Cardholder authentication data.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode
	 * CardholderVerificationCapabilityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CHDT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardholderData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cardholder authentication data."</li>
	 * </ul>
	 */
	public static final MMCode CardholderData = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CardholderData";
			definition = "Cardholder authentication data.";
			owner_lazy = () -> CardholderVerificationCapabilityCode.mmObject();
			codeName = "CHDT";
		}
	};
	/**
	 * Three domain secure (three domain secure authentication of the
	 * cardholder).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode
	 * CardholderVerificationCapabilityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCEC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecureElectronicCommerce"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Three domain secure (three domain secure authentication of the cardholder)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode SecureElectronicCommerce = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecureElectronicCommerce";
			definition = "Three domain secure (three domain secure authentication of the cardholder).";
			owner_lazy = () -> CardholderVerificationCapabilityCode.mmObject();
			codeName = "SCEC";
		}
	};
	/**
	 * Unknown cardholder verification capability.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode
	 * CardholderVerificationCapabilityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UNKW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unknown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unknown cardholder verification capability."</li>
	 * </ul>
	 */
	public static final MMCode Unknown = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unknown";
			definition = "Unknown cardholder verification capability.";
			owner_lazy = () -> CardholderVerificationCapabilityCode.mmObject();
			codeName = "UNKW";
		}
	};
	/**
	 * Personal code of the customer for banking services.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode
	 * CardholderVerificationCapabilityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PCOD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PersonalCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Personal code of the customer for banking services."</li>
	 * </ul>
	 */
	public static final MMCode PersonalCode = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PersonalCode";
			definition = "Personal code of the customer for banking services.";
			owner_lazy = () -> CardholderVerificationCapabilityCode.mmObject();
			codeName = "PCOD";
		}
	};
	/**
	 * No cardholder verification capability.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode
	 * CardholderVerificationCapabilityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOVF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoCapabilities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "No cardholder verification capability."</li>
	 * </ul>
	 */
	public static final MMCode NoCapabilities = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoCapabilities";
			definition = "No cardholder verification capability.";
			owner_lazy = () -> CardholderVerificationCapabilityCode.mmObject();
			codeName = "NOVF";
		}
	};
	/**
	 * Online biometrics.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode
	 * CardholderVerificationCapabilityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NBIO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnLineBiometrics"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Online biometrics."</li>
	 * </ul>
	 */
	public static final MMCode OnLineBiometrics = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnLineBiometrics";
			definition = "Online biometrics.";
			owner_lazy = () -> CardholderVerificationCapabilityCode.mmObject();
			codeName = "NBIO";
		}
	};
	/**
	 * Other cardholder verification capabilities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode
	 * CardholderVerificationCapabilityCode}</li>
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
	 * definition} = "Other cardholder verification capabilities."</li>
	 * </ul>
	 */
	public static final MMCode Other = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Other cardholder verification capabilities.";
			owner_lazy = () -> CardholderVerificationCapabilityCode.mmObject();
			codeName = "OTHR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("MNSG");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CardholderVerificationCapabilityCode";
				definition = "Cardholder verification capabilities of the POI (Personal Identification Number) performing the transaction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.ManualSignature, com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.OnLinePIN,
						com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.OfflinePINClear, com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.OfflinePINEncrypted,
						com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.OfflineDigitalSignature, com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.OfflineBiometrics,
						com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.ManualVerification, com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.OfflineBiographics,
						com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.AccountDigitalSignature, com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.PKISignature,
						com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.CardholderData, com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.SecureElectronicCommerce,
						com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.Unknown, com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.PersonalCode,
						com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.NoCapabilities, com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.OnLineBiometrics,
						com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.Other);
				derivation_lazy = () -> Arrays.asList(CardholderVerificationCapability1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}