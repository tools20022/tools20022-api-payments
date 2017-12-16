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
import com.tools20022.repository.codeset.CorporateActionEventProcessingStatusCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the stage in the corporate action event life cycle.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventProcessingStatusCode#Complete
 * CorporateActionEventProcessingStatusCode.mmComplete}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventProcessingStatusCode#Pending
 * CorporateActionEventProcessingStatusCode.mmPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventProcessingStatusCode#Reconciled
 * CorporateActionEventProcessingStatusCode.mmReconciled}</li>
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
 * <li>"COMP"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionEventProcessingStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the stage in the corporate action event life cycle."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CorporateActionEventProcessingStatusCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies that a corporate action event processing has been completed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventProcessingStatusCode
	 * CorporateActionEventProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COMP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Complete"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that a corporate action event processing has been completed."</li>
	 * </ul>
	 */
	public static final CorporateActionEventProcessingStatusCode Complete = new CorporateActionEventProcessingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Complete";
			definition = "Specifies that a corporate action event processing has been completed.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventProcessingStatusCode.mmObject();
			codeName = "COMP";
		}
	};
	/**
	 * Specifies that a corporate action event processing has not been
	 * completed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventProcessingStatusCode
	 * CorporateActionEventProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PEND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pending"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that a corporate action event processing has not been completed."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventProcessingStatusCode Pending = new CorporateActionEventProcessingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Pending";
			definition = "Specifies that a corporate action event processing has not been completed.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventProcessingStatusCode.mmObject();
			codeName = "PEND";
		}
	};
	/**
	 * Corporate action event processing specifying that the funds paid have
	 * been reconciled with the funds received from the agent (meaning that
	 * there is no more risk of payment to be reversed).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventProcessingStatusCode
	 * CorporateActionEventProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RECD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reconciled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action event processing specifying that the funds paid have been reconciled with the funds received from the agent (meaning that there is no more risk of payment to be reversed)."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventProcessingStatusCode Reconciled = new CorporateActionEventProcessingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Reconciled";
			definition = "Corporate action event processing specifying that the funds paid have been reconciled with the funds received from the agent (meaning that there is no more risk of payment to be reversed).";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventProcessingStatusCode.mmObject();
			codeName = "RECD";
		}
	};
	final static private LinkedHashMap<String, CorporateActionEventProcessingStatusCode> codesByName = new LinkedHashMap<>();

	protected CorporateActionEventProcessingStatusCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("COMP");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionEventProcessingStatusCode";
				definition = "Specifies the stage in the corporate action event life cycle.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionEventProcessingStatusCode.Complete, com.tools20022.repository.codeset.CorporateActionEventProcessingStatusCode.Pending,
						com.tools20022.repository.codeset.CorporateActionEventProcessingStatusCode.Reconciled);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Complete.getCodeName().get(), Complete);
		codesByName.put(Pending.getCodeName().get(), Pending);
		codesByName.put(Reconciled.getCodeName().get(), Reconciled);
	}

	public static CorporateActionEventProcessingStatusCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CorporateActionEventProcessingStatusCode[] values() {
		CorporateActionEventProcessingStatusCode[] values = new CorporateActionEventProcessingStatusCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CorporateActionEventProcessingStatusCode> {
		@Override
		public CorporateActionEventProcessingStatusCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CorporateActionEventProcessingStatusCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}