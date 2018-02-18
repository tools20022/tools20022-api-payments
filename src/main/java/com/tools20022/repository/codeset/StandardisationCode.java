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
import com.tools20022.repository.codeset.StandardisationCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies whether the terms of the security (underlying instruments,
 * expiration date, contract size) are defined according to the exchange
 * specifications or whether they can be user defined.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StandardisationCode#Standardised
 * StandardisationCode.Standardised}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StandardisationCode#NonStandardised
 * StandardisationCode.NonStandardised}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StandardisationCode#Flexible
 * StandardisationCode.Flexible}</li>
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
 * <li>"STAN"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "StandardisationCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies whether the terms of the security (underlying instruments, expiration date, contract size) are defined according to the exchange specifications or whether they can be user defined."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class StandardisationCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * The underlying instruments, expiration date and contract size of the
	 * derivatives are standardised.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StandardisationCode
	 * StandardisationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Standardised"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The underlying instruments, expiration date and contract size of the derivatives are standardised."
	 * </li>
	 * </ul>
	 */
	public static final StandardisationCode Standardised = new StandardisationCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Standardised";
			definition = "The underlying instruments, expiration date and contract size of the derivatives are standardised.";
			owner_lazy = () -> com.tools20022.repository.codeset.StandardisationCode.mmObject();
			codeName = "STAN";
		}
	};
	/**
	 * Custom-made instrument between two parties. Underlying instruments,
	 * expiration date and contract size of the derivatives are not
	 * standardised.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StandardisationCode
	 * StandardisationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NSTA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonStandardised"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Custom-made instrument between two parties. Underlying\ninstruments, expiration date and contract size of the derivatives are not standardised."
	 * </li>
	 * </ul>
	 */
	public static final StandardisationCode NonStandardised = new StandardisationCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NonStandardised";
			definition = "Custom-made instrument between two parties. Underlying\ninstruments, expiration date and contract size of the derivatives are not standardised.";
			owner_lazy = () -> com.tools20022.repository.codeset.StandardisationCode.mmObject();
			codeName = "NSTA";
		}
	};
	/**
	 * Derivatives defined according to exchange specifications, but certain
	 * characteristics can be user defined.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StandardisationCode
	 * StandardisationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FLEX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Flexible"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Derivatives defined according to exchange specifications, but certain characteristics can be user defined."
	 * </li>
	 * </ul>
	 */
	public static final StandardisationCode Flexible = new StandardisationCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Flexible";
			definition = "Derivatives defined according to exchange specifications, but certain characteristics can be user defined.";
			owner_lazy = () -> com.tools20022.repository.codeset.StandardisationCode.mmObject();
			codeName = "FLEX";
		}
	};
	final static private LinkedHashMap<String, StandardisationCode> codesByName = new LinkedHashMap<>();

	protected StandardisationCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("STAN");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StandardisationCode";
				definition = "Specifies whether the terms of the security (underlying instruments, expiration date, contract size) are defined according to the exchange specifications or whether they can be user defined.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.StandardisationCode.Standardised, com.tools20022.repository.codeset.StandardisationCode.NonStandardised,
						com.tools20022.repository.codeset.StandardisationCode.Flexible);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Standardised.getCodeName().get(), Standardised);
		codesByName.put(NonStandardised.getCodeName().get(), NonStandardised);
		codesByName.put(Flexible.getCodeName().get(), Flexible);
	}

	public static StandardisationCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static StandardisationCode[] values() {
		StandardisationCode[] values = new StandardisationCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, StandardisationCode> {
		@Override
		public StandardisationCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(StandardisationCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}