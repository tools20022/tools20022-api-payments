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
import com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the corporate action event type.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code#DividendReinvestment
 * CorporateActionEventTypeV3Code.mmDividendReinvestment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code#CapitalGainsDistribution
 * CorporateActionEventTypeV3Code.mmCapitalGainsDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code#CashDividend
 * CorporateActionEventTypeV3Code.mmCashDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code#DividendOption
 * CorporateActionEventTypeV3Code.mmDividendOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code#StockDividend
 * CorporateActionEventTypeV3Code.mmStockDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code#LiquidationDividend
 * CorporateActionEventTypeV3Code.mmLiquidationDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code#Merger
 * CorporateActionEventTypeV3Code.mmMerger}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code#NameChange
 * CorporateActionEventTypeV3Code.mmNameChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code#SpinOff
 * CorporateActionEventTypeV3Code.mmSpinOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code#Tender
 * CorporateActionEventTypeV3Code.mmTender}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code#BonusIssue
 * CorporateActionEventTypeV3Code.mmBonusIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code#Change
 * CorporateActionEventTypeV3Code.mmChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code#Redenomination
 * CorporateActionEventTypeV3Code.mmRedenomination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code#ExchangeOption
 * CorporateActionEventTypeV3Code.mmExchangeOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code#Exchange
 * CorporateActionEventTypeV3Code.mmExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code#DecreaseInValue
 * CorporateActionEventTypeV3Code.mmDecreaseInValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code#EarlyRedemption
 * CorporateActionEventTypeV3Code.mmEarlyRedemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code#FinalMaturity
 * CorporateActionEventTypeV3Code.mmFinalMaturity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code#InterestPayment
 * CorporateActionEventTypeV3Code.mmInterestPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code#Prefunding
 * CorporateActionEventTypeV3Code.mmPrefunding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code#Remarketing
 * CorporateActionEventTypeV3Code.mmRemarketing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code#Subscription
 * CorporateActionEventTypeV3Code.mmSubscription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code#Attachment
 * CorporateActionEventTypeV3Code.mmAttachment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code#Conversion
 * CorporateActionEventTypeV3Code.mmConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code#Detachment
 * CorporateActionEventTypeV3Code.mmDetachment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code#ActiveTradingStatus
 * CorporateActionEventTypeV3Code.mmActiveTradingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code#AnnualGeneralMeeting
 * CorporateActionEventTypeV3Code.mmAnnualGeneralMeeting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code#Bankruptcy
 * CorporateActionEventTypeV3Code.mmBankruptcy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code#BondDefault
 * CorporateActionEventTypeV3Code.mmBondDefault}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code#CallOnIntermediateSecurities
 * CorporateActionEventTypeV3Code.mmCallOnIntermediateSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code#Capitalisation
 * CorporateActionEventTypeV3Code.mmCapitalisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code#Consent
 * CorporateActionEventTypeV3Code.mmConsent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code#CompanyOption
 * CorporateActionEventTypeV3Code.mmCompanyOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code#CouponStripping
 * CorporateActionEventTypeV3Code.mmCouponStripping}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code#CourtMeeting
 * CorporateActionEventTypeV3Code.mmCourtMeeting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code#Disclosure
 * CorporateActionEventTypeV3Code.mmDisclosure}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code#Drawing
 * CorporateActionEventTypeV3Code.mmDrawing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code#DutchAuction
 * CorporateActionEventTypeV3Code.mmDutchAuction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code#ExtraordinaryGeneralMeeting
 * CorporateActionEventTypeV3Code.mmExtraordinaryGeneralMeeting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code#FullCall
 * CorporateActionEventTypeV3Code.mmFullCall}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code#IncreaseInValue
 * CorporateActionEventTypeV3Code.mmIncreaseInValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code#InstalmentCall
 * CorporateActionEventTypeV3Code.mmInstalmentCall}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code#InterestPaymentWithPrincipal
 * CorporateActionEventTypeV3Code.mmInterestPaymentWithPrincipal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code#IntermediateSecuritiesDistribution
 * CorporateActionEventTypeV3Code.mmIntermediateSecuritiesDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code#MaturityExtension
 * CorporateActionEventTypeV3Code.mmMaturityExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code#NonUSTEFRADCertification
 * CorporateActionEventTypeV3Code.mmNonUSTEFRADCertification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code#OddLotSalePurchase
 * CorporateActionEventTypeV3Code.mmOddLotSalePurchase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code#OrdinaryGeneralMeeting
 * CorporateActionEventTypeV3Code.mmOrdinaryGeneralMeeting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code#OtherEvent
 * CorporateActionEventTypeV3Code.mmOtherEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code#PariPassu
 * CorporateActionEventTypeV3Code.mmPariPassu}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code#PartialRedemptionWithNominalValueReduction
 * CorporateActionEventTypeV3Code.mmPartialRedemptionWithNominalValueReduction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code#PartialRedemptionWithoutNominalValueReduction
 * CorporateActionEventTypeV3Code.
 * mmPartialRedemptionWithoutNominalValueReduction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code#PayInKind
 * CorporateActionEventTypeV3Code.mmPayInKind}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code#PlaceOfIncorporation
 * CorporateActionEventTypeV3Code.mmPlaceOfIncorporation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code#PriorityIssue
 * CorporateActionEventTypeV3Code.mmPriorityIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code#PutRedemption
 * CorporateActionEventTypeV3Code.mmPutRedemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code#RemarketingAgreement
 * CorporateActionEventTypeV3Code.mmRemarketingAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code#RepurchaseOffer
 * CorporateActionEventTypeV3Code.mmRepurchaseOffer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code#ReverseStockSplit
 * CorporateActionEventTypeV3Code.mmReverseStockSplit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code#RightsIssue
 * CorporateActionEventTypeV3Code.mmRightsIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code#ScripDividend
 * CorporateActionEventTypeV3Code.mmScripDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code#SharesPremiumDividend
 * CorporateActionEventTypeV3Code.mmSharesPremiumDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code#SmallestNegotiableUnit
 * CorporateActionEventTypeV3Code.mmSmallestNegotiableUnit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code#StockSplit
 * CorporateActionEventTypeV3Code.mmStockSplit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code#TaxReclaim
 * CorporateActionEventTypeV3Code.mmTaxReclaim}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code#TradingStatusDelisted
 * CorporateActionEventTypeV3Code.mmTradingStatusDelisted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code#TradingStatusSuspended
 * CorporateActionEventTypeV3Code.mmTradingStatusSuspended}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code#WarrantExercise
 * CorporateActionEventTypeV3Code.mmWarrantExercise}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code#WithholdingTaxReliefCertification
 * CorporateActionEventTypeV3Code.mmWithholdingTaxReliefCertification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code#Worthless
 * CorporateActionEventTypeV3Code.mmWorthless}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code#ClassActionProposedSettlement
 * CorporateActionEventTypeV3Code.mmClassActionProposedSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code#CapitalDistribution
 * CorporateActionEventTypeV3Code.mmCapitalDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code#CreditEvent
 * CorporateActionEventTypeV3Code.mmCreditEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code#SecuritiesHoldersMeeting
 * CorporateActionEventTypeV3Code.mmSecuritiesHoldersMeeting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code#CashDistributionFromNonEligibleSecuritiesSales
 * CorporateActionEventTypeV3Code.
 * mmCashDistributionFromNonEligibleSecuritiesSales}</li>
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
 * <li>"DRIP"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionEventTypeV3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the corporate action event type."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CorporateActionEventTypeV3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Event is a dividend payment type where cash dividend is rolled over into
	 * additional shares in the issuing company.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
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
	 * definition} =
	 * "Event is a dividend payment type where cash dividend is rolled over into additional shares in the issuing company."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV3Code DividendReinvestment = new CorporateActionEventTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DividendReinvestment";
			definition = "Event is a dividend payment type where cash dividend is rolled over into additional shares in the issuing company.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.mmObject();
			codeName = "DRIP";
		}
	};
	/**
	 * Event is the distribution of profits resulting from the sale of
	 * securities. Shareholders of mutual funds, unit trusts, or Sicavs are
	 * recipients of capital gains distributions and are often reinvested in
	 * additional shares of the fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CAPG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapitalGainsDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event is the distribution of profits resulting from the sale of securities. Shareholders of mutual funds, unit trusts, or Sicavs are recipients of capital gains distributions and are often reinvested in additional shares of the fund."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV3Code CapitalGainsDistribution = new CorporateActionEventTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CapitalGainsDistribution";
			definition = "Event is the distribution of profits resulting from the sale of securities. Shareholders of mutual funds, unit trusts, or Sicavs are recipients of capital gains distributions and are often reinvested in additional shares of the fund.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.mmObject();
			codeName = "CAPG";
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
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
	public static final CorporateActionEventTypeV3Code CashDividend = new CorporateActionEventTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashDividend";
			definition = "Distribution of cash to shareholders, in proportion to their equity holding. Ordinary dividends are recurring and regular. Shareholder must take cash and may be offered a choice of currency.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.mmObject();
			codeName = "DVCA";
		}
	};
	/**
	 * Event is a distribution of a dividend to shareholders with the choice of
	 * payment method. The shareholder must choose the form of payment - stock,
	 * cash, or both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
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
	 * definition} =
	 * "Event is a distribution of a dividend to shareholders with the choice of payment method. The shareholder must choose the form of payment - stock, cash, or both."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV3Code DividendOption = new CorporateActionEventTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DividendOption";
			definition = "Event is a distribution of a dividend to shareholders with the choice of payment method. The shareholder must choose the form of payment - stock, cash, or both.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.mmObject();
			codeName = "DVOP";
		}
	};
	/**
	 * Event is a dividend paid to shareholders in the form of shares of stock
	 * in the issuing company or in another company. The shareholder must take
	 * stock and is not offered a choice in the form of distribution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
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
	 * "Event is a dividend paid to shareholders in the form of shares of stock in the issuing company or in another company. The shareholder must take stock and is not offered a choice in the form of distribution."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV3Code StockDividend = new CorporateActionEventTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StockDividend";
			definition = "Event is a dividend paid to shareholders in the form of shares of stock in the issuing company or in another company. The shareholder must take stock and is not offered a choice in the form of distribution.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.mmObject();
			codeName = "DVSE";
		}
	};
	/**
	 * A distribution of cash, assets or both. Debt may be paid in order of
	 * priority based on preferred claims to assets specified by the security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LIQU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LiquidationDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A distribution of cash, assets or both. Debt may be paid in order of priority based on preferred claims to assets specified by the security."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV3Code LiquidationDividend = new CorporateActionEventTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LiquidationDividend";
			definition = "A distribution of cash, assets or both. Debt may be paid in order of priority based on preferred claims to assets specified by the security.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.mmObject();
			codeName = "LIQU";
		}
	};
	/**
	 * Event is a mandatory or voluntary exchange of outstanding securities as
	 * the result of two or more companies combining assets. Cash payments may
	 * accompany share exchange.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MRGR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Merger"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event is a mandatory or voluntary exchange of outstanding securities as the result of two or more companies combining assets. Cash payments may accompany share exchange."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV3Code Merger = new CorporateActionEventTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Merger";
			definition = "Event is a mandatory or voluntary exchange of outstanding securities as the result of two or more companies combining assets. Cash payments may accompany share exchange.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.mmObject();
			codeName = "MRGR";
		}
	};
	/**
	 * Event is a name change. The issuing company changes its name. The event
	 * shows the change from old name to new name and may involve surrendering
	 * physical shares with the old name to the registrar.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NAME"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NameChange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event is a name change. The issuing company changes its name. The event shows the change from old name to new name and may involve surrendering physical shares with the old name to the registrar."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV3Code NameChange = new CorporateActionEventTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NameChange";
			definition = "Event is a name change. The issuing company changes its name. The event shows the change from old name to new name and may involve surrendering physical shares with the old name to the registrar.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.mmObject();
			codeName = "NAME";
		}
	};
	/**
	 * Event is a demerger or distribution or an unbundling. It is a
	 * distribution of subsidiary stock to the shareholders of the parent
	 * company without a surrender of shares. A spin-off represents a form of
	 * divestiture resulting in an independent company. Normally this is without
	 * cost to the parent issue shareholder.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
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
	 * definition} =
	 * "Event is a demerger or distribution or an unbundling. It is a distribution of subsidiary stock to the shareholders of the parent company without a surrender of shares. A spin-off represents a form of divestiture resulting in an independent company. Normally this is without cost to the parent issue shareholder."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV3Code SpinOff = new CorporateActionEventTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SpinOff";
			definition = "Event is a demerger or distribution or an unbundling. It is a distribution of subsidiary stock to the shareholders of the parent company without a surrender of shares. A spin-off represents a form of divestiture resulting in an independent company. Normally this is without cost to the parent issue shareholder.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.mmObject();
			codeName = "SOFF";
		}
	};
	/**
	 * Event is an acquisition or take-over or offre publique de retrait (FR) or
	 * purchase offer or buy-back. It is an offer made to shareholders
	 * requesting them to sell (tender) their shares for a specified price
	 * usually at a premium over prevailing market price. Generally, the
	 * objective of a tender offer is to take control of the target company.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TEND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tender"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event is an acquisition or take-over or offre publique de retrait (FR) or purchase offer or buy-back. It is an offer made to shareholders requesting them to sell (tender) their shares for a specified price usually at a premium over prevailing market price. Generally, the objective of a tender offer is to take control of the target company."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV3Code Tender = new CorporateActionEventTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Tender";
			definition = "Event is an acquisition or take-over or offre publique de retrait (FR) or purchase offer or buy-back. It is an offer made to shareholders requesting them to sell (tender) their shares for a specified price usually at a premium over prevailing market price. Generally, the objective of a tender offer is to take control of the target company.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.mmObject();
			codeName = "TEND";
		}
	};
	/**
	 * Event is a bonus issue or scrip issue or capitalisation issue. Security
	 * holders are awarded additional assets free of payment from the issuer in
	 * proportion to their holding. A bonus issue is typically represented by
	 * shares, rights or warrants. Nominal value doesn't change. Holder may be
	 * offered choice of form.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BONU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BonusIssue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event is a bonus issue or scrip issue or capitalisation issue. Security holders are awarded additional assets free of payment from the issuer in proportion to their holding. A bonus issue is typically represented by shares, rights or warrants. Nominal value doesn't change. Holder may be offered choice of form."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV3Code BonusIssue = new CorporateActionEventTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BonusIssue";
			definition = "Event is a bonus issue or scrip issue or capitalisation issue. Security holders are awarded additional assets free of payment from the issuer in proportion to their holding. A bonus issue is typically represented by shares, rights or warrants. Nominal value doesn't change. Holder may be offered choice of form.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.mmObject();
			codeName = "BONU";
		}
	};
	/**
	 * Information regarding a change further described in the corporate action
	 * details.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CHAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Change"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information regarding a change further described in the corporate action details."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV3Code Change = new CorporateActionEventTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Change";
			definition = "Information regarding a change further described in the corporate action details.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.mmObject();
			codeName = "CHAN";
		}
	};
	/**
	 * Event by which the unit (currency and/or nominal) of a security is
	 * restated, eg, nominal/par value of security in a national currency is
	 * restated in another currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REDO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Redenomination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event by which the unit (currency and/or nominal) of a security is restated, eg, nominal/par value of security in a national currency is restated in another currency."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV3Code Redenomination = new CorporateActionEventTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Redenomination";
			definition = "Event by which the unit (currency and/or nominal) of a security is restated, eg, nominal/par value of security in a national currency is restated in another currency.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.mmObject();
			codeName = "REDO";
		}
	};
	/**
	 * Event is an option for the shareholders to exchange their securities for
	 * other securities and/or cash. Exchange options are mentioned in the terms
	 * and conditions of a security and are valid during the whole lifetime of a
	 * security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXOP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event is an option for the shareholders to exchange their securities for other securities and/or cash. Exchange options are mentioned in the terms and conditions of a security and are valid during the whole lifetime of a security."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV3Code ExchangeOption = new CorporateActionEventTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExchangeOption";
			definition = "Event is an option for the shareholders to exchange their securities for other securities and/or cash. Exchange options are mentioned in the terms and conditions of a security and are valid during the whole lifetime of a security.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.mmObject();
			codeName = "EXOP";
		}
	};
	/**
	 * Exchange of holdings for other securities and/or cash. The exchange can
	 * be either mandatory or voluntary involving the exchange of outstanding
	 * securities for different securities and/or cash. For example
	 * "exchange offer", "capital reorganisation" or "funds separation" .
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
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
	 * "Exchange of holdings for other securities and/or cash. The exchange can be either mandatory or voluntary involving the exchange of outstanding securities for different securities and/or cash. For example \"exchange offer\", \"capital reorganisation\" or \"funds separation\" ."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV3Code Exchange = new CorporateActionEventTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Exchange";
			definition = "Exchange of holdings for other securities and/or cash. The exchange can be either mandatory or voluntary involving the exchange of outstanding securities for different securities and/or cash. For example \"exchange offer\", \"capital reorganisation\" or \"funds separation\" .";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.mmObject();
			codeName = "EXOF";
		}
	};
	/**
	 * Reduction of face value of a single share or the value of fund assets.
	 * The number of circulating shares/units remains unchanged. This event may
	 * include a cash payout to holders.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DECR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DecreaseInValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reduction of face value of a single share or the value of fund assets. The number of circulating shares/units remains unchanged. This event may include a cash payout to holders."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV3Code DecreaseInValue = new CorporateActionEventTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DecreaseInValue";
			definition = "Reduction of face value of a single share or the value of fund assets. The number of circulating shares/units remains unchanged. This event may include a cash payout to holders.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.mmObject();
			codeName = "DECR";
		}
	};
	/**
	 * This includes drawing, partial and full call, put. Redemption in part or
	 * full before the scheduled final maturity date of a security, subject to
	 * the terms and conditions of the issue. Drawing - Securities are redeemed
	 * in part by lottery. Partial Call - Securities are redeemed in part by
	 * reducing proportionally the outstanding amount of securities. Put - Early
	 * redemption of a bond at the election of the bondholder. Full Call - The
	 * entire outstanding of a security is redeemed by the issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ERED"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarlyRedemption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "This includes drawing, partial and full call, put.\nRedemption in part or full before the scheduled final maturity date of a security, subject to the terms and conditions of the issue. \nDrawing - Securities are redeemed in part by lottery.\nPartial Call - Securities are redeemed in part by reducing proportionally the outstanding amount of securities.\nPut - Early redemption of a bond at the election of the bondholder.\nFull Call - The entire outstanding of a security is redeemed by the issuer."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV3Code EarlyRedemption = new CorporateActionEventTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EarlyRedemption";
			definition = "This includes drawing, partial and full call, put.\nRedemption in part or full before the scheduled final maturity date of a security, subject to the terms and conditions of the issue. \nDrawing - Securities are redeemed in part by lottery.\nPartial Call - Securities are redeemed in part by reducing proportionally the outstanding amount of securities.\nPut - Early redemption of a bond at the election of the bondholder.\nFull Call - The entire outstanding of a security is redeemed by the issuer.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.mmObject();
			codeName = "ERED";
		}
	};
	/**
	 * The redemption of an entire issue outstanding of securities, eg, bonds,
	 * preferred equity, funds, by the issuer or its agent, eg, asset manager,
	 * at final maturity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REDM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinalMaturity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The redemption of an entire issue outstanding of securities, eg, bonds, preferred equity, funds, by the issuer or its agent, eg, asset manager, at final maturity."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV3Code FinalMaturity = new CorporateActionEventTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FinalMaturity";
			definition = "The redemption of an entire issue outstanding of securities, eg, bonds, preferred equity, funds, by the issuer or its agent, eg, asset manager, at final maturity.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.mmObject();
			codeName = "REDM";
		}
	};
	/**
	 * Regular interest payment distributed to holders of an interest bearing
	 * asset.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
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
	 * "Regular interest payment distributed to holders of an interest bearing asset."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV3Code InterestPayment = new CorporateActionEventTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InterestPayment";
			definition = "Regular interest payment distributed to holders of an interest bearing asset.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.mmObject();
			codeName = "INTR";
		}
	};
	/**
	 * Also called partial defeasance. Issuer has money set aside to redeem a
	 * portion of an issue and the indenture states that the securities could be
	 * called earlier than the stated maturity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PDEF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Prefunding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Also called partial defeasance. Issuer has money set aside to redeem a portion of an issue and the indenture states that the securities could be called earlier than the stated maturity."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV3Code Prefunding = new CorporateActionEventTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Prefunding";
			definition = "Also called partial defeasance. Issuer has money set aside to redeem a portion of an issue and the indenture states that the securities could be called earlier than the stated maturity.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.mmObject();
			codeName = "PDEF";
		}
	};
	/**
	 * Purchase and sale of remarketed preferred equities/bonds through the
	 * negotiation of interest rate between the issuers and the holders.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RMRK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Remarketing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Purchase and sale of remarketed preferred equities/bonds through the negotiation of interest rate between the issuers and the holders."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV3Code Remarketing = new CorporateActionEventTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Remarketing";
			definition = "Purchase and sale of remarketed preferred equities/bonds through the negotiation of interest rate between the issuers and the holders.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.mmObject();
			codeName = "RMRK";
		}
	};
	/**
	 * The ability for security holders to purchase (additional or new)
	 * securities at a certain price, in proportion to their holding.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SUBS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Subscription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The ability for security holders to purchase (additional or new) securities at a certain price, in proportion to their holding."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV3Code Subscription = new CorporateActionEventTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Subscription";
			definition = "The ability for security holders to purchase (additional or new) securities at a certain price, in proportion to their holding.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.mmObject();
			codeName = "SUBS";
		}
	};
	/**
	 * Combination of different security types to create a unit. Units are
	 * usually comprised of warrants and bonds or warrants and equities.
	 * Securities may be combined at the request of the security holder or based
	 * on market convention.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ATTI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Attachment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Combination of different security types to create a unit. Units are usually comprised of warrants and bonds or warrants and equities. Securities may be combined at the request of the security holder or based on market convention."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV3Code Attachment = new CorporateActionEventTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Attachment";
			definition = "Combination of different security types to create a unit. Units are usually comprised of warrants and bonds or warrants and equities. Securities may be combined at the request of the security holder or based on market convention.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.mmObject();
			codeName = "ATTI";
		}
	};
	/**
	 * Conversion of securities ( generally convertible bonds or preferred
	 * shares) into another form of securities ( usually common shares) at a
	 * pre-stated price/ratio.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CONV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Conversion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Conversion of securities ( generally convertible bonds or preferred shares) into another form of securities ( usually common shares) at a pre-stated price/ratio."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV3Code Conversion = new CorporateActionEventTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Conversion";
			definition = "Conversion of securities ( generally convertible bonds or preferred shares) into another form of securities ( usually common shares) at a pre-stated price/ratio.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.mmObject();
			codeName = "CONV";
		}
	};
	/**
	 * Separation of components that comprise a security, eg, usually units
	 * comprised of warrants and bond or warrants and equity . Units may be
	 * broken up at the request of the security holder or based on market
	 * convention.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DETI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Detachment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Separation of components that comprise a security, eg, usually units comprised of warrants and bond or warrants and equity . Units may be broken up at the request of the security holder or based on market convention."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV3Code Detachment = new CorporateActionEventTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Detachment";
			definition = "Separation of components that comprise a security, eg, usually units comprised of warrants and bond or warrants and equity . Units may be broken up at the request of the security holder or based on market convention.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.mmObject();
			codeName = "DETI";
		}
	};
	/**
	 * Trading in security has commenced or security has been re-activated after
	 * a suspension in trading.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACTV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActiveTradingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trading in security has commenced or security has been re-activated after a suspension in trading."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV3Code ActiveTradingStatus = new CorporateActionEventTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ActiveTradingStatus";
			definition = "Trading in security has commenced or security has been re-activated after a suspension in trading.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.mmObject();
			codeName = "ACTV";
		}
	};
	/**
	 * Meeting Annual general meeting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MEET"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AnnualGeneralMeeting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Meeting Annual general meeting."</li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV3Code AnnualGeneralMeeting = new CorporateActionEventTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AnnualGeneralMeeting";
			definition = "Meeting Annual general meeting.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.mmObject();
			codeName = "MEET";
		}
	};
	/**
	 * Legal status of a company unable to pay creditors. Bankruptcy usually
	 * involves a formal court ruling. Securities may become valueless.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BRUP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bankruptcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Legal status of a company unable to pay creditors. Bankruptcy usually involves a formal court ruling. Securities may become valueless."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV3Code Bankruptcy = new CorporateActionEventTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Bankruptcy";
			definition = "Legal status of a company unable to pay creditors. Bankruptcy usually involves a formal court ruling. Securities may become valueless.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.mmObject();
			codeName = "BRUP";
		}
	};
	/**
	 * Failure by the company to perform obligations defined as default events
	 * under the bond agreement and that have not been remedied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DFLT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BondDefault"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Failure by the company to perform obligations defined as default events under the bond agreement and that have not been remedied."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV3Code BondDefault = new CorporateActionEventTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BondDefault";
			definition = "Failure by the company to perform obligations defined as default events under the bond agreement and that have not been remedied.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.mmObject();
			codeName = "DFLT";
		}
	};
	/**
	 * Call or exercise on nil paid securities or intermediate securities
	 * resulting from an intermediate securities distribution (RHDI). This code
	 * is used for the second event, when an intermediate securities' issue
	 * (rights/coupons) is composed of two events, the first event being the
	 * distribution of intermediate securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXRI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CallOnIntermediateSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Call or exercise on nil paid securities or intermediate securities resulting from an intermediate securities distribution (RHDI). This code is used for the second event, when an intermediate securities' issue (rights/coupons) is composed of two events, the first event being the distribution of intermediate securities."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV3Code CallOnIntermediateSecurities = new CorporateActionEventTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CallOnIntermediateSecurities";
			definition = "Call or exercise on nil paid securities or intermediate securities resulting from an intermediate securities distribution (RHDI). This code is used for the second event, when an intermediate securities' issue (rights/coupons) is composed of two events, the first event being the distribution of intermediate securities.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.mmObject();
			codeName = "EXRI";
		}
	};
	/**
	 * Increase of the current principal of a debt instrument without increasing
	 * the nominal value. It normally arises from the incorporation of due but
	 * unpaid interest into the principal. This is commonly done by increasing
	 * the pool factor value, eg, capitalisation, and negative amortisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CAPI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Capitalisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Increase of the current principal of a debt instrument without increasing the nominal value. It normally arises from the incorporation of due but unpaid interest into the principal. This is commonly done by increasing the pool factor value, eg, capitalisation, and negative amortisation."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV3Code Capitalisation = new CorporateActionEventTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Capitalisation";
			definition = "Increase of the current principal of a debt instrument without increasing the nominal value. It normally arises from the incorporation of due but unpaid interest into the principal. This is commonly done by increasing the pool factor value, eg, capitalisation, and negative amortisation.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.mmObject();
			codeName = "CAPI";
		}
	};
	/**
	 * Procedure that aims to obtain consent of holder to a proposal by the
	 * issuer or a third party intended to progress an event to the next stage.
	 * This procedure is not required to be linked to the organisation of a
	 * formal meeting. For example, consent to approve a plan of reorganisation
	 * for a bankruptcy proceeding.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CONS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Consent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Procedure that aims to obtain consent of holder  to a proposal by the issuer or a third party intended to progress an event to the next stage. This procedure is not required to be linked to the organisation of a formal meeting. For example, consent to approve a plan of reorganisation for a bankruptcy proceeding."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV3Code Consent = new CorporateActionEventTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Consent";
			definition = "Procedure that aims to obtain consent of holder  to a proposal by the issuer or a third party intended to progress an event to the next stage. This procedure is not required to be linked to the organisation of a formal meeting. For example, consent to approve a plan of reorganisation for a bankruptcy proceeding.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.mmObject();
			codeName = "CONS";
		}
	};
	/**
	 * A Company Option may be granted by the company, allowing the holder to
	 * take up shares at some future date(s) at a pre arranged price in the
	 * company. A company may not grant options which enable the holder to take
	 * up unissued shares at a time which is five or more years from the date of
	 * the grant. Option holders are not members of a company. They are
	 * contingent creditors of a company and hence may, in some instances, be
	 * entitled to vote on and be bound by a scheme of arrangement between the
	 * creditors and the company. As many options have multiple exercise periods
	 * a company option will either lapse or carry on to the next expiry date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COOP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompanyOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A Company Option may be granted by the company, allowing the holder to take up shares at some future date(s) at a pre arranged price in the company. A company may not grant options which enable the holder to take up unissued shares at a time which is five or more years from the date of the grant. Option holders are not members of a company. They are contingent creditors of a company and hence may, in some instances, be entitled to vote on and be bound by a scheme of arrangement between the creditors and the company. As many options have multiple exercise periods a company option will either lapse or carry on to the next expiry date."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV3Code CompanyOption = new CorporateActionEventTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CompanyOption";
			definition = "A Company Option may be granted by the company, allowing the holder to take up shares at some future date(s) at a pre arranged price in the company. A company may not grant options which enable the holder to take up unissued shares at a time which is five or more years from the date of the grant. Option holders are not members of a company. They are contingent creditors of a company and hence may, in some instances, be entitled to vote on and be bound by a scheme of arrangement between the creditors and the company. As many options have multiple exercise periods a company option will either lapse or carry on to the next expiry date.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.mmObject();
			codeName = "COOP";
		}
	};
	/**
	 * Coupon stripping is the process whereby interest coupons for future
	 * payment dates are separated from the security corpus that entitles the
	 * holder to the principal repayment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CPST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CouponStripping"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Coupon stripping is the process whereby interest coupons for future payment dates are separated from the security corpus that entitles the holder to the principal repayment."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV3Code CouponStripping = new CorporateActionEventTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CouponStripping";
			definition = "Coupon stripping is the process whereby interest coupons for future payment dates are separated from the security corpus that entitles the holder to the principal repayment.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.mmObject();
			codeName = "CPST";
		}
	};
	/**
	 * Announcement of a meeting at a Court.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CMET"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CourtMeeting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Announcement of a meeting at a Court."</li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV3Code CourtMeeting = new CorporateActionEventTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CourtMeeting";
			definition = "Announcement of a meeting at a Court.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.mmObject();
			codeName = "CMET";
		}
	};
	/**
	 * Requirement for holders or beneficial owners to disclose their name,
	 * location and holdings of any issue to the issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DSCL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Disclosure"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Requirement for holders or beneficial owners to disclose their name, location and holdings of any issue to the issuer."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV3Code Disclosure = new CorporateActionEventTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Disclosure";
			definition = "Requirement for holders or beneficial owners to disclose their name, location and holdings of any issue to the issuer.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.mmObject();
			codeName = "DSCL";
		}
	};
	/**
	 * Redemption in part before the scheduled final maturity date of a
	 * security. Drawing is distinct from partial call since drawn bonds are
	 * chosen by lottery and with no reduction in nominal value.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DRAW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Drawing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Redemption in part before the scheduled final maturity date of a security. Drawing is distinct from partial call since drawn bonds are chosen by lottery and with no reduction in nominal value."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV3Code Drawing = new CorporateActionEventTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Drawing";
			definition = "Redemption in part before the scheduled final maturity date of a security. Drawing is distinct from partial call since drawn bonds are chosen by lottery and with no reduction in nominal value.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.mmObject();
			codeName = "DRAW";
		}
	};
	/**
	 * An action by a party wishing to acquire a security. Holders of the
	 * security are invited to make an offer to sell, within a specific price
	 * range. The acquiring party will buy from the holder with lowest offer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DTCH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DutchAuction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An action by a party wishing to acquire a security. Holders of the security are invited to make an offer to sell, within a specific price range. The acquiring party will buy from the holder with lowest offer."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV3Code DutchAuction = new CorporateActionEventTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DutchAuction";
			definition = "An action by a party wishing to acquire a security. Holders of the security are invited to make an offer to sell, within a specific price range. The acquiring party will buy from the holder with lowest offer.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.mmObject();
			codeName = "DTCH";
		}
	};
	/**
	 * Extraordinary or Special General Meeting. Extraordinary or special
	 * general meeting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "XMET"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtraordinaryGeneralMeeting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Extraordinary or Special General Meeting. Extraordinary or special general meeting."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV3Code ExtraordinaryGeneralMeeting = new CorporateActionEventTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExtraordinaryGeneralMeeting";
			definition = "Extraordinary or Special General Meeting. Extraordinary or special general meeting.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.mmObject();
			codeName = "XMET";
		}
	};
	/**
	 * The redemption of an entire issue outstanding of securities, eg, bonds,
	 * preferred equity, funds, by the issuer or its agent, eg, asset
	 * manager,before final maturity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MCAL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullCall"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The redemption of an entire issue outstanding of securities, eg, bonds, preferred equity, funds, by the issuer or its agent, eg, asset manager,before final maturity."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV3Code FullCall = new CorporateActionEventTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FullCall";
			definition = "The redemption of an entire issue outstanding of securities, eg, bonds, preferred equity, funds, by the issuer or its agent, eg, asset manager,before final maturity.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.mmObject();
			codeName = "MCAL";
		}
	};
	/**
	 * Increase in the face value of a single security. The number of
	 * circulating securities remains unchanged .
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INCR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncreaseInValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Increase in the face value of a single security. The number of circulating securities remains unchanged ."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV3Code IncreaseInValue = new CorporateActionEventTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IncreaseInValue";
			definition = "Increase in the face value of a single security. The number of circulating securities remains unchanged .";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.mmObject();
			codeName = "INCR";
		}
	};
	/**
	 * An instalment towards the purchase of equity capital, subject to an
	 * agreement between an issuer and a purchaser.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PPMT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstalmentCall"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An instalment towards the purchase of equity capital, subject to an agreement between an issuer and a purchaser."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV3Code InstalmentCall = new CorporateActionEventTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InstalmentCall";
			definition = "An instalment towards the purchase of equity capital, subject to an agreement between an issuer and a purchaser.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.mmObject();
			codeName = "PPMT";
		}
	};
	/**
	 * An event which consists of two components, the decrease of the amortized
	 * value of a pool factor security and an interest payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRII"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestPaymentWithPrincipal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An event which consists of two components, the decrease of the amortized value of a pool factor security and an interest payment."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV3Code InterestPaymentWithPrincipal = new CorporateActionEventTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InterestPaymentWithPrincipal";
			definition = "An event which consists of two components, the decrease of the amortized value of a pool factor security and an interest payment.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.mmObject();
			codeName = "PRII";
		}
	};
	/**
	 * The distribution of intermediate securities or privilege that gives the
	 * holder the right to take part in a future event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RHDI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediateSecuritiesDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The distribution of intermediate securities or privilege that gives the holder the right to take part in a future event."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV3Code IntermediateSecuritiesDistribution = new CorporateActionEventTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IntermediateSecuritiesDistribution";
			definition = "The distribution of intermediate securities or privilege that gives the holder the right to take part in a future event.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.mmObject();
			codeName = "RHDI";
		}
	};
	/**
	 * As stipulated in a bond's Terms and Conditions, the issuer or the
	 * bond-holder may prolong the maturity date of a bond. After extension, the
	 * security may differ from original issue (new rate or maturity date). May
	 * be subject to bondholder's approval.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXTM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaturityExtension"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "As stipulated in a bond's Terms and Conditions, the issuer or the bond-holder may prolong the maturity date of a bond. After extension, the security may differ from original issue (new rate or maturity date). May be subject to bondholder's approval."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV3Code MaturityExtension = new CorporateActionEventTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaturityExtension";
			definition = "As stipulated in a bond's Terms and Conditions, the issuer or the bond-holder may prolong the maturity date of a bond. After extension, the security may differ from original issue (new rate or maturity date). May be subject to bondholder's approval.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.mmObject();
			codeName = "EXTM";
		}
	};
	/**
	 * Non-US beneficial owner certification requirement for exchange of
	 * temporary to permanent notes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CERT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonUSTEFRADCertification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Non-US beneficial owner certification requirement for exchange of temporary to permanent notes."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV3Code NonUSTEFRADCertification = new CorporateActionEventTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NonUSTEFRADCertification";
			definition = "Non-US beneficial owner certification requirement for exchange of temporary to permanent notes.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.mmObject();
			codeName = "CERT";
		}
	};
	/**
	 * Odd Lot Sale/Purchase . Sale or purchase of odd-lots to/from the issuing
	 * company, initiated either by the holder of the security or through an
	 * offer made by the issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ODLT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OddLotSalePurchase"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Odd Lot Sale/Purchase . Sale or purchase of odd-lots to/from the issuing company, initiated either by the holder of the security or through an offer made by the issuer."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV3Code OddLotSalePurchase = new CorporateActionEventTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OddLotSalePurchase";
			definition = "Odd Lot Sale/Purchase . Sale or purchase of odd-lots to/from the issuing company, initiated either by the holder of the security or through an offer made by the issuer.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.mmObject();
			codeName = "ODLT";
		}
	};
	/**
	 * Ordinary general meeting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OMET"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrdinaryGeneralMeeting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Ordinary general meeting."</li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV3Code OrdinaryGeneralMeeting = new CorporateActionEventTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OrdinaryGeneralMeeting";
			definition = "Ordinary general meeting.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.mmObject();
			codeName = "OMET";
		}
	};
	/**
	 * Other event, use only when no other event type applies, eg, a new event
	 * type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Other event, use only when no other event type applies, eg, a new event type."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV3Code OtherEvent = new CorporateActionEventTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OtherEvent";
			definition = "Other event, use only when no other event type applies, eg, a new event type.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Occurs when securities with different characteristics, eg, shares with
	 * different entitlements to dividend or voting rights, become identical in
	 * all respects, eg , pari-passu or assimilation. May be scheduled in
	 * advance, eg, shares resulting from a bonus may become fungible after a
	 * pre-set period of time, or may result from outside events, eg, merger,
	 * reorganisation, issue of supplementary tranches, etc.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PARI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PariPassu"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Occurs when securities with different characteristics, eg, shares with different entitlements to dividend or voting rights, become identical in all respects, eg , pari-passu or assimilation. May be scheduled in advance, eg, shares resulting from a bonus may become fungible after a pre-set period of time, or may result from outside events, eg, merger, reorganisation, issue of supplementary tranches, etc."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV3Code PariPassu = new CorporateActionEventTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PariPassu";
			definition = "Occurs when securities with different characteristics, eg, shares with different entitlements to dividend or voting rights, become identical in all respects, eg , pari-passu or assimilation. May be scheduled in advance, eg, shares resulting from a bonus may become fungible after a pre-set period of time, or may result from outside events, eg, merger, reorganisation, issue of supplementary tranches, etc.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.mmObject();
			codeName = "PARI";
		}
	};
	/**
	 * Securities are redeemed in part before their scheduled final maturity
	 * date with reduction of the nominal value of the shares. The outstanding
	 * amount of securities will be reduced proportionally.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PCAL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialRedemptionWithNominalValueReduction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities are redeemed in part before their scheduled final maturity date with reduction of the nominal value of the shares. The outstanding amount of securities will be reduced proportionally."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV3Code PartialRedemptionWithNominalValueReduction = new CorporateActionEventTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartialRedemptionWithNominalValueReduction";
			definition = "Securities are redeemed in part before their scheduled final maturity date with reduction of the nominal value of the shares. The outstanding amount of securities will be reduced proportionally.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.mmObject();
			codeName = "PCAL";
		}
	};
	/**
	 * Securities are redeemed in part before their scheduled final maturity
	 * date without reduction of the nominal value of the shares. This is
	 * commonly done by pool factor reduction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRED"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialRedemptionWithoutNominalValueReduction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities are redeemed in part before their scheduled final maturity date without reduction of the nominal value of the shares. This is commonly done by pool factor reduction."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV3Code PartialRedemptionWithoutNominalValueReduction = new CorporateActionEventTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartialRedemptionWithoutNominalValueReduction";
			definition = "Securities are redeemed in part before their scheduled final maturity date without reduction of the nominal value of the shares. This is commonly done by pool factor reduction.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.mmObject();
			codeName = "PRED";
		}
	};
	/**
	 * Interest payment, in any kind except cash, distributed to holders of an
	 * interest bearing asset.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PINK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayInKind"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Interest payment, in any kind except cash, distributed to holders of an interest bearing asset."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV3Code PayInKind = new CorporateActionEventTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PayInKind";
			definition = "Interest payment, in any kind except cash, distributed to holders of an interest bearing asset.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.mmObject();
			codeName = "PINK";
		}
	};
	/**
	 * Changes in the state of incorporation for US companies and changes in the
	 * place of incorporation for foreign companies. Where shares need to be
	 * registered following the incorporation change, the holder(s) may have to
	 * elect the registrar.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PLAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfIncorporation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Changes in the state of incorporation for US companies and changes in the place of incorporation for foreign companies. Where shares need to be registered following the incorporation change, the holder(s) may have to elect the registrar."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV3Code PlaceOfIncorporation = new CorporateActionEventTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PlaceOfIncorporation";
			definition = "Changes in the state of incorporation for US companies and changes in the place of incorporation for foreign companies. Where shares need to be registered following the incorporation change, the holder(s) may have to elect the registrar.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.mmObject();
			codeName = "PLAC";
		}
	};
	/**
	 * Form of open or public offer where, due to a limited amount of securities
	 * available, priority is given to existing shareholders.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRIO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriorityIssue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Form of open or public offer where, due to a limited amount of securities available, priority is given to existing shareholders."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV3Code PriorityIssue = new CorporateActionEventTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PriorityIssue";
			definition = "Form of open or public offer where, due to a limited amount of securities available, priority is given to existing shareholders.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.mmObject();
			codeName = "PRIO";
		}
	};
	/**
	 * Redemption in part before the scheduled final maturity date of a
	 * security. Drawing is distinct from partial call since drawn bonds are
	 * chosen by lottery and with no reduction in nominal value.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BPUT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PutRedemption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Redemption in part before the scheduled final maturity date of a security. Drawing is distinct from partial call since drawn bonds are chosen by lottery and with no reduction in nominal value."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV3Code PutRedemption = new CorporateActionEventTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PutRedemption";
			definition = "Redemption in part before the scheduled final maturity date of a security. Drawing is distinct from partial call since drawn bonds are chosen by lottery and with no reduction in nominal value.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.mmObject();
			codeName = "BPUT";
		}
	};
	/**
	 * Purchase and sale of remarketed preferred equities/bonds through the
	 * negotiation of interest rate between the issuers and the holders.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REMK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemarketingAgreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Purchase and sale of remarketed preferred equities/bonds through the negotiation of interest rate between the issuers and the holders."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV3Code RemarketingAgreement = new CorporateActionEventTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RemarketingAgreement";
			definition = "Purchase and sale of remarketed preferred equities/bonds through the negotiation of interest rate between the issuers and the holders.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.mmObject();
			codeName = "REMK";
		}
	};
	/**
	 * Repurchase offer/Issuer bid/ Reverse rights. Offer to existing
	 * shareholders by the issuing company to repurchase equity or other
	 * securities convertible into equity. The objective of the offer is to
	 * reduce the number of outstanding equities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BIDS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseOffer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Repurchase offer/Issuer bid/ Reverse rights. Offer to existing shareholders by the issuing company to repurchase equity or other securities convertible into equity. The objective of the offer is to reduce the number of outstanding equities."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV3Code RepurchaseOffer = new CorporateActionEventTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RepurchaseOffer";
			definition = "Repurchase offer/Issuer bid/ Reverse rights. Offer to existing shareholders by the issuing company to repurchase equity or other securities convertible into equity. The objective of the offer is to reduce the number of outstanding equities.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.mmObject();
			codeName = "BIDS";
		}
	};
	/**
	 * Event is a change in nominal value, a consolidation. It is a decrease in
	 * number of outstanding shares of stock without any change in the
	 * shareholder's equity or the aggregate market value at the time of the
	 * split. Stock price and nominal value are reduced accordingly.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPLR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReverseStockSplit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event is a change in nominal value, a consolidation. It is a decrease in number of outstanding shares of stock without any change in the shareholder's equity or the aggregate market value at the time of the split. Stock price and nominal value are reduced accordingly."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV3Code ReverseStockSplit = new CorporateActionEventTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReverseStockSplit";
			definition = "Event is a change in nominal value, a consolidation. It is a decrease in number of outstanding shares of stock without any change in the shareholder's equity or the aggregate market value at the time of the split. Stock price and nominal value are reduced accordingly.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.mmObject();
			codeName = "SPLR";
		}
	};
	/**
	 * Rights Issue/ Subscription Rights/ Rights Offer. Distribution of a
	 * security or privilege that gives the holder an entitlement or right to
	 * take part in a future event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RHTS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RightsIssue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rights Issue/ Subscription Rights/ Rights Offer. Distribution of a security or privilege that gives the holder an entitlement or right to take part in a future event."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV3Code RightsIssue = new CorporateActionEventTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RightsIssue";
			definition = "Rights Issue/ Subscription Rights/ Rights Offer. Distribution of a security or privilege that gives the holder an entitlement or right to take part in a future event.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.mmObject();
			codeName = "RHTS";
		}
	};
	/**
	 * Scrip Dividend/Payment. Dividend or interest paid in the form of scrip.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DVSC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ScripDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Scrip Dividend/Payment. Dividend or interest paid in the form of scrip."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV3Code ScripDividend = new CorporateActionEventTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ScripDividend";
			definition = "Scrip Dividend/Payment. Dividend or interest paid in the form of scrip.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.mmObject();
			codeName = "DVSC";
		}
	};
	/**
	 * This corporate event pays shareholders an amount in cash issued from the
	 * shares premium reserve. It is similar to a dividend but with different
	 * tax implications.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SHPR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SharesPremiumDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "This corporate event pays shareholders an amount in cash issued from the shares premium reserve. It is similar to a dividend but with different tax implications."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV3Code SharesPremiumDividend = new CorporateActionEventTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SharesPremiumDividend";
			definition = "This corporate event pays shareholders an amount in cash issued from the shares premium reserve. It is similar to a dividend but with different tax implications.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.mmObject();
			codeName = "SHPR";
		}
	};
	/**
	 * Modification of the smallest negotiable unit of shares in order to obtain
	 * a new negotiable unit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SMAL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SmallestNegotiableUnit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Modification of the smallest negotiable unit of shares in order to obtain a new negotiable unit."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV3Code SmallestNegotiableUnit = new CorporateActionEventTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SmallestNegotiableUnit";
			definition = "Modification of the smallest negotiable unit of shares in order to obtain a new negotiable unit.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.mmObject();
			codeName = "SMAL";
		}
	};
	/**
	 * Event is a change in nominal value, a subdivision. It is an increase in a
	 * corporation's number of outstanding shares of stock without any change in
	 * the shareholder's equity or the aggregate market value at the time of the
	 * split. Stock price and nominal value are reduced accordingly.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
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
	 * "Event is a change in nominal value, a subdivision. It is an increase in a corporation's number of outstanding shares of stock without any change in the shareholder's equity or the aggregate market value at the time of the split. Stock price and nominal value are reduced accordingly."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV3Code StockSplit = new CorporateActionEventTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StockSplit";
			definition = "Event is a change in nominal value, a subdivision. It is an increase in a corporation's number of outstanding shares of stock without any change in the shareholder's equity or the aggregate market value at the time of the split. Stock price and nominal value are reduced accordingly.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.mmObject();
			codeName = "SPLF";
		}
	};
	/**
	 * Event related to tax reclaim activities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TREC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxReclaim"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Event related to tax reclaim activities."</li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV3Code TaxReclaim = new CorporateActionEventTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxReclaim";
			definition = "Event related to tax reclaim activities.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.mmObject();
			codeName = "TREC";
		}
	};
	/**
	 * Security is no longer able to comply with the listing requirements of a
	 * stock exchange and is removed from official board quotation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DLST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingStatusDelisted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Security is no longer able to comply with the listing requirements of a stock exchange and is removed from official board quotation."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV3Code TradingStatusDelisted = new CorporateActionEventTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradingStatusDelisted";
			definition = "Security is no longer able to comply with the listing requirements of a stock exchange and is removed from official board quotation.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.mmObject();
			codeName = "DLST";
		}
	};
	/**
	 * Trading in the security has been suspended.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SUSP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingStatusSuspended"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trading in the security has been suspended."</li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV3Code TradingStatusSuspended = new CorporateActionEventTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradingStatusSuspended";
			definition = "Trading in the security has been suspended.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.mmObject();
			codeName = "SUSP";
		}
	};
	/**
	 * Option offered to holders to buy (call warrant) or to sell (put warrant)
	 * a specific amount of stock, cash, or commodity, at a predetermined price,
	 * during a predetermined period of time (which usually corresponds to the
	 * life of the issue).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXWA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WarrantExercise"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Option offered to holders to buy (call warrant) or to sell (put warrant) a specific amount of stock, cash, or commodity, at a predetermined price, during a predetermined period of time (which usually corresponds to the life of the issue)."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV3Code WarrantExercise = new CorporateActionEventTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WarrantExercise";
			definition = "Option offered to holders to buy (call warrant) or to sell (put warrant) a specific amount of stock, cash, or commodity, at a predetermined price, during a predetermined period of time (which usually corresponds to the life of the issue).";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.mmObject();
			codeName = "EXWA";
		}
	};
	/**
	 * Certification process for withholding tax reduction or exemption based on
	 * the tax status of the holder.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WTRC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithholdingTaxReliefCertification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Certification process for withholding tax reduction or exemption based on the tax status of the holder."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV3Code WithholdingTaxReliefCertification = new CorporateActionEventTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WithholdingTaxReliefCertification";
			definition = "Certification process for withholding tax reduction or exemption based on the tax status of the holder.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.mmObject();
			codeName = "WTRC";
		}
	};
	/**
	 * Booking out of valueless securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WRTH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Worthless"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Booking out of valueless securities."</li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV3Code Worthless = new CorporateActionEventTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Worthless";
			definition = "Booking out of valueless securities.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.mmObject();
			codeName = "WRTH";
		}
	};
	/**
	 * Situation where interested parties seek restitution for financial loss.
	 * The security holder may be offered the opportunity to join a class action
	 * proceeding and would need to respond with an instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLSA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClassActionProposedSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Situation where interested parties seek restitution for financial loss. The security holder may be offered the opportunity to join a class action proceeding and would need to respond with an instruction."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV3Code ClassActionProposedSettlement = new CorporateActionEventTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClassActionProposedSettlement";
			definition = "Situation where interested parties seek restitution for financial loss. The security holder may be offered the opportunity to join a class action proceeding and would need to respond with an instruction.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.mmObject();
			codeName = "CLSA";
		}
	};
	/**
	 * The Corporate event pays shareholders an amount in cash issued from the
	 * Capital account. There is no reduction to the face value of a single
	 * share (or the share has no par value). The number of circulating shares
	 * remains unchanged.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CAPD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapitalDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Corporate event pays shareholders an amount in cash issued from the Capital account. There is no reduction to the face value of a single share (or the share has no par value). The number of circulating shares remains unchanged."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV3Code CapitalDistribution = new CorporateActionEventTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CapitalDistribution";
			definition = "The Corporate event pays shareholders an amount in cash issued from the Capital account. There is no reduction to the face value of a single share (or the share has no par value). The number of circulating shares remains unchanged.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.mmObject();
			codeName = "CAPD";
		}
	};
	/**
	 * An occurrence of credit derivative for which the issuer of one or several
	 * underlying securities is unable to fulfill his financial obligations (as
	 * defined in terms and conditions).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CREV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An occurrence of credit derivative for which the issuer of one or several underlying securities is unable to fulfill his financial obligations (as defined in terms and conditions)."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV3Code CreditEvent = new CorporateActionEventTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreditEvent";
			definition = "An occurrence of credit derivative for which the issuer of one or several underlying securities is unable to fulfill his financial obligations (as defined in terms and conditions).";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.mmObject();
			codeName = "CREV";
		}
	};
	/**
	 * Ordinary or annual or extraordinary or special general meeting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MTNG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesHoldersMeeting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Ordinary or annual or extraordinary or special general meeting."</li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV3Code SecuritiesHoldersMeeting = new CorporateActionEventTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesHoldersMeeting";
			definition = "Ordinary or annual or extraordinary or special general meeting.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.mmObject();
			codeName = "MTNG";
		}
	};
	/**
	 * Distribution to shareholders of cash resulting from the selling of
	 * non-eligible securities, for example, in the frame of a depositary
	 * receipt program.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DRCA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDistributionFromNonEligibleSecuritiesSales"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Distribution to shareholders of cash resulting from the selling of non-eligible securities, for example, in the frame of a depositary receipt program."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV3Code CashDistributionFromNonEligibleSecuritiesSales = new CorporateActionEventTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashDistributionFromNonEligibleSecuritiesSales";
			definition = "Distribution to shareholders of cash resulting from the selling of non-eligible securities, for example, in the frame of a depositary receipt program.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.mmObject();
			codeName = "DRCA";
		}
	};
	final static private LinkedHashMap<String, CorporateActionEventTypeV3Code> codesByName = new LinkedHashMap<>();

	protected CorporateActionEventTypeV3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("DRIP");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionEventTypeV3Code";
				definition = "Specifies the corporate action event type.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.DividendReinvestment, com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.CapitalGainsDistribution,
						com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.CashDividend, com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.DividendOption,
						com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.StockDividend, com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.LiquidationDividend,
						com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.Merger, com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.NameChange,
						com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.SpinOff, com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.Tender,
						com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.BonusIssue, com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.Change,
						com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.Redenomination, com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.ExchangeOption,
						com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.Exchange, com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.DecreaseInValue,
						com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.EarlyRedemption, com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.FinalMaturity,
						com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.InterestPayment, com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.Prefunding,
						com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.Remarketing, com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.Subscription,
						com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.Attachment, com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.Conversion,
						com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.Detachment, com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.ActiveTradingStatus,
						com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.AnnualGeneralMeeting, com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.Bankruptcy,
						com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.BondDefault, com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.CallOnIntermediateSecurities,
						com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.Capitalisation, com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.Consent,
						com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.CompanyOption, com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.CouponStripping,
						com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.CourtMeeting, com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.Disclosure,
						com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.Drawing, com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.DutchAuction,
						com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.ExtraordinaryGeneralMeeting, com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.FullCall,
						com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.IncreaseInValue, com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.InstalmentCall,
						com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.InterestPaymentWithPrincipal, com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.IntermediateSecuritiesDistribution,
						com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.MaturityExtension, com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.NonUSTEFRADCertification,
						com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.OddLotSalePurchase, com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.OrdinaryGeneralMeeting,
						com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.OtherEvent, com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.PariPassu,
						com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.PartialRedemptionWithNominalValueReduction,
						com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.PartialRedemptionWithoutNominalValueReduction, com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.PayInKind,
						com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.PlaceOfIncorporation, com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.PriorityIssue,
						com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.PutRedemption, com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.RemarketingAgreement,
						com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.RepurchaseOffer, com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.ReverseStockSplit,
						com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.RightsIssue, com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.ScripDividend,
						com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.SharesPremiumDividend, com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.SmallestNegotiableUnit,
						com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.StockSplit, com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.TaxReclaim,
						com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.TradingStatusDelisted, com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.TradingStatusSuspended,
						com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.WarrantExercise, com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.WithholdingTaxReliefCertification,
						com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.Worthless, com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.ClassActionProposedSettlement,
						com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.CapitalDistribution, com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.CreditEvent,
						com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.SecuritiesHoldersMeeting, com.tools20022.repository.codeset.CorporateActionEventTypeV3Code.CashDistributionFromNonEligibleSecuritiesSales);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(DividendReinvestment.getCodeName().get(), DividendReinvestment);
		codesByName.put(CapitalGainsDistribution.getCodeName().get(), CapitalGainsDistribution);
		codesByName.put(CashDividend.getCodeName().get(), CashDividend);
		codesByName.put(DividendOption.getCodeName().get(), DividendOption);
		codesByName.put(StockDividend.getCodeName().get(), StockDividend);
		codesByName.put(LiquidationDividend.getCodeName().get(), LiquidationDividend);
		codesByName.put(Merger.getCodeName().get(), Merger);
		codesByName.put(NameChange.getCodeName().get(), NameChange);
		codesByName.put(SpinOff.getCodeName().get(), SpinOff);
		codesByName.put(Tender.getCodeName().get(), Tender);
		codesByName.put(BonusIssue.getCodeName().get(), BonusIssue);
		codesByName.put(Change.getCodeName().get(), Change);
		codesByName.put(Redenomination.getCodeName().get(), Redenomination);
		codesByName.put(ExchangeOption.getCodeName().get(), ExchangeOption);
		codesByName.put(Exchange.getCodeName().get(), Exchange);
		codesByName.put(DecreaseInValue.getCodeName().get(), DecreaseInValue);
		codesByName.put(EarlyRedemption.getCodeName().get(), EarlyRedemption);
		codesByName.put(FinalMaturity.getCodeName().get(), FinalMaturity);
		codesByName.put(InterestPayment.getCodeName().get(), InterestPayment);
		codesByName.put(Prefunding.getCodeName().get(), Prefunding);
		codesByName.put(Remarketing.getCodeName().get(), Remarketing);
		codesByName.put(Subscription.getCodeName().get(), Subscription);
		codesByName.put(Attachment.getCodeName().get(), Attachment);
		codesByName.put(Conversion.getCodeName().get(), Conversion);
		codesByName.put(Detachment.getCodeName().get(), Detachment);
		codesByName.put(ActiveTradingStatus.getCodeName().get(), ActiveTradingStatus);
		codesByName.put(AnnualGeneralMeeting.getCodeName().get(), AnnualGeneralMeeting);
		codesByName.put(Bankruptcy.getCodeName().get(), Bankruptcy);
		codesByName.put(BondDefault.getCodeName().get(), BondDefault);
		codesByName.put(CallOnIntermediateSecurities.getCodeName().get(), CallOnIntermediateSecurities);
		codesByName.put(Capitalisation.getCodeName().get(), Capitalisation);
		codesByName.put(Consent.getCodeName().get(), Consent);
		codesByName.put(CompanyOption.getCodeName().get(), CompanyOption);
		codesByName.put(CouponStripping.getCodeName().get(), CouponStripping);
		codesByName.put(CourtMeeting.getCodeName().get(), CourtMeeting);
		codesByName.put(Disclosure.getCodeName().get(), Disclosure);
		codesByName.put(Drawing.getCodeName().get(), Drawing);
		codesByName.put(DutchAuction.getCodeName().get(), DutchAuction);
		codesByName.put(ExtraordinaryGeneralMeeting.getCodeName().get(), ExtraordinaryGeneralMeeting);
		codesByName.put(FullCall.getCodeName().get(), FullCall);
		codesByName.put(IncreaseInValue.getCodeName().get(), IncreaseInValue);
		codesByName.put(InstalmentCall.getCodeName().get(), InstalmentCall);
		codesByName.put(InterestPaymentWithPrincipal.getCodeName().get(), InterestPaymentWithPrincipal);
		codesByName.put(IntermediateSecuritiesDistribution.getCodeName().get(), IntermediateSecuritiesDistribution);
		codesByName.put(MaturityExtension.getCodeName().get(), MaturityExtension);
		codesByName.put(NonUSTEFRADCertification.getCodeName().get(), NonUSTEFRADCertification);
		codesByName.put(OddLotSalePurchase.getCodeName().get(), OddLotSalePurchase);
		codesByName.put(OrdinaryGeneralMeeting.getCodeName().get(), OrdinaryGeneralMeeting);
		codesByName.put(OtherEvent.getCodeName().get(), OtherEvent);
		codesByName.put(PariPassu.getCodeName().get(), PariPassu);
		codesByName.put(PartialRedemptionWithNominalValueReduction.getCodeName().get(), PartialRedemptionWithNominalValueReduction);
		codesByName.put(PartialRedemptionWithoutNominalValueReduction.getCodeName().get(), PartialRedemptionWithoutNominalValueReduction);
		codesByName.put(PayInKind.getCodeName().get(), PayInKind);
		codesByName.put(PlaceOfIncorporation.getCodeName().get(), PlaceOfIncorporation);
		codesByName.put(PriorityIssue.getCodeName().get(), PriorityIssue);
		codesByName.put(PutRedemption.getCodeName().get(), PutRedemption);
		codesByName.put(RemarketingAgreement.getCodeName().get(), RemarketingAgreement);
		codesByName.put(RepurchaseOffer.getCodeName().get(), RepurchaseOffer);
		codesByName.put(ReverseStockSplit.getCodeName().get(), ReverseStockSplit);
		codesByName.put(RightsIssue.getCodeName().get(), RightsIssue);
		codesByName.put(ScripDividend.getCodeName().get(), ScripDividend);
		codesByName.put(SharesPremiumDividend.getCodeName().get(), SharesPremiumDividend);
		codesByName.put(SmallestNegotiableUnit.getCodeName().get(), SmallestNegotiableUnit);
		codesByName.put(StockSplit.getCodeName().get(), StockSplit);
		codesByName.put(TaxReclaim.getCodeName().get(), TaxReclaim);
		codesByName.put(TradingStatusDelisted.getCodeName().get(), TradingStatusDelisted);
		codesByName.put(TradingStatusSuspended.getCodeName().get(), TradingStatusSuspended);
		codesByName.put(WarrantExercise.getCodeName().get(), WarrantExercise);
		codesByName.put(WithholdingTaxReliefCertification.getCodeName().get(), WithholdingTaxReliefCertification);
		codesByName.put(Worthless.getCodeName().get(), Worthless);
		codesByName.put(ClassActionProposedSettlement.getCodeName().get(), ClassActionProposedSettlement);
		codesByName.put(CapitalDistribution.getCodeName().get(), CapitalDistribution);
		codesByName.put(CreditEvent.getCodeName().get(), CreditEvent);
		codesByName.put(SecuritiesHoldersMeeting.getCodeName().get(), SecuritiesHoldersMeeting);
		codesByName.put(CashDistributionFromNonEligibleSecuritiesSales.getCodeName().get(), CashDistributionFromNonEligibleSecuritiesSales);
	}

	public static CorporateActionEventTypeV3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CorporateActionEventTypeV3Code[] values() {
		CorporateActionEventTypeV3Code[] values = new CorporateActionEventTypeV3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CorporateActionEventTypeV3Code> {
		@Override
		public CorporateActionEventTypeV3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CorporateActionEventTypeV3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}