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
 * Defines how an option can be exercised
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.OptionStyleCode#mmAmerican
 * OptionStyleCode.mmAmerican}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OptionStyleCode#mmEuropean
 * OptionStyleCode.mmEuropean}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OptionStyleCode#mmBermudan
 * OptionStyleCode.mmBermudan}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OptionStyleCode#mmAsian
 * OptionStyleCode.mmAsian}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OptionStyleCode#mmCanary
 * OptionStyleCode.mmCanary}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OptionStyleCode#mmOther
 * OptionStyleCode.mmOther}</li>
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
 * <li>"AMER"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OptionStyleCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines how an option can be exercised"</li>
 * </ul>
 */
public class OptionStyleCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Option can be exercised before or on expiry date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionStyleCode
	 * OptionStyleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AMER"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "American"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Option can be exercised before or on expiry date."</li>
	 * </ul>
	 */
	public static final MMCode mmAmerican = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "American";
			definition = "Option can be exercised before or on expiry date.";
			owner_lazy = () -> OptionStyleCode.mmObject();
			codeName = "AMER";
		}
	};
	/**
	 * Option that can be exercised on expiry date only.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionStyleCode
	 * OptionStyleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EURO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "European"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Option that can be exercised on expiry date only."</li>
	 * </ul>
	 */
	public static final MMCode mmEuropean = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "European";
			definition = "Option that can be exercised on expiry date only.";
			owner_lazy = () -> OptionStyleCode.mmObject();
			codeName = "EURO";
		}
	};
	/**
	 * Option that can be exercised on multiple discrete dates prior to, or on
	 * expiry date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionStyleCode
	 * OptionStyleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BERM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bermudan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Option that can be exercised on multiple discrete dates prior to, or on expiry date."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmBermudan = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Bermudan";
			definition = "Option that can be exercised on multiple discrete dates prior to, or on expiry date.";
			owner_lazy = () -> OptionStyleCode.mmObject();
			codeName = "BERM";
		}
	};
	/**
	 * Option where the payoff is not determined by the underlying price at
	 * maturity but by the average underlying price over some pre-set period of
	 * time.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionStyleCode
	 * OptionStyleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ASIA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Asian"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Option where the payoff is not determined by the underlying price at maturity but by the average underlying price over some pre-set period of time."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAsian = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Asian";
			definition = "Option where the payoff is not determined by the underlying price at maturity but by the average underlying price over some pre-set period of time.";
			owner_lazy = () -> OptionStyleCode.mmObject();
			codeName = "ASIA";
		}
	};
	/**
	 * Option whose exercise style lies somewhere between European options and
	 * Bermudan options. The holder can exercise the option at quaterly dates,
	 * but not before a set time period (typically one year) has elapsed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionStyleCode
	 * OptionStyleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CANA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Canary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Option whose exercise style lies somewhere between European options and Bermudan options. The holder can exercise the option at quaterly dates, but not before a set time period (typically one year) has elapsed."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCanary = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Canary";
			definition = "Option whose exercise style lies somewhere between European options and Bermudan options. The holder can exercise the option at quaterly dates, but not before a set time period (typically one year) has elapsed.";
			owner_lazy = () -> OptionStyleCode.mmObject();
			codeName = "CANA";
		}
	};
	/**
	 * Other type of option style.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionStyleCode
	 * OptionStyleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other type of option style."</li>
	 * </ul>
	 */
	public static final MMCode mmOther = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Other type of option style.";
			owner_lazy = () -> OptionStyleCode.mmObject();
			codeName = "OTHR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("AMER");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OptionStyleCode";
				definition = "Defines how an option can be exercised";
				code_lazy = () -> Arrays.asList(OptionStyleCode.mmAmerican, OptionStyleCode.mmEuropean, OptionStyleCode.mmBermudan, OptionStyleCode.mmAsian, OptionStyleCode.mmCanary, OptionStyleCode.mmOther);
			}
		});
		return mmObject_lazy.get();
	}
}