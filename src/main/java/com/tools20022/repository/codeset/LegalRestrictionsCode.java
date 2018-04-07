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
import com.tools20022.repository.codeset.LegalRestrictionsCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the regulatory restrictions applicable to a security.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LegalRestrictionsCode#JurisdictionOwnership
 * LegalRestrictionsCode.JurisdictionOwnership}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LegalRestrictionsCode#PrivatePlacements
 * LegalRestrictionsCode.PrivatePlacements}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LegalRestrictionsCode#AccreditedInvestor
 * LegalRestrictionsCode.AccreditedInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LegalRestrictionsCode#Margin
 * LegalRestrictionsCode.Margin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LegalRestrictionsCode#Privilege
 * LegalRestrictionsCode.Privilege}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LegalRestrictionsCode#USLegal144A
 * LegalRestrictionsCode.USLegal144A}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LegalRestrictionsCode#NoRestrictions
 * LegalRestrictionsCode.NoRestrictions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LegalRestrictionsCode#Restrictions
 * LegalRestrictionsCode.Restrictions}</li>
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
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class LegalRestrictionsCode extends MMCode {

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
	public static final LegalRestrictionsCode JurisdictionOwnership = new LegalRestrictionsCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "JurisdictionOwnership";
			definition = "Investors outside this jurisdiction can purchase this security, for example, a Reg S security can only be held by an investor outside the US.";
			owner_lazy = () -> com.tools20022.repository.codeset.LegalRestrictionsCode.mmObject();
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
	public static final LegalRestrictionsCode PrivatePlacements = new LegalRestrictionsCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PrivatePlacements";
			definition = "Only investors qualified by the issuer in this jurisdiction may purchase this security.";
			owner_lazy = () -> com.tools20022.repository.codeset.LegalRestrictionsCode.mmObject();
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
	public static final LegalRestrictionsCode AccreditedInvestor = new LegalRestrictionsCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccreditedInvestor";
			definition = "Only investors qualified by the regulator in this jurisdiction may purchase this security.";
			owner_lazy = () -> com.tools20022.repository.codeset.LegalRestrictionsCode.mmObject();
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
	public static final LegalRestrictionsCode Margin = new LegalRestrictionsCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Margin";
			definition = "Issuer defines whether the security may be purchased with borrowed money (US and Japan).";
			owner_lazy = () -> com.tools20022.repository.codeset.LegalRestrictionsCode.mmObject();
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
	public static final LegalRestrictionsCode Privilege = new LegalRestrictionsCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Privilege";
			definition = "Privileges, for example, voting rights, of holding the security may be restricted by the issuer.";
			owner_lazy = () -> com.tools20022.repository.codeset.LegalRestrictionsCode.mmObject();
			codeName = "PRIV";
		}
	};
	/**
	 * Ownership or transfer of an unregistered security issued, pursuant to US
	 * legal restrictions 144A.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LegalRestrictionsCode
	 * LegalRestrictionsCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "USLE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USLegal144A"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Ownership or transfer of an unregistered security issued, pursuant to US legal restrictions 144A."
	 * </li>
	 * </ul>
	 */
	public static final LegalRestrictionsCode USLegal144A = new LegalRestrictionsCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "USLegal144A";
			definition = "Ownership or transfer of an unregistered security issued, pursuant to US legal restrictions 144A.";
			owner_lazy = () -> com.tools20022.repository.codeset.LegalRestrictionsCode.mmObject();
			codeName = "USLE";
		}
	};
	/**
	 * Ownership or transfer of a security that is not subject to restrictions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LegalRestrictionsCode
	 * LegalRestrictionsCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NORE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoRestrictions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Ownership or transfer of a security that is not subject to restrictions."
	 * </li>
	 * </ul>
	 */
	public static final LegalRestrictionsCode NoRestrictions = new LegalRestrictionsCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NoRestrictions";
			definition = "Ownership or transfer of a security that is not subject to restrictions.";
			owner_lazy = () -> com.tools20022.repository.codeset.LegalRestrictionsCode.mmObject();
			codeName = "NORE";
		}
	};
	/**
	 * Ownership or transfer of a security that is subject to restrictions, and
	 * not pursuant to 144A.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LegalRestrictionsCode
	 * LegalRestrictionsCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Restrictions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Ownership or transfer of a security that is subject to restrictions, and not pursuant to 144A."
	 * </li>
	 * </ul>
	 */
	public static final LegalRestrictionsCode Restrictions = new LegalRestrictionsCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Restrictions";
			definition = "Ownership or transfer of a security that is subject to restrictions, and not pursuant to 144A.";
			owner_lazy = () -> com.tools20022.repository.codeset.LegalRestrictionsCode.mmObject();
			codeName = "REST";
		}
	};
	final static private LinkedHashMap<String, LegalRestrictionsCode> codesByName = new LinkedHashMap<>();

	protected LegalRestrictionsCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("JURO");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "LegalRestrictionsCode";
				definition = "Specifies the regulatory restrictions applicable to a security.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.LegalRestrictionsCode.JurisdictionOwnership, com.tools20022.repository.codeset.LegalRestrictionsCode.PrivatePlacements,
						com.tools20022.repository.codeset.LegalRestrictionsCode.AccreditedInvestor, com.tools20022.repository.codeset.LegalRestrictionsCode.Margin, com.tools20022.repository.codeset.LegalRestrictionsCode.Privilege,
						com.tools20022.repository.codeset.LegalRestrictionsCode.USLegal144A, com.tools20022.repository.codeset.LegalRestrictionsCode.NoRestrictions, com.tools20022.repository.codeset.LegalRestrictionsCode.Restrictions);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(JurisdictionOwnership.getCodeName().get(), JurisdictionOwnership);
		codesByName.put(PrivatePlacements.getCodeName().get(), PrivatePlacements);
		codesByName.put(AccreditedInvestor.getCodeName().get(), AccreditedInvestor);
		codesByName.put(Margin.getCodeName().get(), Margin);
		codesByName.put(Privilege.getCodeName().get(), Privilege);
		codesByName.put(USLegal144A.getCodeName().get(), USLegal144A);
		codesByName.put(NoRestrictions.getCodeName().get(), NoRestrictions);
		codesByName.put(Restrictions.getCodeName().get(), Restrictions);
	}

	public static LegalRestrictionsCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static LegalRestrictionsCode[] values() {
		LegalRestrictionsCode[] values = new LegalRestrictionsCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, LegalRestrictionsCode> {
		@Override
		public LegalRestrictionsCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(LegalRestrictionsCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}