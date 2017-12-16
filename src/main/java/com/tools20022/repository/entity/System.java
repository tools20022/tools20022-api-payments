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
import com.tools20022.repository.codeset.ISO2ALanguageCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.entity.RolePlayer;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.RolePlayer
 * RolePlayer}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.System#mmSystemIdentification
 * System.mmSystemIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.System#mmLocation
 * System.mmLocation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.System#mmReconciliation
 * System.mmReconciliation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.System#mmAvailability
 * System.mmAvailability}</li>
 * <li>{@linkplain com.tools20022.repository.entity.System#mmEvent
 * System.mmEvent}</li>
 * <li>{@linkplain com.tools20022.repository.entity.System#mmPartyRole
 * System.mmPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.System#mmStatus
 * System.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.System#mmSystemGeneratedInformation
 * System.mmSystemGeneratedInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.System#mmVersionValidityPeriod
 * System.mmVersionValidityPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.System#mmSystemDateTime
 * System.mmSystemDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.entity.System#mmNegotiation
 * System.mmNegotiation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.System#mmAccount
 * System.mmAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.System#mmTrade
 * System.mmTrade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.System#mmAssessment
 * System.mmAssessment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.System#mmTradesPosition
 * System.mmTradesPosition}</li>
 * <li>{@linkplain com.tools20022.repository.entity.System#mmSystemLanguage
 * System.mmSystemLanguage}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmSystem
 * Account.mmSystem}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Location#mmSystem
 * Location.mmSystem}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#mmSystem
 * Trade.mmSystem}</li>
 * <li>{@linkplain com.tools20022.repository.entity.DateTimePeriod#mmSystem
 * DateTimePeriod.mmSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemIdentification#mmIdentificationForSystem
 * SystemIdentification.mmIdentificationForSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemPartyRole#mmRelatedSystem
 * SystemPartyRole.mmRelatedSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemEventInformation#mmSystem
 * SystemEventInformation.mmSystem}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SystemStatus#mmSystem
 * SystemStatus.mmSystem}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SystemAvailability#mmSystem
 * SystemAvailability.mmSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemBusinessInformation#mmSystem
 * SystemBusinessInformation.mmSystem}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Negotiation#mmTradingSystem
 * Negotiation.mmTradingSystem}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Reconciliation#mmSystem
 * Reconciliation.mmSystem}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Assessment#mmSystem
 * Assessment.mmSystem}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Position#mmSystem
 * Position.mmSystem}</li>
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
 * "System"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of integrated applications that provides centralised services such as clearing, netting, reconciliation, trading and/or settlement."
 * </li>
 * </ul>
 */
