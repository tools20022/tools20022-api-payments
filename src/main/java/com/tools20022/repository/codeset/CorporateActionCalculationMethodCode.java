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
import com.tools20022.repository.codeset.CorporateActionCalculationMethodCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the calculation method.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionCalculationMethodCode#ProRata
 * CorporateActionCalculationMethodCode.mmProRata}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionCalculationMethodCode#Lottery
 * CorporateActionCalculationMethodCode.mmLottery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionCalculationMethodCode#NominalReduction
 * CorporateActionCalculationMethodCode.mmNominalReduction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionCalculationMethodCode#NoNominalReduction
 * CorporateActionCalculationMethodCode.mmNoNominalReduction}</li>
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
 * <li>"PROR"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionCalculationMethodCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the calculation method."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CorporateActionCalculationMethodCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Pro-rata for drawings.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionCalculationMethodCode
	 * CorporateActionCalculationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PROR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProRata"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Pro-rata for drawings."</li>
	 * </ul>
	 */
	public static final CorporateActionCalculationMethodCode ProRata = new CorporateActionCalculationMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProRata";
			definition = "Pro-rata for drawings.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionCalculationMethodCode.mmObject();
			codeName = "PROR";
		}
	};
	/**
	 * Lottery for drawings.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionCalculationMethodCode
	 * CorporateActionCalculationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LOTT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Lottery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Lottery for drawings."</li>
	 * </ul>
	 */
	public static final CorporateActionCalculationMethodCode Lottery = new CorporateActionCalculationMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Lottery";
			definition = "Lottery for drawings.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionCalculationMethodCode.mmObject();
			codeName = "LOTT";
		}
	};
	/**
	 * Reduction of nominal for partial redemption.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionCalculationMethodCode
	 * CorporateActionCalculationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOMI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NominalReduction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reduction of nominal for partial redemption."</li>
	 * </ul>
	 */
	public static final CorporateActionCalculationMethodCode NominalReduction = new CorporateActionCalculationMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NominalReduction";
			definition = "Reduction of nominal for partial redemption.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionCalculationMethodCode.mmObject();
			codeName = "NOMI";
		}
	};
	/**
	 * Without reduction of nominal (via pool factor) for partial redemption.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionCalculationMethodCode
	 * CorporateActionCalculationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NNOM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoNominalReduction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Without  reduction of nominal (via pool factor) for partial redemption."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionCalculationMethodCode NoNominalReduction = new CorporateActionCalculationMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NoNominalReduction";
			definition = "Without  reduction of nominal (via pool factor) for partial redemption.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionCalculationMethodCode.mmObject();
			codeName = "NNOM";
		}
	};
	final static private LinkedHashMap<String, CorporateActionCalculationMethodCode> codesByName = new LinkedHashMap<>();

	protected CorporateActionCalculationMethodCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("PROR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionCalculationMethodCode";
				definition = "Specifies the calculation method.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionCalculationMethodCode.ProRata, com.tools20022.repository.codeset.CorporateActionCalculationMethodCode.Lottery,
						com.tools20022.repository.codeset.CorporateActionCalculationMethodCode.NominalReduction, com.tools20022.repository.codeset.CorporateActionCalculationMethodCode.NoNominalReduction);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ProRata.getCodeName().get(), ProRata);
		codesByName.put(Lottery.getCodeName().get(), Lottery);
		codesByName.put(NominalReduction.getCodeName().get(), NominalReduction);
		codesByName.put(NoNominalReduction.getCodeName().get(), NoNominalReduction);
	}

	public static CorporateActionCalculationMethodCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CorporateActionCalculationMethodCode[] values() {
		CorporateActionCalculationMethodCode[] values = new CorporateActionCalculationMethodCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CorporateActionCalculationMethodCode> {
		@Override
		public CorporateActionCalculationMethodCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CorporateActionCalculationMethodCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}