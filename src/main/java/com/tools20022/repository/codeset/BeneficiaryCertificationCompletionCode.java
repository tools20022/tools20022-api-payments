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
import com.tools20022.repository.codeset.BeneficiaryCertificationCompletionCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of certification completion required for a beneficiary.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationCompletionCode#CertificationNotRequired
 * BeneficiaryCertificationCompletionCode.mmCertificationNotRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationCompletionCode#ElectronicCertification
 * BeneficiaryCertificationCompletionCode.mmElectronicCertification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationCompletionCode#PhysicalCertification
 * BeneficiaryCertificationCompletionCode.mmPhysicalCertification}</li>
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
 * <li>"NCER"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BeneficiaryCertificationCompletionCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of certification completion required for a beneficiary."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class BeneficiaryCertificationCompletionCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Certification is not required for this fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationCompletionCode
	 * BeneficiaryCertificationCompletionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NCER"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificationNotRequired"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Certification is not required for this fund."</li>
	 * </ul>
	 */
	public static final BeneficiaryCertificationCompletionCode CertificationNotRequired = new BeneficiaryCertificationCompletionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CertificationNotRequired";
			definition = "Certification is not required for this fund.";
			owner_lazy = () -> com.tools20022.repository.codeset.BeneficiaryCertificationCompletionCode.mmObject();
			codeName = "NCER";
		}
	};
	/**
	 * Electronic certification is acceptable.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationCompletionCode
	 * BeneficiaryCertificationCompletionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ELEC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectronicCertification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Electronic certification is acceptable."</li>
	 * </ul>
	 */
	public static final BeneficiaryCertificationCompletionCode ElectronicCertification = new BeneficiaryCertificationCompletionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ElectronicCertification";
			definition = "Electronic certification is acceptable.";
			owner_lazy = () -> com.tools20022.repository.codeset.BeneficiaryCertificationCompletionCode.mmObject();
			codeName = "ELEC";
		}
	};
	/**
	 * Electronic certification is not acceptable and is required in physical
	 * form.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationCompletionCode
	 * BeneficiaryCertificationCompletionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PHYS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalCertification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Electronic certification is not acceptable and is required in physical form."
	 * </li>
	 * </ul>
	 */
	public static final BeneficiaryCertificationCompletionCode PhysicalCertification = new BeneficiaryCertificationCompletionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PhysicalCertification";
			definition = "Electronic certification is not acceptable and is required in physical form.";
			owner_lazy = () -> com.tools20022.repository.codeset.BeneficiaryCertificationCompletionCode.mmObject();
			codeName = "PHYS";
		}
	};
	final static private LinkedHashMap<String, BeneficiaryCertificationCompletionCode> codesByName = new LinkedHashMap<>();

	protected BeneficiaryCertificationCompletionCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("NCER");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BeneficiaryCertificationCompletionCode";
				definition = "Specifies the type of certification completion required for a beneficiary.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BeneficiaryCertificationCompletionCode.CertificationNotRequired,
						com.tools20022.repository.codeset.BeneficiaryCertificationCompletionCode.ElectronicCertification, com.tools20022.repository.codeset.BeneficiaryCertificationCompletionCode.PhysicalCertification);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CertificationNotRequired.getCodeName().get(), CertificationNotRequired);
		codesByName.put(ElectronicCertification.getCodeName().get(), ElectronicCertification);
		codesByName.put(PhysicalCertification.getCodeName().get(), PhysicalCertification);
	}

	public static BeneficiaryCertificationCompletionCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static BeneficiaryCertificationCompletionCode[] values() {
		BeneficiaryCertificationCompletionCode[] values = new BeneficiaryCertificationCompletionCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, BeneficiaryCertificationCompletionCode> {
		@Override
		public BeneficiaryCertificationCompletionCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(BeneficiaryCertificationCompletionCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}