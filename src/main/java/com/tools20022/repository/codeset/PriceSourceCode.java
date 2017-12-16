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
import com.tools20022.repository.codeset.PriceSourceCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the source of a price quotation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.PriceSourceCode#Fund
 * PriceSourceCode.mmFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceSourceCode#Theoretical
 * PriceSourceCode.mmTheoretical}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PriceSourceCode#Vendor
 * PriceSourceCode.mmVendor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceSourceCode#StockExchange
 * PriceSourceCode.mmStockExchange}</li>
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
 * <li>"FUND"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PriceSourceCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the source of a price quotation."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PriceSourceCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Source of price quotation is a fund, eg, transfer agent, fund itself.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceSourceCode
	 * PriceSourceCode}</li>
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
	 * definition} =
	 * "Source of price quotation is a fund, eg, transfer agent, fund itself."</li>
	 * </ul>
	 */
	public static final PriceSourceCode Fund = new PriceSourceCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Fund";
			definition = "Source of price quotation is a fund, eg, transfer agent, fund itself.";
			owner_lazy = () -> com.tools20022.repository.codeset.PriceSourceCode.mmObject();
			codeName = "FUND";
		}
	};
	/**
	 * Source of price quotation is a theoretical value based on the market
	 * yield.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceSourceCode
	 * PriceSourceCode}</li>
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
	 * definition} =
	 * "Source of price quotation is a theoretical value based on the market yield."
	 * </li>
	 * </ul>
	 */
	public static final PriceSourceCode Theoretical = new PriceSourceCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Theoretical";
			definition = "Source of price quotation is a theoretical value based on the market yield.";
			owner_lazy = () -> com.tools20022.repository.codeset.PriceSourceCode.mmObject();
			codeName = "THEO";
		}
	};
	/**
	 * Source of price quotation is an external vendor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceSourceCode
	 * PriceSourceCode}</li>
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
	 * definition} = "Source of price quotation is an external vendor."</li>
	 * </ul>
	 */
	public static final PriceSourceCode Vendor = new PriceSourceCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Vendor";
			definition = "Source of price quotation is an external vendor.";
			owner_lazy = () -> com.tools20022.repository.codeset.PriceSourceCode.mmObject();
			codeName = "VEND";
		}
	};
	/**
	 * Source of price quotation is a stock exchange.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceSourceCode
	 * PriceSourceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXCH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Source of price quotation is a stock exchange."</li>
	 * </ul>
	 */
	public static final PriceSourceCode StockExchange = new PriceSourceCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockExchange";
			definition = "Source of price quotation is a stock exchange.";
			owner_lazy = () -> com.tools20022.repository.codeset.PriceSourceCode.mmObject();
			codeName = "EXCH";
		}
	};
	final static private LinkedHashMap<String, PriceSourceCode> codesByName = new LinkedHashMap<>();

	protected PriceSourceCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("FUND");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PriceSourceCode";
				definition = "Specifies the source of a price quotation.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PriceSourceCode.Fund, com.tools20022.repository.codeset.PriceSourceCode.Theoretical, com.tools20022.repository.codeset.PriceSourceCode.Vendor,
						com.tools20022.repository.codeset.PriceSourceCode.StockExchange);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Fund.getCodeName().get(), Fund);
		codesByName.put(Theoretical.getCodeName().get(), Theoretical);
		codesByName.put(Vendor.getCodeName().get(), Vendor);
		codesByName.put(StockExchange.getCodeName().get(), StockExchange);
	}

	public static PriceSourceCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PriceSourceCode[] values() {
		PriceSourceCode[] values = new PriceSourceCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PriceSourceCode> {
		@Override
		public PriceSourceCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PriceSourceCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}