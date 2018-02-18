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
import com.tools20022.repository.codeset.CallInCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of pay-in call report.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CallInCode#CallForAccountValue
 * CallInCode.CallForAccountValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CallInCode#CallForSettlement
 * CallInCode.CallForSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CallInCode#CallForCurrencyClose
 * CallInCode.CallForCurrencyClose}</li>
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
 * <li>"CFAV"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CallInCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of pay-in call report."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CallInCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Pay-in call is for account value.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CallInCode CallInCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CFAV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CallForAccountValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Pay-in call is for account value."</li>
	 * </ul>
	 */
	public static final CallInCode CallForAccountValue = new CallInCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CallForAccountValue";
			definition = "Pay-in call is for account value.";
			owner_lazy = () -> com.tools20022.repository.codeset.CallInCode.mmObject();
			codeName = "CFAV";
		}
	};
	/**
	 * Pay-in call is for settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CallInCode CallInCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CFST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CallForSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Pay-in call is for settlement."</li>
	 * </ul>
	 */
	public static final CallInCode CallForSettlement = new CallInCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CallForSettlement";
			definition = "Pay-in call is for settlement.";
			owner_lazy = () -> com.tools20022.repository.codeset.CallInCode.mmObject();
			codeName = "CFST";
		}
	};
	/**
	 * Pay-in call is for currency close.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CallInCode CallInCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CFCC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CallForCurrencyClose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Pay-in call is for currency close."</li>
	 * </ul>
	 */
	public static final CallInCode CallForCurrencyClose = new CallInCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CallForCurrencyClose";
			definition = "Pay-in call is for currency close.";
			owner_lazy = () -> com.tools20022.repository.codeset.CallInCode.mmObject();
			codeName = "CFCC";
		}
	};
	final static private LinkedHashMap<String, CallInCode> codesByName = new LinkedHashMap<>();

	protected CallInCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CFAV");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CallInCode";
				definition = "Specifies the type of pay-in call report.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CallInCode.CallForAccountValue, com.tools20022.repository.codeset.CallInCode.CallForSettlement,
						com.tools20022.repository.codeset.CallInCode.CallForCurrencyClose);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CallForAccountValue.getCodeName().get(), CallForAccountValue);
		codesByName.put(CallForSettlement.getCodeName().get(), CallForSettlement);
		codesByName.put(CallForCurrencyClose.getCodeName().get(), CallForCurrencyClose);
	}

	public static CallInCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CallInCode[] values() {
		CallInCode[] values = new CallInCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CallInCode> {
		@Override
		public CallInCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CallInCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}