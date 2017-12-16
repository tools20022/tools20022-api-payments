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
import com.tools20022.repository.codeset.TradingMethodCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the method used for the negotiation and execution of a trade.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingMethodCode#Electronic
 * TradingMethodCode.mmElectronic}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradingMethodCode#Phone
 * TradingMethodCode.mmPhone}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradingMethodCode#Broker
 * TradingMethodCode.mmBroker}</li>
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
 * <li>"ELEC"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradingMethodCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the method used for the negotiation and execution of a trade."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TradingMethodCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Trade executed through an electronic trading system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingMethodCode
	 * TradingMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ELEC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Electronic"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade executed through an electronic trading system."</li>
	 * </ul>
	 */
	public static final TradingMethodCode Electronic = new TradingMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Electronic";
			definition = "Trade executed through an electronic trading system.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingMethodCode.mmObject();
			codeName = "ELEC";
		}
	};
	/**
	 * Trade executed over the phone.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingMethodCode
	 * TradingMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PHON"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Phone"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade executed over the phone."</li>
	 * </ul>
	 */
	public static final TradingMethodCode Phone = new TradingMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Phone";
			definition = "Trade executed over the phone.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingMethodCode.mmObject();
			codeName = "PHON";
		}
	};
	/**
	 * Trade executed through a broker.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingMethodCode
	 * TradingMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BROK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Broker"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade executed through a broker."</li>
	 * </ul>
	 */
	public static final TradingMethodCode Broker = new TradingMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Broker";
			definition = "Trade executed through a broker.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingMethodCode.mmObject();
			codeName = "BROK";
		}
	};
	final static private LinkedHashMap<String, TradingMethodCode> codesByName = new LinkedHashMap<>();

	protected TradingMethodCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("ELEC");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradingMethodCode";
				definition = "Specifies the method used for the negotiation and execution of a trade.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TradingMethodCode.Electronic, com.tools20022.repository.codeset.TradingMethodCode.Phone, com.tools20022.repository.codeset.TradingMethodCode.Broker);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Electronic.getCodeName().get(), Electronic);
		codesByName.put(Phone.getCodeName().get(), Phone);
		codesByName.put(Broker.getCodeName().get(), Broker);
	}

	public static TradingMethodCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TradingMethodCode[] values() {
		TradingMethodCode[] values = new TradingMethodCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TradingMethodCode> {
		@Override
		public TradingMethodCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TradingMethodCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}