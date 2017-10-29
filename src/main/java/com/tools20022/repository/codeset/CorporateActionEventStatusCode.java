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
 * Specifies the status of the CA event or option.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStatusCode#Active
 * CorporateActionEventStatusCode.Active}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStatusCode#Deactivated
 * CorporateActionEventStatusCode.Deactivated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStatusCode#Expired
 * CorporateActionEventStatusCode.Expired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStatusCode#Cancelled
 * CorporateActionEventStatusCode.Cancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStatusCode#Withdrawn
 * CorporateActionEventStatusCode.Withdrawn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStatusCode#Inactive
 * CorporateActionEventStatusCode.Inactive}</li>
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
 * <li>"ACTI"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionEventStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the status of the CA event or option."</li>
 * </ul>
 */
public class CorporateActionEventStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * The CA event is active.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStatusCode
	 * CorporateActionEventStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACTI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Active"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The CA event is active."</li>
	 * </ul>
	 */
	public static final MMCode Active = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Active";
			definition = "The CA event is active.";
			owner_lazy = () -> CorporateActionEventStatusCode.mmObject();
			codeName = "ACTI";
		}
	};
	/**
	 * The CA event is deactivated. The clients cannot send instruction anymore.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStatusCode
	 * CorporateActionEventStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DEAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Deactivated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CA event is deactivated. The clients cannot send instruction anymore."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Deactivated = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Deactivated";
			definition = "The CA event is deactivated. The clients cannot send instruction anymore.";
			owner_lazy = () -> CorporateActionEventStatusCode.mmObject();
			codeName = "DEAC";
		}
	};
	/**
	 * The CA event is expired, no more processing, claims, transformations take
	 * place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStatusCode
	 * CorporateActionEventStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXPI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Expired"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CA event is expired, no more processing, claims, transformations take place."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Expired = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Expired";
			definition = "The CA event is expired, no more processing, claims, transformations take place.";
			owner_lazy = () -> CorporateActionEventStatusCode.mmObject();
			codeName = "EXPI";
		}
	};
	/**
	 * The CA event is cancelled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStatusCode
	 * CorporateActionEventStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CANC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cancelled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The CA event is cancelled."</li>
	 * </ul>
	 */
	public static final MMCode Cancelled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Cancelled";
			definition = "The CA event is cancelled.";
			owner_lazy = () -> CorporateActionEventStatusCode.mmObject();
			codeName = "CANC";
		}
	};
	/**
	 * The CA event is withrawn, ie, cancelled by the market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStatusCode
	 * CorporateActionEventStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WITH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Withdrawn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The CA event is withrawn, ie, cancelled by the market."</li>
	 * </ul>
	 */
	public static final MMCode Withdrawn = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Withdrawn";
			definition = "The CA event is withrawn, ie, cancelled by the market.";
			owner_lazy = () -> CorporateActionEventStatusCode.mmObject();
			codeName = "WITH";
		}
	};
	/**
	 * Option is not active and can no longer be responded to. Any responses
	 * already processed against this option will remain valid, eg, expired
	 * option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStatusCode
	 * CorporateActionEventStatusCode}</li>
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
	 * definition} =
	 * "Option is not active and can no longer be responded to. Any responses already processed against this option will remain valid, eg, expired option."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Inactive = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Inactive";
			definition = "Option is not active and can no longer be responded to. Any responses already processed against this option will remain valid, eg, expired option.";
			owner_lazy = () -> CorporateActionEventStatusCode.mmObject();
			codeName = "INAC";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("ACTI");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionEventStatusCode";
				definition = "Specifies the status of the CA event or option.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionEventStatusCode.Active, com.tools20022.repository.codeset.CorporateActionEventStatusCode.Deactivated,
						com.tools20022.repository.codeset.CorporateActionEventStatusCode.Expired, com.tools20022.repository.codeset.CorporateActionEventStatusCode.Cancelled,
						com.tools20022.repository.codeset.CorporateActionEventStatusCode.Withdrawn, com.tools20022.repository.codeset.CorporateActionEventStatusCode.Inactive);
			}
		});
		return mmObject_lazy.get();
	}
}