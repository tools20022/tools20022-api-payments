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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.TypeOfPriceCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of price and information about the price.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#Average
 * TypeOfPriceCode.Average}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#AverageOverride
 * TypeOfPriceCode.AverageOverride}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#Combined
 * TypeOfPriceCode.Combined}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#GrossOfAll
 * TypeOfPriceCode.GrossOfAll}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#Limit
 * TypeOfPriceCode.Limit}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#Net
 * TypeOfPriceCode.Net}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#NetDisclosed
 * TypeOfPriceCode.NetDisclosed}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#NetOfAll
 * TypeOfPriceCode.NetOfAll}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#NetUndisclosed
 * TypeOfPriceCode.NetUndisclosed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#NotionalGross
 * TypeOfPriceCode.NotionalGross}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#ParValue
 * TypeOfPriceCode.ParValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#RoundedAverage
 * TypeOfPriceCode.RoundedAverage}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#Stop
 * TypeOfPriceCode.Stop}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#Bid
 * TypeOfPriceCode.Bid}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#Offer
 * TypeOfPriceCode.Offer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#NetAssetValue
 * TypeOfPriceCode.NetAssetValue}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#Creation
 * TypeOfPriceCode.Creation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#Cancellation
 * TypeOfPriceCode.Cancellation}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#Interim
 * TypeOfPriceCode.Interim}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#Swing
 * TypeOfPriceCode.Swing}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#Other
 * TypeOfPriceCode.Other}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#Mid
 * TypeOfPriceCode.Mid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#Reinvestment
 * TypeOfPriceCode.Reinvestment}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#Switch
 * TypeOfPriceCode.Switch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#DailyDividendRate
 * TypeOfPriceCode.DailyDividendRate}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#Market
 * TypeOfPriceCode.Market}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#Indicative
 * TypeOfPriceCode.Indicative}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#Actual
 * TypeOfPriceCode.Actual}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#NonAdjustedUnpublished
 * TypeOfPriceCode.NonAdjustedUnpublished}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#Guaranteed
 * TypeOfPriceCode.Guaranteed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#EstimatedNAV
 * TypeOfPriceCode.EstimatedNAV}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#GrossAssetValue
 * TypeOfPriceCode.GrossAssetValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#EstimatedGAV
 * TypeOfPriceCode.EstimatedGAV}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#SidePocketNAV
 * TypeOfPriceCode.SidePocketNAV}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#Ask
 * TypeOfPriceCode.Ask}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#Auction
 * TypeOfPriceCode.Auction}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#Calculated
 * TypeOfPriceCode.Calculated}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#Clean
 * TypeOfPriceCode.Clean}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#Dirty
 * TypeOfPriceCode.Dirty}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#Draw
 * TypeOfPriceCode.Draw}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#FairValue
 * TypeOfPriceCode.FairValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#IndicativePaid
 * TypeOfPriceCode.IndicativePaid}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#Kassa
 * TypeOfPriceCode.Kassa}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#Paid
 * TypeOfPriceCode.Paid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#RedemptionNAV
 * TypeOfPriceCode.RedemptionNAV}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#Settlement
 * TypeOfPriceCode.Settlement}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#Spread
 * TypeOfPriceCode.Spread}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#SubscriptionNAV
 * TypeOfPriceCode.SubscriptionNAV}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#Tax
 * TypeOfPriceCode.Tax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#TaxableIncomePerShareCalculated
 * TypeOfPriceCode.TaxableIncomePerShareCalculated}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
 * semanticMarkup} = ISO15022Synonym: :22F::PRIC, ISO15022Synonym: :90a::MRKT//,
 * ISO15022Synonym: :90a::INDC//</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"AVER"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TypeOfPriceCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of price and information about the price."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TypeOfPriceCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Price is an average execution price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode
	 * TypeOfPriceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AVER"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::PRIC//AVER</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Average"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price is an average execution price."</li>
	 * </ul>
	 */
	public static final TypeOfPriceCode Average = new TypeOfPriceCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::PRIC//AVER"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Average";
			definition = "Price is an average execution price.";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPriceCode.mmObject();
			codeName = "AVER";
		}
	};
	/**
	 * Price is an override of the average price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode
	 * TypeOfPriceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AVOV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::PRIC//AVOV</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AverageOverride"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price is an override of the average price."</li>
	 * </ul>
	 */
	public static final TypeOfPriceCode AverageOverride = new TypeOfPriceCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::PRIC//AVOV"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AverageOverride";
			definition = "Price is an override of the average price.";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPriceCode.mmObject();
			codeName = "AVOV";
		}
	};
	/**
	 * Price is composed of the combined expenses (used in the UK market).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode
	 * TypeOfPriceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COMB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::PRIC//COMB</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Combined"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price is composed of the combined expenses (used in the UK market)."</li>
	 * </ul>
	 */
	public static final TypeOfPriceCode Combined = new TypeOfPriceCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::PRIC//COMB"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Combined";
			definition = "Price is composed of the combined expenses (used in the UK market).";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPriceCode.mmObject();
			codeName = "COMB";
		}
	};
	/**
	 * Price is a gross execution price. The price is an all inclusive price,
	 * ie, including all charges, fees, and taxes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode
	 * TypeOfPriceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GREX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::PRIC//GREX</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossOfAll"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price is a gross execution price. The price is an all inclusive price, ie, including all charges, fees, and taxes."
	 * </li>
	 * </ul>
	 */
	public static final TypeOfPriceCode GrossOfAll = new TypeOfPriceCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::PRIC//GREX"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GrossOfAll";
			definition = "Price is a gross execution price. The price is an all inclusive price, ie, including all charges, fees, and taxes.";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPriceCode.mmObject();
			codeName = "GREX";
		}
	};
	/**
	 * Price is the limit price of a limit order, eg, a customer might put in a
	 * limit order to sell financial instruments at 67 or to buy at 60.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode
	 * TypeOfPriceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LIMI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::PRIC//LIMI</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Limit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price is the limit price of a limit order, eg, a customer might put in a limit order to sell financial instruments at 67 or to buy at 60."
	 * </li>
	 * </ul>
	 */
	public static final TypeOfPriceCode Limit = new TypeOfPriceCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::PRIC//LIMI"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Limit";
			definition = "Price is the limit price of a limit order, eg, a customer might put in a limit order to sell financial instruments at 67 or to buy at 60.";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPriceCode.mmObject();
			codeName = "LIMI";
		}
	};
	/**
	 * Price is a net price, ie, net only of local broker's commission, local
	 * fees and local taxes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode
	 * TypeOfPriceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NET2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::PRIC//NET2</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Net"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price is a net price, ie, net only of local broker's commission, local fees and local taxes."
	 * </li>
	 * </ul>
	 */
	public static final TypeOfPriceCode Net = new TypeOfPriceCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::PRIC//NET2"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Net";
			definition = "Price is a net price, ie, net only of local broker's commission, local fees and local taxes.";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPriceCode.mmObject();
			codeName = "NET2";
		}
	};
	/**
	 * Price is net to the disclosed client.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode
	 * TypeOfPriceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NDIS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::PRIC//NDIS</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetDisclosed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price is net to the disclosed client."</li>
	 * </ul>
	 */
	public static final TypeOfPriceCode NetDisclosed = new TypeOfPriceCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::PRIC//NDIS"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NetDisclosed";
			definition = "Price is net to the disclosed client.";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPriceCode.mmObject();
			codeName = "NDIS";
		}
	};
	/**
	 * Price is a net price, ie, net of all charges, fees and taxes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode
	 * TypeOfPriceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NET1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::PRIC//NET1</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetOfAll"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price is a net price, ie, net of all charges, fees and taxes."</li>
	 * </ul>
	 */
	public static final TypeOfPriceCode NetOfAll = new TypeOfPriceCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::PRIC//NET1"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NetOfAll";
			definition = "Price is a net price, ie, net of all charges, fees and taxes.";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPriceCode.mmObject();
			codeName = "NET1";
		}
	};
	/**
	 * Price is net to the client undisclosed (used in the UK market).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode
	 * TypeOfPriceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NUND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::PRIC//NUND</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetUndisclosed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price is net to the client undisclosed (used in the UK market)."</li>
	 * </ul>
	 */
	public static final TypeOfPriceCode NetUndisclosed = new TypeOfPriceCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::PRIC//NUND"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NetUndisclosed";
			definition = "Price is net to the client undisclosed (used in the UK market).";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPriceCode.mmObject();
			codeName = "NUND";
		}
	};
	/**
	 * Price is notional gross (used in the UK market).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode
	 * TypeOfPriceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOGR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::PRIC//NOGR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotionalGross"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price is notional gross (used in the UK market)."</li>
	 * </ul>
	 */
	public static final TypeOfPriceCode NotionalGross = new TypeOfPriceCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::PRIC//NOGR"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotionalGross";
			definition = "Price is notional gross (used in the UK market).";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPriceCode.mmObject();
			codeName = "NOGR";
		}
	};
	/**
	 * Price is equal to the nominal or face value of the instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode
	 * TypeOfPriceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PARV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::PRIC//PARV</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price is equal to the nominal or face value of the instrument."</li>
	 * </ul>
	 */
	public static final TypeOfPriceCode ParValue = new TypeOfPriceCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::PRIC//PARV"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ParValue";
			definition = "Price is equal to the nominal or face value of the instrument.";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPriceCode.mmObject();
			codeName = "PARV";
		}
	};
	/**
	 * Price is a rounded average price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode
	 * TypeOfPriceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RDAV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::PRIC//RDAV</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoundedAverage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price is a rounded average price."</li>
	 * </ul>
	 */
	public static final TypeOfPriceCode RoundedAverage = new TypeOfPriceCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::PRIC//RDAV"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RoundedAverage";
			definition = "Price is a rounded average price.";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPriceCode.mmObject();
			codeName = "RDAV";
		}
	};
	/**
	 * Price is a stop price used in an order to buy. The order becomes a market
	 * order when the financial instrument trades at or above the stop price
	 * after the order is submitted. In an order to sell the order becomes a
	 * market order when the financial instrument trades at or below the stop
	 * price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode
	 * TypeOfPriceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STOP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::PRIC//STOP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Stop"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price is a stop price used in an order to buy. The order becomes a market order when the financial instrument trades at or above the stop price after the order is submitted. In an order to sell the order becomes a market order when the financial instrument trades at or below the stop price."
	 * </li>
	 * </ul>
	 */
	public static final TypeOfPriceCode Stop = new TypeOfPriceCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::PRIC//STOP"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Stop";
			definition = "Price is a stop price used in an order to buy. The order becomes a market order when the financial instrument trades at or above the stop price after the order is submitted. In an order to sell the order becomes a market order when the financial instrument trades at or below the stop price.";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPriceCode.mmObject();
			codeName = "STOP";
		}
	};
	/**
	 * Price is the calculated bid price of a dual-priced fund (offer-bid
	 * prices), ie, the selling price of the units for the investor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode
	 * TypeOfPriceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BIDE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price is the calculated bid price of a dual-priced fund (offer-bid prices), ie, the selling price of the units for the investor."
	 * </li>
	 * </ul>
	 */
	public static final TypeOfPriceCode Bid = new TypeOfPriceCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Bid";
			definition = "Price is the calculated bid price of a dual-priced fund (offer-bid prices), ie, the selling price of the units for the investor.";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPriceCode.mmObject();
			codeName = "BIDE";
		}
	};
	/**
	 * Price is the calculated offer price of a dual-priced investment fund
	 * (offer-bid prices), ie, the buying price of the units for an investor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode
	 * TypeOfPriceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OFFR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Offer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price is the calculated offer price of a dual-priced investment fund (offer-bid prices), ie, the buying price of the units for an investor."
	 * </li>
	 * </ul>
	 */
	public static final TypeOfPriceCode Offer = new TypeOfPriceCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Offer";
			definition = "Price is the calculated offer price of a dual-priced investment fund (offer-bid prices), ie, the buying price of the units for an investor.";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPriceCode.mmObject();
			codeName = "OFFR";
		}
	};
	/**
	 * Price is the net asset value per unit that is used either as a
	 * transacting price for a single-priced investment fund class, or as a
	 * notional price for the calculation of other prices.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode
	 * TypeOfPriceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NAVL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetAssetValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price is the net asset value per unit that is used either as a transacting price for a single-priced investment fund class, or as a notional price for the calculation of other prices."
	 * </li>
	 * </ul>
	 */
	public static final TypeOfPriceCode NetAssetValue = new TypeOfPriceCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NetAssetValue";
			definition = "Price is the net asset value per unit that is used either as a transacting price for a single-priced investment fund class, or as a notional price for the calculation of other prices.";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPriceCode.mmObject();
			codeName = "NAVL";
		}
	};
	/**
	 * Price is the calculated creation price of a dual-priced investment fund
	 * (creation-cancellation prices) and the highest possible buying price of
	 * the units before the initial charge. The actual buying or offer price,
	 * which includes charges, will be higher.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode
	 * TypeOfPriceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CREA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Creation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price is the calculated creation price of a dual-priced investment fund (creation-cancellation prices) and the highest possible buying price of the units before the initial charge. The actual buying or offer price, which includes charges, will be higher."
	 * </li>
	 * </ul>
	 */
	public static final TypeOfPriceCode Creation = new TypeOfPriceCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Creation";
			definition = "Price is the calculated creation price of a dual-priced investment fund (creation-cancellation prices) and the highest possible buying price of the units before the initial charge. The actual buying or offer price, which includes charges, will be higher.";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPriceCode.mmObject();
			codeName = "CREA";
		}
	};
	/**
	 * Price is the calculated cancellation price of a dual-priced investment
	 * fund (creation-cancellation price), and the lowest possible valuation of
	 * the units on any one-day. The actual selling or bid price is usually
	 * higher.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode
	 * TypeOfPriceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CANC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cancellation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price is the calculated cancellation price of a dual-priced investment fund (creation-cancellation price), and the lowest possible valuation of the units on any one-day. The actual selling or bid price is usually higher."
	 * </li>
	 * </ul>
	 */
	public static final TypeOfPriceCode Cancellation = new TypeOfPriceCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Cancellation";
			definition = "Price is the calculated cancellation price of a dual-priced investment fund (creation-cancellation price), and the lowest possible valuation of the units on any one-day. The actual selling or bid price is usually higher.";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPriceCode.mmObject();
			codeName = "CANC";
		}
	};
	/**
	 * Price is the non-official interim price given to an investor before the
	 * executed price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode
	 * TypeOfPriceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INTE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interim"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price is the non-official interim price given to an investor before the executed price."
	 * </li>
	 * </ul>
	 */
	public static final TypeOfPriceCode Interim = new TypeOfPriceCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Interim";
			definition = "Price is the non-official interim price given to an investor before the executed price.";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPriceCode.mmObject();
			codeName = "INTE";
		}
	};
	/**
	 * Price is the calculated net asset value price of a single-priced
	 * investment fund. The price is adjusted to take into account the dealing
	 * costs due to individual large deals, or due to a significant imbalance in
	 * volumes of subscriptions vs redemptions, as an alternative to dilution
	 * levy.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode
	 * TypeOfPriceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SWNG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Swing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price is the calculated net asset value price of a single-priced investment fund. The price is adjusted to take into account the dealing costs due to individual large deals, or due to a significant imbalance in volumes of subscriptions vs redemptions, as an alternative to dilution levy."
	 * </li>
	 * </ul>
	 */
	public static final TypeOfPriceCode Swing = new TypeOfPriceCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Swing";
			definition = "Price is the calculated net asset value price of a single-priced investment fund. The price is adjusted to take into account the dealing costs due to individual large deals, or due to a significant imbalance in volumes of subscriptions vs redemptions, as an alternative to dilution levy.";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPriceCode.mmObject();
			codeName = "SWNG";
		}
	};
	/**
	 * Price is another type of price, which is not explicitly defined.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode
	 * TypeOfPriceCode}</li>
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
	 * definition} =
	 * "Price is another type of price, which is not explicitly defined."</li>
	 * </ul>
	 */
	public static final TypeOfPriceCode Other = new TypeOfPriceCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Other";
			definition = "Price is another type of price, which is not explicitly defined.";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPriceCode.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Price is the average price between the bid and offer prices.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode
	 * TypeOfPriceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MIDD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Mid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price is the average price between the bid and offer prices."</li>
	 * </ul>
	 */
	public static final TypeOfPriceCode Mid = new TypeOfPriceCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Mid";
			definition = "Price is the average price between the bid and offer prices.";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPriceCode.mmObject();
			codeName = "MIDD";
		}
	};
	/**
	 * Price is the price used when reinvesting units after distribution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode
	 * TypeOfPriceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RINV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reinvestment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price is the price used when reinvesting units after distribution."</li>
	 * </ul>
	 */
	public static final TypeOfPriceCode Reinvestment = new TypeOfPriceCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Reinvestment";
			definition = "Price is the price used when reinvesting units after distribution.";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPriceCode.mmObject();
			codeName = "RINV";
		}
	};
	/**
	 * Price is the price used when transferring units between products.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode
	 * TypeOfPriceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SWIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Switch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price is the price used when transferring units between products."</li>
	 * </ul>
	 */
	public static final TypeOfPriceCode Switch = new TypeOfPriceCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Switch";
			definition = "Price is the price used when transferring units between products.";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPriceCode.mmObject();
			codeName = "SWIC";
		}
	};
	/**
	 * Price is the net income of a financial instrument, calculated on each
	 * dealing day, and divided by all the units outstanding on that day.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode
	 * TypeOfPriceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DDVR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DailyDividendRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price is the net income of a financial instrument, calculated on each dealing day, and divided by all the units outstanding on that day."
	 * </li>
	 * </ul>
	 */
	public static final TypeOfPriceCode DailyDividendRate = new TypeOfPriceCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DailyDividendRate";
			definition = "Price is the net income of a financial instrument, calculated on each dealing day, and divided by all the units outstanding on that day.";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPriceCode.mmObject();
			codeName = "DDVR";
		}
	};
	/**
	 * Price is the current market price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode
	 * TypeOfPriceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MRKT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :90a::MRKT//</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Market"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price is the current market price."</li>
	 * </ul>
	 */
	public static final TypeOfPriceCode Market = new TypeOfPriceCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90a::MRKT//"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Market";
			definition = "Price is the current market price.";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPriceCode.mmObject();
			codeName = "MRKT";
		}
	};
	/**
	 * Price is the estimated indicative price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode
	 * TypeOfPriceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INDC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :90a::INDC//</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Indicative"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price is the estimated indicative price."</li>
	 * </ul>
	 */
	public static final TypeOfPriceCode Indicative = new TypeOfPriceCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90a::INDC//"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Indicative";
			definition = "Price is the estimated indicative price.";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPriceCode.mmObject();
			codeName = "INDC";
		}
	};
	/**
	 * True offer price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode
	 * TypeOfPriceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACTU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Actual"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "True offer price."</li>
	 * </ul>
	 */
	public static final TypeOfPriceCode Actual = new TypeOfPriceCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Actual";
			definition = "True offer price.";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPriceCode.mmObject();
			codeName = "ACTU";
		}
	};
	/**
	 * The original NAV before the price of the investment fund was swung.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode
	 * TypeOfPriceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NAUP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonAdjustedUnpublished"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The original NAV before the price of the investment fund was swung."</li>
	 * </ul>
	 */
	public static final TypeOfPriceCode NonAdjustedUnpublished = new TypeOfPriceCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NonAdjustedUnpublished";
			definition = "The original NAV before the price of the investment fund was swung.";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPriceCode.mmObject();
			codeName = "NAUP";
		}
	};
	/**
	 * Price is a guaranteed price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode
	 * TypeOfPriceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GUAR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Guaranteed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price is a guaranteed price."</li>
	 * </ul>
	 */
	public static final TypeOfPriceCode Guaranteed = new TypeOfPriceCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Guaranteed";
			definition = "Price is a guaranteed price.";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPriceCode.mmObject();
			codeName = "GUAR";
		}
	};
	/**
	 * Price is an estimated net asset value per unit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode
	 * TypeOfPriceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ENAV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EstimatedNAV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price is an estimated net asset value per unit."</li>
	 * </ul>
	 */
	public static final TypeOfPriceCode EstimatedNAV = new TypeOfPriceCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EstimatedNAV";
			definition = "Price is an estimated net asset value per unit.";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPriceCode.mmObject();
			codeName = "ENAV";
		}
	};
	/**
	 * Price is the gross asset value per unit and includes the performance fee
	 * per share. It is used as the transacting price for a fund with
	 * equalisation. GAVL price minus the NAVL price = performance fee.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode
	 * TypeOfPriceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GAVL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossAssetValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price is the gross asset value per unit and includes the performance fee per share. It is used as the transacting price for a fund with equalisation. GAVL price minus the NAVL price = performance fee."
	 * </li>
	 * </ul>
	 */
	public static final TypeOfPriceCode GrossAssetValue = new TypeOfPriceCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GrossAssetValue";
			definition = "Price is the gross asset value per unit and includes the performance fee per share. It is used as the transacting price for a fund with equalisation. GAVL price minus the NAVL price = performance fee.";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPriceCode.mmObject();
			codeName = "GAVL";
		}
	};
	/**
	 * Price is the estimated gross asset value per unit and includes the
	 * performance fee per share. It is used as the transacting price for a fund
	 * with equalisation. GAVL price minus the NAVL price = performance fee.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode
	 * TypeOfPriceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EGAV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EstimatedGAV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price is the estimated gross asset value per unit and includes the performance fee per share. It is used as the transacting price for a fund with equalisation. GAVL price minus the NAVL price = performance fee."
	 * </li>
	 * </ul>
	 */
	public static final TypeOfPriceCode EstimatedGAV = new TypeOfPriceCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EstimatedGAV";
			definition = "Price is the estimated gross asset value per unit and includes the performance fee per share. It is used as the transacting price for a fund with equalisation. GAVL price minus the NAVL price = performance fee.";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPriceCode.mmObject();
			codeName = "EGAV";
		}
	};
	/**
	 * Price is the estimated net asset value for the side pocket.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode
	 * TypeOfPriceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NAVS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SidePocketNAV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price is the estimated net asset value for the side pocket."</li>
	 * </ul>
	 */
	public static final TypeOfPriceCode SidePocketNAV = new TypeOfPriceCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SidePocketNAV";
			definition = "Price is the estimated net asset value for the side pocket.";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPriceCode.mmObject();
			codeName = "NAVS";
		}
	};
	/**
	 * Offer. Price for which seller is willing to sell item.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode
	 * TypeOfPriceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ASKK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Ask"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Offer. Price for which seller is willing to sell item."</li>
	 * </ul>
	 */
	public static final TypeOfPriceCode Ask = new TypeOfPriceCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Ask";
			definition = "Offer. Price for which seller is willing to sell item.";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPriceCode.mmObject();
			codeName = "ASKK";
		}
	};
	/**
	 * Price selected as a crossing of an auction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode
	 * TypeOfPriceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AUCT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Auction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price selected as a crossing of an auction."</li>
	 * </ul>
	 */
	public static final TypeOfPriceCode Auction = new TypeOfPriceCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Auction";
			definition = "Price selected as a crossing of an auction.";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPriceCode.mmObject();
			codeName = "AUCT";
		}
	};
	/**
	 * Price is calculated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode
	 * TypeOfPriceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CALC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Calculated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price is calculated."</li>
	 * </ul>
	 */
	public static final TypeOfPriceCode Calculated = new TypeOfPriceCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Calculated";
			definition = "Price is calculated.";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPriceCode.mmObject();
			codeName = "CALC";
		}
	};
	/**
	 * Paid without accumulated interest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode
	 * TypeOfPriceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLEN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Clean"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Paid without accumulated interest."</li>
	 * </ul>
	 */
	public static final TypeOfPriceCode Clean = new TypeOfPriceCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Clean";
			definition = "Paid without accumulated interest.";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPriceCode.mmObject();
			codeName = "CLEN";
		}
	};
	/**
	 * Paid with accumulated interest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode
	 * TypeOfPriceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DIRT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Dirty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Paid with accumulated interest."</li>
	 * </ul>
	 */
	public static final TypeOfPriceCode Dirty = new TypeOfPriceCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Dirty";
			definition = "Paid with accumulated interest.";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPriceCode.mmObject();
			codeName = "DIRT";
		}
	};
	/**
	 * Price selected as a result of a lottery/tiebreaker.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode
	 * TypeOfPriceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DRAW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Draw"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price selected as a result of a lottery/tiebreaker."</li>
	 * </ul>
	 */
	public static final TypeOfPriceCode Draw = new TypeOfPriceCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Draw";
			definition = "Price selected as a result of a lottery/tiebreaker.";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPriceCode.mmObject();
			codeName = "DRAW";
		}
	};
	/**
	 * Estimate of the potential market price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode
	 * TypeOfPriceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FAVA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FairValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Estimate of the potential market price."</li>
	 * </ul>
	 */
	public static final TypeOfPriceCode FairValue = new TypeOfPriceCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FairValue";
			definition = "Estimate of the potential market price.";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPriceCode.mmObject();
			codeName = "FAVA";
		}
	};
	/**
	 * Reduced and partial execution based on high bids and ask orders.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode
	 * TypeOfPriceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INPA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndicativePaid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reduced and partial execution based on high bids and ask orders."</li>
	 * </ul>
	 */
	public static final TypeOfPriceCode IndicativePaid = new TypeOfPriceCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IndicativePaid";
			definition = "Reduced and partial execution based on high bids and ask orders.";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPriceCode.mmObject();
			codeName = "INPA";
		}
	};
	/**
	 * Official declared price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode
	 * TypeOfPriceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "KASA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Kassa"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Official declared price."</li>
	 * </ul>
	 */
	public static final TypeOfPriceCode Kassa = new TypeOfPriceCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Kassa";
			definition = "Official declared price.";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPriceCode.mmObject();
			codeName = "KASA";
		}
	};
	/**
	 * Price at which the trade was done.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode
	 * TypeOfPriceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PAID"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Paid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price at which the trade was done."</li>
	 * </ul>
	 */
	public static final TypeOfPriceCode Paid = new TypeOfPriceCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Paid";
			definition = "Price at which the trade was done.";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPriceCode.mmObject();
			codeName = "PAID";
		}
	};
	/**
	 * Net Asset Value (NAV) applicable to redemptions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode
	 * TypeOfPriceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REDN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionNAV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Net Asset Value (NAV) applicable to redemptions."</li>
	 * </ul>
	 */
	public static final TypeOfPriceCode RedemptionNAV = new TypeOfPriceCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RedemptionNAV";
			definition = "Net Asset Value (NAV) applicable to redemptions.";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPriceCode.mmObject();
			codeName = "REDN";
		}
	};
	/**
	 * Price used for the settlement of futures and options.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode
	 * TypeOfPriceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SETM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Settlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price used for the settlement of futures and options."</li>
	 * </ul>
	 */
	public static final TypeOfPriceCode Settlement = new TypeOfPriceCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Settlement";
			definition = "Price used for the settlement of futures and options.";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPriceCode.mmObject();
			codeName = "SETM";
		}
	};
	/**
	 * The difference between bid and ask.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode
	 * TypeOfPriceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPRE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Spread"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The difference between bid and ask."</li>
	 * </ul>
	 */
	public static final TypeOfPriceCode Spread = new TypeOfPriceCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Spread";
			definition = "The difference between bid and ask.";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPriceCode.mmObject();
			codeName = "SPRE";
		}
	};
	/**
	 * Net Asset Value (NAV) applicable to subscriptions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode
	 * TypeOfPriceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SUBN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubscriptionNAV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Net Asset Value (NAV) applicable to subscriptions."</li>
	 * </ul>
	 */
	public static final TypeOfPriceCode SubscriptionNAV = new TypeOfPriceCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SubscriptionNAV";
			definition = "Net Asset Value (NAV) applicable to subscriptions.";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPriceCode.mmObject();
			codeName = "SUBN";
		}
	};
	/**
	 * Price for tax declaration purpose.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode
	 * TypeOfPriceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TAXE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price for tax declaration purpose."</li>
	 * </ul>
	 */
	public static final TypeOfPriceCode Tax = new TypeOfPriceCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Tax";
			definition = "Price for tax declaration purpose.";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPriceCode.mmObject();
			codeName = "TAXE";
		}
	};
	/**
	 * Specifies whether the fund calculates a taxable interest per share (TIS).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode
	 * TypeOfPriceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TISC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxableIncomePerShareCalculated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the fund calculates a taxable interest per share (TIS)."
	 * </li>
	 * </ul>
	 */
	public static final TypeOfPriceCode TaxableIncomePerShareCalculated = new TypeOfPriceCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxableIncomePerShareCalculated";
			definition = "Specifies whether the fund calculates a taxable interest per share (TIS).";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfPriceCode.mmObject();
			codeName = "TISC";
		}
	};
	final static private LinkedHashMap<String, TypeOfPriceCode> codesByName = new LinkedHashMap<>();

	protected TypeOfPriceCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::PRIC"), new ISO15022Synonym(this, ":90a::MRKT//"), new ISO15022Synonym(this, ":90a::INDC//"));
				example = Arrays.asList("AVER");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TypeOfPriceCode";
				definition = "Specifies the type of price and information about the price.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TypeOfPriceCode.Average, com.tools20022.repository.codeset.TypeOfPriceCode.AverageOverride, com.tools20022.repository.codeset.TypeOfPriceCode.Combined,
						com.tools20022.repository.codeset.TypeOfPriceCode.GrossOfAll, com.tools20022.repository.codeset.TypeOfPriceCode.Limit, com.tools20022.repository.codeset.TypeOfPriceCode.Net,
						com.tools20022.repository.codeset.TypeOfPriceCode.NetDisclosed, com.tools20022.repository.codeset.TypeOfPriceCode.NetOfAll, com.tools20022.repository.codeset.TypeOfPriceCode.NetUndisclosed,
						com.tools20022.repository.codeset.TypeOfPriceCode.NotionalGross, com.tools20022.repository.codeset.TypeOfPriceCode.ParValue, com.tools20022.repository.codeset.TypeOfPriceCode.RoundedAverage,
						com.tools20022.repository.codeset.TypeOfPriceCode.Stop, com.tools20022.repository.codeset.TypeOfPriceCode.Bid, com.tools20022.repository.codeset.TypeOfPriceCode.Offer,
						com.tools20022.repository.codeset.TypeOfPriceCode.NetAssetValue, com.tools20022.repository.codeset.TypeOfPriceCode.Creation, com.tools20022.repository.codeset.TypeOfPriceCode.Cancellation,
						com.tools20022.repository.codeset.TypeOfPriceCode.Interim, com.tools20022.repository.codeset.TypeOfPriceCode.Swing, com.tools20022.repository.codeset.TypeOfPriceCode.Other,
						com.tools20022.repository.codeset.TypeOfPriceCode.Mid, com.tools20022.repository.codeset.TypeOfPriceCode.Reinvestment, com.tools20022.repository.codeset.TypeOfPriceCode.Switch,
						com.tools20022.repository.codeset.TypeOfPriceCode.DailyDividendRate, com.tools20022.repository.codeset.TypeOfPriceCode.Market, com.tools20022.repository.codeset.TypeOfPriceCode.Indicative,
						com.tools20022.repository.codeset.TypeOfPriceCode.Actual, com.tools20022.repository.codeset.TypeOfPriceCode.NonAdjustedUnpublished, com.tools20022.repository.codeset.TypeOfPriceCode.Guaranteed,
						com.tools20022.repository.codeset.TypeOfPriceCode.EstimatedNAV, com.tools20022.repository.codeset.TypeOfPriceCode.GrossAssetValue, com.tools20022.repository.codeset.TypeOfPriceCode.EstimatedGAV,
						com.tools20022.repository.codeset.TypeOfPriceCode.SidePocketNAV, com.tools20022.repository.codeset.TypeOfPriceCode.Ask, com.tools20022.repository.codeset.TypeOfPriceCode.Auction,
						com.tools20022.repository.codeset.TypeOfPriceCode.Calculated, com.tools20022.repository.codeset.TypeOfPriceCode.Clean, com.tools20022.repository.codeset.TypeOfPriceCode.Dirty,
						com.tools20022.repository.codeset.TypeOfPriceCode.Draw, com.tools20022.repository.codeset.TypeOfPriceCode.FairValue, com.tools20022.repository.codeset.TypeOfPriceCode.IndicativePaid,
						com.tools20022.repository.codeset.TypeOfPriceCode.Kassa, com.tools20022.repository.codeset.TypeOfPriceCode.Paid, com.tools20022.repository.codeset.TypeOfPriceCode.RedemptionNAV,
						com.tools20022.repository.codeset.TypeOfPriceCode.Settlement, com.tools20022.repository.codeset.TypeOfPriceCode.Spread, com.tools20022.repository.codeset.TypeOfPriceCode.SubscriptionNAV,
						com.tools20022.repository.codeset.TypeOfPriceCode.Tax, com.tools20022.repository.codeset.TypeOfPriceCode.TaxableIncomePerShareCalculated);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Average.getCodeName().get(), Average);
		codesByName.put(AverageOverride.getCodeName().get(), AverageOverride);
		codesByName.put(Combined.getCodeName().get(), Combined);
		codesByName.put(GrossOfAll.getCodeName().get(), GrossOfAll);
		codesByName.put(Limit.getCodeName().get(), Limit);
		codesByName.put(Net.getCodeName().get(), Net);
		codesByName.put(NetDisclosed.getCodeName().get(), NetDisclosed);
		codesByName.put(NetOfAll.getCodeName().get(), NetOfAll);
		codesByName.put(NetUndisclosed.getCodeName().get(), NetUndisclosed);
		codesByName.put(NotionalGross.getCodeName().get(), NotionalGross);
		codesByName.put(ParValue.getCodeName().get(), ParValue);
		codesByName.put(RoundedAverage.getCodeName().get(), RoundedAverage);
		codesByName.put(Stop.getCodeName().get(), Stop);
		codesByName.put(Bid.getCodeName().get(), Bid);
		codesByName.put(Offer.getCodeName().get(), Offer);
		codesByName.put(NetAssetValue.getCodeName().get(), NetAssetValue);
		codesByName.put(Creation.getCodeName().get(), Creation);
		codesByName.put(Cancellation.getCodeName().get(), Cancellation);
		codesByName.put(Interim.getCodeName().get(), Interim);
		codesByName.put(Swing.getCodeName().get(), Swing);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(Mid.getCodeName().get(), Mid);
		codesByName.put(Reinvestment.getCodeName().get(), Reinvestment);
		codesByName.put(Switch.getCodeName().get(), Switch);
		codesByName.put(DailyDividendRate.getCodeName().get(), DailyDividendRate);
		codesByName.put(Market.getCodeName().get(), Market);
		codesByName.put(Indicative.getCodeName().get(), Indicative);
		codesByName.put(Actual.getCodeName().get(), Actual);
		codesByName.put(NonAdjustedUnpublished.getCodeName().get(), NonAdjustedUnpublished);
		codesByName.put(Guaranteed.getCodeName().get(), Guaranteed);
		codesByName.put(EstimatedNAV.getCodeName().get(), EstimatedNAV);
		codesByName.put(GrossAssetValue.getCodeName().get(), GrossAssetValue);
		codesByName.put(EstimatedGAV.getCodeName().get(), EstimatedGAV);
		codesByName.put(SidePocketNAV.getCodeName().get(), SidePocketNAV);
		codesByName.put(Ask.getCodeName().get(), Ask);
		codesByName.put(Auction.getCodeName().get(), Auction);
		codesByName.put(Calculated.getCodeName().get(), Calculated);
		codesByName.put(Clean.getCodeName().get(), Clean);
		codesByName.put(Dirty.getCodeName().get(), Dirty);
		codesByName.put(Draw.getCodeName().get(), Draw);
		codesByName.put(FairValue.getCodeName().get(), FairValue);
		codesByName.put(IndicativePaid.getCodeName().get(), IndicativePaid);
		codesByName.put(Kassa.getCodeName().get(), Kassa);
		codesByName.put(Paid.getCodeName().get(), Paid);
		codesByName.put(RedemptionNAV.getCodeName().get(), RedemptionNAV);
		codesByName.put(Settlement.getCodeName().get(), Settlement);
		codesByName.put(Spread.getCodeName().get(), Spread);
		codesByName.put(SubscriptionNAV.getCodeName().get(), SubscriptionNAV);
		codesByName.put(Tax.getCodeName().get(), Tax);
		codesByName.put(TaxableIncomePerShareCalculated.getCodeName().get(), TaxableIncomePerShareCalculated);
	}

	public static TypeOfPriceCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TypeOfPriceCode[] values() {
		TypeOfPriceCode[] values = new TypeOfPriceCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TypeOfPriceCode> {
		@Override
		public TypeOfPriceCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TypeOfPriceCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}