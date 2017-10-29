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
 * Specifies the role of the party in the settlement of the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlingCapacityCode#SettlingCustodian
 * SettlingCapacityCode.SettlingCustodian}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlingCapacityCode#SettlingAgent
 * SettlingCapacityCode.SettlingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlingCapacityCode#SettlingPrincipal
 * SettlingCapacityCode.SettlingPrincipal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlingCapacityCode#SettlingRisklessPrincipal
 * SettlingCapacityCode.SettlingRisklessPrincipal}</li>
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
 * <li>"CUST"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SettlingCapacityCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the role of the party in the settlement of the transaction."</li>
 * </ul>
 */
public class SettlingCapacityCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Settlement party is a custodian. It receives/delivers the securities and
	 * carries out custodial duties.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlingCapacityCode
	 * SettlingCapacityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CUST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlingCustodian"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement party is a custodian. It receives/delivers the securities and carries out custodial duties."
	 * </li>
	 * </ul>
	 */
	public static final MMCode SettlingCustodian = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlingCustodian";
			definition = "Settlement party is a custodian. It receives/delivers the securities and carries out custodial duties.";
			owner_lazy = () -> SettlingCapacityCode.mmObject();
			codeName = "CUST";
		}
	};
	/**
	 * Settlement party is trading and settling transactions in financial
	 * instruments on behalf of its client(s).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlingCapacityCode
	 * SettlingCapacityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SAGE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlingAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement party is trading and settling transactions in financial instruments on behalf of its client(s)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode SettlingAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlingAgent";
			definition = "Settlement party is trading and settling transactions in financial instruments on behalf of its client(s).";
			owner_lazy = () -> SettlingCapacityCode.mmObject();
			codeName = "SAGE";
		}
	};
	/**
	 * Settlement party is settling its own trades.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlingCapacityCode
	 * SettlingCapacityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPRI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlingPrincipal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement party is settling its own trades."</li>
	 * </ul>
	 */
	public static final MMCode SettlingPrincipal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlingPrincipal";
			definition = "Settlement party is settling its own trades.";
			owner_lazy = () -> SettlingCapacityCode.mmObject();
			codeName = "SPRI";
		}
	};
	/**
	 * Party settles trades that were simultaneously offset.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlingCapacityCode
	 * SettlingCapacityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RISP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlingRisklessPrincipal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party settles trades that were simultaneously offset."</li>
	 * </ul>
	 */
	public static final MMCode SettlingRisklessPrincipal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlingRisklessPrincipal";
			definition = "Party settles trades that were simultaneously offset.";
			owner_lazy = () -> SettlingCapacityCode.mmObject();
			codeName = "RISP";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CUST");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SettlingCapacityCode";
				definition = "Specifies the role of the party in the settlement of the transaction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SettlingCapacityCode.SettlingCustodian, com.tools20022.repository.codeset.SettlingCapacityCode.SettlingAgent,
						com.tools20022.repository.codeset.SettlingCapacityCode.SettlingPrincipal, com.tools20022.repository.codeset.SettlingCapacityCode.SettlingRisklessPrincipal);
			}
		});
		return mmObject_lazy.get();
	}
}