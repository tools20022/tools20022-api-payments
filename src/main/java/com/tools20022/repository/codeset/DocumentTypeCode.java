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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies a type of financial or commercial document.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode#MeteredServiceInvoice
 * DocumentTypeCode.MeteredServiceInvoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode#CreditNoteRelatedToFinancialAdjustment
 * DocumentTypeCode.CreditNoteRelatedToFinancialAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode#DebitNoteRelatedToFinancialAdjustment
 * DocumentTypeCode.DebitNoteRelatedToFinancialAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode#CommercialInvoice
 * DocumentTypeCode.CommercialInvoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode#CreditNote
 * DocumentTypeCode.CreditNote}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DocumentTypeCode#DebitNote
 * DocumentTypeCode.DebitNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode#HireInvoice
 * DocumentTypeCode.HireInvoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode#SelfBilledInvoice
 * DocumentTypeCode.SelfBilledInvoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode#RemittanceAdviceMessage
 * DocumentTypeCode.RemittanceAdviceMessage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode#RelatedPaymentInstruction
 * DocumentTypeCode.RelatedPaymentInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode#CommercialContract
 * DocumentTypeCode.CommercialContract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode#ForeignExchangeDealReference
 * DocumentTypeCode.ForeignExchangeDealReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode#StatementOfAccount
 * DocumentTypeCode.StatementOfAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode#DispatchAdvice
 * DocumentTypeCode.DispatchAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode#PurchaseOrder
 * DocumentTypeCode.PurchaseOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode#StructuredCommunicationReference
 * DocumentTypeCode.StructuredCommunicationReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode#BillOfLading
 * DocumentTypeCode.BillOfLading}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DocumentTypeCode#Voucher
 * DocumentTypeCode.Voucher}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode#AccountReceivableOpenItem
 * DocumentTypeCode.AccountReceivableOpenItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode#TradeServicesUtilityTransaction
 * DocumentTypeCode.TradeServicesUtilityTransaction}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.DocumentType3Code
 * DocumentType3Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DocumentType6Code
 * DocumentType6Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"MSIN"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DocumentTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies a type of financial or commercial document."</li>
 * </ul>
 */
