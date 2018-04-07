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

import com.tools20022.metamodel.ext.OtherSemanticMarkup;
import com.tools20022.metamodel.*;
import com.tools20022.repository.datatype.Max16Text;
import com.tools20022.repository.entity.SecuritiesOrder;
import com.tools20022.repository.GeneratedRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

/**
 * Record of orders to buy and sell a financial instrument.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="OrderBook" src="doc-files/OrderBook.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.OrderBook#mmOrder
 * OrderBook.mmOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrderBook#mmPriceTimePriority
 * OrderBook.mmPriceTimePriority}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmRelatedOrderBook
 * SecuritiesOrder.mmRelatedOrderBook}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
 * semanticMarkup} = type=BusinessComment, BusinessComment=A record of the
 * orders.</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OrderBook"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Record of orders to buy and sell a financial instrument."</li>
 * </ul>
 */
public class OrderBook {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<SecuritiesOrder> order;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmRelatedOrderBook
	 * SecuritiesOrder.mmRelatedOrderBook}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.OrderBook
	 * OrderBook}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Order"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction to a broker or dealer to buy or sell a specific security."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<OrderBook, List<SecuritiesOrder>> mmOrder = new MMBusinessAssociationEnd<OrderBook, List<SecuritiesOrder>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.OrderBook.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Order";
			definition = "Instruction to a broker or dealer to buy or sell a specific security.";
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesOrder.mmRelatedOrderBook;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesOrder.mmObject();
		}

		@Override
		public List<SecuritiesOrder> getValue(OrderBook obj) {
			return obj.getOrder();
		}

		@Override
		public void setValue(OrderBook obj, List<SecuritiesOrder> value) {
			obj.setOrder(value);
		}
	};
	protected Max16Text priceTimePriority;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max16Text
	 * Max16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.OrderBook
	 * OrderBook}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceTimePriority"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Priority given to an order based on its price and/or time specification."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<OrderBook, Max16Text> mmPriceTimePriority = new MMBusinessAttribute<OrderBook, Max16Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.OrderBook.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PriceTimePriority";
			definition = "Priority given to an order based on its price and/or time specification.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max16Text.mmObject();
		}

		@Override
		public Max16Text getValue(OrderBook obj) {
			return obj.getPriceTimePriority();
		}

		@Override
		public void setValue(OrderBook obj, Max16Text value) {
			obj.setPriceTimePriority(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				semanticMarkup_lazy = () -> Arrays.asList(new OtherSemanticMarkup(this, "BusinessComment", new String[]{"BusinessComment", "A record of the orders."}));
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OrderBook";
				definition = "Record of orders to buy and sell a financial instrument.";
				associationDomain_lazy = () -> Arrays.asList(SecuritiesOrder.mmRelatedOrderBook);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.OrderBook.mmOrder, com.tools20022.repository.entity.OrderBook.mmPriceTimePriority);
			}

			@Override
			public Class<?> getInstanceClass() {
				return OrderBook.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<SecuritiesOrder> getOrder() {
		return order == null ? order = new ArrayList<>() : order;
	}

	public OrderBook setOrder(List<SecuritiesOrder> order) {
		this.order = Objects.requireNonNull(order);
		return this;
	}

	public Max16Text getPriceTimePriority() {
		return priceTimePriority;
	}

	public OrderBook setPriceTimePriority(Max16Text priceTimePriority) {
		this.priceTimePriority = Objects.requireNonNull(priceTimePriority);
		return this;
	}
}