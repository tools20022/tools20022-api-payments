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
import com.tools20022.repository.codeset.StandingOrderTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of standing order.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StandingOrderTypeCode#UserDefinedStandingOrder
 * StandingOrderTypeCode.mmUserDefinedStandingOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StandingOrderTypeCode#PredefinedStandingOrder
 * StandingOrderTypeCode.mmPredefinedStandingOrder}</li>
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
 * <li>"USTO"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "StandingOrderTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of standing order."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class StandingOrderTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Liquidity transfer standing order type, that has been customised or
	 * defined to the specific need of the user.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StandingOrderTypeCode
	 * StandingOrderTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "USTO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UserDefinedStandingOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Liquidity transfer standing order type, that has been customised or defined to the specific need of the user."
	 * </li>
	 * </ul>
	 */
	public static final StandingOrderTypeCode UserDefinedStandingOrder = new StandingOrderTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UserDefinedStandingOrder";
			definition = "Liquidity transfer standing order type, that has been customised or defined to the specific need of the user.";
			owner_lazy = () -> com.tools20022.repository.codeset.StandingOrderTypeCode.mmObject();
			codeName = "USTO";
		}
	};
	/**
	 * Liquidity transfer standing order type, as predefined in the system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StandingOrderTypeCode
	 * StandingOrderTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PSTO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PredefinedStandingOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Liquidity transfer standing order type, as predefined in the system."</li>
	 * </ul>
	 */
	public static final StandingOrderTypeCode PredefinedStandingOrder = new StandingOrderTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PredefinedStandingOrder";
			definition = "Liquidity transfer standing order type, as predefined in the system.";
			owner_lazy = () -> com.tools20022.repository.codeset.StandingOrderTypeCode.mmObject();
			codeName = "PSTO";
		}
	};
	final static private LinkedHashMap<String, StandingOrderTypeCode> codesByName = new LinkedHashMap<>();

	protected StandingOrderTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("USTO");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StandingOrderTypeCode";
				definition = "Specifies the type of standing order.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.StandingOrderTypeCode.UserDefinedStandingOrder, com.tools20022.repository.codeset.StandingOrderTypeCode.PredefinedStandingOrder);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(UserDefinedStandingOrder.getCodeName().get(), UserDefinedStandingOrder);
		codesByName.put(PredefinedStandingOrder.getCodeName().get(), PredefinedStandingOrder);
	}

	public static StandingOrderTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static StandingOrderTypeCode[] values() {
		StandingOrderTypeCode[] values = new StandingOrderTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, StandingOrderTypeCode> {
		@Override
		public StandingOrderTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(StandingOrderTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}