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
import com.tools20022.repository.codeset.MandateReasonCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason for requesting the amendment or cancellation of a
 * mandate.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MandateReasonCode#IncorrectAgent
 * MandateReasonCode.mmIncorrectAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MandateReasonCode#IncorrectCurrency
 * MandateReasonCode.mmIncorrectCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MandateReasonCode#RequestedByCustomer
 * MandateReasonCode.mmRequestedByCustomer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MandateReasonCode#InsufficientDebtorDetails
 * MandateReasonCode.mmInsufficientDebtorDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MandateReasonCode#InsufficientCreditorDetails
 * MandateReasonCode.mmInsufficientCreditorDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MandateReasonCode#IncorrectAccount
 * MandateReasonCode.mmIncorrectAccount}</li>
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
 * <li>"AGNT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MandateReasonCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason for requesting the amendment or cancellation of a mandate."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class MandateReasonCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Agent details are incorrect or have changed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MandateReasonCode
	 * MandateReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AGNT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Agent details are incorrect or have changed."</li>
	 * </ul>
	 */
	public static final MandateReasonCode IncorrectAgent = new MandateReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectAgent";
			definition = "Agent details are incorrect or have changed.";
			owner_lazy = () -> com.tools20022.repository.codeset.MandateReasonCode.mmObject();
			codeName = "AGNT";
		}
	};
	/**
	 * Currency for the mandate is incorrect or has changed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MandateReasonCode
	 * MandateReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CURR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency for the mandate is incorrect or has changed."</li>
	 * </ul>
	 */
	public static final MandateReasonCode IncorrectCurrency = new MandateReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectCurrency";
			definition = "Currency for the mandate is incorrect or has changed.";
			owner_lazy = () -> com.tools20022.repository.codeset.MandateReasonCode.mmObject();
			codeName = "CURR";
		}
	};
	/**
	 * Customer requested the change.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MandateReasonCode
	 * MandateReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CUST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedByCustomer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Customer requested the change."</li>
	 * </ul>
	 */
	public static final MandateReasonCode RequestedByCustomer = new MandateReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedByCustomer";
			definition = "Customer requested the change.";
			owner_lazy = () -> com.tools20022.repository.codeset.MandateReasonCode.mmObject();
			codeName = "CUST";
		}
	};
	/**
	 * Insufficient or incoherent details about the debtor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MandateReasonCode
	 * MandateReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DBTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientDebtorDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Insufficient or incoherent details about the debtor."</li>
	 * </ul>
	 */
	public static final MandateReasonCode InsufficientDebtorDetails = new MandateReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientDebtorDetails";
			definition = "Insufficient or incoherent details about the debtor.";
			owner_lazy = () -> com.tools20022.repository.codeset.MandateReasonCode.mmObject();
			codeName = "DBTR";
		}
	};
	/**
	 * Insufficient or incoherent details about the creditor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MandateReasonCode
	 * MandateReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CDTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientCreditorDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Insufficient or incoherent details about the creditor."</li>
	 * </ul>
	 */
	public static final MandateReasonCode InsufficientCreditorDetails = new MandateReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientCreditorDetails";
			definition = "Insufficient or incoherent details about the creditor.";
			owner_lazy = () -> com.tools20022.repository.codeset.MandateReasonCode.mmObject();
			codeName = "CDTR";
		}
	};
	/**
	 * Account details are not correct.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MandateReasonCode
	 * MandateReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACCT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account details are not correct."</li>
	 * </ul>
	 */
	public static final MandateReasonCode IncorrectAccount = new MandateReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectAccount";
			definition = "Account details are not correct.";
			owner_lazy = () -> com.tools20022.repository.codeset.MandateReasonCode.mmObject();
			codeName = "ACCT";
		}
	};
	final static private LinkedHashMap<String, MandateReasonCode> codesByName = new LinkedHashMap<>();

	protected MandateReasonCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("AGNT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MandateReasonCode";
				definition = "Specifies the reason for requesting the amendment or cancellation of a mandate.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MandateReasonCode.IncorrectAgent, com.tools20022.repository.codeset.MandateReasonCode.IncorrectCurrency,
						com.tools20022.repository.codeset.MandateReasonCode.RequestedByCustomer, com.tools20022.repository.codeset.MandateReasonCode.InsufficientDebtorDetails,
						com.tools20022.repository.codeset.MandateReasonCode.InsufficientCreditorDetails, com.tools20022.repository.codeset.MandateReasonCode.IncorrectAccount);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(IncorrectAgent.getCodeName().get(), IncorrectAgent);
		codesByName.put(IncorrectCurrency.getCodeName().get(), IncorrectCurrency);
		codesByName.put(RequestedByCustomer.getCodeName().get(), RequestedByCustomer);
		codesByName.put(InsufficientDebtorDetails.getCodeName().get(), InsufficientDebtorDetails);
		codesByName.put(InsufficientCreditorDetails.getCodeName().get(), InsufficientCreditorDetails);
		codesByName.put(IncorrectAccount.getCodeName().get(), IncorrectAccount);
	}

	public static MandateReasonCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static MandateReasonCode[] values() {
		MandateReasonCode[] values = new MandateReasonCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, MandateReasonCode> {
		@Override
		public MandateReasonCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(MandateReasonCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}