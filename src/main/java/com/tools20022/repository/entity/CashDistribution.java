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
import com.tools20022.repository.codeset.PaymentTypeCode;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.Distribution;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Distribution of cash pay-out.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CashDistribution" src="doc-files/CashDistribution.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Distribution
 * Distribution}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashDistribution#mmDistributionCurrencyExchangeInformation
 * CashDistribution.mmDistributionCurrencyExchangeInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashDistribution#mmSecuritiesAndCashDistribution
 * CashDistribution.mmSecuritiesAndCashDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashDistribution#mmAmortisedRate
 * CashDistribution.mmAmortisedRate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashDistribution#mmRate
 * CashDistribution.mmRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashDistribution#mmCashIndemnityRate
 * CashDistribution.mmCashIndemnityRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashDistribution#mmDividendReinvestmentIndicator
 * CashDistribution.mmDividendReinvestmentIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashDistribution#mmInterestAmount
 * CashDistribution.mmInterestAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashDistribution#mmInterestRate
 * CashDistribution.mmInterestRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashDistribution#mmLoyaltyPremiumIndicator
 * CashDistribution.mmLoyaltyPremiumIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashDistribution#mmPaymentType
 * CashDistribution.mmPaymentType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashDistribution#mmSelectionDate
 * CashDistribution.mmSelectionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashDistribution#mmCashDistributionRate
 * CashDistribution.mmCashDistributionRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashDistribution#mmCashDistributionAmount
 * CashDistribution.mmCashDistributionAmount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmCurrencyExchangeForCashDistribution
 * CurrencyExchange.mmCurrencyExchangeForCashDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#mmCashDistribution
 * SecuritiesAndCashDistribution.mmCashDistribution}</li>
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
 * "CashDistribution"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Distribution of cash pay-out."</li>
 * </ul>
 */
