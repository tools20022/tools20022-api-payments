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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.QualifierCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Qualifies the use of the quote or the indication of interest.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.QualifierCode#AllOrNone
 * QualifierCode.AllOrNone}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QualifierCode#MarketOnClose
 * QualifierCode.MarketOnClose}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.QualifierCode#AtClose
 * QualifierCode.AtClose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QualifierCode#VolumeWeightedAveragePrice
 * QualifierCode.VolumeWeightedAveragePrice}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.QualifierCode#InTouchWith
 * QualifierCode.InTouchWith}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.QualifierCode#Limit
 * QualifierCode.Limit}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.QualifierCode#MoreBehind
 * QualifierCode.MoreBehind}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.QualifierCode#AtOpen
 * QualifierCode.AtOpen}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QualifierCode#TakingPosition
 * QualifierCode.TakingPosition}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.QualifierCode#AtMarket
 * QualifierCode.AtMarket}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.QualifierCode#ReadyToTrade
 * QualifierCode.ReadyToTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QualifierCode#PortfolioShown
 * QualifierCode.PortfolioShown}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.QualifierCode#ThroughDay
 * QualifierCode.ThroughDay}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.QualifierCode#Versus
 * QualifierCode.Versus}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.QualifierCode#WorkingAway
 * QualifierCode.WorkingAway}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.QualifierCode#Crossing
 * QualifierCode.Crossing}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.QualifierCode#AtMidpoint
 * QualifierCode.AtMidpoint}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.QualifierCode#PreOpen
 * QualifierCode.PreOpen}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class QualifierCode extends MMCode {

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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22a::TOOR//ALNO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllOrNone"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A limit order that is to be executed in its entirety or not at all (no partial transaction), and thus is testing the strength/conviction of the counterparty. Unlike a fill or kill order, all or none orders are not to be treated as cancelled if not executed as soon as it is represented in the trading crowd. Instead it remains alive until executed or cancelled. The making of \"all or none\" bids or offers in stocks is prohibited, and the making of \"all or none\" bids or offers in bonds is subject to the restrictions of Rule 61."
	 * </li>
	 * </ul>
	 */
	public static final QualifierCode AllOrNone = new QualifierCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22a::TOOR//ALNO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllOrNone";
			definition = "A limit order that is to be executed in its entirety or not at all (no partial transaction), and thus is testing the strength/conviction of the counterparty. Unlike a fill or kill order, all or none orders are not to be treated as cancelled if not executed as soon as it is represented in the trading crowd. Instead it remains alive until executed or cancelled. The making of \"all or none\" bids or offers in stocks is prohibited, and the making of \"all or none\" bids or offers in bonds is subject to the restrictions of Rule 61.";
			owner_lazy = () -> com.tools20022.repository.codeset.QualifierCode.mmObject();
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
	public static final QualifierCode MarketOnClose = new QualifierCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketOnClose";
			definition = "An order to trade stocks, options, or futures as close as possible to the market close.";
			owner_lazy = () -> com.tools20022.repository.codeset.QualifierCode.mmObject();
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22a::TILI//CLOS</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AtClose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An all or none market order that is to be executed at the closing price of the security on the exchange. If the execution cannot be made under this condition, the order is to be treated as cancelled.\n\nNote that this attribute does not apply to trading of fixed income securities."
	 * </li>
	 * </ul>
	 */
	public static final QualifierCode AtClose = new QualifierCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22a::TILI//CLOS"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AtClose";
			definition = "An all or none market order that is to be executed at the closing price of the security on the exchange. If the execution cannot be made under this condition, the order is to be treated as cancelled.\n\nNote that this attribute does not apply to trading of fixed income securities.";
			owner_lazy = () -> com.tools20022.repository.codeset.QualifierCode.mmObject();
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
	public static final QualifierCode VolumeWeightedAveragePrice = new QualifierCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VolumeWeightedAveragePrice";
			definition = "A trading benchmark particularly used in pension plans. Calculated by adding up the dollars traded for every transaction (price times shares traded) and then dividing by the total shares traded for the day for the particular security.";
			owner_lazy = () -> com.tools20022.repository.codeset.QualifierCode.mmObject();
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
	public static final QualifierCode InTouchWith = new QualifierCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InTouchWith";
			definition = "Having a sell inquiry in a security (not a firm customer sell order), often entailing a capital commitment.";
			owner_lazy = () -> com.tools20022.repository.codeset.QualifierCode.mmObject();
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22a:TOOR//LMTO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Limit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An order to buy a stock at or below a specified price, or to sell a stock at or above a specified price. The customer specifies a price, and the order can be executed only if the market reaches or betters that price. A conditional trading order designed to avoid the danger of adverse unexpected price movements."
	 * </li>
	 * </ul>
	 */
	public static final QualifierCode Limit = new QualifierCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22a:TOOR//LMTO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Limit";
			definition = "An order to buy a stock at or below a specified price, or to sell a stock at or above a specified price. The customer specifies a price, and the order can be executed only if the market reaches or betters that price. A conditional trading order designed to avoid the danger of adverse unexpected price movements.";
			owner_lazy = () -> com.tools20022.repository.codeset.QualifierCode.mmObject();
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
	 * "More security exists to be bought or sold by the same buyer or seller, respectively. Often, the buyer or seller does not disclose the full size of his buy or sell interest as not to affect the market adversely.\n\nInformation that the execution is taking place in waves/iceberg."
	 * </li>
	 * </ul>
	 */
	public static final QualifierCode MoreBehind = new QualifierCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MoreBehind";
			definition = "More security exists to be bought or sold by the same buyer or seller, respectively. Often, the buyer or seller does not disclose the full size of his buy or sell interest as not to affect the market adversely.\n\nInformation that the execution is taking place in waves/iceberg.";
			owner_lazy = () -> com.tools20022.repository.codeset.QualifierCode.mmObject();
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22a::TILI//OPEN</li>
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
	public static final QualifierCode AtOpen = new QualifierCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22a::TILI//OPEN"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AtOpen";
			definition = "An order that is to be executed at the opening (and corresponding price) of the security or not at all, and any such order or portion thereof not executed is to be treated as cancelled.";
			owner_lazy = () -> com.tools20022.repository.codeset.QualifierCode.mmObject();
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
	public static final QualifierCode TakingPosition = new QualifierCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TakingPosition";
			definition = "A market commitment to purchase or sell securities.";
			owner_lazy = () -> com.tools20022.repository.codeset.QualifierCode.mmObject();
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22a::TOOR//MAKT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AtMarket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An order to buy or sell a security at the most advantageous price obtainable after the order is represented in the trading crowd. Other special restrictions, such as all or none (AON) or good 'til cancelled (GTC), cannot be specified on a market order."
	 * </li>
	 * </ul>
	 */
	public static final QualifierCode AtMarket = new QualifierCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22a::TOOR//MAKT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AtMarket";
			definition = "An order to buy or sell a security at the most advantageous price obtainable after the order is represented in the trading crowd. Other special restrictions, such as all or none (AON) or good 'til cancelled (GTC), cannot be specified on a market order.";
			owner_lazy = () -> com.tools20022.repository.codeset.QualifierCode.mmObject();
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
	public static final QualifierCode ReadyToTrade = new QualifierCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReadyToTrade";
			definition = "All of the information necessary to generate an order is present and is considered an offer.";
			owner_lazy = () -> com.tools20022.repository.codeset.QualifierCode.mmObject();
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
	public static final QualifierCode PortfolioShown = new QualifierCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PortfolioShown";
			definition = "A collection of investments, real and/or financial, with distribution by geographic region or by asset type of the portfolio's holdings.";
			owner_lazy = () -> com.tools20022.repository.codeset.QualifierCode.mmObject();
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
	public static final QualifierCode ThroughDay = new QualifierCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThroughDay";
			definition = "Working the order through the day.";
			owner_lazy = () -> com.tools20022.repository.codeset.QualifierCode.mmObject();
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
	public static final QualifierCode Versus = new QualifierCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Versus";
			definition = "Indication sent versus the current quote.";
			owner_lazy = () -> com.tools20022.repository.codeset.QualifierCode.mmObject();
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
	public static final QualifierCode WorkingAway = new QualifierCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WorkingAway";
			definition = "Transacting with another broker/dealer.";
			owner_lazy = () -> com.tools20022.repository.codeset.QualifierCode.mmObject();
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
	public static final QualifierCode Crossing = new QualifierCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Crossing";
			definition = "Securities transaction in which the same broker acts as agent for both sides of the trade; a legal practice only if the broker first offers the securities publicly at a price higher than the bid.";
			owner_lazy = () -> com.tools20022.repository.codeset.QualifierCode.mmObject();
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
	 * "An all or none market order that is to be executed at the mid price spread of the security on the exchange. If the execution cannot be made under this condition, the order is to be treated as cancelled."
	 * </li>
	 * </ul>
	 */
	public static final QualifierCode AtMidpoint = new QualifierCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AtMidpoint";
			definition = "An all or none market order that is to be executed at the mid price spread of the security on the exchange. If the execution cannot be made under this condition, the order is to be treated as cancelled.";
			owner_lazy = () -> com.tools20022.repository.codeset.QualifierCode.mmObject();
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
	public static final QualifierCode PreOpen = new QualifierCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreOpen";
			definition = "Price of security prior to a market opening.";
			owner_lazy = () -> com.tools20022.repository.codeset.QualifierCode.mmObject();
			codeName = "PREO";
		}
	};
	final static private LinkedHashMap<String, QualifierCode> codesByName = new LinkedHashMap<>();

	protected QualifierCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ALNO");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "QualifierCode";
				definition = "Qualifies the use of the quote or the indication of interest.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.QualifierCode.AllOrNone, com.tools20022.repository.codeset.QualifierCode.MarketOnClose, com.tools20022.repository.codeset.QualifierCode.AtClose,
						com.tools20022.repository.codeset.QualifierCode.VolumeWeightedAveragePrice, com.tools20022.repository.codeset.QualifierCode.InTouchWith, com.tools20022.repository.codeset.QualifierCode.Limit,
						com.tools20022.repository.codeset.QualifierCode.MoreBehind, com.tools20022.repository.codeset.QualifierCode.AtOpen, com.tools20022.repository.codeset.QualifierCode.TakingPosition,
						com.tools20022.repository.codeset.QualifierCode.AtMarket, com.tools20022.repository.codeset.QualifierCode.ReadyToTrade, com.tools20022.repository.codeset.QualifierCode.PortfolioShown,
						com.tools20022.repository.codeset.QualifierCode.ThroughDay, com.tools20022.repository.codeset.QualifierCode.Versus, com.tools20022.repository.codeset.QualifierCode.WorkingAway,
						com.tools20022.repository.codeset.QualifierCode.Crossing, com.tools20022.repository.codeset.QualifierCode.AtMidpoint, com.tools20022.repository.codeset.QualifierCode.PreOpen);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AllOrNone.getCodeName().get(), AllOrNone);
		codesByName.put(MarketOnClose.getCodeName().get(), MarketOnClose);
		codesByName.put(AtClose.getCodeName().get(), AtClose);
		codesByName.put(VolumeWeightedAveragePrice.getCodeName().get(), VolumeWeightedAveragePrice);
		codesByName.put(InTouchWith.getCodeName().get(), InTouchWith);
		codesByName.put(Limit.getCodeName().get(), Limit);
		codesByName.put(MoreBehind.getCodeName().get(), MoreBehind);
		codesByName.put(AtOpen.getCodeName().get(), AtOpen);
		codesByName.put(TakingPosition.getCodeName().get(), TakingPosition);
		codesByName.put(AtMarket.getCodeName().get(), AtMarket);
		codesByName.put(ReadyToTrade.getCodeName().get(), ReadyToTrade);
		codesByName.put(PortfolioShown.getCodeName().get(), PortfolioShown);
		codesByName.put(ThroughDay.getCodeName().get(), ThroughDay);
		codesByName.put(Versus.getCodeName().get(), Versus);
		codesByName.put(WorkingAway.getCodeName().get(), WorkingAway);
		codesByName.put(Crossing.getCodeName().get(), Crossing);
		codesByName.put(AtMidpoint.getCodeName().get(), AtMidpoint);
		codesByName.put(PreOpen.getCodeName().get(), PreOpen);
	}

	public static QualifierCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static QualifierCode[] values() {
		QualifierCode[] values = new QualifierCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, QualifierCode> {
		@Override
		public QualifierCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(QualifierCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}