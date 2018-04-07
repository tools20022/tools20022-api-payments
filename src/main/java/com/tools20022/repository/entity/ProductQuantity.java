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
import com.tools20022.repository.entity.LineItem;
import com.tools20022.repository.entity.Packaging;
import com.tools20022.repository.entity.Product;
import com.tools20022.repository.entity.Tolerance;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.BillingServiceAdjustment1;
import com.tools20022.repository.msg.BillingServiceParameters2;
import com.tools20022.repository.msg.BillingServiceParameters3;
import com.tools20022.repository.msg.Product2;
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
	public static final MMBusinessAttribute<ProductQuantity, UnitOfMeasureCode> mmUnitOfMeasure = new MMBusinessAttribute<ProductQuantity, UnitOfMeasureCode>() {
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

		@Override
		public UnitOfMeasureCode getValue(ProductQuantity obj) {
			return obj.getUnitOfMeasure();
		}

		@Override
		public void setValue(ProductQuantity obj, UnitOfMeasureCode value) {
			obj.setUnitOfMeasure(value);
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
	public static final MMBusinessAttribute<ProductQuantity, DecimalNumber> mmValue = new MMBusinessAttribute<ProductQuantity, DecimalNumber>() {
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

		@Override
		public DecimalNumber getValue(ProductQuantity obj) {
			return obj.getValue();
		}

		@Override
		public void setValue(ProductQuantity obj, DecimalNumber value) {
			obj.setValue(value);
		}
	};
	protected List<Product> product;
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
	public static final MMBusinessAssociationEnd<ProductQuantity, List<Product>> mmProduct = new MMBusinessAssociationEnd<ProductQuantity, List<Product>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ProductQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Product";
			definition = "Specifies the type of goods and services linked to the quantity.";
			minOccurs = 0;
			opposite_lazy = () -> Product.mmQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Product.mmObject();
		}

		@Override
		public List<Product> getValue(ProductQuantity obj) {
			return obj.getProduct();
		}

		@Override
		public void setValue(ProductQuantity obj, List<Product> value) {
			obj.setProduct(value);
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
	public static final MMBusinessAttribute<ProductQuantity, Max15NumericText> mmFactor = new MMBusinessAttribute<ProductQuantity, Max15NumericText>() {
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

		@Override
		public Max15NumericText getValue(ProductQuantity obj) {
			return obj.getFactor();
		}

		@Override
		public void setValue(ProductQuantity obj, Max15NumericText value) {
			obj.setFactor(value);
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
	public static final MMBusinessAssociationEnd<ProductQuantity, Optional<LineItem>> mmNetWeightRelatedLineItem = new MMBusinessAssociationEnd<ProductQuantity, Optional<LineItem>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ProductQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NetWeightRelatedLineItem";
			definition = "Line item for which a net weight is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> LineItem.mmNetWeight;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> LineItem.mmObject();
		}

		@Override
		public Optional<LineItem> getValue(ProductQuantity obj) {
			return obj.getNetWeightRelatedLineItem();
		}

		@Override
		public void setValue(ProductQuantity obj, Optional<LineItem> value) {
			obj.setNetWeightRelatedLineItem(value.orElse(null));
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
	public static final MMBusinessAssociationEnd<ProductQuantity, Optional<LineItem>> mmBilledQuantityRelatedLineItem = new MMBusinessAssociationEnd<ProductQuantity, Optional<LineItem>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ProductQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BilledQuantityRelatedLineItem";
			definition = "Line item which contains this quantity.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> LineItem.mmBilledQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> LineItem.mmObject();
		}

		@Override
		public Optional<LineItem> getValue(ProductQuantity obj) {
			return obj.getBilledQuantityRelatedLineItem();
		}

		@Override
		public void setValue(ProductQuantity obj, Optional<LineItem> value) {
			obj.setBilledQuantityRelatedLineItem(value.orElse(null));
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
	public static final MMBusinessAssociationEnd<ProductQuantity, Optional<Packaging>> mmRelatedPackaging = new MMBusinessAssociationEnd<ProductQuantity, Optional<Packaging>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ProductQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedPackaging";
			definition = "Packaging for which a quantity is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Packaging.mmQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Packaging.mmObject();
		}

		@Override
		public Optional<Packaging> getValue(ProductQuantity obj) {
			return obj.getRelatedPackaging();
		}

		@Override
		public void setValue(ProductQuantity obj, Optional<Packaging> value) {
			obj.setRelatedPackaging(value.orElse(null));
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
	public static final MMBusinessAssociationEnd<ProductQuantity, Optional<Packaging>> mmPackagingForUnitQuantity = new MMBusinessAssociationEnd<ProductQuantity, Optional<Packaging>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ProductQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PackagingForUnitQuantity";
			definition = "Packaging for which a unit quantity per package is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Packaging.mmPerPackageUnitQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Packaging.mmObject();
		}

		@Override
		public Optional<Packaging> getValue(ProductQuantity obj) {
			return obj.getPackagingForUnitQuantity();
		}

		@Override
		public void setValue(ProductQuantity obj, Optional<Packaging> value) {
			obj.setPackagingForUnitQuantity(value.orElse(null));
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
	public static final MMBusinessAssociationEnd<ProductQuantity, Optional<LineItem>> mmChargeFreeQuantityRelatedLineItem = new MMBusinessAssociationEnd<ProductQuantity, Optional<LineItem>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ProductQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ChargeFreeQuantityRelatedLineItem";
			definition = "Line item for which a charge free quantity of product is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> LineItem.mmChargeFreeQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> LineItem.mmObject();
		}

		@Override
		public Optional<LineItem> getValue(ProductQuantity obj) {
			return obj.getChargeFreeQuantityRelatedLineItem();
		}

		@Override
		public void setValue(ProductQuantity obj, Optional<LineItem> value) {
			obj.setChargeFreeQuantityRelatedLineItem(value.orElse(null));
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
	public static final MMBusinessAssociationEnd<ProductQuantity, LineItem> mmMeasureQuantityStart = new MMBusinessAssociationEnd<ProductQuantity, LineItem>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ProductQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MeasureQuantityStart";
			definition = "Quantity value on which the quantity measurement started for a line item. For instance the start amount of a meter reading for an electricity supplier.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> LineItem.mmMeasureQuantityStartRelatedLineItem;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> LineItem.mmObject();
		}

		@Override
		public LineItem getValue(ProductQuantity obj) {
			return obj.getMeasureQuantityStart();
		}

		@Override
		public void setValue(ProductQuantity obj, LineItem value) {
			obj.setMeasureQuantityStart(value);
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
	public static final MMBusinessAssociationEnd<ProductQuantity, LineItem> mmMeasureQuantityEnd = new MMBusinessAssociationEnd<ProductQuantity, LineItem>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ProductQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MeasureQuantityEnd";
			definition = "Quantity value on which the quantity measurement ended for a line item. For instance the end amount of a meter reading for an electricity supplier.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> LineItem.mmMeasureQuantityEndRelatedLineItem;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> LineItem.mmObject();
		}

		@Override
		public LineItem getValue(ProductQuantity obj) {
			return obj.getMeasureQuantityEnd();
		}

		@Override
		public void setValue(ProductQuantity obj, LineItem value) {
			obj.setMeasureQuantityEnd(value);
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
	public static final MMBusinessAssociationEnd<ProductQuantity, Tolerance> mmQuantityTolerance = new MMBusinessAssociationEnd<ProductQuantity, Tolerance>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ProductQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "QuantityTolerance";
			definition = "Variance allowed in the quantity of goods.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Tolerance.mmQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Tolerance.mmObject();
		}

		@Override
		public Tolerance getValue(ProductQuantity obj) {
			return obj.getQuantityTolerance();
		}

		@Override
		public void setValue(ProductQuantity obj, Tolerance value) {
			obj.setQuantityTolerance(value);
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
	public static final MMBusinessAssociationEnd<ProductQuantity, Optional<Packaging>> mmPackagingForConsignmentlQuantity = new MMBusinessAssociationEnd<ProductQuantity, Optional<Packaging>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ProductQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PackagingForConsignmentlQuantity";
			definition = "Packaging for which a total consignment quantity is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Packaging.mmTotalConsignmentQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Packaging.mmObject();
		}

		@Override
		public Optional<Packaging> getValue(ProductQuantity obj) {
			return obj.getPackagingForConsignmentlQuantity();
		}

		@Override
		public void setValue(ProductQuantity obj, Optional<Packaging> value) {
			obj.setPackagingForConsignmentlQuantity(value.orElse(null));
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
	public static final MMBusinessAssociationEnd<ProductQuantity, Optional<Packaging>> mmPackagingForVolume = new MMBusinessAssociationEnd<ProductQuantity, Optional<Packaging>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ProductQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PackagingForVolume";
			definition = "Packaging for which a volume is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Packaging.mmTotalVolume;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Packaging.mmObject();
		}

		@Override
		public Optional<Packaging> getValue(ProductQuantity obj) {
			return obj.getPackagingForVolume();
		}

		@Override
		public void setValue(ProductQuantity obj, Optional<Packaging> value) {
			obj.setPackagingForVolume(value.orElse(null));
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
	public static final MMBusinessAssociationEnd<ProductQuantity, Optional<Packaging>> mmPackagingForWeight = new MMBusinessAssociationEnd<ProductQuantity, Optional<Packaging>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ProductQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PackagingForWeight";
			definition = "Packaging for which a weight is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Packaging.mmTotalWeight;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Packaging.mmObject();
		}

		@Override
		public Optional<Packaging> getValue(ProductQuantity obj) {
			return obj.getPackagingForWeight();
		}

		@Override
		public void setValue(ProductQuantity obj, Optional<Packaging> value) {
			obj.setPackagingForWeight(value.orElse(null));
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
	public static final MMBusinessAssociationEnd<ProductQuantity, Optional<LineItem>> mmGrossPriceQuantityRelatedLineItem = new MMBusinessAssociationEnd<ProductQuantity, Optional<LineItem>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ProductQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GrossPriceQuantityRelatedLineItem";
			definition = "Line item for which gross price quantity is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> LineItem.mmGrossPriceQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> LineItem.mmObject();
		}

		@Override
		public Optional<LineItem> getValue(ProductQuantity obj) {
			return obj.getGrossPriceQuantityRelatedLineItem();
		}

		@Override
		public void setValue(ProductQuantity obj, Optional<LineItem> value) {
			obj.setGrossPriceQuantityRelatedLineItem(value.orElse(null));
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
	public static final MMBusinessAssociationEnd<ProductQuantity, Optional<LineItem>> mmNetPriceQuantityRelatedLineItem = new MMBusinessAssociationEnd<ProductQuantity, Optional<LineItem>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ProductQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NetPriceQuantityRelatedLineItem";
			definition = "Line item for which a net price quantity is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> LineItem.mmNetPriceQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> LineItem.mmObject();
		}

		@Override
		public Optional<LineItem> getValue(ProductQuantity obj) {
			return obj.getNetPriceQuantityRelatedLineItem();
		}

		@Override
		public void setValue(ProductQuantity obj, Optional<LineItem> value) {
			obj.setNetPriceQuantityRelatedLineItem(value.orElse(null));
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
	public static final MMBusinessAssociationEnd<ProductQuantity, Optional<LineItem>> mmGrossWeightRelatedLineItem = new MMBusinessAssociationEnd<ProductQuantity, Optional<LineItem>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ProductQuantity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GrossWeightRelatedLineItem";
			definition = "Line item for which a gross weight is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> LineItem.mmGrossWeight;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> LineItem.mmObject();
		}

		@Override
		public Optional<LineItem> getValue(ProductQuantity obj) {
			return obj.getGrossWeightRelatedLineItem();
		}

		@Override
		public void setValue(ProductQuantity obj, Optional<LineItem> value) {
			obj.setGrossWeightRelatedLineItem(value.orElse(null));
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ProductQuantity";
				definition = "Specifies the ordered quantity of a product.";
				associationDomain_lazy = () -> Arrays.asList(Product.mmQuantity, Tolerance.mmQuantity, LineItem.mmNetWeight, LineItem.mmBilledQuantity, LineItem.mmChargeFreeQuantity, LineItem.mmMeasureQuantityStartRelatedLineItem,
						LineItem.mmMeasureQuantityEndRelatedLineItem, LineItem.mmGrossPriceQuantity, LineItem.mmNetPriceQuantity, LineItem.mmGrossWeight, Packaging.mmQuantity, Packaging.mmPerPackageUnitQuantity,
						Packaging.mmTotalConsignmentQuantity, Packaging.mmTotalVolume, Packaging.mmTotalWeight);
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

	public ProductQuantity setProduct(List<Product> product) {
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

	public ProductQuantity setNetWeightRelatedLineItem(LineItem netWeightRelatedLineItem) {
		this.netWeightRelatedLineItem = netWeightRelatedLineItem;
		return this;
	}

	public Optional<LineItem> getBilledQuantityRelatedLineItem() {
		return billedQuantityRelatedLineItem == null ? Optional.empty() : Optional.of(billedQuantityRelatedLineItem);
	}

	public ProductQuantity setBilledQuantityRelatedLineItem(LineItem billedQuantityRelatedLineItem) {
		this.billedQuantityRelatedLineItem = billedQuantityRelatedLineItem;
		return this;
	}

	public Optional<Packaging> getRelatedPackaging() {
		return relatedPackaging == null ? Optional.empty() : Optional.of(relatedPackaging);
	}

	public ProductQuantity setRelatedPackaging(Packaging relatedPackaging) {
		this.relatedPackaging = relatedPackaging;
		return this;
	}

	public Optional<Packaging> getPackagingForUnitQuantity() {
		return packagingForUnitQuantity == null ? Optional.empty() : Optional.of(packagingForUnitQuantity);
	}

	public ProductQuantity setPackagingForUnitQuantity(Packaging packagingForUnitQuantity) {
		this.packagingForUnitQuantity = packagingForUnitQuantity;
		return this;
	}

	public Optional<LineItem> getChargeFreeQuantityRelatedLineItem() {
		return chargeFreeQuantityRelatedLineItem == null ? Optional.empty() : Optional.of(chargeFreeQuantityRelatedLineItem);
	}

	public ProductQuantity setChargeFreeQuantityRelatedLineItem(LineItem chargeFreeQuantityRelatedLineItem) {
		this.chargeFreeQuantityRelatedLineItem = chargeFreeQuantityRelatedLineItem;
		return this;
	}

	public LineItem getMeasureQuantityStart() {
		return measureQuantityStart;
	}

	public ProductQuantity setMeasureQuantityStart(LineItem measureQuantityStart) {
		this.measureQuantityStart = Objects.requireNonNull(measureQuantityStart);
		return this;
	}

	public LineItem getMeasureQuantityEnd() {
		return measureQuantityEnd;
	}

	public ProductQuantity setMeasureQuantityEnd(LineItem measureQuantityEnd) {
		this.measureQuantityEnd = Objects.requireNonNull(measureQuantityEnd);
		return this;
	}

	public Tolerance getQuantityTolerance() {
		return quantityTolerance;
	}

	public ProductQuantity setQuantityTolerance(Tolerance quantityTolerance) {
		this.quantityTolerance = Objects.requireNonNull(quantityTolerance);
		return this;
	}

	public Optional<Packaging> getPackagingForConsignmentlQuantity() {
		return packagingForConsignmentlQuantity == null ? Optional.empty() : Optional.of(packagingForConsignmentlQuantity);
	}

	public ProductQuantity setPackagingForConsignmentlQuantity(Packaging packagingForConsignmentlQuantity) {
		this.packagingForConsignmentlQuantity = packagingForConsignmentlQuantity;
		return this;
	}

	public Optional<Packaging> getPackagingForVolume() {
		return packagingForVolume == null ? Optional.empty() : Optional.of(packagingForVolume);
	}

	public ProductQuantity setPackagingForVolume(Packaging packagingForVolume) {
		this.packagingForVolume = packagingForVolume;
		return this;
	}

	public Optional<Packaging> getPackagingForWeight() {
		return packagingForWeight == null ? Optional.empty() : Optional.of(packagingForWeight);
	}

	public ProductQuantity setPackagingForWeight(Packaging packagingForWeight) {
		this.packagingForWeight = packagingForWeight;
		return this;
	}

	public Optional<LineItem> getGrossPriceQuantityRelatedLineItem() {
		return grossPriceQuantityRelatedLineItem == null ? Optional.empty() : Optional.of(grossPriceQuantityRelatedLineItem);
	}

	public ProductQuantity setGrossPriceQuantityRelatedLineItem(LineItem grossPriceQuantityRelatedLineItem) {
		this.grossPriceQuantityRelatedLineItem = grossPriceQuantityRelatedLineItem;
		return this;
	}

	public Optional<LineItem> getNetPriceQuantityRelatedLineItem() {
		return netPriceQuantityRelatedLineItem == null ? Optional.empty() : Optional.of(netPriceQuantityRelatedLineItem);
	}

	public ProductQuantity setNetPriceQuantityRelatedLineItem(LineItem netPriceQuantityRelatedLineItem) {
		this.netPriceQuantityRelatedLineItem = netPriceQuantityRelatedLineItem;
		return this;
	}

	public Optional<LineItem> getGrossWeightRelatedLineItem() {
		return grossWeightRelatedLineItem == null ? Optional.empty() : Optional.of(grossWeightRelatedLineItem);
	}

	public ProductQuantity setGrossWeightRelatedLineItem(LineItem grossWeightRelatedLineItem) {
		this.grossWeightRelatedLineItem = grossWeightRelatedLineItem;
		return this;
	}
}