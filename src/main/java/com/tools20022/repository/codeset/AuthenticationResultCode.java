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
import com.tools20022.repository.codeset.AuthenticationResultCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the result of authentication done.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationResultCode#Denial
 * AuthenticationResultCode.Denial}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationResultCode#NonParticipation
 * AuthenticationResultCode.NonParticipation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationResultCode#UnableToAuthenticate
 * AuthenticationResultCode.UnableToAuthenticate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationResultCode#MerchantNotEnroled
 * AuthenticationResultCode.MerchantNotEnroled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationResultCode#WithCryptogram
 * AuthenticationResultCode.WithCryptogram}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationResultCode#WithoutCryptogram
 * AuthenticationResultCode.WithoutCryptogram}</li>
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
 * "AuthenticationResultCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the result of authentication done."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AuthenticationResultCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * The authentication didn’t succeed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationResultCode
	 * AuthenticationResultCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DENY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Denial"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The authentication didn’t succeed."</li>
	 * </ul>
	 */
	public static final AuthenticationResultCode Denial = new AuthenticationResultCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Denial";
			definition = "The authentication didn’t succeed.";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationResultCode.mmObject();
			codeName = "DENY";
		}
	};
	/**
	 * The card does not participate in the authentication programme.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationResultCode
	 * AuthenticationResultCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CARD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonParticipation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The card does not participate in the authentication programme."</li>
	 * </ul>
	 */
	public static final AuthenticationResultCode NonParticipation = new AuthenticationResultCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonParticipation";
			definition = "The card does not participate in the authentication programme.";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationResultCode.mmObject();
			codeName = "CARD";
		}
	};
	/**
	 * The authentication couldn’t be carried out.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationResultCode
	 * AuthenticationResultCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AUTH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToAuthenticate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The authentication couldn’t be carried out."</li>
	 * </ul>
	 */
	public static final AuthenticationResultCode UnableToAuthenticate = new AuthenticationResultCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToAuthenticate";
			definition = "The authentication couldn’t be carried out.";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationResultCode.mmObject();
			codeName = "AUTH";
		}
	};
	/**
	 * Merchant not enrolled in the authentication programme.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationResultCode
	 * AuthenticationResultCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MRCH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MerchantNotEnroled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Merchant not enrolled in the authentication programme."</li>
	 * </ul>
	 */
	public static final AuthenticationResultCode MerchantNotEnroled = new AuthenticationResultCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MerchantNotEnroled";
			definition = "Merchant not enrolled in the authentication programme.";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationResultCode.mmObject();
			codeName = "MRCH";
		}
	};
	/**
	 * Authentication succeeded with a cryptogram.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationResultCode
	 * AuthenticationResultCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRPT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithCryptogram"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Authentication succeeded with a cryptogram."</li>
	 * </ul>
	 */
	public static final AuthenticationResultCode WithCryptogram = new AuthenticationResultCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithCryptogram";
			definition = "Authentication succeeded with a cryptogram.";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationResultCode.mmObject();
			codeName = "CRPT";
		}
	};
	/**
	 * Authentication succeeded without a cryptogram.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationResultCode
	 * AuthenticationResultCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UCRP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithoutCryptogram"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Authentication succeeded without a cryptogram."</li>
	 * </ul>
	 */
	public static final AuthenticationResultCode WithoutCryptogram = new AuthenticationResultCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithoutCryptogram";
			definition = "Authentication succeeded without a cryptogram.";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationResultCode.mmObject();
			codeName = "UCRP";
		}
	};
	final static private LinkedHashMap<String, AuthenticationResultCode> codesByName = new LinkedHashMap<>();

	protected AuthenticationResultCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AuthenticationResultCode";
				definition = "Specifies the result of authentication done.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AuthenticationResultCode.Denial, com.tools20022.repository.codeset.AuthenticationResultCode.NonParticipation,
						com.tools20022.repository.codeset.AuthenticationResultCode.UnableToAuthenticate, com.tools20022.repository.codeset.AuthenticationResultCode.MerchantNotEnroled,
						com.tools20022.repository.codeset.AuthenticationResultCode.WithCryptogram, com.tools20022.repository.codeset.AuthenticationResultCode.WithoutCryptogram);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Denial.getCodeName().get(), Denial);
		codesByName.put(NonParticipation.getCodeName().get(), NonParticipation);
		codesByName.put(UnableToAuthenticate.getCodeName().get(), UnableToAuthenticate);
		codesByName.put(MerchantNotEnroled.getCodeName().get(), MerchantNotEnroled);
		codesByName.put(WithCryptogram.getCodeName().get(), WithCryptogram);
		codesByName.put(WithoutCryptogram.getCodeName().get(), WithoutCryptogram);
	}

	public static AuthenticationResultCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AuthenticationResultCode[] values() {
		AuthenticationResultCode[] values = new AuthenticationResultCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AuthenticationResultCode> {
		@Override
		public AuthenticationResultCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AuthenticationResultCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}