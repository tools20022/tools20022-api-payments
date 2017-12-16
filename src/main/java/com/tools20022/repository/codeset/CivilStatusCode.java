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
import com.tools20022.repository.codeset.CivilStatusCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the civil status of a person.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.CivilStatusCode#Single
 * CivilStatusCode.mmSingle}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CivilStatusCode#Married
 * CivilStatusCode.mmMarried}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CivilStatusCode#LegallyDivorced
 * CivilStatusCode.mmLegallyDivorced}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CivilStatusCode#Divorced
 * CivilStatusCode.mmDivorced}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CivilStatusCode#Widow
 * CivilStatusCode.mmWidow}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CivilStatusCode#StableUnion
 * CivilStatusCode.mmStableUnion}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CivilStatusCode#Separated
 * CivilStatusCode.mmSeparated}</li>
 * </ul>
 * </li>
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
 * "CivilStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the civil status of a person."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CivilStatusCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Person is single.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CivilStatusCode
	 * CivilStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SING"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Single"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Person is single."</li>
	 * </ul>
	 */
	public static final CivilStatusCode Single = new CivilStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Single";
			definition = "Person is single.";
			owner_lazy = () -> com.tools20022.repository.codeset.CivilStatusCode.mmObject();
			codeName = "SING";
		}
	};
	/**
	 * Person is married.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CivilStatusCode
	 * CivilStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MARR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Married"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Person is married."</li>
	 * </ul>
	 */
	public static final CivilStatusCode Married = new CivilStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Married";
			definition = "Person is married.";
			owner_lazy = () -> com.tools20022.repository.codeset.CivilStatusCode.mmObject();
			codeName = "MARR";
		}
	};
	/**
	 * Person is legally divorced.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CivilStatusCode
	 * CivilStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LDIV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegallyDivorced"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Person is legally divorced."</li>
	 * </ul>
	 */
	public static final CivilStatusCode LegallyDivorced = new CivilStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegallyDivorced";
			definition = "Person is legally divorced.";
			owner_lazy = () -> com.tools20022.repository.codeset.CivilStatusCode.mmObject();
			codeName = "LDIV";
		}
	};
	/**
	 * Person is divorced.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CivilStatusCode
	 * CivilStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DIVO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Divorced"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Person is divorced."</li>
	 * </ul>
	 */
	public static final CivilStatusCode Divorced = new CivilStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Divorced";
			definition = "Person is divorced.";
			owner_lazy = () -> com.tools20022.repository.codeset.CivilStatusCode.mmObject();
			codeName = "DIVO";
		}
	};
	/**
	 * Person is a widower.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CivilStatusCode
	 * CivilStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WIDO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Widow"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Person is a widower."</li>
	 * </ul>
	 */
	public static final CivilStatusCode Widow = new CivilStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Widow";
			definition = "Person is a widower.";
			owner_lazy = () -> com.tools20022.repository.codeset.CivilStatusCode.mmObject();
			codeName = "WIDO";
		}
	};
	/**
	 * Person is in a stable union.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CivilStatusCode
	 * CivilStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UNIO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StableUnion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Person is in a stable union."</li>
	 * </ul>
	 */
	public static final CivilStatusCode StableUnion = new CivilStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StableUnion";
			definition = "Person is in a stable union.";
			owner_lazy = () -> com.tools20022.repository.codeset.CivilStatusCode.mmObject();
			codeName = "UNIO";
		}
	};
	/**
	 * Person is separated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CivilStatusCode
	 * CivilStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SEPA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Separated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Person is separated."</li>
	 * </ul>
	 */
	public static final CivilStatusCode Separated = new CivilStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Separated";
			definition = "Person is separated.";
			owner_lazy = () -> com.tools20022.repository.codeset.CivilStatusCode.mmObject();
			codeName = "SEPA";
		}
	};
	final static private LinkedHashMap<String, CivilStatusCode> codesByName = new LinkedHashMap<>();

	protected CivilStatusCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CivilStatusCode";
				definition = "Specifies the civil status of a person.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CivilStatusCode.Single, com.tools20022.repository.codeset.CivilStatusCode.Married, com.tools20022.repository.codeset.CivilStatusCode.LegallyDivorced,
						com.tools20022.repository.codeset.CivilStatusCode.Divorced, com.tools20022.repository.codeset.CivilStatusCode.Widow, com.tools20022.repository.codeset.CivilStatusCode.StableUnion,
						com.tools20022.repository.codeset.CivilStatusCode.Separated);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Single.getCodeName().get(), Single);
		codesByName.put(Married.getCodeName().get(), Married);
		codesByName.put(LegallyDivorced.getCodeName().get(), LegallyDivorced);
		codesByName.put(Divorced.getCodeName().get(), Divorced);
		codesByName.put(Widow.getCodeName().get(), Widow);
		codesByName.put(StableUnion.getCodeName().get(), StableUnion);
		codesByName.put(Separated.getCodeName().get(), Separated);
	}

	public static CivilStatusCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CivilStatusCode[] values() {
		CivilStatusCode[] values = new CivilStatusCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CivilStatusCode> {
		@Override
		public CivilStatusCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CivilStatusCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}