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
import com.tools20022.repository.area.auth.ContractRegistrationConfirmationV01;
import com.tools20022.repository.choice.PaymentScheduleType1Choice;
import com.tools20022.repository.choice.UnderlyingContract1Choice;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.Max1025Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.Contract;
import com.tools20022.repository.entity.Loan;
import com.tools20022.repository.entity.RegisteredContract;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Document that a user must file with an authorized servicer for each contract
 * that involves foreign currency transactions with non residents.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegisteredContract4#mmOriginalContractRegistrationRequest
 * RegisteredContract4.mmOriginalContractRegistrationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegisteredContract4#mmReportingParty
 * RegisteredContract4.mmReportingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegisteredContract4#mmRegistrationAgent
 * RegisteredContract4.mmRegistrationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegisteredContract4#mmIssuerFinancialInstitution
 * RegisteredContract4.mmIssuerFinancialInstitution}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RegisteredContract4#mmContract
 * RegisteredContract4.mmContract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegisteredContract4#mmContractBalance
 * RegisteredContract4.mmContractBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegisteredContract4#mmPaymentScheduleType
 * RegisteredContract4.mmPaymentScheduleType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegisteredContract4#mmRegisteredContractIdentification
 * RegisteredContract4.mmRegisteredContractIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegisteredContract4#mmPreviousRegisteredContractIdentification
 * RegisteredContract4.mmPreviousRegisteredContractIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegisteredContract4#mmRegisteredContractJournal
 * RegisteredContract4.mmRegisteredContractJournal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegisteredContract4#mmAmendment
 * RegisteredContract4.mmAmendment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegisteredContract4#mmSubmission
 * RegisteredContract4.mmSubmission}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RegisteredContract4#mmDelivery
 * RegisteredContract4.mmDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegisteredContract4#mmLoanPrincipalAmount
 * RegisteredContract4.mmLoanPrincipalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegisteredContract4#mmEstimatedDateIndicator
 * RegisteredContract4.mmEstimatedDateIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegisteredContract4#mmInterCompanyLoan
 * RegisteredContract4.mmInterCompanyLoan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegisteredContract4#mmAdditionalInformation
 * RegisteredContract4.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegisteredContract4#mmSupplementaryData
 * RegisteredContract4.mmSupplementaryData}</li>
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
 * {@linkplain com.tools20022.repository.area.auth.ContractRegistrationConfirmationV01#mmRegisteredContract
 * ContractRegistrationConfirmationV01.mmRegisteredContract}</li>
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
 * "RegisteredContract4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Document that a user must file with an authorized servicer for each contract that involves foreign currency transactions with non residents."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.RegisteredContract5
 * RegisteredContract5}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "RegisteredContract4", propOrder = {"originalContractRegistrationRequest", "reportingParty", "registrationAgent", "issuerFinancialInstitution", "contract", "contractBalance", "paymentScheduleType",
		"registeredContractIdentification", "previousRegisteredContractIdentification", "registeredContractJournal", "amendment", "submission", "delivery", "loanPrincipalAmount", "estimatedDateIndicator", "interCompanyLoan",
		"additionalInformation", "supplementaryData"})
