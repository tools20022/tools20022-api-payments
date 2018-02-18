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
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.entity.StatusReason;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.StatusReason
 * StatusReason}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmUnmatchedReason
 * SecuritiesTradeStatusReason.mmUnmatchedReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmDeniedReason
 * SecuritiesTradeStatusReason.mmDeniedReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmSecuritiesTradeStatus
 * SecuritiesTradeStatusReason.mmSecuritiesTradeStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmGeneratedReason
 * SecuritiesTradeStatusReason.mmGeneratedReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmAllegementReason
 * SecuritiesTradeStatusReason.mmAllegementReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmPendingSettlementReason
 * SecuritiesTradeStatusReason.mmPendingSettlementReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmRepoCallAcknowledgementReason
 * SecuritiesTradeStatusReason.mmRepoCallAcknowledgementReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmRepairReason
 * SecuritiesTradeStatusReason.mmRepairReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmDeliveryReturnReason
 * SecuritiesTradeStatusReason.mmDeliveryReturnReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmCounterpartyStatusReason
 * SecuritiesTradeStatusReason.mmCounterpartyStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmModifiedStatusReason
 * SecuritiesTradeStatusReason.mmModifiedStatusReason}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmReason
 * SecuritiesTradeStatus.mmReason}</li>
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
 * "SecuritiesTradeStatusReason"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the underlying reason for a status of a securities trade."</li>
 * </ul>
 */
