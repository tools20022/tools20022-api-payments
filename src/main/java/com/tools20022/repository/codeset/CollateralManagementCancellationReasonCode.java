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
import com.tools20022.repository.codeset.CollateralManagementCancellationReasonCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason why the instruction/request has been cancelled.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CollateralManagementCancellationReasonCode#ProcessingError
 * CollateralManagementCancellationReasonCode.ProcessingError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CollateralManagementCancellationReasonCode#PendingNewSubmission
 * CollateralManagementCancellationReasonCode.PendingNewSubmission}</li>
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
 * <li>"PRER"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CollateralManagementCancellationReasonCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason why the instruction/request has been cancelled."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CollateralManagementCancellationReasonCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Cancellation due to message being sent in error.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralManagementCancellationReasonCode
	 * CollateralManagementCancellationReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRER"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cancellation due to message being sent in error."</li>
	 * </ul>
	 */
	public static final CollateralManagementCancellationReasonCode ProcessingError = new CollateralManagementCancellationReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingError";
			definition = "Cancellation due to message being sent in error.";
			owner_lazy = () -> com.tools20022.repository.codeset.CollateralManagementCancellationReasonCode.mmObject();
			codeName = "PRER";
		}
	};
	/**
	 * Cancellation due to a change in exposure or collateral or independent
	 * amount or margin terms. For collateral proposal submitting new/different
	 * collateral.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralManagementCancellationReasonCode
	 * CollateralManagementCancellationReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PNSU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingNewSubmission"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cancellation due to a change in exposure or collateral or independent amount or margin terms. For collateral proposal submitting new/different collateral."
	 * </li>
	 * </ul>
	 */
	public static final CollateralManagementCancellationReasonCode PendingNewSubmission = new CollateralManagementCancellationReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingNewSubmission";
			definition = "Cancellation due to a change in exposure or collateral or independent amount or margin terms. For collateral proposal submitting new/different collateral.";
			owner_lazy = () -> com.tools20022.repository.codeset.CollateralManagementCancellationReasonCode.mmObject();
			codeName = "PNSU";
		}
	};
	final static private LinkedHashMap<String, CollateralManagementCancellationReasonCode> codesByName = new LinkedHashMap<>();

	protected CollateralManagementCancellationReasonCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("PRER");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CollateralManagementCancellationReasonCode";
				definition = "Specifies the reason why the instruction/request has been cancelled.";
				code_lazy = () -> Arrays
						.asList(com.tools20022.repository.codeset.CollateralManagementCancellationReasonCode.ProcessingError, com.tools20022.repository.codeset.CollateralManagementCancellationReasonCode.PendingNewSubmission);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ProcessingError.getCodeName().get(), ProcessingError);
		codesByName.put(PendingNewSubmission.getCodeName().get(), PendingNewSubmission);
	}

	public static CollateralManagementCancellationReasonCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CollateralManagementCancellationReasonCode[] values() {
		CollateralManagementCancellationReasonCode[] values = new CollateralManagementCancellationReasonCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CollateralManagementCancellationReasonCode> {
		@Override
		public CollateralManagementCancellationReasonCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CollateralManagementCancellationReasonCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}