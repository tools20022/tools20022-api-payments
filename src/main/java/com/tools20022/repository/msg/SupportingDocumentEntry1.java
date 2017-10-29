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
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.Exact4AlphaNumericText;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max500Text;
import com.tools20022.repository.entity.Document;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Currency control document entry supporting the contract registration.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SupportingDocumentEntry1#EntryIdentification
 * SupportingDocumentEntry1.EntryIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SupportingDocumentEntry1#OriginalDocument
 * SupportingDocumentEntry1.OriginalDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SupportingDocumentEntry1#DocumentType
 * SupportingDocumentEntry1.DocumentType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SupportingDocumentEntry1#TotalAmount
 * SupportingDocumentEntry1.TotalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SupportingDocumentEntry1#TotalAmountAfterShipment
 * SupportingDocumentEntry1.TotalAmountAfterShipment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SupportingDocumentEntry1#TotalAmountInContractCurrency
 * SupportingDocumentEntry1.TotalAmountInContractCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SupportingDocumentEntry1#TotalAmountAfterShipmentInContractCurrency
 * SupportingDocumentEntry1.TotalAmountAfterShipmentInContractCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SupportingDocumentEntry1#ShipmentAttributes
 * SupportingDocumentEntry1.ShipmentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SupportingDocumentEntry1#AdditionalInformation
 * SupportingDocumentEntry1.AdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SupportingDocumentEntry1#Attachment
 * SupportingDocumentEntry1.Attachment}</li>
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
 * "SupportingDocumentEntry1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Currency control document entry supporting the contract registration."</li>
 * </ul>
 */
