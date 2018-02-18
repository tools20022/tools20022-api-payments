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
import com.tools20022.repository.codeset.SecuritiesPaymentStatusCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the state of payment of a security at a particular time.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesPaymentStatusCode#FullyPaid
 * SecuritiesPaymentStatusCode.FullyPaid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesPaymentStatusCode#NillPaid
 * SecuritiesPaymentStatusCode.NillPaid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesPaymentStatusCode#PartiallyPaid
 * SecuritiesPaymentStatusCode.PartiallyPaid}</li>
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
 * <li>"FULL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesPaymentStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the state of payment of a security at a particular time."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SecuritiesPaymentStatusCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Security is fully paid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesPaymentStatusCode
	 * SecuritiesPaymentStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FULL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullyPaid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security is fully paid."</li>
	 * </ul>
	 */
	public static final SecuritiesPaymentStatusCode FullyPaid = new SecuritiesPaymentStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FullyPaid";
			definition = "Security is fully paid.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesPaymentStatusCode.mmObject();
			codeName = "FULL";
		}
	};
	/**
	 * Security is nill paid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesPaymentStatusCode
	 * SecuritiesPaymentStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NILL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NillPaid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security is nill paid."</li>
	 * </ul>
	 */
	public static final SecuritiesPaymentStatusCode NillPaid = new SecuritiesPaymentStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NillPaid";
			definition = "Security is nill paid.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesPaymentStatusCode.mmObject();
			codeName = "NILL";
		}
	};
	/**
	 * Security is partially paid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesPaymentStatusCode
	 * SecuritiesPaymentStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PART"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartiallyPaid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security is partially paid."</li>
	 * </ul>
	 */
	public static final SecuritiesPaymentStatusCode PartiallyPaid = new SecuritiesPaymentStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartiallyPaid";
			definition = "Security is partially paid.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesPaymentStatusCode.mmObject();
			codeName = "PART";
		}
	};
	final static private LinkedHashMap<String, SecuritiesPaymentStatusCode> codesByName = new LinkedHashMap<>();

	protected SecuritiesPaymentStatusCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("FULL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesPaymentStatusCode";
				definition = "Specifies the state of payment of a security at a particular time.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SecuritiesPaymentStatusCode.FullyPaid, com.tools20022.repository.codeset.SecuritiesPaymentStatusCode.NillPaid,
						com.tools20022.repository.codeset.SecuritiesPaymentStatusCode.PartiallyPaid);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(FullyPaid.getCodeName().get(), FullyPaid);
		codesByName.put(NillPaid.getCodeName().get(), NillPaid);
		codesByName.put(PartiallyPaid.getCodeName().get(), PartiallyPaid);
	}

	public static SecuritiesPaymentStatusCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SecuritiesPaymentStatusCode[] values() {
		SecuritiesPaymentStatusCode[] values = new SecuritiesPaymentStatusCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SecuritiesPaymentStatusCode> {
		@Override
		public SecuritiesPaymentStatusCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SecuritiesPaymentStatusCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}