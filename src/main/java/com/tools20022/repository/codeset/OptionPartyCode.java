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
import com.tools20022.repository.codeset.OptionPartyCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies if a trade party is a buyer or a seller.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.OptionPartyCode#Seller
 * OptionPartyCode.Seller}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OptionPartyCode#Buyer
 * OptionPartyCode.Buyer}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OptionPartyCode#Taker
 * OptionPartyCode.Taker}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OptionPartyCode#Maker
 * OptionPartyCode.Maker}</li>
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
 * <li>"SLLR"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OptionPartyCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies if a trade party is a buyer or a seller."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class OptionPartyCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Seller in a trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionPartyCode
	 * OptionPartyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SLLR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Seller"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Seller in a trade."</li>
	 * </ul>
	 */
	public static final OptionPartyCode Seller = new OptionPartyCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Seller";
			definition = "Seller in a trade.";
			owner_lazy = () -> com.tools20022.repository.codeset.OptionPartyCode.mmObject();
			codeName = "SLLR";
		}
	};
	/**
	 * Buyer in a trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionPartyCode
	 * OptionPartyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BYER"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Buyer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Buyer in a trade."</li>
	 * </ul>
	 */
	public static final OptionPartyCode Buyer = new OptionPartyCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Buyer";
			definition = "Buyer in a trade.";
			owner_lazy = () -> com.tools20022.repository.codeset.OptionPartyCode.mmObject();
			codeName = "BYER";
		}
	};
	/**
	 * Indicates the initiator of the trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionPartyCode
	 * OptionPartyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TAKE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Taker"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the initiator of the trade."</li>
	 * </ul>
	 */
	public static final OptionPartyCode Taker = new OptionPartyCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Taker";
			definition = "Indicates the initiator of the trade.";
			owner_lazy = () -> com.tools20022.repository.codeset.OptionPartyCode.mmObject();
			codeName = "TAKE";
		}
	};
	/**
	 * Indicates the receiver of the trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionPartyCode
	 * OptionPartyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MAKE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Maker"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the receiver of the trade."</li>
	 * </ul>
	 */
	public static final OptionPartyCode Maker = new OptionPartyCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Maker";
			definition = "Indicates the receiver of the trade.";
			owner_lazy = () -> com.tools20022.repository.codeset.OptionPartyCode.mmObject();
			codeName = "MAKE";
		}
	};
	final static private LinkedHashMap<String, OptionPartyCode> codesByName = new LinkedHashMap<>();

	protected OptionPartyCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("SLLR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OptionPartyCode";
				definition = "Specifies if a trade party is a buyer or a seller.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OptionPartyCode.Seller, com.tools20022.repository.codeset.OptionPartyCode.Buyer, com.tools20022.repository.codeset.OptionPartyCode.Taker,
						com.tools20022.repository.codeset.OptionPartyCode.Maker);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Seller.getCodeName().get(), Seller);
		codesByName.put(Buyer.getCodeName().get(), Buyer);
		codesByName.put(Taker.getCodeName().get(), Taker);
		codesByName.put(Maker.getCodeName().get(), Maker);
	}

	public static OptionPartyCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static OptionPartyCode[] values() {
		OptionPartyCode[] values = new OptionPartyCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, OptionPartyCode> {
		@Override
		public OptionPartyCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(OptionPartyCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}