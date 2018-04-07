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
import com.tools20022.repository.codeset.ProductCategoryCode;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.CardPaymentValidation;
import com.tools20022.repository.entity.Product;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Specifies the category of the product.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="ProductCategory" src="doc-files/ProductCategory.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.ProductCategory#mmProduct
 * ProductCategory.mmProduct}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ProductCategory#mmType
 * ProductCategory.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ProductCategory#mmCategory
 * ProductCategory.mmCategory}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductCategory#mmRelatedCardPaymentValidation
 * ProductCategory.mmRelatedCardPaymentValidation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Product#mmProductCategory
 * Product.mmProductCategory}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#mmDeclinedProductCode
 * CardPaymentValidation.mmDeclinedProductCode}</li>
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
 * "ProductCategory"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the category of the product."</li>
 * </ul>
 */
public class ProductCategory {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Product product;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmProductCategory
	 * Product.mmProductCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Product Product}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProductCategory
	 * ProductCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Product"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the product for which a category is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<ProductCategory, Optional<Product>> mmProduct = new MMBusinessAssociationEnd<ProductCategory, Optional<Product>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ProductCategory.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Product";
			definition = "Specifies the product for which a category is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Product.mmProductCategory;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Product.mmObject();
		}

		@Override
		public Optional<Product> getValue(ProductCategory obj) {
			return obj.getProduct();
		}

		@Override
		public void setValue(ProductCategory obj, Optional<Product> value) {
			obj.setProduct(value.orElse(null));
		}
	};
	protected ProductCategoryCode type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ProductCategoryCode
	 * ProductCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProductCategory
	 * ProductCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of product category by means of a code."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<ProductCategory, ProductCategoryCode> mmType = new MMBusinessAttribute<ProductCategory, ProductCategoryCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ProductCategory.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Specifies the type of product category by means of a code.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ProductCategoryCode.mmObject();
		}

		@Override
		public ProductCategoryCode getValue(ProductCategory obj) {
			return obj.getType();
		}

		@Override
		public void setValue(ProductCategory obj, ProductCategoryCode value) {
			obj.setType(value);
		}
	};
	protected Max35Text category;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProductCategory
	 * ProductCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Category"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the category of a product."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<ProductCategory, Max35Text> mmCategory = new MMBusinessAttribute<ProductCategory, Max35Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ProductCategory.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Category";
			definition = "Specifies the category of a product.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(ProductCategory obj) {
			return obj.getCategory();
		}

		@Override
		public void setValue(ProductCategory obj, Max35Text value) {
			obj.setCategory(value);
		}
	};
	protected CardPaymentValidation relatedCardPaymentValidation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#mmDeclinedProductCode
	 * CardPaymentValidation.mmDeclinedProductCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation
	 * CardPaymentValidation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProductCategory
	 * ProductCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCardPaymentValidation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Validation process which declined a product code."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<ProductCategory, Optional<CardPaymentValidation>> mmRelatedCardPaymentValidation = new MMBusinessAssociationEnd<ProductCategory, Optional<CardPaymentValidation>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ProductCategory.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedCardPaymentValidation";
			definition = "Validation process which declined a product code.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> CardPaymentValidation.mmDeclinedProductCode;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CardPaymentValidation.mmObject();
		}

		@Override
		public Optional<CardPaymentValidation> getValue(ProductCategory obj) {
			return obj.getRelatedCardPaymentValidation();
		}

		@Override
		public void setValue(ProductCategory obj, Optional<CardPaymentValidation> value) {
			obj.setRelatedCardPaymentValidation(value.orElse(null));
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ProductCategory";
				definition = "Specifies the category of the product.";
				associationDomain_lazy = () -> Arrays.asList(Product.mmProductCategory, CardPaymentValidation.mmDeclinedProductCode);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ProductCategory.mmProduct, com.tools20022.repository.entity.ProductCategory.mmType, com.tools20022.repository.entity.ProductCategory.mmCategory,
						com.tools20022.repository.entity.ProductCategory.mmRelatedCardPaymentValidation);
			}

			@Override
			public Class<?> getInstanceClass() {
				return ProductCategory.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Product> getProduct() {
		return product == null ? Optional.empty() : Optional.of(product);
	}

	public ProductCategory setProduct(Product product) {
		this.product = product;
		return this;
	}

	public ProductCategoryCode getType() {
		return type;
	}

	public ProductCategory setType(ProductCategoryCode type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public Max35Text getCategory() {
		return category;
	}

	public ProductCategory setCategory(Max35Text category) {
		this.category = Objects.requireNonNull(category);
		return this;
	}

	public Optional<CardPaymentValidation> getRelatedCardPaymentValidation() {
		return relatedCardPaymentValidation == null ? Optional.empty() : Optional.of(relatedCardPaymentValidation);
	}

	public ProductCategory setRelatedCardPaymentValidation(CardPaymentValidation relatedCardPaymentValidation) {
		this.relatedCardPaymentValidation = relatedCardPaymentValidation;
		return this;
	}
}