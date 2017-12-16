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

/**
 * Status of a securities order or of the processing of a securities order.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesOrderStatus"
 * src="doc-files/SecuritiesOrderStatus.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Status Status}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmConfirmationRejectedStatusReason
 * SecuritiesOrderStatus.mmConfirmationRejectedStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmConfirmationStatus
 * SecuritiesOrderStatus.mmConfirmationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmCancellationStatus
 * SecuritiesOrderStatus.mmCancellationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmPartiallySettledStatusReason
 * SecuritiesOrderStatus.mmPartiallySettledStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmSuspendedStatusReason
 * SecuritiesOrderStatus.mmSuspendedStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmListOrderStatus
 * SecuritiesOrderStatus.mmListOrderStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmSecuritiesOrder
 * SecuritiesOrderStatus.mmSecuritiesOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmInvestmentFundOrder
 * SecuritiesOrderStatus.mmInvestmentFundOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmCumulativeQuantity
 * SecuritiesOrderStatus.mmCumulativeQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmRemainingQuantity
 * SecuritiesOrderStatus.mmRemainingQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmConditionallyAcceptedStatus
 * SecuritiesOrderStatus.mmConditionallyAcceptedStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmOrderStatus
 * SecuritiesOrderStatus.mmOrderStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmOrderStatus
 * InvestmentFundOrder.mmOrderStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRelatedOrderStatus
 * SecuritiesQuantity.mmRelatedOrderStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmSecuritiesOrderStatus
 * SecuritiesQuantity.mmSecuritiesOrderStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmStatus
 * SecuritiesOrder.mmStatus}</li>
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
 * "SecuritiesOrderStatus"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Status of a securities order or of the processing of a securities order."</li>
 * </ul>
 */
