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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.ExposureTypeV2Code;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max4AlphaNumericText;
import com.tools20022.repository.entity.Obligation;
import com.tools20022.repository.entity.ObligationFulfilment;
import com.tools20022.repository.entity.Trade;
import com.tools20022.repository.entity.TransactionRisk;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the assets (quantity of securities, goods, services, and cash
 * amounts) that have to be delivered.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Obligation" src="doc-files/Obligation.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Obligation#mmRequestedSettlementDate
 * Obligation.mmRequestedSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Obligation#mmRequestedSettlementAmount
 * Obligation.mmRequestedSettlementAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Obligation#mmPriority
 * Obligation.mmPriority}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Obligation#mmTrade
 * Obligation.mmTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Obligation#mmTransactionRisk
 * Obligation.mmTransactionRisk}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Obligation#mmParentObligation
 * Obligation.mmParentObligation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Obligation#mmSubObligation
 * Obligation.mmSubObligation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Obligation#mmOffset
 * Obligation.mmOffset}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Obligation#mmOriginalObligationProcess
 * Obligation.mmOriginalObligationProcess}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Obligation#mmExposureType
 * Obligation.mmExposureType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#mmObligation
 * Trade.mmObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Obligation#mmParentObligation
 * Obligation.mmParentObligation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Obligation#mmSubObligation
 * Obligation.mmSubObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ObligationFulfilment#mmObligationOffset
 * ObligationFulfilment.mmObligationOffset}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ObligationFulfilment#mmResultingObligation
 * ObligationFulfilment.mmResultingObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TransactionRisk#mmObligation
 * TransactionRisk.mmObligation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentObligation
 * PaymentObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation
 * SecuritiesDeliveryObligation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ProductDeliveryObligation
 * ProductDeliveryObligation}</li>
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
 * "Obligation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the assets (quantity of securities, goods, services, and cash amounts) that have to be delivered."
 * </li>
 * </ul>
 */
