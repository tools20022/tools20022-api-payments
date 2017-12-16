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
import com.tools20022.repository.codeset.ServiceAdjustmentTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Defines the type of allowed service adjustment.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ServiceAdjustmentTypeCode#Compensable
 * ServiceAdjustmentTypeCode.mmCompensable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ServiceAdjustmentTypeCode#NonCompensable
 * ServiceAdjustmentTypeCode.mmNonCompensable}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ServiceAdjustmentType1Code
 * ServiceAdjustmentType1Code}</li>
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
 * <li>"COMP"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ServiceAdjustmentTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the type of allowed service adjustment."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ServiceAdjustmentTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Adjustment applies to a service which is balance compensable. Earnings
	 * credits based on average balances maintained in the account can be used
	 * to offset the service charge.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ServiceAdjustmentTypeCode
	 * ServiceAdjustmentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COMP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Compensable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment applies to a service which is balance compensable. Earnings credits based on average balances maintained in the account can be used to offset the service charge."
	 * </li>
	 * </ul>
	 */
	public static final ServiceAdjustmentTypeCode Compensable = new ServiceAdjustmentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Compensable";
			definition = "Adjustment applies to a service which is balance compensable. Earnings credits based on average balances maintained in the account can be used to offset the service charge.";
			owner_lazy = () -> com.tools20022.repository.codeset.ServiceAdjustmentTypeCode.mmObject();
			codeName = "COMP";
		}
	};
	/**
	 * Adjustment applies to a service which is not balance compensable. Balance
	 * based credits cannot be used to offset the service charge.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ServiceAdjustmentTypeCode
	 * ServiceAdjustmentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NCMP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonCompensable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment applies to a service which is not balance compensable. Balance based credits cannot be used to offset the service charge."
	 * </li>
	 * </ul>
	 */
	public static final ServiceAdjustmentTypeCode NonCompensable = new ServiceAdjustmentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonCompensable";
			definition = "Adjustment applies to a service which is not balance compensable. Balance based credits cannot be used to offset the service charge.";
			owner_lazy = () -> com.tools20022.repository.codeset.ServiceAdjustmentTypeCode.mmObject();
			codeName = "NCMP";
		}
	};
	final static private LinkedHashMap<String, ServiceAdjustmentTypeCode> codesByName = new LinkedHashMap<>();

	protected ServiceAdjustmentTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("COMP");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ServiceAdjustmentTypeCode";
				definition = "Defines the type of allowed service adjustment.";
				derivation_lazy = () -> Arrays.asList(ServiceAdjustmentType1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ServiceAdjustmentTypeCode.Compensable, com.tools20022.repository.codeset.ServiceAdjustmentTypeCode.NonCompensable);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Compensable.getCodeName().get(), Compensable);
		codesByName.put(NonCompensable.getCodeName().get(), NonCompensable);
	}

	public static ServiceAdjustmentTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ServiceAdjustmentTypeCode[] values() {
		ServiceAdjustmentTypeCode[] values = new ServiceAdjustmentTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ServiceAdjustmentTypeCode> {
		@Override
		public ServiceAdjustmentTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ServiceAdjustmentTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}