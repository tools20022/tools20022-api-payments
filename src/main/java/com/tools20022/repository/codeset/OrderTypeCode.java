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
import com.tools20022.repository.codeset.OrderTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates the type of instruction to a broker or dealer to buy or sell a
 * financial instrument.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderTypeCode#AllOrNone
 * OrderTypeCode.mmAllOrNone}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderTypeCode#BuyContraShortExempt
 * OrderTypeCode.mmBuyContraShortExempt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderTypeCode#BuyContraShort
 * OrderTypeCode.mmBuyContraShort}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderTypeCode#BuyMinus
 * OrderTypeCode.mmBuyMinus}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderTypeCode#Carefully
 * OrderTypeCode.mmCarefully}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderTypeCode#Combination
 * OrderTypeCode.mmCombination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderTypeCode#Discretionary
 * OrderTypeCode.mmDiscretionary}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderTypeCode#Limit
 * OrderTypeCode.mmLimit}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderTypeCode#LimitOnClose
 * OrderTypeCode.mmLimitOnClose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderTypeCode#LimitOrBetter
 * OrderTypeCode.mmLimitOrBetter}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderTypeCode#LimitWith
 * OrderTypeCode.mmLimitWith}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderTypeCode#LimitWithout
 * OrderTypeCode.mmLimitWithout}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderTypeCode#Market
 * OrderTypeCode.mmMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderTypeCode#MarketNotHeld
 * OrderTypeCode.mmMarketNotHeld}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderTypeCode#MarketTouched
 * OrderTypeCode.mmMarketTouched}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderTypeCode#NotHeld
 * OrderTypeCode.mmNotHeld}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderTypeCode#OrderLie
 * OrderTypeCode.mmOrderLie}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderTypeCode#OnBasisPrice
 * OrderTypeCode.mmOnBasisPrice}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderTypeCode#Stop
 * OrderTypeCode.mmStop}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderTypeCode#StopLimit
 * OrderTypeCode.mmStopLimit}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderTypeCode#StopLoss
 * OrderTypeCode.mmStopLoss}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderTypeCode#SellPlus
 * OrderTypeCode.mmSellPlus}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderTypeCode#SellShort
 * OrderTypeCode.mmSellShort}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderTypeCode#SellShortExempt
 * OrderTypeCode.mmSellShortExempt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderTypeCode#WithOrWithout
 * OrderTypeCode.mmWithOrWithout}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderTypeCode#PreviouslyQuoted
 * OrderTypeCode.mmPreviouslyQuoted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderTypeCode#PreviouslyIndicated
 * OrderTypeCode.mmPreviouslyIndicated}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderTypeCode#ForexSwap
 * OrderTypeCode.mmForexSwap}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderTypeCode#Funari
 * OrderTypeCode.mmFunari}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderTypeCode#MarketWithLeftover
 * OrderTypeCode.mmMarketWithLeftover}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderTypeCode#Pegged
 * OrderTypeCode.mmPegged}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderTypeCode#CounterOrderSelection
 * OrderTypeCode.mmCounterOrderSelection}</li>
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
 * "OrderTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates the type of  instruction to a broker or dealer to buy or sell a financial instrument."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class OrderTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * A round-lot market or limit price order that must be executed in its
	 * entirety or not at all; unlike fill or kill orders, all or none orders
	 * are not treated as canceled if they are not executed as soon as
	 * represented in the trading crowd.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderTypeCode
	 * OrderTypeCode}</li>
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
	 * "A round-lot market or limit price order that must be executed in its entirety or not at all; unlike fill or kill orders, all or none orders are not treated as canceled if they are not executed as soon as represented in the trading crowd."
	 * </li>
	 * </ul>
	 */
	public static final OrderTypeCode AllOrNone = new OrderTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllOrNone";
			definition = "A round-lot market or limit price order that must be executed in its entirety or not at all; unlike fill or kill orders, all or none orders are not treated as canceled if they are not executed as soon as represented in the trading crowd.";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderTypeCode.mmObject();
			codeName = "ALNO";
		}
	};
	/**
	 * A buy contra short exempt.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderTypeCode
	 * OrderTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BCSE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyContraShortExempt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "A buy contra short exempt."</li>
	 * </ul>
	 */
	public static final OrderTypeCode BuyContraShortExempt = new OrderTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyContraShortExempt";
			definition = "A buy contra short exempt.";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderTypeCode.mmObject();
			codeName = "BCSE";
		}
	};
	/**
	 * An order to buy contra short.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderTypeCode
	 * OrderTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BCSH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyContraShort"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "An order to buy contra short."</li>
	 * </ul>
	 */
	public static final OrderTypeCode BuyContraShort = new OrderTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyContraShort";
			definition = "An order to buy contra short.";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderTypeCode.mmObject();
			codeName = "BCSH";
		}
	};
	/**
	 * An order to buy at a price lower than the current market price. This is
	 * an order to buy a stated amount of a financial instrument provided that
	 * its price is not higher than the last sale if the last sale was a minus
	 * or zero minus tick, not higher than the last sale minus the minimum
	 * fractional change in the stock if the last sale was a plus or zero plus
	 * tick. The price limit indicates the highest price at which the order can
	 * be executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderTypeCode
	 * OrderTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BMIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyMinus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An order to buy at a price lower than the current market price. This is an order to buy a stated amount of a financial instrument provided that its price is not higher than the last sale if the last sale was a minus or zero minus tick, not higher than the last sale minus the minimum fractional change in the stock if the last sale was a plus or zero plus tick. The price limit indicates the highest price at which the order can be executed."
	 * </li>
	 * </ul>
	 */
	public static final OrderTypeCode BuyMinus = new OrderTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyMinus";
			definition = "An order to buy at a price lower than the current market price. This is an order to buy a stated amount of a financial instrument provided that its price is not higher than the last sale if the last sale was a minus or zero minus tick, not higher than the last sale minus the minimum fractional change in the stock if the last sale was a plus or zero plus tick. The price limit indicates the highest price at which the order can be executed.";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderTypeCode.mmObject();
			codeName = "BMIN";
		}
	};
	/**
	 * An order which is not to be executed as a whole if the executing broker
	 * judges that it may disturb the price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderTypeCode
	 * OrderTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CARE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Carefully"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An order which is not to be executed as a whole if the executing broker judges that it may disturb the price."
	 * </li>
	 * </ul>
	 */
	public static final OrderTypeCode Carefully = new OrderTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Carefully";
			definition = "An order which is not to be executed as a whole if the executing broker judges that it may disturb the price.";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderTypeCode.mmObject();
			codeName = "CARE";
		}
	};
	/**
	 * An order which is linked to another order to buy or sell and must be
	 * executed as a unit, both or none, or cancelled as a unit. The linkage
	 * sequence must be completed with a reference to the linked order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderTypeCode
	 * OrderTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COMB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Combination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An order which is linked to another order to buy or sell and must be executed as a unit, both or none, or cancelled as a unit. The linkage sequence must be completed with a reference to the linked order."
	 * </li>
	 * </ul>
	 */
	public static final OrderTypeCode Combination = new OrderTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Combination";
			definition = "An order which is linked to another order to buy or sell and must be executed as a unit, both or none, or cancelled as a unit. The linkage sequence must be completed with a reference to the linked order.";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderTypeCode.mmObject();
			codeName = "COMB";
		}
	};
	/**
	 * An order where the executing broker or investment manager decides on the
	 * quantity or price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderTypeCode
	 * OrderTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DISC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Discretionary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An order where the executing broker or investment manager decides on the quantity or price."
	 * </li>
	 * </ul>
	 */
	public static final OrderTypeCode Discretionary = new OrderTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Discretionary";
			definition = "An order where the executing broker or investment manager decides on the quantity or price.";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderTypeCode.mmObject();
			codeName = "DISC";
		}
	};
	/**
	 * An order to buy at the indicated price limit or lower or an order to sell
	 * at the indicated limit price or higher.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderTypeCode
	 * OrderTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LMTO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Limit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An order to buy at the indicated price limit or lower or an order to sell at the indicated limit price or higher."
	 * </li>
	 * </ul>
	 */
	public static final OrderTypeCode Limit = new OrderTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Limit";
			definition = "An order to buy at the indicated price limit or lower or an order to sell at the indicated limit price or higher.";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderTypeCode.mmObject();
			codeName = "LMTO";
		}
	};
	/**
	 * Indicates that if the limit conditions are not satisfied, it should not
	 * be executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderTypeCode
	 * OrderTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LMCO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitOnClose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that if the limit conditions are not satisfied, it should not be executed."
	 * </li>
	 * </ul>
	 */
	public static final OrderTypeCode LimitOnClose = new OrderTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitOnClose";
			definition = "Indicates that if the limit conditions are not satisfied, it should not be executed.";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderTypeCode.mmObject();
			codeName = "LMCO";
		}
	};
	/**
	 * A trade at this specified price or better.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderTypeCode
	 * OrderTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LMBT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitOrBetter"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "A trade at this specified price or better."</li>
	 * </ul>
	 */
	public static final OrderTypeCode LimitOrBetter = new OrderTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitOrBetter";
			definition = "A trade at this specified price or better.";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderTypeCode.mmObject();
			codeName = "LMBT";
		}
	};
	/**
	 * An order to be executed at a limit price, with a round-lot (or board-lot)
	 * sales; valid only for odd lot orders.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderTypeCode
	 * OrderTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LIWI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitWith"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An order to be executed at a limit price, with a round-lot (or board-lot) sales; valid only for odd lot orders."
	 * </li>
	 * </ul>
	 */
	public static final OrderTypeCode LimitWith = new OrderTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitWith";
			definition = "An order to be executed at a limit price, with a round-lot (or board-lot) sales; valid only for odd lot orders.";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderTypeCode.mmObject();
			codeName = "LIWI";
		}
	};
	/**
	 * An order to be executed at a limit price, without a round-lot (or
	 * board-lot) sales; valid only for odd lot orders.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderTypeCode
	 * OrderTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LIWO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitWithout"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An order to be executed at a limit price, without a round-lot (or board-lot) sales; valid only for odd lot orders."
	 * </li>
	 * </ul>
	 */
	public static final OrderTypeCode LimitWithout = new OrderTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitWithout";
			definition = "An order to be executed at a limit price, without a round-lot (or board-lot) sales; valid only for odd lot orders.";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderTypeCode.mmObject();
			codeName = "LIWO";
		}
	};
	/**
	 * An order to buy or sell a specified amount of a financial instrument at
	 * the quoted market price or better.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderTypeCode
	 * OrderTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MRKT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Market"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An order to buy or sell a specified amount of a financial instrument at the quoted market price or better."
	 * </li>
	 * </ul>
	 */
	public static final OrderTypeCode Market = new OrderTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Market";
			definition = "An order to buy or sell a specified amount of a financial instrument at the quoted market price or better.";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderTypeCode.mmObject();
			codeName = "MRKT";
		}
	};
	/**
	 * An order to buy or sell a stated amount of a financial instrument at the
	 * quoted market price or better with some discretion on the price limit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderTypeCode
	 * OrderTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MANH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketNotHeld"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An order to buy or sell a stated amount of a financial instrument at the quoted market price or better with some discretion on the price limit."
	 * </li>
	 * </ul>
	 */
	public static final OrderTypeCode MarketNotHeld = new OrderTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketNotHeld";
			definition = "An order to buy or sell a stated amount of a financial instrument at the quoted market price or better with some discretion on the price limit.";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderTypeCode.mmObject();
			codeName = "MANH";
		}
	};
	/**
	 * An order which becomes a market order once the market price is reached.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderTypeCode
	 * OrderTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MATH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketTouched"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An order which becomes a market order once the market price is reached."
	 * </li>
	 * </ul>
	 */
	public static final OrderTypeCode MarketTouched = new OrderTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketTouched";
			definition = "An order which becomes a market order once the market price is reached.";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderTypeCode.mmObject();
			codeName = "MATH";
		}
	};
	/**
	 * An order which may be executed in partials or outside the hours of the
	 * exchange or other exchange rules.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderTypeCode
	 * OrderTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOHE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotHeld"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An order which may be executed in partials or outside the hours of the exchange or other exchange rules."
	 * </li>
	 * </ul>
	 */
	public static final OrderTypeCode NotHeld = new OrderTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotHeld";
			definition = "An order which may be executed in partials or outside the hours of the exchange or other exchange rules.";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderTypeCode.mmObject();
			codeName = "NOHE";
		}
	};
	/**
	 * An order which is related to another order where the second part may be
	 * cancelled without canceling the first. In this case, the second order is
	 * identified as the second part. Normally the sell order must be executed
	 * before the buy order. The linkage sequence must be completed with a
	 * reference to the linked order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderTypeCode
	 * OrderTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ORLI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderLie"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An order which is related to another order where the second part may be cancelled without canceling the first. In this case, the second order is identified as the second part. Normally the sell order must be executed before the buy order. The linkage sequence must be completed with a reference to the linked order."
	 * </li>
	 * </ul>
	 */
	public static final OrderTypeCode OrderLie = new OrderTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderLie";
			definition = "An order which is related to another order where the second part may be cancelled without canceling the first. In this case, the second order is identified as the second part. Normally the sell order must be executed before the buy order. The linkage sequence must be completed with a reference to the linked order.";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderTypeCode.mmObject();
			codeName = "ORLI";
		}
	};
	/**
	 * A price established by joint agreement of odd-lot dealers for as illiquid
	 * financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderTypeCode
	 * OrderTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BAPR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnBasisPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A price established by joint agreement of odd-lot dealers for as illiquid financial instrument."
	 * </li>
	 * </ul>
	 */
	public static final OrderTypeCode OnBasisPrice = new OrderTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnBasisPrice";
			definition = "A price established by joint agreement of odd-lot dealers for as illiquid financial instrument.";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderTypeCode.mmObject();
			codeName = "BAPR";
		}
	};
	/**
	 * An order to buy which becomes a market order when the financial
	 * instrument trades at or above the stop price after the order is submitted
	 * or an order to sell which becomes a market order when the financial
	 * instrument trades at or below the stop price after the order is
	 * submitted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderTypeCode
	 * OrderTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STOP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Stop"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An order to buy which becomes a market order when the financial instrument trades at or above the stop price after the order is submitted or an order to sell which becomes a market order when the financial instrument trades at or below the stop price after the order is submitted."
	 * </li>
	 * </ul>
	 */
	public static final OrderTypeCode Stop = new OrderTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Stop";
			definition = "An order to buy which becomes a market order when the financial instrument trades at or above the stop price after the order is submitted or an order to sell which becomes a market order when the financial instrument trades at or below the stop price after the order is submitted.";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderTypeCode.mmObject();
			codeName = "STOP";
		}
	};
	/**
	 * A stop order to buy which becomes a limit order at the limit price when
	 * the financial instrument trades at or above the stop price after the
	 * order is submitted. A stop order to sell which becomes a limit order at
	 * the limit price when the financial instrument trades at or below the stop
	 * price after the order is submitted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderTypeCode
	 * OrderTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STLI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StopLimit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A stop order to buy which becomes a limit order at the limit price when the financial instrument trades at or above the stop price after the order is submitted. A stop order to sell which becomes a limit order at the limit price when the financial instrument trades at or below the stop price after the order is submitted."
	 * </li>
	 * </ul>
	 */
	public static final OrderTypeCode StopLimit = new OrderTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StopLimit";
			definition = "A stop order to buy which becomes a limit order at the limit price when the financial instrument trades at or above the stop price after the order is submitted. A stop order to sell which becomes a limit order at the limit price when the financial instrument trades at or below the stop price after the order is submitted.";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderTypeCode.mmObject();
			codeName = "STLI";
		}
	};
	/**
	 * An order to sell that sets the sell price below the market price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderTypeCode
	 * OrderTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SLOS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StopLoss"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An order to sell that sets the sell price below the market price."</li>
	 * </ul>
	 */
	public static final OrderTypeCode StopLoss = new OrderTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StopLoss";
			definition = "An order to sell that sets the sell price below the market price.";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderTypeCode.mmObject();
			codeName = "SLOS";
		}
	};
	/**
	 * An order to sell a stated amount provided that the price is not lower
	 * than the last sale price if the last sale was a plus or zero plus tick
	 * and not lower than the last sale minus the minimum fractional change in
	 * the financial instrument if the last sale was a minus or zero minus tick.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderTypeCode
	 * OrderTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPLU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellPlus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An order to sell a stated amount provided that the price is not lower than the last sale price if the last sale was a plus or zero plus tick and not lower than the last sale minus the minimum fractional change in the financial instrument if the last sale was a minus or zero minus tick."
	 * </li>
	 * </ul>
	 */
	public static final OrderTypeCode SellPlus = new OrderTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellPlus";
			definition = "An order to sell a stated amount provided that the price is not lower than the last sale price if the last sale was a plus or zero plus tick and not lower than the last sale minus the minimum fractional change in the financial instrument if the last sale was a minus or zero minus tick.";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderTypeCode.mmObject();
			codeName = "SPLU";
		}
	};
	/**
	 * An order to sell that the seller does not own; a sale effected by
	 * delivering a financial instrument borrowed by or for the account of the
	 * seller.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderTypeCode
	 * OrderTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSHO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellShort"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An order to sell that the seller does not own; a sale effected by delivering a financial instrument borrowed by or for the account of the seller."
	 * </li>
	 * </ul>
	 */
	public static final OrderTypeCode SellShort = new OrderTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellShort";
			definition = "An order to sell that the seller does not own; a sale effected by delivering a financial instrument borrowed by or for the account of the seller.";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderTypeCode.mmObject();
			codeName = "SSHO";
		}
	};
	/**
	 * An order to sell short which is exempt from short-sale rules.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderTypeCode
	 * OrderTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSEX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellShortExempt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An order to sell short which is exempt from short-sale rules."</li>
	 * </ul>
	 */
	public static final OrderTypeCode SellShortExempt = new OrderTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellShortExempt";
			definition = "An order to sell short which is exempt from short-sale rules.";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderTypeCode.mmObject();
			codeName = "SSEX";
		}
	};
	/**
	 * An odd lot order filled on an effective round lot transaction, or on an
	 * effective bid or offer, whichever occurs first after the specialist
	 * receives the order. (e.g. NYSE order type).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderTypeCode
	 * OrderTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WTWO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithOrWithout"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An odd lot order filled on an effective round lot transaction, or on an effective bid or offer, whichever occurs first after the specialist receives the order. (e.g. NYSE order type)."
	 * </li>
	 * </ul>
	 */
	public static final OrderTypeCode WithOrWithout = new OrderTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithOrWithout";
			definition = "An odd lot order filled on an effective round lot transaction, or on an effective bid or offer, whichever occurs first after the specialist receives the order. (e.g. NYSE order type).";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderTypeCode.mmObject();
			codeName = "WTWO";
		}
	};
	/**
	 * An order sent in response to a Quote message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderTypeCode
	 * OrderTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRQT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviouslyQuoted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "An order sent in response to a Quote message."</li>
	 * </ul>
	 */
	public static final OrderTypeCode PreviouslyQuoted = new OrderTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviouslyQuoted";
			definition = "An order sent in response to a Quote message.";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderTypeCode.mmObject();
			codeName = "PRQT";
		}
	};
	/**
	 * An order sent in response to an Indication of Interest message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderTypeCode
	 * OrderTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRID"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviouslyIndicated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An order sent in response to an Indication of Interest message."</li>
	 * </ul>
	 */
	public static final OrderTypeCode PreviouslyIndicated = new OrderTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviouslyIndicated";
			definition = "An order sent in response to an Indication of Interest message.";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderTypeCode.mmObject();
			codeName = "PRID";
		}
	};
	/**
	 * A "Swap" order for Foreign Exchange (currency trading).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderTypeCode
	 * OrderTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FXSW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForexSwap"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "A \"Swap\" order for Foreign Exchange (currency trading)."
	 * </li>
	 * </ul>
	 */
	public static final OrderTypeCode ForexSwap = new OrderTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForexSwap";
			definition = "A \"Swap\" order for Foreign Exchange (currency trading).";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderTypeCode.mmObject();
			codeName = "FXSW";
		}
	};
	/**
	 * Japanese term for an order to buy or sell a stated amount of a security
	 * at a specified limit price. Any unexecuted (leftover) quantity becomes a
	 * Market On Close order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderTypeCode
	 * OrderTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FNRI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Funari"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Japanese term for an order to buy or sell a stated amount of a security at a specified limit price. Any unexecuted (leftover) quantity becomes a Market On Close order."
	 * </li>
	 * </ul>
	 */
	public static final OrderTypeCode Funari = new OrderTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Funari";
			definition = "Japanese term for an order to buy or sell a stated amount of a security at a specified limit price. Any unexecuted (leftover) quantity becomes a Market On Close order.";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderTypeCode.mmObject();
			codeName = "FNRI";
		}
	};
	/**
	 * Indicates an order to buy or sell a stated amount of a security at the
	 * prevailing market price with any unexecuted (leftover) quantity becoming
	 * a Limit order at the last executed price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderTypeCode
	 * OrderTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MKLO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketWithLeftover"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates an order to buy or sell a stated amount of a security at the prevailing market price with any unexecuted (leftover) quantity becoming a Limit order at the last executed price."
	 * </li>
	 * </ul>
	 */
	public static final OrderTypeCode MarketWithLeftover = new OrderTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketWithLeftover";
			definition = "Indicates an order to buy or sell a stated amount of a security at the prevailing market price with any unexecuted (leftover) quantity becoming a Limit order at the last executed price.";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderTypeCode.mmObject();
			codeName = "MKLO";
		}
	};
	/**
	 * Limit order, where the limit price fluctuates relative to another
	 * quantity, such as the last sale, midpoint, opening price, bid, offer, or
	 * VWAP (Volume Weighted Average Price).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderTypeCode
	 * OrderTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PGGD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pegged"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Limit order, where the limit price fluctuates relative to another quantity, such as the last sale, midpoint, opening price, bid, offer, or VWAP (Volume Weighted Average Price)."
	 * </li>
	 * </ul>
	 */
	public static final OrderTypeCode Pegged = new OrderTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pegged";
			definition = "Limit order, where the limit price fluctuates relative to another quantity, such as the last sale, midpoint, opening price, bid, offer, or VWAP (Volume Weighted Average Price).";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderTypeCode.mmObject();
			codeName = "PGGD";
		}
	};
	/**
	 * Indicates that the order is a counter order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderTypeCode
	 * OrderTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COSE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterOrderSelection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates that the order is a counter order."</li>
	 * </ul>
	 */
	public static final OrderTypeCode CounterOrderSelection = new OrderTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterOrderSelection";
			definition = "Indicates that the order is a counter order.";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderTypeCode.mmObject();
			codeName = "COSE";
		}
	};
	final static private LinkedHashMap<String, OrderTypeCode> codesByName = new LinkedHashMap<>();

	protected OrderTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("ALNO");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OrderTypeCode";
				definition = "Indicates the type of  instruction to a broker or dealer to buy or sell a financial instrument.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OrderTypeCode.AllOrNone, com.tools20022.repository.codeset.OrderTypeCode.BuyContraShortExempt,
						com.tools20022.repository.codeset.OrderTypeCode.BuyContraShort, com.tools20022.repository.codeset.OrderTypeCode.BuyMinus, com.tools20022.repository.codeset.OrderTypeCode.Carefully,
						com.tools20022.repository.codeset.OrderTypeCode.Combination, com.tools20022.repository.codeset.OrderTypeCode.Discretionary, com.tools20022.repository.codeset.OrderTypeCode.Limit,
						com.tools20022.repository.codeset.OrderTypeCode.LimitOnClose, com.tools20022.repository.codeset.OrderTypeCode.LimitOrBetter, com.tools20022.repository.codeset.OrderTypeCode.LimitWith,
						com.tools20022.repository.codeset.OrderTypeCode.LimitWithout, com.tools20022.repository.codeset.OrderTypeCode.Market, com.tools20022.repository.codeset.OrderTypeCode.MarketNotHeld,
						com.tools20022.repository.codeset.OrderTypeCode.MarketTouched, com.tools20022.repository.codeset.OrderTypeCode.NotHeld, com.tools20022.repository.codeset.OrderTypeCode.OrderLie,
						com.tools20022.repository.codeset.OrderTypeCode.OnBasisPrice, com.tools20022.repository.codeset.OrderTypeCode.Stop, com.tools20022.repository.codeset.OrderTypeCode.StopLimit,
						com.tools20022.repository.codeset.OrderTypeCode.StopLoss, com.tools20022.repository.codeset.OrderTypeCode.SellPlus, com.tools20022.repository.codeset.OrderTypeCode.SellShort,
						com.tools20022.repository.codeset.OrderTypeCode.SellShortExempt, com.tools20022.repository.codeset.OrderTypeCode.WithOrWithout, com.tools20022.repository.codeset.OrderTypeCode.PreviouslyQuoted,
						com.tools20022.repository.codeset.OrderTypeCode.PreviouslyIndicated, com.tools20022.repository.codeset.OrderTypeCode.ForexSwap, com.tools20022.repository.codeset.OrderTypeCode.Funari,
						com.tools20022.repository.codeset.OrderTypeCode.MarketWithLeftover, com.tools20022.repository.codeset.OrderTypeCode.Pegged, com.tools20022.repository.codeset.OrderTypeCode.CounterOrderSelection);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AllOrNone.getCodeName().get(), AllOrNone);
		codesByName.put(BuyContraShortExempt.getCodeName().get(), BuyContraShortExempt);
		codesByName.put(BuyContraShort.getCodeName().get(), BuyContraShort);
		codesByName.put(BuyMinus.getCodeName().get(), BuyMinus);
		codesByName.put(Carefully.getCodeName().get(), Carefully);
		codesByName.put(Combination.getCodeName().get(), Combination);
		codesByName.put(Discretionary.getCodeName().get(), Discretionary);
		codesByName.put(Limit.getCodeName().get(), Limit);
		codesByName.put(LimitOnClose.getCodeName().get(), LimitOnClose);
		codesByName.put(LimitOrBetter.getCodeName().get(), LimitOrBetter);
		codesByName.put(LimitWith.getCodeName().get(), LimitWith);
		codesByName.put(LimitWithout.getCodeName().get(), LimitWithout);
		codesByName.put(Market.getCodeName().get(), Market);
		codesByName.put(MarketNotHeld.getCodeName().get(), MarketNotHeld);
		codesByName.put(MarketTouched.getCodeName().get(), MarketTouched);
		codesByName.put(NotHeld.getCodeName().get(), NotHeld);
		codesByName.put(OrderLie.getCodeName().get(), OrderLie);
		codesByName.put(OnBasisPrice.getCodeName().get(), OnBasisPrice);
		codesByName.put(Stop.getCodeName().get(), Stop);
		codesByName.put(StopLimit.getCodeName().get(), StopLimit);
		codesByName.put(StopLoss.getCodeName().get(), StopLoss);
		codesByName.put(SellPlus.getCodeName().get(), SellPlus);
		codesByName.put(SellShort.getCodeName().get(), SellShort);
		codesByName.put(SellShortExempt.getCodeName().get(), SellShortExempt);
		codesByName.put(WithOrWithout.getCodeName().get(), WithOrWithout);
		codesByName.put(PreviouslyQuoted.getCodeName().get(), PreviouslyQuoted);
		codesByName.put(PreviouslyIndicated.getCodeName().get(), PreviouslyIndicated);
		codesByName.put(ForexSwap.getCodeName().get(), ForexSwap);
		codesByName.put(Funari.getCodeName().get(), Funari);
		codesByName.put(MarketWithLeftover.getCodeName().get(), MarketWithLeftover);
		codesByName.put(Pegged.getCodeName().get(), Pegged);
		codesByName.put(CounterOrderSelection.getCodeName().get(), CounterOrderSelection);
	}

	public static OrderTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static OrderTypeCode[] values() {
		OrderTypeCode[] values = new OrderTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, OrderTypeCode> {
		@Override
		public OrderTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(OrderTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}