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
import com.tools20022.repository.codeset.TransactionIndividualStatus1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the status of a single payment transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionIndividualStatus1Code#AcceptedTechnicalValidation
 * TransactionIndividualStatus1Code.mmAcceptedTechnicalValidation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionIndividualStatus1Code#Rejected
 * TransactionIndividualStatus1Code.mmRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionIndividualStatus1Code#Pending
 * TransactionIndividualStatus1Code.mmPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionIndividualStatus1Code#AcceptedCustomerProfile
 * TransactionIndividualStatus1Code.mmAcceptedCustomerProfile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionIndividualStatus1Code#AcceptedSettlementInProcess
 * TransactionIndividualStatus1Code.mmAcceptedSettlementInProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionIndividualStatus1Code#AcceptedSettlementCompleted
 * TransactionIndividualStatus1Code.mmAcceptedSettlementCompleted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionIndividualStatus1Code#AcceptedCancellationRequest
 * TransactionIndividualStatus1Code.mmAcceptedCancellationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionIndividualStatus1Code#AcceptedWithChange
 * TransactionIndividualStatus1Code.mmAcceptedWithChange}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.PaymentStatusCode
 * PaymentStatusCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"ACTC"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TransactionIndividualStatus1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the status of a single payment transaction."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TransactionIndividualStatus1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionIndividualStatus1Code
	 * TransactionIndividualStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptedTechnicalValidation"</li>
	 * </ul>
	 */
	public static final TransactionIndividualStatus1Code AcceptedTechnicalValidation = new TransactionIndividualStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptedTechnicalValidation";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionIndividualStatus1Code.mmObject();
			codeName = PaymentStatusCode.AcceptedTechnicalValidation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionIndividualStatus1Code
	 * TransactionIndividualStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rejected"</li>
	 * </ul>
	 */
	public static final TransactionIndividualStatus1Code Rejected = new TransactionIndividualStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionIndividualStatus1Code.mmObject();
			codeName = PaymentStatusCode.Rejected.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionIndividualStatus1Code
	 * TransactionIndividualStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pending"</li>
	 * </ul>
	 */
	public static final TransactionIndividualStatus1Code Pending = new TransactionIndividualStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pending";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionIndividualStatus1Code.mmObject();
			codeName = PaymentStatusCode.Pending.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionIndividualStatus1Code
	 * TransactionIndividualStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptedCustomerProfile"</li>
	 * </ul>
	 */
	public static final TransactionIndividualStatus1Code AcceptedCustomerProfile = new TransactionIndividualStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptedCustomerProfile";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionIndividualStatus1Code.mmObject();
			codeName = PaymentStatusCode.AcceptedCustomerProfile.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionIndividualStatus1Code
	 * TransactionIndividualStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptedSettlementInProcess"</li>
	 * </ul>
	 */
	public static final TransactionIndividualStatus1Code AcceptedSettlementInProcess = new TransactionIndividualStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptedSettlementInProcess";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionIndividualStatus1Code.mmObject();
			codeName = PaymentStatusCode.AcceptedSettlementInProcess.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionIndividualStatus1Code
	 * TransactionIndividualStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptedSettlementCompleted"</li>
	 * </ul>
	 */
	public static final TransactionIndividualStatus1Code AcceptedSettlementCompleted = new TransactionIndividualStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptedSettlementCompleted";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionIndividualStatus1Code.mmObject();
			codeName = PaymentStatusCode.AcceptedSettlementCompleted.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionIndividualStatus1Code
	 * TransactionIndividualStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptedCancellationRequest"</li>
	 * </ul>
	 */
	public static final TransactionIndividualStatus1Code AcceptedCancellationRequest = new TransactionIndividualStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptedCancellationRequest";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionIndividualStatus1Code.mmObject();
			codeName = PaymentStatusCode.AcceptedCancellationRequest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionIndividualStatus1Code
	 * TransactionIndividualStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptedWithChange"</li>
	 * </ul>
	 */
	public static final TransactionIndividualStatus1Code AcceptedWithChange = new TransactionIndividualStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptedWithChange";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionIndividualStatus1Code.mmObject();
			codeName = PaymentStatusCode.AcceptedWithChange.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TransactionIndividualStatus1Code> codesByName = new LinkedHashMap<>();

	protected TransactionIndividualStatus1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("ACTC");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransactionIndividualStatus1Code";
				definition = "Specifies the status of a single payment transaction.";
				trace_lazy = () -> PaymentStatusCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TransactionIndividualStatus1Code.AcceptedTechnicalValidation, com.tools20022.repository.codeset.TransactionIndividualStatus1Code.Rejected,
						com.tools20022.repository.codeset.TransactionIndividualStatus1Code.Pending, com.tools20022.repository.codeset.TransactionIndividualStatus1Code.AcceptedCustomerProfile,
						com.tools20022.repository.codeset.TransactionIndividualStatus1Code.AcceptedSettlementInProcess, com.tools20022.repository.codeset.TransactionIndividualStatus1Code.AcceptedSettlementCompleted,
						com.tools20022.repository.codeset.TransactionIndividualStatus1Code.AcceptedCancellationRequest, com.tools20022.repository.codeset.TransactionIndividualStatus1Code.AcceptedWithChange);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AcceptedTechnicalValidation.getCodeName().get(), AcceptedTechnicalValidation);
		codesByName.put(Rejected.getCodeName().get(), Rejected);
		codesByName.put(Pending.getCodeName().get(), Pending);
		codesByName.put(AcceptedCustomerProfile.getCodeName().get(), AcceptedCustomerProfile);
		codesByName.put(AcceptedSettlementInProcess.getCodeName().get(), AcceptedSettlementInProcess);
		codesByName.put(AcceptedSettlementCompleted.getCodeName().get(), AcceptedSettlementCompleted);
		codesByName.put(AcceptedCancellationRequest.getCodeName().get(), AcceptedCancellationRequest);
		codesByName.put(AcceptedWithChange.getCodeName().get(), AcceptedWithChange);
	}

	public static TransactionIndividualStatus1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TransactionIndividualStatus1Code[] values() {
		TransactionIndividualStatus1Code[] values = new TransactionIndividualStatus1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TransactionIndividualStatus1Code> {
		@Override
		public TransactionIndividualStatus1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TransactionIndividualStatus1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}