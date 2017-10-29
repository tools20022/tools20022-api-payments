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
import com.tools20022.repository.choice.CommunicationMethod2Choice;
import com.tools20022.repository.choice.ResidenceLocation1Choice;
import com.tools20022.repository.datatype.AnyBICIdentifier;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.msg.OtherContact1;
import com.tools20022.repository.msg.RemittanceLocation3;
import com.tools20022.repository.msg.RemittanceLocation4;
import com.tools20022.repository.msg.RemittanceLocationDetails1;
import java.util.Arrays;
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
 * <li>{@linkplain com.tools20022.repository.entity.ContactPoint#Identification
 * ContactPoint.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ContactPoint#RelatedInvestmentFund
 * ContactPoint.RelatedInvestmentFund}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ContactPoint#BICAddress
 * ContactPoint.BICAddress}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ContactPoint#RelatedParty
 * ContactPoint.RelatedParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ContactPoint#RelatedCorporateActionEvent
 * ContactPoint.RelatedCorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ContactPoint#RelatedReportingService
 * ContactPoint.RelatedReportingService}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ContactPoint#StoredDocument
 * ContactPoint.StoredDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ContactPoint#RemittanceRelatedPayment
 * ContactPoint.RemittanceRelatedPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ContactPoint#RelatedProxyAppointment
 * ContactPoint.RelatedProxyAppointment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ContactPoint#ContactPointForMeeting
 * ContactPoint.ContactPointForMeeting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ContactPoint#ContactPointForVote
 * ContactPoint.ContactPointForVote}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ContactPoint#MainContact
 * ContactPoint.MainContact}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ContactPoint#ReturnAddress
 * ContactPoint.ReturnAddress}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ContactPoint#RelatedPayment
 * ContactPoint.RelatedPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ContactPoint#TemporaryIndicator
 * ContactPoint.TemporaryIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ContactPoint#DeliveredAttendanceCard
 * ContactPoint.DeliveredAttendanceCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ContactPoint#InvestmentFundClassProcessing
 * ContactPoint.InvestmentFundClassProcessing}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#IdentificationForContactPoint
 * GenericIdentification.IdentificationForContactPoint}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentFund#OrderDesk
 * InvestmentFund.OrderDesk}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#LocalMarketAnnex
 * InvestmentFundClassProcessingCharacteristics.LocalMarketAnnex}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#ContactPoint
 * Party.ContactPoint}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ContactPoint#MainContact
 * ContactPoint.MainContact}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ContactPoint#ReturnAddress
 * ContactPoint.ReturnAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ReportingService#ReportingChannel
 * ReportingService.ReportingChannel}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#PlaceOfStorage
 * Document.PlaceOfStorage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#RemittanceLocation
 * PaymentObligation.RemittanceLocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#ContactPoint
 * PaymentProcessing.ContactPoint}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#DocumentationLocation
 * CorporateActionEvent.DocumentationLocation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#MeetingLocation
 * Meeting.MeetingLocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProxyAppointmentCondition#NotificationAddress
 * ProxyAppointmentCondition.NotificationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VotingCondition#VoteLocation
 * VotingCondition.VoteLocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AttendanceCard#DeliveryPlace
 * AttendanceCard.DeliveryPlace}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceLocation3#RemittanceLocationDetails
 * RemittanceLocation3.RemittanceLocationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceLocation4#RemittanceLocationDetails
 * RemittanceLocation4.RemittanceLocationDetails}</li>
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
 * <li>{@linkplain com.tools20022.repository.choice.CommunicationMethod2Choice
 * CommunicationMethod2Choice}</li>
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
	/**
	 * Identification of a contact point.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#IdentificationForContactPoint
	 * GenericIdentification.IdentificationForContactPoint}</li>
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
	 * {@linkplain com.tools20022.repository.msg.OtherContact1#Identification
	 * OtherContact1.Identification}</li>
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
	public static final MMBusinessAssociationEnd Identification = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OtherContact1.Identification);
			elementContext_lazy = () -> ContactPoint.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Identification of a contact point.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> GenericIdentification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.IdentificationForContactPoint;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Investment fund class for which an order desk is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFund#OrderDesk
	 * InvestmentFund.OrderDesk}</li>
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
	public static final MMBusinessAssociationEnd RelatedInvestmentFund = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ContactPoint.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedInvestmentFund";
			definition = "Investment fund class for which an order desk is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> InvestmentFund.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFund.OrderDesk;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * BIC address which identifies the contact point.
	 * <p>
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
	public static final MMBusinessAttribute BICAddress = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> ContactPoint.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BICAddress";
			definition = "BIC address which identifies the contact point.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> AnyBICIdentifier.mmObject();
		}
	};
	/**
	 * Party for which a contact point is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Party#ContactPoint
	 * Party.ContactPoint}</li>
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
	public static final MMBusinessAssociationEnd RelatedParty = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ContactPoint.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedParty";
			definition = "Party for which a contact point is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Party.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Party.ContactPoint;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Corporate action event for which the documentation location is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#DocumentationLocation
	 * CorporateActionEvent.DocumentationLocation}</li>
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
	public static final MMBusinessAssociationEnd RelatedCorporateActionEvent = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ContactPoint.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCorporateActionEvent";
			definition = "Corporate action event for which the documentation location is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionEvent.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.DocumentationLocation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Reporting service for which a contact point is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ReportingService#ReportingChannel
	 * ReportingService.ReportingChannel}</li>
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
	public static final MMBusinessAssociationEnd RelatedReportingService = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ContactPoint.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedReportingService";
			definition = "Reporting service for which a contact point is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> ReportingService.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ReportingService.ReportingChannel;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Document which is stored at a specific place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Document#PlaceOfStorage
	 * Document.PlaceOfStorage}</li>
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
	public static final MMBusinessAssociationEnd StoredDocument = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ContactPoint.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StoredDocument";
			definition = "Document which is stored at a specific place.";
			minOccurs = 0;
			type_lazy = () -> Document.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Document.PlaceOfStorage;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Payment for which a remittance location is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#RemittanceLocation
	 * PaymentObligation.RemittanceLocation}</li>
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
	public static final MMBusinessAssociationEnd RemittanceRelatedPayment = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ContactPoint.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RemittanceRelatedPayment";
			definition = "Payment for which a remittance location is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> PaymentObligation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentObligation.RemittanceLocation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Proxy appointment process for which a notification address is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProxyAppointmentCondition#NotificationAddress
	 * ProxyAppointmentCondition.NotificationAddress}</li>
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
	public static final MMBusinessAssociationEnd RelatedProxyAppointment = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ContactPoint.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedProxyAppointment";
			definition = "Proxy appointment process for which a notification address is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> ProxyAppointmentCondition.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ProxyAppointmentCondition.NotificationAddress;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Meeting which takes place at a specific place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Meeting#MeetingLocation
	 * Meeting.MeetingLocation}</li>
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
	public static final MMBusinessAssociationEnd ContactPointForMeeting = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ContactPoint.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ContactPointForMeeting";
			definition = "Meeting which takes place at a specific place.";
			minOccurs = 0;
			type_lazy = () -> Meeting.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Meeting.MeetingLocation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Vote parameters which apply to a vote location.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.VotingCondition#VoteLocation
	 * VotingCondition.VoteLocation}</li>
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
	public static final MMBusinessAssociationEnd ContactPointForVote = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ContactPoint.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ContactPointForVote";
			definition = "Vote parameters which apply to a vote location.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> VotingCondition.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.VotingCondition.VoteLocation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Contact address used for normal operations.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint#ReturnAddress
	 * ContactPoint.ReturnAddress}</li>
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
	public static final MMBusinessAssociationEnd MainContact = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ContactPoint.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MainContact";
			definition = "Contact address used for normal operations.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> ContactPoint.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPoint.ReturnAddress;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Physical/logical address, segregated from the main address that is used
	 * for normal operations. The return address is used to route messages that
	 * require specific attention/exception handling, eg, returns or rejects.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint#MainContact
	 * ContactPoint.MainContact}</li>
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
	public static final MMBusinessAssociationEnd ReturnAddress = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ContactPoint.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReturnAddress";
			definition = "Physical/logical address, segregated from the main address that is used for normal operations. The return address is used to route messages that require specific attention/exception handling, eg, returns or rejects.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> ContactPoint.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPoint.MainContact;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Payment for which a notification method is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#ContactPoint
	 * PaymentProcessing.ContactPoint}</li>
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
	public static final MMBusinessAssociationEnd RelatedPayment = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ContactPoint.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPayment";
			definition = "Payment for which a notification method is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> PaymentProcessing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.ContactPoint;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates whether the address is a temporary address.
	 * <p>
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
	public static final MMBusinessAttribute TemporaryIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> ContactPoint.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TemporaryIndicator";
			definition = "Indicates whether the address is a temporary address.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Attendance card which is delivered at a specific location.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AttendanceCard#DeliveryPlace
	 * AttendanceCard.DeliveryPlace}</li>
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
	public static final MMBusinessAssociationEnd DeliveredAttendanceCard = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ContactPoint.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DeliveredAttendanceCard";
			definition = "Attendance card which is delivered at a specific location.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> AttendanceCard.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AttendanceCard.DeliveryPlace;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Processing characteristics of an investment fund class for which a local
	 * market annex is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#LocalMarketAnnex
	 * InvestmentFundClassProcessingCharacteristics.LocalMarketAnnex}</li>
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
	public static final MMBusinessAssociationEnd InvestmentFundClassProcessing = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ContactPoint.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundClassProcessing";
			definition = "Processing characteristics of an investment fund class for which a local market annex is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.LocalMarketAnnex;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ContactPoint";
				definition = "Number, physical or virtual address, used for communication.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GenericIdentification.IdentificationForContactPoint, com.tools20022.repository.entity.InvestmentFund.OrderDesk,
						com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.LocalMarketAnnex, com.tools20022.repository.entity.Party.ContactPoint, com.tools20022.repository.entity.ContactPoint.MainContact,
						com.tools20022.repository.entity.ContactPoint.ReturnAddress, com.tools20022.repository.entity.ReportingService.ReportingChannel, com.tools20022.repository.entity.Document.PlaceOfStorage,
						com.tools20022.repository.entity.PaymentObligation.RemittanceLocation, com.tools20022.repository.entity.PaymentProcessing.ContactPoint, com.tools20022.repository.entity.CorporateActionEvent.DocumentationLocation,
						com.tools20022.repository.entity.Meeting.MeetingLocation, com.tools20022.repository.entity.ProxyAppointmentCondition.NotificationAddress, com.tools20022.repository.entity.VotingCondition.VoteLocation,
						com.tools20022.repository.entity.AttendanceCard.DeliveryPlace);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RemittanceLocation3.RemittanceLocationDetails, com.tools20022.repository.msg.RemittanceLocation4.RemittanceLocationDetails);
				subType_lazy = () -> Arrays.asList(PostalAddress.mmObject(), PhoneAddress.mmObject(), ElectronicAddress.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ContactPoint.Identification, com.tools20022.repository.entity.ContactPoint.RelatedInvestmentFund, com.tools20022.repository.entity.ContactPoint.BICAddress,
						com.tools20022.repository.entity.ContactPoint.RelatedParty, com.tools20022.repository.entity.ContactPoint.RelatedCorporateActionEvent, com.tools20022.repository.entity.ContactPoint.RelatedReportingService,
						com.tools20022.repository.entity.ContactPoint.StoredDocument, com.tools20022.repository.entity.ContactPoint.RemittanceRelatedPayment, com.tools20022.repository.entity.ContactPoint.RelatedProxyAppointment,
						com.tools20022.repository.entity.ContactPoint.ContactPointForMeeting, com.tools20022.repository.entity.ContactPoint.ContactPointForVote, com.tools20022.repository.entity.ContactPoint.MainContact,
						com.tools20022.repository.entity.ContactPoint.ReturnAddress, com.tools20022.repository.entity.ContactPoint.RelatedPayment, com.tools20022.repository.entity.ContactPoint.TemporaryIndicator,
						com.tools20022.repository.entity.ContactPoint.DeliveredAttendanceCard, com.tools20022.repository.entity.ContactPoint.InvestmentFundClassProcessing);
				derivationComponent_lazy = () -> Arrays.asList(CommunicationMethod2Choice.mmObject(), OtherContact1.mmObject(), ResidenceLocation1Choice.mmObject(), RemittanceLocation3.mmObject(), RemittanceLocationDetails1.mmObject(),
						RemittanceLocation4.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}