public class Obligation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ISODateTime requestedSettlementDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestPaymentDateRange2#mmDueDate
	 * InterestPaymentDateRange2.mmDueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#mmRequestedCollectionDate
	 * DirectDebitTransactionInformation21.mmRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation7#mmRequestedCollectionDate
	 * OriginalPaymentInformation7.mmRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference26#mmRequestedExecutionDate
	 * OriginalTransactionReference26.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification7#mmRequestedExecutionDate
	 * RequestedModification7.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification7#mmRequestedCollectionDate
	 * RequestedModification7.mmRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDates3#mmTradeActivityContractualSettlementDate
	 * TransactionDates3.mmTradeActivityContractualSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference27#mmRequestedCollectionDate
	 * OriginalTransactionReference27.mmRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference27#mmRequestedExecutionDate
	 * OriginalTransactionReference27.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction84#mmOriginalRequestedExecutionDate
	 * PaymentTransaction84.mmOriginalRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction84#mmOriginalRequestedCollectionDate
	 * PaymentTransaction84.mmOriginalRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction4#mmRequestedCollectionDate
	 * UnderlyingPaymentInstruction4.mmRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInitiation3#mmRequestedCollectionDate
	 * CorrectivePaymentInitiation3.mmRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction95#mmOriginalRequestedExecutionDate
	 * PaymentTransaction95.mmOriginalRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction95#mmOriginalRequestedCollectionDate
	 * PaymentTransaction95.mmOriginalRequestedCollectionDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Obligation Obligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::RSET</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which a trade must be executed. For a direct debit, it is the date and time at which the creditor requests that the amount of money is to be collected from the debtor. For a credit transfer, it is the date and time at which the debtor requests the clearing agent to process the payment. For a securities trade, it is the date and time at which the securities are to be delivered or received."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Obligation, ISODateTime> mmRequestedSettlementDate = new MMBusinessAttribute<Obligation, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(InterestPaymentDateRange2.mmDueDate, DirectDebitTransactionInformation21.mmRequestedCollectionDate, OriginalPaymentInformation7.mmRequestedCollectionDate,
					OriginalTransactionReference26.mmRequestedExecutionDate, RequestedModification7.mmRequestedExecutionDate, RequestedModification7.mmRequestedCollectionDate, TransactionDates3.mmTradeActivityContractualSettlementDate,
					OriginalTransactionReference27.mmRequestedCollectionDate, OriginalTransactionReference27.mmRequestedExecutionDate, PaymentTransaction84.mmOriginalRequestedExecutionDate,
					PaymentTransaction84.mmOriginalRequestedCollectionDate, UnderlyingPaymentInstruction4.mmRequestedCollectionDate, CorrectivePaymentInitiation3.mmRequestedCollectionDate,
					PaymentTransaction95.mmOriginalRequestedExecutionDate, PaymentTransaction95.mmOriginalRequestedCollectionDate);
			isDerived = false;
			elementContext_lazy = () -> Obligation.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::RSET"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RequestedSettlementDate";
			definition = "Date and time at which a trade must be executed. For a direct debit, it is the date and time at which the creditor requests that the amount of money is to be collected from the debtor. For a credit transfer, it is the date and time at which the debtor requests the clearing agent to process the payment. For a securities trade, it is the date and time at which the securities are to be delivered or received.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(Obligation obj) {
			return obj.getRequestedSettlementDate();
		}

		@Override
		public void setValue(Obligation obj, ISODateTime value) {
			obj.setRequestedSettlementDate(value);
		}
	};
	protected CurrencyAndAmount requestedSettlementAmount;
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
	 * {@linkplain com.tools20022.repository.entity.Obligation Obligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::SETT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total amount of money to be paid or received."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Obligation, CurrencyAndAmount> mmRequestedSettlementAmount = new MMBusinessAttribute<Obligation, CurrencyAndAmount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Obligation.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::SETT"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RequestedSettlementAmount";
			definition = "Total amount of money to be paid or received.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(Obligation obj) {
			return obj.getRequestedSettlementAmount();
		}

		@Override
		public void setValue(Obligation obj, CurrencyAndAmount value) {
			obj.setRequestedSettlementAmount(value);
		}
	};
	protected Max4AlphaNumericText priority;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max4AlphaNumericText
	 * Max4AlphaNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Obligation Obligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::PRIR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Priority"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the transaction is to be executed with a high priority."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Obligation, Max4AlphaNumericText> mmPriority = new MMBusinessAttribute<Obligation, Max4AlphaNumericText>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Obligation.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::PRIR"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Priority";
			definition = "Specifies whether the transaction is to be executed with a high priority.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max4AlphaNumericText.mmObject();
		}

		@Override
		public Max4AlphaNumericText getValue(Obligation obj) {
			return obj.getPriority();
		}

		@Override
		public void setValue(Obligation obj, Max4AlphaNumericText value) {
			obj.setPriority(value);
		}
	};
	protected Trade trade;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmObligation
	 * Trade.mmObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Trade Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Obligation Obligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Trade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the trade which originates the obligation to deliver a product, cash or securities.."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Obligation, Trade> mmTrade = new MMBusinessAssociationEnd<Obligation, Trade>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Obligation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Trade";
			definition = "Specifies the trade which originates the obligation to deliver a product, cash or securities..";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Trade.mmObligation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Trade.mmObject();
		}

		@Override
		public Trade getValue(Obligation obj) {
			return obj.getTrade();
		}

		@Override
		public void setValue(Obligation obj, Trade value) {
			obj.setTrade(value);
		}
	};
	protected TransactionRisk transactionRisk;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TransactionRisk#mmObligation
	 * TransactionRisk.mmObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TransactionRisk
	 * TransactionRisk}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Obligation Obligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionRisk"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction risk calculated per obligation type."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Obligation, TransactionRisk> mmTransactionRisk = new MMBusinessAssociationEnd<Obligation, TransactionRisk>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Obligation.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionRisk";
			definition = "Transaction risk calculated per obligation type.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> TransactionRisk.mmObligation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> TransactionRisk.mmObject();
		}

		@Override
		public TransactionRisk getValue(Obligation obj) {
			return obj.getTransactionRisk();
		}

		@Override
		public void setValue(Obligation obj, TransactionRisk value) {
			obj.setTransactionRisk(value);
		}
	};
	protected Obligation parentObligation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Obligation#mmSubObligation
	 * Obligation.mmSubObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Obligation
	 * Obligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Obligation Obligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParentObligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Obligation which is divided into several sub-obligations."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Obligation, Obligation> mmParentObligation = new MMBusinessAssociationEnd<Obligation, Obligation>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Obligation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ParentObligation";
			definition = "Obligation which is divided into several sub-obligations.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Obligation.mmSubObligation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Obligation.mmObject();
		}

		@Override
		public Obligation getValue(Obligation obj) {
			return obj.getParentObligation();
		}

		@Override
		public void setValue(Obligation obj, Obligation value) {
			obj.setParentObligation(value);
		}
	};
	protected List<Obligation> subObligation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Obligation#mmParentObligation
	 * Obligation.mmParentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Obligation
	 * Obligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Obligation Obligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubObligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies an obligation resulting from another existing obligation, for instance each leg of a financing agreement is a sub-obligation of the global financing obligation."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Obligation, List<Obligation>> mmSubObligation = new MMBusinessAssociationEnd<Obligation, List<Obligation>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Obligation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SubObligation";
			definition = "Specifies an obligation resulting from another existing obligation, for instance each leg of a financing agreement is a sub-obligation of the global financing obligation.";
			minOccurs = 0;
			opposite_lazy = () -> Obligation.mmParentObligation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Obligation.mmObject();
		}

		@Override
		public List<Obligation> getValue(Obligation obj) {
			return obj.getSubObligation();
		}

		@Override
		public void setValue(Obligation obj, List<Obligation> value) {
			obj.setSubObligation(value);
		}
	};
	protected ObligationFulfilment offset;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ObligationFulfilment#mmObligationOffset
	 * ObligationFulfilment.mmObligationOffset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.ObligationFulfilment
	 * ObligationFulfilment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Obligation Obligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Offset"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the method used to settle a specific obligation."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Obligation, Optional<ObligationFulfilment>> mmOffset = new MMBusinessAssociationEnd<Obligation, Optional<ObligationFulfilment>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Obligation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Offset";
			definition = "Specifies the method used to settle a specific obligation.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> ObligationFulfilment.mmObligationOffset;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ObligationFulfilment.mmObject();
		}

		@Override
		public Optional<ObligationFulfilment> getValue(Obligation obj) {
			return obj.getOffset();
		}

		@Override
		public void setValue(Obligation obj, Optional<ObligationFulfilment> value) {
			obj.setOffset(value.orElse(null));
		}
	};
	protected ObligationFulfilment originalObligationProcess;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ObligationFulfilment#mmResultingObligation
	 * ObligationFulfilment.mmResultingObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.ObligationFulfilment
	 * ObligationFulfilment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Obligation Obligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalObligationProcess"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Obligation fulfilment process which did not extinguish the obligation but replaced it by a new one, for instance in case of netting."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Obligation, ObligationFulfilment> mmOriginalObligationProcess = new MMBusinessAssociationEnd<Obligation, ObligationFulfilment>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Obligation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OriginalObligationProcess";
			definition = "Obligation fulfilment process which did not extinguish the obligation but replaced it by a new one, for instance in case of netting.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> ObligationFulfilment.mmResultingObligation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ObligationFulfilment.mmObject();
		}

		@Override
		public ObligationFulfilment getValue(Obligation obj) {
			return obj.getOriginalObligationProcess();
		}

		@Override
		public void setValue(Obligation obj, ObligationFulfilment value) {
			obj.setOriginalObligationProcess(value);
		}
	};
	protected ExposureTypeV2Code exposureType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureTypeV2Code
	 * ExposureTypeV2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Obligation Obligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExposureType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of exposure related to this obligation."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Obligation, ExposureTypeV2Code> mmExposureType = new MMBusinessAttribute<Obligation, ExposureTypeV2Code>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Obligation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExposureType";
			definition = "Type of exposure related to this obligation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExposureTypeV2Code.mmObject();
		}

		@Override
		public ExposureTypeV2Code getValue(Obligation obj) {
			return obj.getExposureType();
		}

		@Override
		public void setValue(Obligation obj, ExposureTypeV2Code value) {
			obj.setExposureType(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Obligation";
				definition = "Specifies the assets (quantity of securities, goods, services, and cash amounts) that have to be delivered.";
				associationDomain_lazy = () -> Arrays.asList(Trade.mmObligation, Obligation.mmParentObligation, Obligation.mmSubObligation, ObligationFulfilment.mmObligationOffset, ObligationFulfilment.mmResultingObligation,
						TransactionRisk.mmObligation);
				subType_lazy = () -> Arrays.asList(PaymentObligation.mmObject(), SecuritiesDeliveryObligation.mmObject(), ProductDeliveryObligation.mmObject());
				element_lazy = () -> Arrays.asList(Obligation.mmRequestedSettlementDate, Obligation.mmRequestedSettlementAmount, Obligation.mmPriority, Obligation.mmTrade, Obligation.mmTransactionRisk, Obligation.mmParentObligation,
						Obligation.mmSubObligation, Obligation.mmOffset, Obligation.mmOriginalObligationProcess, Obligation.mmExposureType);
			}

			@Override
			public Class<?> getInstanceClass() {
				return Obligation.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ISODateTime getRequestedSettlementDate() {
		return requestedSettlementDate;
	}

	public Obligation setRequestedSettlementDate(ISODateTime requestedSettlementDate) {
		this.requestedSettlementDate = Objects.requireNonNull(requestedSettlementDate);
		return this;
	}

	public CurrencyAndAmount getRequestedSettlementAmount() {
		return requestedSettlementAmount;
	}

	public Obligation setRequestedSettlementAmount(CurrencyAndAmount requestedSettlementAmount) {
		this.requestedSettlementAmount = Objects.requireNonNull(requestedSettlementAmount);
		return this;
	}

	public Max4AlphaNumericText getPriority() {
		return priority;
	}

	public Obligation setPriority(Max4AlphaNumericText priority) {
		this.priority = Objects.requireNonNull(priority);
		return this;
	}

	public Trade getTrade() {
		return trade;
	}

	public Obligation setTrade(Trade trade) {
		this.trade = Objects.requireNonNull(trade);
		return this;
	}

	public TransactionRisk getTransactionRisk() {
		return transactionRisk;
	}

	public Obligation setTransactionRisk(TransactionRisk transactionRisk) {
		this.transactionRisk = Objects.requireNonNull(transactionRisk);
		return this;
	}

	public Obligation getParentObligation() {
		return parentObligation;
	}

	public Obligation setParentObligation(Obligation parentObligation) {
		this.parentObligation = Objects.requireNonNull(parentObligation);
		return this;
	}

	public List<Obligation> getSubObligation() {
		return subObligation == null ? subObligation = new ArrayList<>() : subObligation;
	}

	public Obligation setSubObligation(List<Obligation> subObligation) {
		this.subObligation = Objects.requireNonNull(subObligation);
		return this;
	}

	public Optional<ObligationFulfilment> getOffset() {
		return offset == null ? Optional.empty() : Optional.of(offset);
	}

	public Obligation setOffset(ObligationFulfilment offset) {
		this.offset = offset;
		return this;
	}

	public ObligationFulfilment getOriginalObligationProcess() {
		return originalObligationProcess;
	}

	public Obligation setOriginalObligationProcess(ObligationFulfilment originalObligationProcess) {
		this.originalObligationProcess = Objects.requireNonNull(originalObligationProcess);
		return this;
	}

	public ExposureTypeV2Code getExposureType() {
		return exposureType;
	}

	public Obligation setExposureType(ExposureTypeV2Code exposureType) {
		this.exposureType = Objects.requireNonNull(exposureType);
		return this;
	}
}