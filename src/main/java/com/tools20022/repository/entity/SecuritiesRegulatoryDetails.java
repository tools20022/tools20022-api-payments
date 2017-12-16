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
import com.tools20022.repository.codeset.OrderClassificationCode;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Information related to order and required for regulatory purposes.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesRegulatoryDetails"
 * src="doc-files/SecuritiesRegulatoryDetails.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesRegulatoryDetails#mmOrderRestrictions
 * SecuritiesRegulatoryDetails.mmOrderRestrictions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesRegulatoryDetails#mmBrokerSolicitedTrade
 * SecuritiesRegulatoryDetails.mmBrokerSolicitedTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesRegulatoryDetails#mmRelatedOrder
 * SecuritiesRegulatoryDetails.mmRelatedOrder}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmLegalParameters
 * SecuritiesOrder.mmLegalParameters}</li>
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
 * "SecuritiesRegulatoryDetails"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information related to order and required for regulatory purposes."</li>
 * </ul>
 */
public class SecuritiesRegulatoryDetails {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected OrderClassificationCode orderRestrictions;
	/**
	 * Classification and restrictions linked to an order (for regulatory
	 * purpose).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OrderClassificationCode
	 * OrderClassificationCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesRegulatoryDetails
	 * SecuritiesRegulatoryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderRestrictions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Classification and restrictions linked to an order (for regulatory purpose)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmOrderRestrictions = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesRegulatoryDetails.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OrderRestrictions";
			definition = "Classification and restrictions linked to an order (for regulatory purpose).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OrderClassificationCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesRegulatoryDetails.class.getMethod("getOrderRestrictions", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator brokerSolicitedTrade;
	/**
	 * Indicates whether the trading party has suggested to his client to
	 * buy/sell a financial instrument or whether the investor acts on its own
	 * without advice from its trading party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesRegulatoryDetails
	 * SecuritiesRegulatoryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BrokerSolicitedTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the trading party has suggested to his client to buy/sell a financial instrument or whether the investor acts on its own without advice from its trading party."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmBrokerSolicitedTrade = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesRegulatoryDetails.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BrokerSolicitedTrade";
			definition = "Indicates whether the trading party has suggested to his client to buy/sell a financial instrument or whether the investor acts on its own without advice from its trading party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesRegulatoryDetails.class.getMethod("getBrokerSolicitedTrade", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesOrder relatedOrder;
	/**
	 * Order for which legal parameters are provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmLegalParameters
	 * SecuritiesOrder.mmLegalParameters}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesRegulatoryDetails
	 * SecuritiesRegulatoryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order for which legal parameters are provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesRegulatoryDetails.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedOrder";
			definition = "Order for which legal parameters are provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmLegalParameters;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesRegulatoryDetails";
				definition = "Information related to order and required for regulatory purposes.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesOrder.mmLegalParameters);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesRegulatoryDetails.mmOrderRestrictions, com.tools20022.repository.entity.SecuritiesRegulatoryDetails.mmBrokerSolicitedTrade,
						com.tools20022.repository.entity.SecuritiesRegulatoryDetails.mmRelatedOrder);
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesRegulatoryDetails.class;
			}
		});
		return mmObject_lazy.get();
	}

	public OrderClassificationCode getOrderRestrictions() {
		return orderRestrictions;
	}

	public void setOrderRestrictions(OrderClassificationCode orderRestrictions) {
		this.orderRestrictions = orderRestrictions;
	}

	public YesNoIndicator getBrokerSolicitedTrade() {
		return brokerSolicitedTrade;
	}

	public void setBrokerSolicitedTrade(YesNoIndicator brokerSolicitedTrade) {
		this.brokerSolicitedTrade = brokerSolicitedTrade;
	}

	public SecuritiesOrder getRelatedOrder() {
		return relatedOrder;
	}

	public void setRelatedOrder(com.tools20022.repository.entity.SecuritiesOrder relatedOrder) {
		this.relatedOrder = relatedOrder;
	}
}