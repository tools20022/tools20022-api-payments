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
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides statistical information on the number of movements and their value
 * for a particular account.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="AccountReportedMovement"
 * src="doc-files/AccountReportedMovement.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountReportedMovement#MonthlyPaymentValue
 * AccountReportedMovement.MonthlyPaymentValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountReportedMovement#MonthlyReceivedValue
 * AccountReportedMovement.MonthlyReceivedValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountReportedMovement#MonthlyTransactionNumber
 * AccountReportedMovement.MonthlyTransactionNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountReportedMovement#AverageBalance
 * AccountReportedMovement.AverageBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountReportedMovement#ReportedCashAccount
 * AccountReportedMovement.ReportedCashAccount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#ReportedMovements
 * CashAccount.ReportedMovements}</li>
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
 * "AccountReportedMovement"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides statistical information on the number of movements and their value for a particular account."
 * </li>
 * </ul>
 */
public class AccountReportedMovement {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Monthly average of the payment amounts (that is, payments going out) over
	 * a year.
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
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount5#MonthlyPaymentValue
	 * CustomerAccount5.MonthlyPaymentValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1#MonthlyPaymentValue
	 * CustomerAccountModification1.MonthlyPaymentValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount4#MonthlyPaymentValue
	 * CustomerAccount4.MonthlyPaymentValue}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountReportedMovement
	 * AccountReportedMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MonthlyPaymentValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Monthly average of the payment amounts (that is, payments going out) over a year."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MonthlyPaymentValue = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CustomerAccount5.MonthlyPaymentValue, com.tools20022.repository.msg.CustomerAccountModification1.MonthlyPaymentValue,
					com.tools20022.repository.msg.CustomerAccount4.MonthlyPaymentValue);
			elementContext_lazy = () -> AccountReportedMovement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MonthlyPaymentValue";
			definition = "Monthly average of the payment amounts (that is, payments going out) over a year.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Monthly average of the received amounts over a year (that is, payments
	 * coming in).
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
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount5#MonthlyReceivedValue
	 * CustomerAccount5.MonthlyReceivedValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1#MonthlyReceivedValue
	 * CustomerAccountModification1.MonthlyReceivedValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount4#MonthlyReceivedValue
	 * CustomerAccount4.MonthlyReceivedValue}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountReportedMovement
	 * AccountReportedMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MonthlyReceivedValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Monthly average of the received amounts over a year (that is, payments coming in)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MonthlyReceivedValue = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CustomerAccount5.MonthlyReceivedValue, com.tools20022.repository.msg.CustomerAccountModification1.MonthlyReceivedValue,
					com.tools20022.repository.msg.CustomerAccount4.MonthlyReceivedValue);
			elementContext_lazy = () -> AccountReportedMovement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MonthlyReceivedValue";
			definition = "Monthly average of the received amounts over a year (that is, payments coming in).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Monthly average of the number of payments (coming in and going out) over
	 * a year.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount5#MonthlyTransactionNumber
	 * CustomerAccount5.MonthlyTransactionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1#MonthlyTransactionNumber
	 * CustomerAccountModification1.MonthlyTransactionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount4#MonthlyTransactionNumber
	 * CustomerAccount4.MonthlyTransactionNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountReportedMovement
	 * AccountReportedMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MonthlyTransactionNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Monthly average of the number of payments (coming in and going out) over a year."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MonthlyTransactionNumber = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CustomerAccount5.MonthlyTransactionNumber, com.tools20022.repository.msg.CustomerAccountModification1.MonthlyTransactionNumber,
					com.tools20022.repository.msg.CustomerAccount4.MonthlyTransactionNumber);
			elementContext_lazy = () -> AccountReportedMovement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MonthlyTransactionNumber";
			definition = "Monthly average of the number of payments (coming in and going out) over a year.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Sum of the end of day balances over a month divided by the number of
	 * business days in the month.
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
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount5#AverageBalance
	 * CustomerAccount5.AverageBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1#AverageBalance
	 * CustomerAccountModification1.AverageBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount4#AverageBalance
	 * CustomerAccount4.AverageBalance}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountReportedMovement
	 * AccountReportedMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AverageBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sum of the end of day balances over a month divided by the number of business days in the month."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AverageBalance = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CustomerAccount5.AverageBalance, com.tools20022.repository.msg.CustomerAccountModification1.AverageBalance,
					com.tools20022.repository.msg.CustomerAccount4.AverageBalance);
			elementContext_lazy = () -> AccountReportedMovement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AverageBalance";
			definition = "Sum of the end of day balances over a month divided by the number of business days in the month.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Cash account for which reported movements are calculated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#ReportedMovements
	 * CashAccount.ReportedMovements}</li>
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
	 * {@linkplain com.tools20022.repository.entity.AccountReportedMovement
	 * AccountReportedMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportedCashAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash account for which reported movements are calculated."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ReportedCashAccount = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> AccountReportedMovement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReportedCashAccount";
			definition = "Cash account for which reported movements are calculated.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CashAccount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.ReportedMovements;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AccountReportedMovement";
				definition = "Provides statistical information on the number of movements and their value for a particular account.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccount.ReportedMovements);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AccountReportedMovement.MonthlyPaymentValue, com.tools20022.repository.entity.AccountReportedMovement.MonthlyReceivedValue,
						com.tools20022.repository.entity.AccountReportedMovement.MonthlyTransactionNumber, com.tools20022.repository.entity.AccountReportedMovement.AverageBalance,
						com.tools20022.repository.entity.AccountReportedMovement.ReportedCashAccount);
			}
		});
		return mmObject_lazy.get();
	}
}