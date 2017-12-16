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
import com.tools20022.repository.codeset.DebtInstrumentSeniorityTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the seniority type of a specific debt instrument.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DebtInstrumentSeniorityTypeCode#SeniorDebt
 * DebtInstrumentSeniorityTypeCode.mmSeniorDebt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DebtInstrumentSeniorityTypeCode#MezzanineDebt
 * DebtInstrumentSeniorityTypeCode.mmMezzanineDebt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DebtInstrumentSeniorityTypeCode#SubordinatedDebt
 * DebtInstrumentSeniorityTypeCode.mmSubordinatedDebt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DebtInstrumentSeniorityTypeCode#JuniorDebt
 * DebtInstrumentSeniorityTypeCode.mmJuniorDebt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DebtInstrumentSeniorityTypeCode#Other
 * DebtInstrumentSeniorityTypeCode.mmOther}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DebtInstrumentSeniorityTypeCode extends MMCode {

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
	public static final DebtInstrumentSeniorityTypeCode SeniorDebt = new DebtInstrumentSeniorityTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SeniorDebt";
			definition = "Debt that takes priority over other unsecured or otherwise more junior debt owed by the issuer.";
			owner_lazy = () -> com.tools20022.repository.codeset.DebtInstrumentSeniorityTypeCode.mmObject();
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
	public static final DebtInstrumentSeniorityTypeCode MezzanineDebt = new DebtInstrumentSeniorityTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MezzanineDebt";
			definition = "Subordinated debt or preferred equity instrument that represents a claim on a company's assets which is senior only to that of the common shares.";
			owner_lazy = () -> com.tools20022.repository.codeset.DebtInstrumentSeniorityTypeCode.mmObject();
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
	public static final DebtInstrumentSeniorityTypeCode SubordinatedDebt = new DebtInstrumentSeniorityTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubordinatedDebt";
			definition = "Debt owed to an unsecured creditor that can only be paid, in the event of a liquidation, after the claims of secured creditors have been met.";
			owner_lazy = () -> com.tools20022.repository.codeset.DebtInstrumentSeniorityTypeCode.mmObject();
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
	public static final DebtInstrumentSeniorityTypeCode JuniorDebt = new DebtInstrumentSeniorityTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "JuniorDebt";
			definition = "Debt that is either unsecured or has a lower priority than of another debt claim on the same asset or property.";
			owner_lazy = () -> com.tools20022.repository.codeset.DebtInstrumentSeniorityTypeCode.mmObject();
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
	public static final DebtInstrumentSeniorityTypeCode Other = new DebtInstrumentSeniorityTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Other type of debts.";
			owner_lazy = () -> com.tools20022.repository.codeset.DebtInstrumentSeniorityTypeCode.mmObject();
			codeName = "OTHR";
		}
	};
	final static private LinkedHashMap<String, DebtInstrumentSeniorityTypeCode> codesByName = new LinkedHashMap<>();

	protected DebtInstrumentSeniorityTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DebtInstrumentSeniorityTypeCode";
				definition = "Specifies the seniority type of a specific debt instrument.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DebtInstrumentSeniorityTypeCode.SeniorDebt, com.tools20022.repository.codeset.DebtInstrumentSeniorityTypeCode.MezzanineDebt,
						com.tools20022.repository.codeset.DebtInstrumentSeniorityTypeCode.SubordinatedDebt, com.tools20022.repository.codeset.DebtInstrumentSeniorityTypeCode.JuniorDebt,
						com.tools20022.repository.codeset.DebtInstrumentSeniorityTypeCode.Other);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(SeniorDebt.getCodeName().get(), SeniorDebt);
		codesByName.put(MezzanineDebt.getCodeName().get(), MezzanineDebt);
		codesByName.put(SubordinatedDebt.getCodeName().get(), SubordinatedDebt);
		codesByName.put(JuniorDebt.getCodeName().get(), JuniorDebt);
		codesByName.put(Other.getCodeName().get(), Other);
	}

	public static DebtInstrumentSeniorityTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DebtInstrumentSeniorityTypeCode[] values() {
		DebtInstrumentSeniorityTypeCode[] values = new DebtInstrumentSeniorityTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DebtInstrumentSeniorityTypeCode> {
		@Override
		public DebtInstrumentSeniorityTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DebtInstrumentSeniorityTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}