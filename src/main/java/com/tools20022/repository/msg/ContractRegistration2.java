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
import com.tools20022.repository.choice.PaymentScheduleType1Choice;
import com.tools20022.repository.choice.UnderlyingContract1Choice;
import com.tools20022.repository.codeset.Priority2Code;
import com.tools20022.repository.datatype.Max1025Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.RegisteredContract;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ContractBalance1;
import com.tools20022.repository.msg.DocumentGeneralInformation3;
import com.tools20022.repository.msg.DocumentIdentification22;
import com.tools20022.repository.msg.SupplementaryData1;
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
 * {@linkplain com.tools20022.repository.msg.ContractRegistration2#mmContractRegistrationOpeningIdentification
 * ContractRegistration2.mmContractRegistrationOpeningIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContractRegistration2#mmPriority
 * ContractRegistration2.mmPriority}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContractRegistration2#mmContract
 * ContractRegistration2.mmContract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContractRegistration2#mmContractBalance
 * ContractRegistration2.mmContractBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContractRegistration2#mmPaymentScheduleType
 * ContractRegistration2.mmPaymentScheduleType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContractRegistration2#mmPreviousRegistrationIdentification
 * ContractRegistration2.mmPreviousRegistrationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContractRegistration2#mmAdditionalInformation
 * ContractRegistration2.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContractRegistration2#mmAttachment
 * ContractRegistration2.mmAttachment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContractRegistration2#mmSupplementaryData
 * ContractRegistration2.mmSupplementaryData}</li>
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
 * "ContractRegistration2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Document that a user must file with an authorized servicer for each contract that involves foreign currency transactions with non residents."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ContractRegistration2", propOrder = {"contractRegistrationOpeningIdentification", "priority", "contract", "contractBalance", "paymentScheduleType", "previousRegistrationIdentification", "additionalInformation",
		"attachment", "supplementaryData"})
