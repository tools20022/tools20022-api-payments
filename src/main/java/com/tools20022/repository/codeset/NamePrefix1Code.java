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
import com.tools20022.repository.codeset.NamePrefix1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the terms used to formally address a person.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.NamePrefix1Code#Doctor
 * NamePrefix1Code.mmDoctor}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.NamePrefix1Code#Mister
 * NamePrefix1Code.mmMister}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.NamePrefix1Code#Miss
 * NamePrefix1Code.mmMiss}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.NamePrefix1Code#Madam
 * NamePrefix1Code.mmMadam}</li>
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
 * <li>"DOCT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "NamePrefix1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the terms used to formally address a person."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class NamePrefix1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Title of the person is Doctor or Dr.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NamePrefix1Code
	 * NamePrefix1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DOCT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Doctor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Title of the person is Doctor or Dr."</li>
	 * </ul>
	 */
	public static final NamePrefix1Code Doctor = new NamePrefix1Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Doctor";
			definition = "Title of the person is Doctor or Dr.";
			owner_lazy = () -> com.tools20022.repository.codeset.NamePrefix1Code.mmObject();
			codeName = "DOCT";
		}
	};
	/**
	 * Title of the person is Mister or Mr.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NamePrefix1Code
	 * NamePrefix1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MIST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Mister"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Title of the person is Mister or Mr."</li>
	 * </ul>
	 */
	public static final NamePrefix1Code Mister = new NamePrefix1Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Mister";
			definition = "Title of the person is Mister or Mr.";
			owner_lazy = () -> com.tools20022.repository.codeset.NamePrefix1Code.mmObject();
			codeName = "MIST";
		}
	};
	/**
	 * Title of the person is Miss.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NamePrefix1Code
	 * NamePrefix1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MISS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Miss"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Title of the person is Miss."</li>
	 * </ul>
	 */
	public static final NamePrefix1Code Miss = new NamePrefix1Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Miss";
			definition = "Title of the person is Miss.";
			owner_lazy = () -> com.tools20022.repository.codeset.NamePrefix1Code.mmObject();
			codeName = "MISS";
		}
	};
	/**
	 * Title of the person is Madam.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NamePrefix1Code
	 * NamePrefix1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MADM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Madam"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Title of the person is Madam."</li>
	 * </ul>
	 */
	public static final NamePrefix1Code Madam = new NamePrefix1Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Madam";
			definition = "Title of the person is Madam.";
			owner_lazy = () -> com.tools20022.repository.codeset.NamePrefix1Code.mmObject();
			codeName = "MADM";
		}
	};
	final static private LinkedHashMap<String, NamePrefix1Code> codesByName = new LinkedHashMap<>();

	protected NamePrefix1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("DOCT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NamePrefix1Code";
				definition = "Specifies the terms used to formally address a person.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.NamePrefix1Code.Doctor, com.tools20022.repository.codeset.NamePrefix1Code.Mister, com.tools20022.repository.codeset.NamePrefix1Code.Miss,
						com.tools20022.repository.codeset.NamePrefix1Code.Madam);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Doctor.getCodeName().get(), Doctor);
		codesByName.put(Mister.getCodeName().get(), Mister);
		codesByName.put(Miss.getCodeName().get(), Miss);
		codesByName.put(Madam.getCodeName().get(), Madam);
	}

	public static NamePrefix1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static NamePrefix1Code[] values() {
		NamePrefix1Code[] values = new NamePrefix1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, NamePrefix1Code> {
		@Override
		public NamePrefix1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(NamePrefix1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}