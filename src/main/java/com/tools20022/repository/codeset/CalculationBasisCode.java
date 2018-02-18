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
import com.tools20022.repository.codeset.CalculationBasisCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the calculation basis.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationBasisCode#Average
 * CalculationBasisCode.Average}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CalculationBasisCode#Daily
 * CalculationBasisCode.Daily}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CalculationBasisCode#Other
 * CalculationBasisCode.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationBasisCode#Monthly
 * CalculationBasisCode.Monthly}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationBasisCode#Annual
 * CalculationBasisCode.Annual}</li>
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
 * <li>"AVER"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CalculationBasisCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the calculation basis."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CalculationBasisCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Average basis.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationBasisCode
	 * CalculationBasisCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AVER"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Average"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Average basis."</li>
	 * </ul>
	 */
	public static final CalculationBasisCode Average = new CalculationBasisCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Average";
			definition = "Average basis.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationBasisCode.mmObject();
			codeName = "AVER";
		}
	};
	/**
	 * Daily basis.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationBasisCode
	 * CalculationBasisCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DAIL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Daily"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Daily basis."</li>
	 * </ul>
	 */
	public static final CalculationBasisCode Daily = new CalculationBasisCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Daily";
			definition = "Daily basis.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationBasisCode.mmObject();
			codeName = "DAIL";
		}
	};
	/**
	 * Another type of calculation basis.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationBasisCode
	 * CalculationBasisCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Another type of calculation basis."</li>
	 * </ul>
	 */
	public static final CalculationBasisCode Other = new CalculationBasisCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Other";
			definition = "Another type of calculation basis.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationBasisCode.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Monthly basis.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationBasisCode
	 * CalculationBasisCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MNTH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Monthly"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Monthly basis."</li>
	 * </ul>
	 */
	public static final CalculationBasisCode Monthly = new CalculationBasisCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Monthly";
			definition = "Monthly basis.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationBasisCode.mmObject();
			codeName = "MNTH";
		}
	};
	/**
	 * Yearly basis.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationBasisCode
	 * CalculationBasisCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "YEAR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Annual"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Yearly basis."</li>
	 * </ul>
	 */
	public static final CalculationBasisCode Annual = new CalculationBasisCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Annual";
			definition = "Yearly basis.";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationBasisCode.mmObject();
			codeName = "YEAR";
		}
	};
	final static private LinkedHashMap<String, CalculationBasisCode> codesByName = new LinkedHashMap<>();

	protected CalculationBasisCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("AVER");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CalculationBasisCode";
				definition = "Specifies the calculation basis.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CalculationBasisCode.Average, com.tools20022.repository.codeset.CalculationBasisCode.Daily, com.tools20022.repository.codeset.CalculationBasisCode.Other,
						com.tools20022.repository.codeset.CalculationBasisCode.Monthly, com.tools20022.repository.codeset.CalculationBasisCode.Annual);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Average.getCodeName().get(), Average);
		codesByName.put(Daily.getCodeName().get(), Daily);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(Monthly.getCodeName().get(), Monthly);
		codesByName.put(Annual.getCodeName().get(), Annual);
	}

	public static CalculationBasisCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CalculationBasisCode[] values() {
		CalculationBasisCode[] values = new CalculationBasisCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CalculationBasisCode> {
		@Override
		public CalculationBasisCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CalculationBasisCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}