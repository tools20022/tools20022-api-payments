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
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.entity.StatusReason;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the underlying reason for a status of a corporate action.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CorporateActionStatusReason"
 * src="doc-files/CorporateActionStatusReason.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason#CorporateActionCancellationReason
 * CorporateActionStatusReason.CorporateActionCancellationReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason#CorporateActionStatus
 * CorporateActionStatusReason.CorporateActionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason#AcceptedReason
 * CorporateActionStatusReason.AcceptedReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason#ReversalReason
 * CorporateActionStatusReason.ReversalReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason#MovementFailureReason
 * CorporateActionStatusReason.MovementFailureReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason#MovementRejectionReason
 * CorporateActionStatusReason.MovementRejectionReason}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#CorporateActionStatusReason
 * CorporateActionStatus.CorporateActionStatusReason}</li>
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
 * "CorporateActionStatusReason"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the underlying reason for a status of a corporate action."</li>
 * </ul>
 */
public class CorporateActionStatusReason extends StatusReason {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies reasons for cancellation of a corporate action event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionCancellationReasonCode
	 * CorporateActionCancellationReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason
	 * CorporateActionStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionCancellationReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies reasons for cancellation of a corporate action event."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CorporateActionCancellationReason = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionStatusReason.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionCancellationReason";
			definition = "Specifies reasons for cancellation of a corporate action event.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CorporateActionCancellationReasonCode.mmObject();
		}
	};
	/**
	 * Corporate actions status for which a reason is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#CorporateActionStatusReason
	 * CorporateActionStatus.CorporateActionStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus
	 * CorporateActionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason
	 * CorporateActionStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Corporate actions status for which a reason is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CorporateActionStatus = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionStatusReason.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionStatus";
			definition = "Corporate actions status for which a reason is provided.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionStatus.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionStatus.CorporateActionStatusReason;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies additional information about the processed instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AcknowledgementReasonCode
	 * AcknowledgementReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason
	 * CorporateActionStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptedReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies additional information about the processed instruction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AcceptedReason = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionStatusReason.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AcceptedReason";
			definition = "Specifies additional information about the processed instruction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> AcknowledgementReasonCode.mmObject();
		}
	};
	/**
	 * Reason for the reversal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReversalReasonCode
	 * CorporateActionReversalReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason
	 * CorporateActionStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversalReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for the reversal."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ReversalReason = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionStatusReason.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReversalReason";
			definition = "Reason for the reversal.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CorporateActionReversalReasonCode.mmObject();
		}
	};
	/**
	 * The reason for the failure.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FailedSettlementReasonCode
	 * FailedSettlementReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason
	 * CorporateActionStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MovementFailureReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The reason for the failure."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MovementFailureReason = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionStatusReason.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MovementFailureReason";
			definition = "The reason for the failure.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> FailedSettlementReasonCode.mmObject();
		}
	};
	/**
	 * Provides information about the rejection status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason
	 * CorporateActionStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MovementRejectionReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides information about the rejection status."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MovementRejectionReason = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionStatusReason.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MovementRejectionReason";
			definition = "Provides information about the rejection status.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> RejectionReasonCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionStatusReason";
				definition = "Specifies the underlying reason for a status of a corporate action.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionStatus.CorporateActionStatusReason);
				superType_lazy = () -> StatusReason.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionStatusReason.CorporateActionCancellationReason, com.tools20022.repository.entity.CorporateActionStatusReason.CorporateActionStatus,
						com.tools20022.repository.entity.CorporateActionStatusReason.AcceptedReason, com.tools20022.repository.entity.CorporateActionStatusReason.ReversalReason,
						com.tools20022.repository.entity.CorporateActionStatusReason.MovementFailureReason, com.tools20022.repository.entity.CorporateActionStatusReason.MovementRejectionReason);
			}
		});
		return mmObject_lazy.get();
	}
}