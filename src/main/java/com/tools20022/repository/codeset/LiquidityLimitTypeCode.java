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
import com.tools20022.repository.codeset.LiquidityLimitTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the precise type of liquidity management limit.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LiquidityLimitTypeCode#Global
 * LiquidityLimitTypeCode.Global}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LiquidityLimitTypeCode#CashReservation
 * LiquidityLimitTypeCode.CashReservation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LiquidityLimitTypeCode#CriticalPaymentReservation
 * LiquidityLimitTypeCode.CriticalPaymentReservation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LiquidityLimitTypeCode#NetSSSReservation
 * LiquidityLimitTypeCode.NetSSSReservation}</li>
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
 * <li>"GLBL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "LiquidityLimitTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the precise type of liquidity management limit."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class LiquidityLimitTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Maximum value set by either the transaction administrator or by a member
	 * for the participation of a member in the system. The global limit may be
	 * expressed as a credit or debit maximum value and is taken into account by
	 * the transaction administrator when processing transaction inside the
	 * system. With the help of the global limit, the direct participant may
	 * limit the use of liquidity when clearing specific type of payments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LiquidityLimitTypeCode
	 * LiquidityLimitTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GLBL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Global"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum value set by either the transaction administrator or by a member for the participation of a member in the system. The global limit may be expressed as a credit or debit maximum value and is taken into account by the transaction administrator when processing transaction inside the system. With the help of the global limit, the direct participant may limit the use of liquidity when clearing specific type of payments."
	 * </li>
	 * </ul>
	 */
	public static final LiquidityLimitTypeCode Global = new LiquidityLimitTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Global";
			definition = "Maximum value set by either the transaction administrator or by a member for the participation of a member in the system. The global limit may be expressed as a credit or debit maximum value and is taken into account by the transaction administrator when processing transaction inside the system. With the help of the global limit, the direct participant may limit the use of liquidity when clearing specific type of payments.";
			owner_lazy = () -> com.tools20022.repository.codeset.LiquidityLimitTypeCode.mmObject();
			codeName = "GLBL";
		}
	};
	/**
	 * Amount set aside by a participant to reserve liquidity from its own
	 * account, exclusively for executing cash withdrawals.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LiquidityLimitTypeCode
	 * LiquidityLimitTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CARE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashReservation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount set aside by a participant to reserve liquidity from its own account, exclusively for executing cash withdrawals."
	 * </li>
	 * </ul>
	 */
	public static final LiquidityLimitTypeCode CashReservation = new LiquidityLimitTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashReservation";
			definition = "Amount set aside by a participant to reserve liquidity from its own account, exclusively for executing cash withdrawals.";
			owner_lazy = () -> com.tools20022.repository.codeset.LiquidityLimitTypeCode.mmObject();
			codeName = "CARE";
		}
	};
	/**
	 * Amount set aside by a participant to reserve liquidity from its own
	 * account, exclusively for executing critical payments called urgent
	 * payments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LiquidityLimitTypeCode
	 * LiquidityLimitTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CPAR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CriticalPaymentReservation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount set aside by a participant to reserve liquidity from its own account, exclusively for executing critical payments called urgent payments."
	 * </li>
	 * </ul>
	 */
	public static final LiquidityLimitTypeCode CriticalPaymentReservation = new LiquidityLimitTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CriticalPaymentReservation";
			definition = "Amount set aside by a participant to reserve liquidity from its own account, exclusively for executing critical payments called urgent payments.";
			owner_lazy = () -> com.tools20022.repository.codeset.LiquidityLimitTypeCode.mmObject();
			codeName = "CPAR";
		}
	};
	/**
	 * Amount set aside by a participant to reserve liquidity from its own
	 * account, exclusively for the settlement of the multilateral cash balance
	 * stemming from the Net Security Settlement System.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LiquidityLimitTypeCode
	 * LiquidityLimitTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NSSR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetSSSReservation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount set aside by a participant to reserve liquidity from its own account, exclusively for the settlement of the multilateral cash balance stemming from the Net Security Settlement System."
	 * </li>
	 * </ul>
	 */
	public static final LiquidityLimitTypeCode NetSSSReservation = new LiquidityLimitTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetSSSReservation";
			definition = "Amount set aside by a participant to reserve liquidity from its own account, exclusively for the settlement of the multilateral cash balance stemming from the Net Security Settlement System.";
			owner_lazy = () -> com.tools20022.repository.codeset.LiquidityLimitTypeCode.mmObject();
			codeName = "NSSR";
		}
	};
	final static private LinkedHashMap<String, LiquidityLimitTypeCode> codesByName = new LinkedHashMap<>();

	protected LiquidityLimitTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("GLBL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "LiquidityLimitTypeCode";
				definition = "Specifies the precise type of liquidity management limit.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.LiquidityLimitTypeCode.Global, com.tools20022.repository.codeset.LiquidityLimitTypeCode.CashReservation,
						com.tools20022.repository.codeset.LiquidityLimitTypeCode.CriticalPaymentReservation, com.tools20022.repository.codeset.LiquidityLimitTypeCode.NetSSSReservation);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Global.getCodeName().get(), Global);
		codesByName.put(CashReservation.getCodeName().get(), CashReservation);
		codesByName.put(CriticalPaymentReservation.getCodeName().get(), CriticalPaymentReservation);
		codesByName.put(NetSSSReservation.getCodeName().get(), NetSSSReservation);
	}

	public static LiquidityLimitTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static LiquidityLimitTypeCode[] values() {
		LiquidityLimitTypeCode[] values = new LiquidityLimitTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, LiquidityLimitTypeCode> {
		@Override
		public LiquidityLimitTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(LiquidityLimitTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}