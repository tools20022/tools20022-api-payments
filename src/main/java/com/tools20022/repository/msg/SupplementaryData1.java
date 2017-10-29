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
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.other.SupplementaryDataEnvelope1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.msg.SupplementaryData1#PlaceAndName
 * SupplementaryData1.PlaceAndName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SupplementaryData1#Envelope
 * SupplementaryData1.Envelope}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountAdditionalInformationRequestV02#SupplementaryData
 * AccountAdditionalInformationRequestV02.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountClosingAdditionalInformationRequestV02#SupplementaryData
 * AccountClosingAdditionalInformationRequestV02.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountClosingAmendmentRequestV02#SupplementaryData
 * AccountClosingAmendmentRequestV02.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountClosingRequestV02#SupplementaryData
 * AccountClosingRequestV02.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceAmendmentRequestV02#SupplementaryData
 * AccountExcludedMandateMaintenanceAmendmentRequestV02.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceRequestV02#SupplementaryData
 * AccountExcludedMandateMaintenanceRequestV02.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountMandateMaintenanceAmendmentRequestV02#SupplementaryData
 * AccountMandateMaintenanceAmendmentRequestV02.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountMandateMaintenanceRequestV02#SupplementaryData
 * AccountMandateMaintenanceRequestV02.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningAdditionalInformationRequestV02#SupplementaryData
 * AccountOpeningAdditionalInformationRequestV02.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningAmendmentRequestV02#SupplementaryData
 * AccountOpeningAmendmentRequestV02.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningRequestV02#SupplementaryData
 * AccountOpeningRequestV02.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountReportRequestV02#SupplementaryData
 * AccountReportRequestV02.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountReportV02#SupplementaryData
 * AccountReportV02.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountRequestAcknowledgementV02#SupplementaryData
 * AccountRequestAcknowledgementV02.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountRequestRejectionV02#SupplementaryData
 * AccountRequestRejectionV02.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.IdentificationModificationAdviceV02#SupplementaryData
 * IdentificationModificationAdviceV02.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.IdentificationVerificationRequestV02#SupplementaryData
 * IdentificationVerificationRequestV02.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.IdentificationVerificationReportV02#SupplementaryData
 * IdentificationVerificationReportV02.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.AccountReportingRequestV03#SupplementaryData
 * AccountReportingRequestV03.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.NotificationOfCaseAssignmentV04#SupplementaryData
 * NotificationOfCaseAssignmentV04.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.RejectInvestigationV04#SupplementaryData
 * RejectInvestigationV04.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CancelCaseAssignmentV03#SupplementaryData
 * CancelCaseAssignmentV03.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.RequestForDuplicateV04#SupplementaryData
 * RequestForDuplicateV04.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.DuplicateV04#SupplementaryData
 * DuplicateV04.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ProprietaryFormatInvestigationV03#SupplementaryData
 * ProprietaryFormatInvestigationV03.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationResponseV03#SupplementaryData
 * DebitAuthorisationResponseV03.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CaseStatusReportRequestV03#SupplementaryData
 * CaseStatusReportRequestV03.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CaseStatusReportV04#SupplementaryData
 * CaseStatusReportV04.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.InformationRequestOpeningV01#SupplementaryData
 * InformationRequestOpeningV01.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.InformationRequestResponseV01#SupplementaryData
 * InformationRequestResponseV01.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.InformationRequestStatusChangeNotificationV01#SupplementaryData
 * InformationRequestStatusChangeNotificationV01.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.remt.RemittanceLocationAdviceV01#SupplementaryData
 * RemittanceLocationAdviceV01.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.ContractRegistrationStatementRequestV01#SupplementaryData
 * ContractRegistrationStatementRequestV01.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.ContractRegistrationAmendmentRequestV01#SupplementaryData
 * ContractRegistrationAmendmentRequestV01.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.ContractRegistrationConfirmationV01#SupplementaryData
 * ContractRegistrationConfirmationV01.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.ContractRegistrationRequestV01#SupplementaryData
 * ContractRegistrationRequestV01.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.CurrencyControlStatusAdviceV01#SupplementaryData
 * CurrencyControlStatusAdviceV01.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.CurrencyControlSupportingDocumentDeliveryV01#SupplementaryData
 * CurrencyControlSupportingDocumentDeliveryV01.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.ContractRegistrationClosureRequestV01#SupplementaryData
 * ContractRegistrationClosureRequestV01.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.ContractRegistrationStatementV01#SupplementaryData
 * ContractRegistrationStatementV01.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.PaymentRegulatoryInformationNotificationV01#SupplementaryData
 * PaymentRegulatoryInformationNotificationV01.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.CurrencyControlRequestOrLetterV01#SupplementaryData
 * CurrencyControlRequestOrLetterV01.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerAccountReportV06#SupplementaryData
 * BankToCustomerAccountReportV06.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FinancialInstitutionCreditTransferV06#SupplementaryData
 * FinancialInstitutionCreditTransferV06.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.NotificationToReceiveStatusReportV05#SupplementaryData
 * NotificationToReceiveStatusReportV05.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV06#SupplementaryData
 * FIToFICustomerCreditTransferV06.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.NotificationToReceiveCancellationAdviceV05#SupplementaryData
 * NotificationToReceiveCancellationAdviceV05.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerStatementV06#SupplementaryData
 * BankToCustomerStatementV06.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerDebitCreditNotificationV06#SupplementaryData
 * BankToCustomerDebitCreditNotificationV06.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.NotificationToReceiveV05#SupplementaryData
 * NotificationToReceiveV05.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FinancialInstitutionDirectDebitV02#SupplementaryData
 * FinancialInstitutionDirectDebitV02.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusRequestV01#SupplementaryData
 * FIToFIPaymentStatusRequestV01.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.MandateAcceptanceReportV05#SupplementaryData
 * MandateAcceptanceReportV05.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.MandateAmendmentRequestV05#SupplementaryData
 * MandateAmendmentRequestV05.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.UnableToApplyV05#SupplementaryData
 * UnableToApplyV05.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.PaymentReturnV07#SupplementaryData
 * PaymentReturnV07.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.MandateInitiationRequestV05#SupplementaryData
 * MandateInitiationRequestV05.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV08#SupplementaryData
 * FIToFIPaymentStatusReportV08.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.remt.RemittanceAdviceV03#SupplementaryData
 * RemittanceAdviceV03.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentReversalV07#SupplementaryData
 * FIToFIPaymentReversalV07.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CustomerPaymentCancellationRequestV06#SupplementaryData
 * CustomerPaymentCancellationRequestV06.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.AdditionalPaymentInformationV07#SupplementaryData
 * AdditionalPaymentInformationV07.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV07#SupplementaryData
 * ResolutionOfInvestigationV07.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerDirectDebitV07#SupplementaryData
 * FIToFICustomerDirectDebitV07.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerCreditTransferInitiationV08#SupplementaryData
 * CustomerCreditTransferInitiationV08.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FIToFIPaymentCancellationRequestV06#SupplementaryData
 * FIToFIPaymentCancellationRequestV06.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.MandateCancellationRequestV05#SupplementaryData
 * MandateCancellationRequestV05.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerDirectDebitInitiationV07#SupplementaryData
 * CustomerDirectDebitInitiationV07.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationRequestV05#SupplementaryData
 * DebitAuthorisationRequestV05.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CreditorPaymentActivationRequestStatusReportV06#SupplementaryData
 * CreditorPaymentActivationRequestStatusReportV06.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentStatusReportV08#SupplementaryData
 * CustomerPaymentStatusReportV08.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CreditorPaymentActivationRequestV06#SupplementaryData
 * CreditorPaymentActivationRequestV06.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ClaimNonReceiptV05#SupplementaryData
 * ClaimNonReceiptV05.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.RequestToModifyPaymentV04#SupplementaryData
 * RequestToModifyPaymentV04.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentReversalV07#SupplementaryData
 * CustomerPaymentReversalV07.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.MandateSuspensionRequestV01#SupplementaryData
 * MandateSuspensionRequestV01.SupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.MandateCopyRequestV01#SupplementaryData
 * MandateCopyRequestV01.SupplementaryData}</li>
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
 * "SupplementaryData1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Additional information that can not be captured in the structured fields and/or any other specific block."
 * </li>
 * </ul>
 */
