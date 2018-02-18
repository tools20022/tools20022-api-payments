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
import com.tools20022.repository.codeset.ResolutionTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of resolution.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResolutionTypeCode#Ordinary
 * ResolutionTypeCode.Ordinary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResolutionTypeCode#Extraordinary
 * ResolutionTypeCode.Extraordinary}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ResolutionTypeCode#Special
 * ResolutionTypeCode.Special}</li>
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
 * <li>"ORDI"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ResolutionTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of resolution."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ResolutionTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Meeting resolution is ordinary and is not subject to any specific voting
	 * requirements.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResolutionTypeCode
	 * ResolutionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ORDI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Ordinary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Meeting resolution is ordinary and is not subject to any specific voting requirements."
	 * </li>
	 * </ul>
	 */
	public static final ResolutionTypeCode Ordinary = new ResolutionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Ordinary";
			definition = "Meeting resolution is ordinary and is not subject to any specific voting requirements.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResolutionTypeCode.mmObject();
			codeName = "ORDI";
		}
	};
	/**
	 * Meeting resolution is extraordinary and may be subject to specific voting
	 * requirements.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResolutionTypeCode
	 * ResolutionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Extraordinary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Meeting resolution is extraordinary and may be subject to specific voting requirements."
	 * </li>
	 * </ul>
	 */
	public static final ResolutionTypeCode Extraordinary = new ResolutionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Extraordinary";
			definition = "Meeting resolution is extraordinary and may be subject to specific voting requirements.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResolutionTypeCode.mmObject();
			codeName = "EXTR";
		}
	};
	/**
	 * Resolution that is neither ordinary nor extraordinary (eg. decision on an
	 * investment strategy).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResolutionTypeCode
	 * ResolutionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPCL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Special"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Resolution that is neither ordinary nor extraordinary (eg. decision on an investment strategy)."
	 * </li>
	 * </ul>
	 */
	public static final ResolutionTypeCode Special = new ResolutionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Special";
			definition = "Resolution that is neither ordinary nor extraordinary (eg. decision on an investment strategy).";
			owner_lazy = () -> com.tools20022.repository.codeset.ResolutionTypeCode.mmObject();
			codeName = "SPCL";
		}
	};
	final static private LinkedHashMap<String, ResolutionTypeCode> codesByName = new LinkedHashMap<>();

	protected ResolutionTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ORDI");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ResolutionTypeCode";
				definition = "Specifies the type of resolution.";
				code_lazy = () -> Arrays
						.asList(com.tools20022.repository.codeset.ResolutionTypeCode.Ordinary, com.tools20022.repository.codeset.ResolutionTypeCode.Extraordinary, com.tools20022.repository.codeset.ResolutionTypeCode.Special);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Ordinary.getCodeName().get(), Ordinary);
		codesByName.put(Extraordinary.getCodeName().get(), Extraordinary);
		codesByName.put(Special.getCodeName().get(), Special);
	}

	public static ResolutionTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ResolutionTypeCode[] values() {
		ResolutionTypeCode[] values = new ResolutionTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ResolutionTypeCode> {
		@Override
		public ResolutionTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ResolutionTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}