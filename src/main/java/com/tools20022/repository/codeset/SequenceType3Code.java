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
import com.tools20022.repository.codeset.SequenceType3Code.InternalXmlAdapter;
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
 * <li>{@linkplain com.tools20022.repository.codeset.SequenceType3Code#First
 * SequenceType3Code.mmFirst}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SequenceType3Code#Recurring
 * SequenceType3Code.mmRecurring}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SequenceType3Code#Final
 * SequenceType3Code.mmFinal}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SequenceType3Code#OneOff
 * SequenceType3Code.mmOneOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SequenceType3Code#Represented
 * SequenceType3Code.mmRepresented}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.SequenceTypeCode
 * SequenceTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
 * "SequenceType3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of the current transaction that belongs to a sequence of transactions."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SequenceType3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SequenceType3Code
	 * SequenceType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "First"</li>
	 * </ul>
	 */
	public static final SequenceType3Code First = new SequenceType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "First";
			owner_lazy = () -> com.tools20022.repository.codeset.SequenceType3Code.mmObject();
			codeName = SequenceTypeCode.First.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SequenceType3Code
	 * SequenceType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Recurring"</li>
	 * </ul>
	 */
	public static final SequenceType3Code Recurring = new SequenceType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Recurring";
			owner_lazy = () -> com.tools20022.repository.codeset.SequenceType3Code.mmObject();
			codeName = SequenceTypeCode.Recurring.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SequenceType3Code
	 * SequenceType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Final"</li>
	 * </ul>
	 */
	public static final SequenceType3Code Final = new SequenceType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Final";
			owner_lazy = () -> com.tools20022.repository.codeset.SequenceType3Code.mmObject();
			codeName = SequenceTypeCode.Final.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SequenceType3Code
	 * SequenceType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OneOff"</li>
	 * </ul>
	 */
	public static final SequenceType3Code OneOff = new SequenceType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OneOff";
			owner_lazy = () -> com.tools20022.repository.codeset.SequenceType3Code.mmObject();
			codeName = SequenceTypeCode.OneOff.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SequenceType3Code
	 * SequenceType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Represented"</li>
	 * </ul>
	 */
	public static final SequenceType3Code Represented = new SequenceType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Represented";
			owner_lazy = () -> com.tools20022.repository.codeset.SequenceType3Code.mmObject();
			codeName = SequenceTypeCode.Represented.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, SequenceType3Code> codesByName = new LinkedHashMap<>();

	protected SequenceType3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("FRST");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SequenceType3Code";
				definition = "Specifies the type of the current transaction that belongs to a sequence of transactions.";
				trace_lazy = () -> SequenceTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SequenceType3Code.First, com.tools20022.repository.codeset.SequenceType3Code.Recurring, com.tools20022.repository.codeset.SequenceType3Code.Final,
						com.tools20022.repository.codeset.SequenceType3Code.OneOff, com.tools20022.repository.codeset.SequenceType3Code.Represented);
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

	public static SequenceType3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SequenceType3Code[] values() {
		SequenceType3Code[] values = new SequenceType3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SequenceType3Code> {
		@Override
		public SequenceType3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SequenceType3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}