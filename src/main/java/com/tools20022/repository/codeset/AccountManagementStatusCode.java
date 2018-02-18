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
import com.tools20022.repository.codeset.AccountManagementStatusCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the status of an account management instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountManagementStatusCode#Received
 * AccountManagementStatusCode.Received}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountManagementStatusCode#Accepted
 * AccountManagementStatusCode.Accepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountManagementStatusCode#ProcessingOngoing
 * AccountManagementStatusCode.ProcessingOngoing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountManagementStatusCode#SentToNextParty
 * AccountManagementStatusCode.SentToNextParty}</li>
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
 * <li>"RECE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountManagementStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the status of an account management instruction."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AccountManagementStatusCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * The account management instruction has been received and is acknowledged.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountManagementStatusCode
	 * AccountManagementStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RECE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Received"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The account management instruction has been received and is acknowledged."
	 * </li>
	 * </ul>
	 */
	public static final AccountManagementStatusCode Received = new AccountManagementStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Received";
			definition = "The account management instruction has been received and is acknowledged.";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountManagementStatusCode.mmObject();
			codeName = "RECE";
		}
	};
	/**
	 * The account management instruction has been validated and accepted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountManagementStatusCode
	 * AccountManagementStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACCP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Accepted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The account management instruction has been validated and accepted."</li>
	 * </ul>
	 */
	public static final AccountManagementStatusCode Accepted = new AccountManagementStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Accepted";
			definition = "The account management instruction has been validated and accepted.";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountManagementStatusCode.mmObject();
			codeName = "ACCP";
		}
	};
	/**
	 * The account management instruction is being processed and the
	 * confirmation will follow.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountManagementStatusCode
	 * AccountManagementStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXEC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingOngoing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The account management instruction is being processed and the confirmation will follow."
	 * </li>
	 * </ul>
	 */
	public static final AccountManagementStatusCode ProcessingOngoing = new AccountManagementStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingOngoing";
			definition = "The account management instruction is being processed and the confirmation will follow.";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountManagementStatusCode.mmObject();
			codeName = "EXEC";
		}
	};
	/**
	 * The account management instruction has been sent to the next party, eg,
	 * the next intermediary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountManagementStatusCode
	 * AccountManagementStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STNP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SentToNextParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The account management instruction has been sent to the next party, eg, the next intermediary."
	 * </li>
	 * </ul>
	 */
	public static final AccountManagementStatusCode SentToNextParty = new AccountManagementStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SentToNextParty";
			definition = "The account management instruction has been sent to the next party, eg, the next intermediary.";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountManagementStatusCode.mmObject();
			codeName = "STNP";
		}
	};
	final static private LinkedHashMap<String, AccountManagementStatusCode> codesByName = new LinkedHashMap<>();

	protected AccountManagementStatusCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("RECE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountManagementStatusCode";
				definition = "Specifies the status of an account management instruction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AccountManagementStatusCode.Received, com.tools20022.repository.codeset.AccountManagementStatusCode.Accepted,
						com.tools20022.repository.codeset.AccountManagementStatusCode.ProcessingOngoing, com.tools20022.repository.codeset.AccountManagementStatusCode.SentToNextParty);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Received.getCodeName().get(), Received);
		codesByName.put(Accepted.getCodeName().get(), Accepted);
		codesByName.put(ProcessingOngoing.getCodeName().get(), ProcessingOngoing);
		codesByName.put(SentToNextParty.getCodeName().get(), SentToNextParty);
	}

	public static AccountManagementStatusCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AccountManagementStatusCode[] values() {
		AccountManagementStatusCode[] values = new AccountManagementStatusCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AccountManagementStatusCode> {
		@Override
		public AccountManagementStatusCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AccountManagementStatusCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}