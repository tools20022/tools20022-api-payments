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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.PaymentObligationPartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Garnishment1;
import com.tools20022.repository.msg.RequestedModification6;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Ultimate party that owes an amount of money to the (ultimate) creditor.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="UltimateDebtorRole" src="doc-files/UltimateDebtorRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Garnishment1#mmGarnishee
 * Garnishment1.mmGarnishee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification6#mmUltimateDebtor
 * RequestedModification6.mmUltimateDebtor}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.PaymentObligationPartyRole
 * PaymentObligationPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UltimateDebtorRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Ultimate party that owes an amount of money to the (ultimate) creditor."</li>
 * </ul>
 */
public class UltimateDebtorRole extends PaymentObligationPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UltimateDebtorRole";
				definition = "Ultimate party that owes an amount of money to the (ultimate) creditor.";
				derivationElement_lazy = () -> Arrays.asList(Garnishment1.mmGarnishee, RequestedModification6.mmUltimateDebtor);
				superType_lazy = () -> PaymentObligationPartyRole.mmObject();
			}

			@Override
			public Class<?> getInstanceClass() {
				return UltimateDebtorRole.class;
			}
		});
		return mmObject_lazy.get();
	}
}