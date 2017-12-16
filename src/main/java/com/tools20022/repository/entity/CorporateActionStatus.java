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
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Status of the corporate action process.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CorporateActionStatus"
 * src="doc-files/CorporateActionStatus.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Status Status}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#mmAgentStandingInstructionStatus
 * CorporateActionStatus.mmAgentStandingInstructionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#mmProcessingStatus
 * CorporateActionStatus.mmProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#mmEventProcessingStatus
 * CorporateActionStatus.mmEventProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#mmCorporateActionStatusReason
 * CorporateActionStatus.mmCorporateActionStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#mmInstructionCancellationStatus
 * CorporateActionStatus.mmInstructionCancellationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#mmCorporateActionInstructionProcessingStatus
 * CorporateActionStatus.mmCorporateActionInstructionProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#mmRateStatus
 * CorporateActionStatus.mmRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#mmOptionAvailabilityStatus
 * CorporateActionStatus.mmOptionAvailabilityStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#mmCorporateActionEvent
 * CorporateActionStatus.mmCorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#mmEventStatus
 * CorporateActionStatus.mmEventStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#mmRelatedInstructionProcessedStatus
 * CorporateActionStatus.mmRelatedInstructionProcessedStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#mmDeactivationDateAndTime
 * CorporateActionStatus.mmDeactivationDateAndTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#mmEventConfirmationStatus
 * CorporateActionStatus.mmEventConfirmationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#mmEventCompletenessStatus
 * CorporateActionStatus.mmEventCompletenessStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason#mmCorporateActionStatus
 * CorporateActionStatusReason.mmCorporateActionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmCorporateActionStatus
 * CorporateActionEvent.mmCorporateActionStatus}</li>
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
 * "CorporateActionStatus"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Status of the corporate action process."</li>
 * </ul>
 */
