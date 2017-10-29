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
import com.tools20022.repository.codeset.OffMarketCode;
import com.tools20022.repository.codeset.ProcessingPositionCode;
import com.tools20022.repository.codeset.ReportingCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Transaction between two counterparties in which they agree to buy and sell a
 * financial instrument. A trade transaction occurs with the matching of the two
 * counterparties orders. There could be several trade transactions necessary to
 * execute the trade.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesTradeExecution"
 * src="doc-files/SecuritiesTradeExecution.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#StampDutyIndicator
 * SecuritiesTradeExecution.StampDutyIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#ProcessingPosition
 * SecuritiesTradeExecution.ProcessingPosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#SecuritiesSettlement
 * SecuritiesTradeExecution.SecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#DealPrice
 * SecuritiesTradeExecution.DealPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#MarginAmount
 * SecuritiesTradeExecution.MarginAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#ExecutedTradeQuantity
 * SecuritiesTradeExecution.ExecutedTradeQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#OffMarketReason
 * SecuritiesTradeExecution.OffMarketReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#RelatedTrade
 * SecuritiesTradeExecution.RelatedTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#DealExecutionAmount
 * SecuritiesTradeExecution.DealExecutionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#PaymentObligation
 * SecuritiesTradeExecution.PaymentObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#SecuritiesDeliveryObligation
 * SecuritiesTradeExecution.SecuritiesDeliveryObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#ReportingType
 * SecuritiesTradeExecution.ReportingType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#SecuritiesTradeExecution
 * SecuritiesPricing.SecuritiesTradeExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#ExecutedSecuritiesTrade
 * PaymentObligation.ExecutedSecuritiesTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#SecuritiesTradeExecution
 * SecuritiesQuantity.SecuritiesTradeExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#TradingExecution
 * SecuritiesTrade.TradingExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#SecuritiesTradeExecution
 * SecuritiesSettlement.SecuritiesTradeExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#SecuritiesTradeExecution
 * SecuritiesDeliveryObligation.SecuritiesTradeExecution}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
 * InvestmentFundOrderExecution}</li>
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
 * "SecuritiesTradeExecution"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Transaction between two counterparties in which they agree to buy and sell a financial instrument. A trade transaction occurs with the matching of the two counterparties orders. There could be several trade transactions necessary to execute the trade."
 * </li>
 * </ul>
 */
