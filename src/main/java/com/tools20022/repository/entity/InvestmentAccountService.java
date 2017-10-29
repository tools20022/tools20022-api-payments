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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.BeneficiaryCertificationCompletionCode;
import com.tools20022.repository.codeset.IncomePreferenceCode;
import com.tools20022.repository.codeset.TaxWithholdingMethodCode;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.AccountService;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Services linked to an account which are available to the account owner or to
 * the holder of a mandate. The exercise of these services may be submitted to a
 * limit.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="InvestmentAccountService"
 * src="doc-files/InvestmentAccountService.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#IncomePreference
 * InvestmentAccountService.IncomePreference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#TaxWithholdingMethod
 * InvestmentAccountService.TaxWithholdingMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#RoundingMethod
 * InvestmentAccountService.RoundingMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#BeneficiaryCertificationIndicator
 * InvestmentAccountService.BeneficiaryCertificationIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#BeneficiaryCertificationCompletion
 * InvestmentAccountService.BeneficiaryCertificationCompletion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#SystematicInvestmentPlan
 * InvestmentAccountService.SystematicInvestmentPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#InvestmentAccountContract
 * InvestmentAccountService.InvestmentAccountContract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#ReportingService
 * InvestmentAccountService.ReportingService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#Reinvestment
 * InvestmentAccountService.Reinvestment}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ReportingService#RelatedInvestmentAccountService
 * ReportingService.RelatedInvestmentAccountService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountContract#Services
 * InvestmentAccountContract.Services}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RoundingParameters#InvestmentAccountService
 * RoundingParameters.InvestmentAccountService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentPlan#RelatedService
 * InvestmentPlan.RelatedService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Reinvestment#RelatedinvestmentAccountService
 * Reinvestment.RelatedinvestmentAccountService}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.AccountService
 * AccountService}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InvestmentAccountService"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Services linked to an account which are available to the account owner or to the holder of a mandate. The exercise of these services may be submitted to a limit."
 * </li>
 * </ul>
 */