public class System extends RolePlayer {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected SystemIdentification systemIdentification;
	/**
	 * Identification of the system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SystemIdentification#mmIdentificationForSystem
	 * SystemIdentification.mmIdentificationForSystem}</li>
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
	public static final MMBusinessAssociationEnd mmSystemIdentification = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.System.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SystemIdentification";
			definition = "Identification of the system.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SystemIdentification.mmIdentificationForSystem;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SystemIdentification.mmObject();
		}
	};
	protected Location location;
	/**
	 * Location, address and country in which the system is located.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Location#mmSystem
	 * Location.mmSystem}</li>
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
	public static final MMBusinessAssociationEnd mmLocation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.System.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Location";
			definition = "Location, address and country in which the system is located.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Location.mmSystem;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
		}
	};
	protected Reconciliation reconciliation;
	/**
	 * Reconciliation process provided by the system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Reconciliation#mmSystem
	 * Reconciliation.mmSystem}</li>
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
	public static final MMBusinessAssociationEnd mmReconciliation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.System.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reconciliation";
			definition = "Reconciliation process provided by the system.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Reconciliation.mmSystem;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Reconciliation.mmObject();
		}
	};
	protected SystemAvailability availability;
	/**
	 * Information about the activity or non-activity of the system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SystemAvailability#mmSystem
	 * SystemAvailability.mmSystem}</li>
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
	public static final MMBusinessAssociationEnd mmAvailability = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.System.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Availability";
			definition = "Information about the activity or non-activity of the system.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SystemAvailability.mmSystem;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SystemAvailability.mmObject();
		}
	};
	protected SystemEventInformation event;
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
	 * {@linkplain com.tools20022.repository.entity.SystemEventInformation#mmSystem
	 * SystemEventInformation.mmSystem}</li>
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
	public static final MMBusinessAssociationEnd mmEvent = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.System.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Event";
			definition = "Specific point in time associated with the system's processing cycle. Operations of a system are composed of a series of processes, the closing, or completion, of which constitutes an event with an associated time stamp. An event may have a series of time stamps associated with it, such as the scheduled and effective completion times.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SystemEventInformation.mmSystem;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SystemEventInformation.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SystemPartyRole> partyRole;
	/**
	 * Specifies each role linked to a system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SystemPartyRole#mmRelatedSystem
	 * SystemPartyRole.mmRelatedSystem}</li>
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
	public static final MMBusinessAssociationEnd mmPartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.System.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies each role linked to a system.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SystemPartyRole.mmRelatedSystem;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SystemPartyRole.mmObject();
		}
	};
	protected SystemStatus status;
	/**
	 * Status of the system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SystemStatus#mmSystem
	 * SystemStatus.mmSystem}</li>
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
	public static final MMBusinessAssociationEnd mmStatus = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.System.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Status of the system.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SystemStatus.mmSystem;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SystemStatus.mmObject();
		}
	};
	protected SystemBusinessInformation systemGeneratedInformation;
	/**
	 * Business details provided for an information system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SystemBusinessInformation#mmSystem
	 * SystemBusinessInformation.mmSystem}</li>
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
	public static final MMBusinessAssociationEnd mmSystemGeneratedInformation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.System.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SystemGeneratedInformation";
			definition = "Business details provided for an information system.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SystemBusinessInformation.mmSystem;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SystemBusinessInformation.mmObject();
		}
	};
	protected DateTimePeriod versionValidityPeriod;
	/**
	 * Date at, or period of time during which, the stipulated version is in
	 * effect.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmSystem
	 * DateTimePeriod.mmSystem}</li>
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
	public static final MMBusinessAssociationEnd mmVersionValidityPeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.System.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VersionValidityPeriod";
			definition = "Date at, or period of time during which, the stipulated version is in effect.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmSystem;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected ISODateTime systemDateTime;
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
	public static final MMBusinessAttribute mmSystemDateTime = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.System.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SystemDateTime";
			definition = "Date time of a system performing a task.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return System.class.getMethod("getSystemDateTime", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Negotiation negotiation;
	/**
	 * Negotiation process which uses a ssystem.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Negotiation#mmTradingSystem
	 * Negotiation.mmTradingSystem}</li>
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
	public static final MMBusinessAssociationEnd mmNegotiation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.System.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Negotiation";
			definition = "Negotiation process which uses a ssystem.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Negotiation.mmTradingSystem;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Negotiation.mmObject();
		}
	};
	protected Account account;
	/**
	 * Account managed by a system and held by a system member.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmSystem
	 * Account.mmSystem}</li>
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
	public static final MMBusinessAssociationEnd mmAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.System.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Account";
			definition = "Account managed by a system and held by a system member.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Account.mmSystem;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
		}
	};
	protected Trade trade;
	/**
	 * Trade processed by a system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Trade#mmSystem
	 * Trade.mmSystem}</li>
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
	public static final MMBusinessAssociationEnd mmTrade = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.System.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Trade";
			definition = "Trade processed by a system.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Trade.mmSystem;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
		}
	};
	protected Assessment assessment;
	/**
	 * Assessment associated with a system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Assessment#mmSystem
	 * Assessment.mmSystem}</li>
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
	public static final MMBusinessAssociationEnd mmAssessment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.System.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Assessment";
			definition = "Assessment associated with a system.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Assessment.mmSystem;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Assessment.mmObject();
		}
	};
	protected Position tradesPosition;
	/**
	 * Specifies the status of trades and their value inside a system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Position#mmSystem
	 * Position.mmSystem}</li>
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
	public static final MMBusinessAssociationEnd mmTradesPosition = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.System.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradesPosition";
			definition = "Specifies the status of trades and their value inside a system.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Position.mmSystem;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Position.mmObject();
		}
	};
	protected ISO2ALanguageCode systemLanguage;
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
	public static final MMBusinessAttribute mmSystemLanguage = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.System.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemLanguage";
			definition = "Specifies the language used by the system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISO2ALanguageCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return System.class.getMethod("getSystemLanguage", new Class[]{});
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
				name = "System";
				definition = "Set of integrated applications that provides centralised services such as clearing, netting, reconciliation, trading and/or settlement.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Account.mmSystem, com.tools20022.repository.entity.Location.mmSystem, com.tools20022.repository.entity.Trade.mmSystem,
						com.tools20022.repository.entity.DateTimePeriod.mmSystem, com.tools20022.repository.entity.SystemIdentification.mmIdentificationForSystem, com.tools20022.repository.entity.SystemPartyRole.mmRelatedSystem,
						com.tools20022.repository.entity.SystemEventInformation.mmSystem, com.tools20022.repository.entity.SystemStatus.mmSystem, com.tools20022.repository.entity.SystemAvailability.mmSystem,
						com.tools20022.repository.entity.SystemBusinessInformation.mmSystem, com.tools20022.repository.entity.Negotiation.mmTradingSystem, com.tools20022.repository.entity.Reconciliation.mmSystem,
						com.tools20022.repository.entity.Assessment.mmSystem, com.tools20022.repository.entity.Position.mmSystem);
				subType_lazy = () -> Arrays.asList(ClearingSystem.mmObject(), SecuritiesSettlementSystem.mmObject(), PointOfInteraction.mmObject(), TerminalManagementSystem.mmObject());
				superType_lazy = () -> RolePlayer.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.System.mmSystemIdentification, com.tools20022.repository.entity.System.mmLocation, com.tools20022.repository.entity.System.mmReconciliation,
						com.tools20022.repository.entity.System.mmAvailability, com.tools20022.repository.entity.System.mmEvent, com.tools20022.repository.entity.System.mmPartyRole, com.tools20022.repository.entity.System.mmStatus,
						com.tools20022.repository.entity.System.mmSystemGeneratedInformation, com.tools20022.repository.entity.System.mmVersionValidityPeriod, com.tools20022.repository.entity.System.mmSystemDateTime,
						com.tools20022.repository.entity.System.mmNegotiation, com.tools20022.repository.entity.System.mmAccount, com.tools20022.repository.entity.System.mmTrade, com.tools20022.repository.entity.System.mmAssessment,
						com.tools20022.repository.entity.System.mmTradesPosition, com.tools20022.repository.entity.System.mmSystemLanguage);
			}

			@Override
			public Class<?> getInstanceClass() {
				return System.class;
			}
		});
		return mmObject_lazy.get();
	}

	public SystemIdentification getSystemIdentification() {
		return systemIdentification;
	}

	public void setSystemIdentification(com.tools20022.repository.entity.SystemIdentification systemIdentification) {
		this.systemIdentification = systemIdentification;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(com.tools20022.repository.entity.Location location) {
		this.location = location;
	}

	public Reconciliation getReconciliation() {
		return reconciliation;
	}

	public void setReconciliation(com.tools20022.repository.entity.Reconciliation reconciliation) {
		this.reconciliation = reconciliation;
	}

	public SystemAvailability getAvailability() {
		return availability;
	}

	public void setAvailability(com.tools20022.repository.entity.SystemAvailability availability) {
		this.availability = availability;
	}

	public SystemEventInformation getEvent() {
		return event;
	}

	public void setEvent(com.tools20022.repository.entity.SystemEventInformation event) {
		this.event = event;
	}

	public List<SystemPartyRole> getPartyRole() {
		return partyRole;
	}

	public void setPartyRole(List<com.tools20022.repository.entity.SystemPartyRole> partyRole) {
		this.partyRole = partyRole;
	}

	public SystemStatus getStatus() {
		return status;
	}

	public void setStatus(com.tools20022.repository.entity.SystemStatus status) {
		this.status = status;
	}

	public SystemBusinessInformation getSystemGeneratedInformation() {
		return systemGeneratedInformation;
	}

	public void setSystemGeneratedInformation(com.tools20022.repository.entity.SystemBusinessInformation systemGeneratedInformation) {
		this.systemGeneratedInformation = systemGeneratedInformation;
	}

	public DateTimePeriod getVersionValidityPeriod() {
		return versionValidityPeriod;
	}

	public void setVersionValidityPeriod(com.tools20022.repository.entity.DateTimePeriod versionValidityPeriod) {
		this.versionValidityPeriod = versionValidityPeriod;
	}

	public ISODateTime getSystemDateTime() {
		return systemDateTime;
	}

	public void setSystemDateTime(ISODateTime systemDateTime) {
		this.systemDateTime = systemDateTime;
	}

	public Negotiation getNegotiation() {
		return negotiation;
	}

	public void setNegotiation(com.tools20022.repository.entity.Negotiation negotiation) {
		this.negotiation = negotiation;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(com.tools20022.repository.entity.Account account) {
		this.account = account;
	}

	public Trade getTrade() {
		return trade;
	}

	public void setTrade(com.tools20022.repository.entity.Trade trade) {
		this.trade = trade;
	}

	public Assessment getAssessment() {
		return assessment;
	}

	public void setAssessment(com.tools20022.repository.entity.Assessment assessment) {
		this.assessment = assessment;
	}

	public Position getTradesPosition() {
		return tradesPosition;
	}

	public void setTradesPosition(com.tools20022.repository.entity.Position tradesPosition) {
		this.tradesPosition = tradesPosition;
	}

	public ISO2ALanguageCode getSystemLanguage() {
		return systemLanguage;
	}

	public void setSystemLanguage(ISO2ALanguageCode systemLanguage) {
		this.systemLanguage = systemLanguage;
	}
}