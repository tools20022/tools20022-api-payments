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
import com.tools20022.repository.codeset.CompensationMethod1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Defines if and how charges and taxes due are paid to the financial
 * institution.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.CompensationMethod1Code#No
 * CompensationMethod1Code.mmNo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CompensationMethod1Code#Debited
 * CompensationMethod1Code.mmDebited}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CompensationMethod1Code#Invoiced
 * CompensationMethod1Code.mmInvoiced}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CompensationMethod1Code#DelayedDebit
 * CompensationMethod1Code.mmDelayedDebit}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CompensationMethodCode
 * CompensationMethodCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"NOCP"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CompensationMethod1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines if and how charges and taxes due are paid to the financial institution."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CompensationMethod1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CompensationMethod1Code
	 * CompensationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "No"</li>
	 * </ul>
	 */
	public static final CompensationMethod1Code No = new CompensationMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "No";
			owner_lazy = () -> com.tools20022.repository.codeset.CompensationMethod1Code.mmObject();
			codeName = CompensationMethodCode.No.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CompensationMethod1Code
	 * CompensationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Debited"</li>
	 * </ul>
	 */
	public static final CompensationMethod1Code Debited = new CompensationMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Debited";
			owner_lazy = () -> com.tools20022.repository.codeset.CompensationMethod1Code.mmObject();
			codeName = CompensationMethodCode.Debited.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CompensationMethod1Code
	 * CompensationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Invoiced"</li>
	 * </ul>
	 */
	public static final CompensationMethod1Code Invoiced = new CompensationMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Invoiced";
			owner_lazy = () -> com.tools20022.repository.codeset.CompensationMethod1Code.mmObject();
			codeName = CompensationMethodCode.Invoiced.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CompensationMethod1Code
	 * CompensationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DelayedDebit"</li>
	 * </ul>
	 */
	public static final CompensationMethod1Code DelayedDebit = new CompensationMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DelayedDebit";
			owner_lazy = () -> com.tools20022.repository.codeset.CompensationMethod1Code.mmObject();
			codeName = CompensationMethodCode.DelayedDebit.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CompensationMethod1Code> codesByName = new LinkedHashMap<>();

	protected CompensationMethod1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("NOCP");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CompensationMethod1Code";
				definition = "Defines if and how charges and taxes due are paid to the financial institution.";
				trace_lazy = () -> CompensationMethodCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CompensationMethod1Code.No, com.tools20022.repository.codeset.CompensationMethod1Code.Debited,
						com.tools20022.repository.codeset.CompensationMethod1Code.Invoiced, com.tools20022.repository.codeset.CompensationMethod1Code.DelayedDebit);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(No.getCodeName().get(), No);
		codesByName.put(Debited.getCodeName().get(), Debited);
		codesByName.put(Invoiced.getCodeName().get(), Invoiced);
		codesByName.put(DelayedDebit.getCodeName().get(), DelayedDebit);
	}

	public static CompensationMethod1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CompensationMethod1Code[] values() {
		CompensationMethod1Code[] values = new CompensationMethod1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CompensationMethod1Code> {
		@Override
		public CompensationMethod1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CompensationMethod1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}