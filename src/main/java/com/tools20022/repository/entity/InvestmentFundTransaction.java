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
import com.tools20022.repository.codeset.DebitCreditCode;
import com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.SecuritiesTrade;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Process of buying, selling, switching or transferring fund units.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="InvestmentFundTransaction"
 * src="doc-files/InvestmentFundTransaction.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#InvestmentFundOrder
 * InvestmentFundTransaction.InvestmentFundOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#ClientReference
 * InvestmentFundTransaction.ClientReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#Type
 * InvestmentFundTransaction.Type}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#TransactionCharge
 * InvestmentFundTransaction.TransactionCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#InvestmentAccount
 * InvestmentFundTransaction.InvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#InvestmentFundClass
 * InvestmentFundTransaction.InvestmentFundClass}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#TransactionTax
 * InvestmentFundTransaction.TransactionTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#CreditDebitIndicator
 * InvestmentFundTransaction.CreditDebitIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#InvestmentFundOrderExecution
 * InvestmentFundTransaction.InvestmentFundOrderExecution}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#InvestmentFundTransaction
 * InvestmentFundClass.InvestmentFundTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#InvestmentFundTransaction
 * InvestmentAccount.InvestmentFundTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax#Transaction
 * InvestmentFundTax.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#RelatedTransaction
 * InvestmentFundOrder.RelatedTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#InvestmentFundTransaction
 * InvestmentFundOrderExecution.InvestmentFundTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Charges#InvestmentFundTransaction
 * Charges.InvestmentFundTransaction}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.SecuritiesTrade
 * SecuritiesTrade}</li>
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
 * "InvestmentFundTransaction"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Process of buying, selling, switching or transferring fund units."</li>
 * </ul>
 */
public class InvestmentFundTransaction extends SecuritiesTrade {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * An investor's instruction to either subscribe or redeem an amount of
	 * money or its equivalent, eg, other assets, into or out of an investment
	 * fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#RelatedTransaction
	 * InvestmentFundOrder.RelatedTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction
	 * InvestmentFundTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentFundOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An investor's instruction to either subscribe or redeem an amount of money or its equivalent, eg, other assets, into or out of an investment fund."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd InvestmentFundOrder = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentFundTransaction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundOrder";
			definition = "An investor's instruction to either subscribe or redeem an amount of money or its equivalent, eg, other assets, into or out of an investment fund.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.RelatedTransaction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Unique and unambiguous investor's identification of an order assigned by
	 * a client.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction
	 * InvestmentFundTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClientReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous investor's identification of an order assigned by a client."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ClientReference = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFundTransaction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClientReference";
			definition = "Unique and unambiguous investor's identification of an order assigned by a client.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Type of investment fund transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode
	 * InvestmentFundTransactionTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction
	 * InvestmentFundTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of investment fund transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFundTransaction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Type of investment fund transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> InvestmentFundTransactionTypeCode.mmObject();
		}
	};
	/**
	 * Charge for the placement of an order and/or for its execution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Charges#InvestmentFundTransaction
	 * Charges.InvestmentFundTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Charges Charges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction
	 * InvestmentFundTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionCharge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Charge for the placement of an order and/or for its execution."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TransactionCharge = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentFundTransaction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransactionCharge";
			definition = "Charge for the placement of an order and/or for its execution.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Charges.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Charges.InvestmentFundTransaction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Account related to an investment fund transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#InvestmentFundTransaction
	 * InvestmentAccount.InvestmentFundTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction
	 * InvestmentFundTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account related to an investment fund transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd InvestmentAccount = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentFundTransaction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentAccount";
			definition = "Account related to an investment fund transaction.";
			minOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.InvestmentFundTransaction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Investment fund class to which an investment fund order and its execution
	 * are related.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#InvestmentFundTransaction
	 * InvestmentFundClass.InvestmentFundTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction
	 * InvestmentFundTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentFundClass"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment fund class to which an investment fund order and its execution are related."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd InvestmentFundClass = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentFundTransaction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundClass";
			definition = "Investment fund class to which an investment fund order and its execution are related.";
			minOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.InvestmentFundTransaction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Tax applicable to an investment fund order and/or to its execution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax#Transaction
	 * InvestmentFundTax.Transaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentFundTax
	 * InvestmentFundTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction
	 * InvestmentFundTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Tax applicable to an investment fund order and/or to its execution."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TransactionTax = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentFundTransaction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransactionTax";
			definition = "Tax applicable to an investment fund order and/or to its execution.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> InvestmentFundTax.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundTax.Transaction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Direction of the transaction, ie, securities are received (credited) or
	 * delivered (debited).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DebitCreditCode
	 * DebitCreditCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction
	 * InvestmentFundTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Direction of the transaction, ie, securities are received (credited) or delivered (debited)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CreditDebitIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFundTransaction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Direction of the transaction, ie, securities are received (credited) or delivered (debited).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DebitCreditCode.mmObject();
		}
	};
	/**
	 * Creation/cancellation of investment units on the books of the fund or its
	 * designated agent, as a result of executing an investment fund order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#InvestmentFundTransaction
	 * InvestmentFundOrderExecution.InvestmentFundTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction
	 * InvestmentFundTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentFundOrderExecution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Creation/cancellation of investment units on the books of the fund or its designated agent, as a result of executing an investment fund order."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd InvestmentFundOrderExecution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentFundTransaction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundOrderExecution";
			definition = "Creation/cancellation of investment units on the books of the fund or its designated agent, as a result of executing an investment fund order.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.InvestmentFundTransaction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InvestmentFundTransaction";
				definition = "Process of buying, selling, switching or transferring fund units.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFundClass.InvestmentFundTransaction, com.tools20022.repository.entity.InvestmentAccount.InvestmentFundTransaction,
						com.tools20022.repository.entity.InvestmentFundTax.Transaction, com.tools20022.repository.entity.InvestmentFundOrder.RelatedTransaction,
						com.tools20022.repository.entity.InvestmentFundOrderExecution.InvestmentFundTransaction, com.tools20022.repository.entity.Charges.InvestmentFundTransaction);
				superType_lazy = () -> SecuritiesTrade.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFundTransaction.InvestmentFundOrder, com.tools20022.repository.entity.InvestmentFundTransaction.ClientReference,
						com.tools20022.repository.entity.InvestmentFundTransaction.Type, com.tools20022.repository.entity.InvestmentFundTransaction.TransactionCharge,
						com.tools20022.repository.entity.InvestmentFundTransaction.InvestmentAccount, com.tools20022.repository.entity.InvestmentFundTransaction.InvestmentFundClass,
						com.tools20022.repository.entity.InvestmentFundTransaction.TransactionTax, com.tools20022.repository.entity.InvestmentFundTransaction.CreditDebitIndicator,
						com.tools20022.repository.entity.InvestmentFundTransaction.InvestmentFundOrderExecution);
			}
		});
		return mmObject_lazy.get();
	}
}