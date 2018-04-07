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
import com.tools20022.repository.entity.CashDelivery;
import com.tools20022.repository.entity.CashDeposit;
import com.tools20022.repository.entity.FinancialTransaction;
import com.tools20022.repository.entity.PaymentObligation;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<BankingTransaction, PaymentObligation> mmPaymentObligation = new MMBusinessAssociationEnd<BankingTransaction, PaymentObligation>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BankingTransaction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentObligation";
			definition = "Payment obligation resulting from a banking transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> PaymentObligation.mmBankingTransaction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PaymentObligation.mmObject();
		}

		@Override
		public PaymentObligation getValue(BankingTransaction obj) {
			return obj.getPaymentObligation();
		}

		@Override
		public void setValue(BankingTransaction obj, PaymentObligation value) {
			obj.setPaymentObligation(value);
		}
	};
	protected FinancialTransaction financialTransaction;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<BankingTransaction, FinancialTransaction> mmFinancialTransaction = new MMBusinessAssociationEnd<BankingTransaction, FinancialTransaction>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BankingTransaction.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialTransaction";
			definition = "Financial transaction to which the banking transaction is associated.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> FinancialTransaction.mmBankingTransaction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> FinancialTransaction.mmObject();
		}

		@Override
		public FinancialTransaction getValue(BankingTransaction obj) {
			return obj.getFinancialTransaction();
		}

		@Override
		public void setValue(BankingTransaction obj, FinancialTransaction value) {
			obj.setFinancialTransaction(value);
		}
	};
	protected CashDelivery cashDelivery;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<BankingTransaction, CashDelivery> mmCashDelivery = new MMBusinessAssociationEnd<BankingTransaction, CashDelivery>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BankingTransaction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashDelivery";
			definition = "Specifies the cash which is delivered by a financial institution.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> CashDelivery.mmRelatedBankingTransaction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CashDelivery.mmObject();
		}

		@Override
		public CashDelivery getValue(BankingTransaction obj) {
			return obj.getCashDelivery();
		}

		@Override
		public void setValue(BankingTransaction obj, CashDelivery value) {
			obj.setCashDelivery(value);
		}
	};
	protected CashDeposit cashDeposit;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<BankingTransaction, CashDeposit> mmCashDeposit = new MMBusinessAssociationEnd<BankingTransaction, CashDeposit>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BankingTransaction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashDeposit";
			definition = "Specifies the cash which is received by a financial institution.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> CashDeposit.mmRelatedBankingTransaction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CashDeposit.mmObject();
		}

		@Override
		public CashDeposit getValue(BankingTransaction obj) {
			return obj.getCashDeposit();
		}

		@Override
		public void setValue(BankingTransaction obj, CashDeposit value) {
			obj.setCashDeposit(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BankingTransaction";
				definition = "Transaction executed by the client of a financial institution from/to the account serviced by the financial institution, such as mortgage payment.";
				associationDomain_lazy = () -> Arrays.asList(PaymentObligation.mmBankingTransaction, CashDeposit.mmRelatedBankingTransaction, CashDelivery.mmRelatedBankingTransaction, FinancialTransaction.mmBankingTransaction);
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

	public BankingTransaction setPaymentObligation(PaymentObligation paymentObligation) {
		this.paymentObligation = Objects.requireNonNull(paymentObligation);
		return this;
	}

	public FinancialTransaction getFinancialTransaction() {
		return financialTransaction;
	}

	public BankingTransaction setFinancialTransaction(FinancialTransaction financialTransaction) {
		this.financialTransaction = Objects.requireNonNull(financialTransaction);
		return this;
	}

	public CashDelivery getCashDelivery() {
		return cashDelivery;
	}

	public BankingTransaction setCashDelivery(CashDelivery cashDelivery) {
		this.cashDelivery = Objects.requireNonNull(cashDelivery);
		return this;
	}

	public CashDeposit getCashDeposit() {
		return cashDeposit;
	}

	public BankingTransaction setCashDeposit(CashDeposit cashDeposit) {
		this.cashDeposit = Objects.requireNonNull(cashDeposit);
		return this;
	}
}