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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of executed order.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeTypeCode#mmBasket
 * TradeTypeCode.mmBasket}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeTypeCode#mmIndex
 * TradeTypeCode.mmIndex}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeTypeCode#mmList
 * TradeTypeCode.mmList}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode#mmPreAllocation
 * TradeTypeCode.mmPreAllocation}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeTypeCode#mmProgram
 * TradeTypeCode.mmProgram}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeTypeCode#mmTrade
 * TradeTypeCode.mmTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode#mmBrokerToBroker
 * TradeTypeCode.mmBrokerToBroker}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeTypeCode#mmFundToFund
 * TradeTypeCode.mmFundToFund}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeTypeCode#mmRiskTrade
 * TradeTypeCode.mmRiskTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode#mmVWAPGuarantee
 * TradeTypeCode.mmVWAPGuarantee}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeTypeCode#mmAgency
 * TradeTypeCode.mmAgency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode#mmGuaranteedClose
 * TradeTypeCode.mmGuaranteedClose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode#mmOnOrderBookTrade
 * TradeTypeCode.mmOnOrderBookTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode#mmLinkedTrade
 * TradeTypeCode.mmLinkedTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode#mmTradeGiveUp
 * TradeTypeCode.mmTradeGiveUp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode#mmCorrectiveTrade
 * TradeTypeCode.mmCorrectiveTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode#mmBackUpTrade
 * TradeTypeCode.mmBackUpTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode#mmOffOrderBookTrade
 * TradeTypeCode.mmOffOrderBookTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode#mmEmployeeTradeReporting
 * TradeTypeCode.mmEmployeeTradeReporting}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeTypeCode#mmIPO
 * TradeTypeCode.mmIPO}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode#mmOfferingIssuingTrade
 * TradeTypeCode.mmOfferingIssuingTrade}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeTypeCode#mmIssuance
 * TradeTypeCode.mmIssuance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode#mmBondRepricing
 * TradeTypeCode.mmBondRepricing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode#mmBondSubstitution
 * TradeTypeCode.mmBondSubstitution}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeTypeCode#mmBondEnd
 * TradeTypeCode.mmBondEnd}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeTypeCode#mmBondStart
 * TradeTypeCode.mmBondStart}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode#mmLendingAndBorrowing
 * TradeTypeCode.mmLendingAndBorrowing}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeTypeCode#mmFutures
 * TradeTypeCode.mmFutures}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeTypeCode#mmOptions
 * TradeTypeCode.mmOptions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode#mmFuturesOption
 * TradeTypeCode.mmFuturesOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode#mmFutureBuyBackTrade
 * TradeTypeCode.mmFutureBuyBackTrade}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"BSKT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradeTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of executed order."</li>
 * </ul>
 */
