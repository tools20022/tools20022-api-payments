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
import com.tools20022.repository.codeset.UnmatchedStatusReasonCode.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode#NoMatch
 * UnmatchedStatusReasonCode.mmNoMatch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode#SettlementDate
 * UnmatchedStatusReasonCode.mmSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode#TransactionDirection
 * UnmatchedStatusReasonCode.mmTransactionDirection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode#SettlementPlace
 * UnmatchedStatusReasonCode.mmSettlementPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode#SettlementAmount
 * UnmatchedStatusReasonCode.mmSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode#DealPrice
 * UnmatchedStatusReasonCode.mmDealPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode#FinancialInstrumentQuantity
 * UnmatchedStatusReasonCode.mmFinancialInstrumentQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode#RepurchaseCallDelay
 * UnmatchedStatusReasonCode.mmRepurchaseCallDelay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode#SettlementTransaction
 * UnmatchedStatusReasonCode.mmSettlementTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode#FinancialInstrument
 * UnmatchedStatusReasonCode.mmFinancialInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode#VariableRateSupport
 * UnmatchedStatusReasonCode.mmVariableRateSupport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode#NotRecognised
 * UnmatchedStatusReasonCode.mmNotRecognised}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode#RepurchaseSpreadRate
 * UnmatchedStatusReasonCode.mmRepurchaseSpreadRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode#RepurchaseRate
 * UnmatchedStatusReasonCode.mmRepurchaseRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode#CounterpartyTooLateForMatching
 * UnmatchedStatusReasonCode.mmCounterpartyTooLateForMatching}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode#RepurchaseRateType
 * UnmatchedStatusReasonCode.mmRepurchaseRateType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode#RepurchaseAmount
 * UnmatchedStatusReasonCode.mmRepurchaseAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode#RepurchasePremiumAmount
 * UnmatchedStatusReasonCode.mmRepurchasePremiumAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode#PhysicalSettlement
 * UnmatchedStatusReasonCode.mmPhysicalSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode#CommonReference
 * UnmatchedStatusReasonCode.mmCommonReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode#PaymentCode
 * UnmatchedStatusReasonCode.mmPaymentCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode#PlaceOfTrade
 * UnmatchedStatusReasonCode.mmPlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode#Duplicate
 * UnmatchedStatusReasonCode.mmDuplicate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode#ForfeitRepurchaseAmount
 * UnmatchedStatusReasonCode.mmForfeitRepurchaseAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode#RegistrationDetails
 * UnmatchedStatusReasonCode.mmRegistrationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode#RTGSSystem
 * UnmatchedStatusReasonCode.mmRTGSSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode#IncorrectAgent
 * UnmatchedStatusReasonCode.mmIncorrectAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode#CounterpartyCancelled
 * UnmatchedStatusReasonCode.mmCounterpartyCancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode#ChargesAmount
 * UnmatchedStatusReasonCode.mmChargesAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode#BuyerOrSeller
 * UnmatchedStatusReasonCode.mmBuyerOrSeller}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode#CurrencySettlementAmount
 * UnmatchedStatusReasonCode.mmCurrencySettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode#NoMatchingStarted
 * UnmatchedStatusReasonCode.mmNoMatchingStarted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode#SafekeepingAccount
 * UnmatchedStatusReasonCode.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode#TradeDate
 * UnmatchedStatusReasonCode.mmTradeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode#TooLateForMatching
 * UnmatchedStatusReasonCode.mmTooLateForMatching}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode#ClosingDateTime
 * UnmatchedStatusReasonCode.mmClosingDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode#ReceivingOrDeliveringCustodian
 * UnmatchedStatusReasonCode.mmReceivingOrDeliveringCustodian}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode#Other
 * UnmatchedStatusReasonCode.mmOther}</li>
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
 * <li>"CMIS"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UnmatchedStatusReasonCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason the transaction, transfer or settlement instruction is unmatched."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class UnmatchedStatusReasonCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * No potential match has been found.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode
	 * UnmatchedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CMIS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoMatch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "No potential match has been found."</li>
	 * </ul>
	 */
	public static final UnmatchedStatusReasonCode NoMatch = new UnmatchedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NoMatch";
			definition = "No potential match has been found.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedStatusReasonCode.mmObject();
			codeName = "CMIS";
		}
	};
	/**
	 * Settlement date or transfer date does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode
	 * UnmatchedStatusReasonCode}</li>
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
	 * definition} = "Settlement date or transfer date does not match."</li>
	 * </ul>
	 */
	public static final UnmatchedStatusReasonCode SettlementDate = new UnmatchedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementDate";
			definition = "Settlement date or transfer date does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedStatusReasonCode.mmObject();
			codeName = "DDAT";
		}
	};
	/**
	 * Direction of transaction does not match: delivery instead of receipt or
	 * vice versa.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode
	 * UnmatchedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DELN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionDirection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Direction of transaction does not match: delivery instead of receipt or vice versa."
	 * </li>
	 * </ul>
	 */
	public static final UnmatchedStatusReasonCode TransactionDirection = new UnmatchedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransactionDirection";
			definition = "Direction of transaction does not match: delivery instead of receipt or vice versa.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedStatusReasonCode.mmObject();
			codeName = "DELN";
		}
	};
	/**
	 * Place of settlement does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode
	 * UnmatchedStatusReasonCode}</li>
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
	 * definition} = "Place of settlement does not match."</li>
	 * </ul>
	 */
	public static final UnmatchedStatusReasonCode SettlementPlace = new UnmatchedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementPlace";
			definition = "Place of settlement does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedStatusReasonCode.mmObject();
			codeName = "DEPT";
		}
	};
	/**
	 * Settlement amount does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode
	 * UnmatchedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DMON"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement amount does not match."</li>
	 * </ul>
	 */
	public static final UnmatchedStatusReasonCode SettlementAmount = new UnmatchedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementAmount";
			definition = "Settlement amount does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedStatusReasonCode.mmObject();
			codeName = "DMON";
		}
	};
	/**
	 * Deal price does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode
	 * UnmatchedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DDEA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DealPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Deal price does not match."</li>
	 * </ul>
	 */
	public static final UnmatchedStatusReasonCode DealPrice = new UnmatchedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DealPrice";
			definition = "Deal price does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedStatusReasonCode.mmObject();
			codeName = "DDEA";
		}
	};
	/**
	 * Financial instrument quantity does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode
	 * UnmatchedStatusReasonCode}</li>
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
	 * definition} = "Financial instrument quantity does not match."</li>
	 * </ul>
	 */
	public static final UnmatchedStatusReasonCode FinancialInstrumentQuantity = new UnmatchedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FinancialInstrumentQuantity";
			definition = "Financial instrument quantity does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedStatusReasonCode.mmObject();
			codeName = "DQUA";
		}
	};
	/**
	 * Repurchase call delay does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode
	 * UnmatchedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CADE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseCallDelay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Repurchase call delay does not match."</li>
	 * </ul>
	 */
	public static final UnmatchedStatusReasonCode RepurchaseCallDelay = new UnmatchedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RepurchaseCallDelay";
			definition = "Repurchase call delay does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedStatusReasonCode.mmObject();
			codeName = "CADE";
		}
	};
	/**
	 * Settlement transaction type does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode
	 * UnmatchedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SETR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement transaction type does not match."</li>
	 * </ul>
	 */
	public static final UnmatchedStatusReasonCode SettlementTransaction = new UnmatchedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementTransaction";
			definition = "Settlement transaction type does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedStatusReasonCode.mmObject();
			codeName = "SETR";
		}
	};
	/**
	 * Financial instrument identification does not match or a financial
	 * instrument attribute differs.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode
	 * UnmatchedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DSEC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial instrument identification does not match or a financial instrument attribute differs."
	 * </li>
	 * </ul>
	 */
	public static final UnmatchedStatusReasonCode FinancialInstrument = new UnmatchedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FinancialInstrument";
			definition = "Financial instrument identification does not match or a financial instrument attribute differs.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedStatusReasonCode.mmObject();
			codeName = "DSEC";
		}
	};
	/**
	 * Variable rate support does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode
	 * UnmatchedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VASU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariableRateSupport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Variable rate support does not match."</li>
	 * </ul>
	 */
	public static final UnmatchedStatusReasonCode VariableRateSupport = new UnmatchedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VariableRateSupport";
			definition = "Variable rate support does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedStatusReasonCode.mmObject();
			codeName = "VASU";
		}
	};
	/**
	 * Counterparty does not recognise the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode
	 * UnmatchedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DTRA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotRecognised"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Counterparty does not recognise the transaction."</li>
	 * </ul>
	 */
	public static final UnmatchedStatusReasonCode NotRecognised = new UnmatchedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotRecognised";
			definition = "Counterparty does not recognise the transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedStatusReasonCode.mmObject();
			codeName = "DTRA";
		}
	};
	/**
	 * Repurchase spread rate does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode
	 * UnmatchedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RSPR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseSpreadRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Repurchase spread rate does not match."</li>
	 * </ul>
	 */
	public static final UnmatchedStatusReasonCode RepurchaseSpreadRate = new UnmatchedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RepurchaseSpreadRate";
			definition = "Repurchase spread rate does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedStatusReasonCode.mmObject();
			codeName = "RSPR";
		}
	};
	/**
	 * Repurchase rate does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode
	 * UnmatchedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REPO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Repurchase rate does not match."</li>
	 * </ul>
	 */
	public static final UnmatchedStatusReasonCode RepurchaseRate = new UnmatchedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RepurchaseRate";
			definition = "Repurchase rate does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedStatusReasonCode.mmObject();
			codeName = "REPO";
		}
	};
	/**
	 * Counterparty's instruction was too late for matching.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode
	 * UnmatchedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLAT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyTooLateForMatching"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Counterparty's instruction was too late for matching."</li>
	 * </ul>
	 */
	public static final UnmatchedStatusReasonCode CounterpartyTooLateForMatching = new UnmatchedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CounterpartyTooLateForMatching";
			definition = "Counterparty's instruction was too late for matching.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedStatusReasonCode.mmObject();
			codeName = "CLAT";
		}
	};
	/**
	 * Repurchase rate type does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode
	 * UnmatchedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RERT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseRateType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Repurchase rate type does not match."</li>
	 * </ul>
	 */
	public static final UnmatchedStatusReasonCode RepurchaseRateType = new UnmatchedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RepurchaseRateType";
			definition = "Repurchase rate type does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedStatusReasonCode.mmObject();
			codeName = "RERT";
		}
	};
	/**
	 * Repurchase amount does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode
	 * UnmatchedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REPA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Repurchase amount does not match."</li>
	 * </ul>
	 */
	public static final UnmatchedStatusReasonCode RepurchaseAmount = new UnmatchedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RepurchaseAmount";
			definition = "Repurchase amount does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedStatusReasonCode.mmObject();
			codeName = "REPA";
		}
	};
	/**
	 * Repurchase premium amount does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode
	 * UnmatchedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REPP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchasePremiumAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Repurchase premium amount does not match."</li>
	 * </ul>
	 */
	public static final UnmatchedStatusReasonCode RepurchasePremiumAmount = new UnmatchedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RepurchasePremiumAmount";
			definition = "Repurchase premium amount does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedStatusReasonCode.mmObject();
			codeName = "REPP";
		}
	};
	/**
	 * Settlement does not match: counterparty's instruction is for physical
	 * settlement, your instruction is not, or vice versa.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode
	 * UnmatchedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PHYS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement does not match: counterparty's instruction is for physical settlement, your instruction is not, or vice versa."
	 * </li>
	 * </ul>
	 */
	public static final UnmatchedStatusReasonCode PhysicalSettlement = new UnmatchedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PhysicalSettlement";
			definition = "Settlement does not match: counterparty's instruction is for physical settlement, your instruction is not, or vice versa.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedStatusReasonCode.mmObject();
			codeName = "PHYS";
		}
	};
	/**
	 * Common reference does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode
	 * UnmatchedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IIND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommonReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Common reference does not match."</li>
	 * </ul>
	 */
	public static final UnmatchedStatusReasonCode CommonReference = new UnmatchedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CommonReference";
			definition = "Common reference does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedStatusReasonCode.mmObject();
			codeName = "IIND";
		}
	};
	/**
	 * Payment code does not match. The counterparty's instruction is for free
	 * settlement, and yours is for settlement against payment, or vice versa.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode
	 * UnmatchedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FRAP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment code does not match. The counterparty's instruction is for free settlement, and yours is for settlement against payment, or vice versa."
	 * </li>
	 * </ul>
	 */
	public static final UnmatchedStatusReasonCode PaymentCode = new UnmatchedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentCode";
			definition = "Payment code does not match. The counterparty's instruction is for free settlement, and yours is for settlement against payment, or vice versa.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedStatusReasonCode.mmObject();
			codeName = "FRAP";
		}
	};
	/**
	 * Place of trade does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode
	 * UnmatchedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PLCE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Place of trade does not match."</li>
	 * </ul>
	 */
	public static final UnmatchedStatusReasonCode PlaceOfTrade = new UnmatchedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PlaceOfTrade";
			definition = "Place of trade does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedStatusReasonCode.mmObject();
			codeName = "PLCE";
		}
	};
	/**
	 * Instruction has not been matched: it is a possible duplicate instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode
	 * UnmatchedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PODU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Duplicate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction has not been matched: it is a possible duplicate instruction."
	 * </li>
	 * </ul>
	 */
	public static final UnmatchedStatusReasonCode Duplicate = new UnmatchedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Duplicate";
			definition = "Instruction has not been matched: it is a possible duplicate instruction.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedStatusReasonCode.mmObject();
			codeName = "PODU";
		}
	};
	/**
	 * Repurchase forfeit amount does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode
	 * UnmatchedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FORF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForfeitRepurchaseAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Repurchase forfeit amount does not match."</li>
	 * </ul>
	 */
	public static final UnmatchedStatusReasonCode ForfeitRepurchaseAmount = new UnmatchedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ForfeitRepurchaseAmount";
			definition = "Repurchase forfeit amount does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedStatusReasonCode.mmObject();
			codeName = "FORF";
		}
	};
	/**
	 * Registration details do not match. A discrepancy exists in the
	 * registration details linked to the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode
	 * UnmatchedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REGD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Registration details do not match. A discrepancy exists in the registration details linked to the transaction."
	 * </li>
	 * </ul>
	 */
	public static final UnmatchedStatusReasonCode RegistrationDetails = new UnmatchedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RegistrationDetails";
			definition = "Registration details do not match. A discrepancy exists in the registration details linked to the transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedStatusReasonCode.mmObject();
			codeName = "REGD";
		}
	};
	/**
	 * RTGS system does not match. Counterparty indicates a settlement via RTGS
	 * system and you indicate non-RTGS settlement, or vice versa.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode
	 * UnmatchedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RTGS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RTGSSystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "RTGS system does not match. Counterparty indicates a settlement via RTGS system and you indicate non-RTGS settlement, or vice versa."
	 * </li>
	 * </ul>
	 */
	public static final UnmatchedStatusReasonCode RTGSSystem = new UnmatchedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RTGSSystem";
			definition = "RTGS system does not match. Counterparty indicates a settlement via RTGS system and you indicate non-RTGS settlement, or vice versa.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedStatusReasonCode.mmObject();
			codeName = "RTGS";
		}
	};
	/**
	 * Delivery or receiving agent does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode
	 * UnmatchedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ICAG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Delivery or receiving agent does not match."</li>
	 * </ul>
	 */
	public static final UnmatchedStatusReasonCode IncorrectAgent = new UnmatchedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IncorrectAgent";
			definition = "Delivery or receiving agent does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedStatusReasonCode.mmObject();
			codeName = "ICAG";
		}
	};
	/**
	 * Counterparty has cancelled the transaction/instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode
	 * UnmatchedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CPCA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyCancelled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Counterparty has cancelled the transaction/instruction."</li>
	 * </ul>
	 */
	public static final UnmatchedStatusReasonCode CounterpartyCancelled = new UnmatchedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CounterpartyCancelled";
			definition = "Counterparty has cancelled the transaction/instruction.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedStatusReasonCode.mmObject();
			codeName = "CPCA";
		}
	};
	/**
	 * Charges amount does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode
	 * UnmatchedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CHAR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargesAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Charges amount does not match."</li>
	 * </ul>
	 */
	public static final UnmatchedStatusReasonCode ChargesAmount = new UnmatchedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ChargesAmount";
			definition = "Charges amount does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedStatusReasonCode.mmObject();
			codeName = "CHAR";
		}
	};
	/**
	 * Buyer (receiver) or seller (deliverer) does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode
	 * UnmatchedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IEXE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyerOrSeller"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Buyer (receiver) or seller (deliverer) does not match."</li>
	 * </ul>
	 */
	public static final UnmatchedStatusReasonCode BuyerOrSeller = new UnmatchedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BuyerOrSeller";
			definition = "Buyer (receiver) or seller (deliverer) does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedStatusReasonCode.mmObject();
			codeName = "IEXE";
		}
	};
	/**
	 * Currency of settlement amount does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode
	 * UnmatchedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NCRR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencySettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency of settlement amount does not match."</li>
	 * </ul>
	 */
	public static final UnmatchedStatusReasonCode CurrencySettlementAmount = new UnmatchedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CurrencySettlementAmount";
			definition = "Currency of settlement amount does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedStatusReasonCode.mmObject();
			codeName = "NCRR";
		}
	};
	/**
	 * Matching process has not yet started.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode
	 * UnmatchedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NMAS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoMatchingStarted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Matching process has not yet started."</li>
	 * </ul>
	 */
	public static final UnmatchedStatusReasonCode NoMatchingStarted = new UnmatchedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NoMatchingStarted";
			definition = "Matching process has not yet started.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedStatusReasonCode.mmObject();
			codeName = "NMAS";
		}
	};
	/**
	 * Safekeeping account used as a matching criteria on the market concerned
	 * does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode
	 * UnmatchedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SAFE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Safekeeping account used as a matching criteria on the market concerned does not match."
	 * </li>
	 * </ul>
	 */
	public static final UnmatchedStatusReasonCode SafekeepingAccount = new UnmatchedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SafekeepingAccount";
			definition = "Safekeeping account used as a matching criteria on the market concerned does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedStatusReasonCode.mmObject();
			codeName = "SAFE";
		}
	};
	/**
	 * Trade date does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode
	 * UnmatchedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DTRD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade date does not match."</li>
	 * </ul>
	 */
	public static final UnmatchedStatusReasonCode TradeDate = new UnmatchedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradeDate";
			definition = "Trade date does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedStatusReasonCode.mmObject();
			codeName = "DTRD";
		}
	};
	/**
	 * Instruction received too late for matching.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode
	 * UnmatchedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LATE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TooLateForMatching"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction received too late for matching."</li>
	 * </ul>
	 */
	public static final UnmatchedStatusReasonCode TooLateForMatching = new UnmatchedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TooLateForMatching";
			definition = "Instruction received too late for matching.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedStatusReasonCode.mmObject();
			codeName = "LATE";
		}
	};
	/**
	 * Closing date/time does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode
	 * UnmatchedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TERM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosingDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Closing date/time does not match."</li>
	 * </ul>
	 */
	public static final UnmatchedStatusReasonCode ClosingDateTime = new UnmatchedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClosingDateTime";
			definition = "Closing date/time does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedStatusReasonCode.mmObject();
			codeName = "TERM";
		}
	};
	/**
	 * Delivering or receiving custodian does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode
	 * UnmatchedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ICUS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingOrDeliveringCustodian"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Delivering or receiving custodian does not match."</li>
	 * </ul>
	 */
	public static final UnmatchedStatusReasonCode ReceivingOrDeliveringCustodian = new UnmatchedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReceivingOrDeliveringCustodian";
			definition = "Delivering or receiving custodian does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedStatusReasonCode.mmObject();
			codeName = "ICUS";
		}
	};
	/**
	 * Another unmatched reason.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode
	 * UnmatchedStatusReasonCode}</li>
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
	 * definition} = "Another unmatched reason."</li>
	 * </ul>
	 */
	public static final UnmatchedStatusReasonCode Other = new UnmatchedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Other";
			definition = "Another unmatched reason.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedStatusReasonCode.mmObject();
			codeName = "OTHR";
		}
	};
	final static private LinkedHashMap<String, UnmatchedStatusReasonCode> codesByName = new LinkedHashMap<>();

	protected UnmatchedStatusReasonCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("CMIS");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UnmatchedStatusReasonCode";
				definition = "Specifies the reason the transaction, transfer or settlement instruction is unmatched.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.UnmatchedStatusReasonCode.NoMatch, com.tools20022.repository.codeset.UnmatchedStatusReasonCode.SettlementDate,
						com.tools20022.repository.codeset.UnmatchedStatusReasonCode.TransactionDirection, com.tools20022.repository.codeset.UnmatchedStatusReasonCode.SettlementPlace,
						com.tools20022.repository.codeset.UnmatchedStatusReasonCode.SettlementAmount, com.tools20022.repository.codeset.UnmatchedStatusReasonCode.DealPrice,
						com.tools20022.repository.codeset.UnmatchedStatusReasonCode.FinancialInstrumentQuantity, com.tools20022.repository.codeset.UnmatchedStatusReasonCode.RepurchaseCallDelay,
						com.tools20022.repository.codeset.UnmatchedStatusReasonCode.SettlementTransaction, com.tools20022.repository.codeset.UnmatchedStatusReasonCode.FinancialInstrument,
						com.tools20022.repository.codeset.UnmatchedStatusReasonCode.VariableRateSupport, com.tools20022.repository.codeset.UnmatchedStatusReasonCode.NotRecognised,
						com.tools20022.repository.codeset.UnmatchedStatusReasonCode.RepurchaseSpreadRate, com.tools20022.repository.codeset.UnmatchedStatusReasonCode.RepurchaseRate,
						com.tools20022.repository.codeset.UnmatchedStatusReasonCode.CounterpartyTooLateForMatching, com.tools20022.repository.codeset.UnmatchedStatusReasonCode.RepurchaseRateType,
						com.tools20022.repository.codeset.UnmatchedStatusReasonCode.RepurchaseAmount, com.tools20022.repository.codeset.UnmatchedStatusReasonCode.RepurchasePremiumAmount,
						com.tools20022.repository.codeset.UnmatchedStatusReasonCode.PhysicalSettlement, com.tools20022.repository.codeset.UnmatchedStatusReasonCode.CommonReference,
						com.tools20022.repository.codeset.UnmatchedStatusReasonCode.PaymentCode, com.tools20022.repository.codeset.UnmatchedStatusReasonCode.PlaceOfTrade,
						com.tools20022.repository.codeset.UnmatchedStatusReasonCode.Duplicate, com.tools20022.repository.codeset.UnmatchedStatusReasonCode.ForfeitRepurchaseAmount,
						com.tools20022.repository.codeset.UnmatchedStatusReasonCode.RegistrationDetails, com.tools20022.repository.codeset.UnmatchedStatusReasonCode.RTGSSystem,
						com.tools20022.repository.codeset.UnmatchedStatusReasonCode.IncorrectAgent, com.tools20022.repository.codeset.UnmatchedStatusReasonCode.CounterpartyCancelled,
						com.tools20022.repository.codeset.UnmatchedStatusReasonCode.ChargesAmount, com.tools20022.repository.codeset.UnmatchedStatusReasonCode.BuyerOrSeller,
						com.tools20022.repository.codeset.UnmatchedStatusReasonCode.CurrencySettlementAmount, com.tools20022.repository.codeset.UnmatchedStatusReasonCode.NoMatchingStarted,
						com.tools20022.repository.codeset.UnmatchedStatusReasonCode.SafekeepingAccount, com.tools20022.repository.codeset.UnmatchedStatusReasonCode.TradeDate,
						com.tools20022.repository.codeset.UnmatchedStatusReasonCode.TooLateForMatching, com.tools20022.repository.codeset.UnmatchedStatusReasonCode.ClosingDateTime,
						com.tools20022.repository.codeset.UnmatchedStatusReasonCode.ReceivingOrDeliveringCustodian, com.tools20022.repository.codeset.UnmatchedStatusReasonCode.Other);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(NoMatch.getCodeName().get(), NoMatch);
		codesByName.put(SettlementDate.getCodeName().get(), SettlementDate);
		codesByName.put(TransactionDirection.getCodeName().get(), TransactionDirection);
		codesByName.put(SettlementPlace.getCodeName().get(), SettlementPlace);
		codesByName.put(SettlementAmount.getCodeName().get(), SettlementAmount);
		codesByName.put(DealPrice.getCodeName().get(), DealPrice);
		codesByName.put(FinancialInstrumentQuantity.getCodeName().get(), FinancialInstrumentQuantity);
		codesByName.put(RepurchaseCallDelay.getCodeName().get(), RepurchaseCallDelay);
		codesByName.put(SettlementTransaction.getCodeName().get(), SettlementTransaction);
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
		codesByName.put(Duplicate.getCodeName().get(), Duplicate);
		codesByName.put(ForfeitRepurchaseAmount.getCodeName().get(), ForfeitRepurchaseAmount);
		codesByName.put(RegistrationDetails.getCodeName().get(), RegistrationDetails);
		codesByName.put(RTGSSystem.getCodeName().get(), RTGSSystem);
		codesByName.put(IncorrectAgent.getCodeName().get(), IncorrectAgent);
		codesByName.put(CounterpartyCancelled.getCodeName().get(), CounterpartyCancelled);
		codesByName.put(ChargesAmount.getCodeName().get(), ChargesAmount);
		codesByName.put(BuyerOrSeller.getCodeName().get(), BuyerOrSeller);
		codesByName.put(CurrencySettlementAmount.getCodeName().get(), CurrencySettlementAmount);
		codesByName.put(NoMatchingStarted.getCodeName().get(), NoMatchingStarted);
		codesByName.put(SafekeepingAccount.getCodeName().get(), SafekeepingAccount);
		codesByName.put(TradeDate.getCodeName().get(), TradeDate);
		codesByName.put(TooLateForMatching.getCodeName().get(), TooLateForMatching);
		codesByName.put(ClosingDateTime.getCodeName().get(), ClosingDateTime);
		codesByName.put(ReceivingOrDeliveringCustodian.getCodeName().get(), ReceivingOrDeliveringCustodian);
		codesByName.put(Other.getCodeName().get(), Other);
	}

	public static UnmatchedStatusReasonCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static UnmatchedStatusReasonCode[] values() {
		UnmatchedStatusReasonCode[] values = new UnmatchedStatusReasonCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, UnmatchedStatusReasonCode> {
		@Override
		public UnmatchedStatusReasonCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(UnmatchedStatusReasonCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}