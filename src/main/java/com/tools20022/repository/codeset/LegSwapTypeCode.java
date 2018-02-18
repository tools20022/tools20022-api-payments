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
import com.tools20022.repository.codeset.LegSwapTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates the type of leg structuring a swap.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.LegSwapTypeCode#ParForPar
 * LegSwapTypeCode.ParForPar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LegSwapTypeCode#ModifiedDuration
 * LegSwapTypeCode.ModifiedDuration}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.LegSwapTypeCode#Risk
 * LegSwapTypeCode.Risk}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.LegSwapTypeCode#Proceeds
 * LegSwapTypeCode.Proceeds}</li>
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
 * <li>"PFPR"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "LegSwapTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Indicates the type of leg structuring a swap."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class LegSwapTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Type of leg involved in a swap whose purpose is to exchange principal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LegSwapTypeCode
	 * LegSwapTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PFPR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParForPar"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of leg involved in a swap whose purpose is to exchange principal."</li>
	 * </ul>
	 */
	public static final LegSwapTypeCode ParForPar = new LegSwapTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParForPar";
			definition = "Type of leg involved in a swap whose purpose is to exchange principal.";
			owner_lazy = () -> com.tools20022.repository.codeset.LegSwapTypeCode.mmObject();
			codeName = "PFPR";
		}
	};
	/**
	 * Type of leg involved in a swap whose purpose is to exchange price
	 * volatility.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LegSwapTypeCode
	 * LegSwapTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MODU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModifiedDuration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of leg involved in a swap whose purpose is to exchange price volatility."
	 * </li>
	 * </ul>
	 */
	public static final LegSwapTypeCode ModifiedDuration = new LegSwapTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModifiedDuration";
			definition = "Type of leg involved in a swap whose purpose is to exchange price volatility.";
			owner_lazy = () -> com.tools20022.repository.codeset.LegSwapTypeCode.mmObject();
			codeName = "MODU";
		}
	};
	/**
	 * Type of leg involved in a swap whose purpose is to increase the credit
	 * quality and reduce the default risk. Also known as quality swap.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LegSwapTypeCode
	 * LegSwapTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RISK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Risk"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of leg involved in a swap whose purpose is to increase the credit quality and reduce the default risk. Also known as quality swap."
	 * </li>
	 * </ul>
	 */
	public static final LegSwapTypeCode Risk = new LegSwapTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Risk";
			definition = "Type of leg involved in a swap whose purpose is to increase the credit quality and reduce the default risk. Also known as quality swap.";
			owner_lazy = () -> com.tools20022.repository.codeset.LegSwapTypeCode.mmObject();
			codeName = "RISK";
		}
	};
	/**
	 * Type of leg involved in a swap structured in the sale of a financial
	 * instrument and the simultaneous purchase of another instrument with the
	 * proceeds from the sale.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LegSwapTypeCode
	 * LegSwapTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRCD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proceeds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of leg involved in a swap structured in the sale of a financial instrument and the simultaneous purchase of another instrument with the proceeds from the sale."
	 * </li>
	 * </ul>
	 */
	public static final LegSwapTypeCode Proceeds = new LegSwapTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proceeds";
			definition = "Type of leg involved in a swap structured in the sale of a financial instrument and the simultaneous purchase of another instrument with the proceeds from the sale.";
			owner_lazy = () -> com.tools20022.repository.codeset.LegSwapTypeCode.mmObject();
			codeName = "PRCD";
		}
	};
	final static private LinkedHashMap<String, LegSwapTypeCode> codesByName = new LinkedHashMap<>();

	protected LegSwapTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("PFPR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "LegSwapTypeCode";
				definition = "Indicates the type of leg structuring a swap.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.LegSwapTypeCode.ParForPar, com.tools20022.repository.codeset.LegSwapTypeCode.ModifiedDuration, com.tools20022.repository.codeset.LegSwapTypeCode.Risk,
						com.tools20022.repository.codeset.LegSwapTypeCode.Proceeds);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ParForPar.getCodeName().get(), ParForPar);
		codesByName.put(ModifiedDuration.getCodeName().get(), ModifiedDuration);
		codesByName.put(Risk.getCodeName().get(), Risk);
		codesByName.put(Proceeds.getCodeName().get(), Proceeds);
	}

	public static LegSwapTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static LegSwapTypeCode[] values() {
		LegSwapTypeCode[] values = new LegSwapTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, LegSwapTypeCode> {
		@Override
		public LegSwapTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(LegSwapTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}