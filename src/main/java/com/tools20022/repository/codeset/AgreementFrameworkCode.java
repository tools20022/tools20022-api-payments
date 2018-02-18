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
import com.tools20022.repository.codeset.AgreementFrameworkCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the agreement type details for the margin call.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AgreementFrameworkCode#FBAAgreement
 * AgreementFrameworkCode.FBAAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AgreementFrameworkCode#BBAAgreement
 * AgreementFrameworkCode.BBAAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AgreementFrameworkCode#GermanRahmenvertragAgreement
 * AgreementFrameworkCode.GermanRahmenvertragAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AgreementFrameworkCode#ISDAAgreement
 * AgreementFrameworkCode.ISDAAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AgreementFrameworkCode#NoReference
 * AgreementFrameworkCode.NoReference}</li>
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
 * <li>"FBAA"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AgreementFrameworkCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the agreement type details for the margin call."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AgreementFrameworkCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * French Banker's Association Agreement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AgreementFrameworkCode
	 * AgreementFrameworkCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FBAA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FBAAgreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "French Banker's Association Agreement."</li>
	 * </ul>
	 */
	public static final AgreementFrameworkCode FBAAgreement = new AgreementFrameworkCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FBAAgreement";
			definition = "French Banker's Association Agreement.";
			owner_lazy = () -> com.tools20022.repository.codeset.AgreementFrameworkCode.mmObject();
			codeName = "FBAA";
		}
	};
	/**
	 * British Banker's Association Agreement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AgreementFrameworkCode
	 * AgreementFrameworkCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BBAA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BBAAgreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "British Banker's Association Agreement."</li>
	 * </ul>
	 */
	public static final AgreementFrameworkCode BBAAgreement = new AgreementFrameworkCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BBAAgreement";
			definition = "British Banker's Association Agreement.";
			owner_lazy = () -> com.tools20022.repository.codeset.AgreementFrameworkCode.mmObject();
			codeName = "BBAA";
		}
	};
	/**
	 * German Rahmenvertrag Agreement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AgreementFrameworkCode
	 * AgreementFrameworkCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DERV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GermanRahmenvertragAgreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "German Rahmenvertrag Agreement."</li>
	 * </ul>
	 */
	public static final AgreementFrameworkCode GermanRahmenvertragAgreement = new AgreementFrameworkCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GermanRahmenvertragAgreement";
			definition = "German Rahmenvertrag Agreement.";
			owner_lazy = () -> com.tools20022.repository.codeset.AgreementFrameworkCode.mmObject();
			codeName = "DERV";
		}
	};
	/**
	 * International Swaps and Derivatives Association Agreement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AgreementFrameworkCode
	 * AgreementFrameworkCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ISDA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ISDAAgreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "International Swaps and Derivatives Association Agreement."</li>
	 * </ul>
	 */
	public static final AgreementFrameworkCode ISDAAgreement = new AgreementFrameworkCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISDAAgreement";
			definition = "International Swaps and Derivatives Association Agreement.";
			owner_lazy = () -> com.tools20022.repository.codeset.AgreementFrameworkCode.mmObject();
			codeName = "ISDA";
		}
	};
	/**
	 * No information about the master agreement is available.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AgreementFrameworkCode
	 * AgreementFrameworkCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NONR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "No information about the master agreement is available."</li>
	 * </ul>
	 */
	public static final AgreementFrameworkCode NoReference = new AgreementFrameworkCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoReference";
			definition = "No information about the master agreement is available.";
			owner_lazy = () -> com.tools20022.repository.codeset.AgreementFrameworkCode.mmObject();
			codeName = "NONR";
		}
	};
	final static private LinkedHashMap<String, AgreementFrameworkCode> codesByName = new LinkedHashMap<>();

	protected AgreementFrameworkCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("FBAA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AgreementFrameworkCode";
				definition = "Specifies the agreement type details for the margin call.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AgreementFrameworkCode.FBAAgreement, com.tools20022.repository.codeset.AgreementFrameworkCode.BBAAgreement,
						com.tools20022.repository.codeset.AgreementFrameworkCode.GermanRahmenvertragAgreement, com.tools20022.repository.codeset.AgreementFrameworkCode.ISDAAgreement,
						com.tools20022.repository.codeset.AgreementFrameworkCode.NoReference);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(FBAAgreement.getCodeName().get(), FBAAgreement);
		codesByName.put(BBAAgreement.getCodeName().get(), BBAAgreement);
		codesByName.put(GermanRahmenvertragAgreement.getCodeName().get(), GermanRahmenvertragAgreement);
		codesByName.put(ISDAAgreement.getCodeName().get(), ISDAAgreement);
		codesByName.put(NoReference.getCodeName().get(), NoReference);
	}

	public static AgreementFrameworkCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AgreementFrameworkCode[] values() {
		AgreementFrameworkCode[] values = new AgreementFrameworkCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AgreementFrameworkCode> {
		@Override
		public AgreementFrameworkCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AgreementFrameworkCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}