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
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies if this document is a copy, a duplicate, or a duplicate of a copy.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CopyDuplicateCode#mmCopyDuplicate
 * CopyDuplicateCode.mmCopyDuplicate}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CopyDuplicateCode#mmCopy
 * CopyDuplicateCode.mmCopy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CopyDuplicateCode#mmDuplicate
 * CopyDuplicateCode.mmDuplicate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.CopyDuplicate1Code
 * CopyDuplicate1Code}</li>
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
 * <li>"CODU"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CopyDuplicateCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies if this document is a copy, a duplicate, or a duplicate of a copy."
 * </li>
 * </ul>
 */
public class CopyDuplicateCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Message is being sent as a copy to a party other than the account owner,
	 * for information purposes and the message is a duplicate of a message
	 * previously sent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CopyDuplicateCode
	 * CopyDuplicateCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CODU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CopyDuplicate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Message is being sent as a copy to a party other than the account owner, for information purposes and the message is a duplicate of a message previously sent."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCopyDuplicate = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CopyDuplicate";
			definition = "Message is being sent as a copy to a party other than the account owner, for information purposes and the message is a duplicate of a message previously sent.";
			owner_lazy = () -> CopyDuplicateCode.mmObject();
			codeName = "CODU";
		}
	};
	/**
	 * Message is being sent as a copy to a party other than the account owner,
	 * for information purposes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CopyDuplicateCode
	 * CopyDuplicateCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COPY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Copy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Message is being sent as a copy to a party other than the account owner, for information purposes."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCopy = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Copy";
			definition = "Message is being sent as a copy to a party other than the account owner, for information purposes.";
			owner_lazy = () -> CopyDuplicateCode.mmObject();
			codeName = "COPY";
		}
	};
	/**
	 * Message is for information/confirmation purposes. It is a duplicate of a
	 * message previously sent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CopyDuplicateCode
	 * CopyDuplicateCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DUPL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Duplicate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Message is for information/confirmation purposes. It is a duplicate of a message previously sent."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDuplicate = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Duplicate";
			definition = "Message is for information/confirmation purposes. It is a duplicate of a message previously sent.";
			owner_lazy = () -> CopyDuplicateCode.mmObject();
			codeName = "DUPL";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("CODU");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CopyDuplicateCode";
				definition = "Specifies if this document is a copy, a duplicate, or a duplicate of a copy.";
				code_lazy = () -> Arrays.asList(CopyDuplicateCode.mmCopyDuplicate, CopyDuplicateCode.mmCopy, CopyDuplicateCode.mmDuplicate);
				derivation_lazy = () -> Arrays.asList(CopyDuplicate1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}