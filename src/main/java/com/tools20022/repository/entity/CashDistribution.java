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
import com.tools20022.repository.entity.CurrencyExchange;
import com.tools20022.repository.entity.Distribution;
import com.tools20022.repository.entity.SecuritiesAndCashDistribution;
import com.tools20022.repository.GeneratedRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

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
	protected List<CurrencyExchange> distributionCurrencyExchangeInformation;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<CashDistribution, List<CurrencyExchange>> mmDistributionCurrencyExchangeInformation = new MMBusinessAssociationEnd<CashDistribution, List<CurrencyExchange>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashDistribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DistributionCurrencyExchangeInformation";
			definition = "Detailed information about the currency exchange in a distribution event.";
			minOccurs = 0;
			opposite_lazy = () -> CurrencyExchange.mmCurrencyExchangeForCashDistribution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CurrencyExchange.mmObject();
		}

		@Override
		public List<CurrencyExchange> getValue(CashDistribution obj) {
			return obj.getDistributionCurrencyExchangeInformation();
		}

		@Override
		public void setValue(CashDistribution obj, List<CurrencyExchange> value) {
			obj.setDistributionCurrencyExchangeInformation(value);
		}
	};
	protected SecuritiesAndCashDistribution securitiesAndCashDistribution;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<CashDistribution, com.tools20022.repository.entity.SecuritiesAndCashDistribution> mmSecuritiesAndCashDistribution = new MMBusinessAssociationEnd<CashDistribution, com.tools20022.repository.entity.SecuritiesAndCashDistribution>() {
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

		@Override
		public com.tools20022.repository.entity.SecuritiesAndCashDistribution getValue(CashDistribution obj) {
			return obj.getSecuritiesAndCashDistribution();
		}

		@Override
		public void setValue(CashDistribution obj, com.tools20022.repository.entity.SecuritiesAndCashDistribution value) {
			obj.setSecuritiesAndCashDistribution(value);
		}
	};
	protected BaseOneRate amortisedRate;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<CashDistribution, BaseOneRate> mmAmortisedRate = new MMBusinessAttribute<CashDistribution, BaseOneRate>() {
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

		@Override
		public BaseOneRate getValue(CashDistribution obj) {
			return obj.getAmortisedRate();
		}

		@Override
		public void setValue(CashDistribution obj, BaseOneRate value) {
			obj.setAmortisedRate(value);
		}
	};
	protected PercentageRate rate;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<CashDistribution, PercentageRate> mmRate = new MMBusinessAttribute<CashDistribution, PercentageRate>() {
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

		@Override
		public PercentageRate getValue(CashDistribution obj) {
			return obj.getRate();
		}

		@Override
		public void setValue(CashDistribution obj, PercentageRate value) {
			obj.setRate(value);
		}
	};
	protected PercentageRate cashIndemnityRate;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<CashDistribution, PercentageRate> mmCashIndemnityRate = new MMBusinessAttribute<CashDistribution, PercentageRate>() {
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

		@Override
		public PercentageRate getValue(CashDistribution obj) {
			return obj.getCashIndemnityRate();
		}

		@Override
		public void setValue(CashDistribution obj, PercentageRate value) {
			obj.setCashIndemnityRate(value);
		}
	};
	protected YesNoIndicator dividendReinvestmentIndicator;
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
	public static final MMBusinessAttribute<CashDistribution, YesNoIndicator> mmDividendReinvestmentIndicator = new MMBusinessAttribute<CashDistribution, YesNoIndicator>() {
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

		@Override
		public YesNoIndicator getValue(CashDistribution obj) {
			return obj.getDividendReinvestmentIndicator();
		}

		@Override
		public void setValue(CashDistribution obj, YesNoIndicator value) {
			obj.setDividendReinvestmentIndicator(value);
		}
	};
	protected CurrencyAndAmount interestAmount;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<CashDistribution, CurrencyAndAmount> mmInterestAmount = new MMBusinessAttribute<CashDistribution, CurrencyAndAmount>() {
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

		@Override
		public CurrencyAndAmount getValue(CashDistribution obj) {
			return obj.getInterestAmount();
		}

		@Override
		public void setValue(CashDistribution obj, CurrencyAndAmount value) {
			obj.setInterestAmount(value);
		}
	};
	protected PercentageRate interestRate;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<CashDistribution, PercentageRate> mmInterestRate = new MMBusinessAttribute<CashDistribution, PercentageRate>() {
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

		@Override
		public PercentageRate getValue(CashDistribution obj) {
			return obj.getInterestRate();
		}

		@Override
		public void setValue(CashDistribution obj, PercentageRate value) {
			obj.setInterestRate(value);
		}
	};
	protected YesNoIndicator loyaltyPremiumIndicator;
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
	public static final MMBusinessAttribute<CashDistribution, YesNoIndicator> mmLoyaltyPremiumIndicator = new MMBusinessAttribute<CashDistribution, YesNoIndicator>() {
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

		@Override
		public YesNoIndicator getValue(CashDistribution obj) {
			return obj.getLoyaltyPremiumIndicator();
		}

		@Override
		public void setValue(CashDistribution obj, YesNoIndicator value) {
			obj.setLoyaltyPremiumIndicator(value);
		}
	};
	protected PaymentTypeCode paymentType;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<CashDistribution, PaymentTypeCode> mmPaymentType = new MMBusinessAttribute<CashDistribution, PaymentTypeCode>() {
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

		@Override
		public PaymentTypeCode getValue(CashDistribution obj) {
			return obj.getPaymentType();
		}

		@Override
		public void setValue(CashDistribution obj, PaymentTypeCode value) {
			obj.setPaymentType(value);
		}
	};
	protected ISODateTime selectionDate;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<CashDistribution, ISODateTime> mmSelectionDate = new MMBusinessAttribute<CashDistribution, ISODateTime>() {
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

		@Override
		public ISODateTime getValue(CashDistribution obj) {
			return obj.getSelectionDate();
		}

		@Override
		public void setValue(CashDistribution obj, ISODateTime value) {
			obj.setSelectionDate(value);
		}
	};
	protected PercentageRate cashDistributionRate;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<CashDistribution, PercentageRate> mmCashDistributionRate = new MMBusinessAttribute<CashDistribution, PercentageRate>() {
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

		@Override
		public PercentageRate getValue(CashDistribution obj) {
			return obj.getCashDistributionRate();
		}

		@Override
		public void setValue(CashDistribution obj, PercentageRate value) {
			obj.setCashDistributionRate(value);
		}
	};
	protected CurrencyAndAmount cashDistributionAmount;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<CashDistribution, CurrencyAndAmount> mmCashDistributionAmount = new MMBusinessAttribute<CashDistribution, CurrencyAndAmount>() {
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

		@Override
		public CurrencyAndAmount getValue(CashDistribution obj) {
			return obj.getCashDistributionAmount();
		}

		@Override
		public void setValue(CashDistribution obj, CurrencyAndAmount value) {
			obj.setCashDistributionAmount(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CashDistribution";
				definition = "Distribution of cash pay-out.";
				associationDomain_lazy = () -> Arrays.asList(CurrencyExchange.mmCurrencyExchangeForCashDistribution, com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmCashDistribution);
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
		return distributionCurrencyExchangeInformation == null ? distributionCurrencyExchangeInformation = new ArrayList<>() : distributionCurrencyExchangeInformation;
	}

	public CashDistribution setDistributionCurrencyExchangeInformation(List<CurrencyExchange> distributionCurrencyExchangeInformation) {
		this.distributionCurrencyExchangeInformation = Objects.requireNonNull(distributionCurrencyExchangeInformation);
		return this;
	}

	public SecuritiesAndCashDistribution getSecuritiesAndCashDistribution() {
		return securitiesAndCashDistribution;
	}

	public CashDistribution setSecuritiesAndCashDistribution(com.tools20022.repository.entity.SecuritiesAndCashDistribution securitiesAndCashDistribution) {
		this.securitiesAndCashDistribution = Objects.requireNonNull(securitiesAndCashDistribution);
		return this;
	}

	public BaseOneRate getAmortisedRate() {
		return amortisedRate;
	}

	public CashDistribution setAmortisedRate(BaseOneRate amortisedRate) {
		this.amortisedRate = Objects.requireNonNull(amortisedRate);
		return this;
	}

	public PercentageRate getRate() {
		return rate;
	}

	public CashDistribution setRate(PercentageRate rate) {
		this.rate = Objects.requireNonNull(rate);
		return this;
	}

	public PercentageRate getCashIndemnityRate() {
		return cashIndemnityRate;
	}

	public CashDistribution setCashIndemnityRate(PercentageRate cashIndemnityRate) {
		this.cashIndemnityRate = Objects.requireNonNull(cashIndemnityRate);
		return this;
	}

	public YesNoIndicator getDividendReinvestmentIndicator() {
		return dividendReinvestmentIndicator;
	}

	public CashDistribution setDividendReinvestmentIndicator(YesNoIndicator dividendReinvestmentIndicator) {
		this.dividendReinvestmentIndicator = Objects.requireNonNull(dividendReinvestmentIndicator);
		return this;
	}

	public CurrencyAndAmount getInterestAmount() {
		return interestAmount;
	}

	public CashDistribution setInterestAmount(CurrencyAndAmount interestAmount) {
		this.interestAmount = Objects.requireNonNull(interestAmount);
		return this;
	}

	public PercentageRate getInterestRate() {
		return interestRate;
	}

	public CashDistribution setInterestRate(PercentageRate interestRate) {
		this.interestRate = Objects.requireNonNull(interestRate);
		return this;
	}

	public YesNoIndicator getLoyaltyPremiumIndicator() {
		return loyaltyPremiumIndicator;
	}

	public CashDistribution setLoyaltyPremiumIndicator(YesNoIndicator loyaltyPremiumIndicator) {
		this.loyaltyPremiumIndicator = Objects.requireNonNull(loyaltyPremiumIndicator);
		return this;
	}

	public PaymentTypeCode getPaymentType() {
		return paymentType;
	}

	public CashDistribution setPaymentType(PaymentTypeCode paymentType) {
		this.paymentType = Objects.requireNonNull(paymentType);
		return this;
	}

	public ISODateTime getSelectionDate() {
		return selectionDate;
	}

	public CashDistribution setSelectionDate(ISODateTime selectionDate) {
		this.selectionDate = Objects.requireNonNull(selectionDate);
		return this;
	}

	public PercentageRate getCashDistributionRate() {
		return cashDistributionRate;
	}

	public CashDistribution setCashDistributionRate(PercentageRate cashDistributionRate) {
		this.cashDistributionRate = Objects.requireNonNull(cashDistributionRate);
		return this;
	}

	public CurrencyAndAmount getCashDistributionAmount() {
		return cashDistributionAmount;
	}

	public CashDistribution setCashDistributionAmount(CurrencyAndAmount cashDistributionAmount) {
		this.cashDistributionAmount = Objects.requireNonNull(cashDistributionAmount);
		return this;
	}
}