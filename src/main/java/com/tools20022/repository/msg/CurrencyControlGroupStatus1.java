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
import com.tools20022.repository.area.auth.CurrencyControlStatusAdviceV01;
import com.tools20022.repository.choice.Period4Choice;
import com.tools20022.repository.codeset.StatisticalReportingStatus1Code;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.entity.PaymentStatus;
import com.tools20022.repository.entity.RegisteredContract;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5;
import com.tools20022.repository.msg.OriginalMessage3;
import com.tools20022.repository.msg.TradeParty2;
import com.tools20022.repository.msg.ValidationStatusReason1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.msg.CurrencyControlGroupStatus1#mmOriginalReferences
 * CurrencyControlGroupStatus1.mmOriginalReferences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyControlGroupStatus1#mmReportingParty
 * CurrencyControlGroupStatus1.mmReportingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyControlGroupStatus1#mmRegistrationAgent
 * CurrencyControlGroupStatus1.mmRegistrationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyControlGroupStatus1#mmReportingPeriod
 * CurrencyControlGroupStatus1.mmReportingPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyControlGroupStatus1#mmStatus
 * CurrencyControlGroupStatus1.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyControlGroupStatus1#mmStatusReason
 * CurrencyControlGroupStatus1.mmStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyControlGroupStatus1#mmStatusDateTime
 * CurrencyControlGroupStatus1.mmStatusDateTime}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Status Status}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.CurrencyControlStatusAdviceV01#mmGroupStatus
 * CurrencyControlStatusAdviceV01.mmGroupStatus}</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CurrencyControlGroupStatus1", propOrder = {"originalReferences", "reportingParty", "registrationAgent", "reportingPeriod", "status", "statusReason", "statusDateTime"})
