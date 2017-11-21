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
 * Specifies the type of margin, for example, initial margin, variation margin,
 * initial deposit or coupon margin.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarginTypeCode#mmSettlementRiskMargin
 * MarginTypeCode.mmSettlementRiskMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarginTypeCode#mmAdditionalDefaultFundMargin
 * MarginTypeCode.mmAdditionalDefaultFundMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarginTypeCode#mmShortChargeMargin
 * MarginTypeCode.mmShortChargeMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarginTypeCode#mmCouponMargin
 * MarginTypeCode.mmCouponMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarginTypeCode#mmUpfrontMargin
 * MarginTypeCode.mmUpfrontMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarginTypeCode#mmCreditEventMargin
 * MarginTypeCode.mmCreditEventMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarginTypeCode#mmInitialDeposit
 * MarginTypeCode.mmInitialDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarginTypeCode#mmNegociationMargin
 * MarginTypeCode.mmNegociationMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarginTypeCode#mmInitialMargin
 * MarginTypeCode.mmInitialMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarginTypeCode#mmVariationMargin
 * MarginTypeCode.mmVariationMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarginTypeCode#mmIncreaseCoverageAmount
 * MarginTypeCode.mmIncreaseCoverageAmount}</li>
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
public class MarginTypeCode {

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
	public static final MMCode mmSettlementRiskMargin = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementRiskMargin";
			definition = "Margin required to cover the risk of non settlement of the underlying. Also used to cover the risk linked to the non settlement on payment platforms (for example TARGET2 vs CLS).";
			owner_lazy = () -> MarginTypeCode.mmObject();
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
	public static final MMCode mmAdditionalDefaultFundMargin = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDefaultFundMargin";
			definition = "Additional margin required to cover the daily risk encountered by the central counterparty before the clearing member is actually called to cover the default fund. Indeed, central counterparty calculates the margin on the default fund on a daily basis but only calls the clearing member at the end of the month.";
			owner_lazy = () -> MarginTypeCode.mmObject();
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
	public static final MMCode mmShortChargeMargin = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortChargeMargin";
			definition = "Margin required to cover the concentration risk linked to the default of the seller of the \"protection\" (for example CDS seller).";
			owner_lazy = () -> MarginTypeCode.mmObject();
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
	public static final MMCode mmCouponMargin = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CouponMargin";
			definition = "Margin required to cover the non payment of the monthly premium (for credit derivatives).";
			owner_lazy = () -> MarginTypeCode.mmObject();
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
	public static final MMCode mmUpfrontMargin = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UpfrontMargin";
			definition = "Margin required to cover the non payment of the upfront premium (for credit derivatives).";
			owner_lazy = () -> MarginTypeCode.mmObject();
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
	public static final MMCode mmCreditEventMargin = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditEventMargin";
			definition = "Margin required to cover the risk of any event linked to the underlying (for example the payment default by the issuer of a debt).";
			owner_lazy = () -> MarginTypeCode.mmObject();
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
	public static final MMCode mmInitialDeposit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitialDeposit";
			definition = "Margin required to enable a member to start trading on a specific market where high risks and amounts are involved.";
			owner_lazy = () -> MarginTypeCode.mmObject();
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
	public static final MMCode mmNegociationMargin = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NegociationMargin";
			definition = "Margin calculated on the same basis as for the variation margin but the margin is kept by the central counterparty and not \"paid \" to the other clearing member.";
			owner_lazy = () -> MarginTypeCode.mmObject();
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
	public static final MMCode mmInitialMargin = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitialMargin";
			definition = "Margin required for absorbing future market price fluctuations (market risks) occurring between the default of a member and close-out of unsettled securities positions by the central counterparty.";
			owner_lazy = () -> MarginTypeCode.mmObject();
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
	public static final MMCode mmVariationMargin = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariationMargin";
			definition = "Margin required to cover the risk linked to the price fluctuations occurred on the unsettled exposures towards central counterparty.";
			owner_lazy = () -> MarginTypeCode.mmObject();
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
	public static final MMCode mmIncreaseCoverageAmount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncreaseCoverageAmount";
			definition = "Additional margin required to cover a risk increase (expressed in the reporting currency). This results from a risk management decision depending on central counterparty specific criteria.";
			owner_lazy = () -> MarginTypeCode.mmObject();
			codeName = "INCA";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("SEMA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MarginTypeCode";
				definition = "Specifies the type of margin, for example, initial margin, variation margin, initial deposit or coupon margin.";
				code_lazy = () -> Arrays.asList(MarginTypeCode.mmSettlementRiskMargin, MarginTypeCode.mmAdditionalDefaultFundMargin, MarginTypeCode.mmShortChargeMargin, MarginTypeCode.mmCouponMargin, MarginTypeCode.mmUpfrontMargin,
						MarginTypeCode.mmCreditEventMargin, MarginTypeCode.mmInitialDeposit, MarginTypeCode.mmNegociationMargin, MarginTypeCode.mmInitialMargin, MarginTypeCode.mmVariationMargin, MarginTypeCode.mmIncreaseCoverageAmount);
			}
		});
		return mmObject_lazy.get();
	}
}