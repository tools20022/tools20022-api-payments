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
import com.tools20022.repository.codeset.CounterpartyResponseStatusReasonCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of counterparty's action the response is related to.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CounterpartyResponseStatusReasonCode#CounterpartyTransaction
 * CounterpartyResponseStatusReasonCode.mmCounterpartyTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CounterpartyResponseStatusReasonCode#CounterpartyCancellation
 * CounterpartyResponseStatusReasonCode.mmCounterpartyCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CounterpartyResponseStatusReasonCode#CounterpartyModification
 * CounterpartyResponseStatusReasonCode.mmCounterpartyModification}</li>
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
 * <li>"CPTR"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CounterpartyResponseStatusReasonCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of counterparty's action the response is related to."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CounterpartyResponseStatusReasonCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies that the response is related to an allegement from the
	 * counterparty.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CounterpartyResponseStatusReasonCode
	 * CounterpartyResponseStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CPTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies  that the response is related to an allegement from the counterparty."
	 * </li>
	 * </ul>
	 */
	public static final CounterpartyResponseStatusReasonCode CounterpartyTransaction = new CounterpartyResponseStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyTransaction";
			definition = "Specifies  that the response is related to an allegement from the counterparty.";
			owner_lazy = () -> com.tools20022.repository.codeset.CounterpartyResponseStatusReasonCode.mmObject();
			codeName = "CPTR";
		}
	};
	/**
	 * Specifies that the response is related to the cancellation request of the
	 * counterparty.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CounterpartyResponseStatusReasonCode
	 * CounterpartyResponseStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CPCX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyCancellation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies  that the response is related to the cancellation request of the counterparty."
	 * </li>
	 * </ul>
	 */
	public static final CounterpartyResponseStatusReasonCode CounterpartyCancellation = new CounterpartyResponseStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyCancellation";
			definition = "Specifies  that the response is related to the cancellation request of the counterparty.";
			owner_lazy = () -> com.tools20022.repository.codeset.CounterpartyResponseStatusReasonCode.mmObject();
			codeName = "CPCX";
		}
	};
	/**
	 * Specifies that the response is related to the modification request of the
	 * counterparty.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CounterpartyResponseStatusReasonCode
	 * CounterpartyResponseStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CPMD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyModification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies  that the response is related to the modification request of the counterparty."
	 * </li>
	 * </ul>
	 */
	public static final CounterpartyResponseStatusReasonCode CounterpartyModification = new CounterpartyResponseStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyModification";
			definition = "Specifies  that the response is related to the modification request of the counterparty.";
			owner_lazy = () -> com.tools20022.repository.codeset.CounterpartyResponseStatusReasonCode.mmObject();
			codeName = "CPMD";
		}
	};
	final static private LinkedHashMap<String, CounterpartyResponseStatusReasonCode> codesByName = new LinkedHashMap<>();

	protected CounterpartyResponseStatusReasonCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("CPTR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CounterpartyResponseStatusReasonCode";
				definition = "Specifies the type of counterparty's action the response is related to.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CounterpartyResponseStatusReasonCode.CounterpartyTransaction,
						com.tools20022.repository.codeset.CounterpartyResponseStatusReasonCode.CounterpartyCancellation, com.tools20022.repository.codeset.CounterpartyResponseStatusReasonCode.CounterpartyModification);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CounterpartyTransaction.getCodeName().get(), CounterpartyTransaction);
		codesByName.put(CounterpartyCancellation.getCodeName().get(), CounterpartyCancellation);
		codesByName.put(CounterpartyModification.getCodeName().get(), CounterpartyModification);
	}

	public static CounterpartyResponseStatusReasonCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CounterpartyResponseStatusReasonCode[] values() {
		CounterpartyResponseStatusReasonCode[] values = new CounterpartyResponseStatusReasonCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CounterpartyResponseStatusReasonCode> {
		@Override
		public CounterpartyResponseStatusReasonCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CounterpartyResponseStatusReasonCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}