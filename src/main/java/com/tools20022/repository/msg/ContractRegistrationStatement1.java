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
import com.tools20022.repository.area.auth.ContractRegistrationStatementV01;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Document;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.entity.RegisteredContract;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Statement of the journal entries for all activities related to the registered
 * currency control contract.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContractRegistrationStatement1#mmStatementIdentification
 * ContractRegistrationStatement1.mmStatementIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContractRegistrationStatement1#mmReportingParty
 * ContractRegistrationStatement1.mmReportingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContractRegistrationStatement1#mmRegistrationAgent
 * ContractRegistrationStatement1.mmRegistrationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContractRegistrationStatement1#mmReportingPeriod
 * ContractRegistrationStatement1.mmReportingPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContractRegistrationStatement1#mmRegisteredContract
 * ContractRegistrationStatement1.mmRegisteredContract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContractRegistrationStatement1#mmTransactionJournal
 * ContractRegistrationStatement1.mmTransactionJournal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContractRegistrationStatement1#mmSupportingDocumentJournal
 * ContractRegistrationStatement1.mmSupportingDocumentJournal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContractRegistrationStatement1#mmAdditionalSupportingDocumentJournal
 * ContractRegistrationStatement1.mmAdditionalSupportingDocumentJournal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContractRegistrationStatement1#mmRegulatoryRuleValidation
 * ContractRegistrationStatement1.mmRegulatoryRuleValidation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContractRegistrationStatement1#mmTotalContractTurnoverSum
 * ContractRegistrationStatement1.mmTotalContractTurnoverSum}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContractRegistrationStatement1#mmSupplementaryData
 * ContractRegistrationStatement1.mmSupplementaryData}</li>
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
 * {@linkplain com.tools20022.repository.area.auth.ContractRegistrationStatementV01#mmStatement
 * ContractRegistrationStatementV01.mmStatement}</li>
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
 * "ContractRegistrationStatement1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Statement of the journal entries for all activities related to the registered currency control contract."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ContractRegistrationStatement1", propOrder = {"statementIdentification", "reportingParty", "registrationAgent", "reportingPeriod", "registeredContract", "transactionJournal", "supportingDocumentJournal",
		"additionalSupportingDocumentJournal", "regulatoryRuleValidation", "totalContractTurnoverSum", "supplementaryData"})
