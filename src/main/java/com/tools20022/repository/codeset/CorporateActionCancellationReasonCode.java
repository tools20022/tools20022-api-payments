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
import com.tools20022.repository.codeset.CorporateActionCancellationReasonCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies reasons for cancellation of a corporate action event.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionCancellationReasonCode#Processing
 * CorporateActionCancellationReasonCode.mmProcessing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionCancellationReasonCode#Withrawal
 * CorporateActionCancellationReasonCode.mmWithrawal}</li>
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
 * <li>"PROC"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionCancellationReasonCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies reasons for cancellation of a corporate action event."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CorporateActionCancellationReasonCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Cancellation due to a processing error.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionCancellationReasonCode
	 * CorporateActionCancellationReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PROC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Processing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cancellation due to a processing error."</li>
	 * </ul>
	 */
	public static final CorporateActionCancellationReasonCode Processing = new CorporateActionCancellationReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Processing";
			definition = "Cancellation due to a processing error.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionCancellationReasonCode.mmObject();
			codeName = "PROC";
		}
	};
	/**
	 * Cancellation due to the corporate action event being cancelled by the
	 * issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionCancellationReasonCode
	 * CorporateActionCancellationReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WITH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Withrawal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cancellation due to the corporate action event being cancelled by the issuer."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionCancellationReasonCode Withrawal = new CorporateActionCancellationReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Withrawal";
			definition = "Cancellation due to the corporate action event being cancelled by the issuer.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionCancellationReasonCode.mmObject();
			codeName = "WITH";
		}
	};
	final static private LinkedHashMap<String, CorporateActionCancellationReasonCode> codesByName = new LinkedHashMap<>();

	protected CorporateActionCancellationReasonCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("PROC");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionCancellationReasonCode";
				definition = "Specifies reasons for cancellation of a corporate action event.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionCancellationReasonCode.Processing, com.tools20022.repository.codeset.CorporateActionCancellationReasonCode.Withrawal);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Processing.getCodeName().get(), Processing);
		codesByName.put(Withrawal.getCodeName().get(), Withrawal);
	}

	public static CorporateActionCancellationReasonCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CorporateActionCancellationReasonCode[] values() {
		CorporateActionCancellationReasonCode[] values = new CorporateActionCancellationReasonCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CorporateActionCancellationReasonCode> {
		@Override
		public CorporateActionCancellationReasonCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CorporateActionCancellationReasonCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}