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
import com.tools20022.repository.codeset.SecurityStatusCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the status of the security.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.SecurityStatusCode#Active
 * SecurityStatusCode.Active}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecurityStatusCode#Inactive
 * SecurityStatusCode.Inactive}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecurityStatusCode#WhenIssued
 * SecurityStatusCode.WhenIssued}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecurityStatusCode#WhenDistributed
 * SecurityStatusCode.WhenDistributed}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SecurityStatusCode#Issued
 * SecurityStatusCode.Issued}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecurityStatusCode#Suspended
 * SecurityStatusCode.Suspended}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecurityStatusCode#InDefault
 * SecurityStatusCode.InDefault}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecurityStatusCode#Worthless
 * SecurityStatusCode.Worthless}</li>
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
 * <li>"ACTV"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecurityStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the status of the security."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SecurityStatusCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * The status is active.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecurityStatusCode
	 * SecurityStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACTV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Active"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The status is active."</li>
	 * </ul>
	 */
	public static final SecurityStatusCode Active = new SecurityStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Active";
			definition = "The status is active.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecurityStatusCode.mmObject();
			codeName = "ACTV";
		}
	};
	/**
	 * The status is inactive.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecurityStatusCode
	 * SecurityStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Inactive"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The status is inactive."</li>
	 * </ul>
	 */
	public static final SecurityStatusCode Inactive = new SecurityStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Inactive";
			definition = "The status is inactive.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecurityStatusCode.mmObject();
			codeName = "INAC";
		}
	};
	/**
	 * The status is when issued.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecurityStatusCode
	 * SecurityStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WISS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WhenIssued"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The status is when issued."</li>
	 * </ul>
	 */
	public static final SecurityStatusCode WhenIssued = new SecurityStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WhenIssued";
			definition = "The status is when issued.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecurityStatusCode.mmObject();
			codeName = "WISS";
		}
	};
	/**
	 * The status is when distributed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecurityStatusCode
	 * SecurityStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WDIS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WhenDistributed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The status is when distributed."</li>
	 * </ul>
	 */
	public static final SecurityStatusCode WhenDistributed = new SecurityStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WhenDistributed";
			definition = "The status is when distributed.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecurityStatusCode.mmObject();
			codeName = "WDIS";
		}
	};
	/**
	 * The status is issued.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecurityStatusCode
	 * SecurityStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ISUD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issued"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The status is issued."</li>
	 * </ul>
	 */
	public static final SecurityStatusCode Issued = new SecurityStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Issued";
			definition = "The status is issued.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecurityStatusCode.mmObject();
			codeName = "ISUD";
		}
	};
	/**
	 * The status is suspended.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecurityStatusCode
	 * SecurityStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SUSP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Suspended"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The status is suspended."</li>
	 * </ul>
	 */
	public static final SecurityStatusCode Suspended = new SecurityStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Suspended";
			definition = "The status is suspended.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecurityStatusCode.mmObject();
			codeName = "SUSP";
		}
	};
	/**
	 * The status is in default.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecurityStatusCode
	 * SecurityStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IDEF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InDefault"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The status is in default."</li>
	 * </ul>
	 */
	public static final SecurityStatusCode InDefault = new SecurityStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InDefault";
			definition = "The status is in default.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecurityStatusCode.mmObject();
			codeName = "IDEF";
		}
	};
	/**
	 * Annoucement by the regulator that the security has become worthless.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecurityStatusCode
	 * SecurityStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WRTH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Worthless"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Annoucement by the regulator that the security has become worthless."</li>
	 * </ul>
	 */
	public static final SecurityStatusCode Worthless = new SecurityStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Worthless";
			definition = "Annoucement by the regulator that the security has become worthless.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecurityStatusCode.mmObject();
			codeName = "WRTH";
		}
	};
	final static private LinkedHashMap<String, SecurityStatusCode> codesByName = new LinkedHashMap<>();

	protected SecurityStatusCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ACTV");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecurityStatusCode";
				definition = "Specifies the status of the security.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SecurityStatusCode.Active, com.tools20022.repository.codeset.SecurityStatusCode.Inactive, com.tools20022.repository.codeset.SecurityStatusCode.WhenIssued,
						com.tools20022.repository.codeset.SecurityStatusCode.WhenDistributed, com.tools20022.repository.codeset.SecurityStatusCode.Issued, com.tools20022.repository.codeset.SecurityStatusCode.Suspended,
						com.tools20022.repository.codeset.SecurityStatusCode.InDefault, com.tools20022.repository.codeset.SecurityStatusCode.Worthless);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Active.getCodeName().get(), Active);
		codesByName.put(Inactive.getCodeName().get(), Inactive);
		codesByName.put(WhenIssued.getCodeName().get(), WhenIssued);
		codesByName.put(WhenDistributed.getCodeName().get(), WhenDistributed);
		codesByName.put(Issued.getCodeName().get(), Issued);
		codesByName.put(Suspended.getCodeName().get(), Suspended);
		codesByName.put(InDefault.getCodeName().get(), InDefault);
		codesByName.put(Worthless.getCodeName().get(), Worthless);
	}

	public static SecurityStatusCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SecurityStatusCode[] values() {
		SecurityStatusCode[] values = new SecurityStatusCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SecurityStatusCode> {
		@Override
		public SecurityStatusCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SecurityStatusCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}