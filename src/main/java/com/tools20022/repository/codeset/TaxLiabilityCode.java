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
import com.tools20022.repository.codeset.TaxLiabilityCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the tax role capacity of the instructing party.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxLiabilityCode#TaxPrincipal
 * TaxLiabilityCode.TaxPrincipal}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxLiabilityCode#TaxAgent
 * TaxLiabilityCode.TaxAgent}</li>
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
 * <li>"PRIN"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TaxLiabilityCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the tax role capacity of the instructing party."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TaxLiabilityCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Settlement party is acting as a principal for tax liability.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxLiabilityCode
	 * TaxLiabilityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxPrincipal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement party is acting as a principal for tax liability."</li>
	 * </ul>
	 */
	public static final TaxLiabilityCode TaxPrincipal = new TaxLiabilityCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxPrincipal";
			definition = "Settlement party is acting as a principal for tax liability.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxLiabilityCode.mmObject();
			codeName = "PRIN";
		}
	};
	/**
	 * Settlement party is acting as an agent for tax liability.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxLiabilityCode
	 * TaxLiabilityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AGEN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement party is acting as an agent for tax liability."
	 * </li>
	 * </ul>
	 */
	public static final TaxLiabilityCode TaxAgent = new TaxLiabilityCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxAgent";
			definition = "Settlement party is acting as an agent for tax liability.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxLiabilityCode.mmObject();
			codeName = "AGEN";
		}
	};
	final static private LinkedHashMap<String, TaxLiabilityCode> codesByName = new LinkedHashMap<>();

	protected TaxLiabilityCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("PRIN");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TaxLiabilityCode";
				definition = "Specifies the tax role capacity of the instructing party.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TaxLiabilityCode.TaxPrincipal, com.tools20022.repository.codeset.TaxLiabilityCode.TaxAgent);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(TaxPrincipal.getCodeName().get(), TaxPrincipal);
		codesByName.put(TaxAgent.getCodeName().get(), TaxAgent);
	}

	public static TaxLiabilityCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TaxLiabilityCode[] values() {
		TaxLiabilityCode[] values = new TaxLiabilityCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TaxLiabilityCode> {
		@Override
		public TaxLiabilityCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TaxLiabilityCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}