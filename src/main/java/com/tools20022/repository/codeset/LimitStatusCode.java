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
import com.tools20022.repository.codeset.LimitStatusCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the current status of a limit.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.LimitStatusCode#Enabled
 * LimitStatusCode.mmEnabled}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.LimitStatusCode#Disabled
 * LimitStatusCode.mmDisabled}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.LimitStatusCode#Deleted
 * LimitStatusCode.mmDeleted}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.LimitStatusCode#Requested
 * LimitStatusCode.mmRequested}</li>
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
 * <li>"ENAB"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "LimitStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the current status of a limit."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class LimitStatusCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Limit is currently in effect.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LimitStatusCode
	 * LimitStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ENAB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Enabled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Limit is currently in effect."</li>
	 * </ul>
	 */
	public static final LimitStatusCode Enabled = new LimitStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Enabled";
			definition = "Limit is currently in effect.";
			owner_lazy = () -> com.tools20022.repository.codeset.LimitStatusCode.mmObject();
			codeName = "ENAB";
		}
	};
	/**
	 * Limit is not currently in effect.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LimitStatusCode
	 * LimitStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DISA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Disabled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Limit is not currently in effect."</li>
	 * </ul>
	 */
	public static final LimitStatusCode Disabled = new LimitStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Disabled";
			definition = "Limit is not currently in effect.";
			owner_lazy = () -> com.tools20022.repository.codeset.LimitStatusCode.mmObject();
			codeName = "DISA";
		}
	};
	/**
	 * Limit has been deleted or suspended.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LimitStatusCode
	 * LimitStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DELD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Deleted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Limit has been deleted or suspended."</li>
	 * </ul>
	 */
	public static final LimitStatusCode Deleted = new LimitStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Deleted";
			definition = "Limit has been deleted or suspended.";
			owner_lazy = () -> com.tools20022.repository.codeset.LimitStatusCode.mmObject();
			codeName = "DELD";
		}
	};
	/**
	 * Limit has been asked for and is not yet enabled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LimitStatusCode
	 * LimitStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REQD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Requested"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Limit has been asked for and is not yet enabled."</li>
	 * </ul>
	 */
	public static final LimitStatusCode Requested = new LimitStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Requested";
			definition = "Limit has been asked for and is not yet enabled.";
			owner_lazy = () -> com.tools20022.repository.codeset.LimitStatusCode.mmObject();
			codeName = "REQD";
		}
	};
	final static private LinkedHashMap<String, LimitStatusCode> codesByName = new LinkedHashMap<>();

	protected LimitStatusCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("ENAB");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "LimitStatusCode";
				definition = "Specifies the current status of a limit.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.LimitStatusCode.Enabled, com.tools20022.repository.codeset.LimitStatusCode.Disabled, com.tools20022.repository.codeset.LimitStatusCode.Deleted,
						com.tools20022.repository.codeset.LimitStatusCode.Requested);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Enabled.getCodeName().get(), Enabled);
		codesByName.put(Disabled.getCodeName().get(), Disabled);
		codesByName.put(Deleted.getCodeName().get(), Deleted);
		codesByName.put(Requested.getCodeName().get(), Requested);
	}

	public static LimitStatusCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static LimitStatusCode[] values() {
		LimitStatusCode[] values = new LimitStatusCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, LimitStatusCode> {
		@Override
		public LimitStatusCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(LimitStatusCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}