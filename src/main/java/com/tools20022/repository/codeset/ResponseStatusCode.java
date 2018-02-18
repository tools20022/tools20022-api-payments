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
import com.tools20022.repository.codeset.ResponseStatusCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the status of the received collateral message (collateral claim, a
 * collateral proposal or a proposal/request for collateral substitution) from a
 * collateral management perspective.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResponseStatusCode#PartlyAccepted
 * ResponseStatusCode.PartlyAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResponseStatusCode#Accepted
 * ResponseStatusCode.Accepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResponseStatusCode#Rejected
 * ResponseStatusCode.Rejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResponseStatusCode#SubstitutionAccepted
 * ResponseStatusCode.SubstitutionAccepted}</li>
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
 * <li>"ACCP"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ResponseStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the status of the received collateral message (collateral claim, a collateral proposal or a proposal/request for collateral substitution) from a collateral management perspective."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ResponseStatusCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Part of the collateral is accepted, a part rejected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResponseStatusCode
	 * ResponseStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACCP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartlyAccepted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Part of the collateral is accepted, a part rejected."</li>
	 * </ul>
	 */
	public static final ResponseStatusCode PartlyAccepted = new ResponseStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartlyAccepted";
			definition = "Part of the collateral is accepted, a part rejected.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResponseStatusCode.mmObject();
			codeName = "ACCP";
		}
	};
	/**
	 * Claim, substitution, proposal is fully accepted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResponseStatusCode
	 * ResponseStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACCT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Accepted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Claim, substitution, proposal is fully accepted."</li>
	 * </ul>
	 */
	public static final ResponseStatusCode Accepted = new ResponseStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Accepted";
			definition = "Claim, substitution, proposal is fully accepted.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResponseStatusCode.mmObject();
			codeName = "ACCT";
		}
	};
	/**
	 * Claim, substitution, proposal is fully rejected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResponseStatusCode
	 * ResponseStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REJT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rejected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Claim, substitution, proposal is fully rejected."</li>
	 * </ul>
	 */
	public static final ResponseStatusCode Rejected = new ResponseStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			definition = "Claim, substitution, proposal is fully rejected.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResponseStatusCode.mmObject();
			codeName = "REJT";
		}
	};
	/**
	 * Party A agrees with the return part of the substitution and accepts to
	 * wait for the proposal of the new collateral.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResponseStatusCode
	 * ResponseStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SUBR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubstitutionAccepted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party A agrees with the return part of the substitution and accepts to wait for the proposal of the new collateral."
	 * </li>
	 * </ul>
	 */
	public static final ResponseStatusCode SubstitutionAccepted = new ResponseStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubstitutionAccepted";
			definition = "Party A agrees with the return part of the substitution and accepts to wait for the proposal of the new collateral.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResponseStatusCode.mmObject();
			codeName = "SUBR";
		}
	};
	final static private LinkedHashMap<String, ResponseStatusCode> codesByName = new LinkedHashMap<>();

	protected ResponseStatusCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ACCP");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ResponseStatusCode";
				definition = "Specifies the status of the received collateral message (collateral claim, a collateral proposal or a proposal/request for collateral substitution) from a collateral management perspective.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ResponseStatusCode.PartlyAccepted, com.tools20022.repository.codeset.ResponseStatusCode.Accepted,
						com.tools20022.repository.codeset.ResponseStatusCode.Rejected, com.tools20022.repository.codeset.ResponseStatusCode.SubstitutionAccepted);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(PartlyAccepted.getCodeName().get(), PartlyAccepted);
		codesByName.put(Accepted.getCodeName().get(), Accepted);
		codesByName.put(Rejected.getCodeName().get(), Rejected);
		codesByName.put(SubstitutionAccepted.getCodeName().get(), SubstitutionAccepted);
	}

	public static ResponseStatusCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ResponseStatusCode[] values() {
		ResponseStatusCode[] values = new ResponseStatusCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ResponseStatusCode> {
		@Override
		public ResponseStatusCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ResponseStatusCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}