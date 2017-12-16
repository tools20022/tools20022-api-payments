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
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Status Status}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmMatchingStatus
 * SecuritiesTradeStatus.mmMatchingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmAffirmationStatus
 * SecuritiesTradeStatus.mmAffirmationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmReason
 * SecuritiesTradeStatus.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmSecuritiesTrade
 * SecuritiesTradeStatus.mmSecuritiesTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmTransactionStatus
 * SecuritiesTradeStatus.mmTransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmReplacementProcessingStatus
 * SecuritiesTradeStatus.mmReplacementProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmCancellationStatus
 * SecuritiesTradeStatus.mmCancellationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmCancellationRight
 * SecuritiesTradeStatus.mmCancellationRight}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmTransferStatus
 * SecuritiesTradeStatus.mmTransferStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmAllegedStatus
 * SecuritiesTradeStatus.mmAllegedStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmCollateralAllocationStatus
 * SecuritiesTradeStatus.mmCollateralAllocationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmRepoCallRequestStatus
 * SecuritiesTradeStatus.mmRepoCallRequestStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmSettlementConditionModificationStatus
 * SecuritiesTradeStatus.mmSettlementConditionModificationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmMatchingProcess
 * SecuritiesTradeStatus.mmMatchingProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmRelatedSecuritiesTransfer
 * SecuritiesTradeStatus.mmRelatedSecuritiesTransfer}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecuritiesTradeStatus
 * SecuritiesTrade.mmSecuritiesTradeStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmStatus
 * SecuritiesTransfer.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmSecuritiesTradeStatus
 * SecuritiesTradeStatusReason.mmSecuritiesTradeStatus}</li>
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
 * "SecuritiesTradeStatus"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Status of a securities trade."</li>
 * </ul>
 */
