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
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.entity.Trade;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies trades linked to securities operations such as the exchange of
 * securities, the lending of securities and the transactions related to
 * investment funds.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesTrade" src="doc-files/SecuritiesTrade.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#SecuritiesTradeRelatedIdentifications
 * SecuritiesTrade.SecuritiesTradeRelatedIdentifications}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTrade#TradeAmount
 * SecuritiesTrade.TradeAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#OpeningClosingIndicator
 * SecuritiesTrade.OpeningClosingIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#TradeTransactionCondition
 * SecuritiesTrade.TradeTransactionCondition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#SecuritiesTradeStatus
 * SecuritiesTrade.SecuritiesTradeStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTrade#Activity
 * SecuritiesTrade.Activity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#TradeQuantity
 * SecuritiesTrade.TradeQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#TradeOriginationDate
 * SecuritiesTrade.TradeOriginationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#ClearingFeeType
 * SecuritiesTrade.ClearingFeeType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTrade#Security
 * SecuritiesTrade.Security}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTrade#TradePrice
 * SecuritiesTrade.TradePrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTrade#PartyRole
 * SecuritiesTrade.PartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#SecuritiesFinancingClosingData
 * SecuritiesTrade.SecuritiesFinancingClosingData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#TradingExecution
 * SecuritiesTrade.TradingExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#TradeAllocation
 * SecuritiesTrade.TradeAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#RelatedOrder
 * SecuritiesTrade.RelatedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#SecuritiesFinancingOpeningData
 * SecuritiesTrade.SecuritiesFinancingOpeningData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#TransactionType
 * SecuritiesTrade.TransactionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#LegalFramework
 * SecuritiesTrade.LegalFramework}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#SecuritiesTransactionType
 * SecuritiesTrade.SecuritiesTransactionType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#SecuritiesTrade
 * Security.SecuritiesTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#SecuritiesTrade
 * SecuritiesPricing.SecuritiesTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#IdentifiedTrade
 * SecuritiesTradeIdentification.IdentifiedTrade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesQuantity#Trade
 * SecuritiesQuantity.Trade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#RelatedTrade
 * SecuritiesTradeExecution.RelatedTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#SecuritiesTrade
 * SecuritiesTradeStatus.SecuritiesTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#ClosingLegExecution
 * SecuritiesFinancing.ClosingLegExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#OpeningLegExecution
 * SecuritiesFinancing.OpeningLegExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#OrderExecution
 * SecuritiesOrder.OrderExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradePartyRole#SecuritiesTrade
 * SecuritiesTradePartyRole.SecuritiesTrade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Allocation#SecuritiesTrade
 * Allocation.SecuritiesTrade}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentFundTransaction
 * InvestmentFundTransaction}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesFinancing
 * SecuritiesFinancing}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesOptionTrade
 * SecuritiesOptionTrade}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Trade Trade}</li>
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
 * "SecuritiesTrade"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies trades linked to securities operations such as the exchange of securities, the lending of securities and the transactions related to investment funds."
 * </li>
 * </ul>
 */
