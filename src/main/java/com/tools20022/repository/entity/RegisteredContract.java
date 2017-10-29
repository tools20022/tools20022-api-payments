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
import com.tools20022.repository.choice.ContractRegistrationReference1Choice;
import com.tools20022.repository.codeset.CommunicationMethodCode;
import com.tools20022.repository.codeset.PriorityCode;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Contract;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Contract registered for regulatory purpose by a registration agent for the
 * journaling of payments made against the contract.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="RegisteredContract" src="doc-files/RegisteredContract.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegisteredContract#Certificate
 * RegisteredContract.Certificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegisteredContract#ContractBalance
 * RegisteredContract.ContractBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegisteredContract#ReportingParty
 * RegisteredContract.ReportingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegisteredContract#Identification
 * RegisteredContract.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegisteredContract#DeliveryDate
 * RegisteredContract.DeliveryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegisteredContract#RegistrationAgent
 * RegisteredContract.RegistrationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegisteredContract#ReceivingParty
 * RegisteredContract.ReceivingParty}</li>
 * <li>{@linkplain com.tools20022.repository.entity.RegisteredContract#Priority
 * RegisteredContract.Priority}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegisteredContract#RegistrationDate
 * RegisteredContract.RegistrationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegisteredContract#ClosureReason
 * RegisteredContract.ClosureReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegisteredContract#ClosureDate
 * RegisteredContract.ClosureDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegisteredContract#PaymentScheduleType
 * RegisteredContract.PaymentScheduleType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegisteredContract#SubmissionDate
 * RegisteredContract.SubmissionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegisteredContract#SendingParty
 * RegisteredContract.SendingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegisteredContract#DeliveryMethod
 * RegisteredContract.DeliveryMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegisteredContract#SubmissionMethod
 * RegisteredContract.SubmissionMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegisteredContract#RelatedPayment
 * RegisteredContract.RelatedPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegisteredContract#Attachment
 * RegisteredContract.Attachment}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#RelatedCertificate
 * GenericIdentification.RelatedCertificate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#RelatedContract
 * Document.RelatedContract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#ContractRegistration
 * Payment.ContractRegistration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StatusReason#RelatedClosureReason
 * StatusReason.RelatedClosureReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashBalance#RelatedRegisteredContract
 * CashBalance.RelatedRegisteredContract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentTerms#RelatedPaymentScheduleType
 * PaymentTerms.RelatedPaymentScheduleType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegulatoryReportingRole#RelatedReportingParty
 * RegulatoryReportingRole.RelatedReportingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegulatoryReportingRole#RelatedRegistrationAgent
 * RegulatoryReportingRole.RelatedRegistrationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegulatoryReportingRole#RelatedReceivingParty
 * RegulatoryReportingRole.RelatedReceivingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegulatoryReportingRole#RelatedSendingParty
 * RegulatoryReportingRole.RelatedSendingParty}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegisteredContract4#RegisteredContractJournal
 * RegisteredContract4.RegisteredContractJournal}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RegisteredContract4#Amendment
 * RegisteredContract4.Amendment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContractRegistration1#ContractRegistrationOpening
 * ContractRegistration1.ContractRegistrationOpening}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContractRegistrationStatement1#RegisteredContract
 * ContractRegistrationStatement1.RegisteredContract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContractRegistrationStatement1#SupportingDocumentJournal
 * ContractRegistrationStatement1.SupportingDocumentJournal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContractRegistrationStatement1#AdditionalSupportingDocumentJournal
 * ContractRegistrationStatement1.AdditionalSupportingDocumentJournal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegisteredContract1#RegisteredContractAmendment
 * RegisteredContract1.RegisteredContractAmendment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionCertificate1#Amendment
 * TransactionCertificate1.Amendment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionCertificate1#CertificateRecord
 * TransactionCertificate1.CertificateRecord}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SupportingDocument1#Amendment
 * SupportingDocument1.Amendment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegisteredContract5#RegisteredContractJournal
 * RegisteredContract5.RegisteredContractJournal}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RegisteredContract5#Amendment
 * RegisteredContract5.Amendment}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Contract Contract}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.RegisteredContract4
 * RegisteredContract4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ContractRegistration1
 * ContractRegistration1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RegisteredContract2
 * RegisteredContract2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ContractRegistrationStatement1
 * ContractRegistrationStatement1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContractRegistrationStatementRequest1
 * ContractRegistrationStatementRequest1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RegisteredContract1
 * RegisteredContract1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SupportingDocument1
 * SupportingDocument1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RegisteredContractAmendment1
 * RegisteredContractAmendment1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RegisteredContractJournal1
 * RegisteredContractJournal1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentAmendment1
 * DocumentAmendment1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ContractRegistration2
 * ContractRegistration2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ContractRegistrationReference1Choice
 * ContractRegistrationReference1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionCertificateRecord1
 * TransactionCertificateRecord1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RegisteredContract5
 * RegisteredContract5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RegisteredContract3
 * RegisteredContract3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReportingNotification1
 * RegulatoryReportingNotification1}</li>
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
 * "RegisteredContract"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Contract registered for regulatory purpose by a registration agent for the journaling of payments made against the contract."
 * </li>
 * </ul>
 */
