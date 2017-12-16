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
import com.tools20022.repository.codeset.ProductCharacteristicsCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the charateristics of a product.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristicsCode#BuyersItemSpecification
 * ProductCharacteristicsCode.mmBuyersItemSpecification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristicsCode#ChassisNumber
 * ProductCharacteristicsCode.mmChassisNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristicsCode#Colour
 * ProductCharacteristicsCode.mmColour}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristicsCode#EngineDisplacement
 * ProductCharacteristicsCode.mmEngineDisplacement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristicsCode#EngineNumber
 * ProductCharacteristicsCode.mmEngineNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristicsCode#Option
 * ProductCharacteristicsCode.mmOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristicsCode#OriginCriterion
 * ProductCharacteristicsCode.mmOriginCriterion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristicsCode#PercentageByVolume
 * ProductCharacteristicsCode.mmPercentageByVolume}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristicsCode#SellersItemSpecification
 * ProductCharacteristicsCode.mmSellersItemSpecification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristicsCode#Size
 * ProductCharacteristicsCode.mmSize}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristicsCode#SizeRange
 * ProductCharacteristicsCode.mmSizeRange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristicsCode#SpecialRemarks
 * ProductCharacteristicsCode.mmSpecialRemarks}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristicsCode#StorageCode
 * ProductCharacteristicsCode.mmStorageCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristicsCode#VehicleIdentificationNumber
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
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ProductCharacteristicsCode extends MMCode {

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
	public static final ProductCharacteristicsCode BuyersItemSpecification = new ProductCharacteristicsCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BuyersItemSpecification";
			definition = "Detailed product information as assigned by the buyer.";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductCharacteristicsCode.mmObject();
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
	public static final ProductCharacteristicsCode ChassisNumber = new ProductCharacteristicsCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ChassisNumber";
			definition = "Unique identifier affixed by manufacturer to a chassis for identification purposes.";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductCharacteristicsCode.mmObject();
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
	public static final ProductCharacteristicsCode Colour = new ProductCharacteristicsCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Colour";
			definition = "Indication of the product colour.";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductCharacteristicsCode.mmObject();
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
	public static final ProductCharacteristicsCode EngineDisplacement = new ProductCharacteristicsCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EngineDisplacement";
			definition = "The total of the volume used for combustion inside the cylinders of an engine. This is expressed in cubic centimetres.";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductCharacteristicsCode.mmObject();
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
	public static final ProductCharacteristicsCode EngineNumber = new ProductCharacteristicsCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EngineNumber";
			definition = "Unique identifier affixed by manufacturer to an engine for identification purposes.";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductCharacteristicsCode.mmObject();
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
	public static final ProductCharacteristicsCode Option = new ProductCharacteristicsCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Option";
			definition = "Identifier of a sub-category of a product such as size, colour, etc.";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductCharacteristicsCode.mmObject();
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
	public static final ProductCharacteristicsCode OriginCriterion = new ProductCharacteristicsCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OriginCriterion";
			definition = "Code assigned to the product describing how it will be stored.";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductCharacteristicsCode.mmObject();
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
	public static final ProductCharacteristicsCode PercentageByVolume = new ProductCharacteristicsCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PercentageByVolume";
			definition = "Percentage by volume.";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductCharacteristicsCode.mmObject();
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
	public static final ProductCharacteristicsCode SellersItemSpecification = new ProductCharacteristicsCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SellersItemSpecification";
			definition = "Detailed product information as assigned by the seller.";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductCharacteristicsCode.mmObject();
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
	public static final ProductCharacteristicsCode Size = new ProductCharacteristicsCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Size";
			definition = "Indication of the product size.";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductCharacteristicsCode.mmObject();
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
	public static final ProductCharacteristicsCode SizeRange = new ProductCharacteristicsCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SizeRange";
			definition = "Range of product sizes.";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductCharacteristicsCode.mmObject();
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
	public static final ProductCharacteristicsCode SpecialRemarks = new ProductCharacteristicsCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SpecialRemarks";
			definition = "Special remarks about a product.";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductCharacteristicsCode.mmObject();
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
	public static final ProductCharacteristicsCode StorageCode = new ProductCharacteristicsCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StorageCode";
			definition = "Code assigned to the product describing how it will be stored.";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductCharacteristicsCode.mmObject();
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
	public static final ProductCharacteristicsCode VehicleIdentificationNumber = new ProductCharacteristicsCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VehicleIdentificationNumber";
			definition = "The identification number which uniquely distinguishes one vehicle from another through the lifespan of the vehicle.";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductCharacteristicsCode.mmObject();
			codeName = "VINR";
		}
	};
	final static private LinkedHashMap<String, ProductCharacteristicsCode> codesByName = new LinkedHashMap<>();

	protected ProductCharacteristicsCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("BISP");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ProductCharacteristicsCode";
				definition = "Specifies the charateristics of a product.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ProductCharacteristicsCode.BuyersItemSpecification, com.tools20022.repository.codeset.ProductCharacteristicsCode.ChassisNumber,
						com.tools20022.repository.codeset.ProductCharacteristicsCode.Colour, com.tools20022.repository.codeset.ProductCharacteristicsCode.EngineDisplacement,
						com.tools20022.repository.codeset.ProductCharacteristicsCode.EngineNumber, com.tools20022.repository.codeset.ProductCharacteristicsCode.Option,
						com.tools20022.repository.codeset.ProductCharacteristicsCode.OriginCriterion, com.tools20022.repository.codeset.ProductCharacteristicsCode.PercentageByVolume,
						com.tools20022.repository.codeset.ProductCharacteristicsCode.SellersItemSpecification, com.tools20022.repository.codeset.ProductCharacteristicsCode.Size,
						com.tools20022.repository.codeset.ProductCharacteristicsCode.SizeRange, com.tools20022.repository.codeset.ProductCharacteristicsCode.SpecialRemarks,
						com.tools20022.repository.codeset.ProductCharacteristicsCode.StorageCode, com.tools20022.repository.codeset.ProductCharacteristicsCode.VehicleIdentificationNumber);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(BuyersItemSpecification.getCodeName().get(), BuyersItemSpecification);
		codesByName.put(ChassisNumber.getCodeName().get(), ChassisNumber);
		codesByName.put(Colour.getCodeName().get(), Colour);
		codesByName.put(EngineDisplacement.getCodeName().get(), EngineDisplacement);
		codesByName.put(EngineNumber.getCodeName().get(), EngineNumber);
		codesByName.put(Option.getCodeName().get(), Option);
		codesByName.put(OriginCriterion.getCodeName().get(), OriginCriterion);
		codesByName.put(PercentageByVolume.getCodeName().get(), PercentageByVolume);
		codesByName.put(SellersItemSpecification.getCodeName().get(), SellersItemSpecification);
		codesByName.put(Size.getCodeName().get(), Size);
		codesByName.put(SizeRange.getCodeName().get(), SizeRange);
		codesByName.put(SpecialRemarks.getCodeName().get(), SpecialRemarks);
		codesByName.put(StorageCode.getCodeName().get(), StorageCode);
		codesByName.put(VehicleIdentificationNumber.getCodeName().get(), VehicleIdentificationNumber);
	}

	public static ProductCharacteristicsCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ProductCharacteristicsCode[] values() {
		ProductCharacteristicsCode[] values = new ProductCharacteristicsCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ProductCharacteristicsCode> {
		@Override
		public ProductCharacteristicsCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ProductCharacteristicsCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}