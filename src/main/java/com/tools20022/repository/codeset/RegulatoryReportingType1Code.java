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
import com.tools20022.repository.codeset.RegulatoryReportingType1Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.RegulatoryReportingType1Code#Credit
 * RegulatoryReportingType1Code.mmCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RegulatoryReportingType1Code#Debit
 * RegulatoryReportingType1Code.mmDebit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RegulatoryReportingType1Code#Both
 * RegulatoryReportingType1Code.mmBoth}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.RegulatoryReportingTypeCode
 * RegulatoryReportingTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
 * "RegulatoryReportingType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies whether the regulatory reporting information applies to the debit side, to the credit side or to both debit and credit sides of the transaction."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RegulatoryReportingType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RegulatoryReportingType1Code
	 * RegulatoryReportingType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Credit"</li>
	 * </ul>
	 */
	public static final RegulatoryReportingType1Code Credit = new RegulatoryReportingType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Credit";
			owner_lazy = () -> com.tools20022.repository.codeset.RegulatoryReportingType1Code.mmObject();
			codeName = RegulatoryReportingTypeCode.Credit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RegulatoryReportingType1Code
	 * RegulatoryReportingType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Debit"</li>
	 * </ul>
	 */
	public static final RegulatoryReportingType1Code Debit = new RegulatoryReportingType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Debit";
			owner_lazy = () -> com.tools20022.repository.codeset.RegulatoryReportingType1Code.mmObject();
			codeName = RegulatoryReportingTypeCode.Debit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RegulatoryReportingType1Code
	 * RegulatoryReportingType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Both"</li>
	 * </ul>
	 */
	public static final RegulatoryReportingType1Code Both = new RegulatoryReportingType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Both";
			owner_lazy = () -> com.tools20022.repository.codeset.RegulatoryReportingType1Code.mmObject();
			codeName = RegulatoryReportingTypeCode.Both.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, RegulatoryReportingType1Code> codesByName = new LinkedHashMap<>();

	protected RegulatoryReportingType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("CRED");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RegulatoryReportingType1Code";
				definition = "Identifies whether the regulatory reporting information applies to the debit side, to the credit side or to both debit and credit sides of the transaction.";
				trace_lazy = () -> RegulatoryReportingTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RegulatoryReportingType1Code.Credit, com.tools20022.repository.codeset.RegulatoryReportingType1Code.Debit,
						com.tools20022.repository.codeset.RegulatoryReportingType1Code.Both);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Credit.getCodeName().get(), Credit);
		codesByName.put(Debit.getCodeName().get(), Debit);
		codesByName.put(Both.getCodeName().get(), Both);
	}

	public static RegulatoryReportingType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RegulatoryReportingType1Code[] values() {
		RegulatoryReportingType1Code[] values = new RegulatoryReportingType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RegulatoryReportingType1Code> {
		@Override
		public RegulatoryReportingType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RegulatoryReportingType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}