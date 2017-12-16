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
import com.tools20022.repository.codeset.UKTaxGroupUnitCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the UK tax group to which units belong. For UK tax, the first
 * dividend that an investor receives from a funds investment is deemed to be
 * part income and part return of capital. The capital element is
 * 'equalisation', and is exempt from income tax.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.UKTaxGroupUnitCode#Group1
 * UKTaxGroupUnitCode.mmGroup1}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UKTaxGroupUnitCode#Group2
 * UKTaxGroupUnitCode.mmGroup2}</li>
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
 * <li>"GRP1"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UKTaxGroupUnitCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the UK tax group to which units belong. For UK tax, the first dividend that an investor receives from a funds investment is deemed to be part income and part return of capital. The capital element is 'equalisation', and is exempt from income tax."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class UKTaxGroupUnitCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * The units that were purchased prior to the last ex-div date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UKTaxGroupUnitCode
	 * UKTaxGroupUnitCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GRP1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Group1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The units that were purchased prior to the last ex-div date."</li>
	 * </ul>
	 */
	public static final UKTaxGroupUnitCode Group1 = new UKTaxGroupUnitCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Group1";
			definition = "The units that were purchased prior to the last ex-div date.";
			owner_lazy = () -> com.tools20022.repository.codeset.UKTaxGroupUnitCode.mmObject();
			codeName = "GRP1";
		}
	};
	/**
	 * The units that were purchased since the ex-div date, and that benefit
	 * from the tax exemption.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UKTaxGroupUnitCode
	 * UKTaxGroupUnitCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GRP2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Group2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The units that were purchased since the ex-div date, and that benefit from the tax exemption."
	 * </li>
	 * </ul>
	 */
	public static final UKTaxGroupUnitCode Group2 = new UKTaxGroupUnitCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Group2";
			definition = "The units that were purchased since the ex-div date, and that benefit from the tax exemption.";
			owner_lazy = () -> com.tools20022.repository.codeset.UKTaxGroupUnitCode.mmObject();
			codeName = "GRP2";
		}
	};
	final static private LinkedHashMap<String, UKTaxGroupUnitCode> codesByName = new LinkedHashMap<>();

	protected UKTaxGroupUnitCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("GRP1");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UKTaxGroupUnitCode";
				definition = "Specifies the UK tax group to which units belong. For UK tax, the first dividend that an investor receives from a funds investment is deemed to be part income and part return of capital. The capital element is 'equalisation', and is exempt from income tax.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.UKTaxGroupUnitCode.Group1, com.tools20022.repository.codeset.UKTaxGroupUnitCode.Group2);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Group1.getCodeName().get(), Group1);
		codesByName.put(Group2.getCodeName().get(), Group2);
	}

	public static UKTaxGroupUnitCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static UKTaxGroupUnitCode[] values() {
		UKTaxGroupUnitCode[] values = new UKTaxGroupUnitCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, UKTaxGroupUnitCode> {
		@Override
		public UKTaxGroupUnitCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(UKTaxGroupUnitCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}