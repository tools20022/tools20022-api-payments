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
import com.tools20022.repository.codeset.TaxExemptReason1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason a specific tax has not been levied/deducted on a given
 * transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#None
 * TaxExemptReason1Code.mmNone}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#MaxiISA
 * TaxExemptReason1Code.mmMaxiISA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#MiniCashISA
 * TaxExemptReason1Code.mmMiniCashISA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#MiniStocksAndSharesISA
 * TaxExemptReason1Code.mmMiniStocksAndSharesISA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#MiniInsuranceISA
 * TaxExemptReason1Code.mmMiniInsuranceISA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#CurrentYearPayment
 * TaxExemptReason1Code.mmCurrentYearPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#PriorYearPayment
 * TaxExemptReason1Code.mmPriorYearPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#AssetTransfer
 * TaxExemptReason1Code.mmAssetTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#EmployeePriorYear
 * TaxExemptReason1Code.mmEmployeePriorYear}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#EmployeeCurrentYear
 * TaxExemptReason1Code.mmEmployeeCurrentYear}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#EmployerPriorYear
 * TaxExemptReason1Code.mmEmployerPriorYear}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#EmployerCurrentYear
 * TaxExemptReason1Code.mmEmployerCurrentYear}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#NonFundPrototypeIRA
 * TaxExemptReason1Code.mmNonFundPrototypeIRA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#NonFundQualifiedPlan
 * TaxExemptReason1Code.mmNonFundQualifiedPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#DefinedContributionPlan
 * TaxExemptReason1Code.mmDefinedContributionPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#IndividualRetirementAccount
 * TaxExemptReason1Code.mmIndividualRetirementAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#IndividualRetirementAccountRollover
 * TaxExemptReason1Code.mmIndividualRetirementAccountRollover}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#KEOGH
 * TaxExemptReason1Code.mmKEOGH}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#ProfitSharingPlan
 * TaxExemptReason1Code.mmProfitSharingPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#FourHundredAndOneK
 * TaxExemptReason1Code.mmFourHundredAndOneK}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#SelfDirectedIRA
 * TaxExemptReason1Code.mmSelfDirectedIRA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#FourHundredAndThreeB
 * TaxExemptReason1Code.mmFourHundredAndThreeB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#FourHundredFiftySeven
 * TaxExemptReason1Code.mmFourHundredFiftySeven}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#RothIRAFundPrototype
 * TaxExemptReason1Code.mmRothIRAFundPrototype}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#RothIRANonPrototype
 * TaxExemptReason1Code.mmRothIRANonPrototype}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#RothConversionIRAFundPrototype
 * TaxExemptReason1Code.mmRothConversionIRAFundPrototype}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#RothConversionIRANonPrototype
 * TaxExemptReason1Code.mmRothConversionIRANonPrototype}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#EducationIRAFundPrototype
 * TaxExemptReason1Code.mmEducationIRAFundPrototype}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#EducationIRANonPrototype
 * TaxExemptReason1Code.mmEducationIRANonPrototype}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode
 * TaxExemptReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"NONE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TaxExemptReason1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason a specific tax has not been levied/deducted on a given transaction."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TaxExemptReason1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code
	 * TaxExemptReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "None"</li>
	 * </ul>
	 */
	public static final TaxExemptReason1Code None = new TaxExemptReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "None";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmObject();
			codeName = TaxExemptReasonCode.None.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code
	 * TaxExemptReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaxiISA"</li>
	 * </ul>
	 */
	public static final TaxExemptReason1Code MaxiISA = new TaxExemptReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaxiISA";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmObject();
			codeName = TaxExemptReasonCode.MaxiISA.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code
	 * TaxExemptReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MiniCashISA"</li>
	 * </ul>
	 */
	public static final TaxExemptReason1Code MiniCashISA = new TaxExemptReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MiniCashISA";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmObject();
			codeName = TaxExemptReasonCode.MiniCashISA.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code
	 * TaxExemptReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MiniStocksAndSharesISA"</li>
	 * </ul>
	 */
	public static final TaxExemptReason1Code MiniStocksAndSharesISA = new TaxExemptReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MiniStocksAndSharesISA";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmObject();
			codeName = TaxExemptReasonCode.MiniStocksAndSharesISA.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code
	 * TaxExemptReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MiniInsuranceISA"</li>
	 * </ul>
	 */
	public static final TaxExemptReason1Code MiniInsuranceISA = new TaxExemptReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MiniInsuranceISA";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmObject();
			codeName = TaxExemptReasonCode.MiniInsuranceISA.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code
	 * TaxExemptReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentYearPayment"</li>
	 * </ul>
	 */
	public static final TaxExemptReason1Code CurrentYearPayment = new TaxExemptReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentYearPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmObject();
			codeName = TaxExemptReasonCode.CurrentYearPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code
	 * TaxExemptReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriorYearPayment"</li>
	 * </ul>
	 */
	public static final TaxExemptReason1Code PriorYearPayment = new TaxExemptReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriorYearPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmObject();
			codeName = TaxExemptReasonCode.PriorYearPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code
	 * TaxExemptReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssetTransfer"</li>
	 * </ul>
	 */
	public static final TaxExemptReason1Code AssetTransfer = new TaxExemptReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssetTransfer";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmObject();
			codeName = TaxExemptReasonCode.AssetTransfer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code
	 * TaxExemptReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EmployeePriorYear"</li>
	 * </ul>
	 */
	public static final TaxExemptReason1Code EmployeePriorYear = new TaxExemptReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmployeePriorYear";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmObject();
			codeName = TaxExemptReasonCode.EmployeePriorYear.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code
	 * TaxExemptReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EmployeeCurrentYear"</li>
	 * </ul>
	 */
	public static final TaxExemptReason1Code EmployeeCurrentYear = new TaxExemptReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmployeeCurrentYear";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmObject();
			codeName = TaxExemptReasonCode.EmployeeCurrentYear.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code
	 * TaxExemptReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EmployerPriorYear"</li>
	 * </ul>
	 */
	public static final TaxExemptReason1Code EmployerPriorYear = new TaxExemptReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmployerPriorYear";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmObject();
			codeName = TaxExemptReasonCode.EmployerPriorYear.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code
	 * TaxExemptReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EmployerCurrentYear"</li>
	 * </ul>
	 */
	public static final TaxExemptReason1Code EmployerCurrentYear = new TaxExemptReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmployerCurrentYear";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmObject();
			codeName = TaxExemptReasonCode.EmployerCurrentYear.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code
	 * TaxExemptReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonFundPrototypeIRA"</li>
	 * </ul>
	 */
	public static final TaxExemptReason1Code NonFundPrototypeIRA = new TaxExemptReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonFundPrototypeIRA";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmObject();
			codeName = TaxExemptReasonCode.NonFundPrototypeIRA.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code
	 * TaxExemptReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonFundQualifiedPlan"</li>
	 * </ul>
	 */
	public static final TaxExemptReason1Code NonFundQualifiedPlan = new TaxExemptReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonFundQualifiedPlan";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmObject();
			codeName = TaxExemptReasonCode.NonFundQualifiedPlan.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code
	 * TaxExemptReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefinedContributionPlan"</li>
	 * </ul>
	 */
	public static final TaxExemptReason1Code DefinedContributionPlan = new TaxExemptReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefinedContributionPlan";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmObject();
			codeName = TaxExemptReasonCode.DefinedContributionPlan.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code
	 * TaxExemptReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndividualRetirementAccount"</li>
	 * </ul>
	 */
	public static final TaxExemptReason1Code IndividualRetirementAccount = new TaxExemptReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndividualRetirementAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmObject();
			codeName = TaxExemptReasonCode.IndividualRetirementAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code
	 * TaxExemptReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndividualRetirementAccountRollover"</li>
	 * </ul>
	 */
	public static final TaxExemptReason1Code IndividualRetirementAccountRollover = new TaxExemptReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndividualRetirementAccountRollover";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmObject();
			codeName = TaxExemptReasonCode.IndividualRetirementAccountRollover.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code
	 * TaxExemptReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KEOGH"</li>
	 * </ul>
	 */
	public static final TaxExemptReason1Code KEOGH = new TaxExemptReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KEOGH";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmObject();
			codeName = TaxExemptReasonCode.KEOGH.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code
	 * TaxExemptReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProfitSharingPlan"</li>
	 * </ul>
	 */
	public static final TaxExemptReason1Code ProfitSharingPlan = new TaxExemptReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProfitSharingPlan";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmObject();
			codeName = TaxExemptReasonCode.ProfitSharingPlan.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code
	 * TaxExemptReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FourHundredAndOneK"</li>
	 * </ul>
	 */
	public static final TaxExemptReason1Code FourHundredAndOneK = new TaxExemptReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FourHundredAndOneK";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmObject();
			codeName = TaxExemptReasonCode.FourHundredAndOneK.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code
	 * TaxExemptReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SelfDirectedIRA"</li>
	 * </ul>
	 */
	public static final TaxExemptReason1Code SelfDirectedIRA = new TaxExemptReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelfDirectedIRA";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmObject();
			codeName = TaxExemptReasonCode.SelfDirectedIRA.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code
	 * TaxExemptReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FourHundredAndThreeB"</li>
	 * </ul>
	 */
	public static final TaxExemptReason1Code FourHundredAndThreeB = new TaxExemptReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FourHundredAndThreeB";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmObject();
			codeName = TaxExemptReasonCode.FourHundredAndThreeB.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code
	 * TaxExemptReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FourHundredFiftySeven"</li>
	 * </ul>
	 */
	public static final TaxExemptReason1Code FourHundredFiftySeven = new TaxExemptReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FourHundredFiftySeven";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmObject();
			codeName = TaxExemptReasonCode.FourHundredFiftySeven.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code
	 * TaxExemptReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RothIRAFundPrototype"</li>
	 * </ul>
	 */
	public static final TaxExemptReason1Code RothIRAFundPrototype = new TaxExemptReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RothIRAFundPrototype";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmObject();
			codeName = TaxExemptReasonCode.RothIRAFundPrototype.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code
	 * TaxExemptReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RothIRANonPrototype"</li>
	 * </ul>
	 */
	public static final TaxExemptReason1Code RothIRANonPrototype = new TaxExemptReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RothIRANonPrototype";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmObject();
			codeName = TaxExemptReasonCode.RothIRANonPrototype.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code
	 * TaxExemptReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RothConversionIRAFundPrototype"</li>
	 * </ul>
	 */
	public static final TaxExemptReason1Code RothConversionIRAFundPrototype = new TaxExemptReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RothConversionIRAFundPrototype";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmObject();
			codeName = TaxExemptReasonCode.RothConversionIRAFundPrototype.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code
	 * TaxExemptReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RothConversionIRANonPrototype"</li>
	 * </ul>
	 */
	public static final TaxExemptReason1Code RothConversionIRANonPrototype = new TaxExemptReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RothConversionIRANonPrototype";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmObject();
			codeName = TaxExemptReasonCode.RothConversionIRANonPrototype.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code
	 * TaxExemptReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EducationIRAFundPrototype"</li>
	 * </ul>
	 */
	public static final TaxExemptReason1Code EducationIRAFundPrototype = new TaxExemptReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EducationIRAFundPrototype";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmObject();
			codeName = TaxExemptReasonCode.EducationIRAFundPrototype.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code
	 * TaxExemptReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EducationIRANonPrototype"</li>
	 * </ul>
	 */
	public static final TaxExemptReason1Code EducationIRANonPrototype = new TaxExemptReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EducationIRANonPrototype";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmObject();
			codeName = TaxExemptReasonCode.EducationIRANonPrototype.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TaxExemptReason1Code> codesByName = new LinkedHashMap<>();

	protected TaxExemptReason1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("NONE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TaxExemptReason1Code";
				definition = "Specifies the reason a specific tax has not been levied/deducted on a given transaction.";
				trace_lazy = () -> TaxExemptReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TaxExemptReason1Code.None, com.tools20022.repository.codeset.TaxExemptReason1Code.MaxiISA,
						com.tools20022.repository.codeset.TaxExemptReason1Code.MiniCashISA, com.tools20022.repository.codeset.TaxExemptReason1Code.MiniStocksAndSharesISA,
						com.tools20022.repository.codeset.TaxExemptReason1Code.MiniInsuranceISA, com.tools20022.repository.codeset.TaxExemptReason1Code.CurrentYearPayment,
						com.tools20022.repository.codeset.TaxExemptReason1Code.PriorYearPayment, com.tools20022.repository.codeset.TaxExemptReason1Code.AssetTransfer,
						com.tools20022.repository.codeset.TaxExemptReason1Code.EmployeePriorYear, com.tools20022.repository.codeset.TaxExemptReason1Code.EmployeeCurrentYear,
						com.tools20022.repository.codeset.TaxExemptReason1Code.EmployerPriorYear, com.tools20022.repository.codeset.TaxExemptReason1Code.EmployerCurrentYear,
						com.tools20022.repository.codeset.TaxExemptReason1Code.NonFundPrototypeIRA, com.tools20022.repository.codeset.TaxExemptReason1Code.NonFundQualifiedPlan,
						com.tools20022.repository.codeset.TaxExemptReason1Code.DefinedContributionPlan, com.tools20022.repository.codeset.TaxExemptReason1Code.IndividualRetirementAccount,
						com.tools20022.repository.codeset.TaxExemptReason1Code.IndividualRetirementAccountRollover, com.tools20022.repository.codeset.TaxExemptReason1Code.KEOGH,
						com.tools20022.repository.codeset.TaxExemptReason1Code.ProfitSharingPlan, com.tools20022.repository.codeset.TaxExemptReason1Code.FourHundredAndOneK,
						com.tools20022.repository.codeset.TaxExemptReason1Code.SelfDirectedIRA, com.tools20022.repository.codeset.TaxExemptReason1Code.FourHundredAndThreeB,
						com.tools20022.repository.codeset.TaxExemptReason1Code.FourHundredFiftySeven, com.tools20022.repository.codeset.TaxExemptReason1Code.RothIRAFundPrototype,
						com.tools20022.repository.codeset.TaxExemptReason1Code.RothIRANonPrototype, com.tools20022.repository.codeset.TaxExemptReason1Code.RothConversionIRAFundPrototype,
						com.tools20022.repository.codeset.TaxExemptReason1Code.RothConversionIRANonPrototype, com.tools20022.repository.codeset.TaxExemptReason1Code.EducationIRAFundPrototype,
						com.tools20022.repository.codeset.TaxExemptReason1Code.EducationIRANonPrototype);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(None.getCodeName().get(), None);
		codesByName.put(MaxiISA.getCodeName().get(), MaxiISA);
		codesByName.put(MiniCashISA.getCodeName().get(), MiniCashISA);
		codesByName.put(MiniStocksAndSharesISA.getCodeName().get(), MiniStocksAndSharesISA);
		codesByName.put(MiniInsuranceISA.getCodeName().get(), MiniInsuranceISA);
		codesByName.put(CurrentYearPayment.getCodeName().get(), CurrentYearPayment);
		codesByName.put(PriorYearPayment.getCodeName().get(), PriorYearPayment);
		codesByName.put(AssetTransfer.getCodeName().get(), AssetTransfer);
		codesByName.put(EmployeePriorYear.getCodeName().get(), EmployeePriorYear);
		codesByName.put(EmployeeCurrentYear.getCodeName().get(), EmployeeCurrentYear);
		codesByName.put(EmployerPriorYear.getCodeName().get(), EmployerPriorYear);
		codesByName.put(EmployerCurrentYear.getCodeName().get(), EmployerCurrentYear);
		codesByName.put(NonFundPrototypeIRA.getCodeName().get(), NonFundPrototypeIRA);
		codesByName.put(NonFundQualifiedPlan.getCodeName().get(), NonFundQualifiedPlan);
		codesByName.put(DefinedContributionPlan.getCodeName().get(), DefinedContributionPlan);
		codesByName.put(IndividualRetirementAccount.getCodeName().get(), IndividualRetirementAccount);
		codesByName.put(IndividualRetirementAccountRollover.getCodeName().get(), IndividualRetirementAccountRollover);
		codesByName.put(KEOGH.getCodeName().get(), KEOGH);
		codesByName.put(ProfitSharingPlan.getCodeName().get(), ProfitSharingPlan);
		codesByName.put(FourHundredAndOneK.getCodeName().get(), FourHundredAndOneK);
		codesByName.put(SelfDirectedIRA.getCodeName().get(), SelfDirectedIRA);
		codesByName.put(FourHundredAndThreeB.getCodeName().get(), FourHundredAndThreeB);
		codesByName.put(FourHundredFiftySeven.getCodeName().get(), FourHundredFiftySeven);
		codesByName.put(RothIRAFundPrototype.getCodeName().get(), RothIRAFundPrototype);
		codesByName.put(RothIRANonPrototype.getCodeName().get(), RothIRANonPrototype);
		codesByName.put(RothConversionIRAFundPrototype.getCodeName().get(), RothConversionIRAFundPrototype);
		codesByName.put(RothConversionIRANonPrototype.getCodeName().get(), RothConversionIRANonPrototype);
		codesByName.put(EducationIRAFundPrototype.getCodeName().get(), EducationIRAFundPrototype);
		codesByName.put(EducationIRANonPrototype.getCodeName().get(), EducationIRANonPrototype);
	}

	public static TaxExemptReason1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TaxExemptReason1Code[] values() {
		TaxExemptReason1Code[] values = new TaxExemptReason1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TaxExemptReason1Code> {
		@Override
		public TaxExemptReason1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TaxExemptReason1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}