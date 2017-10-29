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

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.UnitOfMeasureCode;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.Max15NumericText;
import java.util.Arrays;
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
 * {@linkplain com.tools20022.repository.entity.ProductQuantity#UnitOfMeasure
 * ProductQuantity.UnitOfMeasure}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ProductQuantity#Value
 * ProductQuantity.Value}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ProductQuantity#Product
 * ProductQuantity.Product}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ProductQuantity#Factor
 * ProductQuantity.Factor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductQuantity#NetWeightRelatedLineItem
 * ProductQuantity.NetWeightRelatedLineItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductQuantity#BilledQuantityRelatedLineItem
 * ProductQuantity.BilledQuantityRelatedLineItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductQuantity#RelatedPackaging
 * ProductQuantity.RelatedPackaging}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductQuantity#PackagingForUnitQuantity
 * ProductQuantity.PackagingForUnitQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductQuantity#ChargeFreeQuantityRelatedLineItem
 * ProductQuantity.ChargeFreeQuantityRelatedLineItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductQuantity#MeasureQuantityStart
 * ProductQuantity.MeasureQuantityStart}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductQuantity#MeasureQuantityEnd
 * ProductQuantity.MeasureQuantityEnd}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductQuantity#QuantityTolerance
 * ProductQuantity.QuantityTolerance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductQuantity#PackagingForConsignmentlQuantity
 * ProductQuantity.PackagingForConsignmentlQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductQuantity#PackagingForVolume
 * ProductQuantity.PackagingForVolume}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductQuantity#PackagingForWeight
 * ProductQuantity.PackagingForWeight}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductQuantity#GrossPriceQuantityRelatedLineItem
 * ProductQuantity.GrossPriceQuantityRelatedLineItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductQuantity#NetPriceQuantityRelatedLineItem
 * ProductQuantity.NetPriceQuantityRelatedLineItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductQuantity#GrossWeightRelatedLineItem
 * ProductQuantity.GrossWeightRelatedLineItem}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Product#Quantity
 * Product.Quantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tolerance#Quantity
 * Tolerance.Quantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LineItem#NetWeight
 * LineItem.NetWeight}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LineItem#BilledQuantity
 * LineItem.BilledQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LineItem#ChargeFreeQuantity
 * LineItem.ChargeFreeQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.LineItem#MeasureQuantityStartRelatedLineItem
 * LineItem.MeasureQuantityStartRelatedLineItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.LineItem#MeasureQuantityEndRelatedLineItem
 * LineItem.MeasureQuantityEndRelatedLineItem}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LineItem#GrossPriceQuantity
 * LineItem.GrossPriceQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LineItem#NetPriceQuantity
 * LineItem.NetPriceQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LineItem#GrossWeight
 * LineItem.GrossWeight}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Packaging#Quantity
 * Packaging.Quantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Packaging#PerPackageUnitQuantity
 * Packaging.PerPackageUnitQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Packaging#TotalConsignmentQuantity
 * Packaging.TotalConsignmentQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Packaging#TotalVolume
 * Packaging.TotalVolume}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Packaging#TotalWeight
 * Packaging.TotalWeight}</li>
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
	/**
	 * Specifies the unit of measurement. For example, kilo, tons.
	 * <p>
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
	 * <li>{@linkplain com.tools20022.repository.msg.Product2#UnitOfMeasure
	 * Product2.UnitOfMeasure}</li>
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
	public static final MMBusinessAttribute UnitOfMeasure = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Product2.UnitOfMeasure);
			elementContext_lazy = () -> ProductQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnitOfMeasure";
			definition = "Specifies the unit of measurement. For example, kilo, tons.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> UnitOfMeasureCode.mmObject();
		}
	};
	/**
	 * Quantity of a product on a line specified by a number. For example, 100
	 * (kgs), 50 (pieces).
	 * <p>
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
	 * <li>{@linkplain com.tools20022.repository.msg.Product2#ProductQuantity
	 * Product2.ProductQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServiceParameters2#Volume
	 * BillingServiceParameters2.Volume}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1#VolumeChange
	 * BillingServiceAdjustment1.VolumeChange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1#OriginalVolume
	 * BillingServiceAdjustment1.OriginalVolume}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1#NewVolume
	 * BillingServiceAdjustment1.NewVolume}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServiceParameters3#Volume
	 * BillingServiceParameters3.Volume}</li>
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
	public static final MMBusinessAttribute Value = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Product2.ProductQuantity, com.tools20022.repository.msg.BillingServiceParameters2.Volume, com.tools20022.repository.msg.BillingServiceAdjustment1.VolumeChange,
					com.tools20022.repository.msg.BillingServiceAdjustment1.OriginalVolume, com.tools20022.repository.msg.BillingServiceAdjustment1.NewVolume, com.tools20022.repository.msg.BillingServiceParameters3.Volume);
			elementContext_lazy = () -> ProductQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Value";
			definition = "Quantity of a product on a line specified by a number. For example, 100 (kgs), 50 (pieces).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	/**
	 * Specifies the type of goods and services linked to the quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Product#Quantity
	 * Product.Quantity}</li>
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
	public static final MMBusinessAssociationEnd Product = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ProductQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Product";
			definition = "Specifies the type of goods and services linked to the quantity.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Product.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Product.Quantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Multiplication factor of measurement values. For example: goods that can
	 * be ordered by 36 pieces.
	 * <p>
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
	public static final MMBusinessAttribute Factor = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> ProductQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Factor";
			definition = "Multiplication factor of measurement values. For example: goods that can be ordered by 36 pieces.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}
	};
	/**
	 * Line item for which a net weight is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LineItem#NetWeight
	 * LineItem.NetWeight}</li>
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
	public static final MMBusinessAssociationEnd NetWeightRelatedLineItem = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ProductQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetWeightRelatedLineItem";
			definition = "Line item for which a net weight is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> LineItem.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.LineItem.NetWeight;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Line item which contains this quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LineItem#BilledQuantity
	 * LineItem.BilledQuantity}</li>
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
	public static final MMBusinessAssociationEnd BilledQuantityRelatedLineItem = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ProductQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BilledQuantityRelatedLineItem";
			definition = "Line item which contains this quantity.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> LineItem.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.LineItem.BilledQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Packaging for which a quantity is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Packaging#Quantity
	 * Packaging.Quantity}</li>
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
	public static final MMBusinessAssociationEnd RelatedPackaging = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ProductQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPackaging";
			definition = "Packaging for which a quantity is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Packaging.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Packaging.Quantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Packaging for which a unit quantity per package is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Packaging#PerPackageUnitQuantity
	 * Packaging.PerPackageUnitQuantity}</li>
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
	public static final MMBusinessAssociationEnd PackagingForUnitQuantity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ProductQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PackagingForUnitQuantity";
			definition = "Packaging for which a unit quantity per package is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Packaging.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Packaging.PerPackageUnitQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Line item for which a charge free quantity of product is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LineItem#ChargeFreeQuantity
	 * LineItem.ChargeFreeQuantity}</li>
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
	public static final MMBusinessAssociationEnd ChargeFreeQuantityRelatedLineItem = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ProductQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ChargeFreeQuantityRelatedLineItem";
			definition = "Line item for which a charge free quantity of product is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> LineItem.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.LineItem.ChargeFreeQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Quantity value on which the quantity measurement started for a line item.
	 * For instance the start amount of a meter reading for an electricity
	 * supplier.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LineItem#MeasureQuantityStartRelatedLineItem
	 * LineItem.MeasureQuantityStartRelatedLineItem}</li>
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
	public static final MMBusinessAssociationEnd MeasureQuantityStart = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ProductQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MeasureQuantityStart";
			definition = "Quantity value on which the quantity measurement started for a line item. For instance the start amount of a meter reading for an electricity supplier.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> LineItem.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.LineItem.MeasureQuantityStartRelatedLineItem;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Quantity value on which the quantity measurement ended for a line item.
	 * For instance the end amount of a meter reading for an electricity
	 * supplier.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LineItem#MeasureQuantityEndRelatedLineItem
	 * LineItem.MeasureQuantityEndRelatedLineItem}</li>
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
	public static final MMBusinessAssociationEnd MeasureQuantityEnd = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ProductQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MeasureQuantityEnd";
			definition = "Quantity value on which the quantity measurement ended for a line item. For instance the end amount of a meter reading for an electricity supplier.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> LineItem.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.LineItem.MeasureQuantityEndRelatedLineItem;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Variance allowed in the quantity of goods.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Tolerance#Quantity
	 * Tolerance.Quantity}</li>
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
	public static final MMBusinessAssociationEnd QuantityTolerance = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ProductQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "QuantityTolerance";
			definition = "Variance allowed in the quantity of goods.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Tolerance.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Tolerance.Quantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Packaging for which a total consignment quantity is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Packaging#TotalConsignmentQuantity
	 * Packaging.TotalConsignmentQuantity}</li>
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
	public static final MMBusinessAssociationEnd PackagingForConsignmentlQuantity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ProductQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PackagingForConsignmentlQuantity";
			definition = "Packaging for which a total consignment quantity is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Packaging.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Packaging.TotalConsignmentQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Packaging for which a volume is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Packaging#TotalVolume
	 * Packaging.TotalVolume}</li>
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
	public static final MMBusinessAssociationEnd PackagingForVolume = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ProductQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PackagingForVolume";
			definition = "Packaging for which a volume is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Packaging.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Packaging.TotalVolume;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Packaging for which a weight is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Packaging#TotalWeight
	 * Packaging.TotalWeight}</li>
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
	public static final MMBusinessAssociationEnd PackagingForWeight = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ProductQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PackagingForWeight";
			definition = "Packaging for which a weight is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Packaging.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Packaging.TotalWeight;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Line item for which gross price quantity is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LineItem#GrossPriceQuantity
	 * LineItem.GrossPriceQuantity}</li>
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
	public static final MMBusinessAssociationEnd GrossPriceQuantityRelatedLineItem = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ProductQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GrossPriceQuantityRelatedLineItem";
			definition = "Line item for which gross price quantity is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> LineItem.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.LineItem.GrossPriceQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Line item for which a net price quantity is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LineItem#NetPriceQuantity
	 * LineItem.NetPriceQuantity}</li>
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
	public static final MMBusinessAssociationEnd NetPriceQuantityRelatedLineItem = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ProductQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetPriceQuantityRelatedLineItem";
			definition = "Line item for which a net price quantity is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> LineItem.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.LineItem.NetPriceQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Line item for which a gross weight is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LineItem#GrossWeight
	 * LineItem.GrossWeight}</li>
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
	public static final MMBusinessAssociationEnd GrossWeightRelatedLineItem = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ProductQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GrossWeightRelatedLineItem";
			definition = "Line item for which a gross weight is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> LineItem.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.LineItem.GrossWeight;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ProductQuantity";
				definition = "Specifies the ordered quantity of a product.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Product.Quantity, com.tools20022.repository.entity.Tolerance.Quantity, com.tools20022.repository.entity.LineItem.NetWeight,
						com.tools20022.repository.entity.LineItem.BilledQuantity, com.tools20022.repository.entity.LineItem.ChargeFreeQuantity, com.tools20022.repository.entity.LineItem.MeasureQuantityStartRelatedLineItem,
						com.tools20022.repository.entity.LineItem.MeasureQuantityEndRelatedLineItem, com.tools20022.repository.entity.LineItem.GrossPriceQuantity, com.tools20022.repository.entity.LineItem.NetPriceQuantity,
						com.tools20022.repository.entity.LineItem.GrossWeight, com.tools20022.repository.entity.Packaging.Quantity, com.tools20022.repository.entity.Packaging.PerPackageUnitQuantity,
						com.tools20022.repository.entity.Packaging.TotalConsignmentQuantity, com.tools20022.repository.entity.Packaging.TotalVolume, com.tools20022.repository.entity.Packaging.TotalWeight);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ProductQuantity.UnitOfMeasure, com.tools20022.repository.entity.ProductQuantity.Value, com.tools20022.repository.entity.ProductQuantity.Product,
						com.tools20022.repository.entity.ProductQuantity.Factor, com.tools20022.repository.entity.ProductQuantity.NetWeightRelatedLineItem, com.tools20022.repository.entity.ProductQuantity.BilledQuantityRelatedLineItem,
						com.tools20022.repository.entity.ProductQuantity.RelatedPackaging, com.tools20022.repository.entity.ProductQuantity.PackagingForUnitQuantity,
						com.tools20022.repository.entity.ProductQuantity.ChargeFreeQuantityRelatedLineItem, com.tools20022.repository.entity.ProductQuantity.MeasureQuantityStart,
						com.tools20022.repository.entity.ProductQuantity.MeasureQuantityEnd, com.tools20022.repository.entity.ProductQuantity.QuantityTolerance,
						com.tools20022.repository.entity.ProductQuantity.PackagingForConsignmentlQuantity, com.tools20022.repository.entity.ProductQuantity.PackagingForVolume,
						com.tools20022.repository.entity.ProductQuantity.PackagingForWeight, com.tools20022.repository.entity.ProductQuantity.GrossPriceQuantityRelatedLineItem,
						com.tools20022.repository.entity.ProductQuantity.NetPriceQuantityRelatedLineItem, com.tools20022.repository.entity.ProductQuantity.GrossWeightRelatedLineItem);
			}
		});
		return mmObject_lazy.get();
	}
}