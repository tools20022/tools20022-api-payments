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
import com.tools20022.repository.codeset.OfferTypeV2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the conditions that apply to the offer.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OfferTypeV2Code#DissenterRights
 * OfferTypeV2Code.DissenterRights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OfferTypeV2Code#RestrictionExchange
 * OfferTypeV2Code.RestrictionExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OfferTypeV2Code#FirstComeFirstServed
 * OfferTypeV2Code.FirstComeFirstServed}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OfferTypeV2Code#FinalOffer
 * OfferTypeV2Code.FinalOffer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OfferTypeV2Code#MiniOddLotOffer
 * OfferTypeV2Code.MiniOddLotOffer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OfferTypeV2Code#PartialOffer
 * OfferTypeV2Code.PartialOffer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OfferTypeV2Code#SqueezeOutBid
 * OfferTypeV2Code.SqueezeOutBid}</li>
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
 * <li>"DISS"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OfferTypeV2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the conditions that apply to the offer."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class OfferTypeV2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Securities holder has the right to disagree with a mandatory event. This
	 * right is not inherent in all offers and therefore must be noted in
	 * announcements only when applicable.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OfferTypeV2Code
	 * OfferTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DISS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DissenterRights"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities holder has the right to disagree with a mandatory event. This right is not inherent in all offers and therefore must be noted in announcements only when applicable."
	 * </li>
	 * </ul>
	 */
	public static final OfferTypeV2Code DissenterRights = new OfferTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DissenterRights";
			definition = "Securities holder has the right to disagree with a mandatory event. This right is not inherent in all offers and therefore must be noted in announcements only when applicable.";
			owner_lazy = () -> com.tools20022.repository.codeset.OfferTypeV2Code.mmObject();
			codeName = "DISS";
		}
	};
	/**
	 * Exchange of Restricted to Unrestricted (or vice versa).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OfferTypeV2Code
	 * OfferTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ERUN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RestrictionExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Exchange of Restricted to Unrestricted (or vice versa)."</li>
	 * </ul>
	 */
	public static final OfferTypeV2Code RestrictionExchange = new OfferTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RestrictionExchange";
			definition = "Exchange of Restricted to Unrestricted (or vice versa).";
			owner_lazy = () -> com.tools20022.repository.codeset.OfferTypeV2Code.mmObject();
			codeName = "ERUN";
		}
	};
	/**
	 * Securities will be accepted in the order they have been submitted until
	 * the target number of quantity sought is reached.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OfferTypeV2Code
	 * OfferTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FCFS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstComeFirstServed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities will be accepted in the order they have been submitted until the target number of quantity sought is reached."
	 * </li>
	 * </ul>
	 */
	public static final OfferTypeV2Code FirstComeFirstServed = new OfferTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstComeFirstServed";
			definition = "Securities will be accepted in the order they have been submitted until the target number of quantity sought is reached.";
			owner_lazy = () -> com.tools20022.repository.codeset.OfferTypeV2Code.mmObject();
			codeName = "FCFS";
		}
	};
	/**
	 * Final or last offer to holders subject to offer conditions being reached,
	 * for example, 50 percent accepted on a tender.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OfferTypeV2Code
	 * OfferTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FINL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinalOffer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Final or last offer to holders subject to offer conditions being reached, for example, 50 percent accepted on a tender."
	 * </li>
	 * </ul>
	 */
	public static final OfferTypeV2Code FinalOffer = new OfferTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinalOffer";
			definition = "Final or last offer to holders subject to offer conditions being reached, for example, 50 percent accepted on a tender.";
			owner_lazy = () -> com.tools20022.repository.codeset.OfferTypeV2Code.mmObject();
			codeName = "FINL";
		}
	};
	/**
	 * Sale or purchase of odd lots to/from a third party other than the issuing
	 * company.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OfferTypeV2Code
	 * OfferTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MINI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MiniOddLotOffer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sale or purchase of odd lots to/from a third party other than the issuing company."
	 * </li>
	 * </ul>
	 */
	public static final OfferTypeV2Code MiniOddLotOffer = new OfferTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MiniOddLotOffer";
			definition = "Sale or purchase of odd lots to/from a third party other than the issuing company.";
			owner_lazy = () -> com.tools20022.repository.codeset.OfferTypeV2Code.mmObject();
			codeName = "MINI";
		}
	};
	/**
	 * Offer made by the offeror for a portion of the outstanding shares not
	 * already owned by the offeror.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OfferTypeV2Code
	 * OfferTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PART"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialOffer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Offer made by the offeror for a portion of the outstanding shares not already owned by the offeror."
	 * </li>
	 * </ul>
	 */
	public static final OfferTypeV2Code PartialOffer = new OfferTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialOffer";
			definition = "Offer made by the offeror for a portion of the outstanding shares not already owned by the offeror.";
			owner_lazy = () -> com.tools20022.repository.codeset.OfferTypeV2Code.mmObject();
			codeName = "PART";
		}
	};
	/**
	 * Offer launched by a company, in possession of a large number of the
	 * shares (90% - 95%) of a company (generally as a result of a tender
	 * offer), in order to acquire the remaining shares of that company.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OfferTypeV2Code
	 * OfferTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SQUE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SqueezeOutBid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Offer launched by a company, in possession of a large number of the shares (90% - 95%) of a company (generally as a result of a tender offer), in order to acquire the remaining shares of that company."
	 * </li>
	 * </ul>
	 */
	public static final OfferTypeV2Code SqueezeOutBid = new OfferTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SqueezeOutBid";
			definition = "Offer launched by a company, in possession of a large number of the shares (90% - 95%) of a company (generally as a result of a tender offer), in order to acquire the remaining shares of that company.";
			owner_lazy = () -> com.tools20022.repository.codeset.OfferTypeV2Code.mmObject();
			codeName = "SQUE";
		}
	};
	final static private LinkedHashMap<String, OfferTypeV2Code> codesByName = new LinkedHashMap<>();

	protected OfferTypeV2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("DISS");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OfferTypeV2Code";
				definition = "Specifies the conditions that apply to the offer.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OfferTypeV2Code.DissenterRights, com.tools20022.repository.codeset.OfferTypeV2Code.RestrictionExchange,
						com.tools20022.repository.codeset.OfferTypeV2Code.FirstComeFirstServed, com.tools20022.repository.codeset.OfferTypeV2Code.FinalOffer, com.tools20022.repository.codeset.OfferTypeV2Code.MiniOddLotOffer,
						com.tools20022.repository.codeset.OfferTypeV2Code.PartialOffer, com.tools20022.repository.codeset.OfferTypeV2Code.SqueezeOutBid);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(DissenterRights.getCodeName().get(), DissenterRights);
		codesByName.put(RestrictionExchange.getCodeName().get(), RestrictionExchange);
		codesByName.put(FirstComeFirstServed.getCodeName().get(), FirstComeFirstServed);
		codesByName.put(FinalOffer.getCodeName().get(), FinalOffer);
		codesByName.put(MiniOddLotOffer.getCodeName().get(), MiniOddLotOffer);
		codesByName.put(PartialOffer.getCodeName().get(), PartialOffer);
		codesByName.put(SqueezeOutBid.getCodeName().get(), SqueezeOutBid);
	}

	public static OfferTypeV2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static OfferTypeV2Code[] values() {
		OfferTypeV2Code[] values = new OfferTypeV2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, OfferTypeV2Code> {
		@Override
		public OfferTypeV2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(OfferTypeV2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}