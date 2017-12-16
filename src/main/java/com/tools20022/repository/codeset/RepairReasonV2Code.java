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
import com.tools20022.repository.codeset.RepairReasonV2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason why the instruction is in repair.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code#ClosingTransactionAmount
 * RepairReasonV2Code.mmClosingTransactionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code#NarrativeReason
 * RepairReasonV2Code.mmNarrativeReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code#ProcessingBatch
 * RepairReasonV2Code.mmProcessingBatch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code#TransactionCallDelay
 * RepairReasonV2Code.mmTransactionCallDelay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code#CorporateAction
 * RepairReasonV2Code.mmCorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code#CashAccount
 * RepairReasonV2Code.mmCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code#ImpossibleCashSettlementSystem
 * RepairReasonV2Code.mmImpossibleCashSettlementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code#SettlementDate
 * RepairReasonV2Code.mmSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code#DealPrice
 * RepairReasonV2Code.mmDealPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code#SettlementAmount
 * RepairReasonV2Code.mmSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code#Quantity
 * RepairReasonV2Code.mmQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code#Security
 * RepairReasonV2Code.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code#TradeDate
 * RepairReasonV2Code.mmTradeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code#ForfeitAmount
 * RepairReasonV2Code.mmForfeitAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code#CommonReference
 * RepairReasonV2Code.mmCommonReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code#LetterOfGuaranteeIndicator
 * RepairReasonV2Code.mmLetterOfGuaranteeIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code#MinimumSettlementQuantity
 * RepairReasonV2Code.mmMinimumSettlementQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code#MultipleSettlementQuantity
 * RepairReasonV2Code.mmMultipleSettlementQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code#SettlementAmountCurrency
 * RepairReasonV2Code.mmSettlementAmountCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code#PhysicalSettlementImpossible
 * RepairReasonV2Code.mmPhysicalSettlementImpossible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code#PlaceOfTrade
 * RepairReasonV2Code.mmPlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code#Reference
 * RepairReasonV2Code.mmReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code#TerminationTransactionAmount
 * RepairReasonV2Code.mmTerminationTransactionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code#RepurchaseRate
 * RepairReasonV2Code.mmRepurchaseRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code#PremiumAmount
 * RepairReasonV2Code.mmPremiumAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code#RepurchaseRateType
 * RepairReasonV2Code.mmRepurchaseRateType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code#SpreadRate
 * RepairReasonV2Code.mmSpreadRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code#ImpossibleToUseTheRTGSSystemInstructed
 * RepairReasonV2Code.mmImpossibleToUseTheRTGSSystemInstructed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code#SafekeepingAccount
 * RepairReasonV2Code.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code#SettlementTransaction
 * RepairReasonV2Code.mmSettlementTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code#SettlementSystemMethod
 * RepairReasonV2Code.mmSettlementSystemMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code#ClosingDateTime
 * RepairReasonV2Code.mmClosingDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code#TaxStatus
 * RepairReasonV2Code.mmTaxStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code#VariableRateSupport
 * RepairReasonV2Code.mmVariableRateSupport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code#AccountServicerDeadlineMissed
 * RepairReasonV2Code.mmAccountServicerDeadlineMissed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code#TypeOfOrderRepair
 * RepairReasonV2Code.mmTypeOfOrderRepair}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code#CommercializationContractRepair
 * RepairReasonV2Code.mmCommercializationContractRepair}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code#FeeCommissionRepair
 * RepairReasonV2Code.mmFeeCommissionRepair}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code#NarrativeInformationRepair
 * RepairReasonV2Code.mmNarrativeInformationRepair}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RepairReasonV2Code#NoMatch
 * RepairReasonV2Code.mmNoMatch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code#NotFound
 * RepairReasonV2Code.mmNotFound}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RepairReasonV2Code#Unknown
 * RepairReasonV2Code.mmUnknown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code#PlaceOfSafekeeping
 * RepairReasonV2Code.mmPlaceOfSafekeeping}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code#StampDuty
 * RepairReasonV2Code.mmStampDuty}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RepairReasonV2Code#Other
 * RepairReasonV2Code.mmOther}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code#ReceivingDeliveringDepository
 * RepairReasonV2Code.mmReceivingDeliveringDepository}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code#ReceivingDeliveringParty3
 * RepairReasonV2Code.mmReceivingDeliveringParty3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code#ReceivingDeliveringParty2
 * RepairReasonV2Code.mmReceivingDeliveringParty2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code#ReceivingDeliveringParty1
 * RepairReasonV2Code.mmReceivingDeliveringParty1}</li>
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
 * <li>"CTRA"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RepairReasonV2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the reason why the instruction is in repair."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RepairReasonV2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Unrecognised or invalid closing transaction amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code
	 * RepairReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CTRA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosingTransactionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised or invalid closing transaction amount."</li>
	 * </ul>
	 */
	public static final RepairReasonV2Code ClosingTransactionAmount = new RepairReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingTransactionAmount";
			definition = "Unrecognised or invalid closing transaction amount.";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReasonV2Code.mmObject();
			codeName = "CTRA";
		}
	};
	/**
	 * See narrative field for reason.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code
	 * RepairReasonV2Code}</li>
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
	 * definition} = "See narrative field for reason."</li>
	 * </ul>
	 */
	public static final RepairReasonV2Code NarrativeReason = new RepairReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NarrativeReason";
			definition = "See narrative field for reason.";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReasonV2Code.mmObject();
			codeName = "NARR";
		}
	};
	/**
	 * Unrecognised or invalid processing batch, that is, daytime/real-time
	 * while only possible to settle in overnight batch.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code
	 * RepairReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BATC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingBatch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unrecognised or invalid processing batch, that is, daytime/real-time while only possible to settle in overnight batch."
	 * </li>
	 * </ul>
	 */
	public static final RepairReasonV2Code ProcessingBatch = new RepairReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingBatch";
			definition = "Unrecognised or invalid processing batch, that is, daytime/real-time while only possible to settle in overnight batch.";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReasonV2Code.mmObject();
			codeName = "BATC";
		}
	};
	/**
	 * Unrecognised or invalid transaction call delay.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code
	 * RepairReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CADE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionCallDelay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised or invalid transaction call delay."</li>
	 * </ul>
	 */
	public static final RepairReasonV2Code TransactionCallDelay = new RepairReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionCallDelay";
			definition = "Unrecognised or invalid transaction call delay.";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReasonV2Code.mmObject();
			codeName = "CADE";
		}
	};
	/**
	 * Corporate action pending on the financial instrument instructed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code
	 * RepairReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CAEV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action pending on the financial instrument instructed."</li>
	 * </ul>
	 */
	public static final RepairReasonV2Code CorporateAction = new RepairReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateAction";
			definition = "Corporate action pending on the financial instrument instructed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReasonV2Code.mmObject();
			codeName = "CAEV";
		}
	};
	/**
	 * Unrecognised or invalid cash account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code
	 * RepairReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CASH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised or invalid cash account."</li>
	 * </ul>
	 */
	public static final RepairReasonV2Code CashAccount = new RepairReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccount";
			definition = "Unrecognised or invalid cash account.";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReasonV2Code.mmObject();
			codeName = "CASH";
		}
	};
	/**
	 * Impossible standing arrangements override instruction for the cash
	 * settlement system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code
	 * RepairReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CASY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ImpossibleCashSettlementSystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Impossible standing arrangements override instruction for the cash settlement system."
	 * </li>
	 * </ul>
	 */
	public static final RepairReasonV2Code ImpossibleCashSettlementSystem = new RepairReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ImpossibleCashSettlementSystem";
			definition = "Impossible standing arrangements override instruction for the cash settlement system.";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReasonV2Code.mmObject();
			codeName = "CASY";
		}
	};
	/**
	 * Unrecognised or invalid settlement date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code
	 * RepairReasonV2Code}</li>
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
	 * definition} = "Unrecognised or invalid settlement date."</li>
	 * </ul>
	 */
	public static final RepairReasonV2Code SettlementDate = new RepairReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDate";
			definition = "Unrecognised or invalid settlement date.";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReasonV2Code.mmObject();
			codeName = "DDAT";
		}
	};
	/**
	 * Unrecognised or invalid deal price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code
	 * RepairReasonV2Code}</li>
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
	 * definition} = "Unrecognised or invalid deal price."</li>
	 * </ul>
	 */
	public static final RepairReasonV2Code DealPrice = new RepairReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealPrice";
			definition = "Unrecognised or invalid deal price.";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReasonV2Code.mmObject();
			codeName = "DDEA";
		}
	};
	/**
	 * Unrecognised or invalid settlement amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code
	 * RepairReasonV2Code}</li>
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
	 * definition} = "Unrecognised or invalid settlement amount."</li>
	 * </ul>
	 */
	public static final RepairReasonV2Code SettlementAmount = new RepairReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmount";
			definition = "Unrecognised or invalid settlement amount.";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReasonV2Code.mmObject();
			codeName = "DMON";
		}
	};
	/**
	 * Unrecognised or invalid settlement quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code
	 * RepairReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DQUA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised or invalid settlement quantity."</li>
	 * </ul>
	 */
	public static final RepairReasonV2Code Quantity = new RepairReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Quantity";
			definition = "Unrecognised or invalid settlement quantity.";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReasonV2Code.mmObject();
			codeName = "DQUA";
		}
	};
	/**
	 * Unrecognised or invalid financial instrument identification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code
	 * RepairReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DSEC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Security"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unrecognised or invalid financial instrument identification."</li>
	 * </ul>
	 */
	public static final RepairReasonV2Code Security = new RepairReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Security";
			definition = "Unrecognised or invalid financial instrument identification.";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReasonV2Code.mmObject();
			codeName = "DSEC";
		}
	};
	/**
	 * Unrecognised or invalid trade date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code
	 * RepairReasonV2Code}</li>
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
	 * definition} = "Unrecognised or invalid trade date."</li>
	 * </ul>
	 */
	public static final RepairReasonV2Code TradeDate = new RepairReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDate";
			definition = "Unrecognised or invalid trade date.";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReasonV2Code.mmObject();
			codeName = "DTRD";
		}
	};
	/**
	 * Unrecognised or invalid forfeit amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code
	 * RepairReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FORF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForfeitAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised or invalid forfeit amount."</li>
	 * </ul>
	 */
	public static final RepairReasonV2Code ForfeitAmount = new RepairReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForfeitAmount";
			definition = "Unrecognised or invalid forfeit amount.";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReasonV2Code.mmObject();
			codeName = "FORF";
		}
	};
	/**
	 * Unrecognised, invalid or missing common reference.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code
	 * RepairReasonV2Code}</li>
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
	 * definition} = "Unrecognised, invalid or missing common reference."</li>
	 * </ul>
	 */
	public static final RepairReasonV2Code CommonReference = new RepairReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommonReference";
			definition = "Unrecognised, invalid or missing common reference.";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReasonV2Code.mmObject();
			codeName = "IIND";
		}
	};
	/**
	 * Unrecognised or invalid letter of guarantee indicator instructed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code
	 * RepairReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LEOG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LetterOfGuaranteeIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unrecognised or invalid letter of guarantee indicator instructed."</li>
	 * </ul>
	 */
	public static final RepairReasonV2Code LetterOfGuaranteeIndicator = new RepairReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LetterOfGuaranteeIndicator";
			definition = "Unrecognised or invalid letter of guarantee indicator instructed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReasonV2Code.mmObject();
			codeName = "LEOG";
		}
	};
	/**
	 * Quantity instructed is lower than the minimum existing settlement
	 * quantity for the financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code
	 * RepairReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MINO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumSettlementQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity instructed is lower than the minimum existing settlement quantity for the financial instrument."
	 * </li>
	 * </ul>
	 */
	public static final RepairReasonV2Code MinimumSettlementQuantity = new RepairReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumSettlementQuantity";
			definition = "Quantity instructed is lower than the minimum existing settlement quantity for the financial instrument.";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReasonV2Code.mmObject();
			codeName = "MINO";
		}
	};
	/**
	 * Quantity instructed is not a multiple of an existing settlement quantity
	 * lot for the financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code
	 * RepairReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MUNO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultipleSettlementQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity instructed is not a multiple of an existing settlement quantity lot for the financial instrument."
	 * </li>
	 * </ul>
	 */
	public static final RepairReasonV2Code MultipleSettlementQuantity = new RepairReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultipleSettlementQuantity";
			definition = "Quantity instructed is not a multiple of an existing settlement quantity lot for the financial instrument.";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReasonV2Code.mmObject();
			codeName = "MUNO";
		}
	};
	/**
	 * Unrecognised or invalid settlement amount currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code
	 * RepairReasonV2Code}</li>
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
	 * definition} = "Unrecognised or invalid settlement amount currency."</li>
	 * </ul>
	 */
	public static final RepairReasonV2Code SettlementAmountCurrency = new RepairReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmountCurrency";
			definition = "Unrecognised or invalid settlement amount currency.";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReasonV2Code.mmObject();
			codeName = "NCRR";
		}
	};
	/**
	 * Physical settlement is impossible for the instructed financial
	 * instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code
	 * RepairReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PHYS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalSettlementImpossible"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Physical settlement is impossible for the instructed financial instrument."
	 * </li>
	 * </ul>
	 */
	public static final RepairReasonV2Code PhysicalSettlementImpossible = new RepairReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalSettlementImpossible";
			definition = "Physical settlement is impossible for the instructed financial instrument.";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReasonV2Code.mmObject();
			codeName = "PHYS";
		}
	};
	/**
	 * Unrecognised or invalid place of trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code
	 * RepairReasonV2Code}</li>
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
	 * definition} = "Unrecognised or invalid place of trade."</li>
	 * </ul>
	 */
	public static final RepairReasonV2Code PlaceOfTrade = new RepairReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfTrade";
			definition = "Unrecognised or invalid place of trade.";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReasonV2Code.mmObject();
			codeName = "PLCE";
		}
	};
	/**
	 * Instruction has a reference identical to another previously received
	 * instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code
	 * RepairReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REFE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction has a reference identical to another previously received instruction."
	 * </li>
	 * </ul>
	 */
	public static final RepairReasonV2Code Reference = new RepairReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reference";
			definition = "Instruction has a reference identical to another previously received instruction.";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReasonV2Code.mmObject();
			codeName = "REFE";
		}
	};
	/**
	 * Unrecognised or invalid termination transaction amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code
	 * RepairReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REPA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminationTransactionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised or invalid termination transaction amount."</li>
	 * </ul>
	 */
	public static final RepairReasonV2Code TerminationTransactionAmount = new RepairReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminationTransactionAmount";
			definition = "Unrecognised or invalid termination transaction amount.";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReasonV2Code.mmObject();
			codeName = "REPA";
		}
	};
	/**
	 * Unrecognised or invalid repurchase rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code
	 * RepairReasonV2Code}</li>
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
	 * definition} = "Unrecognised or invalid repurchase rate."</li>
	 * </ul>
	 */
	public static final RepairReasonV2Code RepurchaseRate = new RepairReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseRate";
			definition = "Unrecognised or invalid repurchase rate.";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReasonV2Code.mmObject();
			codeName = "REPO";
		}
	};
	/**
	 * Unrecognised or invalid premium amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code
	 * RepairReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REPP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PremiumAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised or invalid premium amount."</li>
	 * </ul>
	 */
	public static final RepairReasonV2Code PremiumAmount = new RepairReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PremiumAmount";
			definition = "Unrecognised or invalid premium amount.";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReasonV2Code.mmObject();
			codeName = "REPP";
		}
	};
	/**
	 * Unrecognised or invalid repurchase rate type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code
	 * RepairReasonV2Code}</li>
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
	 * definition} = "Unrecognised or invalid repurchase rate type."</li>
	 * </ul>
	 */
	public static final RepairReasonV2Code RepurchaseRateType = new RepairReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseRateType";
			definition = "Unrecognised or invalid repurchase rate type.";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReasonV2Code.mmObject();
			codeName = "RERT";
		}
	};
	/**
	 * Unrecognised or invalid spread rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code
	 * RepairReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RSPR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpreadRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised or invalid spread rate."</li>
	 * </ul>
	 */
	public static final RepairReasonV2Code SpreadRate = new RepairReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpreadRate";
			definition = "Unrecognised or invalid spread rate.";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReasonV2Code.mmObject();
			codeName = "RSPR";
		}
	};
	/**
	 * Impossible to use the RTGS system instructed (NRTG or YRTG).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code
	 * RepairReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RTGS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ImpossibleToUseTheRTGSSystemInstructed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Impossible to use the RTGS system instructed (NRTG or YRTG)."</li>
	 * </ul>
	 */
	public static final RepairReasonV2Code ImpossibleToUseTheRTGSSystemInstructed = new RepairReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ImpossibleToUseTheRTGSSystemInstructed";
			definition = "Impossible to use the RTGS system instructed (NRTG or YRTG).";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReasonV2Code.mmObject();
			codeName = "RTGS";
		}
	};
	/**
	 * Unrecognised or invalid message sender's safekeeping account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code
	 * RepairReasonV2Code}</li>
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
	 * "Unrecognised or invalid message sender's safekeeping account."</li>
	 * </ul>
	 */
	public static final RepairReasonV2Code SafekeepingAccount = new RepairReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount";
			definition = "Unrecognised or invalid message sender's safekeeping account.";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReasonV2Code.mmObject();
			codeName = "SAFE";
		}
	};
	/**
	 * Unrecognised or invalid settlement transaction type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code
	 * RepairReasonV2Code}</li>
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
	 * definition} = "Unrecognised or invalid settlement transaction type."</li>
	 * </ul>
	 */
	public static final RepairReasonV2Code SettlementTransaction = new RepairReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementTransaction";
			definition = "Unrecognised or invalid settlement transaction type.";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReasonV2Code.mmObject();
			codeName = "SETR";
		}
	};
	/**
	 * Unrecognised or invalid settlement system/method instructed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code
	 * RepairReasonV2Code}</li>
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
	 * "Unrecognised or invalid settlement system/method instructed."</li>
	 * </ul>
	 */
	public static final RepairReasonV2Code SettlementSystemMethod = new RepairReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementSystemMethod";
			definition = "Unrecognised or invalid settlement system/method instructed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReasonV2Code.mmObject();
			codeName = "SETS";
		}
	};
	/**
	 * Unrecognised or invalid closing date/time.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code
	 * RepairReasonV2Code}</li>
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
	 * definition} = "Unrecognised or invalid closing date/time."</li>
	 * </ul>
	 */
	public static final RepairReasonV2Code ClosingDateTime = new RepairReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingDateTime";
			definition = "Unrecognised or invalid closing date/time.";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReasonV2Code.mmObject();
			codeName = "TERM";
		}
	};
	/**
	 * Unrecognised or invalid tax status of the securities instructed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code
	 * RepairReasonV2Code}</li>
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
	 * "Unrecognised or invalid tax status of the securities instructed."</li>
	 * </ul>
	 */
	public static final RepairReasonV2Code TaxStatus = new RepairReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxStatus";
			definition = "Unrecognised or invalid tax status of the securities instructed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReasonV2Code.mmObject();
			codeName = "TXST";
		}
	};
	/**
	 * Unrecognised or invalid variable rate support (repurchase agreement).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code
	 * RepairReasonV2Code}</li>
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
	 * definition} =
	 * "Unrecognised or invalid variable rate support (repurchase agreement)."</li>
	 * </ul>
	 */
	public static final RepairReasonV2Code VariableRateSupport = new RepairReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariableRateSupport";
			definition = "Unrecognised or invalid variable rate support (repurchase agreement).";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReasonV2Code.mmObject();
			codeName = "VASU";
		}
	};
	/**
	 * Received after the account servicer's deadline. Processed on best effort
	 * basis.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code
	 * RepairReasonV2Code}</li>
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
	public static final RepairReasonV2Code AccountServicerDeadlineMissed = new RepairReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerDeadlineMissed";
			definition = "Received after the account servicer's deadline. Processed on best effort basis.";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReasonV2Code.mmObject();
			codeName = "ADEA";
		}
	};
	/**
	 * Unrecognised or invalid type of order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code
	 * RepairReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BUSE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeOfOrderRepair"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised or invalid type of order."</li>
	 * </ul>
	 */
	public static final RepairReasonV2Code TypeOfOrderRepair = new RepairReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeOfOrderRepair";
			definition = "Unrecognised or invalid type of order.";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReasonV2Code.mmObject();
			codeName = "BUSE";
		}
	};
	/**
	 * Unrecognized or invalid commercialization contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code
	 * RepairReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COMC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommercializationContractRepair"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognized or invalid commercialization contract."</li>
	 * </ul>
	 */
	public static final RepairReasonV2Code CommercializationContractRepair = new RepairReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommercializationContractRepair";
			definition = "Unrecognized or invalid commercialization contract.";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReasonV2Code.mmObject();
			codeName = "COMC";
		}
	};
	/**
	 * Unrecognised or invalid fee or commission.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code
	 * RepairReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FEEE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FeeCommissionRepair"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised or invalid fee or commission."</li>
	 * </ul>
	 */
	public static final RepairReasonV2Code FeeCommissionRepair = new RepairReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FeeCommissionRepair";
			definition = "Unrecognised or invalid fee or commission.";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReasonV2Code.mmObject();
			codeName = "FEEE";
		}
	};
	/**
	 * Unrecognised or invalid service level agreement pre-agreed narrative
	 * information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code
	 * RepairReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INNA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NarrativeInformationRepair"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unrecognised or invalid service level agreement pre-agreed narrative information."
	 * </li>
	 * </ul>
	 */
	public static final RepairReasonV2Code NarrativeInformationRepair = new RepairReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NarrativeInformationRepair";
			definition = "Unrecognised or invalid service level agreement pre-agreed narrative information.";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReasonV2Code.mmObject();
			codeName = "INNA";
		}
	};
	/**
	 * Cancellation request is in repair since more than one instruction match
	 * to the cancellation criteria.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code
	 * RepairReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NRGM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoMatch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cancellation request is in repair since more than one instruction match to the cancellation criteria."
	 * </li>
	 * </ul>
	 */
	public static final RepairReasonV2Code NoMatch = new RepairReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoMatch";
			definition = "Cancellation request is in repair since more than one instruction match to the cancellation criteria.";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReasonV2Code.mmObject();
			codeName = "NRGM";
		}
	};
	/**
	 * Cancellation request is in repair since the instruction could not be
	 * found.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code
	 * RepairReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NRGN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotFound"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cancellation request is in repair since the instruction could not be found."
	 * </li>
	 * </ul>
	 */
	public static final RepairReasonV2Code NotFound = new RepairReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotFound";
			definition = "Cancellation request is in repair since the instruction could not be found.";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReasonV2Code.mmObject();
			codeName = "NRGN";
		}
	};
	/**
	 * Message was not recognised. Unknown linked reference.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code
	 * RepairReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ULNK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unknown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Message was not recognised. Unknown linked reference."</li>
	 * </ul>
	 */
	public static final RepairReasonV2Code Unknown = new RepairReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unknown";
			definition = "Message was not recognised. Unknown linked reference.";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReasonV2Code.mmObject();
			codeName = "ULNK";
		}
	};
	/**
	 * Unrecognised, invalid or missing Place of Safekeeping.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code
	 * RepairReasonV2Code}</li>
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
	 * definition} = "Unrecognised, invalid or missing Place of Safekeeping."</li>
	 * </ul>
	 */
	public static final RepairReasonV2Code PlaceOfSafekeeping = new RepairReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfSafekeeping";
			definition = "Unrecognised, invalid or missing Place of Safekeeping.";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReasonV2Code.mmObject();
			codeName = "INPS";
		}
	};
	/**
	 * Required stamp duty information is missing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code
	 * RepairReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SDUT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StampDuty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Required stamp duty information is missing."</li>
	 * </ul>
	 */
	public static final RepairReasonV2Code StampDuty = new RepairReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StampDuty";
			definition = "Required stamp duty information is missing.";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReasonV2Code.mmObject();
			codeName = "SDUT";
		}
	};
	/**
	 * Other. See Narrative.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code
	 * RepairReasonV2Code}</li>
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
	 * definition} = "Other. See Narrative."</li>
	 * </ul>
	 */
	public static final RepairReasonV2Code Other = new RepairReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Other. See Narrative.";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReasonV2Code.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Depository mismatch.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code
	 * RepairReasonV2Code}</li>
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
	 * definition} = "Depository mismatch."</li>
	 * </ul>
	 */
	public static final RepairReasonV2Code ReceivingDeliveringDepository = new RepairReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDeliveringDepository";
			definition = "Depository mismatch.";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReasonV2Code.mmObject();
			codeName = "DEPT";
		}
	};
	/**
	 * Client of delivering or receiving party 2 mismatch.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code
	 * RepairReasonV2Code}</li>
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
	 * definition} = "Client of delivering or receiving party 2 mismatch."</li>
	 * </ul>
	 */
	public static final RepairReasonV2Code ReceivingDeliveringParty3 = new RepairReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDeliveringParty3";
			definition = "Client of delivering or receiving party 2 mismatch.";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReasonV2Code.mmObject();
			codeName = "IEXE";
		}
	};
	/**
	 * Client of delivering or receiving party 1 mismatch.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code
	 * RepairReasonV2Code}</li>
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
	 * definition} = "Client of delivering or receiving party 1 mismatch."</li>
	 * </ul>
	 */
	public static final RepairReasonV2Code ReceivingDeliveringParty2 = new RepairReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDeliveringParty2";
			definition = "Client of delivering or receiving party 1 mismatch.";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReasonV2Code.mmObject();
			codeName = "ICUS";
		}
	};
	/**
	 * Participant of delivering or receiving depository mismatch.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code
	 * RepairReasonV2Code}</li>
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
	 * "Participant of delivering or receiving depository mismatch."</li>
	 * </ul>
	 */
	public static final RepairReasonV2Code ReceivingDeliveringParty1 = new RepairReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDeliveringParty1";
			definition = "Participant of delivering or receiving depository mismatch.";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReasonV2Code.mmObject();
			codeName = "ICAG";
		}
	};
	final static private LinkedHashMap<String, RepairReasonV2Code> codesByName = new LinkedHashMap<>();

	protected RepairReasonV2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("CTRA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RepairReasonV2Code";
				definition = "Specifies the reason why the instruction is in repair.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RepairReasonV2Code.ClosingTransactionAmount, com.tools20022.repository.codeset.RepairReasonV2Code.NarrativeReason,
						com.tools20022.repository.codeset.RepairReasonV2Code.ProcessingBatch, com.tools20022.repository.codeset.RepairReasonV2Code.TransactionCallDelay, com.tools20022.repository.codeset.RepairReasonV2Code.CorporateAction,
						com.tools20022.repository.codeset.RepairReasonV2Code.CashAccount, com.tools20022.repository.codeset.RepairReasonV2Code.ImpossibleCashSettlementSystem,
						com.tools20022.repository.codeset.RepairReasonV2Code.SettlementDate, com.tools20022.repository.codeset.RepairReasonV2Code.DealPrice, com.tools20022.repository.codeset.RepairReasonV2Code.SettlementAmount,
						com.tools20022.repository.codeset.RepairReasonV2Code.Quantity, com.tools20022.repository.codeset.RepairReasonV2Code.Security, com.tools20022.repository.codeset.RepairReasonV2Code.TradeDate,
						com.tools20022.repository.codeset.RepairReasonV2Code.ForfeitAmount, com.tools20022.repository.codeset.RepairReasonV2Code.CommonReference,
						com.tools20022.repository.codeset.RepairReasonV2Code.LetterOfGuaranteeIndicator, com.tools20022.repository.codeset.RepairReasonV2Code.MinimumSettlementQuantity,
						com.tools20022.repository.codeset.RepairReasonV2Code.MultipleSettlementQuantity, com.tools20022.repository.codeset.RepairReasonV2Code.SettlementAmountCurrency,
						com.tools20022.repository.codeset.RepairReasonV2Code.PhysicalSettlementImpossible, com.tools20022.repository.codeset.RepairReasonV2Code.PlaceOfTrade, com.tools20022.repository.codeset.RepairReasonV2Code.Reference,
						com.tools20022.repository.codeset.RepairReasonV2Code.TerminationTransactionAmount, com.tools20022.repository.codeset.RepairReasonV2Code.RepurchaseRate,
						com.tools20022.repository.codeset.RepairReasonV2Code.PremiumAmount, com.tools20022.repository.codeset.RepairReasonV2Code.RepurchaseRateType, com.tools20022.repository.codeset.RepairReasonV2Code.SpreadRate,
						com.tools20022.repository.codeset.RepairReasonV2Code.ImpossibleToUseTheRTGSSystemInstructed, com.tools20022.repository.codeset.RepairReasonV2Code.SafekeepingAccount,
						com.tools20022.repository.codeset.RepairReasonV2Code.SettlementTransaction, com.tools20022.repository.codeset.RepairReasonV2Code.SettlementSystemMethod,
						com.tools20022.repository.codeset.RepairReasonV2Code.ClosingDateTime, com.tools20022.repository.codeset.RepairReasonV2Code.TaxStatus, com.tools20022.repository.codeset.RepairReasonV2Code.VariableRateSupport,
						com.tools20022.repository.codeset.RepairReasonV2Code.AccountServicerDeadlineMissed, com.tools20022.repository.codeset.RepairReasonV2Code.TypeOfOrderRepair,
						com.tools20022.repository.codeset.RepairReasonV2Code.CommercializationContractRepair, com.tools20022.repository.codeset.RepairReasonV2Code.FeeCommissionRepair,
						com.tools20022.repository.codeset.RepairReasonV2Code.NarrativeInformationRepair, com.tools20022.repository.codeset.RepairReasonV2Code.NoMatch, com.tools20022.repository.codeset.RepairReasonV2Code.NotFound,
						com.tools20022.repository.codeset.RepairReasonV2Code.Unknown, com.tools20022.repository.codeset.RepairReasonV2Code.PlaceOfSafekeeping, com.tools20022.repository.codeset.RepairReasonV2Code.StampDuty,
						com.tools20022.repository.codeset.RepairReasonV2Code.Other, com.tools20022.repository.codeset.RepairReasonV2Code.ReceivingDeliveringDepository,
						com.tools20022.repository.codeset.RepairReasonV2Code.ReceivingDeliveringParty3, com.tools20022.repository.codeset.RepairReasonV2Code.ReceivingDeliveringParty2,
						com.tools20022.repository.codeset.RepairReasonV2Code.ReceivingDeliveringParty1);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ClosingTransactionAmount.getCodeName().get(), ClosingTransactionAmount);
		codesByName.put(NarrativeReason.getCodeName().get(), NarrativeReason);
		codesByName.put(ProcessingBatch.getCodeName().get(), ProcessingBatch);
		codesByName.put(TransactionCallDelay.getCodeName().get(), TransactionCallDelay);
		codesByName.put(CorporateAction.getCodeName().get(), CorporateAction);
		codesByName.put(CashAccount.getCodeName().get(), CashAccount);
		codesByName.put(ImpossibleCashSettlementSystem.getCodeName().get(), ImpossibleCashSettlementSystem);
		codesByName.put(SettlementDate.getCodeName().get(), SettlementDate);
		codesByName.put(DealPrice.getCodeName().get(), DealPrice);
		codesByName.put(SettlementAmount.getCodeName().get(), SettlementAmount);
		codesByName.put(Quantity.getCodeName().get(), Quantity);
		codesByName.put(Security.getCodeName().get(), Security);
		codesByName.put(TradeDate.getCodeName().get(), TradeDate);
		codesByName.put(ForfeitAmount.getCodeName().get(), ForfeitAmount);
		codesByName.put(CommonReference.getCodeName().get(), CommonReference);
		codesByName.put(LetterOfGuaranteeIndicator.getCodeName().get(), LetterOfGuaranteeIndicator);
		codesByName.put(MinimumSettlementQuantity.getCodeName().get(), MinimumSettlementQuantity);
		codesByName.put(MultipleSettlementQuantity.getCodeName().get(), MultipleSettlementQuantity);
		codesByName.put(SettlementAmountCurrency.getCodeName().get(), SettlementAmountCurrency);
		codesByName.put(PhysicalSettlementImpossible.getCodeName().get(), PhysicalSettlementImpossible);
		codesByName.put(PlaceOfTrade.getCodeName().get(), PlaceOfTrade);
		codesByName.put(Reference.getCodeName().get(), Reference);
		codesByName.put(TerminationTransactionAmount.getCodeName().get(), TerminationTransactionAmount);
		codesByName.put(RepurchaseRate.getCodeName().get(), RepurchaseRate);
		codesByName.put(PremiumAmount.getCodeName().get(), PremiumAmount);
		codesByName.put(RepurchaseRateType.getCodeName().get(), RepurchaseRateType);
		codesByName.put(SpreadRate.getCodeName().get(), SpreadRate);
		codesByName.put(ImpossibleToUseTheRTGSSystemInstructed.getCodeName().get(), ImpossibleToUseTheRTGSSystemInstructed);
		codesByName.put(SafekeepingAccount.getCodeName().get(), SafekeepingAccount);
		codesByName.put(SettlementTransaction.getCodeName().get(), SettlementTransaction);
		codesByName.put(SettlementSystemMethod.getCodeName().get(), SettlementSystemMethod);
		codesByName.put(ClosingDateTime.getCodeName().get(), ClosingDateTime);
		codesByName.put(TaxStatus.getCodeName().get(), TaxStatus);
		codesByName.put(VariableRateSupport.getCodeName().get(), VariableRateSupport);
		codesByName.put(AccountServicerDeadlineMissed.getCodeName().get(), AccountServicerDeadlineMissed);
		codesByName.put(TypeOfOrderRepair.getCodeName().get(), TypeOfOrderRepair);
		codesByName.put(CommercializationContractRepair.getCodeName().get(), CommercializationContractRepair);
		codesByName.put(FeeCommissionRepair.getCodeName().get(), FeeCommissionRepair);
		codesByName.put(NarrativeInformationRepair.getCodeName().get(), NarrativeInformationRepair);
		codesByName.put(NoMatch.getCodeName().get(), NoMatch);
		codesByName.put(NotFound.getCodeName().get(), NotFound);
		codesByName.put(Unknown.getCodeName().get(), Unknown);
		codesByName.put(PlaceOfSafekeeping.getCodeName().get(), PlaceOfSafekeeping);
		codesByName.put(StampDuty.getCodeName().get(), StampDuty);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(ReceivingDeliveringDepository.getCodeName().get(), ReceivingDeliveringDepository);
		codesByName.put(ReceivingDeliveringParty3.getCodeName().get(), ReceivingDeliveringParty3);
		codesByName.put(ReceivingDeliveringParty2.getCodeName().get(), ReceivingDeliveringParty2);
		codesByName.put(ReceivingDeliveringParty1.getCodeName().get(), ReceivingDeliveringParty1);
	}

	public static RepairReasonV2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RepairReasonV2Code[] values() {
		RepairReasonV2Code[] values = new RepairReasonV2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RepairReasonV2Code> {
		@Override
		public RepairReasonV2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RepairReasonV2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}