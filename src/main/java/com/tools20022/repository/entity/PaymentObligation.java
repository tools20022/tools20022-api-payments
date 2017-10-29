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
import com.tools20022.repository.choice.Purpose2Choice;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.codeset.PaymentPurposeCode;
import com.tools20022.repository.codeset.RemittanceLocationMethodCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.Obligation;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Obligation for the debtor to pay the creditor an amount of cash.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PaymentObligation" src="doc-files/PaymentObligation.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#PaymentOffset
 * PaymentObligation.PaymentOffset}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentObligation#Purpose
 * PaymentObligation.Purpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#RemittanceDeliveryMethod
 * PaymentObligation.RemittanceDeliveryMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#AssociatedDocument
 * PaymentObligation.AssociatedDocument}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentObligation#Amount
 * PaymentObligation.Amount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#RemittanceLocation
 * PaymentObligation.RemittanceLocation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentObligation#Interest
 * PaymentObligation.Interest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#CommercialTrade
 * PaymentObligation.CommercialTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#Percentage
 * PaymentObligation.Percentage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#MaximumAmount
 * PaymentObligation.MaximumAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#ExpiryDate
 * PaymentObligation.ExpiryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#ApplicableLaw
 * PaymentObligation.ApplicableLaw}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#PaymentSourceBuyIn
 * PaymentObligation.PaymentSourceBuyIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#RelatedCorporateAction
 * PaymentObligation.RelatedCorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#RelatedCollateralMovement
 * PaymentObligation.RelatedCollateralMovement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#PaymentSourceUndertakingDemand
 * PaymentObligation.PaymentSourceUndertakingDemand}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentObligation#PartyRole
 * PaymentObligation.PartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#ExecutedSecuritiesTrade
 * PaymentObligation.ExecutedSecuritiesTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#RelatedAccountClosingTerms
 * PaymentObligation.RelatedAccountClosingTerms}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#PaymentSourcePortfolioTransfer
 * PaymentObligation.PaymentSourcePortfolioTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#PaymentSourceCurrencyOption
 * PaymentObligation.PaymentSourceCurrencyOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#ExchangeRateInformation
 * PaymentObligation.ExchangeRateInformation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentObligation#Dividend
 * PaymentObligation.Dividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#RepurchaseAgreement
 * PaymentObligation.RepurchaseAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#RelatedAssignment
 * PaymentObligation.RelatedAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#BankingTransaction
 * PaymentObligation.BankingTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#PaymentTerms
 * PaymentObligation.PaymentTerms}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#PaymentDueDate
 * PaymentObligation.PaymentDueDate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#Obligation
 * Dividend.Obligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ContactPoint#RemittanceRelatedPayment
 * ContactPoint.RemittanceRelatedPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#PaymentObligation
 * Document.PaymentObligation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#PaymentObligation
 * Payment.PaymentObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#PaymentObligation
 * PortfolioTransfer.PaymentObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccountContract#BalanceTransfer
 * CashAccountContract.BalanceTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#PaymentObligation
 * SecuritiesTradeExecution.PaymentObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#ResultingSettlement
 * ForeignExchangeTrade.ResultingSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction#CashProceedsMovement
 * CorporateActionProceedsDeliveryInstruction.CashProceedsMovement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligationPartyRole#PaymentObligation
 * PaymentObligationPartyRole.PaymentObligation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Demand#Payment
 * Demand.Payment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyOption#PremiumSettlement
 * CurrencyOption.PremiumSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommercialTrade#PaymentObligation
 * CommercialTrade.PaymentObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralMovement#CashCollateralMovement
 * CollateralMovement.CashCollateralMovement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.BuyIn#CashCompensation
 * BuyIn.CashCompensation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BankingTransaction#PaymentObligation
 * BankingTransaction.PaymentObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RepurchaseAgreement#PaymentObligation
 * RepurchaseAgreement.PaymentObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Assignment#PaymentObligation
 * Assignment.PaymentObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentTerms#RelatedPaymentObligation
 * PaymentTerms.RelatedPaymentObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestManagement#PaymentObligation
 * InterestManagement.PaymentObligation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Instalment Instalment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Garnishment Garnishment}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Obligation
 * Obligation}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.Purpose2Choice
 * Purpose2Choice}</li>
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
 * "PaymentObligation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Obligation for the debtor to pay the creditor an amount of cash."</li>
 * </ul>
 */
