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
import com.tools20022.repository.codeset.TransactionRequestTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of information request related to a transaction number.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionRequestTypeCode#OriginalReceipt
 * TransactionRequestTypeCode.OriginalReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionRequestTypeCode#DateTimeTransaction
 * TransactionRequestTypeCode.DateTimeTransaction}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionRequestType1Code
 * TransactionRequestType1Code}</li>
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
 * <li>"OREC"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TransactionRequestTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of information request related to a transaction number."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TransactionRequestTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Request is the original receipt.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionRequestTypeCode
	 * TransactionRequestTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OREC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalReceipt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Request is the original receipt."</li>
	 * </ul>
	 */
	public static final TransactionRequestTypeCode OriginalReceipt = new TransactionRequestTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalReceipt";
			definition = "Request is the original receipt.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionRequestTypeCode.mmObject();
			codeName = "OREC";
		}
	};
	/**
	 * Request is the date and time related to the original transaction numlber.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionRequestTypeCode
	 * TransactionRequestTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DTTX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateTimeTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Request is the date and time related to the original transaction numlber."
	 * </li>
	 * </ul>
	 */
	public static final TransactionRequestTypeCode DateTimeTransaction = new TransactionRequestTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateTimeTransaction";
			definition = "Request is the date and time related to the original transaction numlber.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionRequestTypeCode.mmObject();
			codeName = "DTTX";
		}
	};
	final static private LinkedHashMap<String, TransactionRequestTypeCode> codesByName = new LinkedHashMap<>();

	protected TransactionRequestTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("OREC");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransactionRequestTypeCode";
				definition = "Specifies the type of information request related to a transaction number.";
				derivation_lazy = () -> Arrays.asList(TransactionRequestType1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TransactionRequestTypeCode.OriginalReceipt, com.tools20022.repository.codeset.TransactionRequestTypeCode.DateTimeTransaction);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(OriginalReceipt.getCodeName().get(), OriginalReceipt);
		codesByName.put(DateTimeTransaction.getCodeName().get(), DateTimeTransaction);
	}

	public static TransactionRequestTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TransactionRequestTypeCode[] values() {
		TransactionRequestTypeCode[] values = new TransactionRequestTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TransactionRequestTypeCode> {
		@Override
		public TransactionRequestTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TransactionRequestTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}