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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.acmt.*;
import com.tools20022.repository.area.auth.*;
import com.tools20022.repository.area.camt.*;
import com.tools20022.repository.area.pacs.*;
import com.tools20022.repository.area.pain.*;
import com.tools20022.repository.area.remt.RemittanceAdviceV03;
import com.tools20022.repository.area.remt.RemittanceLocationAdviceV01;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.other.SupplementaryDataEnvelope1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Additional information that can not be captured in the structured fields
 * and/or any other specific block.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SupplementaryData1#mmPlaceAndName
 * SupplementaryData1.mmPlaceAndName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SupplementaryData1#mmEnvelope
 * SupplementaryData1.mmEnvelope}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountAdditionalInformationRequestV02#mmSupplementaryData
 * AccountAdditionalInformationRequestV02.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountClosingAdditionalInformationRequestV02#mmSupplementaryData
 * AccountClosingAdditionalInformationRequestV02.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountClosingAmendmentRequestV02#mmSupplementaryData
 * AccountClosingAmendmentRequestV02.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountClosingRequestV02#mmSupplementaryData
 * AccountClosingRequestV02.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceAmendmentRequestV02#mmSupplementaryData
 * AccountExcludedMandateMaintenanceAmendmentRequestV02.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceRequestV02#mmSupplementaryData
 * AccountExcludedMandateMaintenanceRequestV02.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountMandateMaintenanceAmendmentRequestV02#mmSupplementaryData
 * AccountMandateMaintenanceAmendmentRequestV02.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountMandateMaintenanceRequestV02#mmSupplementaryData
 * AccountMandateMaintenanceRequestV02.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningAdditionalInformationRequestV02#mmSupplementaryData
 * AccountOpeningAdditionalInformationRequestV02.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningAmendmentRequestV02#mmSupplementaryData
 * AccountOpeningAmendmentRequestV02.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningRequestV02#mmSupplementaryData
 * AccountOpeningRequestV02.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountReportRequestV02#mmSupplementaryData
 * AccountReportRequestV02.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountReportV02#mmSupplementaryData
 * AccountReportV02.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountRequestAcknowledgementV02#mmSupplementaryData
 * AccountRequestAcknowledgementV02.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountRequestRejectionV02#mmSupplementaryData
 * AccountRequestRejectionV02.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.IdentificationModificationAdviceV02#mmSupplementaryData
 * IdentificationModificationAdviceV02.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.IdentificationVerificationRequestV02#mmSupplementaryData
 * IdentificationVerificationRequestV02.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.IdentificationVerificationReportV02#mmSupplementaryData
 * IdentificationVerificationReportV02.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.AccountReportingRequestV03#mmSupplementaryData
 * AccountReportingRequestV03.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.NotificationOfCaseAssignmentV04#mmSupplementaryData
 * NotificationOfCaseAssignmentV04.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.RejectInvestigationV04#mmSupplementaryData
 * RejectInvestigationV04.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CancelCaseAssignmentV03#mmSupplementaryData
 * CancelCaseAssignmentV03.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.RequestForDuplicateV04#mmSupplementaryData
 * RequestForDuplicateV04.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.DuplicateV04#mmSupplementaryData
 * DuplicateV04.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ProprietaryFormatInvestigationV03#mmSupplementaryData
 * ProprietaryFormatInvestigationV03.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationResponseV03#mmSupplementaryData
 * DebitAuthorisationResponseV03.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CaseStatusReportRequestV03#mmSupplementaryData
 * CaseStatusReportRequestV03.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CaseStatusReportV04#mmSupplementaryData
 * CaseStatusReportV04.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.InformationRequestOpeningV01#mmSupplementaryData
 * InformationRequestOpeningV01.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.InformationRequestResponseV01#mmSupplementaryData
 * InformationRequestResponseV01.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.InformationRequestStatusChangeNotificationV01#mmSupplementaryData
 * InformationRequestStatusChangeNotificationV01.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.remt.RemittanceLocationAdviceV01#mmSupplementaryData
 * RemittanceLocationAdviceV01.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.ContractRegistrationStatementRequestV01#mmSupplementaryData
 * ContractRegistrationStatementRequestV01.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.ContractRegistrationAmendmentRequestV01#mmSupplementaryData
 * ContractRegistrationAmendmentRequestV01.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.ContractRegistrationConfirmationV01#mmSupplementaryData
 * ContractRegistrationConfirmationV01.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.ContractRegistrationRequestV01#mmSupplementaryData
 * ContractRegistrationRequestV01.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.CurrencyControlStatusAdviceV01#mmSupplementaryData
 * CurrencyControlStatusAdviceV01.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.CurrencyControlSupportingDocumentDeliveryV01#mmSupplementaryData
 * CurrencyControlSupportingDocumentDeliveryV01.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.ContractRegistrationClosureRequestV01#mmSupplementaryData
 * ContractRegistrationClosureRequestV01.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.ContractRegistrationStatementV01#mmSupplementaryData
 * ContractRegistrationStatementV01.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.PaymentRegulatoryInformationNotificationV01#mmSupplementaryData
 * PaymentRegulatoryInformationNotificationV01.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.CurrencyControlRequestOrLetterV01#mmSupplementaryData
 * CurrencyControlRequestOrLetterV01.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerAccountReportV06#mmSupplementaryData
 * BankToCustomerAccountReportV06.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FinancialInstitutionCreditTransferV06#mmSupplementaryData
 * FinancialInstitutionCreditTransferV06.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.NotificationToReceiveStatusReportV05#mmSupplementaryData
 * NotificationToReceiveStatusReportV05.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV06#mmSupplementaryData
 * FIToFICustomerCreditTransferV06.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.NotificationToReceiveCancellationAdviceV05#mmSupplementaryData
 * NotificationToReceiveCancellationAdviceV05.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerStatementV06#mmSupplementaryData
 * BankToCustomerStatementV06.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerDebitCreditNotificationV06#mmSupplementaryData
 * BankToCustomerDebitCreditNotificationV06.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.NotificationToReceiveV05#mmSupplementaryData
 * NotificationToReceiveV05.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FinancialInstitutionDirectDebitV02#mmSupplementaryData
 * FinancialInstitutionDirectDebitV02.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusRequestV01#mmSupplementaryData
 * FIToFIPaymentStatusRequestV01.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.MandateAcceptanceReportV05#mmSupplementaryData
 * MandateAcceptanceReportV05.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.MandateAmendmentRequestV05#mmSupplementaryData
 * MandateAmendmentRequestV05.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.UnableToApplyV05#mmSupplementaryData
 * UnableToApplyV05.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.PaymentReturnV07#mmSupplementaryData
 * PaymentReturnV07.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.MandateInitiationRequestV05#mmSupplementaryData
 * MandateInitiationRequestV05.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV08#mmSupplementaryData
 * FIToFIPaymentStatusReportV08.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.remt.RemittanceAdviceV03#mmSupplementaryData
 * RemittanceAdviceV03.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentReversalV07#mmSupplementaryData
 * FIToFIPaymentReversalV07.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CustomerPaymentCancellationRequestV06#mmSupplementaryData
 * CustomerPaymentCancellationRequestV06.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.AdditionalPaymentInformationV07#mmSupplementaryData
 * AdditionalPaymentInformationV07.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV07#mmSupplementaryData
 * ResolutionOfInvestigationV07.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerDirectDebitV07#mmSupplementaryData
 * FIToFICustomerDirectDebitV07.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerCreditTransferInitiationV08#mmSupplementaryData
 * CustomerCreditTransferInitiationV08.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FIToFIPaymentCancellationRequestV06#mmSupplementaryData
 * FIToFIPaymentCancellationRequestV06.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.MandateCancellationRequestV05#mmSupplementaryData
 * MandateCancellationRequestV05.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerDirectDebitInitiationV07#mmSupplementaryData
 * CustomerDirectDebitInitiationV07.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationRequestV05#mmSupplementaryData
 * DebitAuthorisationRequestV05.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CreditorPaymentActivationRequestStatusReportV06#mmSupplementaryData
 * CreditorPaymentActivationRequestStatusReportV06.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentStatusReportV08#mmSupplementaryData
 * CustomerPaymentStatusReportV08.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CreditorPaymentActivationRequestV06#mmSupplementaryData
 * CreditorPaymentActivationRequestV06.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ClaimNonReceiptV05#mmSupplementaryData
 * ClaimNonReceiptV05.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.RequestToModifyPaymentV04#mmSupplementaryData
 * RequestToModifyPaymentV04.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentReversalV07#mmSupplementaryData
 * CustomerPaymentReversalV07.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.MandateSuspensionRequestV01#mmSupplementaryData
 * MandateSuspensionRequestV01.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.MandateCopyRequestV01#mmSupplementaryData
 * MandateCopyRequestV01.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forSupplementaryData1
 * ConstraintSupplementaryDataRule.forSupplementaryData1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SupplementaryData1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Additional information that can not be captured in the structured fields and/or any other specific block."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SupplementaryData1", propOrder = {"placeAndName", "envelope"})
