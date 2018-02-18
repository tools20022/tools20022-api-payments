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
import com.tools20022.repository.codeset.BalanceStatusCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the balance of transactions with a certain status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.BalanceStatusCode#Pending
 * BalanceStatusCode.Pending}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BalanceStatusCode#Settled
 * BalanceStatusCode.Settled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceStatusCode#Suspended
 * BalanceStatusCode.Suspended}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceStatusCode#SettledUnregistered
 * BalanceStatusCode.SettledUnregistered}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceStatusCode#SettledRegistered
 * BalanceStatusCode.SettledRegistered}</li>
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
 * <li>"PDNG"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BalanceStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the balance of transactions with a certain status."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class BalanceStatusCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Balance corresponding to the pending transactions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceStatusCode
	 * BalanceStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PDNG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pending"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance corresponding to the pending transactions."</li>
	 * </ul>
	 */
	public static final BalanceStatusCode Pending = new BalanceStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Pending";
			definition = "Balance corresponding to the pending transactions.";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceStatusCode.mmObject();
			codeName = "PDNG";
		}
	};
	/**
	 * Final status of a transaction when the associated transfer of cash has
	 * been successfully processed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceStatusCode
	 * BalanceStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STLD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Settled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Final status of a transaction when the associated transfer of cash has been successfully processed."
	 * </li>
	 * </ul>
	 */
	public static final BalanceStatusCode Settled = new BalanceStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Settled";
			definition = "Final status of a transaction when the associated transfer of cash has been successfully processed.";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceStatusCode.mmObject();
			codeName = "STLD";
		}
	};
	/**
	 * Balance corresponding to transactions that have been executed, but not
	 * yet settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceStatusCode
	 * BalanceStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SUSP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Suspended"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance corresponding to transactions that have been executed, but not yet settled."
	 * </li>
	 * </ul>
	 */
	public static final BalanceStatusCode Suspended = new BalanceStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Suspended";
			definition = "Balance corresponding to transactions that have been executed, but not yet settled.";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceStatusCode.mmObject();
			codeName = "SUSP";
		}
	};
	/**
	 * Balance corresponding to transactions that have been executed and
	 * settled, but not yet fully registered on the books of the registrar.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceStatusCode
	 * BalanceStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SETU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettledUnregistered"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance corresponding to transactions that have been executed and settled, but not yet fully registered on the books of the registrar."
	 * </li>
	 * </ul>
	 */
	public static final BalanceStatusCode SettledUnregistered = new BalanceStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettledUnregistered";
			definition = "Balance corresponding to transactions that have been executed and settled, but not yet fully registered on the books of the registrar.";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceStatusCode.mmObject();
			codeName = "SETU";
		}
	};
	/**
	 * Balance corresponding to transactions that have been executed, settled
	 * and fully registered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceStatusCode
	 * BalanceStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SETR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettledRegistered"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance corresponding to transactions that have been executed, settled and fully registered."
	 * </li>
	 * </ul>
	 */
	public static final BalanceStatusCode SettledRegistered = new BalanceStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettledRegistered";
			definition = "Balance corresponding to transactions that have been executed, settled and fully registered.";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceStatusCode.mmObject();
			codeName = "SETR";
		}
	};
	final static private LinkedHashMap<String, BalanceStatusCode> codesByName = new LinkedHashMap<>();

	protected BalanceStatusCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("PDNG");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BalanceStatusCode";
				definition = "Specifies the balance of transactions with a certain status.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BalanceStatusCode.Pending, com.tools20022.repository.codeset.BalanceStatusCode.Settled, com.tools20022.repository.codeset.BalanceStatusCode.Suspended,
						com.tools20022.repository.codeset.BalanceStatusCode.SettledUnregistered, com.tools20022.repository.codeset.BalanceStatusCode.SettledRegistered);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Pending.getCodeName().get(), Pending);
		codesByName.put(Settled.getCodeName().get(), Settled);
		codesByName.put(Suspended.getCodeName().get(), Suspended);
		codesByName.put(SettledUnregistered.getCodeName().get(), SettledUnregistered);
		codesByName.put(SettledRegistered.getCodeName().get(), SettledRegistered);
	}

	public static BalanceStatusCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static BalanceStatusCode[] values() {
		BalanceStatusCode[] values = new BalanceStatusCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, BalanceStatusCode> {
		@Override
		public BalanceStatusCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(BalanceStatusCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}