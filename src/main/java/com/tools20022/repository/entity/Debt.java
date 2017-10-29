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
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.Security;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Debt#PaymentDirectionIndicator
 * Debt.PaymentDirectionIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#NextCallableDate
 * Debt.NextCallableDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#PutableDate
 * Debt.PutableDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#DatedDate
 * Debt.DatedDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#FirstPaymentDate
 * Debt.FirstPaymentDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#Factor Debt.Factor}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#PoolNumber
 * Debt.PoolNumber}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#VariableRateIndicator
 * Debt.VariableRateIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#CallableIndicator
 * Debt.CallableIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#PutableIndicator
 * Debt.PutableIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#YieldToMaturityRate
 * Debt.YieldToMaturityRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Debt#AccruedCapitalisationAmount
 * Debt.AccruedCapitalisationAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#NextCouponDate
 * Debt.NextCouponDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#NextFactorDate
 * Debt.NextFactorDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#OddCouponIndicator
 * Debt.OddCouponIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#CPProgram
 * Debt.CPProgram}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#CPRegistrationType
 * Debt.CPRegistrationType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#ConvertibleIndicator
 * Debt.ConvertibleIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#PreFundedIndicator
 * Debt.PreFundedIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#EscrowedIndicator
 * Debt.EscrowedIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#PerpetualIndicator
 * Debt.PerpetualIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#SubordinatedIndicator
 * Debt.SubordinatedIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#ExtendibleIndicator
 * Debt.ExtendibleIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#ExtendiblePeriod
 * Debt.ExtendiblePeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#OverAllotmentAmount
 * Debt.OverAllotmentAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#OverAllotmentRate
 * Debt.OverAllotmentRate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#AmortisableIndicator
 * Debt.AmortisableIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#CapitalisedInterest
 * Debt.CapitalisedInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Debt#ActualDenominationAmount
 * Debt.ActualDenominationAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#Pieces Debt.Pieces}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#PoolsMaximum
 * Debt.PoolsMaximum}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#PoolsPerMillion
 * Debt.PoolsPerMillion}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#PoolsPerLot
 * Debt.PoolsPerLot}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#PoolsPerTrade
 * Debt.PoolsPerTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Debt#ConstantPrePaymentPenalty
 * Debt.ConstantPrePaymentPenalty}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#PrePaymentSpeed
 * Debt.PrePaymentSpeed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Debt#ConstantPrePaymentYield
 * Debt.ConstantPrePaymentYield}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#WeightedAverageCoupon
 * Debt.WeightedAverageCoupon}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#WeightedAverageLife
 * Debt.WeightedAverageLife}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#WeightedAverageLoan
 * Debt.WeightedAverageLoan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Debt#WeightedAverageMaturity
 * Debt.WeightedAverageMaturity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#InsuredIndicator
 * Debt.InsuredIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#BankQualified
 * Debt.BankQualified}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#AutoReinvestment
 * Debt.AutoReinvestment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#CustomDate
 * Debt.CustomDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#LookBack Debt.LookBack}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#MinimumDenomination
 * Debt.MinimumDenomination}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#MaximumSubstitution
 * Debt.MaximumSubstitution}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#MinimumIncrement
 * Debt.MinimumIncrement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#Production
 * Debt.Production}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#Restricted
 * Debt.Restricted}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#PriceFrequency
 * Debt.PriceFrequency}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#SubstitutionFrequency
 * Debt.SubstitutionFrequency}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#SubstitutionLeft
 * Debt.SubstitutionLeft}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#WholePool
 * Debt.WholePool}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#AlternativeMinimumTax
 * Debt.AlternativeMinimumTax}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#NextInterest
 * Debt.NextInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#ExtendibleDate
 * Debt.ExtendibleDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#SinkableIndicator
 * Debt.SinkableIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#Insured Debt.Insured}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#Geographics
 * Debt.Geographics}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#PaymentCurrency
 * Debt.PaymentCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#DirtyPrice
 * Debt.DirtyPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#DebtSeniority
 * Debt.DebtSeniority}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#ExtendiblePeriodDebt
 * DateTimePeriod.ExtendiblePeriodDebt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#CustomDateDebt
 * DateTimePeriod.CustomDateDebt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MinimumDenominationDebt
 * SecuritiesQuantity.MinimumDenominationDebt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MinimumIncrementDebt
 * SecuritiesQuantity.MinimumIncrementDebt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#DebtInstrument
 * InterestCalculation.DebtInstrument}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Loan Loan}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
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
	/**
	 * Indicates the direction of payment for asset or mortgage backed
	 * securities, ie, whether the repaid capital is distributed (payment
	 * direction is down) or capitalized (payment direction is up).
	 * <p>
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
	public static final MMBusinessAttribute PaymentDirectionIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentDirectionIndicator";
			definition = "Indicates the direction of payment for asset or mortgage backed securities, ie, whether the repaid capital is distributed (payment direction is down) or capitalized (payment direction is up).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> com.tools20022.repository.datatype.PaymentDirectionIndicator.mmObject();
		}
	};
	/**
	 * Next date/time at which the issuer has the right to pay the securitiy
	 * prior to maturity.
	 * <p>
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
	public static final MMBusinessAttribute NextCallableDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NextCallableDate";
			definition = "Next date/time at which the issuer has the right to pay the securitiy prior to maturity.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date at which the holder has the right to ask for redemption of the
	 * security prior to final maturity.
	 * <p>
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
	public static final MMBusinessAttribute PutableDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PutableDate";
			definition = "Date at which the holder has the right to ask for redemption of the security prior to final maturity.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * First date/time at which a security begins to accrue interest.
	 * <p>
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
	public static final MMBusinessAttribute DatedDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DatedDate";
			definition = "First date/time at which a security begins to accrue interest.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date/time at which the first interest payment is due to holders of the
	 * security.
	 * <p>
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
	public static final MMBusinessAttribute FirstPaymentDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FirstPaymentDate";
			definition = "Date/time at which the first interest payment is due to holders of the security.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Rate that defines the outstanding principal of the factored security.<br>
	 * Factored securities are debt instruments that have a factor that is used
	 * in the calculation of net money and market value. <br>
	 * Factors can be specified as current, next, previous or end factors.<br>
	 * End factor: portion of principal that is still due at the end of the
	 * financing period.<br>
	 * Previous factor: portion of principal that is still due before the
	 * current factor becomes applicable.<br>
	 * Next factor: rate that will be applicable as of the next factor date.
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
	public static final MMBusinessAttribute Factor = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Factor";
			definition = "Rate that defines the outstanding principal of the factored security.\r\nFactored securities are debt instruments that have a factor that is used in the calculation of net money and market value. \r\nFactors can be specified as current, next, previous or end factors.\r\nEnd factor: portion of principal that is still due at the end of the financing period.\r\nPrevious factor: portion of principal that is still due before the current factor becomes applicable.\r\nNext factor: rate that will be applicable as of the next factor date.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Number identifying a group of underlying assets assigned by the issuer of
	 * a factored security.
	 * <p>
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
	public static final MMBusinessAttribute PoolNumber = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PoolNumber";
			definition = "Number identifying a group of underlying assets assigned by the issuer of a factored security.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}
	};
	/**
	 * Indicates whether the interest rate of an interest bearing instrument is
	 * reset periodically.
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
	public static final MMBusinessAttribute VariableRateIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VariableRateIndicator";
			definition = "Indicates whether the interest rate of an interest bearing instrument is reset periodically.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether the issuer has the right to pay the security prior to
	 * maturity. Also called RetractableIndicator.
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
	public static final MMBusinessAttribute CallableIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CallableIndicator";
			definition = "Indicates whether the issuer has the right to pay the security prior to maturity. Also called RetractableIndicator.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether the holder has the right to ask for redemption of the
	 * security prior to final maturity. Also called RedeemableIndicator.
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
	public static final MMBusinessAttribute PutableIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PutableIndicator";
			definition = "Indicates whether the holder has the right to ask for redemption of the security prior to final maturity. Also called RedeemableIndicator.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Rate of return anticipated on a bond when held until maturity date.
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
	public static final MMBusinessAttribute YieldToMaturityRate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "YieldToMaturityRate";
			definition = "Rate of return anticipated on a bond when held until maturity date.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Amount of unpaid interest (on bonds which have defaulted and have
	 * subsequently restructured), which is capitalized and added to the
	 * original principal amount of the bond.
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
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
	public static final MMBusinessAttribute AccruedCapitalisationAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccruedCapitalisationAmount";
			definition = "Amount of unpaid interest (on bonds which have defaulted and have subsequently restructured), which is capitalized and added to the original principal amount of the bond.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Next payment date of an interest bearing financial instrument.
	 * <p>
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
	 * name} = "NextCouponDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Next payment date of an interest bearing financial instrument."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute NextCouponDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NextCouponDate";
			definition = "Next payment date of an interest bearing financial instrument.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * The date that the current factor will be changed to a new factor.
	 * <p>
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
	public static final MMBusinessAttribute NextFactorDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NextFactorDate";
			definition = "The date that the current factor will be changed to a new factor.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Specifies whether the payment of the coupon (interest) on a bond is off
	 * the normal schedule.
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
	public static final MMBusinessAttribute OddCouponIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OddCouponIndicator";
			definition = "Specifies whether the payment of the coupon (interest) on a bond is off the normal schedule.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * The program under which a commercial paper is issued. The values that are
	 * most used are: 0 = N/A 1 = 3(a)3 2 = 4(2) 3 = 3(a)4 4 = 3(c)7 5 = 144A 6
	 * = 3(a)2 99 = Other
	 * <p>
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
	public static final MMBusinessAttribute CPProgram = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CPProgram";
			definition = "The program under which a commercial paper is issued. The values that are most used are:\n0 = N/A\n1 = 3(a)3\n2 = 4(2)\n3 = 3(a)4\n4 = 3(c)7\n5 = 144A\n6 = 3(a)2\n99 = Other";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Registration type of a commercial paper issuance.
	 * <p>
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
	public static final MMBusinessAttribute CPRegistrationType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CPRegistrationType";
			definition = "Registration type of a commercial paper issuance.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Indicates whether the interest bearing security is convertible into
	 * another type of security.
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
	public static final MMBusinessAttribute ConvertibleIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConvertibleIndicator";
			definition = "Indicates whether the interest bearing security is convertible into another type of security.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether an interest bearing instrument is deposited in a fund
	 * that will be used to pay debt service on refunded securities.
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
	public static final MMBusinessAttribute PreFundedIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PreFundedIndicator";
			definition = "Indicates whether an interest bearing instrument is deposited in a fund that will be used to pay debt service on refunded securities.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether an interest bearing instrument is being escrowed or
	 * collateralized either by direct obligations guaranteed by the US
	 * government, or by other types of securities. The maturity schedules of
	 * the securities in the escrow fund are determined in such a way to pay the
	 * maturity value, coupon, and premium payments (if any) of the refunded
	 * bonds.
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
	public static final MMBusinessAttribute EscrowedIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EscrowedIndicator";
			definition = "Indicates whether an interest bearing instrument is being escrowed or collateralized either by direct obligations guaranteed by the US government, or by other types of securities. The maturity schedules of the securities in the escrow fund are determined in such a way to pay the maturity value, coupon, and premium payments (if any) of the refunded bonds.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether the security has no maturity date.
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
	public static final MMBusinessAttribute PerpetualIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PerpetualIndicator";
			definition = "Indicates whether the security has no maturity date.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether the security is a subordinated security.
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
	public static final MMBusinessAttribute SubordinatedIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SubordinatedIndicator";
			definition = "Indicates whether the security is a subordinated security.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether the security is extendible,eg, repayment may be
	 * extended or maturity changed.
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
	public static final MMBusinessAttribute ExtendibleIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExtendibleIndicator";
			definition = "Indicates whether the security is extendible,eg, repayment may be extended or maturity changed.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Period during which a date might be extended.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#ExtendiblePeriodDebt
	 * DateTimePeriod.ExtendiblePeriodDebt}</li>
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
	public static final MMBusinessAssociationEnd ExtendiblePeriod = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExtendiblePeriod";
			definition = "Period during which a date might be extended.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.ExtendiblePeriodDebt;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Amount for which a security can be overalloted (as in greenshoe option).
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
	public static final MMBusinessAttribute OverAllotmentAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OverAllotmentAmount";
			definition = "Amount for which a security can be overalloted (as in greenshoe option).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Percentage for which a security can be overalloted (as in greenshoe
	 * option).
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
	public static final MMBusinessAttribute OverAllotmentRate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OverAllotmentRate";
			definition = "Percentage for which a security can be overalloted (as in greenshoe option).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Indicates whether repayment is made via regular principal and interest
	 * payments over time.
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
	public static final MMBusinessAttribute AmortisableIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AmortisableIndicator";
			definition = "Indicates whether repayment is made via regular principal and interest payments over time.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Specifies whether the interest amount is capitalised until maturity date
	 * or paid out at each interest payment date.
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
	public static final MMBusinessAttribute CapitalisedInterest = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CapitalisedInterest";
			definition = "Specifies whether the interest amount is capitalised until maturity date or paid out at each interest payment date.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DistributionPolicyCode.mmObject();
		}
	};
	/**
	 * Nominal value per security unit.
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
	public static final MMBusinessAttribute ActualDenominationAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ActualDenominationAmount";
			definition = "Nominal value per security unit.";
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Number of pieces composing a pool of financial assets.
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
	public static final MMBusinessAttribute Pieces = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Pieces";
			definition = "Number of pieces composing a pool of financial assets.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	/**
	 * Collection of assets by which a security is backed.
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
	public static final MMBusinessAttribute PoolsMaximum = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PoolsMaximum";
			definition = "Collection of assets by which a security is backed.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	/**
	 * Indicates per million the collection of loans, mortgages or other assets
	 * assembled by an originator as the basis for a security.
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
	public static final MMBusinessAttribute PoolsPerMillion = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PoolsPerMillion";
			definition = "Indicates per million the collection of loans, mortgages or other assets assembled by an originator as the basis for a security.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	/**
	 * Indicates per lot the collection of loans, mortgages or other assets
	 * assembled by an originator as the basis for a security.
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
	public static final MMBusinessAttribute PoolsPerLot = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PoolsPerLot";
			definition = "Indicates per lot the collection of loans, mortgages or other assets assembled by an originator as the basis for a security.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	/**
	 * Indicates per trade the collection of loans, mortgages or other assets
	 * assembled by an originator as the basis for a security.
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
	public static final MMBusinessAttribute PoolsPerTrade = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PoolsPerTrade";
			definition = "Indicates per trade the collection of loans, mortgages or other assets assembled by an originator as the basis for a security.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	/**
	 * Indicates whether a penalty might be imposed to the borrower of a
	 * mortgage in case of prepayments occurring during the lockout period.
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
	public static final MMBusinessAttribute ConstantPrePaymentPenalty = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConstantPrePaymentPenalty";
			definition = "Indicates whether a penalty might be imposed to the borrower of a mortgage in case of prepayments occurring during the lockout period.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Speed of unscheduled partial or complete payment of the principal amount
	 * outstanding on a debt obligation before its due date.
	 * <p>
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
	public static final MMBusinessAttribute PrePaymentSpeed = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PrePaymentSpeed";
			definition = "Speed of unscheduled partial or complete payment of the principal amount outstanding on a debt obligation before its due date.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PrePaymentSpeedCode.mmObject();
		}
	};
	/**
	 * Measure of prepayment as a yield of the current outstanding loan balance.
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
	public static final MMBusinessAttribute ConstantPrePaymentYield = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConstantPrePaymentYield";
			definition = "Measure of prepayment as a yield of the current outstanding loan balance.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Contains the weighted average coupon of the fixed income instrument
	 * (expressed as a percentage).
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
	public static final MMBusinessAttribute WeightedAverageCoupon = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WeightedAverageCoupon";
			definition = "Contains the weighted average coupon of the fixed income instrument (expressed as a percentage).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Contains the weighted average life of the fixed income instrument
	 * (expressed in months).
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
	public static final MMBusinessAttribute WeightedAverageLife = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WeightedAverageLife";
			definition = "Contains the weighted average life of the fixed income instrument (expressed in months).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	/**
	 * Contains the weighted average loan of the fixed income instrument
	 * (expressed in months).
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
	public static final MMBusinessAttribute WeightedAverageLoan = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WeightedAverageLoan";
			definition = "Contains the weighted average loan of the fixed income instrument (expressed in months).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	/**
	 * Contains the weighted average maturity of the fixed income instrument
	 * (expressed in months).
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
	public static final MMBusinessAttribute WeightedAverageMaturity = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WeightedAverageMaturity";
			definition = "Contains the weighted average maturity of the fixed income instrument (expressed in months).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	/**
	 * Indicates whether the instruments is backed by any kind of asset or not.
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
	public static final MMBusinessAttribute InsuredIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InsuredIndicator";
			definition = "Indicates whether the instruments is backed by any kind of asset or not.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether the security is bank qualified (usually applies to loan
	 * products).
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
	public static final MMBusinessAttribute BankQualified = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BankQualified";
			definition = "Indicates whether the security is bank qualified (usually applies to loan products).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates an instruction to reinvest dividends in the underlying security
	 * (or proceeds at maturity in a similar instrument) if the current rate
	 * equals the rate specified or better.
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
	public static final MMBusinessAttribute AutoReinvestment = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AutoReinvestment";
			definition = "Indicates an instruction to reinvest dividends in the underlying security (or proceeds at maturity in a similar instrument) if the current rate equals the rate specified or better.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Indicates an instruction to override an investment's default start and/or
	 * end date with a custom date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#CustomDateDebt
	 * DateTimePeriod.CustomDateDebt}</li>
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
	public static final MMBusinessAssociationEnd CustomDate = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CustomDate";
			definition = "Indicates an instruction to override an investment's default start and/or end date with a custom date.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.CustomDateDebt;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates an instruction or attribute giving the number of days to be
	 * included in the look-back period for the investment. Some options allow
	 * exercise based on the underlying asset's optimal value over the look-back
	 * period.
	 * <p>
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
	 * name} = "LookBack"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates an instruction or attribute giving the number of days to be included in the look-back period for the investment. Some options allow exercise based on the underlying asset's optimal value over the look-back period."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute LookBack = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LookBack";
			definition = "Indicates an instruction or attribute giving the number of days to be included in the look-back period for the investment. Some options allow exercise based on the underlying asset's optimal value over the look-back period.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Indicates the minimum denomination of a security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MinimumDenominationDebt
	 * SecuritiesQuantity.MinimumDenominationDebt}</li>
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
	public static final MMBusinessAssociationEnd MinimumDenomination = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumDenomination";
			definition = "Indicates the minimum denomination of a security.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.MinimumDenominationDebt;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Maximum number of time the collateral can be substitute.
	 * <p>
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
	public static final MMBusinessAttribute MaximumSubstitution = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumSubstitution";
			definition = "Maximum number of time the collateral can be substitute.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Indicates the minimum tradable increments of a security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MinimumIncrementDebt
	 * SecuritiesQuantity.MinimumIncrementDebt}</li>
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
	public static final MMBusinessAssociationEnd MinimumIncrement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumIncrement";
			definition = "Indicates the minimum tradable increments of a security.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.MinimumIncrementDebt;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates a search criterion used when looking to buy a bond,
	 * particularly an mortgage back security (MBS), issued in a particular
	 * year.
	 * <p>
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
	public static final MMBusinessAttribute Production = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Production";
			definition = "Indicates a search criterion used when looking to buy a bond, particularly an mortgage back security (MBS), issued in a particular year.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Identifies if the securities is restricted or not (as per Rule 144).
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
	public static final MMBusinessAttribute Restricted = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Restricted";
			definition = "Identifies if the securities is restricted or not (as per Rule 144).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates the frequency at which the bond is re-rated and therefore
	 * re-priced (bond attribute, particularly of floating rate and index linked
	 * instruments).
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
	public static final MMBusinessAttribute PriceFrequency = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PriceFrequency";
			definition = "Indicates the frequency at which the bond is re-rated and therefore re-priced (bond attribute, particularly of floating rate and index linked instruments).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}
	};
	/**
	 * Indicates the maximum number of times collateral can be substituted.
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
	public static final MMBusinessAttribute SubstitutionFrequency = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SubstitutionFrequency";
			definition = "Indicates the maximum number of times collateral can be substituted.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}
	};
	/**
	 * Number of remaining times the collateral can be substitute.
	 * <p>
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
	public static final MMBusinessAttribute SubstitutionLeft = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SubstitutionLeft";
			definition = "Number of remaining times the collateral can be substitute.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Indicates a search criterion when looking to buy an mortgage back
	 * security (MBS) that either is [yes] or is not [no] an entire pool.
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
	public static final MMBusinessAttribute WholePool = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WholePool";
			definition = "Indicates a search criterion when looking to buy an mortgage back security (MBS) that either is [yes] or is not [no] an entire pool.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Identifies whether the issue is subject to alternative minimum taxation
	 * (used for municipal bonds).
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
	public static final MMBusinessAttribute AlternativeMinimumTax = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AlternativeMinimumTax";
			definition = "Identifies whether the issue is subject to alternative minimum taxation (used for municipal bonds).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Specifies the interest applicable to the next interest payment period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#DebtInstrument
	 * InterestCalculation.DebtInstrument}</li>
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
	public static final MMBusinessAssociationEnd NextInterest = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NextInterest";
			definition = "Specifies the interest applicable to the next interest payment period.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> InterestCalculation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InterestCalculation.DebtInstrument;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Date/time to which a date might be extended.
	 * <p>
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
	public static final MMBusinessAttribute ExtendibleDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExtendibleDate";
			definition = "Date/time to which a date might be extended.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Indicates whether the security is a sinkung fund. A sinking fund is a
	 * bond in which part of the total principal amount is repaid according to
	 * agreed schedules of dates, amounts and prices.
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
	public static final MMBusinessAttribute SinkableIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SinkableIndicator";
			definition = "Indicates whether the security is a sinkung fund. A sinking fund is a bond in which part of the total principal amount is repaid according to agreed schedules of dates, amounts and prices.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Identifies whether the lender is assured partial or full payment by a
	 * third party if the borrower defaults.
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
	public static final MMBusinessAttribute Insured = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Insured";
			definition = "Identifies whether the lender is assured partial or full payment by a third party if the borrower defaults.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Type of stipulation expressing geographical constraints on a fixed income
	 * instrument. It is expressed with a state or country abbreviation and a
	 * minimum or maximum percentage. Example: CA 0-80 (minimum of 80 percent in
	 * Californian assets).
	 * <p>
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
	public static final MMBusinessAttribute Geographics = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Geographics";
			definition = "Type of stipulation expressing geographical constraints on a fixed income instrument. It is expressed with a state or country abbreviation and a minimum or maximum percentage. Example: CA 0-80 (minimum of 80 percent in Californian assets).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Currency of the payment.
	 * <p>
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
	public static final MMBusinessAttribute PaymentCurrency = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentCurrency";
			definition = "Currency of the payment.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Price that includes interest that has accrued since issue of the most
	 * recent coupon payment.
	 * <p>
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
	public static final MMBusinessAttribute DirtyPrice = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DirtyPrice";
			definition = "Price that includes interest that has accrued since issue of the most recent coupon payment.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> SecuritiesPricing.mmObject();
		}
	};
	/**
	 * Seniority of a specific debt instrument, that is the order of repayment
	 * in the event of a sale or bankruptcy of the issuer of the debt.
	 * <p>
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
	public static final MMBusinessAttribute DebtSeniority = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DebtSeniority";
			definition = "Seniority of a specific debt instrument, that is the order of repayment in the event of a sale or bankruptcy of the issuer of the debt.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DebtInstrumentSeniorityTypeCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Debt";
				definition = "Financial instruments evidencing moneys owed by the issuer to the holder on terms as specified.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DateTimePeriod.ExtendiblePeriodDebt, com.tools20022.repository.entity.DateTimePeriod.CustomDateDebt,
						com.tools20022.repository.entity.SecuritiesQuantity.MinimumDenominationDebt, com.tools20022.repository.entity.SecuritiesQuantity.MinimumIncrementDebt,
						com.tools20022.repository.entity.InterestCalculation.DebtInstrument);
				subType_lazy = () -> Arrays.asList(Loan.mmObject());
				superType_lazy = () -> Security.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Debt.PaymentDirectionIndicator, com.tools20022.repository.entity.Debt.NextCallableDate, com.tools20022.repository.entity.Debt.PutableDate,
						com.tools20022.repository.entity.Debt.DatedDate, com.tools20022.repository.entity.Debt.FirstPaymentDate, com.tools20022.repository.entity.Debt.Factor, com.tools20022.repository.entity.Debt.PoolNumber,
						com.tools20022.repository.entity.Debt.VariableRateIndicator, com.tools20022.repository.entity.Debt.CallableIndicator, com.tools20022.repository.entity.Debt.PutableIndicator,
						com.tools20022.repository.entity.Debt.YieldToMaturityRate, com.tools20022.repository.entity.Debt.AccruedCapitalisationAmount, com.tools20022.repository.entity.Debt.NextCouponDate,
						com.tools20022.repository.entity.Debt.NextFactorDate, com.tools20022.repository.entity.Debt.OddCouponIndicator, com.tools20022.repository.entity.Debt.CPProgram,
						com.tools20022.repository.entity.Debt.CPRegistrationType, com.tools20022.repository.entity.Debt.ConvertibleIndicator, com.tools20022.repository.entity.Debt.PreFundedIndicator,
						com.tools20022.repository.entity.Debt.EscrowedIndicator, com.tools20022.repository.entity.Debt.PerpetualIndicator, com.tools20022.repository.entity.Debt.SubordinatedIndicator,
						com.tools20022.repository.entity.Debt.ExtendibleIndicator, com.tools20022.repository.entity.Debt.ExtendiblePeriod, com.tools20022.repository.entity.Debt.OverAllotmentAmount,
						com.tools20022.repository.entity.Debt.OverAllotmentRate, com.tools20022.repository.entity.Debt.AmortisableIndicator, com.tools20022.repository.entity.Debt.CapitalisedInterest,
						com.tools20022.repository.entity.Debt.ActualDenominationAmount, com.tools20022.repository.entity.Debt.Pieces, com.tools20022.repository.entity.Debt.PoolsMaximum,
						com.tools20022.repository.entity.Debt.PoolsPerMillion, com.tools20022.repository.entity.Debt.PoolsPerLot, com.tools20022.repository.entity.Debt.PoolsPerTrade,
						com.tools20022.repository.entity.Debt.ConstantPrePaymentPenalty, com.tools20022.repository.entity.Debt.PrePaymentSpeed, com.tools20022.repository.entity.Debt.ConstantPrePaymentYield,
						com.tools20022.repository.entity.Debt.WeightedAverageCoupon, com.tools20022.repository.entity.Debt.WeightedAverageLife, com.tools20022.repository.entity.Debt.WeightedAverageLoan,
						com.tools20022.repository.entity.Debt.WeightedAverageMaturity, com.tools20022.repository.entity.Debt.InsuredIndicator, com.tools20022.repository.entity.Debt.BankQualified,
						com.tools20022.repository.entity.Debt.AutoReinvestment, com.tools20022.repository.entity.Debt.CustomDate, com.tools20022.repository.entity.Debt.LookBack, com.tools20022.repository.entity.Debt.MinimumDenomination,
						com.tools20022.repository.entity.Debt.MaximumSubstitution, com.tools20022.repository.entity.Debt.MinimumIncrement, com.tools20022.repository.entity.Debt.Production, com.tools20022.repository.entity.Debt.Restricted,
						com.tools20022.repository.entity.Debt.PriceFrequency, com.tools20022.repository.entity.Debt.SubstitutionFrequency, com.tools20022.repository.entity.Debt.SubstitutionLeft,
						com.tools20022.repository.entity.Debt.WholePool, com.tools20022.repository.entity.Debt.AlternativeMinimumTax, com.tools20022.repository.entity.Debt.NextInterest, com.tools20022.repository.entity.Debt.ExtendibleDate,
						com.tools20022.repository.entity.Debt.SinkableIndicator, com.tools20022.repository.entity.Debt.Insured, com.tools20022.repository.entity.Debt.Geographics, com.tools20022.repository.entity.Debt.PaymentCurrency,
						com.tools20022.repository.entity.Debt.DirtyPrice, com.tools20022.repository.entity.Debt.DebtSeniority);
			}
		});
		return mmObject_lazy.get();
	}
}