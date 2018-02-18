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
import com.tools20022.repository.codeset.PEPISACode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of Transfer, PEP or ISA.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.PEPISACode#PEP
 * PEPISACode.PEP}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PEPISACode#ISA
 * PEPISACode.ISA}</li>
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
 * <li>"PEPT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PEPISACode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of Transfer, PEP or ISA."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PEPISACode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Personal equity plan.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PEPISACode PEPISACode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PEPT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PEP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Personal equity plan."</li>
	 * </ul>
	 */
	public static final PEPISACode PEP = new PEPISACode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PEP";
			definition = "Personal equity plan.";
			owner_lazy = () -> com.tools20022.repository.codeset.PEPISACode.mmObject();
			codeName = "PEPT";
		}
	};
	/**
	 * Individual savings account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PEPISACode PEPISACode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ISAT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ISA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Individual savings account."</li>
	 * </ul>
	 */
	public static final PEPISACode ISA = new PEPISACode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ISA";
			definition = "Individual savings account.";
			owner_lazy = () -> com.tools20022.repository.codeset.PEPISACode.mmObject();
			codeName = "ISAT";
		}
	};
	final static private LinkedHashMap<String, PEPISACode> codesByName = new LinkedHashMap<>();

	protected PEPISACode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("PEPT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PEPISACode";
				definition = "Specifies the type of Transfer, PEP or ISA.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PEPISACode.PEP, com.tools20022.repository.codeset.PEPISACode.ISA);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(PEP.getCodeName().get(), PEP);
		codesByName.put(ISA.getCodeName().get(), ISA);
	}

	public static PEPISACode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PEPISACode[] values() {
		PEPISACode[] values = new PEPISACode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PEPISACode> {
		@Override
		public PEPISACode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PEPISACode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}