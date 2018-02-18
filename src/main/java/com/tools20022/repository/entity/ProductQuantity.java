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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.UnitOfMeasureCode;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.Max15NumericText;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.BillingServiceAdjustment1;
import com.tools20022.repository.msg.BillingServiceParameters2;
import com.tools20022.repository.msg.BillingServiceParameters3;
import com.tools20022.repository.msg.Product2;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the ordered quantity of a product.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="ProductQuantity" src="doc-files/ProductQuantity.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmUnitOfMeasure
 * ProductQuantity.mmUnitOfMeasure}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ProductQuantity#mmValue
 * ProductQuantity.mmValue}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ProductQuantity#mmProduct
 * ProductQuantity.mmProduct}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ProductQuantity#mmFactor
 * ProductQuantity.mmFactor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmNetWeightRelatedLineItem
 * ProductQuantity.mmNetWeightRelatedLineItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmBilledQuantityRelatedLineItem
 * ProductQuantity.mmBilledQuantityRelatedLineItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmRelatedPackaging
 * ProductQuantity.mmRelatedPackaging}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmPackagingForUnitQuantity
 * ProductQuantity.mmPackagingForUnitQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmChargeFreeQuantityRelatedLineItem
 * ProductQuantity.mmChargeFreeQuantityRelatedLineItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmMeasureQuantityStart
 * ProductQuantity.mmMeasureQuantityStart}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmMeasureQuantityEnd
 * ProductQuantity.mmMeasureQuantityEnd}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmQuantityTolerance
 * ProductQuantity.mmQuantityTolerance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmPackagingForConsignmentlQuantity
 * ProductQuantity.mmPackagingForConsignmentlQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmPackagingForVolume
 * ProductQuantity.mmPackagingForVolume}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmPackagingForWeight
 * ProductQuantity.mmPackagingForWeight}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmGrossPriceQuantityRelatedLineItem
 * ProductQuantity.mmGrossPriceQuantityRelatedLineItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmNetPriceQuantityRelatedLineItem
 * ProductQuantity.mmNetPriceQuantityRelatedLineItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmGrossWeightRelatedLineItem
 * ProductQuantity.mmGrossWeightRelatedLineItem}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Product#mmQuantity
 * Product.mmQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tolerance#mmQuantity
 * Tolerance.mmQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LineItem#mmNetWeight
 * LineItem.mmNetWeight}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LineItem#mmBilledQuantity
 * LineItem.mmBilledQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.LineItem#mmChargeFreeQuantity
 * LineItem.mmChargeFreeQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.LineItem#mmMeasureQuantityStartRelatedLineItem
 * LineItem.mmMeasureQuantityStartRelatedLineItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.LineItem#mmMeasureQuantityEndRelatedLineItem
 * LineItem.mmMeasureQuantityEndRelatedLineItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.LineItem#mmGrossPriceQuantity
 * LineItem.mmGrossPriceQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LineItem#mmNetPriceQuantity
 * LineItem.mmNetPriceQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LineItem#mmGrossWeight
 * LineItem.mmGrossWeight}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Packaging#mmQuantity
 * Packaging.mmQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Packaging#mmPerPackageUnitQuantity
 * Packaging.mmPerPackageUnitQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Packaging#mmTotalConsignmentQuantity
 * Packaging.mmTotalConsignmentQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Packaging#mmTotalVolume
 * Packaging.mmTotalVolume}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Packaging#mmTotalWeight
 * Packaging.mmTotalWeight}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ProductQuantity"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the ordered quantity of a product."</li>
 * </ul>
 */
