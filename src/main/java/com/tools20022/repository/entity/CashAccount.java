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
import com.tools20022.repository.choice.CashAccountType2Choice;
import com.tools20022.repository.codeset.AccountLevelCode;
import com.tools20022.repository.codeset.CashAccountTypeCode;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.entity.Account;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Account to or from which a cash entry is made.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CashAccount" src="doc-files/CashAccount.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CashAccount#CashAccountType
 * CashAccount.CashAccountType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#RelatedInvestmentAccount
 * CashAccount.RelatedInvestmentAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashAccount#CashEntry
 * CashAccount.CashEntry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashAccount#CashBalance
 * CashAccount.CashBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#PaymentPartyRole
 * CashAccount.PaymentPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#RelatedCreditStandingOrder
 * CashAccount.RelatedCreditStandingOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#RelatedDebitStandingOrder
 * CashAccount.RelatedDebitStandingOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#CashAccountContract
 * CashAccount.CashAccountContract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#RelatedCorporateActionElection
 * CashAccount.RelatedCorporateActionElection}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashAccount#Charges
 * CashAccount.Charges}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashAccount#Tax
 * CashAccount.Tax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#RelatedSettlementInstruction
 * CashAccount.RelatedSettlementInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#CashSettlementPartyRole
 * CashAccount.CashSettlementPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashAccount#UltimateObligor
 * CashAccount.UltimateObligor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#RelatedPaymentCard
 * CashAccount.RelatedPaymentCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#SecuritiesPartyRole
 * CashAccount.SecuritiesPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#RelatedInvoiceFinancingPartyRole
 * CashAccount.RelatedInvoiceFinancingPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#RelatedCommercialTrade
 * CashAccount.RelatedCommercialTrade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashAccount#Level
 * CashAccount.Level}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#SettlementCurrency
 * CashAccount.SettlementCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#ReportedMovements
 * CashAccount.ReportedMovements}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#ClosedAccountContract
 * CashAccount.ClosedAccountContract}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashAccount#AccountLink
 * CashAccount.AccountLink}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#CashStandingOrder
 * CashAccount.CashStandingOrder}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashAccount#Cheque
 * CashAccount.Cheque}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#CashAccountService
 * CashAccount.CashAccountService}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashAccount#Payment
 * CashAccount.Payment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashAccount#Commission
 * CashAccount.Commission}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#CashAccount
 * InvestmentAccount.CashAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#TaxAccount
 * Tax.TaxAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Commission#Account
 * Commission.Account}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#Account
 * Payment.Account}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#RelatedAccount
 * PaymentCard.RelatedAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashEntry#CashAccount
 * CashEntry.CashAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Cheque#CashAccount
 * Cheque.CashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlement#SettlementAccount
 * CashSettlement.SettlementAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#CashAccount
 * PaymentPartyRole.CashAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashBalance#CashAccount
 * CashBalance.CashAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.StandingOrder#CreditAccount
 * StandingOrder.CreditAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.StandingOrder#DebitAccount
 * StandingOrder.DebitAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashStandingOrder#CashAccount
 * CashStandingOrder.CashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPartyRole#CashAccount
 * SecuritiesPartyRole.CashAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#ChargesDebitAccount
 * Charges.ChargesDebitAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccountContract#CashAccount
 * CashAccountContract.CashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccountContract#TransferCashAccount
 * CashAccountContract.TransferCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccountService#CashAccount
 * CashAccountService.CashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlementInstructionPartyRole#CashAccount
 * CashSettlementInstructionPartyRole.CashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionElection#CashAccount
 * CorporateActionElection.CashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountReportedMovement#ReportedCashAccount
 * AccountReportedMovement.ReportedCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UndertakingUltimateObligor#CashAccount
 * UndertakingUltimateObligor.CashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingPartyRole#CashAccount
 * InvoiceFinancingPartyRole.CashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommercialTrade#PurchaseAccount
 * CommercialTrade.PurchaseAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AccountLink#CashAccount
 * AccountLink.CashAccount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount5#Type
 * CustomerAccount5.Type}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1#Type
 * CustomerAccountModification1.Type}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount4#Type
 * CustomerAccount4.Type}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndParties1#Identification
 * AccountAndParties1.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountStatement6#RelatedAccount
 * AccountStatement6.RelatedAccount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountReport19#RelatedAccount
 * AccountReport19.RelatedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#CashAccount
 * CashAccountCharacteristics2.CashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ParentCashAccount2#Identification
 * ParentCashAccount2.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference8#RelatedAccount
 * OriginalNotificationReference8.RelatedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalItemReference4#RelatedAccount
 * OriginalItemReference4.RelatedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference7#RelatedAccount
 * OriginalNotificationReference7.RelatedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NotificationItem6#RelatedAccount
 * NotificationItem6.RelatedAccount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Account Account}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.CashAccountType2Choice
 * CashAccountType2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccount24 CashAccount24}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccount25 CashAccount25}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountForAction1
 * AccountForAction1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountForAction2
 * AccountForAction2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount5
 * CustomerAccount5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PurposeModification1
 * PurposeModification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccountModification1
 * CustomerAccountModification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount4
 * CustomerAccount4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndParties1
 * AccountAndParties1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2
 * CashAccountCharacteristics2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ParentCashAccount2
 * ParentCashAccount2}</li>
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
 * "CashAccount"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Account to or from which a cash entry is made."</li>
 * </ul>
 */
