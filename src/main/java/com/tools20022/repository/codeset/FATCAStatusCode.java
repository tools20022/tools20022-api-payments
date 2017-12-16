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
import com.tools20022.repository.codeset.FATCAStatusCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the Foreign Account Tax Compliance Act (FATCA) status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.FATCAStatusCode#FATCA101
 * FATCAStatusCode.mmFATCA101}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FATCAStatusCode#FATCA102
 * FATCAStatusCode.mmFATCA102}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FATCAStatusCode#FATCA103
 * FATCAStatusCode.mmFATCA103}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FATCAStatusCode#FATCA104
 * FATCAStatusCode.mmFATCA104}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FATCAStatusCode#FATCA105
 * FATCAStatusCode.mmFATCA105}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FATCAStatusCode#FATCA201
 * FATCAStatusCode.mmFATCA201}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FATCAStatusCode#FATCA202
 * FATCAStatusCode.mmFATCA202}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FATCAStatusCode#FATCA203
 * FATCAStatusCode.mmFATCA203}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FATCAStatusCode#FATCA204
 * FATCAStatusCode.mmFATCA204}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FATCAStatusCode#FATCA205
 * FATCAStatusCode.mmFATCA205}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FATCAStatusCode#FATCA206
 * FATCAStatusCode.mmFATCA206}</li>
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
 * "FATCAStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the Foreign Account Tax Compliance Act (FATCA) status."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class FATCAStatusCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Account holder type is an owner-documented financial institution with
	 * specified US owner(s).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FATCAStatusCode
	 * FATCAStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "F101"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FATCA101"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account holder type is an owner-documented financial institution with specified US owner(s)."
	 * </li>
	 * </ul>
	 */
	public static final FATCAStatusCode FATCA101 = new FATCAStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FATCA101";
			definition = "Account holder type is an owner-documented financial institution with specified US owner(s).";
			owner_lazy = () -> com.tools20022.repository.codeset.FATCAStatusCode.mmObject();
			codeName = "F101";
		}
	};
	/**
	 * Account holder type is a passive non-financial entity with substantial US
	 * owner(s).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FATCAStatusCode
	 * FATCAStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "F102"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FATCA102"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account holder type is a passive non-financial entity with substantial US owner(s)."
	 * </li>
	 * </ul>
	 */
	public static final FATCAStatusCode FATCA102 = new FATCAStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FATCA102";
			definition = "Account holder type is a passive non-financial entity with substantial US owner(s).";
			owner_lazy = () -> com.tools20022.repository.codeset.FATCAStatusCode.mmObject();
			codeName = "F102";
		}
	};
	/**
	 * Account holder type is a non-participating financial institution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FATCAStatusCode
	 * FATCAStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "F103"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FATCA103"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account holder type is a non-participating financial institution."</li>
	 * </ul>
	 */
	public static final FATCAStatusCode FATCA103 = new FATCAStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FATCA103";
			definition = "Account holder type is a non-participating financial institution.";
			owner_lazy = () -> com.tools20022.repository.codeset.FATCAStatusCode.mmObject();
			codeName = "F103";
		}
	};
	/**
	 * Account holder type is a specified US person.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FATCAStatusCode
	 * FATCAStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "F104"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FATCA104"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account holder type is a specified US person."</li>
	 * </ul>
	 */
	public static final FATCAStatusCode FATCA104 = new FATCAStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FATCA104";
			definition = "Account holder type is a specified US person.";
			owner_lazy = () -> com.tools20022.repository.codeset.FATCAStatusCode.mmObject();
			codeName = "F104";
		}
	};
	/**
	 * Account holder type is a direct reporting non-financial foreign entity
	 * (NFFE).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FATCAStatusCode
	 * FATCAStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "F105"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FATCA105"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account holder type is a direct reporting non-financial foreign entity (NFFE)."
	 * </li>
	 * </ul>
	 */
	public static final FATCAStatusCode FATCA105 = new FATCAStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FATCA105";
			definition = "Account holder type is a direct reporting non-financial foreign entity (NFFE).";
			owner_lazy = () -> com.tools20022.repository.codeset.FATCAStatusCode.mmObject();
			codeName = "F105";
		}
	};
	/**
	 * Account pool reporting type is a recalcitrant account holder with US
	 * indicia.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FATCAStatusCode
	 * FATCAStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "F201"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FATCA201"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account pool reporting type is a recalcitrant account holder with US indicia."
	 * </li>
	 * </ul>
	 */
	public static final FATCAStatusCode FATCA201 = new FATCAStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FATCA201";
			definition = "Account pool reporting type is a recalcitrant account holder with US indicia.";
			owner_lazy = () -> com.tools20022.repository.codeset.FATCAStatusCode.mmObject();
			codeName = "F201";
		}
	};
	/**
	 * Account pool reporting type is a recalcitrant account holder without US
	 * indicia.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FATCAStatusCode
	 * FATCAStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "F202"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FATCA202"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account pool reporting type is a recalcitrant account holder without US indicia."
	 * </li>
	 * </ul>
	 */
	public static final FATCAStatusCode FATCA202 = new FATCAStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FATCA202";
			definition = "Account pool reporting type is a recalcitrant account holder without US indicia.";
			owner_lazy = () -> com.tools20022.repository.codeset.FATCAStatusCode.mmObject();
			codeName = "F202";
		}
	};
	/**
	 * Account pool reporting type is a dormant account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FATCAStatusCode
	 * FATCAStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "F203"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FATCA203"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account pool reporting type is a dormant account."</li>
	 * </ul>
	 */
	public static final FATCAStatusCode FATCA203 = new FATCAStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FATCA203";
			definition = "Account pool reporting type is a dormant account.";
			owner_lazy = () -> com.tools20022.repository.codeset.FATCAStatusCode.mmObject();
			codeName = "F203";
		}
	};
	/**
	 * Account pool reporting type is a non-participating foreign financial
	 * institution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FATCAStatusCode
	 * FATCAStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "F204"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FATCA204"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account pool reporting type is a non-participating foreign financial institution."
	 * </li>
	 * </ul>
	 */
	public static final FATCAStatusCode FATCA204 = new FATCAStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FATCA204";
			definition = "Account pool reporting type is a non-participating foreign financial institution.";
			owner_lazy = () -> com.tools20022.repository.codeset.FATCAStatusCode.mmObject();
			codeName = "F204";
		}
	};
	/**
	 * Account pool reporting type is a recalcitrant account holder that is a US
	 * person.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FATCAStatusCode
	 * FATCAStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "F205"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FATCA205"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account pool reporting type is a recalcitrant account holder that is a US person."
	 * </li>
	 * </ul>
	 */
	public static final FATCAStatusCode FATCA205 = new FATCAStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FATCA205";
			definition = "Account pool reporting type is a recalcitrant account holder that is a US person.";
			owner_lazy = () -> com.tools20022.repository.codeset.FATCAStatusCode.mmObject();
			codeName = "F205";
		}
	};
	/**
	 * Account pool reporting type is recalcitrant account holder that is a
	 * passive non-financial foreign entity (NFFE).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FATCAStatusCode
	 * FATCAStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "F206"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FATCA206"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account pool reporting type is recalcitrant account holder that is a passive non-financial foreign entity (NFFE)."
	 * </li>
	 * </ul>
	 */
	public static final FATCAStatusCode FATCA206 = new FATCAStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FATCA206";
			definition = "Account pool reporting type is recalcitrant account holder that is a passive non-financial foreign entity (NFFE).";
			owner_lazy = () -> com.tools20022.repository.codeset.FATCAStatusCode.mmObject();
			codeName = "F206";
		}
	};
	final static private LinkedHashMap<String, FATCAStatusCode> codesByName = new LinkedHashMap<>();

	protected FATCAStatusCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FATCAStatusCode";
				definition = "Specifies the Foreign Account Tax Compliance Act (FATCA) status.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FATCAStatusCode.FATCA101, com.tools20022.repository.codeset.FATCAStatusCode.FATCA102, com.tools20022.repository.codeset.FATCAStatusCode.FATCA103,
						com.tools20022.repository.codeset.FATCAStatusCode.FATCA104, com.tools20022.repository.codeset.FATCAStatusCode.FATCA105, com.tools20022.repository.codeset.FATCAStatusCode.FATCA201,
						com.tools20022.repository.codeset.FATCAStatusCode.FATCA202, com.tools20022.repository.codeset.FATCAStatusCode.FATCA203, com.tools20022.repository.codeset.FATCAStatusCode.FATCA204,
						com.tools20022.repository.codeset.FATCAStatusCode.FATCA205, com.tools20022.repository.codeset.FATCAStatusCode.FATCA206);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(FATCA101.getCodeName().get(), FATCA101);
		codesByName.put(FATCA102.getCodeName().get(), FATCA102);
		codesByName.put(FATCA103.getCodeName().get(), FATCA103);
		codesByName.put(FATCA104.getCodeName().get(), FATCA104);
		codesByName.put(FATCA105.getCodeName().get(), FATCA105);
		codesByName.put(FATCA201.getCodeName().get(), FATCA201);
		codesByName.put(FATCA202.getCodeName().get(), FATCA202);
		codesByName.put(FATCA203.getCodeName().get(), FATCA203);
		codesByName.put(FATCA204.getCodeName().get(), FATCA204);
		codesByName.put(FATCA205.getCodeName().get(), FATCA205);
		codesByName.put(FATCA206.getCodeName().get(), FATCA206);
	}

	public static FATCAStatusCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static FATCAStatusCode[] values() {
		FATCAStatusCode[] values = new FATCAStatusCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, FATCAStatusCode> {
		@Override
		public FATCAStatusCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(FATCAStatusCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}