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
import com.tools20022.repository.codeset.TransactionStatusCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the processing status of an investment fund transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionStatusCode#Reversal
 * TransactionStatusCode.mmReversal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionStatusCode#Rebooked
 * TransactionStatusCode.mmRebooked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionStatusCode#Cancelled
 * TransactionStatusCode.mmCancelled}</li>
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
 * <li>"RVSL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TransactionStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the processing status of an investment fund transaction."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TransactionStatusCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Transaction has been reversed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionStatusCode
	 * TransactionStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RVSL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reversal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction has been reversed."</li>
	 * </ul>
	 */
	public static final TransactionStatusCode Reversal = new TransactionStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Reversal";
			definition = "Transaction has been reversed.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionStatusCode.mmObject();
			codeName = "RVSL";
		}
	};
	/**
	 * Transaction has been rebooked.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionStatusCode
	 * TransactionStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REBO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rebooked"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction has been rebooked."</li>
	 * </ul>
	 */
	public static final TransactionStatusCode Rebooked = new TransactionStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Rebooked";
			definition = "Transaction has been rebooked.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionStatusCode.mmObject();
			codeName = "REBO";
		}
	};
	/**
	 * Transaction has been cancelled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionStatusCode
	 * TransactionStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CANC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cancelled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction has been cancelled."</li>
	 * </ul>
	 */
	public static final TransactionStatusCode Cancelled = new TransactionStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Cancelled";
			definition = "Transaction has been cancelled.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionStatusCode.mmObject();
			codeName = "CANC";
		}
	};
	final static private LinkedHashMap<String, TransactionStatusCode> codesByName = new LinkedHashMap<>();

	protected TransactionStatusCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("RVSL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransactionStatusCode";
				definition = "Specifies the processing status of an investment fund transaction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TransactionStatusCode.Reversal, com.tools20022.repository.codeset.TransactionStatusCode.Rebooked,
						com.tools20022.repository.codeset.TransactionStatusCode.Cancelled);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Reversal.getCodeName().get(), Reversal);
		codesByName.put(Rebooked.getCodeName().get(), Rebooked);
		codesByName.put(Cancelled.getCodeName().get(), Cancelled);
	}

	public static TransactionStatusCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TransactionStatusCode[] values() {
		TransactionStatusCode[] values = new TransactionStatusCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TransactionStatusCode> {
		@Override
		public TransactionStatusCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TransactionStatusCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}