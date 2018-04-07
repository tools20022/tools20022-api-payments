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
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

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
	protected IncomePreferenceCode incomePreference;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<InvestmentAccountService, IncomePreferenceCode> mmIncomePreference = new MMBusinessAttribute<InvestmentAccountService, IncomePreferenceCode>() {
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

		@Override
		public IncomePreferenceCode getValue(InvestmentAccountService obj) {
			return obj.getIncomePreference();
		}

		@Override
		public void setValue(InvestmentAccountService obj, IncomePreferenceCode value) {
			obj.setIncomePreference(value);
		}
	};
	protected TaxWithholdingMethodCode taxWithholdingMethod;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<InvestmentAccountService, TaxWithholdingMethodCode> mmTaxWithholdingMethod = new MMBusinessAttribute<InvestmentAccountService, TaxWithholdingMethodCode>() {
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

		@Override
		public TaxWithholdingMethodCode getValue(InvestmentAccountService obj) {
			return obj.getTaxWithholdingMethod();
		}

		@Override
		public void setValue(InvestmentAccountService obj, TaxWithholdingMethodCode value) {
			obj.setTaxWithholdingMethod(value);
		}
	};
	protected RoundingParameters roundingMethod;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<InvestmentAccountService, RoundingParameters> mmRoundingMethod = new MMBusinessAssociationEnd<InvestmentAccountService, RoundingParameters>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentAccountService.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RoundingMethod";
			definition = "Rounding method used to determine the quantity of investment fund units.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> RoundingParameters.mmInvestmentAccountService;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> RoundingParameters.mmObject();
		}

		@Override
		public RoundingParameters getValue(InvestmentAccountService obj) {
			return obj.getRoundingMethod();
		}

		@Override
		public void setValue(InvestmentAccountService obj, RoundingParameters value) {
			obj.setRoundingMethod(value);
		}
	};
	protected YesNoIndicator beneficiaryCertificationIndicator;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<InvestmentAccountService, YesNoIndicator> mmBeneficiaryCertificationIndicator = new MMBusinessAttribute<InvestmentAccountService, YesNoIndicator>() {
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

		@Override
		public YesNoIndicator getValue(InvestmentAccountService obj) {
			return obj.getBeneficiaryCertificationIndicator();
		}

		@Override
		public void setValue(InvestmentAccountService obj, YesNoIndicator value) {
			obj.setBeneficiaryCertificationIndicator(value);
		}
	};
	protected BeneficiaryCertificationCompletionCode beneficiaryCertificationCompletion;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<InvestmentAccountService, BeneficiaryCertificationCompletionCode> mmBeneficiaryCertificationCompletion = new MMBusinessAttribute<InvestmentAccountService, BeneficiaryCertificationCompletionCode>() {
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

		@Override
		public BeneficiaryCertificationCompletionCode getValue(InvestmentAccountService obj) {
			return obj.getBeneficiaryCertificationCompletion();
		}

		@Override
		public void setValue(InvestmentAccountService obj, BeneficiaryCertificationCompletionCode value) {
			obj.setBeneficiaryCertificationCompletion(value);
		}
	};
	protected InvestmentPlan systematicInvestmentPlan;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<InvestmentAccountService, Optional<InvestmentPlan>> mmSystematicInvestmentPlan = new MMBusinessAssociationEnd<InvestmentAccountService, Optional<InvestmentPlan>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentAccountService.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SystematicInvestmentPlan";
			definition = "Investment plan associated with an investment account.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> InvestmentPlan.mmRelatedService;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> InvestmentPlan.mmObject();
		}

		@Override
		public Optional<InvestmentPlan> getValue(InvestmentAccountService obj) {
			return obj.getSystematicInvestmentPlan();
		}

		@Override
		public void setValue(InvestmentAccountService obj, Optional<InvestmentPlan> value) {
			obj.setSystematicInvestmentPlan(value.orElse(null));
		}
	};
	protected InvestmentAccountContract investmentAccountContract;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<InvestmentAccountService, Optional<InvestmentAccountContract>> mmInvestmentAccountContract = new MMBusinessAssociationEnd<InvestmentAccountService, Optional<InvestmentAccountContract>>() {
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

		@Override
		public Optional<InvestmentAccountContract> getValue(InvestmentAccountService obj) {
			return obj.getInvestmentAccountContract();
		}

		@Override
		public void setValue(InvestmentAccountService obj, Optional<InvestmentAccountContract> value) {
			obj.setInvestmentAccountContract(value.orElse(null));
		}
	};
	protected ReportingService reportingService;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<InvestmentAccountService, com.tools20022.repository.entity.ReportingService> mmReportingService = new MMBusinessAssociationEnd<InvestmentAccountService, com.tools20022.repository.entity.ReportingService>() {
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

		@Override
		public com.tools20022.repository.entity.ReportingService getValue(InvestmentAccountService obj) {
			return obj.getReportingService();
		}

		@Override
		public void setValue(InvestmentAccountService obj, com.tools20022.repository.entity.ReportingService value) {
			obj.setReportingService(value);
		}
	};
	protected Reinvestment reinvestment;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<InvestmentAccountService, com.tools20022.repository.entity.Reinvestment> mmReinvestment = new MMBusinessAssociationEnd<InvestmentAccountService, com.tools20022.repository.entity.Reinvestment>() {
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

		@Override
		public com.tools20022.repository.entity.Reinvestment getValue(InvestmentAccountService obj) {
			return obj.getReinvestment();
		}

		@Override
		public void setValue(InvestmentAccountService obj, com.tools20022.repository.entity.Reinvestment value) {
			obj.setReinvestment(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvestmentAccountService";
				definition = "Services linked to an account which are available to the account owner or to the holder of a mandate. The exercise of these services may be submitted to a limit.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ReportingService.mmRelatedInvestmentAccountService, com.tools20022.repository.entity.InvestmentAccountContract.mmServices,
						RoundingParameters.mmInvestmentAccountService, InvestmentPlan.mmRelatedService, com.tools20022.repository.entity.Reinvestment.mmRelatedinvestmentAccountService);
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

	public InvestmentAccountService setIncomePreference(IncomePreferenceCode incomePreference) {
		this.incomePreference = Objects.requireNonNull(incomePreference);
		return this;
	}

	public TaxWithholdingMethodCode getTaxWithholdingMethod() {
		return taxWithholdingMethod;
	}

	public InvestmentAccountService setTaxWithholdingMethod(TaxWithholdingMethodCode taxWithholdingMethod) {
		this.taxWithholdingMethod = Objects.requireNonNull(taxWithholdingMethod);
		return this;
	}

	public RoundingParameters getRoundingMethod() {
		return roundingMethod;
	}

	public InvestmentAccountService setRoundingMethod(RoundingParameters roundingMethod) {
		this.roundingMethod = Objects.requireNonNull(roundingMethod);
		return this;
	}

	public YesNoIndicator getBeneficiaryCertificationIndicator() {
		return beneficiaryCertificationIndicator;
	}

	public InvestmentAccountService setBeneficiaryCertificationIndicator(YesNoIndicator beneficiaryCertificationIndicator) {
		this.beneficiaryCertificationIndicator = Objects.requireNonNull(beneficiaryCertificationIndicator);
		return this;
	}

	public BeneficiaryCertificationCompletionCode getBeneficiaryCertificationCompletion() {
		return beneficiaryCertificationCompletion;
	}

	public InvestmentAccountService setBeneficiaryCertificationCompletion(BeneficiaryCertificationCompletionCode beneficiaryCertificationCompletion) {
		this.beneficiaryCertificationCompletion = Objects.requireNonNull(beneficiaryCertificationCompletion);
		return this;
	}

	public Optional<InvestmentPlan> getSystematicInvestmentPlan() {
		return systematicInvestmentPlan == null ? Optional.empty() : Optional.of(systematicInvestmentPlan);
	}

	public InvestmentAccountService setSystematicInvestmentPlan(InvestmentPlan systematicInvestmentPlan) {
		this.systematicInvestmentPlan = systematicInvestmentPlan;
		return this;
	}

	public Optional<InvestmentAccountContract> getInvestmentAccountContract() {
		return investmentAccountContract == null ? Optional.empty() : Optional.of(investmentAccountContract);
	}

	public InvestmentAccountService setInvestmentAccountContract(com.tools20022.repository.entity.InvestmentAccountContract investmentAccountContract) {
		this.investmentAccountContract = investmentAccountContract;
		return this;
	}

	public ReportingService getReportingService() {
		return reportingService;
	}

	public InvestmentAccountService setReportingService(com.tools20022.repository.entity.ReportingService reportingService) {
		this.reportingService = Objects.requireNonNull(reportingService);
		return this;
	}

	public Reinvestment getReinvestment() {
		return reinvestment;
	}

	public InvestmentAccountService setReinvestment(com.tools20022.repository.entity.Reinvestment reinvestment) {
		this.reinvestment = Objects.requireNonNull(reinvestment);
		return this;
	}
}