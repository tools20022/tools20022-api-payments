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
import com.tools20022.repository.codeset.EUSavingsDirectiveCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicate whether or not the fund is subject to reporting under the EU Savings
 * Directive. Enter "Variable" if the status of the fund is likely to change
 * from time to time.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EUSavingsDirectiveCode#EUSavingsInScope
 * EUSavingsDirectiveCode.EUSavingsInScope}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EUSavingsDirectiveCode#EUSavingsOutScope
 * EUSavingsDirectiveCode.EUSavingsOutScope}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EUSavingsDirectiveCode#EUSavingsUnknown
 * EUSavingsDirectiveCode.EUSavingsUnknown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EUSavingsDirectiveCode#EUSavingsVariable
 * EUSavingsDirectiveCode.EUSavingsVariable}</li>
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
 * <li>"EUSI"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "EUSavingsDirectiveCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicate whether or not the fund is subject to reporting under the EU Savings Directive. Enter \"Variable\" if the status of the fund is likely to change from time to time."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class EUSavingsDirectiveCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Investment Fund is in the scope of the directive.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EUSavingsDirectiveCode
	 * EUSavingsDirectiveCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EUSI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EUSavingsInScope"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Investment Fund is in the scope of the directive."</li>
	 * </ul>
	 */
	public static final EUSavingsDirectiveCode EUSavingsInScope = new EUSavingsDirectiveCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EUSavingsInScope";
			definition = "Investment Fund is in the scope of the directive.";
			owner_lazy = () -> com.tools20022.repository.codeset.EUSavingsDirectiveCode.mmObject();
			codeName = "EUSI";
		}
	};
	/**
	 * Investment Fund is out of the scope of the directive.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EUSavingsDirectiveCode
	 * EUSavingsDirectiveCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EUSO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EUSavingsOutScope"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Investment Fund is out of the scope of the directive."</li>
	 * </ul>
	 */
	public static final EUSavingsDirectiveCode EUSavingsOutScope = new EUSavingsDirectiveCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EUSavingsOutScope";
			definition = "Investment Fund is out of the scope of the directive.";
			owner_lazy = () -> com.tools20022.repository.codeset.EUSavingsDirectiveCode.mmObject();
			codeName = "EUSO";
		}
	};
	/**
	 * Unknown whether capital gain is in or out of the scope fo the directive.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EUSavingsDirectiveCode
	 * EUSavingsDirectiveCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UKWN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EUSavingsUnknown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unknown whether capital gain is in or out of the scope fo the directive."
	 * </li>
	 * </ul>
	 */
	public static final EUSavingsDirectiveCode EUSavingsUnknown = new EUSavingsDirectiveCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EUSavingsUnknown";
			definition = "Unknown whether capital gain is in or out of the scope fo the directive.";
			owner_lazy = () -> com.tools20022.repository.codeset.EUSavingsDirectiveCode.mmObject();
			codeName = "UKWN";
		}
	};
	/**
	 * Investment Fund may vary for inclusion in the scope of the directive.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EUSavingsDirectiveCode
	 * EUSavingsDirectiveCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VARI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EUSavingsVariable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment Fund may vary for inclusion in the scope of the directive."</li>
	 * </ul>
	 */
	public static final EUSavingsDirectiveCode EUSavingsVariable = new EUSavingsDirectiveCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EUSavingsVariable";
			definition = "Investment Fund may vary for inclusion in the scope of the directive.";
			owner_lazy = () -> com.tools20022.repository.codeset.EUSavingsDirectiveCode.mmObject();
			codeName = "VARI";
		}
	};
	final static private LinkedHashMap<String, EUSavingsDirectiveCode> codesByName = new LinkedHashMap<>();

	protected EUSavingsDirectiveCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("EUSI");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "EUSavingsDirectiveCode";
				definition = "Indicate whether or not the fund is subject to reporting under the EU Savings Directive. Enter \"Variable\" if the status of the fund is likely to change from time to time.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.EUSavingsDirectiveCode.EUSavingsInScope, com.tools20022.repository.codeset.EUSavingsDirectiveCode.EUSavingsOutScope,
						com.tools20022.repository.codeset.EUSavingsDirectiveCode.EUSavingsUnknown, com.tools20022.repository.codeset.EUSavingsDirectiveCode.EUSavingsVariable);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(EUSavingsInScope.getCodeName().get(), EUSavingsInScope);
		codesByName.put(EUSavingsOutScope.getCodeName().get(), EUSavingsOutScope);
		codesByName.put(EUSavingsUnknown.getCodeName().get(), EUSavingsUnknown);
		codesByName.put(EUSavingsVariable.getCodeName().get(), EUSavingsVariable);
	}

	public static EUSavingsDirectiveCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static EUSavingsDirectiveCode[] values() {
		EUSavingsDirectiveCode[] values = new EUSavingsDirectiveCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, EUSavingsDirectiveCode> {
		@Override
		public EUSavingsDirectiveCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(EUSavingsDirectiveCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}