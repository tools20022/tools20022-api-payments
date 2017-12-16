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
import com.tools20022.repository.codeset.TaxExemptReasonCode.InternalXmlAdapter;
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
 * <li>{@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode#None
 * TaxExemptReasonCode.mmNone}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode#MaxiISA
 * TaxExemptReasonCode.mmMaxiISA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode#MiniCashISA
 * TaxExemptReasonCode.mmMiniCashISA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode#MiniStocksAndSharesISA
 * TaxExemptReasonCode.mmMiniStocksAndSharesISA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode#MiniInsuranceISA
 * TaxExemptReasonCode.mmMiniInsuranceISA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode#CurrentYearPayment
 * TaxExemptReasonCode.mmCurrentYearPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode#PriorYearPayment
 * TaxExemptReasonCode.mmPriorYearPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode#AssetTransfer
 * TaxExemptReasonCode.mmAssetTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode#EmployeePriorYear
 * TaxExemptReasonCode.mmEmployeePriorYear}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode#EmployeeCurrentYear
 * TaxExemptReasonCode.mmEmployeeCurrentYear}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode#EmployerPriorYear
 * TaxExemptReasonCode.mmEmployerPriorYear}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode#EmployerCurrentYear
 * TaxExemptReasonCode.mmEmployerCurrentYear}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode#NonFundPrototypeIRA
 * TaxExemptReasonCode.mmNonFundPrototypeIRA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode#NonFundQualifiedPlan
 * TaxExemptReasonCode.mmNonFundQualifiedPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode#DefinedContributionPlan
 * TaxExemptReasonCode.mmDefinedContributionPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode#IndividualRetirementAccount
 * TaxExemptReasonCode.mmIndividualRetirementAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode#IndividualRetirementAccountRollover
 * TaxExemptReasonCode.mmIndividualRetirementAccountRollover}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode#KEOGH
 * TaxExemptReasonCode.mmKEOGH}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode#ProfitSharingPlan
 * TaxExemptReasonCode.mmProfitSharingPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode#FourHundredAndOneK
 * TaxExemptReasonCode.mmFourHundredAndOneK}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode#SelfDirectedIRA
 * TaxExemptReasonCode.mmSelfDirectedIRA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode#FourHundredAndThreeB
 * TaxExemptReasonCode.mmFourHundredAndThreeB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode#FourHundredFiftySeven
 * TaxExemptReasonCode.mmFourHundredFiftySeven}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode#RothIRAFundPrototype
 * TaxExemptReasonCode.mmRothIRAFundPrototype}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode#RothIRANonPrototype
 * TaxExemptReasonCode.mmRothIRANonPrototype}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode#RothConversionIRAFundPrototype
 * TaxExemptReasonCode.mmRothConversionIRAFundPrototype}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode#RothConversionIRANonPrototype
 * TaxExemptReasonCode.mmRothConversionIRANonPrototype}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode#EducationIRAFundPrototype
 * TaxExemptReasonCode.mmEducationIRAFundPrototype}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode#EducationIRANonPrototype
 * TaxExemptReasonCode.mmEducationIRANonPrototype}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode#Other
 * TaxExemptReasonCode.mmOther}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode#Minor
 * TaxExemptReasonCode.mmMinor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode#Incapacity
 * TaxExemptReasonCode.mmIncapacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode#Foreigner
 * TaxExemptReasonCode.mmForeigner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode#Ordinary
 * TaxExemptReasonCode.mmOrdinary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode#Association
 * TaxExemptReasonCode.mmAssociation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode#Domestic
 * TaxExemptReasonCode.mmDomestic}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode#OneOrBothForeign
 * TaxExemptReasonCode.mmOneOrBothForeign}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode#RightsHolder
 * TaxExemptReasonCode.mmRightsHolder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode#PensionFund
 * TaxExemptReasonCode.mmPensionFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode#Diplomat
 * TaxExemptReasonCode.mmDiplomat}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode#Refugee
 * TaxExemptReasonCode.mmRefugee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode#OneNonResident
 * TaxExemptReasonCode.mmOneNonResident}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode#TwoNonResident
 * TaxExemptReasonCode.mmTwoNonResident}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode#Administrator
 * TaxExemptReasonCode.mmAdministrator}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code
 * TaxExemptReason1Code}</li>
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
 * <li>"NONE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TaxExemptReasonCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason a specific tax has not been levied/deducted on a given transaction."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TaxExemptReasonCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Account is not tax exempt.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode
	 * TaxExemptReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NONE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "None"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account is not tax exempt."</li>
	 * </ul>
	 */
	public static final TaxExemptReasonCode None = new TaxExemptReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "None";
			definition = "Account is not tax exempt.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReasonCode.mmObject();
			codeName = "NONE";
		}
	};
	/**
	 * Maxi Individual Savings Account (ISA). Account is an ISA with a single
	 * ISA manager that may contain cash, stocks and shares, investment funds
	 * and life assurance up to the prescribed annual subscription limit
	 * (required for UK). The Maxi ISA allows an investor to save all three of
	 * the different elements of ISA investments that are allowed, with one
	 * savings institution in a single account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode
	 * TaxExemptReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MASA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaxiISA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maxi Individual Savings Account (ISA). Account is an ISA with a single ISA manager that may contain cash, stocks and shares, investment funds and life assurance up to the prescribed annual subscription limit (required for UK). The Maxi ISA allows an investor to save all three of the different elements of ISA investments that are allowed, with one savings institution in a single account."
	 * </li>
	 * </ul>
	 */
	public static final TaxExemptReasonCode MaxiISA = new TaxExemptReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaxiISA";
			definition = "Maxi Individual Savings Account (ISA). Account is an ISA with a single ISA manager that may contain cash, stocks and shares, investment funds and life assurance up to the prescribed annual subscription limit (required for UK). The Maxi ISA allows an investor to save all three of the different elements of ISA investments that are allowed, with one savings institution in a single account.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReasonCode.mmObject();
			codeName = "MASA";
		}
	};
	/**
	 * Mini Cash Individual Savings Account (ISA). Account is an ISA with a
	 * single ISA manager that may contain cash, stocks and shares, investment
	 * funds and life assurance up to the prescribed annual subscription limit
	 * (required for UK). An investor can hold more than one Mini ISA to utilise
	 * the overall Mini ISA investment limit, and can invest with more than one
	 * savings institution, however only one of the three elements of ISA
	 * investment is allowed in a single account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode
	 * TaxExemptReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MISA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MiniCashISA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Mini Cash Individual Savings Account (ISA). Account is an ISA with a single ISA manager that may contain cash, stocks and shares, investment funds and life assurance up to the prescribed annual subscription limit (required for UK). An investor can hold more than one Mini ISA to utilise the overall Mini ISA investment limit, and can invest with more than one savings institution, however only one of the three elements of ISA investment is allowed in a single account."
	 * </li>
	 * </ul>
	 */
	public static final TaxExemptReasonCode MiniCashISA = new TaxExemptReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MiniCashISA";
			definition = "Mini Cash Individual Savings Account (ISA). Account is an ISA with a single ISA manager that may contain cash, stocks and shares, investment funds and life assurance up to the prescribed annual subscription limit (required for UK). An investor can hold more than one Mini ISA to utilise the overall Mini ISA investment limit, and can invest with more than one savings institution, however only one of the three elements of ISA investment is allowed in a single account.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReasonCode.mmObject();
			codeName = "MISA";
		}
	};
	/**
	 * Mini Stocks and Shares Individual Savings Account (ISA). Account is an
	 * ISA with an ISA manager that may only contain stocks, shares and
	 * collective investments up to the prescribed annual subscription limit
	 * (required for UK).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode
	 * TaxExemptReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SISA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MiniStocksAndSharesISA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Mini Stocks and Shares Individual Savings Account (ISA). Account is an ISA with an ISA manager that may only contain stocks, shares and collective investments up to the prescribed annual subscription limit (required for UK)."
	 * </li>
	 * </ul>
	 */
	public static final TaxExemptReasonCode MiniStocksAndSharesISA = new TaxExemptReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MiniStocksAndSharesISA";
			definition = "Mini Stocks and Shares Individual Savings Account (ISA). Account is an ISA with an ISA manager that may only contain stocks, shares and collective investments up to the prescribed annual subscription limit (required for UK).";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReasonCode.mmObject();
			codeName = "SISA";
		}
	};
	/**
	 * Mini Insurance Individual Savings Account (ISA). Account is an ISA with
	 * an ISA manager that may only contain life insurance investments up to the
	 * prescribed annual subscription limit (required for UK).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode
	 * TaxExemptReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IISA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MiniInsuranceISA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Mini Insurance Individual Savings Account (ISA). Account is an ISA  with an ISA manager that may only contain life insurance investments up to the prescribed annual subscription limit (required for UK)."
	 * </li>
	 * </ul>
	 */
	public static final TaxExemptReasonCode MiniInsuranceISA = new TaxExemptReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MiniInsuranceISA";
			definition = "Mini Insurance Individual Savings Account (ISA). Account is an ISA  with an ISA manager that may only contain life insurance investments up to the prescribed annual subscription limit (required for UK).";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReasonCode.mmObject();
			codeName = "IISA";
		}
	};
	/**
	 * Account is for current year payments into an investment retirement
	 * account (required for US).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode
	 * TaxExemptReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CUYP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentYearPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account is for current year payments into an investment retirement account (required for US)."
	 * </li>
	 * </ul>
	 */
	public static final TaxExemptReasonCode CurrentYearPayment = new TaxExemptReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CurrentYearPayment";
			definition = "Account is for current year payments into an investment retirement account (required for US).";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReasonCode.mmObject();
			codeName = "CUYP";
		}
	};
	/**
	 * Account is for a prior year payment into an investment retirement account
	 * (required for US).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode
	 * TaxExemptReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRYP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriorYearPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account is for a prior year payment into an investment retirement account (required for US)."
	 * </li>
	 * </ul>
	 */
	public static final TaxExemptReasonCode PriorYearPayment = new TaxExemptReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PriorYearPayment";
			definition = "Account is for a prior year payment into an investment retirement account (required for US).";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReasonCode.mmObject();
			codeName = "PRYP";
		}
	};
	/**
	 * Account is for an asset transfer into an investment retirement account
	 * (required for US).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode
	 * TaxExemptReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ASTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssetTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account is for an asset transfer into an investment retirement account (required for US)."
	 * </li>
	 * </ul>
	 */
	public static final TaxExemptReasonCode AssetTransfer = new TaxExemptReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AssetTransfer";
			definition = "Account is for an asset transfer into an investment retirement account (required for US).";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReasonCode.mmObject();
			codeName = "ASTR";
		}
	};
	/**
	 * Account is for employee - prior year contributions into an investment
	 * retirement account (required for US).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode
	 * TaxExemptReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EMPY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EmployeePriorYear"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account is for employee - prior year contributions into an investment retirement account (required for US)."
	 * </li>
	 * </ul>
	 */
	public static final TaxExemptReasonCode EmployeePriorYear = new TaxExemptReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EmployeePriorYear";
			definition = "Account is for employee - prior year contributions into an investment retirement account (required for US).";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReasonCode.mmObject();
			codeName = "EMPY";
		}
	};
	/**
	 * Account is for employee - current year contributions into an investment
	 * retirement account (required for US).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode
	 * TaxExemptReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EMCY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EmployeeCurrentYear"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account is for employee - current year contributions into an investment retirement account (required for US)."
	 * </li>
	 * </ul>
	 */
	public static final TaxExemptReasonCode EmployeeCurrentYear = new TaxExemptReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EmployeeCurrentYear";
			definition = "Account is for employee - current year contributions into an investment retirement account (required for US).";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReasonCode.mmObject();
			codeName = "EMCY";
		}
	};
	/**
	 * Account is for employer - prior year contributions into an investment
	 * retirement account (required for US).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode
	 * TaxExemptReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EPRY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EmployerPriorYear"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account is for employer - prior year contributions into an investment retirement account (required for US)."
	 * </li>
	 * </ul>
	 */
	public static final TaxExemptReasonCode EmployerPriorYear = new TaxExemptReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EmployerPriorYear";
			definition = "Account is for employer - prior year contributions into an investment retirement account (required for US).";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReasonCode.mmObject();
			codeName = "EPRY";
		}
	};
	/**
	 * Account is for employer - current year contributions into an investment
	 * retirement account (required for US).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode
	 * TaxExemptReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ECYE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EmployerCurrentYear"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account is for employer - current year contributions into an investment retirement account (required for US)."
	 * </li>
	 * </ul>
	 */
	public static final TaxExemptReasonCode EmployerCurrentYear = new TaxExemptReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EmployerCurrentYear";
			definition = "Account is for employer - current year contributions into an investment retirement account (required for US).";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReasonCode.mmObject();
			codeName = "ECYE";
		}
	};
	/**
	 * Account is for non-fund prototype Individual Retirement Account (IRA)
	 * into an investment retirement account (required for US).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode
	 * TaxExemptReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NFPI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonFundPrototypeIRA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account is for non-fund prototype Individual Retirement Account (IRA) into an investment retirement account (required for US)."
	 * </li>
	 * </ul>
	 */
	public static final TaxExemptReasonCode NonFundPrototypeIRA = new TaxExemptReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NonFundPrototypeIRA";
			definition = "Account is for non-fund prototype Individual Retirement Account (IRA) into an investment retirement account (required for US).";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReasonCode.mmObject();
			codeName = "NFPI";
		}
	};
	/**
	 * Account is for non-fund qualified plan into an investment retirement
	 * account (required for US).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode
	 * TaxExemptReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NFQP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonFundQualifiedPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account is for non-fund qualified plan into an investment retirement account (required for US)."
	 * </li>
	 * </ul>
	 */
	public static final TaxExemptReasonCode NonFundQualifiedPlan = new TaxExemptReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NonFundQualifiedPlan";
			definition = "Account is for non-fund qualified plan into an investment retirement account (required for US).";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReasonCode.mmObject();
			codeName = "NFQP";
		}
	};
	/**
	 * Account is for a defined contribution plan (required for US).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode
	 * TaxExemptReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DECP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefinedContributionPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account is for a defined contribution plan (required for US)."</li>
	 * </ul>
	 */
	public static final TaxExemptReasonCode DefinedContributionPlan = new TaxExemptReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DefinedContributionPlan";
			definition = "Account is for a defined contribution plan (required for US).";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReasonCode.mmObject();
			codeName = "DECP";
		}
	};
	/**
	 * Account is an Individual Retirement Account (IRA) (required for US).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode
	 * TaxExemptReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IRAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndividualRetirementAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account is an Individual Retirement Account (IRA) (required for US)."</li>
	 * </ul>
	 */
	public static final TaxExemptReasonCode IndividualRetirementAccount = new TaxExemptReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IndividualRetirementAccount";
			definition = "Account is an Individual Retirement Account (IRA) (required for US).";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReasonCode.mmObject();
			codeName = "IRAC";
		}
	};
	/**
	 * Account is for an Individual Retirement Account (IRA) - Rollover
	 * (required for US).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode
	 * TaxExemptReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IRAR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndividualRetirementAccountRollover"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account is for an Individual Retirement Account (IRA) - Rollover (required for US)."
	 * </li>
	 * </ul>
	 */
	public static final TaxExemptReasonCode IndividualRetirementAccountRollover = new TaxExemptReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IndividualRetirementAccountRollover";
			definition = "Account is for an Individual Retirement Account (IRA) - Rollover (required for US).";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReasonCode.mmObject();
			codeName = "IRAR";
		}
	};
	/**
	 * KEOGH. Account is a tax-deferred retirement plan designed to help
	 * self-employed workers or individuals who earn self-employed income
	 * establish a retirement savings program (required for US).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode
	 * TaxExemptReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "KEOG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KEOGH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "KEOGH. Account is a tax-deferred retirement plan designed to help self-employed workers or individuals who earn self-employed income establish a retirement savings program (required for US)."
	 * </li>
	 * </ul>
	 */
	public static final TaxExemptReasonCode KEOGH = new TaxExemptReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "KEOGH";
			definition = "KEOGH. Account is a tax-deferred retirement plan designed to help self-employed workers or individuals who earn self-employed income establish a retirement savings program (required for US).";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReasonCode.mmObject();
			codeName = "KEOG";
		}
	};
	/**
	 * Account is a Profit Sharing Plan (required for US).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode
	 * TaxExemptReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PFSP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProfitSharingPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account is a Profit Sharing Plan (required for US)."</li>
	 * </ul>
	 */
	public static final TaxExemptReasonCode ProfitSharingPlan = new TaxExemptReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProfitSharingPlan";
			definition = "Account is a Profit Sharing Plan (required for US).";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReasonCode.mmObject();
			codeName = "PFSP";
		}
	};
	/**
	 * 401k. Account is an optional retirement plan supported by many companies,
	 * in which income is invested before it is taxed (required for US).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode
	 * TaxExemptReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "401K"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FourHundredAndOneK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "401k. Account is an optional retirement plan supported by many companies, in which income is invested before it is taxed (required for US)."
	 * </li>
	 * </ul>
	 */
	public static final TaxExemptReasonCode FourHundredAndOneK = new TaxExemptReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FourHundredAndOneK";
			definition = "401k. Account is an optional retirement plan supported by many companies, in which income is invested before it is taxed (required for US).";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReasonCode.mmObject();
			codeName = "401K";
		}
	};
	/**
	 * Self-Directed Individual Retirement Account (IRA) (required for US).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode
	 * TaxExemptReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SIRA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SelfDirectedIRA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Self-Directed Individual Retirement Account (IRA) (required for US)."</li>
	 * </ul>
	 */
	public static final TaxExemptReasonCode SelfDirectedIRA = new TaxExemptReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SelfDirectedIRA";
			definition = "Self-Directed Individual Retirement Account (IRA) (required for US).";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReasonCode.mmObject();
			codeName = "SIRA";
		}
	};
	/**
	 * 403(b). Account is a tax-deferred investment and savings program for
	 * employees of hospitals, educational institutions and other non-profit
	 * organisations, to save and invest in their own retirement. The name
	 * refers to the relevant section in the US Internal Revenue Code (required
	 * for US).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode
	 * TaxExemptReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "403B"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FourHundredAndThreeB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "403(b). Account is a tax-deferred investment and savings program for employees of hospitals, educational institutions and other non-profit organisations, to save and invest in their own retirement. The name refers to the relevant section in the US Internal Revenue Code (required for US)."
	 * </li>
	 * </ul>
	 */
	public static final TaxExemptReasonCode FourHundredAndThreeB = new TaxExemptReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FourHundredAndThreeB";
			definition = "403(b). Account is a tax-deferred investment and savings program for employees of hospitals, educational institutions and other non-profit organisations, to save and invest in their own retirement. The name refers to the relevant section in the US Internal Revenue Code (required for US).";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReasonCode.mmObject();
			codeName = "403B";
		}
	};
	/**
	 * 457. Account is a non-qualified deferred compensation program that is
	 * available to state and local governments and not-for-profit employers
	 * (required for US).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode
	 * TaxExemptReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "457X"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FourHundredFiftySeven"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "457. Account is a non-qualified deferred compensation program that is available to state and local governments and not-for-profit employers (required for US)."
	 * </li>
	 * </ul>
	 */
	public static final TaxExemptReasonCode FourHundredFiftySeven = new TaxExemptReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FourHundredFiftySeven";
			definition = "457. Account is a non-qualified deferred compensation program that is available to state and local governments and not-for-profit employers (required for US).";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReasonCode.mmObject();
			codeName = "457X";
		}
	};
	/**
	 * Roth Individual Retirement Account (IRA) Fund Prototype. Account is a
	 * tax-deferred retirement account based on the reverse principle of a
	 * traditional IRA. Retirement contributions are taxed upfront, but
	 * withdrawals may be made tax-free when a certain age is reached, provided
	 * the Roth IRA has been set up for a certain period of time (required for
	 * US).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode
	 * TaxExemptReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RIRA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RothIRAFundPrototype"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Roth Individual Retirement Account (IRA) Fund Prototype. Account is a tax-deferred retirement account based on the reverse principle of a traditional IRA. Retirement contributions are taxed upfront, but withdrawals may be made tax-free when a certain age is reached, provided the Roth IRA has been set up for a certain period of time (required for US)."
	 * </li>
	 * </ul>
	 */
	public static final TaxExemptReasonCode RothIRAFundPrototype = new TaxExemptReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RothIRAFundPrototype";
			definition = "Roth Individual Retirement Account (IRA) Fund Prototype. Account is a tax-deferred retirement account based on the reverse principle of a traditional IRA. Retirement contributions are taxed upfront, but withdrawals may be made tax-free when a certain age is reached, provided the Roth IRA has been set up for a certain period of time (required for US).";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReasonCode.mmObject();
			codeName = "RIRA";
		}
	};
	/**
	 * Roth Individual Retirement Account (IRA) Non-Prototype. Account is a
	 * tax-deferred retirement account based on the reverse principle of a
	 * traditional IRA. Retirement contributions are taxed upfront, but
	 * withdrawals may be made tax-free when a certain age is reached, provided
	 * the Roth IRA has been set up for a certain period of time (required for
	 * US).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode
	 * TaxExemptReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RIAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RothIRANonPrototype"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Roth Individual Retirement Account (IRA) Non-Prototype. Account is a tax-deferred retirement account based on the reverse principle of a traditional IRA. Retirement contributions are taxed upfront, but withdrawals may be made tax-free when a certain age is reached, provided the Roth IRA has been set up for a certain period of time (required for US)."
	 * </li>
	 * </ul>
	 */
	public static final TaxExemptReasonCode RothIRANonPrototype = new TaxExemptReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RothIRANonPrototype";
			definition = "Roth Individual Retirement Account (IRA) Non-Prototype. Account is a tax-deferred retirement account based on the reverse principle of a traditional IRA. Retirement contributions are taxed upfront, but withdrawals may be made tax-free when a certain age is reached, provided the Roth IRA has been set up for a certain period of time (required for US).";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReasonCode.mmObject();
			codeName = "RIAN";
		}
	};
	/**
	 * Roth Conversion Individual Retirement Account (IRA) Fund Prototype.
	 * Account is a retirement account established when a party switches from a
	 * regular IRA ( required for US).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode
	 * TaxExemptReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RCRF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RothConversionIRAFundPrototype"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Roth Conversion Individual Retirement Account (IRA) Fund Prototype. Account is a retirement account established when a party switches from a regular IRA ( required for US)."
	 * </li>
	 * </ul>
	 */
	public static final TaxExemptReasonCode RothConversionIRAFundPrototype = new TaxExemptReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RothConversionIRAFundPrototype";
			definition = "Roth Conversion Individual Retirement Account (IRA) Fund Prototype. Account is a retirement account established when a party switches from a regular IRA ( required for US).";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReasonCode.mmObject();
			codeName = "RCRF";
		}
	};
	/**
	 * Roth Conversion Individual Retirement Account (IRA) Non-Prototype.
	 * Account is a retirement account established when a party switches from a
	 * Regular IRA (required for US).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode
	 * TaxExemptReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RCIP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RothConversionIRANonPrototype"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Roth Conversion Individual Retirement Account (IRA) Non-Prototype. Account is a retirement account established when a party switches from a Regular IRA (required for US)."
	 * </li>
	 * </ul>
	 */
	public static final TaxExemptReasonCode RothConversionIRANonPrototype = new TaxExemptReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RothConversionIRANonPrototype";
			definition = "Roth Conversion Individual Retirement Account (IRA) Non-Prototype. Account is a retirement account established when a party switches from a Regular IRA (required for US).";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReasonCode.mmObject();
			codeName = "RCIP";
		}
	};
	/**
	 * Education Individual Retirement Account Fund Prototype (also known as an
	 * Education Savings Account). Account is a savings plan open to anyone
	 * under the age of 18. When the account owner withdraws money to pay for
	 * qualified higher education expenses, the withdrawals are generally
	 * tax-free (required for US).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode
	 * TaxExemptReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EIFP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EducationIRAFundPrototype"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Education Individual Retirement Account Fund Prototype (also known as an Education Savings Account). Account is a savings plan open to anyone under the age of 18. When the account owner withdraws money to pay for qualified higher education expenses, the withdrawals are generally tax-free (required for US)."
	 * </li>
	 * </ul>
	 */
	public static final TaxExemptReasonCode EducationIRAFundPrototype = new TaxExemptReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EducationIRAFundPrototype";
			definition = "Education Individual Retirement Account Fund Prototype (also known as an Education Savings Account). Account is a savings plan open to anyone under the age of 18. When the account owner withdraws money to pay for qualified higher education expenses, the withdrawals are generally tax-free (required for US).";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReasonCode.mmObject();
			codeName = "EIFP";
		}
	};
	/**
	 * Education Individual Retirement Account Non-Prototype (also known as an
	 * Education Savings Account). Account is a savings plan open to anyone
	 * under the age of 18. When the account owner withdraws money to pay for
	 * qualified higher education expenses, the withdrawals are generally
	 * tax-free (required in the US).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode
	 * TaxExemptReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EIOP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EducationIRANonPrototype"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Education Individual Retirement Account Non-Prototype (also known as an Education Savings Account).  Account is a savings plan open to anyone under the age of 18. When the account owner withdraws money to pay for qualified higher education expenses, the withdrawals are generally tax-free (required in the US)."
	 * </li>
	 * </ul>
	 */
	public static final TaxExemptReasonCode EducationIRANonPrototype = new TaxExemptReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EducationIRANonPrototype";
			definition = "Education Individual Retirement Account Non-Prototype (also known as an Education Savings Account).  Account is a savings plan open to anyone under the age of 18. When the account owner withdraws money to pay for qualified higher education expenses, the withdrawals are generally tax-free (required in the US).";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReasonCode.mmObject();
			codeName = "EIOP";
		}
	};
	/**
	 * Another type of tax exemption.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode
	 * TaxExemptReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Another type of tax exemption."</li>
	 * </ul>
	 */
	public static final TaxExemptReasonCode Other = new TaxExemptReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Other";
			definition = "Another type of tax exemption.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReasonCode.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Account is for a minor for which a tax exemption is permitted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode
	 * TaxExemptReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MINO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Minor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account is for a minor for which a tax exemption is permitted."</li>
	 * </ul>
	 */
	public static final TaxExemptReasonCode Minor = new TaxExemptReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Minor";
			definition = "Account is for a minor for which a tax exemption is permitted.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReasonCode.mmObject();
			codeName = "MINO";
		}
	};
	/**
	 * Exemption due to incapacitation
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode
	 * TaxExemptReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INCA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Incapacity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Exemption due to incapacitation "</li>
	 * </ul>
	 */
	public static final TaxExemptReasonCode Incapacity = new TaxExemptReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Incapacity";
			definition = "Exemption due to incapacitation ";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReasonCode.mmObject();
			codeName = "INCA";
		}
	};
	/**
	 * Account is for a foreigner for which a tax exemption is permitted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode
	 * TaxExemptReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FORE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Foreigner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account is for a foreigner for which a tax exemption is permitted."</li>
	 * </ul>
	 */
	public static final TaxExemptReasonCode Foreigner = new TaxExemptReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Foreigner";
			definition = "Account is for a foreigner for which a tax exemption is permitted.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReasonCode.mmObject();
			codeName = "FORE";
		}
	};
	/**
	 * Ordinary reporting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode
	 * TaxExemptReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ORDR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Ordinary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Ordinary reporting."</li>
	 * </ul>
	 */
	public static final TaxExemptReasonCode Ordinary = new TaxExemptReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Ordinary";
			definition = "Ordinary reporting.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReasonCode.mmObject();
			codeName = "ORDR";
		}
	};
	/**
	 * Account is for an association, for example, a sports club, for which a
	 * tax exemption is permitted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode
	 * TaxExemptReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ASSO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Association"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account is for an association, for example, a sports club, for which a tax exemption is permitted."
	 * </li>
	 * </ul>
	 */
	public static final TaxExemptReasonCode Association = new TaxExemptReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Association";
			definition = "Account is for an association, for example, a sports club, for which a tax exemption is permitted.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReasonCode.mmObject();
			codeName = "ASSO";
		}
	};
	/**
	 * Account is for two account owners that are both domestic.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode
	 * TaxExemptReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DOME"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Domestic"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account is for two account owners that are both domestic."
	 * </li>
	 * </ul>
	 */
	public static final TaxExemptReasonCode Domestic = new TaxExemptReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Domestic";
			definition = "Account is for two account owners that are both domestic.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReasonCode.mmObject();
			codeName = "DOME";
		}
	};
	/**
	 * Account is for two account owners where one or both are foreign.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode
	 * TaxExemptReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FORP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OneOrBothForeign"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account is for two account owners where one or both are foreign."</li>
	 * </ul>
	 */
	public static final TaxExemptReasonCode OneOrBothForeign = new TaxExemptReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OneOrBothForeign";
			definition = "Account is for two account owners where one or both are foreign.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReasonCode.mmObject();
			codeName = "FORP";
		}
	};
	/**
	 * Account is for a rights holder.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode
	 * TaxExemptReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RIHO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RightsHolder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account is for a rights holder."</li>
	 * </ul>
	 */
	public static final TaxExemptReasonCode RightsHolder = new TaxExemptReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsHolder";
			definition = "Account is for a rights holder.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReasonCode.mmObject();
			codeName = "RIHO";
		}
	};
	/**
	 * Account is for a pension fund for which a tax exemption is permitted.<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode
	 * TaxExemptReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PENF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PensionFund"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account is for a pension fund for which a tax exemption is permitted.\r\n"
	 * </li>
	 * </ul>
	 */
	public static final TaxExemptReasonCode PensionFund = new TaxExemptReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PensionFund";
			definition = "Account is for a pension fund for which a tax exemption is permitted.\r\n";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReasonCode.mmObject();
			codeName = "PENF";
		}
	};
	/**
	 * Account is for a diplomat for which a tax exemption is permitted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode
	 * TaxExemptReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DIPL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Diplomat"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account is for a diplomat for which a tax exemption is permitted."</li>
	 * </ul>
	 */
	public static final TaxExemptReasonCode Diplomat = new TaxExemptReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Diplomat";
			definition = "Account is for a diplomat for which a tax exemption is permitted.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReasonCode.mmObject();
			codeName = "DIPL";
		}
	};
	/**
	 * Account is for a refugee or person without a number assigned by a
	 * government organisation, for example, without a Danish Central Securities
	 * Number.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode
	 * TaxExemptReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REFU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Refugee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account is for a refugee or person without a number assigned by a government organisation, for example, without a Danish Central Securities Number."
	 * </li>
	 * </ul>
	 */
	public static final TaxExemptReasonCode Refugee = new TaxExemptReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Refugee";
			definition = "Account is for a refugee or person without a number assigned by a government organisation, for example, without a Danish Central Securities Number.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReasonCode.mmObject();
			codeName = "REFU";
		}
	};
	/**
	 * One of the account owners is a foreign resident.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode
	 * TaxExemptReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OANR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OneNonResident"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "One of the account owners is a foreign resident."</li>
	 * </ul>
	 */
	public static final TaxExemptReasonCode OneNonResident = new TaxExemptReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OneNonResident";
			definition = "One of the account owners is a foreign resident.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReasonCode.mmObject();
			codeName = "OANR";
		}
	};
	/**
	 * Two or more of the account owners are foreign residents.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode
	 * TaxExemptReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TANR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoNonResident"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Two or more of the account owners are foreign residents."</li>
	 * </ul>
	 */
	public static final TaxExemptReasonCode TwoNonResident = new TaxExemptReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TwoNonResident";
			definition = "Two or more of the account owners are foreign residents.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReasonCode.mmObject();
			codeName = "TANR";
		}
	};
	/**
	 * Administrator of the account is not the owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode
	 * TaxExemptReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ADMI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Administrator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Administrator of the account is not the owner."</li>
	 * </ul>
	 */
	public static final TaxExemptReasonCode Administrator = new TaxExemptReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Administrator";
			definition = "Administrator of the account is not the owner.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReasonCode.mmObject();
			codeName = "ADMI";
		}
	};
	final static private LinkedHashMap<String, TaxExemptReasonCode> codesByName = new LinkedHashMap<>();

	protected TaxExemptReasonCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("NONE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TaxExemptReasonCode";
				definition = "Specifies the reason a specific tax has not been levied/deducted on a given transaction.";
				derivation_lazy = () -> Arrays.asList(TaxExemptReason1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TaxExemptReasonCode.None, com.tools20022.repository.codeset.TaxExemptReasonCode.MaxiISA, com.tools20022.repository.codeset.TaxExemptReasonCode.MiniCashISA,
						com.tools20022.repository.codeset.TaxExemptReasonCode.MiniStocksAndSharesISA, com.tools20022.repository.codeset.TaxExemptReasonCode.MiniInsuranceISA,
						com.tools20022.repository.codeset.TaxExemptReasonCode.CurrentYearPayment, com.tools20022.repository.codeset.TaxExemptReasonCode.PriorYearPayment, com.tools20022.repository.codeset.TaxExemptReasonCode.AssetTransfer,
						com.tools20022.repository.codeset.TaxExemptReasonCode.EmployeePriorYear, com.tools20022.repository.codeset.TaxExemptReasonCode.EmployeeCurrentYear,
						com.tools20022.repository.codeset.TaxExemptReasonCode.EmployerPriorYear, com.tools20022.repository.codeset.TaxExemptReasonCode.EmployerCurrentYear,
						com.tools20022.repository.codeset.TaxExemptReasonCode.NonFundPrototypeIRA, com.tools20022.repository.codeset.TaxExemptReasonCode.NonFundQualifiedPlan,
						com.tools20022.repository.codeset.TaxExemptReasonCode.DefinedContributionPlan, com.tools20022.repository.codeset.TaxExemptReasonCode.IndividualRetirementAccount,
						com.tools20022.repository.codeset.TaxExemptReasonCode.IndividualRetirementAccountRollover, com.tools20022.repository.codeset.TaxExemptReasonCode.KEOGH,
						com.tools20022.repository.codeset.TaxExemptReasonCode.ProfitSharingPlan, com.tools20022.repository.codeset.TaxExemptReasonCode.FourHundredAndOneK,
						com.tools20022.repository.codeset.TaxExemptReasonCode.SelfDirectedIRA, com.tools20022.repository.codeset.TaxExemptReasonCode.FourHundredAndThreeB,
						com.tools20022.repository.codeset.TaxExemptReasonCode.FourHundredFiftySeven, com.tools20022.repository.codeset.TaxExemptReasonCode.RothIRAFundPrototype,
						com.tools20022.repository.codeset.TaxExemptReasonCode.RothIRANonPrototype, com.tools20022.repository.codeset.TaxExemptReasonCode.RothConversionIRAFundPrototype,
						com.tools20022.repository.codeset.TaxExemptReasonCode.RothConversionIRANonPrototype, com.tools20022.repository.codeset.TaxExemptReasonCode.EducationIRAFundPrototype,
						com.tools20022.repository.codeset.TaxExemptReasonCode.EducationIRANonPrototype, com.tools20022.repository.codeset.TaxExemptReasonCode.Other, com.tools20022.repository.codeset.TaxExemptReasonCode.Minor,
						com.tools20022.repository.codeset.TaxExemptReasonCode.Incapacity, com.tools20022.repository.codeset.TaxExemptReasonCode.Foreigner, com.tools20022.repository.codeset.TaxExemptReasonCode.Ordinary,
						com.tools20022.repository.codeset.TaxExemptReasonCode.Association, com.tools20022.repository.codeset.TaxExemptReasonCode.Domestic, com.tools20022.repository.codeset.TaxExemptReasonCode.OneOrBothForeign,
						com.tools20022.repository.codeset.TaxExemptReasonCode.RightsHolder, com.tools20022.repository.codeset.TaxExemptReasonCode.PensionFund, com.tools20022.repository.codeset.TaxExemptReasonCode.Diplomat,
						com.tools20022.repository.codeset.TaxExemptReasonCode.Refugee, com.tools20022.repository.codeset.TaxExemptReasonCode.OneNonResident, com.tools20022.repository.codeset.TaxExemptReasonCode.TwoNonResident,
						com.tools20022.repository.codeset.TaxExemptReasonCode.Administrator);
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
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(Minor.getCodeName().get(), Minor);
		codesByName.put(Incapacity.getCodeName().get(), Incapacity);
		codesByName.put(Foreigner.getCodeName().get(), Foreigner);
		codesByName.put(Ordinary.getCodeName().get(), Ordinary);
		codesByName.put(Association.getCodeName().get(), Association);
		codesByName.put(Domestic.getCodeName().get(), Domestic);
		codesByName.put(OneOrBothForeign.getCodeName().get(), OneOrBothForeign);
		codesByName.put(RightsHolder.getCodeName().get(), RightsHolder);
		codesByName.put(PensionFund.getCodeName().get(), PensionFund);
		codesByName.put(Diplomat.getCodeName().get(), Diplomat);
		codesByName.put(Refugee.getCodeName().get(), Refugee);
		codesByName.put(OneNonResident.getCodeName().get(), OneNonResident);
		codesByName.put(TwoNonResident.getCodeName().get(), TwoNonResident);
		codesByName.put(Administrator.getCodeName().get(), Administrator);
	}

	public static TaxExemptReasonCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TaxExemptReasonCode[] values() {
		TaxExemptReasonCode[] values = new TaxExemptReasonCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TaxExemptReasonCode> {
		@Override
		public TaxExemptReasonCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TaxExemptReasonCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}