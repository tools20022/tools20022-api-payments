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

import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.FrequencyCode;
import com.tools20022.repository.codeset.StandingOrderTypeCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	public static final MMBusinessAttribute mmIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StandingOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identification for a standing order, as assigned by the account servicer or the account owner.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return StandingOrder.class.getMethod("getIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected StandingOrderTypeCode type;
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
	public static final MMBusinessAttribute mmType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StandingOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Type of the standing order.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> StandingOrderTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return StandingOrder.class.getMethod("getType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DateTimePeriod validityPeriod;
	/**
	 * Dates during which the standing order is in effect.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmValidityPeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StandingOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ValidityPeriod";
			definition = "Dates during which the standing order is in effect.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmRelatedStandingOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected Max35Text linkSetIdentification;
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
	public static final MMBusinessAttribute mmLinkSetIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StandingOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LinkSetIdentification";
			definition = "Unique identification to unambiguously identiy the link set in which the standing order is defined.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return StandingOrder.class.getMethod("getLinkSetIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Number standingOrderSequence;
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
	public static final MMBusinessAttribute mmStandingOrderSequence = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StandingOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StandingOrderSequence";
			definition = "Specifies the sequence in which the system will execute the liquidity transfers standing order within the link set when additional liquidity is required.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return StandingOrder.class.getMethod("getStandingOrderSequence", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount amount;
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
	public static final MMBusinessAttribute mmAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StandingOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Currency and amount of the periodical payments. When the standing order is related to a fund investment plan, this is the cash part of the invested amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return StandingOrder.class.getMethod("getAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CashAccount creditAccount;
	/**
	 * Cash account credited from a standing order mechanism.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmCreditAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StandingOrder.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditAccount";
			definition = "Cash account credited from a  standing order mechanism.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.mmRelatedCreditStandingOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccount.mmObject();
		}
	};
	protected CashAccount debitAccount;
	/**
	 * Cash account debited from a standing order mechanism.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmDebitAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StandingOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DebitAccount";
			definition = "Cash account debited from a standing order mechanism.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.mmRelatedDebitStandingOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccount.mmObject();
		}
	};
	protected FrequencyCode frequency;
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
	public static final MMBusinessAttribute mmFrequency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StandingOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Frequency";
			definition = "Frequency of the investment or divestment, eg, daily, weekly, or monthly.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return StandingOrder.class.getMethod("getFrequency", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max140Text eventDescription;
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
	public static final MMBusinessAttribute mmEventDescription = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StandingOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EventDescription";
			definition = "Describes the event which triggers the exercise of a standing order for instance the reception of a report or the closing of an account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return StandingOrder.class.getMethod("getEventDescription", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Number day;
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
	public static final MMBusinessAttribute mmDay = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StandingOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Day";
			definition = "Specifies the date in a month for instance the 30th.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return StandingOrder.class.getMethod("getDay", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text timeSpecification;
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
	public static final MMBusinessAttribute mmTimeSpecification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StandingOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TimeSpecification";
			definition = "Specifies the period for the time event, for instance end of day.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return StandingOrder.class.getMethod("getTimeSpecification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PaymentInstruction paymentInstructionTrigger;
	/**
	 * Standing order causes a payment instruction at regular intervals, eg, as
	 * specified by its frequency.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmPaymentInstructionTrigger = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StandingOrder.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInstructionTrigger";
			definition = "Standing order causes a payment instruction at regular intervals, eg, as specified by its frequency. ";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentInstruction.mmStandingOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentInstruction.mmObject();
		}
	};
	protected StandingOrder includedStandingOrder;
	/**
	 * Specifies the standing order included in the linkset.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmIncludedStandingOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StandingOrder.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncludedStandingOrder";
			definition = "Specifies the standing order included in the linkset.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.StandingOrder.mmLinkSet;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.StandingOrder.mmObject();
		}
	};
	protected StandingOrder linkSet;
	/**
	 * Collection of standing orders defined in a specific sequence.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmLinkSet = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StandingOrder.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkSet";
			definition = "Collection of standing orders defined in a specific sequence.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.StandingOrder.mmIncludedStandingOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.StandingOrder.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StandingOrder";
				definition = "Instruction given by an account holder to an account servicer to make regular transfers on given dates to the same beneficiary.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccount.mmRelatedCreditStandingOrder, com.tools20022.repository.entity.CashAccount.mmRelatedDebitStandingOrder,
						com.tools20022.repository.entity.DateTimePeriod.mmRelatedStandingOrder, com.tools20022.repository.entity.PaymentInstruction.mmStandingOrder, com.tools20022.repository.entity.StandingOrder.mmIncludedStandingOrder,
						com.tools20022.repository.entity.StandingOrder.mmLinkSet);
				subType_lazy = () -> Arrays.asList(CashStandingOrder.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.StandingOrder.mmIdentification, com.tools20022.repository.entity.StandingOrder.mmType, com.tools20022.repository.entity.StandingOrder.mmValidityPeriod,
						com.tools20022.repository.entity.StandingOrder.mmLinkSetIdentification, com.tools20022.repository.entity.StandingOrder.mmStandingOrderSequence, com.tools20022.repository.entity.StandingOrder.mmAmount,
						com.tools20022.repository.entity.StandingOrder.mmCreditAccount, com.tools20022.repository.entity.StandingOrder.mmDebitAccount, com.tools20022.repository.entity.StandingOrder.mmFrequency,
						com.tools20022.repository.entity.StandingOrder.mmEventDescription, com.tools20022.repository.entity.StandingOrder.mmDay, com.tools20022.repository.entity.StandingOrder.mmTimeSpecification,
						com.tools20022.repository.entity.StandingOrder.mmPaymentInstructionTrigger, com.tools20022.repository.entity.StandingOrder.mmIncludedStandingOrder, com.tools20022.repository.entity.StandingOrder.mmLinkSet);
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

	public void setIdentification(Max35Text identification) {
		this.identification = identification;
	}

	public StandingOrderTypeCode getType() {
		return type;
	}

	public void setType(StandingOrderTypeCode type) {
		this.type = type;
	}

	public DateTimePeriod getValidityPeriod() {
		return validityPeriod;
	}

	public void setValidityPeriod(com.tools20022.repository.entity.DateTimePeriod validityPeriod) {
		this.validityPeriod = validityPeriod;
	}

	public Max35Text getLinkSetIdentification() {
		return linkSetIdentification;
	}

	public void setLinkSetIdentification(Max35Text linkSetIdentification) {
		this.linkSetIdentification = linkSetIdentification;
	}

	public Number getStandingOrderSequence() {
		return standingOrderSequence;
	}

	public void setStandingOrderSequence(Number standingOrderSequence) {
		this.standingOrderSequence = standingOrderSequence;
	}

	public CurrencyAndAmount getAmount() {
		return amount;
	}

	public void setAmount(CurrencyAndAmount amount) {
		this.amount = amount;
	}

	public CashAccount getCreditAccount() {
		return creditAccount;
	}

	public void setCreditAccount(com.tools20022.repository.entity.CashAccount creditAccount) {
		this.creditAccount = creditAccount;
	}

	public CashAccount getDebitAccount() {
		return debitAccount;
	}

	public void setDebitAccount(com.tools20022.repository.entity.CashAccount debitAccount) {
		this.debitAccount = debitAccount;
	}

	public FrequencyCode getFrequency() {
		return frequency;
	}

	public void setFrequency(FrequencyCode frequency) {
		this.frequency = frequency;
	}

	public Max140Text getEventDescription() {
		return eventDescription;
	}

	public void setEventDescription(Max140Text eventDescription) {
		this.eventDescription = eventDescription;
	}

	public Number getDay() {
		return day;
	}

	public void setDay(Number day) {
		this.day = day;
	}

	public Max35Text getTimeSpecification() {
		return timeSpecification;
	}

	public void setTimeSpecification(Max35Text timeSpecification) {
		this.timeSpecification = timeSpecification;
	}

	public PaymentInstruction getPaymentInstructionTrigger() {
		return paymentInstructionTrigger;
	}

	public void setPaymentInstructionTrigger(com.tools20022.repository.entity.PaymentInstruction paymentInstructionTrigger) {
		this.paymentInstructionTrigger = paymentInstructionTrigger;
	}

	public StandingOrder getIncludedStandingOrder() {
		return includedStandingOrder;
	}

	public void setIncludedStandingOrder(com.tools20022.repository.entity.StandingOrder includedStandingOrder) {
		this.includedStandingOrder = includedStandingOrder;
	}

	public StandingOrder getLinkSet() {
		return linkSet;
	}

	public void setLinkSet(com.tools20022.repository.entity.StandingOrder linkSet) {
		this.linkSet = linkSet;
	}
}