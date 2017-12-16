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
import com.tools20022.repository.codeset.ExchangePolicyCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Exchange policy between parties.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExchangePolicyCode#OnDemand
 * ExchangePolicyCode.mmOnDemand}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExchangePolicyCode#Immediately
 * ExchangePolicyCode.mmImmediately}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExchangePolicyCode#AsSoonAsPossible
 * ExchangePolicyCode.mmAsSoonAsPossible}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ExchangePolicyCode#AsGroup
 * ExchangePolicyCode.mmAsGroup}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExchangePolicyCode#NumberLimit
 * ExchangePolicyCode.mmNumberLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExchangePolicyCode#TotalLimit
 * ExchangePolicyCode.mmTotalLimit}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ExchangePolicyCode#Cyclic
 * ExchangePolicyCode.mmCyclic}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ExchangePolicyCode#None
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
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ExchangePolicyCode extends MMCode {

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
	public static final ExchangePolicyCode OnDemand = new ExchangePolicyCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OnDemand";
			definition = "Exchange is performed if requested by the acquirer in a previous exchange, or at any time by the acceptor.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExchangePolicyCode.mmObject();
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
	public static final ExchangePolicyCode Immediately = new ExchangePolicyCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Immediately";
			definition = "Exchange is performed just after the transaction completion.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExchangePolicyCode.mmObject();
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
	public static final ExchangePolicyCode AsSoonAsPossible = new ExchangePolicyCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AsSoonAsPossible";
			definition = "As soon as the acquirer is contacted, for example with the next on-line transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExchangePolicyCode.mmObject();
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
	public static final ExchangePolicyCode AsGroup = new ExchangePolicyCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AsGroup";
			definition = "Exchanges are performed after reaching a maximum number of transaction or time period.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExchangePolicyCode.mmObject();
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
	public static final ExchangePolicyCode NumberLimit = new ExchangePolicyCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NumberLimit";
			definition = "Exchange is performed after reaching a number of transactions without exchanges with the acquirer.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExchangePolicyCode.mmObject();
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
	public static final ExchangePolicyCode TotalLimit = new ExchangePolicyCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TotalLimit";
			definition = "Exchange is performed after reaching a cumulative amount of transactions without exchanges with the acquirer.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExchangePolicyCode.mmObject();
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
	public static final ExchangePolicyCode Cyclic = new ExchangePolicyCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Cyclic";
			definition = "Cyclic exchanges based on the related time conditions.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExchangePolicyCode.mmObject();
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
	public static final ExchangePolicyCode None = new ExchangePolicyCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "None";
			definition = "No exchange.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExchangePolicyCode.mmObject();
			codeName = "NONE";
		}
	};
	final static private LinkedHashMap<String, ExchangePolicyCode> codesByName = new LinkedHashMap<>();

	protected ExchangePolicyCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("ONDM");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ExchangePolicyCode";
				definition = "Exchange policy between parties.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ExchangePolicyCode.OnDemand, com.tools20022.repository.codeset.ExchangePolicyCode.Immediately,
						com.tools20022.repository.codeset.ExchangePolicyCode.AsSoonAsPossible, com.tools20022.repository.codeset.ExchangePolicyCode.AsGroup, com.tools20022.repository.codeset.ExchangePolicyCode.NumberLimit,
						com.tools20022.repository.codeset.ExchangePolicyCode.TotalLimit, com.tools20022.repository.codeset.ExchangePolicyCode.Cyclic, com.tools20022.repository.codeset.ExchangePolicyCode.None);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(OnDemand.getCodeName().get(), OnDemand);
		codesByName.put(Immediately.getCodeName().get(), Immediately);
		codesByName.put(AsSoonAsPossible.getCodeName().get(), AsSoonAsPossible);
		codesByName.put(AsGroup.getCodeName().get(), AsGroup);
		codesByName.put(NumberLimit.getCodeName().get(), NumberLimit);
		codesByName.put(TotalLimit.getCodeName().get(), TotalLimit);
		codesByName.put(Cyclic.getCodeName().get(), Cyclic);
		codesByName.put(None.getCodeName().get(), None);
	}

	public static ExchangePolicyCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ExchangePolicyCode[] values() {
		ExchangePolicyCode[] values = new ExchangePolicyCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ExchangePolicyCode> {
		@Override
		public ExchangePolicyCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ExchangePolicyCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}