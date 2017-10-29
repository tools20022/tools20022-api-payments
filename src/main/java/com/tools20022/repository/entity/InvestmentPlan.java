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
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.FrequencyCode;
import com.tools20022.repository.codeset.PlanStatusCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Plan that allows investors to schedule periodical investments or divestments,
 * according to pre-defined criteria.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="InvestmentPlan" src="doc-files/InvestmentPlan.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentPlan#Frequency
 * InvestmentPlan.Frequency}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentPlan#Amount
 * InvestmentPlan.Amount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentPlan#Asset
 * InvestmentPlan.Asset}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentPlan#Instalment
 * InvestmentPlan.Instalment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentPlan#RelatedService
 * InvestmentPlan.RelatedService}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentPlan#Insurance
 * InvestmentPlan.Insurance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentPlan#StandingOrder
 * InvestmentPlan.StandingOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentPlan#MultiCurrency
 * InvestmentPlan.MultiCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentPlan#Currency
 * InvestmentPlan.Currency}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentPlan#Portfolio
 * InvestmentPlan.Portfolio}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentPlan#InvestmentPeriod
 * InvestmentPlan.InvestmentPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentPlan#PlanStatus
 * InvestmentPlan.PlanStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#InvestmentPlan
 * Asset.InvestmentPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#RelatedInvestmentPlan
 * DateTimePeriod.RelatedInvestmentPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#SystematicInvestmentPlan
 * InvestmentAccountService.SystematicInvestmentPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#InvestmentPlan
 * InvestmentFundOrder.InvestmentPlan}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Instalment#InvestmentPlan
 * Instalment.InvestmentPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InsuranceCertificate#RelatedInvestmentPlan
 * InsuranceCertificate.RelatedInvestmentPlan}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Portfolio#InvestmentPlan
 * Portfolio.InvestmentPlan}</li>
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
 * "InvestmentPlan"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Plan that allows investors to schedule periodical investments or divestments, according to pre-defined criteria."
 * </li>
 * </ul>
 */
