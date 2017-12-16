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
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
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
 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction#mmType
 * TerminalManagementAction.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction#mmTrigger
 * TerminalManagementAction.mmTrigger}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction#mmAdditionalProcess
 * TerminalManagementAction.mmAdditionalProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction#mmActionResult
 * TerminalManagementAction.mmActionResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction#mmActionToProcess
 * TerminalManagementAction.mmActionToProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction#mmTerminalManagementSystem
 * TerminalManagementAction.mmTerminalManagementSystem}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem#mmAction
 * TerminalManagementSystem.mmAction}</li>
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
 * "TerminalManagementAction"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Terminal management action to be performed by the point of interaction."</li>
 * </ul>
 */
public class TerminalManagementAction {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected TerminalManagementActionCode type;
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
	public static final MMBusinessAttribute mmType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TerminalManagementAction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Types of terminal management action to be performed by a point of interaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TerminalManagementActionCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TerminalManagementAction.class.getMethod("getType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TerminalManagementActionTriggerCode trigger;
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
	public static final MMBusinessAttribute mmTrigger = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TerminalManagementAction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Trigger";
			definition = "Event to start the terminal management action by the point of interaction (POI).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TerminalManagementActionTriggerCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TerminalManagementAction.class.getMethod("getTrigger", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TerminalManagementAdditionalProcessCode additionalProcess;
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
	public static final MMBusinessAttribute mmAdditionalProcess = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TerminalManagementAction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AdditionalProcess";
			definition = "Additional process to perform before starting or after the terminal management action by the point of interaction (POI).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TerminalManagementAdditionalProcessCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TerminalManagementAction.class.getMethod("getAdditionalProcess", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TerminalManagementActionResultCode actionResult;
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
	public static final MMBusinessAttribute mmActionResult = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TerminalManagementAction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ActionResult";
			definition = "List of action result codes.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TerminalManagementActionResultCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TerminalManagementAction.class.getMethod("getActionResult", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TerminalManagementErrorActionCode actionToProcess;
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
	public static final MMBusinessAttribute mmActionToProcess = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TerminalManagementAction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ActionToProcess";
			definition = "Action to be processed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TerminalManagementErrorActionCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TerminalManagementAction.class.getMethod("getActionToProcess", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TerminalManagementSystem terminalManagementSystem;
	/**
	 * Terminal management system from which an action took place
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem#mmAction
	 * TerminalManagementSystem.mmAction}</li>
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
	public static final MMBusinessAssociationEnd mmTerminalManagementSystem = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TerminalManagementAction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TerminalManagementSystem";
			definition = "Terminal management system from which an action took place";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TerminalManagementSystem.mmAction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TerminalManagementSystem.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TerminalManagementAction";
				definition = "Terminal management action to be performed by the point of interaction.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TerminalManagementSystem.mmAction);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TerminalManagementAction.mmType, com.tools20022.repository.entity.TerminalManagementAction.mmTrigger,
						com.tools20022.repository.entity.TerminalManagementAction.mmAdditionalProcess, com.tools20022.repository.entity.TerminalManagementAction.mmActionResult,
						com.tools20022.repository.entity.TerminalManagementAction.mmActionToProcess, com.tools20022.repository.entity.TerminalManagementAction.mmTerminalManagementSystem);
			}

			@Override
			public Class<?> getInstanceClass() {
				return TerminalManagementAction.class;
			}
		});
		return mmObject_lazy.get();
	}

	public TerminalManagementActionCode getType() {
		return type;
	}

	public void setType(TerminalManagementActionCode type) {
		this.type = type;
	}

	public TerminalManagementActionTriggerCode getTrigger() {
		return trigger;
	}

	public void setTrigger(TerminalManagementActionTriggerCode trigger) {
		this.trigger = trigger;
	}

	public TerminalManagementAdditionalProcessCode getAdditionalProcess() {
		return additionalProcess;
	}

	public void setAdditionalProcess(TerminalManagementAdditionalProcessCode additionalProcess) {
		this.additionalProcess = additionalProcess;
	}

	public TerminalManagementActionResultCode getActionResult() {
		return actionResult;
	}

	public void setActionResult(TerminalManagementActionResultCode actionResult) {
		this.actionResult = actionResult;
	}

	public TerminalManagementErrorActionCode getActionToProcess() {
		return actionToProcess;
	}

	public void setActionToProcess(TerminalManagementErrorActionCode actionToProcess) {
		this.actionToProcess = actionToProcess;
	}

	public TerminalManagementSystem getTerminalManagementSystem() {
		return terminalManagementSystem;
	}

	public void setTerminalManagementSystem(com.tools20022.repository.entity.TerminalManagementSystem terminalManagementSystem) {
		this.terminalManagementSystem = terminalManagementSystem;
	}
}