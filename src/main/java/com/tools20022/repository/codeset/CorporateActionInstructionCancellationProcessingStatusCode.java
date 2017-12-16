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
import com.tools20022.repository.codeset.CorporateActionInstructionCancellationProcessingStatusCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the status of a corporate action instruction cancellation process.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionInstructionCancellationProcessingStatusCode#CancellationCompleted
 * CorporateActionInstructionCancellationProcessingStatusCode.
 * mmCancellationCompleted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionInstructionCancellationProcessingStatusCode#PendingCancellation
 * CorporateActionInstructionCancellationProcessingStatusCode.
 * mmPendingCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionInstructionCancellationProcessingStatusCode#Accepted
 * CorporateActionInstructionCancellationProcessingStatusCode.mmAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionInstructionCancellationProcessingStatusCode#Rejected
 * CorporateActionInstructionCancellationProcessingStatusCode.mmRejected}</li>
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
 * <li>"CAND"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionInstructionCancellationProcessingStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the status of a corporate action instruction cancellation process."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CorporateActionInstructionCancellationProcessingStatusCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Cancellation request has been completed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionInstructionCancellationProcessingStatusCode
	 * CorporateActionInstructionCancellationProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CAND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationCompleted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cancellation request has been completed."</li>
	 * </ul>
	 */
	public static final CorporateActionInstructionCancellationProcessingStatusCode CancellationCompleted = new CorporateActionInstructionCancellationProcessingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancellationCompleted";
			definition = "Cancellation request has been completed.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionInstructionCancellationProcessingStatusCode.mmObject();
			codeName = "CAND";
		}
	};
	/**
	 * Cancellation request is pending. It is not known at this time whether
	 * cancellation can be affected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionInstructionCancellationProcessingStatusCode
	 * CorporateActionInstructionCancellationProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CANP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingCancellation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cancellation request is pending. It is not known at this time whether cancellation can be affected."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionInstructionCancellationProcessingStatusCode PendingCancellation = new CorporateActionInstructionCancellationProcessingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PendingCancellation";
			definition = "Cancellation request is pending. It is not known at this time whether cancellation can be affected.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionInstructionCancellationProcessingStatusCode.mmObject();
			codeName = "CANP";
		}
	};
	/**
	 * Cancellation request has been accepted for further processing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionInstructionCancellationProcessingStatusCode
	 * CorporateActionInstructionCancellationProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PACK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Accepted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cancellation request has been accepted for further processing."</li>
	 * </ul>
	 */
	public static final CorporateActionInstructionCancellationProcessingStatusCode Accepted = new CorporateActionInstructionCancellationProcessingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Accepted";
			definition = "Cancellation request has been accepted for further processing.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionInstructionCancellationProcessingStatusCode.mmObject();
			codeName = "PACK";
		}
	};
	/**
	 * Cancellation request has been rejected for further processing due to
	 * system (data) reasons.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionInstructionCancellationProcessingStatusCode
	 * CorporateActionInstructionCancellationProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REJT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rejected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cancellation request has been rejected for further processing due to system (data) reasons."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionInstructionCancellationProcessingStatusCode Rejected = new CorporateActionInstructionCancellationProcessingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Rejected";
			definition = "Cancellation request has been rejected for further processing due to system (data) reasons.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionInstructionCancellationProcessingStatusCode.mmObject();
			codeName = "REJT";
		}
	};
	final static private LinkedHashMap<String, CorporateActionInstructionCancellationProcessingStatusCode> codesByName = new LinkedHashMap<>();

	protected CorporateActionInstructionCancellationProcessingStatusCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("CAND");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionInstructionCancellationProcessingStatusCode";
				definition = "Specifies the status of a corporate action instruction cancellation process.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionInstructionCancellationProcessingStatusCode.CancellationCompleted,
						com.tools20022.repository.codeset.CorporateActionInstructionCancellationProcessingStatusCode.PendingCancellation,
						com.tools20022.repository.codeset.CorporateActionInstructionCancellationProcessingStatusCode.Accepted, com.tools20022.repository.codeset.CorporateActionInstructionCancellationProcessingStatusCode.Rejected);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CancellationCompleted.getCodeName().get(), CancellationCompleted);
		codesByName.put(PendingCancellation.getCodeName().get(), PendingCancellation);
		codesByName.put(Accepted.getCodeName().get(), Accepted);
		codesByName.put(Rejected.getCodeName().get(), Rejected);
	}

	public static CorporateActionInstructionCancellationProcessingStatusCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CorporateActionInstructionCancellationProcessingStatusCode[] values() {
		CorporateActionInstructionCancellationProcessingStatusCode[] values = new CorporateActionInstructionCancellationProcessingStatusCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CorporateActionInstructionCancellationProcessingStatusCode> {
		@Override
		public CorporateActionInstructionCancellationProcessingStatusCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CorporateActionInstructionCancellationProcessingStatusCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}