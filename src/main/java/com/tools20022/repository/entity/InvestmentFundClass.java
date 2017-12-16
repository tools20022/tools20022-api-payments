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
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.Security;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Security that is a sub-set of an investment fund, and is governed by the same
 * investment fund policy, for example, a dividend option or valuation currency.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="InvestmentFundClass" src="doc-files/InvestmentFundClass.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmClassType
 * InvestmentFundClass.mmClassType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmDistributionPolicy
 * InvestmentFundClass.mmDistributionPolicy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmDividendPolicy
 * InvestmentFundClass.mmDividendPolicy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmDualFundIndicator
 * InvestmentFundClass.mmDualFundIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmRequestedNAVCurrency
 * InvestmentFundClass.mmRequestedNAVCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmTradingCurrency
 * InvestmentFundClass.mmTradingCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmInvestmentFund
 * InvestmentFundClass.mmInvestmentFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmPhysicalBearerSecurities
 * InvestmentFundClass.mmPhysicalBearerSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmDematerialisedBearerSecurities
 * InvestmentFundClass.mmDematerialisedBearerSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmPhysicalRegisteredSecurities
 * InvestmentFundClass.mmPhysicalRegisteredSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmDematerialisedRegisteredSecurities
 * InvestmentFundClass.mmDematerialisedRegisteredSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmProcessingCharacteristics
 * InvestmentFundClass.mmProcessingCharacteristics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmProductGroup
 * InvestmentFundClass.mmProductGroup}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmInvestmentAccount
 * InvestmentFundClass.mmInvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmNetAssetValueCalculation
 * InvestmentFundClass.mmNetAssetValueCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmInvestmentFundTransaction
 * InvestmentFundClass.mmInvestmentFundTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmSeriesIssueIdentificationDate
 * InvestmentFundClass.mmSeriesIssueIdentificationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmSeriesName
 * InvestmentFundClass.mmSeriesName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmNewIssueIndicator
 * InvestmentFundClass.mmNewIssueIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmEqualisation
 * InvestmentFundClass.mmEqualisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmTopUpAmount
 * InvestmentFundClass.mmTopUpAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmHoldBackAmount
 * InvestmentFundClass.mmHoldBackAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmHoldBackReleaseDate
 * InvestmentFundClass.mmHoldBackReleaseDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmLotDescription
 * InvestmentFundClass.mmLotDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmFundClassification
 * InvestmentFundClass.mmFundClassification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmUnderlyingAssetType
 * InvestmentFundClass.mmUnderlyingAssetType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmInvestorType
 * InvestmentFundClass.mmInvestorType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmReinvestment
 * InvestmentFundClass.mmReinvestment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmOutstandingUnits
 * InvestmentFundClass.mmOutstandingUnits}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentificationForInvestmentFundClass
 * GenericIdentification.mmIdentificationForInvestmentFundClass}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFund#mmInvestmentFundClass
 * InvestmentFund.mmInvestmentFundClass}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmFundClass
 * InvestmentFundClassProcessingCharacteristics.mmFundClass}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmRelatedFund
 * NetAssetValueCalculation.mmRelatedFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmInvestmentFundClass
 * InvestmentAccount.mmInvestmentFundClass}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmInvestmentFundClass
 * InvestmentFundTransaction.mmInvestmentFundClass}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Equalisation#mmRelatedInvestmentFundTransaction
 * Equalisation.mmRelatedInvestmentFundTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Reinvestment#mmInvestmentFundClass
 * Reinvestment.mmInvestmentFundClass}</li>
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
 * "InvestmentFundClass"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Security that is a sub-set of an investment fund, and is governed by the same investment fund policy, for example, a dividend option or valuation currency."
 * </li>
 * </ul>
 */
