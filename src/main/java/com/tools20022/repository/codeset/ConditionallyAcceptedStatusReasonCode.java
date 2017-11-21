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
 * Specifies the reason for a conditionally accepted status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode#mmAwaitingMoney
 * ConditionallyAcceptedStatusReasonCode.mmAwaitingMoney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode#mmAwaitingFunds
 * ConditionallyAcceptedStatusReasonCode.mmAwaitingFunds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode#mmAwaitingDocuments
 * ConditionallyAcceptedStatusReasonCode.mmAwaitingDocuments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode#mmAwaitingRedemptionMoney
 * ConditionallyAcceptedStatusReasonCode.mmAwaitingRedemptionMoney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode#mmAwaitingSubscriptionMoney
 * ConditionallyAcceptedStatusReasonCode.mmAwaitingSubscriptionMoney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode#mmOther
 * ConditionallyAcceptedStatusReasonCode.mmOther}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode#mmPossibleDuplicate
 * ConditionallyAcceptedStatusReasonCode.mmPossibleDuplicate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode#mmTradingLimitExceeded
 * ConditionallyAcceptedStatusReasonCode.mmTradingLimitExceeded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode#mmBenefitPlanDeclaration
 * ConditionallyAcceptedStatusReasonCode.mmBenefitPlanDeclaration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode#mmERISADeclaration
 * ConditionallyAcceptedStatusReasonCode.mmERISADeclaration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode#mmAMLDocuments
 * ConditionallyAcceptedStatusReasonCode.mmAMLDocuments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode#mmAwaitingApproval
 * ConditionallyAcceptedStatusReasonCode.mmAwaitingApproval}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode#mmAdditionalFundingRequired
 * ConditionallyAcceptedStatusReasonCode.mmAdditionalFundingRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode#mmBelowMinimumInitialInvestmentAmount
 * ConditionallyAcceptedStatusReasonCode.mmBelowMinimumInitialInvestmentAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode#mmBelowMinimumTopUpAmount
 * ConditionallyAcceptedStatusReasonCode.mmBelowMinimumTopUpAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode#mmInsufficientCapacity
 * ConditionallyAcceptedStatusReasonCode.mmInsufficientCapacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode#mmPercentageHoldingBreach
 * ConditionallyAcceptedStatusReasonCode.mmPercentageHoldingBreach}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode#mmBelowMinimumRedemptionAmount
 * ConditionallyAcceptedStatusReasonCode.mmBelowMinimumRedemptionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode#mmBelowMinimumRetainedAmount
 * ConditionallyAcceptedStatusReasonCode.mmBelowMinimumRetainedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode#mmLockUp
 * ConditionallyAcceptedStatusReasonCode.mmLockUp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode#mmAssetsIlliquid
 * ConditionallyAcceptedStatusReasonCode.mmAssetsIlliquid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode#mmDiscretion
 * ConditionallyAcceptedStatusReasonCode.mmDiscretion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode#mmSubscriptionTopUpAmount
 * ConditionallyAcceptedStatusReasonCode.mmSubscriptionTopUpAmount}</li>
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
	public static final MMCode mmAwaitingMoney = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode mmAwaitingFunds = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode mmAwaitingDocuments = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode mmAwaitingRedemptionMoney = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode mmAwaitingSubscriptionMoney = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode mmOther = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode mmPossibleDuplicate = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode mmTradingLimitExceeded = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode mmBenefitPlanDeclaration = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode mmERISADeclaration = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode mmAMLDocuments = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode mmAwaitingApproval = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode mmAdditionalFundingRequired = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode mmBelowMinimumInitialInvestmentAmount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode mmBelowMinimumTopUpAmount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode mmInsufficientCapacity = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode mmPercentageHoldingBreach = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode mmBelowMinimumRedemptionAmount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode mmBelowMinimumRetainedAmount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode mmLockUp = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode mmAssetsIlliquid = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode mmDiscretion = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode mmSubscriptionTopUpAmount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubscriptionTopUpAmount";
			definition = "Order is accepted for further processing but the execution of the subscription order is pending as the order is below the minimum investment and a top-up is required.";
			owner_lazy = () -> ConditionallyAcceptedStatusReasonCode.mmObject();
			codeName = "STOP";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("AWMO");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ConditionallyAcceptedStatusReasonCode";
				definition = "Specifies the reason for a conditionally accepted status.";
				code_lazy = () -> Arrays.asList(ConditionallyAcceptedStatusReasonCode.mmAwaitingMoney, ConditionallyAcceptedStatusReasonCode.mmAwaitingFunds, ConditionallyAcceptedStatusReasonCode.mmAwaitingDocuments,
						ConditionallyAcceptedStatusReasonCode.mmAwaitingRedemptionMoney, ConditionallyAcceptedStatusReasonCode.mmAwaitingSubscriptionMoney, ConditionallyAcceptedStatusReasonCode.mmOther,
						ConditionallyAcceptedStatusReasonCode.mmPossibleDuplicate, ConditionallyAcceptedStatusReasonCode.mmTradingLimitExceeded, ConditionallyAcceptedStatusReasonCode.mmBenefitPlanDeclaration,
						ConditionallyAcceptedStatusReasonCode.mmERISADeclaration, ConditionallyAcceptedStatusReasonCode.mmAMLDocuments, ConditionallyAcceptedStatusReasonCode.mmAwaitingApproval,
						ConditionallyAcceptedStatusReasonCode.mmAdditionalFundingRequired, ConditionallyAcceptedStatusReasonCode.mmBelowMinimumInitialInvestmentAmount, ConditionallyAcceptedStatusReasonCode.mmBelowMinimumTopUpAmount,
						ConditionallyAcceptedStatusReasonCode.mmInsufficientCapacity, ConditionallyAcceptedStatusReasonCode.mmPercentageHoldingBreach, ConditionallyAcceptedStatusReasonCode.mmBelowMinimumRedemptionAmount,
						ConditionallyAcceptedStatusReasonCode.mmBelowMinimumRetainedAmount, ConditionallyAcceptedStatusReasonCode.mmLockUp, ConditionallyAcceptedStatusReasonCode.mmAssetsIlliquid,
						ConditionallyAcceptedStatusReasonCode.mmDiscretion, ConditionallyAcceptedStatusReasonCode.mmSubscriptionTopUpAmount);
			}
		});
		return mmObject_lazy.get();
	}
}