public class SecuritiesTradeStatusReason extends StatusReason {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected UnmatchedReasonCode unmatchedReason;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute mmUnmatchedReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnmatchedReason";
			definition = "Reason for the unmatched status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UnmatchedReasonCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeStatusReason.class.getMethod("getUnmatchedReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DeniedReasonCode deniedReason;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute mmDeniedReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeniedReason";
			definition = "Specifies the reason why the request was denied.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DeniedReasonCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeStatusReason.class.getMethod("getDeniedReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesTradeStatus securitiesTradeStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmReason
	 * SecuritiesTradeStatus.mmReason}</li>
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
	public static final MMBusinessAssociationEnd mmSecuritiesTradeStatus = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTradeStatus";
			definition = "Status for which a reason is provided. It is derived from the association between StatusReason and Status.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmReason;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmObject();
		}
	};
	protected GeneratedReasonCode generatedReason;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute mmGeneratedReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GeneratedReason";
			definition = "Specifies the reason why the transaction was generated.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> GeneratedReasonCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeStatusReason.class.getMethod("getGeneratedReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected AllegementReasonCode allegementReason;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute mmAllegementReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AllegementReason";
			definition = "Reason why the instruction has an allegement status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AllegementReasonCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeStatusReason.class.getMethod("getAllegementReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PendingSettlementStatusReasonCode pendingSettlementReason;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute mmPendingSettlementReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PendingSettlementReason";
			definition = "Reason for the settlement pending status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeStatusReason.class.getMethod("getPendingSettlementReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected RepoCallAcknowledgementReasonCode repoCallAcknowledgementReason;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute mmRepoCallAcknowledgementReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RepoCallAcknowledgementReason";
			definition = "Specifies additional information about the processed instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RepoCallAcknowledgementReasonCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeStatusReason.class.getMethod("getRepoCallAcknowledgementReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected RepairReasonV2Code repairReason;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute mmRepairReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RepairReason";
			definition = "Specifies the reason why the instruction/request has a repair status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RepairReasonV2Code.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeStatusReason.class.getMethod("getRepairReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DeliveryReturnCode deliveryReturnReason;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute mmDeliveryReturnReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeliveryReturnReason";
			definition = "Reason why the trade was returned.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DeliveryReturnCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeStatusReason.class.getMethod("getDeliveryReturnReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CounterpartyResponseStatusReasonCode counterpartyStatusReason;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute mmCounterpartyStatusReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CounterpartyStatusReason";
			definition = "Specifies the counterparty action which is the reason of the trade status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CounterpartyResponseStatusReasonCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeStatusReason.class.getMethod("getCounterpartyStatusReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ModifiedStatusReasonCode modifiedStatusReason;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute mmModifiedStatusReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ModifiedStatusReason";
			definition = "Specifies the reason why the related instruction is modified.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ModifiedStatusReasonCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeStatusReason.class.getMethod("getModifiedStatusReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesTradeStatusReason";
				definition = "Specifies the underlying reason for a status of a securities trade.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesTradeStatus.mmReason);
				superType_lazy = () -> StatusReason.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesTradeStatusReason.mmUnmatchedReason, com.tools20022.repository.entity.SecuritiesTradeStatusReason.mmDeniedReason,
						com.tools20022.repository.entity.SecuritiesTradeStatusReason.mmSecuritiesTradeStatus, com.tools20022.repository.entity.SecuritiesTradeStatusReason.mmGeneratedReason,
						com.tools20022.repository.entity.SecuritiesTradeStatusReason.mmAllegementReason, com.tools20022.repository.entity.SecuritiesTradeStatusReason.mmPendingSettlementReason,
						com.tools20022.repository.entity.SecuritiesTradeStatusReason.mmRepoCallAcknowledgementReason, com.tools20022.repository.entity.SecuritiesTradeStatusReason.mmRepairReason,
						com.tools20022.repository.entity.SecuritiesTradeStatusReason.mmDeliveryReturnReason, com.tools20022.repository.entity.SecuritiesTradeStatusReason.mmCounterpartyStatusReason,
						com.tools20022.repository.entity.SecuritiesTradeStatusReason.mmModifiedStatusReason);
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesTradeStatusReason.class;
			}
		});
		return mmObject_lazy.get();
	}

	public UnmatchedReasonCode getUnmatchedReason() {
		return unmatchedReason;
	}

	public SecuritiesTradeStatusReason setUnmatchedReason(UnmatchedReasonCode unmatchedReason) {
		this.unmatchedReason = Objects.requireNonNull(unmatchedReason);
		return this;
	}

	public DeniedReasonCode getDeniedReason() {
		return deniedReason;
	}

	public SecuritiesTradeStatusReason setDeniedReason(DeniedReasonCode deniedReason) {
		this.deniedReason = Objects.requireNonNull(deniedReason);
		return this;
	}

	public Optional<SecuritiesTradeStatus> getSecuritiesTradeStatus() {
		return securitiesTradeStatus == null ? Optional.empty() : Optional.of(securitiesTradeStatus);
	}

	public SecuritiesTradeStatusReason setSecuritiesTradeStatus(com.tools20022.repository.entity.SecuritiesTradeStatus securitiesTradeStatus) {
		this.securitiesTradeStatus = securitiesTradeStatus;
		return this;
	}

	public GeneratedReasonCode getGeneratedReason() {
		return generatedReason;
	}

	public SecuritiesTradeStatusReason setGeneratedReason(GeneratedReasonCode generatedReason) {
		this.generatedReason = Objects.requireNonNull(generatedReason);
		return this;
	}

	public AllegementReasonCode getAllegementReason() {
		return allegementReason;
	}

	public SecuritiesTradeStatusReason setAllegementReason(AllegementReasonCode allegementReason) {
		this.allegementReason = Objects.requireNonNull(allegementReason);
		return this;
	}

	public PendingSettlementStatusReasonCode getPendingSettlementReason() {
		return pendingSettlementReason;
	}

	public SecuritiesTradeStatusReason setPendingSettlementReason(PendingSettlementStatusReasonCode pendingSettlementReason) {
		this.pendingSettlementReason = Objects.requireNonNull(pendingSettlementReason);
		return this;
	}

	public RepoCallAcknowledgementReasonCode getRepoCallAcknowledgementReason() {
		return repoCallAcknowledgementReason;
	}

	public SecuritiesTradeStatusReason setRepoCallAcknowledgementReason(RepoCallAcknowledgementReasonCode repoCallAcknowledgementReason) {
		this.repoCallAcknowledgementReason = Objects.requireNonNull(repoCallAcknowledgementReason);
		return this;
	}

	public RepairReasonV2Code getRepairReason() {
		return repairReason;
	}

	public SecuritiesTradeStatusReason setRepairReason(RepairReasonV2Code repairReason) {
		this.repairReason = Objects.requireNonNull(repairReason);
		return this;
	}

	public DeliveryReturnCode getDeliveryReturnReason() {
		return deliveryReturnReason;
	}

	public SecuritiesTradeStatusReason setDeliveryReturnReason(DeliveryReturnCode deliveryReturnReason) {
		this.deliveryReturnReason = Objects.requireNonNull(deliveryReturnReason);
		return this;
	}

	public CounterpartyResponseStatusReasonCode getCounterpartyStatusReason() {
		return counterpartyStatusReason;
	}

	public SecuritiesTradeStatusReason setCounterpartyStatusReason(CounterpartyResponseStatusReasonCode counterpartyStatusReason) {
		this.counterpartyStatusReason = Objects.requireNonNull(counterpartyStatusReason);
		return this;
	}

	public ModifiedStatusReasonCode getModifiedStatusReason() {
		return modifiedStatusReason;
	}

	public SecuritiesTradeStatusReason setModifiedStatusReason(ModifiedStatusReasonCode modifiedStatusReason) {
		this.modifiedStatusReason = Objects.requireNonNull(modifiedStatusReason);
		return this;
	}
}