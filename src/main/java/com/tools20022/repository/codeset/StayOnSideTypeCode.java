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
import com.tools20022.repository.codeset.StayOnSideTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates that an order is pegged against the offer/bid at the time of the
 * order submission.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.StayOnSideTypeCode#Offer
 * StayOnSideTypeCode.mmOffer}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.StayOnSideTypeCode#Bid
 * StayOnSideTypeCode.mmBid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StayOnSideTypeCode#DontCare
 * StayOnSideTypeCode.mmDontCare}</li>
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
 * <li>"OFFR"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "StayOnSideTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates that an order is pegged against the offer/bid at the time of the order submission."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class StayOnSideTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * An order pegged against the offer price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StayOnSideTypeCode
	 * StayOnSideTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OFFR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Offer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "An order pegged against the offer price."</li>
	 * </ul>
	 */
	public static final StayOnSideTypeCode Offer = new StayOnSideTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Offer";
			definition = "An order pegged against the offer price.";
			owner_lazy = () -> com.tools20022.repository.codeset.StayOnSideTypeCode.mmObject();
			codeName = "OFFR";
		}
	};
	/**
	 * An order pegged against the bid price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StayOnSideTypeCode
	 * StayOnSideTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BIDE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "An order pegged against  the bid price."</li>
	 * </ul>
	 */
	public static final StayOnSideTypeCode Bid = new StayOnSideTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bid";
			definition = "An order pegged against  the bid price.";
			owner_lazy = () -> com.tools20022.repository.codeset.StayOnSideTypeCode.mmObject();
			codeName = "BIDE";
		}
	};
	/**
	 * Indicates a voluntary absence of choice/decision.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StayOnSideTypeCode
	 * StayOnSideTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DCAR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DontCare"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates a voluntary absence of choice/decision."</li>
	 * </ul>
	 */
	public static final StayOnSideTypeCode DontCare = new StayOnSideTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DontCare";
			definition = "Indicates a voluntary absence of choice/decision.";
			owner_lazy = () -> com.tools20022.repository.codeset.StayOnSideTypeCode.mmObject();
			codeName = "DCAR";
		}
	};
	final static private LinkedHashMap<String, StayOnSideTypeCode> codesByName = new LinkedHashMap<>();

	protected StayOnSideTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("OFFR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StayOnSideTypeCode";
				definition = "Indicates that an order is pegged against the offer/bid at the time of the order submission.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.StayOnSideTypeCode.Offer, com.tools20022.repository.codeset.StayOnSideTypeCode.Bid, com.tools20022.repository.codeset.StayOnSideTypeCode.DontCare);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Offer.getCodeName().get(), Offer);
		codesByName.put(Bid.getCodeName().get(), Bid);
		codesByName.put(DontCare.getCodeName().get(), DontCare);
	}

	public static StayOnSideTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static StayOnSideTypeCode[] values() {
		StayOnSideTypeCode[] values = new StayOnSideTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, StayOnSideTypeCode> {
		@Override
		public StayOnSideTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(StayOnSideTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}