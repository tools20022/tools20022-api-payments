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
 * Reason to process an online authorisation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OnLineReasonCode#mmRandomSelection
 * OnLineReasonCode.mmRandomSelection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OnLineReasonCode#mmICCForced
 * OnLineReasonCode.mmICCForced}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OnLineReasonCode#mmMerchantForced
 * OnLineReasonCode.mmMerchantForced}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OnLineReasonCode#mmTerminalForced
 * OnLineReasonCode.mmTerminalForced}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OnLineReasonCode#mmIssuerForced
 * OnLineReasonCode.mmIssuerForced}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OnLineReasonCode#mmFloorLimit
 * OnLineReasonCode.mmFloorLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OnLineReasonCode#mmExceptionFile
 * OnLineReasonCode.mmExceptionFile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OnLineReasonCode#mmTotalAmount
 * OnLineReasonCode.mmTotalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OnLineReasonCode#mmControlledBIN
 * OnLineReasonCode.mmControlledBIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OnLineReasonCode#mmUnknownBIN
 * OnLineReasonCode.mmUnknownBIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OnLineReasonCode#mmControlledPAN
 * OnLineReasonCode.mmControlledPAN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OnLineReasonCode#mmFlowControl
 * OnLineReasonCode.mmFlowControl}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OnLineReasonCode#mmUnavailableCurrency
 * OnLineReasonCode.mmUnavailableCurrency}</li>
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
 * <li>"RNDM"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OnLineReasonCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Reason to process an online authorisation."</li>
 * </ul>
 */
