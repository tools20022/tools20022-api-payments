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
import com.tools20022.repository.codeset.MarketTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

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
 * MarketTypeCode.mmPrimaryMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarketTypeCode#SecondaryMarket
 * MarketTypeCode.mmSecondaryMarket}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MarketTypeCode#ThirdMarket
 * MarketTypeCode.mmThirdMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarketTypeCode#FourthMarket
 * MarketTypeCode.mmFourthMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarketTypeCode#OverTheCounter
 * MarketTypeCode.mmOverTheCounter}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MarketTypeCode#Various
 * MarketTypeCode.mmVarious}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarketTypeCode#StockExchange
 * MarketTypeCode.mmStockExchange}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MarketTypeCode#Fund
 * MarketTypeCode.mmFund}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MarketTypeCode#LocalMarket
 * MarketTypeCode.mmLocalMarket}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MarketTypeCode#Theoretical
 * MarketTypeCode.mmTheoretical}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MarketTypeCode#Vendor
 * MarketTypeCode.mmVendor}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MarketTypeCode#InterBank
 * MarketTypeCode.mmInterBank}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MarketTypeCode#Counter
 * MarketTypeCode.mmCounter}</li>
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
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class MarketTypeCode extends MMCode {

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
	public static final MarketTypeCode PrimaryMarket = new MarketTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PrimaryMarket";
			definition = "The place is a primary market.";
			owner_lazy = () -> com.tools20022.repository.codeset.MarketTypeCode.mmObject();
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
	public static final MarketTypeCode SecondaryMarket = new MarketTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecondaryMarket";
			definition = "The place is a secondary market.";
			owner_lazy = () -> com.tools20022.repository.codeset.MarketTypeCode.mmObject();
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
	public static final MarketTypeCode ThirdMarket = new MarketTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ThirdMarket";
			definition = "The place is a third market.";
			owner_lazy = () -> com.tools20022.repository.codeset.MarketTypeCode.mmObject();
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
	public static final MarketTypeCode FourthMarket = new MarketTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FourthMarket";
			definition = "The place is a fourth market.";
			owner_lazy = () -> com.tools20022.repository.codeset.MarketTypeCode.mmObject();
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
	public static final MarketTypeCode OverTheCounter = new MarketTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OverTheCounter";
			definition = "The place is over the counter.";
			owner_lazy = () -> com.tools20022.repository.codeset.MarketTypeCode.mmObject();
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
	public static final MarketTypeCode Various = new MarketTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Various";
			definition = "Various places.";
			owner_lazy = () -> com.tools20022.repository.codeset.MarketTypeCode.mmObject();
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
	public static final MarketTypeCode StockExchange = new MarketTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StockExchange";
			definition = "The place is a stock exchange.";
			owner_lazy = () -> com.tools20022.repository.codeset.MarketTypeCode.mmObject();
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
	public static final MarketTypeCode Fund = new MarketTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Fund";
			definition = "The place is a fund (transfer agent, fund itself, etc.).";
			owner_lazy = () -> com.tools20022.repository.codeset.MarketTypeCode.mmObject();
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
	public static final MarketTypeCode LocalMarket = new MarketTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LocalMarket";
			definition = "The place is a local market.";
			owner_lazy = () -> com.tools20022.repository.codeset.MarketTypeCode.mmObject();
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
	public static final MarketTypeCode Theoretical = new MarketTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Theoretical";
			definition = "The place is theoretical.";
			owner_lazy = () -> com.tools20022.repository.codeset.MarketTypeCode.mmObject();
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
	public static final MarketTypeCode Vendor = new MarketTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Vendor";
			definition = "The place is a vendor.";
			owner_lazy = () -> com.tools20022.repository.codeset.MarketTypeCode.mmObject();
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
	public static final MarketTypeCode InterBank = new MarketTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterBank";
			definition = "Specified type of market is inter bank market.";
			owner_lazy = () -> com.tools20022.repository.codeset.MarketTypeCode.mmObject();
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
	public static final MarketTypeCode Counter = new MarketTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Counter";
			definition = "Specified type of market is counter market.";
			owner_lazy = () -> com.tools20022.repository.codeset.MarketTypeCode.mmObject();
			codeName = "COUN";
		}
	};
	final static private LinkedHashMap<String, MarketTypeCode> codesByName = new LinkedHashMap<>();

	protected MarketTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("PRIM");
				registrationStatus = MMRegistrationStatus.REGISTERED;
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

	static {
		codesByName.put(PrimaryMarket.getCodeName().get(), PrimaryMarket);
		codesByName.put(SecondaryMarket.getCodeName().get(), SecondaryMarket);
		codesByName.put(ThirdMarket.getCodeName().get(), ThirdMarket);
		codesByName.put(FourthMarket.getCodeName().get(), FourthMarket);
		codesByName.put(OverTheCounter.getCodeName().get(), OverTheCounter);
		codesByName.put(Various.getCodeName().get(), Various);
		codesByName.put(StockExchange.getCodeName().get(), StockExchange);
		codesByName.put(Fund.getCodeName().get(), Fund);
		codesByName.put(LocalMarket.getCodeName().get(), LocalMarket);
		codesByName.put(Theoretical.getCodeName().get(), Theoretical);
		codesByName.put(Vendor.getCodeName().get(), Vendor);
		codesByName.put(InterBank.getCodeName().get(), InterBank);
		codesByName.put(Counter.getCodeName().get(), Counter);
	}

	public static MarketTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static MarketTypeCode[] values() {
		MarketTypeCode[] values = new MarketTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, MarketTypeCode> {
		@Override
		public MarketTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(MarketTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}