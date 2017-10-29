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
import com.tools20022.repository.choice.ChargeType3Choice;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.Adjustment;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#ChargeType
 * Charges.ChargeType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#CalculationBasis
 * Charges.CalculationBasis}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#BearerType
 * Charges.BearerType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#ChargesDebitAccount
 * Charges.ChargesDebitAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#CashEntry
 * Charges.CashEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Charges#CreditDebitIndicator
 * Charges.CreditDebitIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#MaximumAmount
 * Charges.MaximumAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Charges#InvestmentFundTransaction
 * Charges.InvestmentFundTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Charges#LogisticsChargeLineItem
 * Charges.LogisticsChargeLineItem}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#Transport
 * Charges.Transport}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#Services
 * Charges.Services}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#RelatedUndertaking
 * Charges.RelatedUndertaking}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#LineItem
 * Charges.LineItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Charges#NetPriceChargeLineItem
 * Charges.NetPriceChargeLineItem}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#BaseAmount
 * Charges.BaseAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#MaximumRate
 * Charges.MaximumRate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#MinimumRate
 * Charges.MinimumRate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#MinimumAmount
 * Charges.MinimumAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#RelatedInterest
 * Charges.RelatedInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#ChargePaymentMethod
 * Charges.ChargePaymentMethod}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CashAccount#Charges
 * CashAccount.Charges}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountService#AccountAdministrationCharge
 * AccountService.AccountAdministrationCharge}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashEntry#Charges
 * CashEntry.Charges}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#TransactionCharge
 * InvestmentFundTransaction.TransactionCharge}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InterestCalculation#Charges
 * InterestCalculation.Charges}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Undertaking#Charges
 * Undertaking.Charges}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LineItem#LogisticsCharge
 * LineItem.LogisticsCharge}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LineItem#Charges
 * LineItem.Charges}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LineItem#NetPriceCharge
 * LineItem.NetPriceCharge}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Transport#TransportCharges
 * Transport.TransportCharges}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Charges3#Record
 * Charges3.Record}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ChargesRecord2#ChargeIncludedIndicator
 * ChargesRecord2.ChargeIncludedIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Charges4#Record
 * Charges4.Record}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#ChargesInformation
 * CreditTransferTransaction25.ChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#ChargesInformation
 * DirectDebitTransactionInformation21.ChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction80#ChargesInformation
 * PaymentTransaction80.ChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction81#ChargesInformation
 * PaymentTransaction81.ChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction76#ChargesInformation
 * PaymentTransaction76.ChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction83#ChargesInformation
 * PaymentTransaction83.ChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction82#ChargesInformation
 * PaymentTransaction82.ChargesInformation}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Adjustment
 * Adjustment}</li>
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
	/**
	 * Type of service for which a charge is asked or paid.
	 * <p>
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
	 * <li>{@linkplain com.tools20022.repository.choice.ChargeType3Choice#Code
	 * ChargeType3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ChargeType3Choice#Proprietary
	 * ChargeType3Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesRecord1#Type
	 * ChargesRecord1.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesRecord2#Type
	 * ChargesRecord2.Type}</li>
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
	public static final MMBusinessAttribute ChargeType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ChargeType3Choice.Code, com.tools20022.repository.choice.ChargeType3Choice.Proprietary, com.tools20022.repository.msg.ChargesRecord1.Type,
					com.tools20022.repository.msg.ChargesRecord2.Type);
			elementContext_lazy = () -> Charges.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ChargeType";
			definition = "Type of service for which a charge is asked or paid.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ChargeTypeCode.mmObject();
		}
	};
	/**
	 * Calculation basis for the charge or fee.
	 * <p>
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
	public static final MMBusinessAttribute CalculationBasis = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Charges.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CalculationBasis";
			definition = "Calculation basis for the charge or fee.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CalculationBasisCode.mmObject();
		}
	};
	/**
	 * Specifies which party/parties will bear the charges associated with the
	 * processing of the payment transaction.
	 * <p>
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
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesRecord1#Bearer
	 * ChargesRecord1.Bearer}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesRecord2#Bearer
	 * ChargesRecord2.Bearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#ChargeBearer
	 * CreditTransferTransaction25.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#ChargeBearer
	 * CreditTransferTransaction26.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction22#ChargeBearer
	 * CreditTransferTransaction22.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction21#ChargeBearer
	 * PaymentInstruction21.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#ChargeBearer
	 * DirectDebitTransactionInformation21.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction81#ChargeBearer
	 * PaymentTransaction81.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification6#ChargeBearer
	 * RequestedModification6.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction23#ChargeBearer
	 * PaymentInstruction23.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction76#ChargeBearer
	 * PaymentTransaction76.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22#ChargeBearer
	 * PaymentInstruction22.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction77#ChargeBearer
	 * PaymentTransaction77.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation22#ChargeBearer
	 * DirectDebitTransactionInformation22.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#ChargeBearer
	 * PaymentComplementaryInformation6.ChargeBearer}</li>
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
	public static final MMBusinessAttribute BearerType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ChargesRecord1.Bearer, com.tools20022.repository.msg.ChargesRecord2.Bearer, com.tools20022.repository.msg.CreditTransferTransaction25.ChargeBearer,
					com.tools20022.repository.msg.CreditTransferTransaction26.ChargeBearer, com.tools20022.repository.msg.CreditTransferTransaction22.ChargeBearer, com.tools20022.repository.msg.PaymentInstruction21.ChargeBearer,
					com.tools20022.repository.msg.DirectDebitTransactionInformation21.ChargeBearer, com.tools20022.repository.msg.PaymentTransaction81.ChargeBearer, com.tools20022.repository.msg.RequestedModification6.ChargeBearer,
					com.tools20022.repository.msg.PaymentInstruction23.ChargeBearer, com.tools20022.repository.msg.PaymentTransaction76.ChargeBearer, com.tools20022.repository.msg.PaymentInstruction22.ChargeBearer,
					com.tools20022.repository.msg.PaymentTransaction77.ChargeBearer, com.tools20022.repository.msg.DirectDebitTransactionInformation22.ChargeBearer,
					com.tools20022.repository.msg.PaymentComplementaryInformation6.ChargeBearer);
			elementContext_lazy = () -> Charges.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BearerType";
			definition = "Specifies which party/parties will bear the charges associated with the processing of the payment transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ChargeBearerTypeCode.mmObject();
		}
	};
	/**
	 * Account from which a charge is debited.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#Charges
	 * CashAccount.Charges}</li>
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
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction21#ChargesAccount
	 * PaymentInstruction21.ChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22#ChargesAccount
	 * PaymentInstruction22.ChargesAccount}</li>
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
	public static final MMBusinessAssociationEnd ChargesDebitAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentInstruction21.ChargesAccount, com.tools20022.repository.msg.PaymentInstruction22.ChargesAccount);
			elementContext_lazy = () -> Charges.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ChargesDebitAccount";
			definition = "Account from which a charge is debited.";
			minOccurs = 0;
			type_lazy = () -> CashAccount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.Charges;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Entry which contains the charges.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#Charges
	 * CashEntry.Charges}</li>
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
	public static final MMBusinessAssociationEnd CashEntry = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Charges.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashEntry";
			definition = "Entry which contains the charges.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CashEntry.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashEntry.Charges;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates whether a charge is a credit or a debit.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.ChargesRecord1#CreditDebitIndicator
	 * ChargesRecord1.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ChargesRecord2#CreditDebitIndicator
	 * ChargesRecord2.CreditDebitIndicator}</li>
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
	public static final MMBusinessAttribute CreditDebitIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ChargesRecord1.CreditDebitIndicator, com.tools20022.repository.msg.ChargesRecord2.CreditDebitIndicator);
			elementContext_lazy = () -> Charges.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates whether a charge is a credit or a debit.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DebitCreditCode.mmObject();
		}
	};
	/**
	 * Maximum amount of money asked or paid for the charge for example
	 * depending on the type of investors.
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
	public static final MMBusinessAttribute MaximumAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Charges.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumAmount";
			definition = "Maximum amount of money asked or paid for the charge for example depending on the type of investors.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Investment fund transaction for which charges are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#TransactionCharge
	 * InvestmentFundTransaction.TransactionCharge}</li>
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
	public static final MMBusinessAssociationEnd InvestmentFundTransaction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Charges.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundTransaction";
			definition = "Investment fund transaction for which charges are specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.TransactionCharge;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the line item to which the logistics charge applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LineItem#LogisticsCharge
	 * LineItem.LogisticsCharge}</li>
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
	public static final MMBusinessAssociationEnd LogisticsChargeLineItem = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Charges.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LogisticsChargeLineItem";
			definition = "Specifies the line item to which the logistics charge applies.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.LineItem.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.LineItem.LogisticsCharge;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the transport process to which the charges apply.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Transport#TransportCharges
	 * Transport.TransportCharges}</li>
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
	public static final MMBusinessAssociationEnd Transport = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Charges.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Transport";
			definition = "Specifies the transport process to which the charges apply.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Transport.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Transport.TransportCharges;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Account services for which account administration charges are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountService#AccountAdministrationCharge
	 * AccountService.AccountAdministrationCharge}</li>
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
	public static final MMBusinessAssociationEnd Services = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Charges.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Services";
			definition = "Account services for which account administration charges are specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> AccountService.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AccountService.AccountAdministrationCharge;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Undertaking for which charges are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking#Charges
	 * Undertaking.Charges}</li>
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
	public static final MMBusinessAssociationEnd RelatedUndertaking = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Charges.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedUndertaking";
			definition = "Undertaking for which charges are specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Undertaking.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Undertaking.Charges;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Line item for which charges are specified
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LineItem#Charges
	 * LineItem.Charges}</li>
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
	public static final MMBusinessAssociationEnd LineItem = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Charges.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LineItem";
			definition = "Line item for which charges are specified";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.LineItem.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.LineItem.Charges;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the line item to which the net price charge applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LineItem#NetPriceCharge
	 * LineItem.NetPriceCharge}</li>
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
	public static final MMBusinessAssociationEnd NetPriceChargeLineItem = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Charges.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetPriceChargeLineItem";
			definition = "Specifies the line item to which the net price charge applies.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.LineItem.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.LineItem.NetPriceCharge;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Amount on which the charges are calculated.
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
	public static final MMBusinessAttribute BaseAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Charges.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BaseAmount";
			definition = "Amount on which the charges are calculated.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Maximum rate used to calculate the amount of the charge or fee for
	 * example depending on the type of investors.
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
	public static final MMBusinessAttribute MaximumRate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Charges.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumRate";
			definition = "Maximum rate used to calculate the amount of the charge or fee for example depending on the type of investors.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Minimum rate used to calculate the amount of the charge or fee for
	 * example depending on the type of investors.
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
	public static final MMBusinessAttribute MinimumRate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Charges.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumRate";
			definition = "Minimum rate used to calculate the amount of the charge or fee for example depending on the type of investors.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Minimum amount of money asked or paid for the charge for example
	 * depending on the type of investors.
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
	public static final MMBusinessAttribute MinimumAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Charges.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumAmount";
			definition = "Minimum amount of money asked or paid for the charge for example depending on the type of investors.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Interest on which charges are applied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#Charges
	 * InterestCalculation.Charges}</li>
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
	public static final MMBusinessAssociationEnd RelatedInterest = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Charges.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInterest";
			definition = "Interest on which charges are applied.";
			minOccurs = 0;
			type_lazy = () -> InterestCalculation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InterestCalculation.Charges;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies how charges are paid.
	 * <p>
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
	public static final MMBusinessAttribute ChargePaymentMethod = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Charges.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ChargePaymentMethod";
			definition = "Specifies how charges are paid.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ChargePaymentMethodCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Charges";
				definition = "Amount of money associated with a service.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccount.Charges, com.tools20022.repository.entity.AccountService.AccountAdministrationCharge,
						com.tools20022.repository.entity.CashEntry.Charges, com.tools20022.repository.entity.InvestmentFundTransaction.TransactionCharge, com.tools20022.repository.entity.InterestCalculation.Charges,
						com.tools20022.repository.entity.Undertaking.Charges, com.tools20022.repository.entity.LineItem.LogisticsCharge, com.tools20022.repository.entity.LineItem.Charges,
						com.tools20022.repository.entity.LineItem.NetPriceCharge, com.tools20022.repository.entity.Transport.TransportCharges);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Charges3.Record, com.tools20022.repository.msg.ChargesRecord2.ChargeIncludedIndicator, com.tools20022.repository.msg.Charges4.Record,
						com.tools20022.repository.msg.CreditTransferTransaction25.ChargesInformation, com.tools20022.repository.msg.DirectDebitTransactionInformation21.ChargesInformation,
						com.tools20022.repository.msg.PaymentTransaction80.ChargesInformation, com.tools20022.repository.msg.PaymentTransaction81.ChargesInformation, com.tools20022.repository.msg.PaymentTransaction76.ChargesInformation,
						com.tools20022.repository.msg.PaymentTransaction83.ChargesInformation, com.tools20022.repository.msg.PaymentTransaction82.ChargesInformation);
				subType_lazy = () -> Arrays.asList(SecuritiesRelatedFees.mmObject(), CorporateActionFeesAndCharges.mmObject());
				superType_lazy = () -> Adjustment.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Charges.ChargeType, com.tools20022.repository.entity.Charges.CalculationBasis, com.tools20022.repository.entity.Charges.BearerType,
						com.tools20022.repository.entity.Charges.ChargesDebitAccount, com.tools20022.repository.entity.Charges.CashEntry, com.tools20022.repository.entity.Charges.CreditDebitIndicator,
						com.tools20022.repository.entity.Charges.MaximumAmount, com.tools20022.repository.entity.Charges.InvestmentFundTransaction, com.tools20022.repository.entity.Charges.LogisticsChargeLineItem,
						com.tools20022.repository.entity.Charges.Transport, com.tools20022.repository.entity.Charges.Services, com.tools20022.repository.entity.Charges.RelatedUndertaking, com.tools20022.repository.entity.Charges.LineItem,
						com.tools20022.repository.entity.Charges.NetPriceChargeLineItem, com.tools20022.repository.entity.Charges.BaseAmount, com.tools20022.repository.entity.Charges.MaximumRate,
						com.tools20022.repository.entity.Charges.MinimumRate, com.tools20022.repository.entity.Charges.MinimumAmount, com.tools20022.repository.entity.Charges.RelatedInterest,
						com.tools20022.repository.entity.Charges.ChargePaymentMethod);
				derivationComponent_lazy = () -> Arrays.asList(ChargeType3Choice.mmObject(), ChargesRecord1.mmObject(), Charges3.mmObject(), ChargesRecord2.mmObject(), Charges4.mmObject(), Charges2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}