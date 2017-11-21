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
 * Side taken by a party on an order.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.SideCode#mmBuy
 * SideCode.mmBuy}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SideCode#mmSell
 * SideCode.mmSell}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SideCode#mmCross
 * SideCode.mmCross}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SideCode#mmCrossShort
 * SideCode.mmCrossShort}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SideCode#mmCrossShortExempt
 * SideCode.mmCrossShortExempt}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SideCode#mmAsDefined
 * SideCode.mmAsDefined}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SideCode#mmOpposite
 * SideCode.mmOpposite}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SideCode#mmUndisclosed
 * SideCode.mmUndisclosed}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SideCode#mmTwoSided
 * SideCode.mmTwoSided}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SideCode#mmBuyMinus
 * SideCode.mmBuyMinus}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SideCode#mmSellPlus
 * SideCode.mmSellPlus}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SideCode#mmSellShort
 * SideCode.mmSellShort}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SideCode#mmSellShortExempt
 * SideCode.mmSellShortExempt}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SideCode#mmLend
 * SideCode.mmLend}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SideCode#mmBorrow
 * SideCode.mmBorrow}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SideCode#mmOptionExercise
 * SideCode.mmOptionExercise}</li>
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
 * <li>"BUYI"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SideCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Side taken by a party on an order."</li>
 * </ul>
 */
