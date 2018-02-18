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
import com.tools20022.repository.codeset.DisputeResolutionTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the nature of the disputed collateral amount.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DisputeResolutionTypeCode#ReconcileCollateral
 * DisputeResolutionTypeCode.ReconcileCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DisputeResolutionTypeCode#ReconcileExposure
 * DisputeResolutionTypeCode.ReconcileExposure}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DisputeResolutionTypeCode#ReconcileThreshold
 * DisputeResolutionTypeCode.ReconcileThreshold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DisputeResolutionTypeCode#ReconcileMinimumTransferAmount
 * DisputeResolutionTypeCode.ReconcileMinimumTransferAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DisputeResolutionTypeCode#ReconcileRounding
 * DisputeResolutionTypeCode.ReconcileRounding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DisputeResolutionTypeCode#ReconcileValuationFrequency
 * DisputeResolutionTypeCode.ReconcileValuationFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DisputeResolutionTypeCode#ReconcileNettedIndependentAmount
 * DisputeResolutionTypeCode.ReconcileNettedIndependentAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DisputeResolutionTypeCode#ReconcileSegregatedIndependentAmount
 * DisputeResolutionTypeCode.ReconcileSegregatedIndependentAmount}</li>
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
 * <li>"RECO"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DisputeResolutionTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the nature of the disputed collateral amount."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DisputeResolutionTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates that the disputed collateral amount should be confirmed through
	 * reconciliation of the collateral.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DisputeResolutionTypeCode
	 * DisputeResolutionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RECO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconcileCollateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the disputed collateral amount should be confirmed through reconciliation of the collateral."
	 * </li>
	 * </ul>
	 */
	public static final DisputeResolutionTypeCode ReconcileCollateral = new DisputeResolutionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconcileCollateral";
			definition = "Indicates that the disputed collateral amount should be confirmed through reconciliation of the collateral.";
			owner_lazy = () -> com.tools20022.repository.codeset.DisputeResolutionTypeCode.mmObject();
			codeName = "RECO";
		}
	};
	/**
	 * Indicates that the disputed collateral amount should be confirmed through
	 * reconciliation of the exposure.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DisputeResolutionTypeCode
	 * DisputeResolutionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REEX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconcileExposure"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the disputed collateral amount should be confirmed through reconciliation of the exposure."
	 * </li>
	 * </ul>
	 */
	public static final DisputeResolutionTypeCode ReconcileExposure = new DisputeResolutionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconcileExposure";
			definition = "Indicates that the disputed collateral amount should be confirmed through reconciliation of the exposure.";
			owner_lazy = () -> com.tools20022.repository.codeset.DisputeResolutionTypeCode.mmObject();
			codeName = "REEX";
		}
	};
	/**
	 * Indicates that the disputed collateral amount should be confirmed through
	 * reconciliation of the threshold.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DisputeResolutionTypeCode
	 * DisputeResolutionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RETH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconcileThreshold"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the disputed collateral amount should be confirmed through reconciliation of the threshold."
	 * </li>
	 * </ul>
	 */
	public static final DisputeResolutionTypeCode ReconcileThreshold = new DisputeResolutionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconcileThreshold";
			definition = "Indicates that the disputed collateral amount should be confirmed through reconciliation of the threshold.";
			owner_lazy = () -> com.tools20022.repository.codeset.DisputeResolutionTypeCode.mmObject();
			codeName = "RETH";
		}
	};
	/**
	 * Indicates that the disputed collateral amount should be confirmed through
	 * reconciliation of the minimum transfer amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DisputeResolutionTypeCode
	 * DisputeResolutionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RMTA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconcileMinimumTransferAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the disputed collateral amount should be confirmed through reconciliation of the minimum transfer amount."
	 * </li>
	 * </ul>
	 */
	public static final DisputeResolutionTypeCode ReconcileMinimumTransferAmount = new DisputeResolutionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconcileMinimumTransferAmount";
			definition = "Indicates that the disputed collateral amount should be confirmed through reconciliation of the minimum transfer amount.";
			owner_lazy = () -> com.tools20022.repository.codeset.DisputeResolutionTypeCode.mmObject();
			codeName = "RMTA";
		}
	};
	/**
	 * Indicates that the disputed collateral amount should be confirmed through
	 * reconciliation of the rounding.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DisputeResolutionTypeCode
	 * DisputeResolutionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RERO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconcileRounding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the disputed collateral amount should be confirmed through reconciliation of the rounding."
	 * </li>
	 * </ul>
	 */
	public static final DisputeResolutionTypeCode ReconcileRounding = new DisputeResolutionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconcileRounding";
			definition = "Indicates that the disputed collateral amount should be confirmed through reconciliation of the rounding.";
			owner_lazy = () -> com.tools20022.repository.codeset.DisputeResolutionTypeCode.mmObject();
			codeName = "RERO";
		}
	};
	/**
	 * Indicates that the disputed collateral amount should be confirmed through
	 * reconciliation of the valuation frequency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DisputeResolutionTypeCode
	 * DisputeResolutionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REVF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconcileValuationFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the disputed collateral amount should be confirmed through reconciliation of the valuation frequency."
	 * </li>
	 * </ul>
	 */
	public static final DisputeResolutionTypeCode ReconcileValuationFrequency = new DisputeResolutionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconcileValuationFrequency";
			definition = "Indicates that the disputed collateral amount should be confirmed through reconciliation of the valuation frequency.";
			owner_lazy = () -> com.tools20022.repository.codeset.DisputeResolutionTypeCode.mmObject();
			codeName = "REVF";
		}
	};
	/**
	 * Indicates that the disputed collateral amount should be confirmed through
	 * reconciliation of the independent amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DisputeResolutionTypeCode
	 * DisputeResolutionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RNIA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconcileNettedIndependentAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the disputed collateral amount should be confirmed through reconciliation of the independent amount."
	 * </li>
	 * </ul>
	 */
	public static final DisputeResolutionTypeCode ReconcileNettedIndependentAmount = new DisputeResolutionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconcileNettedIndependentAmount";
			definition = "Indicates that the disputed collateral amount should be confirmed through reconciliation of the independent amount.";
			owner_lazy = () -> com.tools20022.repository.codeset.DisputeResolutionTypeCode.mmObject();
			codeName = "RNIA";
		}
	};
	/**
	 * Indicates that the disputed collateral amount should be confirmed through
	 * reconciliation of the initial margin.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DisputeResolutionTypeCode
	 * DisputeResolutionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RESA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconcileSegregatedIndependentAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the disputed collateral amount should be confirmed through reconciliation of the initial margin."
	 * </li>
	 * </ul>
	 */
	public static final DisputeResolutionTypeCode ReconcileSegregatedIndependentAmount = new DisputeResolutionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconcileSegregatedIndependentAmount";
			definition = "Indicates that the disputed collateral amount should be confirmed through reconciliation of the initial margin.";
			owner_lazy = () -> com.tools20022.repository.codeset.DisputeResolutionTypeCode.mmObject();
			codeName = "RESA";
		}
	};
	final static private LinkedHashMap<String, DisputeResolutionTypeCode> codesByName = new LinkedHashMap<>();

	protected DisputeResolutionTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("RECO");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DisputeResolutionTypeCode";
				definition = "Specifies the nature of the disputed collateral amount.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DisputeResolutionTypeCode.ReconcileCollateral, com.tools20022.repository.codeset.DisputeResolutionTypeCode.ReconcileExposure,
						com.tools20022.repository.codeset.DisputeResolutionTypeCode.ReconcileThreshold, com.tools20022.repository.codeset.DisputeResolutionTypeCode.ReconcileMinimumTransferAmount,
						com.tools20022.repository.codeset.DisputeResolutionTypeCode.ReconcileRounding, com.tools20022.repository.codeset.DisputeResolutionTypeCode.ReconcileValuationFrequency,
						com.tools20022.repository.codeset.DisputeResolutionTypeCode.ReconcileNettedIndependentAmount, com.tools20022.repository.codeset.DisputeResolutionTypeCode.ReconcileSegregatedIndependentAmount);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ReconcileCollateral.getCodeName().get(), ReconcileCollateral);
		codesByName.put(ReconcileExposure.getCodeName().get(), ReconcileExposure);
		codesByName.put(ReconcileThreshold.getCodeName().get(), ReconcileThreshold);
		codesByName.put(ReconcileMinimumTransferAmount.getCodeName().get(), ReconcileMinimumTransferAmount);
		codesByName.put(ReconcileRounding.getCodeName().get(), ReconcileRounding);
		codesByName.put(ReconcileValuationFrequency.getCodeName().get(), ReconcileValuationFrequency);
		codesByName.put(ReconcileNettedIndependentAmount.getCodeName().get(), ReconcileNettedIndependentAmount);
		codesByName.put(ReconcileSegregatedIndependentAmount.getCodeName().get(), ReconcileSegregatedIndependentAmount);
	}

	public static DisputeResolutionTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DisputeResolutionTypeCode[] values() {
		DisputeResolutionTypeCode[] values = new DisputeResolutionTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DisputeResolutionTypeCode> {
		@Override
		public DisputeResolutionTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DisputeResolutionTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}