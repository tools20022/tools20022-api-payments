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
import com.tools20022.repository.codeset.ExecutionTimeLimitCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates from/until when an order must be executed.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExecutionTimeLimitCode#AtTheOpening
 * ExecutionTimeLimitCode.mmAtTheOpening}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExecutionTimeLimitCode#AtTheClosing
 * ExecutionTimeLimitCode.mmAtTheClosing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExecutionTimeLimitCode#GoodUntilCancelled
 * ExecutionTimeLimitCode.mmGoodUntilCancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExecutionTimeLimitCode#GoodForTheDay
 * ExecutionTimeLimitCode.mmGoodForTheDay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExecutionTimeLimitCode#GoodThroughDate
 * ExecutionTimeLimitCode.mmGoodThroughDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExecutionTimeLimitCode#GoodForTheMonth
 * ExecutionTimeLimitCode.mmGoodForTheMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExecutionTimeLimitCode#FillOrKill
 * ExecutionTimeLimitCode.mmFillOrKill}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExecutionTimeLimitCode#GoodUntilTheEndOfNextMonth
 * ExecutionTimeLimitCode.mmGoodUntilTheEndOfNextMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExecutionTimeLimitCode#GoodTillCrossed
 * ExecutionTimeLimitCode.mmGoodTillCrossed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExecutionTimeLimitCode#ImmediateOrCancel
 * ExecutionTimeLimitCode.mmImmediateOrCancel}</li>
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
 * <li>"OPEN"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ExecutionTimeLimitCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Indicates from/until when an order must be executed."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ExecutionTimeLimitCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * A round lot order to be executed at the opening of the market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExecutionTimeLimitCode
	 * ExecutionTimeLimitCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OPEN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AtTheOpening"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A round lot order to be executed at the opening of the market."</li>
	 * </ul>
	 */
	public static final ExecutionTimeLimitCode AtTheOpening = new ExecutionTimeLimitCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AtTheOpening";
			definition = "A round lot order to be executed at the opening of the market.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExecutionTimeLimitCode.mmObject();
			codeName = "OPEN";
		}
	};
	/**
	 * An order to buy or sell at the closing price or an odd lot order to buy
	 * or sell to be filled at the closing of the round lot offer, plus a
	 * differential for a buy order or minus the differential on a sell order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExecutionTimeLimitCode
	 * ExecutionTimeLimitCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLOS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AtTheClosing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An order to buy or sell at the closing price or an odd lot order to buy or sell to be filled at the closing of the round lot offer, plus a differential for a buy order or minus the differential on a sell order."
	 * </li>
	 * </ul>
	 */
	public static final ExecutionTimeLimitCode AtTheClosing = new ExecutionTimeLimitCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AtTheClosing";
			definition = "An order to buy or sell at the closing price or an odd lot order to buy or sell to be filled at the closing of the round lot offer, plus a differential for a buy order or minus the differential on a sell order.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExecutionTimeLimitCode.mmObject();
			codeName = "CLOS";
		}
	};
	/**
	 * An order that remains in effect until it is either executed or cancelled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExecutionTimeLimitCode
	 * ExecutionTimeLimitCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GTCA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GoodUntilCancelled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An order that remains in effect until it is either executed or cancelled."
	 * </li>
	 * </ul>
	 */
	public static final ExecutionTimeLimitCode GoodUntilCancelled = new ExecutionTimeLimitCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GoodUntilCancelled";
			definition = "An order that remains in effect until it is either executed or cancelled.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExecutionTimeLimitCode.mmObject();
			codeName = "GTCA";
		}
	};
	/**
	 * An order that, if not executed, expires at the end of the trading day on
	 * which the order is entered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExecutionTimeLimitCode
	 * ExecutionTimeLimitCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GDAY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GoodForTheDay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An order that, if not executed, expires at the end of the trading day on which the order is entered."
	 * </li>
	 * </ul>
	 */
	public static final ExecutionTimeLimitCode GoodForTheDay = new ExecutionTimeLimitCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GoodForTheDay";
			definition = "An order that, if not executed, expires at the end of the trading day on which the order is entered.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExecutionTimeLimitCode.mmObject();
			codeName = "GDAY";
		}
	};
	/**
	 * An Order that if not executed, expires at the end of the specified expiry
	 * date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExecutionTimeLimitCode
	 * ExecutionTimeLimitCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GTHD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GoodThroughDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An Order that if not executed, expires at the end of the specified expiry date."
	 * </li>
	 * </ul>
	 */
	public static final ExecutionTimeLimitCode GoodThroughDate = new ExecutionTimeLimitCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GoodThroughDate";
			definition = "An Order that if not executed, expires at the end of the specified expiry date.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExecutionTimeLimitCode.mmObject();
			codeName = "GTHD";
		}
	};
	/**
	 * An order that, if not executed, expires at the end of the month on which
	 * the order is entered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExecutionTimeLimitCode
	 * ExecutionTimeLimitCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GTMO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GoodForTheMonth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An order that, if not executed, expires at the end of the month on which the order is entered."
	 * </li>
	 * </ul>
	 */
	public static final ExecutionTimeLimitCode GoodForTheMonth = new ExecutionTimeLimitCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GoodForTheMonth";
			definition = "An order that, if not executed, expires at the end of the month on which the order is entered.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExecutionTimeLimitCode.mmObject();
			codeName = "GTMO";
		}
	};
	/**
	 * A market or limit order that is to be executed in its entirety as soon as
	 * it is submitted; if not so executed, the order is to be cancelled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExecutionTimeLimitCode
	 * ExecutionTimeLimitCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FIKI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FillOrKill"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A market or limit order that is to be executed in its entirety as soon as it is submitted; if not so executed, the order is to be cancelled."
	 * </li>
	 * </ul>
	 */
	public static final ExecutionTimeLimitCode FillOrKill = new ExecutionTimeLimitCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FillOrKill";
			definition = "A market or limit order that is to be executed in its entirety as soon as it is submitted; if not so executed, the order is to be cancelled.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExecutionTimeLimitCode.mmObject();
			codeName = "FIKI";
		}
	};
	/**
	 * Indicates an order that is good until the end of next month.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExecutionTimeLimitCode
	 * ExecutionTimeLimitCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GTNM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GoodUntilTheEndOfNextMonth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates an order that is good until the end of next month."</li>
	 * </ul>
	 */
	public static final ExecutionTimeLimitCode GoodUntilTheEndOfNextMonth = new ExecutionTimeLimitCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GoodUntilTheEndOfNextMonth";
			definition = "Indicates an order that is good until the end of next month.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExecutionTimeLimitCode.mmObject();
			codeName = "GTNM";
		}
	};
	/**
	 * Indicates an order that is good till crossed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExecutionTimeLimitCode
	 * ExecutionTimeLimitCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GTXO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GoodTillCrossed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates an order that is good till crossed."</li>
	 * </ul>
	 */
	public static final ExecutionTimeLimitCode GoodTillCrossed = new ExecutionTimeLimitCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GoodTillCrossed";
			definition = "Indicates an order that is good till crossed.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExecutionTimeLimitCode.mmObject();
			codeName = "GTXO";
		}
	};
	/**
	 * A market or limit order to be executed in whole or in part as soon as it
	 * is submitted; any portion not so executed is to be cancelled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExecutionTimeLimitCode
	 * ExecutionTimeLimitCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IOCA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ImmediateOrCancel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A market or limit order to be executed in whole or in part as soon as it is submitted; any portion not so executed is to be cancelled."
	 * </li>
	 * </ul>
	 */
	public static final ExecutionTimeLimitCode ImmediateOrCancel = new ExecutionTimeLimitCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ImmediateOrCancel";
			definition = "A market or limit order to be executed in whole or in part as soon as it is submitted; any portion not so executed is to be cancelled.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExecutionTimeLimitCode.mmObject();
			codeName = "IOCA";
		}
	};
	final static private LinkedHashMap<String, ExecutionTimeLimitCode> codesByName = new LinkedHashMap<>();

	protected ExecutionTimeLimitCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("OPEN");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ExecutionTimeLimitCode";
				definition = "Indicates from/until when an order must be executed.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ExecutionTimeLimitCode.AtTheOpening, com.tools20022.repository.codeset.ExecutionTimeLimitCode.AtTheClosing,
						com.tools20022.repository.codeset.ExecutionTimeLimitCode.GoodUntilCancelled, com.tools20022.repository.codeset.ExecutionTimeLimitCode.GoodForTheDay,
						com.tools20022.repository.codeset.ExecutionTimeLimitCode.GoodThroughDate, com.tools20022.repository.codeset.ExecutionTimeLimitCode.GoodForTheMonth,
						com.tools20022.repository.codeset.ExecutionTimeLimitCode.FillOrKill, com.tools20022.repository.codeset.ExecutionTimeLimitCode.GoodUntilTheEndOfNextMonth,
						com.tools20022.repository.codeset.ExecutionTimeLimitCode.GoodTillCrossed, com.tools20022.repository.codeset.ExecutionTimeLimitCode.ImmediateOrCancel);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AtTheOpening.getCodeName().get(), AtTheOpening);
		codesByName.put(AtTheClosing.getCodeName().get(), AtTheClosing);
		codesByName.put(GoodUntilCancelled.getCodeName().get(), GoodUntilCancelled);
		codesByName.put(GoodForTheDay.getCodeName().get(), GoodForTheDay);
		codesByName.put(GoodThroughDate.getCodeName().get(), GoodThroughDate);
		codesByName.put(GoodForTheMonth.getCodeName().get(), GoodForTheMonth);
		codesByName.put(FillOrKill.getCodeName().get(), FillOrKill);
		codesByName.put(GoodUntilTheEndOfNextMonth.getCodeName().get(), GoodUntilTheEndOfNextMonth);
		codesByName.put(GoodTillCrossed.getCodeName().get(), GoodTillCrossed);
		codesByName.put(ImmediateOrCancel.getCodeName().get(), ImmediateOrCancel);
	}

	public static ExecutionTimeLimitCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ExecutionTimeLimitCode[] values() {
		ExecutionTimeLimitCode[] values = new ExecutionTimeLimitCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ExecutionTimeLimitCode> {
		@Override
		public ExecutionTimeLimitCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ExecutionTimeLimitCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}