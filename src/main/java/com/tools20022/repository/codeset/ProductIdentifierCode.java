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
 * Specifies the type of identifier of a product.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductIdentifierCode#mmBuyersItemNumber
 * ProductIdentifierCode.mmBuyersItemNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductIdentifierCode#mmCommercialDescriptionCodeName
 * ProductIdentifierCode.mmCommercialDescriptionCodeName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductIdentifierCode#mmEAN
 * ProductIdentifierCode.mmEAN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductIdentifierCode#mmHarmonizedTariffCodeName
 * ProductIdentifierCode.mmHarmonizedTariffCodeName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductIdentifierCode#mmManufacturersItemNumber
 * ProductIdentifierCode.mmManufacturersItemNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductIdentifierCode#mmModelNumber
 * ProductIdentifierCode.mmModelNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductIdentifierCode#mmPartNumber
 * ProductIdentifierCode.mmPartNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductIdentifierCode#mmQuotaCategory
 * ProductIdentifierCode.mmQuotaCategory}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductIdentifierCode#mmStyleNumber
 * ProductIdentifierCode.mmStyleNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductIdentifierCode#mmSuppliersItemNumber
 * ProductIdentifierCode.mmSuppliersItemNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductIdentifierCode#mmUniversalProductCode
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
public class ProductIdentifierCode {

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
	public static final MMCode mmBuyersItemNumber = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BuyersItemNumber";
			definition = "Product identifier assigned by the buyer.";
			owner_lazy = () -> ProductIdentifierCode.mmObject();
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
	public static final MMCode mmCommercialDescriptionCodeName = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CommercialDescriptionCodeName";
			definition = "A code to identify a product based on applicable commercial conditions.";
			owner_lazy = () -> ProductIdentifierCode.mmObject();
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
	public static final MMCode mmEAN = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EAN";
			definition = "The unique EAN (European Article Number) code.";
			owner_lazy = () -> ProductIdentifierCode.mmObject();
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
	public static final MMCode mmHarmonizedTariffCodeName = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "HarmonizedTariffCodeName";
			definition = "Classification of goods as developed by the Customs Cooperation council.";
			owner_lazy = () -> ProductIdentifierCode.mmObject();
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
	public static final MMCode mmManufacturersItemNumber = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ManufacturersItemNumber";
			definition = "Product identifier as assigned by the manufacturer.";
			owner_lazy = () -> ProductIdentifierCode.mmObject();
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
	public static final MMCode mmModelNumber = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ModelNumber";
			definition = "Reference number assigned by the manufacturer to differentiate variations in similar products in a class or group.";
			owner_lazy = () -> ProductIdentifierCode.mmObject();
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
	public static final MMCode mmPartNumber = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartNumber";
			definition = "Reference assigned by the manufacturer to a product part.";
			owner_lazy = () -> ProductIdentifierCode.mmObject();
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
	public static final MMCode mmQuotaCategory = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "QuotaCategory";
			definition = "Product identifier used by the retail industry.";
			owner_lazy = () -> ProductIdentifierCode.mmObject();
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
	public static final MMCode mmStyleNumber = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StyleNumber";
			definition = "Identification of the style of a product.";
			owner_lazy = () -> ProductIdentifierCode.mmObject();
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
	public static final MMCode mmSuppliersItemNumber = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SuppliersItemNumber";
			definition = "Number assigned to an article by the supplier of that article.";
			owner_lazy = () -> ProductIdentifierCode.mmObject();
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
	public static final MMCode mmUniversalProductCode = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UniversalProductCode";
			definition = "Number assigned to a manufacturer's product by the Product Code Council.";
			owner_lazy = () -> ProductIdentifierCode.mmObject();
			codeName = "UPCC";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("BINR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ProductIdentifierCode";
				definition = "Specifies the type of identifier of a product.";
				code_lazy = () -> Arrays.asList(ProductIdentifierCode.mmBuyersItemNumber, ProductIdentifierCode.mmCommercialDescriptionCodeName, ProductIdentifierCode.mmEAN, ProductIdentifierCode.mmHarmonizedTariffCodeName,
						ProductIdentifierCode.mmManufacturersItemNumber, ProductIdentifierCode.mmModelNumber, ProductIdentifierCode.mmPartNumber, ProductIdentifierCode.mmQuotaCategory, ProductIdentifierCode.mmStyleNumber,
						ProductIdentifierCode.mmSuppliersItemNumber, ProductIdentifierCode.mmUniversalProductCode);
			}
		});
		return mmObject_lazy.get();
	}
}