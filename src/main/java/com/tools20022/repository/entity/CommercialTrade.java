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
import com.tools20022.repository.choice.UnderlyingContract1Choice;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.entity.Trade;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Commercial details of a trade transaction between a buyer and a seller.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CommercialTrade" src="doc-files/CommercialTrade.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Trade Trade}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommercialTrade#mmPurchaseAccount
 * CommercialTrade.mmPurchaseAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommercialTrade#mmPaymentObligation
 * CommercialTrade.mmPaymentObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommercialTrade#mmTotalAcceptedAmount
 * CommercialTrade.mmTotalAcceptedAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CommercialTrade#mmPartyRole
 * CommercialTrade.mmPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommercialTrade#mmTradeSettlement
 * CommercialTrade.mmTradeSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommercialTrade#mmProductDeliveryObligation
 * CommercialTrade.mmProductDeliveryObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommercialTrade#mmPurchaseOrder
 * CommercialTrade.mmPurchaseOrder}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CommercialTrade#mmDocuments
 * CommercialTrade.mmDocuments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommercialTrade#mmRelatedUndertaking
 * CommercialTrade.mmRelatedUndertaking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommercialTrade#mmTransactionStatus
 * CommercialTrade.mmTransactionStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CommercialTrade#mmAgreement
 * CommercialTrade.mmAgreement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#mmRelatedCommercialTrade
 * CashAccount.mmRelatedCommercialTrade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Agreement#mmTrade
 * Agreement.mmTrade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmCommercialTrade
 * Document.mmCommercialTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmCommercialTrade
 * PaymentObligation.mmCommercialTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UnderlyingTransaction#mmCommercialTrade
 * UnderlyingTransaction.mmCommercialTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommercialTradePartyRole#mmCommercialTrade
 * CommercialTradePartyRole.mmCommercialTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommercialTradeSettlement#mmCommercialTrade
 * CommercialTradeSettlement.mmCommercialTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BaselineStatus#mmCommercialTrade
 * BaselineStatus.mmCommercialTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PurchaseOrder#mmResultingCommercialTrade
 * PurchaseOrder.mmResultingCommercialTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductDeliveryObligation#mmCommercialTrade
 * ProductDeliveryObligation.mmCommercialTrade}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnderlyingContract1Choice#mmTrade
 * UnderlyingContract1Choice.mmTrade}</li>
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
 * "CommercialTrade"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Commercial details of a trade transaction between a buyer and a seller."</li>
 * </ul>
 */
