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
 * Represents a specific market trading session. It is used to identify a
 * portion of the session where the execution might take place ("after market",
 * "pre-market"). It is used to support order routing, quoting, and trade and
 * market data reporting. For instance, orders can be routed to one or more
 * Trading Sessions. Examples of Trading Session usage may be to facilitate
 * extended hours trading, to differentiate between concurrent electronic and
 * open-outcry trading, or to differentiate block and/or oddlot trading. It is
 * used by Exchanges, ECN's, and ATS's.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeExecutionSessionCode#mmArchipelagoOpeningSession
 * TradeExecutionSessionCode.mmArchipelagoOpeningSession}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeExecutionSessionCode#mmArchipelagoCoreSession
 * TradeExecutionSessionCode.mmArchipelagoCoreSession}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeExecutionSessionCode#mmArchipelagoLateSession
 * TradeExecutionSessionCode.mmArchipelagoLateSession}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeExecutionSessionCode#mmChicagoBoardOptionsEarlySession
 * TradeExecutionSessionCode.mmChicagoBoardOptionsEarlySession}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeExecutionSessionCode#mmChicagoBoardOptionsRegularHours
 * TradeExecutionSessionCode.mmChicagoBoardOptionsRegularHours}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeExecutionSessionCode#mmNagoyaExchange
 * TradeExecutionSessionCode.mmNagoyaExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeExecutionSessionCode#mmOsakaExchange
 * TradeExecutionSessionCode.mmOsakaExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeExecutionSessionCode#mmTokyoSingleListedTrade
 * TradeExecutionSessionCode.mmTokyoSingleListedTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeExecutionSessionCode#mmTokyoClosingPriceTrade
 * TradeExecutionSessionCode.mmTokyoClosingPriceTrade}</li>
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
 * <li>"ACHO"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradeExecutionSessionCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Represents a specific market trading session. It is used to identify a portion of the session where the execution might take place (\"after market\", \"pre-market\").\nIt is used to support order routing, quoting, and trade and market data reporting. For instance, orders can be routed to one or more Trading Sessions. Examples of Trading Session usage may be to facilitate extended hours trading, to differentiate between concurrent electronic and open-outcry trading, or to differentiate block and/or oddlot trading.\nIt is used by Exchanges, ECN's, and ATS's."
 * </li>
 * </ul>
 */
public class TradeExecutionSessionCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Opening Session. 8:00 AM - 9:30 AM Eastern of the Archipelago Exchange
	 * (Pacific Stock Exchange).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeExecutionSessionCode
	 * TradeExecutionSessionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACHO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ArchipelagoOpeningSession"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Opening Session. 8:00 AM - 9:30 AM Eastern of the Archipelago Exchange (Pacific Stock Exchange)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmArchipelagoOpeningSession = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ArchipelagoOpeningSession";
			definition = "Opening Session. 8:00 AM - 9:30 AM Eastern of the Archipelago Exchange (Pacific Stock Exchange).";
			owner_lazy = () -> TradeExecutionSessionCode.mmObject();
			codeName = "ACHO";
		}
	};
	/**
	 * Core Trading Session. 9:30 AM - 4:00 PM Eastern of the Archipelago
	 * Exchange (Pacific Stock Exchange).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeExecutionSessionCode
	 * TradeExecutionSessionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACHC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ArchipelagoCoreSession"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Core Trading Session. 9:30 AM - 4:00 PM Eastern of the Archipelago Exchange (Pacific Stock Exchange)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmArchipelagoCoreSession = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ArchipelagoCoreSession";
			definition = "Core Trading Session. 9:30 AM - 4:00 PM Eastern of the Archipelago Exchange (Pacific Stock Exchange).";
			owner_lazy = () -> TradeExecutionSessionCode.mmObject();
			codeName = "ACHC";
		}
	};
	/**
	 * Late Trading Session. 4:00 PM - 8:00 PM Easternof the Archipelago
	 * Exchange (Pacific Stock Exchange).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeExecutionSessionCode
	 * TradeExecutionSessionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACHL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ArchipelagoLateSession"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Late Trading Session. 4:00 PM - 8:00 PM Easternof the Archipelago Exchange (Pacific Stock Exchange)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmArchipelagoLateSession = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ArchipelagoLateSession";
			definition = "Late Trading Session. 4:00 PM - 8:00 PM Easternof the Archipelago Exchange (Pacific Stock Exchange).";
			owner_lazy = () -> TradeExecutionSessionCode.mmObject();
			codeName = "ACHL";
		}
	};
	/**
	 * Early Morning Electronic Trading Session of the Chicago Board Options
	 * Exchange.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeExecutionSessionCode
	 * TradeExecutionSessionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WAM1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChicagoBoardOptionsEarlySession"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Early Morning Electronic Trading Session of the Chicago Board Options Exchange."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmChicagoBoardOptionsEarlySession = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ChicagoBoardOptionsEarlySession";
			definition = "Early Morning Electronic Trading Session of the Chicago Board Options Exchange.";
			owner_lazy = () -> TradeExecutionSessionCode.mmObject();
			codeName = "WAM1";
		}
	};
	/**
	 * Regular hours open outcry market of the Chicago Board Options Exchange.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeExecutionSessionCode
	 * TradeExecutionSessionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WMAI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChicagoBoardOptionsRegularHours"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Regular hours open outcry market of the Chicago Board Options Exchange."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmChicagoBoardOptionsRegularHours = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChicagoBoardOptionsRegularHours";
			definition = "Regular hours open outcry market of the Chicago Board Options Exchange.";
			owner_lazy = () -> TradeExecutionSessionCode.mmObject();
			codeName = "WMAI";
		}
	};
	/**
	 * An electronic communication system operated by Nagoya Securities
	 * Exchange.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeExecutionSessionCode
	 * TradeExecutionSessionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NNET"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NagoyaExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An electronic communication system operated by Nagoya Securities Exchange."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmNagoyaExchange = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NagoyaExchange";
			definition = "An electronic communication system operated by Nagoya Securities Exchange.";
			owner_lazy = () -> TradeExecutionSessionCode.mmObject();
			codeName = "NNET";
		}
	};
	/**
	 * An electronic communication system by which the Osaka Securities Exchange
	 * (OSE), OSE members (Securities companies) and investors are directly
	 * connected with each other via a multi-layered computer network.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeExecutionSessionCode
	 * TradeExecutionSessionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "JNET"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OsakaExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An electronic communication system by which the Osaka Securities Exchange (OSE), OSE members (Securities companies) and investors are directly connected with each other via a multi-layered computer network."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmOsakaExchange = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OsakaExchange";
			definition = "An electronic communication system by which the Osaka Securities Exchange (OSE), OSE members (Securities companies) and investors are directly connected with each other via a multi-layered computer network.";
			owner_lazy = () -> TradeExecutionSessionCode.mmObject();
			codeName = "JNET";
		}
	};
	/**
	 * An off hour trade session of Tokyo Stock Exchange (TSE) for TSE listed
	 * stocks only. For Single/List trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeExecutionSessionCode
	 * TradeExecutionSessionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TOS1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TokyoSingleListedTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An off hour trade session of Tokyo Stock Exchange (TSE) for TSE listed stocks only. For Single/List trade."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmTokyoSingleListedTrade = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TokyoSingleListedTrade";
			definition = "An off hour trade session of Tokyo Stock Exchange (TSE) for TSE listed stocks only. For Single/List trade.";
			owner_lazy = () -> TradeExecutionSessionCode.mmObject();
			codeName = "TOS1";
		}
	};
	/**
	 * An off hour trade session of Tokyo Stock Exchange (TSE) for TSE listed
	 * stocks only. For trade based on close price of regular trading session.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeExecutionSessionCode
	 * TradeExecutionSessionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TOS2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TokyoClosingPriceTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An off hour trade session of Tokyo Stock Exchange (TSE) for TSE listed stocks only. For trade based on close price of regular trading session."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmTokyoClosingPriceTrade = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TokyoClosingPriceTrade";
			definition = "An off hour trade session of Tokyo Stock Exchange (TSE) for TSE listed stocks only. For trade based on close price of regular trading session.";
			owner_lazy = () -> TradeExecutionSessionCode.mmObject();
			codeName = "TOS2";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("ACHO");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradeExecutionSessionCode";
				definition = "Represents a specific market trading session. It is used to identify a portion of the session where the execution might take place (\"after market\", \"pre-market\").\nIt is used to support order routing, quoting, and trade and market data reporting. For instance, orders can be routed to one or more Trading Sessions. Examples of Trading Session usage may be to facilitate extended hours trading, to differentiate between concurrent electronic and open-outcry trading, or to differentiate block and/or oddlot trading.\nIt is used by Exchanges, ECN's, and ATS's.";
				code_lazy = () -> Arrays.asList(TradeExecutionSessionCode.mmArchipelagoOpeningSession, TradeExecutionSessionCode.mmArchipelagoCoreSession, TradeExecutionSessionCode.mmArchipelagoLateSession,
						TradeExecutionSessionCode.mmChicagoBoardOptionsEarlySession, TradeExecutionSessionCode.mmChicagoBoardOptionsRegularHours, TradeExecutionSessionCode.mmNagoyaExchange, TradeExecutionSessionCode.mmOsakaExchange,
						TradeExecutionSessionCode.mmTokyoSingleListedTrade, TradeExecutionSessionCode.mmTokyoClosingPriceTrade);
			}
		});
		return mmObject_lazy.get();
	}
}