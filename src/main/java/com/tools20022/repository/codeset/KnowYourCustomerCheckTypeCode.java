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
 * Specifies the type of Know Your Customer (KYC) or anti-money laundering due
 * diligence to which the investor has been subjected.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.KnowYourCustomerCheckTypeCode#mmOrdinary
 * KnowYourCustomerCheckTypeCode.mmOrdinary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.KnowYourCustomerCheckTypeCode#mmSimple
 * KnowYourCustomerCheckTypeCode.mmSimple}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.KnowYourCustomerCheckTypeCode#mmEnhanced
 * KnowYourCustomerCheckTypeCode.mmEnhanced}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "KnowYourCustomerCheckTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of Know Your Customer (KYC) or anti-money laundering due diligence to which the investor has been subjected."
 * </li>
 * </ul>
 */
public class KnowYourCustomerCheckTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Ordinary check, typically carried out on standard accounts.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.KnowYourCustomerCheckTypeCode
	 * KnowYourCustomerCheckTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ORDN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Ordinary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Ordinary check, typically carried out on standard accounts."</li>
	 * </ul>
	 */
	public static final MMCode mmOrdinary = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Ordinary";
			definition = "Ordinary check, typically carried out on standard accounts.";
			owner_lazy = () -> KnowYourCustomerCheckTypeCode.mmObject();
			codeName = "ORDN";
		}
	};
	/**
	 * Simple check, typically carried out on accounts that have a low risk of
	 * anti-money laundering, such as an account owned by a financial
	 * institution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.KnowYourCustomerCheckTypeCode
	 * KnowYourCustomerCheckTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SIMP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Simple"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Simple check, typically carried out on accounts that have a low risk of anti-money laundering, such as an account owned by a financial institution."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmSimple = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Simple";
			definition = "Simple check, typically carried out on accounts that have a low risk of anti-money laundering, such as an account owned by a financial institution.";
			owner_lazy = () -> KnowYourCustomerCheckTypeCode.mmObject();
			codeName = "SIMP";
		}
	};
	/**
	 * Enhanced check, typically carried out on accounts that are considered
	 * high risk.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.KnowYourCustomerCheckTypeCode
	 * KnowYourCustomerCheckTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ENHA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Enhanced"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Enhanced check, typically carried out on accounts that are considered high risk. "
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmEnhanced = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Enhanced";
			definition = "Enhanced check, typically carried out on accounts that are considered high risk. ";
			owner_lazy = () -> KnowYourCustomerCheckTypeCode.mmObject();
			codeName = "ENHA";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "KnowYourCustomerCheckTypeCode";
				definition = "Specifies the type of Know Your Customer (KYC) or anti-money laundering due diligence to which the investor has been subjected.";
				code_lazy = () -> Arrays.asList(KnowYourCustomerCheckTypeCode.mmOrdinary, KnowYourCustomerCheckTypeCode.mmSimple, KnowYourCustomerCheckTypeCode.mmEnhanced);
			}
		});
		return mmObject_lazy.get();
	}
}