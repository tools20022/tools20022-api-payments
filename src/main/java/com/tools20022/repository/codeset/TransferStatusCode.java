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
import com.tools20022.repository.codeset.TransferStatusCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the transfer or settlement instruction status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferStatusCode#Cancelled
 * TransferStatusCode.mmCancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferStatusCode#SentToNextParty
 * TransferStatusCode.mmSentToNextParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferStatusCode#Accepted
 * TransferStatusCode.mmAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferStatusCode#Reversed
 * TransferStatusCode.mmReversed}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TransferStatusCode#Matched
 * TransferStatusCode.mmMatched}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferStatusCode#AlreadyExecuted
 * TransferStatusCode.mmAlreadyExecuted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferStatusCode#InRepair
 * TransferStatusCode.mmInRepair}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferStatusCode#Unmatched
 * TransferStatusCode.mmUnmatched}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferStatusCode#Rejected
 * TransferStatusCode.mmRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferStatusCode#CancellationPending
 * TransferStatusCode.mmCancellationPending}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TransferStatusCode#Settled
 * TransferStatusCode.mmSettled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferStatusCode#Received
 * TransferStatusCode.mmReceived}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferStatusCode#Complete
 * TransferStatusCode.mmComplete}</li>
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
 * "TransferStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the transfer or settlement instruction status."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TransferStatusCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Transfer or settlement instruction has been cancelled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferStatusCode
	 * TransferStatusCode}</li>
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
	 * definition} = "Transfer or settlement instruction has been cancelled."</li>
	 * </ul>
	 */
	public static final TransferStatusCode Cancelled = new TransferStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Cancelled";
			definition = "Transfer or settlement instruction has been cancelled.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferStatusCode.mmObject();
			codeName = "CAND";
		}
	};
	/**
	 * Transfer or settlement instruction has been sent to the next party, ie,
	 * the next intermediary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferStatusCode
	 * TransferStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STNP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SentToNextParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transfer or settlement instruction has been sent to the next party, ie, the next intermediary."
	 * </li>
	 * </ul>
	 */
	public static final TransferStatusCode SentToNextParty = new TransferStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SentToNextParty";
			definition = "Transfer or settlement instruction has been sent to the next party, ie, the next intermediary.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferStatusCode.mmObject();
			codeName = "STNP";
		}
	};
	/**
	 * Transfer or settlement instruction has been acknowledged / accepted for
	 * further processing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferStatusCode
	 * TransferStatusCode}</li>
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
	 * "Transfer or settlement instruction has been acknowledged / accepted for further processing."
	 * </li>
	 * </ul>
	 */
	public static final TransferStatusCode Accepted = new TransferStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Accepted";
			definition = "Transfer or settlement instruction has been acknowledged / accepted for further processing.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferStatusCode.mmObject();
			codeName = "PACK";
		}
	};
	/**
	 * Transfer or settlement instruction has been executed, confirmed and then
	 * the confirmation has been reversed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferStatusCode
	 * TransferStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RVSD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reversed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transfer or settlement instruction has been executed, confirmed and then the confirmation has been reversed."
	 * </li>
	 * </ul>
	 */
	public static final TransferStatusCode Reversed = new TransferStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Reversed";
			definition = "Transfer or settlement instruction has been executed, confirmed and then the confirmation has been reversed.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferStatusCode.mmObject();
			codeName = "RVSD";
		}
	};
	/**
	 * Transfer or settlement instruction is matched.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferStatusCode
	 * TransferStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MACH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Matched"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transfer or settlement instruction is matched."</li>
	 * </ul>
	 */
	public static final TransferStatusCode Matched = new TransferStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Matched";
			definition = "Transfer or settlement instruction is matched.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferStatusCode.mmObject();
			codeName = "MACH";
		}
	};
	/**
	 * Transfer or settlement instruction is fully executed and the confirmation
	 * is sent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferStatusCode
	 * TransferStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COSE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AlreadyExecuted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transfer or settlement instruction is fully executed and the confirmation is sent."
	 * </li>
	 * </ul>
	 */
	public static final TransferStatusCode AlreadyExecuted = new TransferStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AlreadyExecuted";
			definition = "Transfer or settlement instruction is fully executed and the confirmation is sent.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferStatusCode.mmObject();
			codeName = "COSE";
		}
	};
	/**
	 * Transfer or settlement instruction is in repair.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferStatusCode
	 * TransferStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REPR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InRepair"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transfer or settlement instruction is in repair."</li>
	 * </ul>
	 */
	public static final TransferStatusCode InRepair = new TransferStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InRepair";
			definition = "Transfer or settlement instruction is in repair.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferStatusCode.mmObject();
			codeName = "REPR";
		}
	};
	/**
	 * Transfer or settlement instruction is unmatched.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferStatusCode
	 * TransferStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NMAT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unmatched"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transfer or settlement instruction is unmatched."</li>
	 * </ul>
	 */
	public static final TransferStatusCode Unmatched = new TransferStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Unmatched";
			definition = "Transfer or settlement instruction is unmatched.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferStatusCode.mmObject();
			codeName = "NMAT";
		}
	};
	/**
	 * Transfer or settlement instruction has been rejected for further
	 * processing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferStatusCode
	 * TransferStatusCode}</li>
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
	 * "Transfer or settlement  instruction  has been rejected for further processing."
	 * </li>
	 * </ul>
	 */
	public static final TransferStatusCode Rejected = new TransferStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Rejected";
			definition = "Transfer or settlement  instruction  has been rejected for further processing.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferStatusCode.mmObject();
			codeName = "REJT";
		}
	};
	/**
	 * Transfer cancellation instruction or settlement cancellation instruction
	 * is pending.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferStatusCode
	 * TransferStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CANP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationPending"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transfer cancellation instruction or settlement cancellation instruction is pending."
	 * </li>
	 * </ul>
	 */
	public static final TransferStatusCode CancellationPending = new TransferStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancellationPending";
			definition = "Transfer cancellation instruction or settlement cancellation instruction is pending.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferStatusCode.mmObject();
			codeName = "CANP";
		}
	};
	/**
	 * Transfer or settlement instruction is settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferStatusCode
	 * TransferStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SETT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Settled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transfer or settlement instruction is settled."</li>
	 * </ul>
	 */
	public static final TransferStatusCode Settled = new TransferStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Settled";
			definition = "Transfer or settlement instruction is settled.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferStatusCode.mmObject();
			codeName = "SETT";
		}
	};
	/**
	 * Instruction has been received, that is, technical validation of the
	 * message is ok, and the message is now at the receiving side.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferStatusCode
	 * TransferStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RECE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Received"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction has been received, that is, technical validation of the message is ok, and the message is now at the receiving side."
	 * </li>
	 * </ul>
	 */
	public static final TransferStatusCode Received = new TransferStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Received";
			definition = "Instruction has been received, that is, technical validation of the message is ok, and the message is now at the receiving side.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferStatusCode.mmObject();
			codeName = "RECE";
		}
	};
	/**
	 * Portfolio transfer is complete.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferStatusCode
	 * TransferStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COMP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Complete"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Portfolio transfer is complete."</li>
	 * </ul>
	 */
	public static final TransferStatusCode Complete = new TransferStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Complete";
			definition = "Portfolio transfer is complete.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferStatusCode.mmObject();
			codeName = "COMP";
		}
	};
	final static private LinkedHashMap<String, TransferStatusCode> codesByName = new LinkedHashMap<>();

	protected TransferStatusCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("CAND");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransferStatusCode";
				definition = "Specifies the transfer or settlement instruction status.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TransferStatusCode.Cancelled, com.tools20022.repository.codeset.TransferStatusCode.SentToNextParty,
						com.tools20022.repository.codeset.TransferStatusCode.Accepted, com.tools20022.repository.codeset.TransferStatusCode.Reversed, com.tools20022.repository.codeset.TransferStatusCode.Matched,
						com.tools20022.repository.codeset.TransferStatusCode.AlreadyExecuted, com.tools20022.repository.codeset.TransferStatusCode.InRepair, com.tools20022.repository.codeset.TransferStatusCode.Unmatched,
						com.tools20022.repository.codeset.TransferStatusCode.Rejected, com.tools20022.repository.codeset.TransferStatusCode.CancellationPending, com.tools20022.repository.codeset.TransferStatusCode.Settled,
						com.tools20022.repository.codeset.TransferStatusCode.Received, com.tools20022.repository.codeset.TransferStatusCode.Complete);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Cancelled.getCodeName().get(), Cancelled);
		codesByName.put(SentToNextParty.getCodeName().get(), SentToNextParty);
		codesByName.put(Accepted.getCodeName().get(), Accepted);
		codesByName.put(Reversed.getCodeName().get(), Reversed);
		codesByName.put(Matched.getCodeName().get(), Matched);
		codesByName.put(AlreadyExecuted.getCodeName().get(), AlreadyExecuted);
		codesByName.put(InRepair.getCodeName().get(), InRepair);
		codesByName.put(Unmatched.getCodeName().get(), Unmatched);
		codesByName.put(Rejected.getCodeName().get(), Rejected);
		codesByName.put(CancellationPending.getCodeName().get(), CancellationPending);
		codesByName.put(Settled.getCodeName().get(), Settled);
		codesByName.put(Received.getCodeName().get(), Received);
		codesByName.put(Complete.getCodeName().get(), Complete);
	}

	public static TransferStatusCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TransferStatusCode[] values() {
		TransferStatusCode[] values = new TransferStatusCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TransferStatusCode> {
		@Override
		public TransferStatusCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TransferStatusCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}