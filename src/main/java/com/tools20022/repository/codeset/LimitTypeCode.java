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
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of risk management limit.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LimitTypeCode#mmMultilateral
 * LimitTypeCode.mmMultilateral}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.LimitTypeCode#mmBilateral
 * LimitTypeCode.mmBilateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LimitTypeCode#mmNetBilateral
 * LimitTypeCode.mmNetBilateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LimitTypeCode#mmIndirectBilateral
 * LimitTypeCode.mmIndirectBilateral}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.LimitTypeCode#mmGlobal
 * LimitTypeCode.mmGlobal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LimitTypeCode#mmMandatoryBilateral
 * LimitTypeCode.mmMandatoryBilateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LimitTypeCode#mmDiscretionaryBilateral
 * LimitTypeCode.mmDiscretionaryBilateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LimitTypeCode#mmDirectDebit
 * LimitTypeCode.mmDirectDebit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LimitTypeCode#mmSingleCustomerDirectDebit
 * LimitTypeCode.mmSingleCustomerDirectDebit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LimitTypeCode#mmSingleFinancialInstitutionDirectDebit
 * LimitTypeCode.mmSingleFinancialInstitutionDirectDebit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LimitTypeCode#mmTotalDailyCustomerDirectDebit
 * LimitTypeCode.mmTotalDailyCustomerDirectDebit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LimitTypeCode#mmTotalDailyFinancialInstitutionDirectDebit
 * LimitTypeCode.mmTotalDailyFinancialInstitutionDirectDebit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LimitTypeCode#mmAutoCollateralisation
 * LimitTypeCode.mmAutoCollateralisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LimitTypeCode#mmUnsecuredCredit
 * LimitTypeCode.mmUnsecuredCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LimitTypeCode#mmExternalGuarantee
 * LimitTypeCode.mmExternalGuarantee}</li>
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
 * <li>"MULT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "LimitTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of risk management limit."</li>
 * </ul>
 */
