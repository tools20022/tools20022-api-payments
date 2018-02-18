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
import com.tools20022.repository.codeset.DisruptionFallbackCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Identifies the method used to determine a settlement rate when a disruption
 * event has occurred.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DisruptionFallbackCode#AssignmentOfClaim
 * DisruptionFallbackCode.AssignmentOfClaim}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DisruptionFallbackCode#CalculationAgentDeterminationOfSettlementRate
 * DisruptionFallbackCode.CalculationAgentDeterminationOfSettlementRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DisruptionFallbackCode#DeliverableSubstitute
 * DisruptionFallbackCode.DeliverableSubstitute}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DisruptionFallbackCode#EscrowArrangement
 * DisruptionFallbackCode.EscrowArrangement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DisruptionFallbackCode#FallbackReferencePrice
 * DisruptionFallbackCode.FallbackReferencePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DisruptionFallbackCode#LocalAssetSubstituteGross
 * DisruptionFallbackCode.LocalAssetSubstituteGross}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DisruptionFallbackCode#LocalAssetSubstituteNet
 * DisruptionFallbackCode.LocalAssetSubstituteNet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DisruptionFallbackCode#LocalCurrencySubstitute
 * DisruptionFallbackCode.LocalCurrencySubstitute}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DisruptionFallbackCode#NoFaultTermination
 * DisruptionFallbackCode.NoFaultTermination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DisruptionFallbackCode#NonDeliverableSubstitute
 * DisruptionFallbackCode.NonDeliverableSubstitute}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DisruptionFallbackCode#SettlementPostponement
 * DisruptionFallbackCode.SettlementPostponement}</li>
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
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DisruptionFallbackCode extends MMCode {

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
	public static final DisruptionFallbackCode AssignmentOfClaim = new DisruptionFallbackCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AssignmentOfClaim";
			definition = "As per the 1998 FX and Currency Option Definitions published by the International Swaps and Derivatives Association inc., the Emerging Market Traders Association and the Foreign Exchange Committee.";
			owner_lazy = () -> com.tools20022.repository.codeset.DisruptionFallbackCode.mmObject();
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
	public static final DisruptionFallbackCode CalculationAgentDeterminationOfSettlementRate = new DisruptionFallbackCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CalculationAgentDeterminationOfSettlementRate";
			definition = "As per the 1998 FX and Currency Option Definitions published by the International Swaps and Derivatives Association inc., the Emerging Market Traders Association and the Foreign Exchange Committee.";
			owner_lazy = () -> com.tools20022.repository.codeset.DisruptionFallbackCode.mmObject();
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
	public static final DisruptionFallbackCode DeliverableSubstitute = new DisruptionFallbackCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeliverableSubstitute";
			definition = "As per the 1998 FX and Currency Option Definitions published by the International Swaps and Derivatives Association inc., the Emerging Market Traders Association and the Foreign Exchange Committee.";
			owner_lazy = () -> com.tools20022.repository.codeset.DisruptionFallbackCode.mmObject();
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
	public static final DisruptionFallbackCode EscrowArrangement = new DisruptionFallbackCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EscrowArrangement";
			definition = "As per the 1998 FX and Currency Option Definitions published by the International Swaps and Derivatives Association inc., the Emerging Market Traders Association and the Foreign Exchange Committee.";
			owner_lazy = () -> com.tools20022.repository.codeset.DisruptionFallbackCode.mmObject();
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
	public static final DisruptionFallbackCode FallbackReferencePrice = new DisruptionFallbackCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FallbackReferencePrice";
			definition = "As per the 1998 FX and Currency Option Definitions published by the International Swaps and Derivatives Association inc., the Emerging Market Traders Association and the Foreign Exchange Committee.";
			owner_lazy = () -> com.tools20022.repository.codeset.DisruptionFallbackCode.mmObject();
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
	public static final DisruptionFallbackCode LocalAssetSubstituteGross = new DisruptionFallbackCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LocalAssetSubstituteGross";
			definition = "As per the 1998 FX and Currency Option Definitions published by the International Swaps and Derivatives Association inc., the Emerging Market Traders Association and the Foreign Exchange Committee.";
			owner_lazy = () -> com.tools20022.repository.codeset.DisruptionFallbackCode.mmObject();
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
	public static final DisruptionFallbackCode LocalAssetSubstituteNet = new DisruptionFallbackCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LocalAssetSubstituteNet";
			definition = "As per the 1998 FX and Currency Option Definitions published by the International Swaps and Derivatives Association inc., the Emerging Market Traders Association and the Foreign Exchange Committee.";
			owner_lazy = () -> com.tools20022.repository.codeset.DisruptionFallbackCode.mmObject();
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
	public static final DisruptionFallbackCode LocalCurrencySubstitute = new DisruptionFallbackCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LocalCurrencySubstitute";
			definition = "As per the 1998 FX and Currency Option Definitions published by the International Swaps and Derivatives Association inc., the Emerging Market Traders Association and the Foreign Exchange Committee.";
			owner_lazy = () -> com.tools20022.repository.codeset.DisruptionFallbackCode.mmObject();
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
	public static final DisruptionFallbackCode NoFaultTermination = new DisruptionFallbackCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NoFaultTermination";
			definition = "As per the 1998 FX and Currency Option Definitions published by the International Swaps and Derivatives Association inc., the Emerging Market Traders Association and the Foreign Exchange Committee.";
			owner_lazy = () -> com.tools20022.repository.codeset.DisruptionFallbackCode.mmObject();
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
	public static final DisruptionFallbackCode NonDeliverableSubstitute = new DisruptionFallbackCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NonDeliverableSubstitute";
			definition = "As per the 1998 FX and Currency Option Definitions published by the International Swaps and Derivatives Association inc., the Emerging Market Traders Association and the Foreign Exchange Committee.";
			owner_lazy = () -> com.tools20022.repository.codeset.DisruptionFallbackCode.mmObject();
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
	public static final DisruptionFallbackCode SettlementPostponement = new DisruptionFallbackCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementPostponement";
			definition = "As per the 1998 FX and Currency Option Definitions published by the International Swaps and Derivatives Association inc., the Emerging Market Traders Association and the Foreign Exchange Committee.";
			owner_lazy = () -> com.tools20022.repository.codeset.DisruptionFallbackCode.mmObject();
			codeName = "STPP";
		}
	};
	final static private LinkedHashMap<String, DisruptionFallbackCode> codesByName = new LinkedHashMap<>();

	protected DisruptionFallbackCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("AOCL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DisruptionFallbackCode";
				definition = "Identifies the method used to determine a settlement rate when a disruption event has occurred.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DisruptionFallbackCode.AssignmentOfClaim, com.tools20022.repository.codeset.DisruptionFallbackCode.CalculationAgentDeterminationOfSettlementRate,
						com.tools20022.repository.codeset.DisruptionFallbackCode.DeliverableSubstitute, com.tools20022.repository.codeset.DisruptionFallbackCode.EscrowArrangement,
						com.tools20022.repository.codeset.DisruptionFallbackCode.FallbackReferencePrice, com.tools20022.repository.codeset.DisruptionFallbackCode.LocalAssetSubstituteGross,
						com.tools20022.repository.codeset.DisruptionFallbackCode.LocalAssetSubstituteNet, com.tools20022.repository.codeset.DisruptionFallbackCode.LocalCurrencySubstitute,
						com.tools20022.repository.codeset.DisruptionFallbackCode.NoFaultTermination, com.tools20022.repository.codeset.DisruptionFallbackCode.NonDeliverableSubstitute,
						com.tools20022.repository.codeset.DisruptionFallbackCode.SettlementPostponement);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AssignmentOfClaim.getCodeName().get(), AssignmentOfClaim);
		codesByName.put(CalculationAgentDeterminationOfSettlementRate.getCodeName().get(), CalculationAgentDeterminationOfSettlementRate);
		codesByName.put(DeliverableSubstitute.getCodeName().get(), DeliverableSubstitute);
		codesByName.put(EscrowArrangement.getCodeName().get(), EscrowArrangement);
		codesByName.put(FallbackReferencePrice.getCodeName().get(), FallbackReferencePrice);
		codesByName.put(LocalAssetSubstituteGross.getCodeName().get(), LocalAssetSubstituteGross);
		codesByName.put(LocalAssetSubstituteNet.getCodeName().get(), LocalAssetSubstituteNet);
		codesByName.put(LocalCurrencySubstitute.getCodeName().get(), LocalCurrencySubstitute);
		codesByName.put(NoFaultTermination.getCodeName().get(), NoFaultTermination);
		codesByName.put(NonDeliverableSubstitute.getCodeName().get(), NonDeliverableSubstitute);
		codesByName.put(SettlementPostponement.getCodeName().get(), SettlementPostponement);
	}

	public static DisruptionFallbackCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DisruptionFallbackCode[] values() {
		DisruptionFallbackCode[] values = new DisruptionFallbackCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DisruptionFallbackCode> {
		@Override
		public DisruptionFallbackCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DisruptionFallbackCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}