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
import com.tools20022.repository.codeset.BillingStatementStatus1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Defines the status of the billing statement.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingStatementStatus1Code#Original
 * BillingStatementStatus1Code.mmOriginal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingStatementStatus1Code#Replace
 * BillingStatementStatus1Code.mmReplace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingStatementStatus1Code#Test
 * BillingStatementStatus1Code.mmTest}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.BillingStatementStatusCode
 * BillingStatementStatusCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"ORGN"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BillingStatementStatus1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the status of the billing statement."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class BillingStatementStatus1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingStatementStatus1Code
	 * BillingStatementStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Original"</li>
	 * </ul>
	 */
	public static final BillingStatementStatus1Code Original = new BillingStatementStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Original";
			owner_lazy = () -> com.tools20022.repository.codeset.BillingStatementStatus1Code.mmObject();
			codeName = BillingStatementStatusCode.Original.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingStatementStatus1Code
	 * BillingStatementStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Replace"</li>
	 * </ul>
	 */
	public static final BillingStatementStatus1Code Replace = new BillingStatementStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Replace";
			owner_lazy = () -> com.tools20022.repository.codeset.BillingStatementStatus1Code.mmObject();
			codeName = BillingStatementStatusCode.Replace.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingStatementStatus1Code
	 * BillingStatementStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Test"</li>
	 * </ul>
	 */
	public static final BillingStatementStatus1Code Test = new BillingStatementStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Test";
			owner_lazy = () -> com.tools20022.repository.codeset.BillingStatementStatus1Code.mmObject();
			codeName = BillingStatementStatusCode.Test.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, BillingStatementStatus1Code> codesByName = new LinkedHashMap<>();

	protected BillingStatementStatus1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("ORGN");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BillingStatementStatus1Code";
				definition = "Defines the status of the billing statement.";
				trace_lazy = () -> BillingStatementStatusCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BillingStatementStatus1Code.Original, com.tools20022.repository.codeset.BillingStatementStatus1Code.Replace,
						com.tools20022.repository.codeset.BillingStatementStatus1Code.Test);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Original.getCodeName().get(), Original);
		codesByName.put(Replace.getCodeName().get(), Replace);
		codesByName.put(Test.getCodeName().get(), Test);
	}

	public static BillingStatementStatus1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static BillingStatementStatus1Code[] values() {
		BillingStatementStatus1Code[] values = new BillingStatementStatus1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, BillingStatementStatus1Code> {
		@Override
		public BillingStatementStatus1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(BillingStatementStatus1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}