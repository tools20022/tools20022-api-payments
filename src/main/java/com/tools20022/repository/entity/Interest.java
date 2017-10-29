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
import com.tools20022.repository.choice.InterestRate2Choice;
import com.tools20022.repository.codeset.DebitCreditCode;
import com.tools20022.repository.codeset.InterestTypeCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.msg.InterestPaymentDateRange1;
import com.tools20022.repository.msg.InterestRateContractTerm1;
import com.tools20022.repository.msg.InterestRecord1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Consideration, such as amount of money, paid or received in exchange for an
 * asset that has been invested, loaned or borrowed for a certain period. The
 * interest is expressed as a fixed amount or percentage of the amount upon
 * which the interest is applied.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Interest" src="doc-files/Interest.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#AccruedInterestAmount
 * Interest.AccruedInterestAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#InterestCalculation
 * Interest.InterestCalculation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#Amount
 * Interest.Amount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#Rate Interest.Rate}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#RelatedCashProceedsDefinition
 * Interest.RelatedCashProceedsDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#SecuritiesFinancing
 * Interest.SecuritiesFinancing}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#InterestTax
 * Interest.InterestTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#CreditDebitIndicator
 * Interest.CreditDebitIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#CashEntry
 * Interest.CashEntry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#PaymentDate
 * Interest.PaymentDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#RelatedInterestManagement
 * Interest.RelatedInterestManagement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#RelatedUndertakingAmount
 * Interest.RelatedUndertakingAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#RelatedDebitCreditFacility
 * Interest.RelatedDebitCreditFacility}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#SecuritiesSettlement
 * Interest.SecuritiesSettlement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#InterestName
 * Interest.InterestName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#RelatedAssetHolding
 * Interest.RelatedAssetHolding}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#Deposit
 * Interest.Deposit}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#AccountBalance
 * Interest.AccountBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#RelatedAccountContract
 * Interest.RelatedAccountContract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#RelatedNetAssetValueCalculation
 * Interest.RelatedNetAssetValueCalculation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#TypeOfInterest
 * Interest.TypeOfInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#RelatedPaymentCard
 * Interest.RelatedPaymentCard}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#IdentificationForInterestName
 * GenericIdentification.IdentificationForInterestName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#Interest
 * NetAssetValueCalculation.Interest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#Interest Tax.Interest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AccountContract#Interest
 * AccountContract.Interest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#Interest
 * PaymentCard.Interest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashEntry#Interest
 * CashEntry.Interest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetHolding#Interest
 * AssetHolding.Interest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Balance#Interest
 * Balance.Interest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#AccruedInterest
 * SecuritiesSettlement.AccruedInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#Interest
 * InterestCalculation.Interest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#Interest
 * SecuritiesFinancing.Interest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#Interest
 * CashProceedsDefinition.Interest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DebitCreditFacility#CashAccountInterest
 * DebitCreditFacility.CashAccountInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.UndertakingAmount#Interest
 * UndertakingAmount.Interest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Deposit#Interest
 * Deposit.Interest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InterestManagement#Interest
 * InterestManagement.Interest}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.InterestRecord1
 * InterestRecord1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InterestRateContractTerm1
 * InterestRateContractTerm1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.InterestRate2Choice
 * InterestRate2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InterestPaymentDateRange1
 * InterestPaymentDateRange1}</li>
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
 * "Interest"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Consideration, such as amount of money,  paid or received in exchange for an asset that has been invested, loaned or borrowed for a certain period. The interest is expressed as a fixed amount or percentage of the amount upon which the interest is applied."
 * </li>
 * </ul>
 */
