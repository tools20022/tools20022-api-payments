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
import com.tools20022.repository.codeset.TradeTransactionConditionCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates the conditions under which the order/trade is to be/was executed.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#CumBonus
 * TradeTransactionConditionCode.mmCumBonus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#ExBonus
 * TradeTransactionConditionCode.mmExBonus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#CumCoupon
 * TradeTransactionConditionCode.mmCumCoupon}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#ExCoupon
 * TradeTransactionConditionCode.mmExCoupon}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#CumDividend
 * TradeTransactionConditionCode.mmCumDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#ExDividend
 * TradeTransactionConditionCode.mmExDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#CumRights
 * TradeTransactionConditionCode.mmCumRights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#ExRights
 * TradeTransactionConditionCode.mmExRights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#CumWarrant
 * TradeTransactionConditionCode.mmCumWarrant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#ExWarrant
 * TradeTransactionConditionCode.mmExWarrant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#SpecialCumDividend
 * TradeTransactionConditionCode.mmSpecialCumDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#SpecialExDividend
 * TradeTransactionConditionCode.mmSpecialExDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#BrokerDueBill
 * TradeTransactionConditionCode.mmBrokerDueBill}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#SoldShort
 * TradeTransactionConditionCode.mmSoldShort}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#Dirty
 * TradeTransactionConditionCode.mmDirty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#Clean
 * TradeTransactionConditionCode.mmClean}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#Block
 * TradeTransactionConditionCode.mmBlock}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#GuaranteedDelivery
 * TradeTransactionConditionCode.mmGuaranteedDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#Fractions
 * TradeTransactionConditionCode.mmFractions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#CrossTrade
 * TradeTransactionConditionCode.mmCrossTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#NoCrossTrade
 * TradeTransactionConditionCode.mmNoCrossTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#DirectOrder
 * TradeTransactionConditionCode.mmDirectOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#DirectedOrder
 * TradeTransactionConditionCode.mmDirectedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#WarehouseTrade
 * TradeTransactionConditionCode.mmWarehouseTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#NotIncrease
 * TradeTransactionConditionCode.mmNotIncrease}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#NotReduce
 * TradeTransactionConditionCode.mmNotReduce}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#ForwardPriceTrade
 * TradeTransactionConditionCode.mmForwardPriceTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#HistoricPriceTrade
 * TradeTransactionConditionCode.mmHistoricPriceTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#ResultOption
 * TradeTransactionConditionCode.mmResultOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#ResultRepo
 * TradeTransactionConditionCode.mmResultRepo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#DeliverCountryIncorporation
 * TradeTransactionConditionCode.mmDeliverCountryIncorporation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#DeliveryForm
 * TradeTransactionConditionCode.mmDeliveryForm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#BoardLot
 * TradeTransactionConditionCode.mmBoardLot}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#BadName
 * TradeTransactionConditionCode.mmBadName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#Automated
 * TradeTransactionConditionCode.mmAutomated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#BestExecution
 * TradeTransactionConditionCode.mmBestExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#Call
 * TradeTransactionConditionCode.mmCall}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#ClosureBeforeRollOver
 * TradeTransactionConditionCode.mmClosureBeforeRollOver}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#Monthly
 * TradeTransactionConditionCode.mmMonthly}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#NewTradeFollowingRollover
 * TradeTransactionConditionCode.mmNewTradeFollowingRollover}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#Putt
 * TradeTransactionConditionCode.mmPutt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#TradeFollowingRollover
 * TradeTransactionConditionCode.mmTradeFollowingRollover}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#SpecialCumCoupon
 * TradeTransactionConditionCode.mmSpecialCumCoupon}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#SpecialExCoupon
 * TradeTransactionConditionCode.mmSpecialExCoupon}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#SpecialExBonus
 * TradeTransactionConditionCode.mmSpecialExBonus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#SpecialCumBonus
 * TradeTransactionConditionCode.mmSpecialCumBonus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#SpecialCumRights
 * TradeTransactionConditionCode.mmSpecialCumRights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#SpecialExRights
 * TradeTransactionConditionCode.mmSpecialExRights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#SpecialCumCapitalRepayments
 * TradeTransactionConditionCode.mmSpecialCumCapitalRepayments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#SpecialExCapitalRepayments
 * TradeTransactionConditionCode.mmSpecialExCapitalRepayments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#CashSettlement
 * TradeTransactionConditionCode.mmCashSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#SpecialPrice
 * TradeTransactionConditionCode.mmSpecialPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#MarketPrice
 * TradeTransactionConditionCode.mmMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#NegotiatedTrade
 * TradeTransactionConditionCode.mmNegotiatedTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#NonMarketPrice
 * TradeTransactionConditionCode.mmNonMarketPrice}</li>
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
 * <li>"CBNS"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradeTransactionConditionCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates the conditions under which the order/trade is to be/was executed."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TradeTransactionConditionCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates whether the trade is executed cum bonus.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode
	 * TradeTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CBNS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CumBonus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the trade is executed cum bonus."</li>
	 * </ul>
	 */
	public static final TradeTransactionConditionCode CumBonus = new TradeTransactionConditionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CumBonus";
			definition = "Indicates whether the trade is executed cum bonus.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionConditionCode.mmObject();
			codeName = "CBNS";
		}
	};
	/**
	 * Indicates whether the trade is executed ex bonus.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode
	 * TradeTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "XBNS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExBonus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the trade is executed ex bonus."</li>
	 * </ul>
	 */
	public static final TradeTransactionConditionCode ExBonus = new TradeTransactionConditionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExBonus";
			definition = "Indicates whether the trade is executed ex bonus.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionConditionCode.mmObject();
			codeName = "XBNS";
		}
	};
	/**
	 * Indicates whether the trade is executed cum coupon.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode
	 * TradeTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CCPN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CumCoupon"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the trade is executed cum coupon."</li>
	 * </ul>
	 */
	public static final TradeTransactionConditionCode CumCoupon = new TradeTransactionConditionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CumCoupon";
			definition = "Indicates whether the trade is executed cum coupon.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionConditionCode.mmObject();
			codeName = "CCPN";
		}
	};
	/**
	 * Indicates whether the trade is executed ex coupon.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode
	 * TradeTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "XCPN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExCoupon"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the trade is executed ex coupon."</li>
	 * </ul>
	 */
	public static final TradeTransactionConditionCode ExCoupon = new TradeTransactionConditionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExCoupon";
			definition = "Indicates whether the trade is executed ex coupon.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionConditionCode.mmObject();
			codeName = "XCPN";
		}
	};
	/**
	 * Indicates whether the trade is executed cum dividend.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode
	 * TradeTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CDIV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CumDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the trade is executed cum dividend."</li>
	 * </ul>
	 */
	public static final TradeTransactionConditionCode CumDividend = new TradeTransactionConditionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CumDividend";
			definition = "Indicates whether the trade is executed cum dividend.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionConditionCode.mmObject();
			codeName = "CDIV";
		}
	};
	/**
	 * Indicates whether the trade is executed ex dividend.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode
	 * TradeTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "XDIV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the trade is executed ex dividend."</li>
	 * </ul>
	 */
	public static final TradeTransactionConditionCode ExDividend = new TradeTransactionConditionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExDividend";
			definition = "Indicates whether the trade is executed ex dividend.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionConditionCode.mmObject();
			codeName = "XDIV";
		}
	};
	/**
	 * Indicates whether the trade is executed cum rights.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode
	 * TradeTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRTS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CumRights"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the trade is executed cum rights."</li>
	 * </ul>
	 */
	public static final TradeTransactionConditionCode CumRights = new TradeTransactionConditionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CumRights";
			definition = "Indicates whether the trade is executed cum rights.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionConditionCode.mmObject();
			codeName = "CRTS";
		}
	};
	/**
	 * Indicates whether the trade is executed ex rights.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode
	 * TradeTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "XRTS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExRights"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the trade is executed ex rights."</li>
	 * </ul>
	 */
	public static final TradeTransactionConditionCode ExRights = new TradeTransactionConditionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExRights";
			definition = "Indicates whether the trade is executed ex rights.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionConditionCode.mmObject();
			codeName = "XRTS";
		}
	};
	/**
	 * Indicates whether the trade is executed cum warrant.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode
	 * TradeTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CWAR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CumWarrant"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the trade is executed cum warrant."</li>
	 * </ul>
	 */
	public static final TradeTransactionConditionCode CumWarrant = new TradeTransactionConditionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CumWarrant";
			definition = "Indicates whether the trade is executed cum warrant.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionConditionCode.mmObject();
			codeName = "CWAR";
		}
	};
	/**
	 * Indicates whether the trade is executed ex warrant.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode
	 * TradeTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "XWAR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExWarrant"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the trade is executed ex warrant."</li>
	 * </ul>
	 */
	public static final TradeTransactionConditionCode ExWarrant = new TradeTransactionConditionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExWarrant";
			definition = "Indicates whether the trade is executed ex warrant.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionConditionCode.mmObject();
			codeName = "XWAR";
		}
	};
	/**
	 * Indicates whether the trade is executed with a special cum dividend, ie,
	 * buying after the ex date and getting the dividend.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode
	 * TradeTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPCU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialCumDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the trade is executed  with a special cum \ndividend, ie, buying after the ex date and getting the dividend."
	 * </li>
	 * </ul>
	 */
	public static final TradeTransactionConditionCode SpecialCumDividend = new TradeTransactionConditionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SpecialCumDividend";
			definition = "Indicates whether the trade is executed  with a special cum \ndividend, ie, buying after the ex date and getting the dividend.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionConditionCode.mmObject();
			codeName = "SPCU";
		}
	};
	/**
	 * Indicates whether the trade is executed with a special ex dividend, ie,
	 * selling before the ex date without the coupon.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode
	 * TradeTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPEX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialExDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the trade is executed  with a special ex \ndividend, ie, selling before the ex date without the coupon."
	 * </li>
	 * </ul>
	 */
	public static final TradeTransactionConditionCode SpecialExDividend = new TradeTransactionConditionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SpecialExDividend";
			definition = "Indicates whether the trade is executed  with a special ex \ndividend, ie, selling before the ex date without the coupon.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionConditionCode.mmObject();
			codeName = "SPEX";
		}
	};
	/**
	 * Indicates that the trade is executed cum-dividend or cum-coupon and a due
	 * bill is required. A due bill is a contractual agreement to pay the
	 * dividend along with the delivery of the financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode
	 * TradeTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DUEB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BrokerDueBill"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the trade is executed cum-dividend or cum-coupon and a due bill is required. \nA due bill is a contractual agreement to pay the dividend along with the delivery of \nthe financial instrument."
	 * </li>
	 * </ul>
	 */
	public static final TradeTransactionConditionCode BrokerDueBill = new TradeTransactionConditionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BrokerDueBill";
			definition = "Indicates that the trade is executed cum-dividend or cum-coupon and a due bill is required. \nA due bill is a contractual agreement to pay the dividend along with the delivery of \nthe financial instrument.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionConditionCode.mmObject();
			codeName = "DUEB";
		}
	};
	/**
	 * Indicates whether the trade is sold short. When the seller does not have
	 * the financial instrument, the delivery is effected by borrowing the
	 * financial instrument by or for the account of the seller.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode
	 * TradeTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSTI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SoldShort"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the trade is sold short. When the seller does not have the \nfinancial instrument, the delivery is effected by borrowing the financial instrument by or \nfor the account of the seller."
	 * </li>
	 * </ul>
	 */
	public static final TradeTransactionConditionCode SoldShort = new TradeTransactionConditionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SoldShort";
			definition = "Indicates whether the trade is sold short. When the seller does not have the \nfinancial instrument, the delivery is effected by borrowing the financial instrument by or \nfor the account of the seller.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionConditionCode.mmObject();
			codeName = "SSTI";
		}
	};
	/**
	 * Indicates that the trade is executed dirty, ie government tax must be
	 * paid on the accrued interest on the bond.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode
	 * TradeTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DIRT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Dirty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the trade is executed dirty, ie government tax must be paid on the accrued interest on the bond."
	 * </li>
	 * </ul>
	 */
	public static final TradeTransactionConditionCode Dirty = new TradeTransactionConditionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Dirty";
			definition = "Indicates that the trade is executed dirty, ie government tax must be paid on the accrued interest on the bond.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionConditionCode.mmObject();
			codeName = "DIRT";
		}
	};
	/**
	 * Indicates that the trade is executed clean, ie government tax must not be
	 * paid on the accrued interest on the bond.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode
	 * TradeTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLEN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Clean"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the trade is executed clean, ie government tax must not be paid on the accrued interest on the bond."
	 * </li>
	 * </ul>
	 */
	public static final TradeTransactionConditionCode Clean = new TradeTransactionConditionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Clean";
			definition = "Indicates that the trade is executed clean, ie government tax must not be paid on the accrued interest on the bond.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionConditionCode.mmObject();
			codeName = "CLEN";
		}
	};
	/**
	 * Indicates whether the trade is a block trade or not, ie, whether
	 * allocation instruction will follow or not.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode
	 * TradeTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BLKO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Block"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the trade is a block trade or not, ie, whether allocation instruction will follow or not."
	 * </li>
	 * </ul>
	 */
	public static final TradeTransactionConditionCode Block = new TradeTransactionConditionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Block";
			definition = "Indicates whether the trade is a block trade or not, ie, whether allocation instruction will follow or not.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionConditionCode.mmObject();
			codeName = "BLKO";
		}
	};
	/**
	 * Indicates whether the delivery of the financial instrument on settlement
	 * date is guaranteed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode
	 * TradeTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GTDL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GuaranteedDelivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the delivery of the financial instrument on settlement date \nis guaranteed."
	 * </li>
	 * </ul>
	 */
	public static final TradeTransactionConditionCode GuaranteedDelivery = new TradeTransactionConditionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GuaranteedDelivery";
			definition = "Indicates whether the delivery of the financial instrument on settlement date \nis guaranteed.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionConditionCode.mmObject();
			codeName = "GTDL";
		}
	};
	/**
	 * Indicates whether fractional parts are allowed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode
	 * TradeTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FRAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Fractions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether fractional parts are allowed."</li>
	 * </ul>
	 */
	public static final TradeTransactionConditionCode Fractions = new TradeTransactionConditionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Fractions";
			definition = "Indicates whether fractional parts are allowed.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionConditionCode.mmObject();
			codeName = "FRAC";
		}
	};
	/**
	 * Indicates that cross trades are allowed whereby buy and sell orders are
	 * offset without recording the trade on the exchange
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode
	 * TradeTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CrossTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that cross trades are allowed whereby buy and sell orders are offset without recording the trade on the exchange"
	 * </li>
	 * </ul>
	 */
	public static final TradeTransactionConditionCode CrossTrade = new TradeTransactionConditionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CrossTrade";
			definition = "Indicates that cross trades are allowed whereby buy and sell orders are offset without recording the trade on the exchange";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionConditionCode.mmObject();
			codeName = "CRST";
		}
	};
	/**
	 * Indicates that cross trades, whereby buy and sell orders are offset
	 * without recording the trade on the exchange, are not allowed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode
	 * TradeTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NCRS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoCrossTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that cross trades, whereby buy and sell orders are offset without recording the trade on the exchange, are not allowed."
	 * </li>
	 * </ul>
	 */
	public static final TradeTransactionConditionCode NoCrossTrade = new TradeTransactionConditionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NoCrossTrade";
			definition = "Indicates that cross trades, whereby buy and sell orders are offset without recording the trade on the exchange, are not allowed.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionConditionCode.mmObject();
			codeName = "NCRS";
		}
	};
	/**
	 * Indicates that the order is to be executed by a trading party other than
	 * the trading party to which the order is sent. In this case, the
	 * instructing party has traded with another broker which will subsequently
	 * send an advice of execution to the executing party who received the order
	 * and which is acting as clearing broker.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode
	 * TradeTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DORD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DirectOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the order is to be executed by a trading party other than the trading party to which the \norder is sent. In this case, the instructing party has traded with another broker which will \nsubsequently send an advice of execution to the executing party who received the order \nand which is acting as clearing broker."
	 * </li>
	 * </ul>
	 */
	public static final TradeTransactionConditionCode DirectOrder = new TradeTransactionConditionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DirectOrder";
			definition = "Indicates that the order is to be executed by a trading party other than the trading party to which the \norder is sent. In this case, the instructing party has traded with another broker which will \nsubsequently send an advice of execution to the executing party who received the order \nand which is acting as clearing broker.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionConditionCode.mmObject();
			codeName = "DORD";
		}
	};
	/**
	 * Indicates that the order must be executed with a specific trading party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode
	 * TradeTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DIOR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DirectedOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the order must be executed with a specific trading party."
	 * </li>
	 * </ul>
	 */
	public static final TradeTransactionConditionCode DirectedOrder = new TradeTransactionConditionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DirectedOrder";
			definition = "Indicates that the order must be executed with a specific trading party.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionConditionCode.mmObject();
			codeName = "DIOR";
		}
	};
	/**
	 * Warehouse Trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode
	 * TradeTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WARE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WarehouseTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Warehouse Trade."</li>
	 * </ul>
	 */
	public static final TradeTransactionConditionCode WarehouseTrade = new TradeTransactionConditionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WarehouseTrade";
			definition = "Warehouse Trade.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionConditionCode.mmObject();
			codeName = "WARE";
		}
	};
	/**
	 * A limit order to buy or a stop order to sell or a stop limit order which
	 * is not to be increased in shares on the ex-dividend date as a result of a
	 * stock dividend or distribution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode
	 * TradeTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DNIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotIncrease"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A limit order to buy or a stop order to sell or a stop limit order which is not to be increased in shares on the ex-dividend date as a result of a stock dividend or distribution."
	 * </li>
	 * </ul>
	 */
	public static final TradeTransactionConditionCode NotIncrease = new TradeTransactionConditionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotIncrease";
			definition = "A limit order to buy or a stop order to sell or a stop limit order which is not to be increased in shares on the ex-dividend date as a result of a stock dividend or distribution.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionConditionCode.mmObject();
			codeName = "DNIN";
		}
	};
	/**
	 * A limit order to buy or a stop order to sell, or a stop-limit order to
	 * sell which is not to be reduced in price by the amount of an ordinary
	 * cash dividend. Only applies to ordinary stock dividends; it should be
	 * reduced for other distributions. e.g. when a stock goes 'ex' stock
	 * dividend or rights.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode
	 * TradeTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DNRE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotReduce"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A limit order to buy or a stop order to sell, or a stop-limit order to sell which is not to be reduced in price by the amount of an ordinary cash dividend. Only applies to ordinary stock dividends; it should be reduced for other distributions. e.g. when a stock goes 'ex' stock dividend or rights."
	 * </li>
	 * </ul>
	 */
	public static final TradeTransactionConditionCode NotReduce = new TradeTransactionConditionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotReduce";
			definition = "A limit order to buy or a stop order to sell, or a stop-limit order to sell which is not to be reduced in price by the amount of an ordinary cash dividend. Only applies to ordinary stock dividends; it should be reduced for other distributions. e.g. when a stock goes 'ex' stock dividend or rights.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionConditionCode.mmObject();
			codeName = "DNRE";
		}
	};
	/**
	 * Indicates that the order is based on a forward price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode
	 * TradeTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FORW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForwardPriceTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates that the order is based on a forward price."</li>
	 * </ul>
	 */
	public static final TradeTransactionConditionCode ForwardPriceTrade = new TradeTransactionConditionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ForwardPriceTrade";
			definition = "Indicates that the order is based on a forward price.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionConditionCode.mmObject();
			codeName = "FORW";
		}
	};
	/**
	 * Indicates that the order is based on a historic price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode
	 * TradeTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HIST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HistoricPriceTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates that the order is based on a historic price."</li>
	 * </ul>
	 */
	public static final TradeTransactionConditionCode HistoricPriceTrade = new TradeTransactionConditionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "HistoricPriceTrade";
			definition = "Indicates that the order is based on a historic price.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionConditionCode.mmObject();
			codeName = "HIST";
		}
	};
	/**
	 * Result of option when set. (UK specific)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode
	 * TradeTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BCRO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResultOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Result of option when set. (UK specific)"</li>
	 * </ul>
	 */
	public static final TradeTransactionConditionCode ResultOption = new TradeTransactionConditionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ResultOption";
			definition = "Result of option when set. (UK specific)";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionConditionCode.mmObject();
			codeName = "BCRO";
		}
	};
	/**
	 * Result of repo when set (UK specific).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode
	 * TradeTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BCRP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResultRepo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Result of repo when set (UK specific)."</li>
	 * </ul>
	 */
	public static final TradeTransactionConditionCode ResultRepo = new TradeTransactionConditionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ResultRepo";
			definition = "Result of repo when set (UK specific).";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionConditionCode.mmObject();
			codeName = "BCRP";
		}
	};
	/**
	 * Place of delivery, in country of incorporation when unset (UK specific).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode
	 * TradeTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BCPD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverCountryIncorporation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Place of delivery, in country of incorporation when unset (UK specific)."
	 * </li>
	 * </ul>
	 */
	public static final TradeTransactionConditionCode DeliverCountryIncorporation = new TradeTransactionConditionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeliverCountryIncorporation";
			definition = "Place of delivery, in country of incorporation when unset (UK specific).";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionConditionCode.mmObject();
			codeName = "BCPD";
		}
	};
	/**
	 * Form of delivery, not for foreign registration when unset (UK specific).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode
	 * TradeTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BCFD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryForm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Form of delivery, not for foreign registration when unset (UK specific)."
	 * </li>
	 * </ul>
	 */
	public static final TradeTransactionConditionCode DeliveryForm = new TradeTransactionConditionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeliveryForm";
			definition = "Form of delivery, not for foreign registration when unset (UK specific).";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionConditionCode.mmObject();
			codeName = "BCFD";
		}
	};
	/**
	 * Board lots, not set for odd lots (UK specific).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode
	 * TradeTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BCBL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BoardLot"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Board lots, not set for odd lots (UK specific)."</li>
	 * </ul>
	 */
	public static final TradeTransactionConditionCode BoardLot = new TradeTransactionConditionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BoardLot";
			definition = "Board lots, not set for odd lots (UK specific).";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionConditionCode.mmObject();
			codeName = "BCBL";
		}
	};
	/**
	 * Bad names, not set for good names (UK specific).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode
	 * TradeTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BCBN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BadName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Bad names, not set for good names (UK specific)."</li>
	 * </ul>
	 */
	public static final TradeTransactionConditionCode BadName = new TradeTransactionConditionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BadName";
			definition = "Bad names, not set for good names (UK specific).";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionConditionCode.mmObject();
			codeName = "BCBN";
		}
	};
	/**
	 * Automated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode
	 * TradeTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AUTO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Automated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Automated."</li>
	 * </ul>
	 */
	public static final TradeTransactionConditionCode Automated = new TradeTransactionConditionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Automated";
			definition = "Automated.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionConditionCode.mmObject();
			codeName = "AUTO";
		}
	};
	/**
	 * Trade to be executed done at best execution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode
	 * TradeTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BTEX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BestExecution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade to be executed done at best execution."</li>
	 * </ul>
	 */
	public static final TradeTransactionConditionCode BestExecution = new TradeTransactionConditionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BestExecution";
			definition = "Trade to be executed done at best execution.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionConditionCode.mmObject();
			codeName = "BTEX";
		}
	};
	/**
	 * Trade to be executed following the exercise of a call option on the
	 * security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode
	 * TradeTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CALL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Call"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trade to be executed following the exercise of a call option on the security."
	 * </li>
	 * </ul>
	 */
	public static final TradeTransactionConditionCode Call = new TradeTransactionConditionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Call";
			definition = "Trade to be executed following the exercise of a call option on the security.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionConditionCode.mmObject();
			codeName = "CALL";
		}
	};
	/**
	 * Trade to be executed for closure of a previous position before the
	 * rollover of a position (Deferred Settlement Service).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode
	 * TradeTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLBR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosureBeforeRollOver"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trade to be executed for closure of a previous position before the rollover of a position (Deferred Settlement Service)."
	 * </li>
	 * </ul>
	 */
	public static final TradeTransactionConditionCode ClosureBeforeRollOver = new TradeTransactionConditionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClosureBeforeRollOver";
			definition = "Trade to be executed for closure of a previous position before the rollover of a position (Deferred Settlement Service).";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionConditionCode.mmObject();
			codeName = "CLBR";
		}
	};
	/**
	 * Trade to be executed for month-end settlement (Deferred Settlement
	 * Service).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode
	 * TradeTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MONT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Monthly"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trade to be executed for month-end settlement (Deferred Settlement Service)."
	 * </li>
	 * </ul>
	 */
	public static final TradeTransactionConditionCode Monthly = new TradeTransactionConditionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Monthly";
			definition = "Trade to be executed for month-end settlement (Deferred Settlement Service).";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionConditionCode.mmObject();
			codeName = "MONT";
		}
	};
	/**
	 * Trade to be executed for a new trade position on the next month following
	 * the roll-over of a position (Deferred Settlement Service).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode
	 * TradeTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NBFR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewTradeFollowingRollover"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trade to be executed for a new trade position on the next month following the roll-over of a position (Deferred Settlement Service)."
	 * </li>
	 * </ul>
	 */
	public static final TradeTransactionConditionCode NewTradeFollowingRollover = new TradeTransactionConditionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NewTradeFollowingRollover";
			definition = "Trade to be executed for a new trade position on the next month following the roll-over of a position (Deferred Settlement Service).";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionConditionCode.mmObject();
			codeName = "NBFR";
		}
	};
	/**
	 * Trade to be executed following the exercise of a put option on the
	 * security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode
	 * TradeTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PUTT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Putt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trade to be executed following the exercise of a put option on the security."
	 * </li>
	 * </ul>
	 */
	public static final TradeTransactionConditionCode Putt = new TradeTransactionConditionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Putt";
			definition = "Trade to be executed following the exercise of a put option on the security.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionConditionCode.mmObject();
			codeName = "PUTT";
		}
	};
	/**
	 * Trade to be executed on the next month following the roll-over of
	 * positions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode
	 * TradeTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRFR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeFollowingRollover"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trade to be executed on the next month following the roll-over of positions."
	 * </li>
	 * </ul>
	 */
	public static final TradeTransactionConditionCode TradeFollowingRollover = new TradeTransactionConditionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradeFollowingRollover";
			definition = "Trade to be executed on the next month following the roll-over of positions.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionConditionCode.mmObject();
			codeName = "TRFR";
		}
	};
	/**
	 * Indicates whether the trade is executed with a special cum coupon.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode
	 * TradeTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPCC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialCumCoupon"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the trade is executed with a special cum coupon."</li>
	 * </ul>
	 */
	public static final TradeTransactionConditionCode SpecialCumCoupon = new TradeTransactionConditionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SpecialCumCoupon";
			definition = "Indicates whether the trade is executed with a special cum coupon.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionConditionCode.mmObject();
			codeName = "SPCC";
		}
	};
	/**
	 * Indicates whether the trade is executed with a special ex coupon.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode
	 * TradeTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SECN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialExCoupon"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the trade is executed with a special ex coupon."</li>
	 * </ul>
	 */
	public static final TradeTransactionConditionCode SpecialExCoupon = new TradeTransactionConditionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SpecialExCoupon";
			definition = "Indicates whether the trade is executed with a special ex coupon.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionConditionCode.mmObject();
			codeName = "SECN";
		}
	};
	/**
	 * Indicates whether the trade is executed special ex bonus.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode
	 * TradeTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SEBN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialExBonus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the trade is executed special ex bonus."
	 * </li>
	 * </ul>
	 */
	public static final TradeTransactionConditionCode SpecialExBonus = new TradeTransactionConditionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SpecialExBonus";
			definition = "Indicates whether the trade is executed special ex bonus.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionConditionCode.mmObject();
			codeName = "SEBN";
		}
	};
	/**
	 * Indicates whether the trade is executed special cum bonus.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode
	 * TradeTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCBN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialCumBonus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the trade is executed special cum bonus."</li>
	 * </ul>
	 */
	public static final TradeTransactionConditionCode SpecialCumBonus = new TradeTransactionConditionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SpecialCumBonus";
			definition = "Indicates whether the trade is executed special cum bonus.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionConditionCode.mmObject();
			codeName = "SCBN";
		}
	};
	/**
	 * Indicates whether the trade is executed special cum rights.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode
	 * TradeTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCRT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialCumRights"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the trade is executed special cum rights."</li>
	 * </ul>
	 */
	public static final TradeTransactionConditionCode SpecialCumRights = new TradeTransactionConditionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SpecialCumRights";
			definition = "Indicates whether the trade is executed special cum rights.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionConditionCode.mmObject();
			codeName = "SCRT";
		}
	};
	/**
	 * Indicates whether the trade is executed special ex rights.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode
	 * TradeTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SERT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialExRights"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the trade is executed special ex rights."</li>
	 * </ul>
	 */
	public static final TradeTransactionConditionCode SpecialExRights = new TradeTransactionConditionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SpecialExRights";
			definition = "Indicates whether the trade is executed special ex rights.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionConditionCode.mmObject();
			codeName = "SERT";
		}
	};
	/**
	 * Indicates whether the trade is executed special cum capital repayments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode
	 * TradeTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCCR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialCumCapitalRepayments"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the trade is executed special cum capital repayments."
	 * </li>
	 * </ul>
	 */
	public static final TradeTransactionConditionCode SpecialCumCapitalRepayments = new TradeTransactionConditionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SpecialCumCapitalRepayments";
			definition = "Indicates whether the trade is executed special cum capital repayments.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionConditionCode.mmObject();
			codeName = "SCCR";
		}
	};
	/**
	 * Indicates whether the trade is executed special ex capital repayments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode
	 * TradeTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SECR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialExCapitalRepayments"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the trade is executed special ex capital repayments."</li>
	 * </ul>
	 */
	public static final TradeTransactionConditionCode SpecialExCapitalRepayments = new TradeTransactionConditionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SpecialExCapitalRepayments";
			definition = "Indicates whether the trade is executed special ex capital repayments.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionConditionCode.mmObject();
			codeName = "SECR";
		}
	};
	/**
	 * Indicates whether the trade is executed with a cash settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode
	 * TradeTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CAST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the trade is executed with a cash settlement."</li>
	 * </ul>
	 */
	public static final TradeTransactionConditionCode CashSettlement = new TradeTransactionConditionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashSettlement";
			definition = "Indicates whether the trade is executed with a cash settlement.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionConditionCode.mmObject();
			codeName = "CAST";
		}
	};
	/**
	 * Indicates whether the trade is executed with a special price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode
	 * TradeTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPPR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the trade is executed with a special price."</li>
	 * </ul>
	 */
	public static final TradeTransactionConditionCode SpecialPrice = new TradeTransactionConditionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SpecialPrice";
			definition = "Indicates whether the trade is executed with a special price.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionConditionCode.mmObject();
			codeName = "SPPR";
		}
	};
	/**
	 * Trade was executed at market price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode
	 * TradeTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MAPR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade was executed at market price."</li>
	 * </ul>
	 */
	public static final TradeTransactionConditionCode MarketPrice = new TradeTransactionConditionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MarketPrice";
			definition = "Trade was executed at market price.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionConditionCode.mmObject();
			codeName = "MAPR";
		}
	};
	/**
	 * Trade for which the price is not the one quoted but an improved one, that
	 * is, the negotiated price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode
	 * TradeTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NEGO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NegotiatedTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trade for which the price is not the one quoted but an improved one, that is, the negotiated price."
	 * </li>
	 * </ul>
	 */
	public static final TradeTransactionConditionCode NegotiatedTrade = new TradeTransactionConditionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NegotiatedTrade";
			definition = "Trade for which the price is not the one quoted but an improved one, that is, the negotiated price.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionConditionCode.mmObject();
			codeName = "NEGO";
		}
	};
	/**
	 * Trade was executed outside of normal market conditions, for example, in
	 * the case of an iceberg order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode
	 * TradeTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NMPR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonMarketPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trade was executed outside of normal market conditions, for example, in the case of an iceberg order."
	 * </li>
	 * </ul>
	 */
	public static final TradeTransactionConditionCode NonMarketPrice = new TradeTransactionConditionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NonMarketPrice";
			definition = "Trade was executed outside of normal market conditions, for example, in the case of an iceberg order.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionConditionCode.mmObject();
			codeName = "NMPR";
		}
	};
	final static private LinkedHashMap<String, TradeTransactionConditionCode> codesByName = new LinkedHashMap<>();

	protected TradeTransactionConditionCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("CBNS");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradeTransactionConditionCode";
				definition = "Indicates the conditions under which the order/trade is to be/was executed.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TradeTransactionConditionCode.CumBonus, com.tools20022.repository.codeset.TradeTransactionConditionCode.ExBonus,
						com.tools20022.repository.codeset.TradeTransactionConditionCode.CumCoupon, com.tools20022.repository.codeset.TradeTransactionConditionCode.ExCoupon,
						com.tools20022.repository.codeset.TradeTransactionConditionCode.CumDividend, com.tools20022.repository.codeset.TradeTransactionConditionCode.ExDividend,
						com.tools20022.repository.codeset.TradeTransactionConditionCode.CumRights, com.tools20022.repository.codeset.TradeTransactionConditionCode.ExRights,
						com.tools20022.repository.codeset.TradeTransactionConditionCode.CumWarrant, com.tools20022.repository.codeset.TradeTransactionConditionCode.ExWarrant,
						com.tools20022.repository.codeset.TradeTransactionConditionCode.SpecialCumDividend, com.tools20022.repository.codeset.TradeTransactionConditionCode.SpecialExDividend,
						com.tools20022.repository.codeset.TradeTransactionConditionCode.BrokerDueBill, com.tools20022.repository.codeset.TradeTransactionConditionCode.SoldShort,
						com.tools20022.repository.codeset.TradeTransactionConditionCode.Dirty, com.tools20022.repository.codeset.TradeTransactionConditionCode.Clean, com.tools20022.repository.codeset.TradeTransactionConditionCode.Block,
						com.tools20022.repository.codeset.TradeTransactionConditionCode.GuaranteedDelivery, com.tools20022.repository.codeset.TradeTransactionConditionCode.Fractions,
						com.tools20022.repository.codeset.TradeTransactionConditionCode.CrossTrade, com.tools20022.repository.codeset.TradeTransactionConditionCode.NoCrossTrade,
						com.tools20022.repository.codeset.TradeTransactionConditionCode.DirectOrder, com.tools20022.repository.codeset.TradeTransactionConditionCode.DirectedOrder,
						com.tools20022.repository.codeset.TradeTransactionConditionCode.WarehouseTrade, com.tools20022.repository.codeset.TradeTransactionConditionCode.NotIncrease,
						com.tools20022.repository.codeset.TradeTransactionConditionCode.NotReduce, com.tools20022.repository.codeset.TradeTransactionConditionCode.ForwardPriceTrade,
						com.tools20022.repository.codeset.TradeTransactionConditionCode.HistoricPriceTrade, com.tools20022.repository.codeset.TradeTransactionConditionCode.ResultOption,
						com.tools20022.repository.codeset.TradeTransactionConditionCode.ResultRepo, com.tools20022.repository.codeset.TradeTransactionConditionCode.DeliverCountryIncorporation,
						com.tools20022.repository.codeset.TradeTransactionConditionCode.DeliveryForm, com.tools20022.repository.codeset.TradeTransactionConditionCode.BoardLot,
						com.tools20022.repository.codeset.TradeTransactionConditionCode.BadName, com.tools20022.repository.codeset.TradeTransactionConditionCode.Automated,
						com.tools20022.repository.codeset.TradeTransactionConditionCode.BestExecution, com.tools20022.repository.codeset.TradeTransactionConditionCode.Call,
						com.tools20022.repository.codeset.TradeTransactionConditionCode.ClosureBeforeRollOver, com.tools20022.repository.codeset.TradeTransactionConditionCode.Monthly,
						com.tools20022.repository.codeset.TradeTransactionConditionCode.NewTradeFollowingRollover, com.tools20022.repository.codeset.TradeTransactionConditionCode.Putt,
						com.tools20022.repository.codeset.TradeTransactionConditionCode.TradeFollowingRollover, com.tools20022.repository.codeset.TradeTransactionConditionCode.SpecialCumCoupon,
						com.tools20022.repository.codeset.TradeTransactionConditionCode.SpecialExCoupon, com.tools20022.repository.codeset.TradeTransactionConditionCode.SpecialExBonus,
						com.tools20022.repository.codeset.TradeTransactionConditionCode.SpecialCumBonus, com.tools20022.repository.codeset.TradeTransactionConditionCode.SpecialCumRights,
						com.tools20022.repository.codeset.TradeTransactionConditionCode.SpecialExRights, com.tools20022.repository.codeset.TradeTransactionConditionCode.SpecialCumCapitalRepayments,
						com.tools20022.repository.codeset.TradeTransactionConditionCode.SpecialExCapitalRepayments, com.tools20022.repository.codeset.TradeTransactionConditionCode.CashSettlement,
						com.tools20022.repository.codeset.TradeTransactionConditionCode.SpecialPrice, com.tools20022.repository.codeset.TradeTransactionConditionCode.MarketPrice,
						com.tools20022.repository.codeset.TradeTransactionConditionCode.NegotiatedTrade, com.tools20022.repository.codeset.TradeTransactionConditionCode.NonMarketPrice);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CumBonus.getCodeName().get(), CumBonus);
		codesByName.put(ExBonus.getCodeName().get(), ExBonus);
		codesByName.put(CumCoupon.getCodeName().get(), CumCoupon);
		codesByName.put(ExCoupon.getCodeName().get(), ExCoupon);
		codesByName.put(CumDividend.getCodeName().get(), CumDividend);
		codesByName.put(ExDividend.getCodeName().get(), ExDividend);
		codesByName.put(CumRights.getCodeName().get(), CumRights);
		codesByName.put(ExRights.getCodeName().get(), ExRights);
		codesByName.put(CumWarrant.getCodeName().get(), CumWarrant);
		codesByName.put(ExWarrant.getCodeName().get(), ExWarrant);
		codesByName.put(SpecialCumDividend.getCodeName().get(), SpecialCumDividend);
		codesByName.put(SpecialExDividend.getCodeName().get(), SpecialExDividend);
		codesByName.put(BrokerDueBill.getCodeName().get(), BrokerDueBill);
		codesByName.put(SoldShort.getCodeName().get(), SoldShort);
		codesByName.put(Dirty.getCodeName().get(), Dirty);
		codesByName.put(Clean.getCodeName().get(), Clean);
		codesByName.put(Block.getCodeName().get(), Block);
		codesByName.put(GuaranteedDelivery.getCodeName().get(), GuaranteedDelivery);
		codesByName.put(Fractions.getCodeName().get(), Fractions);
		codesByName.put(CrossTrade.getCodeName().get(), CrossTrade);
		codesByName.put(NoCrossTrade.getCodeName().get(), NoCrossTrade);
		codesByName.put(DirectOrder.getCodeName().get(), DirectOrder);
		codesByName.put(DirectedOrder.getCodeName().get(), DirectedOrder);
		codesByName.put(WarehouseTrade.getCodeName().get(), WarehouseTrade);
		codesByName.put(NotIncrease.getCodeName().get(), NotIncrease);
		codesByName.put(NotReduce.getCodeName().get(), NotReduce);
		codesByName.put(ForwardPriceTrade.getCodeName().get(), ForwardPriceTrade);
		codesByName.put(HistoricPriceTrade.getCodeName().get(), HistoricPriceTrade);
		codesByName.put(ResultOption.getCodeName().get(), ResultOption);
		codesByName.put(ResultRepo.getCodeName().get(), ResultRepo);
		codesByName.put(DeliverCountryIncorporation.getCodeName().get(), DeliverCountryIncorporation);
		codesByName.put(DeliveryForm.getCodeName().get(), DeliveryForm);
		codesByName.put(BoardLot.getCodeName().get(), BoardLot);
		codesByName.put(BadName.getCodeName().get(), BadName);
		codesByName.put(Automated.getCodeName().get(), Automated);
		codesByName.put(BestExecution.getCodeName().get(), BestExecution);
		codesByName.put(Call.getCodeName().get(), Call);
		codesByName.put(ClosureBeforeRollOver.getCodeName().get(), ClosureBeforeRollOver);
		codesByName.put(Monthly.getCodeName().get(), Monthly);
		codesByName.put(NewTradeFollowingRollover.getCodeName().get(), NewTradeFollowingRollover);
		codesByName.put(Putt.getCodeName().get(), Putt);
		codesByName.put(TradeFollowingRollover.getCodeName().get(), TradeFollowingRollover);
		codesByName.put(SpecialCumCoupon.getCodeName().get(), SpecialCumCoupon);
		codesByName.put(SpecialExCoupon.getCodeName().get(), SpecialExCoupon);
		codesByName.put(SpecialExBonus.getCodeName().get(), SpecialExBonus);
		codesByName.put(SpecialCumBonus.getCodeName().get(), SpecialCumBonus);
		codesByName.put(SpecialCumRights.getCodeName().get(), SpecialCumRights);
		codesByName.put(SpecialExRights.getCodeName().get(), SpecialExRights);
		codesByName.put(SpecialCumCapitalRepayments.getCodeName().get(), SpecialCumCapitalRepayments);
		codesByName.put(SpecialExCapitalRepayments.getCodeName().get(), SpecialExCapitalRepayments);
		codesByName.put(CashSettlement.getCodeName().get(), CashSettlement);
		codesByName.put(SpecialPrice.getCodeName().get(), SpecialPrice);
		codesByName.put(MarketPrice.getCodeName().get(), MarketPrice);
		codesByName.put(NegotiatedTrade.getCodeName().get(), NegotiatedTrade);
		codesByName.put(NonMarketPrice.getCodeName().get(), NonMarketPrice);
	}

	public static TradeTransactionConditionCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TradeTransactionConditionCode[] values() {
		TradeTransactionConditionCode[] values = new TradeTransactionConditionCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TradeTransactionConditionCode> {
		@Override
		public TradeTransactionConditionCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TradeTransactionConditionCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}