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
import com.tools20022.repository.codeset.Frequency10Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the regularity of an event.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.Frequency10Code#Never
 * Frequency10Code.mmNever}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Frequency10Code#Annual
 * Frequency10Code.mmAnnual}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Frequency10Code#Rate
 * Frequency10Code.mmRate}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Frequency10Code#SemiAnnual
 * Frequency10Code.mmSemiAnnual}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Frequency10Code#Quarterly
 * Frequency10Code.mmQuarterly}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.FrequencyCode FrequencyCode}</li>
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
 * "Frequency10Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the regularity of an event."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class Frequency10Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Frequency10Code
	 * Frequency10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Never"</li>
	 * </ul>
	 */
	public static final Frequency10Code Never = new Frequency10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Never";
			owner_lazy = () -> com.tools20022.repository.codeset.Frequency10Code.mmObject();
			codeName = FrequencyCode.Never.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Frequency10Code
	 * Frequency10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Annual"</li>
	 * </ul>
	 */
	public static final Frequency10Code Annual = new Frequency10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Annual";
			owner_lazy = () -> com.tools20022.repository.codeset.Frequency10Code.mmObject();
			codeName = FrequencyCode.Annual.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Frequency10Code
	 * Frequency10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rate"</li>
	 * </ul>
	 */
	public static final Frequency10Code Rate = new Frequency10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rate";
			owner_lazy = () -> com.tools20022.repository.codeset.Frequency10Code.mmObject();
			codeName = FrequencyCode.Rate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Frequency10Code
	 * Frequency10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SemiAnnual"</li>
	 * </ul>
	 */
	public static final Frequency10Code SemiAnnual = new Frequency10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SemiAnnual";
			owner_lazy = () -> com.tools20022.repository.codeset.Frequency10Code.mmObject();
			codeName = FrequencyCode.SemiAnnual.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Frequency10Code
	 * Frequency10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quarterly"</li>
	 * </ul>
	 */
	public static final Frequency10Code Quarterly = new Frequency10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Quarterly";
			owner_lazy = () -> com.tools20022.repository.codeset.Frequency10Code.mmObject();
			codeName = FrequencyCode.Quarterly.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, Frequency10Code> codesByName = new LinkedHashMap<>();

	protected Frequency10Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Frequency10Code";
				definition = "Specifies the regularity of an event.";
				trace_lazy = () -> FrequencyCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.Frequency10Code.Never, com.tools20022.repository.codeset.Frequency10Code.Annual, com.tools20022.repository.codeset.Frequency10Code.Rate,
						com.tools20022.repository.codeset.Frequency10Code.SemiAnnual, com.tools20022.repository.codeset.Frequency10Code.Quarterly);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Never.getCodeName().get(), Never);
		codesByName.put(Annual.getCodeName().get(), Annual);
		codesByName.put(Rate.getCodeName().get(), Rate);
		codesByName.put(SemiAnnual.getCodeName().get(), SemiAnnual);
		codesByName.put(Quarterly.getCodeName().get(), Quarterly);
	}

	public static Frequency10Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static Frequency10Code[] values() {
		Frequency10Code[] values = new Frequency10Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, Frequency10Code> {
		@Override
		public Frequency10Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(Frequency10Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}