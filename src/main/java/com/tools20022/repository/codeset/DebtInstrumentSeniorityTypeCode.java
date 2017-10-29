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
 * Specifies the seniority type of a specific debt instrument.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DebtInstrumentSeniorityTypeCode#SeniorDebt
 * DebtInstrumentSeniorityTypeCode.SeniorDebt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DebtInstrumentSeniorityTypeCode#MezzanineDebt
 * DebtInstrumentSeniorityTypeCode.MezzanineDebt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DebtInstrumentSeniorityTypeCode#SubordinatedDebt
 * DebtInstrumentSeniorityTypeCode.SubordinatedDebt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DebtInstrumentSeniorityTypeCode#JuniorDebt
 * DebtInstrumentSeniorityTypeCode.JuniorDebt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DebtInstrumentSeniorityTypeCode#Other
 * DebtInstrumentSeniorityTypeCode.Other}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DebtInstrumentSeniorityTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the seniority type of a specific debt instrument."</li>
 * </ul>
 */
public class DebtInstrumentSeniorityTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Debt that takes priority over other unsecured or otherwise more junior
	 * debt owed by the issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DebtInstrumentSeniorityTypeCode
	 * DebtInstrumentSeniorityTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SNDB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SeniorDebt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Debt that takes priority over other unsecured or otherwise more junior debt owed by the issuer."
	 * </li>
	 * </ul>
	 */
	public static final MMCode SeniorDebt = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SeniorDebt";
			definition = "Debt that takes priority over other unsecured or otherwise more junior debt owed by the issuer.";
			owner_lazy = () -> DebtInstrumentSeniorityTypeCode.mmObject();
			codeName = "SNDB";
		}
	};
	/**
	 * Subordinated debt or preferred equity instrument that represents a claim
	 * on a company's assets which is senior only to that of the common shares.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DebtInstrumentSeniorityTypeCode
	 * DebtInstrumentSeniorityTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MZZD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MezzanineDebt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Subordinated debt or preferred equity instrument that represents a claim on a company's assets which is senior only to that of the common shares."
	 * </li>
	 * </ul>
	 */
	public static final MMCode MezzanineDebt = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MezzanineDebt";
			definition = "Subordinated debt or preferred equity instrument that represents a claim on a company's assets which is senior only to that of the common shares.";
			owner_lazy = () -> DebtInstrumentSeniorityTypeCode.mmObject();
			codeName = "MZZD";
		}
	};
	/**
	 * Debt owed to an unsecured creditor that can only be paid, in the event of
	 * a liquidation, after the claims of secured creditors have been met.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DebtInstrumentSeniorityTypeCode
	 * DebtInstrumentSeniorityTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SBOD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubordinatedDebt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Debt owed to an unsecured creditor that can only be paid, in the event of a liquidation, after the claims of secured creditors have been met."
	 * </li>
	 * </ul>
	 */
	public static final MMCode SubordinatedDebt = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubordinatedDebt";
			definition = "Debt owed to an unsecured creditor that can only be paid, in the event of a liquidation, after the claims of secured creditors have been met.";
			owner_lazy = () -> DebtInstrumentSeniorityTypeCode.mmObject();
			codeName = "SBOD";
		}
	};
	/**
	 * Debt that is either unsecured or has a lower priority than of another
	 * debt claim on the same asset or property.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DebtInstrumentSeniorityTypeCode
	 * DebtInstrumentSeniorityTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "JUND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "JuniorDebt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Debt that is either unsecured or has a lower priority than of another debt claim on the same asset or property."
	 * </li>
	 * </ul>
	 */
	public static final MMCode JuniorDebt = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "JuniorDebt";
			definition = "Debt that is either unsecured or has a lower priority than of another debt claim on the same asset or property.";
			owner_lazy = () -> DebtInstrumentSeniorityTypeCode.mmObject();
			codeName = "JUND";
		}
	};
	/**
	 * Other type of debts.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DebtInstrumentSeniorityTypeCode
	 * DebtInstrumentSeniorityTypeCode}</li>
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
	 * definition} = "Other type of debts."</li>
	 * </ul>
	 */
	public static final MMCode Other = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Other type of debts.";
			owner_lazy = () -> DebtInstrumentSeniorityTypeCode.mmObject();
			codeName = "OTHR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DebtInstrumentSeniorityTypeCode";
				definition = "Specifies the seniority type of a specific debt instrument.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DebtInstrumentSeniorityTypeCode.SeniorDebt, com.tools20022.repository.codeset.DebtInstrumentSeniorityTypeCode.MezzanineDebt,
						com.tools20022.repository.codeset.DebtInstrumentSeniorityTypeCode.SubordinatedDebt, com.tools20022.repository.codeset.DebtInstrumentSeniorityTypeCode.JuniorDebt,
						com.tools20022.repository.codeset.DebtInstrumentSeniorityTypeCode.Other);
			}
		});
		return mmObject_lazy.get();
	}
}