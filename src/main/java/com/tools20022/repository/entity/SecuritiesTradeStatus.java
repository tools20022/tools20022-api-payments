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
import com.tools20022.repository.entity.Status;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Status of a securities trade.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesTradeStatus"
 * src="doc-files/SecuritiesTradeStatus.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#MatchingStatus
 * SecuritiesTradeStatus.MatchingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#AffirmationStatus
 * SecuritiesTradeStatus.AffirmationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#Reason
 * SecuritiesTradeStatus.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#SecuritiesTrade
 * SecuritiesTradeStatus.SecuritiesTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#TransactionStatus
 * SecuritiesTradeStatus.TransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#ReplacementProcessingStatus
 * SecuritiesTradeStatus.ReplacementProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#CancellationStatus
 * SecuritiesTradeStatus.CancellationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#CancellationRight
 * SecuritiesTradeStatus.CancellationRight}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#TransferStatus
 * SecuritiesTradeStatus.TransferStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#AllegedStatus
 * SecuritiesTradeStatus.AllegedStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#CollateralAllocationStatus
 * SecuritiesTradeStatus.CollateralAllocationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#RepoCallRequestStatus
 * SecuritiesTradeStatus.RepoCallRequestStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#SettlementConditionModificationStatus
 * SecuritiesTradeStatus.SettlementConditionModificationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#MatchingProcess
 * SecuritiesTradeStatus.MatchingProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#RelatedSecuritiesTransfer
 * SecuritiesTradeStatus.RelatedSecuritiesTransfer}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#SecuritiesTradeStatus
 * SecuritiesTrade.SecuritiesTradeStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTransfer#Status
 * SecuritiesTransfer.Status}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#SecuritiesTradeStatus
 * SecuritiesTradeStatusReason.SecuritiesTradeStatus}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Status Status}</li>
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
 * "SecuritiesTradeStatus"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Status of a securities trade."</li>
 * </ul>
 */
