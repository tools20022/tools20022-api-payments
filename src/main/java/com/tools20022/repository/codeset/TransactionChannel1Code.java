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
import com.tools20022.repository.codeset.TransactionChannel1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Identifies the type of the communication channels used by the cardholder to
 * the acceptor system.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionChannel1Code#MailOrder
 * TransactionChannel1Code.mmMailOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionChannel1Code#TelephoneOrder
 * TransactionChannel1Code.mmTelephoneOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionChannel1Code#ElectronicCommerce
 * TransactionChannel1Code.mmElectronicCommerce}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionChannel1Code#TelevisionPayment
 * TransactionChannel1Code.mmTelevisionPayment}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.TransactionChannelCode
 * TransactionChannelCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"MAIL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TransactionChannel1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies the type of the communication channels used by the cardholder to the acceptor system."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TransactionChannel1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannel1Code
	 * TransactionChannel1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MailOrder"</li>
	 * </ul>
	 */
	public static final TransactionChannel1Code MailOrder = new TransactionChannel1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MailOrder";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionChannel1Code.mmObject();
			codeName = TransactionChannelCode.MailOrder.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannel1Code
	 * TransactionChannel1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TelephoneOrder"</li>
	 * </ul>
	 */
	public static final TransactionChannel1Code TelephoneOrder = new TransactionChannel1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TelephoneOrder";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionChannel1Code.mmObject();
			codeName = TransactionChannelCode.TelephoneOrder.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannel1Code
	 * TransactionChannel1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectronicCommerce"</li>
	 * </ul>
	 */
	public static final TransactionChannel1Code ElectronicCommerce = new TransactionChannel1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectronicCommerce";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionChannel1Code.mmObject();
			codeName = TransactionChannelCode.ElectronicCommerce.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannel1Code
	 * TransactionChannel1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TelevisionPayment"</li>
	 * </ul>
	 */
	public static final TransactionChannel1Code TelevisionPayment = new TransactionChannel1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TelevisionPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionChannel1Code.mmObject();
			codeName = TransactionChannelCode.TelevisionPayment.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TransactionChannel1Code> codesByName = new LinkedHashMap<>();

	protected TransactionChannel1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("MAIL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransactionChannel1Code";
				definition = "Identifies the type of the communication channels used by the cardholder to the acceptor system.";
				trace_lazy = () -> TransactionChannelCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TransactionChannel1Code.MailOrder, com.tools20022.repository.codeset.TransactionChannel1Code.TelephoneOrder,
						com.tools20022.repository.codeset.TransactionChannel1Code.ElectronicCommerce, com.tools20022.repository.codeset.TransactionChannel1Code.TelevisionPayment);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(MailOrder.getCodeName().get(), MailOrder);
		codesByName.put(TelephoneOrder.getCodeName().get(), TelephoneOrder);
		codesByName.put(ElectronicCommerce.getCodeName().get(), ElectronicCommerce);
		codesByName.put(TelevisionPayment.getCodeName().get(), TelevisionPayment);
	}

	public static TransactionChannel1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TransactionChannel1Code[] values() {
		TransactionChannel1Code[] values = new TransactionChannel1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TransactionChannel1Code> {
		@Override
		public TransactionChannel1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TransactionChannel1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}