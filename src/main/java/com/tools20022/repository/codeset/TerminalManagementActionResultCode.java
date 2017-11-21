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
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Final result of the processed terminal management action.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResultCode#mmAccessDenied
 * TerminalManagementActionResultCode.mmAccessDenied}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResultCode#mmConnectionError
 * TerminalManagementActionResultCode.mmConnectionError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResultCode#mmFormatError
 * TerminalManagementActionResultCode.mmFormatError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResultCode#mmInvalidContent
 * TerminalManagementActionResultCode.mmInvalidContent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResultCode#mmLengthError
 * TerminalManagementActionResultCode.mmLengthError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResultCode#mmMemoryOverflow
 * TerminalManagementActionResultCode.mmMemoryOverflow}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResultCode#mmMissingFile
 * TerminalManagementActionResultCode.mmMissingFile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResultCode#mmNotSupported
 * TerminalManagementActionResultCode.mmNotSupported}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResultCode#mmSignatureError
 * TerminalManagementActionResultCode.mmSignatureError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResultCode#mmSuccess
 * TerminalManagementActionResultCode.mmSuccess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResultCode#mmSyntaxError
 * TerminalManagementActionResultCode.mmSyntaxError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResultCode#mmTimeout
 * TerminalManagementActionResultCode.mmTimeout}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResultCode#mmUnknownData
 * TerminalManagementActionResultCode.mmUnknownData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResultCode#mmUnknownKeyReference
 * TerminalManagementActionResultCode.mmUnknownKeyReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResultCode#mmHardware
 * TerminalManagementActionResultCode.mmHardware}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResultCode#mmSecurity
 * TerminalManagementActionResultCode.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResultCode#mmDelegationParametersReceivedUnauthorized
 * TerminalManagementActionResultCode.mmDelegationParametersReceivedUnauthorized
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResultCode#mmInvalidDelegationInManagementPlan
 * TerminalManagementActionResultCode.mmInvalidDelegationInManagementPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResultCode#mmInvalidDelegationProof
 * TerminalManagementActionResultCode.mmInvalidDelegationProof}</li>
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
public class TerminalManagementActionResultCode {

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
	public static final MMCode mmAccessDenied = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccessDenied";
			definition = "Access is denied while performing the action.";
			owner_lazy = () -> TerminalManagementActionResultCode.mmObject();
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
	public static final MMCode mmConnectionError = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConnectionError";
			definition = "Problem to connect while performing the action.";
			owner_lazy = () -> TerminalManagementActionResultCode.mmObject();
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
	public static final MMCode mmFormatError = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FormatError";
			definition = "Data transferred has a wrong format.";
			owner_lazy = () -> TerminalManagementActionResultCode.mmObject();
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
	public static final MMCode mmInvalidContent = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvalidContent";
			definition = "Content of the data is invalid.";
			owner_lazy = () -> TerminalManagementActionResultCode.mmObject();
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
	public static final MMCode mmLengthError = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LengthError";
			definition = "Data transferred has a wrong length.";
			owner_lazy = () -> TerminalManagementActionResultCode.mmObject();
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
	public static final MMCode mmMemoryOverflow = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MemoryOverflow";
			definition = "Memory to store the date exceeded.";
			owner_lazy = () -> TerminalManagementActionResultCode.mmObject();
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
	public static final MMCode mmMissingFile = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MissingFile";
			definition = "Data set to be maintained is missing.";
			owner_lazy = () -> TerminalManagementActionResultCode.mmObject();
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
	public static final MMCode mmNotSupported = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotSupported";
			definition = "Action is not supported.";
			owner_lazy = () -> TerminalManagementActionResultCode.mmObject();
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
	public static final MMCode mmSignatureError = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SignatureError";
			definition = "Data transferred has a wrong digital signature.";
			owner_lazy = () -> TerminalManagementActionResultCode.mmObject();
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
	public static final MMCode mmSuccess = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Success";
			definition = "Action was successfully performed.";
			owner_lazy = () -> TerminalManagementActionResultCode.mmObject();
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
	public static final MMCode mmSyntaxError = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SyntaxError";
			definition = "Data transferred has a wrong syntax.";
			owner_lazy = () -> TerminalManagementActionResultCode.mmObject();
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
	public static final MMCode mmTimeout = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Timeout";
			definition = "Timeout expired during the data transfer.";
			owner_lazy = () -> TerminalManagementActionResultCode.mmObject();
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
	public static final MMCode mmUnknownData = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnknownData";
			definition = "Data set identification invalid.";
			owner_lazy = () -> TerminalManagementActionResultCode.mmObject();
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
	public static final MMCode mmUnknownKeyReference = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnknownKeyReference";
			definition = "Cryptographic key reference used for the data signature is not valid.";
			owner_lazy = () -> TerminalManagementActionResultCode.mmObject();
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
	public static final MMCode mmHardware = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Hardware";
			definition = "Hardware error.";
			owner_lazy = () -> TerminalManagementActionResultCode.mmObject();
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
	public static final MMCode mmSecurity = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Security";
			definition = "Security error.";
			owner_lazy = () -> TerminalManagementActionResultCode.mmObject();
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
	public static final MMCode mmDelegationParametersReceivedUnauthorized = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DelegationParametersReceivedUnauthorized";
			definition = "The content analysis of the AcceptorConfigurationUpdate reveals unexpected parameters.";
			owner_lazy = () -> TerminalManagementActionResultCode.mmObject();
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
	public static final MMCode mmInvalidDelegationInManagementPlan = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidDelegationInManagementPlan";
			definition = "One action of the AcceptorManagementPlan refers to an update unauthorized by the delegation.";
			owner_lazy = () -> TerminalManagementActionResultCode.mmObject();
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
	public static final MMCode mmInvalidDelegationProof = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidDelegationProof";
			definition = "Delegation Proof transmitted by the delegated TMS is not the one expected.";
			owner_lazy = () -> TerminalManagementActionResultCode.mmObject();
			codeName = "INDP";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("ACCD");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TerminalManagementActionResultCode";
				definition = "Final result of the processed terminal management action.";
				code_lazy = () -> Arrays.asList(TerminalManagementActionResultCode.mmAccessDenied, TerminalManagementActionResultCode.mmConnectionError, TerminalManagementActionResultCode.mmFormatError,
						TerminalManagementActionResultCode.mmInvalidContent, TerminalManagementActionResultCode.mmLengthError, TerminalManagementActionResultCode.mmMemoryOverflow, TerminalManagementActionResultCode.mmMissingFile,
						TerminalManagementActionResultCode.mmNotSupported, TerminalManagementActionResultCode.mmSignatureError, TerminalManagementActionResultCode.mmSuccess, TerminalManagementActionResultCode.mmSyntaxError,
						TerminalManagementActionResultCode.mmTimeout, TerminalManagementActionResultCode.mmUnknownData, TerminalManagementActionResultCode.mmUnknownKeyReference, TerminalManagementActionResultCode.mmHardware,
						TerminalManagementActionResultCode.mmSecurity, TerminalManagementActionResultCode.mmDelegationParametersReceivedUnauthorized, TerminalManagementActionResultCode.mmInvalidDelegationInManagementPlan,
						TerminalManagementActionResultCode.mmInvalidDelegationProof);
			}
		});
		return mmObject_lazy.get();
	}
}