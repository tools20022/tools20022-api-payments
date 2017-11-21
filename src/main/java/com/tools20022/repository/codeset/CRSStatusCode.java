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
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the Common Reporting Status (CRS) status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.CRSStatusCode#mmCRS101
 * CRSStatusCode.mmCRS101}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CRSStatusCode#mmCRS102
 * CRSStatusCode.mmCRS102}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CRSStatusCode#mmCRS103
 * CRSStatusCode.mmCRS103}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CRSStatusCode#mmCRS104
 * CRSStatusCode.mmCRS104}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CRSStatusCode#mmCRS105
 * CRSStatusCode.mmCRS105}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CRSStatusCode#mmCRS106
 * CRSStatusCode.mmCRS106}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CRSStatusCode#mmCRS107
 * CRSStatusCode.mmCRS107}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CRSStatusCode#mmCRS108
 * CRSStatusCode.mmCRS108}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CRSStatusCode#mmCRS109
 * CRSStatusCode.mmCRS109}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CRSStatusCode#mmCRS110
 * CRSStatusCode.mmCRS110}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CRSStatusCode#mmCRS111
 * CRSStatusCode.mmCRS111}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CRSStatusCode#mmCRS112
 * CRSStatusCode.mmCRS112}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CRSStatusCode#mmCRS113
 * CRSStatusCode.mmCRS113}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CRSStatusCode#mmCRS114
 * CRSStatusCode.mmCRS114}</li>
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
 * "CRSStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the Common Reporting Status (CRS) status."</li>
 * </ul>
 */
