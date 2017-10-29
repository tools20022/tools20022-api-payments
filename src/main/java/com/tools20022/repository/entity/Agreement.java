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
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import java.util.Arrays;
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
 * <li>{@linkplain com.tools20022.repository.entity.Agreement#DateSigned
 * Agreement.DateSigned}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Agreement#Description
 * Agreement.Description}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Agreement#Version
 * Agreement.Version}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Agreement#ValidityPeriod
 * Agreement.ValidityPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Agreement#Document
 * Agreement.Document}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Agreement#Trade
 * Agreement.Trade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Agreement#Jurisdiction
 * Agreement.Jurisdiction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#RelatedAgreement
 * DateTimePeriod.RelatedAgreement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#Agreement
 * Document.Agreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Jurisdiction#RelatedAgreement
 * Jurisdiction.RelatedAgreement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CommercialTrade#Agreement
 * CommercialTrade.Agreement}</li>
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
	/**
	 * Date on which the agreement was signed by all parties.
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
	 * {@linkplain com.tools20022.repository.msg.ContractDocument1#SignOffDate
	 * ContractDocument1.SignOffDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegisteredContractAmendment1#StartDate
	 * RegisteredContractAmendment1.StartDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation11#DateOfSignature
	 * MandateRelatedInformation11.DateOfSignature}</li>
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
	public static final MMBusinessAttribute DateSigned = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ContractDocument1.SignOffDate, com.tools20022.repository.msg.RegisteredContractAmendment1.StartDate,
					com.tools20022.repository.msg.MandateRelatedInformation11.DateOfSignature);
			elementContext_lazy = () -> Agreement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DateSigned";
			definition = "Date on which the agreement was signed by all parties.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Full name of an agreement, annexes and amendments in place between the
	 * principals.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.ContractDocument1#Reference
	 * ContractDocument1.Reference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1#Description
	 * SupportingDocumentRequestOrLetter1.Description}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate10#Reason
	 * Mandate10.Reason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate9#Reason
	 * Mandate9.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation11#Reason
	 * MandateRelatedInformation11.Reason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate11#Reason
	 * Mandate11.Reason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate8#Reason
	 * Mandate8.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails11#OriginalReason
	 * AmendmentInformationDetails11.OriginalReason}</li>
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
	public static final MMBusinessAttribute Description = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ContractDocument1.Reference, com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1.Description, com.tools20022.repository.msg.Mandate10.Reason,
					com.tools20022.repository.msg.Mandate9.Reason, com.tools20022.repository.msg.MandateRelatedInformation11.Reason, com.tools20022.repository.msg.Mandate11.Reason, com.tools20022.repository.msg.Mandate8.Reason,
					com.tools20022.repository.msg.AmendmentInformationDetails11.OriginalReason);
			elementContext_lazy = () -> Agreement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Description";
			definition = "Full name of an agreement, annexes and amendments in place between the principals.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Version number of a contract or of a legal agreement.
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
	 * <li>{@linkplain com.tools20022.repository.msg.ContractDocument1#Version
	 * ContractDocument1.Version}</li>
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
	public static final MMBusinessAttribute Version = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ContractDocument1.Version);
			elementContext_lazy = () -> Agreement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Version";
			definition = "Version number of a contract or of a  legal agreement.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Period during which the agreement is valid
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#RelatedAgreement
	 * DateTimePeriod.RelatedAgreement}</li>
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
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences4#Duration
	 * MandateOccurrences4.Duration}</li>
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
	public static final MMBusinessAssociationEnd ValidityPeriod = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MandateOccurrences4.Duration);
			elementContext_lazy = () -> Agreement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValidityPeriod";
			definition = "Period during which the agreement is valid";
			minOccurs = 0;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.RelatedAgreement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Document which materialises the agreement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Document#Agreement
	 * Document.Agreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Document Document}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.SupportingDocument1#Entry
	 * SupportingDocument1.Entry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegisteredContractAmendment1#Document
	 * RegisteredContractAmendment1.Document}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate10#ReferredDocument
	 * Mandate10.ReferredDocument}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate9#ReferredDocument
	 * Mandate9.ReferredDocument}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate11#ReferredDocument
	 * Mandate11.ReferredDocument}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate8#ReferredDocument
	 * Mandate8.ReferredDocument}</li>
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
	public static final MMBusinessAssociationEnd Document = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SupportingDocument1.Entry, com.tools20022.repository.msg.RegisteredContractAmendment1.Document, com.tools20022.repository.msg.Mandate10.ReferredDocument,
					com.tools20022.repository.msg.Mandate9.ReferredDocument, com.tools20022.repository.msg.Mandate11.ReferredDocument, com.tools20022.repository.msg.Mandate8.ReferredDocument);
			elementContext_lazy = () -> Agreement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Document";
			definition = "Document which materialises the agreement.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Document.Agreement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the type of trade that is the subject of an agreement. The
	 * agreement contains the clauses that will govern each trade between the
	 * signing parties.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTrade#Agreement
	 * CommercialTrade.Agreement}</li>
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
	public static final MMBusinessAssociationEnd Trade = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Agreement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Trade";
			definition = "Specifies the type of trade that is the subject of an agreement. The agreement contains the clauses that will govern each trade between the signing parties.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CommercialTrade.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CommercialTrade.Agreement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Jurisdiction where an agreement applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Jurisdiction#RelatedAgreement
	 * Jurisdiction.RelatedAgreement}</li>
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
	public static final MMBusinessAssociationEnd Jurisdiction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Agreement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Jurisdiction";
			definition = "Jurisdiction where an agreement applies.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Jurisdiction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Jurisdiction.RelatedAgreement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Agreement";
				definition = "Contractual details related to an agreement between parties.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DateTimePeriod.RelatedAgreement, com.tools20022.repository.entity.Document.Agreement,
						com.tools20022.repository.entity.Jurisdiction.RelatedAgreement, com.tools20022.repository.entity.CommercialTrade.Agreement);
				subType_lazy = () -> Arrays.asList(Contract.mmObject(), SecuritiesFinancingAgreement.mmObject(), CollateralAgreement.mmObject(), MasterAgreement.mmObject(), InvoiceFinancingAgreement.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Agreement.DateSigned, com.tools20022.repository.entity.Agreement.Description, com.tools20022.repository.entity.Agreement.Version,
						com.tools20022.repository.entity.Agreement.ValidityPeriod, com.tools20022.repository.entity.Agreement.Document, com.tools20022.repository.entity.Agreement.Trade,
						com.tools20022.repository.entity.Agreement.Jurisdiction);
			}
		});
		return mmObject_lazy.get();
	}
}