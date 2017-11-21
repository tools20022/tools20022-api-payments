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
 * Indicates the legal constraint on the power of attorney.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PowerOfAttorneyLegalisationCode#mmNotary
 * PowerOfAttorneyLegalisationCode.mmNotary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PowerOfAttorneyLegalisationCode#mmLocalAuthority
 * PowerOfAttorneyLegalisationCode.mmLocalAuthority}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PowerOfAttorneyLegalisationCode#mmApostilled
 * PowerOfAttorneyLegalisationCode.mmApostilled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PowerOfAttorneyLegalisationCode#mmConsularized
 * PowerOfAttorneyLegalisationCode.mmConsularized}</li>
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
 * <li>"NOTA"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PowerOfAttorneyLegalisationCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Indicates the legal constraint on the power of attorney."</li>
 * </ul>
 */
public class PowerOfAttorneyLegalisationCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates that the power of attorney must be legalised by a notary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PowerOfAttorneyLegalisationCode
	 * PowerOfAttorneyLegalisationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOTA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Notary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the power of attorney must be legalised by a notary."</li>
	 * </ul>
	 */
	public static final MMCode mmNotary = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Notary";
			definition = "Indicates that the power of attorney must be legalised by a notary.";
			owner_lazy = () -> PowerOfAttorneyLegalisationCode.mmObject();
			codeName = "NOTA";
		}
	};
	/**
	 * Indicates that the power of attorney must be legalised by a local
	 * authority.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PowerOfAttorneyLegalisationCode
	 * PowerOfAttorneyLegalisationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LOCA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LocalAuthority"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the power of attorney must be legalised by a local authority."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmLocalAuthority = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LocalAuthority";
			definition = "Indicates that the power of attorney must be legalised by a local authority.";
			owner_lazy = () -> PowerOfAttorneyLegalisationCode.mmObject();
			codeName = "LOCA";
		}
	};
	/**
	 * Indicates that the power of attorney must be legalised by a legal
	 * officer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PowerOfAttorneyLegalisationCode
	 * PowerOfAttorneyLegalisationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "APOS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Apostilled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the power of attorney must be legalised by a legal officer."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmApostilled = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Apostilled";
			definition = "Indicates that the power of attorney must be legalised by a legal officer.";
			owner_lazy = () -> PowerOfAttorneyLegalisationCode.mmObject();
			codeName = "APOS";
		}
	};
	/**
	 * Indicates that the power of attorney must be legalised by a consular
	 * officer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PowerOfAttorneyLegalisationCode
	 * PowerOfAttorneyLegalisationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COUN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Consularized"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the power of attorney must be legalised by a consular officer."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmConsularized = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Consularized";
			definition = "Indicates that the power of attorney must be legalised by a consular officer.";
			owner_lazy = () -> PowerOfAttorneyLegalisationCode.mmObject();
			codeName = "COUN";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("NOTA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PowerOfAttorneyLegalisationCode";
				definition = "Indicates the legal constraint on the power of attorney.";
				code_lazy = () -> Arrays.asList(PowerOfAttorneyLegalisationCode.mmNotary, PowerOfAttorneyLegalisationCode.mmLocalAuthority, PowerOfAttorneyLegalisationCode.mmApostilled, PowerOfAttorneyLegalisationCode.mmConsularized);
			}
		});
		return mmObject_lazy.get();
	}
}