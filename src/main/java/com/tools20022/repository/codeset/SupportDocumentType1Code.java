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
import com.tools20022.repository.codeset.SupportDocumentType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies a type of supporting document.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SupportDocumentType1Code#LetterFromBank
 * SupportDocumentType1Code.LetterFromBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SupportDocumentType1Code#LetterToBank
 * SupportDocumentType1Code.LetterToBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SupportDocumentType1Code#SupportingDocument
 * SupportDocumentType1Code.SupportingDocument}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.SupportDocumentTypeCode
 * SupportDocumentTypeCode}</li>
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
 * "SupportDocumentType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies a type of supporting document."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SupportDocumentType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SupportDocumentType1Code
	 * SupportDocumentType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LetterFromBank"</li>
	 * </ul>
	 */
	public static final SupportDocumentType1Code LetterFromBank = new SupportDocumentType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LetterFromBank";
			owner_lazy = () -> com.tools20022.repository.codeset.SupportDocumentType1Code.mmObject();
			codeName = SupportDocumentTypeCode.LetterFromBank.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SupportDocumentType1Code
	 * SupportDocumentType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LetterToBank"</li>
	 * </ul>
	 */
	public static final SupportDocumentType1Code LetterToBank = new SupportDocumentType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LetterToBank";
			owner_lazy = () -> com.tools20022.repository.codeset.SupportDocumentType1Code.mmObject();
			codeName = SupportDocumentTypeCode.LetterToBank.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SupportDocumentType1Code
	 * SupportDocumentType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupportingDocument"</li>
	 * </ul>
	 */
	public static final SupportDocumentType1Code SupportingDocument = new SupportDocumentType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupportingDocument";
			owner_lazy = () -> com.tools20022.repository.codeset.SupportDocumentType1Code.mmObject();
			codeName = SupportDocumentTypeCode.SupportingDocument.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, SupportDocumentType1Code> codesByName = new LinkedHashMap<>();

	protected SupportDocumentType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SupportDocumentType1Code";
				definition = "Specifies a type of supporting document.";
				trace_lazy = () -> SupportDocumentTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SupportDocumentType1Code.LetterFromBank, com.tools20022.repository.codeset.SupportDocumentType1Code.LetterToBank,
						com.tools20022.repository.codeset.SupportDocumentType1Code.SupportingDocument);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(LetterFromBank.getCodeName().get(), LetterFromBank);
		codesByName.put(LetterToBank.getCodeName().get(), LetterToBank);
		codesByName.put(SupportingDocument.getCodeName().get(), SupportingDocument);
	}

	public static SupportDocumentType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SupportDocumentType1Code[] values() {
		SupportDocumentType1Code[] values = new SupportDocumentType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SupportDocumentType1Code> {
		@Override
		public SupportDocumentType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SupportDocumentType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}