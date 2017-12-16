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
import com.tools20022.repository.codeset.MandateClassification1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of direct debit amount, such as fixed or variable.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MandateClassification1Code#Fixed
 * MandateClassification1Code.mmFixed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MandateClassification1Code#UsageBased
 * MandateClassification1Code.mmUsageBased}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MandateClassification1Code#Variable
 * MandateClassification1Code.mmVariable}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.MandateClassificationCode
 * MandateClassificationCode}</li>
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
 * "MandateClassification1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of direct debit amount, such as fixed or variable."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class MandateClassification1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MandateClassification1Code
	 * MandateClassification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Fixed"</li>
	 * </ul>
	 */
	public static final MandateClassification1Code Fixed = new MandateClassification1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Fixed";
			owner_lazy = () -> com.tools20022.repository.codeset.MandateClassification1Code.mmObject();
			codeName = MandateClassificationCode.Fixed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MandateClassification1Code
	 * MandateClassification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UsageBased"</li>
	 * </ul>
	 */
	public static final MandateClassification1Code UsageBased = new MandateClassification1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UsageBased";
			owner_lazy = () -> com.tools20022.repository.codeset.MandateClassification1Code.mmObject();
			codeName = MandateClassificationCode.UsageBased.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MandateClassification1Code
	 * MandateClassification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Variable"</li>
	 * </ul>
	 */
	public static final MandateClassification1Code Variable = new MandateClassification1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Variable";
			owner_lazy = () -> com.tools20022.repository.codeset.MandateClassification1Code.mmObject();
			codeName = MandateClassificationCode.Variable.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, MandateClassification1Code> codesByName = new LinkedHashMap<>();

	protected MandateClassification1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MandateClassification1Code";
				definition = "Specifies the type of direct debit amount, such as fixed or variable.";
				trace_lazy = () -> MandateClassificationCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MandateClassification1Code.Fixed, com.tools20022.repository.codeset.MandateClassification1Code.UsageBased,
						com.tools20022.repository.codeset.MandateClassification1Code.Variable);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Fixed.getCodeName().get(), Fixed);
		codesByName.put(UsageBased.getCodeName().get(), UsageBased);
		codesByName.put(Variable.getCodeName().get(), Variable);
	}

	public static MandateClassification1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static MandateClassification1Code[] values() {
		MandateClassification1Code[] values = new MandateClassification1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, MandateClassification1Code> {
		@Override
		public MandateClassification1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(MandateClassification1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}