public class InvestmentAccountService extends AccountService {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Dividend option chosen by the account owner based on the options offered
	 * in the prospectus.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.IncomePreferenceCode
	 * IncomePreferenceCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService
	 * InvestmentAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomePreference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Dividend option chosen by the account owner based on the options offered in the prospectus."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute IncomePreference = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentAccountService.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IncomePreference";
			definition = "Dividend option chosen by the account owner based on the options offered in the prospectus.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> IncomePreferenceCode.mmObject();
		}
	};
	/**
	 * Method by which the tax (withholding tax) is to be processed i.e. either
	 * withheld at source or tax information reported to tax authorities or tax
	 * information is reported due to the provision of a tax certificate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TaxWithholdingMethodCode
	 * TaxWithholdingMethodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService
	 * InvestmentAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxWithholdingMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Method by which the tax (withholding tax) is to be processed i.e. either withheld at source or tax information reported to tax authorities or tax information is reported due to the provision of a tax certificate."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TaxWithholdingMethod = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentAccountService.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxWithholdingMethod";
			definition = "Method by which the tax (withholding tax) is to be processed i.e. either withheld at source or tax information reported to tax authorities or tax information is reported due to the provision of a tax certificate.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TaxWithholdingMethodCode.mmObject();
		}
	};
	/**
	 * Rounding method used to determine the quantity of investment fund units.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RoundingParameters#InvestmentAccountService
	 * RoundingParameters.InvestmentAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RoundingParameters
	 * RoundingParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService
	 * InvestmentAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoundingMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rounding method used to determine the quantity of investment fund units."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RoundingMethod = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentAccountService.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RoundingMethod";
			definition = "Rounding method used to determine the quantity of investment fund units.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> RoundingParameters.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.RoundingParameters.InvestmentAccountService;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates whether the beneficial ownership certification has been sent,
	 * certifying that the beneficial owner is eligible to own a specific
	 * investment fund or investment fund class.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService
	 * InvestmentAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficiaryCertificationIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the beneficial ownership certification has been sent, certifying that the beneficial owner is eligible to own a specific investment fund or investment fund class."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute BeneficiaryCertificationIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentAccountService.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BeneficiaryCertificationIndicator";
			definition = "Indicates whether the beneficial ownership certification has been sent, certifying that the beneficial owner is eligible to own a specific investment fund or investment fund class.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Beneficial owner or its designated agent certifies that it complies with
	 * any holding or investment restrictions or requirements of the fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationCompletionCode
	 * BeneficiaryCertificationCompletionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService
	 * InvestmentAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficiaryCertificationCompletion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Beneficial owner or its designated agent certifies that it complies with any holding or investment restrictions or requirements of the fund."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute BeneficiaryCertificationCompletion = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentAccountService.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BeneficiaryCertificationCompletion";
			definition = "Beneficial owner or its designated agent certifies that it complies with any holding or investment restrictions or requirements of the fund.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> BeneficiaryCertificationCompletionCode.mmObject();
		}
	};
	/**
	 * Investment plan associated with an investment account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentPlan#RelatedService
	 * InvestmentPlan.RelatedService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentPlan
	 * InvestmentPlan}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService
	 * InvestmentAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystematicInvestmentPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Investment plan associated with an investment account."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SystematicInvestmentPlan = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentAccountService.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SystematicInvestmentPlan";
			definition = "Investment plan associated with an investment account.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> InvestmentPlan.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentPlan.RelatedService;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Contract which specifies the services related to an account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountContract#Services
	 * InvestmentAccountContract.Services}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountContract
	 * InvestmentAccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService
	 * InvestmentAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccountContract"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contract which specifies the services related to an account."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd InvestmentAccountContract = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentAccountService.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentAccountContract";
			definition = "Contract which specifies the services related to an account.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentAccountContract.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccountContract.Services;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Reporting services parameters for an investment account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ReportingService#RelatedInvestmentAccountService
	 * ReportingService.RelatedInvestmentAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ReportingService
	 * ReportingService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService
	 * InvestmentAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportingService"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reporting services parameters for an investment account."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ReportingService = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentAccountService.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReportingService";
			definition = "Reporting services parameters for an investment account.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.ReportingService.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ReportingService.RelatedInvestmentAccountService;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Reinvestment information included in the investment account contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Reinvestment#RelatedinvestmentAccountService
	 * Reinvestment.RelatedinvestmentAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Reinvestment
	 * Reinvestment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService
	 * InvestmentAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reinvestment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reinvestment information included in the investment account contract."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Reinvestment = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentAccountService.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Reinvestment";
			definition = "Reinvestment information included in the investment account contract.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Reinvestment.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Reinvestment.RelatedinvestmentAccountService;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InvestmentAccountService";
				definition = "Services linked to an account which are available to the account owner or to the holder of a mandate. The exercise of these services may be submitted to a limit.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ReportingService.RelatedInvestmentAccountService, com.tools20022.repository.entity.InvestmentAccountContract.Services,
						com.tools20022.repository.entity.RoundingParameters.InvestmentAccountService, com.tools20022.repository.entity.InvestmentPlan.RelatedService,
						com.tools20022.repository.entity.Reinvestment.RelatedinvestmentAccountService);
				superType_lazy = () -> AccountService.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentAccountService.IncomePreference, com.tools20022.repository.entity.InvestmentAccountService.TaxWithholdingMethod,
						com.tools20022.repository.entity.InvestmentAccountService.RoundingMethod, com.tools20022.repository.entity.InvestmentAccountService.BeneficiaryCertificationIndicator,
						com.tools20022.repository.entity.InvestmentAccountService.BeneficiaryCertificationCompletion, com.tools20022.repository.entity.InvestmentAccountService.SystematicInvestmentPlan,
						com.tools20022.repository.entity.InvestmentAccountService.InvestmentAccountContract, com.tools20022.repository.entity.InvestmentAccountService.ReportingService,
						com.tools20022.repository.entity.InvestmentAccountService.Reinvestment);
			}
		});
		return mmObject_lazy.get();
	}
}