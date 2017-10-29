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
import com.tools20022.repository.choice.PaymentScheduleType1Choice;
import com.tools20022.repository.choice.UnderlyingContract1Choice;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.Max1025Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.RegisteredContract;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.msg.RegisteredContract5#OriginalContractRegistrationRequest
 * RegisteredContract5.OriginalContractRegistrationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegisteredContract5#IssuerFinancialInstitution
 * RegisteredContract5.IssuerFinancialInstitution}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RegisteredContract5#Contract
 * RegisteredContract5.Contract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegisteredContract5#ContractBalance
 * RegisteredContract5.ContractBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegisteredContract5#PaymentScheduleType
 * RegisteredContract5.PaymentScheduleType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegisteredContract5#RegisteredContractIdentification
 * RegisteredContract5.RegisteredContractIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegisteredContract5#PreviousRegisteredContractIdentification
 * RegisteredContract5.PreviousRegisteredContractIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegisteredContract5#RegisteredContractJournal
 * RegisteredContract5.RegisteredContractJournal}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RegisteredContract5#Amendment
 * RegisteredContract5.Amendment}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RegisteredContract5#Submission
 * RegisteredContract5.Submission}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RegisteredContract5#Delivery
 * RegisteredContract5.Delivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegisteredContract5#LoanPrincipalAmount
 * RegisteredContract5.LoanPrincipalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegisteredContract5#EstimatedDateIndicator
 * RegisteredContract5.EstimatedDateIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegisteredContract5#InterCompanyLoan
 * RegisteredContract5.InterCompanyLoan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegisteredContract5#AdditionalInformation
 * RegisteredContract5.AdditionalInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.RegisteredContract
 * RegisteredContract}</li>
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
 * "RegisteredContract5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Document that a user must file with an authorized servicer for each contract that involves foreign currency transactions with non residents."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.RegisteredContract4
 * RegisteredContract4}</li>
 * </ul>
 */
