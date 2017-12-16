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
import com.tools20022.repository.codeset.DebitCreditCode;
import com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.SecuritiesTrade;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.SecuritiesTrade
 * SecuritiesTrade}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmInvestmentFundOrder
 * InvestmentFundTransaction.mmInvestmentFundOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmClientReference
 * InvestmentFundTransaction.mmClientReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmType
 * InvestmentFundTransaction.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmTransactionCharge
 * InvestmentFundTransaction.mmTransactionCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmInvestmentAccount
 * InvestmentFundTransaction.mmInvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmInvestmentFundClass
 * InvestmentFundTransaction.mmInvestmentFundClass}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmTransactionTax
 * InvestmentFundTransaction.mmTransactionTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmCreditDebitIndicator
 * InvestmentFundTransaction.mmCreditDebitIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmInvestmentFundOrderExecution
 * InvestmentFundTransaction.mmInvestmentFundOrderExecution}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmInvestmentFundTransaction
 * InvestmentFundClass.mmInvestmentFundTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmInvestmentFundTransaction
 * InvestmentAccount.mmInvestmentFundTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax#mmTransaction
 * InvestmentFundTax.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmRelatedTransaction
 * InvestmentFundOrder.mmRelatedTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmInvestmentFundTransaction
 * InvestmentFundOrderExecution.mmInvestmentFundTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Charges#mmInvestmentFundTransaction
 * Charges.mmInvestmentFundTransaction}</li>
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
 * "InvestmentFundTransaction"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Process of buying, selling, switching or transferring fund units."</li>
 * </ul>
 */
