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
import com.tools20022.repository.codeset.Authorisation1Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.Authorisation1Code#PreAuthorisedFile
 * Authorisation1Code.PreAuthorisedFile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Authorisation1Code#FileLevelAuthorisationDetails
 * Authorisation1Code.FileLevelAuthorisationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Authorisation1Code#FileLevelAuthorisationSummary
 * Authorisation1Code.FileLevelAuthorisationSummary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Authorisation1Code#InstructionLevelAuthorisation
 * Authorisation1Code.InstructionLevelAuthorisation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.AuthorisationCode
 * AuthorisationCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
 * "Authorisation1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the level of approval depending on a number of factors, including payment type, threshold amount or local country or operations practice."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class Authorisation1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Authorisation1Code
	 * Authorisation1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreAuthorisedFile"</li>
	 * </ul>
	 */
	public static final Authorisation1Code PreAuthorisedFile = new Authorisation1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreAuthorisedFile";
			owner_lazy = () -> com.tools20022.repository.codeset.Authorisation1Code.mmObject();
			codeName = AuthorisationCode.PreAuthorisedFile.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Authorisation1Code
	 * Authorisation1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FileLevelAuthorisationDetails"</li>
	 * </ul>
	 */
	public static final Authorisation1Code FileLevelAuthorisationDetails = new Authorisation1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FileLevelAuthorisationDetails";
			owner_lazy = () -> com.tools20022.repository.codeset.Authorisation1Code.mmObject();
			codeName = AuthorisationCode.FileLevelAuthorisationDetails.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Authorisation1Code
	 * Authorisation1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FileLevelAuthorisationSummary"</li>
	 * </ul>
	 */
	public static final Authorisation1Code FileLevelAuthorisationSummary = new Authorisation1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FileLevelAuthorisationSummary";
			owner_lazy = () -> com.tools20022.repository.codeset.Authorisation1Code.mmObject();
			codeName = AuthorisationCode.FileLevelAuthorisationSummary.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Authorisation1Code
	 * Authorisation1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionLevelAuthorisation"</li>
	 * </ul>
	 */
	public static final Authorisation1Code InstructionLevelAuthorisation = new Authorisation1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionLevelAuthorisation";
			owner_lazy = () -> com.tools20022.repository.codeset.Authorisation1Code.mmObject();
			codeName = AuthorisationCode.InstructionLevelAuthorisation.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, Authorisation1Code> codesByName = new LinkedHashMap<>();

	protected Authorisation1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("AUTH");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Authorisation1Code";
				definition = "Specifies the level of approval depending on a number of factors, including payment type, threshold amount or local country or operations practice.";
				trace_lazy = () -> AuthorisationCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.Authorisation1Code.PreAuthorisedFile, com.tools20022.repository.codeset.Authorisation1Code.FileLevelAuthorisationDetails,
						com.tools20022.repository.codeset.Authorisation1Code.FileLevelAuthorisationSummary, com.tools20022.repository.codeset.Authorisation1Code.InstructionLevelAuthorisation);
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

	public static Authorisation1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static Authorisation1Code[] values() {
		Authorisation1Code[] values = new Authorisation1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, Authorisation1Code> {
		@Override
		public Authorisation1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(Authorisation1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}