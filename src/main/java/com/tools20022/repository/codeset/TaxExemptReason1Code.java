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
import com.tools20022.repository.codeset.TaxExemptReasonCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the reason a specific tax has not been levied/deducted on a given
 * transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode
 * TaxExemptReasonCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#None
 * TaxExemptReason1Code.None}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#MaxiISA
 * TaxExemptReason1Code.MaxiISA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#MiniCashISA
 * TaxExemptReason1Code.MiniCashISA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#MiniStocksAndSharesISA
 * TaxExemptReason1Code.MiniStocksAndSharesISA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#MiniInsuranceISA
 * TaxExemptReason1Code.MiniInsuranceISA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#CurrentYearPayment
 * TaxExemptReason1Code.CurrentYearPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#PriorYearPayment
 * TaxExemptReason1Code.PriorYearPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#AssetTransfer
 * TaxExemptReason1Code.AssetTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#EmployeePriorYear
 * TaxExemptReason1Code.EmployeePriorYear}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#EmployeeCurrentYear
 * TaxExemptReason1Code.EmployeeCurrentYear}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#EmployerPriorYear
 * TaxExemptReason1Code.EmployerPriorYear}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#EmployerCurrentYear
 * TaxExemptReason1Code.EmployerCurrentYear}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#NonFundPrototypeIRA
 * TaxExemptReason1Code.NonFundPrototypeIRA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#NonFundQualifiedPlan
 * TaxExemptReason1Code.NonFundQualifiedPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#DefinedContributionPlan
 * TaxExemptReason1Code.DefinedContributionPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#IndividualRetirementAccount
 * TaxExemptReason1Code.IndividualRetirementAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#IndividualRetirementAccountRollover
 * TaxExemptReason1Code.IndividualRetirementAccountRollover}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#KEOGH
 * TaxExemptReason1Code.KEOGH}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#ProfitSharingPlan
 * TaxExemptReason1Code.ProfitSharingPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#FourHundredAndOneK
 * TaxExemptReason1Code.FourHundredAndOneK}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#SelfDirectedIRA
 * TaxExemptReason1Code.SelfDirectedIRA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#FourHundredAndThreeB
 * TaxExemptReason1Code.FourHundredAndThreeB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#FourHundredFiftySeven
 * TaxExemptReason1Code.FourHundredFiftySeven}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#RothIRAFundPrototype
 * TaxExemptReason1Code.RothIRAFundPrototype}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#RothIRANonPrototype
 * TaxExemptReason1Code.RothIRANonPrototype}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#RothConversionIRAFundPrototype
 * TaxExemptReason1Code.RothConversionIRAFundPrototype}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#RothConversionIRANonPrototype
 * TaxExemptReason1Code.RothConversionIRANonPrototype}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#EducationIRAFundPrototype
 * TaxExemptReason1Code.EducationIRAFundPrototype}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#EducationIRANonPrototype
 * TaxExemptReason1Code.EducationIRANonPrototype}</li>
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
public class TaxExemptReason1Code extends TaxExemptReasonCode {

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
	public static final MMCode None = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "None";
			owner_lazy = () -> TaxExemptReason1Code.mmObject();
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
	public static final MMCode MaxiISA = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaxiISA";
			owner_lazy = () -> TaxExemptReason1Code.mmObject();
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
	public static final MMCode MiniCashISA = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MiniCashISA";
			owner_lazy = () -> TaxExemptReason1Code.mmObject();
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
	public static final MMCode MiniStocksAndSharesISA = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MiniStocksAndSharesISA";
			owner_lazy = () -> TaxExemptReason1Code.mmObject();
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
	public static final MMCode MiniInsuranceISA = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MiniInsuranceISA";
			owner_lazy = () -> TaxExemptReason1Code.mmObject();
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
	public static final MMCode CurrentYearPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentYearPayment";
			owner_lazy = () -> TaxExemptReason1Code.mmObject();
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
	public static final MMCode PriorYearPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriorYearPayment";
			owner_lazy = () -> TaxExemptReason1Code.mmObject();
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
	public static final MMCode AssetTransfer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssetTransfer";
			owner_lazy = () -> TaxExemptReason1Code.mmObject();
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
	public static final MMCode EmployeePriorYear = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmployeePriorYear";
			owner_lazy = () -> TaxExemptReason1Code.mmObject();
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
	public static final MMCode EmployeeCurrentYear = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmployeeCurrentYear";
			owner_lazy = () -> TaxExemptReason1Code.mmObject();
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
	public static final MMCode EmployerPriorYear = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmployerPriorYear";
			owner_lazy = () -> TaxExemptReason1Code.mmObject();
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
	public static final MMCode EmployerCurrentYear = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmployerCurrentYear";
			owner_lazy = () -> TaxExemptReason1Code.mmObject();
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
	public static final MMCode NonFundPrototypeIRA = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonFundPrototypeIRA";
			owner_lazy = () -> TaxExemptReason1Code.mmObject();
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
	public static final MMCode NonFundQualifiedPlan = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonFundQualifiedPlan";
			owner_lazy = () -> TaxExemptReason1Code.mmObject();
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
	public static final MMCode DefinedContributionPlan = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefinedContributionPlan";
			owner_lazy = () -> TaxExemptReason1Code.mmObject();
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
	public static final MMCode IndividualRetirementAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndividualRetirementAccount";
			owner_lazy = () -> TaxExemptReason1Code.mmObject();
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
	public static final MMCode IndividualRetirementAccountRollover = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndividualRetirementAccountRollover";
			owner_lazy = () -> TaxExemptReason1Code.mmObject();
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
	public static final MMCode KEOGH = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KEOGH";
			owner_lazy = () -> TaxExemptReason1Code.mmObject();
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
	public static final MMCode ProfitSharingPlan = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProfitSharingPlan";
			owner_lazy = () -> TaxExemptReason1Code.mmObject();
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
	public static final MMCode FourHundredAndOneK = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FourHundredAndOneK";
			owner_lazy = () -> TaxExemptReason1Code.mmObject();
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
	public static final MMCode SelfDirectedIRA = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelfDirectedIRA";
			owner_lazy = () -> TaxExemptReason1Code.mmObject();
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
	public static final MMCode FourHundredAndThreeB = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FourHundredAndThreeB";
			owner_lazy = () -> TaxExemptReason1Code.mmObject();
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
	public static final MMCode FourHundredFiftySeven = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FourHundredFiftySeven";
			owner_lazy = () -> TaxExemptReason1Code.mmObject();
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
	public static final MMCode RothIRAFundPrototype = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RothIRAFundPrototype";
			owner_lazy = () -> TaxExemptReason1Code.mmObject();
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
	public static final MMCode RothIRANonPrototype = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RothIRANonPrototype";
			owner_lazy = () -> TaxExemptReason1Code.mmObject();
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
	public static final MMCode RothConversionIRAFundPrototype = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RothConversionIRAFundPrototype";
			owner_lazy = () -> TaxExemptReason1Code.mmObject();
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
	public static final MMCode RothConversionIRANonPrototype = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RothConversionIRANonPrototype";
			owner_lazy = () -> TaxExemptReason1Code.mmObject();
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
	public static final MMCode EducationIRAFundPrototype = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EducationIRAFundPrototype";
			owner_lazy = () -> TaxExemptReason1Code.mmObject();
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
	public static final MMCode EducationIRANonPrototype = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EducationIRANonPrototype";
			owner_lazy = () -> TaxExemptReason1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("NONE");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TaxExemptReason1Code";
				definition = "Specifies the reason a specific tax has not been levied/deducted on a given transaction.";
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
				trace_lazy = () -> TaxExemptReasonCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}