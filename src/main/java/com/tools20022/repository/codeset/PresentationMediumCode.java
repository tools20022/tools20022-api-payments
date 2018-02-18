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
import com.tools20022.repository.codeset.PresentationMediumCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the presentation medium.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PresentationMediumCode#Paper
 * PresentationMediumCode.Paper}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PresentationMediumCode#Electronic
 * PresentationMediumCode.Electronic}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PresentationMediumCode#PaperElectronic
 * PresentationMediumCode.PaperElectronic}</li>
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
 * <li>"PAPR"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PresentationMediumCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the presentation medium."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PresentationMediumCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Presentation is made on paper.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PresentationMediumCode
	 * PresentationMediumCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PAPR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Paper"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Presentation is made on paper."</li>
	 * </ul>
	 */
	public static final PresentationMediumCode Paper = new PresentationMediumCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Paper";
			definition = "Presentation is made on paper.";
			owner_lazy = () -> com.tools20022.repository.codeset.PresentationMediumCode.mmObject();
			codeName = "PAPR";
		}
	};
	/**
	 * Presentation is made electronically.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PresentationMediumCode
	 * PresentationMediumCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ELEC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Electronic"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Presentation is made electronically."</li>
	 * </ul>
	 */
	public static final PresentationMediumCode Electronic = new PresentationMediumCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Electronic";
			definition = "Presentation is made electronically.";
			owner_lazy = () -> com.tools20022.repository.codeset.PresentationMediumCode.mmObject();
			codeName = "ELEC";
		}
	};
	/**
	 * Presentation is made on paper and/or electronically.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PresentationMediumCode
	 * PresentationMediumCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BOTH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaperElectronic"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Presentation is made on paper and/or electronically."</li>
	 * </ul>
	 */
	public static final PresentationMediumCode PaperElectronic = new PresentationMediumCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaperElectronic";
			definition = "Presentation is made on paper and/or electronically.";
			owner_lazy = () -> com.tools20022.repository.codeset.PresentationMediumCode.mmObject();
			codeName = "BOTH";
		}
	};
	final static private LinkedHashMap<String, PresentationMediumCode> codesByName = new LinkedHashMap<>();

	protected PresentationMediumCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("PAPR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PresentationMediumCode";
				definition = "Specifies the presentation medium.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PresentationMediumCode.Paper, com.tools20022.repository.codeset.PresentationMediumCode.Electronic,
						com.tools20022.repository.codeset.PresentationMediumCode.PaperElectronic);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Paper.getCodeName().get(), Paper);
		codesByName.put(Electronic.getCodeName().get(), Electronic);
		codesByName.put(PaperElectronic.getCodeName().get(), PaperElectronic);
	}

	public static PresentationMediumCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PresentationMediumCode[] values() {
		PresentationMediumCode[] values = new PresentationMediumCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PresentationMediumCode> {
		@Override
		public PresentationMediumCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PresentationMediumCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}