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
 * Specifies the type of place of safekeeping.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SafekeepingPlaceCode#mmSharesHeldAtLocalCustodian
 * SafekeepingPlaceCode.mmSharesHeldAtLocalCustodian}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SafekeepingPlaceCode#mmSharesHeldAtICSD
 * SafekeepingPlaceCode.mmSharesHeldAtICSD}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SafekeepingPlaceCode#mmSharesHeldAtNCSD
 * SafekeepingPlaceCode.mmSharesHeldAtNCSD}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SafekeepingPlaceCode#mmSharesHeldElsewhere
 * SafekeepingPlaceCode.mmSharesHeldElsewhere}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SafekeepingPlaceCode#mmAllPlaces
 * SafekeepingPlaceCode.mmAllPlaces}</li>
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
	public static final MMCode mmSharesHeldAtLocalCustodian = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMCode mmSharesHeldAtICSD = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMCode mmSharesHeldAtNCSD = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMCode mmSharesHeldElsewhere = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMCode mmAllPlaces = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AllPlaces";
			definition = "All places of safekeeping where the financial instrument is held.";
			owner_lazy = () -> SafekeepingPlaceCode.mmObject();
			codeName = "ALLP";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("CUST");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SafekeepingPlaceCode";
				definition = "Specifies the type of place of safekeeping.";
				code_lazy = () -> Arrays.asList(SafekeepingPlaceCode.mmSharesHeldAtLocalCustodian, SafekeepingPlaceCode.mmSharesHeldAtICSD, SafekeepingPlaceCode.mmSharesHeldAtNCSD, SafekeepingPlaceCode.mmSharesHeldElsewhere,
						SafekeepingPlaceCode.mmAllPlaces);
			}
		});
		return mmObject_lazy.get();
	}
}