public class CRSStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Account holder type is a passive non-financial entity with one or more
	 * controlling persons that are foreign persons.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CRSStatusCode
	 * CRSStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "C101"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CRS101"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account holder type is a passive non-financial entity with one or more controlling persons that are foreign persons."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCRS101 = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CRS101";
			definition = "Account holder type is a passive non-financial entity with one or more controlling persons that are foreign persons.";
			owner_lazy = () -> CRSStatusCode.mmObject();
			codeName = "C101";
		}
	};
	/**
	 * Account holder type is a foreign person.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CRSStatusCode
	 * CRSStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "C102"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CRS102"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account holder type is a foreign person."</li>
	 * </ul>
	 */
	public static final MMCode mmCRS102 = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CRS102";
			definition = "Account holder type is a foreign person.";
			owner_lazy = () -> CRSStatusCode.mmObject();
			codeName = "C102";
		}
	};
	/**
	 * Account holder type is a passive foreign non-financial entity without
	 * controlling persons that are foreign persons.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CRSStatusCode
	 * CRSStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "C103"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CRS103"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account holder type is a passive foreign non-financial entity without controlling persons that are foreign persons."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCRS103 = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CRS103";
			definition = "Account holder type is a passive foreign non-financial entity without controlling persons that are foreign persons.";
			owner_lazy = () -> CRSStatusCode.mmObject();
			codeName = "C103";
		}
	};
	/**
	 * Account holder type is a financial institution such as a depositary , a
	 * custodial institution or a specified insurance company.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CRSStatusCode
	 * CRSStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "C104"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CRS104"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account holder type is a financial institution such as a depositary , a custodial institution or a specified insurance company."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCRS104 = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CRS104";
			definition = "Account holder type is a financial institution such as a depositary , a custodial institution or a specified insurance company.";
			owner_lazy = () -> CRSStatusCode.mmObject();
			codeName = "C104";
		}
	};
	/**
	 * Account holder type is a financial institution such as an investment
	 * entity of a non-participating jurisdiction and managed by another
	 * financial institution without one or more controlling persons that are
	 * foreign persons.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CRSStatusCode
	 * CRSStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "C105"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CRS105"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account holder type is a financial institution such as an investment entity of a non-participating jurisdiction and managed by another financial institution without one or more controlling persons that are foreign persons."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCRS105 = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CRS105";
			definition = "Account holder type is a financial institution such as an investment entity of a non-participating jurisdiction and managed by another financial institution without one or more controlling persons that are foreign persons.";
			owner_lazy = () -> CRSStatusCode.mmObject();
			codeName = "C105";
		}
	};
	/**
	 * Account holder type is a financial institution such as an investment
	 * entity of a non-participating jurisdiction and managed by another
	 * financial institution with one or more controlling persons that are
	 * foreign persons.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CRSStatusCode
	 * CRSStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "C106"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CRS106"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account holder type is a financial institution such as an investment entity of a non-participating jurisdiction and managed by another financial institution with one or more controlling persons that are foreign persons."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCRS106 = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CRS106";
			definition = "Account holder type is a financial institution such as an investment entity of a non-participating jurisdiction and managed by another financial institution with one or more controlling persons that are foreign persons.";
			owner_lazy = () -> CRSStatusCode.mmObject();
			codeName = "C106";
		}
	};
	/**
	 * Account holder type is a financial institution such as another investment
	 * entity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CRSStatusCode
	 * CRSStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "C107"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CRS107"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account holder type is a financial institution such as another investment entity."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCRS107 = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CRS107";
			definition = "Account holder type is a financial institution such as another investment entity.";
			owner_lazy = () -> CRSStatusCode.mmObject();
			codeName = "C107";
		}
	};
	/**
	 * Account holder type is an active non-financial entity such as a
	 * corporation for which the stock is regularly traded on an established
	 * securities market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CRSStatusCode
	 * CRSStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "C108"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CRS108"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account holder type is an active non-financial entity such as a corporation for which the stock is regularly traded on an established securities market."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCRS108 = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CRS108";
			definition = "Account holder type is an active non-financial entity such as a corporation for which the stock is regularly traded on an established securities market.";
			owner_lazy = () -> CRSStatusCode.mmObject();
			codeName = "C108";
		}
	};
	/**
	 * Account holder type is an active non-financial entity such as a
	 * corporation which is a related entity of a corporation for which the
	 * stock is regularly traded on an established securities market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CRSStatusCode
	 * CRSStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "C109"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CRS109"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account holder type is an active non-financial entity such as a corporation which is a related entity of a corporation for which the stock is regularly traded on an established securities market."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCRS109 = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CRS109";
			definition = "Account holder type is an active non-financial entity such as a corporation which is a related entity of a corporation for which the stock is regularly traded on an established securities market.";
			owner_lazy = () -> CRSStatusCode.mmObject();
			codeName = "C109";
		}
	};
	/**
	 * Account holder type is an active non-financial entity such as a
	 * government entity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CRSStatusCode
	 * CRSStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "C110"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CRS110"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account holder type is an active non-financial entity such as a government entity."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCRS110 = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CRS110";
			definition = "Account holder type is an active non-financial entity such as a government entity.";
			owner_lazy = () -> CRSStatusCode.mmObject();
			codeName = "C110";
		}
	};
	/**
	 * Account holder type is an active non-financial entity such as a central
	 * bank.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CRSStatusCode
	 * CRSStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "C111"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CRS111"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account holder type is an active non-financial entity such as a central bank."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCRS111 = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CRS111";
			definition = "Account holder type is an active non-financial entity such as a central bank.";
			owner_lazy = () -> CRSStatusCode.mmObject();
			codeName = "C111";
		}
	};
	/**
	 * Account holder type is an active non-financial entity such as an
	 * international organisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CRSStatusCode
	 * CRSStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "C112"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CRS112"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account holder type is an active non-financial entity such as an international organisation."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCRS112 = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CRS112";
			definition = "Account holder type is an active non-financial entity such as an international organisation.";
			owner_lazy = () -> CRSStatusCode.mmObject();
			codeName = "C112";
		}
	};
	/**
	 * Account holder type is not a foreign person.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CRSStatusCode
	 * CRSStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "C113"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CRS113"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account holder type is not a foreign person."</li>
	 * </ul>
	 */
	public static final MMCode mmCRS113 = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CRS113";
			definition = "Account holder type is not a foreign person.";
			owner_lazy = () -> CRSStatusCode.mmObject();
			codeName = "C113";
		}
	};
	/**
	 * Account holder type is a financial institution such as an investment
	 * entity of a participating jurisdiction and managed by another financial
	 * institution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CRSStatusCode
	 * CRSStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "C114"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CRS114"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account holder type is a financial institution such as an investment entity of a participating jurisdiction and managed by another financial institution."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCRS114 = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CRS114";
			definition = "Account holder type is a financial institution such as an investment entity of a participating jurisdiction and managed by another financial institution.";
			owner_lazy = () -> CRSStatusCode.mmObject();
			codeName = "C114";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CRSStatusCode";
				definition = "Specifies the Common Reporting Status (CRS) status.";
				code_lazy = () -> Arrays.asList(CRSStatusCode.mmCRS101, CRSStatusCode.mmCRS102, CRSStatusCode.mmCRS103, CRSStatusCode.mmCRS104, CRSStatusCode.mmCRS105, CRSStatusCode.mmCRS106, CRSStatusCode.mmCRS107, CRSStatusCode.mmCRS108,
						CRSStatusCode.mmCRS109, CRSStatusCode.mmCRS110, CRSStatusCode.mmCRS111, CRSStatusCode.mmCRS112, CRSStatusCode.mmCRS113, CRSStatusCode.mmCRS114);
			}
		});
		return mmObject_lazy.get();
	}
}