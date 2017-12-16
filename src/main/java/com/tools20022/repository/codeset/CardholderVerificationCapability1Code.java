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
import com.tools20022.repository.codeset.CardholderVerificationCapability1Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability1Code#ManualSignature
 * CardholderVerificationCapability1Code.mmManualSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability1Code#OnLinePIN
 * CardholderVerificationCapability1Code.mmOnLinePIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability1Code#OfflinePINClear
 * CardholderVerificationCapability1Code.mmOfflinePINClear}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability1Code#OfflinePINEncrypted
 * CardholderVerificationCapability1Code.mmOfflinePINEncrypted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability1Code#OfflineDigitalSignature
 * CardholderVerificationCapability1Code.mmOfflineDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability1Code#OfflineBiometrics
 * CardholderVerificationCapability1Code.mmOfflineBiometrics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability1Code#ManualVerification
 * CardholderVerificationCapability1Code.mmManualVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability1Code#OfflineBiographics
 * CardholderVerificationCapability1Code.mmOfflineBiographics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability1Code#AccountDigitalSignature
 * CardholderVerificationCapability1Code.mmAccountDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability1Code#PKISignature
 * CardholderVerificationCapability1Code.mmPKISignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability1Code#CardholderData
 * CardholderVerificationCapability1Code.mmCardholderData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability1Code#SecureElectronicCommerce
 * CardholderVerificationCapability1Code.mmSecureElectronicCommerce}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode
 * CardholderVerificationCapabilityCode}</li>
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
 * "CardholderVerificationCapability1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Cardholder verification capabilities of the POI (Personal Identification Number) performing the transaction."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CardholderVerificationCapability1Code extends MMCode {

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
	public static final CardholderVerificationCapability1Code ManualSignature = new CardholderVerificationCapability1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ManualSignature";
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderVerificationCapability1Code.mmObject();
			codeName = CardholderVerificationCapabilityCode.ManualSignature.getCodeName().orElse(name);
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
	public static final CardholderVerificationCapability1Code OnLinePIN = new CardholderVerificationCapability1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnLinePIN";
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderVerificationCapability1Code.mmObject();
			codeName = CardholderVerificationCapabilityCode.OnLinePIN.getCodeName().orElse(name);
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
	public static final CardholderVerificationCapability1Code OfflinePINClear = new CardholderVerificationCapability1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfflinePINClear";
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderVerificationCapability1Code.mmObject();
			codeName = CardholderVerificationCapabilityCode.OfflinePINClear.getCodeName().orElse(name);
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
	public static final CardholderVerificationCapability1Code OfflinePINEncrypted = new CardholderVerificationCapability1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfflinePINEncrypted";
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderVerificationCapability1Code.mmObject();
			codeName = CardholderVerificationCapabilityCode.OfflinePINEncrypted.getCodeName().orElse(name);
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
	public static final CardholderVerificationCapability1Code OfflineDigitalSignature = new CardholderVerificationCapability1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfflineDigitalSignature";
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderVerificationCapability1Code.mmObject();
			codeName = CardholderVerificationCapabilityCode.OfflineDigitalSignature.getCodeName().orElse(name);
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
	public static final CardholderVerificationCapability1Code OfflineBiometrics = new CardholderVerificationCapability1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfflineBiometrics";
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderVerificationCapability1Code.mmObject();
			codeName = CardholderVerificationCapabilityCode.OfflineBiometrics.getCodeName().orElse(name);
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
	public static final CardholderVerificationCapability1Code ManualVerification = new CardholderVerificationCapability1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ManualVerification";
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderVerificationCapability1Code.mmObject();
			codeName = CardholderVerificationCapabilityCode.ManualVerification.getCodeName().orElse(name);
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
	public static final CardholderVerificationCapability1Code OfflineBiographics = new CardholderVerificationCapability1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfflineBiographics";
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderVerificationCapability1Code.mmObject();
			codeName = CardholderVerificationCapabilityCode.OfflineBiographics.getCodeName().orElse(name);
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
	public static final CardholderVerificationCapability1Code AccountDigitalSignature = new CardholderVerificationCapability1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountDigitalSignature";
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderVerificationCapability1Code.mmObject();
			codeName = CardholderVerificationCapabilityCode.AccountDigitalSignature.getCodeName().orElse(name);
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
	public static final CardholderVerificationCapability1Code PKISignature = new CardholderVerificationCapability1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PKISignature";
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderVerificationCapability1Code.mmObject();
			codeName = CardholderVerificationCapabilityCode.PKISignature.getCodeName().orElse(name);
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
	public static final CardholderVerificationCapability1Code CardholderData = new CardholderVerificationCapability1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardholderData";
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderVerificationCapability1Code.mmObject();
			codeName = CardholderVerificationCapabilityCode.CardholderData.getCodeName().orElse(name);
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
	public static final CardholderVerificationCapability1Code SecureElectronicCommerce = new CardholderVerificationCapability1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecureElectronicCommerce";
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderVerificationCapability1Code.mmObject();
			codeName = CardholderVerificationCapabilityCode.SecureElectronicCommerce.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CardholderVerificationCapability1Code> codesByName = new LinkedHashMap<>();

	protected CardholderVerificationCapability1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("MNSG");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardholderVerificationCapability1Code";
				definition = "Cardholder verification capabilities of the POI (Personal Identification Number) performing the transaction.";
				trace_lazy = () -> CardholderVerificationCapabilityCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardholderVerificationCapability1Code.ManualSignature, com.tools20022.repository.codeset.CardholderVerificationCapability1Code.OnLinePIN,
						com.tools20022.repository.codeset.CardholderVerificationCapability1Code.OfflinePINClear, com.tools20022.repository.codeset.CardholderVerificationCapability1Code.OfflinePINEncrypted,
						com.tools20022.repository.codeset.CardholderVerificationCapability1Code.OfflineDigitalSignature, com.tools20022.repository.codeset.CardholderVerificationCapability1Code.OfflineBiometrics,
						com.tools20022.repository.codeset.CardholderVerificationCapability1Code.ManualVerification, com.tools20022.repository.codeset.CardholderVerificationCapability1Code.OfflineBiographics,
						com.tools20022.repository.codeset.CardholderVerificationCapability1Code.AccountDigitalSignature, com.tools20022.repository.codeset.CardholderVerificationCapability1Code.PKISignature,
						com.tools20022.repository.codeset.CardholderVerificationCapability1Code.CardholderData, com.tools20022.repository.codeset.CardholderVerificationCapability1Code.SecureElectronicCommerce);
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
	}

	public static CardholderVerificationCapability1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CardholderVerificationCapability1Code[] values() {
		CardholderVerificationCapability1Code[] values = new CardholderVerificationCapability1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CardholderVerificationCapability1Code> {
		@Override
		public CardholderVerificationCapability1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CardholderVerificationCapability1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}