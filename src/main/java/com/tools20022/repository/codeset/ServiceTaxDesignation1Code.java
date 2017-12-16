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
import com.tools20022.repository.codeset.ServiceTaxDesignation1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Defines the taxable status of the service.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ServiceTaxDesignation1Code#Exempt
 * ServiceTaxDesignation1Code.mmExempt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ServiceTaxDesignation1Code#ZeroRate
 * ServiceTaxDesignation1Code.mmZeroRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ServiceTaxDesignation1Code#Taxable
 * ServiceTaxDesignation1Code.mmTaxable}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ServiceTaxDesignationCode
 * ServiceTaxDesignationCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"XMPT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ServiceTaxDesignation1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the taxable status of the service."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ServiceTaxDesignation1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ServiceTaxDesignation1Code
	 * ServiceTaxDesignation1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Exempt"</li>
	 * </ul>
	 */
	public static final ServiceTaxDesignation1Code Exempt = new ServiceTaxDesignation1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Exempt";
			owner_lazy = () -> com.tools20022.repository.codeset.ServiceTaxDesignation1Code.mmObject();
			codeName = ServiceTaxDesignationCode.Exempt.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ServiceTaxDesignation1Code
	 * ServiceTaxDesignation1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ZeroRate"</li>
	 * </ul>
	 */
	public static final ServiceTaxDesignation1Code ZeroRate = new ServiceTaxDesignation1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ZeroRate";
			owner_lazy = () -> com.tools20022.repository.codeset.ServiceTaxDesignation1Code.mmObject();
			codeName = ServiceTaxDesignationCode.ZeroRate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ServiceTaxDesignation1Code
	 * ServiceTaxDesignation1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Taxable"</li>
	 * </ul>
	 */
	public static final ServiceTaxDesignation1Code Taxable = new ServiceTaxDesignation1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Taxable";
			owner_lazy = () -> com.tools20022.repository.codeset.ServiceTaxDesignation1Code.mmObject();
			codeName = ServiceTaxDesignationCode.Taxable.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ServiceTaxDesignation1Code> codesByName = new LinkedHashMap<>();

	protected ServiceTaxDesignation1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("XMPT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ServiceTaxDesignation1Code";
				definition = "Defines the taxable status of the service.";
				trace_lazy = () -> ServiceTaxDesignationCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ServiceTaxDesignation1Code.Exempt, com.tools20022.repository.codeset.ServiceTaxDesignation1Code.ZeroRate,
						com.tools20022.repository.codeset.ServiceTaxDesignation1Code.Taxable);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Exempt.getCodeName().get(), Exempt);
		codesByName.put(ZeroRate.getCodeName().get(), ZeroRate);
		codesByName.put(Taxable.getCodeName().get(), Taxable);
	}

	public static ServiceTaxDesignation1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ServiceTaxDesignation1Code[] values() {
		ServiceTaxDesignation1Code[] values = new ServiceTaxDesignation1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ServiceTaxDesignation1Code> {
		@Override
		public ServiceTaxDesignation1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ServiceTaxDesignation1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}