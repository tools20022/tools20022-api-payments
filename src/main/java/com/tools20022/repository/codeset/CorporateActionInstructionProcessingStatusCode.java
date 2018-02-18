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
import com.tools20022.repository.codeset.CorporateActionInstructionProcessingStatusCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the status of a corporate action instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionInstructionProcessingStatusCode#Cancelled
 * CorporateActionInstructionProcessingStatusCode.Cancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionInstructionProcessingStatusCode#DefaultAction
 * CorporateActionInstructionProcessingStatusCode.DefaultAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionInstructionProcessingStatusCode#Accepted
 * CorporateActionInstructionProcessingStatusCode.Accepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionInstructionProcessingStatusCode#Pending
 * CorporateActionInstructionProcessingStatusCode.Pending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionInstructionProcessingStatusCode#Rejected
 * CorporateActionInstructionProcessingStatusCode.Rejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionInstructionProcessingStatusCode#StandingInstruction
 * CorporateActionInstructionProcessingStatusCode.StandingInstruction}</li>
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
 * <li>"CAND"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionInstructionProcessingStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the status of a corporate action instruction."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CorporateActionInstructionProcessingStatusCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Instruction has been cancelled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionInstructionProcessingStatusCode
	 * CorporateActionInstructionProcessingStatusCode}</li>
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
	public static final CorporateActionInstructionProcessingStatusCode Cancelled = new CorporateActionInstructionProcessingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Cancelled";
			definition = "Instruction has been cancelled.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionInstructionProcessingStatusCode.mmObject();
			codeName = "CAND";
		}
	};
	/**
	 * Default action is taken.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionInstructionProcessingStatusCode
	 * CorporateActionInstructionProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DFLA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefaultAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Default action is taken."</li>
	 * </ul>
	 */
	public static final CorporateActionInstructionProcessingStatusCode DefaultAction = new CorporateActionInstructionProcessingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DefaultAction";
			definition = "Default action is taken.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionInstructionProcessingStatusCode.mmObject();
			codeName = "DFLA";
		}
	};
	/**
	 * Instruction has been acknowledged/accepted for further processing. In
	 * other words, this means that the instruction has been received, is
	 * processable and has been validated for further processing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionInstructionProcessingStatusCode
	 * CorporateActionInstructionProcessingStatusCode}</li>
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
	 * "Instruction has been acknowledged/accepted for further processing. In other words, this means that the instruction has been received, is processable and has been validated for further processing."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionInstructionProcessingStatusCode Accepted = new CorporateActionInstructionProcessingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Accepted";
			definition = "Instruction has been acknowledged/accepted for further processing. In other words, this means that the instruction has been received, is processable and has been validated for further processing.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionInstructionProcessingStatusCode.mmObject();
			codeName = "PACK";
		}
	};
	/**
	 * Instruction's processing is pending.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionInstructionProcessingStatusCode
	 * CorporateActionInstructionProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PEND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pending"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction's processing is pending."</li>
	 * </ul>
	 */
	public static final CorporateActionInstructionProcessingStatusCode Pending = new CorporateActionInstructionProcessingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Pending";
			definition = "Instruction's processing is pending.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionInstructionProcessingStatusCode.mmObject();
			codeName = "PEND";
		}
	};
	/**
	 * Instruction has been rejected for further processing due to system
	 * reasons.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionInstructionProcessingStatusCode
	 * CorporateActionInstructionProcessingStatusCode}</li>
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
	 * "Instruction has been rejected for further processing due to system reasons."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionInstructionProcessingStatusCode Rejected = new CorporateActionInstructionProcessingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Rejected";
			definition = "Instruction has been rejected for further processing due to system reasons.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionInstructionProcessingStatusCode.mmObject();
			codeName = "REJT";
		}
	};
	/**
	 * Standing instruction is applied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionInstructionProcessingStatusCode
	 * CorporateActionInstructionProcessingStatusCode}</li>
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
	public static final CorporateActionInstructionProcessingStatusCode StandingInstruction = new CorporateActionInstructionProcessingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StandingInstruction";
			definition = "Standing instruction is applied.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionInstructionProcessingStatusCode.mmObject();
			codeName = "STIN";
		}
	};
	final static private LinkedHashMap<String, CorporateActionInstructionProcessingStatusCode> codesByName = new LinkedHashMap<>();

	protected CorporateActionInstructionProcessingStatusCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CAND");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionInstructionProcessingStatusCode";
				definition = "Specifies the status of a corporate action instruction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionInstructionProcessingStatusCode.Cancelled, com.tools20022.repository.codeset.CorporateActionInstructionProcessingStatusCode.DefaultAction,
						com.tools20022.repository.codeset.CorporateActionInstructionProcessingStatusCode.Accepted, com.tools20022.repository.codeset.CorporateActionInstructionProcessingStatusCode.Pending,
						com.tools20022.repository.codeset.CorporateActionInstructionProcessingStatusCode.Rejected, com.tools20022.repository.codeset.CorporateActionInstructionProcessingStatusCode.StandingInstruction);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Cancelled.getCodeName().get(), Cancelled);
		codesByName.put(DefaultAction.getCodeName().get(), DefaultAction);
		codesByName.put(Accepted.getCodeName().get(), Accepted);
		codesByName.put(Pending.getCodeName().get(), Pending);
		codesByName.put(Rejected.getCodeName().get(), Rejected);
		codesByName.put(StandingInstruction.getCodeName().get(), StandingInstruction);
	}

	public static CorporateActionInstructionProcessingStatusCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CorporateActionInstructionProcessingStatusCode[] values() {
		CorporateActionInstructionProcessingStatusCode[] values = new CorporateActionInstructionProcessingStatusCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CorporateActionInstructionProcessingStatusCode> {
		@Override
		public CorporateActionInstructionProcessingStatusCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CorporateActionInstructionProcessingStatusCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}