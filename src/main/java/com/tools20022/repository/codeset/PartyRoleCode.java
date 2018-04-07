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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.PartyRoleCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the role of the party in the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyRoleCode#LiquidityManager
 * PartyRoleCode.LiquidityManager}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyRoleCode#LimitManager
 * PartyRoleCode.LimitManager}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyRoleCode#PaymentManager
 * PartyRoleCode.PaymentManager}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyRoleCode#Reader
 * PartyRoleCode.Reader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyRoleCode#BackupManager
 * PartyRoleCode.BackupManager}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyRoleCode#SettlementManager
 * PartyRoleCode.SettlementManager}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyRoleCode#FundManagementCompany
 * PartyRoleCode.FundManagementCompany}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyRoleCode#TransferAgent
 * PartyRoleCode.TransferAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyRoleCode#FundAccountant
 * PartyRoleCode.FundAccountant}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyRoleCode#Registrar
 * PartyRoleCode.Registrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyRoleCode#InvestmentManager
 * PartyRoleCode.InvestmentManager}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyRoleCode#Custodian
 * PartyRoleCode.Custodian}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyRoleCode#Auditor
 * PartyRoleCode.Auditor}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyRoleCode#PayingAgent
 * PartyRoleCode.PayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyRoleCode#CashCorrespondent
 * PartyRoleCode.CashCorrespondent}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyRoleCode#DataProvider
 * PartyRoleCode.DataProvider}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyRoleCode#FinalAgent
 * PartyRoleCode.FinalAgent}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyRoleCode#Investor
 * PartyRoleCode.Investor}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyRoleCode#FirstAgent
 * PartyRoleCode.FirstAgent}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyRoleCode#Intermediary
 * PartyRoleCode.Intermediary}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyRoleCode#Distributor
 * PartyRoleCode.Distributor}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyRoleCode#Concentrator
 * PartyRoleCode.Concentrator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyRoleCode#UnderlyingClient1
 * PartyRoleCode.UnderlyingClient1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyRoleCode#UnderlyingClient2
 * PartyRoleCode.UnderlyingClient2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyRoleCode#TransmittingAgent
 * PartyRoleCode.TransmittingAgent}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyRoleCode#FundBroker
 * PartyRoleCode.FundBroker}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyRoleCode#FinancialAdvisor
 * PartyRoleCode.FinancialAdvisor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyRoleCode#ContactPersonAtInstructingPartyInstitution
 * PartyRoleCode.ContactPersonAtInstructingPartyInstitution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyRoleCode#ContactPersonAtExecutingPartyInstitution
 * PartyRoleCode.ContactPersonAtExecutingPartyInstitution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyRoleCode#NameOfAgentToOrder
 * PartyRoleCode.NameOfAgentToOrder}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyRoleCode#PrimeBroker
 * PartyRoleCode.PrimeBroker}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyRoleCode#Internal
 * PartyRoleCode.Internal}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
 * semanticMarkup} = ISO15022Synonym: :22F::TRCA</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"LQMG"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PartyRoleCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the role of the party in the transaction."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PartyRoleCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Party in a financial institution responsible for the management of
	 * liquidity for the financial institution. This party has access to some
	 * functions available on the system, such as the liquidity transfers
	 * ormanagement of standing instructions for liquidity control.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyRoleCode
	 * PartyRoleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LQMG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LiquidityManager"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party in a financial institution responsible for the management of liquidity for the financial institution. This party has access to some functions available on the system, such as the liquidity transfers ormanagement of standing instructions for liquidity control."
	 * </li>
	 * </ul>
	 */
	public static final PartyRoleCode LiquidityManager = new PartyRoleCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LiquidityManager";
			definition = "Party in a financial institution responsible for the management of liquidity for the financial institution. This party has access to some functions available on the system, such as the liquidity transfers ormanagement of standing instructions for liquidity control.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyRoleCode.mmObject();
			codeName = "LQMG";
		}
	};
	/**
	 * Party in a financial institution responsible for the management of the
	 * limits. This party is responsible for fixing, modifying, or suspending
	 * limits as relevant for the management of counterpart risk or systemic
	 * risk containment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyRoleCode
	 * PartyRoleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LMMG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitManager"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party in a financial institution responsible for the management of the limits. This party is responsible for fixing, modifying, or suspending limits as relevant for the management of counterpart risk or systemic risk containment."
	 * </li>
	 * </ul>
	 */
	public static final PartyRoleCode LimitManager = new PartyRoleCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LimitManager";
			definition = "Party in a financial institution responsible for the management of the limits. This party is responsible for fixing, modifying, or suspending limits as relevant for the management of counterpart risk or systemic risk containment.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyRoleCode.mmObject();
			codeName = "LMMG";
		}
	};
	/**
	 * Party in a financial institution responsible for the management of
	 * payment processing for the financial institution. This includes
	 * authorising, recycling, and modification of payment transactions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyRoleCode
	 * PartyRoleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PYMG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentManager"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party in a financial institution responsible for the management of payment processing for the financial institution. This includes authorising, recycling, and modification of payment transactions."
	 * </li>
	 * </ul>
	 */
	public static final PartyRoleCode PaymentManager = new PartyRoleCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentManager";
			definition = "Party in a financial institution responsible for the management of payment processing for the financial institution. This includes authorising, recycling, and modification of payment transactions.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyRoleCode.mmObject();
			codeName = "PYMG";
		}
	};
	/**
	 * Party in a financial institution entitled to obtain information from the
	 * system, but not act upon/alter this information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyRoleCode
	 * PartyRoleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REDR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reader"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party in a financial institution entitled to obtain information from the system, but not act upon/alter this information."
	 * </li>
	 * </ul>
	 */
	public static final PartyRoleCode Reader = new PartyRoleCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Reader";
			definition = "Party in a financial institution entitled to obtain information from the system, but not act upon/alter this information.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyRoleCode.mmObject();
			codeName = "REDR";
		}
	};
	/**
	 * Party responsible for managing the recovery functions related to a
	 * system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyRoleCode
	 * PartyRoleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BKMG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BackupManager"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party responsible for managing the recovery functions related to a system."
	 * </li>
	 * </ul>
	 */
	public static final PartyRoleCode BackupManager = new PartyRoleCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BackupManager";
			definition = "Party responsible for managing the recovery functions related to a system.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyRoleCode.mmObject();
			codeName = "BKMG";
		}
	};
	/**
	 * Party in a financial institution responsible for the management of
	 * settlement processing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyRoleCode
	 * PartyRoleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STMG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementManager"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party in a financial institution responsible for the management of settlement processing."
	 * </li>
	 * </ul>
	 */
	public static final PartyRoleCode SettlementManager = new PartyRoleCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementManager";
			definition = "Party in a financial institution responsible for the management of settlement processing.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyRoleCode.mmObject();
			codeName = "STMG";
		}
	};
	/**
	 * Party that sets up a fund, decides upon the investment strategy, appoints
	 * agents, and is responsible for the promotion and the marketing of the
	 * fund. This party makes all the strategic decisions related to a fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyRoleCode
	 * PartyRoleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FMCO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundManagementCompany"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that sets up a fund, decides upon the investment strategy, appoints agents, and is responsible for the promotion and the marketing of the fund. This party makes all the strategic decisions related to a fund."
	 * </li>
	 * </ul>
	 */
	public static final PartyRoleCode FundManagementCompany = new PartyRoleCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FundManagementCompany";
			definition = "Party that sets up a fund, decides upon the investment strategy, appoints agents, and is responsible for the promotion and the marketing of the fund. This party makes all the strategic decisions related to a fund.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyRoleCode.mmObject();
			codeName = "FMCO";
		}
	};
	/**
	 * Party appointed by the fund management company. This party updates
	 * records of investor accounts to reflect the daily investor purchases,
	 * redemptions, switches, transfers, and re-registrations. It ensures the
	 * timely settlement of transactions, and may provide tax information to the
	 * investor and/or to its intermediaries. It may calculate, collect, and
	 * rebate commissions. It prepares and distributes confirmations reflecting
	 * transactions, resulting in unit or cash account movements to the investor
	 * or the investor's intermediary. It responds to inquiries concerning
	 * account status, and processes the income distribution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyRoleCode
	 * PartyRoleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRAG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party appointed by the fund management company. This party updates records of investor accounts to reflect the daily investor purchases, redemptions, switches, transfers, and re-registrations. It ensures the timely settlement of transactions, and may provide tax information to the investor and/or to its intermediaries. It may calculate, collect, and rebate commissions. It prepares and distributes confirmations reflecting transactions, resulting in unit or cash account movements to the investor or the investor's intermediary. It responds to inquiries concerning account status, and processes the income distribution."
	 * </li>
	 * </ul>
	 */
	public static final PartyRoleCode TransferAgent = new PartyRoleCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransferAgent";
			definition = "Party appointed by the fund management company. This party updates records of investor accounts to reflect the daily investor purchases, redemptions, switches, transfers, and re-registrations. It ensures the timely settlement of transactions, and may provide tax information to the investor and/or to its intermediaries. It may calculate, collect, and rebate commissions. It prepares and distributes confirmations reflecting transactions, resulting in unit or cash account movements to the investor or the investor's intermediary. It responds to inquiries concerning account status, and processes the income distribution.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyRoleCode.mmObject();
			codeName = "TRAG";
		}
	};
	/**
	 * Party that keeps accounting records of the available assets and
	 * liabilities of the fund. This party calculates deal prices, the Net Asset
	 * Value (NAV) of the fund, and may provide fund performance and tax data.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyRoleCode
	 * PartyRoleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FACT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundAccountant"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that keeps accounting records of the available assets and liabilities of the fund. This party calculates deal prices, the Net Asset Value (NAV) of the fund, and may provide fund performance and tax data."
	 * </li>
	 * </ul>
	 */
	public static final PartyRoleCode FundAccountant = new PartyRoleCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FundAccountant";
			definition = "Party that keeps accounting records of the available assets and liabilities of the fund. This party calculates deal prices, the Net Asset Value (NAV) of the fund, and may provide fund performance and tax data.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyRoleCode.mmObject();
			codeName = "FACT";
		}
	};
	/**
	 * Party responsible for keeping track of the owners of securities. In the
	 * investment fund business, this party keeps the investor registry of the
	 * fund, and administers investor accounts and related records. It is
	 * appointed by the fund management company.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyRoleCode
	 * PartyRoleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REGI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Registrar"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party responsible for keeping track of the owners of securities. In the investment fund business, this party keeps the investor registry of the fund, and administers investor accounts and related records. It is appointed by the fund management company."
	 * </li>
	 * </ul>
	 */
	public static final PartyRoleCode Registrar = new PartyRoleCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Registrar";
			definition = "Party responsible for keeping track of the owners of securities. In the investment fund business, this party keeps the investor registry of the fund, and administers investor accounts and related records. It is appointed by the fund management company.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyRoleCode.mmObject();
			codeName = "REGI";
		}
	};
	/**
	 * Party that implements the investment strategy, ie, selects portfolio
	 * investments in accordance with the objectives and strategy in the fund's
	 * prospectus, and places orders to effect or liquidate selected investments
	 * in accordance with net flow of capital into or out of the fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyRoleCode
	 * PartyRoleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INVE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentManager"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that implements the investment strategy, ie, selects portfolio investments in accordance with the objectives and strategy in the fund's prospectus, and places orders to effect or liquidate selected investments in accordance with net flow of capital into or out of the fund."
	 * </li>
	 * </ul>
	 */
	public static final PartyRoleCode InvestmentManager = new PartyRoleCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentManager";
			definition = "Party that implements the investment strategy, ie, selects portfolio investments in accordance with the objectives and strategy in the fund's prospectus, and places orders to effect or liquidate selected investments in accordance with net flow of capital into or out of the fund.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyRoleCode.mmObject();
			codeName = "INVE";
		}
	};
	/**
	 * Party that safekeeps and administers assets on behalf of the owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyRoleCode
	 * PartyRoleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CUST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Custodian"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that safekeeps and administers assets on behalf of the owner."</li>
	 * </ul>
	 */
	public static final PartyRoleCode Custodian = new PartyRoleCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Custodian";
			definition = "Party that safekeeps and administers assets on behalf of the owner.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyRoleCode.mmObject();
			codeName = "CUST";
		}
	};
	/**
	 * Party that regularly monitors compliance with the legal regulations.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyRoleCode
	 * PartyRoleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AUDT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Auditor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that regularly monitors compliance with the legal regulations."</li>
	 * </ul>
	 */
	public static final PartyRoleCode Auditor = new PartyRoleCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Auditor";
			definition = "Party that regularly monitors compliance with the legal regulations.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyRoleCode.mmObject();
			codeName = "AUDT";
		}
	};
	/**
	 * Agent that executes the payment. In the context of the investment fund
	 * industry, the paying agent is the local legal representative of the fund.
	 * It may pay out dividends, and collects money for the purchase of funds
	 * when a client deals directly with the fund and/or when a client deals
	 * with bearer shares. It pays out the redemption of the fund, may
	 * distribute information about the fund, and provides legal information
	 * about the fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyRoleCode
	 * PartyRoleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PAYI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayingAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agent that executes the payment. In the context of the investment fund industry, the paying agent is the local legal representative of the fund. It may pay out dividends, and collects money for the purchase of funds when a client deals directly with the fund and/or when a client deals with bearer shares. It pays out the redemption of the fund, may distribute information about the fund, and provides legal information about the fund."
	 * </li>
	 * </ul>
	 */
	public static final PartyRoleCode PayingAgent = new PartyRoleCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PayingAgent";
			definition = "Agent that executes the payment. In the context of the investment fund industry, the paying agent is the local legal representative of the fund. It may pay out dividends, and collects money for the purchase of funds when a client deals directly with the fund and/or when a client deals with bearer shares. It pays out the redemption of the fund, may distribute information about the fund, and provides legal information about the fund.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyRoleCode.mmObject();
			codeName = "PAYI";
		}
	};
	/**
	 * Financial institution that executes cash transfers on behalf of its
	 * clients.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyRoleCode
	 * PartyRoleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CACO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashCorrespondent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial institution that executes cash transfers on behalf of its clients."
	 * </li>
	 * </ul>
	 */
	public static final PartyRoleCode CashCorrespondent = new PartyRoleCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashCorrespondent";
			definition = "Financial institution that executes cash transfers on behalf of its clients.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyRoleCode.mmObject();
			codeName = "CACO";
		}
	};
	/**
	 * Source of financial information. Provides financial news and data (for
	 * example, facts, statistics and analysis), for professional and individual
	 * investors through various media, for example, the Internet, magazines.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyRoleCode
	 * PartyRoleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DATP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DataProvider"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Source of financial information. Provides financial news and data (for example, facts, statistics and analysis), for professional and individual investors through various media, for example, the Internet, magazines."
	 * </li>
	 * </ul>
	 */
	public static final PartyRoleCode DataProvider = new PartyRoleCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DataProvider";
			definition = "Source of financial information. Provides financial news and data (for example, facts, statistics and analysis), for professional and individual investors through various media, for example, the Internet, magazines.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyRoleCode.mmObject();
			codeName = "DATP";
		}
	};
	/**
	 * Financial institution that receives the payment transaction on behalf of
	 * an account owner, or other nominated party, and credits the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyRoleCode
	 * PartyRoleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FIAG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinalAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial institution that receives the payment transaction on behalf of an account owner, or other nominated party, and credits the account."
	 * </li>
	 * </ul>
	 */
	public static final PartyRoleCode FinalAgent = new PartyRoleCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FinalAgent";
			definition = "Financial institution that receives the payment transaction on behalf of an account owner, or other nominated party, and credits the account.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyRoleCode.mmObject();
			codeName = "FIAG";
		}
	};
	/**
	 * Party, either an individual or organisation, whose assets are being
	 * invested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyRoleCode
	 * PartyRoleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INVS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Investor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party, either an individual or organisation, whose assets are being invested."
	 * </li>
	 * </ul>
	 */
	public static final PartyRoleCode Investor = new PartyRoleCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Investor";
			definition = "Party, either an individual or organisation, whose assets are being invested.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyRoleCode.mmObject();
			codeName = "INVS";
		}
	};
	/**
	 * Financial institution that receives the payment transaction from the
	 * account owner, or other authorised party, and processes the instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyRoleCode
	 * PartyRoleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FTAG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial institution that receives the payment transaction from the account owner, or other authorised party, and processes the instruction."
	 * </li>
	 * </ul>
	 */
	public static final PartyRoleCode FirstAgent = new PartyRoleCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FirstAgent";
			definition = "Financial institution that receives the payment transaction from the account owner, or other authorised party, and processes the instruction.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyRoleCode.mmObject();
			codeName = "FTAG";
		}
	};
	/**
	 * Party that provides services to investors relating to financial products.
	 * These services may include some, or all of, provision of information and
	 * advice on products, placement of investment orders, transmission of
	 * payment, custody of assets, and the administration of rights and
	 * benefits. In the specific framework of investment funds industry, an
	 * intermediary may present information about funds to potential investors,
	 * and solicit orders for the fund. This intermediary may facilitate the
	 * transmission of the orders and information from/to the investors and/or
	 * other intermediaries. The intermediary receives commission from the Fund
	 * and/or fees from the investor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyRoleCode
	 * PartyRoleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Intermediary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that provides services to investors relating to financial products. These services may include some, or all of, provision of information and advice on products, placement of investment orders, transmission of payment, custody of assets, and the administration of rights and benefits. In the specific framework of investment funds industry, an intermediary may present information about funds to potential investors, and solicit orders for the fund. This intermediary may facilitate the transmission of the orders and information from/to the investors and/or other intermediaries. The intermediary receives commission from the Fund and/or fees from the investor."
	 * </li>
	 * </ul>
	 */
	public static final PartyRoleCode Intermediary = new PartyRoleCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Intermediary";
			definition = "Party that provides services to investors relating to financial products. These services may include some, or all of, provision of information and advice on products, placement of investment orders, transmission of payment, custody of assets, and the administration of rights and benefits. In the specific framework of investment funds industry, an intermediary may present information about funds to potential investors, and solicit orders for the fund. This intermediary may facilitate the transmission of the orders and information from/to the investors and/or other intermediaries. The intermediary receives commission from the Fund and/or fees from the investor.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyRoleCode.mmObject();
			codeName = "INTR";
		}
	};
	/**
	 * Party that act as an wholesaler of funds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyRoleCode
	 * PartyRoleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DIST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Distributor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that act as an wholesaler of funds."</li>
	 * </ul>
	 */
	public static final PartyRoleCode Distributor = new PartyRoleCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Distributor";
			definition = "Party that act as an wholesaler of funds.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyRoleCode.mmObject();
			codeName = "DIST";
		}
	};
	/**
	 * Party that acts as an aggregator of funds, also called a funds hub.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyRoleCode
	 * PartyRoleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CONC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Concentrator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that acts as an aggregator of funds, also called a funds hub."</li>
	 * </ul>
	 */
	public static final PartyRoleCode Concentrator = new PartyRoleCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Concentrator";
			definition = "Party that acts as an aggregator of funds, also called a funds hub.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyRoleCode.mmObject();
			codeName = "CONC";
		}
	};
	/**
	 * Underlying client of the intermediary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyRoleCode
	 * PartyRoleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UCL1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingClient1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying client of the intermediary."</li>
	 * </ul>
	 */
	public static final PartyRoleCode UnderlyingClient1 = new PartyRoleCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnderlyingClient1";
			definition = "Underlying client of the intermediary.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyRoleCode.mmObject();
			codeName = "UCL1";
		}
	};
	/**
	 * Underlying client of underlying client 1.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyRoleCode
	 * PartyRoleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UCL2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingClient2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying client of underlying client 1."</li>
	 * </ul>
	 */
	public static final PartyRoleCode UnderlyingClient2 = new PartyRoleCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnderlyingClient2";
			definition = "Underlying client of underlying client 1.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyRoleCode.mmObject();
			codeName = "UCL2";
		}
	};
	/**
	 * Party that transmits the instruction, advice, notification or report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyRoleCode
	 * PartyRoleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransmittingAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that transmits the instruction, advice, notification or report."</li>
	 * </ul>
	 */
	public static final PartyRoleCode TransmittingAgent = new PartyRoleCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransmittingAgent";
			definition = "Party that transmits the instruction, advice, notification or report.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyRoleCode.mmObject();
			codeName = "TRAN";
		}
	};
	/**
	 * Party acting as an intermediary agent between an investor and a transfer
	 * agent for the subscription or redemption to a fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyRoleCode
	 * PartyRoleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FNBR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundBroker"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party acting as an intermediary agent between an investor and a transfer agent for the subscription or redemption to a fund."
	 * </li>
	 * </ul>
	 */
	public static final PartyRoleCode FundBroker = new PartyRoleCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FundBroker";
			definition = "Party acting as an intermediary agent between an investor and a transfer agent for the subscription or redemption to a fund.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyRoleCode.mmObject();
			codeName = "FNBR";
		}
	};
	/**
	 * Party that supplies information and advice on investment products.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyRoleCode
	 * PartyRoleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FIAD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialAdvisor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that supplies information and advice on investment products."</li>
	 * </ul>
	 */
	public static final PartyRoleCode FinancialAdvisor = new PartyRoleCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FinancialAdvisor";
			definition = "Party that supplies information and advice on investment products.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyRoleCode.mmObject();
			codeName = "FIAD";
		}
	};
	/**
	 * Party acting as the contact person at the instructing party institution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyRoleCode
	 * PartyRoleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CONI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContactPersonAtInstructingPartyInstitution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party acting as the contact person at the instructing party institution."
	 * </li>
	 * </ul>
	 */
	public static final PartyRoleCode ContactPersonAtInstructingPartyInstitution = new PartyRoleCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContactPersonAtInstructingPartyInstitution";
			definition = "Party acting as the contact person at the instructing party institution.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyRoleCode.mmObject();
			codeName = "CONI";
		}
	};
	/**
	 * Party acting as the contact person at the executing party institution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyRoleCode
	 * PartyRoleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CONE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContactPersonAtExecutingPartyInstitution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party acting as the contact person at the executing party institution."</li>
	 * </ul>
	 */
	public static final PartyRoleCode ContactPersonAtExecutingPartyInstitution = new PartyRoleCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContactPersonAtExecutingPartyInstitution";
			definition = "Party acting as the contact person at the executing party institution.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyRoleCode.mmObject();
			codeName = "CONE";
		}
	};
	/**
	 * Name of Agent to the order, if different from the instructing party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyRoleCode
	 * PartyRoleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CONA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NameOfAgentToOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name of Agent to the order, if different from the instructing party."</li>
	 * </ul>
	 */
	public static final PartyRoleCode NameOfAgentToOrder = new PartyRoleCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NameOfAgentToOrder";
			definition = "Name of Agent to the order, if different from the instructing party.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyRoleCode.mmObject();
			codeName = "CONA";
		}
	};
	/**
	 * Party acting as settlement agent, provides custody for assets, provides
	 * financing for leverage, and prepares daily account statements for its
	 * clients, who are money managers, hedge funds, market makers,
	 * arbitrageurs, specialists and other professional investors.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyRoleCode
	 * PartyRoleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRBR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrimeBroker"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party acting as settlement agent, provides custody for assets, provides financing for leverage, and prepares daily account statements for its clients, who are money managers, hedge funds, market makers, arbitrageurs, specialists and other professional investors."
	 * </li>
	 * </ul>
	 */
	public static final PartyRoleCode PrimeBroker = new PartyRoleCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrimeBroker";
			definition = "Party acting as settlement agent, provides custody for assets, provides financing for leverage, and prepares daily account statements for its clients, who are money managers, hedge funds, market makers, arbitrageurs, specialists and other professional investors.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyRoleCode.mmObject();
			codeName = "PRBR";
		}
	};
	/**
	 * Party acting as an internal agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyRoleCode
	 * PartyRoleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INTC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Internal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party acting as an internal agent."</li>
	 * </ul>
	 */
	public static final PartyRoleCode Internal = new PartyRoleCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Internal";
			definition = "Party acting as an internal agent.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyRoleCode.mmObject();
			codeName = "INTC";
		}
	};
	final static private LinkedHashMap<String, PartyRoleCode> codesByName = new LinkedHashMap<>();

	protected PartyRoleCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::TRCA"));
				example = Arrays.asList("LQMG");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PartyRoleCode";
				definition = "Specifies the role of the party in the transaction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PartyRoleCode.LiquidityManager, com.tools20022.repository.codeset.PartyRoleCode.LimitManager, com.tools20022.repository.codeset.PartyRoleCode.PaymentManager,
						com.tools20022.repository.codeset.PartyRoleCode.Reader, com.tools20022.repository.codeset.PartyRoleCode.BackupManager, com.tools20022.repository.codeset.PartyRoleCode.SettlementManager,
						com.tools20022.repository.codeset.PartyRoleCode.FundManagementCompany, com.tools20022.repository.codeset.PartyRoleCode.TransferAgent, com.tools20022.repository.codeset.PartyRoleCode.FundAccountant,
						com.tools20022.repository.codeset.PartyRoleCode.Registrar, com.tools20022.repository.codeset.PartyRoleCode.InvestmentManager, com.tools20022.repository.codeset.PartyRoleCode.Custodian,
						com.tools20022.repository.codeset.PartyRoleCode.Auditor, com.tools20022.repository.codeset.PartyRoleCode.PayingAgent, com.tools20022.repository.codeset.PartyRoleCode.CashCorrespondent,
						com.tools20022.repository.codeset.PartyRoleCode.DataProvider, com.tools20022.repository.codeset.PartyRoleCode.FinalAgent, com.tools20022.repository.codeset.PartyRoleCode.Investor,
						com.tools20022.repository.codeset.PartyRoleCode.FirstAgent, com.tools20022.repository.codeset.PartyRoleCode.Intermediary, com.tools20022.repository.codeset.PartyRoleCode.Distributor,
						com.tools20022.repository.codeset.PartyRoleCode.Concentrator, com.tools20022.repository.codeset.PartyRoleCode.UnderlyingClient1, com.tools20022.repository.codeset.PartyRoleCode.UnderlyingClient2,
						com.tools20022.repository.codeset.PartyRoleCode.TransmittingAgent, com.tools20022.repository.codeset.PartyRoleCode.FundBroker, com.tools20022.repository.codeset.PartyRoleCode.FinancialAdvisor,
						com.tools20022.repository.codeset.PartyRoleCode.ContactPersonAtInstructingPartyInstitution, com.tools20022.repository.codeset.PartyRoleCode.ContactPersonAtExecutingPartyInstitution,
						com.tools20022.repository.codeset.PartyRoleCode.NameOfAgentToOrder, com.tools20022.repository.codeset.PartyRoleCode.PrimeBroker, com.tools20022.repository.codeset.PartyRoleCode.Internal);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(LiquidityManager.getCodeName().get(), LiquidityManager);
		codesByName.put(LimitManager.getCodeName().get(), LimitManager);
		codesByName.put(PaymentManager.getCodeName().get(), PaymentManager);
		codesByName.put(Reader.getCodeName().get(), Reader);
		codesByName.put(BackupManager.getCodeName().get(), BackupManager);
		codesByName.put(SettlementManager.getCodeName().get(), SettlementManager);
		codesByName.put(FundManagementCompany.getCodeName().get(), FundManagementCompany);
		codesByName.put(TransferAgent.getCodeName().get(), TransferAgent);
		codesByName.put(FundAccountant.getCodeName().get(), FundAccountant);
		codesByName.put(Registrar.getCodeName().get(), Registrar);
		codesByName.put(InvestmentManager.getCodeName().get(), InvestmentManager);
		codesByName.put(Custodian.getCodeName().get(), Custodian);
		codesByName.put(Auditor.getCodeName().get(), Auditor);
		codesByName.put(PayingAgent.getCodeName().get(), PayingAgent);
		codesByName.put(CashCorrespondent.getCodeName().get(), CashCorrespondent);
		codesByName.put(DataProvider.getCodeName().get(), DataProvider);
		codesByName.put(FinalAgent.getCodeName().get(), FinalAgent);
		codesByName.put(Investor.getCodeName().get(), Investor);
		codesByName.put(FirstAgent.getCodeName().get(), FirstAgent);
		codesByName.put(Intermediary.getCodeName().get(), Intermediary);
		codesByName.put(Distributor.getCodeName().get(), Distributor);
		codesByName.put(Concentrator.getCodeName().get(), Concentrator);
		codesByName.put(UnderlyingClient1.getCodeName().get(), UnderlyingClient1);
		codesByName.put(UnderlyingClient2.getCodeName().get(), UnderlyingClient2);
		codesByName.put(TransmittingAgent.getCodeName().get(), TransmittingAgent);
		codesByName.put(FundBroker.getCodeName().get(), FundBroker);
		codesByName.put(FinancialAdvisor.getCodeName().get(), FinancialAdvisor);
		codesByName.put(ContactPersonAtInstructingPartyInstitution.getCodeName().get(), ContactPersonAtInstructingPartyInstitution);
		codesByName.put(ContactPersonAtExecutingPartyInstitution.getCodeName().get(), ContactPersonAtExecutingPartyInstitution);
		codesByName.put(NameOfAgentToOrder.getCodeName().get(), NameOfAgentToOrder);
		codesByName.put(PrimeBroker.getCodeName().get(), PrimeBroker);
		codesByName.put(Internal.getCodeName().get(), Internal);
	}

	public static PartyRoleCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PartyRoleCode[] values() {
		PartyRoleCode[] values = new PartyRoleCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PartyRoleCode> {
		@Override
		public PartyRoleCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PartyRoleCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}