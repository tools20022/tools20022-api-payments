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
import com.tools20022.repository.codeset.CardholderVerificationCapabilityCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Cardholder verification capabilities of the POI (Personal Identification
 * Number) performing the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode
 * CardholderVerificationCapabilityCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability1Code#ManualSignature
 * CardholderVerificationCapability1Code.ManualSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability1Code#OnLinePIN
 * CardholderVerificationCapability1Code.OnLinePIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability1Code#OfflinePINClear
 * CardholderVerificationCapability1Code.OfflinePINClear}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability1Code#OfflinePINEncrypted
 * CardholderVerificationCapability1Code.OfflinePINEncrypted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability1Code#OfflineDigitalSignature
 * CardholderVerificationCapability1Code.OfflineDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability1Code#OfflineBiometrics
 * CardholderVerificationCapability1Code.OfflineBiometrics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability1Code#ManualVerification
 * CardholderVerificationCapability1Code.ManualVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability1Code#OfflineBiographics
 * CardholderVerificationCapability1Code.OfflineBiographics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability1Code#AccountDigitalSignature
 * CardholderVerificationCapability1Code.AccountDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability1Code#PKISignature
 * CardholderVerificationCapability1Code.PKISignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability1Code#CardholderData
 * CardholderVerificationCapability1Code.CardholderData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability1Code#SecureElectronicCommerce
 * CardholderVerificationCapability1Code.SecureElectronicCommerce}</li>
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
 * "CardholderVerificationCapability1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Cardholder verification capabilities of the POI (Personal Identification Number) performing the transaction."
 * </li>
 * </ul>
 */
public class CardholderVerificationCapability1Code extends CardholderVerificationCapabilityCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability1Code
	 * CardholderVerificationCapability1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ManualSignature"</li>
	 * </ul>
	 */
	public static final MMCode ManualSignature = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ManualSignature";
			owner_lazy = () -> CardholderVerificationCapability1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability1Code
	 * CardholderVerificationCapability1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnLinePIN"</li>
	 * </ul>
	 */
	public static final MMCode OnLinePIN = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnLinePIN";
			owner_lazy = () -> CardholderVerificationCapability1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability1Code
	 * CardholderVerificationCapability1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfflinePINClear"</li>
	 * </ul>
	 */
	public static final MMCode OfflinePINClear = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfflinePINClear";
			owner_lazy = () -> CardholderVerificationCapability1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability1Code
	 * CardholderVerificationCapability1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfflinePINEncrypted"</li>
	 * </ul>
	 */
	public static final MMCode OfflinePINEncrypted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfflinePINEncrypted";
			owner_lazy = () -> CardholderVerificationCapability1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability1Code
	 * CardholderVerificationCapability1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfflineDigitalSignature"</li>
	 * </ul>
	 */
	public static final MMCode OfflineDigitalSignature = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfflineDigitalSignature";
			owner_lazy = () -> CardholderVerificationCapability1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability1Code
	 * CardholderVerificationCapability1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfflineBiometrics"</li>
	 * </ul>
	 */
	public static final MMCode OfflineBiometrics = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfflineBiometrics";
			owner_lazy = () -> CardholderVerificationCapability1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability1Code
	 * CardholderVerificationCapability1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ManualVerification"</li>
	 * </ul>
	 */
	public static final MMCode ManualVerification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ManualVerification";
			owner_lazy = () -> CardholderVerificationCapability1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability1Code
	 * CardholderVerificationCapability1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfflineBiographics"</li>
	 * </ul>
	 */
	public static final MMCode OfflineBiographics = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfflineBiographics";
			owner_lazy = () -> CardholderVerificationCapability1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability1Code
	 * CardholderVerificationCapability1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountDigitalSignature"</li>
	 * </ul>
	 */
	public static final MMCode AccountDigitalSignature = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountDigitalSignature";
			owner_lazy = () -> CardholderVerificationCapability1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability1Code
	 * CardholderVerificationCapability1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PKISignature"</li>
	 * </ul>
	 */
	public static final MMCode PKISignature = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PKISignature";
			owner_lazy = () -> CardholderVerificationCapability1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability1Code
	 * CardholderVerificationCapability1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardholderData"</li>
	 * </ul>
	 */
	public static final MMCode CardholderData = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardholderData";
			owner_lazy = () -> CardholderVerificationCapability1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability1Code
	 * CardholderVerificationCapability1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecureElectronicCommerce"</li>
	 * </ul>
	 */
	public static final MMCode SecureElectronicCommerce = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecureElectronicCommerce";
			owner_lazy = () -> CardholderVerificationCapability1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("MNSG");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CardholderVerificationCapability1Code";
				definition = "Cardholder verification capabilities of the POI (Personal Identification Number) performing the transaction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardholderVerificationCapability1Code.ManualSignature, com.tools20022.repository.codeset.CardholderVerificationCapability1Code.OnLinePIN,
						com.tools20022.repository.codeset.CardholderVerificationCapability1Code.OfflinePINClear, com.tools20022.repository.codeset.CardholderVerificationCapability1Code.OfflinePINEncrypted,
						com.tools20022.repository.codeset.CardholderVerificationCapability1Code.OfflineDigitalSignature, com.tools20022.repository.codeset.CardholderVerificationCapability1Code.OfflineBiometrics,
						com.tools20022.repository.codeset.CardholderVerificationCapability1Code.ManualVerification, com.tools20022.repository.codeset.CardholderVerificationCapability1Code.OfflineBiographics,
						com.tools20022.repository.codeset.CardholderVerificationCapability1Code.AccountDigitalSignature, com.tools20022.repository.codeset.CardholderVerificationCapability1Code.PKISignature,
						com.tools20022.repository.codeset.CardholderVerificationCapability1Code.CardholderData, com.tools20022.repository.codeset.CardholderVerificationCapability1Code.SecureElectronicCommerce);
				trace_lazy = () -> CardholderVerificationCapabilityCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}