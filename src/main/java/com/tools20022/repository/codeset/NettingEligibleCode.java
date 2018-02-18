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
import com.tools20022.repository.codeset.NettingEligibleCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies whether the trade is eligible for netting.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.NettingEligibleCode#Gross
 * NettingEligibleCode.Gross}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.NettingEligibleCode#Nett
 * NettingEligibleCode.Nett}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NettingEligibleCode#AggregationForSettlement
 * NettingEligibleCode.AggregationForSettlement}</li>
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
 * <li>"GROS"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "NettingEligibleCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies whether the trade is eligible for netting."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class NettingEligibleCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates that the trade is not eligible for settlement netting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NettingEligibleCode
	 * NettingEligibleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GROS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Gross"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the trade is not eligible for settlement netting."</li>
	 * </ul>
	 */
	public static final NettingEligibleCode Gross = new NettingEligibleCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Gross";
			definition = "Indicates that the trade is not eligible for settlement netting.";
			owner_lazy = () -> com.tools20022.repository.codeset.NettingEligibleCode.mmObject();
			codeName = "GROS";
		}
	};
	/**
	 * Indicates that the trade is eligible for settlement netting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NettingEligibleCode
	 * NettingEligibleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NETT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Nett"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the trade is eligible for settlement netting."</li>
	 * </ul>
	 */
	public static final NettingEligibleCode Nett = new NettingEligibleCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Nett";
			definition = "Indicates that the trade is eligible for settlement netting.";
			owner_lazy = () -> com.tools20022.repository.codeset.NettingEligibleCode.mmObject();
			codeName = "NETT";
		}
	};
	/**
	 * Grouping of receipts/purchases to create one settlement obligation, and
	 * the grouping of deliveries/sales to create one settlement obligation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NettingEligibleCode
	 * NettingEligibleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AGFS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AggregationForSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Grouping of receipts/purchases to create one settlement obligation, and the grouping of deliveries/sales to create one settlement obligation."
	 * </li>
	 * </ul>
	 */
	public static final NettingEligibleCode AggregationForSettlement = new NettingEligibleCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AggregationForSettlement";
			definition = "Grouping of receipts/purchases to create one settlement obligation, and the grouping of deliveries/sales to create one settlement obligation.";
			owner_lazy = () -> com.tools20022.repository.codeset.NettingEligibleCode.mmObject();
			codeName = "AGFS";
		}
	};
	final static private LinkedHashMap<String, NettingEligibleCode> codesByName = new LinkedHashMap<>();

	protected NettingEligibleCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("GROS");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NettingEligibleCode";
				definition = "Specifies whether the trade is eligible for netting.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.NettingEligibleCode.Gross, com.tools20022.repository.codeset.NettingEligibleCode.Nett,
						com.tools20022.repository.codeset.NettingEligibleCode.AggregationForSettlement);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Gross.getCodeName().get(), Gross);
		codesByName.put(Nett.getCodeName().get(), Nett);
		codesByName.put(AggregationForSettlement.getCodeName().get(), AggregationForSettlement);
	}

	public static NettingEligibleCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static NettingEligibleCode[] values() {
		NettingEligibleCode[] values = new NettingEligibleCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, NettingEligibleCode> {
		@Override
		public NettingEligibleCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(NettingEligibleCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}