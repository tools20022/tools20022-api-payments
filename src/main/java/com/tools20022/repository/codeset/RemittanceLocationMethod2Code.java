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
import com.tools20022.repository.codeset.RemittanceLocationMethod2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the method used to deliver the remittance advice information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RemittanceLocationMethod2Code#Fax
 * RemittanceLocationMethod2Code.mmFax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RemittanceLocationMethod2Code#ElectronicDataInterchange
 * RemittanceLocationMethod2Code.mmElectronicDataInterchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RemittanceLocationMethod2Code#UniformResourceIdentifier
 * RemittanceLocationMethod2Code.mmUniformResourceIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RemittanceLocationMethod2Code#EMail
 * RemittanceLocationMethod2Code.mmEMail}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RemittanceLocationMethod2Code#Post
 * RemittanceLocationMethod2Code.mmPost}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RemittanceLocationMethod2Code#SMS
 * RemittanceLocationMethod2Code.mmSMS}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.RemittanceLocationMethodCode
 * RemittanceLocationMethodCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"FAXI"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RemittanceLocationMethod2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the method used to deliver the remittance advice information."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RemittanceLocationMethod2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RemittanceLocationMethod2Code
	 * RemittanceLocationMethod2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Fax"</li>
	 * </ul>
	 */
	public static final RemittanceLocationMethod2Code Fax = new RemittanceLocationMethod2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Fax";
			owner_lazy = () -> com.tools20022.repository.codeset.RemittanceLocationMethod2Code.mmObject();
			codeName = RemittanceLocationMethodCode.Fax.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RemittanceLocationMethod2Code
	 * RemittanceLocationMethod2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectronicDataInterchange"</li>
	 * </ul>
	 */
	public static final RemittanceLocationMethod2Code ElectronicDataInterchange = new RemittanceLocationMethod2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectronicDataInterchange";
			owner_lazy = () -> com.tools20022.repository.codeset.RemittanceLocationMethod2Code.mmObject();
			codeName = RemittanceLocationMethodCode.ElectronicDataInterchange.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RemittanceLocationMethod2Code
	 * RemittanceLocationMethod2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UniformResourceIdentifier"</li>
	 * </ul>
	 */
	public static final RemittanceLocationMethod2Code UniformResourceIdentifier = new RemittanceLocationMethod2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UniformResourceIdentifier";
			owner_lazy = () -> com.tools20022.repository.codeset.RemittanceLocationMethod2Code.mmObject();
			codeName = RemittanceLocationMethodCode.UniformResourceIdentifier.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RemittanceLocationMethod2Code
	 * RemittanceLocationMethod2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EMail"</li>
	 * </ul>
	 */
	public static final RemittanceLocationMethod2Code EMail = new RemittanceLocationMethod2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EMail";
			owner_lazy = () -> com.tools20022.repository.codeset.RemittanceLocationMethod2Code.mmObject();
			codeName = RemittanceLocationMethodCode.EMail.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RemittanceLocationMethod2Code
	 * RemittanceLocationMethod2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Post"</li>
	 * </ul>
	 */
	public static final RemittanceLocationMethod2Code Post = new RemittanceLocationMethod2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Post";
			owner_lazy = () -> com.tools20022.repository.codeset.RemittanceLocationMethod2Code.mmObject();
			codeName = RemittanceLocationMethodCode.Post.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RemittanceLocationMethod2Code
	 * RemittanceLocationMethod2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SMS"</li>
	 * </ul>
	 */
	public static final RemittanceLocationMethod2Code SMS = new RemittanceLocationMethod2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SMS";
			owner_lazy = () -> com.tools20022.repository.codeset.RemittanceLocationMethod2Code.mmObject();
			codeName = RemittanceLocationMethodCode.SMS.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, RemittanceLocationMethod2Code> codesByName = new LinkedHashMap<>();

	protected RemittanceLocationMethod2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("FAXI");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RemittanceLocationMethod2Code";
				definition = "Specifies the method used to deliver the remittance advice information.";
				trace_lazy = () -> RemittanceLocationMethodCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RemittanceLocationMethod2Code.Fax, com.tools20022.repository.codeset.RemittanceLocationMethod2Code.ElectronicDataInterchange,
						com.tools20022.repository.codeset.RemittanceLocationMethod2Code.UniformResourceIdentifier, com.tools20022.repository.codeset.RemittanceLocationMethod2Code.EMail,
						com.tools20022.repository.codeset.RemittanceLocationMethod2Code.Post, com.tools20022.repository.codeset.RemittanceLocationMethod2Code.SMS);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Fax.getCodeName().get(), Fax);
		codesByName.put(ElectronicDataInterchange.getCodeName().get(), ElectronicDataInterchange);
		codesByName.put(UniformResourceIdentifier.getCodeName().get(), UniformResourceIdentifier);
		codesByName.put(EMail.getCodeName().get(), EMail);
		codesByName.put(Post.getCodeName().get(), Post);
		codesByName.put(SMS.getCodeName().get(), SMS);
	}

	public static RemittanceLocationMethod2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RemittanceLocationMethod2Code[] values() {
		RemittanceLocationMethod2Code[] values = new RemittanceLocationMethod2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RemittanceLocationMethod2Code> {
		@Override
		public RemittanceLocationMethod2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RemittanceLocationMethod2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}