public class TradeTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * A basket trade, i.e. a unit of 15 or more financial instruments used in
	 * program trading.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode
	 * TradeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BSKT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Basket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A basket trade, i.e. a unit of 15 or more financial instruments used in program trading."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmBasket = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Basket";
			definition = "A basket trade, i.e. a unit of 15 or more financial instruments used in program trading.";
			owner_lazy = () -> TradeTypeCode.mmObject();
			codeName = "BSKT";
		}
	};
	/**
	 * A trade of a predetermined set of financial instruments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode
	 * TradeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INDX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Index"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "A trade of a predetermined set of financial instruments."</li>
	 * </ul>
	 */
	public static final MMCode mmIndex = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Index";
			definition = "A trade of a predetermined set of financial instruments.";
			owner_lazy = () -> TradeTypeCode.mmObject();
			codeName = "INDX";
		}
	};
	/**
	 * A trade of a predetermined set of financial instruments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode
	 * TradeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LIST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "List"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "A trade of a predetermined set of financial instruments."</li>
	 * </ul>
	 */
	public static final MMCode mmList = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "List";
			definition = "A trade of a predetermined set of financial instruments.";
			owner_lazy = () -> TradeTypeCode.mmObject();
			codeName = "LIST";
		}
	};
	/**
	 * A pre-allocated trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode
	 * TradeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRAL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreAllocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "A pre-allocated trade."</li>
	 * </ul>
	 */
	public static final MMCode mmPreAllocation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PreAllocation";
			definition = "A pre-allocated trade.";
			owner_lazy = () -> TradeTypeCode.mmObject();
			codeName = "PRAL";
		}
	};
	/**
	 * A program trade, i.e. a computer-driven trade of buying and selling of
	 * baskets of 15 or more financial instruments by index arbitrage
	 * specialists or institutional traders.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode
	 * TradeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PROG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Program"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A program trade, i.e. a computer-driven trade of buying and selling of baskets of 15 or more financial instruments by index arbitrage specialists or institutional traders."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmProgram = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Program";
			definition = "A program trade, i.e. a computer-driven trade of buying and selling of baskets of 15 or more financial instruments by index arbitrage specialists or institutional traders.";
			owner_lazy = () -> TradeTypeCode.mmObject();
			codeName = "PROG";
		}
	};
	/**
	 * An executed order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode
	 * TradeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRAD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Trade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "An executed order."</li>
	 * </ul>
	 */
	public static final MMCode mmTrade = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Trade";
			definition = "An executed order.";
			owner_lazy = () -> TradeTypeCode.mmObject();
			codeName = "TRAD";
		}
	};
	/**
	 * A trade from a broker to another broker.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode
	 * TradeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BRBR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BrokerToBroker"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "A trade from a broker to another broker."</li>
	 * </ul>
	 */
	public static final MMCode mmBrokerToBroker = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BrokerToBroker";
			definition = "A trade from a broker to another broker.";
			owner_lazy = () -> TradeTypeCode.mmObject();
			codeName = "BRBR";
		}
	};
	/**
	 * A trade from an investment fund to another investment fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode
	 * TradeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FDFD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundToFund"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A trade from an investment fund to another  investment fund."</li>
	 * </ul>
	 */
	public static final MMCode mmFundToFund = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FundToFund";
			definition = "A trade from an investment fund to another  investment fund.";
			owner_lazy = () -> TradeTypeCode.mmObject();
			codeName = "FDFD";
		}
	};
	/**
	 * Trade involving risk
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode
	 * TradeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RISK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RiskTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade involving risk"</li>
	 * </ul>
	 */
	public static final MMCode mmRiskTrade = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RiskTrade";
			definition = "Trade involving risk";
			owner_lazy = () -> TradeTypeCode.mmObject();
			codeName = "RISK";
		}
	};
	/**
	 * Trade whose price is guaranteed as the weighted average of the trade
	 * prices on a specific day.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode
	 * TradeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VWAP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VWAPGuarantee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trade whose price is guaranteed as the weighted average of the trade prices on a specific day."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmVWAPGuarantee = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VWAPGuarantee";
			definition = "Trade whose price is guaranteed as the weighted average of the trade prices on a specific day.";
			owner_lazy = () -> TradeTypeCode.mmObject();
			codeName = "VWAP";
		}
	};
	/**
	 * Trade in which an agent intermediates between a buyer and a seller.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode
	 * TradeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AGEN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Agency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trade in which an agent intermediates between a buyer and a seller."</li>
	 * </ul>
	 */
	public static final MMCode mmAgency = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Agency";
			definition = "Trade in which an agent intermediates between a buyer and a seller.";
			owner_lazy = () -> TradeTypeCode.mmObject();
			codeName = "AGEN";
		}
	};
	/**
	 * Trade which is guaranteed to be finalized
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode
	 * TradeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GUAR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GuaranteedClose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade which is guaranteed to be finalized"</li>
	 * </ul>
	 */
	public static final MMCode mmGuaranteedClose = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GuaranteedClose";
			definition = "Trade which is guaranteed to be finalized";
			owner_lazy = () -> TradeTypeCode.mmObject();
			codeName = "GUAR";
		}
	};
	/**
	 * On order book/market trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode
	 * TradeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OOBK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnOrderBookTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "On order book/market trade."</li>
	 * </ul>
	 */
	public static final MMCode mmOnOrderBookTrade = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnOrderBookTrade";
			definition = "On order book/market trade.";
			owner_lazy = () -> TradeTypeCode.mmObject();
			codeName = "OOBK";
		}
	};
	/**
	 * Trades coming from the application of a coorporate event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode
	 * TradeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LKTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkedTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trades coming from the application of a coorporate event."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmLinkedTrade = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkedTrade";
			definition = "Trades coming from the application of a coorporate event.";
			owner_lazy = () -> TradeTypeCode.mmObject();
			codeName = "LKTR";
		}
	};
	/**
	 * Trade generated by a give-up.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode
	 * TradeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GUTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeGiveUp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade generated by a give-up."</li>
	 * </ul>
	 */
	public static final MMCode mmTradeGiveUp = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeGiveUp";
			definition = "Trade generated by a give-up.";
			owner_lazy = () -> TradeTypeCode.mmObject();
			codeName = "GUTR";
		}
	};
	/**
	 * Trade that is generated following a corporate action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode
	 * TradeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorrectiveTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade that is generated following a corporate action."</li>
	 * </ul>
	 */
	public static final MMCode mmCorrectiveTrade = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorrectiveTrade";
			definition = "Trade that is generated following a corporate action.";
			owner_lazy = () -> TradeTypeCode.mmObject();
			codeName = "COTR";
		}
	};
	/**
	 * Trade that is input manually in case of issue on the original trade that
	 * either was not processed or not received.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode
	 * TradeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BKTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BackUpTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trade that is input manually in case of issue on the original trade that either was not processed or not received."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmBackUpTrade = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BackUpTrade";
			definition = "Trade that is input manually in case of issue on the original trade that either was not processed or not received.";
			owner_lazy = () -> TradeTypeCode.mmObject();
			codeName = "BKTR";
		}
	};
	/**
	 * Trade that is over the counter.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode
	 * TradeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OFBK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OffOrderBookTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade that is over the counter."</li>
	 * </ul>
	 */
	public static final MMCode mmOffOrderBookTrade = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OffOrderBookTrade";
			definition = "Trade that is over the counter.";
			owner_lazy = () -> TradeTypeCode.mmObject();
			codeName = "OFBK";
		}
	};
	/**
	 * Transaction relates to employee trade reporting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode
	 * TradeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EMTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EmployeeTradeReporting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction relates to employee trade reporting."</li>
	 * </ul>
	 */
	public static final MMCode mmEmployeeTradeReporting = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmployeeTradeReporting";
			definition = "Transaction relates to employee trade reporting.";
			owner_lazy = () -> TradeTypeCode.mmObject();
			codeName = "EMTR";
		}
	};
	/**
	 * Transaction is an Initial Public Offer (IPO) order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode
	 * TradeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IPOO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IPO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is an Initial Public Offer (IPO) order."</li>
	 * </ul>
	 */
	public static final MMCode mmIPO = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IPO";
			definition = "Transaction is an Initial Public Offer (IPO) order.";
			owner_lazy = () -> TradeTypeCode.mmObject();
			codeName = "IPOO";
		}
	};
	/**
	 * Indicates that the trade is a Offering issue trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode
	 * TradeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OFIT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfferingIssuingTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates that the trade is a Offering issue trade."</li>
	 * </ul>
	 */
	public static final MMCode mmOfferingIssuingTrade = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfferingIssuingTrade";
			definition = "Indicates that the trade is a Offering issue trade.";
			owner_lazy = () -> TradeTypeCode.mmObject();
			codeName = "OFIT";
		}
	};
	/**
	 * Relates to the issuance of a security such as an equity or a depositary
	 * receipt.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode
	 * TradeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ISSU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issuance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Relates to the issuance of a security such as an equity or a depositary receipt."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmIssuance = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issuance";
			definition = "Relates to the issuance of a security such as an equity or a depositary receipt.";
			owner_lazy = () -> TradeTypeCode.mmObject();
			codeName = "ISSU";
		}
	};
	/**
	 * The trade is a Bond repricing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode
	 * TradeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BORE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BondRepricing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The trade is a Bond repricing."</li>
	 * </ul>
	 */
	public static final MMCode mmBondRepricing = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BondRepricing";
			definition = "The trade is a Bond repricing.";
			owner_lazy = () -> TradeTypeCode.mmObject();
			codeName = "BORE";
		}
	};
	/**
	 * The trade is a Bond substitution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode
	 * TradeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BOSU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BondSubstitution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The trade is a Bond substitution."</li>
	 * </ul>
	 */
	public static final MMCode mmBondSubstitution = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BondSubstitution";
			definition = "The trade is a Bond substitution.";
			owner_lazy = () -> TradeTypeCode.mmObject();
			codeName = "BOSU";
		}
	};
	/**
	 * The trade is a Bond end.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode
	 * TradeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BOEN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BondEnd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The trade is a Bond end."</li>
	 * </ul>
	 */
	public static final MMCode mmBondEnd = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BondEnd";
			definition = "The trade is a Bond end.";
			owner_lazy = () -> TradeTypeCode.mmObject();
			codeName = "BOEN";
		}
	};
	/**
	 * The trade is a Bond start.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode
	 * TradeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BOST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BondStart"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The trade is a Bond start."</li>
	 * </ul>
	 */
	public static final MMCode mmBondStart = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BondStart";
			definition = "The trade is a Bond start.";
			owner_lazy = () -> TradeTypeCode.mmObject();
			codeName = "BOST";
		}
	};
	/**
	 * Indicates that the trade is a Lending and borrowing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode
	 * TradeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LABO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LendingAndBorrowing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates that the trade is a Lending and borrowing."</li>
	 * </ul>
	 */
	public static final MMCode mmLendingAndBorrowing = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LendingAndBorrowing";
			definition = "Indicates that the trade is a Lending and borrowing.";
			owner_lazy = () -> TradeTypeCode.mmObject();
			codeName = "LABO";
		}
	};
	/**
	 * Indicates that the trade is a Futures contract trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode
	 * TradeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FUTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Futures"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates that the trade is a Futures contract trade."</li>
	 * </ul>
	 */
	public static final MMCode mmFutures = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Futures";
			definition = "Indicates that the trade is a Futures contract trade.";
			owner_lazy = () -> TradeTypeCode.mmObject();
			codeName = "FUTR";
		}
	};
	/**
	 * Indicates that the trade is a Option contract trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode
	 * TradeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OPTN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Options"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates that the trade is a Option contract trade."</li>
	 * </ul>
	 */
	public static final MMCode mmOptions = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Options";
			definition = "Indicates that the trade is a Option contract trade.";
			owner_lazy = () -> TradeTypeCode.mmObject();
			codeName = "OPTN";
		}
	};
	/**
	 * Indicates that the trade is a Futures option contract trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode
	 * TradeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FUOP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FuturesOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the trade is a Futures option contract trade."</li>
	 * </ul>
	 */
	public static final MMCode mmFuturesOption = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FuturesOption";
			definition = "Indicates that the trade is a Futures option contract trade.";
			owner_lazy = () -> TradeTypeCode.mmObject();
			codeName = "FUOP";
		}
	};
	/**
	 * The security will be bought back in the future..
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode
	 * TradeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FBBT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FutureBuyBackTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The security will be bought back in the future.."</li>
	 * </ul>
	 */
	public static final MMCode mmFutureBuyBackTrade = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FutureBuyBackTrade";
			definition = "The security will be bought back in the future..";
			owner_lazy = () -> TradeTypeCode.mmObject();
			codeName = "FBBT";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("BSKT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradeTypeCode";
				definition = "Specifies the type of executed order.";
				code_lazy = () -> Arrays.asList(TradeTypeCode.mmBasket, TradeTypeCode.mmIndex, TradeTypeCode.mmList, TradeTypeCode.mmPreAllocation, TradeTypeCode.mmProgram, TradeTypeCode.mmTrade, TradeTypeCode.mmBrokerToBroker,
						TradeTypeCode.mmFundToFund, TradeTypeCode.mmRiskTrade, TradeTypeCode.mmVWAPGuarantee, TradeTypeCode.mmAgency, TradeTypeCode.mmGuaranteedClose, TradeTypeCode.mmOnOrderBookTrade, TradeTypeCode.mmLinkedTrade,
						TradeTypeCode.mmTradeGiveUp, TradeTypeCode.mmCorrectiveTrade, TradeTypeCode.mmBackUpTrade, TradeTypeCode.mmOffOrderBookTrade, TradeTypeCode.mmEmployeeTradeReporting, TradeTypeCode.mmIPO,
						TradeTypeCode.mmOfferingIssuingTrade, TradeTypeCode.mmIssuance, TradeTypeCode.mmBondRepricing, TradeTypeCode.mmBondSubstitution, TradeTypeCode.mmBondEnd, TradeTypeCode.mmBondStart,
						TradeTypeCode.mmLendingAndBorrowing, TradeTypeCode.mmFutures, TradeTypeCode.mmOptions, TradeTypeCode.mmFuturesOption, TradeTypeCode.mmFutureBuyBackTrade);
			}
		});
		return mmObject_lazy.get();
	}
}