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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.TradingSessionCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates the factors that are/were applied in the event of pre-allocation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.TradingSessionCode#Auction
 * TradingSessionCode.Auction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingSessionCode#Continuous
 * TradingSessionCode.Continuous}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
 * semanticMarkup} = ISO15022Synonym: :22F::PRCO</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"AUCT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradingSessionCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates the factors that are/were applied in the event of pre-allocation."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TradingSessionCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Orders that are traded in regularly occuring auctions: orders are
	 * accumulated and executed on basis of defined algorithms.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingSessionCode
	 * TradingSessionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AUCT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::TRSE//AUCT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Auction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Orders that are traded in regularly occuring auctions: orders are accumulated and executed on basis of defined algorithms."
	 * </li>
	 * </ul>
	 */
	public static final TradingSessionCode Auction = new TradingSessionCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::TRSE//AUCT"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Auction";
			definition = "Orders that are traded in regularly occuring auctions: orders are accumulated and executed on basis of defined algorithms.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingSessionCode.mmObject();
			codeName = "AUCT";
		}
	};
	/**
	 * Trading process where orders are executed directly against each others as
	 * they hit the marketplace.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingSessionCode
	 * TradingSessionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CONT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::TRSE//CONT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Continuous"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trading process where orders are executed directly against each others as they hit the marketplace."
	 * </li>
	 * </ul>
	 */
	public static final TradingSessionCode Continuous = new TradingSessionCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::TRSE//CONT"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Continuous";
			definition = "Trading process where orders are executed directly against each others as they hit the marketplace.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingSessionCode.mmObject();
			codeName = "CONT";
		}
	};
	final static private LinkedHashMap<String, TradingSessionCode> codesByName = new LinkedHashMap<>();

	protected TradingSessionCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::PRCO"));
				example = Arrays.asList("AUCT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradingSessionCode";
				definition = "Indicates the factors that are/were applied in the event of pre-allocation.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TradingSessionCode.Auction, com.tools20022.repository.codeset.TradingSessionCode.Continuous);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Auction.getCodeName().get(), Auction);
		codesByName.put(Continuous.getCodeName().get(), Continuous);
	}

	public static TradingSessionCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TradingSessionCode[] values() {
		TradingSessionCode[] values = new TradingSessionCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TradingSessionCode> {
		@Override
		public TradingSessionCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TradingSessionCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}