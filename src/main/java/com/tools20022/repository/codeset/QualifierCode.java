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
 * Qualifies the use of the quote or the indication of interest.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.QualifierCode#mmAllOrNone
 * QualifierCode.mmAllOrNone}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QualifierCode#mmMarketOnClose
 * QualifierCode.mmMarketOnClose}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.QualifierCode#mmAtClose
 * QualifierCode.mmAtClose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QualifierCode#mmVolumeWeightedAveragePrice
 * QualifierCode.mmVolumeWeightedAveragePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QualifierCode#mmInTouchWith
 * QualifierCode.mmInTouchWith}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.QualifierCode#mmLimit
 * QualifierCode.mmLimit}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.QualifierCode#mmMoreBehind
 * QualifierCode.mmMoreBehind}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.QualifierCode#mmAtOpen
 * QualifierCode.mmAtOpen}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QualifierCode#mmTakingPosition
 * QualifierCode.mmTakingPosition}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.QualifierCode#mmAtMarket
 * QualifierCode.mmAtMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QualifierCode#mmReadyToTrade
 * QualifierCode.mmReadyToTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QualifierCode#mmPortfolioShown
 * QualifierCode.mmPortfolioShown}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.QualifierCode#mmThroughDay
 * QualifierCode.mmThroughDay}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.QualifierCode#mmVersus
 * QualifierCode.mmVersus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QualifierCode#mmWorkingAway
 * QualifierCode.mmWorkingAway}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.QualifierCode#mmCrossing
 * QualifierCode.mmCrossing}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.QualifierCode#mmAtMidpoint
 * QualifierCode.mmAtMidpoint}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.QualifierCode#mmPreOpen
 * QualifierCode.mmPreOpen}</li>
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
 * <li>"ALNO"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "QualifierCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Qualifies the use of the quote or the indication of interest."
 * </li>
 * </ul>
 */
