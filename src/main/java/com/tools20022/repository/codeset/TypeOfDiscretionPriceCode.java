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
 * Contains the type of price to which the discretion offset is related to.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfDiscretionPriceCode#DisplayedPrice
 * TypeOfDiscretionPriceCode.DisplayedPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfDiscretionPriceCode#MarketPrice
 * TypeOfDiscretionPriceCode.MarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfDiscretionPriceCode#PrimaryPrice
 * TypeOfDiscretionPriceCode.PrimaryPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfDiscretionPriceCode#LocalPrimaryPrice
 * TypeOfDiscretionPriceCode.LocalPrimaryPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfDiscretionPriceCode#MidpointPrice
 * TypeOfDiscretionPriceCode.MidpointPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfDiscretionPriceCode#VolumeWeightedAveragePrice
 * TypeOfDiscretionPriceCode.VolumeWeightedAveragePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfDiscretionPriceCode#AveragePriceGuarantee
 * TypeOfDiscretionPriceCode.AveragePriceGuarantee}</li>
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
 * <li>"DISP"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TypeOfDiscretionPriceCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Contains the type of price to which the discretion offset is related to."</li>
 * </ul>
 */
public class TypeOfDiscretionPriceCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates that the offset value is related to displayed price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfDiscretionPriceCode
	 * TypeOfDiscretionPriceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DISP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisplayedPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the offset value is related to displayed price."</li>
	 * </ul>
	 */
	public static final MMCode DisplayedPrice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisplayedPrice";
			definition = "Indicates that the offset value is related to displayed price.";
			owner_lazy = () -> TypeOfDiscretionPriceCode.mmObject();
			codeName = "DISP";
		}
	};
	/**
	 * Indicates that the offset value is related to market price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfDiscretionPriceCode
	 * TypeOfDiscretionPriceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MRKT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the offset value is related to market price."</li>
	 * </ul>
	 */
	public static final MMCode MarketPrice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketPrice";
			definition = "Indicates that the offset value is related to market price.";
			owner_lazy = () -> TypeOfDiscretionPriceCode.mmObject();
			codeName = "MRKT";
		}
	};
	/**
	 * Indicates that the offset value is related to primary price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfDiscretionPriceCode
	 * TypeOfDiscretionPriceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRIM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrimaryPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the offset value is related to primary price."</li>
	 * </ul>
	 */
	public static final MMCode PrimaryPrice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrimaryPrice";
			definition = "Indicates that the offset value is related to primary price.";
			owner_lazy = () -> TypeOfDiscretionPriceCode.mmObject();
			codeName = "PRIM";
		}
	};
	/**
	 * Indicates that the offset value is related to local primary price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfDiscretionPriceCode
	 * TypeOfDiscretionPriceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LPRI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LocalPrimaryPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the offset value is related to local primary price."</li>
	 * </ul>
	 */
	public static final MMCode LocalPrimaryPrice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LocalPrimaryPrice";
			definition = "Indicates that the offset value is related to local primary price.";
			owner_lazy = () -> TypeOfDiscretionPriceCode.mmObject();
			codeName = "LPRI";
		}
	};
	/**
	 * Indicates that the offset value is related to midpoint price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfDiscretionPriceCode
	 * TypeOfDiscretionPriceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MIDP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MidpointPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the offset value is related to midpoint price."</li>
	 * </ul>
	 */
	public static final MMCode MidpointPrice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MidpointPrice";
			definition = "Indicates that the offset value is related to midpoint price.";
			owner_lazy = () -> TypeOfDiscretionPriceCode.mmObject();
			codeName = "MIDP";
		}
	};
	/**
	 * Indicates that the offset value is related to VWAP price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfDiscretionPriceCode
	 * TypeOfDiscretionPriceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VWAP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VolumeWeightedAveragePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates that the offset value is related to VWAP price."
	 * </li>
	 * </ul>
	 */
	public static final MMCode VolumeWeightedAveragePrice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VolumeWeightedAveragePrice";
			definition = "Indicates that the offset value is related to VWAP price.";
			owner_lazy = () -> TypeOfDiscretionPriceCode.mmObject();
			codeName = "VWAP";
		}
	};
	/**
	 * Indicates that the offset value is related to average price guarantee.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfDiscretionPriceCode
	 * TypeOfDiscretionPriceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AVPG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AveragePriceGuarantee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the offset value is related to average price guarantee."</li>
	 * </ul>
	 */
	public static final MMCode AveragePriceGuarantee = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AveragePriceGuarantee";
			definition = "Indicates that the offset value is related to average price guarantee.";
			owner_lazy = () -> TypeOfDiscretionPriceCode.mmObject();
			codeName = "AVPG";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("DISP");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TypeOfDiscretionPriceCode";
				definition = "Contains the type of price to which the discretion offset is related to.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TypeOfDiscretionPriceCode.DisplayedPrice, com.tools20022.repository.codeset.TypeOfDiscretionPriceCode.MarketPrice,
						com.tools20022.repository.codeset.TypeOfDiscretionPriceCode.PrimaryPrice, com.tools20022.repository.codeset.TypeOfDiscretionPriceCode.LocalPrimaryPrice,
						com.tools20022.repository.codeset.TypeOfDiscretionPriceCode.MidpointPrice, com.tools20022.repository.codeset.TypeOfDiscretionPriceCode.VolumeWeightedAveragePrice,
						com.tools20022.repository.codeset.TypeOfDiscretionPriceCode.AveragePriceGuarantee);
			}
		});
		return mmObject_lazy.get();
	}
}