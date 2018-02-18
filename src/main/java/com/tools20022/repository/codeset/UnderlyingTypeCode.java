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
import com.tools20022.repository.codeset.UnderlyingTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the underlying financial instrument.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.UnderlyingTypeCode#Equity
 * UnderlyingTypeCode.Equity}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnderlyingTypeCode#Index
 * UnderlyingTypeCode.Index}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeCode#Interest
 * UnderlyingTypeCode.Interest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeCode#Currency
 * UnderlyingTypeCode.Currency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeCode#PreciousMetal
 * UnderlyingTypeCode.PreciousMetal}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnderlyingTypeCode#Future
 * UnderlyingTypeCode.Future}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnderlyingTypeCode#Option
 * UnderlyingTypeCode.Option}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnderlyingTypeCode#Basket
 * UnderlyingTypeCode.Basket}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnderlyingTypeCode#Swap
 * UnderlyingTypeCode.Swap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeCode#Commodity
 * UnderlyingTypeCode.Commodity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeCode#StockIndex
 * UnderlyingTypeCode.StockIndex}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnderlyingTypeCode#Share
 * UnderlyingTypeCode.Share}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeCode#DividendIndex
 * UnderlyingTypeCode.DividendIndex}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeCode#StockDividend
 * UnderlyingTypeCode.StockDividend}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnderlyingTypeCode#Other
 * UnderlyingTypeCode.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeCode#VolatilityIndex
 * UnderlyingTypeCode.VolatilityIndex}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeCode#ExchangeTradedFund
 * UnderlyingTypeCode.ExchangeTradedFund}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnderlyingTypeCode#Bond
 * UnderlyingTypeCode.Bond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeCode#FutureOnEquity
 * UnderlyingTypeCode.FutureOnEquity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeCode#OptionOnEquity
 * UnderlyingTypeCode.OptionOnEquity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeCode#BondFuture
 * UnderlyingTypeCode.BondFuture}</li>
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
 * <li>"EQUI"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UnderlyingTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the underlying financial instrument."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class UnderlyingTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * The underlying is an equity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeCode
	 * UnderlyingTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EQUI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Equity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The underlying is an equity."</li>
	 * </ul>
	 */
	public static final UnderlyingTypeCode Equity = new UnderlyingTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Equity";
			definition = "The underlying is an equity.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingTypeCode.mmObject();
			codeName = "EQUI";
		}
	};
	/**
	 * The underlying is an index.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeCode
	 * UnderlyingTypeCode}</li>
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
	 * definition} = "The underlying is an index."</li>
	 * </ul>
	 */
	public static final UnderlyingTypeCode Index = new UnderlyingTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Index";
			definition = "The underlying is an index.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingTypeCode.mmObject();
			codeName = "INDX";
		}
	};
	/**
	 * The underlying is an interest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeCode
	 * UnderlyingTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The underlying is an interest."</li>
	 * </ul>
	 */
	public static final UnderlyingTypeCode Interest = new UnderlyingTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Interest";
			definition = "The underlying is an interest.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingTypeCode.mmObject();
			codeName = "INTR";
		}
	};
	/**
	 * The underlying is a currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeCode
	 * UnderlyingTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CURR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The underlying is a currency."</li>
	 * </ul>
	 */
	public static final UnderlyingTypeCode Currency = new UnderlyingTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Currency";
			definition = "The underlying is a currency.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingTypeCode.mmObject();
			codeName = "CURR";
		}
	};
	/**
	 * The underlying is a precious metal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeCode
	 * UnderlyingTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRME"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreciousMetal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The underlying is a precious metal."</li>
	 * </ul>
	 */
	public static final UnderlyingTypeCode PreciousMetal = new UnderlyingTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PreciousMetal";
			definition = "The underlying is a precious metal.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingTypeCode.mmObject();
			codeName = "PRME";
		}
	};
	/**
	 * The underlying is a future.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeCode
	 * UnderlyingTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FUTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Future"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The underlying is a future."</li>
	 * </ul>
	 */
	public static final UnderlyingTypeCode Future = new UnderlyingTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Future";
			definition = "The underlying is a future.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingTypeCode.mmObject();
			codeName = "FUTR";
		}
	};
	/**
	 * The underlying is an option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeCode
	 * UnderlyingTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OPTN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Option"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The underlying is an option."</li>
	 * </ul>
	 */
	public static final UnderlyingTypeCode Option = new UnderlyingTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Option";
			definition = "The underlying is an option.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingTypeCode.mmObject();
			codeName = "OPTN";
		}
	};
	/**
	 * The underlying is a basket.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeCode
	 * UnderlyingTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BASK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Basket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The underlying is a basket."</li>
	 * </ul>
	 */
	public static final UnderlyingTypeCode Basket = new UnderlyingTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Basket";
			definition = "The underlying is a basket.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingTypeCode.mmObject();
			codeName = "BASK";
		}
	};
	/**
	 * The underlying is a swap.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeCode
	 * UnderlyingTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SWAP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Swap"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The underlying is a swap."</li>
	 * </ul>
	 */
	public static final UnderlyingTypeCode Swap = new UnderlyingTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Swap";
			definition = "The underlying is a swap.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingTypeCode.mmObject();
			codeName = "SWAP";
		}
	};
	/**
	 * The underlying is a commodity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeCode
	 * UnderlyingTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COMM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Commodity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The underlying is a commodity."</li>
	 * </ul>
	 */
	public static final UnderlyingTypeCode Commodity = new UnderlyingTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Commodity";
			definition = "The underlying is a commodity.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingTypeCode.mmObject();
			codeName = "COMM";
		}
	};
	/**
	 * Underlying is a stock index.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeCode
	 * UnderlyingTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STIX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockIndex"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying is a stock index."</li>
	 * </ul>
	 */
	public static final UnderlyingTypeCode StockIndex = new UnderlyingTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockIndex";
			definition = "Underlying is a stock index.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingTypeCode.mmObject();
			codeName = "STIX";
		}
	};
	/**
	 * Underlying is a share.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeCode
	 * UnderlyingTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SHAR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Share"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying is a share."</li>
	 * </ul>
	 */
	public static final UnderlyingTypeCode Share = new UnderlyingTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Share";
			definition = "Underlying is a share.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingTypeCode.mmObject();
			codeName = "SHAR";
		}
	};
	/**
	 * Underlying is a dividend index.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeCode
	 * UnderlyingTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DIVI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendIndex"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying is a dividend index."</li>
	 * </ul>
	 */
	public static final UnderlyingTypeCode DividendIndex = new UnderlyingTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendIndex";
			definition = "Underlying is a dividend index.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingTypeCode.mmObject();
			codeName = "DIVI";
		}
	};
	/**
	 * Underlying is a stock dividend.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeCode
	 * UnderlyingTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DVSE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying is a stock dividend."</li>
	 * </ul>
	 */
	public static final UnderlyingTypeCode StockDividend = new UnderlyingTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockDividend";
			definition = "Underlying is a stock dividend.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingTypeCode.mmObject();
			codeName = "DVSE";
		}
	};
	/**
	 * Underlying is of other type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeCode
	 * UnderlyingTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying is of other type."</li>
	 * </ul>
	 */
	public static final UnderlyingTypeCode Other = new UnderlyingTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Underlying is of other type.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingTypeCode.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Underlying is a volatility index.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeCode
	 * UnderlyingTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VOLI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VolatilityIndex"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying is a volatility index."</li>
	 * </ul>
	 */
	public static final UnderlyingTypeCode VolatilityIndex = new UnderlyingTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VolatilityIndex";
			definition = "Underlying is a volatility index.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingTypeCode.mmObject();
			codeName = "VOLI";
		}
	};
	/**
	 * Underlying is an exchange traded fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeCode
	 * UnderlyingTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ETFT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeTradedFund"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying is an exchange traded fund."</li>
	 * </ul>
	 */
	public static final UnderlyingTypeCode ExchangeTradedFund = new UnderlyingTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeTradedFund";
			definition = "Underlying is an exchange traded fund.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingTypeCode.mmObject();
			codeName = "ETFT";
		}
	};
	/**
	 * Underlying is a bond.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeCode
	 * UnderlyingTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BOND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying is a bond."</li>
	 * </ul>
	 */
	public static final UnderlyingTypeCode Bond = new UnderlyingTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bond";
			definition = "Underlying is a bond.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingTypeCode.mmObject();
			codeName = "BOND";
		}
	};
	/**
	 * Underlying is a future on equity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeCode
	 * UnderlyingTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FTEQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FutureOnEquity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying is a future on equity."</li>
	 * </ul>
	 */
	public static final UnderlyingTypeCode FutureOnEquity = new UnderlyingTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FutureOnEquity";
			definition = "Underlying is a future on equity.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingTypeCode.mmObject();
			codeName = "FTEQ";
		}
	};
	/**
	 * Underlying is an option on equity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeCode
	 * UnderlyingTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OPEQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionOnEquity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying is an option on equity."</li>
	 * </ul>
	 */
	public static final UnderlyingTypeCode OptionOnEquity = new UnderlyingTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionOnEquity";
			definition = "Underlying is an option on equity.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingTypeCode.mmObject();
			codeName = "OPEQ";
		}
	};
	/**
	 * Underlying is a bond future.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeCode
	 * UnderlyingTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BNDF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BondFuture"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying is a bond future."</li>
	 * </ul>
	 */
	public static final UnderlyingTypeCode BondFuture = new UnderlyingTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BondFuture";
			definition = "Underlying is a bond future.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingTypeCode.mmObject();
			codeName = "BNDF";
		}
	};
	final static private LinkedHashMap<String, UnderlyingTypeCode> codesByName = new LinkedHashMap<>();

	protected UnderlyingTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("EQUI");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UnderlyingTypeCode";
				definition = "Specifies the underlying financial instrument.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.UnderlyingTypeCode.Equity, com.tools20022.repository.codeset.UnderlyingTypeCode.Index, com.tools20022.repository.codeset.UnderlyingTypeCode.Interest,
						com.tools20022.repository.codeset.UnderlyingTypeCode.Currency, com.tools20022.repository.codeset.UnderlyingTypeCode.PreciousMetal, com.tools20022.repository.codeset.UnderlyingTypeCode.Future,
						com.tools20022.repository.codeset.UnderlyingTypeCode.Option, com.tools20022.repository.codeset.UnderlyingTypeCode.Basket, com.tools20022.repository.codeset.UnderlyingTypeCode.Swap,
						com.tools20022.repository.codeset.UnderlyingTypeCode.Commodity, com.tools20022.repository.codeset.UnderlyingTypeCode.StockIndex, com.tools20022.repository.codeset.UnderlyingTypeCode.Share,
						com.tools20022.repository.codeset.UnderlyingTypeCode.DividendIndex, com.tools20022.repository.codeset.UnderlyingTypeCode.StockDividend, com.tools20022.repository.codeset.UnderlyingTypeCode.Other,
						com.tools20022.repository.codeset.UnderlyingTypeCode.VolatilityIndex, com.tools20022.repository.codeset.UnderlyingTypeCode.ExchangeTradedFund, com.tools20022.repository.codeset.UnderlyingTypeCode.Bond,
						com.tools20022.repository.codeset.UnderlyingTypeCode.FutureOnEquity, com.tools20022.repository.codeset.UnderlyingTypeCode.OptionOnEquity, com.tools20022.repository.codeset.UnderlyingTypeCode.BondFuture);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Equity.getCodeName().get(), Equity);
		codesByName.put(Index.getCodeName().get(), Index);
		codesByName.put(Interest.getCodeName().get(), Interest);
		codesByName.put(Currency.getCodeName().get(), Currency);
		codesByName.put(PreciousMetal.getCodeName().get(), PreciousMetal);
		codesByName.put(Future.getCodeName().get(), Future);
		codesByName.put(Option.getCodeName().get(), Option);
		codesByName.put(Basket.getCodeName().get(), Basket);
		codesByName.put(Swap.getCodeName().get(), Swap);
		codesByName.put(Commodity.getCodeName().get(), Commodity);
		codesByName.put(StockIndex.getCodeName().get(), StockIndex);
		codesByName.put(Share.getCodeName().get(), Share);
		codesByName.put(DividendIndex.getCodeName().get(), DividendIndex);
		codesByName.put(StockDividend.getCodeName().get(), StockDividend);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(VolatilityIndex.getCodeName().get(), VolatilityIndex);
		codesByName.put(ExchangeTradedFund.getCodeName().get(), ExchangeTradedFund);
		codesByName.put(Bond.getCodeName().get(), Bond);
		codesByName.put(FutureOnEquity.getCodeName().get(), FutureOnEquity);
		codesByName.put(OptionOnEquity.getCodeName().get(), OptionOnEquity);
		codesByName.put(BondFuture.getCodeName().get(), BondFuture);
	}

	public static UnderlyingTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static UnderlyingTypeCode[] values() {
		UnderlyingTypeCode[] values = new UnderlyingTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, UnderlyingTypeCode> {
		@Override
		public UnderlyingTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(UnderlyingTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}