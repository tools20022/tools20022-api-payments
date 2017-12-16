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
import com.tools20022.repository.codeset.ReservationTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the precise type of reservation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReservationTypeCode#CashReservation
 * ReservationTypeCode.mmCashReservation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReservationTypeCode#UrgentPaymentReservation
 * ReservationTypeCode.mmUrgentPaymentReservation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReservationTypeCode#NetSSSReservation
 * ReservationTypeCode.mmNetSSSReservation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReservationTypeCode#HighlyUrgentPaymentReservation
 * ReservationTypeCode.mmHighlyUrgentPaymentReservation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReservationTypeCode#ThresholdForInvestment
 * ReservationTypeCode.mmThresholdForInvestment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReservationTypeCode#Blocked
 * ReservationTypeCode.mmBlocked}</li>
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
 * <li>"CARE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ReservationTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the precise type of reservation."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ReservationTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Amount set aside by a participant to reserve liquidity from its own
	 * account, exclusively for executing cash withdrawals.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReservationTypeCode
	 * ReservationTypeCode}</li>
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
	public static final ReservationTypeCode CashReservation = new ReservationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashReservation";
			definition = "Amount set aside by a participant to reserve liquidity from its own account, exclusively for executing cash withdrawals.";
			owner_lazy = () -> com.tools20022.repository.codeset.ReservationTypeCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.ReservationTypeCode
	 * ReservationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UPAR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UrgentPaymentReservation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount set aside by a participant to reserve liquidity from its own account, exclusively for executing critical payments called urgent payments."
	 * </li>
	 * </ul>
	 */
	public static final ReservationTypeCode UrgentPaymentReservation = new ReservationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UrgentPaymentReservation";
			definition = "Amount set aside by a participant to reserve liquidity from its own account, exclusively for executing critical payments called urgent payments.";
			owner_lazy = () -> com.tools20022.repository.codeset.ReservationTypeCode.mmObject();
			codeName = "UPAR";
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
	 * {@linkplain com.tools20022.repository.codeset.ReservationTypeCode
	 * ReservationTypeCode}</li>
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
	public static final ReservationTypeCode NetSSSReservation = new ReservationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetSSSReservation";
			definition = "Amount set aside by a participant to reserve liquidity from its own account, exclusively for the settlement of the multilateral cash balance stemming from the Net Security Settlement System.";
			owner_lazy = () -> com.tools20022.repository.codeset.ReservationTypeCode.mmObject();
			codeName = "NSSR";
		}
	};
	/**
	 * Amount set aside by a participant to reserve liquidity from its own
	 * account, exclusively for executing highly urgent payments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReservationTypeCode
	 * ReservationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HPAR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HighlyUrgentPaymentReservation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount set aside by a participant to reserve liquidity from its own account, exclusively for executing highly urgent payments."
	 * </li>
	 * </ul>
	 */
	public static final ReservationTypeCode HighlyUrgentPaymentReservation = new ReservationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HighlyUrgentPaymentReservation";
			definition = "Amount set aside by a participant to reserve liquidity from its own account, exclusively for executing highly urgent payments.";
			owner_lazy = () -> com.tools20022.repository.codeset.ReservationTypeCode.mmObject();
			codeName = "HPAR";
		}
	};
	/**
	 * Amount above which funds will be destined for investment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReservationTypeCode
	 * ReservationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "THRE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ThresholdForInvestment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount above which funds will be destined for investment."
	 * </li>
	 * </ul>
	 */
	public static final ReservationTypeCode ThresholdForInvestment = new ReservationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThresholdForInvestment";
			definition = "Amount above which funds will be destined for investment.";
			owner_lazy = () -> com.tools20022.repository.codeset.ReservationTypeCode.mmObject();
			codeName = "THRE";
		}
	};
	/**
	 * Amount blocked or frozen due to external circumstances such as a court
	 * order, death of beneficiary or account owner, or bankruptcy.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReservationTypeCode
	 * ReservationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BLKD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Blocked"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount blocked or frozen due to external circumstances such as a court order, death of beneficiary or account owner, or bankruptcy."
	 * </li>
	 * </ul>
	 */
	public static final ReservationTypeCode Blocked = new ReservationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Blocked";
			definition = "Amount blocked or frozen due to external circumstances such as a court order, death of beneficiary or account owner, or bankruptcy.";
			owner_lazy = () -> com.tools20022.repository.codeset.ReservationTypeCode.mmObject();
			codeName = "BLKD";
		}
	};
	final static private LinkedHashMap<String, ReservationTypeCode> codesByName = new LinkedHashMap<>();

	protected ReservationTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("CARE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ReservationTypeCode";
				definition = "Specifies the precise type of reservation.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ReservationTypeCode.CashReservation, com.tools20022.repository.codeset.ReservationTypeCode.UrgentPaymentReservation,
						com.tools20022.repository.codeset.ReservationTypeCode.NetSSSReservation, com.tools20022.repository.codeset.ReservationTypeCode.HighlyUrgentPaymentReservation,
						com.tools20022.repository.codeset.ReservationTypeCode.ThresholdForInvestment, com.tools20022.repository.codeset.ReservationTypeCode.Blocked);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CashReservation.getCodeName().get(), CashReservation);
		codesByName.put(UrgentPaymentReservation.getCodeName().get(), UrgentPaymentReservation);
		codesByName.put(NetSSSReservation.getCodeName().get(), NetSSSReservation);
		codesByName.put(HighlyUrgentPaymentReservation.getCodeName().get(), HighlyUrgentPaymentReservation);
		codesByName.put(ThresholdForInvestment.getCodeName().get(), ThresholdForInvestment);
		codesByName.put(Blocked.getCodeName().get(), Blocked);
	}

	public static ReservationTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ReservationTypeCode[] values() {
		ReservationTypeCode[] values = new ReservationTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ReservationTypeCode> {
		@Override
		public ReservationTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ReservationTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}