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
import com.tools20022.repository.codeset.StandingInstructionTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of standing instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StandingInstructionTypeCode#CashDistribution
 * StandingInstructionTypeCode.mmCashDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StandingInstructionTypeCode#GrossNet
 * StandingInstructionTypeCode.mmGrossNet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StandingInstructionTypeCode#SecuritiesDistribution
 * StandingInstructionTypeCode.mmSecuritiesDistribution}</li>
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
 * <li>"CASH"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "StandingInstructionTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of standing instruction."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class StandingInstructionTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Standing instruction for a cash distribution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StandingInstructionTypeCode
	 * StandingInstructionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CASH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Standing instruction for a cash distribution."</li>
	 * </ul>
	 */
	public static final StandingInstructionTypeCode CashDistribution = new StandingInstructionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashDistribution";
			definition = "Standing instruction for a cash distribution.";
			owner_lazy = () -> com.tools20022.repository.codeset.StandingInstructionTypeCode.mmObject();
			codeName = "CASH";
		}
	};
	/**
	 * Standing instruction for the payment modality, gross or net.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StandingInstructionTypeCode
	 * StandingInstructionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PAYM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossNet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Standing instruction for the payment modality, gross or net."</li>
	 * </ul>
	 */
	public static final StandingInstructionTypeCode GrossNet = new StandingInstructionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GrossNet";
			definition = "Standing instruction for the payment modality, gross or net.";
			owner_lazy = () -> com.tools20022.repository.codeset.StandingInstructionTypeCode.mmObject();
			codeName = "PAYM";
		}
	};
	/**
	 * Standing instruction for a securities distribution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StandingInstructionTypeCode
	 * StandingInstructionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SECU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Standing instruction for a securities distribution."</li>
	 * </ul>
	 */
	public static final StandingInstructionTypeCode SecuritiesDistribution = new StandingInstructionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesDistribution";
			definition = "Standing instruction for a securities distribution.";
			owner_lazy = () -> com.tools20022.repository.codeset.StandingInstructionTypeCode.mmObject();
			codeName = "SECU";
		}
	};
	final static private LinkedHashMap<String, StandingInstructionTypeCode> codesByName = new LinkedHashMap<>();

	protected StandingInstructionTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("CASH");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StandingInstructionTypeCode";
				definition = "Specifies the type of standing instruction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.StandingInstructionTypeCode.CashDistribution, com.tools20022.repository.codeset.StandingInstructionTypeCode.GrossNet,
						com.tools20022.repository.codeset.StandingInstructionTypeCode.SecuritiesDistribution);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CashDistribution.getCodeName().get(), CashDistribution);
		codesByName.put(GrossNet.getCodeName().get(), GrossNet);
		codesByName.put(SecuritiesDistribution.getCodeName().get(), SecuritiesDistribution);
	}

	public static StandingInstructionTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static StandingInstructionTypeCode[] values() {
		StandingInstructionTypeCode[] values = new StandingInstructionTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, StandingInstructionTypeCode> {
		@Override
		public StandingInstructionTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(StandingInstructionTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}