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
import com.tools20022.repository.codeset.InsuranceClausesCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * List of standards insurance clauses. (standard policy wordings issued by the
 * Institute of London Underwriters or the American Institute of Marine
 * Underwriters).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InsuranceClausesCode#InstituteCargoClauseA
 * InsuranceClausesCode.InstituteCargoClauseA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InsuranceClausesCode#InstituteCargoClauseB
 * InsuranceClausesCode.InstituteCargoClauseB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InsuranceClausesCode#InstituteCargoClauseC
 * InsuranceClausesCode.InstituteCargoClauseC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InsuranceClausesCode#InstituteCargoClauseAir
 * InsuranceClausesCode.InstituteCargoClauseAir}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InsuranceClausesCode#InstituteWarClauseCargo
 * InsuranceClausesCode.InstituteWarClauseCargo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InsuranceClausesCode#InstituteStrikesClauseCargo
 * InsuranceClausesCode.InstituteStrikesClauseCargo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InsuranceClausesCode#InstituteReplacementClause
 * InsuranceClausesCode.InstituteReplacementClause}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InsuranceClausesCode#InstituteClassificationClause
 * InsuranceClausesCode.InstituteClassificationClause}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InsuranceClausesCode#ISMCodeEndorsement
 * InsuranceClausesCode.ISMCodeEndorsement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InsuranceClausesCode#ComputerMilleniumClauseCargo
 * InsuranceClausesCode.ComputerMilleniumClauseCargo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InsuranceClausesCode#InstituteRadioactiveContaminationExclusionClause
 * InsuranceClausesCode.InstituteRadioactiveContaminationExclusionClause}</li>
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
 * <li>"ICCA"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InsuranceClausesCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "List of standards insurance clauses. (standard policy wordings issued by the Institute of London Underwriters or the American Institute of Marine Underwriters)."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class InsuranceClausesCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Institute Cargo Clause A (standard policy wordings issued by the
	 * Institute of London Underwriters or the American Institute of Marine
	 * Underwriters).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InsuranceClausesCode
	 * InsuranceClausesCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ICCA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstituteCargoClauseA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Institute Cargo Clause A (standard policy wordings issued by the Institute of London Underwriters or the American Institute of Marine Underwriters)."
	 * </li>
	 * </ul>
	 */
	public static final InsuranceClausesCode InstituteCargoClauseA = new InsuranceClausesCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstituteCargoClauseA";
			definition = "Institute Cargo Clause A (standard policy wordings issued by the Institute of London Underwriters or the American Institute of Marine Underwriters).";
			owner_lazy = () -> com.tools20022.repository.codeset.InsuranceClausesCode.mmObject();
			codeName = "ICCA";
		}
	};
	/**
	 * Institute Cargo Clause B (standard policy wordings issued by the
	 * Institute of London Underwriters or the American Institute of Marine
	 * Underwriters).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InsuranceClausesCode
	 * InsuranceClausesCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ICCB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstituteCargoClauseB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Institute Cargo Clause B (standard policy wordings issued by the Institute of London Underwriters or the American Institute of Marine Underwriters)."
	 * </li>
	 * </ul>
	 */
	public static final InsuranceClausesCode InstituteCargoClauseB = new InsuranceClausesCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstituteCargoClauseB";
			definition = "Institute Cargo Clause B (standard policy wordings issued by the Institute of London Underwriters or the American Institute of Marine Underwriters).";
			owner_lazy = () -> com.tools20022.repository.codeset.InsuranceClausesCode.mmObject();
			codeName = "ICCB";
		}
	};
	/**
	 * Institute Cargo Clause C (standard policy wordings issued by the
	 * Institute of London Underwriters or the American Institute of Marine
	 * Underwriters).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InsuranceClausesCode
	 * InsuranceClausesCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ICCC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstituteCargoClauseC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Institute Cargo Clause C (standard policy wordings issued by the Institute of London Underwriters or the American Institute of Marine Underwriters)."
	 * </li>
	 * </ul>
	 */
	public static final InsuranceClausesCode InstituteCargoClauseC = new InsuranceClausesCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstituteCargoClauseC";
			definition = "Institute Cargo Clause C (standard policy wordings issued by the Institute of London Underwriters or the American Institute of Marine Underwriters).";
			owner_lazy = () -> com.tools20022.repository.codeset.InsuranceClausesCode.mmObject();
			codeName = "ICCC";
		}
	};
	/**
	 * Institute Cargo Clause for Air (standard policy wordings issued by the
	 * Institute of London Underwriters or the American Institute of Marine
	 * Underwriters).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InsuranceClausesCode
	 * InsuranceClausesCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ICAI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstituteCargoClauseAir"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Institute Cargo Clause for Air (standard policy wordings issued by the Institute of London Underwriters or the American Institute of Marine Underwriters)."
	 * </li>
	 * </ul>
	 */
	public static final InsuranceClausesCode InstituteCargoClauseAir = new InsuranceClausesCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstituteCargoClauseAir";
			definition = "Institute Cargo Clause for Air (standard policy wordings issued by the Institute of London Underwriters or the American Institute of Marine Underwriters).";
			owner_lazy = () -> com.tools20022.repository.codeset.InsuranceClausesCode.mmObject();
			codeName = "ICAI";
		}
	};
	/**
	 * Institute War Clause for Cargo (standard policy wordings issued by the
	 * Institute of London Underwriters or the American Institute of Marine
	 * Underwriters).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InsuranceClausesCode
	 * InsuranceClausesCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IWCC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstituteWarClauseCargo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Institute War Clause for Cargo (standard policy wordings issued by the Institute of London Underwriters or the American Institute of Marine Underwriters)."
	 * </li>
	 * </ul>
	 */
	public static final InsuranceClausesCode InstituteWarClauseCargo = new InsuranceClausesCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstituteWarClauseCargo";
			definition = "Institute War Clause for Cargo (standard policy wordings issued by the Institute of London Underwriters or the American Institute of Marine Underwriters).";
			owner_lazy = () -> com.tools20022.repository.codeset.InsuranceClausesCode.mmObject();
			codeName = "IWCC";
		}
	};
	/**
	 * Institute Strikes Clause for Cargo (standard policy wordings issued by
	 * the Institute of London Underwriters or the American Institute of Marine
	 * Underwriters).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InsuranceClausesCode
	 * InsuranceClausesCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ISCC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstituteStrikesClauseCargo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Institute Strikes Clause for Cargo (standard policy wordings issued by the Institute of London Underwriters or the American Institute of Marine Underwriters)."
	 * </li>
	 * </ul>
	 */
	public static final InsuranceClausesCode InstituteStrikesClauseCargo = new InsuranceClausesCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstituteStrikesClauseCargo";
			definition = "Institute Strikes Clause for Cargo (standard policy wordings issued by the Institute of London Underwriters or the American Institute of Marine Underwriters).";
			owner_lazy = () -> com.tools20022.repository.codeset.InsuranceClausesCode.mmObject();
			codeName = "ISCC";
		}
	};
	/**
	 * Institute Replacement Clause (standard policy wordings issued by the
	 * Institute of London Underwriters or the American Institute of Marine
	 * Underwriters).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InsuranceClausesCode
	 * InsuranceClausesCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IREC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstituteReplacementClause"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Institute Replacement Clause (standard policy wordings issued by the Institute of London Underwriters or the American Institute of Marine Underwriters)."
	 * </li>
	 * </ul>
	 */
	public static final InsuranceClausesCode InstituteReplacementClause = new InsuranceClausesCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstituteReplacementClause";
			definition = "Institute Replacement Clause (standard policy wordings issued by the Institute of London Underwriters or the American Institute of Marine Underwriters).";
			owner_lazy = () -> com.tools20022.repository.codeset.InsuranceClausesCode.mmObject();
			codeName = "IREC";
		}
	};
	/**
	 * Institute Classification Clause (standard policy wordings issued by the
	 * Institute of London Underwriters or the American Institute of Marine
	 * Underwriters).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InsuranceClausesCode
	 * InsuranceClausesCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ICLC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstituteClassificationClause"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Institute Classification Clause (standard policy wordings issued by the Institute of London Underwriters or the American Institute of Marine Underwriters)."
	 * </li>
	 * </ul>
	 */
	public static final InsuranceClausesCode InstituteClassificationClause = new InsuranceClausesCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstituteClassificationClause";
			definition = "Institute Classification Clause (standard policy wordings issued by the Institute of London Underwriters or the American Institute of Marine Underwriters).";
			owner_lazy = () -> com.tools20022.repository.codeset.InsuranceClausesCode.mmObject();
			codeName = "ICLC";
		}
	};
	/**
	 * ISM Code Endorsement (standard policy wordings issued by the Institute of
	 * London Underwriters or the American Institute of Marine Underwriters).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InsuranceClausesCode
	 * InsuranceClausesCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ISMC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ISMCodeEndorsement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ISM Code Endorsement (standard policy wordings issued by the Institute of London Underwriters or the American Institute of Marine Underwriters)."
	 * </li>
	 * </ul>
	 */
	public static final InsuranceClausesCode ISMCodeEndorsement = new InsuranceClausesCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISMCodeEndorsement";
			definition = "ISM Code Endorsement (standard policy wordings issued by the Institute of London Underwriters or the American Institute of Marine Underwriters).";
			owner_lazy = () -> com.tools20022.repository.codeset.InsuranceClausesCode.mmObject();
			codeName = "ISMC";
		}
	};
	/**
	 * Computer Millenium Clause Cargo (standard policy wordings issued by the
	 * Institute of London Underwriters or the American Institute of Marine
	 * Underwriters).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InsuranceClausesCode
	 * InsuranceClausesCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CMCC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ComputerMilleniumClauseCargo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Computer Millenium Clause Cargo (standard policy wordings issued by the Institute of London Underwriters or the American Institute of Marine Underwriters)."
	 * </li>
	 * </ul>
	 */
	public static final InsuranceClausesCode ComputerMilleniumClauseCargo = new InsuranceClausesCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ComputerMilleniumClauseCargo";
			definition = "Computer Millenium Clause Cargo (standard policy wordings issued by the Institute of London Underwriters or the American Institute of Marine Underwriters).";
			owner_lazy = () -> com.tools20022.repository.codeset.InsuranceClausesCode.mmObject();
			codeName = "CMCC";
		}
	};
	/**
	 * Institute Radioactive Contamination Exclusion Clause (standard policy
	 * wordings issued by the Institute of London Underwriters or the American
	 * Institute of Marine Underwriters).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InsuranceClausesCode
	 * InsuranceClausesCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IRCE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstituteRadioactiveContaminationExclusionClause"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Institute Radioactive Contamination Exclusion Clause (standard policy wordings issued by the Institute of London Underwriters or the American Institute of Marine Underwriters)."
	 * </li>
	 * </ul>
	 */
	public static final InsuranceClausesCode InstituteRadioactiveContaminationExclusionClause = new InsuranceClausesCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstituteRadioactiveContaminationExclusionClause";
			definition = "Institute Radioactive Contamination Exclusion Clause (standard policy wordings issued by the Institute of London Underwriters or the American Institute of Marine Underwriters).";
			owner_lazy = () -> com.tools20022.repository.codeset.InsuranceClausesCode.mmObject();
			codeName = "IRCE";
		}
	};
	final static private LinkedHashMap<String, InsuranceClausesCode> codesByName = new LinkedHashMap<>();

	protected InsuranceClausesCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ICCA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InsuranceClausesCode";
				definition = "List of standards insurance clauses. (standard policy wordings issued by the Institute of London Underwriters or the American Institute of Marine Underwriters).";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InsuranceClausesCode.InstituteCargoClauseA, com.tools20022.repository.codeset.InsuranceClausesCode.InstituteCargoClauseB,
						com.tools20022.repository.codeset.InsuranceClausesCode.InstituteCargoClauseC, com.tools20022.repository.codeset.InsuranceClausesCode.InstituteCargoClauseAir,
						com.tools20022.repository.codeset.InsuranceClausesCode.InstituteWarClauseCargo, com.tools20022.repository.codeset.InsuranceClausesCode.InstituteStrikesClauseCargo,
						com.tools20022.repository.codeset.InsuranceClausesCode.InstituteReplacementClause, com.tools20022.repository.codeset.InsuranceClausesCode.InstituteClassificationClause,
						com.tools20022.repository.codeset.InsuranceClausesCode.ISMCodeEndorsement, com.tools20022.repository.codeset.InsuranceClausesCode.ComputerMilleniumClauseCargo,
						com.tools20022.repository.codeset.InsuranceClausesCode.InstituteRadioactiveContaminationExclusionClause);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(InstituteCargoClauseA.getCodeName().get(), InstituteCargoClauseA);
		codesByName.put(InstituteCargoClauseB.getCodeName().get(), InstituteCargoClauseB);
		codesByName.put(InstituteCargoClauseC.getCodeName().get(), InstituteCargoClauseC);
		codesByName.put(InstituteCargoClauseAir.getCodeName().get(), InstituteCargoClauseAir);
		codesByName.put(InstituteWarClauseCargo.getCodeName().get(), InstituteWarClauseCargo);
		codesByName.put(InstituteStrikesClauseCargo.getCodeName().get(), InstituteStrikesClauseCargo);
		codesByName.put(InstituteReplacementClause.getCodeName().get(), InstituteReplacementClause);
		codesByName.put(InstituteClassificationClause.getCodeName().get(), InstituteClassificationClause);
		codesByName.put(ISMCodeEndorsement.getCodeName().get(), ISMCodeEndorsement);
		codesByName.put(ComputerMilleniumClauseCargo.getCodeName().get(), ComputerMilleniumClauseCargo);
		codesByName.put(InstituteRadioactiveContaminationExclusionClause.getCodeName().get(), InstituteRadioactiveContaminationExclusionClause);
	}

	public static InsuranceClausesCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static InsuranceClausesCode[] values() {
		InsuranceClausesCode[] values = new InsuranceClausesCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, InsuranceClausesCode> {
		@Override
		public InsuranceClausesCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(InsuranceClausesCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}