public class SecuritiesTradeStatus extends Status {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Status of matching of a trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MatchingStatusCode
	 * MatchingStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of matching of a trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MatchingStatus = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesTradeStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MatchingStatus";
			definition = "Status of matching of a trade.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> MatchingStatusCode.mmObject();
		}
	};
	/**
	 * Status of affirmation of a trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AffirmationStatusCode
	 * AffirmationStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AffirmationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of affirmation of a trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AffirmationStatus = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesTradeStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AffirmationStatus";
			definition = "Status of affirmation of a trade.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> AffirmationStatusCode.mmObject();
		}
	};
	/**
	 * Specifies the reasons for the status. It is derived from the relationship
	 * between Status and Status Reason.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#SecuritiesTradeStatus
	 * SecuritiesTradeStatusReason.SecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
	 * SecuritiesTradeStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reasons for the status. It is derived from the relationship between Status and Status Reason."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Reason = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesTradeStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Reason";
			definition = "Specifies the reasons for the status. It is derived from the relationship between Status and Status Reason.";
			minOccurs = 0;
			type_lazy = () -> SecuritiesTradeStatusReason.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatusReason.SecuritiesTradeStatus;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the trade which has a specific status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#SecuritiesTradeStatus
	 * SecuritiesTrade.SecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the trade which has a specific status."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesTrade = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesTradeStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTrade";
			definition = "Specifies the trade which has a specific status.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.SecuritiesTradeStatus;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Status of an investment fund transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionStatusCode
	 * TransactionStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of an investment fund transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TransactionStatus = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesTradeStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransactionStatus";
			definition = "Status of an investment fund transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TransactionStatusCode.mmObject();
		}
	};
	/**
	 * Provides the processing status of the replacement request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ReplacementProcessingStatusCode
	 * ReplacementProcessingStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReplacementProcessingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the processing status of the replacement request."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ReplacementProcessingStatus = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesTradeStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReplacementProcessingStatus";
			definition = "Provides the processing status of the replacement request.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ReplacementProcessingStatusCode.mmObject();
		}
	};
	/**
	 * Status of the cancellation of a trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationStatusCode
	 * CancellationStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the cancellation of a trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CancellationStatus = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesTradeStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CancellationStatus";
			definition = "Status of the cancellation of a trade.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CancellationStatusCode.mmObject();
		}
	};
	/**
	 * Cancellation right of an investor with respect to an order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationRightCode
	 * CancellationRightCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationRight"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cancellation right of an investor with respect to an order."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CancellationRight = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesTradeStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CancellationRight";
			definition = "Cancellation right of an investor with respect to an order.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CancellationRightCode.mmObject();
		}
	};
	/**
	 * Status of the transfer is accepted, sent to next party, matched, already
	 * executed, or settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TransferStatusCode
	 * TransferStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status of the transfer is accepted, sent to next party, matched, already executed, or settled."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TransferStatus = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesTradeStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransferStatus";
			definition = "Status of the transfer is accepted, sent to next party, matched, already executed, or settled.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TransferStatusCode.mmObject();
		}
	};
	/**
	 * Provides the status of an allegement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AllegementStatusCode
	 * AllegementStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllegedStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the status of an allegement."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AllegedStatus = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesTradeStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AllegedStatus";
			definition = "Provides the status of an allegement.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> AllegementStatusCode.mmObject();
		}
	};
	/**
	 * Provides the status of allocation of collateral to cover the instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AllocationStatusCode
	 * AllocationStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralAllocationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the status of allocation of collateral to cover the instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CollateralAllocationStatus = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesTradeStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CollateralAllocationStatus";
			definition = "Provides the status of allocation of collateral to cover the instruction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> AllocationStatusCode.mmObject();
		}
	};
	/**
	 * Specifies additional information about the status of the repurchase
	 * agreement call processed instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RepoCallRequestStatusCode
	 * RepoCallRequestStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepoCallRequestStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies additional information about the status of the repurchase agreement call processed instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RepoCallRequestStatus = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesTradeStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RepoCallRequestStatus";
			definition = "Specifies additional information about the status of the repurchase agreement call processed instruction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> RepoCallRequestStatusCode.mmObject();
		}
	};
	/**
	 * Provides the status of the securities settlement condition modification
	 * request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementConditionModificationStatusStatusCode
	 * SettlementConditionModificationStatusStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementConditionModificationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the status of the securities settlement condition modification request."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SettlementConditionModificationStatus = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesTradeStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementConditionModificationStatus";
			definition = "Provides the status of the securities settlement condition modification request.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> SettlementConditionModificationStatusStatusCode.mmObject();
		}
	};
	/**
	 * Specifies the matching status of a trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MatchingProcessCode
	 * MatchingProcessCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchingProcess"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the matching status of a trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MatchingProcess = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesTradeStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MatchingProcess";
			definition = "Specifies the matching status of a trade.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> MatchingProcessCode.mmObject();
		}
	};
	/**
	 * Transfer operation for which a status is provided
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#Status
	 * SecuritiesTransfer.Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedSecuritiesTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transfer operation for which a status is provided"</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedSecuritiesTransfer = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesTradeStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedSecuritiesTransfer";
			definition = "Transfer operation for which a status is provided";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesTransfer.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.Status;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesTradeStatus";
				definition = "Status of a securities trade.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesTrade.SecuritiesTradeStatus, com.tools20022.repository.entity.SecuritiesTransfer.Status,
						com.tools20022.repository.entity.SecuritiesTradeStatusReason.SecuritiesTradeStatus);
				superType_lazy = () -> Status.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesTradeStatus.MatchingStatus, com.tools20022.repository.entity.SecuritiesTradeStatus.AffirmationStatus,
						com.tools20022.repository.entity.SecuritiesTradeStatus.Reason, com.tools20022.repository.entity.SecuritiesTradeStatus.SecuritiesTrade, com.tools20022.repository.entity.SecuritiesTradeStatus.TransactionStatus,
						com.tools20022.repository.entity.SecuritiesTradeStatus.ReplacementProcessingStatus, com.tools20022.repository.entity.SecuritiesTradeStatus.CancellationStatus,
						com.tools20022.repository.entity.SecuritiesTradeStatus.CancellationRight, com.tools20022.repository.entity.SecuritiesTradeStatus.TransferStatus, com.tools20022.repository.entity.SecuritiesTradeStatus.AllegedStatus,
						com.tools20022.repository.entity.SecuritiesTradeStatus.CollateralAllocationStatus, com.tools20022.repository.entity.SecuritiesTradeStatus.RepoCallRequestStatus,
						com.tools20022.repository.entity.SecuritiesTradeStatus.SettlementConditionModificationStatus, com.tools20022.repository.entity.SecuritiesTradeStatus.MatchingProcess,
						com.tools20022.repository.entity.SecuritiesTradeStatus.RelatedSecuritiesTransfer);
			}
		});
		return mmObject_lazy.get();
	}
}