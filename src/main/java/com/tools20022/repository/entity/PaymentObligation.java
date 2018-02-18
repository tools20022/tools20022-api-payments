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
import com.tools20022.repository.choice.Purpose2Choice;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.codeset.PaymentPurposeCode;
import com.tools20022.repository.codeset.RemittanceLocationMethodCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.Obligation;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.*;
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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Obligation
 * Obligation}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPaymentOffset
 * PaymentObligation.mmPaymentOffset}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentObligation#mmPurpose
 * PaymentObligation.mmPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmRemittanceDeliveryMethod
 * PaymentObligation.mmRemittanceDeliveryMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmAssociatedDocument
 * PaymentObligation.mmAssociatedDocument}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentObligation#mmAmount
 * PaymentObligation.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmRemittanceLocation
 * PaymentObligation.mmRemittanceLocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmInterest
 * PaymentObligation.mmInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmCommercialTrade
 * PaymentObligation.mmCommercialTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPercentage
 * PaymentObligation.mmPercentage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmMaximumAmount
 * PaymentObligation.mmMaximumAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmExpiryDate
 * PaymentObligation.mmExpiryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmApplicableLaw
 * PaymentObligation.mmApplicableLaw}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPaymentSourceBuyIn
 * PaymentObligation.mmPaymentSourceBuyIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmRelatedCorporateAction
 * PaymentObligation.mmRelatedCorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmRelatedCollateralMovement
 * PaymentObligation.mmRelatedCollateralMovement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPaymentSourceUndertakingDemand
 * PaymentObligation.mmPaymentSourceUndertakingDemand}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPartyRole
 * PaymentObligation.mmPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmExecutedSecuritiesTrade
 * PaymentObligation.mmExecutedSecuritiesTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmRelatedAccountClosingTerms
 * PaymentObligation.mmRelatedAccountClosingTerms}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPaymentSourcePortfolioTransfer
 * PaymentObligation.mmPaymentSourcePortfolioTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPaymentSourceCurrencyOption
 * PaymentObligation.mmPaymentSourceCurrencyOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmExchangeRateInformation
 * PaymentObligation.mmExchangeRateInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmDividend
 * PaymentObligation.mmDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmRepurchaseAgreement
 * PaymentObligation.mmRepurchaseAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmRelatedAssignment
 * PaymentObligation.mmRelatedAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmBankingTransaction
 * PaymentObligation.mmBankingTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPaymentTerms
 * PaymentObligation.mmPaymentTerms}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPaymentDueDate
 * PaymentObligation.mmPaymentDueDate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#mmObligation
 * Dividend.mmObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmRemittanceRelatedPayment
 * ContactPoint.mmRemittanceRelatedPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Document#mmPaymentObligation
 * Document.mmPaymentObligation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmPaymentObligation
 * Payment.mmPaymentObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmPaymentObligation
 * PortfolioTransfer.mmPaymentObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccountContract#mmBalanceTransfer
 * CashAccountContract.mmBalanceTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmPaymentObligation
 * SecuritiesTradeExecution.mmPaymentObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmResultingSettlement
 * ForeignExchangeTrade.mmResultingSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction#mmCashProceedsMovement
 * CorporateActionProceedsDeliveryInstruction.mmCashProceedsMovement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligationPartyRole#mmPaymentObligation
 * PaymentObligationPartyRole.mmPaymentObligation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Demand#mmPayment
 * Demand.mmPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyOption#mmPremiumSettlement
 * CurrencyOption.mmPremiumSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommercialTrade#mmPaymentObligation
 * CommercialTrade.mmPaymentObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralMovement#mmCashCollateralMovement
 * CollateralMovement.mmCashCollateralMovement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.BuyIn#mmCashCompensation
 * BuyIn.mmCashCompensation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BankingTransaction#mmPaymentObligation
 * BankingTransaction.mmPaymentObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RepurchaseAgreement#mmPaymentObligation
 * RepurchaseAgreement.mmPaymentObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Assignment#mmPaymentObligation
 * Assignment.mmPaymentObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentTerms#mmRelatedPaymentObligation
 * PaymentTerms.mmRelatedPaymentObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestManagement#mmPaymentObligation
 * InterestManagement.mmPaymentObligation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Instalment Instalment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Garnishment Garnishment}</li>
 * </ul>
 * </li>
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
	protected List<com.tools20022.repository.entity.Payment> paymentOffset;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmPaymentObligation
	 * Payment.mmPaymentObligation}</li>
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
	public static final MMBusinessAssociationEnd mmPaymentOffset = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentOffset";
			definition = "Fulfilment of a payment obligation through a payment and its execution. It is derived from the association between Obligation and Obligation fulfillment.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.mmPaymentObligation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
		}
	};
	protected PaymentPurposeCode purpose;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.repository.choice.Purpose2Choice#mmCode
	 * Purpose2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Purpose2Choice#mmProprietary
	 * Purpose2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementResolutionEntry2#mmPurpose
	 * StatementResolutionEntry2.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#mmPurpose
	 * CreditTransferTransaction25.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#mmPurpose
	 * CreditTransferTransaction26.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemReference4#mmPurpose
	 * OriginalItemReference4.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction22#mmPurpose
	 * CreditTransferTransaction22.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#mmPurpose
	 * EntryTransaction8.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem6#mmPurpose
	 * NotificationItem6.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification6#mmPurpose
	 * RequestedModification6.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#mmPurpose
	 * PaymentComplementaryInformation6.mmPurpose}</li>
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
	public static final MMBusinessAttribute mmPurpose = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Purpose2Choice.mmCode, Purpose2Choice.mmProprietary, StatementResolutionEntry2.mmPurpose, CreditTransferTransaction25.mmPurpose, CreditTransferTransaction26.mmPurpose,
					OriginalItemReference4.mmPurpose, CreditTransferTransaction22.mmPurpose, EntryTransaction8.mmPurpose, NotificationItem6.mmPurpose, RequestedModification6.mmPurpose, PaymentComplementaryInformation6.mmPurpose);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Purpose";
			definition = "Underlying reason for the payment obligation";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PaymentPurposeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentObligation.class.getMethod("getPurpose", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected RemittanceLocationMethodCode remittanceDeliveryMethod;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.RemittanceLocationDetails1#mmMethod
	 * RemittanceLocationDetails1.mmMethod}</li>
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
	public static final MMBusinessAttribute mmRemittanceDeliveryMethod = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(RemittanceLocationDetails1.mmMethod);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RemittanceDeliveryMethod";
			definition = "Specifies the method to be used by the first agent (debtor agent in the case of a credit transfer, creditor agent in the case of a direct debit) to deliver the remittance advice information, which may be sent separately from the payment instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RemittanceLocationMethodCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentObligation.class.getMethod("getRemittanceDeliveryMethod", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.Document> associatedDocument;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmPaymentObligation
	 * Document.mmPaymentObligation}</li>
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
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation15#mmRemittanceInformation
	 * DirectDebitTransactionInformation15.mmRemittanceInformation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Garnishment1#mmType
	 * Garnishment1.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#mmRemittanceInformation
	 * CreditTransferTransaction23.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#mmRemittanceInformation
	 * CreditTransferTransaction25.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction24#mmRemittanceInformation
	 * CreditTransferTransaction24.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#mmRemittanceInformation
	 * CreditTransferTransaction26.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemReference4#mmRemittanceInformation
	 * OriginalItemReference4.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction22#mmRemittanceInformation
	 * CreditTransferTransaction22.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#mmRemittanceInformation
	 * EntryTransaction8.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem6#mmRemittanceInformation
	 * NotificationItem6.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#mmRemittanceInformation
	 * DirectDebitTransactionInformation21.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference24#mmRemittanceInformation
	 * OriginalTransactionReference24.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference26#mmRemittanceInformation
	 * OriginalTransactionReference26.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation22#mmRemittanceInformation
	 * DirectDebitTransactionInformation22.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#mmRemittanceInformation
	 * PaymentComplementaryInformation6.mmRemittanceInformation}</li>
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
	public static final MMBusinessAssociationEnd mmAssociatedDocument = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(DirectDebitTransactionInformation15.mmRemittanceInformation, Garnishment1.mmType, CreditTransferTransaction23.mmRemittanceInformation, CreditTransferTransaction25.mmRemittanceInformation,
					CreditTransferTransaction24.mmRemittanceInformation, CreditTransferTransaction26.mmRemittanceInformation, OriginalItemReference4.mmRemittanceInformation, CreditTransferTransaction22.mmRemittanceInformation,
					EntryTransaction8.mmRemittanceInformation, NotificationItem6.mmRemittanceInformation, DirectDebitTransactionInformation21.mmRemittanceInformation, OriginalTransactionReference24.mmRemittanceInformation,
					OriginalTransactionReference26.mmRemittanceInformation, DirectDebitTransactionInformation22.mmRemittanceInformation, PaymentComplementaryInformation6.mmRemittanceInformation);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AssociatedDocument";
			definition = "Specifies the referred document/transaction, eg, invoice or credit note.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Document.mmPaymentObligation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
		}
	};
	protected CurrencyAndAmount amount;
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RemittanceAmount2#mmDuePayableAmount
	 * RemittanceAmount2.mmDuePayableAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RemittanceAmount3#mmDuePayableAmount
	 * RemittanceAmount3.mmDuePayableAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeContract1#mmAmount
	 * TradeContract1.mmAmount}</li>
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
	public static final MMBusinessAttribute mmAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(RemittanceAmount2.mmDuePayableAmount, RemittanceAmount3.mmDuePayableAmount, TradeContract1.mmAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Amount payable to the creditor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentObligation.class.getMethod("getAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.ContactPoint> remittanceLocation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmRemittanceRelatedPayment
	 * ContactPoint.mmRemittanceRelatedPayment}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#mmRelatedRemittanceInformation
	 * CreditTransferTransaction25.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#mmRelatedRemittanceInformation
	 * CreditTransferTransaction26.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction22#mmRelatedRemittanceInformation
	 * CreditTransferTransaction22.mmRelatedRemittanceInformation}</li>
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
	public static final MMBusinessAssociationEnd mmRemittanceLocation = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CreditTransferTransaction25.mmRelatedRemittanceInformation, CreditTransferTransaction26.mmRelatedRemittanceInformation, CreditTransferTransaction22.mmRelatedRemittanceInformation);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RemittanceLocation";
			definition = "Address to which the first agent is to send the remittance information.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmRemittanceRelatedPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.InterestManagement> interest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InterestManagement#mmPaymentObligation
	 * InterestManagement.mmPaymentObligation}</li>
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
	public static final MMBusinessAssociationEnd mmInterest = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Interest";
			definition = "Process which calculates the interest to be paid. It may also specify the interest charged on instalment.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InterestManagement.mmPaymentObligation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InterestManagement.mmObject();
		}
	};
	protected CommercialTrade commercialTrade;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTrade#mmPaymentObligation
	 * CommercialTrade.mmPaymentObligation}</li>
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
	public static final MMBusinessAssociationEnd mmCommercialTrade = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CommercialTrade";
			definition = "Commercial trade which creates the payment obligation.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CommercialTrade.mmPaymentObligation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CommercialTrade.mmObject();
		}
	};
	protected PercentageRate percentage;
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
	public static final MMBusinessAttribute mmPercentage = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Percentage";
			definition = "Maximum amount that a financial institution guarantees to pay for a specific commercial trade, expressed as a percentage of the purchase order net amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentObligation.class.getMethod("getPercentage", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	public static final MMBusinessAttribute mmMaximumAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaximumAmount";
			definition = "Maximum amount that a financial institution guarantees to pay for a specific commercial trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentObligation.class.getMethod("getMaximumAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime expiryDate;
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
	public static final MMBusinessAttribute mmExpiryDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExpiryDate";
			definition = "Date at which the obligation will expire. For instance, it is the transaction authorisation deadline to complete a payment by card.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentObligation.class.getMethod("getExpiryDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CountryCode applicableLaw;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute mmApplicableLaw = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ApplicableLaw";
			definition = "Country of which the law governs the payment obligation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentObligation.class.getMethod("getApplicableLaw", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected BuyIn paymentSourceBuyIn;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BuyIn#mmCashCompensation
	 * BuyIn.mmCashCompensation}</li>
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
	public static final MMBusinessAssociationEnd mmPaymentSourceBuyIn = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentSourceBuyIn";
			definition = "Buy-in process which created the payment obligation.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.BuyIn.mmCashCompensation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BuyIn.mmObject();
		}
	};
	protected CorporateActionProceedsDeliveryInstruction relatedCorporateAction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction#mmCashProceedsMovement
	 * CorporateActionProceedsDeliveryInstruction.mmCashProceedsMovement}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedCorporateAction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedCorporateAction";
			definition = "Corporate action processes which are the source of the payment obligation.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.mmCashProceedsMovement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.mmObject();
		}
	};
	protected CollateralMovement relatedCollateralMovement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralMovement#mmCashCollateralMovement
	 * CollateralMovement.mmCashCollateralMovement}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedCollateralMovement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedCollateralMovement";
			definition = "Collateral movement which is the source of the obligation.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralMovement.mmCashCollateralMovement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CollateralMovement.mmObject();
		}
	};
	protected Demand paymentSourceUndertakingDemand;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Demand#mmPayment
	 * Demand.mmPayment}</li>
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
	public static final MMBusinessAssociationEnd mmPaymentSourceUndertakingDemand = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentSourceUndertakingDemand";
			definition = "Undertaking demand which is the source of a payment obligation.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Demand.mmPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Demand.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.PaymentObligationPartyRole> partyRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligationPartyRole#mmPaymentObligation
	 * PaymentObligationPartyRole.mmPaymentObligation}</li>
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
	public static final MMBusinessAssociationEnd mmPartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies each role linked to a payment obligation and played by a party at that step in a payment flow.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentObligationPartyRole.mmPaymentObligation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentObligationPartyRole.mmObject();
		}
	};
	protected SecuritiesTradeExecution executedSecuritiesTrade;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmPaymentObligation
	 * SecuritiesTradeExecution.mmPaymentObligation}</li>
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
	public static final MMBusinessAssociationEnd mmExecutedSecuritiesTrade = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExecutedSecuritiesTrade";
			definition = "Securities trade which created a payment flow.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeExecution.mmPaymentObligation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeExecution.mmObject();
		}
	};
	protected CashAccountContract relatedAccountClosingTerms;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountContract#mmBalanceTransfer
	 * CashAccountContract.mmBalanceTransfer}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedAccountClosingTerms = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedAccountClosingTerms";
			definition = "Contract which authorises the transfer of funds resulting in a payment obligation.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccountContract.mmBalanceTransfer;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccountContract.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.PortfolioTransfer> paymentSourcePortfolioTransfer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmPaymentObligation
	 * PortfolioTransfer.mmPaymentObligation}</li>
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
	public static final MMBusinessAssociationEnd mmPaymentSourcePortfolioTransfer = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentSourcePortfolioTransfer";
			definition = "The PaymentObligation that specifies the payment resulting from charges due by one party to another.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PortfolioTransfer.mmPaymentObligation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PortfolioTransfer.mmObject();
		}
	};
	protected CurrencyOption paymentSourceCurrencyOption;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyOption#mmPremiumSettlement
	 * CurrencyOption.mmPremiumSettlement}</li>
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
	public static final MMBusinessAssociationEnd mmPaymentSourceCurrencyOption = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentSourceCurrencyOption";
			definition = "The PaymentObligation that specifies the amount of the premium paid by the buyer of the option and its settlement place.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyOption.mmPremiumSettlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CurrencyOption.mmObject();
		}
	};
	protected ForeignExchangeTrade exchangeRateInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmResultingSettlement
	 * ForeignExchangeTrade.mmResultingSettlement}</li>
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
	 * {@linkplain com.tools20022.repository.msg.TradeContract1#mmExchangeRateInformation
	 * TradeContract1.mmExchangeRateInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SyndicatedLoan1#mmExchangeRateInformation
	 * SyndicatedLoan1.mmExchangeRateInformation}</li>
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
	public static final MMBusinessAssociationEnd mmExchangeRateInformation = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(TradeContract1.mmExchangeRateInformation, SyndicatedLoan1.mmExchangeRateInformation);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExchangeRateInformation";
			definition = "Foreign exchange trade which is the source of the payment.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ForeignExchangeTrade.mmResultingSettlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ForeignExchangeTrade.mmObject();
		}
	};
	protected Dividend dividend;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmObligation
	 * Dividend.mmObligation}</li>
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
	public static final MMBusinessAssociationEnd mmDividend = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Dividend";
			definition = "Dividend for which payment terms are specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Dividend.mmObligation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
		}
	};
	protected RepurchaseAgreement repurchaseAgreement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RepurchaseAgreement#mmPaymentObligation
	 * RepurchaseAgreement.mmPaymentObligation}</li>
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
	public static final MMBusinessAssociationEnd mmRepurchaseAgreement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RepurchaseAgreement";
			definition = "Repurchase agreement which covers the delivery of cash by the buyer.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RepurchaseAgreement.mmPaymentObligation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RepurchaseAgreement.mmObject();
		}
	};
	protected Assignment relatedAssignment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Assignment#mmPaymentObligation
	 * Assignment.mmPaymentObligation}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedAssignment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedAssignment";
			definition = "Assignment which contains one or more payment obligations.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Assignment.mmPaymentObligation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Assignment.mmObject();
		}
	};
	protected BankingTransaction bankingTransaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BankingTransaction#mmPaymentObligation
	 * BankingTransaction.mmPaymentObligation}</li>
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
	public static final MMBusinessAssociationEnd mmBankingTransaction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BankingTransaction";
			definition = "Transaction executed by the client of a financial institution from/to the account serviced by the financial institution, such as mortgage payment.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.BankingTransaction.mmPaymentObligation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BankingTransaction.mmObject();
		}
	};
	protected PaymentTerms paymentTerms;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentTerms#mmRelatedPaymentObligation
	 * PaymentTerms.mmRelatedPaymentObligation}</li>
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
	 * {@linkplain com.tools20022.repository.msg.TradeContract1#mmPaymentSchedule
	 * TradeContract1.mmPaymentSchedule}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LoanContract1#mmPaymentSchedule
	 * LoanContract1.mmPaymentSchedule}</li>
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
	public static final MMBusinessAssociationEnd mmPaymentTerms = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(TradeContract1.mmPaymentSchedule, LoanContract1.mmPaymentSchedule);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentTerms";
			definition = "Specifies the payment terms of the obligation.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentTerms.mmRelatedPaymentObligation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentTerms.mmObject();
		}
	};
	protected ISODate paymentDueDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.TransactionCertificateContract1#mmExpectedAdvancePaymentReturnDate
	 * TransactionCertificateContract1.mmExpectedAdvancePaymentReturnDate}</li>
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
	public static final MMBusinessAttribute mmPaymentDueDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TransactionCertificateContract1.mmExpectedAdvancePaymentReturnDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentDueDate";
			definition = "Due date for the payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentObligation.class.getMethod("getPaymentDueDate", new Class[]{});
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
				name = "PaymentObligation";
				definition = "Obligation for the debtor to pay the creditor an amount of cash.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Dividend.mmObligation, com.tools20022.repository.entity.ContactPoint.mmRemittanceRelatedPayment,
						com.tools20022.repository.entity.Document.mmPaymentObligation, com.tools20022.repository.entity.Payment.mmPaymentObligation, com.tools20022.repository.entity.PortfolioTransfer.mmPaymentObligation,
						com.tools20022.repository.entity.CashAccountContract.mmBalanceTransfer, com.tools20022.repository.entity.SecuritiesTradeExecution.mmPaymentObligation,
						com.tools20022.repository.entity.ForeignExchangeTrade.mmResultingSettlement, com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.mmCashProceedsMovement,
						com.tools20022.repository.entity.PaymentObligationPartyRole.mmPaymentObligation, com.tools20022.repository.entity.Demand.mmPayment, com.tools20022.repository.entity.CurrencyOption.mmPremiumSettlement,
						com.tools20022.repository.entity.CommercialTrade.mmPaymentObligation, com.tools20022.repository.entity.CollateralMovement.mmCashCollateralMovement, com.tools20022.repository.entity.BuyIn.mmCashCompensation,
						com.tools20022.repository.entity.BankingTransaction.mmPaymentObligation, com.tools20022.repository.entity.RepurchaseAgreement.mmPaymentObligation, com.tools20022.repository.entity.Assignment.mmPaymentObligation,
						com.tools20022.repository.entity.PaymentTerms.mmRelatedPaymentObligation, com.tools20022.repository.entity.InterestManagement.mmPaymentObligation);
				subType_lazy = () -> Arrays.asList(Instalment.mmObject(), Garnishment.mmObject());
				superType_lazy = () -> Obligation.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentObligation.mmPaymentOffset, com.tools20022.repository.entity.PaymentObligation.mmPurpose,
						com.tools20022.repository.entity.PaymentObligation.mmRemittanceDeliveryMethod, com.tools20022.repository.entity.PaymentObligation.mmAssociatedDocument, com.tools20022.repository.entity.PaymentObligation.mmAmount,
						com.tools20022.repository.entity.PaymentObligation.mmRemittanceLocation, com.tools20022.repository.entity.PaymentObligation.mmInterest, com.tools20022.repository.entity.PaymentObligation.mmCommercialTrade,
						com.tools20022.repository.entity.PaymentObligation.mmPercentage, com.tools20022.repository.entity.PaymentObligation.mmMaximumAmount, com.tools20022.repository.entity.PaymentObligation.mmExpiryDate,
						com.tools20022.repository.entity.PaymentObligation.mmApplicableLaw, com.tools20022.repository.entity.PaymentObligation.mmPaymentSourceBuyIn,
						com.tools20022.repository.entity.PaymentObligation.mmRelatedCorporateAction, com.tools20022.repository.entity.PaymentObligation.mmRelatedCollateralMovement,
						com.tools20022.repository.entity.PaymentObligation.mmPaymentSourceUndertakingDemand, com.tools20022.repository.entity.PaymentObligation.mmPartyRole,
						com.tools20022.repository.entity.PaymentObligation.mmExecutedSecuritiesTrade, com.tools20022.repository.entity.PaymentObligation.mmRelatedAccountClosingTerms,
						com.tools20022.repository.entity.PaymentObligation.mmPaymentSourcePortfolioTransfer, com.tools20022.repository.entity.PaymentObligation.mmPaymentSourceCurrencyOption,
						com.tools20022.repository.entity.PaymentObligation.mmExchangeRateInformation, com.tools20022.repository.entity.PaymentObligation.mmDividend, com.tools20022.repository.entity.PaymentObligation.mmRepurchaseAgreement,
						com.tools20022.repository.entity.PaymentObligation.mmRelatedAssignment, com.tools20022.repository.entity.PaymentObligation.mmBankingTransaction, com.tools20022.repository.entity.PaymentObligation.mmPaymentTerms,
						com.tools20022.repository.entity.PaymentObligation.mmPaymentDueDate);
				derivationComponent_lazy = () -> Arrays.asList(Purpose2Choice.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return PaymentObligation.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<Payment> getPaymentOffset() {
		return paymentOffset == null ? paymentOffset = new ArrayList<>() : paymentOffset;
	}

	public PaymentObligation setPaymentOffset(List<com.tools20022.repository.entity.Payment> paymentOffset) {
		this.paymentOffset = Objects.requireNonNull(paymentOffset);
		return this;
	}

	public PaymentPurposeCode getPurpose() {
		return purpose;
	}

	public PaymentObligation setPurpose(PaymentPurposeCode purpose) {
		this.purpose = Objects.requireNonNull(purpose);
		return this;
	}

	public RemittanceLocationMethodCode getRemittanceDeliveryMethod() {
		return remittanceDeliveryMethod;
	}

	public PaymentObligation setRemittanceDeliveryMethod(RemittanceLocationMethodCode remittanceDeliveryMethod) {
		this.remittanceDeliveryMethod = Objects.requireNonNull(remittanceDeliveryMethod);
		return this;
	}

	public List<Document> getAssociatedDocument() {
		return associatedDocument == null ? associatedDocument = new ArrayList<>() : associatedDocument;
	}

	public PaymentObligation setAssociatedDocument(List<com.tools20022.repository.entity.Document> associatedDocument) {
		this.associatedDocument = Objects.requireNonNull(associatedDocument);
		return this;
	}

	public CurrencyAndAmount getAmount() {
		return amount;
	}

	public PaymentObligation setAmount(CurrencyAndAmount amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}

	public List<ContactPoint> getRemittanceLocation() {
		return remittanceLocation == null ? remittanceLocation = new ArrayList<>() : remittanceLocation;
	}

	public PaymentObligation setRemittanceLocation(List<com.tools20022.repository.entity.ContactPoint> remittanceLocation) {
		this.remittanceLocation = Objects.requireNonNull(remittanceLocation);
		return this;
	}

	public List<InterestManagement> getInterest() {
		return interest == null ? interest = new ArrayList<>() : interest;
	}

	public PaymentObligation setInterest(List<com.tools20022.repository.entity.InterestManagement> interest) {
		this.interest = Objects.requireNonNull(interest);
		return this;
	}

	public CommercialTrade getCommercialTrade() {
		return commercialTrade;
	}

	public PaymentObligation setCommercialTrade(com.tools20022.repository.entity.CommercialTrade commercialTrade) {
		this.commercialTrade = Objects.requireNonNull(commercialTrade);
		return this;
	}

	public PercentageRate getPercentage() {
		return percentage;
	}

	public PaymentObligation setPercentage(PercentageRate percentage) {
		this.percentage = Objects.requireNonNull(percentage);
		return this;
	}

	public CurrencyAndAmount getMaximumAmount() {
		return maximumAmount;
	}

	public PaymentObligation setMaximumAmount(CurrencyAndAmount maximumAmount) {
		this.maximumAmount = Objects.requireNonNull(maximumAmount);
		return this;
	}

	public ISODateTime getExpiryDate() {
		return expiryDate;
	}

	public PaymentObligation setExpiryDate(ISODateTime expiryDate) {
		this.expiryDate = Objects.requireNonNull(expiryDate);
		return this;
	}

	public CountryCode getApplicableLaw() {
		return applicableLaw;
	}

	public PaymentObligation setApplicableLaw(CountryCode applicableLaw) {
		this.applicableLaw = Objects.requireNonNull(applicableLaw);
		return this;
	}

	public Optional<BuyIn> getPaymentSourceBuyIn() {
		return paymentSourceBuyIn == null ? Optional.empty() : Optional.of(paymentSourceBuyIn);
	}

	public PaymentObligation setPaymentSourceBuyIn(com.tools20022.repository.entity.BuyIn paymentSourceBuyIn) {
		this.paymentSourceBuyIn = paymentSourceBuyIn;
		return this;
	}

	public CorporateActionProceedsDeliveryInstruction getRelatedCorporateAction() {
		return relatedCorporateAction;
	}

	public PaymentObligation setRelatedCorporateAction(com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction relatedCorporateAction) {
		this.relatedCorporateAction = Objects.requireNonNull(relatedCorporateAction);
		return this;
	}

	public CollateralMovement getRelatedCollateralMovement() {
		return relatedCollateralMovement;
	}

	public PaymentObligation setRelatedCollateralMovement(com.tools20022.repository.entity.CollateralMovement relatedCollateralMovement) {
		this.relatedCollateralMovement = Objects.requireNonNull(relatedCollateralMovement);
		return this;
	}

	public Demand getPaymentSourceUndertakingDemand() {
		return paymentSourceUndertakingDemand;
	}

	public PaymentObligation setPaymentSourceUndertakingDemand(com.tools20022.repository.entity.Demand paymentSourceUndertakingDemand) {
		this.paymentSourceUndertakingDemand = Objects.requireNonNull(paymentSourceUndertakingDemand);
		return this;
	}

	public List<PaymentObligationPartyRole> getPartyRole() {
		return partyRole == null ? partyRole = new ArrayList<>() : partyRole;
	}

	public PaymentObligation setPartyRole(List<com.tools20022.repository.entity.PaymentObligationPartyRole> partyRole) {
		this.partyRole = Objects.requireNonNull(partyRole);
		return this;
	}

	public SecuritiesTradeExecution getExecutedSecuritiesTrade() {
		return executedSecuritiesTrade;
	}

	public PaymentObligation setExecutedSecuritiesTrade(com.tools20022.repository.entity.SecuritiesTradeExecution executedSecuritiesTrade) {
		this.executedSecuritiesTrade = Objects.requireNonNull(executedSecuritiesTrade);
		return this;
	}

	public Optional<CashAccountContract> getRelatedAccountClosingTerms() {
		return relatedAccountClosingTerms == null ? Optional.empty() : Optional.of(relatedAccountClosingTerms);
	}

	public PaymentObligation setRelatedAccountClosingTerms(com.tools20022.repository.entity.CashAccountContract relatedAccountClosingTerms) {
		this.relatedAccountClosingTerms = relatedAccountClosingTerms;
		return this;
	}

	public List<PortfolioTransfer> getPaymentSourcePortfolioTransfer() {
		return paymentSourcePortfolioTransfer == null ? paymentSourcePortfolioTransfer = new ArrayList<>() : paymentSourcePortfolioTransfer;
	}

	public PaymentObligation setPaymentSourcePortfolioTransfer(List<com.tools20022.repository.entity.PortfolioTransfer> paymentSourcePortfolioTransfer) {
		this.paymentSourcePortfolioTransfer = Objects.requireNonNull(paymentSourcePortfolioTransfer);
		return this;
	}

	public Optional<CurrencyOption> getPaymentSourceCurrencyOption() {
		return paymentSourceCurrencyOption == null ? Optional.empty() : Optional.of(paymentSourceCurrencyOption);
	}

	public PaymentObligation setPaymentSourceCurrencyOption(com.tools20022.repository.entity.CurrencyOption paymentSourceCurrencyOption) {
		this.paymentSourceCurrencyOption = paymentSourceCurrencyOption;
		return this;
	}

	public Optional<ForeignExchangeTrade> getExchangeRateInformation() {
		return exchangeRateInformation == null ? Optional.empty() : Optional.of(exchangeRateInformation);
	}

	public PaymentObligation setExchangeRateInformation(com.tools20022.repository.entity.ForeignExchangeTrade exchangeRateInformation) {
		this.exchangeRateInformation = exchangeRateInformation;
		return this;
	}

	public Dividend getDividend() {
		return dividend;
	}

	public PaymentObligation setDividend(com.tools20022.repository.entity.Dividend dividend) {
		this.dividend = Objects.requireNonNull(dividend);
		return this;
	}

	public RepurchaseAgreement getRepurchaseAgreement() {
		return repurchaseAgreement;
	}

	public PaymentObligation setRepurchaseAgreement(com.tools20022.repository.entity.RepurchaseAgreement repurchaseAgreement) {
		this.repurchaseAgreement = Objects.requireNonNull(repurchaseAgreement);
		return this;
	}

	public Assignment getRelatedAssignment() {
		return relatedAssignment;
	}

	public PaymentObligation setRelatedAssignment(com.tools20022.repository.entity.Assignment relatedAssignment) {
		this.relatedAssignment = Objects.requireNonNull(relatedAssignment);
		return this;
	}

	public BankingTransaction getBankingTransaction() {
		return bankingTransaction;
	}

	public PaymentObligation setBankingTransaction(com.tools20022.repository.entity.BankingTransaction bankingTransaction) {
		this.bankingTransaction = Objects.requireNonNull(bankingTransaction);
		return this;
	}

	public PaymentTerms getPaymentTerms() {
		return paymentTerms;
	}

	public PaymentObligation setPaymentTerms(com.tools20022.repository.entity.PaymentTerms paymentTerms) {
		this.paymentTerms = Objects.requireNonNull(paymentTerms);
		return this;
	}

	public ISODate getPaymentDueDate() {
		return paymentDueDate;
	}

	public PaymentObligation setPaymentDueDate(ISODate paymentDueDate) {
		this.paymentDueDate = Objects.requireNonNull(paymentDueDate);
		return this;
	}
}