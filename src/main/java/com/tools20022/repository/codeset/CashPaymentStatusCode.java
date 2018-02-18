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
import com.tools20022.repository.codeset.CashPaymentStatusCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the state of a payment instruction at a specified time.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashPaymentStatusCode#Pending
 * CashPaymentStatusCode.Pending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashPaymentStatusCode#Final
 * CashPaymentStatusCode.Final}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashPaymentStatusCode#Cancelled
 * CashPaymentStatusCode.Cancelled}</li>
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
 * <li>"PDNG"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CashPaymentStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the state of a payment instruction at a specified time."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CashPaymentStatusCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * The payment is awaiting settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashPaymentStatusCode
	 * CashPaymentStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PDNG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pending"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The payment is awaiting settlement."</li>
	 * </ul>
	 */
	public static final CashPaymentStatusCode Pending = new CashPaymentStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pending";
			definition = "The payment is awaiting settlement.";
			owner_lazy = () -> com.tools20022.repository.codeset.CashPaymentStatusCode.mmObject();
			codeName = "PDNG";
		}
	};
	/**
	 * The payment has been settled or stopped.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashPaymentStatusCode
	 * CashPaymentStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FINL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Final"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The payment has been settled or stopped."</li>
	 * </ul>
	 */
	public static final CashPaymentStatusCode Final = new CashPaymentStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Final";
			definition = "The payment has been settled or stopped.";
			owner_lazy = () -> com.tools20022.repository.codeset.CashPaymentStatusCode.mmObject();
			codeName = "FINL";
		}
	};
	/**
	 * The payment is cancelled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashPaymentStatusCode
	 * CashPaymentStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CANC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cancelled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The payment is cancelled."</li>
	 * </ul>
	 */
	public static final CashPaymentStatusCode Cancelled = new CashPaymentStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancelled";
			definition = "The payment is cancelled.";
			owner_lazy = () -> com.tools20022.repository.codeset.CashPaymentStatusCode.mmObject();
			codeName = "CANC";
		}
	};
	final static private LinkedHashMap<String, CashPaymentStatusCode> codesByName = new LinkedHashMap<>();

	protected CashPaymentStatusCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("PDNG");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CashPaymentStatusCode";
				definition = "Specifies the state of a payment instruction at a specified time.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CashPaymentStatusCode.Pending, com.tools20022.repository.codeset.CashPaymentStatusCode.Final,
						com.tools20022.repository.codeset.CashPaymentStatusCode.Cancelled);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Pending.getCodeName().get(), Pending);
		codesByName.put(Final.getCodeName().get(), Final);
		codesByName.put(Cancelled.getCodeName().get(), Cancelled);
	}

	public static CashPaymentStatusCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CashPaymentStatusCode[] values() {
		CashPaymentStatusCode[] values = new CashPaymentStatusCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CashPaymentStatusCode> {
		@Override
		public CashPaymentStatusCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CashPaymentStatusCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}