public class SupplementaryData1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Unambiguous reference to the location where the supplementary data must
	 * be inserted in the message instance.<br>
	 * In the case of XML, this is expressed by a valid XPath.
	 * <p>
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
	public static final MMMessageAttribute PlaceAndName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SupplementaryData1.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "Unambiguous reference to the location where the supplementary data must be inserted in the message instance.\r\nIn the case of XML, this is expressed by a valid XPath.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Technical element wrapping the supplementary data.
	 * <p>
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
	public static final MMMessageAssociationEnd Envelope = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> SupplementaryData1.mmObject();
			isDerived = false;
			xmlTag = "Envlp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Envelope";
			definition = "Technical element wrapping the supplementary data.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SupplementaryDataEnvelope1.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SupplementaryData1.PlaceAndName, com.tools20022.repository.msg.SupplementaryData1.Envelope);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.acmt.AccountAdditionalInformationRequestV02.SupplementaryData,
						com.tools20022.repository.area.acmt.AccountClosingAdditionalInformationRequestV02.SupplementaryData, com.tools20022.repository.area.acmt.AccountClosingAmendmentRequestV02.SupplementaryData,
						com.tools20022.repository.area.acmt.AccountClosingRequestV02.SupplementaryData, com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceAmendmentRequestV02.SupplementaryData,
						com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceRequestV02.SupplementaryData, com.tools20022.repository.area.acmt.AccountMandateMaintenanceAmendmentRequestV02.SupplementaryData,
						com.tools20022.repository.area.acmt.AccountMandateMaintenanceRequestV02.SupplementaryData, com.tools20022.repository.area.acmt.AccountOpeningAdditionalInformationRequestV02.SupplementaryData,
						com.tools20022.repository.area.acmt.AccountOpeningAmendmentRequestV02.SupplementaryData, com.tools20022.repository.area.acmt.AccountOpeningRequestV02.SupplementaryData,
						com.tools20022.repository.area.acmt.AccountReportRequestV02.SupplementaryData, com.tools20022.repository.area.acmt.AccountReportV02.SupplementaryData,
						com.tools20022.repository.area.acmt.AccountRequestAcknowledgementV02.SupplementaryData, com.tools20022.repository.area.acmt.AccountRequestRejectionV02.SupplementaryData,
						com.tools20022.repository.area.acmt.IdentificationModificationAdviceV02.SupplementaryData, com.tools20022.repository.area.acmt.IdentificationVerificationRequestV02.SupplementaryData,
						com.tools20022.repository.area.acmt.IdentificationVerificationReportV02.SupplementaryData, com.tools20022.repository.area.camt.AccountReportingRequestV03.SupplementaryData,
						com.tools20022.repository.area.camt.NotificationOfCaseAssignmentV04.SupplementaryData, com.tools20022.repository.area.camt.RejectInvestigationV04.SupplementaryData,
						com.tools20022.repository.area.camt.CancelCaseAssignmentV03.SupplementaryData, com.tools20022.repository.area.camt.RequestForDuplicateV04.SupplementaryData,
						com.tools20022.repository.area.camt.DuplicateV04.SupplementaryData, com.tools20022.repository.area.camt.ProprietaryFormatInvestigationV03.SupplementaryData,
						com.tools20022.repository.area.camt.DebitAuthorisationResponseV03.SupplementaryData, com.tools20022.repository.area.camt.CaseStatusReportRequestV03.SupplementaryData,
						com.tools20022.repository.area.camt.CaseStatusReportV04.SupplementaryData, com.tools20022.repository.area.auth.InformationRequestOpeningV01.SupplementaryData,
						com.tools20022.repository.area.auth.InformationRequestResponseV01.SupplementaryData, com.tools20022.repository.area.auth.InformationRequestStatusChangeNotificationV01.SupplementaryData,
						com.tools20022.repository.area.remt.RemittanceLocationAdviceV01.SupplementaryData, com.tools20022.repository.area.auth.ContractRegistrationStatementRequestV01.SupplementaryData,
						com.tools20022.repository.area.auth.ContractRegistrationAmendmentRequestV01.SupplementaryData, com.tools20022.repository.area.auth.ContractRegistrationConfirmationV01.SupplementaryData,
						com.tools20022.repository.area.auth.ContractRegistrationRequestV01.SupplementaryData, com.tools20022.repository.area.auth.CurrencyControlStatusAdviceV01.SupplementaryData,
						com.tools20022.repository.area.auth.CurrencyControlSupportingDocumentDeliveryV01.SupplementaryData, com.tools20022.repository.area.auth.ContractRegistrationClosureRequestV01.SupplementaryData,
						com.tools20022.repository.area.auth.ContractRegistrationStatementV01.SupplementaryData, com.tools20022.repository.area.auth.PaymentRegulatoryInformationNotificationV01.SupplementaryData,
						com.tools20022.repository.area.auth.CurrencyControlRequestOrLetterV01.SupplementaryData, com.tools20022.repository.area.camt.BankToCustomerAccountReportV06.SupplementaryData,
						com.tools20022.repository.area.pacs.FinancialInstitutionCreditTransferV06.SupplementaryData, com.tools20022.repository.area.camt.NotificationToReceiveStatusReportV05.SupplementaryData,
						com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV06.SupplementaryData, com.tools20022.repository.area.camt.NotificationToReceiveCancellationAdviceV05.SupplementaryData,
						com.tools20022.repository.area.camt.BankToCustomerStatementV06.SupplementaryData, com.tools20022.repository.area.camt.BankToCustomerDebitCreditNotificationV06.SupplementaryData,
						com.tools20022.repository.area.camt.NotificationToReceiveV05.SupplementaryData, com.tools20022.repository.area.pacs.FinancialInstitutionDirectDebitV02.SupplementaryData,
						com.tools20022.repository.area.pacs.FIToFIPaymentStatusRequestV01.SupplementaryData, com.tools20022.repository.area.pain.MandateAcceptanceReportV05.SupplementaryData,
						com.tools20022.repository.area.pain.MandateAmendmentRequestV05.SupplementaryData, com.tools20022.repository.area.camt.UnableToApplyV05.SupplementaryData,
						com.tools20022.repository.area.pacs.PaymentReturnV07.SupplementaryData, com.tools20022.repository.area.pain.MandateInitiationRequestV05.SupplementaryData,
						com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV08.SupplementaryData, com.tools20022.repository.area.remt.RemittanceAdviceV03.SupplementaryData,
						com.tools20022.repository.area.pacs.FIToFIPaymentReversalV07.SupplementaryData, com.tools20022.repository.area.camt.CustomerPaymentCancellationRequestV06.SupplementaryData,
						com.tools20022.repository.area.camt.AdditionalPaymentInformationV07.SupplementaryData, com.tools20022.repository.area.camt.ResolutionOfInvestigationV07.SupplementaryData,
						com.tools20022.repository.area.pacs.FIToFICustomerDirectDebitV07.SupplementaryData, com.tools20022.repository.area.pain.CustomerCreditTransferInitiationV08.SupplementaryData,
						com.tools20022.repository.area.camt.FIToFIPaymentCancellationRequestV06.SupplementaryData, com.tools20022.repository.area.pain.MandateCancellationRequestV05.SupplementaryData,
						com.tools20022.repository.area.pain.CustomerDirectDebitInitiationV07.SupplementaryData, com.tools20022.repository.area.camt.DebitAuthorisationRequestV05.SupplementaryData,
						com.tools20022.repository.area.pain.CreditorPaymentActivationRequestStatusReportV06.SupplementaryData, com.tools20022.repository.area.pain.CustomerPaymentStatusReportV08.SupplementaryData,
						com.tools20022.repository.area.pain.CreditorPaymentActivationRequestV06.SupplementaryData, com.tools20022.repository.area.camt.ClaimNonReceiptV05.SupplementaryData,
						com.tools20022.repository.area.camt.RequestToModifyPaymentV04.SupplementaryData, com.tools20022.repository.area.pain.CustomerPaymentReversalV07.SupplementaryData,
						com.tools20022.repository.area.pain.MandateSuspensionRequestV01.SupplementaryData, com.tools20022.repository.area.pain.MandateCopyRequestV01.SupplementaryData);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SupplementaryData1";
				definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			}
		});
		return mmObject_lazy.get();
	}
}