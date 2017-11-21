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
 * Specifies the cash settlement system used.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashSettlementSystemCode#mmBankOfKoreaWire
 * CashSettlementSystemCode.mmBankOfKoreaWire}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashSettlementSystemCode#mmCheque
 * CashSettlementSystemCode.mmCheque}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashSettlementSystemCode#mmUKDomestic
 * CashSettlementSystemCode.mmUKDomestic}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashSettlementSystemCode#mmGrossSettlementSystem
 * CashSettlementSystemCode.mmGrossSettlementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashSettlementSystemCode#mmNetSettlementSystem
 * CashSettlementSystemCode.mmNetSettlementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashSettlementSystemCode#mmUSChips
 * CashSettlementSystemCode.mmUSChips}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashSettlementSystemCode#mmFedWireUS
 * CashSettlementSystemCode.mmFedWireUS}</li>
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
 * <li>"BOKW"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CashSettlementSystemCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the cash settlement system used."</li>
 * </ul>
 */
public class CashSettlementSystemCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Settle money through Bank of Korea Wire.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashSettlementSystemCode
	 * CashSettlementSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BOKW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankOfKoreaWire"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settle money through Bank of Korea Wire."</li>
	 * </ul>
	 */
	public static final MMCode mmBankOfKoreaWire = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankOfKoreaWire";
			definition = "Settle money through Bank of Korea Wire.";
			owner_lazy = () -> CashSettlementSystemCode.mmObject();
			codeName = "BOKW";
		}
	};
	/**
	 * Settle money through cheque.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashSettlementSystemCode
	 * CashSettlementSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CHEC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cheque"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settle money through cheque."</li>
	 * </ul>
	 */
	public static final MMCode mmCheque = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cheque";
			definition = "Settle money through cheque.";
			owner_lazy = () -> CashSettlementSystemCode.mmObject();
			codeName = "CHEC";
		}
	};
	/**
	 * Settle money through UK domestic.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashSettlementSystemCode
	 * CashSettlementSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GBSC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UKDomestic"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settle money through UK domestic."</li>
	 * </ul>
	 */
	public static final MMCode mmUKDomestic = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UKDomestic";
			definition = "Settle money through UK domestic.";
			owner_lazy = () -> CashSettlementSystemCode.mmObject();
			codeName = "GBSC";
		}
	};
	/**
	 * Settle money through gross settlement system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashSettlementSystemCode
	 * CashSettlementSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GROS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossSettlementSystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settle money through gross settlement system."</li>
	 * </ul>
	 */
	public static final MMCode mmGrossSettlementSystem = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossSettlementSystem";
			definition = "Settle money through gross settlement system.";
			owner_lazy = () -> CashSettlementSystemCode.mmObject();
			codeName = "GROS";
		}
	};
	/**
	 * Settle money through net settlement system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashSettlementSystemCode
	 * CashSettlementSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NETS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetSettlementSystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settle money through net settlement system."</li>
	 * </ul>
	 */
	public static final MMCode mmNetSettlementSystem = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetSettlementSystem";
			definition = "Settle money through net settlement system.";
			owner_lazy = () -> CashSettlementSystemCode.mmObject();
			codeName = "NETS";
		}
	};
	/**
	 * Settle money through CHIPS (US).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashSettlementSystemCode
	 * CashSettlementSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "USCH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USChips"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settle money through CHIPS (US)."</li>
	 * </ul>
	 */
	public static final MMCode mmUSChips = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USChips";
			definition = "Settle money through CHIPS (US).";
			owner_lazy = () -> CashSettlementSystemCode.mmObject();
			codeName = "USCH";
		}
	};
	/**
	 * Settle money through Fedwire (US).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashSettlementSystemCode
	 * CashSettlementSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "USFW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FedWireUS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settle money through Fedwire (US)."</li>
	 * </ul>
	 */
	public static final MMCode mmFedWireUS = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FedWireUS";
			definition = "Settle money through Fedwire (US).";
			owner_lazy = () -> CashSettlementSystemCode.mmObject();
			codeName = "USFW";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("BOKW");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CashSettlementSystemCode";
				definition = "Specifies the cash settlement system used.";
				code_lazy = () -> Arrays.asList(CashSettlementSystemCode.mmBankOfKoreaWire, CashSettlementSystemCode.mmCheque, CashSettlementSystemCode.mmUKDomestic, CashSettlementSystemCode.mmGrossSettlementSystem,
						CashSettlementSystemCode.mmNetSettlementSystem, CashSettlementSystemCode.mmUSChips, CashSettlementSystemCode.mmFedWireUS);
			}
		});
		return mmObject_lazy.get();
	}
}