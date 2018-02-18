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
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Nature of the amount and currency on a document referred to in the remittance
 * section, typically either the original amount due/payable or the amount
 * actually remitted for the referenced document.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceAmount2#mmDuePayableAmount
 * RemittanceAmount2.mmDuePayableAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceAmount2#mmDiscountAppliedAmount
 * RemittanceAmount2.mmDiscountAppliedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceAmount2#mmCreditNoteAmount
 * RemittanceAmount2.mmCreditNoteAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RemittanceAmount2#mmTaxAmount
 * RemittanceAmount2.mmTaxAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceAmount2#mmAdjustmentAmountAndReason
 * RemittanceAmount2.mmAdjustmentAmountAndReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceAmount2#mmRemittedAmount
 * RemittanceAmount2.mmRemittedAmount}</li>
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
 * "RemittanceAmount2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Nature of the amount and currency on a document referred to in the remittance section, typically either the original amount due/payable or the amount actually remitted for the referenced document."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.RemittanceAmount3
 * RemittanceAmount3}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "RemittanceAmount2", propOrder = {"duePayableAmount", "discountAppliedAmount", "creditNoteAmount", "taxAmount", "adjustmentAmountAndReason", "remittedAmount"})
public class RemittanceAmount2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DuePyblAmt")
	protected ActiveOrHistoricCurrencyAndAmount duePayableAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmAmount
	 * PaymentObligation.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RemittanceAmount2
	 * RemittanceAmount2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DuePyblAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DuePayableAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount specified is the exact amount due and payable to the creditor."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RemittanceAmount3#mmDuePayableAmount
	 * RemittanceAmount3.mmDuePayableAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDuePayableAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentObligation.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.RemittanceAmount2.mmObject();
			isDerived = false;
			xmlTag = "DuePyblAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DuePayableAmount";
			definition = "Amount specified is the exact amount due and payable to the creditor.";
			nextVersions_lazy = () -> Arrays.asList(RemittanceAmount3.mmDuePayableAmount);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "DscntApldAmt")
	protected List<com.tools20022.repository.msg.DiscountAmountAndType1> discountAppliedAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DiscountAmountAndType1
	 * DiscountAmountAndType1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Discount#mmDiscountAppliedAmount
	 * Discount.mmDiscountAppliedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RemittanceAmount2
	 * RemittanceAmount2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DscntApldAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DiscountAppliedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount specified for the referred document is the amount of discount to be applied to the amount due and payable to the creditor."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RemittanceAmount3#mmDiscountAppliedAmount
	 * RemittanceAmount3.mmDiscountAppliedAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDiscountAppliedAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Discount.mmDiscountAppliedAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.RemittanceAmount2.mmObject();
			isDerived = false;
			xmlTag = "DscntApldAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DiscountAppliedAmount";
			definition = "Amount specified for the referred document is the amount of discount to be applied to the amount due and payable to the creditor.";
			nextVersions_lazy = () -> Arrays.asList(RemittanceAmount3.mmDiscountAppliedAmount);
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.DiscountAmountAndType1.mmObject();
		}
	};
	@XmlElement(name = "CdtNoteAmt")
	protected ActiveOrHistoricCurrencyAndAmount creditNoteAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Invoice#mmCreditDebitNoteAmount
	 * Invoice.mmCreditDebitNoteAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RemittanceAmount2
	 * RemittanceAmount2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtNoteAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditNoteAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount specified for the referred document is the amount of a credit note."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RemittanceAmount3#mmCreditNoteAmount
	 * RemittanceAmount3.mmCreditNoteAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCreditNoteAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Invoice.mmCreditDebitNoteAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.RemittanceAmount2.mmObject();
			isDerived = false;
			xmlTag = "CdtNoteAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditNoteAmount";
			definition = "Amount specified for the referred document is the amount of a credit note.";
			nextVersions_lazy = () -> Arrays.asList(RemittanceAmount3.mmCreditNoteAmount);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "TaxAmt")
	protected List<com.tools20022.repository.msg.TaxAmountAndType1> taxAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TaxAmountAndType1
	 * TaxAmountAndType1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Invoice#mmTotalTaxAmount
	 * Invoice.mmTotalTaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RemittanceAmount2
	 * RemittanceAmount2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of cash resulting from the calculation of the tax."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RemittanceAmount3#mmTaxAmount
	 * RemittanceAmount3.mmTaxAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTaxAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Invoice.mmTotalTaxAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.RemittanceAmount2.mmObject();
			isDerived = false;
			xmlTag = "TaxAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxAmount";
			definition = "Quantity of cash resulting from the calculation of the tax.";
			nextVersions_lazy = () -> Arrays.asList(RemittanceAmount3.mmTaxAmount);
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.TaxAmountAndType1.mmObject();
		}
	};
	@XmlElement(name = "AdjstmntAmtAndRsn")
	protected List<com.tools20022.repository.msg.DocumentAdjustment1> adjustmentAmountAndReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DocumentAdjustment1
	 * DocumentAdjustment1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmAdjustments
	 * Payment.mmAdjustments}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RemittanceAmount2
	 * RemittanceAmount2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AdjstmntAmtAndRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdjustmentAmountAndReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies detailed information on the amount and reason of the document adjustment."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RemittanceAmount3#mmAdjustmentAmountAndReason
	 * RemittanceAmount3.mmAdjustmentAmountAndReason}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAdjustmentAmountAndReason = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Payment.mmAdjustments;
			componentContext_lazy = () -> com.tools20022.repository.msg.RemittanceAmount2.mmObject();
			isDerived = false;
			xmlTag = "AdjstmntAmtAndRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdjustmentAmountAndReason";
			definition = "Specifies detailed information on the amount and reason of the document adjustment.";
			nextVersions_lazy = () -> Arrays.asList(RemittanceAmount3.mmAdjustmentAmountAndReason);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DocumentAdjustment1.mmObject();
		}
	};
	@XmlElement(name = "RmtdAmt")
	protected ActiveOrHistoricCurrencyAndAmount remittedAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmRemittedAmount
	 * Document.mmRemittedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RemittanceAmount2
	 * RemittanceAmount2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RmtdAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemittedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money remitted for the referred document."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RemittanceAmount3#mmRemittedAmount
	 * RemittanceAmount3.mmRemittedAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRemittedAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Document.mmRemittedAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.RemittanceAmount2.mmObject();
			isDerived = false;
			xmlTag = "RmtdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemittedAmount";
			definition = "Amount of money remitted for the referred document.";
			nextVersions_lazy = () -> Arrays.asList(RemittanceAmount3.mmRemittedAmount);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RemittanceAmount2.mmDuePayableAmount, com.tools20022.repository.msg.RemittanceAmount2.mmDiscountAppliedAmount,
						com.tools20022.repository.msg.RemittanceAmount2.mmCreditNoteAmount, com.tools20022.repository.msg.RemittanceAmount2.mmTaxAmount, com.tools20022.repository.msg.RemittanceAmount2.mmAdjustmentAmountAndReason,
						com.tools20022.repository.msg.RemittanceAmount2.mmRemittedAmount);
				trace_lazy = () -> Document.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RemittanceAmount2";
				definition = "Nature of the amount and currency on a document referred to in the remittance section, typically either the original amount due/payable or the amount actually remitted for the referenced document.";
				nextVersions_lazy = () -> Arrays.asList(RemittanceAmount3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ActiveOrHistoricCurrencyAndAmount> getDuePayableAmount() {
		return duePayableAmount == null ? Optional.empty() : Optional.of(duePayableAmount);
	}

	public RemittanceAmount2 setDuePayableAmount(ActiveOrHistoricCurrencyAndAmount duePayableAmount) {
		this.duePayableAmount = duePayableAmount;
		return this;
	}

	public List<DiscountAmountAndType1> getDiscountAppliedAmount() {
		return discountAppliedAmount == null ? discountAppliedAmount = new ArrayList<>() : discountAppliedAmount;
	}

	public RemittanceAmount2 setDiscountAppliedAmount(List<com.tools20022.repository.msg.DiscountAmountAndType1> discountAppliedAmount) {
		this.discountAppliedAmount = Objects.requireNonNull(discountAppliedAmount);
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyAndAmount> getCreditNoteAmount() {
		return creditNoteAmount == null ? Optional.empty() : Optional.of(creditNoteAmount);
	}

	public RemittanceAmount2 setCreditNoteAmount(ActiveOrHistoricCurrencyAndAmount creditNoteAmount) {
		this.creditNoteAmount = creditNoteAmount;
		return this;
	}

	public List<TaxAmountAndType1> getTaxAmount() {
		return taxAmount == null ? taxAmount = new ArrayList<>() : taxAmount;
	}

	public RemittanceAmount2 setTaxAmount(List<com.tools20022.repository.msg.TaxAmountAndType1> taxAmount) {
		this.taxAmount = Objects.requireNonNull(taxAmount);
		return this;
	}

	public List<DocumentAdjustment1> getAdjustmentAmountAndReason() {
		return adjustmentAmountAndReason == null ? adjustmentAmountAndReason = new ArrayList<>() : adjustmentAmountAndReason;
	}

	public RemittanceAmount2 setAdjustmentAmountAndReason(List<com.tools20022.repository.msg.DocumentAdjustment1> adjustmentAmountAndReason) {
		this.adjustmentAmountAndReason = Objects.requireNonNull(adjustmentAmountAndReason);
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyAndAmount> getRemittedAmount() {
		return remittedAmount == null ? Optional.empty() : Optional.of(remittedAmount);
	}

	public RemittanceAmount2 setRemittedAmount(ActiveOrHistoricCurrencyAndAmount remittedAmount) {
		this.remittedAmount = remittedAmount;
		return this;
	}
}