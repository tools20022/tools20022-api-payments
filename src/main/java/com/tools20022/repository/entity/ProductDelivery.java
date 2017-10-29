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
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.ObligationFulfilment;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Arrangements for delivery of invoiced products and/or services.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="ProductDelivery" src="doc-files/ProductDelivery.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductDelivery#DeliveryPeriod
 * ProductDelivery.DeliveryPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ProductDelivery#Routing
 * ProductDelivery.Routing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductDelivery#TradeSettlement
 * ProductDelivery.TradeSettlement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ProductDelivery#Obligation
 * ProductDelivery.Obligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductDelivery#TradeCertificate
 * ProductDelivery.TradeCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductDelivery#InsuranceCertificate
 * ProductDelivery.InsuranceCertificate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ProductDelivery#Product
 * ProductDelivery.Product}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#RelatedProductDelivery
 * DateTimePeriod.RelatedProductDelivery}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#Delivery
 * Product.Delivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InsuranceCertificate#ProductDelivery
 * InsuranceCertificate.ProductDelivery}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Transport#ProductDelivery
 * Transport.ProductDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommercialTradeSettlement#ProductDelivery
 * CommercialTradeSettlement.ProductDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradeCertificate#ProductDelivery
 * TradeCertificate.ProductDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductDeliveryObligation#ProductDeliveryOffset
 * ProductDeliveryObligation.ProductDeliveryOffset}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.ObligationFulfilment
 * ObligationFulfilment}</li>
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
 * "ProductDelivery"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Arrangements for delivery of invoiced products and/or services."</li>
 * </ul>
 */
public class ProductDelivery extends ObligationFulfilment {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Actual delivery period of the products and/or services.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#RelatedProductDelivery
	 * DateTimePeriod.RelatedProductDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProductDelivery
	 * ProductDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Actual delivery period of the products and/or services."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd DeliveryPeriod = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ProductDelivery.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DeliveryPeriod";
			definition = "Actual delivery period of the products and/or services.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.RelatedProductDelivery;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Information related to the conveyance of goods.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Transport#ProductDelivery
	 * Transport.ProductDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Transport Transport}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProductDelivery
	 * ProductDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Routing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information related to the conveyance of goods."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Routing = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ProductDelivery.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Routing";
			definition = "Information related to the conveyance of goods.";
			minOccurs = 0;
			type_lazy = () -> Transport.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Transport.ProductDelivery;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the settlement operation which originates the delivery of a
	 * product.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTradeSettlement#ProductDelivery
	 * CommercialTradeSettlement.ProductDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTradeSettlement
	 * CommercialTradeSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProductDelivery
	 * ProductDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the settlement operation which originates the delivery of a product."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TradeSettlement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ProductDelivery.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradeSettlement";
			definition = "Specifies the settlement operation which originates the delivery of a product.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CommercialTradeSettlement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CommercialTradeSettlement.ProductDelivery;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the obligation which is offset by the delivery of a product.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductDeliveryObligation#ProductDeliveryOffset
	 * ProductDeliveryObligation.ProductDeliveryOffset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.ProductDeliveryObligation
	 * ProductDeliveryObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProductDelivery
	 * ProductDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Obligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the obligation which is offset by the delivery of a product."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Obligation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ProductDelivery.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Obligation";
			definition = "Specifies the obligation which is offset by the delivery of a product.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> ProductDeliveryObligation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ProductDeliveryObligation.ProductDeliveryOffset;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Formal document used to record a fact and used as proof of the fact, in
	 * the context of a commercial trade transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradeCertificate#ProductDelivery
	 * TradeCertificate.ProductDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TradeCertificate
	 * TradeCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProductDelivery
	 * ProductDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeCertificate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Formal document used to record a fact and used as proof of the fact, in the context of a commercial trade transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TradeCertificate = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ProductDelivery.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradeCertificate";
			definition = "Formal document used to record a fact and used as proof of the fact, in the context of a commercial trade transaction.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.TradeCertificate.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TradeCertificate.ProductDelivery;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Formal document used to record a fact and used as proof of the fact that
	 * goods have been insured under an insurance policy.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InsuranceCertificate#ProductDelivery
	 * InsuranceCertificate.ProductDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InsuranceCertificate
	 * InsuranceCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProductDelivery
	 * ProductDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsuranceCertificate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Formal document used to record a fact and used as proof of the fact that goods have been insured under an insurance policy."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd InsuranceCertificate = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ProductDelivery.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InsuranceCertificate";
			definition = "Formal document used to record a fact and used as proof of the fact that goods have been insured under an insurance policy.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.InsuranceCertificate.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InsuranceCertificate.ProductDelivery;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
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
	 * {@linkplain com.tools20022.repository.entity.Product#Delivery
	 * Product.Delivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Product Product}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProductDelivery
	 * ProductDelivery}</li>
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
			elementContext_lazy = () -> ProductDelivery.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Product";
			definition = "Specifies the type of goods and services linked to the quantity.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Product.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Product.Delivery;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ProductDelivery";
				definition = "Arrangements for delivery of invoiced products and/or services.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DateTimePeriod.RelatedProductDelivery, com.tools20022.repository.entity.Product.Delivery,
						com.tools20022.repository.entity.InsuranceCertificate.ProductDelivery, com.tools20022.repository.entity.Transport.ProductDelivery, com.tools20022.repository.entity.CommercialTradeSettlement.ProductDelivery,
						com.tools20022.repository.entity.TradeCertificate.ProductDelivery, com.tools20022.repository.entity.ProductDeliveryObligation.ProductDeliveryOffset);
				superType_lazy = () -> ObligationFulfilment.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ProductDelivery.DeliveryPeriod, com.tools20022.repository.entity.ProductDelivery.Routing, com.tools20022.repository.entity.ProductDelivery.TradeSettlement,
						com.tools20022.repository.entity.ProductDelivery.Obligation, com.tools20022.repository.entity.ProductDelivery.TradeCertificate, com.tools20022.repository.entity.ProductDelivery.InsuranceCertificate,
						com.tools20022.repository.entity.ProductDelivery.Product);
			}
		});
		return mmObject_lazy.get();
	}
}