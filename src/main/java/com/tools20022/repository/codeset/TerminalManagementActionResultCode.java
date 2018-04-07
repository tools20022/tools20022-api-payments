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
import com.tools20022.repository.codeset.TerminalManagementActionResultCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Final result of the processed terminal management action.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResultCode#AccessDenied
 * TerminalManagementActionResultCode.AccessDenied}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResultCode#ConnectionError
 * TerminalManagementActionResultCode.ConnectionError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResultCode#FormatError
 * TerminalManagementActionResultCode.FormatError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResultCode#InvalidContent
 * TerminalManagementActionResultCode.InvalidContent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResultCode#LengthError
 * TerminalManagementActionResultCode.LengthError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResultCode#MemoryOverflow
 * TerminalManagementActionResultCode.MemoryOverflow}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResultCode#MissingFile
 * TerminalManagementActionResultCode.MissingFile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResultCode#NotSupported
 * TerminalManagementActionResultCode.NotSupported}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResultCode#SignatureError
 * TerminalManagementActionResultCode.SignatureError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResultCode#Success
 * TerminalManagementActionResultCode.Success}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResultCode#SyntaxError
 * TerminalManagementActionResultCode.SyntaxError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResultCode#Timeout
 * TerminalManagementActionResultCode.Timeout}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResultCode#UnknownData
 * TerminalManagementActionResultCode.UnknownData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResultCode#UnknownKeyReference
 * TerminalManagementActionResultCode.UnknownKeyReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResultCode#Hardware
 * TerminalManagementActionResultCode.Hardware}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResultCode#Security
 * TerminalManagementActionResultCode.Security}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResultCode#DelegationParametersReceivedUnauthorized
 * TerminalManagementActionResultCode.DelegationParametersReceivedUnauthorized}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResultCode#InvalidDelegationInManagementPlan
 * TerminalManagementActionResultCode.InvalidDelegationInManagementPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResultCode#InvalidDelegationProof
 * TerminalManagementActionResultCode.InvalidDelegationProof}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResultCode#CommunicationError
 * TerminalManagementActionResultCode.CommunicationError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResultCode#AnyError
 * TerminalManagementActionResultCode.AnyError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResultCode#UnlistedError
 * TerminalManagementActionResultCode.UnlistedError}</li>
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
 * <li>"ACCD"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TerminalManagementActionResultCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Final result of the processed terminal management action."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TerminalManagementActionResultCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Access is denied while performing the action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResultCode
	 * TerminalManagementActionResultCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACCD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccessDenied"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Access is denied while performing the action."</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResultCode AccessDenied = new TerminalManagementActionResultCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccessDenied";
			definition = "Access is denied while performing the action.";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResultCode.mmObject();
			codeName = "ACCD";
		}
	};
	/**
	 * Problem to connect while performing the action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResultCode
	 * TerminalManagementActionResultCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CNTE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConnectionError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Problem to connect while performing the action."</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResultCode ConnectionError = new TerminalManagementActionResultCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConnectionError";
			definition = "Problem to connect while performing the action.";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResultCode.mmObject();
			codeName = "CNTE";
		}
	};
	/**
	 * Data transferred has a wrong format.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResultCode
	 * TerminalManagementActionResultCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FMTE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FormatError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Data transferred has a wrong format."</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResultCode FormatError = new TerminalManagementActionResultCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FormatError";
			definition = "Data transferred has a wrong format.";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResultCode.mmObject();
			codeName = "FMTE";
		}
	};
	/**
	 * Content of the data is invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResultCode
	 * TerminalManagementActionResultCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INVC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidContent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Content of the data is invalid."</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResultCode InvalidContent = new TerminalManagementActionResultCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvalidContent";
			definition = "Content of the data is invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResultCode.mmObject();
			codeName = "INVC";
		}
	};
	/**
	 * Data transferred has a wrong length.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResultCode
	 * TerminalManagementActionResultCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LENE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LengthError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Data transferred has a wrong length."</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResultCode LengthError = new TerminalManagementActionResultCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LengthError";
			definition = "Data transferred has a wrong length.";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResultCode.mmObject();
			codeName = "LENE";
		}
	};
	/**
	 * Memory to store the date exceeded.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResultCode
	 * TerminalManagementActionResultCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OVER"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MemoryOverflow"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Memory to store the date exceeded."</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResultCode MemoryOverflow = new TerminalManagementActionResultCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MemoryOverflow";
			definition = "Memory to store the date exceeded.";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResultCode.mmObject();
			codeName = "OVER";
		}
	};
	/**
	 * Data set to be maintained is missing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResultCode
	 * TerminalManagementActionResultCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MISS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingFile"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Data set to be maintained is missing."</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResultCode MissingFile = new TerminalManagementActionResultCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MissingFile";
			definition = "Data set to be maintained is missing.";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResultCode.mmObject();
			codeName = "MISS";
		}
	};
	/**
	 * Action is not supported.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResultCode
	 * TerminalManagementActionResultCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NSUP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotSupported"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Action is not supported."</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResultCode NotSupported = new TerminalManagementActionResultCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotSupported";
			definition = "Action is not supported.";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResultCode.mmObject();
			codeName = "NSUP";
		}
	};
	/**
	 * Data transferred has a wrong digital signature.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResultCode
	 * TerminalManagementActionResultCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SIGE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignatureError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Data transferred has a wrong digital signature."</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResultCode SignatureError = new TerminalManagementActionResultCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SignatureError";
			definition = "Data transferred has a wrong digital signature.";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResultCode.mmObject();
			codeName = "SIGE";
		}
	};
	/**
	 * Action was successfully performed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResultCode
	 * TerminalManagementActionResultCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SUCC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Success"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Action was successfully performed."</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResultCode Success = new TerminalManagementActionResultCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Success";
			definition = "Action was successfully performed.";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResultCode.mmObject();
			codeName = "SUCC";
		}
	};
	/**
	 * Data transferred has a wrong syntax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResultCode
	 * TerminalManagementActionResultCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SYNE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SyntaxError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Data transferred has a wrong syntax."</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResultCode SyntaxError = new TerminalManagementActionResultCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SyntaxError";
			definition = "Data transferred has a wrong syntax.";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResultCode.mmObject();
			codeName = "SYNE";
		}
	};
	/**
	 * Timeout expired during the data transfer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResultCode
	 * TerminalManagementActionResultCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TIMO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Timeout"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Timeout expired during the data transfer."</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResultCode Timeout = new TerminalManagementActionResultCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Timeout";
			definition = "Timeout expired during the data transfer.";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResultCode.mmObject();
			codeName = "TIMO";
		}
	};
	/**
	 * Data set identification invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResultCode
	 * TerminalManagementActionResultCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UKDT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnknownData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Data set identification invalid."</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResultCode UnknownData = new TerminalManagementActionResultCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnknownData";
			definition = "Data set identification invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResultCode.mmObject();
			codeName = "UKDT";
		}
	};
	/**
	 * Cryptographic key reference used for the data signature is not valid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResultCode
	 * TerminalManagementActionResultCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UKRF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnknownKeyReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cryptographic key reference used for the data signature is not valid."</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResultCode UnknownKeyReference = new TerminalManagementActionResultCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnknownKeyReference";
			definition = "Cryptographic key reference used for the data signature is not valid.";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResultCode.mmObject();
			codeName = "UKRF";
		}
	};
	/**
	 * Hardware error.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResultCode
	 * TerminalManagementActionResultCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HRDW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Hardware"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Hardware error."</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResultCode Hardware = new TerminalManagementActionResultCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Hardware";
			definition = "Hardware error.";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResultCode.mmObject();
			codeName = "HRDW";
		}
	};
	/**
	 * Security error.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResultCode
	 * TerminalManagementActionResultCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SECR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Security"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security error."</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResultCode Security = new TerminalManagementActionResultCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Security";
			definition = "Security error.";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResultCode.mmObject();
			codeName = "SECR";
		}
	};
	/**
	 * The content analysis of the AcceptorConfigurationUpdate reveals
	 * unexpected parameters.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResultCode
	 * TerminalManagementActionResultCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DPRU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DelegationParametersReceivedUnauthorized"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The content analysis of the AcceptorConfigurationUpdate reveals unexpected parameters."
	 * </li>
	 * </ul>
	 */
	public static final TerminalManagementActionResultCode DelegationParametersReceivedUnauthorized = new TerminalManagementActionResultCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DelegationParametersReceivedUnauthorized";
			definition = "The content analysis of the AcceptorConfigurationUpdate reveals unexpected parameters.";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResultCode.mmObject();
			codeName = "DPRU";
		}
	};
	/**
	 * One action of the AcceptorManagementPlan refers to an update unauthorized
	 * by the delegation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResultCode
	 * TerminalManagementActionResultCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IDMP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidDelegationInManagementPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "One action of the AcceptorManagementPlan refers to an update unauthorized by the delegation."
	 * </li>
	 * </ul>
	 */
	public static final TerminalManagementActionResultCode InvalidDelegationInManagementPlan = new TerminalManagementActionResultCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidDelegationInManagementPlan";
			definition = "One action of the AcceptorManagementPlan refers to an update unauthorized by the delegation.";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResultCode.mmObject();
			codeName = "IDMP";
		}
	};
	/**
	 * Delegation Proof transmitted by the delegated TMS is not the one
	 * expected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResultCode
	 * TerminalManagementActionResultCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INDP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidDelegationProof"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Delegation Proof transmitted by the delegated TMS is not the one expected."
	 * </li>
	 * </ul>
	 */
	public static final TerminalManagementActionResultCode InvalidDelegationProof = new TerminalManagementActionResultCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidDelegationProof";
			definition = "Delegation Proof transmitted by the delegated TMS is not the one expected.";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResultCode.mmObject();
			codeName = "INDP";
		}
	};
	/**
	 * Error in communication once the connection has been established.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResultCode
	 * TerminalManagementActionResultCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CMER"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommunicationError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Error in communication once the connection has been established."</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResultCode CommunicationError = new TerminalManagementActionResultCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommunicationError";
			definition = "Error in communication once the connection has been established.";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResultCode.mmObject();
			codeName = "CMER";
		}
	};
	/**
	 * This code value means all TerminalManagementActionResultCode except
	 * "Any Error" and "Unlisted Error".
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResultCode
	 * TerminalManagementActionResultCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AERR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AnyError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "This code value means all TerminalManagementActionResultCode except \"Any Error\" and \"Unlisted Error\"."
	 * </li>
	 * </ul>
	 */
	public static final TerminalManagementActionResultCode AnyError = new TerminalManagementActionResultCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AnyError";
			definition = "This code value means all TerminalManagementActionResultCode except \"Any Error\" and \"Unlisted Error\".";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResultCode.mmObject();
			codeName = "AERR";
		}
	};
	/**
	 * Any error that is not defined by a code value inside the
	 * TerminalManagementActionResultCode.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResultCode
	 * TerminalManagementActionResultCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ULER"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnlistedError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Any error that is not defined by a code value inside the TerminalManagementActionResultCode."
	 * </li>
	 * </ul>
	 */
	public static final TerminalManagementActionResultCode UnlistedError = new TerminalManagementActionResultCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnlistedError";
			definition = "Any error that is not defined by a code value inside the TerminalManagementActionResultCode.";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResultCode.mmObject();
			codeName = "ULER";
		}
	};
	final static private LinkedHashMap<String, TerminalManagementActionResultCode> codesByName = new LinkedHashMap<>();

	protected TerminalManagementActionResultCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ACCD");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TerminalManagementActionResultCode";
				definition = "Final result of the processed terminal management action.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TerminalManagementActionResultCode.AccessDenied, com.tools20022.repository.codeset.TerminalManagementActionResultCode.ConnectionError,
						com.tools20022.repository.codeset.TerminalManagementActionResultCode.FormatError, com.tools20022.repository.codeset.TerminalManagementActionResultCode.InvalidContent,
						com.tools20022.repository.codeset.TerminalManagementActionResultCode.LengthError, com.tools20022.repository.codeset.TerminalManagementActionResultCode.MemoryOverflow,
						com.tools20022.repository.codeset.TerminalManagementActionResultCode.MissingFile, com.tools20022.repository.codeset.TerminalManagementActionResultCode.NotSupported,
						com.tools20022.repository.codeset.TerminalManagementActionResultCode.SignatureError, com.tools20022.repository.codeset.TerminalManagementActionResultCode.Success,
						com.tools20022.repository.codeset.TerminalManagementActionResultCode.SyntaxError, com.tools20022.repository.codeset.TerminalManagementActionResultCode.Timeout,
						com.tools20022.repository.codeset.TerminalManagementActionResultCode.UnknownData, com.tools20022.repository.codeset.TerminalManagementActionResultCode.UnknownKeyReference,
						com.tools20022.repository.codeset.TerminalManagementActionResultCode.Hardware, com.tools20022.repository.codeset.TerminalManagementActionResultCode.Security,
						com.tools20022.repository.codeset.TerminalManagementActionResultCode.DelegationParametersReceivedUnauthorized, com.tools20022.repository.codeset.TerminalManagementActionResultCode.InvalidDelegationInManagementPlan,
						com.tools20022.repository.codeset.TerminalManagementActionResultCode.InvalidDelegationProof, com.tools20022.repository.codeset.TerminalManagementActionResultCode.CommunicationError,
						com.tools20022.repository.codeset.TerminalManagementActionResultCode.AnyError, com.tools20022.repository.codeset.TerminalManagementActionResultCode.UnlistedError);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AccessDenied.getCodeName().get(), AccessDenied);
		codesByName.put(ConnectionError.getCodeName().get(), ConnectionError);
		codesByName.put(FormatError.getCodeName().get(), FormatError);
		codesByName.put(InvalidContent.getCodeName().get(), InvalidContent);
		codesByName.put(LengthError.getCodeName().get(), LengthError);
		codesByName.put(MemoryOverflow.getCodeName().get(), MemoryOverflow);
		codesByName.put(MissingFile.getCodeName().get(), MissingFile);
		codesByName.put(NotSupported.getCodeName().get(), NotSupported);
		codesByName.put(SignatureError.getCodeName().get(), SignatureError);
		codesByName.put(Success.getCodeName().get(), Success);
		codesByName.put(SyntaxError.getCodeName().get(), SyntaxError);
		codesByName.put(Timeout.getCodeName().get(), Timeout);
		codesByName.put(UnknownData.getCodeName().get(), UnknownData);
		codesByName.put(UnknownKeyReference.getCodeName().get(), UnknownKeyReference);
		codesByName.put(Hardware.getCodeName().get(), Hardware);
		codesByName.put(Security.getCodeName().get(), Security);
		codesByName.put(DelegationParametersReceivedUnauthorized.getCodeName().get(), DelegationParametersReceivedUnauthorized);
		codesByName.put(InvalidDelegationInManagementPlan.getCodeName().get(), InvalidDelegationInManagementPlan);
		codesByName.put(InvalidDelegationProof.getCodeName().get(), InvalidDelegationProof);
		codesByName.put(CommunicationError.getCodeName().get(), CommunicationError);
		codesByName.put(AnyError.getCodeName().get(), AnyError);
		codesByName.put(UnlistedError.getCodeName().get(), UnlistedError);
	}

	public static TerminalManagementActionResultCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TerminalManagementActionResultCode[] values() {
		TerminalManagementActionResultCode[] values = new TerminalManagementActionResultCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TerminalManagementActionResultCode> {
		@Override
		public TerminalManagementActionResultCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TerminalManagementActionResultCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}