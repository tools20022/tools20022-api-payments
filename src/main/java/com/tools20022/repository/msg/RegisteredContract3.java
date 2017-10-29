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
import com.tools20022.repository.codeset.Priority2Code;
import com.tools20022.repository.datatype.Max1025Text;
import com.tools20022.repository.datatype.Max35Text;
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
 * {@linkplain com.tools20022.repository.msg.RegisteredContract3#RegisteredContractAmendmentIdentification
 * RegisteredContract3.RegisteredContractAmendmentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegisteredContract3#OriginalRegisteredContractIdentification
 * RegisteredContract3.OriginalRegisteredContractIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RegisteredContract3#Priority
 * RegisteredContract3.Priority}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RegisteredContract3#Contract
 * RegisteredContract3.Contract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegisteredContract3#ContractBalance
 * RegisteredContract3.ContractBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegisteredContract3#PaymentScheduleType
 * RegisteredContract3.PaymentScheduleType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegisteredContract3#AdditionalInformation
 * RegisteredContract3.AdditionalInformation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RegisteredContract3#Attachment
 * RegisteredContract3.Attachment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegisteredContract3#SupplementaryData
 * RegisteredContract3.SupplementaryData}</li>
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
public class RegisteredContract3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Unique and unambiguous identification of the registered contract
	 * amendment request.
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
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract#Identification
	 * RegisteredContract.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract3
	 * RegisteredContract3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RegdCtrctAmdmntId"</li>
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
	public static final MMMessageAttribute RegisteredContractAmendmentIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RegisteredContract3.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.RegisteredContract.Identification;
			isDerived = false;
			xmlTag = "RegdCtrctAmdmntId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegisteredContractAmendmentIdentification";
			definition = "Unique and unambiguous identification of the registered contract amendment request.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Identification of the original contract registration, as registered with
	 * the registration agent.
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
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract#Identification
	 * RegisteredContract.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract3
	 * RegisteredContract3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlRegdCtrctId"</li>
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
	public static final MMMessageAttribute OriginalRegisteredContractIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RegisteredContract3.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.RegisteredContract.Identification;
			isDerived = false;
			xmlTag = "OrgnlRegdCtrctId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalRegisteredContractIdentification";
			definition = "Identification of the original contract registration, as registered with the registration agent.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Priority requested for the amendment of the registered contract.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract#Priority
	 * RegisteredContract.Priority}</li>
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
	public static final MMMessageAttribute Priority = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RegisteredContract3.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.RegisteredContract.Priority;
			isDerived = false;
			xmlTag = "Prty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Priority";
			definition = "Priority requested for the amendment of the registered contract.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Priority2Code.mmObject();
		}
	};
	/**
	 * Amendment details of the registered contract for the registered contract.
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
	public static final MMMessageAssociationEnd Contract = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> RegisteredContract3.mmObject();
			businessComponentTrace_lazy = () -> com.tools20022.repository.entity.Contract.mmObject();
			isDerived = false;
			xmlTag = "Ctrct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Contract";
			definition = "Amendment details of the registered contract for the registered contract.";
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
	public static final MMMessageAssociationEnd ContractBalance = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> RegisteredContract3.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.RegisteredContract.ContractBalance;
			isDerived = false;
			xmlTag = "CtrctBal";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContractBalance";
			definition = "Contract balance on date of contract registration.";
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
	public static final MMMessageAssociationEnd PaymentScheduleType = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> RegisteredContract3.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.RegisteredContract.PaymentScheduleType;
			isDerived = false;
			xmlTag = "PmtSchdlTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentScheduleType";
			definition = "Type of the payment schedule provided in the contract.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> PaymentScheduleType1Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Further additional information on the amendment.
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
	public static final MMMessageAttribute AdditionalInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RegisteredContract3.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Further additional information on the amendment.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max1025Text.mmObject();
		}
	};
	/**
	 * Documents provided as attachments to the contract registration amendment
	 * request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.DocumentGeneralInformation3
	 * DocumentGeneralInformation3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract#Attachment
	 * RegisteredContract.Attachment}</li>
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
	public static final MMMessageAssociationEnd Attachment = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> RegisteredContract3.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.RegisteredContract.Attachment;
			isDerived = false;
			xmlTag = "Attchmnt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Attachment";
			definition = "Documents provided as attachments to the contract registration amendment request.";
			minOccurs = 0;
			type_lazy = () -> DocumentGeneralInformation3.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Additional information that cannot be captured in the structured elements
	 * and/or any other specific block.
	 * <p>
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
	public static final MMMessageAssociationEnd SupplementaryData = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> RegisteredContract3.mmObject();
			isDerived = false;
			xmlTag = "SplmtryData";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			type_lazy = () -> SupplementaryData1.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RegisteredContract3.RegisteredContractAmendmentIdentification,
						com.tools20022.repository.msg.RegisteredContract3.OriginalRegisteredContractIdentification, com.tools20022.repository.msg.RegisteredContract3.Priority, com.tools20022.repository.msg.RegisteredContract3.Contract,
						com.tools20022.repository.msg.RegisteredContract3.ContractBalance, com.tools20022.repository.msg.RegisteredContract3.PaymentScheduleType, com.tools20022.repository.msg.RegisteredContract3.AdditionalInformation,
						com.tools20022.repository.msg.RegisteredContract3.Attachment, com.tools20022.repository.msg.RegisteredContract3.SupplementaryData);
				trace_lazy = () -> RegisteredContract.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RegisteredContract3";
				definition = "Document that a user must file with an authorized servicer for each contract that involves foreign currency transactions with non residents.";
			}
		});
		return mmObject_lazy.get();
	}
}