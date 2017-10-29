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
import com.tools20022.repository.choice.ContractRegistrationReference1Choice;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max1025Text;
import com.tools20022.repository.entity.Contract;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.msg.TransactionCertificateContract1#ContractReference
 * TransactionCertificateContract1.ContractReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionCertificateContract1#TransactionAmountInContractCurrency
 * TransactionCertificateContract1.TransactionAmountInContractCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionCertificateContract1#ExpectedShipmentDate
 * TransactionCertificateContract1.ExpectedShipmentDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionCertificateContract1#ExpectedAdvancePaymentReturnDate
 * TransactionCertificateContract1.ExpectedAdvancePaymentReturnDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionCertificateContract1#AdditionalInformation
 * TransactionCertificateContract1.AdditionalInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Contract Contract}</li>
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
 * "TransactionCertificateContract1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Certificate and contract reference of a transaction."</li>
 * </ul>
 */
public class TransactionCertificateContract1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Reference of the contract provided as through the date and identification
	 * of the contract or through the registered contract identification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ContractRegistrationReference1Choice
	 * ContractRegistrationReference1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document#DocumentIdentification
	 * Document.DocumentIdentification}</li>
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
	public static final MMMessageAssociationEnd ContractReference = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> TransactionCertificateContract1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Document.DocumentIdentification;
			isDerived = false;
			xmlTag = "CtrctRef";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContractReference";
			definition = "Reference of the contract provided as through the date and identification of the contract or through the registered contract identification.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> ContractRegistrationReference1Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Provides the amount of the transaction in the currency of the registered
	 * contract.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.Document#Amount
	 * Document.Amount}</li>
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
	public static final MMMessageAttribute TransactionAmountInContractCurrency = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TransactionCertificateContract1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Document.Amount;
			isDerived = false;
			xmlTag = "TxAmtInCtrctCcy";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionAmountInContractCurrency";
			definition = "Provides the amount of the transaction in the currency of the registered contract.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Expected shipment date as per registered contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ShipmentDateRange#ShipmentDate
	 * ShipmentDateRange.ShipmentDate}</li>
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
	public static final MMMessageAttribute ExpectedShipmentDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TransactionCertificateContract1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.ShipmentDateRange.ShipmentDate;
			isDerived = false;
			xmlTag = "XpctdShipmntDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpectedShipmentDate";
			definition = "Expected shipment date as per registered contract.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Expected advance payment (or prepayment) return date in case counterparty
	 * will not deliver the goods/services.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#PaymentDueDate
	 * PaymentObligation.PaymentDueDate}</li>
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
	public static final MMMessageAttribute ExpectedAdvancePaymentReturnDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TransactionCertificateContract1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentObligation.PaymentDueDate;
			isDerived = false;
			xmlTag = "XpctdAdvncPmtRtrDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpectedAdvancePaymentReturnDate";
			definition = "Expected advance payment (or prepayment) return date in case counterparty will not deliver the goods/services.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Further details on the transaction certificate contract.
	 * <p>
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
	public static final MMMessageAttribute AdditionalInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TransactionCertificateContract1.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Further details on the transaction certificate contract.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max1025Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionCertificateContract1.ContractReference, com.tools20022.repository.msg.TransactionCertificateContract1.TransactionAmountInContractCurrency,
						com.tools20022.repository.msg.TransactionCertificateContract1.ExpectedShipmentDate, com.tools20022.repository.msg.TransactionCertificateContract1.ExpectedAdvancePaymentReturnDate,
						com.tools20022.repository.msg.TransactionCertificateContract1.AdditionalInformation);
				trace_lazy = () -> Contract.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TransactionCertificateContract1";
				definition = "Certificate and contract reference of a transaction.";
			}
		});
		return mmObject_lazy.get();
	}
}