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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the precise type of reservation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReservationTypeCode#CashReservation
 * ReservationTypeCode.CashReservation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReservationTypeCode#UrgentPaymentReservation
 * ReservationTypeCode.UrgentPaymentReservation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReservationTypeCode#NetSSSReservation
 * ReservationTypeCode.NetSSSReservation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReservationTypeCode#HighlyUrgentPaymentReservation
 * ReservationTypeCode.HighlyUrgentPaymentReservation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReservationTypeCode#ThresholdForInvestment
 * ReservationTypeCode.ThresholdForInvestment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReservationTypeCode#Blocked
 * ReservationTypeCode.Blocked}</li>
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
public class ReservationTypeCode {

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
	public static final MMCode CashReservation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashReservation";
			definition = "Amount set aside by a participant to reserve liquidity from its own account, exclusively for executing cash withdrawals.";
			owner_lazy = () -> ReservationTypeCode.mmObject();
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
	public static final MMCode UrgentPaymentReservation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UrgentPaymentReservation";
			definition = "Amount set aside by a participant to reserve liquidity from its own account, exclusively for executing critical payments called urgent payments.";
			owner_lazy = () -> ReservationTypeCode.mmObject();
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
	public static final MMCode NetSSSReservation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetSSSReservation";
			definition = "Amount set aside by a participant to reserve liquidity from its own account, exclusively for the settlement of the multilateral cash balance stemming from the Net Security Settlement System.";
			owner_lazy = () -> ReservationTypeCode.mmObject();
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
	public static final MMCode HighlyUrgentPaymentReservation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HighlyUrgentPaymentReservation";
			definition = "Amount set aside by a participant to reserve liquidity from its own account, exclusively for executing highly urgent payments.";
			owner_lazy = () -> ReservationTypeCode.mmObject();
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
	public static final MMCode ThresholdForInvestment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThresholdForInvestment";
			definition = "Amount above which funds will be destined for investment.";
			owner_lazy = () -> ReservationTypeCode.mmObject();
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
	public static final MMCode Blocked = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Blocked";
			definition = "Amount blocked or frozen due to external circumstances such as a court order, death of beneficiary or account owner, or bankruptcy.";
			owner_lazy = () -> ReservationTypeCode.mmObject();
			codeName = "BLKD";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CARE");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ReservationTypeCode";
				definition = "Specifies the precise type of reservation.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ReservationTypeCode.CashReservation, com.tools20022.repository.codeset.ReservationTypeCode.UrgentPaymentReservation,
						com.tools20022.repository.codeset.ReservationTypeCode.NetSSSReservation, com.tools20022.repository.codeset.ReservationTypeCode.HighlyUrgentPaymentReservation,
						com.tools20022.repository.codeset.ReservationTypeCode.ThresholdForInvestment, com.tools20022.repository.codeset.ReservationTypeCode.Blocked);
			}
		});
		return mmObject_lazy.get();
	}
}