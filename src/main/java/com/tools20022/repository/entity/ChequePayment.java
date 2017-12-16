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

import com.tools20022.metamodel.MMAggregation;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.IndividualPayment;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Payment made by drawing a cheque in order to settle a debt.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="ChequePayment" src="doc-files/ChequePayment.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.IndividualPayment
 * IndividualPayment}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.ChequePayment#mmCheque
 * ChequePayment.mmCheque}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Cheque#mmRelatedPayment
 * Cheque.mmRelatedPayment}</li>
 * </ul>
 * </li>
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
 * "ChequePayment"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Payment made by drawing a cheque in order to settle a debt."</li>
 * </ul>
 */
public class ChequePayment extends IndividualPayment {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.Cheque> cheque;
	/**
	 * Specifies the characteristics of the cheque which was drawn to settle a
	 * debt.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Cheque#mmRelatedPayment
	 * Cheque.mmRelatedPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Cheque Cheque}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ChequePayment ChequePayment}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cheque"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the characteristics of the cheque which was drawn to settle a debt."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCheque = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ChequePayment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Cheque";
			definition = "Specifies the characteristics of the cheque which was drawn to settle a debt.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Cheque.mmRelatedPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Cheque.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ChequePayment";
				definition = "Payment made by drawing a cheque in order to settle a debt.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Cheque.mmRelatedPayment);
				superType_lazy = () -> IndividualPayment.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ChequePayment.mmCheque);
			}

			@Override
			public Class<?> getInstanceClass() {
				return ChequePayment.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<Cheque> getCheque() {
		return cheque;
	}

	public void setCheque(List<com.tools20022.repository.entity.Cheque> cheque) {
		this.cheque = cheque;
	}
}