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
 * Exchange of holdings for other securities and/or cash. The exchange can be
 * either mandatory or voluntary involving the exchange of outstanding
 * securities for different securities and/or cash. For example
 * "exchange offer", "capital reorganisation" or "funds separation".
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IntermediateSecurityDistributionTypeCode#ReverseRights
 * IntermediateSecurityDistributionTypeCode.ReverseRights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IntermediateSecurityDistributionTypeCode#BonusRights
 * IntermediateSecurityDistributionTypeCode.BonusRights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IntermediateSecurityDistributionTypeCode#DividendReinvestment
 * IntermediateSecurityDistributionTypeCode.DividendReinvestment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IntermediateSecurityDistributionTypeCode#CashDividend
 * IntermediateSecurityDistributionTypeCode.CashDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IntermediateSecurityDistributionTypeCode#DividendOption
 * IntermediateSecurityDistributionTypeCode.DividendOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IntermediateSecurityDistributionTypeCode#SubscriptionRights
 * IntermediateSecurityDistributionTypeCode.SubscriptionRights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IntermediateSecurityDistributionTypeCode#OpenOfferRights
 * IntermediateSecurityDistributionTypeCode.OpenOfferRights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IntermediateSecurityDistributionTypeCode#ScripDividendOrPayment
 * IntermediateSecurityDistributionTypeCode.ScripDividendOrPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IntermediateSecurityDistributionTypeCode#StockDividend
 * IntermediateSecurityDistributionTypeCode.StockDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IntermediateSecurityDistributionTypeCode#InterestPayment
 * IntermediateSecurityDistributionTypeCode.InterestPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IntermediateSecurityDistributionTypeCode#LiquidationDividendOrPayment
 * IntermediateSecurityDistributionTypeCode.LiquidationDividendOrPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IntermediateSecurityDistributionTypeCode#SpinOff
 * IntermediateSecurityDistributionTypeCode.SpinOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IntermediateSecurityDistributionTypeCode#StockSplit
 * IntermediateSecurityDistributionTypeCode.StockSplit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IntermediateSecurityDistributionTypeCode#Exchange
 * IntermediateSecurityDistributionTypeCode.Exchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IntermediateSecurityDistributionTypeCode#Merger
 * IntermediateSecurityDistributionTypeCode.Merger}</li>
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
 * <li>"BIDS"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IntermediateSecurityDistributionTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Exchange of holdings for other securities and/or cash. The exchange can be either mandatory or voluntary involving the exchange of outstanding securities for different securities and/or cash. For example \"exchange offer\", \"capital reorganisation\" or \"funds separation\"."
 * </li>
 * </ul>
 */
public class IntermediateSecurityDistributionTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Distribution of reverser rights.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IntermediateSecurityDistributionTypeCode
	 * IntermediateSecurityDistributionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BIDS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReverseRights"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Distribution of reverser rights."</li>
	 * </ul>
	 */
	public static final MMCode ReverseRights = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReverseRights";
			definition = "Distribution of reverser rights.";
			owner_lazy = () -> IntermediateSecurityDistributionTypeCode.mmObject();
			codeName = "BIDS";
		}
	};
	/**
	 * Distribution of bonus rights.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IntermediateSecurityDistributionTypeCode
	 * IntermediateSecurityDistributionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BONU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BonusRights"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Distribution of bonus rights."</li>
	 * </ul>
	 */
	public static final MMCode BonusRights = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BonusRights";
			definition = "Distribution of bonus rights.";
			owner_lazy = () -> IntermediateSecurityDistributionTypeCode.mmObject();
			codeName = "BONU";
		}
	};
	/**
	 * Distribution of dividend reinvestment securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IntermediateSecurityDistributionTypeCode
	 * IntermediateSecurityDistributionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DRIP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendReinvestment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Distribution of dividend reinvestment securities."</li>
	 * </ul>
	 */
	public static final MMCode DividendReinvestment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DividendReinvestment";
			definition = "Distribution of dividend reinvestment securities.";
			owner_lazy = () -> IntermediateSecurityDistributionTypeCode.mmObject();
			codeName = "DRIP";
		}
	};
	/**
	 * Distribution of cash to shareholders, in proportion to their equity
	 * holding. Ordinary dividends are recurring and regular. Shareholder must
	 * take cash and may be offered a choice of currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IntermediateSecurityDistributionTypeCode
	 * IntermediateSecurityDistributionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DVCA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Distribution of cash to shareholders, in proportion to their equity holding. Ordinary dividends are recurring and regular. Shareholder must take cash and may be offered a choice of currency."
	 * </li>
	 * </ul>
	 */
	public static final MMCode CashDividend = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashDividend";
			definition = "Distribution of cash to shareholders, in proportion to their equity holding. Ordinary dividends are recurring and regular. Shareholder must take cash and may be offered a choice of currency.";
			owner_lazy = () -> IntermediateSecurityDistributionTypeCode.mmObject();
			codeName = "DVCA";
		}
	};
	/**
	 * Distribution of dividend option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IntermediateSecurityDistributionTypeCode
	 * IntermediateSecurityDistributionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DVOP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Distribution of dividend option."</li>
	 * </ul>
	 */
	public static final MMCode DividendOption = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DividendOption";
			definition = "Distribution of dividend option.";
			owner_lazy = () -> IntermediateSecurityDistributionTypeCode.mmObject();
			codeName = "DVOP";
		}
	};
	/**
	 * Distribution of subscription rights.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IntermediateSecurityDistributionTypeCode
	 * IntermediateSecurityDistributionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXRI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubscriptionRights"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Distribution of subscription rights."</li>
	 * </ul>
	 */
	public static final MMCode SubscriptionRights = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SubscriptionRights";
			definition = "Distribution of subscription rights.";
			owner_lazy = () -> IntermediateSecurityDistributionTypeCode.mmObject();
			codeName = "EXRI";
		}
	};
	/**
	 * Distribution of open offer rights.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IntermediateSecurityDistributionTypeCode
	 * IntermediateSecurityDistributionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRIO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpenOfferRights"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Distribution of open offer rights."</li>
	 * </ul>
	 */
	public static final MMCode OpenOfferRights = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OpenOfferRights";
			definition = "Distribution of open offer rights.";
			owner_lazy = () -> IntermediateSecurityDistributionTypeCode.mmObject();
			codeName = "PRIO";
		}
	};
	/**
	 * Dividend or interest paid in the form of scrip.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IntermediateSecurityDistributionTypeCode
	 * IntermediateSecurityDistributionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DVSC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ScripDividendOrPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Dividend or interest paid in the form of scrip."</li>
	 * </ul>
	 */
	public static final MMCode ScripDividendOrPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ScripDividendOrPayment";
			definition = "Dividend or interest paid in the form of scrip.";
			owner_lazy = () -> IntermediateSecurityDistributionTypeCode.mmObject();
			codeName = "DVSC";
		}
	};
	/**
	 * Dividend paid to shareholders in the form of shares of stock.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IntermediateSecurityDistributionTypeCode
	 * IntermediateSecurityDistributionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DVSE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Dividend paid to shareholders in the form of shares of stock."</li>
	 * </ul>
	 */
	public static final MMCode StockDividend = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StockDividend";
			definition = "Dividend paid to shareholders in the form of shares of stock.";
			owner_lazy = () -> IntermediateSecurityDistributionTypeCode.mmObject();
			codeName = "DVSE";
		}
	};
	/**
	 * Interest payment distributed to holders of an interest bearing asset.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IntermediateSecurityDistributionTypeCode
	 * IntermediateSecurityDistributionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Interest payment distributed to holders of an interest bearing asset."</li>
	 * </ul>
	 */
	public static final MMCode InterestPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InterestPayment";
			definition = "Interest payment distributed to holders of an interest bearing asset.";
			owner_lazy = () -> IntermediateSecurityDistributionTypeCode.mmObject();
			codeName = "INTR";
		}
	};
	/**
	 * A distribution of cash, assets or both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IntermediateSecurityDistributionTypeCode
	 * IntermediateSecurityDistributionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LIQU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LiquidationDividendOrPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "A distribution of cash, assets or both."</li>
	 * </ul>
	 */
	public static final MMCode LiquidationDividendOrPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LiquidationDividendOrPayment";
			definition = "A distribution of cash, assets or both.";
			owner_lazy = () -> IntermediateSecurityDistributionTypeCode.mmObject();
			codeName = "LIQU";
		}
	};
	/**
	 * A distribution of subsidiary stock to the shareholders
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IntermediateSecurityDistributionTypeCode
	 * IntermediateSecurityDistributionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SOFF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpinOff"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "A distribution of subsidiary stock to the shareholders"</li>
	 * </ul>
	 */
	public static final MMCode SpinOff = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SpinOff";
			definition = "A distribution of subsidiary stock to the shareholders";
			owner_lazy = () -> IntermediateSecurityDistributionTypeCode.mmObject();
			codeName = "SOFF";
		}
	};
	/**
	 * Also known as change in nominal value or subdivision. Increase in a
	 * corporation's number of outstanding equities without any change in the
	 * shareholder's equity or the aggregate market value at the time of the
	 * split. Equity price and nominal value are reduced accordingly.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IntermediateSecurityDistributionTypeCode
	 * IntermediateSecurityDistributionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPLF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockSplit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Also known as change in nominal value or subdivision.\nIncrease in a corporation's number of outstanding equities without any change in the shareholder's equity or the aggregate market value at the time of the split. Equity price and nominal value are reduced accordingly."
	 * </li>
	 * </ul>
	 */
	public static final MMCode StockSplit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StockSplit";
			definition = "Also known as change in nominal value or subdivision.\nIncrease in a corporation's number of outstanding equities without any change in the shareholder's equity or the aggregate market value at the time of the split. Equity price and nominal value are reduced accordingly.";
			owner_lazy = () -> IntermediateSecurityDistributionTypeCode.mmObject();
			codeName = "SPLF";
		}
	};
	/**
	 * Exchange of holdings for other securities and/or cash. The exchange can
	 * be either mandatory or voluntary involving the exchange of outstanding
	 * securities for different securities and/or cash. For example
	 * "exchange offer", "capital reorganisation" or "funds separation".
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IntermediateSecurityDistributionTypeCode
	 * IntermediateSecurityDistributionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXOF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Exchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Exchange of holdings for other securities and/or cash. The exchange can be either mandatory or voluntary involving the exchange of outstanding securities for different securities and/or cash. For example \"exchange offer\", \"capital reorganisation\" or \"funds separation\"."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Exchange = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Exchange";
			definition = "Exchange of holdings for other securities and/or cash. The exchange can be either mandatory or voluntary involving the exchange of outstanding securities for different securities and/or cash. For example \"exchange offer\", \"capital reorganisation\" or \"funds separation\".";
			owner_lazy = () -> IntermediateSecurityDistributionTypeCode.mmObject();
			codeName = "EXOF";
		}
	};
	/**
	 * Exchange of outstanding securities, initiated by the issuer which may
	 * include options, as the result of two or more companies combining assets,
	 * that is, an external, third party company. Cash payments may accompany
	 * share exchange.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IntermediateSecurityDistributionTypeCode
	 * IntermediateSecurityDistributionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MRGR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Merger"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Exchange of outstanding securities, initiated by the issuer which may include options, as the result of two or more companies combining assets, that is, an external, third party company. Cash payments may accompany share exchange."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Merger = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Merger";
			definition = "Exchange of outstanding securities, initiated by the issuer which may include options, as the result of two or more companies combining assets, that is, an external, third party company. Cash payments may accompany share exchange.";
			owner_lazy = () -> IntermediateSecurityDistributionTypeCode.mmObject();
			codeName = "MRGR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("BIDS");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "IntermediateSecurityDistributionTypeCode";
				definition = "Exchange of holdings for other securities and/or cash. The exchange can be either mandatory or voluntary involving the exchange of outstanding securities for different securities and/or cash. For example \"exchange offer\", \"capital reorganisation\" or \"funds separation\".";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.IntermediateSecurityDistributionTypeCode.ReverseRights, com.tools20022.repository.codeset.IntermediateSecurityDistributionTypeCode.BonusRights,
						com.tools20022.repository.codeset.IntermediateSecurityDistributionTypeCode.DividendReinvestment, com.tools20022.repository.codeset.IntermediateSecurityDistributionTypeCode.CashDividend,
						com.tools20022.repository.codeset.IntermediateSecurityDistributionTypeCode.DividendOption, com.tools20022.repository.codeset.IntermediateSecurityDistributionTypeCode.SubscriptionRights,
						com.tools20022.repository.codeset.IntermediateSecurityDistributionTypeCode.OpenOfferRights, com.tools20022.repository.codeset.IntermediateSecurityDistributionTypeCode.ScripDividendOrPayment,
						com.tools20022.repository.codeset.IntermediateSecurityDistributionTypeCode.StockDividend, com.tools20022.repository.codeset.IntermediateSecurityDistributionTypeCode.InterestPayment,
						com.tools20022.repository.codeset.IntermediateSecurityDistributionTypeCode.LiquidationDividendOrPayment, com.tools20022.repository.codeset.IntermediateSecurityDistributionTypeCode.SpinOff,
						com.tools20022.repository.codeset.IntermediateSecurityDistributionTypeCode.StockSplit, com.tools20022.repository.codeset.IntermediateSecurityDistributionTypeCode.Exchange,
						com.tools20022.repository.codeset.IntermediateSecurityDistributionTypeCode.Merger);
			}
		});
		return mmObject_lazy.get();
	}
}