public class CurrencyControlGroupStatus1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "OrgnlRefs", required = true)
	protected OriginalMessage3 originalReferences;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OriginalMessage3
	 * OriginalMessage3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmPaymentExecution
	 * Payment.mmPaymentExecution}</li>
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
	public static final MMMessageAssociationEnd<CurrencyControlGroupStatus1, OriginalMessage3> mmOriginalReferences = new MMMessageAssociationEnd<CurrencyControlGroupStatus1, OriginalMessage3>() {
		{
			businessElementTrace_lazy = () -> Payment.mmPaymentExecution;
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrencyControlGroupStatus1.mmObject();
			isDerived = false;
			xmlTag = "OrgnlRefs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalReferences";
			definition = "Original underlying message references for which the status advice is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> OriginalMessage3.mmObject();
		}

		@Override
		public OriginalMessage3 getValue(CurrencyControlGroupStatus1 obj) {
			return obj.getOriginalReferences();
		}

		@Override
		public void setValue(CurrencyControlGroupStatus1 obj, OriginalMessage3 value) {
			obj.setOriginalReferences(value);
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
	public static final MMMessageAssociationEnd<CurrencyControlGroupStatus1, TradeParty2> mmReportingParty = new MMMessageAssociationEnd<CurrencyControlGroupStatus1, TradeParty2>() {
		{
			businessElementTrace_lazy = () -> RegisteredContract.mmReportingParty;
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrencyControlGroupStatus1.mmObject();
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
		public TradeParty2 getValue(CurrencyControlGroupStatus1 obj) {
			return obj.getReportingParty();
		}

		@Override
		public void setValue(CurrencyControlGroupStatus1 obj, TradeParty2 value) {
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
	public static final MMMessageAssociationEnd<CurrencyControlGroupStatus1, BranchAndFinancialInstitutionIdentification5> mmRegistrationAgent = new MMMessageAssociationEnd<CurrencyControlGroupStatus1, BranchAndFinancialInstitutionIdentification5>() {
		{
			businessElementTrace_lazy = () -> RegisteredContract.mmRegistrationAgent;
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrencyControlGroupStatus1.mmObject();
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
		public BranchAndFinancialInstitutionIdentification5 getValue(CurrencyControlGroupStatus1 obj) {
			return obj.getRegistrationAgent();
		}

		@Override
		public void setValue(CurrencyControlGroupStatus1 obj, BranchAndFinancialInstitutionIdentification5 value) {
			obj.setRegistrationAgent(value);
		}
	};
	@XmlElement(name = "RptgPrd")
	protected Period4Choice reportingPeriod;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<CurrencyControlGroupStatus1, Optional<Period4Choice>> mmReportingPeriod = new MMMessageAssociationEnd<CurrencyControlGroupStatus1, Optional<Period4Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrencyControlGroupStatus1.mmObject();
			isDerived = false;
			xmlTag = "RptgPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportingPeriod";
			definition = "For daily reporting this is the day to which the transaction data in the status message refers to.\r\nFor periodic reporting this is the first and the last day to which the transaction data in the status message refers.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period4Choice.mmObject();
		}

		@Override
		public Optional<Period4Choice> getValue(CurrencyControlGroupStatus1 obj) {
			return obj.getReportingPeriod();
		}

		@Override
		public void setValue(CurrencyControlGroupStatus1 obj, Optional<Period4Choice> value) {
			obj.setReportingPeriod(value.orElse(null));
		}
	};
	@XmlElement(name = "Sts")
	protected StatisticalReportingStatus1Code status;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.Status#mmStatusDescription
	 * Status.mmStatusDescription}</li>
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
	public static final MMMessageAttribute<CurrencyControlGroupStatus1, Optional<StatisticalReportingStatus1Code>> mmStatus = new MMMessageAttribute<CurrencyControlGroupStatus1, Optional<StatisticalReportingStatus1Code>>() {
		{
			businessElementTrace_lazy = () -> Status.mmStatusDescription;
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrencyControlGroupStatus1.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Provides the status for the full report.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> StatisticalReportingStatus1Code.mmObject();
		}

		@Override
		public Optional<StatisticalReportingStatus1Code> getValue(CurrencyControlGroupStatus1 obj) {
			return obj.getStatus();
		}

		@Override
		public void setValue(CurrencyControlGroupStatus1 obj, Optional<StatisticalReportingStatus1Code> value) {
			obj.setStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "StsRsn")
	protected List<ValidationStatusReason1> statusReason;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<CurrencyControlGroupStatus1, List<ValidationStatusReason1>> mmStatusReason = new MMMessageAssociationEnd<CurrencyControlGroupStatus1, List<ValidationStatusReason1>>() {
		{
			businessComponentTrace_lazy = () -> PaymentStatus.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrencyControlGroupStatus1.mmObject();
			isDerived = false;
			xmlTag = "StsRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusReason";
			definition = "Provides detailed information on the status reason.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ValidationStatusReason1.mmObject();
		}

		@Override
		public List<ValidationStatusReason1> getValue(CurrencyControlGroupStatus1 obj) {
			return obj.getStatusReason();
		}

		@Override
		public void setValue(CurrencyControlGroupStatus1 obj, List<ValidationStatusReason1> value) {
			obj.setStatusReason(value);
		}
	};
	@XmlElement(name = "StsDtTm")
	protected ISODateTime statusDateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmStatusDateTime
	 * Status.mmStatusDateTime}</li>
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
	public static final MMMessageAttribute<CurrencyControlGroupStatus1, Optional<ISODateTime>> mmStatusDateTime = new MMMessageAttribute<CurrencyControlGroupStatus1, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> Status.mmStatusDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrencyControlGroupStatus1.mmObject();
			isDerived = false;
			xmlTag = "StsDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusDateTime";
			definition = "Provides the date and time when the status was issued.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(CurrencyControlGroupStatus1 obj) {
			return obj.getStatusDateTime();
		}

		@Override
		public void setValue(CurrencyControlGroupStatus1 obj, Optional<ISODateTime> value) {
			obj.setStatusDateTime(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CurrencyControlGroupStatus1.mmOriginalReferences, com.tools20022.repository.msg.CurrencyControlGroupStatus1.mmReportingParty,
						com.tools20022.repository.msg.CurrencyControlGroupStatus1.mmRegistrationAgent, com.tools20022.repository.msg.CurrencyControlGroupStatus1.mmReportingPeriod,
						com.tools20022.repository.msg.CurrencyControlGroupStatus1.mmStatus, com.tools20022.repository.msg.CurrencyControlGroupStatus1.mmStatusReason,
						com.tools20022.repository.msg.CurrencyControlGroupStatus1.mmStatusDateTime);
				messageBuildingBlock_lazy = () -> Arrays.asList(CurrencyControlStatusAdviceV01.mmGroupStatus);
				trace_lazy = () -> Status.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CurrencyControlGroupStatus1";
				definition = "Provides the currency control group status details.";
			}
		});
		return mmObject_lazy.get();
	}

	public OriginalMessage3 getOriginalReferences() {
		return originalReferences;
	}

	public CurrencyControlGroupStatus1 setOriginalReferences(OriginalMessage3 originalReferences) {
		this.originalReferences = Objects.requireNonNull(originalReferences);
		return this;
	}

	public TradeParty2 getReportingParty() {
		return reportingParty;
	}

	public CurrencyControlGroupStatus1 setReportingParty(TradeParty2 reportingParty) {
		this.reportingParty = Objects.requireNonNull(reportingParty);
		return this;
	}

	public BranchAndFinancialInstitutionIdentification5 getRegistrationAgent() {
		return registrationAgent;
	}

	public CurrencyControlGroupStatus1 setRegistrationAgent(BranchAndFinancialInstitutionIdentification5 registrationAgent) {
		this.registrationAgent = Objects.requireNonNull(registrationAgent);
		return this;
	}

	public Optional<Period4Choice> getReportingPeriod() {
		return reportingPeriod == null ? Optional.empty() : Optional.of(reportingPeriod);
	}

	public CurrencyControlGroupStatus1 setReportingPeriod(Period4Choice reportingPeriod) {
		this.reportingPeriod = reportingPeriod;
		return this;
	}

	public Optional<StatisticalReportingStatus1Code> getStatus() {
		return status == null ? Optional.empty() : Optional.of(status);
	}

	public CurrencyControlGroupStatus1 setStatus(StatisticalReportingStatus1Code status) {
		this.status = status;
		return this;
	}

	public List<ValidationStatusReason1> getStatusReason() {
		return statusReason == null ? statusReason = new ArrayList<>() : statusReason;
	}

	public CurrencyControlGroupStatus1 setStatusReason(List<ValidationStatusReason1> statusReason) {
		this.statusReason = Objects.requireNonNull(statusReason);
		return this;
	}

	public Optional<ISODateTime> getStatusDateTime() {
		return statusDateTime == null ? Optional.empty() : Optional.of(statusDateTime);
	}

	public CurrencyControlGroupStatus1 setStatusDateTime(ISODateTime statusDateTime) {
		this.statusDateTime = statusDateTime;
		return this;
	}
}