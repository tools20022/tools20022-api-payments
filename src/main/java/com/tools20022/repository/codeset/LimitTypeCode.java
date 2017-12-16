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
import com.tools20022.repository.codeset.LimitTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of risk management limit.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.LimitTypeCode#Multilateral
 * LimitTypeCode.mmMultilateral}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.LimitTypeCode#Bilateral
 * LimitTypeCode.mmBilateral}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.LimitTypeCode#NetBilateral
 * LimitTypeCode.mmNetBilateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LimitTypeCode#IndirectBilateral
 * LimitTypeCode.mmIndirectBilateral}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.LimitTypeCode#Global
 * LimitTypeCode.mmGlobal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LimitTypeCode#MandatoryBilateral
 * LimitTypeCode.mmMandatoryBilateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LimitTypeCode#DiscretionaryBilateral
 * LimitTypeCode.mmDiscretionaryBilateral}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.LimitTypeCode#DirectDebit
 * LimitTypeCode.mmDirectDebit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LimitTypeCode#SingleCustomerDirectDebit
 * LimitTypeCode.mmSingleCustomerDirectDebit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LimitTypeCode#SingleFinancialInstitutionDirectDebit
 * LimitTypeCode.mmSingleFinancialInstitutionDirectDebit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LimitTypeCode#TotalDailyCustomerDirectDebit
 * LimitTypeCode.mmTotalDailyCustomerDirectDebit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LimitTypeCode#TotalDailyFinancialInstitutionDirectDebit
 * LimitTypeCode.mmTotalDailyFinancialInstitutionDirectDebit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LimitTypeCode#AutoCollateralisation
 * LimitTypeCode.mmAutoCollateralisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LimitTypeCode#UnsecuredCredit
 * LimitTypeCode.mmUnsecuredCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LimitTypeCode#ExternalGuarantee
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
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class LimitTypeCode extends MMCode {

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
	public static final LimitTypeCode Multilateral = new LimitTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Multilateral";
			definition = "Limit is a maximum amount value applied to, or by, a participant to a set of counterparties. The multilateral limit is taken into account by the transaction administrator to contain the risk in the system. With the help of the multilateral limit, the direct participant restricts the use of liquidity when clearing payments with all other direct participants for which no bilateral limit is set.";
			owner_lazy = () -> com.tools20022.repository.codeset.LimitTypeCode.mmObject();
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
	public static final LimitTypeCode Bilateral = new LimitTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bilateral";
			definition = "Limit is applied by one party to a specific counterparty, and corresponds to the maximum amount of traffic party setting the limit can send to that counterparty. The limit can be expressed as a debit or a credit limit. With the help of a bilateral limit, the direct participant restricts the use of liquidity when clearing payments with another direct participant.";
			owner_lazy = () -> com.tools20022.repository.codeset.LimitTypeCode.mmObject();
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
	public static final LimitTypeCode NetBilateral = new LimitTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetBilateral";
			definition = "Limit is applied by one party to a specific counterparty, and corresponds to the maximum net balance acceptable by the party that is setting the limit. The limit is calculated as an arithmetic sum in value of the bilateral flows exchanged between the two parties. The net bilateral limit can be expressed as a debit or a credit balance.";
			owner_lazy = () -> com.tools20022.repository.codeset.LimitTypeCode.mmObject();
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
	public static final LimitTypeCode IndirectBilateral = new LimitTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndirectBilateral";
			definition = "Limit is a maximum value set by a direct participant with respect to its indirect participant. The limit represents the maximum amount the indirect participant can use to settle its operations.";
			owner_lazy = () -> com.tools20022.repository.codeset.LimitTypeCode.mmObject();
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
	public static final LimitTypeCode Global = new LimitTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Global";
			definition = "Maximum value set by either the transaction administrator or by a member for the participation of a member in the system. The global limit may be expressed as a credit or debit maximum value and is taken into account by the transaction administrator when processing transaction inside the system. With the help of the global limit, the direct participant may limit the use of liquidity when clearing specific type of payments.";
			owner_lazy = () -> com.tools20022.repository.codeset.LimitTypeCode.mmObject();
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
	public static final LimitTypeCode MandatoryBilateral = new LimitTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MandatoryBilateral";
			definition = "Mandatory part of the bilateral limit applied by one party to a specific counterparty, and corresponds to the maximum amount of traffic party setting the limit can send to that counterparty. The limit can be expressed as a debit or a credit limit. With the help of a bilateral limit, the direct participant restricts the use of liquidity when clearing payments with another direct participant.";
			owner_lazy = () -> com.tools20022.repository.codeset.LimitTypeCode.mmObject();
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
	public static final LimitTypeCode DiscretionaryBilateral = new LimitTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DiscretionaryBilateral";
			definition = "Discretionary part of the bilateral limit applied by one party to a specific counterparty, and corresponds to the maximum amount of traffic party setting the limit can send to that counterparty. The limit can be expressed as a debit or a credit limit. With the help of a bilateral limit, the direct participant restricts the use of liquidity when clearing payments with another direct participant.";
			owner_lazy = () -> com.tools20022.repository.codeset.LimitTypeCode.mmObject();
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
	public static final LimitTypeCode DirectDebit = new LimitTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DirectDebit";
			definition = "Limit not to be exceeded for direct debit operations.";
			owner_lazy = () -> com.tools20022.repository.codeset.LimitTypeCode.mmObject();
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
	public static final LimitTypeCode SingleCustomerDirectDebit = new LimitTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SingleCustomerDirectDebit";
			definition = "Single direct debit payment limit not to be exceeded by any single direct debit transaction by a customer.";
			owner_lazy = () -> com.tools20022.repository.codeset.LimitTypeCode.mmObject();
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
	public static final LimitTypeCode SingleFinancialInstitutionDirectDebit = new LimitTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SingleFinancialInstitutionDirectDebit";
			definition = "Single direct debit payment limit not to be exceeded by any single direct debit transaction initiated by a financial institution.";
			owner_lazy = () -> com.tools20022.repository.codeset.LimitTypeCode.mmObject();
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
	public static final LimitTypeCode TotalDailyCustomerDirectDebit = new LimitTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalDailyCustomerDirectDebit";
			definition = "Total daily payments limit for customer direct debits not to be exceeded by the total of all direct debit transactions initiated by customers.";
			owner_lazy = () -> com.tools20022.repository.codeset.LimitTypeCode.mmObject();
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
	public static final LimitTypeCode TotalDailyFinancialInstitutionDirectDebit = new LimitTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalDailyFinancialInstitutionDirectDebit";
			definition = "Total daily payments limit for financial institutions direct debits not to be exceeded by the total of all direct debit transactions initiated by financial institutions.";
			owner_lazy = () -> com.tools20022.repository.codeset.LimitTypeCode.mmObject();
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
	public static final LimitTypeCode AutoCollateralisation = new LimitTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AutoCollateralisation";
			definition = "Limit is related to a credit operation that is or can be triggered when a buyer does not have a sufficient amount of money to settle a securities transaction in order to improve its cash position for the next settlement cycle. The credit provided can be secured using securities already held by the buyer (“collateral stocks”) or the securities that are being purchased (“collateral flows”).";
			owner_lazy = () -> com.tools20022.repository.codeset.LimitTypeCode.mmObject();
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
	public static final LimitTypeCode UnsecuredCredit = new LimitTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnsecuredCredit";
			definition = "Limit is related to a cap amount granted by a national central bank or a settlement bank, but generally unsecured outside of the market infrastructure.";
			owner_lazy = () -> com.tools20022.repository.codeset.LimitTypeCode.mmObject();
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
	public static final LimitTypeCode ExternalGuarantee = new LimitTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExternalGuarantee";
			definition = "Limit is related to a cap amount granted by a national central bank or a settlement bank.";
			owner_lazy = () -> com.tools20022.repository.codeset.LimitTypeCode.mmObject();
			codeName = "EXGT";
		}
	};
	final static private LinkedHashMap<String, LimitTypeCode> codesByName = new LinkedHashMap<>();

	protected LimitTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("MULT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "LimitTypeCode";
				definition = "Specifies the type of risk management limit.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.LimitTypeCode.Multilateral, com.tools20022.repository.codeset.LimitTypeCode.Bilateral, com.tools20022.repository.codeset.LimitTypeCode.NetBilateral,
						com.tools20022.repository.codeset.LimitTypeCode.IndirectBilateral, com.tools20022.repository.codeset.LimitTypeCode.Global, com.tools20022.repository.codeset.LimitTypeCode.MandatoryBilateral,
						com.tools20022.repository.codeset.LimitTypeCode.DiscretionaryBilateral, com.tools20022.repository.codeset.LimitTypeCode.DirectDebit, com.tools20022.repository.codeset.LimitTypeCode.SingleCustomerDirectDebit,
						com.tools20022.repository.codeset.LimitTypeCode.SingleFinancialInstitutionDirectDebit, com.tools20022.repository.codeset.LimitTypeCode.TotalDailyCustomerDirectDebit,
						com.tools20022.repository.codeset.LimitTypeCode.TotalDailyFinancialInstitutionDirectDebit, com.tools20022.repository.codeset.LimitTypeCode.AutoCollateralisation,
						com.tools20022.repository.codeset.LimitTypeCode.UnsecuredCredit, com.tools20022.repository.codeset.LimitTypeCode.ExternalGuarantee);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Multilateral.getCodeName().get(), Multilateral);
		codesByName.put(Bilateral.getCodeName().get(), Bilateral);
		codesByName.put(NetBilateral.getCodeName().get(), NetBilateral);
		codesByName.put(IndirectBilateral.getCodeName().get(), IndirectBilateral);
		codesByName.put(Global.getCodeName().get(), Global);
		codesByName.put(MandatoryBilateral.getCodeName().get(), MandatoryBilateral);
		codesByName.put(DiscretionaryBilateral.getCodeName().get(), DiscretionaryBilateral);
		codesByName.put(DirectDebit.getCodeName().get(), DirectDebit);
		codesByName.put(SingleCustomerDirectDebit.getCodeName().get(), SingleCustomerDirectDebit);
		codesByName.put(SingleFinancialInstitutionDirectDebit.getCodeName().get(), SingleFinancialInstitutionDirectDebit);
		codesByName.put(TotalDailyCustomerDirectDebit.getCodeName().get(), TotalDailyCustomerDirectDebit);
		codesByName.put(TotalDailyFinancialInstitutionDirectDebit.getCodeName().get(), TotalDailyFinancialInstitutionDirectDebit);
		codesByName.put(AutoCollateralisation.getCodeName().get(), AutoCollateralisation);
		codesByName.put(UnsecuredCredit.getCodeName().get(), UnsecuredCredit);
		codesByName.put(ExternalGuarantee.getCodeName().get(), ExternalGuarantee);
	}

	public static LimitTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static LimitTypeCode[] values() {
		LimitTypeCode[] values = new LimitTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, LimitTypeCode> {
		@Override
		public LimitTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(LimitTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}