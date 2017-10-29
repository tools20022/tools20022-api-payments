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
import com.tools20022.repository.choice.Period4Choice;
import com.tools20022.repository.codeset.StatisticalReportingStatus1Code;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.entity.PaymentStatus;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides the currency control group status details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyControlGroupStatus1#OriginalReferences
 * CurrencyControlGroupStatus1.OriginalReferences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyControlGroupStatus1#ReportingParty
 * CurrencyControlGroupStatus1.ReportingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyControlGroupStatus1#RegistrationAgent
 * CurrencyControlGroupStatus1.RegistrationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyControlGroupStatus1#ReportingPeriod
 * CurrencyControlGroupStatus1.ReportingPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyControlGroupStatus1#Status
 * CurrencyControlGroupStatus1.Status}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyControlGroupStatus1#StatusReason
 * CurrencyControlGroupStatus1.StatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyControlGroupStatus1#StatusDateTime
 * CurrencyControlGroupStatus1.StatusDateTime}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Status Status}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.CurrencyControlStatusAdviceV01#GroupStatus
 * CurrencyControlStatusAdviceV01.GroupStatus}</li>
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
 * "CurrencyControlGroupStatus1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides the currency control group status details."</li>
 * </ul>
 */
public class CurrencyControlGroupStatus1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Original underlying message references for which the status advice is
	 * provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OriginalMessage3
	 * OriginalMessage3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#PaymentExecution
	 * Payment.PaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyControlGroupStatus1
	 * CurrencyControlGroupStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlRefs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalReferences"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Original underlying message references for which the status advice is provided."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd OriginalReferences = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CurrencyControlGroupStatus1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Payment.PaymentExecution;
			isDerived = false;
			xmlTag = "OrgnlRefs";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalReferences";
			definition = "Original underlying message references for which the status advice is provided.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> OriginalMessage3.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Party registering the currency control contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TradeParty2
	 * TradeParty2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract#ReportingParty
	 * RegisteredContract.ReportingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyControlGroupStatus1
	 * CurrencyControlGroupStatus1}</li>
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
	public static final MMMessageAssociationEnd ReportingParty = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CurrencyControlGroupStatus1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.RegisteredContract.ReportingParty;
			isDerived = false;
			xmlTag = "RptgPty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportingParty";
			definition = "Party registering the currency control contract.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> TradeParty2.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Agent which registers the currency control contract.
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyControlGroupStatus1
	 * CurrencyControlGroupStatus1}</li>
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
	public static final MMMessageAssociationEnd RegistrationAgent = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CurrencyControlGroupStatus1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.RegisteredContract.RegistrationAgent;
			isDerived = false;
			xmlTag = "RegnAgt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationAgent";
			definition = "Agent which registers the currency control contract.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification5.mmObject();
			isComposite = true;
		}
	};
	/**
	 * For daily reporting this is the day to which the transaction data in the
	 * status message refers to.<br>
	 * For periodic reporting this is the first and the last day to which the
	 * transaction data in the status message refers.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Period4Choice
	 * Period4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyControlGroupStatus1
	 * CurrencyControlGroupStatus1}</li>
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
	 * "For daily reporting this is the day to which the transaction data in the status message refers to.\r\nFor periodic reporting this is the first and the last day to which the transaction data in the status message refers."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd ReportingPeriod = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CurrencyControlGroupStatus1.mmObject();
			isDerived = false;
			xmlTag = "RptgPrd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportingPeriod";
			definition = "For daily reporting this is the day to which the transaction data in the status message refers to.\r\nFor periodic reporting this is the first and the last day to which the transaction data in the status message refers.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Period4Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Provides the status for the full report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.StatisticalReportingStatus1Code
	 * StatisticalReportingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#StatusDescription
	 * Status.StatusDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyControlGroupStatus1
	 * CurrencyControlGroupStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the status for the full report."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute Status = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CurrencyControlGroupStatus1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Status.StatusDescription;
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Provides the status for the full report.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> StatisticalReportingStatus1Code.mmObject();
		}
	};
	/**
	 * Provides detailed information on the status reason.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ValidationStatusReason1
	 * ValidationStatusReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus PaymentStatus}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyControlGroupStatus1
	 * CurrencyControlGroupStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StsRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides detailed information on the status reason."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd StatusReason = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CurrencyControlGroupStatus1.mmObject();
			businessComponentTrace_lazy = () -> PaymentStatus.mmObject();
			isDerived = false;
			xmlTag = "StsRsn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusReason";
			definition = "Provides detailed information on the status reason.";
			minOccurs = 0;
			type_lazy = () -> ValidationStatusReason1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Provides the date and time when the status was issued.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#StatusDateTime
	 * Status.StatusDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyControlGroupStatus1
	 * CurrencyControlGroupStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StsDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the date and time when the status was issued."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute StatusDateTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CurrencyControlGroupStatus1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Status.StatusDateTime;
			isDerived = false;
			xmlTag = "StsDtTm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusDateTime";
			definition = "Provides the date and time when the status was issued.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CurrencyControlGroupStatus1.OriginalReferences, com.tools20022.repository.msg.CurrencyControlGroupStatus1.ReportingParty,
						com.tools20022.repository.msg.CurrencyControlGroupStatus1.RegistrationAgent, com.tools20022.repository.msg.CurrencyControlGroupStatus1.ReportingPeriod,
						com.tools20022.repository.msg.CurrencyControlGroupStatus1.Status, com.tools20022.repository.msg.CurrencyControlGroupStatus1.StatusReason, com.tools20022.repository.msg.CurrencyControlGroupStatus1.StatusDateTime);
				trace_lazy = () -> com.tools20022.repository.entity.Status.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.auth.CurrencyControlStatusAdviceV01.GroupStatus);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CurrencyControlGroupStatus1";
				definition = "Provides the currency control group status details.";
			}
		});
		return mmObject_lazy.get();
	}
}