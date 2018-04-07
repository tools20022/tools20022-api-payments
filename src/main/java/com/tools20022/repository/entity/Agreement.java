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
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.CommercialTrade;
import com.tools20022.repository.entity.DateTimePeriod;
import com.tools20022.repository.entity.Document;
import com.tools20022.repository.entity.Jurisdiction;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Contractual details related to an agreement between parties.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Agreement" src="doc-files/Agreement.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Agreement#mmDateSigned
 * Agreement.mmDateSigned}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Agreement#mmDescription
 * Agreement.mmDescription}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Agreement#mmVersion
 * Agreement.mmVersion}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Agreement#mmValidityPeriod
 * Agreement.mmValidityPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Agreement#mmDocument
 * Agreement.mmDocument}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Agreement#mmTrade
 * Agreement.mmTrade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Agreement#mmJurisdiction
 * Agreement.mmJurisdiction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedAgreement
 * DateTimePeriod.mmRelatedAgreement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmAgreement
 * Document.mmAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Jurisdiction#mmRelatedAgreement
 * Jurisdiction.mmRelatedAgreement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CommercialTrade#mmAgreement
 * CommercialTrade.mmAgreement}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Contract Contract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancingAgreement
 * SecuritiesFinancingAgreement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CollateralAgreement
 * CollateralAgreement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MasterAgreement
 * MasterAgreement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement
 * InvoiceFinancingAgreement}</li>
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
 * "Agreement"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Contractual details related to an agreement between parties."</li>
 * </ul>
 */
