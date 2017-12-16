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
import com.tools20022.repository.codeset.RemarketingMarginTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of margin.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RemarketingMarginTypeCode#Agreed
 * RemarketingMarginTypeCode.mmAgreed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RemarketingMarginTypeCode#Alternative
 * RemarketingMarginTypeCode.mmAlternative}</li>
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
 * <li>"AGRE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RemarketingMarginTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of margin."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RemarketingMarginTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Agreed margin.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RemarketingMarginTypeCode
	 * RemarketingMarginTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AGRE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Agreed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Agreed margin."</li>
	 * </ul>
	 */
	public static final RemarketingMarginTypeCode Agreed = new RemarketingMarginTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Agreed";
			definition = "Agreed margin.";
			owner_lazy = () -> com.tools20022.repository.codeset.RemarketingMarginTypeCode.mmObject();
			codeName = "AGRE";
		}
	};
	/**
	 * Alternative margin.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RemarketingMarginTypeCode
	 * RemarketingMarginTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ALTE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Alternative"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Alternative margin."</li>
	 * </ul>
	 */
	public static final RemarketingMarginTypeCode Alternative = new RemarketingMarginTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Alternative";
			definition = "Alternative margin.";
			owner_lazy = () -> com.tools20022.repository.codeset.RemarketingMarginTypeCode.mmObject();
			codeName = "ALTE";
		}
	};
	final static private LinkedHashMap<String, RemarketingMarginTypeCode> codesByName = new LinkedHashMap<>();

	protected RemarketingMarginTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("AGRE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RemarketingMarginTypeCode";
				definition = "Specifies the type of margin.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RemarketingMarginTypeCode.Agreed, com.tools20022.repository.codeset.RemarketingMarginTypeCode.Alternative);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Agreed.getCodeName().get(), Agreed);
		codesByName.put(Alternative.getCodeName().get(), Alternative);
	}

	public static RemarketingMarginTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RemarketingMarginTypeCode[] values() {
		RemarketingMarginTypeCode[] values = new RemarketingMarginTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RemarketingMarginTypeCode> {
		@Override
		public RemarketingMarginTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RemarketingMarginTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}