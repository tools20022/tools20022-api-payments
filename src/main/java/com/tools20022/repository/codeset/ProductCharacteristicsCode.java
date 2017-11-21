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
 * Specifies the charateristics of a product.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristicsCode#mmBuyersItemSpecification
 * ProductCharacteristicsCode.mmBuyersItemSpecification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristicsCode#mmChassisNumber
 * ProductCharacteristicsCode.mmChassisNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristicsCode#mmColour
 * ProductCharacteristicsCode.mmColour}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristicsCode#mmEngineDisplacement
 * ProductCharacteristicsCode.mmEngineDisplacement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristicsCode#mmEngineNumber
 * ProductCharacteristicsCode.mmEngineNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristicsCode#mmOption
 * ProductCharacteristicsCode.mmOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristicsCode#mmOriginCriterion
 * ProductCharacteristicsCode.mmOriginCriterion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristicsCode#mmPercentageByVolume
 * ProductCharacteristicsCode.mmPercentageByVolume}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristicsCode#mmSellersItemSpecification
 * ProductCharacteristicsCode.mmSellersItemSpecification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristicsCode#mmSize
 * ProductCharacteristicsCode.mmSize}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristicsCode#mmSizeRange
 * ProductCharacteristicsCode.mmSizeRange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristicsCode#mmSpecialRemarks
 * ProductCharacteristicsCode.mmSpecialRemarks}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristicsCode#mmStorageCode
 * ProductCharacteristicsCode.mmStorageCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristicsCode#mmVehicleIdentificationNumber
 * ProductCharacteristicsCode.mmVehicleIdentificationNumber}</li>
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
 * <li>"BISP"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ProductCharacteristicsCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the charateristics of a product."</li>
 * </ul>
 */
