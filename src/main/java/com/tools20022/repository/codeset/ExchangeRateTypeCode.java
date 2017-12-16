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
import com.tools20022.repository.codeset.ExchangeRateTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Code used to define the type of the currency exchange.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ExchangeRateTypeCode#Spot
 * ExchangeRateTypeCode.mmSpot}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ExchangeRateTypeCode#Sale
 * ExchangeRateTypeCode.mmSale}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExchangeRateTypeCode#Agreed
 * ExchangeRateTypeCode.mmAgreed}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ExchangeRateType1Code
 * ExchangeRateType1Code}</li>
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
 * <li>"SPOT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ExchangeRateTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Code used to define the type of the currency exchange."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ExchangeRateTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Exchange rate applied is the spot rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExchangeRateTypeCode
	 * ExchangeRateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPOT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Spot"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Exchange rate applied is the spot rate."</li>
	 * </ul>
	 */
	public static final ExchangeRateTypeCode Spot = new ExchangeRateTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Spot";
			definition = "Exchange rate applied is the spot rate.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExchangeRateTypeCode.mmObject();
			codeName = "SPOT";
		}
	};
	/**
	 * Exchange rate applied is the market rate at the time of the sale.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExchangeRateTypeCode
	 * ExchangeRateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SALE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Sale"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Exchange rate applied is the market rate at the time of the sale."</li>
	 * </ul>
	 */
	public static final ExchangeRateTypeCode Sale = new ExchangeRateTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Sale";
			definition = "Exchange rate applied is the market rate at the time of the sale.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExchangeRateTypeCode.mmObject();
			codeName = "SALE";
		}
	};
	/**
	 * Exchange rate applied is the rate agreed between the parties.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExchangeRateTypeCode
	 * ExchangeRateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AGRD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Agreed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Exchange rate applied is the rate agreed between the parties."</li>
	 * </ul>
	 */
	public static final ExchangeRateTypeCode Agreed = new ExchangeRateTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Agreed";
			definition = "Exchange rate applied is the rate agreed between the parties.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExchangeRateTypeCode.mmObject();
			codeName = "AGRD";
		}
	};
	final static private LinkedHashMap<String, ExchangeRateTypeCode> codesByName = new LinkedHashMap<>();

	protected ExchangeRateTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("SPOT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ExchangeRateTypeCode";
				definition = "Code used to define the type of the currency exchange.";
				derivation_lazy = () -> Arrays.asList(ExchangeRateType1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ExchangeRateTypeCode.Spot, com.tools20022.repository.codeset.ExchangeRateTypeCode.Sale, com.tools20022.repository.codeset.ExchangeRateTypeCode.Agreed);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Spot.getCodeName().get(), Spot);
		codesByName.put(Sale.getCodeName().get(), Sale);
		codesByName.put(Agreed.getCodeName().get(), Agreed);
	}

	public static ExchangeRateTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ExchangeRateTypeCode[] values() {
		ExchangeRateTypeCode[] values = new ExchangeRateTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ExchangeRateTypeCode> {
		@Override
		public ExchangeRateTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ExchangeRateTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}