public class CashDistribution extends Distribution {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.CurrencyExchange> distributionCurrencyExchangeInformation;
	/**
	 * Detailed information about the currency exchange in a distribution event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmCurrencyExchangeForCashDistribution
	 * CurrencyExchange.mmCurrencyExchangeForCashDistribution}</li>
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
	public static final MMBusinessAssociationEnd mmDistributionCurrencyExchangeInformation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashDistribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DistributionCurrencyExchangeInformation";
			definition = "Detailed information about the currency exchange in a distribution event.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmCurrencyExchangeForCashDistribution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
		}
	};
	protected SecuritiesAndCashDistribution securitiesAndCashDistribution;
	/**
	 * Distribution for which the cash distribution elements are provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#mmCashDistribution
	 * SecuritiesAndCashDistribution.mmCashDistribution}</li>
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
	public static final MMBusinessAssociationEnd mmSecuritiesAndCashDistribution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashDistribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesAndCashDistribution";
			definition = "Distribution for which the cash distribution elements are provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmCashDistribution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmObject();
		}
	};
	protected BaseOneRate amortisedRate;
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
	public static final MMBusinessAttribute mmAmortisedRate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashDistribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AmortisedRate";
			definition = "Rate that will be applicable as of the next factor date and defines the outstanding principal of the factored security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CashDistribution.class.getMethod("getAmortisedRate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PercentageRate rate;
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
	public static final MMBusinessAttribute mmRate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashDistribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Rate";
			definition = "Amount of cash, expressed as a percentage, disbursed per financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CashDistribution.class.getMethod("getRate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PercentageRate cashIndemnityRate;
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
	public static final MMBusinessAttribute mmCashIndemnityRate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashDistribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashIndemnityRate";
			definition = "Ratio of compensation for damage/loss versus value of insured entity";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CashDistribution.class.getMethod("getCashIndemnityRate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator dividendReinvestmentIndicator;
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
	public static final MMBusinessAttribute mmDividendReinvestmentIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashDistribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DividendReinvestmentIndicator";
			definition = "Indicates whether a cash dividend can be rolled over into shares of the issuing company.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CashDistribution.class.getMethod("getDividendReinvestmentIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount interestAmount;
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
	public static final MMBusinessAttribute mmInterestAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashDistribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InterestAmount";
			definition = "Amount of interest paid to the principal amount of the financial instrument for a specific period of time.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CashDistribution.class.getMethod("getInterestAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PercentageRate interestRate;
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
	public static final MMBusinessAttribute mmInterestRate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashDistribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InterestRate";
			definition = "Ratio of the amount of interest paid to the principal amount of the financial instrument for a specific period of time.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CashDistribution.class.getMethod("getInterestRate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator loyaltyPremiumIndicator;
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
	public static final MMBusinessAttribute mmLoyaltyPremiumIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashDistribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LoyaltyPremiumIndicator";
			definition = "Indicates whether dividends, in addition to regular dividends, are payable to loyal (time, size, amount) investors.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CashDistribution.class.getMethod("getLoyaltyPremiumIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PaymentTypeCode paymentType;
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
	public static final MMBusinessAttribute mmPaymentType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashDistribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentType";
			definition = "Provides information about the whether the payment will be before or after tax.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PaymentTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CashDistribution.class.getMethod("getPaymentType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime selectionDate;
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
	public static final MMBusinessAttribute mmSelectionDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashDistribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SelectionDate";
			definition = "Date/time at which securities are selected for redemption prior to maturity.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CashDistribution.class.getMethod("getSelectionDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PercentageRate cashDistributionRate;
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
	public static final MMBusinessAttribute mmCashDistributionRate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashDistribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashDistributionRate";
			definition = "Amount, expressed as a percentage, of cash disbursed per financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CashDistribution.class.getMethod("getCashDistributionRate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount cashDistributionAmount;
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
	public static final MMBusinessAttribute mmCashDistributionAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashDistribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashDistributionAmount";
			definition = "Amount of cash disbursed per financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CashDistribution.class.getMethod("getCashDistributionAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CashDistribution";
				definition = "Distribution of cash pay-out.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CurrencyExchange.mmCurrencyExchangeForCashDistribution, com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmCashDistribution);
				superType_lazy = () -> Distribution.mmObject();
				element_lazy = () -> Arrays
						.asList(com.tools20022.repository.entity.CashDistribution.mmDistributionCurrencyExchangeInformation, com.tools20022.repository.entity.CashDistribution.mmSecuritiesAndCashDistribution,
								com.tools20022.repository.entity.CashDistribution.mmAmortisedRate, com.tools20022.repository.entity.CashDistribution.mmRate, com.tools20022.repository.entity.CashDistribution.mmCashIndemnityRate,
								com.tools20022.repository.entity.CashDistribution.mmDividendReinvestmentIndicator, com.tools20022.repository.entity.CashDistribution.mmInterestAmount,
								com.tools20022.repository.entity.CashDistribution.mmInterestRate, com.tools20022.repository.entity.CashDistribution.mmLoyaltyPremiumIndicator, com.tools20022.repository.entity.CashDistribution.mmPaymentType,
								com.tools20022.repository.entity.CashDistribution.mmSelectionDate, com.tools20022.repository.entity.CashDistribution.mmCashDistributionRate,
								com.tools20022.repository.entity.CashDistribution.mmCashDistributionAmount);
			}

			@Override
			public Class<?> getInstanceClass() {
				return CashDistribution.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<CurrencyExchange> getDistributionCurrencyExchangeInformation() {
		return distributionCurrencyExchangeInformation;
	}

	public void setDistributionCurrencyExchangeInformation(List<com.tools20022.repository.entity.CurrencyExchange> distributionCurrencyExchangeInformation) {
		this.distributionCurrencyExchangeInformation = distributionCurrencyExchangeInformation;
	}

	public SecuritiesAndCashDistribution getSecuritiesAndCashDistribution() {
		return securitiesAndCashDistribution;
	}

	public void setSecuritiesAndCashDistribution(com.tools20022.repository.entity.SecuritiesAndCashDistribution securitiesAndCashDistribution) {
		this.securitiesAndCashDistribution = securitiesAndCashDistribution;
	}

	public BaseOneRate getAmortisedRate() {
		return amortisedRate;
	}

	public void setAmortisedRate(BaseOneRate amortisedRate) {
		this.amortisedRate = amortisedRate;
	}

	public PercentageRate getRate() {
		return rate;
	}

	public void setRate(PercentageRate rate) {
		this.rate = rate;
	}

	public PercentageRate getCashIndemnityRate() {
		return cashIndemnityRate;
	}

	public void setCashIndemnityRate(PercentageRate cashIndemnityRate) {
		this.cashIndemnityRate = cashIndemnityRate;
	}

	public YesNoIndicator getDividendReinvestmentIndicator() {
		return dividendReinvestmentIndicator;
	}

	public void setDividendReinvestmentIndicator(YesNoIndicator dividendReinvestmentIndicator) {
		this.dividendReinvestmentIndicator = dividendReinvestmentIndicator;
	}

	public CurrencyAndAmount getInterestAmount() {
		return interestAmount;
	}

	public void setInterestAmount(CurrencyAndAmount interestAmount) {
		this.interestAmount = interestAmount;
	}

	public PercentageRate getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(PercentageRate interestRate) {
		this.interestRate = interestRate;
	}

	public YesNoIndicator getLoyaltyPremiumIndicator() {
		return loyaltyPremiumIndicator;
	}

	public void setLoyaltyPremiumIndicator(YesNoIndicator loyaltyPremiumIndicator) {
		this.loyaltyPremiumIndicator = loyaltyPremiumIndicator;
	}

	public PaymentTypeCode getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(PaymentTypeCode paymentType) {
		this.paymentType = paymentType;
	}

	public ISODateTime getSelectionDate() {
		return selectionDate;
	}

	public void setSelectionDate(ISODateTime selectionDate) {
		this.selectionDate = selectionDate;
	}

	public PercentageRate getCashDistributionRate() {
		return cashDistributionRate;
	}

	public void setCashDistributionRate(PercentageRate cashDistributionRate) {
		this.cashDistributionRate = cashDistributionRate;
	}

	public CurrencyAndAmount getCashDistributionAmount() {
		return cashDistributionAmount;
	}

	public void setCashDistributionAmount(CurrencyAndAmount cashDistributionAmount) {
		this.cashDistributionAmount = cashDistributionAmount;
	}
}