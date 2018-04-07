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
import com.tools20022.repository.choice.CommunicationMethod2Choice;
import com.tools20022.repository.choice.ResidenceLocation1Choice;
import com.tools20022.repository.datatype.AnyBICIdentifier;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Number, physical or virtual address, used for communication.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="ContactPoint" src="doc-files/ContactPoint.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmIdentification
 * ContactPoint.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmRelatedInvestmentFund
 * ContactPoint.mmRelatedInvestmentFund}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ContactPoint#mmBICAddress
 * ContactPoint.mmBICAddress}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ContactPoint#mmRelatedParty
 * ContactPoint.mmRelatedParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmRelatedCorporateActionEvent
 * ContactPoint.mmRelatedCorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmRelatedReportingService
 * ContactPoint.mmRelatedReportingService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmStoredDocument
 * ContactPoint.mmStoredDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmRemittanceRelatedPayment
 * ContactPoint.mmRemittanceRelatedPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmRelatedProxyAppointment
 * ContactPoint.mmRelatedProxyAppointment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmContactPointForMeeting
 * ContactPoint.mmContactPointForMeeting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmContactPointForVote
 * ContactPoint.mmContactPointForVote}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ContactPoint#mmMainContact
 * ContactPoint.mmMainContact}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmReturnAddress
 * ContactPoint.mmReturnAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmRelatedPayment
 * ContactPoint.mmRelatedPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmTemporaryIndicator
 * ContactPoint.mmTemporaryIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmDeliveredAttendanceCard
 * ContactPoint.mmDeliveredAttendanceCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmInvestmentFundClassProcessing
 * ContactPoint.mmInvestmentFundClassProcessing}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentificationForContactPoint
 * GenericIdentification.mmIdentificationForContactPoint}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentFund#mmOrderDesk
 * InvestmentFund.mmOrderDesk}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmLocalMarketAnnex
 * InvestmentFundClassProcessingCharacteristics.mmLocalMarketAnnex}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#mmContactPoint
 * Party.mmContactPoint}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ContactPoint#mmMainContact
 * ContactPoint.mmMainContact}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmReturnAddress
 * ContactPoint.mmReturnAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ReportingService#mmReportingChannel
 * ReportingService.mmReportingChannel}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmPlaceOfStorage
 * Document.mmPlaceOfStorage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmRemittanceLocation
 * PaymentObligation.mmRemittanceLocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#mmContactPoint
 * PaymentProcessing.mmContactPoint}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmDocumentationLocation
 * CorporateActionEvent.mmDocumentationLocation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#mmMeetingLocation
 * Meeting.mmMeetingLocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProxyAppointmentCondition#mmNotificationAddress
 * ProxyAppointmentCondition.mmNotificationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VotingCondition#mmVoteLocation
 * VotingCondition.mmVoteLocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AttendanceCard#mmDeliveryPlace
 * AttendanceCard.mmDeliveryPlace}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceLocation2#mmRemittanceLocationElectronicAddress
 * RemittanceLocation2.mmRemittanceLocationElectronicAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceLocation3#mmRemittanceLocationDetails
 * RemittanceLocation3.mmRemittanceLocationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceLocation4#mmRemittanceLocationDetails
 * RemittanceLocation4.mmRemittanceLocationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation20#mmRepresentativeOfficer
 * Organisation20.mmRepresentativeOfficer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson19#mmPrimaryCommunicationAddress
 * IndividualPerson19.mmPrimaryCommunicationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson19#mmSecondaryCommunicationAddress
 * IndividualPerson19.mmSecondaryCommunicationAddress}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.PhoneAddress PhoneAddress}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ElectronicAddress
 * ElectronicAddress}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CommunicationAddress3
 * CommunicationAddress3}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CommunicationMethod2Choice
 * CommunicationMethod2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RemittanceLocation2
 * RemittanceLocation2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherContact1 OtherContact1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ResidenceLocation1Choice
 * ResidenceLocation1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RemittanceLocation3
 * RemittanceLocation3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RemittanceLocationDetails1
 * RemittanceLocationDetails1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RemittanceLocation4
 * RemittanceLocation4}</li>
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
 * "ContactPoint"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Number, physical or virtual address, used for communication."</li>
 * </ul>
 */