public class SupportingDocumentEntry1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Unique and unambiguous identification of the supporting document entry.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#Identification
	 * GenericIdentification.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentEntry1
	 * SupportingDocumentEntry1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtryId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntryIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification of the supporting document entry."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute EntryIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SupportingDocumentEntry1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.GenericIdentification.Identification;
			isDerived = false;
			xmlTag = "NtryId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntryIdentification";
			definition = "Unique and unambiguous identification of the supporting document entry.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Identification of the original document for which the supporting
	 * documents are provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification22
	 * DocumentIdentification22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document#DocumentIdentification
	 * Document.DocumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentEntry1
	 * SupportingDocumentEntry1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlDoc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalDocument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the original document for which the supporting documents are provided."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd OriginalDocument = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> SupportingDocumentEntry1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Document.DocumentIdentification;
			isDerived = false;
			xmlTag = "OrgnlDoc";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalDocument";
			definition = "Identification of the original document for which the supporting documents are provided.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DocumentIdentification22.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Document type in a coded form.<br>
	 * <br>
	 * TBC: Data must support "_".
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact4AlphaNumericText
	 * Exact4AlphaNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document#Type Document.Type}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentEntry1
	 * SupportingDocumentEntry1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DocTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DocumentType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Document type in a coded form.\r\n\r\nTBC: Data must support \"_\"."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute DocumentType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SupportingDocumentEntry1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Document.Type;
			isDerived = false;
			xmlTag = "DocTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DocumentType";
			definition = "Document type in a coded form.\r\n\r\nTBC: Data must support \"_\".";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Exact4AlphaNumericText.mmObject();
		}
	};
	/**
	 * Total amount of the supporting document entry.
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
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentEntry1
	 * SupportingDocumentEntry1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total amount of the supporting document entry."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute TotalAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SupportingDocumentEntry1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Document.Amount;
			isDerived = false;
			xmlTag = "TtlAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalAmount";
			definition = "Total amount of the supporting document entry.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Total amount after shipment of the supporting document entry.
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
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentEntry1
	 * SupportingDocumentEntry1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlAmtAftrShipmnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalAmountAfterShipment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount after shipment of the supporting document entry."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute TotalAmountAfterShipment = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SupportingDocumentEntry1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Document.Amount;
			isDerived = false;
			xmlTag = "TtlAmtAftrShipmnt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalAmountAfterShipment";
			definition = "Total amount after shipment of the supporting document entry.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Total amount of the supporting document entry in the currency of the
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
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentEntry1
	 * SupportingDocumentEntry1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlAmtInCtrctCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalAmountInContractCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount of the supporting document entry in the currency of the contract."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute TotalAmountInContractCurrency = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SupportingDocumentEntry1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Document.Amount;
			isDerived = false;
			xmlTag = "TtlAmtInCtrctCcy";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalAmountInContractCurrency";
			definition = "Total amount of the supporting document entry in the currency of the contract.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Total amount after shipment of the supporting document entry in the
	 * currency of the contract.
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
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentEntry1
	 * SupportingDocumentEntry1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlAmtAftrShipmntInCtrctCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalAmountAfterShipmentInContractCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount after shipment of the supporting document entry in the currency of the contract."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute TotalAmountAfterShipmentInContractCurrency = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SupportingDocumentEntry1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Document.Amount;
			isDerived = false;
			xmlTag = "TtlAmtAftrShipmntInCtrctCcy";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalAmountAfterShipmentInContractCurrency";
			definition = "Total amount after shipment of the supporting document entry in the currency of the contract.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Conditions and attributes related to the shipment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ShipmentAttribute1
	 * ShipmentAttribute1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Transport#ShipmentDates
	 * Transport.ShipmentDates}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentEntry1
	 * SupportingDocumentEntry1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ShipmntAttrbts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShipmentAttributes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Conditions and attributes related to the shipment."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd ShipmentAttributes = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> SupportingDocumentEntry1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Transport.ShipmentDates;
			isDerived = false;
			xmlTag = "ShipmntAttrbts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShipmentAttributes";
			definition = "Conditions and attributes related to the shipment.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> ShipmentAttribute1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Further details on the supporting document entry.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max500Text
	 * Max500Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentEntry1
	 * SupportingDocumentEntry1}</li>
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
	 * definition} = "Further details on the supporting document entry."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute AdditionalInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SupportingDocumentEntry1.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Further details on the supporting document entry.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max500Text.mmObject();
		}
	};
	/**
	 * Documents provided as attachments to the supporting document entry.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.DocumentGeneralInformation3
	 * DocumentGeneralInformation3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract#Attachment
	 * RegisteredContract.Attachment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentEntry1
	 * SupportingDocumentEntry1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Attchmnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Attachment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Documents provided as attachments to the supporting document entry."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Attachment = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> SupportingDocumentEntry1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.RegisteredContract.Attachment;
			isDerived = false;
			xmlTag = "Attchmnt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Attachment";
			definition = "Documents provided as attachments to the supporting document entry.";
			minOccurs = 0;
			type_lazy = () -> DocumentGeneralInformation3.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SupportingDocumentEntry1.EntryIdentification, com.tools20022.repository.msg.SupportingDocumentEntry1.OriginalDocument,
						com.tools20022.repository.msg.SupportingDocumentEntry1.DocumentType, com.tools20022.repository.msg.SupportingDocumentEntry1.TotalAmount,
						com.tools20022.repository.msg.SupportingDocumentEntry1.TotalAmountAfterShipment, com.tools20022.repository.msg.SupportingDocumentEntry1.TotalAmountInContractCurrency,
						com.tools20022.repository.msg.SupportingDocumentEntry1.TotalAmountAfterShipmentInContractCurrency, com.tools20022.repository.msg.SupportingDocumentEntry1.ShipmentAttributes,
						com.tools20022.repository.msg.SupportingDocumentEntry1.AdditionalInformation, com.tools20022.repository.msg.SupportingDocumentEntry1.Attachment);
				trace_lazy = () -> Document.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SupportingDocumentEntry1";
				definition = "Currency control document entry supporting the contract registration.";
			}
		});
		return mmObject_lazy.get();
	}
}