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
 * Type of cardholder account used for the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountTypeCode#Default
 * CardAccountTypeCode.Default}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountTypeCode#Savings
 * CardAccountTypeCode.Savings}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountTypeCode#Checking
 * CardAccountTypeCode.Checking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountTypeCode#CreditCard
 * CardAccountTypeCode.CreditCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountTypeCode#Universal
 * CardAccountTypeCode.Universal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountTypeCode#Investment
 * CardAccountTypeCode.Investment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountTypeCode#EpurseCard
 * CardAccountTypeCode.EpurseCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountTypeCode#CertificateOfDeposit
 * CardAccountTypeCode.CertificateOfDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountTypeCode#Current
 * CardAccountTypeCode.Current}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountTypeCode#DebitCard
 * CardAccountTypeCode.DebitCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountTypeCode#HomeEquityLoan
 * CardAccountTypeCode.HomeEquityLoan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountTypeCode#InstalmentLoan
 * CardAccountTypeCode.InstalmentLoan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountTypeCode#LineOfCredit
 * CardAccountTypeCode.LineOfCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountTypeCode#MobilePhoneAccount
 * CardAccountTypeCode.MobilePhoneAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountTypeCode#MoneyMarket
 * CardAccountTypeCode.MoneyMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountTypeCode#MoneyMarketChecking
 * CardAccountTypeCode.MoneyMarketChecking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountTypeCode#MortgageLoan
 * CardAccountTypeCode.MortgageLoan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountTypeCode#RetirementAccount
 * CardAccountTypeCode.RetirementAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountTypeCode#RevolvingLoanAccount
 * CardAccountTypeCode.RevolvingLoanAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountTypeCode#StockOrBond
 * CardAccountTypeCode.StockOrBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountTypeCode#PrePaid
 * CardAccountTypeCode.PrePaid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountTypeCode#FleetCard
 * CardAccountTypeCode.FleetCard}</li>
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
 * <li>"DFLT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CardAccountTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type of cardholder account used for the transaction."</li>
 * </ul>
 */
