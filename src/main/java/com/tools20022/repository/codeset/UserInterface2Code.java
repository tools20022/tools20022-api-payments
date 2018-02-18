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
import com.tools20022.repository.codeset.UserInterface2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Type of interface to display a message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UserInterface2Code#MerchantDisplay
 * UserInterface2Code.MerchantDisplay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UserInterface2Code#CardholderDisplay
 * UserInterface2Code.CardholderDisplay}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.UserInterfaceCode
 * UserInterfaceCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"MDSP"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UserInterface2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type of interface to display a message."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class UserInterface2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UserInterface2Code
	 * UserInterface2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MerchantDisplay"</li>
	 * </ul>
	 */
	public static final UserInterface2Code MerchantDisplay = new UserInterface2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MerchantDisplay";
			owner_lazy = () -> com.tools20022.repository.codeset.UserInterface2Code.mmObject();
			codeName = UserInterfaceCode.MerchantDisplay.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UserInterface2Code
	 * UserInterface2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardholderDisplay"</li>
	 * </ul>
	 */
	public static final UserInterface2Code CardholderDisplay = new UserInterface2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardholderDisplay";
			owner_lazy = () -> com.tools20022.repository.codeset.UserInterface2Code.mmObject();
			codeName = UserInterfaceCode.CardholderDisplay.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, UserInterface2Code> codesByName = new LinkedHashMap<>();

	protected UserInterface2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("MDSP");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UserInterface2Code";
				definition = "Type of interface to display a message.";
				trace_lazy = () -> UserInterfaceCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.UserInterface2Code.MerchantDisplay, com.tools20022.repository.codeset.UserInterface2Code.CardholderDisplay);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(MerchantDisplay.getCodeName().get(), MerchantDisplay);
		codesByName.put(CardholderDisplay.getCodeName().get(), CardholderDisplay);
	}

	public static UserInterface2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static UserInterface2Code[] values() {
		UserInterface2Code[] values = new UserInterface2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, UserInterface2Code> {
		@Override
		public UserInterface2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(UserInterface2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}