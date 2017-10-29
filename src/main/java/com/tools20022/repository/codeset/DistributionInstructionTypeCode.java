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
 * Specifies the type of distribution instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DistributionInstructionTypeCode#GlobalDebitOrder
 * DistributionInstructionTypeCode.GlobalDebitOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DistributionInstructionTypeCode#IndividualOrder
 * DistributionInstructionTypeCode.IndividualOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DistributionInstructionTypeCode#GlobalReturnOrder
 * DistributionInstructionTypeCode.GlobalReturnOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DistributionInstructionTypeCode#OptionChangeOrder
 * DistributionInstructionTypeCode.OptionChangeOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DistributionInstructionTypeCode#IndividualReturnOrder
 * DistributionInstructionTypeCode.IndividualReturnOrder}</li>
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
 * <li>"GDEB"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DistributionInstructionTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of distribution instruction."</li>
 * </ul>
 */
public class DistributionInstructionTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Instruction to debit the positions held under all clients accounts in the
	 * underlying resouces of the given event and option. This order applies to
	 * all clients who are eligible to participate to the CA event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DistributionInstructionTypeCode
	 * DistributionInstructionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GDEB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GlobalDebitOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction to debit the positions held under all clients accounts in the underlying resouces of the given event and option. This order applies to all clients who are eligible to participate to the CA event."
	 * </li>
	 * </ul>
	 */
	public static final MMCode GlobalDebitOrder = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GlobalDebitOrder";
			definition = "Instruction to debit the positions held under all clients accounts in the underlying resouces of the given event and option. This order applies to all clients who are eligible to participate to the CA event.";
			owner_lazy = () -> DistributionInstructionTypeCode.mmObject();
			codeName = "GDEB";
		}
	};
	/**
	 * An instruction, on a per client basis, to debit the position held in the
	 * underlying resources (securities and/or cash) and/or the credit of the
	 * proceeds (securities and/or cash).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DistributionInstructionTypeCode
	 * DistributionInstructionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IDEB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndividualOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An instruction, on a per client basis, to debit the position held in the underlying resources (securities and/or cash) and/or the credit of the proceeds (securities and/or cash)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode IndividualOrder = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IndividualOrder";
			definition = "An instruction, on a per client basis, to debit the position held in the underlying resources (securities and/or cash) and/or the credit of the proceeds (securities and/or cash).";
			owner_lazy = () -> DistributionInstructionTypeCode.mmObject();
			codeName = "IDEB";
		}
	};
	/**
	 * Instruction to transfer securities from the clients sequestered balances
	 * back to the respective available balances.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DistributionInstructionTypeCode
	 * DistributionInstructionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GRET"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GlobalReturnOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction to transfer securities from the clients sequestered balances back to the respective available balances."
	 * </li>
	 * </ul>
	 */
	public static final MMCode GlobalReturnOrder = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GlobalReturnOrder";
			definition = "Instruction to transfer securities from the clients sequestered balances back to the respective available balances.";
			owner_lazy = () -> DistributionInstructionTypeCode.mmObject();
			codeName = "GRET";
		}
	};
	/**
	 * Instruction to transfer the position from one sequestered balance
	 * (related to a CA option) to another sequestered balalnce (related to
	 * another CA option).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DistributionInstructionTypeCode
	 * DistributionInstructionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CHAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionChangeOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction to transfer the position from one sequestered balance (related to a CA option) to another sequestered balalnce (related to another CA option)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode OptionChangeOrder = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OptionChangeOrder";
			definition = "Instruction to transfer the position from one sequestered balance (related to a CA option) to another sequestered balalnce (related to another CA option).";
			owner_lazy = () -> DistributionInstructionTypeCode.mmObject();
			codeName = "CHAN";
		}
	};
	/**
	 * Instruction to transfer securities from a client sequestered balance back
	 * to its available balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DistributionInstructionTypeCode
	 * DistributionInstructionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IRET"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndividualReturnOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction to transfer securities from a client sequestered balance back to its available balance."
	 * </li>
	 * </ul>
	 */
	public static final MMCode IndividualReturnOrder = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IndividualReturnOrder";
			definition = "Instruction to transfer securities from a client sequestered balance back to its available balance.";
			owner_lazy = () -> DistributionInstructionTypeCode.mmObject();
			codeName = "IRET";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("GDEB");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DistributionInstructionTypeCode";
				definition = "Specifies the type of distribution instruction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DistributionInstructionTypeCode.GlobalDebitOrder, com.tools20022.repository.codeset.DistributionInstructionTypeCode.IndividualOrder,
						com.tools20022.repository.codeset.DistributionInstructionTypeCode.GlobalReturnOrder, com.tools20022.repository.codeset.DistributionInstructionTypeCode.OptionChangeOrder,
						com.tools20022.repository.codeset.DistributionInstructionTypeCode.IndividualReturnOrder);
			}
		});
		return mmObject_lazy.get();
	}
}