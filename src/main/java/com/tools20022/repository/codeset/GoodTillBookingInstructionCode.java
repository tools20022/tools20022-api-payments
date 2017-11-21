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
 * States whether executions are booked out or accumulated on a partially filled
 * good till order on the day of execution or to accumulate.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GoodTillBookingInstructionCode#mmBookOnExecutionDay
 * GoodTillBookingInstructionCode.mmBookOnExecutionDay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GoodTillBookingInstructionCode#mmAccumulateTillEnd
 * GoodTillBookingInstructionCode.mmAccumulateTillEnd}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GoodTillBookingInstructionCode#mmAccumulateTillTold
 * GoodTillBookingInstructionCode.mmAccumulateTillTold}</li>
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
 * <li>"BOEX"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "GoodTillBookingInstructionCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "States whether executions are booked out or accumulated on a partially filled good till order on the day of execution or to accumulate."
 * </li>
 * </ul>
 */
public class GoodTillBookingInstructionCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Book out all trades on day of execution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GoodTillBookingInstructionCode
	 * GoodTillBookingInstructionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BOEX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BookOnExecutionDay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Book out all trades on day of execution."</li>
	 * </ul>
	 */
	public static final MMCode mmBookOnExecutionDay = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BookOnExecutionDay";
			definition = "Book out all trades on day of execution.";
			owner_lazy = () -> GoodTillBookingInstructionCode.mmObject();
			codeName = "BOEX";
		}
	};
	/**
	 * Accumulate executions until order is filled or expires.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GoodTillBookingInstructionCode
	 * GoodTillBookingInstructionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACTE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccumulateTillEnd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Accumulate executions until order is filled or expires."</li>
	 * </ul>
	 */
	public static final MMCode mmAccumulateTillEnd = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccumulateTillEnd";
			definition = "Accumulate executions until order is filled or expires.";
			owner_lazy = () -> GoodTillBookingInstructionCode.mmObject();
			codeName = "ACTE";
		}
	};
	/**
	 * Accumulate until verbally notified otherwise.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GoodTillBookingInstructionCode
	 * GoodTillBookingInstructionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACTT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccumulateTillTold"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Accumulate until verbally notified otherwise."</li>
	 * </ul>
	 */
	public static final MMCode mmAccumulateTillTold = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccumulateTillTold";
			definition = "Accumulate until verbally notified otherwise.";
			owner_lazy = () -> GoodTillBookingInstructionCode.mmObject();
			codeName = "ACTT";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("BOEX");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "GoodTillBookingInstructionCode";
				definition = "States whether executions are booked out or accumulated on a partially filled good till order on the day of execution or to accumulate.";
				code_lazy = () -> Arrays.asList(GoodTillBookingInstructionCode.mmBookOnExecutionDay, GoodTillBookingInstructionCode.mmAccumulateTillEnd, GoodTillBookingInstructionCode.mmAccumulateTillTold);
			}
		});
		return mmObject_lazy.get();
	}
}