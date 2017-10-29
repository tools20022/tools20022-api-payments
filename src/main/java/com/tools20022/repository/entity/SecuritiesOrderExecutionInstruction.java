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
import com.tools20022.repository.codeset.StayOnSideTypeCode;
import com.tools20022.repository.datatype.AllOrNoneIndicator;
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identifies the instructions for order handling
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesOrderExecutionInstruction"
 * src="doc-files/SecuritiesOrderExecutionInstruction.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#AllOrNone
 * SecuritiesOrderExecutionInstruction.AllOrNone}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#CallFirst
 * SecuritiesOrderExecutionInstruction.CallFirst}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#Cross
 * SecuritiesOrderExecutionInstruction.Cross}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#CustomerDisplay
 * SecuritiesOrderExecutionInstruction.CustomerDisplay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#Hold
 * SecuritiesOrderExecutionInstruction.Hold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#Increase
 * SecuritiesOrderExecutionInstruction.Increase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#InstitutionsOnly
 * SecuritiesOrderExecutionInstruction.InstitutionsOnly}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#NonNegotiable
 * SecuritiesOrderExecutionInstruction.NonNegotiable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#OverTheDay
 * SecuritiesOrderExecutionInstruction.OverTheDay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#ParticipateDontInitiate
 * SecuritiesOrderExecutionInstruction.ParticipateDontInitiate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#PercentOfVolume
 * SecuritiesOrderExecutionInstruction.PercentOfVolume}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#Scale
 * SecuritiesOrderExecutionInstruction.Scale}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#StayOnSide
 * SecuritiesOrderExecutionInstruction.StayOnSide}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#Work
 * SecuritiesOrderExecutionInstruction.Work}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#GoAlong
 * SecuritiesOrderExecutionInstruction.GoAlong}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#TryScale
 * SecuritiesOrderExecutionInstruction.TryScale}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#DoNotReduce
 * SecuritiesOrderExecutionInstruction.DoNotReduce}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#CancelOnSystemFailure
 * SecuritiesOrderExecutionInstruction.CancelOnSystemFailure}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#CancelOnTradingHalt
 * SecuritiesOrderExecutionInstruction.CancelOnTradingHalt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#TradeAlong
 * SecuritiesOrderExecutionInstruction.TradeAlong}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#StrictLimit
 * SecuritiesOrderExecutionInstruction.StrictLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#IgnorePriceValidityChecks
 * SecuritiesOrderExecutionInstruction.IgnorePriceValidityChecks}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#ReinstateOnSystemFailure
 * SecuritiesOrderExecutionInstruction.ReinstateOnSystemFailure}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#ReinstateOnTradingHalt
 * SecuritiesOrderExecutionInstruction.ReinstateOnTradingHalt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#CancelIfNotBest
 * SecuritiesOrderExecutionInstruction.CancelIfNotBest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#ExternalRoutingAllowed
 * SecuritiesOrderExecutionInstruction.ExternalRoutingAllowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#ExternalRoutingNotAllowed
 * SecuritiesOrderExecutionInstruction.ExternalRoutingNotAllowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#ImbalanceOnly
 * SecuritiesOrderExecutionInstruction.ImbalanceOnly}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#IntermarketSweep
 * SecuritiesOrderExecutionInstruction.IntermarketSweep}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#Netting
 * SecuritiesOrderExecutionInstruction.Netting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#RelatedOrder
 * SecuritiesOrderExecutionInstruction.RelatedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#ForeignExchangeNetting
 * SecuritiesOrderExecutionInstruction.ForeignExchangeNetting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#StrictScale
 * SecuritiesOrderExecutionInstruction.StrictScale}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#Suspend
 * SecuritiesOrderExecutionInstruction.Suspend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#TryToStop
 * SecuritiesOrderExecutionInstruction.TryToStop}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#OrderPriceStrategy
 * SecuritiesOrderExecutionInstruction.OrderPriceStrategy}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#ExecutionInstructions
 * SecuritiesOrder.ExecutionInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Discretion#RelatedOrderExecution
 * Discretion.RelatedOrderExecution}</li>
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
 * "SecuritiesOrderExecutionInstruction"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies the instructions for order handling"</li>
 * </ul>
 */
