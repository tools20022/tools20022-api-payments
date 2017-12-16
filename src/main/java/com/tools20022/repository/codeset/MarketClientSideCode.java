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
import com.tools20022.repository.codeset.MarketClientSideCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies if an instruction is for a market or client side transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarketClientSideCode#MarketSide
 * MarketClientSideCode.mmMarketSide}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarketClientSideCode#ClientSide
 * MarketClientSideCode.mmClientSide}</li>
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
 * <li>"MAKT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MarketClientSideCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies if an instruction is for a market or client side transaction."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class MarketClientSideCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Instruction is for a market side transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarketClientSideCode
	 * MarketClientSideCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MAKT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketSide"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction is for a market side transaction."</li>
	 * </ul>
	 */
	public static final MarketClientSideCode MarketSide = new MarketClientSideCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MarketSide";
			definition = "Instruction is for a market side transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.MarketClientSideCode.mmObject();
			codeName = "MAKT";
		}
	};
	/**
	 * Instruction is for a client side transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarketClientSideCode
	 * MarketClientSideCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLNT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClientSide"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction is for a client side transaction."</li>
	 * </ul>
	 */
	public static final MarketClientSideCode ClientSide = new MarketClientSideCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClientSide";
			definition = "Instruction is for a client side transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.MarketClientSideCode.mmObject();
			codeName = "CLNT";
		}
	};
	final static private LinkedHashMap<String, MarketClientSideCode> codesByName = new LinkedHashMap<>();

	protected MarketClientSideCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("MAKT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MarketClientSideCode";
				definition = "Specifies if an instruction is for a market or client side transaction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MarketClientSideCode.MarketSide, com.tools20022.repository.codeset.MarketClientSideCode.ClientSide);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(MarketSide.getCodeName().get(), MarketSide);
		codesByName.put(ClientSide.getCodeName().get(), ClientSide);
	}

	public static MarketClientSideCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static MarketClientSideCode[] values() {
		MarketClientSideCode[] values = new MarketClientSideCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, MarketClientSideCode> {
		@Override
		public MarketClientSideCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(MarketClientSideCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}