public class SecuritiesOrderStatus extends Status {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected RejectedConfirmationStatusReasonCode confirmationRejectedStatusReason;
	/**
	 * Specifies the reason for a confirmation rejected status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode
	 * RejectedConfirmationStatusReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus
	 * SecuritiesOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmationRejectedStatusReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the reason for a confirmation rejected status."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmConfirmationRejectedStatusReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConfirmationRejectedStatusReason";
			definition = "Specifies the reason for a confirmation rejected status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RejectedConfirmationStatusReasonCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrderStatus.class.getMethod("getConfirmationRejectedStatusReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected OrderConfirmationStatusCode confirmationStatus;
	/**
	 * Status of the confirmation of a status order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OrderConfirmationStatusCode
	 * OrderConfirmationStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus
	 * SecuritiesOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the confirmation of a status order."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmConfirmationStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConfirmationStatus";
			definition = "Status of the confirmation of a status order.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OrderConfirmationStatusCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrderStatus.class.getMethod("getConfirmationStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected OrderCancellationStatusCode cancellationStatus;
	/**
	 * Status of the cancellation of a securities order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OrderCancellationStatusCode
	 * OrderCancellationStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus
	 * SecuritiesOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the cancellation of a securities order."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCancellationStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancellationStatus";
			definition = "Status of the cancellation of a securities order.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OrderCancellationStatusCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrderStatus.class.getMethod("getCancellationStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PartiallySettledStatusReasonCode partiallySettledStatusReason;
	/**
	 * Reason for the partially settled status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PartiallySettledStatusReasonCode
	 * PartiallySettledStatusReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus
	 * SecuritiesOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartiallySettledStatusReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for the partially settled status."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPartiallySettledStatusReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartiallySettledStatusReason";
			definition = "Reason for the partially settled status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PartiallySettledStatusReasonCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrderStatus.class.getMethod("getPartiallySettledStatusReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SuspendedStatusReasonCode suspendedStatusReason;
	/**
	 * Reason for the suspended status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SuspendedStatusReasonCode
	 * SuspendedStatusReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus
	 * SecuritiesOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SuspendedStatusReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for the suspended status."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSuspendedStatusReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SuspendedStatusReason";
			definition = "Reason for the suspended status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SuspendedStatusReasonCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrderStatus.class.getMethod("getSuspendedStatusReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ListStatusTypeCode listOrderStatus;
	/**
	 * Specifies the status of a list order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ListStatusTypeCode
	 * ListStatusTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus
	 * SecuritiesOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ListOrderStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the status of a list order."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmListOrderStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ListOrderStatus";
			definition = "Specifies the status of a list order.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ListStatusTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrderStatus.class.getMethod("getListOrderStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesOrder securitiesOrder;
	/**
	 * Order for which a status is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmStatus
	 * SecuritiesOrder.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus
	 * SecuritiesOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order for which a status is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesOrder";
			definition = "Order for which a status is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmStatus;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
		}
	};
	protected InvestmentFundOrder investmentFundOrder;
	/**
	 * Investment fund order for which a status is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmOrderStatus
	 * InvestmentFundOrder.mmOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus
	 * SecuritiesOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentFundOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Investment fund order for which a status is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmInvestmentFundOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundOrder";
			definition = "Investment fund order for which a status is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmOrderStatus;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
		}
	};
	protected SecuritiesQuantity cumulativeQuantity;
	/**
	 * Total quantity (for instance number of shares) filled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmSecuritiesOrderStatus
	 * SecuritiesQuantity.mmSecuritiesOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus
	 * SecuritiesOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CumulativeQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total quantity (for instance number of shares) filled."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCumulativeQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CumulativeQuantity";
			definition = "Total quantity (for instance number of shares) filled.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmSecuritiesOrderStatus;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected SecuritiesQuantity remainingQuantity;
	/**
	 * Quantity opened for further execution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRelatedOrderStatus
	 * SecuritiesQuantity.mmRelatedOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus
	 * SecuritiesOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemainingQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity opened for further execution."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRemainingQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RemainingQuantity";
			definition = "Quantity opened for further execution.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmRelatedOrderStatus;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected ConditionallyAcceptedStatusReasonCode conditionallyAcceptedStatus;
	/**
	 * Reason for the conditionally accepted status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode
	 * ConditionallyAcceptedStatusReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus
	 * SecuritiesOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionallyAcceptedStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for the conditionally accepted status."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmConditionallyAcceptedStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConditionallyAcceptedStatus";
			definition = "Reason for the conditionally accepted status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ConditionallyAcceptedStatusReasonCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrderStatus.class.getMethod("getConditionallyAcceptedStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected OrderStatusCode orderStatus;
	/**
	 * Indicates the status of an order at a specific point in time.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatusCode
	 * OrderStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus
	 * SecuritiesOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the status of an order at a specific point in time."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmOrderStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OrderStatus";
			definition = "Indicates the status of an order at a specific point in time.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OrderStatusCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrderStatus.class.getMethod("getOrderStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesOrderStatus";
				definition = "Status of a securities order or of the processing of a securities order.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFundOrder.mmOrderStatus, com.tools20022.repository.entity.SecuritiesQuantity.mmRelatedOrderStatus,
						com.tools20022.repository.entity.SecuritiesQuantity.mmSecuritiesOrderStatus, com.tools20022.repository.entity.SecuritiesOrder.mmStatus);
				superType_lazy = () -> Status.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesOrderStatus.mmConfirmationRejectedStatusReason, com.tools20022.repository.entity.SecuritiesOrderStatus.mmConfirmationStatus,
						com.tools20022.repository.entity.SecuritiesOrderStatus.mmCancellationStatus, com.tools20022.repository.entity.SecuritiesOrderStatus.mmPartiallySettledStatusReason,
						com.tools20022.repository.entity.SecuritiesOrderStatus.mmSuspendedStatusReason, com.tools20022.repository.entity.SecuritiesOrderStatus.mmListOrderStatus,
						com.tools20022.repository.entity.SecuritiesOrderStatus.mmSecuritiesOrder, com.tools20022.repository.entity.SecuritiesOrderStatus.mmInvestmentFundOrder,
						com.tools20022.repository.entity.SecuritiesOrderStatus.mmCumulativeQuantity, com.tools20022.repository.entity.SecuritiesOrderStatus.mmRemainingQuantity,
						com.tools20022.repository.entity.SecuritiesOrderStatus.mmConditionallyAcceptedStatus, com.tools20022.repository.entity.SecuritiesOrderStatus.mmOrderStatus);
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesOrderStatus.class;
			}
		});
		return mmObject_lazy.get();
	}

	public RejectedConfirmationStatusReasonCode getConfirmationRejectedStatusReason() {
		return confirmationRejectedStatusReason;
	}

	public void setConfirmationRejectedStatusReason(RejectedConfirmationStatusReasonCode confirmationRejectedStatusReason) {
		this.confirmationRejectedStatusReason = confirmationRejectedStatusReason;
	}

	public OrderConfirmationStatusCode getConfirmationStatus() {
		return confirmationStatus;
	}

	public void setConfirmationStatus(OrderConfirmationStatusCode confirmationStatus) {
		this.confirmationStatus = confirmationStatus;
	}

	public OrderCancellationStatusCode getCancellationStatus() {
		return cancellationStatus;
	}

	public void setCancellationStatus(OrderCancellationStatusCode cancellationStatus) {
		this.cancellationStatus = cancellationStatus;
	}

	public PartiallySettledStatusReasonCode getPartiallySettledStatusReason() {
		return partiallySettledStatusReason;
	}

	public void setPartiallySettledStatusReason(PartiallySettledStatusReasonCode partiallySettledStatusReason) {
		this.partiallySettledStatusReason = partiallySettledStatusReason;
	}

	public SuspendedStatusReasonCode getSuspendedStatusReason() {
		return suspendedStatusReason;
	}

	public void setSuspendedStatusReason(SuspendedStatusReasonCode suspendedStatusReason) {
		this.suspendedStatusReason = suspendedStatusReason;
	}

	public ListStatusTypeCode getListOrderStatus() {
		return listOrderStatus;
	}

	public void setListOrderStatus(ListStatusTypeCode listOrderStatus) {
		this.listOrderStatus = listOrderStatus;
	}

	public SecuritiesOrder getSecuritiesOrder() {
		return securitiesOrder;
	}

	public void setSecuritiesOrder(com.tools20022.repository.entity.SecuritiesOrder securitiesOrder) {
		this.securitiesOrder = securitiesOrder;
	}

	public InvestmentFundOrder getInvestmentFundOrder() {
		return investmentFundOrder;
	}

	public void setInvestmentFundOrder(com.tools20022.repository.entity.InvestmentFundOrder investmentFundOrder) {
		this.investmentFundOrder = investmentFundOrder;
	}

	public SecuritiesQuantity getCumulativeQuantity() {
		return cumulativeQuantity;
	}

	public void setCumulativeQuantity(com.tools20022.repository.entity.SecuritiesQuantity cumulativeQuantity) {
		this.cumulativeQuantity = cumulativeQuantity;
	}

	public SecuritiesQuantity getRemainingQuantity() {
		return remainingQuantity;
	}

	public void setRemainingQuantity(com.tools20022.repository.entity.SecuritiesQuantity remainingQuantity) {
		this.remainingQuantity = remainingQuantity;
	}

	public ConditionallyAcceptedStatusReasonCode getConditionallyAcceptedStatus() {
		return conditionallyAcceptedStatus;
	}

	public void setConditionallyAcceptedStatus(ConditionallyAcceptedStatusReasonCode conditionallyAcceptedStatus) {
		this.conditionallyAcceptedStatus = conditionallyAcceptedStatus;
	}

	public OrderStatusCode getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatusCode orderStatus) {
		this.orderStatus = orderStatus;
	}
}