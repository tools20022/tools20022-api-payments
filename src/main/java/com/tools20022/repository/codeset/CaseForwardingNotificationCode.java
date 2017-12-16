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
import com.tools20022.repository.codeset.CaseForwardingNotificationCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

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
 * {@linkplain com.tools20022.repository.codeset.CaseForwardingNotificationCode#FurtherInvestigation
 * CaseForwardingNotificationCode.mmFurtherInvestigation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CaseForwardingNotificationCode#RequestToCancel
 * CaseForwardingNotificationCode.mmRequestToCancel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CaseForwardingNotificationCode#RequestToModify
 * CaseForwardingNotificationCode.mmRequestToModify}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CaseForwardingNotificationCode#RequestDebitAuthorisation
 * CaseForwardingNotificationCode.mmRequestDebitAuthorisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CaseForwardingNotificationCode#SentAdditionalInformation
 * CaseForwardingNotificationCode.mmSentAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CaseForwardingNotificationCode#FoundInvestigatingAgent
 * CaseForwardingNotificationCode.mmFoundInvestigatingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CaseForwardingNotificationCode#MineInvestigationCase
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
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CaseForwardingNotificationCode extends MMCode {

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
	public static final CaseForwardingNotificationCode FurtherInvestigation = new CaseForwardingNotificationCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FurtherInvestigation";
			definition = "Case has been forwarded to the next party for further investigation.";
			owner_lazy = () -> com.tools20022.repository.codeset.CaseForwardingNotificationCode.mmObject();
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
	public static final CaseForwardingNotificationCode RequestToCancel = new CaseForwardingNotificationCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RequestToCancel";
			definition = "Case has been forwarded to the next party for cancellation.";
			owner_lazy = () -> com.tools20022.repository.codeset.CaseForwardingNotificationCode.mmObject();
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
	public static final CaseForwardingNotificationCode RequestToModify = new CaseForwardingNotificationCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RequestToModify";
			definition = "Case has been forwarded to the next party for modification.";
			owner_lazy = () -> com.tools20022.repository.codeset.CaseForwardingNotificationCode.mmObject();
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
	public static final CaseForwardingNotificationCode RequestDebitAuthorisation = new CaseForwardingNotificationCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RequestDebitAuthorisation";
			definition = "Case has been forwarded to obtain authorisation to debit.";
			owner_lazy = () -> com.tools20022.repository.codeset.CaseForwardingNotificationCode.mmObject();
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
	public static final CaseForwardingNotificationCode SentAdditionalInformation = new CaseForwardingNotificationCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SentAdditionalInformation";
			definition = "Additional information has been forwarded to the creditor.";
			owner_lazy = () -> com.tools20022.repository.codeset.CaseForwardingNotificationCode.mmObject();
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
	public static final CaseForwardingNotificationCode FoundInvestigatingAgent = new CaseForwardingNotificationCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FoundInvestigatingAgent";
			definition = "Case is taken up by an assigned agent.";
			owner_lazy = () -> com.tools20022.repository.codeset.CaseForwardingNotificationCode.mmObject();
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
	public static final CaseForwardingNotificationCode MineInvestigationCase = new CaseForwardingNotificationCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MineInvestigationCase";
			definition = "Case is been handled by the assigned party.";
			owner_lazy = () -> com.tools20022.repository.codeset.CaseForwardingNotificationCode.mmObject();
			codeName = "MINE";
		}
	};
	final static private LinkedHashMap<String, CaseForwardingNotificationCode> codesByName = new LinkedHashMap<>();

	protected CaseForwardingNotificationCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("FTHI");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CaseForwardingNotificationCode";
				definition = "Specifies the action requested when forwarding a case. Assignees taking the decision to cancel or modify to further case assignees must communicate this decision to their case assigners.";
				derivation_lazy = () -> Arrays.asList(CaseForwardingNotification3Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CaseForwardingNotificationCode.FurtherInvestigation, com.tools20022.repository.codeset.CaseForwardingNotificationCode.RequestToCancel,
						com.tools20022.repository.codeset.CaseForwardingNotificationCode.RequestToModify, com.tools20022.repository.codeset.CaseForwardingNotificationCode.RequestDebitAuthorisation,
						com.tools20022.repository.codeset.CaseForwardingNotificationCode.SentAdditionalInformation, com.tools20022.repository.codeset.CaseForwardingNotificationCode.FoundInvestigatingAgent,
						com.tools20022.repository.codeset.CaseForwardingNotificationCode.MineInvestigationCase);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(FurtherInvestigation.getCodeName().get(), FurtherInvestigation);
		codesByName.put(RequestToCancel.getCodeName().get(), RequestToCancel);
		codesByName.put(RequestToModify.getCodeName().get(), RequestToModify);
		codesByName.put(RequestDebitAuthorisation.getCodeName().get(), RequestDebitAuthorisation);
		codesByName.put(SentAdditionalInformation.getCodeName().get(), SentAdditionalInformation);
		codesByName.put(FoundInvestigatingAgent.getCodeName().get(), FoundInvestigatingAgent);
		codesByName.put(MineInvestigationCase.getCodeName().get(), MineInvestigationCase);
	}

	public static CaseForwardingNotificationCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CaseForwardingNotificationCode[] values() {
		CaseForwardingNotificationCode[] values = new CaseForwardingNotificationCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CaseForwardingNotificationCode> {
		@Override
		public CaseForwardingNotificationCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CaseForwardingNotificationCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}