public class ContractRegistration2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CtrctRegnOpngId", required = true)
	protected Max35Text contractRegistrationOpeningIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.ContractRegistration2
	 * ContractRegistration2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrctRegnOpngId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = type=Synonym, context=RU-CMPG, value=Deal Passport
	 * Opening Identification</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContractRegistrationOpeningIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification of the registered contract opening."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ContractRegistration2, Max35Text> mmContractRegistrationOpeningIdentification = new MMMessageAttribute<ContractRegistration2, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ContractRegistration2.mmObject();
			isDerived = false;
			xmlTag = "CtrctRegnOpngId";
			semanticMarkup_lazy = () -> Arrays.asList(new OtherSemanticMarkup(this, "Synonym", new String[]{"context", "RU-CMPG"}, new String[]{"value", "Deal Passport Opening Identification"}));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContractRegistrationOpeningIdentification";
			definition = "Unique and unambiguous identification of the registered contract opening.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(ContractRegistration2 obj) {
			return obj.getContractRegistrationOpeningIdentification();
		}

		@Override
		public void setValue(ContractRegistration2 obj, Max35Text value) {
			obj.setContractRegistrationOpeningIdentification(value);
		}
	};
	@XmlElement(name = "Prty", required = true)
	protected Priority2Code priority;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Priority2Code
	 * Priority2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmPriority
	 * RegisteredContract.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContractRegistration2
	 * ContractRegistration2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Priority"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Priority requested for the opening of the registered contract."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ContractRegistration2, Priority2Code> mmPriority = new MMMessageAttribute<ContractRegistration2, Priority2Code>() {
		{
			businessElementTrace_lazy = () -> RegisteredContract.mmPriority;
			componentContext_lazy = () -> com.tools20022.repository.msg.ContractRegistration2.mmObject();
			isDerived = false;
			xmlTag = "Prty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Priority";
			definition = "Priority requested for the opening of the registered contract.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Priority2Code.mmObject();
		}

		@Override
		public Priority2Code getValue(ContractRegistration2 obj) {
			return obj.getPriority();
		}

		@Override
		public void setValue(ContractRegistration2 obj, Priority2Code value) {
			obj.setPriority(value);
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContractRegistration2
	 * ContractRegistration2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ContractRegistration2, UnderlyingContract1Choice> mmContract = new MMMessageAssociationEnd<ContractRegistration2, UnderlyingContract1Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ContractRegistration2.mmObject();
			isDerived = false;
			xmlTag = "Ctrct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Contract";
			definition = "Details of the contract being registered.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> UnderlyingContract1Choice.mmObject();
		}

		@Override
		public UnderlyingContract1Choice getValue(ContractRegistration2 obj) {
			return obj.getContract();
		}

		@Override
		public void setValue(ContractRegistration2 obj, UnderlyingContract1Choice value) {
			obj.setContract(value);
		}
	};
	@XmlElement(name = "CtrctBal")
	protected List<ContractBalance1> contractBalance;
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
	 * {@linkplain com.tools20022.repository.msg.ContractRegistration2
	 * ContractRegistration2}</li>
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
	 * definition} = "contract balance on date of contract registration."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ContractRegistration2, List<ContractBalance1>> mmContractBalance = new MMMessageAssociationEnd<ContractRegistration2, List<ContractBalance1>>() {
		{
			businessElementTrace_lazy = () -> RegisteredContract.mmContractBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.ContractRegistration2.mmObject();
			isDerived = false;
			xmlTag = "CtrctBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContractBalance";
			definition = "contract balance on date of contract registration.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ContractBalance1.mmObject();
		}

		@Override
		public List<ContractBalance1> getValue(ContractRegistration2 obj) {
			return obj.getContractBalance();
		}

		@Override
		public void setValue(ContractRegistration2 obj, List<ContractBalance1> value) {
			obj.setContractBalance(value);
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
	 * {@linkplain com.tools20022.repository.msg.ContractRegistration2
	 * ContractRegistration2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ContractRegistration2, Optional<PaymentScheduleType1Choice>> mmPaymentScheduleType = new MMMessageAssociationEnd<ContractRegistration2, Optional<PaymentScheduleType1Choice>>() {
		{
			businessElementTrace_lazy = () -> RegisteredContract.mmPaymentScheduleType;
			componentContext_lazy = () -> com.tools20022.repository.msg.ContractRegistration2.mmObject();
			isDerived = false;
			xmlTag = "PmtSchdlTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentScheduleType";
			definition = "Type of the payment schedule provided in the contract.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentScheduleType1Choice.mmObject();
		}

		@Override
		public Optional<PaymentScheduleType1Choice> getValue(ContractRegistration2 obj) {
			return obj.getPaymentScheduleType();
		}

		@Override
		public void setValue(ContractRegistration2 obj, Optional<PaymentScheduleType1Choice> value) {
			obj.setPaymentScheduleType(value.orElse(null));
		}
	};
	@XmlElement(name = "PrvsRegnId")
	protected List<DocumentIdentification22> previousRegistrationIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.ContractRegistration2
	 * ContractRegistration2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsRegnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousRegistrationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification of a previous contract registration."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ContractRegistration2, List<DocumentIdentification22>> mmPreviousRegistrationIdentification = new MMMessageAssociationEnd<ContractRegistration2, List<DocumentIdentification22>>() {
		{
			businessElementTrace_lazy = () -> RegisteredContract.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.ContractRegistration2.mmObject();
			isDerived = false;
			xmlTag = "PrvsRegnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousRegistrationIdentification";
			definition = "Unique and unambiguous identification of a previous contract registration.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DocumentIdentification22.mmObject();
		}

		@Override
		public List<DocumentIdentification22> getValue(ContractRegistration2 obj) {
			return obj.getPreviousRegistrationIdentification();
		}

		@Override
		public void setValue(ContractRegistration2 obj, List<DocumentIdentification22> value) {
			obj.setPreviousRegistrationIdentification(value);
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
	 * {@linkplain com.tools20022.repository.msg.ContractRegistration2
	 * ContractRegistration2}</li>
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
	 * definition} = "Further details on the registered contract opening."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ContractRegistration2, Optional<Max1025Text>> mmAdditionalInformation = new MMMessageAttribute<ContractRegistration2, Optional<Max1025Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ContractRegistration2.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Further details on the registered contract opening.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max1025Text.mmObject();
		}

		@Override
		public Optional<Max1025Text> getValue(ContractRegistration2 obj) {
			return obj.getAdditionalInformation();
		}

		@Override
		public void setValue(ContractRegistration2 obj, Optional<Max1025Text> value) {
			obj.setAdditionalInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "Attchmnt")
	protected List<DocumentGeneralInformation3> attachment;
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
	 * {@linkplain com.tools20022.repository.msg.ContractRegistration2
	 * ContractRegistration2}</li>
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
	 * "Documents provided as attachments to the contract registration request."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ContractRegistration2, List<DocumentGeneralInformation3>> mmAttachment = new MMMessageAssociationEnd<ContractRegistration2, List<DocumentGeneralInformation3>>() {
		{
			businessElementTrace_lazy = () -> RegisteredContract.mmAttachment;
			componentContext_lazy = () -> com.tools20022.repository.msg.ContractRegistration2.mmObject();
			isDerived = false;
			xmlTag = "Attchmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Attachment";
			definition = "Documents provided as attachments to the contract registration request.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DocumentGeneralInformation3.mmObject();
		}

		@Override
		public List<DocumentGeneralInformation3> getValue(ContractRegistration2 obj) {
			return obj.getAttachment();
		}

		@Override
		public void setValue(ContractRegistration2 obj, List<DocumentGeneralInformation3> value) {
			obj.setAttachment(value);
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
	 * {@linkplain com.tools20022.repository.msg.ContractRegistration2
	 * ContractRegistration2}</li>
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
	public static final MMMessageAssociationEnd<ContractRegistration2, List<SupplementaryData1>> mmSupplementaryData = new MMMessageAssociationEnd<ContractRegistration2, List<SupplementaryData1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ContractRegistration2.mmObject();
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
		public List<SupplementaryData1> getValue(ContractRegistration2 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(ContractRegistration2 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ContractRegistration2.mmContractRegistrationOpeningIdentification, com.tools20022.repository.msg.ContractRegistration2.mmPriority,
						com.tools20022.repository.msg.ContractRegistration2.mmContract, com.tools20022.repository.msg.ContractRegistration2.mmContractBalance, com.tools20022.repository.msg.ContractRegistration2.mmPaymentScheduleType,
						com.tools20022.repository.msg.ContractRegistration2.mmPreviousRegistrationIdentification, com.tools20022.repository.msg.ContractRegistration2.mmAdditionalInformation,
						com.tools20022.repository.msg.ContractRegistration2.mmAttachment, com.tools20022.repository.msg.ContractRegistration2.mmSupplementaryData);
				trace_lazy = () -> RegisteredContract.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ContractRegistration2";
				definition = "Document that a user must file with an authorized servicer for each contract that involves foreign currency transactions with non residents.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getContractRegistrationOpeningIdentification() {
		return contractRegistrationOpeningIdentification;
	}

	public ContractRegistration2 setContractRegistrationOpeningIdentification(Max35Text contractRegistrationOpeningIdentification) {
		this.contractRegistrationOpeningIdentification = Objects.requireNonNull(contractRegistrationOpeningIdentification);
		return this;
	}

	public Priority2Code getPriority() {
		return priority;
	}

	public ContractRegistration2 setPriority(Priority2Code priority) {
		this.priority = Objects.requireNonNull(priority);
		return this;
	}

	public UnderlyingContract1Choice getContract() {
		return contract;
	}

	public ContractRegistration2 setContract(UnderlyingContract1Choice contract) {
		this.contract = Objects.requireNonNull(contract);
		return this;
	}

	public List<ContractBalance1> getContractBalance() {
		return contractBalance == null ? contractBalance = new ArrayList<>() : contractBalance;
	}

	public ContractRegistration2 setContractBalance(List<ContractBalance1> contractBalance) {
		this.contractBalance = Objects.requireNonNull(contractBalance);
		return this;
	}

	public Optional<PaymentScheduleType1Choice> getPaymentScheduleType() {
		return paymentScheduleType == null ? Optional.empty() : Optional.of(paymentScheduleType);
	}

	public ContractRegistration2 setPaymentScheduleType(PaymentScheduleType1Choice paymentScheduleType) {
		this.paymentScheduleType = paymentScheduleType;
		return this;
	}

	public List<DocumentIdentification22> getPreviousRegistrationIdentification() {
		return previousRegistrationIdentification == null ? previousRegistrationIdentification = new ArrayList<>() : previousRegistrationIdentification;
	}

	public ContractRegistration2 setPreviousRegistrationIdentification(List<DocumentIdentification22> previousRegistrationIdentification) {
		this.previousRegistrationIdentification = Objects.requireNonNull(previousRegistrationIdentification);
		return this;
	}

	public Optional<Max1025Text> getAdditionalInformation() {
		return additionalInformation == null ? Optional.empty() : Optional.of(additionalInformation);
	}

	public ContractRegistration2 setAdditionalInformation(Max1025Text additionalInformation) {
		this.additionalInformation = additionalInformation;
		return this;
	}

	public List<DocumentGeneralInformation3> getAttachment() {
		return attachment == null ? attachment = new ArrayList<>() : attachment;
	}

	public ContractRegistration2 setAttachment(List<DocumentGeneralInformation3> attachment) {
		this.attachment = Objects.requireNonNull(attachment);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public ContractRegistration2 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}
}