public class DocumentTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Document is an invoice claiming payment for the supply of metered
	 * services, for example gas or electricity supplied to a fixed meter.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode
	 * DocumentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MSIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeteredServiceInvoice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Document is an invoice claiming payment for the supply of metered services, for example gas or electricity supplied to a fixed meter."
	 * </li>
	 * </ul>
	 */
	public static final MMCode MeteredServiceInvoice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MeteredServiceInvoice";
			definition = "Document is an invoice claiming payment for the supply of metered services, for example gas or electricity supplied to a fixed meter.";
			owner_lazy = () -> DocumentTypeCode.mmObject();
			codeName = "MSIN";
		}
	};
	/**
	 * Document is a credit note for the final amount settled for a commercial
	 * transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode
	 * DocumentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CNFA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditNoteRelatedToFinancialAdjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Document is a credit note for the final amount settled for a commercial transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMCode CreditNoteRelatedToFinancialAdjustment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditNoteRelatedToFinancialAdjustment";
			definition = "Document is a credit note for the final amount settled for a commercial transaction.";
			owner_lazy = () -> DocumentTypeCode.mmObject();
			codeName = "CNFA";
		}
	};
	/**
	 * Document is a debit note for the final amount settled for a commercial
	 * transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode
	 * DocumentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DNFA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebitNoteRelatedToFinancialAdjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Document is a debit note for the final amount settled for a commercial transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMCode DebitNoteRelatedToFinancialAdjustment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DebitNoteRelatedToFinancialAdjustment";
			definition = "Document is a debit note for the final amount settled for a commercial transaction.";
			owner_lazy = () -> DocumentTypeCode.mmObject();
			codeName = "DNFA";
		}
	};
	/**
	 * Document is an invoice.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode
	 * DocumentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CINV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommercialInvoice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Document is an invoice."</li>
	 * </ul>
	 */
	public static final MMCode CommercialInvoice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CommercialInvoice";
			definition = "Document is an invoice.";
			owner_lazy = () -> DocumentTypeCode.mmObject();
			codeName = "CINV";
		}
	};
	/**
	 * Document is a credit note.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode
	 * DocumentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CREN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Document is a credit note."</li>
	 * </ul>
	 */
	public static final MMCode CreditNote = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditNote";
			definition = "Document is a credit note.";
			owner_lazy = () -> DocumentTypeCode.mmObject();
			codeName = "CREN";
		}
	};
	/**
	 * Document is a debit note.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode
	 * DocumentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DEBN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebitNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Document is a debit note."</li>
	 * </ul>
	 */
	public static final MMCode DebitNote = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DebitNote";
			definition = "Document is a debit note.";
			owner_lazy = () -> DocumentTypeCode.mmObject();
			codeName = "DEBN";
		}
	};
	/**
	 * Document is an invoice for the hiring of human resources or renting goods
	 * or equipment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode
	 * DocumentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HIRI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HireInvoice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Document is an invoice for the hiring of human resources or renting goods or equipment."
	 * </li>
	 * </ul>
	 */
	public static final MMCode HireInvoice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "HireInvoice";
			definition = "Document is an invoice for the hiring of human resources or renting goods or equipment.";
			owner_lazy = () -> DocumentTypeCode.mmObject();
			codeName = "HIRI";
		}
	};
	/**
	 * Document is an invoice issued by the debtor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode
	 * DocumentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SBIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SelfBilledInvoice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Document is an invoice issued by the debtor."</li>
	 * </ul>
	 */
	public static final MMCode SelfBilledInvoice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SelfBilledInvoice";
			definition = "Document is an invoice issued by the debtor.";
			owner_lazy = () -> DocumentTypeCode.mmObject();
			codeName = "SBIN";
		}
	};
	/**
	 * Document is a remittance advice sent separately from the current
	 * transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode
	 * DocumentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RADM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemittanceAdviceMessage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Document is a remittance advice sent separately from the current transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMCode RemittanceAdviceMessage = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RemittanceAdviceMessage";
			definition = "Document is a remittance advice sent separately from the current transaction.";
			owner_lazy = () -> DocumentTypeCode.mmObject();
			codeName = "RADM";
		}
	};
	/**
	 * Document is a linked payment instruction to which the current payment
	 * instruction is related, eg, in a cover scenario.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode
	 * DocumentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RPIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPaymentInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Document is a linked payment instruction to which the current payment instruction is related, eg, in a cover scenario."
	 * </li>
	 * </ul>
	 */
	public static final MMCode RelatedPaymentInstruction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPaymentInstruction";
			definition = "Document is a linked payment instruction to which the current payment instruction is related, eg, in a cover scenario.";
			owner_lazy = () -> DocumentTypeCode.mmObject();
			codeName = "RPIN";
		}
	};
	/**
	 * Document is an agreement between the parties, stipulating the terms and
	 * conditions of the delivery of goods or services.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode
	 * DocumentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CMCN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommercialContract"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Document is an agreement between the parties, stipulating the terms and conditions of the delivery of goods or services."
	 * </li>
	 * </ul>
	 */
	public static final MMCode CommercialContract = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CommercialContract";
			definition = "Document is an agreement between the parties, stipulating the terms and conditions of the delivery of goods or services.";
			owner_lazy = () -> DocumentTypeCode.mmObject();
			codeName = "CMCN";
		}
	};
	/**
	 * Document is a pre-agreed or pre-arranged foreign exchange transaction to
	 * which the payment transaction refers.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode
	 * DocumentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FXDR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignExchangeDealReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Document is a pre-agreed or pre-arranged foreign exchange transaction to which the payment transaction refers."
	 * </li>
	 * </ul>
	 */
	public static final MMCode ForeignExchangeDealReference = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ForeignExchangeDealReference";
			definition = "Document is a pre-agreed or pre-arranged foreign exchange transaction to which the payment transaction refers.";
			owner_lazy = () -> DocumentTypeCode.mmObject();
			codeName = "FXDR";
		}
	};
	/**
	 * Document is a statement of the transactions posted to the debtor's
	 * account at the supplier.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode
	 * DocumentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SOAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementOfAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Document is a statement of the transactions posted to the debtor's account at the supplier."
	 * </li>
	 * </ul>
	 */
	public static final MMCode StatementOfAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StatementOfAccount";
			definition = "Document is a statement of the transactions posted to the debtor's account at the supplier.";
			owner_lazy = () -> DocumentTypeCode.mmObject();
			codeName = "SOAC";
		}
	};
	/**
	 * Document is a dispatch advice.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode
	 * DocumentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DISP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DispatchAdvice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Document is a dispatch advice."</li>
	 * </ul>
	 */
	public static final MMCode DispatchAdvice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DispatchAdvice";
			definition = "Document is a dispatch advice.";
			owner_lazy = () -> DocumentTypeCode.mmObject();
			codeName = "DISP";
		}
	};
	/**
	 * Document is a purchase order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode
	 * DocumentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PUOR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PurchaseOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Document is a purchase order."</li>
	 * </ul>
	 */
	public static final MMCode PurchaseOrder = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PurchaseOrder";
			definition = "Document is a purchase order.";
			owner_lazy = () -> DocumentTypeCode.mmObject();
			codeName = "PUOR";
		}
	};
	/**
	 * Document is a structured communication reference provided by the creditor
	 * to identify the referred transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode
	 * DocumentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCOR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StructuredCommunicationReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Document is a structured communication reference provided by the creditor to identify the referred transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMCode StructuredCommunicationReference = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StructuredCommunicationReference";
			definition = "Document is a structured communication reference provided by the creditor to identify the referred transaction.";
			owner_lazy = () -> DocumentTypeCode.mmObject();
			codeName = "SCOR";
		}
	};
	/**
	 * Document is a shipping notice.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode
	 * DocumentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BOLD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BillOfLading"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Document is a shipping notice."</li>
	 * </ul>
	 */
	public static final MMCode BillOfLading = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BillOfLading";
			definition = "Document is a shipping notice.";
			owner_lazy = () -> DocumentTypeCode.mmObject();
			codeName = "BOLD";
		}
	};
	/**
	 * Document is an electronic payment document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode
	 * DocumentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VCHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Voucher"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Document is an electronic payment document."</li>
	 * </ul>
	 */
	public static final MMCode Voucher = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Voucher";
			definition = "Document is an electronic payment document.";
			owner_lazy = () -> DocumentTypeCode.mmObject();
			codeName = "VCHR";
		}
	};
	/**
	 * Document is a payment that applies to a specific source document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode
	 * DocumentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AROI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountReceivableOpenItem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Document is a payment that applies to a specific source document."</li>
	 * </ul>
	 */
	public static final MMCode AccountReceivableOpenItem = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccountReceivableOpenItem";
			definition = "Document is a payment that applies to a specific source document.";
			owner_lazy = () -> DocumentTypeCode.mmObject();
			codeName = "AROI";
		}
	};
	/**
	 * Document is a transaction identifier as assigned by the Trade Services
	 * Utility.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode
	 * DocumentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TSUT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeServicesUtilityTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Document is a transaction identifier as assigned by the Trade Services Utility."
	 * </li>
	 * </ul>
	 */
	public static final MMCode TradeServicesUtilityTransaction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradeServicesUtilityTransaction";
			definition = "Document is a transaction identifier as assigned by the Trade Services Utility.";
			owner_lazy = () -> DocumentTypeCode.mmObject();
			codeName = "TSUT";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("MSIN");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DocumentTypeCode";
				definition = "Specifies a type of financial or commercial document.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DocumentTypeCode.MeteredServiceInvoice, com.tools20022.repository.codeset.DocumentTypeCode.CreditNoteRelatedToFinancialAdjustment,
						com.tools20022.repository.codeset.DocumentTypeCode.DebitNoteRelatedToFinancialAdjustment, com.tools20022.repository.codeset.DocumentTypeCode.CommercialInvoice,
						com.tools20022.repository.codeset.DocumentTypeCode.CreditNote, com.tools20022.repository.codeset.DocumentTypeCode.DebitNote, com.tools20022.repository.codeset.DocumentTypeCode.HireInvoice,
						com.tools20022.repository.codeset.DocumentTypeCode.SelfBilledInvoice, com.tools20022.repository.codeset.DocumentTypeCode.RemittanceAdviceMessage,
						com.tools20022.repository.codeset.DocumentTypeCode.RelatedPaymentInstruction, com.tools20022.repository.codeset.DocumentTypeCode.CommercialContract,
						com.tools20022.repository.codeset.DocumentTypeCode.ForeignExchangeDealReference, com.tools20022.repository.codeset.DocumentTypeCode.StatementOfAccount,
						com.tools20022.repository.codeset.DocumentTypeCode.DispatchAdvice, com.tools20022.repository.codeset.DocumentTypeCode.PurchaseOrder,
						com.tools20022.repository.codeset.DocumentTypeCode.StructuredCommunicationReference, com.tools20022.repository.codeset.DocumentTypeCode.BillOfLading, com.tools20022.repository.codeset.DocumentTypeCode.Voucher,
						com.tools20022.repository.codeset.DocumentTypeCode.AccountReceivableOpenItem, com.tools20022.repository.codeset.DocumentTypeCode.TradeServicesUtilityTransaction);
				derivation_lazy = () -> Arrays.asList(DocumentType3Code.mmObject(), DocumentType6Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}