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
import com.tools20022.repository.codeset.CalculationMethodCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies whether the interest calculation method is simple or compounding.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationMethodCode#Simple
 * CalculationMethodCode.mmSimple}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationMethodCode#Compounding
 * CalculationMethodCode.mmCompounding}</li>
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
 * <li>"SIMP"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CalculationMethodCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies whether the interest calculation method is simple or compounding."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CalculationMethodCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Calculation method by which interest is calculated on the original
	 * principal only. Accumulated interest from prior periods is not used in
	 * calculations for the following periods.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationMethodCode
	 * CalculationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SIMP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Simple"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Calculation method by which interest is calculated on the original principal only. Accumulated interest from prior periods is not used in calculations for the following periods."
	 * </li>
	 * </ul>
	 */
	public static final CalculationMethodCode Simple = new CalculationMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Simple";
			definition = "Calculation method by which interest is calculated on the original principal only. Accumulated interest from prior periods is not used in calculations for the following periods.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationMethodCode.mmObject();
			codeName = "SIMP";
		}
	};
	/**
	 * Calculation method by which interest is calculated each period on the
	 * original principal and all interest accumulated during past periods.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationMethodCode
	 * CalculationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COMP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Compounding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Calculation method by which interest is calculated each period on the original principal and all interest accumulated during past periods."
	 * </li>
	 * </ul>
	 */
	public static final CalculationMethodCode Compounding = new CalculationMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Compounding";
			definition = "Calculation method by which interest is calculated each period on the original principal and all interest accumulated during past periods.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationMethodCode.mmObject();
			codeName = "COMP";
		}
	};
	final static private LinkedHashMap<String, CalculationMethodCode> codesByName = new LinkedHashMap<>();

	protected CalculationMethodCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("SIMP");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CalculationMethodCode";
				definition = "Specifies whether the interest calculation method is simple or compounding.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CalculationMethodCode.Simple, com.tools20022.repository.codeset.CalculationMethodCode.Compounding);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Simple.getCodeName().get(), Simple);
		codesByName.put(Compounding.getCodeName().get(), Compounding);
	}

	public static CalculationMethodCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CalculationMethodCode[] values() {
		CalculationMethodCode[] values = new CalculationMethodCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CalculationMethodCode> {
		@Override
		public CalculationMethodCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CalculationMethodCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}