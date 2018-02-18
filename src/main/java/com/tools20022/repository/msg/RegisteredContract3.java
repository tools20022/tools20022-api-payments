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
import com.tools20022.repository.entity.Contract;
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
 * {@linkplain com.tools20022.repository.msg.RegisteredContract3#mmRegisteredContractAmendmentIdentification
 * RegisteredContract3.mmRegisteredContractAmendmentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegisteredContract3#mmOriginalRegisteredContractIdentification
 * RegisteredContract3.mmOriginalRegisteredContractIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RegisteredContract3#mmPriority
 * RegisteredContract3.mmPriority}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RegisteredContract3#mmContract
 * RegisteredContract3.mmContract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegisteredContract3#mmContractBalance
 * RegisteredContract3.mmContractBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegisteredContract3#mmPaymentScheduleType
 * RegisteredContract3.mmPaymentScheduleType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegisteredContract3#mmAdditionalInformation
 * RegisteredContract3.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegisteredContract3#mmAttachment
 * RegisteredContract3.mmAttachment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegisteredContract3#mmSupplementaryData
 * RegisteredContract3.mmSupplementaryData}</li>
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
 * "RegisteredContract3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Document that a user must file with an authorized servicer for each contract that involves foreign currency transactions with non residents."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "RegisteredContract3", propOrder = {"registeredContractAmendmentIdentification", "originalRegisteredContractIdentification", "priority", "contract", "contractBalance", "paymentScheduleType", "additionalInformation",
		"attachment", "supplementaryData"})
