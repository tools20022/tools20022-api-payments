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
import com.tools20022.repository.codeset.AppearanceCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the deliverability of a security.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.AppearanceCode#Deliverable
 * AppearanceCode.Deliverable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AppearanceCode#NotDeliverable
 * AppearanceCode.NotDeliverable}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AppearanceCode#Limited
 * AppearanceCode.Limited}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AppearanceCode#BookEntry
 * AppearanceCode.BookEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AppearanceCode#DeferredBookEntry
 * AppearanceCode.DeferredBookEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AppearanceCode#DeliverableBookEntry
 * AppearanceCode.DeliverableBookEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AppearanceCode#TemporaryGlobal
 * AppearanceCode.TemporaryGlobal}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AppearanceCode#Global
 * AppearanceCode.Global}</li>
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
 * <li>"DELI"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AppearanceCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the deliverability of a security."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AppearanceCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Physical certificates exist.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AppearanceCode
	 * AppearanceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DELI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Deliverable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Physical certificates exist."</li>
	 * </ul>
	 */
	public static final AppearanceCode Deliverable = new AppearanceCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Deliverable";
			definition = "Physical certificates exist.";
			owner_lazy = () -> com.tools20022.repository.codeset.AppearanceCode.mmObject();
			codeName = "DELI";
		}
	};
	/**
	 * Not yet deliverable contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AppearanceCode
	 * AppearanceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NDEL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotDeliverable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Not yet deliverable contract."</li>
	 * </ul>
	 */
	public static final AppearanceCode NotDeliverable = new AppearanceCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotDeliverable";
			definition = "Not yet deliverable contract.";
			owner_lazy = () -> com.tools20022.repository.codeset.AppearanceCode.mmObject();
			codeName = "NDEL";
		}
	};
	/**
	 * Limited or partial deliverability.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AppearanceCode
	 * AppearanceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LIMI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Limited"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Limited or partial deliverability."</li>
	 * </ul>
	 */
	public static final AppearanceCode Limited = new AppearanceCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Limited";
			definition = "Limited or partial deliverability.";
			owner_lazy = () -> com.tools20022.repository.codeset.AppearanceCode.mmObject();
			codeName = "LIMI";
		}
	};
	/**
	 * Security exists only as an electronic record, ie, there are no physical
	 * certificates representing the security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AppearanceCode
	 * AppearanceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BENT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BookEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Security exists only as an electronic record, ie, there are no physical certificates representing the security."
	 * </li>
	 * </ul>
	 */
	public static final AppearanceCode BookEntry = new AppearanceCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BookEntry";
			definition = "Security exists only as an electronic record, ie, there are no physical certificates representing the security.";
			owner_lazy = () -> com.tools20022.repository.codeset.AppearanceCode.mmObject();
			codeName = "BENT";
		}
	};
	/**
	 * Deferred printing, book entry.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AppearanceCode
	 * AppearanceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DFBE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeferredBookEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Deferred printing, book entry."</li>
	 * </ul>
	 */
	public static final AppearanceCode DeferredBookEntry = new AppearanceCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeferredBookEntry";
			definition = "Deferred printing, book entry.";
			owner_lazy = () -> com.tools20022.repository.codeset.AppearanceCode.mmObject();
			codeName = "DFBE";
		}
	};
	/**
	 * Deliverable, book entry.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AppearanceCode
	 * AppearanceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DLBE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverableBookEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Deliverable, book entry."</li>
	 * </ul>
	 */
	public static final AppearanceCode DeliverableBookEntry = new AppearanceCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeliverableBookEntry";
			definition = "Deliverable, book entry.";
			owner_lazy = () -> com.tools20022.repository.codeset.AppearanceCode.mmObject();
			codeName = "DLBE";
		}
	};
	/**
	 * Deferred printing, global certificate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AppearanceCode
	 * AppearanceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TMPG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TemporaryGlobal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Deferred printing, global certificate."</li>
	 * </ul>
	 */
	public static final AppearanceCode TemporaryGlobal = new AppearanceCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TemporaryGlobal";
			definition = "Deferred printing, global certificate.";
			owner_lazy = () -> com.tools20022.repository.codeset.AppearanceCode.mmObject();
			codeName = "TMPG";
		}
	};
	/**
	 * Not deliverable, global certificate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AppearanceCode
	 * AppearanceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GLOB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Global"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Not deliverable, global certificate."</li>
	 * </ul>
	 */
	public static final AppearanceCode Global = new AppearanceCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Global";
			definition = "Not deliverable, global certificate.";
			owner_lazy = () -> com.tools20022.repository.codeset.AppearanceCode.mmObject();
			codeName = "GLOB";
		}
	};
	final static private LinkedHashMap<String, AppearanceCode> codesByName = new LinkedHashMap<>();

	protected AppearanceCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("DELI");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AppearanceCode";
				definition = "Specifies the deliverability of a security.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AppearanceCode.Deliverable, com.tools20022.repository.codeset.AppearanceCode.NotDeliverable, com.tools20022.repository.codeset.AppearanceCode.Limited,
						com.tools20022.repository.codeset.AppearanceCode.BookEntry, com.tools20022.repository.codeset.AppearanceCode.DeferredBookEntry, com.tools20022.repository.codeset.AppearanceCode.DeliverableBookEntry,
						com.tools20022.repository.codeset.AppearanceCode.TemporaryGlobal, com.tools20022.repository.codeset.AppearanceCode.Global);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Deliverable.getCodeName().get(), Deliverable);
		codesByName.put(NotDeliverable.getCodeName().get(), NotDeliverable);
		codesByName.put(Limited.getCodeName().get(), Limited);
		codesByName.put(BookEntry.getCodeName().get(), BookEntry);
		codesByName.put(DeferredBookEntry.getCodeName().get(), DeferredBookEntry);
		codesByName.put(DeliverableBookEntry.getCodeName().get(), DeliverableBookEntry);
		codesByName.put(TemporaryGlobal.getCodeName().get(), TemporaryGlobal);
		codesByName.put(Global.getCodeName().get(), Global);
	}

	public static AppearanceCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AppearanceCode[] values() {
		AppearanceCode[] values = new AppearanceCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AppearanceCode> {
		@Override
		public AppearanceCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AppearanceCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}