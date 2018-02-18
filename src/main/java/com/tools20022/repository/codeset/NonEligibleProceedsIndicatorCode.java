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
import com.tools20022.repository.codeset.NonEligibleProceedsIndicatorCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies information regarding the non eligibility of the outturn resources.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NonEligibleProceedsIndicatorCode#NonEligibleSecurity
 * NonEligibleProceedsIndicatorCode.NonEligibleSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NonEligibleProceedsIndicatorCode#NonEligibleCurrency
 * NonEligibleProceedsIndicatorCode.NonEligibleCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NonEligibleProceedsIndicatorCode#AccountLimitation
 * NonEligibleProceedsIndicatorCode.AccountLimitation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NonEligibleProceedsIndicatorCode#OtherNonEligibility
 * NonEligibleProceedsIndicatorCode.OtherNonEligibility}</li>
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
 * <li>"NELS"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "NonEligibleProceedsIndicatorCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies information regarding the non eligibility of the outturn resources."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class NonEligibleProceedsIndicatorCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Security not eligible in the Central Securities Depository (CSD).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NonEligibleProceedsIndicatorCode
	 * NonEligibleProceedsIndicatorCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NELS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonEligibleSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Security not eligible in the Central Securities Depository (CSD)."</li>
	 * </ul>
	 */
	public static final NonEligibleProceedsIndicatorCode NonEligibleSecurity = new NonEligibleProceedsIndicatorCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NonEligibleSecurity";
			definition = "Security not eligible in the Central Securities Depository (CSD).";
			owner_lazy = () -> com.tools20022.repository.codeset.NonEligibleProceedsIndicatorCode.mmObject();
			codeName = "NELS";
		}
	};
	/**
	 * Currency not eligible for settlement in the Central Securities Depository
	 * (CSD).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NonEligibleProceedsIndicatorCode
	 * NonEligibleProceedsIndicatorCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NELC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonEligibleCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency not eligible for settlement in the Central Securities Depository (CSD)."
	 * </li>
	 * </ul>
	 */
	public static final NonEligibleProceedsIndicatorCode NonEligibleCurrency = new NonEligibleProceedsIndicatorCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NonEligibleCurrency";
			definition = "Currency not eligible for settlement in the Central Securities Depository (CSD).";
			owner_lazy = () -> com.tools20022.repository.codeset.NonEligibleProceedsIndicatorCode.mmObject();
			codeName = "NELC";
		}
	};
	/**
	 * Participant's account limitation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NonEligibleProceedsIndicatorCode
	 * NonEligibleProceedsIndicatorCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACLI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountLimitation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Participant's account limitation."</li>
	 * </ul>
	 */
	public static final NonEligibleProceedsIndicatorCode AccountLimitation = new NonEligibleProceedsIndicatorCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccountLimitation";
			definition = "Participant's account limitation.";
			owner_lazy = () -> com.tools20022.repository.codeset.NonEligibleProceedsIndicatorCode.mmObject();
			codeName = "ACLI";
		}
	};
	/**
	 * Other source of non eligibility.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NonEligibleProceedsIndicatorCode
	 * NonEligibleProceedsIndicatorCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ONEL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherNonEligibility"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other source of non eligibility."</li>
	 * </ul>
	 */
	public static final NonEligibleProceedsIndicatorCode OtherNonEligibility = new NonEligibleProceedsIndicatorCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OtherNonEligibility";
			definition = "Other source of non eligibility.";
			owner_lazy = () -> com.tools20022.repository.codeset.NonEligibleProceedsIndicatorCode.mmObject();
			codeName = "ONEL";
		}
	};
	final static private LinkedHashMap<String, NonEligibleProceedsIndicatorCode> codesByName = new LinkedHashMap<>();

	protected NonEligibleProceedsIndicatorCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("NELS");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NonEligibleProceedsIndicatorCode";
				definition = "Specifies information regarding the non eligibility of the outturn resources.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.NonEligibleProceedsIndicatorCode.NonEligibleSecurity, com.tools20022.repository.codeset.NonEligibleProceedsIndicatorCode.NonEligibleCurrency,
						com.tools20022.repository.codeset.NonEligibleProceedsIndicatorCode.AccountLimitation, com.tools20022.repository.codeset.NonEligibleProceedsIndicatorCode.OtherNonEligibility);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(NonEligibleSecurity.getCodeName().get(), NonEligibleSecurity);
		codesByName.put(NonEligibleCurrency.getCodeName().get(), NonEligibleCurrency);
		codesByName.put(AccountLimitation.getCodeName().get(), AccountLimitation);
		codesByName.put(OtherNonEligibility.getCodeName().get(), OtherNonEligibility);
	}

	public static NonEligibleProceedsIndicatorCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static NonEligibleProceedsIndicatorCode[] values() {
		NonEligibleProceedsIndicatorCode[] values = new NonEligibleProceedsIndicatorCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, NonEligibleProceedsIndicatorCode> {
		@Override
		public NonEligibleProceedsIndicatorCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(NonEligibleProceedsIndicatorCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}