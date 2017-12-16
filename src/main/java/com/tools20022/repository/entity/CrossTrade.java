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
import com.tools20022.repository.codeset.CrossTradeExecutionCode;
import com.tools20022.repository.codeset.CrossTypeCode;
import com.tools20022.repository.codeset.PrioritisationCode;
import com.tools20022.repository.entity.SecuritiesOrder;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Transaction where either the buy-broker and the sell-broker are the same, or
 * the buy-broker and the sell-broker belong to the same firm.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CrossTrade" src="doc-files/CrossTrade.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.SecuritiesOrder
 * SecuritiesOrder}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CrossTrade#mmBuySideOrder
 * CrossTrade.mmBuySideOrder}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CrossTrade#mmSellSideOrder
 * CrossTrade.mmSellSideOrder}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CrossTrade#mmExecutionType
 * CrossTrade.mmExecutionType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CrossTrade#mmCrossType
 * CrossTrade.mmCrossType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CrossTrade#mmPrioritisation
 * CrossTrade.mmPrioritisation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmBuySideRelatedCrossTrade
 * SecuritiesOrder.mmBuySideRelatedCrossTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmSellSideRelatedCrossTrade
 * SecuritiesOrder.mmSellSideRelatedCrossTrade}</li>
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
 * "CrossTrade"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Transaction where either the buy-broker and the sell-broker are the same, or the buy-broker and the sell-broker belong to the same firm."
 * </li>
 * </ul>
 */
public class CrossTrade extends SecuritiesOrder {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<SecuritiesOrder> buySideOrder;
	/**
	 * Buyside order details.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmBuySideRelatedCrossTrade
	 * SecuritiesOrder.mmBuySideRelatedCrossTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CrossTrade CrossTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuySideOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Buyside order details."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmBuySideOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CrossTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BuySideOrder";
			definition = "Buyside order details.";
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesOrder.mmBuySideRelatedCrossTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesOrder.mmObject();
		}
	};
	protected List<SecuritiesOrder> sellSideOrder;
	/**
	 * Sell side order details.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmSellSideRelatedCrossTrade
	 * SecuritiesOrder.mmSellSideRelatedCrossTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CrossTrade CrossTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellSideOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sell side order details."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSellSideOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CrossTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SellSideOrder";
			definition = "Sell side order details.";
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesOrder.mmSellSideRelatedCrossTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesOrder.mmObject();
		}
	};
	protected CrossTradeExecutionCode executionType;
	/**
	 * Identifies the type of execution of a cross trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CrossTradeExecutionCode
	 * CrossTradeExecutionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CrossTrade CrossTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExecutionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the type of execution of a cross trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmExecutionType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CrossTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExecutionType";
			definition = "Identifies the type of execution of a cross trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CrossTradeExecutionCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CrossTrade.class.getMethod("getExecutionType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CrossTypeCode crossType;
	/**
	 * Type of cross being submitted to a market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CrossTypeCode
	 * CrossTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CrossTrade CrossTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CrossType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of cross being submitted to a market."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCrossType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CrossTrade.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CrossType";
			definition = "Type of cross being submitted to a market.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CrossTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CrossTrade.class.getMethod("getCrossType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PrioritisationCode prioritisation;
	/**
	 * Indicates whether one side or the other of a cross order should be
	 * prioritized.<br>
	 * The definition of prioritization depends on the market. In some markets
	 * prioritization means which side of the cross order is applied to the
	 * market first. In other markets, prioritization may mean that the
	 * prioritized side is fully executed (sometimes referred to as the side
	 * being protected).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PrioritisationCode
	 * PrioritisationCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CrossTrade CrossTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Prioritisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether one side or the other of a cross order should be prioritized.\r\nThe definition of prioritization depends on the market. In some markets prioritization means which side of the cross order is applied to the market first. In other markets, prioritization may mean that the prioritized side is fully executed (sometimes referred to as the side being protected)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPrioritisation = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CrossTrade.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Prioritisation";
			definition = "Indicates whether one side or the other of a cross order should be prioritized.\r\nThe definition of prioritization depends on the market. In some markets prioritization means which side of the cross order is applied to the market first. In other markets, prioritization may mean that the prioritized side is fully executed (sometimes referred to as the side being protected).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PrioritisationCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CrossTrade.class.getMethod("getPrioritisation", new Class[]{});
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
				name = "CrossTrade";
				definition = "Transaction where either the buy-broker and the sell-broker are the same, or the buy-broker and the sell-broker belong to the same firm.";
				associationDomain_lazy = () -> Arrays.asList(SecuritiesOrder.mmBuySideRelatedCrossTrade, SecuritiesOrder.mmSellSideRelatedCrossTrade);
				superType_lazy = () -> SecuritiesOrder.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CrossTrade.mmBuySideOrder, com.tools20022.repository.entity.CrossTrade.mmSellSideOrder, com.tools20022.repository.entity.CrossTrade.mmExecutionType,
						com.tools20022.repository.entity.CrossTrade.mmCrossType, com.tools20022.repository.entity.CrossTrade.mmPrioritisation);
			}

			@Override
			public Class<?> getInstanceClass() {
				return CrossTrade.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<SecuritiesOrder> getBuySideOrder() {
		return buySideOrder;
	}

	public void setBuySideOrder(List<SecuritiesOrder> buySideOrder) {
		this.buySideOrder = buySideOrder;
	}

	public List<SecuritiesOrder> getSellSideOrder() {
		return sellSideOrder;
	}

	public void setSellSideOrder(List<SecuritiesOrder> sellSideOrder) {
		this.sellSideOrder = sellSideOrder;
	}

	public CrossTradeExecutionCode getExecutionType() {
		return executionType;
	}

	public void setExecutionType(CrossTradeExecutionCode executionType) {
		this.executionType = executionType;
	}

	public CrossTypeCode getCrossType() {
		return crossType;
	}

	public void setCrossType(CrossTypeCode crossType) {
		this.crossType = crossType;
	}

	public PrioritisationCode getPrioritisation() {
		return prioritisation;
	}

	public void setPrioritisation(PrioritisationCode prioritisation) {
		this.prioritisation = prioritisation;
	}
}