public class SecuritiesTradeStatus extends Status {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected MatchingStatusCode matchingStatus;
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
	public static final MMBusinessAttribute mmMatchingStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MatchingStatus";
			definition = "Status of matching of a trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MatchingStatusCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeStatus.class.getMethod("getMatchingStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected AffirmationStatusCode affirmationStatus;
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
	public static final MMBusinessAttribute mmAffirmationStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AffirmationStatus";
			definition = "Status of affirmation of a trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AffirmationStatusCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeStatus.class.getMethod("getAffirmationStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesTradeStatusReason> reason;
	/**
	 * Specifies the reasons for the status. It is derived from the relationship
	 * between Status and Status Reason.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmSecuritiesTradeStatus
	 * SecuritiesTradeStatusReason.mmSecuritiesTradeStatus}</li>
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
	public static final MMBusinessAssociationEnd mmReason = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Reason";
			definition = "Specifies the reasons for the status. It is derived from the relationship between Status and Status Reason.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatusReason.mmSecuritiesTradeStatus;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatusReason.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesTrade> securitiesTrade;
	/**
	 * Specifies the trade which has a specific status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecuritiesTradeStatus
	 * SecuritiesTrade.mmSecuritiesTradeStatus}</li>
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
	public static final MMBusinessAssociationEnd mmSecuritiesTrade = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTrade";
			definition = "Specifies the trade which has a specific status.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmSecuritiesTradeStatus;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
		}
	};
	protected TransactionStatusCode transactionStatus;
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
	public static final MMBusinessAttribute mmTransactionStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransactionStatus";
			definition = "Status of an investment fund transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TransactionStatusCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeStatus.class.getMethod("getTransactionStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ReplacementProcessingStatusCode replacementProcessingStatus;
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
	public static final MMBusinessAttribute mmReplacementProcessingStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReplacementProcessingStatus";
			definition = "Provides the processing status of the replacement request.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ReplacementProcessingStatusCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeStatus.class.getMethod("getReplacementProcessingStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CancellationStatusCode cancellationStatus;
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
	public static final MMBusinessAttribute mmCancellationStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancellationStatus";
			definition = "Status of the cancellation of a trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CancellationStatusCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeStatus.class.getMethod("getCancellationStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CancellationRightCode cancellationRight;
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
	public static final MMBusinessAttribute mmCancellationRight = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancellationRight";
			definition = "Cancellation right of an investor with respect to an order.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CancellationRightCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeStatus.class.getMethod("getCancellationRight", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TransferStatusCode transferStatus;
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
	public static final MMBusinessAttribute mmTransferStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransferStatus";
			definition = "Status of the transfer is accepted, sent to next party, matched, already executed, or settled.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TransferStatusCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeStatus.class.getMethod("getTransferStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected AllegementStatusCode allegedStatus;
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
	public static final MMBusinessAttribute mmAllegedStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AllegedStatus";
			definition = "Provides the status of an allegement.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AllegementStatusCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeStatus.class.getMethod("getAllegedStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected AllocationStatusCode collateralAllocationStatus;
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
	public static final MMBusinessAttribute mmCollateralAllocationStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CollateralAllocationStatus";
			definition = "Provides the status of allocation of collateral to cover the instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AllocationStatusCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeStatus.class.getMethod("getCollateralAllocationStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected RepoCallRequestStatusCode repoCallRequestStatus;
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
	public static final MMBusinessAttribute mmRepoCallRequestStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RepoCallRequestStatus";
			definition = "Specifies additional information about the status of the repurchase agreement call processed instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RepoCallRequestStatusCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeStatus.class.getMethod("getRepoCallRequestStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SettlementConditionModificationStatusStatusCode settlementConditionModificationStatus;
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
	public static final MMBusinessAttribute mmSettlementConditionModificationStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementConditionModificationStatus";
			definition = "Provides the status of the securities settlement condition modification request.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SettlementConditionModificationStatusStatusCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeStatus.class.getMethod("getSettlementConditionModificationStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected MatchingProcessCode matchingProcess;
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
	public static final MMBusinessAttribute mmMatchingProcess = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MatchingProcess";
			definition = "Specifies the matching status of a trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MatchingProcessCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeStatus.class.getMethod("getMatchingProcess", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesTransfer relatedSecuritiesTransfer;
	/**
	 * Transfer operation for which a status is provided
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmStatus
	 * SecuritiesTransfer.mmStatus}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedSecuritiesTransfer = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedSecuritiesTransfer";
			definition = "Transfer operation for which a status is provided";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.mmStatus;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesTradeStatus";
				definition = "Status of a securities trade.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesTrade.mmSecuritiesTradeStatus, com.tools20022.repository.entity.SecuritiesTransfer.mmStatus,
						com.tools20022.repository.entity.SecuritiesTradeStatusReason.mmSecuritiesTradeStatus);
				superType_lazy = () -> Status.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesTradeStatus.mmMatchingStatus, com.tools20022.repository.entity.SecuritiesTradeStatus.mmAffirmationStatus,
						com.tools20022.repository.entity.SecuritiesTradeStatus.mmReason, com.tools20022.repository.entity.SecuritiesTradeStatus.mmSecuritiesTrade, com.tools20022.repository.entity.SecuritiesTradeStatus.mmTransactionStatus,
						com.tools20022.repository.entity.SecuritiesTradeStatus.mmReplacementProcessingStatus, com.tools20022.repository.entity.SecuritiesTradeStatus.mmCancellationStatus,
						com.tools20022.repository.entity.SecuritiesTradeStatus.mmCancellationRight, com.tools20022.repository.entity.SecuritiesTradeStatus.mmTransferStatus,
						com.tools20022.repository.entity.SecuritiesTradeStatus.mmAllegedStatus, com.tools20022.repository.entity.SecuritiesTradeStatus.mmCollateralAllocationStatus,
						com.tools20022.repository.entity.SecuritiesTradeStatus.mmRepoCallRequestStatus, com.tools20022.repository.entity.SecuritiesTradeStatus.mmSettlementConditionModificationStatus,
						com.tools20022.repository.entity.SecuritiesTradeStatus.mmMatchingProcess, com.tools20022.repository.entity.SecuritiesTradeStatus.mmRelatedSecuritiesTransfer);
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesTradeStatus.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MatchingStatusCode getMatchingStatus() {
		return matchingStatus;
	}

	public void setMatchingStatus(MatchingStatusCode matchingStatus) {
		this.matchingStatus = matchingStatus;
	}

	public AffirmationStatusCode getAffirmationStatus() {
		return affirmationStatus;
	}

	public void setAffirmationStatus(AffirmationStatusCode affirmationStatus) {
		this.affirmationStatus = affirmationStatus;
	}

	public List<SecuritiesTradeStatusReason> getReason() {
		return reason;
	}

	public void setReason(List<com.tools20022.repository.entity.SecuritiesTradeStatusReason> reason) {
		this.reason = reason;
	}

	public List<SecuritiesTrade> getSecuritiesTrade() {
		return securitiesTrade;
	}

	public void setSecuritiesTrade(List<com.tools20022.repository.entity.SecuritiesTrade> securitiesTrade) {
		this.securitiesTrade = securitiesTrade;
	}

	public TransactionStatusCode getTransactionStatus() {
		return transactionStatus;
	}

	public void setTransactionStatus(TransactionStatusCode transactionStatus) {
		this.transactionStatus = transactionStatus;
	}

	public ReplacementProcessingStatusCode getReplacementProcessingStatus() {
		return replacementProcessingStatus;
	}

	public void setReplacementProcessingStatus(ReplacementProcessingStatusCode replacementProcessingStatus) {
		this.replacementProcessingStatus = replacementProcessingStatus;
	}

	public CancellationStatusCode getCancellationStatus() {
		return cancellationStatus;
	}

	public void setCancellationStatus(CancellationStatusCode cancellationStatus) {
		this.cancellationStatus = cancellationStatus;
	}

	public CancellationRightCode getCancellationRight() {
		return cancellationRight;
	}

	public void setCancellationRight(CancellationRightCode cancellationRight) {
		this.cancellationRight = cancellationRight;
	}

	public TransferStatusCode getTransferStatus() {
		return transferStatus;
	}

	public void setTransferStatus(TransferStatusCode transferStatus) {
		this.transferStatus = transferStatus;
	}

	public AllegementStatusCode getAllegedStatus() {
		return allegedStatus;
	}

	public void setAllegedStatus(AllegementStatusCode allegedStatus) {
		this.allegedStatus = allegedStatus;
	}

	public AllocationStatusCode getCollateralAllocationStatus() {
		return collateralAllocationStatus;
	}

	public void setCollateralAllocationStatus(AllocationStatusCode collateralAllocationStatus) {
		this.collateralAllocationStatus = collateralAllocationStatus;
	}

	public RepoCallRequestStatusCode getRepoCallRequestStatus() {
		return repoCallRequestStatus;
	}

	public void setRepoCallRequestStatus(RepoCallRequestStatusCode repoCallRequestStatus) {
		this.repoCallRequestStatus = repoCallRequestStatus;
	}

	public SettlementConditionModificationStatusStatusCode getSettlementConditionModificationStatus() {
		return settlementConditionModificationStatus;
	}

	public void setSettlementConditionModificationStatus(SettlementConditionModificationStatusStatusCode settlementConditionModificationStatus) {
		this.settlementConditionModificationStatus = settlementConditionModificationStatus;
	}

	public MatchingProcessCode getMatchingProcess() {
		return matchingProcess;
	}

	public void setMatchingProcess(MatchingProcessCode matchingProcess) {
		this.matchingProcess = matchingProcess;
	}

	public SecuritiesTransfer getRelatedSecuritiesTransfer() {
		return relatedSecuritiesTransfer;
	}

	public void setRelatedSecuritiesTransfer(com.tools20022.repository.entity.SecuritiesTransfer relatedSecuritiesTransfer) {
		this.relatedSecuritiesTransfer = relatedSecuritiesTransfer;
	}
}