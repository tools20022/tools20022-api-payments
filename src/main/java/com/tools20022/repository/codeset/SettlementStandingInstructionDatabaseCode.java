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
 * Indicates what settlement standing instruction database is to be used to
 * derive the settlement parties involved in the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementStandingInstructionDatabaseCode#mmInternalDatabase
 * SettlementStandingInstructionDatabaseCode.mmInternalDatabase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementStandingInstructionDatabaseCode#mmBrokerDatabase
 * SettlementStandingInstructionDatabaseCode.mmBrokerDatabase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementStandingInstructionDatabaseCode#mmVendorDatabase
 * SettlementStandingInstructionDatabaseCode.mmVendorDatabase}</li>
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
 * <li>"INTE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SettlementStandingInstructionDatabaseCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates what settlement standing instruction database is to be used to derive the settlement parties involved in the transaction."
 * </li>
 * </ul>
 */
public class SettlementStandingInstructionDatabaseCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * The settlement standing instruction database to be used is the receiver's
	 * internal database.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementStandingInstructionDatabaseCode
	 * SettlementStandingInstructionDatabaseCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INTE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InternalDatabase"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The settlement standing instruction database to be used is the receiver's internal database."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInternalDatabase = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InternalDatabase";
			definition = "The settlement standing instruction database to be used is the receiver's internal database.";
			owner_lazy = () -> SettlementStandingInstructionDatabaseCode.mmObject();
			codeName = "INTE";
		}
	};
	/**
	 * The settlement standing instruction database to be used is the broker's
	 * database.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementStandingInstructionDatabaseCode
	 * SettlementStandingInstructionDatabaseCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BRKR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BrokerDatabase"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The settlement standing instruction database to be used is the broker's database."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmBrokerDatabase = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BrokerDatabase";
			definition = "The settlement standing instruction database to be used is the broker's database.";
			owner_lazy = () -> SettlementStandingInstructionDatabaseCode.mmObject();
			codeName = "BRKR";
		}
	};
	/**
	 * The settlement standing instruction database to be used is the database
	 * of the vendor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementStandingInstructionDatabaseCode
	 * SettlementStandingInstructionDatabaseCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VEND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VendorDatabase"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The settlement standing instruction database to be used is the database of the vendor."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmVendorDatabase = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VendorDatabase";
			definition = "The settlement standing instruction database to be used is the database of the vendor.";
			owner_lazy = () -> SettlementStandingInstructionDatabaseCode.mmObject();
			codeName = "VEND";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("INTE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SettlementStandingInstructionDatabaseCode";
				definition = "Indicates what settlement standing instruction database is to be used to derive the settlement parties involved in the transaction.";
				code_lazy = () -> Arrays.asList(SettlementStandingInstructionDatabaseCode.mmInternalDatabase, SettlementStandingInstructionDatabaseCode.mmBrokerDatabase, SettlementStandingInstructionDatabaseCode.mmVendorDatabase);
			}
		});
		return mmObject_lazy.get();
	}
}