public class RegisteredContract5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Unique identification of the contract registration creation, amendment or
	 * closure request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract5
	 * RegisteredContract5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract4#OriginalContractRegistrationRequest
	 * RegisteredContract4.OriginalContractRegistrationRequest}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute OriginalContractRegistrationRequest = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RegisteredContract5.mmObject();
			isDerived = false;
			xmlTag = "OrgnlCtrctRegnReq";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalContractRegistrationRequest";
			definition = "Unique identification of the contract registration creation, amendment or closure request.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.RegisteredContract4.OriginalContractRegistrationRequest;
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Financial institution of the issuer of the contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5
	 * BranchAndFinancialInstitutionIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract#RegistrationAgent
	 * RegisteredContract.RegistrationAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract5
	 * RegisteredContract5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract4#IssuerFinancialInstitution
	 * RegisteredContract4.IssuerFinancialInstitution}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd IssuerFinancialInstitution = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> RegisteredContract5.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.RegisteredContract.RegistrationAgent;
			isDerived = false;
			xmlTag = "IssrFI";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerFinancialInstitution";
			definition = "Financial institution of the issuer of the contract.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.RegisteredContract4.IssuerFinancialInstitution;
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification5.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Details of the contract being registered.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract5
	 * RegisteredContract5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract4#Contract
	 * RegisteredContract4.Contract}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Contract = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> RegisteredContract5.mmObject();
			businessComponentTrace_lazy = () -> com.tools20022.repository.entity.Contract.mmObject();
			isDerived = false;
			xmlTag = "Ctrct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Contract";
			definition = "Details of the contract being registered.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.RegisteredContract4.Contract;
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> UnderlyingContract1Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Contract balance on date of contract registration.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ContractBalance1
	 * ContractBalance1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract#ContractBalance
	 * RegisteredContract.ContractBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract5
	 * RegisteredContract5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract4#ContractBalance
	 * RegisteredContract4.ContractBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd ContractBalance = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> RegisteredContract5.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.RegisteredContract.ContractBalance;
			isDerived = false;
			xmlTag = "CtrctBal";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContractBalance";
			definition = "Contract balance on date of contract registration.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.RegisteredContract4.ContractBalance;
			minOccurs = 0;
			type_lazy = () -> ContractBalance1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Type of the payment schedule provided in the contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PaymentScheduleType1Choice
	 * PaymentScheduleType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract#PaymentScheduleType
	 * RegisteredContract.PaymentScheduleType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract5
	 * RegisteredContract5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract4#PaymentScheduleType
	 * RegisteredContract4.PaymentScheduleType}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd PaymentScheduleType = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> RegisteredContract5.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.RegisteredContract.PaymentScheduleType;
			isDerived = false;
			xmlTag = "PmtSchdlTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentScheduleType";
			definition = "Type of the payment schedule provided in the contract.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.RegisteredContract4.PaymentScheduleType;
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> PaymentScheduleType1Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Unique and unambiguous identification of the registered contract as
	 * assigned by the registration agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification29
	 * DocumentIdentification29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract#Identification
	 * RegisteredContract.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract5
	 * RegisteredContract5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RegdCtrctId"</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract4#RegisteredContractIdentification
	 * RegisteredContract4.RegisteredContractIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd RegisteredContractIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> RegisteredContract5.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.RegisteredContract.Identification;
			isDerived = false;
			xmlTag = "RegdCtrctId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegisteredContractIdentification";
			definition = "Unique and unambiguous identification of the registered contract as assigned by the registration agent.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.RegisteredContract4.RegisteredContractIdentification;
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DocumentIdentification29.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Identification of a previously defined registered contract linked to the
	 * same underlying contract.<br>
	 * <br>
	 * Usage:<br>
	 * This is the identification of a previous contract registration for the
	 * same underlying contract, which was closed. In most cases, this is used
	 * when a reporting party moves from one registration agent to another.
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
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract#Identification
	 * RegisteredContract.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract5
	 * RegisteredContract5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsRegdCtrctId"</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract4#PreviousRegisteredContractIdentification
	 * RegisteredContract4.PreviousRegisteredContractIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd PreviousRegisteredContractIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> RegisteredContract5.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.RegisteredContract.Identification;
			isDerived = false;
			xmlTag = "PrvsRegdCtrctId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousRegisteredContractIdentification";
			definition = "Identification of a previously defined registered contract linked to the same underlying contract.\r\n\r\nUsage:\r\nThis is the identification of a previous contract registration for the same underlying contract, which was closed. In most cases, this is used  when a reporting party moves from one registration agent to another.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.RegisteredContract4.PreviousRegisteredContractIdentification;
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> DocumentIdentification22.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Journal of previously closed registered contracts for the same underlying
	 * contract, which were requested at the same registration agent.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract5
	 * RegisteredContract5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract4#RegisteredContractJournal
	 * RegisteredContract4.RegisteredContractJournal}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd RegisteredContractJournal = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> RegisteredContract5.mmObject();
			businessComponentTrace_lazy = () -> RegisteredContract.mmObject();
			isDerived = false;
			xmlTag = "RegdCtrctJrnl";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegisteredContractJournal";
			definition = "Journal of previously closed registered contracts for the same underlying contract, which were requested at the same registration agent.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.RegisteredContract4.RegisteredContractJournal;
			minOccurs = 0;
			type_lazy = () -> RegisteredContractJournal1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Details on amendments to the registered contract.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract5
	 * RegisteredContract5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract4#Amendment
	 * RegisteredContract4.Amendment}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Amendment = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> RegisteredContract5.mmObject();
			businessComponentTrace_lazy = () -> RegisteredContract.mmObject();
			isDerived = false;
			xmlTag = "Amdmnt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amendment";
			definition = "Details on amendments to the registered contract.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.RegisteredContract4.Amendment;
			minOccurs = 0;
			type_lazy = () -> RegisteredContractAmendment1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Provides the communication method for the submission of the registered
	 * contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.RegisteredContractCommunication1
	 * RegisteredContractCommunication1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract#SubmissionMethod
	 * RegisteredContract.SubmissionMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract5
	 * RegisteredContract5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract4#Submission
	 * RegisteredContract4.Submission}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Submission = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> RegisteredContract5.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.RegisteredContract.SubmissionMethod;
			isDerived = false;
			xmlTag = "Submissn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Submission";
			definition = "Provides the communication method for the submission of the registered contract.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.RegisteredContract4.Submission;
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> RegisteredContractCommunication1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Provides the communication method for the delivery of the registered
	 * contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.RegisteredContractCommunication1
	 * RegisteredContractCommunication1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract#DeliveryMethod
	 * RegisteredContract.DeliveryMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract5
	 * RegisteredContract5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract4#Delivery
	 * RegisteredContract4.Delivery}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Delivery = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> RegisteredContract5.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.RegisteredContract.DeliveryMethod;
			isDerived = false;
			xmlTag = "Dlvry";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Delivery";
			definition = "Provides the communication method for the delivery of the registered contract.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.RegisteredContract4.Delivery;
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> RegisteredContractCommunication1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Amount of money the borrower pays back to the lender outside of interests
	 * and charges.<br>
	 * <br>
	 * Usage:<br>
	 * Only applicable for loan contracts.
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
	 * {@linkplain com.tools20022.repository.entity.Loan#PrincipalAmount
	 * Loan.PrincipalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract5
	 * RegisteredContract5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract4#LoanPrincipalAmount
	 * RegisteredContract4.LoanPrincipalAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute LoanPrincipalAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RegisteredContract5.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Loan.PrincipalAmount;
			isDerived = false;
			xmlTag = "LnPrncplAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LoanPrincipalAmount";
			definition = "Amount of money the borrower pays back to the lender outside of interests and charges.\r\n\r\nUsage:\r\nOnly applicable for loan contracts.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.RegisteredContract4.LoanPrincipalAmount;
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Indicates whether the dates provided are estimates or not.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract5
	 * RegisteredContract5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract4#EstimatedDateIndicator
	 * RegisteredContract4.EstimatedDateIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute EstimatedDateIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RegisteredContract5.mmObject();
			isDerived = false;
			xmlTag = "EstmtdDtInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EstimatedDateIndicator";
			definition = "Indicates whether the dates provided are estimates or not.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.RegisteredContract4.EstimatedDateIndicator;
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether loan in which both the lender and the borrower are
	 * divisions of the same corporation or not.<br>
	 * <br>
	 * Usage:<br>
	 * Only applicable for loan contracts.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.Loan#IntraCompanyLoanIndicator
	 * Loan.IntraCompanyLoanIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract5
	 * RegisteredContract5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract4#InterCompanyLoan
	 * RegisteredContract4.InterCompanyLoan}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute InterCompanyLoan = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RegisteredContract5.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Loan.IntraCompanyLoanIndicator;
			isDerived = false;
			xmlTag = "IntrCpnyLn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterCompanyLoan";
			definition = "Indicates whether loan in which both the lender and the borrower are divisions of the same corporation or not.\r\n\r\nUsage:\r\nOnly applicable for loan contracts.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.RegisteredContract4.InterCompanyLoan;
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	/**
	 * Further information on the registered contract.
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
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract5
	 * RegisteredContract5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract4#AdditionalInformation
	 * RegisteredContract4.AdditionalInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute AdditionalInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RegisteredContract5.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Further information on the registered contract.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.RegisteredContract4.AdditionalInformation;
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max1025Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RegisteredContract5.OriginalContractRegistrationRequest, com.tools20022.repository.msg.RegisteredContract5.IssuerFinancialInstitution,
						com.tools20022.repository.msg.RegisteredContract5.Contract, com.tools20022.repository.msg.RegisteredContract5.ContractBalance, com.tools20022.repository.msg.RegisteredContract5.PaymentScheduleType,
						com.tools20022.repository.msg.RegisteredContract5.RegisteredContractIdentification, com.tools20022.repository.msg.RegisteredContract5.PreviousRegisteredContractIdentification,
						com.tools20022.repository.msg.RegisteredContract5.RegisteredContractJournal, com.tools20022.repository.msg.RegisteredContract5.Amendment, com.tools20022.repository.msg.RegisteredContract5.Submission,
						com.tools20022.repository.msg.RegisteredContract5.Delivery, com.tools20022.repository.msg.RegisteredContract5.LoanPrincipalAmount, com.tools20022.repository.msg.RegisteredContract5.EstimatedDateIndicator,
						com.tools20022.repository.msg.RegisteredContract5.InterCompanyLoan, com.tools20022.repository.msg.RegisteredContract5.AdditionalInformation);
				trace_lazy = () -> RegisteredContract.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RegisteredContract5";
				definition = "Document that a user must file with an authorized servicer for each contract that involves foreign currency transactions with non residents.";
				previousVersion_lazy = () -> RegisteredContract4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}