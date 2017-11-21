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
 * Specifies the type of changes.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeTypeCode#mmBearToRegistered
 * CorporateActionChangeTypeCode.mmBearToRegistered}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeTypeCode#mmCertificates
 * CorporateActionChangeTypeCode.mmCertificates}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeTypeCode#mmDematerialisedToPhysical
 * CorporateActionChangeTypeCode.mmDematerialisedToPhysical}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeTypeCode#mmGlobalPermanentToPhysical
 * CorporateActionChangeTypeCode.mmGlobalPermanentToPhysical}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeTypeCode#mmGlobalTemporaryToGlobalPermanent
 * CorporateActionChangeTypeCode.mmGlobalTemporaryToGlobalPermanent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeTypeCode#mmGlobalTemporaryToPhysical
 * CorporateActionChangeTypeCode.mmGlobalTemporaryToPhysical}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeTypeCode#mmName
 * CorporateActionChangeTypeCode.mmName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeTypeCode#mmPhysicalToDematerialised
 * CorporateActionChangeTypeCode.mmPhysicalToDematerialised}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeTypeCode#mmRegisteredToBearer
 * CorporateActionChangeTypeCode.mmRegisteredToBearer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeTypeCode#mmTerms
 * CorporateActionChangeTypeCode.mmTerms}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeTypeCode#mmDecimalisation
 * CorporateActionChangeTypeCode.mmDecimalisation}</li>
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
 * <li>"BERE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionChangeTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of changes."</li>
 * </ul>
 */
