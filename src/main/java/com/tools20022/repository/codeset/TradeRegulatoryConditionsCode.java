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
import com.tools20022.repository.codeset.TradeRegulatoryConditionsCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * indicates if the Trade Regulatory Conditions is solicited or not.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeRegulatoryConditionsCode#Solicited
 * TradeRegulatoryConditionsCode.Solicited}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeRegulatoryConditionsCode#Unsolicited
 * TradeRegulatoryConditionsCode.Unsolicited}</li>
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
 * <li>"SOLI"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradeRegulatoryConditionsCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "indicates if the Trade Regulatory Conditions is solicited or not."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TradeRegulatoryConditionsCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Trade was solicited by the executing broker. The broker has suggested to
	 * his client to buy/sell financial instruments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeRegulatoryConditionsCode
	 * TradeRegulatoryConditionsCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SOLI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Solicited"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trade was solicited by the executing broker. The broker has suggested to his client to buy/sell financial instruments."
	 * </li>
	 * </ul>
	 */
	public static final TradeRegulatoryConditionsCode Solicited = new TradeRegulatoryConditionsCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Solicited";
			definition = "Trade was solicited by the executing broker. The broker has suggested to his client to buy/sell financial instruments.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeRegulatoryConditionsCode.mmObject();
			codeName = "SOLI";
		}
	};
	/**
	 * Trade was unsolicited. The client acts on its own without advice from the
	 * executing broker.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeRegulatoryConditionsCode
	 * TradeRegulatoryConditionsCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "USOL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unsolicited"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trade was unsolicited. The client acts on its own without advice from the executing broker."
	 * </li>
	 * </ul>
	 */
	public static final TradeRegulatoryConditionsCode Unsolicited = new TradeRegulatoryConditionsCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unsolicited";
			definition = "Trade was unsolicited. The client acts on its own without advice from the executing broker.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeRegulatoryConditionsCode.mmObject();
			codeName = "USOL";
		}
	};
	final static private LinkedHashMap<String, TradeRegulatoryConditionsCode> codesByName = new LinkedHashMap<>();

	protected TradeRegulatoryConditionsCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("SOLI");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradeRegulatoryConditionsCode";
				definition = "indicates if the Trade Regulatory Conditions is solicited or not.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TradeRegulatoryConditionsCode.Solicited, com.tools20022.repository.codeset.TradeRegulatoryConditionsCode.Unsolicited);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Solicited.getCodeName().get(), Solicited);
		codesByName.put(Unsolicited.getCodeName().get(), Unsolicited);
	}

	public static TradeRegulatoryConditionsCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TradeRegulatoryConditionsCode[] values() {
		TradeRegulatoryConditionsCode[] values = new TradeRegulatoryConditionsCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TradeRegulatoryConditionsCode> {
		@Override
		public TradeRegulatoryConditionsCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TradeRegulatoryConditionsCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}