public class Interest {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Interest amount that has accrued in between coupon payment periods.
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccruedInterestAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Interest amount that has accrued in between coupon payment periods."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AccruedInterestAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Interest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccruedInterestAmount";
			definition = "Interest amount that has accrued in between coupon payment periods.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Calculation parameters used to obtain the interest amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#Interest
	 * InterestCalculation.Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.InterestRecord1#Type
	 * InterestRecord1.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InterestRecord1#Rate
	 * InterestRecord1.Rate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountStatement6#Interest
	 * AccountStatement6.Interest}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountReport19#Interest
	 * AccountReport19.Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification12#Interest
	 * AccountNotification12.Interest}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry8#Interest
	 * ReportEntry8.Interest}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction8#Interest
	 * EntryTransaction8.Interest}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Calculation parameters used to obtain the interest amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd InterestCalculation = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InterestRecord1.Type, com.tools20022.repository.msg.InterestRecord1.Rate, com.tools20022.repository.msg.AccountStatement6.Interest,
					com.tools20022.repository.msg.AccountReport19.Interest, com.tools20022.repository.msg.AccountNotification12.Interest, com.tools20022.repository.msg.ReportEntry8.Interest,
					com.tools20022.repository.msg.EntryTransaction8.Interest);
			elementContext_lazy = () -> Interest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InterestCalculation";
			definition = "Calculation parameters used to obtain the interest amount.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InterestCalculation.Interest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Amount of money representing interest payments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.InterestRecord1#Amount
	 * InterestRecord1.Amount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money representing interest payments."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Amount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InterestRecord1.Amount);
			elementContext_lazy = () -> Interest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Amount of money representing interest payments.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * The actual interest rate used for the payment of the interest for the
	 * specified interest period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestRate2Choice#Fixed
	 * InterestRate2Choice.Fixed}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The actual interest rate used for the payment of the interest for the specified interest period."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Rate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.InterestRate2Choice.Fixed);
			elementContext_lazy = () -> Interest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Rate";
			definition = "The actual interest rate used for the payment of the interest for the specified interest period.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Cash proceeds definition for which an interest is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#Interest
	 * CashProceedsDefinition.Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition
	 * CashProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCashProceedsDefinition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash proceeds definition for which an interest is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedCashProceedsDefinition = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Interest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCashProceedsDefinition";
			definition = "Cash proceeds definition for which an interest is provided.";
			minOccurs = 0;
			type_lazy = () -> CashProceedsDefinition.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashProceedsDefinition.Interest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the financing trade on which this interest apply.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#Interest
	 * SecuritiesFinancing.Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesFinancing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the financing trade on which this interest apply."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesFinancing = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Interest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesFinancing";
			definition = "Specifies the financing trade on which this interest apply.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.Interest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the tax on interest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Tax#Interest
	 * Tax.Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountInterest3#Tax
	 * AccountInterest3.Tax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InterestRecord1#Tax
	 * InterestRecord1.Tax}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the tax on interest."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd InterestTax = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountInterest3.Tax, com.tools20022.repository.msg.InterestRecord1.Tax);
			elementContext_lazy = () -> Interest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InterestTax";
			definition = "Specifies the tax on interest.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Tax.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Tax.Interest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates whether the interest is a debit or credit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DebitCreditCode
	 * DebitCreditCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the interest is a debit or credit."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CreditDebitIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Interest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates whether the interest is a debit or credit.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DebitCreditCode.mmObject();
		}
	};
	/**
	 * Entry which contains the interest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#Interest
	 * CashEntry.Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashEntry CashEntry}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Entry which contains the interest."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CashEntry = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Interest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashEntry";
			definition = "Entry which contains the interest.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CashEntry.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashEntry.Interest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Date of the next interest payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestPaymentDateRange1#ExpectedDate
	 * InterestPaymentDateRange1.ExpectedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestPaymentDateRange1#DueDate
	 * InterestPaymentDateRange1.DueDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date of the next interest payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PaymentDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InterestPaymentDateRange1.ExpectedDate, com.tools20022.repository.msg.InterestPaymentDateRange1.DueDate);
			elementContext_lazy = () -> Interest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentDate";
			definition = "Date of the next interest payment.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Management of interest which consists into calculating the interest,
	 * requesting its payment or distributing the interest proceeds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InterestManagement#Interest
	 * InterestManagement.Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InterestManagement
	 * InterestManagement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedInterestManagement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Management of interest which consists into calculating the interest, requesting its payment or distributing the interest proceeds."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedInterestManagement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Interest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInterestManagement";
			definition = "Management of interest which consists into calculating the interest, requesting its payment or distributing the interest proceeds.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> InterestManagement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InterestManagement.Interest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Undertaking amount for which an interest is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingAmount#Interest
	 * UndertakingAmount.Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.UndertakingAmount
	 * UndertakingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedUndertakingAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Undertaking amount for which an interest is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedUndertakingAmount = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Interest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedUndertakingAmount";
			definition = "Undertaking amount for which an interest is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> UndertakingAmount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.UndertakingAmount.Interest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Debit and credit facilities on which the interest applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DebitCreditFacility#CashAccountInterest
	 * DebitCreditFacility.CashAccountInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DebitCreditFacility
	 * DebitCreditFacility}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedDebitCreditFacility"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Debit and credit facilities on which the interest applies."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedDebitCreditFacility = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Interest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedDebitCreditFacility";
			definition = "Debit and credit facilities on which the interest applies.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> DebitCreditFacility.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DebitCreditFacility.CashAccountInterest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities settlement process for which an accrued interest is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#AccruedInterest
	 * SecuritiesSettlement.AccruedInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities settlement process for which an accrued interest is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesSettlement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Interest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesSettlement";
			definition = "Securities settlement process for which an accrued interest is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.AccruedInterest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Interest rate expressed as a rate name.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#IdentificationForInterestName
	 * GenericIdentification.IdentificationForInterestName}</li>
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Interest rate expressed as a rate name."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd InterestName = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Interest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InterestName";
			definition = "Interest rate expressed as a rate name.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> GenericIdentification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.IdentificationForInterestName;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Asset holding on which interest is paid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#Interest
	 * AssetHolding.Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AssetHolding
	 * AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedAssetHolding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset holding on which interest is paid."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedAssetHolding = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Interest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedAssetHolding";
			definition = "Asset holding on which interest is paid.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> AssetHolding.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AssetHolding.Interest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Deposit for which an interest is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Deposit#Interest
	 * Deposit.Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Deposit Deposit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Deposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Deposit for which an interest is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Deposit = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Interest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Deposit";
			definition = "Deposit for which an interest is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Deposit.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Deposit.Interest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Balance for which an interest is calculated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Balance#Interest
	 * Balance.Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Balance Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance for which an interest is calculated."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd AccountBalance = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Interest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccountBalance";
			definition = "Balance for which an interest is calculated.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Balance.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Balance.Interest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Account contract for which interest parameters are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountContract#Interest
	 * AccountContract.Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AccountContract
	 * AccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedAccountContract"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account contract for which interest parameters are specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedAccountContract = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Interest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedAccountContract";
			definition = "Account contract for which interest parameters are specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> AccountContract.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AccountContract.Interest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Net asset value calculation for which an accrued interest is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#Interest
	 * NetAssetValueCalculation.Interest}</li>
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedNetAssetValueCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net asset value calculation for which an accrued interest is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedNetAssetValueCalculation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Interest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedNetAssetValueCalculation";
			definition = "Net asset value calculation for which an accrued interest is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> NetAssetValueCalculation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.Interest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the type of interest associated with a trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InterestTypeCode
	 * InterestTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeOfInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of interest associated with a trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TypeOfInterest = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Interest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TypeOfInterest";
			definition = "Specifies the type of interest associated with a trade.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> InterestTypeCode.mmObject();
		}
	};
	/**
	 * Payment card for which interest on due amounts is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard#Interest
	 * PaymentCard.Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentCard
	 * PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPaymentCard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment card for which interest on due amounts is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedPaymentCard = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Interest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedPaymentCard";
			definition = "Payment card for which interest on due amounts is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> PaymentCard.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentCard.Interest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Interest";
				definition = "Consideration, such as amount of money,  paid or received in exchange for an asset that has been invested, loaned or borrowed for a certain period. The interest is expressed as a fixed amount or percentage of the amount upon which the interest is applied.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GenericIdentification.IdentificationForInterestName, com.tools20022.repository.entity.NetAssetValueCalculation.Interest,
						com.tools20022.repository.entity.Tax.Interest, com.tools20022.repository.entity.AccountContract.Interest, com.tools20022.repository.entity.PaymentCard.Interest, com.tools20022.repository.entity.CashEntry.Interest,
						com.tools20022.repository.entity.AssetHolding.Interest, com.tools20022.repository.entity.Balance.Interest, com.tools20022.repository.entity.SecuritiesSettlement.AccruedInterest,
						com.tools20022.repository.entity.InterestCalculation.Interest, com.tools20022.repository.entity.SecuritiesFinancing.Interest, com.tools20022.repository.entity.CashProceedsDefinition.Interest,
						com.tools20022.repository.entity.DebitCreditFacility.CashAccountInterest, com.tools20022.repository.entity.UndertakingAmount.Interest, com.tools20022.repository.entity.Deposit.Interest,
						com.tools20022.repository.entity.InterestManagement.Interest);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Interest.AccruedInterestAmount, com.tools20022.repository.entity.Interest.InterestCalculation, com.tools20022.repository.entity.Interest.Amount,
						com.tools20022.repository.entity.Interest.Rate, com.tools20022.repository.entity.Interest.RelatedCashProceedsDefinition, com.tools20022.repository.entity.Interest.SecuritiesFinancing,
						com.tools20022.repository.entity.Interest.InterestTax, com.tools20022.repository.entity.Interest.CreditDebitIndicator, com.tools20022.repository.entity.Interest.CashEntry,
						com.tools20022.repository.entity.Interest.PaymentDate, com.tools20022.repository.entity.Interest.RelatedInterestManagement, com.tools20022.repository.entity.Interest.RelatedUndertakingAmount,
						com.tools20022.repository.entity.Interest.RelatedDebitCreditFacility, com.tools20022.repository.entity.Interest.SecuritiesSettlement, com.tools20022.repository.entity.Interest.InterestName,
						com.tools20022.repository.entity.Interest.RelatedAssetHolding, com.tools20022.repository.entity.Interest.Deposit, com.tools20022.repository.entity.Interest.AccountBalance,
						com.tools20022.repository.entity.Interest.RelatedAccountContract, com.tools20022.repository.entity.Interest.RelatedNetAssetValueCalculation, com.tools20022.repository.entity.Interest.TypeOfInterest,
						com.tools20022.repository.entity.Interest.RelatedPaymentCard);
				derivationComponent_lazy = () -> Arrays.asList(InterestRecord1.mmObject(), InterestRateContractTerm1.mmObject(), InterestRate2Choice.mmObject(), InterestPaymentDateRange1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}