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
 * Identifies the method used to determine a settlement rate when a disruption
 * event has occurred.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DisruptionFallbackCode#mmAssignmentOfClaim
 * DisruptionFallbackCode.mmAssignmentOfClaim}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DisruptionFallbackCode#mmCalculationAgentDeterminationOfSettlementRate
 * DisruptionFallbackCode.mmCalculationAgentDeterminationOfSettlementRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DisruptionFallbackCode#mmDeliverableSubstitute
 * DisruptionFallbackCode.mmDeliverableSubstitute}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DisruptionFallbackCode#mmEscrowArrangement
 * DisruptionFallbackCode.mmEscrowArrangement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DisruptionFallbackCode#mmFallbackReferencePrice
 * DisruptionFallbackCode.mmFallbackReferencePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DisruptionFallbackCode#mmLocalAssetSubstituteGross
 * DisruptionFallbackCode.mmLocalAssetSubstituteGross}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DisruptionFallbackCode#mmLocalAssetSubstituteNet
 * DisruptionFallbackCode.mmLocalAssetSubstituteNet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DisruptionFallbackCode#mmLocalCurrencySubstitute
 * DisruptionFallbackCode.mmLocalCurrencySubstitute}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DisruptionFallbackCode#mmNoFaultTermination
 * DisruptionFallbackCode.mmNoFaultTermination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DisruptionFallbackCode#mmNonDeliverableSubstitute
 * DisruptionFallbackCode.mmNonDeliverableSubstitute}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DisruptionFallbackCode#mmSettlementPostponement
 * DisruptionFallbackCode.mmSettlementPostponement}</li>
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
 * <li>"AOCL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DisruptionFallbackCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies the method used to determine a settlement rate when a disruption event has occurred."
 * </li>
 * </ul>
 */
