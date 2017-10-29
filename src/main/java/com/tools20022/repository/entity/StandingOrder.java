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

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.FrequencyCode;
import com.tools20022.repository.codeset.StandingOrderTypeCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Number;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.entity.StandingOrder#Identification
 * StandingOrder.Identification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.StandingOrder#Type
 * StandingOrder.Type}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingOrder#ValidityPeriod
 * StandingOrder.ValidityPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingOrder#LinkSetIdentification
 * StandingOrder.LinkSetIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingOrder#StandingOrderSequence
 * StandingOrder.StandingOrderSequence}</li>
 * <li>{@linkplain com.tools20022.repository.entity.StandingOrder#Amount
 * StandingOrder.Amount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.StandingOrder#CreditAccount
 * StandingOrder.CreditAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.StandingOrder#DebitAccount
 * StandingOrder.DebitAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.StandingOrder#Frequency
 * StandingOrder.Frequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingOrder#EventDescription
 * StandingOrder.EventDescription}</li>
 * <li>{@linkplain com.tools20022.repository.entity.StandingOrder#Day
 * StandingOrder.Day}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingOrder#TimeSpecification
 * StandingOrder.TimeSpecification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingOrder#PaymentInstructionTrigger
 * StandingOrder.PaymentInstructionTrigger}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingOrder#IncludedStandingOrder
 * StandingOrder.IncludedStandingOrder}</li>
 * <li>{@linkplain com.tools20022.repository.entity.StandingOrder#LinkSet
 * StandingOrder.LinkSet}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#RelatedCreditStandingOrder
 * CashAccount.RelatedCreditStandingOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#RelatedDebitStandingOrder
 * CashAccount.RelatedDebitStandingOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#RelatedStandingOrder
 * DateTimePeriod.RelatedStandingOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#StandingOrder
 * PaymentInstruction.StandingOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingOrder#IncludedStandingOrder
 * StandingOrder.IncludedStandingOrder}</li>
 * <li>{@linkplain com.tools20022.repository.entity.StandingOrder#LinkSet
 * StandingOrder.LinkSet}</li>
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
	/**
	 * Unique and unambiguous identification for a standing order, as assigned
	 * by the account servicer or the account owner.
	 * <p>
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
	public static final MMBusinessAttribute Identification = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> StandingOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identification for a standing order, as assigned by the account servicer or the account owner.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Type of the standing order.
	 * <p>
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
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> StandingOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Type of the standing order.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> StandingOrderTypeCode.mmObject();
		}
	};
	/**
	 * Dates during which the standing order is in effect.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#RelatedStandingOrder
	 * DateTimePeriod.RelatedStandingOrder}</li>
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
	public static final MMBusinessAssociationEnd ValidityPeriod = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> StandingOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValidityPeriod";
			definition = "Dates during which the standing order is in effect.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.RelatedStandingOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Unique identification to unambiguously identiy the link set in which the
	 * standing order is defined.
	 * <p>
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
	public static final MMBusinessAttribute LinkSetIdentification = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> StandingOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LinkSetIdentification";
			definition = "Unique identification to unambiguously identiy the link set in which the standing order is defined.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Specifies the sequence in which the system will execute the liquidity
	 * transfers standing order within the link set when additional liquidity is
	 * required.
	 * <p>
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
	public static final MMBusinessAttribute StandingOrderSequence = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> StandingOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StandingOrderSequence";
			definition = "Specifies the sequence in which the system will execute the liquidity transfers standing order within the link set when additional liquidity is required.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Currency and amount of the periodical payments. When the standing order
	 * is related to a fund investment plan, this is the cash part of the
	 * invested amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
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
	public static final MMBusinessAttribute Amount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> StandingOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Currency and amount of the periodical payments. When the standing order is related to a fund investment plan, this is the cash part of the invested amount.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Cash account credited from a standing order mechanism.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#RelatedCreditStandingOrder
	 * CashAccount.RelatedCreditStandingOrder}</li>
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
	public static final MMBusinessAssociationEnd CreditAccount = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> StandingOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditAccount";
			definition = "Cash account credited from a  standing order mechanism.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CashAccount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.RelatedCreditStandingOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Cash account debited from a standing order mechanism.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#RelatedDebitStandingOrder
	 * CashAccount.RelatedDebitStandingOrder}</li>
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
	public static final MMBusinessAssociationEnd DebitAccount = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> StandingOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DebitAccount";
			definition = "Cash account debited from a standing order mechanism.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CashAccount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.RelatedDebitStandingOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Frequency of the investment or divestment, eg, daily, weekly, or monthly.
	 * <p>
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
	public static final MMBusinessAttribute Frequency = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> StandingOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Frequency";
			definition = "Frequency of the investment or divestment, eg, daily, weekly, or monthly.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}
	};
	/**
	 * Describes the event which triggers the exercise of a standing order for
	 * instance the reception of a report or the closing of an account.
	 * <p>
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
	public static final MMBusinessAttribute EventDescription = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> StandingOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EventDescription";
			definition = "Describes the event which triggers the exercise of a standing order for instance the reception of a report or the closing of an account.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	/**
	 * Specifies the date in a month for instance the 30th.
	 * <p>
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
	public static final MMBusinessAttribute Day = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> StandingOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Day";
			definition = "Specifies the date in a month for instance the 30th.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Specifies the period for the time event, for instance end of day.
	 * <p>
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
	public static final MMBusinessAttribute TimeSpecification = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> StandingOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TimeSpecification";
			definition = "Specifies the period for the time event, for instance end of day.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Standing order causes a payment instruction at regular intervals, eg, as
	 * specified by its frequency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#StandingOrder
	 * PaymentInstruction.StandingOrder}</li>
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
	public static final MMBusinessAssociationEnd PaymentInstructionTrigger = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> StandingOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInstructionTrigger";
			definition = "Standing order causes a payment instruction at regular intervals, eg, as specified by its frequency. ";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> PaymentInstruction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentInstruction.StandingOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the standing order included in the linkset.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.StandingOrder#LinkSet
	 * StandingOrder.LinkSet}</li>
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
	public static final MMBusinessAssociationEnd IncludedStandingOrder = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> StandingOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncludedStandingOrder";
			definition = "Specifies the standing order included in the linkset.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> StandingOrder.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.StandingOrder.LinkSet;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Collection of standing orders defined in a specific sequence.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.StandingOrder#IncludedStandingOrder
	 * StandingOrder.IncludedStandingOrder}</li>
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
	public static final MMBusinessAssociationEnd LinkSet = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> StandingOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkSet";
			definition = "Collection of standing orders defined in a specific sequence.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> StandingOrder.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.StandingOrder.IncludedStandingOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "StandingOrder";
				definition = "Instruction given by an account holder to an account servicer to make regular transfers on given dates to the same beneficiary.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccount.RelatedCreditStandingOrder, com.tools20022.repository.entity.CashAccount.RelatedDebitStandingOrder,
						com.tools20022.repository.entity.DateTimePeriod.RelatedStandingOrder, com.tools20022.repository.entity.PaymentInstruction.StandingOrder, com.tools20022.repository.entity.StandingOrder.IncludedStandingOrder,
						com.tools20022.repository.entity.StandingOrder.LinkSet);
				subType_lazy = () -> Arrays.asList(CashStandingOrder.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.StandingOrder.Identification, com.tools20022.repository.entity.StandingOrder.Type, com.tools20022.repository.entity.StandingOrder.ValidityPeriod,
						com.tools20022.repository.entity.StandingOrder.LinkSetIdentification, com.tools20022.repository.entity.StandingOrder.StandingOrderSequence, com.tools20022.repository.entity.StandingOrder.Amount,
						com.tools20022.repository.entity.StandingOrder.CreditAccount, com.tools20022.repository.entity.StandingOrder.DebitAccount, com.tools20022.repository.entity.StandingOrder.Frequency,
						com.tools20022.repository.entity.StandingOrder.EventDescription, com.tools20022.repository.entity.StandingOrder.Day, com.tools20022.repository.entity.StandingOrder.TimeSpecification,
						com.tools20022.repository.entity.StandingOrder.PaymentInstructionTrigger, com.tools20022.repository.entity.StandingOrder.IncludedStandingOrder, com.tools20022.repository.entity.StandingOrder.LinkSet);
			}
		});
		return mmObject_lazy.get();
	}
}