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
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.ISODate;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Processes by which an obligation is extinguished fully or partially.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="ObligationFulfilment" src="doc-files/ObligationFulfilment.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.ObligationFulfilment#Date
 * ObligationFulfilment.Date}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ObligationFulfilment#ObligationOffset
 * ObligationFulfilment.ObligationOffset}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ObligationFulfilment#ResultingObligation
 * ObligationFulfilment.ResultingObligation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Obligation#Offset
 * Obligation.Offset}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Obligation#OriginalObligationProcess
 * Obligation.OriginalObligationProcess}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Payment Payment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTransfer
 * SecuritiesTransfer}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Clearing Clearing}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ProductDelivery
 * ProductDelivery}</li>
 * <li>{@linkplain com.tools20022.repository.entity.BuyIn BuyIn}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PairOff PairOff}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Netting Netting}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Rollover Rollover}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Novation Novation}</li>
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
 * "ObligationFulfilment"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Processes by which an obligation is extinguished fully or partially."</li>
 * </ul>
 */
public class ObligationFulfilment {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Date and time on which assets become available.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionCertificate2#TransactionDate
	 * TransactionCertificate2.TransactionDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CertificateReference1#Date
	 * CertificateReference1.Date}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateAuthentication1#Date
	 * MandateAuthentication1.Date}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ObligationFulfilment
	 * ObligationFulfilment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Date"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time on which assets become available."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Date = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionCertificate2.TransactionDate, com.tools20022.repository.msg.CertificateReference1.Date, com.tools20022.repository.msg.MandateAuthentication1.Date);
			elementContext_lazy = () -> ObligationFulfilment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Date";
			definition = "Date and time on which assets become available.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Specifies the obligation which has been offset for instance a payment
	 * obligation or a securities delivery.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Obligation#Offset
	 * Obligation.Offset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Obligation
	 * Obligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ObligationFulfilment
	 * ObligationFulfilment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ObligationOffset"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the obligation which has been offset for instance a payment obligation or a securities delivery."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ObligationOffset = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ObligationFulfilment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ObligationOffset";
			definition = "Specifies the obligation which has been offset for instance a payment obligation or a securities delivery.";
			minOccurs = 0;
			type_lazy = () -> Obligation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Obligation.Offset;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the obligation which result from a settlement process, for
	 * instance the remaining obligation when the obligations are netted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Obligation#OriginalObligationProcess
	 * Obligation.OriginalObligationProcess}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Obligation
	 * Obligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ObligationFulfilment
	 * ObligationFulfilment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResultingObligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the obligation which result from a settlement process, for instance the remaining obligation when the obligations are netted."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ResultingObligation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ObligationFulfilment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ResultingObligation";
			definition = "Specifies the obligation which result from a settlement process, for instance the remaining obligation when the obligations are netted.";
			minOccurs = 0;
			type_lazy = () -> Obligation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Obligation.OriginalObligationProcess;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ObligationFulfilment";
				definition = "Processes by which an obligation is extinguished fully or partially.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Obligation.Offset, com.tools20022.repository.entity.Obligation.OriginalObligationProcess);
				subType_lazy = () -> Arrays.asList(Payment.mmObject(), SecuritiesTransfer.mmObject(), Clearing.mmObject(), ProductDelivery.mmObject(), BuyIn.mmObject(), PairOff.mmObject(), Netting.mmObject(), Rollover.mmObject(),
						Novation.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ObligationFulfilment.Date, com.tools20022.repository.entity.ObligationFulfilment.ObligationOffset,
						com.tools20022.repository.entity.ObligationFulfilment.ResultingObligation);
			}
		});
		return mmObject_lazy.get();
	}
}