public class SecuritiesTrade extends Trade {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the different identifications associated with a securities
	 * trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#IdentifiedTrade
	 * SecuritiesTradeIdentification.IdentifiedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
	 * SecuritiesTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesTradeRelatedIdentifications"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the different identifications associated with a securities trade."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesTradeRelatedIdentifications = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTradeRelatedIdentifications";
			definition = "Specifies the different identifications associated with a securities trade.";
			minOccurs = 0;
			type_lazy = () -> SecuritiesTradeIdentification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeIdentification.IdentifiedTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Total amount of the trade. Is equal to the executed trade quantity
	 * multiplied by the executed trade price.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount of the trade. Is equal to the executed trade quantity multiplied by the executed trade price."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TradeAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradeAmount";
			definition = "Total amount of the trade. Is equal to the executed trade quantity multiplied by the executed trade price.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies additional information relative to the processing of the trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OpeningClosingCode
	 * OpeningClosingCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpeningClosingIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies additional information relative to the processing of the trade."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute OpeningClosingIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OpeningClosingIndicator";
			definition = "Specifies additional information relative to the processing of the trade.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> OpeningClosingCode.mmObject();
		}
	};
	/**
	 * Indicates the conditions under which the order/trade is to be/was
	 * executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode
	 * TradeTransactionConditionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeTransactionCondition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the conditions under which the order/trade is to be/was executed."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TradeTransactionCondition = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradeTransactionCondition";
			definition = "Indicates the conditions under which the order/trade is to be/was executed.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TradeTransactionConditionCode.mmObject();
		}
	};
	/**
	 * Specifies the status of a trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#SecuritiesTrade
	 * SecuritiesTradeStatus.SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesTradeStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the status of a trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesTradeStatus = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTradeStatus";
			definition = "Specifies the status of a trade.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.SecuritiesTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the type of activity to which the trade relates.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionActivityCode
	 * TransactionActivityCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Activity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of activity to which the trade relates."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Activity = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Activity";
			definition = "Specifies the type of activity to which the trade relates.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TransactionActivityCode.mmObject();
		}
	};
	/**
	 * Specifies the total quantity of a financial instrument involved in a
	 * trade. It is derived from the ordered quantity or from the quantity
	 * specified in a leg of a financing agreement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#Trade
	 * SecuritiesQuantity.Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the total quantity of a financial instrument involved in a trade. It is derived from the ordered quantity or from the quantity specified in a leg of a financing agreement."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TradeQuantity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradeQuantity";
			definition = "Specifies the total quantity of a financial instrument involved in a trade. It is derived from the ordered quantity or from the quantity specified in a leg of a financing agreement.";
			minOccurs = 0;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.Trade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates the date and time of the agreement in principal between
	 * counter-parties prior to actual trade date. Used with fixed income for
	 * municipal new issue markets.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeOriginationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the date and time of the agreement in principal between counter-parties prior to actual trade date.\nUsed with fixed income for municipal new issue markets."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TradeOriginationDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradeOriginationDate";
			definition = "Indicates the date and time of the agreement in principal between counter-parties prior to actual trade date.\nUsed with fixed income for municipal new issue markets.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Indicates the type of fee for trade executions at an exchange.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingFeeTypeCode
	 * ClearingFeeTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingFeeType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the type of fee for trade executions at an exchange."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ClearingFeeType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClearingFeeType";
			definition = "Indicates the type of fee for trade executions at an exchange.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ClearingFeeTypeCode.mmObject();
		}
	};
	/**
	 * Security involved in a trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#SecuritiesTrade
	 * Security.SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Security"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security involved in a trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Security = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Security involved in a trade.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Security.SecuritiesTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the executed trade price which is derived from the different
	 * deal prices.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#SecuritiesTrade
	 * SecuritiesPricing.SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the executed trade price which is derived from the different deal prices."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TradePrice = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradePrice";
			definition = "Specifies the executed trade price which is derived from the different deal prices.";
			minOccurs = 0;
			type_lazy = () -> SecuritiesPricing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.SecuritiesTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies each role linked to a securities trade and played by a party at
	 * that step in a securities transaction flow.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradePartyRole#SecuritiesTrade
	 * SecuritiesTradePartyRole.SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradePartyRole
	 * SecuritiesTradePartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies each role linked to a securities trade and played by a party at that step in a securities transaction flow."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies each role linked to a securities trade and played by a party at that step in a securities transaction flow.";
			minOccurs = 0;
			type_lazy = () -> SecuritiesTradePartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTradePartyRole.SecuritiesTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Financing process for which a closing leg is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#ClosingLegExecution
	 * SecuritiesFinancing.ClosingLegExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesFinancingClosingData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Financing process for which a closing leg is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesFinancingClosingData = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesFinancingClosingData";
			definition = "Financing process for which a closing leg is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesFinancing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.ClosingLegExecution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * The realisation of the trade over one or more transactions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#RelatedTrade
	 * SecuritiesTradeExecution.RelatedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution
	 * SecuritiesTradeExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingExecution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The realisation of the trade over one or more transactions."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TradingExecution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradingExecution";
			definition = "The realisation of the trade over one or more transactions.";
			minOccurs = 0;
			type_lazy = () -> SecuritiesTradeExecution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeExecution.RelatedTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Information about the allocation of the trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Allocation#SecuritiesTrade
	 * Allocation.SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Allocation
	 * Allocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeAllocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about the allocation of the trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TradeAllocation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradeAllocation";
			definition = "Information about the allocation of the trade.";
			minOccurs = 0;
			type_lazy = () -> Allocation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Allocation.SecuritiesTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Order which is executed by a trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#OrderExecution
	 * SecuritiesOrder.OrderExecution}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order which is executed by a trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedOrder = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedOrder";
			definition = "Order which is executed by a trade.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesOrder.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.OrderExecution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Financing process for which an opening leg is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#OpeningLegExecution
	 * SecuritiesFinancing.OpeningLegExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesFinancingOpeningData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Financing process for which an opening leg is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesFinancingOpeningData = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesFinancingOpeningData";
			definition = "Financing process for which an opening leg is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesFinancing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.OpeningLegExecution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates the type of transaction of which the order is a component.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode
	 * TradeTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the type of transaction of which the order is a component."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TransactionType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransactionType";
			definition = "Indicates the type of transaction of which the order is a component.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TradeTypeCode.mmObject();
		}
	};
	/**
	 * Legal framework of the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.LegalFrameworkCode
	 * LegalFrameworkCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegalFramework"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Legal framework of the transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute LegalFramework = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LegalFramework";
			definition = "Legal framework of the transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> LegalFrameworkCode.mmObject();
		}
	};
	/**
	 * Underlying information about the settlement transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code
	 * SecuritiesTransactionTypeV2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesTransactionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying information about the settlement transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SecuritiesTransactionType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTransactionType";
			definition = "Underlying information about the settlement transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> SecuritiesTransactionTypeV2Code.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesTrade";
				definition = "Specifies trades linked to securities operations such as the exchange of securities, the lending of securities and the transactions related to investment funds.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.SecuritiesTrade, com.tools20022.repository.entity.SecuritiesPricing.SecuritiesTrade,
						com.tools20022.repository.entity.SecuritiesTradeIdentification.IdentifiedTrade, com.tools20022.repository.entity.SecuritiesQuantity.Trade, com.tools20022.repository.entity.SecuritiesTradeExecution.RelatedTrade,
						com.tools20022.repository.entity.SecuritiesTradeStatus.SecuritiesTrade, com.tools20022.repository.entity.SecuritiesFinancing.ClosingLegExecution,
						com.tools20022.repository.entity.SecuritiesFinancing.OpeningLegExecution, com.tools20022.repository.entity.SecuritiesOrder.OrderExecution, com.tools20022.repository.entity.SecuritiesTradePartyRole.SecuritiesTrade,
						com.tools20022.repository.entity.Allocation.SecuritiesTrade);
				subType_lazy = () -> Arrays.asList(InvestmentFundTransaction.mmObject(), SecuritiesFinancing.mmObject(), SecuritiesOptionTrade.mmObject());
				superType_lazy = () -> Trade.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesTrade.SecuritiesTradeRelatedIdentifications, com.tools20022.repository.entity.SecuritiesTrade.TradeAmount,
						com.tools20022.repository.entity.SecuritiesTrade.OpeningClosingIndicator, com.tools20022.repository.entity.SecuritiesTrade.TradeTransactionCondition,
						com.tools20022.repository.entity.SecuritiesTrade.SecuritiesTradeStatus, com.tools20022.repository.entity.SecuritiesTrade.Activity, com.tools20022.repository.entity.SecuritiesTrade.TradeQuantity,
						com.tools20022.repository.entity.SecuritiesTrade.TradeOriginationDate, com.tools20022.repository.entity.SecuritiesTrade.ClearingFeeType, com.tools20022.repository.entity.SecuritiesTrade.Security,
						com.tools20022.repository.entity.SecuritiesTrade.TradePrice, com.tools20022.repository.entity.SecuritiesTrade.PartyRole, com.tools20022.repository.entity.SecuritiesTrade.SecuritiesFinancingClosingData,
						com.tools20022.repository.entity.SecuritiesTrade.TradingExecution, com.tools20022.repository.entity.SecuritiesTrade.TradeAllocation, com.tools20022.repository.entity.SecuritiesTrade.RelatedOrder,
						com.tools20022.repository.entity.SecuritiesTrade.SecuritiesFinancingOpeningData, com.tools20022.repository.entity.SecuritiesTrade.TransactionType, com.tools20022.repository.entity.SecuritiesTrade.LegalFramework,
						com.tools20022.repository.entity.SecuritiesTrade.SecuritiesTransactionType);
			}
		});
		return mmObject_lazy.get();
	}
}