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
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.entity.Document;
import com.tools20022.repository.entity.Garnishment;
import com.tools20022.repository.entity.InvoiceeRole;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation13#ReferredDocumentInformation
 * StructuredRemittanceInformation13.ReferredDocumentInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation13#ReferredDocumentAmount
 * StructuredRemittanceInformation13.ReferredDocumentAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation13#CreditorReferenceInformation
 * StructuredRemittanceInformation13.CreditorReferenceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation13#Invoicer
 * StructuredRemittanceInformation13.Invoicer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation13#Invoicee
 * StructuredRemittanceInformation13.Invoicee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation13#TaxRemittance
 * StructuredRemittanceInformation13.TaxRemittance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation13#GarnishmentRemittance
 * StructuredRemittanceInformation13.GarnishmentRemittance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation13#AdditionalRemittanceInformation
 * StructuredRemittanceInformation13.AdditionalRemittanceInformation}</li>
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
 * "StructuredRemittanceInformation13"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information supplied to enable the matching/reconciliation of an entry with the items that the payment is intended to settle, such as commercial invoices in an accounts' receivable system, in a structured form."
 * </li>
 * </ul>
 */
public class StructuredRemittanceInformation13 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Provides the identification and the content of the referred document.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation13
	 * StructuredRemittanceInformation13}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd ReferredDocumentInformation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> StructuredRemittanceInformation13.mmObject();
			businessComponentTrace_lazy = () -> Document.mmObject();
			isDerived = false;
			xmlTag = "RfrdDocInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferredDocumentInformation";
			definition = "Provides the identification and the content of the referred document.";
			minOccurs = 0;
			type_lazy = () -> ReferredDocumentInformation7.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Provides details on the amounts of the referred document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RemittanceAmount2
	 * RemittanceAmount2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document#Amount
	 * Document.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation13
	 * StructuredRemittanceInformation13}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd ReferredDocumentAmount = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> StructuredRemittanceInformation13.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Document.Amount;
			isDerived = false;
			xmlTag = "RfrdDocAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferredDocumentAmount";
			definition = "Provides details on the amounts of the referred document.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> RemittanceAmount2.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Reference information provided by the creditor to allow the
	 * identification of the underlying documents.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CreditorReferenceInformation2
	 * CreditorReferenceInformation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#CreditorReference
	 * PaymentIdentification.CreditorReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation13
	 * StructuredRemittanceInformation13}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd CreditorReferenceInformation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> StructuredRemittanceInformation13.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentIdentification.CreditorReference;
			isDerived = false;
			xmlTag = "CdtrRefInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorReferenceInformation";
			definition = "Reference information provided by the creditor to allow the identification of the underlying documents.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CreditorReferenceInformation2.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Identification of the organisation issuing the invoice, when it is
	 * different from the creditor or ultimate creditor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification43
	 * PartyIdentification43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#Identification
	 * Party.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation13
	 * StructuredRemittanceInformation13}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Invoicer = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> StructuredRemittanceInformation13.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.Identification;
			isDerived = false;
			xmlTag = "Invcr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Invoicer";
			definition = "Identification of the organisation issuing the invoice, when it is different from the creditor or ultimate creditor.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> PartyIdentification43.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Identification of the party to whom an invoice is issued, when it is
	 * different from the debtor or ultimate debtor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification43
	 * PartyIdentification43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceeRole InvoiceeRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation13
	 * StructuredRemittanceInformation13}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Invoicee = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> StructuredRemittanceInformation13.mmObject();
			businessComponentTrace_lazy = () -> InvoiceeRole.mmObject();
			isDerived = false;
			xmlTag = "Invcee";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Invoicee";
			definition = "Identification of the party to whom an invoice is issued, when it is different from the debtor or ultimate debtor.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> PartyIdentification43.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Provides remittance information about a payment made for tax-related
	 * purposes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TaxInformation4
	 * TaxInformation4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#TaxOnPayment
	 * Payment.TaxOnPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation13
	 * StructuredRemittanceInformation13}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd TaxRemittance = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> StructuredRemittanceInformation13.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Payment.TaxOnPayment;
			isDerived = false;
			xmlTag = "TaxRmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxRemittance";
			definition = "Provides remittance information about a payment made for tax-related purposes.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> TaxInformation4.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Provides remittance information about a payment for garnishment-related
	 * purposes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Garnishment1
	 * Garnishment1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Garnishment Garnishment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation13
	 * StructuredRemittanceInformation13}</li>
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
	 * "Provides remittance information about a payment for garnishment-related purposes. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd GarnishmentRemittance = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> StructuredRemittanceInformation13.mmObject();
			businessComponentTrace_lazy = () -> Garnishment.mmObject();
			isDerived = false;
			xmlTag = "GrnshmtRmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GarnishmentRemittance";
			definition = "Provides remittance information about a payment for garnishment-related purposes. ";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Garnishment1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Additional information, in free text form, to complement the structured
	 * remittance information.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation13
	 * StructuredRemittanceInformation13}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute AdditionalRemittanceInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> StructuredRemittanceInformation13.mmObject();
			businessComponentTrace_lazy = () -> Document.mmObject();
			isDerived = false;
			xmlTag = "AddtlRmtInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalRemittanceInformation";
			definition = "Additional information, in free text form, to complement the structured remittance information.";
			minOccurs = 0;
			maxOccurs = 3;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StructuredRemittanceInformation13.ReferredDocumentInformation, com.tools20022.repository.msg.StructuredRemittanceInformation13.ReferredDocumentAmount,
						com.tools20022.repository.msg.StructuredRemittanceInformation13.CreditorReferenceInformation, com.tools20022.repository.msg.StructuredRemittanceInformation13.Invoicer,
						com.tools20022.repository.msg.StructuredRemittanceInformation13.Invoicee, com.tools20022.repository.msg.StructuredRemittanceInformation13.TaxRemittance,
						com.tools20022.repository.msg.StructuredRemittanceInformation13.GarnishmentRemittance, com.tools20022.repository.msg.StructuredRemittanceInformation13.AdditionalRemittanceInformation);
				trace_lazy = () -> Document.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "StructuredRemittanceInformation13";
				definition = "Information supplied to enable the matching/reconciliation of an entry with the items that the payment is intended to settle, such as commercial invoices in an accounts' receivable system, in a structured form.";
			}
		});
		return mmObject_lazy.get();
	}
}