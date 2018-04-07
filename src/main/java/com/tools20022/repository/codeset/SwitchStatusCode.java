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
import com.tools20022.repository.codeset.SwitchStatusCode.InternalXmlAdapter;
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
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SwitchStatusCode#Termination
 * SwitchStatusCode.Termination}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SwitchStatusCode#Requested
 * SwitchStatusCode.Requested}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SwitchStatusCode#Rejected
 * SwitchStatusCode.Rejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SwitchStatusCode#RedirectionEnded
 * SwitchStatusCode.RedirectionEnded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SwitchStatusCode#Redirection
 * SwitchStatusCode.Redirection}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SwitchStatusCode#Completed
 * SwitchStatusCode.Completed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SwitchStatusCode#BalanceTransferResponse
 * SwitchStatusCode.BalanceTransferResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SwitchStatusCode#BalanceTransferRequested
 * SwitchStatusCode.BalanceTransferRequested}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SwitchStatusCode#Accepted
 * SwitchStatusCode.Accepted}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.SwitchStatus1Code
 * SwitchStatus1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SwitchStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the status of a given account switch."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SwitchStatusCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Account switch is terminated. <br>
	 * <br>
	 * Usage: Terminated status should be used when the account switch service
	 * receives and validates a terminate switch request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SwitchStatusCode
	 * SwitchStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TMTN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Termination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account switch is terminated. \r\n\r\nUsage: Terminated status should be used when the account switch service receives and validates a terminate switch request."
	 * </li>
	 * </ul>
	 */
	public static final SwitchStatusCode Termination = new SwitchStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Termination";
			definition = "Account switch is terminated. \r\n\r\nUsage: Terminated status should be used when the account switch service receives and validates a terminate switch request.";
			owner_lazy = () -> com.tools20022.repository.codeset.SwitchStatusCode.mmObject();
			codeName = "TMTN";
		}
	};
	/**
	 * Information is requested for the account switch. <br>
	 * <br>
	 * Usage: Requested status should be used when the account switch service
	 * receives and validates an information request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SwitchStatusCode
	 * SwitchStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REQU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Requested"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information is requested for the account switch. \r\n\r\nUsage: Requested status should be used when the account switch service receives and validates an information request."
	 * </li>
	 * </ul>
	 */
	public static final SwitchStatusCode Requested = new SwitchStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Requested";
			definition = "Information is requested for the account switch. \r\n\r\nUsage: Requested status should be used when the account switch service receives and validates an information request.";
			owner_lazy = () -> com.tools20022.repository.codeset.SwitchStatusCode.mmObject();
			codeName = "REQU";
		}
	};
	/**
	 * Account switch is rejected. <br>
	 * <br>
	 * Usage: Rejected status should be used when account switch service
	 * receives and validates an information response request rejecting the
	 * account switch.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SwitchStatusCode
	 * SwitchStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REJT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rejected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account switch is rejected. \r\n\r\nUsage: Rejected status should be used when account switch service receives and validates an information response request rejecting the account switch."
	 * </li>
	 * </ul>
	 */
	public static final SwitchStatusCode Rejected = new SwitchStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			definition = "Account switch is rejected. \r\n\r\nUsage: Rejected status should be used when account switch service receives and validates an information response request rejecting the account switch.";
			owner_lazy = () -> com.tools20022.repository.codeset.SwitchStatusCode.mmObject();
			codeName = "REJT";
		}
	};
	/**
	 * Redirection ended at the end of the redirection period. <br>
	 * <br>
	 * Usage: Indicates the cessation of account redirection by a particular
	 * service.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SwitchStatusCode
	 * SwitchStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REDE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedirectionEnded"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Redirection ended at the end of the redirection period. \r\n\r\nUsage: Indicates the cessation of account redirection by a particular service."
	 * </li>
	 * </ul>
	 */
	public static final SwitchStatusCode RedirectionEnded = new SwitchStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedirectionEnded";
			definition = "Redirection ended at the end of the redirection period. \r\n\r\nUsage: Indicates the cessation of account redirection by a particular service.";
			owner_lazy = () -> com.tools20022.repository.codeset.SwitchStatusCode.mmObject();
			codeName = "REDE";
		}
	};
	/**
	 * Request for redirection. <br>
	 * <br>
	 * Usage: Redirection status should be used when the account switch service
	 * receives and validates the first redirection request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SwitchStatusCode
	 * SwitchStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REDT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Redirection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Request for redirection. \r\n\r\nUsage: Redirection status should be used when the account switch service receives and validates the first redirection request."
	 * </li>
	 * </ul>
	 */
	public static final SwitchStatusCode Redirection = new SwitchStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Redirection";
			definition = "Request for redirection. \r\n\r\nUsage: Redirection status should be used when the account switch service receives and validates the first redirection request.";
			owner_lazy = () -> com.tools20022.repository.codeset.SwitchStatusCode.mmObject();
			codeName = "REDT";
		}
	};
	/**
	 * Account switch is completed.<br>
	 * <br>
	 * Usage: Completed status should be used when account switch service
	 * receives and validates a notify account switch complete request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SwitchStatusCode
	 * SwitchStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COMP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Completed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account switch is completed.\r\n\r\nUsage: Completed status should be used when account switch service receives and validates a notify account switch complete request."
	 * </li>
	 * </ul>
	 */
	public static final SwitchStatusCode Completed = new SwitchStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Completed";
			definition = "Account switch is completed.\r\n\r\nUsage: Completed status should be used when account switch service receives and validates a notify account switch complete request.";
			owner_lazy = () -> com.tools20022.repository.codeset.SwitchStatusCode.mmObject();
			codeName = "COMP";
		}
	};
	/**
	 * Balance transfer responded.<br>
	 * <br>
	 * Usage: Balance transfer responded staus should be used when the account
	 * switch service receives and validates an acknowledge balance transfer
	 * request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SwitchStatusCode
	 * SwitchStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BTRS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceTransferResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance transfer responded.\r\n\r\nUsage: Balance transfer responded staus should be used when the account switch service receives and validates an acknowledge balance transfer request."
	 * </li>
	 * </ul>
	 */
	public static final SwitchStatusCode BalanceTransferResponse = new SwitchStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceTransferResponse";
			definition = "Balance transfer responded.\r\n\r\nUsage: Balance transfer responded staus should be used when the account switch service receives and validates an acknowledge balance transfer request.";
			owner_lazy = () -> com.tools20022.repository.codeset.SwitchStatusCode.mmObject();
			codeName = "BTRS";
		}
	};
	/**
	 * Account balance transfer is requested.<br>
	 * <br>
	 * Usage: Balance transfer requested status should be used when account
	 * switch service receives and validates a request balance transfer request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SwitchStatusCode
	 * SwitchStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BTRQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceTransferRequested"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account balance transfer is requested.\r\n\r\nUsage: Balance transfer requested status should be used when account switch service receives and validates a request balance transfer request."
	 * </li>
	 * </ul>
	 */
	public static final SwitchStatusCode BalanceTransferRequested = new SwitchStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceTransferRequested";
			definition = "Account balance transfer is requested.\r\n\r\nUsage: Balance transfer requested status should be used when account switch service receives and validates a request balance transfer request.";
			owner_lazy = () -> com.tools20022.repository.codeset.SwitchStatusCode.mmObject();
			codeName = "BTRQ";
		}
	};
	/**
	 * Account switch is accepted.<br>
	 * <br>
	 * Usage: Accepted status should be used when account switch service
	 * receives and validates an information response request accepting the
	 * switch.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SwitchStatusCode
	 * SwitchStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACPT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Accepted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account switch is accepted.\r\n\r\nUsage: Accepted status should be used when account switch service receives and validates an information response request accepting the switch."
	 * </li>
	 * </ul>
	 */
	public static final SwitchStatusCode Accepted = new SwitchStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Accepted";
			definition = "Account switch is accepted.\r\n\r\nUsage: Accepted status should be used when account switch service receives and validates an information response request accepting the switch.";
			owner_lazy = () -> com.tools20022.repository.codeset.SwitchStatusCode.mmObject();
			codeName = "ACPT";
		}
	};
	final static private LinkedHashMap<String, SwitchStatusCode> codesByName = new LinkedHashMap<>();

	protected SwitchStatusCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SwitchStatusCode";
				definition = "Specifies the status of a given account switch.";
				derivation_lazy = () -> Arrays.asList(SwitchStatus1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SwitchStatusCode.Termination, com.tools20022.repository.codeset.SwitchStatusCode.Requested, com.tools20022.repository.codeset.SwitchStatusCode.Rejected,
						com.tools20022.repository.codeset.SwitchStatusCode.RedirectionEnded, com.tools20022.repository.codeset.SwitchStatusCode.Redirection, com.tools20022.repository.codeset.SwitchStatusCode.Completed,
						com.tools20022.repository.codeset.SwitchStatusCode.BalanceTransferResponse, com.tools20022.repository.codeset.SwitchStatusCode.BalanceTransferRequested, com.tools20022.repository.codeset.SwitchStatusCode.Accepted);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Termination.getCodeName().get(), Termination);
		codesByName.put(Requested.getCodeName().get(), Requested);
		codesByName.put(Rejected.getCodeName().get(), Rejected);
		codesByName.put(RedirectionEnded.getCodeName().get(), RedirectionEnded);
		codesByName.put(Redirection.getCodeName().get(), Redirection);
		codesByName.put(Completed.getCodeName().get(), Completed);
		codesByName.put(BalanceTransferResponse.getCodeName().get(), BalanceTransferResponse);
		codesByName.put(BalanceTransferRequested.getCodeName().get(), BalanceTransferRequested);
		codesByName.put(Accepted.getCodeName().get(), Accepted);
	}

	public static SwitchStatusCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SwitchStatusCode[] values() {
		SwitchStatusCode[] values = new SwitchStatusCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SwitchStatusCode> {
		@Override
		public SwitchStatusCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SwitchStatusCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}