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
import com.tools20022.repository.entity.Role;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Party which plays a role for regulatory reporting.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="RegulatoryReportingRole"
 * src="doc-files/RegulatoryReportingRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Role Role}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegulatoryReportingRole#mmRelatedReportingParty
 * RegulatoryReportingRole.mmRelatedReportingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegulatoryReportingRole#mmRelatedRegistrationAgent
 * RegulatoryReportingRole.mmRelatedRegistrationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegulatoryReportingRole#mmRelatedReceivingParty
 * RegulatoryReportingRole.mmRelatedReceivingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegulatoryReportingRole#mmRelatedSendingParty
 * RegulatoryReportingRole.mmRelatedSendingParty}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmReportingParty
 * RegisteredContract.mmReportingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmRegistrationAgent
 * RegisteredContract.mmRegistrationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmReceivingParty
 * RegisteredContract.mmReceivingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmSendingParty
 * RegisteredContract.mmSendingParty}</li>
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
 * "RegulatoryReportingRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Party which plays a role for regulatory reporting."</li>
 * </ul>
 */
public class RegulatoryReportingRole extends Role {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected RegisteredContract relatedReportingParty;
	/**
	 * Related party which must register the contract for regulatory reporting
	 * reasons.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmReportingParty
	 * RegisteredContract.mmReportingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RegisteredContract
	 * RegisteredContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RegulatoryReportingRole
	 * RegulatoryReportingRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedReportingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Related party which must register the contract for regulatory reporting reasons."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedReportingParty = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RegulatoryReportingRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedReportingParty";
			definition = "Related party which must register the contract for regulatory reporting reasons.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RegisteredContract.mmReportingParty;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RegisteredContract.mmObject();
		}
	};
	protected RegisteredContract relatedRegistrationAgent;
	/**
	 * Related agent which is in charge of the registration of the contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmRegistrationAgent
	 * RegisteredContract.mmRegistrationAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RegisteredContract
	 * RegisteredContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RegulatoryReportingRole
	 * RegulatoryReportingRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedRegistrationAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Related agent which is in charge of the registration of the contract."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedRegistrationAgent = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RegulatoryReportingRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedRegistrationAgent";
			definition = "Related agent which is in charge of the registration of the contract.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RegisteredContract.mmRegistrationAgent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RegisteredContract.mmObject();
		}
	};
	protected RegisteredContract relatedReceivingParty;
	/**
	 * Related party which receives support information about the registered
	 * contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmReceivingParty
	 * RegisteredContract.mmReceivingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RegisteredContract
	 * RegisteredContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RegulatoryReportingRole
	 * RegulatoryReportingRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedReceivingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Related party which receives support information about the registered contract."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedReceivingParty = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RegulatoryReportingRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedReceivingParty";
			definition = "Related party which receives support information about the registered contract.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RegisteredContract.mmReceivingParty;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RegisteredContract.mmObject();
		}
	};
	protected RegisteredContract relatedSendingParty;
	/**
	 * Related Party which sends support information about the registered
	 * contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmSendingParty
	 * RegisteredContract.mmSendingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RegisteredContract
	 * RegisteredContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RegulatoryReportingRole
	 * RegulatoryReportingRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedSendingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Related Party which sends support information about the registered contract."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedSendingParty = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RegulatoryReportingRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedSendingParty";
			definition = "Related Party which sends support information about the registered contract.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RegisteredContract.mmSendingParty;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RegisteredContract.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RegulatoryReportingRole";
				definition = "Party which plays a role for regulatory reporting.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.RegisteredContract.mmReportingParty, com.tools20022.repository.entity.RegisteredContract.mmRegistrationAgent,
						com.tools20022.repository.entity.RegisteredContract.mmReceivingParty, com.tools20022.repository.entity.RegisteredContract.mmSendingParty);
				superType_lazy = () -> Role.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.RegulatoryReportingRole.mmRelatedReportingParty, com.tools20022.repository.entity.RegulatoryReportingRole.mmRelatedRegistrationAgent,
						com.tools20022.repository.entity.RegulatoryReportingRole.mmRelatedReceivingParty, com.tools20022.repository.entity.RegulatoryReportingRole.mmRelatedSendingParty);
			}

			@Override
			public Class<?> getInstanceClass() {
				return RegulatoryReportingRole.class;
			}
		});
		return mmObject_lazy.get();
	}

	public RegisteredContract getRelatedReportingParty() {
		return relatedReportingParty;
	}

	public void setRelatedReportingParty(com.tools20022.repository.entity.RegisteredContract relatedReportingParty) {
		this.relatedReportingParty = relatedReportingParty;
	}

	public RegisteredContract getRelatedRegistrationAgent() {
		return relatedRegistrationAgent;
	}

	public void setRelatedRegistrationAgent(com.tools20022.repository.entity.RegisteredContract relatedRegistrationAgent) {
		this.relatedRegistrationAgent = relatedRegistrationAgent;
	}

	public RegisteredContract getRelatedReceivingParty() {
		return relatedReceivingParty;
	}

	public void setRelatedReceivingParty(com.tools20022.repository.entity.RegisteredContract relatedReceivingParty) {
		this.relatedReceivingParty = relatedReceivingParty;
	}

	public RegisteredContract getRelatedSendingParty() {
		return relatedSendingParty;
	}

	public void setRelatedSendingParty(com.tools20022.repository.entity.RegisteredContract relatedSendingParty) {
		this.relatedSendingParty = relatedSendingParty;
	}
}