public class CardAccountTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Default account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountTypeCode
	 * CardAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DFLT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Default"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Default account."</li>
	 * </ul>
	 */
	public static final MMCode Default = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Default";
			definition = "Default account.";
			owner_lazy = () -> CardAccountTypeCode.mmObject();
			codeName = "DFLT";
		}
	};
	/**
	 * Savings account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountTypeCode
	 * CardAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SVNG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Savings"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Savings account."</li>
	 * </ul>
	 */
	public static final MMCode Savings = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Savings";
			definition = "Savings account.";
			owner_lazy = () -> CardAccountTypeCode.mmObject();
			codeName = "SVNG";
		}
	};
	/**
	 * Checking account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountTypeCode
	 * CardAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CHCK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Checking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Checking account."</li>
	 * </ul>
	 */
	public static final MMCode Checking = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Checking";
			definition = "Checking account.";
			owner_lazy = () -> CardAccountTypeCode.mmObject();
			codeName = "CHCK";
		}
	};
	/**
	 * Credit card account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountTypeCode
	 * CardAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRDT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditCard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Credit card account."</li>
	 * </ul>
	 */
	public static final MMCode CreditCard = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditCard";
			definition = "Credit card account.";
			owner_lazy = () -> CardAccountTypeCode.mmObject();
			codeName = "CRDT";
		}
	};
	/**
	 * Universal account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountTypeCode
	 * CardAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UVRL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Universal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Universal account."</li>
	 * </ul>
	 */
	public static final MMCode Universal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Universal";
			definition = "Universal account.";
			owner_lazy = () -> CardAccountTypeCode.mmObject();
			codeName = "UVRL";
		}
	};
	/**
	 * Investment account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountTypeCode
	 * CardAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INVS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Investment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Investment account."</li>
	 * </ul>
	 */
	public static final MMCode Investment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Investment";
			definition = "Investment account.";
			owner_lazy = () -> CardAccountTypeCode.mmObject();
			codeName = "INVS";
		}
	};
	/**
	 * Electronic purse card account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountTypeCode
	 * CardAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EPRS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EpurseCard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Electronic purse card account."</li>
	 * </ul>
	 */
	public static final MMCode EpurseCard = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EpurseCard";
			definition = "Electronic purse card account.";
			owner_lazy = () -> CardAccountTypeCode.mmObject();
			codeName = "EPRS";
		}
	};
	/**
	 * Certificate of deposit saving account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountTypeCode
	 * CardAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CTDP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateOfDeposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Certificate of deposit saving account."</li>
	 * </ul>
	 */
	public static final MMCode CertificateOfDeposit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateOfDeposit";
			definition = "Certificate of deposit saving account.";
			owner_lazy = () -> CardAccountTypeCode.mmObject();
			codeName = "CTDP";
		}
	};
	/**
	 * Current account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountTypeCode
	 * CardAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CURR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Current"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Current account."</li>
	 * </ul>
	 */
	public static final MMCode Current = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Current";
			definition = "Current account.";
			owner_lazy = () -> CardAccountTypeCode.mmObject();
			codeName = "CURR";
		}
	};
	/**
	 * Debit card account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountTypeCode
	 * CardAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CDBT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebitCard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Debit card account."</li>
	 * </ul>
	 */
	public static final MMCode DebitCard = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebitCard";
			definition = "Debit card account.";
			owner_lazy = () -> CardAccountTypeCode.mmObject();
			codeName = "CDBT";
		}
	};
	/**
	 * Home equity loan credit account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountTypeCode
	 * CardAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HEQL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HomeEquityLoan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Home equity loan credit account."</li>
	 * </ul>
	 */
	public static final MMCode HomeEquityLoan = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HomeEquityLoan";
			definition = "Home equity loan credit account.";
			owner_lazy = () -> CardAccountTypeCode.mmObject();
			codeName = "HEQL";
		}
	};
	/**
	 * Instalment loan credit account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountTypeCode
	 * CardAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ISTL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstalmentLoan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instalment loan credit account."</li>
	 * </ul>
	 */
	public static final MMCode InstalmentLoan = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstalmentLoan";
			definition = "Instalment loan credit account.";
			owner_lazy = () -> CardAccountTypeCode.mmObject();
			codeName = "ISTL";
		}
	};
	/**
	 * Line of credit account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountTypeCode
	 * CardAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LCDT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LineOfCredit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Line of credit account."</li>
	 * </ul>
	 */
	public static final MMCode LineOfCredit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LineOfCredit";
			definition = "Line of credit account.";
			owner_lazy = () -> CardAccountTypeCode.mmObject();
			codeName = "LCDT";
		}
	};
	/**
	 * Mobile Station Integrated Services Digital Network Number (MSISDN).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountTypeCode
	 * CardAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MBNW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MobilePhoneAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Mobile Station Integrated Services Digital Network Number (MSISDN)."</li>
	 * </ul>
	 */
	public static final MMCode MobilePhoneAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MobilePhoneAccount";
			definition = "Mobile Station Integrated Services Digital Network Number (MSISDN).";
			owner_lazy = () -> CardAccountTypeCode.mmObject();
			codeName = "MBNW";
		}
	};
	/**
	 * Money market saving account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountTypeCode
	 * CardAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MNMK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MoneyMarket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Money market saving account."</li>
	 * </ul>
	 */
	public static final MMCode MoneyMarket = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MoneyMarket";
			definition = "Money market saving account.";
			owner_lazy = () -> CardAccountTypeCode.mmObject();
			codeName = "MNMK";
		}
	};
	/**
	 * Money market checking account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountTypeCode
	 * CardAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MNMC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MoneyMarketChecking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Money market checking account."</li>
	 * </ul>
	 */
	public static final MMCode MoneyMarketChecking = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MoneyMarketChecking";
			definition = "Money market checking account.";
			owner_lazy = () -> CardAccountTypeCode.mmObject();
			codeName = "MNMC";
		}
	};
	/**
	 * Mortgage loan credit account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountTypeCode
	 * CardAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MTGL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MortgageLoan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Mortgage loan credit account."</li>
	 * </ul>
	 */
	public static final MMCode MortgageLoan = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MortgageLoan";
			definition = "Mortgage loan credit account.";
			owner_lazy = () -> CardAccountTypeCode.mmObject();
			codeName = "MTGL";
		}
	};
	/**
	 * Retirement account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountTypeCode
	 * CardAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RTRM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RetirementAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Retirement account."</li>
	 * </ul>
	 */
	public static final MMCode RetirementAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RetirementAccount";
			definition = "Retirement account.";
			owner_lazy = () -> CardAccountTypeCode.mmObject();
			codeName = "RTRM";
		}
	};
	/**
	 * Revolving loan account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountTypeCode
	 * CardAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RVLV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RevolvingLoanAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Revolving loan account."</li>
	 * </ul>
	 */
	public static final MMCode RevolvingLoanAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RevolvingLoanAccount";
			definition = "Revolving loan account.";
			owner_lazy = () -> CardAccountTypeCode.mmObject();
			codeName = "RVLV";
		}
	};
	/**
	 * Stock or bond investment account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountTypeCode
	 * CardAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STBD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockOrBond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Stock or bond investment account."</li>
	 * </ul>
	 */
	public static final MMCode StockOrBond = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockOrBond";
			definition = "Stock or bond investment account.";
			owner_lazy = () -> CardAccountTypeCode.mmObject();
			codeName = "STBD";
		}
	};
	/**
	 * Pre-paid account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountTypeCode
	 * CardAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRPD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrePaid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Pre-paid account."</li>
	 * </ul>
	 */
	public static final MMCode PrePaid = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrePaid";
			definition = "Pre-paid account.";
			owner_lazy = () -> CardAccountTypeCode.mmObject();
			codeName = "PRPD";
		}
	};
	/**
	 * Fleet card account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountTypeCode
	 * CardAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FLTC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FleetCard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Fleet card account."</li>
	 * </ul>
	 */
	public static final MMCode FleetCard = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FleetCard";
			definition = "Fleet card account.";
			owner_lazy = () -> CardAccountTypeCode.mmObject();
			codeName = "FLTC";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("DFLT");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CardAccountTypeCode";
				definition = "Type of cardholder account used for the transaction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardAccountTypeCode.Default, com.tools20022.repository.codeset.CardAccountTypeCode.Savings, com.tools20022.repository.codeset.CardAccountTypeCode.Checking,
						com.tools20022.repository.codeset.CardAccountTypeCode.CreditCard, com.tools20022.repository.codeset.CardAccountTypeCode.Universal, com.tools20022.repository.codeset.CardAccountTypeCode.Investment,
						com.tools20022.repository.codeset.CardAccountTypeCode.EpurseCard, com.tools20022.repository.codeset.CardAccountTypeCode.CertificateOfDeposit, com.tools20022.repository.codeset.CardAccountTypeCode.Current,
						com.tools20022.repository.codeset.CardAccountTypeCode.DebitCard, com.tools20022.repository.codeset.CardAccountTypeCode.HomeEquityLoan, com.tools20022.repository.codeset.CardAccountTypeCode.InstalmentLoan,
						com.tools20022.repository.codeset.CardAccountTypeCode.LineOfCredit, com.tools20022.repository.codeset.CardAccountTypeCode.MobilePhoneAccount, com.tools20022.repository.codeset.CardAccountTypeCode.MoneyMarket,
						com.tools20022.repository.codeset.CardAccountTypeCode.MoneyMarketChecking, com.tools20022.repository.codeset.CardAccountTypeCode.MortgageLoan, com.tools20022.repository.codeset.CardAccountTypeCode.RetirementAccount,
						com.tools20022.repository.codeset.CardAccountTypeCode.RevolvingLoanAccount, com.tools20022.repository.codeset.CardAccountTypeCode.StockOrBond, com.tools20022.repository.codeset.CardAccountTypeCode.PrePaid,
						com.tools20022.repository.codeset.CardAccountTypeCode.FleetCard);
			}
		});
		return mmObject_lazy.get();
	}
}