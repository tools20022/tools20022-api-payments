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

import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.entity.Asset;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CashCollateral5;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Currency (banknotes and coins) and demand deposits or 'bank money' (the
 * balance held in checking accounts and savings accounts).
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Money" src="doc-files/Money.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Asset Asset}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Money#mmCashAmount
 * Money.mmCashAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Deposit Deposit}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CashCollateral5
 * CashCollateral5}</li>
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
 * "Money"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Currency (banknotes and coins) and demand deposits or 'bank money' (the balance held in checking accounts and savings accounts)."
 * </li>
 * </ul>
 */
public class Money extends Asset {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CurrencyAndAmount cashAmount;
	/**
	 * Value of the asset specified as a currency and an amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral5#mmDepositAmount
	 * CashCollateral5.mmDepositAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Money
	 * Money}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value of the asset specified as a currency and an amount."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCashAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CashCollateral5.mmDepositAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Money.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashAmount";
			definition = "Value of the asset specified as a currency and an amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Money.class.getMethod("getCashAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Money";
				definition = "Currency (banknotes and coins) and demand deposits or 'bank money' (the balance held in checking accounts and savings accounts).";
				subType_lazy = () -> Arrays.asList(Deposit.mmObject());
				superType_lazy = () -> Asset.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Money.mmCashAmount);
				derivationComponent_lazy = () -> Arrays.asList(CashCollateral5.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Money.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyAndAmount getCashAmount() {
		return cashAmount;
	}

	public void setCashAmount(CurrencyAndAmount cashAmount) {
		this.cashAmount = cashAmount;
	}
}