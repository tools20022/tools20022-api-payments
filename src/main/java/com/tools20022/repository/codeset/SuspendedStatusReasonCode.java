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
 * Specifies the reason for a suspended status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SuspendedStatusReasonCode#mmPriceSuspension
 * SuspendedStatusReasonCode.mmPriceSuspension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SuspendedStatusReasonCode#mmOverflow
 * SuspendedStatusReasonCode.mmOverflow}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SuspendedStatusReasonCode#mmSuspendedByYourself
 * SuspendedStatusReasonCode.mmSuspendedByYourself}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SuspendedStatusReasonCode#mmSuspendedBySystem
 * SuspendedStatusReasonCode.mmSuspendedBySystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SuspendedStatusReasonCode#mmOther
 * SuspendedStatusReasonCode.mmOther}</li>
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
 * <li>"PRIC"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SuspendedStatusReasonCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the reason for a suspended status."</li>
 * </ul>
 */
public class SuspendedStatusReasonCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * There is a suspension of pricing. The order will stay on the books until
	 * the next pricing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SuspendedStatusReasonCode
	 * SuspendedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceSuspension"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "There is a suspension of pricing. The order will stay on the books until the next pricing."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPriceSuspension = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PriceSuspension";
			definition = "There is a suspension of pricing. The order will stay on the books until the next pricing.";
			owner_lazy = () -> SuspendedStatusReasonCode.mmObject();
			codeName = "PRIC";
		}
	};
	/**
	 * There is a fund overflow.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SuspendedStatusReasonCode
	 * SuspendedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FLOW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Overflow"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "There is a fund overflow."</li>
	 * </ul>
	 */
	public static final MMCode mmOverflow = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Overflow";
			definition = "There is a fund overflow.";
			owner_lazy = () -> SuspendedStatusReasonCode.mmObject();
			codeName = "FLOW";
		}
	};
	/**
	 * Transaction/instruction is suspended following your earlier suspension
	 * instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SuspendedStatusReasonCode
	 * SuspendedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SUBY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SuspendedByYourself"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction/instruction is suspended following your earlier suspension instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmSuspendedByYourself = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SuspendedByYourself";
			definition = "Transaction/instruction is suspended following your earlier suspension instruction.";
			owner_lazy = () -> SuspendedStatusReasonCode.mmObject();
			codeName = "SUBY";
		}
	};
	/**
	 * Transaction/instruction is suspended following a system suspension
	 * instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SuspendedStatusReasonCode
	 * SuspendedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SUBS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SuspendedBySystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction/instruction is suspended following a system suspension instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmSuspendedBySystem = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SuspendedBySystem";
			definition = "Transaction/instruction is suspended following a system suspension instruction.";
			owner_lazy = () -> SuspendedStatusReasonCode.mmObject();
			codeName = "SUBS";
		}
	};
	/**
	 * Another reason for the status suspended.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SuspendedStatusReasonCode
	 * SuspendedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Another reason for the status suspended."</li>
	 * </ul>
	 */
	public static final MMCode mmOther = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Other";
			definition = "Another reason for the status suspended.";
			owner_lazy = () -> SuspendedStatusReasonCode.mmObject();
			codeName = "OTHR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("PRIC");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SuspendedStatusReasonCode";
				definition = "Specifies the reason for a suspended status.";
				code_lazy = () -> Arrays.asList(SuspendedStatusReasonCode.mmPriceSuspension, SuspendedStatusReasonCode.mmOverflow, SuspendedStatusReasonCode.mmSuspendedByYourself, SuspendedStatusReasonCode.mmSuspendedBySystem,
						SuspendedStatusReasonCode.mmOther);
			}
		});
		return mmObject_lazy.get();
	}
}