public class CashAccount extends Account {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the nature, or use, of the cash account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode
	 * CashAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CashAccountType2Choice#Code
	 * CashAccountType2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CashAccountType2Choice#Proprietary
	 * CashAccountType2Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount24#Type
	 * CashAccount24.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount25#Type
	 * CashAccount25.Type}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccountType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the nature, or use, of the cash account."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CashAccountType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CashAccountType2Choice.Code, com.tools20022.repository.choice.CashAccountType2Choice.Proprietary, com.tools20022.repository.msg.CashAccount24.Type,
					com.tools20022.repository.msg.CashAccount25.Type);
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashAccountType";
			definition = "Specifies the nature, or use, of the cash account.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CashAccountTypeCode.mmObject();
		}
	};
	/**
	 * Investment account for which a cash branch is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#CashAccount
	 * InvestmentAccount.CashAccount}</li>
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
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedInvestmentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Investment account for which a cash branch is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedInvestmentAccount = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestmentAccount";
			definition = "Investment account for which a cash branch is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> InvestmentAccount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.CashAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Record of the cash movements into or out of a cash account. It is derived
	 * from the association between Account and Entry.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#CashAccount
	 * CashEntry.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashEntry CashEntry}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportingRequest3#RequestedTransactionType
	 * ReportingRequest3.RequestedTransactionType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Record of the cash movements into or out of a cash account. It is derived from the association between Account and Entry."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CashEntry = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ReportingRequest3.RequestedTransactionType);
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashEntry";
			definition = "Record of the cash movements into or out of a cash account. It is derived from the association between Account and Entry.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.CashEntry.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashEntry.CashAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Overall position representing the net debits and credits in an account at
	 * a specific point in time. It is derived from the association between
	 * Account and Balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashBalance#CashAccount
	 * CashBalance.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashBalance
	 * CashBalance}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.BillingStatement2#Balance
	 * BillingStatement2.Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingStatement2#BalanceAdjustment
	 * BillingStatement2.BalanceAdjustment}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Overall position representing the net debits and credits in an account at a specific point in time. It is derived from the association between Account and Balance."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CashBalance = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BillingStatement2.Balance, com.tools20022.repository.msg.BillingStatement2.BalanceAdjustment);
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashBalance";
			definition = "Overall position representing the net debits and credits in an account at a specific point in time. It is derived from the association between Account and Balance.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.CashBalance.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashBalance.CashAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies each role linked to a payment and using a specific cash account
	 * in the payment context.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#CashAccount
	 * PaymentPartyRole.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentPartyRole
	 * PaymentPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentPartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies each role linked to a payment and using a specific cash account in the payment context. "
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PaymentPartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentPartyRole";
			definition = "Specifies each role linked to a payment and using a specific cash account in the payment context. ";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.PaymentPartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentPartyRole.CashAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Instruction given by an account holder to an account servicer to make
	 * regular transfers on given dates to the same beneficiary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.StandingOrder#CreditAccount
	 * StandingOrder.CreditAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.StandingOrder
	 * StandingOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCreditStandingOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction given by an account holder to an account servicer to make regular transfers on given dates to the same beneficiary."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedCreditStandingOrder = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedCreditStandingOrder";
			definition = "Instruction given by an account holder to an account servicer to make regular transfers on given dates to the same beneficiary.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> StandingOrder.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.StandingOrder.CreditAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Instruction given by an account holder to an account servicer to make
	 * regular transfers on given dates to the same beneficiary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.StandingOrder#DebitAccount
	 * StandingOrder.DebitAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.StandingOrder
	 * StandingOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedDebitStandingOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction given by an account holder to an account servicer to make regular transfers on given dates to the same beneficiary."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedDebitStandingOrder = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedDebitStandingOrder";
			definition = "Instruction given by an account holder to an account servicer to make regular transfers on given dates to the same beneficiary.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> StandingOrder.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.StandingOrder.DebitAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Contract which manages the account. It is derived from the relation
	 * between AccountContract and Account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountContract#CashAccount
	 * CashAccountContract.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccountContract
	 * CashAccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccountContract"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contract which manages the account. It is derived from the relation between AccountContract and Account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CashAccountContract = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashAccountContract";
			definition = "Contract which manages the account. It is derived from the relation between AccountContract and Account.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.CashAccountContract.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccountContract.CashAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Election process which uses specific cash accounts.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionElection#CashAccount
	 * CorporateActionElection.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionElection
	 * CorporateActionElection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCorporateActionElection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Election process which uses specific cash accounts."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedCorporateActionElection = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCorporateActionElection";
			definition = "Election process which uses specific cash accounts.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionElection.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionElection.CashAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the charges which are debited from the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Charges#ChargesDebitAccount
	 * Charges.ChargesDebitAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Charges Charges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Charges"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the charges which are debited from the account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Charges = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Charges";
			definition = "Specifies the charges which are debited from the account.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Charges.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Charges.ChargesDebitAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Tax charged on a cash account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Tax#TaxAccount
	 * Tax.TaxAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#Tax
	 * CashAccountCharacteristics2.Tax}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax charged on a cash account."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Tax = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashAccountCharacteristics2.Tax);
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Tax";
			definition = "Tax charged on a cash account.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Tax.TaxAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Settlement process which uses specific cash accounts.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement#SettlementAccount
	 * CashSettlement.SettlementAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashSettlement
	 * CashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedSettlementInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement process which uses specific cash accounts."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedSettlementInstruction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedSettlementInstruction";
			definition = "Settlement process which uses specific cash accounts.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CashSettlement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashSettlement.SettlementAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies each role linked to a payment settlement and using a specific
	 * cash account in the payment context.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlementInstructionPartyRole#CashAccount
	 * CashSettlementInstructionPartyRole.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlementInstructionPartyRole
	 * CashSettlementInstructionPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashSettlementPartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies each role linked to a payment settlement and using a specific cash account in the payment context. "
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CashSettlementPartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashSettlementPartyRole";
			definition = "Specifies each role linked to a payment settlement and using a specific cash account in the payment context. ";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CashSettlementInstructionPartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashSettlementInstructionPartyRole.CashAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Party for which different types of cash accounts are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingUltimateObligor#CashAccount
	 * UndertakingUltimateObligor.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingUltimateObligor
	 * UndertakingUltimateObligor}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateObligor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party for which different types of cash accounts are specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd UltimateObligor = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UltimateObligor";
			definition = "Party for which different types of cash accounts are specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> UndertakingUltimateObligor.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.UndertakingUltimateObligor.CashAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Payment card for which an account is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard#RelatedAccount
	 * PaymentCard.RelatedAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentCard
	 * PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPaymentCard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment card for which an account is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedPaymentCard = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPaymentCard";
			definition = "Payment card for which an account is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> PaymentCard.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentCard.RelatedAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the role which uses a cash account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPartyRole#CashAccount
	 * SecuritiesPartyRole.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPartyRole
	 * SecuritiesPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesPartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the role which uses a cash account."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesPartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesPartyRole";
			definition = "Specifies the role which uses a cash account.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPartyRole.CashAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies each role using a specific account in the context of invoice
	 * financing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingPartyRole#CashAccount
	 * InvoiceFinancingPartyRole.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingPartyRole
	 * InvoiceFinancingPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedInvoiceFinancingPartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies each role using a specific account in the context of invoice financing."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedInvoiceFinancingPartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInvoiceFinancingPartyRole";
			definition = "Specifies each role using a specific account in the context of invoice financing.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> InvoiceFinancingPartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvoiceFinancingPartyRole.CashAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Commercial trade for which a purchase account is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTrade#PurchaseAccount
	 * CommercialTrade.PurchaseAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CommercialTrade
	 * CommercialTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCommercialTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Commercial trade for which a purchase account is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedCommercialTrade = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCommercialTrade";
			definition = "Commercial trade for which a purchase account is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CommercialTrade.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CommercialTrade.PurchaseAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Defines the level of an account within the account hierarchy.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AccountLevelCode
	 * AccountLevelCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#AccountLevel
	 * CashAccountCharacteristics2.AccountLevel}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ParentCashAccount2#Level
	 * ParentCashAccount2.Level}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Level"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the level of an account within the account hierarchy."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Level = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashAccountCharacteristics2.AccountLevel, com.tools20022.repository.msg.ParentCashAccount2.Level);
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Level";
			definition = "Defines the level of an account within the account hierarchy.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> AccountLevelCode.mmObject();
		}
	};
	/**
	 * Specifies the currency used for settlement, if different from the account
	 * currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#SettlementCurrencyCode
	 * CashAccountCharacteristics2.SettlementCurrencyCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the currency used for settlement, if different from the account currency."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SettlementCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashAccountCharacteristics2.SettlementCurrencyCode);
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementCurrency";
			definition = "Specifies the currency used for settlement, if different from the account currency.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Provides statistical information on the number of movements and their
	 * value for a particular account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountReportedMovement#ReportedCashAccount
	 * AccountReportedMovement.ReportedCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.AccountReportedMovement
	 * AccountReportedMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportedMovements"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides statistical information on the number of movements and their value for a particular account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ReportedMovements = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReportedMovements";
			definition = "Provides statistical information on the number of movements and their value for a particular account.";
			minOccurs = 0;
			type_lazy = () -> AccountReportedMovement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AccountReportedMovement.ReportedCashAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Contract which specifies the cash account to/from which the balance of a
	 * closed account must be transferred.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountContract#TransferCashAccount
	 * CashAccountContract.TransferCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccountContract
	 * CashAccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosedAccountContract"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contract which specifies the cash account to/from which the balance of a closed account must be transferred."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ClosedAccountContract = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClosedAccountContract";
			definition = "Contract which specifies the cash account to/from which the balance of a closed account must be transferred.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CashAccountContract.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccountContract.TransferCashAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Defines the link between a cash account and a securities account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountLink#CashAccount
	 * AccountLink.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AccountLink
	 * AccountLink}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountLink"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the link between a cash account and a securities account."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd AccountLink = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccountLink";
			definition = "Defines the link between a cash account and a securities account.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.AccountLink.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AccountLink.CashAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Standing order which applies on a specific account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashStandingOrder#CashAccount
	 * CashStandingOrder.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashStandingOrder
	 * CashStandingOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashStandingOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Standing order which applies on a specific account."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CashStandingOrder = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashStandingOrder";
			definition = "Standing order which applies on a specific account.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CashStandingOrder.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashStandingOrder.CashAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Cheques drawn on a cash account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Cheque#CashAccount
	 * Cheque.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Cheque Cheque}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cheque"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cheques drawn on a cash account."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Cheque = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Cheque";
			definition = "Cheques drawn on a cash account.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Cheque.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Cheque.CashAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Services linked to the cash account and specified in the cash account
	 * contract. It is derived from the association between Account and
	 * AccountService.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountService#CashAccount
	 * CashAccountService.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccountService
	 * CashAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccountService"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Services linked to the cash account and specified in the cash account contract. It is derived from the association between Account and AccountService."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CashAccountService = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccountService";
			definition = "Services linked to the cash account and specified in the cash account contract. It is derived from the association between Account and AccountService.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CashAccountService.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccountService.CashAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Payment for which an account is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Payment#Account
	 * Payment.Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Payment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment for which an account is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Payment = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Payment";
			definition = "Payment for which an account is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.Account;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Amount of money due to a party as compensation for a service.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Commission#Account
	 * Commission.Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Commission
	 * Commission}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Commission"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money due to a party as compensation for a service."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Commission = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Commission";
			definition = "Amount of money due to a party as compensation for a service.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Commission.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Commission.Account;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CashAccount";
				definition = "Account to or from which a cash entry is made.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentAccount.CashAccount, com.tools20022.repository.entity.Tax.TaxAccount, com.tools20022.repository.entity.Commission.Account,
						com.tools20022.repository.entity.Payment.Account, com.tools20022.repository.entity.PaymentCard.RelatedAccount, com.tools20022.repository.entity.CashEntry.CashAccount,
						com.tools20022.repository.entity.Cheque.CashAccount, com.tools20022.repository.entity.CashSettlement.SettlementAccount, com.tools20022.repository.entity.PaymentPartyRole.CashAccount,
						com.tools20022.repository.entity.CashBalance.CashAccount, com.tools20022.repository.entity.StandingOrder.CreditAccount, com.tools20022.repository.entity.StandingOrder.DebitAccount,
						com.tools20022.repository.entity.CashStandingOrder.CashAccount, com.tools20022.repository.entity.SecuritiesPartyRole.CashAccount, com.tools20022.repository.entity.Charges.ChargesDebitAccount,
						com.tools20022.repository.entity.CashAccountContract.CashAccount, com.tools20022.repository.entity.CashAccountContract.TransferCashAccount, com.tools20022.repository.entity.CashAccountService.CashAccount,
						com.tools20022.repository.entity.CashSettlementInstructionPartyRole.CashAccount, com.tools20022.repository.entity.CorporateActionElection.CashAccount,
						com.tools20022.repository.entity.AccountReportedMovement.ReportedCashAccount, com.tools20022.repository.entity.UndertakingUltimateObligor.CashAccount,
						com.tools20022.repository.entity.InvoiceFinancingPartyRole.CashAccount, com.tools20022.repository.entity.CommercialTrade.PurchaseAccount, com.tools20022.repository.entity.AccountLink.CashAccount);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CustomerAccount5.Type, com.tools20022.repository.msg.CustomerAccountModification1.Type, com.tools20022.repository.msg.CustomerAccount4.Type,
						com.tools20022.repository.msg.AccountAndParties1.Identification, com.tools20022.repository.msg.AccountStatement6.RelatedAccount, com.tools20022.repository.msg.AccountReport19.RelatedAccount,
						com.tools20022.repository.msg.CashAccountCharacteristics2.CashAccount, com.tools20022.repository.msg.ParentCashAccount2.Identification, com.tools20022.repository.msg.OriginalNotificationReference8.RelatedAccount,
						com.tools20022.repository.msg.OriginalItemReference4.RelatedAccount, com.tools20022.repository.msg.OriginalNotificationReference7.RelatedAccount, com.tools20022.repository.msg.NotificationItem6.RelatedAccount);
				superType_lazy = () -> Account.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccount.CashAccountType, com.tools20022.repository.entity.CashAccount.RelatedInvestmentAccount, com.tools20022.repository.entity.CashAccount.CashEntry,
						com.tools20022.repository.entity.CashAccount.CashBalance, com.tools20022.repository.entity.CashAccount.PaymentPartyRole, com.tools20022.repository.entity.CashAccount.RelatedCreditStandingOrder,
						com.tools20022.repository.entity.CashAccount.RelatedDebitStandingOrder, com.tools20022.repository.entity.CashAccount.CashAccountContract, com.tools20022.repository.entity.CashAccount.RelatedCorporateActionElection,
						com.tools20022.repository.entity.CashAccount.Charges, com.tools20022.repository.entity.CashAccount.Tax, com.tools20022.repository.entity.CashAccount.RelatedSettlementInstruction,
						com.tools20022.repository.entity.CashAccount.CashSettlementPartyRole, com.tools20022.repository.entity.CashAccount.UltimateObligor, com.tools20022.repository.entity.CashAccount.RelatedPaymentCard,
						com.tools20022.repository.entity.CashAccount.SecuritiesPartyRole, com.tools20022.repository.entity.CashAccount.RelatedInvoiceFinancingPartyRole, com.tools20022.repository.entity.CashAccount.RelatedCommercialTrade,
						com.tools20022.repository.entity.CashAccount.Level, com.tools20022.repository.entity.CashAccount.SettlementCurrency, com.tools20022.repository.entity.CashAccount.ReportedMovements,
						com.tools20022.repository.entity.CashAccount.ClosedAccountContract, com.tools20022.repository.entity.CashAccount.AccountLink, com.tools20022.repository.entity.CashAccount.CashStandingOrder,
						com.tools20022.repository.entity.CashAccount.Cheque, com.tools20022.repository.entity.CashAccount.CashAccountService, com.tools20022.repository.entity.CashAccount.Payment,
						com.tools20022.repository.entity.CashAccount.Commission);
				derivationComponent_lazy = () -> Arrays.asList(CashAccountType2Choice.mmObject(), CashAccount24.mmObject(), CashAccount25.mmObject(), AccountForAction1.mmObject(), AccountForAction2.mmObject(), CustomerAccount5.mmObject(),
						PurposeModification1.mmObject(), CustomerAccountModification1.mmObject(), CustomerAccount4.mmObject(), AccountAndParties1.mmObject(), CashAccountCharacteristics2.mmObject(), ParentCashAccount2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}