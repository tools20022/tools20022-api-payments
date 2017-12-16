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
import com.tools20022.repository.codeset.InstalmentPlanCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Type of instalment plan.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstalmentPlanCode#EqualPayment
 * InstalmentPlanCode.mmEqualPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstalmentPlanCode#InequalPayment
 * InstalmentPlanCode.mmInequalPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstalmentPlanCode#DeferredInstalment
 * InstalmentPlanCode.mmDeferredInstalment}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InstalmentPlanCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type of instalment plan."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class InstalmentPlanCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * The payment is split in several instalments of equal amounts.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstalmentPlanCode
	 * InstalmentPlanCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EQPM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EqualPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The payment is split in several instalments of equal amounts."</li>
	 * </ul>
	 */
	public static final InstalmentPlanCode EqualPayment = new InstalmentPlanCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EqualPayment";
			definition = "The payment is split in several instalments of equal amounts.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstalmentPlanCode.mmObject();
			codeName = "EQPM";
		}
	};
	/**
	 * The payment is split in several instalments of different amounts.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstalmentPlanCode
	 * InstalmentPlanCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NQPM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InequalPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The payment is split in several instalments of different amounts."</li>
	 * </ul>
	 */
	public static final InstalmentPlanCode InequalPayment = new InstalmentPlanCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InequalPayment";
			definition = "The payment is split in several instalments of different amounts.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstalmentPlanCode.mmObject();
			codeName = "NQPM";
		}
	};
	/**
	 * The first instalment is deferred.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstalmentPlanCode
	 * InstalmentPlanCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DFRI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeferredInstalment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The first instalment is deferred."</li>
	 * </ul>
	 */
	public static final InstalmentPlanCode DeferredInstalment = new InstalmentPlanCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeferredInstalment";
			definition = "The first instalment is deferred.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstalmentPlanCode.mmObject();
			codeName = "DFRI";
		}
	};
	final static private LinkedHashMap<String, InstalmentPlanCode> codesByName = new LinkedHashMap<>();

	protected InstalmentPlanCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InstalmentPlanCode";
				definition = "Type of instalment plan.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InstalmentPlanCode.EqualPayment, com.tools20022.repository.codeset.InstalmentPlanCode.InequalPayment,
						com.tools20022.repository.codeset.InstalmentPlanCode.DeferredInstalment);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(EqualPayment.getCodeName().get(), EqualPayment);
		codesByName.put(InequalPayment.getCodeName().get(), InequalPayment);
		codesByName.put(DeferredInstalment.getCodeName().get(), DeferredInstalment);
	}

	public static InstalmentPlanCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static InstalmentPlanCode[] values() {
		InstalmentPlanCode[] values = new InstalmentPlanCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, InstalmentPlanCode> {
		@Override
		public InstalmentPlanCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(InstalmentPlanCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}