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
import com.tools20022.repository.codeset.TradeConfirmationTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies whether the contract was electronically confirmed,
 * non-electronically confirmed or remains unconfirmed.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeConfirmationTypeCode#NonElectronicallyConfirmed
 * TradeConfirmationTypeCode.NonElectronicallyConfirmed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeConfirmationTypeCode#ElectronicallyConfirmed
 * TradeConfirmationTypeCode.ElectronicallyConfirmed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeConfirmationTypeCode#NonConfirmed
 * TradeConfirmationTypeCode.NonConfirmed}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradeConfirmationTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies whether the contract was electronically confirmed, non-electronically confirmed or remains unconfirmed."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TradeConfirmationTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Non-electronically confirmed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeConfirmationTypeCode
	 * TradeConfirmationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "YCNF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonElectronicallyConfirmed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Non-electronically confirmed."</li>
	 * </ul>
	 */
	public static final TradeConfirmationTypeCode NonElectronicallyConfirmed = new TradeConfirmationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonElectronicallyConfirmed";
			definition = "Non-electronically confirmed.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeConfirmationTypeCode.mmObject();
			codeName = "YCNF";
		}
	};
	/**
	 * Electronically confirmed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeConfirmationTypeCode
	 * TradeConfirmationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ECNF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectronicallyConfirmed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Electronically confirmed."</li>
	 * </ul>
	 */
	public static final TradeConfirmationTypeCode ElectronicallyConfirmed = new TradeConfirmationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectronicallyConfirmed";
			definition = "Electronically confirmed.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeConfirmationTypeCode.mmObject();
			codeName = "ECNF";
		}
	};
	/**
	 * Non-confirmed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeConfirmationTypeCode
	 * TradeConfirmationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NCNF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonConfirmed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Non-confirmed."</li>
	 * </ul>
	 */
	public static final TradeConfirmationTypeCode NonConfirmed = new TradeConfirmationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonConfirmed";
			definition = "Non-confirmed.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeConfirmationTypeCode.mmObject();
			codeName = "NCNF";
		}
	};
	final static private LinkedHashMap<String, TradeConfirmationTypeCode> codesByName = new LinkedHashMap<>();

	protected TradeConfirmationTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradeConfirmationTypeCode";
				definition = "Specifies whether the contract was electronically confirmed, non-electronically confirmed or remains unconfirmed.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TradeConfirmationTypeCode.NonElectronicallyConfirmed, com.tools20022.repository.codeset.TradeConfirmationTypeCode.ElectronicallyConfirmed,
						com.tools20022.repository.codeset.TradeConfirmationTypeCode.NonConfirmed);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(NonElectronicallyConfirmed.getCodeName().get(), NonElectronicallyConfirmed);
		codesByName.put(ElectronicallyConfirmed.getCodeName().get(), ElectronicallyConfirmed);
		codesByName.put(NonConfirmed.getCodeName().get(), NonConfirmed);
	}

	public static TradeConfirmationTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TradeConfirmationTypeCode[] values() {
		TradeConfirmationTypeCode[] values = new TradeConfirmationTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TradeConfirmationTypeCode> {
		@Override
		public TradeConfirmationTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TradeConfirmationTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}