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
import com.tools20022.repository.choice.ChargeType3Choice;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Amount of money associated with a service.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Charges" src="doc-files/Charges.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Adjustment
 * Adjustment}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#mmChargeType
 * Charges.mmChargeType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#mmCalculationBasis
 * Charges.mmCalculationBasis}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#mmBearerType
 * Charges.mmBearerType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Charges#mmChargesDebitAccount
 * Charges.mmChargesDebitAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#mmCashEntry
 * Charges.mmCashEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Charges#mmCreditDebitIndicator
 * Charges.mmCreditDebitIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#mmMaximumAmount
 * Charges.mmMaximumAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Charges#mmInvestmentFundTransaction
 * Charges.mmInvestmentFundTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Charges#mmLogisticsChargeLineItem
 * Charges.mmLogisticsChargeLineItem}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#mmTransport
 * Charges.mmTransport}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#mmServices
 * Charges.mmServices}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Charges#mmRelatedUndertaking
 * Charges.mmRelatedUndertaking}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#mmLineItem
 * Charges.mmLineItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Charges#mmNetPriceChargeLineItem
 * Charges.mmNetPriceChargeLineItem}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#mmBaseAmount
 * Charges.mmBaseAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#mmMaximumRate
 * Charges.mmMaximumRate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#mmMinimumRate
 * Charges.mmMinimumRate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#mmMinimumAmount
 * Charges.mmMinimumAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#mmRelatedInterest
 * Charges.mmRelatedInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Charges#mmChargePaymentMethod
 * Charges.mmChargePaymentMethod}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CashAccount#mmCharges
 * CashAccount.mmCharges}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountService#mmAccountAdministrationCharge
 * AccountService.mmAccountAdministrationCharge}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashEntry#mmCharges
 * CashEntry.mmCharges}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmTransactionCharge
 * InvestmentFundTransaction.mmTransactionCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmCharges
 * InterestCalculation.mmCharges}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Undertaking#mmCharges
 * Undertaking.mmCharges}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LineItem#mmLogisticsCharge
 * LineItem.mmLogisticsCharge}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LineItem#mmCharges
 * LineItem.mmCharges}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LineItem#mmNetPriceCharge
 * LineItem.mmNetPriceCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Transport#mmTransportCharges
 * Transport.mmTransportCharges}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Charges3#mmRecord
 * Charges3.mmRecord}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ChargesRecord2#mmChargeIncludedIndicator
 * ChargesRecord2.mmChargeIncludedIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Charges4#mmRecord
 * Charges4.mmRecord}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#mmChargesInformation
 * DirectDebitTransactionInformation21.mmChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction83#mmChargesInformation
 * PaymentTransaction83.mmChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction87#mmChargesInformation
 * PaymentTransaction87.mmChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction88#mmChargesInformation
 * PaymentTransaction88.mmChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ResolutionInformation2#mmCharges
 * ResolutionInformation2.mmCharges}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction91#mmChargesInformation
 * PaymentTransaction91.mmChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction30#mmChargesInformation
 * CreditTransferTransaction30.mmChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction92#mmChargesInformation
 * PaymentTransaction92.mmChargesInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesRelatedFees
 * SecuritiesRelatedFees}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges
 * CorporateActionFeesAndCharges}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.ChargeType3Choice
 * ChargeType3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ChargesRecord1 ChargesRecord1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Charges3 Charges3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ChargesRecord2 ChargesRecord2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Charges4 Charges4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Charges2 Charges2}</li>
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
 * "Charges"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Amount of money associated with a service."</li>
 * </ul>
 */