public class RegisteredContract extends Contract {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Certificate against which all transactions in the scope of the regulatory
	 * requirements are registered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#RelatedCertificate
	 * GenericIdentification.RelatedCertificate}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SupportingDocument1#Certificate
	 * SupportingDocument1.Certificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReportingNotification1#TransactionCertificate
	 * RegulatoryReportingNotification1.TransactionCertificate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract
	 * RegisteredContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Certificate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Certificate against which all transactions in the scope of the regulatory requirements are registered."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Certificate = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SupportingDocument1.Certificate, com.tools20022.repository.msg.RegulatoryReportingNotification1.TransactionCertificate);
			elementContext_lazy = () -> RegisteredContract.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Certificate";
			definition = "Certificate against which all transactions in the scope of the regulatory requirements are registered.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> GenericIdentification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.RelatedCertificate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Contract balance on date of contract registration.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashBalance#RelatedRegisteredContract
	 * CashBalance.RelatedRegisteredContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashBalance
	 * CashBalance}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract4#ContractBalance
	 * RegisteredContract4.ContractBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContractRegistration2#ContractBalance
	 * ContractRegistration2.ContractBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract5#ContractBalance
	 * RegisteredContract5.ContractBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract3#ContractBalance
	 * RegisteredContract3.ContractBalance}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract
	 * RegisteredContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContractBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Contract balance on date of contract registration."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ContractBalance = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RegisteredContract4.ContractBalance, com.tools20022.repository.msg.ContractRegistration2.ContractBalance,
					com.tools20022.repository.msg.RegisteredContract5.ContractBalance, com.tools20022.repository.msg.RegisteredContract3.ContractBalance);
			elementContext_lazy = () -> RegisteredContract.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ContractBalance";
			definition = "Contract balance on date of contract registration.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CashBalance.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashBalance.RelatedRegisteredContract;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Party which must register the contract for regulatory reporting reasons.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RegulatoryReportingRole#RelatedReportingParty
	 * RegulatoryReportingRole.RelatedReportingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.RegulatoryReportingRole
	 * RegulatoryReportingRole}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract4#ReportingParty
	 * RegisteredContract4.ReportingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContractRegistration1#ReportingParty
	 * ContractRegistration1.ReportingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract2#ReportingParty
	 * RegisteredContract2.ReportingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContractRegistrationStatement1#ReportingParty
	 * ContractRegistrationStatement1.ReportingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyControlGroupStatus1#ReportingParty
	 * CurrencyControlGroupStatus1.ReportingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContractRegistrationStatementRequest1#ReportingParty
	 * ContractRegistrationStatementRequest1.ReportingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract1#ReportingParty
	 * RegisteredContract1.ReportingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SupportingDocument1#AccountOwner
	 * SupportingDocument1.AccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReportingNotification1#AccountOwner
	 * RegulatoryReportingNotification1.AccountOwner}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract
	 * RegisteredContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party which must register the contract for regulatory reporting reasons."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ReportingParty = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RegisteredContract4.ReportingParty, com.tools20022.repository.msg.ContractRegistration1.ReportingParty,
					com.tools20022.repository.msg.RegisteredContract2.ReportingParty, com.tools20022.repository.msg.ContractRegistrationStatement1.ReportingParty, com.tools20022.repository.msg.CurrencyControlGroupStatus1.ReportingParty,
					com.tools20022.repository.msg.ContractRegistrationStatementRequest1.ReportingParty, com.tools20022.repository.msg.RegisteredContract1.ReportingParty, com.tools20022.repository.msg.SupportingDocument1.AccountOwner,
					com.tools20022.repository.msg.RegulatoryReportingNotification1.AccountOwner);
			elementContext_lazy = () -> RegisteredContract.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReportingParty";
			definition = "Party which must register the contract for regulatory reporting reasons.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> RegulatoryReportingRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.RegulatoryReportingRole.RelatedReportingParty;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Unique and unambiguous identification of the registered contract.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract4#RegisteredContractIdentification
	 * RegisteredContract4.RegisteredContractIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract4#PreviousRegisteredContractIdentification
	 * RegisteredContract4.PreviousRegisteredContractIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContractRegistration1#ContractRegistrationIdentification
	 * ContractRegistration1.ContractRegistrationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract2#RegisteredContractClosureIdentification
	 * RegisteredContract2.RegisteredContractClosureIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract2#OriginalRegisteredContract
	 * RegisteredContract2.OriginalRegisteredContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContractRegistrationStatementRequest1#RegisteredContractIdentification
	 * ContractRegistrationStatementRequest1.RegisteredContractIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract1#ContractRegistrationAmendmentIdentification
	 * RegisteredContract1.ContractRegistrationAmendmentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SupportingDocument1#ContractReference
	 * SupportingDocument1.ContractReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegisteredContractJournal1#UniqueIdentification
	 * RegisteredContractJournal1.UniqueIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentAmendment1#OriginalDocumentIdentification
	 * DocumentAmendment1.OriginalDocumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContractRegistration2#PreviousRegistrationIdentification
	 * ContractRegistration2.PreviousRegistrationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ContractRegistrationReference1Choice#RegisteredContractIdentification
	 * ContractRegistrationReference1Choice.RegisteredContractIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract5#RegisteredContractIdentification
	 * RegisteredContract5.RegisteredContractIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract5#PreviousRegisteredContractIdentification
	 * RegisteredContract5.PreviousRegisteredContractIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract3#RegisteredContractAmendmentIdentification
	 * RegisteredContract3.RegisteredContractAmendmentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract3#OriginalRegisteredContractIdentification
	 * RegisteredContract3.OriginalRegisteredContractIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReportingNotification1#TransactionNotificationIdentification
	 * RegulatoryReportingNotification1.TransactionNotificationIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract
	 * RegisteredContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification of the registered contract."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Identification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RegisteredContract4.RegisteredContractIdentification, com.tools20022.repository.msg.RegisteredContract4.PreviousRegisteredContractIdentification,
					com.tools20022.repository.msg.ContractRegistration1.ContractRegistrationIdentification, com.tools20022.repository.msg.RegisteredContract2.RegisteredContractClosureIdentification,
					com.tools20022.repository.msg.RegisteredContract2.OriginalRegisteredContract, com.tools20022.repository.msg.ContractRegistrationStatementRequest1.RegisteredContractIdentification,
					com.tools20022.repository.msg.RegisteredContract1.ContractRegistrationAmendmentIdentification, com.tools20022.repository.msg.SupportingDocument1.ContractReference,
					com.tools20022.repository.msg.RegisteredContractJournal1.UniqueIdentification, com.tools20022.repository.msg.DocumentAmendment1.OriginalDocumentIdentification,
					com.tools20022.repository.msg.ContractRegistration2.PreviousRegistrationIdentification, com.tools20022.repository.choice.ContractRegistrationReference1Choice.RegisteredContractIdentification,
					com.tools20022.repository.msg.RegisteredContract5.RegisteredContractIdentification, com.tools20022.repository.msg.RegisteredContract5.PreviousRegisteredContractIdentification,
					com.tools20022.repository.msg.RegisteredContract3.RegisteredContractAmendmentIdentification, com.tools20022.repository.msg.RegisteredContract3.OriginalRegisteredContractIdentification,
					com.tools20022.repository.msg.RegulatoryReportingNotification1.TransactionNotificationIdentification);
			elementContext_lazy = () -> RegisteredContract.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identification of the registered contract.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Provides the date for the delivery of the registered contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract
	 * RegisteredContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the date for the delivery of the registered contract."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute DeliveryDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> RegisteredContract.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DeliveryDate";
			definition = "Provides the date for the delivery of the registered contract.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Agent which is in charge of the registration of the contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RegulatoryReportingRole#RelatedRegistrationAgent
	 * RegulatoryReportingRole.RelatedRegistrationAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.RegulatoryReportingRole
	 * RegulatoryReportingRole}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract4#RegistrationAgent
	 * RegisteredContract4.RegistrationAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract4#IssuerFinancialInstitution
	 * RegisteredContract4.IssuerFinancialInstitution}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContractRegistration1#RegistrationAgent
	 * ContractRegistration1.RegistrationAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract2#RegistrationAgent
	 * RegisteredContract2.RegistrationAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContractRegistrationStatement1#RegistrationAgent
	 * ContractRegistrationStatement1.RegistrationAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyControlGroupStatus1#RegistrationAgent
	 * CurrencyControlGroupStatus1.RegistrationAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContractRegistrationStatementRequest1#RegistrationAgent
	 * ContractRegistrationStatementRequest1.RegistrationAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract1#RegistrationAgent
	 * RegisteredContract1.RegistrationAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SupportingDocument1#AccountServicer
	 * SupportingDocument1.AccountServicer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegisteredContractJournal1#RegistrationAgent
	 * RegisteredContractJournal1.RegistrationAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract5#IssuerFinancialInstitution
	 * RegisteredContract5.IssuerFinancialInstitution}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReportingNotification1#AccountServicer
	 * RegulatoryReportingNotification1.AccountServicer}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract
	 * RegisteredContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agent which is in charge of the registration of the contract."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RegistrationAgent = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RegisteredContract4.RegistrationAgent, com.tools20022.repository.msg.RegisteredContract4.IssuerFinancialInstitution,
					com.tools20022.repository.msg.ContractRegistration1.RegistrationAgent, com.tools20022.repository.msg.RegisteredContract2.RegistrationAgent, com.tools20022.repository.msg.ContractRegistrationStatement1.RegistrationAgent,
					com.tools20022.repository.msg.CurrencyControlGroupStatus1.RegistrationAgent, com.tools20022.repository.msg.ContractRegistrationStatementRequest1.RegistrationAgent,
					com.tools20022.repository.msg.RegisteredContract1.RegistrationAgent, com.tools20022.repository.msg.SupportingDocument1.AccountServicer, com.tools20022.repository.msg.RegisteredContractJournal1.RegistrationAgent,
					com.tools20022.repository.msg.RegisteredContract5.IssuerFinancialInstitution, com.tools20022.repository.msg.RegulatoryReportingNotification1.AccountServicer);
			elementContext_lazy = () -> RegisteredContract.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RegistrationAgent";
			definition = "Agent which is in charge of the registration of the contract.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> RegulatoryReportingRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.RegulatoryReportingRole.RelatedRegistrationAgent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Party which receives support information about the registered contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RegulatoryReportingRole#RelatedReceivingParty
	 * RegulatoryReportingRole.RelatedReceivingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.RegulatoryReportingRole
	 * RegulatoryReportingRole}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1#Receiver
	 * SupportingDocumentRequestOrLetter1.Receiver}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract
	 * RegisteredContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party which receives support information about the registered contract."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ReceivingParty = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1.Receiver);
			elementContext_lazy = () -> RegisteredContract.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReceivingParty";
			definition = "Party which receives support information about the registered contract.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> RegulatoryReportingRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.RegulatoryReportingRole.RelatedReceivingParty;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Priority requested for the registered contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.PriorityCode
	 * PriorityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract2#Priority
	 * RegisteredContract2.Priority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContractRegistration2#Priority
	 * ContractRegistration2.Priority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract3#Priority
	 * RegisteredContract3.Priority}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract
	 * RegisteredContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Priority"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Priority requested for the registered contract."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Priority = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RegisteredContract2.Priority, com.tools20022.repository.msg.ContractRegistration2.Priority, com.tools20022.repository.msg.RegisteredContract3.Priority);
			elementContext_lazy = () -> RegisteredContract.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Priority";
			definition = "Priority requested for the registered contract.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PriorityCode.mmObject();
		}
	};
	/**
	 * Provides the date for the registration of the registered contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract
	 * RegisteredContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the date for the registration of the registered contract."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RegistrationDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> RegisteredContract.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RegistrationDate";
			definition = "Provides the date for the registration of the registered contract.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Reason of closure of the contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#RelatedClosureReason
	 * StatusReason.RelatedClosureReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.StatusReason
	 * StatusReason}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract2#ClosureReason
	 * RegisteredContract2.ClosureReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegisteredContractJournal1#ClosureReason
	 * RegisteredContractJournal1.ClosureReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract
	 * RegisteredContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosureReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason of closure of the contract. "</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ClosureReason = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RegisteredContract2.ClosureReason, com.tools20022.repository.msg.RegisteredContractJournal1.ClosureReason);
			elementContext_lazy = () -> RegisteredContract.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClosureReason";
			definition = "Reason of closure of the contract. ";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> StatusReason.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.StatusReason.RelatedClosureReason;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Date of closure of the contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract
	 * RegisteredContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosureDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date of closure of the contract. "</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ClosureDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> RegisteredContract.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClosureDate";
			definition = "Date of closure of the contract. ";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Type of the payment schedule provided in the contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentTerms#RelatedPaymentScheduleType
	 * PaymentTerms.RelatedPaymentScheduleType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentTerms
	 * PaymentTerms}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract4#PaymentScheduleType
	 * RegisteredContract4.PaymentScheduleType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContractRegistration2#PaymentScheduleType
	 * ContractRegistration2.PaymentScheduleType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract5#PaymentScheduleType
	 * RegisteredContract5.PaymentScheduleType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract3#PaymentScheduleType
	 * RegisteredContract3.PaymentScheduleType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract
	 * RegisteredContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentScheduleType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of the payment schedule provided in the contract."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PaymentScheduleType = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RegisteredContract4.PaymentScheduleType, com.tools20022.repository.msg.ContractRegistration2.PaymentScheduleType,
					com.tools20022.repository.msg.RegisteredContract5.PaymentScheduleType, com.tools20022.repository.msg.RegisteredContract3.PaymentScheduleType);
			elementContext_lazy = () -> RegisteredContract.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentScheduleType";
			definition = "Type of the payment schedule provided in the contract.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> PaymentTerms.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentTerms.RelatedPaymentScheduleType;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Provides the date for the submission of the registered contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegisteredContractAmendment1#AmendmentDate
	 * RegisteredContractAmendment1.AmendmentDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract
	 * RegisteredContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubmissionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the date for the submission of the registered contract."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SubmissionDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RegisteredContractAmendment1.AmendmentDate);
			elementContext_lazy = () -> RegisteredContract.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SubmissionDate";
			definition = "Provides the date for the submission of the registered contract.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Party which sends support information about the registered contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RegulatoryReportingRole#RelatedSendingParty
	 * RegulatoryReportingRole.RelatedSendingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.RegulatoryReportingRole
	 * RegulatoryReportingRole}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1#Sender
	 * SupportingDocumentRequestOrLetter1.Sender}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract
	 * RegisteredContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SendingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party which sends support information about the registered contract."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SendingParty = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1.Sender);
			elementContext_lazy = () -> RegisteredContract.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SendingParty";
			definition = "Party which sends support information about the registered contract.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> RegulatoryReportingRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.RegulatoryReportingRole.RelatedSendingParty;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Provides the communication method for the delivery of the registered
	 * contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CommunicationMethodCode
	 * CommunicationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract4#Delivery
	 * RegisteredContract4.Delivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract5#Delivery
	 * RegisteredContract5.Delivery}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract
	 * RegisteredContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the communication method for the delivery of the registered contract."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute DeliveryMethod = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RegisteredContract4.Delivery, com.tools20022.repository.msg.RegisteredContract5.Delivery);
			elementContext_lazy = () -> RegisteredContract.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DeliveryMethod";
			definition = "Provides the communication method for the delivery of the registered contract.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CommunicationMethodCode.mmObject();
		}
	};
	/**
	 * Provides the communication method for the submission of the registered
	 * contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CommunicationMethodCode
	 * CommunicationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract4#Submission
	 * RegisteredContract4.Submission}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract5#Submission
	 * RegisteredContract5.Submission}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract
	 * RegisteredContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubmissionMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the communication method for the submission of the registered contract."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SubmissionMethod = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RegisteredContract4.Submission, com.tools20022.repository.msg.RegisteredContract5.Submission);
			elementContext_lazy = () -> RegisteredContract.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SubmissionMethod";
			definition = "Provides the communication method for the submission of the registered contract.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CommunicationMethodCode.mmObject();
		}
	};
	/**
	 * Provides the payment related of the registered contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Payment#ContractRegistration
	 * Payment.ContractRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract
	 * RegisteredContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the payment related of the registered contract."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedPayment = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> RegisteredContract.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPayment";
			definition = "Provides the payment related of the registered contract.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Payment.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.ContractRegistration;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Documents provided as attachments to the registered contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Document#RelatedContract
	 * Document.RelatedContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Document Document}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1#Attachment
	 * SupportingDocumentRequestOrLetter1.Attachment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentEntry1#Attachment
	 * SupportingDocumentEntry1.Attachment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContractRegistration2#Attachment
	 * ContractRegistration2.Attachment}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeContract1#Attachment
	 * TradeContract1.Attachment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionCertificateRecord1#Attachment
	 * TransactionCertificateRecord1.Attachment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract3#Attachment
	 * RegisteredContract3.Attachment}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LoanContract1#Attachment
	 * LoanContract1.Attachment}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract
	 * RegisteredContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Attachment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Documents provided as attachments to the registered contract."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Attachment = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1.Attachment, com.tools20022.repository.msg.SupportingDocumentEntry1.Attachment,
					com.tools20022.repository.msg.ContractRegistration2.Attachment, com.tools20022.repository.msg.TradeContract1.Attachment, com.tools20022.repository.msg.TransactionCertificateRecord1.Attachment,
					com.tools20022.repository.msg.RegisteredContract3.Attachment, com.tools20022.repository.msg.LoanContract1.Attachment);
			elementContext_lazy = () -> RegisteredContract.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Attachment";
			definition = "Documents provided as attachments to the registered contract.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Document.RelatedContract;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RegisteredContract";
				definition = "Contract registered for regulatory purpose by a registration agent for the journaling of payments made against the contract.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GenericIdentification.RelatedCertificate, com.tools20022.repository.entity.Document.RelatedContract,
						com.tools20022.repository.entity.Payment.ContractRegistration, com.tools20022.repository.entity.StatusReason.RelatedClosureReason, com.tools20022.repository.entity.CashBalance.RelatedRegisteredContract,
						com.tools20022.repository.entity.PaymentTerms.RelatedPaymentScheduleType, com.tools20022.repository.entity.RegulatoryReportingRole.RelatedReportingParty,
						com.tools20022.repository.entity.RegulatoryReportingRole.RelatedRegistrationAgent, com.tools20022.repository.entity.RegulatoryReportingRole.RelatedReceivingParty,
						com.tools20022.repository.entity.RegulatoryReportingRole.RelatedSendingParty);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RegisteredContract4.RegisteredContractJournal, com.tools20022.repository.msg.RegisteredContract4.Amendment,
						com.tools20022.repository.msg.ContractRegistration1.ContractRegistrationOpening, com.tools20022.repository.msg.ContractRegistrationStatement1.RegisteredContract,
						com.tools20022.repository.msg.ContractRegistrationStatement1.SupportingDocumentJournal, com.tools20022.repository.msg.ContractRegistrationStatement1.AdditionalSupportingDocumentJournal,
						com.tools20022.repository.msg.RegisteredContract1.RegisteredContractAmendment, com.tools20022.repository.msg.TransactionCertificate1.Amendment,
						com.tools20022.repository.msg.TransactionCertificate1.CertificateRecord, com.tools20022.repository.msg.SupportingDocument1.Amendment, com.tools20022.repository.msg.RegisteredContract5.RegisteredContractJournal,
						com.tools20022.repository.msg.RegisteredContract5.Amendment);
				superType_lazy = () -> Contract.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.RegisteredContract.Certificate, com.tools20022.repository.entity.RegisteredContract.ContractBalance,
						com.tools20022.repository.entity.RegisteredContract.ReportingParty, com.tools20022.repository.entity.RegisteredContract.Identification, com.tools20022.repository.entity.RegisteredContract.DeliveryDate,
						com.tools20022.repository.entity.RegisteredContract.RegistrationAgent, com.tools20022.repository.entity.RegisteredContract.ReceivingParty, com.tools20022.repository.entity.RegisteredContract.Priority,
						com.tools20022.repository.entity.RegisteredContract.RegistrationDate, com.tools20022.repository.entity.RegisteredContract.ClosureReason, com.tools20022.repository.entity.RegisteredContract.ClosureDate,
						com.tools20022.repository.entity.RegisteredContract.PaymentScheduleType, com.tools20022.repository.entity.RegisteredContract.SubmissionDate, com.tools20022.repository.entity.RegisteredContract.SendingParty,
						com.tools20022.repository.entity.RegisteredContract.DeliveryMethod, com.tools20022.repository.entity.RegisteredContract.SubmissionMethod, com.tools20022.repository.entity.RegisteredContract.RelatedPayment,
						com.tools20022.repository.entity.RegisteredContract.Attachment);
				derivationComponent_lazy = () -> Arrays.asList(RegisteredContract4.mmObject(), ContractRegistration1.mmObject(), RegisteredContract2.mmObject(), ContractRegistrationStatement1.mmObject(),
						ContractRegistrationStatementRequest1.mmObject(), RegisteredContract1.mmObject(), SupportingDocument1.mmObject(), RegisteredContractAmendment1.mmObject(), RegisteredContractJournal1.mmObject(),
						DocumentAmendment1.mmObject(), ContractRegistration2.mmObject(), ContractRegistrationReference1Choice.mmObject(), TransactionCertificateRecord1.mmObject(), RegisteredContract5.mmObject(),
						RegisteredContract3.mmObject(), RegulatoryReportingNotification1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}