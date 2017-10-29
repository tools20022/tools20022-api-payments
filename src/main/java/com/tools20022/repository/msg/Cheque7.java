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
import com.tools20022.repository.choice.ChequeDeliveryMethod1Choice;
import com.tools20022.repository.codeset.ChequeType2Code;
import com.tools20022.repository.codeset.Priority2Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.entity.ChequeIssue;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Set of characteristics related to a cheque instruction, such as cheque type
 * or cheque number.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Cheque7#ChequeType
 * Cheque7.ChequeType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Cheque7#ChequeNumber
 * Cheque7.ChequeNumber}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Cheque7#ChequeFrom
 * Cheque7.ChequeFrom}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Cheque7#DeliveryMethod
 * Cheque7.DeliveryMethod}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Cheque7#DeliverTo
 * Cheque7.DeliverTo}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Cheque7#InstructionPriority
 * Cheque7.InstructionPriority}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Cheque7#ChequeMaturityDate
 * Cheque7.ChequeMaturityDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Cheque7#FormsCode
 * Cheque7.FormsCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Cheque7#MemoField
 * Cheque7.MemoField}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Cheque7#RegionalClearingZone
 * Cheque7.RegionalClearingZone}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Cheque7#PrintLocation
 * Cheque7.PrintLocation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Cheque7#Signature
 * Cheque7.Signature}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.ChequeIssue
 * ChequeIssue}</li>
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
 * "Cheque7"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of characteristics related to a cheque instruction, such as cheque type or cheque number."
 * </li>
 * </ul>
 */
