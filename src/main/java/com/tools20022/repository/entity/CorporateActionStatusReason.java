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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.StatusReason
 * StatusReason}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason#mmCorporateActionCancellationReason
 * CorporateActionStatusReason.mmCorporateActionCancellationReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason#mmCorporateActionStatus
 * CorporateActionStatusReason.mmCorporateActionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason#mmAcceptedReason
 * CorporateActionStatusReason.mmAcceptedReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason#mmReversalReason
 * CorporateActionStatusReason.mmReversalReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason#mmMovementFailureReason
 * CorporateActionStatusReason.mmMovementFailureReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason#mmMovementRejectionReason
 * CorporateActionStatusReason.mmMovementRejectionReason}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#mmCorporateActionStatusReason
 * CorporateActionStatus.mmCorporateActionStatusReason}</li>
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
 * "CorporateActionStatusReason"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the underlying reason for a status of a corporate action."</li>
 * </ul>
 */
public class CorporateActionStatusReason extends StatusReason {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CorporateActionCancellationReasonCode corporateActionCancellationReason;
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
	public static final MMBusinessAttribute mmCorporateActionCancellationReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionStatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionCancellationReason";
			definition = "Specifies reasons for cancellation of a corporate action event.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionCancellationReasonCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionStatusReason.class.getMethod("getCorporateActionCancellationReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CorporateActionStatus corporateActionStatus;
	/**
	 * Corporate actions status for which a reason is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#mmCorporateActionStatusReason
	 * CorporateActionStatus.mmCorporateActionStatusReason}</li>
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
	public static final MMBusinessAssociationEnd mmCorporateActionStatus = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionStatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionStatus";
			definition = "Corporate actions status for which a reason is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionStatus.mmCorporateActionStatusReason;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionStatus.mmObject();
		}
	};
	protected AcknowledgementReasonCode acceptedReason;
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
	public static final MMBusinessAttribute mmAcceptedReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionStatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AcceptedReason";
			definition = "Specifies additional information about the processed instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AcknowledgementReasonCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionStatusReason.class.getMethod("getAcceptedReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CorporateActionReversalReasonCode reversalReason;
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
	public static final MMBusinessAttribute mmReversalReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionStatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReversalReason";
			definition = "Reason for the reversal.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionReversalReasonCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionStatusReason.class.getMethod("getReversalReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected FailedSettlementReasonCode movementFailureReason;
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
	public static final MMBusinessAttribute mmMovementFailureReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionStatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MovementFailureReason";
			definition = "The reason for the failure.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FailedSettlementReasonCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionStatusReason.class.getMethod("getMovementFailureReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected RejectionReasonCode movementRejectionReason;
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
	public static final MMBusinessAttribute mmMovementRejectionReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionStatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MovementRejectionReason";
			definition = "Provides information about the rejection status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RejectionReasonCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionStatusReason.class.getMethod("getMovementRejectionReason", new Class[]{});
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
				name = "CorporateActionStatusReason";
				definition = "Specifies the underlying reason for a status of a corporate action.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionStatus.mmCorporateActionStatusReason);
				superType_lazy = () -> StatusReason.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionStatusReason.mmCorporateActionCancellationReason, com.tools20022.repository.entity.CorporateActionStatusReason.mmCorporateActionStatus,
						com.tools20022.repository.entity.CorporateActionStatusReason.mmAcceptedReason, com.tools20022.repository.entity.CorporateActionStatusReason.mmReversalReason,
						com.tools20022.repository.entity.CorporateActionStatusReason.mmMovementFailureReason, com.tools20022.repository.entity.CorporateActionStatusReason.mmMovementRejectionReason);
			}

			@Override
			public Class<?> getInstanceClass() {
				return CorporateActionStatusReason.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CorporateActionCancellationReasonCode getCorporateActionCancellationReason() {
		return corporateActionCancellationReason;
	}

	public void setCorporateActionCancellationReason(CorporateActionCancellationReasonCode corporateActionCancellationReason) {
		this.corporateActionCancellationReason = corporateActionCancellationReason;
	}

	public CorporateActionStatus getCorporateActionStatus() {
		return corporateActionStatus;
	}

	public void setCorporateActionStatus(com.tools20022.repository.entity.CorporateActionStatus corporateActionStatus) {
		this.corporateActionStatus = corporateActionStatus;
	}

	public AcknowledgementReasonCode getAcceptedReason() {
		return acceptedReason;
	}

	public void setAcceptedReason(AcknowledgementReasonCode acceptedReason) {
		this.acceptedReason = acceptedReason;
	}

	public CorporateActionReversalReasonCode getReversalReason() {
		return reversalReason;
	}

	public void setReversalReason(CorporateActionReversalReasonCode reversalReason) {
		this.reversalReason = reversalReason;
	}

	public FailedSettlementReasonCode getMovementFailureReason() {
		return movementFailureReason;
	}

	public void setMovementFailureReason(FailedSettlementReasonCode movementFailureReason) {
		this.movementFailureReason = movementFailureReason;
	}

	public RejectionReasonCode getMovementRejectionReason() {
		return movementRejectionReason;
	}

	public void setMovementRejectionReason(RejectionReasonCode movementRejectionReason) {
		this.movementRejectionReason = movementRejectionReason;
	}
}