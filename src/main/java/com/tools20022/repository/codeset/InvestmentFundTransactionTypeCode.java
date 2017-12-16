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
import com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode#Redemption
 * InvestmentFundTransactionTypeCode.mmRedemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode#Subscription
 * InvestmentFundTransactionTypeCode.mmSubscription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode#SubscriptionSavingsPlan
 * InvestmentFundTransactionTypeCode.mmSubscriptionSavingsPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode#RedemptionWithdrawingPlan
 * InvestmentFundTransactionTypeCode.mmRedemptionWithdrawingPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode#Switch
 * InvestmentFundTransactionTypeCode.mmSwitch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode#CorporationActionEvent
 * InvestmentFundTransactionTypeCode.mmCorporationActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode#TransferIn
 * InvestmentFundTransactionTypeCode.mmTransferIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode#TransferOut
 * InvestmentFundTransactionTypeCode.mmTransferOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode#SwitchIn
 * InvestmentFundTransactionTypeCode.mmSwitchIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode#SwitchOut
 * InvestmentFundTransactionTypeCode.mmSwitchOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode#SubscriptionAssetAllocation
 * InvestmentFundTransactionTypeCode.mmSubscriptionAssetAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode#RedemptionAssetAllocation
 * InvestmentFundTransactionTypeCode.mmRedemptionAssetAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode#CrossIn
 * InvestmentFundTransactionTypeCode.mmCrossIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode#CrossOut
 * InvestmentFundTransactionTypeCode.mmCrossOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode#InSpecie
 * InvestmentFundTransactionTypeCode.mmInSpecie}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode#Dividend
 * InvestmentFundTransactionTypeCode.mmDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode#Other
 * InvestmentFundTransactionTypeCode.mmOther}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode#ReinvestmentOfDividend
 * InvestmentFundTransactionTypeCode.mmReinvestmentOfDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode#All
 * InvestmentFundTransactionTypeCode.mmAll}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode#SecuritiesPurchase
 * InvestmentFundTransactionTypeCode.mmSecuritiesPurchase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode#SecuritiesSale
 * InvestmentFundTransactionTypeCode.mmSecuritiesSale}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode#CashWithdrawal
 * InvestmentFundTransactionTypeCode.mmCashWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode#CashDeposit
 * InvestmentFundTransactionTypeCode.mmCashDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode#DividendPayment
 * InvestmentFundTransactionTypeCode.mmDividendPayment}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.TransactionType1Code
 * TransactionType1Code}</li>
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
 * <li>"REDM"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InvestmentFundTransactionTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of transaction."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class InvestmentFundTransactionTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Transaction is a redemption of an investment fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode
	 * InvestmentFundTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REDM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Redemption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is a redemption of an investment fund."</li>
	 * </ul>
	 */
	public static final InvestmentFundTransactionTypeCode Redemption = new InvestmentFundTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Redemption";
			definition = "Transaction is a redemption of an investment fund.";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode.mmObject();
			codeName = "REDM";
		}
	};
	/**
	 * Transaction is a subscription to an investment fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode
	 * InvestmentFundTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SUBS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Subscription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is a subscription to an investment fund."</li>
	 * </ul>
	 */
	public static final InvestmentFundTransactionTypeCode Subscription = new InvestmentFundTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Subscription";
			definition = "Transaction is a subscription to an investment fund.";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode.mmObject();
			codeName = "SUBS";
		}
	};
	/**
	 * Transaction is a subscription for a savings plan, that is, money set
	 * aside by individuals in the framework of a structured plan for a special
	 * purpose, for example, retirement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode
	 * InvestmentFundTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSPL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubscriptionSavingsPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a subscription for a savings plan, that is, money set aside by individuals in the framework of a structured plan for a special purpose, for example, retirement."
	 * </li>
	 * </ul>
	 */
	public static final InvestmentFundTransactionTypeCode SubscriptionSavingsPlan = new InvestmentFundTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SubscriptionSavingsPlan";
			definition = "Transaction is a subscription for a savings plan, that is, money set aside by individuals in the framework of a structured plan for a special purpose, for example, retirement.";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode.mmObject();
			codeName = "SSPL";
		}
	};
	/**
	 * Transaction is a withdrawal by individuals in the framework of a
	 * structured plan for investments made in the past.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode
	 * InvestmentFundTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RWPL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionWithdrawingPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a withdrawal by individuals in the framework of a structured plan for investments made in the past."
	 * </li>
	 * </ul>
	 */
	public static final InvestmentFundTransactionTypeCode RedemptionWithdrawingPlan = new InvestmentFundTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RedemptionWithdrawingPlan";
			definition = "Transaction is a withdrawal by individuals in the framework of a structured plan for investments made in the past.";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode.mmObject();
			codeName = "RWPL";
		}
	};
	/**
	 * Transaction is a change between investment funds (usually of the same
	 * family) with or without cash in/out, at more interesting conditions than
	 * a separate redemption or a separate subscription.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode
	 * InvestmentFundTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SWIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Switch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a change between investment funds (usually of the same family) with or without cash in/out, at more interesting conditions than a separate redemption or a separate subscription."
	 * </li>
	 * </ul>
	 */
	public static final InvestmentFundTransactionTypeCode Switch = new InvestmentFundTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Switch";
			definition = "Transaction is a change between investment funds (usually of the same family) with or without cash in/out, at more interesting conditions than a separate redemption or a separate subscription.";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode.mmObject();
			codeName = "SWIC";
		}
	};
	/**
	 * Transaction is the result of a corporate action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode
	 * InvestmentFundTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CAEV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporationActionEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is the result of a corporate action."</li>
	 * </ul>
	 */
	public static final InvestmentFundTransactionTypeCode CorporationActionEvent = new InvestmentFundTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporationActionEvent";
			definition = "Transaction is the result of a corporate action.";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode.mmObject();
			codeName = "CAEV";
		}
	};
	/**
	 * Transaction is an incoming credit to an account on the shareholders
	 * register, and is not linked to a shift in investment (subscription or
	 * switch), but to account management.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode
	 * InvestmentFundTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferIn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is an incoming credit to an account on the shareholders register, and is not linked to a shift in investment (subscription or switch), but to account management."
	 * </li>
	 * </ul>
	 */
	public static final InvestmentFundTransactionTypeCode TransferIn = new InvestmentFundTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransferIn";
			definition = "Transaction is an incoming credit to an account on the shareholders register, and is not linked to a shift in investment (subscription or switch), but to account management.";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode.mmObject();
			codeName = "TRIN";
		}
	};
	/**
	 * Transaction is a debit to an account on the shareholders register, and is
	 * not linked to a shift in investment (redemption or switch), but to
	 * account management.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode
	 * InvestmentFundTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TOUT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferOut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a debit to an account on the shareholders register, and is not linked to a shift in investment (redemption or switch), but to account management."
	 * </li>
	 * </ul>
	 */
	public static final InvestmentFundTransactionTypeCode TransferOut = new InvestmentFundTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransferOut";
			definition = "Transaction is a debit to an account on the shareholders register, and is not linked to a shift in investment (redemption or switch), but to account management.";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode.mmObject();
			codeName = "TOUT";
		}
	};
	/**
	 * Transaction is a subscription leg of a switch order execution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode
	 * InvestmentFundTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SWII"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SwitchIn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a subscription leg of a switch order execution."</li>
	 * </ul>
	 */
	public static final InvestmentFundTransactionTypeCode SwitchIn = new InvestmentFundTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SwitchIn";
			definition = "Transaction is a subscription leg of a switch order execution.";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode.mmObject();
			codeName = "SWII";
		}
	};
	/**
	 * Transaction is a subscription leg of a switch order execution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode
	 * InvestmentFundTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SWIO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SwitchOut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a subscription leg of a switch order execution."</li>
	 * </ul>
	 */
	public static final InvestmentFundTransactionTypeCode SwitchOut = new InvestmentFundTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SwitchOut";
			definition = "Transaction is a subscription leg of a switch order execution.";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode.mmObject();
			codeName = "SWIO";
		}
	};
	/**
	 * Transaction is a subscription in an asset allocation plan that enables
	 * investors to allocate, by percentage a certain amount of cash into
	 * several sub-funds of a same umbrella structure.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode
	 * InvestmentFundTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SUAA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubscriptionAssetAllocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a subscription in an asset allocation plan that enables investors to allocate, by percentage a certain amount of cash into several sub-funds of a same umbrella structure."
	 * </li>
	 * </ul>
	 */
	public static final InvestmentFundTransactionTypeCode SubscriptionAssetAllocation = new InvestmentFundTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SubscriptionAssetAllocation";
			definition = "Transaction is a subscription in an asset allocation plan that enables investors to allocate, by percentage a certain amount of cash into several sub-funds of a same umbrella structure.";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode.mmObject();
			codeName = "SUAA";
		}
	};
	/**
	 * Transaction is a redemption in an asset allocation plan which enables
	 * investors to withdraw, by percentage a certain amount of cash from
	 * several sub-funds of a same umbrella structure.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode
	 * InvestmentFundTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REAA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionAssetAllocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a redemption in an asset allocation plan which enables investors to withdraw, by percentage a certain amount of cash from several sub-funds of a same umbrella structure."
	 * </li>
	 * </ul>
	 */
	public static final InvestmentFundTransactionTypeCode RedemptionAssetAllocation = new InvestmentFundTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RedemptionAssetAllocation";
			definition = "Transaction is a redemption in an asset allocation plan which enables investors to withdraw, by percentage a certain amount of cash from several sub-funds of a same umbrella structure.";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode.mmObject();
			codeName = "REAA";
		}
	};
	/**
	 * Transaction is a cross-in.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode
	 * InvestmentFundTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CROI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CrossIn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is a cross-in."</li>
	 * </ul>
	 */
	public static final InvestmentFundTransactionTypeCode CrossIn = new InvestmentFundTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CrossIn";
			definition = "Transaction is a cross-in.";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode.mmObject();
			codeName = "CROI";
		}
	};
	/**
	 * Transaction is a cross out.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode
	 * InvestmentFundTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CROO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CrossOut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is a cross out."</li>
	 * </ul>
	 */
	public static final InvestmentFundTransactionTypeCode CrossOut = new InvestmentFundTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CrossOut";
			definition = "Transaction is a cross out.";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode.mmObject();
			codeName = "CROO";
		}
	};
	/**
	 * Transaction is an InSpecie
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode
	 * InvestmentFundTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INSP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InSpecie"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is an InSpecie"</li>
	 * </ul>
	 */
	public static final InvestmentFundTransactionTypeCode InSpecie = new InvestmentFundTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InSpecie";
			definition = "Transaction is an InSpecie";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode.mmObject();
			codeName = "INSP";
		}
	};
	/**
	 * Transaction is a dividend.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode
	 * InvestmentFundTransactionTypeCode}</li>
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
	 * definition} = "Transaction is a dividend."</li>
	 * </ul>
	 */
	public static final InvestmentFundTransactionTypeCode Dividend = new InvestmentFundTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Dividend";
			definition = "Transaction is a dividend.";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode.mmObject();
			codeName = "DIVI";
		}
	};
	/**
	 * Transaction is another type of transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode
	 * InvestmentFundTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is another type of transaction."</li>
	 * </ul>
	 */
	public static final InvestmentFundTransactionTypeCode Other = new InvestmentFundTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Other";
			definition = "Transaction is another type of transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Transaction is a reinvestment of dividend.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode
	 * InvestmentFundTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RDIV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReinvestmentOfDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is a reinvestment of dividend."</li>
	 * </ul>
	 */
	public static final InvestmentFundTransactionTypeCode ReinvestmentOfDividend = new InvestmentFundTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReinvestmentOfDividend";
			definition = "Transaction is a reinvestment of dividend.";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode.mmObject();
			codeName = "RDIV";
		}
	};
	/**
	 * All types of transactions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode
	 * InvestmentFundTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ALLL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "All"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "All types of transactions."</li>
	 * </ul>
	 */
	public static final InvestmentFundTransactionTypeCode All = new InvestmentFundTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "All";
			definition = "All types of transactions.";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode.mmObject();
			codeName = "ALLL";
		}
	};
	/**
	 * Purchase of securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode
	 * InvestmentFundTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BUYI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesPurchase"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Purchase of securities."</li>
	 * </ul>
	 */
	public static final InvestmentFundTransactionTypeCode SecuritiesPurchase = new InvestmentFundTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesPurchase";
			definition = "Purchase of securities.";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode.mmObject();
			codeName = "BUYI";
		}
	};
	/**
	 * Sale of securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode
	 * InvestmentFundTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SELL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesSale"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sale of securities."</li>
	 * </ul>
	 */
	public static final InvestmentFundTransactionTypeCode SecuritiesSale = new InvestmentFundTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesSale";
			definition = "Sale of securities.";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode.mmObject();
			codeName = "SELL";
		}
	};
	/**
	 * Transaction is a cash withdrawal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode
	 * InvestmentFundTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CWIT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashWithdrawal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is a cash withdrawal."</li>
	 * </ul>
	 */
	public static final InvestmentFundTransactionTypeCode CashWithdrawal = new InvestmentFundTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashWithdrawal";
			definition = "Transaction is a cash withdrawal.";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode.mmObject();
			codeName = "CWIT";
		}
	};
	/**
	 * Transaction is a cash deposit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode
	 * InvestmentFundTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CDEP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDeposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is a cash deposit."</li>
	 * </ul>
	 */
	public static final InvestmentFundTransactionTypeCode CashDeposit = new InvestmentFundTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDeposit";
			definition = "Transaction is a cash deposit.";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode.mmObject();
			codeName = "CDEP";
		}
	};
	/**
	 * Transaction is the payment of dividends and other proceeds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode
	 * InvestmentFundTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DIVP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is the payment of dividends and other proceeds."</li>
	 * </ul>
	 */
	public static final InvestmentFundTransactionTypeCode DividendPayment = new InvestmentFundTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendPayment";
			definition = "Transaction is the payment of dividends and other proceeds.";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode.mmObject();
			codeName = "DIVP";
		}
	};
	final static private LinkedHashMap<String, InvestmentFundTransactionTypeCode> codesByName = new LinkedHashMap<>();

	protected InvestmentFundTransactionTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("REDM");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvestmentFundTransactionTypeCode";
				definition = "Specifies the type of transaction.";
				derivation_lazy = () -> Arrays.asList(TransactionType1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode.Redemption, com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode.Subscription,
						com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode.SubscriptionSavingsPlan, com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode.RedemptionWithdrawingPlan,
						com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode.Switch, com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode.CorporationActionEvent,
						com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode.TransferIn, com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode.TransferOut,
						com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode.SwitchIn, com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode.SwitchOut,
						com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode.SubscriptionAssetAllocation, com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode.RedemptionAssetAllocation,
						com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode.CrossIn, com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode.CrossOut,
						com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode.InSpecie, com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode.Dividend,
						com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode.Other, com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode.ReinvestmentOfDividend,
						com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode.All, com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode.SecuritiesPurchase,
						com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode.SecuritiesSale, com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode.CashWithdrawal,
						com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode.CashDeposit, com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode.DividendPayment);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Redemption.getCodeName().get(), Redemption);
		codesByName.put(Subscription.getCodeName().get(), Subscription);
		codesByName.put(SubscriptionSavingsPlan.getCodeName().get(), SubscriptionSavingsPlan);
		codesByName.put(RedemptionWithdrawingPlan.getCodeName().get(), RedemptionWithdrawingPlan);
		codesByName.put(Switch.getCodeName().get(), Switch);
		codesByName.put(CorporationActionEvent.getCodeName().get(), CorporationActionEvent);
		codesByName.put(TransferIn.getCodeName().get(), TransferIn);
		codesByName.put(TransferOut.getCodeName().get(), TransferOut);
		codesByName.put(SwitchIn.getCodeName().get(), SwitchIn);
		codesByName.put(SwitchOut.getCodeName().get(), SwitchOut);
		codesByName.put(SubscriptionAssetAllocation.getCodeName().get(), SubscriptionAssetAllocation);
		codesByName.put(RedemptionAssetAllocation.getCodeName().get(), RedemptionAssetAllocation);
		codesByName.put(CrossIn.getCodeName().get(), CrossIn);
		codesByName.put(CrossOut.getCodeName().get(), CrossOut);
		codesByName.put(InSpecie.getCodeName().get(), InSpecie);
		codesByName.put(Dividend.getCodeName().get(), Dividend);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(ReinvestmentOfDividend.getCodeName().get(), ReinvestmentOfDividend);
		codesByName.put(All.getCodeName().get(), All);
		codesByName.put(SecuritiesPurchase.getCodeName().get(), SecuritiesPurchase);
		codesByName.put(SecuritiesSale.getCodeName().get(), SecuritiesSale);
		codesByName.put(CashWithdrawal.getCodeName().get(), CashWithdrawal);
		codesByName.put(CashDeposit.getCodeName().get(), CashDeposit);
		codesByName.put(DividendPayment.getCodeName().get(), DividendPayment);
	}

	public static InvestmentFundTransactionTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static InvestmentFundTransactionTypeCode[] values() {
		InvestmentFundTransactionTypeCode[] values = new InvestmentFundTransactionTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, InvestmentFundTransactionTypeCode> {
		@Override
		public InvestmentFundTransactionTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(InvestmentFundTransactionTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}