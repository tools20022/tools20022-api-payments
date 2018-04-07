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
import com.tools20022.repository.choice.ContractRegistrationReference1Choice;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max1025Text;
import com.tools20022.repository.entity.Contract;
import com.tools20022.repository.entity.Document;
import com.tools20022.repository.entity.PaymentObligation;
import com.tools20022.repository.entity.ShipmentDateRange;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Certificate and contract reference of a transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionCertificateContract1#mmContractReference
 * TransactionCertificateContract1.mmContractReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionCertificateContract1#mmTransactionAmountInContractCurrency
 * TransactionCertificateContract1.mmTransactionAmountInContractCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionCertificateContract1#mmExpectedShipmentDate
 * TransactionCertificateContract1.mmExpectedShipmentDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionCertificateContract1#mmExpectedAdvancePaymentReturnDate
 * TransactionCertificateContract1.mmExpectedAdvancePaymentReturnDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionCertificateContract1#mmAdditionalInformation
 * TransactionCertificateContract1.mmAdditionalInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Contract Contract}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTransactionAmountInContractCurrencyPresenceRule#forTransactionCertificateContract1
 * ConstraintTransactionAmountInContractCurrencyPresenceRule.
 * forTransactionCertificateContract1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TransactionCertificateContract1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Certificate and contract reference of a transaction."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TransactionCertificateContract1", propOrder = {"contractReference", "transactionAmountInContractCurrency", "expectedShipmentDate", "expectedAdvancePaymentReturnDate", "additionalInformation"})
