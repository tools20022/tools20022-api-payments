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
import com.tools20022.repository.choice.DateOrDateTimePeriodChoice;
import com.tools20022.repository.choice.SearchCriteria1Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.msg.DueDate1;
import com.tools20022.repository.msg.LegalMandate1;
import com.tools20022.repository.msg.SupplementaryData1;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.*;

/**
 * This message is sent by the authorities (police, customs, tax authorities,
 * enforcement authorities) to a financial institution to request account and
 * other banking and financial information. Requested information can relate to
 * accounts, their signatories and beneficiaries and co-owners as well as
 * movements plus positions on these accounts.<br>
 * <br>
 * Requests are underpinned by specific legal texts.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.InformationRequestOpeningV01#mmInvestigationIdentification
 * InformationRequestOpeningV01.mmInvestigationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.InformationRequestOpeningV01#mmLegalMandateBasis
 * InformationRequestOpeningV01.mmLegalMandateBasis}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.InformationRequestOpeningV01#mmConfidentialityStatus
 * InformationRequestOpeningV01.mmConfidentialityStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.InformationRequestOpeningV01#mmDueDate
 * InformationRequestOpeningV01.mmDueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.InformationRequestOpeningV01#mmInvestigationPeriod
 * InformationRequestOpeningV01.mmInvestigationPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.InformationRequestOpeningV01#mmSearchCriteria
 * InformationRequestOpeningV01.mmSearchCriteria}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.InformationRequestOpeningV01#mmSupplementaryData
 * InformationRequestOpeningV01.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "InfReqOpng"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AuthoritiesLatestVersion
 * AuthoritiesLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code auth.001.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InformationRequestOpeningV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "This message is sent by the authorities (police, customs, tax authorities, enforcement authorities) to a financial institution to request account and other banking and financial information. Requested information can relate to accounts, their signatories and beneficiaries and co-owners as well as movements plus positions on these accounts.\r\n\r\nRequests are underpinned by specific legal texts. "
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "InformationRequestOpeningV01", propOrder = {"investigationIdentification", "legalMandateBasis", "confidentialityStatus", "dueDate", "investigationPeriod", "searchCriteria", "supplementaryData"})
public class InformationRequestOpeningV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected Max35Text investigationIdentification;
	/**
	 * Unique identification for the specific investigation as known by the
	 * requesting party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstgtnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestigationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification for the specific investigation as known by the requesting party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmInvestigationIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "InvstgtnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestigationIdentification";
			definition = "Unique identification for the specific investigation as known by the requesting party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InformationRequestOpeningV01.class.getMethod("getInvestigationIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected LegalMandate1 legalMandateBasis;
	/**
	 * Provides details on the legal basis of the request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.LegalMandate1
	 * LegalMandate1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LglMndtBsis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegalMandateBasis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details on the legal basis of the request."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmLegalMandateBasis = new MMMessageBuildingBlock() {
		{
			xmlTag = "LglMndtBsis";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegalMandateBasis";
			definition = "Provides details on the legal basis of the request.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> LegalMandate1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InformationRequestOpeningV01.class.getMethod("getLegalMandateBasis", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator confidentialityStatus;
	/**
	 * Specifies the confidentiality status of the investigation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CnfdtltySts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfidentialityStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the confidentiality status of the investigation."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmConfidentialityStatus = new MMMessageBuildingBlock() {
		{
			xmlTag = "CnfdtltySts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfidentialityStatus";
			definition = "Specifies the confidentiality status of the investigation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InformationRequestOpeningV01.class.getMethod("getConfidentialityStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DueDate1 dueDate;
	/**
	 * Specifies the date by when the financial institutiion needs to provide a
	 * response.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.DueDate1
	 * DueDate1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DueDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the date by when the financial institutiion needs to provide a response."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmDueDate = new MMMessageBuildingBlock() {
		{
			xmlTag = "DueDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DueDate";
			definition = "Specifies the date by when the financial institutiion needs to provide a response.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DueDate1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InformationRequestOpeningV01.class.getMethod("getDueDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DateOrDateTimePeriodChoice investigationPeriod;
	/**
	 * Specifies the dates between which period the authority requests that the
	 * financial institution provides a response to the information request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateOrDateTimePeriodChoice
	 * DateOrDateTimePeriodChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstgtnPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestigationPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the dates between which period the authority requests that the financial institution provides a response to the information request."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmInvestigationPeriod = new MMMessageBuildingBlock() {
		{
			xmlTag = "InvstgtnPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestigationPeriod";
			definition = "Specifies the dates between which period the authority requests that the financial institution provides a response to the information request.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateOrDateTimePeriodChoice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InformationRequestOpeningV01.class.getMethod("getInvestigationPeriod", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SearchCriteria1Choice searchCriteria;
	/**
	 * Specifies the the search criteria for the financial institution to
	 * perform the search on. The search criteria can be an account, a customer
	 * identification or a payment instrument type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SearchCriteria1Choice
	 * SearchCriteria1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SchCrit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SearchCriteria"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the the search criteria for the financial institution to perform the search on. The search criteria can be an account, a customer identification or a payment instrument type."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSearchCriteria = new MMMessageBuildingBlock() {
		{
			xmlTag = "SchCrit";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SearchCriteria";
			definition = "Specifies the the search criteria for the financial institution to perform the search on. The search criteria can be an account, a customer identification or a payment instrument type.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SearchCriteria1Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InformationRequestOpeningV01.class.getMethod("getSearchCriteria", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * Additional information that can not be captured in the structured fields
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
	 * "Additional information that can not be captured in the structured fields and/or any other specific block."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InformationRequestOpeningV01.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InformationRequestOpeningV01";
				definition = "This message is sent by the authorities (police, customs, tax authorities, enforcement authorities) to a financial institution to request account and other banking and financial information. Requested information can relate to accounts, their signatories and beneficiaries and co-owners as well as movements plus positions on these accounts.\r\n\r\nRequests are underpinned by specific legal texts. ";
				rootElement = "Document";
				xmlTag = "InfReqOpng";
				businessArea_lazy = () -> AuthoritiesLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.auth.InformationRequestOpeningV01.mmInvestigationIdentification,
						com.tools20022.repository.area.auth.InformationRequestOpeningV01.mmLegalMandateBasis, com.tools20022.repository.area.auth.InformationRequestOpeningV01.mmConfidentialityStatus,
						com.tools20022.repository.area.auth.InformationRequestOpeningV01.mmDueDate, com.tools20022.repository.area.auth.InformationRequestOpeningV01.mmInvestigationPeriod,
						com.tools20022.repository.area.auth.InformationRequestOpeningV01.mmSearchCriteria, com.tools20022.repository.area.auth.InformationRequestOpeningV01.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "auth";
						messageFunctionality = "001";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return InformationRequestOpeningV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "InvstgtnId", required = true)
	public Max35Text getInvestigationIdentification() {
		return investigationIdentification;
	}

	public void setInvestigationIdentification(Max35Text investigationIdentification) {
		this.investigationIdentification = investigationIdentification;
	}

	@XmlElement(name = "LglMndtBsis", required = true)
	public LegalMandate1 getLegalMandateBasis() {
		return legalMandateBasis;
	}

	public void setLegalMandateBasis(LegalMandate1 legalMandateBasis) {
		this.legalMandateBasis = legalMandateBasis;
	}

	@XmlElement(name = "CnfdtltySts", required = true)
	public YesNoIndicator getConfidentialityStatus() {
		return confidentialityStatus;
	}

	public void setConfidentialityStatus(YesNoIndicator confidentialityStatus) {
		this.confidentialityStatus = confidentialityStatus;
	}

	@XmlElement(name = "DueDt")
	public DueDate1 getDueDate() {
		return dueDate;
	}

	public void setDueDate(DueDate1 dueDate) {
		this.dueDate = dueDate;
	}

	@XmlElement(name = "InvstgtnPrd", required = true)
	public DateOrDateTimePeriodChoice getInvestigationPeriod() {
		return investigationPeriod;
	}

	public void setInvestigationPeriod(DateOrDateTimePeriodChoice investigationPeriod) {
		this.investigationPeriod = investigationPeriod;
	}

	@XmlElement(name = "SchCrit", required = true)
	public SearchCriteria1Choice getSearchCriteria() {
		return searchCriteria;
	}

	public void setSearchCriteria(SearchCriteria1Choice searchCriteria) {
		this.searchCriteria = searchCriteria;
	}

	@XmlElement(name = "SplmtryData")
	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData;
	}

	public void setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = supplementaryData;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:auth.001.01.01")
	static public class Document {
		@XmlElement(name = "InfReqOpng", required = true)
		public InformationRequestOpeningV01 messageBody;
	}
}