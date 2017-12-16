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
import com.tools20022.repository.codeset.CancellationStatusCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the cancellation status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationStatusCode#SentToNextParty
 * CancellationStatusCode.mmSentToNextParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationStatusCode#Accepted
 * CancellationStatusCode.mmAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationStatusCode#Pending
 * CancellationStatusCode.mmPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationStatusCode#Complete
 * CancellationStatusCode.mmComplete}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationStatusCode#Rejected
 * CancellationStatusCode.mmRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationStatusCode#ReceivedByIssuerOrRegistrar
 * CancellationStatusCode.mmReceivedByIssuerOrRegistrar}</li>
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
 * <li>"STNP"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CancellationStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the cancellation status."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CancellationStatusCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Cancellation instruction / request has been sent to the next party, ie,
	 * the next intermediary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationStatusCode
	 * CancellationStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STNP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SentToNextParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cancellation instruction / request has been sent to the next party, ie, the next intermediary."
	 * </li>
	 * </ul>
	 */
	public static final CancellationStatusCode SentToNextParty = new CancellationStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SentToNextParty";
			definition = "Cancellation instruction / request has been sent to the next party, ie, the next intermediary.";
			owner_lazy = () -> com.tools20022.repository.codeset.CancellationStatusCode.mmObject();
			codeName = "STNP";
		}
	};
	/**
	 * Cancellation instruction / request has been received and has been
	 * acknowledged / accepted for further processing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationStatusCode
	 * CancellationStatusCode}</li>
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
	 * definition} =
	 * "Cancellation instruction / request has been received and has been acknowledged / accepted for further processing."
	 * </li>
	 * </ul>
	 */
	public static final CancellationStatusCode Accepted = new CancellationStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Accepted";
			definition = "Cancellation instruction / request has been received and has been acknowledged / accepted for further processing.";
			owner_lazy = () -> com.tools20022.repository.codeset.CancellationStatusCode.mmObject();
			codeName = "PACK";
		}
	};
	/**
	 * Cancellation instruction / request is pending. It is not known at this
	 * time whether cancellation can be effected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationStatusCode
	 * CancellationStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CANP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pending"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cancellation instruction / request is pending. It is not known at this time whether cancellation can be effected."
	 * </li>
	 * </ul>
	 */
	public static final CancellationStatusCode Pending = new CancellationStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Pending";
			definition = "Cancellation instruction / request is pending. It is not known at this time whether cancellation can be effected.";
			owner_lazy = () -> com.tools20022.repository.codeset.CancellationStatusCode.mmObject();
			codeName = "CANP";
		}
	};
	/**
	 * Cancellation instruction / request has been accepted and processed, the
	 * cancellation is complete.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationStatusCode
	 * CancellationStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CAND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Complete"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cancellation instruction / request has been accepted and processed, the cancellation is complete."
	 * </li>
	 * </ul>
	 */
	public static final CancellationStatusCode Complete = new CancellationStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Complete";
			definition = "Cancellation instruction / request has been accepted and processed, the cancellation is complete.";
			owner_lazy = () -> com.tools20022.repository.codeset.CancellationStatusCode.mmObject();
			codeName = "CAND";
		}
	};
	/**
	 * Cancellation instruction / request has been rejected / denied for further
	 * processing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationStatusCode
	 * CancellationStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REJT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rejected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cancellation instruction / request has been rejected / denied for further processing."
	 * </li>
	 * </ul>
	 */
	public static final CancellationStatusCode Rejected = new CancellationStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Rejected";
			definition = "Cancellation instruction / request has been rejected / denied for further processing.";
			owner_lazy = () -> com.tools20022.repository.codeset.CancellationStatusCode.mmObject();
			codeName = "REJT";
		}
	};
	/**
	 * Cancellation instruction / request has been received by Issuer or
	 * Registrar.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationStatusCode
	 * CancellationStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RCIS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivedByIssuerOrRegistrar"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cancellation instruction / request has been received by Issuer or Registrar."
	 * </li>
	 * </ul>
	 */
	public static final CancellationStatusCode ReceivedByIssuerOrRegistrar = new CancellationStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivedByIssuerOrRegistrar";
			definition = "Cancellation instruction / request has been received by Issuer or Registrar.";
			owner_lazy = () -> com.tools20022.repository.codeset.CancellationStatusCode.mmObject();
			codeName = "RCIS";
		}
	};
	final static private LinkedHashMap<String, CancellationStatusCode> codesByName = new LinkedHashMap<>();

	protected CancellationStatusCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("STNP");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CancellationStatusCode";
				definition = "Specifies the cancellation status.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CancellationStatusCode.SentToNextParty, com.tools20022.repository.codeset.CancellationStatusCode.Accepted,
						com.tools20022.repository.codeset.CancellationStatusCode.Pending, com.tools20022.repository.codeset.CancellationStatusCode.Complete, com.tools20022.repository.codeset.CancellationStatusCode.Rejected,
						com.tools20022.repository.codeset.CancellationStatusCode.ReceivedByIssuerOrRegistrar);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(SentToNextParty.getCodeName().get(), SentToNextParty);
		codesByName.put(Accepted.getCodeName().get(), Accepted);
		codesByName.put(Pending.getCodeName().get(), Pending);
		codesByName.put(Complete.getCodeName().get(), Complete);
		codesByName.put(Rejected.getCodeName().get(), Rejected);
		codesByName.put(ReceivedByIssuerOrRegistrar.getCodeName().get(), ReceivedByIssuerOrRegistrar);
	}

	public static CancellationStatusCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CancellationStatusCode[] values() {
		CancellationStatusCode[] values = new CancellationStatusCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CancellationStatusCode> {
		@Override
		public CancellationStatusCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CancellationStatusCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}