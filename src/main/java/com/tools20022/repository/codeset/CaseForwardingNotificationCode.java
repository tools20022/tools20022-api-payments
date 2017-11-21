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
 * Specifies the action requested when forwarding a case. Assignees taking the
 * decision to cancel or modify to further case assignees must communicate this
 * decision to their case assigners.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CaseForwardingNotificationCode#mmFurtherInvestigation
 * CaseForwardingNotificationCode.mmFurtherInvestigation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CaseForwardingNotificationCode#mmRequestToCancel
 * CaseForwardingNotificationCode.mmRequestToCancel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CaseForwardingNotificationCode#mmRequestToModify
 * CaseForwardingNotificationCode.mmRequestToModify}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CaseForwardingNotificationCode#mmRequestDebitAuthorisation
 * CaseForwardingNotificationCode.mmRequestDebitAuthorisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CaseForwardingNotificationCode#mmSentAdditionalInformation
 * CaseForwardingNotificationCode.mmSentAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CaseForwardingNotificationCode#mmFoundInvestigatingAgent
 * CaseForwardingNotificationCode.mmFoundInvestigatingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CaseForwardingNotificationCode#mmMineInvestigationCase
 * CaseForwardingNotificationCode.mmMineInvestigationCase}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CaseForwardingNotification3Code
 * CaseForwardingNotification3Code}</li>
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
 * <li>"FTHI"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CaseForwardingNotificationCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the action requested when forwarding a case. Assignees taking the decision to cancel or modify to further case assignees must communicate this decision to their case assigners."
 * </li>
 * </ul>
 */
public class CaseForwardingNotificationCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Case has been forwarded to the next party for further investigation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CaseForwardingNotificationCode
	 * CaseForwardingNotificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FTHI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FurtherInvestigation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Case has been forwarded to the next party for further investigation."</li>
	 * </ul>
	 */
	public static final MMCode mmFurtherInvestigation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FurtherInvestigation";
			definition = "Case has been forwarded to the next party for further investigation.";
			owner_lazy = () -> CaseForwardingNotificationCode.mmObject();
			codeName = "FTHI";
		}
	};
	/**
	 * Case has been forwarded to the next party for cancellation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CaseForwardingNotificationCode
	 * CaseForwardingNotificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CANC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestToCancel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Case has been forwarded to the next party for cancellation."</li>
	 * </ul>
	 */
	public static final MMCode mmRequestToCancel = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RequestToCancel";
			definition = "Case has been forwarded to the next party for cancellation.";
			owner_lazy = () -> CaseForwardingNotificationCode.mmObject();
			codeName = "CANC";
		}
	};
	/**
	 * Case has been forwarded to the next party for modification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CaseForwardingNotificationCode
	 * CaseForwardingNotificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MODI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestToModify"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Case has been forwarded to the next party for modification."</li>
	 * </ul>
	 */
	public static final MMCode mmRequestToModify = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RequestToModify";
			definition = "Case has been forwarded to the next party for modification.";
			owner_lazy = () -> CaseForwardingNotificationCode.mmObject();
			codeName = "MODI";
		}
	};
	/**
	 * Case has been forwarded to obtain authorisation to debit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CaseForwardingNotificationCode
	 * CaseForwardingNotificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DTAU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestDebitAuthorisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Case has been forwarded to obtain authorisation to debit."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmRequestDebitAuthorisation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RequestDebitAuthorisation";
			definition = "Case has been forwarded to obtain authorisation to debit.";
			owner_lazy = () -> CaseForwardingNotificationCode.mmObject();
			codeName = "DTAU";
		}
	};
	/**
	 * Additional information has been forwarded to the creditor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CaseForwardingNotificationCode
	 * CaseForwardingNotificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SAIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SentAdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information has been forwarded to the creditor."</li>
	 * </ul>
	 */
	public static final MMCode mmSentAdditionalInformation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SentAdditionalInformation";
			definition = "Additional information has been forwarded to the creditor.";
			owner_lazy = () -> CaseForwardingNotificationCode.mmObject();
			codeName = "SAIN";
		}
	};
	/**
	 * Case is taken up by an assigned agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CaseForwardingNotificationCode
	 * CaseForwardingNotificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FIAG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FoundInvestigatingAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Case is taken up by an assigned agent."</li>
	 * </ul>
	 */
	public static final MMCode mmFoundInvestigatingAgent = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FoundInvestigatingAgent";
			definition = "Case is taken up by an assigned agent.";
			owner_lazy = () -> CaseForwardingNotificationCode.mmObject();
			codeName = "FIAG";
		}
	};
	/**
	 * Case is been handled by the assigned party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CaseForwardingNotificationCode
	 * CaseForwardingNotificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MINE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MineInvestigationCase"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Case is been handled by the assigned party."</li>
	 * </ul>
	 */
	public static final MMCode mmMineInvestigationCase = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MineInvestigationCase";
			definition = "Case is been handled by the assigned party.";
			owner_lazy = () -> CaseForwardingNotificationCode.mmObject();
			codeName = "MINE";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("FTHI");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CaseForwardingNotificationCode";
				definition = "Specifies the action requested when forwarding a case. Assignees taking the decision to cancel or modify to further case assignees must communicate this decision to their case assigners.";
				code_lazy = () -> Arrays.asList(CaseForwardingNotificationCode.mmFurtherInvestigation, CaseForwardingNotificationCode.mmRequestToCancel, CaseForwardingNotificationCode.mmRequestToModify,
						CaseForwardingNotificationCode.mmRequestDebitAuthorisation, CaseForwardingNotificationCode.mmSentAdditionalInformation, CaseForwardingNotificationCode.mmFoundInvestigatingAgent,
						CaseForwardingNotificationCode.mmMineInvestigationCase);
				derivation_lazy = () -> Arrays.asList(CaseForwardingNotification3Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}