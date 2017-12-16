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
import com.tools20022.repository.codeset.AdditionalRightCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Define specific rights that the shareholder has (for example, the right to
 * ask questions, the right to add items to the agenda or table draft
 * resolutions).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalRightCode#WrittenQuestionProposal
 * AdditionalRightCode.mmWrittenQuestionProposal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalRightCode#ResolutionProposal
 * AdditionalRightCode.mmResolutionProposal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalRightCode#AgendaItemProposal
 * AdditionalRightCode.mmAgendaItemProposal}</li>
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
 * <li>"WQPS"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AdditionalRightCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Define specific rights that the shareholder has (for example, the right to ask questions, the right to add items to the agenda or table draft resolutions)."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AdditionalRightCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Defines a written question proposal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalRightCode
	 * AdditionalRightCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WQPS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WrittenQuestionProposal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines a written question proposal."</li>
	 * </ul>
	 */
	public static final AdditionalRightCode WrittenQuestionProposal = new AdditionalRightCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WrittenQuestionProposal";
			definition = "Defines a written question proposal.";
			owner_lazy = () -> com.tools20022.repository.codeset.AdditionalRightCode.mmObject();
			codeName = "WQPS";
		}
	};
	/**
	 * Defines a resolution proposal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalRightCode
	 * AdditionalRightCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RSPS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResolutionProposal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines a resolution proposal."</li>
	 * </ul>
	 */
	public static final AdditionalRightCode ResolutionProposal = new AdditionalRightCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ResolutionProposal";
			definition = "Defines a resolution proposal.";
			owner_lazy = () -> com.tools20022.repository.codeset.AdditionalRightCode.mmObject();
			codeName = "RSPS";
		}
	};
	/**
	 * Defines a resolution proposal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalRightCode
	 * AdditionalRightCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AIPS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgendaItemProposal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines a resolution proposal."</li>
	 * </ul>
	 */
	public static final AdditionalRightCode AgendaItemProposal = new AdditionalRightCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AgendaItemProposal";
			definition = "Defines a resolution proposal.";
			owner_lazy = () -> com.tools20022.repository.codeset.AdditionalRightCode.mmObject();
			codeName = "AIPS";
		}
	};
	final static private LinkedHashMap<String, AdditionalRightCode> codesByName = new LinkedHashMap<>();

	protected AdditionalRightCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("WQPS");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AdditionalRightCode";
				definition = "Define specific rights that the shareholder has (for example, the right to ask questions, the right to add items to the agenda or table draft resolutions).";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AdditionalRightCode.WrittenQuestionProposal, com.tools20022.repository.codeset.AdditionalRightCode.ResolutionProposal,
						com.tools20022.repository.codeset.AdditionalRightCode.AgendaItemProposal);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(WrittenQuestionProposal.getCodeName().get(), WrittenQuestionProposal);
		codesByName.put(ResolutionProposal.getCodeName().get(), ResolutionProposal);
		codesByName.put(AgendaItemProposal.getCodeName().get(), AgendaItemProposal);
	}

	public static AdditionalRightCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AdditionalRightCode[] values() {
		AdditionalRightCode[] values = new AdditionalRightCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AdditionalRightCode> {
		@Override
		public AdditionalRightCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AdditionalRightCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}