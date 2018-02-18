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
import com.tools20022.repository.codeset.ChargeBearerType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies which party(ies) will pay charges due for processing of the
 * instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeBearerType1Code#BorneByDebtor
 * ChargeBearerType1Code.BorneByDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeBearerType1Code#BorneByCreditor
 * ChargeBearerType1Code.BorneByCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeBearerType1Code#Shared
 * ChargeBearerType1Code.Shared}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeBearerType1Code#FollowingServiceLevel
 * ChargeBearerType1Code.FollowingServiceLevel}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ChargeBearerTypeCode
 * ChargeBearerTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"DEBT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ChargeBearerType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies which party(ies) will pay charges due for processing of the instruction."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ChargeBearerType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeBearerType1Code
	 * ChargeBearerType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BorneByDebtor"</li>
	 * </ul>
	 */
	public static final ChargeBearerType1Code BorneByDebtor = new ChargeBearerType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BorneByDebtor";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeBearerType1Code.mmObject();
			codeName = ChargeBearerTypeCode.BorneByDebtor.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeBearerType1Code
	 * ChargeBearerType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BorneByCreditor"</li>
	 * </ul>
	 */
	public static final ChargeBearerType1Code BorneByCreditor = new ChargeBearerType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BorneByCreditor";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeBearerType1Code.mmObject();
			codeName = ChargeBearerTypeCode.BorneByCreditor.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeBearerType1Code
	 * ChargeBearerType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Shared"</li>
	 * </ul>
	 */
	public static final ChargeBearerType1Code Shared = new ChargeBearerType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Shared";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeBearerType1Code.mmObject();
			codeName = ChargeBearerTypeCode.Shared.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeBearerType1Code
	 * ChargeBearerType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FollowingServiceLevel"</li>
	 * </ul>
	 */
	public static final ChargeBearerType1Code FollowingServiceLevel = new ChargeBearerType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FollowingServiceLevel";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeBearerType1Code.mmObject();
			codeName = ChargeBearerTypeCode.FollowingServiceLevel.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ChargeBearerType1Code> codesByName = new LinkedHashMap<>();

	protected ChargeBearerType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("DEBT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ChargeBearerType1Code";
				definition = "Specifies which party(ies) will pay charges due for processing of the instruction.";
				trace_lazy = () -> ChargeBearerTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ChargeBearerType1Code.BorneByDebtor, com.tools20022.repository.codeset.ChargeBearerType1Code.BorneByCreditor,
						com.tools20022.repository.codeset.ChargeBearerType1Code.Shared, com.tools20022.repository.codeset.ChargeBearerType1Code.FollowingServiceLevel);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(BorneByDebtor.getCodeName().get(), BorneByDebtor);
		codesByName.put(BorneByCreditor.getCodeName().get(), BorneByCreditor);
		codesByName.put(Shared.getCodeName().get(), Shared);
		codesByName.put(FollowingServiceLevel.getCodeName().get(), FollowingServiceLevel);
	}

	public static ChargeBearerType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ChargeBearerType1Code[] values() {
		ChargeBearerType1Code[] values = new ChargeBearerType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ChargeBearerType1Code> {
		@Override
		public ChargeBearerType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ChargeBearerType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}