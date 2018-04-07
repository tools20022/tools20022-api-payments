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
import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.PrePaymentSpeedCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Speed of unscheduled partial of complete payment of the principal amount
 * outstanding on a debt obligation before its due date.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PrePaymentSpeedCode#SingleMonthlyMortality
 * PrePaymentSpeedCode.SingleMonthlyMortality}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PrePaymentSpeedCode#ConstantPrePaymentRate
 * PrePaymentSpeedCode.ConstantPrePaymentRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PrePaymentSpeedCode#AbsolutePrePaymentSpeed
 * PrePaymentSpeedCode.AbsolutePrePaymentSpeed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PrePaymentSpeedCode#MonthlyPrePaymentRate
 * PrePaymentSpeedCode.MonthlyPrePaymentRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PrePaymentSpeedCode#HomeEquityPrePaymentCurve
 * PrePaymentSpeedCode.HomeEquityPrePaymentCurve}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PrePaymentSpeedCode#BMAPrePaymentCurve
 * PrePaymentSpeedCode.BMAPrePaymentCurve}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PrePaymentSpeedCode#ProspectusPrePaymentCurve
 * PrePaymentSpeedCode.ProspectusPrePaymentCurve}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PrePaymentSpeedCode#ManufacturedHousingPrePaymentCurve
 * PrePaymentSpeedCode.ManufacturedHousingPrePaymentCurve}</li>
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
 * <li>"SIMM"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PrePaymentSpeedCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Speed of unscheduled partial of complete payment of the principal amount outstanding on a debt obligation before its due date."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PrePaymentSpeedCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Prepayment speed schedule is Single Monthly Mortality, ie, the percentage
	 * of outstanding mortgage loan principal prepays in one month.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PrePaymentSpeedCode
	 * PrePaymentSpeedCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SIMM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 233 value SMM</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SingleMonthlyMortality"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Prepayment speed schedule is Single Monthly Mortality, ie, the percentage of outstanding mortgage loan principal prepays in one month."
	 * </li>
	 * </ul>
	 */
	public static final PrePaymentSpeedCode SingleMonthlyMortality = new PrePaymentSpeedCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "233 value SMM"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SingleMonthlyMortality";
			definition = "Prepayment speed schedule is Single Monthly Mortality, ie, the percentage of outstanding mortgage loan principal prepays in one month.";
			owner_lazy = () -> com.tools20022.repository.codeset.PrePaymentSpeedCode.mmObject();
			codeName = "SIMM";
		}
	};
	/**
	 * Measure of prepayment as a percentage of the current outstanding loan
	 * balance, expressed as a compound annual rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PrePaymentSpeedCode
	 * PrePaymentSpeedCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COPR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 233 value CPR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConstantPrePaymentRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Measure of prepayment as a percentage of the current outstanding loan balance, expressed as a compound annual rate."
	 * </li>
	 * </ul>
	 */
	public static final PrePaymentSpeedCode ConstantPrePaymentRate = new PrePaymentSpeedCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "233 value CPR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConstantPrePaymentRate";
			definition = "Measure of prepayment as a percentage of the current outstanding loan balance, expressed as a compound annual rate.";
			owner_lazy = () -> com.tools20022.repository.codeset.PrePaymentSpeedCode.mmObject();
			codeName = "COPR";
		}
	};
	/**
	 * Measure of prepayment as a monthly percentage of the original loan
	 * balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PrePaymentSpeedCode
	 * PrePaymentSpeedCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ABPS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 233 value ABS</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AbsolutePrePaymentSpeed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Measure of prepayment as a monthly percentage of the original loan balance."
	 * </li>
	 * </ul>
	 */
	public static final PrePaymentSpeedCode AbsolutePrePaymentSpeed = new PrePaymentSpeedCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "233 value ABS"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AbsolutePrePaymentSpeed";
			definition = "Measure of prepayment as a monthly percentage of the original loan balance.";
			owner_lazy = () -> com.tools20022.repository.codeset.PrePaymentSpeedCode.mmObject();
			codeName = "ABPS";
		}
	};
	/**
	 * Repayment measure for nonamortizing assets not subject to prepayment. It
	 * is calculated by dividing the sum of the interest and principal payments
	 * received in a month by the outstanding balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PrePaymentSpeedCode
	 * PrePaymentSpeedCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MOPR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 233 value MPR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MonthlyPrePaymentRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Repayment measure for nonamortizing assets not subject to prepayment. It is calculated by dividing the sum of the interest and principal payments received in a month by the outstanding balance."
	 * </li>
	 * </ul>
	 */
	public static final PrePaymentSpeedCode MonthlyPrePaymentRate = new PrePaymentSpeedCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "233 value MPR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MonthlyPrePaymentRate";
			definition = "Repayment measure for nonamortizing assets not subject to prepayment. It is calculated by dividing the sum of the interest and principal payments received in a month by the outstanding balance.";
			owner_lazy = () -> com.tools20022.repository.codeset.PrePaymentSpeedCode.mmObject();
			codeName = "MOPR";
		}
	};
	/**
	 * Contains the type of prepayment speed of the financial instrument,
	 * expressed as a percentage of the final Constant Prepayment Rate of the
	 * Home Equity Prepayment Curve (10-month seasoning scale composed of even
	 * step-ups, terminating at the final Home Equity Prepayment percentage in
	 * the 10th month).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PrePaymentSpeedCode
	 * PrePaymentSpeedCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HOEP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 233 value HEP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HomeEquityPrePaymentCurve"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contains the type of prepayment speed of the financial instrument, expressed as a percentage of the final Constant Prepayment Rate of the Home Equity Prepayment Curve (10-month seasoning scale composed of even step-ups, terminating at the final Home Equity Prepayment percentage in the 10th month)."
	 * </li>
	 * </ul>
	 */
	public static final PrePaymentSpeedCode HomeEquityPrePaymentCurve = new PrePaymentSpeedCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "233 value HEP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HomeEquityPrePaymentCurve";
			definition = "Contains the type of prepayment speed of the financial instrument, expressed as a percentage of the final Constant Prepayment Rate of the Home Equity Prepayment Curve (10-month seasoning scale composed of even step-ups, terminating at the final Home Equity Prepayment percentage in the 10th month).";
			owner_lazy = () -> com.tools20022.repository.codeset.PrePaymentSpeedCode.mmObject();
			codeName = "HOEP";
		}
	};
	/**
	 * Contains the type of prepayment speed of the financial instrument,
	 * expressed as a percentage of the Bonds Market Association prepayment
	 * Curve.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PrePaymentSpeedCode
	 * PrePaymentSpeedCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BOMA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 233 value PSA</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BMAPrePaymentCurve"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contains the type of prepayment speed of the financial instrument, expressed as a percentage of the Bonds Market Association prepayment Curve."
	 * </li>
	 * </ul>
	 */
	public static final PrePaymentSpeedCode BMAPrePaymentCurve = new PrePaymentSpeedCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "233 value PSA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BMAPrePaymentCurve";
			definition = "Contains the type of prepayment speed of the financial instrument, expressed as a percentage of the Bonds Market Association prepayment Curve.";
			owner_lazy = () -> com.tools20022.repository.codeset.PrePaymentSpeedCode.mmObject();
			codeName = "BOMA";
		}
	};
	/**
	 * Refers to the pricing speed of a transaction as defined in the prospectus
	 * and is specific to the issue which are normally priced at 100 percent
	 * PPC.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PrePaymentSpeedCode
	 * PrePaymentSpeedCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PROP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 233 value PPC</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProspectusPrePaymentCurve"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Refers to the pricing speed of a transaction as defined in the prospectus and is specific to the issue which are normally priced at 100 percent PPC."
	 * </li>
	 * </ul>
	 */
	public static final PrePaymentSpeedCode ProspectusPrePaymentCurve = new PrePaymentSpeedCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "233 value PPC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProspectusPrePaymentCurve";
			definition = "Refers to the pricing speed of a transaction as defined in the prospectus and is specific to the issue which are normally priced at 100 percent PPC.";
			owner_lazy = () -> com.tools20022.repository.codeset.PrePaymentSpeedCode.mmObject();
			codeName = "PROP";
		}
	};
	/**
	 * Contains the type of prepayment speed of the financial instrument,
	 * expressed as a percentage of the Manufactured Housing Prepayment Curve
	 * (24-month seasoning scale composed of even step-ups).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PrePaymentSpeedCode
	 * PrePaymentSpeedCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MAHP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 233 value MHP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ManufacturedHousingPrePaymentCurve"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contains the type of prepayment speed of the financial instrument, expressed as a percentage of the Manufactured Housing Prepayment Curve (24-month seasoning scale composed of even step-ups)."
	 * </li>
	 * </ul>
	 */
	public static final PrePaymentSpeedCode ManufacturedHousingPrePaymentCurve = new PrePaymentSpeedCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "233 value MHP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ManufacturedHousingPrePaymentCurve";
			definition = "Contains the type of prepayment speed of the financial instrument, expressed as a percentage of the Manufactured Housing Prepayment Curve (24-month seasoning scale composed of even step-ups).";
			owner_lazy = () -> com.tools20022.repository.codeset.PrePaymentSpeedCode.mmObject();
			codeName = "MAHP";
		}
	};
	final static private LinkedHashMap<String, PrePaymentSpeedCode> codesByName = new LinkedHashMap<>();

	protected PrePaymentSpeedCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("SIMM");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PrePaymentSpeedCode";
				definition = "Speed of unscheduled partial of complete payment of the principal amount outstanding on a debt obligation before its due date.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PrePaymentSpeedCode.SingleMonthlyMortality, com.tools20022.repository.codeset.PrePaymentSpeedCode.ConstantPrePaymentRate,
						com.tools20022.repository.codeset.PrePaymentSpeedCode.AbsolutePrePaymentSpeed, com.tools20022.repository.codeset.PrePaymentSpeedCode.MonthlyPrePaymentRate,
						com.tools20022.repository.codeset.PrePaymentSpeedCode.HomeEquityPrePaymentCurve, com.tools20022.repository.codeset.PrePaymentSpeedCode.BMAPrePaymentCurve,
						com.tools20022.repository.codeset.PrePaymentSpeedCode.ProspectusPrePaymentCurve, com.tools20022.repository.codeset.PrePaymentSpeedCode.ManufacturedHousingPrePaymentCurve);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(SingleMonthlyMortality.getCodeName().get(), SingleMonthlyMortality);
		codesByName.put(ConstantPrePaymentRate.getCodeName().get(), ConstantPrePaymentRate);
		codesByName.put(AbsolutePrePaymentSpeed.getCodeName().get(), AbsolutePrePaymentSpeed);
		codesByName.put(MonthlyPrePaymentRate.getCodeName().get(), MonthlyPrePaymentRate);
		codesByName.put(HomeEquityPrePaymentCurve.getCodeName().get(), HomeEquityPrePaymentCurve);
		codesByName.put(BMAPrePaymentCurve.getCodeName().get(), BMAPrePaymentCurve);
		codesByName.put(ProspectusPrePaymentCurve.getCodeName().get(), ProspectusPrePaymentCurve);
		codesByName.put(ManufacturedHousingPrePaymentCurve.getCodeName().get(), ManufacturedHousingPrePaymentCurve);
	}

	public static PrePaymentSpeedCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PrePaymentSpeedCode[] values() {
		PrePaymentSpeedCode[] values = new PrePaymentSpeedCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PrePaymentSpeedCode> {
		@Override
		public PrePaymentSpeedCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PrePaymentSpeedCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}