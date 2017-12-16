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
import com.tools20022.repository.codeset.SideCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Side taken by a party on an order.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.SideCode#Buy
 * SideCode.mmBuy}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SideCode#Sell
 * SideCode.mmSell}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SideCode#Cross
 * SideCode.mmCross}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SideCode#CrossShort
 * SideCode.mmCrossShort}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SideCode#CrossShortExempt
 * SideCode.mmCrossShortExempt}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SideCode#AsDefined
 * SideCode.mmAsDefined}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SideCode#Opposite
 * SideCode.mmOpposite}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SideCode#Undisclosed
 * SideCode.mmUndisclosed}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SideCode#TwoSided
 * SideCode.mmTwoSided}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SideCode#BuyMinus
 * SideCode.mmBuyMinus}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SideCode#SellPlus
 * SideCode.mmSellPlus}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SideCode#SellShort
 * SideCode.mmSellShort}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SideCode#SellShortExempt
 * SideCode.mmSellShortExempt}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SideCode#Lend
 * SideCode.mmLend}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SideCode#Borrow
 * SideCode.mmBorrow}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SideCode#OptionExercise
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
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SideCode extends MMCode {

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
	public static final SideCode Buy = new SideCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Buy";
			definition = "Order is buy driven.";
			owner_lazy = () -> com.tools20022.repository.codeset.SideCode.mmObject();
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
	public static final SideCode Sell = new SideCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Sell";
			definition = "Order is sell driven.";
			owner_lazy = () -> com.tools20022.repository.codeset.SideCode.mmObject();
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
	public static final SideCode Cross = new SideCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Cross";
			definition = "Identifies an order for which a broker wishes to take the other side and cross with the client.";
			owner_lazy = () -> com.tools20022.repository.codeset.SideCode.mmObject();
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
	public static final SideCode CrossShort = new SideCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CrossShort";
			definition = "Identifies a type of order for which a broker wants to cross with the client in the case a client wants to establish a short position, and sends a Sell Short order to the broker. Many exchanges have tick rules needing to be enforced, and the order getting converted from Sell Short to Cross (instead of Cross Short) could result in an illegal short sell.";
			owner_lazy = () -> com.tools20022.repository.codeset.SideCode.mmObject();
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
	public static final SideCode CrossShortExempt = new SideCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CrossShortExempt";
			definition = "Identifies a type of order for which a broker wants to cross with the client in the case a client wants to establish a short position and is exempt from the uptick restriction. Used as audit trail on exchanges.";
			owner_lazy = () -> com.tools20022.repository.codeset.SideCode.mmObject();
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
	public static final SideCode AsDefined = new SideCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AsDefined";
			definition = "Indicates, in the case of a multileg instrument,that the sides of the legs are the same as defined at the creation of the multileg instrument.";
			owner_lazy = () -> com.tools20022.repository.codeset.SideCode.mmObject();
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
	public static final SideCode Opposite = new SideCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Opposite";
			definition = "Indicates, in the case of a multileg instrument,that the sides of the legs are the opposite of their definition at the creation of the multileg instrument.";
			owner_lazy = () -> com.tools20022.repository.codeset.SideCode.mmObject();
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
	public static final SideCode Undisclosed = new SideCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Undisclosed";
			definition = "The side of the indication of interest is not disclosed.";
			owner_lazy = () -> com.tools20022.repository.codeset.SideCode.mmObject();
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
	public static final SideCode TwoSided = new SideCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TwoSided";
			definition = "Indicates that the side refers to both buys and sells.";
			owner_lazy = () -> com.tools20022.repository.codeset.SideCode.mmObject();
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
	public static final SideCode BuyMinus = new SideCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyMinus";
			definition = "A round-lot market order to buy minus is an order to buy a stated amount of a stock provided that its price is:\n- not higher than the last sale if the last sale was a minus or zero minus tick and\n- not higher than the last sale minus the minimum fractional change in the stock if the last sale was a plus or zero plus tick.\nA limit price order to buy minus also states the highest price at which it can be executed.";
			owner_lazy = () -> com.tools20022.repository.codeset.SideCode.mmObject();
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
	public static final SideCode SellPlus = new SideCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellPlus";
			definition = "A round-lot market order to sell plus is an order to sell a stated amount of a stock provided that its price is:\n- not lower than the last sale if the last sale was a plus or zero plus tick and\n- not lower than the last sale minus the minimum fractional change in the stock if the last sale was a minus or zero minus tick.\nA limit-price order to sell plus also states the lowest price at which it can be executed.";
			owner_lazy = () -> com.tools20022.repository.codeset.SideCode.mmObject();
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
	public static final SideCode SellShort = new SideCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellShort";
			definition = "An order to sell a security that the seller does not own; a sale effected by delivering a security borrowed by, or for the account of, the seller. Can only be executed on a plus or zero plus tick.";
			owner_lazy = () -> com.tools20022.repository.codeset.SideCode.mmObject();
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
	public static final SideCode SellShortExempt = new SideCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellShortExempt";
			definition = "Short sale exempt from short-sale rules.";
			owner_lazy = () -> com.tools20022.repository.codeset.SideCode.mmObject();
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
	public static final SideCode Lend = new SideCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Lend";
			definition = "Order is to lend securities.";
			owner_lazy = () -> com.tools20022.repository.codeset.SideCode.mmObject();
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
	public static final SideCode Borrow = new SideCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Borrow";
			definition = "Order is to borrow securities.";
			owner_lazy = () -> com.tools20022.repository.codeset.SideCode.mmObject();
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
	public static final SideCode OptionExercise = new SideCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionExercise";
			definition = "Exercise of an option contract.";
			owner_lazy = () -> com.tools20022.repository.codeset.SideCode.mmObject();
			codeName = "OPEX";
		}
	};
	final static private LinkedHashMap<String, SideCode> codesByName = new LinkedHashMap<>();

	protected SideCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("BUYI");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SideCode";
				definition = "Side taken by a party on an order.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SideCode.Buy, com.tools20022.repository.codeset.SideCode.Sell, com.tools20022.repository.codeset.SideCode.Cross,
						com.tools20022.repository.codeset.SideCode.CrossShort, com.tools20022.repository.codeset.SideCode.CrossShortExempt, com.tools20022.repository.codeset.SideCode.AsDefined,
						com.tools20022.repository.codeset.SideCode.Opposite, com.tools20022.repository.codeset.SideCode.Undisclosed, com.tools20022.repository.codeset.SideCode.TwoSided, com.tools20022.repository.codeset.SideCode.BuyMinus,
						com.tools20022.repository.codeset.SideCode.SellPlus, com.tools20022.repository.codeset.SideCode.SellShort, com.tools20022.repository.codeset.SideCode.SellShortExempt, com.tools20022.repository.codeset.SideCode.Lend,
						com.tools20022.repository.codeset.SideCode.Borrow, com.tools20022.repository.codeset.SideCode.OptionExercise);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Buy.getCodeName().get(), Buy);
		codesByName.put(Sell.getCodeName().get(), Sell);
		codesByName.put(Cross.getCodeName().get(), Cross);
		codesByName.put(CrossShort.getCodeName().get(), CrossShort);
		codesByName.put(CrossShortExempt.getCodeName().get(), CrossShortExempt);
		codesByName.put(AsDefined.getCodeName().get(), AsDefined);
		codesByName.put(Opposite.getCodeName().get(), Opposite);
		codesByName.put(Undisclosed.getCodeName().get(), Undisclosed);
		codesByName.put(TwoSided.getCodeName().get(), TwoSided);
		codesByName.put(BuyMinus.getCodeName().get(), BuyMinus);
		codesByName.put(SellPlus.getCodeName().get(), SellPlus);
		codesByName.put(SellShort.getCodeName().get(), SellShort);
		codesByName.put(SellShortExempt.getCodeName().get(), SellShortExempt);
		codesByName.put(Lend.getCodeName().get(), Lend);
		codesByName.put(Borrow.getCodeName().get(), Borrow);
		codesByName.put(OptionExercise.getCodeName().get(), OptionExercise);
	}

	public static SideCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SideCode[] values() {
		SideCode[] values = new SideCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SideCode> {
		@Override
		public SideCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SideCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}