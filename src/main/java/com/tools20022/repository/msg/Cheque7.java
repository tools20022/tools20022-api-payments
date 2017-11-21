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
import com.tools20022.repository.choice.ChequeDeliveryMethod1Choice;
import com.tools20022.repository.codeset.ChequeType2Code;
import com.tools20022.repository.codeset.Priority2Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * <li>{@linkplain com.tools20022.repository.msg.Cheque7#mmChequeType
 * Cheque7.mmChequeType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Cheque7#mmChequeNumber
 * Cheque7.mmChequeNumber}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Cheque7#mmChequeFrom
 * Cheque7.mmChequeFrom}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Cheque7#mmDeliveryMethod
 * Cheque7.mmDeliveryMethod}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Cheque7#mmDeliverTo
 * Cheque7.mmDeliverTo}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Cheque7#mmInstructionPriority
 * Cheque7.mmInstructionPriority}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Cheque7#mmChequeMaturityDate
 * Cheque7.mmChequeMaturityDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Cheque7#mmFormsCode
 * Cheque7.mmFormsCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Cheque7#mmMemoField
 * Cheque7.mmMemoField}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Cheque7#mmRegionalClearingZone
 * Cheque7.mmRegionalClearingZone}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Cheque7#mmPrintLocation
 * Cheque7.mmPrintLocation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Cheque7#mmSignature
 * Cheque7.mmSignature}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.ChequeIssue
 * ChequeIssue}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Cheque7", propOrder = {"chequeType", "chequeNumber", "chequeFrom", "deliveryMethod", "deliverTo", "instructionPriority", "chequeMaturityDate", "formsCode", "memoField", "regionalClearingZone", "printLocation", "signature"})
