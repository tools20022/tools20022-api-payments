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
import com.tools20022.repository.codeset.ProductTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of product or financial instrument.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ProductTypeCode#Agency
 * ProductTypeCode.Agency}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ProductTypeCode#Commodity
 * ProductTypeCode.Commodity}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ProductTypeCode#Corporate
 * ProductTypeCode.Corporate}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ProductTypeCode#Currency
 * ProductTypeCode.Currency}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ProductTypeCode#Equity
 * ProductTypeCode.Equity}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ProductTypeCode#Government
 * ProductTypeCode.Government}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ProductTypeCode#Loan
 * ProductTypeCode.Loan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductTypeCode#MoneyMarket
 * ProductTypeCode.MoneyMarket}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ProductTypeCode#Mortgage
 * ProductTypeCode.Mortgage}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ProductTypeCode#Municipal
 * ProductTypeCode.Municipal}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ProductTypeCode#Financing
 * ProductTypeCode.Financing}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ProductTypeCode#Property
 * ProductTypeCode.Property}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ProductTypeCode#Swap
 * ProductTypeCode.Swap}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ProductTypeCode#Other
 * ProductTypeCode.Other}</li>
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
 * <li>"AGEN"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ProductTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of product or financial instrument."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ProductTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Identifies categories of instruments issued by federal agencies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductTypeCode
	 * ProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AGEN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Agency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies categories of instruments issued by federal agencies."</li>
	 * </ul>
	 */
	public static final ProductTypeCode Agency = new ProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Agency";
			definition = "Identifies categories of instruments issued by federal agencies.";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductTypeCode.mmObject();
			codeName = "AGEN";
		}
	};
	/**
	 * Identifies categories of instruments that are commodities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductTypeCode
	 * ProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COMM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Commodity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies categories of instruments that are commodities."</li>
	 * </ul>
	 */
	public static final ProductTypeCode Commodity = new ProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Commodity";
			definition = "Identifies categories of instruments that are commodities.";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductTypeCode.mmObject();
			codeName = "COMM";
		}
	};
	/**
	 * Identifies categories of instruments issued by corporates.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductTypeCode
	 * ProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CORP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Corporate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies categories of instruments issued by corporates."</li>
	 * </ul>
	 */
	public static final ProductTypeCode Corporate = new ProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Corporate";
			definition = "Identifies categories of instruments issued by corporates.";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductTypeCode.mmObject();
			codeName = "CORP";
		}
	};
	/**
	 * Identifies categories of currency instruments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductTypeCode
	 * ProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CURR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies categories of currency instruments."</li>
	 * </ul>
	 */
	public static final ProductTypeCode Currency = new ProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Identifies categories of currency instruments.";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductTypeCode.mmObject();
			codeName = "CURR";
		}
	};
	/**
	 * Identifies the nature or type of an equity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductTypeCode
	 * ProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EQUI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Equity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the nature or type of an equity."</li>
	 * </ul>
	 */
	public static final ProductTypeCode Equity = new ProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Equity";
			definition = "Identifies the nature or type of an equity.";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductTypeCode.mmObject();
			codeName = "EQUI";
		}
	};
	/**
	 * Identifies categories of obligations issued by a government.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductTypeCode
	 * ProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GOVE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Government"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies categories of obligations issued by a government."</li>
	 * </ul>
	 */
	public static final ProductTypeCode Government = new ProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Government";
			definition = "Identifies categories of obligations issued by a government.";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductTypeCode.mmObject();
			codeName = "GOVE";
		}
	};
	/**
	 * Identifies categories of loans.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductTypeCode
	 * ProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LOAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Loan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies categories of loans."</li>
	 * </ul>
	 */
	public static final ProductTypeCode Loan = new ProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Loan";
			definition = "Identifies categories of loans.";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductTypeCode.mmObject();
			codeName = "LOAN";
		}
	};
	/**
	 * Identifies categories of short-term debt securities maturing in less than
	 * one year.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductTypeCode
	 * ProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MOMA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MoneyMarket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies categories of short-term debt securities maturing in less than one year."
	 * </li>
	 * </ul>
	 */
	public static final ProductTypeCode MoneyMarket = new ProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MoneyMarket";
			definition = "Identifies categories of short-term debt securities maturing in less than one year.";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductTypeCode.mmObject();
			codeName = "MOMA";
		}
	};
	/**
	 * Identifies categories of mortgage securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductTypeCode
	 * ProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MORT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Mortgage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies categories of mortgage securities."</li>
	 * </ul>
	 */
	public static final ProductTypeCode Mortgage = new ProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Mortgage";
			definition = "Identifies categories of mortgage securities.";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductTypeCode.mmObject();
			codeName = "MORT";
		}
	};
	/**
	 * Identifies categories of securities issued by states and local
	 * governments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductTypeCode
	 * ProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MUNI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Municipal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies categories of securities issued by states and local governments."
	 * </li>
	 * </ul>
	 */
	public static final ProductTypeCode Municipal = new ProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Municipal";
			definition = "Identifies categories of securities issued by states and local governments.";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductTypeCode.mmObject();
			codeName = "MUNI";
		}
	};
	/**
	 * Identifies categories of financing instruments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductTypeCode
	 * ProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FINA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Financing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies categories of financing instruments."</li>
	 * </ul>
	 */
	public static final ProductTypeCode Financing = new ProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Financing";
			definition = "Identifies categories of financing instruments.";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductTypeCode.mmObject();
			codeName = "FINA";
		}
	};
	/**
	 * The asset type is property.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductTypeCode
	 * ProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PROP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Property"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The asset type is property."</li>
	 * </ul>
	 */
	public static final ProductTypeCode Property = new ProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Property";
			definition = "The asset type is property.";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductTypeCode.mmObject();
			codeName = "PROP";
		}
	};
	/**
	 * The asset type is a swap.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductTypeCode
	 * ProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SWAP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Swap"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The asset type is a swap."</li>
	 * </ul>
	 */
	public static final ProductTypeCode Swap = new ProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Swap";
			definition = "The asset type is a swap.";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductTypeCode.mmObject();
			codeName = "SWAP";
		}
	};
	/**
	 * The asset type is other.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductTypeCode
	 * ProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The asset type is other."</li>
	 * </ul>
	 */
	public static final ProductTypeCode Other = new ProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Other";
			definition = "The asset type is other.";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductTypeCode.mmObject();
			codeName = "OTHR";
		}
	};
	final static private LinkedHashMap<String, ProductTypeCode> codesByName = new LinkedHashMap<>();

	protected ProductTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("AGEN");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ProductTypeCode";
				definition = "Specifies the type of product or financial instrument.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ProductTypeCode.Agency, com.tools20022.repository.codeset.ProductTypeCode.Commodity, com.tools20022.repository.codeset.ProductTypeCode.Corporate,
						com.tools20022.repository.codeset.ProductTypeCode.Currency, com.tools20022.repository.codeset.ProductTypeCode.Equity, com.tools20022.repository.codeset.ProductTypeCode.Government,
						com.tools20022.repository.codeset.ProductTypeCode.Loan, com.tools20022.repository.codeset.ProductTypeCode.MoneyMarket, com.tools20022.repository.codeset.ProductTypeCode.Mortgage,
						com.tools20022.repository.codeset.ProductTypeCode.Municipal, com.tools20022.repository.codeset.ProductTypeCode.Financing, com.tools20022.repository.codeset.ProductTypeCode.Property,
						com.tools20022.repository.codeset.ProductTypeCode.Swap, com.tools20022.repository.codeset.ProductTypeCode.Other);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Agency.getCodeName().get(), Agency);
		codesByName.put(Commodity.getCodeName().get(), Commodity);
		codesByName.put(Corporate.getCodeName().get(), Corporate);
		codesByName.put(Currency.getCodeName().get(), Currency);
		codesByName.put(Equity.getCodeName().get(), Equity);
		codesByName.put(Government.getCodeName().get(), Government);
		codesByName.put(Loan.getCodeName().get(), Loan);
		codesByName.put(MoneyMarket.getCodeName().get(), MoneyMarket);
		codesByName.put(Mortgage.getCodeName().get(), Mortgage);
		codesByName.put(Municipal.getCodeName().get(), Municipal);
		codesByName.put(Financing.getCodeName().get(), Financing);
		codesByName.put(Property.getCodeName().get(), Property);
		codesByName.put(Swap.getCodeName().get(), Swap);
		codesByName.put(Other.getCodeName().get(), Other);
	}

	public static ProductTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ProductTypeCode[] values() {
		ProductTypeCode[] values = new ProductTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ProductTypeCode> {
		@Override
		public ProductTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ProductTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}