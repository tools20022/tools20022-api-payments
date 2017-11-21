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
 * Specifies the legal standing of the organisation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LegalStructureCode#mmCorporation
 * LegalStructureCode.mmCorporation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LegalStructureCode#mmIndividual
 * LegalStructureCode.mmIndividual}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LegalStructureCode#mmSupranational
 * LegalStructureCode.mmSupranational}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LegalStructureCode#mmSovereign
 * LegalStructureCode.mmSovereign}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LegalStructureCode#mmMunicipal
 * LegalStructureCode.mmMunicipal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LegalStructureCode#mmProvince
 * LegalStructureCode.mmProvince}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.LegalStructureCode#mmState
 * LegalStructureCode.mmState}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LegalStructureCode#mmCounty
 * LegalStructureCode.mmCounty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LegalStructureCode#mmPartnership
 * LegalStructureCode.mmPartnership}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LegalStructureCode#mmFinancialInstitution
 * LegalStructureCode.mmFinancialInstitution}</li>
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
 * <li>"CORR"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "LegalStructureCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the legal standing of the organisation."</li>
 * </ul>
 */
public class LegalStructureCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Legal structure is a corporation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LegalStructureCode
	 * LegalStructureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CORR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Corporation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Legal structure is a corporation."</li>
	 * </ul>
	 */
	public static final MMCode mmCorporation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Corporation";
			definition = "Legal structure is a corporation.";
			owner_lazy = () -> LegalStructureCode.mmObject();
			codeName = "CORR";
		}
	};
	/**
	 * Legal structure is an individual.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LegalStructureCode
	 * LegalStructureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INDV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Individual"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Legal structure is an individual."</li>
	 * </ul>
	 */
	public static final MMCode mmIndividual = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Individual";
			definition = "Legal structure is an individual.";
			owner_lazy = () -> LegalStructureCode.mmObject();
			codeName = "INDV";
		}
	};
	/**
	 * Legal structure is a supranational.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LegalStructureCode
	 * LegalStructureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SNAT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Supranational"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Legal structure is a supranational."</li>
	 * </ul>
	 */
	public static final MMCode mmSupranational = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Supranational";
			definition = "Legal structure is a supranational.";
			owner_lazy = () -> LegalStructureCode.mmObject();
			codeName = "SNAT";
		}
	};
	/**
	 * Legal structure is a sovereign.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LegalStructureCode
	 * LegalStructureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SOVR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Sovereign"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Legal structure is a sovereign."</li>
	 * </ul>
	 */
	public static final MMCode mmSovereign = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Sovereign";
			definition = "Legal structure is a sovereign.";
			owner_lazy = () -> LegalStructureCode.mmObject();
			codeName = "SOVR";
		}
	};
	/**
	 * Legal structure is a municipal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LegalStructureCode
	 * LegalStructureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MUNI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Municipal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Legal structure is a municipal."</li>
	 * </ul>
	 */
	public static final MMCode mmMunicipal = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Municipal";
			definition = "Legal structure is a municipal.";
			owner_lazy = () -> LegalStructureCode.mmObject();
			codeName = "MUNI";
		}
	};
	/**
	 * Legal structure is a province.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LegalStructureCode
	 * LegalStructureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PVIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Province"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Legal structure is a province."</li>
	 * </ul>
	 */
	public static final MMCode mmProvince = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Province";
			definition = "Legal structure is a province.";
			owner_lazy = () -> LegalStructureCode.mmObject();
			codeName = "PVIN";
		}
	};
	/**
	 * Legal structure is a state.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LegalStructureCode
	 * LegalStructureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STAE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "State"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Legal structure is a state."</li>
	 * </ul>
	 */
	public static final MMCode mmState = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "State";
			definition = "Legal structure is a state.";
			owner_lazy = () -> LegalStructureCode.mmObject();
			codeName = "STAE";
		}
	};
	/**
	 * Legal structure is a county.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LegalStructureCode
	 * LegalStructureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CNTY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "County"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Legal structure is a county."</li>
	 * </ul>
	 */
	public static final MMCode mmCounty = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "County";
			definition = "Legal structure is a county.";
			owner_lazy = () -> LegalStructureCode.mmObject();
			codeName = "CNTY";
		}
	};
	/**
	 * Legal structure is a partnership.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LegalStructureCode
	 * LegalStructureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PNTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Partnership"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Legal structure is a partnership."</li>
	 * </ul>
	 */
	public static final MMCode mmPartnership = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Partnership";
			definition = "Legal structure is a partnership.";
			owner_lazy = () -> LegalStructureCode.mmObject();
			codeName = "PNTR";
		}
	};
	/**
	 * Legal structure is a financial institution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LegalStructureCode
	 * LegalStructureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FINI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstitution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Legal structure is a financial institution."</li>
	 * </ul>
	 */
	public static final MMCode mmFinancialInstitution = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FinancialInstitution";
			definition = "Legal structure is a financial institution.";
			owner_lazy = () -> LegalStructureCode.mmObject();
			codeName = "FINI";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("CORR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "LegalStructureCode";
				definition = "Specifies the legal standing of the organisation.";
				code_lazy = () -> Arrays.asList(LegalStructureCode.mmCorporation, LegalStructureCode.mmIndividual, LegalStructureCode.mmSupranational, LegalStructureCode.mmSovereign, LegalStructureCode.mmMunicipal,
						LegalStructureCode.mmProvince, LegalStructureCode.mmState, LegalStructureCode.mmCounty, LegalStructureCode.mmPartnership, LegalStructureCode.mmFinancialInstitution);
			}
		});
		return mmObject_lazy.get();
	}
}