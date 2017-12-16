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

import com.tools20022.metamodel.MMAggregation;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.Obligation;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Obligation for the seller to deliver goods or services to the buyer.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="ProductDeliveryObligation"
 * src="doc-files/ProductDeliveryObligation.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Obligation
 * Obligation}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductDeliveryObligation#mmProductDeliveryOffset
 * ProductDeliveryObligation.mmProductDeliveryOffset}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductDeliveryObligation#mmCommercialTrade
 * ProductDeliveryObligation.mmCommercialTrade}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommercialTrade#mmProductDeliveryObligation
 * CommercialTrade.mmProductDeliveryObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductDelivery#mmObligation
 * ProductDelivery.mmObligation}</li>
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
 * "ProductDeliveryObligation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Obligation for the seller  to deliver goods or services to the buyer."</li>
 * </ul>
 */
public class ProductDeliveryObligation extends Obligation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.ProductDelivery> productDeliveryOffset;
	/**
	 * Fulfilment of a product delivery obligation through the delivery of goods
	 * and services. It is derived from the association between Obligation and
	 * Obligation fulfillment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductDelivery#mmObligation
	 * ProductDelivery.mmObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ProductDelivery
	 * ProductDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProductDeliveryObligation
	 * ProductDeliveryObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProductDeliveryOffset"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Fulfilment of a product delivery obligation through the delivery of goods and services. It is derived from the association between Obligation and Obligation fulfillment."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmProductDeliveryOffset = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ProductDeliveryObligation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProductDeliveryOffset";
			definition = "Fulfilment of a product delivery obligation through the delivery of goods and services. It is derived from the association between Obligation and Obligation fulfillment.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ProductDelivery.mmObligation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ProductDelivery.mmObject();
		}
	};
	protected CommercialTrade commercialTrade;
	/**
	 * Specifies the trade which originates the obligation to deliver a specific
	 * product.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTrade#mmProductDeliveryObligation
	 * CommercialTrade.mmProductDeliveryObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CommercialTrade
	 * CommercialTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProductDeliveryObligation
	 * ProductDeliveryObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommercialTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the trade which originates the obligation to deliver a specific product."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCommercialTrade = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ProductDeliveryObligation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CommercialTrade";
			definition = "Specifies the trade which originates the obligation to deliver a specific product.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CommercialTrade.mmProductDeliveryObligation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CommercialTrade.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ProductDeliveryObligation";
				definition = "Obligation for the seller  to deliver goods or services to the buyer.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CommercialTrade.mmProductDeliveryObligation, com.tools20022.repository.entity.ProductDelivery.mmObligation);
				superType_lazy = () -> Obligation.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ProductDeliveryObligation.mmProductDeliveryOffset, com.tools20022.repository.entity.ProductDeliveryObligation.mmCommercialTrade);
			}

			@Override
			public Class<?> getInstanceClass() {
				return ProductDeliveryObligation.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<ProductDelivery> getProductDeliveryOffset() {
		return productDeliveryOffset;
	}

	public void setProductDeliveryOffset(List<com.tools20022.repository.entity.ProductDelivery> productDeliveryOffset) {
		this.productDeliveryOffset = productDeliveryOffset;
	}

	public CommercialTrade getCommercialTrade() {
		return commercialTrade;
	}

	public void setCommercialTrade(com.tools20022.repository.entity.CommercialTrade commercialTrade) {
		this.commercialTrade = commercialTrade;
	}
}