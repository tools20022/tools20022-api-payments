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
 * Specifies the reason the transaction/instruction is pending settlement, ie,
 * pending delivery or receipt of the financial instrument. Settlement on the
 * instructed settlement date is still possible.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#AwaitingMoney
 * PendingSettlementStatusReasonCode.AwaitingMoney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#AwaitingSecurities
 * PendingSettlementStatusReasonCode.AwaitingSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#InstructionRefusedOrNotRecognised
 * PendingSettlementStatusReasonCode.InstructionRefusedOrNotRecognised}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#AwaitingSharesFromCounterparty
 * PendingSettlementStatusReasonCode.AwaitingSharesFromCounterparty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#PhysicalDeliveryDelay
 * PendingSettlementStatusReasonCode.PhysicalDeliveryDelay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#TradeAmendedInMarket
 * PendingSettlementStatusReasonCode.TradeAmendedInMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#AwaitingDocumentsOrEndorsementsFromYou
 * PendingSettlementStatusReasonCode.AwaitingDocumentsOrEndorsementsFromYou}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#AwaitingDocumentsOrEndorsementsFromCounterparty
 * PendingSettlementStatusReasonCode.
 * AwaitingDocumentsOrEndorsementsFromCounterparty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#AccountBlocked
 * PendingSettlementStatusReasonCode.AccountBlocked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#EnquirySent
 * PendingSettlementStatusReasonCode.EnquirySent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#NewIssues
 * PendingSettlementStatusReasonCode.NewIssues}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#CounterpartyInsufficientSecurities
 * PendingSettlementStatusReasonCode.CounterpartyInsufficientSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#MultipleSettlementAmount
 * PendingSettlementStatusReasonCode.MultipleSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#GlobalFormSecurities
 * PendingSettlementStatusReasonCode.GlobalFormSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#PreadviceInstructed
 * PendingSettlementStatusReasonCode.PreadviceInstructed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#GuaranteedDeliveryIndicatorDifference
 * PendingSettlementStatusReasonCode.GuaranteedDeliveryIndicatorDifference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#TradeSettlesInPartials
 * PendingSettlementStatusReasonCode.TradeSettlesInPartials}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#NoMatchingRequired
 * PendingSettlementStatusReasonCode.NoMatchingRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#CounterpartyInsufficientMoney
 * PendingSettlementStatusReasonCode.CounterpartyInsufficientMoney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#CollateralShortage
 * PendingSettlementStatusReasonCode.CollateralShortage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#SecuritiesPledgedAsCollateral
 * PendingSettlementStatusReasonCode.SecuritiesPledgedAsCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#RefusedDepositForIssueOfDepositaryReceipts
 * PendingSettlementStatusReasonCode.RefusedDepositForIssueOfDepositaryReceipts}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#MaximumForeignLimitReached
 * PendingSettlementStatusReasonCode.MaximumForeignLimitReached}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#NoForeignExchangeInstruction
 * PendingSettlementStatusReasonCode.NoForeignExchangeInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#IncomeAdjustementRequired
 * PendingSettlementStatusReasonCode.IncomeAdjustementRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#PendingLinkedInstruction
 * PendingSettlementStatusReasonCode.PendingLinkedInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#AwaitingSettlementDate
 * PendingSettlementStatusReasonCode.AwaitingSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#LackOfSecurities
 * PendingSettlementStatusReasonCode.LackOfSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#SecuritiesLoanedOut
 * PendingSettlementStatusReasonCode.SecuritiesLoanedOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#InsufficientMoney
 * PendingSettlementStatusReasonCode.InsufficientMoney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#ConfirmationNotReceived
 * PendingSettlementStatusReasonCode.ConfirmationNotReceived}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#NotInGoodOrder
 * PendingSettlementStatusReasonCode.NotInGoodOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#LackOfStampDutyInformation
 * PendingSettlementStatusReasonCode.LackOfStampDutyInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#ProcessingBatchDifference
 * PendingSettlementStatusReasonCode.ProcessingBatchDifference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#AwaitingNextSettlementCycle
 * PendingSettlementStatusReasonCode.AwaitingNextSettlementCycle}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#SecuritiesBlocked
 * PendingSettlementStatusReasonCode.SecuritiesBlocked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#CounterpartyInReceivership
 * PendingSettlementStatusReasonCode.CounterpartyInReceivership}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#MinimumSettlementAmount
 * PendingSettlementStatusReasonCode.MinimumSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#PendingCAP
 * PendingSettlementStatusReasonCode.PendingCAP}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#StatusReasonInvestigation
 * PendingSettlementStatusReasonCode.StatusReasonInvestigation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#Other
 * PendingSettlementStatusReasonCode.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#PhysicalSecuritiesVerification
 * PendingSettlementStatusReasonCode.PhysicalSecuritiesVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#MissingInformation
 * PendingSettlementStatusReasonCode.MissingInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#AccountNotOpen
 * PendingSettlementStatusReasonCode.AccountNotOpen}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#UnderInvestigation
 * PendingSettlementStatusReasonCode.UnderInvestigation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#UnderClientInvestigation
 * PendingSettlementStatusReasonCode.UnderClientInvestigation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#UnderTransferAgentInvestigation
 * PendingSettlementStatusReasonCode.UnderTransferAgentInvestigation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#AwaitingTransferAgentStatus
 * PendingSettlementStatusReasonCode.AwaitingTransferAgentStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#UsualTransactionTime
 * PendingSettlementStatusReasonCode.UsualTransactionTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#AwaitingStatus
 * PendingSettlementStatusReasonCode.AwaitingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#ApplicationFormSent
 * PendingSettlementStatusReasonCode.ApplicationFormSent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#StockTransferFormSent
 * PendingSettlementStatusReasonCode.StockTransferFormSent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#LongerProcessing
 * PendingSettlementStatusReasonCode.LongerProcessing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#AdditionalDocumentsRequested
 * PendingSettlementStatusReasonCode.AdditionalDocumentsRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#AdditionalDocumentsSent1
 * PendingSettlementStatusReasonCode.AdditionalDocumentsSent1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#AdditionalDocumentsSent2
 * PendingSettlementStatusReasonCode.AdditionalDocumentsSent2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#DocumentsRejected
 * PendingSettlementStatusReasonCode.DocumentsRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#AwaitingCounterpartyReceipt
 * PendingSettlementStatusReasonCode.AwaitingCounterpartyReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#AwaitingCounterpartyDelivery
 * PendingSettlementStatusReasonCode.AwaitingCounterpartyDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#NormalProcessingPeriodLapsed
 * PendingSettlementStatusReasonCode.NormalProcessingPeriodLapsed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#WrongCounterpartyAccount
 * PendingSettlementStatusReasonCode.WrongCounterpartyAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#TransferAgentProcessing
 * PendingSettlementStatusReasonCode.TransferAgentProcessing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#ExpectedConfirmation
 * PendingSettlementStatusReasonCode.ExpectedConfirmation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#Escalation
 * PendingSettlementStatusReasonCode.Escalation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#TransferAgentNonReceipt
 * PendingSettlementStatusReasonCode.TransferAgentNonReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#FinalVerification
 * PendingSettlementStatusReasonCode.FinalVerification}</li>
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
 * "PendingSettlementStatusReasonCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason the transaction/instruction is pending settlement, ie, pending delivery or receipt of the financial instrument. Settlement on the instructed settlement date is still possible."
 * </li>
 * </ul>
 */
public class PendingSettlementStatusReasonCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Securities have been delivered, but the settlement amount has not been
	 * received from the counterparty.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode
	 * PendingSettlementStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AWMO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingMoney"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities have been delivered, but the settlement amount has not been received from the counterparty."
	 * </li>
	 * </ul>
	 */
	public static final MMCode AwaitingMoney = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AwaitingMoney";
			definition = "Securities have been delivered, but the settlement amount has not been received from the counterparty.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "AWMO";
		}
	};
	/**
	 * Awaiting securities from corporate action issue or other procedures, eg,
	 * conversion, dematerialisation, exchange, registration, stamping,
	 * splitting, etc.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode
	 * PendingSettlementStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CAIS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Awaiting securities from corporate action issue or other procedures, eg, conversion, dematerialisation, exchange, registration, stamping, splitting, etc."
	 * </li>
	 * </ul>
	 */
	public static final MMCode AwaitingSecurities = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AwaitingSecurities";
			definition = "Awaiting securities from corporate action issue or other procedures, eg, conversion, dematerialisation, exchange, registration, stamping, splitting, etc.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "CAIS";
		}
	};
	/**
	 * Instruction that has been refused or not recognised, and is represented
	 * automatically.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode
	 * PendingSettlementStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REFU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionRefusedOrNotRecognised"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction that has been refused or not recognised, and is represented automatically."
	 * </li>
	 * </ul>
	 */
	public static final MMCode InstructionRefusedOrNotRecognised = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InstructionRefusedOrNotRecognised";
			definition = "Instruction that has been refused or not recognised, and is represented automatically.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "REFU";
		}
	};
	/**
	 * Securities have not yet been received from the counterparty.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode
	 * PendingSettlementStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AWSH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingSharesFromCounterparty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities have not yet been received from the counterparty."</li>
	 * </ul>
	 */
	public static final MMCode AwaitingSharesFromCounterparty = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AwaitingSharesFromCounterparty";
			definition = "Securities have not yet been received from the counterparty.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "AWSH";
		}
	};
	/**
	 * Settlement is physical and securities are being delivered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode
	 * PendingSettlementStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PHSE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalDeliveryDelay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement is physical and securities are being delivered."</li>
	 * </ul>
	 */
	public static final MMCode PhysicalDeliveryDelay = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PhysicalDeliveryDelay";
			definition = "Settlement is physical and securities are being delivered.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "PHSE";
		}
	};
	/**
	 * Trade is being amended in the market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode
	 * PendingSettlementStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TAMM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeAmendedInMarket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade is being amended in the market."</li>
	 * </ul>
	 */
	public static final MMCode TradeAmendedInMarket = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradeAmendedInMarket";
			definition = "Trade is being amended in the market.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "TAMM";
		}
	};
	/**
	 * Awaiting documents or endorsements from you.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode
	 * PendingSettlementStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DOCY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingDocumentsOrEndorsementsFromYou"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Awaiting documents or endorsements from you."</li>
	 * </ul>
	 */
	public static final MMCode AwaitingDocumentsOrEndorsementsFromYou = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AwaitingDocumentsOrEndorsementsFromYou";
			definition = "Awaiting documents or endorsements from you.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "DOCY";
		}
	};
	/**
	 * Awaiting documents or endorsements from the counterparty.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode
	 * PendingSettlementStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DOCC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingDocumentsOrEndorsementsFromCounterparty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Awaiting documents or endorsements from the counterparty."
	 * </li>
	 * </ul>
	 */
	public static final MMCode AwaitingDocumentsOrEndorsementsFromCounterparty = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AwaitingDocumentsOrEndorsementsFromCounterparty";
			definition = "Awaiting documents or endorsements from the counterparty.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "DOCC";
		}
	};
	/**
	 * Your account is blocked, no instruction can settle over the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode
	 * PendingSettlementStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BLOC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountBlocked"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Your account is blocked, no instruction can settle over the account."</li>
	 * </ul>
	 */
	public static final MMCode AccountBlocked = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccountBlocked";
			definition = "Your account is blocked, no instruction can settle over the account.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "BLOC";
		}
	};
	/**
	 * Chaser/enquiry sent to the agent or depository.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode
	 * PendingSettlementStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CHAS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EnquirySent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Chaser/enquiry sent to the agent or depository."</li>
	 * </ul>
	 */
	public static final MMCode EnquirySent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EnquirySent";
			definition = "Chaser/enquiry sent to the agent or depository.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "CHAS";
		}
	};
	/**
	 * Securities are new issues and are not yet available/tradable.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode
	 * PendingSettlementStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NEWI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewIssues"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities are new issues and are not yet available/tradable."</li>
	 * </ul>
	 */
	public static final MMCode NewIssues = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NewIssues";
			definition = "Securities are new issues and are not yet available/tradable.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "NEWI";
		}
	};
	/**
	 * Insufficient deliverable securities in the counterparty's account, or
	 * counterparty does not hold the securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode
	 * PendingSettlementStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyInsufficientSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Insufficient deliverable securities in the counterparty's account, or counterparty does not hold the securities."
	 * </li>
	 * </ul>
	 */
	public static final MMCode CounterpartyInsufficientSecurities = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CounterpartyInsufficientSecurities";
			definition = "Insufficient deliverable securities in the counterparty's account, or counterparty does not hold the securities.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "CLAC";
		}
	};
	/**
	 * Securities quantity is not a multiple of an existing settlement amount
	 * lot for the instructed financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode
	 * PendingSettlementStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MUNO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultipleSettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities quantity is not a multiple of an existing settlement amount lot for the instructed financial instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMCode MultipleSettlementAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MultipleSettlementAmount";
			definition = "Securities quantity is not a multiple of an existing settlement amount lot for the instructed financial instrument.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "MUNO";
		}
	};
	/**
	 * Settlement cannot be executed as securities are in global form.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode
	 * PendingSettlementStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GLOB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GlobalFormSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement cannot be executed as securities are in global form."</li>
	 * </ul>
	 */
	public static final MMCode GlobalFormSecurities = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GlobalFormSecurities";
			definition = "Settlement cannot be executed as securities are in global form.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "GLOB";
		}
	};
	/**
	 * Your instruction is a preadvice, ie, matching only.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode
	 * PendingSettlementStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PREA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreadviceInstructed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Your instruction is a preadvice, ie, matching only."</li>
	 * </ul>
	 */
	public static final MMCode PreadviceInstructed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PreadviceInstructed";
			definition = "Your instruction is a preadvice, ie, matching only.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "PREA";
		}
	};
	/**
	 * Guaranteed delivery indicator differs in the counterparty's instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode
	 * PendingSettlementStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GUAD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GuaranteedDeliveryIndicatorDifference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Guaranteed delivery indicator differs in the counterparty's instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMCode GuaranteedDeliveryIndicatorDifference = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GuaranteedDeliveryIndicatorDifference";
			definition = "Guaranteed delivery indicator differs in the counterparty's instruction.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "GUAD";
		}
	};
	/**
	 * Trade will settle in partials.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode
	 * PendingSettlementStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PART"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeSettlesInPartials"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade will settle in partials."</li>
	 * </ul>
	 */
	public static final MMCode TradeSettlesInPartials = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradeSettlesInPartials";
			definition = "Trade will settle in partials.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "PART";
		}
	};
	/**
	 * Instruction has not been matched because the matching process is not
	 * required.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode
	 * PendingSettlementStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NMAS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoMatchingRequired"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction has not been matched because the matching process is not required."
	 * </li>
	 * </ul>
	 */
	public static final MMCode NoMatchingRequired = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NoMatchingRequired";
			definition = "Instruction has not been matched because the matching process is not required.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "NMAS";
		}
	};
	/**
	 * Insufficient money in the counterparty's account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode
	 * PendingSettlementStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CMON"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyInsufficientMoney"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Insufficient money in the counterparty's account."</li>
	 * </ul>
	 */
	public static final MMCode CounterpartyInsufficientMoney = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CounterpartyInsufficientMoney";
			definition = "Insufficient money in the counterparty's account.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "CMON";
		}
	};
	/**
	 * Not enough collateral in your account to execute the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode
	 * PendingSettlementStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "YCOL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralShortage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Not enough collateral in your account to execute the transaction."</li>
	 * </ul>
	 */
	public static final MMCode CollateralShortage = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CollateralShortage";
			definition = "Not enough collateral in your account to execute the transaction.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "YCOL";
		}
	};
	/**
	 * Securities are not deliverable as they are pledged as collateral.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode
	 * PendingSettlementStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COLL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesPledgedAsCollateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities are not deliverable as they are pledged as collateral."</li>
	 * </ul>
	 */
	public static final MMCode SecuritiesPledgedAsCollateral = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesPledgedAsCollateral";
			definition = "Securities are not deliverable as they are pledged as collateral.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "COLL";
		}
	};
	/**
	 * Deposit of shares for the issuing of depositary receipts has been
	 * refused. The allotment for depositary receipts granted by the issuer is
	 * exceeded by the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode
	 * PendingSettlementStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DEPO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RefusedDepositForIssueOfDepositaryReceipts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Deposit of shares for the issuing of depositary receipts has been refused. The allotment for depositary receipts granted by the issuer is exceeded by the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMCode RefusedDepositForIssueOfDepositaryReceipts = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RefusedDepositForIssueOfDepositaryReceipts";
			definition = "Deposit of shares for the issuing of depositary receipts has been refused. The allotment for depositary receipts granted by the issuer is exceeded by the transaction.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "DEPO";
		}
	};
	/**
	 * Insufficient deliverable securities in your account because the maximum
	 * foreign limit has been reached.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode
	 * PendingSettlementStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FLIM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumForeignLimitReached"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Insufficient deliverable securities in your account because the maximum foreign limit has been reached."
	 * </li>
	 * </ul>
	 */
	public static final MMCode MaximumForeignLimitReached = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumForeignLimitReached";
			definition = "Insufficient deliverable securities in your account because the maximum foreign limit has been reached.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "FLIM";
		}
	};
	/**
	 * Foreign exchange instruction is missing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode
	 * PendingSettlementStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOFX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoForeignExchangeInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Foreign exchange instruction is missing."</li>
	 * </ul>
	 */
	public static final MMCode NoForeignExchangeInstruction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NoForeignExchangeInstruction";
			definition = "Foreign exchange instruction is missing.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "NOFX";
		}
	};
	/**
	 * Securities require income adjustment, eg, dividend or interest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode
	 * PendingSettlementStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INCA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomeAdjustementRequired"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities require income adjustment, eg, dividend or interest."</li>
	 * </ul>
	 */
	public static final MMCode IncomeAdjustementRequired = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IncomeAdjustementRequired";
			definition = "Securities require income adjustment, eg, dividend or interest.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "INCA";
		}
	};
	/**
	 * Your instruction is pending settlement because the instruction linked to
	 * it is pending.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode
	 * PendingSettlementStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LINK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingLinkedInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Your instruction is pending settlement because the instruction linked to it is pending."
	 * </li>
	 * </ul>
	 */
	public static final MMCode PendingLinkedInstruction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PendingLinkedInstruction";
			definition = "Your instruction is pending settlement because the instruction linked to it is pending.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "LINK";
		}
	};
	/**
	 * Instruction is awaiting the settlement date, and no settlement problems
	 * have been reported.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode
	 * PendingSettlementStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FUTU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction is awaiting the settlement date, and no settlement problems have been reported."
	 * </li>
	 * </ul>
	 */
	public static final MMCode AwaitingSettlementDate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AwaitingSettlementDate";
			definition = "Instruction is awaiting the settlement date, and no settlement problems have been reported.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "FUTU";
		}
	};
	/**
	 * Insufficient deliverable securities in your account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode
	 * PendingSettlementStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LACK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LackOfSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Insufficient deliverable securities in your account."</li>
	 * </ul>
	 */
	public static final MMCode LackOfSecurities = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LackOfSecurities";
			definition = "Insufficient deliverable securities in your account.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "LACK";
		}
	};
	/**
	 * Insufficient deliverable securities in your account because securities
	 * are loaned out.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode
	 * PendingSettlementStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LALO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesLoanedOut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Insufficient deliverable securities in your account because securities are loaned out."
	 * </li>
	 * </ul>
	 */
	public static final MMCode SecuritiesLoanedOut = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesLoanedOut";
			definition = "Insufficient deliverable securities in your account because securities are loaned out.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "LALO";
		}
	};
	/**
	 * Insufficient money in your account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode
	 * PendingSettlementStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MONY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientMoney"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Insufficient money in your account."</li>
	 * </ul>
	 */
	public static final MMCode InsufficientMoney = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InsufficientMoney";
			definition = "Insufficient money in your account.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "MONY";
		}
	};
	/**
	 * Settlement confirmation has not been received.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode
	 * PendingSettlementStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NCON"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmationNotReceived"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement confirmation has not been received."</li>
	 * </ul>
	 */
	public static final MMCode ConfirmationNotReceived = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConfirmationNotReceived";
			definition = "Settlement confirmation has not been received.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "NCON";
		}
	};
	/**
	 * Delivery/receipt has been refused because the physical securities are not
	 * in good order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode
	 * PendingSettlementStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REFS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotInGoodOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Delivery/receipt has been refused because the physical securities are not in good order."
	 * </li>
	 * </ul>
	 */
	public static final MMCode NotInGoodOrder = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NotInGoodOrder";
			definition = "Delivery/receipt has been refused because the physical securities are not in good order.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "REFS";
		}
	};
	/**
	 * Instruction is pending as stamp duty information is missing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode
	 * PendingSettlementStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SDUT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LackOfStampDutyInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction is pending as stamp duty information is missing."</li>
	 * </ul>
	 */
	public static final MMCode LackOfStampDutyInformation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LackOfStampDutyInformation";
			definition = "Instruction is pending as stamp duty information is missing.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "SDUT";
		}
	};
	/**
	 * Processing batch differs in the counterparty's instruction, eg, day
	 * time/real time versus overnight.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode
	 * PendingSettlementStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BATC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingBatchDifference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Processing batch differs in the counterparty's instruction, eg, day time/real time versus overnight."
	 * </li>
	 * </ul>
	 */
	public static final MMCode ProcessingBatchDifference = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProcessingBatchDifference";
			definition = "Processing batch differs in the counterparty's instruction, eg, day time/real time versus overnight.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "BATC";
		}
	};
	/**
	 * Instruction is confirmed in the local market or is ready for settlement,
	 * awaiting the next settlement cycle.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode
	 * PendingSettlementStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CYCL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingNextSettlementCycle"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction is confirmed in the local market or is ready for settlement, awaiting the next settlement cycle."
	 * </li>
	 * </ul>
	 */
	public static final MMCode AwaitingNextSettlementCycle = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AwaitingNextSettlementCycle";
			definition = "Instruction is confirmed in the local market or is ready for settlement, awaiting the next settlement cycle.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "CYCL";
		}
	};
	/**
	 * Settlement is pending. The securities are blocked due to, for example, a
	 * corporate action event, re-alignment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode
	 * PendingSettlementStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SBLO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesBlocked"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement is pending. The securities are blocked due to, for example, a corporate action event, re-alignment."
	 * </li>
	 * </ul>
	 */
	public static final MMCode SecuritiesBlocked = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesBlocked";
			definition = "Settlement is pending. The securities are blocked due to, for example, a corporate action event, re-alignment.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "SBLO";
		}
	};
	/**
	 * Counterparty is in receivership, ie, the form of bankruptcy where a court
	 * appointed person, the receiver, manages the affairs of the business.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode
	 * PendingSettlementStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CPEC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyInReceivership"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Counterparty is in receivership, ie, the form of bankruptcy where a court appointed person, the receiver, manages the affairs of the business."
	 * </li>
	 * </ul>
	 */
	public static final MMCode CounterpartyInReceivership = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CounterpartyInReceivership";
			definition = "Counterparty is in receivership, ie, the form of bankruptcy where a court appointed person, the receiver, manages the affairs of the business.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "CPEC";
		}
	};
	/**
	 * Securities amount is lower than the minimum existing settlement amount
	 * for the instructed financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode
	 * PendingSettlementStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MINO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumSettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities amount is lower than the minimum existing settlement amount for the instructed financial instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMCode MinimumSettlementAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumSettlementAmount";
			definition = "Securities amount is lower than the minimum existing settlement amount for the instructed financial instrument.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "MINO";
		}
	};
	/**
	 * Payment is pending, and does not settle because the actual use of the
	 * risk management limit on the counterpart (bilateral limit) prevents
	 * settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode
	 * PendingSettlementStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PCAP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingCAP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment is pending, and does not settle because the actual use of the risk management limit on the counterpart (bilateral limit) prevents settlement."
	 * </li>
	 * </ul>
	 */
	public static final MMCode PendingCAP = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PendingCAP";
			definition = "Payment is pending, and does not settle because the actual use of the risk management limit on the counterpart (bilateral limit) prevents settlement.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "PCAP";
		}
	};
	/**
	 * Pending reason is being investigated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode
	 * PendingSettlementStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IAAD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusReasonInvestigation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Pending reason is being investigated."</li>
	 * </ul>
	 */
	public static final MMCode StatusReasonInvestigation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StatusReasonInvestigation";
			definition = "Pending reason is being investigated.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "IAAD";
		}
	};
	/**
	 * Another settlement pending reason.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode
	 * PendingSettlementStatusReasonCode}</li>
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
	 * definition} = "Another settlement pending reason."</li>
	 * </ul>
	 */
	public static final MMCode Other = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Other";
			definition = "Another settlement pending reason.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Physical shares have been received and are being checked for
	 * authenticity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode
	 * PendingSettlementStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PHCK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalSecuritiesVerification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Physical shares have been received and are being checked for authenticity."
	 * </li>
	 * </ul>
	 */
	public static final MMCode PhysicalSecuritiesVerification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PhysicalSecuritiesVerification";
			definition = "Physical shares have been received and are being checked for authenticity.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "PHCK";
		}
	};
	/**
	 * Information, for example, telephone number, contact person, is missing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode
	 * PendingSettlementStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MINF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information, for example, telephone number, contact person, is missing."
	 * </li>
	 * </ul>
	 */
	public static final MMCode MissingInformation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MissingInformation";
			definition = "Information, for example, telephone number, contact person, is missing.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "MINF";
		}
	};
	/**
	 * Account must already be opened in order to process the transfer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode
	 * PendingSettlementStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACOP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountNotOpen"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account must already be opened in order to process the transfer."</li>
	 * </ul>
	 */
	public static final MMCode AccountNotOpen = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountNotOpen";
			definition = "Account must already be opened in order to process the transfer.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "ACOP";
		}
	};
	/**
	 * Intermediary is investigating the reason why the transfer is pending.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode
	 * PendingSettlementStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IINV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderInvestigation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Intermediary is investigating the reason why the transfer is pending."</li>
	 * </ul>
	 */
	public static final MMCode UnderInvestigation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderInvestigation";
			definition = "Intermediary is investigating the reason why the transfer is pending.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "IINV";
		}
	};
	/**
	 * Client has been informed of a problem and is investigating.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode
	 * PendingSettlementStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CINV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderClientInvestigation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Client has been informed of a problem and is investigating."</li>
	 * </ul>
	 */
	public static final MMCode UnderClientInvestigation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderClientInvestigation";
			definition = "Client has been informed of a problem and is investigating.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "CINV";
		}
	};
	/**
	 * Transfer agent is investigating.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode
	 * PendingSettlementStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AINV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderTransferAgentInvestigation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transfer agent is investigating."</li>
	 * </ul>
	 */
	public static final MMCode UnderTransferAgentInvestigation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderTransferAgentInvestigation";
			definition = "Transfer agent is investigating.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "AINV";
		}
	};
	/**
	 * Transfer is being processed by the transfer agent, awaiting status from
	 * transfer agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode
	 * PendingSettlementStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WTRF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingTransferAgentStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transfer is being processed by the transfer agent, awaiting status from transfer agent."
	 * </li>
	 * </ul>
	 */
	public static final MMCode AwaitingTransferAgentStatus = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingTransferAgentStatus";
			definition = "Transfer is being processed by the transfer agent, awaiting status from transfer agent.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "WTRF";
		}
	};
	/**
	 * Usual transfer agent's processing timeframe.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode
	 * PendingSettlementStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "USUA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UsualTransactionTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Usual transfer agent's processing timeframe."</li>
	 * </ul>
	 */
	public static final MMCode UsualTransactionTime = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UsualTransactionTime";
			definition = "Usual transfer agent's processing timeframe.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "USUA";
		}
	};
	/**
	 * At your request, the Intermediary is checking the status of your
	 * instruction with the transfer agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode
	 * PendingSettlementStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ASTA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "At your request, the Intermediary is checking the status of your instruction with the transfer agent."
	 * </li>
	 * </ul>
	 */
	public static final MMCode AwaitingStatus = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingStatus";
			definition = "At your request, the Intermediary is checking the status of your instruction with the transfer agent.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "ASTA";
		}
	};
	/**
	 * Application form has been sent to the transfer agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode
	 * PendingSettlementStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AFST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicationFormSent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Application form has been sent to the transfer agent."</li>
	 * </ul>
	 */
	public static final MMCode ApplicationFormSent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApplicationFormSent";
			definition = "Application form has been sent to the transfer agent.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "AFST";
		}
	};
	/**
	 * Stock transfer form has been sent to the counterparty to sign and forward
	 * to the transfer agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode
	 * PendingSettlementStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockTransferFormSent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Stock transfer form has been sent to the counterparty to sign and forward to the transfer agent."
	 * </li>
	 * </ul>
	 */
	public static final MMCode StockTransferFormSent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockTransferFormSent";
			definition = "Stock transfer form has been sent to the counterparty to sign and forward to the transfer agent.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "STST";
		}
	};
	/**
	 * Longer processing timeframe for this type of transfer, due to
	 * documentation requirements.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode
	 * PendingSettlementStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LPRO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LongerProcessing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Longer processing timeframe for this type of transfer, due to documentation requirements."
	 * </li>
	 * </ul>
	 */
	public static final MMCode LongerProcessing = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LongerProcessing";
			definition = "Longer processing timeframe for this type of transfer, due to documentation requirements.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "LPRO";
		}
	};
	/**
	 * Additional documents have been requested by the transfer agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode
	 * PendingSettlementStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ADRQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDocumentsRequested"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional documents have been requested by the transfer agent."</li>
	 * </ul>
	 */
	public static final MMCode AdditionalDocumentsRequested = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDocumentsRequested";
			definition = "Additional documents have been requested by the transfer agent.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "ADRQ";
		}
	};
	/**
	 * Additional documents have been sent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode
	 * PendingSettlementStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ADS1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDocumentsSent1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional documents have been sent."</li>
	 * </ul>
	 */
	public static final MMCode AdditionalDocumentsSent1 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDocumentsSent1";
			definition = "Additional documents have been sent.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "ADS1";
		}
	};
	/**
	 * Upon request of the transfer agent, the intermediary has sent additional
	 * documents. The transfer agent has confirmed that all the necessary
	 * information is now in place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode
	 * PendingSettlementStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ADS2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDocumentsSent2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Upon request of the transfer agent, the intermediary has sent additional documents. The transfer agent has confirmed that all the necessary information is now in place."
	 * </li>
	 * </ul>
	 */
	public static final MMCode AdditionalDocumentsSent2 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDocumentsSent2";
			definition = "Upon request of the transfer agent, the intermediary has sent additional documents. The transfer agent has confirmed that all the necessary information is now in place.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "ADS2";
		}
	};
	/**
	 * Documents are rejected by the transfer agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode
	 * PendingSettlementStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DRJC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DocumentsRejected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Documents are rejected by the transfer agent."</li>
	 * </ul>
	 */
	public static final MMCode DocumentsRejected = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DocumentsRejected";
			definition = "Documents are rejected by the transfer agent.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "DRJC";
		}
	};
	/**
	 * Counterparty has not sent an instructon to receive. Check with
	 * counterparty.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode
	 * PendingSettlementStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CYIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingCounterpartyReceipt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Counterparty has not sent an instructon to receive. Check with counterparty."
	 * </li>
	 * </ul>
	 */
	public static final MMCode AwaitingCounterpartyReceipt = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingCounterpartyReceipt";
			definition = "Counterparty has not sent an instructon to receive. Check with counterparty.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "CYIN";
		}
	};
	/**
	 * Counterparty has not sent an instruction to deliver or delivered the
	 * shares. Check with counterparty.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode
	 * PendingSettlementStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CYDV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingCounterpartyDelivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Counterparty has not sent an instruction to deliver or delivered the shares. Check with counterparty."
	 * </li>
	 * </ul>
	 */
	public static final MMCode AwaitingCounterpartyDelivery = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingCounterpartyDelivery";
			definition = "Counterparty has not sent an instruction to deliver or delivered the shares. Check with counterparty.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "CYDV";
		}
	};
	/**
	 * Normal processing period for the instruction has lapsed. The transfer
	 * agent has been or will be contacted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode
	 * PendingSettlementStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OVER"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NormalProcessingPeriodLapsed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Normal processing period for the instruction has lapsed. The transfer agent has been or will be contacted."
	 * </li>
	 * </ul>
	 */
	public static final MMCode NormalProcessingPeriodLapsed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NormalProcessingPeriodLapsed";
			definition = "Normal processing period for the instruction has lapsed. The transfer agent has been or will be contacted.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "OVER";
		}
	};
	/**
	 * Wrong counterparty account details.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode
	 * PendingSettlementStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WCPA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WrongCounterpartyAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Wrong counterparty account details."</li>
	 * </ul>
	 */
	public static final MMCode WrongCounterpartyAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WrongCounterpartyAccount";
			definition = "Wrong counterparty account details.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "WCPA";
		}
	};
	/**
	 * Transfer is being processed by transfer agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode
	 * PendingSettlementStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TAPR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferAgentProcessing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transfer is being processed by transfer agent."</li>
	 * </ul>
	 */
	public static final MMCode TransferAgentProcessing = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferAgentProcessing";
			definition = "Transfer is being processed by transfer agent.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "TAPR";
		}
	};
	/**
	 * Confirmation is expected from transfer agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode
	 * PendingSettlementStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "XCNF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpectedConfirmation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Confirmation is expected from transfer agent."</li>
	 * </ul>
	 */
	public static final MMCode ExpectedConfirmation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpectedConfirmation";
			definition = "Confirmation is expected from transfer agent.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "XCNF";
		}
	};
	/**
	 * Special follow-up is taking place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode
	 * PendingSettlementStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ESCA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Escalation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Special follow-up is taking place."</li>
	 * </ul>
	 */
	public static final MMCode Escalation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Escalation";
			definition = "Special follow-up is taking place.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "ESCA";
		}
	};
	/**
	 * Transfer agent claims non-receipt of physical shares.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode
	 * PendingSettlementStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NRCP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferAgentNonReceipt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transfer agent claims non-receipt of physical shares."</li>
	 * </ul>
	 */
	public static final MMCode TransferAgentNonReceipt = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferAgentNonReceipt";
			definition = "Transfer agent claims non-receipt of physical shares.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "NRCP";
		}
	};
	/**
	 * Confirmed but finality is to be verified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode
	 * PendingSettlementStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FVER"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinalVerification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Confirmed but finality is to be verified."</li>
	 * </ul>
	 */
	public static final MMCode FinalVerification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinalVerification";
			definition = "Confirmed but finality is to be verified.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "FVER";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("AWMO");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PendingSettlementStatusReasonCode";
				definition = "Specifies the reason the transaction/instruction is pending settlement, ie, pending delivery or receipt of the financial instrument. Settlement on the instructed settlement date is still possible.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.AwaitingMoney, com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.AwaitingSecurities,
						com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.InstructionRefusedOrNotRecognised, com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.AwaitingSharesFromCounterparty,
						com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.PhysicalDeliveryDelay, com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.TradeAmendedInMarket,
						com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.AwaitingDocumentsOrEndorsementsFromYou,
						com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.AwaitingDocumentsOrEndorsementsFromCounterparty, com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.AccountBlocked,
						com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.EnquirySent, com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.NewIssues,
						com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.CounterpartyInsufficientSecurities, com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.MultipleSettlementAmount,
						com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.GlobalFormSecurities, com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.PreadviceInstructed,
						com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.GuaranteedDeliveryIndicatorDifference, com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.TradeSettlesInPartials,
						com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.NoMatchingRequired, com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.CounterpartyInsufficientMoney,
						com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.CollateralShortage, com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.SecuritiesPledgedAsCollateral,
						com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.RefusedDepositForIssueOfDepositaryReceipts, com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.MaximumForeignLimitReached,
						com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.NoForeignExchangeInstruction, com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.IncomeAdjustementRequired,
						com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.PendingLinkedInstruction, com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.AwaitingSettlementDate,
						com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.LackOfSecurities, com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.SecuritiesLoanedOut,
						com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.InsufficientMoney, com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.ConfirmationNotReceived,
						com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.NotInGoodOrder, com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.LackOfStampDutyInformation,
						com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.ProcessingBatchDifference, com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.AwaitingNextSettlementCycle,
						com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.SecuritiesBlocked, com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.CounterpartyInReceivership,
						com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.MinimumSettlementAmount, com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.PendingCAP,
						com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.StatusReasonInvestigation, com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.Other,
						com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.PhysicalSecuritiesVerification, com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.MissingInformation,
						com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.AccountNotOpen, com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.UnderInvestigation,
						com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.UnderClientInvestigation, com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.UnderTransferAgentInvestigation,
						com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.AwaitingTransferAgentStatus, com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.UsualTransactionTime,
						com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.AwaitingStatus, com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.ApplicationFormSent,
						com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.StockTransferFormSent, com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.LongerProcessing,
						com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.AdditionalDocumentsRequested, com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.AdditionalDocumentsSent1,
						com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.AdditionalDocumentsSent2, com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.DocumentsRejected,
						com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.AwaitingCounterpartyReceipt, com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.AwaitingCounterpartyDelivery,
						com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.NormalProcessingPeriodLapsed, com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.WrongCounterpartyAccount,
						com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.TransferAgentProcessing, com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.ExpectedConfirmation,
						com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.Escalation, com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.TransferAgentNonReceipt,
						com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.FinalVerification);
			}
		});
		return mmObject_lazy.get();
	}
}