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
import com.tools20022.repository.codeset.NegotiatedTradeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies whether the trade is negotiated.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NegotiatedTradeCode#Negotiated
 * NegotiatedTradeCode.mmNegotiated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NegotiatedTradeCode#NotNegotiated
 * NegotiatedTradeCode.mmNotNegotiated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NegotiatedTradeCode#Unknown
 * NegotiatedTradeCode.mmUnknown}</li>
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
 * <li>"NEGO"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "NegotiatedTradeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies whether the trade is negotiated."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class NegotiatedTradeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Trade is negotiated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NegotiatedTradeCode
	 * NegotiatedTradeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NEGO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Negotiated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade is negotiated."</li>
	 * </ul>
	 */
	public static final NegotiatedTradeCode Negotiated = new NegotiatedTradeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Negotiated";
			definition = "Trade is negotiated.";
			owner_lazy = () -> com.tools20022.repository.codeset.NegotiatedTradeCode.mmObject();
			codeName = "NEGO";
		}
	};
	/**
	 * Trade is not negotiated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NegotiatedTradeCode
	 * NegotiatedTradeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NNGO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotNegotiated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade is not negotiated."</li>
	 * </ul>
	 */
	public static final NegotiatedTradeCode NotNegotiated = new NegotiatedTradeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotNegotiated";
			definition = "Trade is not negotiated.";
			owner_lazy = () -> com.tools20022.repository.codeset.NegotiatedTradeCode.mmObject();
			codeName = "NNGO";
		}
	};
	/**
	 * Whether the trade is negotiated or not is unknown.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NegotiatedTradeCode
	 * NegotiatedTradeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UNKW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unknown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Whether the trade is negotiated or not is unknown."</li>
	 * </ul>
	 */
	public static final NegotiatedTradeCode Unknown = new NegotiatedTradeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Unknown";
			definition = "Whether the trade is negotiated or not is unknown.";
			owner_lazy = () -> com.tools20022.repository.codeset.NegotiatedTradeCode.mmObject();
			codeName = "UNKW";
		}
	};
	final static private LinkedHashMap<String, NegotiatedTradeCode> codesByName = new LinkedHashMap<>();

	protected NegotiatedTradeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("NEGO");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NegotiatedTradeCode";
				definition = "Specifies whether the trade is negotiated.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.NegotiatedTradeCode.Negotiated, com.tools20022.repository.codeset.NegotiatedTradeCode.NotNegotiated,
						com.tools20022.repository.codeset.NegotiatedTradeCode.Unknown);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Negotiated.getCodeName().get(), Negotiated);
		codesByName.put(NotNegotiated.getCodeName().get(), NotNegotiated);
		codesByName.put(Unknown.getCodeName().get(), Unknown);
	}

	public static NegotiatedTradeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static NegotiatedTradeCode[] values() {
		NegotiatedTradeCode[] values = new NegotiatedTradeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, NegotiatedTradeCode> {
		@Override
		public NegotiatedTradeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(NegotiatedTradeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}