public class Cheque7 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the type of cheque to be issued.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ChequeType2Code
	 * ChequeType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Cheque#ChequeType
	 * Cheque.ChequeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Cheque7
	 * Cheque7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChqTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChequeType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of cheque to be issued."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute ChequeType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Cheque7.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Cheque.ChequeType;
			isDerived = false;
			xmlTag = "ChqTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeType";
			definition = "Specifies the type of cheque to be issued.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ChequeType2Code.mmObject();
		}
	};
	/**
	 * Unique and unambiguous identifier for a cheque as assigned by the agent.
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
	 * {@linkplain com.tools20022.repository.entity.CreditInstrument#CreditInstrumentIdentification
	 * CreditInstrument.CreditInstrumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Cheque7
	 * Cheque7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChqNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChequeNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for a cheque as assigned by the agent."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute ChequeNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Cheque7.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CreditInstrument.CreditInstrumentIdentification;
			isDerived = false;
			xmlTag = "ChqNb";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeNumber";
			definition = "Unique and unambiguous identifier for a cheque as assigned by the agent.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Identifies the party that ordered the issuance of the cheque.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.NameAndAddress10
	 * NameAndAddress10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#Identification
	 * Party.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Cheque7
	 * Cheque7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChqFr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChequeFrom"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the party that ordered the issuance of the cheque."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd ChequeFrom = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Cheque7.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.Identification;
			isDerived = false;
			xmlTag = "ChqFr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeFrom";
			definition = "Identifies the party that ordered the issuance of the cheque.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> NameAndAddress10.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Specifies the delivery method of the cheque by the debtor's agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ChequeDeliveryMethod1Choice
	 * ChequeDeliveryMethod1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ChequeIssue#DeliveryMethod
	 * ChequeIssue.DeliveryMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Cheque7
	 * Cheque7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvryMtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the delivery method of the cheque by the debtor's agent."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd DeliveryMethod = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Cheque7.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.ChequeIssue.DeliveryMethod;
			isDerived = false;
			xmlTag = "DlvryMtd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveryMethod";
			definition = "Specifies the delivery method of the cheque by the debtor's agent.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> ChequeDeliveryMethod1Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Party to whom the debtor's agent needs to send the cheque.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.NameAndAddress10
	 * NameAndAddress10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ChequeIssue#DeliverTo
	 * ChequeIssue.DeliverTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Cheque7
	 * Cheque7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvrTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party to whom the debtor's agent needs to send the cheque."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd DeliverTo = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Cheque7.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.ChequeIssue.DeliverTo;
			isDerived = false;
			xmlTag = "DlvrTo";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverTo";
			definition = "Party to whom the debtor's agent needs to send the cheque.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> NameAndAddress10.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Urgency or order of importance that the originator would like the
	 * recipient of the payment instruction to apply to the processing of the
	 * payment instruction.
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
	 * {@linkplain com.tools20022.repository.entity.Payment#Priority
	 * Payment.Priority}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Cheque7
	 * Cheque7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrPrty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionPriority"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Urgency or order of importance that the originator would like the recipient of the payment instruction to apply to the processing of the payment instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute InstructionPriority = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Cheque7.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Payment.Priority;
			isDerived = false;
			xmlTag = "InstrPrty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionPriority";
			definition = "Urgency or order of importance that the originator would like the recipient of the payment instruction to apply to the processing of the payment instruction.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Priority2Code.mmObject();
		}
	};
	/**
	 * Date when the draft becomes payable and the debtor's account is debited.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Cheque#MaturityDate
	 * Cheque.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Cheque7
	 * Cheque7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChqMtrtyDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChequeMaturityDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date when the draft becomes payable and the debtor's account is debited."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute ChequeMaturityDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Cheque7.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Cheque.MaturityDate;
			isDerived = false;
			xmlTag = "ChqMtrtyDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeMaturityDate";
			definition = "Date when the draft becomes payable and the debtor's account is debited.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Identifies, in a coded form, the cheque layout, company logo and
	 * digitised signature to be used to print the cheque, as agreed between the
	 * initiating party and the debtor's agent.
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
	 * {@linkplain com.tools20022.repository.entity.Cheque#FormsCode
	 * Cheque.FormsCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Cheque7
	 * Cheque7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrmsCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FormsCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies, in a coded form, the cheque layout, company logo and digitised signature to be used to print the cheque, as agreed between the initiating party and the debtor's agent."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute FormsCode = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Cheque7.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Cheque.FormsCode;
			isDerived = false;
			xmlTag = "FrmsCd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FormsCode";
			definition = "Identifies, in a coded form, the cheque layout, company logo and digitised signature to be used to print the cheque, as agreed between the initiating party and the debtor's agent.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Information that needs to be printed on a cheque, used by the payer to
	 * add miscellaneous information.
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
	 * {@linkplain com.tools20022.repository.entity.Cheque#MemoField
	 * Cheque.MemoField}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Cheque7
	 * Cheque7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MemoFld"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MemoField"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information that needs to be printed on a cheque, used by the payer to add miscellaneous information."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute MemoField = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Cheque7.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Cheque.MemoField;
			isDerived = false;
			xmlTag = "MemoFld";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MemoField";
			definition = "Information that needs to be printed on a cheque, used by the payer to add miscellaneous information.";
			minOccurs = 0;
			maxOccurs = 2;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Regional area in which the cheque can be cleared, when a country has no
	 * nation-wide cheque clearing organisation.
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
	 * {@linkplain com.tools20022.repository.entity.Cheque#RegionalClearingZone
	 * Cheque.RegionalClearingZone}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Cheque7
	 * Cheque7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RgnlClrZone"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegionalClearingZone"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Regional area in which the cheque can be cleared, when a country has no nation-wide cheque clearing organisation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute RegionalClearingZone = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Cheque7.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Cheque.RegionalClearingZone;
			isDerived = false;
			xmlTag = "RgnlClrZone";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegionalClearingZone";
			definition = "Regional area in which the cheque can be cleared, when a country has no nation-wide cheque clearing organisation.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Specifies the print location of the cheque.
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
	 * {@linkplain com.tools20022.repository.entity.ChequeIssue#PrintLocation
	 * ChequeIssue.PrintLocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Cheque7
	 * Cheque7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtLctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrintLocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the print location of the cheque."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute PrintLocation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Cheque7.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.ChequeIssue.PrintLocation;
			isDerived = false;
			xmlTag = "PrtLctn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrintLocation";
			definition = "Specifies the print location of the cheque.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Signature to be used by the cheque servicer on a specific cheque to be
	 * printed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Signature Signature}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Cheque7
	 * Cheque7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sgntr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Signature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Signature to be used by the cheque servicer on a specific cheque to be printed."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute Signature = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Cheque7.mmObject();
			businessComponentTrace_lazy = () -> com.tools20022.repository.entity.Signature.mmObject();
			isDerived = false;
			xmlTag = "Sgntr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Signature";
			definition = "Signature to be used by the cheque servicer on a specific cheque to be printed.";
			minOccurs = 0;
			maxOccurs = 5;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Cheque7.ChequeType, com.tools20022.repository.msg.Cheque7.ChequeNumber, com.tools20022.repository.msg.Cheque7.ChequeFrom,
						com.tools20022.repository.msg.Cheque7.DeliveryMethod, com.tools20022.repository.msg.Cheque7.DeliverTo, com.tools20022.repository.msg.Cheque7.InstructionPriority,
						com.tools20022.repository.msg.Cheque7.ChequeMaturityDate, com.tools20022.repository.msg.Cheque7.FormsCode, com.tools20022.repository.msg.Cheque7.MemoField, com.tools20022.repository.msg.Cheque7.RegionalClearingZone,
						com.tools20022.repository.msg.Cheque7.PrintLocation, com.tools20022.repository.msg.Cheque7.Signature);
				trace_lazy = () -> ChequeIssue.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Cheque7";
				definition = "Set of characteristics related to a cheque instruction, such as cheque type or cheque number.";
			}
		});
		return mmObject_lazy.get();
	}
}