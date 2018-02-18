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
import com.tools20022.repository.codeset.OnLineReasonCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Reason to process an online authorisation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OnLineReasonCode#RandomSelection
 * OnLineReasonCode.RandomSelection}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OnLineReasonCode#ICCForced
 * OnLineReasonCode.ICCForced}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OnLineReasonCode#MerchantForced
 * OnLineReasonCode.MerchantForced}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OnLineReasonCode#TerminalForced
 * OnLineReasonCode.TerminalForced}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OnLineReasonCode#IssuerForced
 * OnLineReasonCode.IssuerForced}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OnLineReasonCode#FloorLimit
 * OnLineReasonCode.FloorLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OnLineReasonCode#ExceptionFile
 * OnLineReasonCode.ExceptionFile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OnLineReasonCode#TotalAmount
 * OnLineReasonCode.TotalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OnLineReasonCode#ControlledBIN
 * OnLineReasonCode.ControlledBIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OnLineReasonCode#UnknownBIN
 * OnLineReasonCode.UnknownBIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OnLineReasonCode#ControlledPAN
 * OnLineReasonCode.ControlledPAN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OnLineReasonCode#FlowControl
 * OnLineReasonCode.FlowControl}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OnLineReasonCode#UnavailableCurrency
 * OnLineReasonCode.UnavailableCurrency}</li>
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
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class OnLineReasonCode extends MMCode {

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
	public static final OnLineReasonCode RandomSelection = new OnLineReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RandomSelection";
			definition = "Transaction random selection to go online.";
			owner_lazy = () -> com.tools20022.repository.codeset.OnLineReasonCode.mmObject();
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
	public static final OnLineReasonCode ICCForced = new OnLineReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ICCForced";
			definition = "Payment application in the Integrated Circuit Card forces to go on-line.";
			owner_lazy = () -> com.tools20022.repository.codeset.OnLineReasonCode.mmObject();
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
	public static final OnLineReasonCode MerchantForced = new OnLineReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MerchantForced";
			definition = "On line forced by card acceptor.";
			owner_lazy = () -> com.tools20022.repository.codeset.OnLineReasonCode.mmObject();
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
	public static final OnLineReasonCode TerminalForced = new OnLineReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TerminalForced";
			definition = "Terminal random selection to go online.";
			owner_lazy = () -> com.tools20022.repository.codeset.OnLineReasonCode.mmObject();
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
	public static final OnLineReasonCode IssuerForced = new OnLineReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IssuerForced";
			definition = "On line forced by card issuer.";
			owner_lazy = () -> com.tools20022.repository.codeset.OnLineReasonCode.mmObject();
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
	public static final OnLineReasonCode FloorLimit = new OnLineReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FloorLimit";
			definition = "Over floor limit.";
			owner_lazy = () -> com.tools20022.repository.codeset.OnLineReasonCode.mmObject();
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
	public static final OnLineReasonCode ExceptionFile = new OnLineReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExceptionFile";
			definition = "Card appears on terminal exception file.";
			owner_lazy = () -> com.tools20022.repository.codeset.OnLineReasonCode.mmObject();
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
	public static final OnLineReasonCode TotalAmount = new OnLineReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TotalAmount";
			definition = "Total amount of purchases per cardholder and per application above floor limit.";
			owner_lazy = () -> com.tools20022.repository.codeset.OnLineReasonCode.mmObject();
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
	public static final OnLineReasonCode ControlledBIN = new OnLineReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ControlledBIN";
			definition = "Bank Identification Number under control.";
			owner_lazy = () -> com.tools20022.repository.codeset.OnLineReasonCode.mmObject();
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
	public static final OnLineReasonCode UnknownBIN = new OnLineReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnknownBIN";
			definition = "Unknown Bank Identification Number.";
			owner_lazy = () -> com.tools20022.repository.codeset.OnLineReasonCode.mmObject();
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
	public static final OnLineReasonCode ControlledPAN = new OnLineReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ControlledPAN";
			definition = "Primary account number (card number) under control.";
			owner_lazy = () -> com.tools20022.repository.codeset.OnLineReasonCode.mmObject();
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
	public static final OnLineReasonCode FlowControl = new OnLineReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FlowControl";
			definition = "Flow control.";
			owner_lazy = () -> com.tools20022.repository.codeset.OnLineReasonCode.mmObject();
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
	public static final OnLineReasonCode UnavailableCurrency = new OnLineReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnavailableCurrency";
			definition = "Unknown currency code or foreign currency.";
			owner_lazy = () -> com.tools20022.repository.codeset.OnLineReasonCode.mmObject();
			codeName = "CRCY";
		}
	};
	final static private LinkedHashMap<String, OnLineReasonCode> codesByName = new LinkedHashMap<>();

	protected OnLineReasonCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("RNDM");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OnLineReasonCode";
				definition = "Reason to process an online authorisation.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OnLineReasonCode.RandomSelection, com.tools20022.repository.codeset.OnLineReasonCode.ICCForced,
						com.tools20022.repository.codeset.OnLineReasonCode.MerchantForced, com.tools20022.repository.codeset.OnLineReasonCode.TerminalForced, com.tools20022.repository.codeset.OnLineReasonCode.IssuerForced,
						com.tools20022.repository.codeset.OnLineReasonCode.FloorLimit, com.tools20022.repository.codeset.OnLineReasonCode.ExceptionFile, com.tools20022.repository.codeset.OnLineReasonCode.TotalAmount,
						com.tools20022.repository.codeset.OnLineReasonCode.ControlledBIN, com.tools20022.repository.codeset.OnLineReasonCode.UnknownBIN, com.tools20022.repository.codeset.OnLineReasonCode.ControlledPAN,
						com.tools20022.repository.codeset.OnLineReasonCode.FlowControl, com.tools20022.repository.codeset.OnLineReasonCode.UnavailableCurrency);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(RandomSelection.getCodeName().get(), RandomSelection);
		codesByName.put(ICCForced.getCodeName().get(), ICCForced);
		codesByName.put(MerchantForced.getCodeName().get(), MerchantForced);
		codesByName.put(TerminalForced.getCodeName().get(), TerminalForced);
		codesByName.put(IssuerForced.getCodeName().get(), IssuerForced);
		codesByName.put(FloorLimit.getCodeName().get(), FloorLimit);
		codesByName.put(ExceptionFile.getCodeName().get(), ExceptionFile);
		codesByName.put(TotalAmount.getCodeName().get(), TotalAmount);
		codesByName.put(ControlledBIN.getCodeName().get(), ControlledBIN);
		codesByName.put(UnknownBIN.getCodeName().get(), UnknownBIN);
		codesByName.put(ControlledPAN.getCodeName().get(), ControlledPAN);
		codesByName.put(FlowControl.getCodeName().get(), FlowControl);
		codesByName.put(UnavailableCurrency.getCodeName().get(), UnavailableCurrency);
	}

	public static OnLineReasonCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static OnLineReasonCode[] values() {
		OnLineReasonCode[] values = new OnLineReasonCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, OnLineReasonCode> {
		@Override
		public OnLineReasonCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(OnLineReasonCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}