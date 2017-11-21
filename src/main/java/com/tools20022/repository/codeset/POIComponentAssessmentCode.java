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
 * Type of assessment of a POI component (Point of Interaction).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentAssessmentCode#mmEvaluation
 * POIComponentAssessmentCode.mmEvaluation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentAssessmentCode#mmCertification
 * POIComponentAssessmentCode.mmCertification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentAssessmentCode#mmApproval
 * POIComponentAssessmentCode.mmApproval}</li>
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
 * <li>"EVAL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "POIComponentAssessmentCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type of assessment of a POI component (Point of Interaction)."
 * </li>
 * </ul>
 */
public class POIComponentAssessmentCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Evaluation by a lab or a tool.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentAssessmentCode
	 * POIComponentAssessmentCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EVAL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Evaluation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Evaluation by a lab or a tool."</li>
	 * </ul>
	 */
	public static final MMCode mmEvaluation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Evaluation";
			definition = "Evaluation by a lab or a tool.";
			owner_lazy = () -> POIComponentAssessmentCode.mmObject();
			codeName = "EVAL";
		}
	};
	/**
	 * Certification number delivered by a certification body.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentAssessmentCode
	 * POIComponentAssessmentCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CERT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Certification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Certification number delivered by a certification body."</li>
	 * </ul>
	 */
	public static final MMCode mmCertification = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Certification";
			definition = "Certification number delivered by a certification body.";
			owner_lazy = () -> POIComponentAssessmentCode.mmObject();
			codeName = "CERT";
		}
	};
	/**
	 * Approval number delivered by an approval centre.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentAssessmentCode
	 * POIComponentAssessmentCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "APPL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Approval"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Approval number delivered by an approval centre."</li>
	 * </ul>
	 */
	public static final MMCode mmApproval = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Approval";
			definition = "Approval number delivered by an approval centre.";
			owner_lazy = () -> POIComponentAssessmentCode.mmObject();
			codeName = "APPL";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("EVAL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "POIComponentAssessmentCode";
				definition = "Type of assessment of a POI component (Point of Interaction).";
				code_lazy = () -> Arrays.asList(POIComponentAssessmentCode.mmEvaluation, POIComponentAssessmentCode.mmCertification, POIComponentAssessmentCode.mmApproval);
			}
		});
		return mmObject_lazy.get();
	}
}