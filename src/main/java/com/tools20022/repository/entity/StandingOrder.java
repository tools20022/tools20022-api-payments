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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.ext.OtherSemanticMarkup;
import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.FrequencyCode;
import com.tools20022.repository.codeset.StandingOrderTypeCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.CashAccount;
import com.tools20022.repository.entity.DateTimePeriod;
import com.tools20022.repository.entity.PaymentInstruction;
import com.tools20022.repository.entity.StandingOrder;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.DirectDebitInstructionDetails1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Instruction given by an account holder to an account servicer to make regular
 * transfers on given dates to the same beneficiary.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="StandingOrder" src="doc-files/StandingOrder.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingOrder#mmIdentification
 * StandingOrder.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.StandingOrder#mmType
 * StandingOrder.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingOrder#mmValidityPeriod
 * StandingOrder.mmValidityPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingOrder#mmLinkSetIdentification
 * StandingOrder.mmLinkSetIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingOrder#mmStandingOrderSequence
 * StandingOrder.mmStandingOrderSequence}</li>
 * <li>{@linkplain com.tools20022.repository.entity.StandingOrder#mmAmount
 * StandingOrder.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingOrder#mmCreditAccount
 * StandingOrder.mmCreditAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingOrder#mmDebitAccount
 * StandingOrder.mmDebitAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.StandingOrder#mmFrequency
 * StandingOrder.mmFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingOrder#mmEventDescription
 * StandingOrder.mmEventDescription}</li>
 * <li>{@linkplain com.tools20022.repository.entity.StandingOrder#mmDay
 * StandingOrder.mmDay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingOrder#mmTimeSpecification
 * StandingOrder.mmTimeSpecification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingOrder#mmPaymentInstructionTrigger
 * StandingOrder.mmPaymentInstructionTrigger}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingOrder#mmIncludedStandingOrder
 * StandingOrder.mmIncludedStandingOrder}</li>
 * <li>{@linkplain com.tools20022.repository.entity.StandingOrder#mmLinkSet
 * StandingOrder.mmLinkSet}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#mmRelatedCreditStandingOrder
 * CashAccount.mmRelatedCreditStandingOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#mmRelatedDebitStandingOrder
 * CashAccount.mmRelatedDebitStandingOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedStandingOrder
 * DateTimePeriod.mmRelatedStandingOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#mmStandingOrder
 * PaymentInstruction.mmStandingOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingOrder#mmIncludedStandingOrder
 * StandingOrder.mmIncludedStandingOrder}</li>
 * <li>{@linkplain com.tools20022.repository.entity.StandingOrder#mmLinkSet
 * StandingOrder.mmLinkSet}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CashStandingOrder
 * CashStandingOrder}</li>
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
 * "StandingOrder"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Instruction given by an account holder to an account servicer to make regular transfers on given dates to the same beneficiary."
 * </li>
 * </ul>
 */
