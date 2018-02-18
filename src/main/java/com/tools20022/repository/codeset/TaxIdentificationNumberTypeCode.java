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
import com.tools20022.repository.codeset.TaxIdentificationNumberTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of tax identification number.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxIdentificationNumberTypeCode#TaxIdentificationNumber
 * TaxIdentificationNumberTypeCode.TaxIdentificationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxIdentificationNumberTypeCode#GlobalIntermediaryIdentificationNumber
 * TaxIdentificationNumberTypeCode.GlobalIntermediaryIdentificationNumber}</li>
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
 * "TaxIdentificationNumberTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of tax identification number."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TaxIdentificationNumberTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Tax identification number.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxIdentificationNumberTypeCode
	 * TaxIdentificationNumberTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GTIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxIdentificationNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax identification number."</li>
	 * </ul>
	 */
	public static final TaxIdentificationNumberTypeCode TaxIdentificationNumber = new TaxIdentificationNumberTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxIdentificationNumber";
			definition = "Tax identification number.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxIdentificationNumberTypeCode.mmObject();
			codeName = "GTIN";
		}
	};
	/**
	 * Global intermediary tax identification number.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxIdentificationNumberTypeCode
	 * TaxIdentificationNumberTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GIIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GlobalIntermediaryIdentificationNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Global intermediary tax identification number."</li>
	 * </ul>
	 */
	public static final TaxIdentificationNumberTypeCode GlobalIntermediaryIdentificationNumber = new TaxIdentificationNumberTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GlobalIntermediaryIdentificationNumber";
			definition = "Global intermediary tax identification number.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxIdentificationNumberTypeCode.mmObject();
			codeName = "GIIN";
		}
	};
	final static private LinkedHashMap<String, TaxIdentificationNumberTypeCode> codesByName = new LinkedHashMap<>();

	protected TaxIdentificationNumberTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TaxIdentificationNumberTypeCode";
				definition = "Specifies the type of tax identification number.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TaxIdentificationNumberTypeCode.TaxIdentificationNumber,
						com.tools20022.repository.codeset.TaxIdentificationNumberTypeCode.GlobalIntermediaryIdentificationNumber);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(TaxIdentificationNumber.getCodeName().get(), TaxIdentificationNumber);
		codesByName.put(GlobalIntermediaryIdentificationNumber.getCodeName().get(), GlobalIntermediaryIdentificationNumber);
	}

	public static TaxIdentificationNumberTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TaxIdentificationNumberTypeCode[] values() {
		TaxIdentificationNumberTypeCode[] values = new TaxIdentificationNumberTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TaxIdentificationNumberTypeCode> {
		@Override
		public TaxIdentificationNumberTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TaxIdentificationNumberTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}