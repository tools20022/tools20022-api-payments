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
import com.tools20022.repository.msg.*;
import java.util.Arrays;

/**
 * UltimateCreditor may only be present if different from Creditor.
 */
public class ConstraintUltimateCreditorGuideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction9
	 * CreditTransferTransaction9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * </ul>
	 */
	public static final MMConstraint forCreditTransferTransaction9 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			owner_lazy = () -> CreditTransferTransaction9.mmObject();
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkCreditTransferTransaction9((CreditTransferTransaction9) obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23
	 * CreditTransferTransaction23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * </ul>
	 */
	public static final MMConstraint forCreditTransferTransaction23 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			owner_lazy = () -> CreditTransferTransaction23.mmObject();
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkCreditTransferTransaction23((CreditTransferTransaction23) obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25
	 * CreditTransferTransaction25}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * </ul>
	 */
	public static final MMConstraint forCreditTransferTransaction25 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			owner_lazy = () -> CreditTransferTransaction25.mmObject();
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkCreditTransferTransaction25((CreditTransferTransaction25) obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction24
	 * CreditTransferTransaction24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * </ul>
	 */
	public static final MMConstraint forCreditTransferTransaction24 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			owner_lazy = () -> CreditTransferTransaction24.mmObject();
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkCreditTransferTransaction24((CreditTransferTransaction24) obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26
	 * CreditTransferTransaction26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * </ul>
	 */
	public static final MMConstraint forCreditTransferTransaction26 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			owner_lazy = () -> CreditTransferTransaction26.mmObject();
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkCreditTransferTransaction26((CreditTransferTransaction26) obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction22
	 * CreditTransferTransaction22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * </ul>
	 */
	public static final MMConstraint forCreditTransferTransaction22 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			owner_lazy = () -> CreditTransferTransaction22.mmObject();
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkCreditTransferTransaction22((CreditTransferTransaction22) obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction21
	 * PaymentInstruction21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * </ul>
	 */
	public static final MMConstraint forPaymentInstruction21 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			owner_lazy = () -> PaymentInstruction21.mmObject();
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkPaymentInstruction21((PaymentInstruction21) obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21
	 * DirectDebitTransactionInformation21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * </ul>
	 */
	public static final MMConstraint forDirectDebitTransactionInformation21 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			owner_lazy = () -> DirectDebitTransactionInformation21.mmObject();
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkDirectDebitTransactionInformation21((DirectDebitTransactionInformation21) obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Mandate10 Mandate10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * </ul>
	 */
	public static final MMConstraint forMandate10 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			owner_lazy = () -> Mandate10.mmObject();
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkMandate10((Mandate10) obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Mandate9 Mandate9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline#forMandate11
	 * ConstraintUltimateCreditorGuideline.forMandate11}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint forMandate9 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline.forMandate11);
			owner_lazy = () -> Mandate9.mmObject();
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkMandate9((Mandate9) obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Mandate11 Mandate11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline#forMandate9
	 * ConstraintUltimateCreditorGuideline.forMandate9}</li>
	 * </ul>
	 */
	public static final MMConstraint forMandate11 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline.forMandate9;
			owner_lazy = () -> Mandate11.mmObject();
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkMandate11((Mandate11) obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation22
	 * DirectDebitTransactionInformation22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * </ul>
	 */
	public static final MMConstraint forDirectDebitTransactionInformation22 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			owner_lazy = () -> DirectDebitTransactionInformation22.mmObject();
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkDirectDebitTransactionInformation22((DirectDebitTransactionInformation22) obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Mandate8 Mandate8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UltimateCreditor may only be present if different from Creditor."</li>
	 * </ul>
	 */
	public static final MMConstraint forMandate8 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditorGuideline";
			definition = "UltimateCreditor may only be present if different from Creditor.";
			owner_lazy = () -> Mandate8.mmObject();
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkMandate8((Mandate8) obj);
		}
	};

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkCreditTransferTransaction9(CreditTransferTransaction9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkCreditTransferTransaction23(CreditTransferTransaction23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkCreditTransferTransaction25(CreditTransferTransaction25 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkCreditTransferTransaction24(CreditTransferTransaction24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkCreditTransferTransaction26(CreditTransferTransaction26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkCreditTransferTransaction22(CreditTransferTransaction22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkPaymentInstruction21(PaymentInstruction21 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkDirectDebitTransactionInformation21(DirectDebitTransactionInformation21 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkMandate10(Mandate10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkMandate9(Mandate9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkMandate11(Mandate11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkDirectDebitTransactionInformation22(DirectDebitTransactionInformation22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UltimateCreditor may only be present if different from Creditor.
	 */
	public static void checkMandate8(Mandate8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}