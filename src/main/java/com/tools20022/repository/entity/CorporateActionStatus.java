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
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.entity.Status;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#AgentStandingInstructionStatus
 * CorporateActionStatus.AgentStandingInstructionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#ProcessingStatus
 * CorporateActionStatus.ProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#EventProcessingStatus
 * CorporateActionStatus.EventProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#CorporateActionStatusReason
 * CorporateActionStatus.CorporateActionStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#InstructionCancellationStatus
 * CorporateActionStatus.InstructionCancellationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#CorporateActionInstructionProcessingStatus
 * CorporateActionStatus.CorporateActionInstructionProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#RateStatus
 * CorporateActionStatus.RateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#OptionAvailabilityStatus
 * CorporateActionStatus.OptionAvailabilityStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#CorporateActionEvent
 * CorporateActionStatus.CorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#EventStatus
 * CorporateActionStatus.EventStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#RelatedInstructionProcessedStatus
 * CorporateActionStatus.RelatedInstructionProcessedStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#DeactivationDateAndTime
 * CorporateActionStatus.DeactivationDateAndTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#EventConfirmationStatus
 * CorporateActionStatus.EventConfirmationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#EventCompletenessStatus
 * CorporateActionStatus.EventCompletenessStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason#CorporateActionStatus
 * CorporateActionStatusReason.CorporateActionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#CorporateActionStatus
 * CorporateActionEvent.CorporateActionStatus}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Status Status}</li>
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
 * "CorporateActionStatus"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Status of the corporate action process."</li>
 * </ul>
 */
public class CorporateActionStatus extends Status {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
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
	public static final MMBusinessAttribute AgentStandingInstructionStatus = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AgentStandingInstructionStatus";
			definition = "Specifies the state or the condition.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
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
	public static final MMBusinessAttribute ProcessingStatus = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProcessingStatus";
			definition = "Specifies the status of the details of the event.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ProcessingStatusCode.mmObject();
		}
	};
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
	public static final MMBusinessAttribute EventProcessingStatus = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EventProcessingStatus";
			definition = "Processing status of the corporate action event.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CorporateActionEventProcessingStatusCode.mmObject();
		}
	};
	/**
	 * Specifies the reasons for the status. It is derived from the relationship
	 * between Status and Status Reason.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason#CorporateActionStatus
	 * CorporateActionStatusReason.CorporateActionStatus}</li>
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
	public static final MMBusinessAssociationEnd CorporateActionStatusReason = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionStatusReason";
			definition = "Specifies the reasons for the status. It is derived from the relationship between Status and Status Reason.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionStatusReason.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionStatusReason.CorporateActionStatus;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	public static final MMBusinessAttribute InstructionCancellationStatus = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InstructionCancellationStatus";
			definition = "Status of the instruction cancellation process.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CorporateActionInstructionCancellationProcessingStatusCode.mmObject();
		}
	};
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
	public static final MMBusinessAttribute CorporateActionInstructionProcessingStatus = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionInstructionProcessingStatus";
			definition = "Status of the corporate action instruction process.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CorporateActionInstructionProcessingStatusCode.mmObject();
		}
	};
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
	public static final MMBusinessAttribute RateStatus = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RateStatus";
			definition = "Specifies whether the rate is indicative or actual.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> RateStatusCode.mmObject();
		}
	};
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
	public static final MMBusinessAttribute OptionAvailabilityStatus = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OptionAvailabilityStatus";
			definition = "Availability status of the option.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> OptionAvailabilityStatusCode.mmObject();
		}
	};
	/**
	 * Corporate event for which a status is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#CorporateActionStatus
	 * CorporateActionEvent.CorporateActionStatus}</li>
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
	public static final MMBusinessAssociationEnd CorporateActionEvent = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionEvent";
			definition = "Corporate event for which a status is provided.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.CorporateActionStatus;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	public static final MMBusinessAttribute EventStatus = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EventStatus";
			definition = "Status of the corporate action event.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CorporateActionEventStatusCode.mmObject();
		}
	};
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
	public static final MMBusinessAttribute RelatedInstructionProcessedStatus = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInstructionProcessedStatus";
			definition = "Information on the status of the processing of an instruction related to a corporate action.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CorporateActionProcessedStatusCode.mmObject();
		}
	};
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
	public static final MMBusinessAttribute DeactivationDateAndTime = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DeactivationDateAndTime";
			definition = "Date and time at which the the corporate action event or the option is deactivated.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
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
	public static final MMBusinessAttribute EventConfirmationStatus = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EventConfirmationStatus";
			definition = "Indicates the status of the occurrence of an event.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> EventConfirmationStatusCode.mmObject();
		}
	};
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
	public static final MMBusinessAttribute EventCompletenessStatus = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EventCompletenessStatus";
			definition = "Indicates whether the details provided about an event are complete or incomplete.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> EventCompletenessStatusCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionStatus";
				definition = "Status of the corporate action process.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionStatusReason.CorporateActionStatus, com.tools20022.repository.entity.CorporateActionEvent.CorporateActionStatus);
				superType_lazy = () -> Status.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionStatus.AgentStandingInstructionStatus, com.tools20022.repository.entity.CorporateActionStatus.ProcessingStatus,
						com.tools20022.repository.entity.CorporateActionStatus.EventProcessingStatus, com.tools20022.repository.entity.CorporateActionStatus.CorporateActionStatusReason,
						com.tools20022.repository.entity.CorporateActionStatus.InstructionCancellationStatus, com.tools20022.repository.entity.CorporateActionStatus.CorporateActionInstructionProcessingStatus,
						com.tools20022.repository.entity.CorporateActionStatus.RateStatus, com.tools20022.repository.entity.CorporateActionStatus.OptionAvailabilityStatus,
						com.tools20022.repository.entity.CorporateActionStatus.CorporateActionEvent, com.tools20022.repository.entity.CorporateActionStatus.EventStatus,
						com.tools20022.repository.entity.CorporateActionStatus.RelatedInstructionProcessedStatus, com.tools20022.repository.entity.CorporateActionStatus.DeactivationDateAndTime,
						com.tools20022.repository.entity.CorporateActionStatus.EventConfirmationStatus, com.tools20022.repository.entity.CorporateActionStatus.EventCompletenessStatus);
			}
		});
		return mmObject_lazy.get();
	}
}