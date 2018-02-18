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
import com.tools20022.repository.codeset.SettlementStandingInstructionDatabaseCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates what settlement standing instruction database is to be used to
 * derive the settlement parties involved in the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementStandingInstructionDatabaseCode#InternalDatabase
 * SettlementStandingInstructionDatabaseCode.InternalDatabase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementStandingInstructionDatabaseCode#BrokerDatabase
 * SettlementStandingInstructionDatabaseCode.BrokerDatabase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementStandingInstructionDatabaseCode#VendorDatabase
 * SettlementStandingInstructionDatabaseCode.VendorDatabase}</li>
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
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SettlementStandingInstructionDatabaseCode extends MMCode {

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
	public static final SettlementStandingInstructionDatabaseCode InternalDatabase = new SettlementStandingInstructionDatabaseCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InternalDatabase";
			definition = "The settlement standing instruction database to be used is the receiver's internal database.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementStandingInstructionDatabaseCode.mmObject();
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
	public static final SettlementStandingInstructionDatabaseCode BrokerDatabase = new SettlementStandingInstructionDatabaseCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BrokerDatabase";
			definition = "The settlement standing instruction database to be used is the broker's database.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementStandingInstructionDatabaseCode.mmObject();
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
	public static final SettlementStandingInstructionDatabaseCode VendorDatabase = new SettlementStandingInstructionDatabaseCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VendorDatabase";
			definition = "The settlement standing instruction database to be used is the database of the vendor.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementStandingInstructionDatabaseCode.mmObject();
			codeName = "VEND";
		}
	};
	final static private LinkedHashMap<String, SettlementStandingInstructionDatabaseCode> codesByName = new LinkedHashMap<>();

	protected SettlementStandingInstructionDatabaseCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("INTE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SettlementStandingInstructionDatabaseCode";
				definition = "Indicates what settlement standing instruction database is to be used to derive the settlement parties involved in the transaction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SettlementStandingInstructionDatabaseCode.InternalDatabase, com.tools20022.repository.codeset.SettlementStandingInstructionDatabaseCode.BrokerDatabase,
						com.tools20022.repository.codeset.SettlementStandingInstructionDatabaseCode.VendorDatabase);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(InternalDatabase.getCodeName().get(), InternalDatabase);
		codesByName.put(BrokerDatabase.getCodeName().get(), BrokerDatabase);
		codesByName.put(VendorDatabase.getCodeName().get(), VendorDatabase);
	}

	public static SettlementStandingInstructionDatabaseCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SettlementStandingInstructionDatabaseCode[] values() {
		SettlementStandingInstructionDatabaseCode[] values = new SettlementStandingInstructionDatabaseCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SettlementStandingInstructionDatabaseCode> {
		@Override
		public SettlementStandingInstructionDatabaseCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SettlementStandingInstructionDatabaseCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}