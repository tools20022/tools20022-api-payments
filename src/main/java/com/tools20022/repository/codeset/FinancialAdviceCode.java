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
import com.tools20022.repository.codeset.FinancialAdviceCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies if advice has been received from an independent financial advisor.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAdviceCode#Received
 * FinancialAdviceCode.Received}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAdviceCode#NotReceived
 * FinancialAdviceCode.NotReceived}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAdviceCode#Unknown
 * FinancialAdviceCode.Unknown}</li>
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
 * <li>"RECE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FinancialAdviceCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies if advice has been received from an independent financial advisor."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class FinancialAdviceCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Advice has been received from an independent financial advisor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAdviceCode
	 * FinancialAdviceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RECE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Received"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Advice has been received from an independent financial advisor."</li>
	 * </ul>
	 */
	public static final FinancialAdviceCode Received = new FinancialAdviceCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Received";
			definition = "Advice has been received from an independent financial advisor.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAdviceCode.mmObject();
			codeName = "RECE";
		}
	};
	/**
	 * Advice has not been received from an independent financial advisor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAdviceCode
	 * FinancialAdviceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NREC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotReceived"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Advice has not been received from an independent financial advisor."</li>
	 * </ul>
	 */
	public static final FinancialAdviceCode NotReceived = new FinancialAdviceCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotReceived";
			definition = "Advice has not been received from an independent financial advisor.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAdviceCode.mmObject();
			codeName = "NREC";
		}
	};
	/**
	 * It is not known whether or not advice has been received from an
	 * independent financial advisor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAdviceCode
	 * FinancialAdviceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UKWN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unknown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is not known whether or not advice has been received from an independent financial advisor."
	 * </li>
	 * </ul>
	 */
	public static final FinancialAdviceCode Unknown = new FinancialAdviceCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Unknown";
			definition = "It is not known whether or not advice has been received from an independent financial advisor.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAdviceCode.mmObject();
			codeName = "UKWN";
		}
	};
	final static private LinkedHashMap<String, FinancialAdviceCode> codesByName = new LinkedHashMap<>();

	protected FinancialAdviceCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("RECE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancialAdviceCode";
				definition = "Specifies if advice has been received from an independent financial advisor.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FinancialAdviceCode.Received, com.tools20022.repository.codeset.FinancialAdviceCode.NotReceived,
						com.tools20022.repository.codeset.FinancialAdviceCode.Unknown);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Received.getCodeName().get(), Received);
		codesByName.put(NotReceived.getCodeName().get(), NotReceived);
		codesByName.put(Unknown.getCodeName().get(), Unknown);
	}

	public static FinancialAdviceCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static FinancialAdviceCode[] values() {
		FinancialAdviceCode[] values = new FinancialAdviceCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, FinancialAdviceCode> {
		@Override
		public FinancialAdviceCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(FinancialAdviceCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}