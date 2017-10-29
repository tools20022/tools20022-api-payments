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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the Foreign Account Tax Compliance Act (FATCA) status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.FATCAStatusCode#FATCA101
 * FATCAStatusCode.FATCA101}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FATCAStatusCode#FATCA102
 * FATCAStatusCode.FATCA102}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FATCAStatusCode#FATCA103
 * FATCAStatusCode.FATCA103}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FATCAStatusCode#FATCA104
 * FATCAStatusCode.FATCA104}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FATCAStatusCode#FATCA105
 * FATCAStatusCode.FATCA105}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FATCAStatusCode#FATCA201
 * FATCAStatusCode.FATCA201}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FATCAStatusCode#FATCA202
 * FATCAStatusCode.FATCA202}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FATCAStatusCode#FATCA203
 * FATCAStatusCode.FATCA203}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FATCAStatusCode#FATCA204
 * FATCAStatusCode.FATCA204}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FATCAStatusCode#FATCA205
 * FATCAStatusCode.FATCA205}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FATCAStatusCode#FATCA206
 * FATCAStatusCode.FATCA206}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
public class FATCAStatusCode {

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
	public static final MMCode FATCA101 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FATCA101";
			definition = "Account holder type is an owner-documented financial institution with specified US owner(s).";
			owner_lazy = () -> FATCAStatusCode.mmObject();
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
	public static final MMCode FATCA102 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FATCA102";
			definition = "Account holder type is a passive non-financial entity with substantial US owner(s).";
			owner_lazy = () -> FATCAStatusCode.mmObject();
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
	public static final MMCode FATCA103 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FATCA103";
			definition = "Account holder type is a non-participating financial institution.";
			owner_lazy = () -> FATCAStatusCode.mmObject();
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
	public static final MMCode FATCA104 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FATCA104";
			definition = "Account holder type is a specified US person.";
			owner_lazy = () -> FATCAStatusCode.mmObject();
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
	public static final MMCode FATCA105 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FATCA105";
			definition = "Account holder type is a direct reporting non-financial foreign entity (NFFE).";
			owner_lazy = () -> FATCAStatusCode.mmObject();
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
	public static final MMCode FATCA201 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FATCA201";
			definition = "Account pool reporting type is a recalcitrant account holder with US indicia.";
			owner_lazy = () -> FATCAStatusCode.mmObject();
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
	public static final MMCode FATCA202 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FATCA202";
			definition = "Account pool reporting type is a recalcitrant account holder without US indicia.";
			owner_lazy = () -> FATCAStatusCode.mmObject();
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
	public static final MMCode FATCA203 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FATCA203";
			definition = "Account pool reporting type is a dormant account.";
			owner_lazy = () -> FATCAStatusCode.mmObject();
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
	public static final MMCode FATCA204 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FATCA204";
			definition = "Account pool reporting type is a non-participating foreign financial institution.";
			owner_lazy = () -> FATCAStatusCode.mmObject();
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
	public static final MMCode FATCA205 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FATCA205";
			definition = "Account pool reporting type is a recalcitrant account holder that is a US person.";
			owner_lazy = () -> FATCAStatusCode.mmObject();
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
	public static final MMCode FATCA206 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FATCA206";
			definition = "Account pool reporting type is recalcitrant account holder that is a passive non-financial foreign entity (NFFE).";
			owner_lazy = () -> FATCAStatusCode.mmObject();
			codeName = "F206";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
}