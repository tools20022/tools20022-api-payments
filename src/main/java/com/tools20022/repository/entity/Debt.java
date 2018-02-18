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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.Security;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

/**
 * Financial instruments evidencing moneys owed by the issuer to the holder on
 * terms as specified.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Debt" src="doc-files/Debt.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Debt#mmPaymentDirectionIndicator
 * Debt.mmPaymentDirectionIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmNextCallableDate
 * Debt.mmNextCallableDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmPutableDate
 * Debt.mmPutableDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmDatedDate
 * Debt.mmDatedDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmFirstPaymentDate
 * Debt.mmFirstPaymentDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmFactor Debt.mmFactor}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmPoolNumber
 * Debt.mmPoolNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Debt#mmVariableRateIndicator
 * Debt.mmVariableRateIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmCallableIndicator
 * Debt.mmCallableIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmPutableIndicator
 * Debt.mmPutableIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmYieldToMaturityRate
 * Debt.mmYieldToMaturityRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Debt#mmAccruedCapitalisationAmount
 * Debt.mmAccruedCapitalisationAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmNextCouponDate
 * Debt.mmNextCouponDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmNextFactorDate
 * Debt.mmNextFactorDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmOddCouponIndicator
 * Debt.mmOddCouponIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmCPProgram
 * Debt.mmCPProgram}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmCPRegistrationType
 * Debt.mmCPRegistrationType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmConvertibleIndicator
 * Debt.mmConvertibleIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmPreFundedIndicator
 * Debt.mmPreFundedIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmEscrowedIndicator
 * Debt.mmEscrowedIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmPerpetualIndicator
 * Debt.mmPerpetualIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Debt#mmSubordinatedIndicator
 * Debt.mmSubordinatedIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmExtendibleIndicator
 * Debt.mmExtendibleIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmExtendiblePeriod
 * Debt.mmExtendiblePeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmOverAllotmentAmount
 * Debt.mmOverAllotmentAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmOverAllotmentRate
 * Debt.mmOverAllotmentRate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmAmortisableIndicator
 * Debt.mmAmortisableIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmCapitalisedInterest
 * Debt.mmCapitalisedInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Debt#mmActualDenominationAmount
 * Debt.mmActualDenominationAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmPieces Debt.mmPieces}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmPoolsMaximum
 * Debt.mmPoolsMaximum}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmPoolsPerMillion
 * Debt.mmPoolsPerMillion}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmPoolsPerLot
 * Debt.mmPoolsPerLot}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmPoolsPerTrade
 * Debt.mmPoolsPerTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Debt#mmConstantPrePaymentPenalty
 * Debt.mmConstantPrePaymentPenalty}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmPrePaymentSpeed
 * Debt.mmPrePaymentSpeed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Debt#mmConstantPrePaymentYield
 * Debt.mmConstantPrePaymentYield}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Debt#mmWeightedAverageCoupon
 * Debt.mmWeightedAverageCoupon}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmWeightedAverageLife
 * Debt.mmWeightedAverageLife}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmWeightedAverageLoan
 * Debt.mmWeightedAverageLoan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Debt#mmWeightedAverageMaturity
 * Debt.mmWeightedAverageMaturity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmInsuredIndicator
 * Debt.mmInsuredIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmBankQualified
 * Debt.mmBankQualified}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmAutoReinvestment
 * Debt.mmAutoReinvestment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmCustomDate
 * Debt.mmCustomDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmLookBack
 * Debt.mmLookBack}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmMinimumDenomination
 * Debt.mmMinimumDenomination}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmMaximumSubstitution
 * Debt.mmMaximumSubstitution}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmMinimumIncrement
 * Debt.mmMinimumIncrement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmProduction
 * Debt.mmProduction}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmRestricted
 * Debt.mmRestricted}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmPriceFrequency
 * Debt.mmPriceFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Debt#mmSubstitutionFrequency
 * Debt.mmSubstitutionFrequency}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmSubstitutionLeft
 * Debt.mmSubstitutionLeft}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmWholePool
 * Debt.mmWholePool}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Debt#mmAlternativeMinimumTax
 * Debt.mmAlternativeMinimumTax}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmNextInterest
 * Debt.mmNextInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmExtendibleDate
 * Debt.mmExtendibleDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmSinkableIndicator
 * Debt.mmSinkableIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmInsured
 * Debt.mmInsured}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmGeographics
 * Debt.mmGeographics}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmPaymentCurrency
 * Debt.mmPaymentCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmDirtyPrice
 * Debt.mmDirtyPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmDebtSeniority
 * Debt.mmDebtSeniority}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmExtendiblePeriodDebt
 * DateTimePeriod.mmExtendiblePeriodDebt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmCustomDateDebt
 * DateTimePeriod.mmCustomDateDebt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMinimumDenominationDebt
 * SecuritiesQuantity.mmMinimumDenominationDebt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMinimumIncrementDebt
 * SecuritiesQuantity.mmMinimumIncrementDebt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmDebtInstrument
 * InterestCalculation.mmDebtInstrument}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Loan Loan}</li>
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
 * "Debt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Financial instruments evidencing moneys owed by the issuer to the holder on terms as specified."
 * </li>
 * </ul>
 */