public class OnLineReasonCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Transaction random selection to go online.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OnLineReasonCode
	 * OnLineReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RNDM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RandomSelection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction random selection to go online."</li>
	 * </ul>
	 */
	public static final MMCode mmRandomSelection = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RandomSelection";
			definition = "Transaction random selection to go online.";
			owner_lazy = () -> OnLineReasonCode.mmObject();
			codeName = "RNDM";
		}
	};
	/**
	 * Payment application in the Integrated Circuit Card forces to go on-line.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OnLineReasonCode
	 * OnLineReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ICCF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ICCForced"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment application in the Integrated Circuit Card forces to go on-line."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmICCForced = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ICCForced";
			definition = "Payment application in the Integrated Circuit Card forces to go on-line.";
			owner_lazy = () -> OnLineReasonCode.mmObject();
			codeName = "ICCF";
		}
	};
	/**
	 * On line forced by card acceptor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OnLineReasonCode
	 * OnLineReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MERF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MerchantForced"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "On line forced by card acceptor."</li>
	 * </ul>
	 */
	public static final MMCode mmMerchantForced = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MerchantForced";
			definition = "On line forced by card acceptor.";
			owner_lazy = () -> OnLineReasonCode.mmObject();
			codeName = "MERF";
		}
	};
	/**
	 * Terminal random selection to go online.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OnLineReasonCode
	 * OnLineReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRMF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminalForced"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Terminal random selection to go online."</li>
	 * </ul>
	 */
	public static final MMCode mmTerminalForced = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TerminalForced";
			definition = "Terminal random selection to go online.";
			owner_lazy = () -> OnLineReasonCode.mmObject();
			codeName = "TRMF";
		}
	};
	/**
	 * On line forced by card issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OnLineReasonCode
	 * OnLineReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ISSF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerForced"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "On line forced by card issuer."</li>
	 * </ul>
	 */
	public static final MMCode mmIssuerForced = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IssuerForced";
			definition = "On line forced by card issuer.";
			owner_lazy = () -> OnLineReasonCode.mmObject();
			codeName = "ISSF";
		}
	};
	/**
	 * Over floor limit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OnLineReasonCode
	 * OnLineReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FRLT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FloorLimit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Over floor limit."</li>
	 * </ul>
	 */
	public static final MMCode mmFloorLimit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FloorLimit";
			definition = "Over floor limit.";
			owner_lazy = () -> OnLineReasonCode.mmObject();
			codeName = "FRLT";
		}
	};
	/**
	 * Card appears on terminal exception file.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OnLineReasonCode
	 * OnLineReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXFL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExceptionFile"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Card appears on terminal exception file."</li>
	 * </ul>
	 */
	public static final MMCode mmExceptionFile = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExceptionFile";
			definition = "Card appears on terminal exception file.";
			owner_lazy = () -> OnLineReasonCode.mmObject();
			codeName = "EXFL";
		}
	};
	/**
	 * Total amount of purchases per cardholder and per application above floor
	 * limit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OnLineReasonCode
	 * OnLineReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TAMT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount of purchases per cardholder and per application above floor limit."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmTotalAmount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TotalAmount";
			definition = "Total amount of purchases per cardholder and per application above floor limit.";
			owner_lazy = () -> OnLineReasonCode.mmObject();
			codeName = "TAMT";
		}
	};
	/**
	 * Bank Identification Number under control.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OnLineReasonCode
	 * OnLineReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CBIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ControlledBIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Bank Identification Number under control."</li>
	 * </ul>
	 */
	public static final MMCode mmControlledBIN = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ControlledBIN";
			definition = "Bank Identification Number under control.";
			owner_lazy = () -> OnLineReasonCode.mmObject();
			codeName = "CBIN";
		}
	};
	/**
	 * Unknown Bank Identification Number.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OnLineReasonCode
	 * OnLineReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UBIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnknownBIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unknown Bank Identification Number."</li>
	 * </ul>
	 */
	public static final MMCode mmUnknownBIN = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnknownBIN";
			definition = "Unknown Bank Identification Number.";
			owner_lazy = () -> OnLineReasonCode.mmObject();
			codeName = "UBIN";
		}
	};
	/**
	 * Primary account number (card number) under control.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OnLineReasonCode
	 * OnLineReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CPAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ControlledPAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Primary account number (card number) under control."</li>
	 * </ul>
	 */
	public static final MMCode mmControlledPAN = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ControlledPAN";
			definition = "Primary account number (card number) under control.";
			owner_lazy = () -> OnLineReasonCode.mmObject();
			codeName = "CPAN";
		}
	};
	/**
	 * Flow control.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OnLineReasonCode
	 * OnLineReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FLOW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FlowControl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Flow control."</li>
	 * </ul>
	 */
	public static final MMCode mmFlowControl = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FlowControl";
			definition = "Flow control.";
			owner_lazy = () -> OnLineReasonCode.mmObject();
			codeName = "FLOW";
		}
	};
	/**
	 * Unknown currency code or foreign currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OnLineReasonCode
	 * OnLineReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRCY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnavailableCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unknown currency code or foreign currency."</li>
	 * </ul>
	 */
	public static final MMCode mmUnavailableCurrency = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnavailableCurrency";
			definition = "Unknown currency code or foreign currency.";
			owner_lazy = () -> OnLineReasonCode.mmObject();
			codeName = "CRCY";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("RNDM");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OnLineReasonCode";
				definition = "Reason to process an online authorisation.";
				code_lazy = () -> Arrays.asList(OnLineReasonCode.mmRandomSelection, OnLineReasonCode.mmICCForced, OnLineReasonCode.mmMerchantForced, OnLineReasonCode.mmTerminalForced, OnLineReasonCode.mmIssuerForced,
						OnLineReasonCode.mmFloorLimit, OnLineReasonCode.mmExceptionFile, OnLineReasonCode.mmTotalAmount, OnLineReasonCode.mmControlledBIN, OnLineReasonCode.mmUnknownBIN, OnLineReasonCode.mmControlledPAN,
						OnLineReasonCode.mmFlowControl, OnLineReasonCode.mmUnavailableCurrency);
			}
		});
		return mmObject_lazy.get();
	}
}