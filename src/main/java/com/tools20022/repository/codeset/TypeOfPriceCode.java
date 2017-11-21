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
 * Specifies the type of price and information about the price.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#mmAverage
 * TypeOfPriceCode.mmAverage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#mmAverageOverride
 * TypeOfPriceCode.mmAverageOverride}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#mmCombined
 * TypeOfPriceCode.mmCombined}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#mmGrossOfAll
 * TypeOfPriceCode.mmGrossOfAll}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#mmLimit
 * TypeOfPriceCode.mmLimit}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#mmNet
 * TypeOfPriceCode.mmNet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#mmNetDisclosed
 * TypeOfPriceCode.mmNetDisclosed}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#mmNetOfAll
 * TypeOfPriceCode.mmNetOfAll}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#mmNetUndisclosed
 * TypeOfPriceCode.mmNetUndisclosed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#mmNotionalGross
 * TypeOfPriceCode.mmNotionalGross}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#mmParValue
 * TypeOfPriceCode.mmParValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#mmRoundedAverage
 * TypeOfPriceCode.mmRoundedAverage}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#mmStop
 * TypeOfPriceCode.mmStop}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#mmBid
 * TypeOfPriceCode.mmBid}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#mmOffer
 * TypeOfPriceCode.mmOffer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#mmNetAssetValue
 * TypeOfPriceCode.mmNetAssetValue}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#mmCreation
 * TypeOfPriceCode.mmCreation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#mmCancellation
 * TypeOfPriceCode.mmCancellation}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#mmInterim
 * TypeOfPriceCode.mmInterim}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#mmSwing
 * TypeOfPriceCode.mmSwing}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#mmOther
 * TypeOfPriceCode.mmOther}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#mmMid
 * TypeOfPriceCode.mmMid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#mmReinvestment
 * TypeOfPriceCode.mmReinvestment}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#mmSwitch
 * TypeOfPriceCode.mmSwitch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#mmDailyDividendRate
 * TypeOfPriceCode.mmDailyDividendRate}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#mmMarket
 * TypeOfPriceCode.mmMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#mmIndicative
 * TypeOfPriceCode.mmIndicative}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#mmActual
 * TypeOfPriceCode.mmActual}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#mmNonAdjustedUnpublished
 * TypeOfPriceCode.mmNonAdjustedUnpublished}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#mmGuaranteed
 * TypeOfPriceCode.mmGuaranteed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#mmEstimatedNAV
 * TypeOfPriceCode.mmEstimatedNAV}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#mmGrossAssetValue
 * TypeOfPriceCode.mmGrossAssetValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#mmEstimatedGAV
 * TypeOfPriceCode.mmEstimatedGAV}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#mmSidePocketNAV
 * TypeOfPriceCode.mmSidePocketNAV}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#mmAsk
 * TypeOfPriceCode.mmAsk}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#mmAuction
 * TypeOfPriceCode.mmAuction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#mmCalculated
 * TypeOfPriceCode.mmCalculated}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#mmClean
 * TypeOfPriceCode.mmClean}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#mmDirty
 * TypeOfPriceCode.mmDirty}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#mmDraw
 * TypeOfPriceCode.mmDraw}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#mmFairValue
 * TypeOfPriceCode.mmFairValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#mmIndicativePaid
 * TypeOfPriceCode.mmIndicativePaid}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#mmKassa
 * TypeOfPriceCode.mmKassa}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#mmPaid
 * TypeOfPriceCode.mmPaid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#mmRedemptionNAV
 * TypeOfPriceCode.mmRedemptionNAV}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#mmSettlement
 * TypeOfPriceCode.mmSettlement}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#mmSpread
 * TypeOfPriceCode.mmSpread}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#mmSubscriptionNAV
 * TypeOfPriceCode.mmSubscriptionNAV}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#mmTax
 * TypeOfPriceCode.mmTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode#mmTaxableIncomePerShareCalculated
 * TypeOfPriceCode.mmTaxableIncomePerShareCalculated}</li>
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
public class TypeOfPriceCode {

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
	public static final MMCode mmAverage = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Average";
			definition = "Price is an average execution price.";
			owner_lazy = () -> TypeOfPriceCode.mmObject();
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
	public static final MMCode mmAverageOverride = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AverageOverride";
			definition = "Price is an override of the average price.";
			owner_lazy = () -> TypeOfPriceCode.mmObject();
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
	public static final MMCode mmCombined = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Combined";
			definition = "Price is composed of the combined expenses (used in the UK market).";
			owner_lazy = () -> TypeOfPriceCode.mmObject();
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
	public static final MMCode mmGrossOfAll = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GrossOfAll";
			definition = "Price is a gross execution price. The price is an all inclusive price, ie, including all charges, fees, and taxes.";
			owner_lazy = () -> TypeOfPriceCode.mmObject();
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
	public static final MMCode mmLimit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Limit";
			definition = "Price is the limit price of a limit order, eg, a customer might put in a limit order to sell financial instruments at 67 or to buy at 60.";
			owner_lazy = () -> TypeOfPriceCode.mmObject();
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
	public static final MMCode mmNet = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Net";
			definition = "Price is a net price, ie, net only of local broker's commission, local fees and local taxes.";
			owner_lazy = () -> TypeOfPriceCode.mmObject();
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
	public static final MMCode mmNetDisclosed = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NetDisclosed";
			definition = "Price is net to the disclosed client.";
			owner_lazy = () -> TypeOfPriceCode.mmObject();
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
	public static final MMCode mmNetOfAll = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NetOfAll";
			definition = "Price is a net price, ie, net of all charges, fees and taxes.";
			owner_lazy = () -> TypeOfPriceCode.mmObject();
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
	public static final MMCode mmNetUndisclosed = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NetUndisclosed";
			definition = "Price is net to the client undisclosed (used in the UK market).";
			owner_lazy = () -> TypeOfPriceCode.mmObject();
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
	public static final MMCode mmNotionalGross = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotionalGross";
			definition = "Price is notional gross (used in the UK market).";
			owner_lazy = () -> TypeOfPriceCode.mmObject();
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
	public static final MMCode mmParValue = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ParValue";
			definition = "Price is equal to the nominal or face value of the instrument.";
			owner_lazy = () -> TypeOfPriceCode.mmObject();
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoundedAverage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price  is a rounded average price."</li>
	 * </ul>
	 */
	public static final MMCode mmRoundedAverage = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RoundedAverage";
			definition = "Price  is a rounded average price.";
			owner_lazy = () -> TypeOfPriceCode.mmObject();
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Stop"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price is a stop price used in an order to buy.  The order becomes a market order when the financial instrument trades at or above the stop price after the order is submitted.  In an order to sell the order becomes a market order when the financial instrument trades at or below the stop price."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmStop = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Stop";
			definition = "Price is a stop price used in an order to buy.  The order becomes a market order when the financial instrument trades at or above the stop price after the order is submitted.  In an order to sell the order becomes a market order when the financial instrument trades at or below the stop price.";
			owner_lazy = () -> TypeOfPriceCode.mmObject();
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
	public static final MMCode mmBid = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Bid";
			definition = "Price is the calculated bid price of a dual-priced fund (offer-bid prices), ie, the selling price of the units for the investor.";
			owner_lazy = () -> TypeOfPriceCode.mmObject();
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
	public static final MMCode mmOffer = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Offer";
			definition = "Price is the calculated offer price of a dual-priced investment fund (offer-bid prices), ie, the buying price of the units for an investor.";
			owner_lazy = () -> TypeOfPriceCode.mmObject();
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
	public static final MMCode mmNetAssetValue = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NetAssetValue";
			definition = "Price is the net asset value per unit that is used either as a transacting price for a single-priced investment fund class, or as a notional price for the calculation of other prices.";
			owner_lazy = () -> TypeOfPriceCode.mmObject();
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
	public static final MMCode mmCreation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Creation";
			definition = "Price is the calculated creation price of a dual-priced investment fund (creation-cancellation prices) and the highest possible buying price of the units before the initial charge. The actual buying or offer price, which includes charges, will be higher.";
			owner_lazy = () -> TypeOfPriceCode.mmObject();
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
	public static final MMCode mmCancellation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Cancellation";
			definition = "Price is the calculated cancellation price of a dual-priced investment fund (creation-cancellation price), and the lowest possible valuation of the units on any one-day. The actual selling or bid price is usually higher.";
			owner_lazy = () -> TypeOfPriceCode.mmObject();
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
	public static final MMCode mmInterim = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Interim";
			definition = "Price is the non-official interim price given to an investor before the executed price.";
			owner_lazy = () -> TypeOfPriceCode.mmObject();
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
	public static final MMCode mmSwing = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Swing";
			definition = "Price is the calculated net asset value price of a single-priced investment fund. The price is adjusted to take into account the dealing costs due to individual large deals, or due to a significant imbalance in volumes of subscriptions vs redemptions, as an alternative to dilution levy.";
			owner_lazy = () -> TypeOfPriceCode.mmObject();
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
	public static final MMCode mmOther = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Other";
			definition = "Price is another type of price, which is not explicitly defined.";
			owner_lazy = () -> TypeOfPriceCode.mmObject();
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
	public static final MMCode mmMid = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Mid";
			definition = "Price is the average price between the bid and offer prices.";
			owner_lazy = () -> TypeOfPriceCode.mmObject();
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
	public static final MMCode mmReinvestment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Reinvestment";
			definition = "Price is the price used when reinvesting units after distribution.";
			owner_lazy = () -> TypeOfPriceCode.mmObject();
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
	public static final MMCode mmSwitch = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Switch";
			definition = "Price is the price used when transferring units between products.";
			owner_lazy = () -> TypeOfPriceCode.mmObject();
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
	public static final MMCode mmDailyDividendRate = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DailyDividendRate";
			definition = "Price is the net income of a financial instrument, calculated on each dealing day, and divided by all the units outstanding on that day.";
			owner_lazy = () -> TypeOfPriceCode.mmObject();
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
	public static final MMCode mmMarket = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Market";
			definition = "Price is the current market price.";
			owner_lazy = () -> TypeOfPriceCode.mmObject();
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
	public static final MMCode mmIndicative = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Indicative";
			definition = "Price is the estimated indicative price.";
			owner_lazy = () -> TypeOfPriceCode.mmObject();
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
	public static final MMCode mmActual = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Actual";
			definition = "True offer price.";
			owner_lazy = () -> TypeOfPriceCode.mmObject();
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
	public static final MMCode mmNonAdjustedUnpublished = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NonAdjustedUnpublished";
			definition = "The original NAV before the price of the investment fund was swung.";
			owner_lazy = () -> TypeOfPriceCode.mmObject();
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
	public static final MMCode mmGuaranteed = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Guaranteed";
			definition = "Price is a guaranteed price.";
			owner_lazy = () -> TypeOfPriceCode.mmObject();
			codeName = "GUAR";
		}
	};
	/**
	 * Price is an estimated net asset value per unit
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
	 * definition} = "Price is an estimated net asset value per unit"</li>
	 * </ul>
	 */
	public static final MMCode mmEstimatedNAV = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EstimatedNAV";
			definition = "Price is an estimated net asset value per unit";
			owner_lazy = () -> TypeOfPriceCode.mmObject();
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
	public static final MMCode mmGrossAssetValue = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GrossAssetValue";
			definition = "Price is the gross asset value per unit and includes the performance fee per share. It is used as the transacting price for a fund with equalisation. GAVL price minus the NAVL price = performance fee.";
			owner_lazy = () -> TypeOfPriceCode.mmObject();
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
	public static final MMCode mmEstimatedGAV = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EstimatedGAV";
			definition = "Price is the estimated gross asset value per unit and includes the performance fee per share. It is used as the transacting price for a fund with equalisation. GAVL price minus the NAVL price = performance fee.";
			owner_lazy = () -> TypeOfPriceCode.mmObject();
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
	public static final MMCode mmSidePocketNAV = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SidePocketNAV";
			definition = "Price is the estimated net asset value for the side pocket.";
			owner_lazy = () -> TypeOfPriceCode.mmObject();
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
	 * definition} = "Offer.  Price for which seller is willing to sell item."</li>
	 * </ul>
	 */
	public static final MMCode mmAsk = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Ask";
			definition = "Offer.  Price for which seller is willing to sell item.";
			owner_lazy = () -> TypeOfPriceCode.mmObject();
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
	public static final MMCode mmAuction = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Auction";
			definition = "Price selected as a crossing of an auction.";
			owner_lazy = () -> TypeOfPriceCode.mmObject();
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
	public static final MMCode mmCalculated = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Calculated";
			definition = "Price is calculated.";
			owner_lazy = () -> TypeOfPriceCode.mmObject();
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
	public static final MMCode mmClean = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Clean";
			definition = "Paid without accumulated interest.";
			owner_lazy = () -> TypeOfPriceCode.mmObject();
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
	public static final MMCode mmDirty = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Dirty";
			definition = "Paid with accumulated interest.";
			owner_lazy = () -> TypeOfPriceCode.mmObject();
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
	public static final MMCode mmDraw = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Draw";
			definition = "Price selected as a result of a lottery/tiebreaker.";
			owner_lazy = () -> TypeOfPriceCode.mmObject();
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
	public static final MMCode mmFairValue = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FairValue";
			definition = "Estimate of the potential market price.";
			owner_lazy = () -> TypeOfPriceCode.mmObject();
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
	public static final MMCode mmIndicativePaid = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IndicativePaid";
			definition = "Reduced and partial execution based on high bids and ask orders.";
			owner_lazy = () -> TypeOfPriceCode.mmObject();
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
	public static final MMCode mmKassa = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Kassa";
			definition = "Official declared price.";
			owner_lazy = () -> TypeOfPriceCode.mmObject();
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
	public static final MMCode mmPaid = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Paid";
			definition = "Price at which the trade was done.";
			owner_lazy = () -> TypeOfPriceCode.mmObject();
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
	public static final MMCode mmRedemptionNAV = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RedemptionNAV";
			definition = "Net Asset Value (NAV) applicable to redemptions.";
			owner_lazy = () -> TypeOfPriceCode.mmObject();
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
	public static final MMCode mmSettlement = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Settlement";
			definition = "Price used for the settlement of futures and options.";
			owner_lazy = () -> TypeOfPriceCode.mmObject();
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
	public static final MMCode mmSpread = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Spread";
			definition = "The difference between bid and ask.";
			owner_lazy = () -> TypeOfPriceCode.mmObject();
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
	public static final MMCode mmSubscriptionNAV = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SubscriptionNAV";
			definition = "Net Asset Value (NAV) applicable to subscriptions.";
			owner_lazy = () -> TypeOfPriceCode.mmObject();
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
	public static final MMCode mmTax = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Tax";
			definition = "Price for tax declaration purpose.";
			owner_lazy = () -> TypeOfPriceCode.mmObject();
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
	public static final MMCode mmTaxableIncomePerShareCalculated = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxableIncomePerShareCalculated";
			definition = "Specifies whether the fund calculates a taxable interest per share (TIS).";
			owner_lazy = () -> TypeOfPriceCode.mmObject();
			codeName = "TISC";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("AVER");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TypeOfPriceCode";
				definition = "Specifies the type of price and information about the price.";
				code_lazy = () -> Arrays.asList(TypeOfPriceCode.mmAverage, TypeOfPriceCode.mmAverageOverride, TypeOfPriceCode.mmCombined, TypeOfPriceCode.mmGrossOfAll, TypeOfPriceCode.mmLimit, TypeOfPriceCode.mmNet,
						TypeOfPriceCode.mmNetDisclosed, TypeOfPriceCode.mmNetOfAll, TypeOfPriceCode.mmNetUndisclosed, TypeOfPriceCode.mmNotionalGross, TypeOfPriceCode.mmParValue, TypeOfPriceCode.mmRoundedAverage, TypeOfPriceCode.mmStop,
						TypeOfPriceCode.mmBid, TypeOfPriceCode.mmOffer, TypeOfPriceCode.mmNetAssetValue, TypeOfPriceCode.mmCreation, TypeOfPriceCode.mmCancellation, TypeOfPriceCode.mmInterim, TypeOfPriceCode.mmSwing,
						TypeOfPriceCode.mmOther, TypeOfPriceCode.mmMid, TypeOfPriceCode.mmReinvestment, TypeOfPriceCode.mmSwitch, TypeOfPriceCode.mmDailyDividendRate, TypeOfPriceCode.mmMarket, TypeOfPriceCode.mmIndicative,
						TypeOfPriceCode.mmActual, TypeOfPriceCode.mmNonAdjustedUnpublished, TypeOfPriceCode.mmGuaranteed, TypeOfPriceCode.mmEstimatedNAV, TypeOfPriceCode.mmGrossAssetValue, TypeOfPriceCode.mmEstimatedGAV,
						TypeOfPriceCode.mmSidePocketNAV, TypeOfPriceCode.mmAsk, TypeOfPriceCode.mmAuction, TypeOfPriceCode.mmCalculated, TypeOfPriceCode.mmClean, TypeOfPriceCode.mmDirty, TypeOfPriceCode.mmDraw, TypeOfPriceCode.mmFairValue,
						TypeOfPriceCode.mmIndicativePaid, TypeOfPriceCode.mmKassa, TypeOfPriceCode.mmPaid, TypeOfPriceCode.mmRedemptionNAV, TypeOfPriceCode.mmSettlement, TypeOfPriceCode.mmSpread, TypeOfPriceCode.mmSubscriptionNAV,
						TypeOfPriceCode.mmTax, TypeOfPriceCode.mmTaxableIncomePerShareCalculated);
			}
		});
		return mmObject_lazy.get();
	}
}