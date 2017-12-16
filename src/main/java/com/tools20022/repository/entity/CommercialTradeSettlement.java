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
import com.tools20022.repository.entity.Settlement;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Settlement
 * Settlement}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommercialTradeSettlement#mmPayment
 * CommercialTradeSettlement.mmPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommercialTradeSettlement#mmInvoice
 * CommercialTradeSettlement.mmInvoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommercialTradeSettlement#mmLetterOfCredit
 * CommercialTradeSettlement.mmLetterOfCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommercialTradeSettlement#mmProductDelivery
 * CommercialTradeSettlement.mmProductDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommercialTradeSettlement#mmCommercialTrade
 * CommercialTradeSettlement.mmCommercialTrade}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmTradeSettlement
 * Payment.mmTradeSettlement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Invoice#mmTradeSettlement
 * Invoice.mmTradeSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommercialTrade#mmTradeSettlement
 * CommercialTrade.mmTradeSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductDelivery#mmTradeSettlement
 * ProductDelivery.mmTradeSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.LetterOfCredit#mmCommercialTradeSettlement
 * LetterOfCredit.mmCommercialTradeSettlement}</li>
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
 * "CommercialTradeSettlement"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Settlement of a commercial trade, that is, the instruction to deliver goods or services against the payment of an amount of money."
 * </li>
 * </ul>
 */
public class CommercialTradeSettlement extends Settlement {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.Payment> payment;
	/**
	 * Settlement of the payment side of a commercial trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmTradeSettlement
	 * Payment.mmTradeSettlement}</li>
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
	public static final MMBusinessAssociationEnd mmPayment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CommercialTradeSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Payment";
			definition = "Settlement of the payment side of a commercial trade.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.mmTradeSettlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Invoice> invoice;
	/**
	 * Specifies for which invoice the settlement takes place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Invoice#mmTradeSettlement
	 * Invoice.mmTradeSettlement}</li>
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
	public static final MMBusinessAssociationEnd mmInvoice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CommercialTradeSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Invoice";
			definition = "Specifies for which invoice the settlement takes place.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Invoice.mmTradeSettlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Invoice.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.LetterOfCredit> letterOfCredit;
	/**
	 * Written undertaking by a bank to honour a demand for payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LetterOfCredit#mmCommercialTradeSettlement
	 * LetterOfCredit.mmCommercialTradeSettlement}</li>
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
	public static final MMBusinessAssociationEnd mmLetterOfCredit = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CommercialTradeSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LetterOfCredit";
			definition = "Written undertaking by a bank to honour a demand for payment.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.LetterOfCredit.mmCommercialTradeSettlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.LetterOfCredit.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.ProductDelivery> productDelivery;
	/**
	 * Delivery of the goods or services to the buyer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductDelivery#mmTradeSettlement
	 * ProductDelivery.mmTradeSettlement}</li>
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
	public static final MMBusinessAssociationEnd mmProductDelivery = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CommercialTradeSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProductDelivery";
			definition = "Delivery of the goods or services to the buyer.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ProductDelivery.mmTradeSettlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ProductDelivery.mmObject();
		}
	};
	protected CommercialTrade commercialTrade;
	/**
	 * Specifies the commercial trade which is settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTrade#mmTradeSettlement
	 * CommercialTrade.mmTradeSettlement}</li>
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
	public static final MMBusinessAssociationEnd mmCommercialTrade = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CommercialTradeSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CommercialTrade";
			definition = "Specifies the commercial trade which is settled.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CommercialTrade.mmTradeSettlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CommercialTrade.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CommercialTradeSettlement";
				definition = "Settlement of a commercial trade, that is, the instruction to deliver goods or services against the payment of an amount of money.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Payment.mmTradeSettlement, com.tools20022.repository.entity.Invoice.mmTradeSettlement,
						com.tools20022.repository.entity.CommercialTrade.mmTradeSettlement, com.tools20022.repository.entity.ProductDelivery.mmTradeSettlement, com.tools20022.repository.entity.LetterOfCredit.mmCommercialTradeSettlement);
				superType_lazy = () -> Settlement.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CommercialTradeSettlement.mmPayment, com.tools20022.repository.entity.CommercialTradeSettlement.mmInvoice,
						com.tools20022.repository.entity.CommercialTradeSettlement.mmLetterOfCredit, com.tools20022.repository.entity.CommercialTradeSettlement.mmProductDelivery,
						com.tools20022.repository.entity.CommercialTradeSettlement.mmCommercialTrade);
			}

			@Override
			public Class<?> getInstanceClass() {
				return CommercialTradeSettlement.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<Payment> getPayment() {
		return payment;
	}

	public void setPayment(List<com.tools20022.repository.entity.Payment> payment) {
		this.payment = payment;
	}

	public List<Invoice> getInvoice() {
		return invoice;
	}

	public void setInvoice(List<com.tools20022.repository.entity.Invoice> invoice) {
		this.invoice = invoice;
	}

	public List<LetterOfCredit> getLetterOfCredit() {
		return letterOfCredit;
	}

	public void setLetterOfCredit(List<com.tools20022.repository.entity.LetterOfCredit> letterOfCredit) {
		this.letterOfCredit = letterOfCredit;
	}

	public List<ProductDelivery> getProductDelivery() {
		return productDelivery;
	}

	public void setProductDelivery(List<com.tools20022.repository.entity.ProductDelivery> productDelivery) {
		this.productDelivery = productDelivery;
	}

	public CommercialTrade getCommercialTrade() {
		return commercialTrade;
	}

	public void setCommercialTrade(com.tools20022.repository.entity.CommercialTrade commercialTrade) {
		this.commercialTrade = commercialTrade;
	}
}