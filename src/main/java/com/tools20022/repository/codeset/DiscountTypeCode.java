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
import com.tools20022.repository.codeset.DiscountTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of discount, that is, the reason why a discount is
 * granted.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DiscountTypeCode#QuantityDiscount
 * DiscountTypeCode.QuantityDiscount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DiscountTypeCode#PromotionalDiscount
 * DiscountTypeCode.PromotionalDiscount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DiscountTypeCode#PricingDiscount
 * DiscountTypeCode.PricingDiscount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DiscountTypeCode#SpecialAgreementDiscount
 * DiscountTypeCode.SpecialAgreementDiscount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DiscountTypeCode#EndOfRangeDiscount
 * DiscountTypeCode.EndOfRangeDiscount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DiscountTypeCode#AdditionalPromotionalDiscount
 * DiscountTypeCode.AdditionalPromotionalDiscount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DiscountTypeCode#StandingDiscount
 * DiscountTypeCode.StandingDiscount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DiscountTypeCode#TermsDiscount
 * DiscountTypeCode.TermsDiscount}</li>
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
 * <li>"QUAN"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DiscountTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of discount, that is, the reason why a discount is granted."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DiscountTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Quantity discount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DiscountTypeCode
	 * DiscountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "QUAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityDiscount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity discount."</li>
	 * </ul>
	 */
	public static final DiscountTypeCode QuantityDiscount = new DiscountTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityDiscount";
			definition = "Quantity discount.";
			owner_lazy = () -> com.tools20022.repository.codeset.DiscountTypeCode.mmObject();
			codeName = "QUAN";
		}
	};
	/**
	 * Promotional discount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DiscountTypeCode
	 * DiscountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PROM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PromotionalDiscount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Promotional discount."</li>
	 * </ul>
	 */
	public static final DiscountTypeCode PromotionalDiscount = new DiscountTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PromotionalDiscount";
			definition = "Promotional discount.";
			owner_lazy = () -> com.tools20022.repository.codeset.DiscountTypeCode.mmObject();
			codeName = "PROM";
		}
	};
	/**
	 * Pricing discount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DiscountTypeCode
	 * DiscountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PricingDiscount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Pricing discount."</li>
	 * </ul>
	 */
	public static final DiscountTypeCode PricingDiscount = new DiscountTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PricingDiscount";
			definition = "Pricing discount.";
			owner_lazy = () -> com.tools20022.repository.codeset.DiscountTypeCode.mmObject();
			codeName = "PRIC";
		}
	};
	/**
	 * Special agreement discount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DiscountTypeCode
	 * DiscountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPAG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialAgreementDiscount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Special agreement discount."</li>
	 * </ul>
	 */
	public static final DiscountTypeCode SpecialAgreementDiscount = new DiscountTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialAgreementDiscount";
			definition = "Special agreement discount.";
			owner_lazy = () -> com.tools20022.repository.codeset.DiscountTypeCode.mmObject();
			codeName = "SPAG";
		}
	};
	/**
	 * End-of-range discount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DiscountTypeCode
	 * DiscountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ENOR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfRangeDiscount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "End-of-range discount."</li>
	 * </ul>
	 */
	public static final DiscountTypeCode EndOfRangeDiscount = new DiscountTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfRangeDiscount";
			definition = "End-of-range discount.";
			owner_lazy = () -> com.tools20022.repository.codeset.DiscountTypeCode.mmObject();
			codeName = "ENOR";
		}
	};
	/**
	 * Addition discount based on third-party agreed business promotional
	 * activity, i.e., extra 10 percent discount for 15 days).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DiscountTypeCode
	 * DiscountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ADPS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalPromotionalDiscount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Addition discount based on third-party agreed business promotional activity, i.e., extra 10 percent discount for 15 days)."
	 * </li>
	 * </ul>
	 */
	public static final DiscountTypeCode AdditionalPromotionalDiscount = new DiscountTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalPromotionalDiscount";
			definition = "Addition discount based on third-party agreed business promotional activity, i.e., extra 10 percent discount for 15 days).";
			owner_lazy = () -> com.tools20022.repository.codeset.DiscountTypeCode.mmObject();
			codeName = "ADPS";
		}
	};
	/**
	 * Discount based on volume purchased.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DiscountTypeCode
	 * DiscountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STDS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingDiscount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Discount based on volume purchased."</li>
	 * </ul>
	 */
	public static final DiscountTypeCode StandingDiscount = new DiscountTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingDiscount";
			definition = "Discount based on volume purchased.";
			owner_lazy = () -> com.tools20022.repository.codeset.DiscountTypeCode.mmObject();
			codeName = "STDS";
		}
	};
	/**
	 * Discount based on terms negotiated for payment within a specified time
	 * period, i.e., 2/10 Net 30 (2 percent discount if paid in 10 days;
	 * otherwise, net amount is due in 30 days).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DiscountTypeCode
	 * DiscountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TMDS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TermsDiscount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Discount based on terms negotiated for payment within a specified time period, i.e., 2/10 Net 30 (2 percent discount if paid in 10 days; otherwise, net amount is due in 30 days)."
	 * </li>
	 * </ul>
	 */
	public static final DiscountTypeCode TermsDiscount = new DiscountTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TermsDiscount";
			definition = "Discount based on terms negotiated for payment within a specified time period, i.e., 2/10 Net 30 (2 percent discount if paid in 10 days; otherwise, net amount is due in 30 days).";
			owner_lazy = () -> com.tools20022.repository.codeset.DiscountTypeCode.mmObject();
			codeName = "TMDS";
		}
	};
	final static private LinkedHashMap<String, DiscountTypeCode> codesByName = new LinkedHashMap<>();

	protected DiscountTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("QUAN");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DiscountTypeCode";
				definition = "Specifies the type of discount, that is, the reason why a discount is granted.";
				code_lazy = () -> Arrays
						.asList(com.tools20022.repository.codeset.DiscountTypeCode.QuantityDiscount, com.tools20022.repository.codeset.DiscountTypeCode.PromotionalDiscount,
								com.tools20022.repository.codeset.DiscountTypeCode.PricingDiscount, com.tools20022.repository.codeset.DiscountTypeCode.SpecialAgreementDiscount,
								com.tools20022.repository.codeset.DiscountTypeCode.EndOfRangeDiscount, com.tools20022.repository.codeset.DiscountTypeCode.AdditionalPromotionalDiscount,
								com.tools20022.repository.codeset.DiscountTypeCode.StandingDiscount, com.tools20022.repository.codeset.DiscountTypeCode.TermsDiscount);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(QuantityDiscount.getCodeName().get(), QuantityDiscount);
		codesByName.put(PromotionalDiscount.getCodeName().get(), PromotionalDiscount);
		codesByName.put(PricingDiscount.getCodeName().get(), PricingDiscount);
		codesByName.put(SpecialAgreementDiscount.getCodeName().get(), SpecialAgreementDiscount);
		codesByName.put(EndOfRangeDiscount.getCodeName().get(), EndOfRangeDiscount);
		codesByName.put(AdditionalPromotionalDiscount.getCodeName().get(), AdditionalPromotionalDiscount);
		codesByName.put(StandingDiscount.getCodeName().get(), StandingDiscount);
		codesByName.put(TermsDiscount.getCodeName().get(), TermsDiscount);
	}

	public static DiscountTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DiscountTypeCode[] values() {
		DiscountTypeCode[] values = new DiscountTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DiscountTypeCode> {
		@Override
		public DiscountTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DiscountTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}