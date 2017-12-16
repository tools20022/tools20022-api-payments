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
import com.tools20022.repository.codeset.PartialSettlementCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Information about partial settlement.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartialSettlementCode#PartialSettlement
 * PartialSettlementCode.mmPartialSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartialSettlementCode#PreviouslyPartialConfirmed
 * PartialSettlementCode.mmPreviouslyPartialConfirmed}</li>
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
 * <li>"PAIN"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PartialSettlementCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information about partial settlement."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PartialSettlementCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Confirmation is for partial settlement. Part of the transaction remains
	 * unsettled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartialSettlementCode
	 * PartialSettlementCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PAIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Confirmation is for partial settlement. Part of the transaction remains unsettled."
	 * </li>
	 * </ul>
	 */
	public static final PartialSettlementCode PartialSettlement = new PartialSettlementCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartialSettlement";
			definition = "Confirmation is for partial settlement. Part of the transaction remains unsettled.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartialSettlementCode.mmObject();
			codeName = "PAIN";
		}
	};
	/**
	 * Confirmation is for the remaining part of an instruction that was
	 * previously partially confirmed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartialSettlementCode
	 * PartialSettlementCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PARC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviouslyPartialConfirmed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Confirmation is for the remaining part of an instruction that was previously partially confirmed."
	 * </li>
	 * </ul>
	 */
	public static final PartialSettlementCode PreviouslyPartialConfirmed = new PartialSettlementCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PreviouslyPartialConfirmed";
			definition = "Confirmation is for the remaining part of an instruction that was previously partially confirmed.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartialSettlementCode.mmObject();
			codeName = "PARC";
		}
	};
	final static private LinkedHashMap<String, PartialSettlementCode> codesByName = new LinkedHashMap<>();

	protected PartialSettlementCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("PAIN");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PartialSettlementCode";
				definition = "Information about partial settlement.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PartialSettlementCode.PartialSettlement, com.tools20022.repository.codeset.PartialSettlementCode.PreviouslyPartialConfirmed);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(PartialSettlement.getCodeName().get(), PartialSettlement);
		codesByName.put(PreviouslyPartialConfirmed.getCodeName().get(), PreviouslyPartialConfirmed);
	}

	public static PartialSettlementCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PartialSettlementCode[] values() {
		PartialSettlementCode[] values = new PartialSettlementCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PartialSettlementCode> {
		@Override
		public PartialSettlementCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PartialSettlementCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}