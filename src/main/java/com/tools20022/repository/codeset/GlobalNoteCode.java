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
 * Identifies if the security will be issued in New Global Note (NGN) or
 * Classical Global Note (CGN).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GlobalNoteCode#NewGlobalNote
 * GlobalNoteCode.NewGlobalNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GlobalNoteCode#ClassicalGlobalNote
 * GlobalNoteCode.ClassicalGlobalNote}</li>
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
public class GlobalNoteCode {

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
	public static final MMCode NewGlobalNote = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewGlobalNote";
			definition = "Form of global certificate which refers to the books and records of the ICSDs to determine the Issue Outstanding Amount (IOA).";
			owner_lazy = () -> GlobalNoteCode.mmObject();
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
	public static final MMCode ClassicalGlobalNote = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClassicalGlobalNote";
			definition = "Form of global certificate which requires physical annotation on the attached schedule to reflect changes in the Issue Outstanding Amount (IOA).";
			owner_lazy = () -> GlobalNoteCode.mmObject();
			codeName = "CGNO";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("NGNO");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "GlobalNoteCode";
				definition = "Identifies if the security will be issued in New Global Note (NGN) or Classical Global Note (CGN).";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.GlobalNoteCode.NewGlobalNote, com.tools20022.repository.codeset.GlobalNoteCode.ClassicalGlobalNote);
			}
		});
		return mmObject_lazy.get();
	}
}