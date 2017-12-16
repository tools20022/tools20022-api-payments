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
import com.tools20022.repository.codeset.MandateClassificationCode.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.MandateClassificationCode#Fixed
 * MandateClassificationCode.mmFixed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MandateClassificationCode#Variable
 * MandateClassificationCode.mmVariable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MandateClassificationCode#UsageBased
 * MandateClassificationCode.mmUsageBased}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.MandateClassification1Code
 * MandateClassification1Code}</li>
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
 * <li>"FIXE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MandateClassificationCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of direct debit amount, such as fixed or variable."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class MandateClassificationCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Direct debit amount is fixed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MandateClassificationCode
	 * MandateClassificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FIXE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Fixed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Direct debit amount is fixed."</li>
	 * </ul>
	 */
	public static final MandateClassificationCode Fixed = new MandateClassificationCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Fixed";
			definition = "Direct debit amount is fixed.";
			owner_lazy = () -> com.tools20022.repository.codeset.MandateClassificationCode.mmObject();
			codeName = "FIXE";
		}
	};
	/**
	 * Direct debit amount is variable.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MandateClassificationCode
	 * MandateClassificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VARI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Variable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Direct debit amount is variable."</li>
	 * </ul>
	 */
	public static final MandateClassificationCode Variable = new MandateClassificationCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Variable";
			definition = "Direct debit amount is variable.";
			owner_lazy = () -> com.tools20022.repository.codeset.MandateClassificationCode.mmObject();
			codeName = "VARI";
		}
	};
	/**
	 * Direct debit amount is based on usage.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MandateClassificationCode
	 * MandateClassificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "USGB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UsageBased"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Direct debit amount is based on usage."</li>
	 * </ul>
	 */
	public static final MandateClassificationCode UsageBased = new MandateClassificationCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UsageBased";
			definition = "Direct debit amount is based on usage.";
			owner_lazy = () -> com.tools20022.repository.codeset.MandateClassificationCode.mmObject();
			codeName = "USGB";
		}
	};
	final static private LinkedHashMap<String, MandateClassificationCode> codesByName = new LinkedHashMap<>();

	protected MandateClassificationCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("FIXE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MandateClassificationCode";
				definition = "Specifies the type of direct debit amount, such as fixed or variable.";
				derivation_lazy = () -> Arrays.asList(MandateClassification1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MandateClassificationCode.Fixed, com.tools20022.repository.codeset.MandateClassificationCode.Variable,
						com.tools20022.repository.codeset.MandateClassificationCode.UsageBased);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Fixed.getCodeName().get(), Fixed);
		codesByName.put(Variable.getCodeName().get(), Variable);
		codesByName.put(UsageBased.getCodeName().get(), UsageBased);
	}

	public static MandateClassificationCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static MandateClassificationCode[] values() {
		MandateClassificationCode[] values = new MandateClassificationCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, MandateClassificationCode> {
		@Override
		public MandateClassificationCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(MandateClassificationCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}