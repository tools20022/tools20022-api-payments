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
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information supplied to enable the matching/reconciliation of an entry with
 * the items that the payment is intended to settle, such as commercial invoices
 * in an accounts' receivable system, in a structured form.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation15#mmReferredDocumentInformation
 * StructuredRemittanceInformation15.mmReferredDocumentInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation15#mmReferredDocumentAmount
 * StructuredRemittanceInformation15.mmReferredDocumentAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation15#mmCreditorReferenceInformation
 * StructuredRemittanceInformation15.mmCreditorReferenceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation15#mmInvoicer
 * StructuredRemittanceInformation15.mmInvoicer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation15#mmInvoicee
 * StructuredRemittanceInformation15.mmInvoicee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation15#mmTaxRemittance
 * StructuredRemittanceInformation15.mmTaxRemittance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation15#mmGarnishmentRemittance
 * StructuredRemittanceInformation15.mmGarnishmentRemittance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation15#mmAdditionalRemittanceInformation
 * StructuredRemittanceInformation15.mmAdditionalRemittanceInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Document Document}</li>
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
 * "StructuredRemittanceInformation15"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information supplied to enable the matching/reconciliation of an entry with the items that the payment is intended to settle, such as commercial invoices in an accounts' receivable system, in a structured form."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation13
 * StructuredRemittanceInformation13}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "StructuredRemittanceInformation15", propOrder = {"referredDocumentInformation", "referredDocumentAmount", "creditorReferenceInformation", "invoicer", "invoicee", "taxRemittance", "garnishmentRemittance",
		"additionalRemittanceInformation"})
