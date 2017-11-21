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
 * Indicates the conditions under which the order/trade is to be/was executed.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#mmCumBonus
 * TradeTransactionConditionCode.mmCumBonus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#mmExBonus
 * TradeTransactionConditionCode.mmExBonus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#mmCumCoupon
 * TradeTransactionConditionCode.mmCumCoupon}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#mmExCoupon
 * TradeTransactionConditionCode.mmExCoupon}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#mmCumDividend
 * TradeTransactionConditionCode.mmCumDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#mmExDividend
 * TradeTransactionConditionCode.mmExDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#mmCumRights
 * TradeTransactionConditionCode.mmCumRights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#mmExRights
 * TradeTransactionConditionCode.mmExRights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#mmCumWarrant
 * TradeTransactionConditionCode.mmCumWarrant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#mmExWarrant
 * TradeTransactionConditionCode.mmExWarrant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#mmSpecialCumDividend
 * TradeTransactionConditionCode.mmSpecialCumDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#mmSpecialExDividend
 * TradeTransactionConditionCode.mmSpecialExDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#mmBrokerDueBill
 * TradeTransactionConditionCode.mmBrokerDueBill}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#mmSoldShort
 * TradeTransactionConditionCode.mmSoldShort}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#mmDirty
 * TradeTransactionConditionCode.mmDirty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#mmClean
 * TradeTransactionConditionCode.mmClean}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#mmBlock
 * TradeTransactionConditionCode.mmBlock}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#mmGuaranteedDelivery
 * TradeTransactionConditionCode.mmGuaranteedDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#mmFractions
 * TradeTransactionConditionCode.mmFractions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#mmCrossTrade
 * TradeTransactionConditionCode.mmCrossTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#mmNoCrossTrade
 * TradeTransactionConditionCode.mmNoCrossTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#mmDirectOrder
 * TradeTransactionConditionCode.mmDirectOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#mmDirectedOrder
 * TradeTransactionConditionCode.mmDirectedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#mmWarehouseTrade
 * TradeTransactionConditionCode.mmWarehouseTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#mmNotIncrease
 * TradeTransactionConditionCode.mmNotIncrease}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#mmNotReduce
 * TradeTransactionConditionCode.mmNotReduce}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#mmForwardPriceTrade
 * TradeTransactionConditionCode.mmForwardPriceTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#mmHistoricPriceTrade
 * TradeTransactionConditionCode.mmHistoricPriceTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#mmResultOption
 * TradeTransactionConditionCode.mmResultOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#mmResultRepo
 * TradeTransactionConditionCode.mmResultRepo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#mmDeliverCountryIncorporation
 * TradeTransactionConditionCode.mmDeliverCountryIncorporation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#mmDeliveryForm
 * TradeTransactionConditionCode.mmDeliveryForm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#mmBoardLot
 * TradeTransactionConditionCode.mmBoardLot}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#mmBadName
 * TradeTransactionConditionCode.mmBadName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#mmAutomated
 * TradeTransactionConditionCode.mmAutomated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#mmBestExecution
 * TradeTransactionConditionCode.mmBestExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#mmCall
 * TradeTransactionConditionCode.mmCall}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#mmClosureBeforeRollOver
 * TradeTransactionConditionCode.mmClosureBeforeRollOver}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#mmMonthly
 * TradeTransactionConditionCode.mmMonthly}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#mmNewTradeFollowingRollover
 * TradeTransactionConditionCode.mmNewTradeFollowingRollover}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#mmPutt
 * TradeTransactionConditionCode.mmPutt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#mmTradeFollowingRollover
 * TradeTransactionConditionCode.mmTradeFollowingRollover}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#mmSpecialCumCoupon
 * TradeTransactionConditionCode.mmSpecialCumCoupon}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#mmSpecialExCoupon
 * TradeTransactionConditionCode.mmSpecialExCoupon}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#mmSpecialExBonus
 * TradeTransactionConditionCode.mmSpecialExBonus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#mmSpecialCumBonus
 * TradeTransactionConditionCode.mmSpecialCumBonus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#mmSpecialCumRights
 * TradeTransactionConditionCode.mmSpecialCumRights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#mmSpecialExRights
 * TradeTransactionConditionCode.mmSpecialExRights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#mmSpecialCumCapitalRepayments
 * TradeTransactionConditionCode.mmSpecialCumCapitalRepayments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#mmSpecialExCapitalRepayments
 * TradeTransactionConditionCode.mmSpecialExCapitalRepayments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#mmCashSettlement
 * TradeTransactionConditionCode.mmCashSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#mmSpecialPrice
 * TradeTransactionConditionCode.mmSpecialPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#mmMarketPrice
 * TradeTransactionConditionCode.mmMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#mmNegotiatedTrade
 * TradeTransactionConditionCode.mmNegotiatedTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode#mmNonMarketPrice
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
public class TradeTransactionConditionCode {

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
	public static final MMCode mmCumBonus = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CumBonus";
			definition = "Indicates whether the trade is executed cum bonus.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
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
	public static final MMCode mmExBonus = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExBonus";
			definition = "Indicates whether the trade is executed ex bonus.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
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
	public static final MMCode mmCumCoupon = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CumCoupon";
			definition = "Indicates whether the trade is executed cum coupon.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
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
	public static final MMCode mmExCoupon = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExCoupon";
			definition = "Indicates whether the trade is executed ex coupon.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
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
	public static final MMCode mmCumDividend = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CumDividend";
			definition = "Indicates whether the trade is executed cum dividend.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
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
	public static final MMCode mmExDividend = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExDividend";
			definition = "Indicates whether the trade is executed ex dividend.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
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
	public static final MMCode mmCumRights = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CumRights";
			definition = "Indicates whether the trade is executed cum rights.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
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
	public static final MMCode mmExRights = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExRights";
			definition = "Indicates whether the trade is executed ex rights.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
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
	public static final MMCode mmCumWarrant = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CumWarrant";
			definition = "Indicates whether the trade is executed cum warrant.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
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
	public static final MMCode mmExWarrant = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExWarrant";
			definition = "Indicates whether the trade is executed ex warrant.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
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
	public static final MMCode mmSpecialCumDividend = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SpecialCumDividend";
			definition = "Indicates whether the trade is executed  with a special cum \ndividend, ie, buying after the ex date and getting the dividend.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
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
	public static final MMCode mmSpecialExDividend = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SpecialExDividend";
			definition = "Indicates whether the trade is executed  with a special ex \ndividend, ie, selling before the ex date without the coupon.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
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
	public static final MMCode mmBrokerDueBill = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BrokerDueBill";
			definition = "Indicates that the trade is executed cum-dividend or cum-coupon and a due bill is required. \nA due bill is a contractual agreement to pay the dividend along with the delivery of \nthe financial instrument.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
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
	public static final MMCode mmSoldShort = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SoldShort";
			definition = "Indicates whether the trade is sold short. When the seller does not have the \nfinancial instrument, the delivery is effected by borrowing the financial instrument by or \nfor the account of the seller.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
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
	public static final MMCode mmDirty = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Dirty";
			definition = "Indicates that the trade is executed dirty, ie government tax must be paid on the accrued interest on the bond.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
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
	public static final MMCode mmClean = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Clean";
			definition = "Indicates that the trade is executed clean, ie government tax must not be paid on the accrued interest on the bond.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
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
	public static final MMCode mmBlock = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Block";
			definition = "Indicates whether the trade is a block trade or not, ie, whether allocation instruction will follow or not.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
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
	public static final MMCode mmGuaranteedDelivery = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GuaranteedDelivery";
			definition = "Indicates whether the delivery of the financial instrument on settlement date \nis guaranteed.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
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
	public static final MMCode mmFractions = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Fractions";
			definition = "Indicates whether fractional parts are allowed.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
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
	public static final MMCode mmCrossTrade = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CrossTrade";
			definition = "Indicates that cross trades are allowed whereby buy and sell orders are offset without recording the trade on the exchange";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
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
	public static final MMCode mmNoCrossTrade = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NoCrossTrade";
			definition = "Indicates that cross trades, whereby buy and sell orders are offset without recording the trade on the exchange, are not allowed.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
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
	public static final MMCode mmDirectOrder = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DirectOrder";
			definition = "Indicates that the order is to be executed by a trading party other than the trading party to which the \norder is sent. In this case, the instructing party has traded with another broker which will \nsubsequently send an advice of execution to the executing party who received the order \nand which is acting as clearing broker.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
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
	public static final MMCode mmDirectedOrder = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DirectedOrder";
			definition = "Indicates that the order must be executed with a specific trading party.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
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
	public static final MMCode mmWarehouseTrade = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WarehouseTrade";
			definition = "Warehouse Trade.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
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
	public static final MMCode mmNotIncrease = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotIncrease";
			definition = "A limit order to buy or a stop order to sell or a stop limit order which is not to be increased in shares on the ex-dividend date as a result of a stock dividend or distribution.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
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
	public static final MMCode mmNotReduce = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotReduce";
			definition = "A limit order to buy or a stop order to sell, or a stop-limit order to sell which is not to be reduced in price by the amount of an ordinary cash dividend. Only applies to ordinary stock dividends; it should be reduced for other distributions. e.g. when a stock goes 'ex' stock dividend or rights.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
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
	public static final MMCode mmForwardPriceTrade = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ForwardPriceTrade";
			definition = "Indicates that the order is based on a forward price.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
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
	public static final MMCode mmHistoricPriceTrade = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "HistoricPriceTrade";
			definition = "Indicates that the order is based on a historic price.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
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
	public static final MMCode mmResultOption = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ResultOption";
			definition = "Result of option when set. (UK specific)";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
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
	public static final MMCode mmResultRepo = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ResultRepo";
			definition = "Result of repo when set (UK specific).";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
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
	public static final MMCode mmDeliverCountryIncorporation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeliverCountryIncorporation";
			definition = "Place of delivery, in country of incorporation when unset (UK specific).";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
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
	public static final MMCode mmDeliveryForm = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeliveryForm";
			definition = "Form of delivery, not for foreign registration when unset (UK specific).";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
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
	public static final MMCode mmBoardLot = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BoardLot";
			definition = "Board lots, not set for odd lots (UK specific).";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
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
	public static final MMCode mmBadName = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BadName";
			definition = "Bad names, not set for good names (UK specific).";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
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
	public static final MMCode mmAutomated = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Automated";
			definition = "Automated.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
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
	public static final MMCode mmBestExecution = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BestExecution";
			definition = "Trade to be executed done at best execution.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
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
	public static final MMCode mmCall = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Call";
			definition = "Trade to be executed following the exercise of a call option on the security.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
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
	public static final MMCode mmClosureBeforeRollOver = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClosureBeforeRollOver";
			definition = "Trade to be executed for closure of a previous position before the rollover of a position (Deferred Settlement Service).";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
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
	public static final MMCode mmMonthly = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Monthly";
			definition = "Trade to be executed for month-end settlement (Deferred Settlement Service).";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
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
	public static final MMCode mmNewTradeFollowingRollover = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NewTradeFollowingRollover";
			definition = "Trade to be executed for a new trade position on the next month following the roll-over of a position (Deferred Settlement Service).";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
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
	public static final MMCode mmPutt = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Putt";
			definition = "Trade to be executed following the exercise of a put option on the security.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
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
	public static final MMCode mmTradeFollowingRollover = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradeFollowingRollover";
			definition = "Trade to be executed on the next month following the roll-over of positions.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
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
	public static final MMCode mmSpecialCumCoupon = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SpecialCumCoupon";
			definition = "Indicates whether the trade is executed with a special cum coupon.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
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
	public static final MMCode mmSpecialExCoupon = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SpecialExCoupon";
			definition = "Indicates whether the trade is executed with a special ex coupon.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
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
	public static final MMCode mmSpecialExBonus = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SpecialExBonus";
			definition = "Indicates whether the trade is executed special ex bonus.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
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
	public static final MMCode mmSpecialCumBonus = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SpecialCumBonus";
			definition = "Indicates whether the trade is executed special cum bonus.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
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
	public static final MMCode mmSpecialCumRights = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SpecialCumRights";
			definition = "Indicates whether the trade is executed special cum rights.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
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
	public static final MMCode mmSpecialExRights = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SpecialExRights";
			definition = "Indicates whether the trade is executed special ex rights.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
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
	public static final MMCode mmSpecialCumCapitalRepayments = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SpecialCumCapitalRepayments";
			definition = "Indicates whether the trade is executed special cum capital repayments.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
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
	public static final MMCode mmSpecialExCapitalRepayments = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SpecialExCapitalRepayments";
			definition = "Indicates whether the trade is executed special ex capital repayments.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
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
	public static final MMCode mmCashSettlement = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashSettlement";
			definition = "Indicates whether the trade is executed with a cash settlement.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
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
	public static final MMCode mmSpecialPrice = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SpecialPrice";
			definition = "Indicates whether the trade is executed with a special price.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
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
	public static final MMCode mmMarketPrice = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MarketPrice";
			definition = "Trade was executed at market price.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
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
	public static final MMCode mmNegotiatedTrade = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NegotiatedTrade";
			definition = "Trade for which the price is not the one quoted but an improved one, that is, the negotiated price.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
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
	public static final MMCode mmNonMarketPrice = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NonMarketPrice";
			definition = "Trade was executed outside of normal market conditions, for example, in the case of an iceberg order.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
			codeName = "NMPR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("CBNS");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradeTransactionConditionCode";
				definition = "Indicates the conditions under which the order/trade is to be/was executed.";
				code_lazy = () -> Arrays.asList(TradeTransactionConditionCode.mmCumBonus, TradeTransactionConditionCode.mmExBonus, TradeTransactionConditionCode.mmCumCoupon, TradeTransactionConditionCode.mmExCoupon,
						TradeTransactionConditionCode.mmCumDividend, TradeTransactionConditionCode.mmExDividend, TradeTransactionConditionCode.mmCumRights, TradeTransactionConditionCode.mmExRights,
						TradeTransactionConditionCode.mmCumWarrant, TradeTransactionConditionCode.mmExWarrant, TradeTransactionConditionCode.mmSpecialCumDividend, TradeTransactionConditionCode.mmSpecialExDividend,
						TradeTransactionConditionCode.mmBrokerDueBill, TradeTransactionConditionCode.mmSoldShort, TradeTransactionConditionCode.mmDirty, TradeTransactionConditionCode.mmClean, TradeTransactionConditionCode.mmBlock,
						TradeTransactionConditionCode.mmGuaranteedDelivery, TradeTransactionConditionCode.mmFractions, TradeTransactionConditionCode.mmCrossTrade, TradeTransactionConditionCode.mmNoCrossTrade,
						TradeTransactionConditionCode.mmDirectOrder, TradeTransactionConditionCode.mmDirectedOrder, TradeTransactionConditionCode.mmWarehouseTrade, TradeTransactionConditionCode.mmNotIncrease,
						TradeTransactionConditionCode.mmNotReduce, TradeTransactionConditionCode.mmForwardPriceTrade, TradeTransactionConditionCode.mmHistoricPriceTrade, TradeTransactionConditionCode.mmResultOption,
						TradeTransactionConditionCode.mmResultRepo, TradeTransactionConditionCode.mmDeliverCountryIncorporation, TradeTransactionConditionCode.mmDeliveryForm, TradeTransactionConditionCode.mmBoardLot,
						TradeTransactionConditionCode.mmBadName, TradeTransactionConditionCode.mmAutomated, TradeTransactionConditionCode.mmBestExecution, TradeTransactionConditionCode.mmCall,
						TradeTransactionConditionCode.mmClosureBeforeRollOver, TradeTransactionConditionCode.mmMonthly, TradeTransactionConditionCode.mmNewTradeFollowingRollover, TradeTransactionConditionCode.mmPutt,
						TradeTransactionConditionCode.mmTradeFollowingRollover, TradeTransactionConditionCode.mmSpecialCumCoupon, TradeTransactionConditionCode.mmSpecialExCoupon, TradeTransactionConditionCode.mmSpecialExBonus,
						TradeTransactionConditionCode.mmSpecialCumBonus, TradeTransactionConditionCode.mmSpecialCumRights, TradeTransactionConditionCode.mmSpecialExRights, TradeTransactionConditionCode.mmSpecialCumCapitalRepayments,
						TradeTransactionConditionCode.mmSpecialExCapitalRepayments, TradeTransactionConditionCode.mmCashSettlement, TradeTransactionConditionCode.mmSpecialPrice, TradeTransactionConditionCode.mmMarketPrice,
						TradeTransactionConditionCode.mmNegotiatedTrade, TradeTransactionConditionCode.mmNonMarketPrice);
			}
		});
		return mmObject_lazy.get();
	}
}