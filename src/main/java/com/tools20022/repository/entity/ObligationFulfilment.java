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

import com.tools20022.metamodel.*;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CertificateReference1;
import com.tools20022.repository.msg.MandateAuthentication1;
import com.tools20022.repository.msg.TransactionCertificate2;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * <li>{@linkplain com.tools20022.repository.entity.ObligationFulfilment#mmDate
 * ObligationFulfilment.mmDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ObligationFulfilment#mmObligationOffset
 * ObligationFulfilment.mmObligationOffset}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ObligationFulfilment#mmResultingObligation
 * ObligationFulfilment.mmResultingObligation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Obligation#mmOffset
 * Obligation.mmOffset}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Obligation#mmOriginalObligationProcess
 * Obligation.mmOriginalObligationProcess}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	protected ISODate date;
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
	 * {@linkplain com.tools20022.repository.msg.TransactionCertificate2#mmTransactionDate
	 * TransactionCertificate2.mmTransactionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CertificateReference1#mmDate
	 * CertificateReference1.mmDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateAuthentication1#mmDate
	 * MandateAuthentication1.mmDate}</li>
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
	public static final MMBusinessAttribute mmDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TransactionCertificate2.mmTransactionDate, CertificateReference1.mmDate, MandateAuthentication1.mmDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ObligationFulfilment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Date";
			definition = "Date and time on which assets become available.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ObligationFulfilment.class.getMethod("getDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.Obligation> obligationOffset;
	/**
	 * Specifies the obligation which has been offset for instance a payment
	 * obligation or a securities delivery.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Obligation#mmOffset
	 * Obligation.mmOffset}</li>
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
	public static final MMBusinessAssociationEnd mmObligationOffset = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ObligationFulfilment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ObligationOffset";
			definition = "Specifies the obligation which has been offset for instance a payment obligation or a securities delivery.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Obligation.mmOffset;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Obligation.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Obligation> resultingObligation;
	/**
	 * Specifies the obligation which result from a settlement process, for
	 * instance the remaining obligation when the obligations are netted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Obligation#mmOriginalObligationProcess
	 * Obligation.mmOriginalObligationProcess}</li>
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
	public static final MMBusinessAssociationEnd mmResultingObligation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ObligationFulfilment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ResultingObligation";
			definition = "Specifies the obligation which result from a settlement process, for instance the remaining obligation when the obligations are netted.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Obligation.mmOriginalObligationProcess;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Obligation.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ObligationFulfilment";
				definition = "Processes by which an obligation is extinguished fully or partially.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Obligation.mmOffset, com.tools20022.repository.entity.Obligation.mmOriginalObligationProcess);
				subType_lazy = () -> Arrays.asList(Payment.mmObject(), SecuritiesTransfer.mmObject(), Clearing.mmObject(), ProductDelivery.mmObject(), BuyIn.mmObject(), PairOff.mmObject(), Netting.mmObject(), Rollover.mmObject(),
						Novation.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ObligationFulfilment.mmDate, com.tools20022.repository.entity.ObligationFulfilment.mmObligationOffset,
						com.tools20022.repository.entity.ObligationFulfilment.mmResultingObligation);
			}

			@Override
			public Class<?> getInstanceClass() {
				return ObligationFulfilment.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ISODate getDate() {
		return date;
	}

	public void setDate(ISODate date) {
		this.date = date;
	}

	public List<Obligation> getObligationOffset() {
		return obligationOffset;
	}

	public void setObligationOffset(List<com.tools20022.repository.entity.Obligation> obligationOffset) {
		this.obligationOffset = obligationOffset;
	}

	public List<Obligation> getResultingObligation() {
		return resultingObligation;
	}

	public void setResultingObligation(List<com.tools20022.repository.entity.Obligation> resultingObligation) {
		this.resultingObligation = resultingObligation;
	}
}