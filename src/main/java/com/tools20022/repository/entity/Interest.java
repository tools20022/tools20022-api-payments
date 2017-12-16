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
import com.tools20022.repository.choice.InterestRate2Choice;
import com.tools20022.repository.codeset.DebitCreditCode;
import com.tools20022.repository.codeset.InterestTypeCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.entity.Interest#mmAccruedInterestAmount
 * Interest.mmAccruedInterestAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#mmInterestCalculation
 * Interest.mmInterestCalculation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#mmAmount
 * Interest.mmAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#mmRate
 * Interest.mmRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#mmRelatedCashProceedsDefinition
 * Interest.mmRelatedCashProceedsDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#mmSecuritiesFinancing
 * Interest.mmSecuritiesFinancing}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#mmInterestTax
 * Interest.mmInterestTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#mmCreditDebitIndicator
 * Interest.mmCreditDebitIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#mmCashEntry
 * Interest.mmCashEntry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#mmPaymentDate
 * Interest.mmPaymentDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#mmRelatedInterestManagement
 * Interest.mmRelatedInterestManagement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#mmRelatedUndertakingAmount
 * Interest.mmRelatedUndertakingAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#mmRelatedDebitCreditFacility
 * Interest.mmRelatedDebitCreditFacility}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#mmSecuritiesSettlement
 * Interest.mmSecuritiesSettlement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#mmInterestName
 * Interest.mmInterestName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#mmRelatedAssetHolding
 * Interest.mmRelatedAssetHolding}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#mmDeposit
 * Interest.mmDeposit}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#mmAccountBalance
 * Interest.mmAccountBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#mmRelatedAccountContract
 * Interest.mmRelatedAccountContract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#mmRelatedNetAssetValueCalculation
 * Interest.mmRelatedNetAssetValueCalculation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#mmTypeOfInterest
 * Interest.mmTypeOfInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#mmRelatedPaymentCard
 * Interest.mmRelatedPaymentCard}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentificationForInterestName
 * GenericIdentification.mmIdentificationForInterestName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmInterest
 * NetAssetValueCalculation.mmInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmInterest
 * Tax.mmInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AccountContract#mmInterest
 * AccountContract.mmInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#mmInterest
 * PaymentCard.mmInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashEntry#mmInterest
 * CashEntry.mmInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetHolding#mmInterest
 * AssetHolding.mmInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Balance#mmInterest
 * Balance.mmInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmAccruedInterest
 * SecuritiesSettlement.mmAccruedInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmInterest
 * InterestCalculation.mmInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmInterest
 * SecuritiesFinancing.mmInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#mmInterest
 * CashProceedsDefinition.mmInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DebitCreditFacility#mmCashAccountInterest
 * DebitCreditFacility.mmCashAccountInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UndertakingAmount#mmInterest
 * UndertakingAmount.mmInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Deposit#mmInterest
 * Deposit.mmInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestManagement#mmInterest
 * InterestManagement.mmInterest}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	protected CurrencyAndAmount accruedInterestAmount;
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
	public static final MMBusinessAttribute mmAccruedInterestAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccruedInterestAmount";
			definition = "Interest amount that has accrued in between coupon payment periods.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Interest.class.getMethod("getAccruedInterestAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.InterestCalculation> interestCalculation;
	/**
	 * Calculation parameters used to obtain the interest amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmInterest
	 * InterestCalculation.mmInterest}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.InterestRecord1#mmType
	 * InterestRecord1.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InterestRecord1#mmRate
	 * InterestRecord1.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountStatement6#mmInterest
	 * AccountStatement6.mmInterest}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountReport19#mmInterest
	 * AccountReport19.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification12#mmInterest
	 * AccountNotification12.mmInterest}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry8#mmInterest
	 * ReportEntry8.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#mmInterest
	 * EntryTransaction8.mmInterest}</li>
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
	public static final MMBusinessAssociationEnd mmInterestCalculation = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(InterestRecord1.mmType, InterestRecord1.mmRate, AccountStatement6.mmInterest, AccountReport19.mmInterest, AccountNotification12.mmInterest, ReportEntry8.mmInterest,
					EntryTransaction8.mmInterest);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InterestCalculation";
			definition = "Calculation parameters used to obtain the interest amount.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmObject();
		}
	};
	protected CurrencyAndAmount amount;
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
	 * <li>{@linkplain com.tools20022.repository.msg.InterestRecord1#mmAmount
	 * InterestRecord1.mmAmount}</li>
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
	public static final MMBusinessAttribute mmAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(InterestRecord1.mmAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Amount of money representing interest payments.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Interest.class.getMethod("getAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PercentageRate rate;
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
	 * {@linkplain com.tools20022.repository.choice.InterestRate2Choice#mmFixed
	 * InterestRate2Choice.mmFixed}</li>
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
	public static final MMBusinessAttribute mmRate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(InterestRate2Choice.mmFixed);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Rate";
			definition = "The actual interest rate used for the payment of the interest for the specified interest period.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Interest.class.getMethod("getRate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.CashProceedsDefinition> relatedCashProceedsDefinition;
	/**
	 * Cash proceeds definition for which an interest is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#mmInterest
	 * CashProceedsDefinition.mmInterest}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedCashProceedsDefinition = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedCashProceedsDefinition";
			definition = "Cash proceeds definition for which an interest is provided.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashProceedsDefinition.mmInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashProceedsDefinition.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesFinancing> securitiesFinancing;
	/**
	 * Specifies the financing trade on which this interest apply.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmInterest
	 * SecuritiesFinancing.mmInterest}</li>
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
	public static final MMBusinessAssociationEnd mmSecuritiesFinancing = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesFinancing";
			definition = "Specifies the financing trade on which this interest apply.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmObject();
		}
	};
	protected Tax interestTax;
	/**
	 * Specifies the tax on interest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Tax#mmInterest
	 * Tax.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountInterest3#mmTax
	 * AccountInterest3.mmTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InterestRecord1#mmTax
	 * InterestRecord1.mmTax}</li>
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
	public static final MMBusinessAssociationEnd mmInterestTax = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(AccountInterest3.mmTax, InterestRecord1.mmTax);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InterestTax";
			definition = "Specifies the tax on interest.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Tax.mmInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
		}
	};
	protected DebitCreditCode creditDebitIndicator;
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
	public static final MMBusinessAttribute mmCreditDebitIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates whether the interest is a debit or credit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DebitCreditCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Interest.class.getMethod("getCreditDebitIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CashEntry cashEntry;
	/**
	 * Entry which contains the interest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#mmInterest
	 * CashEntry.mmInterest}</li>
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
	public static final MMBusinessAssociationEnd mmCashEntry = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashEntry";
			definition = "Entry which contains the interest.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CashEntry.mmInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashEntry.mmObject();
		}
	};
	protected ISODate paymentDate;
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
	 * {@linkplain com.tools20022.repository.msg.InterestPaymentDateRange1#mmExpectedDate
	 * InterestPaymentDateRange1.mmExpectedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestPaymentDateRange1#mmDueDate
	 * InterestPaymentDateRange1.mmDueDate}</li>
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
	public static final MMBusinessAttribute mmPaymentDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(InterestPaymentDateRange1.mmExpectedDate, InterestPaymentDateRange1.mmDueDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentDate";
			definition = "Date of the next interest payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Interest.class.getMethod("getPaymentDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected InterestManagement relatedInterestManagement;
	/**
	 * Management of interest which consists into calculating the interest,
	 * requesting its payment or distributing the interest proceeds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InterestManagement#mmInterest
	 * InterestManagement.mmInterest}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedInterestManagement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedInterestManagement";
			definition = "Management of interest which consists into calculating the interest, requesting its payment or distributing the interest proceeds.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InterestManagement.mmInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InterestManagement.mmObject();
		}
	};
	protected UndertakingAmount relatedUndertakingAmount;
	/**
	 * Undertaking amount for which an interest is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingAmount#mmInterest
	 * UndertakingAmount.mmInterest}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedUndertakingAmount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedUndertakingAmount";
			definition = "Undertaking amount for which an interest is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.UndertakingAmount.mmInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.UndertakingAmount.mmObject();
		}
	};
	protected DebitCreditFacility relatedDebitCreditFacility;
	/**
	 * Debit and credit facilities on which the interest applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DebitCreditFacility#mmCashAccountInterest
	 * DebitCreditFacility.mmCashAccountInterest}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedDebitCreditFacility = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedDebitCreditFacility";
			definition = "Debit and credit facilities on which the interest applies.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.DebitCreditFacility.mmCashAccountInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DebitCreditFacility.mmObject();
		}
	};
	protected SecuritiesSettlement securitiesSettlement;
	/**
	 * Securities settlement process for which an accrued interest is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmAccruedInterest
	 * SecuritiesSettlement.mmAccruedInterest}</li>
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
	public static final MMBusinessAssociationEnd mmSecuritiesSettlement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesSettlement";
			definition = "Securities settlement process for which an accrued interest is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmAccruedInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
		}
	};
	protected GenericIdentification interestName;
	/**
	 * Interest rate expressed as a rate name.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentificationForInterestName
	 * GenericIdentification.mmIdentificationForInterestName}</li>
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
	public static final MMBusinessAssociationEnd mmInterestName = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InterestName";
			definition = "Interest rate expressed as a rate name.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmIdentificationForInterestName;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
		}
	};
	protected AssetHolding relatedAssetHolding;
	/**
	 * Asset holding on which interest is paid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmInterest
	 * AssetHolding.mmInterest}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedAssetHolding = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedAssetHolding";
			definition = "Asset holding on which interest is paid.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmObject();
		}
	};
	protected Deposit deposit;
	/**
	 * Deposit for which an interest is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Deposit#mmInterest
	 * Deposit.mmInterest}</li>
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
	public static final MMBusinessAssociationEnd mmDeposit = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Deposit";
			definition = "Deposit for which an interest is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Deposit.mmInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Deposit.mmObject();
		}
	};
	protected Balance accountBalance;
	/**
	 * Balance for which an interest is calculated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Balance#mmInterest
	 * Balance.mmInterest}</li>
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
	public static final MMBusinessAssociationEnd mmAccountBalance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccountBalance";
			definition = "Balance for which an interest is calculated.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Balance.mmInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Balance.mmObject();
		}
	};
	protected AccountContract relatedAccountContract;
	/**
	 * Account contract for which interest parameters are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountContract#mmInterest
	 * AccountContract.mmInterest}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedAccountContract = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedAccountContract";
			definition = "Account contract for which interest parameters are specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.AccountContract.mmInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AccountContract.mmObject();
		}
	};
	protected NetAssetValueCalculation relatedNetAssetValueCalculation;
	/**
	 * Net asset value calculation for which an accrued interest is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmInterest
	 * NetAssetValueCalculation.mmInterest}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedNetAssetValueCalculation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedNetAssetValueCalculation";
			definition = "Net asset value calculation for which an accrued interest is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
		}
	};
	protected InterestTypeCode typeOfInterest;
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
	public static final MMBusinessAttribute mmTypeOfInterest = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TypeOfInterest";
			definition = "Specifies the type of interest associated with a trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InterestTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Interest.class.getMethod("getTypeOfInterest", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PaymentCard relatedPaymentCard;
	/**
	 * Payment card for which interest on due amounts is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard#mmInterest
	 * PaymentCard.mmInterest}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedPaymentCard = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedPaymentCard";
			definition = "Payment card for which interest on due amounts is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentCard.mmInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentCard.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Interest";
				definition = "Consideration, such as amount of money,  paid or received in exchange for an asset that has been invested, loaned or borrowed for a certain period. The interest is expressed as a fixed amount or percentage of the amount upon which the interest is applied.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GenericIdentification.mmIdentificationForInterestName, com.tools20022.repository.entity.NetAssetValueCalculation.mmInterest,
						com.tools20022.repository.entity.Tax.mmInterest, com.tools20022.repository.entity.AccountContract.mmInterest, com.tools20022.repository.entity.PaymentCard.mmInterest,
						com.tools20022.repository.entity.CashEntry.mmInterest, com.tools20022.repository.entity.AssetHolding.mmInterest, com.tools20022.repository.entity.Balance.mmInterest,
						com.tools20022.repository.entity.SecuritiesSettlement.mmAccruedInterest, com.tools20022.repository.entity.InterestCalculation.mmInterest, com.tools20022.repository.entity.SecuritiesFinancing.mmInterest,
						com.tools20022.repository.entity.CashProceedsDefinition.mmInterest, com.tools20022.repository.entity.DebitCreditFacility.mmCashAccountInterest, com.tools20022.repository.entity.UndertakingAmount.mmInterest,
						com.tools20022.repository.entity.Deposit.mmInterest, com.tools20022.repository.entity.InterestManagement.mmInterest);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Interest.mmAccruedInterestAmount, com.tools20022.repository.entity.Interest.mmInterestCalculation, com.tools20022.repository.entity.Interest.mmAmount,
						com.tools20022.repository.entity.Interest.mmRate, com.tools20022.repository.entity.Interest.mmRelatedCashProceedsDefinition, com.tools20022.repository.entity.Interest.mmSecuritiesFinancing,
						com.tools20022.repository.entity.Interest.mmInterestTax, com.tools20022.repository.entity.Interest.mmCreditDebitIndicator, com.tools20022.repository.entity.Interest.mmCashEntry,
						com.tools20022.repository.entity.Interest.mmPaymentDate, com.tools20022.repository.entity.Interest.mmRelatedInterestManagement, com.tools20022.repository.entity.Interest.mmRelatedUndertakingAmount,
						com.tools20022.repository.entity.Interest.mmRelatedDebitCreditFacility, com.tools20022.repository.entity.Interest.mmSecuritiesSettlement, com.tools20022.repository.entity.Interest.mmInterestName,
						com.tools20022.repository.entity.Interest.mmRelatedAssetHolding, com.tools20022.repository.entity.Interest.mmDeposit, com.tools20022.repository.entity.Interest.mmAccountBalance,
						com.tools20022.repository.entity.Interest.mmRelatedAccountContract, com.tools20022.repository.entity.Interest.mmRelatedNetAssetValueCalculation, com.tools20022.repository.entity.Interest.mmTypeOfInterest,
						com.tools20022.repository.entity.Interest.mmRelatedPaymentCard);
				derivationComponent_lazy = () -> Arrays.asList(InterestRecord1.mmObject(), InterestRateContractTerm1.mmObject(), InterestRate2Choice.mmObject(), InterestPaymentDateRange1.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Interest.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyAndAmount getAccruedInterestAmount() {
		return accruedInterestAmount;
	}

	public void setAccruedInterestAmount(CurrencyAndAmount accruedInterestAmount) {
		this.accruedInterestAmount = accruedInterestAmount;
	}

	public List<InterestCalculation> getInterestCalculation() {
		return interestCalculation;
	}

	public void setInterestCalculation(List<com.tools20022.repository.entity.InterestCalculation> interestCalculation) {
		this.interestCalculation = interestCalculation;
	}

	public CurrencyAndAmount getAmount() {
		return amount;
	}

	public void setAmount(CurrencyAndAmount amount) {
		this.amount = amount;
	}

	public PercentageRate getRate() {
		return rate;
	}

	public void setRate(PercentageRate rate) {
		this.rate = rate;
	}

	public List<CashProceedsDefinition> getRelatedCashProceedsDefinition() {
		return relatedCashProceedsDefinition;
	}

	public void setRelatedCashProceedsDefinition(List<com.tools20022.repository.entity.CashProceedsDefinition> relatedCashProceedsDefinition) {
		this.relatedCashProceedsDefinition = relatedCashProceedsDefinition;
	}

	public List<SecuritiesFinancing> getSecuritiesFinancing() {
		return securitiesFinancing;
	}

	public void setSecuritiesFinancing(List<com.tools20022.repository.entity.SecuritiesFinancing> securitiesFinancing) {
		this.securitiesFinancing = securitiesFinancing;
	}

	public Tax getInterestTax() {
		return interestTax;
	}

	public void setInterestTax(com.tools20022.repository.entity.Tax interestTax) {
		this.interestTax = interestTax;
	}

	public DebitCreditCode getCreditDebitIndicator() {
		return creditDebitIndicator;
	}

	public void setCreditDebitIndicator(DebitCreditCode creditDebitIndicator) {
		this.creditDebitIndicator = creditDebitIndicator;
	}

	public CashEntry getCashEntry() {
		return cashEntry;
	}

	public void setCashEntry(com.tools20022.repository.entity.CashEntry cashEntry) {
		this.cashEntry = cashEntry;
	}

	public ISODate getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(ISODate paymentDate) {
		this.paymentDate = paymentDate;
	}

	public InterestManagement getRelatedInterestManagement() {
		return relatedInterestManagement;
	}

	public void setRelatedInterestManagement(com.tools20022.repository.entity.InterestManagement relatedInterestManagement) {
		this.relatedInterestManagement = relatedInterestManagement;
	}

	public UndertakingAmount getRelatedUndertakingAmount() {
		return relatedUndertakingAmount;
	}

	public void setRelatedUndertakingAmount(com.tools20022.repository.entity.UndertakingAmount relatedUndertakingAmount) {
		this.relatedUndertakingAmount = relatedUndertakingAmount;
	}

	public DebitCreditFacility getRelatedDebitCreditFacility() {
		return relatedDebitCreditFacility;
	}

	public void setRelatedDebitCreditFacility(com.tools20022.repository.entity.DebitCreditFacility relatedDebitCreditFacility) {
		this.relatedDebitCreditFacility = relatedDebitCreditFacility;
	}

	public SecuritiesSettlement getSecuritiesSettlement() {
		return securitiesSettlement;
	}

	public void setSecuritiesSettlement(com.tools20022.repository.entity.SecuritiesSettlement securitiesSettlement) {
		this.securitiesSettlement = securitiesSettlement;
	}

	public GenericIdentification getInterestName() {
		return interestName;
	}

	public void setInterestName(com.tools20022.repository.entity.GenericIdentification interestName) {
		this.interestName = interestName;
	}

	public AssetHolding getRelatedAssetHolding() {
		return relatedAssetHolding;
	}

	public void setRelatedAssetHolding(com.tools20022.repository.entity.AssetHolding relatedAssetHolding) {
		this.relatedAssetHolding = relatedAssetHolding;
	}

	public Deposit getDeposit() {
		return deposit;
	}

	public void setDeposit(com.tools20022.repository.entity.Deposit deposit) {
		this.deposit = deposit;
	}

	public Balance getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(com.tools20022.repository.entity.Balance accountBalance) {
		this.accountBalance = accountBalance;
	}

	public AccountContract getRelatedAccountContract() {
		return relatedAccountContract;
	}

	public void setRelatedAccountContract(com.tools20022.repository.entity.AccountContract relatedAccountContract) {
		this.relatedAccountContract = relatedAccountContract;
	}

	public NetAssetValueCalculation getRelatedNetAssetValueCalculation() {
		return relatedNetAssetValueCalculation;
	}

	public void setRelatedNetAssetValueCalculation(com.tools20022.repository.entity.NetAssetValueCalculation relatedNetAssetValueCalculation) {
		this.relatedNetAssetValueCalculation = relatedNetAssetValueCalculation;
	}

	public InterestTypeCode getTypeOfInterest() {
		return typeOfInterest;
	}

	public void setTypeOfInterest(InterestTypeCode typeOfInterest) {
		this.typeOfInterest = typeOfInterest;
	}

	public PaymentCard getRelatedPaymentCard() {
		return relatedPaymentCard;
	}

	public void setRelatedPaymentCard(com.tools20022.repository.entity.PaymentCard relatedPaymentCard) {
		this.relatedPaymentCard = relatedPaymentCard;
	}
}