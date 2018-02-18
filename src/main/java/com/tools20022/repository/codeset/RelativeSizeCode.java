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

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.RelativeSizeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * A type of quantity of financial instrument expressed in a relative size.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.RelativeSizeCode#Small
 * RelativeSizeCode.Small}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RelativeSizeCode#Medium
 * RelativeSizeCode.Medium}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RelativeSizeCode#Large
 * RelativeSizeCode.Large}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RelativeSizeCode#Undisclosed
 * RelativeSizeCode.Undisclosed}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
 * semanticMarkup} = FIXSynonym: 27</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"SMAL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RelativeSizeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "A type of quantity of financial instrument expressed in a relative size."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RelativeSizeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates that the relative size is small.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RelativeSizeCode
	 * RelativeSizeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SMAL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 27</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Small"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates that the relative size is small."</li>
	 * </ul>
	 */
	public static final RelativeSizeCode Small = new RelativeSizeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "27"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Small";
			definition = "Indicates that the relative size is small.";
			owner_lazy = () -> com.tools20022.repository.codeset.RelativeSizeCode.mmObject();
			codeName = "SMAL";
		}
	};
	/**
	 * Indicates that the relative size is medium.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RelativeSizeCode
	 * RelativeSizeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MEDI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 27</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Medium"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates that the relative size is medium."</li>
	 * </ul>
	 */
	public static final RelativeSizeCode Medium = new RelativeSizeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "27"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Medium";
			definition = "Indicates that the relative size is medium.";
			owner_lazy = () -> com.tools20022.repository.codeset.RelativeSizeCode.mmObject();
			codeName = "MEDI";
		}
	};
	/**
	 * Indicates that the relative size is large.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RelativeSizeCode
	 * RelativeSizeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LARG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 27</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Large"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates that the relative size is large."</li>
	 * </ul>
	 */
	public static final RelativeSizeCode Large = new RelativeSizeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "27"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Large";
			definition = "Indicates that the relative size is large.";
			owner_lazy = () -> com.tools20022.repository.codeset.RelativeSizeCode.mmObject();
			codeName = "LARG";
		}
	};
	/**
	 * Indicates that the quantity is undisclosed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RelativeSizeCode
	 * RelativeSizeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UNDI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Undisclosed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates that the quantity is undisclosed."</li>
	 * </ul>
	 */
	public static final RelativeSizeCode Undisclosed = new RelativeSizeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Undisclosed";
			definition = "Indicates that the quantity is undisclosed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RelativeSizeCode.mmObject();
			codeName = "UNDI";
		}
	};
	final static private LinkedHashMap<String, RelativeSizeCode> codesByName = new LinkedHashMap<>();

	protected RelativeSizeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "27"));
				example = Arrays.asList("SMAL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RelativeSizeCode";
				definition = "A type of quantity of financial instrument expressed in a relative size.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RelativeSizeCode.Small, com.tools20022.repository.codeset.RelativeSizeCode.Medium, com.tools20022.repository.codeset.RelativeSizeCode.Large,
						com.tools20022.repository.codeset.RelativeSizeCode.Undisclosed);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Small.getCodeName().get(), Small);
		codesByName.put(Medium.getCodeName().get(), Medium);
		codesByName.put(Large.getCodeName().get(), Large);
		codesByName.put(Undisclosed.getCodeName().get(), Undisclosed);
	}

	public static RelativeSizeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RelativeSizeCode[] values() {
		RelativeSizeCode[] values = new RelativeSizeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RelativeSizeCode> {
		@Override
		public RelativeSizeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RelativeSizeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}