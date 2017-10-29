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
import com.tools20022.repository.codeset.CaseForwardingNotificationCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the action requested when forwarding a case.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CaseForwardingNotificationCode
 * CaseForwardingNotificationCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CaseForwardingNotification3Code#FurtherInvestigation
 * CaseForwardingNotification3Code.FurtherInvestigation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CaseForwardingNotification3Code#RequestToCancel
 * CaseForwardingNotification3Code.RequestToCancel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CaseForwardingNotification3Code#RequestToModify
 * CaseForwardingNotification3Code.RequestToModify}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CaseForwardingNotification3Code#RequestDebitAuthorisation
 * CaseForwardingNotification3Code.RequestDebitAuthorisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CaseForwardingNotification3Code#SentAdditionalInformation
 * CaseForwardingNotification3Code.SentAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CaseForwardingNotification3Code#MineInvestigationCase
 * CaseForwardingNotification3Code.MineInvestigationCase}</li>
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
 * <li>"FTHI"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CaseForwardingNotification3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the action requested when forwarding a case."</li>
 * </ul>
 */
public class CaseForwardingNotification3Code extends CaseForwardingNotificationCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CaseForwardingNotification3Code
	 * CaseForwardingNotification3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FurtherInvestigation"</li>
	 * </ul>
	 */
	public static final MMCode FurtherInvestigation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FurtherInvestigation";
			owner_lazy = () -> CaseForwardingNotification3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CaseForwardingNotification3Code
	 * CaseForwardingNotification3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestToCancel"</li>
	 * </ul>
	 */
	public static final MMCode RequestToCancel = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestToCancel";
			owner_lazy = () -> CaseForwardingNotification3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CaseForwardingNotification3Code
	 * CaseForwardingNotification3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestToModify"</li>
	 * </ul>
	 */
	public static final MMCode RequestToModify = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestToModify";
			owner_lazy = () -> CaseForwardingNotification3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CaseForwardingNotification3Code
	 * CaseForwardingNotification3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestDebitAuthorisation"</li>
	 * </ul>
	 */
	public static final MMCode RequestDebitAuthorisation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestDebitAuthorisation";
			owner_lazy = () -> CaseForwardingNotification3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CaseForwardingNotification3Code
	 * CaseForwardingNotification3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SentAdditionalInformation"</li>
	 * </ul>
	 */
	public static final MMCode SentAdditionalInformation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SentAdditionalInformation";
			owner_lazy = () -> CaseForwardingNotification3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CaseForwardingNotification3Code
	 * CaseForwardingNotification3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MineInvestigationCase"</li>
	 * </ul>
	 */
	public static final MMCode MineInvestigationCase = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MineInvestigationCase";
			owner_lazy = () -> CaseForwardingNotification3Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("FTHI");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CaseForwardingNotification3Code";
				definition = "Specifies the action requested when forwarding a case.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CaseForwardingNotification3Code.FurtherInvestigation, com.tools20022.repository.codeset.CaseForwardingNotification3Code.RequestToCancel,
						com.tools20022.repository.codeset.CaseForwardingNotification3Code.RequestToModify, com.tools20022.repository.codeset.CaseForwardingNotification3Code.RequestDebitAuthorisation,
						com.tools20022.repository.codeset.CaseForwardingNotification3Code.SentAdditionalInformation, com.tools20022.repository.codeset.CaseForwardingNotification3Code.MineInvestigationCase);
				trace_lazy = () -> CaseForwardingNotificationCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}