public class PaymentObligation extends Obligation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Fulfilment of a payment obligation through a payment and its execution.
	 * It is derived from the association between Obligation and Obligation
	 * fulfillment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Payment#PaymentObligation
	 * Payment.PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentOffset"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Fulfilment of a payment obligation through a payment and its execution. It is derived from the association between Obligation and Obligation fulfillment."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PaymentOffset = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentOffset";
			definition = "Fulfilment of a payment obligation through a payment and its execution. It is derived from the association between Obligation and Obligation fulfillment.";
			minOccurs = 0;
			type_lazy = () -> Payment.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.PaymentObligation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Underlying reason for the payment obligation
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.choice.Purpose2Choice#Code
	 * Purpose2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Purpose2Choice#Proprietary
	 * Purpose2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementResolutionEntry2#Purpose
	 * StatementResolutionEntry2.Purpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#Purpose
	 * CreditTransferTransaction25.Purpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#Purpose
	 * CreditTransferTransaction26.Purpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemReference4#Purpose
	 * OriginalItemReference4.Purpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction22#Purpose
	 * CreditTransferTransaction22.Purpose}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction8#Purpose
	 * EntryTransaction8.Purpose}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NotificationItem6#Purpose
	 * NotificationItem6.Purpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification6#Purpose
	 * RequestedModification6.Purpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#Purpose
	 * PaymentComplementaryInformation6.Purpose}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Purpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying reason for the payment obligation"</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Purpose = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Purpose2Choice.Code, com.tools20022.repository.choice.Purpose2Choice.Proprietary, com.tools20022.repository.msg.StatementResolutionEntry2.Purpose,
					com.tools20022.repository.msg.CreditTransferTransaction25.Purpose, com.tools20022.repository.msg.CreditTransferTransaction26.Purpose, com.tools20022.repository.msg.OriginalItemReference4.Purpose,
					com.tools20022.repository.msg.CreditTransferTransaction22.Purpose, com.tools20022.repository.msg.EntryTransaction8.Purpose, com.tools20022.repository.msg.NotificationItem6.Purpose,
					com.tools20022.repository.msg.RequestedModification6.Purpose, com.tools20022.repository.msg.PaymentComplementaryInformation6.Purpose);
			elementContext_lazy = () -> PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Purpose";
			definition = "Underlying reason for the payment obligation";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PaymentPurposeCode.mmObject();
		}
	};
	/**
	 * Specifies the method to be used by the first agent (debtor agent in the
	 * case of a credit transfer, creditor agent in the case of a direct debit)
	 * to deliver the remittance advice information, which may be sent
	 * separately from the payment instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RemittanceLocationMethodCode
	 * RemittanceLocationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RemittanceLocationDetails1#Method
	 * RemittanceLocationDetails1.Method}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemittanceDeliveryMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the method to be used by the first agent (debtor agent in the case of a credit transfer, creditor agent in the case of a direct debit) to deliver the remittance advice information, which may be sent separately from the payment instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RemittanceDeliveryMethod = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RemittanceLocationDetails1.Method);
			elementContext_lazy = () -> PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RemittanceDeliveryMethod";
			definition = "Specifies the method to be used by the first agent (debtor agent in the case of a credit transfer, creditor agent in the case of a direct debit) to deliver the remittance advice information, which may be sent separately from the payment instruction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> RemittanceLocationMethodCode.mmObject();
		}
	};
	/**
	 * Specifies the referred document/transaction, eg, invoice or credit note.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Document#PaymentObligation
	 * Document.PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Document Document}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation15#RemittanceInformation
	 * DirectDebitTransactionInformation15.RemittanceInformation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Garnishment1#Type
	 * Garnishment1.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#RemittanceInformation
	 * CreditTransferTransaction23.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#RemittanceInformation
	 * CreditTransferTransaction25.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction24#RemittanceInformation
	 * CreditTransferTransaction24.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#RemittanceInformation
	 * CreditTransferTransaction26.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemReference4#RemittanceInformation
	 * OriginalItemReference4.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction22#RemittanceInformation
	 * CreditTransferTransaction22.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#RemittanceInformation
	 * EntryTransaction8.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem6#RemittanceInformation
	 * NotificationItem6.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#RemittanceInformation
	 * DirectDebitTransactionInformation21.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference24#RemittanceInformation
	 * OriginalTransactionReference24.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference26#RemittanceInformation
	 * OriginalTransactionReference26.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation22#RemittanceInformation
	 * DirectDebitTransactionInformation22.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#RemittanceInformation
	 * PaymentComplementaryInformation6.RemittanceInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssociatedDocument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the referred document/transaction, eg, invoice or credit note."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd AssociatedDocument = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DirectDebitTransactionInformation15.RemittanceInformation, com.tools20022.repository.msg.Garnishment1.Type,
					com.tools20022.repository.msg.CreditTransferTransaction23.RemittanceInformation, com.tools20022.repository.msg.CreditTransferTransaction25.RemittanceInformation,
					com.tools20022.repository.msg.CreditTransferTransaction24.RemittanceInformation, com.tools20022.repository.msg.CreditTransferTransaction26.RemittanceInformation,
					com.tools20022.repository.msg.OriginalItemReference4.RemittanceInformation, com.tools20022.repository.msg.CreditTransferTransaction22.RemittanceInformation,
					com.tools20022.repository.msg.EntryTransaction8.RemittanceInformation, com.tools20022.repository.msg.NotificationItem6.RemittanceInformation,
					com.tools20022.repository.msg.DirectDebitTransactionInformation21.RemittanceInformation, com.tools20022.repository.msg.OriginalTransactionReference24.RemittanceInformation,
					com.tools20022.repository.msg.OriginalTransactionReference26.RemittanceInformation, com.tools20022.repository.msg.DirectDebitTransactionInformation22.RemittanceInformation,
					com.tools20022.repository.msg.PaymentComplementaryInformation6.RemittanceInformation);
			elementContext_lazy = () -> PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AssociatedDocument";
			definition = "Specifies the referred document/transaction, eg, invoice or credit note.";
			minOccurs = 0;
			type_lazy = () -> Document.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Document.PaymentObligation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Amount payable to the creditor.
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RemittanceAmount2#DuePayableAmount
	 * RemittanceAmount2.DuePayableAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RemittanceAmount3#DuePayableAmount
	 * RemittanceAmount3.DuePayableAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeContract1#Amount
	 * TradeContract1.Amount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount payable to the creditor."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Amount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RemittanceAmount2.DuePayableAmount, com.tools20022.repository.msg.RemittanceAmount3.DuePayableAmount, com.tools20022.repository.msg.TradeContract1.Amount);
			elementContext_lazy = () -> PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Amount payable to the creditor.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Address to which the first agent is to send the remittance information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint#RemittanceRelatedPayment
	 * ContactPoint.RemittanceRelatedPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ContactPoint
	 * ContactPoint}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#RelatedRemittanceInformation
	 * CreditTransferTransaction25.RelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#RelatedRemittanceInformation
	 * CreditTransferTransaction26.RelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction22#RelatedRemittanceInformation
	 * CreditTransferTransaction22.RelatedRemittanceInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemittanceLocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Address to which the first agent is to send the remittance information."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RemittanceLocation = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CreditTransferTransaction25.RelatedRemittanceInformation, com.tools20022.repository.msg.CreditTransferTransaction26.RelatedRemittanceInformation,
					com.tools20022.repository.msg.CreditTransferTransaction22.RelatedRemittanceInformation);
			elementContext_lazy = () -> PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RemittanceLocation";
			definition = "Address to which the first agent is to send the remittance information.";
			minOccurs = 0;
			type_lazy = () -> ContactPoint.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPoint.RemittanceRelatedPayment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Process which calculates the interest to be paid. It may also specify the
	 * interest charged on instalment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InterestManagement#PaymentObligation
	 * InterestManagement.PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InterestManagement
	 * InterestManagement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Process which calculates the interest to be paid. It may also specify the interest charged on instalment."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Interest = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Interest";
			definition = "Process which calculates the interest to be paid. It may also specify the interest charged on instalment.";
			minOccurs = 0;
			type_lazy = () -> InterestManagement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InterestManagement.PaymentObligation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Commercial trade which creates the payment obligation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTrade#PaymentObligation
	 * CommercialTrade.PaymentObligation}</li>
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
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommercialTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commercial trade which creates the payment obligation."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CommercialTrade = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CommercialTrade";
			definition = "Commercial trade which creates the payment obligation.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CommercialTrade.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CommercialTrade.PaymentObligation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Maximum amount that a financial institution guarantees to pay for a
	 * specific commercial trade, expressed as a percentage of the purchase
	 * order net amount.
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
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Percentage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum amount that a financial institution guarantees to pay for a specific commercial trade, expressed as a percentage of the purchase order net amount."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Percentage = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Percentage";
			definition = "Maximum amount that a financial institution guarantees to pay for a specific commercial trade, expressed as a percentage of the purchase order net amount.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Maximum amount that a financial institution guarantees to pay for a
	 * specific commercial trade.
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
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum amount that a financial institution guarantees to pay for a specific commercial trade."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MaximumAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumAmount";
			definition = "Maximum amount that a financial institution guarantees to pay for a specific commercial trade.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Date at which the obligation will expire. For instance, it is the
	 * transaction authorisation deadline to complete a payment by card.
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
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date at which the obligation will expire. For instance, it is the transaction authorisation deadline to complete a payment by card."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ExpiryDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExpiryDate";
			definition = "Date at which the obligation will expire. For instance, it is the transaction authorisation deadline to complete a payment by card.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Country of which the law governs the payment obligation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicableLaw"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country of which the law governs the payment obligation."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ApplicableLaw = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ApplicableLaw";
			definition = "Country of which the law governs the payment obligation.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};
	/**
	 * Buy-in process which created the payment obligation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BuyIn#CashCompensation
	 * BuyIn.CashCompensation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BuyIn BuyIn}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentSourceBuyIn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Buy-in process which created the payment obligation."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PaymentSourceBuyIn = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentSourceBuyIn";
			definition = "Buy-in process which created the payment obligation.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> BuyIn.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.BuyIn.CashCompensation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Corporate action processes which are the source of the payment
	 * obligation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction#CashProceedsMovement
	 * CorporateActionProceedsDeliveryInstruction.CashProceedsMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction
	 * CorporateActionProceedsDeliveryInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCorporateAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action processes which are the source of the payment obligation."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedCorporateAction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCorporateAction";
			definition = "Corporate action processes which are the source of the payment obligation.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionProceedsDeliveryInstruction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.CashProceedsMovement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Collateral movement which is the source of the obligation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralMovement#CashCollateralMovement
	 * CollateralMovement.CashCollateralMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CollateralMovement
	 * CollateralMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCollateralMovement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collateral movement which is the source of the obligation."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedCollateralMovement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedCollateralMovement";
			definition = "Collateral movement which is the source of the obligation.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CollateralMovement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralMovement.CashCollateralMovement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Undertaking demand which is the source of a payment obligation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Demand#Payment
	 * Demand.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Demand Demand}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentSourceUndertakingDemand"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Undertaking demand which is the source of a payment obligation."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PaymentSourceUndertakingDemand = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentSourceUndertakingDemand";
			definition = "Undertaking demand which is the source of a payment obligation.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Demand.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Demand.Payment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies each role linked to a payment obligation and played by a party
	 * at that step in a payment flow.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligationPartyRole#PaymentObligation
	 * PaymentObligationPartyRole.PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligationPartyRole
	 * PaymentObligationPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies each role linked to a payment obligation and played by a party at that step in a payment flow."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies each role linked to a payment obligation and played by a party at that step in a payment flow.";
			minOccurs = 0;
			type_lazy = () -> PaymentObligationPartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentObligationPartyRole.PaymentObligation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities trade which created a payment flow.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#PaymentObligation
	 * SecuritiesTradeExecution.PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution
	 * SecuritiesTradeExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExecutedSecuritiesTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Securities trade which created a payment flow."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ExecutedSecuritiesTrade = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExecutedSecuritiesTrade";
			definition = "Securities trade which created a payment flow.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesTradeExecution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeExecution.PaymentObligation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Contract which authorises the transfer of funds resulting in a payment
	 * obligation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountContract#BalanceTransfer
	 * CashAccountContract.BalanceTransfer}</li>
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
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedAccountClosingTerms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contract which authorises the transfer of funds resulting in a payment obligation."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedAccountClosingTerms = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedAccountClosingTerms";
			definition = "Contract which authorises the transfer of funds resulting in a payment obligation.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CashAccountContract.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccountContract.BalanceTransfer;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * The PaymentObligation that specifies the payment resulting from charges
	 * due by one party to another.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#PaymentObligation
	 * PortfolioTransfer.PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PortfolioTransfer
	 * PortfolioTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentSourcePortfolioTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The PaymentObligation that specifies the payment resulting from charges due by one party to another."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PaymentSourcePortfolioTransfer = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentSourcePortfolioTransfer";
			definition = "The PaymentObligation that specifies the payment resulting from charges due by one party to another.";
			minOccurs = 0;
			type_lazy = () -> PortfolioTransfer.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PortfolioTransfer.PaymentObligation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * The PaymentObligation that specifies the amount of the premium paid by
	 * the buyer of the option and its settlement place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyOption#PremiumSettlement
	 * CurrencyOption.PremiumSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CurrencyOption
	 * CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentSourceCurrencyOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The PaymentObligation that specifies the amount of the premium paid by the buyer of the option and its settlement place."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PaymentSourceCurrencyOption = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentSourceCurrencyOption";
			definition = "The PaymentObligation that specifies the amount of the premium paid by the buyer of the option and its settlement place.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CurrencyOption.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyOption.PremiumSettlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Foreign exchange trade which is the source of the payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#ResultingSettlement
	 * ForeignExchangeTrade.ResultingSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade
	 * ForeignExchangeTrade}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeContract1#ExchangeRateInformation
	 * TradeContract1.ExchangeRateInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SyndicatedLoan1#ExchangeRateInformation
	 * SyndicatedLoan1.ExchangeRateInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeRateInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Foreign exchange trade which is the source of the payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ExchangeRateInformation = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeContract1.ExchangeRateInformation, com.tools20022.repository.msg.SyndicatedLoan1.ExchangeRateInformation);
			elementContext_lazy = () -> PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExchangeRateInformation";
			definition = "Foreign exchange trade which is the source of the payment.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> ForeignExchangeTrade.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ForeignExchangeTrade.ResultingSettlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Dividend for which payment terms are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#Obligation
	 * Dividend.Obligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Dividend Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Dividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Dividend for which payment terms are specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Dividend = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Dividend";
			definition = "Dividend for which payment terms are specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Dividend.Obligation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Repurchase agreement which covers the delivery of cash by the buyer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RepurchaseAgreement#PaymentObligation
	 * RepurchaseAgreement.PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RepurchaseAgreement
	 * RepurchaseAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseAgreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Repurchase agreement which covers the delivery of cash by the buyer."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RepurchaseAgreement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RepurchaseAgreement";
			definition = "Repurchase agreement which covers the delivery of cash by the buyer.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.RepurchaseAgreement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.RepurchaseAgreement.PaymentObligation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Assignment which contains one or more payment obligations.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Assignment#PaymentObligation
	 * Assignment.PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Assignment
	 * Assignment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedAssignment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Assignment which contains one or more payment obligations."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedAssignment = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedAssignment";
			definition = "Assignment which contains one or more payment obligations.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Assignment.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Assignment.PaymentObligation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Transaction executed by the client of a financial institution from/to the
	 * account serviced by the financial institution, such as mortgage payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BankingTransaction#PaymentObligation
	 * BankingTransaction.PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BankingTransaction
	 * BankingTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankingTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction executed by the client of a financial institution from/to the account serviced by the financial institution, such as mortgage payment."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd BankingTransaction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BankingTransaction";
			definition = "Transaction executed by the client of a financial institution from/to the account serviced by the financial institution, such as mortgage payment.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.BankingTransaction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.BankingTransaction.PaymentObligation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the payment terms of the obligation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentTerms#RelatedPaymentObligation
	 * PaymentTerms.RelatedPaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentTerms
	 * PaymentTerms}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeContract1#PaymentSchedule
	 * TradeContract1.PaymentSchedule}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LoanContract1#PaymentSchedule
	 * LoanContract1.PaymentSchedule}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentTerms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the payment terms of the obligation."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PaymentTerms = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeContract1.PaymentSchedule, com.tools20022.repository.msg.LoanContract1.PaymentSchedule);
			elementContext_lazy = () -> PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentTerms";
			definition = "Specifies the payment terms of the obligation.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.PaymentTerms.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentTerms.RelatedPaymentObligation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Due date for the payment.
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
	 * {@linkplain com.tools20022.repository.msg.TransactionCertificateContract1#ExpectedAdvancePaymentReturnDate
	 * TransactionCertificateContract1.ExpectedAdvancePaymentReturnDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentDueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Due date for the payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PaymentDueDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionCertificateContract1.ExpectedAdvancePaymentReturnDate);
			elementContext_lazy = () -> PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentDueDate";
			definition = "Due date for the payment.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PaymentObligation";
				definition = "Obligation for the debtor to pay the creditor an amount of cash.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Dividend.Obligation, com.tools20022.repository.entity.ContactPoint.RemittanceRelatedPayment,
						com.tools20022.repository.entity.Document.PaymentObligation, com.tools20022.repository.entity.Payment.PaymentObligation, com.tools20022.repository.entity.PortfolioTransfer.PaymentObligation,
						com.tools20022.repository.entity.CashAccountContract.BalanceTransfer, com.tools20022.repository.entity.SecuritiesTradeExecution.PaymentObligation,
						com.tools20022.repository.entity.ForeignExchangeTrade.ResultingSettlement, com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.CashProceedsMovement,
						com.tools20022.repository.entity.PaymentObligationPartyRole.PaymentObligation, com.tools20022.repository.entity.Demand.Payment, com.tools20022.repository.entity.CurrencyOption.PremiumSettlement,
						com.tools20022.repository.entity.CommercialTrade.PaymentObligation, com.tools20022.repository.entity.CollateralMovement.CashCollateralMovement, com.tools20022.repository.entity.BuyIn.CashCompensation,
						com.tools20022.repository.entity.BankingTransaction.PaymentObligation, com.tools20022.repository.entity.RepurchaseAgreement.PaymentObligation, com.tools20022.repository.entity.Assignment.PaymentObligation,
						com.tools20022.repository.entity.PaymentTerms.RelatedPaymentObligation, com.tools20022.repository.entity.InterestManagement.PaymentObligation);
				subType_lazy = () -> Arrays.asList(Instalment.mmObject(), Garnishment.mmObject());
				superType_lazy = () -> Obligation.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentObligation.PaymentOffset, com.tools20022.repository.entity.PaymentObligation.Purpose,
						com.tools20022.repository.entity.PaymentObligation.RemittanceDeliveryMethod, com.tools20022.repository.entity.PaymentObligation.AssociatedDocument, com.tools20022.repository.entity.PaymentObligation.Amount,
						com.tools20022.repository.entity.PaymentObligation.RemittanceLocation, com.tools20022.repository.entity.PaymentObligation.Interest, com.tools20022.repository.entity.PaymentObligation.CommercialTrade,
						com.tools20022.repository.entity.PaymentObligation.Percentage, com.tools20022.repository.entity.PaymentObligation.MaximumAmount, com.tools20022.repository.entity.PaymentObligation.ExpiryDate,
						com.tools20022.repository.entity.PaymentObligation.ApplicableLaw, com.tools20022.repository.entity.PaymentObligation.PaymentSourceBuyIn, com.tools20022.repository.entity.PaymentObligation.RelatedCorporateAction,
						com.tools20022.repository.entity.PaymentObligation.RelatedCollateralMovement, com.tools20022.repository.entity.PaymentObligation.PaymentSourceUndertakingDemand,
						com.tools20022.repository.entity.PaymentObligation.PartyRole, com.tools20022.repository.entity.PaymentObligation.ExecutedSecuritiesTrade,
						com.tools20022.repository.entity.PaymentObligation.RelatedAccountClosingTerms, com.tools20022.repository.entity.PaymentObligation.PaymentSourcePortfolioTransfer,
						com.tools20022.repository.entity.PaymentObligation.PaymentSourceCurrencyOption, com.tools20022.repository.entity.PaymentObligation.ExchangeRateInformation,
						com.tools20022.repository.entity.PaymentObligation.Dividend, com.tools20022.repository.entity.PaymentObligation.RepurchaseAgreement, com.tools20022.repository.entity.PaymentObligation.RelatedAssignment,
						com.tools20022.repository.entity.PaymentObligation.BankingTransaction, com.tools20022.repository.entity.PaymentObligation.PaymentTerms, com.tools20022.repository.entity.PaymentObligation.PaymentDueDate);
				derivationComponent_lazy = () -> Arrays.asList(Purpose2Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}