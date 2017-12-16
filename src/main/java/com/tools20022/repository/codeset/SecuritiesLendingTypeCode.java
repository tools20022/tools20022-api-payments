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
import com.tools20022.repository.codeset.SecuritiesLendingTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Type of securities lending contract.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesLendingTypeCode#NewRegistration
 * SecuritiesLendingTypeCode.mmNewRegistration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesLendingTypeCode#RollOverRenewal
 * SecuritiesLendingTypeCode.mmRollOverRenewal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesLendingTypeCode#CallBack
 * SecuritiesLendingTypeCode.mmCallBack}</li>
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
 * <li>"NWRG"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesLendingTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type of securities lending contract."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SecuritiesLendingTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Securities lending contract is new and registered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesLendingTypeCode
	 * SecuritiesLendingTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NWRG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewRegistration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Securities lending contract is new and registered."</li>
	 * </ul>
	 */
	public static final SecuritiesLendingTypeCode NewRegistration = new SecuritiesLendingTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewRegistration";
			definition = "Securities lending contract is new and registered.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesLendingTypeCode.mmObject();
			codeName = "NWRG";
		}
	};
	/**
	 * Securities lending contract is renewed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesLendingTypeCode
	 * SecuritiesLendingTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RENW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RollOverRenewal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Securities lending contract is renewed."</li>
	 * </ul>
	 */
	public static final SecuritiesLendingTypeCode RollOverRenewal = new SecuritiesLendingTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RollOverRenewal";
			definition = "Securities lending contract is renewed.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesLendingTypeCode.mmObject();
			codeName = "RENW";
		}
	};
	/**
	 * Securities lending contract is called back.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesLendingTypeCode
	 * SecuritiesLendingTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CABK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CallBack"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Securities lending contract is called back."</li>
	 * </ul>
	 */
	public static final SecuritiesLendingTypeCode CallBack = new SecuritiesLendingTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CallBack";
			definition = "Securities lending contract is called back.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesLendingTypeCode.mmObject();
			codeName = "CABK";
		}
	};
	final static private LinkedHashMap<String, SecuritiesLendingTypeCode> codesByName = new LinkedHashMap<>();

	protected SecuritiesLendingTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("NWRG");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesLendingTypeCode";
				definition = "Type of securities lending contract.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SecuritiesLendingTypeCode.NewRegistration, com.tools20022.repository.codeset.SecuritiesLendingTypeCode.RollOverRenewal,
						com.tools20022.repository.codeset.SecuritiesLendingTypeCode.CallBack);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(NewRegistration.getCodeName().get(), NewRegistration);
		codesByName.put(RollOverRenewal.getCodeName().get(), RollOverRenewal);
		codesByName.put(CallBack.getCodeName().get(), CallBack);
	}

	public static SecuritiesLendingTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SecuritiesLendingTypeCode[] values() {
		SecuritiesLendingTypeCode[] values = new SecuritiesLendingTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SecuritiesLendingTypeCode> {
		@Override
		public SecuritiesLendingTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SecuritiesLendingTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}