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
 * Specifies the conditions that apply to the offer.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OfferTypeV2Code#mmDissenterRights
 * OfferTypeV2Code.mmDissenterRights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OfferTypeV2Code#mmRestrictionExchange
 * OfferTypeV2Code.mmRestrictionExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OfferTypeV2Code#mmFirstComeFirstServed
 * OfferTypeV2Code.mmFirstComeFirstServed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OfferTypeV2Code#mmFinalOffer
 * OfferTypeV2Code.mmFinalOffer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OfferTypeV2Code#mmMiniOddLotOffer
 * OfferTypeV2Code.mmMiniOddLotOffer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OfferTypeV2Code#mmPartialOffer
 * OfferTypeV2Code.mmPartialOffer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OfferTypeV2Code#mmSqueezeOutBid
 * OfferTypeV2Code.mmSqueezeOutBid}</li>
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
public class OfferTypeV2Code {

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
	public static final MMCode mmDissenterRights = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DissenterRights";
			definition = "Securities holder has the right to disagree with a mandatory event. This right is not inherent in all offers and therefore must be noted in announcements only when applicable.";
			owner_lazy = () -> OfferTypeV2Code.mmObject();
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
	public static final MMCode mmRestrictionExchange = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RestrictionExchange";
			definition = "Exchange of Restricted to Unrestricted (or vice versa).";
			owner_lazy = () -> OfferTypeV2Code.mmObject();
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
	public static final MMCode mmFirstComeFirstServed = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstComeFirstServed";
			definition = "Securities will be accepted in the order they have been submitted until the target number of quantity sought is reached.";
			owner_lazy = () -> OfferTypeV2Code.mmObject();
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
	public static final MMCode mmFinalOffer = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinalOffer";
			definition = "Final or last offer to holders subject to offer conditions being reached, for example, 50 percent accepted on a tender.";
			owner_lazy = () -> OfferTypeV2Code.mmObject();
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
	public static final MMCode mmMiniOddLotOffer = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MiniOddLotOffer";
			definition = "Sale or purchase of odd lots to/from a third party other than the issuing company.";
			owner_lazy = () -> OfferTypeV2Code.mmObject();
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
	public static final MMCode mmPartialOffer = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialOffer";
			definition = "Offer made by the offeror for a portion of the outstanding shares not already owned by the offeror.";
			owner_lazy = () -> OfferTypeV2Code.mmObject();
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
	public static final MMCode mmSqueezeOutBid = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SqueezeOutBid";
			definition = "Offer launched by a company, in possession of a large number of the shares (90% - 95%) of a company (generally as a result of a tender offer), in order to acquire the remaining shares of that company.";
			owner_lazy = () -> OfferTypeV2Code.mmObject();
			codeName = "SQUE";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("DISS");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OfferTypeV2Code";
				definition = "Specifies the conditions that apply to the offer.";
				code_lazy = () -> Arrays.asList(OfferTypeV2Code.mmDissenterRights, OfferTypeV2Code.mmRestrictionExchange, OfferTypeV2Code.mmFirstComeFirstServed, OfferTypeV2Code.mmFinalOffer, OfferTypeV2Code.mmMiniOddLotOffer,
						OfferTypeV2Code.mmPartialOffer, OfferTypeV2Code.mmSqueezeOutBid);
			}
		});
		return mmObject_lazy.get();
	}
}