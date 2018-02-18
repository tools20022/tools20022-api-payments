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
import com.tools20022.repository.codeset.UndertakingStatusCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the undertaking status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UndertakingStatusCode#AcceptedTechnicalValidation
 * UndertakingStatusCode.AcceptedTechnicalValidation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UndertakingStatusCode#Accepted
 * UndertakingStatusCode.Accepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UndertakingStatusCode#Pending
 * UndertakingStatusCode.Pending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UndertakingStatusCode#Received
 * UndertakingStatusCode.Received}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UndertakingStatusCode#Rejected
 * UndertakingStatusCode.Rejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UndertakingStatusCode#NonConfirmation
 * UndertakingStatusCode.NonConfirmation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UndertakingStatusCode#Withdrawn
 * UndertakingStatusCode.Withdrawn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UndertakingStatusCode#UndertakingAmountChange
 * UndertakingStatusCode.UndertakingAmountChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UndertakingStatusCode#CounterUndertakingAmountChange
 * UndertakingStatusCode.CounterUndertakingAmountChange}</li>
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
 * <li>"ACTC"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UndertakingStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the undertaking status."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class UndertakingStatusCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Accepted in accordance with technical validation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UndertakingStatusCode
	 * UndertakingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACTC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptedTechnicalValidation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Accepted in accordance with technical validation."</li>
	 * </ul>
	 */
	public static final UndertakingStatusCode AcceptedTechnicalValidation = new UndertakingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptedTechnicalValidation";
			definition = "Accepted in accordance with technical validation.";
			owner_lazy = () -> com.tools20022.repository.codeset.UndertakingStatusCode.mmObject();
			codeName = "ACTC";
		}
	};
	/**
	 * Accepted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UndertakingStatusCode
	 * UndertakingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACCP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Accepted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Accepted."</li>
	 * </ul>
	 */
	public static final UndertakingStatusCode Accepted = new UndertakingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Accepted";
			definition = "Accepted.";
			owner_lazy = () -> com.tools20022.repository.codeset.UndertakingStatusCode.mmObject();
			codeName = "ACCP";
		}
	};
	/**
	 * Pending further processing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UndertakingStatusCode
	 * UndertakingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PEND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pending"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Pending further processing."</li>
	 * </ul>
	 */
	public static final UndertakingStatusCode Pending = new UndertakingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pending";
			definition = "Pending further processing.";
			owner_lazy = () -> com.tools20022.repository.codeset.UndertakingStatusCode.mmObject();
			codeName = "PEND";
		}
	};
	/**
	 * Received.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UndertakingStatusCode
	 * UndertakingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RCVD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Received"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Received."</li>
	 * </ul>
	 */
	public static final UndertakingStatusCode Received = new UndertakingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Received";
			definition = "Received.";
			owner_lazy = () -> com.tools20022.repository.codeset.UndertakingStatusCode.mmObject();
			codeName = "RCVD";
		}
	};
	/**
	 * Rejected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UndertakingStatusCode
	 * UndertakingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REJT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rejected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rejected."</li>
	 * </ul>
	 */
	public static final UndertakingStatusCode Rejected = new UndertakingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			definition = "Rejected.";
			owner_lazy = () -> com.tools20022.repository.codeset.UndertakingStatusCode.mmObject();
			codeName = "REJT";
		}
	};
	/**
	 * Undertaking not confirmed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UndertakingStatusCode
	 * UndertakingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NCON"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonConfirmation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Undertaking not confirmed."</li>
	 * </ul>
	 */
	public static final UndertakingStatusCode NonConfirmation = new UndertakingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonConfirmation";
			definition = "Undertaking not confirmed.";
			owner_lazy = () -> com.tools20022.repository.codeset.UndertakingStatusCode.mmObject();
			codeName = "NCON";
		}
	};
	/**
	 * Demand has been withdrawn.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UndertakingStatusCode
	 * UndertakingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WTHD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Withdrawn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Demand has been withdrawn."</li>
	 * </ul>
	 */
	public static final UndertakingStatusCode Withdrawn = new UndertakingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Withdrawn";
			definition = "Demand has been withdrawn.";
			owner_lazy = () -> com.tools20022.repository.codeset.UndertakingStatusCode.mmObject();
			codeName = "WTHD";
		}
	};
	/**
	 * Change to undertaking amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UndertakingStatusCode
	 * UndertakingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AMTU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UndertakingAmountChange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Change to undertaking amount."</li>
	 * </ul>
	 */
	public static final UndertakingStatusCode UndertakingAmountChange = new UndertakingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UndertakingAmountChange";
			definition = "Change to undertaking amount.";
			owner_lazy = () -> com.tools20022.repository.codeset.UndertakingStatusCode.mmObject();
			codeName = "AMTU";
		}
	};
	/**
	 * Change to counter-undertaking amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UndertakingStatusCode
	 * UndertakingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AMTC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterUndertakingAmountChange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Change to counter-undertaking amount."</li>
	 * </ul>
	 */
	public static final UndertakingStatusCode CounterUndertakingAmountChange = new UndertakingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterUndertakingAmountChange";
			definition = "Change to counter-undertaking amount.";
			owner_lazy = () -> com.tools20022.repository.codeset.UndertakingStatusCode.mmObject();
			codeName = "AMTC";
		}
	};
	final static private LinkedHashMap<String, UndertakingStatusCode> codesByName = new LinkedHashMap<>();

	protected UndertakingStatusCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ACTC");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UndertakingStatusCode";
				definition = "Specifies the undertaking status.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.UndertakingStatusCode.AcceptedTechnicalValidation, com.tools20022.repository.codeset.UndertakingStatusCode.Accepted,
						com.tools20022.repository.codeset.UndertakingStatusCode.Pending, com.tools20022.repository.codeset.UndertakingStatusCode.Received, com.tools20022.repository.codeset.UndertakingStatusCode.Rejected,
						com.tools20022.repository.codeset.UndertakingStatusCode.NonConfirmation, com.tools20022.repository.codeset.UndertakingStatusCode.Withdrawn,
						com.tools20022.repository.codeset.UndertakingStatusCode.UndertakingAmountChange, com.tools20022.repository.codeset.UndertakingStatusCode.CounterUndertakingAmountChange);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AcceptedTechnicalValidation.getCodeName().get(), AcceptedTechnicalValidation);
		codesByName.put(Accepted.getCodeName().get(), Accepted);
		codesByName.put(Pending.getCodeName().get(), Pending);
		codesByName.put(Received.getCodeName().get(), Received);
		codesByName.put(Rejected.getCodeName().get(), Rejected);
		codesByName.put(NonConfirmation.getCodeName().get(), NonConfirmation);
		codesByName.put(Withdrawn.getCodeName().get(), Withdrawn);
		codesByName.put(UndertakingAmountChange.getCodeName().get(), UndertakingAmountChange);
		codesByName.put(CounterUndertakingAmountChange.getCodeName().get(), CounterUndertakingAmountChange);
	}

	public static UndertakingStatusCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static UndertakingStatusCode[] values() {
		UndertakingStatusCode[] values = new UndertakingStatusCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, UndertakingStatusCode> {
		@Override
		public UndertakingStatusCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(UndertakingStatusCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}