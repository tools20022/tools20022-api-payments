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
import com.tools20022.repository.codeset.CorporateActionProcessedStatusCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the processing status of a corporate action transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionProcessedStatusCode#Received
 * CorporateActionProcessedStatusCode.mmReceived}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionProcessedStatusCode#Accepted
 * CorporateActionProcessedStatusCode.mmAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionProcessedStatusCode#Pending
 * CorporateActionProcessedStatusCode.mmPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionProcessedStatusCode#Completed
 * CorporateActionProcessedStatusCode.mmCompleted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionProcessedStatusCode#WaitingDeactivationDate
 * CorporateActionProcessedStatusCode.mmWaitingDeactivationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionProcessedStatusCode#SentToMarket
 * CorporateActionProcessedStatusCode.mmSentToMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionProcessedStatusCode#AcceptedWithWarning
 * CorporateActionProcessedStatusCode.mmAcceptedWithWarning}</li>
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
 * <li>"RECE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionProcessedStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the processing status of a corporate action transaction."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CorporateActionProcessedStatusCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * The instruction/request has been received.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionProcessedStatusCode
	 * CorporateActionProcessedStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RECE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Received"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The instruction/request has been received."</li>
	 * </ul>
	 */
	public static final CorporateActionProcessedStatusCode Received = new CorporateActionProcessedStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Received";
			definition = "The instruction/request has been received.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionProcessedStatusCode.mmObject();
			codeName = "RECE";
		}
	};
	/**
	 * The request is accepted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionProcessedStatusCode
	 * CorporateActionProcessedStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PACK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Accepted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The request is accepted."</li>
	 * </ul>
	 */
	public static final CorporateActionProcessedStatusCode Accepted = new CorporateActionProcessedStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Accepted";
			definition = "The request is accepted.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionProcessedStatusCode.mmObject();
			codeName = "PACK";
		}
	};
	/**
	 * The processing of the request is pending.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionProcessedStatusCode
	 * CorporateActionProcessedStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PEND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pending"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The processing of the request is pending."</li>
	 * </ul>
	 */
	public static final CorporateActionProcessedStatusCode Pending = new CorporateActionProcessedStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Pending";
			definition = "The processing of the request is pending.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionProcessedStatusCode.mmObject();
			codeName = "PEND";
		}
	};
	/**
	 * The request has been completed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionProcessedStatusCode
	 * CorporateActionProcessedStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COMP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Completed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The request has been completed."</li>
	 * </ul>
	 */
	public static final CorporateActionProcessedStatusCode Completed = new CorporateActionProcessedStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Completed";
			definition = "The request has been completed.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionProcessedStatusCode.mmObject();
			codeName = "COMP";
		}
	};
	/**
	 * Awaiting the deactivation date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionProcessedStatusCode
	 * CorporateActionProcessedStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DEAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WaitingDeactivationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Awaiting the deactivation date."</li>
	 * </ul>
	 */
	public static final CorporateActionProcessedStatusCode WaitingDeactivationDate = new CorporateActionProcessedStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WaitingDeactivationDate";
			definition = "Awaiting the deactivation date.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionProcessedStatusCode.mmObject();
			codeName = "DEAC";
		}
	};
	/**
	 * The advice has been sent to the market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionProcessedStatusCode
	 * CorporateActionProcessedStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SENT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SentToMarket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The advice has been sent to the market."</li>
	 * </ul>
	 */
	public static final CorporateActionProcessedStatusCode SentToMarket = new CorporateActionProcessedStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SentToMarket";
			definition = "The advice has been sent to the market.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionProcessedStatusCode.mmObject();
			codeName = "SENT";
		}
	};
	/**
	 * The announcement has been accepted but another source has provided
	 * different information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionProcessedStatusCode
	 * CorporateActionProcessedStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WARN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptedWithWarning"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The announcement has been accepted but another source has provided different information."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionProcessedStatusCode AcceptedWithWarning = new CorporateActionProcessedStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AcceptedWithWarning";
			definition = "The announcement has been accepted but another source has provided different information.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionProcessedStatusCode.mmObject();
			codeName = "WARN";
		}
	};
	final static private LinkedHashMap<String, CorporateActionProcessedStatusCode> codesByName = new LinkedHashMap<>();

	protected CorporateActionProcessedStatusCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("RECE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionProcessedStatusCode";
				definition = "Specifies the processing status of a corporate action transaction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionProcessedStatusCode.Received, com.tools20022.repository.codeset.CorporateActionProcessedStatusCode.Accepted,
						com.tools20022.repository.codeset.CorporateActionProcessedStatusCode.Pending, com.tools20022.repository.codeset.CorporateActionProcessedStatusCode.Completed,
						com.tools20022.repository.codeset.CorporateActionProcessedStatusCode.WaitingDeactivationDate, com.tools20022.repository.codeset.CorporateActionProcessedStatusCode.SentToMarket,
						com.tools20022.repository.codeset.CorporateActionProcessedStatusCode.AcceptedWithWarning);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Received.getCodeName().get(), Received);
		codesByName.put(Accepted.getCodeName().get(), Accepted);
		codesByName.put(Pending.getCodeName().get(), Pending);
		codesByName.put(Completed.getCodeName().get(), Completed);
		codesByName.put(WaitingDeactivationDate.getCodeName().get(), WaitingDeactivationDate);
		codesByName.put(SentToMarket.getCodeName().get(), SentToMarket);
		codesByName.put(AcceptedWithWarning.getCodeName().get(), AcceptedWithWarning);
	}

	public static CorporateActionProcessedStatusCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CorporateActionProcessedStatusCode[] values() {
		CorporateActionProcessedStatusCode[] values = new CorporateActionProcessedStatusCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CorporateActionProcessedStatusCode> {
		@Override
		public CorporateActionProcessedStatusCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CorporateActionProcessedStatusCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}