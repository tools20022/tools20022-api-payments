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
 * Specifies the status of a cancellation request.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationProcessingStatusCode#CancellationCompleted
 * CancellationProcessingStatusCode.CancellationCompleted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationProcessingStatusCode#PendingCancellation
 * CancellationProcessingStatusCode.PendingCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationProcessingStatusCode#Denied
 * CancellationProcessingStatusCode.Denied}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationProcessingStatusCode#ReceivedAtStockExchange
 * CancellationProcessingStatusCode.ReceivedAtStockExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationProcessingStatusCode#ReceivedAtIntermediary
 * CancellationProcessingStatusCode.ReceivedAtIntermediary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationProcessingStatusCode#Accepted
 * CancellationProcessingStatusCode.Accepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationProcessingStatusCode#PartiallyFilled
 * CancellationProcessingStatusCode.PartiallyFilled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationProcessingStatusCode#Rejected
 * CancellationProcessingStatusCode.Rejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationProcessingStatusCode#InRepair
 * CancellationProcessingStatusCode.InRepair}</li>
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
 * <li>"CAND"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CancellationProcessingStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the status of a cancellation request."</li>
 * </ul>
 */
public class CancellationProcessingStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Cancellation has been completed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationProcessingStatusCode
	 * CancellationProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CAND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationCompleted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cancellation has been completed."</li>
	 * </ul>
	 */
	public static final MMCode CancellationCompleted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationCompleted";
			definition = "Cancellation has been completed.";
			owner_lazy = () -> CancellationProcessingStatusCode.mmObject();
			codeName = "CAND";
		}
	};
	/**
	 * Cancellation is pending. It is not known at this time whether
	 * cancellation can be affected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationProcessingStatusCode
	 * CancellationProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CANP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingCancellation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cancellation is pending. It is not known at this time whether cancellation can be affected."
	 * </li>
	 * </ul>
	 */
	public static final MMCode PendingCancellation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingCancellation";
			definition = "Cancellation is pending. It is not known at this time whether cancellation can be affected.";
			owner_lazy = () -> CancellationProcessingStatusCode.mmObject();
			codeName = "CANP";
		}
	};
	/**
	 * Cancellation will not be executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationProcessingStatusCode
	 * CancellationProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DEND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Denied"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cancellation will not be executed."</li>
	 * </ul>
	 */
	public static final MMCode Denied = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Denied";
			definition = "Cancellation will not be executed.";
			owner_lazy = () -> CancellationProcessingStatusCode.mmObject();
			codeName = "DEND";
		}
	};
	/**
	 * Cancellation has been received at the stock exchange.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationProcessingStatusCode
	 * CancellationProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXCH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivedAtStockExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cancellation has been received at the stock exchange."</li>
	 * </ul>
	 */
	public static final MMCode ReceivedAtStockExchange = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivedAtStockExchange";
			definition = "Cancellation has been received at the stock exchange.";
			owner_lazy = () -> CancellationProcessingStatusCode.mmObject();
			codeName = "EXCH";
		}
	};
	/**
	 * Cancellation has been received at the intermediary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationProcessingStatusCode
	 * CancellationProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INTE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivedAtIntermediary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cancellation has been received at the intermediary."</li>
	 * </ul>
	 */
	public static final MMCode ReceivedAtIntermediary = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivedAtIntermediary";
			definition = "Cancellation has been received at the intermediary.";
			owner_lazy = () -> CancellationProcessingStatusCode.mmObject();
			codeName = "INTE";
		}
	};
	/**
	 * Cancellation request has been acknowledged for further processing by the
	 * account servicer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationProcessingStatusCode
	 * CancellationProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PACK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Accepted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cancellation request has been acknowledged for further processing by the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Accepted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Accepted";
			definition = "Cancellation request has been acknowledged for further processing by the account servicer.";
			owner_lazy = () -> CancellationProcessingStatusCode.mmObject();
			codeName = "PACK";
		}
	};
	/**
	 * Order is partially filled, cancellation processing accepted for the
	 * remainder.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationProcessingStatusCode
	 * CancellationProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PARF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartiallyFilled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Order is partially filled, cancellation processing accepted for the remainder."
	 * </li>
	 * </ul>
	 */
	public static final MMCode PartiallyFilled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartiallyFilled";
			definition = "Order is partially filled, cancellation processing accepted for the remainder.";
			owner_lazy = () -> CancellationProcessingStatusCode.mmObject();
			codeName = "PARF";
		}
	};
	/**
	 * Cancellation has been rejected for further processing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationProcessingStatusCode
	 * CancellationProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REJT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rejected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cancellation has been rejected for further processing."</li>
	 * </ul>
	 */
	public static final MMCode Rejected = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			definition = "Cancellation has been rejected for further processing.";
			owner_lazy = () -> CancellationProcessingStatusCode.mmObject();
			codeName = "REJT";
		}
	};
	/**
	 * Cancellation request is in repair.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationProcessingStatusCode
	 * CancellationProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REPR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InRepair"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cancellation request is in repair."</li>
	 * </ul>
	 */
	public static final MMCode InRepair = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InRepair";
			definition = "Cancellation request is in repair.";
			owner_lazy = () -> CancellationProcessingStatusCode.mmObject();
			codeName = "REPR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CAND");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CancellationProcessingStatusCode";
				definition = "Specifies the status of a cancellation request.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CancellationProcessingStatusCode.CancellationCompleted, com.tools20022.repository.codeset.CancellationProcessingStatusCode.PendingCancellation,
						com.tools20022.repository.codeset.CancellationProcessingStatusCode.Denied, com.tools20022.repository.codeset.CancellationProcessingStatusCode.ReceivedAtStockExchange,
						com.tools20022.repository.codeset.CancellationProcessingStatusCode.ReceivedAtIntermediary, com.tools20022.repository.codeset.CancellationProcessingStatusCode.Accepted,
						com.tools20022.repository.codeset.CancellationProcessingStatusCode.PartiallyFilled, com.tools20022.repository.codeset.CancellationProcessingStatusCode.Rejected,
						com.tools20022.repository.codeset.CancellationProcessingStatusCode.InRepair);
			}
		});
		return mmObject_lazy.get();
	}
}