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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Description of the parameters under which an order must be handled on the
 * floor.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingFloorOrderHandlingCode#AutomatedPrivate
 * TradingFloorOrderHandlingCode.AutomatedPrivate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingFloorOrderHandlingCode#AutomatedPublic
 * TradingFloorOrderHandlingCode.AutomatedPublic}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingFloorOrderHandlingCode#Manual
 * TradingFloorOrderHandlingCode.Manual}</li>
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
 * <li>"ATPR"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradingFloorOrderHandlingCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Description of the parameters under which an order must be handled on the floor."
 * </li>
 * </ul>
 */
public class TradingFloorOrderHandlingCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates that the order should be executed automatically, private
	 * initiative, no broker intervention. Its sales trading desk will not be
	 * informed of the order and trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingFloorOrderHandlingCode
	 * TradingFloorOrderHandlingCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ATPR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AutomatedPrivate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the order should be executed automatically, private initiative, no broker intervention. Its sales trading desk will not be informed of the order and trade."
	 * </li>
	 * </ul>
	 */
	public static final MMCode AutomatedPrivate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AutomatedPrivate";
			definition = "Indicates that the order should be executed automatically, private initiative, no broker intervention. Its sales trading desk will not be informed of the order and trade.";
			owner_lazy = () -> TradingFloorOrderHandlingCode.mmObject();
			codeName = "ATPR";
		}
	};
	/**
	 * Indicates that the order should be executed automatically, public
	 * initiative, broker intervention allowed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingFloorOrderHandlingCode
	 * TradingFloorOrderHandlingCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ATPU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AutomatedPublic"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the order should be executed automatically, public initiative, broker intervention allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMCode AutomatedPublic = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AutomatedPublic";
			definition = "Indicates that the order should be executed automatically, public initiative, broker intervention allowed.";
			owner_lazy = () -> TradingFloorOrderHandlingCode.mmObject();
			codeName = "ATPU";
		}
	};
	/**
	 * Manual order, best execution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingFloorOrderHandlingCode
	 * TradingFloorOrderHandlingCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MANU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Manual"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Manual order, best execution."</li>
	 * </ul>
	 */
	public static final MMCode Manual = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Manual";
			definition = "Manual order, best execution.";
			owner_lazy = () -> TradingFloorOrderHandlingCode.mmObject();
			codeName = "MANU";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("ATPR");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TradingFloorOrderHandlingCode";
				definition = "Description of the parameters under which an order must be handled on the floor.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TradingFloorOrderHandlingCode.AutomatedPrivate, com.tools20022.repository.codeset.TradingFloorOrderHandlingCode.AutomatedPublic,
						com.tools20022.repository.codeset.TradingFloorOrderHandlingCode.Manual);
			}
		});
		return mmObject_lazy.get();
	}
}