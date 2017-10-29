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
 * Specifies the type of place of safekeeping.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SafekeepingPlaceCode#SharesHeldAtLocalCustodian
 * SafekeepingPlaceCode.SharesHeldAtLocalCustodian}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SafekeepingPlaceCode#SharesHeldAtICSD
 * SafekeepingPlaceCode.SharesHeldAtICSD}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SafekeepingPlaceCode#SharesHeldAtNCSD
 * SafekeepingPlaceCode.SharesHeldAtNCSD}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SafekeepingPlaceCode#SharesHeldElsewhere
 * SafekeepingPlaceCode.SharesHeldElsewhere}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SafekeepingPlaceCode#AllPlaces
 * SafekeepingPlaceCode.AllPlaces}</li>
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
 * <li>"CUST"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SafekeepingPlaceCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of place of safekeeping."</li>
 * </ul>
 */
public class SafekeepingPlaceCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Financial instruments held at a local custodian.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SafekeepingPlaceCode
	 * SafekeepingPlaceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CUST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SharesHeldAtLocalCustodian"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Financial instruments held at a local custodian."</li>
	 * </ul>
	 */
	public static final MMCode SharesHeldAtLocalCustodian = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SharesHeldAtLocalCustodian";
			definition = "Financial instruments held at a local custodian.";
			owner_lazy = () -> SafekeepingPlaceCode.mmObject();
			codeName = "CUST";
		}
	};
	/**
	 * Financial instruments held at an International Central Securities
	 * Depository.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SafekeepingPlaceCode
	 * SafekeepingPlaceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ICSD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SharesHeldAtICSD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial instruments held at an International Central Securities Depository."
	 * </li>
	 * </ul>
	 */
	public static final MMCode SharesHeldAtICSD = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SharesHeldAtICSD";
			definition = "Financial instruments held at an International Central Securities Depository.";
			owner_lazy = () -> SafekeepingPlaceCode.mmObject();
			codeName = "ICSD";
		}
	};
	/**
	 * Financial instruments held at a National Central Securities Depository.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SafekeepingPlaceCode
	 * SafekeepingPlaceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NCSD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SharesHeldAtNCSD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial instruments held at a National Central Securities Depository."
	 * </li>
	 * </ul>
	 */
	public static final MMCode SharesHeldAtNCSD = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SharesHeldAtNCSD";
			definition = "Financial instruments held at a National Central Securities Depository.";
			owner_lazy = () -> SafekeepingPlaceCode.mmObject();
			codeName = "NCSD";
		}
	};
	/**
	 * Used for certain financial instruments, for example, US mutual funds,
	 * where settlement is internal only, that is, there is no external movement
	 * of securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SafekeepingPlaceCode
	 * SafekeepingPlaceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SHHE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SharesHeldElsewhere"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Used for certain financial instruments, for example, US mutual funds, where settlement is internal only, that is, there is no external movement of securities."
	 * </li>
	 * </ul>
	 */
	public static final MMCode SharesHeldElsewhere = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SharesHeldElsewhere";
			definition = "Used for certain financial instruments, for example, US mutual funds, where settlement is internal only, that is, there is no external movement of securities.";
			owner_lazy = () -> SafekeepingPlaceCode.mmObject();
			codeName = "SHHE";
		}
	};
	/**
	 * All places of safekeeping where the financial instrument is held.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SafekeepingPlaceCode
	 * SafekeepingPlaceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ALLP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllPlaces"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All places of safekeeping where the financial instrument is held."</li>
	 * </ul>
	 */
	public static final MMCode AllPlaces = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AllPlaces";
			definition = "All places of safekeeping where the financial instrument is held.";
			owner_lazy = () -> SafekeepingPlaceCode.mmObject();
			codeName = "ALLP";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CUST");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SafekeepingPlaceCode";
				definition = "Specifies the type of place of safekeeping.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SafekeepingPlaceCode.SharesHeldAtLocalCustodian, com.tools20022.repository.codeset.SafekeepingPlaceCode.SharesHeldAtICSD,
						com.tools20022.repository.codeset.SafekeepingPlaceCode.SharesHeldAtNCSD, com.tools20022.repository.codeset.SafekeepingPlaceCode.SharesHeldElsewhere, com.tools20022.repository.codeset.SafekeepingPlaceCode.AllPlaces);
			}
		});
		return mmObject_lazy.get();
	}
}