public class RegisteredContract3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RegdCtrctAmdmntId", required = true)
	protected Max35Text registeredContractAmendmentIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract3
	 * RegisteredContract3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RegdCtrctAmdmntId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = type=Synonym, context=RU-CMPG, value=Deal Passport
	 * Amendment Identification</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegisteredContractAmendmentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification of the registered contract amendment request."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRegisteredContractAmendmentIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> RegisteredContract.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.RegisteredContract3.mmObject();
			isDerived = false;
			xmlTag = "RegdCtrctAmdmntId";
			semanticMarkup_lazy = () -> Arrays.asList(new OtherSemanticMarkup(this, "Synonym", new String[]{"context", "RU-CMPG"}, new String[]{"value", "Deal Passport Amendment Identification"}));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegisteredContractAmendmentIdentification";
			definition = "Unique and unambiguous identification of the registered contract amendment request.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "OrgnlRegdCtrctId", required = true)
	protected Max35Text originalRegisteredContractIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract3
	 * RegisteredContract3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlRegdCtrctId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = type=Synonym, context=RU-CMPG, value=Original Deal
	 * Passport Identification</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalRegisteredContractIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the original contract registration, as registered with the registration agent."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalRegisteredContractIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> RegisteredContract.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.RegisteredContract3.mmObject();
			isDerived = false;
			xmlTag = "OrgnlRegdCtrctId";
			semanticMarkup_lazy = () -> Arrays.asList(new OtherSemanticMarkup(this, "Synonym", new String[]{"context", "RU-CMPG"}, new String[]{"value", "Original Deal Passport Identification"}));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalRegisteredContractIdentification";
			definition = "Identification of the original contract registration, as registered with the registration agent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract3
	 * RegisteredContract3}</li>
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
	 * "Priority requested for the amendment of the registered contract."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPriority = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> RegisteredContract.mmPriority;
			componentContext_lazy = () -> com.tools20022.repository.msg.RegisteredContract3.mmObject();
			isDerived = false;
			xmlTag = "Prty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Priority";
			definition = "Priority requested for the amendment of the registered contract.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Priority2Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract3
	 * RegisteredContract3}</li>
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
	 * definition} =
	 * "Amendment details of the registered contract for the registered contract."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmContract = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Contract.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.RegisteredContract3.mmObject();
			isDerived = false;
			xmlTag = "Ctrct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Contract";
			definition = "Amendment details of the registered contract for the registered contract.";
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
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract3
	 * RegisteredContract3}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmContractBalance = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> RegisteredContract.mmContractBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.RegisteredContract3.mmObject();
			isDerived = false;
			xmlTag = "CtrctBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContractBalance";
			definition = "Contract balance on date of contract registration.";
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
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract3
	 * RegisteredContract3}</li>
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
	public static final MMMessageAssociationEnd mmPaymentScheduleType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> RegisteredContract.mmPaymentScheduleType;
			componentContext_lazy = () -> com.tools20022.repository.msg.RegisteredContract3.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract3
	 * RegisteredContract3}</li>
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
	 * definition} = "Further additional information on the amendment."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RegisteredContract3.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Further additional information on the amendment.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max1025Text.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract3
	 * RegisteredContract3}</li>
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
	 * "Documents provided as attachments to the contract registration amendment request."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAttachment = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> RegisteredContract.mmAttachment;
			componentContext_lazy = () -> com.tools20022.repository.msg.RegisteredContract3.mmObject();
			isDerived = false;
			xmlTag = "Attchmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Attachment";
			definition = "Documents provided as attachments to the contract registration amendment request.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DocumentGeneralInformation3.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract3
	 * RegisteredContract3}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.RegisteredContract3.mmObject();
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
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RegisteredContract3.mmRegisteredContractAmendmentIdentification,
						com.tools20022.repository.msg.RegisteredContract3.mmOriginalRegisteredContractIdentification, com.tools20022.repository.msg.RegisteredContract3.mmPriority,
						com.tools20022.repository.msg.RegisteredContract3.mmContract, com.tools20022.repository.msg.RegisteredContract3.mmContractBalance, com.tools20022.repository.msg.RegisteredContract3.mmPaymentScheduleType,
						com.tools20022.repository.msg.RegisteredContract3.mmAdditionalInformation, com.tools20022.repository.msg.RegisteredContract3.mmAttachment, com.tools20022.repository.msg.RegisteredContract3.mmSupplementaryData);
				trace_lazy = () -> RegisteredContract.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RegisteredContract3";
				definition = "Document that a user must file with an authorized servicer for each contract that involves foreign currency transactions with non residents.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getRegisteredContractAmendmentIdentification() {
		return registeredContractAmendmentIdentification;
	}

	public RegisteredContract3 setRegisteredContractAmendmentIdentification(Max35Text registeredContractAmendmentIdentification) {
		this.registeredContractAmendmentIdentification = Objects.requireNonNull(registeredContractAmendmentIdentification);
		return this;
	}

	public Max35Text getOriginalRegisteredContractIdentification() {
		return originalRegisteredContractIdentification;
	}

	public RegisteredContract3 setOriginalRegisteredContractIdentification(Max35Text originalRegisteredContractIdentification) {
		this.originalRegisteredContractIdentification = Objects.requireNonNull(originalRegisteredContractIdentification);
		return this;
	}

	public Priority2Code getPriority() {
		return priority;
	}

	public RegisteredContract3 setPriority(Priority2Code priority) {
		this.priority = Objects.requireNonNull(priority);
		return this;
	}

	public UnderlyingContract1Choice getContract() {
		return contract;
	}

	public RegisteredContract3 setContract(UnderlyingContract1Choice contract) {
		this.contract = Objects.requireNonNull(contract);
		return this;
	}

	public List<ContractBalance1> getContractBalance() {
		return contractBalance == null ? contractBalance = new ArrayList<>() : contractBalance;
	}

	public RegisteredContract3 setContractBalance(List<com.tools20022.repository.msg.ContractBalance1> contractBalance) {
		this.contractBalance = Objects.requireNonNull(contractBalance);
		return this;
	}

	public Optional<PaymentScheduleType1Choice> getPaymentScheduleType() {
		return paymentScheduleType == null ? Optional.empty() : Optional.of(paymentScheduleType);
	}

	public RegisteredContract3 setPaymentScheduleType(PaymentScheduleType1Choice paymentScheduleType) {
		this.paymentScheduleType = paymentScheduleType;
		return this;
	}

	public Optional<Max1025Text> getAdditionalInformation() {
		return additionalInformation == null ? Optional.empty() : Optional.of(additionalInformation);
	}

	public RegisteredContract3 setAdditionalInformation(Max1025Text additionalInformation) {
		this.additionalInformation = additionalInformation;
		return this;
	}

	public List<DocumentGeneralInformation3> getAttachment() {
		return attachment == null ? attachment = new ArrayList<>() : attachment;
	}

	public RegisteredContract3 setAttachment(List<com.tools20022.repository.msg.DocumentGeneralInformation3> attachment) {
		this.attachment = Objects.requireNonNull(attachment);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public RegisteredContract3 setSupplementaryData(List<com.tools20022.repository.msg.SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}
}