public class InvestmentFundTransaction extends SecuritiesTrade {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.InvestmentFundOrder> investmentFundOrder;
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmRelatedTransaction
	 * InvestmentFundOrder.mmRelatedTransaction}</li>
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
	public static final MMBusinessAssociationEnd mmInvestmentFundOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundOrder";
			definition = "An investor's instruction to either subscribe or redeem an amount of money or its equivalent, eg, other assets, into or out of an investment fund.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmRelatedTransaction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
		}
	};
	protected Max35Text clientReference;
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
	public static final MMBusinessAttribute mmClientReference = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClientReference";
			definition = "Unique and unambiguous investor's identification of an order assigned by a client.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundTransaction.class.getMethod("getClientReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected InvestmentFundTransactionTypeCode type;
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
	public static final MMBusinessAttribute mmType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Type of investment fund transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InvestmentFundTransactionTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundTransaction.class.getMethod("getType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Charges transactionCharge;
	/**
	 * Charge for the placement of an order and/or for its execution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Charges#mmInvestmentFundTransaction
	 * Charges.mmInvestmentFundTransaction}</li>
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
	public static final MMBusinessAssociationEnd mmTransactionCharge = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransactionCharge";
			definition = "Charge for the placement of an order and/or for its execution.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Charges.mmInvestmentFundTransaction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Charges.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.InvestmentAccount> investmentAccount;
	/**
	 * Account related to an investment fund transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmInvestmentFundTransaction
	 * InvestmentAccount.mmInvestmentFundTransaction}</li>
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
	public static final MMBusinessAssociationEnd mmInvestmentAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentAccount";
			definition = "Account related to an investment fund transaction.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.mmInvestmentFundTransaction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.InvestmentFundClass> investmentFundClass;
	/**
	 * Investment fund class to which an investment fund order and its execution
	 * are related.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmInvestmentFundTransaction
	 * InvestmentFundClass.mmInvestmentFundTransaction}</li>
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
	public static final MMBusinessAssociationEnd mmInvestmentFundClass = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundClass";
			definition = "Investment fund class to which an investment fund order and its execution are related.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmInvestmentFundTransaction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
		}
	};
	protected InvestmentFundTax transactionTax;
	/**
	 * Tax applicable to an investment fund order and/or to its execution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax#mmTransaction
	 * InvestmentFundTax.mmTransaction}</li>
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
	public static final MMBusinessAssociationEnd mmTransactionTax = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransactionTax";
			definition = "Tax applicable to an investment fund order and/or to its execution.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundTax.mmTransaction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundTax.mmObject();
		}
	};
	protected DebitCreditCode creditDebitIndicator;
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
	public static final MMBusinessAttribute mmCreditDebitIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Direction of the transaction, ie, securities are received (credited) or delivered (debited).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DebitCreditCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundTransaction.class.getMethod("getCreditDebitIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.InvestmentFundOrderExecution> investmentFundOrderExecution;
	/**
	 * Creation/cancellation of investment units on the books of the fund or its
	 * designated agent, as a result of executing an investment fund order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmInvestmentFundTransaction
	 * InvestmentFundOrderExecution.mmInvestmentFundTransaction}</li>
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
	public static final MMBusinessAssociationEnd mmInvestmentFundOrderExecution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundOrderExecution";
			definition = "Creation/cancellation of investment units on the books of the fund or its designated agent, as a result of executing an investment fund order.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.mmInvestmentFundTransaction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvestmentFundTransaction";
				definition = "Process of buying, selling, switching or transferring fund units.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFundClass.mmInvestmentFundTransaction, com.tools20022.repository.entity.InvestmentAccount.mmInvestmentFundTransaction,
						com.tools20022.repository.entity.InvestmentFundTax.mmTransaction, com.tools20022.repository.entity.InvestmentFundOrder.mmRelatedTransaction,
						com.tools20022.repository.entity.InvestmentFundOrderExecution.mmInvestmentFundTransaction, com.tools20022.repository.entity.Charges.mmInvestmentFundTransaction);
				superType_lazy = () -> SecuritiesTrade.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFundTransaction.mmInvestmentFundOrder, com.tools20022.repository.entity.InvestmentFundTransaction.mmClientReference,
						com.tools20022.repository.entity.InvestmentFundTransaction.mmType, com.tools20022.repository.entity.InvestmentFundTransaction.mmTransactionCharge,
						com.tools20022.repository.entity.InvestmentFundTransaction.mmInvestmentAccount, com.tools20022.repository.entity.InvestmentFundTransaction.mmInvestmentFundClass,
						com.tools20022.repository.entity.InvestmentFundTransaction.mmTransactionTax, com.tools20022.repository.entity.InvestmentFundTransaction.mmCreditDebitIndicator,
						com.tools20022.repository.entity.InvestmentFundTransaction.mmInvestmentFundOrderExecution);
			}

			@Override
			public Class<?> getInstanceClass() {
				return InvestmentFundTransaction.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<InvestmentFundOrder> getInvestmentFundOrder() {
		return investmentFundOrder;
	}

	public void setInvestmentFundOrder(List<com.tools20022.repository.entity.InvestmentFundOrder> investmentFundOrder) {
		this.investmentFundOrder = investmentFundOrder;
	}

	public Max35Text getClientReference() {
		return clientReference;
	}

	public void setClientReference(Max35Text clientReference) {
		this.clientReference = clientReference;
	}

	public InvestmentFundTransactionTypeCode getType() {
		return type;
	}

	public void setType(InvestmentFundTransactionTypeCode type) {
		this.type = type;
	}

	public Charges getTransactionCharge() {
		return transactionCharge;
	}

	public void setTransactionCharge(com.tools20022.repository.entity.Charges transactionCharge) {
		this.transactionCharge = transactionCharge;
	}

	public List<InvestmentAccount> getInvestmentAccount() {
		return investmentAccount;
	}

	public void setInvestmentAccount(List<com.tools20022.repository.entity.InvestmentAccount> investmentAccount) {
		this.investmentAccount = investmentAccount;
	}

	public List<InvestmentFundClass> getInvestmentFundClass() {
		return investmentFundClass;
	}

	public void setInvestmentFundClass(List<com.tools20022.repository.entity.InvestmentFundClass> investmentFundClass) {
		this.investmentFundClass = investmentFundClass;
	}

	public InvestmentFundTax getTransactionTax() {
		return transactionTax;
	}

	public void setTransactionTax(com.tools20022.repository.entity.InvestmentFundTax transactionTax) {
		this.transactionTax = transactionTax;
	}

	public DebitCreditCode getCreditDebitIndicator() {
		return creditDebitIndicator;
	}

	public void setCreditDebitIndicator(DebitCreditCode creditDebitIndicator) {
		this.creditDebitIndicator = creditDebitIndicator;
	}

	public List<InvestmentFundOrderExecution> getInvestmentFundOrderExecution() {
		return investmentFundOrderExecution;
	}

	public void setInvestmentFundOrderExecution(List<com.tools20022.repository.entity.InvestmentFundOrderExecution> investmentFundOrderExecution) {
		this.investmentFundOrderExecution = investmentFundOrderExecution;
	}
}