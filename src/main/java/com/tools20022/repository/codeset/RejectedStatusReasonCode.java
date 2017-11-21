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
 * Cash settlement date is not recognised or is invalid.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmSettlementDate
 * RejectedStatusReasonCode.mmSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmAcquisitionDate
 * RejectedStatusReasonCode.mmAcquisitionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmDifferentValuationPoints
 * RejectedStatusReasonCode.mmDifferentValuationPoints}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmDeliveringAgent
 * RejectedStatusReasonCode.mmDeliveringAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmDirectDebit
 * RejectedStatusReasonCode.mmDirectDebit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmIntermediary
 * RejectedStatusReasonCode.mmIntermediary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmInvestmentAccount
 * RejectedStatusReasonCode.mmInvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmPaymentCard
 * RejectedStatusReasonCode.mmPaymentCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmInvalidCreditTransfer
 * RejectedStatusReasonCode.mmInvalidCreditTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmSettlementPlace
 * RejectedStatusReasonCode.mmSettlementPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmReceivingAgent
 * RejectedStatusReasonCode.mmReceivingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmSafekeepingPlace
 * RejectedStatusReasonCode.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmInvalidSecurityForm
 * RejectedStatusReasonCode.mmInvalidSecurityForm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmFinancialInstrumentIdentification
 * RejectedStatusReasonCode.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmAccountBlockedForCorporateAction
 * RejectedStatusReasonCode.mmAccountBlockedForCorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmAccountBlockedForTransfer
 * RejectedStatusReasonCode.mmAccountBlockedForTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmAccountBlockedMissingDocuments
 * RejectedStatusReasonCode.mmAccountBlockedMissingDocuments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmNotEnoughCash
 * RejectedStatusReasonCode.mmNotEnoughCash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmNotEnoughFinancialInstrument
 * RejectedStatusReasonCode.mmNotEnoughFinancialInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmFinancialInstrumentIdentificationAndName
 * RejectedStatusReasonCode.mmFinancialInstrumentIdentificationAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmUnacceptedCommissionWaiving
 * RejectedStatusReasonCode.mmUnacceptedCommissionWaiving}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmUnacceptedDealCurrency
 * RejectedStatusReasonCode.mmUnacceptedDealCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmUnacceptedNAVCurrency
 * RejectedStatusReasonCode.mmUnacceptedNAVCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmUnacceptedPaymentMethod
 * RejectedStatusReasonCode.mmUnacceptedPaymentMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmUnacceptedRequestedSettlementCurrency
 * RejectedStatusReasonCode.mmUnacceptedRequestedSettlementCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmTooHighUnitsOrAmountToSubscribe
 * RejectedStatusReasonCode.mmTooHighUnitsOrAmountToSubscribe}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmTooLowUnitsOrAmountToSubscribe
 * RejectedStatusReasonCode.mmTooLowUnitsOrAmountToSubscribe}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmUnknownLinkagesReference
 * RejectedStatusReasonCode.mmUnknownLinkagesReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmPhysicalDeliveryImpossible
 * RejectedStatusReasonCode.mmPhysicalDeliveryImpossible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmDuplicateOrderReference
 * RejectedStatusReasonCode.mmDuplicateOrderReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmInstructingPartyNotAllowedForAccount
 * RejectedStatusReasonCode.mmInstructingPartyNotAllowedForAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmInvalidOrderType
 * RejectedStatusReasonCode.mmInvalidOrderType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmNotCompliantWithSLA
 * RejectedStatusReasonCode.mmNotCompliantWithSLA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmCutOffTime
 * RejectedStatusReasonCode.mmCutOffTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmInvalidOrUnrecognisedReference
 * RejectedStatusReasonCode.mmInvalidOrUnrecognisedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmNotAllowedRequest
 * RejectedStatusReasonCode.mmNotAllowedRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmAlreadyExecuted
 * RejectedStatusReasonCode.mmAlreadyExecuted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmNotAllowedToCancel
 * RejectedStatusReasonCode.mmNotAllowedToCancel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmLegallyImpossible
 * RejectedStatusReasonCode.mmLegallyImpossible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmOther
 * RejectedStatusReasonCode.mmOther}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmFinancialInstrumentQuantity
 * RejectedStatusReasonCode.mmFinancialInstrumentQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmCertificateNumber
 * RejectedStatusReasonCode.mmCertificateNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmSettlementParties
 * RejectedStatusReasonCode.mmSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmTooLate
 * RejectedStatusReasonCode.mmTooLate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmAfterDeadline
 * RejectedStatusReasonCode.mmAfterDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmTradeDate
 * RejectedStatusReasonCode.mmTradeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmFeeOrCommission
 * RejectedStatusReasonCode.mmFeeOrCommission}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmSubscriberOrRedeemer
 * RejectedStatusReasonCode.mmSubscriberOrRedeemer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmSettlementAmountCurrency
 * RejectedStatusReasonCode.mmSettlementAmountCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmPhysicalSettlement
 * RejectedStatusReasonCode.mmPhysicalSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmPlaceOfTrade
 * RejectedStatusReasonCode.mmPlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmSettlementTransaction
 * RejectedStatusReasonCode.mmSettlementTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmRTGSSystem
 * RejectedStatusReasonCode.mmRTGSSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmNoCancellationMatch
 * RejectedStatusReasonCode.mmNoCancellationMatch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmInvestorNameAddressUnknown
 * RejectedStatusReasonCode.mmInvestorNameAddressUnknown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmInsufficientInvestorData
 * RejectedStatusReasonCode.mmInsufficientInvestorData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmInvalidAccountServicer
 * RejectedStatusReasonCode.mmInvalidAccountServicer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmInvalidNomineeAccount
 * RejectedStatusReasonCode.mmInvalidNomineeAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmInvalidNewPlanManager
 * RejectedStatusReasonCode.mmInvalidNewPlanManager}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmCurrentYearPartial
 * RejectedStatusReasonCode.mmCurrentYearPartial}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmPartialNotSupported
 * RejectedStatusReasonCode.mmPartialNotSupported}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmFinancialInstrumentTaxYear
 * RejectedStatusReasonCode.mmFinancialInstrumentTaxYear}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmInvalidISAType
 * RejectedStatusReasonCode.mmInvalidISAType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmInvalidCashAccount
 * RejectedStatusReasonCode.mmInvalidCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmDuplicateTransferReference
 * RejectedStatusReasonCode.mmDuplicateTransferReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmInvalidSettlementAmount
 * RejectedStatusReasonCode.mmInvalidSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmInvalidOrderedAmount
 * RejectedStatusReasonCode.mmInvalidOrderedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmBelowMinimumInitialInvestmentAmount
 * RejectedStatusReasonCode.mmBelowMinimumInitialInvestmentAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmBelowMinimumTopUpAmount
 * RejectedStatusReasonCode.mmBelowMinimumTopUpAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmInsufficientCapacity
 * RejectedStatusReasonCode.mmInsufficientCapacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmPercentageHoldingBreach
 * RejectedStatusReasonCode.mmPercentageHoldingBreach}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmBelowMinimumRedemptionAmount
 * RejectedStatusReasonCode.mmBelowMinimumRedemptionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmBelowMinimumRetainedAmount
 * RejectedStatusReasonCode.mmBelowMinimumRetainedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmLockUp
 * RejectedStatusReasonCode.mmLockUp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmAssetsIlliquid
 * RejectedStatusReasonCode.mmAssetsIlliquid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmDataInvalid
 * RejectedStatusReasonCode.mmDataInvalid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmFundClosed
 * RejectedStatusReasonCode.mmFundClosed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#mmUnacceptableSwitchCombination
 * RejectedStatusReasonCode.mmUnacceptableSwitchCombination}</li>
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
 * <li>"DDAT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RejectedStatusReasonCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Cash settlement date is not recognised or is invalid."</li>
 * </ul>
 */