public class CorporateActionChangeTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Change from bearer into registered form.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeTypeCode
	 * CorporateActionChangeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BERE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BearToRegistered"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Change from bearer into registered form."</li>
	 * </ul>
	 */
	public static final MMCode mmBearToRegistered = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BearToRegistered";
			definition = "Change from bearer into registered form.";
			owner_lazy = () -> CorporateActionChangeTypeCode.mmObject();
			codeName = "BERE";
		}
	};
	/**
	 * Change of all instruments into certificates.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeTypeCode
	 * CorporateActionChangeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CERT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Certificates"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Change of all instruments into certificates."</li>
	 * </ul>
	 */
	public static final MMCode mmCertificates = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Certificates";
			definition = "Change of all instruments into certificates.";
			owner_lazy = () -> CorporateActionChangeTypeCode.mmObject();
			codeName = "CERT";
		}
	};
	/**
	 * Change from dematerialised into physical form.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeTypeCode
	 * CorporateActionChangeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DEPH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DematerialisedToPhysical"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Change from dematerialised into physical form."</li>
	 * </ul>
	 */
	public static final MMCode mmDematerialisedToPhysical = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DematerialisedToPhysical";
			definition = "Change from dematerialised into physical form.";
			owner_lazy = () -> CorporateActionChangeTypeCode.mmObject();
			codeName = "DEPH";
		}
	};
	/**
	 * Change from global permanent to physical form.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeTypeCode
	 * CorporateActionChangeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GPPH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GlobalPermanentToPhysical"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Change from global permanent to physical form."</li>
	 * </ul>
	 */
	public static final MMCode mmGlobalPermanentToPhysical = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GlobalPermanentToPhysical";
			definition = "Change from global permanent to physical form.";
			owner_lazy = () -> CorporateActionChangeTypeCode.mmObject();
			codeName = "GPPH";
		}
	};
	/**
	 * Change from global temporary to global permanent form.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeTypeCode
	 * CorporateActionChangeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GTGP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GlobalTemporaryToGlobalPermanent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Change from global temporary to global permanent form."</li>
	 * </ul>
	 */
	public static final MMCode mmGlobalTemporaryToGlobalPermanent = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GlobalTemporaryToGlobalPermanent";
			definition = "Change from global temporary to global permanent form.";
			owner_lazy = () -> CorporateActionChangeTypeCode.mmObject();
			codeName = "GTGP";
		}
	};
	/**
	 * Change from global temporary to physical form.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeTypeCode
	 * CorporateActionChangeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GTPH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GlobalTemporaryToPhysical"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Change from global temporary to physical form."</li>
	 * </ul>
	 */
	public static final MMCode mmGlobalTemporaryToPhysical = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GlobalTemporaryToPhysical";
			definition = "Change from global temporary to physical form.";
			owner_lazy = () -> CorporateActionChangeTypeCode.mmObject();
			codeName = "GTPH";
		}
	};
	/**
	 * The issuing company changes its name. CA event shows the change from old
	 * name to new name and may involve surrendering physical shares with the
	 * old name to the registrar.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeTypeCode
	 * CorporateActionChangeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NAME"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The issuing company changes its name. CA event shows the change from old name to new name and may involve surrendering physical shares with the old name to the registrar."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmName = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Name";
			definition = "The issuing company changes its name. CA event shows the change from old name to new name and may involve surrendering physical shares with the old name to the registrar.";
			owner_lazy = () -> CorporateActionChangeTypeCode.mmObject();
			codeName = "NAME";
		}
	};
	/**
	 * Change from physical into dematerialised form.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeTypeCode
	 * CorporateActionChangeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PHDE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalToDematerialised"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Change from physical into dematerialised form."</li>
	 * </ul>
	 */
	public static final MMCode mmPhysicalToDematerialised = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PhysicalToDematerialised";
			definition = "Change from physical into dematerialised form.";
			owner_lazy = () -> CorporateActionChangeTypeCode.mmObject();
			codeName = "PHDE";
		}
	};
	/**
	 * Change from registered into bearer form.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeTypeCode
	 * CorporateActionChangeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REBE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegisteredToBearer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Change from registered into bearer form."</li>
	 * </ul>
	 */
	public static final MMCode mmRegisteredToBearer = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RegisteredToBearer";
			definition = "Change from registered into bearer form.";
			owner_lazy = () -> CorporateActionChangeTypeCode.mmObject();
			codeName = "REBE";
		}
	};
	/**
	 * Change in the terms of the security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeTypeCode
	 * CorporateActionChangeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TERM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Terms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Change in the terms of the security."</li>
	 * </ul>
	 */
	public static final MMCode mmTerms = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Terms";
			definition = "Change in the terms of the security.";
			owner_lazy = () -> CorporateActionChangeTypeCode.mmObject();
			codeName = "TERM";
		}
	};
	/**
	 * Process of changing the accounting method of a security, eg, mutual fund,
	 * from units to a quantity with decimals.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeTypeCode
	 * CorporateActionChangeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DECI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Decimalisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Process of changing the accounting method of a security, eg, mutual fund, from units to a quantity with decimals."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDecimalisation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Decimalisation";
			definition = "Process of changing the accounting method of a security, eg, mutual fund, from units to a quantity with decimals.";
			owner_lazy = () -> CorporateActionChangeTypeCode.mmObject();
			codeName = "DECI";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("BERE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionChangeTypeCode";
				definition = "Specifies the type of changes.";
				code_lazy = () -> Arrays.asList(CorporateActionChangeTypeCode.mmBearToRegistered, CorporateActionChangeTypeCode.mmCertificates, CorporateActionChangeTypeCode.mmDematerialisedToPhysical,
						CorporateActionChangeTypeCode.mmGlobalPermanentToPhysical, CorporateActionChangeTypeCode.mmGlobalTemporaryToGlobalPermanent, CorporateActionChangeTypeCode.mmGlobalTemporaryToPhysical,
						CorporateActionChangeTypeCode.mmName, CorporateActionChangeTypeCode.mmPhysicalToDematerialised, CorporateActionChangeTypeCode.mmRegisteredToBearer, CorporateActionChangeTypeCode.mmTerms,
						CorporateActionChangeTypeCode.mmDecimalisation);
			}
		});
		return mmObject_lazy.get();
	}
}