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
import com.tools20022.repository.codeset.BillingTaxCalculationMethod1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Defines the tax calculation method
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingTaxCalculationMethod1Code#NoTaxes
 * BillingTaxCalculationMethod1Code.NoTaxes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingTaxCalculationMethod1Code#MethodA
 * BillingTaxCalculationMethod1Code.MethodA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingTaxCalculationMethod1Code#MethodB
 * BillingTaxCalculationMethod1Code.MethodB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingTaxCalculationMethod1Code#MethodC
 * BillingTaxCalculationMethod1Code.MethodC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingTaxCalculationMethod1Code#MethodD
 * BillingTaxCalculationMethod1Code.MethodD}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingTaxCalculationMethod1Code#Undefined
 * BillingTaxCalculationMethod1Code.Undefined}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.BillingTaxCalculationMethodCode
 * BillingTaxCalculationMethodCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"NTAX"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BillingTaxCalculationMethod1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the tax calculation method"</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class BillingTaxCalculationMethod1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingTaxCalculationMethod1Code
	 * BillingTaxCalculationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoTaxes"</li>
	 * </ul>
	 */
	public static final BillingTaxCalculationMethod1Code NoTaxes = new BillingTaxCalculationMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoTaxes";
			owner_lazy = () -> com.tools20022.repository.codeset.BillingTaxCalculationMethod1Code.mmObject();
			codeName = BillingTaxCalculationMethodCode.NoTaxes.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingTaxCalculationMethod1Code
	 * BillingTaxCalculationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MethodA"</li>
	 * </ul>
	 */
	public static final BillingTaxCalculationMethod1Code MethodA = new BillingTaxCalculationMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MethodA";
			owner_lazy = () -> com.tools20022.repository.codeset.BillingTaxCalculationMethod1Code.mmObject();
			codeName = BillingTaxCalculationMethodCode.MethodA.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingTaxCalculationMethod1Code
	 * BillingTaxCalculationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MethodB"</li>
	 * </ul>
	 */
	public static final BillingTaxCalculationMethod1Code MethodB = new BillingTaxCalculationMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MethodB";
			owner_lazy = () -> com.tools20022.repository.codeset.BillingTaxCalculationMethod1Code.mmObject();
			codeName = BillingTaxCalculationMethodCode.MethodB.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingTaxCalculationMethod1Code
	 * BillingTaxCalculationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MethodC"</li>
	 * </ul>
	 */
	public static final BillingTaxCalculationMethod1Code MethodC = new BillingTaxCalculationMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MethodC";
			owner_lazy = () -> com.tools20022.repository.codeset.BillingTaxCalculationMethod1Code.mmObject();
			codeName = BillingTaxCalculationMethodCode.MethodC.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingTaxCalculationMethod1Code
	 * BillingTaxCalculationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MethodD"</li>
	 * </ul>
	 */
	public static final BillingTaxCalculationMethod1Code MethodD = new BillingTaxCalculationMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MethodD";
			owner_lazy = () -> com.tools20022.repository.codeset.BillingTaxCalculationMethod1Code.mmObject();
			codeName = BillingTaxCalculationMethodCode.MethodD.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingTaxCalculationMethod1Code
	 * BillingTaxCalculationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Undefined"</li>
	 * </ul>
	 */
	public static final BillingTaxCalculationMethod1Code Undefined = new BillingTaxCalculationMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Undefined";
			owner_lazy = () -> com.tools20022.repository.codeset.BillingTaxCalculationMethod1Code.mmObject();
			codeName = BillingTaxCalculationMethodCode.Undefined.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, BillingTaxCalculationMethod1Code> codesByName = new LinkedHashMap<>();

	protected BillingTaxCalculationMethod1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("NTAX");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BillingTaxCalculationMethod1Code";
				definition = "Defines the tax calculation method";
				trace_lazy = () -> BillingTaxCalculationMethodCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BillingTaxCalculationMethod1Code.NoTaxes, com.tools20022.repository.codeset.BillingTaxCalculationMethod1Code.MethodA,
						com.tools20022.repository.codeset.BillingTaxCalculationMethod1Code.MethodB, com.tools20022.repository.codeset.BillingTaxCalculationMethod1Code.MethodC,
						com.tools20022.repository.codeset.BillingTaxCalculationMethod1Code.MethodD, com.tools20022.repository.codeset.BillingTaxCalculationMethod1Code.Undefined);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(NoTaxes.getCodeName().get(), NoTaxes);
		codesByName.put(MethodA.getCodeName().get(), MethodA);
		codesByName.put(MethodB.getCodeName().get(), MethodB);
		codesByName.put(MethodC.getCodeName().get(), MethodC);
		codesByName.put(MethodD.getCodeName().get(), MethodD);
		codesByName.put(Undefined.getCodeName().get(), Undefined);
	}

	public static BillingTaxCalculationMethod1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static BillingTaxCalculationMethod1Code[] values() {
		BillingTaxCalculationMethod1Code[] values = new BillingTaxCalculationMethod1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, BillingTaxCalculationMethod1Code> {
		@Override
		public BillingTaxCalculationMethod1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(BillingTaxCalculationMethod1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}