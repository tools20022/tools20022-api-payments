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
import com.tools20022.repository.codeset.InterestRejectionReasonCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates whether the interest request is rejected due a value date or an
 * interest amount difference.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InterestRejectionReasonCode#ValueDate
 * InterestRejectionReasonCode.mmValueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InterestRejectionReasonCode#DisputeAmount
 * InterestRejectionReasonCode.mmDisputeAmount}</li>
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
 * <li>"VADA"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InterestRejectionReasonCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates whether the interest request is rejected due a value date or an interest amount difference."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class InterestRejectionReasonCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates whether the interest request is rejected due a value date
	 * difference.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InterestRejectionReasonCode
	 * InterestRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VADA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the interest request is rejected due a value date difference."
	 * </li>
	 * </ul>
	 */
	public static final InterestRejectionReasonCode ValueDate = new InterestRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueDate";
			definition = "Indicates whether the interest request is rejected due a value date difference.";
			owner_lazy = () -> com.tools20022.repository.codeset.InterestRejectionReasonCode.mmObject();
			codeName = "VADA";
		}
	};
	/**
	 * Indicates whether the interest request is rejected due an interest amount
	 * difference.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InterestRejectionReasonCode
	 * InterestRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DIAM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisputeAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the interest request is rejected due an interest amount difference."
	 * </li>
	 * </ul>
	 */
	public static final InterestRejectionReasonCode DisputeAmount = new InterestRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisputeAmount";
			definition = "Indicates whether the interest request is rejected due an interest amount difference.";
			owner_lazy = () -> com.tools20022.repository.codeset.InterestRejectionReasonCode.mmObject();
			codeName = "DIAM";
		}
	};
	final static private LinkedHashMap<String, InterestRejectionReasonCode> codesByName = new LinkedHashMap<>();

	protected InterestRejectionReasonCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("VADA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InterestRejectionReasonCode";
				definition = "Indicates whether the interest request is rejected due a value date or an interest amount difference.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InterestRejectionReasonCode.ValueDate, com.tools20022.repository.codeset.InterestRejectionReasonCode.DisputeAmount);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ValueDate.getCodeName().get(), ValueDate);
		codesByName.put(DisputeAmount.getCodeName().get(), DisputeAmount);
	}

	public static InterestRejectionReasonCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static InterestRejectionReasonCode[] values() {
		InterestRejectionReasonCode[] values = new InterestRejectionReasonCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, InterestRejectionReasonCode> {
		@Override
		public InterestRejectionReasonCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(InterestRejectionReasonCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}