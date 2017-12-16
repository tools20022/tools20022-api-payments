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
import com.tools20022.repository.codeset.PhysicalTransferTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies whether the financial instrument is to be physically delivered or
 * is a dematerilized transfer.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PhysicalTransferTypeCode#Physical
 * PhysicalTransferTypeCode.mmPhysical}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PhysicalTransferTypeCode#Dematerialised
 * PhysicalTransferTypeCode.mmDematerialised}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PhysicalTransferTypeCode#Cash
 * PhysicalTransferTypeCode.mmCash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PhysicalTransferTypeCode#Optional
 * PhysicalTransferTypeCode.mmOptional}</li>
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
 * <li>"PHYS"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PhysicalTransferTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies whether the financial instrument is to be physically delivered or is a dematerilized transfer."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PhysicalTransferTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Physical transfer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PhysicalTransferTypeCode
	 * PhysicalTransferTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PHYS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Physical"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Physical transfer."</li>
	 * </ul>
	 */
	public static final PhysicalTransferTypeCode Physical = new PhysicalTransferTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Physical";
			definition = "Physical transfer.";
			owner_lazy = () -> com.tools20022.repository.codeset.PhysicalTransferTypeCode.mmObject();
			codeName = "PHYS";
		}
	};
	/**
	 * Dematerialised transfer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PhysicalTransferTypeCode
	 * PhysicalTransferTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DEMT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Dematerialised"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Dematerialised transfer."</li>
	 * </ul>
	 */
	public static final PhysicalTransferTypeCode Dematerialised = new PhysicalTransferTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Dematerialised";
			definition = "Dematerialised transfer.";
			owner_lazy = () -> com.tools20022.repository.codeset.PhysicalTransferTypeCode.mmObject();
			codeName = "DEMT";
		}
	};
	/**
	 * Cash transfer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PhysicalTransferTypeCode
	 * PhysicalTransferTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CASH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cash"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash transfer."</li>
	 * </ul>
	 */
	public static final PhysicalTransferTypeCode Cash = new PhysicalTransferTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cash";
			definition = "Cash transfer.";
			owner_lazy = () -> com.tools20022.repository.codeset.PhysicalTransferTypeCode.mmObject();
			codeName = "CASH";
		}
	};
	/**
	 * Determined by a third party or optional for counterparty.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PhysicalTransferTypeCode
	 * PhysicalTransferTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OPTN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Optional"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Determined by a third party or optional for counterparty."
	 * </li>
	 * </ul>
	 */
	public static final PhysicalTransferTypeCode Optional = new PhysicalTransferTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Optional";
			definition = "Determined by a third party or optional for counterparty.";
			owner_lazy = () -> com.tools20022.repository.codeset.PhysicalTransferTypeCode.mmObject();
			codeName = "OPTN";
		}
	};
	final static private LinkedHashMap<String, PhysicalTransferTypeCode> codesByName = new LinkedHashMap<>();

	protected PhysicalTransferTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("PHYS");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PhysicalTransferTypeCode";
				definition = "Specifies whether the financial instrument is to be physically delivered or is a dematerilized transfer.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PhysicalTransferTypeCode.Physical, com.tools20022.repository.codeset.PhysicalTransferTypeCode.Dematerialised,
						com.tools20022.repository.codeset.PhysicalTransferTypeCode.Cash, com.tools20022.repository.codeset.PhysicalTransferTypeCode.Optional);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Physical.getCodeName().get(), Physical);
		codesByName.put(Dematerialised.getCodeName().get(), Dematerialised);
		codesByName.put(Cash.getCodeName().get(), Cash);
		codesByName.put(Optional.getCodeName().get(), Optional);
	}

	public static PhysicalTransferTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PhysicalTransferTypeCode[] values() {
		PhysicalTransferTypeCode[] values = new PhysicalTransferTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PhysicalTransferTypeCode> {
		@Override
		public PhysicalTransferTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PhysicalTransferTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}