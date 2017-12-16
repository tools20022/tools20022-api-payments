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
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * <li>{@linkplain com.tools20022.repository.entity.Product#mmCardPayment
 * Product.mmCardPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#mmUnitPrice
 * Product.mmUnitPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#mmProductCategory
 * Product.mmProductCategory}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#mmLineItem
 * Product.mmLineItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Product#mmProductIdentification
 * Product.mmProductIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#mmName
 * Product.mmName}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#mmDescription
 * Product.mmDescription}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#mmOrigin
 * Product.mmOrigin}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#mmCharacteristics
 * Product.mmCharacteristics}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#mmNetPrice
 * Product.mmNetPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#mmQuantity
 * Product.mmQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#mmGrossPrice
 * Product.mmGrossPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#mmQuality
 * Product.mmQuality}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#mmDelivery
 * Product.mmDelivery}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#mmPurchaseOrder
 * Product.mmPurchaseOrder}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#mmTax Product.mmTax}
 * </li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Country#mmProducedProducts
 * Country.mmProducedProducts}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmProduct Tax.mmProduct}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.CardPayment#mmProduct
 * CardPayment.mmProduct}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Price#mmUnitPriceProduct
 * Price.mmUnitPriceProduct}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Price#mmNetPriceProduct
 * Price.mmNetPriceProduct}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Price#mmGrossPriceProduct
 * Price.mmGrossPriceProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductIdentification#mmProduct
 * ProductIdentification.mmProduct}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ProductQuantity#mmProduct
 * ProductQuantity.mmProduct}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ProductCategory#mmProduct
 * ProductCategory.mmProduct}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LineItem#mmInvoicedProduct
 * LineItem.mmInvoicedProduct}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ProductDelivery#mmProduct
 * ProductDelivery.mmProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductCharacteristics#mmProduct
 * ProductCharacteristics.mmProduct}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PurchaseOrder#mmProduct
 * PurchaseOrder.mmProduct}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	protected CardPayment cardPayment;
	/**
	 * Card payment for which a product was specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#mmProduct
	 * CardPayment.mmProduct}</li>
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
	public static final MMBusinessAssociationEnd mmCardPayment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Product.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardPayment";
			definition = "Card payment for which a product was specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CardPayment.mmProduct;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CardPayment.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Price> unitPrice;
	/**
	 * Price per unit of product.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Price#mmUnitPriceProduct
	 * Price.mmUnitPriceProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Price Price}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Product2#mmUnitPrice
	 * Product2.mmUnitPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServicesAmount1#mmPricingAmount
	 * BillingServicesAmount1.mmPricingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServicesAmount2#mmPricingAmount
	 * BillingServicesAmount2.mmPricingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServiceParameters2#mmUnitPrice
	 * BillingServiceParameters2.mmUnitPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1#mmPriceChange
	 * BillingServiceAdjustment1.mmPriceChange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1#mmOriginalPrice
	 * BillingServiceAdjustment1.mmOriginalPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1#mmNewPrice
	 * BillingServiceAdjustment1.mmNewPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BillingService2#mmPrice
	 * BillingService2.mmPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingService2#mmOriginalChargePrice
	 * BillingService2.mmOriginalChargePrice}</li>
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
	public static final MMBusinessAssociationEnd mmUnitPrice = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(Product2.mmUnitPrice, BillingServicesAmount1.mmPricingAmount, BillingServicesAmount2.mmPricingAmount, BillingServiceParameters2.mmUnitPrice, BillingServiceAdjustment1.mmPriceChange,
					BillingServiceAdjustment1.mmOriginalPrice, BillingServiceAdjustment1.mmNewPrice, BillingService2.mmPrice, BillingService2.mmOriginalChargePrice);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Product.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnitPrice";
			definition = "Price per unit of product.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Price.mmUnitPriceProduct;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Price.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.ProductCategory> productCategory;
	/**
	 * Category of the product.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductCategory#mmProduct
	 * ProductCategory.mmProduct}</li>
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
	public static final MMBusinessAssociationEnd mmProductCategory = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Product.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProductCategory";
			definition = "Category of the product.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ProductCategory.mmProduct;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ProductCategory.mmObject();
		}
	};
	protected LineItem lineItem;
	/**
	 * Specifies the line item in which the product is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LineItem#mmInvoicedProduct
	 * LineItem.mmInvoicedProduct}</li>
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
	public static final MMBusinessAssociationEnd mmLineItem = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Product.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LineItem";
			definition = "Specifies the line item in which the product is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.LineItem.mmInvoicedProduct;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.LineItem.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.ProductIdentification> productIdentification;
	/**
	 * Identification of the product.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductIdentification#mmProduct
	 * ProductIdentification.mmProduct}</li>
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
	public static final MMBusinessAssociationEnd mmProductIdentification = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Product.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProductIdentification";
			definition = "Identification of the product.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ProductIdentification.mmProduct;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ProductIdentification.mmObject();
		}
	};
	protected Max35Text name;
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
	 * {@linkplain com.tools20022.repository.msg.BillingServiceIdentification3#mmIdentification
	 * BillingServiceIdentification3.mmIdentification}</li>
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
	public static final MMBusinessAttribute mmName = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(BillingServiceIdentification3.mmIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Product.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Name";
			definition = "Name of a product.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Product.class.getMethod("getName", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max140Text description;
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
	public static final MMBusinessAttribute mmDescription = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Product.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Description";
			definition = "Information about the goods and/or services of a trade transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Product.class.getMethod("getDescription", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Country origin;
	/**
	 * Country from which the product originates.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Country#mmProducedProducts
	 * Country.mmProducedProducts}</li>
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
	public static final MMBusinessAssociationEnd mmOrigin = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Product.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Origin";
			definition = "Country from which the product originates.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Country.mmProducedProducts;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Country.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.ProductCharacteristics> characteristics;
	/**
	 * Characteristics of the product.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductCharacteristics#mmProduct
	 * ProductCharacteristics.mmProduct}</li>
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
	public static final MMBusinessAssociationEnd mmCharacteristics = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Product.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Characteristics";
			definition = "Characteristics of the product.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ProductCharacteristics.mmProduct;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ProductCharacteristics.mmObject();
		}
	};
	protected Price netPrice;
	/**
	 * Net price of the goods and/or service.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Price#mmNetPriceProduct
	 * Price.mmNetPriceProduct}</li>
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
	public static final MMBusinessAssociationEnd mmNetPrice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Product.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NetPrice";
			definition = "Net price of the goods and/or service.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Price.mmNetPriceProduct;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Price.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.ProductQuantity> quantity;
	/**
	 * Specifies the quantity of the product.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmProduct
	 * ProductQuantity.mmProduct}</li>
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
	public static final MMBusinessAssociationEnd mmQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Product.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Quantity";
			definition = "Specifies the quantity of the product.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ProductQuantity.mmProduct;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ProductQuantity.mmObject();
		}
	};
	protected Price grossPrice;
	/**
	 * Gross price of the goods and/or service.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Price#mmGrossPriceProduct
	 * Price.mmGrossPriceProduct}</li>
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
	public static final MMBusinessAssociationEnd mmGrossPrice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Product.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GrossPrice";
			definition = "Gross price of the goods and/or service.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Price.mmGrossPriceProduct;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Price.mmObject();
		}
	};
	protected Max70Text quality;
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
	public static final MMBusinessAttribute mmQuality = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Product.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Quality";
			definition = "Quality of the product.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Product.class.getMethod("getQuality", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ProductDelivery delivery;
	/**
	 * Delivery process of a product
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductDelivery#mmProduct
	 * ProductDelivery.mmProduct}</li>
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
	public static final MMBusinessAssociationEnd mmDelivery = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Product.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Delivery";
			definition = "Delivery process of a product";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ProductDelivery.mmProduct;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ProductDelivery.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.PurchaseOrder> purchaseOrder;
	/**
	 * Specifies the purchase order in which a specific product is ordered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PurchaseOrder#mmProduct
	 * PurchaseOrder.mmProduct}</li>
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
	public static final MMBusinessAssociationEnd mmPurchaseOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Product.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PurchaseOrder";
			definition = "Specifies the purchase order in which a specific product is ordered.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PurchaseOrder.mmProduct;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PurchaseOrder.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Tax> tax;
	/**
	 * Amount of money due to the government or tax authority, according to
	 * various pre-defined parameters linked to the value of the goods and
	 * services in a trade transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Tax#mmProduct
	 * Tax.mmProduct}</li>
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
	 * {@linkplain com.tools20022.repository.msg.BillingService2#mmTaxCalculation
	 * BillingService2.mmTaxCalculation}</li>
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
	public static final MMBusinessAssociationEnd mmTax = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(BillingService2.mmTaxCalculation);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Product.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Tax";
			definition = "Amount of money due to the government or tax authority, according to various pre-defined parameters linked to the value of the goods and services in a trade transaction.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Tax.mmProduct;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Product";
				definition = "Item that is offered for sale. Products can be services or goods.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Country.mmProducedProducts, com.tools20022.repository.entity.Tax.mmProduct, com.tools20022.repository.entity.CardPayment.mmProduct,
						com.tools20022.repository.entity.Price.mmUnitPriceProduct, com.tools20022.repository.entity.Price.mmNetPriceProduct, com.tools20022.repository.entity.Price.mmGrossPriceProduct,
						com.tools20022.repository.entity.ProductIdentification.mmProduct, com.tools20022.repository.entity.ProductQuantity.mmProduct, com.tools20022.repository.entity.ProductCategory.mmProduct,
						com.tools20022.repository.entity.LineItem.mmInvoicedProduct, com.tools20022.repository.entity.ProductDelivery.mmProduct, com.tools20022.repository.entity.ProductCharacteristics.mmProduct,
						com.tools20022.repository.entity.PurchaseOrder.mmProduct);
				subType_lazy = () -> Arrays.asList(Service.mmObject(), Goods.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Product.mmCardPayment, com.tools20022.repository.entity.Product.mmUnitPrice, com.tools20022.repository.entity.Product.mmProductCategory,
						com.tools20022.repository.entity.Product.mmLineItem, com.tools20022.repository.entity.Product.mmProductIdentification, com.tools20022.repository.entity.Product.mmName,
						com.tools20022.repository.entity.Product.mmDescription, com.tools20022.repository.entity.Product.mmOrigin, com.tools20022.repository.entity.Product.mmCharacteristics,
						com.tools20022.repository.entity.Product.mmNetPrice, com.tools20022.repository.entity.Product.mmQuantity, com.tools20022.repository.entity.Product.mmGrossPrice, com.tools20022.repository.entity.Product.mmQuality,
						com.tools20022.repository.entity.Product.mmDelivery, com.tools20022.repository.entity.Product.mmPurchaseOrder, com.tools20022.repository.entity.Product.mmTax);
				derivationComponent_lazy = () -> Arrays.asList(Product2.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Product.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CardPayment getCardPayment() {
		return cardPayment;
	}

	public void setCardPayment(com.tools20022.repository.entity.CardPayment cardPayment) {
		this.cardPayment = cardPayment;
	}

	public List<Price> getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(List<com.tools20022.repository.entity.Price> unitPrice) {
		this.unitPrice = unitPrice;
	}

	public List<ProductCategory> getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(List<com.tools20022.repository.entity.ProductCategory> productCategory) {
		this.productCategory = productCategory;
	}

	public LineItem getLineItem() {
		return lineItem;
	}

	public void setLineItem(com.tools20022.repository.entity.LineItem lineItem) {
		this.lineItem = lineItem;
	}

	public List<ProductIdentification> getProductIdentification() {
		return productIdentification;
	}

	public void setProductIdentification(List<com.tools20022.repository.entity.ProductIdentification> productIdentification) {
		this.productIdentification = productIdentification;
	}

	public Max35Text getName() {
		return name;
	}

	public void setName(Max35Text name) {
		this.name = name;
	}

	public Max140Text getDescription() {
		return description;
	}

	public void setDescription(Max140Text description) {
		this.description = description;
	}

	public Country getOrigin() {
		return origin;
	}

	public void setOrigin(com.tools20022.repository.entity.Country origin) {
		this.origin = origin;
	}

	public List<ProductCharacteristics> getCharacteristics() {
		return characteristics;
	}

	public void setCharacteristics(List<com.tools20022.repository.entity.ProductCharacteristics> characteristics) {
		this.characteristics = characteristics;
	}

	public Price getNetPrice() {
		return netPrice;
	}

	public void setNetPrice(com.tools20022.repository.entity.Price netPrice) {
		this.netPrice = netPrice;
	}

	public List<ProductQuantity> getQuantity() {
		return quantity;
	}

	public void setQuantity(List<com.tools20022.repository.entity.ProductQuantity> quantity) {
		this.quantity = quantity;
	}

	public Price getGrossPrice() {
		return grossPrice;
	}

	public void setGrossPrice(com.tools20022.repository.entity.Price grossPrice) {
		this.grossPrice = grossPrice;
	}

	public Max70Text getQuality() {
		return quality;
	}

	public void setQuality(Max70Text quality) {
		this.quality = quality;
	}

	public ProductDelivery getDelivery() {
		return delivery;
	}

	public void setDelivery(com.tools20022.repository.entity.ProductDelivery delivery) {
		this.delivery = delivery;
	}

	public List<PurchaseOrder> getPurchaseOrder() {
		return purchaseOrder;
	}

	public void setPurchaseOrder(List<com.tools20022.repository.entity.PurchaseOrder> purchaseOrder) {
		this.purchaseOrder = purchaseOrder;
	}

	public List<Tax> getTax() {
		return tax;
	}

	public void setTax(List<com.tools20022.repository.entity.Tax> tax) {
		this.tax = tax;
	}
}