public class Charges extends Adjustment {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ChargeTypeCode chargeType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode
	 * ChargeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ChargeType3Choice#mmCode
	 * ChargeType3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ChargeType3Choice#mmProprietary
	 * ChargeType3Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesRecord1#mmType
	 * ChargesRecord1.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesRecord2#mmType
	 * ChargesRecord2.mmType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Charges
	 * Charges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of service for which a charge is asked or paid."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Charges, ChargeTypeCode> mmChargeType = new MMBusinessAttribute<Charges, ChargeTypeCode>() {
		{
			derivation_lazy = () -> Arrays.asList(ChargeType3Choice.mmCode, ChargeType3Choice.mmProprietary, ChargesRecord1.mmType, ChargesRecord2.mmType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Charges.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ChargeType";
			definition = "Type of service for which a charge is asked or paid.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ChargeTypeCode.mmObject();
		}

		@Override
		public ChargeTypeCode getValue(Charges obj) {
			return obj.getChargeType();
		}

		@Override
		public void setValue(Charges obj, ChargeTypeCode value) {
			obj.setChargeType(value);
		}
	};
	protected CalculationBasisCode calculationBasis;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationBasisCode
	 * CalculationBasisCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Charges
	 * Charges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalculationBasis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Calculation basis for the charge or fee."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Charges, CalculationBasisCode> mmCalculationBasis = new MMBusinessAttribute<Charges, CalculationBasisCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Charges.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CalculationBasis";
			definition = "Calculation basis for the charge or fee.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CalculationBasisCode.mmObject();
		}

		@Override
		public CalculationBasisCode getValue(Charges obj) {
			return obj.getCalculationBasis();
		}

		@Override
		public void setValue(Charges obj, CalculationBasisCode value) {
			obj.setCalculationBasis(value);
		}
	};
	protected ChargeBearerTypeCode bearerType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeBearerTypeCode
	 * ChargeBearerTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesRecord1#mmBearer
	 * ChargesRecord1.mmBearer}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesRecord2#mmBearer
	 * ChargesRecord2.mmBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#mmChargeBearer
	 * CreditTransferTransaction26.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction22#mmChargeBearer
	 * CreditTransferTransaction22.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction21#mmChargeBearer
	 * PaymentInstruction21.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#mmChargeBearer
	 * DirectDebitTransactionInformation21.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction23#mmChargeBearer
	 * PaymentInstruction23.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22#mmChargeBearer
	 * PaymentInstruction22.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation22#mmChargeBearer
	 * DirectDebitTransactionInformation22.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction24#mmChargeBearer
	 * PaymentInstruction24.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction27#mmChargeBearer
	 * CreditTransferTransaction27.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation7#mmChargeBearer
	 * PaymentComplementaryInformation7.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction87#mmChargeBearer
	 * PaymentTransaction87.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction88#mmChargeBearer
	 * PaymentTransaction88.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification7#mmChargeBearer
	 * RequestedModification7.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction30#mmChargeBearer
	 * CreditTransferTransaction30.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction93#mmChargeBearer
	 * PaymentTransaction93.mmChargeBearer}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Charges
	 * Charges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BearerType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies which party/parties will bear the charges associated with the processing of the payment transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Charges, ChargeBearerTypeCode> mmBearerType = new MMBusinessAttribute<Charges, ChargeBearerTypeCode>() {
		{
			derivation_lazy = () -> Arrays.asList(ChargesRecord1.mmBearer, ChargesRecord2.mmBearer, CreditTransferTransaction26.mmChargeBearer, CreditTransferTransaction22.mmChargeBearer, PaymentInstruction21.mmChargeBearer,
					DirectDebitTransactionInformation21.mmChargeBearer, PaymentInstruction23.mmChargeBearer, PaymentInstruction22.mmChargeBearer, DirectDebitTransactionInformation22.mmChargeBearer, PaymentInstruction24.mmChargeBearer,
					CreditTransferTransaction27.mmChargeBearer, PaymentComplementaryInformation7.mmChargeBearer, PaymentTransaction87.mmChargeBearer, PaymentTransaction88.mmChargeBearer, RequestedModification7.mmChargeBearer,
					CreditTransferTransaction30.mmChargeBearer, PaymentTransaction93.mmChargeBearer);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Charges.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BearerType";
			definition = "Specifies which party/parties will bear the charges associated with the processing of the payment transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ChargeBearerTypeCode.mmObject();
		}

		@Override
		public ChargeBearerTypeCode getValue(Charges obj) {
			return obj.getBearerType();
		}

		@Override
		public void setValue(Charges obj, ChargeBearerTypeCode value) {
			obj.setBearerType(value);
		}
	};
	protected List<CashAccount> chargesDebitAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmCharges
	 * CashAccount.mmCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccount
	 * CashAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction21#mmChargesAccount
	 * PaymentInstruction21.mmChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22#mmChargesAccount
	 * PaymentInstruction22.mmChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction24#mmChargesAccount
	 * PaymentInstruction24.mmChargesAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Charges
	 * Charges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargesDebitAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account from which a charge is debited."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Charges, List<CashAccount>> mmChargesDebitAccount = new MMBusinessAssociationEnd<Charges, List<CashAccount>>() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentInstruction21.mmChargesAccount, PaymentInstruction22.mmChargesAccount, PaymentInstruction24.mmChargesAccount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Charges.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ChargesDebitAccount";
			definition = "Account from which a charge is debited.";
			minOccurs = 0;
			opposite_lazy = () -> CashAccount.mmCharges;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CashAccount.mmObject();
		}

		@Override
		public List<CashAccount> getValue(Charges obj) {
			return obj.getChargesDebitAccount();
		}

		@Override
		public void setValue(Charges obj, List<CashAccount> value) {
			obj.setChargesDebitAccount(value);
		}
	};
	protected CashEntry cashEntry;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#mmCharges
	 * CashEntry.mmCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashEntry CashEntry}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Charges
	 * Charges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Entry which contains the charges."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Charges, com.tools20022.repository.entity.CashEntry> mmCashEntry = new MMBusinessAssociationEnd<Charges, com.tools20022.repository.entity.CashEntry>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Charges.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashEntry";
			definition = "Entry which contains the charges.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CashEntry.mmCharges;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashEntry.mmObject();
		}

		@Override
		public com.tools20022.repository.entity.CashEntry getValue(Charges obj) {
			return obj.getCashEntry();
		}

		@Override
		public void setValue(Charges obj, com.tools20022.repository.entity.CashEntry value) {
			obj.setCashEntry(value);
		}
	};
	protected DebitCreditCode creditDebitIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DebitCreditCode
	 * DebitCreditCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ChargesRecord1#mmCreditDebitIndicator
	 * ChargesRecord1.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ChargesRecord2#mmCreditDebitIndicator
	 * ChargesRecord2.mmCreditDebitIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Charges
	 * Charges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether a charge is a credit or a debit."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Charges, DebitCreditCode> mmCreditDebitIndicator = new MMBusinessAttribute<Charges, DebitCreditCode>() {
		{
			derivation_lazy = () -> Arrays.asList(ChargesRecord1.mmCreditDebitIndicator, ChargesRecord2.mmCreditDebitIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Charges.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates whether a charge is a credit or a debit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DebitCreditCode.mmObject();
		}

		@Override
		public DebitCreditCode getValue(Charges obj) {
			return obj.getCreditDebitIndicator();
		}

		@Override
		public void setValue(Charges obj, DebitCreditCode value) {
			obj.setCreditDebitIndicator(value);
		}
	};
	protected CurrencyAndAmount maximumAmount;
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Charges
	 * Charges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum amount of money asked or paid for the charge for example depending on the type of investors."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Charges, CurrencyAndAmount> mmMaximumAmount = new MMBusinessAttribute<Charges, CurrencyAndAmount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Charges.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaximumAmount";
			definition = "Maximum amount of money asked or paid for the charge for example depending on the type of investors.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(Charges obj) {
			return obj.getMaximumAmount();
		}

		@Override
		public void setValue(Charges obj, CurrencyAndAmount value) {
			obj.setMaximumAmount(value);
		}
	};
	protected InvestmentFundTransaction investmentFundTransaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmTransactionCharge
	 * InvestmentFundTransaction.mmTransactionCharge}</li>
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Charges
	 * Charges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentFundTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment fund transaction for which charges are specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Charges, Optional<InvestmentFundTransaction>> mmInvestmentFundTransaction = new MMBusinessAssociationEnd<Charges, Optional<InvestmentFundTransaction>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Charges.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundTransaction";
			definition = "Investment fund transaction for which charges are specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.mmTransactionCharge;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.mmObject();
		}

		@Override
		public Optional<InvestmentFundTransaction> getValue(Charges obj) {
			return obj.getInvestmentFundTransaction();
		}

		@Override
		public void setValue(Charges obj, Optional<InvestmentFundTransaction> value) {
			obj.setInvestmentFundTransaction(value.orElse(null));
		}
	};
	protected LineItem logisticsChargeLineItem;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LineItem#mmLogisticsCharge
	 * LineItem.mmLogisticsCharge}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.LineItem LineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Charges
	 * Charges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LogisticsChargeLineItem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the line item to which the logistics charge applies."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Charges, Optional<LineItem>> mmLogisticsChargeLineItem = new MMBusinessAssociationEnd<Charges, Optional<LineItem>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Charges.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LogisticsChargeLineItem";
			definition = "Specifies the line item to which the logistics charge applies.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.LineItem.mmLogisticsCharge;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.LineItem.mmObject();
		}

		@Override
		public Optional<LineItem> getValue(Charges obj) {
			return obj.getLogisticsChargeLineItem();
		}

		@Override
		public void setValue(Charges obj, Optional<LineItem> value) {
			obj.setLogisticsChargeLineItem(value.orElse(null));
		}
	};
	protected Transport transport;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Transport#mmTransportCharges
	 * Transport.mmTransportCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Transport Transport}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Charges
	 * Charges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Transport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the transport process to which the charges apply."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Charges, Optional<Transport>> mmTransport = new MMBusinessAssociationEnd<Charges, Optional<Transport>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Charges.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Transport";
			definition = "Specifies the transport process to which the charges apply.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Transport.mmTransportCharges;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Transport.mmObject();
		}

		@Override
		public Optional<Transport> getValue(Charges obj) {
			return obj.getTransport();
		}

		@Override
		public void setValue(Charges obj, Optional<Transport> value) {
			obj.setTransport(value.orElse(null));
		}
	};
	protected AccountService services;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountService#mmAccountAdministrationCharge
	 * AccountService.mmAccountAdministrationCharge}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AccountService
	 * AccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Charges
	 * Charges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Services"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account services for which account administration charges are specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Charges, Optional<AccountService>> mmServices = new MMBusinessAssociationEnd<Charges, Optional<AccountService>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Charges.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Services";
			definition = "Account services for which account administration charges are specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> AccountService.mmAccountAdministrationCharge;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> AccountService.mmObject();
		}

		@Override
		public Optional<AccountService> getValue(Charges obj) {
			return obj.getServices();
		}

		@Override
		public void setValue(Charges obj, Optional<AccountService> value) {
			obj.setServices(value.orElse(null));
		}
	};
	protected Undertaking relatedUndertaking;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking#mmCharges
	 * Undertaking.mmCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Undertaking
	 * Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Charges
	 * Charges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedUndertaking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Undertaking for which charges are specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Charges, Undertaking> mmRelatedUndertaking = new MMBusinessAssociationEnd<Charges, Undertaking>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Charges.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedUndertaking";
			definition = "Undertaking for which charges are specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Undertaking.mmCharges;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Undertaking.mmObject();
		}

		@Override
		public Undertaking getValue(Charges obj) {
			return obj.getRelatedUndertaking();
		}

		@Override
		public void setValue(Charges obj, Undertaking value) {
			obj.setRelatedUndertaking(value);
		}
	};
	protected LineItem lineItem;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LineItem#mmCharges
	 * LineItem.mmCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.LineItem LineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Charges
	 * Charges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LineItem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Line item for which charges are specified"</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Charges, com.tools20022.repository.entity.LineItem> mmLineItem = new MMBusinessAssociationEnd<Charges, com.tools20022.repository.entity.LineItem>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Charges.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LineItem";
			definition = "Line item for which charges are specified";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.LineItem.mmCharges;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.LineItem.mmObject();
		}

		@Override
		public com.tools20022.repository.entity.LineItem getValue(Charges obj) {
			return obj.getLineItem();
		}

		@Override
		public void setValue(Charges obj, com.tools20022.repository.entity.LineItem value) {
			obj.setLineItem(value);
		}
	};
	protected LineItem netPriceChargeLineItem;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LineItem#mmNetPriceCharge
	 * LineItem.mmNetPriceCharge}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.LineItem LineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Charges
	 * Charges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetPriceChargeLineItem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the line item to which the net price charge applies."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Charges, Optional<LineItem>> mmNetPriceChargeLineItem = new MMBusinessAssociationEnd<Charges, Optional<LineItem>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Charges.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NetPriceChargeLineItem";
			definition = "Specifies the line item to which the net price charge applies.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.LineItem.mmNetPriceCharge;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.LineItem.mmObject();
		}

		@Override
		public Optional<LineItem> getValue(Charges obj) {
			return obj.getNetPriceChargeLineItem();
		}

		@Override
		public void setValue(Charges obj, Optional<LineItem> value) {
			obj.setNetPriceChargeLineItem(value.orElse(null));
		}
	};
	protected CurrencyAndAmount baseAmount;
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Charges
	 * Charges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BaseAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount on which the charges are calculated."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Charges, CurrencyAndAmount> mmBaseAmount = new MMBusinessAttribute<Charges, CurrencyAndAmount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Charges.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BaseAmount";
			definition = "Amount on which the charges are calculated.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(Charges obj) {
			return obj.getBaseAmount();
		}

		@Override
		public void setValue(Charges obj, CurrencyAndAmount value) {
			obj.setBaseAmount(value);
		}
	};
	protected PercentageRate maximumRate;
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Charges
	 * Charges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum rate used to calculate the amount of the charge or fee for example depending on the type of investors."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Charges, PercentageRate> mmMaximumRate = new MMBusinessAttribute<Charges, PercentageRate>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Charges.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaximumRate";
			definition = "Maximum rate used to calculate the amount of the charge or fee for example depending on the type of investors.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(Charges obj) {
			return obj.getMaximumRate();
		}

		@Override
		public void setValue(Charges obj, PercentageRate value) {
			obj.setMaximumRate(value);
		}
	};
	protected PercentageRate minimumRate;
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Charges
	 * Charges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum rate used to calculate the amount of the charge or fee for example depending on the type of investors."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Charges, PercentageRate> mmMinimumRate = new MMBusinessAttribute<Charges, PercentageRate>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Charges.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumRate";
			definition = "Minimum rate used to calculate the amount of the charge or fee for example depending on the type of investors.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(Charges obj) {
			return obj.getMinimumRate();
		}

		@Override
		public void setValue(Charges obj, PercentageRate value) {
			obj.setMinimumRate(value);
		}
	};
	protected CurrencyAndAmount minimumAmount;
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Charges
	 * Charges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum amount of money asked or paid for the charge for example depending on the type of investors."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Charges, CurrencyAndAmount> mmMinimumAmount = new MMBusinessAttribute<Charges, CurrencyAndAmount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Charges.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumAmount";
			definition = "Minimum amount of money asked or paid for the charge for example depending on the type of investors.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(Charges obj) {
			return obj.getMinimumAmount();
		}

		@Override
		public void setValue(Charges obj, CurrencyAndAmount value) {
			obj.setMinimumAmount(value);
		}
	};
	protected List<InterestCalculation> relatedInterest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmCharges
	 * InterestCalculation.mmCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Charges
	 * Charges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Interest on which charges are applied."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Charges, List<InterestCalculation>> mmRelatedInterest = new MMBusinessAssociationEnd<Charges, List<InterestCalculation>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Charges.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedInterest";
			definition = "Interest on which charges are applied.";
			minOccurs = 0;
			opposite_lazy = () -> InterestCalculation.mmCharges;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> InterestCalculation.mmObject();
		}

		@Override
		public List<InterestCalculation> getValue(Charges obj) {
			return obj.getRelatedInterest();
		}

		@Override
		public void setValue(Charges obj, List<InterestCalculation> value) {
			obj.setRelatedInterest(value);
		}
	};
	protected ChargePaymentMethodCode chargePaymentMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ChargePaymentMethodCode
	 * ChargePaymentMethodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Charges
	 * Charges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargePaymentMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies how charges are paid."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Charges, ChargePaymentMethodCode> mmChargePaymentMethod = new MMBusinessAttribute<Charges, ChargePaymentMethodCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Charges.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ChargePaymentMethod";
			definition = "Specifies how charges are paid.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ChargePaymentMethodCode.mmObject();
		}

		@Override
		public ChargePaymentMethodCode getValue(Charges obj) {
			return obj.getChargePaymentMethod();
		}

		@Override
		public void setValue(Charges obj, ChargePaymentMethodCode value) {
			obj.setChargePaymentMethod(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Charges";
				definition = "Amount of money associated with a service.";
				associationDomain_lazy = () -> Arrays.asList(CashAccount.mmCharges, AccountService.mmAccountAdministrationCharge, com.tools20022.repository.entity.CashEntry.mmCharges,
						com.tools20022.repository.entity.InvestmentFundTransaction.mmTransactionCharge, InterestCalculation.mmCharges, Undertaking.mmCharges, com.tools20022.repository.entity.LineItem.mmLogisticsCharge,
						com.tools20022.repository.entity.LineItem.mmCharges, com.tools20022.repository.entity.LineItem.mmNetPriceCharge, com.tools20022.repository.entity.Transport.mmTransportCharges);
				derivationElement_lazy = () -> Arrays.asList(Charges3.mmRecord, ChargesRecord2.mmChargeIncludedIndicator, Charges4.mmRecord, DirectDebitTransactionInformation21.mmChargesInformation,
						PaymentTransaction83.mmChargesInformation, PaymentTransaction87.mmChargesInformation, PaymentTransaction88.mmChargesInformation, ResolutionInformation2.mmCharges, PaymentTransaction91.mmChargesInformation,
						CreditTransferTransaction30.mmChargesInformation, PaymentTransaction92.mmChargesInformation);
				subType_lazy = () -> Arrays.asList(SecuritiesRelatedFees.mmObject(), CorporateActionFeesAndCharges.mmObject());
				superType_lazy = () -> Adjustment.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Charges.mmChargeType, com.tools20022.repository.entity.Charges.mmCalculationBasis, com.tools20022.repository.entity.Charges.mmBearerType,
						com.tools20022.repository.entity.Charges.mmChargesDebitAccount, com.tools20022.repository.entity.Charges.mmCashEntry, com.tools20022.repository.entity.Charges.mmCreditDebitIndicator,
						com.tools20022.repository.entity.Charges.mmMaximumAmount, com.tools20022.repository.entity.Charges.mmInvestmentFundTransaction, com.tools20022.repository.entity.Charges.mmLogisticsChargeLineItem,
						com.tools20022.repository.entity.Charges.mmTransport, com.tools20022.repository.entity.Charges.mmServices, com.tools20022.repository.entity.Charges.mmRelatedUndertaking,
						com.tools20022.repository.entity.Charges.mmLineItem, com.tools20022.repository.entity.Charges.mmNetPriceChargeLineItem, com.tools20022.repository.entity.Charges.mmBaseAmount,
						com.tools20022.repository.entity.Charges.mmMaximumRate, com.tools20022.repository.entity.Charges.mmMinimumRate, com.tools20022.repository.entity.Charges.mmMinimumAmount,
						com.tools20022.repository.entity.Charges.mmRelatedInterest, com.tools20022.repository.entity.Charges.mmChargePaymentMethod);
				derivationComponent_lazy = () -> Arrays.asList(ChargeType3Choice.mmObject(), ChargesRecord1.mmObject(), Charges3.mmObject(), ChargesRecord2.mmObject(), Charges4.mmObject(), Charges2.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Charges.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ChargeTypeCode getChargeType() {
		return chargeType;
	}

	public Charges setChargeType(ChargeTypeCode chargeType) {
		this.chargeType = Objects.requireNonNull(chargeType);
		return this;
	}

	public CalculationBasisCode getCalculationBasis() {
		return calculationBasis;
	}

	public Charges setCalculationBasis(CalculationBasisCode calculationBasis) {
		this.calculationBasis = Objects.requireNonNull(calculationBasis);
		return this;
	}

	public ChargeBearerTypeCode getBearerType() {
		return bearerType;
	}

	public Charges setBearerType(ChargeBearerTypeCode bearerType) {
		this.bearerType = Objects.requireNonNull(bearerType);
		return this;
	}

	public List<CashAccount> getChargesDebitAccount() {
		return chargesDebitAccount == null ? chargesDebitAccount = new ArrayList<>() : chargesDebitAccount;
	}

	public Charges setChargesDebitAccount(List<CashAccount> chargesDebitAccount) {
		this.chargesDebitAccount = Objects.requireNonNull(chargesDebitAccount);
		return this;
	}

	public CashEntry getCashEntry() {
		return cashEntry;
	}

	public Charges setCashEntry(com.tools20022.repository.entity.CashEntry cashEntry) {
		this.cashEntry = Objects.requireNonNull(cashEntry);
		return this;
	}

	public DebitCreditCode getCreditDebitIndicator() {
		return creditDebitIndicator;
	}

	public Charges setCreditDebitIndicator(DebitCreditCode creditDebitIndicator) {
		this.creditDebitIndicator = Objects.requireNonNull(creditDebitIndicator);
		return this;
	}

	public CurrencyAndAmount getMaximumAmount() {
		return maximumAmount;
	}

	public Charges setMaximumAmount(CurrencyAndAmount maximumAmount) {
		this.maximumAmount = Objects.requireNonNull(maximumAmount);
		return this;
	}

	public Optional<InvestmentFundTransaction> getInvestmentFundTransaction() {
		return investmentFundTransaction == null ? Optional.empty() : Optional.of(investmentFundTransaction);
	}

	public Charges setInvestmentFundTransaction(com.tools20022.repository.entity.InvestmentFundTransaction investmentFundTransaction) {
		this.investmentFundTransaction = investmentFundTransaction;
		return this;
	}

	public Optional<LineItem> getLogisticsChargeLineItem() {
		return logisticsChargeLineItem == null ? Optional.empty() : Optional.of(logisticsChargeLineItem);
	}

	public Charges setLogisticsChargeLineItem(com.tools20022.repository.entity.LineItem logisticsChargeLineItem) {
		this.logisticsChargeLineItem = logisticsChargeLineItem;
		return this;
	}

	public Optional<Transport> getTransport() {
		return transport == null ? Optional.empty() : Optional.of(transport);
	}

	public Charges setTransport(com.tools20022.repository.entity.Transport transport) {
		this.transport = transport;
		return this;
	}

	public Optional<AccountService> getServices() {
		return services == null ? Optional.empty() : Optional.of(services);
	}

	public Charges setServices(AccountService services) {
		this.services = services;
		return this;
	}

	public Undertaking getRelatedUndertaking() {
		return relatedUndertaking;
	}

	public Charges setRelatedUndertaking(Undertaking relatedUndertaking) {
		this.relatedUndertaking = Objects.requireNonNull(relatedUndertaking);
		return this;
	}

	public LineItem getLineItem() {
		return lineItem;
	}

	public Charges setLineItem(com.tools20022.repository.entity.LineItem lineItem) {
		this.lineItem = Objects.requireNonNull(lineItem);
		return this;
	}

	public Optional<LineItem> getNetPriceChargeLineItem() {
		return netPriceChargeLineItem == null ? Optional.empty() : Optional.of(netPriceChargeLineItem);
	}

	public Charges setNetPriceChargeLineItem(com.tools20022.repository.entity.LineItem netPriceChargeLineItem) {
		this.netPriceChargeLineItem = netPriceChargeLineItem;
		return this;
	}

	public CurrencyAndAmount getBaseAmount() {
		return baseAmount;
	}

	public Charges setBaseAmount(CurrencyAndAmount baseAmount) {
		this.baseAmount = Objects.requireNonNull(baseAmount);
		return this;
	}

	public PercentageRate getMaximumRate() {
		return maximumRate;
	}

	public Charges setMaximumRate(PercentageRate maximumRate) {
		this.maximumRate = Objects.requireNonNull(maximumRate);
		return this;
	}

	public PercentageRate getMinimumRate() {
		return minimumRate;
	}

	public Charges setMinimumRate(PercentageRate minimumRate) {
		this.minimumRate = Objects.requireNonNull(minimumRate);
		return this;
	}

	public CurrencyAndAmount getMinimumAmount() {
		return minimumAmount;
	}

	public Charges setMinimumAmount(CurrencyAndAmount minimumAmount) {
		this.minimumAmount = Objects.requireNonNull(minimumAmount);
		return this;
	}

	public List<InterestCalculation> getRelatedInterest() {
		return relatedInterest == null ? relatedInterest = new ArrayList<>() : relatedInterest;
	}

	public Charges setRelatedInterest(List<InterestCalculation> relatedInterest) {
		this.relatedInterest = Objects.requireNonNull(relatedInterest);
		return this;
	}

	public ChargePaymentMethodCode getChargePaymentMethod() {
		return chargePaymentMethod;
	}

	public Charges setChargePaymentMethod(ChargePaymentMethodCode chargePaymentMethod) {
		this.chargePaymentMethod = Objects.requireNonNull(chargePaymentMethod);
		return this;
	}
}