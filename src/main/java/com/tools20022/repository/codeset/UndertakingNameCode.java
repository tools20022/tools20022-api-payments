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
import com.tools20022.repository.codeset.UndertakingNameCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the named type of the undertaking.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UndertakingNameCode#DemandGuarantee
 * UndertakingNameCode.mmDemandGuarantee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UndertakingNameCode#StandbyLetterOfCredit
 * UndertakingNameCode.mmStandbyLetterOfCredit}</li>
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
 * <li>"DGAR"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UndertakingNameCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the named type of the undertaking."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class UndertakingNameCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Undertaking is a demand guarantee.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UndertakingNameCode
	 * UndertakingNameCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DGAR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DemandGuarantee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Undertaking is a demand guarantee."</li>
	 * </ul>
	 */
	public static final UndertakingNameCode DemandGuarantee = new UndertakingNameCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DemandGuarantee";
			definition = "Undertaking is a demand guarantee.";
			owner_lazy = () -> com.tools20022.repository.codeset.UndertakingNameCode.mmObject();
			codeName = "DGAR";
		}
	};
	/**
	 * Undertaking is a standby letter of credit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UndertakingNameCode
	 * UndertakingNameCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STBY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandbyLetterOfCredit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Undertaking is a standby letter of credit."</li>
	 * </ul>
	 */
	public static final UndertakingNameCode StandbyLetterOfCredit = new UndertakingNameCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandbyLetterOfCredit";
			definition = "Undertaking is a standby letter of credit.";
			owner_lazy = () -> com.tools20022.repository.codeset.UndertakingNameCode.mmObject();
			codeName = "STBY";
		}
	};
	final static private LinkedHashMap<String, UndertakingNameCode> codesByName = new LinkedHashMap<>();

	protected UndertakingNameCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("DGAR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UndertakingNameCode";
				definition = "Specifies the named type of the undertaking.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.UndertakingNameCode.DemandGuarantee, com.tools20022.repository.codeset.UndertakingNameCode.StandbyLetterOfCredit);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(DemandGuarantee.getCodeName().get(), DemandGuarantee);
		codesByName.put(StandbyLetterOfCredit.getCodeName().get(), StandbyLetterOfCredit);
	}

	public static UndertakingNameCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static UndertakingNameCode[] values() {
		UndertakingNameCode[] values = new UndertakingNameCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, UndertakingNameCode> {
		@Override
		public UndertakingNameCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(UndertakingNameCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}