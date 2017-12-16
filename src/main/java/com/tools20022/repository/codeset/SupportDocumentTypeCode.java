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
import com.tools20022.repository.codeset.SupportDocumentTypeCode.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.SupportDocumentTypeCode#SupportingDocument
 * SupportDocumentTypeCode.mmSupportingDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SupportDocumentTypeCode#LetterFromBank
 * SupportDocumentTypeCode.mmLetterFromBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SupportDocumentTypeCode#LetterToBank
 * SupportDocumentTypeCode.mmLetterToBank}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.SupportDocumentType1Code
 * SupportDocumentType1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SupportDocumentTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies a type of supporting document."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SupportDocumentTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Document is a supporting document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SupportDocumentTypeCode
	 * SupportDocumentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SUPP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupportingDocument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Document is a supporting document."</li>
	 * </ul>
	 */
	public static final SupportDocumentTypeCode SupportingDocument = new SupportDocumentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupportingDocument";
			definition = "Document is a supporting document.";
			owner_lazy = () -> com.tools20022.repository.codeset.SupportDocumentTypeCode.mmObject();
			codeName = "SUPP";
		}
	};
	/**
	 * Document is a letter from the bank.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SupportDocumentTypeCode
	 * SupportDocumentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LFBK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LetterFromBank"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Document is a letter from the bank."</li>
	 * </ul>
	 */
	public static final SupportDocumentTypeCode LetterFromBank = new SupportDocumentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LetterFromBank";
			definition = "Document is a letter from the bank.";
			owner_lazy = () -> com.tools20022.repository.codeset.SupportDocumentTypeCode.mmObject();
			codeName = "LFBK";
		}
	};
	/**
	 * Document is a letter to the bank.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SupportDocumentTypeCode
	 * SupportDocumentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LTBK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LetterToBank"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Document is a letter to the bank."</li>
	 * </ul>
	 */
	public static final SupportDocumentTypeCode LetterToBank = new SupportDocumentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LetterToBank";
			definition = "Document is a letter to the bank.";
			owner_lazy = () -> com.tools20022.repository.codeset.SupportDocumentTypeCode.mmObject();
			codeName = "LTBK";
		}
	};
	final static private LinkedHashMap<String, SupportDocumentTypeCode> codesByName = new LinkedHashMap<>();

	protected SupportDocumentTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SupportDocumentTypeCode";
				definition = "Specifies a type of supporting document.";
				derivation_lazy = () -> Arrays.asList(SupportDocumentType1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SupportDocumentTypeCode.SupportingDocument, com.tools20022.repository.codeset.SupportDocumentTypeCode.LetterFromBank,
						com.tools20022.repository.codeset.SupportDocumentTypeCode.LetterToBank);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(SupportingDocument.getCodeName().get(), SupportingDocument);
		codesByName.put(LetterFromBank.getCodeName().get(), LetterFromBank);
		codesByName.put(LetterToBank.getCodeName().get(), LetterToBank);
	}

	public static SupportDocumentTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SupportDocumentTypeCode[] values() {
		SupportDocumentTypeCode[] values = new SupportDocumentTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SupportDocumentTypeCode> {
		@Override
		public SupportDocumentTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SupportDocumentTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}