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
import com.tools20022.repository.codeset.DemandStatusCode;
import com.tools20022.repository.codeset.SettlementAdviceTypeCode;
import com.tools20022.repository.codeset.TerminationReasonCode;
import com.tools20022.repository.entity.StatusReason;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the reason for the status or for the action (for instance
 * settlement reason).
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="UndertakingStatusReason"
 * src="doc-files/UndertakingStatusReason.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UndertakingStatusReason#Discrepancy
 * UndertakingStatusReason.Discrepancy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UndertakingStatusReason#UndertakingStatus
 * UndertakingStatusReason.UndertakingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UndertakingStatusReason#TerminationReason
 * UndertakingStatusReason.TerminationReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UndertakingStatusReason#DemandRefusalStatusReason
 * UndertakingStatusReason.DemandRefusalStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UndertakingStatusReason#SettlementReason
 * UndertakingStatusReason.SettlementReason}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UndertakingStatus#UndertakingStatusReason
 * UndertakingStatus.UndertakingStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Discrepancy#UndertakingStatusReason
 * Discrepancy.UndertakingStatusReason}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.StatusReason
 * StatusReason}</li>
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
 * "UndertakingStatusReason"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason for the status or for the action (for instance settlement reason)."
 * </li>
 * </ul>
 */
public class UndertakingStatusReason extends StatusReason {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Demand is refused because of a discrepancy in the demand.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Discrepancy#UndertakingStatusReason
	 * Discrepancy.UndertakingStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Discrepancy
	 * Discrepancy}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingStatusReason
	 * UndertakingStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Discrepancy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Demand is refused because of a discrepancy in the demand."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Discrepancy = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> UndertakingStatusReason.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Discrepancy";
			definition = "Demand is refused because of a discrepancy in the demand.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Discrepancy.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Discrepancy.UndertakingStatusReason;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Status for which a reason is provided. It is derived from the association
	 * between StatusReason and Status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingStatus#UndertakingStatusReason
	 * UndertakingStatus.UndertakingStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.UndertakingStatus
	 * UndertakingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingStatusReason
	 * UndertakingStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UndertakingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status for which a reason is provided. It is derived from the association between StatusReason and Status."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd UndertakingStatus = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> UndertakingStatusReason.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UndertakingStatus";
			definition = "Status for which a reason is provided. It is derived from the association between StatusReason and Status.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.UndertakingStatus.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.UndertakingStatus.UndertakingStatusReason;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Reason for the termination.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TerminationReasonCode
	 * TerminationReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingStatusReason
	 * UndertakingStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminationReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for the termination."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TerminationReason = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> UndertakingStatusReason.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TerminationReason";
			definition = "Reason for the termination.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TerminationReasonCode.mmObject();
		}
	};
	/**
	 * Processing status reported by the issuer for the refusal of a demand.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DemandStatusCode
	 * DemandStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingStatusReason
	 * UndertakingStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DemandRefusalStatusReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Processing status reported by the issuer for the refusal of a demand."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute DemandRefusalStatusReason = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> UndertakingStatusReason.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DemandRefusalStatusReason";
			definition = "Processing status reported by the issuer for the refusal of a demand.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DemandStatusCode.mmObject();
		}
	};
	/**
	 * Specifies the reason for the settlement of an amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementAdviceTypeCode
	 * SettlementAdviceTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingStatusReason
	 * UndertakingStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the reason for the settlement of an amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SettlementReason = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> UndertakingStatusReason.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementReason";
			definition = "Specifies the reason for the settlement of an amount.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> SettlementAdviceTypeCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "UndertakingStatusReason";
				definition = "Specifies the reason for the status or for the action (for instance settlement reason).";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.UndertakingStatus.UndertakingStatusReason, com.tools20022.repository.entity.Discrepancy.UndertakingStatusReason);
				superType_lazy = () -> StatusReason.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.UndertakingStatusReason.Discrepancy, com.tools20022.repository.entity.UndertakingStatusReason.UndertakingStatus,
						com.tools20022.repository.entity.UndertakingStatusReason.TerminationReason, com.tools20022.repository.entity.UndertakingStatusReason.DemandRefusalStatusReason,
						com.tools20022.repository.entity.UndertakingStatusReason.SettlementReason);
			}
		});
		return mmObject_lazy.get();
	}
}