public class SideCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Order is buy driven.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SideCode SideCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BUYI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Buy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order is buy driven."</li>
	 * </ul>
	 */
	public static final MMCode mmBuy = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Buy";
			definition = "Order is buy driven.";
			owner_lazy = () -> SideCode.mmObject();
			codeName = "BUYI";
		}
	};
	/**
	 * Order is sell driven.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SideCode SideCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SELL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Sell"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order is sell driven."</li>
	 * </ul>
	 */
	public static final MMCode mmSell = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Sell";
			definition = "Order is sell driven.";
			owner_lazy = () -> SideCode.mmObject();
			codeName = "SELL";
		}
	};
	/**
	 * Identifies an order for which a broker wishes to take the other side and
	 * cross with the client.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SideCode SideCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CROS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cross"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies an order for which a broker wishes to take the other side and cross with the client."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCross = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Cross";
			definition = "Identifies an order for which a broker wishes to take the other side and cross with the client.";
			owner_lazy = () -> SideCode.mmObject();
			codeName = "CROS";
		}
	};
	/**
	 * Identifies a type of order for which a broker wants to cross with the
	 * client in the case a client wants to establish a short position, and
	 * sends a Sell Short order to the broker. Many exchanges have tick rules
	 * needing to be enforced, and the order getting converted from Sell Short
	 * to Cross (instead of Cross Short) could result in an illegal short sell.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SideCode SideCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRSH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CrossShort"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies a type of order for which a broker wants to cross with the client in the case a client wants to establish a short position, and sends a Sell Short order to the broker. Many exchanges have tick rules needing to be enforced, and the order getting converted from Sell Short to Cross (instead of Cross Short) could result in an illegal short sell."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCrossShort = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CrossShort";
			definition = "Identifies a type of order for which a broker wants to cross with the client in the case a client wants to establish a short position, and sends a Sell Short order to the broker. Many exchanges have tick rules needing to be enforced, and the order getting converted from Sell Short to Cross (instead of Cross Short) could result in an illegal short sell.";
			owner_lazy = () -> SideCode.mmObject();
			codeName = "CRSH";
		}
	};
	/**
	 * Identifies a type of order for which a broker wants to cross with the
	 * client in the case a client wants to establish a short position and is
	 * exempt from the uptick restriction. Used as audit trail on exchanges.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SideCode SideCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CSHE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CrossShortExempt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies a type of order for which a broker wants to cross with the client in the case a client wants to establish a short position and is exempt from the uptick restriction. Used as audit trail on exchanges."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCrossShortExempt = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CrossShortExempt";
			definition = "Identifies a type of order for which a broker wants to cross with the client in the case a client wants to establish a short position and is exempt from the uptick restriction. Used as audit trail on exchanges.";
			owner_lazy = () -> SideCode.mmObject();
			codeName = "CSHE";
		}
	};
	/**
	 * Indicates, in the case of a multileg instrument,that the sides of the
	 * legs are the same as defined at the creation of the multileg instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SideCode SideCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DEFI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AsDefined"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates, in the case of a multileg instrument,that the sides of the legs are the same as defined at the creation of the multileg instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAsDefined = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AsDefined";
			definition = "Indicates, in the case of a multileg instrument,that the sides of the legs are the same as defined at the creation of the multileg instrument.";
			owner_lazy = () -> SideCode.mmObject();
			codeName = "DEFI";
		}
	};
	/**
	 * Indicates, in the case of a multileg instrument,that the sides of the
	 * legs are the opposite of their definition at the creation of the multileg
	 * instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SideCode SideCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OPPO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Opposite"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates, in the case of a multileg instrument,that the sides of the legs are the opposite of their definition at the creation of the multileg instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmOpposite = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Opposite";
			definition = "Indicates, in the case of a multileg instrument,that the sides of the legs are the opposite of their definition at the creation of the multileg instrument.";
			owner_lazy = () -> SideCode.mmObject();
			codeName = "OPPO";
		}
	};
	/**
	 * The side of the indication of interest is not disclosed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SideCode SideCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UNDI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Undisclosed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The side of the indication of interest is not disclosed."</li>
	 * </ul>
	 */
	public static final MMCode mmUndisclosed = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Undisclosed";
			definition = "The side of the indication of interest is not disclosed.";
			owner_lazy = () -> SideCode.mmObject();
			codeName = "UNDI";
		}
	};
	/**
	 * Indicates that the side refers to both buys and sells.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SideCode SideCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TWOS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoSided"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates that the side refers to both buys and sells."</li>
	 * </ul>
	 */
	public static final MMCode mmTwoSided = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TwoSided";
			definition = "Indicates that the side refers to both buys and sells.";
			owner_lazy = () -> SideCode.mmObject();
			codeName = "TWOS";
		}
	};
	/**
	 * A round-lot market order to buy minus is an order to buy a stated amount
	 * of a stock provided that its price is: - not higher than the last sale if
	 * the last sale was a minus or zero minus tick and - not higher than the
	 * last sale minus the minimum fractional change in the stock if the last
	 * sale was a plus or zero plus tick. A limit price order to buy minus also
	 * states the highest price at which it can be executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SideCode SideCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BUMI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyMinus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A round-lot market order to buy minus is an order to buy a stated amount of a stock provided that its price is:\n- not higher than the last sale if the last sale was a minus or zero minus tick and\n- not higher than the last sale minus the minimum fractional change in the stock if the last sale was a plus or zero plus tick.\nA limit price order to buy minus also states the highest price at which it can be executed."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmBuyMinus = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyMinus";
			definition = "A round-lot market order to buy minus is an order to buy a stated amount of a stock provided that its price is:\n- not higher than the last sale if the last sale was a minus or zero minus tick and\n- not higher than the last sale minus the minimum fractional change in the stock if the last sale was a plus or zero plus tick.\nA limit price order to buy minus also states the highest price at which it can be executed.";
			owner_lazy = () -> SideCode.mmObject();
			codeName = "BUMI";
		}
	};
	/**
	 * A round-lot market order to sell plus is an order to sell a stated amount
	 * of a stock provided that its price is: - not lower than the last sale if
	 * the last sale was a plus or zero plus tick and - not lower than the last
	 * sale minus the minimum fractional change in the stock if the last sale
	 * was a minus or zero minus tick. A limit-price order to sell plus also
	 * states the lowest price at which it can be executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SideCode SideCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SEPL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellPlus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A round-lot market order to sell plus is an order to sell a stated amount of a stock provided that its price is:\n- not lower than the last sale if the last sale was a plus or zero plus tick and\n- not lower than the last sale minus the minimum fractional change in the stock if the last sale was a minus or zero minus tick.\nA limit-price order to sell plus also states the lowest price at which it can be executed."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmSellPlus = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellPlus";
			definition = "A round-lot market order to sell plus is an order to sell a stated amount of a stock provided that its price is:\n- not lower than the last sale if the last sale was a plus or zero plus tick and\n- not lower than the last sale minus the minimum fractional change in the stock if the last sale was a minus or zero minus tick.\nA limit-price order to sell plus also states the lowest price at which it can be executed.";
			owner_lazy = () -> SideCode.mmObject();
			codeName = "SEPL";
		}
	};
	/**
	 * An order to sell a security that the seller does not own; a sale effected
	 * by delivering a security borrowed by, or for the account of, the seller.
	 * Can only be executed on a plus or zero plus tick.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SideCode SideCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SESH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellShort"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An order to sell a security that the seller does not own; a sale effected by delivering a security borrowed by, or for the account of, the seller. Can only be executed on a plus or zero plus tick."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmSellShort = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellShort";
			definition = "An order to sell a security that the seller does not own; a sale effected by delivering a security borrowed by, or for the account of, the seller. Can only be executed on a plus or zero plus tick.";
			owner_lazy = () -> SideCode.mmObject();
			codeName = "SESH";
		}
	};
	/**
	 * Short sale exempt from short-sale rules.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SideCode SideCode}</li>
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
	 * definition} = "Short sale exempt from short-sale rules."</li>
	 * </ul>
	 */
	public static final MMCode mmSellShortExempt = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellShortExempt";
			definition = "Short sale exempt from short-sale rules.";
			owner_lazy = () -> SideCode.mmObject();
			codeName = "SSEX";
		}
	};
	/**
	 * Order is to lend securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SideCode SideCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LEND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Lend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order is to lend securities."</li>
	 * </ul>
	 */
	public static final MMCode mmLend = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Lend";
			definition = "Order is to lend securities.";
			owner_lazy = () -> SideCode.mmObject();
			codeName = "LEND";
		}
	};
	/**
	 * Order is to borrow securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SideCode SideCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BORW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Borrow"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order is to borrow securities."</li>
	 * </ul>
	 */
	public static final MMCode mmBorrow = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Borrow";
			definition = "Order is to borrow securities.";
			owner_lazy = () -> SideCode.mmObject();
			codeName = "BORW";
		}
	};
	/**
	 * Exercise of an option contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SideCode SideCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OPEX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionExercise"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Exercise of an option contract."</li>
	 * </ul>
	 */
	public static final MMCode mmOptionExercise = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionExercise";
			definition = "Exercise of an option contract.";
			owner_lazy = () -> SideCode.mmObject();
			codeName = "OPEX";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("BUYI");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SideCode";
				definition = "Side taken by a party on an order.";
				code_lazy = () -> Arrays.asList(SideCode.mmBuy, SideCode.mmSell, SideCode.mmCross, SideCode.mmCrossShort, SideCode.mmCrossShortExempt, SideCode.mmAsDefined, SideCode.mmOpposite, SideCode.mmUndisclosed, SideCode.mmTwoSided,
						SideCode.mmBuyMinus, SideCode.mmSellPlus, SideCode.mmSellShort, SideCode.mmSellShortExempt, SideCode.mmLend, SideCode.mmBorrow, SideCode.mmOptionExercise);
			}
		});
		return mmObject_lazy.get();
	}
}