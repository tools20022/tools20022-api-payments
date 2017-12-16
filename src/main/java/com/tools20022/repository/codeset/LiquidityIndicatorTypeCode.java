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
import com.tools20022.repository.codeset.LiquidityIndicatorTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the market and statistic conditions upon which a liquidity
 * indicator has been computed.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LiquidityIndicatorTypeCode#FiveDayMovingAverage
 * LiquidityIndicatorTypeCode.mmFiveDayMovingAverage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LiquidityIndicatorTypeCode#TwentyDayMovingAverage
 * LiquidityIndicatorTypeCode.mmTwentyDayMovingAverage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LiquidityIndicatorTypeCode#NormalMarketSize
 * LiquidityIndicatorTypeCode.mmNormalMarketSize}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LiquidityIndicatorTypeCode#Other
 * LiquidityIndicatorTypeCode.mmOther}</li>
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
 * <li>"FIVE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "LiquidityIndicatorTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the market and statistic conditions upon which a liquidity indicator has been computed."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class LiquidityIndicatorTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Computation is on the average value of the price of a security over a
	 * period of five days.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LiquidityIndicatorTypeCode
	 * LiquidityIndicatorTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FIVE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FiveDayMovingAverage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Computation is on the average value of the price of a security over a period of five days."
	 * </li>
	 * </ul>
	 */
	public static final LiquidityIndicatorTypeCode FiveDayMovingAverage = new LiquidityIndicatorTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FiveDayMovingAverage";
			definition = "Computation is on the average value of the price of a security over a period of five days.";
			owner_lazy = () -> com.tools20022.repository.codeset.LiquidityIndicatorTypeCode.mmObject();
			codeName = "FIVE";
		}
	};
	/**
	 * Computation is on the average value of the price of a security over a
	 * period of 20 days.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LiquidityIndicatorTypeCode
	 * LiquidityIndicatorTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TWEN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwentyDayMovingAverage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Computation is on the average value of the price of a security over a period of 20 days."
	 * </li>
	 * </ul>
	 */
	public static final LiquidityIndicatorTypeCode TwentyDayMovingAverage = new LiquidityIndicatorTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwentyDayMovingAverage";
			definition = "Computation is on the average value of the price of a security over a period of 20 days.";
			owner_lazy = () -> com.tools20022.repository.codeset.LiquidityIndicatorTypeCode.mmObject();
			codeName = "TWEN";
		}
	};
	/**
	 * Computation is on the standard market conditions and volume.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LiquidityIndicatorTypeCode
	 * LiquidityIndicatorTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NORM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NormalMarketSize"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Computation is on the standard market conditions and volume."</li>
	 * </ul>
	 */
	public static final LiquidityIndicatorTypeCode NormalMarketSize = new LiquidityIndicatorTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NormalMarketSize";
			definition = "Computation is on the standard market conditions and volume.";
			owner_lazy = () -> com.tools20022.repository.codeset.LiquidityIndicatorTypeCode.mmObject();
			codeName = "NORM";
		}
	};
	/**
	 * Computation is on another price computation method.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LiquidityIndicatorTypeCode
	 * LiquidityIndicatorTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Computation is on another price computation method."</li>
	 * </ul>
	 */
	public static final LiquidityIndicatorTypeCode Other = new LiquidityIndicatorTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Computation is on another price computation method.";
			owner_lazy = () -> com.tools20022.repository.codeset.LiquidityIndicatorTypeCode.mmObject();
			codeName = "OTHE";
		}
	};
	final static private LinkedHashMap<String, LiquidityIndicatorTypeCode> codesByName = new LinkedHashMap<>();

	protected LiquidityIndicatorTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("FIVE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "LiquidityIndicatorTypeCode";
				definition = "Specifies the market and statistic conditions upon which a liquidity indicator has been computed.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.LiquidityIndicatorTypeCode.FiveDayMovingAverage, com.tools20022.repository.codeset.LiquidityIndicatorTypeCode.TwentyDayMovingAverage,
						com.tools20022.repository.codeset.LiquidityIndicatorTypeCode.NormalMarketSize, com.tools20022.repository.codeset.LiquidityIndicatorTypeCode.Other);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(FiveDayMovingAverage.getCodeName().get(), FiveDayMovingAverage);
		codesByName.put(TwentyDayMovingAverage.getCodeName().get(), TwentyDayMovingAverage);
		codesByName.put(NormalMarketSize.getCodeName().get(), NormalMarketSize);
		codesByName.put(Other.getCodeName().get(), Other);
	}

	public static LiquidityIndicatorTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static LiquidityIndicatorTypeCode[] values() {
		LiquidityIndicatorTypeCode[] values = new LiquidityIndicatorTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, LiquidityIndicatorTypeCode> {
		@Override
		public LiquidityIndicatorTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(LiquidityIndicatorTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}