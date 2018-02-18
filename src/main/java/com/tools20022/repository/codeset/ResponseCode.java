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
import com.tools20022.repository.codeset.ResponseCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Response code of a transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ResponseCode#Declined
 * ResponseCode.Declined}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ResponseCode#Approved
 * ResponseCode.Approved}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResponseCode#PartialApproved
 * ResponseCode.PartialApproved}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResponseCode#TechnicalError
 * ResponseCode.TechnicalError}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ResponseCode#FurtherAction
 * ResponseCode.FurtherAction}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ResponseCode#NotProcessed
 * ResponseCode.NotProcessed}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ResponseCode#Processed
 * ResponseCode.Processed}</li>
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
 * <li>"DECL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ResponseCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Response code of a transaction."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ResponseCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Service is declined.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResponseCode ResponseCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DECL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Declined"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Service is declined."</li>
	 * </ul>
	 */
	public static final ResponseCode Declined = new ResponseCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Declined";
			definition = "Service is declined.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResponseCode.mmObject();
			codeName = "DECL";
		}
	};
	/**
	 * Service has been successfuly provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResponseCode ResponseCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "APPR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Approved"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Service has been successfuly provided."</li>
	 * </ul>
	 */
	public static final ResponseCode Approved = new ResponseCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Approved";
			definition = "Service has been successfuly provided.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResponseCode.mmObject();
			codeName = "APPR";
		}
	};
	/**
	 * Service has been partialy provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResponseCode ResponseCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PART"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialApproved"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Service has been partialy provided."</li>
	 * </ul>
	 */
	public static final ResponseCode PartialApproved = new ResponseCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartialApproved";
			definition = "Service has been partialy provided.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResponseCode.mmObject();
			codeName = "PART";
		}
	};
	/**
	 * Service cannot be provided for technical reason (eg timeout contacting
	 * the Issuer, security problem).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResponseCode ResponseCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TECH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TechnicalError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Service cannot be provided for technical reason (eg timeout contacting the Issuer, security problem)."
	 * </li>
	 * </ul>
	 */
	public static final ResponseCode TechnicalError = new ResponseCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TechnicalError";
			definition = "Service cannot be provided for technical reason (eg timeout contacting the Issuer, security problem).";
			owner_lazy = () -> com.tools20022.repository.codeset.ResponseCode.mmObject();
			codeName = "TECH";
		}
	};
	/**
	 * Further action required to complete the transaction, for instance a
	 * referral.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResponseCode ResponseCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FRTH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FurtherAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Further action required to complete the transaction, for instance a referral."
	 * </li>
	 * </ul>
	 */
	public static final ResponseCode FurtherAction = new ResponseCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FurtherAction";
			definition = "Further action required to complete the transaction, for instance a referral.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResponseCode.mmObject();
			codeName = "FRTH";
		}
	};
	/**
	 * Advice message could not be processed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResponseCode ResponseCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UNPR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotProcessed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Advice message could not be processed."</li>
	 * </ul>
	 */
	public static final ResponseCode NotProcessed = new ResponseCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotProcessed";
			definition = "Advice message could not be processed.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResponseCode.mmObject();
			codeName = "UNPR";
		}
	};
	/**
	 * Advice message is processed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResponseCode ResponseCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRCS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Processed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Advice message is processed."</li>
	 * </ul>
	 */
	public static final ResponseCode Processed = new ResponseCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Processed";
			definition = "Advice message is processed.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResponseCode.mmObject();
			codeName = "PRCS";
		}
	};
	final static private LinkedHashMap<String, ResponseCode> codesByName = new LinkedHashMap<>();

	protected ResponseCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("DECL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ResponseCode";
				definition = "Response code of a transaction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ResponseCode.Declined, com.tools20022.repository.codeset.ResponseCode.Approved, com.tools20022.repository.codeset.ResponseCode.PartialApproved,
						com.tools20022.repository.codeset.ResponseCode.TechnicalError, com.tools20022.repository.codeset.ResponseCode.FurtherAction, com.tools20022.repository.codeset.ResponseCode.NotProcessed,
						com.tools20022.repository.codeset.ResponseCode.Processed);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Declined.getCodeName().get(), Declined);
		codesByName.put(Approved.getCodeName().get(), Approved);
		codesByName.put(PartialApproved.getCodeName().get(), PartialApproved);
		codesByName.put(TechnicalError.getCodeName().get(), TechnicalError);
		codesByName.put(FurtherAction.getCodeName().get(), FurtherAction);
		codesByName.put(NotProcessed.getCodeName().get(), NotProcessed);
		codesByName.put(Processed.getCodeName().get(), Processed);
	}

	public static ResponseCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ResponseCode[] values() {
		ResponseCode[] values = new ResponseCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ResponseCode> {
		@Override
		public ResponseCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ResponseCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}