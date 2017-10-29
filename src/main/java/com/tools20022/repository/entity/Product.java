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
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.msg.Product2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Item that is offered for sale. Products can be services or goods.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Product" src="doc-files/Product.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Product#CardPayment
 * Product.CardPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#UnitPrice
 * Product.UnitPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#ProductCategory
 * Product.ProductCategory}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#LineItem
 * Product.LineItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Product#ProductIdentification
 * Product.ProductIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#Name Product.Name}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#Description
 * Product.Description}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#Origin
 * Product.Origin}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#Characteristics
 * Product.Characteristics}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#NetPrice
 * Product.NetPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#Quantity
 * Product.Quantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#GrossPrice
 * Product.GrossPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#Quality
 * Product.Quality}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#Delivery
 * Product.Delivery}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#PurchaseOrder
 * Product.PurchaseOrder}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#Tax Product.Tax}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Country#ProducedProducts
 * Country.ProducedProducts}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#Product Tax.Product}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CardPayment#Product
 * CardPayment.Product}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Price#UnitPriceProduct
 * Price.UnitPriceProduct}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Price#NetPriceProduct
 * Price.NetPriceProduct}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Price#GrossPriceProduct
 * Price.GrossPriceProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductIdentification#Product
 * ProductIdentification.Product}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ProductQuantity#Product
 * ProductQuantity.Product}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ProductCategory#Product
 * ProductCategory.Product}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LineItem#InvoicedProduct
 * LineItem.InvoicedProduct}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ProductDelivery#Product
 * ProductDelivery.Product}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductCharacteristics#Product
 * ProductCharacteristics.Product}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PurchaseOrder#Product
 * PurchaseOrder.Product}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Service Service}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Goods Goods}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Product2 Product2}</li>
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
 * "Product"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Item that is offered for sale. Products can be services or goods."</li>
 * </ul>
 */
