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

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.SecuritiesFinancing;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Sale of securities together with an agreement for the seller to buy back the
 * securities at a later date.<br>
 * A repo is equivalent to a spot sale combined with a forward contract.<br>
 * For the seller of the security it is a repo; for the buyer of the security it
 * is a reverse repurchase agreement.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="RepurchaseAgreement" src="doc-files/RepurchaseAgreement.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RepurchaseAgreement#PaymentObligation
 * RepurchaseAgreement.PaymentObligation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#RepurchaseAgreement
 * PaymentObligation.RepurchaseAgreement}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
 * SecuritiesFinancing}</li>
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
 * "RepurchaseAgreement"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Sale of securities together with an agreement for the seller to buy back the securities at a later date.\r\nA repo is equivalent to a spot sale combined with a forward contract.\r\nFor the seller of the security it is a repo; for the buyer of the security it is a reverse repurchase agreement. "
 * </li>
 * </ul>
 */
public class RepurchaseAgreement extends SecuritiesFinancing {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Obligation covered by a repurchase agreement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#RepurchaseAgreement
	 * PaymentObligation.RepurchaseAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RepurchaseAgreement
	 * RepurchaseAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentObligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Obligation covered by a repurchase agreement."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PaymentObligation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> RepurchaseAgreement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentObligation";
			definition = "Obligation covered by a repurchase agreement.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentObligation.RepurchaseAgreement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RepurchaseAgreement";
				definition = "Sale of securities together with an agreement for the seller to buy back the securities at a later date.\r\nA repo is equivalent to a spot sale combined with a forward contract.\r\nFor the seller of the security it is a repo; for the buyer of the security it is a reverse repurchase agreement. ";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentObligation.RepurchaseAgreement);
				superType_lazy = () -> SecuritiesFinancing.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.RepurchaseAgreement.PaymentObligation);
			}
		});
		return mmObject_lazy.get();
	}
}