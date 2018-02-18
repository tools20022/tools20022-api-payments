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
import com.tools20022.repository.codeset.CardTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of payment card.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.CardTypeCode#CreditCard
 * CardTypeCode.CreditCard}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CardTypeCode#DebitCard
 * CardTypeCode.DebitCard}</li>
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
 * <li>"CRDT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CardTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of payment card."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CardTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Card where the holder has been granted a line of credit. The card enables
	 * the holder to make purchases and withdraw cash up to a pre-arranged
	 * ceiling.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardTypeCode CardTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRDT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditCard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Card where the holder has been granted a line of credit. The card enables the holder to make purchases and withdraw cash up to a pre-arranged ceiling."
	 * </li>
	 * </ul>
	 */
	public static final CardTypeCode CreditCard = new CardTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreditCard";
			definition = "Card where the holder has been granted a line of credit. The card enables the holder to make purchases and withdraw cash up to a pre-arranged ceiling.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardTypeCode.mmObject();
			codeName = "CRDT";
		}
	};
	/**
	 * Card enabling the holder to have its purchases directly charged to its
	 * account. The card may also combine other functions, eg, cash card or
	 * cheque guaranteed card.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardTypeCode CardTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DBIT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebitCard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Card enabling the holder to have its purchases directly charged to its account. The card may also combine other functions, eg, cash card or cheque guaranteed card."
	 * </li>
	 * </ul>
	 */
	public static final CardTypeCode DebitCard = new CardTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DebitCard";
			definition = "Card enabling the holder to have its purchases directly charged to its account. The card may also combine other functions, eg, cash card or cheque guaranteed card.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardTypeCode.mmObject();
			codeName = "DBIT";
		}
	};
	final static private LinkedHashMap<String, CardTypeCode> codesByName = new LinkedHashMap<>();

	protected CardTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CRDT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardTypeCode";
				definition = "Specifies the type of payment card.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardTypeCode.CreditCard, com.tools20022.repository.codeset.CardTypeCode.DebitCard);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CreditCard.getCodeName().get(), CreditCard);
		codesByName.put(DebitCard.getCodeName().get(), DebitCard);
	}

	public static CardTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CardTypeCode[] values() {
		CardTypeCode[] values = new CardTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CardTypeCode> {
		@Override
		public CardTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CardTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}