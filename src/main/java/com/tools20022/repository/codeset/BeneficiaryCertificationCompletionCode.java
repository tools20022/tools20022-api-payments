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
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of certification completion required for a beneficiary.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationCompletionCode#mmCertificationNotRequired
 * BeneficiaryCertificationCompletionCode.mmCertificationNotRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationCompletionCode#mmElectronicCertification
 * BeneficiaryCertificationCompletionCode.mmElectronicCertification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationCompletionCode#mmPhysicalCertification
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
public class BeneficiaryCertificationCompletionCode {

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
	public static final MMCode mmCertificationNotRequired = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CertificationNotRequired";
			definition = "Certification is not required for this fund.";
			owner_lazy = () -> BeneficiaryCertificationCompletionCode.mmObject();
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
	public static final MMCode mmElectronicCertification = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ElectronicCertification";
			definition = "Electronic certification is acceptable.";
			owner_lazy = () -> BeneficiaryCertificationCompletionCode.mmObject();
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
	public static final MMCode mmPhysicalCertification = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PhysicalCertification";
			definition = "Electronic certification is not acceptable and is required in physical form.";
			owner_lazy = () -> BeneficiaryCertificationCompletionCode.mmObject();
			codeName = "PHYS";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("NCER");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BeneficiaryCertificationCompletionCode";
				definition = "Specifies the type of certification completion required for a beneficiary.";
				code_lazy = () -> Arrays.asList(BeneficiaryCertificationCompletionCode.mmCertificationNotRequired, BeneficiaryCertificationCompletionCode.mmElectronicCertification,
						BeneficiaryCertificationCompletionCode.mmPhysicalCertification);
			}
		});
		return mmObject_lazy.get();
	}
}