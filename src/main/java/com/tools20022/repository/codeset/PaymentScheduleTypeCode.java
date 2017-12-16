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
import com.tools20022.repository.codeset.PaymentScheduleTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies a payment schedule type.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentScheduleTypeCode#Contract
 * PaymentScheduleTypeCode.mmContract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentScheduleTypeCode#Estimated
 * PaymentScheduleTypeCode.mmEstimated}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.PaymentScheduleType1Code
 * PaymentScheduleType1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentScheduleTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies a payment schedule type."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PaymentScheduleTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Payment schedule is defined as per contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentScheduleTypeCode
	 * PaymentScheduleTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CNTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Contract"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment schedule is defined as per contract."</li>
	 * </ul>
	 */
	public static final PaymentScheduleTypeCode Contract = new PaymentScheduleTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Contract";
			definition = "Payment schedule is defined as per contract.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentScheduleTypeCode.mmObject();
			codeName = "CNTR";
		}
	};
	/**
	 * Payment schedule is estimated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentScheduleTypeCode
	 * PaymentScheduleTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ESTM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Estimated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment schedule is estimated."</li>
	 * </ul>
	 */
	public static final PaymentScheduleTypeCode Estimated = new PaymentScheduleTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Estimated";
			definition = "Payment schedule is estimated.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentScheduleTypeCode.mmObject();
			codeName = "ESTM";
		}
	};
	final static private LinkedHashMap<String, PaymentScheduleTypeCode> codesByName = new LinkedHashMap<>();

	protected PaymentScheduleTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentScheduleTypeCode";
				definition = "Specifies a payment schedule type.";
				derivation_lazy = () -> Arrays.asList(PaymentScheduleType1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PaymentScheduleTypeCode.Contract, com.tools20022.repository.codeset.PaymentScheduleTypeCode.Estimated);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Contract.getCodeName().get(), Contract);
		codesByName.put(Estimated.getCodeName().get(), Estimated);
	}

	public static PaymentScheduleTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PaymentScheduleTypeCode[] values() {
		PaymentScheduleTypeCode[] values = new PaymentScheduleTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PaymentScheduleTypeCode> {
		@Override
		public PaymentScheduleTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PaymentScheduleTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}