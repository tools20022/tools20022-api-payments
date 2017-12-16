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
import com.tools20022.repository.codeset.GroupCancellationStatus1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the status of a group of cancellation requests.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GroupCancellationStatus1Code#PartiallyAcceptedCancellationRequest
 * GroupCancellationStatus1Code.mmPartiallyAcceptedCancellationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GroupCancellationStatus1Code#RejectedCancellationRequest
 * GroupCancellationStatus1Code.mmRejectedCancellationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GroupCancellationStatus1Code#AcceptedCancellationRequest
 * GroupCancellationStatus1Code.mmAcceptedCancellationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GroupCancellationStatus1Code#PendingCancellationRequest
 * GroupCancellationStatus1Code.mmPendingCancellationRequest}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.PaymentStatusCode
 * PaymentStatusCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"PACR"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "GroupCancellationStatus1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the status of a group of cancellation requests."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class GroupCancellationStatus1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GroupCancellationStatus1Code
	 * GroupCancellationStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartiallyAcceptedCancellationRequest"</li>
	 * </ul>
	 */
	public static final GroupCancellationStatus1Code PartiallyAcceptedCancellationRequest = new GroupCancellationStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartiallyAcceptedCancellationRequest";
			owner_lazy = () -> com.tools20022.repository.codeset.GroupCancellationStatus1Code.mmObject();
			codeName = PaymentStatusCode.PartiallyAcceptedCancellationRequest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GroupCancellationStatus1Code
	 * GroupCancellationStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectedCancellationRequest"</li>
	 * </ul>
	 */
	public static final GroupCancellationStatus1Code RejectedCancellationRequest = new GroupCancellationStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectedCancellationRequest";
			owner_lazy = () -> com.tools20022.repository.codeset.GroupCancellationStatus1Code.mmObject();
			codeName = PaymentStatusCode.RejectedCancellationRequest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GroupCancellationStatus1Code
	 * GroupCancellationStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptedCancellationRequest"</li>
	 * </ul>
	 */
	public static final GroupCancellationStatus1Code AcceptedCancellationRequest = new GroupCancellationStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptedCancellationRequest";
			owner_lazy = () -> com.tools20022.repository.codeset.GroupCancellationStatus1Code.mmObject();
			codeName = PaymentStatusCode.AcceptedCancellationRequest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GroupCancellationStatus1Code
	 * GroupCancellationStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingCancellationRequest"</li>
	 * </ul>
	 */
	public static final GroupCancellationStatus1Code PendingCancellationRequest = new GroupCancellationStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingCancellationRequest";
			owner_lazy = () -> com.tools20022.repository.codeset.GroupCancellationStatus1Code.mmObject();
			codeName = PaymentStatusCode.PendingCancellationRequest.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, GroupCancellationStatus1Code> codesByName = new LinkedHashMap<>();

	protected GroupCancellationStatus1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("PACR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "GroupCancellationStatus1Code";
				definition = "Specifies the status of a group of cancellation requests.";
				trace_lazy = () -> PaymentStatusCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.GroupCancellationStatus1Code.PartiallyAcceptedCancellationRequest,
						com.tools20022.repository.codeset.GroupCancellationStatus1Code.RejectedCancellationRequest, com.tools20022.repository.codeset.GroupCancellationStatus1Code.AcceptedCancellationRequest,
						com.tools20022.repository.codeset.GroupCancellationStatus1Code.PendingCancellationRequest);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(PartiallyAcceptedCancellationRequest.getCodeName().get(), PartiallyAcceptedCancellationRequest);
		codesByName.put(RejectedCancellationRequest.getCodeName().get(), RejectedCancellationRequest);
		codesByName.put(AcceptedCancellationRequest.getCodeName().get(), AcceptedCancellationRequest);
		codesByName.put(PendingCancellationRequest.getCodeName().get(), PendingCancellationRequest);
	}

	public static GroupCancellationStatus1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static GroupCancellationStatus1Code[] values() {
		GroupCancellationStatus1Code[] values = new GroupCancellationStatus1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, GroupCancellationStatus1Code> {
		@Override
		public GroupCancellationStatus1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(GroupCancellationStatus1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}