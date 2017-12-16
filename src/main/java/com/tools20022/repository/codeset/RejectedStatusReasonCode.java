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
import com.tools20022.repository.codeset.RejectedStatusReasonCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Cash settlement date is not recognised or is invalid.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#SettlementDate
 * RejectedStatusReasonCode.mmSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#AcquisitionDate
 * RejectedStatusReasonCode.mmAcquisitionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#DifferentValuationPoints
 * RejectedStatusReasonCode.mmDifferentValuationPoints}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#DeliveringAgent
 * RejectedStatusReasonCode.mmDeliveringAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#DirectDebit
 * RejectedStatusReasonCode.mmDirectDebit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#Intermediary
 * RejectedStatusReasonCode.mmIntermediary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#InvestmentAccount
 * RejectedStatusReasonCode.mmInvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#PaymentCard
 * RejectedStatusReasonCode.mmPaymentCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#InvalidCreditTransfer
 * RejectedStatusReasonCode.mmInvalidCreditTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#SettlementPlace
 * RejectedStatusReasonCode.mmSettlementPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#ReceivingAgent
 * RejectedStatusReasonCode.mmReceivingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#SafekeepingPlace
 * RejectedStatusReasonCode.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#InvalidSecurityForm
 * RejectedStatusReasonCode.mmInvalidSecurityForm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#FinancialInstrumentIdentification
 * RejectedStatusReasonCode.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#AccountBlockedForCorporateAction
 * RejectedStatusReasonCode.mmAccountBlockedForCorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#AccountBlockedForTransfer
 * RejectedStatusReasonCode.mmAccountBlockedForTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#AccountBlockedMissingDocuments
 * RejectedStatusReasonCode.mmAccountBlockedMissingDocuments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#NotEnoughCash
 * RejectedStatusReasonCode.mmNotEnoughCash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#NotEnoughFinancialInstrument
 * RejectedStatusReasonCode.mmNotEnoughFinancialInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#FinancialInstrumentIdentificationAndName
 * RejectedStatusReasonCode.mmFinancialInstrumentIdentificationAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#UnacceptedCommissionWaiving
 * RejectedStatusReasonCode.mmUnacceptedCommissionWaiving}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#UnacceptedDealCurrency
 * RejectedStatusReasonCode.mmUnacceptedDealCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#UnacceptedNAVCurrency
 * RejectedStatusReasonCode.mmUnacceptedNAVCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#UnacceptedPaymentMethod
 * RejectedStatusReasonCode.mmUnacceptedPaymentMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#UnacceptedRequestedSettlementCurrency
 * RejectedStatusReasonCode.mmUnacceptedRequestedSettlementCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#TooHighUnitsOrAmountToSubscribe
 * RejectedStatusReasonCode.mmTooHighUnitsOrAmountToSubscribe}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#TooLowUnitsOrAmountToSubscribe
 * RejectedStatusReasonCode.mmTooLowUnitsOrAmountToSubscribe}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#UnknownLinkagesReference
 * RejectedStatusReasonCode.mmUnknownLinkagesReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#PhysicalDeliveryImpossible
 * RejectedStatusReasonCode.mmPhysicalDeliveryImpossible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#DuplicateOrderReference
 * RejectedStatusReasonCode.mmDuplicateOrderReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#InstructingPartyNotAllowedForAccount
 * RejectedStatusReasonCode.mmInstructingPartyNotAllowedForAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#InvalidOrderType
 * RejectedStatusReasonCode.mmInvalidOrderType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#NotCompliantWithSLA
 * RejectedStatusReasonCode.mmNotCompliantWithSLA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#CutOffTime
 * RejectedStatusReasonCode.mmCutOffTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#InvalidOrUnrecognisedReference
 * RejectedStatusReasonCode.mmInvalidOrUnrecognisedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#NotAllowedRequest
 * RejectedStatusReasonCode.mmNotAllowedRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#AlreadyExecuted
 * RejectedStatusReasonCode.mmAlreadyExecuted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#NotAllowedToCancel
 * RejectedStatusReasonCode.mmNotAllowedToCancel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#LegallyImpossible
 * RejectedStatusReasonCode.mmLegallyImpossible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#Other
 * RejectedStatusReasonCode.mmOther}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#FinancialInstrumentQuantity
 * RejectedStatusReasonCode.mmFinancialInstrumentQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#CertificateNumber
 * RejectedStatusReasonCode.mmCertificateNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#SettlementParties
 * RejectedStatusReasonCode.mmSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#TooLate
 * RejectedStatusReasonCode.mmTooLate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#AfterDeadline
 * RejectedStatusReasonCode.mmAfterDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#TradeDate
 * RejectedStatusReasonCode.mmTradeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#FeeOrCommission
 * RejectedStatusReasonCode.mmFeeOrCommission}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#SubscriberOrRedeemer
 * RejectedStatusReasonCode.mmSubscriberOrRedeemer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#SettlementAmountCurrency
 * RejectedStatusReasonCode.mmSettlementAmountCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#PhysicalSettlement
 * RejectedStatusReasonCode.mmPhysicalSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#PlaceOfTrade
 * RejectedStatusReasonCode.mmPlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#SettlementTransaction
 * RejectedStatusReasonCode.mmSettlementTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#RTGSSystem
 * RejectedStatusReasonCode.mmRTGSSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#NoCancellationMatch
 * RejectedStatusReasonCode.mmNoCancellationMatch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#InvestorNameAddressUnknown
 * RejectedStatusReasonCode.mmInvestorNameAddressUnknown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#InsufficientInvestorData
 * RejectedStatusReasonCode.mmInsufficientInvestorData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#InvalidAccountServicer
 * RejectedStatusReasonCode.mmInvalidAccountServicer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#InvalidNomineeAccount
 * RejectedStatusReasonCode.mmInvalidNomineeAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#InvalidNewPlanManager
 * RejectedStatusReasonCode.mmInvalidNewPlanManager}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#CurrentYearPartial
 * RejectedStatusReasonCode.mmCurrentYearPartial}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#PartialNotSupported
 * RejectedStatusReasonCode.mmPartialNotSupported}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#FinancialInstrumentTaxYear
 * RejectedStatusReasonCode.mmFinancialInstrumentTaxYear}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#InvalidISAType
 * RejectedStatusReasonCode.mmInvalidISAType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#InvalidCashAccount
 * RejectedStatusReasonCode.mmInvalidCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#DuplicateTransferReference
 * RejectedStatusReasonCode.mmDuplicateTransferReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#InvalidSettlementAmount
 * RejectedStatusReasonCode.mmInvalidSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#InvalidOrderedAmount
 * RejectedStatusReasonCode.mmInvalidOrderedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#BelowMinimumInitialInvestmentAmount
 * RejectedStatusReasonCode.mmBelowMinimumInitialInvestmentAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#BelowMinimumTopUpAmount
 * RejectedStatusReasonCode.mmBelowMinimumTopUpAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#InsufficientCapacity
 * RejectedStatusReasonCode.mmInsufficientCapacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#PercentageHoldingBreach
 * RejectedStatusReasonCode.mmPercentageHoldingBreach}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#BelowMinimumRedemptionAmount
 * RejectedStatusReasonCode.mmBelowMinimumRedemptionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#BelowMinimumRetainedAmount
 * RejectedStatusReasonCode.mmBelowMinimumRetainedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#LockUp
 * RejectedStatusReasonCode.mmLockUp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#AssetsIlliquid
 * RejectedStatusReasonCode.mmAssetsIlliquid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#DataInvalid
 * RejectedStatusReasonCode.mmDataInvalid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#FundClosed
 * RejectedStatusReasonCode.mmFundClosed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode#UnacceptableSwitchCombination
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
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RejectedStatusReasonCode extends MMCode {

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
	public static final RejectedStatusReasonCode SettlementDate = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementDate";
			definition = "Cash settlement date is not recognised or is invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode AcquisitionDate = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AcquisitionDate";
			definition = "Acquisition date is not recognised or is invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode DifferentValuationPoints = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DifferentValuationPoints";
			definition = "Order contains funds that have different valuation points.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode DeliveringAgent = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeliveringAgent";
			definition = "Delivering agent is not recognised or is invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode DirectDebit = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DirectDebit";
			definition = "Direct debit account identification is not recognised or is invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode Intermediary = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Intermediary";
			definition = "Intermediary is not recognised or is invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode InvestmentAccount = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentAccount";
			definition = "Investment account identification is not recognised or is invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode PaymentCard = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentCard";
			definition = "Payment card details are incorrect.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode InvalidCreditTransfer = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvalidCreditTransfer";
			definition = "Credit transfer details are incorrect.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode SettlementPlace = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementPlace";
			definition = "Place of settlement is not recognised or is invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode ReceivingAgent = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReceivingAgent";
			definition = "Receiving agent is not recognised or is invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode SafekeepingPlace = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SafekeepingPlace";
			definition = "Safekeeping place is not recognised or is invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode InvalidSecurityForm = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvalidSecurityForm";
			definition = "Form of the security is wrong, eg, the form of security is registered not bearer or vice versa.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode FinancialInstrumentIdentification = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "Identification of the security is not recognised or is invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode AccountBlockedForCorporateAction = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccountBlockedForCorporateAction";
			definition = "Investment account is blocked due to a corporate action.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode AccountBlockedForTransfer = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccountBlockedForTransfer";
			definition = "Investment account is blocked due to a transfer out of investment funds.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode AccountBlockedMissingDocuments = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccountBlockedMissingDocuments";
			definition = "Investment account is blocked until certain legal proceedings are completed, eg, legal documents from the successor, legal proceedings due to bankruptcy.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode NotEnoughCash = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotEnoughCash";
			definition = "There is not enough cash in the account to process the instruction.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode NotEnoughFinancialInstrument = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotEnoughFinancialInstrument";
			definition = "There are not enough securities in the account to process the instruction.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode FinancialInstrumentIdentificationAndName = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FinancialInstrumentIdentificationAndName";
			definition = "Identification of the security and the security name are not the same.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode UnacceptedCommissionWaiving = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnacceptedCommissionWaiving";
			definition = "Percentage of commission waiving exceeds the commission percentage or commission amount.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode UnacceptedDealCurrency = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnacceptedDealCurrency";
			definition = "Deal currency is not supported.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode UnacceptedNAVCurrency = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnacceptedNAVCurrency";
			definition = "Net asset value currency is not supported.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode UnacceptedPaymentMethod = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnacceptedPaymentMethod";
			definition = "Payment method, eg, cheque or payment card, is not accepted.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode UnacceptedRequestedSettlementCurrency = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnacceptedRequestedSettlementCurrency";
			definition = "Settlement currency requested is not supported.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode TooHighUnitsOrAmountToSubscribe = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TooHighUnitsOrAmountToSubscribe";
			definition = "Quantity of units or amount of money in the order is too high for a subscription.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode TooLowUnitsOrAmountToSubscribe = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TooLowUnitsOrAmountToSubscribe";
			definition = "Quantity of units or amount of money in the order is too low for a subscription.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode UnknownLinkagesReference = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnknownLinkagesReference";
			definition = "Linked reference is not known.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode PhysicalDeliveryImpossible = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PhysicalDeliveryImpossible";
			definition = "Order contains physical delivery details but the fund can not be physically delivered.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode DuplicateOrderReference = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DuplicateOrderReference";
			definition = "Order reference is a duplicate of a previously received order.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode InstructingPartyNotAllowedForAccount = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InstructingPartyNotAllowedForAccount";
			definition = "Instructing party is not allowed to instruct for this investment account.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode InvalidOrderType = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvalidOrderType";
			definition = "Order type is invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode NotCompliantWithSLA = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotCompliantWithSLA";
			definition = "Instruction is not compliant with the service level agreement.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode CutOffTime = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CutOffTime";
			definition = "Instruction has been received after the cut-off time.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode InvalidOrUnrecognisedReference = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvalidOrUnrecognisedReference";
			definition = "Request contains an invalid or unrecognised business reference.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode NotAllowedRequest = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotAllowedRequest";
			definition = "Instructing party is not allowed to ask for a status for that specific order.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode AlreadyExecuted = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AlreadyExecuted";
			definition = "Order is already executed and confirmation has been sent.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode NotAllowedToCancel = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotAllowedToCancel";
			definition = "Instructing party is not allowed to request a cancellation.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode LegallyImpossible = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LegallyImpossible";
			definition = "Legally impossible to cancel.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode Other = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Other";
			definition = "Another reason for the status rejected.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode FinancialInstrumentQuantity = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FinancialInstrumentQuantity";
			definition = "Financial instrument quantity is invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode CertificateNumber = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CertificateNumber";
			definition = "Certificate number is not recognised or is invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode SettlementParties = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementParties";
			definition = "One or several settlement parties are not recognised or are invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode TooLate = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TooLate";
			definition = "Instruction was received after market deadline.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode AfterDeadline = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AfterDeadline";
			definition = "Instruction was received after the Receiver's deadline.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode TradeDate = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDate";
			definition = "Unrecognised or invalid trade date or requested trade date or future trade date.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode FeeOrCommission = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FeeOrCommission";
			definition = "Unrecognised or invalid fee or commission.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode SubscriberOrRedeemer = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubscriberOrRedeemer";
			definition = "Unrecognised or invalid subscriber or redeemer.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode SettlementAmountCurrency = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmountCurrency";
			definition = "Unrecognised or invalid Settlement Amount Currency.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode PhysicalSettlement = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalSettlement";
			definition = "Physical Settlement Impossible.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode PlaceOfTrade = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfTrade";
			definition = "Unrecognised or invalid Place of Trade.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode SettlementTransaction = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementTransaction";
			definition = "Unrecognised or invalid Settlement Transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode RTGSSystem = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RTGSSystem";
			definition = "Impossible to use RTGS System.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode NoCancellationMatch = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoCancellationMatch";
			definition = "The cancellation request has been rejected since more than one instruction match to the cancellation criteria.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode InvestorNameAddressUnknown = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorNameAddressUnknown";
			definition = "Investor name and address is not recognised.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode InsufficientInvestorData = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientInvestorData";
			definition = "Investor data is insufficient. Applicable when the mandated market practice is not followed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode InvalidAccountServicer = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidAccountServicer";
			definition = "Account servicer is not recognised or is invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode InvalidNomineeAccount = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidNomineeAccount";
			definition = "Nominee account is not recognised or is invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode InvalidNewPlanManager = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidNewPlanManager";
			definition = "New plan manager is not recognised or is invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode CurrentYearPartial = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentYearPartial";
			definition = "Partial transfer of current year is not allowed, ie, it is not possible to transfer one asset for the current year as other assets are held for the current year.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode PartialNotSupported = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialNotSupported";
			definition = "Partial transfer is not supported. Applicable when tax years are rolled up and because, for example, a transfer request for tax year 2000 only is received, it is not possible to process the transfer as the investor holds other tax years as well.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode FinancialInstrumentTaxYear = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentTaxYear";
			definition = "Financial instrument is not valid for the requested tax year.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode InvalidISAType = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidISAType";
			definition = "ISA type is not recognised or invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode InvalidCashAccount = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidCashAccount";
			definition = "Cash account is not recognised or invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode DuplicateTransferReference = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DuplicateTransferReference";
			definition = "Transfer reference is a duplicate of a previously received transfer.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode InvalidSettlementAmount = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidSettlementAmount";
			definition = "Unrecognised or invalid settlement amount.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode InvalidOrderedAmount = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidOrderedAmount";
			definition = "Unrecognised or invalid ordered amount.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode BelowMinimumInitialInvestmentAmount = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BelowMinimumInitialInvestmentAmount";
			definition = "Amount of subscription is below the minimum initial investment amount.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode BelowMinimumTopUpAmount = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BelowMinimumTopUpAmount";
			definition = "Amount of subscription is below the minimum top-up investment.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode InsufficientCapacity = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientCapacity";
			definition = "Insufficient capacity.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode PercentageHoldingBreach = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PercentageHoldingBreach";
			definition = "Percentage holding breach, eg, PPM rules; taxation rules (ERISA).";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode BelowMinimumRedemptionAmount = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BelowMinimumRedemptionAmount";
			definition = "Amount is below the minimum redemption amount.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode BelowMinimumRetainedAmount = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BelowMinimumRetainedAmount";
			definition = "Holding will be below the minimum retained value.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode LockUp = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LockUp";
			definition = "Lock-up period is in place.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode AssetsIlliquid = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssetsIlliquid";
			definition = "Assets are illiquid.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode DataInvalid = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataInvalid";
			definition = "Data in the order is invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode FundClosed = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundClosed";
			definition = "Fund is closed and will not take in any more investments.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
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
	public static final RejectedStatusReasonCode UnacceptableSwitchCombination = new RejectedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnacceptableSwitchCombination";
			definition = "Instruction specifies an unacceptable combination for the financial instruments in the switch order.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReasonCode.mmObject();
			codeName = "UNSC";
		}
	};
	final static private LinkedHashMap<String, RejectedStatusReasonCode> codesByName = new LinkedHashMap<>();

	protected RejectedStatusReasonCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("DDAT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RejectedStatusReasonCode";
				definition = "Cash settlement date is not recognised or is invalid.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RejectedStatusReasonCode.SettlementDate, com.tools20022.repository.codeset.RejectedStatusReasonCode.AcquisitionDate,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.DifferentValuationPoints, com.tools20022.repository.codeset.RejectedStatusReasonCode.DeliveringAgent,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.DirectDebit, com.tools20022.repository.codeset.RejectedStatusReasonCode.Intermediary,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.InvestmentAccount, com.tools20022.repository.codeset.RejectedStatusReasonCode.PaymentCard,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.InvalidCreditTransfer, com.tools20022.repository.codeset.RejectedStatusReasonCode.SettlementPlace,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.ReceivingAgent, com.tools20022.repository.codeset.RejectedStatusReasonCode.SafekeepingPlace,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.InvalidSecurityForm, com.tools20022.repository.codeset.RejectedStatusReasonCode.FinancialInstrumentIdentification,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.AccountBlockedForCorporateAction, com.tools20022.repository.codeset.RejectedStatusReasonCode.AccountBlockedForTransfer,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.AccountBlockedMissingDocuments, com.tools20022.repository.codeset.RejectedStatusReasonCode.NotEnoughCash,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.NotEnoughFinancialInstrument, com.tools20022.repository.codeset.RejectedStatusReasonCode.FinancialInstrumentIdentificationAndName,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.UnacceptedCommissionWaiving, com.tools20022.repository.codeset.RejectedStatusReasonCode.UnacceptedDealCurrency,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.UnacceptedNAVCurrency, com.tools20022.repository.codeset.RejectedStatusReasonCode.UnacceptedPaymentMethod,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.UnacceptedRequestedSettlementCurrency, com.tools20022.repository.codeset.RejectedStatusReasonCode.TooHighUnitsOrAmountToSubscribe,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.TooLowUnitsOrAmountToSubscribe, com.tools20022.repository.codeset.RejectedStatusReasonCode.UnknownLinkagesReference,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.PhysicalDeliveryImpossible, com.tools20022.repository.codeset.RejectedStatusReasonCode.DuplicateOrderReference,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.InstructingPartyNotAllowedForAccount, com.tools20022.repository.codeset.RejectedStatusReasonCode.InvalidOrderType,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.NotCompliantWithSLA, com.tools20022.repository.codeset.RejectedStatusReasonCode.CutOffTime,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.InvalidOrUnrecognisedReference, com.tools20022.repository.codeset.RejectedStatusReasonCode.NotAllowedRequest,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.AlreadyExecuted, com.tools20022.repository.codeset.RejectedStatusReasonCode.NotAllowedToCancel,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.LegallyImpossible, com.tools20022.repository.codeset.RejectedStatusReasonCode.Other,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.FinancialInstrumentQuantity, com.tools20022.repository.codeset.RejectedStatusReasonCode.CertificateNumber,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.SettlementParties, com.tools20022.repository.codeset.RejectedStatusReasonCode.TooLate,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.AfterDeadline, com.tools20022.repository.codeset.RejectedStatusReasonCode.TradeDate,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.FeeOrCommission, com.tools20022.repository.codeset.RejectedStatusReasonCode.SubscriberOrRedeemer,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.SettlementAmountCurrency, com.tools20022.repository.codeset.RejectedStatusReasonCode.PhysicalSettlement,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.PlaceOfTrade, com.tools20022.repository.codeset.RejectedStatusReasonCode.SettlementTransaction,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.RTGSSystem, com.tools20022.repository.codeset.RejectedStatusReasonCode.NoCancellationMatch,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.InvestorNameAddressUnknown, com.tools20022.repository.codeset.RejectedStatusReasonCode.InsufficientInvestorData,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.InvalidAccountServicer, com.tools20022.repository.codeset.RejectedStatusReasonCode.InvalidNomineeAccount,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.InvalidNewPlanManager, com.tools20022.repository.codeset.RejectedStatusReasonCode.CurrentYearPartial,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.PartialNotSupported, com.tools20022.repository.codeset.RejectedStatusReasonCode.FinancialInstrumentTaxYear,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.InvalidISAType, com.tools20022.repository.codeset.RejectedStatusReasonCode.InvalidCashAccount,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.DuplicateTransferReference, com.tools20022.repository.codeset.RejectedStatusReasonCode.InvalidSettlementAmount,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.InvalidOrderedAmount, com.tools20022.repository.codeset.RejectedStatusReasonCode.BelowMinimumInitialInvestmentAmount,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.BelowMinimumTopUpAmount, com.tools20022.repository.codeset.RejectedStatusReasonCode.InsufficientCapacity,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.PercentageHoldingBreach, com.tools20022.repository.codeset.RejectedStatusReasonCode.BelowMinimumRedemptionAmount,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.BelowMinimumRetainedAmount, com.tools20022.repository.codeset.RejectedStatusReasonCode.LockUp,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.AssetsIlliquid, com.tools20022.repository.codeset.RejectedStatusReasonCode.DataInvalid,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.FundClosed, com.tools20022.repository.codeset.RejectedStatusReasonCode.UnacceptableSwitchCombination);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(SettlementDate.getCodeName().get(), SettlementDate);
		codesByName.put(AcquisitionDate.getCodeName().get(), AcquisitionDate);
		codesByName.put(DifferentValuationPoints.getCodeName().get(), DifferentValuationPoints);
		codesByName.put(DeliveringAgent.getCodeName().get(), DeliveringAgent);
		codesByName.put(DirectDebit.getCodeName().get(), DirectDebit);
		codesByName.put(Intermediary.getCodeName().get(), Intermediary);
		codesByName.put(InvestmentAccount.getCodeName().get(), InvestmentAccount);
		codesByName.put(PaymentCard.getCodeName().get(), PaymentCard);
		codesByName.put(InvalidCreditTransfer.getCodeName().get(), InvalidCreditTransfer);
		codesByName.put(SettlementPlace.getCodeName().get(), SettlementPlace);
		codesByName.put(ReceivingAgent.getCodeName().get(), ReceivingAgent);
		codesByName.put(SafekeepingPlace.getCodeName().get(), SafekeepingPlace);
		codesByName.put(InvalidSecurityForm.getCodeName().get(), InvalidSecurityForm);
		codesByName.put(FinancialInstrumentIdentification.getCodeName().get(), FinancialInstrumentIdentification);
		codesByName.put(AccountBlockedForCorporateAction.getCodeName().get(), AccountBlockedForCorporateAction);
		codesByName.put(AccountBlockedForTransfer.getCodeName().get(), AccountBlockedForTransfer);
		codesByName.put(AccountBlockedMissingDocuments.getCodeName().get(), AccountBlockedMissingDocuments);
		codesByName.put(NotEnoughCash.getCodeName().get(), NotEnoughCash);
		codesByName.put(NotEnoughFinancialInstrument.getCodeName().get(), NotEnoughFinancialInstrument);
		codesByName.put(FinancialInstrumentIdentificationAndName.getCodeName().get(), FinancialInstrumentIdentificationAndName);
		codesByName.put(UnacceptedCommissionWaiving.getCodeName().get(), UnacceptedCommissionWaiving);
		codesByName.put(UnacceptedDealCurrency.getCodeName().get(), UnacceptedDealCurrency);
		codesByName.put(UnacceptedNAVCurrency.getCodeName().get(), UnacceptedNAVCurrency);
		codesByName.put(UnacceptedPaymentMethod.getCodeName().get(), UnacceptedPaymentMethod);
		codesByName.put(UnacceptedRequestedSettlementCurrency.getCodeName().get(), UnacceptedRequestedSettlementCurrency);
		codesByName.put(TooHighUnitsOrAmountToSubscribe.getCodeName().get(), TooHighUnitsOrAmountToSubscribe);
		codesByName.put(TooLowUnitsOrAmountToSubscribe.getCodeName().get(), TooLowUnitsOrAmountToSubscribe);
		codesByName.put(UnknownLinkagesReference.getCodeName().get(), UnknownLinkagesReference);
		codesByName.put(PhysicalDeliveryImpossible.getCodeName().get(), PhysicalDeliveryImpossible);
		codesByName.put(DuplicateOrderReference.getCodeName().get(), DuplicateOrderReference);
		codesByName.put(InstructingPartyNotAllowedForAccount.getCodeName().get(), InstructingPartyNotAllowedForAccount);
		codesByName.put(InvalidOrderType.getCodeName().get(), InvalidOrderType);
		codesByName.put(NotCompliantWithSLA.getCodeName().get(), NotCompliantWithSLA);
		codesByName.put(CutOffTime.getCodeName().get(), CutOffTime);
		codesByName.put(InvalidOrUnrecognisedReference.getCodeName().get(), InvalidOrUnrecognisedReference);
		codesByName.put(NotAllowedRequest.getCodeName().get(), NotAllowedRequest);
		codesByName.put(AlreadyExecuted.getCodeName().get(), AlreadyExecuted);
		codesByName.put(NotAllowedToCancel.getCodeName().get(), NotAllowedToCancel);
		codesByName.put(LegallyImpossible.getCodeName().get(), LegallyImpossible);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(FinancialInstrumentQuantity.getCodeName().get(), FinancialInstrumentQuantity);
		codesByName.put(CertificateNumber.getCodeName().get(), CertificateNumber);
		codesByName.put(SettlementParties.getCodeName().get(), SettlementParties);
		codesByName.put(TooLate.getCodeName().get(), TooLate);
		codesByName.put(AfterDeadline.getCodeName().get(), AfterDeadline);
		codesByName.put(TradeDate.getCodeName().get(), TradeDate);
		codesByName.put(FeeOrCommission.getCodeName().get(), FeeOrCommission);
		codesByName.put(SubscriberOrRedeemer.getCodeName().get(), SubscriberOrRedeemer);
		codesByName.put(SettlementAmountCurrency.getCodeName().get(), SettlementAmountCurrency);
		codesByName.put(PhysicalSettlement.getCodeName().get(), PhysicalSettlement);
		codesByName.put(PlaceOfTrade.getCodeName().get(), PlaceOfTrade);
		codesByName.put(SettlementTransaction.getCodeName().get(), SettlementTransaction);
		codesByName.put(RTGSSystem.getCodeName().get(), RTGSSystem);
		codesByName.put(NoCancellationMatch.getCodeName().get(), NoCancellationMatch);
		codesByName.put(InvestorNameAddressUnknown.getCodeName().get(), InvestorNameAddressUnknown);
		codesByName.put(InsufficientInvestorData.getCodeName().get(), InsufficientInvestorData);
		codesByName.put(InvalidAccountServicer.getCodeName().get(), InvalidAccountServicer);
		codesByName.put(InvalidNomineeAccount.getCodeName().get(), InvalidNomineeAccount);
		codesByName.put(InvalidNewPlanManager.getCodeName().get(), InvalidNewPlanManager);
		codesByName.put(CurrentYearPartial.getCodeName().get(), CurrentYearPartial);
		codesByName.put(PartialNotSupported.getCodeName().get(), PartialNotSupported);
		codesByName.put(FinancialInstrumentTaxYear.getCodeName().get(), FinancialInstrumentTaxYear);
		codesByName.put(InvalidISAType.getCodeName().get(), InvalidISAType);
		codesByName.put(InvalidCashAccount.getCodeName().get(), InvalidCashAccount);
		codesByName.put(DuplicateTransferReference.getCodeName().get(), DuplicateTransferReference);
		codesByName.put(InvalidSettlementAmount.getCodeName().get(), InvalidSettlementAmount);
		codesByName.put(InvalidOrderedAmount.getCodeName().get(), InvalidOrderedAmount);
		codesByName.put(BelowMinimumInitialInvestmentAmount.getCodeName().get(), BelowMinimumInitialInvestmentAmount);
		codesByName.put(BelowMinimumTopUpAmount.getCodeName().get(), BelowMinimumTopUpAmount);
		codesByName.put(InsufficientCapacity.getCodeName().get(), InsufficientCapacity);
		codesByName.put(PercentageHoldingBreach.getCodeName().get(), PercentageHoldingBreach);
		codesByName.put(BelowMinimumRedemptionAmount.getCodeName().get(), BelowMinimumRedemptionAmount);
		codesByName.put(BelowMinimumRetainedAmount.getCodeName().get(), BelowMinimumRetainedAmount);
		codesByName.put(LockUp.getCodeName().get(), LockUp);
		codesByName.put(AssetsIlliquid.getCodeName().get(), AssetsIlliquid);
		codesByName.put(DataInvalid.getCodeName().get(), DataInvalid);
		codesByName.put(FundClosed.getCodeName().get(), FundClosed);
		codesByName.put(UnacceptableSwitchCombination.getCodeName().get(), UnacceptableSwitchCombination);
	}

	public static RejectedStatusReasonCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RejectedStatusReasonCode[] values() {
		RejectedStatusReasonCode[] values = new RejectedStatusReasonCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RejectedStatusReasonCode> {
		@Override
		public RejectedStatusReasonCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RejectedStatusReasonCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}