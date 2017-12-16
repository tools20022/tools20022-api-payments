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
import com.tools20022.repository.codeset.DemandStatusCode;
import com.tools20022.repository.codeset.SettlementAdviceTypeCode;
import com.tools20022.repository.codeset.TerminationReasonCode;
import com.tools20022.repository.entity.StatusReason;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.StatusReason
 * StatusReason}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UndertakingStatusReason#mmDiscrepancy
 * UndertakingStatusReason.mmDiscrepancy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UndertakingStatusReason#mmUndertakingStatus
 * UndertakingStatusReason.mmUndertakingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UndertakingStatusReason#mmTerminationReason
 * UndertakingStatusReason.mmTerminationReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UndertakingStatusReason#mmDemandRefusalStatusReason
 * UndertakingStatusReason.mmDemandRefusalStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UndertakingStatusReason#mmSettlementReason
 * UndertakingStatusReason.mmSettlementReason}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UndertakingStatus#mmUndertakingStatusReason
 * UndertakingStatus.mmUndertakingStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Discrepancy#mmUndertakingStatusReason
 * Discrepancy.mmUndertakingStatusReason}</li>
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
 * "UndertakingStatusReason"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason for the status or for the action (for instance settlement reason)."
 * </li>
 * </ul>
 */
public class UndertakingStatusReason extends StatusReason {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Discrepancy discrepancy;
	/**
	 * Demand is refused because of a discrepancy in the demand.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Discrepancy#mmUndertakingStatusReason
	 * Discrepancy.mmUndertakingStatusReason}</li>
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
	public static final MMBusinessAssociationEnd mmDiscrepancy = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.UndertakingStatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Discrepancy";
			definition = "Demand is refused because of a discrepancy in the demand.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Discrepancy.mmUndertakingStatusReason;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Discrepancy.mmObject();
		}
	};
	protected UndertakingStatus undertakingStatus;
	/**
	 * Status for which a reason is provided. It is derived from the association
	 * between StatusReason and Status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingStatus#mmUndertakingStatusReason
	 * UndertakingStatus.mmUndertakingStatusReason}</li>
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
	public static final MMBusinessAssociationEnd mmUndertakingStatus = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.UndertakingStatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UndertakingStatus";
			definition = "Status for which a reason is provided. It is derived from the association between StatusReason and Status.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.UndertakingStatus.mmUndertakingStatusReason;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.UndertakingStatus.mmObject();
		}
	};
	protected TerminationReasonCode terminationReason;
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
	public static final MMBusinessAttribute mmTerminationReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.UndertakingStatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TerminationReason";
			definition = "Reason for the termination.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TerminationReasonCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return UndertakingStatusReason.class.getMethod("getTerminationReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DemandStatusCode demandRefusalStatusReason;
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
	public static final MMBusinessAttribute mmDemandRefusalStatusReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.UndertakingStatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DemandRefusalStatusReason";
			definition = "Processing status reported by the issuer for the refusal of a demand.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DemandStatusCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return UndertakingStatusReason.class.getMethod("getDemandRefusalStatusReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SettlementAdviceTypeCode settlementReason;
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
	public static final MMBusinessAttribute mmSettlementReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.UndertakingStatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementReason";
			definition = "Specifies the reason for the settlement of an amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SettlementAdviceTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return UndertakingStatusReason.class.getMethod("getSettlementReason", new Class[]{});
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
				name = "UndertakingStatusReason";
				definition = "Specifies the reason for the status or for the action (for instance settlement reason).";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.UndertakingStatus.mmUndertakingStatusReason, com.tools20022.repository.entity.Discrepancy.mmUndertakingStatusReason);
				superType_lazy = () -> StatusReason.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.UndertakingStatusReason.mmDiscrepancy, com.tools20022.repository.entity.UndertakingStatusReason.mmUndertakingStatus,
						com.tools20022.repository.entity.UndertakingStatusReason.mmTerminationReason, com.tools20022.repository.entity.UndertakingStatusReason.mmDemandRefusalStatusReason,
						com.tools20022.repository.entity.UndertakingStatusReason.mmSettlementReason);
			}

			@Override
			public Class<?> getInstanceClass() {
				return UndertakingStatusReason.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Discrepancy getDiscrepancy() {
		return discrepancy;
	}

	public void setDiscrepancy(com.tools20022.repository.entity.Discrepancy discrepancy) {
		this.discrepancy = discrepancy;
	}

	public UndertakingStatus getUndertakingStatus() {
		return undertakingStatus;
	}

	public void setUndertakingStatus(com.tools20022.repository.entity.UndertakingStatus undertakingStatus) {
		this.undertakingStatus = undertakingStatus;
	}

	public TerminationReasonCode getTerminationReason() {
		return terminationReason;
	}

	public void setTerminationReason(TerminationReasonCode terminationReason) {
		this.terminationReason = terminationReason;
	}

	public DemandStatusCode getDemandRefusalStatusReason() {
		return demandRefusalStatusReason;
	}

	public void setDemandRefusalStatusReason(DemandStatusCode demandRefusalStatusReason) {
		this.demandRefusalStatusReason = demandRefusalStatusReason;
	}

	public SettlementAdviceTypeCode getSettlementReason() {
		return settlementReason;
	}

	public void setSettlementReason(SettlementAdviceTypeCode settlementReason) {
		this.settlementReason = settlementReason;
	}
}