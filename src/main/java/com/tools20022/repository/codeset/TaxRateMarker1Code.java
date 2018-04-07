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
import com.tools20022.repository.codeset.TaxRateMarker1Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.TaxRateMarker1Code#AmountQuotedLessLifeAssurance
 * TaxRateMarker1Code.AmountQuotedLessLifeAssurance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRateMarker1Code#AmountQuotedLessStandardRate
 * TaxRateMarker1Code.AmountQuotedLessStandardRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRateMarker1Code#GrossAmount
 * TaxRateMarker1Code.GrossAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.TaxRateMarkerCode
 * TaxRateMarkerCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TaxRateMarker1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the rate of tax levied."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TaxRateMarker1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRateMarker1Code
	 * TaxRateMarker1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountQuotedLessLifeAssurance"</li>
	 * </ul>
	 */
	public static final TaxRateMarker1Code AmountQuotedLessLifeAssurance = new TaxRateMarker1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountQuotedLessLifeAssurance";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxRateMarker1Code.mmObject();
			codeName = TaxRateMarkerCode.AmountQuotedLessLifeAssurance.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRateMarker1Code
	 * TaxRateMarker1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountQuotedLessStandardRate"</li>
	 * </ul>
	 */
	public static final TaxRateMarker1Code AmountQuotedLessStandardRate = new TaxRateMarker1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountQuotedLessStandardRate";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxRateMarker1Code.mmObject();
			codeName = TaxRateMarkerCode.AmountQuotedLessStandardRate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRateMarker1Code
	 * TaxRateMarker1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossAmount"</li>
	 * </ul>
	 */
	public static final TaxRateMarker1Code GrossAmount = new TaxRateMarker1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxRateMarker1Code.mmObject();
			codeName = TaxRateMarkerCode.GrossAmount.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TaxRateMarker1Code> codesByName = new LinkedHashMap<>();

	protected TaxRateMarker1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "TaxRateMarker1Code";
				definition = "Specifies the rate of tax levied.";
				trace_lazy = () -> TaxRateMarkerCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TaxRateMarker1Code.AmountQuotedLessLifeAssurance, com.tools20022.repository.codeset.TaxRateMarker1Code.AmountQuotedLessStandardRate,
						com.tools20022.repository.codeset.TaxRateMarker1Code.GrossAmount);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AmountQuotedLessLifeAssurance.getCodeName().get(), AmountQuotedLessLifeAssurance);
		codesByName.put(AmountQuotedLessStandardRate.getCodeName().get(), AmountQuotedLessStandardRate);
		codesByName.put(GrossAmount.getCodeName().get(), GrossAmount);
	}

	public static TaxRateMarker1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TaxRateMarker1Code[] values() {
		TaxRateMarker1Code[] values = new TaxRateMarker1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TaxRateMarker1Code> {
		@Override
		public TaxRateMarker1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TaxRateMarker1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}