public class StandingOrder {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StandingOrder StandingOrder}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification for a standing order, as assigned by the account servicer or the account owner."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<StandingOrder, Max35Text> mmIdentification = new MMBusinessAttribute<StandingOrder, Max35Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> StandingOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identification for a standing order, as assigned by the account servicer or the account owner.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(StandingOrder obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(StandingOrder obj, Max35Text value) {
			obj.setIdentification(value);
		}
	};
	protected StandingOrderTypeCode type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.StandingOrderTypeCode
	 * StandingOrderTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StandingOrder StandingOrder}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of the standing order."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<StandingOrder, StandingOrderTypeCode> mmType = new MMBusinessAttribute<StandingOrder, StandingOrderTypeCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> StandingOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Type of the standing order.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> StandingOrderTypeCode.mmObject();
		}

		@Override
		public StandingOrderTypeCode getValue(StandingOrder obj) {
			return obj.getType();
		}

		@Override
		public void setValue(StandingOrder obj, StandingOrderTypeCode value) {
			obj.setType(value);
		}
	};
	protected DateTimePeriod validityPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedStandingOrder
	 * DateTimePeriod.mmRelatedStandingOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StandingOrder StandingOrder}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = type=SampleData, SampleData=<?xml version="1.0"
	 * encoding="UTF-8"?> <InstanceInfo> <key KeyValue="Sample1"/> <key
	 * KeyValue="Sample2"/> <key KeyValue="Sample3"/> <key KeyValue="Sample4"/>
	 * <key KeyValue="Sample5"/> <key KeyValue="Sample6"/> <key
	 * KeyValue="Sample7"/> <key KeyValue="Sample8"/> <key KeyValue="Sample9"/>
	 * <key KeyValue="Sample10"/> </InstanceInfo>
	 * 
	 * 
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidityPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Dates during which the standing order is in effect."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<StandingOrder, DateTimePeriod> mmValidityPeriod = new MMBusinessAssociationEnd<StandingOrder, DateTimePeriod>() {
		{
			isDerived = false;
			elementContext_lazy = () -> StandingOrder.mmObject();
			semanticMarkup_lazy = () -> Arrays
					.asList(new OtherSemanticMarkup(
							this,
							"SampleData",
							new String[]{
									"SampleData",
									"<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<InstanceInfo>\n<key KeyValue=\"Sample1\"/>\n<key KeyValue=\"Sample2\"/>\n<key KeyValue=\"Sample3\"/>\n<key KeyValue=\"Sample4\"/>\n<key KeyValue=\"Sample5\"/>\n<key KeyValue=\"Sample6\"/>\n<key KeyValue=\"Sample7\"/>\n<key KeyValue=\"Sample8\"/>\n<key KeyValue=\"Sample9\"/>\n<key KeyValue=\"Sample10\"/>\n</InstanceInfo>\n\n\n"}));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ValidityPeriod";
			definition = "Dates during which the standing order is in effect.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> DateTimePeriod.mmRelatedStandingOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}

		@Override
		public DateTimePeriod getValue(StandingOrder obj) {
			return obj.getValidityPeriod();
		}

		@Override
		public void setValue(StandingOrder obj, DateTimePeriod value) {
			obj.setValidityPeriod(value);
		}
	};
	protected Max35Text linkSetIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StandingOrder StandingOrder}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkSetIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification to unambiguously identiy the link set in which the standing order is defined."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<StandingOrder, Max35Text> mmLinkSetIdentification = new MMBusinessAttribute<StandingOrder, Max35Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> StandingOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LinkSetIdentification";
			definition = "Unique identification to unambiguously identiy the link set in which the standing order is defined.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(StandingOrder obj) {
			return obj.getLinkSetIdentification();
		}

		@Override
		public void setValue(StandingOrder obj, Max35Text value) {
			obj.setLinkSetIdentification(value);
		}
	};
	protected Number standingOrderSequence;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StandingOrder StandingOrder}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingOrderSequence"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the sequence in which the system will execute the liquidity transfers standing order within the link set when additional liquidity is required."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<StandingOrder, Number> mmStandingOrderSequence = new MMBusinessAttribute<StandingOrder, Number>() {
		{
			isDerived = false;
			elementContext_lazy = () -> StandingOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StandingOrderSequence";
			definition = "Specifies the sequence in which the system will execute the liquidity transfers standing order within the link set when additional liquidity is required.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(StandingOrder obj) {
			return obj.getStandingOrderSequence();
		}

		@Override
		public void setValue(StandingOrder obj, Number value) {
			obj.setStandingOrderSequence(value);
		}
	};
	protected CurrencyAndAmount amount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitInstructionDetails1#mmLastCollectionCurrencyAmount
	 * DirectDebitInstructionDetails1.mmLastCollectionCurrencyAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StandingOrder StandingOrder}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency and amount of the periodical payments. When the standing order is related to a fund investment plan, this is the cash part of the invested amount."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<StandingOrder, CurrencyAndAmount> mmAmount = new MMBusinessAttribute<StandingOrder, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(DirectDebitInstructionDetails1.mmLastCollectionCurrencyAmount);
			isDerived = false;
			elementContext_lazy = () -> StandingOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Currency and amount of the periodical payments. When the standing order is related to a fund investment plan, this is the cash part of the invested amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(StandingOrder obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(StandingOrder obj, CurrencyAndAmount value) {
			obj.setAmount(value);
		}
	};
	protected CashAccount creditAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmRelatedCreditStandingOrder
	 * CashAccount.mmRelatedCreditStandingOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccount
	 * CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StandingOrder StandingOrder}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash account credited from a  standing order mechanism."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<StandingOrder, CashAccount> mmCreditAccount = new MMBusinessAssociationEnd<StandingOrder, CashAccount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> StandingOrder.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditAccount";
			definition = "Cash account credited from a  standing order mechanism.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> CashAccount.mmRelatedCreditStandingOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CashAccount.mmObject();
		}

		@Override
		public CashAccount getValue(StandingOrder obj) {
			return obj.getCreditAccount();
		}

		@Override
		public void setValue(StandingOrder obj, CashAccount value) {
			obj.setCreditAccount(value);
		}
	};
	protected CashAccount debitAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmRelatedDebitStandingOrder
	 * CashAccount.mmRelatedDebitStandingOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccount
	 * CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StandingOrder StandingOrder}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebitAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash account debited from a standing order mechanism."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<StandingOrder, CashAccount> mmDebitAccount = new MMBusinessAssociationEnd<StandingOrder, CashAccount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> StandingOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DebitAccount";
			definition = "Cash account debited from a standing order mechanism.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> CashAccount.mmRelatedDebitStandingOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CashAccount.mmObject();
		}

		@Override
		public CashAccount getValue(StandingOrder obj) {
			return obj.getDebitAccount();
		}

		@Override
		public void setValue(StandingOrder obj, CashAccount value) {
			obj.setDebitAccount(value);
		}
	};
	protected FrequencyCode frequency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FrequencyCode
	 * FrequencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StandingOrder StandingOrder}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Frequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Frequency of the investment or divestment, eg, daily, weekly, or monthly."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<StandingOrder, FrequencyCode> mmFrequency = new MMBusinessAttribute<StandingOrder, FrequencyCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> StandingOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Frequency";
			definition = "Frequency of the investment or divestment, eg, daily, weekly, or monthly.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}

		@Override
		public FrequencyCode getValue(StandingOrder obj) {
			return obj.getFrequency();
		}

		@Override
		public void setValue(StandingOrder obj, FrequencyCode value) {
			obj.setFrequency(value);
		}
	};
	protected Max140Text eventDescription;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StandingOrder StandingOrder}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventDescription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Describes the event which triggers the exercise of a standing order for instance the reception of a report or the closing of an account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<StandingOrder, Max140Text> mmEventDescription = new MMBusinessAttribute<StandingOrder, Max140Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> StandingOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EventDescription";
			definition = "Describes the event which triggers the exercise of a standing order for instance the reception of a report or the closing of an account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Max140Text getValue(StandingOrder obj) {
			return obj.getEventDescription();
		}

		@Override
		public void setValue(StandingOrder obj, Max140Text value) {
			obj.setEventDescription(value);
		}
	};
	protected Number day;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StandingOrder StandingOrder}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Day"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the date in a month for instance the 30th."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<StandingOrder, Number> mmDay = new MMBusinessAttribute<StandingOrder, Number>() {
		{
			isDerived = false;
			elementContext_lazy = () -> StandingOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Day";
			definition = "Specifies the date in a month for instance the 30th.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(StandingOrder obj) {
			return obj.getDay();
		}

		@Override
		public void setValue(StandingOrder obj, Number value) {
			obj.setDay(value);
		}
	};
	protected Max35Text timeSpecification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StandingOrder StandingOrder}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TimeSpecification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the period for the time event, for instance end of day."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<StandingOrder, Max35Text> mmTimeSpecification = new MMBusinessAttribute<StandingOrder, Max35Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> StandingOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TimeSpecification";
			definition = "Specifies the period for the time event, for instance end of day.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(StandingOrder obj) {
			return obj.getTimeSpecification();
		}

		@Override
		public void setValue(StandingOrder obj, Max35Text value) {
			obj.setTimeSpecification(value);
		}
	};
	protected PaymentInstruction paymentInstructionTrigger;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#mmStandingOrder
	 * PaymentInstruction.mmStandingOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentInstruction
	 * PaymentInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StandingOrder StandingOrder}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentInstructionTrigger"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Standing order causes a payment instruction at regular intervals, eg, as specified by its frequency. "
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<StandingOrder, PaymentInstruction> mmPaymentInstructionTrigger = new MMBusinessAssociationEnd<StandingOrder, PaymentInstruction>() {
		{
			isDerived = false;
			elementContext_lazy = () -> StandingOrder.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInstructionTrigger";
			definition = "Standing order causes a payment instruction at regular intervals, eg, as specified by its frequency. ";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> PaymentInstruction.mmStandingOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PaymentInstruction.mmObject();
		}

		@Override
		public PaymentInstruction getValue(StandingOrder obj) {
			return obj.getPaymentInstructionTrigger();
		}

		@Override
		public void setValue(StandingOrder obj, PaymentInstruction value) {
			obj.setPaymentInstructionTrigger(value);
		}
	};
	protected StandingOrder includedStandingOrder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.StandingOrder#mmLinkSet
	 * StandingOrder.mmLinkSet}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.StandingOrder
	 * StandingOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StandingOrder StandingOrder}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncludedStandingOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the standing order included in the linkset."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<StandingOrder, StandingOrder> mmIncludedStandingOrder = new MMBusinessAssociationEnd<StandingOrder, StandingOrder>() {
		{
			isDerived = false;
			elementContext_lazy = () -> StandingOrder.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncludedStandingOrder";
			definition = "Specifies the standing order included in the linkset.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> StandingOrder.mmLinkSet;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> StandingOrder.mmObject();
		}

		@Override
		public StandingOrder getValue(StandingOrder obj) {
			return obj.getIncludedStandingOrder();
		}

		@Override
		public void setValue(StandingOrder obj, StandingOrder value) {
			obj.setIncludedStandingOrder(value);
		}
	};
	protected StandingOrder linkSet;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.StandingOrder#mmIncludedStandingOrder
	 * StandingOrder.mmIncludedStandingOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.StandingOrder
	 * StandingOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StandingOrder StandingOrder}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collection of standing orders defined in a specific sequence."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<StandingOrder, Optional<StandingOrder>> mmLinkSet = new MMBusinessAssociationEnd<StandingOrder, Optional<StandingOrder>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> StandingOrder.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkSet";
			definition = "Collection of standing orders defined in a specific sequence.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> StandingOrder.mmIncludedStandingOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> StandingOrder.mmObject();
		}

		@Override
		public Optional<StandingOrder> getValue(StandingOrder obj) {
			return obj.getLinkSet();
		}

		@Override
		public void setValue(StandingOrder obj, Optional<StandingOrder> value) {
			obj.setLinkSet(value.orElse(null));
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StandingOrder";
				definition = "Instruction given by an account holder to an account servicer to make regular transfers on given dates to the same beneficiary.";
				associationDomain_lazy = () -> Arrays.asList(CashAccount.mmRelatedCreditStandingOrder, CashAccount.mmRelatedDebitStandingOrder, DateTimePeriod.mmRelatedStandingOrder, PaymentInstruction.mmStandingOrder,
						StandingOrder.mmIncludedStandingOrder, StandingOrder.mmLinkSet);
				subType_lazy = () -> Arrays.asList(CashStandingOrder.mmObject());
				element_lazy = () -> Arrays.asList(StandingOrder.mmIdentification, StandingOrder.mmType, StandingOrder.mmValidityPeriod, StandingOrder.mmLinkSetIdentification, StandingOrder.mmStandingOrderSequence, StandingOrder.mmAmount,
						StandingOrder.mmCreditAccount, StandingOrder.mmDebitAccount, StandingOrder.mmFrequency, StandingOrder.mmEventDescription, StandingOrder.mmDay, StandingOrder.mmTimeSpecification,
						StandingOrder.mmPaymentInstructionTrigger, StandingOrder.mmIncludedStandingOrder, StandingOrder.mmLinkSet);
			}

			@Override
			public Class<?> getInstanceClass() {
				return StandingOrder.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public StandingOrder setIdentification(Max35Text identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public StandingOrderTypeCode getType() {
		return type;
	}

	public StandingOrder setType(StandingOrderTypeCode type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public DateTimePeriod getValidityPeriod() {
		return validityPeriod;
	}

	public StandingOrder setValidityPeriod(DateTimePeriod validityPeriod) {
		this.validityPeriod = Objects.requireNonNull(validityPeriod);
		return this;
	}

	public Max35Text getLinkSetIdentification() {
		return linkSetIdentification;
	}

	public StandingOrder setLinkSetIdentification(Max35Text linkSetIdentification) {
		this.linkSetIdentification = Objects.requireNonNull(linkSetIdentification);
		return this;
	}

	public Number getStandingOrderSequence() {
		return standingOrderSequence;
	}

	public StandingOrder setStandingOrderSequence(Number standingOrderSequence) {
		this.standingOrderSequence = Objects.requireNonNull(standingOrderSequence);
		return this;
	}

	public CurrencyAndAmount getAmount() {
		return amount;
	}

	public StandingOrder setAmount(CurrencyAndAmount amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}

	public CashAccount getCreditAccount() {
		return creditAccount;
	}

	public StandingOrder setCreditAccount(CashAccount creditAccount) {
		this.creditAccount = Objects.requireNonNull(creditAccount);
		return this;
	}

	public CashAccount getDebitAccount() {
		return debitAccount;
	}

	public StandingOrder setDebitAccount(CashAccount debitAccount) {
		this.debitAccount = Objects.requireNonNull(debitAccount);
		return this;
	}

	public FrequencyCode getFrequency() {
		return frequency;
	}

	public StandingOrder setFrequency(FrequencyCode frequency) {
		this.frequency = Objects.requireNonNull(frequency);
		return this;
	}

	public Max140Text getEventDescription() {
		return eventDescription;
	}

	public StandingOrder setEventDescription(Max140Text eventDescription) {
		this.eventDescription = Objects.requireNonNull(eventDescription);
		return this;
	}

	public Number getDay() {
		return day;
	}

	public StandingOrder setDay(Number day) {
		this.day = Objects.requireNonNull(day);
		return this;
	}

	public Max35Text getTimeSpecification() {
		return timeSpecification;
	}

	public StandingOrder setTimeSpecification(Max35Text timeSpecification) {
		this.timeSpecification = Objects.requireNonNull(timeSpecification);
		return this;
	}

	public PaymentInstruction getPaymentInstructionTrigger() {
		return paymentInstructionTrigger;
	}

	public StandingOrder setPaymentInstructionTrigger(PaymentInstruction paymentInstructionTrigger) {
		this.paymentInstructionTrigger = Objects.requireNonNull(paymentInstructionTrigger);
		return this;
	}

	public StandingOrder getIncludedStandingOrder() {
		return includedStandingOrder;
	}

	public StandingOrder setIncludedStandingOrder(StandingOrder includedStandingOrder) {
		this.includedStandingOrder = Objects.requireNonNull(includedStandingOrder);
		return this;
	}

	public Optional<StandingOrder> getLinkSet() {
		return linkSet == null ? Optional.empty() : Optional.of(linkSet);
	}

	public StandingOrder setLinkSet(StandingOrder linkSet) {
		this.linkSet = linkSet;
		return this;
	}
}