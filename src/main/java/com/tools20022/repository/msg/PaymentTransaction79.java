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
import com.tools20022.repository.choice.Party12Choice;
import com.tools20022.repository.codeset.CancellationIndividualStatus1Code;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides further details on the reference and status on the original
 * transactions, included in the original instruction, to which the cancellation
 * request message applies.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79#mmCancellationStatusIdentification
 * PaymentTransaction79.mmCancellationStatusIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79#mmResolvedCase
 * PaymentTransaction79.mmResolvedCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79#mmOriginalGroupInformation
 * PaymentTransaction79.mmOriginalGroupInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79#mmOriginalInstructionIdentification
 * PaymentTransaction79.mmOriginalInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79#mmOriginalEndToEndIdentification
 * PaymentTransaction79.mmOriginalEndToEndIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79#mmOriginalTransactionIdentification
 * PaymentTransaction79.mmOriginalTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79#mmOriginalClearingSystemReference
 * PaymentTransaction79.mmOriginalClearingSystemReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79#mmTransactionCancellationStatus
 * PaymentTransaction79.mmTransactionCancellationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79#mmCancellationStatusReasonInformation
 * PaymentTransaction79.mmCancellationStatusReasonInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79#mmResolutionRelatedInformation
 * PaymentTransaction79.mmResolutionRelatedInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79#mmOriginalInterbankSettlementAmount
 * PaymentTransaction79.mmOriginalInterbankSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79#mmOriginalInterbankSettlementDate
 * PaymentTransaction79.mmOriginalInterbankSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79#mmAssigner
 * PaymentTransaction79.mmAssigner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79#mmAssignee
 * PaymentTransaction79.mmAssignee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79#mmOriginalTransactionReference
 * PaymentTransaction79.mmOriginalTransactionReference}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
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
 * "PaymentTransaction79"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides further details on the reference and status on the original transactions, included in the original instruction, to which the cancellation request message applies."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PaymentTransaction79", propOrder = {"cancellationStatusIdentification", "resolvedCase", "originalGroupInformation", "originalInstructionIdentification", "originalEndToEndIdentification",
		"originalTransactionIdentification", "originalClearingSystemReference", "transactionCancellationStatus", "cancellationStatusReasonInformation", "resolutionRelatedInformation", "originalInterbankSettlementAmount",
		"originalInterbankSettlementDate", "assigner", "assignee", "originalTransactionReference"})