public class StructuredRemittanceInformation15 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RfrdDocInf")
	protected List<ReferredDocumentInformation7> referredDocumentInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ReferredDocumentInformation7
	 * ReferredDocumentInformation7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation15
	 * StructuredRemittanceInformation15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RfrdDocInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferredDocumentInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the identification and the content of the referred document."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation13#mmReferredDocumentInformation
	 * StructuredRemittanceInformation13.mmReferredDocumentInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<StructuredRemittanceInformation15, List<ReferredDocumentInformation7>> mmReferredDocumentInformation = new MMMessageAssociationEnd<StructuredRemittanceInformation15, List<ReferredDocumentInformation7>>() {
		{
			businessComponentTrace_lazy = () -> Document.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.StructuredRemittanceInformation15.mmObject();
			isDerived = false;
			xmlTag = "RfrdDocInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferredDocumentInformation";
			definition = "Provides the identification and the content of the referred document.";
			previousVersion_lazy = () -> StructuredRemittanceInformation13.mmReferredDocumentInformation;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ReferredDocumentInformation7.mmObject();
		}

		@Override
		public List<ReferredDocumentInformation7> getValue(StructuredRemittanceInformation15 obj) {
			return obj.getReferredDocumentInformation();
		}

		@Override
		public void setValue(StructuredRemittanceInformation15 obj, List<ReferredDocumentInformation7> value) {
			obj.setReferredDocumentInformation(value);
		}
	};
	@XmlElement(name = "RfrdDocAmt")
	protected RemittanceAmount2 referredDocumentAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RemittanceAmount2
	 * RemittanceAmount2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmAmount
	 * Document.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation15
	 * StructuredRemittanceInformation15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RfrdDocAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferredDocumentAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details on the amounts of the referred document."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation13#mmReferredDocumentAmount
	 * StructuredRemittanceInformation13.mmReferredDocumentAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<StructuredRemittanceInformation15, Optional<RemittanceAmount2>> mmReferredDocumentAmount = new MMMessageAssociationEnd<StructuredRemittanceInformation15, Optional<RemittanceAmount2>>() {
		{
			businessElementTrace_lazy = () -> Document.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.StructuredRemittanceInformation15.mmObject();
			isDerived = false;
			xmlTag = "RfrdDocAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferredDocumentAmount";
			definition = "Provides details on the amounts of the referred document.";
			previousVersion_lazy = () -> StructuredRemittanceInformation13.mmReferredDocumentAmount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RemittanceAmount2.mmObject();
		}

		@Override
		public Optional<RemittanceAmount2> getValue(StructuredRemittanceInformation15 obj) {
			return obj.getReferredDocumentAmount();
		}

		@Override
		public void setValue(StructuredRemittanceInformation15 obj, Optional<RemittanceAmount2> value) {
			obj.setReferredDocumentAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "CdtrRefInf")
	protected CreditorReferenceInformation2 creditorReferenceInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CreditorReferenceInformation2
	 * CreditorReferenceInformation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmCreditorReference
	 * PaymentIdentification.mmCreditorReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation15
	 * StructuredRemittanceInformation15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtrRefInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorReferenceInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference information provided by the creditor to allow the identification of the underlying documents."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation13#mmCreditorReferenceInformation
	 * StructuredRemittanceInformation13.mmCreditorReferenceInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<StructuredRemittanceInformation15, Optional<CreditorReferenceInformation2>> mmCreditorReferenceInformation = new MMMessageAssociationEnd<StructuredRemittanceInformation15, Optional<CreditorReferenceInformation2>>() {
		{
			businessElementTrace_lazy = () -> PaymentIdentification.mmCreditorReference;
			componentContext_lazy = () -> com.tools20022.repository.msg.StructuredRemittanceInformation15.mmObject();
			isDerived = false;
			xmlTag = "CdtrRefInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorReferenceInformation";
			definition = "Reference information provided by the creditor to allow the identification of the underlying documents.";
			previousVersion_lazy = () -> StructuredRemittanceInformation13.mmCreditorReferenceInformation;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CreditorReferenceInformation2.mmObject();
		}

		@Override
		public Optional<CreditorReferenceInformation2> getValue(StructuredRemittanceInformation15 obj) {
			return obj.getCreditorReferenceInformation();
		}

		@Override
		public void setValue(StructuredRemittanceInformation15 obj, Optional<CreditorReferenceInformation2> value) {
			obj.setCreditorReferenceInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "Invcr")
	protected PartyIdentification125 invoicer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification125
	 * PartyIdentification125}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation15
	 * StructuredRemittanceInformation15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Invcr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Invoicer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the organisation issuing the invoice, when it is different from the creditor or ultimate creditor."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation13#mmInvoicer
	 * StructuredRemittanceInformation13.mmInvoicer}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<StructuredRemittanceInformation15, Optional<PartyIdentification125>> mmInvoicer = new MMMessageAssociationEnd<StructuredRemittanceInformation15, Optional<PartyIdentification125>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.StructuredRemittanceInformation15.mmObject();
			isDerived = false;
			xmlTag = "Invcr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Invoicer";
			definition = "Identification of the organisation issuing the invoice, when it is different from the creditor or ultimate creditor.";
			previousVersion_lazy = () -> StructuredRemittanceInformation13.mmInvoicer;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification125.mmObject();
		}

		@Override
		public Optional<PartyIdentification125> getValue(StructuredRemittanceInformation15 obj) {
			return obj.getInvoicer();
		}

		@Override
		public void setValue(StructuredRemittanceInformation15 obj, Optional<PartyIdentification125> value) {
			obj.setInvoicer(value.orElse(null));
		}
	};
	@XmlElement(name = "Invcee")
	protected PartyIdentification125 invoicee;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification125
	 * PartyIdentification125}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceeRole InvoiceeRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation15
	 * StructuredRemittanceInformation15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Invcee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Invoicee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the party to whom an invoice is issued, when it is different from the debtor or ultimate debtor."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation13#mmInvoicee
	 * StructuredRemittanceInformation13.mmInvoicee}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<StructuredRemittanceInformation15, Optional<PartyIdentification125>> mmInvoicee = new MMMessageAssociationEnd<StructuredRemittanceInformation15, Optional<PartyIdentification125>>() {
		{
			businessComponentTrace_lazy = () -> InvoiceeRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.StructuredRemittanceInformation15.mmObject();
			isDerived = false;
			xmlTag = "Invcee";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Invoicee";
			definition = "Identification of the party to whom an invoice is issued, when it is different from the debtor or ultimate debtor.";
			previousVersion_lazy = () -> StructuredRemittanceInformation13.mmInvoicee;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification125.mmObject();
		}

		@Override
		public Optional<PartyIdentification125> getValue(StructuredRemittanceInformation15 obj) {
			return obj.getInvoicee();
		}

		@Override
		public void setValue(StructuredRemittanceInformation15 obj, Optional<PartyIdentification125> value) {
			obj.setInvoicee(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxRmt")
	protected TaxInformation7 taxRemittance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TaxInformation7
	 * TaxInformation7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmTaxOnPayment
	 * Payment.mmTaxOnPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation15
	 * StructuredRemittanceInformation15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxRmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRemittance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides remittance information about a payment made for tax-related purposes."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation13#mmTaxRemittance
	 * StructuredRemittanceInformation13.mmTaxRemittance}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<StructuredRemittanceInformation15, Optional<TaxInformation7>> mmTaxRemittance = new MMMessageAssociationEnd<StructuredRemittanceInformation15, Optional<TaxInformation7>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmTaxOnPayment;
			componentContext_lazy = () -> com.tools20022.repository.msg.StructuredRemittanceInformation15.mmObject();
			isDerived = false;
			xmlTag = "TaxRmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxRemittance";
			definition = "Provides remittance information about a payment made for tax-related purposes.";
			previousVersion_lazy = () -> StructuredRemittanceInformation13.mmTaxRemittance;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TaxInformation7.mmObject();
		}

		@Override
		public Optional<TaxInformation7> getValue(StructuredRemittanceInformation15 obj) {
			return obj.getTaxRemittance();
		}

		@Override
		public void setValue(StructuredRemittanceInformation15 obj, Optional<TaxInformation7> value) {
			obj.setTaxRemittance(value.orElse(null));
		}
	};
	@XmlElement(name = "GrnshmtRmt")
	protected Garnishment2 garnishmentRemittance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Garnishment2
	 * Garnishment2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Garnishment Garnishment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation15
	 * StructuredRemittanceInformation15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrnshmtRmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GarnishmentRemittance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides remittance information about a payment for garnishment-related purposes."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation13#mmGarnishmentRemittance
	 * StructuredRemittanceInformation13.mmGarnishmentRemittance}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<StructuredRemittanceInformation15, Optional<Garnishment2>> mmGarnishmentRemittance = new MMMessageAssociationEnd<StructuredRemittanceInformation15, Optional<Garnishment2>>() {
		{
			businessComponentTrace_lazy = () -> Garnishment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.StructuredRemittanceInformation15.mmObject();
			isDerived = false;
			xmlTag = "GrnshmtRmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GarnishmentRemittance";
			definition = "Provides remittance information about a payment for garnishment-related purposes.";
			previousVersion_lazy = () -> StructuredRemittanceInformation13.mmGarnishmentRemittance;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Garnishment2.mmObject();
		}

		@Override
		public Optional<Garnishment2> getValue(StructuredRemittanceInformation15 obj) {
			return obj.getGarnishmentRemittance();
		}

		@Override
		public void setValue(StructuredRemittanceInformation15 obj, Optional<Garnishment2> value) {
			obj.setGarnishmentRemittance(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlRmtInf")
	protected List<Max140Text> additionalRemittanceInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation15
	 * StructuredRemittanceInformation15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlRmtInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalRemittanceInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information, in free text form, to complement the structured remittance information."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation13#mmAdditionalRemittanceInformation
	 * StructuredRemittanceInformation13.mmAdditionalRemittanceInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<StructuredRemittanceInformation15, List<Max140Text>> mmAdditionalRemittanceInformation = new MMMessageAttribute<StructuredRemittanceInformation15, List<Max140Text>>() {
		{
			businessComponentTrace_lazy = () -> Document.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.StructuredRemittanceInformation15.mmObject();
			isDerived = false;
			xmlTag = "AddtlRmtInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalRemittanceInformation";
			definition = "Additional information, in free text form, to complement the structured remittance information.";
			previousVersion_lazy = () -> StructuredRemittanceInformation13.mmAdditionalRemittanceInformation;
			maxOccurs = 3;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public List<Max140Text> getValue(StructuredRemittanceInformation15 obj) {
			return obj.getAdditionalRemittanceInformation();
		}

		@Override
		public void setValue(StructuredRemittanceInformation15 obj, List<Max140Text> value) {
			obj.setAdditionalRemittanceInformation(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StructuredRemittanceInformation15.mmReferredDocumentInformation,
						com.tools20022.repository.msg.StructuredRemittanceInformation15.mmReferredDocumentAmount, com.tools20022.repository.msg.StructuredRemittanceInformation15.mmCreditorReferenceInformation,
						com.tools20022.repository.msg.StructuredRemittanceInformation15.mmInvoicer, com.tools20022.repository.msg.StructuredRemittanceInformation15.mmInvoicee,
						com.tools20022.repository.msg.StructuredRemittanceInformation15.mmTaxRemittance, com.tools20022.repository.msg.StructuredRemittanceInformation15.mmGarnishmentRemittance,
						com.tools20022.repository.msg.StructuredRemittanceInformation15.mmAdditionalRemittanceInformation);
				trace_lazy = () -> Document.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StructuredRemittanceInformation15";
				definition = "Information supplied to enable the matching/reconciliation of an entry with the items that the payment is intended to settle, such as commercial invoices in an accounts' receivable system, in a structured form.";
				previousVersion_lazy = () -> StructuredRemittanceInformation13.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<ReferredDocumentInformation7> getReferredDocumentInformation() {
		return referredDocumentInformation == null ? referredDocumentInformation = new ArrayList<>() : referredDocumentInformation;
	}

	public StructuredRemittanceInformation15 setReferredDocumentInformation(List<ReferredDocumentInformation7> referredDocumentInformation) {
		this.referredDocumentInformation = Objects.requireNonNull(referredDocumentInformation);
		return this;
	}

	public Optional<RemittanceAmount2> getReferredDocumentAmount() {
		return referredDocumentAmount == null ? Optional.empty() : Optional.of(referredDocumentAmount);
	}

	public StructuredRemittanceInformation15 setReferredDocumentAmount(RemittanceAmount2 referredDocumentAmount) {
		this.referredDocumentAmount = referredDocumentAmount;
		return this;
	}

	public Optional<CreditorReferenceInformation2> getCreditorReferenceInformation() {
		return creditorReferenceInformation == null ? Optional.empty() : Optional.of(creditorReferenceInformation);
	}

	public StructuredRemittanceInformation15 setCreditorReferenceInformation(CreditorReferenceInformation2 creditorReferenceInformation) {
		this.creditorReferenceInformation = creditorReferenceInformation;
		return this;
	}

	public Optional<PartyIdentification125> getInvoicer() {
		return invoicer == null ? Optional.empty() : Optional.of(invoicer);
	}

	public StructuredRemittanceInformation15 setInvoicer(PartyIdentification125 invoicer) {
		this.invoicer = invoicer;
		return this;
	}

	public Optional<PartyIdentification125> getInvoicee() {
		return invoicee == null ? Optional.empty() : Optional.of(invoicee);
	}

	public StructuredRemittanceInformation15 setInvoicee(PartyIdentification125 invoicee) {
		this.invoicee = invoicee;
		return this;
	}

	public Optional<TaxInformation7> getTaxRemittance() {
		return taxRemittance == null ? Optional.empty() : Optional.of(taxRemittance);
	}

	public StructuredRemittanceInformation15 setTaxRemittance(TaxInformation7 taxRemittance) {
		this.taxRemittance = taxRemittance;
		return this;
	}

	public Optional<Garnishment2> getGarnishmentRemittance() {
		return garnishmentRemittance == null ? Optional.empty() : Optional.of(garnishmentRemittance);
	}

	public StructuredRemittanceInformation15 setGarnishmentRemittance(Garnishment2 garnishmentRemittance) {
		this.garnishmentRemittance = garnishmentRemittance;
		return this;
	}

	public List<Max140Text> getAdditionalRemittanceInformation() {
		return additionalRemittanceInformation == null ? additionalRemittanceInformation = new ArrayList<>() : additionalRemittanceInformation;
	}

	public StructuredRemittanceInformation15 setAdditionalRemittanceInformation(List<Max140Text> additionalRemittanceInformation) {
		this.additionalRemittanceInformation = Objects.requireNonNull(additionalRemittanceInformation);
		return this;
	}
}