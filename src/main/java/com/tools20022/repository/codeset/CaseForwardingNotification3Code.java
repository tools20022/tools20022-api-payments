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
import com.tools20022.repository.codeset.CaseForwardingNotification3Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the action requested when forwarding a case.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CaseForwardingNotification3Code#FurtherInvestigation
 * CaseForwardingNotification3Code.mmFurtherInvestigation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CaseForwardingNotification3Code#RequestToCancel
 * CaseForwardingNotification3Code.mmRequestToCancel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CaseForwardingNotification3Code#RequestToModify
 * CaseForwardingNotification3Code.mmRequestToModify}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CaseForwardingNotification3Code#RequestDebitAuthorisation
 * CaseForwardingNotification3Code.mmRequestDebitAuthorisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CaseForwardingNotification3Code#SentAdditionalInformation
 * CaseForwardingNotification3Code.mmSentAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CaseForwardingNotification3Code#MineInvestigationCase
 * CaseForwardingNotification3Code.mmMineInvestigationCase}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CaseForwardingNotificationCode
 * CaseForwardingNotificationCode}</li>
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
 * "CaseForwardingNotification3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the action requested when forwarding a case."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CaseForwardingNotification3Code extends MMCode {

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
	public static final CaseForwardingNotification3Code FurtherInvestigation = new CaseForwardingNotification3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FurtherInvestigation";
			owner_lazy = () -> com.tools20022.repository.codeset.CaseForwardingNotification3Code.mmObject();
			codeName = CaseForwardingNotificationCode.FurtherInvestigation.getCodeName().orElse(name);
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
	public static final CaseForwardingNotification3Code RequestToCancel = new CaseForwardingNotification3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestToCancel";
			owner_lazy = () -> com.tools20022.repository.codeset.CaseForwardingNotification3Code.mmObject();
			codeName = CaseForwardingNotificationCode.RequestToCancel.getCodeName().orElse(name);
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
	public static final CaseForwardingNotification3Code RequestToModify = new CaseForwardingNotification3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestToModify";
			owner_lazy = () -> com.tools20022.repository.codeset.CaseForwardingNotification3Code.mmObject();
			codeName = CaseForwardingNotificationCode.RequestToModify.getCodeName().orElse(name);
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
	public static final CaseForwardingNotification3Code RequestDebitAuthorisation = new CaseForwardingNotification3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestDebitAuthorisation";
			owner_lazy = () -> com.tools20022.repository.codeset.CaseForwardingNotification3Code.mmObject();
			codeName = CaseForwardingNotificationCode.RequestDebitAuthorisation.getCodeName().orElse(name);
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
	public static final CaseForwardingNotification3Code SentAdditionalInformation = new CaseForwardingNotification3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SentAdditionalInformation";
			owner_lazy = () -> com.tools20022.repository.codeset.CaseForwardingNotification3Code.mmObject();
			codeName = CaseForwardingNotificationCode.SentAdditionalInformation.getCodeName().orElse(name);
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
	public static final CaseForwardingNotification3Code MineInvestigationCase = new CaseForwardingNotification3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MineInvestigationCase";
			owner_lazy = () -> com.tools20022.repository.codeset.CaseForwardingNotification3Code.mmObject();
			codeName = CaseForwardingNotificationCode.MineInvestigationCase.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CaseForwardingNotification3Code> codesByName = new LinkedHashMap<>();

	protected CaseForwardingNotification3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("FTHI");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CaseForwardingNotification3Code";
				definition = "Specifies the action requested when forwarding a case.";
				trace_lazy = () -> CaseForwardingNotificationCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CaseForwardingNotification3Code.FurtherInvestigation, com.tools20022.repository.codeset.CaseForwardingNotification3Code.RequestToCancel,
						com.tools20022.repository.codeset.CaseForwardingNotification3Code.RequestToModify, com.tools20022.repository.codeset.CaseForwardingNotification3Code.RequestDebitAuthorisation,
						com.tools20022.repository.codeset.CaseForwardingNotification3Code.SentAdditionalInformation, com.tools20022.repository.codeset.CaseForwardingNotification3Code.MineInvestigationCase);
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
		codesByName.put(MineInvestigationCase.getCodeName().get(), MineInvestigationCase);
	}

	public static CaseForwardingNotification3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CaseForwardingNotification3Code[] values() {
		CaseForwardingNotification3Code[] values = new CaseForwardingNotification3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CaseForwardingNotification3Code> {
		@Override
		public CaseForwardingNotification3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CaseForwardingNotification3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}