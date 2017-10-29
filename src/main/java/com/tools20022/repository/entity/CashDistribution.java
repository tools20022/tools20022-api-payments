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
import com.tools20022.repository.codeset.PaymentTypeCode;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.Distribution;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Distribution of cash pay-out.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CashDistribution" src="doc-files/CashDistribution.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashDistribution#DistributionCurrencyExchangeInformation
 * CashDistribution.DistributionCurrencyExchangeInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashDistribution#SecuritiesAndCashDistribution
 * CashDistribution.SecuritiesAndCashDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashDistribution#AmortisedRate
 * CashDistribution.AmortisedRate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashDistribution#Rate
 * CashDistribution.Rate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashDistribution#CashIndemnityRate
 * CashDistribution.CashIndemnityRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashDistribution#DividendReinvestmentIndicator
 * CashDistribution.DividendReinvestmentIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashDistribution#InterestAmount
 * CashDistribution.InterestAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashDistribution#InterestRate
 * CashDistribution.InterestRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashDistribution#LoyaltyPremiumIndicator
 * CashDistribution.LoyaltyPremiumIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashDistribution#PaymentType
 * CashDistribution.PaymentType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashDistribution#SelectionDate
 * CashDistribution.SelectionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashDistribution#CashDistributionRate
 * CashDistribution.CashDistributionRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashDistribution#CashDistributionAmount
 * CashDistribution.CashDistributionAmount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#CurrencyExchangeForCashDistribution
 * CurrencyExchange.CurrencyExchangeForCashDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#CashDistribution
 * SecuritiesAndCashDistribution.CashDistribution}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Distribution
 * Distribution}</li>
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
 * "CashDistribution"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Distribution of cash pay-out."</li>
 * </ul>
 */
