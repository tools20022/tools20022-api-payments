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
import com.tools20022.repository.codeset.ProductCharacteristicsCode;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identifies the characteristic of a product.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="ProductCharacteristics"
 * src="doc-files/ProductCharacteristics.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductCharacteristics#mmProduct
 * ProductCharacteristics.mmProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductCharacteristics#mmCharacteristics
 * ProductCharacteristics.mmCharacteristics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductCharacteristics#mmType
 * ProductCharacteristics.mmType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Product#mmCharacteristics
 * Product.mmCharacteristics}</li>
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
 * "ProductCharacteristics"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies the characteristic of a product."</li>
 * </ul>
 */
public class ProductCharacteristics {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Product product;
	/**
	 * Specifies the product for which characteristics are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmCharacteristics
	 * Product.mmCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Product Product}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProductCharacteristics
	 * ProductCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Product"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the product for which characteristics are specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmProduct = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ProductCharacteristics.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Product";
			definition = "Specifies the product for which characteristics are specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Product.mmCharacteristics;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Product.mmObject();
		}
	};
	protected Max35Text characteristics;
	/**
	 * Specifies the characteristic of a product.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProductCharacteristics
	 * ProductCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Characteristics"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the characteristic of a product."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCharacteristics = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ProductCharacteristics.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Characteristics";
			definition = "Specifies the characteristic of a product.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ProductCharacteristics.class.getMethod("getCharacteristics", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ProductCharacteristicsCode type;
	/**
	 * Specifies the type of product characteristic by means of a code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristicsCode
	 * ProductCharacteristicsCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProductCharacteristics
	 * ProductCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of product characteristic by means of a code."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ProductCharacteristics.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Specifies the type of product characteristic by means of a code.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ProductCharacteristicsCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ProductCharacteristics.class.getMethod("getType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ProductCharacteristics";
				definition = "Identifies the characteristic of a product.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Product.mmCharacteristics);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ProductCharacteristics.mmProduct, com.tools20022.repository.entity.ProductCharacteristics.mmCharacteristics,
						com.tools20022.repository.entity.ProductCharacteristics.mmType);
			}

			@Override
			public Class<?> getInstanceClass() {
				return ProductCharacteristics.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(com.tools20022.repository.entity.Product product) {
		this.product = product;
	}

	public Max35Text getCharacteristics() {
		return characteristics;
	}

	public void setCharacteristics(Max35Text characteristics) {
		this.characteristics = characteristics;
	}

	public ProductCharacteristicsCode getType() {
		return type;
	}

	public void setType(ProductCharacteristicsCode type) {
		this.type = type;
	}
}