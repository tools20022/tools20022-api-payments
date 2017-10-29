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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the method used to settle the payment instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementMethodCode#InstructedAgent
 * SettlementMethodCode.InstructedAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementMethodCode#InstructingAgent
 * SettlementMethodCode.InstructingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementMethodCode#CoverMethod
 * SettlementMethodCode.CoverMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementMethodCode#ClearingSystem
 * SettlementMethodCode.ClearingSystem}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.SettlementMethod1Code
 * SettlementMethod1Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SettlementMethod2Code
 * SettlementMethod2Code}</li>
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
 * <li>"INDA"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SettlementMethodCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the method used to settle the payment instruction."</li>
 * </ul>
 */
public class SettlementMethodCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Settlement is done by the agent instructed to execute a payment
	 * instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementMethodCode
	 * SettlementMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INDA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement is done by the agent instructed to execute a payment instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMCode InstructedAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InstructedAgent";
			definition = "Settlement is done by the agent instructed to execute a payment instruction.";
			owner_lazy = () -> SettlementMethodCode.mmObject();
			codeName = "INDA";
		}
	};
	/**
	 * Settlement is done by the agent instructing and forwarding the payment to
	 * the next party in the payment chain.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementMethodCode
	 * SettlementMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INGA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructingAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement is done by the agent instructing and forwarding the payment to the next party in the payment chain."
	 * </li>
	 * </ul>
	 */
	public static final MMCode InstructingAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InstructingAgent";
			definition = "Settlement is done by the agent instructing and forwarding the payment to the next party in the payment chain.";
			owner_lazy = () -> SettlementMethodCode.mmObject();
			codeName = "INGA";
		}
	};
	/**
	 * Settlement is done through a cover payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementMethodCode
	 * SettlementMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COVE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoverMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement is done through a cover payment."</li>
	 * </ul>
	 */
	public static final MMCode CoverMethod = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CoverMethod";
			definition = "Settlement is done through a cover payment.";
			owner_lazy = () -> SettlementMethodCode.mmObject();
			codeName = "COVE";
		}
	};
	/**
	 * Settlement is done through a payment clearing system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementMethodCode
	 * SettlementMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLRG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingSystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement is done through a payment clearing system."</li>
	 * </ul>
	 */
	public static final MMCode ClearingSystem = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClearingSystem";
			definition = "Settlement is done through a payment clearing system.";
			owner_lazy = () -> SettlementMethodCode.mmObject();
			codeName = "CLRG";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("INDA");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SettlementMethodCode";
				definition = "Specifies the method used to settle the payment instruction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SettlementMethodCode.InstructedAgent, com.tools20022.repository.codeset.SettlementMethodCode.InstructingAgent,
						com.tools20022.repository.codeset.SettlementMethodCode.CoverMethod, com.tools20022.repository.codeset.SettlementMethodCode.ClearingSystem);
				derivation_lazy = () -> Arrays.asList(SettlementMethod1Code.mmObject(), SettlementMethod2Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}