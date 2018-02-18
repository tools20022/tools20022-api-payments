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
import com.tools20022.repository.codeset.OptionAvailabilityStatusCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the status of the option availability.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionAvailabilityStatusCode#Inactive
 * OptionAvailabilityStatusCode.Inactive}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionAvailabilityStatusCode#Cancelled
 * OptionAvailabilityStatusCode.Cancelled}</li>
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
 * <li>"INTV"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OptionAvailabilityStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the status of the option availability."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class OptionAvailabilityStatusCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Option is not active and can no longer be responded to. Any responses
	 * already processed against this option will remain valid, for example,
	 * expired option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionAvailabilityStatusCode
	 * OptionAvailabilityStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INTV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Inactive"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Option is not active and can no longer be responded to. Any responses already processed against this option will remain valid, for example, expired option."
	 * </li>
	 * </ul>
	 */
	public static final OptionAvailabilityStatusCode Inactive = new OptionAvailabilityStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Inactive";
			definition = "Option is not active and can no longer be responded to. Any responses already processed against this option will remain valid, for example, expired option.";
			owner_lazy = () -> com.tools20022.repository.codeset.OptionAvailabilityStatusCode.mmObject();
			codeName = "INTV";
		}
	};
	/**
	 * Option is not valid; it has been cancelled by the market or service
	 * provider, and cannot be responded to. Any responses already processed
	 * against this option are considered void and new responses will be
	 * required.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionAvailabilityStatusCode
	 * OptionAvailabilityStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CANC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cancelled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Option is not valid; it has been cancelled by the market or service provider, and cannot be responded to. Any responses already processed against this option are considered void and new responses will be required."
	 * </li>
	 * </ul>
	 */
	public static final OptionAvailabilityStatusCode Cancelled = new OptionAvailabilityStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Cancelled";
			definition = "Option is not valid; it has been cancelled by the market or service provider, and cannot be responded to. Any responses already processed against this option are considered void and new responses will be required.";
			owner_lazy = () -> com.tools20022.repository.codeset.OptionAvailabilityStatusCode.mmObject();
			codeName = "CANC";
		}
	};
	final static private LinkedHashMap<String, OptionAvailabilityStatusCode> codesByName = new LinkedHashMap<>();

	protected OptionAvailabilityStatusCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("INTV");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OptionAvailabilityStatusCode";
				definition = "Specifies the status of the option availability.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OptionAvailabilityStatusCode.Inactive, com.tools20022.repository.codeset.OptionAvailabilityStatusCode.Cancelled);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Inactive.getCodeName().get(), Inactive);
		codesByName.put(Cancelled.getCodeName().get(), Cancelled);
	}

	public static OptionAvailabilityStatusCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static OptionAvailabilityStatusCode[] values() {
		OptionAvailabilityStatusCode[] values = new OptionAvailabilityStatusCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, OptionAvailabilityStatusCode> {
		@Override
		public OptionAvailabilityStatusCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(OptionAvailabilityStatusCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}