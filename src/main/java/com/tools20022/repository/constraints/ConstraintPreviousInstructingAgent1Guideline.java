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

package com.tools20022.repository.constraints;

import com.tools20022.core.repo.NotImplementedConstraintException;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.msg.CreditTransferTransaction30;
import com.tools20022.repository.msg.CreditTransferTransaction31;
import com.tools20022.repository.msg.CreditTransferTransaction32;
import com.tools20022.repository.msg.PaymentComplementaryInformation7;

/**
 * It is recommended that, when present, PreviousInstructingAgent1 is the
 * closest to the DebtorAgent in the payment chain.
 */
public class ConstraintPreviousInstructingAgent1Guideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction30
	 * CreditTransferTransaction30}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousInstructingAgent1Guideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is recommended that, when present, PreviousInstructingAgent1 is the closest to the DebtorAgent in the payment chain."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction30> forCreditTransferTransaction30 = new MMConstraint<CreditTransferTransaction30>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousInstructingAgent1Guideline";
			definition = "It is recommended that, when present, PreviousInstructingAgent1 is the closest to the DebtorAgent in the payment chain.";
			owner_lazy = () -> CreditTransferTransaction30.mmObject();
		}

		@Override
		public void executeValidator(CreditTransferTransaction30 obj) throws Exception {
			checkCreditTransferTransaction30(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction32
	 * CreditTransferTransaction32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousInstructingAgent1Guideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is recommended that, when present, PreviousInstructingAgent1 is the closest to the DebtorAgent in the payment chain."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction32> forCreditTransferTransaction32 = new MMConstraint<CreditTransferTransaction32>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousInstructingAgent1Guideline";
			definition = "It is recommended that, when present, PreviousInstructingAgent1 is the closest to the DebtorAgent in the payment chain.";
			owner_lazy = () -> CreditTransferTransaction32.mmObject();
		}

		@Override
		public void executeValidator(CreditTransferTransaction32 obj) throws Exception {
			checkCreditTransferTransaction32(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation7
	 * PaymentComplementaryInformation7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousInstructingAgent1Guideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is recommended that, when present, PreviousInstructingAgent1 is the closest to the DebtorAgent in the payment chain."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentComplementaryInformation7> forPaymentComplementaryInformation7 = new MMConstraint<PaymentComplementaryInformation7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousInstructingAgent1Guideline";
			definition = "It is recommended that, when present, PreviousInstructingAgent1 is the closest to the DebtorAgent in the payment chain.";
			owner_lazy = () -> PaymentComplementaryInformation7.mmObject();
		}

		@Override
		public void executeValidator(PaymentComplementaryInformation7 obj) throws Exception {
			checkPaymentComplementaryInformation7(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction31
	 * CreditTransferTransaction31}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousInstructingAgent1Guideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is recommended that, when present, PreviousInstructingAgent1 is the closest to the DebtorAgent in the payment chain."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction31> forCreditTransferTransaction31 = new MMConstraint<CreditTransferTransaction31>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousInstructingAgent1Guideline";
			definition = "It is recommended that, when present, PreviousInstructingAgent1 is the closest to the DebtorAgent in the payment chain.";
			owner_lazy = () -> CreditTransferTransaction31.mmObject();
		}

		@Override
		public void executeValidator(CreditTransferTransaction31 obj) throws Exception {
			checkCreditTransferTransaction31(obj);
		}
	};

	/**
	 * It is recommended that, when present, PreviousInstructingAgent1 is the
	 * closest to the DebtorAgent in the payment chain.
	 */
	public static void checkCreditTransferTransaction30(CreditTransferTransaction30 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended that, when present, PreviousInstructingAgent1 is the
	 * closest to the DebtorAgent in the payment chain.
	 */
	public static void checkCreditTransferTransaction32(CreditTransferTransaction32 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended that, when present, PreviousInstructingAgent1 is the
	 * closest to the DebtorAgent in the payment chain.
	 */
	public static void checkPaymentComplementaryInformation7(PaymentComplementaryInformation7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended that, when present, PreviousInstructingAgent1 is the
	 * closest to the DebtorAgent in the payment chain.
	 */
	public static void checkCreditTransferTransaction31(CreditTransferTransaction31 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}