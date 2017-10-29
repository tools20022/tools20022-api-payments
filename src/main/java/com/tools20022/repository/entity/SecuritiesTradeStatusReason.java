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
 * Specifies the underlying reason for a status of a securities trade.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesTradeStatusReason"
 * src="doc-files/SecuritiesTradeStatusReason.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#UnmatchedReason
 * SecuritiesTradeStatusReason.UnmatchedReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#DeniedReason
 * SecuritiesTradeStatusReason.DeniedReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#SecuritiesTradeStatus
 * SecuritiesTradeStatusReason.SecuritiesTradeStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#GeneratedReason
 * SecuritiesTradeStatusReason.GeneratedReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#AllegementReason
 * SecuritiesTradeStatusReason.AllegementReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#PendingSettlementReason
 * SecuritiesTradeStatusReason.PendingSettlementReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#RepoCallAcknowledgementReason
 * SecuritiesTradeStatusReason.RepoCallAcknowledgementReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#RepairReason
 * SecuritiesTradeStatusReason.RepairReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#DeliveryReturnReason
 * SecuritiesTradeStatusReason.DeliveryReturnReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#CounterpartyStatusReason
 * SecuritiesTradeStatusReason.CounterpartyStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#ModifiedStatusReason
 * SecuritiesTradeStatusReason.ModifiedStatusReason}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#Reason
 * SecuritiesTradeStatus.Reason}</li>
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
 * "SecuritiesTradeStatusReason"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the underlying reason for a status of a securities trade."</li>
 * </ul>
 */
public class SecuritiesTradeStatusReason extends StatusReason {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Reason for the unmatched status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
	 * SecuritiesTradeStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnmatchedReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for the unmatched status."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute UnmatchedReason = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesTradeStatusReason.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnmatchedReason";
			definition = "Reason for the unmatched status.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> UnmatchedReasonCode.mmObject();
		}
	};
	/**
	 * Specifies the reason why the request was denied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DeniedReasonCode
	 * DeniedReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
	 * SecuritiesTradeStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeniedReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the reason why the request was denied."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute DeniedReason = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesTradeStatusReason.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DeniedReason";
			definition = "Specifies the reason why the request was denied.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DeniedReasonCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#Reason
	 * SecuritiesTradeStatus.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
	 * SecuritiesTradeStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesTradeStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status for which a reason is provided. It is derived from the association between StatusReason and Status."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesTradeStatus = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesTradeStatusReason.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTradeStatus";
			definition = "Status for which a reason is provided. It is derived from the association between StatusReason and Status.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.Reason;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the reason why the transaction was generated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.GeneratedReasonCode
	 * GeneratedReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
	 * SecuritiesTradeStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GeneratedReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the reason why the transaction was generated."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute GeneratedReason = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesTradeStatusReason.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GeneratedReason";
			definition = "Specifies the reason why the transaction was generated.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> GeneratedReasonCode.mmObject();
		}
	};
	/**
	 * Reason why the instruction has an allegement status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AllegementReasonCode
	 * AllegementReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
	 * SecuritiesTradeStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllegementReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason why the instruction has an allegement status."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AllegementReason = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesTradeStatusReason.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AllegementReason";
			definition = "Reason why the instruction has an allegement status.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> AllegementReasonCode.mmObject();
		}
	};
	/**
	 * Reason for the settlement pending status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode
	 * PendingSettlementStatusReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
	 * SecuritiesTradeStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingSettlementReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for the settlement pending status."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PendingSettlementReason = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesTradeStatusReason.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PendingSettlementReason";
			definition = "Reason for the settlement pending status.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.RepoCallAcknowledgementReasonCode
	 * RepoCallAcknowledgementReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
	 * SecuritiesTradeStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepoCallAcknowledgementReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies additional information about the processed instruction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RepoCallAcknowledgementReason = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesTradeStatusReason.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RepoCallAcknowledgementReason";
			definition = "Specifies additional information about the processed instruction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> RepoCallAcknowledgementReasonCode.mmObject();
		}
	};
	/**
	 * Specifies the reason why the instruction/request has a repair status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code
	 * RepairReasonV2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
	 * SecuritiesTradeStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepairReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reason why the instruction/request has a repair status."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RepairReason = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesTradeStatusReason.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RepairReason";
			definition = "Specifies the reason why the instruction/request has a repair status.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> RepairReasonV2Code.mmObject();
		}
	};
	/**
	 * Reason why the trade was returned.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DeliveryReturnCode
	 * DeliveryReturnCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
	 * SecuritiesTradeStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryReturnReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason why the trade was returned."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute DeliveryReturnReason = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesTradeStatusReason.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DeliveryReturnReason";
			definition = "Reason why the trade was returned.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DeliveryReturnCode.mmObject();
		}
	};
	/**
	 * Specifies the counterparty action which is the reason of the trade
	 * status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CounterpartyResponseStatusReasonCode
	 * CounterpartyResponseStatusReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
	 * SecuritiesTradeStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyStatusReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the counterparty action which is the reason of the trade status."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CounterpartyStatusReason = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesTradeStatusReason.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CounterpartyStatusReason";
			definition = "Specifies the counterparty action which is the reason of the trade status.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CounterpartyResponseStatusReasonCode.mmObject();
		}
	};
	/**
	 * Specifies the reason why the related instruction is modified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ModifiedStatusReasonCode
	 * ModifiedStatusReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
	 * SecuritiesTradeStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModifiedStatusReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reason why the related instruction is modified."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ModifiedStatusReason = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesTradeStatusReason.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ModifiedStatusReason";
			definition = "Specifies the reason why the related instruction is modified.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ModifiedStatusReasonCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesTradeStatusReason";
				definition = "Specifies the underlying reason for a status of a securities trade.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesTradeStatus.Reason);
				superType_lazy = () -> StatusReason.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesTradeStatusReason.UnmatchedReason, com.tools20022.repository.entity.SecuritiesTradeStatusReason.DeniedReason,
						com.tools20022.repository.entity.SecuritiesTradeStatusReason.SecuritiesTradeStatus, com.tools20022.repository.entity.SecuritiesTradeStatusReason.GeneratedReason,
						com.tools20022.repository.entity.SecuritiesTradeStatusReason.AllegementReason, com.tools20022.repository.entity.SecuritiesTradeStatusReason.PendingSettlementReason,
						com.tools20022.repository.entity.SecuritiesTradeStatusReason.RepoCallAcknowledgementReason, com.tools20022.repository.entity.SecuritiesTradeStatusReason.RepairReason,
						com.tools20022.repository.entity.SecuritiesTradeStatusReason.DeliveryReturnReason, com.tools20022.repository.entity.SecuritiesTradeStatusReason.CounterpartyStatusReason,
						com.tools20022.repository.entity.SecuritiesTradeStatusReason.ModifiedStatusReason);
			}
		});
		return mmObject_lazy.get();
	}
}