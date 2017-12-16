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
import com.tools20022.repository.codeset.PendingFailingSettlementCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason the transaction/instruction is pending failing
 * settlement, and the settlement at the instruction settlement date is no
 * longer possible.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode#AwaitingMoney
 * PendingFailingSettlementCode.mmAwaitingMoney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode#AwaitingSecuritiesFromCounterparty
 * PendingFailingSettlementCode.mmAwaitingSecuritiesFromCounterparty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode#AwaitingOtherTransaction
 * PendingFailingSettlementCode.mmAwaitingOtherTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode#AwaitingDocumentsOrEndorsementsFromYou
 * PendingFailingSettlementCode.mmAwaitingDocumentsOrEndorsementsFromYou}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode#CounterpartyTooLateForSettlement
 * PendingFailingSettlementCode.mmCounterpartyTooLateForSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode#WrongCertificateNumbers
 * PendingFailingSettlementCode.mmWrongCertificateNumbers}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode#MinimumSettlementAmount
 * PendingFailingSettlementCode.mmMinimumSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode#PhysicalDeliveryDelay
 * PendingFailingSettlementCode.mmPhysicalDeliveryDelay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode#SecuritiesBlocked
 * PendingFailingSettlementCode.mmSecuritiesBlocked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode#CounterpartyReturnedSecurities
 * PendingFailingSettlementCode.mmCounterpartyReturnedSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode#ConfirmationDiscrepancy
 * PendingFailingSettlementCode.mmConfirmationDiscrepancy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode#BeneficialOwnershipDisagreement
 * PendingFailingSettlementCode.mmBeneficialOwnershipDisagreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode#LackOfSecurities
 * PendingFailingSettlementCode.mmLackOfSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode#TooLateForSettlement
 * PendingFailingSettlementCode.mmTooLateForSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode#CancellationConfirmationRequest
 * PendingFailingSettlementCode.mmCancellationConfirmationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode#MoneyTooLateForSettlement
 * PendingFailingSettlementCode.mmMoneyTooLateForSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode#UnderObjection
 * PendingFailingSettlementCode.mmUnderObjection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode#AwaitingDocumentsOrEndorsementsFromCounterparty
 * PendingFailingSettlementCode.
 * mmAwaitingDocumentsOrEndorsementsFromCounterparty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode#AccountBlocked
 * PendingFailingSettlementCode.mmAccountBlocked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode#EnquirySent
 * PendingFailingSettlementCode.mmEnquirySent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode#NewIssues
 * PendingFailingSettlementCode.mmNewIssues}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode#CounterpartyInsufficientSecurities
 * PendingFailingSettlementCode.mmCounterpartyInsufficientSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode#TradeSettlesInPartials
 * PendingFailingSettlementCode.mmTradeSettlesInPartials}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode#CounterpartyInsufficientMoney
 * PendingFailingSettlementCode.mmCounterpartyInsufficientMoney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode#SecuritiesPledgedAsCollateral
 * PendingFailingSettlementCode.mmSecuritiesPledgedAsCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode#RefusedDepositForIssueOfDepositaryReceipts
 * PendingFailingSettlementCode.mmRefusedDepositForIssueOfDepositaryReceipts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode#MaximumForeignLimitReached
 * PendingFailingSettlementCode.mmMaximumForeignLimitReached}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode#NoForeignExchangeInstruction
 * PendingFailingSettlementCode.mmNoForeignExchangeInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode#IncomeAdjustementRequired
 * PendingFailingSettlementCode.mmIncomeAdjustementRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode#PendingLinkedInstruction
 * PendingFailingSettlementCode.mmPendingLinkedInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode#BuyInProcedure
 * PendingFailingSettlementCode.mmBuyInProcedure}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode#AwaitingSecurities
 * PendingFailingSettlementCode.mmAwaitingSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode#SecuritiesLoanedOut
 * PendingFailingSettlementCode.mmSecuritiesLoanedOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode#InsufficientMoney
 * PendingFailingSettlementCode.mmInsufficientMoney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode#ConfirmationNotReceived
 * PendingFailingSettlementCode.mmConfirmationNotReceived}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode#CollateralShortage
 * PendingFailingSettlementCode.mmCollateralShortage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode#NotInGoodOrder
 * PendingFailingSettlementCode.mmNotInGoodOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode#LackOfStampDutyInformation
 * PendingFailingSettlementCode.mmLackOfStampDutyInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode#AwaitingNextSettlementCycle
 * PendingFailingSettlementCode.mmAwaitingNextSettlementCycle}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode#ProcessingBatchDifference
 * PendingFailingSettlementCode.mmProcessingBatchDifference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode#GuaranteedDeliveryIndicatorDifference
 * PendingFailingSettlementCode.mmGuaranteedDeliveryIndicatorDifference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode#PreadviceInstructed
 * PendingFailingSettlementCode.mmPreadviceInstructed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode#GlobalFormSecurities
 * PendingFailingSettlementCode.mmGlobalFormSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode#CounterpartyInReceivership
 * PendingFailingSettlementCode.mmCounterpartyInReceivership}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode#MultipleSettlementAmount
 * PendingFailingSettlementCode.mmMultipleSettlementAmount}</li>
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
 * "PendingFailingSettlementCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason the transaction/instruction is pending failing settlement, and the settlement at the instruction settlement date is no longer possible."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PendingFailingSettlementCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Securities have been delivered, but the money is still expected from the
	 * counterparty.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode
	 * PendingFailingSettlementCode}</li>
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
	 * "Securities have been delivered, but the money is still expected from the counterparty."
	 * </li>
	 * </ul>
	 */
	public static final PendingFailingSettlementCode AwaitingMoney = new PendingFailingSettlementCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AwaitingMoney";
			definition = "Securities have been delivered, but the money is still expected from the counterparty.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingSettlementCode.mmObject();
			codeName = "AWMO";
		}
	};
	/**
	 * Securities have not yet been received from the counterparty. If the
	 * settlement instruction was a received against payment, the cash has been
	 * delivered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode
	 * PendingFailingSettlementCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AWSH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingSecuritiesFromCounterparty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities have not yet been received from the counterparty. If the settlement instruction was a received against payment, the cash has been delivered."
	 * </li>
	 * </ul>
	 */
	public static final PendingFailingSettlementCode AwaitingSecuritiesFromCounterparty = new PendingFailingSettlementCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AwaitingSecuritiesFromCounterparty";
			definition = "Securities have not yet been received from the counterparty. If the settlement instruction was a received against payment, the cash has been delivered.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingSettlementCode.mmObject();
			codeName = "AWSH";
		}
	};
	/**
	 * Awaiting settlement of a linked 'buy'.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode
	 * PendingFailingSettlementCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LAAW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingOtherTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Awaiting settlement of a linked 'buy'."</li>
	 * </ul>
	 */
	public static final PendingFailingSettlementCode AwaitingOtherTransaction = new PendingFailingSettlementCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AwaitingOtherTransaction";
			definition = "Awaiting settlement of a linked 'buy'.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingSettlementCode.mmObject();
			codeName = "LAAW";
		}
	};
	/**
	 * Awaiting documents or endorsements from you.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode
	 * PendingFailingSettlementCode}</li>
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
	public static final PendingFailingSettlementCode AwaitingDocumentsOrEndorsementsFromYou = new PendingFailingSettlementCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AwaitingDocumentsOrEndorsementsFromYou";
			definition = "Awaiting documents or endorsements from you.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingSettlementCode.mmObject();
			codeName = "DOCY";
		}
	};
	/**
	 * Counterparty's instruction was too late for settlement, (ie, received too
	 * late, matching, or settlement problems were solved too late).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode
	 * PendingFailingSettlementCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLAT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyTooLateForSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Counterparty's instruction was too late for settlement, (ie, received too late, matching, or settlement problems were solved too late)."
	 * </li>
	 * </ul>
	 */
	public static final PendingFailingSettlementCode CounterpartyTooLateForSettlement = new PendingFailingSettlementCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CounterpartyTooLateForSettlement";
			definition = "Counterparty's instruction was too late for settlement, (ie, received too late, matching, or settlement problems were solved too late).";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingSettlementCode.mmObject();
			codeName = "CLAT";
		}
	};
	/**
	 * Certificate number error.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode
	 * PendingFailingSettlementCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CERT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WrongCertificateNumbers"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Certificate number error."</li>
	 * </ul>
	 */
	public static final PendingFailingSettlementCode WrongCertificateNumbers = new PendingFailingSettlementCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WrongCertificateNumbers";
			definition = "Certificate number error.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingSettlementCode.mmObject();
			codeName = "CERT";
		}
	};
	/**
	 * Securities quantity is lower than the minimum existing settlement
	 * quantity for the instructed financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode
	 * PendingFailingSettlementCode}</li>
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
	 * "Securities quantity is lower than the minimum existing settlement quantity for the instructed financial instrument."
	 * </li>
	 * </ul>
	 */
	public static final PendingFailingSettlementCode MinimumSettlementAmount = new PendingFailingSettlementCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumSettlementAmount";
			definition = "Securities quantity is lower than the minimum existing settlement quantity for the instructed financial instrument.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingSettlementCode.mmObject();
			codeName = "MINO";
		}
	};
	/**
	 * Settlement is physical, and there is a delay in the delivery of the
	 * securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode
	 * PendingFailingSettlementCode}</li>
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
	 * "Settlement is physical, and there is a delay in the delivery of the securities."
	 * </li>
	 * </ul>
	 */
	public static final PendingFailingSettlementCode PhysicalDeliveryDelay = new PendingFailingSettlementCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PhysicalDeliveryDelay";
			definition = "Settlement is physical, and there is a delay in the delivery of the securities.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingSettlementCode.mmObject();
			codeName = "PHSE";
		}
	};
	/**
	 * Securities are blocked, eg, because of a corporate action event or
	 * re-alignment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode
	 * PendingFailingSettlementCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SBLO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesBlocked"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities are blocked, eg, because of a corporate action event or re-alignment."
	 * </li>
	 * </ul>
	 */
	public static final PendingFailingSettlementCode SecuritiesBlocked = new PendingFailingSettlementCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesBlocked";
			definition = "Securities are blocked, eg, because of a corporate action event or re-alignment.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingSettlementCode.mmObject();
			codeName = "SBLO";
		}
	};
	/**
	 * Counterparty has returned, refused, or does not recognize the securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode
	 * PendingFailingSettlementCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DKNY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyReturnedSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Counterparty has returned, refused, or does not recognize the securities."
	 * </li>
	 * </ul>
	 */
	public static final PendingFailingSettlementCode CounterpartyReturnedSecurities = new PendingFailingSettlementCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CounterpartyReturnedSecurities";
			definition = "Counterparty has returned, refused, or does not recognize the securities.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingSettlementCode.mmObject();
			codeName = "DKNY";
		}
	};
	/**
	 * Discrepancy in the settlement confirmation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode
	 * PendingFailingSettlementCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STCD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmationDiscrepancy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Discrepancy in the settlement confirmation."</li>
	 * </ul>
	 */
	public static final PendingFailingSettlementCode ConfirmationDiscrepancy = new PendingFailingSettlementCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConfirmationDiscrepancy";
			definition = "Discrepancy in the settlement confirmation.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingSettlementCode.mmObject();
			codeName = "STCD";
		}
	};
	/**
	 * Disagreement over beneficial ownership.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode
	 * PendingFailingSettlementCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BENO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficialOwnershipDisagreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Disagreement over beneficial ownership."</li>
	 * </ul>
	 */
	public static final PendingFailingSettlementCode BeneficialOwnershipDisagreement = new PendingFailingSettlementCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BeneficialOwnershipDisagreement";
			definition = "Disagreement over beneficial ownership.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingSettlementCode.mmObject();
			codeName = "BENO";
		}
	};
	/**
	 * Insufficient deliverable securities in your account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode
	 * PendingFailingSettlementCode}</li>
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
	public static final PendingFailingSettlementCode LackOfSecurities = new PendingFailingSettlementCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LackOfSecurities";
			definition = "Insufficient deliverable securities in your account.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingSettlementCode.mmObject();
			codeName = "LACK";
		}
	};
	/**
	 * Settlement instruction was too late for settlement, ie, received too
	 * late, matching, or settlement problems were solved too late.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode
	 * PendingFailingSettlementCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LATE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TooLateForSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement instruction was too late for settlement, ie, received too late, matching, or settlement problems were solved too late."
	 * </li>
	 * </ul>
	 */
	public static final PendingFailingSettlementCode TooLateForSettlement = new PendingFailingSettlementCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TooLateForSettlement";
			definition = "Settlement instruction was too late for settlement, ie, received too late, matching, or settlement problems were solved too late.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingSettlementCode.mmObject();
			codeName = "LATE";
		}
	};
	/**
	 * Transaction suspended. Because the suspension period is finished, the
	 * cancellation or confirmation of instructions is required.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode
	 * PendingFailingSettlementCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CANR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationConfirmationRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction suspended. Because the suspension period is finished, the cancellation or confirmation of instructions is required."
	 * </li>
	 * </ul>
	 */
	public static final PendingFailingSettlementCode CancellationConfirmationRequest = new PendingFailingSettlementCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancellationConfirmationRequest";
			definition = "Transaction suspended. Because the suspension period is finished, the cancellation or confirmation of instructions is required.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingSettlementCode.mmObject();
			codeName = "CANR";
		}
	};
	/**
	 * Payment for a buy of securities was received after the cut-off time for
	 * completing the settlement on a same day basis.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode
	 * PendingFailingSettlementCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MLAT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MoneyTooLateForSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment for a buy of securities was received after the cut-off time for completing the settlement on a same day basis."
	 * </li>
	 * </ul>
	 */
	public static final PendingFailingSettlementCode MoneyTooLateForSettlement = new PendingFailingSettlementCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MoneyTooLateForSettlement";
			definition = "Payment for a buy of securities was received after the cut-off time for completing the settlement on a same day basis.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingSettlementCode.mmObject();
			codeName = "MLAT";
		}
	};
	/**
	 * Securities are stolen, in dispute, and under objection.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode
	 * PendingFailingSettlementCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OBJT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderObjection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Securities are stolen, in dispute, and under objection."</li>
	 * </ul>
	 */
	public static final PendingFailingSettlementCode UnderObjection = new PendingFailingSettlementCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnderObjection";
			definition = "Securities are stolen, in dispute, and under objection.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingSettlementCode.mmObject();
			codeName = "OBJT";
		}
	};
	/**
	 * Awaiting documents or endorsements from the counterparty.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode
	 * PendingFailingSettlementCode}</li>
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
	public static final PendingFailingSettlementCode AwaitingDocumentsOrEndorsementsFromCounterparty = new PendingFailingSettlementCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AwaitingDocumentsOrEndorsementsFromCounterparty";
			definition = "Awaiting documents or endorsements from the counterparty.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingSettlementCode.mmObject();
			codeName = "DOCC";
		}
	};
	/**
	 * Account is blocked, so no instruction can settle.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode
	 * PendingFailingSettlementCode}</li>
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
	 * definition} = "Account is blocked, so no instruction can settle."</li>
	 * </ul>
	 */
	public static final PendingFailingSettlementCode AccountBlocked = new PendingFailingSettlementCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccountBlocked";
			definition = "Account is blocked, so no instruction can settle.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingSettlementCode.mmObject();
			codeName = "BLOC";
		}
	};
	/**
	 * Enquiry/chaser sent to the agent or depository.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode
	 * PendingFailingSettlementCode}</li>
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
	 * definition} = "Enquiry/chaser sent to the agent or depository."</li>
	 * </ul>
	 */
	public static final PendingFailingSettlementCode EnquirySent = new PendingFailingSettlementCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EnquirySent";
			definition = "Enquiry/chaser sent to the agent or depository.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingSettlementCode.mmObject();
			codeName = "CHAS";
		}
	};
	/**
	 * Securities are new issues, and not yet available/tradeable.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode
	 * PendingFailingSettlementCode}</li>
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
	 * "Securities are new issues, and not yet available/tradeable."</li>
	 * </ul>
	 */
	public static final PendingFailingSettlementCode NewIssues = new PendingFailingSettlementCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NewIssues";
			definition = "Securities are new issues, and not yet available/tradeable.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingSettlementCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode
	 * PendingFailingSettlementCode}</li>
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
	public static final PendingFailingSettlementCode CounterpartyInsufficientSecurities = new PendingFailingSettlementCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CounterpartyInsufficientSecurities";
			definition = "Insufficient deliverable securities in the counterparty's account, or counterparty does not hold the securities.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingSettlementCode.mmObject();
			codeName = "CLAC";
		}
	};
	/**
	 * Trade will settle in partials.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode
	 * PendingFailingSettlementCode}</li>
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
	public static final PendingFailingSettlementCode TradeSettlesInPartials = new PendingFailingSettlementCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradeSettlesInPartials";
			definition = "Trade will settle in partials.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingSettlementCode.mmObject();
			codeName = "PART";
		}
	};
	/**
	 * Insufficient money in counterparty's account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode
	 * PendingFailingSettlementCode}</li>
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
	 * definition} = "Insufficient money in counterparty's account."</li>
	 * </ul>
	 */
	public static final PendingFailingSettlementCode CounterpartyInsufficientMoney = new PendingFailingSettlementCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CounterpartyInsufficientMoney";
			definition = "Insufficient money in counterparty's account.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingSettlementCode.mmObject();
			codeName = "CMON";
		}
	};
	/**
	 * Securities are not deliverable as they are pledged as collateral.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode
	 * PendingFailingSettlementCode}</li>
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
	public static final PendingFailingSettlementCode SecuritiesPledgedAsCollateral = new PendingFailingSettlementCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesPledgedAsCollateral";
			definition = "Securities are not deliverable as they are pledged as collateral.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingSettlementCode.mmObject();
			codeName = "COLL";
		}
	};
	/**
	 * Deposit of shares for the issuance of a depositary receipt has been
	 * refused. The allotment for depositary receipts granted by the issuer
	 * would be exceeded by the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode
	 * PendingFailingSettlementCode}</li>
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
	 * "Deposit of shares for the issuance of a depositary receipt has been refused. The allotment for depositary receipts granted by the issuer would be exceeded by the transaction."
	 * </li>
	 * </ul>
	 */
	public static final PendingFailingSettlementCode RefusedDepositForIssueOfDepositaryReceipts = new PendingFailingSettlementCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RefusedDepositForIssueOfDepositaryReceipts";
			definition = "Deposit of shares for the issuance of a depositary receipt has been refused. The allotment for depositary receipts granted by the issuer would be exceeded by the transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingSettlementCode.mmObject();
			codeName = "DEPO";
		}
	};
	/**
	 * Insufficient deliverable securities in your account, as maximum foreign
	 * limit has been reached.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode
	 * PendingFailingSettlementCode}</li>
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
	 * "Insufficient deliverable securities in your account, as maximum foreign limit has been reached."
	 * </li>
	 * </ul>
	 */
	public static final PendingFailingSettlementCode MaximumForeignLimitReached = new PendingFailingSettlementCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaximumForeignLimitReached";
			definition = "Insufficient deliverable securities in your account, as maximum foreign limit has been reached.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingSettlementCode.mmObject();
			codeName = "FLIM";
		}
	};
	/**
	 * A foreign exchange instruction from you is missing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode
	 * PendingFailingSettlementCode}</li>
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
	 * definition} = "A foreign exchange instruction from you is missing."</li>
	 * </ul>
	 */
	public static final PendingFailingSettlementCode NoForeignExchangeInstruction = new PendingFailingSettlementCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NoForeignExchangeInstruction";
			definition = "A foreign exchange instruction from you is missing.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingSettlementCode.mmObject();
			codeName = "NOFX";
		}
	};
	/**
	 * Securities require income adjustment, ie, dividend or interest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode
	 * PendingFailingSettlementCode}</li>
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
	 * "Securities require income adjustment, ie, dividend or interest."</li>
	 * </ul>
	 */
	public static final PendingFailingSettlementCode IncomeAdjustementRequired = new PendingFailingSettlementCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IncomeAdjustementRequired";
			definition = "Securities require income adjustment, ie, dividend or interest.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingSettlementCode.mmObject();
			codeName = "INCA";
		}
	};
	/**
	 * Linked instruction is pending/failing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode
	 * PendingFailingSettlementCode}</li>
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
	 * definition} = "Linked instruction is pending/failing."</li>
	 * </ul>
	 */
	public static final PendingFailingSettlementCode PendingLinkedInstruction = new PendingFailingSettlementCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PendingLinkedInstruction";
			definition = "Linked instruction is pending/failing.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingSettlementCode.mmObject();
			codeName = "LINK";
		}
	};
	/**
	 * A buy-in procedure has started on the market, on your behalf, if your
	 * instruction is a receipt, or on behalf of the counterparty if the
	 * instruction is a delivery.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode
	 * PendingFailingSettlementCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BYIY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyInProcedure"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A buy-in procedure has started on the market, on your behalf, if your instruction is a receipt, or on behalf of the counterparty if the instruction is a delivery."
	 * </li>
	 * </ul>
	 */
	public static final PendingFailingSettlementCode BuyInProcedure = new PendingFailingSettlementCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BuyInProcedure";
			definition = "A buy-in procedure has started on the market, on your behalf, if your instruction is a receipt, or on behalf of the counterparty if the instruction is a delivery.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingSettlementCode.mmObject();
			codeName = "BYIY";
		}
	};
	/**
	 * Awaiting securities from a corporate action issue or other procedure(s),
	 * eg, conversion, dematerialisation, exchange, registration, stamping, and
	 * splitting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode
	 * PendingFailingSettlementCode}</li>
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
	 * "Awaiting securities from a corporate action issue or other procedure(s), eg, conversion, dematerialisation, exchange, registration, stamping, and splitting."
	 * </li>
	 * </ul>
	 */
	public static final PendingFailingSettlementCode AwaitingSecurities = new PendingFailingSettlementCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AwaitingSecurities";
			definition = "Awaiting securities from a corporate action issue or other procedure(s), eg, conversion, dematerialisation, exchange, registration, stamping, and splitting.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingSettlementCode.mmObject();
			codeName = "CAIS";
		}
	};
	/**
	 * Insufficient deliverable securities in your account as securities are
	 * loaned out.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode
	 * PendingFailingSettlementCode}</li>
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
	 * "Insufficient deliverable securities in your account as securities are loaned out."
	 * </li>
	 * </ul>
	 */
	public static final PendingFailingSettlementCode SecuritiesLoanedOut = new PendingFailingSettlementCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesLoanedOut";
			definition = "Insufficient deliverable securities in your account as securities are loaned out.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingSettlementCode.mmObject();
			codeName = "LALO";
		}
	};
	/**
	 * Insufficient money in your account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode
	 * PendingFailingSettlementCode}</li>
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
	public static final PendingFailingSettlementCode InsufficientMoney = new PendingFailingSettlementCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InsufficientMoney";
			definition = "Insufficient money in your account.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingSettlementCode.mmObject();
			codeName = "MONY";
		}
	};
	/**
	 * Settlement confirmation has not yet been received.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode
	 * PendingFailingSettlementCode}</li>
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
	 * definition} = "Settlement confirmation has not yet been received."</li>
	 * </ul>
	 */
	public static final PendingFailingSettlementCode ConfirmationNotReceived = new PendingFailingSettlementCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConfirmationNotReceived";
			definition = "Settlement confirmation has not yet been received.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingSettlementCode.mmObject();
			codeName = "NCON";
		}
	};
	/**
	 * Not enough collateral in your account to execute the instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode
	 * PendingFailingSettlementCode}</li>
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
	 * "Not enough collateral in your account to execute the instruction."</li>
	 * </ul>
	 */
	public static final PendingFailingSettlementCode CollateralShortage = new PendingFailingSettlementCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CollateralShortage";
			definition = "Not enough collateral in your account to execute the instruction.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingSettlementCode.mmObject();
			codeName = "YCOL";
		}
	};
	/**
	 * Delivery/receipt is refused because the physical securities are not in
	 * good order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode
	 * PendingFailingSettlementCode}</li>
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
	 * "Delivery/receipt is refused because the physical securities are not in good order."
	 * </li>
	 * </ul>
	 */
	public static final PendingFailingSettlementCode NotInGoodOrder = new PendingFailingSettlementCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotInGoodOrder";
			definition = "Delivery/receipt is refused because the physical securities are not in good order.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingSettlementCode.mmObject();
			codeName = "REFS";
		}
	};
	/**
	 * Instruction is failing since stamp duty information is missing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode
	 * PendingFailingSettlementCode}</li>
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
	 * "Instruction is failing since stamp duty information is missing."</li>
	 * </ul>
	 */
	public static final PendingFailingSettlementCode LackOfStampDutyInformation = new PendingFailingSettlementCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LackOfStampDutyInformation";
			definition = "Instruction is failing since stamp duty information is missing.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingSettlementCode.mmObject();
			codeName = "SDUT";
		}
	};
	/**
	 * Your instruction is confirmed in the local market, but is ready for
	 * settlement at the next settlement cycle.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode
	 * PendingFailingSettlementCode}</li>
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
	 * "Your instruction is confirmed in the local market, but is ready for settlement at the next settlement cycle."
	 * </li>
	 * </ul>
	 */
	public static final PendingFailingSettlementCode AwaitingNextSettlementCycle = new PendingFailingSettlementCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AwaitingNextSettlementCycle";
			definition = "Your instruction is confirmed in the local market, but is ready for settlement at the next settlement cycle.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingSettlementCode.mmObject();
			codeName = "CYCL";
		}
	};
	/**
	 * Processing batch differs in the counterparty's instruction, eg, day
	 * time/real time vs overnight.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode
	 * PendingFailingSettlementCode}</li>
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
	 * "Processing batch differs in the counterparty's instruction, eg, day time/real time vs overnight."
	 * </li>
	 * </ul>
	 */
	public static final PendingFailingSettlementCode ProcessingBatchDifference = new PendingFailingSettlementCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProcessingBatchDifference";
			definition = "Processing batch differs in the counterparty's instruction, eg, day time/real time vs overnight.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingSettlementCode.mmObject();
			codeName = "BATC";
		}
	};
	/**
	 * Guaranteed delivery indicator differs in the counterparty's instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode
	 * PendingFailingSettlementCode}</li>
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
	public static final PendingFailingSettlementCode GuaranteedDeliveryIndicatorDifference = new PendingFailingSettlementCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GuaranteedDeliveryIndicatorDifference";
			definition = "Guaranteed delivery indicator differs in the counterparty's instruction.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingSettlementCode.mmObject();
			codeName = "GUAD";
		}
	};
	/**
	 * Instruction is a preadvice, ie, matching only.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode
	 * PendingFailingSettlementCode}</li>
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
	 * definition} = "Instruction is a preadvice, ie, matching only."</li>
	 * </ul>
	 */
	public static final PendingFailingSettlementCode PreadviceInstructed = new PendingFailingSettlementCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PreadviceInstructed";
			definition = "Instruction is a preadvice, ie, matching only.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingSettlementCode.mmObject();
			codeName = "PREA";
		}
	};
	/**
	 * Securities are in global form.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode
	 * PendingFailingSettlementCode}</li>
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
	 * definition} = "Securities are in global form."</li>
	 * </ul>
	 */
	public static final PendingFailingSettlementCode GlobalFormSecurities = new PendingFailingSettlementCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GlobalFormSecurities";
			definition = "Securities are in global form.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingSettlementCode.mmObject();
			codeName = "GLOB";
		}
	};
	/**
	 * Counterparty is in receivership, ie, a form of bankruptcy.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode
	 * PendingFailingSettlementCode}</li>
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
	 * "Counterparty is in receivership, ie, a  form of bankruptcy."</li>
	 * </ul>
	 */
	public static final PendingFailingSettlementCode CounterpartyInReceivership = new PendingFailingSettlementCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CounterpartyInReceivership";
			definition = "Counterparty is in receivership, ie, a  form of bankruptcy.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingSettlementCode.mmObject();
			codeName = "CPEC";
		}
	};
	/**
	 * Amount is not a multiple of an existing settlement amount lot for the
	 * instructed financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlementCode
	 * PendingFailingSettlementCode}</li>
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
	 * "Amount is not a multiple of an existing settlement amount lot for the instructed financial instrument."
	 * </li>
	 * </ul>
	 */
	public static final PendingFailingSettlementCode MultipleSettlementAmount = new PendingFailingSettlementCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MultipleSettlementAmount";
			definition = "Amount is not a multiple of an existing settlement amount lot for the instructed financial instrument.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingSettlementCode.mmObject();
			codeName = "MUNO";
		}
	};
	final static private LinkedHashMap<String, PendingFailingSettlementCode> codesByName = new LinkedHashMap<>();

	protected PendingFailingSettlementCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("AWMO");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PendingFailingSettlementCode";
				definition = "Specifies the reason the transaction/instruction is pending failing settlement, and the settlement at the instruction settlement date is no longer possible.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PendingFailingSettlementCode.AwaitingMoney, com.tools20022.repository.codeset.PendingFailingSettlementCode.AwaitingSecuritiesFromCounterparty,
						com.tools20022.repository.codeset.PendingFailingSettlementCode.AwaitingOtherTransaction, com.tools20022.repository.codeset.PendingFailingSettlementCode.AwaitingDocumentsOrEndorsementsFromYou,
						com.tools20022.repository.codeset.PendingFailingSettlementCode.CounterpartyTooLateForSettlement, com.tools20022.repository.codeset.PendingFailingSettlementCode.WrongCertificateNumbers,
						com.tools20022.repository.codeset.PendingFailingSettlementCode.MinimumSettlementAmount, com.tools20022.repository.codeset.PendingFailingSettlementCode.PhysicalDeliveryDelay,
						com.tools20022.repository.codeset.PendingFailingSettlementCode.SecuritiesBlocked, com.tools20022.repository.codeset.PendingFailingSettlementCode.CounterpartyReturnedSecurities,
						com.tools20022.repository.codeset.PendingFailingSettlementCode.ConfirmationDiscrepancy, com.tools20022.repository.codeset.PendingFailingSettlementCode.BeneficialOwnershipDisagreement,
						com.tools20022.repository.codeset.PendingFailingSettlementCode.LackOfSecurities, com.tools20022.repository.codeset.PendingFailingSettlementCode.TooLateForSettlement,
						com.tools20022.repository.codeset.PendingFailingSettlementCode.CancellationConfirmationRequest, com.tools20022.repository.codeset.PendingFailingSettlementCode.MoneyTooLateForSettlement,
						com.tools20022.repository.codeset.PendingFailingSettlementCode.UnderObjection, com.tools20022.repository.codeset.PendingFailingSettlementCode.AwaitingDocumentsOrEndorsementsFromCounterparty,
						com.tools20022.repository.codeset.PendingFailingSettlementCode.AccountBlocked, com.tools20022.repository.codeset.PendingFailingSettlementCode.EnquirySent,
						com.tools20022.repository.codeset.PendingFailingSettlementCode.NewIssues, com.tools20022.repository.codeset.PendingFailingSettlementCode.CounterpartyInsufficientSecurities,
						com.tools20022.repository.codeset.PendingFailingSettlementCode.TradeSettlesInPartials, com.tools20022.repository.codeset.PendingFailingSettlementCode.CounterpartyInsufficientMoney,
						com.tools20022.repository.codeset.PendingFailingSettlementCode.SecuritiesPledgedAsCollateral, com.tools20022.repository.codeset.PendingFailingSettlementCode.RefusedDepositForIssueOfDepositaryReceipts,
						com.tools20022.repository.codeset.PendingFailingSettlementCode.MaximumForeignLimitReached, com.tools20022.repository.codeset.PendingFailingSettlementCode.NoForeignExchangeInstruction,
						com.tools20022.repository.codeset.PendingFailingSettlementCode.IncomeAdjustementRequired, com.tools20022.repository.codeset.PendingFailingSettlementCode.PendingLinkedInstruction,
						com.tools20022.repository.codeset.PendingFailingSettlementCode.BuyInProcedure, com.tools20022.repository.codeset.PendingFailingSettlementCode.AwaitingSecurities,
						com.tools20022.repository.codeset.PendingFailingSettlementCode.SecuritiesLoanedOut, com.tools20022.repository.codeset.PendingFailingSettlementCode.InsufficientMoney,
						com.tools20022.repository.codeset.PendingFailingSettlementCode.ConfirmationNotReceived, com.tools20022.repository.codeset.PendingFailingSettlementCode.CollateralShortage,
						com.tools20022.repository.codeset.PendingFailingSettlementCode.NotInGoodOrder, com.tools20022.repository.codeset.PendingFailingSettlementCode.LackOfStampDutyInformation,
						com.tools20022.repository.codeset.PendingFailingSettlementCode.AwaitingNextSettlementCycle, com.tools20022.repository.codeset.PendingFailingSettlementCode.ProcessingBatchDifference,
						com.tools20022.repository.codeset.PendingFailingSettlementCode.GuaranteedDeliveryIndicatorDifference, com.tools20022.repository.codeset.PendingFailingSettlementCode.PreadviceInstructed,
						com.tools20022.repository.codeset.PendingFailingSettlementCode.GlobalFormSecurities, com.tools20022.repository.codeset.PendingFailingSettlementCode.CounterpartyInReceivership,
						com.tools20022.repository.codeset.PendingFailingSettlementCode.MultipleSettlementAmount);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AwaitingMoney.getCodeName().get(), AwaitingMoney);
		codesByName.put(AwaitingSecuritiesFromCounterparty.getCodeName().get(), AwaitingSecuritiesFromCounterparty);
		codesByName.put(AwaitingOtherTransaction.getCodeName().get(), AwaitingOtherTransaction);
		codesByName.put(AwaitingDocumentsOrEndorsementsFromYou.getCodeName().get(), AwaitingDocumentsOrEndorsementsFromYou);
		codesByName.put(CounterpartyTooLateForSettlement.getCodeName().get(), CounterpartyTooLateForSettlement);
		codesByName.put(WrongCertificateNumbers.getCodeName().get(), WrongCertificateNumbers);
		codesByName.put(MinimumSettlementAmount.getCodeName().get(), MinimumSettlementAmount);
		codesByName.put(PhysicalDeliveryDelay.getCodeName().get(), PhysicalDeliveryDelay);
		codesByName.put(SecuritiesBlocked.getCodeName().get(), SecuritiesBlocked);
		codesByName.put(CounterpartyReturnedSecurities.getCodeName().get(), CounterpartyReturnedSecurities);
		codesByName.put(ConfirmationDiscrepancy.getCodeName().get(), ConfirmationDiscrepancy);
		codesByName.put(BeneficialOwnershipDisagreement.getCodeName().get(), BeneficialOwnershipDisagreement);
		codesByName.put(LackOfSecurities.getCodeName().get(), LackOfSecurities);
		codesByName.put(TooLateForSettlement.getCodeName().get(), TooLateForSettlement);
		codesByName.put(CancellationConfirmationRequest.getCodeName().get(), CancellationConfirmationRequest);
		codesByName.put(MoneyTooLateForSettlement.getCodeName().get(), MoneyTooLateForSettlement);
		codesByName.put(UnderObjection.getCodeName().get(), UnderObjection);
		codesByName.put(AwaitingDocumentsOrEndorsementsFromCounterparty.getCodeName().get(), AwaitingDocumentsOrEndorsementsFromCounterparty);
		codesByName.put(AccountBlocked.getCodeName().get(), AccountBlocked);
		codesByName.put(EnquirySent.getCodeName().get(), EnquirySent);
		codesByName.put(NewIssues.getCodeName().get(), NewIssues);
		codesByName.put(CounterpartyInsufficientSecurities.getCodeName().get(), CounterpartyInsufficientSecurities);
		codesByName.put(TradeSettlesInPartials.getCodeName().get(), TradeSettlesInPartials);
		codesByName.put(CounterpartyInsufficientMoney.getCodeName().get(), CounterpartyInsufficientMoney);
		codesByName.put(SecuritiesPledgedAsCollateral.getCodeName().get(), SecuritiesPledgedAsCollateral);
		codesByName.put(RefusedDepositForIssueOfDepositaryReceipts.getCodeName().get(), RefusedDepositForIssueOfDepositaryReceipts);
		codesByName.put(MaximumForeignLimitReached.getCodeName().get(), MaximumForeignLimitReached);
		codesByName.put(NoForeignExchangeInstruction.getCodeName().get(), NoForeignExchangeInstruction);
		codesByName.put(IncomeAdjustementRequired.getCodeName().get(), IncomeAdjustementRequired);
		codesByName.put(PendingLinkedInstruction.getCodeName().get(), PendingLinkedInstruction);
		codesByName.put(BuyInProcedure.getCodeName().get(), BuyInProcedure);
		codesByName.put(AwaitingSecurities.getCodeName().get(), AwaitingSecurities);
		codesByName.put(SecuritiesLoanedOut.getCodeName().get(), SecuritiesLoanedOut);
		codesByName.put(InsufficientMoney.getCodeName().get(), InsufficientMoney);
		codesByName.put(ConfirmationNotReceived.getCodeName().get(), ConfirmationNotReceived);
		codesByName.put(CollateralShortage.getCodeName().get(), CollateralShortage);
		codesByName.put(NotInGoodOrder.getCodeName().get(), NotInGoodOrder);
		codesByName.put(LackOfStampDutyInformation.getCodeName().get(), LackOfStampDutyInformation);
		codesByName.put(AwaitingNextSettlementCycle.getCodeName().get(), AwaitingNextSettlementCycle);
		codesByName.put(ProcessingBatchDifference.getCodeName().get(), ProcessingBatchDifference);
		codesByName.put(GuaranteedDeliveryIndicatorDifference.getCodeName().get(), GuaranteedDeliveryIndicatorDifference);
		codesByName.put(PreadviceInstructed.getCodeName().get(), PreadviceInstructed);
		codesByName.put(GlobalFormSecurities.getCodeName().get(), GlobalFormSecurities);
		codesByName.put(CounterpartyInReceivership.getCodeName().get(), CounterpartyInReceivership);
		codesByName.put(MultipleSettlementAmount.getCodeName().get(), MultipleSettlementAmount);
	}

	public static PendingFailingSettlementCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PendingFailingSettlementCode[] values() {
		PendingFailingSettlementCode[] values = new PendingFailingSettlementCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PendingFailingSettlementCode> {
		@Override
		public PendingFailingSettlementCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PendingFailingSettlementCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}