public class CorporateActionStatus extends Status {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Max350Text agentStandingInstructionStatus;
	/**
	 * Specifies the state or the condition.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus
	 * CorporateActionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgentStandingInstructionStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the state or the condition."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAgentStandingInstructionStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AgentStandingInstructionStatus";
			definition = "Specifies the state or the condition.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionStatus.class.getMethod("getAgentStandingInstructionStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ProcessingStatusCode processingStatus;
	/**
	 * Specifies the status of the details of the event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ProcessingStatusCode
	 * ProcessingStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus
	 * CorporateActionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the status of the details of the event."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmProcessingStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProcessingStatus";
			definition = "Specifies the status of the details of the event.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ProcessingStatusCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionStatus.class.getMethod("getProcessingStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CorporateActionEventProcessingStatusCode eventProcessingStatus;
	/**
	 * Processing status of the corporate action event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventProcessingStatusCode
	 * CorporateActionEventProcessingStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus
	 * CorporateActionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventProcessingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Processing status of the corporate action event."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmEventProcessingStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EventProcessingStatus";
			definition = "Processing status of the corporate action event.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionEventProcessingStatusCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionStatus.class.getMethod("getEventProcessingStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.CorporateActionStatusReason> corporateActionStatusReason;
	/**
	 * Specifies the reasons for the status. It is derived from the relationship
	 * between Status and Status Reason.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason#mmCorporateActionStatus
	 * CorporateActionStatusReason.mmCorporateActionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason
	 * CorporateActionStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus
	 * CorporateActionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionStatusReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reasons for the status. It is derived from the relationship between Status and Status Reason."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCorporateActionStatusReason = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionStatusReason";
			definition = "Specifies the reasons for the status. It is derived from the relationship between Status and Status Reason.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionStatusReason.mmCorporateActionStatus;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionStatusReason.mmObject();
		}
	};
	protected CorporateActionInstructionCancellationProcessingStatusCode instructionCancellationStatus;
	/**
	 * Status of the instruction cancellation process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionInstructionCancellationProcessingStatusCode
	 * CorporateActionInstructionCancellationProcessingStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus
	 * CorporateActionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionCancellationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the instruction cancellation process."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmInstructionCancellationStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InstructionCancellationStatus";
			definition = "Status of the instruction cancellation process.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionInstructionCancellationProcessingStatusCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionStatus.class.getMethod("getInstructionCancellationStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CorporateActionInstructionProcessingStatusCode corporateActionInstructionProcessingStatus;
	/**
	 * Status of the corporate action instruction process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionInstructionProcessingStatusCode
	 * CorporateActionInstructionProcessingStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus
	 * CorporateActionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionInstructionProcessingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the corporate action instruction process."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCorporateActionInstructionProcessingStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionInstructionProcessingStatus";
			definition = "Status of the corporate action instruction process.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionInstructionProcessingStatusCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionStatus.class.getMethod("getCorporateActionInstructionProcessingStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected RateStatusCode rateStatus;
	/**
	 * Specifies whether the rate is indicative or actual.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RateStatusCode
	 * RateStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus
	 * CorporateActionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies whether the rate is indicative or actual."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRateStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RateStatus";
			definition = "Specifies whether the rate is indicative or actual.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RateStatusCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionStatus.class.getMethod("getRateStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected OptionAvailabilityStatusCode optionAvailabilityStatus;
	/**
	 * Availability status of the option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OptionAvailabilityStatusCode
	 * OptionAvailabilityStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus
	 * CorporateActionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionAvailabilityStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Availability status of the option."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmOptionAvailabilityStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OptionAvailabilityStatus";
			definition = "Availability status of the option.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OptionAvailabilityStatusCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionStatus.class.getMethod("getOptionAvailabilityStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CorporateActionEvent corporateActionEvent;
	/**
	 * Corporate event for which a status is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmCorporateActionStatus
	 * CorporateActionEvent.mmCorporateActionStatus}</li>
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus
	 * CorporateActionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Corporate event for which a status is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCorporateActionEvent = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionEvent";
			definition = "Corporate event for which a status is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmCorporateActionStatus;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
		}
	};
	protected CorporateActionEventStatusCode eventStatus;
	/**
	 * Status of the corporate action event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStatusCode
	 * CorporateActionEventStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus
	 * CorporateActionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the corporate action event."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmEventStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EventStatus";
			definition = "Status of the corporate action event.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionEventStatusCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionStatus.class.getMethod("getEventStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CorporateActionProcessedStatusCode relatedInstructionProcessedStatus;
	/**
	 * Information on the status of the processing of an instruction related to
	 * a corporate action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionProcessedStatusCode
	 * CorporateActionProcessedStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus
	 * CorporateActionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedInstructionProcessedStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information on the status of the processing of an instruction related to a corporate action."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRelatedInstructionProcessedStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedInstructionProcessedStatus";
			definition = "Information on the status of the processing of an instruction related to a corporate action.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionProcessedStatusCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionStatus.class.getMethod("getRelatedInstructionProcessedStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime deactivationDateAndTime;
	/**
	 * Date and time at which the the corporate action event or the option is
	 * deactivated.
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus
	 * CorporateActionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeactivationDateAndTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which the the corporate action event or the option is deactivated."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDeactivationDateAndTime = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeactivationDateAndTime";
			definition = "Date and time at which the the corporate action event or the option is deactivated.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionStatus.class.getMethod("getDeactivationDateAndTime", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected EventConfirmationStatusCode eventConfirmationStatus;
	/**
	 * Indicates the status of the occurrence of an event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.EventConfirmationStatusCode
	 * EventConfirmationStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus
	 * CorporateActionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventConfirmationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the status of the occurrence of an event."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmEventConfirmationStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EventConfirmationStatus";
			definition = "Indicates the status of the occurrence of an event.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EventConfirmationStatusCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionStatus.class.getMethod("getEventConfirmationStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected EventCompletenessStatusCode eventCompletenessStatus;
	/**
	 * Indicates whether the details provided about an event are complete or
	 * incomplete.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.EventCompletenessStatusCode
	 * EventCompletenessStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus
	 * CorporateActionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventCompletenessStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the details provided about an event are complete or incomplete."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmEventCompletenessStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EventCompletenessStatus";
			definition = "Indicates whether the details provided about an event are complete or incomplete.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EventCompletenessStatusCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionStatus.class.getMethod("getEventCompletenessStatus", new Class[]{});
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
				name = "CorporateActionStatus";
				definition = "Status of the corporate action process.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionStatusReason.mmCorporateActionStatus, com.tools20022.repository.entity.CorporateActionEvent.mmCorporateActionStatus);
				superType_lazy = () -> Status.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionStatus.mmAgentStandingInstructionStatus, com.tools20022.repository.entity.CorporateActionStatus.mmProcessingStatus,
						com.tools20022.repository.entity.CorporateActionStatus.mmEventProcessingStatus, com.tools20022.repository.entity.CorporateActionStatus.mmCorporateActionStatusReason,
						com.tools20022.repository.entity.CorporateActionStatus.mmInstructionCancellationStatus, com.tools20022.repository.entity.CorporateActionStatus.mmCorporateActionInstructionProcessingStatus,
						com.tools20022.repository.entity.CorporateActionStatus.mmRateStatus, com.tools20022.repository.entity.CorporateActionStatus.mmOptionAvailabilityStatus,
						com.tools20022.repository.entity.CorporateActionStatus.mmCorporateActionEvent, com.tools20022.repository.entity.CorporateActionStatus.mmEventStatus,
						com.tools20022.repository.entity.CorporateActionStatus.mmRelatedInstructionProcessedStatus, com.tools20022.repository.entity.CorporateActionStatus.mmDeactivationDateAndTime,
						com.tools20022.repository.entity.CorporateActionStatus.mmEventConfirmationStatus, com.tools20022.repository.entity.CorporateActionStatus.mmEventCompletenessStatus);
			}

			@Override
			public Class<?> getInstanceClass() {
				return CorporateActionStatus.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getAgentStandingInstructionStatus() {
		return agentStandingInstructionStatus;
	}

	public void setAgentStandingInstructionStatus(Max350Text agentStandingInstructionStatus) {
		this.agentStandingInstructionStatus = agentStandingInstructionStatus;
	}

	public ProcessingStatusCode getProcessingStatus() {
		return processingStatus;
	}

	public void setProcessingStatus(ProcessingStatusCode processingStatus) {
		this.processingStatus = processingStatus;
	}

	public CorporateActionEventProcessingStatusCode getEventProcessingStatus() {
		return eventProcessingStatus;
	}

	public void setEventProcessingStatus(CorporateActionEventProcessingStatusCode eventProcessingStatus) {
		this.eventProcessingStatus = eventProcessingStatus;
	}

	public List<CorporateActionStatusReason> getCorporateActionStatusReason() {
		return corporateActionStatusReason;
	}

	public void setCorporateActionStatusReason(List<com.tools20022.repository.entity.CorporateActionStatusReason> corporateActionStatusReason) {
		this.corporateActionStatusReason = corporateActionStatusReason;
	}

	public CorporateActionInstructionCancellationProcessingStatusCode getInstructionCancellationStatus() {
		return instructionCancellationStatus;
	}

	public void setInstructionCancellationStatus(CorporateActionInstructionCancellationProcessingStatusCode instructionCancellationStatus) {
		this.instructionCancellationStatus = instructionCancellationStatus;
	}

	public CorporateActionInstructionProcessingStatusCode getCorporateActionInstructionProcessingStatus() {
		return corporateActionInstructionProcessingStatus;
	}

	public void setCorporateActionInstructionProcessingStatus(CorporateActionInstructionProcessingStatusCode corporateActionInstructionProcessingStatus) {
		this.corporateActionInstructionProcessingStatus = corporateActionInstructionProcessingStatus;
	}

	public RateStatusCode getRateStatus() {
		return rateStatus;
	}

	public void setRateStatus(RateStatusCode rateStatus) {
		this.rateStatus = rateStatus;
	}

	public OptionAvailabilityStatusCode getOptionAvailabilityStatus() {
		return optionAvailabilityStatus;
	}

	public void setOptionAvailabilityStatus(OptionAvailabilityStatusCode optionAvailabilityStatus) {
		this.optionAvailabilityStatus = optionAvailabilityStatus;
	}

	public CorporateActionEvent getCorporateActionEvent() {
		return corporateActionEvent;
	}

	public void setCorporateActionEvent(com.tools20022.repository.entity.CorporateActionEvent corporateActionEvent) {
		this.corporateActionEvent = corporateActionEvent;
	}

	public CorporateActionEventStatusCode getEventStatus() {
		return eventStatus;
	}

	public void setEventStatus(CorporateActionEventStatusCode eventStatus) {
		this.eventStatus = eventStatus;
	}

	public CorporateActionProcessedStatusCode getRelatedInstructionProcessedStatus() {
		return relatedInstructionProcessedStatus;
	}

	public void setRelatedInstructionProcessedStatus(CorporateActionProcessedStatusCode relatedInstructionProcessedStatus) {
		this.relatedInstructionProcessedStatus = relatedInstructionProcessedStatus;
	}

	public ISODateTime getDeactivationDateAndTime() {
		return deactivationDateAndTime;
	}

	public void setDeactivationDateAndTime(ISODateTime deactivationDateAndTime) {
		this.deactivationDateAndTime = deactivationDateAndTime;
	}

	public EventConfirmationStatusCode getEventConfirmationStatus() {
		return eventConfirmationStatus;
	}

	public void setEventConfirmationStatus(EventConfirmationStatusCode eventConfirmationStatus) {
		this.eventConfirmationStatus = eventConfirmationStatus;
	}

	public EventCompletenessStatusCode getEventCompletenessStatus() {
		return eventCompletenessStatus;
	}

	public void setEventCompletenessStatus(EventCompletenessStatusCode eventCompletenessStatus) {
		this.eventCompletenessStatus = eventCompletenessStatus;
	}
}