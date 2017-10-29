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
 * Specifies the reason for a conditionally accepted status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode#AwaitingMoney
 * ConditionallyAcceptedStatusReasonCode.AwaitingMoney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode#AwaitingFunds
 * ConditionallyAcceptedStatusReasonCode.AwaitingFunds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode#AwaitingDocuments
 * ConditionallyAcceptedStatusReasonCode.AwaitingDocuments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode#AwaitingRedemptionMoney
 * ConditionallyAcceptedStatusReasonCode.AwaitingRedemptionMoney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode#AwaitingSubscriptionMoney
 * ConditionallyAcceptedStatusReasonCode.AwaitingSubscriptionMoney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode#Other
 * ConditionallyAcceptedStatusReasonCode.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode#PossibleDuplicate
 * ConditionallyAcceptedStatusReasonCode.PossibleDuplicate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode#TradingLimitExceeded
 * ConditionallyAcceptedStatusReasonCode.TradingLimitExceeded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode#BenefitPlanDeclaration
 * ConditionallyAcceptedStatusReasonCode.BenefitPlanDeclaration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode#ERISADeclaration
 * ConditionallyAcceptedStatusReasonCode.ERISADeclaration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode#AMLDocuments
 * ConditionallyAcceptedStatusReasonCode.AMLDocuments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode#AwaitingApproval
 * ConditionallyAcceptedStatusReasonCode.AwaitingApproval}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode#AdditionalFundingRequired
 * ConditionallyAcceptedStatusReasonCode.AdditionalFundingRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode#BelowMinimumInitialInvestmentAmount
 * ConditionallyAcceptedStatusReasonCode.BelowMinimumInitialInvestmentAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode#BelowMinimumTopUpAmount
 * ConditionallyAcceptedStatusReasonCode.BelowMinimumTopUpAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode#InsufficientCapacity
 * ConditionallyAcceptedStatusReasonCode.InsufficientCapacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode#PercentageHoldingBreach
 * ConditionallyAcceptedStatusReasonCode.PercentageHoldingBreach}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode#BelowMinimumRedemptionAmount
 * ConditionallyAcceptedStatusReasonCode.BelowMinimumRedemptionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode#BelowMinimumRetainedAmount
 * ConditionallyAcceptedStatusReasonCode.BelowMinimumRetainedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode#LockUp
 * ConditionallyAcceptedStatusReasonCode.LockUp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode#AssetsIlliquid
 * ConditionallyAcceptedStatusReasonCode.AssetsIlliquid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode#Discretion
 * ConditionallyAcceptedStatusReasonCode.Discretion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode#SubscriptionTopUpAmount
 * ConditionallyAcceptedStatusReasonCode.SubscriptionTopUpAmount}</li>
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
 * <li>"AWMO"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ConditionallyAcceptedStatusReasonCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the reason for a conditionally accepted status."</li>
 * </ul>
 */
public class ConditionallyAcceptedStatusReasonCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Order is accepted for further processing but the execution of the order
	 * is pending until there is enough cash in the account to pay the
	 * subscription.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode
	 * ConditionallyAcceptedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AWMO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingMoney"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Order is accepted for further processing but the execution of the order is pending until there is enough cash in the account to pay the subscription."
	 * </li>
	 * </ul>
	 */
	public static final MMCode AwaitingMoney = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingMoney";
			definition = "Order is accepted for further processing but the execution of the order is pending until there is enough cash in the account to pay the subscription.";
			owner_lazy = () -> ConditionallyAcceptedStatusReasonCode.mmObject();
			codeName = "AWMO";
		}
	};
	/**
	 * Order is accepted for further processing but the execution of the order
	 * is pending until there are enough funds in the account to complete it.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode
	 * ConditionallyAcceptedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AWSH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingFunds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Order is accepted for further processing but the execution of the order is pending until there are enough funds in the account to complete it."
	 * </li>
	 * </ul>
	 */
	public static final MMCode AwaitingFunds = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingFunds";
			definition = "Order is accepted for further processing but the execution of the order is pending until there are enough funds in the account to complete it.";
			owner_lazy = () -> ConditionallyAcceptedStatusReasonCode.mmObject();
			codeName = "AWSH";
		}
	};
	/**
	 * Order is pending until documents are completed and received, eg, legal
	 * documents from the successor, legal proceeds because of bankruptcy,
	 * missing signature.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode
	 * ConditionallyAcceptedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DOCC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingDocuments"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Order is pending until documents are completed and received, eg, legal documents from the successor, legal proceeds because of bankruptcy, missing signature."
	 * </li>
	 * </ul>
	 */
	public static final MMCode AwaitingDocuments = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingDocuments";
			definition = "Order is pending until documents are completed and received, eg, legal documents from the successor, legal proceeds because of bankruptcy, missing signature.";
			owner_lazy = () -> ConditionallyAcceptedStatusReasonCode.mmObject();
			codeName = "DOCC";
		}
	};
	/**
	 * Order is accepted for further processing but the execution of the order
	 * is pending until there are enough funds in the account to complete the
	 * redemption.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode
	 * ConditionallyAcceptedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AWRM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingRedemptionMoney"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Order is accepted for further processing but the execution of the order is pending until there are enough funds in the account to complete the redemption."
	 * </li>
	 * </ul>
	 */
	public static final MMCode AwaitingRedemptionMoney = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingRedemptionMoney";
			definition = "Order is accepted for further processing but the execution of the order is pending until there are enough funds in the account to complete the redemption.";
			owner_lazy = () -> ConditionallyAcceptedStatusReasonCode.mmObject();
			codeName = "AWRM";
		}
	};
	/**
	 * Order is accepted for further processing but the execution of the order
	 * is pending until there is enough cash in the account to pay the
	 * subscription.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode
	 * ConditionallyAcceptedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AWSM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingSubscriptionMoney"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Order is accepted for further processing but the execution of the order is pending until there is enough cash in the account to pay the subscription."
	 * </li>
	 * </ul>
	 */
	public static final MMCode AwaitingSubscriptionMoney = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingSubscriptionMoney";
			definition = "Order is accepted for further processing but the execution of the order is pending until there is enough cash in the account to pay the subscription.";
			owner_lazy = () -> ConditionallyAcceptedStatusReasonCode.mmObject();
			codeName = "AWSM";
		}
	};
	/**
	 * Another reason for the conditionally accepted status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode
	 * ConditionallyAcceptedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Another reason for the conditionally accepted status."</li>
	 * </ul>
	 */
	public static final MMCode Other = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Another reason for the conditionally accepted status.";
			owner_lazy = () -> ConditionallyAcceptedStatusReasonCode.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Order is accepted for further processing pending the result of the
	 * investigation for possible duplicates.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode
	 * ConditionallyAcceptedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DUPL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PossibleDuplicate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Order is accepted for further processing pending the result of the investigation for possible duplicates."
	 * </li>
	 * </ul>
	 */
	public static final MMCode PossibleDuplicate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PossibleDuplicate";
			definition = "Order is accepted for further processing pending the result of the investigation for possible duplicates.";
			owner_lazy = () -> ConditionallyAcceptedStatusReasonCode.mmObject();
			codeName = "DUPL";
		}
	};
	/**
	 * Order is accepted for further processing pending the extension of the
	 * trading limit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode
	 * ConditionallyAcceptedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRED"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingLimitExceeded"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Order is accepted for further processing pending the extension of the trading limit."
	 * </li>
	 * </ul>
	 */
	public static final MMCode TradingLimitExceeded = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingLimitExceeded";
			definition = "Order is accepted for further processing pending the extension of the trading limit.";
			owner_lazy = () -> ConditionallyAcceptedStatusReasonCode.mmObject();
			codeName = "CRED";
		}
	};
	/**
	 * Order is accepted for further processing but the execution of the order
	 * is pending the benefit plan investor (BPI) declaration.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode
	 * ConditionallyAcceptedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BPID"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BenefitPlanDeclaration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Order is accepted for further processing but the execution of the order is pending the benefit plan investor (BPI) declaration."
	 * </li>
	 * </ul>
	 */
	public static final MMCode BenefitPlanDeclaration = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BenefitPlanDeclaration";
			definition = "Order is accepted for further processing but the execution of the order is pending the benefit plan investor (BPI) declaration.";
			owner_lazy = () -> ConditionallyAcceptedStatusReasonCode.mmObject();
			codeName = "BPID";
		}
	};
	/**
	 * Order is accepted for further processing but the execution of the order
	 * is pending the ERISA declaration.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode
	 * ConditionallyAcceptedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ERIS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ERISADeclaration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Order is accepted for further processing but the execution of the order is pending the ERISA declaration."
	 * </li>
	 * </ul>
	 */
	public static final MMCode ERISADeclaration = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ERISADeclaration";
			definition = "Order is accepted for further processing but the execution of the order is pending the ERISA declaration.";
			owner_lazy = () -> ConditionallyAcceptedStatusReasonCode.mmObject();
			codeName = "ERIS";
		}
	};
	/**
	 * Order is accepted for further processing but the execution of the order
	 * is pending until the required anti-money laundering documentation is
	 * presented to the transfer agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode
	 * ConditionallyAcceptedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AMLD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AMLDocuments"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Order is accepted for further processing but the execution of the order is pending until the required anti-money laundering documentation is presented to the transfer agent."
	 * </li>
	 * </ul>
	 */
	public static final MMCode AMLDocuments = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AMLDocuments";
			definition = "Order is accepted for further processing but the execution of the order is pending until the required anti-money laundering documentation is presented to the transfer agent.";
			owner_lazy = () -> ConditionallyAcceptedStatusReasonCode.mmObject();
			codeName = "AMLD";
		}
	};
	/**
	 * Order is accepted for further processing but the execution of the order
	 * is pending the investment manager's approval.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode
	 * ConditionallyAcceptedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "APPR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingApproval"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Order is accepted for further processing but the execution of the order is pending the investment manager's approval."
	 * </li>
	 * </ul>
	 */
	public static final MMCode AwaitingApproval = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingApproval";
			definition = "Order is accepted for further processing but the execution of the order is pending the investment manager's approval.";
			owner_lazy = () -> ConditionallyAcceptedStatusReasonCode.mmObject();
			codeName = "APPR";
		}
	};
	/**
	 * Order is accepted for further processing but the execution of the
	 * subscription order is pending as additional funding is required.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode
	 * ConditionallyAcceptedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AFUN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalFundingRequired"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Order is accepted for further processing but the execution of the subscription order is pending as additional funding is required."
	 * </li>
	 * </ul>
	 */
	public static final MMCode AdditionalFundingRequired = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalFundingRequired";
			definition = "Order is accepted for further processing but the execution of the subscription order is pending as additional funding is required.";
			owner_lazy = () -> ConditionallyAcceptedStatusReasonCode.mmObject();
			codeName = "AFUN";
		}
	};
	/**
	 * Order is accepted for further processing but the execution of the order
	 * is pending as the order is below the minimum initial investment amount
	 * and is subject to the investment manager's approval.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode
	 * ConditionallyAcceptedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BMIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BelowMinimumInitialInvestmentAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Order is accepted for further processing but the execution of the order is pending as the order is below the minimum initial investment amount and is subject to the investment manager's approval."
	 * </li>
	 * </ul>
	 */
	public static final MMCode BelowMinimumInitialInvestmentAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BelowMinimumInitialInvestmentAmount";
			definition = "Order is accepted for further processing but the execution of the order is pending as the order is below the minimum initial investment amount and is subject to the investment manager's approval.";
			owner_lazy = () -> ConditionallyAcceptedStatusReasonCode.mmObject();
			codeName = "BMIN";
		}
	};
	/**
	 * Order is accepted for further processing but the execution of the
	 * subscription order is pending as the order is below the minimum top-up
	 * investment and is subject to the investment manager's approval.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode
	 * ConditionallyAcceptedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BMTO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BelowMinimumTopUpAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Order is accepted for further processing but the execution of the subscription order is pending as the order is below the minimum top-up investment and is subject to the investment manager's approval."
	 * </li>
	 * </ul>
	 */
	public static final MMCode BelowMinimumTopUpAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BelowMinimumTopUpAmount";
			definition = "Order is accepted for further processing but the execution of the subscription order is pending as the order is below the minimum top-up investment and is subject to the investment manager's approval.";
			owner_lazy = () -> ConditionallyAcceptedStatusReasonCode.mmObject();
			codeName = "BMTO";
		}
	};
	/**
	 * Order is accepted for further processing but the execution of the order
	 * is pending as there is insufficient capacity and the order is subject to
	 * the investment manager's approval.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode
	 * ConditionallyAcceptedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INSU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientCapacity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Order is accepted for further processing but the execution of the order is pending as there is insufficient capacity and the order is subject to the investment manager's approval."
	 * </li>
	 * </ul>
	 */
	public static final MMCode InsufficientCapacity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientCapacity";
			definition = "Order is accepted for further processing but the execution of the order is pending as there is insufficient capacity and the order is subject to the investment manager's approval.";
			owner_lazy = () -> ConditionallyAcceptedStatusReasonCode.mmObject();
			codeName = "INSU";
		}
	};
	/**
	 * Order is accepted for further processing but the execution of the order
	 * is pending because of a percentage holding breach, eg, PPM rules;
	 * taxation rules (ERISA).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode
	 * ConditionallyAcceptedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRCT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PercentageHoldingBreach"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Order is accepted for further processing but the execution of the order is pending because of a percentage holding breach, eg, PPM rules; taxation rules (ERISA)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode PercentageHoldingBreach = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PercentageHoldingBreach";
			definition = "Order is accepted for further processing but the execution of the order is pending because of a percentage holding breach, eg, PPM rules; taxation rules (ERISA).";
			owner_lazy = () -> ConditionallyAcceptedStatusReasonCode.mmObject();
			codeName = "PRCT";
		}
	};
	/**
	 * Order is accepted for further processing but the execution of the
	 * redemption order is pending as it is below the minimum redemption amount
	 * and subject to the investment manager's approval.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode
	 * ConditionallyAcceptedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BMRA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BelowMinimumRedemptionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Order is accepted for further processing but the execution of the redemption order is pending as it is below the minimum redemption amount and subject to the investment manager's approval."
	 * </li>
	 * </ul>
	 */
	public static final MMCode BelowMinimumRedemptionAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BelowMinimumRedemptionAmount";
			definition = "Order is accepted for further processing but the execution of the redemption order is pending as it is below the minimum redemption amount and subject to the investment manager's approval.";
			owner_lazy = () -> ConditionallyAcceptedStatusReasonCode.mmObject();
			codeName = "BMRA";
		}
	};
	/**
	 * Order is accepted for further processing but the execution of the
	 * redemption order is pending as the holding will be below the minimum
	 * retained value and subject to the investment manager's approval.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode
	 * ConditionallyAcceptedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BMRV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BelowMinimumRetainedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Order is accepted for further processing but the execution of the redemption order is pending as the holding will be below the minimum retained value and subject to the investment manager's approval."
	 * </li>
	 * </ul>
	 */
	public static final MMCode BelowMinimumRetainedAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BelowMinimumRetainedAmount";
			definition = "Order is accepted for further processing but the execution of the redemption order is pending as the holding will be below the minimum retained value and subject to the investment manager's approval.";
			owner_lazy = () -> ConditionallyAcceptedStatusReasonCode.mmObject();
			codeName = "BMRV";
		}
	};
	/**
	 * Order is accepted for further processing but the execution of the order
	 * is pending as a lock-up period is in place and subject to the investment
	 * manager's approval.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode
	 * ConditionallyAcceptedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LOCK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LockUp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Order is accepted for further processing but the execution of the order is pending as a lock-up period is in place and subject to the investment manager's approval."
	 * </li>
	 * </ul>
	 */
	public static final MMCode LockUp = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LockUp";
			definition = "Order is accepted for further processing but the execution of the order is pending as a lock-up period is in place and subject to the investment manager's approval.";
			owner_lazy = () -> ConditionallyAcceptedStatusReasonCode.mmObject();
			codeName = "LOCK";
		}
	};
	/**
	 * Order is accepted for further processing but the execution of the
	 * redemption order is pending as assets are illiquid and the order is
	 * subject to the investment manager's approval.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode
	 * ConditionallyAcceptedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ILLI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssetsIlliquid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Order is accepted for further processing but the execution of the redemption order is pending as assets are illiquid and the order is subject to the investment manager's approval."
	 * </li>
	 * </ul>
	 */
	public static final MMCode AssetsIlliquid = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssetsIlliquid";
			definition = "Order is accepted for further processing but the execution of the redemption order is pending as assets are illiquid and the order is subject to the investment manager's approval.";
			owner_lazy = () -> ConditionallyAcceptedStatusReasonCode.mmObject();
			codeName = "ILLI";
		}
	};
	/**
	 * Order is accepted for further processing but the execution of the
	 * redemption order is pending as it is subject to the investment manager's
	 * discretion.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode
	 * ConditionallyAcceptedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DISC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Discretion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Order is accepted for further processing but the execution of the redemption order is pending as it is subject to the investment manager's discretion."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Discretion = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Discretion";
			definition = "Order is accepted for further processing but the execution of the redemption order is pending as it is subject to the investment manager's discretion.";
			owner_lazy = () -> ConditionallyAcceptedStatusReasonCode.mmObject();
			codeName = "DISC";
		}
	};
	/**
	 * Order is accepted for further processing but the execution of the
	 * subscription order is pending as the order is below the minimum
	 * investment and a top-up is required.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode
	 * ConditionallyAcceptedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STOP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubscriptionTopUpAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Order is accepted for further processing but the execution of the subscription order is pending as the order is below the minimum investment and a top-up is required."
	 * </li>
	 * </ul>
	 */
	public static final MMCode SubscriptionTopUpAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubscriptionTopUpAmount";
			definition = "Order is accepted for further processing but the execution of the subscription order is pending as the order is below the minimum investment and a top-up is required.";
			owner_lazy = () -> ConditionallyAcceptedStatusReasonCode.mmObject();
			codeName = "STOP";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("AWMO");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ConditionallyAcceptedStatusReasonCode";
				definition = "Specifies the reason for a conditionally accepted status.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode.AwaitingMoney, com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode.AwaitingFunds,
						com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode.AwaitingDocuments, com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode.AwaitingRedemptionMoney,
						com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode.AwaitingSubscriptionMoney, com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode.Other,
						com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode.PossibleDuplicate, com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode.TradingLimitExceeded,
						com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode.BenefitPlanDeclaration, com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode.ERISADeclaration,
						com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode.AMLDocuments, com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode.AwaitingApproval,
						com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode.AdditionalFundingRequired, com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode.BelowMinimumInitialInvestmentAmount,
						com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode.BelowMinimumTopUpAmount, com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode.InsufficientCapacity,
						com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode.PercentageHoldingBreach, com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode.BelowMinimumRedemptionAmount,
						com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode.BelowMinimumRetainedAmount, com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode.LockUp,
						com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode.AssetsIlliquid, com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode.Discretion,
						com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode.SubscriptionTopUpAmount);
			}
		});
		return mmObject_lazy.get();
	}
}