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
import com.tools20022.repository.codeset.RepoCallAcknowledgementReasonCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies additional information about the repurchase agreement call
 * processed instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepoCallAcknowledgementReasonCode#AccountServicerDeadlineMissed
 * RepoCallAcknowledgementReasonCode.AccountServicerDeadlineMissed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepoCallAcknowledgementReasonCode#InProcess
 * RepoCallAcknowledgementReasonCode.InProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepoCallAcknowledgementReasonCode#Issued
 * RepoCallAcknowledgementReasonCode.Issued}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepoCallAcknowledgementReasonCode#Processed
 * RepoCallAcknowledgementReasonCode.Processed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepoCallAcknowledgementReasonCode#BeingProcessed
 * RepoCallAcknowledgementReasonCode.BeingProcessed}</li>
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
 * <li>"ADEA"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RepoCallAcknowledgementReasonCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies additional information about the repurchase agreement call processed instruction."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RepoCallAcknowledgementReasonCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Received after the account servicer's deadline. Processed on best effort
	 * basis.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepoCallAcknowledgementReasonCode
	 * RepoCallAcknowledgementReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ADEA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerDeadlineMissed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Received after the account servicer's deadline. Processed on best effort basis."
	 * </li>
	 * </ul>
	 */
	public static final RepoCallAcknowledgementReasonCode AccountServicerDeadlineMissed = new RepoCallAcknowledgementReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerDeadlineMissed";
			definition = "Received after the account servicer's deadline. Processed on best effort basis.";
			owner_lazy = () -> com.tools20022.repository.codeset.RepoCallAcknowledgementReasonCode.mmObject();
			codeName = "ADEA";
		}
	};
	/**
	 * Repuchase agreement call is in process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepoCallAcknowledgementReasonCode
	 * RepoCallAcknowledgementReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CALD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InProcess"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Repuchase agreement call is in process."</li>
	 * </ul>
	 */
	public static final RepoCallAcknowledgementReasonCode InProcess = new RepoCallAcknowledgementReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InProcess";
			definition = "Repuchase agreement call is in process.";
			owner_lazy = () -> com.tools20022.repository.codeset.RepoCallAcknowledgementReasonCode.mmObject();
			codeName = "CALD";
		}
	};
	/**
	 * Repurchase agreement call is issued.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepoCallAcknowledgementReasonCode
	 * RepoCallAcknowledgementReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CALI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issued"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Repurchase agreement call is issued."</li>
	 * </ul>
	 */
	public static final RepoCallAcknowledgementReasonCode Issued = new RepoCallAcknowledgementReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issued";
			definition = "Repurchase agreement call is issued.";
			owner_lazy = () -> com.tools20022.repository.codeset.RepoCallAcknowledgementReasonCode.mmObject();
			codeName = "CALI";
		}
	};
	/**
	 * Repurchase agreement call is processed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepoCallAcknowledgementReasonCode
	 * RepoCallAcknowledgementReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CALP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Processed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Repurchase agreement call is processed."</li>
	 * </ul>
	 */
	public static final RepoCallAcknowledgementReasonCode Processed = new RepoCallAcknowledgementReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Processed";
			definition = "Repurchase agreement call is processed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RepoCallAcknowledgementReasonCode.mmObject();
			codeName = "CALP";
		}
	};
	/**
	 * Repurchase agreement call request is being processed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepoCallAcknowledgementReasonCode
	 * RepoCallAcknowledgementReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CALR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeingProcessed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Repurchase agreement call request is being processed."</li>
	 * </ul>
	 */
	public static final RepoCallAcknowledgementReasonCode BeingProcessed = new RepoCallAcknowledgementReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeingProcessed";
			definition = "Repurchase agreement call request is being processed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RepoCallAcknowledgementReasonCode.mmObject();
			codeName = "CALR";
		}
	};
	final static private LinkedHashMap<String, RepoCallAcknowledgementReasonCode> codesByName = new LinkedHashMap<>();

	protected RepoCallAcknowledgementReasonCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ADEA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RepoCallAcknowledgementReasonCode";
				definition = "Specifies additional information about the repurchase agreement call processed instruction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RepoCallAcknowledgementReasonCode.AccountServicerDeadlineMissed, com.tools20022.repository.codeset.RepoCallAcknowledgementReasonCode.InProcess,
						com.tools20022.repository.codeset.RepoCallAcknowledgementReasonCode.Issued, com.tools20022.repository.codeset.RepoCallAcknowledgementReasonCode.Processed,
						com.tools20022.repository.codeset.RepoCallAcknowledgementReasonCode.BeingProcessed);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AccountServicerDeadlineMissed.getCodeName().get(), AccountServicerDeadlineMissed);
		codesByName.put(InProcess.getCodeName().get(), InProcess);
		codesByName.put(Issued.getCodeName().get(), Issued);
		codesByName.put(Processed.getCodeName().get(), Processed);
		codesByName.put(BeingProcessed.getCodeName().get(), BeingProcessed);
	}

	public static RepoCallAcknowledgementReasonCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RepoCallAcknowledgementReasonCode[] values() {
		RepoCallAcknowledgementReasonCode[] values = new RepoCallAcknowledgementReasonCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RepoCallAcknowledgementReasonCode> {
		@Override
		public RepoCallAcknowledgementReasonCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RepoCallAcknowledgementReasonCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}