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
import com.tools20022.repository.codeset.LendingTransactionMethodCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Lending method applied to the securities financing contract.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LendingTransactionMethodCode#OnDemandTrade
 * LendingTransactionMethodCode.mmOnDemandTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LendingTransactionMethodCode#ExclusiveTrade
 * LendingTransactionMethodCode.mmExclusiveTrade}</li>
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
 * <li>"ODTR"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "LendingTransactionMethodCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Lending method applied to the securities financing contract."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class LendingTransactionMethodCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Contract applies to a specific security only.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LendingTransactionMethodCode
	 * LendingTransactionMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ODTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnDemandTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Contract applies to a specific security only."</li>
	 * </ul>
	 */
	public static final LendingTransactionMethodCode OnDemandTrade = new LendingTransactionMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnDemandTrade";
			definition = "Contract applies to a specific security only.";
			owner_lazy = () -> com.tools20022.repository.codeset.LendingTransactionMethodCode.mmObject();
			codeName = "ODTR";
		}
	};
	/**
	 * Contract applies to a number of different securities within the same
	 * pool/fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LendingTransactionMethodCode
	 * LendingTransactionMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExclusiveTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contract applies to a number of different securities within the same pool/fund."
	 * </li>
	 * </ul>
	 */
	public static final LendingTransactionMethodCode ExclusiveTrade = new LendingTransactionMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExclusiveTrade";
			definition = "Contract applies to a number of different securities within the same pool/fund.";
			owner_lazy = () -> com.tools20022.repository.codeset.LendingTransactionMethodCode.mmObject();
			codeName = "EXTR";
		}
	};
	final static private LinkedHashMap<String, LendingTransactionMethodCode> codesByName = new LinkedHashMap<>();

	protected LendingTransactionMethodCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("ODTR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "LendingTransactionMethodCode";
				definition = "Lending method applied to the securities financing contract.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.LendingTransactionMethodCode.OnDemandTrade, com.tools20022.repository.codeset.LendingTransactionMethodCode.ExclusiveTrade);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(OnDemandTrade.getCodeName().get(), OnDemandTrade);
		codesByName.put(ExclusiveTrade.getCodeName().get(), ExclusiveTrade);
	}

	public static LendingTransactionMethodCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static LendingTransactionMethodCode[] values() {
		LendingTransactionMethodCode[] values = new LendingTransactionMethodCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, LendingTransactionMethodCode> {
		@Override
		public LendingTransactionMethodCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(LendingTransactionMethodCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}