public class ContractRegistrationStatement1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "StmtId")
	protected Max35Text statementIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.ContractRegistrationStatement1
	 * ContractRegistrationStatement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmtId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification, as assigned by the account servicer, to unambiguously identify the contract registration statement."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ContractRegistrationStatement1, Optional<Max35Text>> mmStatementIdentification = new MMMessageAttribute<ContractRegistrationStatement1, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ContractRegistrationStatement1.mmObject();
			isDerived = false;
			xmlTag = "StmtId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementIdentification";
			definition = "Unique identification, as assigned by the account servicer, to unambiguously identify the contract registration statement.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(ContractRegistrationStatement1 obj) {
			return obj.getStatementIdentification();
		}

		@Override
		public void setValue(ContractRegistrationStatement1 obj, Optional<Max35Text> value) {
			obj.setStatementIdentification(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.ContractRegistrationStatement1
	 * ContractRegistrationStatement1}</li>
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
	public static final MMMessageAssociationEnd<ContractRegistrationStatement1, TradeParty2> mmReportingParty = new MMMessageAssociationEnd<ContractRegistrationStatement1, TradeParty2>() {
		{
			businessElementTrace_lazy = () -> RegisteredContract.mmReportingParty;
			componentContext_lazy = () -> com.tools20022.repository.msg.ContractRegistrationStatement1.mmObject();
			isDerived = false;
			xmlTag = "RptgPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportingParty";
			definition = "Party registering the currency control contract.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TradeParty2.mmObject();
		}

		@Override
		public TradeParty2 getValue(ContractRegistrationStatement1 obj) {
			return obj.getReportingParty();
		}

		@Override
		public void setValue(ContractRegistrationStatement1 obj, TradeParty2 value) {
			obj.setReportingParty(value);
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
	 * {@linkplain com.tools20022.repository.msg.ContractRegistrationStatement1
	 * ContractRegistrationStatement1}</li>
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
	public static final MMMessageAssociationEnd<ContractRegistrationStatement1, BranchAndFinancialInstitutionIdentification5> mmRegistrationAgent = new MMMessageAssociationEnd<ContractRegistrationStatement1, BranchAndFinancialInstitutionIdentification5>() {
		{
			businessElementTrace_lazy = () -> RegisteredContract.mmRegistrationAgent;
			componentContext_lazy = () -> com.tools20022.repository.msg.ContractRegistrationStatement1.mmObject();
			isDerived = false;
			xmlTag = "RegnAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationAgent";
			definition = "Agent which registers the currency control contract.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification5.mmObject();
		}

		@Override
		public BranchAndFinancialInstitutionIdentification5 getValue(ContractRegistrationStatement1 obj) {
			return obj.getRegistrationAgent();
		}

		@Override
		public void setValue(ContractRegistrationStatement1 obj, BranchAndFinancialInstitutionIdentification5 value) {
			obj.setRegistrationAgent(value);
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
	 * {@linkplain com.tools20022.repository.msg.ContractRegistrationStatement1
	 * ContractRegistrationStatement1}</li>
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
	 * definition} = "Specifies the period for which the statement is provided."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ContractRegistrationStatement1, ReportingPeriod1> mmReportingPeriod = new MMMessageAssociationEnd<ContractRegistrationStatement1, ReportingPeriod1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ContractRegistrationStatement1.mmObject();
			isDerived = false;
			xmlTag = "RptgPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportingPeriod";
			definition = "Specifies the period for which the statement is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ReportingPeriod1.mmObject();
		}

		@Override
		public ReportingPeriod1 getValue(ContractRegistrationStatement1 obj) {
			return obj.getReportingPeriod();
		}

		@Override
		public void setValue(ContractRegistrationStatement1 obj, ReportingPeriod1 value) {
			obj.setReportingPeriod(value);
		}
	};
	@XmlElement(name = "RegdCtrct", required = true)
	protected RegisteredContract5 registeredContract;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RegisteredContract5
	 * RegisteredContract5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract
	 * RegisteredContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContractRegistrationStatement1
	 * ContractRegistrationStatement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RegdCtrct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegisteredContract"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Registered currency control contract."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ContractRegistrationStatement1, RegisteredContract5> mmRegisteredContract = new MMMessageAssociationEnd<ContractRegistrationStatement1, RegisteredContract5>() {
		{
			businessComponentTrace_lazy = () -> RegisteredContract.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ContractRegistrationStatement1.mmObject();
			isDerived = false;
			xmlTag = "RegdCtrct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegisteredContract";
			definition = "Registered currency control contract.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> RegisteredContract5.mmObject();
		}

		@Override
		public RegisteredContract5 getValue(ContractRegistrationStatement1 obj) {
			return obj.getRegisteredContract();
		}

		@Override
		public void setValue(ContractRegistrationStatement1 obj, RegisteredContract5 value) {
			obj.setRegisteredContract(value);
		}
	};
	@XmlElement(name = "TxJrnl")
	protected List<TransactionCertificate1> transactionJournal;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TransactionCertificate1
	 * TransactionCertificate1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContractRegistrationStatement1
	 * ContractRegistrationStatement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxJrnl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionJournal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Journal of the transactions recorded under the registered currency control contract."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ContractRegistrationStatement1, List<TransactionCertificate1>> mmTransactionJournal = new MMMessageAssociationEnd<ContractRegistrationStatement1, List<TransactionCertificate1>>() {
		{
			businessComponentTrace_lazy = () -> Payment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ContractRegistrationStatement1.mmObject();
			isDerived = false;
			xmlTag = "TxJrnl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionJournal";
			definition = "Journal of the transactions recorded under the registered currency control contract.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TransactionCertificate1.mmObject();
		}

		@Override
		public List<TransactionCertificate1> getValue(ContractRegistrationStatement1 obj) {
			return obj.getTransactionJournal();
		}

		@Override
		public void setValue(ContractRegistrationStatement1 obj, List<TransactionCertificate1> value) {
			obj.setTransactionJournal(value);
		}
	};
	@XmlElement(name = "SpprtgDocJrnl")
	protected List<SupportingDocument1> supportingDocumentJournal;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SupportingDocument1
	 * SupportingDocument1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract
	 * RegisteredContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContractRegistrationStatement1
	 * ContractRegistrationStatement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SpprtgDocJrnl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupportingDocumentJournal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Journal of the supporting documents recorded under the registered currency control contract."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ContractRegistrationStatement1, List<SupportingDocument1>> mmSupportingDocumentJournal = new MMMessageAssociationEnd<ContractRegistrationStatement1, List<SupportingDocument1>>() {
		{
			businessComponentTrace_lazy = () -> RegisteredContract.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ContractRegistrationStatement1.mmObject();
			isDerived = false;
			xmlTag = "SpprtgDocJrnl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupportingDocumentJournal";
			definition = "Journal of the supporting documents recorded under the registered currency control contract.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SupportingDocument1.mmObject();
		}

		@Override
		public List<SupportingDocument1> getValue(ContractRegistrationStatement1 obj) {
			return obj.getSupportingDocumentJournal();
		}

		@Override
		public void setValue(ContractRegistrationStatement1 obj, List<SupportingDocument1> value) {
			obj.setSupportingDocumentJournal(value);
		}
	};
	@XmlElement(name = "AddtlSpprtgDocJrnl")
	protected List<SupportingDocument1> additionalSupportingDocumentJournal;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SupportingDocument1
	 * SupportingDocument1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract
	 * RegisteredContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContractRegistrationStatement1
	 * ContractRegistrationStatement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlSpprtgDocJrnl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalSupportingDocumentJournal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Journal of additional supporting documents recorded under the registered currency control contract."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ContractRegistrationStatement1, List<SupportingDocument1>> mmAdditionalSupportingDocumentJournal = new MMMessageAssociationEnd<ContractRegistrationStatement1, List<SupportingDocument1>>() {
		{
			businessComponentTrace_lazy = () -> RegisteredContract.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ContractRegistrationStatement1.mmObject();
			isDerived = false;
			xmlTag = "AddtlSpprtgDocJrnl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalSupportingDocumentJournal";
			definition = "Journal of additional supporting documents recorded under the registered currency control contract.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SupportingDocument1.mmObject();
		}

		@Override
		public List<SupportingDocument1> getValue(ContractRegistrationStatement1 obj) {
			return obj.getAdditionalSupportingDocumentJournal();
		}

		@Override
		public void setValue(ContractRegistrationStatement1 obj, List<SupportingDocument1> value) {
			obj.setAdditionalSupportingDocumentJournal(value);
		}
	};
	@XmlElement(name = "RgltryRuleVldtn")
	protected List<GenericValidationRuleIdentification1> regulatoryRuleValidation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericValidationRuleIdentification1
	 * GenericValidationRuleIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmStatus
	 * Document.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContractRegistrationStatement1
	 * ContractRegistrationStatement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RgltryRuleVldtn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegulatoryRuleValidation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details on the currency control rule against which has been violated."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ContractRegistrationStatement1, List<GenericValidationRuleIdentification1>> mmRegulatoryRuleValidation = new MMMessageAssociationEnd<ContractRegistrationStatement1, List<GenericValidationRuleIdentification1>>() {
		{
			businessElementTrace_lazy = () -> Document.mmStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.ContractRegistrationStatement1.mmObject();
			isDerived = false;
			xmlTag = "RgltryRuleVldtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegulatoryRuleValidation";
			definition = "Details on the currency control rule against which has been violated.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> GenericValidationRuleIdentification1.mmObject();
		}

		@Override
		public List<GenericValidationRuleIdentification1> getValue(ContractRegistrationStatement1 obj) {
			return obj.getRegulatoryRuleValidation();
		}

		@Override
		public void setValue(ContractRegistrationStatement1 obj, List<GenericValidationRuleIdentification1> value) {
			obj.setRegulatoryRuleValidation(value);
		}
	};
	@XmlElement(name = "TtlCtrctTrnvrSum", required = true)
	protected ActiveCurrencyAndAmount totalContractTurnoverSum;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContractRegistrationStatement1
	 * ContractRegistrationStatement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlCtrctTrnvrSum"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalContractTurnoverSum"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total turn over amount recorded under the currency control contract for the amount of all."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ContractRegistrationStatement1, ActiveCurrencyAndAmount> mmTotalContractTurnoverSum = new MMMessageAttribute<ContractRegistrationStatement1, ActiveCurrencyAndAmount>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ContractRegistrationStatement1.mmObject();
			isDerived = false;
			xmlTag = "TtlCtrctTrnvrSum";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalContractTurnoverSum";
			definition = "Total turn over amount recorded under the currency control contract for the amount of all.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(ContractRegistrationStatement1 obj) {
			return obj.getTotalContractTurnoverSum();
		}

		@Override
		public void setValue(ContractRegistrationStatement1 obj, ActiveCurrencyAndAmount value) {
			obj.setTotalContractTurnoverSum(value);
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<SupplementaryData1> supplementaryData;
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
	 * {@linkplain com.tools20022.repository.msg.ContractRegistrationStatement1
	 * ContractRegistrationStatement1}</li>
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
	public static final MMMessageAssociationEnd<ContractRegistrationStatement1, List<SupplementaryData1>> mmSupplementaryData = new MMMessageAssociationEnd<ContractRegistrationStatement1, List<SupplementaryData1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ContractRegistrationStatement1.mmObject();
			isDerived = false;
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(ContractRegistrationStatement1 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(ContractRegistrationStatement1 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ContractRegistrationStatement1.mmStatementIdentification, com.tools20022.repository.msg.ContractRegistrationStatement1.mmReportingParty,
						com.tools20022.repository.msg.ContractRegistrationStatement1.mmRegistrationAgent, com.tools20022.repository.msg.ContractRegistrationStatement1.mmReportingPeriod,
						com.tools20022.repository.msg.ContractRegistrationStatement1.mmRegisteredContract, com.tools20022.repository.msg.ContractRegistrationStatement1.mmTransactionJournal,
						com.tools20022.repository.msg.ContractRegistrationStatement1.mmSupportingDocumentJournal, com.tools20022.repository.msg.ContractRegistrationStatement1.mmAdditionalSupportingDocumentJournal,
						com.tools20022.repository.msg.ContractRegistrationStatement1.mmRegulatoryRuleValidation, com.tools20022.repository.msg.ContractRegistrationStatement1.mmTotalContractTurnoverSum,
						com.tools20022.repository.msg.ContractRegistrationStatement1.mmSupplementaryData);
				messageBuildingBlock_lazy = () -> Arrays.asList(ContractRegistrationStatementV01.mmStatement);
				trace_lazy = () -> RegisteredContract.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ContractRegistrationStatement1";
				definition = "Statement of the journal entries for all activities related to the registered currency control contract.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getStatementIdentification() {
		return statementIdentification == null ? Optional.empty() : Optional.of(statementIdentification);
	}

	public ContractRegistrationStatement1 setStatementIdentification(Max35Text statementIdentification) {
		this.statementIdentification = statementIdentification;
		return this;
	}

	public TradeParty2 getReportingParty() {
		return reportingParty;
	}

	public ContractRegistrationStatement1 setReportingParty(TradeParty2 reportingParty) {
		this.reportingParty = Objects.requireNonNull(reportingParty);
		return this;
	}

	public BranchAndFinancialInstitutionIdentification5 getRegistrationAgent() {
		return registrationAgent;
	}

	public ContractRegistrationStatement1 setRegistrationAgent(BranchAndFinancialInstitutionIdentification5 registrationAgent) {
		this.registrationAgent = Objects.requireNonNull(registrationAgent);
		return this;
	}

	public ReportingPeriod1 getReportingPeriod() {
		return reportingPeriod;
	}

	public ContractRegistrationStatement1 setReportingPeriod(ReportingPeriod1 reportingPeriod) {
		this.reportingPeriod = Objects.requireNonNull(reportingPeriod);
		return this;
	}

	public RegisteredContract5 getRegisteredContract() {
		return registeredContract;
	}

	public ContractRegistrationStatement1 setRegisteredContract(RegisteredContract5 registeredContract) {
		this.registeredContract = Objects.requireNonNull(registeredContract);
		return this;
	}

	public List<TransactionCertificate1> getTransactionJournal() {
		return transactionJournal == null ? transactionJournal = new ArrayList<>() : transactionJournal;
	}

	public ContractRegistrationStatement1 setTransactionJournal(List<TransactionCertificate1> transactionJournal) {
		this.transactionJournal = Objects.requireNonNull(transactionJournal);
		return this;
	}

	public List<SupportingDocument1> getSupportingDocumentJournal() {
		return supportingDocumentJournal == null ? supportingDocumentJournal = new ArrayList<>() : supportingDocumentJournal;
	}

	public ContractRegistrationStatement1 setSupportingDocumentJournal(List<SupportingDocument1> supportingDocumentJournal) {
		this.supportingDocumentJournal = Objects.requireNonNull(supportingDocumentJournal);
		return this;
	}

	public List<SupportingDocument1> getAdditionalSupportingDocumentJournal() {
		return additionalSupportingDocumentJournal == null ? additionalSupportingDocumentJournal = new ArrayList<>() : additionalSupportingDocumentJournal;
	}

	public ContractRegistrationStatement1 setAdditionalSupportingDocumentJournal(List<SupportingDocument1> additionalSupportingDocumentJournal) {
		this.additionalSupportingDocumentJournal = Objects.requireNonNull(additionalSupportingDocumentJournal);
		return this;
	}

	public List<GenericValidationRuleIdentification1> getRegulatoryRuleValidation() {
		return regulatoryRuleValidation == null ? regulatoryRuleValidation = new ArrayList<>() : regulatoryRuleValidation;
	}

	public ContractRegistrationStatement1 setRegulatoryRuleValidation(List<GenericValidationRuleIdentification1> regulatoryRuleValidation) {
		this.regulatoryRuleValidation = Objects.requireNonNull(regulatoryRuleValidation);
		return this;
	}

	public ActiveCurrencyAndAmount getTotalContractTurnoverSum() {
		return totalContractTurnoverSum;
	}

	public ContractRegistrationStatement1 setTotalContractTurnoverSum(ActiveCurrencyAndAmount totalContractTurnoverSum) {
		this.totalContractTurnoverSum = Objects.requireNonNull(totalContractTurnoverSum);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public ContractRegistrationStatement1 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}
}