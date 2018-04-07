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
import com.tools20022.repository.codeset.EntryStatusCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the status of an entry.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.EntryStatusCode#Booked
 * EntryStatusCode.Booked}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.EntryStatusCode#Pending
 * EntryStatusCode.Pending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EntryStatusCode#Information
 * EntryStatusCode.Information}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.EntryStatusCode#Future
 * EntryStatusCode.Future}</li>
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
 * <li>"BOOK"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "EntryStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the status of an entry."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class EntryStatusCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Booked means that the transfer of money has been completed between
	 * account servicer and account owner
	 * 
	 * Usage: Status Booked does not necessarily imply finality of money as this
	 * depends on other factors such as the payment system used, the completion
	 * of the end-to-end transaction and the terms agreed between account
	 * servicer and owner. Status Booked is the only status that can be
	 * reversed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EntryStatusCode
	 * EntryStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BOOK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Booked"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Booked means that the transfer of money has been completed between account servicer and account owner\n\nUsage: \nStatus Booked does not necessarily imply finality of money as this depends on other factors such as the payment system used, the completion of the end-to-end transaction and the terms agreed between account servicer and owner.\nStatus Booked is the only status that can be reversed."
	 * </li>
	 * </ul>
	 */
	public static final EntryStatusCode Booked = new EntryStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Booked";
			definition = "Booked means that the transfer of money has been completed between account servicer and account owner\n\nUsage: \nStatus Booked does not necessarily imply finality of money as this depends on other factors such as the payment system used, the completion of the end-to-end transaction and the terms agreed between account servicer and owner.\nStatus Booked is the only status that can be reversed.";
			owner_lazy = () -> com.tools20022.repository.codeset.EntryStatusCode.mmObject();
			codeName = "BOOK";
		}
	};
	/**
	 * Booking on the account owner's account in the account servicer's ledger
	 * has not been completed.
	 * 
	 * Usage: this can be used for expected items, or for items for which some
	 * conditions still need to be fulfilled before they can be booked. If
	 * booking takes place, the entry will be included with status Booked in
	 * subsequent account report or statement. Status Pending cannot be
	 * reversed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EntryStatusCode
	 * EntryStatusCode}</li>
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
	 * definition} =
	 * "Booking on the account owner's account in the account servicer's ledger has not been completed.\n\nUsage: this can be used for expected items, or for items for which some conditions still need to be fulfilled before they can be booked. If booking takes place, the entry will be included with status Booked in subsequent account report or statement. Status Pending cannot be reversed."
	 * </li>
	 * </ul>
	 */
	public static final EntryStatusCode Pending = new EntryStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Pending";
			definition = "Booking on the account owner's account in the account servicer's ledger has not been completed.\n\nUsage: this can be used for expected items, or for items for which some conditions still need to be fulfilled before they can be booked. If booking takes place, the entry will be included with status Booked in subsequent account report or statement. Status Pending cannot be reversed.";
			owner_lazy = () -> com.tools20022.repository.codeset.EntryStatusCode.mmObject();
			codeName = "PDNG";
		}
	};
	/**
	 * Entry is only provided for information, and no booking on the account
	 * owner's account in the account servicer's ledger has been performed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EntryStatusCode
	 * EntryStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INFO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Information"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Entry is only provided for information, and no booking on the account owner's account in the account servicer's ledger has been performed."
	 * </li>
	 * </ul>
	 */
	public static final EntryStatusCode Information = new EntryStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Information";
			definition = "Entry is only provided for information, and no booking on the account owner's account in the account servicer's ledger has been performed.";
			owner_lazy = () -> com.tools20022.repository.codeset.EntryStatusCode.mmObject();
			codeName = "INFO";
		}
	};
	/**
	 * Entry is on the books of the account servicer and value will be applied
	 * to the account owner at a future date and time.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EntryStatusCode
	 * EntryStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FUTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Future"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Entry is on the books of the account servicer and value will be applied to the account owner at a future date and time."
	 * </li>
	 * </ul>
	 */
	public static final EntryStatusCode Future = new EntryStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Future";
			definition = "Entry is on the books of the account servicer and value will be applied to the account owner at a future date and time.";
			owner_lazy = () -> com.tools20022.repository.codeset.EntryStatusCode.mmObject();
			codeName = "FUTR";
		}
	};
	final static private LinkedHashMap<String, EntryStatusCode> codesByName = new LinkedHashMap<>();

	protected EntryStatusCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("BOOK");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "EntryStatusCode";
				definition = "Specifies the status of an entry.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.EntryStatusCode.Booked, com.tools20022.repository.codeset.EntryStatusCode.Pending, com.tools20022.repository.codeset.EntryStatusCode.Information,
						com.tools20022.repository.codeset.EntryStatusCode.Future);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Booked.getCodeName().get(), Booked);
		codesByName.put(Pending.getCodeName().get(), Pending);
		codesByName.put(Information.getCodeName().get(), Information);
		codesByName.put(Future.getCodeName().get(), Future);
	}

	public static EntryStatusCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static EntryStatusCode[] values() {
		EntryStatusCode[] values = new EntryStatusCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, EntryStatusCode> {
		@Override
		public EntryStatusCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(EntryStatusCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}