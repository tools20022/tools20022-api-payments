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

import com.tools20022.metamodel.MMAggregation;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#mmSecuritiesAccount
 * CorporateActionServicing.mmSecuritiesAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#mmCorporateActionEventNotification
 * CorporateActionServicing.mmCorporateActionEventNotification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#mmCorporateActionDistribution
 * CorporateActionServicing.mmCorporateActionDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#mmCorporateActionOptionServicing
 * CorporateActionServicing.mmCorporateActionOptionServicing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#mmEvent
 * CorporateActionServicing.mmEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#mmCorporateActionElection
 * CorporateActionServicing.mmCorporateActionElection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#mmCorporateActionEntitlement
 * CorporateActionServicing.mmCorporateActionEntitlement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmCorporateActionServicing
 * SecuritiesAccount.mmCorporateActionServicing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionNotification#mmRelatedServicing
 * CorporateActionNotification.mmRelatedServicing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmServices
 * CorporateActionEvent.mmServices}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmRelatedServicing
 * CorporateActionEntitlement.mmRelatedServicing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionElection#mmRelatedServicing
 * CorporateActionElection.mmRelatedServicing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmRelatedServicing
 * CorporateActionDistribution.mmRelatedServicing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOptionServicing#mmRelatedServicing
 * CorporateActionOptionServicing.mmRelatedServicing}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	protected List<com.tools20022.repository.entity.SecuritiesAccount> securitiesAccount;
	/**
	 * Account on which the entitlement is calculated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmCorporateActionServicing
	 * SecuritiesAccount.mmCorporateActionServicing}</li>
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
	public static final MMBusinessAssociationEnd mmSecuritiesAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionServicing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesAccount";
			definition = "Account on which the entitlement is calculated.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmCorporateActionServicing;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CorporateActionNotification> corporateActionEventNotification;
	/**
	 * Service which consists in notifying the investor or its agent of a
	 * corporate event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionNotification#mmRelatedServicing
	 * CorporateActionNotification.mmRelatedServicing}</li>
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
	public static final MMBusinessAssociationEnd mmCorporateActionEventNotification = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionServicing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionEventNotification";
			definition = "Service which consists in notifying the investor or its agent of a corporate event.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionNotification.mmRelatedServicing;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionNotification.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CorporateActionDistribution> corporateActionDistribution;
	/**
	 * Distribution of cash or securities as a result of a corporate action
	 * election.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmRelatedServicing
	 * CorporateActionDistribution.mmRelatedServicing}</li>
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
	public static final MMBusinessAssociationEnd mmCorporateActionDistribution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionServicing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionDistribution";
			definition = "Distribution of cash or securities as a result of a corporate action election.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionDistribution.mmRelatedServicing;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionDistribution.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CorporateActionOptionServicing> corporateActionOptionServicing;
	/**
	 * Service which consists in notifying the investor or its entitlement per
	 * option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOptionServicing#mmRelatedServicing
	 * CorporateActionOptionServicing.mmRelatedServicing}</li>
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
	public static final MMBusinessAssociationEnd mmCorporateActionOptionServicing = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionServicing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionOptionServicing";
			definition = "Service which consists in notifying the investor or its entitlement per option.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionOptionServicing.mmRelatedServicing;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionOptionServicing.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CorporateActionEvent> event;
	/**
	 * Specifies the event which is at the origin of the action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmServices
	 * CorporateActionEvent.mmServices}</li>
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
	public static final MMBusinessAssociationEnd mmEvent = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionServicing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Event";
			definition = "Specifies the event which is at the origin of the action.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmServices;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CorporateActionElection> corporateActionElection;
	/**
	 * Service which consists in validating, calculating and transferring the
	 * investor's instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionElection#mmRelatedServicing
	 * CorporateActionElection.mmRelatedServicing}</li>
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
	public static final MMBusinessAssociationEnd mmCorporateActionElection = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionServicing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionElection";
			definition = "Service which consists in validating, calculating and transferring the investor's instruction.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionElection.mmRelatedServicing;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionElection.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CorporateActionEntitlement> corporateActionEntitlement;
	/**
	 * Calculation of the proceeds based on the balance in the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmRelatedServicing
	 * CorporateActionEntitlement.mmRelatedServicing}</li>
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
	public static final MMBusinessAssociationEnd mmCorporateActionEntitlement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionServicing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionEntitlement";
			definition = "Calculation of the proceeds based on the balance in the account.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmRelatedServicing;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionServicing";
				definition = "Services which consists in notifying the investor or its agent of a corporate event and calculating its proceeds based on its holdings.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesAccount.mmCorporateActionServicing, com.tools20022.repository.entity.CorporateActionNotification.mmRelatedServicing,
						com.tools20022.repository.entity.CorporateActionEvent.mmServices, com.tools20022.repository.entity.CorporateActionEntitlement.mmRelatedServicing,
						com.tools20022.repository.entity.CorporateActionElection.mmRelatedServicing, com.tools20022.repository.entity.CorporateActionDistribution.mmRelatedServicing,
						com.tools20022.repository.entity.CorporateActionOptionServicing.mmRelatedServicing);
				subType_lazy = () -> Arrays.asList(MeetingServicing.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionServicing.mmSecuritiesAccount, com.tools20022.repository.entity.CorporateActionServicing.mmCorporateActionEventNotification,
						com.tools20022.repository.entity.CorporateActionServicing.mmCorporateActionDistribution, com.tools20022.repository.entity.CorporateActionServicing.mmCorporateActionOptionServicing,
						com.tools20022.repository.entity.CorporateActionServicing.mmEvent, com.tools20022.repository.entity.CorporateActionServicing.mmCorporateActionElection,
						com.tools20022.repository.entity.CorporateActionServicing.mmCorporateActionEntitlement);
			}

			@Override
			public Class<?> getInstanceClass() {
				return CorporateActionServicing.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<SecuritiesAccount> getSecuritiesAccount() {
		return securitiesAccount;
	}

	public void setSecuritiesAccount(List<com.tools20022.repository.entity.SecuritiesAccount> securitiesAccount) {
		this.securitiesAccount = securitiesAccount;
	}

	public List<CorporateActionNotification> getCorporateActionEventNotification() {
		return corporateActionEventNotification;
	}

	public void setCorporateActionEventNotification(List<com.tools20022.repository.entity.CorporateActionNotification> corporateActionEventNotification) {
		this.corporateActionEventNotification = corporateActionEventNotification;
	}

	public List<CorporateActionDistribution> getCorporateActionDistribution() {
		return corporateActionDistribution;
	}

	public void setCorporateActionDistribution(List<com.tools20022.repository.entity.CorporateActionDistribution> corporateActionDistribution) {
		this.corporateActionDistribution = corporateActionDistribution;
	}

	public List<CorporateActionOptionServicing> getCorporateActionOptionServicing() {
		return corporateActionOptionServicing;
	}

	public void setCorporateActionOptionServicing(List<com.tools20022.repository.entity.CorporateActionOptionServicing> corporateActionOptionServicing) {
		this.corporateActionOptionServicing = corporateActionOptionServicing;
	}

	public List<CorporateActionEvent> getEvent() {
		return event;
	}

	public void setEvent(List<com.tools20022.repository.entity.CorporateActionEvent> event) {
		this.event = event;
	}

	public List<CorporateActionElection> getCorporateActionElection() {
		return corporateActionElection;
	}

	public void setCorporateActionElection(List<com.tools20022.repository.entity.CorporateActionElection> corporateActionElection) {
		this.corporateActionElection = corporateActionElection;
	}

	public List<CorporateActionEntitlement> getCorporateActionEntitlement() {
		return corporateActionEntitlement;
	}

	public void setCorporateActionEntitlement(List<com.tools20022.repository.entity.CorporateActionEntitlement> corporateActionEntitlement) {
		this.corporateActionEntitlement = corporateActionEntitlement;
	}
}