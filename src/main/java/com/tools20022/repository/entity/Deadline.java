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
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the different deadlines available for the different processes
 * related to corporate action processes.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Deadline" src="doc-files/Deadline.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Deadline#mmRelatedCorporateActionEvent
 * Deadline.mmRelatedCorporateActionEvent}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Deadline#mmMarketDeadline
 * Deadline.mmMarketDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Deadline#mmIntermediaryDeadline
 * Deadline.mmIntermediaryDeadline}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Deadline#mmSTPDeadline
 * Deadline.mmSTPDeadline}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Deadline#mmRelatedMeeting
 * Deadline.mmRelatedMeeting}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmDeadline
 * CorporateActionEvent.mmDeadline}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#mmDeadline
 * Meeting.mmDeadline}</li>
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
 * "Deadline"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the different deadlines available for the different processes related to corporate action processes."
 * </li>
 * </ul>
 */
public class Deadline {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CorporateActionEvent relatedCorporateActionEvent;
	/**
	 * Related corporate action event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmDeadline
	 * CorporateActionEvent.mmDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Deadline
	 * Deadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCorporateActionEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Related corporate action event."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedCorporateActionEvent = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Deadline.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedCorporateActionEvent";
			definition = "Related corporate action event.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmDeadline;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
		}
	};
	protected ISODateTime marketDeadline;
	/**
	 * Date by which the action should have been completed. This deadline is set
	 * by the issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Deadline
	 * Deadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date by which the action should have been completed.  This deadline is set by the issuer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMarketDeadline = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Deadline.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MarketDeadline";
			definition = "Date by which the action should have been completed.  This deadline is set by the issuer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Deadline.class.getMethod("getMarketDeadline", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime intermediaryDeadline;
	/**
	 * Date by which the action should have been completed. This deadline is set
	 * by an intermediary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Deadline
	 * Deadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date by which the action should have been completed. This deadline is set by an intermediary."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmIntermediaryDeadline = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Deadline.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IntermediaryDeadline";
			definition = "Date by which the action should have been completed. This deadline is set by an intermediary.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Deadline.class.getMethod("getIntermediaryDeadline", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime sTPDeadline;
	/**
	 * Date by which the action should have been completed. This deadline is set
	 * by the issuer. (STP or Electronic mode)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Deadline
	 * Deadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "STPDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date by which the action should have been completed. This deadline is set by the issuer. (STP or Electronic mode)"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSTPDeadline = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Deadline.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "STPDeadline";
			definition = "Date by which the action should have been completed. This deadline is set by the issuer. (STP or Electronic mode)";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Deadline.class.getMethod("getSTPDeadline", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Meeting relatedMeeting;
	/**
	 * Meeting for which deadlines are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Meeting#mmDeadline
	 * Meeting.mmDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Meeting Meeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Deadline
	 * Deadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedMeeting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Meeting for which deadlines are specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedMeeting = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Deadline.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedMeeting";
			definition = "Meeting for which deadlines are specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Meeting.mmDeadline;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Deadline";
				definition = "Specifies the different deadlines available for the different processes related to corporate action processes.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionEvent.mmDeadline, com.tools20022.repository.entity.Meeting.mmDeadline);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Deadline.mmRelatedCorporateActionEvent, com.tools20022.repository.entity.Deadline.mmMarketDeadline,
						com.tools20022.repository.entity.Deadline.mmIntermediaryDeadline, com.tools20022.repository.entity.Deadline.mmSTPDeadline, com.tools20022.repository.entity.Deadline.mmRelatedMeeting);
			}

			@Override
			public Class<?> getInstanceClass() {
				return Deadline.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CorporateActionEvent getRelatedCorporateActionEvent() {
		return relatedCorporateActionEvent;
	}

	public void setRelatedCorporateActionEvent(com.tools20022.repository.entity.CorporateActionEvent relatedCorporateActionEvent) {
		this.relatedCorporateActionEvent = relatedCorporateActionEvent;
	}

	public ISODateTime getMarketDeadline() {
		return marketDeadline;
	}

	public void setMarketDeadline(ISODateTime marketDeadline) {
		this.marketDeadline = marketDeadline;
	}

	public ISODateTime getIntermediaryDeadline() {
		return intermediaryDeadline;
	}

	public void setIntermediaryDeadline(ISODateTime intermediaryDeadline) {
		this.intermediaryDeadline = intermediaryDeadline;
	}

	public ISODateTime getSTPDeadline() {
		return sTPDeadline;
	}

	public void setSTPDeadline(ISODateTime sTPDeadline) {
		this.sTPDeadline = sTPDeadline;
	}

	public Meeting getRelatedMeeting() {
		return relatedMeeting;
	}

	public void setRelatedMeeting(com.tools20022.repository.entity.Meeting relatedMeeting) {
		this.relatedMeeting = relatedMeeting;
	}
}