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
import com.tools20022.repository.entity.Settlement;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Settlement of a commercial trade, that is, the instruction to deliver goods
 * or services against the payment of an amount of money.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CommercialTradeSettlement"
 * src="doc-files/CommercialTradeSettlement.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommercialTradeSettlement#Payment
 * CommercialTradeSettlement.Payment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommercialTradeSettlement#Invoice
 * CommercialTradeSettlement.Invoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommercialTradeSettlement#LetterOfCredit
 * CommercialTradeSettlement.LetterOfCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommercialTradeSettlement#ProductDelivery
 * CommercialTradeSettlement.ProductDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommercialTradeSettlement#CommercialTrade
 * CommercialTradeSettlement.CommercialTrade}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#TradeSettlement
 * Payment.TradeSettlement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Invoice#TradeSettlement
 * Invoice.TradeSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommercialTrade#TradeSettlement
 * CommercialTrade.TradeSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductDelivery#TradeSettlement
 * ProductDelivery.TradeSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.LetterOfCredit#CommercialTradeSettlement
 * LetterOfCredit.CommercialTradeSettlement}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Settlement
 * Settlement}</li>
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
 * "CommercialTradeSettlement"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Settlement of a commercial trade, that is, the instruction to deliver goods or services against the payment of an amount of money."
 * </li>
 * </ul>
 */
public class CommercialTradeSettlement extends Settlement {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Settlement of the payment side of a commercial trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Payment#TradeSettlement
	 * Payment.TradeSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTradeSettlement
	 * CommercialTradeSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Payment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement of the payment side of a commercial trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Payment = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CommercialTradeSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Payment";
			definition = "Settlement of the payment side of a commercial trade.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.TradeSettlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies for which invoice the settlement takes place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Invoice#TradeSettlement
	 * Invoice.TradeSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Invoice Invoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTradeSettlement
	 * CommercialTradeSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Invoice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies for which invoice the settlement takes place."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Invoice = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CommercialTradeSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Invoice";
			definition = "Specifies for which invoice the settlement takes place.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Invoice.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Invoice.TradeSettlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Written undertaking by a bank to honour a demand for payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LetterOfCredit#CommercialTradeSettlement
	 * LetterOfCredit.CommercialTradeSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.LetterOfCredit
	 * LetterOfCredit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTradeSettlement
	 * CommercialTradeSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LetterOfCredit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Written undertaking by a bank to honour a demand for payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd LetterOfCredit = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CommercialTradeSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LetterOfCredit";
			definition = "Written undertaking by a bank to honour a demand for payment.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.LetterOfCredit.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.LetterOfCredit.CommercialTradeSettlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Delivery of the goods or services to the buyer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductDelivery#TradeSettlement
	 * ProductDelivery.TradeSettlement}</li>
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
	 * {@linkplain com.tools20022.repository.entity.CommercialTradeSettlement
	 * CommercialTradeSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProductDelivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Delivery of the goods or services to the buyer."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ProductDelivery = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CommercialTradeSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProductDelivery";
			definition = "Delivery of the goods or services to the buyer.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.ProductDelivery.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ProductDelivery.TradeSettlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the commercial trade which is settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTrade#TradeSettlement
	 * CommercialTrade.TradeSettlement}</li>
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
	 * {@linkplain com.tools20022.repository.entity.CommercialTradeSettlement
	 * CommercialTradeSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommercialTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the commercial trade which is settled."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CommercialTrade = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CommercialTradeSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CommercialTrade";
			definition = "Specifies the commercial trade which is settled.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CommercialTrade.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CommercialTrade.TradeSettlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CommercialTradeSettlement";
				definition = "Settlement of a commercial trade, that is, the instruction to deliver goods or services against the payment of an amount of money.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Payment.TradeSettlement, com.tools20022.repository.entity.Invoice.TradeSettlement,
						com.tools20022.repository.entity.CommercialTrade.TradeSettlement, com.tools20022.repository.entity.ProductDelivery.TradeSettlement, com.tools20022.repository.entity.LetterOfCredit.CommercialTradeSettlement);
				superType_lazy = () -> Settlement.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CommercialTradeSettlement.Payment, com.tools20022.repository.entity.CommercialTradeSettlement.Invoice,
						com.tools20022.repository.entity.CommercialTradeSettlement.LetterOfCredit, com.tools20022.repository.entity.CommercialTradeSettlement.ProductDelivery,
						com.tools20022.repository.entity.CommercialTradeSettlement.CommercialTrade);
			}
		});
		return mmObject_lazy.get();
	}
}