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
import com.tools20022.repository.codeset.TypeOfDiscretionPriceCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Contains the type of price to which the discretion offset is related to.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfDiscretionPriceCode#DisplayedPrice
 * TypeOfDiscretionPriceCode.mmDisplayedPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfDiscretionPriceCode#MarketPrice
 * TypeOfDiscretionPriceCode.mmMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfDiscretionPriceCode#PrimaryPrice
 * TypeOfDiscretionPriceCode.mmPrimaryPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfDiscretionPriceCode#LocalPrimaryPrice
 * TypeOfDiscretionPriceCode.mmLocalPrimaryPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfDiscretionPriceCode#MidpointPrice
 * TypeOfDiscretionPriceCode.mmMidpointPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfDiscretionPriceCode#VolumeWeightedAveragePrice
 * TypeOfDiscretionPriceCode.mmVolumeWeightedAveragePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfDiscretionPriceCode#AveragePriceGuarantee
 * TypeOfDiscretionPriceCode.mmAveragePriceGuarantee}</li>
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
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TypeOfDiscretionPriceCode extends MMCode {

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
	public static final TypeOfDiscretionPriceCode DisplayedPrice = new TypeOfDiscretionPriceCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisplayedPrice";
			definition = "Indicates that the offset value is related to displayed price.";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfDiscretionPriceCode.mmObject();
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
	public static final TypeOfDiscretionPriceCode MarketPrice = new TypeOfDiscretionPriceCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketPrice";
			definition = "Indicates that the offset value is related to market price.";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfDiscretionPriceCode.mmObject();
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
	public static final TypeOfDiscretionPriceCode PrimaryPrice = new TypeOfDiscretionPriceCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrimaryPrice";
			definition = "Indicates that the offset value is related to primary price.";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfDiscretionPriceCode.mmObject();
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
	public static final TypeOfDiscretionPriceCode LocalPrimaryPrice = new TypeOfDiscretionPriceCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LocalPrimaryPrice";
			definition = "Indicates that the offset value is related to local primary price.";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfDiscretionPriceCode.mmObject();
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
	public static final TypeOfDiscretionPriceCode MidpointPrice = new TypeOfDiscretionPriceCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MidpointPrice";
			definition = "Indicates that the offset value is related to midpoint price.";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfDiscretionPriceCode.mmObject();
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
	public static final TypeOfDiscretionPriceCode VolumeWeightedAveragePrice = new TypeOfDiscretionPriceCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VolumeWeightedAveragePrice";
			definition = "Indicates that the offset value is related to VWAP price.";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfDiscretionPriceCode.mmObject();
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
	public static final TypeOfDiscretionPriceCode AveragePriceGuarantee = new TypeOfDiscretionPriceCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AveragePriceGuarantee";
			definition = "Indicates that the offset value is related to average price guarantee.";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfDiscretionPriceCode.mmObject();
			codeName = "AVPG";
		}
	};
	final static private LinkedHashMap<String, TypeOfDiscretionPriceCode> codesByName = new LinkedHashMap<>();

	protected TypeOfDiscretionPriceCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("DISP");
				registrationStatus = MMRegistrationStatus.REGISTERED;
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

	static {
		codesByName.put(DisplayedPrice.getCodeName().get(), DisplayedPrice);
		codesByName.put(MarketPrice.getCodeName().get(), MarketPrice);
		codesByName.put(PrimaryPrice.getCodeName().get(), PrimaryPrice);
		codesByName.put(LocalPrimaryPrice.getCodeName().get(), LocalPrimaryPrice);
		codesByName.put(MidpointPrice.getCodeName().get(), MidpointPrice);
		codesByName.put(VolumeWeightedAveragePrice.getCodeName().get(), VolumeWeightedAveragePrice);
		codesByName.put(AveragePriceGuarantee.getCodeName().get(), AveragePriceGuarantee);
	}

	public static TypeOfDiscretionPriceCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TypeOfDiscretionPriceCode[] values() {
		TypeOfDiscretionPriceCode[] values = new TypeOfDiscretionPriceCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TypeOfDiscretionPriceCode> {
		@Override
		public TypeOfDiscretionPriceCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TypeOfDiscretionPriceCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}