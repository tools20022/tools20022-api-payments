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
import com.tools20022.repository.codeset.AutoBorrowingCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the condition under which automatic borrowing is allowed.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AutoBorrowingCode#LastResort
 * AutoBorrowingCode.mmLastResort}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AutoBorrowingCode#NoAutomatic
 * AutoBorrowingCode.mmNoAutomatic}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AutoBorrowingCode#Automatic
 * AutoBorrowingCode.mmAutomatic}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AutoBorrowingCode#Return
 * AutoBorrowingCode.mmReturn}</li>
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
 * <li>"LAMI"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AutoBorrowingCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the condition under which automatic borrowing is allowed."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AutoBorrowingCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Only last resort borrowing should be considered to make settlement occur.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AutoBorrowingCode
	 * AutoBorrowingCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LAMI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LastResort"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only last resort borrowing should be considered to make settlement occur."
	 * </li>
	 * </ul>
	 */
	public static final AutoBorrowingCode LastResort = new AutoBorrowingCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LastResort";
			definition = "Only last resort borrowing should be considered to make settlement occur.";
			owner_lazy = () -> com.tools20022.repository.codeset.AutoBorrowingCode.mmObject();
			codeName = "LAMI";
		}
	};
	/**
	 * No automatic borrowing should take place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AutoBorrowingCode
	 * AutoBorrowingCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NBOR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAutomatic"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "No automatic borrowing should take place."</li>
	 * </ul>
	 */
	public static final AutoBorrowingCode NoAutomatic = new AutoBorrowingCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NoAutomatic";
			definition = "No automatic borrowing should take place.";
			owner_lazy = () -> com.tools20022.repository.codeset.AutoBorrowingCode.mmObject();
			codeName = "NBOR";
		}
	};
	/**
	 * Automatic borrowing should take place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AutoBorrowingCode
	 * AutoBorrowingCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "YBOR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Automatic"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Automatic borrowing should take place."</li>
	 * </ul>
	 */
	public static final AutoBorrowingCode Automatic = new AutoBorrowingCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Automatic";
			definition = "Automatic borrowing should take place.";
			owner_lazy = () -> com.tools20022.repository.codeset.AutoBorrowingCode.mmObject();
			codeName = "YBOR";
		}
	};
	/**
	 * Return of stocks should take place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AutoBorrowingCode
	 * AutoBorrowingCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RTRN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Return"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Return of stocks should take place."</li>
	 * </ul>
	 */
	public static final AutoBorrowingCode Return = new AutoBorrowingCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Return";
			definition = "Return of stocks should take place.";
			owner_lazy = () -> com.tools20022.repository.codeset.AutoBorrowingCode.mmObject();
			codeName = "RTRN";
		}
	};
	final static private LinkedHashMap<String, AutoBorrowingCode> codesByName = new LinkedHashMap<>();

	protected AutoBorrowingCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("LAMI");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AutoBorrowingCode";
				definition = "Specifies the condition under which automatic borrowing is allowed.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AutoBorrowingCode.LastResort, com.tools20022.repository.codeset.AutoBorrowingCode.NoAutomatic, com.tools20022.repository.codeset.AutoBorrowingCode.Automatic,
						com.tools20022.repository.codeset.AutoBorrowingCode.Return);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(LastResort.getCodeName().get(), LastResort);
		codesByName.put(NoAutomatic.getCodeName().get(), NoAutomatic);
		codesByName.put(Automatic.getCodeName().get(), Automatic);
		codesByName.put(Return.getCodeName().get(), Return);
	}

	public static AutoBorrowingCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AutoBorrowingCode[] values() {
		AutoBorrowingCode[] values = new AutoBorrowingCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AutoBorrowingCode> {
		@Override
		public AutoBorrowingCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AutoBorrowingCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}