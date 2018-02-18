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
import com.tools20022.repository.codeset.CorporateActionEventProcessingTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of event processing.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventProcessingTypeCode#General
 * CorporateActionEventProcessingTypeCode.General}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventProcessingTypeCode#Distribution
 * CorporateActionEventProcessingTypeCode.Distribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventProcessingTypeCode#Reorganisation
 * CorporateActionEventProcessingTypeCode.Reorganisation}</li>
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
 * <li>"GENL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionEventProcessingTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of event processing."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CorporateActionEventProcessingTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * No debit or credit of resources.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventProcessingTypeCode
	 * CorporateActionEventProcessingTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GENL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "General"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "No debit or credit of resources."</li>
	 * </ul>
	 */
	public static final CorporateActionEventProcessingTypeCode General = new CorporateActionEventProcessingTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "General";
			definition = "No debit or credit of resources.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventProcessingTypeCode.mmObject();
			codeName = "GENL";
		}
	};
	/**
	 * Holder of the relevant security on a certain date, for example, the
	 * record date, will receive a benefit without giving up the underlying
	 * security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventProcessingTypeCode
	 * CorporateActionEventProcessingTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DISN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Distribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Holder of the relevant security on a certain date, for example, the record date, will receive a benefit without giving up the underlying security."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventProcessingTypeCode Distribution = new CorporateActionEventProcessingTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Distribution";
			definition = "Holder of the relevant security on a certain date, for example, the record date, will receive a benefit without giving up the underlying security.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventProcessingTypeCode.mmObject();
			codeName = "DISN";
		}
	};
	/**
	 * Underlying security will be debited and may be replaced by another
	 * resource (or resources).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventProcessingTypeCode
	 * CorporateActionEventProcessingTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REOR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reorganisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Underlying security will be debited and may be replaced by another resource (or resources)."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventProcessingTypeCode Reorganisation = new CorporateActionEventProcessingTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Reorganisation";
			definition = "Underlying security will be debited and may be replaced by another resource (or resources).";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventProcessingTypeCode.mmObject();
			codeName = "REOR";
		}
	};
	final static private LinkedHashMap<String, CorporateActionEventProcessingTypeCode> codesByName = new LinkedHashMap<>();

	protected CorporateActionEventProcessingTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("GENL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionEventProcessingTypeCode";
				definition = "Specifies the type of event processing.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionEventProcessingTypeCode.General, com.tools20022.repository.codeset.CorporateActionEventProcessingTypeCode.Distribution,
						com.tools20022.repository.codeset.CorporateActionEventProcessingTypeCode.Reorganisation);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(General.getCodeName().get(), General);
		codesByName.put(Distribution.getCodeName().get(), Distribution);
		codesByName.put(Reorganisation.getCodeName().get(), Reorganisation);
	}

	public static CorporateActionEventProcessingTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CorporateActionEventProcessingTypeCode[] values() {
		CorporateActionEventProcessingTypeCode[] values = new CorporateActionEventProcessingTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CorporateActionEventProcessingTypeCode> {
		@Override
		public CorporateActionEventProcessingTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CorporateActionEventProcessingTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}