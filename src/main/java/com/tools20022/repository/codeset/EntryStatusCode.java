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
 * Specifies the status of an entry.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.EntryStatusCode#mmBooked
 * EntryStatusCode.mmBooked}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.EntryStatusCode#mmPending
 * EntryStatusCode.mmPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EntryStatusCode#mmInformation
 * EntryStatusCode.mmInformation}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.EntryStatusCode#mmFuture
 * EntryStatusCode.mmFuture}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.EntryStatus2Code
 * EntryStatus2Code}</li>
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
public class EntryStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Booked means that the transfer of money has been completed between
	 * account servicer and account owner
	 * 
	 * Usage : Status Booked does not necessarily imply finality of money as
	 * this depends on other factors such as the payment system used, the
	 * completion of the end-to-end transaction and the terms agreed between
	 * account servicer and owner. Status Booked is the only status that can be
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
	 * "Booked means that the transfer of money has been completed between account servicer and account owner\n\nUsage :   \nStatus Booked does not necessarily imply finality of money as this depends on other factors such as the payment system used, the completion of the end-to-end transaction and the terms agreed between account servicer and owner.\nStatus Booked is the only status that can be reversed."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmBooked = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Booked";
			definition = "Booked means that the transfer of money has been completed between account servicer and account owner\n\nUsage :   \nStatus Booked does not necessarily imply finality of money as this depends on other factors such as the payment system used, the completion of the end-to-end transaction and the terms agreed between account servicer and owner.\nStatus Booked is the only status that can be reversed.";
			owner_lazy = () -> EntryStatusCode.mmObject();
			codeName = "BOOK";
		}
	};
	/**
	 * Booking on the account owner's account in the account servicer's ledger
	 * has not been completed.
	 * 
	 * Usage : this can be used for expected items, or for items for which some
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
	 * "Booking on the account owner's account in the account servicer's ledger has not been completed.\n\nUsage : this can be used for expected items, or for items for which some conditions still need to be fulfilled before they can be booked. If booking takes place, the entry will be included with status Booked in subsequent account report or statement. Status Pending cannot be reversed."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPending = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Pending";
			definition = "Booking on the account owner's account in the account servicer's ledger has not been completed.\n\nUsage : this can be used for expected items, or for items for which some conditions still need to be fulfilled before they can be booked. If booking takes place, the entry will be included with status Booked in subsequent account report or statement. Status Pending cannot be reversed.";
			owner_lazy = () -> EntryStatusCode.mmObject();
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
	public static final MMCode mmInformation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Information";
			definition = "Entry is only provided for information, and no booking on the account owner's account in the account servicer's ledger has been performed.";
			owner_lazy = () -> EntryStatusCode.mmObject();
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
	public static final MMCode mmFuture = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Future";
			definition = "Entry is on the books of the account servicer and value will be applied to the account owner at a future date and time.";
			owner_lazy = () -> EntryStatusCode.mmObject();
			codeName = "FUTR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("BOOK");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "EntryStatusCode";
				definition = "Specifies the status of an entry.";
				code_lazy = () -> Arrays.asList(EntryStatusCode.mmBooked, EntryStatusCode.mmPending, EntryStatusCode.mmInformation, EntryStatusCode.mmFuture);
				derivation_lazy = () -> Arrays.asList(EntryStatus2Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}