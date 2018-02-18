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

import com.tools20022.metamodel.ext.OtherSemanticMarkup;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.auth.ContractRegistrationStatementRequestV01;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.RegisteredContract;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details on the statement requested elements.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContractRegistrationStatementRequest1#mmStatementRequestIdentification
 * ContractRegistrationStatementRequest1.mmStatementRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContractRegistrationStatementRequest1#mmReportingPeriod
 * ContractRegistrationStatementRequest1.mmReportingPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContractRegistrationStatementRequest1#mmReportingParty
 * ContractRegistrationStatementRequest1.mmReportingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContractRegistrationStatementRequest1#mmRegistrationAgent
 * ContractRegistrationStatementRequest1.mmRegistrationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContractRegistrationStatementRequest1#mmRegisteredContractIdentification
 * ContractRegistrationStatementRequest1.mmRegisteredContractIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContractRegistrationStatementRequest1#mmReturnCriteria
 * ContractRegistrationStatementRequest1.mmReturnCriteria}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContractRegistrationStatementRequest1#mmSupplementaryData
 * ContractRegistrationStatementRequest1.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.RegisteredContract
 * RegisteredContract}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.ContractRegistrationStatementRequestV01#mmStatementRequest
 * ContractRegistrationStatementRequestV01.mmStatementRequest}</li>
 * </ul>
 * </li>
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
 * "ContractRegistrationStatementRequest1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details on the statement requested elements."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ContractRegistrationStatementRequest1", propOrder = {"statementRequestIdentification", "reportingPeriod", "reportingParty", "registrationAgent", "registeredContractIdentification", "returnCriteria", "supplementaryData"})
