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

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.TradeTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of executed order.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeTypeCode#Basket
 * TradeTypeCode.Basket}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeTypeCode#Index
 * TradeTypeCode.Index}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeTypeCode#List
 * TradeTypeCode.List}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode#PreAllocation
 * TradeTypeCode.PreAllocation}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeTypeCode#Program
 * TradeTypeCode.Program}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeTypeCode#Trade
 * TradeTypeCode.Trade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode#BrokerToBroker
 * TradeTypeCode.BrokerToBroker}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeTypeCode#FundToFund
 * TradeTypeCode.FundToFund}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeTypeCode#RiskTrade
 * TradeTypeCode.RiskTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode#VWAPGuarantee
 * TradeTypeCode.VWAPGuarantee}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeTypeCode#Agency
 * TradeTypeCode.Agency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode#GuaranteedClose
 * TradeTypeCode.GuaranteedClose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode#OnOrderBookTrade
 * TradeTypeCode.OnOrderBookTrade}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeTypeCode#LinkedTrade
 * TradeTypeCode.LinkedTrade}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeTypeCode#TradeGiveUp
 * TradeTypeCode.TradeGiveUp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode#CorrectiveTrade
 * TradeTypeCode.CorrectiveTrade}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeTypeCode#BackUpTrade
 * TradeTypeCode.BackUpTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode#OffOrderBookTrade
 * TradeTypeCode.OffOrderBookTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode#EmployeeTradeReporting
 * TradeTypeCode.EmployeeTradeReporting}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeTypeCode#IPO
 * TradeTypeCode.IPO}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode#OfferingIssuingTrade
 * TradeTypeCode.OfferingIssuingTrade}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeTypeCode#Issuance
 * TradeTypeCode.Issuance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode#BondRepricing
 * TradeTypeCode.BondRepricing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode#BondSubstitution
 * TradeTypeCode.BondSubstitution}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeTypeCode#BondEnd
 * TradeTypeCode.BondEnd}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeTypeCode#BondStart
 * TradeTypeCode.BondStart}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode#LendingAndBorrowing
 * TradeTypeCode.LendingAndBorrowing}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeTypeCode#Futures
 * TradeTypeCode.Futures}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeTypeCode#Options
 * TradeTypeCode.Options}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode#FuturesOption
 * TradeTypeCode.FuturesOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode#FutureBuyBackTrade
 * TradeTypeCode.FutureBuyBackTrade}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
 * semanticMarkup} = ISO15022Synonym: :22F::TRTR</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"BSKT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradeTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of executed order."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TradeTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * A basket trade, i.e. a unit of 15 or more financial instruments used in
	 * program trading.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode
	 * TradeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BSKT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::TRTR//BASK</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Basket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A basket trade, i.e. a unit of 15 or more financial instruments used in program trading."
	 * </li>
	 * </ul>
	 */
	public static final TradeTypeCode Basket = new TradeTypeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::TRTR//BASK"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Basket";
			definition = "A basket trade, i.e. a unit of 15 or more financial instruments used in program trading.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTypeCode.mmObject();
			codeName = "BSKT";
		}
	};
	/**
	 * A trade of a predetermined set of financial instruments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode
	 * TradeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INDX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::TRTR//INDX</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Index"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "A trade of a predetermined set of financial instruments."</li>
	 * </ul>
	 */
	public static final TradeTypeCode Index = new TradeTypeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::TRTR//INDX"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Index";
			definition = "A trade of a predetermined set of financial instruments.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTypeCode.mmObject();
			codeName = "INDX";
		}
	};
	/**
	 * A trade of a predetermined set of financial instruments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode
	 * TradeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LIST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::TRTR//LIST</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "List"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "A trade of a predetermined set of financial instruments."</li>
	 * </ul>
	 */
	public static final TradeTypeCode List = new TradeTypeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::TRTR//LIST"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "List";
			definition = "A trade of a predetermined set of financial instruments.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTypeCode.mmObject();
			codeName = "LIST";
		}
	};
	/**
	 * A pre-allocated trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode
	 * TradeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRAL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::TRTR//PALL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreAllocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "A pre-allocated trade."</li>
	 * </ul>
	 */
	public static final TradeTypeCode PreAllocation = new TradeTypeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::TRTR//PALL"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PreAllocation";
			definition = "A pre-allocated trade.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTypeCode.mmObject();
			codeName = "PRAL";
		}
	};
	/**
	 * A program trade, i.e. a computer-driven trade of buying and selling of
	 * baskets of 15 or more financial instruments by index arbitrage
	 * specialists or institutional traders.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode
	 * TradeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PROG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::TRTR//PROG</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Program"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A program trade, i.e. a computer-driven trade of buying and selling of baskets of 15 or more financial instruments by index arbitrage specialists or institutional traders."
	 * </li>
	 * </ul>
	 */
	public static final TradeTypeCode Program = new TradeTypeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::TRTR//PROG"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Program";
			definition = "A program trade, i.e. a computer-driven trade of buying and selling of baskets of 15 or more financial instruments by index arbitrage specialists or institutional traders.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTypeCode.mmObject();
			codeName = "PROG";
		}
	};
	/**
	 * An executed order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode
	 * TradeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRAD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::TRTR//TRAD</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Trade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "An executed order."</li>
	 * </ul>
	 */
	public static final TradeTypeCode Trade = new TradeTypeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::TRTR//TRAD"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Trade";
			definition = "An executed order.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTypeCode.mmObject();
			codeName = "TRAD";
		}
	};
	/**
	 * A trade from a broker to another broker.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode
	 * TradeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BRBR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::TRTR//BRKR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BrokerToBroker"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "A trade from a broker to another broker."</li>
	 * </ul>
	 */
	public static final TradeTypeCode BrokerToBroker = new TradeTypeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::TRTR//BRKR"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BrokerToBroker";
			definition = "A trade from a broker to another broker.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTypeCode.mmObject();
			codeName = "BRBR";
		}
	};
	/**
	 * A trade from an investment fund to another investment fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode
	 * TradeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FDFD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::TRTR//FUND</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundToFund"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A trade from an investment fund to another investment fund."</li>
	 * </ul>
	 */
	public static final TradeTypeCode FundToFund = new TradeTypeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::TRTR//FUND"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FundToFund";
			definition = "A trade from an investment fund to another investment fund.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTypeCode.mmObject();
			codeName = "FDFD";
		}
	};
	/**
	 * Trade involving risk.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode
	 * TradeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RISK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 418</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RiskTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade involving risk."</li>
	 * </ul>
	 */
	public static final TradeTypeCode RiskTrade = new TradeTypeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "418"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RiskTrade";
			definition = "Trade involving risk.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTypeCode.mmObject();
			codeName = "RISK";
		}
	};
	/**
	 * Trade whose price is guaranteed as the weighted average of the trade
	 * prices on a specific day.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode
	 * TradeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VWAP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 418</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VWAPGuarantee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trade whose price is guaranteed as the weighted average of the trade prices on a specific day."
	 * </li>
	 * </ul>
	 */
	public static final TradeTypeCode VWAPGuarantee = new TradeTypeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "418"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VWAPGuarantee";
			definition = "Trade whose price is guaranteed as the weighted average of the trade prices on a specific day.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTypeCode.mmObject();
			codeName = "VWAP";
		}
	};
	/**
	 * Trade in which an agent intermediates between a buyer and a seller.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode
	 * TradeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AGEN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 418</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Agency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trade in which an agent intermediates between a buyer and a seller."</li>
	 * </ul>
	 */
	public static final TradeTypeCode Agency = new TradeTypeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "418"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Agency";
			definition = "Trade in which an agent intermediates between a buyer and a seller.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTypeCode.mmObject();
			codeName = "AGEN";
		}
	};
	/**
	 * Trade which is guaranteed to be finalized.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode
	 * TradeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GUAR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 418</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GuaranteedClose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade which is guaranteed to be finalized."</li>
	 * </ul>
	 */
	public static final TradeTypeCode GuaranteedClose = new TradeTypeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "418"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GuaranteedClose";
			definition = "Trade which is guaranteed to be finalized.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTypeCode.mmObject();
			codeName = "GUAR";
		}
	};
	/**
	 * On order book/market trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode
	 * TradeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OOBK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnOrderBookTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "On order book/market trade."</li>
	 * </ul>
	 */
	public static final TradeTypeCode OnOrderBookTrade = new TradeTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnOrderBookTrade";
			definition = "On order book/market trade.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTypeCode.mmObject();
			codeName = "OOBK";
		}
	};
	/**
	 * Trades coming from the application of a coorporate event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode
	 * TradeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LKTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkedTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trades coming from the application of a coorporate event."
	 * </li>
	 * </ul>
	 */
	public static final TradeTypeCode LinkedTrade = new TradeTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkedTrade";
			definition = "Trades coming from the application of a coorporate event.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTypeCode.mmObject();
			codeName = "LKTR";
		}
	};
	/**
	 * Trade generated by a give-up.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode
	 * TradeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GUTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeGiveUp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade generated by a give-up."</li>
	 * </ul>
	 */
	public static final TradeTypeCode TradeGiveUp = new TradeTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeGiveUp";
			definition = "Trade generated by a give-up.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTypeCode.mmObject();
			codeName = "GUTR";
		}
	};
	/**
	 * Trade that is generated following a corporate action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode
	 * TradeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorrectiveTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade that is generated following a corporate action."</li>
	 * </ul>
	 */
	public static final TradeTypeCode CorrectiveTrade = new TradeTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorrectiveTrade";
			definition = "Trade that is generated following a corporate action.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTypeCode.mmObject();
			codeName = "COTR";
		}
	};
	/**
	 * Trade that is input manually in case of issue on the original trade that
	 * either was not processed or not received.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode
	 * TradeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BKTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BackUpTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trade that is input manually in case of issue on the original trade that either was not processed or not received."
	 * </li>
	 * </ul>
	 */
	public static final TradeTypeCode BackUpTrade = new TradeTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BackUpTrade";
			definition = "Trade that is input manually in case of issue on the original trade that either was not processed or not received.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTypeCode.mmObject();
			codeName = "BKTR";
		}
	};
	/**
	 * Trade that is over the counter.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode
	 * TradeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OFBK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OffOrderBookTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade that is over the counter."</li>
	 * </ul>
	 */
	public static final TradeTypeCode OffOrderBookTrade = new TradeTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OffOrderBookTrade";
			definition = "Trade that is over the counter.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTypeCode.mmObject();
			codeName = "OFBK";
		}
	};
	/**
	 * Transaction relates to employee trade reporting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode
	 * TradeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EMTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EmployeeTradeReporting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction relates to employee trade reporting."</li>
	 * </ul>
	 */
	public static final TradeTypeCode EmployeeTradeReporting = new TradeTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmployeeTradeReporting";
			definition = "Transaction relates to employee trade reporting.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTypeCode.mmObject();
			codeName = "EMTR";
		}
	};
	/**
	 * Transaction is an Initial Public Offer (IPO) order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode
	 * TradeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IPOO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IPO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is an Initial Public Offer (IPO) order."</li>
	 * </ul>
	 */
	public static final TradeTypeCode IPO = new TradeTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IPO";
			definition = "Transaction is an Initial Public Offer (IPO) order.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTypeCode.mmObject();
			codeName = "IPOO";
		}
	};
	/**
	 * Indicates that the trade is a Offering issue trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode
	 * TradeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OFIT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfferingIssuingTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates that the trade is a Offering issue trade."</li>
	 * </ul>
	 */
	public static final TradeTypeCode OfferingIssuingTrade = new TradeTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfferingIssuingTrade";
			definition = "Indicates that the trade is a Offering issue trade.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTypeCode.mmObject();
			codeName = "OFIT";
		}
	};
	/**
	 * Relates to the issuance of a security such as an equity or a depositary
	 * receipt.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode
	 * TradeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ISSU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issuance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Relates to the issuance of a security such as an equity or a depositary receipt."
	 * </li>
	 * </ul>
	 */
	public static final TradeTypeCode Issuance = new TradeTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issuance";
			definition = "Relates to the issuance of a security such as an equity or a depositary receipt.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTypeCode.mmObject();
			codeName = "ISSU";
		}
	};
	/**
	 * The trade is a Bond repricing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode
	 * TradeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BORE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BondRepricing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The trade is a Bond repricing."</li>
	 * </ul>
	 */
	public static final TradeTypeCode BondRepricing = new TradeTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BondRepricing";
			definition = "The trade is a Bond repricing.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTypeCode.mmObject();
			codeName = "BORE";
		}
	};
	/**
	 * The trade is a Bond substitution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode
	 * TradeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BOSU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BondSubstitution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The trade is a Bond substitution."</li>
	 * </ul>
	 */
	public static final TradeTypeCode BondSubstitution = new TradeTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BondSubstitution";
			definition = "The trade is a Bond substitution.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTypeCode.mmObject();
			codeName = "BOSU";
		}
	};
	/**
	 * The trade is a Bond end.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode
	 * TradeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BOEN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BondEnd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The trade is a Bond end."</li>
	 * </ul>
	 */
	public static final TradeTypeCode BondEnd = new TradeTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BondEnd";
			definition = "The trade is a Bond end.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTypeCode.mmObject();
			codeName = "BOEN";
		}
	};
	/**
	 * The trade is a Bond start.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode
	 * TradeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BOST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BondStart"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The trade is a Bond start."</li>
	 * </ul>
	 */
	public static final TradeTypeCode BondStart = new TradeTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BondStart";
			definition = "The trade is a Bond start.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTypeCode.mmObject();
			codeName = "BOST";
		}
	};
	/**
	 * Indicates that the trade is a Lending and borrowing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode
	 * TradeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LABO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LendingAndBorrowing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates that the trade is a Lending and borrowing."</li>
	 * </ul>
	 */
	public static final TradeTypeCode LendingAndBorrowing = new TradeTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LendingAndBorrowing";
			definition = "Indicates that the trade is a Lending and borrowing.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTypeCode.mmObject();
			codeName = "LABO";
		}
	};
	/**
	 * Indicates that the trade is a Futures contract trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode
	 * TradeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FUTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Futures"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates that the trade is a Futures contract trade."</li>
	 * </ul>
	 */
	public static final TradeTypeCode Futures = new TradeTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Futures";
			definition = "Indicates that the trade is a Futures contract trade.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTypeCode.mmObject();
			codeName = "FUTR";
		}
	};
	/**
	 * Indicates that the trade is a Option contract trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode
	 * TradeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OPTN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Options"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates that the trade is a Option contract trade."</li>
	 * </ul>
	 */
	public static final TradeTypeCode Options = new TradeTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Options";
			definition = "Indicates that the trade is a Option contract trade.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTypeCode.mmObject();
			codeName = "OPTN";
		}
	};
	/**
	 * Indicates that the trade is a Futures option contract trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode
	 * TradeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FUOP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FuturesOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the trade is a Futures option contract trade."</li>
	 * </ul>
	 */
	public static final TradeTypeCode FuturesOption = new TradeTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FuturesOption";
			definition = "Indicates that the trade is a Futures option contract trade.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTypeCode.mmObject();
			codeName = "FUOP";
		}
	};
	/**
	 * The security will be bought back in the future.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode
	 * TradeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FBBT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FutureBuyBackTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The security will be bought back in the future."</li>
	 * </ul>
	 */
	public static final TradeTypeCode FutureBuyBackTrade = new TradeTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FutureBuyBackTrade";
			definition = "The security will be bought back in the future.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTypeCode.mmObject();
			codeName = "FBBT";
		}
	};
	final static private LinkedHashMap<String, TradeTypeCode> codesByName = new LinkedHashMap<>();

	protected TradeTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::TRTR"));
				example = Arrays.asList("BSKT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradeTypeCode";
				definition = "Specifies the type of executed order.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TradeTypeCode.Basket, com.tools20022.repository.codeset.TradeTypeCode.Index, com.tools20022.repository.codeset.TradeTypeCode.List,
						com.tools20022.repository.codeset.TradeTypeCode.PreAllocation, com.tools20022.repository.codeset.TradeTypeCode.Program, com.tools20022.repository.codeset.TradeTypeCode.Trade,
						com.tools20022.repository.codeset.TradeTypeCode.BrokerToBroker, com.tools20022.repository.codeset.TradeTypeCode.FundToFund, com.tools20022.repository.codeset.TradeTypeCode.RiskTrade,
						com.tools20022.repository.codeset.TradeTypeCode.VWAPGuarantee, com.tools20022.repository.codeset.TradeTypeCode.Agency, com.tools20022.repository.codeset.TradeTypeCode.GuaranteedClose,
						com.tools20022.repository.codeset.TradeTypeCode.OnOrderBookTrade, com.tools20022.repository.codeset.TradeTypeCode.LinkedTrade, com.tools20022.repository.codeset.TradeTypeCode.TradeGiveUp,
						com.tools20022.repository.codeset.TradeTypeCode.CorrectiveTrade, com.tools20022.repository.codeset.TradeTypeCode.BackUpTrade, com.tools20022.repository.codeset.TradeTypeCode.OffOrderBookTrade,
						com.tools20022.repository.codeset.TradeTypeCode.EmployeeTradeReporting, com.tools20022.repository.codeset.TradeTypeCode.IPO, com.tools20022.repository.codeset.TradeTypeCode.OfferingIssuingTrade,
						com.tools20022.repository.codeset.TradeTypeCode.Issuance, com.tools20022.repository.codeset.TradeTypeCode.BondRepricing, com.tools20022.repository.codeset.TradeTypeCode.BondSubstitution,
						com.tools20022.repository.codeset.TradeTypeCode.BondEnd, com.tools20022.repository.codeset.TradeTypeCode.BondStart, com.tools20022.repository.codeset.TradeTypeCode.LendingAndBorrowing,
						com.tools20022.repository.codeset.TradeTypeCode.Futures, com.tools20022.repository.codeset.TradeTypeCode.Options, com.tools20022.repository.codeset.TradeTypeCode.FuturesOption,
						com.tools20022.repository.codeset.TradeTypeCode.FutureBuyBackTrade);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Basket.getCodeName().get(), Basket);
		codesByName.put(Index.getCodeName().get(), Index);
		codesByName.put(List.getCodeName().get(), List);
		codesByName.put(PreAllocation.getCodeName().get(), PreAllocation);
		codesByName.put(Program.getCodeName().get(), Program);
		codesByName.put(Trade.getCodeName().get(), Trade);
		codesByName.put(BrokerToBroker.getCodeName().get(), BrokerToBroker);
		codesByName.put(FundToFund.getCodeName().get(), FundToFund);
		codesByName.put(RiskTrade.getCodeName().get(), RiskTrade);
		codesByName.put(VWAPGuarantee.getCodeName().get(), VWAPGuarantee);
		codesByName.put(Agency.getCodeName().get(), Agency);
		codesByName.put(GuaranteedClose.getCodeName().get(), GuaranteedClose);
		codesByName.put(OnOrderBookTrade.getCodeName().get(), OnOrderBookTrade);
		codesByName.put(LinkedTrade.getCodeName().get(), LinkedTrade);
		codesByName.put(TradeGiveUp.getCodeName().get(), TradeGiveUp);
		codesByName.put(CorrectiveTrade.getCodeName().get(), CorrectiveTrade);
		codesByName.put(BackUpTrade.getCodeName().get(), BackUpTrade);
		codesByName.put(OffOrderBookTrade.getCodeName().get(), OffOrderBookTrade);
		codesByName.put(EmployeeTradeReporting.getCodeName().get(), EmployeeTradeReporting);
		codesByName.put(IPO.getCodeName().get(), IPO);
		codesByName.put(OfferingIssuingTrade.getCodeName().get(), OfferingIssuingTrade);
		codesByName.put(Issuance.getCodeName().get(), Issuance);
		codesByName.put(BondRepricing.getCodeName().get(), BondRepricing);
		codesByName.put(BondSubstitution.getCodeName().get(), BondSubstitution);
		codesByName.put(BondEnd.getCodeName().get(), BondEnd);
		codesByName.put(BondStart.getCodeName().get(), BondStart);
		codesByName.put(LendingAndBorrowing.getCodeName().get(), LendingAndBorrowing);
		codesByName.put(Futures.getCodeName().get(), Futures);
		codesByName.put(Options.getCodeName().get(), Options);
		codesByName.put(FuturesOption.getCodeName().get(), FuturesOption);
		codesByName.put(FutureBuyBackTrade.getCodeName().get(), FutureBuyBackTrade);
	}

	public static TradeTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TradeTypeCode[] values() {
		TradeTypeCode[] values = new TradeTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TradeTypeCode> {
		@Override
		public TradeTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TradeTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}