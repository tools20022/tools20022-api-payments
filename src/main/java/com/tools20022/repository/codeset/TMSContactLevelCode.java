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
 * Level of urgency in contacting the terminal management system.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TMSContactLevelCode#mmCritical
 * TMSContactLevelCode.mmCritical}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TMSContactLevelCode#mmAsSoonAsPossible
 * TMSContactLevelCode.mmAsSoonAsPossible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TMSContactLevelCode#mmDateTime
 * TMSContactLevelCode.mmDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TMSContactLevelCode#mmEndCustomerSession
 * TMSContactLevelCode.mmEndCustomerSession}</li>
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
 * <li>"CRIT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TMSContactLevelCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Level of urgency in contacting the terminal management system."</li>
 * </ul>
 */
public class TMSContactLevelCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Terminal management system has to be contacted before the next
	 * transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TMSContactLevelCode
	 * TMSContactLevelCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRIT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Critical"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Terminal management system has to be contacted before the next transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCritical = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Critical";
			definition = "Terminal management system has to be contacted before the next transaction.";
			owner_lazy = () -> TMSContactLevelCode.mmObject();
			codeName = "CRIT";
		}
	};
	/**
	 * Terminal management system has to be contacted as soon as possible (for
	 * example after reconciliation).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TMSContactLevelCode
	 * TMSContactLevelCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ASAP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AsSoonAsPossible"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Terminal management system has to be contacted as soon as possible (for example after reconciliation)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAsSoonAsPossible = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AsSoonAsPossible";
			definition = "Terminal management system has to be contacted as soon as possible (for example after reconciliation).";
			owner_lazy = () -> TMSContactLevelCode.mmObject();
			codeName = "ASAP";
		}
	};
	/**
	 * Terminal management system has to be contacted at the date and time
	 * provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TMSContactLevelCode
	 * TMSContactLevelCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DTIM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Terminal management system has to be contacted at the date and time provided."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDateTime = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DateTime";
			definition = "Terminal management system has to be contacted at the date and time provided.";
			owner_lazy = () -> TMSContactLevelCode.mmObject();
			codeName = "DTIM";
		}
	};
	/**
	 * After the end of the customer session
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TMSContactLevelCode
	 * TMSContactLevelCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ENCS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndCustomerSession"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "After the end of the customer session"</li>
	 * </ul>
	 */
	public static final MMCode mmEndCustomerSession = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndCustomerSession";
			definition = "After the end of the customer session";
			owner_lazy = () -> TMSContactLevelCode.mmObject();
			codeName = "ENCS";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("CRIT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TMSContactLevelCode";
				definition = "Level of urgency in contacting the terminal management system.";
				code_lazy = () -> Arrays.asList(TMSContactLevelCode.mmCritical, TMSContactLevelCode.mmAsSoonAsPossible, TMSContactLevelCode.mmDateTime, TMSContactLevelCode.mmEndCustomerSession);
			}
		});
		return mmObject_lazy.get();
	}
}