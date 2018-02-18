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
import com.tools20022.repository.choice.ContractClosureReason1Choice;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.*;
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
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
 * GenericIdentification.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentificationForContactPoint
 * GenericIdentification.mmIdentificationForContactPoint}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentificationForAccount
 * GenericIdentification.mmIdentificationForAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmRelatedPartyIdentification
 * GenericIdentification.mmRelatedPartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIssueDate
 * GenericIdentification.mmIssueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmExpiryDate
 * GenericIdentification.mmExpiryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmScheme
 * GenericIdentification.mmScheme}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentificationForSecuritiesCertificate
 * GenericIdentification.mmIdentificationForSecuritiesCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentificationForLot
 * GenericIdentification.mmIdentificationForLot}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmPartyRole
 * GenericIdentification.mmPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentificationForCashProceedsIncome
 * GenericIdentification.mmIdentificationForCashProceedsIncome}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmRelatedStatusReason
 * GenericIdentification.mmRelatedStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentificationForBankTransaction
 * GenericIdentification.mmIdentificationForBankTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentificationForAccountCostReferencePattern
 * GenericIdentification.mmIdentificationForAccountCostReferencePattern}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmAccount
 * GenericIdentification.mmAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmRelatedSystemIdentification
 * GenericIdentification.mmRelatedSystemIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentificationForInterestName
 * GenericIdentification.mmIdentificationForInterestName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmRelatedCashAccountService
 * GenericIdentification.mmRelatedCashAccountService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentificationForInvestmentFundClass
 * GenericIdentification.mmIdentificationForInvestmentFundClass}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentifiedLocation
 * GenericIdentification.mmIdentifiedLocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmRelatedSecuritiesIdentification
 * GenericIdentification.mmRelatedSecuritiesIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentifiedDocument
 * GenericIdentification.mmIdentifiedDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmRelatedPurchaseOrder
 * GenericIdentification.mmRelatedPurchaseOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmRelatedCertificate
 * GenericIdentification.mmRelatedCertificate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmFundClassification
 * InvestmentFundClass.mmFundClassification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmGenericIdentification
 * SecuritiesIdentification.mmGenericIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InformationPartyRole#mmGenericIdentification
 * InformationPartyRole.mmGenericIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmIdentification
 * ContactPoint.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmOtherIdentification
 * PartyIdentificationInformation.mmOtherIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmType
 * Account.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountIdentification#mmProprietaryIdentification
 * AccountIdentification.mmProprietaryIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountIdentification#mmCostReferencePattern
 * AccountIdentification.mmCostReferencePattern}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Location#mmIdentification
 * Location.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Scheme#mmIdentification
 * Scheme.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Document#mmDocumentIdentification
 * Document.mmDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StatusReason#mmDataSourceScheme
 * StatusReason.mmDataSourceScheme}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemIdentification#mmIdentification
 * SystemIdentification.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LotBreakdown#mmLotNumber
 * LotBreakdown.mmLotNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccountService#mmIdentification
 * CashAccountService.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesCertificate#mmNumber
 * SecuritiesCertificate.mmNumber}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#mmInterestName
 * Interest.mmInterestName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#mmIncomeType
 * CashProceedsDefinition.mmIncomeType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BankTransaction#mmProprietaryIdentification
 * BankTransaction.mmProprietaryIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PurchaseOrder#mmIdentification
 * PurchaseOrder.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmCertificate
 * RegisteredContract.mmCertificate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification32#mmType
 * GenericIdentification32.mmType}</li>
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
	protected Max35Text identification;
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
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification1#mmIdentification
	 * GenericIdentification1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification13#mmIdentification
	 * GenericIdentification13.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ClearingSystemMemberIdentification2#mmMemberIdentification
	 * ClearingSystemMemberIdentification2.mmMemberIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification3#mmIdentification
	 * GenericIdentification3.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericFinancialIdentification1#mmIdentification
	 * GenericFinancialIdentification1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BranchData2#mmIdentification
	 * BranchData2.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericAccountIdentification1#mmIdentification
	 * GenericAccountIdentification1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericOrganisationIdentification1#mmIdentification
	 * GenericOrganisationIdentification1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericPersonIdentification1#mmIdentification
	 * GenericPersonIdentification1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherIdentification1#mmIdentification
	 * OtherIdentification1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProprietaryBankTransactionCodeStructure1#mmCode
	 * ProprietaryBankTransactionCodeStructure1.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification32#mmIdentification
	 * GenericIdentification32.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent1#mmManufacturerIdentification
	 * PointOfInteractionComponent1.mmManufacturerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IdentificationModification2#mmIdentification
	 * IdentificationModification2.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification22#mmIdentification
	 * DocumentIdentification22.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification30#mmIdentification
	 * GenericIdentification30.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingSubServiceIdentification1#mmIssuer
	 * BillingSubServiceIdentification1.mmIssuer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingSubServiceIdentification1#mmIdentification
	 * BillingSubServiceIdentification1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServiceCommonIdentification1#mmIdentification
	 * BillingServiceCommonIdentification1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingTaxRegion1#mmInvoiceNumber
	 * BillingTaxRegion1.mmInvoiceNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DocumentLineType1#mmIssuer
	 * DocumentLineType1.mmIssuer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentLineInformation1#mmIdentification
	 * DocumentLineInformation1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification29#mmIdentification
	 * DocumentIdentification29.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentEntry1#mmEntryIdentification
	 * SupportingDocumentEntry1.mmEntryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentGeneralInformation3#mmDocumentNumber
	 * DocumentGeneralInformation3.mmDocumentNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeContract1#mmContractDocumentIdentification
	 * TradeContract1.mmContractDocumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestPaymentDateRange1#mmInterestScheduleIdentification
	 * InterestPaymentDateRange1.mmInterestScheduleIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LegalOrganisation2#mmIdentification
	 * LegalOrganisation2.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification28#mmIdentification
	 * DocumentIdentification28.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionCertificateRecord1#mmCertificateRecordIdentification
	 * TransactionCertificateRecord1.mmCertificateRecordIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ContractClosureReason1Choice#mmCode
	 * ContractClosureReason1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ContractClosureReason1Choice#mmProprietary
	 * ContractClosureReason1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReferredDocumentInformation7#mmNumber
	 * ReferredDocumentInformation7.mmNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingStatement2#mmStatementIdentification
	 * BillingStatement2.mmStatementIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate10#mmMandateIdentification
	 * Mandate10.mmMandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RemittanceInformation13#mmRemittanceIdentification
	 * RemittanceInformation13.mmRemittanceIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate9#mmMandateIdentification
	 * Mandate9.mmMandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate11#mmMandateIdentification
	 * Mandate11.mmMandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReferredMandateDocument1#mmNumber
	 * ReferredMandateDocument1.mmNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate8#mmMandateIdentification
	 * Mandate8.mmMandateIdentification}</li>
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
	public static final MMBusinessAttribute mmIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(GenericIdentification1.mmIdentification, GenericIdentification13.mmIdentification, ClearingSystemMemberIdentification2.mmMemberIdentification, GenericIdentification3.mmIdentification,
					GenericFinancialIdentification1.mmIdentification, BranchData2.mmIdentification, GenericAccountIdentification1.mmIdentification, GenericOrganisationIdentification1.mmIdentification,
					GenericPersonIdentification1.mmIdentification, OtherIdentification1.mmIdentification, ProprietaryBankTransactionCodeStructure1.mmCode, GenericIdentification32.mmIdentification,
					PointOfInteractionComponent1.mmManufacturerIdentification, IdentificationModification2.mmIdentification, DocumentIdentification22.mmIdentification, GenericIdentification30.mmIdentification,
					BillingSubServiceIdentification1.mmIssuer, BillingSubServiceIdentification1.mmIdentification, BillingServiceCommonIdentification1.mmIdentification, BillingTaxRegion1.mmInvoiceNumber, DocumentLineType1.mmIssuer,
					DocumentLineInformation1.mmIdentification, DocumentIdentification29.mmIdentification, SupportingDocumentEntry1.mmEntryIdentification, DocumentGeneralInformation3.mmDocumentNumber,
					TradeContract1.mmContractDocumentIdentification, InterestPaymentDateRange1.mmInterestScheduleIdentification, LegalOrganisation2.mmIdentification, DocumentIdentification28.mmIdentification,
					TransactionCertificateRecord1.mmCertificateRecordIdentification, ContractClosureReason1Choice.mmCode, ContractClosureReason1Choice.mmProprietary, ReferredDocumentInformation7.mmNumber,
					BillingStatement2.mmStatementIdentification, Mandate10.mmMandateIdentification, RemittanceInformation13.mmRemittanceIdentification, Mandate9.mmMandateIdentification, Mandate11.mmMandateIdentification,
					ReferredMandateDocument1.mmNumber, Mandate8.mmMandateIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Name or number assigned by an entity to enable recognition of that entity, for example account identifier, identification assigned by a provider to identify its customers.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return GenericIdentification.class.getMethod("getIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.ContactPoint> identificationForContactPoint;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmIdentification
	 * ContactPoint.mmIdentification}</li>
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
	public static final MMBusinessAssociationEnd mmIdentificationForContactPoint = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IdentificationForContactPoint";
			definition = "Contact point which uses a generic identification as identification.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmObject();
		}
	};
	protected AccountIdentification identificationForAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification#mmProprietaryIdentification
	 * AccountIdentification.mmProprietaryIdentification}</li>
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
	public static final MMBusinessAssociationEnd mmIdentificationForAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IdentificationForAccount";
			definition = "Account Identification which uses a generic identification as proprietary identification.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.AccountIdentification.mmProprietaryIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AccountIdentification.mmObject();
		}
	};
	protected PartyIdentificationInformation relatedPartyIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmOtherIdentification
	 * PartyIdentificationInformation.mmOtherIdentification}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedPartyIdentification = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedPartyIdentification";
			definition = "Party identified with a scheme.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.mmOtherIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.mmObject();
		}
	};
	protected ISODate issueDate;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute mmIssueDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IssueDate";
			definition = "Date at which the identification was issued.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return GenericIdentification.class.getMethod("getIssueDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODate expiryDate;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute mmExpiryDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExpiryDate";
			definition = "Date at which the identification expires.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return GenericIdentification.class.getMethod("getExpiryDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Scheme scheme;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Scheme#mmIdentification
	 * Scheme.mmIdentification}</li>
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
	 * {@linkplain com.tools20022.repository.msg.GenericFinancialIdentification1#mmSchemeName
	 * GenericFinancialIdentification1.mmSchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericAccountIdentification1#mmSchemeName
	 * GenericAccountIdentification1.mmSchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericOrganisationIdentification1#mmSchemeName
	 * GenericOrganisationIdentification1.mmSchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericPersonIdentification1#mmSchemeName
	 * GenericPersonIdentification1.mmSchemeName}</li>
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
	public static final MMBusinessAssociationEnd mmScheme = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(GenericFinancialIdentification1.mmSchemeName, GenericAccountIdentification1.mmSchemeName, GenericOrganisationIdentification1.mmSchemeName, GenericPersonIdentification1.mmSchemeName);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Scheme";
			definition = "Information regarding an enumerated code list and its owner.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Scheme.mmIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Scheme.mmObject();
		}
	};
	protected SecuritiesCertificate identificationForSecuritiesCertificate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesCertificate#mmNumber
	 * SecuritiesCertificate.mmNumber}</li>
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
	public static final MMBusinessAssociationEnd mmIdentificationForSecuritiesCertificate = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IdentificationForSecuritiesCertificate";
			definition = "Securities certificate which uses a generic identification as certificate number.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesCertificate.mmNumber;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesCertificate.mmObject();
		}
	};
	protected LotBreakdown identificationForLot;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LotBreakdown#mmLotNumber
	 * LotBreakdown.mmLotNumber}</li>
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
	public static final MMBusinessAssociationEnd mmIdentificationForLot = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IdentificationForLot";
			definition = "Lot breakdown which uses a generic identification as lot number.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.LotBreakdown.mmLotNumber;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.LotBreakdown.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.InformationPartyRole> partyRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InformationPartyRole#mmGenericIdentification
	 * InformationPartyRole.mmGenericIdentification}</li>
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
	public static final MMBusinessAssociationEnd mmPartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Entity that assigns the identification.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InformationPartyRole.mmGenericIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InformationPartyRole.mmObject();
		}
	};
	protected CashProceedsDefinition identificationForCashProceedsIncome;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#mmIncomeType
	 * CashProceedsDefinition.mmIncomeType}</li>
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
	public static final MMBusinessAssociationEnd mmIdentificationForCashProceedsIncome = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IdentificationForCashProceedsIncome";
			definition = "Cash proceeds definition which uses a generic identification as type of income.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashProceedsDefinition.mmIncomeType;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashProceedsDefinition.mmObject();
		}
	};
	protected StatusReason relatedStatusReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmDataSourceScheme
	 * StatusReason.mmDataSourceScheme}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedStatusReason = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedStatusReason";
			definition = "Specifies the status reason for which a data source scheme is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.StatusReason.mmDataSourceScheme;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.StatusReason.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.BankTransaction> identificationForBankTransaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BankTransaction#mmProprietaryIdentification
	 * BankTransaction.mmProprietaryIdentification}</li>
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
	public static final MMBusinessAssociationEnd mmIdentificationForBankTransaction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IdentificationForBankTransaction";
			definition = "Bank transaction which uses a generic identification as proprietary identification.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.BankTransaction.mmProprietaryIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BankTransaction.mmObject();
		}
	};
	protected AccountIdentification identificationForAccountCostReferencePattern;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification#mmCostReferencePattern
	 * AccountIdentification.mmCostReferencePattern}</li>
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
	public static final MMBusinessAssociationEnd mmIdentificationForAccountCostReferencePattern = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IdentificationForAccountCostReferencePattern";
			definition = "Account identification for which a cost reference pattern is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.AccountIdentification.mmCostReferencePattern;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AccountIdentification.mmObject();
		}
	};
	protected Account account;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Account#mmType
	 * Account.mmType}</li>
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
	public static final MMBusinessAssociationEnd mmAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Account";
			definition = "Account for which a type is specified";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Account.mmType;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
		}
	};
	protected SystemIdentification relatedSystemIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SystemIdentification#mmIdentification
	 * SystemIdentification.mmIdentification}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedSystemIdentification = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedSystemIdentification";
			definition = "System identification which uses a generic identification.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SystemIdentification.mmIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SystemIdentification.mmObject();
		}
	};
	protected Interest identificationForInterestName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmInterestName
	 * Interest.mmInterestName}</li>
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
	public static final MMBusinessAssociationEnd mmIdentificationForInterestName = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IdentificationForInterestName";
			definition = "Interest which uses a generic identification as name.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Interest.mmInterestName;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
		}
	};
	protected CashAccountService relatedCashAccountService;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountService#mmIdentification
	 * CashAccountService.mmIdentification}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedCashAccountService = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedCashAccountService";
			definition = "Cash account service identified in a generic way.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccountService.mmIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccountService.mmObject();
		}
	};
	protected InvestmentFundClass identificationForInvestmentFundClass;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmFundClassification
	 * InvestmentFundClass.mmFundClassification}</li>
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
	public static final MMBusinessAssociationEnd mmIdentificationForInvestmentFundClass = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IdentificationForInvestmentFundClass";
			definition = "Investment fund class which uses a generic identification as fund classification.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmFundClassification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
		}
	};
	protected Location identifiedLocation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Location#mmIdentification
	 * Location.mmIdentification}</li>
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
	public static final MMBusinessAssociationEnd mmIdentifiedLocation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IdentifiedLocation";
			definition = "Location for which an identification is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Location.mmIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
		}
	};
	protected SecuritiesIdentification relatedSecuritiesIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmGenericIdentification
	 * SecuritiesIdentification.mmGenericIdentification}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedSecuritiesIdentification = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedSecuritiesIdentification";
			definition = "Securities identification for which generic identification elements and scheme are provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmGenericIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmObject();
		}
	};
	protected Document identifiedDocument;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmDocumentIdentification
	 * Document.mmDocumentIdentification}</li>
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
	public static final MMBusinessAssociationEnd mmIdentifiedDocument = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IdentifiedDocument";
			definition = "Document for which an identification is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Document.mmDocumentIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
		}
	};
	protected PurchaseOrder relatedPurchaseOrder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PurchaseOrder#mmIdentification
	 * PurchaseOrder.mmIdentification}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedPurchaseOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedPurchaseOrder";
			definition = "Purchase order for which an identification is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PurchaseOrder.mmIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PurchaseOrder.mmObject();
		}
	};
	protected RegisteredContract relatedCertificate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmCertificate
	 * RegisteredContract.mmCertificate}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedCertificate = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedCertificate";
			definition = "Related certificate against which all transactions in the scope of the regulatory requirements are registered.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RegisteredContract.mmCertificate;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RegisteredContract.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "GenericIdentification";
				definition = "Information related to a non-standardised identification, such as a proprietary party identification or account identification.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFundClass.mmFundClassification, com.tools20022.repository.entity.SecuritiesIdentification.mmGenericIdentification,
						com.tools20022.repository.entity.InformationPartyRole.mmGenericIdentification, com.tools20022.repository.entity.ContactPoint.mmIdentification,
						com.tools20022.repository.entity.PartyIdentificationInformation.mmOtherIdentification, com.tools20022.repository.entity.Account.mmType,
						com.tools20022.repository.entity.AccountIdentification.mmProprietaryIdentification, com.tools20022.repository.entity.AccountIdentification.mmCostReferencePattern,
						com.tools20022.repository.entity.Location.mmIdentification, com.tools20022.repository.entity.Scheme.mmIdentification, com.tools20022.repository.entity.Document.mmDocumentIdentification,
						com.tools20022.repository.entity.StatusReason.mmDataSourceScheme, com.tools20022.repository.entity.SystemIdentification.mmIdentification, com.tools20022.repository.entity.LotBreakdown.mmLotNumber,
						com.tools20022.repository.entity.CashAccountService.mmIdentification, com.tools20022.repository.entity.SecuritiesCertificate.mmNumber, com.tools20022.repository.entity.Interest.mmInterestName,
						com.tools20022.repository.entity.CashProceedsDefinition.mmIncomeType, com.tools20022.repository.entity.BankTransaction.mmProprietaryIdentification, com.tools20022.repository.entity.PurchaseOrder.mmIdentification,
						com.tools20022.repository.entity.RegisteredContract.mmCertificate);
				derivationElement_lazy = () -> Arrays.asList(GenericIdentification32.mmType);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GenericIdentification.mmIdentification, com.tools20022.repository.entity.GenericIdentification.mmIdentificationForContactPoint,
						com.tools20022.repository.entity.GenericIdentification.mmIdentificationForAccount, com.tools20022.repository.entity.GenericIdentification.mmRelatedPartyIdentification,
						com.tools20022.repository.entity.GenericIdentification.mmIssueDate, com.tools20022.repository.entity.GenericIdentification.mmExpiryDate, com.tools20022.repository.entity.GenericIdentification.mmScheme,
						com.tools20022.repository.entity.GenericIdentification.mmIdentificationForSecuritiesCertificate, com.tools20022.repository.entity.GenericIdentification.mmIdentificationForLot,
						com.tools20022.repository.entity.GenericIdentification.mmPartyRole, com.tools20022.repository.entity.GenericIdentification.mmIdentificationForCashProceedsIncome,
						com.tools20022.repository.entity.GenericIdentification.mmRelatedStatusReason, com.tools20022.repository.entity.GenericIdentification.mmIdentificationForBankTransaction,
						com.tools20022.repository.entity.GenericIdentification.mmIdentificationForAccountCostReferencePattern, com.tools20022.repository.entity.GenericIdentification.mmAccount,
						com.tools20022.repository.entity.GenericIdentification.mmRelatedSystemIdentification, com.tools20022.repository.entity.GenericIdentification.mmIdentificationForInterestName,
						com.tools20022.repository.entity.GenericIdentification.mmRelatedCashAccountService, com.tools20022.repository.entity.GenericIdentification.mmIdentificationForInvestmentFundClass,
						com.tools20022.repository.entity.GenericIdentification.mmIdentifiedLocation, com.tools20022.repository.entity.GenericIdentification.mmRelatedSecuritiesIdentification,
						com.tools20022.repository.entity.GenericIdentification.mmIdentifiedDocument, com.tools20022.repository.entity.GenericIdentification.mmRelatedPurchaseOrder,
						com.tools20022.repository.entity.GenericIdentification.mmRelatedCertificate);
				derivationComponent_lazy = () -> Arrays.asList(GenericIdentification1.mmObject(), GenericIdentification13.mmObject(), GenericIdentification3.mmObject(), ProprietaryBankTransactionCodeStructure1.mmObject(),
						GenericIdentification32.mmObject(), GenericIdentification30.mmObject(), BillingSubServiceIdentification1.mmObject(), BillingServiceCommonIdentification1.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return GenericIdentification.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public GenericIdentification setIdentification(Max35Text identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public List<ContactPoint> getIdentificationForContactPoint() {
		return identificationForContactPoint == null ? identificationForContactPoint = new ArrayList<>() : identificationForContactPoint;
	}

	public GenericIdentification setIdentificationForContactPoint(List<com.tools20022.repository.entity.ContactPoint> identificationForContactPoint) {
		this.identificationForContactPoint = Objects.requireNonNull(identificationForContactPoint);
		return this;
	}

	public AccountIdentification getIdentificationForAccount() {
		return identificationForAccount;
	}

	public GenericIdentification setIdentificationForAccount(com.tools20022.repository.entity.AccountIdentification identificationForAccount) {
		this.identificationForAccount = Objects.requireNonNull(identificationForAccount);
		return this;
	}

	public Optional<PartyIdentificationInformation> getRelatedPartyIdentification() {
		return relatedPartyIdentification == null ? Optional.empty() : Optional.of(relatedPartyIdentification);
	}

	public GenericIdentification setRelatedPartyIdentification(com.tools20022.repository.entity.PartyIdentificationInformation relatedPartyIdentification) {
		this.relatedPartyIdentification = relatedPartyIdentification;
		return this;
	}

	public ISODate getIssueDate() {
		return issueDate;
	}

	public GenericIdentification setIssueDate(ISODate issueDate) {
		this.issueDate = Objects.requireNonNull(issueDate);
		return this;
	}

	public ISODate getExpiryDate() {
		return expiryDate;
	}

	public GenericIdentification setExpiryDate(ISODate expiryDate) {
		this.expiryDate = Objects.requireNonNull(expiryDate);
		return this;
	}

	public Scheme getScheme() {
		return scheme;
	}

	public GenericIdentification setScheme(com.tools20022.repository.entity.Scheme scheme) {
		this.scheme = Objects.requireNonNull(scheme);
		return this;
	}

	public SecuritiesCertificate getIdentificationForSecuritiesCertificate() {
		return identificationForSecuritiesCertificate;
	}

	public GenericIdentification setIdentificationForSecuritiesCertificate(com.tools20022.repository.entity.SecuritiesCertificate identificationForSecuritiesCertificate) {
		this.identificationForSecuritiesCertificate = Objects.requireNonNull(identificationForSecuritiesCertificate);
		return this;
	}

	public Optional<LotBreakdown> getIdentificationForLot() {
		return identificationForLot == null ? Optional.empty() : Optional.of(identificationForLot);
	}

	public GenericIdentification setIdentificationForLot(com.tools20022.repository.entity.LotBreakdown identificationForLot) {
		this.identificationForLot = identificationForLot;
		return this;
	}

	public List<InformationPartyRole> getPartyRole() {
		return partyRole == null ? partyRole = new ArrayList<>() : partyRole;
	}

	public GenericIdentification setPartyRole(List<com.tools20022.repository.entity.InformationPartyRole> partyRole) {
		this.partyRole = Objects.requireNonNull(partyRole);
		return this;
	}

	public Optional<CashProceedsDefinition> getIdentificationForCashProceedsIncome() {
		return identificationForCashProceedsIncome == null ? Optional.empty() : Optional.of(identificationForCashProceedsIncome);
	}

	public GenericIdentification setIdentificationForCashProceedsIncome(com.tools20022.repository.entity.CashProceedsDefinition identificationForCashProceedsIncome) {
		this.identificationForCashProceedsIncome = identificationForCashProceedsIncome;
		return this;
	}

	public StatusReason getRelatedStatusReason() {
		return relatedStatusReason;
	}

	public GenericIdentification setRelatedStatusReason(com.tools20022.repository.entity.StatusReason relatedStatusReason) {
		this.relatedStatusReason = Objects.requireNonNull(relatedStatusReason);
		return this;
	}

	public List<BankTransaction> getIdentificationForBankTransaction() {
		return identificationForBankTransaction == null ? identificationForBankTransaction = new ArrayList<>() : identificationForBankTransaction;
	}

	public GenericIdentification setIdentificationForBankTransaction(List<com.tools20022.repository.entity.BankTransaction> identificationForBankTransaction) {
		this.identificationForBankTransaction = Objects.requireNonNull(identificationForBankTransaction);
		return this;
	}

	public Optional<AccountIdentification> getIdentificationForAccountCostReferencePattern() {
		return identificationForAccountCostReferencePattern == null ? Optional.empty() : Optional.of(identificationForAccountCostReferencePattern);
	}

	public GenericIdentification setIdentificationForAccountCostReferencePattern(com.tools20022.repository.entity.AccountIdentification identificationForAccountCostReferencePattern) {
		this.identificationForAccountCostReferencePattern = identificationForAccountCostReferencePattern;
		return this;
	}

	public Account getAccount() {
		return account;
	}

	public GenericIdentification setAccount(com.tools20022.repository.entity.Account account) {
		this.account = Objects.requireNonNull(account);
		return this;
	}

	public SystemIdentification getRelatedSystemIdentification() {
		return relatedSystemIdentification;
	}

	public GenericIdentification setRelatedSystemIdentification(com.tools20022.repository.entity.SystemIdentification relatedSystemIdentification) {
		this.relatedSystemIdentification = Objects.requireNonNull(relatedSystemIdentification);
		return this;
	}

	public Optional<Interest> getIdentificationForInterestName() {
		return identificationForInterestName == null ? Optional.empty() : Optional.of(identificationForInterestName);
	}

	public GenericIdentification setIdentificationForInterestName(com.tools20022.repository.entity.Interest identificationForInterestName) {
		this.identificationForInterestName = identificationForInterestName;
		return this;
	}

	public CashAccountService getRelatedCashAccountService() {
		return relatedCashAccountService;
	}

	public GenericIdentification setRelatedCashAccountService(com.tools20022.repository.entity.CashAccountService relatedCashAccountService) {
		this.relatedCashAccountService = Objects.requireNonNull(relatedCashAccountService);
		return this;
	}

	public InvestmentFundClass getIdentificationForInvestmentFundClass() {
		return identificationForInvestmentFundClass;
	}

	public GenericIdentification setIdentificationForInvestmentFundClass(com.tools20022.repository.entity.InvestmentFundClass identificationForInvestmentFundClass) {
		this.identificationForInvestmentFundClass = Objects.requireNonNull(identificationForInvestmentFundClass);
		return this;
	}

	public Location getIdentifiedLocation() {
		return identifiedLocation;
	}

	public GenericIdentification setIdentifiedLocation(com.tools20022.repository.entity.Location identifiedLocation) {
		this.identifiedLocation = Objects.requireNonNull(identifiedLocation);
		return this;
	}

	public SecuritiesIdentification getRelatedSecuritiesIdentification() {
		return relatedSecuritiesIdentification;
	}

	public GenericIdentification setRelatedSecuritiesIdentification(com.tools20022.repository.entity.SecuritiesIdentification relatedSecuritiesIdentification) {
		this.relatedSecuritiesIdentification = Objects.requireNonNull(relatedSecuritiesIdentification);
		return this;
	}

	public Document getIdentifiedDocument() {
		return identifiedDocument;
	}

	public GenericIdentification setIdentifiedDocument(com.tools20022.repository.entity.Document identifiedDocument) {
		this.identifiedDocument = Objects.requireNonNull(identifiedDocument);
		return this;
	}

	public PurchaseOrder getRelatedPurchaseOrder() {
		return relatedPurchaseOrder;
	}

	public GenericIdentification setRelatedPurchaseOrder(com.tools20022.repository.entity.PurchaseOrder relatedPurchaseOrder) {
		this.relatedPurchaseOrder = Objects.requireNonNull(relatedPurchaseOrder);
		return this;
	}

	public RegisteredContract getRelatedCertificate() {
		return relatedCertificate;
	}

	public GenericIdentification setRelatedCertificate(com.tools20022.repository.entity.RegisteredContract relatedCertificate) {
		this.relatedCertificate = Objects.requireNonNull(relatedCertificate);
		return this;
	}
}