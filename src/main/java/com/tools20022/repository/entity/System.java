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
import com.tools20022.repository.codeset.ISO2ALanguageCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.entity.RolePlayer;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Set of integrated applications that provides centralised services such as
 * clearing, netting, reconciliation, trading and/or settlement.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="System" src="doc-files/System.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.System#SystemIdentification
 * System.SystemIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.System#Location
 * System.Location}</li>
 * <li>{@linkplain com.tools20022.repository.entity.System#Reconciliation
 * System.Reconciliation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.System#Availability
 * System.Availability}</li>
 * <li>{@linkplain com.tools20022.repository.entity.System#Event System.Event}</li>
 * <li>{@linkplain com.tools20022.repository.entity.System#PartyRole
 * System.PartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.System#Status System.Status}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.System#SystemGeneratedInformation
 * System.SystemGeneratedInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.System#VersionValidityPeriod
 * System.VersionValidityPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.System#SystemDateTime
 * System.SystemDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.entity.System#Negotiation
 * System.Negotiation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.System#Account
 * System.Account}</li>
 * <li>{@linkplain com.tools20022.repository.entity.System#Trade System.Trade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.System#Assessment
 * System.Assessment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.System#TradesPosition
 * System.TradesPosition}</li>
 * <li>{@linkplain com.tools20022.repository.entity.System#SystemLanguage
 * System.SystemLanguage}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Account#System
 * Account.System}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Location#System
 * Location.System}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#System Trade.System}</li>
 * <li>{@linkplain com.tools20022.repository.entity.DateTimePeriod#System
 * DateTimePeriod.System}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemIdentification#IdentificationForSystem
 * SystemIdentification.IdentificationForSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemPartyRole#RelatedSystem
 * SystemPartyRole.RelatedSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemEventInformation#System
 * SystemEventInformation.System}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SystemStatus#System
 * SystemStatus.System}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SystemAvailability#System
 * SystemAvailability.System}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemBusinessInformation#System
 * SystemBusinessInformation.System}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Negotiation#TradingSystem
 * Negotiation.TradingSystem}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Reconciliation#System
 * Reconciliation.System}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Assessment#System
 * Assessment.System}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Position#System
 * Position.System}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.ClearingSystem
 * ClearingSystem}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesSettlementSystem
 * SecuritiesSettlementSystem}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PointOfInteraction
 * PointOfInteraction}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TerminalManagementSystem
 * TerminalManagementSystem}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.RolePlayer
 * RolePlayer}</li>
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
 * "System"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of integrated applications that provides centralised services such as clearing, netting, reconciliation, trading and/or settlement."
 * </li>
 * </ul>
 */
