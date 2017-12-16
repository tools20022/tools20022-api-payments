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
import com.tools20022.repository.codeset.OnLineCapabilityCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * On-line and off-line capabilities of the POI (Point Of Interaction).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OnLineCapabilityCode#OffLine
 * OnLineCapabilityCode.mmOffLine}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OnLineCapabilityCode#OnLine
 * OnLineCapabilityCode.mmOnLine}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OnLineCapabilityCode#SemiOffLine
 * OnLineCapabilityCode.mmSemiOffLine}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.OnLineCapability1Code
 * OnLineCapability1Code}</li>
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
 * <li>"OFLN"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OnLineCapabilityCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "On-line and off-line capabilities of the POI (Point Of Interaction)."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class OnLineCapabilityCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Off-line only capable.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OnLineCapabilityCode
	 * OnLineCapabilityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OFLN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OffLine"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Off-line only capable."</li>
	 * </ul>
	 */
	public static final OnLineCapabilityCode OffLine = new OnLineCapabilityCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OffLine";
			definition = "Off-line only capable.";
			owner_lazy = () -> com.tools20022.repository.codeset.OnLineCapabilityCode.mmObject();
			codeName = "OFLN";
		}
	};
	/**
	 * On-line only capable.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OnLineCapabilityCode
	 * OnLineCapabilityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ONLN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnLine"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "On-line only capable."</li>
	 * </ul>
	 */
	public static final OnLineCapabilityCode OnLine = new OnLineCapabilityCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OnLine";
			definition = "On-line only capable.";
			owner_lazy = () -> com.tools20022.repository.codeset.OnLineCapabilityCode.mmObject();
			codeName = "ONLN";
		}
	};
	/**
	 * Off-line capable with possible on-line requests to the acquirer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OnLineCapabilityCode
	 * OnLineCapabilityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SMON"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SemiOffLine"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Off-line capable with possible on-line requests to the acquirer."</li>
	 * </ul>
	 */
	public static final OnLineCapabilityCode SemiOffLine = new OnLineCapabilityCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SemiOffLine";
			definition = "Off-line capable with possible on-line requests to the acquirer.";
			owner_lazy = () -> com.tools20022.repository.codeset.OnLineCapabilityCode.mmObject();
			codeName = "SMON";
		}
	};
	final static private LinkedHashMap<String, OnLineCapabilityCode> codesByName = new LinkedHashMap<>();

	protected OnLineCapabilityCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("OFLN");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OnLineCapabilityCode";
				definition = "On-line and off-line capabilities of the POI (Point Of Interaction).";
				derivation_lazy = () -> Arrays.asList(OnLineCapability1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OnLineCapabilityCode.OffLine, com.tools20022.repository.codeset.OnLineCapabilityCode.OnLine,
						com.tools20022.repository.codeset.OnLineCapabilityCode.SemiOffLine);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(OffLine.getCodeName().get(), OffLine);
		codesByName.put(OnLine.getCodeName().get(), OnLine);
		codesByName.put(SemiOffLine.getCodeName().get(), SemiOffLine);
	}

	public static OnLineCapabilityCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static OnLineCapabilityCode[] values() {
		OnLineCapabilityCode[] values = new OnLineCapabilityCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, OnLineCapabilityCode> {
		@Override
		public OnLineCapabilityCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(OnLineCapabilityCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}