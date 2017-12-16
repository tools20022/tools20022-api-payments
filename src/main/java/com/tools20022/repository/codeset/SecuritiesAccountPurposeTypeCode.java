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
import com.tools20022.repository.codeset.SecuritiesAccountPurposeTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the purpose of the securities account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesAccountPurposeTypeCode#Margin
 * SecuritiesAccountPurposeTypeCode.mmMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesAccountPurposeTypeCode#ShortSale
 * SecuritiesAccountPurposeTypeCode.mmShortSale}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesAccountPurposeTypeCode#Abroad
 * SecuritiesAccountPurposeTypeCode.mmAbroad}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesAccountPurposeTypeCode#Centralised
 * SecuritiesAccountPurposeTypeCode.mmCentralised}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesAccountPurposeTypeCode#CashDVP
 * SecuritiesAccountPurposeTypeCode.mmCashDVP}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesAccountPurposeTypeCode#Physical
 * SecuritiesAccountPurposeTypeCode.mmPhysical}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesAccountPurposeTypeCode#Fungible
 * SecuritiesAccountPurposeTypeCode.mmFungible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesAccountPurposeTypeCode#NonFungible
 * SecuritiesAccountPurposeTypeCode.mmNonFungible}</li>
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
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SecuritiesAccountPurposeTypeCode extends MMCode {

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
	public static final SecuritiesAccountPurposeTypeCode Margin = new SecuritiesAccountPurposeTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Margin";
			definition = "Account is used when financing is done by the broker.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesAccountPurposeTypeCode.mmObject();
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
	public static final SecuritiesAccountPurposeTypeCode ShortSale = new SecuritiesAccountPurposeTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ShortSale";
			definition = "Account is used for short sale orders.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesAccountPurposeTypeCode.mmObject();
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
	public static final SecuritiesAccountPurposeTypeCode Abroad = new SecuritiesAccountPurposeTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Abroad";
			definition = "Account is located in a financial institution outside the country where the transaction is taking place.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesAccountPurposeTypeCode.mmObject();
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
	public static final SecuritiesAccountPurposeTypeCode Centralised = new SecuritiesAccountPurposeTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Centralised";
			definition = "Account and all its related positions are held in one location.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesAccountPurposeTypeCode.mmObject();
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
	public static final SecuritiesAccountPurposeTypeCode CashDVP = new SecuritiesAccountPurposeTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashDVP";
			definition = "Account is used for settlement upon delivery, or a collection on a delivery basis.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesAccountPurposeTypeCode.mmObject();
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
	public static final SecuritiesAccountPurposeTypeCode Physical = new SecuritiesAccountPurposeTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Physical";
			definition = "Account is used for physical domestic safekeeping.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesAccountPurposeTypeCode.mmObject();
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
	public static final SecuritiesAccountPurposeTypeCode Fungible = new SecuritiesAccountPurposeTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Fungible";
			definition = "Financial instruments in the safekeeping account are fungible.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesAccountPurposeTypeCode.mmObject();
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
	public static final SecuritiesAccountPurposeTypeCode NonFungible = new SecuritiesAccountPurposeTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonFungible";
			definition = "Financial instruments in the safekeeping account are not fungible.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesAccountPurposeTypeCode.mmObject();
			codeName = "NFUN";
		}
	};
	final static private LinkedHashMap<String, SecuritiesAccountPurposeTypeCode> codesByName = new LinkedHashMap<>();

	protected SecuritiesAccountPurposeTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("MARG");
				registrationStatus = MMRegistrationStatus.REGISTERED;
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

	static {
		codesByName.put(Margin.getCodeName().get(), Margin);
		codesByName.put(ShortSale.getCodeName().get(), ShortSale);
		codesByName.put(Abroad.getCodeName().get(), Abroad);
		codesByName.put(Centralised.getCodeName().get(), Centralised);
		codesByName.put(CashDVP.getCodeName().get(), CashDVP);
		codesByName.put(Physical.getCodeName().get(), Physical);
		codesByName.put(Fungible.getCodeName().get(), Fungible);
		codesByName.put(NonFungible.getCodeName().get(), NonFungible);
	}

	public static SecuritiesAccountPurposeTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SecuritiesAccountPurposeTypeCode[] values() {
		SecuritiesAccountPurposeTypeCode[] values = new SecuritiesAccountPurposeTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SecuritiesAccountPurposeTypeCode> {
		@Override
		public SecuritiesAccountPurposeTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SecuritiesAccountPurposeTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}