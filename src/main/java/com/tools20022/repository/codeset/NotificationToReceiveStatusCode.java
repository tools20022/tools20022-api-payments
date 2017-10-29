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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies whether or not the event as mentioned in the notification occurred.
 * Details of the event can be different from the details as per notification.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NotificationToReceiveStatusCode#ReceivedButDifferent
 * NotificationToReceiveStatusCode.ReceivedButDifferent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NotificationToReceiveStatusCode#Received
 * NotificationToReceiveStatusCode.Received}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NotificationToReceiveStatusCode#NotReceived
 * NotificationToReceiveStatusCode.NotReceived}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.NotificationStatus3Code
 * NotificationStatus3Code}</li>
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
 * <li>"RCBD"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "NotificationToReceiveStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies whether or not the event as mentioned in the notification occurred. Details of the event can be different from the details as per notification."
 * </li>
 * </ul>
 */
public class NotificationToReceiveStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Event(s) as described in the notification to receive occurred but details
	 * are different.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NotificationToReceiveStatusCode
	 * NotificationToReceiveStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RCBD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivedButDifferent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event(s) as described in the notification to receive occurred but details are different."
	 * </li>
	 * </ul>
	 */
	public static final MMCode ReceivedButDifferent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivedButDifferent";
			definition = "Event(s) as described in the notification to receive occurred but details are different.";
			owner_lazy = () -> NotificationToReceiveStatusCode.mmObject();
			codeName = "RCBD";
		}
	};
	/**
	 * Event(s) as described in the notification to receive occurred.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NotificationToReceiveStatusCode
	 * NotificationToReceiveStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RCVD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Received"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event(s) as described in the notification to receive occurred."</li>
	 * </ul>
	 */
	public static final MMCode Received = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Received";
			definition = "Event(s) as described in the notification to receive occurred.";
			owner_lazy = () -> NotificationToReceiveStatusCode.mmObject();
			codeName = "RCVD";
		}
	};
	/**
	 * Event(s) as described in the notification to receive did not occur.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NotificationToReceiveStatusCode
	 * NotificationToReceiveStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NRCD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotReceived"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event(s) as described in the notification to receive did not occur."</li>
	 * </ul>
	 */
	public static final MMCode NotReceived = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotReceived";
			definition = "Event(s) as described in the notification to receive did not occur.";
			owner_lazy = () -> NotificationToReceiveStatusCode.mmObject();
			codeName = "NRCD";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("RCBD");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "NotificationToReceiveStatusCode";
				definition = "Specifies whether or not the event as mentioned in the notification occurred. Details of the event can be different from the details as per notification.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.NotificationToReceiveStatusCode.ReceivedButDifferent, com.tools20022.repository.codeset.NotificationToReceiveStatusCode.Received,
						com.tools20022.repository.codeset.NotificationToReceiveStatusCode.NotReceived);
				derivation_lazy = () -> Arrays.asList(NotificationStatus3Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}