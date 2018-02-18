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
import com.tools20022.repository.codeset.OffMarketCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates that the trade was executed off-market.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.OffMarketCode#OffMarket
 * OffMarketCode.OffMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OffMarketCode#NotAdmittedOnExchange
 * OffMarketCode.NotAdmittedOnExchange}</li>
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
 * <li>"XOFF"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OffMarketCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Indicates that the trade was executed off-market."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class OffMarketCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Trade was executed off-market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OffMarketCode
	 * OffMarketCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "XOFF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OffMarket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade was executed off-market."</li>
	 * </ul>
	 */
	public static final OffMarketCode OffMarket = new OffMarketCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OffMarket";
			definition = "Trade was executed off-market.";
			owner_lazy = () -> com.tools20022.repository.codeset.OffMarketCode.mmObject();
			codeName = "XOFF";
		}
	};
	/**
	 * Trade was executed off-exchange because the instrument is not admitted to
	 * trade on an exchange.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OffMarketCode
	 * OffMarketCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "XXXX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotAdmittedOnExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trade was executed off-exchange because the instrument is not admitted to trade on an exchange."
	 * </li>
	 * </ul>
	 */
	public static final OffMarketCode NotAdmittedOnExchange = new OffMarketCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotAdmittedOnExchange";
			definition = "Trade was executed off-exchange because the instrument is not admitted to trade on an exchange.";
			owner_lazy = () -> com.tools20022.repository.codeset.OffMarketCode.mmObject();
			codeName = "XXXX";
		}
	};
	final static private LinkedHashMap<String, OffMarketCode> codesByName = new LinkedHashMap<>();

	protected OffMarketCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("XOFF");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OffMarketCode";
				definition = "Indicates that the trade was executed off-market.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OffMarketCode.OffMarket, com.tools20022.repository.codeset.OffMarketCode.NotAdmittedOnExchange);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(OffMarket.getCodeName().get(), OffMarket);
		codesByName.put(NotAdmittedOnExchange.getCodeName().get(), NotAdmittedOnExchange);
	}

	public static OffMarketCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static OffMarketCode[] values() {
		OffMarketCode[] values = new OffMarketCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, OffMarketCode> {
		@Override
		public OffMarketCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(OffMarketCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}