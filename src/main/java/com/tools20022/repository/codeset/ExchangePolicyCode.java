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
 * Exchange policy between parties.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExchangePolicyCode#mmOnDemand
 * ExchangePolicyCode.mmOnDemand}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExchangePolicyCode#mmImmediately
 * ExchangePolicyCode.mmImmediately}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExchangePolicyCode#mmAsSoonAsPossible
 * ExchangePolicyCode.mmAsSoonAsPossible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExchangePolicyCode#mmAsGroup
 * ExchangePolicyCode.mmAsGroup}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExchangePolicyCode#mmNumberLimit
 * ExchangePolicyCode.mmNumberLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExchangePolicyCode#mmTotalLimit
 * ExchangePolicyCode.mmTotalLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExchangePolicyCode#mmCyclic
 * ExchangePolicyCode.mmCyclic}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ExchangePolicyCode#mmNone
 * ExchangePolicyCode.mmNone}</li>
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
 * <li>"ONDM"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ExchangePolicyCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Exchange policy between parties."</li>
 * </ul>
 */
public class ExchangePolicyCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Exchange is performed if requested by the acquirer in a previous
	 * exchange, or at any time by the acceptor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExchangePolicyCode
	 * ExchangePolicyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ONDM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnDemand"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Exchange is performed if requested by the acquirer in a previous exchange, or at any time by the acceptor."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmOnDemand = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OnDemand";
			definition = "Exchange is performed if requested by the acquirer in a previous exchange, or at any time by the acceptor.";
			owner_lazy = () -> ExchangePolicyCode.mmObject();
			codeName = "ONDM";
		}
	};
	/**
	 * Exchange is performed just after the transaction completion.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExchangePolicyCode
	 * ExchangePolicyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IMMD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Immediately"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Exchange is performed just after the transaction completion."</li>
	 * </ul>
	 */
	public static final MMCode mmImmediately = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Immediately";
			definition = "Exchange is performed just after the transaction completion.";
			owner_lazy = () -> ExchangePolicyCode.mmObject();
			codeName = "IMMD";
		}
	};
	/**
	 * As soon as the acquirer is contacted, for example with the next on-line
	 * transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExchangePolicyCode
	 * ExchangePolicyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ASAP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AsSoonAsPossible"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "As soon as the acquirer is contacted, for example with the next on-line transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAsSoonAsPossible = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AsSoonAsPossible";
			definition = "As soon as the acquirer is contacted, for example with the next on-line transaction.";
			owner_lazy = () -> ExchangePolicyCode.mmObject();
			codeName = "ASAP";
		}
	};
	/**
	 * Exchanges are performed after reaching a maximum number of transaction or
	 * time period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExchangePolicyCode
	 * ExchangePolicyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AGRP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AsGroup"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Exchanges are performed after reaching a maximum number of transaction or time period."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAsGroup = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AsGroup";
			definition = "Exchanges are performed after reaching a maximum number of transaction or time period.";
			owner_lazy = () -> ExchangePolicyCode.mmObject();
			codeName = "AGRP";
		}
	};
	/**
	 * Exchange is performed after reaching a number of transactions without
	 * exchanges with the acquirer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExchangePolicyCode
	 * ExchangePolicyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NBLT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberLimit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Exchange is performed after reaching a number of transactions without exchanges with the acquirer."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmNumberLimit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NumberLimit";
			definition = "Exchange is performed after reaching a number of transactions without exchanges with the acquirer.";
			owner_lazy = () -> ExchangePolicyCode.mmObject();
			codeName = "NBLT";
		}
	};
	/**
	 * Exchange is performed after reaching a cumulative amount of transactions
	 * without exchanges with the acquirer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExchangePolicyCode
	 * ExchangePolicyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TTLT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalLimit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Exchange is performed after reaching a cumulative amount of transactions without exchanges with the acquirer."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmTotalLimit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TotalLimit";
			definition = "Exchange is performed after reaching a cumulative amount of transactions without exchanges with the acquirer.";
			owner_lazy = () -> ExchangePolicyCode.mmObject();
			codeName = "TTLT";
		}
	};
	/**
	 * Cyclic exchanges based on the related time conditions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExchangePolicyCode
	 * ExchangePolicyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CYCL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cyclic"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cyclic exchanges based on the related time conditions."</li>
	 * </ul>
	 */
	public static final MMCode mmCyclic = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Cyclic";
			definition = "Cyclic exchanges based on the related time conditions.";
			owner_lazy = () -> ExchangePolicyCode.mmObject();
			codeName = "CYCL";
		}
	};
	/**
	 * No exchange.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExchangePolicyCode
	 * ExchangePolicyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NONE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "None"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "No exchange."</li>
	 * </ul>
	 */
	public static final MMCode mmNone = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "None";
			definition = "No exchange.";
			owner_lazy = () -> ExchangePolicyCode.mmObject();
			codeName = "NONE";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("ONDM");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ExchangePolicyCode";
				definition = "Exchange policy between parties.";
				code_lazy = () -> Arrays.asList(ExchangePolicyCode.mmOnDemand, ExchangePolicyCode.mmImmediately, ExchangePolicyCode.mmAsSoonAsPossible, ExchangePolicyCode.mmAsGroup, ExchangePolicyCode.mmNumberLimit,
						ExchangePolicyCode.mmTotalLimit, ExchangePolicyCode.mmCyclic, ExchangePolicyCode.mmNone);
			}
		});
		return mmObject_lazy.get();
	}
}