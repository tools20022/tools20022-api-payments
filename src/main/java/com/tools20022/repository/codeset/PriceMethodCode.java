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
import com.tools20022.repository.codeset.PriceMethodCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of pricing calculation method.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceMethodCode#ForwardPrice
 * PriceMethodCode.mmForwardPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceMethodCode#HistoricalPrice
 * PriceMethodCode.mmHistoricalPrice}</li>
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
 * <li>"FORW"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PriceMethodCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of pricing calculation method."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PriceMethodCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Price will be calculated after the close of the dealing period. An
	 * investor, therefore, does not know the exact buy or sell price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceMethodCode
	 * PriceMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FORW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForwardPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price will be calculated after the close of the dealing period. An investor, therefore, does not know the exact buy or sell price."
	 * </li>
	 * </ul>
	 */
	public static final PriceMethodCode ForwardPrice = new PriceMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ForwardPrice";
			definition = "Price will be calculated after the close of the dealing period. An investor, therefore, does not know the exact buy or sell price.";
			owner_lazy = () -> com.tools20022.repository.codeset.PriceMethodCode.mmObject();
			codeName = "FORW";
		}
	};
	/**
	 * Price is calculated at an earlier valuation point preceding the dealing
	 * period. An investor, therefore, knows the exact buy or sell price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceMethodCode
	 * PriceMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HIST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HistoricalPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price is calculated at an earlier valuation point preceding the dealing period. An investor, therefore, knows the exact buy or sell price."
	 * </li>
	 * </ul>
	 */
	public static final PriceMethodCode HistoricalPrice = new PriceMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "HistoricalPrice";
			definition = "Price is calculated at an earlier valuation point preceding the dealing period. An investor, therefore, knows the exact buy or sell price.";
			owner_lazy = () -> com.tools20022.repository.codeset.PriceMethodCode.mmObject();
			codeName = "HIST";
		}
	};
	final static private LinkedHashMap<String, PriceMethodCode> codesByName = new LinkedHashMap<>();

	protected PriceMethodCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("FORW");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PriceMethodCode";
				definition = "Specifies the type of pricing calculation method.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PriceMethodCode.ForwardPrice, com.tools20022.repository.codeset.PriceMethodCode.HistoricalPrice);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ForwardPrice.getCodeName().get(), ForwardPrice);
		codesByName.put(HistoricalPrice.getCodeName().get(), HistoricalPrice);
	}

	public static PriceMethodCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PriceMethodCode[] values() {
		PriceMethodCode[] values = new PriceMethodCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PriceMethodCode> {
		@Override
		public PriceMethodCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PriceMethodCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}