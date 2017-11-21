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
 * Specifies how the price valuation timing is done based on the timeline
 * defined in the prospectus.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ValuationTimingCode#mmExceptional
 * ValuationTimingCode.mmExceptional}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ValuationTimingCode#mmUsual
 * ValuationTimingCode.mmUsual}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ValuationTimingCode#mmParticular
 * ValuationTimingCode.mmParticular}</li>
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
 * <li>"EXCP"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ValuationTimingCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies how the price valuation timing is done based on the timeline defined in the prospectus."
 * </li>
 * </ul>
 */
public class ValuationTimingCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Price valuation is done exceptionally, outside the timeframe specified in
	 * the prospectus.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ValuationTimingCode
	 * ValuationTimingCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXCP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Exceptional"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price valuation is done exceptionally, outside the timeframe specified in the prospectus."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmExceptional = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Exceptional";
			definition = "Price valuation is done exceptionally, outside the timeframe specified in the prospectus.";
			owner_lazy = () -> ValuationTimingCode.mmObject();
			codeName = "EXCP";
		}
	};
	/**
	 * Price valuation is done within the timeframe specified in the prospectus.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ValuationTimingCode
	 * ValuationTimingCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "USUA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Usual"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price valuation is done within the timeframe specified in the prospectus."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmUsual = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Usual";
			definition = "Price valuation is done within the timeframe specified in the prospectus.";
			owner_lazy = () -> ValuationTimingCode.mmObject();
			codeName = "USUA";
		}
	};
	/**
	 * Price valuation that is done outside the usual timeframe, but in
	 * conformance with a case specified in the prospectus, eg, market closing
	 * day.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ValuationTimingCode
	 * ValuationTimingCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PATC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Particular"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price valuation that is done outside the usual timeframe, but in conformance with a case specified in the prospectus, eg, market closing day."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmParticular = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Particular";
			definition = "Price valuation that is done outside the usual timeframe, but in conformance with a case specified in the prospectus, eg, market closing day.";
			owner_lazy = () -> ValuationTimingCode.mmObject();
			codeName = "PATC";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("EXCP");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ValuationTimingCode";
				definition = "Specifies how the price valuation timing is done based on the timeline defined in the prospectus.";
				code_lazy = () -> Arrays.asList(ValuationTimingCode.mmExceptional, ValuationTimingCode.mmUsual, ValuationTimingCode.mmParticular);
			}
		});
		return mmObject_lazy.get();
	}
}