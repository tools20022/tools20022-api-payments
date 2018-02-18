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
import com.tools20022.repository.codeset.SequenceTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

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
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SequenceTypeCode extends MMCode {

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
	public static final SequenceTypeCode First = new SequenceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "First";
			definition = "First collection of a series of direct debit instructions.";
			owner_lazy = () -> com.tools20022.repository.codeset.SequenceTypeCode.mmObject();
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
	public static final SequenceTypeCode Recurring = new SequenceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Recurring";
			definition = "Direct debit instruction where the debtor's authorisation is used for regular direct debit transactions initiated by the creditor.";
			owner_lazy = () -> com.tools20022.repository.codeset.SequenceTypeCode.mmObject();
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
	public static final SequenceTypeCode Final = new SequenceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Final";
			definition = "Final collection of a series of direct debit instructions.";
			owner_lazy = () -> com.tools20022.repository.codeset.SequenceTypeCode.mmObject();
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
	public static final SequenceTypeCode OneOff = new SequenceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OneOff";
			definition = "Direct debit instruction where the debtor's authorisation is used to initiate one single direct debit transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.SequenceTypeCode.mmObject();
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
	public static final SequenceTypeCode Represented = new SequenceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Represented";
			definition = "Collection used to re-present previously reversed or returned direct debit transactions.";
			owner_lazy = () -> com.tools20022.repository.codeset.SequenceTypeCode.mmObject();
			codeName = "RPRE";
		}
	};
	final static private LinkedHashMap<String, SequenceTypeCode> codesByName = new LinkedHashMap<>();

	protected SequenceTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("FRST");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SequenceTypeCode";
				definition = "Specifies the type of the current transaction that belongs to a sequence of transactions.";
				derivation_lazy = () -> Arrays.asList(SequenceType3Code.mmObject(), SequenceType2Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SequenceTypeCode.First, com.tools20022.repository.codeset.SequenceTypeCode.Recurring, com.tools20022.repository.codeset.SequenceTypeCode.Final,
						com.tools20022.repository.codeset.SequenceTypeCode.OneOff, com.tools20022.repository.codeset.SequenceTypeCode.Represented);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(First.getCodeName().get(), First);
		codesByName.put(Recurring.getCodeName().get(), Recurring);
		codesByName.put(Final.getCodeName().get(), Final);
		codesByName.put(OneOff.getCodeName().get(), OneOff);
		codesByName.put(Represented.getCodeName().get(), Represented);
	}

	public static SequenceTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SequenceTypeCode[] values() {
		SequenceTypeCode[] values = new SequenceTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SequenceTypeCode> {
		@Override
		public SequenceTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SequenceTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}