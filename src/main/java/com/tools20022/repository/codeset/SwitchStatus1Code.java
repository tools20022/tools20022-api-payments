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
import com.tools20022.repository.codeset.SwitchStatus1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the status of a given account switch.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.SwitchStatus1Code#Accepted
 * SwitchStatus1Code.Accepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SwitchStatus1Code#BalanceTransferRequested
 * SwitchStatus1Code.BalanceTransferRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SwitchStatus1Code#BalanceTransferResponse
 * SwitchStatus1Code.BalanceTransferResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SwitchStatus1Code#Completed
 * SwitchStatus1Code.Completed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SwitchStatus1Code#Redirection
 * SwitchStatus1Code.Redirection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SwitchStatus1Code#RedirectionEnded
 * SwitchStatus1Code.RedirectionEnded}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SwitchStatus1Code#Rejected
 * SwitchStatus1Code.Rejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SwitchStatus1Code#Requested
 * SwitchStatus1Code.Requested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SwitchStatus1Code#Termination
 * SwitchStatus1Code.Termination}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.SwitchStatusCode
 * SwitchStatusCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SwitchStatus1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the status of a given account switch."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SwitchStatus1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SwitchStatus1Code
	 * SwitchStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Accepted"</li>
	 * </ul>
	 */
	public static final SwitchStatus1Code Accepted = new SwitchStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Accepted";
			owner_lazy = () -> com.tools20022.repository.codeset.SwitchStatus1Code.mmObject();
			codeName = SwitchStatusCode.Accepted.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SwitchStatus1Code
	 * SwitchStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceTransferRequested"</li>
	 * </ul>
	 */
	public static final SwitchStatus1Code BalanceTransferRequested = new SwitchStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceTransferRequested";
			owner_lazy = () -> com.tools20022.repository.codeset.SwitchStatus1Code.mmObject();
			codeName = SwitchStatusCode.BalanceTransferRequested.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SwitchStatus1Code
	 * SwitchStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceTransferResponse"</li>
	 * </ul>
	 */
	public static final SwitchStatus1Code BalanceTransferResponse = new SwitchStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceTransferResponse";
			owner_lazy = () -> com.tools20022.repository.codeset.SwitchStatus1Code.mmObject();
			codeName = SwitchStatusCode.BalanceTransferResponse.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SwitchStatus1Code
	 * SwitchStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Completed"</li>
	 * </ul>
	 */
	public static final SwitchStatus1Code Completed = new SwitchStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Completed";
			owner_lazy = () -> com.tools20022.repository.codeset.SwitchStatus1Code.mmObject();
			codeName = SwitchStatusCode.Completed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SwitchStatus1Code
	 * SwitchStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Redirection"</li>
	 * </ul>
	 */
	public static final SwitchStatus1Code Redirection = new SwitchStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Redirection";
			owner_lazy = () -> com.tools20022.repository.codeset.SwitchStatus1Code.mmObject();
			codeName = SwitchStatusCode.Redirection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SwitchStatus1Code
	 * SwitchStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedirectionEnded"</li>
	 * </ul>
	 */
	public static final SwitchStatus1Code RedirectionEnded = new SwitchStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedirectionEnded";
			owner_lazy = () -> com.tools20022.repository.codeset.SwitchStatus1Code.mmObject();
			codeName = SwitchStatusCode.RedirectionEnded.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SwitchStatus1Code
	 * SwitchStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rejected"</li>
	 * </ul>
	 */
	public static final SwitchStatus1Code Rejected = new SwitchStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			owner_lazy = () -> com.tools20022.repository.codeset.SwitchStatus1Code.mmObject();
			codeName = SwitchStatusCode.Rejected.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SwitchStatus1Code
	 * SwitchStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Requested"</li>
	 * </ul>
	 */
	public static final SwitchStatus1Code Requested = new SwitchStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Requested";
			owner_lazy = () -> com.tools20022.repository.codeset.SwitchStatus1Code.mmObject();
			codeName = SwitchStatusCode.Requested.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SwitchStatus1Code
	 * SwitchStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Termination"</li>
	 * </ul>
	 */
	public static final SwitchStatus1Code Termination = new SwitchStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Termination";
			owner_lazy = () -> com.tools20022.repository.codeset.SwitchStatus1Code.mmObject();
			codeName = SwitchStatusCode.Termination.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, SwitchStatus1Code> codesByName = new LinkedHashMap<>();

	protected SwitchStatus1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SwitchStatus1Code";
				definition = "Specifies the status of a given account switch.";
				trace_lazy = () -> SwitchStatusCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SwitchStatus1Code.Accepted, com.tools20022.repository.codeset.SwitchStatus1Code.BalanceTransferRequested,
						com.tools20022.repository.codeset.SwitchStatus1Code.BalanceTransferResponse, com.tools20022.repository.codeset.SwitchStatus1Code.Completed, com.tools20022.repository.codeset.SwitchStatus1Code.Redirection,
						com.tools20022.repository.codeset.SwitchStatus1Code.RedirectionEnded, com.tools20022.repository.codeset.SwitchStatus1Code.Rejected, com.tools20022.repository.codeset.SwitchStatus1Code.Requested,
						com.tools20022.repository.codeset.SwitchStatus1Code.Termination);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Accepted.getCodeName().get(), Accepted);
		codesByName.put(BalanceTransferRequested.getCodeName().get(), BalanceTransferRequested);
		codesByName.put(BalanceTransferResponse.getCodeName().get(), BalanceTransferResponse);
		codesByName.put(Completed.getCodeName().get(), Completed);
		codesByName.put(Redirection.getCodeName().get(), Redirection);
		codesByName.put(RedirectionEnded.getCodeName().get(), RedirectionEnded);
		codesByName.put(Rejected.getCodeName().get(), Rejected);
		codesByName.put(Requested.getCodeName().get(), Requested);
		codesByName.put(Termination.getCodeName().get(), Termination);
	}

	public static SwitchStatus1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SwitchStatus1Code[] values() {
		SwitchStatus1Code[] values = new SwitchStatus1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SwitchStatus1Code> {
		@Override
		public SwitchStatus1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SwitchStatus1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}