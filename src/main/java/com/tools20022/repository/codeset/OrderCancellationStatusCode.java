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
import com.tools20022.repository.codeset.OrderCancellationStatusCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the current status of the order cancellation request.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderCancellationStatusCode#SentToNextParty
 * OrderCancellationStatusCode.mmSentToNextParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderCancellationStatusCode#CancellationPending
 * OrderCancellationStatusCode.mmCancellationPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderCancellationStatusCode#CancellationCompleted
 * OrderCancellationStatusCode.mmCancellationCompleted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderCancellationStatusCode#Received
 * OrderCancellationStatusCode.mmReceived}</li>
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
 * <li>"STNP"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OrderCancellationStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the current status of the order cancellation request."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class OrderCancellationStatusCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Order cancellation request has been sent to the next party, eg, the next
	 * intermediary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderCancellationStatusCode
	 * OrderCancellationStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STNP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SentToNextParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Order cancellation request has been sent to the next party, eg, the next intermediary."
	 * </li>
	 * </ul>
	 */
	public static final OrderCancellationStatusCode SentToNextParty = new OrderCancellationStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SentToNextParty";
			definition = "Order cancellation request has been sent to the next party, eg, the next intermediary.";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderCancellationStatusCode.mmObject();
			codeName = "STNP";
		}
	};
	/**
	 * Order cancellation request is pending, The order cancellation request has
	 * been received but this does not indicate the order has been cancelled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderCancellationStatusCode
	 * OrderCancellationStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CANP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationPending"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Order cancellation request is pending, The order cancellation request has been received but this does not indicate the order has been cancelled."
	 * </li>
	 * </ul>
	 */
	public static final OrderCancellationStatusCode CancellationPending = new OrderCancellationStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationPending";
			definition = "Order cancellation request is pending, The order cancellation request has been received but this does not indicate the order has been cancelled.";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderCancellationStatusCode.mmObject();
			codeName = "CANP";
		}
	};
	/**
	 * Status of the order cancellation request is completed. The cancellation
	 * request has been accepted and processed; the order has been cancelled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderCancellationStatusCode
	 * OrderCancellationStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CAND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationCompleted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status of the order cancellation request is completed. The cancellation request has been accepted and processed; the order has been cancelled."
	 * </li>
	 * </ul>
	 */
	public static final OrderCancellationStatusCode CancellationCompleted = new OrderCancellationStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationCompleted";
			definition = "Status of the order cancellation request is completed. The cancellation request has been accepted and processed; the order has been cancelled.";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderCancellationStatusCode.mmObject();
			codeName = "CAND";
		}
	};
	/**
	 * Status of the order cancellation request is received, that is, technical
	 * validation of the message is ok, and the message is now at the receiving
	 * side.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderCancellationStatusCode
	 * OrderCancellationStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RECE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Received"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status of the order cancellation request is received, that is, technical validation of the message is ok, and the message is now at the receiving side."
	 * </li>
	 * </ul>
	 */
	public static final OrderCancellationStatusCode Received = new OrderCancellationStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Received";
			definition = "Status of the order cancellation request is received, that is, technical validation of the message is ok, and the message is now at the receiving side.";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderCancellationStatusCode.mmObject();
			codeName = "RECE";
		}
	};
	final static private LinkedHashMap<String, OrderCancellationStatusCode> codesByName = new LinkedHashMap<>();

	protected OrderCancellationStatusCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("STNP");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OrderCancellationStatusCode";
				definition = "Specifies the current status of the order cancellation request.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OrderCancellationStatusCode.SentToNextParty, com.tools20022.repository.codeset.OrderCancellationStatusCode.CancellationPending,
						com.tools20022.repository.codeset.OrderCancellationStatusCode.CancellationCompleted, com.tools20022.repository.codeset.OrderCancellationStatusCode.Received);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(SentToNextParty.getCodeName().get(), SentToNextParty);
		codesByName.put(CancellationPending.getCodeName().get(), CancellationPending);
		codesByName.put(CancellationCompleted.getCodeName().get(), CancellationCompleted);
		codesByName.put(Received.getCodeName().get(), Received);
	}

	public static OrderCancellationStatusCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static OrderCancellationStatusCode[] values() {
		OrderCancellationStatusCode[] values = new OrderCancellationStatusCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, OrderCancellationStatusCode> {
		@Override
		public OrderCancellationStatusCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(OrderCancellationStatusCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}