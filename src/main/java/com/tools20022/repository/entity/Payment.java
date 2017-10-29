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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ImpliedCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.entity.ObligationFulfilment;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Payment information and processes required to transfer cash end to end from
 * the debtor to the creditor.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Payment" src="doc-files/Payment.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#PaymentObligation
 * Payment.PaymentObligation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#CurrencyOfTransfer
 * Payment.CurrencyOfTransfer}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#CreditMethod
 * Payment.CreditMethod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#Type Payment.Type}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#InstructedAmount
 * Payment.InstructedAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#Priority
 * Payment.Priority}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#ValueDate
 * Payment.ValueDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#PaymentStatus
 * Payment.PaymentStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#PartyRole
 * Payment.PartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#TaxOnPayment
 * Payment.TaxOnPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#PaymentExecution
 * Payment.PaymentExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#PoolingAdjustmentDate
 * Payment.PoolingAdjustmentDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#EquivalentAmount
 * Payment.EquivalentAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#CurrencyExchange
 * Payment.CurrencyExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#InstructionForCreditorAgent
 * Payment.InstructionForCreditorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#InstructionForDebtorAgent
 * Payment.InstructionForDebtorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#PaymentRelatedIdentifications
 * Payment.PaymentRelatedIdentifications}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#RelatedInvestigationCase
 * Payment.RelatedInvestigationCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#SettlementTimeRequest
 * Payment.SettlementTimeRequest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#Amount
 * Payment.Amount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#TradeSettlement
 * Payment.TradeSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#StandardSettlementInstructions
 * Payment.StandardSettlementInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#RelatedDebitAuthorisation
 * Payment.RelatedDebitAuthorisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#RelatedInvestigationCaseResolution
 * Payment.RelatedInvestigationCaseResolution}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#OriginalPayment
 * Payment.OriginalPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#ReturnPayment
 * Payment.ReturnPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#RelatedSecuritiesSettlement
 * Payment.RelatedSecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#InvoiceReconciliation
 * Payment.InvoiceReconciliation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#PaymentInstrument
 * Payment.PaymentInstrument}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#Account
 * Payment.Account}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#Adjustments
 * Payment.Adjustments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#ContractRegistration
 * Payment.ContractRegistration}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CashAccount#Payment
 * CashAccount.Payment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Tax#RelatedPaymentSettlement
 * Tax.RelatedPaymentSettlement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#Payment
 * Adjustment.Payment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#PaymentOffset
 * PaymentObligation.PaymentOffset}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#OriginalPayment
 * Payment.OriginalPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#ReturnPayment
 * Payment.ReturnPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CreditInstrument#RelatedPayment
 * CreditInstrument.RelatedPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentExecution#Payment
 * PaymentExecution.Payment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#Payment
 * PaymentIdentification.Payment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentPartyRole#Payment
 * PaymentPartyRole.Payment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentStatus#Payment
 * PaymentStatus.Payment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#Payment
 * SecuritiesSettlement.Payment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#RelatedPayment
 * CurrencyExchange.RelatedPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Invoice#Payment
 * Invoice.Payment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase#UnderlyingPayment
 * PaymentInvestigationCase.UnderlyingPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SettlementTimeRequest#Payment
 * SettlementTimeRequest.Payment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DebitAuthorisation#AuthorisedReturn
 * DebitAuthorisation.AuthorisedReturn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#PaymentCorrection
 * PaymentInvestigationCaseResolution.PaymentCorrection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommercialTradeSettlement#Payment
 * CommercialTradeSettlement.Payment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegisteredContract#RelatedPayment
 * RegisteredContract.RelatedPayment}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference18#OriginalTransaction
 * OriginalTransactionReference18.OriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContractRegistrationStatement1#TransactionJournal
 * ContractRegistrationStatement1.TransactionJournal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionCertificateRecord1#Transaction
 * TransactionCertificateRecord1.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalItem5#OriginalItemReference
 * OriginalItem5.OriginalItemReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus5#OriginalItemReference
 * OriginalItemAndStatus5.OriginalItemReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnderlyingTransaction3Choice#Interbank
 * UnderlyingTransaction3Choice.Interbank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction80#OriginalTransactionReference
 * PaymentTransaction80.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction81#OriginalTransactionReference
 * PaymentTransaction81.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction23#TransactionInformationAndStatus
 * OriginalPaymentInstruction23.TransactionInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction21#TransactionInformation
 * OriginalPaymentInstruction21.TransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction24#TransactionInformationAndStatus
 * OriginalPaymentInstruction24.TransactionInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction76#OriginalTransactionReference
 * PaymentTransaction76.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorrectiveTransaction2Choice#Interbank
 * CorrectiveTransaction2Choice.Interbank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction22#OriginalGroupInformation
 * OriginalPaymentInstruction22.OriginalGroupInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction22#TransactionInformationAndStatus
 * OriginalPaymentInstruction22.TransactionInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction78#OriginalTransactionReference
 * PaymentTransaction78.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction20#OriginalGroupInformation
 * OriginalPaymentInstruction20.OriginalGroupInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction20#TransactionInformation
 * OriginalPaymentInstruction20.TransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction74#OriginalTransactionReference
 * PaymentTransaction74.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation7#Amount
 * OriginalPaymentInformation7.Amount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction83#OriginalTransactionReference
 * PaymentTransaction83.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction77#OriginalTransactionReference
 * PaymentTransaction77.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction75#OriginalTransactionReference
 * PaymentTransaction75.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction82#OriginalTransactionReference
 * PaymentTransaction82.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79#OriginalTransactionReference
 * PaymentTransaction79.OriginalTransactionReference}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.IndividualPayment
 * IndividualPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.BulkPayment BulkPayment}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.ObligationFulfilment
 * ObligationFulfilment}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader58 GroupHeader58}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InstructionForCreditorAgent1
 * InstructionForCreditorAgent1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CategoryPurpose1Choice
 * CategoryPurpose1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EquivalentAmount2
 * EquivalentAmount2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AmountType3Choice
 * AmountType3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader48 GroupHeader48}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader55 GroupHeader55}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalGroupInformation3
 * OriginalGroupInformation3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader56 GroupHeader56}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader52 GroupHeader52}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader50 GroupHeader50}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader53 GroupHeader53}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InstructionForCreditorAgent2
 * InstructionForCreditorAgent2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader47 GroupHeader47}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader46 GroupHeader46}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader45 GroupHeader45}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalTransactionReference18
 * OriginalTransactionReference18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader59 GroupHeader59}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorrectiveInterbankTransaction1
 * CorrectiveInterbankTransaction1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader60 GroupHeader60}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentInstrumentType1
 * PaymentInstrumentType1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader63 GroupHeader63}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CreditTransferTransaction9
 * CreditTransferTransaction9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader62 GroupHeader62}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AmountType4Choice
 * AmountType4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionCertificate2
 * TransactionCertificate2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SpecialCondition1
 * SpecialCondition1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader70 GroupHeader70}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader72 GroupHeader72}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader71 GroupHeader71}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalItem5 OriginalItem5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalItemAndStatus5
 * OriginalItemAndStatus5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalItemReference4
 * OriginalItemReference4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NotificationItem6
 * NotificationItem6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalMessage2
 * OriginalMessage2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalMessage3
 * OriginalMessage3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalGroupInformation27
 * OriginalGroupInformation27}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction73
 * PaymentTransaction73}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnderlyingTransaction3Choice
 * UnderlyingTransaction3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction80
 * PaymentTransaction80}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction81
 * PaymentTransaction81}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction23
 * OriginalPaymentInstruction23}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction21
 * OriginalPaymentInstruction21}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction24
 * OriginalPaymentInstruction24}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalGroupInformation28
 * OriginalGroupInformation28}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction76
 * PaymentTransaction76}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorrectiveTransaction2Choice
 * CorrectiveTransaction2Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MandateClassification1Choice
 * MandateClassification1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction22
 * OriginalPaymentInstruction22}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction78
 * PaymentTransaction78}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalTransactionReference24
 * OriginalTransactionReference24}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction20
 * OriginalPaymentInstruction20}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction74
 * PaymentTransaction74}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalPaymentInformation7
 * OriginalPaymentInformation7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction83
 * PaymentTransaction83}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalTransactionReference26
 * OriginalTransactionReference26}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction77
 * PaymentTransaction77}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction75
 * PaymentTransaction75}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction82
 * PaymentTransaction82}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction79
 * PaymentTransaction79}</li>
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
 * "Payment"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Payment information and processes required to transfer cash end to end from the debtor to the creditor."
 * </li>
 * </ul>
 */
