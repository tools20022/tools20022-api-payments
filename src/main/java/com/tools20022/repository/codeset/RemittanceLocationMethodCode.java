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
 * Specifies the method used to deliver the remittance advice information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RemittanceLocationMethodCode#Fax
 * RemittanceLocationMethodCode.Fax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RemittanceLocationMethodCode#ElectronicDataInterchange
 * RemittanceLocationMethodCode.ElectronicDataInterchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RemittanceLocationMethodCode#UniformResourceIdentifier
 * RemittanceLocationMethodCode.UniformResourceIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RemittanceLocationMethodCode#EMail
 * RemittanceLocationMethodCode.EMail}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RemittanceLocationMethodCode#Post
 * RemittanceLocationMethodCode.Post}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RemittanceLocationMethodCode#SMS
 * RemittanceLocationMethodCode.SMS}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RemittanceLocationMethod2Code
 * RemittanceLocationMethod2Code}</li>
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
 * <li>"FAXI"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RemittanceLocationMethodCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the method used to deliver the remittance advice information."</li>
 * </ul>
 */
public class RemittanceLocationMethodCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Remittance advice information must be faxed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RemittanceLocationMethodCode
	 * RemittanceLocationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FAXI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Fax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Remittance advice information must be faxed."</li>
	 * </ul>
	 */
	public static final MMCode Fax = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Fax";
			definition = "Remittance advice information must be faxed.";
			owner_lazy = () -> RemittanceLocationMethodCode.mmObject();
			codeName = "FAXI";
		}
	};
	/**
	 * Remittance advice information must be sent through Electronic Data
	 * Interchange (EDI).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RemittanceLocationMethodCode
	 * RemittanceLocationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EDIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectronicDataInterchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Remittance advice information must be sent through Electronic Data Interchange (EDI)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode ElectronicDataInterchange = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ElectronicDataInterchange";
			definition = "Remittance advice information must be sent through Electronic Data Interchange (EDI).";
			owner_lazy = () -> RemittanceLocationMethodCode.mmObject();
			codeName = "EDIC";
		}
	};
	/**
	 * Remittance advice information needs to be sent to a Uniform Resource
	 * Identifier (URI). URI is a compact string of characters that uniquely
	 * identify an abstract or physical resource. URI's are the super-set of
	 * identifiers, such as URLs, email addresses, ftp sites, etc, and as such,
	 * provide the syntax for all of the identification schemes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RemittanceLocationMethodCode
	 * RemittanceLocationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "URID"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UniformResourceIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Remittance advice  information needs to be sent to a Uniform Resource Identifier (URI). URI  is a compact string of characters that uniquely identify an abstract or physical resource.  URI's are the super-set of identifiers, such as URLs, email addresses, ftp sites, etc, and as such, provide the syntax for all of the identification schemes."
	 * </li>
	 * </ul>
	 */
	public static final MMCode UniformResourceIdentifier = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UniformResourceIdentifier";
			definition = "Remittance advice  information needs to be sent to a Uniform Resource Identifier (URI). URI  is a compact string of characters that uniquely identify an abstract or physical resource.  URI's are the super-set of identifiers, such as URLs, email addresses, ftp sites, etc, and as such, provide the syntax for all of the identification schemes.";
			owner_lazy = () -> RemittanceLocationMethodCode.mmObject();
			codeName = "URID";
		}
	};
	/**
	 * Remittance advice information must be sent through e-mail.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RemittanceLocationMethodCode
	 * RemittanceLocationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EMAL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EMail"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Remittance advice  information must be sent through e-mail."</li>
	 * </ul>
	 */
	public static final MMCode EMail = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EMail";
			definition = "Remittance advice  information must be sent through e-mail.";
			owner_lazy = () -> RemittanceLocationMethodCode.mmObject();
			codeName = "EMAL";
		}
	};
	/**
	 * Remittance advice information must be sent through postal services.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RemittanceLocationMethodCode
	 * RemittanceLocationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "POST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Post"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Remittance advice information must be sent through postal services."</li>
	 * </ul>
	 */
	public static final MMCode Post = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Post";
			definition = "Remittance advice information must be sent through postal services.";
			owner_lazy = () -> RemittanceLocationMethodCode.mmObject();
			codeName = "POST";
		}
	};
	/**
	 * Remittance advice information must be sent through by phone as a short
	 * message service (SMS).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RemittanceLocationMethodCode
	 * RemittanceLocationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SMSM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SMS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Remittance advice  information must be sent through by phone as a short message service (SMS)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode SMS = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SMS";
			definition = "Remittance advice  information must be sent through by phone as a short message service (SMS).";
			owner_lazy = () -> RemittanceLocationMethodCode.mmObject();
			codeName = "SMSM";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("FAXI");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RemittanceLocationMethodCode";
				definition = "Specifies the method used to deliver the remittance advice information.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RemittanceLocationMethodCode.Fax, com.tools20022.repository.codeset.RemittanceLocationMethodCode.ElectronicDataInterchange,
						com.tools20022.repository.codeset.RemittanceLocationMethodCode.UniformResourceIdentifier, com.tools20022.repository.codeset.RemittanceLocationMethodCode.EMail,
						com.tools20022.repository.codeset.RemittanceLocationMethodCode.Post, com.tools20022.repository.codeset.RemittanceLocationMethodCode.SMS);
				derivation_lazy = () -> Arrays.asList(RemittanceLocationMethod2Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}