public class ProductCharacteristicsCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Detailed product information as assigned by the buyer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristicsCode
	 * ProductCharacteristicsCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BISP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyersItemSpecification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Detailed product information as assigned by the buyer."</li>
	 * </ul>
	 */
	public static final MMCode mmBuyersItemSpecification = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BuyersItemSpecification";
			definition = "Detailed product information as assigned by the buyer.";
			owner_lazy = () -> ProductCharacteristicsCode.mmObject();
			codeName = "BISP";
		}
	};
	/**
	 * Unique identifier affixed by manufacturer to a chassis for identification
	 * purposes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristicsCode
	 * ProductCharacteristicsCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CHNR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChassisNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identifier affixed by manufacturer to a chassis for identification purposes."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmChassisNumber = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ChassisNumber";
			definition = "Unique identifier affixed by manufacturer to a chassis for identification purposes.";
			owner_lazy = () -> ProductCharacteristicsCode.mmObject();
			codeName = "CHNR";
		}
	};
	/**
	 * Indication of the product colour.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristicsCode
	 * ProductCharacteristicsCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLOR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Colour"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indication of the product colour."</li>
	 * </ul>
	 */
	public static final MMCode mmColour = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Colour";
			definition = "Indication of the product colour.";
			owner_lazy = () -> ProductCharacteristicsCode.mmObject();
			codeName = "CLOR";
		}
	};
	/**
	 * The total of the volume used for combustion inside the cylinders of an
	 * engine. This is expressed in cubic centimetres.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristicsCode
	 * ProductCharacteristicsCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EDSP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EngineDisplacement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The total of the volume used for combustion inside the cylinders of an engine. This is expressed in cubic centimetres."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmEngineDisplacement = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EngineDisplacement";
			definition = "The total of the volume used for combustion inside the cylinders of an engine. This is expressed in cubic centimetres.";
			owner_lazy = () -> ProductCharacteristicsCode.mmObject();
			codeName = "EDSP";
		}
	};
	/**
	 * Unique identifier affixed by manufacturer to an engine for identification
	 * purposes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristicsCode
	 * ProductCharacteristicsCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ENNR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EngineNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identifier affixed by manufacturer to an engine for identification purposes."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmEngineNumber = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EngineNumber";
			definition = "Unique identifier affixed by manufacturer to an engine for identification purposes.";
			owner_lazy = () -> ProductCharacteristicsCode.mmObject();
			codeName = "ENNR";
		}
	};
	/**
	 * Identifier of a sub-category of a product such as size, colour, etc.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristicsCode
	 * ProductCharacteristicsCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OPTN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Option"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier of a sub-category of a product such as size, colour, etc."</li>
	 * </ul>
	 */
	public static final MMCode mmOption = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Option";
			definition = "Identifier of a sub-category of a product such as size, colour, etc.";
			owner_lazy = () -> ProductCharacteristicsCode.mmObject();
			codeName = "OPTN";
		}
	};
	/**
	 * Code assigned to the product describing how it will be stored.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristicsCode
	 * ProductCharacteristicsCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ORCR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginCriterion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Code assigned to the product describing how it will be stored."</li>
	 * </ul>
	 */
	public static final MMCode mmOriginCriterion = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OriginCriterion";
			definition = "Code assigned to the product describing how it will be stored.";
			owner_lazy = () -> ProductCharacteristicsCode.mmObject();
			codeName = "ORCR";
		}
	};
	/**
	 * Percentage by volume.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristicsCode
	 * ProductCharacteristicsCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PCTV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PercentageByVolume"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Percentage by volume."</li>
	 * </ul>
	 */
	public static final MMCode mmPercentageByVolume = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PercentageByVolume";
			definition = "Percentage by volume.";
			owner_lazy = () -> ProductCharacteristicsCode.mmObject();
			codeName = "PCTV";
		}
	};
	/**
	 * Detailed product information as assigned by the seller.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristicsCode
	 * ProductCharacteristicsCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SISP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellersItemSpecification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Detailed product information as assigned by the seller."</li>
	 * </ul>
	 */
	public static final MMCode mmSellersItemSpecification = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SellersItemSpecification";
			definition = "Detailed product information as assigned by the seller.";
			owner_lazy = () -> ProductCharacteristicsCode.mmObject();
			codeName = "SISP";
		}
	};
	/**
	 * Indication of the product size.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristicsCode
	 * ProductCharacteristicsCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SIZE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Size"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indication of the product size."</li>
	 * </ul>
	 */
	public static final MMCode mmSize = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Size";
			definition = "Indication of the product size.";
			owner_lazy = () -> ProductCharacteristicsCode.mmObject();
			codeName = "SIZE";
		}
	};
	/**
	 * Range of product sizes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristicsCode
	 * ProductCharacteristicsCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SZRG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SizeRange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Range of product sizes."</li>
	 * </ul>
	 */
	public static final MMCode mmSizeRange = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SizeRange";
			definition = "Range of product sizes.";
			owner_lazy = () -> ProductCharacteristicsCode.mmObject();
			codeName = "SZRG";
		}
	};
	/**
	 * Special remarks about a product.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristicsCode
	 * ProductCharacteristicsCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPRM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialRemarks"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Special remarks about a product."</li>
	 * </ul>
	 */
	public static final MMCode mmSpecialRemarks = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SpecialRemarks";
			definition = "Special remarks about a product.";
			owner_lazy = () -> ProductCharacteristicsCode.mmObject();
			codeName = "SPRM";
		}
	};
	/**
	 * Code assigned to the product describing how it will be stored.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristicsCode
	 * ProductCharacteristicsCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STOR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StorageCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Code assigned to the product describing how it will be stored."</li>
	 * </ul>
	 */
	public static final MMCode mmStorageCode = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StorageCode";
			definition = "Code assigned to the product describing how it will be stored.";
			owner_lazy = () -> ProductCharacteristicsCode.mmObject();
			codeName = "STOR";
		}
	};
	/**
	 * The identification number which uniquely distinguishes one vehicle from
	 * another through the lifespan of the vehicle.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristicsCode
	 * ProductCharacteristicsCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VINR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VehicleIdentificationNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The identification number which uniquely distinguishes one vehicle from another through the lifespan of the vehicle."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmVehicleIdentificationNumber = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VehicleIdentificationNumber";
			definition = "The identification number which uniquely distinguishes one vehicle from another through the lifespan of the vehicle.";
			owner_lazy = () -> ProductCharacteristicsCode.mmObject();
			codeName = "VINR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("BISP");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ProductCharacteristicsCode";
				definition = "Specifies the charateristics of a product.";
				code_lazy = () -> Arrays.asList(ProductCharacteristicsCode.mmBuyersItemSpecification, ProductCharacteristicsCode.mmChassisNumber, ProductCharacteristicsCode.mmColour, ProductCharacteristicsCode.mmEngineDisplacement,
						ProductCharacteristicsCode.mmEngineNumber, ProductCharacteristicsCode.mmOption, ProductCharacteristicsCode.mmOriginCriterion, ProductCharacteristicsCode.mmPercentageByVolume,
						ProductCharacteristicsCode.mmSellersItemSpecification, ProductCharacteristicsCode.mmSize, ProductCharacteristicsCode.mmSizeRange, ProductCharacteristicsCode.mmSpecialRemarks,
						ProductCharacteristicsCode.mmStorageCode, ProductCharacteristicsCode.mmVehicleIdentificationNumber);
			}
		});
		return mmObject_lazy.get();
	}
}