public class RegisteredContract4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "OrgnlCtrctRegnReq")
	protected Max35Text originalContractRegistrationRequest;
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
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract4
	 * RegisteredContract4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlCtrctRegnReq"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalContractRegistrationRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification of the contract registration creation, amendment or closure request."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract5#mmOriginalContractRegistrationRequest
	 * RegisteredContract5.mmOriginalContractRegistrationRequest}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalContractRegistrationRequest = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RegisteredContract4.mmObject();
			isDerived = false;
			xmlTag = "OrgnlCtrctRegnReq";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalContractRegistrationRequest";
			definition = "Unique identification of the contract registration creation, amendment or closure request.";
			nextVersions_lazy = () -> Arrays.asList(RegisteredContract5.mmOriginalContractRegistrationRequest);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract4
	 * RegisteredContract4}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.RegisteredContract4.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract4
	 * RegisteredContract4}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.RegisteredContract4.mmObject();
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
	@XmlElement(name = "IssrFI", required = true)
	protected BranchAndFinancialInstitutionIdentification5 issuerFinancialInstitution;
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
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract4
	 * RegisteredContract4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IssrFI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerFinancialInstitution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Financial institution of the issuer of the contract."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract5#mmIssuerFinancialInstitution
	 * RegisteredContract5.mmIssuerFinancialInstitution}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIssuerFinancialInstitution = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> RegisteredContract.mmRegistrationAgent;
			componentContext_lazy = () -> com.tools20022.repository.msg.RegisteredContract4.mmObject();
			isDerived = false;
			xmlTag = "IssrFI";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerFinancialInstitution";
			definition = "Financial institution of the issuer of the contract.";
			nextVersions_lazy = () -> Arrays.asList(RegisteredContract5.mmIssuerFinancialInstitution);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5.mmObject();
		}
	};
	@XmlElement(name = "Ctrct", required = true)
	protected UnderlyingContract1Choice contract;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.UnderlyingContract1Choice
	 * UnderlyingContract1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Contract Contract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract4
	 * RegisteredContract4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ctrct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Contract"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details of the contract being registered."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract5#mmContract
	 * RegisteredContract5.mmContract}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmContract = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Contract.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.RegisteredContract4.mmObject();
			isDerived = false;
			xmlTag = "Ctrct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Contract";
			definition = "Details of the contract being registered.";
			nextVersions_lazy = () -> Arrays.asList(RegisteredContract5.mmContract);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> UnderlyingContract1Choice.mmObject();
		}
	};
	@XmlElement(name = "CtrctBal")
	protected List<com.tools20022.repository.msg.ContractBalance1> contractBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ContractBalance1
	 * ContractBalance1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmContractBalance
	 * RegisteredContract.mmContractBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract4
	 * RegisteredContract4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrctBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContractBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Contract balance on date of contract registration."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract5#mmContractBalance
	 * RegisteredContract5.mmContractBalance}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmContractBalance = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> RegisteredContract.mmContractBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.RegisteredContract4.mmObject();
			isDerived = false;
			xmlTag = "CtrctBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContractBalance";
			definition = "Contract balance on date of contract registration.";
			nextVersions_lazy = () -> Arrays.asList(RegisteredContract5.mmContractBalance);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ContractBalance1.mmObject();
		}
	};
	@XmlElement(name = "PmtSchdlTp")
	protected PaymentScheduleType1Choice paymentScheduleType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PaymentScheduleType1Choice
	 * PaymentScheduleType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmPaymentScheduleType
	 * RegisteredContract.mmPaymentScheduleType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract4
	 * RegisteredContract4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtSchdlTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentScheduleType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of the payment schedule provided in the contract."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract5#mmPaymentScheduleType
	 * RegisteredContract5.mmPaymentScheduleType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPaymentScheduleType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> RegisteredContract.mmPaymentScheduleType;
			componentContext_lazy = () -> com.tools20022.repository.msg.RegisteredContract4.mmObject();
			isDerived = false;
			xmlTag = "PmtSchdlTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentScheduleType";
			definition = "Type of the payment schedule provided in the contract.";
			nextVersions_lazy = () -> Arrays.asList(RegisteredContract5.mmPaymentScheduleType);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentScheduleType1Choice.mmObject();
		}
	};
	@XmlElement(name = "RegdCtrctId", required = true)
	protected DocumentIdentification29 registeredContractIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification29
	 * DocumentIdentification29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmIdentification
	 * RegisteredContract.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract4
	 * RegisteredContract4}</li>
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
	 * definition} =
	 * "Unique and unambiguous identification of the registered contract as assigned by the registration agent."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract5#mmRegisteredContractIdentification
	 * RegisteredContract5.mmRegisteredContractIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRegisteredContractIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> RegisteredContract.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.RegisteredContract4.mmObject();
			isDerived = false;
			xmlTag = "RegdCtrctId";
			semanticMarkup_lazy = () -> Arrays.asList(new OtherSemanticMarkup(this, "Synonym", new String[]{"context", "RU-CMPG"}, new String[]{"value", "Deal Passport Identification"}));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegisteredContractIdentification";
			definition = "Unique and unambiguous identification of the registered contract as assigned by the registration agent.";
			nextVersions_lazy = () -> Arrays.asList(RegisteredContract5.mmRegisteredContractIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DocumentIdentification29.mmObject();
		}
	};
	@XmlElement(name = "PrvsRegdCtrctId")
	protected DocumentIdentification22 previousRegisteredContractIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmIdentification
	 * RegisteredContract.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract4
	 * RegisteredContract4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsRegdCtrctId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = type=Synonym, context=RU-CMPG, value=Previous Deal
	 * Passport Identification</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousRegisteredContractIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a previously defined registered contract linked to the same underlying contract.\r\n\r\nUsage:\r\nThis is the identification of a previous contract registration for the same underlying contract, which was closed. In most cases, this is used  when a reporting party moves from one registration agent to another."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract5#mmPreviousRegisteredContractIdentification
	 * RegisteredContract5.mmPreviousRegisteredContractIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPreviousRegisteredContractIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> RegisteredContract.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.RegisteredContract4.mmObject();
			isDerived = false;
			xmlTag = "PrvsRegdCtrctId";
			semanticMarkup_lazy = () -> Arrays.asList(new OtherSemanticMarkup(this, "Synonym", new String[]{"context", "RU-CMPG"}, new String[]{"value", "Previous Deal Passport Identification"}));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousRegisteredContractIdentification";
			definition = "Identification of a previously defined registered contract linked to the same underlying contract.\r\n\r\nUsage:\r\nThis is the identification of a previous contract registration for the same underlying contract, which was closed. In most cases, this is used  when a reporting party moves from one registration agent to another.";
			nextVersions_lazy = () -> Arrays.asList(RegisteredContract5.mmPreviousRegisteredContractIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DocumentIdentification22.mmObject();
		}
	};
	@XmlElement(name = "RegdCtrctJrnl")
	protected List<com.tools20022.repository.msg.RegisteredContractJournal1> registeredContractJournal;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.RegisteredContractJournal1
	 * RegisteredContractJournal1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract
	 * RegisteredContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract4
	 * RegisteredContract4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RegdCtrctJrnl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegisteredContractJournal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Journal of previously closed registered contracts for the same underlying contract, which were requested at the same registration agent."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract5#mmRegisteredContractJournal
	 * RegisteredContract5.mmRegisteredContractJournal}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRegisteredContractJournal = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> RegisteredContract.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.RegisteredContract4.mmObject();
			isDerived = false;
			xmlTag = "RegdCtrctJrnl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegisteredContractJournal";
			definition = "Journal of previously closed registered contracts for the same underlying contract, which were requested at the same registration agent.";
			nextVersions_lazy = () -> Arrays.asList(RegisteredContract5.mmRegisteredContractJournal);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.RegisteredContractJournal1.mmObject();
		}
	};
	@XmlElement(name = "Amdmnt")
	protected List<com.tools20022.repository.msg.RegisteredContractAmendment1> amendment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.RegisteredContractAmendment1
	 * RegisteredContractAmendment1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract
	 * RegisteredContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract4
	 * RegisteredContract4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Amdmnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amendment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details on amendments to the registered contract."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract5#mmAmendment
	 * RegisteredContract5.mmAmendment}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAmendment = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> RegisteredContract.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.RegisteredContract4.mmObject();
			isDerived = false;
			xmlTag = "Amdmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amendment";
			definition = "Details on amendments to the registered contract.";
			nextVersions_lazy = () -> Arrays.asList(RegisteredContract5.mmAmendment);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.RegisteredContractAmendment1.mmObject();
		}
	};
	@XmlElement(name = "Submissn", required = true)
	protected RegisteredContractCommunication1 submission;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.RegisteredContractCommunication1
	 * RegisteredContractCommunication1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmSubmissionMethod
	 * RegisteredContract.mmSubmissionMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract4
	 * RegisteredContract4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Submissn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Submission"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the communication method for the submission of the registered contract."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract5#mmSubmission
	 * RegisteredContract5.mmSubmission}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSubmission = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> RegisteredContract.mmSubmissionMethod;
			componentContext_lazy = () -> com.tools20022.repository.msg.RegisteredContract4.mmObject();
			isDerived = false;
			xmlTag = "Submissn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Submission";
			definition = "Provides the communication method for the submission of the registered contract.";
			nextVersions_lazy = () -> Arrays.asList(RegisteredContract5.mmSubmission);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.RegisteredContractCommunication1.mmObject();
		}
	};
	@XmlElement(name = "Dlvry", required = true)
	protected RegisteredContractCommunication1 delivery;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.RegisteredContractCommunication1
	 * RegisteredContractCommunication1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmDeliveryMethod
	 * RegisteredContract.mmDeliveryMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract4
	 * RegisteredContract4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dlvry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Delivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the communication method for the delivery of the registered contract."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract5#mmDelivery
	 * RegisteredContract5.mmDelivery}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDelivery = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> RegisteredContract.mmDeliveryMethod;
			componentContext_lazy = () -> com.tools20022.repository.msg.RegisteredContract4.mmObject();
			isDerived = false;
			xmlTag = "Dlvry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Delivery";
			definition = "Provides the communication method for the delivery of the registered contract.";
			nextVersions_lazy = () -> Arrays.asList(RegisteredContract5.mmDelivery);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.RegisteredContractCommunication1.mmObject();
		}
	};
	@XmlElement(name = "LnPrncplAmt")
	protected ActiveCurrencyAndAmount loanPrincipalAmount;
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
	 * {@linkplain com.tools20022.repository.entity.Loan#mmPrincipalAmount
	 * Loan.mmPrincipalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract4
	 * RegisteredContract4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LnPrncplAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LoanPrincipalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money the borrower pays back to the lender outside of interests and charges.\r\n\r\nUsage:\r\nOnly applicable for loan contracts."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract5#mmLoanPrincipalAmount
	 * RegisteredContract5.mmLoanPrincipalAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLoanPrincipalAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Loan.mmPrincipalAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.RegisteredContract4.mmObject();
			isDerived = false;
			xmlTag = "LnPrncplAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LoanPrincipalAmount";
			definition = "Amount of money the borrower pays back to the lender outside of interests and charges.\r\n\r\nUsage:\r\nOnly applicable for loan contracts.";
			nextVersions_lazy = () -> Arrays.asList(RegisteredContract5.mmLoanPrincipalAmount);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "EstmtdDtInd", required = true)
	protected TrueFalseIndicator estimatedDateIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract4
	 * RegisteredContract4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EstmtdDtInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EstimatedDateIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the dates provided are estimates or not."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract5#mmEstimatedDateIndicator
	 * RegisteredContract5.mmEstimatedDateIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEstimatedDateIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RegisteredContract4.mmObject();
			isDerived = false;
			xmlTag = "EstmtdDtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EstimatedDateIndicator";
			definition = "Indicates whether the dates provided are estimates or not.";
			nextVersions_lazy = () -> Arrays.asList(RegisteredContract5.mmEstimatedDateIndicator);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	@XmlElement(name = "IntrCpnyLn", required = true)
	protected TrueFalseIndicator interCompanyLoan;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Loan#mmIntraCompanyLoanIndicator
	 * Loan.mmIntraCompanyLoanIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract4
	 * RegisteredContract4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrCpnyLn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterCompanyLoan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether loan in which both the lender and the borrower are divisions of the same corporation or not.\r\n\r\nUsage:\r\nOnly applicable for loan contracts."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract5#mmInterCompanyLoan
	 * RegisteredContract5.mmInterCompanyLoan}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInterCompanyLoan = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Loan.mmIntraCompanyLoanIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.RegisteredContract4.mmObject();
			isDerived = false;
			xmlTag = "IntrCpnyLn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterCompanyLoan";
			definition = "Indicates whether loan in which both the lender and the borrower are divisions of the same corporation or not.\r\n\r\nUsage:\r\nOnly applicable for loan contracts.";
			nextVersions_lazy = () -> Arrays.asList(RegisteredContract5.mmInterCompanyLoan);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract4
	 * RegisteredContract4}</li>
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
	 * definition} = "Further information on the registered contract."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract5#mmAdditionalInformation
	 * RegisteredContract5.mmAdditionalInformation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RegisteredContract4.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Further information on the registered contract.";
			nextVersions_lazy = () -> Arrays.asList(RegisteredContract5.mmAdditionalInformation);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max1025Text.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract4
	 * RegisteredContract4}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.RegisteredContract4.mmObject();
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
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RegisteredContract4.mmOriginalContractRegistrationRequest, com.tools20022.repository.msg.RegisteredContract4.mmReportingParty,
						com.tools20022.repository.msg.RegisteredContract4.mmRegistrationAgent, com.tools20022.repository.msg.RegisteredContract4.mmIssuerFinancialInstitution, com.tools20022.repository.msg.RegisteredContract4.mmContract,
						com.tools20022.repository.msg.RegisteredContract4.mmContractBalance, com.tools20022.repository.msg.RegisteredContract4.mmPaymentScheduleType,
						com.tools20022.repository.msg.RegisteredContract4.mmRegisteredContractIdentification, com.tools20022.repository.msg.RegisteredContract4.mmPreviousRegisteredContractIdentification,
						com.tools20022.repository.msg.RegisteredContract4.mmRegisteredContractJournal, com.tools20022.repository.msg.RegisteredContract4.mmAmendment, com.tools20022.repository.msg.RegisteredContract4.mmSubmission,
						com.tools20022.repository.msg.RegisteredContract4.mmDelivery, com.tools20022.repository.msg.RegisteredContract4.mmLoanPrincipalAmount, com.tools20022.repository.msg.RegisteredContract4.mmEstimatedDateIndicator,
						com.tools20022.repository.msg.RegisteredContract4.mmInterCompanyLoan, com.tools20022.repository.msg.RegisteredContract4.mmAdditionalInformation, com.tools20022.repository.msg.RegisteredContract4.mmSupplementaryData);
				messageBuildingBlock_lazy = () -> Arrays.asList(ContractRegistrationConfirmationV01.mmRegisteredContract);
				trace_lazy = () -> RegisteredContract.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RegisteredContract4";
				definition = "Document that a user must file with an authorized servicer for each contract that involves foreign currency transactions with non residents.";
				nextVersions_lazy = () -> Arrays.asList(RegisteredContract5.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getOriginalContractRegistrationRequest() {
		return originalContractRegistrationRequest == null ? Optional.empty() : Optional.of(originalContractRegistrationRequest);
	}

	public RegisteredContract4 setOriginalContractRegistrationRequest(Max35Text originalContractRegistrationRequest) {
		this.originalContractRegistrationRequest = originalContractRegistrationRequest;
		return this;
	}

	public TradeParty2 getReportingParty() {
		return reportingParty;
	}

	public RegisteredContract4 setReportingParty(com.tools20022.repository.msg.TradeParty2 reportingParty) {
		this.reportingParty = Objects.requireNonNull(reportingParty);
		return this;
	}

	public BranchAndFinancialInstitutionIdentification5 getRegistrationAgent() {
		return registrationAgent;
	}

	public RegisteredContract4 setRegistrationAgent(com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5 registrationAgent) {
		this.registrationAgent = Objects.requireNonNull(registrationAgent);
		return this;
	}

	public BranchAndFinancialInstitutionIdentification5 getIssuerFinancialInstitution() {
		return issuerFinancialInstitution;
	}

	public RegisteredContract4 setIssuerFinancialInstitution(com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5 issuerFinancialInstitution) {
		this.issuerFinancialInstitution = Objects.requireNonNull(issuerFinancialInstitution);
		return this;
	}

	public UnderlyingContract1Choice getContract() {
		return contract;
	}

	public RegisteredContract4 setContract(UnderlyingContract1Choice contract) {
		this.contract = Objects.requireNonNull(contract);
		return this;
	}

	public List<ContractBalance1> getContractBalance() {
		return contractBalance == null ? contractBalance = new ArrayList<>() : contractBalance;
	}

	public RegisteredContract4 setContractBalance(List<com.tools20022.repository.msg.ContractBalance1> contractBalance) {
		this.contractBalance = Objects.requireNonNull(contractBalance);
		return this;
	}

	public Optional<PaymentScheduleType1Choice> getPaymentScheduleType() {
		return paymentScheduleType == null ? Optional.empty() : Optional.of(paymentScheduleType);
	}

	public RegisteredContract4 setPaymentScheduleType(PaymentScheduleType1Choice paymentScheduleType) {
		this.paymentScheduleType = paymentScheduleType;
		return this;
	}

	public DocumentIdentification29 getRegisteredContractIdentification() {
		return registeredContractIdentification;
	}

	public RegisteredContract4 setRegisteredContractIdentification(com.tools20022.repository.msg.DocumentIdentification29 registeredContractIdentification) {
		this.registeredContractIdentification = Objects.requireNonNull(registeredContractIdentification);
		return this;
	}

	public Optional<DocumentIdentification22> getPreviousRegisteredContractIdentification() {
		return previousRegisteredContractIdentification == null ? Optional.empty() : Optional.of(previousRegisteredContractIdentification);
	}

	public RegisteredContract4 setPreviousRegisteredContractIdentification(com.tools20022.repository.msg.DocumentIdentification22 previousRegisteredContractIdentification) {
		this.previousRegisteredContractIdentification = previousRegisteredContractIdentification;
		return this;
	}

	public List<RegisteredContractJournal1> getRegisteredContractJournal() {
		return registeredContractJournal == null ? registeredContractJournal = new ArrayList<>() : registeredContractJournal;
	}

	public RegisteredContract4 setRegisteredContractJournal(List<com.tools20022.repository.msg.RegisteredContractJournal1> registeredContractJournal) {
		this.registeredContractJournal = Objects.requireNonNull(registeredContractJournal);
		return this;
	}

	public List<RegisteredContractAmendment1> getAmendment() {
		return amendment == null ? amendment = new ArrayList<>() : amendment;
	}

	public RegisteredContract4 setAmendment(List<com.tools20022.repository.msg.RegisteredContractAmendment1> amendment) {
		this.amendment = Objects.requireNonNull(amendment);
		return this;
	}

	public RegisteredContractCommunication1 getSubmission() {
		return submission;
	}

	public RegisteredContract4 setSubmission(com.tools20022.repository.msg.RegisteredContractCommunication1 submission) {
		this.submission = Objects.requireNonNull(submission);
		return this;
	}

	public RegisteredContractCommunication1 getDelivery() {
		return delivery;
	}

	public RegisteredContract4 setDelivery(com.tools20022.repository.msg.RegisteredContractCommunication1 delivery) {
		this.delivery = Objects.requireNonNull(delivery);
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getLoanPrincipalAmount() {
		return loanPrincipalAmount == null ? Optional.empty() : Optional.of(loanPrincipalAmount);
	}

	public RegisteredContract4 setLoanPrincipalAmount(ActiveCurrencyAndAmount loanPrincipalAmount) {
		this.loanPrincipalAmount = loanPrincipalAmount;
		return this;
	}

	public TrueFalseIndicator getEstimatedDateIndicator() {
		return estimatedDateIndicator;
	}

	public RegisteredContract4 setEstimatedDateIndicator(TrueFalseIndicator estimatedDateIndicator) {
		this.estimatedDateIndicator = Objects.requireNonNull(estimatedDateIndicator);
		return this;
	}

	public TrueFalseIndicator getInterCompanyLoan() {
		return interCompanyLoan;
	}

	public RegisteredContract4 setInterCompanyLoan(TrueFalseIndicator interCompanyLoan) {
		this.interCompanyLoan = Objects.requireNonNull(interCompanyLoan);
		return this;
	}

	public Optional<Max1025Text> getAdditionalInformation() {
		return additionalInformation == null ? Optional.empty() : Optional.of(additionalInformation);
	}

	public RegisteredContract4 setAdditionalInformation(Max1025Text additionalInformation) {
		this.additionalInformation = additionalInformation;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public RegisteredContract4 setSupplementaryData(List<com.tools20022.repository.msg.SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}
}