public class CommercialTrade extends Trade {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.CashAccount> purchaseAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmRelatedCommercialTrade
	 * CashAccount.mmRelatedCommercialTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccount
	 * CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTrade
	 * CommercialTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PurchaseAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specific purchase account for recording debits and credits for accounting purposes."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPurchaseAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CommercialTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PurchaseAccount";
			definition = "Specific purchase account for recording debits and credits for accounting purposes.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.mmRelatedCommercialTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccount.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.PaymentObligation> paymentObligation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmCommercialTrade
	 * PaymentObligation.mmCommercialTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTrade
	 * CommercialTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentObligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Obligation for the buyer to settle the value of the products bought."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPaymentObligation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CommercialTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentObligation";
			definition = "Obligation for the buyer to settle the value of the products bought.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmCommercialTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
		}
	};
	protected CurrencyAndAmount totalAcceptedAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTrade
	 * CommercialTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalAcceptedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount of a trade, that is the sum of the accepted items."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTotalAcceptedAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CommercialTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TotalAcceptedAmount";
			definition = "Total amount of a trade, that is the sum of the accepted items.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CommercialTrade.class.getMethod("getTotalAcceptedAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.CommercialTradePartyRole> partyRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTradePartyRole#mmCommercialTrade
	 * CommercialTradePartyRole.mmCommercialTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTradePartyRole
	 * CommercialTradePartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTrade
	 * CommercialTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Role played by a party in the context of a trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CommercialTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Role played by a party in the context of a trade.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CommercialTradePartyRole.mmCommercialTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CommercialTradePartyRole.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CommercialTradeSettlement> tradeSettlement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTradeSettlement#mmCommercialTrade
	 * CommercialTradeSettlement.mmCommercialTrade}</li>
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
	 * {@linkplain com.tools20022.repository.entity.CommercialTrade
	 * CommercialTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Process of settling a commercial trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTradeSettlement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CommercialTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradeSettlement";
			definition = "Process of settling a commercial trade.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CommercialTradeSettlement.mmCommercialTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CommercialTradeSettlement.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.ProductDeliveryObligation> productDeliveryObligation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductDeliveryObligation#mmCommercialTrade
	 * ProductDeliveryObligation.mmCommercialTrade}</li>
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
	 * {@linkplain com.tools20022.repository.entity.CommercialTrade
	 * CommercialTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProductDeliveryObligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Obligation for the seller to deliver the products to the buyer."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmProductDeliveryObligation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CommercialTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProductDeliveryObligation";
			definition = "Obligation for the seller to deliver the products to the buyer.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ProductDeliveryObligation.mmCommercialTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ProductDeliveryObligation.mmObject();
		}
	};
	protected PurchaseOrder purchaseOrder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PurchaseOrder#mmResultingCommercialTrade
	 * PurchaseOrder.mmResultingCommercialTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PurchaseOrder
	 * PurchaseOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTrade
	 * CommercialTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PurchaseOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the purchase order related to a commercial trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPurchaseOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CommercialTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PurchaseOrder";
			definition = "Specifies the purchase order related to a commercial trade.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PurchaseOrder.mmResultingCommercialTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PurchaseOrder.mmObject();
		}
	};
	protected Document documents;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmCommercialTrade
	 * Document.mmCommercialTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Document Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTrade
	 * CommercialTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Documents"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Documents related to                             a commercial trade transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmDocuments = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CommercialTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Documents";
			definition = "Documents related to                             a commercial trade transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Document.mmCommercialTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
		}
	};
	protected UnderlyingTransaction relatedUndertaking;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.UnderlyingTransaction#mmCommercialTrade
	 * UnderlyingTransaction.mmCommercialTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.UnderlyingTransaction
	 * UnderlyingTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTrade
	 * CommercialTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedUndertaking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Undertaking related to the commercial trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedUndertaking = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CommercialTrade.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedUndertaking";
			definition = "Undertaking related to the commercial trade.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.UnderlyingTransaction.mmCommercialTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.UnderlyingTransaction.mmObject();
		}
	};
	protected BaselineStatus transactionStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BaselineStatus#mmCommercialTrade
	 * BaselineStatus.mmCommercialTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BaselineStatus
	 * BaselineStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTrade
	 * CommercialTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status of a commercial trade processed in a central system."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTransactionStatus = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CommercialTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransactionStatus";
			definition = "Status of a commercial trade processed in a central system.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.BaselineStatus.mmCommercialTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BaselineStatus.mmObject();
		}
	};
	protected Agreement agreement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Agreement#mmTrade
	 * Agreement.mmTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Agreement Agreement}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTrade
	 * CommercialTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Agreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agreement between trade parties which describes the conditions under which they agree to execute trades amongst themselves."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAgreement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CommercialTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Agreement";
			definition = "Agreement between trade parties which describes the conditions under which they agree to execute trades amongst themselves.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Agreement.mmTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Agreement.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CommercialTrade";
				definition = "Commercial details of a trade transaction between a buyer and a seller.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccount.mmRelatedCommercialTrade, com.tools20022.repository.entity.Agreement.mmTrade,
						com.tools20022.repository.entity.Document.mmCommercialTrade, com.tools20022.repository.entity.PaymentObligation.mmCommercialTrade, com.tools20022.repository.entity.UnderlyingTransaction.mmCommercialTrade,
						com.tools20022.repository.entity.CommercialTradePartyRole.mmCommercialTrade, com.tools20022.repository.entity.CommercialTradeSettlement.mmCommercialTrade,
						com.tools20022.repository.entity.BaselineStatus.mmCommercialTrade, com.tools20022.repository.entity.PurchaseOrder.mmResultingCommercialTrade,
						com.tools20022.repository.entity.ProductDeliveryObligation.mmCommercialTrade);
				derivationElement_lazy = () -> Arrays.asList(UnderlyingContract1Choice.mmTrade);
				superType_lazy = () -> Trade.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CommercialTrade.mmPurchaseAccount, com.tools20022.repository.entity.CommercialTrade.mmPaymentObligation,
						com.tools20022.repository.entity.CommercialTrade.mmTotalAcceptedAmount, com.tools20022.repository.entity.CommercialTrade.mmPartyRole, com.tools20022.repository.entity.CommercialTrade.mmTradeSettlement,
						com.tools20022.repository.entity.CommercialTrade.mmProductDeliveryObligation, com.tools20022.repository.entity.CommercialTrade.mmPurchaseOrder, com.tools20022.repository.entity.CommercialTrade.mmDocuments,
						com.tools20022.repository.entity.CommercialTrade.mmRelatedUndertaking, com.tools20022.repository.entity.CommercialTrade.mmTransactionStatus, com.tools20022.repository.entity.CommercialTrade.mmAgreement);
			}

			@Override
			public Class<?> getInstanceClass() {
				return CommercialTrade.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<CashAccount> getPurchaseAccount() {
		return purchaseAccount == null ? purchaseAccount = new ArrayList<>() : purchaseAccount;
	}

	public CommercialTrade setPurchaseAccount(List<com.tools20022.repository.entity.CashAccount> purchaseAccount) {
		this.purchaseAccount = Objects.requireNonNull(purchaseAccount);
		return this;
	}

	public List<PaymentObligation> getPaymentObligation() {
		return paymentObligation == null ? paymentObligation = new ArrayList<>() : paymentObligation;
	}

	public CommercialTrade setPaymentObligation(List<com.tools20022.repository.entity.PaymentObligation> paymentObligation) {
		this.paymentObligation = Objects.requireNonNull(paymentObligation);
		return this;
	}

	public CurrencyAndAmount getTotalAcceptedAmount() {
		return totalAcceptedAmount;
	}

	public CommercialTrade setTotalAcceptedAmount(CurrencyAndAmount totalAcceptedAmount) {
		this.totalAcceptedAmount = Objects.requireNonNull(totalAcceptedAmount);
		return this;
	}

	public List<CommercialTradePartyRole> getPartyRole() {
		return partyRole == null ? partyRole = new ArrayList<>() : partyRole;
	}

	public CommercialTrade setPartyRole(List<com.tools20022.repository.entity.CommercialTradePartyRole> partyRole) {
		this.partyRole = Objects.requireNonNull(partyRole);
		return this;
	}

	public List<CommercialTradeSettlement> getTradeSettlement() {
		return tradeSettlement == null ? tradeSettlement = new ArrayList<>() : tradeSettlement;
	}

	public CommercialTrade setTradeSettlement(List<com.tools20022.repository.entity.CommercialTradeSettlement> tradeSettlement) {
		this.tradeSettlement = Objects.requireNonNull(tradeSettlement);
		return this;
	}

	public List<ProductDeliveryObligation> getProductDeliveryObligation() {
		return productDeliveryObligation == null ? productDeliveryObligation = new ArrayList<>() : productDeliveryObligation;
	}

	public CommercialTrade setProductDeliveryObligation(List<com.tools20022.repository.entity.ProductDeliveryObligation> productDeliveryObligation) {
		this.productDeliveryObligation = Objects.requireNonNull(productDeliveryObligation);
		return this;
	}

	public Optional<PurchaseOrder> getPurchaseOrder() {
		return purchaseOrder == null ? Optional.empty() : Optional.of(purchaseOrder);
	}

	public CommercialTrade setPurchaseOrder(com.tools20022.repository.entity.PurchaseOrder purchaseOrder) {
		this.purchaseOrder = purchaseOrder;
		return this;
	}

	public Document getDocuments() {
		return documents;
	}

	public CommercialTrade setDocuments(com.tools20022.repository.entity.Document documents) {
		this.documents = Objects.requireNonNull(documents);
		return this;
	}

	public UnderlyingTransaction getRelatedUndertaking() {
		return relatedUndertaking;
	}

	public CommercialTrade setRelatedUndertaking(com.tools20022.repository.entity.UnderlyingTransaction relatedUndertaking) {
		this.relatedUndertaking = Objects.requireNonNull(relatedUndertaking);
		return this;
	}

	public BaselineStatus getTransactionStatus() {
		return transactionStatus;
	}

	public CommercialTrade setTransactionStatus(com.tools20022.repository.entity.BaselineStatus transactionStatus) {
		this.transactionStatus = Objects.requireNonNull(transactionStatus);
		return this;
	}

	public Agreement getAgreement() {
		return agreement;
	}

	public CommercialTrade setAgreement(com.tools20022.repository.entity.Agreement agreement) {
		this.agreement = Objects.requireNonNull(agreement);
		return this;
	}
}