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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.CopyDuplicateCode;
import com.tools20022.repository.codeset.DataSetTypeCode;
import com.tools20022.repository.codeset.DocumentTypeCode;
import com.tools20022.repository.codeset.LanguageCode;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * General information that unambiguously identifies a document, such as
 * identification number and issue date time.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Document" src="doc-files/Document.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmIssueDate
 * Document.mmIssueDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmCopyDuplicate
 * Document.mmCopyDuplicate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmPlaceOfStorage
 * Document.mmPlaceOfStorage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Document#mmPaymentObligation
 * Document.mmPaymentObligation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmType
 * Document.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmAmount
 * Document.mmAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmAgreement
 * Document.mmAgreement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmPlaceOfIssue
 * Document.mmPlaceOfIssue}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmDocumentVersion
 * Document.mmDocumentVersion}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmStatus
 * Document.mmStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmReconciliation
 * Document.mmReconciliation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmLetterOfCredit
 * Document.mmLetterOfCredit}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmPartyRole
 * Document.mmPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmDataSetType
 * Document.mmDataSetType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmTransport
 * Document.mmTransport}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmSignedIndicator
 * Document.mmSignedIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmRemittedAmount
 * Document.mmRemittedAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmGuarantee
 * Document.mmGuarantee}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmLanguage
 * Document.mmLanguage}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmPurpose
 * Document.mmPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Document#mmDocumentIdentification
 * Document.mmDocumentIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmEvidence
 * Document.mmEvidence}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmCommercialTrade
 * Document.mmCommercialTrade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmPresentation
 * Document.mmPresentation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmRelatedContract
 * Document.mmRelatedContract}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentifiedDocument
 * GenericIdentification.mmIdentifiedDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmStoredDocument
 * ContactPoint.mmStoredDocument}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Location#mmIssuedDocument
 * Location.mmIssuedDocument}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Agreement#mmDocument
 * Agreement.mmDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DocumentPartyRole#mmDocument
 * DocumentPartyRole.mmDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmAssociatedDocument
 * PaymentObligation.mmAssociatedDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Presentation#mmPresentedDocument
 * Presentation.mmPresentedDocument}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CommercialTrade#mmDocuments
 * CommercialTrade.mmDocuments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Transport#mmTransportDocuments
 * Transport.mmTransportDocuments}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LetterOfCredit#mmDocument
 * LetterOfCredit.mmDocument}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Guarantee#mmDocument
 * Guarantee.mmDocument}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Reconciliation#mmDocument
 * Reconciliation.mmDocument}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Evidence#mmRelatedDocument
 * Evidence.mmRelatedDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmAttachment
 * RegisteredContract.mmAttachment}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditorReferenceType2#mmCodeOrProprietary
 * CreditorReferenceType2.mmCodeOrProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation2#mmUnstructured
 * RemittanceInformation2.mmUnstructured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DocumentLineType1#mmCodeOrProprietary
 * DocumentLineType1.mmCodeOrProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DocumentLineInformation1#mmDescription
 * DocumentLineInformation1.mmDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GarnishmentType1#mmCodeOrProprietary
 * GarnishmentType1.mmCodeOrProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReferredDocumentType4#mmCodeOrProprietary
 * ReferredDocumentType4.mmCodeOrProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation11#mmUnstructured
 * RemittanceInformation11.mmUnstructured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation11#mmStructured
 * RemittanceInformation11.mmStructured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation13#mmReferredDocumentInformation
 * StructuredRemittanceInformation13.mmReferredDocumentInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation13#mmAdditionalRemittanceInformation
 * StructuredRemittanceInformation13.mmAdditionalRemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReferredDocumentInformation7#mmLineDetails
 * ReferredDocumentInformation7.mmLineDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification6#mmRemittanceInformation
 * RequestedModification6.mmRemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation13#mmStructured
 * RemittanceInformation13.mmStructured}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.PrivateCertificate
 * PrivateCertificate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InsuranceCertificate
 * InsuranceCertificate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecurityCertificate
 * SecurityCertificate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradeCertificate
 * TradeCertificate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Assessment Assessment}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CreditorReferenceType1Choice
 * CreditorReferenceType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CreditorReferenceType2
 * CreditorReferenceType2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RemittanceAmount2
 * RemittanceAmount2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RemittanceInformation2
 * RemittanceInformation2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification22
 * DocumentIdentification22}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentLineType1
 * DocumentLineType1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentLineIdentification1
 * DocumentLineIdentification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentLineInformation1
 * DocumentLineInformation1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.DocumentLineType1Choice
 * DocumentLineType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.GarnishmentType1Choice
 * GarnishmentType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GarnishmentType1
 * GarnishmentType1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ReferredDocumentType3Choice
 * ReferredDocumentType3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReferredDocumentType4
 * ReferredDocumentType4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1
 * SupportingDocumentRequestOrLetter1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification29
 * DocumentIdentification29}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SupportingDocumentEntry1
 * SupportingDocumentEntry1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentGeneralInformation3
 * DocumentGeneralInformation3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CertificateReference1
 * CertificateReference1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification28
 * DocumentIdentification28}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RemittanceInformation11
 * RemittanceInformation11}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation13
 * StructuredRemittanceInformation13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReferredDocumentInformation7
 * ReferredDocumentInformation7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RemittanceInformation13
 * RemittanceInformation13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReferredMandateDocument1
 * ReferredMandateDocument1}</li>
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
 * "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "General information that unambiguously identifies a document, such as identification number and issue date time."
 * </li>
 * </ul>
 */
