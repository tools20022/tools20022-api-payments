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
import com.tools20022.repository.codeset.ReversibleCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates the possibility to terminate the securities lending contract either
 * by the borrower or lender before the expiration date.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ReversibleCode#Reversible
 * ReversibleCode.mmReversible}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ReversibleCode#Fixed
 * ReversibleCode.mmFixed}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ReversibleCode#CallBack
 * ReversibleCode.mmCallBack}</li>
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
 * <li>"REVL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ReversibleCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates the possibility to terminate the securities lending contract either by the borrower or lender before the expiration date."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ReversibleCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Securities lending contract can be ended by the borrower before the
	 * expiration date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReversibleCode
	 * ReversibleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REVL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reversible"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities lending contract can be ended by the borrower before the expiration date."
	 * </li>
	 * </ul>
	 */
	public static final ReversibleCode Reversible = new ReversibleCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reversible";
			definition = "Securities lending contract can be ended by the borrower before the expiration date.";
			owner_lazy = () -> com.tools20022.repository.codeset.ReversibleCode.mmObject();
			codeName = "REVL";
		}
	};
	/**
	 * Securities lending contract can not be ended by the borrower before the
	 * expiration date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReversibleCode
	 * ReversibleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FIXD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Fixed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities lending contract can not be ended by the borrower before the expiration date."
	 * </li>
	 * </ul>
	 */
	public static final ReversibleCode Fixed = new ReversibleCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Fixed";
			definition = "Securities lending contract can not be ended by the borrower before the expiration date.";
			owner_lazy = () -> com.tools20022.repository.codeset.ReversibleCode.mmObject();
			codeName = "FIXD";
		}
	};
	/**
	 * Securities lending contract can be ended by the lender before the
	 * expiration date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReversibleCode
	 * ReversibleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CABK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CallBack"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities lending contract can be ended by the lender before the expiration date."
	 * </li>
	 * </ul>
	 */
	public static final ReversibleCode CallBack = new ReversibleCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CallBack";
			definition = "Securities lending contract can be ended by the lender before the expiration date.";
			owner_lazy = () -> com.tools20022.repository.codeset.ReversibleCode.mmObject();
			codeName = "CABK";
		}
	};
	final static private LinkedHashMap<String, ReversibleCode> codesByName = new LinkedHashMap<>();

	protected ReversibleCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("REVL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ReversibleCode";
				definition = "Indicates the possibility to terminate the securities lending contract either by the borrower or lender before the expiration date.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ReversibleCode.Reversible, com.tools20022.repository.codeset.ReversibleCode.Fixed, com.tools20022.repository.codeset.ReversibleCode.CallBack);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Reversible.getCodeName().get(), Reversible);
		codesByName.put(Fixed.getCodeName().get(), Fixed);
		codesByName.put(CallBack.getCodeName().get(), CallBack);
	}

	public static ReversibleCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ReversibleCode[] values() {
		ReversibleCode[] values = new ReversibleCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ReversibleCode> {
		@Override
		public ReversibleCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ReversibleCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}