public class SecuritiesTradeExecution {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Whether the net proceeds include stamp duty amount.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution
	 * SecuritiesTradeExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StampDutyIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Whether the net proceeds include stamp duty amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute StampDutyIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesTradeExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StampDutyIndicator";
			definition = "Whether the net proceeds include stamp duty amount.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * When the transaction is to be executed relative to a linked transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ProcessingPositionCode
	 * ProcessingPositionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution
	 * SecuritiesTradeExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingPosition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When the transaction is to be executed relative to a linked transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ProcessingPosition = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesTradeExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProcessingPosition";
			definition = "When the transaction is to be executed relative to a linked transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ProcessingPositionCode.mmObject();
		}
	};
	/**
	 * Process of settling securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#SecuritiesTradeExecution
	 * SecuritiesSettlement.SecuritiesTradeExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution
	 * SecuritiesTradeExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Process of settling securities."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesSettlement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesTradeExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesSettlement";
			definition = "Process of settling securities.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.SecuritiesTradeExecution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the price of the traded financial instrument. This is the deal
	 * price of the individual trade transaction. If there is only one trade
	 * transaction for the execution of the trade, then the deal price could
	 * equal the executed trade price (unless, for example, the price includes
	 * commissions or rounding, or some other factor has been applied to the
	 * deal price or the executed trade price, or both).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#SecuritiesTradeExecution
	 * SecuritiesPricing.SecuritiesTradeExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#RelatedPrice
	 * EntryTransaction8.RelatedPrice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution
	 * SecuritiesTradeExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DealPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the price of the traded financial instrument.\nThis is the deal price of the individual trade transaction. \nIf there is only one trade transaction for the execution of the trade, then the deal price could equal the executed trade price (unless, for example, the price includes commissions or rounding, or some other factor has been applied to the deal price or the executed trade price, or both)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd DealPrice = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.EntryTransaction8.RelatedPrice);
			elementContext_lazy = () -> SecuritiesTradeExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DealPrice";
			definition = "Specifies the price of the traded financial instrument.\nThis is the deal price of the individual trade transaction. \nIf there is only one trade transaction for the execution of the trade, then the deal price could equal the executed trade price (unless, for example, the price includes commissions or rounding, or some other factor has been applied to the deal price or the executed trade price, or both).";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesPricing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.SecuritiesTradeExecution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Difference in prices at which a dealer will buy and sell.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution
	 * SecuritiesTradeExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Difference in prices at which a dealer will buy and sell."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MarginAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesTradeExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MarginAmount";
			definition = "Difference in prices at which a dealer will buy and sell.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Quantity of financial instrument executed by the trading party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#SecuritiesTradeExecution
	 * SecuritiesQuantity.SecuritiesTradeExecution}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution
	 * SecuritiesTradeExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExecutedTradeQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of financial instrument executed by the trading party."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ExecutedTradeQuantity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesTradeExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExecutedTradeQuantity";
			definition = "Quantity of financial instrument executed by the trading party.";
			minOccurs = 0;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.SecuritiesTradeExecution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Reason for which the trade was executed off-market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OffMarketCode
	 * OffMarketCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution
	 * SecuritiesTradeExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OffMarketReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for which the trade was executed off-market."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute OffMarketReason = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesTradeExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OffMarketReason";
			definition = "Reason for which the trade was executed off-market.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> OffMarketCode.mmObject();
		}
	};
	/**
	 * Trade which is executed through one or more execution trades.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#TradingExecution
	 * SecuritiesTrade.TradingExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution
	 * SecuritiesTradeExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trade which is executed through one or more execution trades."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedTrade = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesTradeExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedTrade";
			definition = "Trade which is executed through one or more execution trades.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesTrade.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.TradingExecution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Deal price multiplied by the quantity of a financial instrument traded
	 * for the specific trade transaction i.e. the partially filled quantity.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution
	 * SecuritiesTradeExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DealExecutionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Deal price multiplied by the quantity of a financial instrument traded for the specific trade transaction i.e. the partially filled quantity."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute DealExecutionAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesTradeExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DealExecutionAmount";
			definition = "Deal price multiplied by the quantity of a financial instrument traded for the specific trade transaction i.e. the partially filled quantity.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies the cash delivery obligations resulting from the trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#ExecutedSecuritiesTrade
	 * PaymentObligation.ExecutedSecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution
	 * SecuritiesTradeExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentObligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the cash delivery obligations resulting from the trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PaymentObligation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesTradeExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentObligation";
			definition = "Specifies the cash delivery obligations resulting from the trade.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentObligation.ExecutedSecuritiesTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the securities delivery obligations resulting from the trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#SecuritiesTradeExecution
	 * SecuritiesDeliveryObligation.SecuritiesTradeExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation
	 * SecuritiesDeliveryObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution
	 * SecuritiesTradeExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesDeliveryObligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the securities delivery obligations resulting from the trade."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesDeliveryObligation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesTradeExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesDeliveryObligation";
			definition = "Specifies the securities delivery obligations resulting from the trade.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesDeliveryObligation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesDeliveryObligation.SecuritiesTradeExecution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies that a trade is to be reported to a third party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ReportingCode
	 * ReportingCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution
	 * SecuritiesTradeExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportingType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that a trade is to be reported to a third party."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ReportingType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesTradeExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReportingType";
			definition = "Specifies that a trade is to be reported to a third party.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ReportingCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesTradeExecution";
				definition = "Transaction between two counterparties in which they agree to buy and sell a financial instrument. A trade transaction occurs with the matching of the two counterparties orders. There could be several trade transactions necessary to execute the trade.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPricing.SecuritiesTradeExecution, com.tools20022.repository.entity.PaymentObligation.ExecutedSecuritiesTrade,
						com.tools20022.repository.entity.SecuritiesQuantity.SecuritiesTradeExecution, com.tools20022.repository.entity.SecuritiesTrade.TradingExecution,
						com.tools20022.repository.entity.SecuritiesSettlement.SecuritiesTradeExecution, com.tools20022.repository.entity.SecuritiesDeliveryObligation.SecuritiesTradeExecution);
				subType_lazy = () -> Arrays.asList(InvestmentFundOrderExecution.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesTradeExecution.StampDutyIndicator, com.tools20022.repository.entity.SecuritiesTradeExecution.ProcessingPosition,
						com.tools20022.repository.entity.SecuritiesTradeExecution.SecuritiesSettlement, com.tools20022.repository.entity.SecuritiesTradeExecution.DealPrice,
						com.tools20022.repository.entity.SecuritiesTradeExecution.MarginAmount, com.tools20022.repository.entity.SecuritiesTradeExecution.ExecutedTradeQuantity,
						com.tools20022.repository.entity.SecuritiesTradeExecution.OffMarketReason, com.tools20022.repository.entity.SecuritiesTradeExecution.RelatedTrade,
						com.tools20022.repository.entity.SecuritiesTradeExecution.DealExecutionAmount, com.tools20022.repository.entity.SecuritiesTradeExecution.PaymentObligation,
						com.tools20022.repository.entity.SecuritiesTradeExecution.SecuritiesDeliveryObligation, com.tools20022.repository.entity.SecuritiesTradeExecution.ReportingType);
			}
		});
		return mmObject_lazy.get();
	}
}