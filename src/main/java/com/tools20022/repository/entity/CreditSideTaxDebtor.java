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
import com.tools20022.repository.entity.TaxPartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.TaxInformation3;
import com.tools20022.repository.msg.TaxInformation4;
import com.tools20022.repository.msg.TaxInformation6;
import com.tools20022.repository.msg.TaxInformation7;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Party on the credit side of the transaction to which the tax applies.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CreditSideTaxDebtor" src="doc-files/CreditSideTaxDebtor.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.TaxPartyRole
 * TaxPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TaxInformation3#mmCreditor
 * TaxInformation3.mmCreditor}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxInformation4#mmCreditor
 * TaxInformation4.mmCreditor}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxInformation6#mmCreditor
 * TaxInformation6.mmCreditor}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxInformation7#mmCreditor
 * TaxInformation7.mmCreditor}</li>
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
 * "CreditSideTaxDebtor"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Party on the credit side of the transaction to which the tax applies."</li>
 * </ul>
 */
public class CreditSideTaxDebtor extends TaxPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CreditSideTaxDebtor";
				definition = "Party on the credit side of the transaction to which the tax applies.";
				derivationElement_lazy = () -> Arrays.asList(TaxInformation3.mmCreditor, TaxInformation4.mmCreditor, TaxInformation6.mmCreditor, TaxInformation7.mmCreditor);
				superType_lazy = () -> TaxPartyRole.mmObject();
			}

			@Override
			public Class<?> getInstanceClass() {
				return CreditSideTaxDebtor.class;
			}
		});
		return mmObject_lazy.get();
	}
}