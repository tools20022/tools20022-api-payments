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
 * Identifies the type of status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ListStatusTypeCode#Acknowledgement
 * ListStatusTypeCode.Acknowledgement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ListStatusTypeCode#Response
 * ListStatusTypeCode.Response}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ListStatusTypeCode#AllDone
 * ListStatusTypeCode.AllDone}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ListStatusTypeCode#Alert
 * ListStatusTypeCode.Alert}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ListStatusTypeCode#ExecutionStarted
 * ListStatusTypeCode.ExecutionStarted}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ListStatusTypeCode#Timed
 * ListStatusTypeCode.Timed}</li>
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
 * <li>"ACKN"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ListStatusTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies the type of status."</li>
 * </ul>
 */
public class ListStatusTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Status is an acknowledgement of the ListOrder.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ListStatusTypeCode
	 * ListStatusTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACKN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Acknowledgement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status is an acknowledgement of the ListOrder."</li>
	 * </ul>
	 */
	public static final MMCode Acknowledgement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Acknowledgement";
			definition = "Status is an acknowledgement of the ListOrder.";
			owner_lazy = () -> ListStatusTypeCode.mmObject();
			codeName = "ACKN";
		}
	};
	/**
	 * Status is a response to a previously sent StatusRequest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ListStatusTypeCode
	 * ListStatusTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RESP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Response"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status is a response to a previously sent StatusRequest."</li>
	 * </ul>
	 */
	public static final MMCode Response = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Response";
			definition = "Status is a response to a previously sent StatusRequest.";
			owner_lazy = () -> ListStatusTypeCode.mmObject();
			codeName = "RESP";
		}
	};
	/**
	 * Status indicates that the ListOrder has been executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ListStatusTypeCode
	 * ListStatusTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ADON"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllDone"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status indicates that the ListOrder has been executed."</li>
	 * </ul>
	 */
	public static final MMCode AllDone = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllDone";
			definition = "Status indicates that the ListOrder has been executed.";
			owner_lazy = () -> ListStatusTypeCode.mmObject();
			codeName = "ADON";
		}
	};
	/**
	 * Status indicates that any of the individual orders of the ListOrder have
	 * a status that requires something to be done.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ListStatusTypeCode
	 * ListStatusTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ALER"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Alert"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status indicates that any of the individual orders of the ListOrder have a status that requires something to be done."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Alert = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Alert";
			definition = "Status indicates that any of the individual orders of the ListOrder have a status that requires something to be done.";
			owner_lazy = () -> ListStatusTypeCode.mmObject();
			codeName = "ALER";
		}
	};
	/**
	 * Status indicates that the Execution has started.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ListStatusTypeCode
	 * ListStatusTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExecutionStarted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status indicates that the Execution has started."</li>
	 * </ul>
	 */
	public static final MMCode ExecutionStarted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExecutionStarted";
			definition = "Status indicates that the Execution has started.";
			owner_lazy = () -> ListStatusTypeCode.mmObject();
			codeName = "EXST";
		}
	};
	/**
	 * Status indicated that time limit for the order has expired.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ListStatusTypeCode
	 * ListStatusTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TIME"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Timed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status indicated that time limit for the order has expired."</li>
	 * </ul>
	 */
	public static final MMCode Timed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Timed";
			definition = "Status indicated that time limit for the order has expired.";
			owner_lazy = () -> ListStatusTypeCode.mmObject();
			codeName = "TIME";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("ACKN");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ListStatusTypeCode";
				definition = "Identifies the type of status.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ListStatusTypeCode.Acknowledgement, com.tools20022.repository.codeset.ListStatusTypeCode.Response,
						com.tools20022.repository.codeset.ListStatusTypeCode.AllDone, com.tools20022.repository.codeset.ListStatusTypeCode.Alert, com.tools20022.repository.codeset.ListStatusTypeCode.ExecutionStarted,
						com.tools20022.repository.codeset.ListStatusTypeCode.Timed);
			}
		});
		return mmObject_lazy.get();
	}
}