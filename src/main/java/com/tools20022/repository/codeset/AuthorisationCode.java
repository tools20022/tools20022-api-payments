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
import com.tools20022.repository.codeset.AuthorisationCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the level of approval depending on a number of factors, including
 * payment type, threshold amount or local country or operations practice.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthorisationCode#PreAuthorisedFile
 * AuthorisationCode.mmPreAuthorisedFile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthorisationCode#FileLevelAuthorisationDetails
 * AuthorisationCode.mmFileLevelAuthorisationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthorisationCode#FileLevelAuthorisationSummary
 * AuthorisationCode.mmFileLevelAuthorisationSummary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthorisationCode#InstructionLevelAuthorisation
 * AuthorisationCode.mmInstructionLevelAuthorisation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.Authorisation1Code
 * Authorisation1Code}</li>
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
 * <li>"AUTH"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AuthorisationCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the level of approval depending on a number of factors, including payment type, threshold amount or local country or operations practice."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AuthorisationCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates a file has been pre authorised or approved within the
	 * originating customer environment and no further approval is required.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthorisationCode
	 * AuthorisationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AUTH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreAuthorisedFile"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates a file has been pre authorised or approved within the originating customer environment and no further approval is required."
	 * </li>
	 * </ul>
	 */
	public static final AuthorisationCode PreAuthorisedFile = new AuthorisationCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreAuthorisedFile";
			definition = "Indicates a file has been pre authorised or approved within the originating customer environment and no further approval is required.";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthorisationCode.mmObject();
			codeName = "AUTH";
		}
	};
	/**
	 * Indicates that a file requires additional file level approval, with the
	 * ability to view both the payment information block and supporting
	 * customer credit transaction detail.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthorisationCode
	 * AuthorisationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FDET"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FileLevelAuthorisationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that a file requires additional file level approval, with the ability to view both the payment information block and supporting customer credit transaction detail."
	 * </li>
	 * </ul>
	 */
	public static final AuthorisationCode FileLevelAuthorisationDetails = new AuthorisationCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FileLevelAuthorisationDetails";
			definition = "Indicates that a file requires additional file level approval, with the ability to view both the payment information block and supporting customer credit transaction detail.";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthorisationCode.mmObject();
			codeName = "FDET";
		}
	};
	/**
	 * Indicates that a file requires additional file level approval, with the
	 * ability to view only the payment information block level information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthorisationCode
	 * AuthorisationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FSUM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FileLevelAuthorisationSummary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that a file requires additional file level approval, with the ability to view only the payment information block level information."
	 * </li>
	 * </ul>
	 */
	public static final AuthorisationCode FileLevelAuthorisationSummary = new AuthorisationCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FileLevelAuthorisationSummary";
			definition = "Indicates that a file requires additional file level approval, with the ability to view only the payment information block level information.";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthorisationCode.mmObject();
			codeName = "FSUM";
		}
	};
	/**
	 * Indicates that a file requires all customer transactions to be authorised
	 * or approved.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthorisationCode
	 * AuthorisationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ILEV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionLevelAuthorisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that a file requires all customer transactions to be authorised or approved."
	 * </li>
	 * </ul>
	 */
	public static final AuthorisationCode InstructionLevelAuthorisation = new AuthorisationCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionLevelAuthorisation";
			definition = "Indicates that a file requires all customer transactions to be authorised or approved.";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthorisationCode.mmObject();
			codeName = "ILEV";
		}
	};
	final static private LinkedHashMap<String, AuthorisationCode> codesByName = new LinkedHashMap<>();

	protected AuthorisationCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("AUTH");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AuthorisationCode";
				definition = "Specifies the level of approval depending on a number of factors, including payment type, threshold amount or local country or operations practice.";
				derivation_lazy = () -> Arrays.asList(Authorisation1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AuthorisationCode.PreAuthorisedFile, com.tools20022.repository.codeset.AuthorisationCode.FileLevelAuthorisationDetails,
						com.tools20022.repository.codeset.AuthorisationCode.FileLevelAuthorisationSummary, com.tools20022.repository.codeset.AuthorisationCode.InstructionLevelAuthorisation);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(PreAuthorisedFile.getCodeName().get(), PreAuthorisedFile);
		codesByName.put(FileLevelAuthorisationDetails.getCodeName().get(), FileLevelAuthorisationDetails);
		codesByName.put(FileLevelAuthorisationSummary.getCodeName().get(), FileLevelAuthorisationSummary);
		codesByName.put(InstructionLevelAuthorisation.getCodeName().get(), InstructionLevelAuthorisation);
	}

	public static AuthorisationCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AuthorisationCode[] values() {
		AuthorisationCode[] values = new AuthorisationCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AuthorisationCode> {
		@Override
		public AuthorisationCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AuthorisationCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}