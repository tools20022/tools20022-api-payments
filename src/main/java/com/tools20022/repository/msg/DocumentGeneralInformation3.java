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
import com.tools20022.repository.codeset.ExternalDocumentType1Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max256Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Document;
import com.tools20022.repository.other.SignatureEnvelopeReference;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * General information that unambiguously identifies a document, such as
 * identification number and issue date time.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DocumentGeneralInformation3#DocumentType
 * DocumentGeneralInformation3.DocumentType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DocumentGeneralInformation3#DocumentNumber
 * DocumentGeneralInformation3.DocumentNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DocumentGeneralInformation3#SenderReceiverSequenceIdentification
 * DocumentGeneralInformation3.SenderReceiverSequenceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DocumentGeneralInformation3#IssueDate
 * DocumentGeneralInformation3.IssueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DocumentGeneralInformation3#URL
 * DocumentGeneralInformation3.URL}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DocumentGeneralInformation3#LinkFileHash
 * DocumentGeneralInformation3.LinkFileHash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DocumentGeneralInformation3#AttachedBinaryFile
 * DocumentGeneralInformation3.AttachedBinaryFile}</li>
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
 * "DocumentGeneralInformation3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "General information that unambiguously identifies a document, such as identification number and issue date time."
 * </li>
 * </ul>
 */
public class DocumentGeneralInformation3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the type of the document, for example commercial invoice.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExternalDocumentType1Code
	 * ExternalDocumentType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document#Type Document.Type}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DocumentGeneralInformation3
	 * DocumentGeneralInformation3}</li>
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
	 * "Specifies the type of the document, for example commercial invoice."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute DocumentType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DocumentGeneralInformation3.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Document.Type;
			isDerived = false;
			xmlTag = "DocTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DocumentType";
			definition = "Specifies the type of the document, for example commercial invoice.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ExternalDocumentType1Code.mmObject();
		}
	};
	/**
	 * Unique identifier of the document.
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
	 * {@linkplain com.tools20022.repository.msg.DocumentGeneralInformation3
	 * DocumentGeneralInformation3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DocNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DocumentNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique identifier of the document."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute DocumentNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DocumentGeneralInformation3.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.GenericIdentification.Identification;
			isDerived = false;
			xmlTag = "DocNb";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DocumentNumber";
			definition = "Unique identifier of the document.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Specifies the identification sequence number for a specific couple
	 * sender/receiver.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DocumentGeneralInformation3
	 * DocumentGeneralInformation3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SndrRcvrSeqId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SenderReceiverSequenceIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the identification sequence number for a specific couple sender/receiver."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute SenderReceiverSequenceIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DocumentGeneralInformation3.mmObject();
			isDerived = false;
			xmlTag = "SndrRcvrSeqId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SenderReceiverSequenceIdentification";
			definition = "Specifies the identification sequence number for a specific couple sender/receiver.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	/**
	 * Issue date of the document.
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
	 * {@linkplain com.tools20022.repository.entity.Document#IssueDate
	 * Document.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DocumentGeneralInformation3
	 * DocumentGeneralInformation3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IsseDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Issue date of the document."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute IssueDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DocumentGeneralInformation3.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Document.IssueDate;
			isDerived = false;
			xmlTag = "IsseDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueDate";
			definition = "Issue date of the document.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * URL (Uniform Resource Locator) where the document can be found
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max256Text
	 * Max256Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ElectronicAddress#URLAddress
	 * ElectronicAddress.URLAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DocumentGeneralInformation3
	 * DocumentGeneralInformation3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "URL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "URL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "URL (Uniform Resource Locator) where the document can be found"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute URL = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DocumentGeneralInformation3.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.ElectronicAddress.URLAddress;
			isDerived = false;
			xmlTag = "URL";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "URL";
			definition = "URL (Uniform Resource Locator) where the document can be found";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max256Text.mmObject();
		}
	};
	/**
	 * Full Signature Structure without Signature itself:<br>
	 * Hash + Certificate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.other.SignatureEnvelopeReference
	 * SignatureEnvelopeReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecurityCertificate#ElectronicSignature
	 * SecurityCertificate.ElectronicSignature}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DocumentGeneralInformation3
	 * DocumentGeneralInformation3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LkFileHash"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkFileHash"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Full Signature Structure without Signature itself:\r\nHash  + Certificate."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd LinkFileHash = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> DocumentGeneralInformation3.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecurityCertificate.ElectronicSignature;
			isDerived = false;
			xmlTag = "LkFileHash";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkFileHash";
			definition = "Full Signature Structure without Signature itself:\r\nHash  + Certificate.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SignatureEnvelopeReference.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Attached binary file for this document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BinaryFile1
	 * BinaryFile1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DocumentGeneralInformation3
	 * DocumentGeneralInformation3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AttchdBinryFile"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AttachedBinaryFile"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Attached binary file for this document."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd AttachedBinaryFile = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> DocumentGeneralInformation3.mmObject();
			isDerived = false;
			xmlTag = "AttchdBinryFile";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AttachedBinaryFile";
			definition = "Attached binary file for this document.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> BinaryFile1.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DocumentGeneralInformation3.DocumentType, com.tools20022.repository.msg.DocumentGeneralInformation3.DocumentNumber,
						com.tools20022.repository.msg.DocumentGeneralInformation3.SenderReceiverSequenceIdentification, com.tools20022.repository.msg.DocumentGeneralInformation3.IssueDate,
						com.tools20022.repository.msg.DocumentGeneralInformation3.URL, com.tools20022.repository.msg.DocumentGeneralInformation3.LinkFileHash, com.tools20022.repository.msg.DocumentGeneralInformation3.AttachedBinaryFile);
				trace_lazy = () -> Document.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DocumentGeneralInformation3";
				definition = "General information that unambiguously identifies a document, such as identification number and issue date time.";
			}
		});
		return mmObject_lazy.get();
	}
}