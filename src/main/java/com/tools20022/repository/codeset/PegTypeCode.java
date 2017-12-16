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
import com.tools20022.repository.codeset.PegTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates a type of instruction to a broker/dealer to buy or sell a financial
 * instrument which is pegged against a certain value.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.PegTypeCode#Fixed
 * PegTypeCode.mmFixed}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PegTypeCode#Last
 * PegTypeCode.mmLast}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PegTypeCode#Market
 * PegTypeCode.mmMarket}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PegTypeCode#MidPrice
 * PegTypeCode.mmMidPrice}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PegTypeCode#Opening
 * PegTypeCode.mmOpening}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PegTypeCode#Primary
 * PegTypeCode.mmPrimary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PegTypeCode#VolumeWeightAveragePrice
 * PegTypeCode.mmVolumeWeightAveragePrice}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PegTypeCode#TrailingStop
 * PegTypeCode.mmTrailingStop}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PegTypeCode#LimitPrice
 * PegTypeCode.mmLimitPrice}</li>
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
 * <li>"FIXE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PegTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates a type of instruction to a broker/dealer to buy or sell a financial instrument which is pegged against a certain value."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PegTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Order pegged against a fixed amount (local best bid or offer, at time of
	 * order).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PegTypeCode PegTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FIXE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Fixed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Order pegged against a fixed amount (local best bid or offer, at time of order)."
	 * </li>
	 * </ul>
	 */
	public static final PegTypeCode Fixed = new PegTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Fixed";
			definition = "Order pegged against a fixed amount (local best bid or offer, at time of order).";
			owner_lazy = () -> com.tools20022.repository.codeset.PegTypeCode.mmObject();
			codeName = "FIXE";
		}
	};
	/**
	 * Order pegged against the last price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PegTypeCode PegTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LAST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Last"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order pegged against the last price."</li>
	 * </ul>
	 */
	public static final PegTypeCode Last = new PegTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Last";
			definition = "Order pegged against the last price.";
			owner_lazy = () -> com.tools20022.repository.codeset.PegTypeCode.mmObject();
			codeName = "LAST";
		}
	};
	/**
	 * Order pegged against the current market price. Relative to the offering
	 * if buying and relative to the bid if selling.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PegTypeCode PegTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MARK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Market"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Order pegged against the current market price. Relative to the offering if buying and relative to the bid if selling."
	 * </li>
	 * </ul>
	 */
	public static final PegTypeCode Market = new PegTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Market";
			definition = "Order pegged against the current market price. Relative to the offering if buying and relative to the bid if selling.";
			owner_lazy = () -> com.tools20022.repository.codeset.PegTypeCode.mmObject();
			codeName = "MARK";
		}
	};
	/**
	 * Order pegged against the mid price, which is the average between the
	 * offer and bid prices.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PegTypeCode PegTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MIDP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MidPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Order pegged against the mid price, which is the average between the offer and bid prices."
	 * </li>
	 * </ul>
	 */
	public static final PegTypeCode MidPrice = new PegTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MidPrice";
			definition = "Order pegged against the mid price, which is the average between the offer and bid prices.";
			owner_lazy = () -> com.tools20022.repository.codeset.PegTypeCode.mmObject();
			codeName = "MIDP";
		}
	};
	/**
	 * Order pegged against the opening price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PegTypeCode PegTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OPEN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Opening"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order pegged against the opening price."</li>
	 * </ul>
	 */
	public static final PegTypeCode Opening = new PegTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Opening";
			definition = "Order pegged against the opening price.";
			owner_lazy = () -> com.tools20022.repository.codeset.PegTypeCode.mmObject();
			codeName = "OPEN";
		}
	};
	/**
	 * Order pegged against the primary market where the financial instrument is
	 * traded. It is relative to the offering if buying and relative to the bid
	 * if selling.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PegTypeCode PegTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRIM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Primary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Order pegged against the primary market where the financial instrument is traded. It is relative to the offering if buying and relative to the bid if selling."
	 * </li>
	 * </ul>
	 */
	public static final PegTypeCode Primary = new PegTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Primary";
			definition = "Order pegged against the primary market where the financial instrument is traded. It is relative to the offering if buying and relative to the bid if selling.";
			owner_lazy = () -> com.tools20022.repository.codeset.PegTypeCode.mmObject();
			codeName = "PRIM";
		}
	};
	/**
	 * Order pegged against the volume weighted average price for the day.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PegTypeCode PegTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VWAP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VolumeWeightAveragePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Order pegged against the volume weighted average price for the day."</li>
	 * </ul>
	 */
	public static final PegTypeCode VolumeWeightAveragePrice = new PegTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VolumeWeightAveragePrice";
			definition = "Order pegged against the volume weighted average price for the day.";
			owner_lazy = () -> com.tools20022.repository.codeset.PegTypeCode.mmObject();
			codeName = "VWAP";
		}
	};
	/**
	 * Pegged order representing a stop order with a stop price pegged to trail
	 * a specified distance behind the last price. The price of a trailing stop
	 * to buy can never increase, and the price of a trailing stop to sell can
	 * never decrease.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PegTypeCode PegTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TrailingStop"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Pegged order representing a stop order with a stop price pegged to trail a specified distance behind the last price. The price of a trailing stop to buy can never increase, and the price of a trailing stop to sell can never decrease."
	 * </li>
	 * </ul>
	 */
	public static final PegTypeCode TrailingStop = new PegTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TrailingStop";
			definition = "Pegged order representing a stop order with a stop price pegged to trail a specified distance behind the last price. The price of a trailing stop to buy can never increase, and the price of a trailing stop to sell can never decrease.";
			owner_lazy = () -> com.tools20022.repository.codeset.PegTypeCode.mmObject();
			codeName = "TRST";
		}
	};
	/**
	 * Order pegged against a limit price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PegTypeCode PegTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LIMI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order pegged against a limit price."</li>
	 * </ul>
	 */
	public static final PegTypeCode LimitPrice = new PegTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitPrice";
			definition = "Order pegged against a limit price.";
			owner_lazy = () -> com.tools20022.repository.codeset.PegTypeCode.mmObject();
			codeName = "LIMI";
		}
	};
	final static private LinkedHashMap<String, PegTypeCode> codesByName = new LinkedHashMap<>();

	protected PegTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("FIXE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PegTypeCode";
				definition = "Indicates a type of instruction to a broker/dealer to buy or sell a financial instrument which is pegged against a certain value.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PegTypeCode.Fixed, com.tools20022.repository.codeset.PegTypeCode.Last, com.tools20022.repository.codeset.PegTypeCode.Market,
						com.tools20022.repository.codeset.PegTypeCode.MidPrice, com.tools20022.repository.codeset.PegTypeCode.Opening, com.tools20022.repository.codeset.PegTypeCode.Primary,
						com.tools20022.repository.codeset.PegTypeCode.VolumeWeightAveragePrice, com.tools20022.repository.codeset.PegTypeCode.TrailingStop, com.tools20022.repository.codeset.PegTypeCode.LimitPrice);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Fixed.getCodeName().get(), Fixed);
		codesByName.put(Last.getCodeName().get(), Last);
		codesByName.put(Market.getCodeName().get(), Market);
		codesByName.put(MidPrice.getCodeName().get(), MidPrice);
		codesByName.put(Opening.getCodeName().get(), Opening);
		codesByName.put(Primary.getCodeName().get(), Primary);
		codesByName.put(VolumeWeightAveragePrice.getCodeName().get(), VolumeWeightAveragePrice);
		codesByName.put(TrailingStop.getCodeName().get(), TrailingStop);
		codesByName.put(LimitPrice.getCodeName().get(), LimitPrice);
	}

	public static PegTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PegTypeCode[] values() {
		PegTypeCode[] values = new PegTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PegTypeCode> {
		@Override
		public PegTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PegTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}