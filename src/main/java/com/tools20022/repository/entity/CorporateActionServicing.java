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
import com.tools20022.metamodel.MMBusinessComponent;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Services which consists in notifying the investor or its agent of a corporate
 * event and calculating its proceeds based on its holdings.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CorporateActionServicing"
 * src="doc-files/CorporateActionServicing.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#SecuritiesAccount
 * CorporateActionServicing.SecuritiesAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#CorporateActionEventNotification
 * CorporateActionServicing.CorporateActionEventNotification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#CorporateActionDistribution
 * CorporateActionServicing.CorporateActionDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#CorporateActionOptionServicing
 * CorporateActionServicing.CorporateActionOptionServicing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#Event
 * CorporateActionServicing.Event}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#CorporateActionElection
 * CorporateActionServicing.CorporateActionElection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#CorporateActionEntitlement
 * CorporateActionServicing.CorporateActionEntitlement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#CorporateActionServicing
 * SecuritiesAccount.CorporateActionServicing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionNotification#RelatedServicing
 * CorporateActionNotification.RelatedServicing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#Services
 * CorporateActionEvent.Services}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#RelatedServicing
 * CorporateActionEntitlement.RelatedServicing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionElection#RelatedServicing
 * CorporateActionElection.RelatedServicing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#RelatedServicing
 * CorporateActionDistribution.RelatedServicing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOptionServicing#RelatedServicing
 * CorporateActionOptionServicing.RelatedServicing}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.MeetingServicing
 * MeetingServicing}</li>
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
 * "CorporateActionServicing"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Services which consists in notifying the investor or its agent of a corporate event and calculating its proceeds based on its holdings."
 * </li>
 * </ul>
 */
public class CorporateActionServicing {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Account on which the entitlement is calculated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#CorporateActionServicing
	 * SecuritiesAccount.CorporateActionServicing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing
	 * CorporateActionServicing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account on which the entitlement is calculated."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesAccount = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionServicing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesAccount";
			definition = "Account on which the entitlement is calculated.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.CorporateActionServicing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Service which consists in notifying the investor or its agent of a
	 * corporate event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionNotification#RelatedServicing
	 * CorporateActionNotification.RelatedServicing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionNotification
	 * CorporateActionNotification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing
	 * CorporateActionServicing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionEventNotification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Service which consists in notifying the investor or its agent of a corporate event."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CorporateActionEventNotification = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionServicing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionEventNotification";
			definition = "Service which consists in notifying the investor or its agent of a corporate event.";
			minOccurs = 0;
			type_lazy = () -> CorporateActionNotification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionNotification.RelatedServicing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Distribution of cash or securities as a result of a corporate action
	 * election.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#RelatedServicing
	 * CorporateActionDistribution.RelatedServicing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution
	 * CorporateActionDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing
	 * CorporateActionServicing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Distribution of cash or securities as a result of a corporate action election."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CorporateActionDistribution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionServicing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionDistribution";
			definition = "Distribution of cash or securities as a result of a corporate action election.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionDistribution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionDistribution.RelatedServicing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Service which consists in notifying the investor or its entitlement per
	 * option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOptionServicing#RelatedServicing
	 * CorporateActionOptionServicing.RelatedServicing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOptionServicing
	 * CorporateActionOptionServicing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing
	 * CorporateActionServicing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionOptionServicing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Service which consists in notifying the investor or its entitlement per option."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CorporateActionOptionServicing = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionServicing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionOptionServicing";
			definition = "Service which consists in notifying the investor or its entitlement per option.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionOptionServicing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionOptionServicing.RelatedServicing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the event which is at the origin of the action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#Services
	 * CorporateActionEvent.Services}</li>
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
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing
	 * CorporateActionServicing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Event"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the event which is at the origin of the action."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Event = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionServicing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Event";
			definition = "Specifies the event which is at the origin of the action.";
			minOccurs = 0;
			type_lazy = () -> CorporateActionEvent.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.Services;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Service which consists in validating, calculating and transferring the
	 * investor's instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionElection#RelatedServicing
	 * CorporateActionElection.RelatedServicing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionElection
	 * CorporateActionElection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing
	 * CorporateActionServicing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionElection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Service which consists in validating, calculating and transferring the investor's instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CorporateActionElection = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionServicing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionElection";
			definition = "Service which consists in validating, calculating and transferring the investor's instruction.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionElection.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionElection.RelatedServicing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Calculation of the proceeds based on the balance in the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#RelatedServicing
	 * CorporateActionEntitlement.RelatedServicing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement
	 * CorporateActionEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing
	 * CorporateActionServicing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionEntitlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Calculation of the proceeds based on the balance in the account."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CorporateActionEntitlement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionServicing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionEntitlement";
			definition = "Calculation of the proceeds based on the balance in the account.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.RelatedServicing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionServicing";
				definition = "Services which consists in notifying the investor or its agent of a corporate event and calculating its proceeds based on its holdings.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesAccount.CorporateActionServicing, com.tools20022.repository.entity.CorporateActionNotification.RelatedServicing,
						com.tools20022.repository.entity.CorporateActionEvent.Services, com.tools20022.repository.entity.CorporateActionEntitlement.RelatedServicing,
						com.tools20022.repository.entity.CorporateActionElection.RelatedServicing, com.tools20022.repository.entity.CorporateActionDistribution.RelatedServicing,
						com.tools20022.repository.entity.CorporateActionOptionServicing.RelatedServicing);
				subType_lazy = () -> Arrays.asList(MeetingServicing.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionServicing.SecuritiesAccount, com.tools20022.repository.entity.CorporateActionServicing.CorporateActionEventNotification,
						com.tools20022.repository.entity.CorporateActionServicing.CorporateActionDistribution, com.tools20022.repository.entity.CorporateActionServicing.CorporateActionOptionServicing,
						com.tools20022.repository.entity.CorporateActionServicing.Event, com.tools20022.repository.entity.CorporateActionServicing.CorporateActionElection,
						com.tools20022.repository.entity.CorporateActionServicing.CorporateActionEntitlement);
			}
		});
		return mmObject_lazy.get();
	}
}