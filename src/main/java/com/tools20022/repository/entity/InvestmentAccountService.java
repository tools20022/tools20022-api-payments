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

import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.BeneficiaryCertificationCompletionCode;
import com.tools20022.repository.codeset.IncomePreferenceCode;
import com.tools20022.repository.codeset.TaxWithholdingMethodCode;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.AccountService;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.AccountService
 * AccountService}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#mmIncomePreference
 * InvestmentAccountService.mmIncomePreference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#mmTaxWithholdingMethod
 * InvestmentAccountService.mmTaxWithholdingMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#mmRoundingMethod
 * InvestmentAccountService.mmRoundingMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#mmBeneficiaryCertificationIndicator
 * InvestmentAccountService.mmBeneficiaryCertificationIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#mmBeneficiaryCertificationCompletion
 * InvestmentAccountService.mmBeneficiaryCertificationCompletion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#mmSystematicInvestmentPlan
 * InvestmentAccountService.mmSystematicInvestmentPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#mmInvestmentAccountContract
 * InvestmentAccountService.mmInvestmentAccountContract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#mmReportingService
 * InvestmentAccountService.mmReportingService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#mmReinvestment
 * InvestmentAccountService.mmReinvestment}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ReportingService#mmRelatedInvestmentAccountService
 * ReportingService.mmRelatedInvestmentAccountService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountContract#mmServices
 * InvestmentAccountContract.mmServices}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RoundingParameters#mmInvestmentAccountService
 * RoundingParameters.mmInvestmentAccountService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentPlan#mmRelatedService
 * InvestmentPlan.mmRelatedService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Reinvestment#mmRelatedinvestmentAccountService
 * Reinvestment.mmRelatedinvestmentAccountService}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	protected IncomePreferenceCode incomePreference;
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
	public static final MMBusinessAttribute mmIncomePreference = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentAccountService.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IncomePreference";
			definition = "Dividend option chosen by the account owner based on the options offered in the prospectus.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> IncomePreferenceCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentAccountService.class.getMethod("getIncomePreference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TaxWithholdingMethodCode taxWithholdingMethod;
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
	public static final MMBusinessAttribute mmTaxWithholdingMethod = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentAccountService.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxWithholdingMethod";
			definition = "Method by which the tax (withholding tax) is to be processed i.e. either withheld at source or tax information reported to tax authorities or tax information is reported due to the provision of a tax certificate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TaxWithholdingMethodCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentAccountService.class.getMethod("getTaxWithholdingMethod", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected RoundingParameters roundingMethod;
	/**
	 * Rounding method used to determine the quantity of investment fund units.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RoundingParameters#mmInvestmentAccountService
	 * RoundingParameters.mmInvestmentAccountService}</li>
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
	public static final MMBusinessAssociationEnd mmRoundingMethod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentAccountService.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RoundingMethod";
			definition = "Rounding method used to determine the quantity of investment fund units.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RoundingParameters.mmInvestmentAccountService;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RoundingParameters.mmObject();
		}
	};
	protected YesNoIndicator beneficiaryCertificationIndicator;
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
	public static final MMBusinessAttribute mmBeneficiaryCertificationIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentAccountService.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BeneficiaryCertificationIndicator";
			definition = "Indicates whether the beneficial ownership certification has been sent, certifying that the beneficial owner is eligible to own a specific investment fund or investment fund class.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentAccountService.class.getMethod("getBeneficiaryCertificationIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected BeneficiaryCertificationCompletionCode beneficiaryCertificationCompletion;
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
	public static final MMBusinessAttribute mmBeneficiaryCertificationCompletion = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentAccountService.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BeneficiaryCertificationCompletion";
			definition = "Beneficial owner or its designated agent certifies that it complies with any holding or investment restrictions or requirements of the fund.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BeneficiaryCertificationCompletionCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentAccountService.class.getMethod("getBeneficiaryCertificationCompletion", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected InvestmentPlan systematicInvestmentPlan;
	/**
	 * Investment plan associated with an investment account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentPlan#mmRelatedService
	 * InvestmentPlan.mmRelatedService}</li>
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
	public static final MMBusinessAssociationEnd mmSystematicInvestmentPlan = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentAccountService.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SystematicInvestmentPlan";
			definition = "Investment plan associated with an investment account.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentPlan.mmRelatedService;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentPlan.mmObject();
		}
	};
	protected InvestmentAccountContract investmentAccountContract;
	/**
	 * Contract which specifies the services related to an account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountContract#mmServices
	 * InvestmentAccountContract.mmServices}</li>
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
	public static final MMBusinessAssociationEnd mmInvestmentAccountContract = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentAccountService.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentAccountContract";
			definition = "Contract which specifies the services related to an account.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccountContract.mmServices;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentAccountContract.mmObject();
		}
	};
	protected ReportingService reportingService;
	/**
	 * Reporting services parameters for an investment account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ReportingService#mmRelatedInvestmentAccountService
	 * ReportingService.mmRelatedInvestmentAccountService}</li>
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
	public static final MMBusinessAssociationEnd mmReportingService = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentAccountService.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReportingService";
			definition = "Reporting services parameters for an investment account.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ReportingService.mmRelatedInvestmentAccountService;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ReportingService.mmObject();
		}
	};
	protected Reinvestment reinvestment;
	/**
	 * Reinvestment information included in the investment account contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Reinvestment#mmRelatedinvestmentAccountService
	 * Reinvestment.mmRelatedinvestmentAccountService}</li>
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
	public static final MMBusinessAssociationEnd mmReinvestment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentAccountService.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Reinvestment";
			definition = "Reinvestment information included in the investment account contract.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Reinvestment.mmRelatedinvestmentAccountService;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Reinvestment.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvestmentAccountService";
				definition = "Services linked to an account which are available to the account owner or to the holder of a mandate. The exercise of these services may be submitted to a limit.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ReportingService.mmRelatedInvestmentAccountService, com.tools20022.repository.entity.InvestmentAccountContract.mmServices,
						com.tools20022.repository.entity.RoundingParameters.mmInvestmentAccountService, com.tools20022.repository.entity.InvestmentPlan.mmRelatedService,
						com.tools20022.repository.entity.Reinvestment.mmRelatedinvestmentAccountService);
				superType_lazy = () -> AccountService.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentAccountService.mmIncomePreference, com.tools20022.repository.entity.InvestmentAccountService.mmTaxWithholdingMethod,
						com.tools20022.repository.entity.InvestmentAccountService.mmRoundingMethod, com.tools20022.repository.entity.InvestmentAccountService.mmBeneficiaryCertificationIndicator,
						com.tools20022.repository.entity.InvestmentAccountService.mmBeneficiaryCertificationCompletion, com.tools20022.repository.entity.InvestmentAccountService.mmSystematicInvestmentPlan,
						com.tools20022.repository.entity.InvestmentAccountService.mmInvestmentAccountContract, com.tools20022.repository.entity.InvestmentAccountService.mmReportingService,
						com.tools20022.repository.entity.InvestmentAccountService.mmReinvestment);
			}

			@Override
			public Class<?> getInstanceClass() {
				return InvestmentAccountService.class;
			}
		});
		return mmObject_lazy.get();
	}

	public IncomePreferenceCode getIncomePreference() {
		return incomePreference;
	}

	public void setIncomePreference(IncomePreferenceCode incomePreference) {
		this.incomePreference = incomePreference;
	}

	public TaxWithholdingMethodCode getTaxWithholdingMethod() {
		return taxWithholdingMethod;
	}

	public void setTaxWithholdingMethod(TaxWithholdingMethodCode taxWithholdingMethod) {
		this.taxWithholdingMethod = taxWithholdingMethod;
	}

	public RoundingParameters getRoundingMethod() {
		return roundingMethod;
	}

	public void setRoundingMethod(com.tools20022.repository.entity.RoundingParameters roundingMethod) {
		this.roundingMethod = roundingMethod;
	}

	public YesNoIndicator getBeneficiaryCertificationIndicator() {
		return beneficiaryCertificationIndicator;
	}

	public void setBeneficiaryCertificationIndicator(YesNoIndicator beneficiaryCertificationIndicator) {
		this.beneficiaryCertificationIndicator = beneficiaryCertificationIndicator;
	}

	public BeneficiaryCertificationCompletionCode getBeneficiaryCertificationCompletion() {
		return beneficiaryCertificationCompletion;
	}

	public void setBeneficiaryCertificationCompletion(BeneficiaryCertificationCompletionCode beneficiaryCertificationCompletion) {
		this.beneficiaryCertificationCompletion = beneficiaryCertificationCompletion;
	}

	public InvestmentPlan getSystematicInvestmentPlan() {
		return systematicInvestmentPlan;
	}

	public void setSystematicInvestmentPlan(com.tools20022.repository.entity.InvestmentPlan systematicInvestmentPlan) {
		this.systematicInvestmentPlan = systematicInvestmentPlan;
	}

	public InvestmentAccountContract getInvestmentAccountContract() {
		return investmentAccountContract;
	}

	public void setInvestmentAccountContract(com.tools20022.repository.entity.InvestmentAccountContract investmentAccountContract) {
		this.investmentAccountContract = investmentAccountContract;
	}

	public ReportingService getReportingService() {
		return reportingService;
	}

	public void setReportingService(com.tools20022.repository.entity.ReportingService reportingService) {
		this.reportingService = reportingService;
	}

	public Reinvestment getReinvestment() {
		return reinvestment;
	}

	public void setReinvestment(com.tools20022.repository.entity.Reinvestment reinvestment) {
		this.reinvestment = reinvestment;
	}
}