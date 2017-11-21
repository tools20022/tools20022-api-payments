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
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Result of the printed CSC (Card Security Code) validation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.CSCResultCode#mmCSCMatch
 * CSCResultCode.mmCSCMatch}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CSCResultCode#mmCSCNoMatch
 * CSCResultCode.mmCSCNoMatch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CSCResultCode#mmCSCTechnical
 * CSCResultCode.mmCSCTechnical}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CSCResultCode#mmCSCNotTechnical
 * CSCResultCode.mmCSCNotTechnical}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CSCResultCode#mmCSCMissing
 * CSCResultCode.mmCSCMissing}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CSCResultCode#mmCSCNotUsed
 * CSCResultCode.mmCSCNotUsed}</li>
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
public class CSCResultCode {

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
	public static final MMCode mmCSCMatch = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CSCMatch";
			definition = "Card security code match.";
			owner_lazy = () -> CSCResultCode.mmObject();
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
	public static final MMCode mmCSCNoMatch = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CSCNoMatch";
			definition = "No card security code match.";
			owner_lazy = () -> CSCResultCode.mmObject();
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
	public static final MMCode mmCSCTechnical = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CSCTechnical";
			definition = "Card security code not processed for technical reason.";
			owner_lazy = () -> CSCResultCode.mmObject();
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
	public static final MMCode mmCSCNotTechnical = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CSCNotTechnical";
			definition = "Card security code not processed for non-technical reason.";
			owner_lazy = () -> CSCResultCode.mmObject();
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
	public static final MMCode mmCSCMissing = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CSCMissing";
			definition = "Card security code missing in request.";
			owner_lazy = () -> CSCResultCode.mmObject();
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
	public static final MMCode mmCSCNotUsed = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CSCNotUsed";
			definition = "Card security code not used by issuer.";
			owner_lazy = () -> CSCResultCode.mmObject();
			codeName = "CNUS";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("CMCH");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CSCResultCode";
				definition = "Result of the printed CSC (Card Security Code) validation.";
				code_lazy = () -> Arrays.asList(CSCResultCode.mmCSCMatch, CSCResultCode.mmCSCNoMatch, CSCResultCode.mmCSCTechnical, CSCResultCode.mmCSCNotTechnical, CSCResultCode.mmCSCMissing, CSCResultCode.mmCSCNotUsed);
			}
		});
		return mmObject_lazy.get();
	}
}