public class SecuritiesOrderExecutionInstruction {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Round-lot market or limit-price order that must be executed in its
	 * entirety or not at all; unlike Fill or Kill orders, AON orders are not
	 * treated as canceled if they are not executed as soon as represented in
	 * the Trading Crowd.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.AllOrNoneIndicator
	 * AllOrNoneIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllOrNone"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Round-lot market or limit-price order that must be executed in its entirety or not at all; unlike Fill or Kill orders, AON orders are not treated as canceled if they are not executed as soon as represented in the Trading Crowd."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AllOrNone = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AllOrNone";
			definition = "Round-lot market or limit-price order that must be executed in its entirety or not at all; unlike Fill or Kill orders, AON orders are not treated as canceled if they are not executed as soon as represented in the Trading Crowd.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> AllOrNoneIndicator.mmObject();
		}
	};
	/**
	 * Refers to the client before trading in order to catch all verbal
	 * instructions on trading strategy usually because the strategy is too
	 * complex or cannot be represented in the trading application.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CallFirst"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Refers to the client before trading in order to catch all verbal instructions on trading strategy usually because the strategy is too complex or cannot be represented in the trading application."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CallFirst = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CallFirst";
			definition = "Refers to the client before trading in order to catch all verbal instructions on trading strategy usually because the strategy is too complex or cannot be represented in the trading application.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Allow crossing of an order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cross"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Allow crossing of an order."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Cross = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Cross";
			definition = "Allow crossing of an order.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Exchange or ECN required by the SEC to display limit orders in the public
	 * order book. A customer can choose not to have his limit order displayed
	 * to the public.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerDisplay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Exchange or ECN required by the SEC to display limit orders in the public order book. A customer can choose not to have his limit order displayed to the public."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CustomerDisplay = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CustomerDisplay";
			definition = "Exchange or ECN required by the SEC to display limit orders in the public order book. A customer can choose not to have his limit order displayed to the public.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether the firm executing the order is held to best execution
	 * requirements and may be able to make some discretionary decisions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Hold"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the firm executing the order is held to best execution requirements and may be able to make some discretionary decisions."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Hold = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Hold";
			definition = "Indicates whether the firm executing the order is held to best execution requirements and may be able to make some discretionary decisions.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether the order is to be increased in shares on the
	 * ex-dividend date as a result of a stock dividend or distribution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Increase"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the order is to be increased in shares on the ex-dividend date as a result of a stock dividend or distribution."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Increase = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Increase";
			definition = "Indicates whether the order is to be increased in shares on the ex-dividend date as a result of a stock dividend or distribution.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Identifies that the broker is restricted to dealing with other buy side
	 * firms.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstitutionsOnly"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies that the broker is restricted to dealing with other buy side firms."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute InstitutionsOnly = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InstitutionsOnly";
			definition = "Identifies that the broker is restricted to dealing with other buy side firms.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Qualifies an asset (usually a payment instrument) of which rights cannot
	 * be transferred to a party other then the original debtor and creditor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonNegotiable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Qualifies an asset (usually a payment instrument) of which rights cannot be transferred to a party other then the original debtor and creditor."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute NonNegotiable = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NonNegotiable";
			definition = "Qualifies an asset (usually a payment instrument) of which rights cannot be transferred to a party other then the original debtor and creditor.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether to execute parts of the order over the course of the
	 * day. Usually done with large block orders.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OverTheDay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether to execute parts of the order over the course of the day. Usually done with large block orders."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute OverTheDay = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OverTheDay";
			definition = "Indicates whether to execute parts of the order over the course of the day. Usually done with large block orders.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * An order that may participate in a transaction initiated by another
	 * party, but may not initiate a transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParticipateDontInitiate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An order that may participate in a transaction initiated by another party, but may not initiate a transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ParticipateDontInitiate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ParticipateDontInitiate";
			definition = "An order that may participate in a transaction initiated by another party, but may not initiate a transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates that the Sender does not want all of the volume on the floor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PercentOfVolume"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the Sender does not want all of the volume on the floor."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PercentOfVolume = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PercentOfVolume";
			definition = "Indicates that the Sender does not want all of the volume on the floor.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * An order to buy (or sell) a financial instrument which specifies the
	 * total amount to be bought (or sold) and the amount to be bought (or sold)
	 * at specified price variations.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Scale"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An order to buy (or sell) a financial instrument which specifies the total amount to be bought (or sold) and the amount to be bought (or sold) at specified price variations."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Scale = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Scale";
			definition = "An order to buy (or sell) a financial instrument which specifies the total amount to be bought (or sold) and the amount to be bought (or sold) at specified price variations.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Specifies the order limit based on the offer/bid at the time of the order
	 * submission.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.StayOnSideTypeCode
	 * StayOnSideTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StayOnSide"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the order limit based on the offer/bid at the time of the order submission."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute StayOnSide = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StayOnSide";
			definition = "Specifies the order limit based on the offer/bid at the time of the order submission.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> StayOnSideTypeCode.mmObject();
		}
	};
	/**
	 * Make the order active until notified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Work"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Make the order active until notified."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Work = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Work";
			definition = "Make the order active until notified.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Used for listed equity securities. Buy or sell at prices that randomly
	 * occur on the floor, participating in what trades the specialist and other
	 * players will allow.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GoAlong"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Used for listed equity securities. Buy or sell at prices that randomly occur on the floor, participating in what\ntrades the specialist and other players will allow."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute GoAlong = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GoAlong";
			definition = "Used for listed equity securities. Buy or sell at prices that randomly occur on the floor, participating in what\ntrades the specialist and other players will allow.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Order to buy (sell) a security that specifies the total amount to be
	 * bought (sold) and the amount to be bought (sold) at successively
	 * decreasing (increasing) price intervals; often placed in order to average
	 * the price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TryScale"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Order to buy (sell) a security that specifies the total amount to be bought (sold) and the amount to be bought (sold) at successively decreasing (increasing) price intervals; often placed in order to average the price."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TryScale = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TryScale";
			definition = "Order to buy (sell) a security that specifies the total amount to be bought (sold) and the amount to be bought (sold) at successively decreasing (increasing) price intervals; often placed in order to average the price.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether to buy, to stop order to sell, or to stop limit order
	 * to sell that is not to be reduced in price by the amount of an ordinary
	 * cash dividend on the ex-dividend date. A "do not reduce" order applies
	 * only to ordinary cash dividends; it should be reduced for other
	 * distributions - such as when a stock goes ex stock dividend or ex rights.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DoNotReduce"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether to buy, to stop order to sell, or to stop limit order to sell that is not to be reduced in price by the amount of an ordinary cash dividend on the ex-dividend date.  A \"do not reduce\" order applies only to ordinary cash dividends; it should be reduced for other distributions - such as when a stock goes ex stock dividend or ex rights."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute DoNotReduce = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DoNotReduce";
			definition = "Indicates whether to buy, to stop order to sell, or to stop limit order to sell that is not to be reduced in price by the amount of an ordinary cash dividend on the ex-dividend date.  A \"do not reduce\" order applies only to ordinary cash dividends; it should be reduced for other distributions - such as when a stock goes ex stock dividend or ex rights.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * If a system failure interrupts trading or order routing, attempt to
	 * cancel this order or attempt to reinstate this order, subject to time in
	 * force limitations. Note that depending on the type and severity of the
	 * failure, this might not be possible.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelOnSystemFailure"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If a system failure interrupts trading or order routing, attempt to cancel this order or attempt to reinstate this order, subject to time in force limitations. Note that depending on the type and severity of the failure, this might not be possible."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CancelOnSystemFailure = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CancelOnSystemFailure";
			definition = "If a system failure interrupts trading or order routing, attempt to cancel this order or attempt to reinstate this order, subject to time in force limitations. Note that depending on the type and severity of the failure, this might not be possible.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * If trading in this instrument is halted, cancel this order or reinstate
	 * this order when/if trading resumes, subject to time in force limitations.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelOnTradingHalt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If trading in this instrument is halted, cancel this order or reinstate this order when/if trading resumes, subject to time in force limitations."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CancelOnTradingHalt = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CancelOnTradingHalt";
			definition = "If trading in this instrument is halted, cancel this order or reinstate this order when/if trading resumes, subject to time in force limitations.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether the broker has permission to handle and place the order
	 * in the market even if the broker already has its own proprietary orders
	 * for the same financial instrument placed in the market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeAlong"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the broker has permission to handle and place the order in the market even if  the broker already has its own proprietary orders for the same financial instrument placed in the market."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TradeAlong = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradeAlong";
			definition = "Indicates whether the broker has permission to handle and place the order in the market even if  the broker already has its own proprietary orders for the same financial instrument placed in the market.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Limit order that must be traded at the exact limit price specified
	 * without any price improvement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StrictLimit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Limit order that must be traded at the exact limit price specified without any price improvement."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute StrictLimit = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StrictLimit";
			definition = "Limit order that must be traded at the exact limit price specified without any price improvement.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Disables validity checking of price fields for an order or change
	 * request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IgnorePriceValidityChecks"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Disables validity checking of price fields for an order or change request."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute IgnorePriceValidityChecks = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IgnorePriceValidityChecks";
			definition = "Disables validity checking of price fields for an order or change request.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * If a system failure interrupts trading or order routing, attempt to
	 * reinstate this order, subject to time in force limitations. Depending on
	 * the type and severity of the failure, this might not be possible.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReinstateOnSystemFailure"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If a system failure interrupts trading or order routing, attempt to reinstate this order, subject to time in force limitations. Depending on the type and severity of the failure, this might not be possible."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ReinstateOnSystemFailure = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReinstateOnSystemFailure";
			definition = "If a system failure interrupts trading or order routing, attempt to reinstate this order, subject to time in force limitations. Depending on the type and severity of the failure, this might not be possible.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * If trading in this instrument is halted, reinstate this order when/if
	 * trading resumes, subject to time in force limitations.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReinstateOnTradingHalt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If trading in this instrument is halted, reinstate this order when/if trading resumes, subject to time in force limitations."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ReinstateOnTradingHalt = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReinstateOnTradingHalt";
			definition = "If trading in this instrument is halted, reinstate this order when/if trading resumes, subject to time in force limitations.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates that an order should be cancelled if it is no longer the best
	 * bid if buying, or the best offer if selling.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelIfNotBest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that an order should be cancelled if it is no longer the best bid if buying, or the best offer if selling."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CancelIfNotBest = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CancelIfNotBest";
			definition = "Indicates that an order should be cancelled if it is no longer the best bid if buying, or the best offer if selling.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates that an order sent to one market may be routed by that market
	 * to other external markets, especially in cases where the order locks or
	 * crosses the market and it can be executed against another markets
	 * superior price. The absence of this instruction does not imply that an
	 * order should not be routed externally; rather, the order receivers
	 * default will apply.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExternalRoutingAllowed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that an order sent to one market may be routed by that market to other external markets, especially in cases where the order locks or crosses the market and it can be executed against another markets superior price. The absence of this instruction does not imply that an order should not be routed externally; rather, the order receivers default will apply."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ExternalRoutingAllowed = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExternalRoutingAllowed";
			definition = "Indicates that an order sent to one market may be routed by that market to other external markets, especially in cases where the order locks or crosses the market and it can be executed against another markets superior price. The absence of this instruction does not imply that an order should not be routed externally; rather, the order receivers default will apply.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates that an order sent to one market may never be routed by that
	 * market to other external markets. Should the order lock or cross the
	 * market but be unable to execute due to price protection reasons, a market
	 * may have to take alternate action, which might include rejecting the
	 * order, depending on the markets rules.The absence of this instruction
	 * does not imply that an order should be routed externally; rather, the
	 * order receivers default will apply.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExternalRoutingNotAllowed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that an order sent to one market may never be routed by that market to other external markets. Should the order lock or cross the market but be unable to execute due to price protection reasons, a market may have to take alternate action, which might include rejecting the order, depending on the markets rules.The absence of this instruction does not imply that an order should be routed externally; rather, the order receivers default will apply."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ExternalRoutingNotAllowed = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExternalRoutingNotAllowed";
			definition = "Indicates that an order sent to one market may never be routed by that market to other external markets. Should the order lock or cross the market but be unable to execute due to price protection reasons, a market may have to take alternate action, which might include rejecting the order, depending on the markets rules.The absence of this instruction does not imply that an order should be routed externally; rather, the order receivers default will apply.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates that the order can only hit the imbalance during a call
	 * auction. The imbalance is the remaining quantity when other buy and sell
	 * orders are matched at the auction clearing price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ImbalanceOnly"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the order can only hit the imbalance during a call auction. The imbalance is the remaining quantity when other buy and sell orders are matched at the auction clearing price."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ImbalanceOnly = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ImbalanceOnly";
			definition = "Indicates that the order can only hit the imbalance during a call auction. The imbalance is the remaining quantity when other buy and sell orders are matched at the auction clearing price.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates that the party sending the order has taken responsibility for
	 * price protection, and the recipient of the order should execute it, if
	 * possible, without regard to protection of other markets prices. While
	 * the term "Intermarket sweep" is specific to the United States, it may be
	 * used in other markets, where appropriate, to indicate an order that
	 * should be executed without regard to price protection.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermarketSweep"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the party sending the order has taken responsibility for price protection, and the recipient of the order should execute it, if possible, without regard to protection of other markets prices. While the term \"Intermarket sweep\" is specific to the United States, it may be used in other markets, where appropriate, to indicate an order that should be executed without regard to price protection."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute IntermarketSweep = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IntermarketSweep";
			definition = "Indicates that the party sending the order has taken responsibility for price protection, and the recipient of the order should execute it, if possible, without regard to protection of other markets prices. While the term \"Intermarket sweep\" is specific to the United States, it may be used in other markets, where appropriate, to indicate an order that should be executed without regard to price protection.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Used when sending multiple orders indicating that you would be 'netting'
	 * the F/X later.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Netting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Used when sending multiple orders indicating that you would be 'netting' the F/X later."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Netting = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Netting";
			definition = "Used when sending multiple orders indicating that you would be 'netting' the F/X later.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Order which is executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#ExecutionInstructions
	 * SecuritiesOrder.ExecutionInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order which is executed."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedOrder = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedOrder";
			definition = "Order which is executed.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesOrder.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.ExecutionInstructions;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Reduction of transfers of cash (resulting of a foreign exchange operation
	 * between subsidiaries or separate companies) to a net amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignExchangeNetting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reduction of transfers of cash (resulting of a foreign exchange operation between subsidiaries or separate companies) to a net amount."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ForeignExchangeNetting = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ForeignExchangeNetting";
			definition = "Reduction of transfers of cash (resulting of a foreign exchange operation between subsidiaries or separate companies) to a net amount.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Order to buy (sell) a security that strictly specifies the total amount
	 * to be bought (sold) and the amount to be bought (sold) at successively
	 * decreasing (increasing) price intervals; often placed in order to average
	 * the price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StrictScale"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Order to buy (sell) a security that strictly specifies the total amount to be bought (sold) and the amount to be bought (sold) at successively decreasing (increasing) price intervals; often placed in order to average the price."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute StrictScale = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StrictScale";
			definition = "Order to buy (sell) a security that strictly specifies the total amount to be bought (sold) and the amount to be bought (sold) at successively decreasing (increasing) price intervals; often placed in order to average the price.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Used in specialist driven markets to direct the specialist to try to
	 * suspend the order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Suspend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Used in specialist driven markets to direct the specialist to try to suspend the order."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Suspend = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Suspend";
			definition = "Used in specialist driven markets to direct the specialist to try to suspend the order.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Used in specialist driven markets to direct the specialist to try and
	 * stop the order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TryToStop"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Used in specialist driven markets to direct the specialist to try and stop the order."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TryToStop = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TryToStop";
			definition = "Used in specialist driven markets to direct the specialist to try and stop the order.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Strategy used to obtain the order price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Discretion#RelatedOrderExecution
	 * Discretion.RelatedOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Discretion
	 * Discretion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderPriceStrategy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Strategy used to obtain the order price."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd OrderPriceStrategy = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OrderPriceStrategy";
			definition = "Strategy used to obtain the order price.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Discretion.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Discretion.RelatedOrderExecution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesOrderExecutionInstruction";
				definition = "Identifies the instructions for order handling";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesOrder.ExecutionInstructions, com.tools20022.repository.entity.Discretion.RelatedOrderExecution);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.AllOrNone, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.CallFirst,
						com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.Cross, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.CustomerDisplay,
						com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.Hold, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.Increase,
						com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.InstitutionsOnly, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.NonNegotiable,
						com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.OverTheDay, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.ParticipateDontInitiate,
						com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.PercentOfVolume, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.Scale,
						com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.StayOnSide, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.Work,
						com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.GoAlong, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.TryScale,
						com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.DoNotReduce, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.CancelOnSystemFailure,
						com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.CancelOnTradingHalt, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.TradeAlong,
						com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.StrictLimit, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.IgnorePriceValidityChecks,
						com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.ReinstateOnSystemFailure, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.ReinstateOnTradingHalt,
						com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.CancelIfNotBest, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.ExternalRoutingAllowed,
						com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.ExternalRoutingNotAllowed, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.ImbalanceOnly,
						com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.IntermarketSweep, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.Netting,
						com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.RelatedOrder, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.ForeignExchangeNetting,
						com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.StrictScale, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.Suspend,
						com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.TryToStop, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.OrderPriceStrategy);
			}
		});
		return mmObject_lazy.get();
	}
}