public class Debt extends Security {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected PaymentDirectionIndicator paymentDirectionIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PaymentDirectionIndicator
	 * PaymentDirectionIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentDirectionIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the direction of payment for asset or mortgage backed securities, ie, whether the repaid capital is distributed (payment direction is down) or capitalized (payment direction is up)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPaymentDirectionIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentDirectionIndicator";
			definition = "Indicates the direction of payment for asset or mortgage backed securities, ie, whether the repaid capital is distributed (payment direction is down) or capitalized (payment direction is up).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> com.tools20022.repository.datatype.PaymentDirectionIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Debt.class.getMethod("getPaymentDirectionIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime nextCallableDate;
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NextCallableDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Next date/time at which the issuer has the right to pay the securitiy prior to maturity."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmNextCallableDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NextCallableDate";
			definition = "Next date/time at which the issuer has the right to pay the securitiy prior to maturity.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Debt.class.getMethod("getNextCallableDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime putableDate;
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PutableDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date at which the holder has the right to ask for redemption of the security prior to final maturity."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPutableDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PutableDate";
			definition = "Date at which the holder has the right to ask for redemption of the security prior to final maturity.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Debt.class.getMethod("getPutableDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime datedDate;
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DatedDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "First date/time at which a security begins to accrue interest."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDatedDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DatedDate";
			definition = "First date/time at which a security begins to accrue interest.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Debt.class.getMethod("getDatedDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime firstPaymentDate;
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstPaymentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which the first interest payment is due to holders of the security."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmFirstPaymentDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FirstPaymentDate";
			definition = "Date/time at which the first interest payment is due to holders of the security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Debt.class.getMethod("getFirstPaymentDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PercentageRate factor;
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Factor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate that defines the outstanding principal of the factored security.\r\nFactored securities are debt instruments that have a factor that is used in the calculation of net money and market value. \r\nFactors can be specified as current, next, previous or end factors.\r\nEnd factor: portion of principal that is still due at the end of the financing period.\r\nPrevious factor: portion of principal that is still due before the current factor becomes applicable.\r\nNext factor: rate that will be applicable as of the next factor date."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmFactor = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Factor";
			definition = "Rate that defines the outstanding principal of the factored security.\r\nFactored securities are debt instruments that have a factor that is used in the calculation of net money and market value. \r\nFactors can be specified as current, next, previous or end factors.\r\nEnd factor: portion of principal that is still due at the end of the financing period.\r\nPrevious factor: portion of principal that is still due before the current factor becomes applicable.\r\nNext factor: rate that will be applicable as of the next factor date.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Debt.class.getMethod("getFactor", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max15NumericText poolNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max15NumericText
	 * Max15NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PoolNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number identifying a group of underlying assets assigned by the issuer of a factored security."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPoolNumber = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PoolNumber";
			definition = "Number identifying a group of underlying assets assigned by the issuer of a factored security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Debt.class.getMethod("getPoolNumber", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator variableRateIndicator;
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariableRateIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the interest rate of an interest bearing instrument is reset periodically."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmVariableRateIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VariableRateIndicator";
			definition = "Indicates whether the interest rate of an interest bearing instrument is reset periodically.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Debt.class.getMethod("getVariableRateIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator callableIndicator;
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CallableIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the issuer has the right to pay the security prior to maturity. Also called RetractableIndicator."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCallableIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CallableIndicator";
			definition = "Indicates whether the issuer has the right to pay the security prior to maturity. Also called RetractableIndicator.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Debt.class.getMethod("getCallableIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator putableIndicator;
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PutableIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the holder has the right to ask for redemption of the security prior to final maturity. Also called RedeemableIndicator."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPutableIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PutableIndicator";
			definition = "Indicates whether the holder has the right to ask for redemption of the security prior to final maturity. Also called RedeemableIndicator.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Debt.class.getMethod("getPutableIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PercentageRate yieldToMaturityRate;
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "YieldToMaturityRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate of return anticipated on a bond when held until maturity date."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmYieldToMaturityRate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "YieldToMaturityRate";
			definition = "Rate of return anticipated on a bond when held until maturity date.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Debt.class.getMethod("getYieldToMaturityRate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount accruedCapitalisationAmount;
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::ACRU</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccruedCapitalisationAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of unpaid interest (on bonds which have defaulted and have subsequently restructured), which is capitalized and added to the original principal amount of the bond."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAccruedCapitalisationAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::ACRU"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccruedCapitalisationAmount";
			definition = "Amount of unpaid interest (on bonds which have defaulted and have subsequently restructured), which is capitalized and added to the original principal amount of the bond.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Debt.class.getMethod("getAccruedCapitalisationAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime nextCouponDate;
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::COUP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NextCouponDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Next payment date of an interest bearing financial instrument."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmNextCouponDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::COUP"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NextCouponDate";
			definition = "Next payment date of an interest bearing financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Debt.class.getMethod("getNextCouponDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime nextFactorDate;
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NextFactorDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The date that the current factor will be changed to a new factor."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmNextFactorDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NextFactorDate";
			definition = "The date that the current factor will be changed to a new factor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Debt.class.getMethod("getNextFactorDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator oddCouponIndicator;
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OddCouponIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the payment of the coupon (interest) on a bond is off the normal schedule."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmOddCouponIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OddCouponIndicator";
			definition = "Specifies whether the payment of the coupon (interest) on a bond is off the normal schedule.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Debt.class.getMethod("getOddCouponIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Number cPProgram;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CPProgram"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The program under which a commercial paper is issued. The values that are most used are:\n0 = N/A\n1 = 3(a)3\n2 = 4(2)\n3 = 3(a)4\n4 = 3(c)7\n5 = 144A\n6 = 3(a)2\n99 = Other"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCPProgram = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CPProgram";
			definition = "The program under which a commercial paper is issued. The values that are most used are:\n0 = N/A\n1 = 3(a)3\n2 = 4(2)\n3 = 3(a)4\n4 = 3(c)7\n5 = 144A\n6 = 3(a)2\n99 = Other";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Debt.class.getMethod("getCPProgram", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max350Text cPRegistrationType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CPRegistrationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Registration type of a commercial paper issuance."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCPRegistrationType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CPRegistrationType";
			definition = "Registration type of a commercial paper issuance.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Debt.class.getMethod("getCPRegistrationType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator convertibleIndicator;
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConvertibleIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the interest bearing security is convertible into another type of security."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmConvertibleIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConvertibleIndicator";
			definition = "Indicates whether the interest bearing security is convertible into another type of security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Debt.class.getMethod("getConvertibleIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator preFundedIndicator;
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreFundedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether an interest bearing instrument is deposited in a fund that will be used to pay debt service on refunded securities."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPreFundedIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PreFundedIndicator";
			definition = "Indicates whether an interest bearing instrument is deposited in a fund that will be used to pay debt service on refunded securities.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Debt.class.getMethod("getPreFundedIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator escrowedIndicator;
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EscrowedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether an interest bearing instrument is being escrowed or collateralized either by direct obligations guaranteed by the US government, or by other types of securities. The maturity schedules of the securities in the escrow fund are determined in such a way to pay the maturity value, coupon, and premium payments (if any) of the refunded bonds."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmEscrowedIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EscrowedIndicator";
			definition = "Indicates whether an interest bearing instrument is being escrowed or collateralized either by direct obligations guaranteed by the US government, or by other types of securities. The maturity schedules of the securities in the escrow fund are determined in such a way to pay the maturity value, coupon, and premium payments (if any) of the refunded bonds.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Debt.class.getMethod("getEscrowedIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator perpetualIndicator;
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PerpetualIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the security has no maturity date."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPerpetualIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PerpetualIndicator";
			definition = "Indicates whether the security has no maturity date.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Debt.class.getMethod("getPerpetualIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator subordinatedIndicator;
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubordinatedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the security is a subordinated security."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSubordinatedIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SubordinatedIndicator";
			definition = "Indicates whether the security is a subordinated security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Debt.class.getMethod("getSubordinatedIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator extendibleIndicator;
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtendibleIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the security is extendible,eg, repayment may be extended or maturity changed."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmExtendibleIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExtendibleIndicator";
			definition = "Indicates whether the security is extendible,eg, repayment may be extended or maturity changed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Debt.class.getMethod("getExtendibleIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DateTimePeriod extendiblePeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmExtendiblePeriodDebt
	 * DateTimePeriod.mmExtendiblePeriodDebt}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtendiblePeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period during which a date might be extended."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmExtendiblePeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExtendiblePeriod";
			definition = "Period during which a date might be extended.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmExtendiblePeriodDebt;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected CurrencyAndAmount overAllotmentAmount;
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OverAllotmentAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount for which a security can be overalloted (as in greenshoe option)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmOverAllotmentAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OverAllotmentAmount";
			definition = "Amount for which a security can be overalloted (as in greenshoe option).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Debt.class.getMethod("getOverAllotmentAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PercentageRate overAllotmentRate;
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OverAllotmentRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage for which a security can be overalloted (as in greenshoe option)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmOverAllotmentRate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OverAllotmentRate";
			definition = "Percentage for which a security can be overalloted (as in greenshoe option).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Debt.class.getMethod("getOverAllotmentRate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator amortisableIndicator;
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmortisableIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether repayment is made via regular principal and interest payments over time."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAmortisableIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AmortisableIndicator";
			definition = "Indicates whether repayment is made via regular principal and interest payments over time.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Debt.class.getMethod("getAmortisableIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DistributionPolicyCode capitalisedInterest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DistributionPolicyCode
	 * DistributionPolicyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapitalisedInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the interest amount is capitalised until maturity date or paid out at each interest payment date."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCapitalisedInterest = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CapitalisedInterest";
			definition = "Specifies whether the interest amount is capitalised until maturity date or paid out at each interest payment date.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DistributionPolicyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Debt.class.getMethod("getCapitalisedInterest", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<CurrencyAndAmount> actualDenominationAmount;
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActualDenominationAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Nominal value per security unit."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmActualDenominationAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ActualDenominationAmount";
			definition = "Nominal value per security unit.";
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Debt.class.getMethod("getActualDenominationAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DecimalNumber pieces;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pieces"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of pieces composing a pool of financial assets."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPieces = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Pieces";
			definition = "Number of pieces composing a pool of financial assets.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Debt.class.getMethod("getPieces", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DecimalNumber poolsMaximum;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PoolsMaximum"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Collection of assets by which a security is backed."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPoolsMaximum = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PoolsMaximum";
			definition = "Collection of assets by which a security is backed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Debt.class.getMethod("getPoolsMaximum", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DecimalNumber poolsPerMillion;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PoolsPerMillion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates per million the collection of loans, mortgages or other assets assembled by an originator as the basis for a security."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPoolsPerMillion = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PoolsPerMillion";
			definition = "Indicates per million the collection of loans, mortgages or other assets assembled by an originator as the basis for a security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Debt.class.getMethod("getPoolsPerMillion", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DecimalNumber poolsPerLot;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PoolsPerLot"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates per lot the collection of loans, mortgages or other assets assembled by an originator as the basis for a security."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPoolsPerLot = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PoolsPerLot";
			definition = "Indicates per lot the collection of loans, mortgages or other assets assembled by an originator as the basis for a security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Debt.class.getMethod("getPoolsPerLot", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DecimalNumber poolsPerTrade;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PoolsPerTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates per trade the collection of loans, mortgages or other assets assembled by an originator as the basis for a security."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPoolsPerTrade = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PoolsPerTrade";
			definition = "Indicates per trade the collection of loans, mortgages or other assets assembled by an originator as the basis for a security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Debt.class.getMethod("getPoolsPerTrade", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator constantPrePaymentPenalty;
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConstantPrePaymentPenalty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether a penalty might be imposed to the borrower of a mortgage in case of prepayments occurring during the lockout period."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmConstantPrePaymentPenalty = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConstantPrePaymentPenalty";
			definition = "Indicates whether a penalty might be imposed to the borrower of a mortgage in case of prepayments occurring during the lockout period.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Debt.class.getMethod("getConstantPrePaymentPenalty", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PrePaymentSpeedCode prePaymentSpeed;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PrePaymentSpeedCode
	 * PrePaymentSpeedCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrePaymentSpeed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Speed of unscheduled partial or complete payment of the principal amount outstanding on a debt obligation before its due date."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPrePaymentSpeed = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PrePaymentSpeed";
			definition = "Speed of unscheduled partial or complete payment of the principal amount outstanding on a debt obligation before its due date.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PrePaymentSpeedCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Debt.class.getMethod("getPrePaymentSpeed", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PercentageRate constantPrePaymentYield;
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConstantPrePaymentYield"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Measure of prepayment as a yield of the current outstanding loan balance."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmConstantPrePaymentYield = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConstantPrePaymentYield";
			definition = "Measure of prepayment as a yield of the current outstanding loan balance.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Debt.class.getMethod("getConstantPrePaymentYield", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PercentageRate weightedAverageCoupon;
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WeightedAverageCoupon"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contains the weighted average coupon of the fixed income instrument (expressed as a percentage)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmWeightedAverageCoupon = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WeightedAverageCoupon";
			definition = "Contains the weighted average coupon of the fixed income instrument (expressed as a percentage).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Debt.class.getMethod("getWeightedAverageCoupon", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DecimalNumber weightedAverageLife;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WeightedAverageLife"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contains the weighted average life of the fixed income instrument (expressed in months)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmWeightedAverageLife = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WeightedAverageLife";
			definition = "Contains the weighted average life of the fixed income instrument (expressed in months).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Debt.class.getMethod("getWeightedAverageLife", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DecimalNumber weightedAverageLoan;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WeightedAverageLoan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contains the weighted average loan of the fixed income instrument (expressed in months)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmWeightedAverageLoan = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WeightedAverageLoan";
			definition = "Contains the weighted average loan of the fixed income instrument (expressed in months).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Debt.class.getMethod("getWeightedAverageLoan", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DecimalNumber weightedAverageMaturity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WeightedAverageMaturity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contains the weighted average maturity of the fixed income instrument (expressed in months)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmWeightedAverageMaturity = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WeightedAverageMaturity";
			definition = "Contains the weighted average maturity of the fixed income instrument (expressed in months).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Debt.class.getMethod("getWeightedAverageMaturity", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator insuredIndicator;
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsuredIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the instruments is backed by any kind of asset or not."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmInsuredIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InsuredIndicator";
			definition = "Indicates whether the instruments is backed by any kind of asset or not.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Debt.class.getMethod("getInsuredIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator bankQualified;
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankQualified"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the security is bank qualified (usually applies to loan products)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmBankQualified = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BankQualified";
			definition = "Indicates whether the security is bank qualified (usually applies to loan products).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Debt.class.getMethod("getBankQualified", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PercentageRate autoReinvestment;
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AutoReinvestment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates an instruction to reinvest dividends in the underlying security (or proceeds at maturity in a similar instrument) if the current rate equals the rate specified or better."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAutoReinvestment = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AutoReinvestment";
			definition = "Indicates an instruction to reinvest dividends in the underlying security (or proceeds at maturity in a similar instrument) if the current rate equals the rate specified or better.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Debt.class.getMethod("getAutoReinvestment", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DateTimePeriod customDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmCustomDateDebt
	 * DateTimePeriod.mmCustomDateDebt}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates an instruction to override an investment's default start and/or end date with a custom date."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCustomDate = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CustomDate";
			definition = "Indicates an instruction to override an investment's default start and/or end date with a custom date.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmCustomDateDebt;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected Number lookBack;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::TTCO//GTDL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LookBack"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates an instruction or attribute giving the number of days to be included in the look-back period for the investment. Some options allow exercise based on the underlying asset's optimal value over the look-back period."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmLookBack = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::TTCO//GTDL"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LookBack";
			definition = "Indicates an instruction or attribute giving the number of days to be included in the look-back period for the investment. Some options allow exercise based on the underlying asset's optimal value over the look-back period.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Debt.class.getMethod("getLookBack", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesQuantity minimumDenomination;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMinimumDenominationDebt
	 * SecuritiesQuantity.mmMinimumDenominationDebt}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumDenomination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the minimum denomination of a security."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmMinimumDenomination = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumDenomination";
			definition = "Indicates the minimum denomination of a security.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmMinimumDenominationDebt;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected Number maximumSubstitution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumSubstitution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Maximum number of time the collateral can be substitute."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMaximumSubstitution = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaximumSubstitution";
			definition = "Maximum number of time the collateral can be substitute.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Debt.class.getMethod("getMaximumSubstitution", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesQuantity minimumIncrement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMinimumIncrementDebt
	 * SecuritiesQuantity.mmMinimumIncrementDebt}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumIncrement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the minimum tradable increments of a security."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmMinimumIncrement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumIncrement";
			definition = "Indicates the minimum tradable increments of a security.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmMinimumIncrementDebt;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected Max350Text production;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Production"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates a search criterion used when looking to buy a bond, particularly an mortgage back security (MBS), issued in a particular year."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmProduction = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Production";
			definition = "Indicates a search criterion used when looking to buy a bond, particularly an mortgage back security (MBS), issued in a particular year.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Debt.class.getMethod("getProduction", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator restricted;
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Restricted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies if the securities is restricted or not (as per Rule 144)."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRestricted = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Restricted";
			definition = "Identifies if the securities is restricted or not (as per Rule 144).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Debt.class.getMethod("getRestricted", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected FrequencyCode priceFrequency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FrequencyCode
	 * FrequencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the frequency at which the bond is re-rated and therefore re-priced (bond attribute, particularly of floating rate and index linked instruments)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPriceFrequency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PriceFrequency";
			definition = "Indicates the frequency at which the bond is re-rated and therefore re-priced (bond attribute, particularly of floating rate and index linked instruments).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Debt.class.getMethod("getPriceFrequency", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected FrequencyCode substitutionFrequency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FrequencyCode
	 * FrequencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubstitutionFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the maximum number of times collateral can be substituted."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSubstitutionFrequency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SubstitutionFrequency";
			definition = "Indicates the maximum number of times collateral can be substituted.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Debt.class.getMethod("getSubstitutionFrequency", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Number substitutionLeft;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubstitutionLeft"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of remaining times the collateral can be substitute."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSubstitutionLeft = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SubstitutionLeft";
			definition = "Number of remaining times the collateral can be substitute.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Debt.class.getMethod("getSubstitutionLeft", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator wholePool;
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WholePool"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates a search criterion when looking to buy an mortgage back security (MBS) that either is [yes] or is not [no] an entire pool."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmWholePool = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WholePool";
			definition = "Indicates a search criterion when looking to buy an mortgage back security (MBS) that either is [yes] or is not [no] an entire pool.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Debt.class.getMethod("getWholePool", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator alternativeMinimumTax;
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AlternativeMinimumTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies whether the issue is subject to alternative minimum taxation (used for municipal bonds)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAlternativeMinimumTax = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AlternativeMinimumTax";
			definition = "Identifies whether the issue is subject to alternative minimum taxation (used for municipal bonds).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Debt.class.getMethod("getAlternativeMinimumTax", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected InterestCalculation nextInterest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmDebtInstrument
	 * InterestCalculation.mmDebtInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92A::NXRT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NextInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the interest applicable to the next interest payment period."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmNextInterest = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92A::NXRT"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NextInterest";
			definition = "Specifies the interest applicable to the next interest payment period.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmDebtInstrument;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmObject();
		}
	};
	protected ISODateTime extendibleDate;
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtendibleDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/time to which a date might be extended."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmExtendibleDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExtendibleDate";
			definition = "Date/time to which a date might be extended.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Debt.class.getMethod("getExtendibleDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator sinkableIndicator;
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SinkableIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the security is a sinkung fund. A sinking fund is a bond in which part of the total principal amount is repaid according to agreed schedules of dates, amounts and prices."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSinkableIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SinkableIndicator";
			definition = "Indicates whether the security is a sinkung fund. A sinking fund is a bond in which part of the total principal amount is repaid according to agreed schedules of dates, amounts and prices.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Debt.class.getMethod("getSinkableIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator insured;
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Insured"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies whether the lender is assured partial or full payment by a third party if the borrower defaults."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmInsured = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Insured";
			definition = "Identifies whether the lender is assured partial or full payment by a third party if the borrower defaults.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Debt.class.getMethod("getInsured", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text geographics;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Geographics"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of stipulation expressing geographical constraints on a fixed income instrument. It is expressed with a state or country abbreviation and a minimum or maximum percentage. Example: CA 0-80 (minimum of 80 percent in Californian assets)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmGeographics = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Geographics";
			definition = "Type of stipulation expressing geographical constraints on a fixed income instrument. It is expressed with a state or country abbreviation and a minimum or maximum percentage. Example: CA 0-80 (minimum of 80 percent in Californian assets).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Debt.class.getMethod("getGeographics", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyCode paymentCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency of the payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPaymentCurrency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentCurrency";
			definition = "Currency of the payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Debt.class.getMethod("getPaymentCurrency", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesPricing dirtyPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DirtyPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price that includes interest that has accrued since issue of the most recent coupon payment."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDirtyPrice = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DirtyPrice";
			definition = "Price that includes interest that has accrued since issue of the most recent coupon payment.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Debt.class.getMethod("getDirtyPrice", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DebtInstrumentSeniorityTypeCode debtSeniority;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DebtInstrumentSeniorityTypeCode
	 * DebtInstrumentSeniorityTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtSeniority"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Seniority of a specific debt instrument, that is the order of repayment in the event of a sale or bankruptcy of the issuer of the debt."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDebtSeniority = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DebtSeniority";
			definition = "Seniority of a specific debt instrument, that is the order of repayment in the event of a sale or bankruptcy of the issuer of the debt.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DebtInstrumentSeniorityTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Debt.class.getMethod("getDebtSeniority", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Debt";
				definition = "Financial instruments evidencing moneys owed by the issuer to the holder on terms as specified.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DateTimePeriod.mmExtendiblePeriodDebt, com.tools20022.repository.entity.DateTimePeriod.mmCustomDateDebt,
						com.tools20022.repository.entity.SecuritiesQuantity.mmMinimumDenominationDebt, com.tools20022.repository.entity.SecuritiesQuantity.mmMinimumIncrementDebt,
						com.tools20022.repository.entity.InterestCalculation.mmDebtInstrument);
				subType_lazy = () -> Arrays.asList(Loan.mmObject());
				superType_lazy = () -> Security.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Debt.mmPaymentDirectionIndicator, com.tools20022.repository.entity.Debt.mmNextCallableDate, com.tools20022.repository.entity.Debt.mmPutableDate,
						com.tools20022.repository.entity.Debt.mmDatedDate, com.tools20022.repository.entity.Debt.mmFirstPaymentDate, com.tools20022.repository.entity.Debt.mmFactor, com.tools20022.repository.entity.Debt.mmPoolNumber,
						com.tools20022.repository.entity.Debt.mmVariableRateIndicator, com.tools20022.repository.entity.Debt.mmCallableIndicator, com.tools20022.repository.entity.Debt.mmPutableIndicator,
						com.tools20022.repository.entity.Debt.mmYieldToMaturityRate, com.tools20022.repository.entity.Debt.mmAccruedCapitalisationAmount, com.tools20022.repository.entity.Debt.mmNextCouponDate,
						com.tools20022.repository.entity.Debt.mmNextFactorDate, com.tools20022.repository.entity.Debt.mmOddCouponIndicator, com.tools20022.repository.entity.Debt.mmCPProgram,
						com.tools20022.repository.entity.Debt.mmCPRegistrationType, com.tools20022.repository.entity.Debt.mmConvertibleIndicator, com.tools20022.repository.entity.Debt.mmPreFundedIndicator,
						com.tools20022.repository.entity.Debt.mmEscrowedIndicator, com.tools20022.repository.entity.Debt.mmPerpetualIndicator, com.tools20022.repository.entity.Debt.mmSubordinatedIndicator,
						com.tools20022.repository.entity.Debt.mmExtendibleIndicator, com.tools20022.repository.entity.Debt.mmExtendiblePeriod, com.tools20022.repository.entity.Debt.mmOverAllotmentAmount,
						com.tools20022.repository.entity.Debt.mmOverAllotmentRate, com.tools20022.repository.entity.Debt.mmAmortisableIndicator, com.tools20022.repository.entity.Debt.mmCapitalisedInterest,
						com.tools20022.repository.entity.Debt.mmActualDenominationAmount, com.tools20022.repository.entity.Debt.mmPieces, com.tools20022.repository.entity.Debt.mmPoolsMaximum,
						com.tools20022.repository.entity.Debt.mmPoolsPerMillion, com.tools20022.repository.entity.Debt.mmPoolsPerLot, com.tools20022.repository.entity.Debt.mmPoolsPerTrade,
						com.tools20022.repository.entity.Debt.mmConstantPrePaymentPenalty, com.tools20022.repository.entity.Debt.mmPrePaymentSpeed, com.tools20022.repository.entity.Debt.mmConstantPrePaymentYield,
						com.tools20022.repository.entity.Debt.mmWeightedAverageCoupon, com.tools20022.repository.entity.Debt.mmWeightedAverageLife, com.tools20022.repository.entity.Debt.mmWeightedAverageLoan,
						com.tools20022.repository.entity.Debt.mmWeightedAverageMaturity, com.tools20022.repository.entity.Debt.mmInsuredIndicator, com.tools20022.repository.entity.Debt.mmBankQualified,
						com.tools20022.repository.entity.Debt.mmAutoReinvestment, com.tools20022.repository.entity.Debt.mmCustomDate, com.tools20022.repository.entity.Debt.mmLookBack,
						com.tools20022.repository.entity.Debt.mmMinimumDenomination, com.tools20022.repository.entity.Debt.mmMaximumSubstitution, com.tools20022.repository.entity.Debt.mmMinimumIncrement,
						com.tools20022.repository.entity.Debt.mmProduction, com.tools20022.repository.entity.Debt.mmRestricted, com.tools20022.repository.entity.Debt.mmPriceFrequency,
						com.tools20022.repository.entity.Debt.mmSubstitutionFrequency, com.tools20022.repository.entity.Debt.mmSubstitutionLeft, com.tools20022.repository.entity.Debt.mmWholePool,
						com.tools20022.repository.entity.Debt.mmAlternativeMinimumTax, com.tools20022.repository.entity.Debt.mmNextInterest, com.tools20022.repository.entity.Debt.mmExtendibleDate,
						com.tools20022.repository.entity.Debt.mmSinkableIndicator, com.tools20022.repository.entity.Debt.mmInsured, com.tools20022.repository.entity.Debt.mmGeographics,
						com.tools20022.repository.entity.Debt.mmPaymentCurrency, com.tools20022.repository.entity.Debt.mmDirtyPrice, com.tools20022.repository.entity.Debt.mmDebtSeniority);
			}

			@Override
			public Class<?> getInstanceClass() {
				return Debt.class;
			}
		});
		return mmObject_lazy.get();
	}

	public PaymentDirectionIndicator getPaymentDirectionIndicator() {
		return paymentDirectionIndicator;
	}

	public Debt setPaymentDirectionIndicator(com.tools20022.repository.datatype.PaymentDirectionIndicator paymentDirectionIndicator) {
		this.paymentDirectionIndicator = Objects.requireNonNull(paymentDirectionIndicator);
		return this;
	}

	public ISODateTime getNextCallableDate() {
		return nextCallableDate;
	}

	public Debt setNextCallableDate(ISODateTime nextCallableDate) {
		this.nextCallableDate = Objects.requireNonNull(nextCallableDate);
		return this;
	}

	public ISODateTime getPutableDate() {
		return putableDate;
	}

	public Debt setPutableDate(ISODateTime putableDate) {
		this.putableDate = Objects.requireNonNull(putableDate);
		return this;
	}

	public ISODateTime getDatedDate() {
		return datedDate;
	}

	public Debt setDatedDate(ISODateTime datedDate) {
		this.datedDate = Objects.requireNonNull(datedDate);
		return this;
	}

	public ISODateTime getFirstPaymentDate() {
		return firstPaymentDate;
	}

	public Debt setFirstPaymentDate(ISODateTime firstPaymentDate) {
		this.firstPaymentDate = Objects.requireNonNull(firstPaymentDate);
		return this;
	}

	public PercentageRate getFactor() {
		return factor;
	}

	public Debt setFactor(PercentageRate factor) {
		this.factor = Objects.requireNonNull(factor);
		return this;
	}

	public Max15NumericText getPoolNumber() {
		return poolNumber;
	}

	public Debt setPoolNumber(Max15NumericText poolNumber) {
		this.poolNumber = Objects.requireNonNull(poolNumber);
		return this;
	}

	public YesNoIndicator getVariableRateIndicator() {
		return variableRateIndicator;
	}

	public Debt setVariableRateIndicator(YesNoIndicator variableRateIndicator) {
		this.variableRateIndicator = Objects.requireNonNull(variableRateIndicator);
		return this;
	}

	public YesNoIndicator getCallableIndicator() {
		return callableIndicator;
	}

	public Debt setCallableIndicator(YesNoIndicator callableIndicator) {
		this.callableIndicator = Objects.requireNonNull(callableIndicator);
		return this;
	}

	public YesNoIndicator getPutableIndicator() {
		return putableIndicator;
	}

	public Debt setPutableIndicator(YesNoIndicator putableIndicator) {
		this.putableIndicator = Objects.requireNonNull(putableIndicator);
		return this;
	}

	public PercentageRate getYieldToMaturityRate() {
		return yieldToMaturityRate;
	}

	public Debt setYieldToMaturityRate(PercentageRate yieldToMaturityRate) {
		this.yieldToMaturityRate = Objects.requireNonNull(yieldToMaturityRate);
		return this;
	}

	public CurrencyAndAmount getAccruedCapitalisationAmount() {
		return accruedCapitalisationAmount;
	}

	public Debt setAccruedCapitalisationAmount(CurrencyAndAmount accruedCapitalisationAmount) {
		this.accruedCapitalisationAmount = Objects.requireNonNull(accruedCapitalisationAmount);
		return this;
	}

	public ISODateTime getNextCouponDate() {
		return nextCouponDate;
	}

	public Debt setNextCouponDate(ISODateTime nextCouponDate) {
		this.nextCouponDate = Objects.requireNonNull(nextCouponDate);
		return this;
	}

	public ISODateTime getNextFactorDate() {
		return nextFactorDate;
	}

	public Debt setNextFactorDate(ISODateTime nextFactorDate) {
		this.nextFactorDate = Objects.requireNonNull(nextFactorDate);
		return this;
	}

	public YesNoIndicator getOddCouponIndicator() {
		return oddCouponIndicator;
	}

	public Debt setOddCouponIndicator(YesNoIndicator oddCouponIndicator) {
		this.oddCouponIndicator = Objects.requireNonNull(oddCouponIndicator);
		return this;
	}

	public Number getCPProgram() {
		return cPProgram;
	}

	public Debt setCPProgram(Number cPProgram) {
		this.cPProgram = Objects.requireNonNull(cPProgram);
		return this;
	}

	public Max350Text getCPRegistrationType() {
		return cPRegistrationType;
	}

	public Debt setCPRegistrationType(Max350Text cPRegistrationType) {
		this.cPRegistrationType = Objects.requireNonNull(cPRegistrationType);
		return this;
	}

	public YesNoIndicator getConvertibleIndicator() {
		return convertibleIndicator;
	}

	public Debt setConvertibleIndicator(YesNoIndicator convertibleIndicator) {
		this.convertibleIndicator = Objects.requireNonNull(convertibleIndicator);
		return this;
	}

	public YesNoIndicator getPreFundedIndicator() {
		return preFundedIndicator;
	}

	public Debt setPreFundedIndicator(YesNoIndicator preFundedIndicator) {
		this.preFundedIndicator = Objects.requireNonNull(preFundedIndicator);
		return this;
	}

	public YesNoIndicator getEscrowedIndicator() {
		return escrowedIndicator;
	}

	public Debt setEscrowedIndicator(YesNoIndicator escrowedIndicator) {
		this.escrowedIndicator = Objects.requireNonNull(escrowedIndicator);
		return this;
	}

	public YesNoIndicator getPerpetualIndicator() {
		return perpetualIndicator;
	}

	public Debt setPerpetualIndicator(YesNoIndicator perpetualIndicator) {
		this.perpetualIndicator = Objects.requireNonNull(perpetualIndicator);
		return this;
	}

	public YesNoIndicator getSubordinatedIndicator() {
		return subordinatedIndicator;
	}

	public Debt setSubordinatedIndicator(YesNoIndicator subordinatedIndicator) {
		this.subordinatedIndicator = Objects.requireNonNull(subordinatedIndicator);
		return this;
	}

	public YesNoIndicator getExtendibleIndicator() {
		return extendibleIndicator;
	}

	public Debt setExtendibleIndicator(YesNoIndicator extendibleIndicator) {
		this.extendibleIndicator = Objects.requireNonNull(extendibleIndicator);
		return this;
	}

	public DateTimePeriod getExtendiblePeriod() {
		return extendiblePeriod;
	}

	public Debt setExtendiblePeriod(com.tools20022.repository.entity.DateTimePeriod extendiblePeriod) {
		this.extendiblePeriod = Objects.requireNonNull(extendiblePeriod);
		return this;
	}

	public CurrencyAndAmount getOverAllotmentAmount() {
		return overAllotmentAmount;
	}

	public Debt setOverAllotmentAmount(CurrencyAndAmount overAllotmentAmount) {
		this.overAllotmentAmount = Objects.requireNonNull(overAllotmentAmount);
		return this;
	}

	public PercentageRate getOverAllotmentRate() {
		return overAllotmentRate;
	}

	public Debt setOverAllotmentRate(PercentageRate overAllotmentRate) {
		this.overAllotmentRate = Objects.requireNonNull(overAllotmentRate);
		return this;
	}

	public YesNoIndicator getAmortisableIndicator() {
		return amortisableIndicator;
	}

	public Debt setAmortisableIndicator(YesNoIndicator amortisableIndicator) {
		this.amortisableIndicator = Objects.requireNonNull(amortisableIndicator);
		return this;
	}

	public DistributionPolicyCode getCapitalisedInterest() {
		return capitalisedInterest;
	}

	public Debt setCapitalisedInterest(DistributionPolicyCode capitalisedInterest) {
		this.capitalisedInterest = Objects.requireNonNull(capitalisedInterest);
		return this;
	}

	public List<CurrencyAndAmount> getActualDenominationAmount() {
		return actualDenominationAmount == null ? actualDenominationAmount = new ArrayList<>() : actualDenominationAmount;
	}

	public Debt setActualDenominationAmount(List<CurrencyAndAmount> actualDenominationAmount) {
		this.actualDenominationAmount = Objects.requireNonNull(actualDenominationAmount);
		return this;
	}

	public DecimalNumber getPieces() {
		return pieces;
	}

	public Debt setPieces(DecimalNumber pieces) {
		this.pieces = Objects.requireNonNull(pieces);
		return this;
	}

	public DecimalNumber getPoolsMaximum() {
		return poolsMaximum;
	}

	public Debt setPoolsMaximum(DecimalNumber poolsMaximum) {
		this.poolsMaximum = Objects.requireNonNull(poolsMaximum);
		return this;
	}

	public DecimalNumber getPoolsPerMillion() {
		return poolsPerMillion;
	}

	public Debt setPoolsPerMillion(DecimalNumber poolsPerMillion) {
		this.poolsPerMillion = Objects.requireNonNull(poolsPerMillion);
		return this;
	}

	public DecimalNumber getPoolsPerLot() {
		return poolsPerLot;
	}

	public Debt setPoolsPerLot(DecimalNumber poolsPerLot) {
		this.poolsPerLot = Objects.requireNonNull(poolsPerLot);
		return this;
	}

	public DecimalNumber getPoolsPerTrade() {
		return poolsPerTrade;
	}

	public Debt setPoolsPerTrade(DecimalNumber poolsPerTrade) {
		this.poolsPerTrade = Objects.requireNonNull(poolsPerTrade);
		return this;
	}

	public YesNoIndicator getConstantPrePaymentPenalty() {
		return constantPrePaymentPenalty;
	}

	public Debt setConstantPrePaymentPenalty(YesNoIndicator constantPrePaymentPenalty) {
		this.constantPrePaymentPenalty = Objects.requireNonNull(constantPrePaymentPenalty);
		return this;
	}

	public PrePaymentSpeedCode getPrePaymentSpeed() {
		return prePaymentSpeed;
	}

	public Debt setPrePaymentSpeed(PrePaymentSpeedCode prePaymentSpeed) {
		this.prePaymentSpeed = Objects.requireNonNull(prePaymentSpeed);
		return this;
	}

	public PercentageRate getConstantPrePaymentYield() {
		return constantPrePaymentYield;
	}

	public Debt setConstantPrePaymentYield(PercentageRate constantPrePaymentYield) {
		this.constantPrePaymentYield = Objects.requireNonNull(constantPrePaymentYield);
		return this;
	}

	public PercentageRate getWeightedAverageCoupon() {
		return weightedAverageCoupon;
	}

	public Debt setWeightedAverageCoupon(PercentageRate weightedAverageCoupon) {
		this.weightedAverageCoupon = Objects.requireNonNull(weightedAverageCoupon);
		return this;
	}

	public DecimalNumber getWeightedAverageLife() {
		return weightedAverageLife;
	}

	public Debt setWeightedAverageLife(DecimalNumber weightedAverageLife) {
		this.weightedAverageLife = Objects.requireNonNull(weightedAverageLife);
		return this;
	}

	public DecimalNumber getWeightedAverageLoan() {
		return weightedAverageLoan;
	}

	public Debt setWeightedAverageLoan(DecimalNumber weightedAverageLoan) {
		this.weightedAverageLoan = Objects.requireNonNull(weightedAverageLoan);
		return this;
	}

	public DecimalNumber getWeightedAverageMaturity() {
		return weightedAverageMaturity;
	}

	public Debt setWeightedAverageMaturity(DecimalNumber weightedAverageMaturity) {
		this.weightedAverageMaturity = Objects.requireNonNull(weightedAverageMaturity);
		return this;
	}

	public YesNoIndicator getInsuredIndicator() {
		return insuredIndicator;
	}

	public Debt setInsuredIndicator(YesNoIndicator insuredIndicator) {
		this.insuredIndicator = Objects.requireNonNull(insuredIndicator);
		return this;
	}

	public YesNoIndicator getBankQualified() {
		return bankQualified;
	}

	public Debt setBankQualified(YesNoIndicator bankQualified) {
		this.bankQualified = Objects.requireNonNull(bankQualified);
		return this;
	}

	public PercentageRate getAutoReinvestment() {
		return autoReinvestment;
	}

	public Debt setAutoReinvestment(PercentageRate autoReinvestment) {
		this.autoReinvestment = Objects.requireNonNull(autoReinvestment);
		return this;
	}

	public DateTimePeriod getCustomDate() {
		return customDate;
	}

	public Debt setCustomDate(com.tools20022.repository.entity.DateTimePeriod customDate) {
		this.customDate = Objects.requireNonNull(customDate);
		return this;
	}

	public Number getLookBack() {
		return lookBack;
	}

	public Debt setLookBack(Number lookBack) {
		this.lookBack = Objects.requireNonNull(lookBack);
		return this;
	}

	public SecuritiesQuantity getMinimumDenomination() {
		return minimumDenomination;
	}

	public Debt setMinimumDenomination(com.tools20022.repository.entity.SecuritiesQuantity minimumDenomination) {
		this.minimumDenomination = Objects.requireNonNull(minimumDenomination);
		return this;
	}

	public Number getMaximumSubstitution() {
		return maximumSubstitution;
	}

	public Debt setMaximumSubstitution(Number maximumSubstitution) {
		this.maximumSubstitution = Objects.requireNonNull(maximumSubstitution);
		return this;
	}

	public SecuritiesQuantity getMinimumIncrement() {
		return minimumIncrement;
	}

	public Debt setMinimumIncrement(com.tools20022.repository.entity.SecuritiesQuantity minimumIncrement) {
		this.minimumIncrement = Objects.requireNonNull(minimumIncrement);
		return this;
	}

	public Max350Text getProduction() {
		return production;
	}

	public Debt setProduction(Max350Text production) {
		this.production = Objects.requireNonNull(production);
		return this;
	}

	public YesNoIndicator getRestricted() {
		return restricted;
	}

	public Debt setRestricted(YesNoIndicator restricted) {
		this.restricted = Objects.requireNonNull(restricted);
		return this;
	}

	public FrequencyCode getPriceFrequency() {
		return priceFrequency;
	}

	public Debt setPriceFrequency(FrequencyCode priceFrequency) {
		this.priceFrequency = Objects.requireNonNull(priceFrequency);
		return this;
	}

	public FrequencyCode getSubstitutionFrequency() {
		return substitutionFrequency;
	}

	public Debt setSubstitutionFrequency(FrequencyCode substitutionFrequency) {
		this.substitutionFrequency = Objects.requireNonNull(substitutionFrequency);
		return this;
	}

	public Number getSubstitutionLeft() {
		return substitutionLeft;
	}

	public Debt setSubstitutionLeft(Number substitutionLeft) {
		this.substitutionLeft = Objects.requireNonNull(substitutionLeft);
		return this;
	}

	public YesNoIndicator getWholePool() {
		return wholePool;
	}

	public Debt setWholePool(YesNoIndicator wholePool) {
		this.wholePool = Objects.requireNonNull(wholePool);
		return this;
	}

	public YesNoIndicator getAlternativeMinimumTax() {
		return alternativeMinimumTax;
	}

	public Debt setAlternativeMinimumTax(YesNoIndicator alternativeMinimumTax) {
		this.alternativeMinimumTax = Objects.requireNonNull(alternativeMinimumTax);
		return this;
	}

	public InterestCalculation getNextInterest() {
		return nextInterest;
	}

	public Debt setNextInterest(com.tools20022.repository.entity.InterestCalculation nextInterest) {
		this.nextInterest = Objects.requireNonNull(nextInterest);
		return this;
	}

	public ISODateTime getExtendibleDate() {
		return extendibleDate;
	}

	public Debt setExtendibleDate(ISODateTime extendibleDate) {
		this.extendibleDate = Objects.requireNonNull(extendibleDate);
		return this;
	}

	public YesNoIndicator getSinkableIndicator() {
		return sinkableIndicator;
	}

	public Debt setSinkableIndicator(YesNoIndicator sinkableIndicator) {
		this.sinkableIndicator = Objects.requireNonNull(sinkableIndicator);
		return this;
	}

	public YesNoIndicator getInsured() {
		return insured;
	}

	public Debt setInsured(YesNoIndicator insured) {
		this.insured = Objects.requireNonNull(insured);
		return this;
	}

	public Max35Text getGeographics() {
		return geographics;
	}

	public Debt setGeographics(Max35Text geographics) {
		this.geographics = Objects.requireNonNull(geographics);
		return this;
	}

	public CurrencyCode getPaymentCurrency() {
		return paymentCurrency;
	}

	public Debt setPaymentCurrency(CurrencyCode paymentCurrency) {
		this.paymentCurrency = Objects.requireNonNull(paymentCurrency);
		return this;
	}

	public SecuritiesPricing getDirtyPrice() {
		return dirtyPrice;
	}

	public Debt setDirtyPrice(com.tools20022.repository.entity.SecuritiesPricing dirtyPrice) {
		this.dirtyPrice = Objects.requireNonNull(dirtyPrice);
		return this;
	}

	public DebtInstrumentSeniorityTypeCode getDebtSeniority() {
		return debtSeniority;
	}

	public Debt setDebtSeniority(DebtInstrumentSeniorityTypeCode debtSeniority) {
		this.debtSeniority = Objects.requireNonNull(debtSeniority);
		return this;
	}
}