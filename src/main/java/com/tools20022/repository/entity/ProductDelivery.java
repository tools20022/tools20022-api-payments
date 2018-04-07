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
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.ObligationFulfilment
 * ObligationFulfilment}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductDelivery#mmDeliveryPeriod
 * ProductDelivery.mmDeliveryPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ProductDelivery#mmRouting
 * ProductDelivery.mmRouting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductDelivery#mmTradeSettlement
 * ProductDelivery.mmTradeSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductDelivery#mmObligation
 * ProductDelivery.mmObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductDelivery#mmTradeCertificate
 * ProductDelivery.mmTradeCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductDelivery#mmInsuranceCertificate
 * ProductDelivery.mmInsuranceCertificate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ProductDelivery#mmProduct
 * ProductDelivery.mmProduct}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedProductDelivery
 * DateTimePeriod.mmRelatedProductDelivery}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#mmDelivery
 * Product.mmDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InsuranceCertificate#mmProductDelivery
 * InsuranceCertificate.mmProductDelivery}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Transport#mmProductDelivery
 * Transport.mmProductDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommercialTradeSettlement#mmProductDelivery
 * CommercialTradeSettlement.mmProductDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradeCertificate#mmProductDelivery
 * TradeCertificate.mmProductDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductDeliveryObligation#mmProductDeliveryOffset
 * ProductDeliveryObligation.mmProductDeliveryOffset}</li>
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
 * "ProductDelivery"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Arrangements for delivery of invoiced products and/or services."</li>
 * </ul>
 */
