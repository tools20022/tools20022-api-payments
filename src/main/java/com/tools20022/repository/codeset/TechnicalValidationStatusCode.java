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
import com.tools20022.repository.codeset.TechnicalValidationStatusCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the result of the technical validation carried out by the receiver
 * (forwarding or first agent).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TechnicalValidationStatusCode#ReceptionConfirmation
 * TechnicalValidationStatusCode.mmReceptionConfirmation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TechnicalValidationStatusCode#ReceptionError
 * TechnicalValidationStatusCode.mmReceptionError}</li>
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
 * <li>"RCCF"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TechnicalValidationStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the result of the technical validation carried out by the receiver (forwarding or first agent)."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TechnicalValidationStatusCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates that the request has been correctly received and that the
	 * technical validation was successful.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TechnicalValidationStatusCode
	 * TechnicalValidationStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RCCF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceptionConfirmation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the request has been correctly received and that the technical validation was successful."
	 * </li>
	 * </ul>
	 */
	public static final TechnicalValidationStatusCode ReceptionConfirmation = new TechnicalValidationStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceptionConfirmation";
			definition = "Indicates that the request has been correctly received and that the technical validation was successful.";
			owner_lazy = () -> com.tools20022.repository.codeset.TechnicalValidationStatusCode.mmObject();
			codeName = "RCCF";
		}
	};
	/**
	 * Indicates there was an error in the reception of the request or that the
	 * technical validation was not successful.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TechnicalValidationStatusCode
	 * TechnicalValidationStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RCER"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceptionError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates there was an error in the reception of the request or that the technical validation was not successful."
	 * </li>
	 * </ul>
	 */
	public static final TechnicalValidationStatusCode ReceptionError = new TechnicalValidationStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceptionError";
			definition = "Indicates there was an error in the reception of the request or that the technical validation was not successful.";
			owner_lazy = () -> com.tools20022.repository.codeset.TechnicalValidationStatusCode.mmObject();
			codeName = "RCER";
		}
	};
	final static private LinkedHashMap<String, TechnicalValidationStatusCode> codesByName = new LinkedHashMap<>();

	protected TechnicalValidationStatusCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("RCCF");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TechnicalValidationStatusCode";
				definition = "Specifies the result of the technical validation carried out by the receiver (forwarding or first agent).";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TechnicalValidationStatusCode.ReceptionConfirmation, com.tools20022.repository.codeset.TechnicalValidationStatusCode.ReceptionError);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ReceptionConfirmation.getCodeName().get(), ReceptionConfirmation);
		codesByName.put(ReceptionError.getCodeName().get(), ReceptionError);
	}

	public static TechnicalValidationStatusCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TechnicalValidationStatusCode[] values() {
		TechnicalValidationStatusCode[] values = new TechnicalValidationStatusCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TechnicalValidationStatusCode> {
		@Override
		public TechnicalValidationStatusCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TechnicalValidationStatusCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}