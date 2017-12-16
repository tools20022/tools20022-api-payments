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
import com.tools20022.repository.codeset.StampDutyTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies if the stamp duty is applicable
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StampDutyTypeCode#OutsideCSD
 * StampDutyTypeCode.mmOutsideCSD}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.StampDutyTypeCode#Paid
 * StampDutyTypeCode.mmPaid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StampDutyTypeCode#NotApplicable
 * StampDutyTypeCode.mmNotApplicable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StampDutyTypeCode#Exemption
 * StampDutyTypeCode.mmExemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StampDutyTypeCode#Applicable
 * StampDutyTypeCode.mmApplicable}</li>
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
 * <li>"SDRU"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "StampDutyTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies if the stamp duty is applicable"</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class StampDutyTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * SDRT paid outside of CSD on corporate action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StampDutyTypeCode
	 * StampDutyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SDRU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OutsideCSD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "SDRT paid outside of CSD on corporate action."</li>
	 * </ul>
	 */
	public static final StampDutyTypeCode OutsideCSD = new StampDutyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OutsideCSD";
			definition = "SDRT paid outside of CSD on corporate action.";
			owner_lazy = () -> com.tools20022.repository.codeset.StampDutyTypeCode.mmObject();
			codeName = "SDRU";
		}
	};
	/**
	 * SDRT paid on another transaction
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StampDutyTypeCode
	 * StampDutyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SDRT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Paid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "SDRT paid on another transaction"</li>
	 * </ul>
	 */
	public static final StampDutyTypeCode Paid = new StampDutyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Paid";
			definition = "SDRT paid on another transaction";
			owner_lazy = () -> com.tools20022.repository.codeset.StampDutyTypeCode.mmObject();
			codeName = "SDRT";
		}
	};
	/**
	 * Stamp duty not applicable.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StampDutyTypeCode
	 * StampDutyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SDRN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotApplicable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Stamp duty not applicable."</li>
	 * </ul>
	 */
	public static final StampDutyTypeCode NotApplicable = new StampDutyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotApplicable";
			definition = "Stamp duty not applicable.";
			owner_lazy = () -> com.tools20022.repository.codeset.StampDutyTypeCode.mmObject();
			codeName = "SDRN";
		}
	};
	/**
	 * Exempt, for any other reason.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StampDutyTypeCode
	 * StampDutyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SDRQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Exemption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Exempt, for any other reason."</li>
	 * </ul>
	 */
	public static final StampDutyTypeCode Exemption = new StampDutyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Exemption";
			definition = "Exempt, for any other reason.";
			owner_lazy = () -> com.tools20022.repository.codeset.StampDutyTypeCode.mmObject();
			codeName = "SDRQ";
		}
	};
	/**
	 * Stamps duty is applicable.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StampDutyTypeCode
	 * StampDutyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ASTD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Applicable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Stamps duty is applicable."</li>
	 * </ul>
	 */
	public static final StampDutyTypeCode Applicable = new StampDutyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Applicable";
			definition = "Stamps duty is applicable.";
			owner_lazy = () -> com.tools20022.repository.codeset.StampDutyTypeCode.mmObject();
			codeName = "ASTD";
		}
	};
	final static private LinkedHashMap<String, StampDutyTypeCode> codesByName = new LinkedHashMap<>();

	protected StampDutyTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("SDRU");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StampDutyTypeCode";
				definition = "Specifies if the stamp duty is applicable";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.StampDutyTypeCode.OutsideCSD, com.tools20022.repository.codeset.StampDutyTypeCode.Paid, com.tools20022.repository.codeset.StampDutyTypeCode.NotApplicable,
						com.tools20022.repository.codeset.StampDutyTypeCode.Exemption, com.tools20022.repository.codeset.StampDutyTypeCode.Applicable);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(OutsideCSD.getCodeName().get(), OutsideCSD);
		codesByName.put(Paid.getCodeName().get(), Paid);
		codesByName.put(NotApplicable.getCodeName().get(), NotApplicable);
		codesByName.put(Exemption.getCodeName().get(), Exemption);
		codesByName.put(Applicable.getCodeName().get(), Applicable);
	}

	public static StampDutyTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static StampDutyTypeCode[] values() {
		StampDutyTypeCode[] values = new StampDutyTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, StampDutyTypeCode> {
		@Override
		public StampDutyTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(StampDutyTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}