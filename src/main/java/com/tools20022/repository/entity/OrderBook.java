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
import com.tools20022.repository.datatype.Max16Text;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	protected List<com.tools20022.repository.entity.SecuritiesOrder> order;
	/**
	 * Instruction to a broker or dealer to buy or sell a specific security.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.OrderBook.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Order";
			definition = "Instruction to a broker or dealer to buy or sell a specific security.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmRelatedOrderBook;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
		}
	};
	protected Max16Text priceTimePriority;
	/**
	 * Priority given to an order based on its price and/or time specification.
	 * <p>
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
	public static final MMBusinessAttribute mmPriceTimePriority = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return OrderBook.class.getMethod("getPriceTimePriority", new Class[]{});
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
				name = "OrderBook";
				definition = "Record of orders to buy and sell a financial instrument.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesOrder.mmRelatedOrderBook);
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
		return order;
	}

	public void setOrder(List<com.tools20022.repository.entity.SecuritiesOrder> order) {
		this.order = order;
	}

	public Max16Text getPriceTimePriority() {
		return priceTimePriority;
	}

	public void setPriceTimePriority(Max16Text priceTimePriority) {
		this.priceTimePriority = priceTimePriority;
	}
}