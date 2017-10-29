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
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.ExposureTypeV2Code;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max4AlphaNumericText;
import java.util.Arrays;
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
 * {@linkplain com.tools20022.repository.entity.Obligation#RequestedSettlementDate
 * Obligation.RequestedSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Obligation#RequestedSettlementAmount
 * Obligation.RequestedSettlementAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Obligation#Priority
 * Obligation.Priority}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Obligation#Trade
 * Obligation.Trade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Obligation#TransactionRisk
 * Obligation.TransactionRisk}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Obligation#ParentObligation
 * Obligation.ParentObligation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Obligation#SubObligation
 * Obligation.SubObligation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Obligation#Offset
 * Obligation.Offset}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Obligation#OriginalObligationProcess
 * Obligation.OriginalObligationProcess}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Obligation#ExposureType
 * Obligation.ExposureType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#Obligation
 * Trade.Obligation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Obligation#ParentObligation
 * Obligation.ParentObligation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Obligation#SubObligation
 * Obligation.SubObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ObligationFulfilment#ObligationOffset
 * ObligationFulfilment.ObligationOffset}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ObligationFulfilment#ResultingObligation
 * ObligationFulfilment.ResultingObligation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TransactionRisk#Obligation
 * TransactionRisk.Obligation}</li>
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
	/**
	 * Date and time at which a trade must be executed. For a direct debit, it
	 * is the date and time at which the creditor requests that the amount of
	 * money is to be collected from the debtor. For a credit transfer, it is
	 * the date and time at which the debtor requests the clearing agent to
	 * process the payment. For a securities trade, it is the date and time at
	 * which the securities are to be delivered or received.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.TransactionDates2#TradeActivityContractualSettlementDate
	 * TransactionDates2.TradeActivityContractualSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestPaymentDateRange2#DueDate
	 * InterestPaymentDateRange2.DueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#RequestedCollectionDate
	 * DirectDebitTransactionInformation21.RequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification6#RequestedExecutionDate
	 * RequestedModification6.RequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification6#RequestedCollectionDate
	 * RequestedModification6.RequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction78#OriginalRequestedExecutionDate
	 * PaymentTransaction78.OriginalRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction78#OriginalRequestedCollectionDate
	 * PaymentTransaction78.OriginalRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference24#RequestedCollectionDate
	 * OriginalTransactionReference24.RequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference24#RequestedExecutionDate
	 * OriginalTransactionReference24.RequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction74#OriginalRequestedExecutionDate
	 * PaymentTransaction74.OriginalRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction74#OriginalRequestedCollectionDate
	 * PaymentTransaction74.OriginalRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation7#RequestedCollectionDate
	 * OriginalPaymentInformation7.RequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference26#RequestedExecutionDate
	 * OriginalTransactionReference26.RequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInitiation2#RequestedCollectionDate
	 * CorrectivePaymentInitiation2.RequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction3#RequestedCollectionDate
	 * UnderlyingPaymentInstruction3.RequestedCollectionDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Obligation Obligation}</li>
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
	public static final MMBusinessAttribute RequestedSettlementDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionDates2.TradeActivityContractualSettlementDate, com.tools20022.repository.msg.InterestPaymentDateRange2.DueDate,
					com.tools20022.repository.msg.DirectDebitTransactionInformation21.RequestedCollectionDate, com.tools20022.repository.msg.RequestedModification6.RequestedExecutionDate,
					com.tools20022.repository.msg.RequestedModification6.RequestedCollectionDate, com.tools20022.repository.msg.PaymentTransaction78.OriginalRequestedExecutionDate,
					com.tools20022.repository.msg.PaymentTransaction78.OriginalRequestedCollectionDate, com.tools20022.repository.msg.OriginalTransactionReference24.RequestedCollectionDate,
					com.tools20022.repository.msg.OriginalTransactionReference24.RequestedExecutionDate, com.tools20022.repository.msg.PaymentTransaction74.OriginalRequestedExecutionDate,
					com.tools20022.repository.msg.PaymentTransaction74.OriginalRequestedCollectionDate, com.tools20022.repository.msg.OriginalPaymentInformation7.RequestedCollectionDate,
					com.tools20022.repository.msg.OriginalTransactionReference26.RequestedExecutionDate, com.tools20022.repository.msg.CorrectivePaymentInitiation2.RequestedCollectionDate,
					com.tools20022.repository.msg.UnderlyingPaymentInstruction3.RequestedCollectionDate);
			elementContext_lazy = () -> Obligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RequestedSettlementDate";
			definition = "Date and time at which a trade must be executed. For a direct debit, it is the date and time at which the creditor requests that the amount of money is to be collected from the debtor. For a credit transfer, it is the date and time at which the debtor requests the clearing agent to process the payment. For a securities trade, it is the date and time at which the securities are to be delivered or received.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Total amount of money to be paid or received.
	 * <p>
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
	public static final MMBusinessAttribute RequestedSettlementAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Obligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RequestedSettlementAmount";
			definition = "Total amount of money to be paid or received.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies whether the transaction is to be executed with a high priority.
	 * <p>
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
	public static final MMBusinessAttribute Priority = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Obligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Priority";
			definition = "Specifies whether the transaction is to be executed with a high priority.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max4AlphaNumericText.mmObject();
		}
	};
	/**
	 * Specifies the trade which originates the obligation to deliver a product,
	 * cash or securities..
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Trade#Obligation
	 * Trade.Obligation}</li>
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
	public static final MMBusinessAssociationEnd Trade = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Obligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Trade";
			definition = "Specifies the trade which originates the obligation to deliver a product, cash or securities..";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Trade.Obligation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Transaction risk calculated per obligation type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TransactionRisk#Obligation
	 * TransactionRisk.Obligation}</li>
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
	public static final MMBusinessAssociationEnd TransactionRisk = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Obligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionRisk";
			definition = "Transaction risk calculated per obligation type.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.TransactionRisk.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TransactionRisk.Obligation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Obligation which is divided into several sub-obligations.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Obligation#SubObligation
	 * Obligation.SubObligation}</li>
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
	public static final MMBusinessAssociationEnd ParentObligation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Obligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ParentObligation";
			definition = "Obligation which is divided into several sub-obligations.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Obligation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Obligation.SubObligation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies an obligation resulting from another existing obligation, for
	 * instance each leg of a financing agreement is a sub-obligation of the
	 * global financing obligation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Obligation#ParentObligation
	 * Obligation.ParentObligation}</li>
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
	public static final MMBusinessAssociationEnd SubObligation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Obligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SubObligation";
			definition = "Specifies an obligation resulting from another existing obligation, for instance each leg of a financing agreement is a sub-obligation of the global financing obligation.";
			minOccurs = 0;
			type_lazy = () -> Obligation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Obligation.ParentObligation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the method used to settle a specific obligation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ObligationFulfilment#ObligationOffset
	 * ObligationFulfilment.ObligationOffset}</li>
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
	public static final MMBusinessAssociationEnd Offset = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Obligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Offset";
			definition = "Specifies the method used to settle a specific obligation.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> ObligationFulfilment.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ObligationFulfilment.ObligationOffset;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Obligation fulfilment process which did not extinguish the obligation but
	 * replaced it by a new one, for instance in case of netting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ObligationFulfilment#ResultingObligation
	 * ObligationFulfilment.ResultingObligation}</li>
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
	public static final MMBusinessAssociationEnd OriginalObligationProcess = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Obligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OriginalObligationProcess";
			definition = "Obligation fulfilment process which did not extinguish the obligation but replaced it by a new one, for instance in case of netting.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> ObligationFulfilment.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ObligationFulfilment.ResultingObligation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Type of exposure related to this obligation.
	 * <p>
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
	public static final MMBusinessAttribute ExposureType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Obligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExposureType";
			definition = "Type of exposure related to this obligation.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ExposureTypeV2Code.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Obligation";
				definition = "Specifies the assets (quantity of securities, goods, services, and cash amounts) that have to be delivered.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Trade.Obligation, com.tools20022.repository.entity.Obligation.ParentObligation, com.tools20022.repository.entity.Obligation.SubObligation,
						com.tools20022.repository.entity.ObligationFulfilment.ObligationOffset, com.tools20022.repository.entity.ObligationFulfilment.ResultingObligation, com.tools20022.repository.entity.TransactionRisk.Obligation);
				subType_lazy = () -> Arrays.asList(PaymentObligation.mmObject(), SecuritiesDeliveryObligation.mmObject(), ProductDeliveryObligation.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Obligation.RequestedSettlementDate, com.tools20022.repository.entity.Obligation.RequestedSettlementAmount,
						com.tools20022.repository.entity.Obligation.Priority, com.tools20022.repository.entity.Obligation.Trade, com.tools20022.repository.entity.Obligation.TransactionRisk,
						com.tools20022.repository.entity.Obligation.ParentObligation, com.tools20022.repository.entity.Obligation.SubObligation, com.tools20022.repository.entity.Obligation.Offset,
						com.tools20022.repository.entity.Obligation.OriginalObligationProcess, com.tools20022.repository.entity.Obligation.ExposureType);
			}
		});
		return mmObject_lazy.get();
	}
}