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
import com.tools20022.repository.codeset.SecuritiesSettlementStatusCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Provides the status of settlement of an instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesSettlementStatusCode#Pending
 * SecuritiesSettlementStatusCode.mmPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesSettlementStatusCode#Failing
 * SecuritiesSettlementStatusCode.mmFailing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesSettlementStatusCode#Unsettled
 * SecuritiesSettlementStatusCode.mmUnsettled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesSettlementStatusCode#PartialSettlement
 * SecuritiesSettlementStatusCode.mmPartialSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesSettlementStatusCode#Settled
 * SecuritiesSettlementStatusCode.mmSettled}</li>
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
 * <li>"PEND"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesSettlementStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides the status of settlement of an instruction."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SecuritiesSettlementStatusCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Instruction is pending. Settlement at the instructed settlement date is
	 * still possible.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesSettlementStatusCode
	 * SecuritiesSettlementStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PEND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pending"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction is pending. Settlement at the instructed settlement date is still possible."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesSettlementStatusCode Pending = new SecuritiesSettlementStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pending";
			definition = "Instruction is pending. Settlement at the instructed settlement date is still possible.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesSettlementStatusCode.mmObject();
			codeName = "PEND";
		}
	};
	/**
	 * Instruction is failing. Settlement at the instructed settlement date is
	 * no longer possible.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesSettlementStatusCode
	 * SecuritiesSettlementStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PENF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Failing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction is failing. Settlement at the instructed settlement date is no longer possible."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesSettlementStatusCode Failing = new SecuritiesSettlementStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Failing";
			definition = "Instruction is failing. Settlement at the instructed settlement date is no longer possible.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesSettlementStatusCode.mmObject();
			codeName = "PENF";
		}
	};
	/**
	 * Instruction is unsettled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesSettlementStatusCode
	 * SecuritiesSettlementStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "USET"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unsettled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction is unsettled."</li>
	 * </ul>
	 */
	public static final SecuritiesSettlementStatusCode Unsettled = new SecuritiesSettlementStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unsettled";
			definition = "Instruction is unsettled.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesSettlementStatusCode.mmObject();
			codeName = "USET";
		}
	};
	/**
	 * Part of the instruction remains unsettled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesSettlementStatusCode
	 * SecuritiesSettlementStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PAIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Part of the instruction remains unsettled."</li>
	 * </ul>
	 */
	public static final SecuritiesSettlementStatusCode PartialSettlement = new SecuritiesSettlementStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialSettlement";
			definition = "Part of the instruction remains unsettled.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesSettlementStatusCode.mmObject();
			codeName = "PAIN";
		}
	};
	/**
	 * Full settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesSettlementStatusCode
	 * SecuritiesSettlementStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SETT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Settled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Full settlement."</li>
	 * </ul>
	 */
	public static final SecuritiesSettlementStatusCode Settled = new SecuritiesSettlementStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Settled";
			definition = "Full settlement.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesSettlementStatusCode.mmObject();
			codeName = "SETT";
		}
	};
	final static private LinkedHashMap<String, SecuritiesSettlementStatusCode> codesByName = new LinkedHashMap<>();

	protected SecuritiesSettlementStatusCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("PEND");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesSettlementStatusCode";
				definition = "Provides the status of settlement of an instruction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SecuritiesSettlementStatusCode.Pending, com.tools20022.repository.codeset.SecuritiesSettlementStatusCode.Failing,
						com.tools20022.repository.codeset.SecuritiesSettlementStatusCode.Unsettled, com.tools20022.repository.codeset.SecuritiesSettlementStatusCode.PartialSettlement,
						com.tools20022.repository.codeset.SecuritiesSettlementStatusCode.Settled);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Pending.getCodeName().get(), Pending);
		codesByName.put(Failing.getCodeName().get(), Failing);
		codesByName.put(Unsettled.getCodeName().get(), Unsettled);
		codesByName.put(PartialSettlement.getCodeName().get(), PartialSettlement);
		codesByName.put(Settled.getCodeName().get(), Settled);
	}

	public static SecuritiesSettlementStatusCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SecuritiesSettlementStatusCode[] values() {
		SecuritiesSettlementStatusCode[] values = new SecuritiesSettlementStatusCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SecuritiesSettlementStatusCode> {
		@Override
		public SecuritiesSettlementStatusCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SecuritiesSettlementStatusCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}