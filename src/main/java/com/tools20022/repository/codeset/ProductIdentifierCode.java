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
import com.tools20022.repository.codeset.ProductIdentifierCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of identifier of a product.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductIdentifierCode#BuyersItemNumber
 * ProductIdentifierCode.mmBuyersItemNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductIdentifierCode#CommercialDescriptionCodeName
 * ProductIdentifierCode.mmCommercialDescriptionCodeName}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ProductIdentifierCode#EAN
 * ProductIdentifierCode.mmEAN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductIdentifierCode#HarmonizedTariffCodeName
 * ProductIdentifierCode.mmHarmonizedTariffCodeName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductIdentifierCode#ManufacturersItemNumber
 * ProductIdentifierCode.mmManufacturersItemNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductIdentifierCode#ModelNumber
 * ProductIdentifierCode.mmModelNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductIdentifierCode#PartNumber
 * ProductIdentifierCode.mmPartNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductIdentifierCode#QuotaCategory
 * ProductIdentifierCode.mmQuotaCategory}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductIdentifierCode#StyleNumber
 * ProductIdentifierCode.mmStyleNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductIdentifierCode#SuppliersItemNumber
 * ProductIdentifierCode.mmSuppliersItemNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductIdentifierCode#UniversalProductCode
 * ProductIdentifierCode.mmUniversalProductCode}</li>
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
 * <li>"BINR"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ProductIdentifierCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of identifier of a product."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ProductIdentifierCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Product identifier assigned by the buyer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductIdentifierCode
	 * ProductIdentifierCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BINR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyersItemNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Product identifier assigned by the buyer."</li>
	 * </ul>
	 */
	public static final ProductIdentifierCode BuyersItemNumber = new ProductIdentifierCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BuyersItemNumber";
			definition = "Product identifier assigned by the buyer.";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductIdentifierCode.mmObject();
			codeName = "BINR";
		}
	};
	/**
	 * A code to identify a product based on applicable commercial conditions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductIdentifierCode
	 * ProductIdentifierCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COMD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommercialDescriptionCodeName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A code to identify a product based on applicable commercial conditions."
	 * </li>
	 * </ul>
	 */
	public static final ProductIdentifierCode CommercialDescriptionCodeName = new ProductIdentifierCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CommercialDescriptionCodeName";
			definition = "A code to identify a product based on applicable commercial conditions.";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductIdentifierCode.mmObject();
			codeName = "COMD";
		}
	};
	/**
	 * The unique EAN (European Article Number) code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductIdentifierCode
	 * ProductIdentifierCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EANC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The unique EAN (European Article Number) code."</li>
	 * </ul>
	 */
	public static final ProductIdentifierCode EAN = new ProductIdentifierCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EAN";
			definition = "The unique EAN (European Article Number) code.";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductIdentifierCode.mmObject();
			codeName = "EANC";
		}
	};
	/**
	 * Classification of goods as developed by the Customs Cooperation council.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductIdentifierCode
	 * ProductIdentifierCode}</li>
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
	public static final ProductIdentifierCode HarmonizedTariffCodeName = new ProductIdentifierCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "HarmonizedTariffCodeName";
			definition = "Classification of goods as developed by the Customs Cooperation council.";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductIdentifierCode.mmObject();
			codeName = "HRTR";
		}
	};
	/**
	 * Product identifier as assigned by the manufacturer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductIdentifierCode
	 * ProductIdentifierCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MANI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ManufacturersItemNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Product identifier as assigned by the manufacturer."</li>
	 * </ul>
	 */
	public static final ProductIdentifierCode ManufacturersItemNumber = new ProductIdentifierCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ManufacturersItemNumber";
			definition = "Product identifier as assigned by the manufacturer.";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductIdentifierCode.mmObject();
			codeName = "MANI";
		}
	};
	/**
	 * Reference number assigned by the manufacturer to differentiate variations
	 * in similar products in a class or group.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductIdentifierCode
	 * ProductIdentifierCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MODL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModelNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference number assigned by the manufacturer to differentiate variations in similar products in a class or group."
	 * </li>
	 * </ul>
	 */
	public static final ProductIdentifierCode ModelNumber = new ProductIdentifierCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ModelNumber";
			definition = "Reference number assigned by the manufacturer to differentiate variations in similar products in a class or group.";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductIdentifierCode.mmObject();
			codeName = "MODL";
		}
	};
	/**
	 * Reference assigned by the manufacturer to a product part.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductIdentifierCode
	 * ProductIdentifierCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PART"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference assigned by the manufacturer to a product part."
	 * </li>
	 * </ul>
	 */
	public static final ProductIdentifierCode PartNumber = new ProductIdentifierCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartNumber";
			definition = "Reference assigned by the manufacturer to a product part.";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductIdentifierCode.mmObject();
			codeName = "PART";
		}
	};
	/**
	 * Product identifier used by the retail industry.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductIdentifierCode
	 * ProductIdentifierCode}</li>
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
	public static final ProductIdentifierCode QuotaCategory = new ProductIdentifierCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "QuotaCategory";
			definition = "Product identifier used by the retail industry.";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductIdentifierCode.mmObject();
			codeName = "QOTA";
		}
	};
	/**
	 * Identification of the style of a product.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductIdentifierCode
	 * ProductIdentifierCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STYL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StyleNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the style of a product."</li>
	 * </ul>
	 */
	public static final ProductIdentifierCode StyleNumber = new ProductIdentifierCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StyleNumber";
			definition = "Identification of the style of a product.";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductIdentifierCode.mmObject();
			codeName = "STYL";
		}
	};
	/**
	 * Number assigned to an article by the supplier of that article.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductIdentifierCode
	 * ProductIdentifierCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SUPI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SuppliersItemNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number assigned to an article by the supplier of that article."</li>
	 * </ul>
	 */
	public static final ProductIdentifierCode SuppliersItemNumber = new ProductIdentifierCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SuppliersItemNumber";
			definition = "Number assigned to an article by the supplier of that article.";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductIdentifierCode.mmObject();
			codeName = "SUPI";
		}
	};
	/**
	 * Number assigned to a manufacturer's product by the Product Code Council.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductIdentifierCode
	 * ProductIdentifierCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UPCC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UniversalProductCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number assigned to a manufacturer's product by the Product Code Council."
	 * </li>
	 * </ul>
	 */
	public static final ProductIdentifierCode UniversalProductCode = new ProductIdentifierCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UniversalProductCode";
			definition = "Number assigned to a manufacturer's product by the Product Code Council.";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductIdentifierCode.mmObject();
			codeName = "UPCC";
		}
	};
	final static private LinkedHashMap<String, ProductIdentifierCode> codesByName = new LinkedHashMap<>();

	protected ProductIdentifierCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("BINR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ProductIdentifierCode";
				definition = "Specifies the type of identifier of a product.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ProductIdentifierCode.BuyersItemNumber, com.tools20022.repository.codeset.ProductIdentifierCode.CommercialDescriptionCodeName,
						com.tools20022.repository.codeset.ProductIdentifierCode.EAN, com.tools20022.repository.codeset.ProductIdentifierCode.HarmonizedTariffCodeName,
						com.tools20022.repository.codeset.ProductIdentifierCode.ManufacturersItemNumber, com.tools20022.repository.codeset.ProductIdentifierCode.ModelNumber,
						com.tools20022.repository.codeset.ProductIdentifierCode.PartNumber, com.tools20022.repository.codeset.ProductIdentifierCode.QuotaCategory, com.tools20022.repository.codeset.ProductIdentifierCode.StyleNumber,
						com.tools20022.repository.codeset.ProductIdentifierCode.SuppliersItemNumber, com.tools20022.repository.codeset.ProductIdentifierCode.UniversalProductCode);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(BuyersItemNumber.getCodeName().get(), BuyersItemNumber);
		codesByName.put(CommercialDescriptionCodeName.getCodeName().get(), CommercialDescriptionCodeName);
		codesByName.put(EAN.getCodeName().get(), EAN);
		codesByName.put(HarmonizedTariffCodeName.getCodeName().get(), HarmonizedTariffCodeName);
		codesByName.put(ManufacturersItemNumber.getCodeName().get(), ManufacturersItemNumber);
		codesByName.put(ModelNumber.getCodeName().get(), ModelNumber);
		codesByName.put(PartNumber.getCodeName().get(), PartNumber);
		codesByName.put(QuotaCategory.getCodeName().get(), QuotaCategory);
		codesByName.put(StyleNumber.getCodeName().get(), StyleNumber);
		codesByName.put(SuppliersItemNumber.getCodeName().get(), SuppliersItemNumber);
		codesByName.put(UniversalProductCode.getCodeName().get(), UniversalProductCode);
	}

	public static ProductIdentifierCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ProductIdentifierCode[] values() {
		ProductIdentifierCode[] values = new ProductIdentifierCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ProductIdentifierCode> {
		@Override
		public ProductIdentifierCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ProductIdentifierCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}