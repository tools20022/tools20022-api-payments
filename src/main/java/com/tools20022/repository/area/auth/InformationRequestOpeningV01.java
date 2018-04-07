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
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
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
 * "This message is sent by the authorities (police, customs, tax authorities, enforcement authorities) to a financial institution to request account and other banking and financial information. Requested information can relate to accounts, their signatories and beneficiaries and co-owners as well as movements plus positions on these accounts.\r\n\r\nRequests are underpinned by specific legal texts."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InformationRequestOpeningV01", propOrder = {"investigationIdentification", "legalMandateBasis", "confidentialityStatus", "dueDate", "investigationPeriod", "searchCriteria", "supplementaryData"})
public class InformationRequestOpeningV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "InvstgtnId", required = true)
	protected Max35Text investigationIdentification;
	/**
	 * 
	 <p>
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
	public static final MMMessageBuildingBlock<InformationRequestOpeningV01, Max35Text> mmInvestigationIdentification = new MMMessageBuildingBlock<InformationRequestOpeningV01, Max35Text>() {
		{
			xmlTag = "InvstgtnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestigationIdentification";
			definition = "Unique identification for the specific investigation as known by the requesting party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(InformationRequestOpeningV01 obj) {
			return obj.getInvestigationIdentification();
		}

		@Override
		public void setValue(InformationRequestOpeningV01 obj, Max35Text value) {
			obj.setInvestigationIdentification(value);
		}
	};
	@XmlElement(name = "LglMndtBsis", required = true)
	protected LegalMandate1 legalMandateBasis;
	/**
	 * 
	 <p>
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
	public static final MMMessageBuildingBlock<InformationRequestOpeningV01, LegalMandate1> mmLegalMandateBasis = new MMMessageBuildingBlock<InformationRequestOpeningV01, LegalMandate1>() {
		{
			xmlTag = "LglMndtBsis";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegalMandateBasis";
			definition = "Provides details on the legal basis of the request.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> LegalMandate1.mmObject();
		}

		@Override
		public LegalMandate1 getValue(InformationRequestOpeningV01 obj) {
			return obj.getLegalMandateBasis();
		}

		@Override
		public void setValue(InformationRequestOpeningV01 obj, LegalMandate1 value) {
			obj.setLegalMandateBasis(value);
		}
	};
	@XmlElement(name = "CnfdtltySts", required = true)
	protected YesNoIndicator confidentialityStatus;
	/**
	 * 
	 <p>
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
	public static final MMMessageBuildingBlock<InformationRequestOpeningV01, YesNoIndicator> mmConfidentialityStatus = new MMMessageBuildingBlock<InformationRequestOpeningV01, YesNoIndicator>() {
		{
			xmlTag = "CnfdtltySts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfidentialityStatus";
			definition = "Specifies the confidentiality status of the investigation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(InformationRequestOpeningV01 obj) {
			return obj.getConfidentialityStatus();
		}

		@Override
		public void setValue(InformationRequestOpeningV01 obj, YesNoIndicator value) {
			obj.setConfidentialityStatus(value);
		}
	};
	@XmlElement(name = "DueDt")
	protected DueDate1 dueDate;
	/**
	 * 
	 <p>
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
	public static final MMMessageBuildingBlock<InformationRequestOpeningV01, Optional<DueDate1>> mmDueDate = new MMMessageBuildingBlock<InformationRequestOpeningV01, Optional<DueDate1>>() {
		{
			xmlTag = "DueDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DueDate";
			definition = "Specifies the date by when the financial institutiion needs to provide a response.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DueDate1.mmObject();
		}

		@Override
		public Optional<DueDate1> getValue(InformationRequestOpeningV01 obj) {
			return obj.getDueDate();
		}

		@Override
		public void setValue(InformationRequestOpeningV01 obj, Optional<DueDate1> value) {
			obj.setDueDate(value.orElse(null));
		}
	};
	@XmlElement(name = "InvstgtnPrd", required = true)
	protected DateOrDateTimePeriodChoice investigationPeriod;
	/**
	 * 
	 <p>
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
	public static final MMMessageBuildingBlock<InformationRequestOpeningV01, DateOrDateTimePeriodChoice> mmInvestigationPeriod = new MMMessageBuildingBlock<InformationRequestOpeningV01, DateOrDateTimePeriodChoice>() {
		{
			xmlTag = "InvstgtnPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestigationPeriod";
			definition = "Specifies the dates between which period the authority requests that the financial institution provides a response to the information request.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateOrDateTimePeriodChoice.mmObject();
		}

		@Override
		public DateOrDateTimePeriodChoice getValue(InformationRequestOpeningV01 obj) {
			return obj.getInvestigationPeriod();
		}

		@Override
		public void setValue(InformationRequestOpeningV01 obj, DateOrDateTimePeriodChoice value) {
			obj.setInvestigationPeriod(value);
		}
	};
	@XmlElement(name = "SchCrit", required = true)
	protected SearchCriteria1Choice searchCriteria;
	/**
	 * 
	 <p>
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
	public static final MMMessageBuildingBlock<InformationRequestOpeningV01, SearchCriteria1Choice> mmSearchCriteria = new MMMessageBuildingBlock<InformationRequestOpeningV01, SearchCriteria1Choice>() {
		{
			xmlTag = "SchCrit";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SearchCriteria";
			definition = "Specifies the the search criteria for the financial institution to perform the search on. The search criteria can be an account, a customer identification or a payment instrument type.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SearchCriteria1Choice.mmObject();
		}

		@Override
		public SearchCriteria1Choice getValue(InformationRequestOpeningV01 obj) {
			return obj.getSearchCriteria();
		}

		@Override
		public void setValue(InformationRequestOpeningV01 obj, SearchCriteria1Choice value) {
			obj.setSearchCriteria(value);
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
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
	public static final MMMessageBuildingBlock<InformationRequestOpeningV01, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<InformationRequestOpeningV01, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(InformationRequestOpeningV01 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(InformationRequestOpeningV01 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InformationRequestOpeningV01";
				definition = "This message is sent by the authorities (police, customs, tax authorities, enforcement authorities) to a financial institution to request account and other banking and financial information. Requested information can relate to accounts, their signatories and beneficiaries and co-owners as well as movements plus positions on these accounts.\r\n\r\nRequests are underpinned by specific legal texts.";
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

	public Max35Text getInvestigationIdentification() {
		return investigationIdentification;
	}

	public InformationRequestOpeningV01 setInvestigationIdentification(Max35Text investigationIdentification) {
		this.investigationIdentification = Objects.requireNonNull(investigationIdentification);
		return this;
	}

	public LegalMandate1 getLegalMandateBasis() {
		return legalMandateBasis;
	}

	public InformationRequestOpeningV01 setLegalMandateBasis(LegalMandate1 legalMandateBasis) {
		this.legalMandateBasis = Objects.requireNonNull(legalMandateBasis);
		return this;
	}

	public YesNoIndicator getConfidentialityStatus() {
		return confidentialityStatus;
	}

	public InformationRequestOpeningV01 setConfidentialityStatus(YesNoIndicator confidentialityStatus) {
		this.confidentialityStatus = Objects.requireNonNull(confidentialityStatus);
		return this;
	}

	public Optional<DueDate1> getDueDate() {
		return dueDate == null ? Optional.empty() : Optional.of(dueDate);
	}

	public InformationRequestOpeningV01 setDueDate(DueDate1 dueDate) {
		this.dueDate = dueDate;
		return this;
	}

	public DateOrDateTimePeriodChoice getInvestigationPeriod() {
		return investigationPeriod;
	}

	public InformationRequestOpeningV01 setInvestigationPeriod(DateOrDateTimePeriodChoice investigationPeriod) {
		this.investigationPeriod = Objects.requireNonNull(investigationPeriod);
		return this;
	}

	public SearchCriteria1Choice getSearchCriteria() {
		return searchCriteria;
	}

	public InformationRequestOpeningV01 setSearchCriteria(SearchCriteria1Choice searchCriteria) {
		this.searchCriteria = Objects.requireNonNull(searchCriteria);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public InformationRequestOpeningV01 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.001.001.01")
	static public class Document {
		@XmlElement(name = "InfReqOpng", required = true)
		public InformationRequestOpeningV01 messageBody;
	}
}