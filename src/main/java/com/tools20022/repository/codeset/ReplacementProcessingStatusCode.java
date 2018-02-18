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
import com.tools20022.repository.codeset.ReplacementProcessingStatusCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the processing status of the replacement request.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReplacementProcessingStatusCode#Denied
 * ReplacementProcessingStatusCode.Denied}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReplacementProcessingStatusCode#ReceivedAtStockExchange
 * ReplacementProcessingStatusCode.ReceivedAtStockExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReplacementProcessingStatusCode#ReceivedAtIntermediary
 * ReplacementProcessingStatusCode.ReceivedAtIntermediary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReplacementProcessingStatusCode#Accepted
 * ReplacementProcessingStatusCode.Accepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReplacementProcessingStatusCode#PartialReplacementAccepted
 * ReplacementProcessingStatusCode.PartialReplacementAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReplacementProcessingStatusCode#Pending
 * ReplacementProcessingStatusCode.Pending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReplacementProcessingStatusCode#Rejected
 * ReplacementProcessingStatusCode.Rejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReplacementProcessingStatusCode#Completed
 * ReplacementProcessingStatusCode.Completed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReplacementProcessingStatusCode#InRepair
 * ReplacementProcessingStatusCode.InRepair}</li>
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
 * <li>"DEND"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ReplacementProcessingStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the processing status of the replacement request."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ReplacementProcessingStatusCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Replacement request cannot be executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReplacementProcessingStatusCode
	 * ReplacementProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DEND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Denied"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Replacement request cannot be executed."</li>
	 * </ul>
	 */
	public static final ReplacementProcessingStatusCode Denied = new ReplacementProcessingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Denied";
			definition = "Replacement request cannot be executed.";
			owner_lazy = () -> com.tools20022.repository.codeset.ReplacementProcessingStatusCode.mmObject();
			codeName = "DEND";
		}
	};
	/**
	 * Replacement request previously received from you has been received at the
	 * stock exchange.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReplacementProcessingStatusCode
	 * ReplacementProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXCH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivedAtStockExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Replacement request previously received from you has been received at the stock exchange."
	 * </li>
	 * </ul>
	 */
	public static final ReplacementProcessingStatusCode ReceivedAtStockExchange = new ReplacementProcessingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivedAtStockExchange";
			definition = "Replacement request previously received from you has been received at the stock exchange.";
			owner_lazy = () -> com.tools20022.repository.codeset.ReplacementProcessingStatusCode.mmObject();
			codeName = "EXCH";
		}
	};
	/**
	 * Replacement request previously received from you has been received at
	 * intermediary (if not stock exchange).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReplacementProcessingStatusCode
	 * ReplacementProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INTE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivedAtIntermediary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Replacement request previously received from you has been received at intermediary (if not stock exchange)."
	 * </li>
	 * </ul>
	 */
	public static final ReplacementProcessingStatusCode ReceivedAtIntermediary = new ReplacementProcessingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivedAtIntermediary";
			definition = "Replacement request previously received from you has been received at intermediary (if not stock exchange).";
			owner_lazy = () -> com.tools20022.repository.codeset.ReplacementProcessingStatusCode.mmObject();
			codeName = "INTE";
		}
	};
	/**
	 * Replacement request has been accepted for further processing by the
	 * account servicer (technical receipt).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReplacementProcessingStatusCode
	 * ReplacementProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PACK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Accepted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Replacement request has been accepted for further processing by the account servicer (technical receipt)."
	 * </li>
	 * </ul>
	 */
	public static final ReplacementProcessingStatusCode Accepted = new ReplacementProcessingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Accepted";
			definition = "Replacement request has been accepted for further processing by the account servicer (technical receipt).";
			owner_lazy = () -> com.tools20022.repository.codeset.ReplacementProcessingStatusCode.mmObject();
			codeName = "PACK";
		}
	};
	/**
	 * Order is partially filled, replacement processing accepted for the
	 * remaining.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReplacementProcessingStatusCode
	 * ReplacementProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PART"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialReplacementAccepted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Order is partially filled, replacement processing accepted for the remaining."
	 * </li>
	 * </ul>
	 */
	public static final ReplacementProcessingStatusCode PartialReplacementAccepted = new ReplacementProcessingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialReplacementAccepted";
			definition = "Order is partially filled, replacement processing accepted for the remaining.";
			owner_lazy = () -> com.tools20022.repository.codeset.ReplacementProcessingStatusCode.mmObject();
			codeName = "PART";
		}
	};
	/**
	 * Replacement request is pending.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReplacementProcessingStatusCode
	 * ReplacementProcessingStatusCode}</li>
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
	 * definition} = "Replacement request is pending."</li>
	 * </ul>
	 */
	public static final ReplacementProcessingStatusCode Pending = new ReplacementProcessingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pending";
			definition = "Replacement request is pending.";
			owner_lazy = () -> com.tools20022.repository.codeset.ReplacementProcessingStatusCode.mmObject();
			codeName = "PEND";
		}
	};
	/**
	 * Replacement request has been rejected for further processing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReplacementProcessingStatusCode
	 * ReplacementProcessingStatusCode}</li>
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
	 * definition} =
	 * "Replacement request has been rejected for further processing."</li>
	 * </ul>
	 */
	public static final ReplacementProcessingStatusCode Rejected = new ReplacementProcessingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			definition = "Replacement request has been rejected for further processing.";
			owner_lazy = () -> com.tools20022.repository.codeset.ReplacementProcessingStatusCode.mmObject();
			codeName = "REJT";
		}
	};
	/**
	 * Replacement request has been completed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReplacementProcessingStatusCode
	 * ReplacementProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REPL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Completed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Replacement request has been completed."</li>
	 * </ul>
	 */
	public static final ReplacementProcessingStatusCode Completed = new ReplacementProcessingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Completed";
			definition = "Replacement request has been completed.";
			owner_lazy = () -> com.tools20022.repository.codeset.ReplacementProcessingStatusCode.mmObject();
			codeName = "REPL";
		}
	};
	/**
	 * Replacement request previously received from you is in repair.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReplacementProcessingStatusCode
	 * ReplacementProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REPR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InRepair"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Replacement request previously received from you is in repair."</li>
	 * </ul>
	 */
	public static final ReplacementProcessingStatusCode InRepair = new ReplacementProcessingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InRepair";
			definition = "Replacement request previously received from you is in repair.";
			owner_lazy = () -> com.tools20022.repository.codeset.ReplacementProcessingStatusCode.mmObject();
			codeName = "REPR";
		}
	};
	final static private LinkedHashMap<String, ReplacementProcessingStatusCode> codesByName = new LinkedHashMap<>();

	protected ReplacementProcessingStatusCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("DEND");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ReplacementProcessingStatusCode";
				definition = "Specifies the processing status of the replacement request.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ReplacementProcessingStatusCode.Denied, com.tools20022.repository.codeset.ReplacementProcessingStatusCode.ReceivedAtStockExchange,
						com.tools20022.repository.codeset.ReplacementProcessingStatusCode.ReceivedAtIntermediary, com.tools20022.repository.codeset.ReplacementProcessingStatusCode.Accepted,
						com.tools20022.repository.codeset.ReplacementProcessingStatusCode.PartialReplacementAccepted, com.tools20022.repository.codeset.ReplacementProcessingStatusCode.Pending,
						com.tools20022.repository.codeset.ReplacementProcessingStatusCode.Rejected, com.tools20022.repository.codeset.ReplacementProcessingStatusCode.Completed,
						com.tools20022.repository.codeset.ReplacementProcessingStatusCode.InRepair);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Denied.getCodeName().get(), Denied);
		codesByName.put(ReceivedAtStockExchange.getCodeName().get(), ReceivedAtStockExchange);
		codesByName.put(ReceivedAtIntermediary.getCodeName().get(), ReceivedAtIntermediary);
		codesByName.put(Accepted.getCodeName().get(), Accepted);
		codesByName.put(PartialReplacementAccepted.getCodeName().get(), PartialReplacementAccepted);
		codesByName.put(Pending.getCodeName().get(), Pending);
		codesByName.put(Rejected.getCodeName().get(), Rejected);
		codesByName.put(Completed.getCodeName().get(), Completed);
		codesByName.put(InRepair.getCodeName().get(), InRepair);
	}

	public static ReplacementProcessingStatusCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ReplacementProcessingStatusCode[] values() {
		ReplacementProcessingStatusCode[] values = new ReplacementProcessingStatusCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ReplacementProcessingStatusCode> {
		@Override
		public ReplacementProcessingStatusCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ReplacementProcessingStatusCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}