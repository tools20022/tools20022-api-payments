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
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.entity.CreditInstrument;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Amount of money representing a value paid by an agent bank to a creditor.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CashDelivery" src="doc-files/CashDelivery.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.CreditInstrument
 * CreditInstrument}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CashDelivery#mmCashAmount
 * CashDelivery.mmCashAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashDelivery#mmRelatedBankingTransaction
 * CashDelivery.mmRelatedBankingTransaction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BankingTransaction#mmCashDelivery
 * BankingTransaction.mmCashDelivery}</li>
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
 * "CashDelivery"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Amount of money representing a value paid by an agent bank to a creditor."</li>
 * </ul>
 */
public class CashDelivery extends CreditInstrument {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ActiveCurrencyAndAmount cashAmount;
	/**
	 * Amount of money to be physically delivered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashDelivery CashDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money to be physically delivered."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCashAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashDelivery.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashAmount";
			definition = "Amount of money to be physically delivered.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CashDelivery.class.getMethod("getCashAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected BankingTransaction relatedBankingTransaction;
	/**
	 * Describes the type of transaction associated with a cash delivery.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BankingTransaction#mmCashDelivery
	 * BankingTransaction.mmCashDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BankingTransaction
	 * BankingTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashDelivery CashDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedBankingTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Describes the type of transaction associated with a cash delivery."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedBankingTransaction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashDelivery.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedBankingTransaction";
			definition = "Describes the type of transaction associated with a cash delivery.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.BankingTransaction.mmCashDelivery;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BankingTransaction.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CashDelivery";
				definition = "Amount of money representing a value paid by an agent bank to a creditor.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.BankingTransaction.mmCashDelivery);
				superType_lazy = () -> CreditInstrument.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashDelivery.mmCashAmount, com.tools20022.repository.entity.CashDelivery.mmRelatedBankingTransaction);
			}

			@Override
			public Class<?> getInstanceClass() {
				return CashDelivery.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ActiveCurrencyAndAmount getCashAmount() {
		return cashAmount;
	}

	public void setCashAmount(ActiveCurrencyAndAmount cashAmount) {
		this.cashAmount = cashAmount;
	}

	public BankingTransaction getRelatedBankingTransaction() {
		return relatedBankingTransaction;
	}

	public void setRelatedBankingTransaction(com.tools20022.repository.entity.BankingTransaction relatedBankingTransaction) {
		this.relatedBankingTransaction = relatedBankingTransaction;
	}
}