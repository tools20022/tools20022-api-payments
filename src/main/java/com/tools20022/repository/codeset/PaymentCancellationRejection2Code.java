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
import com.tools20022.repository.codeset.PaymentCancellationRejection2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Returned when a request for cancellation cannot be executed.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCancellationRejection2Code#LegalDecision
 * PaymentCancellationRejection2Code.mmLegalDecision}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCancellationRejection2Code#AgentDecision
 * PaymentCancellationRejection2Code.mmAgentDecision}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCancellationRejection2Code#CustomerDecision
 * PaymentCancellationRejection2Code.mmCustomerDecision}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCancellationRejection2Code#AlreadyReturned
 * PaymentCancellationRejection2Code.mmAlreadyReturned}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCancellationRejection2Code#NoAnswerFromCustomer
 * PaymentCancellationRejection2Code.mmNoAnswerFromCustomer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCancellationRejection2Code#NoOriginalTransactionReceived
 * PaymentCancellationRejection2Code.mmNoOriginalTransactionReceived}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCancellationRejection2Code#ClosedAccountNumber
 * PaymentCancellationRejection2Code.mmClosedAccountNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCancellationRejection2Code#InsufficientFunds
 * PaymentCancellationRejection2Code.mmInsufficientFunds}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.PaymentCancellationRejectionCode
 * PaymentCancellationRejectionCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"LEGL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentCancellationRejection2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Returned when a request for cancellation cannot be executed."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PaymentCancellationRejection2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCancellationRejection2Code
	 * PaymentCancellationRejection2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegalDecision"</li>
	 * </ul>
	 */
	public static final PaymentCancellationRejection2Code LegalDecision = new PaymentCancellationRejection2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegalDecision";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentCancellationRejection2Code.mmObject();
			codeName = PaymentCancellationRejectionCode.LegalDecision.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCancellationRejection2Code
	 * PaymentCancellationRejection2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgentDecision"</li>
	 * </ul>
	 */
	public static final PaymentCancellationRejection2Code AgentDecision = new PaymentCancellationRejection2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentDecision";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentCancellationRejection2Code.mmObject();
			codeName = PaymentCancellationRejectionCode.AgentDecision.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCancellationRejection2Code
	 * PaymentCancellationRejection2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerDecision"</li>
	 * </ul>
	 */
	public static final PaymentCancellationRejection2Code CustomerDecision = new PaymentCancellationRejection2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerDecision";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentCancellationRejection2Code.mmObject();
			codeName = PaymentCancellationRejectionCode.CustomerDecision.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCancellationRejection2Code
	 * PaymentCancellationRejection2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AlreadyReturned"</li>
	 * </ul>
	 */
	public static final PaymentCancellationRejection2Code AlreadyReturned = new PaymentCancellationRejection2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AlreadyReturned";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentCancellationRejection2Code.mmObject();
			codeName = PaymentCancellationRejectionCode.AlreadyReturned.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCancellationRejection2Code
	 * PaymentCancellationRejection2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAnswerFromCustomer"</li>
	 * </ul>
	 */
	public static final PaymentCancellationRejection2Code NoAnswerFromCustomer = new PaymentCancellationRejection2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAnswerFromCustomer";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentCancellationRejection2Code.mmObject();
			codeName = PaymentCancellationRejectionCode.NoAnswerFromCustomer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCancellationRejection2Code
	 * PaymentCancellationRejection2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoOriginalTransactionReceived"</li>
	 * </ul>
	 */
	public static final PaymentCancellationRejection2Code NoOriginalTransactionReceived = new PaymentCancellationRejection2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoOriginalTransactionReceived";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentCancellationRejection2Code.mmObject();
			codeName = PaymentCancellationRejectionCode.NoOriginalTransactionReceived.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCancellationRejection2Code
	 * PaymentCancellationRejection2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosedAccountNumber"</li>
	 * </ul>
	 */
	public static final PaymentCancellationRejection2Code ClosedAccountNumber = new PaymentCancellationRejection2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosedAccountNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentCancellationRejection2Code.mmObject();
			codeName = PaymentCancellationRejectionCode.ClosedAccountNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCancellationRejection2Code
	 * PaymentCancellationRejection2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientFunds"</li>
	 * </ul>
	 */
	public static final PaymentCancellationRejection2Code InsufficientFunds = new PaymentCancellationRejection2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientFunds";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentCancellationRejection2Code.mmObject();
			codeName = PaymentCancellationRejectionCode.InsufficientFunds.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, PaymentCancellationRejection2Code> codesByName = new LinkedHashMap<>();

	protected PaymentCancellationRejection2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("LEGL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentCancellationRejection2Code";
				definition = "Returned when a request for cancellation cannot be executed.";
				trace_lazy = () -> PaymentCancellationRejectionCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PaymentCancellationRejection2Code.LegalDecision, com.tools20022.repository.codeset.PaymentCancellationRejection2Code.AgentDecision,
						com.tools20022.repository.codeset.PaymentCancellationRejection2Code.CustomerDecision, com.tools20022.repository.codeset.PaymentCancellationRejection2Code.AlreadyReturned,
						com.tools20022.repository.codeset.PaymentCancellationRejection2Code.NoAnswerFromCustomer, com.tools20022.repository.codeset.PaymentCancellationRejection2Code.NoOriginalTransactionReceived,
						com.tools20022.repository.codeset.PaymentCancellationRejection2Code.ClosedAccountNumber, com.tools20022.repository.codeset.PaymentCancellationRejection2Code.InsufficientFunds);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(LegalDecision.getCodeName().get(), LegalDecision);
		codesByName.put(AgentDecision.getCodeName().get(), AgentDecision);
		codesByName.put(CustomerDecision.getCodeName().get(), CustomerDecision);
		codesByName.put(AlreadyReturned.getCodeName().get(), AlreadyReturned);
		codesByName.put(NoAnswerFromCustomer.getCodeName().get(), NoAnswerFromCustomer);
		codesByName.put(NoOriginalTransactionReceived.getCodeName().get(), NoOriginalTransactionReceived);
		codesByName.put(ClosedAccountNumber.getCodeName().get(), ClosedAccountNumber);
		codesByName.put(InsufficientFunds.getCodeName().get(), InsufficientFunds);
	}

	public static PaymentCancellationRejection2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PaymentCancellationRejection2Code[] values() {
		PaymentCancellationRejection2Code[] values = new PaymentCancellationRejection2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PaymentCancellationRejection2Code> {
		@Override
		public PaymentCancellationRejection2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PaymentCancellationRejection2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}