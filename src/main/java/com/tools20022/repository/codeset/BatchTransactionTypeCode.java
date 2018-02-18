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
import com.tools20022.repository.codeset.BatchTransactionTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Type of transactions to include in a batch transfer.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BatchTransactionTypeCode#DebitCredit
 * BatchTransactionTypeCode.DebitCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BatchTransactionTypeCode#Cancellation
 * BatchTransactionTypeCode.Cancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BatchTransactionTypeCode#Failed
 * BatchTransactionTypeCode.Failed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BatchTransactionTypeCode#Declined
 * BatchTransactionTypeCode.Declined}</li>
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
 * <li>"DTCT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BatchTransactionTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type of transactions to include in a batch transfer."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class BatchTransactionTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Debit and credit transactions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BatchTransactionTypeCode
	 * BatchTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DTCT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebitCredit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Debit and credit transactions."</li>
	 * </ul>
	 */
	public static final BatchTransactionTypeCode DebitCredit = new BatchTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DebitCredit";
			definition = "Debit and credit transactions.";
			owner_lazy = () -> com.tools20022.repository.codeset.BatchTransactionTypeCode.mmObject();
			codeName = "DTCT";
		}
	};
	/**
	 * Cancellation of a previous transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BatchTransactionTypeCode
	 * BatchTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CNCL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cancellation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cancellation of a previous transaction."</li>
	 * </ul>
	 */
	public static final BatchTransactionTypeCode Cancellation = new BatchTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Cancellation";
			definition = "Cancellation of a previous transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.BatchTransactionTypeCode.mmObject();
			codeName = "CNCL";
		}
	};
	/**
	 * Failed transactions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BatchTransactionTypeCode
	 * BatchTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FAIL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Failed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Failed transactions."</li>
	 * </ul>
	 */
	public static final BatchTransactionTypeCode Failed = new BatchTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Failed";
			definition = "Failed transactions.";
			owner_lazy = () -> com.tools20022.repository.codeset.BatchTransactionTypeCode.mmObject();
			codeName = "FAIL";
		}
	};
	/**
	 * Declined transactions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BatchTransactionTypeCode
	 * BatchTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DCLN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Declined"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Declined transactions."</li>
	 * </ul>
	 */
	public static final BatchTransactionTypeCode Declined = new BatchTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Declined";
			definition = "Declined transactions.";
			owner_lazy = () -> com.tools20022.repository.codeset.BatchTransactionTypeCode.mmObject();
			codeName = "DCLN";
		}
	};
	final static private LinkedHashMap<String, BatchTransactionTypeCode> codesByName = new LinkedHashMap<>();

	protected BatchTransactionTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("DTCT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BatchTransactionTypeCode";
				definition = "Type of transactions to include in a batch transfer.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BatchTransactionTypeCode.DebitCredit, com.tools20022.repository.codeset.BatchTransactionTypeCode.Cancellation,
						com.tools20022.repository.codeset.BatchTransactionTypeCode.Failed, com.tools20022.repository.codeset.BatchTransactionTypeCode.Declined);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(DebitCredit.getCodeName().get(), DebitCredit);
		codesByName.put(Cancellation.getCodeName().get(), Cancellation);
		codesByName.put(Failed.getCodeName().get(), Failed);
		codesByName.put(Declined.getCodeName().get(), Declined);
	}

	public static BatchTransactionTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static BatchTransactionTypeCode[] values() {
		BatchTransactionTypeCode[] values = new BatchTransactionTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, BatchTransactionTypeCode> {
		@Override
		public BatchTransactionTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(BatchTransactionTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}