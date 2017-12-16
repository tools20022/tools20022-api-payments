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
import com.tools20022.repository.codeset.ServiceLevelCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the pre-agreed level of service between the parties.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ServiceLevelCode#SameDayValue
 * ServiceLevelCode.mmSameDayValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ServiceLevelCode#SingleEuroPaymentsArea
 * ServiceLevelCode.mmSingleEuroPaymentsArea}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ServiceLevelCode#EBAPriorityService
 * ServiceLevelCode.mmEBAPriorityService}</li>
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
 * <li>"SDVA"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ServiceLevelCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the pre-agreed level of service between the parties."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ServiceLevelCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Payment must be executed with same day value to the creditor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ServiceLevelCode
	 * ServiceLevelCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SDVA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SameDayValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment must be executed with same day value to the creditor."</li>
	 * </ul>
	 */
	public static final ServiceLevelCode SameDayValue = new ServiceLevelCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SameDayValue";
			definition = "Payment must be executed with same day value to the creditor.";
			owner_lazy = () -> com.tools20022.repository.codeset.ServiceLevelCode.mmObject();
			codeName = "SDVA";
		}
	};
	/**
	 * Payment must be executed following the Single Euro Payments Area scheme.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ServiceLevelCode
	 * ServiceLevelCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SEPA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SingleEuroPaymentsArea"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment must be executed following the Single Euro Payments Area scheme."
	 * </li>
	 * </ul>
	 */
	public static final ServiceLevelCode SingleEuroPaymentsArea = new ServiceLevelCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SingleEuroPaymentsArea";
			definition = "Payment must be executed following the Single Euro Payments Area scheme.";
			owner_lazy = () -> com.tools20022.repository.codeset.ServiceLevelCode.mmObject();
			codeName = "SEPA";
		}
	};
	/**
	 * Transaction must be processed according to the EBA Priority Service.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ServiceLevelCode
	 * ServiceLevelCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRPT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EBAPriorityService"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction must be processed according to the EBA\nPriority Service."</li>
	 * </ul>
	 */
	public static final ServiceLevelCode EBAPriorityService = new ServiceLevelCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EBAPriorityService";
			definition = "Transaction must be processed according to the EBA\nPriority Service.";
			owner_lazy = () -> com.tools20022.repository.codeset.ServiceLevelCode.mmObject();
			codeName = "PRPT";
		}
	};
	final static private LinkedHashMap<String, ServiceLevelCode> codesByName = new LinkedHashMap<>();

	protected ServiceLevelCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("SDVA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ServiceLevelCode";
				definition = "Specifies the pre-agreed level of service between the parties.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ServiceLevelCode.SameDayValue, com.tools20022.repository.codeset.ServiceLevelCode.SingleEuroPaymentsArea,
						com.tools20022.repository.codeset.ServiceLevelCode.EBAPriorityService);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(SameDayValue.getCodeName().get(), SameDayValue);
		codesByName.put(SingleEuroPaymentsArea.getCodeName().get(), SingleEuroPaymentsArea);
		codesByName.put(EBAPriorityService.getCodeName().get(), EBAPriorityService);
	}

	public static ServiceLevelCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ServiceLevelCode[] values() {
		ServiceLevelCode[] values = new ServiceLevelCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ServiceLevelCode> {
		@Override
		public ServiceLevelCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ServiceLevelCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}