public class SupplementaryData1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PlcAndNm")
	protected Max350Text placeAndName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcAndNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceAndName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous reference to the location where the supplementary data must be inserted in the message instance.\r\nIn the case of XML, this is expressed by a valid XPath."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceAndName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SupplementaryData1.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "Unambiguous reference to the location where the supplementary data must be inserted in the message instance.\r\nIn the case of XML, this is expressed by a valid XPath.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	@XmlElement(name = "Envlp", required = true)
	protected SupplementaryDataEnvelope1 envelope;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.other.SupplementaryDataEnvelope1
	 * SupplementaryDataEnvelope1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Envlp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Envelope"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Technical element wrapping the supplementary data."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEnvelope = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SupplementaryData1.mmObject();
			isDerived = false;
			xmlTag = "Envlp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Envelope";
			definition = "Technical element wrapping the supplementary data.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SupplementaryDataEnvelope1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SupplementaryData1.mmPlaceAndName, com.tools20022.repository.msg.SupplementaryData1.mmEnvelope);
				messageBuildingBlock_lazy = () -> Arrays.asList(AccountAdditionalInformationRequestV02.mmSupplementaryData, AccountClosingAdditionalInformationRequestV02.mmSupplementaryData,
						AccountClosingAmendmentRequestV02.mmSupplementaryData, AccountClosingRequestV02.mmSupplementaryData, AccountExcludedMandateMaintenanceAmendmentRequestV02.mmSupplementaryData,
						AccountExcludedMandateMaintenanceRequestV02.mmSupplementaryData, AccountMandateMaintenanceAmendmentRequestV02.mmSupplementaryData, AccountMandateMaintenanceRequestV02.mmSupplementaryData,
						AccountOpeningAdditionalInformationRequestV02.mmSupplementaryData, AccountOpeningAmendmentRequestV02.mmSupplementaryData, AccountOpeningRequestV02.mmSupplementaryData, AccountReportRequestV02.mmSupplementaryData,
						AccountReportV02.mmSupplementaryData, AccountRequestAcknowledgementV02.mmSupplementaryData, AccountRequestRejectionV02.mmSupplementaryData, IdentificationModificationAdviceV02.mmSupplementaryData,
						IdentificationVerificationRequestV02.mmSupplementaryData, IdentificationVerificationReportV02.mmSupplementaryData, AccountReportingRequestV03.mmSupplementaryData, NotificationOfCaseAssignmentV04.mmSupplementaryData,
						RejectInvestigationV04.mmSupplementaryData, CancelCaseAssignmentV03.mmSupplementaryData, RequestForDuplicateV04.mmSupplementaryData, DuplicateV04.mmSupplementaryData,
						ProprietaryFormatInvestigationV03.mmSupplementaryData, DebitAuthorisationResponseV03.mmSupplementaryData, CaseStatusReportRequestV03.mmSupplementaryData, CaseStatusReportV04.mmSupplementaryData,
						InformationRequestOpeningV01.mmSupplementaryData, InformationRequestResponseV01.mmSupplementaryData, InformationRequestStatusChangeNotificationV01.mmSupplementaryData,
						RemittanceLocationAdviceV01.mmSupplementaryData, ContractRegistrationStatementRequestV01.mmSupplementaryData, ContractRegistrationAmendmentRequestV01.mmSupplementaryData,
						ContractRegistrationConfirmationV01.mmSupplementaryData, ContractRegistrationRequestV01.mmSupplementaryData, CurrencyControlStatusAdviceV01.mmSupplementaryData,
						CurrencyControlSupportingDocumentDeliveryV01.mmSupplementaryData, ContractRegistrationClosureRequestV01.mmSupplementaryData, ContractRegistrationStatementV01.mmSupplementaryData,
						PaymentRegulatoryInformationNotificationV01.mmSupplementaryData, CurrencyControlRequestOrLetterV01.mmSupplementaryData, BankToCustomerAccountReportV06.mmSupplementaryData,
						FinancialInstitutionCreditTransferV06.mmSupplementaryData, NotificationToReceiveStatusReportV05.mmSupplementaryData, FIToFICustomerCreditTransferV06.mmSupplementaryData,
						NotificationToReceiveCancellationAdviceV05.mmSupplementaryData, BankToCustomerStatementV06.mmSupplementaryData, BankToCustomerDebitCreditNotificationV06.mmSupplementaryData,
						NotificationToReceiveV05.mmSupplementaryData, FinancialInstitutionDirectDebitV02.mmSupplementaryData, FIToFIPaymentStatusRequestV01.mmSupplementaryData, MandateAcceptanceReportV05.mmSupplementaryData,
						MandateAmendmentRequestV05.mmSupplementaryData, UnableToApplyV05.mmSupplementaryData, PaymentReturnV07.mmSupplementaryData, MandateInitiationRequestV05.mmSupplementaryData,
						FIToFIPaymentStatusReportV08.mmSupplementaryData, RemittanceAdviceV03.mmSupplementaryData, FIToFIPaymentReversalV07.mmSupplementaryData, CustomerPaymentCancellationRequestV06.mmSupplementaryData,
						AdditionalPaymentInformationV07.mmSupplementaryData, ResolutionOfInvestigationV07.mmSupplementaryData, FIToFICustomerDirectDebitV07.mmSupplementaryData, CustomerCreditTransferInitiationV08.mmSupplementaryData,
						FIToFIPaymentCancellationRequestV06.mmSupplementaryData, MandateCancellationRequestV05.mmSupplementaryData, CustomerDirectDebitInitiationV07.mmSupplementaryData, DebitAuthorisationRequestV05.mmSupplementaryData,
						CreditorPaymentActivationRequestStatusReportV06.mmSupplementaryData, CustomerPaymentStatusReportV08.mmSupplementaryData, CreditorPaymentActivationRequestV06.mmSupplementaryData,
						ClaimNonReceiptV05.mmSupplementaryData, RequestToModifyPaymentV04.mmSupplementaryData, CustomerPaymentReversalV07.mmSupplementaryData, MandateSuspensionRequestV01.mmSupplementaryData,
						MandateCopyRequestV01.mmSupplementaryData);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forSupplementaryData1);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SupplementaryData1";
				definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max350Text> getPlaceAndName() {
		return placeAndName == null ? Optional.empty() : Optional.of(placeAndName);
	}

	public SupplementaryData1 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = placeAndName;
		return this;
	}

	public SupplementaryDataEnvelope1 getEnvelope() {
		return envelope;
	}

	public SupplementaryData1 setEnvelope(SupplementaryDataEnvelope1 envelope) {
		this.envelope = Objects.requireNonNull(envelope);
		return this;
	}
}