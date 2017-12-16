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
import com.tools20022.repository.codeset.PaymentCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates whether the cash payment occurs or will occur in advance of receipt
 * of proceeds from the issuer and based on a contractual agreement established
 * with the account servicer or upon receipt of proceeds from the issuer.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.PaymentCode#ActualPayment
 * PaymentCode.mmActualPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCode#ContractualPayment
 * PaymentCode.mmContractualPayment}</li>
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
 * <li>"ACTU"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates whether the cash payment occurs or will occur in advance of receipt of proceeds from the issuer and based on a contractual agreement established with the account servicer or upon receipt of proceeds from the issuer."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PaymentCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * The cash payment occurs or will occur upon receipt of proceeds from the
	 * issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCode PaymentCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACTU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActualPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The cash payment occurs or will occur upon receipt of proceeds from the issuer."
	 * </li>
	 * </ul>
	 */
	public static final PaymentCode ActualPayment = new PaymentCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ActualPayment";
			definition = "The cash payment occurs or will occur upon receipt of proceeds from the issuer.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentCode.mmObject();
			codeName = "ACTU";
		}
	};
	/**
	 * The cash payment occurs or will occur in advance of receipt of proceeds
	 * from the issuer and based on a contractual agreement established with the
	 * account servicer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCode PaymentCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CONT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContractualPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The cash payment occurs or will occur in advance of receipt of proceeds from the issuer and based on a contractual agreement established with the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final PaymentCode ContractualPayment = new PaymentCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ContractualPayment";
			definition = "The cash payment occurs or will occur in advance of receipt of proceeds from the issuer and based on a contractual agreement established with the account servicer.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentCode.mmObject();
			codeName = "CONT";
		}
	};
	final static private LinkedHashMap<String, PaymentCode> codesByName = new LinkedHashMap<>();

	protected PaymentCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("ACTU");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentCode";
				definition = "Indicates whether the cash payment occurs or will occur in advance of receipt of proceeds from the issuer and based on a contractual agreement established with the account servicer or upon receipt of proceeds from the issuer.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PaymentCode.ActualPayment, com.tools20022.repository.codeset.PaymentCode.ContractualPayment);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ActualPayment.getCodeName().get(), ActualPayment);
		codesByName.put(ContractualPayment.getCodeName().get(), ContractualPayment);
	}

	public static PaymentCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PaymentCode[] values() {
		PaymentCode[] values = new PaymentCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PaymentCode> {
		@Override
		public PaymentCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PaymentCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}