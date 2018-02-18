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
import com.tools20022.repository.codeset.ModificationProcessingStatusCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the status of a cancellation request.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationProcessingStatusCode#Completed
 * ModificationProcessingStatusCode.Completed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationProcessingStatusCode#Pending
 * ModificationProcessingStatusCode.Pending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationProcessingStatusCode#Denied
 * ModificationProcessingStatusCode.Denied}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationProcessingStatusCode#Accepted
 * ModificationProcessingStatusCode.Accepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationProcessingStatusCode#Rejected
 * ModificationProcessingStatusCode.Rejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationProcessingStatusCode#InRepair
 * ModificationProcessingStatusCode.InRepair}</li>
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
 * <li>"MODC"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ModificationProcessingStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the status of a cancellation request."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ModificationProcessingStatusCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Modification has been completed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ModificationProcessingStatusCode
	 * ModificationProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MODC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Completed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Modification has been completed."</li>
	 * </ul>
	 */
	public static final ModificationProcessingStatusCode Completed = new ModificationProcessingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Completed";
			definition = "Modification has been completed.";
			owner_lazy = () -> com.tools20022.repository.codeset.ModificationProcessingStatusCode.mmObject();
			codeName = "MODC";
		}
	};
	/**
	 * Modification is pending. It is not known at this time whether modified
	 * can be executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ModificationProcessingStatusCode
	 * ModificationProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MODP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pending"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Modification is pending. It is not known at this time whether modified can be executed."
	 * </li>
	 * </ul>
	 */
	public static final ModificationProcessingStatusCode Pending = new ModificationProcessingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pending";
			definition = "Modification is pending. It is not known at this time whether modified can be executed.";
			owner_lazy = () -> com.tools20022.repository.codeset.ModificationProcessingStatusCode.mmObject();
			codeName = "MODP";
		}
	};
	/**
	 * Modification will not be executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ModificationProcessingStatusCode
	 * ModificationProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DEND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Denied"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Modification will not be executed."</li>
	 * </ul>
	 */
	public static final ModificationProcessingStatusCode Denied = new ModificationProcessingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Denied";
			definition = "Modification will not be executed.";
			owner_lazy = () -> com.tools20022.repository.codeset.ModificationProcessingStatusCode.mmObject();
			codeName = "DEND";
		}
	};
	/**
	 * Modification request has been acknowledged for further processing by the
	 * account servicer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ModificationProcessingStatusCode
	 * ModificationProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PACK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Accepted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Modification request has been acknowledged for further processing by the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final ModificationProcessingStatusCode Accepted = new ModificationProcessingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Accepted";
			definition = "Modification request has been acknowledged for further processing by the account servicer.";
			owner_lazy = () -> com.tools20022.repository.codeset.ModificationProcessingStatusCode.mmObject();
			codeName = "PACK";
		}
	};
	/**
	 * Modification has been rejected for further processing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ModificationProcessingStatusCode
	 * ModificationProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REJT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rejected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Modification has been rejected for further processing."</li>
	 * </ul>
	 */
	public static final ModificationProcessingStatusCode Rejected = new ModificationProcessingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			definition = "Modification has been rejected for further processing.";
			owner_lazy = () -> com.tools20022.repository.codeset.ModificationProcessingStatusCode.mmObject();
			codeName = "REJT";
		}
	};
	/**
	 * Modification request is in repair.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ModificationProcessingStatusCode
	 * ModificationProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REPR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InRepair"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Modification request is in repair."</li>
	 * </ul>
	 */
	public static final ModificationProcessingStatusCode InRepair = new ModificationProcessingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InRepair";
			definition = "Modification request is in repair.";
			owner_lazy = () -> com.tools20022.repository.codeset.ModificationProcessingStatusCode.mmObject();
			codeName = "REPR";
		}
	};
	final static private LinkedHashMap<String, ModificationProcessingStatusCode> codesByName = new LinkedHashMap<>();

	protected ModificationProcessingStatusCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("MODC");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ModificationProcessingStatusCode";
				definition = "Specifies the status of a cancellation request.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ModificationProcessingStatusCode.Completed, com.tools20022.repository.codeset.ModificationProcessingStatusCode.Pending,
						com.tools20022.repository.codeset.ModificationProcessingStatusCode.Denied, com.tools20022.repository.codeset.ModificationProcessingStatusCode.Accepted,
						com.tools20022.repository.codeset.ModificationProcessingStatusCode.Rejected, com.tools20022.repository.codeset.ModificationProcessingStatusCode.InRepair);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Completed.getCodeName().get(), Completed);
		codesByName.put(Pending.getCodeName().get(), Pending);
		codesByName.put(Denied.getCodeName().get(), Denied);
		codesByName.put(Accepted.getCodeName().get(), Accepted);
		codesByName.put(Rejected.getCodeName().get(), Rejected);
		codesByName.put(InRepair.getCodeName().get(), InRepair);
	}

	public static ModificationProcessingStatusCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ModificationProcessingStatusCode[] values() {
		ModificationProcessingStatusCode[] values = new ModificationProcessingStatusCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ModificationProcessingStatusCode> {
		@Override
		public ModificationProcessingStatusCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ModificationProcessingStatusCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}