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
import com.tools20022.repository.codeset.GlobalNoteCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Identifies if the security will be issued in New Global Note (NGN) or
 * Classical Global Note (CGN).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GlobalNoteCode#NewGlobalNote
 * GlobalNoteCode.mmNewGlobalNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GlobalNoteCode#ClassicalGlobalNote
 * GlobalNoteCode.mmClassicalGlobalNote}</li>
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
 * <li>"NGNO"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "GlobalNoteCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies if the security will be issued in New Global Note (NGN) or Classical Global Note (CGN)."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class GlobalNoteCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Form of global certificate which refers to the books and records of the
	 * ICSDs to determine the Issue Outstanding Amount (IOA).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GlobalNoteCode
	 * GlobalNoteCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NGNO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewGlobalNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Form of global certificate which refers to the books and records of the ICSDs to determine the Issue Outstanding Amount (IOA)."
	 * </li>
	 * </ul>
	 */
	public static final GlobalNoteCode NewGlobalNote = new GlobalNoteCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewGlobalNote";
			definition = "Form of global certificate which refers to the books and records of the ICSDs to determine the Issue Outstanding Amount (IOA).";
			owner_lazy = () -> com.tools20022.repository.codeset.GlobalNoteCode.mmObject();
			codeName = "NGNO";
		}
	};
	/**
	 * Form of global certificate which requires physical annotation on the
	 * attached schedule to reflect changes in the Issue Outstanding Amount
	 * (IOA).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GlobalNoteCode
	 * GlobalNoteCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CGNO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClassicalGlobalNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Form of global certificate which requires physical annotation on the attached schedule to reflect changes in the Issue Outstanding Amount (IOA)."
	 * </li>
	 * </ul>
	 */
	public static final GlobalNoteCode ClassicalGlobalNote = new GlobalNoteCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClassicalGlobalNote";
			definition = "Form of global certificate which requires physical annotation on the attached schedule to reflect changes in the Issue Outstanding Amount (IOA).";
			owner_lazy = () -> com.tools20022.repository.codeset.GlobalNoteCode.mmObject();
			codeName = "CGNO";
		}
	};
	final static private LinkedHashMap<String, GlobalNoteCode> codesByName = new LinkedHashMap<>();

	protected GlobalNoteCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("NGNO");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "GlobalNoteCode";
				definition = "Identifies if the security will be issued in New Global Note (NGN) or Classical Global Note (CGN).";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.GlobalNoteCode.NewGlobalNote, com.tools20022.repository.codeset.GlobalNoteCode.ClassicalGlobalNote);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(NewGlobalNote.getCodeName().get(), NewGlobalNote);
		codesByName.put(ClassicalGlobalNote.getCodeName().get(), ClassicalGlobalNote);
	}

	public static GlobalNoteCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static GlobalNoteCode[] values() {
		GlobalNoteCode[] values = new GlobalNoteCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, GlobalNoteCode> {
		@Override
		public GlobalNoteCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(GlobalNoteCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}