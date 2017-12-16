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
import com.tools20022.repository.codeset.PreConfirmationCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies if there is a pre-confirmation of cash or securities.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PreConfirmationCode#PreConfirmCash
 * PreConfirmationCode.mmPreConfirmCash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PreConfirmationCode#PreConfirmSecurities
 * PreConfirmationCode.mmPreConfirmSecurities}</li>
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
 * <li>"PRCA"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PreConfirmationCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies if there is a pre-confirmation of cash or securities."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PreConfirmationCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Pre-confirmation of the movement of the cash, pending the movement of
	 * securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PreConfirmationCode
	 * PreConfirmationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRCA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreConfirmCash"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Pre-confirmation of the movement of the cash, pending the movement of securities."
	 * </li>
	 * </ul>
	 */
	public static final PreConfirmationCode PreConfirmCash = new PreConfirmationCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PreConfirmCash";
			definition = "Pre-confirmation of the movement of the cash, pending the movement of securities.";
			owner_lazy = () -> com.tools20022.repository.codeset.PreConfirmationCode.mmObject();
			codeName = "PRCA";
		}
	};
	/**
	 * Pre-confirmation of the movement of the securities, pending the movement
	 * of cash.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PreConfirmationCode
	 * PreConfirmationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRSE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreConfirmSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Pre-confirmation of the movement of the securities, pending the movement of cash."
	 * </li>
	 * </ul>
	 */
	public static final PreConfirmationCode PreConfirmSecurities = new PreConfirmationCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PreConfirmSecurities";
			definition = "Pre-confirmation of the movement of the securities, pending the movement of cash.";
			owner_lazy = () -> com.tools20022.repository.codeset.PreConfirmationCode.mmObject();
			codeName = "PRSE";
		}
	};
	final static private LinkedHashMap<String, PreConfirmationCode> codesByName = new LinkedHashMap<>();

	protected PreConfirmationCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("PRCA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PreConfirmationCode";
				definition = "Specifies if there is a pre-confirmation of cash or securities.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PreConfirmationCode.PreConfirmCash, com.tools20022.repository.codeset.PreConfirmationCode.PreConfirmSecurities);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(PreConfirmCash.getCodeName().get(), PreConfirmCash);
		codesByName.put(PreConfirmSecurities.getCodeName().get(), PreConfirmSecurities);
	}

	public static PreConfirmationCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PreConfirmationCode[] values() {
		PreConfirmationCode[] values = new PreConfirmationCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PreConfirmationCode> {
		@Override
		public PreConfirmationCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PreConfirmationCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}