public class Product {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Card payment for which a product was specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#Product
	 * CardPayment.Product}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CardPayment
	 * CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Product
	 * Product}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Card payment for which a product was specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CardPayment = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Product.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardPayment";
			definition = "Card payment for which a product was specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CardPayment.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CardPayment.Product;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Price per unit of product.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Price#UnitPriceProduct
	 * Price.UnitPriceProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Price Price}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Product2#UnitPrice
	 * Product2.UnitPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServicesAmount1#PricingAmount
	 * BillingServicesAmount1.PricingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServicesAmount2#PricingAmount
	 * BillingServicesAmount2.PricingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServiceParameters2#UnitPrice
	 * BillingServiceParameters2.UnitPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1#PriceChange
	 * BillingServiceAdjustment1.PriceChange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1#OriginalPrice
	 * BillingServiceAdjustment1.OriginalPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1#NewPrice
	 * BillingServiceAdjustment1.NewPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BillingService2#Price
	 * BillingService2.Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingService2#OriginalChargePrice
	 * BillingService2.OriginalChargePrice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Product
	 * Product}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price per unit of product."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd UnitPrice = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Product2.UnitPrice, com.tools20022.repository.msg.BillingServicesAmount1.PricingAmount, com.tools20022.repository.msg.BillingServicesAmount2.PricingAmount,
					com.tools20022.repository.msg.BillingServiceParameters2.UnitPrice, com.tools20022.repository.msg.BillingServiceAdjustment1.PriceChange, com.tools20022.repository.msg.BillingServiceAdjustment1.OriginalPrice,
					com.tools20022.repository.msg.BillingServiceAdjustment1.NewPrice, com.tools20022.repository.msg.BillingService2.Price, com.tools20022.repository.msg.BillingService2.OriginalChargePrice);
			elementContext_lazy = () -> Product.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnitPrice";
			definition = "Price per unit of product.";
			minOccurs = 0;
			type_lazy = () -> Price.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Price.UnitPriceProduct;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Category of the product.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductCategory#Product
	 * ProductCategory.Product}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ProductCategory
	 * ProductCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Product
	 * Product}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProductCategory"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Category of the product."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ProductCategory = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Product.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProductCategory";
			definition = "Category of the product.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.ProductCategory.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ProductCategory.Product;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the line item in which the product is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LineItem#InvoicedProduct
	 * LineItem.InvoicedProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.LineItem LineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Product
	 * Product}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LineItem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the line item in which the product is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd LineItem = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Product.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LineItem";
			definition = "Specifies the line item in which the product is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.LineItem.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.LineItem.InvoicedProduct;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Identification of the product.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductIdentification#Product
	 * ProductIdentification.Product}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.ProductIdentification
	 * ProductIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Product
	 * Product}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProductIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the product."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ProductIdentification = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Product.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProductIdentification";
			definition = "Identification of the product.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.ProductIdentification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ProductIdentification.Product;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Name of a product.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServiceIdentification3#Identification
	 * BillingServiceIdentification3.Identification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Product
	 * Product}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of a product."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Name = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BillingServiceIdentification3.Identification);
			elementContext_lazy = () -> Product.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Name";
			definition = "Name of a product.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Information about the goods and/or services of a trade transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Product
	 * Product}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Description"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information about the goods and/or services of a trade transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Description = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Product.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Description";
			definition = "Information about the goods and/or services of a trade transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	/**
	 * Country from which the product originates.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Country#ProducedProducts
	 * Country.ProducedProducts}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Country Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Product
	 * Product}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Origin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country from which the product originates."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Origin = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Product.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Origin";
			definition = "Country from which the product originates.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Country.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Country.ProducedProducts;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Characteristics of the product.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductCharacteristics#Product
	 * ProductCharacteristics.Product}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.ProductCharacteristics
	 * ProductCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Product
	 * Product}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Characteristics"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Characteristics of the product."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Characteristics = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Product.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Characteristics";
			definition = "Characteristics of the product.";
			minOccurs = 0;
			type_lazy = () -> ProductCharacteristics.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ProductCharacteristics.Product;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Net price of the goods and/or service.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Price#NetPriceProduct
	 * Price.NetPriceProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Price Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Product
	 * Product}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Net price of the goods and/or service."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd NetPrice = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Product.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetPrice";
			definition = "Net price of the goods and/or service.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Price.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Price.NetPriceProduct;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the quantity of the product.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity#Product
	 * ProductQuantity.Product}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ProductQuantity
	 * ProductQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Product
	 * Product}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the quantity of the product."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Quantity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Product.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Quantity";
			definition = "Specifies the quantity of the product.";
			minOccurs = 0;
			type_lazy = () -> ProductQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ProductQuantity.Product;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Gross price of the goods and/or service.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Price#GrossPriceProduct
	 * Price.GrossPriceProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Price Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Product
	 * Product}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Gross price of the goods and/or service."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd GrossPrice = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Product.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GrossPrice";
			definition = "Gross price of the goods and/or service.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Price.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Price.GrossPriceProduct;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Quality of the product.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Product
	 * Product}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quality"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quality of the product."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Quality = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Product.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Quality";
			definition = "Quality of the product.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	/**
	 * Delivery process of a product
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductDelivery#Product
	 * ProductDelivery.Product}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ProductDelivery
	 * ProductDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Product
	 * Product}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Delivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Delivery process of a product"</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Delivery = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Product.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Delivery";
			definition = "Delivery process of a product";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> ProductDelivery.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ProductDelivery.Product;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the purchase order in which a specific product is ordered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PurchaseOrder#Product
	 * PurchaseOrder.Product}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PurchaseOrder
	 * PurchaseOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Product
	 * Product}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PurchaseOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the purchase order in which a specific product is ordered."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PurchaseOrder = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Product.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PurchaseOrder";
			definition = "Specifies the purchase order in which a specific product is ordered.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.PurchaseOrder.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PurchaseOrder.Product;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Amount of money due to the government or tax authority, according to
	 * various pre-defined parameters linked to the value of the goods and
	 * services in a trade transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Tax#Product
	 * Tax.Product}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingService2#TaxCalculation
	 * BillingService2.TaxCalculation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Product
	 * Product}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money due to the government or tax authority, according to various pre-defined parameters linked to the value of the goods and services in a trade transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Tax = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BillingService2.TaxCalculation);
			elementContext_lazy = () -> Product.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Tax";
			definition = "Amount of money due to the government or tax authority, according to various pre-defined parameters linked to the value of the goods and services in a trade transaction.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Tax.Product;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Product";
				definition = "Item that is offered for sale. Products can be services or goods.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Country.ProducedProducts, com.tools20022.repository.entity.Tax.Product, com.tools20022.repository.entity.CardPayment.Product,
						com.tools20022.repository.entity.Price.UnitPriceProduct, com.tools20022.repository.entity.Price.NetPriceProduct, com.tools20022.repository.entity.Price.GrossPriceProduct,
						com.tools20022.repository.entity.ProductIdentification.Product, com.tools20022.repository.entity.ProductQuantity.Product, com.tools20022.repository.entity.ProductCategory.Product,
						com.tools20022.repository.entity.LineItem.InvoicedProduct, com.tools20022.repository.entity.ProductDelivery.Product, com.tools20022.repository.entity.ProductCharacteristics.Product,
						com.tools20022.repository.entity.PurchaseOrder.Product);
				subType_lazy = () -> Arrays.asList(Service.mmObject(), Goods.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Product.CardPayment, com.tools20022.repository.entity.Product.UnitPrice, com.tools20022.repository.entity.Product.ProductCategory,
						com.tools20022.repository.entity.Product.LineItem, com.tools20022.repository.entity.Product.ProductIdentification, com.tools20022.repository.entity.Product.Name, com.tools20022.repository.entity.Product.Description,
						com.tools20022.repository.entity.Product.Origin, com.tools20022.repository.entity.Product.Characteristics, com.tools20022.repository.entity.Product.NetPrice, com.tools20022.repository.entity.Product.Quantity,
						com.tools20022.repository.entity.Product.GrossPrice, com.tools20022.repository.entity.Product.Quality, com.tools20022.repository.entity.Product.Delivery, com.tools20022.repository.entity.Product.PurchaseOrder,
						com.tools20022.repository.entity.Product.Tax);
				derivationComponent_lazy = () -> Arrays.asList(Product2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}