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
import com.tools20022.repository.codeset.DepositTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies whether the deposit is fixed term or call/notice.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.DepositTypeCode#FixedTerm
 * DepositTypeCode.mmFixedTerm}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DepositTypeCode#Call
 * DepositTypeCode.mmCall}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.DepositType1Code
 * DepositType1Code}</li>
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
 * <li>"FITE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DepositTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies whether the deposit is fixed term or call/notice."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DepositTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies that it is a fixed term deposit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DepositTypeCode
	 * DepositTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FITE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FixedTerm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies that it is a fixed term deposit."</li>
	 * </ul>
	 */
	public static final DepositTypeCode FixedTerm = new DepositTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FixedTerm";
			definition = "Specifies that it is a fixed term deposit.";
			owner_lazy = () -> com.tools20022.repository.codeset.DepositTypeCode.mmObject();
			codeName = "FITE";
		}
	};
	/**
	 * Specifies that it is a call/notice deposit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DepositTypeCode
	 * DepositTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CALL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Call"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies that it is a call/notice deposit."</li>
	 * </ul>
	 */
	public static final DepositTypeCode Call = new DepositTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Call";
			definition = "Specifies that it is a call/notice deposit.";
			owner_lazy = () -> com.tools20022.repository.codeset.DepositTypeCode.mmObject();
			codeName = "CALL";
		}
	};
	final static private LinkedHashMap<String, DepositTypeCode> codesByName = new LinkedHashMap<>();

	protected DepositTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("FITE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DepositTypeCode";
				definition = "Specifies whether the deposit is fixed term or call/notice.";
				derivation_lazy = () -> Arrays.asList(DepositType1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DepositTypeCode.FixedTerm, com.tools20022.repository.codeset.DepositTypeCode.Call);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(FixedTerm.getCodeName().get(), FixedTerm);
		codesByName.put(Call.getCodeName().get(), Call);
	}

	public static DepositTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DepositTypeCode[] values() {
		DepositTypeCode[] values = new DepositTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DepositTypeCode> {
		@Override
		public DepositTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DepositTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}