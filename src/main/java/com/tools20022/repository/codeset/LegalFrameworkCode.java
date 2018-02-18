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
import com.tools20022.repository.codeset.LegalFrameworkCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Identifies the legal framework of the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LegalFrameworkCode#PensionLivree
 * LegalFrameworkCode.PensionLivree}</li>
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
 * <li>"FRAN"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "LegalFrameworkCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies the legal framework of the transaction."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class LegalFrameworkCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Relates to the French legal framework for repos, that is, relates to a
	 * "Pension Livrée".
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LegalFrameworkCode
	 * LegalFrameworkCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FRAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PensionLivree"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Relates to the French legal framework for repos, that is, relates to a \"Pension Livrée\"."
	 * </li>
	 * </ul>
	 */
	public static final LegalFrameworkCode PensionLivree = new LegalFrameworkCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PensionLivree";
			definition = "Relates to the French legal framework for repos, that is, relates to a \"Pension Livrée\".";
			owner_lazy = () -> com.tools20022.repository.codeset.LegalFrameworkCode.mmObject();
			codeName = "FRAN";
		}
	};
	final static private LinkedHashMap<String, LegalFrameworkCode> codesByName = new LinkedHashMap<>();

	protected LegalFrameworkCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("FRAN");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "LegalFrameworkCode";
				definition = "Identifies the legal framework of the transaction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.LegalFrameworkCode.PensionLivree);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(PensionLivree.getCodeName().get(), PensionLivree);
	}

	public static LegalFrameworkCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static LegalFrameworkCode[] values() {
		LegalFrameworkCode[] values = new LegalFrameworkCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, LegalFrameworkCode> {
		@Override
		public LegalFrameworkCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(LegalFrameworkCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}