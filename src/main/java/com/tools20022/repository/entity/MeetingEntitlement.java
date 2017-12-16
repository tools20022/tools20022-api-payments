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
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Notification of the entitlement that one party has in relation with a
 * specific meeting.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="MeetingEntitlement" src="doc-files/MeetingEntitlement.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingEntitlement#mmEntitlementFixingDate
 * MeetingEntitlement.mmEntitlementFixingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingEntitlement#mmEntitlementRatio
 * MeetingEntitlement.mmEntitlementRatio}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingEntitlement#mmEligiblePosition
 * MeetingEntitlement.mmEligiblePosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingEntitlement#mmRelatedServicing
 * MeetingEntitlement.mmRelatedServicing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingEntitlement#mmEntitlementCalculationDate
 * MeetingEntitlement.mmEntitlementCalculationDate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmRelatedMeetingEntitlement
 * SecuritiesBalance.mmRelatedMeetingEntitlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingServicing#mmMeetingEntitlement
 * MeetingServicing.mmMeetingEntitlement}</li>
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
 * "MeetingEntitlement"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Notification of the entitlement that one party has in relation with a specific meeting."
 * </li>
 * </ul>
 */
public class MeetingEntitlement {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ISODate entitlementFixingDate;
	/**
	 * Date at which the positions are struck to note which parties will receive
	 * the entitlement, e.g. record date, book close date...
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MeetingEntitlement
	 * MeetingEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntitlementFixingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date at which the positions are struck to note which parties will receive the entitlement, e.g. record date, book close date..."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmEntitlementFixingDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MeetingEntitlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EntitlementFixingDate";
			definition = "Date at which the positions are struck to note which parties will receive the entitlement, e.g. record date, book close date...";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MeetingEntitlement.class.getMethod("getEntitlementFixingDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Number entitlementRatio;
	/**
	 * Number of votes assigned to one security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MeetingEntitlement
	 * MeetingEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntitlementRatio"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of votes assigned to one security."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmEntitlementRatio = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MeetingEntitlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EntitlementRatio";
			definition = "Number of votes assigned to one security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MeetingEntitlement.class.getMethod("getEntitlementRatio", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesBalance> eligiblePosition;
	/**
	 * Amount of securities that are eligible for the vote.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmRelatedMeetingEntitlement
	 * SecuritiesBalance.mmRelatedMeetingEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MeetingEntitlement
	 * MeetingEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EligiblePosition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of securities that are eligible for the vote."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmEligiblePosition = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MeetingEntitlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EligiblePosition";
			definition = "Amount of securities that are eligible for the vote.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmRelatedMeetingEntitlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
		}
	};
	protected MeetingServicing relatedServicing;
	/**
	 * Services which include the entitlement calculation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MeetingServicing#mmMeetingEntitlement
	 * MeetingServicing.mmMeetingEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.MeetingServicing
	 * MeetingServicing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MeetingEntitlement
	 * MeetingEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedServicing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Services which include the entitlement calculation."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedServicing = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MeetingEntitlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedServicing";
			definition = "Services which include the entitlement calculation.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.MeetingServicing.mmMeetingEntitlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.MeetingServicing.mmObject();
		}
	};
	protected ISODate entitlementCalculationDate;
	/**
	 * Date at which the positions are calculated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MeetingEntitlement
	 * MeetingEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntitlementCalculationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date at which the positions are calculated."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmEntitlementCalculationDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MeetingEntitlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EntitlementCalculationDate";
			definition = "Date at which the positions are calculated.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MeetingEntitlement.class.getMethod("getEntitlementCalculationDate", new Class[]{});
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
				name = "MeetingEntitlement";
				definition = "Notification of the entitlement that one party has in relation with a specific meeting.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesBalance.mmRelatedMeetingEntitlement, com.tools20022.repository.entity.MeetingServicing.mmMeetingEntitlement);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.MeetingEntitlement.mmEntitlementFixingDate, com.tools20022.repository.entity.MeetingEntitlement.mmEntitlementRatio,
						com.tools20022.repository.entity.MeetingEntitlement.mmEligiblePosition, com.tools20022.repository.entity.MeetingEntitlement.mmRelatedServicing,
						com.tools20022.repository.entity.MeetingEntitlement.mmEntitlementCalculationDate);
			}

			@Override
			public Class<?> getInstanceClass() {
				return MeetingEntitlement.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ISODate getEntitlementFixingDate() {
		return entitlementFixingDate;
	}

	public void setEntitlementFixingDate(ISODate entitlementFixingDate) {
		this.entitlementFixingDate = entitlementFixingDate;
	}

	public Number getEntitlementRatio() {
		return entitlementRatio;
	}

	public void setEntitlementRatio(Number entitlementRatio) {
		this.entitlementRatio = entitlementRatio;
	}

	public List<SecuritiesBalance> getEligiblePosition() {
		return eligiblePosition;
	}

	public void setEligiblePosition(List<com.tools20022.repository.entity.SecuritiesBalance> eligiblePosition) {
		this.eligiblePosition = eligiblePosition;
	}

	public MeetingServicing getRelatedServicing() {
		return relatedServicing;
	}

	public void setRelatedServicing(com.tools20022.repository.entity.MeetingServicing relatedServicing) {
		this.relatedServicing = relatedServicing;
	}

	public ISODate getEntitlementCalculationDate() {
		return entitlementCalculationDate;
	}

	public void setEntitlementCalculationDate(ISODate entitlementCalculationDate) {
		this.entitlementCalculationDate = entitlementCalculationDate;
	}
}