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
import com.tools20022.repository.codeset.AuthenticationEntityCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Entity or object in charge of verifying the cardholder authenticity.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationEntityCode#ICC
 * AuthenticationEntityCode.ICC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationEntityCode#AuthorisedAgent
 * AuthenticationEntityCode.AuthorisedAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationEntityCode#Merchant
 * AuthenticationEntityCode.Merchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationEntityCode#Acquirer
 * AuthenticationEntityCode.Acquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationEntityCode#Issuer
 * AuthenticationEntityCode.Issuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationEntityCode#Terminal
 * AuthenticationEntityCode.Terminal}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.AuthenticationEntity1Code
 * AuthenticationEntity1Code}</li>
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
 * <li>"ICCD"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AuthenticationEntityCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Entity or object in charge of verifying the cardholder authenticity."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AuthenticationEntityCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Application in the chip card (Integrated Circuit Card), for instance an
	 * offline PIN verification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationEntityCode
	 * AuthenticationEntityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ICCD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ICC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Application in the chip card (Integrated Circuit Card), for instance an offline PIN verification."
	 * </li>
	 * </ul>
	 */
	public static final AuthenticationEntityCode ICC = new AuthenticationEntityCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ICC";
			definition = "Application in the chip card (Integrated Circuit Card), for instance an offline PIN verification.";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationEntityCode.mmObject();
			codeName = "ICCD";
		}
	};
	/**
	 * Authorisation agent of the issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationEntityCode
	 * AuthenticationEntityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AGNT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthorisedAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Authorisation agent of the issuer."</li>
	 * </ul>
	 */
	public static final AuthenticationEntityCode AuthorisedAgent = new AuthenticationEntityCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AuthorisedAgent";
			definition = "Authorisation agent of the issuer.";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationEntityCode.mmObject();
			codeName = "AGNT";
		}
	};
	/**
	 * Merchant (for example signature verification by the attendant).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationEntityCode
	 * AuthenticationEntityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MERC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Merchant"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Merchant (for example signature verification by the attendant)."</li>
	 * </ul>
	 */
	public static final AuthenticationEntityCode Merchant = new AuthenticationEntityCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Merchant";
			definition = "Merchant (for example signature verification by the attendant).";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationEntityCode.mmObject();
			codeName = "MERC";
		}
	};
	/**
	 * Acquirer of the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationEntityCode
	 * AuthenticationEntityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACQR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Acquirer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Acquirer of the transaction."</li>
	 * </ul>
	 */
	public static final AuthenticationEntityCode Acquirer = new AuthenticationEntityCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Acquirer";
			definition = "Acquirer of the transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationEntityCode.mmObject();
			codeName = "ACQR";
		}
	};
	/**
	 * Card issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationEntityCode
	 * AuthenticationEntityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ISSR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issuer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Card issuer."</li>
	 * </ul>
	 */
	public static final AuthenticationEntityCode Issuer = new AuthenticationEntityCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issuer";
			definition = "Card issuer.";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationEntityCode.mmObject();
			codeName = "ISSR";
		}
	};
	/**
	 * Secure application in the terminal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationEntityCode
	 * AuthenticationEntityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRML"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Terminal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Secure application in the terminal."</li>
	 * </ul>
	 */
	public static final AuthenticationEntityCode Terminal = new AuthenticationEntityCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Terminal";
			definition = "Secure application in the terminal.";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationEntityCode.mmObject();
			codeName = "TRML";
		}
	};
	final static private LinkedHashMap<String, AuthenticationEntityCode> codesByName = new LinkedHashMap<>();

	protected AuthenticationEntityCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ICCD");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AuthenticationEntityCode";
				definition = "Entity or object in charge of verifying the cardholder authenticity.";
				derivation_lazy = () -> Arrays.asList(AuthenticationEntity1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AuthenticationEntityCode.ICC, com.tools20022.repository.codeset.AuthenticationEntityCode.AuthorisedAgent,
						com.tools20022.repository.codeset.AuthenticationEntityCode.Merchant, com.tools20022.repository.codeset.AuthenticationEntityCode.Acquirer, com.tools20022.repository.codeset.AuthenticationEntityCode.Issuer,
						com.tools20022.repository.codeset.AuthenticationEntityCode.Terminal);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ICC.getCodeName().get(), ICC);
		codesByName.put(AuthorisedAgent.getCodeName().get(), AuthorisedAgent);
		codesByName.put(Merchant.getCodeName().get(), Merchant);
		codesByName.put(Acquirer.getCodeName().get(), Acquirer);
		codesByName.put(Issuer.getCodeName().get(), Issuer);
		codesByName.put(Terminal.getCodeName().get(), Terminal);
	}

	public static AuthenticationEntityCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AuthenticationEntityCode[] values() {
		AuthenticationEntityCode[] values = new AuthenticationEntityCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AuthenticationEntityCode> {
		@Override
		public AuthenticationEntityCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AuthenticationEntityCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}