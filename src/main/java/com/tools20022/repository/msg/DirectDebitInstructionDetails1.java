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
import com.tools20022.repository.area.acmt.AccountSwitchCancelExistingPaymentV01;
import com.tools20022.repository.area.acmt.AccountSwitchInformationResponseV01;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PartyIdentification125;
import com.tools20022.repository.msg.TransferInstruction1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Instructions, initiated by the creditor, to debit a debtor's account in
 * favour of the creditor.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitInstructionDetails1#mmMandateIdentification
 * DirectDebitInstructionDetails1.mmMandateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitInstructionDetails1#mmAutomatedDirectDebitInstructionIndicator
 * DirectDebitInstructionDetails1.mmAutomatedDirectDebitInstructionIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitInstructionDetails1#mmDirectDebitTransferableIndicator
 * DirectDebitInstructionDetails1.mmDirectDebitTransferableIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitInstructionDetails1#mmCreditor
 * DirectDebitInstructionDetails1.mmCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitInstructionDetails1#mmLastCollectionCurrencyAmount
 * DirectDebitInstructionDetails1.mmLastCollectionCurrencyAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitInstructionDetails1#mmLastCollectionDate
 * DirectDebitInstructionDetails1.mmLastCollectionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitInstructionDetails1#mmOtherDetails
 * DirectDebitInstructionDetails1.mmOtherDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CashAccountService
 * CashAccountService}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountSwitchInformationResponseV01#mmDirectDebitInstruction
 * AccountSwitchInformationResponseV01.mmDirectDebitInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountSwitchCancelExistingPaymentV01#mmDirectDebitInstruction
 * AccountSwitchCancelExistingPaymentV01.mmDirectDebitInstruction}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DirectDebitInstructionDetails1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Instructions, initiated by the creditor, to debit a debtor's account in favour of the creditor."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DirectDebitInstructionDetails1", propOrder = {"mandateIdentification", "automatedDirectDebitInstructionIndicator", "directDebitTransferableIndicator", "creditor", "lastCollectionCurrencyAmount", "lastCollectionDate",
		"otherDetails"})
