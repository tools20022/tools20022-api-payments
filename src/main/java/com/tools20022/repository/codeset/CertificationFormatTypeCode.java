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
import com.tools20022.repository.codeset.CertificationFormatTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the certification format required, that is, physical or electronic
 * format.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CertificationFormatTypeCode#Electronic
 * CertificationFormatTypeCode.mmElectronic}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CertificationFormatTypeCode#Physical
 * CertificationFormatTypeCode.mmPhysical}</li>
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
 * <li>"ELEC"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CertificationFormatTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the certification format required, that is, physical or electronic format."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CertificationFormatTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Certification must be provided in electronic format.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CertificationFormatTypeCode
	 * CertificationFormatTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ELEC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Electronic"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Certification must be provided in electronic format."</li>
	 * </ul>
	 */
	public static final CertificationFormatTypeCode Electronic = new CertificationFormatTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Electronic";
			definition = "Certification must be provided in electronic format.";
			owner_lazy = () -> com.tools20022.repository.codeset.CertificationFormatTypeCode.mmObject();
			codeName = "ELEC";
		}
	};
	/**
	 * Certification must be provided in physical format.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CertificationFormatTypeCode
	 * CertificationFormatTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PHYS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Physical"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Certification must be provided in physical format."</li>
	 * </ul>
	 */
	public static final CertificationFormatTypeCode Physical = new CertificationFormatTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Physical";
			definition = "Certification must be provided in physical format.";
			owner_lazy = () -> com.tools20022.repository.codeset.CertificationFormatTypeCode.mmObject();
			codeName = "PHYS";
		}
	};
	final static private LinkedHashMap<String, CertificationFormatTypeCode> codesByName = new LinkedHashMap<>();

	protected CertificationFormatTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("ELEC");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CertificationFormatTypeCode";
				definition = "Specifies the certification format required, that is, physical or electronic format.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CertificationFormatTypeCode.Electronic, com.tools20022.repository.codeset.CertificationFormatTypeCode.Physical);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Electronic.getCodeName().get(), Electronic);
		codesByName.put(Physical.getCodeName().get(), Physical);
	}

	public static CertificationFormatTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CertificationFormatTypeCode[] values() {
		CertificationFormatTypeCode[] values = new CertificationFormatTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CertificationFormatTypeCode> {
		@Override
		public CertificationFormatTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CertificationFormatTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}