public class InvestmentFundClass extends Security {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text classType;
	/**
	 * Features of units offered by a fund. For example, a unit may have a
	 * specific load structure, eg, front end or back end, an income policy, eg,
	 * pay out or accumulate, or a trailer policy, eg, with or without. Fund
	 * classes are typically denoted by a single character, eg, 'Class A',
	 * 'Class 2'.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClassType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Features of units offered by a fund. For example, a unit may have a specific load structure, eg, front end or back end, an income policy, eg, pay out or accumulate, or a trailer policy, eg, with or without. Fund classes are typically denoted by a single character, eg, 'Class A', 'Class 2'."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmClassType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClassType";
			definition = "Features of units offered by a fund. For example, a unit may have a specific load structure, eg, front end or back end, an income policy, eg, pay out or accumulate, or a trailer policy, eg, with or without. Fund classes are typically denoted by a single character, eg, 'Class A', 'Class 2'.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundClass.class.getMethod("getClassType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DistributionPolicyCode distributionPolicy;
	/**
	 * Income policy relating to a class type, ie, if income is paid out or
	 * retained in the fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DistributionPolicyCode
	 * DistributionPolicyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DistributionPolicy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Income policy relating to a class type, ie, if income is paid out or retained in the fund."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDistributionPolicy = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DistributionPolicy";
			definition = "Income policy relating to a class type, ie, if income is paid out or retained in the fund.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DistributionPolicyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundClass.class.getMethod("getDistributionPolicy", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DividendPolicyCode dividendPolicy;
	/**
	 * Dividend policy of the fund, eg, cash, units.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DividendPolicyCode
	 * DividendPolicyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendPolicy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Dividend policy of the fund, eg, cash, units."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDividendPolicy = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DividendPolicy";
			definition = "Dividend policy of the fund, eg, cash, units.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DividendPolicyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundClass.class.getMethod("getDividendPolicy", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator dualFundIndicator;
	/**
	 * Indicates whether the fund has two prices.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DualFundIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the fund has two prices."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDualFundIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DualFundIndicator";
			definition = "Indicates whether the fund has two prices.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundClass.class.getMethod("getDualFundIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyCode requestedNAVCurrency;
	/**
	 * Currency to be used for pricing the fund. This currency must be among the
	 * set of currencies in which the price may be expressed, as stated in the
	 * prospectus.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedNAVCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency to be used for pricing the fund. This currency must be among the set of currencies in which the price may be expressed, as stated in the prospectus."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRequestedNAVCurrency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RequestedNAVCurrency";
			definition = "Currency to be used for pricing the fund. This currency must be among the set of currencies in which the price may be expressed, as stated in the prospectus.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundClass.class.getMethod("getRequestedNAVCurrency", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyCode tradingCurrency;
	/**
	 * Currency of the investment fund class.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency of the investment fund class."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTradingCurrency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradingCurrency";
			definition = "Currency of the investment fund class.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundClass.class.getMethod("getTradingCurrency", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected InvestmentFund investmentFund;
	/**
	 * Investment fund which is related to the investment fund class.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFund#mmInvestmentFundClass
	 * InvestmentFund.mmInvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentFund
	 * InvestmentFund}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentFund"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment fund which is related to the investment fund class."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmInvestmentFund = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentFund";
			definition = "Investment fund which is related to the investment fund class.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFund.mmInvestmentFundClass;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFund.mmObject();
		}
	};
	protected YesNoIndicator physicalBearerSecurities;
	/**
	 * Indicates whether or not it is possible to hold bearer units/shares in
	 * this class in certified form
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalBearerSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether or not it is possible to hold bearer units/shares in this class in certified form"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPhysicalBearerSecurities = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PhysicalBearerSecurities";
			definition = "Indicates whether or not it is possible to hold bearer units/shares in this class in certified form";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundClass.class.getMethod("getPhysicalBearerSecurities", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator dematerialisedBearerSecurities;
	/**
	 * Indicate whether or not it is possible to hold bearer units/shares in
	 * paperless form
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DematerialisedBearerSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicate whether or not it is possible to hold bearer units/shares in paperless form"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDematerialisedBearerSecurities = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DematerialisedBearerSecurities";
			definition = "Indicate whether or not it is possible to hold bearer units/shares in paperless form";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundClass.class.getMethod("getDematerialisedBearerSecurities", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator physicalRegisteredSecurities;
	/**
	 * Indicate whether or not it is possible to hold registered units/shares in
	 * this class in paperless form
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalRegisteredSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicate whether or not it is possible to hold registered units/shares in this class in paperless form"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPhysicalRegisteredSecurities = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PhysicalRegisteredSecurities";
			definition = "Indicate whether or not it is possible to hold registered units/shares in this class in paperless form";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundClass.class.getMethod("getPhysicalRegisteredSecurities", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator dematerialisedRegisteredSecurities;
	/**
	 * Indicate whether or not it is possible to hold registered units/shares in
	 * this class in paperless form
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DematerialisedRegisteredSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicate whether or not it is possible to hold registered units/shares in this class in paperless form"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDematerialisedRegisteredSecurities = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DematerialisedRegisteredSecurities";
			definition = "Indicate whether or not it is possible to hold registered units/shares in this class in paperless form";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundClass.class.getMethod("getDematerialisedRegisteredSecurities", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics> processingCharacteristics;
	/**
	 * Processing characteristics linked to the investment fund class, ie, not
	 * to the market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmFundClass
	 * InvestmentFundClassProcessingCharacteristics.mmFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingCharacteristics"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Processing characteristics linked to the investment fund class, ie, not to  the market."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmProcessingCharacteristics = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProcessingCharacteristics";
			definition = "Processing characteristics linked to the investment fund class, ie, not to  the market.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmFundClass;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmObject();
		}
	};
	protected Max140Text productGroup;
	/**
	 * Company specific description of a group of funds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProductGroup"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Company specific description of a group of funds."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmProductGroup = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProductGroup";
			definition = "Company specific description of a group of funds.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundClass.class.getMethod("getProductGroup", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.InvestmentAccount> investmentAccount;
	/**
	 * Account which holds investment fund classes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmInvestmentFundClass
	 * InvestmentAccount.mmInvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account which holds investment fund classes."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmInvestmentAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentAccount";
			definition = "Account which holds investment fund classes.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.mmInvestmentFundClass;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.mmObject();
		}
	};
	protected NetAssetValueCalculation netAssetValueCalculation;
	/**
	 * Calculation of the value of the fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmRelatedFund
	 * NetAssetValueCalculation.mmRelatedFund}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation
	 * NetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetAssetValueCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Calculation of the value of the fund."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmNetAssetValueCalculation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NetAssetValueCalculation";
			definition = "Calculation of the value of the fund.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmRelatedFund;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.InvestmentFundTransaction> investmentFundTransaction;
	/**
	 * Transaction which is related to the fund class.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmInvestmentFundClass
	 * InvestmentFundTransaction.mmInvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction
	 * InvestmentFundTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentFundTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction which is related to the fund class."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmInvestmentFundTransaction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundTransaction";
			definition = "Transaction which is related to the fund class.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.mmInvestmentFundClass;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.mmObject();
		}
	};
	protected ISODate seriesIssueIdentificationDate;
	/**
	 * Date that identifies the issue of a fund series. Typically applicable to
	 * a redemption or order confirmation, but may be specified in the
	 * subscription, if known.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SeriesIssueIdentificationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date that identifies the issue of a fund series. Typically applicable to a redemption or order confirmation, but may be specified in the subscription, if known."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSeriesIssueIdentificationDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SeriesIssueIdentificationDate";
			definition = "Date that identifies the issue of a fund series. Typically applicable to a redemption or order confirmation, but may be specified in the subscription, if known.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundClass.class.getMethod("getSeriesIssueIdentificationDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text seriesName;
	/**
	 * Identifies the name of a fund series. Typically applicable to a
	 * redemption or order confirmation, but may be specified in the
	 * subscription, if known.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SeriesName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the name of a fund series. Typically applicable to a redemption or order confirmation, but may be specified in the subscription, if known."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSeriesName = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SeriesName";
			definition = "Identifies the name of a fund series. Typically applicable to a redemption or order confirmation, but may be specified in the subscription, if known.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundClass.class.getMethod("getSeriesName", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator newIssueIndicator;
	/**
	 * Indicates that the financial instrument and/or series included in the
	 * message is a new issue.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewIssueIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the financial instrument and/or series included in the message is a new issue."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmNewIssueIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NewIssueIndicator";
			definition = "Indicates that the financial instrument and/or series included in the message is a new issue.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundClass.class.getMethod("getNewIssueIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Equalisation equalisation;
	/**
	 * Part of an investor's subscription amount that is held by the fund in
	 * order to pay incentive / performance fees at the end of the fiscal year.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Equalisation#mmRelatedInvestmentFundTransaction
	 * Equalisation.mmRelatedInvestmentFundTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Equalisation
	 * Equalisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Equalisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Part of an investor's subscription amount that is held by the fund in order to pay incentive / performance fees at the end of the fiscal year."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmEqualisation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Equalisation";
			definition = "Part of an investor's subscription amount that is held by the fund in order to pay incentive / performance fees at the end of the fiscal year.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Equalisation.mmRelatedInvestmentFundTransaction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Equalisation.mmObject();
		}
	};
	protected CurrencyAndAmount topUpAmount;
	/**
	 * Additional amount of money (top-up amount) required to meet the minimum
	 * subscription amount.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TopUpAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional amount of money (top-up amount) required to meet the minimum subscription amount."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTopUpAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TopUpAmount";
			definition = "Additional amount of money (top-up amount) required to meet the minimum subscription amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundClass.class.getMethod("getTopUpAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount holdBackAmount;
	/**
	 * Value of the redemption amount subject to hold back.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldBackAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value of the redemption amount subject to hold back."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmHoldBackAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "HoldBackAmount";
			definition = "Value of the redemption amount subject to hold back.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundClass.class.getMethod("getHoldBackAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODate holdBackReleaseDate;
	/**
	 * Date on which the hold back amount is to be released.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldBackReleaseDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which the hold back amount is to be released."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmHoldBackReleaseDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "HoldBackReleaseDate";
			definition = "Date on which the hold back amount is to be released.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundClass.class.getMethod("getHoldBackReleaseDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max350Text lotDescription;
	/**
	 * Description of the lot.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LotDescription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Description of the lot."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmLotDescription = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LotDescription";
			definition = "Description of the lot.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundClass.class.getMethod("getLotDescription", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected GenericIdentification fundClassification;
	/**
	 * Method of classifying a fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentificationForInvestmentFundClass
	 * GenericIdentification.mmIdentificationForInvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundClassification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Method of classifying a fund."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmFundClassification = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FundClassification";
			definition = "Method of classifying a fund.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmIdentificationForInvestmentFundClass;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
		}
	};
	protected FinancialInstrumentProductTypeCode underlyingAssetType;
	/**
	 * Specifies the type of assets in which the fund invests.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingAssetType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of assets in which the fund invests."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmUnderlyingAssetType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnderlyingAssetType";
			definition = "Specifies the type of assets in which the fund invests.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundClass.class.getMethod("getUnderlyingAssetType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected InvestorTypeCode investorType;
	/**
	 * Type of investor that can invest in the fund class.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InvestorTypeCode
	 * InvestorTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestorType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of investor that can invest in the fund class."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmInvestorType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestorType";
			definition = "Type of investor that can invest in the fund class.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InvestorTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundClass.class.getMethod("getInvestorType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Reinvestment reinvestment;
	/**
	 * Reinvestment information which involves this investment fund class.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Reinvestment#mmInvestmentFundClass
	 * Reinvestment.mmInvestmentFundClass}</li>
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reinvestment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reinvestment information which involves this investment fund class."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmReinvestment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Reinvestment";
			definition = "Reinvestment information which involves this investment fund class.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Reinvestment.mmInvestmentFundClass;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Reinvestment.mmObject();
		}
	};
	protected DecimalNumber outstandingUnits;
	/**
	 * Investment fund class currently held by shareholders.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OutstandingUnits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Investment fund class currently held by shareholders."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmOutstandingUnits = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OutstandingUnits";
			definition = "Investment fund class currently held by shareholders.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundClass.class.getMethod("getOutstandingUnits", new Class[]{});
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
				name = "InvestmentFundClass";
				definition = "Security that is a sub-set of an investment fund, and is governed by the same investment fund policy, for example, a dividend option or valuation currency.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GenericIdentification.mmIdentificationForInvestmentFundClass, com.tools20022.repository.entity.InvestmentFund.mmInvestmentFundClass,
						com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmFundClass, com.tools20022.repository.entity.NetAssetValueCalculation.mmRelatedFund,
						com.tools20022.repository.entity.InvestmentAccount.mmInvestmentFundClass, com.tools20022.repository.entity.InvestmentFundTransaction.mmInvestmentFundClass,
						com.tools20022.repository.entity.Equalisation.mmRelatedInvestmentFundTransaction, com.tools20022.repository.entity.Reinvestment.mmInvestmentFundClass);
				superType_lazy = () -> Security.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFundClass.mmClassType, com.tools20022.repository.entity.InvestmentFundClass.mmDistributionPolicy,
						com.tools20022.repository.entity.InvestmentFundClass.mmDividendPolicy, com.tools20022.repository.entity.InvestmentFundClass.mmDualFundIndicator,
						com.tools20022.repository.entity.InvestmentFundClass.mmRequestedNAVCurrency, com.tools20022.repository.entity.InvestmentFundClass.mmTradingCurrency,
						com.tools20022.repository.entity.InvestmentFundClass.mmInvestmentFund, com.tools20022.repository.entity.InvestmentFundClass.mmPhysicalBearerSecurities,
						com.tools20022.repository.entity.InvestmentFundClass.mmDematerialisedBearerSecurities, com.tools20022.repository.entity.InvestmentFundClass.mmPhysicalRegisteredSecurities,
						com.tools20022.repository.entity.InvestmentFundClass.mmDematerialisedRegisteredSecurities, com.tools20022.repository.entity.InvestmentFundClass.mmProcessingCharacteristics,
						com.tools20022.repository.entity.InvestmentFundClass.mmProductGroup, com.tools20022.repository.entity.InvestmentFundClass.mmInvestmentAccount,
						com.tools20022.repository.entity.InvestmentFundClass.mmNetAssetValueCalculation, com.tools20022.repository.entity.InvestmentFundClass.mmInvestmentFundTransaction,
						com.tools20022.repository.entity.InvestmentFundClass.mmSeriesIssueIdentificationDate, com.tools20022.repository.entity.InvestmentFundClass.mmSeriesName,
						com.tools20022.repository.entity.InvestmentFundClass.mmNewIssueIndicator, com.tools20022.repository.entity.InvestmentFundClass.mmEqualisation, com.tools20022.repository.entity.InvestmentFundClass.mmTopUpAmount,
						com.tools20022.repository.entity.InvestmentFundClass.mmHoldBackAmount, com.tools20022.repository.entity.InvestmentFundClass.mmHoldBackReleaseDate,
						com.tools20022.repository.entity.InvestmentFundClass.mmLotDescription, com.tools20022.repository.entity.InvestmentFundClass.mmFundClassification,
						com.tools20022.repository.entity.InvestmentFundClass.mmUnderlyingAssetType, com.tools20022.repository.entity.InvestmentFundClass.mmInvestorType, com.tools20022.repository.entity.InvestmentFundClass.mmReinvestment,
						com.tools20022.repository.entity.InvestmentFundClass.mmOutstandingUnits);
			}

			@Override
			public Class<?> getInstanceClass() {
				return InvestmentFundClass.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getClassType() {
		return classType;
	}

	public void setClassType(Max35Text classType) {
		this.classType = classType;
	}

	public DistributionPolicyCode getDistributionPolicy() {
		return distributionPolicy;
	}

	public void setDistributionPolicy(DistributionPolicyCode distributionPolicy) {
		this.distributionPolicy = distributionPolicy;
	}

	public DividendPolicyCode getDividendPolicy() {
		return dividendPolicy;
	}

	public void setDividendPolicy(DividendPolicyCode dividendPolicy) {
		this.dividendPolicy = dividendPolicy;
	}

	public YesNoIndicator getDualFundIndicator() {
		return dualFundIndicator;
	}

	public void setDualFundIndicator(YesNoIndicator dualFundIndicator) {
		this.dualFundIndicator = dualFundIndicator;
	}

	public CurrencyCode getRequestedNAVCurrency() {
		return requestedNAVCurrency;
	}

	public void setRequestedNAVCurrency(CurrencyCode requestedNAVCurrency) {
		this.requestedNAVCurrency = requestedNAVCurrency;
	}

	public CurrencyCode getTradingCurrency() {
		return tradingCurrency;
	}

	public void setTradingCurrency(CurrencyCode tradingCurrency) {
		this.tradingCurrency = tradingCurrency;
	}

	public InvestmentFund getInvestmentFund() {
		return investmentFund;
	}

	public void setInvestmentFund(com.tools20022.repository.entity.InvestmentFund investmentFund) {
		this.investmentFund = investmentFund;
	}

	public YesNoIndicator getPhysicalBearerSecurities() {
		return physicalBearerSecurities;
	}

	public void setPhysicalBearerSecurities(YesNoIndicator physicalBearerSecurities) {
		this.physicalBearerSecurities = physicalBearerSecurities;
	}

	public YesNoIndicator getDematerialisedBearerSecurities() {
		return dematerialisedBearerSecurities;
	}

	public void setDematerialisedBearerSecurities(YesNoIndicator dematerialisedBearerSecurities) {
		this.dematerialisedBearerSecurities = dematerialisedBearerSecurities;
	}

	public YesNoIndicator getPhysicalRegisteredSecurities() {
		return physicalRegisteredSecurities;
	}

	public void setPhysicalRegisteredSecurities(YesNoIndicator physicalRegisteredSecurities) {
		this.physicalRegisteredSecurities = physicalRegisteredSecurities;
	}

	public YesNoIndicator getDematerialisedRegisteredSecurities() {
		return dematerialisedRegisteredSecurities;
	}

	public void setDematerialisedRegisteredSecurities(YesNoIndicator dematerialisedRegisteredSecurities) {
		this.dematerialisedRegisteredSecurities = dematerialisedRegisteredSecurities;
	}

	public List<InvestmentFundClassProcessingCharacteristics> getProcessingCharacteristics() {
		return processingCharacteristics;
	}

	public void setProcessingCharacteristics(List<com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics> processingCharacteristics) {
		this.processingCharacteristics = processingCharacteristics;
	}

	public Max140Text getProductGroup() {
		return productGroup;
	}

	public void setProductGroup(Max140Text productGroup) {
		this.productGroup = productGroup;
	}

	public List<InvestmentAccount> getInvestmentAccount() {
		return investmentAccount;
	}

	public void setInvestmentAccount(List<com.tools20022.repository.entity.InvestmentAccount> investmentAccount) {
		this.investmentAccount = investmentAccount;
	}

	public NetAssetValueCalculation getNetAssetValueCalculation() {
		return netAssetValueCalculation;
	}

	public void setNetAssetValueCalculation(com.tools20022.repository.entity.NetAssetValueCalculation netAssetValueCalculation) {
		this.netAssetValueCalculation = netAssetValueCalculation;
	}

	public List<InvestmentFundTransaction> getInvestmentFundTransaction() {
		return investmentFundTransaction;
	}

	public void setInvestmentFundTransaction(List<com.tools20022.repository.entity.InvestmentFundTransaction> investmentFundTransaction) {
		this.investmentFundTransaction = investmentFundTransaction;
	}

	public ISODate getSeriesIssueIdentificationDate() {
		return seriesIssueIdentificationDate;
	}

	public void setSeriesIssueIdentificationDate(ISODate seriesIssueIdentificationDate) {
		this.seriesIssueIdentificationDate = seriesIssueIdentificationDate;
	}

	public Max35Text getSeriesName() {
		return seriesName;
	}

	public void setSeriesName(Max35Text seriesName) {
		this.seriesName = seriesName;
	}

	public YesNoIndicator getNewIssueIndicator() {
		return newIssueIndicator;
	}

	public void setNewIssueIndicator(YesNoIndicator newIssueIndicator) {
		this.newIssueIndicator = newIssueIndicator;
	}

	public Equalisation getEqualisation() {
		return equalisation;
	}

	public void setEqualisation(com.tools20022.repository.entity.Equalisation equalisation) {
		this.equalisation = equalisation;
	}

	public CurrencyAndAmount getTopUpAmount() {
		return topUpAmount;
	}

	public void setTopUpAmount(CurrencyAndAmount topUpAmount) {
		this.topUpAmount = topUpAmount;
	}

	public CurrencyAndAmount getHoldBackAmount() {
		return holdBackAmount;
	}

	public void setHoldBackAmount(CurrencyAndAmount holdBackAmount) {
		this.holdBackAmount = holdBackAmount;
	}

	public ISODate getHoldBackReleaseDate() {
		return holdBackReleaseDate;
	}

	public void setHoldBackReleaseDate(ISODate holdBackReleaseDate) {
		this.holdBackReleaseDate = holdBackReleaseDate;
	}

	public Max350Text getLotDescription() {
		return lotDescription;
	}

	public void setLotDescription(Max350Text lotDescription) {
		this.lotDescription = lotDescription;
	}

	public GenericIdentification getFundClassification() {
		return fundClassification;
	}

	public void setFundClassification(com.tools20022.repository.entity.GenericIdentification fundClassification) {
		this.fundClassification = fundClassification;
	}

	public FinancialInstrumentProductTypeCode getUnderlyingAssetType() {
		return underlyingAssetType;
	}

	public void setUnderlyingAssetType(FinancialInstrumentProductTypeCode underlyingAssetType) {
		this.underlyingAssetType = underlyingAssetType;
	}

	public InvestorTypeCode getInvestorType() {
		return investorType;
	}

	public void setInvestorType(InvestorTypeCode investorType) {
		this.investorType = investorType;
	}

	public Reinvestment getReinvestment() {
		return reinvestment;
	}

	public void setReinvestment(com.tools20022.repository.entity.Reinvestment reinvestment) {
		this.reinvestment = reinvestment;
	}

	public DecimalNumber getOutstandingUnits() {
		return outstandingUnits;
	}

	public void setOutstandingUnits(DecimalNumber outstandingUnits) {
		this.outstandingUnits = outstandingUnits;
	}
}