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
 * Specifies the regulatory restrictions applicable to a security.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LegalRestrictionsCode#mmJurisdictionOwnership
 * LegalRestrictionsCode.mmJurisdictionOwnership}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LegalRestrictionsCode#mmPrivatePlacements
 * LegalRestrictionsCode.mmPrivatePlacements}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LegalRestrictionsCode#mmAccreditedInvestor
 * LegalRestrictionsCode.mmAccreditedInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LegalRestrictionsCode#mmMargin
 * LegalRestrictionsCode.mmMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LegalRestrictionsCode#mmPrivilege
 * LegalRestrictionsCode.mmPrivilege}</li>
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
 * <li>"JURO"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "LegalRestrictionsCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the regulatory restrictions applicable to a security."</li>
 * </ul>
 */
public class LegalRestrictionsCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Investors outside this jurisdiction can purchase this security, for
	 * example, a Reg S security can only be held by an investor outside the US.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LegalRestrictionsCode
	 * LegalRestrictionsCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "JURO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "JurisdictionOwnership"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investors outside this jurisdiction can purchase this security, for example, a Reg S security can only be held by an investor outside the US."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmJurisdictionOwnership = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "JurisdictionOwnership";
			definition = "Investors outside this jurisdiction can purchase this security, for example, a Reg S security can only be held by an investor outside the US.";
			owner_lazy = () -> LegalRestrictionsCode.mmObject();
			codeName = "JURO";
		}
	};
	/**
	 * Only investors qualified by the issuer in this jurisdiction may purchase
	 * this security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LegalRestrictionsCode
	 * LegalRestrictionsCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PPLA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrivatePlacements"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only investors qualified by the issuer in this jurisdiction may purchase this security."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPrivatePlacements = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PrivatePlacements";
			definition = "Only investors qualified by the issuer in this jurisdiction may purchase this security.";
			owner_lazy = () -> LegalRestrictionsCode.mmObject();
			codeName = "PPLA";
		}
	};
	/**
	 * Only investors qualified by the regulator in this jurisdiction may
	 * purchase this security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LegalRestrictionsCode
	 * LegalRestrictionsCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACRI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccreditedInvestor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only investors qualified by the regulator in this jurisdiction may purchase this security."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAccreditedInvestor = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccreditedInvestor";
			definition = "Only investors qualified by the regulator in this jurisdiction may purchase this security.";
			owner_lazy = () -> LegalRestrictionsCode.mmObject();
			codeName = "ACRI";
		}
	};
	/**
	 * Issuer defines whether the security may be purchased with borrowed money
	 * (US and Japan).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LegalRestrictionsCode
	 * LegalRestrictionsCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MARG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Margin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Issuer defines whether the security may be purchased with borrowed money (US and Japan)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmMargin = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Margin";
			definition = "Issuer defines whether the security may be purchased with borrowed money (US and Japan).";
			owner_lazy = () -> LegalRestrictionsCode.mmObject();
			codeName = "MARG";
		}
	};
	/**
	 * Privileges, for example, voting rights, of holding the security may be
	 * restricted by the issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LegalRestrictionsCode
	 * LegalRestrictionsCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRIV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Privilege"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Privileges, for example, voting rights, of holding the security may be restricted by the issuer."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPrivilege = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Privilege";
			definition = "Privileges, for example, voting rights, of holding the security may be restricted by the issuer.";
			owner_lazy = () -> LegalRestrictionsCode.mmObject();
			codeName = "PRIV";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("JURO");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "LegalRestrictionsCode";
				definition = "Specifies the regulatory restrictions applicable to a security.";
				code_lazy = () -> Arrays.asList(LegalRestrictionsCode.mmJurisdictionOwnership, LegalRestrictionsCode.mmPrivatePlacements, LegalRestrictionsCode.mmAccreditedInvestor, LegalRestrictionsCode.mmMargin,
						LegalRestrictionsCode.mmPrivilege);
			}
		});
		return mmObject_lazy.get();
	}
}