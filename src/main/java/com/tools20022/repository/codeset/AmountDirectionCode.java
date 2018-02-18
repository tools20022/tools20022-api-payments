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
import com.tools20022.repository.codeset.AmountDirectionCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies if an operation is an increase or a decrease or the result of a
 * reversal operation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.AmountDirectionCode#Debit
 * AmountDirectionCode.Debit}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AmountDirectionCode#Credit
 * AmountDirectionCode.Credit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AmountDirectionCode#ReversalDebit
 * AmountDirectionCode.ReversalDebit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AmountDirectionCode#ReversalCredit
 * AmountDirectionCode.ReversalCredit}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.CreditDebitCode
 * CreditDebitCode}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CreditDebit3Code
 * CreditDebit3Code}</li>
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
 * <li>"DBIT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AmountDirectionCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies if an operation is an increase or a decrease or the result of a reversal operation."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AmountDirectionCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Operation is a decrease.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AmountDirectionCode
	 * AmountDirectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DBIT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Debit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Operation is a decrease."</li>
	 * </ul>
	 */
	public static final AmountDirectionCode Debit = new AmountDirectionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Debit";
			definition = "Operation is a decrease.";
			owner_lazy = () -> com.tools20022.repository.codeset.AmountDirectionCode.mmObject();
			codeName = "DBIT";
		}
	};
	/**
	 * Operation is an increase.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AmountDirectionCode
	 * AmountDirectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRDT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Credit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Operation is an increase."</li>
	 * </ul>
	 */
	public static final AmountDirectionCode Credit = new AmountDirectionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Credit";
			definition = "Operation is an increase.";
			owner_lazy = () -> com.tools20022.repository.codeset.AmountDirectionCode.mmObject();
			codeName = "CRDT";
		}
	};
	/**
	 * Credit entry used to reverse a previously booked debit entry.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AmountDirectionCode
	 * AmountDirectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RVDB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversalDebit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Credit entry used to reverse a previously booked debit entry."</li>
	 * </ul>
	 */
	public static final AmountDirectionCode ReversalDebit = new AmountDirectionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReversalDebit";
			definition = "Credit entry used to reverse a previously booked debit entry.";
			owner_lazy = () -> com.tools20022.repository.codeset.AmountDirectionCode.mmObject();
			codeName = "RVDB";
		}
	};
	/**
	 * Debit entry used to reverse a previously booked credit entry.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AmountDirectionCode
	 * AmountDirectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RVCD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversalCredit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Debit entry used to reverse a previously booked credit entry."</li>
	 * </ul>
	 */
	public static final AmountDirectionCode ReversalCredit = new AmountDirectionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReversalCredit";
			definition = "Debit entry used to reverse a previously booked credit entry.";
			owner_lazy = () -> com.tools20022.repository.codeset.AmountDirectionCode.mmObject();
			codeName = "RVCD";
		}
	};
	final static private LinkedHashMap<String, AmountDirectionCode> codesByName = new LinkedHashMap<>();

	protected AmountDirectionCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("DBIT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AmountDirectionCode";
				definition = "Specifies if an operation is an increase or a decrease or the result of a reversal operation.";
				derivation_lazy = () -> Arrays.asList(CreditDebitCode.mmObject(), CreditDebit3Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AmountDirectionCode.Debit, com.tools20022.repository.codeset.AmountDirectionCode.Credit, com.tools20022.repository.codeset.AmountDirectionCode.ReversalDebit,
						com.tools20022.repository.codeset.AmountDirectionCode.ReversalCredit);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Debit.getCodeName().get(), Debit);
		codesByName.put(Credit.getCodeName().get(), Credit);
		codesByName.put(ReversalDebit.getCodeName().get(), ReversalDebit);
		codesByName.put(ReversalCredit.getCodeName().get(), ReversalCredit);
	}

	public static AmountDirectionCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AmountDirectionCode[] values() {
		AmountDirectionCode[] values = new AmountDirectionCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AmountDirectionCode> {
		@Override
		public AmountDirectionCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AmountDirectionCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}