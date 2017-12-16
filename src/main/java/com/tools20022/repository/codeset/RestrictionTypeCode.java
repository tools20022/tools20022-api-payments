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
import com.tools20022.repository.codeset.RestrictionTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of restriction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RestrictionTypeCode#Selling
 * RestrictionTypeCode.mmSelling}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RestrictionTypeCode#Buying
 * RestrictionTypeCode.mmBuying}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RestrictionTypeCode#Placing
 * RestrictionTypeCode.mmPlacing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RestrictionTypeCode#Holding
 * RestrictionTypeCode.mmHolding}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RestrictionTypeCode#Voting
 * RestrictionTypeCode.mmVoting}</li>
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
 * <li>"SELR"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RestrictionTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of restriction."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RestrictionTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Selling restriction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RestrictionTypeCode
	 * RestrictionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SELR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Selling"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Selling restriction."</li>
	 * </ul>
	 */
	public static final RestrictionTypeCode Selling = new RestrictionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Selling";
			definition = "Selling restriction.";
			owner_lazy = () -> com.tools20022.repository.codeset.RestrictionTypeCode.mmObject();
			codeName = "SELR";
		}
	};
	/**
	 * Buying restriction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RestrictionTypeCode
	 * RestrictionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BUYR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Buying"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Buying restriction."</li>
	 * </ul>
	 */
	public static final RestrictionTypeCode Buying = new RestrictionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Buying";
			definition = "Buying restriction.";
			owner_lazy = () -> com.tools20022.repository.codeset.RestrictionTypeCode.mmObject();
			codeName = "BUYR";
		}
	};
	/**
	 * Placing restriction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RestrictionTypeCode
	 * RestrictionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PLAR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Placing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Placing restriction."</li>
	 * </ul>
	 */
	public static final RestrictionTypeCode Placing = new RestrictionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Placing";
			definition = "Placing restriction.";
			owner_lazy = () -> com.tools20022.repository.codeset.RestrictionTypeCode.mmObject();
			codeName = "PLAR";
		}
	};
	/**
	 * Holding restriction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RestrictionTypeCode
	 * RestrictionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HOLR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Holding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Holding restriction."</li>
	 * </ul>
	 */
	public static final RestrictionTypeCode Holding = new RestrictionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Holding";
			definition = "Holding restriction.";
			owner_lazy = () -> com.tools20022.repository.codeset.RestrictionTypeCode.mmObject();
			codeName = "HOLR";
		}
	};
	/**
	 * Voting restriction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RestrictionTypeCode
	 * RestrictionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VOTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Voting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Voting restriction."</li>
	 * </ul>
	 */
	public static final RestrictionTypeCode Voting = new RestrictionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Voting";
			definition = "Voting restriction.";
			owner_lazy = () -> com.tools20022.repository.codeset.RestrictionTypeCode.mmObject();
			codeName = "VOTR";
		}
	};
	final static private LinkedHashMap<String, RestrictionTypeCode> codesByName = new LinkedHashMap<>();

	protected RestrictionTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("SELR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RestrictionTypeCode";
				definition = "Specifies the type of restriction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RestrictionTypeCode.Selling, com.tools20022.repository.codeset.RestrictionTypeCode.Buying, com.tools20022.repository.codeset.RestrictionTypeCode.Placing,
						com.tools20022.repository.codeset.RestrictionTypeCode.Holding, com.tools20022.repository.codeset.RestrictionTypeCode.Voting);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Selling.getCodeName().get(), Selling);
		codesByName.put(Buying.getCodeName().get(), Buying);
		codesByName.put(Placing.getCodeName().get(), Placing);
		codesByName.put(Holding.getCodeName().get(), Holding);
		codesByName.put(Voting.getCodeName().get(), Voting);
	}

	public static RestrictionTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RestrictionTypeCode[] values() {
		RestrictionTypeCode[] values = new RestrictionTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RestrictionTypeCode> {
		@Override
		public RestrictionTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RestrictionTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}