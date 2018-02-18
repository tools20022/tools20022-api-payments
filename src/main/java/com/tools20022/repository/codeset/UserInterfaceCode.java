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
import com.tools20022.repository.codeset.UserInterfaceCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Type of user interface to display or print information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UserInterfaceCode#CardholderDisplay
 * UserInterfaceCode.CardholderDisplay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UserInterfaceCode#CardholderReceipt
 * UserInterfaceCode.CardholderReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UserInterfaceCode#MerchantDisplay
 * UserInterfaceCode.MerchantDisplay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UserInterfaceCode#MerchantReceipt
 * UserInterfaceCode.MerchantReceipt}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UserInterfaceCode#Acquirer
 * UserInterfaceCode.Acquirer}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UserInterfaceCode#Issuer
 * UserInterfaceCode.Issuer}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UserInterfaceCode#Agent
 * UserInterfaceCode.Agent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UserInterfaceCode#OtherCardholderInterface
 * UserInterfaceCode.OtherCardholderInterface}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.UserInterface2Code
 * UserInterface2Code}</li>
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
 * <li>"CDSP"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UserInterfaceCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type of user interface to display or print information."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class UserInterfaceCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Cardholder display or interface.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UserInterfaceCode
	 * UserInterfaceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CDSP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardholderDisplay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cardholder display or interface."</li>
	 * </ul>
	 */
	public static final UserInterfaceCode CardholderDisplay = new UserInterfaceCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CardholderDisplay";
			definition = "Cardholder display or interface.";
			owner_lazy = () -> com.tools20022.repository.codeset.UserInterfaceCode.mmObject();
			codeName = "CDSP";
		}
	};
	/**
	 * Cardholder receipt.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UserInterfaceCode
	 * UserInterfaceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRCP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardholderReceipt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cardholder receipt."</li>
	 * </ul>
	 */
	public static final UserInterfaceCode CardholderReceipt = new UserInterfaceCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CardholderReceipt";
			definition = "Cardholder receipt.";
			owner_lazy = () -> com.tools20022.repository.codeset.UserInterfaceCode.mmObject();
			codeName = "CRCP";
		}
	};
	/**
	 * Merchant display or interface.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UserInterfaceCode
	 * UserInterfaceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MDSP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MerchantDisplay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Merchant display or interface."</li>
	 * </ul>
	 */
	public static final UserInterfaceCode MerchantDisplay = new UserInterfaceCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MerchantDisplay";
			definition = "Merchant display or interface.";
			owner_lazy = () -> com.tools20022.repository.codeset.UserInterfaceCode.mmObject();
			codeName = "MDSP";
		}
	};
	/**
	 * Merchant receipt.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UserInterfaceCode
	 * UserInterfaceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MRCP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MerchantReceipt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Merchant receipt."</li>
	 * </ul>
	 */
	public static final UserInterfaceCode MerchantReceipt = new UserInterfaceCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MerchantReceipt";
			definition = "Merchant receipt.";
			owner_lazy = () -> com.tools20022.repository.codeset.UserInterfaceCode.mmObject();
			codeName = "MRCP";
		}
	};
	/**
	 * Acquirer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UserInterfaceCode
	 * UserInterfaceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACQU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Acquirer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Acquirer."</li>
	 * </ul>
	 */
	public static final UserInterfaceCode Acquirer = new UserInterfaceCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Acquirer";
			definition = "Acquirer.";
			owner_lazy = () -> com.tools20022.repository.codeset.UserInterfaceCode.mmObject();
			codeName = "ACQU";
		}
	};
	/**
	 * Issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UserInterfaceCode
	 * UserInterfaceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ISSR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issuer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Issuer."</li>
	 * </ul>
	 */
	public static final UserInterfaceCode Issuer = new UserInterfaceCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issuer";
			definition = "Issuer.";
			owner_lazy = () -> com.tools20022.repository.codeset.UserInterfaceCode.mmObject();
			codeName = "ISSR";
		}
	};
	/**
	 * Agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UserInterfaceCode
	 * UserInterfaceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AGNT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Agent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Agent."</li>
	 * </ul>
	 */
	public static final UserInterfaceCode Agent = new UserInterfaceCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Agent";
			definition = "Agent.";
			owner_lazy = () -> com.tools20022.repository.codeset.UserInterfaceCode.mmObject();
			codeName = "AGNT";
		}
	};
	/**
	 * Other interface of the cardholder, for instance e-mail or smartphone
	 * message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UserInterfaceCode
	 * UserInterfaceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRDO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherCardholderInterface"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Other interface of the cardholder, for instance e-mail or smartphone message."
	 * </li>
	 * </ul>
	 */
	public static final UserInterfaceCode OtherCardholderInterface = new UserInterfaceCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherCardholderInterface";
			definition = "Other interface of the cardholder, for instance e-mail or smartphone message.";
			owner_lazy = () -> com.tools20022.repository.codeset.UserInterfaceCode.mmObject();
			codeName = "CRDO";
		}
	};
	final static private LinkedHashMap<String, UserInterfaceCode> codesByName = new LinkedHashMap<>();

	protected UserInterfaceCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CDSP");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UserInterfaceCode";
				definition = "Type of user interface to display or print information.";
				derivation_lazy = () -> Arrays.asList(UserInterface2Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.UserInterfaceCode.CardholderDisplay, com.tools20022.repository.codeset.UserInterfaceCode.CardholderReceipt,
						com.tools20022.repository.codeset.UserInterfaceCode.MerchantDisplay, com.tools20022.repository.codeset.UserInterfaceCode.MerchantReceipt, com.tools20022.repository.codeset.UserInterfaceCode.Acquirer,
						com.tools20022.repository.codeset.UserInterfaceCode.Issuer, com.tools20022.repository.codeset.UserInterfaceCode.Agent, com.tools20022.repository.codeset.UserInterfaceCode.OtherCardholderInterface);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CardholderDisplay.getCodeName().get(), CardholderDisplay);
		codesByName.put(CardholderReceipt.getCodeName().get(), CardholderReceipt);
		codesByName.put(MerchantDisplay.getCodeName().get(), MerchantDisplay);
		codesByName.put(MerchantReceipt.getCodeName().get(), MerchantReceipt);
		codesByName.put(Acquirer.getCodeName().get(), Acquirer);
		codesByName.put(Issuer.getCodeName().get(), Issuer);
		codesByName.put(Agent.getCodeName().get(), Agent);
		codesByName.put(OtherCardholderInterface.getCodeName().get(), OtherCardholderInterface);
	}

	public static UserInterfaceCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static UserInterfaceCode[] values() {
		UserInterfaceCode[] values = new UserInterfaceCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, UserInterfaceCode> {
		@Override
		public UserInterfaceCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(UserInterfaceCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}