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
 * Specifies the status of the security.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecurityStatusCode#mmActive
 * SecurityStatusCode.mmActive}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecurityStatusCode#mmInactive
 * SecurityStatusCode.mmInactive}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecurityStatusCode#mmWhenIssued
 * SecurityStatusCode.mmWhenIssued}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecurityStatusCode#mmWhenDistributed
 * SecurityStatusCode.mmWhenDistributed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecurityStatusCode#mmIssued
 * SecurityStatusCode.mmIssued}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecurityStatusCode#mmSuspended
 * SecurityStatusCode.mmSuspended}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecurityStatusCode#mmInDefault
 * SecurityStatusCode.mmInDefault}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecurityStatusCode#mmWorthless
 * SecurityStatusCode.mmWorthless}</li>
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
 * <li>"ACTV"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecurityStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the status of the security."</li>
 * </ul>
 */
public class SecurityStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * The status is active.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecurityStatusCode
	 * SecurityStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACTV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Active"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The status is active."</li>
	 * </ul>
	 */
	public static final MMCode mmActive = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Active";
			definition = "The status is active.";
			owner_lazy = () -> SecurityStatusCode.mmObject();
			codeName = "ACTV";
		}
	};
	/**
	 * The status is inactive.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecurityStatusCode
	 * SecurityStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Inactive"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The status is inactive."</li>
	 * </ul>
	 */
	public static final MMCode mmInactive = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Inactive";
			definition = "The status is inactive.";
			owner_lazy = () -> SecurityStatusCode.mmObject();
			codeName = "INAC";
		}
	};
	/**
	 * The status is when issued.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecurityStatusCode
	 * SecurityStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WISS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WhenIssued"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The status is when issued."</li>
	 * </ul>
	 */
	public static final MMCode mmWhenIssued = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WhenIssued";
			definition = "The status is when issued.";
			owner_lazy = () -> SecurityStatusCode.mmObject();
			codeName = "WISS";
		}
	};
	/**
	 * The status is when distributed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecurityStatusCode
	 * SecurityStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WDIS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WhenDistributed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The status is when distributed."</li>
	 * </ul>
	 */
	public static final MMCode mmWhenDistributed = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WhenDistributed";
			definition = "The status is when distributed.";
			owner_lazy = () -> SecurityStatusCode.mmObject();
			codeName = "WDIS";
		}
	};
	/**
	 * The status is issued.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecurityStatusCode
	 * SecurityStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ISUD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issued"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The status is issued."</li>
	 * </ul>
	 */
	public static final MMCode mmIssued = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Issued";
			definition = "The status is issued.";
			owner_lazy = () -> SecurityStatusCode.mmObject();
			codeName = "ISUD";
		}
	};
	/**
	 * The status is suspended.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecurityStatusCode
	 * SecurityStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SUSP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Suspended"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The status is suspended."</li>
	 * </ul>
	 */
	public static final MMCode mmSuspended = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Suspended";
			definition = "The status is suspended.";
			owner_lazy = () -> SecurityStatusCode.mmObject();
			codeName = "SUSP";
		}
	};
	/**
	 * The status is in default.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecurityStatusCode
	 * SecurityStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IDEF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InDefault"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The status is in default."</li>
	 * </ul>
	 */
	public static final MMCode mmInDefault = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InDefault";
			definition = "The status is in default.";
			owner_lazy = () -> SecurityStatusCode.mmObject();
			codeName = "IDEF";
		}
	};
	/**
	 * Annoucement by the regulator that the security has become worthless.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecurityStatusCode
	 * SecurityStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WRTH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Worthless"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Annoucement by the regulator that the security has become worthless."</li>
	 * </ul>
	 */
	public static final MMCode mmWorthless = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Worthless";
			definition = "Annoucement by the regulator that the security has become worthless.";
			owner_lazy = () -> SecurityStatusCode.mmObject();
			codeName = "WRTH";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("ACTV");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecurityStatusCode";
				definition = "Specifies the status of the security.";
				code_lazy = () -> Arrays.asList(SecurityStatusCode.mmActive, SecurityStatusCode.mmInactive, SecurityStatusCode.mmWhenIssued, SecurityStatusCode.mmWhenDistributed, SecurityStatusCode.mmIssued, SecurityStatusCode.mmSuspended,
						SecurityStatusCode.mmInDefault, SecurityStatusCode.mmWorthless);
			}
		});
		return mmObject_lazy.get();
	}
}