public class ProductDelivery extends ObligationFulfilment {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected DateTimePeriod deliveryPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedProductDelivery
	 * DateTimePeriod.mmRelatedProductDelivery}</li>
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
	public static final MMBusinessAssociationEnd<ProductDelivery, DateTimePeriod> mmDeliveryPeriod = new MMBusinessAssociationEnd<ProductDelivery, DateTimePeriod>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ProductDelivery.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeliveryPeriod";
			definition = "Actual delivery period of the products and/or services.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> DateTimePeriod.mmRelatedProductDelivery;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}

		@Override
		public DateTimePeriod getValue(ProductDelivery obj) {
			return obj.getDeliveryPeriod();
		}

		@Override
		public void setValue(ProductDelivery obj, DateTimePeriod value) {
			obj.setDeliveryPeriod(value);
		}
	};
	protected List<Transport> routing;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Transport#mmProductDelivery
	 * Transport.mmProductDelivery}</li>
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
	public static final MMBusinessAssociationEnd<ProductDelivery, List<Transport>> mmRouting = new MMBusinessAssociationEnd<ProductDelivery, List<Transport>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ProductDelivery.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Routing";
			definition = "Information related to the conveyance of goods.";
			minOccurs = 0;
			opposite_lazy = () -> Transport.mmProductDelivery;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Transport.mmObject();
		}

		@Override
		public List<Transport> getValue(ProductDelivery obj) {
			return obj.getRouting();
		}

		@Override
		public void setValue(ProductDelivery obj, List<Transport> value) {
			obj.setRouting(value);
		}
	};
	protected CommercialTradeSettlement tradeSettlement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTradeSettlement#mmProductDelivery
	 * CommercialTradeSettlement.mmProductDelivery}</li>
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
	public static final MMBusinessAssociationEnd<ProductDelivery, Optional<CommercialTradeSettlement>> mmTradeSettlement = new MMBusinessAssociationEnd<ProductDelivery, Optional<CommercialTradeSettlement>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ProductDelivery.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradeSettlement";
			definition = "Specifies the settlement operation which originates the delivery of a product.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> CommercialTradeSettlement.mmProductDelivery;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CommercialTradeSettlement.mmObject();
		}

		@Override
		public Optional<CommercialTradeSettlement> getValue(ProductDelivery obj) {
			return obj.getTradeSettlement();
		}

		@Override
		public void setValue(ProductDelivery obj, Optional<CommercialTradeSettlement> value) {
			obj.setTradeSettlement(value.orElse(null));
		}
	};
	protected ProductDeliveryObligation obligation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductDeliveryObligation#mmProductDeliveryOffset
	 * ProductDeliveryObligation.mmProductDeliveryOffset}</li>
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
	public static final MMBusinessAssociationEnd<ProductDelivery, Optional<ProductDeliveryObligation>> mmObligation = new MMBusinessAssociationEnd<ProductDelivery, Optional<ProductDeliveryObligation>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ProductDelivery.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Obligation";
			definition = "Specifies the obligation which is offset by the delivery of a product.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> ProductDeliveryObligation.mmProductDeliveryOffset;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ProductDeliveryObligation.mmObject();
		}

		@Override
		public Optional<ProductDeliveryObligation> getValue(ProductDelivery obj) {
			return obj.getObligation();
		}

		@Override
		public void setValue(ProductDelivery obj, Optional<ProductDeliveryObligation> value) {
			obj.setObligation(value.orElse(null));
		}
	};
	protected List<com.tools20022.repository.entity.TradeCertificate> tradeCertificate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradeCertificate#mmProductDelivery
	 * TradeCertificate.mmProductDelivery}</li>
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
	public static final MMBusinessAssociationEnd<ProductDelivery, List<TradeCertificate>> mmTradeCertificate = new MMBusinessAssociationEnd<ProductDelivery, List<TradeCertificate>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ProductDelivery.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradeCertificate";
			definition = "Formal document used to record a fact and used as proof of the fact, in the context of a commercial trade transaction.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TradeCertificate.mmProductDelivery;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TradeCertificate.mmObject();
		}

		@Override
		public List<TradeCertificate> getValue(ProductDelivery obj) {
			return obj.getTradeCertificate();
		}

		@Override
		public void setValue(ProductDelivery obj, List<TradeCertificate> value) {
			obj.setTradeCertificate(value);
		}
	};
	protected List<com.tools20022.repository.entity.InsuranceCertificate> insuranceCertificate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InsuranceCertificate#mmProductDelivery
	 * InsuranceCertificate.mmProductDelivery}</li>
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
	public static final MMBusinessAssociationEnd<ProductDelivery, List<InsuranceCertificate>> mmInsuranceCertificate = new MMBusinessAssociationEnd<ProductDelivery, List<InsuranceCertificate>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ProductDelivery.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InsuranceCertificate";
			definition = "Formal document used to record a fact and used as proof of the fact that goods have been insured under an insurance policy.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InsuranceCertificate.mmProductDelivery;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InsuranceCertificate.mmObject();
		}

		@Override
		public List<InsuranceCertificate> getValue(ProductDelivery obj) {
			return obj.getInsuranceCertificate();
		}

		@Override
		public void setValue(ProductDelivery obj, List<InsuranceCertificate> value) {
			obj.setInsuranceCertificate(value);
		}
	};
	protected Product product;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmDelivery
	 * Product.mmDelivery}</li>
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
	public static final MMBusinessAssociationEnd<ProductDelivery, com.tools20022.repository.entity.Product> mmProduct = new MMBusinessAssociationEnd<ProductDelivery, com.tools20022.repository.entity.Product>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ProductDelivery.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Product";
			definition = "Specifies the type of goods and services linked to the quantity.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Product.mmDelivery;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Product.mmObject();
		}

		@Override
		public com.tools20022.repository.entity.Product getValue(ProductDelivery obj) {
			return obj.getProduct();
		}

		@Override
		public void setValue(ProductDelivery obj, com.tools20022.repository.entity.Product value) {
			obj.setProduct(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ProductDelivery";
				definition = "Arrangements for delivery of invoiced products and/or services.";
				associationDomain_lazy = () -> Arrays.asList(DateTimePeriod.mmRelatedProductDelivery, com.tools20022.repository.entity.Product.mmDelivery, com.tools20022.repository.entity.InsuranceCertificate.mmProductDelivery,
						Transport.mmProductDelivery, CommercialTradeSettlement.mmProductDelivery, com.tools20022.repository.entity.TradeCertificate.mmProductDelivery, ProductDeliveryObligation.mmProductDeliveryOffset);
				superType_lazy = () -> ObligationFulfilment.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ProductDelivery.mmDeliveryPeriod, com.tools20022.repository.entity.ProductDelivery.mmRouting,
						com.tools20022.repository.entity.ProductDelivery.mmTradeSettlement, com.tools20022.repository.entity.ProductDelivery.mmObligation, com.tools20022.repository.entity.ProductDelivery.mmTradeCertificate,
						com.tools20022.repository.entity.ProductDelivery.mmInsuranceCertificate, com.tools20022.repository.entity.ProductDelivery.mmProduct);
			}

			@Override
			public Class<?> getInstanceClass() {
				return ProductDelivery.class;
			}
		});
		return mmObject_lazy.get();
	}

	public DateTimePeriod getDeliveryPeriod() {
		return deliveryPeriod;
	}

	public ProductDelivery setDeliveryPeriod(DateTimePeriod deliveryPeriod) {
		this.deliveryPeriod = Objects.requireNonNull(deliveryPeriod);
		return this;
	}

	public List<Transport> getRouting() {
		return routing == null ? routing = new ArrayList<>() : routing;
	}

	public ProductDelivery setRouting(List<Transport> routing) {
		this.routing = Objects.requireNonNull(routing);
		return this;
	}

	public Optional<CommercialTradeSettlement> getTradeSettlement() {
		return tradeSettlement == null ? Optional.empty() : Optional.of(tradeSettlement);
	}

	public ProductDelivery setTradeSettlement(CommercialTradeSettlement tradeSettlement) {
		this.tradeSettlement = tradeSettlement;
		return this;
	}

	public Optional<ProductDeliveryObligation> getObligation() {
		return obligation == null ? Optional.empty() : Optional.of(obligation);
	}

	public ProductDelivery setObligation(ProductDeliveryObligation obligation) {
		this.obligation = obligation;
		return this;
	}

	public List<TradeCertificate> getTradeCertificate() {
		return tradeCertificate == null ? tradeCertificate = new ArrayList<>() : tradeCertificate;
	}

	public ProductDelivery setTradeCertificate(List<com.tools20022.repository.entity.TradeCertificate> tradeCertificate) {
		this.tradeCertificate = Objects.requireNonNull(tradeCertificate);
		return this;
	}

	public List<InsuranceCertificate> getInsuranceCertificate() {
		return insuranceCertificate == null ? insuranceCertificate = new ArrayList<>() : insuranceCertificate;
	}

	public ProductDelivery setInsuranceCertificate(List<com.tools20022.repository.entity.InsuranceCertificate> insuranceCertificate) {
		this.insuranceCertificate = Objects.requireNonNull(insuranceCertificate);
		return this;
	}

	public Product getProduct() {
		return product;
	}

	public ProductDelivery setProduct(com.tools20022.repository.entity.Product product) {
		this.product = Objects.requireNonNull(product);
		return this;
	}
}