public class CashDistribution extends Distribution {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Detailed information about the currency exchange in a distribution event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#CurrencyExchangeForCashDistribution
	 * CurrencyExchange.CurrencyExchangeForCashDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashDistribution
	 * CashDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DistributionCurrencyExchangeInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Detailed information about the currency exchange in a distribution event."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd DistributionCurrencyExchangeInformation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DistributionCurrencyExchangeInformation";
			definition = "Detailed information about the currency exchange in a distribution event.";
			minOccurs = 0;
			type_lazy = () -> CurrencyExchange.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.CurrencyExchangeForCashDistribution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Distribution for which the cash distribution elements are provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#CashDistribution
	 * SecuritiesAndCashDistribution.CashDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution
	 * SecuritiesAndCashDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashDistribution
	 * CashDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesAndCashDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Distribution for which the cash distribution elements are provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesAndCashDistribution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesAndCashDistribution";
			definition = "Distribution for which the cash distribution elements are provided.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.CashDistribution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Rate that will be applicable as of the next factor date and defines the
	 * outstanding principal of the factored security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.BaseOneRate
	 * BaseOneRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashDistribution
	 * CashDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmortisedRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate that will be applicable as of the next factor date and defines the outstanding principal of the factored security."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AmortisedRate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CashDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AmortisedRate";
			definition = "Rate that will be applicable as of the next factor date and defines the outstanding principal of the factored security.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}
	};
	/**
	 * Amount of cash, expressed as a percentage, disbursed per financial
	 * instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashDistribution
	 * CashDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of cash, expressed as a percentage, disbursed per financial instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Rate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CashDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Rate";
			definition = "Amount of cash, expressed as a percentage, disbursed per financial instrument.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Ratio of compensation for damage/loss versus value of insured entity
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashDistribution
	 * CashDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashIndemnityRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Ratio of compensation for damage/loss versus value of insured entity"</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CashIndemnityRate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CashDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashIndemnityRate";
			definition = "Ratio of compensation for damage/loss versus value of insured entity";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Indicates whether a cash dividend can be rolled over into shares of the
	 * issuing company.
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
	 * {@linkplain com.tools20022.repository.entity.CashDistribution
	 * CashDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendReinvestmentIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether a cash dividend can be rolled over into shares of the issuing company."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute DividendReinvestmentIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CashDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DividendReinvestmentIndicator";
			definition = "Indicates whether a cash dividend can be rolled over into shares of the issuing company.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Amount of interest paid to the principal amount of the financial
	 * instrument for a specific period of time.
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
	 * {@linkplain com.tools20022.repository.entity.CashDistribution
	 * CashDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of interest paid to the principal amount of the financial instrument for a specific period of time."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute InterestAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CashDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InterestAmount";
			definition = "Amount of interest paid to the principal amount of the financial instrument for a specific period of time.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Ratio of the amount of interest paid to the principal amount of the
	 * financial instrument for a specific period of time.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashDistribution
	 * CashDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Ratio of the amount of interest paid to the principal amount of the financial instrument for a specific period of time."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute InterestRate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CashDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InterestRate";
			definition = "Ratio of the amount of interest paid to the principal amount of the financial instrument for a specific period of time.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Indicates whether dividends, in addition to regular dividends, are
	 * payable to loyal (time, size, amount) investors.
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
	 * {@linkplain com.tools20022.repository.entity.CashDistribution
	 * CashDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LoyaltyPremiumIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether dividends, in addition to regular dividends, are payable to loyal (time, size, amount) investors."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute LoyaltyPremiumIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CashDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LoyaltyPremiumIndicator";
			definition = "Indicates whether dividends, in addition to regular dividends, are payable to loyal (time, size, amount) investors.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Provides information about the whether the payment will be before or
	 * after tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashDistribution
	 * CashDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the whether the payment will be before or after tax."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PaymentType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CashDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentType";
			definition = "Provides information about the whether the payment will be before or after tax.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PaymentTypeCode.mmObject();
		}
	};
	/**
	 * Date/time at which securities are selected for redemption prior to
	 * maturity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashDistribution
	 * CashDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SelectionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which securities are selected for redemption prior to maturity."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SelectionDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CashDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SelectionDate";
			definition = "Date/time at which securities are selected for redemption prior to maturity.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Amount, expressed as a percentage, of cash disbursed per financial
	 * instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashDistribution
	 * CashDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDistributionRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount, expressed as a percentage, of cash disbursed per financial instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CashDistributionRate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CashDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashDistributionRate";
			definition = "Amount, expressed as a percentage, of cash disbursed per financial instrument.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Amount of cash disbursed per financial instrument.
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
	 * {@linkplain com.tools20022.repository.entity.CashDistribution
	 * CashDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDistributionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of cash disbursed per financial instrument."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CashDistributionAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CashDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashDistributionAmount";
			definition = "Amount of cash disbursed per financial instrument.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CashDistribution";
				definition = "Distribution of cash pay-out.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CurrencyExchange.CurrencyExchangeForCashDistribution, com.tools20022.repository.entity.SecuritiesAndCashDistribution.CashDistribution);
				superType_lazy = () -> Distribution.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashDistribution.DistributionCurrencyExchangeInformation, com.tools20022.repository.entity.CashDistribution.SecuritiesAndCashDistribution,
						com.tools20022.repository.entity.CashDistribution.AmortisedRate, com.tools20022.repository.entity.CashDistribution.Rate, com.tools20022.repository.entity.CashDistribution.CashIndemnityRate,
						com.tools20022.repository.entity.CashDistribution.DividendReinvestmentIndicator, com.tools20022.repository.entity.CashDistribution.InterestAmount, com.tools20022.repository.entity.CashDistribution.InterestRate,
						com.tools20022.repository.entity.CashDistribution.LoyaltyPremiumIndicator, com.tools20022.repository.entity.CashDistribution.PaymentType, com.tools20022.repository.entity.CashDistribution.SelectionDate,
						com.tools20022.repository.entity.CashDistribution.CashDistributionRate, com.tools20022.repository.entity.CashDistribution.CashDistributionAmount);
			}
		});
		return mmObject_lazy.get();
	}
}