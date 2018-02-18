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
import com.tools20022.repository.codeset.ProductCategoryCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the category of a product.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductCategoryCode#HarmonizedTariffCodeName
 * ProductCategoryCode.HarmonizedTariffCodeName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductCategoryCode#QuotaCategory
 * ProductCategoryCode.QuotaCategory}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductCategoryCode#ProductGroup
 * ProductCategoryCode.ProductGroup}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductCategoryCode#LineOfBusiness
 * ProductCategoryCode.LineOfBusiness}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ProductCategoryCode#Gender
 * ProductCategoryCode.Gender}</li>
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
 * <li>"HRTR"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ProductCategoryCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the category of a product."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ProductCategoryCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Classification of goods as developed by the Customs Cooperation council.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductCategoryCode
	 * ProductCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HRTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HarmonizedTariffCodeName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Classification of goods as developed by the Customs Cooperation council."
	 * </li>
	 * </ul>
	 */
	public static final ProductCategoryCode HarmonizedTariffCodeName = new ProductCategoryCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "HarmonizedTariffCodeName";
			definition = "Classification of goods as developed by the Customs Cooperation council.";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductCategoryCode.mmObject();
			codeName = "HRTR";
		}
	};
	/**
	 * Product identifier used by the retail industry.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductCategoryCode
	 * ProductCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "QOTA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuotaCategory"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Product identifier used by the retail industry."</li>
	 * </ul>
	 */
	public static final ProductCategoryCode QuotaCategory = new ProductCategoryCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "QuotaCategory";
			definition = "Product identifier used by the retail industry.";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductCategoryCode.mmObject();
			codeName = "QOTA";
		}
	};
	/**
	 * Product Group Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductCategoryCode
	 * ProductCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRGP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProductGroup"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Product Group Code."</li>
	 * </ul>
	 */
	public static final ProductCategoryCode ProductGroup = new ProductCategoryCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProductGroup";
			definition = "Product Group Code.";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductCategoryCode.mmObject();
			codeName = "PRGP";
		}
	};
	/**
	 * Line of business code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductCategoryCode
	 * ProductCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LOBU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LineOfBusiness"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Line of business code."</li>
	 * </ul>
	 */
	public static final ProductCategoryCode LineOfBusiness = new ProductCategoryCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LineOfBusiness";
			definition = "Line of business code.";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductCategoryCode.mmObject();
			codeName = "LOBU";
		}
	};
	/**
	 * Code for gender.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductCategoryCode
	 * ProductCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GNDR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Gender"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for gender."</li>
	 * </ul>
	 */
	public static final ProductCategoryCode Gender = new ProductCategoryCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Gender";
			definition = "Code for gender.";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductCategoryCode.mmObject();
			codeName = "GNDR";
		}
	};
	final static private LinkedHashMap<String, ProductCategoryCode> codesByName = new LinkedHashMap<>();

	protected ProductCategoryCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("HRTR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ProductCategoryCode";
				definition = "Specifies the category of a product.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ProductCategoryCode.HarmonizedTariffCodeName, com.tools20022.repository.codeset.ProductCategoryCode.QuotaCategory,
						com.tools20022.repository.codeset.ProductCategoryCode.ProductGroup, com.tools20022.repository.codeset.ProductCategoryCode.LineOfBusiness, com.tools20022.repository.codeset.ProductCategoryCode.Gender);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(HarmonizedTariffCodeName.getCodeName().get(), HarmonizedTariffCodeName);
		codesByName.put(QuotaCategory.getCodeName().get(), QuotaCategory);
		codesByName.put(ProductGroup.getCodeName().get(), ProductGroup);
		codesByName.put(LineOfBusiness.getCodeName().get(), LineOfBusiness);
		codesByName.put(Gender.getCodeName().get(), Gender);
	}

	public static ProductCategoryCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ProductCategoryCode[] values() {
		ProductCategoryCode[] values = new ProductCategoryCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ProductCategoryCode> {
		@Override
		public ProductCategoryCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ProductCategoryCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}