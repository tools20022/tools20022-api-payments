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
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Information related to a non-standardised identification, such as a
 * proprietary party identification or account identification.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="GenericIdentification"
 * src="doc-files/GenericIdentification.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#Identification
 * GenericIdentification.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#IdentificationForContactPoint
 * GenericIdentification.IdentificationForContactPoint}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#IdentificationForAccount
 * GenericIdentification.IdentificationForAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#RelatedPartyIdentification
 * GenericIdentification.RelatedPartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#IssueDate
 * GenericIdentification.IssueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#ExpiryDate
 * GenericIdentification.ExpiryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#Scheme
 * GenericIdentification.Scheme}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#IdentificationForSecuritiesCertificate
 * GenericIdentification.IdentificationForSecuritiesCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#IdentificationForLot
 * GenericIdentification.IdentificationForLot}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#PartyRole
 * GenericIdentification.PartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#IdentificationForCashProceedsIncome
 * GenericIdentification.IdentificationForCashProceedsIncome}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#RelatedStatusReason
 * GenericIdentification.RelatedStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#IdentificationForBankTransaction
 * GenericIdentification.IdentificationForBankTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#IdentificationForAccountCostReferencePattern
 * GenericIdentification.IdentificationForAccountCostReferencePattern}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#Account
 * GenericIdentification.Account}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#RelatedSystemIdentification
 * GenericIdentification.RelatedSystemIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#IdentificationForInterestName
 * GenericIdentification.IdentificationForInterestName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#RelatedCashAccountService
 * GenericIdentification.RelatedCashAccountService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#IdentificationForInvestmentFundClass
 * GenericIdentification.IdentificationForInvestmentFundClass}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#IdentifiedLocation
 * GenericIdentification.IdentifiedLocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#RelatedSecuritiesIdentification
 * GenericIdentification.RelatedSecuritiesIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#IdentifiedDocument
 * GenericIdentification.IdentifiedDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#RelatedPurchaseOrder
 * GenericIdentification.RelatedPurchaseOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#RelatedCertificate
 * GenericIdentification.RelatedCertificate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#FundClassification
 * InvestmentFundClass.FundClassification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#GenericIdentification
 * SecuritiesIdentification.GenericIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InformationPartyRole#GenericIdentification
 * InformationPartyRole.GenericIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ContactPoint#Identification
 * ContactPoint.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#OtherIdentification
 * PartyIdentificationInformation.OtherIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#Type Account.Type}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountIdentification#ProprietaryIdentification
 * AccountIdentification.ProprietaryIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountIdentification#CostReferencePattern
 * AccountIdentification.CostReferencePattern}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Location#Identification
 * Location.Identification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Scheme#Identification
 * Scheme.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Document#DocumentIdentification
 * Document.DocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StatusReason#DataSourceScheme
 * StatusReason.DataSourceScheme}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemIdentification#Identification
 * SystemIdentification.Identification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LotBreakdown#LotNumber
 * LotBreakdown.LotNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccountService#Identification
 * CashAccountService.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesCertificate#Number
 * SecuritiesCertificate.Number}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#InterestName
 * Interest.InterestName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#IncomeType
 * CashProceedsDefinition.IncomeType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BankTransaction#ProprietaryIdentification
 * BankTransaction.ProprietaryIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PurchaseOrder#Identification
 * PurchaseOrder.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegisteredContract#Certificate
 * RegisteredContract.Certificate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification32#Type
 * GenericIdentification32.Type}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification1
 * GenericIdentification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification13
 * GenericIdentification13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification3
 * GenericIdentification3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProprietaryBankTransactionCodeStructure1
 * ProprietaryBankTransactionCodeStructure1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification32
 * GenericIdentification32}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification30
 * GenericIdentification30}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingSubServiceIdentification1
 * BillingSubServiceIdentification1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingServiceCommonIdentification1
 * BillingServiceCommonIdentification1}</li>
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
 * "GenericIdentification"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information related to a non-standardised identification, such as a proprietary party identification or account identification."
 * </li>
 * </ul>
 */