public class PaymentTransaction79 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CxlStsId")
	protected Max35Text cancellationStatusIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79
	 * PaymentTransaction79}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlStsId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationStatusIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier of a cancellation request status, as assigned by the assigner.\n\nUsage: The cancellation status identification can be used for reconciliation or to link tasks relating to the cancellation request."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCancellationStatusIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTransaction79.mmObject();
			isDerived = false;
			xmlTag = "CxlStsId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationStatusIdentification";
			definition = "Unique and unambiguous identifier of a cancellation request status, as assigned by the assigner.\n\nUsage: The cancellation status identification can be used for reconciliation or to link tasks relating to the cancellation request.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "RslvdCase")
	protected Case3 resolvedCase;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Case3 Case3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmRelatedInvestigationCase
	 * Payment.mmRelatedInvestigationCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79
	 * PaymentTransaction79}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RslvdCase"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResolvedCase"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the resolved case."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmResolvedCase = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Payment.mmRelatedInvestigationCase;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTransaction79.mmObject();
			isDerived = false;
			xmlTag = "RslvdCase";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResolvedCase";
			definition = "Identifies the resolved case.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Case3.mmObject();
		}
	};
	@XmlElement(name = "OrgnlGrpInf")
	protected OriginalGroupInformation3 originalGroupInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation3
	 * OriginalGroupInformation3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmPaymentExecution
	 * Payment.mmPaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79
	 * PaymentTransaction79}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlGrpInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalGroupInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides information on the original message."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOriginalGroupInformation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Payment.mmPaymentExecution;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTransaction79.mmObject();
			isDerived = false;
			xmlTag = "OrgnlGrpInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalGroupInformation";
			definition = "Provides information on the original message.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.OriginalGroupInformation3.mmObject();
		}
	};
	@XmlElement(name = "OrgnlInstrId")
	protected Max35Text originalInstructionIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmInstructionIdentification
	 * PaymentIdentification.mmInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79
	 * PaymentTransaction79}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlInstrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalInstructionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification, as assigned by the original instructing party for the original instructed party, to unambiguously identify the original instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalInstructionIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentIdentification.mmInstructionIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTransaction79.mmObject();
			isDerived = false;
			xmlTag = "OrgnlInstrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalInstructionIdentification";
			definition = "Unique identification, as assigned by the original instructing party for the original instructed party, to unambiguously identify the original instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "OrgnlEndToEndId")
	protected Max35Text originalEndToEndIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmEndToEndIdentification
	 * PaymentIdentification.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79
	 * PaymentTransaction79}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlEndToEndId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalEndToEndIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification, as assigned by the original initiating party, to unambiguously identify the original transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalEndToEndIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentIdentification.mmEndToEndIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTransaction79.mmObject();
			isDerived = false;
			xmlTag = "OrgnlEndToEndId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalEndToEndIdentification";
			definition = "Unique identification, as assigned by the original initiating party, to unambiguously identify the original transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "OrgnlTxId")
	protected Max35Text originalTransactionIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmTransactionIdentification
	 * PaymentIdentification.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79
	 * PaymentTransaction79}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlTxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification, as assigned by the original first instructing agent, to unambiguously identify the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalTransactionIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentIdentification.mmTransactionIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTransaction79.mmObject();
			isDerived = false;
			xmlTag = "OrgnlTxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalTransactionIdentification";
			definition = "Unique identification, as assigned by the original first instructing agent, to unambiguously identify the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "OrgnlClrSysRef")
	protected Max35Text originalClearingSystemReference;
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
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmClearingSystemReference
	 * PaymentIdentification.mmClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79
	 * PaymentTransaction79}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlClrSysRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalClearingSystemReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique reference, as assigned by the original clearing system, to unambiguously identify the original instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalClearingSystemReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentIdentification.mmClearingSystemReference;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTransaction79.mmObject();
			isDerived = false;
			xmlTag = "OrgnlClrSysRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalClearingSystemReference";
			definition = "Unique reference, as assigned by the original clearing system, to unambiguously identify the original instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "TxCxlSts")
	protected CancellationIndividualStatus1Code transactionCancellationStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationIndividualStatus1Code
	 * CancellationIndividualStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmPaymentStatus
	 * Payment.mmPaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79
	 * PaymentTransaction79}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxCxlSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionCancellationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the status of the transaction cancellation request."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionCancellationStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Payment.mmPaymentStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTransaction79.mmObject();
			isDerived = false;
			xmlTag = "TxCxlSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionCancellationStatus";
			definition = "Specifies the status of the transaction cancellation request.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CancellationIndividualStatus1Code.mmObject();
		}
	};
	@XmlElement(name = "CxlStsRsnInf")
	protected List<com.tools20022.repository.msg.CancellationStatusReason2> cancellationStatusReasonInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CancellationStatusReason2
	 * CancellationStatusReason2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestigationCase#mmStatus
	 * InvestigationCase.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79
	 * PaymentTransaction79}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlStsRsnInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationStatusReasonInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides detailed information on the cancellation status reason."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCancellationStatusReasonInformation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestigationCase.mmStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTransaction79.mmObject();
			isDerived = false;
			xmlTag = "CxlStsRsnInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationStatusReasonInformation";
			definition = "Provides detailed information on the cancellation status reason.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CancellationStatusReason2.mmObject();
		}
	};
	@XmlElement(name = "RsltnRltdInf")
	protected ResolutionInformation1 resolutionRelatedInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ResolutionInformation1
	 * ResolutionInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#mmSettlementInstruction
	 * PaymentInstruction.mmSettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79
	 * PaymentTransaction79}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RsltnRltdInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResolutionRelatedInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference of a return or a reversal transaction that is initiated to fix the case under investigation as part of the resolution."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmResolutionRelatedInformation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentInstruction.mmSettlementInstruction;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTransaction79.mmObject();
			isDerived = false;
			xmlTag = "RsltnRltdInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResolutionRelatedInformation";
			definition = "Reference of a return or a reversal transaction that is initiated to fix the case under investigation as part of the resolution.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ResolutionInformation1.mmObject();
		}
	};
	@XmlElement(name = "OrgnlIntrBkSttlmAmt")
	protected ActiveOrHistoricCurrencyAndAmount originalInterbankSettlementAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmInterbankSettlementAmount
	 * CashSettlement.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79
	 * PaymentTransaction79}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlIntrBkSttlmAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalInterbankSettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money, as provided in the original transaction, to be moved between the instructing agent and the instructed agent."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalInterbankSettlementAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CashSettlement.mmInterbankSettlementAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTransaction79.mmObject();
			isDerived = false;
			xmlTag = "OrgnlIntrBkSttlmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalInterbankSettlementAmount";
			definition = "Amount of money, as provided in the original transaction, to be moved between the instructing agent and the instructed agent.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "OrgnlIntrBkSttlmDt")
	protected ISODate originalInterbankSettlementDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmInterbankSettlementDate
	 * CashSettlement.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79
	 * PaymentTransaction79}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlIntrBkSttlmDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalInterbankSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date, as provided in the original transaction, on which the amount of money ceases to be available to the agent that owes it and when the amount of money becomes available to the agent to which it is due."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalInterbankSettlementDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CashSettlement.mmInterbankSettlementDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTransaction79.mmObject();
			isDerived = false;
			xmlTag = "OrgnlIntrBkSttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalInterbankSettlementDate";
			definition = "Date, as provided in the original transaction, on which the amount of money ceases to be available to the agent that owes it and when the amount of money becomes available to the agent to which it is due.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	@XmlElement(name = "Assgnr")
	protected Party12Choice assigner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Party12Choice
	 * Party12Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79
	 * PaymentTransaction79}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Assgnr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Assigner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party who assigns the case.\nUsage: This is also the agent that instructs the next party in the chain to carry out the (set of) cancellation request(s)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAssigner = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTransaction79.mmObject();
			isDerived = false;
			xmlTag = "Assgnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assigner";
			definition = "Party who assigns the case.\nUsage: This is also the agent that instructs the next party in the chain to carry out the (set of) cancellation request(s).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Party12Choice.mmObject();
		}
	};
	@XmlElement(name = "Assgne")
	protected Party12Choice assignee;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Party12Choice
	 * Party12Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79
	 * PaymentTransaction79}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Assgne"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Assignee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party to which the case is assigned.\nUsage: This is also the agent that is instructed by the previous party in the chain to carry out the (set of) cancellation request(s)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAssignee = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTransaction79.mmObject();
			isDerived = false;
			xmlTag = "Assgne";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assignee";
			definition = "Party to which the case is assigned.\nUsage: This is also the agent that is instructed by the previous party in the chain to carry out the (set of) cancellation request(s).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Party12Choice.mmObject();
		}
	};
	@XmlElement(name = "OrgnlTxRef")
	protected OriginalTransactionReference24 originalTransactionReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference24
	 * OriginalTransactionReference24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79
	 * PaymentTransaction79}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlTxRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalTransactionReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Key elements used to identify the original transaction that is being referred to."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOriginalTransactionReference = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Payment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTransaction79.mmObject();
			isDerived = false;
			xmlTag = "OrgnlTxRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalTransactionReference";
			definition = "Key elements used to identify the original transaction that is being referred to.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.OriginalTransactionReference24.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentTransaction79.mmCancellationStatusIdentification, com.tools20022.repository.msg.PaymentTransaction79.mmResolvedCase,
						com.tools20022.repository.msg.PaymentTransaction79.mmOriginalGroupInformation, com.tools20022.repository.msg.PaymentTransaction79.mmOriginalInstructionIdentification,
						com.tools20022.repository.msg.PaymentTransaction79.mmOriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentTransaction79.mmOriginalTransactionIdentification,
						com.tools20022.repository.msg.PaymentTransaction79.mmOriginalClearingSystemReference, com.tools20022.repository.msg.PaymentTransaction79.mmTransactionCancellationStatus,
						com.tools20022.repository.msg.PaymentTransaction79.mmCancellationStatusReasonInformation, com.tools20022.repository.msg.PaymentTransaction79.mmResolutionRelatedInformation,
						com.tools20022.repository.msg.PaymentTransaction79.mmOriginalInterbankSettlementAmount, com.tools20022.repository.msg.PaymentTransaction79.mmOriginalInterbankSettlementDate,
						com.tools20022.repository.msg.PaymentTransaction79.mmAssigner, com.tools20022.repository.msg.PaymentTransaction79.mmAssignee, com.tools20022.repository.msg.PaymentTransaction79.mmOriginalTransactionReference);
				trace_lazy = () -> Payment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentTransaction79";
				definition = "Provides further details on the reference and status on the original transactions, included in the original instruction, to which the cancellation request message applies.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getCancellationStatusIdentification() {
		return cancellationStatusIdentification == null ? Optional.empty() : Optional.of(cancellationStatusIdentification);
	}

	public PaymentTransaction79 setCancellationStatusIdentification(Max35Text cancellationStatusIdentification) {
		this.cancellationStatusIdentification = cancellationStatusIdentification;
		return this;
	}

	public Optional<Case3> getResolvedCase() {
		return resolvedCase == null ? Optional.empty() : Optional.of(resolvedCase);
	}

	public PaymentTransaction79 setResolvedCase(com.tools20022.repository.msg.Case3 resolvedCase) {
		this.resolvedCase = resolvedCase;
		return this;
	}

	public Optional<OriginalGroupInformation3> getOriginalGroupInformation() {
		return originalGroupInformation == null ? Optional.empty() : Optional.of(originalGroupInformation);
	}

	public PaymentTransaction79 setOriginalGroupInformation(com.tools20022.repository.msg.OriginalGroupInformation3 originalGroupInformation) {
		this.originalGroupInformation = originalGroupInformation;
		return this;
	}

	public Optional<Max35Text> getOriginalInstructionIdentification() {
		return originalInstructionIdentification == null ? Optional.empty() : Optional.of(originalInstructionIdentification);
	}

	public PaymentTransaction79 setOriginalInstructionIdentification(Max35Text originalInstructionIdentification) {
		this.originalInstructionIdentification = originalInstructionIdentification;
		return this;
	}

	public Optional<Max35Text> getOriginalEndToEndIdentification() {
		return originalEndToEndIdentification == null ? Optional.empty() : Optional.of(originalEndToEndIdentification);
	}

	public PaymentTransaction79 setOriginalEndToEndIdentification(Max35Text originalEndToEndIdentification) {
		this.originalEndToEndIdentification = originalEndToEndIdentification;
		return this;
	}

	public Optional<Max35Text> getOriginalTransactionIdentification() {
		return originalTransactionIdentification == null ? Optional.empty() : Optional.of(originalTransactionIdentification);
	}

	public PaymentTransaction79 setOriginalTransactionIdentification(Max35Text originalTransactionIdentification) {
		this.originalTransactionIdentification = originalTransactionIdentification;
		return this;
	}

	public Optional<Max35Text> getOriginalClearingSystemReference() {
		return originalClearingSystemReference == null ? Optional.empty() : Optional.of(originalClearingSystemReference);
	}

	public PaymentTransaction79 setOriginalClearingSystemReference(Max35Text originalClearingSystemReference) {
		this.originalClearingSystemReference = originalClearingSystemReference;
		return this;
	}

	public Optional<CancellationIndividualStatus1Code> getTransactionCancellationStatus() {
		return transactionCancellationStatus == null ? Optional.empty() : Optional.of(transactionCancellationStatus);
	}

	public PaymentTransaction79 setTransactionCancellationStatus(CancellationIndividualStatus1Code transactionCancellationStatus) {
		this.transactionCancellationStatus = transactionCancellationStatus;
		return this;
	}

	public List<CancellationStatusReason2> getCancellationStatusReasonInformation() {
		return cancellationStatusReasonInformation == null ? cancellationStatusReasonInformation = new ArrayList<>() : cancellationStatusReasonInformation;
	}

	public PaymentTransaction79 setCancellationStatusReasonInformation(List<com.tools20022.repository.msg.CancellationStatusReason2> cancellationStatusReasonInformation) {
		this.cancellationStatusReasonInformation = Objects.requireNonNull(cancellationStatusReasonInformation);
		return this;
	}

	public Optional<ResolutionInformation1> getResolutionRelatedInformation() {
		return resolutionRelatedInformation == null ? Optional.empty() : Optional.of(resolutionRelatedInformation);
	}

	public PaymentTransaction79 setResolutionRelatedInformation(com.tools20022.repository.msg.ResolutionInformation1 resolutionRelatedInformation) {
		this.resolutionRelatedInformation = resolutionRelatedInformation;
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyAndAmount> getOriginalInterbankSettlementAmount() {
		return originalInterbankSettlementAmount == null ? Optional.empty() : Optional.of(originalInterbankSettlementAmount);
	}

	public PaymentTransaction79 setOriginalInterbankSettlementAmount(ActiveOrHistoricCurrencyAndAmount originalInterbankSettlementAmount) {
		this.originalInterbankSettlementAmount = originalInterbankSettlementAmount;
		return this;
	}

	public Optional<ISODate> getOriginalInterbankSettlementDate() {
		return originalInterbankSettlementDate == null ? Optional.empty() : Optional.of(originalInterbankSettlementDate);
	}

	public PaymentTransaction79 setOriginalInterbankSettlementDate(ISODate originalInterbankSettlementDate) {
		this.originalInterbankSettlementDate = originalInterbankSettlementDate;
		return this;
	}

	public Optional<Party12Choice> getAssigner() {
		return assigner == null ? Optional.empty() : Optional.of(assigner);
	}

	public PaymentTransaction79 setAssigner(Party12Choice assigner) {
		this.assigner = assigner;
		return this;
	}

	public Optional<Party12Choice> getAssignee() {
		return assignee == null ? Optional.empty() : Optional.of(assignee);
	}

	public PaymentTransaction79 setAssignee(Party12Choice assignee) {
		this.assignee = assignee;
		return this;
	}

	public Optional<OriginalTransactionReference24> getOriginalTransactionReference() {
		return originalTransactionReference == null ? Optional.empty() : Optional.of(originalTransactionReference);
	}

	public PaymentTransaction79 setOriginalTransactionReference(com.tools20022.repository.msg.OriginalTransactionReference24 originalTransactionReference) {
		this.originalTransactionReference = originalTransactionReference;
		return this;
	}
}