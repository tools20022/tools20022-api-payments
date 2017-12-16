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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

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
 * CardholderVerificationCapabilityCode.mmManualSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode#OnLinePIN
 * CardholderVerificationCapabilityCode.mmOnLinePIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode#OfflinePINClear
 * CardholderVerificationCapabilityCode.mmOfflinePINClear}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode#OfflinePINEncrypted
 * CardholderVerificationCapabilityCode.mmOfflinePINEncrypted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode#OfflineDigitalSignature
 * CardholderVerificationCapabilityCode.mmOfflineDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode#OfflineBiometrics
 * CardholderVerificationCapabilityCode.mmOfflineBiometrics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode#ManualVerification
 * CardholderVerificationCapabilityCode.mmManualVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode#OfflineBiographics
 * CardholderVerificationCapabilityCode.mmOfflineBiographics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode#AccountDigitalSignature
 * CardholderVerificationCapabilityCode.mmAccountDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode#PKISignature
 * CardholderVerificationCapabilityCode.mmPKISignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode#CardholderData
 * CardholderVerificationCapabilityCode.mmCardholderData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode#SecureElectronicCommerce
 * CardholderVerificationCapabilityCode.mmSecureElectronicCommerce}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode#Unknown
 * CardholderVerificationCapabilityCode.mmUnknown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode#PersonalCode
 * CardholderVerificationCapabilityCode.mmPersonalCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode#NoCapabilities
 * CardholderVerificationCapabilityCode.mmNoCapabilities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode#OnLineBiometrics
 * CardholderVerificationCapabilityCode.mmOnLineBiometrics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode#Other
 * CardholderVerificationCapabilityCode.mmOther}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CardholderVerificationCapabilityCode extends MMCode {

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
	public static final CardholderVerificationCapabilityCode ManualSignature = new CardholderVerificationCapabilityCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ManualSignature";
			definition = "Manual signature verification.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.mmObject();
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
	public static final CardholderVerificationCapabilityCode OnLinePIN = new CardholderVerificationCapabilityCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OnLinePIN";
			definition = "Online PIN (Personal Identification Number).";
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.mmObject();
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
	public static final CardholderVerificationCapabilityCode OfflinePINClear = new CardholderVerificationCapabilityCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OfflinePINClear";
			definition = "Offline PIN in clear (Personal Identification Number).";
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.mmObject();
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
	public static final CardholderVerificationCapabilityCode OfflinePINEncrypted = new CardholderVerificationCapabilityCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OfflinePINEncrypted";
			definition = "Offline PIN encrypted (Personal Identification Number).";
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.mmObject();
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
	public static final CardholderVerificationCapabilityCode OfflineDigitalSignature = new CardholderVerificationCapabilityCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OfflineDigitalSignature";
			definition = "Offline digital signature analysis.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.mmObject();
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
	public static final CardholderVerificationCapabilityCode OfflineBiometrics = new CardholderVerificationCapabilityCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OfflineBiometrics";
			definition = "Offline biometrics.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.mmObject();
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
	public static final CardholderVerificationCapabilityCode ManualVerification = new CardholderVerificationCapabilityCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ManualVerification";
			definition = "Other manual verification, for example passport or drivers license.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.mmObject();
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
	public static final CardholderVerificationCapabilityCode OfflineBiographics = new CardholderVerificationCapabilityCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OfflineBiographics";
			definition = "Offline biographics.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.mmObject();
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
	public static final CardholderVerificationCapabilityCode AccountDigitalSignature = new CardholderVerificationCapabilityCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccountDigitalSignature";
			definition = "Account based digital signature.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.mmObject();
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
	public static final CardholderVerificationCapabilityCode PKISignature = new CardholderVerificationCapabilityCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PKISignature";
			definition = "PKI (Public Key Infrastructure) based digital signature.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.mmObject();
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
	public static final CardholderVerificationCapabilityCode CardholderData = new CardholderVerificationCapabilityCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CardholderData";
			definition = "Cardholder authentication data.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.mmObject();
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
	public static final CardholderVerificationCapabilityCode SecureElectronicCommerce = new CardholderVerificationCapabilityCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecureElectronicCommerce";
			definition = "Three domain secure (three domain secure authentication of the cardholder).";
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.mmObject();
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
	public static final CardholderVerificationCapabilityCode Unknown = new CardholderVerificationCapabilityCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unknown";
			definition = "Unknown cardholder verification capability.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.mmObject();
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
	public static final CardholderVerificationCapabilityCode PersonalCode = new CardholderVerificationCapabilityCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PersonalCode";
			definition = "Personal code of the customer for banking services.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.mmObject();
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
	public static final CardholderVerificationCapabilityCode NoCapabilities = new CardholderVerificationCapabilityCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoCapabilities";
			definition = "No cardholder verification capability.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.mmObject();
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
	public static final CardholderVerificationCapabilityCode OnLineBiometrics = new CardholderVerificationCapabilityCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnLineBiometrics";
			definition = "Online biometrics.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.mmObject();
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
	public static final CardholderVerificationCapabilityCode Other = new CardholderVerificationCapabilityCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Other cardholder verification capabilities.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.mmObject();
			codeName = "OTHR";
		}
	};
	final static private LinkedHashMap<String, CardholderVerificationCapabilityCode> codesByName = new LinkedHashMap<>();

	protected CardholderVerificationCapabilityCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("MNSG");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardholderVerificationCapabilityCode";
				definition = "Cardholder verification capabilities of the POI (Personal Identification Number) performing the transaction.";
				derivation_lazy = () -> Arrays.asList(CardholderVerificationCapability1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.ManualSignature, com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.OnLinePIN,
						com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.OfflinePINClear, com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.OfflinePINEncrypted,
						com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.OfflineDigitalSignature, com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.OfflineBiometrics,
						com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.ManualVerification, com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.OfflineBiographics,
						com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.AccountDigitalSignature, com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.PKISignature,
						com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.CardholderData, com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.SecureElectronicCommerce,
						com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.Unknown, com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.PersonalCode,
						com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.NoCapabilities, com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.OnLineBiometrics,
						com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.Other);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ManualSignature.getCodeName().get(), ManualSignature);
		codesByName.put(OnLinePIN.getCodeName().get(), OnLinePIN);
		codesByName.put(OfflinePINClear.getCodeName().get(), OfflinePINClear);
		codesByName.put(OfflinePINEncrypted.getCodeName().get(), OfflinePINEncrypted);
		codesByName.put(OfflineDigitalSignature.getCodeName().get(), OfflineDigitalSignature);
		codesByName.put(OfflineBiometrics.getCodeName().get(), OfflineBiometrics);
		codesByName.put(ManualVerification.getCodeName().get(), ManualVerification);
		codesByName.put(OfflineBiographics.getCodeName().get(), OfflineBiographics);
		codesByName.put(AccountDigitalSignature.getCodeName().get(), AccountDigitalSignature);
		codesByName.put(PKISignature.getCodeName().get(), PKISignature);
		codesByName.put(CardholderData.getCodeName().get(), CardholderData);
		codesByName.put(SecureElectronicCommerce.getCodeName().get(), SecureElectronicCommerce);
		codesByName.put(Unknown.getCodeName().get(), Unknown);
		codesByName.put(PersonalCode.getCodeName().get(), PersonalCode);
		codesByName.put(NoCapabilities.getCodeName().get(), NoCapabilities);
		codesByName.put(OnLineBiometrics.getCodeName().get(), OnLineBiometrics);
		codesByName.put(Other.getCodeName().get(), Other);
	}

	public static CardholderVerificationCapabilityCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CardholderVerificationCapabilityCode[] values() {
		CardholderVerificationCapabilityCode[] values = new CardholderVerificationCapabilityCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CardholderVerificationCapabilityCode> {
		@Override
		public CardholderVerificationCapabilityCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CardholderVerificationCapabilityCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}