public class GenericIdentification {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Name or number assigned by an entity to enable recognition of that
	 * entity, for example account identifier, identification assigned by a
	 * provider to identify its customers.
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
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification1#Identification
	 * GenericIdentification1.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification13#Identification
	 * GenericIdentification13.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ClearingSystemMemberIdentification2#MemberIdentification
	 * ClearingSystemMemberIdentification2.MemberIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification3#Identification
	 * GenericIdentification3.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericFinancialIdentification1#Identification
	 * GenericFinancialIdentification1.Identification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BranchData2#Identification
	 * BranchData2.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericAccountIdentification1#Identification
	 * GenericAccountIdentification1.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericOrganisationIdentification1#Identification
	 * GenericOrganisationIdentification1.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericPersonIdentification1#Identification
	 * GenericPersonIdentification1.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherIdentification1#Identification
	 * OtherIdentification1.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProprietaryBankTransactionCodeStructure1#Code
	 * ProprietaryBankTransactionCodeStructure1.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification32#Identification
	 * GenericIdentification32.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent1#ManufacturerIdentification
	 * PointOfInteractionComponent1.ManufacturerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IdentificationModification2#Identification
	 * IdentificationModification2.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification22#Identification
	 * DocumentIdentification22.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification30#Identification
	 * GenericIdentification30.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingSubServiceIdentification1#Issuer
	 * BillingSubServiceIdentification1.Issuer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingSubServiceIdentification1#Identification
	 * BillingSubServiceIdentification1.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServiceCommonIdentification1#Identification
	 * BillingServiceCommonIdentification1.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingTaxRegion1#InvoiceNumber
	 * BillingTaxRegion1.InvoiceNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DocumentLineType1#Issuer
	 * DocumentLineType1.Issuer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentLineInformation1#Identification
	 * DocumentLineInformation1.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification29#Identification
	 * DocumentIdentification29.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentEntry1#EntryIdentification
	 * SupportingDocumentEntry1.EntryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentGeneralInformation3#DocumentNumber
	 * DocumentGeneralInformation3.DocumentNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeContract1#ContractDocumentIdentification
	 * TradeContract1.ContractDocumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestPaymentDateRange1#InterestScheduleIdentification
	 * InterestPaymentDateRange1.InterestScheduleIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LegalOrganisation2#Identification
	 * LegalOrganisation2.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification28#Identification
	 * DocumentIdentification28.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionCertificateRecord1#CertificateRecordIdentification
	 * TransactionCertificateRecord1.CertificateRecordIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ContractClosureReason1Choice#Code
	 * ContractClosureReason1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ContractClosureReason1Choice#Proprietary
	 * ContractClosureReason1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReferredDocumentInformation7#Number
	 * ReferredDocumentInformation7.Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingStatement2#StatementIdentification
	 * BillingStatement2.StatementIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate10#MandateIdentification
	 * Mandate10.MandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RemittanceInformation13#RemittanceIdentification
	 * RemittanceInformation13.RemittanceIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate9#MandateIdentification
	 * Mandate9.MandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate11#MandateIdentification
	 * Mandate11.MandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReferredMandateDocument1#Number
	 * ReferredMandateDocument1.Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate8#MandateIdentification
	 * Mandate8.MandateIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name or number assigned by an entity to enable recognition of that entity, for example account identifier, identification assigned by a provider to identify its customers."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Identification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.GenericIdentification1.Identification, com.tools20022.repository.msg.GenericIdentification13.Identification,
					com.tools20022.repository.msg.ClearingSystemMemberIdentification2.MemberIdentification, com.tools20022.repository.msg.GenericIdentification3.Identification,
					com.tools20022.repository.msg.GenericFinancialIdentification1.Identification, com.tools20022.repository.msg.BranchData2.Identification, com.tools20022.repository.msg.GenericAccountIdentification1.Identification,
					com.tools20022.repository.msg.GenericOrganisationIdentification1.Identification, com.tools20022.repository.msg.GenericPersonIdentification1.Identification,
					com.tools20022.repository.msg.OtherIdentification1.Identification, com.tools20022.repository.msg.ProprietaryBankTransactionCodeStructure1.Code, com.tools20022.repository.msg.GenericIdentification32.Identification,
					com.tools20022.repository.msg.PointOfInteractionComponent1.ManufacturerIdentification, com.tools20022.repository.msg.IdentificationModification2.Identification,
					com.tools20022.repository.msg.DocumentIdentification22.Identification, com.tools20022.repository.msg.GenericIdentification30.Identification, com.tools20022.repository.msg.BillingSubServiceIdentification1.Issuer,
					com.tools20022.repository.msg.BillingSubServiceIdentification1.Identification, com.tools20022.repository.msg.BillingServiceCommonIdentification1.Identification,
					com.tools20022.repository.msg.BillingTaxRegion1.InvoiceNumber, com.tools20022.repository.msg.DocumentLineType1.Issuer, com.tools20022.repository.msg.DocumentLineInformation1.Identification,
					com.tools20022.repository.msg.DocumentIdentification29.Identification, com.tools20022.repository.msg.SupportingDocumentEntry1.EntryIdentification,
					com.tools20022.repository.msg.DocumentGeneralInformation3.DocumentNumber, com.tools20022.repository.msg.TradeContract1.ContractDocumentIdentification,
					com.tools20022.repository.msg.InterestPaymentDateRange1.InterestScheduleIdentification, com.tools20022.repository.msg.LegalOrganisation2.Identification,
					com.tools20022.repository.msg.DocumentIdentification28.Identification, com.tools20022.repository.msg.TransactionCertificateRecord1.CertificateRecordIdentification,
					com.tools20022.repository.choice.ContractClosureReason1Choice.Code, com.tools20022.repository.choice.ContractClosureReason1Choice.Proprietary, com.tools20022.repository.msg.ReferredDocumentInformation7.Number,
					com.tools20022.repository.msg.BillingStatement2.StatementIdentification, com.tools20022.repository.msg.Mandate10.MandateIdentification, com.tools20022.repository.msg.RemittanceInformation13.RemittanceIdentification,
					com.tools20022.repository.msg.Mandate9.MandateIdentification, com.tools20022.repository.msg.Mandate11.MandateIdentification, com.tools20022.repository.msg.ReferredMandateDocument1.Number,
					com.tools20022.repository.msg.Mandate8.MandateIdentification);
			elementContext_lazy = () -> GenericIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Name or number assigned by an entity to enable recognition of that entity, for example account identifier, identification assigned by a provider to identify its customers.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Contact point which uses a generic identification as identification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint#Identification
	 * ContactPoint.Identification}</li>
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
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentificationForContactPoint"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contact point which uses a generic identification as identification."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd IdentificationForContactPoint = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> GenericIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IdentificationForContactPoint";
			definition = "Contact point which uses a generic identification as identification.";
			minOccurs = 0;
			type_lazy = () -> ContactPoint.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPoint.Identification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Account Identification which uses a generic identification as proprietary
	 * identification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification#ProprietaryIdentification
	 * AccountIdentification.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification
	 * AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentificationForAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account Identification which uses a generic identification as proprietary identification."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd IdentificationForAccount = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> GenericIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IdentificationForAccount";
			definition = "Account Identification which uses a generic identification as proprietary identification.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> AccountIdentification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AccountIdentification.ProprietaryIdentification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Party identified with a scheme.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#OtherIdentification
	 * PartyIdentificationInformation.OtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPartyIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party identified with a scheme."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedPartyIdentification = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> GenericIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPartyIdentification";
			definition = "Party identified with a scheme.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> PartyIdentificationInformation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.OtherIdentification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Date at which the identification was issued.
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
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date at which the identification was issued."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute IssueDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> GenericIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IssueDate";
			definition = "Date at which the identification was issued.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Date at which the identification expires.
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
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date at which the identification expires."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ExpiryDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> GenericIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExpiryDate";
			definition = "Date at which the identification expires.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Information regarding an enumerated code list and its owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Scheme#Identification
	 * Scheme.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Scheme Scheme}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericFinancialIdentification1#SchemeName
	 * GenericFinancialIdentification1.SchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericAccountIdentification1#SchemeName
	 * GenericAccountIdentification1.SchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericOrganisationIdentification1#SchemeName
	 * GenericOrganisationIdentification1.SchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericPersonIdentification1#SchemeName
	 * GenericPersonIdentification1.SchemeName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Scheme"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information regarding an enumerated code list and its owner."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Scheme = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.GenericFinancialIdentification1.SchemeName, com.tools20022.repository.msg.GenericAccountIdentification1.SchemeName,
					com.tools20022.repository.msg.GenericOrganisationIdentification1.SchemeName, com.tools20022.repository.msg.GenericPersonIdentification1.SchemeName);
			elementContext_lazy = () -> GenericIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Scheme";
			definition = "Information regarding an enumerated code list and its owner.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Scheme.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Scheme.Identification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities certificate which uses a generic identification as certificate
	 * number.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesCertificate#Number
	 * SecuritiesCertificate.Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesCertificate
	 * SecuritiesCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentificationForSecuritiesCertificate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities certificate which uses a generic identification as certificate number."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd IdentificationForSecuritiesCertificate = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> GenericIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IdentificationForSecuritiesCertificate";
			definition = "Securities certificate which uses a generic identification as certificate number.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesCertificate.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesCertificate.Number;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Lot breakdown which uses a generic identification as lot number.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LotBreakdown#LotNumber
	 * LotBreakdown.LotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.LotBreakdown
	 * LotBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentificationForLot"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Lot breakdown which uses a generic identification as lot number."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd IdentificationForLot = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> GenericIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IdentificationForLot";
			definition = "Lot breakdown which uses a generic identification as lot number.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> LotBreakdown.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.LotBreakdown.LotNumber;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Entity that assigns the identification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InformationPartyRole#GenericIdentification
	 * InformationPartyRole.GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InformationPartyRole
	 * InformationPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Entity that assigns the identification."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> GenericIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Entity that assigns the identification.";
			minOccurs = 0;
			type_lazy = () -> InformationPartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InformationPartyRole.GenericIdentification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Cash proceeds definition which uses a generic identification as type of
	 * income.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#IncomeType
	 * CashProceedsDefinition.IncomeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition
	 * CashProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentificationForCashProceedsIncome"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash proceeds definition which uses a generic identification as type of income."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd IdentificationForCashProceedsIncome = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> GenericIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IdentificationForCashProceedsIncome";
			definition = "Cash proceeds definition which uses a generic identification as type of income.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CashProceedsDefinition.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashProceedsDefinition.IncomeType;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the status reason for which a data source scheme is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#DataSourceScheme
	 * StatusReason.DataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.StatusReason
	 * StatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedStatusReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the status reason for which a data source scheme is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedStatusReason = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> GenericIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedStatusReason";
			definition = "Specifies the status reason for which a data source scheme is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> StatusReason.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.StatusReason.DataSourceScheme;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Bank transaction which uses a generic identification as proprietary
	 * identification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BankTransaction#ProprietaryIdentification
	 * BankTransaction.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BankTransaction
	 * BankTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentificationForBankTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Bank transaction which uses a generic identification as proprietary identification."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd IdentificationForBankTransaction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> GenericIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IdentificationForBankTransaction";
			definition = "Bank transaction which uses a generic identification as proprietary identification.";
			minOccurs = 0;
			type_lazy = () -> BankTransaction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.BankTransaction.ProprietaryIdentification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Account identification for which a cost reference pattern is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification#CostReferencePattern
	 * AccountIdentification.CostReferencePattern}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification
	 * AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentificationForAccountCostReferencePattern"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account identification for which a cost reference pattern is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd IdentificationForAccountCostReferencePattern = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> GenericIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IdentificationForAccountCostReferencePattern";
			definition = "Account identification for which a cost reference pattern is provided.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> AccountIdentification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AccountIdentification.CostReferencePattern;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Account for which a type is specified
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Account#Type
	 * Account.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Account Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account for which a type is specified"</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Account = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> GenericIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Account";
			definition = "Account for which a type is specified";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Account.Type;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * System identification which uses a generic identification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SystemIdentification#Identification
	 * SystemIdentification.Identification}</li>
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
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedSystemIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "System identification which uses a generic identification."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedSystemIdentification = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> GenericIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedSystemIdentification";
			definition = "System identification which uses a generic identification.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SystemIdentification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SystemIdentification.Identification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Interest which uses a generic identification as name.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Interest#InterestName
	 * Interest.InterestName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Interest Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentificationForInterestName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Interest which uses a generic identification as name."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd IdentificationForInterestName = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> GenericIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IdentificationForInterestName";
			definition = "Interest which uses a generic identification as name.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Interest.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Interest.InterestName;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Cash account service identified in a generic way.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountService#Identification
	 * CashAccountService.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccountService
	 * CashAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCashAccountService"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash account service identified in a generic way."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedCashAccountService = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> GenericIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCashAccountService";
			definition = "Cash account service identified in a generic way.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CashAccountService.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccountService.Identification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Investment fund class which uses a generic identification as fund
	 * classification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#FundClassification
	 * InvestmentFundClass.FundClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentificationForInvestmentFundClass"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment fund class which uses a generic identification as fund classification."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd IdentificationForInvestmentFundClass = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> GenericIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IdentificationForInvestmentFundClass";
			definition = "Investment fund class which uses a generic identification as fund classification.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> InvestmentFundClass.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.FundClassification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Location for which an identification is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Location#Identification
	 * Location.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Location Location}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentifiedLocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Location for which an identification is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd IdentifiedLocation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> GenericIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IdentifiedLocation";
			definition = "Location for which an identification is provided.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Location.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Location.Identification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities identification for which generic identification elements and
	 * scheme are provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#GenericIdentification
	 * SecuritiesIdentification.GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedSecuritiesIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities identification for which generic identification elements and scheme are provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedSecuritiesIdentification = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> GenericIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedSecuritiesIdentification";
			definition = "Securities identification for which generic identification elements and scheme are provided.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesIdentification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.GenericIdentification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Document for which an identification is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Document#DocumentIdentification
	 * Document.DocumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Document Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentifiedDocument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Document for which an identification is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd IdentifiedDocument = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> GenericIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IdentifiedDocument";
			definition = "Document for which an identification is provided.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Document.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Document.DocumentIdentification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Purchase order for which an identification is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PurchaseOrder#Identification
	 * PurchaseOrder.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PurchaseOrder
	 * PurchaseOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPurchaseOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Purchase order for which an identification is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedPurchaseOrder = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> GenericIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPurchaseOrder";
			definition = "Purchase order for which an identification is provided.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> PurchaseOrder.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PurchaseOrder.Identification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Related certificate against which all transactions in the scope of the
	 * regulatory requirements are registered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract#Certificate
	 * RegisteredContract.Certificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RegisteredContract
	 * RegisteredContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCertificate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Related certificate against which all transactions in the scope of the regulatory requirements are registered."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedCertificate = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> GenericIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCertificate";
			definition = "Related certificate against which all transactions in the scope of the regulatory requirements are registered.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> RegisteredContract.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.RegisteredContract.Certificate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "GenericIdentification";
				definition = "Information related to a non-standardised identification, such as a proprietary party identification or account identification.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFundClass.FundClassification, com.tools20022.repository.entity.SecuritiesIdentification.GenericIdentification,
						com.tools20022.repository.entity.InformationPartyRole.GenericIdentification, com.tools20022.repository.entity.ContactPoint.Identification,
						com.tools20022.repository.entity.PartyIdentificationInformation.OtherIdentification, com.tools20022.repository.entity.Account.Type, com.tools20022.repository.entity.AccountIdentification.ProprietaryIdentification,
						com.tools20022.repository.entity.AccountIdentification.CostReferencePattern, com.tools20022.repository.entity.Location.Identification, com.tools20022.repository.entity.Scheme.Identification,
						com.tools20022.repository.entity.Document.DocumentIdentification, com.tools20022.repository.entity.StatusReason.DataSourceScheme, com.tools20022.repository.entity.SystemIdentification.Identification,
						com.tools20022.repository.entity.LotBreakdown.LotNumber, com.tools20022.repository.entity.CashAccountService.Identification, com.tools20022.repository.entity.SecuritiesCertificate.Number,
						com.tools20022.repository.entity.Interest.InterestName, com.tools20022.repository.entity.CashProceedsDefinition.IncomeType, com.tools20022.repository.entity.BankTransaction.ProprietaryIdentification,
						com.tools20022.repository.entity.PurchaseOrder.Identification, com.tools20022.repository.entity.RegisteredContract.Certificate);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.GenericIdentification32.Type);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GenericIdentification.Identification, com.tools20022.repository.entity.GenericIdentification.IdentificationForContactPoint,
						com.tools20022.repository.entity.GenericIdentification.IdentificationForAccount, com.tools20022.repository.entity.GenericIdentification.RelatedPartyIdentification,
						com.tools20022.repository.entity.GenericIdentification.IssueDate, com.tools20022.repository.entity.GenericIdentification.ExpiryDate, com.tools20022.repository.entity.GenericIdentification.Scheme,
						com.tools20022.repository.entity.GenericIdentification.IdentificationForSecuritiesCertificate, com.tools20022.repository.entity.GenericIdentification.IdentificationForLot,
						com.tools20022.repository.entity.GenericIdentification.PartyRole, com.tools20022.repository.entity.GenericIdentification.IdentificationForCashProceedsIncome,
						com.tools20022.repository.entity.GenericIdentification.RelatedStatusReason, com.tools20022.repository.entity.GenericIdentification.IdentificationForBankTransaction,
						com.tools20022.repository.entity.GenericIdentification.IdentificationForAccountCostReferencePattern, com.tools20022.repository.entity.GenericIdentification.Account,
						com.tools20022.repository.entity.GenericIdentification.RelatedSystemIdentification, com.tools20022.repository.entity.GenericIdentification.IdentificationForInterestName,
						com.tools20022.repository.entity.GenericIdentification.RelatedCashAccountService, com.tools20022.repository.entity.GenericIdentification.IdentificationForInvestmentFundClass,
						com.tools20022.repository.entity.GenericIdentification.IdentifiedLocation, com.tools20022.repository.entity.GenericIdentification.RelatedSecuritiesIdentification,
						com.tools20022.repository.entity.GenericIdentification.IdentifiedDocument, com.tools20022.repository.entity.GenericIdentification.RelatedPurchaseOrder,
						com.tools20022.repository.entity.GenericIdentification.RelatedCertificate);
				derivationComponent_lazy = () -> Arrays.asList(GenericIdentification1.mmObject(), GenericIdentification13.mmObject(), GenericIdentification3.mmObject(), ProprietaryBankTransactionCodeStructure1.mmObject(),
						GenericIdentification32.mmObject(), GenericIdentification30.mmObject(), BillingSubServiceIdentification1.mmObject(), BillingServiceCommonIdentification1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}