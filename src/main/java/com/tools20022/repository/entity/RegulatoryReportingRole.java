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
import com.tools20022.repository.entity.Role;
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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegulatoryReportingRole#RelatedReportingParty
 * RegulatoryReportingRole.RelatedReportingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegulatoryReportingRole#RelatedRegistrationAgent
 * RegulatoryReportingRole.RelatedRegistrationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegulatoryReportingRole#RelatedReceivingParty
 * RegulatoryReportingRole.RelatedReceivingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegulatoryReportingRole#RelatedSendingParty
 * RegulatoryReportingRole.RelatedSendingParty}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegisteredContract#ReportingParty
 * RegisteredContract.ReportingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegisteredContract#RegistrationAgent
 * RegisteredContract.RegistrationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegisteredContract#ReceivingParty
 * RegisteredContract.ReceivingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegisteredContract#SendingParty
 * RegisteredContract.SendingParty}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Role Role}</li>
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
 * "RegulatoryReportingRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Party which plays a role for regulatory reporting."</li>
 * </ul>
 */
public class RegulatoryReportingRole extends Role {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Related party which must register the contract for regulatory reporting
	 * reasons.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract#ReportingParty
	 * RegisteredContract.ReportingParty}</li>
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
	public static final MMBusinessAssociationEnd RelatedReportingParty = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> RegulatoryReportingRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedReportingParty";
			definition = "Related party which must register the contract for regulatory reporting reasons.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> RegisteredContract.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.RegisteredContract.ReportingParty;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Related agent which is in charge of the registration of the contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract#RegistrationAgent
	 * RegisteredContract.RegistrationAgent}</li>
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
	public static final MMBusinessAssociationEnd RelatedRegistrationAgent = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> RegulatoryReportingRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedRegistrationAgent";
			definition = "Related agent which is in charge of the registration of the contract.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> RegisteredContract.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.RegisteredContract.RegistrationAgent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Related party which receives support information about the registered
	 * contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract#ReceivingParty
	 * RegisteredContract.ReceivingParty}</li>
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
	public static final MMBusinessAssociationEnd RelatedReceivingParty = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> RegulatoryReportingRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedReceivingParty";
			definition = "Related party which receives support information about the registered contract.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> RegisteredContract.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.RegisteredContract.ReceivingParty;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Related Party which sends support information about the registered
	 * contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract#SendingParty
	 * RegisteredContract.SendingParty}</li>
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
	public static final MMBusinessAssociationEnd RelatedSendingParty = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> RegulatoryReportingRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedSendingParty";
			definition = "Related Party which sends support information about the registered contract.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> RegisteredContract.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.RegisteredContract.SendingParty;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RegulatoryReportingRole";
				definition = "Party which plays a role for regulatory reporting.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.RegisteredContract.ReportingParty, com.tools20022.repository.entity.RegisteredContract.RegistrationAgent,
						com.tools20022.repository.entity.RegisteredContract.ReceivingParty, com.tools20022.repository.entity.RegisteredContract.SendingParty);
				superType_lazy = () -> Role.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.RegulatoryReportingRole.RelatedReportingParty, com.tools20022.repository.entity.RegulatoryReportingRole.RelatedRegistrationAgent,
						com.tools20022.repository.entity.RegulatoryReportingRole.RelatedReceivingParty, com.tools20022.repository.entity.RegulatoryReportingRole.RelatedSendingParty);
			}
		});
		return mmObject_lazy.get();
	}
}