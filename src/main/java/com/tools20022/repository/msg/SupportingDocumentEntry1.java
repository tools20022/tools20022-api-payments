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
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.Exact4AlphaNumericText;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max500Text;
import com.tools20022.repository.entity.Document;
import com.tools20022.repository.entity.GenericIdentification;
import com.tools20022.repository.entity.RegisteredContract;
import com.tools20022.repository.entity.Transport;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.msg.SupportingDocumentEntry1#mmEntryIdentification
 * SupportingDocumentEntry1.mmEntryIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SupportingDocumentEntry1#mmOriginalDocument
 * SupportingDocumentEntry1.mmOriginalDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SupportingDocumentEntry1#mmDocumentType
 * SupportingDocumentEntry1.mmDocumentType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SupportingDocumentEntry1#mmTotalAmount
 * SupportingDocumentEntry1.mmTotalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SupportingDocumentEntry1#mmTotalAmountAfterShipment
 * SupportingDocumentEntry1.mmTotalAmountAfterShipment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SupportingDocumentEntry1#mmTotalAmountInContractCurrency
 * SupportingDocumentEntry1.mmTotalAmountInContractCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SupportingDocumentEntry1#mmTotalAmountAfterShipmentInContractCurrency
 * SupportingDocumentEntry1.mmTotalAmountAfterShipmentInContractCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SupportingDocumentEntry1#mmShipmentAttributes
 * SupportingDocumentEntry1.mmShipmentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SupportingDocumentEntry1#mmAdditionalInformation
 * SupportingDocumentEntry1.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SupportingDocumentEntry1#mmAttachment
 * SupportingDocumentEntry1.mmAttachment}</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SupportingDocumentEntry1", propOrder = {"entryIdentification", "originalDocument", "documentType", "totalAmount", "totalAmountAfterShipment", "totalAmountInContractCurrency", "totalAmountAfterShipmentInContractCurrency",
		"shipmentAttributes", "additionalInformation", "attachment"})