public class DirectDebitInstructionDetails1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MndtId", required = true)
	protected Max35Text mandateIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.Mandate#mmMandateIdentification
	 * Mandate.mmMandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitInstructionDetails1
	 * DirectDebitInstructionDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MndtId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MandateIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the mandate for a direct debit instruction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DirectDebitInstructionDetails1, Max35Text> mmMandateIdentification = new MMMessageAttribute<DirectDebitInstructionDetails1, Max35Text>() {
		{
			businessElementTrace_lazy = () -> Mandate.mmMandateIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.DirectDebitInstructionDetails1.mmObject();
			isDerived = false;
			xmlTag = "MndtId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MandateIdentification";
			definition = "Identification of the mandate for a direct debit instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(DirectDebitInstructionDetails1 obj) {
			return obj.getMandateIdentification();
		}

		@Override
		public void setValue(DirectDebitInstructionDetails1 obj, Max35Text value) {
			obj.setMandateIdentification(value);
		}
	};
	@XmlElement(name = "AutomtdDrctDbtInstrInd")
	protected YesNoIndicator automatedDirectDebitInstructionIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitInstructionDetails1
	 * DirectDebitInstructionDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AutomtdDrctDbtInstrInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AutomatedDirectDebitInstructionIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the instruction is an automated direct debit instruction.\r\n\r\nUsage: Default value for AutomatedDirectDebitInstructionIndicator is false."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DirectDebitInstructionDetails1, Optional<YesNoIndicator>> mmAutomatedDirectDebitInstructionIndicator = new MMMessageAttribute<DirectDebitInstructionDetails1, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DirectDebitInstructionDetails1.mmObject();
			isDerived = false;
			xmlTag = "AutomtdDrctDbtInstrInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AutomatedDirectDebitInstructionIndicator";
			definition = "Indicates whether the instruction is an automated direct debit instruction.\r\n\r\nUsage: Default value for AutomatedDirectDebitInstructionIndicator is false.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(DirectDebitInstructionDetails1 obj) {
			return obj.getAutomatedDirectDebitInstructionIndicator();
		}

		@Override
		public void setValue(DirectDebitInstructionDetails1 obj, Optional<YesNoIndicator> value) {
			obj.setAutomatedDirectDebitInstructionIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "DrctDbtTrfblInd")
	protected YesNoIndicator directDebitTransferableIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitInstructionDetails1
	 * DirectDebitInstructionDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DrctDbtTrfblInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DirectDebitTransferableIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the direct debit instruction is transferable.\r\n\r\nUsage: Default value for DirectDebitTransferableIndicator is false."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DirectDebitInstructionDetails1, Optional<YesNoIndicator>> mmDirectDebitTransferableIndicator = new MMMessageAttribute<DirectDebitInstructionDetails1, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DirectDebitInstructionDetails1.mmObject();
			isDerived = false;
			xmlTag = "DrctDbtTrfblInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DirectDebitTransferableIndicator";
			definition = "Indicates whether the direct debit instruction is transferable.\r\n\r\nUsage: Default value for DirectDebitTransferableIndicator is false.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(DirectDebitInstructionDetails1 obj) {
			return obj.getDirectDebitTransferableIndicator();
		}

		@Override
		public void setValue(DirectDebitInstructionDetails1 obj, Optional<YesNoIndicator> value) {
			obj.setDirectDebitTransferableIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "Cdtr", required = true)
	protected PartyIdentification125 creditor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification125
	 * PartyIdentification125}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CreditorRole CreditorRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitInstructionDetails1
	 * DirectDebitInstructionDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cdtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Creditor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party to which an amount of money is due."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DirectDebitInstructionDetails1, PartyIdentification125> mmCreditor = new MMMessageAssociationEnd<DirectDebitInstructionDetails1, PartyIdentification125>() {
		{
			businessComponentTrace_lazy = () -> CreditorRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.DirectDebitInstructionDetails1.mmObject();
			isDerived = false;
			xmlTag = "Cdtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Creditor";
			definition = "Party to which an amount of money is due.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification125.mmObject();
		}

		@Override
		public PartyIdentification125 getValue(DirectDebitInstructionDetails1 obj) {
			return obj.getCreditor();
		}

		@Override
		public void setValue(DirectDebitInstructionDetails1 obj, PartyIdentification125 value) {
			obj.setCreditor(value);
		}
	};
	@XmlElement(name = "LastColltnCcyAmt")
	protected ActiveOrHistoricCurrencyAndAmount lastCollectionCurrencyAmount;
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
	 * {@linkplain com.tools20022.repository.entity.StandingOrder#mmAmount
	 * StandingOrder.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitInstructionDetails1
	 * DirectDebitInstructionDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LastColltnCcyAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LastCollectionCurrencyAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of the last debit made for the direct debit mandate."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DirectDebitInstructionDetails1, Optional<ActiveOrHistoricCurrencyAndAmount>> mmLastCollectionCurrencyAmount = new MMMessageAttribute<DirectDebitInstructionDetails1, Optional<ActiveOrHistoricCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> StandingOrder.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.DirectDebitInstructionDetails1.mmObject();
			isDerived = false;
			xmlTag = "LastColltnCcyAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LastCollectionCurrencyAmount";
			definition = "Amount of the last debit made for the direct debit mandate.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveOrHistoricCurrencyAndAmount> getValue(DirectDebitInstructionDetails1 obj) {
			return obj.getLastCollectionCurrencyAmount();
		}

		@Override
		public void setValue(DirectDebitInstructionDetails1 obj, Optional<ActiveOrHistoricCurrencyAndAmount> value) {
			obj.setLastCollectionCurrencyAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "LastColltnDt")
	protected ISODate lastCollectionDate;
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
	 * {@linkplain com.tools20022.repository.entity.ObligationFulfilment#mmDate
	 * ObligationFulfilment.mmDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitInstructionDetails1
	 * DirectDebitInstructionDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LastColltnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LastCollectionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the last debit for the direct debit mandate may be made.\r\n\r\nUsage: Not included if all limits to the validity of the direct debit mandate have already been specified or if there are no time limits on the validity of the direct debit."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DirectDebitInstructionDetails1, Optional<ISODate>> mmLastCollectionDate = new MMMessageAttribute<DirectDebitInstructionDetails1, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> ObligationFulfilment.mmDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.DirectDebitInstructionDetails1.mmObject();
			isDerived = false;
			xmlTag = "LastColltnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LastCollectionDate";
			definition = "Date on which the last debit for the direct debit mandate may be made.\r\n\r\nUsage: Not included if all limits to the validity of the direct debit mandate have already been specified or if there are no time limits on the validity of the direct debit.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(DirectDebitInstructionDetails1 obj) {
			return obj.getLastCollectionDate();
		}

		@Override
		public void setValue(DirectDebitInstructionDetails1 obj, Optional<ISODate> value) {
			obj.setLastCollectionDate(value.orElse(null));
		}
	};
	@XmlElement(name = "OthrDtls")
	protected List<TransferInstruction1> otherDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransferInstruction1
	 * TransferInstruction1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitInstructionDetails1
	 * DirectDebitInstructionDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides further information about the status of a requested transaction schedule transfer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DirectDebitInstructionDetails1, List<TransferInstruction1>> mmOtherDetails = new MMMessageAssociationEnd<DirectDebitInstructionDetails1, List<TransferInstruction1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DirectDebitInstructionDetails1.mmObject();
			isDerived = false;
			xmlTag = "OthrDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherDetails";
			definition = "Provides further information about the status of a requested transaction schedule transfer.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TransferInstruction1.mmObject();
		}

		@Override
		public List<TransferInstruction1> getValue(DirectDebitInstructionDetails1 obj) {
			return obj.getOtherDetails();
		}

		@Override
		public void setValue(DirectDebitInstructionDetails1 obj, List<TransferInstruction1> value) {
			obj.setOtherDetails(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DirectDebitInstructionDetails1.mmMandateIdentification,
						com.tools20022.repository.msg.DirectDebitInstructionDetails1.mmAutomatedDirectDebitInstructionIndicator, com.tools20022.repository.msg.DirectDebitInstructionDetails1.mmDirectDebitTransferableIndicator,
						com.tools20022.repository.msg.DirectDebitInstructionDetails1.mmCreditor, com.tools20022.repository.msg.DirectDebitInstructionDetails1.mmLastCollectionCurrencyAmount,
						com.tools20022.repository.msg.DirectDebitInstructionDetails1.mmLastCollectionDate, com.tools20022.repository.msg.DirectDebitInstructionDetails1.mmOtherDetails);
				messageBuildingBlock_lazy = () -> Arrays.asList(AccountSwitchInformationResponseV01.mmDirectDebitInstruction, AccountSwitchCancelExistingPaymentV01.mmDirectDebitInstruction);
				trace_lazy = () -> CashAccountService.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "DirectDebitInstructionDetails1";
				definition = "Instructions, initiated by the creditor, to debit a debtor's account in favour of the creditor.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getMandateIdentification() {
		return mandateIdentification;
	}

	public DirectDebitInstructionDetails1 setMandateIdentification(Max35Text mandateIdentification) {
		this.mandateIdentification = Objects.requireNonNull(mandateIdentification);
		return this;
	}

	public Optional<YesNoIndicator> getAutomatedDirectDebitInstructionIndicator() {
		return automatedDirectDebitInstructionIndicator == null ? Optional.empty() : Optional.of(automatedDirectDebitInstructionIndicator);
	}

	public DirectDebitInstructionDetails1 setAutomatedDirectDebitInstructionIndicator(YesNoIndicator automatedDirectDebitInstructionIndicator) {
		this.automatedDirectDebitInstructionIndicator = automatedDirectDebitInstructionIndicator;
		return this;
	}

	public Optional<YesNoIndicator> getDirectDebitTransferableIndicator() {
		return directDebitTransferableIndicator == null ? Optional.empty() : Optional.of(directDebitTransferableIndicator);
	}

	public DirectDebitInstructionDetails1 setDirectDebitTransferableIndicator(YesNoIndicator directDebitTransferableIndicator) {
		this.directDebitTransferableIndicator = directDebitTransferableIndicator;
		return this;
	}

	public PartyIdentification125 getCreditor() {
		return creditor;
	}

	public DirectDebitInstructionDetails1 setCreditor(PartyIdentification125 creditor) {
		this.creditor = Objects.requireNonNull(creditor);
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyAndAmount> getLastCollectionCurrencyAmount() {
		return lastCollectionCurrencyAmount == null ? Optional.empty() : Optional.of(lastCollectionCurrencyAmount);
	}

	public DirectDebitInstructionDetails1 setLastCollectionCurrencyAmount(ActiveOrHistoricCurrencyAndAmount lastCollectionCurrencyAmount) {
		this.lastCollectionCurrencyAmount = lastCollectionCurrencyAmount;
		return this;
	}

	public Optional<ISODate> getLastCollectionDate() {
		return lastCollectionDate == null ? Optional.empty() : Optional.of(lastCollectionDate);
	}

	public DirectDebitInstructionDetails1 setLastCollectionDate(ISODate lastCollectionDate) {
		this.lastCollectionDate = lastCollectionDate;
		return this;
	}

	public List<TransferInstruction1> getOtherDetails() {
		return otherDetails == null ? otherDetails = new ArrayList<>() : otherDetails;
	}

	public DirectDebitInstructionDetails1 setOtherDetails(List<TransferInstruction1> otherDetails) {
		this.otherDetails = Objects.requireNonNull(otherDetails);
		return this;
	}
}