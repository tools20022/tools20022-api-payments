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
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Transaction executed by the client of a financial institution from/to the
 * account serviced by the financial institution, such as mortgage payment.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="BankingTransaction" src="doc-files/BankingTransaction.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BankingTransaction#mmPaymentObligation
 * BankingTransaction.mmPaymentObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BankingTransaction#mmFinancialTransaction
 * BankingTransaction.mmFinancialTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BankingTransaction#mmCashDelivery
 * BankingTransaction.mmCashDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BankingTransaction#mmCashDeposit
 * BankingTransaction.mmCashDeposit}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmBankingTransaction
 * PaymentObligation.mmBankingTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashDeposit#mmRelatedBankingTransaction
 * CashDeposit.mmRelatedBankingTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashDelivery#mmRelatedBankingTransaction
 * CashDelivery.mmRelatedBankingTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FinancialTransaction#mmBankingTransaction
 * FinancialTransaction.mmBankingTransaction}</li>
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
 * "BankingTransaction"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Transaction executed by the client of a financial institution from/to the account serviced by the financial institution, such as mortgage payment."
 * </li>
 * </ul>
 */
public class BankingTransaction {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected PaymentObligation paymentObligation;
	/**
	 * Payment obligation resulting from a banking transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmBankingTransaction
	 * PaymentObligation.mmBankingTransaction}</li>
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
	 * {@linkplain com.tools20022.repository.entity.BankingTransaction
	 * BankingTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentObligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment obligation resulting from a banking transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPaymentObligation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BankingTransaction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentObligation";
			definition = "Payment obligation resulting from a banking transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmBankingTransaction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
		}
	};
	protected FinancialTransaction financialTransaction;
	/**
	 * Financial transaction to which the banking transaction is associated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.FinancialTransaction#mmBankingTransaction
	 * FinancialTransaction.mmBankingTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.FinancialTransaction
	 * FinancialTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BankingTransaction
	 * BankingTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial transaction to which the banking transaction is associated."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmFinancialTransaction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BankingTransaction.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialTransaction";
			definition = "Financial transaction to which the banking transaction is associated.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.FinancialTransaction.mmBankingTransaction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.FinancialTransaction.mmObject();
		}
	};
	protected CashDelivery cashDelivery;
	/**
	 * Specifies the cash which is delivered by a financial institution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashDelivery#mmRelatedBankingTransaction
	 * CashDelivery.mmRelatedBankingTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashDelivery
	 * CashDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BankingTransaction
	 * BankingTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDelivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the cash which is delivered by a financial institution."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCashDelivery = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BankingTransaction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashDelivery";
			definition = "Specifies the cash which is delivered by a financial institution.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CashDelivery.mmRelatedBankingTransaction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashDelivery.mmObject();
		}
	};
	protected CashDeposit cashDeposit;
	/**
	 * Specifies the cash which is received by a financial institution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashDeposit#mmRelatedBankingTransaction
	 * CashDeposit.mmRelatedBankingTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashDeposit
	 * CashDeposit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BankingTransaction
	 * BankingTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDeposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the cash which is received by a financial institution."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCashDeposit = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BankingTransaction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashDeposit";
			definition = "Specifies the cash which is received by a financial institution.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CashDeposit.mmRelatedBankingTransaction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashDeposit.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BankingTransaction";
				definition = "Transaction executed by the client of a financial institution from/to the account serviced by the financial institution, such as mortgage payment.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentObligation.mmBankingTransaction, com.tools20022.repository.entity.CashDeposit.mmRelatedBankingTransaction,
						com.tools20022.repository.entity.CashDelivery.mmRelatedBankingTransaction, com.tools20022.repository.entity.FinancialTransaction.mmBankingTransaction);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.BankingTransaction.mmPaymentObligation, com.tools20022.repository.entity.BankingTransaction.mmFinancialTransaction,
						com.tools20022.repository.entity.BankingTransaction.mmCashDelivery, com.tools20022.repository.entity.BankingTransaction.mmCashDeposit);
			}

			@Override
			public Class<?> getInstanceClass() {
				return BankingTransaction.class;
			}
		});
		return mmObject_lazy.get();
	}

	public PaymentObligation getPaymentObligation() {
		return paymentObligation;
	}

	public void setPaymentObligation(com.tools20022.repository.entity.PaymentObligation paymentObligation) {
		this.paymentObligation = paymentObligation;
	}

	public FinancialTransaction getFinancialTransaction() {
		return financialTransaction;
	}

	public void setFinancialTransaction(com.tools20022.repository.entity.FinancialTransaction financialTransaction) {
		this.financialTransaction = financialTransaction;
	}

	public CashDelivery getCashDelivery() {
		return cashDelivery;
	}

	public void setCashDelivery(com.tools20022.repository.entity.CashDelivery cashDelivery) {
		this.cashDelivery = cashDelivery;
	}

	public CashDeposit getCashDeposit() {
		return cashDeposit;
	}

	public void setCashDeposit(com.tools20022.repository.entity.CashDeposit cashDeposit) {
		this.cashDeposit = cashDeposit;
	}
}