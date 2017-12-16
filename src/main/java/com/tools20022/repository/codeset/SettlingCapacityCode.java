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
import com.tools20022.repository.codeset.SettlingCapacityCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the role of the party in the settlement of the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlingCapacityCode#SettlingCustodian
 * SettlingCapacityCode.mmSettlingCustodian}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlingCapacityCode#SettlingAgent
 * SettlingCapacityCode.mmSettlingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlingCapacityCode#SettlingPrincipal
 * SettlingCapacityCode.mmSettlingPrincipal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlingCapacityCode#SettlingRisklessPrincipal
 * SettlingCapacityCode.mmSettlingRisklessPrincipal}</li>
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
 * <li>"CUST"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SettlingCapacityCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the role of the party in the settlement of the transaction."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SettlingCapacityCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Settlement party is a custodian. It receives/delivers the securities and
	 * carries out custodial duties.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlingCapacityCode
	 * SettlingCapacityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CUST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlingCustodian"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement party is a custodian. It receives/delivers the securities and carries out custodial duties."
	 * </li>
	 * </ul>
	 */
	public static final SettlingCapacityCode SettlingCustodian = new SettlingCapacityCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlingCustodian";
			definition = "Settlement party is a custodian. It receives/delivers the securities and carries out custodial duties.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlingCapacityCode.mmObject();
			codeName = "CUST";
		}
	};
	/**
	 * Settlement party is trading and settling transactions in financial
	 * instruments on behalf of its client(s).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlingCapacityCode
	 * SettlingCapacityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SAGE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlingAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement party is trading and settling transactions in financial instruments on behalf of its client(s)."
	 * </li>
	 * </ul>
	 */
	public static final SettlingCapacityCode SettlingAgent = new SettlingCapacityCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlingAgent";
			definition = "Settlement party is trading and settling transactions in financial instruments on behalf of its client(s).";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlingCapacityCode.mmObject();
			codeName = "SAGE";
		}
	};
	/**
	 * Settlement party is settling its own trades.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlingCapacityCode
	 * SettlingCapacityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPRI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlingPrincipal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement party is settling its own trades."</li>
	 * </ul>
	 */
	public static final SettlingCapacityCode SettlingPrincipal = new SettlingCapacityCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlingPrincipal";
			definition = "Settlement party is settling its own trades.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlingCapacityCode.mmObject();
			codeName = "SPRI";
		}
	};
	/**
	 * Party settles trades that were simultaneously offset.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlingCapacityCode
	 * SettlingCapacityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RISP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlingRisklessPrincipal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party settles trades that were simultaneously offset."</li>
	 * </ul>
	 */
	public static final SettlingCapacityCode SettlingRisklessPrincipal = new SettlingCapacityCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlingRisklessPrincipal";
			definition = "Party settles trades that were simultaneously offset.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlingCapacityCode.mmObject();
			codeName = "RISP";
		}
	};
	final static private LinkedHashMap<String, SettlingCapacityCode> codesByName = new LinkedHashMap<>();

	protected SettlingCapacityCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("CUST");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SettlingCapacityCode";
				definition = "Specifies the role of the party in the settlement of the transaction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SettlingCapacityCode.SettlingCustodian, com.tools20022.repository.codeset.SettlingCapacityCode.SettlingAgent,
						com.tools20022.repository.codeset.SettlingCapacityCode.SettlingPrincipal, com.tools20022.repository.codeset.SettlingCapacityCode.SettlingRisklessPrincipal);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(SettlingCustodian.getCodeName().get(), SettlingCustodian);
		codesByName.put(SettlingAgent.getCodeName().get(), SettlingAgent);
		codesByName.put(SettlingPrincipal.getCodeName().get(), SettlingPrincipal);
		codesByName.put(SettlingRisklessPrincipal.getCodeName().get(), SettlingRisklessPrincipal);
	}

	public static SettlingCapacityCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SettlingCapacityCode[] values() {
		SettlingCapacityCode[] values = new SettlingCapacityCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SettlingCapacityCode> {
		@Override
		public SettlingCapacityCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SettlingCapacityCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}