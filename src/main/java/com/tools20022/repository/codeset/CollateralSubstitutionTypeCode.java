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
import com.tools20022.repository.codeset.CollateralSubstitutionTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies if the collateral that is substituted was posted against the
 * variation margin or the independent amount.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CollateralSubstitutionTypeCode#AgainstVariationMargin
 * CollateralSubstitutionTypeCode.AgainstVariationMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CollateralSubstitutionTypeCode#AgainstSegregatedIndependentAmount
 * CollateralSubstitutionTypeCode.AgainstSegregatedIndependentAmount}</li>
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
 * <li>"AVMG"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CollateralSubstitutionTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies if the collateral that is substituted was posted against the variation margin or the independent amount."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CollateralSubstitutionTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies if the collateral that is substituted was posted against the
	 * variation margin.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralSubstitutionTypeCode
	 * CollateralSubstitutionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AVMG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgainstVariationMargin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if the collateral that is substituted was posted against the variation margin."
	 * </li>
	 * </ul>
	 */
	public static final CollateralSubstitutionTypeCode AgainstVariationMargin = new CollateralSubstitutionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgainstVariationMargin";
			definition = "Specifies if the collateral that is substituted was posted against the variation margin.";
			owner_lazy = () -> com.tools20022.repository.codeset.CollateralSubstitutionTypeCode.mmObject();
			codeName = "AVMG";
		}
	};
	/**
	 * Specifies if the collateral that is substituted was posted against the
	 * independent amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralSubstitutionTypeCode
	 * CollateralSubstitutionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ASIA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgainstSegregatedIndependentAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if the collateral that is substituted was posted against the independent amount."
	 * </li>
	 * </ul>
	 */
	public static final CollateralSubstitutionTypeCode AgainstSegregatedIndependentAmount = new CollateralSubstitutionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgainstSegregatedIndependentAmount";
			definition = "Specifies if the collateral that is substituted was posted against the independent amount.";
			owner_lazy = () -> com.tools20022.repository.codeset.CollateralSubstitutionTypeCode.mmObject();
			codeName = "ASIA";
		}
	};
	final static private LinkedHashMap<String, CollateralSubstitutionTypeCode> codesByName = new LinkedHashMap<>();

	protected CollateralSubstitutionTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("AVMG");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CollateralSubstitutionTypeCode";
				definition = "Specifies if the collateral that is substituted was posted against the variation margin or the independent amount.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CollateralSubstitutionTypeCode.AgainstVariationMargin, com.tools20022.repository.codeset.CollateralSubstitutionTypeCode.AgainstSegregatedIndependentAmount);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AgainstVariationMargin.getCodeName().get(), AgainstVariationMargin);
		codesByName.put(AgainstSegregatedIndependentAmount.getCodeName().get(), AgainstSegregatedIndependentAmount);
	}

	public static CollateralSubstitutionTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CollateralSubstitutionTypeCode[] values() {
		CollateralSubstitutionTypeCode[] values = new CollateralSubstitutionTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CollateralSubstitutionTypeCode> {
		@Override
		public CollateralSubstitutionTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CollateralSubstitutionTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}