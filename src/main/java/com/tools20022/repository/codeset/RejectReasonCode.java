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
import com.tools20022.repository.codeset.RejectReasonCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Reason of transmission of a rejection message in response to a request or an
 * advice.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectReasonCode#UnableToProcess
 * RejectReasonCode.UnableToProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectReasonCode#InvalidMessage
 * RejectReasonCode.InvalidMessage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectReasonCode#ParsingError
 * RejectReasonCode.ParsingError}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RejectReasonCode#Security
 * RejectReasonCode.Security}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectReasonCode#InitiatingParty
 * RejectReasonCode.InitiatingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectReasonCode#RecipientParty
 * RejectReasonCode.RecipientParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectReasonCode#DuplicateMessage
 * RejectReasonCode.DuplicateMessage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectReasonCode#ProtocolVersion
 * RejectReasonCode.ProtocolVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectReasonCode#MessageType
 * RejectReasonCode.MessageType}</li>
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
 * <li>"UNPR"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RejectReasonCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Reason of transmission of a rejection message in response to a request or an advice."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RejectReasonCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Not possible to process the message, for instance the security module is
	 * unavailable, the hardware is unavailable, or there is a problem of
	 * resource.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectReasonCode
	 * RejectReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UNPR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToProcess"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Not possible to process the message, for instance the security module is unavailable, the hardware is unavailable, or there is a problem of resource."
	 * </li>
	 * </ul>
	 */
	public static final RejectReasonCode UnableToProcess = new RejectReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnableToProcess";
			definition = "Not possible to process the message, for instance the security module is unavailable, the hardware is unavailable, or there is a problem of resource.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectReasonCode.mmObject();
			codeName = "UNPR";
		}
	};
	/**
	 * Invalid envelope of the message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectReasonCode
	 * RejectReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IMSG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidMessage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Invalid envelope of the message."</li>
	 * </ul>
	 */
	public static final RejectReasonCode InvalidMessage = new RejectReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvalidMessage";
			definition = "Invalid envelope of the message.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectReasonCode.mmObject();
			codeName = "IMSG";
		}
	};
	/**
	 * Invalid message: At least one of the data element or data structure is
	 * not present, the format, or the content of one data element or one data
	 * structure is not correct.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectReasonCode
	 * RejectReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PARS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParsingError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Invalid message: At least one of the data element or data structure is not present, the format, or the content of one data element or one data structure is not correct."
	 * </li>
	 * </ul>
	 */
	public static final RejectReasonCode ParsingError = new RejectReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ParsingError";
			definition = "Invalid message: At least one of the data element or data structure is not present, the format, or the content of one data element or one data structure is not correct.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectReasonCode.mmObject();
			codeName = "PARS";
		}
	};
	/**
	 * Security error (for example an invalid key or an incorrect MAC value).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectReasonCode
	 * RejectReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SECU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Security"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Security error (for example an invalid key or an incorrect MAC value)."</li>
	 * </ul>
	 */
	public static final RejectReasonCode Security = new RejectReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Security error (for example an invalid key or an incorrect MAC value).";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectReasonCode.mmObject();
			codeName = "SECU";
		}
	};
	/**
	 * Invalid identification data for the sender.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectReasonCode
	 * RejectReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INTP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InitiatingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Invalid identification data for the sender."</li>
	 * </ul>
	 */
	public static final RejectReasonCode InitiatingParty = new RejectReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InitiatingParty";
			definition = "Invalid identification data for the sender.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectReasonCode.mmObject();
			codeName = "INTP";
		}
	};
	/**
	 * Invalid identification data for the the receiver.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectReasonCode
	 * RejectReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RCPP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecipientParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Invalid identification data for the the receiver."</li>
	 * </ul>
	 */
	public static final RejectReasonCode RecipientParty = new RejectReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RecipientParty";
			definition = "Invalid identification data for the the receiver.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectReasonCode.mmObject();
			codeName = "RCPP";
		}
	};
	/**
	 * Duplicate message, the identification of the exchange is the same than a
	 * previous message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectReasonCode
	 * RejectReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DPMG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DuplicateMessage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Duplicate message, the identification of the exchange is the same than a previous message."
	 * </li>
	 * </ul>
	 */
	public static final RejectReasonCode DuplicateMessage = new RejectReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DuplicateMessage";
			definition = "Duplicate message, the identification of the exchange is the same than a previous message.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectReasonCode.mmObject();
			codeName = "DPMG";
		}
	};
	/**
	 * Version of the protocol couldn't be supported by the recipient.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectReasonCode
	 * RejectReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VERS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtocolVersion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Version of the protocol couldn't be supported by the recipient."</li>
	 * </ul>
	 */
	public static final RejectReasonCode ProtocolVersion = new RejectReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProtocolVersion";
			definition = "Version of the protocol couldn't be supported by the recipient.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectReasonCode.mmObject();
			codeName = "VERS";
		}
	};
	/**
	 * Type of message the recipient receives is unknow or unsupported.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectReasonCode
	 * RejectReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MSGT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of message the recipient receives is unknow or unsupported."</li>
	 * </ul>
	 */
	public static final RejectReasonCode MessageType = new RejectReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MessageType";
			definition = "Type of message the recipient receives is unknow or unsupported.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectReasonCode.mmObject();
			codeName = "MSGT";
		}
	};
	final static private LinkedHashMap<String, RejectReasonCode> codesByName = new LinkedHashMap<>();

	protected RejectReasonCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("UNPR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RejectReasonCode";
				definition = "Reason of transmission of a rejection message in response to a request or an advice.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RejectReasonCode.UnableToProcess, com.tools20022.repository.codeset.RejectReasonCode.InvalidMessage,
						com.tools20022.repository.codeset.RejectReasonCode.ParsingError, com.tools20022.repository.codeset.RejectReasonCode.Security, com.tools20022.repository.codeset.RejectReasonCode.InitiatingParty,
						com.tools20022.repository.codeset.RejectReasonCode.RecipientParty, com.tools20022.repository.codeset.RejectReasonCode.DuplicateMessage, com.tools20022.repository.codeset.RejectReasonCode.ProtocolVersion,
						com.tools20022.repository.codeset.RejectReasonCode.MessageType);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(UnableToProcess.getCodeName().get(), UnableToProcess);
		codesByName.put(InvalidMessage.getCodeName().get(), InvalidMessage);
		codesByName.put(ParsingError.getCodeName().get(), ParsingError);
		codesByName.put(Security.getCodeName().get(), Security);
		codesByName.put(InitiatingParty.getCodeName().get(), InitiatingParty);
		codesByName.put(RecipientParty.getCodeName().get(), RecipientParty);
		codesByName.put(DuplicateMessage.getCodeName().get(), DuplicateMessage);
		codesByName.put(ProtocolVersion.getCodeName().get(), ProtocolVersion);
		codesByName.put(MessageType.getCodeName().get(), MessageType);
	}

	public static RejectReasonCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RejectReasonCode[] values() {
		RejectReasonCode[] values = new RejectReasonCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RejectReasonCode> {
		@Override
		public RejectReasonCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RejectReasonCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}