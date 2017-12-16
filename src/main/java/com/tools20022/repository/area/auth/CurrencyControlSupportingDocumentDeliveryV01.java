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

package com.tools20022.repository.area.auth;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.AuthoritiesLatestVersion;
import com.tools20022.repository.msg.CurrencyControlHeader3;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msg.SupportingDocument1;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.*;

/**
 * The CurrencyControlSupportingDocumentDelivery message is sent by either the
 * reporting party (respectively the registration agent or the registration
 * agent (respectively the reporting party) in response to the supporting
 * document request.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.CurrencyControlSupportingDocumentDeliveryV01#mmGroupHeader
 * CurrencyControlSupportingDocumentDeliveryV01.mmGroupHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.CurrencyControlSupportingDocumentDeliveryV01#mmSupportingDocument
 * CurrencyControlSupportingDocumentDeliveryV01.mmSupportingDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.CurrencyControlSupportingDocumentDeliveryV01#mmSupplementaryData
 * CurrencyControlSupportingDocumentDeliveryV01.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "CcyCtrlSpprtgDocDlvry"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AuthoritiesLatestVersion
 * AuthoritiesLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code auth.025.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CurrencyControlSupportingDocumentDeliveryV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The CurrencyControlSupportingDocumentDelivery message is sent by either the reporting party (respectively the registration agent or the registration agent (respectively the reporting party) in response to the supporting document request."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CurrencyControlSupportingDocumentDeliveryV01", propOrder = {"groupHeader", "supportingDocument", "supplementaryData"})
public class CurrencyControlSupportingDocumentDeliveryV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected CurrencyControlHeader3 groupHeader;
	/**
	 * Characteristics shared by all individual items included in the message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyControlHeader3
	 * CurrencyControlHeader3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrpHdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupHeader"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Characteristics shared by all individual items included in the message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmGroupHeader = new MMMessageBuildingBlock() {
		{
			xmlTag = "GrpHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeader";
			definition = "Characteristics shared by all individual items included in the message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CurrencyControlHeader3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CurrencyControlSupportingDocumentDeliveryV01.class.getMethod("getGroupHeader", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<SupportingDocument1> supportingDocument;
	/**
	 * Details of the supporting document provided for the registered contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SupportingDocument1
	 * SupportingDocument1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SpprtgDoc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupportingDocument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details of the supporting document provided for the registered contract."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSupportingDocument = new MMMessageBuildingBlock() {
		{
			xmlTag = "SpprtgDoc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupportingDocument";
			definition = "Details of the supporting document provided for the registered contract.";
			minOccurs = 1;
			complexType_lazy = () -> SupportingDocument1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CurrencyControlSupportingDocumentDeliveryV01.class.getMethod("getSupportingDocument", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * Additional information that cannot be captured in the structured elements
	 * and/or any other specific block.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CurrencyControlSupportingDocumentDeliveryV01.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CurrencyControlSupportingDocumentDeliveryV01";
				definition = "The CurrencyControlSupportingDocumentDelivery message is sent by either the reporting party (respectively the registration agent or the registration agent (respectively the reporting party) in response to the supporting document request.";
				rootElement = "Document";
				xmlTag = "CcyCtrlSpprtgDocDlvry";
				businessArea_lazy = () -> AuthoritiesLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.auth.CurrencyControlSupportingDocumentDeliveryV01.mmGroupHeader,
						com.tools20022.repository.area.auth.CurrencyControlSupportingDocumentDeliveryV01.mmSupportingDocument, com.tools20022.repository.area.auth.CurrencyControlSupportingDocumentDeliveryV01.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "auth";
						messageFunctionality = "025";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return CurrencyControlSupportingDocumentDeliveryV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "GrpHdr", required = true)
	public CurrencyControlHeader3 getGroupHeader() {
		return groupHeader;
	}

	public void setGroupHeader(CurrencyControlHeader3 groupHeader) {
		this.groupHeader = groupHeader;
	}

	@XmlElement(name = "SpprtgDoc", required = true)
	public List<SupportingDocument1> getSupportingDocument() {
		return supportingDocument;
	}

	public void setSupportingDocument(List<SupportingDocument1> supportingDocument) {
		this.supportingDocument = supportingDocument;
	}

	@XmlElement(name = "SplmtryData")
	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData;
	}

	public void setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = supplementaryData;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:auth.025.01.01")
	static public class Document {
		@XmlElement(name = "CcyCtrlSpprtgDocDlvry", required = true)
		public CurrencyControlSupportingDocumentDeliveryV01 messageBody;
	}
}