public class Cheque7 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ChequeType2Code chequeType;
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
	 * {@linkplain com.tools20022.repository.entity.Cheque#mmChequeType
	 * Cheque.mmChequeType}</li>
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
	public static final MMMessageAttribute mmChequeType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Cheque.mmChequeType;
			componentContext_lazy = () -> Cheque7.mmObject();
			isDerived = false;
			xmlTag = "ChqTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeType";
			definition = "Specifies the type of cheque to be issued.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ChequeType2Code.mmObject();
		}
	};
	protected Max35Text chequeNumber;
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
	 * {@linkplain com.tools20022.repository.entity.CreditInstrument#mmCreditInstrumentIdentification
	 * CreditInstrument.mmCreditInstrumentIdentification}</li>
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
	public static final MMMessageAttribute mmChequeNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CreditInstrument.mmCreditInstrumentIdentification;
			componentContext_lazy = () -> Cheque7.mmObject();
			isDerived = false;
			xmlTag = "ChqNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeNumber";
			definition = "Unique and unambiguous identifier for a cheque as assigned by the agent.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected NameAndAddress10 chequeFrom;
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
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
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
	public static final MMMessageAssociationEnd mmChequeFrom = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> Cheque7.mmObject();
			isDerived = false;
			xmlTag = "ChqFr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeFrom";
			definition = "Identifies the party that ordered the issuance of the cheque.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.NameAndAddress10.mmObject();
		}
	};
	protected ChequeDeliveryMethod1Choice deliveryMethod;
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
	 * {@linkplain com.tools20022.repository.entity.ChequeIssue#mmDeliveryMethod
	 * ChequeIssue.mmDeliveryMethod}</li>
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
	public static final MMMessageAssociationEnd mmDeliveryMethod = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> ChequeIssue.mmDeliveryMethod;
			componentContext_lazy = () -> Cheque7.mmObject();
			isDerived = false;
			xmlTag = "DlvryMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveryMethod";
			definition = "Specifies the delivery method of the cheque by the debtor's agent.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ChequeDeliveryMethod1Choice.mmObject();
		}
	};
	protected NameAndAddress10 deliverTo;
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
	 * {@linkplain com.tools20022.repository.entity.ChequeIssue#mmDeliverTo
	 * ChequeIssue.mmDeliverTo}</li>
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
	public static final MMMessageAssociationEnd mmDeliverTo = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> ChequeIssue.mmDeliverTo;
			componentContext_lazy = () -> Cheque7.mmObject();
			isDerived = false;
			xmlTag = "DlvrTo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverTo";
			definition = "Party to whom the debtor's agent needs to send the cheque.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.NameAndAddress10.mmObject();
		}
	};
	protected Priority2Code instructionPriority;
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
	 * {@linkplain com.tools20022.repository.entity.Payment#mmPriority
	 * Payment.mmPriority}</li>
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
	public static final MMMessageAttribute mmInstructionPriority = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Payment.mmPriority;
			componentContext_lazy = () -> Cheque7.mmObject();
			isDerived = false;
			xmlTag = "InstrPrty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionPriority";
			definition = "Urgency or order of importance that the originator would like the recipient of the payment instruction to apply to the processing of the payment instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Priority2Code.mmObject();
		}
	};
	protected ISODate chequeMaturityDate;
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
	 * {@linkplain com.tools20022.repository.entity.Cheque#mmMaturityDate
	 * Cheque.mmMaturityDate}</li>
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
	public static final MMMessageAttribute mmChequeMaturityDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Cheque.mmMaturityDate;
			componentContext_lazy = () -> Cheque7.mmObject();
			isDerived = false;
			xmlTag = "ChqMtrtyDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeMaturityDate";
			definition = "Date when the draft becomes payable and the debtor's account is debited.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected Max35Text formsCode;
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
	 * {@linkplain com.tools20022.repository.entity.Cheque#mmFormsCode
	 * Cheque.mmFormsCode}</li>
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
	public static final MMMessageAttribute mmFormsCode = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Cheque.mmFormsCode;
			componentContext_lazy = () -> Cheque7.mmObject();
			isDerived = false;
			xmlTag = "FrmsCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FormsCode";
			definition = "Identifies, in a coded form, the cheque layout, company logo and digitised signature to be used to print the cheque, as agreed between the initiating party and the debtor's agent.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected List<Max35Text> memoField;
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
	 * {@linkplain com.tools20022.repository.entity.Cheque#mmMemoField
	 * Cheque.mmMemoField}</li>
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
	public static final MMMessageAttribute mmMemoField = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Cheque.mmMemoField;
			componentContext_lazy = () -> Cheque7.mmObject();
			isDerived = false;
			xmlTag = "MemoFld";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MemoField";
			definition = "Information that needs to be printed on a cheque, used by the payer to add miscellaneous information.";
			maxOccurs = 2;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text regionalClearingZone;
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
	 * {@linkplain com.tools20022.repository.entity.Cheque#mmRegionalClearingZone
	 * Cheque.mmRegionalClearingZone}</li>
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
	public static final MMMessageAttribute mmRegionalClearingZone = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Cheque.mmRegionalClearingZone;
			componentContext_lazy = () -> Cheque7.mmObject();
			isDerived = false;
			xmlTag = "RgnlClrZone";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegionalClearingZone";
			definition = "Regional area in which the cheque can be cleared, when a country has no nation-wide cheque clearing organisation.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text printLocation;
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
	 * {@linkplain com.tools20022.repository.entity.ChequeIssue#mmPrintLocation
	 * ChequeIssue.mmPrintLocation}</li>
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
	public static final MMMessageAttribute mmPrintLocation = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ChequeIssue.mmPrintLocation;
			componentContext_lazy = () -> Cheque7.mmObject();
			isDerived = false;
			xmlTag = "PrtLctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrintLocation";
			definition = "Specifies the print location of the cheque.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected List<Max70Text> signature;
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
	public static final MMMessageAttribute mmSignature = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> Signature.mmObject();
			componentContext_lazy = () -> Cheque7.mmObject();
			isDerived = false;
			xmlTag = "Sgntr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Signature";
			definition = "Signature to be used by the cheque servicer on a specific cheque to be printed.";
			maxOccurs = 5;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Cheque7.mmChequeType, Cheque7.mmChequeNumber, Cheque7.mmChequeFrom, Cheque7.mmDeliveryMethod, Cheque7.mmDeliverTo, Cheque7.mmInstructionPriority, Cheque7.mmChequeMaturityDate,
						Cheque7.mmFormsCode, Cheque7.mmMemoField, Cheque7.mmRegionalClearingZone, Cheque7.mmPrintLocation, Cheque7.mmSignature);
				trace_lazy = () -> ChequeIssue.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Cheque7";
				definition = "Set of characteristics related to a cheque instruction, such as cheque type or cheque number.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "ChqTp")
	public ChequeType2Code getChequeType() {
		return chequeType;
	}

	public void setChequeType(ChequeType2Code chequeType) {
		this.chequeType = chequeType;
	}

	@XmlElement(name = "ChqNb")
	public Max35Text getChequeNumber() {
		return chequeNumber;
	}

	public void setChequeNumber(Max35Text chequeNumber) {
		this.chequeNumber = chequeNumber;
	}

	@XmlElement(name = "ChqFr")
	public NameAndAddress10 getChequeFrom() {
		return chequeFrom;
	}

	public void setChequeFrom(com.tools20022.repository.msg.NameAndAddress10 chequeFrom) {
		this.chequeFrom = chequeFrom;
	}

	@XmlElement(name = "DlvryMtd")
	public ChequeDeliveryMethod1Choice getDeliveryMethod() {
		return deliveryMethod;
	}

	public void setDeliveryMethod(ChequeDeliveryMethod1Choice deliveryMethod) {
		this.deliveryMethod = deliveryMethod;
	}

	@XmlElement(name = "DlvrTo")
	public NameAndAddress10 getDeliverTo() {
		return deliverTo;
	}

	public void setDeliverTo(com.tools20022.repository.msg.NameAndAddress10 deliverTo) {
		this.deliverTo = deliverTo;
	}

	@XmlElement(name = "InstrPrty")
	public Priority2Code getInstructionPriority() {
		return instructionPriority;
	}

	public void setInstructionPriority(Priority2Code instructionPriority) {
		this.instructionPriority = instructionPriority;
	}

	@XmlElement(name = "ChqMtrtyDt")
	public ISODate getChequeMaturityDate() {
		return chequeMaturityDate;
	}

	public void setChequeMaturityDate(ISODate chequeMaturityDate) {
		this.chequeMaturityDate = chequeMaturityDate;
	}

	@XmlElement(name = "FrmsCd")
	public Max35Text getFormsCode() {
		return formsCode;
	}

	public void setFormsCode(Max35Text formsCode) {
		this.formsCode = formsCode;
	}

	@XmlElement(name = "MemoFld")
	public List<Max35Text> getMemoField() {
		return memoField;
	}

	public void setMemoField(List<Max35Text> memoField) {
		this.memoField = memoField;
	}

	@XmlElement(name = "RgnlClrZone")
	public Max35Text getRegionalClearingZone() {
		return regionalClearingZone;
	}

	public void setRegionalClearingZone(Max35Text regionalClearingZone) {
		this.regionalClearingZone = regionalClearingZone;
	}

	@XmlElement(name = "PrtLctn")
	public Max35Text getPrintLocation() {
		return printLocation;
	}

	public void setPrintLocation(Max35Text printLocation) {
		this.printLocation = printLocation;
	}

	@XmlElement(name = "Sgntr")
	public List<Max70Text> getSignature() {
		return signature;
	}

	public void setSignature(List<Max70Text> signature) {
		this.signature = signature;
	}
}