public class System extends RolePlayer {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Identification of the system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SystemIdentification#IdentificationForSystem
	 * SystemIdentification.IdentificationForSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SystemIdentification
	 * SystemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.System
	 * System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the system."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SystemIdentification = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> System.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SystemIdentification";
			definition = "Identification of the system.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SystemIdentification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SystemIdentification.IdentificationForSystem;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Location, address and country in which the system is located.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Location#System
	 * Location.System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Location Location}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.System
	 * System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Location"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Location, address and country in which the system is located."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Location = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> System.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Location";
			definition = "Location, address and country in which the system is located.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Location.System;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Reconciliation process provided by the system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Reconciliation#System
	 * Reconciliation.System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Reconciliation
	 * Reconciliation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.System
	 * System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reconciliation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reconciliation process provided by the system."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Reconciliation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> System.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reconciliation";
			definition = "Reconciliation process provided by the system.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Reconciliation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Reconciliation.System;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Information about the activity or non-activity of the system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SystemAvailability#System
	 * SystemAvailability.System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SystemAvailability
	 * SystemAvailability}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.System
	 * System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Availability"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information about the activity or non-activity of the system."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Availability = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> System.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Availability";
			definition = "Information about the activity or non-activity of the system.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SystemAvailability.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SystemAvailability.System;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specific point in time associated with the system's processing cycle.
	 * Operations of a system are composed of a series of processes, the
	 * closing, or completion, of which constitutes an event with an associated
	 * time stamp. An event may have a series of time stamps associated with it,
	 * such as the scheduled and effective completion times.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SystemEventInformation#System
	 * SystemEventInformation.System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SystemEventInformation
	 * SystemEventInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.System
	 * System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Event"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specific point in time associated with the system's processing cycle. Operations of a system are composed of a series of processes, the closing, or completion, of which constitutes an event with an associated time stamp. An event may have a series of time stamps associated with it, such as the scheduled and effective completion times."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Event = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> System.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Event";
			definition = "Specific point in time associated with the system's processing cycle. Operations of a system are composed of a series of processes, the closing, or completion, of which constitutes an event with an associated time stamp. An event may have a series of time stamps associated with it, such as the scheduled and effective completion times.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SystemEventInformation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SystemEventInformation.System;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies each role linked to a system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SystemPartyRole#RelatedSystem
	 * SystemPartyRole.RelatedSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SystemPartyRole
	 * SystemPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.System
	 * System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies each role linked to a system."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> System.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies each role linked to a system.";
			minOccurs = 0;
			type_lazy = () -> SystemPartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SystemPartyRole.RelatedSystem;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Status of the system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SystemStatus#System
	 * SystemStatus.System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SystemStatus
	 * SystemStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.System
	 * System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the system."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Status = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> System.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Status of the system.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SystemStatus.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SystemStatus.System;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Business details provided for an information system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SystemBusinessInformation#System
	 * SystemBusinessInformation.System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SystemBusinessInformation
	 * SystemBusinessInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.System
	 * System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemGeneratedInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Business details provided for an information system."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SystemGeneratedInformation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> System.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SystemGeneratedInformation";
			definition = "Business details provided for an information system.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SystemBusinessInformation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SystemBusinessInformation.System;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Date at, or period of time during which, the stipulated version is in
	 * effect.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#System
	 * DateTimePeriod.System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.System
	 * System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VersionValidityPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date at, or period of time during which, the stipulated version is in effect."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd VersionValidityPeriod = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> System.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VersionValidityPeriod";
			definition = "Date at, or period of time during which, the stipulated version is in effect.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.System;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Date time of a system performing a task.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.System
	 * System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date time of a system performing a task."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SystemDateTime = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> System.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SystemDateTime";
			definition = "Date time of a system performing a task.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Negotiation process which uses a ssystem.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Negotiation#TradingSystem
	 * Negotiation.TradingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Negotiation
	 * Negotiation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.System
	 * System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Negotiation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Negotiation process which uses a ssystem."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Negotiation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> System.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Negotiation";
			definition = "Negotiation process which uses a ssystem.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Negotiation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Negotiation.TradingSystem;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Account managed by a system and held by a system member.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Account#System
	 * Account.System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Account Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.System
	 * System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account managed by a system and held by a system member."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Account = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> System.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Account";
			definition = "Account managed by a system and held by a system member.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Account.System;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Trade processed by a system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Trade#System
	 * Trade.System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Trade Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.System
	 * System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Trade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade processed by a system."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Trade = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> System.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Trade";
			definition = "Trade processed by a system.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Trade.System;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Assessment associated with a system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Assessment#System
	 * Assessment.System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Assessment
	 * Assessment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.System
	 * System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Assessment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Assessment associated with a system."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Assessment = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> System.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Assessment";
			definition = "Assessment associated with a system.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Assessment.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Assessment.System;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the status of trades and their value inside a system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Position#System
	 * Position.System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Position Position}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.System
	 * System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradesPosition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the status of trades and their value inside a system."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TradesPosition = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> System.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradesPosition";
			definition = "Specifies the status of trades and their value inside a system.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Position.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Position.System;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the language used by the system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ISO2ALanguageCode
	 * ISO2ALanguageCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.System
	 * System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemLanguage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the language used by the system."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SystemLanguage = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> System.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemLanguage";
			definition = "Specifies the language used by the system.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISO2ALanguageCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "System";
				definition = "Set of integrated applications that provides centralised services such as clearing, netting, reconciliation, trading and/or settlement.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Account.System, com.tools20022.repository.entity.Location.System, com.tools20022.repository.entity.Trade.System,
						com.tools20022.repository.entity.DateTimePeriod.System, com.tools20022.repository.entity.SystemIdentification.IdentificationForSystem, com.tools20022.repository.entity.SystemPartyRole.RelatedSystem,
						com.tools20022.repository.entity.SystemEventInformation.System, com.tools20022.repository.entity.SystemStatus.System, com.tools20022.repository.entity.SystemAvailability.System,
						com.tools20022.repository.entity.SystemBusinessInformation.System, com.tools20022.repository.entity.Negotiation.TradingSystem, com.tools20022.repository.entity.Reconciliation.System,
						com.tools20022.repository.entity.Assessment.System, com.tools20022.repository.entity.Position.System);
				subType_lazy = () -> Arrays.asList(ClearingSystem.mmObject(), SecuritiesSettlementSystem.mmObject(), PointOfInteraction.mmObject(), TerminalManagementSystem.mmObject());
				superType_lazy = () -> RolePlayer.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.System.SystemIdentification, com.tools20022.repository.entity.System.Location, com.tools20022.repository.entity.System.Reconciliation,
						com.tools20022.repository.entity.System.Availability, com.tools20022.repository.entity.System.Event, com.tools20022.repository.entity.System.PartyRole, com.tools20022.repository.entity.System.Status,
						com.tools20022.repository.entity.System.SystemGeneratedInformation, com.tools20022.repository.entity.System.VersionValidityPeriod, com.tools20022.repository.entity.System.SystemDateTime,
						com.tools20022.repository.entity.System.Negotiation, com.tools20022.repository.entity.System.Account, com.tools20022.repository.entity.System.Trade, com.tools20022.repository.entity.System.Assessment,
						com.tools20022.repository.entity.System.TradesPosition, com.tools20022.repository.entity.System.SystemLanguage);
			}
		});
		return mmObject_lazy.get();
	}
}