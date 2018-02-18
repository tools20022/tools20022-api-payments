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
import com.tools20022.repository.codeset.CSCResultCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Result of the printed CSC (Card Security Code) validation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.CSCResultCode#CSCMatch
 * CSCResultCode.CSCMatch}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CSCResultCode#CSCNoMatch
 * CSCResultCode.CSCNoMatch}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CSCResultCode#CSCTechnical
 * CSCResultCode.CSCTechnical}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CSCResultCode#CSCNotTechnical
 * CSCResultCode.CSCNotTechnical}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CSCResultCode#CSCMissing
 * CSCResultCode.CSCMissing}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CSCResultCode#CSCNotUsed
 * CSCResultCode.CSCNotUsed}</li>
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
 * <li>"CMCH"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CSCResultCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Result of the printed CSC (Card Security Code) validation."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CSCResultCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Card security code match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CSCResultCode
	 * CSCResultCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CMCH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSCMatch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Card security code match."</li>
	 * </ul>
	 */
	public static final CSCResultCode CSCMatch = new CSCResultCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CSCMatch";
			definition = "Card security code match.";
			owner_lazy = () -> com.tools20022.repository.codeset.CSCResultCode.mmObject();
			codeName = "CMCH";
		}
	};
	/**
	 * No card security code match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CSCResultCode
	 * CSCResultCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CNMH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSCNoMatch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "No card security code match."</li>
	 * </ul>
	 */
	public static final CSCResultCode CSCNoMatch = new CSCResultCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CSCNoMatch";
			definition = "No card security code match.";
			owner_lazy = () -> com.tools20022.repository.codeset.CSCResultCode.mmObject();
			codeName = "CNMH";
		}
	};
	/**
	 * Card security code not processed for technical reason.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CSCResultCode
	 * CSCResultCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CNMT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSCTechnical"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Card security code not processed for technical reason."</li>
	 * </ul>
	 */
	public static final CSCResultCode CSCTechnical = new CSCResultCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CSCTechnical";
			definition = "Card security code not processed for technical reason.";
			owner_lazy = () -> com.tools20022.repository.codeset.CSCResultCode.mmObject();
			codeName = "CNMT";
		}
	};
	/**
	 * Card security code not processed for non-technical reason.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CSCResultCode
	 * CSCResultCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CNMO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSCNotTechnical"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Card security code not processed for non-technical reason."</li>
	 * </ul>
	 */
	public static final CSCResultCode CSCNotTechnical = new CSCResultCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CSCNotTechnical";
			definition = "Card security code not processed for non-technical reason.";
			owner_lazy = () -> com.tools20022.repository.codeset.CSCResultCode.mmObject();
			codeName = "CNMO";
		}
	};
	/**
	 * Card security code missing in request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CSCResultCode
	 * CSCResultCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CMSS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSCMissing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Card security code missing in request."</li>
	 * </ul>
	 */
	public static final CSCResultCode CSCMissing = new CSCResultCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CSCMissing";
			definition = "Card security code missing in request.";
			owner_lazy = () -> com.tools20022.repository.codeset.CSCResultCode.mmObject();
			codeName = "CMSS";
		}
	};
	/**
	 * Card security code not used by issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CSCResultCode
	 * CSCResultCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CNUS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSCNotUsed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Card security code not used by issuer."</li>
	 * </ul>
	 */
	public static final CSCResultCode CSCNotUsed = new CSCResultCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CSCNotUsed";
			definition = "Card security code not used by issuer.";
			owner_lazy = () -> com.tools20022.repository.codeset.CSCResultCode.mmObject();
			codeName = "CNUS";
		}
	};
	final static private LinkedHashMap<String, CSCResultCode> codesByName = new LinkedHashMap<>();

	protected CSCResultCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CMCH");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CSCResultCode";
				definition = "Result of the printed CSC (Card Security Code) validation.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CSCResultCode.CSCMatch, com.tools20022.repository.codeset.CSCResultCode.CSCNoMatch, com.tools20022.repository.codeset.CSCResultCode.CSCTechnical,
						com.tools20022.repository.codeset.CSCResultCode.CSCNotTechnical, com.tools20022.repository.codeset.CSCResultCode.CSCMissing, com.tools20022.repository.codeset.CSCResultCode.CSCNotUsed);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CSCMatch.getCodeName().get(), CSCMatch);
		codesByName.put(CSCNoMatch.getCodeName().get(), CSCNoMatch);
		codesByName.put(CSCTechnical.getCodeName().get(), CSCTechnical);
		codesByName.put(CSCNotTechnical.getCodeName().get(), CSCNotTechnical);
		codesByName.put(CSCMissing.getCodeName().get(), CSCMissing);
		codesByName.put(CSCNotUsed.getCodeName().get(), CSCNotUsed);
	}

	public static CSCResultCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CSCResultCode[] values() {
		CSCResultCode[] values = new CSCResultCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CSCResultCode> {
		@Override
		public CSCResultCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CSCResultCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}