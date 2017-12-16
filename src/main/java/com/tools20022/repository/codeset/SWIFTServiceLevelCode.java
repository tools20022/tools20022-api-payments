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
import com.tools20022.repository.codeset.SWIFTServiceLevelCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the SWIFT service level that applies to the payment instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SWIFTServiceLevelCode#SWIFTPay
 * SWIFTServiceLevelCode.mmSWIFTPay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SWIFTServiceLevelCode#Priority
 * SWIFTServiceLevelCode.mmPriority}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SWIFTServiceLevelCode#Standard
 * SWIFTServiceLevelCode.mmStandard}</li>
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
 * <li>"SPAY"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SWIFTServiceLevelCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the SWIFT service level that applies to the payment instruction."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SWIFTServiceLevelCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Credit transfer is to be processed according to the SWIFTPay Service
	 * Level.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SWIFTServiceLevelCode
	 * SWIFTServiceLevelCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPAY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SWIFTPay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Credit transfer is to be processed according to the SWIFTPay Service Level."
	 * </li>
	 * </ul>
	 */
	public static final SWIFTServiceLevelCode SWIFTPay = new SWIFTServiceLevelCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SWIFTPay";
			definition = "Credit transfer is to be processed according to the SWIFTPay Service Level.";
			owner_lazy = () -> com.tools20022.repository.codeset.SWIFTServiceLevelCode.mmObject();
			codeName = "SPAY";
		}
	};
	/**
	 * Credit transfer is to be processed according to the Priority Service
	 * Level.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SWIFTServiceLevelCode
	 * SWIFTServiceLevelCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPRI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Priority"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Credit transfer is to be processed according to the Priority Service Level."
	 * </li>
	 * </ul>
	 */
	public static final SWIFTServiceLevelCode Priority = new SWIFTServiceLevelCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Priority";
			definition = "Credit transfer is to be processed according to the Priority Service Level.";
			owner_lazy = () -> com.tools20022.repository.codeset.SWIFTServiceLevelCode.mmObject();
			codeName = "SPRI";
		}
	};
	/**
	 * Credit transfer is to be processed according to the Standard Service
	 * Level.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SWIFTServiceLevelCode
	 * SWIFTServiceLevelCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSTD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Standard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Credit transfer is to be processed according to the Standard Service Level."
	 * </li>
	 * </ul>
	 */
	public static final SWIFTServiceLevelCode Standard = new SWIFTServiceLevelCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Standard";
			definition = "Credit transfer is to be processed according to the Standard Service Level.";
			owner_lazy = () -> com.tools20022.repository.codeset.SWIFTServiceLevelCode.mmObject();
			codeName = "SSTD";
		}
	};
	final static private LinkedHashMap<String, SWIFTServiceLevelCode> codesByName = new LinkedHashMap<>();

	protected SWIFTServiceLevelCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("SPAY");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SWIFTServiceLevelCode";
				definition = "Specifies the SWIFT service level that applies to the payment instruction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SWIFTServiceLevelCode.SWIFTPay, com.tools20022.repository.codeset.SWIFTServiceLevelCode.Priority,
						com.tools20022.repository.codeset.SWIFTServiceLevelCode.Standard);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(SWIFTPay.getCodeName().get(), SWIFTPay);
		codesByName.put(Priority.getCodeName().get(), Priority);
		codesByName.put(Standard.getCodeName().get(), Standard);
	}

	public static SWIFTServiceLevelCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SWIFTServiceLevelCode[] values() {
		SWIFTServiceLevelCode[] values = new SWIFTServiceLevelCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SWIFTServiceLevelCode> {
		@Override
		public SWIFTServiceLevelCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SWIFTServiceLevelCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}