public class ContractRegistrationStatementRequest1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "StmtReqId", required = true)
	protected Max35Text statementRequestIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContractRegistrationStatementRequest1
	 * ContractRegistrationStatementRequest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmtReqId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementRequestIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification of the contract registration statement request."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatementRequestIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ContractRegistrationStatementRequest1.mmObject();
			isDerived = false;
			xmlTag = "StmtReqId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementRequestIdentification";
			definition = "Unique and unambiguous identification of the contract registration statement request.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "RptgPrd", required = true)
	protected ReportingPeriod1 reportingPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ReportingPeriod1
	 * ReportingPeriod1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContractRegistrationStatementRequest1
	 * ContractRegistrationStatementRequest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptgPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportingPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the period for which the statement is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReportingPeriod = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ContractRegistrationStatementRequest1.mmObject();
			isDerived = false;
			xmlTag = "RptgPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportingPeriod";
			definition = "Specifies the period for which the statement is requested.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ReportingPeriod1.mmObject();
		}
	};
	@XmlElement(name = "RptgPty", required = true)
	protected TradeParty2 reportingParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TradeParty2
	 * TradeParty2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmReportingParty
	 * RegisteredContract.mmReportingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContractRegistrationStatementRequest1
	 * ContractRegistrationStatementRequest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptgPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party registering the currency control contract."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReportingParty = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> RegisteredContract.mmReportingParty;
			componentContext_lazy = () -> com.tools20022.repository.msg.ContractRegistrationStatementRequest1.mmObject();
			isDerived = false;
			xmlTag = "RptgPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportingParty";
			definition = "Party registering the currency control contract.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TradeParty2.mmObject();
		}
	};
	@XmlElement(name = "RegnAgt", required = true)
	protected BranchAndFinancialInstitutionIdentification5 registrationAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5
	 * BranchAndFinancialInstitutionIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmRegistrationAgent
	 * RegisteredContract.mmRegistrationAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContractRegistrationStatementRequest1
	 * ContractRegistrationStatementRequest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RegnAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Agent which registers the currency control contract."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRegistrationAgent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> RegisteredContract.mmRegistrationAgent;
			componentContext_lazy = () -> com.tools20022.repository.msg.ContractRegistrationStatementRequest1.mmObject();
			isDerived = false;
			xmlTag = "RegnAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationAgent";
			definition = "Agent which registers the currency control contract.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5.mmObject();
		}
	};
	@XmlElement(name = "RegdCtrctId", required = true)
	protected Max35Text registeredContractIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmIdentification
	 * RegisteredContract.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContractRegistrationStatementRequest1
	 * ContractRegistrationStatementRequest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RegdCtrctId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = type=Synonym, context=RU-CMPG, value=Deal Passport
	 * Identification</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegisteredContractIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the requested registered contract."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRegisteredContractIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> RegisteredContract.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.ContractRegistrationStatementRequest1.mmObject();
			isDerived = false;
			xmlTag = "RegdCtrctId";
			semanticMarkup_lazy = () -> Arrays.asList(new OtherSemanticMarkup(this, "Synonym", new String[]{"context", "RU-CMPG"}, new String[]{"value", "Deal Passport Identification"}));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegisteredContractIdentification";
			definition = "Identifies the requested registered contract.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "RtrCrit")
	protected ContractRegistrationStatementCriteria1 returnCriteria;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ContractRegistrationStatementCriteria1
	 * ContractRegistrationStatementCriteria1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContractRegistrationStatementRequest1
	 * ContractRegistrationStatementRequest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RtrCrit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnCriteria"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the criteria to be returned in the statement in response to the request."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReturnCriteria = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ContractRegistrationStatementRequest1.mmObject();
			isDerived = false;
			xmlTag = "RtrCrit";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnCriteria";
			definition = "Defines the criteria to be returned in the statement in response to the request.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ContractRegistrationStatementCriteria1.mmObject();
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<com.tools20022.repository.msg.SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContractRegistrationStatementRequest1
	 * ContractRegistrationStatementRequest1}</li>
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
	public static final MMMessageAssociationEnd mmSupplementaryData = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ContractRegistrationStatementRequest1.mmObject();
			isDerived = false;
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SupplementaryData1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ContractRegistrationStatementRequest1.mmStatementRequestIdentification,
						com.tools20022.repository.msg.ContractRegistrationStatementRequest1.mmReportingPeriod, com.tools20022.repository.msg.ContractRegistrationStatementRequest1.mmReportingParty,
						com.tools20022.repository.msg.ContractRegistrationStatementRequest1.mmRegistrationAgent, com.tools20022.repository.msg.ContractRegistrationStatementRequest1.mmRegisteredContractIdentification,
						com.tools20022.repository.msg.ContractRegistrationStatementRequest1.mmReturnCriteria, com.tools20022.repository.msg.ContractRegistrationStatementRequest1.mmSupplementaryData);
				messageBuildingBlock_lazy = () -> Arrays.asList(ContractRegistrationStatementRequestV01.mmStatementRequest);
				trace_lazy = () -> RegisteredContract.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ContractRegistrationStatementRequest1";
				definition = "Details on the statement requested elements.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getStatementRequestIdentification() {
		return statementRequestIdentification;
	}

	public ContractRegistrationStatementRequest1 setStatementRequestIdentification(Max35Text statementRequestIdentification) {
		this.statementRequestIdentification = Objects.requireNonNull(statementRequestIdentification);
		return this;
	}

	public ReportingPeriod1 getReportingPeriod() {
		return reportingPeriod;
	}

	public ContractRegistrationStatementRequest1 setReportingPeriod(com.tools20022.repository.msg.ReportingPeriod1 reportingPeriod) {
		this.reportingPeriod = Objects.requireNonNull(reportingPeriod);
		return this;
	}

	public TradeParty2 getReportingParty() {
		return reportingParty;
	}

	public ContractRegistrationStatementRequest1 setReportingParty(com.tools20022.repository.msg.TradeParty2 reportingParty) {
		this.reportingParty = Objects.requireNonNull(reportingParty);
		return this;
	}

	public BranchAndFinancialInstitutionIdentification5 getRegistrationAgent() {
		return registrationAgent;
	}

	public ContractRegistrationStatementRequest1 setRegistrationAgent(com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5 registrationAgent) {
		this.registrationAgent = Objects.requireNonNull(registrationAgent);
		return this;
	}

	public Max35Text getRegisteredContractIdentification() {
		return registeredContractIdentification;
	}

	public ContractRegistrationStatementRequest1 setRegisteredContractIdentification(Max35Text registeredContractIdentification) {
		this.registeredContractIdentification = Objects.requireNonNull(registeredContractIdentification);
		return this;
	}

	public Optional<ContractRegistrationStatementCriteria1> getReturnCriteria() {
		return returnCriteria == null ? Optional.empty() : Optional.of(returnCriteria);
	}

	public ContractRegistrationStatementRequest1 setReturnCriteria(com.tools20022.repository.msg.ContractRegistrationStatementCriteria1 returnCriteria) {
		this.returnCriteria = returnCriteria;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public ContractRegistrationStatementRequest1 setSupplementaryData(List<com.tools20022.repository.msg.SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}
}