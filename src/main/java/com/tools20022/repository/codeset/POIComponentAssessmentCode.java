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
import com.tools20022.repository.codeset.POIComponentAssessmentCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Type of assessment of a POI component (Point of Interaction).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentAssessmentCode#Evaluation
 * POIComponentAssessmentCode.mmEvaluation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentAssessmentCode#Certification
 * POIComponentAssessmentCode.mmCertification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentAssessmentCode#Approval
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
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class POIComponentAssessmentCode extends MMCode {

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
	public static final POIComponentAssessmentCode Evaluation = new POIComponentAssessmentCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Evaluation";
			definition = "Evaluation by a lab or a tool.";
			owner_lazy = () -> com.tools20022.repository.codeset.POIComponentAssessmentCode.mmObject();
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
	public static final POIComponentAssessmentCode Certification = new POIComponentAssessmentCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Certification";
			definition = "Certification number delivered by a certification body.";
			owner_lazy = () -> com.tools20022.repository.codeset.POIComponentAssessmentCode.mmObject();
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
	public static final POIComponentAssessmentCode Approval = new POIComponentAssessmentCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Approval";
			definition = "Approval number delivered by an approval centre.";
			owner_lazy = () -> com.tools20022.repository.codeset.POIComponentAssessmentCode.mmObject();
			codeName = "APPL";
		}
	};
	final static private LinkedHashMap<String, POIComponentAssessmentCode> codesByName = new LinkedHashMap<>();

	protected POIComponentAssessmentCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("EVAL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "POIComponentAssessmentCode";
				definition = "Type of assessment of a POI component (Point of Interaction).";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.POIComponentAssessmentCode.Evaluation, com.tools20022.repository.codeset.POIComponentAssessmentCode.Certification,
						com.tools20022.repository.codeset.POIComponentAssessmentCode.Approval);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Evaluation.getCodeName().get(), Evaluation);
		codesByName.put(Certification.getCodeName().get(), Certification);
		codesByName.put(Approval.getCodeName().get(), Approval);
	}

	public static POIComponentAssessmentCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static POIComponentAssessmentCode[] values() {
		POIComponentAssessmentCode[] values = new POIComponentAssessmentCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, POIComponentAssessmentCode> {
		@Override
		public POIComponentAssessmentCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(POIComponentAssessmentCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}