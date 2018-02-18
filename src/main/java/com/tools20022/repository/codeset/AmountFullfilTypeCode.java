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
import com.tools20022.repository.codeset.AmountFullfilTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies if the redemption is partly or fully.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AmountFullfilTypeCode#Completely
 * AmountFullfilTypeCode.Completely}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AmountFullfilTypeCode#Partial
 * AmountFullfilTypeCode.Partial}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AmountFullfilTypeCode#TotalOrPartial
 * AmountFullfilTypeCode.TotalOrPartial}</li>
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
 * <li>"COMP"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AmountFullfilTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies if the redemption is partly or fully."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AmountFullfilTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Full redemption.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AmountFullfilTypeCode
	 * AmountFullfilTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COMP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Completely"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Full redemption."</li>
	 * </ul>
	 */
	public static final AmountFullfilTypeCode Completely = new AmountFullfilTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Completely";
			definition = "Full redemption.";
			owner_lazy = () -> com.tools20022.repository.codeset.AmountFullfilTypeCode.mmObject();
			codeName = "COMP";
		}
	};
	/**
	 * Partial redemption.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AmountFullfilTypeCode
	 * AmountFullfilTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PART"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Partial"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Partial redemption."</li>
	 * </ul>
	 */
	public static final AmountFullfilTypeCode Partial = new AmountFullfilTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Partial";
			definition = "Partial redemption.";
			owner_lazy = () -> com.tools20022.repository.codeset.AmountFullfilTypeCode.mmObject();
			codeName = "PART";
		}
	};
	/**
	 * Full or partial redemption.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AmountFullfilTypeCode
	 * AmountFullfilTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TOPA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalOrPartial"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Full or partial redemption."</li>
	 * </ul>
	 */
	public static final AmountFullfilTypeCode TotalOrPartial = new AmountFullfilTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TotalOrPartial";
			definition = "Full or partial redemption.";
			owner_lazy = () -> com.tools20022.repository.codeset.AmountFullfilTypeCode.mmObject();
			codeName = "TOPA";
		}
	};
	final static private LinkedHashMap<String, AmountFullfilTypeCode> codesByName = new LinkedHashMap<>();

	protected AmountFullfilTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("COMP");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AmountFullfilTypeCode";
				definition = "Specifies if the redemption is partly or fully.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AmountFullfilTypeCode.Completely, com.tools20022.repository.codeset.AmountFullfilTypeCode.Partial,
						com.tools20022.repository.codeset.AmountFullfilTypeCode.TotalOrPartial);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Completely.getCodeName().get(), Completely);
		codesByName.put(Partial.getCodeName().get(), Partial);
		codesByName.put(TotalOrPartial.getCodeName().get(), TotalOrPartial);
	}

	public static AmountFullfilTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AmountFullfilTypeCode[] values() {
		AmountFullfilTypeCode[] values = new AmountFullfilTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AmountFullfilTypeCode> {
		@Override
		public AmountFullfilTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AmountFullfilTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}