public class LimitTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Limit is a maximum amount value applied to, or by, a participant to a set
	 * of counterparties. The multilateral limit is taken into account by the
	 * transaction administrator to contain the risk in the system. With the
	 * help of the multilateral limit, the direct participant restricts the use
	 * of liquidity when clearing payments with all other direct participants
	 * for which no bilateral limit is set.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LimitTypeCode
	 * LimitTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MULT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Multilateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Limit is a maximum amount value applied to, or by, a participant to a set of counterparties. The multilateral limit is taken into account by the transaction administrator to contain the risk in the system. With the help of the multilateral limit, the direct participant restricts the use of liquidity when clearing payments with all other direct participants for which no bilateral limit is set."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmMultilateral = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Multilateral";
			definition = "Limit is a maximum amount value applied to, or by, a participant to a set of counterparties. The multilateral limit is taken into account by the transaction administrator to contain the risk in the system. With the help of the multilateral limit, the direct participant restricts the use of liquidity when clearing payments with all other direct participants for which no bilateral limit is set.";
			owner_lazy = () -> LimitTypeCode.mmObject();
			codeName = "MULT";
		}
	};
	/**
	 * Limit is applied by one party to a specific counterparty, and corresponds
	 * to the maximum amount of traffic party setting the limit can send to that
	 * counterparty. The limit can be expressed as a debit or a credit limit.
	 * With the help of a bilateral limit, the direct participant restricts the
	 * use of liquidity when clearing payments with another direct participant.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LimitTypeCode
	 * LimitTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BILI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bilateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Limit is applied by one party to a specific counterparty, and corresponds to the maximum amount of traffic party setting the limit can send to that counterparty. The limit can be expressed as a debit or a credit limit. With the help of a bilateral limit, the direct participant restricts the use of liquidity when clearing payments with another direct participant."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmBilateral = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bilateral";
			definition = "Limit is applied by one party to a specific counterparty, and corresponds to the maximum amount of traffic party setting the limit can send to that counterparty. The limit can be expressed as a debit or a credit limit. With the help of a bilateral limit, the direct participant restricts the use of liquidity when clearing payments with another direct participant.";
			owner_lazy = () -> LimitTypeCode.mmObject();
			codeName = "BILI";
		}
	};
	/**
	 * Limit is applied by one party to a specific counterparty, and corresponds
	 * to the maximum net balance acceptable by the party that is setting the
	 * limit. The limit is calculated as an arithmetic sum in value of the
	 * bilateral flows exchanged between the two parties. The net bilateral
	 * limit can be expressed as a debit or a credit balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LimitTypeCode
	 * LimitTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NELI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetBilateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Limit is applied by one party to a specific counterparty, and corresponds to the maximum net balance acceptable by the party that is setting the limit. The limit is calculated as an arithmetic sum in value of the bilateral flows exchanged between the two parties. The net bilateral limit can be expressed as a debit or a credit balance."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmNetBilateral = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetBilateral";
			definition = "Limit is applied by one party to a specific counterparty, and corresponds to the maximum net balance acceptable by the party that is setting the limit. The limit is calculated as an arithmetic sum in value of the bilateral flows exchanged between the two parties. The net bilateral limit can be expressed as a debit or a credit balance.";
			owner_lazy = () -> LimitTypeCode.mmObject();
			codeName = "NELI";
		}
	};
	/**
	 * Limit is a maximum value set by a direct participant with respect to its
	 * indirect participant. The limit represents the maximum amount the
	 * indirect participant can use to settle its operations.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LimitTypeCode
	 * LimitTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INBI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndirectBilateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Limit is a maximum value set by a direct participant with respect to its indirect participant. The limit represents the maximum amount the indirect participant can use to settle its operations."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmIndirectBilateral = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndirectBilateral";
			definition = "Limit is a maximum value set by a direct participant with respect to its indirect participant. The limit represents the maximum amount the indirect participant can use to settle its operations.";
			owner_lazy = () -> LimitTypeCode.mmObject();
			codeName = "INBI";
		}
	};
	/**
	 * Maximum value set by either the transaction administrator or by a member
	 * for the participation of a member in the system. The global limit may be
	 * expressed as a credit or debit maximum value and is taken into account by
	 * the transaction administrator when processing transaction inside the
	 * system. With the help of the global limit, the direct participant may
	 * limit the use of liquidity when clearing specific type of payments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LimitTypeCode
	 * LimitTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GLBL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Global"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum value set by either the transaction administrator or by a member for the participation of a member in the system. The global limit may be expressed as a credit or debit maximum value and is taken into account by the transaction administrator when processing transaction inside the system. With the help of the global limit, the direct participant may limit the use of liquidity when clearing specific type of payments."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmGlobal = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Global";
			definition = "Maximum value set by either the transaction administrator or by a member for the participation of a member in the system. The global limit may be expressed as a credit or debit maximum value and is taken into account by the transaction administrator when processing transaction inside the system. With the help of the global limit, the direct participant may limit the use of liquidity when clearing specific type of payments.";
			owner_lazy = () -> LimitTypeCode.mmObject();
			codeName = "GLBL";
		}
	};
	/**
	 * Mandatory part of the bilateral limit applied by one party to a specific
	 * counterparty, and corresponds to the maximum amount of traffic party
	 * setting the limit can send to that counterparty. The limit can be
	 * expressed as a debit or a credit limit. With the help of a bilateral
	 * limit, the direct participant restricts the use of liquidity when
	 * clearing payments with another direct participant.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LimitTypeCode
	 * LimitTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MAND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MandatoryBilateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Mandatory part of the bilateral limit applied by one party to a specific counterparty, and corresponds to the maximum amount of traffic party setting the limit can send to that counterparty. The limit can be expressed as a debit or a credit limit. With the help of a bilateral limit, the direct participant restricts the use of liquidity when clearing payments with another direct participant."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmMandatoryBilateral = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MandatoryBilateral";
			definition = "Mandatory part of the bilateral limit applied by one party to a specific counterparty, and corresponds to the maximum amount of traffic party setting the limit can send to that counterparty. The limit can be expressed as a debit or a credit limit. With the help of a bilateral limit, the direct participant restricts the use of liquidity when clearing payments with another direct participant.";
			owner_lazy = () -> LimitTypeCode.mmObject();
			codeName = "MAND";
		}
	};
	/**
	 * Discretionary part of the bilateral limit applied by one party to a
	 * specific counterparty, and corresponds to the maximum amount of traffic
	 * party setting the limit can send to that counterparty. The limit can be
	 * expressed as a debit or a credit limit. With the help of a bilateral
	 * limit, the direct participant restricts the use of liquidity when
	 * clearing payments with another direct participant.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LimitTypeCode
	 * LimitTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DISC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DiscretionaryBilateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Discretionary part of the bilateral limit applied by one party to a specific counterparty, and corresponds to the maximum amount of traffic party setting the limit can send to that counterparty. The limit can be expressed as a debit or a credit limit. With the help of a bilateral limit, the direct participant restricts the use of liquidity when clearing payments with another direct participant."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDiscretionaryBilateral = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DiscretionaryBilateral";
			definition = "Discretionary part of the bilateral limit applied by one party to a specific counterparty, and corresponds to the maximum amount of traffic party setting the limit can send to that counterparty. The limit can be expressed as a debit or a credit limit. With the help of a bilateral limit, the direct participant restricts the use of liquidity when clearing payments with another direct participant.";
			owner_lazy = () -> LimitTypeCode.mmObject();
			codeName = "DISC";
		}
	};
	/**
	 * Limit not to be exceeded for direct debit operations.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LimitTypeCode
	 * LimitTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DIDB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DirectDebit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Limit not to be exceeded for direct debit operations."</li>
	 * </ul>
	 */
	public static final MMCode mmDirectDebit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DirectDebit";
			definition = "Limit not to be exceeded for direct debit operations.";
			owner_lazy = () -> LimitTypeCode.mmObject();
			codeName = "DIDB";
		}
	};
	/**
	 * Single direct debit payment limit not to be exceeded by any single direct
	 * debit transaction by a customer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LimitTypeCode
	 * LimitTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPLC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SingleCustomerDirectDebit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Single direct debit payment limit not to be exceeded by any single direct debit transaction by a customer."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmSingleCustomerDirectDebit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SingleCustomerDirectDebit";
			definition = "Single direct debit payment limit not to be exceeded by any single direct debit transaction by a customer.";
			owner_lazy = () -> LimitTypeCode.mmObject();
			codeName = "SPLC";
		}
	};
	/**
	 * Single direct debit payment limit not to be exceeded by any single direct
	 * debit transaction initiated by a financial institution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LimitTypeCode
	 * LimitTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPLF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SingleFinancialInstitutionDirectDebit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Single direct debit payment limit not to be exceeded by any single direct debit transaction initiated by a financial institution."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmSingleFinancialInstitutionDirectDebit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SingleFinancialInstitutionDirectDebit";
			definition = "Single direct debit payment limit not to be exceeded by any single direct debit transaction initiated by a financial institution.";
			owner_lazy = () -> LimitTypeCode.mmObject();
			codeName = "SPLF";
		}
	};
	/**
	 * Total daily payments limit for customer direct debits not to be exceeded
	 * by the total of all direct debit transactions initiated by customers.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LimitTypeCode
	 * LimitTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TDLC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalDailyCustomerDirectDebit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total daily payments limit for customer direct debits not to be exceeded by the total of all direct debit transactions initiated by customers."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmTotalDailyCustomerDirectDebit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalDailyCustomerDirectDebit";
			definition = "Total daily payments limit for customer direct debits not to be exceeded by the total of all direct debit transactions initiated by customers.";
			owner_lazy = () -> LimitTypeCode.mmObject();
			codeName = "TDLC";
		}
	};
	/**
	 * Total daily payments limit for financial institutions direct debits not
	 * to be exceeded by the total of all direct debit transactions initiated by
	 * financial institutions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LimitTypeCode
	 * LimitTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TDLF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalDailyFinancialInstitutionDirectDebit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total daily payments limit for financial institutions direct debits not to be exceeded by the total of all direct debit transactions initiated by financial institutions."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmTotalDailyFinancialInstitutionDirectDebit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalDailyFinancialInstitutionDirectDebit";
			definition = "Total daily payments limit for financial institutions direct debits not to be exceeded by the total of all direct debit transactions initiated by financial institutions.";
			owner_lazy = () -> LimitTypeCode.mmObject();
			codeName = "TDLF";
		}
	};
	/**
	 * Limit is related to a credit operation that is or can be triggered when a
	 * buyer does not have a sufficient amount of money to settle a securities
	 * transaction in order to improve its cash position for the next settlement
	 * cycle. The credit provided can be secured using securities already held
	 * by the buyer (“collateral stocks”) or the securities that are being
	 * purchased (“collateral flows”).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LimitTypeCode
	 * LimitTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACOL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AutoCollateralisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Limit is related to a credit operation that is or can be triggered when a buyer does not have a sufficient amount of money to settle a securities transaction in order to improve its cash position for the next settlement cycle. The credit provided can be secured using securities already held by the buyer (“collateral stocks”) or the securities that are being purchased (“collateral flows”)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAutoCollateralisation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AutoCollateralisation";
			definition = "Limit is related to a credit operation that is or can be triggered when a buyer does not have a sufficient amount of money to settle a securities transaction in order to improve its cash position for the next settlement cycle. The credit provided can be secured using securities already held by the buyer (“collateral stocks”) or the securities that are being purchased (“collateral flows”).";
			owner_lazy = () -> LimitTypeCode.mmObject();
			codeName = "ACOL";
		}
	};
	/**
	 * Limit is related to a cap amount granted by a national central bank or a
	 * settlement bank, but generally unsecured outside of the market
	 * infrastructure.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LimitTypeCode
	 * LimitTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UCDT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnsecuredCredit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Limit is related to a cap amount granted by a national central bank or a settlement bank, but generally unsecured outside of the market infrastructure."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmUnsecuredCredit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnsecuredCredit";
			definition = "Limit is related to a cap amount granted by a national central bank or a settlement bank, but generally unsecured outside of the market infrastructure.";
			owner_lazy = () -> LimitTypeCode.mmObject();
			codeName = "UCDT";
		}
	};
	/**
	 * Limit is related to a cap amount granted by a national central bank or a
	 * settlement bank.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LimitTypeCode
	 * LimitTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXGT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExternalGuarantee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Limit is related to a cap amount granted by a national central bank or a settlement bank."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmExternalGuarantee = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExternalGuarantee";
			definition = "Limit is related to a cap amount granted by a national central bank or a settlement bank.";
			owner_lazy = () -> LimitTypeCode.mmObject();
			codeName = "EXGT";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("MULT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "LimitTypeCode";
				definition = "Specifies the type of risk management limit.";
				code_lazy = () -> Arrays.asList(LimitTypeCode.mmMultilateral, LimitTypeCode.mmBilateral, LimitTypeCode.mmNetBilateral, LimitTypeCode.mmIndirectBilateral, LimitTypeCode.mmGlobal, LimitTypeCode.mmMandatoryBilateral,
						LimitTypeCode.mmDiscretionaryBilateral, LimitTypeCode.mmDirectDebit, LimitTypeCode.mmSingleCustomerDirectDebit, LimitTypeCode.mmSingleFinancialInstitutionDirectDebit, LimitTypeCode.mmTotalDailyCustomerDirectDebit,
						LimitTypeCode.mmTotalDailyFinancialInstitutionDirectDebit, LimitTypeCode.mmAutoCollateralisation, LimitTypeCode.mmUnsecuredCredit, LimitTypeCode.mmExternalGuarantee);
			}
		});
		return mmObject_lazy.get();
	}
}