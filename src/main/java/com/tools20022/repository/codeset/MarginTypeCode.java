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
 * MarginTypeCode.mmSettlementRiskMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarginTypeCode#AdditionalDefaultFundMargin
 * MarginTypeCode.mmAdditionalDefaultFundMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarginTypeCode#ShortChargeMargin
 * MarginTypeCode.mmShortChargeMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarginTypeCode#CouponMargin
 * MarginTypeCode.mmCouponMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarginTypeCode#UpfrontMargin
 * MarginTypeCode.mmUpfrontMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarginTypeCode#CreditEventMargin
 * MarginTypeCode.mmCreditEventMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarginTypeCode#InitialDeposit
 * MarginTypeCode.mmInitialDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarginTypeCode#NegociationMargin
 * MarginTypeCode.mmNegociationMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarginTypeCode#InitialMargin
 * MarginTypeCode.mmInitialMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarginTypeCode#VariationMargin
 * MarginTypeCode.mmVariationMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarginTypeCode#IncreaseCoverageAmount
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
	final static private LinkedHashMap<String, MarginTypeCode> codesByName = new LinkedHashMap<>();

	protected MarginTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("SEMA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MarginTypeCode";
				definition = "Specifies the type of margin, for example, initial margin, variation margin, initial deposit or coupon margin.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MarginTypeCode.SettlementRiskMargin, com.tools20022.repository.codeset.MarginTypeCode.AdditionalDefaultFundMargin,
						com.tools20022.repository.codeset.MarginTypeCode.ShortChargeMargin, com.tools20022.repository.codeset.MarginTypeCode.CouponMargin, com.tools20022.repository.codeset.MarginTypeCode.UpfrontMargin,
						com.tools20022.repository.codeset.MarginTypeCode.CreditEventMargin, com.tools20022.repository.codeset.MarginTypeCode.InitialDeposit, com.tools20022.repository.codeset.MarginTypeCode.NegociationMargin,
						com.tools20022.repository.codeset.MarginTypeCode.InitialMargin, com.tools20022.repository.codeset.MarginTypeCode.VariationMargin, com.tools20022.repository.codeset.MarginTypeCode.IncreaseCoverageAmount);
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