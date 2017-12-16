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
import com.tools20022.repository.codeset.OrderConfirmationStatusCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the current status of an order confirmation or of an order
 * confirmation amendment.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderConfirmationStatusCode#ConfirmationAccepted
 * OrderConfirmationStatusCode.mmConfirmationAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderConfirmationStatusCode#ConfirmationReceived
 * OrderConfirmationStatusCode.mmConfirmationReceived}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderConfirmationStatusCode#SentToNextParty
 * OrderConfirmationStatusCode.mmSentToNextParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderConfirmationStatusCode#CommunicationProblemNextParty
 * OrderConfirmationStatusCode.mmCommunicationProblemNextParty}</li>
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
 * <li>"COAC"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OrderConfirmationStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the current status of an order confirmation or of an order confirmation amendment."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class OrderConfirmationStatusCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Order confirmation or order confirmation amendment is accepted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderConfirmationStatusCode
	 * OrderConfirmationStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmationAccepted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Order confirmation or order confirmation amendment is accepted."</li>
	 * </ul>
	 */
	public static final OrderConfirmationStatusCode ConfirmationAccepted = new OrderConfirmationStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationAccepted";
			definition = "Order confirmation or order confirmation amendment is accepted.";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderConfirmationStatusCode.mmObject();
			codeName = "COAC";
		}
	};
	/**
	 * Order confirmation or order confirmation amendment is received, ie,
	 * technical validation of the message is ok, and the message is now at the
	 * receiving side.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderConfirmationStatusCode
	 * OrderConfirmationStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CREC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmationReceived"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Order confirmation or order confirmation amendment is received, ie, technical validation of the message is ok, and the message is now at the receiving side."
	 * </li>
	 * </ul>
	 */
	public static final OrderConfirmationStatusCode ConfirmationReceived = new OrderConfirmationStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationReceived";
			definition = "Order confirmation or order confirmation amendment is received, ie, technical validation of the message is ok, and the message is now at the receiving side.";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderConfirmationStatusCode.mmObject();
			codeName = "CREC";
		}
	};
	/**
	 * Order confirmation or order confirmation cancellation instruction or
	 * order confirmation amendment has been sent to the next party, eg, the
	 * next intermediary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderConfirmationStatusCode
	 * OrderConfirmationStatusCode}</li>
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
	 * "Order confirmation or order confirmation cancellation instruction or order confirmation amendment has been sent to the next party, eg, the next intermediary."
	 * </li>
	 * </ul>
	 */
	public static final OrderConfirmationStatusCode SentToNextParty = new OrderConfirmationStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SentToNextParty";
			definition = "Order confirmation or order confirmation cancellation instruction or order confirmation amendment has been sent to the next party, eg, the next intermediary.";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderConfirmationStatusCode.mmObject();
			codeName = "STNP";
		}
	};
	/**
	 * Communication problems with the next party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderConfirmationStatusCode
	 * OrderConfirmationStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CPNP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommunicationProblemNextParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Communication problems with the next party."</li>
	 * </ul>
	 */
	public static final OrderConfirmationStatusCode CommunicationProblemNextParty = new OrderConfirmationStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommunicationProblemNextParty";
			definition = "Communication problems with the next party.";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderConfirmationStatusCode.mmObject();
			codeName = "CPNP";
		}
	};
	final static private LinkedHashMap<String, OrderConfirmationStatusCode> codesByName = new LinkedHashMap<>();

	protected OrderConfirmationStatusCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("COAC");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OrderConfirmationStatusCode";
				definition = "Specifies the current status of an order confirmation or of an order confirmation amendment.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OrderConfirmationStatusCode.ConfirmationAccepted, com.tools20022.repository.codeset.OrderConfirmationStatusCode.ConfirmationReceived,
						com.tools20022.repository.codeset.OrderConfirmationStatusCode.SentToNextParty, com.tools20022.repository.codeset.OrderConfirmationStatusCode.CommunicationProblemNextParty);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ConfirmationAccepted.getCodeName().get(), ConfirmationAccepted);
		codesByName.put(ConfirmationReceived.getCodeName().get(), ConfirmationReceived);
		codesByName.put(SentToNextParty.getCodeName().get(), SentToNextParty);
		codesByName.put(CommunicationProblemNextParty.getCodeName().get(), CommunicationProblemNextParty);
	}

	public static OrderConfirmationStatusCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static OrderConfirmationStatusCode[] values() {
		OrderConfirmationStatusCode[] values = new OrderConfirmationStatusCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, OrderConfirmationStatusCode> {
		@Override
		public OrderConfirmationStatusCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(OrderConfirmationStatusCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}