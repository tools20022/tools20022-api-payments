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
import com.tools20022.repository.codeset.SystemClosureReasonCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason for system inactivity.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemClosureReasonCode#BankingHoliday
 * SystemClosureReasonCode.BankingHoliday}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemClosureReasonCode#SystemMaintenance
 * SystemClosureReasonCode.SystemMaintenance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemClosureReasonCode#NoOperation
 * SystemClosureReasonCode.NoOperation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemClosureReasonCode#Recovery
 * SystemClosureReasonCode.Recovery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemClosureReasonCode#AllowedDowntimeWindow
 * SystemClosureReasonCode.AllowedDowntimeWindow}</li>
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
 * <li>"BHOL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SystemClosureReasonCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the reason for system inactivity."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SystemClosureReasonCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * System is closed due to a bank holiday.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemClosureReasonCode
	 * SystemClosureReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BHOL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankingHoliday"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "System is closed due to a bank holiday."</li>
	 * </ul>
	 */
	public static final SystemClosureReasonCode BankingHoliday = new SystemClosureReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BankingHoliday";
			definition = "System is closed due to a bank holiday.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemClosureReasonCode.mmObject();
			codeName = "BHOL";
		}
	};
	/**
	 * System is closed for maintenance reasons.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemClosureReasonCode
	 * SystemClosureReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SMTN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemMaintenance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "System is closed for maintenance reasons."</li>
	 * </ul>
	 */
	public static final SystemClosureReasonCode SystemMaintenance = new SystemClosureReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SystemMaintenance";
			definition = "System is closed for maintenance reasons.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemClosureReasonCode.mmObject();
			codeName = "SMTN";
		}
	};
	/**
	 * System is not processing any operation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemClosureReasonCode
	 * SystemClosureReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOOP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoOperation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "System is not processing any operation."</li>
	 * </ul>
	 */
	public static final SystemClosureReasonCode NoOperation = new SystemClosureReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NoOperation";
			definition = "System is not processing any operation.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemClosureReasonCode.mmObject();
			codeName = "NOOP";
		}
	};
	/**
	 * System is not operational during recovery operations.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemClosureReasonCode
	 * SystemClosureReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RCVR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Recovery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "System is not operational during recovery operations."</li>
	 * </ul>
	 */
	public static final SystemClosureReasonCode Recovery = new SystemClosureReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Recovery";
			definition = "System is not operational during recovery operations.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemClosureReasonCode.mmObject();
			codeName = "RCVR";
		}
	};
	/**
	 * System is not operational during allowed downtime windows.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemClosureReasonCode
	 * SystemClosureReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ADTW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllowedDowntimeWindow"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "System is not operational during allowed downtime windows."</li>
	 * </ul>
	 */
	public static final SystemClosureReasonCode AllowedDowntimeWindow = new SystemClosureReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AllowedDowntimeWindow";
			definition = "System is not operational during allowed downtime windows.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemClosureReasonCode.mmObject();
			codeName = "ADTW";
		}
	};
	final static private LinkedHashMap<String, SystemClosureReasonCode> codesByName = new LinkedHashMap<>();

	protected SystemClosureReasonCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("BHOL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SystemClosureReasonCode";
				definition = "Specifies the reason for system inactivity.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SystemClosureReasonCode.BankingHoliday, com.tools20022.repository.codeset.SystemClosureReasonCode.SystemMaintenance,
						com.tools20022.repository.codeset.SystemClosureReasonCode.NoOperation, com.tools20022.repository.codeset.SystemClosureReasonCode.Recovery,
						com.tools20022.repository.codeset.SystemClosureReasonCode.AllowedDowntimeWindow);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(BankingHoliday.getCodeName().get(), BankingHoliday);
		codesByName.put(SystemMaintenance.getCodeName().get(), SystemMaintenance);
		codesByName.put(NoOperation.getCodeName().get(), NoOperation);
		codesByName.put(Recovery.getCodeName().get(), Recovery);
		codesByName.put(AllowedDowntimeWindow.getCodeName().get(), AllowedDowntimeWindow);
	}

	public static SystemClosureReasonCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SystemClosureReasonCode[] values() {
		SystemClosureReasonCode[] values = new SystemClosureReasonCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SystemClosureReasonCode> {
		@Override
		public SystemClosureReasonCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SystemClosureReasonCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}