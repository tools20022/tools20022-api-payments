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
import com.tools20022.repository.codeset.RegulatoryReportingTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Identifies whether the regulatory reporting information applies to the debit
 * side, to the credit side or to both debit and credit sides of the
 * transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RegulatoryReportingTypeCode#Credit
 * RegulatoryReportingTypeCode.Credit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RegulatoryReportingTypeCode#Debit
 * RegulatoryReportingTypeCode.Debit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RegulatoryReportingTypeCode#Both
 * RegulatoryReportingTypeCode.Both}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RegulatoryReportingType1Code
 * RegulatoryReportingType1Code}</li>
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
 * <li>"CRED"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RegulatoryReportingTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies whether the regulatory reporting information applies to the debit side, to the credit side or to both debit and credit sides of the transaction."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RegulatoryReportingTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Regulatory information applies to the credit side.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RegulatoryReportingTypeCode
	 * RegulatoryReportingTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRED"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Credit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Regulatory information applies to the credit side."</li>
	 * </ul>
	 */
	public static final RegulatoryReportingTypeCode Credit = new RegulatoryReportingTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Credit";
			definition = "Regulatory information applies to the credit side.";
			owner_lazy = () -> com.tools20022.repository.codeset.RegulatoryReportingTypeCode.mmObject();
			codeName = "CRED";
		}
	};
	/**
	 * Regulatory information applies to the debit side.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RegulatoryReportingTypeCode
	 * RegulatoryReportingTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DEBT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Debit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Regulatory information applies to the debit side."</li>
	 * </ul>
	 */
	public static final RegulatoryReportingTypeCode Debit = new RegulatoryReportingTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Debit";
			definition = "Regulatory information applies to the debit side.";
			owner_lazy = () -> com.tools20022.repository.codeset.RegulatoryReportingTypeCode.mmObject();
			codeName = "DEBT";
		}
	};
	/**
	 * Regulatory information applies to both credit and debit sides.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RegulatoryReportingTypeCode
	 * RegulatoryReportingTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BOTH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Both"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Regulatory information applies to both credit and debit sides."</li>
	 * </ul>
	 */
	public static final RegulatoryReportingTypeCode Both = new RegulatoryReportingTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Both";
			definition = "Regulatory information applies to both credit and debit sides.";
			owner_lazy = () -> com.tools20022.repository.codeset.RegulatoryReportingTypeCode.mmObject();
			codeName = "BOTH";
		}
	};
	final static private LinkedHashMap<String, RegulatoryReportingTypeCode> codesByName = new LinkedHashMap<>();

	protected RegulatoryReportingTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CRED");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RegulatoryReportingTypeCode";
				definition = "Identifies whether the regulatory reporting information applies to the debit side, to the credit side or to both debit and credit sides of the transaction.";
				derivation_lazy = () -> Arrays.asList(RegulatoryReportingType1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RegulatoryReportingTypeCode.Credit, com.tools20022.repository.codeset.RegulatoryReportingTypeCode.Debit,
						com.tools20022.repository.codeset.RegulatoryReportingTypeCode.Both);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Credit.getCodeName().get(), Credit);
		codesByName.put(Debit.getCodeName().get(), Debit);
		codesByName.put(Both.getCodeName().get(), Both);
	}

	public static RegulatoryReportingTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RegulatoryReportingTypeCode[] values() {
		RegulatoryReportingTypeCode[] values = new RegulatoryReportingTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RegulatoryReportingTypeCode> {
		@Override
		public RegulatoryReportingTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RegulatoryReportingTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}