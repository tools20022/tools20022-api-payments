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
import com.tools20022.repository.codeset.TaxRateMarkerCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the rate of tax levied.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRateMarkerCode#GrossAmount
 * TaxRateMarkerCode.GrossAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRateMarkerCode#AmountQuotedLessStandardRate
 * TaxRateMarkerCode.AmountQuotedLessStandardRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRateMarkerCode#AmountQuotedLessLifeAssurance
 * TaxRateMarkerCode.AmountQuotedLessLifeAssurance}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxRateMarker1Code
 * TaxRateMarker1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TaxRateMarkerCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the rate of tax levied."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TaxRateMarkerCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies an amount before the deduction of tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRateMarkerCode
	 * TaxRateMarkerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GRSS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies an amount before the deduction of tax."</li>
	 * </ul>
	 */
	public static final TaxRateMarkerCode GrossAmount = new TaxRateMarkerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossAmount";
			definition = "Specifies an amount before the deduction of tax.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxRateMarkerCode.mmObject();
			codeName = "GRSS";
		}
	};
	/**
	 * Specifies the amount quoted less standard rate income tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRateMarkerCode
	 * TaxRateMarkerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ALIT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountQuotedLessStandardRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the amount quoted less standard rate income tax."</li>
	 * </ul>
	 */
	public static final TaxRateMarkerCode AmountQuotedLessStandardRate = new TaxRateMarkerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountQuotedLessStandardRate";
			definition = "Specifies the amount quoted less standard rate income tax.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxRateMarkerCode.mmObject();
			codeName = "ALIT";
		}
	};
	/**
	 * Specifies the amount quoted less life assurance premium rate income tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRateMarkerCode
	 * TaxRateMarkerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ALPR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountQuotedLessLifeAssurance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the amount quoted less life assurance premium rate income tax."
	 * </li>
	 * </ul>
	 */
	public static final TaxRateMarkerCode AmountQuotedLessLifeAssurance = new TaxRateMarkerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountQuotedLessLifeAssurance";
			definition = "Specifies the amount quoted less life assurance premium rate income tax.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxRateMarkerCode.mmObject();
			codeName = "ALPR";
		}
	};
	final static private LinkedHashMap<String, TaxRateMarkerCode> codesByName = new LinkedHashMap<>();

	protected TaxRateMarkerCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TaxRateMarkerCode";
				definition = "Specifies the rate of tax levied.";
				derivation_lazy = () -> Arrays.asList(TaxRateMarker1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TaxRateMarkerCode.GrossAmount, com.tools20022.repository.codeset.TaxRateMarkerCode.AmountQuotedLessStandardRate,
						com.tools20022.repository.codeset.TaxRateMarkerCode.AmountQuotedLessLifeAssurance);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(GrossAmount.getCodeName().get(), GrossAmount);
		codesByName.put(AmountQuotedLessStandardRate.getCodeName().get(), AmountQuotedLessStandardRate);
		codesByName.put(AmountQuotedLessLifeAssurance.getCodeName().get(), AmountQuotedLessLifeAssurance);
	}

	public static TaxRateMarkerCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TaxRateMarkerCode[] values() {
		TaxRateMarkerCode[] values = new TaxRateMarkerCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TaxRateMarkerCode> {
		@Override
		public TaxRateMarkerCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TaxRateMarkerCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}