public class ProductQuantity {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected UnitOfMeasureCode unitOfMeasure;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Product2#mmUnitOfMeasure
	 * Product2.mmUnitOfMeasure}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity
	 * ProductQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitOfMeasure"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the unit of measurement. For example, kilo, tons."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmUnitOfMeasure = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Product2.mmUnitOfMeasure);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ProductQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnitOfMeasure";
			definition = "Specifies the unit of measurement. For example, kilo, tons.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UnitOfMeasureCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ProductQuantity.class.getMethod("getUnitOfMeasure", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DecimalNumber value;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Product2#mmProductQuantity
	 * Product2.mmProductQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServiceParameters2#mmVolume
	 * BillingServiceParameters2.mmVolume}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1#mmVolumeChange
	 * BillingServiceAdjustment1.mmVolumeChange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1#mmOriginalVolume
	 * BillingServiceAdjustment1.mmOriginalVolume}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1#mmNewVolume
	 * BillingServiceAdjustment1.mmNewVolume}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServiceParameters3#mmVolume
	 * BillingServiceParameters3.mmVolume}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity
	 * ProductQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Value"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of a product on a line specified by a number. For example, 100 (kgs), 50 (pieces)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmValue = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Product2.mmProductQuantity, BillingServiceParameters2.mmVolume, BillingServiceAdjustment1.mmVolumeChange, BillingServiceAdjustment1.mmOriginalVolume, BillingServiceAdjustment1.mmNewVolume,
					BillingServiceParameters3.mmVolume);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ProductQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Value";
			definition = "Quantity of a product on a line specified by a number. For example, 100 (kgs), 50 (pieces).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ProductQuantity.class.getMethod("getValue", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.Product> product;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmQuantity
	 * Product.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Product Product}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity
	 * ProductQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Product"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of goods and services linked to the quantity."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmProduct = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ProductQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Product";
			definition = "Specifies the type of goods and services linked to the quantity.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Product.mmQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Product.mmObject();
		}
	};
	protected Max15NumericText factor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max15NumericText
	 * Max15NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity
	 * ProductQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Factor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Multiplication factor of measurement values. For example: goods that can be ordered by 36 pieces."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmFactor = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ProductQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Factor";
			definition = "Multiplication factor of measurement values. For example: goods that can be ordered by 36 pieces.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ProductQuantity.class.getMethod("getFactor", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected LineItem netWeightRelatedLineItem;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LineItem#mmNetWeight
	 * LineItem.mmNetWeight}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.LineItem LineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity
	 * ProductQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetWeightRelatedLineItem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Line item for which a net weight is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmNetWeightRelatedLineItem = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ProductQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NetWeightRelatedLineItem";
			definition = "Line item for which a net weight is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.LineItem.mmNetWeight;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.LineItem.mmObject();
		}
	};
	protected LineItem billedQuantityRelatedLineItem;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LineItem#mmBilledQuantity
	 * LineItem.mmBilledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.LineItem LineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity
	 * ProductQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BilledQuantityRelatedLineItem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Line item which contains this quantity."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmBilledQuantityRelatedLineItem = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ProductQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BilledQuantityRelatedLineItem";
			definition = "Line item which contains this quantity.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.LineItem.mmBilledQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.LineItem.mmObject();
		}
	};
	protected Packaging relatedPackaging;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Packaging#mmQuantity
	 * Packaging.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Packaging Packaging}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity
	 * ProductQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPackaging"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Packaging for which a quantity is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedPackaging = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ProductQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedPackaging";
			definition = "Packaging for which a quantity is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Packaging.mmQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Packaging.mmObject();
		}
	};
	protected Packaging packagingForUnitQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Packaging#mmPerPackageUnitQuantity
	 * Packaging.mmPerPackageUnitQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Packaging Packaging}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity
	 * ProductQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PackagingForUnitQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Packaging for which a unit quantity per package is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPackagingForUnitQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ProductQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PackagingForUnitQuantity";
			definition = "Packaging for which a unit quantity per package is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Packaging.mmPerPackageUnitQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Packaging.mmObject();
		}
	};
	protected LineItem chargeFreeQuantityRelatedLineItem;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LineItem#mmChargeFreeQuantity
	 * LineItem.mmChargeFreeQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.LineItem LineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity
	 * ProductQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeFreeQuantityRelatedLineItem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Line item for which a charge free quantity of product is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmChargeFreeQuantityRelatedLineItem = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ProductQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ChargeFreeQuantityRelatedLineItem";
			definition = "Line item for which a charge free quantity of product is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.LineItem.mmChargeFreeQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.LineItem.mmObject();
		}
	};
	protected LineItem measureQuantityStart;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LineItem#mmMeasureQuantityStartRelatedLineItem
	 * LineItem.mmMeasureQuantityStartRelatedLineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.LineItem LineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity
	 * ProductQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeasureQuantityStart"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity value on which the quantity measurement started for a line item. For instance the start amount of a meter reading for an electricity supplier."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmMeasureQuantityStart = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ProductQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MeasureQuantityStart";
			definition = "Quantity value on which the quantity measurement started for a line item. For instance the start amount of a meter reading for an electricity supplier.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.LineItem.mmMeasureQuantityStartRelatedLineItem;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.LineItem.mmObject();
		}
	};
	protected LineItem measureQuantityEnd;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LineItem#mmMeasureQuantityEndRelatedLineItem
	 * LineItem.mmMeasureQuantityEndRelatedLineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.LineItem LineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity
	 * ProductQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeasureQuantityEnd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity value on which the quantity measurement ended for a line item. For instance the end amount of a meter reading for an electricity supplier."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmMeasureQuantityEnd = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ProductQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MeasureQuantityEnd";
			definition = "Quantity value on which the quantity measurement ended for a line item. For instance the end amount of a meter reading for an electricity supplier.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.LineItem.mmMeasureQuantityEndRelatedLineItem;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.LineItem.mmObject();
		}
	};
	protected Tolerance quantityTolerance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Tolerance#mmQuantity
	 * Tolerance.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Tolerance Tolerance}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity
	 * ProductQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityTolerance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Variance allowed in the quantity of goods."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmQuantityTolerance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ProductQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "QuantityTolerance";
			definition = "Variance allowed in the quantity of goods.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Tolerance.mmQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Tolerance.mmObject();
		}
	};
	protected Packaging packagingForConsignmentlQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Packaging#mmTotalConsignmentQuantity
	 * Packaging.mmTotalConsignmentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Packaging Packaging}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity
	 * ProductQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PackagingForConsignmentlQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Packaging for which a total consignment quantity is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPackagingForConsignmentlQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ProductQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PackagingForConsignmentlQuantity";
			definition = "Packaging for which a total consignment quantity is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Packaging.mmTotalConsignmentQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Packaging.mmObject();
		}
	};
	protected Packaging packagingForVolume;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Packaging#mmTotalVolume
	 * Packaging.mmTotalVolume}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Packaging Packaging}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity
	 * ProductQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PackagingForVolume"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Packaging for which a volume is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPackagingForVolume = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ProductQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PackagingForVolume";
			definition = "Packaging for which a volume is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Packaging.mmTotalVolume;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Packaging.mmObject();
		}
	};
	protected Packaging packagingForWeight;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Packaging#mmTotalWeight
	 * Packaging.mmTotalWeight}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Packaging Packaging}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity
	 * ProductQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PackagingForWeight"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Packaging for which a weight is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPackagingForWeight = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ProductQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PackagingForWeight";
			definition = "Packaging for which a weight is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Packaging.mmTotalWeight;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Packaging.mmObject();
		}
	};
	protected LineItem grossPriceQuantityRelatedLineItem;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LineItem#mmGrossPriceQuantity
	 * LineItem.mmGrossPriceQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.LineItem LineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity
	 * ProductQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossPriceQuantityRelatedLineItem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Line item for which gross price quantity is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmGrossPriceQuantityRelatedLineItem = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ProductQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GrossPriceQuantityRelatedLineItem";
			definition = "Line item for which gross price quantity is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.LineItem.mmGrossPriceQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.LineItem.mmObject();
		}
	};
	protected LineItem netPriceQuantityRelatedLineItem;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LineItem#mmNetPriceQuantity
	 * LineItem.mmNetPriceQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.LineItem LineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity
	 * ProductQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetPriceQuantityRelatedLineItem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Line item for which a net price quantity is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmNetPriceQuantityRelatedLineItem = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ProductQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NetPriceQuantityRelatedLineItem";
			definition = "Line item for which a net price quantity is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.LineItem.mmNetPriceQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.LineItem.mmObject();
		}
	};
	protected LineItem grossWeightRelatedLineItem;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LineItem#mmGrossWeight
	 * LineItem.mmGrossWeight}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.LineItem LineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity
	 * ProductQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossWeightRelatedLineItem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Line item for which a gross weight is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmGrossWeightRelatedLineItem = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ProductQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GrossWeightRelatedLineItem";
			definition = "Line item for which a gross weight is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.LineItem.mmGrossWeight;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.LineItem.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ProductQuantity";
				definition = "Specifies the ordered quantity of a product.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Product.mmQuantity, com.tools20022.repository.entity.Tolerance.mmQuantity, com.tools20022.repository.entity.LineItem.mmNetWeight,
						com.tools20022.repository.entity.LineItem.mmBilledQuantity, com.tools20022.repository.entity.LineItem.mmChargeFreeQuantity, com.tools20022.repository.entity.LineItem.mmMeasureQuantityStartRelatedLineItem,
						com.tools20022.repository.entity.LineItem.mmMeasureQuantityEndRelatedLineItem, com.tools20022.repository.entity.LineItem.mmGrossPriceQuantity, com.tools20022.repository.entity.LineItem.mmNetPriceQuantity,
						com.tools20022.repository.entity.LineItem.mmGrossWeight, com.tools20022.repository.entity.Packaging.mmQuantity, com.tools20022.repository.entity.Packaging.mmPerPackageUnitQuantity,
						com.tools20022.repository.entity.Packaging.mmTotalConsignmentQuantity, com.tools20022.repository.entity.Packaging.mmTotalVolume, com.tools20022.repository.entity.Packaging.mmTotalWeight);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ProductQuantity.mmUnitOfMeasure, com.tools20022.repository.entity.ProductQuantity.mmValue, com.tools20022.repository.entity.ProductQuantity.mmProduct,
						com.tools20022.repository.entity.ProductQuantity.mmFactor, com.tools20022.repository.entity.ProductQuantity.mmNetWeightRelatedLineItem,
						com.tools20022.repository.entity.ProductQuantity.mmBilledQuantityRelatedLineItem, com.tools20022.repository.entity.ProductQuantity.mmRelatedPackaging,
						com.tools20022.repository.entity.ProductQuantity.mmPackagingForUnitQuantity, com.tools20022.repository.entity.ProductQuantity.mmChargeFreeQuantityRelatedLineItem,
						com.tools20022.repository.entity.ProductQuantity.mmMeasureQuantityStart, com.tools20022.repository.entity.ProductQuantity.mmMeasureQuantityEnd, com.tools20022.repository.entity.ProductQuantity.mmQuantityTolerance,
						com.tools20022.repository.entity.ProductQuantity.mmPackagingForConsignmentlQuantity, com.tools20022.repository.entity.ProductQuantity.mmPackagingForVolume,
						com.tools20022.repository.entity.ProductQuantity.mmPackagingForWeight, com.tools20022.repository.entity.ProductQuantity.mmGrossPriceQuantityRelatedLineItem,
						com.tools20022.repository.entity.ProductQuantity.mmNetPriceQuantityRelatedLineItem, com.tools20022.repository.entity.ProductQuantity.mmGrossWeightRelatedLineItem);
			}

			@Override
			public Class<?> getInstanceClass() {
				return ProductQuantity.class;
			}
		});
		return mmObject_lazy.get();
	}

	public UnitOfMeasureCode getUnitOfMeasure() {
		return unitOfMeasure;
	}

	public ProductQuantity setUnitOfMeasure(UnitOfMeasureCode unitOfMeasure) {
		this.unitOfMeasure = Objects.requireNonNull(unitOfMeasure);
		return this;
	}

	public DecimalNumber getValue() {
		return value;
	}

	public ProductQuantity setValue(DecimalNumber value) {
		this.value = Objects.requireNonNull(value);
		return this;
	}

	public List<Product> getProduct() {
		return product == null ? product = new ArrayList<>() : product;
	}

	public ProductQuantity setProduct(List<com.tools20022.repository.entity.Product> product) {
		this.product = Objects.requireNonNull(product);
		return this;
	}

	public Max15NumericText getFactor() {
		return factor;
	}

	public ProductQuantity setFactor(Max15NumericText factor) {
		this.factor = Objects.requireNonNull(factor);
		return this;
	}

	public Optional<LineItem> getNetWeightRelatedLineItem() {
		return netWeightRelatedLineItem == null ? Optional.empty() : Optional.of(netWeightRelatedLineItem);
	}

	public ProductQuantity setNetWeightRelatedLineItem(com.tools20022.repository.entity.LineItem netWeightRelatedLineItem) {
		this.netWeightRelatedLineItem = netWeightRelatedLineItem;
		return this;
	}

	public Optional<LineItem> getBilledQuantityRelatedLineItem() {
		return billedQuantityRelatedLineItem == null ? Optional.empty() : Optional.of(billedQuantityRelatedLineItem);
	}

	public ProductQuantity setBilledQuantityRelatedLineItem(com.tools20022.repository.entity.LineItem billedQuantityRelatedLineItem) {
		this.billedQuantityRelatedLineItem = billedQuantityRelatedLineItem;
		return this;
	}

	public Optional<Packaging> getRelatedPackaging() {
		return relatedPackaging == null ? Optional.empty() : Optional.of(relatedPackaging);
	}

	public ProductQuantity setRelatedPackaging(com.tools20022.repository.entity.Packaging relatedPackaging) {
		this.relatedPackaging = relatedPackaging;
		return this;
	}

	public Optional<Packaging> getPackagingForUnitQuantity() {
		return packagingForUnitQuantity == null ? Optional.empty() : Optional.of(packagingForUnitQuantity);
	}

	public ProductQuantity setPackagingForUnitQuantity(com.tools20022.repository.entity.Packaging packagingForUnitQuantity) {
		this.packagingForUnitQuantity = packagingForUnitQuantity;
		return this;
	}

	public Optional<LineItem> getChargeFreeQuantityRelatedLineItem() {
		return chargeFreeQuantityRelatedLineItem == null ? Optional.empty() : Optional.of(chargeFreeQuantityRelatedLineItem);
	}

	public ProductQuantity setChargeFreeQuantityRelatedLineItem(com.tools20022.repository.entity.LineItem chargeFreeQuantityRelatedLineItem) {
		this.chargeFreeQuantityRelatedLineItem = chargeFreeQuantityRelatedLineItem;
		return this;
	}

	public LineItem getMeasureQuantityStart() {
		return measureQuantityStart;
	}

	public ProductQuantity setMeasureQuantityStart(com.tools20022.repository.entity.LineItem measureQuantityStart) {
		this.measureQuantityStart = Objects.requireNonNull(measureQuantityStart);
		return this;
	}

	public LineItem getMeasureQuantityEnd() {
		return measureQuantityEnd;
	}

	public ProductQuantity setMeasureQuantityEnd(com.tools20022.repository.entity.LineItem measureQuantityEnd) {
		this.measureQuantityEnd = Objects.requireNonNull(measureQuantityEnd);
		return this;
	}

	public Tolerance getQuantityTolerance() {
		return quantityTolerance;
	}

	public ProductQuantity setQuantityTolerance(com.tools20022.repository.entity.Tolerance quantityTolerance) {
		this.quantityTolerance = Objects.requireNonNull(quantityTolerance);
		return this;
	}

	public Optional<Packaging> getPackagingForConsignmentlQuantity() {
		return packagingForConsignmentlQuantity == null ? Optional.empty() : Optional.of(packagingForConsignmentlQuantity);
	}

	public ProductQuantity setPackagingForConsignmentlQuantity(com.tools20022.repository.entity.Packaging packagingForConsignmentlQuantity) {
		this.packagingForConsignmentlQuantity = packagingForConsignmentlQuantity;
		return this;
	}

	public Optional<Packaging> getPackagingForVolume() {
		return packagingForVolume == null ? Optional.empty() : Optional.of(packagingForVolume);
	}

	public ProductQuantity setPackagingForVolume(com.tools20022.repository.entity.Packaging packagingForVolume) {
		this.packagingForVolume = packagingForVolume;
		return this;
	}

	public Optional<Packaging> getPackagingForWeight() {
		return packagingForWeight == null ? Optional.empty() : Optional.of(packagingForWeight);
	}

	public ProductQuantity setPackagingForWeight(com.tools20022.repository.entity.Packaging packagingForWeight) {
		this.packagingForWeight = packagingForWeight;
		return this;
	}

	public Optional<LineItem> getGrossPriceQuantityRelatedLineItem() {
		return grossPriceQuantityRelatedLineItem == null ? Optional.empty() : Optional.of(grossPriceQuantityRelatedLineItem);
	}

	public ProductQuantity setGrossPriceQuantityRelatedLineItem(com.tools20022.repository.entity.LineItem grossPriceQuantityRelatedLineItem) {
		this.grossPriceQuantityRelatedLineItem = grossPriceQuantityRelatedLineItem;
		return this;
	}

	public Optional<LineItem> getNetPriceQuantityRelatedLineItem() {
		return netPriceQuantityRelatedLineItem == null ? Optional.empty() : Optional.of(netPriceQuantityRelatedLineItem);
	}

	public ProductQuantity setNetPriceQuantityRelatedLineItem(com.tools20022.repository.entity.LineItem netPriceQuantityRelatedLineItem) {
		this.netPriceQuantityRelatedLineItem = netPriceQuantityRelatedLineItem;
		return this;
	}

	public Optional<LineItem> getGrossWeightRelatedLineItem() {
		return grossWeightRelatedLineItem == null ? Optional.empty() : Optional.of(grossWeightRelatedLineItem);
	}

	public ProductQuantity setGrossWeightRelatedLineItem(com.tools20022.repository.entity.LineItem grossWeightRelatedLineItem) {
		this.grossWeightRelatedLineItem = grossWeightRelatedLineItem;
		return this;
	}
}