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
 * Specifies the reason of a settlement failure.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailedSettlementReasonCode#CreditAccountNotEligible
 * FailedSettlementReasonCode.CreditAccountNotEligible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailedSettlementReasonCode#CreditAccountDisabled
 * FailedSettlementReasonCode.CreditAccountDisabled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailedSettlementReasonCode#DebitAccountNotEligible
 * FailedSettlementReasonCode.DebitAccountNotEligible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailedSettlementReasonCode#DebitAccountDisabled
 * FailedSettlementReasonCode.DebitAccountDisabled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailedSettlementReasonCode#InsufficientSecurities
 * FailedSettlementReasonCode.InsufficientSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailedSettlementReasonCode#IncompleteDistribution
 * FailedSettlementReasonCode.IncompleteDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailedSettlementReasonCode#InsufficientCash
 * FailedSettlementReasonCode.InsufficientCash}</li>
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
 * <li>"CANE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FailedSettlementReasonCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the reason of a settlement failure."</li>
 * </ul>
 */
public class FailedSettlementReasonCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Credit account is not eligible.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailedSettlementReasonCode
	 * FailedSettlementReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CANE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditAccountNotEligible"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Credit account is not eligible."</li>
	 * </ul>
	 */
	public static final MMCode CreditAccountNotEligible = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditAccountNotEligible";
			definition = "Credit account is not eligible.";
			owner_lazy = () -> FailedSettlementReasonCode.mmObject();
			codeName = "CANE";
		}
	};
	/**
	 * Credit account is disabled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailedSettlementReasonCode
	 * FailedSettlementReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CADI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditAccountDisabled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Credit account is disabled."</li>
	 * </ul>
	 */
	public static final MMCode CreditAccountDisabled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditAccountDisabled";
			definition = "Credit account is disabled.";
			owner_lazy = () -> FailedSettlementReasonCode.mmObject();
			codeName = "CADI";
		}
	};
	/**
	 * Debit account is not eligible.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailedSettlementReasonCode
	 * FailedSettlementReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DANE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebitAccountNotEligible"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Debit account is not eligible."</li>
	 * </ul>
	 */
	public static final MMCode DebitAccountNotEligible = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DebitAccountNotEligible";
			definition = "Debit account is not eligible.";
			owner_lazy = () -> FailedSettlementReasonCode.mmObject();
			codeName = "DANE";
		}
	};
	/**
	 * Debit account is disabled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailedSettlementReasonCode
	 * FailedSettlementReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AADI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebitAccountDisabled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Debit account is disabled."</li>
	 * </ul>
	 */
	public static final MMCode DebitAccountDisabled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DebitAccountDisabled";
			definition = "Debit account is disabled.";
			owner_lazy = () -> FailedSettlementReasonCode.mmObject();
			codeName = "AADI";
		}
	};
	/**
	 * Insufficient securities on the account to settle.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailedSettlementReasonCode
	 * FailedSettlementReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INSE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Insufficient securities on the account to settle."</li>
	 * </ul>
	 */
	public static final MMCode InsufficientSecurities = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InsufficientSecurities";
			definition = "Insufficient securities on the account to settle.";
			owner_lazy = () -> FailedSettlementReasonCode.mmObject();
			codeName = "INSE";
		}
	};
	/**
	 * The distribution is incomplete.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailedSettlementReasonCode
	 * FailedSettlementReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INDI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncompleteDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The distribution is incomplete."</li>
	 * </ul>
	 */
	public static final MMCode IncompleteDistribution = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IncompleteDistribution";
			definition = "The distribution is incomplete.";
			owner_lazy = () -> FailedSettlementReasonCode.mmObject();
			codeName = "INDI";
		}
	};
	/**
	 * Insufficient cash on the account to settle.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailedSettlementReasonCode
	 * FailedSettlementReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INCA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientCash"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Insufficient cash on the account to settle."</li>
	 * </ul>
	 */
	public static final MMCode InsufficientCash = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InsufficientCash";
			definition = "Insufficient cash on the account to settle.";
			owner_lazy = () -> FailedSettlementReasonCode.mmObject();
			codeName = "INCA";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CANE");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "FailedSettlementReasonCode";
				definition = "Specifies the reason of a settlement failure.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FailedSettlementReasonCode.CreditAccountNotEligible, com.tools20022.repository.codeset.FailedSettlementReasonCode.CreditAccountDisabled,
						com.tools20022.repository.codeset.FailedSettlementReasonCode.DebitAccountNotEligible, com.tools20022.repository.codeset.FailedSettlementReasonCode.DebitAccountDisabled,
						com.tools20022.repository.codeset.FailedSettlementReasonCode.InsufficientSecurities, com.tools20022.repository.codeset.FailedSettlementReasonCode.IncompleteDistribution,
						com.tools20022.repository.codeset.FailedSettlementReasonCode.InsufficientCash);
			}
		});
		return mmObject_lazy.get();
	}
}