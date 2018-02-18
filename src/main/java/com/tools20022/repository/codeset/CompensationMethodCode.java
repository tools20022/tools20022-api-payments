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
import com.tools20022.repository.codeset.CompensationMethodCode.InternalXmlAdapter;
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
 * <li>{@linkplain com.tools20022.repository.codeset.CompensationMethodCode#No
 * CompensationMethodCode.No}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CompensationMethodCode#Debited
 * CompensationMethodCode.Debited}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CompensationMethodCode#Invoiced
 * CompensationMethodCode.Invoiced}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CompensationMethodCode#DelayedDebit
 * CompensationMethodCode.DelayedDebit}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.CompensationMethod1Code
 * CompensationMethod1Code}</li>
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
 * <li>"NOCP"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CompensationMethodCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines if and how charges and taxes due are paid to the financial institution."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CompensationMethodCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Account does not pay and charges or taxes due.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CompensationMethodCode
	 * CompensationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOCP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "No"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account does not pay and charges or taxes due."</li>
	 * </ul>
	 */
	public static final CompensationMethodCode No = new CompensationMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "No";
			definition = "Account does not pay and charges or taxes due.";
			owner_lazy = () -> com.tools20022.repository.codeset.CompensationMethodCode.mmObject();
			codeName = "NOCP";
		}
	};
	/**
	 * Account is debited for any charges or taxes due.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CompensationMethodCode
	 * CompensationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DBTD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Debited"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account is debited for  any charges or taxes due."</li>
	 * </ul>
	 */
	public static final CompensationMethodCode Debited = new CompensationMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Debited";
			definition = "Account is debited for  any charges or taxes due.";
			owner_lazy = () -> com.tools20022.repository.codeset.CompensationMethodCode.mmObject();
			codeName = "DBTD";
		}
	};
	/**
	 * Account or summary account is invoiced for any charges or taxes due.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CompensationMethodCode
	 * CompensationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INVD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Invoiced"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account or summary account is invoiced for any charges or taxes due."</li>
	 * </ul>
	 */
	public static final CompensationMethodCode Invoiced = new CompensationMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Invoiced";
			definition = "Account or summary account is invoiced for any charges or taxes due.";
			owner_lazy = () -> com.tools20022.repository.codeset.CompensationMethodCode.mmObject();
			codeName = "INVD";
		}
	};
	/**
	 * Account is automatically debited on a future date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CompensationMethodCode
	 * CompensationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DDBT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DelayedDebit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account is automatically debited on a future date."</li>
	 * </ul>
	 */
	public static final CompensationMethodCode DelayedDebit = new CompensationMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DelayedDebit";
			definition = "Account is automatically debited on a future date.";
			owner_lazy = () -> com.tools20022.repository.codeset.CompensationMethodCode.mmObject();
			codeName = "DDBT";
		}
	};
	final static private LinkedHashMap<String, CompensationMethodCode> codesByName = new LinkedHashMap<>();

	protected CompensationMethodCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("NOCP");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CompensationMethodCode";
				definition = "Defines if and how charges and taxes due are paid to the financial institution.";
				derivation_lazy = () -> Arrays.asList(CompensationMethod1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CompensationMethodCode.No, com.tools20022.repository.codeset.CompensationMethodCode.Debited,
						com.tools20022.repository.codeset.CompensationMethodCode.Invoiced, com.tools20022.repository.codeset.CompensationMethodCode.DelayedDebit);
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

	public static CompensationMethodCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CompensationMethodCode[] values() {
		CompensationMethodCode[] values = new CompensationMethodCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CompensationMethodCode> {
		@Override
		public CompensationMethodCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CompensationMethodCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}