public class ContactPoint {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected GenericIdentification identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentificationForContactPoint
	 * GenericIdentification.mmIdentificationForContactPoint}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherContact1#mmIdentification
	 * OtherContact1.mmIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint ContactPoint}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of a contact point."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<ContactPoint, GenericIdentification> mmIdentification = new MMBusinessAssociationEnd<ContactPoint, GenericIdentification>() {
		{
			derivation_lazy = () -> Arrays.asList(OtherContact1.mmIdentification);
			isDerived = false;
			elementContext_lazy = () -> ContactPoint.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Identification of a contact point.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> GenericIdentification.mmIdentificationForContactPoint;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> GenericIdentification.mmObject();
		}

		@Override
		public GenericIdentification getValue(ContactPoint obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(ContactPoint obj, GenericIdentification value) {
			obj.setIdentification(value);
		}
	};
	protected InvestmentFund relatedInvestmentFund;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFund#mmOrderDesk
	 * InvestmentFund.mmOrderDesk}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentFund
	 * InvestmentFund}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint ContactPoint}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedInvestmentFund"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment fund class for which an order desk is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<ContactPoint, InvestmentFund> mmRelatedInvestmentFund = new MMBusinessAssociationEnd<ContactPoint, InvestmentFund>() {
		{
			isDerived = false;
			elementContext_lazy = () -> ContactPoint.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedInvestmentFund";
			definition = "Investment fund class for which an order desk is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> InvestmentFund.mmOrderDesk;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> InvestmentFund.mmObject();
		}

		@Override
		public InvestmentFund getValue(ContactPoint obj) {
			return obj.getRelatedInvestmentFund();
		}

		@Override
		public void setValue(ContactPoint obj, InvestmentFund value) {
			obj.setRelatedInvestmentFund(value);
		}
	};
	protected AnyBICIdentifier bICAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.AnyBICIdentifier
	 * AnyBICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint ContactPoint}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BICAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "BIC address which identifies the contact point."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<ContactPoint, AnyBICIdentifier> mmBICAddress = new MMBusinessAttribute<ContactPoint, AnyBICIdentifier>() {
		{
			isDerived = false;
			elementContext_lazy = () -> ContactPoint.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BICAddress";
			definition = "BIC address which identifies the contact point.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AnyBICIdentifier.mmObject();
		}

		@Override
		public AnyBICIdentifier getValue(ContactPoint obj) {
			return obj.getBICAddress();
		}

		@Override
		public void setValue(ContactPoint obj, AnyBICIdentifier value) {
			obj.setBICAddress(value);
		}
	};
	protected Party relatedParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmContactPoint
	 * Party.mmContactPoint}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Party Party}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint ContactPoint}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party for which a contact point is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<ContactPoint, Optional<Party>> mmRelatedParty = new MMBusinessAssociationEnd<ContactPoint, Optional<Party>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> ContactPoint.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedParty";
			definition = "Party for which a contact point is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Party.mmContactPoint;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Party.mmObject();
		}

		@Override
		public Optional<Party> getValue(ContactPoint obj) {
			return obj.getRelatedParty();
		}

		@Override
		public void setValue(ContactPoint obj, Optional<Party> value) {
			obj.setRelatedParty(value.orElse(null));
		}
	};
	protected CorporateActionEvent relatedCorporateActionEvent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmDocumentationLocation
	 * CorporateActionEvent.mmDocumentationLocation}</li>
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
	 * {@linkplain com.tools20022.repository.entity.ContactPoint ContactPoint}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCorporateActionEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action event for which the documentation location is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<ContactPoint, Optional<CorporateActionEvent>> mmRelatedCorporateActionEvent = new MMBusinessAssociationEnd<ContactPoint, Optional<CorporateActionEvent>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> ContactPoint.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedCorporateActionEvent";
			definition = "Corporate action event for which the documentation location is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> CorporateActionEvent.mmDocumentationLocation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CorporateActionEvent.mmObject();
		}

		@Override
		public Optional<CorporateActionEvent> getValue(ContactPoint obj) {
			return obj.getRelatedCorporateActionEvent();
		}

		@Override
		public void setValue(ContactPoint obj, Optional<CorporateActionEvent> value) {
			obj.setRelatedCorporateActionEvent(value.orElse(null));
		}
	};
	protected ReportingService relatedReportingService;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ReportingService#mmReportingChannel
	 * ReportingService.mmReportingChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ReportingService
	 * ReportingService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint ContactPoint}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedReportingService"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reporting service for which a contact point is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<ContactPoint, Optional<ReportingService>> mmRelatedReportingService = new MMBusinessAssociationEnd<ContactPoint, Optional<ReportingService>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> ContactPoint.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedReportingService";
			definition = "Reporting service for which a contact point is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> ReportingService.mmReportingChannel;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ReportingService.mmObject();
		}

		@Override
		public Optional<ReportingService> getValue(ContactPoint obj) {
			return obj.getRelatedReportingService();
		}

		@Override
		public void setValue(ContactPoint obj, Optional<ReportingService> value) {
			obj.setRelatedReportingService(value.orElse(null));
		}
	};
	protected List<Document> storedDocument;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmPlaceOfStorage
	 * Document.mmPlaceOfStorage}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Document Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint ContactPoint}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StoredDocument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Document which is stored at a specific place."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<ContactPoint, List<Document>> mmStoredDocument = new MMBusinessAssociationEnd<ContactPoint, List<Document>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> ContactPoint.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StoredDocument";
			definition = "Document which is stored at a specific place.";
			minOccurs = 0;
			opposite_lazy = () -> Document.mmPlaceOfStorage;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Document.mmObject();
		}

		@Override
		public List<Document> getValue(ContactPoint obj) {
			return obj.getStoredDocument();
		}

		@Override
		public void setValue(ContactPoint obj, List<Document> value) {
			obj.setStoredDocument(value);
		}
	};
	protected PaymentObligation remittanceRelatedPayment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmRemittanceLocation
	 * PaymentObligation.mmRemittanceLocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint ContactPoint}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemittanceRelatedPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment for which a remittance location is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<ContactPoint, Optional<PaymentObligation>> mmRemittanceRelatedPayment = new MMBusinessAssociationEnd<ContactPoint, Optional<PaymentObligation>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> ContactPoint.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RemittanceRelatedPayment";
			definition = "Payment for which a remittance location is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> PaymentObligation.mmRemittanceLocation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PaymentObligation.mmObject();
		}

		@Override
		public Optional<PaymentObligation> getValue(ContactPoint obj) {
			return obj.getRemittanceRelatedPayment();
		}

		@Override
		public void setValue(ContactPoint obj, Optional<PaymentObligation> value) {
			obj.setRemittanceRelatedPayment(value.orElse(null));
		}
	};
	protected ProxyAppointmentCondition relatedProxyAppointment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProxyAppointmentCondition#mmNotificationAddress
	 * ProxyAppointmentCondition.mmNotificationAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.ProxyAppointmentCondition
	 * ProxyAppointmentCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint ContactPoint}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedProxyAppointment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Proxy appointment process for which a notification address is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<ContactPoint, Optional<ProxyAppointmentCondition>> mmRelatedProxyAppointment = new MMBusinessAssociationEnd<ContactPoint, Optional<ProxyAppointmentCondition>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> ContactPoint.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedProxyAppointment";
			definition = "Proxy appointment process for which a notification address is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> ProxyAppointmentCondition.mmNotificationAddress;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ProxyAppointmentCondition.mmObject();
		}

		@Override
		public Optional<ProxyAppointmentCondition> getValue(ContactPoint obj) {
			return obj.getRelatedProxyAppointment();
		}

		@Override
		public void setValue(ContactPoint obj, Optional<ProxyAppointmentCondition> value) {
			obj.setRelatedProxyAppointment(value.orElse(null));
		}
	};
	protected List<Meeting> contactPointForMeeting;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Meeting#mmMeetingLocation
	 * Meeting.mmMeetingLocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Meeting Meeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint ContactPoint}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContactPointForMeeting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Meeting which takes place at a specific place."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<ContactPoint, List<Meeting>> mmContactPointForMeeting = new MMBusinessAssociationEnd<ContactPoint, List<Meeting>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> ContactPoint.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ContactPointForMeeting";
			definition = "Meeting which takes place at a specific place.";
			minOccurs = 0;
			opposite_lazy = () -> Meeting.mmMeetingLocation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Meeting.mmObject();
		}

		@Override
		public List<Meeting> getValue(ContactPoint obj) {
			return obj.getContactPointForMeeting();
		}

		@Override
		public void setValue(ContactPoint obj, List<Meeting> value) {
			obj.setContactPointForMeeting(value);
		}
	};
	protected VotingCondition contactPointForVote;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.VotingCondition#mmVoteLocation
	 * VotingCondition.mmVoteLocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.VotingCondition
	 * VotingCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint ContactPoint}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContactPointForVote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Vote parameters which apply to a vote location."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<ContactPoint, Optional<VotingCondition>> mmContactPointForVote = new MMBusinessAssociationEnd<ContactPoint, Optional<VotingCondition>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> ContactPoint.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ContactPointForVote";
			definition = "Vote parameters which apply to a vote location.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> VotingCondition.mmVoteLocation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> VotingCondition.mmObject();
		}

		@Override
		public Optional<VotingCondition> getValue(ContactPoint obj) {
			return obj.getContactPointForVote();
		}

		@Override
		public void setValue(ContactPoint obj, Optional<VotingCondition> value) {
			obj.setContactPointForVote(value.orElse(null));
		}
	};
	protected ContactPoint mainContact;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmReturnAddress
	 * ContactPoint.mmReturnAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ContactPoint
	 * ContactPoint}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint ContactPoint}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MainContact"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Contact address used for normal operations."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<ContactPoint, ContactPoint> mmMainContact = new MMBusinessAssociationEnd<ContactPoint, ContactPoint>() {
		{
			isDerived = false;
			elementContext_lazy = () -> ContactPoint.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MainContact";
			definition = "Contact address used for normal operations.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> ContactPoint.mmReturnAddress;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ContactPoint.mmObject();
		}

		@Override
		public ContactPoint getValue(ContactPoint obj) {
			return obj.getMainContact();
		}

		@Override
		public void setValue(ContactPoint obj, ContactPoint value) {
			obj.setMainContact(value);
		}
	};
	protected ContactPoint returnAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmMainContact
	 * ContactPoint.mmMainContact}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ContactPoint
	 * ContactPoint}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint ContactPoint}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Physical/logical address, segregated from the main address that is used for normal operations. The return address is used to route messages that require specific attention/exception handling, eg, returns or rejects."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<ContactPoint, ContactPoint> mmReturnAddress = new MMBusinessAssociationEnd<ContactPoint, ContactPoint>() {
		{
			isDerived = false;
			elementContext_lazy = () -> ContactPoint.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReturnAddress";
			definition = "Physical/logical address, segregated from the main address that is used for normal operations. The return address is used to route messages that require specific attention/exception handling, eg, returns or rejects.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> ContactPoint.mmMainContact;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ContactPoint.mmObject();
		}

		@Override
		public ContactPoint getValue(ContactPoint obj) {
			return obj.getReturnAddress();
		}

		@Override
		public void setValue(ContactPoint obj, ContactPoint value) {
			obj.setReturnAddress(value);
		}
	};
	protected PaymentProcessing relatedPayment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#mmContactPoint
	 * PaymentProcessing.mmContactPoint}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentProcessing
	 * PaymentProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint ContactPoint}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment for which a notification method is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<ContactPoint, PaymentProcessing> mmRelatedPayment = new MMBusinessAssociationEnd<ContactPoint, PaymentProcessing>() {
		{
			isDerived = false;
			elementContext_lazy = () -> ContactPoint.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedPayment";
			definition = "Payment for which a notification method is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> PaymentProcessing.mmContactPoint;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PaymentProcessing.mmObject();
		}

		@Override
		public PaymentProcessing getValue(ContactPoint obj) {
			return obj.getRelatedPayment();
		}

		@Override
		public void setValue(ContactPoint obj, PaymentProcessing value) {
			obj.setRelatedPayment(value);
		}
	};
	protected YesNoIndicator temporaryIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint ContactPoint}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TemporaryIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the address is a temporary address."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<ContactPoint, YesNoIndicator> mmTemporaryIndicator = new MMBusinessAttribute<ContactPoint, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> ContactPoint.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TemporaryIndicator";
			definition = "Indicates whether the address is a temporary address.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(ContactPoint obj) {
			return obj.getTemporaryIndicator();
		}

		@Override
		public void setValue(ContactPoint obj, YesNoIndicator value) {
			obj.setTemporaryIndicator(value);
		}
	};
	protected AttendanceCard deliveredAttendanceCard;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AttendanceCard#mmDeliveryPlace
	 * AttendanceCard.mmDeliveryPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AttendanceCard
	 * AttendanceCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint ContactPoint}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveredAttendanceCard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Attendance card which is delivered at a specific location."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<ContactPoint, Optional<AttendanceCard>> mmDeliveredAttendanceCard = new MMBusinessAssociationEnd<ContactPoint, Optional<AttendanceCard>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> ContactPoint.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeliveredAttendanceCard";
			definition = "Attendance card which is delivered at a specific location.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> AttendanceCard.mmDeliveryPlace;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> AttendanceCard.mmObject();
		}

		@Override
		public Optional<AttendanceCard> getValue(ContactPoint obj) {
			return obj.getDeliveredAttendanceCard();
		}

		@Override
		public void setValue(ContactPoint obj, Optional<AttendanceCard> value) {
			obj.setDeliveredAttendanceCard(value.orElse(null));
		}
	};
	protected InvestmentFundClassProcessingCharacteristics investmentFundClassProcessing;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmLocalMarketAnnex
	 * InvestmentFundClassProcessingCharacteristics.mmLocalMarketAnnex}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint ContactPoint}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentFundClassProcessing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Processing characteristics of an investment fund class for which a local market annex is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<ContactPoint, InvestmentFundClassProcessingCharacteristics> mmInvestmentFundClassProcessing = new MMBusinessAssociationEnd<ContactPoint, InvestmentFundClassProcessingCharacteristics>() {
		{
			isDerived = false;
			elementContext_lazy = () -> ContactPoint.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundClassProcessing";
			definition = "Processing characteristics of an investment fund class for which a local market annex is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmLocalMarketAnnex;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
		}

		@Override
		public InvestmentFundClassProcessingCharacteristics getValue(ContactPoint obj) {
			return obj.getInvestmentFundClassProcessing();
		}

		@Override
		public void setValue(ContactPoint obj, InvestmentFundClassProcessingCharacteristics value) {
			obj.setInvestmentFundClassProcessing(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ContactPoint";
				definition = "Number, physical or virtual address, used for communication.";
				associationDomain_lazy = () -> Arrays.asList(GenericIdentification.mmIdentificationForContactPoint, InvestmentFund.mmOrderDesk, InvestmentFundClassProcessingCharacteristics.mmLocalMarketAnnex, Party.mmContactPoint,
						ContactPoint.mmMainContact, ContactPoint.mmReturnAddress, ReportingService.mmReportingChannel, Document.mmPlaceOfStorage, PaymentObligation.mmRemittanceLocation, PaymentProcessing.mmContactPoint,
						CorporateActionEvent.mmDocumentationLocation, Meeting.mmMeetingLocation, ProxyAppointmentCondition.mmNotificationAddress, VotingCondition.mmVoteLocation, AttendanceCard.mmDeliveryPlace);
				derivationElement_lazy = () -> Arrays.asList(RemittanceLocation2.mmRemittanceLocationElectronicAddress, RemittanceLocation3.mmRemittanceLocationDetails, RemittanceLocation4.mmRemittanceLocationDetails,
						Organisation20.mmRepresentativeOfficer, IndividualPerson19.mmPrimaryCommunicationAddress, IndividualPerson19.mmSecondaryCommunicationAddress);
				subType_lazy = () -> Arrays.asList(PostalAddress.mmObject(), PhoneAddress.mmObject(), ElectronicAddress.mmObject());
				element_lazy = () -> Arrays.asList(ContactPoint.mmIdentification, ContactPoint.mmRelatedInvestmentFund, ContactPoint.mmBICAddress, ContactPoint.mmRelatedParty, ContactPoint.mmRelatedCorporateActionEvent,
						ContactPoint.mmRelatedReportingService, ContactPoint.mmStoredDocument, ContactPoint.mmRemittanceRelatedPayment, ContactPoint.mmRelatedProxyAppointment, ContactPoint.mmContactPointForMeeting,
						ContactPoint.mmContactPointForVote, ContactPoint.mmMainContact, ContactPoint.mmReturnAddress, ContactPoint.mmRelatedPayment, ContactPoint.mmTemporaryIndicator, ContactPoint.mmDeliveredAttendanceCard,
						ContactPoint.mmInvestmentFundClassProcessing);
				derivationComponent_lazy = () -> Arrays.asList(CommunicationAddress3.mmObject(), CommunicationMethod2Choice.mmObject(), RemittanceLocation2.mmObject(), OtherContact1.mmObject(), ResidenceLocation1Choice.mmObject(),
						RemittanceLocation3.mmObject(), RemittanceLocationDetails1.mmObject(), RemittanceLocation4.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return ContactPoint.class;
			}
		});
		return mmObject_lazy.get();
	}

	public GenericIdentification getIdentification() {
		return identification;
	}

	public ContactPoint setIdentification(GenericIdentification identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public InvestmentFund getRelatedInvestmentFund() {
		return relatedInvestmentFund;
	}

	public ContactPoint setRelatedInvestmentFund(InvestmentFund relatedInvestmentFund) {
		this.relatedInvestmentFund = Objects.requireNonNull(relatedInvestmentFund);
		return this;
	}

	public AnyBICIdentifier getBICAddress() {
		return bICAddress;
	}

	public ContactPoint setBICAddress(AnyBICIdentifier bICAddress) {
		this.bICAddress = Objects.requireNonNull(bICAddress);
		return this;
	}

	public Optional<Party> getRelatedParty() {
		return relatedParty == null ? Optional.empty() : Optional.of(relatedParty);
	}

	public ContactPoint setRelatedParty(Party relatedParty) {
		this.relatedParty = relatedParty;
		return this;
	}

	public Optional<CorporateActionEvent> getRelatedCorporateActionEvent() {
		return relatedCorporateActionEvent == null ? Optional.empty() : Optional.of(relatedCorporateActionEvent);
	}

	public ContactPoint setRelatedCorporateActionEvent(CorporateActionEvent relatedCorporateActionEvent) {
		this.relatedCorporateActionEvent = relatedCorporateActionEvent;
		return this;
	}

	public Optional<ReportingService> getRelatedReportingService() {
		return relatedReportingService == null ? Optional.empty() : Optional.of(relatedReportingService);
	}

	public ContactPoint setRelatedReportingService(ReportingService relatedReportingService) {
		this.relatedReportingService = relatedReportingService;
		return this;
	}

	public List<Document> getStoredDocument() {
		return storedDocument == null ? storedDocument = new ArrayList<>() : storedDocument;
	}

	public ContactPoint setStoredDocument(List<Document> storedDocument) {
		this.storedDocument = Objects.requireNonNull(storedDocument);
		return this;
	}

	public Optional<PaymentObligation> getRemittanceRelatedPayment() {
		return remittanceRelatedPayment == null ? Optional.empty() : Optional.of(remittanceRelatedPayment);
	}

	public ContactPoint setRemittanceRelatedPayment(PaymentObligation remittanceRelatedPayment) {
		this.remittanceRelatedPayment = remittanceRelatedPayment;
		return this;
	}

	public Optional<ProxyAppointmentCondition> getRelatedProxyAppointment() {
		return relatedProxyAppointment == null ? Optional.empty() : Optional.of(relatedProxyAppointment);
	}

	public ContactPoint setRelatedProxyAppointment(ProxyAppointmentCondition relatedProxyAppointment) {
		this.relatedProxyAppointment = relatedProxyAppointment;
		return this;
	}

	public List<Meeting> getContactPointForMeeting() {
		return contactPointForMeeting == null ? contactPointForMeeting = new ArrayList<>() : contactPointForMeeting;
	}

	public ContactPoint setContactPointForMeeting(List<Meeting> contactPointForMeeting) {
		this.contactPointForMeeting = Objects.requireNonNull(contactPointForMeeting);
		return this;
	}

	public Optional<VotingCondition> getContactPointForVote() {
		return contactPointForVote == null ? Optional.empty() : Optional.of(contactPointForVote);
	}

	public ContactPoint setContactPointForVote(VotingCondition contactPointForVote) {
		this.contactPointForVote = contactPointForVote;
		return this;
	}

	public ContactPoint getMainContact() {
		return mainContact;
	}

	public ContactPoint setMainContact(ContactPoint mainContact) {
		this.mainContact = Objects.requireNonNull(mainContact);
		return this;
	}

	public ContactPoint getReturnAddress() {
		return returnAddress;
	}

	public ContactPoint setReturnAddress(ContactPoint returnAddress) {
		this.returnAddress = Objects.requireNonNull(returnAddress);
		return this;
	}

	public PaymentProcessing getRelatedPayment() {
		return relatedPayment;
	}

	public ContactPoint setRelatedPayment(PaymentProcessing relatedPayment) {
		this.relatedPayment = Objects.requireNonNull(relatedPayment);
		return this;
	}

	public YesNoIndicator getTemporaryIndicator() {
		return temporaryIndicator;
	}

	public ContactPoint setTemporaryIndicator(YesNoIndicator temporaryIndicator) {
		this.temporaryIndicator = Objects.requireNonNull(temporaryIndicator);
		return this;
	}

	public Optional<AttendanceCard> getDeliveredAttendanceCard() {
		return deliveredAttendanceCard == null ? Optional.empty() : Optional.of(deliveredAttendanceCard);
	}

	public ContactPoint setDeliveredAttendanceCard(AttendanceCard deliveredAttendanceCard) {
		this.deliveredAttendanceCard = deliveredAttendanceCard;
		return this;
	}

	public InvestmentFundClassProcessingCharacteristics getInvestmentFundClassProcessing() {
		return investmentFundClassProcessing;
	}

	public ContactPoint setInvestmentFundClassProcessing(InvestmentFundClassProcessingCharacteristics investmentFundClassProcessing) {
		this.investmentFundClassProcessing = Objects.requireNonNull(investmentFundClassProcessing);
		return this;
	}
}