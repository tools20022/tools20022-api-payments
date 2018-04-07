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
import com.tools20022.repository.entity.BulkPayment;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.TransactionCertificate2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;

/**
 * Payment which consists of one single transaction. This payment may be grouped
 * with other similar payments to form a bulk payment.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="IndividualPayment" src="doc-files/IndividualPayment.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IndividualPayment#mmBulkPayment
 * IndividualPayment.mmBulkPayment}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.BulkPayment#mmGroups
 * BulkPayment.mmGroups}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionCertificate2#mmReferredDocument
 * TransactionCertificate2.mmReferredDocument}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.ChequePayment ChequePayment}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.DirectDebit DirectDebit}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashDeposit CashDeposit}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CreditTransfer
 * CreditTransfer}</li>
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
 * "IndividualPayment"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Payment which consists of one single transaction. This payment may be grouped with other similar payments to form a bulk payment."
 * </li>
 * </ul>
 */
public class IndividualPayment extends Payment {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected BulkPayment bulkPayment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BulkPayment#mmGroups
	 * BulkPayment.mmGroups}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BulkPayment
	 * BulkPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.IndividualPayment
	 * IndividualPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BulkPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment hich groups a series of individual payments."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<IndividualPayment, Optional<BulkPayment>> mmBulkPayment = new MMBusinessAssociationEnd<IndividualPayment, Optional<BulkPayment>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.IndividualPayment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BulkPayment";
			definition = "Payment hich groups a series of individual payments.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.BulkPayment.mmGroups;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BulkPayment.mmObject();
		}

		@Override
		public Optional<BulkPayment> getValue(IndividualPayment obj) {
			return obj.getBulkPayment();
		}

		@Override
		public void setValue(IndividualPayment obj, Optional<BulkPayment> value) {
			obj.setBulkPayment(value.orElse(null));
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "IndividualPayment";
				definition = "Payment which consists of one single transaction. This payment may be grouped with other similar payments to form a bulk payment.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.BulkPayment.mmGroups);
				derivationElement_lazy = () -> Arrays.asList(TransactionCertificate2.mmReferredDocument);
				subType_lazy = () -> Arrays.asList(ChequePayment.mmObject(), CardPayment.mmObject(), DirectDebit.mmObject(), CashDeposit.mmObject(), CreditTransfer.mmObject());
				superType_lazy = () -> Payment.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.IndividualPayment.mmBulkPayment);
			}

			@Override
			public Class<?> getInstanceClass() {
				return IndividualPayment.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<BulkPayment> getBulkPayment() {
		return bulkPayment == null ? Optional.empty() : Optional.of(bulkPayment);
	}

	public IndividualPayment setBulkPayment(com.tools20022.repository.entity.BulkPayment bulkPayment) {
		this.bulkPayment = bulkPayment;
		return this;
	}
}