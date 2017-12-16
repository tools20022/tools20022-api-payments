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
import com.tools20022.repository.codeset.CorporateActionEventStatusCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the status of the CA event or option.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStatusCode#Active
 * CorporateActionEventStatusCode.mmActive}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStatusCode#Deactivated
 * CorporateActionEventStatusCode.mmDeactivated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStatusCode#Expired
 * CorporateActionEventStatusCode.mmExpired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStatusCode#Cancelled
 * CorporateActionEventStatusCode.mmCancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStatusCode#Withdrawn
 * CorporateActionEventStatusCode.mmWithdrawn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStatusCode#Inactive
 * CorporateActionEventStatusCode.mmInactive}</li>
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
 * <li>"ACTI"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionEventStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the status of the CA event or option."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CorporateActionEventStatusCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * The CA event is active.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStatusCode
	 * CorporateActionEventStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACTI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Active"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The CA event is active."</li>
	 * </ul>
	 */
	public static final CorporateActionEventStatusCode Active = new CorporateActionEventStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Active";
			definition = "The CA event is active.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventStatusCode.mmObject();
			codeName = "ACTI";
		}
	};
	/**
	 * The CA event is deactivated. The clients cannot send instruction anymore.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStatusCode
	 * CorporateActionEventStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DEAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Deactivated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CA event is deactivated. The clients cannot send instruction anymore."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventStatusCode Deactivated = new CorporateActionEventStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Deactivated";
			definition = "The CA event is deactivated. The clients cannot send instruction anymore.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventStatusCode.mmObject();
			codeName = "DEAC";
		}
	};
	/**
	 * The CA event is expired, no more processing, claims, transformations take
	 * place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStatusCode
	 * CorporateActionEventStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXPI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Expired"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CA event is expired, no more processing, claims, transformations take place."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventStatusCode Expired = new CorporateActionEventStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Expired";
			definition = "The CA event is expired, no more processing, claims, transformations take place.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventStatusCode.mmObject();
			codeName = "EXPI";
		}
	};
	/**
	 * The CA event is cancelled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStatusCode
	 * CorporateActionEventStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CANC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cancelled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The CA event is cancelled."</li>
	 * </ul>
	 */
	public static final CorporateActionEventStatusCode Cancelled = new CorporateActionEventStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Cancelled";
			definition = "The CA event is cancelled.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventStatusCode.mmObject();
			codeName = "CANC";
		}
	};
	/**
	 * The CA event is withrawn, ie, cancelled by the market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStatusCode
	 * CorporateActionEventStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WITH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Withdrawn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The CA event is withrawn, ie, cancelled by the market."</li>
	 * </ul>
	 */
	public static final CorporateActionEventStatusCode Withdrawn = new CorporateActionEventStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Withdrawn";
			definition = "The CA event is withrawn, ie, cancelled by the market.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventStatusCode.mmObject();
			codeName = "WITH";
		}
	};
	/**
	 * Option is not active and can no longer be responded to. Any responses
	 * already processed against this option will remain valid, eg, expired
	 * option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStatusCode
	 * CorporateActionEventStatusCode}</li>
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
	 * definition} =
	 * "Option is not active and can no longer be responded to. Any responses already processed against this option will remain valid, eg, expired option."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventStatusCode Inactive = new CorporateActionEventStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Inactive";
			definition = "Option is not active and can no longer be responded to. Any responses already processed against this option will remain valid, eg, expired option.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventStatusCode.mmObject();
			codeName = "INAC";
		}
	};
	final static private LinkedHashMap<String, CorporateActionEventStatusCode> codesByName = new LinkedHashMap<>();

	protected CorporateActionEventStatusCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("ACTI");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionEventStatusCode";
				definition = "Specifies the status of the CA event or option.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionEventStatusCode.Active, com.tools20022.repository.codeset.CorporateActionEventStatusCode.Deactivated,
						com.tools20022.repository.codeset.CorporateActionEventStatusCode.Expired, com.tools20022.repository.codeset.CorporateActionEventStatusCode.Cancelled,
						com.tools20022.repository.codeset.CorporateActionEventStatusCode.Withdrawn, com.tools20022.repository.codeset.CorporateActionEventStatusCode.Inactive);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Active.getCodeName().get(), Active);
		codesByName.put(Deactivated.getCodeName().get(), Deactivated);
		codesByName.put(Expired.getCodeName().get(), Expired);
		codesByName.put(Cancelled.getCodeName().get(), Cancelled);
		codesByName.put(Withdrawn.getCodeName().get(), Withdrawn);
		codesByName.put(Inactive.getCodeName().get(), Inactive);
	}

	public static CorporateActionEventStatusCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CorporateActionEventStatusCode[] values() {
		CorporateActionEventStatusCode[] values = new CorporateActionEventStatusCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CorporateActionEventStatusCode> {
		@Override
		public CorporateActionEventStatusCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CorporateActionEventStatusCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}