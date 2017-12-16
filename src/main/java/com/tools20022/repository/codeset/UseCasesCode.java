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
import com.tools20022.repository.codeset.UseCasesCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the action on the cash account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.UseCasesCode#Opening
 * UseCasesCode.mmOpening}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UseCasesCode#Maintenance
 * UseCasesCode.mmMaintenance}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UseCasesCode#Closing
 * UseCasesCode.mmClosing}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UseCasesCode#View
 * UseCasesCode.mmView}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.UseCases1Code
 * UseCases1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"OPEN"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UseCasesCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the action on the cash account."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class UseCasesCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Code indicating the opening of an account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UseCasesCode UseCasesCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OPEN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Opening"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code indicating the opening of an account."</li>
	 * </ul>
	 */
	public static final UseCasesCode Opening = new UseCasesCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Opening";
			definition = "Code indicating the opening of an account.";
			owner_lazy = () -> com.tools20022.repository.codeset.UseCasesCode.mmObject();
			codeName = "OPEN";
		}
	};
	/**
	 * Code indicating the maintenance of an account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UseCasesCode UseCasesCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MNTN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Maintenance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code indicating the maintenance of an account."</li>
	 * </ul>
	 */
	public static final UseCasesCode Maintenance = new UseCasesCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Maintenance";
			definition = "Code indicating the maintenance of an account.";
			owner_lazy = () -> com.tools20022.repository.codeset.UseCasesCode.mmObject();
			codeName = "MNTN";
		}
	};
	/**
	 * Code indicating the closing of an account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UseCasesCode UseCasesCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLSG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Closing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code indicating the closing of an account."</li>
	 * </ul>
	 */
	public static final UseCasesCode Closing = new UseCasesCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Closing";
			definition = "Code indicating the closing of an account.";
			owner_lazy = () -> com.tools20022.repository.codeset.UseCasesCode.mmObject();
			codeName = "CLSG";
		}
	};
	/**
	 * Code indicating the view of an account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UseCasesCode UseCasesCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VIEW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "View"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code indicating the view of an account."</li>
	 * </ul>
	 */
	public static final UseCasesCode View = new UseCasesCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "View";
			definition = "Code indicating the view of an account.";
			owner_lazy = () -> com.tools20022.repository.codeset.UseCasesCode.mmObject();
			codeName = "VIEW";
		}
	};
	final static private LinkedHashMap<String, UseCasesCode> codesByName = new LinkedHashMap<>();

	protected UseCasesCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("OPEN");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UseCasesCode";
				definition = "Specifies the action on the cash account.";
				derivation_lazy = () -> Arrays.asList(UseCases1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.UseCasesCode.Opening, com.tools20022.repository.codeset.UseCasesCode.Maintenance, com.tools20022.repository.codeset.UseCasesCode.Closing,
						com.tools20022.repository.codeset.UseCasesCode.View);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Opening.getCodeName().get(), Opening);
		codesByName.put(Maintenance.getCodeName().get(), Maintenance);
		codesByName.put(Closing.getCodeName().get(), Closing);
		codesByName.put(View.getCodeName().get(), View);
	}

	public static UseCasesCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static UseCasesCode[] values() {
		UseCasesCode[] values = new UseCasesCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, UseCasesCode> {
		@Override
		public UseCasesCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(UseCasesCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}