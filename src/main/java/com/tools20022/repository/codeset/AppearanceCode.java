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
 * Specifies the deliverability of a security.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AppearanceCode#mmDeliverable
 * AppearanceCode.mmDeliverable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AppearanceCode#mmNotDeliverable
 * AppearanceCode.mmNotDeliverable}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AppearanceCode#mmLimited
 * AppearanceCode.mmLimited}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AppearanceCode#mmBookEntry
 * AppearanceCode.mmBookEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AppearanceCode#mmDeferredBookEntry
 * AppearanceCode.mmDeferredBookEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AppearanceCode#mmDeliverableBookEntry
 * AppearanceCode.mmDeliverableBookEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AppearanceCode#mmTemporaryGlobal
 * AppearanceCode.mmTemporaryGlobal}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AppearanceCode#mmGlobal
 * AppearanceCode.mmGlobal}</li>
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
 * <li>"DELI"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AppearanceCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the deliverability of a security."</li>
 * </ul>
 */
public class AppearanceCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Physical certificates exist.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AppearanceCode
	 * AppearanceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DELI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Deliverable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Physical certificates exist."</li>
	 * </ul>
	 */
	public static final MMCode mmDeliverable = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Deliverable";
			definition = "Physical certificates exist.";
			owner_lazy = () -> AppearanceCode.mmObject();
			codeName = "DELI";
		}
	};
	/**
	 * Not yet deliverable contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AppearanceCode
	 * AppearanceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NDEL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotDeliverable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Not yet deliverable contract."</li>
	 * </ul>
	 */
	public static final MMCode mmNotDeliverable = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotDeliverable";
			definition = "Not yet deliverable contract.";
			owner_lazy = () -> AppearanceCode.mmObject();
			codeName = "NDEL";
		}
	};
	/**
	 * Limited or partial deliverability.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AppearanceCode
	 * AppearanceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LIMI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Limited"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Limited or partial deliverability."</li>
	 * </ul>
	 */
	public static final MMCode mmLimited = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Limited";
			definition = "Limited or partial deliverability.";
			owner_lazy = () -> AppearanceCode.mmObject();
			codeName = "LIMI";
		}
	};
	/**
	 * Security exists only as an electronic record, ie, there are no physical
	 * certificates representing the security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AppearanceCode
	 * AppearanceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BENT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BookEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Security exists only as an electronic record, ie, there are no physical certificates representing the security."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmBookEntry = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BookEntry";
			definition = "Security exists only as an electronic record, ie, there are no physical certificates representing the security.";
			owner_lazy = () -> AppearanceCode.mmObject();
			codeName = "BENT";
		}
	};
	/**
	 * Deferred printing, book entry.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AppearanceCode
	 * AppearanceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DFBE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeferredBookEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Deferred printing, book entry."</li>
	 * </ul>
	 */
	public static final MMCode mmDeferredBookEntry = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeferredBookEntry";
			definition = "Deferred printing, book entry.";
			owner_lazy = () -> AppearanceCode.mmObject();
			codeName = "DFBE";
		}
	};
	/**
	 * Deliverable, book entry.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AppearanceCode
	 * AppearanceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DLBE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverableBookEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Deliverable, book entry."</li>
	 * </ul>
	 */
	public static final MMCode mmDeliverableBookEntry = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeliverableBookEntry";
			definition = "Deliverable, book entry.";
			owner_lazy = () -> AppearanceCode.mmObject();
			codeName = "DLBE";
		}
	};
	/**
	 * Deferred printing, global certificate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AppearanceCode
	 * AppearanceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TMPG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TemporaryGlobal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Deferred printing, global certificate."</li>
	 * </ul>
	 */
	public static final MMCode mmTemporaryGlobal = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TemporaryGlobal";
			definition = "Deferred printing, global certificate.";
			owner_lazy = () -> AppearanceCode.mmObject();
			codeName = "TMPG";
		}
	};
	/**
	 * Not deliverable, global certificate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AppearanceCode
	 * AppearanceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GLOB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Global"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Not deliverable, global certificate."</li>
	 * </ul>
	 */
	public static final MMCode mmGlobal = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Global";
			definition = "Not deliverable, global certificate.";
			owner_lazy = () -> AppearanceCode.mmObject();
			codeName = "GLOB";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("DELI");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AppearanceCode";
				definition = "Specifies the deliverability of a security.";
				code_lazy = () -> Arrays.asList(AppearanceCode.mmDeliverable, AppearanceCode.mmNotDeliverable, AppearanceCode.mmLimited, AppearanceCode.mmBookEntry, AppearanceCode.mmDeferredBookEntry, AppearanceCode.mmDeliverableBookEntry,
						AppearanceCode.mmTemporaryGlobal, AppearanceCode.mmGlobal);
			}
		});
		return mmObject_lazy.get();
	}
}