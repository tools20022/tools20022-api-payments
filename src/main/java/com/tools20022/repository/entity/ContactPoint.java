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
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.OtherContact1;
import com.tools20022.repository.msg.RemittanceLocation3;
import com.tools20022.repository.msg.RemittanceLocation4;
import com.tools20022.repository.msg.RemittanceLocationDetails1;
import java.lang.reflect.Method;
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
 * {@linkplain com.tools20022.repository.msg.RemittanceLocation3#mmRemittanceLocationDetails
 * RemittanceLocation3.mmRemittanceLocationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceLocation4#mmRemittanceLocationDetails
 * RemittanceLocation4.mmRemittanceLocationDetails}</li>
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
	public static final MMBusinessAssociationEnd mmIdentification = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(OtherContact1.mmIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Identification of a contact point.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmIdentificationForContactPoint;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
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
	public static final MMBusinessAssociationEnd mmRelatedInvestmentFund = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedInvestmentFund";
			definition = "Investment fund class for which an order desk is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFund.mmOrderDesk;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFund.mmObject();
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
	public static final MMBusinessAttribute mmBICAddress = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BICAddress";
			definition = "BIC address which identifies the contact point.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AnyBICIdentifier.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ContactPoint.class.getMethod("getBICAddress", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	public static final MMBusinessAssociationEnd mmRelatedParty = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedParty";
			definition = "Party for which a contact point is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Party.mmContactPoint;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Party.mmObject();
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
	public static final MMBusinessAssociationEnd mmRelatedCorporateActionEvent = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedCorporateActionEvent";
			definition = "Corporate action event for which the documentation location is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmDocumentationLocation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
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
	public static final MMBusinessAssociationEnd mmRelatedReportingService = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedReportingService";
			definition = "Reporting service for which a contact point is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ReportingService.mmReportingChannel;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ReportingService.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Document> storedDocument;
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
	public static final MMBusinessAssociationEnd mmStoredDocument = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StoredDocument";
			definition = "Document which is stored at a specific place.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Document.mmPlaceOfStorage;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
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
	public static final MMBusinessAssociationEnd mmRemittanceRelatedPayment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RemittanceRelatedPayment";
			definition = "Payment for which a remittance location is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmRemittanceLocation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
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
	public static final MMBusinessAssociationEnd mmRelatedProxyAppointment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedProxyAppointment";
			definition = "Proxy appointment process for which a notification address is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ProxyAppointmentCondition.mmNotificationAddress;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ProxyAppointmentCondition.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Meeting> contactPointForMeeting;
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
	public static final MMBusinessAssociationEnd mmContactPointForMeeting = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ContactPointForMeeting";
			definition = "Meeting which takes place at a specific place.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Meeting.mmMeetingLocation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
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
	public static final MMBusinessAssociationEnd mmContactPointForVote = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ContactPointForVote";
			definition = "Vote parameters which apply to a vote location.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.VotingCondition.mmVoteLocation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.VotingCondition.mmObject();
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
	public static final MMBusinessAssociationEnd mmMainContact = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MainContact";
			definition = "Contact address used for normal operations.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmReturnAddress;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmObject();
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
	public static final MMBusinessAssociationEnd mmReturnAddress = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReturnAddress";
			definition = "Physical/logical address, segregated from the main address that is used for normal operations. The return address is used to route messages that require specific attention/exception handling, eg, returns or rejects.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmMainContact;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmObject();
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
	public static final MMBusinessAssociationEnd mmRelatedPayment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedPayment";
			definition = "Payment for which a notification method is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.mmContactPoint;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.mmObject();
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
	public static final MMBusinessAttribute mmTemporaryIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TemporaryIndicator";
			definition = "Indicates whether the address is a temporary address.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ContactPoint.class.getMethod("getTemporaryIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	public static final MMBusinessAssociationEnd mmDeliveredAttendanceCard = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeliveredAttendanceCard";
			definition = "Attendance card which is delivered at a specific location.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.AttendanceCard.mmDeliveryPlace;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AttendanceCard.mmObject();
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
	public static final MMBusinessAssociationEnd mmInvestmentFundClassProcessing = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundClassProcessing";
			definition = "Processing characteristics of an investment fund class for which a local market annex is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmLocalMarketAnnex;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ContactPoint";
				definition = "Number, physical or virtual address, used for communication.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GenericIdentification.mmIdentificationForContactPoint, com.tools20022.repository.entity.InvestmentFund.mmOrderDesk,
						com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmLocalMarketAnnex, com.tools20022.repository.entity.Party.mmContactPoint, com.tools20022.repository.entity.ContactPoint.mmMainContact,
						com.tools20022.repository.entity.ContactPoint.mmReturnAddress, com.tools20022.repository.entity.ReportingService.mmReportingChannel, com.tools20022.repository.entity.Document.mmPlaceOfStorage,
						com.tools20022.repository.entity.PaymentObligation.mmRemittanceLocation, com.tools20022.repository.entity.PaymentProcessing.mmContactPoint,
						com.tools20022.repository.entity.CorporateActionEvent.mmDocumentationLocation, com.tools20022.repository.entity.Meeting.mmMeetingLocation,
						com.tools20022.repository.entity.ProxyAppointmentCondition.mmNotificationAddress, com.tools20022.repository.entity.VotingCondition.mmVoteLocation, com.tools20022.repository.entity.AttendanceCard.mmDeliveryPlace);
				derivationElement_lazy = () -> Arrays.asList(RemittanceLocation3.mmRemittanceLocationDetails, RemittanceLocation4.mmRemittanceLocationDetails);
				subType_lazy = () -> Arrays.asList(PostalAddress.mmObject(), PhoneAddress.mmObject(), ElectronicAddress.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ContactPoint.mmIdentification, com.tools20022.repository.entity.ContactPoint.mmRelatedInvestmentFund,
						com.tools20022.repository.entity.ContactPoint.mmBICAddress, com.tools20022.repository.entity.ContactPoint.mmRelatedParty, com.tools20022.repository.entity.ContactPoint.mmRelatedCorporateActionEvent,
						com.tools20022.repository.entity.ContactPoint.mmRelatedReportingService, com.tools20022.repository.entity.ContactPoint.mmStoredDocument, com.tools20022.repository.entity.ContactPoint.mmRemittanceRelatedPayment,
						com.tools20022.repository.entity.ContactPoint.mmRelatedProxyAppointment, com.tools20022.repository.entity.ContactPoint.mmContactPointForMeeting, com.tools20022.repository.entity.ContactPoint.mmContactPointForVote,
						com.tools20022.repository.entity.ContactPoint.mmMainContact, com.tools20022.repository.entity.ContactPoint.mmReturnAddress, com.tools20022.repository.entity.ContactPoint.mmRelatedPayment,
						com.tools20022.repository.entity.ContactPoint.mmTemporaryIndicator, com.tools20022.repository.entity.ContactPoint.mmDeliveredAttendanceCard,
						com.tools20022.repository.entity.ContactPoint.mmInvestmentFundClassProcessing);
				derivationComponent_lazy = () -> Arrays.asList(CommunicationMethod2Choice.mmObject(), OtherContact1.mmObject(), ResidenceLocation1Choice.mmObject(), RemittanceLocation3.mmObject(), RemittanceLocationDetails1.mmObject(),
						RemittanceLocation4.mmObject());
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

	public ContactPoint setIdentification(com.tools20022.repository.entity.GenericIdentification identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public InvestmentFund getRelatedInvestmentFund() {
		return relatedInvestmentFund;
	}

	public ContactPoint setRelatedInvestmentFund(com.tools20022.repository.entity.InvestmentFund relatedInvestmentFund) {
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

	public ContactPoint setRelatedParty(com.tools20022.repository.entity.Party relatedParty) {
		this.relatedParty = relatedParty;
		return this;
	}

	public Optional<CorporateActionEvent> getRelatedCorporateActionEvent() {
		return relatedCorporateActionEvent == null ? Optional.empty() : Optional.of(relatedCorporateActionEvent);
	}

	public ContactPoint setRelatedCorporateActionEvent(com.tools20022.repository.entity.CorporateActionEvent relatedCorporateActionEvent) {
		this.relatedCorporateActionEvent = relatedCorporateActionEvent;
		return this;
	}

	public Optional<ReportingService> getRelatedReportingService() {
		return relatedReportingService == null ? Optional.empty() : Optional.of(relatedReportingService);
	}

	public ContactPoint setRelatedReportingService(com.tools20022.repository.entity.ReportingService relatedReportingService) {
		this.relatedReportingService = relatedReportingService;
		return this;
	}

	public List<Document> getStoredDocument() {
		return storedDocument == null ? storedDocument = new ArrayList<>() : storedDocument;
	}

	public ContactPoint setStoredDocument(List<com.tools20022.repository.entity.Document> storedDocument) {
		this.storedDocument = Objects.requireNonNull(storedDocument);
		return this;
	}

	public Optional<PaymentObligation> getRemittanceRelatedPayment() {
		return remittanceRelatedPayment == null ? Optional.empty() : Optional.of(remittanceRelatedPayment);
	}

	public ContactPoint setRemittanceRelatedPayment(com.tools20022.repository.entity.PaymentObligation remittanceRelatedPayment) {
		this.remittanceRelatedPayment = remittanceRelatedPayment;
		return this;
	}

	public Optional<ProxyAppointmentCondition> getRelatedProxyAppointment() {
		return relatedProxyAppointment == null ? Optional.empty() : Optional.of(relatedProxyAppointment);
	}

	public ContactPoint setRelatedProxyAppointment(com.tools20022.repository.entity.ProxyAppointmentCondition relatedProxyAppointment) {
		this.relatedProxyAppointment = relatedProxyAppointment;
		return this;
	}

	public List<Meeting> getContactPointForMeeting() {
		return contactPointForMeeting == null ? contactPointForMeeting = new ArrayList<>() : contactPointForMeeting;
	}

	public ContactPoint setContactPointForMeeting(List<com.tools20022.repository.entity.Meeting> contactPointForMeeting) {
		this.contactPointForMeeting = Objects.requireNonNull(contactPointForMeeting);
		return this;
	}

	public Optional<VotingCondition> getContactPointForVote() {
		return contactPointForVote == null ? Optional.empty() : Optional.of(contactPointForVote);
	}

	public ContactPoint setContactPointForVote(com.tools20022.repository.entity.VotingCondition contactPointForVote) {
		this.contactPointForVote = contactPointForVote;
		return this;
	}

	public ContactPoint getMainContact() {
		return mainContact;
	}

	public ContactPoint setMainContact(com.tools20022.repository.entity.ContactPoint mainContact) {
		this.mainContact = Objects.requireNonNull(mainContact);
		return this;
	}

	public ContactPoint getReturnAddress() {
		return returnAddress;
	}

	public ContactPoint setReturnAddress(com.tools20022.repository.entity.ContactPoint returnAddress) {
		this.returnAddress = Objects.requireNonNull(returnAddress);
		return this;
	}

	public PaymentProcessing getRelatedPayment() {
		return relatedPayment;
	}

	public ContactPoint setRelatedPayment(com.tools20022.repository.entity.PaymentProcessing relatedPayment) {
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

	public ContactPoint setDeliveredAttendanceCard(com.tools20022.repository.entity.AttendanceCard deliveredAttendanceCard) {
		this.deliveredAttendanceCard = deliveredAttendanceCard;
		return this;
	}

	public InvestmentFundClassProcessingCharacteristics getInvestmentFundClassProcessing() {
		return investmentFundClassProcessing;
	}

	public ContactPoint setInvestmentFundClassProcessing(com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics investmentFundClassProcessing) {
		this.investmentFundClassProcessing = Objects.requireNonNull(investmentFundClassProcessing);
		return this;
	}
}