public class DisruptionFallbackCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * As per the 1998 FX and Currency Option Definitions published by the
	 * International Swaps and Derivatives Association inc., the Emerging Market
	 * Traders Association and the Foreign Exchange Committee.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DisruptionFallbackCode
	 * DisruptionFallbackCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AOCL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssignmentOfClaim"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "As per the 1998 FX and Currency Option Definitions published by the International Swaps and Derivatives Association inc., the Emerging Market Traders Association and the Foreign Exchange Committee."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAssignmentOfClaim = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AssignmentOfClaim";
			definition = "As per the 1998 FX and Currency Option Definitions published by the International Swaps and Derivatives Association inc., the Emerging Market Traders Association and the Foreign Exchange Committee.";
			owner_lazy = () -> DisruptionFallbackCode.mmObject();
			codeName = "AOCL";
		}
	};
	/**
	 * As per the 1998 FX and Currency Option Definitions published by the
	 * International Swaps and Derivatives Association inc., the Emerging Market
	 * Traders Association and the Foreign Exchange Committee.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DisruptionFallbackCode
	 * DisruptionFallbackCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CADS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalculationAgentDeterminationOfSettlementRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "As per the 1998 FX and Currency Option Definitions published by the International Swaps and Derivatives Association inc., the Emerging Market Traders Association and the Foreign Exchange Committee."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCalculationAgentDeterminationOfSettlementRate = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CalculationAgentDeterminationOfSettlementRate";
			definition = "As per the 1998 FX and Currency Option Definitions published by the International Swaps and Derivatives Association inc., the Emerging Market Traders Association and the Foreign Exchange Committee.";
			owner_lazy = () -> DisruptionFallbackCode.mmObject();
			codeName = "CADS";
		}
	};
	/**
	 * As per the 1998 FX and Currency Option Definitions published by the
	 * International Swaps and Derivatives Association inc., the Emerging Market
	 * Traders Association and the Foreign Exchange Committee.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DisruptionFallbackCode
	 * DisruptionFallbackCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DLVS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverableSubstitute"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "As per the 1998 FX and Currency Option Definitions published by the International Swaps and Derivatives Association inc., the Emerging Market Traders Association and the Foreign Exchange Committee."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDeliverableSubstitute = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeliverableSubstitute";
			definition = "As per the 1998 FX and Currency Option Definitions published by the International Swaps and Derivatives Association inc., the Emerging Market Traders Association and the Foreign Exchange Committee.";
			owner_lazy = () -> DisruptionFallbackCode.mmObject();
			codeName = "DLVS";
		}
	};
	/**
	 * As per the 1998 FX and Currency Option Definitions published by the
	 * International Swaps and Derivatives Association inc., the Emerging Market
	 * Traders Association and the Foreign Exchange Committee.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DisruptionFallbackCode
	 * DisruptionFallbackCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ESCA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EscrowArrangement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "As per the 1998 FX and Currency Option Definitions published by the International Swaps and Derivatives Association inc., the Emerging Market Traders Association and the Foreign Exchange Committee."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmEscrowArrangement = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EscrowArrangement";
			definition = "As per the 1998 FX and Currency Option Definitions published by the International Swaps and Derivatives Association inc., the Emerging Market Traders Association and the Foreign Exchange Committee.";
			owner_lazy = () -> DisruptionFallbackCode.mmObject();
			codeName = "ESCA";
		}
	};
	/**
	 * As per the 1998 FX and Currency Option Definitions published by the
	 * International Swaps and Derivatives Association inc., the Emerging Market
	 * Traders Association and the Foreign Exchange Committee.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DisruptionFallbackCode
	 * DisruptionFallbackCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FBRP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FallbackReferencePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "As per the 1998 FX and Currency Option Definitions published by the International Swaps and Derivatives Association inc., the Emerging Market Traders Association and the Foreign Exchange Committee."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmFallbackReferencePrice = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FallbackReferencePrice";
			definition = "As per the 1998 FX and Currency Option Definitions published by the International Swaps and Derivatives Association inc., the Emerging Market Traders Association and the Foreign Exchange Committee.";
			owner_lazy = () -> DisruptionFallbackCode.mmObject();
			codeName = "FBRP";
		}
	};
	/**
	 * As per the 1998 FX and Currency Option Definitions published by the
	 * International Swaps and Derivatives Association inc., the Emerging Market
	 * Traders Association and the Foreign Exchange Committee.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DisruptionFallbackCode
	 * DisruptionFallbackCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LASG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LocalAssetSubstituteGross"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "As per the 1998 FX and Currency Option Definitions published by the International Swaps and Derivatives Association inc., the Emerging Market Traders Association and the Foreign Exchange Committee."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmLocalAssetSubstituteGross = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LocalAssetSubstituteGross";
			definition = "As per the 1998 FX and Currency Option Definitions published by the International Swaps and Derivatives Association inc., the Emerging Market Traders Association and the Foreign Exchange Committee.";
			owner_lazy = () -> DisruptionFallbackCode.mmObject();
			codeName = "LASG";
		}
	};
	/**
	 * As per the 1998 FX and Currency Option Definitions published by the
	 * International Swaps and Derivatives Association inc., the Emerging Market
	 * Traders Association and the Foreign Exchange Committee.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DisruptionFallbackCode
	 * DisruptionFallbackCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LASN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LocalAssetSubstituteNet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "As per the 1998 FX and Currency Option Definitions published by the International Swaps and Derivatives Association inc., the Emerging Market Traders Association and the Foreign Exchange Committee."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmLocalAssetSubstituteNet = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LocalAssetSubstituteNet";
			definition = "As per the 1998 FX and Currency Option Definitions published by the International Swaps and Derivatives Association inc., the Emerging Market Traders Association and the Foreign Exchange Committee.";
			owner_lazy = () -> DisruptionFallbackCode.mmObject();
			codeName = "LASN";
		}
	};
	/**
	 * As per the 1998 FX and Currency Option Definitions published by the
	 * International Swaps and Derivatives Association inc., the Emerging Market
	 * Traders Association and the Foreign Exchange Committee.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DisruptionFallbackCode
	 * DisruptionFallbackCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LCYS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LocalCurrencySubstitute"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "As per the 1998 FX and Currency Option Definitions published by the International Swaps and Derivatives Association inc., the Emerging Market Traders Association and the Foreign Exchange Committee."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmLocalCurrencySubstitute = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LocalCurrencySubstitute";
			definition = "As per the 1998 FX and Currency Option Definitions published by the International Swaps and Derivatives Association inc., the Emerging Market Traders Association and the Foreign Exchange Committee.";
			owner_lazy = () -> DisruptionFallbackCode.mmObject();
			codeName = "LCYS";
		}
	};
	/**
	 * As per the 1998 FX and Currency Option Definitions published by the
	 * International Swaps and Derivatives Association inc., the Emerging Market
	 * Traders Association and the Foreign Exchange Committee.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DisruptionFallbackCode
	 * DisruptionFallbackCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NFTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoFaultTermination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "As per the 1998 FX and Currency Option Definitions published by the International Swaps and Derivatives Association inc., the Emerging Market Traders Association and the Foreign Exchange Committee."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmNoFaultTermination = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NoFaultTermination";
			definition = "As per the 1998 FX and Currency Option Definitions published by the International Swaps and Derivatives Association inc., the Emerging Market Traders Association and the Foreign Exchange Committee.";
			owner_lazy = () -> DisruptionFallbackCode.mmObject();
			codeName = "NFTR";
		}
	};
	/**
	 * As per the 1998 FX and Currency Option Definitions published by the
	 * International Swaps and Derivatives Association inc., the Emerging Market
	 * Traders Association and the Foreign Exchange Committee.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DisruptionFallbackCode
	 * DisruptionFallbackCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NDLS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonDeliverableSubstitute"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "As per the 1998 FX and Currency Option Definitions published by the International Swaps and Derivatives Association inc., the Emerging Market Traders Association and the Foreign Exchange Committee."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmNonDeliverableSubstitute = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NonDeliverableSubstitute";
			definition = "As per the 1998 FX and Currency Option Definitions published by the International Swaps and Derivatives Association inc., the Emerging Market Traders Association and the Foreign Exchange Committee.";
			owner_lazy = () -> DisruptionFallbackCode.mmObject();
			codeName = "NDLS";
		}
	};
	/**
	 * As per the 1998 FX and Currency Option Definitions published by the
	 * International Swaps and Derivatives Association inc., the Emerging Market
	 * Traders Association and the Foreign Exchange Committee.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DisruptionFallbackCode
	 * DisruptionFallbackCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STPP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementPostponement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "As per the 1998 FX and Currency Option Definitions published by the International Swaps and Derivatives Association inc., the Emerging Market Traders Association and the Foreign Exchange Committee."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmSettlementPostponement = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementPostponement";
			definition = "As per the 1998 FX and Currency Option Definitions published by the International Swaps and Derivatives Association inc., the Emerging Market Traders Association and the Foreign Exchange Committee.";
			owner_lazy = () -> DisruptionFallbackCode.mmObject();
			codeName = "STPP";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("AOCL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DisruptionFallbackCode";
				definition = "Identifies the method used to determine a settlement rate when a disruption event has occurred.";
				code_lazy = () -> Arrays.asList(DisruptionFallbackCode.mmAssignmentOfClaim, DisruptionFallbackCode.mmCalculationAgentDeterminationOfSettlementRate, DisruptionFallbackCode.mmDeliverableSubstitute,
						DisruptionFallbackCode.mmEscrowArrangement, DisruptionFallbackCode.mmFallbackReferencePrice, DisruptionFallbackCode.mmLocalAssetSubstituteGross, DisruptionFallbackCode.mmLocalAssetSubstituteNet,
						DisruptionFallbackCode.mmLocalCurrencySubstitute, DisruptionFallbackCode.mmNoFaultTermination, DisruptionFallbackCode.mmNonDeliverableSubstitute, DisruptionFallbackCode.mmSettlementPostponement);
			}
		});
		return mmObject_lazy.get();
	}
}