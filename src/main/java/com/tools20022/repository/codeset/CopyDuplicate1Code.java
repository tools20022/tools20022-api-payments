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
import com.tools20022.repository.codeset.CopyDuplicate1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies if this document is a copy, a duplicate, or a duplicate of a copy.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CopyDuplicate1Code#CopyDuplicate
 * CopyDuplicate1Code.mmCopyDuplicate}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CopyDuplicate1Code#Copy
 * CopyDuplicate1Code.mmCopy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CopyDuplicate1Code#Duplicate
 * CopyDuplicate1Code.mmDuplicate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CopyDuplicateCode
 * CopyDuplicateCode}</li>
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
 * "CopyDuplicate1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies if this document is a copy, a duplicate, or a duplicate of a copy."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CopyDuplicate1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CopyDuplicate1Code
	 * CopyDuplicate1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CopyDuplicate"</li>
	 * </ul>
	 */
	public static final CopyDuplicate1Code CopyDuplicate = new CopyDuplicate1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CopyDuplicate";
			owner_lazy = () -> com.tools20022.repository.codeset.CopyDuplicate1Code.mmObject();
			codeName = CopyDuplicateCode.CopyDuplicate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CopyDuplicate1Code
	 * CopyDuplicate1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Copy"</li>
	 * </ul>
	 */
	public static final CopyDuplicate1Code Copy = new CopyDuplicate1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Copy";
			owner_lazy = () -> com.tools20022.repository.codeset.CopyDuplicate1Code.mmObject();
			codeName = CopyDuplicateCode.Copy.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CopyDuplicate1Code
	 * CopyDuplicate1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Duplicate"</li>
	 * </ul>
	 */
	public static final CopyDuplicate1Code Duplicate = new CopyDuplicate1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Duplicate";
			owner_lazy = () -> com.tools20022.repository.codeset.CopyDuplicate1Code.mmObject();
			codeName = CopyDuplicateCode.Duplicate.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CopyDuplicate1Code> codesByName = new LinkedHashMap<>();

	protected CopyDuplicate1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("CODU");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CopyDuplicate1Code";
				definition = "Specifies if this document is a copy, a duplicate, or a duplicate of a copy.";
				trace_lazy = () -> CopyDuplicateCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CopyDuplicate1Code.CopyDuplicate, com.tools20022.repository.codeset.CopyDuplicate1Code.Copy, com.tools20022.repository.codeset.CopyDuplicate1Code.Duplicate);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CopyDuplicate.getCodeName().get(), CopyDuplicate);
		codesByName.put(Copy.getCodeName().get(), Copy);
		codesByName.put(Duplicate.getCodeName().get(), Duplicate);
	}

	public static CopyDuplicate1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CopyDuplicate1Code[] values() {
		CopyDuplicate1Code[] values = new CopyDuplicate1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CopyDuplicate1Code> {
		@Override
		public CopyDuplicate1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CopyDuplicate1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}