public class Document {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ISODateTime issueDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification22#mmDateOfIssue
	 * DocumentIdentification22.mmDateOfIssue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentLineIdentification1#mmRelatedDate
	 * DocumentLineIdentification1.mmRelatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1#mmDate
	 * SupportingDocumentRequestOrLetter1.mmDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1#mmDueDate
	 * SupportingDocumentRequestOrLetter1.mmDueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification29#mmDateOfIssue
	 * DocumentIdentification29.mmDateOfIssue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentGeneralInformation3#mmIssueDate
	 * DocumentGeneralInformation3.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification28#mmDateOfIssue
	 * DocumentIdentification28.mmDateOfIssue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReferredDocumentInformation7#mmRelatedDate
	 * ReferredDocumentInformation7.mmRelatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingStatement2#mmCreationDateTime
	 * BillingStatement2.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReferredMandateDocument1#mmRelatedDate
	 * ReferredMandateDocument1.mmRelatedDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Issue date of the document."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmIssueDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(DocumentIdentification22.mmDateOfIssue, DocumentLineIdentification1.mmRelatedDate, SupportingDocumentRequestOrLetter1.mmDate, SupportingDocumentRequestOrLetter1.mmDueDate,
					DocumentIdentification29.mmDateOfIssue, DocumentGeneralInformation3.mmIssueDate, DocumentIdentification28.mmDateOfIssue, ReferredDocumentInformation7.mmRelatedDate, BillingStatement2.mmCreationDateTime,
					ReferredMandateDocument1.mmRelatedDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IssueDate";
			definition = "Issue date of the document.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Document.class.getMethod("getIssueDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CopyDuplicateCode copyDuplicate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CopyDuplicateCode
	 * CopyDuplicateCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CopyDuplicate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if this document is a copy, a duplicate, or a duplicate of a copy."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCopyDuplicate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CopyDuplicate";
			definition = "Specifies if this document is a copy, a duplicate, or a duplicate of a copy.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CopyDuplicateCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Document.class.getMethod("getCopyDuplicate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.ContactPoint> placeOfStorage;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmStoredDocument
	 * ContactPoint.mmStoredDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ContactPoint
	 * ContactPoint}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemReference4#mmRelatedRemittanceInformation
	 * OriginalItemReference4.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#mmRelatedRemittanceInformation
	 * EntryTransaction8.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem6#mmRelatedRemittanceInformation
	 * NotificationItem6.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#mmRelatedRemittanceInformation
	 * DirectDebitTransactionInformation21.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation22#mmRelatedRemittanceInformation
	 * DirectDebitTransactionInformation22.mmRelatedRemittanceInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfStorage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies where the document is stored."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPlaceOfStorage = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(OriginalItemReference4.mmRelatedRemittanceInformation, EntryTransaction8.mmRelatedRemittanceInformation, NotificationItem6.mmRelatedRemittanceInformation,
					DirectDebitTransactionInformation21.mmRelatedRemittanceInformation, DirectDebitTransactionInformation22.mmRelatedRemittanceInformation);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PlaceOfStorage";
			definition = "Specifies where the document is stored.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmStoredDocument;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmObject();
		}
	};
	protected PaymentObligation paymentObligation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmAssociatedDocument
	 * PaymentObligation.mmAssociatedDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentObligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Document which is referred to in a payment obligation."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPaymentObligation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentObligation";
			definition = "Document which is referred to in a payment obligation.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmAssociatedDocument;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
		}
	};
	protected DocumentTypeCode type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode
	 * DocumentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CreditorReferenceType1Choice#mmCode
	 * CreditorReferenceType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CreditorReferenceType1Choice#mmProprietary
	 * CreditorReferenceType1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentLineIdentification1#mmType
	 * DocumentLineIdentification1.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DocumentLineType1Choice#mmCode
	 * DocumentLineType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DocumentLineType1Choice#mmProprietary
	 * DocumentLineType1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GarnishmentType1Choice#mmCode
	 * GarnishmentType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GarnishmentType1Choice#mmProprietary
	 * GarnishmentType1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReferredDocumentType3Choice#mmCode
	 * ReferredDocumentType3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReferredDocumentType3Choice#mmProprietary
	 * ReferredDocumentType3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1#mmType
	 * SupportingDocumentRequestOrLetter1.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentEntry1#mmDocumentType
	 * SupportingDocumentEntry1.mmDocumentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentGeneralInformation3#mmDocumentType
	 * DocumentGeneralInformation3.mmDocumentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReferredDocumentInformation7#mmType
	 * ReferredDocumentInformation7.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReferredMandateDocument1#mmType
	 * ReferredMandateDocument1.mmType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of the document, for example commercial invoice."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CreditorReferenceType1Choice.mmCode, CreditorReferenceType1Choice.mmProprietary, DocumentLineIdentification1.mmType, DocumentLineType1Choice.mmCode, DocumentLineType1Choice.mmProprietary,
					GarnishmentType1Choice.mmCode, GarnishmentType1Choice.mmProprietary, ReferredDocumentType3Choice.mmCode, ReferredDocumentType3Choice.mmProprietary, SupportingDocumentRequestOrLetter1.mmType,
					SupportingDocumentEntry1.mmDocumentType, DocumentGeneralInformation3.mmDocumentType, ReferredDocumentInformation7.mmType, ReferredMandateDocument1.mmType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Specifies the type of the document, for example commercial invoice.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DocumentTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Document.class.getMethod("getType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ActiveCurrencyAndAmount amount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentLineInformation1#mmAmount
	 * DocumentLineInformation1.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentEntry1#mmTotalAmount
	 * SupportingDocumentEntry1.mmTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentEntry1#mmTotalAmountAfterShipment
	 * SupportingDocumentEntry1.mmTotalAmountAfterShipment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentEntry1#mmTotalAmountInContractCurrency
	 * SupportingDocumentEntry1.mmTotalAmountInContractCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentEntry1#mmTotalAmountAfterShipmentInContractCurrency
	 * SupportingDocumentEntry1.mmTotalAmountAfterShipmentInContractCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionCertificateContract1#mmTransactionAmountInContractCurrency
	 * TransactionCertificateContract1.mmTransactionAmountInContractCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation13#mmReferredDocumentAmount
	 * StructuredRemittanceInformation13.mmReferredDocumentAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money and currency of a document. \r\nThe amount can be either the original amount due and payable for instance the ordered amount, or the amount actually remitted for the referred document."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(DocumentLineInformation1.mmAmount, SupportingDocumentEntry1.mmTotalAmount, SupportingDocumentEntry1.mmTotalAmountAfterShipment, SupportingDocumentEntry1.mmTotalAmountInContractCurrency,
					SupportingDocumentEntry1.mmTotalAmountAfterShipmentInContractCurrency, TransactionCertificateContract1.mmTransactionAmountInContractCurrency, StructuredRemittanceInformation13.mmReferredDocumentAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Amount of money and currency of a document. \r\nThe amount can be either the original amount due and payable for instance the ordered amount, or the amount actually remitted for the referred document.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Document.class.getMethod("getAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.Agreement> agreement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Agreement#mmDocument
	 * Agreement.mmDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Agreement Agreement}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Agreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Agreement which is materialised by a document"</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAgreement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Agreement";
			definition = "Agreement which is materialised by a document";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Agreement.mmDocument;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Agreement.mmObject();
		}
	};
	protected Location placeOfIssue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Location#mmIssuedDocument
	 * Location.mmIssuedDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Location Location}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfIssue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Place where the document was issued."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPlaceOfIssue = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PlaceOfIssue";
			definition = "Place where the document was issued.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Location.mmIssuedDocument;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
		}
	};
	protected Number documentVersion;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DocumentVersion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unambiguous identification of the version of a document."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDocumentVersion = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DocumentVersion";
			definition = "Unambiguous identification of the version of a document.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Document.class.getMethod("getDocumentVersion", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max140Text status;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContractRegistrationStatement1#mmRegulatoryRuleValidation
	 * ContractRegistrationStatement1.mmRegulatoryRuleValidation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BillingStatement2#mmStatus
	 * BillingStatement2.mmStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the document (eg delivered, paid, etc.)"</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(ContractRegistrationStatement1.mmRegulatoryRuleValidation, BillingStatement2.mmStatus);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Status of the document (eg delivered, paid, etc.)";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Document.class.getMethod("getStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.Reconciliation> reconciliation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Reconciliation#mmDocument
	 * Reconciliation.mmDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Reconciliation
	 * Reconciliation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reconciliation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reconciliation process for which a document is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmReconciliation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Reconciliation";
			definition = "Reconciliation process for which a document is specified.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Reconciliation.mmDocument;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Reconciliation.mmObject();
		}
	};
	protected LetterOfCredit letterOfCredit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LetterOfCredit#mmDocument
	 * LetterOfCredit.mmDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.LetterOfCredit
	 * LetterOfCredit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LetterOfCredit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Written undertaking by a bank to honour a demand for payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmLetterOfCredit = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LetterOfCredit";
			definition = "Written undertaking by a bank to honour a demand for payment.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.LetterOfCredit.mmDocument;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.LetterOfCredit.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.DocumentPartyRole> partyRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DocumentPartyRole#mmDocument
	 * DocumentPartyRole.mmDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DocumentPartyRole
	 * DocumentPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Role played by a party in the context of a document or in the context of the business linked to the document."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Role played by a party in the context of a document or in the context of the business linked to the document.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.DocumentPartyRole.mmDocument;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DocumentPartyRole.mmObject();
		}
	};
	protected DataSetTypeCode dataSetType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetTypeCode
	 * DataSetTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DataSetType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of data set in which the document is included."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDataSetType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DataSetType";
			definition = "Specifies the type of data set in which the document is included.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DataSetTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Document.class.getMethod("getDataSetType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Transport transport;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Transport#mmTransportDocuments
	 * Transport.mmTransportDocuments}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Transport Transport}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Transport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transport process for which related documents are specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTransport = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Transport";
			definition = "Transport process for which related documents are specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Transport.mmTransportDocuments;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Transport.mmObject();
		}
	};
	protected YesNoIndicator signedIndicator;
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indication whether the document must be signed or not."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSignedIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SignedIndicator";
			definition = "Indication whether the document must be signed or not.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Document.class.getMethod("getSignedIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount remittedAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RemittanceAmount2#mmRemittedAmount
	 * RemittanceAmount2.mmRemittedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Garnishment1#mmRemittedAmount
	 * Garnishment1.mmRemittedAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemittedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money remitted for the referred document."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRemittedAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(RemittanceAmount2.mmRemittedAmount, Garnishment1.mmRemittedAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RemittedAmount";
			definition = "Amount of money remitted for the referred document.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Document.class.getMethod("getRemittedAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.Guarantee> guarantee;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Guarantee#mmDocument
	 * Guarantee.mmDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Guarantee Guarantee}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Guarantee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Guarantee that is described in a document."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmGuarantee = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Guarantee";
			definition = "Guarantee that is described in a document.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Guarantee.mmDocument;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Guarantee.mmObject();
		}
	};
	protected LanguageCode language;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.LanguageCode
	 * LanguageCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Language"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Language used for textual information in the document."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmLanguage = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Language";
			definition = "Language used for textual information in the document.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LanguageCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Document.class.getMethod("getLanguage", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text purpose;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1#mmSubject
	 * SupportingDocumentRequestOrLetter1.mmSubject}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Purpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the function of the document."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPurpose = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SupportingDocumentRequestOrLetter1.mmSubject);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Purpose";
			definition = "Specifies the function of the document.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Document.class.getMethod("getPurpose", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected GenericIdentification documentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentifiedDocument
	 * GenericIdentification.mmIdentifiedDocument}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1#mmRequestOrLetterIdentification
	 * SupportingDocumentRequestOrLetter1.mmRequestOrLetterIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1#mmOriginalReferences
	 * SupportingDocumentRequestOrLetter1.mmOriginalReferences}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionCertificate1#mmCertificate
	 * TransactionCertificate1.mmCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentEntry1#mmOriginalDocument
	 * SupportingDocumentEntry1.mmOriginalDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CertificateReference1#mmIdentification
	 * CertificateReference1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionCertificateContract1#mmContractReference
	 * TransactionCertificateContract1.mmContractReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ContractRegistrationReference1Choice#mmContract
	 * ContractRegistrationReference1Choice.mmContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyControlRecordStatus1#mmDocumentIdentification
	 * CurrencyControlRecordStatus1.mmDocumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate10#mmMandateReference
	 * Mandate10.mmMandateReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate9#mmMandateReference
	 * Mandate9.mmMandateReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate11#mmMandateReference
	 * Mandate11.mmMandateReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReferredMandateDocument1#mmCreditorReference
	 * ReferredMandateDocument1.mmCreditorReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate8#mmMandateReference
	 * Mandate8.mmMandateReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DocumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a document for instance unique identification of the purchase order, assigned by the buyer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmDocumentIdentification = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(SupportingDocumentRequestOrLetter1.mmRequestOrLetterIdentification, SupportingDocumentRequestOrLetter1.mmOriginalReferences, TransactionCertificate1.mmCertificate,
					SupportingDocumentEntry1.mmOriginalDocument, CertificateReference1.mmIdentification, TransactionCertificateContract1.mmContractReference, ContractRegistrationReference1Choice.mmContract,
					CurrencyControlRecordStatus1.mmDocumentIdentification, Mandate10.mmMandateReference, Mandate9.mmMandateReference, Mandate11.mmMandateReference, ReferredMandateDocument1.mmCreditorReference, Mandate8.mmMandateReference);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DocumentIdentification";
			definition = "Identification of a document for instance unique identification of the purchase order, assigned by the buyer.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmIdentifiedDocument;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Evidence> evidence;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Evidence#mmRelatedDocument
	 * Evidence.mmRelatedDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Evidence Evidence}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Evidence"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Proof of evidence which uses a document."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmEvidence = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Evidence";
			definition = "Proof of evidence which uses a document.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Evidence.mmRelatedDocument;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Evidence.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CommercialTrade> commercialTrade;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTrade#mmDocuments
	 * CommercialTrade.mmDocuments}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CommercialTrade
	 * CommercialTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommercialTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade for which a certificare is issued."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCommercialTrade = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CommercialTrade";
			definition = "Trade for which a certificare is issued.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CommercialTrade.mmDocuments;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CommercialTrade.mmObject();
		}
	};
	protected Presentation presentation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Presentation#mmPresentedDocument
	 * Presentation.mmPresentedDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Presentation
	 * Presentation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Presentation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Presentation of documents and statements."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPresentation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Presentation";
			definition = "Presentation of documents and statements.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Presentation.mmPresentedDocument;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Presentation.mmObject();
		}
	};
	protected RegisteredContract relatedContract;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmAttachment
	 * RegisteredContract.mmAttachment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RegisteredContract
	 * RegisteredContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedContract"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Related document which materialises the agreement."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedContract = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedContract";
			definition = "Related document which materialises the agreement.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RegisteredContract.mmAttachment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RegisteredContract.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Document";
				definition = "General information that unambiguously identifies a document, such as identification number and issue date time.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GenericIdentification.mmIdentifiedDocument, com.tools20022.repository.entity.ContactPoint.mmStoredDocument,
						com.tools20022.repository.entity.Location.mmIssuedDocument, com.tools20022.repository.entity.Agreement.mmDocument, com.tools20022.repository.entity.DocumentPartyRole.mmDocument,
						com.tools20022.repository.entity.PaymentObligation.mmAssociatedDocument, com.tools20022.repository.entity.Presentation.mmPresentedDocument, com.tools20022.repository.entity.CommercialTrade.mmDocuments,
						com.tools20022.repository.entity.Transport.mmTransportDocuments, com.tools20022.repository.entity.LetterOfCredit.mmDocument, com.tools20022.repository.entity.Guarantee.mmDocument,
						com.tools20022.repository.entity.Reconciliation.mmDocument, com.tools20022.repository.entity.Evidence.mmRelatedDocument, com.tools20022.repository.entity.RegisteredContract.mmAttachment);
				derivationElement_lazy = () -> Arrays.asList(CreditorReferenceType2.mmCodeOrProprietary, RemittanceInformation2.mmUnstructured, DocumentLineType1.mmCodeOrProprietary, DocumentLineInformation1.mmDescription,
						GarnishmentType1.mmCodeOrProprietary, ReferredDocumentType4.mmCodeOrProprietary, RemittanceInformation11.mmUnstructured, RemittanceInformation11.mmStructured,
						StructuredRemittanceInformation13.mmReferredDocumentInformation, StructuredRemittanceInformation13.mmAdditionalRemittanceInformation, ReferredDocumentInformation7.mmLineDetails,
						RequestedModification6.mmRemittanceInformation, RemittanceInformation13.mmStructured);
				subType_lazy = () -> Arrays.asList(PrivateCertificate.mmObject(), InsuranceCertificate.mmObject(), SecurityCertificate.mmObject(), TradeCertificate.mmObject(), Assessment.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Document.mmIssueDate, com.tools20022.repository.entity.Document.mmCopyDuplicate, com.tools20022.repository.entity.Document.mmPlaceOfStorage,
						com.tools20022.repository.entity.Document.mmPaymentObligation, com.tools20022.repository.entity.Document.mmType, com.tools20022.repository.entity.Document.mmAmount,
						com.tools20022.repository.entity.Document.mmAgreement, com.tools20022.repository.entity.Document.mmPlaceOfIssue, com.tools20022.repository.entity.Document.mmDocumentVersion,
						com.tools20022.repository.entity.Document.mmStatus, com.tools20022.repository.entity.Document.mmReconciliation, com.tools20022.repository.entity.Document.mmLetterOfCredit,
						com.tools20022.repository.entity.Document.mmPartyRole, com.tools20022.repository.entity.Document.mmDataSetType, com.tools20022.repository.entity.Document.mmTransport,
						com.tools20022.repository.entity.Document.mmSignedIndicator, com.tools20022.repository.entity.Document.mmRemittedAmount, com.tools20022.repository.entity.Document.mmGuarantee,
						com.tools20022.repository.entity.Document.mmLanguage, com.tools20022.repository.entity.Document.mmPurpose, com.tools20022.repository.entity.Document.mmDocumentIdentification,
						com.tools20022.repository.entity.Document.mmEvidence, com.tools20022.repository.entity.Document.mmCommercialTrade, com.tools20022.repository.entity.Document.mmPresentation,
						com.tools20022.repository.entity.Document.mmRelatedContract);
				derivationComponent_lazy = () -> Arrays.asList(CreditorReferenceType1Choice.mmObject(), CreditorReferenceType2.mmObject(), RemittanceAmount2.mmObject(), RemittanceInformation2.mmObject(),
						DocumentIdentification22.mmObject(), DocumentLineType1.mmObject(), DocumentLineIdentification1.mmObject(), DocumentLineInformation1.mmObject(), DocumentLineType1Choice.mmObject(), GarnishmentType1Choice.mmObject(),
						GarnishmentType1.mmObject(), ReferredDocumentType3Choice.mmObject(), ReferredDocumentType4.mmObject(), SupportingDocumentRequestOrLetter1.mmObject(), DocumentIdentification29.mmObject(),
						SupportingDocumentEntry1.mmObject(), DocumentGeneralInformation3.mmObject(), CertificateReference1.mmObject(), DocumentIdentification28.mmObject(), RemittanceInformation11.mmObject(),
						StructuredRemittanceInformation13.mmObject(), ReferredDocumentInformation7.mmObject(), RemittanceInformation13.mmObject(), ReferredMandateDocument1.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Document.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ISODateTime getIssueDate() {
		return issueDate;
	}

	public Document setIssueDate(ISODateTime issueDate) {
		this.issueDate = Objects.requireNonNull(issueDate);
		return this;
	}

	public CopyDuplicateCode getCopyDuplicate() {
		return copyDuplicate;
	}

	public Document setCopyDuplicate(CopyDuplicateCode copyDuplicate) {
		this.copyDuplicate = Objects.requireNonNull(copyDuplicate);
		return this;
	}

	public List<ContactPoint> getPlaceOfStorage() {
		return placeOfStorage == null ? placeOfStorage = new ArrayList<>() : placeOfStorage;
	}

	public Document setPlaceOfStorage(List<com.tools20022.repository.entity.ContactPoint> placeOfStorage) {
		this.placeOfStorage = Objects.requireNonNull(placeOfStorage);
		return this;
	}

	public Optional<PaymentObligation> getPaymentObligation() {
		return paymentObligation == null ? Optional.empty() : Optional.of(paymentObligation);
	}

	public Document setPaymentObligation(com.tools20022.repository.entity.PaymentObligation paymentObligation) {
		this.paymentObligation = paymentObligation;
		return this;
	}

	public DocumentTypeCode getType() {
		return type;
	}

	public Document setType(DocumentTypeCode type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public ActiveCurrencyAndAmount getAmount() {
		return amount;
	}

	public Document setAmount(ActiveCurrencyAndAmount amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}

	public List<Agreement> getAgreement() {
		return agreement == null ? agreement = new ArrayList<>() : agreement;
	}

	public Document setAgreement(List<com.tools20022.repository.entity.Agreement> agreement) {
		this.agreement = Objects.requireNonNull(agreement);
		return this;
	}

	public Optional<Location> getPlaceOfIssue() {
		return placeOfIssue == null ? Optional.empty() : Optional.of(placeOfIssue);
	}

	public Document setPlaceOfIssue(com.tools20022.repository.entity.Location placeOfIssue) {
		this.placeOfIssue = placeOfIssue;
		return this;
	}

	public Number getDocumentVersion() {
		return documentVersion;
	}

	public Document setDocumentVersion(Number documentVersion) {
		this.documentVersion = Objects.requireNonNull(documentVersion);
		return this;
	}

	public Max140Text getStatus() {
		return status;
	}

	public Document setStatus(Max140Text status) {
		this.status = Objects.requireNonNull(status);
		return this;
	}

	public List<Reconciliation> getReconciliation() {
		return reconciliation == null ? reconciliation = new ArrayList<>() : reconciliation;
	}

	public Document setReconciliation(List<com.tools20022.repository.entity.Reconciliation> reconciliation) {
		this.reconciliation = Objects.requireNonNull(reconciliation);
		return this;
	}

	public LetterOfCredit getLetterOfCredit() {
		return letterOfCredit;
	}

	public Document setLetterOfCredit(com.tools20022.repository.entity.LetterOfCredit letterOfCredit) {
		this.letterOfCredit = Objects.requireNonNull(letterOfCredit);
		return this;
	}

	public List<DocumentPartyRole> getPartyRole() {
		return partyRole == null ? partyRole = new ArrayList<>() : partyRole;
	}

	public Document setPartyRole(List<com.tools20022.repository.entity.DocumentPartyRole> partyRole) {
		this.partyRole = Objects.requireNonNull(partyRole);
		return this;
	}

	public DataSetTypeCode getDataSetType() {
		return dataSetType;
	}

	public Document setDataSetType(DataSetTypeCode dataSetType) {
		this.dataSetType = Objects.requireNonNull(dataSetType);
		return this;
	}

	public Transport getTransport() {
		return transport;
	}

	public Document setTransport(com.tools20022.repository.entity.Transport transport) {
		this.transport = Objects.requireNonNull(transport);
		return this;
	}

	public YesNoIndicator getSignedIndicator() {
		return signedIndicator;
	}

	public Document setSignedIndicator(YesNoIndicator signedIndicator) {
		this.signedIndicator = Objects.requireNonNull(signedIndicator);
		return this;
	}

	public CurrencyAndAmount getRemittedAmount() {
		return remittedAmount;
	}

	public Document setRemittedAmount(CurrencyAndAmount remittedAmount) {
		this.remittedAmount = Objects.requireNonNull(remittedAmount);
		return this;
	}

	public List<Guarantee> getGuarantee() {
		return guarantee == null ? guarantee = new ArrayList<>() : guarantee;
	}

	public Document setGuarantee(List<com.tools20022.repository.entity.Guarantee> guarantee) {
		this.guarantee = Objects.requireNonNull(guarantee);
		return this;
	}

	public LanguageCode getLanguage() {
		return language;
	}

	public Document setLanguage(LanguageCode language) {
		this.language = Objects.requireNonNull(language);
		return this;
	}

	public Max35Text getPurpose() {
		return purpose;
	}

	public Document setPurpose(Max35Text purpose) {
		this.purpose = Objects.requireNonNull(purpose);
		return this;
	}

	public GenericIdentification getDocumentIdentification() {
		return documentIdentification;
	}

	public Document setDocumentIdentification(com.tools20022.repository.entity.GenericIdentification documentIdentification) {
		this.documentIdentification = Objects.requireNonNull(documentIdentification);
		return this;
	}

	public List<Evidence> getEvidence() {
		return evidence == null ? evidence = new ArrayList<>() : evidence;
	}

	public Document setEvidence(List<com.tools20022.repository.entity.Evidence> evidence) {
		this.evidence = Objects.requireNonNull(evidence);
		return this;
	}

	public List<CommercialTrade> getCommercialTrade() {
		return commercialTrade == null ? commercialTrade = new ArrayList<>() : commercialTrade;
	}

	public Document setCommercialTrade(List<com.tools20022.repository.entity.CommercialTrade> commercialTrade) {
		this.commercialTrade = Objects.requireNonNull(commercialTrade);
		return this;
	}

	public Optional<Presentation> getPresentation() {
		return presentation == null ? Optional.empty() : Optional.of(presentation);
	}

	public Document setPresentation(com.tools20022.repository.entity.Presentation presentation) {
		this.presentation = presentation;
		return this;
	}

	public RegisteredContract getRelatedContract() {
		return relatedContract;
	}

	public Document setRelatedContract(com.tools20022.repository.entity.RegisteredContract relatedContract) {
		this.relatedContract = Objects.requireNonNull(relatedContract);
		return this;
	}
}