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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the nature, or use, of the cash account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode#CashPayment
 * CashAccountTypeCode.CashPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode#Charges
 * CashAccountTypeCode.Charges}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode#Commission
 * CashAccountTypeCode.Commission}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CashAccountTypeCode#Tax
 * CashAccountTypeCode.Tax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode#CashIncome
 * CashAccountTypeCode.CashIncome}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode#CashTrading
 * CashAccountTypeCode.CashTrading}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode#Settlement
 * CashAccountTypeCode.Settlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode#Current
 * CashAccountTypeCode.Current}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode#Savings
 * CashAccountTypeCode.Savings}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode#OverNightDeposit
 * CashAccountTypeCode.OverNightDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode#MarginalLending
 * CashAccountTypeCode.MarginalLending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode#NonResidentExternal
 * CashAccountTypeCode.NonResidentExternal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode#MoneyMarket
 * CashAccountTypeCode.MoneyMarket}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CashAccountTypeCode#Loan
 * CashAccountTypeCode.Loan}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CashAccountTypeCode#Salary
 * CashAccountTypeCode.Salary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode#Overdraft
 * CashAccountTypeCode.Overdraft}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode#Lending
 * CashAccountTypeCode.Lending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode#Collateral
 * CashAccountTypeCode.Collateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode#FinancialSettlement
 * CashAccountTypeCode.FinancialSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode#MarginReturn
 * CashAccountTypeCode.MarginReturn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode#Segregated
 * CashAccountTypeCode.Segregated}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CASH"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CashAccountTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the nature, or  use, of the cash account."</li>
 * </ul>
 */
