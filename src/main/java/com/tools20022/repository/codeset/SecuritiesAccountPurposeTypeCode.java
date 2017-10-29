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
 * Specifies the purpose of the securities account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesAccountPurposeTypeCode#Margin
 * SecuritiesAccountPurposeTypeCode.Margin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesAccountPurposeTypeCode#ShortSale
 * SecuritiesAccountPurposeTypeCode.ShortSale}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesAccountPurposeTypeCode#Abroad
 * SecuritiesAccountPurposeTypeCode.Abroad}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesAccountPurposeTypeCode#Centralised
 * SecuritiesAccountPurposeTypeCode.Centralised}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesAccountPurposeTypeCode#CashDVP
 * SecuritiesAccountPurposeTypeCode.CashDVP}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesAccountPurposeTypeCode#Physical
 * SecuritiesAccountPurposeTypeCode.Physical}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesAccountPurposeTypeCode#Fungible
 * SecuritiesAccountPurposeTypeCode.Fungible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesAccountPurposeTypeCode#NonFungible
 * SecuritiesAccountPurposeTypeCode.NonFungible}</li>
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
 * <li>"MARG"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesAccountPurposeTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the purpose of the securities account."</li>
 * </ul>
 */
public class SecuritiesAccountPurposeTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Account is used when financing is done by the broker.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesAccountPurposeTypeCode
	 * SecuritiesAccountPurposeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MARG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Margin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account is used when financing is done by the broker."</li>
	 * </ul>
	 */
	public static final MMCode Margin = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Margin";
			definition = "Account is used when financing is done by the broker.";
			owner_lazy = () -> SecuritiesAccountPurposeTypeCode.mmObject();
			codeName = "MARG";
		}
	};
	/**
	 * Account is used for short sale orders.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesAccountPurposeTypeCode
	 * SecuritiesAccountPurposeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SHOR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortSale"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account is used for short sale orders."</li>
	 * </ul>
	 */
	public static final MMCode ShortSale = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ShortSale";
			definition = "Account is used for short sale orders.";
			owner_lazy = () -> SecuritiesAccountPurposeTypeCode.mmObject();
			codeName = "SHOR";
		}
	};
	/**
	 * Account is located in a financial institution outside the country where
	 * the transaction is taking place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesAccountPurposeTypeCode
	 * SecuritiesAccountPurposeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ABRD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Abroad"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account is located in a financial institution outside the country where the transaction is taking place."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Abroad = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Abroad";
			definition = "Account is located in a financial institution outside the country where the transaction is taking place.";
			owner_lazy = () -> SecuritiesAccountPurposeTypeCode.mmObject();
			codeName = "ABRD";
		}
	};
	/**
	 * Account and all its related positions are held in one location.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesAccountPurposeTypeCode
	 * SecuritiesAccountPurposeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CEND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Centralised"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account and all its related positions are held in one location."</li>
	 * </ul>
	 */
	public static final MMCode Centralised = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Centralised";
			definition = "Account and all its related positions are held in one location.";
			owner_lazy = () -> SecuritiesAccountPurposeTypeCode.mmObject();
			codeName = "CEND";
		}
	};
	/**
	 * Account is used for settlement upon delivery, or a collection on a
	 * delivery basis.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesAccountPurposeTypeCode
	 * SecuritiesAccountPurposeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DVPA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDVP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account is used for settlement upon delivery, or a collection on a delivery basis."
	 * </li>
	 * </ul>
	 */
	public static final MMCode CashDVP = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashDVP";
			definition = "Account is used for settlement upon delivery, or a collection on a delivery basis.";
			owner_lazy = () -> SecuritiesAccountPurposeTypeCode.mmObject();
			codeName = "DVPA";
		}
	};
	/**
	 * Account is used for physical domestic safekeeping.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesAccountPurposeTypeCode
	 * SecuritiesAccountPurposeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PHYS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Physical"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account is used for physical domestic safekeeping."</li>
	 * </ul>
	 */
	public static final MMCode Physical = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Physical";
			definition = "Account is used for physical domestic safekeeping.";
			owner_lazy = () -> SecuritiesAccountPurposeTypeCode.mmObject();
			codeName = "PHYS";
		}
	};
	/**
	 * Financial instruments in the safekeeping account are fungible.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesAccountPurposeTypeCode
	 * SecuritiesAccountPurposeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FUNG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Fungible"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial instruments in the safekeeping account are fungible."</li>
	 * </ul>
	 */
	public static final MMCode Fungible = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Fungible";
			definition = "Financial instruments in the safekeeping account are fungible.";
			owner_lazy = () -> SecuritiesAccountPurposeTypeCode.mmObject();
			codeName = "FUNG";
		}
	};
	/**
	 * Financial instruments in the safekeeping account are not fungible.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesAccountPurposeTypeCode
	 * SecuritiesAccountPurposeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NFUN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonFungible"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial instruments in the safekeeping account are not fungible."</li>
	 * </ul>
	 */
	public static final MMCode NonFungible = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonFungible";
			definition = "Financial instruments in the safekeeping account are not fungible.";
			owner_lazy = () -> SecuritiesAccountPurposeTypeCode.mmObject();
			codeName = "NFUN";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("MARG");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesAccountPurposeTypeCode";
				definition = "Specifies the purpose of the securities account.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SecuritiesAccountPurposeTypeCode.Margin, com.tools20022.repository.codeset.SecuritiesAccountPurposeTypeCode.ShortSale,
						com.tools20022.repository.codeset.SecuritiesAccountPurposeTypeCode.Abroad, com.tools20022.repository.codeset.SecuritiesAccountPurposeTypeCode.Centralised,
						com.tools20022.repository.codeset.SecuritiesAccountPurposeTypeCode.CashDVP, com.tools20022.repository.codeset.SecuritiesAccountPurposeTypeCode.Physical,
						com.tools20022.repository.codeset.SecuritiesAccountPurposeTypeCode.Fungible, com.tools20022.repository.codeset.SecuritiesAccountPurposeTypeCode.NonFungible);
			}
		});
		return mmObject_lazy.get();
	}
}