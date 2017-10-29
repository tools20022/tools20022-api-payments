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
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.TMSContactLevelCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.entity.System;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Terminal management system (TMS), has in charge the maintenance of the
 * terminal, including monitoring, software update, configuration parameters
 * management.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="TerminalManagementSystem"
 * src="doc-files/TerminalManagementSystem.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem#AcceptorConfiguration
 * TerminalManagementSystem.AcceptorConfiguration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem#NetworkAccess
 * TerminalManagementSystem.NetworkAccess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem#CardPaymentAcquiring
 * TerminalManagementSystem.CardPaymentAcquiring}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem#ContactLevel
 * TerminalManagementSystem.ContactLevel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem#ContactDateTime
 * TerminalManagementSystem.ContactDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem#TerminalManagerRole
 * TerminalManagementSystem.TerminalManagerRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem#ControlledPointOfInteraction
 * TerminalManagementSystem.ControlledPointOfInteraction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem#Action
 * TerminalManagementSystem.Action}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#TMSTrigger
 * CardPaymentAcquiring.TMSTrigger}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#ControllingTerminalManagementSystem
 * PointOfInteraction.ControllingTerminalManagementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#TerminalManagementSystem
 * AcceptorConfiguration.TerminalManagementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction#TerminalManagementSystem
 * TerminalManagementAction.TerminalManagementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetworkAccess#TerminalManagementSystem
 * NetworkAccess.TerminalManagementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TerminalManagerRole#TerminalManagementSystem
 * TerminalManagerRole.TerminalManagementSystem}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.System System}</li>
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
 * "TerminalManagementSystem"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Terminal management system (TMS), has in charge the maintenance of the terminal, including monitoring, software update, configuration parameters management."
 * </li>
 * </ul>
 */
public class TerminalManagementSystem extends System {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Acceptor parameters to be downloaded from the terminal management system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#TerminalManagementSystem
	 * AcceptorConfiguration.TerminalManagementSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration
	 * AcceptorConfiguration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem
	 * TerminalManagementSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptorConfiguration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Acceptor parameters to be downloaded from the terminal management system."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd AcceptorConfiguration = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> TerminalManagementSystem.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AcceptorConfiguration";
			definition = "Acceptor parameters to be downloaded from the terminal management system.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.AcceptorConfiguration.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AcceptorConfiguration.TerminalManagementSystem;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Parameters used to access a network.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.NetworkAccess#TerminalManagementSystem
	 * NetworkAccess.TerminalManagementSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.NetworkAccess
	 * NetworkAccess}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem
	 * TerminalManagementSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetworkAccess"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Parameters used to access a network."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd NetworkAccess = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> TerminalManagementSystem.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetworkAccess";
			definition = "Parameters used to access a network.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.NetworkAccess.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.NetworkAccess.TerminalManagementSystem;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Process for which a TMS trigger is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#TMSTrigger
	 * CardPaymentAcquiring.TMSTrigger}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem
	 * TerminalManagementSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardPaymentAcquiring"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Process for which a TMS trigger is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CardPaymentAcquiring = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> TerminalManagementSystem.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CardPaymentAcquiring";
			definition = "Process for which a TMS trigger is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.TMSTrigger;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Level of urgency in contacting the maintenance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TMSContactLevelCode
	 * TMSContactLevelCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem
	 * TerminalManagementSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContactLevel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Level of urgency in contacting the maintenance."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ContactLevel = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> TerminalManagementSystem.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ContactLevel";
			definition = "Level of urgency in contacting the maintenance.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TMSContactLevelCode.mmObject();
		}
	};
	/**
	 * Date and time for calling the maintenance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem
	 * TerminalManagementSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContactDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time for calling the maintenance."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ContactDateTime = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> TerminalManagementSystem.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ContactDateTime";
			definition = "Date and time for calling the maintenance.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Identifies the party which is the terminal manager (TM) to contact for
	 * the maintenance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagerRole#TerminalManagementSystem
	 * TerminalManagerRole.TerminalManagementSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TerminalManagerRole
	 * TerminalManagerRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem
	 * TerminalManagementSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminalManagerRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the party which is the terminal manager (TM) to contact for the maintenance."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TerminalManagerRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> TerminalManagementSystem.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TerminalManagerRole";
			definition = "Identifies the party which is the terminal manager (TM) to contact for the maintenance.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.TerminalManagerRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TerminalManagerRole.TerminalManagementSystem;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies each point of interaction controlled by a TMS.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#ControllingTerminalManagementSystem
	 * PointOfInteraction.ControllingTerminalManagementSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PointOfInteraction
	 * PointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem
	 * TerminalManagementSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ControlledPointOfInteraction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies each point of interaction controlled by a TMS."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ControlledPointOfInteraction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> TerminalManagementSystem.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ControlledPointOfInteraction";
			definition = "Specifies each point of interaction controlled by a TMS.";
			minOccurs = 0;
			type_lazy = () -> PointOfInteraction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PointOfInteraction.ControllingTerminalManagementSystem;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Terminal management action to be performed by the point of interaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction#TerminalManagementSystem
	 * TerminalManagementAction.TerminalManagementSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction
	 * TerminalManagementAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem
	 * TerminalManagementSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Action"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Terminal management action to be performed by the point of interaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Action = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> TerminalManagementSystem.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Action";
			definition = "Terminal management action to be performed by the point of interaction.";
			minOccurs = 0;
			type_lazy = () -> TerminalManagementAction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TerminalManagementAction.TerminalManagementSystem;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TerminalManagementSystem";
				definition = "Terminal management system (TMS), has in charge the maintenance of the terminal, including monitoring, software update, configuration parameters management.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CardPaymentAcquiring.TMSTrigger, com.tools20022.repository.entity.PointOfInteraction.ControllingTerminalManagementSystem,
						com.tools20022.repository.entity.AcceptorConfiguration.TerminalManagementSystem, com.tools20022.repository.entity.TerminalManagementAction.TerminalManagementSystem,
						com.tools20022.repository.entity.NetworkAccess.TerminalManagementSystem, com.tools20022.repository.entity.TerminalManagerRole.TerminalManagementSystem);
				superType_lazy = () -> System.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TerminalManagementSystem.AcceptorConfiguration, com.tools20022.repository.entity.TerminalManagementSystem.NetworkAccess,
						com.tools20022.repository.entity.TerminalManagementSystem.CardPaymentAcquiring, com.tools20022.repository.entity.TerminalManagementSystem.ContactLevel,
						com.tools20022.repository.entity.TerminalManagementSystem.ContactDateTime, com.tools20022.repository.entity.TerminalManagementSystem.TerminalManagerRole,
						com.tools20022.repository.entity.TerminalManagementSystem.ControlledPointOfInteraction, com.tools20022.repository.entity.TerminalManagementSystem.Action);
			}
		});
		return mmObject_lazy.get();
	}
}