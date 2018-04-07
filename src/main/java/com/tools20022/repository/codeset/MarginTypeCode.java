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
import com.tools20022.repository.codeset.MarginTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of margin, for example, initial margin, variation margin,
 * initial deposit or coupon margin.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarginTypeCode#SettlementRiskMargin
 * MarginTypeCode.SettlementRiskMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarginTypeCode#AdditionalDefaultFundMargin
 * MarginTypeCode.AdditionalDefaultFundMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarginTypeCode#ShortChargeMargin
 * MarginTypeCode.ShortChargeMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarginTypeCode#CouponMargin
 * MarginTypeCode.CouponMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarginTypeCode#UpfrontMargin
 * MarginTypeCode.UpfrontMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarginTypeCode#CreditEventMargin
 * MarginTypeCode.CreditEventMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarginTypeCode#InitialDeposit
 * MarginTypeCode.InitialDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarginTypeCode#NegociationMargin
 * MarginTypeCode.NegociationMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarginTypeCode#InitialMargin
 * MarginTypeCode.InitialMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarginTypeCode#VariationMargin
 * MarginTypeCode.VariationMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarginTypeCode#IncreaseCoverageAmount
 * MarginTypeCode.IncreaseCoverageAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarginTypeCode#LiquidityRiskMargin
 * MarginTypeCode.LiquidityRiskMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarginTypeCode#BasisRiskMargin
 * MarginTypeCode.BasisRiskMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarginTypeCode#WrongWayRiskMargin
 * MarginTypeCode.WrongWayRiskMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarginTypeCode#SovereignRiskMargin
 * MarginTypeCode.SovereignRiskMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarginTypeCode#MarketRiskMargin
 * MarginTypeCode.MarketRiskMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarginTypeCode#CreditRiskAdditionalMargin
 * MarginTypeCode.CreditRiskAdditionalMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarginTypeCode#ContingentVariationMargin
 * MarginTypeCode.ContingentVariationMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarginTypeCode#SponsorRiskMargin
 * MarginTypeCode.SponsorRiskMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarginTypeCode#JumpToDefaultRequirement
 * MarginTypeCode.JumpToDefaultRequirement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarginTypeCode#DiscretionaryRiskAddOn
 * MarginTypeCode.DiscretionaryRiskAddOn}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MarginTypeCode#Other
 * MarginTypeCode.Other}</li>
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
 * <li>"SEMA"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MarginTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of margin, for example, initial margin, variation margin, initial deposit or coupon margin."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class MarginTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Margin required to cover the risk of non settlement of the underlying.
	 * Also used to cover the risk linked to the non settlement on payment
	 * platforms (for example TARGET2 vs CLS).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarginTypeCode
	 * MarginTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SEMA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementRiskMargin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Margin required to cover the risk of non settlement of the underlying. Also used to cover the risk linked to the non settlement on payment platforms (for example TARGET2 vs CLS)."
	 * </li>
	 * </ul>
	 */
	public static final MarginTypeCode SettlementRiskMargin = new MarginTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementRiskMargin";
			definition = "Margin required to cover the risk of non settlement of the underlying. Also used to cover the risk linked to the non settlement on payment platforms (for example TARGET2 vs CLS).";
			owner_lazy = () -> com.tools20022.repository.codeset.MarginTypeCode.mmObject();
			codeName = "SEMA";
		}
	};
	/**
	 * Additional margin required to cover the daily risk encountered by the
	 * central counterparty before the clearing member is actually called to
	 * cover the default fund. Indeed, central counterparty calculates the
	 * margin on the default fund on a daily basis but only calls the clearing
	 * member at the end of the month.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarginTypeCode
	 * MarginTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ADFM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDefaultFundMargin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional margin required to cover the daily risk encountered by the central counterparty before the clearing member is actually called to cover the default fund. Indeed, central counterparty calculates the margin on the default fund on a daily basis but only calls the clearing member at the end of the month."
	 * </li>
	 * </ul>
	 */
	public static final MarginTypeCode AdditionalDefaultFundMargin = new MarginTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDefaultFundMargin";
			definition = "Additional margin required to cover the daily risk encountered by the central counterparty before the clearing member is actually called to cover the default fund. Indeed, central counterparty calculates the margin on the default fund on a daily basis but only calls the clearing member at the end of the month.";
			owner_lazy = () -> com.tools20022.repository.codeset.MarginTypeCode.mmObject();
			codeName = "ADFM";
		}
	};
	/**
	 * Margin required to cover the concentration risk linked to the default of
	 * the seller of the "protection" (for example CDS seller).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarginTypeCode
	 * MarginTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCMA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortChargeMargin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Margin required to cover the concentration risk linked to the default of the seller of the \"protection\" (for example CDS seller)."
	 * </li>
	 * </ul>
	 */
	public static final MarginTypeCode ShortChargeMargin = new MarginTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortChargeMargin";
			definition = "Margin required to cover the concentration risk linked to the default of the seller of the \"protection\" (for example CDS seller).";
			owner_lazy = () -> com.tools20022.repository.codeset.MarginTypeCode.mmObject();
			codeName = "SCMA";
		}
	};
	/**
	 * Margin required to cover the non payment of the monthly premium (for
	 * credit derivatives).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarginTypeCode
	 * MarginTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COMA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CouponMargin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Margin required to cover the non payment of the monthly premium (for credit derivatives)."
	 * </li>
	 * </ul>
	 */
	public static final MarginTypeCode CouponMargin = new MarginTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CouponMargin";
			definition = "Margin required to cover the non payment of the monthly premium (for credit derivatives).";
			owner_lazy = () -> com.tools20022.repository.codeset.MarginTypeCode.mmObject();
			codeName = "COMA";
		}
	};
	/**
	 * Margin required to cover the non payment of the upfront premium (for
	 * credit derivatives).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarginTypeCode
	 * MarginTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UFMA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UpfrontMargin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Margin required to cover the non payment of the upfront premium (for credit derivatives)."
	 * </li>
	 * </ul>
	 */
	public static final MarginTypeCode UpfrontMargin = new MarginTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UpfrontMargin";
			definition = "Margin required to cover the non payment of the upfront premium (for credit derivatives).";
			owner_lazy = () -> com.tools20022.repository.codeset.MarginTypeCode.mmObject();
			codeName = "UFMA";
		}
	};
	/**
	 * Margin required to cover the risk of any event linked to the underlying
	 * (for example the payment default by the issuer of a debt).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarginTypeCode
	 * MarginTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CEMA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditEventMargin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Margin required to cover the risk of any event linked to the underlying (for example the payment default by the issuer of a debt)."
	 * </li>
	 * </ul>
	 */
	public static final MarginTypeCode CreditEventMargin = new MarginTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditEventMargin";
			definition = "Margin required to cover the risk of any event linked to the underlying (for example the payment default by the issuer of a debt).";
			owner_lazy = () -> com.tools20022.repository.codeset.MarginTypeCode.mmObject();
			codeName = "CEMA";
		}
	};
	/**
	 * Margin required to enable a member to start trading on a specific market
	 * where high risks and amounts are involved.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarginTypeCode
	 * MarginTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INDE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InitialDeposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Margin required to enable a member to start trading on a specific market where high risks and amounts are involved."
	 * </li>
	 * </ul>
	 */
	public static final MarginTypeCode InitialDeposit = new MarginTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitialDeposit";
			definition = "Margin required to enable a member to start trading on a specific market where high risks and amounts are involved.";
			owner_lazy = () -> com.tools20022.repository.codeset.MarginTypeCode.mmObject();
			codeName = "INDE";
		}
	};
	/**
	 * Margin calculated on the same basis as for the variation margin but the
	 * margin is kept by the central counterparty and not "paid " to the other
	 * clearing member.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarginTypeCode
	 * MarginTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NEMA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NegociationMargin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Margin calculated on the same basis as for the variation margin but the margin is kept by the central counterparty and not \"paid \" to the other clearing member."
	 * </li>
	 * </ul>
	 */
	public static final MarginTypeCode NegociationMargin = new MarginTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NegociationMargin";
			definition = "Margin calculated on the same basis as for the variation margin but the margin is kept by the central counterparty and not \"paid \" to the other clearing member.";
			owner_lazy = () -> com.tools20022.repository.codeset.MarginTypeCode.mmObject();
			codeName = "NEMA";
		}
	};
	/**
	 * Margin required for absorbing future market price fluctuations (market
	 * risks) occurring between the default of a member and close-out of
	 * unsettled securities positions by the central counterparty.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarginTypeCode
	 * MarginTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INMA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InitialMargin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Margin required for absorbing future market price fluctuations (market risks) occurring between the default of a member and close-out of unsettled securities positions by the central counterparty."
	 * </li>
	 * </ul>
	 */
	public static final MarginTypeCode InitialMargin = new MarginTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitialMargin";
			definition = "Margin required for absorbing future market price fluctuations (market risks) occurring between the default of a member and close-out of unsettled securities positions by the central counterparty.";
			owner_lazy = () -> com.tools20022.repository.codeset.MarginTypeCode.mmObject();
			codeName = "INMA";
		}
	};
	/**
	 * Margin required to cover the risk linked to the price fluctuations
	 * occurred on the unsettled exposures towards central counterparty.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarginTypeCode
	 * MarginTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VAMA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariationMargin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Margin required to cover the risk linked to the price fluctuations occurred on the unsettled exposures towards central counterparty."
	 * </li>
	 * </ul>
	 */
	public static final MarginTypeCode VariationMargin = new MarginTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariationMargin";
			definition = "Margin required to cover the risk linked to the price fluctuations occurred on the unsettled exposures towards central counterparty.";
			owner_lazy = () -> com.tools20022.repository.codeset.MarginTypeCode.mmObject();
			codeName = "VAMA";
		}
	};
	/**
	 * Additional margin required to cover a risk increase (expressed in the
	 * reporting currency). This results from a risk management decision
	 * depending on central counterparty specific criteria.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarginTypeCode
	 * MarginTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INCA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncreaseCoverageAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional margin required to cover a risk increase (expressed in the reporting currency). This results from a risk management decision depending on central counterparty specific criteria."
	 * </li>
	 * </ul>
	 */
	public static final MarginTypeCode IncreaseCoverageAmount = new MarginTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncreaseCoverageAmount";
			definition = "Additional margin required to cover a risk increase (expressed in the reporting currency). This results from a risk management decision depending on central counterparty specific criteria.";
			owner_lazy = () -> com.tools20022.repository.codeset.MarginTypeCode.mmObject();
			codeName = "INCA";
		}
	};
	/**
	 * Margin called to cover differences in the assumed liquidation cost of a
	 * portfolio of financial instruments when estimating potential future
	 * exposure relative. For instance, where the potential future exposure is
	 * estimated using mid-prices but fails to consider the necessity to pay a
	 * bid-ask spread, or the additional cost of liquidation that may arise when
	 * liquidating a large portfolio.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarginTypeCode
	 * MarginTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LIRM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LiquidityRiskMargin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Margin called to cover differences in the assumed liquidation cost of a portfolio of financial instruments when estimating potential future exposure relative. For instance, where the potential future exposure is estimated using mid-prices but fails to consider the necessity to pay a bid-ask spread, or the additional cost of liquidation that may arise when liquidating a large portfolio."
	 * </li>
	 * </ul>
	 */
	public static final MarginTypeCode LiquidityRiskMargin = new MarginTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LiquidityRiskMargin";
			definition = "Margin called to cover differences in the assumed liquidation cost of a portfolio of financial instruments when estimating potential future exposure relative. For instance, where the potential future exposure is estimated using mid-prices but fails to consider the necessity to pay a bid-ask spread, or the additional cost of liquidation that may arise when liquidating a large portfolio.";
			owner_lazy = () -> com.tools20022.repository.codeset.MarginTypeCode.mmObject();
			codeName = "LIRM";
		}
	};
	/**
	 * Margin requirement to cover the risk of a breakdown in the assumed
	 * relationship between two financial instruments or risk factors when
	 * calculating the margin requirement for a portfolio of financial
	 * instruments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarginTypeCode
	 * MarginTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BARM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BasisRiskMargin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Margin requirement to cover the risk of a breakdown in the assumed relationship between two financial instruments or risk factors when calculating the margin requirement for a portfolio of financial instruments."
	 * </li>
	 * </ul>
	 */
	public static final MarginTypeCode BasisRiskMargin = new MarginTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BasisRiskMargin";
			definition = "Margin requirement to cover the risk of a breakdown in the assumed relationship between two financial instruments or risk factors when calculating the margin requirement for a portfolio of financial instruments.";
			owner_lazy = () -> com.tools20022.repository.codeset.MarginTypeCode.mmObject();
			codeName = "BARM";
		}
	};
	/**
	 * Margin called to cover additional current or potential future exposures
	 * that may arise due to a connection between the credit quality of the
	 * counterparty and the movement in a set of risk factors of a financial
	 * instruments or portfolio of financial instruments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarginTypeCode
	 * MarginTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WWRM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WrongWayRiskMargin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Margin called to cover additional current or potential future exposures that may arise due to a connection between the credit quality of the counterparty and the movement in a set of risk factors of a financial instruments or portfolio of financial instruments."
	 * </li>
	 * </ul>
	 */
	public static final MarginTypeCode WrongWayRiskMargin = new MarginTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WrongWayRiskMargin";
			definition = "Margin called to cover additional current or potential future exposures that may arise due to a connection between the credit quality of the counterparty and the movement in a set of risk factors of a financial instruments or portfolio of financial instruments.";
			owner_lazy = () -> com.tools20022.repository.codeset.MarginTypeCode.mmObject();
			codeName = "WWRM";
		}
	};
	/**
	 * Margin to cover the risk of a credit event relating to a sovereign
	 * issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarginTypeCode
	 * MarginTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SORM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SovereignRiskMargin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Margin to cover the risk of a credit event relating to a sovereign issuer."
	 * </li>
	 * </ul>
	 */
	public static final MarginTypeCode SovereignRiskMargin = new MarginTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SovereignRiskMargin";
			definition = "Margin to cover the risk of a credit event relating to a sovereign issuer.";
			owner_lazy = () -> com.tools20022.repository.codeset.MarginTypeCode.mmObject();
			codeName = "SORM";
		}
	};
	/**
	 * Margin called to cover potential future exposures caused by volatility in
	 * the underlying risk factors of a set of financial instruments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarginTypeCode
	 * MarginTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MARM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketRiskMargin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Margin called to cover potential future exposures caused by volatility in the underlying risk factors of a set of financial instruments."
	 * </li>
	 * </ul>
	 */
	public static final MarginTypeCode MarketRiskMargin = new MarginTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketRiskMargin";
			definition = "Margin called to cover potential future exposures caused by volatility in the underlying risk factors of a set of financial instruments.";
			owner_lazy = () -> com.tools20022.repository.codeset.MarginTypeCode.mmObject();
			codeName = "MARM";
		}
	};
	/**
	 * Margin called to cover an increase in the probability of default by a
	 * counterparty in relation to an OTC derivative or cleared transaction. The
	 * calculation of such margin is typically independent of any changes in
	 * current or potential future exposure.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarginTypeCode
	 * MarginTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRAM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditRiskAdditionalMargin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Margin called to cover an increase in the probability of default by a counterparty in relation to an OTC derivative or cleared transaction. The calculation of such margin is typically independent of any changes in current or potential future exposure."
	 * </li>
	 * </ul>
	 */
	public static final MarginTypeCode CreditRiskAdditionalMargin = new MarginTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditRiskAdditionalMargin";
			definition = "Margin called to cover an increase in the probability of default by a counterparty in relation to an OTC derivative or cleared transaction. The calculation of such margin is typically independent of any changes in current or potential future exposure.";
			owner_lazy = () -> com.tools20022.repository.codeset.MarginTypeCode.mmObject();
			codeName = "CRAM";
		}
	};
	/**
	 * Margin called, by a central counterparty, to cover current exposures for
	 * a portfolio of financial instruments where collateral called against such
	 * current exposures is held by the central counterparty and returned to the
	 * poster of such collateral at the delivery of the financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarginTypeCode
	 * MarginTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CVMA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContingentVariationMargin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Margin called, by a central counterparty, to cover current exposures for a portfolio of financial instruments where collateral called against such current exposures is held by the central counterparty and returned to the poster of such collateral at the delivery of the financial instrument."
	 * </li>
	 * </ul>
	 */
	public static final MarginTypeCode ContingentVariationMargin = new MarginTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContingentVariationMargin";
			definition = "Margin called, by a central counterparty, to cover current exposures for a portfolio of financial instruments where collateral called against such current exposures is held by the central counterparty and returned to the poster of such collateral at the delivery of the financial instrument.";
			owner_lazy = () -> com.tools20022.repository.codeset.MarginTypeCode.mmObject();
			codeName = "CVMA";
		}
	};
	/**
	 * Margin to cover risks relating to a sponsored clearing member. That is
	 * were a third party carries out a number of obligations under the rulebook
	 * of the central counterparty on behalf of a clearing member but doing so
	 * creates additional risks for the central counterparty with respect to the
	 * clearing member.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarginTypeCode
	 * MarginTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPMA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SponsorRiskMargin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Margin to cover risks relating to a sponsored clearing member. That is were a third party carries out a number of obligations under the rulebook of the central counterparty on behalf of a clearing member but doing so creates additional risks for the central counterparty with respect to the clearing member."
	 * </li>
	 * </ul>
	 */
	public static final MarginTypeCode SponsorRiskMargin = new MarginTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SponsorRiskMargin";
			definition = "Margin to cover risks relating to a sponsored clearing member. That is were a third party carries out a number of obligations under the rulebook of the central counterparty on behalf of a clearing member but doing so creates additional risks for the central counterparty with respect to the clearing member.";
			owner_lazy = () -> com.tools20022.repository.codeset.MarginTypeCode.mmObject();
			codeName = "SPMA";
		}
	};
	/**
	 * Margin called to cover a potential increase in current exposure due to
	 * the revaluation of a financial instrument, where such revaluation is
	 * caused by a sharp discontinuous increase in the probability of default of
	 * the financial instrument or major risk factor of such financial
	 * instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarginTypeCode
	 * MarginTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "JTDR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "JumpToDefaultRequirement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Margin called to cover a potential increase in current exposure due to the revaluation of a financial instrument, where such revaluation is caused by a sharp discontinuous increase in the probability of default of the financial instrument or major risk factor of such financial instrument."
	 * </li>
	 * </ul>
	 */
	public static final MarginTypeCode JumpToDefaultRequirement = new MarginTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "JumpToDefaultRequirement";
			definition = "Margin called to cover a potential increase in current exposure due to the revaluation of a financial instrument, where such revaluation is caused by a sharp discontinuous increase in the probability of default of the financial instrument or major risk factor of such financial instrument.";
			owner_lazy = () -> com.tools20022.repository.codeset.MarginTypeCode.mmObject();
			codeName = "JTDR";
		}
	};
	/**
	 * Margin set called at the discretion of the caller.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarginTypeCode
	 * MarginTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DRAO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DiscretionaryRiskAddOn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Margin set called at the discretion of the caller."</li>
	 * </ul>
	 */
	public static final MarginTypeCode DiscretionaryRiskAddOn = new MarginTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DiscretionaryRiskAddOn";
			definition = "Margin set called at the discretion of the caller.";
			owner_lazy = () -> com.tools20022.repository.codeset.MarginTypeCode.mmObject();
			codeName = "DRAO";
		}
	};
	/**
	 * Margin not categorised by any other margin type code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarginTypeCode
	 * MarginTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Margin not categorised by any other margin type code."</li>
	 * </ul>
	 */
	public static final MarginTypeCode Other = new MarginTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Margin not categorised by any other margin type code.";
			owner_lazy = () -> com.tools20022.repository.codeset.MarginTypeCode.mmObject();
			codeName = "OTHR";
		}
	};
	final static private LinkedHashMap<String, MarginTypeCode> codesByName = new LinkedHashMap<>();

	protected MarginTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("SEMA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MarginTypeCode";
				definition = "Specifies the type of margin, for example, initial margin, variation margin, initial deposit or coupon margin.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MarginTypeCode.SettlementRiskMargin, com.tools20022.repository.codeset.MarginTypeCode.AdditionalDefaultFundMargin,
						com.tools20022.repository.codeset.MarginTypeCode.ShortChargeMargin, com.tools20022.repository.codeset.MarginTypeCode.CouponMargin, com.tools20022.repository.codeset.MarginTypeCode.UpfrontMargin,
						com.tools20022.repository.codeset.MarginTypeCode.CreditEventMargin, com.tools20022.repository.codeset.MarginTypeCode.InitialDeposit, com.tools20022.repository.codeset.MarginTypeCode.NegociationMargin,
						com.tools20022.repository.codeset.MarginTypeCode.InitialMargin, com.tools20022.repository.codeset.MarginTypeCode.VariationMargin, com.tools20022.repository.codeset.MarginTypeCode.IncreaseCoverageAmount,
						com.tools20022.repository.codeset.MarginTypeCode.LiquidityRiskMargin, com.tools20022.repository.codeset.MarginTypeCode.BasisRiskMargin, com.tools20022.repository.codeset.MarginTypeCode.WrongWayRiskMargin,
						com.tools20022.repository.codeset.MarginTypeCode.SovereignRiskMargin, com.tools20022.repository.codeset.MarginTypeCode.MarketRiskMargin, com.tools20022.repository.codeset.MarginTypeCode.CreditRiskAdditionalMargin,
						com.tools20022.repository.codeset.MarginTypeCode.ContingentVariationMargin, com.tools20022.repository.codeset.MarginTypeCode.SponsorRiskMargin,
						com.tools20022.repository.codeset.MarginTypeCode.JumpToDefaultRequirement, com.tools20022.repository.codeset.MarginTypeCode.DiscretionaryRiskAddOn, com.tools20022.repository.codeset.MarginTypeCode.Other);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(SettlementRiskMargin.getCodeName().get(), SettlementRiskMargin);
		codesByName.put(AdditionalDefaultFundMargin.getCodeName().get(), AdditionalDefaultFundMargin);
		codesByName.put(ShortChargeMargin.getCodeName().get(), ShortChargeMargin);
		codesByName.put(CouponMargin.getCodeName().get(), CouponMargin);
		codesByName.put(UpfrontMargin.getCodeName().get(), UpfrontMargin);
		codesByName.put(CreditEventMargin.getCodeName().get(), CreditEventMargin);
		codesByName.put(InitialDeposit.getCodeName().get(), InitialDeposit);
		codesByName.put(NegociationMargin.getCodeName().get(), NegociationMargin);
		codesByName.put(InitialMargin.getCodeName().get(), InitialMargin);
		codesByName.put(VariationMargin.getCodeName().get(), VariationMargin);
		codesByName.put(IncreaseCoverageAmount.getCodeName().get(), IncreaseCoverageAmount);
		codesByName.put(LiquidityRiskMargin.getCodeName().get(), LiquidityRiskMargin);
		codesByName.put(BasisRiskMargin.getCodeName().get(), BasisRiskMargin);
		codesByName.put(WrongWayRiskMargin.getCodeName().get(), WrongWayRiskMargin);
		codesByName.put(SovereignRiskMargin.getCodeName().get(), SovereignRiskMargin);
		codesByName.put(MarketRiskMargin.getCodeName().get(), MarketRiskMargin);
		codesByName.put(CreditRiskAdditionalMargin.getCodeName().get(), CreditRiskAdditionalMargin);
		codesByName.put(ContingentVariationMargin.getCodeName().get(), ContingentVariationMargin);
		codesByName.put(SponsorRiskMargin.getCodeName().get(), SponsorRiskMargin);
		codesByName.put(JumpToDefaultRequirement.getCodeName().get(), JumpToDefaultRequirement);
		codesByName.put(DiscretionaryRiskAddOn.getCodeName().get(), DiscretionaryRiskAddOn);
		codesByName.put(Other.getCodeName().get(), Other);
	}

	public static MarginTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static MarginTypeCode[] values() {
		MarginTypeCode[] values = new MarginTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, MarginTypeCode> {
		@Override
		public MarginTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(MarginTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}