public class InvestmentPlan {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Frequency of the investment or divestment, eg, daily, weekly, or monthly.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FrequencyCode
	 * FrequencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentPlan
	 * InvestmentPlan}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Frequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Frequency of the investment or divestment, eg, daily, weekly, or monthly."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Frequency = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentPlan.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Frequency";
			definition = "Frequency of the investment or divestment, eg, daily, weekly, or monthly.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}
	};
	/**
	 * Currency and amount of the periodical payments. When the standing order
	 * is related to a fund investment plan, this is the cash part of the
	 * invested amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentPlan
	 * InvestmentPlan}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency and amount of the periodical payments. When the standing order is related to a fund investment plan, this is the cash part of the invested amount."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Amount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentPlan.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Currency and amount of the periodical payments. When the standing order is related to a fund investment plan, this is the cash part of the invested amount.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Security that an investment plan invests in, or from which the investment
	 * plan divests.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Asset#InvestmentPlan
	 * Asset.InvestmentPlan}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Asset Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentPlan
	 * InvestmentPlan}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Asset"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Security that an investment plan invests in, or from which the investment plan divests."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Asset = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentPlan.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Asset";
			definition = "Security that an investment plan invests in, or from which the investment plan divests.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Asset.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Asset.InvestmentPlan;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies information on the successive payments in an investment plan.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Instalment#InvestmentPlan
	 * Instalment.InvestmentPlan}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Instalment
	 * Instalment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentPlan
	 * InvestmentPlan}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Instalment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies information on the successive payments in an investment plan."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Instalment = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentPlan.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Instalment";
			definition = "Specifies information on the successive payments in an investment plan.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Instalment.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Instalment.InvestmentPlan;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Service which provides a systematic investment plan.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#SystematicInvestmentPlan
	 * InvestmentAccountService.SystematicInvestmentPlan}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService
	 * InvestmentAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentPlan
	 * InvestmentPlan}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedService"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Service which provides a systematic investment plan."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedService = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentPlan.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedService";
			definition = "Service which provides a systematic investment plan.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> InvestmentAccountService.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccountService.SystematicInvestmentPlan;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Insurance contract which covers the investment plan.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InsuranceCertificate#RelatedInvestmentPlan
	 * InsuranceCertificate.RelatedInvestmentPlan}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InsuranceCertificate
	 * InsuranceCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentPlan
	 * InvestmentPlan}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Insurance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Insurance contract which covers the investment plan."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Insurance = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentPlan.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Insurance";
			definition = "Insurance contract which covers the investment plan.";
			minOccurs = 0;
			type_lazy = () -> InsuranceCertificate.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InsuranceCertificate.RelatedInvestmentPlan;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Order generated automatically, according to the terms of the investment
	 * plan.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#InvestmentPlan
	 * InvestmentFundOrder.InvestmentPlan}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentPlan
	 * InvestmentPlan}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Order generated automatically, according to the terms of the investment plan."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd StandingOrder = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentPlan.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StandingOrder";
			definition = "Order generated automatically, according to the terms of the investment plan.";
			minOccurs = 1;
			type_lazy = () -> InvestmentFundOrder.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.InvestmentPlan;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies whether the investment plan is multi currency or not.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentPlan
	 * InvestmentPlan}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultiCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the investment plan is multi currency or not."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MultiCurrency = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentPlan.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MultiCurrency";
			definition = "Specifies whether the investment plan is multi currency or not.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Currency of the investment plan.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentPlan
	 * InvestmentPlan}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency of the investment plan."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Currency = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentPlan.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Currency";
			definition = "Currency of the investment plan.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Portfolio for which the investment plan invests or divests.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Portfolio#InvestmentPlan
	 * Portfolio.InvestmentPlan}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Portfolio Portfolio}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentPlan
	 * InvestmentPlan}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Portfolio"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Portfolio for which the investment plan invests or divests."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Portfolio = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentPlan.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Portfolio";
			definition = "Portfolio for which the investment plan invests or divests.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Portfolio.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Portfolio.InvestmentPlan;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Period during which an investment plan has to be executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#RelatedInvestmentPlan
	 * DateTimePeriod.RelatedInvestmentPlan}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentPlan
	 * InvestmentPlan}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during which an investment plan has to be executed."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd InvestmentPeriod = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentPlan.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentPeriod";
			definition = "Period during which an investment plan has to be executed.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.RelatedInvestmentPlan;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Status of the savings or withdrawal investment plan.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PlanStatusCode
	 * PlanStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentPlan
	 * InvestmentPlan}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlanStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the savings or withdrawal investment plan. "</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PlanStatus = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentPlan.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PlanStatus";
			definition = "Status of the savings or withdrawal investment plan. ";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PlanStatusCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InvestmentPlan";
				definition = "Plan that allows investors to schedule periodical investments or divestments, according to pre-defined criteria.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Asset.InvestmentPlan, com.tools20022.repository.entity.DateTimePeriod.RelatedInvestmentPlan,
						com.tools20022.repository.entity.InvestmentAccountService.SystematicInvestmentPlan, com.tools20022.repository.entity.InvestmentFundOrder.InvestmentPlan, com.tools20022.repository.entity.Instalment.InvestmentPlan,
						com.tools20022.repository.entity.InsuranceCertificate.RelatedInvestmentPlan, com.tools20022.repository.entity.Portfolio.InvestmentPlan);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentPlan.Frequency, com.tools20022.repository.entity.InvestmentPlan.Amount, com.tools20022.repository.entity.InvestmentPlan.Asset,
						com.tools20022.repository.entity.InvestmentPlan.Instalment, com.tools20022.repository.entity.InvestmentPlan.RelatedService, com.tools20022.repository.entity.InvestmentPlan.Insurance,
						com.tools20022.repository.entity.InvestmentPlan.StandingOrder, com.tools20022.repository.entity.InvestmentPlan.MultiCurrency, com.tools20022.repository.entity.InvestmentPlan.Currency,
						com.tools20022.repository.entity.InvestmentPlan.Portfolio, com.tools20022.repository.entity.InvestmentPlan.InvestmentPeriod, com.tools20022.repository.entity.InvestmentPlan.PlanStatus);
			}
		});
		return mmObject_lazy.get();
	}
}