public class SupportingDocumentEntry1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "NtryId", required = true)
	protected Max35Text entryIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
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
	public static final MMMessageAttribute mmEntryIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SupportingDocumentEntry1.mmObject();
			isDerived = false;
			xmlTag = "NtryId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntryIdentification";
			definition = "Unique and unambiguous identification of the supporting document entry.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "OrgnlDoc", required = true)
	protected DocumentIdentification22 originalDocument;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification22
	 * DocumentIdentification22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmDocumentIdentification
	 * Document.mmDocumentIdentification}</li>
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
	public static final MMMessageAssociationEnd mmOriginalDocument = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Document.mmDocumentIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SupportingDocumentEntry1.mmObject();
			isDerived = false;
			xmlTag = "OrgnlDoc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalDocument";
			definition = "Identification of the original document for which the supporting documents are provided.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DocumentIdentification22.mmObject();
		}
	};
	@XmlElement(name = "DocTp", required = true)
	protected Exact4AlphaNumericText documentType;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.Document#mmType
	 * Document.mmType}</li>
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
	public static final MMMessageAttribute mmDocumentType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Document.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.SupportingDocumentEntry1.mmObject();
			isDerived = false;
			xmlTag = "DocTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DocumentType";
			definition = "Document type in a coded form.\r\n\r\nTBC: Data must support \"_\".";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Exact4AlphaNumericText.mmObject();
		}
	};
	@XmlElement(name = "TtlAmt")
	protected ActiveCurrencyAndAmount totalAmount;
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
	public static final MMMessageAttribute mmTotalAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Document.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SupportingDocumentEntry1.mmObject();
			isDerived = false;
			xmlTag = "TtlAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalAmount";
			definition = "Total amount of the supporting document entry.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "TtlAmtAftrShipmnt")
	protected ActiveCurrencyAndAmount totalAmountAfterShipment;
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
	public static final MMMessageAttribute mmTotalAmountAfterShipment = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Document.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SupportingDocumentEntry1.mmObject();
			isDerived = false;
			xmlTag = "TtlAmtAftrShipmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalAmountAfterShipment";
			definition = "Total amount after shipment of the supporting document entry.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "TtlAmtInCtrctCcy")
	protected ActiveCurrencyAndAmount totalAmountInContractCurrency;
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
	public static final MMMessageAttribute mmTotalAmountInContractCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Document.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SupportingDocumentEntry1.mmObject();
			isDerived = false;
			xmlTag = "TtlAmtInCtrctCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalAmountInContractCurrency";
			definition = "Total amount of the supporting document entry in the currency of the contract.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "TtlAmtAftrShipmntInCtrctCcy")
	protected ActiveCurrencyAndAmount totalAmountAfterShipmentInContractCurrency;
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
	public static final MMMessageAttribute mmTotalAmountAfterShipmentInContractCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Document.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SupportingDocumentEntry1.mmObject();
			isDerived = false;
			xmlTag = "TtlAmtAftrShipmntInCtrctCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalAmountAfterShipmentInContractCurrency";
			definition = "Total amount after shipment of the supporting document entry in the currency of the contract.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "ShipmntAttrbts", required = true)
	protected ShipmentAttribute1 shipmentAttributes;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ShipmentAttribute1
	 * ShipmentAttribute1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Transport#mmShipmentDates
	 * Transport.mmShipmentDates}</li>
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
	public static final MMMessageAssociationEnd mmShipmentAttributes = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Transport.mmShipmentDates;
			componentContext_lazy = () -> com.tools20022.repository.msg.SupportingDocumentEntry1.mmObject();
			isDerived = false;
			xmlTag = "ShipmntAttrbts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShipmentAttributes";
			definition = "Conditions and attributes related to the shipment.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ShipmentAttribute1.mmObject();
		}
	};
	@XmlElement(name = "AddtlInf")
	protected Max500Text additionalInformation;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute mmAdditionalInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SupportingDocumentEntry1.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Further details on the supporting document entry.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max500Text.mmObject();
		}
	};
	@XmlElement(name = "Attchmnt")
	protected List<com.tools20022.repository.msg.DocumentGeneralInformation3> attachment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.DocumentGeneralInformation3
	 * DocumentGeneralInformation3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmAttachment
	 * RegisteredContract.mmAttachment}</li>
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
	public static final MMMessageAssociationEnd mmAttachment = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> RegisteredContract.mmAttachment;
			componentContext_lazy = () -> com.tools20022.repository.msg.SupportingDocumentEntry1.mmObject();
			isDerived = false;
			xmlTag = "Attchmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Attachment";
			definition = "Documents provided as attachments to the supporting document entry.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DocumentGeneralInformation3.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SupportingDocumentEntry1.mmEntryIdentification, com.tools20022.repository.msg.SupportingDocumentEntry1.mmOriginalDocument,
						com.tools20022.repository.msg.SupportingDocumentEntry1.mmDocumentType, com.tools20022.repository.msg.SupportingDocumentEntry1.mmTotalAmount,
						com.tools20022.repository.msg.SupportingDocumentEntry1.mmTotalAmountAfterShipment, com.tools20022.repository.msg.SupportingDocumentEntry1.mmTotalAmountInContractCurrency,
						com.tools20022.repository.msg.SupportingDocumentEntry1.mmTotalAmountAfterShipmentInContractCurrency, com.tools20022.repository.msg.SupportingDocumentEntry1.mmShipmentAttributes,
						com.tools20022.repository.msg.SupportingDocumentEntry1.mmAdditionalInformation, com.tools20022.repository.msg.SupportingDocumentEntry1.mmAttachment);
				trace_lazy = () -> Document.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SupportingDocumentEntry1";
				definition = "Currency control document entry supporting the contract registration.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getEntryIdentification() {
		return entryIdentification;
	}

	public SupportingDocumentEntry1 setEntryIdentification(Max35Text entryIdentification) {
		this.entryIdentification = Objects.requireNonNull(entryIdentification);
		return this;
	}

	public DocumentIdentification22 getOriginalDocument() {
		return originalDocument;
	}

	public SupportingDocumentEntry1 setOriginalDocument(com.tools20022.repository.msg.DocumentIdentification22 originalDocument) {
		this.originalDocument = Objects.requireNonNull(originalDocument);
		return this;
	}

	public Exact4AlphaNumericText getDocumentType() {
		return documentType;
	}

	public SupportingDocumentEntry1 setDocumentType(Exact4AlphaNumericText documentType) {
		this.documentType = Objects.requireNonNull(documentType);
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getTotalAmount() {
		return totalAmount == null ? Optional.empty() : Optional.of(totalAmount);
	}

	public SupportingDocumentEntry1 setTotalAmount(ActiveCurrencyAndAmount totalAmount) {
		this.totalAmount = totalAmount;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getTotalAmountAfterShipment() {
		return totalAmountAfterShipment == null ? Optional.empty() : Optional.of(totalAmountAfterShipment);
	}

	public SupportingDocumentEntry1 setTotalAmountAfterShipment(ActiveCurrencyAndAmount totalAmountAfterShipment) {
		this.totalAmountAfterShipment = totalAmountAfterShipment;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getTotalAmountInContractCurrency() {
		return totalAmountInContractCurrency == null ? Optional.empty() : Optional.of(totalAmountInContractCurrency);
	}

	public SupportingDocumentEntry1 setTotalAmountInContractCurrency(ActiveCurrencyAndAmount totalAmountInContractCurrency) {
		this.totalAmountInContractCurrency = totalAmountInContractCurrency;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getTotalAmountAfterShipmentInContractCurrency() {
		return totalAmountAfterShipmentInContractCurrency == null ? Optional.empty() : Optional.of(totalAmountAfterShipmentInContractCurrency);
	}

	public SupportingDocumentEntry1 setTotalAmountAfterShipmentInContractCurrency(ActiveCurrencyAndAmount totalAmountAfterShipmentInContractCurrency) {
		this.totalAmountAfterShipmentInContractCurrency = totalAmountAfterShipmentInContractCurrency;
		return this;
	}

	public ShipmentAttribute1 getShipmentAttributes() {
		return shipmentAttributes;
	}

	public SupportingDocumentEntry1 setShipmentAttributes(com.tools20022.repository.msg.ShipmentAttribute1 shipmentAttributes) {
		this.shipmentAttributes = Objects.requireNonNull(shipmentAttributes);
		return this;
	}

	public Optional<Max500Text> getAdditionalInformation() {
		return additionalInformation == null ? Optional.empty() : Optional.of(additionalInformation);
	}

	public SupportingDocumentEntry1 setAdditionalInformation(Max500Text additionalInformation) {
		this.additionalInformation = additionalInformation;
		return this;
	}

	public List<DocumentGeneralInformation3> getAttachment() {
		return attachment == null ? attachment = new ArrayList<>() : attachment;
	}

	public SupportingDocumentEntry1 setAttachment(List<com.tools20022.repository.msg.DocumentGeneralInformation3> attachment) {
		this.attachment = Objects.requireNonNull(attachment);
		return this;
	}
}