public class CashAccountTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Account used for the payment of cash.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode
	 * CashAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CASH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account used for the payment of cash."</li>
	 * </ul>
	 */
	public static final MMCode CashPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashPayment";
			definition = "Account used for the payment of cash.";
			owner_lazy = () -> CashAccountTypeCode.mmObject();
			codeName = "CASH";
		}
	};
	/**
	 * Account used for charges if different from the account for payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode
	 * CashAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CHAR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Charges"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account used for charges if different from the account for payment."</li>
	 * </ul>
	 */
	public static final MMCode Charges = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Charges";
			definition = "Account used for charges if different from the account for payment.";
			owner_lazy = () -> CashAccountTypeCode.mmObject();
			codeName = "CHAR";
		}
	};
	/**
	 * Account used for commission if different from the account for payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode
	 * CashAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COMM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Commission"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account used for commission if different from the account for payment."</li>
	 * </ul>
	 */
	public static final MMCode Commission = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Commission";
			definition = "Account used for commission if different from the account for payment.";
			owner_lazy = () -> CashAccountTypeCode.mmObject();
			codeName = "COMM";
		}
	};
	/**
	 * Account used for taxes if different from the account for payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode
	 * CashAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TAXE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account used for taxes if different from the account for payment."</li>
	 * </ul>
	 */
	public static final MMCode Tax = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Tax";
			definition = "Account used for taxes if different from the account for payment.";
			owner_lazy = () -> CashAccountTypeCode.mmObject();
			codeName = "TAXE";
		}
	};
	/**
	 * Account used for payment of income if different from the current cash
	 * account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode
	 * CashAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CISH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashIncome"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account used for payment of income if different from the current cash account."
	 * </li>
	 * </ul>
	 */
	public static final MMCode CashIncome = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashIncome";
			definition = "Account used for payment of income if different from the current cash account.";
			owner_lazy = () -> CashAccountTypeCode.mmObject();
			codeName = "CISH";
		}
	};
	/**
	 * Account used for trading if different from the current cash account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode
	 * CashAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRAS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashTrading"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account used for trading if different from the current cash account."</li>
	 * </ul>
	 */
	public static final MMCode CashTrading = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashTrading";
			definition = "Account used for trading if different from the current cash account.";
			owner_lazy = () -> CashAccountTypeCode.mmObject();
			codeName = "TRAS";
		}
	};
	/**
	 * Account used to post debit and credit entries, as a result of
	 * transactions cleared and settled through a specific clearing and
	 * settlement system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode
	 * CashAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SACC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Settlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account used to post debit and credit entries, as a result of transactions cleared and settled through a specific clearing and settlement system."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Settlement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Settlement";
			definition = "Account used to post debit and credit entries, as a result of transactions cleared and settled through a specific clearing and settlement system.";
			owner_lazy = () -> CashAccountTypeCode.mmObject();
			codeName = "SACC";
		}
	};
	/**
	 * Account used to post debits and credits when no specific account has been
	 * nominated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode
	 * CashAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CACC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Current"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account used to post debits and credits when no specific account has been nominated."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Current = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Current";
			definition = "Account used to post debits and credits when no specific account has been nominated.";
			owner_lazy = () -> CashAccountTypeCode.mmObject();
			codeName = "CACC";
		}
	};
	/**
	 * Account used for savings.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode
	 * CashAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SVGS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Savings"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account used for savings."</li>
	 * </ul>
	 */
	public static final MMCode Savings = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Savings";
			definition = "Account used for savings.";
			owner_lazy = () -> CashAccountTypeCode.mmObject();
			codeName = "SVGS";
		}
	};
	/**
	 * Account used for overnight deposits.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode
	 * CashAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ONDP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OverNightDeposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account used for overnight deposits."</li>
	 * </ul>
	 */
	public static final MMCode OverNightDeposit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OverNightDeposit";
			definition = "Account used for overnight deposits.";
			owner_lazy = () -> CashAccountTypeCode.mmObject();
			codeName = "ONDP";
		}
	};
	/**
	 * Account used for a marginal lending facility.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode
	 * CashAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MGLD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginalLending"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account used for a marginal lending facility."</li>
	 * </ul>
	 */
	public static final MMCode MarginalLending = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MarginalLending";
			definition = "Account used for a marginal lending facility.";
			owner_lazy = () -> CashAccountTypeCode.mmObject();
			codeName = "MGLD";
		}
	};
	/**
	 * Account used for non-resident external.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode
	 * CashAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NREX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonResidentExternal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account used for non-resident external."</li>
	 * </ul>
	 */
	public static final MMCode NonResidentExternal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NonResidentExternal";
			definition = "Account used for non-resident external.";
			owner_lazy = () -> CashAccountTypeCode.mmObject();
			codeName = "NREX";
		}
	};
	/**
	 * Account used for money markets if different from the cash account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode
	 * CashAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MOMA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MoneyMarket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account used for money markets if different from the cash account."</li>
	 * </ul>
	 */
	public static final MMCode MoneyMarket = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MoneyMarket";
			definition = "Account used for money markets if different from the cash account.";
			owner_lazy = () -> CashAccountTypeCode.mmObject();
			codeName = "MOMA";
		}
	};
	/**
	 * Account used for loans.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode
	 * CashAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LOAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Loan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account used for loans."</li>
	 * </ul>
	 */
	public static final MMCode Loan = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Loan";
			definition = "Account used for loans.";
			owner_lazy = () -> CashAccountTypeCode.mmObject();
			codeName = "LOAN";
		}
	};
	/**
	 * Accounts used for salary payments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode
	 * CashAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SLRY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Salary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Accounts used for salary payments."</li>
	 * </ul>
	 */
	public static final MMCode Salary = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Salary";
			definition = "Accounts used for salary payments.";
			owner_lazy = () -> CashAccountTypeCode.mmObject();
			codeName = "SLRY";
		}
	};
	/**
	 * Account is used for overdrafts.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode
	 * CashAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ODFT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Overdraft"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account is used for overdrafts."</li>
	 * </ul>
	 */
	public static final MMCode Overdraft = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Overdraft";
			definition = "Account is used for overdrafts.";
			owner_lazy = () -> CashAccountTypeCode.mmObject();
			codeName = "ODFT";
		}
	};
	/**
	 * Account is for the coverage of lending.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode
	 * CashAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LEND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Lending"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account is for the coverage of lending."</li>
	 * </ul>
	 */
	public static final MMCode Lending = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Lending";
			definition = "Account is for the coverage of lending.";
			owner_lazy = () -> CashAccountTypeCode.mmObject();
			codeName = "LEND";
		}
	};
	/**
	 * Account is for collateral.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode
	 * CashAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COLL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Collateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account is for collateral."</li>
	 * </ul>
	 */
	public static final MMCode Collateral = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Collateral";
			definition = "Account is for collateral.";
			owner_lazy = () -> CashAccountTypeCode.mmObject();
			codeName = "COLL";
		}
	};
	/**
	 * Account is for financial settlements.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode
	 * CashAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SETT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account is for financial settlements."</li>
	 * </ul>
	 */
	public static final MMCode FinancialSettlement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialSettlement";
			definition = "Account is for financial settlements.";
			owner_lazy = () -> CashAccountTypeCode.mmObject();
			codeName = "SETT";
		}
	};
	/**
	 * Account is for margin returns.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode
	 * CashAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MARR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginReturn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account is for margin returns."</li>
	 * </ul>
	 */
	public static final MMCode MarginReturn = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginReturn";
			definition = "Account is for margin returns.";
			owner_lazy = () -> CashAccountTypeCode.mmObject();
			codeName = "MARR";
		}
	};
	/**
	 * Account is an segregated account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode
	 * CashAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SEGT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Segregated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account is an segregated account."</li>
	 * </ul>
	 */
	public static final MMCode Segregated = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Segregated";
			definition = "Account is an segregated account.";
			owner_lazy = () -> CashAccountTypeCode.mmObject();
			codeName = "SEGT";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CASH");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CashAccountTypeCode";
				definition = "Specifies the nature, or  use, of the cash account.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CashAccountTypeCode.CashPayment, com.tools20022.repository.codeset.CashAccountTypeCode.Charges,
						com.tools20022.repository.codeset.CashAccountTypeCode.Commission, com.tools20022.repository.codeset.CashAccountTypeCode.Tax, com.tools20022.repository.codeset.CashAccountTypeCode.CashIncome,
						com.tools20022.repository.codeset.CashAccountTypeCode.CashTrading, com.tools20022.repository.codeset.CashAccountTypeCode.Settlement, com.tools20022.repository.codeset.CashAccountTypeCode.Current,
						com.tools20022.repository.codeset.CashAccountTypeCode.Savings, com.tools20022.repository.codeset.CashAccountTypeCode.OverNightDeposit, com.tools20022.repository.codeset.CashAccountTypeCode.MarginalLending,
						com.tools20022.repository.codeset.CashAccountTypeCode.NonResidentExternal, com.tools20022.repository.codeset.CashAccountTypeCode.MoneyMarket, com.tools20022.repository.codeset.CashAccountTypeCode.Loan,
						com.tools20022.repository.codeset.CashAccountTypeCode.Salary, com.tools20022.repository.codeset.CashAccountTypeCode.Overdraft, com.tools20022.repository.codeset.CashAccountTypeCode.Lending,
						com.tools20022.repository.codeset.CashAccountTypeCode.Collateral, com.tools20022.repository.codeset.CashAccountTypeCode.FinancialSettlement, com.tools20022.repository.codeset.CashAccountTypeCode.MarginReturn,
						com.tools20022.repository.codeset.CashAccountTypeCode.Segregated);
			}
		});
		return mmObject_lazy.get();
	}
}