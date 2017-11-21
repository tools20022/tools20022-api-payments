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
 * Type of notification.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionNotificationTypeCode#mmNew
 * CorporateActionNotificationTypeCode.mmNew}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionNotificationTypeCode#mmReplacement
 * CorporateActionNotificationTypeCode.mmReplacement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionNotificationTypeCode#mmReminder
 * CorporateActionNotificationTypeCode.mmReminder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionNotificationTypeCode#mmWithrawal
 * CorporateActionNotificationTypeCode.mmWithrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionNotificationTypeCode#mmCancellation
 * CorporateActionNotificationTypeCode.mmCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionNotificationTypeCode#mmProcessing
 * CorporateActionNotificationTypeCode.mmProcessing}</li>
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
 * <li>"NEWM"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionNotificationTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type of notification."</li>
 * </ul>
 */
public class CorporateActionNotificationTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * New notification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionNotificationTypeCode
	 * CorporateActionNotificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NEWM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "New"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "New notification."</li>
	 * </ul>
	 */
	public static final MMCode mmNew = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "New";
			definition = "New notification.";
			owner_lazy = () -> CorporateActionNotificationTypeCode.mmObject();
			codeName = "NEWM";
		}
	};
	/**
	 * Notification replacing a previously sent notification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionNotificationTypeCode
	 * CorporateActionNotificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REPL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Replacement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Notification replacing a previously sent notification."</li>
	 * </ul>
	 */
	public static final MMCode mmReplacement = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Replacement";
			definition = "Notification replacing a previously sent notification.";
			owner_lazy = () -> CorporateActionNotificationTypeCode.mmObject();
			codeName = "REPL";
		}
	};
	/**
	 * Notification sent as a reminder of an event taking place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionNotificationTypeCode
	 * CorporateActionNotificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RMDR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reminder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Notification sent as a reminder of an event taking place."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmReminder = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Reminder";
			definition = "Notification sent as a reminder of an event taking place.";
			owner_lazy = () -> CorporateActionNotificationTypeCode.mmObject();
			codeName = "RMDR";
		}
	};
	/**
	 * Notification sent to void a previously sent notification due to the
	 * withdrawal of the event by the issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionNotificationTypeCode
	 * CorporateActionNotificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WITH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Withrawal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Notification sent to void a previously sent notification due to the withdrawal of the event by the issuer."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmWithrawal = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Withrawal";
			definition = "Notification sent to void a previously sent notification due to the withdrawal of the event by the issuer.";
			owner_lazy = () -> CorporateActionNotificationTypeCode.mmObject();
			codeName = "WITH";
		}
	};
	/**
	 * Notification requesting the cancellation of a previously sent
	 * notification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionNotificationTypeCode
	 * CorporateActionNotificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CANC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cancellation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Notification requesting the cancellation of a previously sent notification."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCancellation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Cancellation";
			definition = "Notification requesting the cancellation of a previously sent notification.";
			owner_lazy = () -> CorporateActionNotificationTypeCode.mmObject();
			codeName = "CANC";
		}
	};
	/**
	 * Cancellation due to a processing error.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionNotificationTypeCode
	 * CorporateActionNotificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PROC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Processing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cancellation due to a processing error."</li>
	 * </ul>
	 */
	public static final MMCode mmProcessing = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Processing";
			definition = "Cancellation due to a processing error.";
			owner_lazy = () -> CorporateActionNotificationTypeCode.mmObject();
			codeName = "PROC";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("NEWM");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionNotificationTypeCode";
				definition = "Type of notification.";
				code_lazy = () -> Arrays.asList(CorporateActionNotificationTypeCode.mmNew, CorporateActionNotificationTypeCode.mmReplacement, CorporateActionNotificationTypeCode.mmReminder, CorporateActionNotificationTypeCode.mmWithrawal,
						CorporateActionNotificationTypeCode.mmCancellation, CorporateActionNotificationTypeCode.mmProcessing);
			}
		});
		return mmObject_lazy.get();
	}
}