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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of place where a trade was executed, a price was sourced
 * from, an instrument is listed.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarketTypeCode#PrimaryMarket
 * MarketTypeCode.PrimaryMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarketTypeCode#SecondaryMarket
 * MarketTypeCode.SecondaryMarket}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MarketTypeCode#ThirdMarket
 * MarketTypeCode.ThirdMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarketTypeCode#FourthMarket
 * MarketTypeCode.FourthMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarketTypeCode#OverTheCounter
 * MarketTypeCode.OverTheCounter}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MarketTypeCode#Various
 * MarketTypeCode.Various}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarketTypeCode#StockExchange
 * MarketTypeCode.StockExchange}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MarketTypeCode#Fund
 * MarketTypeCode.Fund}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MarketTypeCode#LocalMarket
 * MarketTypeCode.LocalMarket}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MarketTypeCode#Theoretical
 * MarketTypeCode.Theoretical}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MarketTypeCode#Vendor
 * MarketTypeCode.Vendor}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MarketTypeCode#InterBank
 * MarketTypeCode.InterBank}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MarketTypeCode#Counter
 * MarketTypeCode.Counter}</li>
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
 * <li>"PRIM"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MarketTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of place where a trade was executed, a price was sourced from, an instrument is listed."
 * </li>
 * </ul>
 */
public class MarketTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * The place is a primary market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarketTypeCode
	 * MarketTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRIM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrimaryMarket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The place is a primary market."</li>
	 * </ul>
	 */
	public static final MMCode PrimaryMarket = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PrimaryMarket";
			definition = "The place is a primary market.";
			owner_lazy = () -> MarketTypeCode.mmObject();
			codeName = "PRIM";
		}
	};
	/**
	 * The place is a secondary market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarketTypeCode
	 * MarketTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SECM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondaryMarket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The place is a secondary market."</li>
	 * </ul>
	 */
	public static final MMCode SecondaryMarket = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecondaryMarket";
			definition = "The place is a secondary market.";
			owner_lazy = () -> MarketTypeCode.mmObject();
			codeName = "SECM";
		}
	};
	/**
	 * The place is a third market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarketTypeCode
	 * MarketTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "THIM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ThirdMarket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The place is a third market."</li>
	 * </ul>
	 */
	public static final MMCode ThirdMarket = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ThirdMarket";
			definition = "The place is a third market.";
			owner_lazy = () -> MarketTypeCode.mmObject();
			codeName = "THIM";
		}
	};
	/**
	 * The place is a fourth market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarketTypeCode
	 * MarketTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FOUM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FourthMarket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The place is a fourth market."</li>
	 * </ul>
	 */
	public static final MMCode FourthMarket = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FourthMarket";
			definition = "The place is a fourth market.";
			owner_lazy = () -> MarketTypeCode.mmObject();
			codeName = "FOUM";
		}
	};
	/**
	 * The place is over the counter.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarketTypeCode
	 * MarketTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTCO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OverTheCounter"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The place is over the counter."</li>
	 * </ul>
	 */
	public static final MMCode OverTheCounter = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OverTheCounter";
			definition = "The place is over the counter.";
			owner_lazy = () -> MarketTypeCode.mmObject();
			codeName = "OTCO";
		}
	};
	/**
	 * Various places.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarketTypeCode
	 * MarketTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VARI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Various"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Various places."</li>
	 * </ul>
	 */
	public static final MMCode Various = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Various";
			definition = "Various places.";
			owner_lazy = () -> MarketTypeCode.mmObject();
			codeName = "VARI";
		}
	};
	/**
	 * The place is a stock exchange.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarketTypeCode
	 * MarketTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXCH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The place is a stock exchange."</li>
	 * </ul>
	 */
	public static final MMCode StockExchange = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StockExchange";
			definition = "The place is a stock exchange.";
			owner_lazy = () -> MarketTypeCode.mmObject();
			codeName = "EXCH";
		}
	};
	/**
	 * The place is a fund (transfer agent, fund itself, etc.).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarketTypeCode
	 * MarketTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FUND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Fund"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The place is a fund (transfer agent, fund itself, etc.)."</li>
	 * </ul>
	 */
	public static final MMCode Fund = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Fund";
			definition = "The place is a fund (transfer agent, fund itself, etc.).";
			owner_lazy = () -> MarketTypeCode.mmObject();
			codeName = "FUND";
		}
	};
	/**
	 * The place is a local market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarketTypeCode
	 * MarketTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LMAR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LocalMarket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The place is a local market."</li>
	 * </ul>
	 */
	public static final MMCode LocalMarket = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LocalMarket";
			definition = "The place is a local market.";
			owner_lazy = () -> MarketTypeCode.mmObject();
			codeName = "LMAR";
		}
	};
	/**
	 * The place is theoretical.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarketTypeCode
	 * MarketTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "THEO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Theoretical"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The place is theoretical."</li>
	 * </ul>
	 */
	public static final MMCode Theoretical = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Theoretical";
			definition = "The place is theoretical.";
			owner_lazy = () -> MarketTypeCode.mmObject();
			codeName = "THEO";
		}
	};
	/**
	 * The place is a vendor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarketTypeCode
	 * MarketTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VEND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Vendor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The place is a vendor."</li>
	 * </ul>
	 */
	public static final MMCode Vendor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Vendor";
			definition = "The place is a vendor.";
			owner_lazy = () -> MarketTypeCode.mmObject();
			codeName = "VEND";
		}
	};
	/**
	 * Specified type of market is inter bank market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarketTypeCode
	 * MarketTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INBA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterBank"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specified type of market is inter bank market."</li>
	 * </ul>
	 */
	public static final MMCode InterBank = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterBank";
			definition = "Specified type of market is inter bank market.";
			owner_lazy = () -> MarketTypeCode.mmObject();
			codeName = "INBA";
		}
	};
	/**
	 * Specified type of market is counter market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarketTypeCode
	 * MarketTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COUN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Counter"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specified type of market is counter market."</li>
	 * </ul>
	 */
	public static final MMCode Counter = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Counter";
			definition = "Specified type of market is counter market.";
			owner_lazy = () -> MarketTypeCode.mmObject();
			codeName = "COUN";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("PRIM");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MarketTypeCode";
				definition = "Specifies the type of place where a trade was executed, a price was sourced from, an instrument is listed.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MarketTypeCode.PrimaryMarket, com.tools20022.repository.codeset.MarketTypeCode.SecondaryMarket, com.tools20022.repository.codeset.MarketTypeCode.ThirdMarket,
						com.tools20022.repository.codeset.MarketTypeCode.FourthMarket, com.tools20022.repository.codeset.MarketTypeCode.OverTheCounter, com.tools20022.repository.codeset.MarketTypeCode.Various,
						com.tools20022.repository.codeset.MarketTypeCode.StockExchange, com.tools20022.repository.codeset.MarketTypeCode.Fund, com.tools20022.repository.codeset.MarketTypeCode.LocalMarket,
						com.tools20022.repository.codeset.MarketTypeCode.Theoretical, com.tools20022.repository.codeset.MarketTypeCode.Vendor, com.tools20022.repository.codeset.MarketTypeCode.InterBank,
						com.tools20022.repository.codeset.MarketTypeCode.Counter);
			}
		});
		return mmObject_lazy.get();
	}
}