public class QualifierCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * A limit order that is to be executed in its entirety or not at all (no
	 * partial transaction), and thus is testing the strength/conviction of the
	 * counterparty. Unlike a fill or kill order, all or none orders are not to
	 * be treated as cancelled if not executed as soon as it is represented in
	 * the trading crowd. Instead it remains alive until executed or cancelled.
	 * The making of "all or none" bids or offers in stocks is prohibited, and
	 * the making of "all or none" bids or offers in bonds is subject to the
	 * restrictions of Rule 61.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QualifierCode
	 * QualifierCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ALNO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllOrNone"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A limit order that is to be executed in its entirety or not at all (no partial transaction), and thus is testing the strength/conviction of the counterparty.  Unlike a fill or kill order, all or none orders are not to be treated as cancelled if not executed as soon as it is represented in the trading crowd.  Instead it remains alive until executed or cancelled.  The making of \"all or none\" bids or offers in stocks is prohibited, and the making of \"all or none\" bids or offers in bonds is subject to the restrictions of Rule 61."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAllOrNone = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllOrNone";
			definition = "A limit order that is to be executed in its entirety or not at all (no partial transaction), and thus is testing the strength/conviction of the counterparty.  Unlike a fill or kill order, all or none orders are not to be treated as cancelled if not executed as soon as it is represented in the trading crowd.  Instead it remains alive until executed or cancelled.  The making of \"all or none\" bids or offers in stocks is prohibited, and the making of \"all or none\" bids or offers in bonds is subject to the restrictions of Rule 61.";
			owner_lazy = () -> QualifierCode.mmObject();
			codeName = "ALNO";
		}
	};
	/**
	 * An order to trade stocks, options, or futures as close as possible to the
	 * market close.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QualifierCode
	 * QualifierCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MOCE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketOnClose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An order to trade stocks, options, or futures as close as possible to the market close."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmMarketOnClose = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketOnClose";
			definition = "An order to trade stocks, options, or futures as close as possible to the market close.";
			owner_lazy = () -> QualifierCode.mmObject();
			codeName = "MOCE";
		}
	};
	/**
	 * An all or none market order that is to be executed at the closing price
	 * of the security on the exchange. If the execution cannot be made under
	 * this condition, the order is to be treated as cancelled.
	 * 
	 * Note that this attribute does not apply to trading of fixed income
	 * securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QualifierCode
	 * QualifierCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLOS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AtClose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An all or none market order that is to be executed at the closing price of the security on the exchange.  If the execution cannot be made under this condition, the order is to be treated as cancelled.\n\nNote that this attribute does not apply to trading of fixed income securities."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAtClose = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AtClose";
			definition = "An all or none market order that is to be executed at the closing price of the security on the exchange.  If the execution cannot be made under this condition, the order is to be treated as cancelled.\n\nNote that this attribute does not apply to trading of fixed income securities.";
			owner_lazy = () -> QualifierCode.mmObject();
			codeName = "CLOS";
		}
	};
	/**
	 * A trading benchmark particularly used in pension plans. Calculated by
	 * adding up the dollars traded for every transaction (price times shares
	 * traded) and then dividing by the total shares traded for the day for the
	 * particular security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QualifierCode
	 * QualifierCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VWAP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VolumeWeightedAveragePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A trading benchmark particularly used in pension plans. Calculated by adding up the dollars traded for every transaction (price times shares traded) and then dividing by the total shares traded for the day for the particular security."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmVolumeWeightedAveragePrice = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VolumeWeightedAveragePrice";
			definition = "A trading benchmark particularly used in pension plans. Calculated by adding up the dollars traded for every transaction (price times shares traded) and then dividing by the total shares traded for the day for the particular security.";
			owner_lazy = () -> QualifierCode.mmObject();
			codeName = "VWAP";
		}
	};
	/**
	 * Having a sell inquiry in a security (not a firm customer sell order),
	 * often entailing a capital commitment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QualifierCode
	 * QualifierCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ITOW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InTouchWith"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Having a sell inquiry in a security (not a firm customer sell order), often entailing a capital commitment."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInTouchWith = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InTouchWith";
			definition = "Having a sell inquiry in a security (not a firm customer sell order), often entailing a capital commitment.";
			owner_lazy = () -> QualifierCode.mmObject();
			codeName = "ITOW";
		}
	};
	/**
	 * An order to buy a stock at or below a specified price, or to sell a stock
	 * at or above a specified price. The customer specifies a price, and the
	 * order can be executed only if the market reaches or betters that price. A
	 * conditional trading order designed to avoid the danger of adverse
	 * unexpected price movements.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QualifierCode
	 * QualifierCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LIMI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Limit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An order to buy a stock at or below a specified price, or to sell a stock at or above a specified price.  The customer specifies a price, and the order can be executed only if the market reaches or betters that price.  A conditional trading order designed to avoid the danger of adverse unexpected price movements."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmLimit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Limit";
			definition = "An order to buy a stock at or below a specified price, or to sell a stock at or above a specified price.  The customer specifies a price, and the order can be executed only if the market reaches or betters that price.  A conditional trading order designed to avoid the danger of adverse unexpected price movements.";
			owner_lazy = () -> QualifierCode.mmObject();
			codeName = "LIMI";
		}
	};
	/**
	 * More security exists to be bought or sold by the same buyer or seller,
	 * respectively. Often, the buyer or seller does not disclose the full size
	 * of his buy or sell interest as not to affect the market adversely.
	 * 
	 * Information that the execution is taking place in waves/iceberg.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QualifierCode
	 * QualifierCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MOBH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MoreBehind"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "More security exists to be bought or sold by the same buyer or seller, respectively.  Often, the buyer or seller does not disclose the full size of his buy or sell interest as not to affect the market adversely.\n\nInformation that the execution is taking place in waves/iceberg."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmMoreBehind = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MoreBehind";
			definition = "More security exists to be bought or sold by the same buyer or seller, respectively.  Often, the buyer or seller does not disclose the full size of his buy or sell interest as not to affect the market adversely.\n\nInformation that the execution is taking place in waves/iceberg.";
			owner_lazy = () -> QualifierCode.mmObject();
			codeName = "MOBH";
		}
	};
	/**
	 * An order that is to be executed at the opening (and corresponding price)
	 * of the security or not at all, and any such order or portion thereof not
	 * executed is to be treated as cancelled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QualifierCode
	 * QualifierCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OPEN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AtOpen"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An order that is to be executed at the opening (and corresponding price) of the security or not at all, and any such order or portion thereof not executed is to be treated as cancelled."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAtOpen = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AtOpen";
			definition = "An order that is to be executed at the opening (and corresponding price) of the security or not at all, and any such order or portion thereof not executed is to be treated as cancelled.";
			owner_lazy = () -> QualifierCode.mmObject();
			codeName = "OPEN";
		}
	};
	/**
	 * A market commitment to purchase or sell securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QualifierCode
	 * QualifierCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "POSI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TakingPosition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "A market commitment to purchase or sell securities."</li>
	 * </ul>
	 */
	public static final MMCode mmTakingPosition = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TakingPosition";
			definition = "A market commitment to purchase or sell securities.";
			owner_lazy = () -> QualifierCode.mmObject();
			codeName = "POSI";
		}
	};
	/**
	 * An order to buy or sell a security at the most advantageous price
	 * obtainable after the order is represented in the trading crowd. Other
	 * special restrictions, such as all or none (AON) or good 'til cancelled
	 * (GTC), cannot be specified on a market order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QualifierCode
	 * QualifierCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MAKT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AtMarket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An order to buy or sell a security at the most advantageous price obtainable after the order is represented in the trading crowd.  Other special restrictions, such as all or none (AON) or good 'til cancelled (GTC), cannot be specified on a market order."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAtMarket = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AtMarket";
			definition = "An order to buy or sell a security at the most advantageous price obtainable after the order is represented in the trading crowd.  Other special restrictions, such as all or none (AON) or good 'til cancelled (GTC), cannot be specified on a market order.";
			owner_lazy = () -> QualifierCode.mmObject();
			codeName = "MAKT";
		}
	};
	/**
	 * All of the information necessary to generate an order is present and is
	 * considered an offer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QualifierCode
	 * QualifierCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RTRA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReadyToTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All of the information necessary to generate an order is present and is considered an offer."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmReadyToTrade = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReadyToTrade";
			definition = "All of the information necessary to generate an order is present and is considered an offer.";
			owner_lazy = () -> QualifierCode.mmObject();
			codeName = "RTRA";
		}
	};
	/**
	 * A collection of investments, real and/or financial, with distribution by
	 * geographic region or by asset type of the portfolio's holdings.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QualifierCode
	 * QualifierCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "POSH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PortfolioShown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A collection of investments, real and/or financial, with distribution by geographic region or by asset type of the portfolio's holdings."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPortfolioShown = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PortfolioShown";
			definition = "A collection of investments, real and/or financial, with distribution by geographic region or by asset type of the portfolio's holdings.";
			owner_lazy = () -> QualifierCode.mmObject();
			codeName = "POSH";
		}
	};
	/**
	 * Working the order through the day.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QualifierCode
	 * QualifierCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TDAY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ThroughDay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Working the order through the day."</li>
	 * </ul>
	 */
	public static final MMCode mmThroughDay = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThroughDay";
			definition = "Working the order through the day.";
			owner_lazy = () -> QualifierCode.mmObject();
			codeName = "TDAY";
		}
	};
	/**
	 * Indication sent versus the current quote.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QualifierCode
	 * QualifierCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VERS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Versus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indication sent versus the current quote."</li>
	 * </ul>
	 */
	public static final MMCode mmVersus = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Versus";
			definition = "Indication sent versus the current quote.";
			owner_lazy = () -> QualifierCode.mmObject();
			codeName = "VERS";
		}
	};
	/**
	 * Transacting with another broker/dealer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QualifierCode
	 * QualifierCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AWAY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WorkingAway"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transacting with another broker/dealer."</li>
	 * </ul>
	 */
	public static final MMCode mmWorkingAway = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WorkingAway";
			definition = "Transacting with another broker/dealer.";
			owner_lazy = () -> QualifierCode.mmObject();
			codeName = "AWAY";
		}
	};
	/**
	 * Securities transaction in which the same broker acts as agent for both
	 * sides of the trade; a legal practice only if the broker first offers the
	 * securities publicly at a price higher than the bid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QualifierCode
	 * QualifierCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CROS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Crossing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities transaction in which the same broker acts as agent for both sides of the trade; a legal practice only if the broker first offers the securities publicly at a price higher than the bid."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCrossing = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Crossing";
			definition = "Securities transaction in which the same broker acts as agent for both sides of the trade; a legal practice only if the broker first offers the securities publicly at a price higher than the bid.";
			owner_lazy = () -> QualifierCode.mmObject();
			codeName = "CROS";
		}
	};
	/**
	 * An all or none market order that is to be executed at the mid price
	 * spread of the security on the exchange. If the execution cannot be made
	 * under this condition, the order is to be treated as cancelled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QualifierCode
	 * QualifierCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MIDP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AtMidpoint"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An all or none market order that is to be executed at the mid price spread of the security on the exchange.  If the execution cannot be made under this condition, the order is to be treated as cancelled."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAtMidpoint = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AtMidpoint";
			definition = "An all or none market order that is to be executed at the mid price spread of the security on the exchange.  If the execution cannot be made under this condition, the order is to be treated as cancelled.";
			owner_lazy = () -> QualifierCode.mmObject();
			codeName = "MIDP";
		}
	};
	/**
	 * Price of security prior to a market opening.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QualifierCode
	 * QualifierCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PREO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreOpen"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price of security prior to a market opening."</li>
	 * </ul>
	 */
	public static final MMCode mmPreOpen = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreOpen";
			definition = "Price of security prior to a market opening.";
			owner_lazy = () -> QualifierCode.mmObject();
			codeName = "PREO";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("ALNO");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "QualifierCode";
				definition = "Qualifies the use of the quote or the indication of interest.";
				code_lazy = () -> Arrays.asList(QualifierCode.mmAllOrNone, QualifierCode.mmMarketOnClose, QualifierCode.mmAtClose, QualifierCode.mmVolumeWeightedAveragePrice, QualifierCode.mmInTouchWith, QualifierCode.mmLimit,
						QualifierCode.mmMoreBehind, QualifierCode.mmAtOpen, QualifierCode.mmTakingPosition, QualifierCode.mmAtMarket, QualifierCode.mmReadyToTrade, QualifierCode.mmPortfolioShown, QualifierCode.mmThroughDay,
						QualifierCode.mmVersus, QualifierCode.mmWorkingAway, QualifierCode.mmCrossing, QualifierCode.mmAtMidpoint, QualifierCode.mmPreOpen);
			}
		});
		return mmObject_lazy.get();
	}
}