public class Agreement {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ISODate dateSigned;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.ContractDocument1#mmSignOffDate
	 * ContractDocument1.mmSignOffDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegisteredContractAmendment1#mmStartDate
	 * RegisteredContractAmendment1.mmStartDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation11#mmDateOfSignature
	 * MandateRelatedInformation11.mmDateOfSignature}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation12#mmDateOfSignature
	 * MandateRelatedInformation12.mmDateOfSignature}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Agreement
	 * Agreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateSigned"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which the agreement was signed by all parties."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Agreement, ISODate> mmDateSigned = new MMBusinessAttribute<Agreement, ISODate>() {
		{
			derivation_lazy = () -> Arrays.asList(ContractDocument1.mmSignOffDate, RegisteredContractAmendment1.mmStartDate, MandateRelatedInformation11.mmDateOfSignature, MandateRelatedInformation12.mmDateOfSignature);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Agreement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DateSigned";
			definition = "Date on which the agreement was signed by all parties.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(Agreement obj) {
			return obj.getDateSigned();
		}

		@Override
		public void setValue(Agreement obj, ISODate value) {
			obj.setDateSigned(value);
		}
	};
	protected Max350Text description;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContractDocument1#mmReference
	 * ContractDocument1.mmReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1#mmDescription
	 * SupportingDocumentRequestOrLetter1.mmDescription}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate10#mmReason
	 * Mandate10.mmReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate9#mmReason
	 * Mandate9.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation11#mmReason
	 * MandateRelatedInformation11.mmReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate11#mmReason
	 * Mandate11.mmReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate8#mmReason
	 * Mandate8.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails11#mmOriginalReason
	 * AmendmentInformationDetails11.mmOriginalReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation12#mmReason
	 * MandateRelatedInformation12.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails12#mmOriginalReason
	 * AmendmentInformationDetails12.mmOriginalReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Agreement
	 * Agreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Description"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Full name of an agreement, annexes and amendments in place between the principals."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Agreement, Max350Text> mmDescription = new MMBusinessAttribute<Agreement, Max350Text>() {
		{
			derivation_lazy = () -> Arrays.asList(ContractDocument1.mmReference, SupportingDocumentRequestOrLetter1.mmDescription, Mandate10.mmReason, Mandate9.mmReason, MandateRelatedInformation11.mmReason, Mandate11.mmReason,
					Mandate8.mmReason, AmendmentInformationDetails11.mmOriginalReason, MandateRelatedInformation12.mmReason, AmendmentInformationDetails12.mmOriginalReason);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Agreement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Description";
			definition = "Full name of an agreement, annexes and amendments in place between the principals.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Max350Text getValue(Agreement obj) {
			return obj.getDescription();
		}

		@Override
		public void setValue(Agreement obj, Max350Text value) {
			obj.setDescription(value);
		}
	};
	protected Max35Text version;
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
	 * {@linkplain com.tools20022.repository.msg.ContractDocument1#mmVersion
	 * ContractDocument1.mmVersion}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Agreement
	 * Agreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Version"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Version number of a contract or of a  legal agreement."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Agreement, Max35Text> mmVersion = new MMBusinessAttribute<Agreement, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(ContractDocument1.mmVersion);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Agreement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Version";
			definition = "Version number of a contract or of a  legal agreement.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Agreement obj) {
			return obj.getVersion();
		}

		@Override
		public void setValue(Agreement obj, Max35Text value) {
			obj.setVersion(value);
		}
	};
	protected List<DateTimePeriod> validityPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedAgreement
	 * DateTimePeriod.mmRelatedAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences4#mmDuration
	 * MandateOccurrences4.mmDuration}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Agreement
	 * Agreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidityPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period during which the agreement is valid"</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Agreement, List<DateTimePeriod>> mmValidityPeriod = new MMBusinessAssociationEnd<Agreement, List<DateTimePeriod>>() {
		{
			derivation_lazy = () -> Arrays.asList(MandateOccurrences4.mmDuration);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Agreement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ValidityPeriod";
			definition = "Period during which the agreement is valid";
			minOccurs = 0;
			opposite_lazy = () -> DateTimePeriod.mmRelatedAgreement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}

		@Override
		public List<DateTimePeriod> getValue(Agreement obj) {
			return obj.getValidityPeriod();
		}

		@Override
		public void setValue(Agreement obj, List<DateTimePeriod> value) {
			obj.setValidityPeriod(value);
		}
	};
	protected Document document;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmAgreement
	 * Document.mmAgreement}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SupportingDocument1#mmEntry
	 * SupportingDocument1.mmEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegisteredContractAmendment1#mmDocument
	 * RegisteredContractAmendment1.mmDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate10#mmReferredDocument
	 * Mandate10.mmReferredDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate9#mmReferredDocument
	 * Mandate9.mmReferredDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate11#mmReferredDocument
	 * Mandate11.mmReferredDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate8#mmReferredDocument
	 * Mandate8.mmReferredDocument}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Agreement
	 * Agreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Document"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Document which materialises the agreement."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Agreement, Document> mmDocument = new MMBusinessAssociationEnd<Agreement, Document>() {
		{
			derivation_lazy = () -> Arrays.asList(SupportingDocument1.mmEntry, RegisteredContractAmendment1.mmDocument, Mandate10.mmReferredDocument, Mandate9.mmReferredDocument, Mandate11.mmReferredDocument, Mandate8.mmReferredDocument);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Agreement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Document";
			definition = "Document which materialises the agreement.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Document.mmAgreement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Document.mmObject();
		}

		@Override
		public Document getValue(Agreement obj) {
			return obj.getDocument();
		}

		@Override
		public void setValue(Agreement obj, Document value) {
			obj.setDocument(value);
		}
	};
	protected CommercialTrade trade;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTrade#mmAgreement
	 * CommercialTrade.mmAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CommercialTrade
	 * CommercialTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Agreement
	 * Agreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Trade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of trade that is the subject of an agreement. The agreement contains the clauses that will govern each trade between the signing parties."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Agreement, CommercialTrade> mmTrade = new MMBusinessAssociationEnd<Agreement, CommercialTrade>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Agreement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Trade";
			definition = "Specifies the type of trade that is the subject of an agreement. The agreement contains the clauses that will govern each trade between the signing parties.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> CommercialTrade.mmAgreement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CommercialTrade.mmObject();
		}

		@Override
		public CommercialTrade getValue(Agreement obj) {
			return obj.getTrade();
		}

		@Override
		public void setValue(Agreement obj, CommercialTrade value) {
			obj.setTrade(value);
		}
	};
	protected Jurisdiction jurisdiction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Jurisdiction#mmRelatedAgreement
	 * Jurisdiction.mmRelatedAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Jurisdiction
	 * Jurisdiction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Agreement
	 * Agreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Jurisdiction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Jurisdiction where an agreement applies."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Agreement, Optional<Jurisdiction>> mmJurisdiction = new MMBusinessAssociationEnd<Agreement, Optional<Jurisdiction>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Agreement.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Jurisdiction";
			definition = "Jurisdiction where an agreement applies.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Jurisdiction.mmRelatedAgreement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Jurisdiction.mmObject();
		}

		@Override
		public Optional<Jurisdiction> getValue(Agreement obj) {
			return obj.getJurisdiction();
		}

		@Override
		public void setValue(Agreement obj, Optional<Jurisdiction> value) {
			obj.setJurisdiction(value.orElse(null));
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Agreement";
				definition = "Contractual details related to an agreement between parties.";
				associationDomain_lazy = () -> Arrays.asList(DateTimePeriod.mmRelatedAgreement, Document.mmAgreement, Jurisdiction.mmRelatedAgreement, CommercialTrade.mmAgreement);
				subType_lazy = () -> Arrays.asList(Contract.mmObject(), SecuritiesFinancingAgreement.mmObject(), CollateralAgreement.mmObject(), MasterAgreement.mmObject(), InvoiceFinancingAgreement.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Agreement.mmDateSigned, com.tools20022.repository.entity.Agreement.mmDescription, com.tools20022.repository.entity.Agreement.mmVersion,
						com.tools20022.repository.entity.Agreement.mmValidityPeriod, com.tools20022.repository.entity.Agreement.mmDocument, com.tools20022.repository.entity.Agreement.mmTrade,
						com.tools20022.repository.entity.Agreement.mmJurisdiction);
			}

			@Override
			public Class<?> getInstanceClass() {
				return Agreement.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ISODate getDateSigned() {
		return dateSigned;
	}

	public Agreement setDateSigned(ISODate dateSigned) {
		this.dateSigned = Objects.requireNonNull(dateSigned);
		return this;
	}

	public Max350Text getDescription() {
		return description;
	}

	public Agreement setDescription(Max350Text description) {
		this.description = Objects.requireNonNull(description);
		return this;
	}

	public Max35Text getVersion() {
		return version;
	}

	public Agreement setVersion(Max35Text version) {
		this.version = Objects.requireNonNull(version);
		return this;
	}

	public List<DateTimePeriod> getValidityPeriod() {
		return validityPeriod == null ? validityPeriod = new ArrayList<>() : validityPeriod;
	}

	public Agreement setValidityPeriod(List<DateTimePeriod> validityPeriod) {
		this.validityPeriod = Objects.requireNonNull(validityPeriod);
		return this;
	}

	public Document getDocument() {
		return document;
	}

	public Agreement setDocument(Document document) {
		this.document = Objects.requireNonNull(document);
		return this;
	}

	public CommercialTrade getTrade() {
		return trade;
	}

	public Agreement setTrade(CommercialTrade trade) {
		this.trade = Objects.requireNonNull(trade);
		return this;
	}

	public Optional<Jurisdiction> getJurisdiction() {
		return jurisdiction == null ? Optional.empty() : Optional.of(jurisdiction);
	}

	public Agreement setJurisdiction(Jurisdiction jurisdiction) {
		this.jurisdiction = jurisdiction;
		return this;
	}
}