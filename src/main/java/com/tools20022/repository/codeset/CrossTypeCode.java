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
 * Type of cross being submitted to a market.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.CrossTypeCode#AllOrNone
 * CrossTypeCode.AllOrNone}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CrossTypeCode#ImmediateOrCancel
 * CrossTypeCode.ImmediateOrCancel}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CrossTypeCode#OneSide
 * CrossTypeCode.OneSide}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CrossTypeCode#SamePrice
 * CrossTypeCode.SamePrice}</li>
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
 * <li>"ALON"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CrossTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type of cross being submitted to a market."</li>
 * </ul>
 */
public class CrossTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Cross All or None - Cross trade that is executed completely or not. Both
	 * sides are treated in the same manner. This is equivalent to Fill or Kill
	 * type behavior, where the cross order meets the crossing criteria  within
	 * the market and is executed or it is rejected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CrossTypeCode
	 * CrossTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ALON"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllOrNone"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cross All or None - Cross trade that is executed completely or not. Both sides are treated in the same manner. This is equivalent to Fill or Kill type behavior, where the cross order meets the crossing criteria  within the market and is executed or it is rejected."
	 * </li>
	 * </ul>
	 */
	public static final MMCode AllOrNone = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllOrNone";
			definition = "Cross All or None - Cross trade that is executed completely or not. Both sides are treated in the same manner. This is equivalent to Fill or Kill type behavior, where the cross order meets the crossing criteria  within the market and is executed or it is rejected.";
			owner_lazy = () -> CrossTypeCode.mmObject();
			codeName = "ALON";
		}
	};
	/**
	 * Cross trade that is executed partially and the rest is canceled. One side
	 * is fully executed, the other side is partially executed with the
	 * remainder being canceled. This is equivalent to an Immediate or Cancel on
	 * the other side. Note: The CrossPrioritization field is used to indicate
	 * which side should fully execute in this scenario.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CrossTypeCode
	 * CrossTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IMOC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ImmediateOrCancel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cross trade that is executed partially and the rest is canceled. One side is fully executed, the other side is partially executed with the remainder being canceled. This is equivalent to an Immediate or Cancel on the other side. Note: The CrossPrioritization field is used to indicate which side should fully execute in this scenario."
	 * </li>
	 * </ul>
	 */
	public static final MMCode ImmediateOrCancel = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ImmediateOrCancel";
			definition = "Cross trade that is executed partially and the rest is canceled. One side is fully executed, the other side is partially executed with the remainder being canceled. This is equivalent to an Immediate or Cancel on the other side. Note: The CrossPrioritization field is used to indicate which side should fully execute in this scenario.";
			owner_lazy = () -> CrossTypeCode.mmObject();
			codeName = "IMOC";
		}
	};
	/**
	 * Cross trade that is partially executed with the unfilled portions
	 * remaining active. One side of the cross is fully executed (the side that
	 * was prioritised) but the unfilled portion remains active.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CrossTypeCode
	 * CrossTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ONSI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OneSide"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cross trade that is partially executed with the unfilled portions remaining active. One side of the cross is fully executed (the side that was prioritised) but the unfilled portion remains active."
	 * </li>
	 * </ul>
	 */
	public static final MMCode OneSide = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OneSide";
			definition = "Cross trade that is partially executed with the unfilled portions remaining active. One side of the cross is fully executed (the side that was prioritised) but the unfilled portion remains active.";
			owner_lazy = () -> CrossTypeCode.mmObject();
			codeName = "ONSI";
		}
	};
	/**
	 * Cross trade is executed with existing orders with the same price. In the
	 * case other orders exist with the same price, the quantity of the Cross is
	 * executed against the existing orders and quotes, the remainder of the
	 * cross is executed against the other side of the cross.The two sides
	 * potentially have different quantities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CrossTypeCode
	 * CrossTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SAPR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SamePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cross trade is executed with existing orders with the same price. In the case other orders exist with the same price, the quantity of the Cross is executed against the existing orders and quotes, the remainder of the cross is executed against the other side of the cross.The two sides potentially have different quantities."
	 * </li>
	 * </ul>
	 */
	public static final MMCode SamePrice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SamePrice";
			definition = "Cross trade is executed with existing orders with the same price. In the case other orders exist with the same price, the quantity of the Cross is executed against the existing orders and quotes, the remainder of the cross is executed against the other side of the cross.The two sides potentially have different quantities.";
			owner_lazy = () -> CrossTypeCode.mmObject();
			codeName = "SAPR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("ALON");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CrossTypeCode";
				definition = "Type of cross being submitted to a market.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CrossTypeCode.AllOrNone, com.tools20022.repository.codeset.CrossTypeCode.ImmediateOrCancel, com.tools20022.repository.codeset.CrossTypeCode.OneSide,
						com.tools20022.repository.codeset.CrossTypeCode.SamePrice);
			}
		});
		return mmObject_lazy.get();
	}
}