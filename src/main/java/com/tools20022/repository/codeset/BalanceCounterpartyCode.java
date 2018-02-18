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
import com.tools20022.repository.codeset.BalanceCounterpartyCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of counterparty to be taken into account for calculation
 * of the balance.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceCounterpartyCode#Bilateral
 * BalanceCounterpartyCode.Bilateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceCounterpartyCode#Multilateral
 * BalanceCounterpartyCode.Multilateral}</li>
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
 * <li>"BILA"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BalanceCounterpartyCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of counterparty to be taken into account for calculation of the balance."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class BalanceCounterpartyCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Balance calculated regarding one member in the system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceCounterpartyCode
	 * BalanceCounterpartyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BILA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bilateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance calculated regarding one member in the system."</li>
	 * </ul>
	 */
	public static final BalanceCounterpartyCode Bilateral = new BalanceCounterpartyCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Bilateral";
			definition = "Balance calculated regarding one member in the system.";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceCounterpartyCode.mmObject();
			codeName = "BILA";
		}
	};
	/**
	 * Balance calculated regarding all members in the system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceCounterpartyCode
	 * BalanceCounterpartyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MULT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Multilateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance calculated regarding all members in the system."</li>
	 * </ul>
	 */
	public static final BalanceCounterpartyCode Multilateral = new BalanceCounterpartyCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Multilateral";
			definition = "Balance calculated regarding all members in the system.";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceCounterpartyCode.mmObject();
			codeName = "MULT";
		}
	};
	final static private LinkedHashMap<String, BalanceCounterpartyCode> codesByName = new LinkedHashMap<>();

	protected BalanceCounterpartyCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("BILA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BalanceCounterpartyCode";
				definition = "Specifies the type of counterparty to be taken into account for calculation of the balance.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BalanceCounterpartyCode.Bilateral, com.tools20022.repository.codeset.BalanceCounterpartyCode.Multilateral);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Bilateral.getCodeName().get(), Bilateral);
		codesByName.put(Multilateral.getCodeName().get(), Multilateral);
	}

	public static BalanceCounterpartyCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static BalanceCounterpartyCode[] values() {
		BalanceCounterpartyCode[] values = new BalanceCounterpartyCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, BalanceCounterpartyCode> {
		@Override
		public BalanceCounterpartyCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(BalanceCounterpartyCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}