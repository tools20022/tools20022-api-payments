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
 * Specifies the type of the current transaction that belongs to a sequence of
 * transactions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.SequenceTypeCode#First
 * SequenceTypeCode.First}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SequenceTypeCode#Recurring
 * SequenceTypeCode.Recurring}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SequenceTypeCode#Final
 * SequenceTypeCode.Final}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SequenceTypeCode#OneOff
 * SequenceTypeCode.OneOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SequenceTypeCode#Represented
 * SequenceTypeCode.Represented}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.SequenceType3Code
 * SequenceType3Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SequenceType2Code
 * SequenceType2Code}</li>
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
 * <li>"FRST"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SequenceTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of the current transaction that belongs to a sequence of transactions."
 * </li>
 * </ul>
 */
public class SequenceTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * First collection of a series of direct debit instructions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SequenceTypeCode
	 * SequenceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FRST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "First"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "First collection of a series of direct debit instructions."</li>
	 * </ul>
	 */
	public static final MMCode First = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "First";
			definition = "First collection of a series of direct debit instructions.";
			owner_lazy = () -> SequenceTypeCode.mmObject();
			codeName = "FRST";
		}
	};
	/**
	 * Direct debit instruction where the debtor's authorisation is used for
	 * regular direct debit transactions initiated by the creditor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SequenceTypeCode
	 * SequenceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RCUR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Recurring"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Direct debit instruction where the debtor's authorisation is used for regular direct debit transactions initiated by the creditor."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Recurring = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Recurring";
			definition = "Direct debit instruction where the debtor's authorisation is used for regular direct debit transactions initiated by the creditor.";
			owner_lazy = () -> SequenceTypeCode.mmObject();
			codeName = "RCUR";
		}
	};
	/**
	 * Final collection of a series of direct debit instructions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SequenceTypeCode
	 * SequenceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FNAL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Final"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Final collection of a series of direct debit instructions."</li>
	 * </ul>
	 */
	public static final MMCode Final = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Final";
			definition = "Final collection of a series of direct debit instructions.";
			owner_lazy = () -> SequenceTypeCode.mmObject();
			codeName = "FNAL";
		}
	};
	/**
	 * Direct debit instruction where the debtor's authorisation is used to
	 * initiate one single direct debit transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SequenceTypeCode
	 * SequenceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OOFF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OneOff"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Direct debit instruction where the debtor's authorisation is used to initiate one single direct debit transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMCode OneOff = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OneOff";
			definition = "Direct debit instruction where the debtor's authorisation is used to initiate one single direct debit transaction.";
			owner_lazy = () -> SequenceTypeCode.mmObject();
			codeName = "OOFF";
		}
	};
	/**
	 * Collection used to re-present previously reversed or returned direct
	 * debit transactions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SequenceTypeCode
	 * SequenceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RPRE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Represented"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collection used to re-present previously reversed or returned direct debit transactions."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Represented = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Represented";
			definition = "Collection used to re-present previously reversed or returned direct debit transactions.";
			owner_lazy = () -> SequenceTypeCode.mmObject();
			codeName = "RPRE";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("FRST");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SequenceTypeCode";
				definition = "Specifies the type of the current transaction that belongs to a sequence of transactions.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SequenceTypeCode.First, com.tools20022.repository.codeset.SequenceTypeCode.Recurring, com.tools20022.repository.codeset.SequenceTypeCode.Final,
						com.tools20022.repository.codeset.SequenceTypeCode.OneOff, com.tools20022.repository.codeset.SequenceTypeCode.Represented);
				derivation_lazy = () -> Arrays.asList(SequenceType3Code.mmObject(), SequenceType2Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}