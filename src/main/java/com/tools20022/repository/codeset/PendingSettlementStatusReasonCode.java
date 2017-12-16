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
import com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

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
 * PendingSettlementStatusReasonCode.mmAwaitingMoney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#AwaitingSecurities
 * PendingSettlementStatusReasonCode.mmAwaitingSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#InstructionRefusedOrNotRecognised
 * PendingSettlementStatusReasonCode.mmInstructionRefusedOrNotRecognised}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#AwaitingSharesFromCounterparty
 * PendingSettlementStatusReasonCode.mmAwaitingSharesFromCounterparty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#PhysicalDeliveryDelay
 * PendingSettlementStatusReasonCode.mmPhysicalDeliveryDelay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#TradeAmendedInMarket
 * PendingSettlementStatusReasonCode.mmTradeAmendedInMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#AwaitingDocumentsOrEndorsementsFromYou
 * PendingSettlementStatusReasonCode.mmAwaitingDocumentsOrEndorsementsFromYou}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#AwaitingDocumentsOrEndorsementsFromCounterparty
 * PendingSettlementStatusReasonCode.
 * mmAwaitingDocumentsOrEndorsementsFromCounterparty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#AccountBlocked
 * PendingSettlementStatusReasonCode.mmAccountBlocked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#EnquirySent
 * PendingSettlementStatusReasonCode.mmEnquirySent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#NewIssues
 * PendingSettlementStatusReasonCode.mmNewIssues}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#CounterpartyInsufficientSecurities
 * PendingSettlementStatusReasonCode.mmCounterpartyInsufficientSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#MultipleSettlementAmount
 * PendingSettlementStatusReasonCode.mmMultipleSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#GlobalFormSecurities
 * PendingSettlementStatusReasonCode.mmGlobalFormSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#PreadviceInstructed
 * PendingSettlementStatusReasonCode.mmPreadviceInstructed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#GuaranteedDeliveryIndicatorDifference
 * PendingSettlementStatusReasonCode.mmGuaranteedDeliveryIndicatorDifference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#TradeSettlesInPartials
 * PendingSettlementStatusReasonCode.mmTradeSettlesInPartials}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#NoMatchingRequired
 * PendingSettlementStatusReasonCode.mmNoMatchingRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#CounterpartyInsufficientMoney
 * PendingSettlementStatusReasonCode.mmCounterpartyInsufficientMoney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#CollateralShortage
 * PendingSettlementStatusReasonCode.mmCollateralShortage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#SecuritiesPledgedAsCollateral
 * PendingSettlementStatusReasonCode.mmSecuritiesPledgedAsCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#RefusedDepositForIssueOfDepositaryReceipts
 * PendingSettlementStatusReasonCode.
 * mmRefusedDepositForIssueOfDepositaryReceipts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#MaximumForeignLimitReached
 * PendingSettlementStatusReasonCode.mmMaximumForeignLimitReached}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#NoForeignExchangeInstruction
 * PendingSettlementStatusReasonCode.mmNoForeignExchangeInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#IncomeAdjustementRequired
 * PendingSettlementStatusReasonCode.mmIncomeAdjustementRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#PendingLinkedInstruction
 * PendingSettlementStatusReasonCode.mmPendingLinkedInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#AwaitingSettlementDate
 * PendingSettlementStatusReasonCode.mmAwaitingSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#LackOfSecurities
 * PendingSettlementStatusReasonCode.mmLackOfSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#SecuritiesLoanedOut
 * PendingSettlementStatusReasonCode.mmSecuritiesLoanedOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#InsufficientMoney
 * PendingSettlementStatusReasonCode.mmInsufficientMoney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#ConfirmationNotReceived
 * PendingSettlementStatusReasonCode.mmConfirmationNotReceived}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#NotInGoodOrder
 * PendingSettlementStatusReasonCode.mmNotInGoodOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#LackOfStampDutyInformation
 * PendingSettlementStatusReasonCode.mmLackOfStampDutyInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#ProcessingBatchDifference
 * PendingSettlementStatusReasonCode.mmProcessingBatchDifference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#AwaitingNextSettlementCycle
 * PendingSettlementStatusReasonCode.mmAwaitingNextSettlementCycle}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#SecuritiesBlocked
 * PendingSettlementStatusReasonCode.mmSecuritiesBlocked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#CounterpartyInReceivership
 * PendingSettlementStatusReasonCode.mmCounterpartyInReceivership}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#MinimumSettlementAmount
 * PendingSettlementStatusReasonCode.mmMinimumSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#PendingCAP
 * PendingSettlementStatusReasonCode.mmPendingCAP}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#StatusReasonInvestigation
 * PendingSettlementStatusReasonCode.mmStatusReasonInvestigation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#Other
 * PendingSettlementStatusReasonCode.mmOther}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#PhysicalSecuritiesVerification
 * PendingSettlementStatusReasonCode.mmPhysicalSecuritiesVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#MissingInformation
 * PendingSettlementStatusReasonCode.mmMissingInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#AccountNotOpen
 * PendingSettlementStatusReasonCode.mmAccountNotOpen}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#UnderInvestigation
 * PendingSettlementStatusReasonCode.mmUnderInvestigation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#UnderClientInvestigation
 * PendingSettlementStatusReasonCode.mmUnderClientInvestigation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#UnderTransferAgentInvestigation
 * PendingSettlementStatusReasonCode.mmUnderTransferAgentInvestigation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#AwaitingTransferAgentStatus
 * PendingSettlementStatusReasonCode.mmAwaitingTransferAgentStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#UsualTransactionTime
 * PendingSettlementStatusReasonCode.mmUsualTransactionTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#AwaitingStatus
 * PendingSettlementStatusReasonCode.mmAwaitingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#ApplicationFormSent
 * PendingSettlementStatusReasonCode.mmApplicationFormSent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#StockTransferFormSent
 * PendingSettlementStatusReasonCode.mmStockTransferFormSent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#LongerProcessing
 * PendingSettlementStatusReasonCode.mmLongerProcessing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#AdditionalDocumentsRequested
 * PendingSettlementStatusReasonCode.mmAdditionalDocumentsRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#AdditionalDocumentsSent1
 * PendingSettlementStatusReasonCode.mmAdditionalDocumentsSent1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#AdditionalDocumentsSent2
 * PendingSettlementStatusReasonCode.mmAdditionalDocumentsSent2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#DocumentsRejected
 * PendingSettlementStatusReasonCode.mmDocumentsRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#AwaitingCounterpartyReceipt
 * PendingSettlementStatusReasonCode.mmAwaitingCounterpartyReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#AwaitingCounterpartyDelivery
 * PendingSettlementStatusReasonCode.mmAwaitingCounterpartyDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#NormalProcessingPeriodLapsed
 * PendingSettlementStatusReasonCode.mmNormalProcessingPeriodLapsed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#WrongCounterpartyAccount
 * PendingSettlementStatusReasonCode.mmWrongCounterpartyAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#TransferAgentProcessing
 * PendingSettlementStatusReasonCode.mmTransferAgentProcessing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#ExpectedConfirmation
 * PendingSettlementStatusReasonCode.mmExpectedConfirmation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#Escalation
 * PendingSettlementStatusReasonCode.mmEscalation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#TransferAgentNonReceipt
 * PendingSettlementStatusReasonCode.mmTransferAgentNonReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode#FinalVerification
 * PendingSettlementStatusReasonCode.mmFinalVerification}</li>
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
 * "PendingSettlementStatusReasonCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason the transaction/instruction is pending settlement, ie, pending delivery or receipt of the financial instrument. Settlement on the instructed settlement date is still possible."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PendingSettlementStatusReasonCode extends MMCode {

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
	public static final PendingSettlementStatusReasonCode AwaitingMoney = new PendingSettlementStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AwaitingMoney";
			definition = "Securities have been delivered, but the settlement amount has not been received from the counterparty.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.mmObject();
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
	public static final PendingSettlementStatusReasonCode AwaitingSecurities = new PendingSettlementStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AwaitingSecurities";
			definition = "Awaiting securities from corporate action issue or other procedures, eg, conversion, dematerialisation, exchange, registration, stamping, splitting, etc.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.mmObject();
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
	public static final PendingSettlementStatusReasonCode InstructionRefusedOrNotRecognised = new PendingSettlementStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InstructionRefusedOrNotRecognised";
			definition = "Instruction that has been refused or not recognised, and is represented automatically.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.mmObject();
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
	public static final PendingSettlementStatusReasonCode AwaitingSharesFromCounterparty = new PendingSettlementStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AwaitingSharesFromCounterparty";
			definition = "Securities have not yet been received from the counterparty.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.mmObject();
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
	public static final PendingSettlementStatusReasonCode PhysicalDeliveryDelay = new PendingSettlementStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PhysicalDeliveryDelay";
			definition = "Settlement is physical and securities are being delivered.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.mmObject();
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
	public static final PendingSettlementStatusReasonCode TradeAmendedInMarket = new PendingSettlementStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradeAmendedInMarket";
			definition = "Trade is being amended in the market.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.mmObject();
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
	public static final PendingSettlementStatusReasonCode AwaitingDocumentsOrEndorsementsFromYou = new PendingSettlementStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AwaitingDocumentsOrEndorsementsFromYou";
			definition = "Awaiting documents or endorsements from you.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.mmObject();
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
	public static final PendingSettlementStatusReasonCode AwaitingDocumentsOrEndorsementsFromCounterparty = new PendingSettlementStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AwaitingDocumentsOrEndorsementsFromCounterparty";
			definition = "Awaiting documents or endorsements from the counterparty.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.mmObject();
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
	public static final PendingSettlementStatusReasonCode AccountBlocked = new PendingSettlementStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccountBlocked";
			definition = "Your account is blocked, no instruction can settle over the account.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.mmObject();
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
	public static final PendingSettlementStatusReasonCode EnquirySent = new PendingSettlementStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EnquirySent";
			definition = "Chaser/enquiry sent to the agent or depository.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.mmObject();
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
	public static final PendingSettlementStatusReasonCode NewIssues = new PendingSettlementStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NewIssues";
			definition = "Securities are new issues and are not yet available/tradable.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.mmObject();
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
	public static final PendingSettlementStatusReasonCode CounterpartyInsufficientSecurities = new PendingSettlementStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CounterpartyInsufficientSecurities";
			definition = "Insufficient deliverable securities in the counterparty's account, or counterparty does not hold the securities.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.mmObject();
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
	public static final PendingSettlementStatusReasonCode MultipleSettlementAmount = new PendingSettlementStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MultipleSettlementAmount";
			definition = "Securities quantity is not a multiple of an existing settlement amount lot for the instructed financial instrument.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.mmObject();
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
	public static final PendingSettlementStatusReasonCode GlobalFormSecurities = new PendingSettlementStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GlobalFormSecurities";
			definition = "Settlement cannot be executed as securities are in global form.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.mmObject();
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
	public static final PendingSettlementStatusReasonCode PreadviceInstructed = new PendingSettlementStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PreadviceInstructed";
			definition = "Your instruction is a preadvice, ie, matching only.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.mmObject();
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
	public static final PendingSettlementStatusReasonCode GuaranteedDeliveryIndicatorDifference = new PendingSettlementStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GuaranteedDeliveryIndicatorDifference";
			definition = "Guaranteed delivery indicator differs in the counterparty's instruction.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.mmObject();
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
	public static final PendingSettlementStatusReasonCode TradeSettlesInPartials = new PendingSettlementStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradeSettlesInPartials";
			definition = "Trade will settle in partials.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.mmObject();
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
	public static final PendingSettlementStatusReasonCode NoMatchingRequired = new PendingSettlementStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NoMatchingRequired";
			definition = "Instruction has not been matched because the matching process is not required.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.mmObject();
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
	public static final PendingSettlementStatusReasonCode CounterpartyInsufficientMoney = new PendingSettlementStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CounterpartyInsufficientMoney";
			definition = "Insufficient money in the counterparty's account.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.mmObject();
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
	public static final PendingSettlementStatusReasonCode CollateralShortage = new PendingSettlementStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CollateralShortage";
			definition = "Not enough collateral in your account to execute the transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.mmObject();
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
	public static final PendingSettlementStatusReasonCode SecuritiesPledgedAsCollateral = new PendingSettlementStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesPledgedAsCollateral";
			definition = "Securities are not deliverable as they are pledged as collateral.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.mmObject();
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
	public static final PendingSettlementStatusReasonCode RefusedDepositForIssueOfDepositaryReceipts = new PendingSettlementStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RefusedDepositForIssueOfDepositaryReceipts";
			definition = "Deposit of shares for the issuing of depositary receipts has been refused. The allotment for depositary receipts granted by the issuer is exceeded by the transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.mmObject();
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
	public static final PendingSettlementStatusReasonCode MaximumForeignLimitReached = new PendingSettlementStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaximumForeignLimitReached";
			definition = "Insufficient deliverable securities in your account because the maximum foreign limit has been reached.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.mmObject();
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
	public static final PendingSettlementStatusReasonCode NoForeignExchangeInstruction = new PendingSettlementStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NoForeignExchangeInstruction";
			definition = "Foreign exchange instruction is missing.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.mmObject();
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
	public static final PendingSettlementStatusReasonCode IncomeAdjustementRequired = new PendingSettlementStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IncomeAdjustementRequired";
			definition = "Securities require income adjustment, eg, dividend or interest.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.mmObject();
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
	public static final PendingSettlementStatusReasonCode PendingLinkedInstruction = new PendingSettlementStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PendingLinkedInstruction";
			definition = "Your instruction is pending settlement because the instruction linked to it is pending.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.mmObject();
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
	public static final PendingSettlementStatusReasonCode AwaitingSettlementDate = new PendingSettlementStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AwaitingSettlementDate";
			definition = "Instruction is awaiting the settlement date, and no settlement problems have been reported.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.mmObject();
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
	public static final PendingSettlementStatusReasonCode LackOfSecurities = new PendingSettlementStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LackOfSecurities";
			definition = "Insufficient deliverable securities in your account.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.mmObject();
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
	public static final PendingSettlementStatusReasonCode SecuritiesLoanedOut = new PendingSettlementStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesLoanedOut";
			definition = "Insufficient deliverable securities in your account because securities are loaned out.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.mmObject();
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
	public static final PendingSettlementStatusReasonCode InsufficientMoney = new PendingSettlementStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InsufficientMoney";
			definition = "Insufficient money in your account.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.mmObject();
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
	public static final PendingSettlementStatusReasonCode ConfirmationNotReceived = new PendingSettlementStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConfirmationNotReceived";
			definition = "Settlement confirmation has not been received.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.mmObject();
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
	public static final PendingSettlementStatusReasonCode NotInGoodOrder = new PendingSettlementStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotInGoodOrder";
			definition = "Delivery/receipt has been refused because the physical securities are not in good order.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.mmObject();
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
	public static final PendingSettlementStatusReasonCode LackOfStampDutyInformation = new PendingSettlementStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LackOfStampDutyInformation";
			definition = "Instruction is pending as stamp duty information is missing.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.mmObject();
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
	public static final PendingSettlementStatusReasonCode ProcessingBatchDifference = new PendingSettlementStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProcessingBatchDifference";
			definition = "Processing batch differs in the counterparty's instruction, eg, day time/real time versus overnight.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.mmObject();
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
	public static final PendingSettlementStatusReasonCode AwaitingNextSettlementCycle = new PendingSettlementStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AwaitingNextSettlementCycle";
			definition = "Instruction is confirmed in the local market or is ready for settlement, awaiting the next settlement cycle.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.mmObject();
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
	public static final PendingSettlementStatusReasonCode SecuritiesBlocked = new PendingSettlementStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesBlocked";
			definition = "Settlement is pending. The securities are blocked due to, for example, a corporate action event, re-alignment.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.mmObject();
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
	public static final PendingSettlementStatusReasonCode CounterpartyInReceivership = new PendingSettlementStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CounterpartyInReceivership";
			definition = "Counterparty is in receivership, ie, the form of bankruptcy where a court appointed person, the receiver, manages the affairs of the business.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.mmObject();
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
	public static final PendingSettlementStatusReasonCode MinimumSettlementAmount = new PendingSettlementStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumSettlementAmount";
			definition = "Securities amount is lower than the minimum existing settlement amount for the instructed financial instrument.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.mmObject();
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
	public static final PendingSettlementStatusReasonCode PendingCAP = new PendingSettlementStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PendingCAP";
			definition = "Payment is pending, and does not settle because the actual use of the risk management limit on the counterpart (bilateral limit) prevents settlement.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.mmObject();
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
	public static final PendingSettlementStatusReasonCode StatusReasonInvestigation = new PendingSettlementStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StatusReasonInvestigation";
			definition = "Pending reason is being investigated.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.mmObject();
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
	public static final PendingSettlementStatusReasonCode Other = new PendingSettlementStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Other";
			definition = "Another settlement pending reason.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.mmObject();
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
	public static final PendingSettlementStatusReasonCode PhysicalSecuritiesVerification = new PendingSettlementStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PhysicalSecuritiesVerification";
			definition = "Physical shares have been received and are being checked for authenticity.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.mmObject();
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
	public static final PendingSettlementStatusReasonCode MissingInformation = new PendingSettlementStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MissingInformation";
			definition = "Information, for example, telephone number, contact person, is missing.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.mmObject();
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
	public static final PendingSettlementStatusReasonCode AccountNotOpen = new PendingSettlementStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountNotOpen";
			definition = "Account must already be opened in order to process the transfer.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.mmObject();
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
	public static final PendingSettlementStatusReasonCode UnderInvestigation = new PendingSettlementStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderInvestigation";
			definition = "Intermediary is investigating the reason why the transfer is pending.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.mmObject();
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
	public static final PendingSettlementStatusReasonCode UnderClientInvestigation = new PendingSettlementStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderClientInvestigation";
			definition = "Client has been informed of a problem and is investigating.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.mmObject();
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
	public static final PendingSettlementStatusReasonCode UnderTransferAgentInvestigation = new PendingSettlementStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderTransferAgentInvestigation";
			definition = "Transfer agent is investigating.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.mmObject();
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
	public static final PendingSettlementStatusReasonCode AwaitingTransferAgentStatus = new PendingSettlementStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingTransferAgentStatus";
			definition = "Transfer is being processed by the transfer agent, awaiting status from transfer agent.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.mmObject();
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
	public static final PendingSettlementStatusReasonCode UsualTransactionTime = new PendingSettlementStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UsualTransactionTime";
			definition = "Usual transfer agent's processing timeframe.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.mmObject();
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
	public static final PendingSettlementStatusReasonCode AwaitingStatus = new PendingSettlementStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingStatus";
			definition = "At your request, the Intermediary is checking the status of your instruction with the transfer agent.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.mmObject();
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
	public static final PendingSettlementStatusReasonCode ApplicationFormSent = new PendingSettlementStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApplicationFormSent";
			definition = "Application form has been sent to the transfer agent.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.mmObject();
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
	public static final PendingSettlementStatusReasonCode StockTransferFormSent = new PendingSettlementStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockTransferFormSent";
			definition = "Stock transfer form has been sent to the counterparty to sign and forward to the transfer agent.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.mmObject();
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
	public static final PendingSettlementStatusReasonCode LongerProcessing = new PendingSettlementStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LongerProcessing";
			definition = "Longer processing timeframe for this type of transfer, due to documentation requirements.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.mmObject();
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
	public static final PendingSettlementStatusReasonCode AdditionalDocumentsRequested = new PendingSettlementStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDocumentsRequested";
			definition = "Additional documents have been requested by the transfer agent.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.mmObject();
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
	public static final PendingSettlementStatusReasonCode AdditionalDocumentsSent1 = new PendingSettlementStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDocumentsSent1";
			definition = "Additional documents have been sent.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.mmObject();
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
	public static final PendingSettlementStatusReasonCode AdditionalDocumentsSent2 = new PendingSettlementStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDocumentsSent2";
			definition = "Upon request of the transfer agent, the intermediary has sent additional documents. The transfer agent has confirmed that all the necessary information is now in place.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.mmObject();
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
	public static final PendingSettlementStatusReasonCode DocumentsRejected = new PendingSettlementStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DocumentsRejected";
			definition = "Documents are rejected by the transfer agent.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.mmObject();
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
	public static final PendingSettlementStatusReasonCode AwaitingCounterpartyReceipt = new PendingSettlementStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingCounterpartyReceipt";
			definition = "Counterparty has not sent an instructon to receive. Check with counterparty.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.mmObject();
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
	public static final PendingSettlementStatusReasonCode AwaitingCounterpartyDelivery = new PendingSettlementStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingCounterpartyDelivery";
			definition = "Counterparty has not sent an instruction to deliver or delivered the shares. Check with counterparty.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.mmObject();
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
	public static final PendingSettlementStatusReasonCode NormalProcessingPeriodLapsed = new PendingSettlementStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NormalProcessingPeriodLapsed";
			definition = "Normal processing period for the instruction has lapsed. The transfer agent has been or will be contacted.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.mmObject();
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
	public static final PendingSettlementStatusReasonCode WrongCounterpartyAccount = new PendingSettlementStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WrongCounterpartyAccount";
			definition = "Wrong counterparty account details.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.mmObject();
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
	public static final PendingSettlementStatusReasonCode TransferAgentProcessing = new PendingSettlementStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferAgentProcessing";
			definition = "Transfer is being processed by transfer agent.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.mmObject();
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
	public static final PendingSettlementStatusReasonCode ExpectedConfirmation = new PendingSettlementStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpectedConfirmation";
			definition = "Confirmation is expected from transfer agent.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.mmObject();
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
	public static final PendingSettlementStatusReasonCode Escalation = new PendingSettlementStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Escalation";
			definition = "Special follow-up is taking place.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.mmObject();
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
	public static final PendingSettlementStatusReasonCode TransferAgentNonReceipt = new PendingSettlementStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferAgentNonReceipt";
			definition = "Transfer agent claims non-receipt of physical shares.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.mmObject();
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
	public static final PendingSettlementStatusReasonCode FinalVerification = new PendingSettlementStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinalVerification";
			definition = "Confirmed but finality is to be verified.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.mmObject();
			codeName = "FVER";
		}
	};
	final static private LinkedHashMap<String, PendingSettlementStatusReasonCode> codesByName = new LinkedHashMap<>();

	protected PendingSettlementStatusReasonCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("AWMO");
				registrationStatus = MMRegistrationStatus.REGISTERED;
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

	static {
		codesByName.put(AwaitingMoney.getCodeName().get(), AwaitingMoney);
		codesByName.put(AwaitingSecurities.getCodeName().get(), AwaitingSecurities);
		codesByName.put(InstructionRefusedOrNotRecognised.getCodeName().get(), InstructionRefusedOrNotRecognised);
		codesByName.put(AwaitingSharesFromCounterparty.getCodeName().get(), AwaitingSharesFromCounterparty);
		codesByName.put(PhysicalDeliveryDelay.getCodeName().get(), PhysicalDeliveryDelay);
		codesByName.put(TradeAmendedInMarket.getCodeName().get(), TradeAmendedInMarket);
		codesByName.put(AwaitingDocumentsOrEndorsementsFromYou.getCodeName().get(), AwaitingDocumentsOrEndorsementsFromYou);
		codesByName.put(AwaitingDocumentsOrEndorsementsFromCounterparty.getCodeName().get(), AwaitingDocumentsOrEndorsementsFromCounterparty);
		codesByName.put(AccountBlocked.getCodeName().get(), AccountBlocked);
		codesByName.put(EnquirySent.getCodeName().get(), EnquirySent);
		codesByName.put(NewIssues.getCodeName().get(), NewIssues);
		codesByName.put(CounterpartyInsufficientSecurities.getCodeName().get(), CounterpartyInsufficientSecurities);
		codesByName.put(MultipleSettlementAmount.getCodeName().get(), MultipleSettlementAmount);
		codesByName.put(GlobalFormSecurities.getCodeName().get(), GlobalFormSecurities);
		codesByName.put(PreadviceInstructed.getCodeName().get(), PreadviceInstructed);
		codesByName.put(GuaranteedDeliveryIndicatorDifference.getCodeName().get(), GuaranteedDeliveryIndicatorDifference);
		codesByName.put(TradeSettlesInPartials.getCodeName().get(), TradeSettlesInPartials);
		codesByName.put(NoMatchingRequired.getCodeName().get(), NoMatchingRequired);
		codesByName.put(CounterpartyInsufficientMoney.getCodeName().get(), CounterpartyInsufficientMoney);
		codesByName.put(CollateralShortage.getCodeName().get(), CollateralShortage);
		codesByName.put(SecuritiesPledgedAsCollateral.getCodeName().get(), SecuritiesPledgedAsCollateral);
		codesByName.put(RefusedDepositForIssueOfDepositaryReceipts.getCodeName().get(), RefusedDepositForIssueOfDepositaryReceipts);
		codesByName.put(MaximumForeignLimitReached.getCodeName().get(), MaximumForeignLimitReached);
		codesByName.put(NoForeignExchangeInstruction.getCodeName().get(), NoForeignExchangeInstruction);
		codesByName.put(IncomeAdjustementRequired.getCodeName().get(), IncomeAdjustementRequired);
		codesByName.put(PendingLinkedInstruction.getCodeName().get(), PendingLinkedInstruction);
		codesByName.put(AwaitingSettlementDate.getCodeName().get(), AwaitingSettlementDate);
		codesByName.put(LackOfSecurities.getCodeName().get(), LackOfSecurities);
		codesByName.put(SecuritiesLoanedOut.getCodeName().get(), SecuritiesLoanedOut);
		codesByName.put(InsufficientMoney.getCodeName().get(), InsufficientMoney);
		codesByName.put(ConfirmationNotReceived.getCodeName().get(), ConfirmationNotReceived);
		codesByName.put(NotInGoodOrder.getCodeName().get(), NotInGoodOrder);
		codesByName.put(LackOfStampDutyInformation.getCodeName().get(), LackOfStampDutyInformation);
		codesByName.put(ProcessingBatchDifference.getCodeName().get(), ProcessingBatchDifference);
		codesByName.put(AwaitingNextSettlementCycle.getCodeName().get(), AwaitingNextSettlementCycle);
		codesByName.put(SecuritiesBlocked.getCodeName().get(), SecuritiesBlocked);
		codesByName.put(CounterpartyInReceivership.getCodeName().get(), CounterpartyInReceivership);
		codesByName.put(MinimumSettlementAmount.getCodeName().get(), MinimumSettlementAmount);
		codesByName.put(PendingCAP.getCodeName().get(), PendingCAP);
		codesByName.put(StatusReasonInvestigation.getCodeName().get(), StatusReasonInvestigation);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(PhysicalSecuritiesVerification.getCodeName().get(), PhysicalSecuritiesVerification);
		codesByName.put(MissingInformation.getCodeName().get(), MissingInformation);
		codesByName.put(AccountNotOpen.getCodeName().get(), AccountNotOpen);
		codesByName.put(UnderInvestigation.getCodeName().get(), UnderInvestigation);
		codesByName.put(UnderClientInvestigation.getCodeName().get(), UnderClientInvestigation);
		codesByName.put(UnderTransferAgentInvestigation.getCodeName().get(), UnderTransferAgentInvestigation);
		codesByName.put(AwaitingTransferAgentStatus.getCodeName().get(), AwaitingTransferAgentStatus);
		codesByName.put(UsualTransactionTime.getCodeName().get(), UsualTransactionTime);
		codesByName.put(AwaitingStatus.getCodeName().get(), AwaitingStatus);
		codesByName.put(ApplicationFormSent.getCodeName().get(), ApplicationFormSent);
		codesByName.put(StockTransferFormSent.getCodeName().get(), StockTransferFormSent);
		codesByName.put(LongerProcessing.getCodeName().get(), LongerProcessing);
		codesByName.put(AdditionalDocumentsRequested.getCodeName().get(), AdditionalDocumentsRequested);
		codesByName.put(AdditionalDocumentsSent1.getCodeName().get(), AdditionalDocumentsSent1);
		codesByName.put(AdditionalDocumentsSent2.getCodeName().get(), AdditionalDocumentsSent2);
		codesByName.put(DocumentsRejected.getCodeName().get(), DocumentsRejected);
		codesByName.put(AwaitingCounterpartyReceipt.getCodeName().get(), AwaitingCounterpartyReceipt);
		codesByName.put(AwaitingCounterpartyDelivery.getCodeName().get(), AwaitingCounterpartyDelivery);
		codesByName.put(NormalProcessingPeriodLapsed.getCodeName().get(), NormalProcessingPeriodLapsed);
		codesByName.put(WrongCounterpartyAccount.getCodeName().get(), WrongCounterpartyAccount);
		codesByName.put(TransferAgentProcessing.getCodeName().get(), TransferAgentProcessing);
		codesByName.put(ExpectedConfirmation.getCodeName().get(), ExpectedConfirmation);
		codesByName.put(Escalation.getCodeName().get(), Escalation);
		codesByName.put(TransferAgentNonReceipt.getCodeName().get(), TransferAgentNonReceipt);
		codesByName.put(FinalVerification.getCodeName().get(), FinalVerification);
	}

	public static PendingSettlementStatusReasonCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PendingSettlementStatusReasonCode[] values() {
		PendingSettlementStatusReasonCode[] values = new PendingSettlementStatusReasonCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PendingSettlementStatusReasonCode> {
		@Override
		public PendingSettlementStatusReasonCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PendingSettlementStatusReasonCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}