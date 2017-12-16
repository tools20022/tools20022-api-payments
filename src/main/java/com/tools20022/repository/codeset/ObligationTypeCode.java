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
import com.tools20022.repository.codeset.ObligationTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of the obligation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ObligationTypeCode#Fails
 * ObligationTypeCode.mmFails}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ObligationTypeCode#New
 * ObligationTypeCode.mmNew}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ObligationTypeCode#CorporateEvent
 * ObligationTypeCode.mmCorporateEvent}</li>
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
 * <li>"FAIL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ObligationTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of the obligation."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ObligationTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies that the obligation is related to a failed trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ObligationTypeCode
	 * ObligationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FAIL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Fails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that the obligation is related to a failed trade."</li>
	 * </ul>
	 */
	public static final ObligationTypeCode Fails = new ObligationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Fails";
			definition = "Specifies that the obligation is related to a failed trade.";
			owner_lazy = () -> com.tools20022.repository.codeset.ObligationTypeCode.mmObject();
			codeName = "FAIL";
		}
	};
	/**
	 * Specifies that the obligation is related to new a trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ObligationTypeCode
	 * ObligationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NEW1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "New"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies that the obligation is related to new a trade."</li>
	 * </ul>
	 */
	public static final ObligationTypeCode New = new ObligationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "New";
			definition = "Specifies that the obligation is related to new a trade.";
			owner_lazy = () -> com.tools20022.repository.codeset.ObligationTypeCode.mmObject();
			codeName = "NEW1";
		}
	};
	/**
	 * Specifies that the obligation is related to a corporate event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ObligationTypeCode
	 * ObligationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COEV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that the obligation is related to a corporate event."</li>
	 * </ul>
	 */
	public static final ObligationTypeCode CorporateEvent = new ObligationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateEvent";
			definition = "Specifies that the obligation is related to a corporate event.";
			owner_lazy = () -> com.tools20022.repository.codeset.ObligationTypeCode.mmObject();
			codeName = "COEV";
		}
	};
	final static private LinkedHashMap<String, ObligationTypeCode> codesByName = new LinkedHashMap<>();

	protected ObligationTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("FAIL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ObligationTypeCode";
				definition = "Specifies the type of the obligation.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ObligationTypeCode.Fails, com.tools20022.repository.codeset.ObligationTypeCode.New, com.tools20022.repository.codeset.ObligationTypeCode.CorporateEvent);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Fails.getCodeName().get(), Fails);
		codesByName.put(New.getCodeName().get(), New);
		codesByName.put(CorporateEvent.getCodeName().get(), CorporateEvent);
	}

	public static ObligationTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ObligationTypeCode[] values() {
		ObligationTypeCode[] values = new ObligationTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ObligationTypeCode> {
		@Override
		public ObligationTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ObligationTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}