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
import com.tools20022.repository.codeset.AuthenticationMethodCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Method used to authenticate a cardholder.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode
 * AuthenticationMethodCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod1Code#UnknownMethod
 * AuthenticationMethod1Code.UnknownMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod1Code#Bypass
 * AuthenticationMethod1Code.Bypass}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod1Code#OnLinePIN
 * AuthenticationMethod1Code.OnLinePIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod1Code#OfflinePIN
 * AuthenticationMethod1Code.OfflinePIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod1Code#SignatureCapture
 * AuthenticationMethod1Code.SignatureCapture}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod1Code#PaperSignature
 * AuthenticationMethod1Code.PaperSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod1Code#ManualVerification
 * AuthenticationMethod1Code.ManualVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod1Code#MerchantAuthentication
 * AuthenticationMethod1Code.MerchantAuthentication}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod1Code#SecureCertificate
 * AuthenticationMethod1Code.SecureCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod1Code#SecureNoCertificate
 * AuthenticationMethod1Code.SecureNoCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod1Code#SecuredChannel
 * AuthenticationMethod1Code.SecuredChannel}</li>
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
 * "AuthenticationMethod1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Method used to authenticate a cardholder."</li>
 * </ul>
 */
public class AuthenticationMethod1Code extends AuthenticationMethodCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod1Code
	 * AuthenticationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnknownMethod"</li>
	 * </ul>
	 */
	public static final MMCode UnknownMethod = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnknownMethod";
			owner_lazy = () -> AuthenticationMethod1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod1Code
	 * AuthenticationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bypass"</li>
	 * </ul>
	 */
	public static final MMCode Bypass = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bypass";
			owner_lazy = () -> AuthenticationMethod1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod1Code
	 * AuthenticationMethod1Code}</li>
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
			owner_lazy = () -> AuthenticationMethod1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod1Code
	 * AuthenticationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfflinePIN"</li>
	 * </ul>
	 */
	public static final MMCode OfflinePIN = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfflinePIN";
			owner_lazy = () -> AuthenticationMethod1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod1Code
	 * AuthenticationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignatureCapture"</li>
	 * </ul>
	 */
	public static final MMCode SignatureCapture = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignatureCapture";
			owner_lazy = () -> AuthenticationMethod1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod1Code
	 * AuthenticationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaperSignature"</li>
	 * </ul>
	 */
	public static final MMCode PaperSignature = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaperSignature";
			owner_lazy = () -> AuthenticationMethod1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod1Code
	 * AuthenticationMethod1Code}</li>
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
			owner_lazy = () -> AuthenticationMethod1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod1Code
	 * AuthenticationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MerchantAuthentication"</li>
	 * </ul>
	 */
	public static final MMCode MerchantAuthentication = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MerchantAuthentication";
			owner_lazy = () -> AuthenticationMethod1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod1Code
	 * AuthenticationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecureCertificate"</li>
	 * </ul>
	 */
	public static final MMCode SecureCertificate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecureCertificate";
			owner_lazy = () -> AuthenticationMethod1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod1Code
	 * AuthenticationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecureNoCertificate"</li>
	 * </ul>
	 */
	public static final MMCode SecureNoCertificate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecureNoCertificate";
			owner_lazy = () -> AuthenticationMethod1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod1Code
	 * AuthenticationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuredChannel"</li>
	 * </ul>
	 */
	public static final MMCode SecuredChannel = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuredChannel";
			owner_lazy = () -> AuthenticationMethod1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("UKNW");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AuthenticationMethod1Code";
				definition = "Method used to authenticate a cardholder.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AuthenticationMethod1Code.UnknownMethod, com.tools20022.repository.codeset.AuthenticationMethod1Code.Bypass,
						com.tools20022.repository.codeset.AuthenticationMethod1Code.OnLinePIN, com.tools20022.repository.codeset.AuthenticationMethod1Code.OfflinePIN,
						com.tools20022.repository.codeset.AuthenticationMethod1Code.SignatureCapture, com.tools20022.repository.codeset.AuthenticationMethod1Code.PaperSignature,
						com.tools20022.repository.codeset.AuthenticationMethod1Code.ManualVerification, com.tools20022.repository.codeset.AuthenticationMethod1Code.MerchantAuthentication,
						com.tools20022.repository.codeset.AuthenticationMethod1Code.SecureCertificate, com.tools20022.repository.codeset.AuthenticationMethod1Code.SecureNoCertificate,
						com.tools20022.repository.codeset.AuthenticationMethod1Code.SecuredChannel);
				trace_lazy = () -> AuthenticationMethodCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}