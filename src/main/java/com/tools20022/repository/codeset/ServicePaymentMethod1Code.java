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
import com.tools20022.repository.codeset.ServicePaymentMethod1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Defines the method for the payment of the services charge.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ServicePaymentMethod1Code#BalanceCompensable
 * ServicePaymentMethod1Code.BalanceCompensable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ServicePaymentMethod1Code#HardCharge
 * ServicePaymentMethod1Code.HardCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ServicePaymentMethod1Code#PreviouslyCharged
 * ServicePaymentMethod1Code.PreviouslyCharged}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ServicePaymentMethod1Code#InvoicedSeparately
 * ServicePaymentMethod1Code.InvoicedSeparately}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ServicePaymentMethod1Code#Waived
 * ServicePaymentMethod1Code.Waived}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ServicePaymentMethod1Code#Free
 * ServicePaymentMethod1Code.Free}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ServicePaymentMethodCode
 * ServicePaymentMethodCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"BCMP"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ServicePaymentMethod1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the  method for the payment of the services charge."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ServicePaymentMethod1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ServicePaymentMethod1Code
	 * ServicePaymentMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceCompensable"</li>
	 * </ul>
	 */
	public static final ServicePaymentMethod1Code BalanceCompensable = new ServicePaymentMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceCompensable";
			owner_lazy = () -> com.tools20022.repository.codeset.ServicePaymentMethod1Code.mmObject();
			codeName = ServicePaymentMethodCode.BalanceCompensable.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ServicePaymentMethod1Code
	 * ServicePaymentMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HardCharge"</li>
	 * </ul>
	 */
	public static final ServicePaymentMethod1Code HardCharge = new ServicePaymentMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HardCharge";
			owner_lazy = () -> com.tools20022.repository.codeset.ServicePaymentMethod1Code.mmObject();
			codeName = ServicePaymentMethodCode.HardCharge.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ServicePaymentMethod1Code
	 * ServicePaymentMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviouslyCharged"</li>
	 * </ul>
	 */
	public static final ServicePaymentMethod1Code PreviouslyCharged = new ServicePaymentMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviouslyCharged";
			owner_lazy = () -> com.tools20022.repository.codeset.ServicePaymentMethod1Code.mmObject();
			codeName = ServicePaymentMethodCode.PreviouslyCharged.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ServicePaymentMethod1Code
	 * ServicePaymentMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvoicedSeparately"</li>
	 * </ul>
	 */
	public static final ServicePaymentMethod1Code InvoicedSeparately = new ServicePaymentMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvoicedSeparately";
			owner_lazy = () -> com.tools20022.repository.codeset.ServicePaymentMethod1Code.mmObject();
			codeName = ServicePaymentMethodCode.InvoicedSeparately.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ServicePaymentMethod1Code
	 * ServicePaymentMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Waived"</li>
	 * </ul>
	 */
	public static final ServicePaymentMethod1Code Waived = new ServicePaymentMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Waived";
			owner_lazy = () -> com.tools20022.repository.codeset.ServicePaymentMethod1Code.mmObject();
			codeName = ServicePaymentMethodCode.Waived.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ServicePaymentMethod1Code
	 * ServicePaymentMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Free"</li>
	 * </ul>
	 */
	public static final ServicePaymentMethod1Code Free = new ServicePaymentMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Free";
			owner_lazy = () -> com.tools20022.repository.codeset.ServicePaymentMethod1Code.mmObject();
			codeName = ServicePaymentMethodCode.Free.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ServicePaymentMethod1Code> codesByName = new LinkedHashMap<>();

	protected ServicePaymentMethod1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("BCMP");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ServicePaymentMethod1Code";
				definition = "Defines the  method for the payment of the services charge.";
				trace_lazy = () -> ServicePaymentMethodCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ServicePaymentMethod1Code.BalanceCompensable, com.tools20022.repository.codeset.ServicePaymentMethod1Code.HardCharge,
						com.tools20022.repository.codeset.ServicePaymentMethod1Code.PreviouslyCharged, com.tools20022.repository.codeset.ServicePaymentMethod1Code.InvoicedSeparately,
						com.tools20022.repository.codeset.ServicePaymentMethod1Code.Waived, com.tools20022.repository.codeset.ServicePaymentMethod1Code.Free);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(BalanceCompensable.getCodeName().get(), BalanceCompensable);
		codesByName.put(HardCharge.getCodeName().get(), HardCharge);
		codesByName.put(PreviouslyCharged.getCodeName().get(), PreviouslyCharged);
		codesByName.put(InvoicedSeparately.getCodeName().get(), InvoicedSeparately);
		codesByName.put(Waived.getCodeName().get(), Waived);
		codesByName.put(Free.getCodeName().get(), Free);
	}

	public static ServicePaymentMethod1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ServicePaymentMethod1Code[] values() {
		ServicePaymentMethod1Code[] values = new ServicePaymentMethod1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ServicePaymentMethod1Code> {
		@Override
		public ServicePaymentMethod1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ServicePaymentMethod1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}