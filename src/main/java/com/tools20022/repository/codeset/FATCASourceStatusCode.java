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
import com.tools20022.repository.codeset.FATCASourceStatusCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the source of Foreign Account Tax Compliance Act (FATCA) status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FATCASourceStatusCode#Declared
 * FATCASourceStatusCode.mmDeclared}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FATCASourceStatusCode#Calculated
 * FATCASourceStatusCode.mmCalculated}</li>
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
 * "FATCASourceStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the source of Foreign Account Tax Compliance Act (FATCA) status."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class FATCASourceStatusCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Source of the Foreign Account Tax Compliance Act (FATCA) status is as
	 * declared by the investor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FATCASourceStatusCode
	 * FATCASourceStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DECL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Declared"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Source of the Foreign Account Tax Compliance Act (FATCA) status is as declared by the investor."
	 * </li>
	 * </ul>
	 */
	public static final FATCASourceStatusCode Declared = new FATCASourceStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Declared";
			definition = "Source of the Foreign Account Tax Compliance Act (FATCA) status is as declared by the investor.";
			owner_lazy = () -> com.tools20022.repository.codeset.FATCASourceStatusCode.mmObject();
			codeName = "DECL";
		}
	};
	/**
	 * Source of the Foreign Account Tax Compliance Act (FATCA) status
	 * calculated
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FATCASourceStatusCode
	 * FATCASourceStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CALC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Calculated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Source of the Foreign Account Tax Compliance Act (FATCA) status calculated"
	 * </li>
	 * </ul>
	 */
	public static final FATCASourceStatusCode Calculated = new FATCASourceStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Calculated";
			definition = "Source of the Foreign Account Tax Compliance Act (FATCA) status calculated";
			owner_lazy = () -> com.tools20022.repository.codeset.FATCASourceStatusCode.mmObject();
			codeName = "CALC";
		}
	};
	final static private LinkedHashMap<String, FATCASourceStatusCode> codesByName = new LinkedHashMap<>();

	protected FATCASourceStatusCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FATCASourceStatusCode";
				definition = "Specifies the source of Foreign Account Tax Compliance Act (FATCA) status.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FATCASourceStatusCode.Declared, com.tools20022.repository.codeset.FATCASourceStatusCode.Calculated);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Declared.getCodeName().get(), Declared);
		codesByName.put(Calculated.getCodeName().get(), Calculated);
	}

	public static FATCASourceStatusCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static FATCASourceStatusCode[] values() {
		FATCASourceStatusCode[] values = new FATCASourceStatusCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, FATCASourceStatusCode> {
		@Override
		public FATCASourceStatusCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(FATCASourceStatusCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}