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
import com.tools20022.repository.codeset.UnmatchedReasonCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason the transaction, transfer or settlement instruction is
 * unmatched.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#OtherFinancialInstrumentIdentification
 * UnmatchedReasonCode.OtherFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#LendingWithCollateral
 * UnmatchedReasonCode.LendingWithCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#LendingTransactionMethod
 * UnmatchedReasonCode.LendingTransactionMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#CallableTradeIndicator
 * UnmatchedReasonCode.CallableTradeIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#PositionEffect
 * UnmatchedReasonCode.PositionEffect}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#TypeOfFinancingClosing
 * UnmatchedReasonCode.TypeOfFinancingClosing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#SettlementDate2
 * UnmatchedReasonCode.SettlementDate2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#BorrowingRate
 * UnmatchedReasonCode.BorrowingRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#ClientOrderLinkIdentification
 * UnmatchedReasonCode.ClientOrderLinkIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#OpeningLegIdentification
 * UnmatchedReasonCode.OpeningLegIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#EndFactor
 * UnmatchedReasonCode.EndFactor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#CurrentFactor
 * UnmatchedReasonCode.CurrentFactor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#MaturityDate
 * UnmatchedReasonCode.MaturityDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#ClosingSettlementAmount
 * UnmatchedReasonCode.ClosingSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#AccruedInterestAmount2
 * UnmatchedReasonCode.AccruedInterestAmount2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#DealAmount2
 * UnmatchedReasonCode.DealAmount2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#BorrowingFee
 * UnmatchedReasonCode.BorrowingFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#BorrowingInterestAmount
 * UnmatchedReasonCode.BorrowingInterestAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#SecuritiesHaircut
 * UnmatchedReasonCode.SecuritiesHaircut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#StandardCollateralRatio
 * UnmatchedReasonCode.StandardCollateralRatio}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#AccruedInterestTax2
 * UnmatchedReasonCode.AccruedInterestTax2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#InterestType
 * UnmatchedReasonCode.InterestType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#NarrativeReason
 * UnmatchedReasonCode.NarrativeReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#ClearingSegment
 * UnmatchedReasonCode.ClearingSegment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#StandingSettlementInstruction
 * UnmatchedReasonCode.StandingSettlementInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#AccruedInterestTax1
 * UnmatchedReasonCode.AccruedInterestTax1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#TradeTransactionType
 * UnmatchedReasonCode.TradeTransactionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#CommonIdentification
 * UnmatchedReasonCode.CommonIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#AccruedInterestAmount1
 * UnmatchedReasonCode.AccruedInterestAmount1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#ConsumptionTax
 * UnmatchedReasonCode.ConsumptionTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#NoMatch
 * UnmatchedReasonCode.NoMatch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#SettlementDate
 * UnmatchedReasonCode.SettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#TransactionDirection
 * UnmatchedReasonCode.TransactionDirection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#TransactionDealAmount
 * UnmatchedReasonCode.TransactionDealAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#ReceivingDeliveringDepository
 * UnmatchedReasonCode.ReceivingDeliveringDepository}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#SettlementAmount
 * UnmatchedReasonCode.SettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#DealPrice
 * UnmatchedReasonCode.DealPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#FinancialInstrumentQuantity
 * UnmatchedReasonCode.FinancialInstrumentQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#RepurchaseCallDelay
 * UnmatchedReasonCode.RepurchaseCallDelay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#AccountServicerDeadlineMissed
 * UnmatchedReasonCode.AccountServicerDeadlineMissed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#SettlementTransaction
 * UnmatchedReasonCode.SettlementTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#SettlementSystemMethod
 * UnmatchedReasonCode.SettlementSystemMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#FinancialInstrument
 * UnmatchedReasonCode.FinancialInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#VariableRateSupport
 * UnmatchedReasonCode.VariableRateSupport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#NotRecognised
 * UnmatchedReasonCode.NotRecognised}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#RepurchaseSpreadRate
 * UnmatchedReasonCode.RepurchaseSpreadRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#RepurchaseRate
 * UnmatchedReasonCode.RepurchaseRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#CounterpartyTooLateForMatching
 * UnmatchedReasonCode.CounterpartyTooLateForMatching}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#RepurchaseRateType
 * UnmatchedReasonCode.RepurchaseRateType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#RepurchaseAmount
 * UnmatchedReasonCode.RepurchaseAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#RepurchasePremiumAmount
 * UnmatchedReasonCode.RepurchasePremiumAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#PhysicalSettlement
 * UnmatchedReasonCode.PhysicalSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#CommonReference
 * UnmatchedReasonCode.CommonReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#PaymentCode
 * UnmatchedReasonCode.PaymentCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#PlaceOfTrade
 * UnmatchedReasonCode.PlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#PossibleDuplicate
 * UnmatchedReasonCode.PossibleDuplicate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#ForfeitRepurchaseAmount
 * UnmatchedReasonCode.ForfeitRepurchaseAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#ExecutionBrokerCommission
 * UnmatchedReasonCode.ExecutionBrokerCommission}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#RegistrationDetails
 * UnmatchedReasonCode.RegistrationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#RTGSSystem
 * UnmatchedReasonCode.RTGSSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#ReceivingDeliveringParty1
 * UnmatchedReasonCode.ReceivingDeliveringParty1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#CounterpartyCancelled
 * UnmatchedReasonCode.CounterpartyCancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#ChargesAmount
 * UnmatchedReasonCode.ChargesAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#ReceivingDeliveringParty3
 * UnmatchedReasonCode.ReceivingDeliveringParty3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#CurrencySettlementAmount
 * UnmatchedReasonCode.CurrencySettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#MatchingRecordCancelled
 * UnmatchedReasonCode.MatchingRecordCancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#LetterOfGuarantee
 * UnmatchedReasonCode.LetterOfGuarantee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#NoMatchingStarted
 * UnmatchedReasonCode.NoMatchingStarted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#SafekeepingAccount
 * UnmatchedReasonCode.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#TradeDate
 * UnmatchedReasonCode.TradeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#MarketDeadlineMissed
 * UnmatchedReasonCode.MarketDeadlineMissed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#ClosingDateTime
 * UnmatchedReasonCode.ClosingDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#TaxStatus
 * UnmatchedReasonCode.TaxStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#ReceivingDeliveringParty2
 * UnmatchedReasonCode.ReceivingDeliveringParty2}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#Other
 * UnmatchedReasonCode.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#MissingMarketSide
 * UnmatchedReasonCode.MissingMarketSide}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#UnmatchedMarketSide
 * UnmatchedReasonCode.UnmatchedMarketSide}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#PlaceOfSafekeeping
 * UnmatchedReasonCode.PlaceOfSafekeeping}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#InvestorParty
 * UnmatchedReasonCode.InvestorParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#PlaceOfListing
 * UnmatchedReasonCode.PlaceOfListing}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#CumEx
 * UnmatchedReasonCode.CumEx}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode#AutomaticGeneration
 * UnmatchedReasonCode.AutomaticGeneration}</li>
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
 * <li>"OTHI"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UnmatchedReasonCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason the transaction, transfer or settlement instruction is unmatched."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class UnmatchedReasonCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * OtherIdentification of financial instrument identification does not
	 * match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherFinancialInstrumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "OtherIdentification of financial instrument identification does not match."
	 * </li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode OtherFinancialInstrumentIdentification = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherFinancialInstrumentIdentification";
			definition = "OtherIdentification of financial instrument identification does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "OTHI";
		}
	};
	/**
	 * LendingWithCollateral does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LWCO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LendingWithCollateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "LendingWithCollateral does not match."</li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode LendingWithCollateral = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LendingWithCollateral";
			definition = "LendingWithCollateral does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "LWCO";
		}
	};
	/**
	 * Lending transaction method does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LTME"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LendingTransactionMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Lending transaction method does not match."</li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode LendingTransactionMethod = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LendingTransactionMethod";
			definition = "Lending transaction method does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "LTME";
		}
	};
	/**
	 * CallableTradeIndicator does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CATI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CallableTradeIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "CallableTradeIndicator does not match."</li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode CallableTradeIndicator = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CallableTradeIndicator";
			definition = "CallableTradeIndicator does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "CATI";
		}
	};
	/**
	 * Position effect does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "POSE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PositionEffect"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Position effect does not match."</li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode PositionEffect = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PositionEffect";
			definition = "Position effect does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "POSE";
		}
	};
	/**
	 * Type of financing closing does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRTE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeOfFinancingClosing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of financing closing does not match."</li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode TypeOfFinancingClosing = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeOfFinancingClosing";
			definition = "Type of financing closing does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "TRTE";
		}
	};
	/**
	 * Settlement date in the second leg does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SDAT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDate2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement date in the second leg does not match."</li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode SettlementDate2 = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDate2";
			definition = "Settlement date in the second leg does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "SDAT";
		}
	};
	/**
	 * Borrowing rate does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BORT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BorrowingRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Borrowing rate does not match."</li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode BorrowingRate = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BorrowingRate";
			definition = "Borrowing rate does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "BORT";
		}
	};
	/**
	 * ClientOrderLinkIdentification does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OLID"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClientOrderLinkIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "ClientOrderLinkIdentification does not match."</li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode ClientOrderLinkIdentification = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientOrderLinkIdentification";
			definition = "ClientOrderLinkIdentification does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "OLID";
		}
	};
	/**
	 * OpeningLegIdentification does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OPLI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpeningLegIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "OpeningLegIdentification does not match."</li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode OpeningLegIdentification = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpeningLegIdentification";
			definition = "OpeningLegIdentification does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "OPLI";
		}
	};
	/**
	 * End factor does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ENFC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndFactor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "End factor does not match."</li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode EndFactor = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndFactor";
			definition = "End factor does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "ENFC";
		}
	};
	/**
	 * Current factor does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CUFC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentFactor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Current factor does not match."</li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode CurrentFactor = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentFactor";
			definition = "Current factor does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "CUFC";
		}
	};
	/**
	 * Maturity date does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MADA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaturityDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Maturity date does not match."</li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode MaturityDate = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaturityDate";
			definition = "Maturity date does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "MADA";
		}
	};
	/**
	 * Closing settlement amount does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRSA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosingSettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Closing settlement amount does not match."</li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode ClosingSettlementAmount = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingSettlementAmount";
			definition = "Closing settlement amount does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "TRSA";
		}
	};
	/**
	 * Accrued interest amount in the second leg does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACRS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccruedInterestAmount2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Accrued interest amount in the second leg does not match."
	 * </li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode AccruedInterestAmount2 = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedInterestAmount2";
			definition = "Accrued interest amount in the second leg does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "ACRS";
		}
	};
	/**
	 * Deal amount in the second leg does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DEAS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DealAmount2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Deal amount in the second leg does not match."</li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode DealAmount2 = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealAmount2";
			definition = "Deal amount in the second leg does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "DEAS";
		}
	};
	/**
	 * Borrowing fee does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BOFE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BorrowingFee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Borrowing fee does not match."</li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode BorrowingFee = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BorrowingFee";
			definition = "Borrowing fee does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "BOFE";
		}
	};
	/**
	 * Borrowing interest amount does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BOIA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BorrowingInterestAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Borrowing interest amount does not match."</li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode BorrowingInterestAmount = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BorrowingInterestAmount";
			definition = "Borrowing interest amount does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "BOIA";
		}
	};
	/**
	 * Securities haircut rate does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SHAI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesHaircut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Securities haircut rate does not match."</li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode SecuritiesHaircut = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesHaircut";
			definition = "Securities haircut rate does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "SHAI";
		}
	};
	/**
	 * Standard collateral ratio does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCRA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandardCollateralRatio"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Standard collateral ratio does not match."</li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode StandardCollateralRatio = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandardCollateralRatio";
			definition = "Standard collateral ratio does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "SCRA";
		}
	};
	/**
	 * Accrued interest tax indicator in the second leg does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TACS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccruedInterestTax2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Accrued interest tax indicator in the second leg does not match."</li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode AccruedInterestTax2 = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedInterestTax2";
			definition = "Accrued interest tax indicator in the second leg does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "TACS";
		}
	};
	/**
	 * Interest type does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INTT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Interest type does not match."</li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode InterestType = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestType";
			definition = "Interest type does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "INTT";
		}
	};
	/**
	 * See narrative field for the reason.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NARR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NarrativeReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "See narrative field for the reason."</li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode NarrativeReason = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NarrativeReason";
			definition = "See narrative field for the reason.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "NARR";
		}
	};
	/**
	 * Counterparty's instruction is for settlement through clearing segment,
	 * your instruction is not, or vice versa.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLSE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingSegment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Counterparty's instruction is for settlement through clearing segment, your instruction is not, or vice versa."
	 * </li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode ClearingSegment = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingSegment";
			definition = "Counterparty's instruction is for settlement through clearing segment, your instruction is not, or vice versa.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "CLSE";
		}
	};
	/**
	 * Counterparty's instruction is for settlement through standing settlement
	 * instruction, your instruction is not, or vice versa.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DBNM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingSettlementInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Counterparty's instruction is for settlement through standing settlement instruction, your instruction is not, or vice versa."
	 * </li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode StandingSettlementInstruction = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingSettlementInstruction";
			definition = "Counterparty's instruction is for settlement through standing settlement instruction, your instruction is not, or vice versa.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "DBNM";
		}
	};
	/**
	 * Accrued interest tax indicator does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TACR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccruedInterestTax1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Accrued interest tax indicator does not match."</li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode AccruedInterestTax1 = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedInterestTax1";
			definition = "Accrued interest tax indicator does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "TACR";
		}
	};
	/**
	 * Trade transaction type does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeTransactionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade transaction type does not match."</li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode TradeTransactionType = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeTransactionType";
			definition = "Trade transaction type does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "TRTR";
		}
	};
	/**
	 * CommonIdentification does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COID"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommonIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "CommonIdentification does not match."</li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode CommonIdentification = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommonIdentification";
			definition = "CommonIdentification does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "COID";
		}
	};
	/**
	 * Accrued interest amount does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACRU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccruedInterestAmount1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Accrued interest amount does not match."</li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode AccruedInterestAmount1 = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedInterestAmount1";
			definition = "Accrued interest amount does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "ACRU";
		}
	};
	/**
	 * Consumption tax amount does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COAX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConsumptionTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Consumption tax amount does not match."</li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode ConsumptionTax = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConsumptionTax";
			definition = "Consumption tax amount does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "COAX";
		}
	};
	/**
	 * A matching instruction from your counterparty could not be found.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CMIS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoMatch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A matching instruction from your counterparty could not be found."</li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode NoMatch = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoMatch";
			definition = "A matching instruction from your counterparty could not be found.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "CMIS";
		}
	};
	/**
	 * Settlement date/time does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DDAT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement date/time does not match."</li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode SettlementDate = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDate";
			definition = "Settlement date/time does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "DDAT";
		}
	};
	/**
	 * Direction of the trade does not match. Counterparty expects a delivery
	 * from you, not a receipt or vice versa.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DELN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionDirection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Direction of the trade does not match. Counterparty expects a delivery from you, not a receipt or vice versa."
	 * </li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode TransactionDirection = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionDirection";
			definition = "Direction of the trade does not match. Counterparty expects a delivery from you, not a receipt or vice versa.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "DELN";
		}
	};
	/**
	 * Deal amount does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DEAL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionDealAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Deal amount does not match."</li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode TransactionDealAmount = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionDealAmount";
			definition = "Deal amount does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "DEAL";
		}
	};
	/**
	 * Depository does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DEPT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDeliveringDepository"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Depository does not match."</li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode ReceivingDeliveringDepository = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDeliveringDepository";
			definition = "Depository does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "DEPT";
		}
	};
	/**
	 * Settlement amount does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DMON"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement amount does not match."</li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode SettlementAmount = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmount";
			definition = "Settlement amount does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "DMON";
		}
	};
	/**
	 * Deal price does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DDEA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DealPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Deal price does not match."</li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode DealPrice = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealPrice";
			definition = "Deal price does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "DDEA";
		}
	};
	/**
	 * Quantity of financial instruments does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DQUA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of financial instruments does not match."</li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode FinancialInstrumentQuantity = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentQuantity";
			definition = "Quantity of financial instruments does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "DQUA";
		}
	};
	/**
	 * Transaction call delay does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CADE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseCallDelay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction call delay does not match."</li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode RepurchaseCallDelay = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseCallDelay";
			definition = "Transaction call delay does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "CADE";
		}
	};
	/**
	 * Received after the account servicer's deadline. Processed on best effort
	 * basis.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ADEA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerDeadlineMissed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Received after the account servicer's deadline. Processed on best effort basis."
	 * </li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode AccountServicerDeadlineMissed = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerDeadlineMissed";
			definition = "Received after the account servicer's deadline. Processed on best effort basis.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "ADEA";
		}
	};
	/**
	 * Settlement transaction type does not match (relates to the settlement
	 * transaction type codes available for field: 22F:: SETR.).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
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
	 * definition} =
	 * "Settlement transaction type does not match (relates to the settlement transaction type codes available for field: 22F:: SETR.)."
	 * </li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode SettlementTransaction = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementTransaction";
			definition = "Settlement transaction type does not match (relates to the settlement transaction type codes available for field: 22F:: SETR.).";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "SETR";
		}
	};
	/**
	 * Settlement system/method does not match (for example, instruction is to
	 * settle using settlement system/method A. Counterparty expects settlement
	 * to occur using settlement system/method B).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SETS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementSystemMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement system/method does not match (for example, instruction is to settle using settlement system/method A. Counterparty expects settlement to occur using settlement system/method B)."
	 * </li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode SettlementSystemMethod = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementSystemMethod";
			definition = "Settlement system/method does not match (for example, instruction is to settle using settlement system/method A. Counterparty expects settlement to occur using settlement system/method B).";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "SETS";
		}
	};
	/**
	 * Financial instrument identification does not match, for example, ISIN,
	 * financial instrument attributes differs.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DSEC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial instrument identification does not match, for example, ISIN, financial instrument attributes differs."
	 * </li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode FinancialInstrument = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrument";
			definition = "Financial instrument identification does not match, for example, ISIN, financial instrument attributes differs.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "DSEC";
		}
	};
	/**
	 * Variable rate support does not match (repo).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VASU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariableRateSupport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Variable rate support does not match (repo)."</li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode VariableRateSupport = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariableRateSupport";
			definition = "Variable rate support does not match (repo).";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "VASU";
		}
	};
	/**
	 * Counterparty has been contacted or contacted us, and does not recognise
	 * the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DTRA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotRecognised"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Counterparty has been contacted or contacted us, and does not recognise the transaction."
	 * </li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode NotRecognised = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotRecognised";
			definition = "Counterparty has been contacted or contacted us, and does not recognise the transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "DTRA";
		}
	};
	/**
	 * Spread rate does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RSPR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseSpreadRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Spread rate does not match."</li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode RepurchaseSpreadRate = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseSpreadRate";
			definition = "Spread rate does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "RSPR";
		}
	};
	/**
	 * Repurchase rate does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REPO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Repurchase rate does not match."</li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode RepurchaseRate = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseRate";
			definition = "Repurchase rate does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "REPO";
		}
	};
	/**
	 * Counterparty's instruction was too late for matching.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLAT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyTooLateForMatching"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Counterparty's instruction was too late for matching."</li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode CounterpartyTooLateForMatching = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyTooLateForMatching";
			definition = "Counterparty's instruction was too late for matching.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "CLAT";
		}
	};
	/**
	 * Repurchase rate type does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RERT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseRateType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Repurchase rate type does not match."</li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode RepurchaseRateType = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseRateType";
			definition = "Repurchase rate type does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "RERT";
		}
	};
	/**
	 * Termination transaction amount does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REPA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Termination transaction amount does not match."</li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode RepurchaseAmount = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseAmount";
			definition = "Termination transaction amount does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "REPA";
		}
	};
	/**
	 * Premium amount does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REPP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchasePremiumAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Premium amount does not match."</li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode RepurchasePremiumAmount = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchasePremiumAmount";
			definition = "Premium amount does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "REPP";
		}
	};
	/**
	 * Counterparty's instruction is physical settlement, your instruction is
	 * not, or vice versa.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
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
	 * definition} =
	 * "Counterparty's instruction is physical settlement, your instruction is not, or vice versa."
	 * </li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode PhysicalSettlement = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalSettlement";
			definition = "Counterparty's instruction is physical settlement, your instruction is not, or vice versa.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "PHYS";
		}
	};
	/**
	 * Common reference does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IIND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommonReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Common reference does not match."</li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode CommonReference = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommonReference";
			definition = "Common reference does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "IIND";
		}
	};
	/**
	 * Payment type does not match: your instruction is free of payment, your
	 * counterparty's instruction is against payment or vice versa.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FRAP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment type does not match: your instruction is free of payment, your counterparty's instruction is against payment or vice versa."
	 * </li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode PaymentCode = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentCode";
			definition = "Payment type does not match: your instruction is free of payment, your counterparty's instruction is against payment or vice versa.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "FRAP";
		}
	};
	/**
	 * Place of trade does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
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
	 * definition} = "Place of trade does not match."</li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode PlaceOfTrade = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfTrade";
			definition = "Place of trade does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "PLCE";
		}
	};
	/**
	 * Instruction has not been matched. It is a possible duplicate instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PODU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PossibleDuplicate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction has not been matched. It is a possible duplicate instruction."
	 * </li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode PossibleDuplicate = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PossibleDuplicate";
			definition = "Instruction has not been matched. It is a possible duplicate instruction.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "PODU";
		}
	};
	/**
	 * Forfeit amount does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FORF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForfeitRepurchaseAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Forfeit amount does not match."</li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode ForfeitRepurchaseAmount = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForfeitRepurchaseAmount";
			definition = "Forfeit amount does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "FORF";
		}
	};
	/**
	 * Executing broker's commission does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXEC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExecutionBrokerCommission"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Executing broker's commission does not match."</li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode ExecutionBrokerCommission = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExecutionBrokerCommission";
			definition = "Executing broker's commission does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "EXEC";
		}
	};
	/**
	 * Registration details linked to the transaction are incorrect.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REGD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Registration details linked to the transaction are incorrect."</li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode RegistrationDetails = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationDetails";
			definition = "Registration details linked to the transaction are incorrect.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "REGD";
		}
	};
	/**
	 * Counterparty is for Real Time Gross Settlement (RTGS) system, you are for
	 * non-RTGS or vice versa.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
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
	 * definition} =
	 * "Counterparty is for Real Time Gross Settlement (RTGS) system, you are for non-RTGS or vice versa."
	 * </li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode RTGSSystem = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RTGSSystem";
			definition = "Counterparty is for Real Time Gross Settlement (RTGS) system, you are for non-RTGS or vice versa.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "RTGS";
		}
	};
	/**
	 * Participant of delivering or receiving depository does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ICAG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDeliveringParty1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Participant of delivering or receiving depository does not match."</li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode ReceivingDeliveringParty1 = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDeliveringParty1";
			definition = "Participant of delivering or receiving depository does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "ICAG";
		}
	};
	/**
	 * Counterparty cancelled their instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CPCA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyCancelled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Counterparty cancelled their instruction."</li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode CounterpartyCancelled = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyCancelled";
			definition = "Counterparty cancelled their instruction.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "CPCA";
		}
	};
	/**
	 * Charges amount does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CHAR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargesAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Charges amount does not match."</li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode ChargesAmount = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargesAmount";
			definition = "Charges amount does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "CHAR";
		}
	};
	/**
	 * Client of delivering or receiving party 2 does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IEXE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDeliveringParty3"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Client of delivering or receiving party 2 does not match."
	 * </li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode ReceivingDeliveringParty3 = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDeliveringParty3";
			definition = "Client of delivering or receiving party 2 does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "IEXE";
		}
	};
	/**
	 * Settlement amount currency does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NCRR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencySettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement amount currency does not match."</li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode CurrencySettlementAmount = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencySettlementAmount";
			definition = "Settlement amount currency does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "NCRR";
		}
	};
	/**
	 * Corresponding matching record has been cancelled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MCAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchingRecordCancelled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Corresponding matching record has been cancelled."</li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode MatchingRecordCancelled = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchingRecordCancelled";
			definition = "Corresponding matching record has been cancelled.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "MCAN";
		}
	};
	/**
	 * Counterparty is for settlement through letter of guarantee, your
	 * instruction is not, or vice versa.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LEOG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LetterOfGuarantee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Counterparty is for settlement through letter of guarantee, your instruction is not, or vice versa."
	 * </li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode LetterOfGuarantee = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LetterOfGuarantee";
			definition = "Counterparty is for settlement through letter of guarantee, your instruction is not, or vice versa.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "LEOG";
		}
	};
	/**
	 * Matching process has not yet started.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NMAS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoMatchingStarted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Matching process has not yet started."</li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode NoMatchingStarted = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoMatchingStarted";
			definition = "Matching process has not yet started.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "NMAS";
		}
	};
	/**
	 * Safekeeping account used as matching criteria on the market concerned
	 * does not match. This includes Buyer/seller's account, direct client's
	 * account at the receiving/delivering agent, or receiving/delivering
	 * agent's account at the CSD.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SAFE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Safekeeping account used as matching criteria on the market concerned does not match. This includes Buyer/seller's account, direct client's account at the receiving/delivering agent, or receiving/delivering agent's account at the CSD."
	 * </li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode SafekeepingAccount = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount";
			definition = "Safekeeping account used as matching criteria on the market concerned does not match. This includes Buyer/seller's account, direct client's account at the receiving/delivering agent, or receiving/delivering agent's account at the CSD.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "SAFE";
		}
	};
	/**
	 * Trade date does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
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
	 * definition} = "Trade date does not match."</li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode TradeDate = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDate";
			definition = "Trade date does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "DTRD";
		}
	};
	/**
	 * Your instruction was too late for matching.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LATE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketDeadlineMissed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Your instruction was too late for matching."</li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode MarketDeadlineMissed = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketDeadlineMissed";
			definition = "Your instruction was too late for matching.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "LATE";
		}
	};
	/**
	 * Closing date/time does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TERM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosingDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Closing date/time does not match."</li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode ClosingDateTime = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingDateTime";
			definition = "Closing date/time does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "TERM";
		}
	};
	/**
	 * Disagreement on the tax status of the financial instruments to be
	 * settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TXST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Disagreement on the tax status of the financial instruments to be settled."
	 * </li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode TaxStatus = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxStatus";
			definition = "Disagreement on the tax status of the financial instruments to be settled.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "TXST";
		}
	};
	/**
	 * Client of delivering or receiving party 1 does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ICUS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDeliveringParty2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Client of delivering or receiving party 1 does not match."
	 * </li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode ReceivingDeliveringParty2 = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDeliveringParty2";
			definition = "Client of delivering or receiving party 1 does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "ICUS";
		}
	};
	/**
	 * Proprietary unmatched reason code described in a narrative field.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
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
	 * definition} =
	 * "Proprietary unmatched reason code described in a narrative field."</li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode Other = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Proprietary unmatched reason code described in a narrative field.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Missing market execution details.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MIME"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingMarketSide"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Missing market execution details."</li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode MissingMarketSide = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingMarketSide";
			definition = "Missing market execution details.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "MIME";
		}
	};
	/**
	 * Market side trade is unmatched.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UNBR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnmatchedMarketSide"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Market side trade is unmatched."</li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode UnmatchedMarketSide = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnmatchedMarketSide";
			definition = "Market side trade is unmatched.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "UNBR";
		}
	};
	/**
	 * Place of safekeeping information does not allow matching to take place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INPS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfSafekeeping"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Place of safekeeping information does not allow matching to take place."
	 * </li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode PlaceOfSafekeeping = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfSafekeeping";
			definition = "Place of safekeeping information does not allow matching to take place.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "INPS";
		}
	};
	/**
	 * Investor party does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INVE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestorParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Investor party does not match."</li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode InvestorParty = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorParty";
			definition = "Investor party does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "INVE";
		}
	};
	/**
	 * Place of listing does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PLIS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfListing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Place of listing does not match."</li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode PlaceOfListing = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfListing";
			definition = "Place of listing does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "PLIS";
		}
	};
	/**
	 * Disagreement if trade was executed cum or ex.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DCMX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CumEx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Disagreement if trade was executed cum or ex."</li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode CumEx = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CumEx";
			definition = "Disagreement if trade was executed cum or ex.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "DCMX";
		}
	};
	/**
	 * Disagreement on automatic generation of market claim or transformation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DMCT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AutomaticGeneration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Disagreement on automatic generation of market claim or transformation."
	 * </li>
	 * </ul>
	 */
	public static final UnmatchedReasonCode AutomaticGeneration = new UnmatchedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AutomaticGeneration";
			definition = "Disagreement on automatic generation of market claim or transformation.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReasonCode.mmObject();
			codeName = "DMCT";
		}
	};
	final static private LinkedHashMap<String, UnmatchedReasonCode> codesByName = new LinkedHashMap<>();

	protected UnmatchedReasonCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("OTHI");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UnmatchedReasonCode";
				definition = "Specifies the reason the transaction, transfer or settlement instruction is unmatched.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.UnmatchedReasonCode.OtherFinancialInstrumentIdentification, com.tools20022.repository.codeset.UnmatchedReasonCode.LendingWithCollateral,
						com.tools20022.repository.codeset.UnmatchedReasonCode.LendingTransactionMethod, com.tools20022.repository.codeset.UnmatchedReasonCode.CallableTradeIndicator,
						com.tools20022.repository.codeset.UnmatchedReasonCode.PositionEffect, com.tools20022.repository.codeset.UnmatchedReasonCode.TypeOfFinancingClosing,
						com.tools20022.repository.codeset.UnmatchedReasonCode.SettlementDate2, com.tools20022.repository.codeset.UnmatchedReasonCode.BorrowingRate,
						com.tools20022.repository.codeset.UnmatchedReasonCode.ClientOrderLinkIdentification, com.tools20022.repository.codeset.UnmatchedReasonCode.OpeningLegIdentification,
						com.tools20022.repository.codeset.UnmatchedReasonCode.EndFactor, com.tools20022.repository.codeset.UnmatchedReasonCode.CurrentFactor, com.tools20022.repository.codeset.UnmatchedReasonCode.MaturityDate,
						com.tools20022.repository.codeset.UnmatchedReasonCode.ClosingSettlementAmount, com.tools20022.repository.codeset.UnmatchedReasonCode.AccruedInterestAmount2,
						com.tools20022.repository.codeset.UnmatchedReasonCode.DealAmount2, com.tools20022.repository.codeset.UnmatchedReasonCode.BorrowingFee, com.tools20022.repository.codeset.UnmatchedReasonCode.BorrowingInterestAmount,
						com.tools20022.repository.codeset.UnmatchedReasonCode.SecuritiesHaircut, com.tools20022.repository.codeset.UnmatchedReasonCode.StandardCollateralRatio,
						com.tools20022.repository.codeset.UnmatchedReasonCode.AccruedInterestTax2, com.tools20022.repository.codeset.UnmatchedReasonCode.InterestType, com.tools20022.repository.codeset.UnmatchedReasonCode.NarrativeReason,
						com.tools20022.repository.codeset.UnmatchedReasonCode.ClearingSegment, com.tools20022.repository.codeset.UnmatchedReasonCode.StandingSettlementInstruction,
						com.tools20022.repository.codeset.UnmatchedReasonCode.AccruedInterestTax1, com.tools20022.repository.codeset.UnmatchedReasonCode.TradeTransactionType,
						com.tools20022.repository.codeset.UnmatchedReasonCode.CommonIdentification, com.tools20022.repository.codeset.UnmatchedReasonCode.AccruedInterestAmount1,
						com.tools20022.repository.codeset.UnmatchedReasonCode.ConsumptionTax, com.tools20022.repository.codeset.UnmatchedReasonCode.NoMatch, com.tools20022.repository.codeset.UnmatchedReasonCode.SettlementDate,
						com.tools20022.repository.codeset.UnmatchedReasonCode.TransactionDirection, com.tools20022.repository.codeset.UnmatchedReasonCode.TransactionDealAmount,
						com.tools20022.repository.codeset.UnmatchedReasonCode.ReceivingDeliveringDepository, com.tools20022.repository.codeset.UnmatchedReasonCode.SettlementAmount,
						com.tools20022.repository.codeset.UnmatchedReasonCode.DealPrice, com.tools20022.repository.codeset.UnmatchedReasonCode.FinancialInstrumentQuantity,
						com.tools20022.repository.codeset.UnmatchedReasonCode.RepurchaseCallDelay, com.tools20022.repository.codeset.UnmatchedReasonCode.AccountServicerDeadlineMissed,
						com.tools20022.repository.codeset.UnmatchedReasonCode.SettlementTransaction, com.tools20022.repository.codeset.UnmatchedReasonCode.SettlementSystemMethod,
						com.tools20022.repository.codeset.UnmatchedReasonCode.FinancialInstrument, com.tools20022.repository.codeset.UnmatchedReasonCode.VariableRateSupport,
						com.tools20022.repository.codeset.UnmatchedReasonCode.NotRecognised, com.tools20022.repository.codeset.UnmatchedReasonCode.RepurchaseSpreadRate, com.tools20022.repository.codeset.UnmatchedReasonCode.RepurchaseRate,
						com.tools20022.repository.codeset.UnmatchedReasonCode.CounterpartyTooLateForMatching, com.tools20022.repository.codeset.UnmatchedReasonCode.RepurchaseRateType,
						com.tools20022.repository.codeset.UnmatchedReasonCode.RepurchaseAmount, com.tools20022.repository.codeset.UnmatchedReasonCode.RepurchasePremiumAmount,
						com.tools20022.repository.codeset.UnmatchedReasonCode.PhysicalSettlement, com.tools20022.repository.codeset.UnmatchedReasonCode.CommonReference, com.tools20022.repository.codeset.UnmatchedReasonCode.PaymentCode,
						com.tools20022.repository.codeset.UnmatchedReasonCode.PlaceOfTrade, com.tools20022.repository.codeset.UnmatchedReasonCode.PossibleDuplicate,
						com.tools20022.repository.codeset.UnmatchedReasonCode.ForfeitRepurchaseAmount, com.tools20022.repository.codeset.UnmatchedReasonCode.ExecutionBrokerCommission,
						com.tools20022.repository.codeset.UnmatchedReasonCode.RegistrationDetails, com.tools20022.repository.codeset.UnmatchedReasonCode.RTGSSystem,
						com.tools20022.repository.codeset.UnmatchedReasonCode.ReceivingDeliveringParty1, com.tools20022.repository.codeset.UnmatchedReasonCode.CounterpartyCancelled,
						com.tools20022.repository.codeset.UnmatchedReasonCode.ChargesAmount, com.tools20022.repository.codeset.UnmatchedReasonCode.ReceivingDeliveringParty3,
						com.tools20022.repository.codeset.UnmatchedReasonCode.CurrencySettlementAmount, com.tools20022.repository.codeset.UnmatchedReasonCode.MatchingRecordCancelled,
						com.tools20022.repository.codeset.UnmatchedReasonCode.LetterOfGuarantee, com.tools20022.repository.codeset.UnmatchedReasonCode.NoMatchingStarted,
						com.tools20022.repository.codeset.UnmatchedReasonCode.SafekeepingAccount, com.tools20022.repository.codeset.UnmatchedReasonCode.TradeDate, com.tools20022.repository.codeset.UnmatchedReasonCode.MarketDeadlineMissed,
						com.tools20022.repository.codeset.UnmatchedReasonCode.ClosingDateTime, com.tools20022.repository.codeset.UnmatchedReasonCode.TaxStatus,
						com.tools20022.repository.codeset.UnmatchedReasonCode.ReceivingDeliveringParty2, com.tools20022.repository.codeset.UnmatchedReasonCode.Other, com.tools20022.repository.codeset.UnmatchedReasonCode.MissingMarketSide,
						com.tools20022.repository.codeset.UnmatchedReasonCode.UnmatchedMarketSide, com.tools20022.repository.codeset.UnmatchedReasonCode.PlaceOfSafekeeping,
						com.tools20022.repository.codeset.UnmatchedReasonCode.InvestorParty, com.tools20022.repository.codeset.UnmatchedReasonCode.PlaceOfListing, com.tools20022.repository.codeset.UnmatchedReasonCode.CumEx,
						com.tools20022.repository.codeset.UnmatchedReasonCode.AutomaticGeneration);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(OtherFinancialInstrumentIdentification.getCodeName().get(), OtherFinancialInstrumentIdentification);
		codesByName.put(LendingWithCollateral.getCodeName().get(), LendingWithCollateral);
		codesByName.put(LendingTransactionMethod.getCodeName().get(), LendingTransactionMethod);
		codesByName.put(CallableTradeIndicator.getCodeName().get(), CallableTradeIndicator);
		codesByName.put(PositionEffect.getCodeName().get(), PositionEffect);
		codesByName.put(TypeOfFinancingClosing.getCodeName().get(), TypeOfFinancingClosing);
		codesByName.put(SettlementDate2.getCodeName().get(), SettlementDate2);
		codesByName.put(BorrowingRate.getCodeName().get(), BorrowingRate);
		codesByName.put(ClientOrderLinkIdentification.getCodeName().get(), ClientOrderLinkIdentification);
		codesByName.put(OpeningLegIdentification.getCodeName().get(), OpeningLegIdentification);
		codesByName.put(EndFactor.getCodeName().get(), EndFactor);
		codesByName.put(CurrentFactor.getCodeName().get(), CurrentFactor);
		codesByName.put(MaturityDate.getCodeName().get(), MaturityDate);
		codesByName.put(ClosingSettlementAmount.getCodeName().get(), ClosingSettlementAmount);
		codesByName.put(AccruedInterestAmount2.getCodeName().get(), AccruedInterestAmount2);
		codesByName.put(DealAmount2.getCodeName().get(), DealAmount2);
		codesByName.put(BorrowingFee.getCodeName().get(), BorrowingFee);
		codesByName.put(BorrowingInterestAmount.getCodeName().get(), BorrowingInterestAmount);
		codesByName.put(SecuritiesHaircut.getCodeName().get(), SecuritiesHaircut);
		codesByName.put(StandardCollateralRatio.getCodeName().get(), StandardCollateralRatio);
		codesByName.put(AccruedInterestTax2.getCodeName().get(), AccruedInterestTax2);
		codesByName.put(InterestType.getCodeName().get(), InterestType);
		codesByName.put(NarrativeReason.getCodeName().get(), NarrativeReason);
		codesByName.put(ClearingSegment.getCodeName().get(), ClearingSegment);
		codesByName.put(StandingSettlementInstruction.getCodeName().get(), StandingSettlementInstruction);
		codesByName.put(AccruedInterestTax1.getCodeName().get(), AccruedInterestTax1);
		codesByName.put(TradeTransactionType.getCodeName().get(), TradeTransactionType);
		codesByName.put(CommonIdentification.getCodeName().get(), CommonIdentification);
		codesByName.put(AccruedInterestAmount1.getCodeName().get(), AccruedInterestAmount1);
		codesByName.put(ConsumptionTax.getCodeName().get(), ConsumptionTax);
		codesByName.put(NoMatch.getCodeName().get(), NoMatch);
		codesByName.put(SettlementDate.getCodeName().get(), SettlementDate);
		codesByName.put(TransactionDirection.getCodeName().get(), TransactionDirection);
		codesByName.put(TransactionDealAmount.getCodeName().get(), TransactionDealAmount);
		codesByName.put(ReceivingDeliveringDepository.getCodeName().get(), ReceivingDeliveringDepository);
		codesByName.put(SettlementAmount.getCodeName().get(), SettlementAmount);
		codesByName.put(DealPrice.getCodeName().get(), DealPrice);
		codesByName.put(FinancialInstrumentQuantity.getCodeName().get(), FinancialInstrumentQuantity);
		codesByName.put(RepurchaseCallDelay.getCodeName().get(), RepurchaseCallDelay);
		codesByName.put(AccountServicerDeadlineMissed.getCodeName().get(), AccountServicerDeadlineMissed);
		codesByName.put(SettlementTransaction.getCodeName().get(), SettlementTransaction);
		codesByName.put(SettlementSystemMethod.getCodeName().get(), SettlementSystemMethod);
		codesByName.put(FinancialInstrument.getCodeName().get(), FinancialInstrument);
		codesByName.put(VariableRateSupport.getCodeName().get(), VariableRateSupport);
		codesByName.put(NotRecognised.getCodeName().get(), NotRecognised);
		codesByName.put(RepurchaseSpreadRate.getCodeName().get(), RepurchaseSpreadRate);
		codesByName.put(RepurchaseRate.getCodeName().get(), RepurchaseRate);
		codesByName.put(CounterpartyTooLateForMatching.getCodeName().get(), CounterpartyTooLateForMatching);
		codesByName.put(RepurchaseRateType.getCodeName().get(), RepurchaseRateType);
		codesByName.put(RepurchaseAmount.getCodeName().get(), RepurchaseAmount);
		codesByName.put(RepurchasePremiumAmount.getCodeName().get(), RepurchasePremiumAmount);
		codesByName.put(PhysicalSettlement.getCodeName().get(), PhysicalSettlement);
		codesByName.put(CommonReference.getCodeName().get(), CommonReference);
		codesByName.put(PaymentCode.getCodeName().get(), PaymentCode);
		codesByName.put(PlaceOfTrade.getCodeName().get(), PlaceOfTrade);
		codesByName.put(PossibleDuplicate.getCodeName().get(), PossibleDuplicate);
		codesByName.put(ForfeitRepurchaseAmount.getCodeName().get(), ForfeitRepurchaseAmount);
		codesByName.put(ExecutionBrokerCommission.getCodeName().get(), ExecutionBrokerCommission);
		codesByName.put(RegistrationDetails.getCodeName().get(), RegistrationDetails);
		codesByName.put(RTGSSystem.getCodeName().get(), RTGSSystem);
		codesByName.put(ReceivingDeliveringParty1.getCodeName().get(), ReceivingDeliveringParty1);
		codesByName.put(CounterpartyCancelled.getCodeName().get(), CounterpartyCancelled);
		codesByName.put(ChargesAmount.getCodeName().get(), ChargesAmount);
		codesByName.put(ReceivingDeliveringParty3.getCodeName().get(), ReceivingDeliveringParty3);
		codesByName.put(CurrencySettlementAmount.getCodeName().get(), CurrencySettlementAmount);
		codesByName.put(MatchingRecordCancelled.getCodeName().get(), MatchingRecordCancelled);
		codesByName.put(LetterOfGuarantee.getCodeName().get(), LetterOfGuarantee);
		codesByName.put(NoMatchingStarted.getCodeName().get(), NoMatchingStarted);
		codesByName.put(SafekeepingAccount.getCodeName().get(), SafekeepingAccount);
		codesByName.put(TradeDate.getCodeName().get(), TradeDate);
		codesByName.put(MarketDeadlineMissed.getCodeName().get(), MarketDeadlineMissed);
		codesByName.put(ClosingDateTime.getCodeName().get(), ClosingDateTime);
		codesByName.put(TaxStatus.getCodeName().get(), TaxStatus);
		codesByName.put(ReceivingDeliveringParty2.getCodeName().get(), ReceivingDeliveringParty2);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(MissingMarketSide.getCodeName().get(), MissingMarketSide);
		codesByName.put(UnmatchedMarketSide.getCodeName().get(), UnmatchedMarketSide);
		codesByName.put(PlaceOfSafekeeping.getCodeName().get(), PlaceOfSafekeeping);
		codesByName.put(InvestorParty.getCodeName().get(), InvestorParty);
		codesByName.put(PlaceOfListing.getCodeName().get(), PlaceOfListing);
		codesByName.put(CumEx.getCodeName().get(), CumEx);
		codesByName.put(AutomaticGeneration.getCodeName().get(), AutomaticGeneration);
	}

	public static UnmatchedReasonCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static UnmatchedReasonCode[] values() {
		UnmatchedReasonCode[] values = new UnmatchedReasonCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, UnmatchedReasonCode> {
		@Override
		public UnmatchedReasonCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(UnmatchedReasonCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}