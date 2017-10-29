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
 * Specifies the type of counterparty's action the response is related to.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CounterpartyResponseStatusReasonCode#CounterpartyTransaction
 * CounterpartyResponseStatusReasonCode.CounterpartyTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CounterpartyResponseStatusReasonCode#CounterpartyCancellation
 * CounterpartyResponseStatusReasonCode.CounterpartyCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CounterpartyResponseStatusReasonCode#CounterpartyModification
 * CounterpartyResponseStatusReasonCode.CounterpartyModification}</li>
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
 * <li>"CPTR"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CounterpartyResponseStatusReasonCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of counterparty's action the response is related to."</li>
 * </ul>
 */
public class CounterpartyResponseStatusReasonCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies that the response is related to an allegement from the
	 * counterparty.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CounterpartyResponseStatusReasonCode
	 * CounterpartyResponseStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CPTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies  that the response is related to an allegement from the counterparty."
	 * </li>
	 * </ul>
	 */
	public static final MMCode CounterpartyTransaction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyTransaction";
			definition = "Specifies  that the response is related to an allegement from the counterparty.";
			owner_lazy = () -> CounterpartyResponseStatusReasonCode.mmObject();
			codeName = "CPTR";
		}
	};
	/**
	 * Specifies that the response is related to the cancellation request of the
	 * counterparty.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CounterpartyResponseStatusReasonCode
	 * CounterpartyResponseStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CPCX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyCancellation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies  that the response is related to the cancellation request of the counterparty."
	 * </li>
	 * </ul>
	 */
	public static final MMCode CounterpartyCancellation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyCancellation";
			definition = "Specifies  that the response is related to the cancellation request of the counterparty.";
			owner_lazy = () -> CounterpartyResponseStatusReasonCode.mmObject();
			codeName = "CPCX";
		}
	};
	/**
	 * Specifies that the response is related to the modification request of the
	 * counterparty.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CounterpartyResponseStatusReasonCode
	 * CounterpartyResponseStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CPMD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyModification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies  that the response is related to the modification request of the counterparty."
	 * </li>
	 * </ul>
	 */
	public static final MMCode CounterpartyModification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyModification";
			definition = "Specifies  that the response is related to the modification request of the counterparty.";
			owner_lazy = () -> CounterpartyResponseStatusReasonCode.mmObject();
			codeName = "CPMD";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CPTR");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CounterpartyResponseStatusReasonCode";
				definition = "Specifies the type of counterparty's action the response is related to.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CounterpartyResponseStatusReasonCode.CounterpartyTransaction,
						com.tools20022.repository.codeset.CounterpartyResponseStatusReasonCode.CounterpartyCancellation, com.tools20022.repository.codeset.CounterpartyResponseStatusReasonCode.CounterpartyModification);
			}
		});
		return mmObject_lazy.get();
	}
}