public class TransactionCertificateContract1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CtrctRef")
	protected ContractRegistrationReference1Choice contractReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ContractRegistrationReference1Choice
	 * ContractRegistrationReference1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmDocumentIdentification
	 * Document.mmDocumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionCertificateContract1
	 * TransactionCertificateContract1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrctRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContractReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference of the contract provided as through the date and identification of the contract or through the registered contract identification."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransactionCertificateContract1, Optional<ContractRegistrationReference1Choice>> mmContractReference = new MMMessageAssociationEnd<TransactionCertificateContract1, Optional<ContractRegistrationReference1Choice>>() {
		{
			businessElementTrace_lazy = () -> Document.mmDocumentIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionCertificateContract1.mmObject();
			isDerived = false;
			xmlTag = "CtrctRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContractReference";
			definition = "Reference of the contract provided as through the date and identification of the contract or through the registered contract identification.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ContractRegistrationReference1Choice.mmObject();
		}

		@Override
		public Optional<ContractRegistrationReference1Choice> getValue(TransactionCertificateContract1 obj) {
			return obj.getContractReference();
		}

		@Override
		public void setValue(TransactionCertificateContract1 obj, Optional<ContractRegistrationReference1Choice> value) {
			obj.setContractReference(value.orElse(null));
		}
	};
	@XmlElement(name = "TxAmtInCtrctCcy")
	protected ActiveCurrencyAndAmount transactionAmountInContractCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmAmount
	 * Document.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionCertificateContract1
	 * TransactionCertificateContract1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxAmtInCtrctCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionAmountInContractCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the amount of the transaction in the currency of the registered contract."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransactionCertificateContract1, Optional<ActiveCurrencyAndAmount>> mmTransactionAmountInContractCurrency = new MMMessageAttribute<TransactionCertificateContract1, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Document.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionCertificateContract1.mmObject();
			isDerived = false;
			xmlTag = "TxAmtInCtrctCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionAmountInContractCurrency";
			definition = "Provides the amount of the transaction in the currency of the registered contract.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(TransactionCertificateContract1 obj) {
			return obj.getTransactionAmountInContractCurrency();
		}

		@Override
		public void setValue(TransactionCertificateContract1 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setTransactionAmountInContractCurrency(value.orElse(null));
		}
	};
	@XmlElement(name = "XpctdShipmntDt")
	protected ISODate expectedShipmentDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ShipmentDateRange#mmShipmentDate
	 * ShipmentDateRange.mmShipmentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionCertificateContract1
	 * TransactionCertificateContract1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpctdShipmntDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpectedShipmentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Expected shipment date as per registered contract."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransactionCertificateContract1, Optional<ISODate>> mmExpectedShipmentDate = new MMMessageAttribute<TransactionCertificateContract1, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> ShipmentDateRange.mmShipmentDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionCertificateContract1.mmObject();
			isDerived = false;
			xmlTag = "XpctdShipmntDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpectedShipmentDate";
			definition = "Expected shipment date as per registered contract.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(TransactionCertificateContract1 obj) {
			return obj.getExpectedShipmentDate();
		}

		@Override
		public void setValue(TransactionCertificateContract1 obj, Optional<ISODate> value) {
			obj.setExpectedShipmentDate(value.orElse(null));
		}
	};
	@XmlElement(name = "XpctdAdvncPmtRtrDt")
	protected ISODate expectedAdvancePaymentReturnDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPaymentDueDate
	 * PaymentObligation.mmPaymentDueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionCertificateContract1
	 * TransactionCertificateContract1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpctdAdvncPmtRtrDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpectedAdvancePaymentReturnDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Expected advance payment (or prepayment) return date in case counterparty will not deliver the goods/services."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransactionCertificateContract1, Optional<ISODate>> mmExpectedAdvancePaymentReturnDate = new MMMessageAttribute<TransactionCertificateContract1, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> PaymentObligation.mmPaymentDueDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionCertificateContract1.mmObject();
			isDerived = false;
			xmlTag = "XpctdAdvncPmtRtrDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpectedAdvancePaymentReturnDate";
			definition = "Expected advance payment (or prepayment) return date in case counterparty will not deliver the goods/services.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(TransactionCertificateContract1 obj) {
			return obj.getExpectedAdvancePaymentReturnDate();
		}

		@Override
		public void setValue(TransactionCertificateContract1 obj, Optional<ISODate> value) {
			obj.setExpectedAdvancePaymentReturnDate(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlInf")
	protected Max1025Text additionalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max1025Text
	 * Max1025Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionCertificateContract1
	 * TransactionCertificateContract1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Further details on the transaction certificate contract."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransactionCertificateContract1, Optional<Max1025Text>> mmAdditionalInformation = new MMMessageAttribute<TransactionCertificateContract1, Optional<Max1025Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionCertificateContract1.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Further details on the transaction certificate contract.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max1025Text.mmObject();
		}

		@Override
		public Optional<Max1025Text> getValue(TransactionCertificateContract1 obj) {
			return obj.getAdditionalInformation();
		}

		@Override
		public void setValue(TransactionCertificateContract1 obj, Optional<Max1025Text> value) {
			obj.setAdditionalInformation(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionCertificateContract1.mmContractReference,
						com.tools20022.repository.msg.TransactionCertificateContract1.mmTransactionAmountInContractCurrency, com.tools20022.repository.msg.TransactionCertificateContract1.mmExpectedShipmentDate,
						com.tools20022.repository.msg.TransactionCertificateContract1.mmExpectedAdvancePaymentReturnDate, com.tools20022.repository.msg.TransactionCertificateContract1.mmAdditionalInformation);
				trace_lazy = () -> Contract.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTransactionAmountInContractCurrencyPresenceRule.forTransactionCertificateContract1);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransactionCertificateContract1";
				definition = "Certificate and contract reference of a transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ContractRegistrationReference1Choice> getContractReference() {
		return contractReference == null ? Optional.empty() : Optional.of(contractReference);
	}

	public TransactionCertificateContract1 setContractReference(ContractRegistrationReference1Choice contractReference) {
		this.contractReference = contractReference;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getTransactionAmountInContractCurrency() {
		return transactionAmountInContractCurrency == null ? Optional.empty() : Optional.of(transactionAmountInContractCurrency);
	}

	public TransactionCertificateContract1 setTransactionAmountInContractCurrency(ActiveCurrencyAndAmount transactionAmountInContractCurrency) {
		this.transactionAmountInContractCurrency = transactionAmountInContractCurrency;
		return this;
	}

	public Optional<ISODate> getExpectedShipmentDate() {
		return expectedShipmentDate == null ? Optional.empty() : Optional.of(expectedShipmentDate);
	}

	public TransactionCertificateContract1 setExpectedShipmentDate(ISODate expectedShipmentDate) {
		this.expectedShipmentDate = expectedShipmentDate;
		return this;
	}

	public Optional<ISODate> getExpectedAdvancePaymentReturnDate() {
		return expectedAdvancePaymentReturnDate == null ? Optional.empty() : Optional.of(expectedAdvancePaymentReturnDate);
	}

	public TransactionCertificateContract1 setExpectedAdvancePaymentReturnDate(ISODate expectedAdvancePaymentReturnDate) {
		this.expectedAdvancePaymentReturnDate = expectedAdvancePaymentReturnDate;
		return this;
	}

	public Optional<Max1025Text> getAdditionalInformation() {
		return additionalInformation == null ? Optional.empty() : Optional.of(additionalInformation);
	}

	public TransactionCertificateContract1 setAdditionalInformation(Max1025Text additionalInformation) {
		this.additionalInformation = additionalInformation;
		return this;
	}
}