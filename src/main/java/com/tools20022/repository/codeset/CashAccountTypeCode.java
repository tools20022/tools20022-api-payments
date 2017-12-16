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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.CashAccountTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the nature, or use, of the cash account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode#CashPayment
 * CashAccountTypeCode.mmCashPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode#Charges
 * CashAccountTypeCode.mmCharges}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode#Commission
 * CashAccountTypeCode.mmCommission}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CashAccountTypeCode#Tax
 * CashAccountTypeCode.mmTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode#CashIncome
 * CashAccountTypeCode.mmCashIncome}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode#CashTrading
 * CashAccountTypeCode.mmCashTrading}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode#Settlement
 * CashAccountTypeCode.mmSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode#Current
 * CashAccountTypeCode.mmCurrent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode#Savings
 * CashAccountTypeCode.mmSavings}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode#OverNightDeposit
 * CashAccountTypeCode.mmOverNightDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode#MarginalLending
 * CashAccountTypeCode.mmMarginalLending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode#NonResidentExternal
 * CashAccountTypeCode.mmNonResidentExternal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode#MoneyMarket
 * CashAccountTypeCode.mmMoneyMarket}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CashAccountTypeCode#Loan
 * CashAccountTypeCode.mmLoan}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CashAccountTypeCode#Salary
 * CashAccountTypeCode.mmSalary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode#Overdraft
 * CashAccountTypeCode.mmOverdraft}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode#Lending
 * CashAccountTypeCode.mmLending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode#Collateral
 * CashAccountTypeCode.mmCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode#FinancialSettlement
 * CashAccountTypeCode.mmFinancialSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode#MarginReturn
 * CashAccountTypeCode.mmMarginReturn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode#Segregated
 * CashAccountTypeCode.mmSegregated}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CashAccountTypeCode extends MMCode {

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
	public static final CashAccountTypeCode CashPayment = new CashAccountTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashPayment";
			definition = "Account used for the payment of cash.";
			owner_lazy = () -> com.tools20022.repository.codeset.CashAccountTypeCode.mmObject();
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
	public static final CashAccountTypeCode Charges = new CashAccountTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Charges";
			definition = "Account used for charges if different from the account for payment.";
			owner_lazy = () -> com.tools20022.repository.codeset.CashAccountTypeCode.mmObject();
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
	public static final CashAccountTypeCode Commission = new CashAccountTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Commission";
			definition = "Account used for commission if different from the account for payment.";
			owner_lazy = () -> com.tools20022.repository.codeset.CashAccountTypeCode.mmObject();
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
	public static final CashAccountTypeCode Tax = new CashAccountTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Tax";
			definition = "Account used for taxes if different from the account for payment.";
			owner_lazy = () -> com.tools20022.repository.codeset.CashAccountTypeCode.mmObject();
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
	public static final CashAccountTypeCode CashIncome = new CashAccountTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashIncome";
			definition = "Account used for payment of income if different from the current cash account.";
			owner_lazy = () -> com.tools20022.repository.codeset.CashAccountTypeCode.mmObject();
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
	public static final CashAccountTypeCode CashTrading = new CashAccountTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashTrading";
			definition = "Account used for trading if different from the current cash account.";
			owner_lazy = () -> com.tools20022.repository.codeset.CashAccountTypeCode.mmObject();
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
	public static final CashAccountTypeCode Settlement = new CashAccountTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Settlement";
			definition = "Account used to post debit and credit entries, as a result of transactions cleared and settled through a specific clearing and settlement system.";
			owner_lazy = () -> com.tools20022.repository.codeset.CashAccountTypeCode.mmObject();
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
	public static final CashAccountTypeCode Current = new CashAccountTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Current";
			definition = "Account used to post debits and credits when no specific account has been nominated.";
			owner_lazy = () -> com.tools20022.repository.codeset.CashAccountTypeCode.mmObject();
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
	public static final CashAccountTypeCode Savings = new CashAccountTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Savings";
			definition = "Account used for savings.";
			owner_lazy = () -> com.tools20022.repository.codeset.CashAccountTypeCode.mmObject();
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
	public static final CashAccountTypeCode OverNightDeposit = new CashAccountTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OverNightDeposit";
			definition = "Account used for overnight deposits.";
			owner_lazy = () -> com.tools20022.repository.codeset.CashAccountTypeCode.mmObject();
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
	public static final CashAccountTypeCode MarginalLending = new CashAccountTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MarginalLending";
			definition = "Account used for a marginal lending facility.";
			owner_lazy = () -> com.tools20022.repository.codeset.CashAccountTypeCode.mmObject();
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
	public static final CashAccountTypeCode NonResidentExternal = new CashAccountTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NonResidentExternal";
			definition = "Account used for non-resident external.";
			owner_lazy = () -> com.tools20022.repository.codeset.CashAccountTypeCode.mmObject();
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
	public static final CashAccountTypeCode MoneyMarket = new CashAccountTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MoneyMarket";
			definition = "Account used for money markets if different from the cash account.";
			owner_lazy = () -> com.tools20022.repository.codeset.CashAccountTypeCode.mmObject();
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
	public static final CashAccountTypeCode Loan = new CashAccountTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Loan";
			definition = "Account used for loans.";
			owner_lazy = () -> com.tools20022.repository.codeset.CashAccountTypeCode.mmObject();
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
	public static final CashAccountTypeCode Salary = new CashAccountTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Salary";
			definition = "Accounts used for salary payments.";
			owner_lazy = () -> com.tools20022.repository.codeset.CashAccountTypeCode.mmObject();
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
	public static final CashAccountTypeCode Overdraft = new CashAccountTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Overdraft";
			definition = "Account is used for overdrafts.";
			owner_lazy = () -> com.tools20022.repository.codeset.CashAccountTypeCode.mmObject();
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
	public static final CashAccountTypeCode Lending = new CashAccountTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Lending";
			definition = "Account is for the coverage of lending.";
			owner_lazy = () -> com.tools20022.repository.codeset.CashAccountTypeCode.mmObject();
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
	public static final CashAccountTypeCode Collateral = new CashAccountTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Collateral";
			definition = "Account is for collateral.";
			owner_lazy = () -> com.tools20022.repository.codeset.CashAccountTypeCode.mmObject();
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
	public static final CashAccountTypeCode FinancialSettlement = new CashAccountTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialSettlement";
			definition = "Account is for financial settlements.";
			owner_lazy = () -> com.tools20022.repository.codeset.CashAccountTypeCode.mmObject();
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
	public static final CashAccountTypeCode MarginReturn = new CashAccountTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginReturn";
			definition = "Account is for margin returns.";
			owner_lazy = () -> com.tools20022.repository.codeset.CashAccountTypeCode.mmObject();
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
	public static final CashAccountTypeCode Segregated = new CashAccountTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Segregated";
			definition = "Account is an segregated account.";
			owner_lazy = () -> com.tools20022.repository.codeset.CashAccountTypeCode.mmObject();
			codeName = "SEGT";
		}
	};
	final static private LinkedHashMap<String, CashAccountTypeCode> codesByName = new LinkedHashMap<>();

	protected CashAccountTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("CASH");
				registrationStatus = MMRegistrationStatus.REGISTERED;
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

	static {
		codesByName.put(CashPayment.getCodeName().get(), CashPayment);
		codesByName.put(Charges.getCodeName().get(), Charges);
		codesByName.put(Commission.getCodeName().get(), Commission);
		codesByName.put(Tax.getCodeName().get(), Tax);
		codesByName.put(CashIncome.getCodeName().get(), CashIncome);
		codesByName.put(CashTrading.getCodeName().get(), CashTrading);
		codesByName.put(Settlement.getCodeName().get(), Settlement);
		codesByName.put(Current.getCodeName().get(), Current);
		codesByName.put(Savings.getCodeName().get(), Savings);
		codesByName.put(OverNightDeposit.getCodeName().get(), OverNightDeposit);
		codesByName.put(MarginalLending.getCodeName().get(), MarginalLending);
		codesByName.put(NonResidentExternal.getCodeName().get(), NonResidentExternal);
		codesByName.put(MoneyMarket.getCodeName().get(), MoneyMarket);
		codesByName.put(Loan.getCodeName().get(), Loan);
		codesByName.put(Salary.getCodeName().get(), Salary);
		codesByName.put(Overdraft.getCodeName().get(), Overdraft);
		codesByName.put(Lending.getCodeName().get(), Lending);
		codesByName.put(Collateral.getCodeName().get(), Collateral);
		codesByName.put(FinancialSettlement.getCodeName().get(), FinancialSettlement);
		codesByName.put(MarginReturn.getCodeName().get(), MarginReturn);
		codesByName.put(Segregated.getCodeName().get(), Segregated);
	}

	public static CashAccountTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CashAccountTypeCode[] values() {
		CashAccountTypeCode[] values = new CashAccountTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CashAccountTypeCode> {
		@Override
		public CashAccountTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CashAccountTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}