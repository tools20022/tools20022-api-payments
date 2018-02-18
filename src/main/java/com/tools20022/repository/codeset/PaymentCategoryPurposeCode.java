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
import com.tools20022.repository.codeset.PaymentCategoryPurposeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of transaction that resulted in the payment.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurposeCode#IntraCompanyPayment
 * PaymentCategoryPurposeCode.IntraCompanyPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurposeCode#TradeSettlementPayment
 * PaymentCategoryPurposeCode.TradeSettlementPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurposeCode#SalaryPayment
 * PaymentCategoryPurposeCode.SalaryPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurposeCode#TreasuryPayment
 * PaymentCategoryPurposeCode.TreasuryPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurposeCode#CashManagementTransfer
 * PaymentCategoryPurposeCode.CashManagementTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurposeCode#Dividend
 * PaymentCategoryPurposeCode.Dividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurposeCode#GovernmentPayment
 * PaymentCategoryPurposeCode.GovernmentPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurposeCode#Interest
 * PaymentCategoryPurposeCode.Interest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurposeCode#Loan
 * PaymentCategoryPurposeCode.Loan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurposeCode#PensionPayment
 * PaymentCategoryPurposeCode.PensionPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurposeCode#Securities
 * PaymentCategoryPurposeCode.Securities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurposeCode#SocialSecurityBenefit
 * PaymentCategoryPurposeCode.SocialSecurityBenefit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurposeCode#TaxPayment
 * PaymentCategoryPurposeCode.TaxPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurposeCode#ValueAddedTaxPayment
 * PaymentCategoryPurposeCode.ValueAddedTaxPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurposeCode#SupplierPayment
 * PaymentCategoryPurposeCode.SupplierPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurposeCode#Hedging
 * PaymentCategoryPurposeCode.Hedging}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurposeCode#Trade
 * PaymentCategoryPurposeCode.Trade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurposeCode#WithHolding
 * PaymentCategoryPurposeCode.WithHolding}</li>
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
 * <li>"INTC"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentCategoryPurposeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of transaction that resulted in the payment."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PaymentCategoryPurposeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Transaction is an intra-company payment, ie, a payment between two
	 * companies belonging to the same group.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurposeCode
	 * PaymentCategoryPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INTC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntraCompanyPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is an intra-company payment, ie, a payment between two companies belonging to the same group."
	 * </li>
	 * </ul>
	 */
	public static final PaymentCategoryPurposeCode IntraCompanyPayment = new PaymentCategoryPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IntraCompanyPayment";
			definition = "Transaction is an intra-company payment, ie, a payment between two companies belonging to the same group.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentCategoryPurposeCode.mmObject();
			codeName = "INTC";
		}
	};
	/**
	 * Transaction is related to settlement of a trade, eg a foreign exchange
	 * deal or a securities transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurposeCode
	 * PaymentCategoryPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CORT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeSettlementPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is related to settlement of a trade, eg a foreign exchange deal or a securities transaction."
	 * </li>
	 * </ul>
	 */
	public static final PaymentCategoryPurposeCode TradeSettlementPayment = new PaymentCategoryPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradeSettlementPayment";
			definition = "Transaction is related to settlement of a trade, eg a foreign exchange deal or a securities transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentCategoryPurposeCode.mmObject();
			codeName = "CORT";
		}
	};
	/**
	 * Transaction is the payment of salaries.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurposeCode
	 * PaymentCategoryPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SALA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SalaryPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is the payment of salaries."</li>
	 * </ul>
	 */
	public static final PaymentCategoryPurposeCode SalaryPayment = new PaymentCategoryPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SalaryPayment";
			definition = "Transaction is the payment of salaries.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentCategoryPurposeCode.mmObject();
			codeName = "SALA";
		}
	};
	/**
	 * Transaction is related to treasury operations.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurposeCode
	 * PaymentCategoryPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TREA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TreasuryPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is related to treasury operations."</li>
	 * </ul>
	 */
	public static final PaymentCategoryPurposeCode TreasuryPayment = new PaymentCategoryPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TreasuryPayment";
			definition = "Transaction is related to treasury operations.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentCategoryPurposeCode.mmObject();
			codeName = "TREA";
		}
	};
	/**
	 * Transaction is a general cash management instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurposeCode
	 * PaymentCategoryPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CASH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashManagementTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is a general cash management instruction."</li>
	 * </ul>
	 */
	public static final PaymentCategoryPurposeCode CashManagementTransfer = new PaymentCategoryPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashManagementTransfer";
			definition = "Transaction is a general cash management instruction.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentCategoryPurposeCode.mmObject();
			codeName = "CASH";
		}
	};
	/**
	 * Transaction is the payment of dividends.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurposeCode
	 * PaymentCategoryPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DIVI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Dividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is the payment of dividends."</li>
	 * </ul>
	 */
	public static final PaymentCategoryPurposeCode Dividend = new PaymentCategoryPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Dividend";
			definition = "Transaction is the payment of dividends.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentCategoryPurposeCode.mmObject();
			codeName = "DIVI";
		}
	};
	/**
	 * Transaction is a payment to or from a government department.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurposeCode
	 * PaymentCategoryPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GOVT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GovernmentPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a payment to or from a government department."</li>
	 * </ul>
	 */
	public static final PaymentCategoryPurposeCode GovernmentPayment = new PaymentCategoryPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GovernmentPayment";
			definition = "Transaction is a payment to or from a government department.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentCategoryPurposeCode.mmObject();
			codeName = "GOVT";
		}
	};
	/**
	 * Transaction is the payment of interest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurposeCode
	 * PaymentCategoryPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INTE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is the payment of interest."</li>
	 * </ul>
	 */
	public static final PaymentCategoryPurposeCode Interest = new PaymentCategoryPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Interest";
			definition = "Transaction is the payment of interest.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentCategoryPurposeCode.mmObject();
			codeName = "INTE";
		}
	};
	/**
	 * Transaction is related to the transfer of a loan to a borrower.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurposeCode
	 * PaymentCategoryPurposeCode}</li>
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
	 * definition} =
	 * "Transaction is related to the transfer of a loan to a borrower."</li>
	 * </ul>
	 */
	public static final PaymentCategoryPurposeCode Loan = new PaymentCategoryPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Loan";
			definition = "Transaction is related to the transfer of a loan to a borrower.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentCategoryPurposeCode.mmObject();
			codeName = "LOAN";
		}
	};
	/**
	 * Transaction is the payment of pension.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurposeCode
	 * PaymentCategoryPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PENS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PensionPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is the payment of pension."</li>
	 * </ul>
	 */
	public static final PaymentCategoryPurposeCode PensionPayment = new PaymentCategoryPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PensionPayment";
			definition = "Transaction is the payment of pension.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentCategoryPurposeCode.mmObject();
			codeName = "PENS";
		}
	};
	/**
	 * Transaction is the payment of securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurposeCode
	 * PaymentCategoryPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SECU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Securities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is the payment of securities."</li>
	 * </ul>
	 */
	public static final PaymentCategoryPurposeCode Securities = new PaymentCategoryPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Securities";
			definition = "Transaction is the payment of securities.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentCategoryPurposeCode.mmObject();
			codeName = "SECU";
		}
	};
	/**
	 * Transaction is a social security benefit, ie payment made by a government
	 * to support individuals.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurposeCode
	 * PaymentCategoryPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSBE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SocialSecurityBenefit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a social security benefit, ie payment made by a government to support individuals."
	 * </li>
	 * </ul>
	 */
	public static final PaymentCategoryPurposeCode SocialSecurityBenefit = new PaymentCategoryPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SocialSecurityBenefit";
			definition = "Transaction is a social security benefit, ie payment made by a government to support individuals.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentCategoryPurposeCode.mmObject();
			codeName = "SSBE";
		}
	};
	/**
	 * Transaction is the payment of taxes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurposeCode
	 * PaymentCategoryPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TAXS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is the payment of taxes."</li>
	 * </ul>
	 */
	public static final PaymentCategoryPurposeCode TaxPayment = new PaymentCategoryPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxPayment";
			definition = "Transaction is the payment of taxes.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentCategoryPurposeCode.mmObject();
			codeName = "TAXS";
		}
	};
	/**
	 * Transaction is the payment of value added tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurposeCode
	 * PaymentCategoryPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VATX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueAddedTaxPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is the payment of value added tax."</li>
	 * </ul>
	 */
	public static final PaymentCategoryPurposeCode ValueAddedTaxPayment = new PaymentCategoryPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ValueAddedTaxPayment";
			definition = "Transaction is the payment of value added tax.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentCategoryPurposeCode.mmObject();
			codeName = "VATX";
		}
	};
	/**
	 * Transaction is related to a payment to a supplier.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurposeCode
	 * PaymentCategoryPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SUPP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplierPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is related to a payment to a supplier."</li>
	 * </ul>
	 */
	public static final PaymentCategoryPurposeCode SupplierPayment = new PaymentCategoryPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SupplierPayment";
			definition = "Transaction is related to a payment to a supplier.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentCategoryPurposeCode.mmObject();
			codeName = "SUPP";
		}
	};
	/**
	 * Transaction is related to the payment of a hedging operation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurposeCode
	 * PaymentCategoryPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HEDG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Hedging"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is related to the payment of a hedging operation."</li>
	 * </ul>
	 */
	public static final PaymentCategoryPurposeCode Hedging = new PaymentCategoryPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Hedging";
			definition = "Transaction is related to the payment of a hedging operation.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentCategoryPurposeCode.mmObject();
			codeName = "HEDG";
		}
	};
	/**
	 * Transaction is related to the payment of a trade transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurposeCode
	 * PaymentCategoryPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRAD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Trade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is related to the payment of a trade transaction."</li>
	 * </ul>
	 */
	public static final PaymentCategoryPurposeCode Trade = new PaymentCategoryPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Trade";
			definition = "Transaction is related to the payment of a trade transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentCategoryPurposeCode.mmObject();
			codeName = "TRAD";
		}
	};
	/**
	 * Transaction is the payment of withholding tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurposeCode
	 * PaymentCategoryPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WHLD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithHolding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is the payment of withholding tax."</li>
	 * </ul>
	 */
	public static final PaymentCategoryPurposeCode WithHolding = new PaymentCategoryPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WithHolding";
			definition = "Transaction is the payment of withholding tax.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentCategoryPurposeCode.mmObject();
			codeName = "WHLD";
		}
	};
	final static private LinkedHashMap<String, PaymentCategoryPurposeCode> codesByName = new LinkedHashMap<>();

	protected PaymentCategoryPurposeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("INTC");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentCategoryPurposeCode";
				definition = "Specifies the type of transaction that resulted in the payment.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PaymentCategoryPurposeCode.IntraCompanyPayment, com.tools20022.repository.codeset.PaymentCategoryPurposeCode.TradeSettlementPayment,
						com.tools20022.repository.codeset.PaymentCategoryPurposeCode.SalaryPayment, com.tools20022.repository.codeset.PaymentCategoryPurposeCode.TreasuryPayment,
						com.tools20022.repository.codeset.PaymentCategoryPurposeCode.CashManagementTransfer, com.tools20022.repository.codeset.PaymentCategoryPurposeCode.Dividend,
						com.tools20022.repository.codeset.PaymentCategoryPurposeCode.GovernmentPayment, com.tools20022.repository.codeset.PaymentCategoryPurposeCode.Interest,
						com.tools20022.repository.codeset.PaymentCategoryPurposeCode.Loan, com.tools20022.repository.codeset.PaymentCategoryPurposeCode.PensionPayment,
						com.tools20022.repository.codeset.PaymentCategoryPurposeCode.Securities, com.tools20022.repository.codeset.PaymentCategoryPurposeCode.SocialSecurityBenefit,
						com.tools20022.repository.codeset.PaymentCategoryPurposeCode.TaxPayment, com.tools20022.repository.codeset.PaymentCategoryPurposeCode.ValueAddedTaxPayment,
						com.tools20022.repository.codeset.PaymentCategoryPurposeCode.SupplierPayment, com.tools20022.repository.codeset.PaymentCategoryPurposeCode.Hedging, com.tools20022.repository.codeset.PaymentCategoryPurposeCode.Trade,
						com.tools20022.repository.codeset.PaymentCategoryPurposeCode.WithHolding);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(IntraCompanyPayment.getCodeName().get(), IntraCompanyPayment);
		codesByName.put(TradeSettlementPayment.getCodeName().get(), TradeSettlementPayment);
		codesByName.put(SalaryPayment.getCodeName().get(), SalaryPayment);
		codesByName.put(TreasuryPayment.getCodeName().get(), TreasuryPayment);
		codesByName.put(CashManagementTransfer.getCodeName().get(), CashManagementTransfer);
		codesByName.put(Dividend.getCodeName().get(), Dividend);
		codesByName.put(GovernmentPayment.getCodeName().get(), GovernmentPayment);
		codesByName.put(Interest.getCodeName().get(), Interest);
		codesByName.put(Loan.getCodeName().get(), Loan);
		codesByName.put(PensionPayment.getCodeName().get(), PensionPayment);
		codesByName.put(Securities.getCodeName().get(), Securities);
		codesByName.put(SocialSecurityBenefit.getCodeName().get(), SocialSecurityBenefit);
		codesByName.put(TaxPayment.getCodeName().get(), TaxPayment);
		codesByName.put(ValueAddedTaxPayment.getCodeName().get(), ValueAddedTaxPayment);
		codesByName.put(SupplierPayment.getCodeName().get(), SupplierPayment);
		codesByName.put(Hedging.getCodeName().get(), Hedging);
		codesByName.put(Trade.getCodeName().get(), Trade);
		codesByName.put(WithHolding.getCodeName().get(), WithHolding);
	}

	public static PaymentCategoryPurposeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PaymentCategoryPurposeCode[] values() {
		PaymentCategoryPurposeCode[] values = new PaymentCategoryPurposeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PaymentCategoryPurposeCode> {
		@Override
		public PaymentCategoryPurposeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PaymentCategoryPurposeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}