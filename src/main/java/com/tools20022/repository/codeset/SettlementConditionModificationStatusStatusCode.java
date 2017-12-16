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
import com.tools20022.repository.codeset.SettlementConditionModificationStatusStatusCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the status of a securities settlement condition modification
 * request.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementConditionModificationStatusStatusCode#AcknowledgedAccepted
 * SettlementConditionModificationStatusStatusCode.mmAcknowledgedAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementConditionModificationStatusStatusCode#Rejected
 * SettlementConditionModificationStatusStatusCode.mmRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementConditionModificationStatusStatusCode#Denied
 * SettlementConditionModificationStatusStatusCode.mmDenied}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementConditionModificationStatusStatusCode#Completed
 * SettlementConditionModificationStatusStatusCode.mmCompleted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementConditionModificationStatusStatusCode#Pending
 * SettlementConditionModificationStatusStatusCode.mmPending}</li>
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
 * <li>"PACK"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SettlementConditionModificationStatusStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the status of a securities settlement condition modification request."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SettlementConditionModificationStatusStatusCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Instruction has been acknowledged/accepted by the account servicer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementConditionModificationStatusStatusCode
	 * SettlementConditionModificationStatusStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PACK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcknowledgedAccepted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction has been acknowledged/accepted by the account servicer."</li>
	 * </ul>
	 */
	public static final SettlementConditionModificationStatusStatusCode AcknowledgedAccepted = new SettlementConditionModificationStatusStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcknowledgedAccepted";
			definition = "Instruction has been acknowledged/accepted by the account servicer.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementConditionModificationStatusStatusCode.mmObject();
			codeName = "PACK";
		}
	};
	/**
	 * Instruction has been rejected for further processing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementConditionModificationStatusStatusCode
	 * SettlementConditionModificationStatusStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REJT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rejected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction has been rejected for further processing."</li>
	 * </ul>
	 */
	public static final SettlementConditionModificationStatusStatusCode Rejected = new SettlementConditionModificationStatusStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			definition = "Instruction has been rejected for further processing.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementConditionModificationStatusStatusCode.mmObject();
			codeName = "REJT";
		}
	};
	/**
	 * Modification Request will not be executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementConditionModificationStatusStatusCode
	 * SettlementConditionModificationStatusStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DEND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Denied"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Modification Request will not be executed."</li>
	 * </ul>
	 */
	public static final SettlementConditionModificationStatusStatusCode Denied = new SettlementConditionModificationStatusStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Denied";
			definition = "Modification Request will not be executed.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementConditionModificationStatusStatusCode.mmObject();
			codeName = "DEND";
		}
	};
	/**
	 * Modification has been completed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementConditionModificationStatusStatusCode
	 * SettlementConditionModificationStatusStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MODC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Completed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Modification has been completed."</li>
	 * </ul>
	 */
	public static final SettlementConditionModificationStatusStatusCode Completed = new SettlementConditionModificationStatusStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Completed";
			definition = "Modification has been completed.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementConditionModificationStatusStatusCode.mmObject();
			codeName = "MODC";
		}
	};
	/**
	 * Modification is pending. At this time, it is unknown whether the
	 * modification can be affected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementConditionModificationStatusStatusCode
	 * SettlementConditionModificationStatusStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MODP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pending"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Modification is pending. At this time, it is unknown whether the modification can be affected."
	 * </li>
	 * </ul>
	 */
	public static final SettlementConditionModificationStatusStatusCode Pending = new SettlementConditionModificationStatusStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pending";
			definition = "Modification is pending. At this time, it is unknown whether the modification can be affected.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementConditionModificationStatusStatusCode.mmObject();
			codeName = "MODP";
		}
	};
	final static private LinkedHashMap<String, SettlementConditionModificationStatusStatusCode> codesByName = new LinkedHashMap<>();

	protected SettlementConditionModificationStatusStatusCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("PACK");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SettlementConditionModificationStatusStatusCode";
				definition = "Specifies the status of a securities settlement condition modification request.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SettlementConditionModificationStatusStatusCode.AcknowledgedAccepted,
						com.tools20022.repository.codeset.SettlementConditionModificationStatusStatusCode.Rejected, com.tools20022.repository.codeset.SettlementConditionModificationStatusStatusCode.Denied,
						com.tools20022.repository.codeset.SettlementConditionModificationStatusStatusCode.Completed, com.tools20022.repository.codeset.SettlementConditionModificationStatusStatusCode.Pending);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AcknowledgedAccepted.getCodeName().get(), AcknowledgedAccepted);
		codesByName.put(Rejected.getCodeName().get(), Rejected);
		codesByName.put(Denied.getCodeName().get(), Denied);
		codesByName.put(Completed.getCodeName().get(), Completed);
		codesByName.put(Pending.getCodeName().get(), Pending);
	}

	public static SettlementConditionModificationStatusStatusCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SettlementConditionModificationStatusStatusCode[] values() {
		SettlementConditionModificationStatusStatusCode[] values = new SettlementConditionModificationStatusStatusCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SettlementConditionModificationStatusStatusCode> {
		@Override
		public SettlementConditionModificationStatusStatusCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SettlementConditionModificationStatusStatusCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}