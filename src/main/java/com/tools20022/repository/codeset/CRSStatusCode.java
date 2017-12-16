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
import com.tools20022.repository.codeset.CRSStatusCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the Common Reporting Status (CRS) status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.CRSStatusCode#CRS101
 * CRSStatusCode.mmCRS101}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CRSStatusCode#CRS102
 * CRSStatusCode.mmCRS102}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CRSStatusCode#CRS103
 * CRSStatusCode.mmCRS103}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CRSStatusCode#CRS104
 * CRSStatusCode.mmCRS104}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CRSStatusCode#CRS105
 * CRSStatusCode.mmCRS105}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CRSStatusCode#CRS106
 * CRSStatusCode.mmCRS106}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CRSStatusCode#CRS107
 * CRSStatusCode.mmCRS107}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CRSStatusCode#CRS108
 * CRSStatusCode.mmCRS108}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CRSStatusCode#CRS109
 * CRSStatusCode.mmCRS109}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CRSStatusCode#CRS110
 * CRSStatusCode.mmCRS110}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CRSStatusCode#CRS111
 * CRSStatusCode.mmCRS111}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CRSStatusCode#CRS112
 * CRSStatusCode.mmCRS112}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CRSStatusCode#CRS113
 * CRSStatusCode.mmCRS113}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CRSStatusCode#CRS114
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
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CRSStatusCode extends MMCode {

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
	public static final CRSStatusCode CRS101 = new CRSStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CRS101";
			definition = "Account holder type is a passive non-financial entity with one or more controlling persons that are foreign persons.";
			owner_lazy = () -> com.tools20022.repository.codeset.CRSStatusCode.mmObject();
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
	public static final CRSStatusCode CRS102 = new CRSStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CRS102";
			definition = "Account holder type is a foreign person.";
			owner_lazy = () -> com.tools20022.repository.codeset.CRSStatusCode.mmObject();
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
	public static final CRSStatusCode CRS103 = new CRSStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CRS103";
			definition = "Account holder type is a passive foreign non-financial entity without controlling persons that are foreign persons.";
			owner_lazy = () -> com.tools20022.repository.codeset.CRSStatusCode.mmObject();
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
	public static final CRSStatusCode CRS104 = new CRSStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CRS104";
			definition = "Account holder type is a financial institution such as a depositary , a custodial institution or a specified insurance company.";
			owner_lazy = () -> com.tools20022.repository.codeset.CRSStatusCode.mmObject();
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
	public static final CRSStatusCode CRS105 = new CRSStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CRS105";
			definition = "Account holder type is a financial institution such as an investment entity of a non-participating jurisdiction and managed by another financial institution without one or more controlling persons that are foreign persons.";
			owner_lazy = () -> com.tools20022.repository.codeset.CRSStatusCode.mmObject();
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
	public static final CRSStatusCode CRS106 = new CRSStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CRS106";
			definition = "Account holder type is a financial institution such as an investment entity of a non-participating jurisdiction and managed by another financial institution with one or more controlling persons that are foreign persons.";
			owner_lazy = () -> com.tools20022.repository.codeset.CRSStatusCode.mmObject();
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
	public static final CRSStatusCode CRS107 = new CRSStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CRS107";
			definition = "Account holder type is a financial institution such as another investment entity.";
			owner_lazy = () -> com.tools20022.repository.codeset.CRSStatusCode.mmObject();
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
	public static final CRSStatusCode CRS108 = new CRSStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CRS108";
			definition = "Account holder type is an active non-financial entity such as a corporation for which the stock is regularly traded on an established securities market.";
			owner_lazy = () -> com.tools20022.repository.codeset.CRSStatusCode.mmObject();
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
	public static final CRSStatusCode CRS109 = new CRSStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CRS109";
			definition = "Account holder type is an active non-financial entity such as a corporation which is a related entity of a corporation for which the stock is regularly traded on an established securities market.";
			owner_lazy = () -> com.tools20022.repository.codeset.CRSStatusCode.mmObject();
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
	public static final CRSStatusCode CRS110 = new CRSStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CRS110";
			definition = "Account holder type is an active non-financial entity such as a government entity.";
			owner_lazy = () -> com.tools20022.repository.codeset.CRSStatusCode.mmObject();
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
	public static final CRSStatusCode CRS111 = new CRSStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CRS111";
			definition = "Account holder type is an active non-financial entity such as a central bank.";
			owner_lazy = () -> com.tools20022.repository.codeset.CRSStatusCode.mmObject();
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
	public static final CRSStatusCode CRS112 = new CRSStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CRS112";
			definition = "Account holder type is an active non-financial entity such as an international organisation.";
			owner_lazy = () -> com.tools20022.repository.codeset.CRSStatusCode.mmObject();
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
	public static final CRSStatusCode CRS113 = new CRSStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CRS113";
			definition = "Account holder type is not a foreign person.";
			owner_lazy = () -> com.tools20022.repository.codeset.CRSStatusCode.mmObject();
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
	public static final CRSStatusCode CRS114 = new CRSStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CRS114";
			definition = "Account holder type is a financial institution such as an investment entity of a participating jurisdiction and managed by another financial institution.";
			owner_lazy = () -> com.tools20022.repository.codeset.CRSStatusCode.mmObject();
			codeName = "C114";
		}
	};
	final static private LinkedHashMap<String, CRSStatusCode> codesByName = new LinkedHashMap<>();

	protected CRSStatusCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CRSStatusCode";
				definition = "Specifies the Common Reporting Status (CRS) status.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CRSStatusCode.CRS101, com.tools20022.repository.codeset.CRSStatusCode.CRS102, com.tools20022.repository.codeset.CRSStatusCode.CRS103,
						com.tools20022.repository.codeset.CRSStatusCode.CRS104, com.tools20022.repository.codeset.CRSStatusCode.CRS105, com.tools20022.repository.codeset.CRSStatusCode.CRS106,
						com.tools20022.repository.codeset.CRSStatusCode.CRS107, com.tools20022.repository.codeset.CRSStatusCode.CRS108, com.tools20022.repository.codeset.CRSStatusCode.CRS109,
						com.tools20022.repository.codeset.CRSStatusCode.CRS110, com.tools20022.repository.codeset.CRSStatusCode.CRS111, com.tools20022.repository.codeset.CRSStatusCode.CRS112,
						com.tools20022.repository.codeset.CRSStatusCode.CRS113, com.tools20022.repository.codeset.CRSStatusCode.CRS114);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CRS101.getCodeName().get(), CRS101);
		codesByName.put(CRS102.getCodeName().get(), CRS102);
		codesByName.put(CRS103.getCodeName().get(), CRS103);
		codesByName.put(CRS104.getCodeName().get(), CRS104);
		codesByName.put(CRS105.getCodeName().get(), CRS105);
		codesByName.put(CRS106.getCodeName().get(), CRS106);
		codesByName.put(CRS107.getCodeName().get(), CRS107);
		codesByName.put(CRS108.getCodeName().get(), CRS108);
		codesByName.put(CRS109.getCodeName().get(), CRS109);
		codesByName.put(CRS110.getCodeName().get(), CRS110);
		codesByName.put(CRS111.getCodeName().get(), CRS111);
		codesByName.put(CRS112.getCodeName().get(), CRS112);
		codesByName.put(CRS113.getCodeName().get(), CRS113);
		codesByName.put(CRS114.getCodeName().get(), CRS114);
	}

	public static CRSStatusCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CRSStatusCode[] values() {
		CRSStatusCode[] values = new CRSStatusCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CRSStatusCode> {
		@Override
		public CRSStatusCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CRSStatusCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}