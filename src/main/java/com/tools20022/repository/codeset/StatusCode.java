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
import com.tools20022.repository.codeset.StatusCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the status of an instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StatusCode#PendingProcessing
 * StatusCode.mmPendingProcessing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StatusCode#AcknowledgedAccepted
 * StatusCode.mmAcknowledgedAccepted}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.StatusCode#Rejected
 * StatusCode.mmRejected}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.StatusCode#Accepted
 * StatusCode.mmAccepted}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.StatusCode#Completed
 * StatusCode.mmCompleted}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.StatusCode#NotReceived
 * StatusCode.mmNotReceived}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.StatusCode#Cancelled
 * StatusCode.mmCancelled}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.StatusCode#BeingCancelled
 * StatusCode.mmBeingCancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StatusCode#ReceivedByIssuerOrRegistrar
 * StatusCode.mmReceivedByIssuerOrRegistrar}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.StatusCode#Pending
 * StatusCode.mmPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StatusCode#StandingInstruction
 * StatusCode.mmStandingInstruction}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.StatusCode#Queued
 * StatusCode.mmQueued}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StatusCode#CancelledBySubcustodian
 * StatusCode.mmCancelledBySubcustodian}</li>
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
 * <li>"PPRC"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "StatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the status of an instruction."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class StatusCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Processing of the instruction is pending.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StatusCode StatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PPRC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingProcessing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Processing of the instruction is pending."</li>
	 * </ul>
	 */
	public static final StatusCode PendingProcessing = new StatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingProcessing";
			definition = "Processing of the instruction is pending.";
			owner_lazy = () -> com.tools20022.repository.codeset.StatusCode.mmObject();
			codeName = "PPRC";
		}
	};
	/**
	 * Instruction has been acknowledged and accepted and is validated for
	 * further processing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StatusCode StatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PAAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcknowledgedAccepted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction has been acknowledged and accepted and is validated for further processing."
	 * </li>
	 * </ul>
	 */
	public static final StatusCode AcknowledgedAccepted = new StatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcknowledgedAccepted";
			definition = "Instruction has been acknowledged and accepted and is validated for further processing.";
			owner_lazy = () -> com.tools20022.repository.codeset.StatusCode.mmObject();
			codeName = "PAAC";
		}
	};
	/**
	 * Instruction has been rejected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StatusCode StatusCode}</li>
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
	 * definition} = "Instruction has been rejected."</li>
	 * </ul>
	 */
	public static final StatusCode Rejected = new StatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Rejected";
			definition = "Instruction has been rejected.";
			owner_lazy = () -> com.tools20022.repository.codeset.StatusCode.mmObject();
			codeName = "REJT";
		}
	};
	/**
	 * Instruction has been accepted and is validated for further processing
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StatusCode StatusCode}</li>
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
	 * "Instruction has been accepted and is validated for further processing"</li>
	 * </ul>
	 */
	public static final StatusCode Accepted = new StatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Accepted";
			definition = "Instruction has been accepted and is validated for further processing";
			owner_lazy = () -> com.tools20022.repository.codeset.StatusCode.mmObject();
			codeName = "PACK";
		}
	};
	/**
	 * Processing has been completed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StatusCode StatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COMP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Completed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Processing has been completed."</li>
	 * </ul>
	 */
	public static final StatusCode Completed = new StatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Completed";
			definition = "Processing has been completed.";
			owner_lazy = () -> com.tools20022.repository.codeset.StatusCode.mmObject();
			codeName = "COMP";
		}
	};
	/**
	 * No instruction has been received (to be used in a reminder).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StatusCode StatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotReceived"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "No instruction has been received (to be used in a reminder)."</li>
	 * </ul>
	 */
	public static final StatusCode NotReceived = new StatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotReceived";
			definition = "No instruction has been received (to be used in a reminder).";
			owner_lazy = () -> com.tools20022.repository.codeset.StatusCode.mmObject();
			codeName = "NOIN";
		}
	};
	/**
	 * Instruction has been cancelled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StatusCode StatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CAND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cancelled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction has been cancelled."</li>
	 * </ul>
	 */
	public static final StatusCode Cancelled = new StatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Cancelled";
			definition = "Instruction has been cancelled.";
			owner_lazy = () -> com.tools20022.repository.codeset.StatusCode.mmObject();
			codeName = "CAND";
		}
	};
	/**
	 * Cancel request is being processed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StatusCode StatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CANP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeingCancelled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cancel request is being processed."</li>
	 * </ul>
	 */
	public static final StatusCode BeingCancelled = new StatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BeingCancelled";
			definition = "Cancel request is being processed.";
			owner_lazy = () -> com.tools20022.repository.codeset.StatusCode.mmObject();
			codeName = "CANP";
		}
	};
	/**
	 * Instruction has been received by Issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StatusCode StatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RCIS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivedByIssuerOrRegistrar"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction has been received by Issuer."</li>
	 * </ul>
	 */
	public static final StatusCode ReceivedByIssuerOrRegistrar = new StatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReceivedByIssuerOrRegistrar";
			definition = "Instruction has been received by Issuer.";
			owner_lazy = () -> com.tools20022.repository.codeset.StatusCode.mmObject();
			codeName = "RCIS";
		}
	};
	/**
	 * Instruction is pending.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StatusCode StatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PDNG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pending"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction is pending."</li>
	 * </ul>
	 */
	public static final StatusCode Pending = new StatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Pending";
			definition = "Instruction is pending.";
			owner_lazy = () -> com.tools20022.repository.codeset.StatusCode.mmObject();
			codeName = "PDNG";
		}
	};
	/**
	 * Standing instruction is applied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StatusCode StatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Standing instruction is applied."</li>
	 * </ul>
	 */
	public static final StatusCode StandingInstruction = new StatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StandingInstruction";
			definition = "Standing instruction is applied.";
			owner_lazy = () -> com.tools20022.repository.codeset.StatusCode.mmObject();
			codeName = "STIN";
		}
	};
	/**
	 * Instruction is queued.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StatusCode StatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "QUED"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Queued"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction is queued."</li>
	 * </ul>
	 */
	public static final StatusCode Queued = new StatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Queued";
			definition = "Instruction is queued.";
			owner_lazy = () -> com.tools20022.repository.codeset.StatusCode.mmObject();
			codeName = "QUED";
		}
	};
	/**
	 * Instruction has been cancelled by the agent, for example, due to an event
	 * deadline extension.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StatusCode StatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CSUB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledBySubcustodian"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction has been cancelled by the agent, for example, due to an event deadline extension."
	 * </li>
	 * </ul>
	 */
	public static final StatusCode CancelledBySubcustodian = new StatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledBySubcustodian";
			definition = "Instruction has been cancelled by the agent, for example, due to an event deadline extension.";
			owner_lazy = () -> com.tools20022.repository.codeset.StatusCode.mmObject();
			codeName = "CSUB";
		}
	};
	final static private LinkedHashMap<String, StatusCode> codesByName = new LinkedHashMap<>();

	protected StatusCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("PPRC");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StatusCode";
				definition = "Specifies the status of an instruction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.StatusCode.PendingProcessing, com.tools20022.repository.codeset.StatusCode.AcknowledgedAccepted, com.tools20022.repository.codeset.StatusCode.Rejected,
						com.tools20022.repository.codeset.StatusCode.Accepted, com.tools20022.repository.codeset.StatusCode.Completed, com.tools20022.repository.codeset.StatusCode.NotReceived,
						com.tools20022.repository.codeset.StatusCode.Cancelled, com.tools20022.repository.codeset.StatusCode.BeingCancelled, com.tools20022.repository.codeset.StatusCode.ReceivedByIssuerOrRegistrar,
						com.tools20022.repository.codeset.StatusCode.Pending, com.tools20022.repository.codeset.StatusCode.StandingInstruction, com.tools20022.repository.codeset.StatusCode.Queued,
						com.tools20022.repository.codeset.StatusCode.CancelledBySubcustodian);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(PendingProcessing.getCodeName().get(), PendingProcessing);
		codesByName.put(AcknowledgedAccepted.getCodeName().get(), AcknowledgedAccepted);
		codesByName.put(Rejected.getCodeName().get(), Rejected);
		codesByName.put(Accepted.getCodeName().get(), Accepted);
		codesByName.put(Completed.getCodeName().get(), Completed);
		codesByName.put(NotReceived.getCodeName().get(), NotReceived);
		codesByName.put(Cancelled.getCodeName().get(), Cancelled);
		codesByName.put(BeingCancelled.getCodeName().get(), BeingCancelled);
		codesByName.put(ReceivedByIssuerOrRegistrar.getCodeName().get(), ReceivedByIssuerOrRegistrar);
		codesByName.put(Pending.getCodeName().get(), Pending);
		codesByName.put(StandingInstruction.getCodeName().get(), StandingInstruction);
		codesByName.put(Queued.getCodeName().get(), Queued);
		codesByName.put(CancelledBySubcustodian.getCodeName().get(), CancelledBySubcustodian);
	}

	public static StatusCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static StatusCode[] values() {
		StatusCode[] values = new StatusCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, StatusCode> {
		@Override
		public StatusCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(StatusCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}