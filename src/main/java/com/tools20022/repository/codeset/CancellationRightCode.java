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
 * Specifies if the investor has the right to cancel an instruction or, if not,
 * the reason the investor cannot cancel.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationRightCode#Entitled
 * CancellationRightCode.Entitled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationRightCode#ExecutionOnly
 * CancellationRightCode.ExecutionOnly}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationRightCode#WaiverAgreement
 * CancellationRightCode.WaiverAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationRightCode#Institutional
 * CancellationRightCode.Institutional}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationRightCode#Other
 * CancellationRightCode.Other}</li>
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
 * <li>"VALI"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CancellationRightCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies if the investor has the right to cancel an instruction or, if not, the reason the investor cannot cancel."
 * </li>
 * </ul>
 */
public class CancellationRightCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Investor is entitled to a "cooling off" period with cancellation rights
	 * under compliance rules.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationRightCode
	 * CancellationRightCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VALI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Entitled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investor is entitled to a \"cooling off\" period with cancellation rights under compliance rules."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Entitled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Entitled";
			definition = "Investor is entitled to a \"cooling off\" period with cancellation rights under compliance rules.";
			owner_lazy = () -> CancellationRightCode.mmObject();
			codeName = "VALI";
		}
	};
	/**
	 * Investor is not entitled to cancellation rights under compliance rules,
	 * as the investor is an execution's only client.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationRightCode
	 * CancellationRightCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOXO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExecutionOnly"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investor is not entitled to cancellation rights under compliance rules, as the investor is an execution's only client."
	 * </li>
	 * </ul>
	 */
	public static final MMCode ExecutionOnly = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExecutionOnly";
			definition = "Investor is not entitled to cancellation rights under compliance rules, as the investor is an execution's only client.";
			owner_lazy = () -> CancellationRightCode.mmObject();
			codeName = "NOXO";
		}
	};
	/**
	 * Investor is not entitled to cancellation rights under compliance rules as
	 * the investor has agreed to waive those rights.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationRightCode
	 * CancellationRightCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOWA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WaiverAgreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investor is not entitled to cancellation rights under compliance rules as the investor has agreed to waive those rights."
	 * </li>
	 * </ul>
	 */
	public static final MMCode WaiverAgreement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WaiverAgreement";
			definition = "Investor is not entitled to cancellation rights under compliance rules as the investor has agreed to waive those rights.";
			owner_lazy = () -> CancellationRightCode.mmObject();
			codeName = "NOWA";
		}
	};
	/**
	 * Investor is not entitled to cancellation rights under compliance rules as
	 * the investor is a financial institution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationRightCode
	 * CancellationRightCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Institutional"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investor is not entitled to cancellation rights under compliance rules as the investor is a financial institution."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Institutional = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Institutional";
			definition = "Investor is not entitled to cancellation rights under compliance rules as the investor is a financial institution.";
			owner_lazy = () -> CancellationRightCode.mmObject();
			codeName = "NOIN";
		}
	};
	/**
	 * Another type of cancellation right.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationRightCode
	 * CancellationRightCode}</li>
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
	 * definition} = "Another type of cancellation right."</li>
	 * </ul>
	 */
	public static final MMCode Other = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Other";
			definition = "Another type of cancellation right.";
			owner_lazy = () -> CancellationRightCode.mmObject();
			codeName = "OTHR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("VALI");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CancellationRightCode";
				definition = "Specifies if the investor has the right to cancel an instruction or, if not, the reason the investor cannot cancel.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CancellationRightCode.Entitled, com.tools20022.repository.codeset.CancellationRightCode.ExecutionOnly,
						com.tools20022.repository.codeset.CancellationRightCode.WaiverAgreement, com.tools20022.repository.codeset.CancellationRightCode.Institutional, com.tools20022.repository.codeset.CancellationRightCode.Other);
			}
		});
		return mmObject_lazy.get();
	}
}