public class Payment extends ObligationFulfilment {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the obligation which created the payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#PaymentOffset
	 * PaymentObligation.PaymentOffset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentObligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the obligation which created the payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PaymentObligation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Payment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentObligation";
			definition = "Specifies the obligation which created the payment.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentObligation.PaymentOffset;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the currency of the amount to be transferred which may be
	 * different from the currency of the debtor's account.
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
	 * {@linkplain com.tools20022.repository.msg.EquivalentAmount2#CurrencyOfTransfer
	 * EquivalentAmount2.CurrencyOfTransfer}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyOfTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the currency of the amount to be transferred which may be different from the currency of the debtor's account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CurrencyOfTransfer = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.EquivalentAmount2.CurrencyOfTransfer);
			elementContext_lazy = () -> Payment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyOfTransfer";
			definition = "Specifies the currency of the amount to be transferred which may be different from the currency of the debtor's account.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Specifies the transfer method to be used for the credit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CreditInstrument#RelatedPayment
	 * CreditInstrument.RelatedPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CreditInstrument
	 * CreditInstrument}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference26#PaymentMethod
	 * OriginalTransactionReference26.PaymentMethod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the transfer method to be used for the credit."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CreditMethod = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OriginalTransactionReference26.PaymentMethod);
			elementContext_lazy = () -> Payment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditMethod";
			definition = "Specifies the transfer method to be used for the credit.";
			minOccurs = 1;
			type_lazy = () -> CreditInstrument.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CreditInstrument.RelatedPayment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Type, or nature, of the payment, eg, express payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAggregated1#TransactionCategory
	 * CardAggregated1.TransactionCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction2#TransactionCategory
	 * CardIndividualTransaction2.TransactionCategory}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type, or nature, of the payment, eg, express payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardAggregated1.TransactionCategory, com.tools20022.repository.msg.CardIndividualTransaction2.TransactionCategory);
			elementContext_lazy = () -> Payment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Type, or nature, of the payment, eg, express payment.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PaymentTypeCode.mmObject();
		}
	};
	/**
	 * Amount of money to be moved between the debtor and creditor, before
	 * deduction of charges, expressed in the currency as ordered by the
	 * initiating party.
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
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchange3#InstructedAmount
	 * AmountAndCurrencyExchange3.InstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AmountType3Choice#InstructedAmount
	 * AmountType3Choice.InstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AmountType4Choice#InstructedAmount
	 * AmountType4Choice.InstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SpecialCondition1#IncomingAmount
	 * SpecialCondition1.IncomingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SpecialCondition1#OutgoingAmount
	 * SpecialCondition1.OutgoingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SpecialCondition1#IncomingAmountToOtherAccount
	 * SpecialCondition1.IncomingAmountToOtherAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SpecialCondition1#PaymentFromOtherAccount
	 * SpecialCondition1.PaymentFromOtherAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#InstructedAmount
	 * CreditTransferTransaction25.InstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction24#InstructedAmount
	 * CreditTransferTransaction24.InstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#Amount
	 * CreditTransferTransaction26.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OriginalItem5#Amount
	 * OriginalItem5.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction22#Amount
	 * CreditTransferTransaction22.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#InstructedAmount
	 * DirectDebitTransactionInformation21.InstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction81#ReversedInstructedAmount
	 * PaymentTransaction81.ReversedInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification6#Amount
	 * RequestedModification6.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction76#ReturnedInstructedAmount
	 * PaymentTransaction76.ReturnedInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction78#OriginalInstructedAmount
	 * PaymentTransaction78.OriginalInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference24#Amount
	 * OriginalTransactionReference24.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction74#OriginalInstructedAmount
	 * PaymentTransaction74.OriginalInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction77#OriginalInstructedAmount
	 * PaymentTransaction77.OriginalInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction77#ReversedInstructedAmount
	 * PaymentTransaction77.ReversedInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation22#InstructedAmount
	 * DirectDebitTransactionInformation22.InstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInitiation2#InstructedAmount
	 * CorrectivePaymentInitiation2.InstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction3#OriginalInstructedAmount
	 * UnderlyingPaymentInstruction3.OriginalInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#Amount
	 * PaymentComplementaryInformation6.Amount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money to be moved between the debtor and creditor, before deduction of charges, expressed in the currency as ordered by the initiating party."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute InstructedAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AmountAndCurrencyExchange3.InstructedAmount, com.tools20022.repository.choice.AmountType3Choice.InstructedAmount,
					com.tools20022.repository.choice.AmountType4Choice.InstructedAmount, com.tools20022.repository.msg.SpecialCondition1.IncomingAmount, com.tools20022.repository.msg.SpecialCondition1.OutgoingAmount,
					com.tools20022.repository.msg.SpecialCondition1.IncomingAmountToOtherAccount, com.tools20022.repository.msg.SpecialCondition1.PaymentFromOtherAccount,
					com.tools20022.repository.msg.CreditTransferTransaction25.InstructedAmount, com.tools20022.repository.msg.CreditTransferTransaction24.InstructedAmount, com.tools20022.repository.msg.CreditTransferTransaction26.Amount,
					com.tools20022.repository.msg.OriginalItem5.Amount, com.tools20022.repository.msg.CreditTransferTransaction22.Amount, com.tools20022.repository.msg.DirectDebitTransactionInformation21.InstructedAmount,
					com.tools20022.repository.msg.PaymentTransaction81.ReversedInstructedAmount, com.tools20022.repository.msg.RequestedModification6.Amount, com.tools20022.repository.msg.PaymentTransaction76.ReturnedInstructedAmount,
					com.tools20022.repository.msg.PaymentTransaction78.OriginalInstructedAmount, com.tools20022.repository.msg.OriginalTransactionReference24.Amount,
					com.tools20022.repository.msg.PaymentTransaction74.OriginalInstructedAmount, com.tools20022.repository.msg.PaymentTransaction77.OriginalInstructedAmount,
					com.tools20022.repository.msg.PaymentTransaction77.ReversedInstructedAmount, com.tools20022.repository.msg.DirectDebitTransactionInformation22.InstructedAmount,
					com.tools20022.repository.msg.CorrectivePaymentInitiation2.InstructedAmount, com.tools20022.repository.msg.UnderlyingPaymentInstruction3.OriginalInstructedAmount,
					com.tools20022.repository.msg.PaymentComplementaryInformation6.Amount);
			elementContext_lazy = () -> Payment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InstructedAmount";
			definition = "Amount of money to be moved between the debtor and creditor, before deduction of charges, expressed in the currency as ordered by the initiating party.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Urgency or order of importance that the originator would like the
	 * recipient of the payment to apply to its processing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.PriorityCode
	 * PriorityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Cheque7#InstructionPriority
	 * Cheque7.InstructionPriority}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Priority"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Urgency or order of importance that the originator would like the recipient of the payment  to apply to its processing."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Priority = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Cheque7.InstructionPriority);
			elementContext_lazy = () -> Payment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Priority";
			definition = "Urgency or order of importance that the originator would like the recipient of the payment  to apply to its processing.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PriorityCode.mmObject();
		}
	};
	/**
	 * Date on which a payment must be executed
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
	 * {@linkplain com.tools20022.repository.msg.AccountNotification13#ExpectedValueDate
	 * AccountNotification13.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference8#ExpectedValueDate
	 * OriginalNotificationReference8.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItem5#ExpectedValueDate
	 * OriginalItem5.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus5#ExpectedValueDate
	 * OriginalItemAndStatus5.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference7#ExpectedValueDate
	 * OriginalNotificationReference7.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem6#ExpectedValueDate
	 * NotificationItem6.ExpectedValueDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which a payment must be executed"</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ValueDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountNotification13.ExpectedValueDate, com.tools20022.repository.msg.OriginalNotificationReference8.ExpectedValueDate,
					com.tools20022.repository.msg.OriginalItem5.ExpectedValueDate, com.tools20022.repository.msg.OriginalItemAndStatus5.ExpectedValueDate, com.tools20022.repository.msg.OriginalNotificationReference7.ExpectedValueDate,
					com.tools20022.repository.msg.NotificationItem6.ExpectedValueDate);
			elementContext_lazy = () -> Payment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValueDate";
			definition = "Date on which a payment must be executed";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Specifies the status of a payment at a specified time.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus#Payment
	 * PaymentStatus.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentStatus
	 * PaymentStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader3#ReversalReasonInformation
	 * OriginalGroupHeader3.ReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#ReturnInformation
	 * EntryTransaction8.ReturnInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction80#TransactionStatus
	 * PaymentTransaction80.TransactionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction78#TransactionCancellationStatus
	 * PaymentTransaction78.TransactionCancellationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction83#TransactionStatus
	 * PaymentTransaction83.TransactionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction82#TransactionStatus
	 * PaymentTransaction82.TransactionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79#TransactionCancellationStatus
	 * PaymentTransaction79.TransactionCancellationStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the status of a payment at a specified time."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PaymentStatus = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OriginalGroupHeader3.ReversalReasonInformation, com.tools20022.repository.msg.EntryTransaction8.ReturnInformation,
					com.tools20022.repository.msg.PaymentTransaction80.TransactionStatus, com.tools20022.repository.msg.PaymentTransaction78.TransactionCancellationStatus,
					com.tools20022.repository.msg.PaymentTransaction83.TransactionStatus, com.tools20022.repository.msg.PaymentTransaction82.TransactionStatus,
					com.tools20022.repository.msg.PaymentTransaction79.TransactionCancellationStatus);
			elementContext_lazy = () -> Payment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentStatus";
			definition = "Specifies the status of a payment at a specified time.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.PaymentStatus.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentStatus.Payment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies each role linked to a payment and played by a party at that
	 * step in a payment flow.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#Payment
	 * PaymentPartyRole.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentPartyRole
	 * PaymentPartyRole}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#RelatedParties
	 * EntryTransaction8.RelatedParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#RelatedAgents
	 * EntryTransaction8.RelatedAgents}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies each role linked to a payment and played by a party at that step in a payment flow."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PartyRole = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.EntryTransaction8.RelatedParties, com.tools20022.repository.msg.EntryTransaction8.RelatedAgents);
			elementContext_lazy = () -> Payment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies each role linked to a payment and played by a party at that step in a payment flow.";
			minOccurs = 1;
			type_lazy = () -> PaymentPartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentPartyRole.Payment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Payment levy tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Tax#RelatedPaymentSettlement
	 * Tax.RelatedPaymentSettlement}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#Tax
	 * CreditTransferTransaction25.Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction24#Tax
	 * CreditTransferTransaction24.Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#Tax
	 * CreditTransferTransaction26.Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation13#TaxRemittance
	 * StructuredRemittanceInformation13.TaxRemittance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction22#Tax
	 * CreditTransferTransaction22.Tax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction8#Tax
	 * EntryTransaction8.Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation22#Tax
	 * DirectDebitTransactionInformation22.Tax}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxOnPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment levy tax."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TaxOnPayment = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CreditTransferTransaction25.Tax, com.tools20022.repository.msg.CreditTransferTransaction24.Tax, com.tools20022.repository.msg.CreditTransferTransaction26.Tax,
					com.tools20022.repository.msg.StructuredRemittanceInformation13.TaxRemittance, com.tools20022.repository.msg.CreditTransferTransaction22.Tax, com.tools20022.repository.msg.EntryTransaction8.Tax,
					com.tools20022.repository.msg.DirectDebitTransactionInformation22.Tax);
			elementContext_lazy = () -> Payment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxOnPayment";
			definition = "Payment levy tax.";
			minOccurs = 0;
			type_lazy = () -> Tax.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Tax.RelatedPaymentSettlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Describes the processes necessary to execute a payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution#Payment
	 * PaymentExecution.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentExecution
	 * PaymentExecution}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation15#PaymentTypeInformation
	 * DirectDebitTransactionInformation15.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyControlGroupStatus1#OriginalReferences
	 * CurrencyControlGroupStatus1.OriginalReferences}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#RelatedDates
	 * EntryTransaction8.RelatedDates}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#PaymentTypeInformation
	 * DirectDebitTransactionInformation21.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction81#OriginalGroupInformation
	 * PaymentTransaction81.OriginalGroupInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction76#OriginalGroupInformation
	 * PaymentTransaction76.OriginalGroupInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorrectiveTransaction2Choice#Initiation
	 * CorrectiveTransaction2Choice.Initiation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation22#PaymentTypeInformation
	 * DirectDebitTransactionInformation22.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction75#OriginalGroupInformation
	 * PaymentTransaction75.OriginalGroupInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79#OriginalGroupInformation
	 * PaymentTransaction79.OriginalGroupInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentExecution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Describes the processes necessary to execute a payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PaymentExecution = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DirectDebitTransactionInformation15.PaymentTypeInformation, com.tools20022.repository.msg.CurrencyControlGroupStatus1.OriginalReferences,
					com.tools20022.repository.msg.EntryTransaction8.RelatedDates, com.tools20022.repository.msg.DirectDebitTransactionInformation21.PaymentTypeInformation,
					com.tools20022.repository.msg.PaymentTransaction81.OriginalGroupInformation, com.tools20022.repository.msg.PaymentTransaction76.OriginalGroupInformation,
					com.tools20022.repository.choice.CorrectiveTransaction2Choice.Initiation, com.tools20022.repository.msg.DirectDebitTransactionInformation22.PaymentTypeInformation,
					com.tools20022.repository.msg.PaymentTransaction75.OriginalGroupInformation, com.tools20022.repository.msg.PaymentTransaction79.OriginalGroupInformation);
			elementContext_lazy = () -> Payment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentExecution";
			definition = "Describes the processes necessary to execute a payment.";
			minOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.PaymentExecution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentExecution.Payment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Date used for the correction of the value date of a cash pool movement
	 * that has been posted with a different value date.
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
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#PoolingAdjustmentDate
	 * CreditTransferTransaction25.PoolingAdjustmentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22#PoolingAdjustmentDate
	 * PaymentInstruction22.PoolingAdjustmentDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PoolingAdjustmentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date used for the correction of the value date of a cash pool movement that has been posted with a different value date."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PoolingAdjustmentDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CreditTransferTransaction25.PoolingAdjustmentDate, com.tools20022.repository.msg.PaymentInstruction22.PoolingAdjustmentDate);
			elementContext_lazy = () -> Payment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PoolingAdjustmentDate";
			definition = "Date used for the correction of the value date of a cash pool movement that has been posted with a different value date.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Amount of money to be transferred between debtor and creditor, before
	 * deduction of charges, expressed in the currency of the debtor's account,
	 * and to be transferred in a different currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.EquivalentAmount2#Amount
	 * EquivalentAmount2.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AmountType3Choice#EquivalentAmount
	 * AmountType3Choice.EquivalentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AmountType4Choice#EquivalentAmount
	 * AmountType4Choice.EquivalentAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EquivalentAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money to be transferred between debtor and creditor, before deduction of charges, expressed in the currency of the debtor's account, and to be transferred in a different currency."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute EquivalentAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.EquivalentAmount2.Amount, com.tools20022.repository.choice.AmountType3Choice.EquivalentAmount,
					com.tools20022.repository.choice.AmountType4Choice.EquivalentAmount);
			elementContext_lazy = () -> Payment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EquivalentAmount";
			definition = "Amount of money to be transferred between debtor and creditor, before deduction of charges, expressed in the currency of the debtor's account, and to be transferred in a different currency.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Information on the exchange rate and amounts used in the payment
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#RelatedPayment
	 * CurrencyExchange.RelatedPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#ExchangeRate
	 * CreditTransferTransaction25.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#ExchangeRateInformation
	 * CreditTransferTransaction26.ExchangeRateInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation7#ExchangeRateInformation
	 * OriginalPaymentInformation7.ExchangeRateInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information on the exchange rate and amounts used in the payment"</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CurrencyExchange = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CreditTransferTransaction25.ExchangeRate, com.tools20022.repository.msg.CreditTransferTransaction26.ExchangeRateInformation,
					com.tools20022.repository.msg.OriginalPaymentInformation7.ExchangeRateInformation);
			elementContext_lazy = () -> Payment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchange";
			definition = "Information on the exchange rate and amounts used in the payment";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.RelatedPayment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Further information related to the processing of the payment instruction
	 * that may need to be acted upon by the creditor agent. Usage: The
	 * instruction can relate to a level of service, can be an instruction to be
	 * executed by the creditor's agent, or can be information required by the
	 * creditor's agent to process the instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionCode
	 * InstructionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructionForCreditorAgent1#Code
	 * InstructionForCreditorAgent1.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructionForCreditorAgent2#Code
	 * InstructionForCreditorAgent2.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction9#InstructionForCreditorAgent
	 * CreditTransferTransaction9.InstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#InstructionForCreditorAgent
	 * CreditTransferTransaction23.InstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#InstructionForCreditorAgent
	 * CreditTransferTransaction25.InstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction24#InstructionForCreditorAgent
	 * CreditTransferTransaction24.InstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#InstructionForCreditorAgent
	 * CreditTransferTransaction26.InstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction22#InstructionForCreditorAgent
	 * CreditTransferTransaction22.InstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification6#InstructionForCreditorAgent
	 * RequestedModification6.InstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation22#InstructionForCreditorAgent
	 * DirectDebitTransactionInformation22.InstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#InstructionForCreditorAgent
	 * PaymentComplementaryInformation6.InstructionForCreditorAgent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionForCreditorAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Further information related to the processing of the payment instruction that may need to be acted upon by the creditor agent. \nUsage: The instruction can relate to a level of service, can be an instruction to be executed by the creditor's agent, or can be information required by the creditor's agent to process the instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute InstructionForCreditorAgent = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InstructionForCreditorAgent1.Code, com.tools20022.repository.msg.InstructionForCreditorAgent2.Code,
					com.tools20022.repository.msg.CreditTransferTransaction9.InstructionForCreditorAgent, com.tools20022.repository.msg.CreditTransferTransaction23.InstructionForCreditorAgent,
					com.tools20022.repository.msg.CreditTransferTransaction25.InstructionForCreditorAgent, com.tools20022.repository.msg.CreditTransferTransaction24.InstructionForCreditorAgent,
					com.tools20022.repository.msg.CreditTransferTransaction26.InstructionForCreditorAgent, com.tools20022.repository.msg.CreditTransferTransaction22.InstructionForCreditorAgent,
					com.tools20022.repository.msg.RequestedModification6.InstructionForCreditorAgent, com.tools20022.repository.msg.DirectDebitTransactionInformation22.InstructionForCreditorAgent,
					com.tools20022.repository.msg.PaymentComplementaryInformation6.InstructionForCreditorAgent);
			elementContext_lazy = () -> Payment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InstructionForCreditorAgent";
			definition = "Further information related to the processing of the payment instruction that may need to be acted upon by the creditor agent. \nUsage: The instruction can relate to a level of service, can be an instruction to be executed by the creditor's agent, or can be information required by the creditor's agent to process the instruction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> InstructionCode.mmObject();
		}
	};
	/**
	 * Further information related to the processing of the payment instruction
	 * that may need to be acted upon by the debtor's agent. Usage: The
	 * instruction can relate to a level of service, can be an instruction to be
	 * executed by the debtor's agent, or can be information required by the
	 * debtor's agent to process the instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionCode
	 * InstructionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation15#InstructionForDebtorAgent
	 * DirectDebitTransactionInformation15.InstructionForDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#InstructionForDebtorAgent
	 * CreditTransferTransaction26.InstructionForDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification6#InstructionForDebtorAgent
	 * RequestedModification6.InstructionForDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22#InstructionForDebtorAgent
	 * PaymentInstruction22.InstructionForDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#InstructionForDebtorAgent
	 * PaymentComplementaryInformation6.InstructionForDebtorAgent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionForDebtorAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Further information related to the processing of the payment instruction that may need to be acted upon by the debtor's agent.  \nUsage: The instruction can relate to a level of service, can be an instruction to be executed by the debtor's agent, or can be information required by the debtor's agent to process the instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute InstructionForDebtorAgent = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DirectDebitTransactionInformation15.InstructionForDebtorAgent, com.tools20022.repository.msg.CreditTransferTransaction26.InstructionForDebtorAgent,
					com.tools20022.repository.msg.RequestedModification6.InstructionForDebtorAgent, com.tools20022.repository.msg.PaymentInstruction22.InstructionForDebtorAgent,
					com.tools20022.repository.msg.PaymentComplementaryInformation6.InstructionForDebtorAgent);
			elementContext_lazy = () -> Payment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InstructionForDebtorAgent";
			definition = "Further information related to the processing of the payment instruction that may need to be acted upon by the debtor's agent.  \nUsage: The instruction can relate to a level of service, can be an instruction to be executed by the debtor's agent, or can be information required by the debtor's agent to process the instruction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> InstructionCode.mmObject();
		}
	};
	/**
	 * Identifications provided to identify a payment at different processing
	 * levels.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#Payment
	 * PaymentIdentification.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification
	 * PaymentIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation15#PaymentIdentification
	 * DirectDebitTransactionInformation15.PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RemittanceLocation3#References
	 * RemittanceLocation3.References}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#PaymentIdentification
	 * CreditTransferTransaction23.PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#PaymentIdentification
	 * CreditTransferTransaction25.PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#PaymentIdentification
	 * CreditTransferTransaction26.PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction22#PaymentIdentification
	 * CreditTransferTransaction22.PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#PaymentIdentification
	 * DirectDebitTransactionInformation21.PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation7#References
	 * OriginalPaymentInformation7.References}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation22#PaymentIdentification
	 * DirectDebitTransactionInformation22.PaymentIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentRelatedIdentifications"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifications provided to identify a payment at different processing levels."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PaymentRelatedIdentifications = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DirectDebitTransactionInformation15.PaymentIdentification, com.tools20022.repository.msg.RemittanceLocation3.References,
					com.tools20022.repository.msg.CreditTransferTransaction23.PaymentIdentification, com.tools20022.repository.msg.CreditTransferTransaction25.PaymentIdentification,
					com.tools20022.repository.msg.CreditTransferTransaction26.PaymentIdentification, com.tools20022.repository.msg.CreditTransferTransaction22.PaymentIdentification,
					com.tools20022.repository.msg.DirectDebitTransactionInformation21.PaymentIdentification, com.tools20022.repository.msg.OriginalPaymentInformation7.References,
					com.tools20022.repository.msg.DirectDebitTransactionInformation22.PaymentIdentification);
			elementContext_lazy = () -> Payment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentRelatedIdentifications";
			definition = "Identifications provided to identify a payment at different processing levels.";
			minOccurs = 0;
			type_lazy = () -> PaymentIdentification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentIdentification.Payment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Investigation case assigned to the payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase#UnderlyingPayment
	 * PaymentInvestigationCase.UnderlyingPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase
	 * PaymentInvestigationCase}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction78#ResolvedCase
	 * PaymentTransaction78.ResolvedCase}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction74#Case
	 * PaymentTransaction74.Case}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction75#Case
	 * PaymentTransaction75.Case}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79#ResolvedCase
	 * PaymentTransaction79.ResolvedCase}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedInvestigationCase"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Investigation case assigned to the payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedInvestigationCase = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentTransaction78.ResolvedCase, com.tools20022.repository.msg.PaymentTransaction74.Case, com.tools20022.repository.msg.PaymentTransaction75.Case,
					com.tools20022.repository.msg.PaymentTransaction79.ResolvedCase);
			elementContext_lazy = () -> Payment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestigationCase";
			definition = "Investigation case assigned to the payment.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> PaymentInvestigationCase.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCase.UnderlyingPayment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Information on the requested settlement time of the instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SettlementTimeRequest#Payment
	 * SettlementTimeRequest.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SettlementTimeRequest
	 * SettlementTimeRequest}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation15#SettlementTimeRequest
	 * DirectDebitTransactionInformation15.SettlementTimeRequest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#SettlementTimeRequest
	 * CreditTransferTransaction23.SettlementTimeRequest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#SettlementTimeRequest
	 * CreditTransferTransaction25.SettlementTimeRequest}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementTimeRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information on the requested settlement time of the instruction."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SettlementTimeRequest = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DirectDebitTransactionInformation15.SettlementTimeRequest, com.tools20022.repository.msg.CreditTransferTransaction23.SettlementTimeRequest,
					com.tools20022.repository.msg.CreditTransferTransaction25.SettlementTimeRequest);
			elementContext_lazy = () -> Payment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementTimeRequest";
			definition = "Information on the requested settlement time of the instruction.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SettlementTimeRequest.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SettlementTimeRequest.Payment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Amount of the payment.
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
	 * {@linkplain com.tools20022.repository.msg.TransactionCertificate2#Amount
	 * TransactionCertificate2.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus5#Amount
	 * OriginalItemAndStatus5.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NotificationItem6#Amount
	 * NotificationItem6.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference26#Amount
	 * OriginalTransactionReference26.Amount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of the payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Amount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionCertificate2.Amount, com.tools20022.repository.msg.OriginalItemAndStatus5.Amount, com.tools20022.repository.msg.NotificationItem6.Amount,
					com.tools20022.repository.msg.OriginalTransactionReference26.Amount);
			elementContext_lazy = () -> Payment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Amount of the payment.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies the settlement operation which originates the payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTradeSettlement#Payment
	 * CommercialTradeSettlement.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTradeSettlement
	 * CommercialTradeSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the settlement operation which originates the payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TradeSettlement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Payment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradeSettlement";
			definition = "Specifies the settlement operation which originates the payment.";
			minOccurs = 0;
			type_lazy = () -> CommercialTradeSettlement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CommercialTradeSettlement.Payment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Identifies the standard settlement instructions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandardSettlementInstructions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the standard settlement instructions."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute StandardSettlementInstructions = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Payment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StandardSettlementInstructions";
			definition = "Identifies the standard settlement instructions.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	/**
	 * Payment which is the result of the debit authorisation
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DebitAuthorisation#AuthorisedReturn
	 * DebitAuthorisation.AuthorisedReturn}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DebitAuthorisation
	 * DebitAuthorisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedDebitAuthorisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment which is the result of the debit authorisation"</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedDebitAuthorisation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Payment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedDebitAuthorisation";
			definition = "Payment which is the result of the debit authorisation";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> DebitAuthorisation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DebitAuthorisation.AuthorisedReturn;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Case resolution related to a specific payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#PaymentCorrection
	 * PaymentInvestigationCaseResolution.PaymentCorrection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution
	 * PaymentInvestigationCaseResolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedInvestigationCaseResolution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Case resolution related to a specific payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedInvestigationCaseResolution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Payment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestigationCaseResolution";
			definition = "Case resolution related to a specific payment.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> PaymentInvestigationCaseResolution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCaseResolution.PaymentCorrection;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Original payment which is returned.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Payment#ReturnPayment
	 * Payment.ReturnPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Original payment which is returned."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd OriginalPayment = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Payment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OriginalPayment";
			definition = "Original payment which is returned.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Payment.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.ReturnPayment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Payment which offsets an original payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Payment#OriginalPayment
	 * Payment.OriginalPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment which offsets an original payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ReturnPayment = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Payment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReturnPayment";
			definition = "Payment which offsets an original payment.";
			minOccurs = 0;
			type_lazy = () -> Payment.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.OriginalPayment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities settlement process which is the source of the payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#Payment
	 * SecuritiesSettlement.Payment}</li>
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedSecuritiesSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities settlement process which is the source of the payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedSecuritiesSettlement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Payment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedSecuritiesSettlement";
			definition = "Securities settlement process which is the source of the payment.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesSettlement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.Payment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Reconciliation of the amounts of an invoice with the amounts included in
	 * one or more payments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Invoice#Payment
	 * Invoice.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Invoice Invoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvoiceReconciliation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reconciliation of the amounts of an invoice with the amounts included in one or more payments."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd InvoiceReconciliation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Payment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvoiceReconciliation";
			definition = "Reconciliation of the amounts of an invoice with the amounts included in one or more payments.";
			minOccurs = 0;
			type_lazy = () -> Invoice.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Invoice.Payment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Payment type at the origin of the cash entry eg, a cheque.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentInstrumentCode
	 * PaymentInstrumentCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionCertificate2#TransactionType
	 * TransactionCertificate2.TransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionCertificate2#LocalInstrument
	 * TransactionCertificate2.LocalInstrument}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentInstrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment type at the origin of the cash entry eg, a cheque."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PaymentInstrument = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionCertificate2.TransactionType, com.tools20022.repository.msg.TransactionCertificate2.LocalInstrument);
			elementContext_lazy = () -> Payment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentInstrument";
			definition = "Payment type at the origin of the cash entry eg, a cheque.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PaymentInstrumentCode.mmObject();
		}
	};
	/**
	 * Account debited for the payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#Payment
	 * CashAccount.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccount
	 * CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account debited for the payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Account = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Payment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Account";
			definition = "Account debited for the payment.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CashAccount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.Payment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the charges or the allowance related to a payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#Payment
	 * Adjustment.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Adjustment
	 * Adjustment}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RemittanceAmount2#AdjustmentAmountAndReason
	 * RemittanceAmount2.AdjustmentAmountAndReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Adjustments"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the charges or the allowance related to a payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Adjustments = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RemittanceAmount2.AdjustmentAmountAndReason);
			elementContext_lazy = () -> Payment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Adjustments";
			definition = "Specifies the charges or the allowance related to a payment.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Adjustment.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Adjustment.Payment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Provides the payment of the registered contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract#RelatedPayment
	 * RegisteredContract.RelatedPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RegisteredContract
	 * RegisteredContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContractRegistration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the payment of the registered contract."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ContractRegistration = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Payment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ContractRegistration";
			definition = "Provides the payment of the registered contract.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> RegisteredContract.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.RegisteredContract.RelatedPayment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Payment";
				definition = "Payment information and processes required to transfer cash end to end from the debtor to the creditor.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccount.Payment, com.tools20022.repository.entity.Tax.RelatedPaymentSettlement, com.tools20022.repository.entity.Adjustment.Payment,
						com.tools20022.repository.entity.PaymentObligation.PaymentOffset, com.tools20022.repository.entity.Payment.OriginalPayment, com.tools20022.repository.entity.Payment.ReturnPayment,
						com.tools20022.repository.entity.CreditInstrument.RelatedPayment, com.tools20022.repository.entity.PaymentExecution.Payment, com.tools20022.repository.entity.PaymentIdentification.Payment,
						com.tools20022.repository.entity.PaymentPartyRole.Payment, com.tools20022.repository.entity.PaymentStatus.Payment, com.tools20022.repository.entity.SecuritiesSettlement.Payment,
						com.tools20022.repository.entity.CurrencyExchange.RelatedPayment, com.tools20022.repository.entity.Invoice.Payment, com.tools20022.repository.entity.PaymentInvestigationCase.UnderlyingPayment,
						com.tools20022.repository.entity.SettlementTimeRequest.Payment, com.tools20022.repository.entity.DebitAuthorisation.AuthorisedReturn,
						com.tools20022.repository.entity.PaymentInvestigationCaseResolution.PaymentCorrection, com.tools20022.repository.entity.CommercialTradeSettlement.Payment,
						com.tools20022.repository.entity.RegisteredContract.RelatedPayment);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OriginalTransactionReference18.OriginalTransaction, com.tools20022.repository.msg.ContractRegistrationStatement1.TransactionJournal,
						com.tools20022.repository.msg.TransactionCertificateRecord1.Transaction, com.tools20022.repository.msg.OriginalItem5.OriginalItemReference, com.tools20022.repository.msg.OriginalItemAndStatus5.OriginalItemReference,
						com.tools20022.repository.choice.UnderlyingTransaction3Choice.Interbank, com.tools20022.repository.msg.PaymentTransaction80.OriginalTransactionReference,
						com.tools20022.repository.msg.PaymentTransaction81.OriginalTransactionReference, com.tools20022.repository.msg.OriginalPaymentInstruction23.TransactionInformationAndStatus,
						com.tools20022.repository.msg.OriginalPaymentInstruction21.TransactionInformation, com.tools20022.repository.msg.OriginalPaymentInstruction24.TransactionInformationAndStatus,
						com.tools20022.repository.msg.PaymentTransaction76.OriginalTransactionReference, com.tools20022.repository.choice.CorrectiveTransaction2Choice.Interbank,
						com.tools20022.repository.msg.OriginalPaymentInstruction22.OriginalGroupInformation, com.tools20022.repository.msg.OriginalPaymentInstruction22.TransactionInformationAndStatus,
						com.tools20022.repository.msg.PaymentTransaction78.OriginalTransactionReference, com.tools20022.repository.msg.OriginalPaymentInstruction20.OriginalGroupInformation,
						com.tools20022.repository.msg.OriginalPaymentInstruction20.TransactionInformation, com.tools20022.repository.msg.PaymentTransaction74.OriginalTransactionReference,
						com.tools20022.repository.msg.OriginalPaymentInformation7.Amount, com.tools20022.repository.msg.PaymentTransaction83.OriginalTransactionReference,
						com.tools20022.repository.msg.PaymentTransaction77.OriginalTransactionReference, com.tools20022.repository.msg.PaymentTransaction75.OriginalTransactionReference,
						com.tools20022.repository.msg.PaymentTransaction82.OriginalTransactionReference, com.tools20022.repository.msg.PaymentTransaction79.OriginalTransactionReference);
				subType_lazy = () -> Arrays.asList(IndividualPayment.mmObject(), BulkPayment.mmObject());
				superType_lazy = () -> ObligationFulfilment.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Payment.PaymentObligation, com.tools20022.repository.entity.Payment.CurrencyOfTransfer, com.tools20022.repository.entity.Payment.CreditMethod,
						com.tools20022.repository.entity.Payment.Type, com.tools20022.repository.entity.Payment.InstructedAmount, com.tools20022.repository.entity.Payment.Priority, com.tools20022.repository.entity.Payment.ValueDate,
						com.tools20022.repository.entity.Payment.PaymentStatus, com.tools20022.repository.entity.Payment.PartyRole, com.tools20022.repository.entity.Payment.TaxOnPayment,
						com.tools20022.repository.entity.Payment.PaymentExecution, com.tools20022.repository.entity.Payment.PoolingAdjustmentDate, com.tools20022.repository.entity.Payment.EquivalentAmount,
						com.tools20022.repository.entity.Payment.CurrencyExchange, com.tools20022.repository.entity.Payment.InstructionForCreditorAgent, com.tools20022.repository.entity.Payment.InstructionForDebtorAgent,
						com.tools20022.repository.entity.Payment.PaymentRelatedIdentifications, com.tools20022.repository.entity.Payment.RelatedInvestigationCase, com.tools20022.repository.entity.Payment.SettlementTimeRequest,
						com.tools20022.repository.entity.Payment.Amount, com.tools20022.repository.entity.Payment.TradeSettlement, com.tools20022.repository.entity.Payment.StandardSettlementInstructions,
						com.tools20022.repository.entity.Payment.RelatedDebitAuthorisation, com.tools20022.repository.entity.Payment.RelatedInvestigationCaseResolution, com.tools20022.repository.entity.Payment.OriginalPayment,
						com.tools20022.repository.entity.Payment.ReturnPayment, com.tools20022.repository.entity.Payment.RelatedSecuritiesSettlement, com.tools20022.repository.entity.Payment.InvoiceReconciliation,
						com.tools20022.repository.entity.Payment.PaymentInstrument, com.tools20022.repository.entity.Payment.Account, com.tools20022.repository.entity.Payment.Adjustments,
						com.tools20022.repository.entity.Payment.ContractRegistration);
				derivationComponent_lazy = () -> Arrays.asList(GroupHeader58.mmObject(), InstructionForCreditorAgent1.mmObject(), CategoryPurpose1Choice.mmObject(), EquivalentAmount2.mmObject(), AmountType3Choice.mmObject(),
						GroupHeader48.mmObject(), GroupHeader55.mmObject(), OriginalGroupInformation3.mmObject(), GroupHeader56.mmObject(), GroupHeader52.mmObject(), GroupHeader50.mmObject(), GroupHeader53.mmObject(),
						InstructionForCreditorAgent2.mmObject(), GroupHeader47.mmObject(), GroupHeader46.mmObject(), GroupHeader45.mmObject(), OriginalTransactionReference18.mmObject(), GroupHeader59.mmObject(),
						CorrectiveInterbankTransaction1.mmObject(), GroupHeader60.mmObject(), PaymentInstrumentType1.mmObject(), GroupHeader63.mmObject(), CreditTransferTransaction9.mmObject(), GroupHeader62.mmObject(),
						AmountType4Choice.mmObject(), TransactionCertificate2.mmObject(), SpecialCondition1.mmObject(), GroupHeader70.mmObject(), GroupHeader72.mmObject(), GroupHeader71.mmObject(), OriginalItem5.mmObject(),
						OriginalItemAndStatus5.mmObject(), OriginalItemReference4.mmObject(), NotificationItem6.mmObject(), OriginalMessage2.mmObject(), OriginalMessage3.mmObject(), OriginalGroupInformation27.mmObject(),
						PaymentTransaction73.mmObject(), UnderlyingTransaction3Choice.mmObject(), PaymentTransaction80.mmObject(), PaymentTransaction81.mmObject(), OriginalPaymentInstruction23.mmObject(),
						OriginalPaymentInstruction21.mmObject(), OriginalPaymentInstruction24.mmObject(), OriginalGroupInformation28.mmObject(), PaymentTransaction76.mmObject(), CorrectiveTransaction2Choice.mmObject(),
						MandateClassification1Choice.mmObject(), OriginalPaymentInstruction22.mmObject(), PaymentTransaction78.mmObject(), OriginalTransactionReference24.mmObject(), OriginalPaymentInstruction20.mmObject(),
						PaymentTransaction74.mmObject(), OriginalPaymentInformation7.mmObject(), PaymentTransaction83.mmObject(), OriginalTransactionReference26.mmObject(), PaymentTransaction77.mmObject(), PaymentTransaction75.mmObject(),
						PaymentTransaction82.mmObject(), PaymentTransaction79.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}