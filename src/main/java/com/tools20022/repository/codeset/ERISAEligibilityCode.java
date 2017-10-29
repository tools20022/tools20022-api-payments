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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies information about ERISA (Eligibility to federal Employee Retirement
 * Income Security Act) eligibility.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ERISAEligibilityCode#ERISAEligible
 * ERISAEligibilityCode.ERISAEligible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ERISAEligibilityCode#NotERISAEligible
 * ERISAEligibilityCode.NotERISAEligible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ERISAEligibilityCode#ERISAEligibilityUnknown
 * ERISAEligibilityCode.ERISAEligibilityUnknown}</li>
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
 * <li>"ELIG"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ERISAEligibilityCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies information about ERISA (Eligibility to federal Employee Retirement Income Security Act) eligibility."
 * </li>
 * </ul>
 */
public class ERISAEligibilityCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Investor is subject to an ERISA declaration.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ERISAEligibilityCode
	 * ERISAEligibilityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ELIG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ERISAEligible"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Investor is subject to an ERISA declaration."</li>
	 * </ul>
	 */
	public static final MMCode ERISAEligible = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ERISAEligible";
			definition = "Investor is subject to an ERISA declaration.";
			owner_lazy = () -> ERISAEligibilityCode.mmObject();
			codeName = "ELIG";
		}
	};
	/**
	 * Investment is not subject to an ERISA declaration.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ERISAEligibilityCode
	 * ERISAEligibilityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NELI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotERISAEligible"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Investment is not subject to an ERISA declaration."</li>
	 * </ul>
	 */
	public static final MMCode NotERISAEligible = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotERISAEligible";
			definition = "Investment is not subject to an ERISA declaration.";
			owner_lazy = () -> ERISAEligibilityCode.mmObject();
			codeName = "NELI";
		}
	};
	/**
	 * Eligibility is unknown at the time the order is sent, and the instructing
	 * party will confirm later.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ERISAEligibilityCode
	 * ERISAEligibilityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UKWN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ERISAEligibilityUnknown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Eligibility is unknown at the time the order is sent, and the instructing party will confirm later."
	 * </li>
	 * </ul>
	 */
	public static final MMCode ERISAEligibilityUnknown = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ERISAEligibilityUnknown";
			definition = "Eligibility is unknown at the time the order is sent, and the instructing party will confirm later.";
			owner_lazy = () -> ERISAEligibilityCode.mmObject();
			codeName = "UKWN";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("ELIG");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ERISAEligibilityCode";
				definition = "Specifies information about ERISA (Eligibility to federal Employee Retirement Income Security Act) eligibility.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ERISAEligibilityCode.ERISAEligible, com.tools20022.repository.codeset.ERISAEligibilityCode.NotERISAEligible,
						com.tools20022.repository.codeset.ERISAEligibilityCode.ERISAEligibilityUnknown);
			}
		});
		return mmObject_lazy.get();
	}
}