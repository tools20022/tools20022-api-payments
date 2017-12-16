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
import com.tools20022.repository.codeset.CRSSourceStatusCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the source of Common Reporting Standard (CRS) status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CRSSourceStatusCode#Calculated
 * CRSSourceStatusCode.mmCalculated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CRSSourceStatusCode#Declared
 * CRSSourceStatusCode.mmDeclared}</li>
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
 * "CRSSourceStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the source of Common Reporting Standard (CRS) status."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CRSSourceStatusCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Source of the Common Reporting Standard (CRS) status is calculated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CRSSourceStatusCode
	 * CRSSourceStatusCode}</li>
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
	 * "Source of the Common Reporting Standard (CRS) status is calculated."</li>
	 * </ul>
	 */
	public static final CRSSourceStatusCode Calculated = new CRSSourceStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Calculated";
			definition = "Source of the Common Reporting Standard (CRS) status is calculated.";
			owner_lazy = () -> com.tools20022.repository.codeset.CRSSourceStatusCode.mmObject();
			codeName = "CALC";
		}
	};
	/**
	 * Source of the Common Reporting Standard (CRS) status is as declared by
	 * the investor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CRSSourceStatusCode
	 * CRSSourceStatusCode}</li>
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
	 * "Source of the Common Reporting Standard (CRS) status is as declared by the investor."
	 * </li>
	 * </ul>
	 */
	public static final CRSSourceStatusCode Declared = new CRSSourceStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Declared";
			definition = "Source of the Common Reporting Standard (CRS) status is as declared by the investor.";
			owner_lazy = () -> com.tools20022.repository.codeset.CRSSourceStatusCode.mmObject();
			codeName = "DECL";
		}
	};
	final static private LinkedHashMap<String, CRSSourceStatusCode> codesByName = new LinkedHashMap<>();

	protected CRSSourceStatusCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CRSSourceStatusCode";
				definition = "Specifies the source of Common Reporting Standard (CRS) status.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CRSSourceStatusCode.Calculated, com.tools20022.repository.codeset.CRSSourceStatusCode.Declared);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Calculated.getCodeName().get(), Calculated);
		codesByName.put(Declared.getCodeName().get(), Declared);
	}

	public static CRSSourceStatusCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CRSSourceStatusCode[] values() {
		CRSSourceStatusCode[] values = new CRSSourceStatusCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CRSSourceStatusCode> {
		@Override
		public CRSSourceStatusCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CRSSourceStatusCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}