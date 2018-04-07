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
import com.tools20022.repository.codeset.TMSContactLevelCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Level of urgency in contacting the terminal management system.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TMSContactLevelCode#Critical
 * TMSContactLevelCode.Critical}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TMSContactLevelCode#AsSoonAsPossible
 * TMSContactLevelCode.AsSoonAsPossible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TMSContactLevelCode#DateTime
 * TMSContactLevelCode.DateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TMSContactLevelCode#EndCustomerSession
 * TMSContactLevelCode.EndCustomerSession}</li>
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
 * <li>"CRIT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TMSContactLevelCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Level of urgency in contacting the terminal management system."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TMSContactLevelCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Terminal management system has to be contacted before the next
	 * transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TMSContactLevelCode
	 * TMSContactLevelCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRIT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Critical"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Terminal management system has to be contacted before the next transaction."
	 * </li>
	 * </ul>
	 */
	public static final TMSContactLevelCode Critical = new TMSContactLevelCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Critical";
			definition = "Terminal management system has to be contacted before the next transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.TMSContactLevelCode.mmObject();
			codeName = "CRIT";
		}
	};
	/**
	 * Terminal management system has to be contacted as soon as possible (for
	 * example after reconciliation).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TMSContactLevelCode
	 * TMSContactLevelCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ASAP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AsSoonAsPossible"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Terminal management system has to be contacted as soon as possible (for example after reconciliation)."
	 * </li>
	 * </ul>
	 */
	public static final TMSContactLevelCode AsSoonAsPossible = new TMSContactLevelCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AsSoonAsPossible";
			definition = "Terminal management system has to be contacted as soon as possible (for example after reconciliation).";
			owner_lazy = () -> com.tools20022.repository.codeset.TMSContactLevelCode.mmObject();
			codeName = "ASAP";
		}
	};
	/**
	 * Terminal management system has to be contacted at the date and time
	 * provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TMSContactLevelCode
	 * TMSContactLevelCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DTIM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Terminal management system has to be contacted at the date and time provided."
	 * </li>
	 * </ul>
	 */
	public static final TMSContactLevelCode DateTime = new TMSContactLevelCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DateTime";
			definition = "Terminal management system has to be contacted at the date and time provided.";
			owner_lazy = () -> com.tools20022.repository.codeset.TMSContactLevelCode.mmObject();
			codeName = "DTIM";
		}
	};
	/**
	 * After the end of the customer session.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TMSContactLevelCode
	 * TMSContactLevelCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ENCS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndCustomerSession"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "After the end of the customer session."</li>
	 * </ul>
	 */
	public static final TMSContactLevelCode EndCustomerSession = new TMSContactLevelCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndCustomerSession";
			definition = "After the end of the customer session.";
			owner_lazy = () -> com.tools20022.repository.codeset.TMSContactLevelCode.mmObject();
			codeName = "ENCS";
		}
	};
	final static private LinkedHashMap<String, TMSContactLevelCode> codesByName = new LinkedHashMap<>();

	protected TMSContactLevelCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CRIT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TMSContactLevelCode";
				definition = "Level of urgency in contacting the terminal management system.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TMSContactLevelCode.Critical, com.tools20022.repository.codeset.TMSContactLevelCode.AsSoonAsPossible,
						com.tools20022.repository.codeset.TMSContactLevelCode.DateTime, com.tools20022.repository.codeset.TMSContactLevelCode.EndCustomerSession);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Critical.getCodeName().get(), Critical);
		codesByName.put(AsSoonAsPossible.getCodeName().get(), AsSoonAsPossible);
		codesByName.put(DateTime.getCodeName().get(), DateTime);
		codesByName.put(EndCustomerSession.getCodeName().get(), EndCustomerSession);
	}

	public static TMSContactLevelCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TMSContactLevelCode[] values() {
		TMSContactLevelCode[] values = new TMSContactLevelCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TMSContactLevelCode> {
		@Override
		public TMSContactLevelCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TMSContactLevelCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}