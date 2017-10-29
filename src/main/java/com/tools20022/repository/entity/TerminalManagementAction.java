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
import com.tools20022.repository.codeset.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Terminal management action to be performed by the point of interaction.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="TerminalManagementAction"
 * src="doc-files/TerminalManagementAction.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction#Type
 * TerminalManagementAction.Type}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction#Trigger
 * TerminalManagementAction.Trigger}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction#AdditionalProcess
 * TerminalManagementAction.AdditionalProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction#ActionResult
 * TerminalManagementAction.ActionResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction#ActionToProcess
 * TerminalManagementAction.ActionToProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction#TerminalManagementSystem
 * TerminalManagementAction.TerminalManagementSystem}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem#Action
 * TerminalManagementSystem.Action}</li>
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
 * "TerminalManagementAction"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Terminal management action to be performed by the point of interaction."</li>
 * </ul>
 */
public class TerminalManagementAction {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Types of terminal management action to be performed by a point of
	 * interaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionCode
	 * TerminalManagementActionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction
	 * TerminalManagementAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Types of terminal management action to be performed by a point of interaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> TerminalManagementAction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Types of terminal management action to be performed by a point of interaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TerminalManagementActionCode.mmObject();
		}
	};
	/**
	 * Event to start the terminal management action by the point of interaction
	 * (POI).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionTriggerCode
	 * TerminalManagementActionTriggerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction
	 * TerminalManagementAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Trigger"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event to start the terminal management action by the point of interaction (POI)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Trigger = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> TerminalManagementAction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Trigger";
			definition = "Event to start the terminal management action by the point of interaction (POI).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TerminalManagementActionTriggerCode.mmObject();
		}
	};
	/**
	 * Additional process to perform before starting or after the terminal
	 * management action by the point of interaction (POI).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAdditionalProcessCode
	 * TerminalManagementAdditionalProcessCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction
	 * TerminalManagementAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalProcess"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional process to perform before starting or after the terminal management action by the point of interaction (POI)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AdditionalProcess = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> TerminalManagementAction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AdditionalProcess";
			definition = "Additional process to perform before starting or after the terminal management action by the point of interaction (POI).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TerminalManagementAdditionalProcessCode.mmObject();
		}
	};
	/**
	 * List of action result codes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResultCode
	 * TerminalManagementActionResultCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction
	 * TerminalManagementAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActionResult"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "List of action result codes."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ActionResult = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> TerminalManagementAction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ActionResult";
			definition = "List of action result codes.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TerminalManagementActionResultCode.mmObject();
		}
	};
	/**
	 * Action to be processed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementErrorActionCode
	 * TerminalManagementErrorActionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction
	 * TerminalManagementAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActionToProcess"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Action to be processed."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ActionToProcess = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> TerminalManagementAction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ActionToProcess";
			definition = "Action to be processed.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TerminalManagementErrorActionCode.mmObject();
		}
	};
	/**
	 * Terminal management system from which an action took place
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem#Action
	 * TerminalManagementSystem.Action}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem
	 * TerminalManagementSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction
	 * TerminalManagementAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminalManagementSystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Terminal management system from which an action took place"</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TerminalManagementSystem = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> TerminalManagementAction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TerminalManagementSystem";
			definition = "Terminal management system from which an action took place";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.TerminalManagementSystem.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TerminalManagementSystem.Action;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TerminalManagementAction";
				definition = "Terminal management action to be performed by the point of interaction.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TerminalManagementSystem.Action);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TerminalManagementAction.Type, com.tools20022.repository.entity.TerminalManagementAction.Trigger,
						com.tools20022.repository.entity.TerminalManagementAction.AdditionalProcess, com.tools20022.repository.entity.TerminalManagementAction.ActionResult,
						com.tools20022.repository.entity.TerminalManagementAction.ActionToProcess, com.tools20022.repository.entity.TerminalManagementAction.TerminalManagementSystem);
			}
		});
		return mmObject_lazy.get();
	}
}