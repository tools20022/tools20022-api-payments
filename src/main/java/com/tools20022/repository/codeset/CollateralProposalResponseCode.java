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
import com.tools20022.repository.codeset.CollateralProposalResponseCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies if the collateral proposal response is an initial or a counter
 * proposal.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CollateralProposalResponseCode#InitialProposal
 * CollateralProposalResponseCode.InitialProposal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CollateralProposalResponseCode#CounterProposal
 * CollateralProposalResponseCode.CounterProposal}</li>
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
 * <li>"INPR"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CollateralProposalResponseCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies if the collateral proposal response is an initial or a counter proposal."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CollateralProposalResponseCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates that the collateral proposal response is an initial proposal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralProposalResponseCode
	 * CollateralProposalResponseCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INPR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InitialProposal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the collateral proposal response is an initial proposal."
	 * </li>
	 * </ul>
	 */
	public static final CollateralProposalResponseCode InitialProposal = new CollateralProposalResponseCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitialProposal";
			definition = "Indicates that the collateral proposal response is an initial proposal.";
			owner_lazy = () -> com.tools20022.repository.codeset.CollateralProposalResponseCode.mmObject();
			codeName = "INPR";
		}
	};
	/**
	 * Indicates that the collateral proposal response is a counter proposal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralProposalResponseCode
	 * CollateralProposalResponseCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COPR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterProposal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the collateral proposal response is a counter proposal."</li>
	 * </ul>
	 */
	public static final CollateralProposalResponseCode CounterProposal = new CollateralProposalResponseCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterProposal";
			definition = "Indicates that the collateral proposal response is a counter proposal.";
			owner_lazy = () -> com.tools20022.repository.codeset.CollateralProposalResponseCode.mmObject();
			codeName = "COPR";
		}
	};
	final static private LinkedHashMap<String, CollateralProposalResponseCode> codesByName = new LinkedHashMap<>();

	protected CollateralProposalResponseCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("INPR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CollateralProposalResponseCode";
				definition = "Specifies if the collateral proposal response is an initial or a counter proposal.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CollateralProposalResponseCode.InitialProposal, com.tools20022.repository.codeset.CollateralProposalResponseCode.CounterProposal);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(InitialProposal.getCodeName().get(), InitialProposal);
		codesByName.put(CounterProposal.getCodeName().get(), CounterProposal);
	}

	public static CollateralProposalResponseCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CollateralProposalResponseCode[] values() {
		CollateralProposalResponseCode[] values = new CollateralProposalResponseCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CollateralProposalResponseCode> {
		@Override
		public CollateralProposalResponseCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CollateralProposalResponseCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}