public class RejectedStatusReasonCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Cash settlement date is not recognised or is invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DDAT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash settlement date is not recognised or is invalid."</li>
	 * </ul>
	 */
	public static final MMCode mmSettlementDate = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementDate";
			definition = "Cash settlement date is not recognised or is invalid.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "DDAT";
		}
	};
	/**
	 * Acquisition date is not recognised or is invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IAQD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcquisitionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Acquisition date is not recognised or is invalid."</li>
	 * </ul>
	 */
	public static final MMCode mmAcquisitionDate = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AcquisitionDate";
			definition = "Acquisition date is not recognised or is invalid.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "IAQD";
		}
	};
	/**
	 * Order contains funds that have different valuation points.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "POIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentValuationPoints"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Order contains funds that have different valuation points."</li>
	 * </ul>
	 */
	public static final MMCode mmDifferentValuationPoints = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DifferentValuationPoints";
			definition = "Order contains funds that have different valuation points.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "POIN";
		}
	};
	/**
	 * Delivering agent is not recognised or is invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ICAG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveringAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Delivering agent is not recognised or is invalid."</li>
	 * </ul>
	 */
	public static final MMCode mmDeliveringAgent = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeliveringAgent";
			definition = "Delivering agent is not recognised or is invalid.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "ICAG";
		}
	};
	/**
	 * Direct debit account identification is not recognised or is invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IDDB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DirectDebit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Direct debit account identification is not recognised or is invalid."</li>
	 * </ul>
	 */
	public static final MMCode mmDirectDebit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DirectDebit";
			definition = "Direct debit account identification is not recognised or is invalid.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "IDDB";
		}
	};
	/**
	 * Intermediary is not recognised or is invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INTE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Intermediary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Intermediary is not recognised or is invalid."</li>
	 * </ul>
	 */
	public static final MMCode mmIntermediary = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Intermediary";
			definition = "Intermediary is not recognised or is invalid.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "INTE";
		}
	};
	/**
	 * Investment account identification is not recognised or is invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SAFE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment account identification is not recognised or is invalid."</li>
	 * </ul>
	 */
	public static final MMCode mmInvestmentAccount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentAccount";
			definition = "Investment account identification is not recognised or is invalid.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "SAFE";
		}
	};
	/**
	 * Payment card details are incorrect.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IPAY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentCard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment card details are incorrect."</li>
	 * </ul>
	 */
	public static final MMCode mmPaymentCard = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentCard";
			definition = "Payment card details are incorrect.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "IPAY";
		}
	};
	/**
	 * Credit transfer details are incorrect.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ICTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidCreditTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Credit transfer details are incorrect."</li>
	 * </ul>
	 */
	public static final MMCode mmInvalidCreditTransfer = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvalidCreditTransfer";
			definition = "Credit transfer details are incorrect.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "ICTR";
		}
	};
	/**
	 * Place of settlement is not recognised or is invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DEPT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementPlace"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Place of settlement is not recognised or is invalid."</li>
	 * </ul>
	 */
	public static final MMCode mmSettlementPlace = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementPlace";
			definition = "Place of settlement is not recognised or is invalid.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "DEPT";
		}
	};
	/**
	 * Receiving agent is not recognised or is invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IVAG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Receiving agent is not recognised or is invalid."</li>
	 * </ul>
	 */
	public static final MMCode mmReceivingAgent = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReceivingAgent";
			definition = "Receiving agent is not recognised or is invalid.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "IVAG";
		}
	};
	/**
	 * Safekeeping place is not recognised or is invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ISAF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlace"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Safekeeping place is not recognised or is invalid."</li>
	 * </ul>
	 */
	public static final MMCode mmSafekeepingPlace = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SafekeepingPlace";
			definition = "Safekeeping place is not recognised or is invalid.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "ISAF";
		}
	};
	/**
	 * Form of the security is wrong, eg, the form of security is registered not
	 * bearer or vice versa.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DFOR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidSecurityForm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Form of the security is wrong, eg, the form of security is registered not bearer or vice versa."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInvalidSecurityForm = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvalidSecurityForm";
			definition = "Form of the security is wrong, eg, the form of security is registered not bearer or vice versa.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "DFOR";
		}
	};
	/**
	 * Identification of the security is not recognised or is invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DSEC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the security is not recognised or is invalid."</li>
	 * </ul>
	 */
	public static final MMCode mmFinancialInstrumentIdentification = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "Identification of the security is not recognised or is invalid.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "DSEC";
		}
	};
	/**
	 * Investment account is blocked due to a corporate action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BLCA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountBlockedForCorporateAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Investment account is blocked due to a corporate action."</li>
	 * </ul>
	 */
	public static final MMCode mmAccountBlockedForCorporateAction = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccountBlockedForCorporateAction";
			definition = "Investment account is blocked due to a corporate action.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "BLCA";
		}
	};
	/**
	 * Investment account is blocked due to a transfer out of investment funds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BLTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountBlockedForTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment account is blocked due to a transfer out of investment funds."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAccountBlockedForTransfer = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccountBlockedForTransfer";
			definition = "Investment account is blocked due to a transfer out of investment funds.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "BLTR";
		}
	};
	/**
	 * Investment account is blocked until certain legal proceedings are
	 * completed, eg, legal documents from the successor, legal proceedings due
	 * to bankruptcy.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DOCC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountBlockedMissingDocuments"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment account is blocked until certain legal proceedings are completed, eg, legal documents from the successor, legal proceedings due to bankruptcy."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAccountBlockedMissingDocuments = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccountBlockedMissingDocuments";
			definition = "Investment account is blocked until certain legal proceedings are completed, eg, legal documents from the successor, legal proceedings due to bankruptcy.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "DOCC";
		}
	};
	/**
	 * There is not enough cash in the account to process the instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MONY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotEnoughCash"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "There is not enough cash in the account to process the instruction."</li>
	 * </ul>
	 */
	public static final MMCode mmNotEnoughCash = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotEnoughCash";
			definition = "There is not enough cash in the account to process the instruction.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "MONY";
		}
	};
	/**
	 * There are not enough securities in the account to process the
	 * instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SECU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotEnoughFinancialInstrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "There are not enough securities in the account to process the instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmNotEnoughFinancialInstrument = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotEnoughFinancialInstrument";
			definition = "There are not enough securities in the account to process the instruction.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "SECU";
		}
	};
	/**
	 * Identification of the security and the security name are not the same.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IDNA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentificationAndName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the security and the security name are not the same."</li>
	 * </ul>
	 */
	public static final MMCode mmFinancialInstrumentIdentificationAndName = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FinancialInstrumentIdentificationAndName";
			definition = "Identification of the security and the security name are not the same.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "IDNA";
		}
	};
	/**
	 * Percentage of commission waiving exceeds the commission percentage or
	 * commission amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UWAI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnacceptedCommissionWaiving"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage of commission waiving exceeds the commission percentage or commission amount."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmUnacceptedCommissionWaiving = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnacceptedCommissionWaiving";
			definition = "Percentage of commission waiving exceeds the commission percentage or commission amount.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "UWAI";
		}
	};
	/**
	 * Deal currency is not supported.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UDCY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnacceptedDealCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Deal currency is not supported."</li>
	 * </ul>
	 */
	public static final MMCode mmUnacceptedDealCurrency = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnacceptedDealCurrency";
			definition = "Deal currency is not supported.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "UDCY";
		}
	};
	/**
	 * Net asset value currency is not supported.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UNAV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnacceptedNAVCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Net asset value currency is not supported."</li>
	 * </ul>
	 */
	public static final MMCode mmUnacceptedNAVCurrency = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnacceptedNAVCurrency";
			definition = "Net asset value currency is not supported.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "UNAV";
		}
	};
	/**
	 * Payment method, eg, cheque or payment card, is not accepted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UPAY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnacceptedPaymentMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment method, eg, cheque or payment card, is not accepted."</li>
	 * </ul>
	 */
	public static final MMCode mmUnacceptedPaymentMethod = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnacceptedPaymentMethod";
			definition = "Payment method, eg, cheque or payment card, is not accepted.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "UPAY";
		}
	};
	/**
	 * Settlement currency requested is not supported.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "URSC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnacceptedRequestedSettlementCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement currency requested is not supported."</li>
	 * </ul>
	 */
	public static final MMCode mmUnacceptedRequestedSettlementCurrency = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnacceptedRequestedSettlementCurrency";
			definition = "Settlement currency requested is not supported.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "URSC";
		}
	};
	/**
	 * Quantity of units or amount of money in the order is too high for a
	 * subscription.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SHIG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TooHighUnitsOrAmountToSubscribe"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of units or amount of money in the order is too high for a subscription."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmTooHighUnitsOrAmountToSubscribe = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TooHighUnitsOrAmountToSubscribe";
			definition = "Quantity of units or amount of money in the order is too high for a subscription.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "SHIG";
		}
	};
	/**
	 * Quantity of units or amount of money in the order is too low for a
	 * subscription.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SLOW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TooLowUnitsOrAmountToSubscribe"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of units or amount of money in the order is too low for a subscription."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmTooLowUnitsOrAmountToSubscribe = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TooLowUnitsOrAmountToSubscribe";
			definition = "Quantity of units or amount of money in the order is too low for a subscription.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "SLOW";
		}
	};
	/**
	 * Linked reference is not known.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ULNK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnknownLinkagesReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Linked reference is not known."</li>
	 * </ul>
	 */
	public static final MMCode mmUnknownLinkagesReference = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnknownLinkagesReference";
			definition = "Linked reference is not known.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "ULNK";
		}
	};
	/**
	 * Order contains physical delivery details but the fund can not be
	 * physically delivered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DLVY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalDeliveryImpossible"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Order contains physical delivery details but the fund can not be physically delivered."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPhysicalDeliveryImpossible = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PhysicalDeliveryImpossible";
			definition = "Order contains physical delivery details but the fund can not be physically delivered.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "DLVY";
		}
	};
	/**
	 * Order reference is a duplicate of a previously received order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ORRF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DuplicateOrderReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Order reference is a duplicate of a previously received order."</li>
	 * </ul>
	 */
	public static final MMCode mmDuplicateOrderReference = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DuplicateOrderReference";
			definition = "Order reference is a duplicate of a previously received order.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "ORRF";
		}
	};
	/**
	 * Instructing party is not allowed to instruct for this investment account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IPAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructingPartyNotAllowedForAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instructing party is not allowed to instruct for this investment account."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInstructingPartyNotAllowedForAccount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InstructingPartyNotAllowedForAccount";
			definition = "Instructing party is not allowed to instruct for this investment account.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "IPAC";
		}
	};
	/**
	 * Order type is invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IOTP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidOrderType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order type is invalid."</li>
	 * </ul>
	 */
	public static final MMCode mmInvalidOrderType = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvalidOrderType";
			definition = "Order type is invalid.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "IOTP";
		}
	};
	/**
	 * Instruction is not compliant with the service level agreement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NSLA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotCompliantWithSLA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction is not compliant with the service level agreement."</li>
	 * </ul>
	 */
	public static final MMCode mmNotCompliantWithSLA = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotCompliantWithSLA";
			definition = "Instruction is not compliant with the service level agreement.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "NSLA";
		}
	};
	/**
	 * Instruction has been received after the cut-off time.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CUTO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CutOffTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction has been received after the cut-off time."</li>
	 * </ul>
	 */
	public static final MMCode mmCutOffTime = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CutOffTime";
			definition = "Instruction has been received after the cut-off time.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "CUTO";
		}
	};
	/**
	 * Request contains an invalid or unrecognised business reference.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REFE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidOrUnrecognisedReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Request contains an invalid or unrecognised business reference."</li>
	 * </ul>
	 */
	public static final MMCode mmInvalidOrUnrecognisedReference = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvalidOrUnrecognisedReference";
			definition = "Request contains an invalid or unrecognised business reference.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "REFE";
		}
	};
	/**
	 * Instructing party is not allowed to ask for a status for that specific
	 * order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NALO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotAllowedRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instructing party is not allowed to ask for a status for that specific order."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmNotAllowedRequest = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotAllowedRequest";
			definition = "Instructing party is not allowed to ask for a status for that specific order.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "NALO";
		}
	};
	/**
	 * Order is already executed and confirmation has been sent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COSE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AlreadyExecuted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order is already executed and confirmation has been sent."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAlreadyExecuted = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AlreadyExecuted";
			definition = "Order is already executed and confirmation has been sent.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "COSE";
		}
	};
	/**
	 * Instructing party is not allowed to request a cancellation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NALC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotAllowedToCancel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instructing party is not allowed to request a cancellation."</li>
	 * </ul>
	 */
	public static final MMCode mmNotAllowedToCancel = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotAllowedToCancel";
			definition = "Instructing party is not allowed to request a cancellation.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "NALC";
		}
	};
	/**
	 * Legally impossible to cancel.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LEGL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegallyImpossible"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Legally impossible to cancel."</li>
	 * </ul>
	 */
	public static final MMCode mmLegallyImpossible = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LegallyImpossible";
			definition = "Legally impossible to cancel.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "LEGL";
		}
	};
	/**
	 * Another reason for the status rejected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
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
	 * definition} = "Another reason for the status rejected."</li>
	 * </ul>
	 */
	public static final MMCode mmOther = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Other";
			definition = "Another reason for the status rejected.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Financial instrument quantity is invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DQUA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Financial instrument quantity is invalid."</li>
	 * </ul>
	 */
	public static final MMCode mmFinancialInstrumentQuantity = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FinancialInstrumentQuantity";
			definition = "Financial instrument quantity is invalid.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "DQUA";
		}
	};
	/**
	 * Certificate number is not recognised or is invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ICTN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Certificate number is not recognised or is invalid."</li>
	 * </ul>
	 */
	public static final MMCode mmCertificateNumber = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CertificateNumber";
			definition = "Certificate number is not recognised or is invalid.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "ICTN";
		}
	};
	/**
	 * One or several settlement parties are not recognised or are invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ISTP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "One or several settlement parties are not recognised or are invalid."</li>
	 * </ul>
	 */
	public static final MMCode mmSettlementParties = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementParties";
			definition = "One or several settlement parties are not recognised or are invalid.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "ISTP";
		}
	};
	/**
	 * Instruction was received after market deadline.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LATE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TooLate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction was received after market deadline."</li>
	 * </ul>
	 */
	public static final MMCode mmTooLate = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TooLate";
			definition = "Instruction was received after market deadline.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "LATE";
		}
	};
	/**
	 * Instruction was received after the Receiver's deadline.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ADEA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AfterDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction was received after the Receiver's deadline."</li>
	 * </ul>
	 */
	public static final MMCode mmAfterDeadline = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AfterDeadline";
			definition = "Instruction was received after the Receiver's deadline.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "ADEA";
		}
	};
	/**
	 * Unrecognised or invalid trade date or requested trade date or future
	 * trade date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DTRD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unrecognised or invalid trade date or requested trade date or future trade date."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmTradeDate = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDate";
			definition = "Unrecognised or invalid trade date or requested trade date or future trade date.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "DTRD";
		}
	};
	/**
	 * Unrecognised or invalid fee or commission.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FEEE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FeeOrCommission"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised or invalid fee or commission."</li>
	 * </ul>
	 */
	public static final MMCode mmFeeOrCommission = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FeeOrCommission";
			definition = "Unrecognised or invalid fee or commission.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "FEEE";
		}
	};
	/**
	 * Unrecognised or invalid subscriber or redeemer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IEXE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubscriberOrRedeemer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised or invalid subscriber or redeemer."</li>
	 * </ul>
	 */
	public static final MMCode mmSubscriberOrRedeemer = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubscriberOrRedeemer";
			definition = "Unrecognised or invalid subscriber or redeemer.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "IEXE";
		}
	};
	/**
	 * Unrecognised or invalid Settlement Amount Currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NCRR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAmountCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised or invalid Settlement Amount Currency."</li>
	 * </ul>
	 */
	public static final MMCode mmSettlementAmountCurrency = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmountCurrency";
			definition = "Unrecognised or invalid Settlement Amount Currency.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "NCRR";
		}
	};
	/**
	 * Physical Settlement Impossible.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PHYS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Physical Settlement Impossible."</li>
	 * </ul>
	 */
	public static final MMCode mmPhysicalSettlement = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalSettlement";
			definition = "Physical Settlement Impossible.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "PHYS";
		}
	};
	/**
	 * Unrecognised or invalid Place of Trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PLCE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised or invalid Place of Trade."</li>
	 * </ul>
	 */
	public static final MMCode mmPlaceOfTrade = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfTrade";
			definition = "Unrecognised or invalid Place of Trade.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "PLCE";
		}
	};
	/**
	 * Unrecognised or invalid Settlement Transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SETR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised or invalid Settlement Transaction."</li>
	 * </ul>
	 */
	public static final MMCode mmSettlementTransaction = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementTransaction";
			definition = "Unrecognised or invalid Settlement Transaction.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "SETR";
		}
	};
	/**
	 * Impossible to use RTGS System.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RTGS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RTGSSystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Impossible to use RTGS System."</li>
	 * </ul>
	 */
	public static final MMCode mmRTGSSystem = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RTGSSystem";
			definition = "Impossible to use RTGS System.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "RTGS";
		}
	};
	/**
	 * The cancellation request has been rejected since more than one
	 * instruction match to the cancellation criteria.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NRGM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoCancellationMatch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The cancellation request has been rejected since more than one instruction match to the cancellation criteria."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmNoCancellationMatch = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoCancellationMatch";
			definition = "The cancellation request has been rejected since more than one instruction match to the cancellation criteria.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "NRGM";
		}
	};
	/**
	 * Investor name and address is not recognised.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INUK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestorNameAddressUnknown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Investor name and address is not recognised."</li>
	 * </ul>
	 */
	public static final MMCode mmInvestorNameAddressUnknown = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorNameAddressUnknown";
			definition = "Investor name and address is not recognised.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "INUK";
		}
	};
	/**
	 * Investor data is insufficient. Applicable when the mandated market
	 * practice is not followed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INID"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientInvestorData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investor data is insufficient. Applicable when the mandated market practice is not followed."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInsufficientInvestorData = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientInvestorData";
			definition = "Investor data is insufficient. Applicable when the mandated market practice is not followed.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "INID";
		}
	};
	/**
	 * Account servicer is not recognised or is invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidAccountServicer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account servicer is not recognised or is invalid."</li>
	 * </ul>
	 */
	public static final MMCode mmInvalidAccountServicer = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidAccountServicer";
			definition = "Account servicer is not recognised or is invalid.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "INAC";
		}
	};
	/**
	 * Nominee account is not recognised or is invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INNA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidNomineeAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Nominee account is not recognised or is invalid."</li>
	 * </ul>
	 */
	public static final MMCode mmInvalidNomineeAccount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidNomineeAccount";
			definition = "Nominee account is not recognised or is invalid.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "INNA";
		}
	};
	/**
	 * New plan manager is not recognised or is invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INPM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidNewPlanManager"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "New plan manager is not recognised or is invalid."</li>
	 * </ul>
	 */
	public static final MMCode mmInvalidNewPlanManager = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidNewPlanManager";
			definition = "New plan manager is not recognised or is invalid.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "INPM";
		}
	};
	/**
	 * Partial transfer of current year is not allowed, ie, it is not possible
	 * to transfer one asset for the current year as other assets are held for
	 * the current year.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CYPA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentYearPartial"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Partial transfer of current year is not allowed, ie, it is not possible to transfer one asset for the current year as other assets are held for the current year."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCurrentYearPartial = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentYearPartial";
			definition = "Partial transfer of current year is not allowed, ie, it is not possible to transfer one asset for the current year as other assets are held for the current year.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "CYPA";
		}
	};
	/**
	 * Partial transfer is not supported. Applicable when tax years are rolled
	 * up and because, for example, a transfer request for tax year 2000 only is
	 * received, it is not possible to process the transfer as the investor
	 * holds other tax years as well.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PTNS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialNotSupported"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Partial transfer is not supported. Applicable when tax years are rolled up and because, for example, a transfer request for tax year 2000 only is received, it is not possible to process the transfer as the investor holds other tax years as well."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPartialNotSupported = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialNotSupported";
			definition = "Partial transfer is not supported. Applicable when tax years are rolled up and because, for example, a transfer request for tax year 2000 only is received, it is not possible to process the transfer as the investor holds other tax years as well.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "PTNS";
		}
	};
	/**
	 * Financial instrument is not valid for the requested tax year.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FTAX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentTaxYear"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial instrument is not valid for the requested tax year."</li>
	 * </ul>
	 */
	public static final MMCode mmFinancialInstrumentTaxYear = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentTaxYear";
			definition = "Financial instrument is not valid for the requested tax year.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "FTAX";
		}
	};
	/**
	 * ISA type is not recognised or invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ISAT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidISAType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "ISA type is not recognised or invalid."</li>
	 * </ul>
	 */
	public static final MMCode mmInvalidISAType = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidISAType";
			definition = "ISA type is not recognised or invalid.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "ISAT";
		}
	};
	/**
	 * Cash account is not recognised or invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CASH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidCashAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash account is not recognised or invalid."</li>
	 * </ul>
	 */
	public static final MMCode mmInvalidCashAccount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidCashAccount";
			definition = "Cash account is not recognised or invalid.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "CASH";
		}
	};
	/**
	 * Transfer reference is a duplicate of a previously received transfer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TREF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DuplicateTransferReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transfer reference is a duplicate of a previously received transfer."</li>
	 * </ul>
	 */
	public static final MMCode mmDuplicateTransferReference = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DuplicateTransferReference";
			definition = "Transfer reference is a duplicate of a previously received transfer.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "TREF";
		}
	};
	/**
	 * Unrecognised or invalid settlement amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DMON"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidSettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised or invalid settlement amount."</li>
	 * </ul>
	 */
	public static final MMCode mmInvalidSettlementAmount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidSettlementAmount";
			definition = "Unrecognised or invalid settlement amount.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "DMON";
		}
	};
	/**
	 * Unrecognised or invalid ordered amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ORDR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidOrderedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised or invalid ordered amount."</li>
	 * </ul>
	 */
	public static final MMCode mmInvalidOrderedAmount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidOrderedAmount";
			definition = "Unrecognised or invalid ordered amount.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "ORDR";
		}
	};
	/**
	 * Amount of subscription is below the minimum initial investment amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
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
	 * "Amount of subscription is below the minimum initial investment amount."</li>
	 * </ul>
	 */
	public static final MMCode mmBelowMinimumInitialInvestmentAmount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BelowMinimumInitialInvestmentAmount";
			definition = "Amount of subscription is below the minimum initial investment amount.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "BMIN";
		}
	};
	/**
	 * Amount of subscription is below the minimum top-up investment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
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
	 * "Amount of subscription is below the minimum top-up investment."</li>
	 * </ul>
	 */
	public static final MMCode mmBelowMinimumTopUpAmount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BelowMinimumTopUpAmount";
			definition = "Amount of subscription is below the minimum top-up investment.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "BMTO";
		}
	};
	/**
	 * Insufficient capacity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
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
	 * definition} = "Insufficient capacity."</li>
	 * </ul>
	 */
	public static final MMCode mmInsufficientCapacity = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientCapacity";
			definition = "Insufficient capacity.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "INSU";
		}
	};
	/**
	 * Percentage holding breach, eg, PPM rules; taxation rules (ERISA).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
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
	 * "Percentage holding breach, eg, PPM rules; taxation rules (ERISA)."</li>
	 * </ul>
	 */
	public static final MMCode mmPercentageHoldingBreach = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PercentageHoldingBreach";
			definition = "Percentage holding breach, eg, PPM rules; taxation rules (ERISA).";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "PRCT";
		}
	};
	/**
	 * Amount is below the minimum redemption amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
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
	 * definition} = "Amount is below the minimum redemption amount."</li>
	 * </ul>
	 */
	public static final MMCode mmBelowMinimumRedemptionAmount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BelowMinimumRedemptionAmount";
			definition = "Amount is below the minimum redemption amount.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "BMRA";
		}
	};
	/**
	 * Holding will be below the minimum retained value.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
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
	 * definition} = "Holding will be below the minimum retained value."</li>
	 * </ul>
	 */
	public static final MMCode mmBelowMinimumRetainedAmount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BelowMinimumRetainedAmount";
			definition = "Holding will be below the minimum retained value.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "BMRV";
		}
	};
	/**
	 * Lock-up period is in place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
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
	 * definition} = "Lock-up period is in place."</li>
	 * </ul>
	 */
	public static final MMCode mmLockUp = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LockUp";
			definition = "Lock-up period is in place.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "LOCK";
		}
	};
	/**
	 * Assets are illiquid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
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
	 * definition} = "Assets are illiquid."</li>
	 * </ul>
	 */
	public static final MMCode mmAssetsIlliquid = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssetsIlliquid";
			definition = "Assets are illiquid.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "ILLI";
		}
	};
	/**
	 * Data in the order is invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DINV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DataInvalid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Data in the order is invalid."</li>
	 * </ul>
	 */
	public static final MMCode mmDataInvalid = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataInvalid";
			definition = "Data in the order is invalid.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "DINV";
		}
	};
	/**
	 * Fund is closed and will not take in any more investments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLOS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundClosed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Fund is closed and will not take in any more investments."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmFundClosed = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundClosed";
			definition = "Fund is closed and will not take in any more investments.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "CLOS";
		}
	};
	/**
	 * Instruction specifies an unacceptable combination for the financial
	 * instruments in the switch order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UNSC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnacceptableSwitchCombination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction specifies an unacceptable combination for the financial instruments in the switch order."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmUnacceptableSwitchCombination = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnacceptableSwitchCombination";
			definition = "Instruction specifies an unacceptable combination for the financial instruments in the switch order.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "UNSC";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("DDAT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RejectedStatusReasonCode";
				definition = "Cash settlement date is not recognised or is invalid.";
				code_lazy = () -> Arrays.asList(RejectedStatusReasonCode.mmSettlementDate, RejectedStatusReasonCode.mmAcquisitionDate, RejectedStatusReasonCode.mmDifferentValuationPoints, RejectedStatusReasonCode.mmDeliveringAgent,
						RejectedStatusReasonCode.mmDirectDebit, RejectedStatusReasonCode.mmIntermediary, RejectedStatusReasonCode.mmInvestmentAccount, RejectedStatusReasonCode.mmPaymentCard,
						RejectedStatusReasonCode.mmInvalidCreditTransfer, RejectedStatusReasonCode.mmSettlementPlace, RejectedStatusReasonCode.mmReceivingAgent, RejectedStatusReasonCode.mmSafekeepingPlace,
						RejectedStatusReasonCode.mmInvalidSecurityForm, RejectedStatusReasonCode.mmFinancialInstrumentIdentification, RejectedStatusReasonCode.mmAccountBlockedForCorporateAction,
						RejectedStatusReasonCode.mmAccountBlockedForTransfer, RejectedStatusReasonCode.mmAccountBlockedMissingDocuments, RejectedStatusReasonCode.mmNotEnoughCash, RejectedStatusReasonCode.mmNotEnoughFinancialInstrument,
						RejectedStatusReasonCode.mmFinancialInstrumentIdentificationAndName, RejectedStatusReasonCode.mmUnacceptedCommissionWaiving, RejectedStatusReasonCode.mmUnacceptedDealCurrency,
						RejectedStatusReasonCode.mmUnacceptedNAVCurrency, RejectedStatusReasonCode.mmUnacceptedPaymentMethod, RejectedStatusReasonCode.mmUnacceptedRequestedSettlementCurrency,
						RejectedStatusReasonCode.mmTooHighUnitsOrAmountToSubscribe, RejectedStatusReasonCode.mmTooLowUnitsOrAmountToSubscribe, RejectedStatusReasonCode.mmUnknownLinkagesReference,
						RejectedStatusReasonCode.mmPhysicalDeliveryImpossible, RejectedStatusReasonCode.mmDuplicateOrderReference, RejectedStatusReasonCode.mmInstructingPartyNotAllowedForAccount,
						RejectedStatusReasonCode.mmInvalidOrderType, RejectedStatusReasonCode.mmNotCompliantWithSLA, RejectedStatusReasonCode.mmCutOffTime, RejectedStatusReasonCode.mmInvalidOrUnrecognisedReference,
						RejectedStatusReasonCode.mmNotAllowedRequest, RejectedStatusReasonCode.mmAlreadyExecuted, RejectedStatusReasonCode.mmNotAllowedToCancel, RejectedStatusReasonCode.mmLegallyImpossible,
						RejectedStatusReasonCode.mmOther, RejectedStatusReasonCode.mmFinancialInstrumentQuantity, RejectedStatusReasonCode.mmCertificateNumber, RejectedStatusReasonCode.mmSettlementParties,
						RejectedStatusReasonCode.mmTooLate, RejectedStatusReasonCode.mmAfterDeadline, RejectedStatusReasonCode.mmTradeDate, RejectedStatusReasonCode.mmFeeOrCommission, RejectedStatusReasonCode.mmSubscriberOrRedeemer,
						RejectedStatusReasonCode.mmSettlementAmountCurrency, RejectedStatusReasonCode.mmPhysicalSettlement, RejectedStatusReasonCode.mmPlaceOfTrade, RejectedStatusReasonCode.mmSettlementTransaction,
						RejectedStatusReasonCode.mmRTGSSystem, RejectedStatusReasonCode.mmNoCancellationMatch, RejectedStatusReasonCode.mmInvestorNameAddressUnknown, RejectedStatusReasonCode.mmInsufficientInvestorData,
						RejectedStatusReasonCode.mmInvalidAccountServicer, RejectedStatusReasonCode.mmInvalidNomineeAccount, RejectedStatusReasonCode.mmInvalidNewPlanManager, RejectedStatusReasonCode.mmCurrentYearPartial,
						RejectedStatusReasonCode.mmPartialNotSupported, RejectedStatusReasonCode.mmFinancialInstrumentTaxYear, RejectedStatusReasonCode.mmInvalidISAType, RejectedStatusReasonCode.mmInvalidCashAccount,
						RejectedStatusReasonCode.mmDuplicateTransferReference, RejectedStatusReasonCode.mmInvalidSettlementAmount, RejectedStatusReasonCode.mmInvalidOrderedAmount,
						RejectedStatusReasonCode.mmBelowMinimumInitialInvestmentAmount, RejectedStatusReasonCode.mmBelowMinimumTopUpAmount, RejectedStatusReasonCode.mmInsufficientCapacity,
						RejectedStatusReasonCode.mmPercentageHoldingBreach, RejectedStatusReasonCode.mmBelowMinimumRedemptionAmount, RejectedStatusReasonCode.mmBelowMinimumRetainedAmount, RejectedStatusReasonCode.mmLockUp,
						RejectedStatusReasonCode.mmAssetsIlliquid, RejectedStatusReasonCode.mmDataInvalid, RejectedStatusReasonCode.mmFundClosed, RejectedStatusReasonCode.mmUnacceptableSwitchCombination);
			}
		});
		return mmObject_lazy.get();
	}
}