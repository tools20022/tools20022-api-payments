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
import com.tools20022.repository.codeset.QuoteTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Identifies the type of quote. Can be either an indicative, a tradeable or a
 * restricted tradeable quote.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.QuoteTypeCode#Indicative
 * QuoteTypeCode.mmIndicative}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.QuoteTypeCode#Tradeable
 * QuoteTypeCode.mmTradeable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QuoteTypeCode#RestrictedTradeable
 * QuoteTypeCode.mmRestrictedTradeable}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.QuoteTypeCode#Counter
 * QuoteTypeCode.mmCounter}</li>
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
 * <li>"INDI"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "QuoteTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies the type of quote. Can be either an indicative, a tradeable or a restricted tradeable quote."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class QuoteTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates the type of quote is an indicative quote.
	 * 
	 * An indicative quote is used to inform a counterparty of a market. An
	 * indicative quote does not result directly in a trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QuoteTypeCode
	 * QuoteTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INDI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Indicative"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the type of quote is an indicative quote. \n\nAn indicative quote is used to inform a counterparty of a market. An indicative quote does not result directly in a trade."
	 * </li>
	 * </ul>
	 */
	public static final QuoteTypeCode Indicative = new QuoteTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Indicative";
			definition = "Indicates the type of quote is an indicative quote. \n\nAn indicative quote is used to inform a counterparty of a market. An indicative quote does not result directly in a trade.";
			owner_lazy = () -> com.tools20022.repository.codeset.QuoteTypeCode.mmObject();
			codeName = "INDI";
		}
	};
	/**
	 * Indicates the type of quote is a tradeable quote. A tradeable quote is
	 * submitted to a market and will result directly in a trade against other
	 * orders and quotes in a market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QuoteTypeCode
	 * QuoteTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRAD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tradeable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the type of quote is a tradeable quote. \nA tradeable quote is submitted to a market and will result directly in a trade against other orders and quotes in a market."
	 * </li>
	 * </ul>
	 */
	public static final QuoteTypeCode Tradeable = new QuoteTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tradeable";
			definition = "Indicates the type of quote is a tradeable quote. \nA tradeable quote is submitted to a market and will result directly in a trade against other orders and quotes in a market.";
			owner_lazy = () -> com.tools20022.repository.codeset.QuoteTypeCode.mmObject();
			codeName = "TRAD";
		}
	};
	/**
	 * Indicates the type of quote is a restricted tradeable quote. A restricted
	 * tradeable quote is submitted to a market and within a certain restriction
	 * (possibly based upon price or quantity) will automatically trade against
	 * orders. Order that do not comply with restrictions are sent to the quote
	 * issuer who can choose to accept or decline the order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QuoteTypeCode
	 * QuoteTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RestrictedTradeable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the type of quote is a restricted tradeable quote. \nA restricted tradeable quote is submitted to a market and within a certain restriction (possibly based upon price or quantity) will automatically trade against orders. Order that do not comply with restrictions are sent to the quote issuer who can choose to accept or decline the order."
	 * </li>
	 * </ul>
	 */
	public static final QuoteTypeCode RestrictedTradeable = new QuoteTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RestrictedTradeable";
			definition = "Indicates the type of quote is a restricted tradeable quote. \nA restricted tradeable quote is submitted to a market and within a certain restriction (possibly based upon price or quantity) will automatically trade against orders. Order that do not comply with restrictions are sent to the quote issuer who can choose to accept or decline the order.";
			owner_lazy = () -> com.tools20022.repository.codeset.QuoteTypeCode.mmObject();
			codeName = "REST";
		}
	};
	/**
	 * Indicates the type of quote is a counter quote.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QuoteTypeCode
	 * QuoteTypeCode}</li>
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
	 * definition} = "Indicates the type of quote is a counter quote."</li>
	 * </ul>
	 */
	public static final QuoteTypeCode Counter = new QuoteTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Counter";
			definition = "Indicates the type of quote is a counter quote.";
			owner_lazy = () -> com.tools20022.repository.codeset.QuoteTypeCode.mmObject();
			codeName = "COUN";
		}
	};
	final static private LinkedHashMap<String, QuoteTypeCode> codesByName = new LinkedHashMap<>();

	protected QuoteTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("INDI");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "QuoteTypeCode";
				definition = "Identifies the type of quote. Can be either an indicative, a tradeable or a restricted tradeable quote.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.QuoteTypeCode.Indicative, com.tools20022.repository.codeset.QuoteTypeCode.Tradeable, com.tools20022.repository.codeset.QuoteTypeCode.RestrictedTradeable,
						com.tools20022.repository.codeset.QuoteTypeCode.Counter);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Indicative.getCodeName().get(), Indicative);
		codesByName.put(Tradeable.getCodeName().get(), Tradeable);
		codesByName.put(RestrictedTradeable.getCodeName().get(), RestrictedTradeable);
		codesByName.put(Counter.getCodeName().get(), Counter);
	}

	public static QuoteTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static QuoteTypeCode[] values() {
		QuoteTypeCode[] values = new QuoteTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, QuoteTypeCode> {
		@Override
		public QuoteTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(QuoteTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}