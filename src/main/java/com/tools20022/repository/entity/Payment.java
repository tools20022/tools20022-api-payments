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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ImpliedCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.ObligationFulfilment
 * ObligationFulfilment}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmPaymentObligation
 * Payment.mmPaymentObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#mmCurrencyOfTransfer
 * Payment.mmCurrencyOfTransfer}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmCreditMethod
 * Payment.mmCreditMethod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmType
 * Payment.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmInstructedAmount
 * Payment.mmInstructedAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmPriority
 * Payment.mmPriority}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmValueDate
 * Payment.mmValueDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmPaymentStatus
 * Payment.mmPaymentStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmPartyRole
 * Payment.mmPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmTaxOnPayment
 * Payment.mmTaxOnPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmPaymentExecution
 * Payment.mmPaymentExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#mmPoolingAdjustmentDate
 * Payment.mmPoolingAdjustmentDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmEquivalentAmount
 * Payment.mmEquivalentAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmCurrencyExchange
 * Payment.mmCurrencyExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#mmInstructionForCreditorAgent
 * Payment.mmInstructionForCreditorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#mmInstructionForDebtorAgent
 * Payment.mmInstructionForDebtorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#mmPaymentRelatedIdentifications
 * Payment.mmPaymentRelatedIdentifications}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#mmRelatedInvestigationCase
 * Payment.mmRelatedInvestigationCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#mmSettlementTimeRequest
 * Payment.mmSettlementTimeRequest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmAmount
 * Payment.mmAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmTradeSettlement
 * Payment.mmTradeSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#mmStandardSettlementInstructions
 * Payment.mmStandardSettlementInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#mmRelatedDebitAuthorisation
 * Payment.mmRelatedDebitAuthorisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#mmRelatedInvestigationCaseResolution
 * Payment.mmRelatedInvestigationCaseResolution}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmOriginalPayment
 * Payment.mmOriginalPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmReturnPayment
 * Payment.mmReturnPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#mmRelatedSecuritiesSettlement
 * Payment.mmRelatedSecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#mmInvoiceReconciliation
 * Payment.mmInvoiceReconciliation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmPaymentInstrument
 * Payment.mmPaymentInstrument}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmAccount
 * Payment.mmAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmAdjustments
 * Payment.mmAdjustments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#mmContractRegistration
 * Payment.mmContractRegistration}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CashAccount#mmPayment
 * CashAccount.mmPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Tax#mmRelatedPaymentSettlement
 * Tax.mmRelatedPaymentSettlement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#mmPayment
 * Adjustment.mmPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPaymentOffset
 * PaymentObligation.mmPaymentOffset}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmOriginalPayment
 * Payment.mmOriginalPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmReturnPayment
 * Payment.mmReturnPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CreditInstrument#mmRelatedPayment
 * CreditInstrument.mmRelatedPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentExecution#mmPayment
 * PaymentExecution.mmPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmPayment
 * PaymentIdentification.mmPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmPayment
 * PaymentPartyRole.mmPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentStatus#mmPayment
 * PaymentStatus.mmPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmPayment
 * SecuritiesSettlement.mmPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmRelatedPayment
 * CurrencyExchange.mmRelatedPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Invoice#mmPayment
 * Invoice.mmPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase#mmUnderlyingPayment
 * PaymentInvestigationCase.mmUnderlyingPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SettlementTimeRequest#mmPayment
 * SettlementTimeRequest.mmPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DebitAuthorisation#mmAuthorisedReturn
 * DebitAuthorisation.mmAuthorisedReturn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#mmPaymentCorrection
 * PaymentInvestigationCaseResolution.mmPaymentCorrection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommercialTradeSettlement#mmPayment
 * CommercialTradeSettlement.mmPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmRelatedPayment
 * RegisteredContract.mmRelatedPayment}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference18#mmOriginalTransaction
 * OriginalTransactionReference18.mmOriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContractRegistrationStatement1#mmTransactionJournal
 * ContractRegistrationStatement1.mmTransactionJournal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionCertificateRecord1#mmTransaction
 * TransactionCertificateRecord1.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalItem5#mmOriginalItemReference
 * OriginalItem5.mmOriginalItemReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus5#mmOriginalItemReference
 * OriginalItemAndStatus5.mmOriginalItemReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction24#mmTransactionInformationAndStatus
 * OriginalPaymentInstruction24.mmTransactionInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation7#mmAmount
 * OriginalPaymentInformation7.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction83#mmOriginalTransactionReference
 * PaymentTransaction83.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction87#mmOriginalTransactionReference
 * PaymentTransaction87.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction88#mmOriginalTransactionReference
 * PaymentTransaction88.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnderlyingTransaction4Choice#mmInterbank
 * UnderlyingTransaction4Choice.mmInterbank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorrectiveTransaction3Choice#mmInterbank
 * CorrectiveTransaction3Choice.mmInterbank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction90#mmOriginalTransactionReference
 * PaymentTransaction90.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction91#mmOriginalTransactionReference
 * PaymentTransaction91.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction85#mmOriginalTransactionReference
 * PaymentTransaction85.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction89#mmOriginalTransactionReference
 * PaymentTransaction89.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction26#mmOriginalGroupInformation
 * OriginalPaymentInstruction26.mmOriginalGroupInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction26#mmTransactionInformationAndStatus
 * OriginalPaymentInstruction26.mmTransactionInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction84#mmOriginalTransactionReference
 * PaymentTransaction84.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction4#mmOriginalTransactionReference
 * UnderlyingPaymentInstruction4.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentTransaction3#mmOriginalTransactionReference
 * UnderlyingPaymentTransaction3.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction28#mmTransactionInformation
 * OriginalPaymentInstruction28.mmTransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction27#mmTransactionInformationAndStatus
 * OriginalPaymentInstruction27.mmTransactionInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction29#mmOriginalGroupInformation
 * OriginalPaymentInstruction29.mmOriginalGroupInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction29#mmTransactionInformation
 * OriginalPaymentInstruction29.mmTransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction92#mmOriginalTransactionReference
 * PaymentTransaction92.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction95#mmOriginalTransactionReference
 * PaymentTransaction95.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction93#mmOriginalTransactionReference
 * PaymentTransaction93.mmOriginalTransactionReference}</li>
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
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
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
 * <li>{@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction24
 * OriginalPaymentInstruction24}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalGroupInformation28
 * OriginalGroupInformation28}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MandateClassification1Choice
 * MandateClassification1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalPaymentInformation7
 * OriginalPaymentInformation7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction83
 * PaymentTransaction83}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalTransactionReference26
 * OriginalTransactionReference26}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction87
 * PaymentTransaction87}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction88
 * PaymentTransaction88}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnderlyingTransaction4Choice
 * UnderlyingTransaction4Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorrectiveTransaction3Choice
 * CorrectiveTransaction3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction90
 * PaymentTransaction90}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction91
 * PaymentTransaction91}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction85
 * PaymentTransaction85}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalTransactionReference27
 * OriginalTransactionReference27}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction89
 * PaymentTransaction89}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction26
 * OriginalPaymentInstruction26}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction84
 * PaymentTransaction84}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Compensation1 Compensation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction28
 * OriginalPaymentInstruction28}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction94
 * PaymentTransaction94}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction27
 * OriginalPaymentInstruction27}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction29
 * OriginalPaymentInstruction29}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction92
 * PaymentTransaction92}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction95
 * PaymentTransaction95}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction93
 * PaymentTransaction93}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader74 GroupHeader74}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader73 GroupHeader73}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader75 GroupHeader75}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader76 GroupHeader76}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalGroupInformation29
 * OriginalGroupInformation29}</li>
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
	protected List<com.tools20022.repository.entity.PaymentObligation> paymentObligation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPaymentOffset
	 * PaymentObligation.mmPaymentOffset}</li>
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
	public static final MMBusinessAssociationEnd<Payment, List<PaymentObligation>> mmPaymentObligation = new MMBusinessAssociationEnd<Payment, List<PaymentObligation>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentObligation";
			definition = "Specifies the obligation which created the payment.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmPaymentOffset;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
		}

		@Override
		public List<PaymentObligation> getValue(Payment obj) {
			return obj.getPaymentObligation();
		}

		@Override
		public void setValue(Payment obj, List<PaymentObligation> value) {
			obj.setPaymentObligation(value);
		}
	};
	protected CurrencyCode currencyOfTransfer;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.EquivalentAmount2#mmCurrencyOfTransfer
	 * EquivalentAmount2.mmCurrencyOfTransfer}</li>
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
	public static final MMBusinessAttribute<Payment, CurrencyCode> mmCurrencyOfTransfer = new MMBusinessAttribute<Payment, CurrencyCode>() {
		{
			derivation_lazy = () -> Arrays.asList(EquivalentAmount2.mmCurrencyOfTransfer);
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CurrencyOfTransfer";
			definition = "Specifies the currency of the amount to be transferred which may be different from the currency of the debtor's account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		@Override
		public CurrencyCode getValue(Payment obj) {
			return obj.getCurrencyOfTransfer();
		}

		@Override
		public void setValue(Payment obj, CurrencyCode value) {
			obj.setCurrencyOfTransfer(value);
		}
	};
	protected List<CreditInstrument> creditMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CreditInstrument#mmRelatedPayment
	 * CreditInstrument.mmRelatedPayment}</li>
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
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference26#mmPaymentMethod
	 * OriginalTransactionReference26.mmPaymentMethod}</li>
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
	public static final MMBusinessAssociationEnd<Payment, List<CreditInstrument>> mmCreditMethod = new MMBusinessAssociationEnd<Payment, List<CreditInstrument>>() {
		{
			derivation_lazy = () -> Arrays.asList(OriginalTransactionReference26.mmPaymentMethod);
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreditMethod";
			definition = "Specifies the transfer method to be used for the credit.";
			minOccurs = 1;
			opposite_lazy = () -> CreditInstrument.mmRelatedPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CreditInstrument.mmObject();
		}

		@Override
		public List<CreditInstrument> getValue(Payment obj) {
			return obj.getCreditMethod();
		}

		@Override
		public void setValue(Payment obj, List<CreditInstrument> value) {
			obj.setCreditMethod(value);
		}
	};
	protected PaymentTypeCode type;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction2#mmTransactionCategory
	 * CardIndividualTransaction2.mmTransactionCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAggregated2#mmTransactionCategory
	 * CardAggregated2.mmTransactionCategory}</li>
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
	public static final MMBusinessAttribute<Payment, PaymentTypeCode> mmType = new MMBusinessAttribute<Payment, PaymentTypeCode>() {
		{
			derivation_lazy = () -> Arrays.asList(CardIndividualTransaction2.mmTransactionCategory, CardAggregated2.mmTransactionCategory);
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Type, or nature, of the payment, eg, express payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PaymentTypeCode.mmObject();
		}

		@Override
		public PaymentTypeCode getValue(Payment obj) {
			return obj.getType();
		}

		@Override
		public void setValue(Payment obj, PaymentTypeCode value) {
			obj.setType(value);
		}
	};
	protected CurrencyAndAmount instructedAmount;
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
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchange3#mmInstructedAmount
	 * AmountAndCurrencyExchange3.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AmountType3Choice#mmInstructedAmount
	 * AmountType3Choice.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AmountType4Choice#mmInstructedAmount
	 * AmountType4Choice.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SpecialCondition1#mmIncomingAmount
	 * SpecialCondition1.mmIncomingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SpecialCondition1#mmOutgoingAmount
	 * SpecialCondition1.mmOutgoingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SpecialCondition1#mmIncomingAmountToOtherAccount
	 * SpecialCondition1.mmIncomingAmountToOtherAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SpecialCondition1#mmPaymentFromOtherAccount
	 * SpecialCondition1.mmPaymentFromOtherAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#mmAmount
	 * CreditTransferTransaction26.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OriginalItem5#mmAmount
	 * OriginalItem5.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction22#mmAmount
	 * CreditTransferTransaction22.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#mmInstructedAmount
	 * DirectDebitTransactionInformation21.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation22#mmInstructedAmount
	 * DirectDebitTransactionInformation22.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction27#mmAmount
	 * CreditTransferTransaction27.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation7#mmAmount
	 * PaymentComplementaryInformation7.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction87#mmReturnedInstructedAmount
	 * PaymentTransaction87.mmReturnedInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction88#mmReversedInstructedAmount
	 * PaymentTransaction88.mmReversedInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification7#mmAmount
	 * RequestedModification7.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference27#mmAmount
	 * OriginalTransactionReference27.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction84#mmOriginalInstructedAmount
	 * PaymentTransaction84.mmOriginalInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction4#mmOriginalInstructedAmount
	 * UnderlyingPaymentInstruction4.mmOriginalInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInitiation3#mmInstructedAmount
	 * CorrectivePaymentInitiation3.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction32#mmInstructedAmount
	 * CreditTransferTransaction32.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction30#mmInstructedAmount
	 * CreditTransferTransaction30.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction95#mmOriginalInstructedAmount
	 * PaymentTransaction95.mmOriginalInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction93#mmOriginalInstructedAmount
	 * PaymentTransaction93.mmOriginalInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction93#mmReversedInstructedAmount
	 * PaymentTransaction93.mmReversedInstructedAmount}</li>
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
	public static final MMBusinessAttribute<Payment, CurrencyAndAmount> mmInstructedAmount = new MMBusinessAttribute<Payment, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(AmountAndCurrencyExchange3.mmInstructedAmount, AmountType3Choice.mmInstructedAmount, AmountType4Choice.mmInstructedAmount, SpecialCondition1.mmIncomingAmount,
					SpecialCondition1.mmOutgoingAmount, SpecialCondition1.mmIncomingAmountToOtherAccount, SpecialCondition1.mmPaymentFromOtherAccount, CreditTransferTransaction26.mmAmount, OriginalItem5.mmAmount,
					CreditTransferTransaction22.mmAmount, DirectDebitTransactionInformation21.mmInstructedAmount, DirectDebitTransactionInformation22.mmInstructedAmount, CreditTransferTransaction27.mmAmount,
					PaymentComplementaryInformation7.mmAmount, PaymentTransaction87.mmReturnedInstructedAmount, PaymentTransaction88.mmReversedInstructedAmount, RequestedModification7.mmAmount, OriginalTransactionReference27.mmAmount,
					PaymentTransaction84.mmOriginalInstructedAmount, UnderlyingPaymentInstruction4.mmOriginalInstructedAmount, CorrectivePaymentInitiation3.mmInstructedAmount, CreditTransferTransaction32.mmInstructedAmount,
					CreditTransferTransaction30.mmInstructedAmount, PaymentTransaction95.mmOriginalInstructedAmount, PaymentTransaction93.mmOriginalInstructedAmount, PaymentTransaction93.mmReversedInstructedAmount);
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InstructedAmount";
			definition = "Amount of money to be moved between the debtor and creditor, before deduction of charges, expressed in the currency as ordered by the initiating party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(Payment obj) {
			return obj.getInstructedAmount();
		}

		@Override
		public void setValue(Payment obj, CurrencyAndAmount value) {
			obj.setInstructedAmount(value);
		}
	};
	protected PriorityCode priority;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.Cheque7#mmInstructionPriority
	 * Cheque7.mmInstructionPriority}</li>
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
	public static final MMBusinessAttribute<Payment, PriorityCode> mmPriority = new MMBusinessAttribute<Payment, PriorityCode>() {
		{
			derivation_lazy = () -> Arrays.asList(Cheque7.mmInstructionPriority);
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Priority";
			definition = "Urgency or order of importance that the originator would like the recipient of the payment  to apply to its processing.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PriorityCode.mmObject();
		}

		@Override
		public PriorityCode getValue(Payment obj) {
			return obj.getPriority();
		}

		@Override
		public void setValue(Payment obj, PriorityCode value) {
			obj.setPriority(value);
		}
	};
	protected ISODate valueDate;
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
	 * {@linkplain com.tools20022.repository.msg.AccountNotification13#mmExpectedValueDate
	 * AccountNotification13.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference8#mmExpectedValueDate
	 * OriginalNotificationReference8.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItem5#mmExpectedValueDate
	 * OriginalItem5.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus5#mmExpectedValueDate
	 * OriginalItemAndStatus5.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference7#mmExpectedValueDate
	 * OriginalNotificationReference7.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem6#mmExpectedValueDate
	 * NotificationItem6.mmExpectedValueDate}</li>
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
	public static final MMBusinessAttribute<Payment, ISODate> mmValueDate = new MMBusinessAttribute<Payment, ISODate>() {
		{
			derivation_lazy = () -> Arrays.asList(AccountNotification13.mmExpectedValueDate, OriginalNotificationReference8.mmExpectedValueDate, OriginalItem5.mmExpectedValueDate, OriginalItemAndStatus5.mmExpectedValueDate,
					OriginalNotificationReference7.mmExpectedValueDate, NotificationItem6.mmExpectedValueDate);
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ValueDate";
			definition = "Date on which a payment must be executed";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(Payment obj) {
			return obj.getValueDate();
		}

		@Override
		public void setValue(Payment obj, ISODate value) {
			obj.setValueDate(value);
		}
	};
	protected List<com.tools20022.repository.entity.PaymentStatus> paymentStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus#mmPayment
	 * PaymentStatus.mmPayment}</li>
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
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction83#mmTransactionStatus
	 * PaymentTransaction83.mmTransactionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction91#mmTransactionStatus
	 * PaymentTransaction91.mmTransactionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction9#mmReturnInformation
	 * EntryTransaction9.mmReturnInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction85#mmTransactionCancellationStatus
	 * PaymentTransaction85.mmTransactionCancellationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction84#mmTransactionCancellationStatus
	 * PaymentTransaction84.mmTransactionCancellationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction92#mmTransactionStatus
	 * PaymentTransaction92.mmTransactionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader11#mmReversalReasonInformation
	 * OriginalGroupHeader11.mmReversalReasonInformation}</li>
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
	public static final MMBusinessAssociationEnd<Payment, List<PaymentStatus>> mmPaymentStatus = new MMBusinessAssociationEnd<Payment, List<PaymentStatus>>() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentTransaction83.mmTransactionStatus, PaymentTransaction91.mmTransactionStatus, EntryTransaction9.mmReturnInformation, PaymentTransaction85.mmTransactionCancellationStatus,
					PaymentTransaction84.mmTransactionCancellationStatus, PaymentTransaction92.mmTransactionStatus, OriginalGroupHeader11.mmReversalReasonInformation);
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentStatus";
			definition = "Specifies the status of a payment at a specified time.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentStatus.mmPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentStatus.mmObject();
		}

		@Override
		public List<PaymentStatus> getValue(Payment obj) {
			return obj.getPaymentStatus();
		}

		@Override
		public void setValue(Payment obj, List<PaymentStatus> value) {
			obj.setPaymentStatus(value);
		}
	};
	protected List<PaymentPartyRole> partyRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmPayment
	 * PaymentPartyRole.mmPayment}</li>
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
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction9#mmRelatedParties
	 * EntryTransaction9.mmRelatedParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction9#mmRelatedAgents
	 * EntryTransaction9.mmRelatedAgents}</li>
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
	public static final MMBusinessAssociationEnd<Payment, List<PaymentPartyRole>> mmPartyRole = new MMBusinessAssociationEnd<Payment, List<PaymentPartyRole>>() {
		{
			derivation_lazy = () -> Arrays.asList(EntryTransaction9.mmRelatedParties, EntryTransaction9.mmRelatedAgents);
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies each role linked to a payment and played by a party at that step in a payment flow.";
			minOccurs = 1;
			opposite_lazy = () -> PaymentPartyRole.mmPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PaymentPartyRole.mmObject();
		}

		@Override
		public List<PaymentPartyRole> getValue(Payment obj) {
			return obj.getPartyRole();
		}

		@Override
		public void setValue(Payment obj, List<PaymentPartyRole> value) {
			obj.setPartyRole(value);
		}
	};
	protected List<Tax> taxOnPayment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmRelatedPaymentSettlement
	 * Tax.mmRelatedPaymentSettlement}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#mmTax
	 * CreditTransferTransaction26.mmTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation13#mmTaxRemittance
	 * StructuredRemittanceInformation13.mmTaxRemittance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction22#mmTax
	 * CreditTransferTransaction22.mmTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation22#mmTax
	 * DirectDebitTransactionInformation22.mmTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction27#mmTax
	 * CreditTransferTransaction27.mmTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction9#mmTax
	 * EntryTransaction9.mmTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction32#mmTax
	 * CreditTransferTransaction32.mmTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction30#mmTax
	 * CreditTransferTransaction30.mmTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation15#mmTaxRemittance
	 * StructuredRemittanceInformation15.mmTaxRemittance}</li>
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
	public static final MMBusinessAssociationEnd<Payment, List<Tax>> mmTaxOnPayment = new MMBusinessAssociationEnd<Payment, List<Tax>>() {
		{
			derivation_lazy = () -> Arrays.asList(CreditTransferTransaction26.mmTax, StructuredRemittanceInformation13.mmTaxRemittance, CreditTransferTransaction22.mmTax, DirectDebitTransactionInformation22.mmTax,
					CreditTransferTransaction27.mmTax, EntryTransaction9.mmTax, CreditTransferTransaction32.mmTax, CreditTransferTransaction30.mmTax, StructuredRemittanceInformation15.mmTaxRemittance);
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxOnPayment";
			definition = "Payment levy tax.";
			minOccurs = 0;
			opposite_lazy = () -> Tax.mmRelatedPaymentSettlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Tax.mmObject();
		}

		@Override
		public List<Tax> getValue(Payment obj) {
			return obj.getTaxOnPayment();
		}

		@Override
		public void setValue(Payment obj, List<Tax> value) {
			obj.setTaxOnPayment(value);
		}
	};
	protected List<com.tools20022.repository.entity.PaymentExecution> paymentExecution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmPayment
	 * PaymentExecution.mmPayment}</li>
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
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation15#mmPaymentTypeInformation
	 * DirectDebitTransactionInformation15.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyControlGroupStatus1#mmOriginalReferences
	 * CurrencyControlGroupStatus1.mmOriginalReferences}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#mmPaymentTypeInformation
	 * DirectDebitTransactionInformation21.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation22#mmPaymentTypeInformation
	 * DirectDebitTransactionInformation22.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction87#mmOriginalGroupInformation
	 * PaymentTransaction87.mmOriginalGroupInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction88#mmOriginalGroupInformation
	 * PaymentTransaction88.mmOriginalGroupInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorrectiveTransaction3Choice#mmInitiation
	 * CorrectiveTransaction3Choice.mmInitiation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction90#mmOriginalGroupInformation
	 * PaymentTransaction90.mmOriginalGroupInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction9#mmRelatedDates
	 * EntryTransaction9.mmRelatedDates}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction85#mmOriginalGroupInformation
	 * PaymentTransaction85.mmOriginalGroupInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction89#mmOriginalGroupInformation
	 * PaymentTransaction89.mmOriginalGroupInformation}</li>
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
	public static final MMBusinessAssociationEnd<Payment, List<PaymentExecution>> mmPaymentExecution = new MMBusinessAssociationEnd<Payment, List<PaymentExecution>>() {
		{
			derivation_lazy = () -> Arrays.asList(DirectDebitTransactionInformation15.mmPaymentTypeInformation, CurrencyControlGroupStatus1.mmOriginalReferences, DirectDebitTransactionInformation21.mmPaymentTypeInformation,
					DirectDebitTransactionInformation22.mmPaymentTypeInformation, PaymentTransaction87.mmOriginalGroupInformation, PaymentTransaction88.mmOriginalGroupInformation, CorrectiveTransaction3Choice.mmInitiation,
					PaymentTransaction90.mmOriginalGroupInformation, EntryTransaction9.mmRelatedDates, PaymentTransaction85.mmOriginalGroupInformation, PaymentTransaction89.mmOriginalGroupInformation);
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentExecution";
			definition = "Describes the processes necessary to execute a payment.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentExecution.mmPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentExecution.mmObject();
		}

		@Override
		public List<PaymentExecution> getValue(Payment obj) {
			return obj.getPaymentExecution();
		}

		@Override
		public void setValue(Payment obj, List<PaymentExecution> value) {
			obj.setPaymentExecution(value);
		}
	};
	protected ISODate poolingAdjustmentDate;
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
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22#mmPoolingAdjustmentDate
	 * PaymentInstruction22.mmPoolingAdjustmentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction24#mmPoolingAdjustmentDate
	 * PaymentInstruction24.mmPoolingAdjustmentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction30#mmPoolingAdjustmentDate
	 * CreditTransferTransaction30.mmPoolingAdjustmentDate}</li>
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
	public static final MMBusinessAttribute<Payment, ISODate> mmPoolingAdjustmentDate = new MMBusinessAttribute<Payment, ISODate>() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentInstruction22.mmPoolingAdjustmentDate, PaymentInstruction24.mmPoolingAdjustmentDate, CreditTransferTransaction30.mmPoolingAdjustmentDate);
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PoolingAdjustmentDate";
			definition = "Date used for the correction of the value date of a cash pool movement that has been posted with a different value date.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(Payment obj) {
			return obj.getPoolingAdjustmentDate();
		}

		@Override
		public void setValue(Payment obj, ISODate value) {
			obj.setPoolingAdjustmentDate(value);
		}
	};
	protected ImpliedCurrencyAndAmount equivalentAmount;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.repository.msg.EquivalentAmount2#mmAmount
	 * EquivalentAmount2.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AmountType3Choice#mmEquivalentAmount
	 * AmountType3Choice.mmEquivalentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AmountType4Choice#mmEquivalentAmount
	 * AmountType4Choice.mmEquivalentAmount}</li>
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
	public static final MMBusinessAttribute<Payment, ImpliedCurrencyAndAmount> mmEquivalentAmount = new MMBusinessAttribute<Payment, ImpliedCurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(EquivalentAmount2.mmAmount, AmountType3Choice.mmEquivalentAmount, AmountType4Choice.mmEquivalentAmount);
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EquivalentAmount";
			definition = "Amount of money to be transferred between debtor and creditor, before deduction of charges, expressed in the currency of the debtor's account, and to be transferred in a different currency.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		@Override
		public ImpliedCurrencyAndAmount getValue(Payment obj) {
			return obj.getEquivalentAmount();
		}

		@Override
		public void setValue(Payment obj, ImpliedCurrencyAndAmount value) {
			obj.setEquivalentAmount(value);
		}
	};
	protected List<com.tools20022.repository.entity.CurrencyExchange> currencyExchange;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmRelatedPayment
	 * CurrencyExchange.mmRelatedPayment}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#mmExchangeRateInformation
	 * CreditTransferTransaction26.mmExchangeRateInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation7#mmExchangeRateInformation
	 * OriginalPaymentInformation7.mmExchangeRateInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction30#mmExchangeRate
	 * CreditTransferTransaction30.mmExchangeRate}</li>
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
	public static final MMBusinessAssociationEnd<Payment, List<CurrencyExchange>> mmCurrencyExchange = new MMBusinessAssociationEnd<Payment, List<CurrencyExchange>>() {
		{
			derivation_lazy = () -> Arrays.asList(CreditTransferTransaction26.mmExchangeRateInformation, OriginalPaymentInformation7.mmExchangeRateInformation, CreditTransferTransaction30.mmExchangeRate);
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchange";
			definition = "Information on the exchange rate and amounts used in the payment";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmRelatedPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
		}

		@Override
		public List<CurrencyExchange> getValue(Payment obj) {
			return obj.getCurrencyExchange();
		}

		@Override
		public void setValue(Payment obj, List<CurrencyExchange> value) {
			obj.setCurrencyExchange(value);
		}
	};
	protected InstructionCode instructionForCreditorAgent;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.InstructionForCreditorAgent1#mmCode
	 * InstructionForCreditorAgent1.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructionForCreditorAgent2#mmCode
	 * InstructionForCreditorAgent2.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction9#mmInstructionForCreditorAgent
	 * CreditTransferTransaction9.mmInstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#mmInstructionForCreditorAgent
	 * CreditTransferTransaction26.mmInstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction22#mmInstructionForCreditorAgent
	 * CreditTransferTransaction22.mmInstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation22#mmInstructionForCreditorAgent
	 * DirectDebitTransactionInformation22.mmInstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction27#mmInstructionForCreditorAgent
	 * CreditTransferTransaction27.mmInstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation7#mmInstructionForCreditorAgent
	 * PaymentComplementaryInformation7.mmInstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction31#mmInstructionForCreditorAgent
	 * CreditTransferTransaction31.mmInstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification7#mmInstructionForCreditorAgent
	 * RequestedModification7.mmInstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction32#mmInstructionForCreditorAgent
	 * CreditTransferTransaction32.mmInstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction30#mmInstructionForCreditorAgent
	 * CreditTransferTransaction30.mmInstructionForCreditorAgent}</li>
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
	public static final MMBusinessAttribute<Payment, InstructionCode> mmInstructionForCreditorAgent = new MMBusinessAttribute<Payment, InstructionCode>() {
		{
			derivation_lazy = () -> Arrays.asList(InstructionForCreditorAgent1.mmCode, InstructionForCreditorAgent2.mmCode, CreditTransferTransaction9.mmInstructionForCreditorAgent,
					CreditTransferTransaction26.mmInstructionForCreditorAgent, CreditTransferTransaction22.mmInstructionForCreditorAgent, DirectDebitTransactionInformation22.mmInstructionForCreditorAgent,
					CreditTransferTransaction27.mmInstructionForCreditorAgent, PaymentComplementaryInformation7.mmInstructionForCreditorAgent, CreditTransferTransaction31.mmInstructionForCreditorAgent,
					RequestedModification7.mmInstructionForCreditorAgent, CreditTransferTransaction32.mmInstructionForCreditorAgent, CreditTransferTransaction30.mmInstructionForCreditorAgent);
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InstructionForCreditorAgent";
			definition = "Further information related to the processing of the payment instruction that may need to be acted upon by the creditor agent. \nUsage: The instruction can relate to a level of service, can be an instruction to be executed by the creditor's agent, or can be information required by the creditor's agent to process the instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InstructionCode.mmObject();
		}

		@Override
		public InstructionCode getValue(Payment obj) {
			return obj.getInstructionForCreditorAgent();
		}

		@Override
		public void setValue(Payment obj, InstructionCode value) {
			obj.setInstructionForCreditorAgent(value);
		}
	};
	protected InstructionCode instructionForDebtorAgent;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation15#mmInstructionForDebtorAgent
	 * DirectDebitTransactionInformation15.mmInstructionForDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#mmInstructionForDebtorAgent
	 * CreditTransferTransaction26.mmInstructionForDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22#mmInstructionForDebtorAgent
	 * PaymentInstruction22.mmInstructionForDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction24#mmInstructionForDebtorAgent
	 * PaymentInstruction24.mmInstructionForDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation7#mmInstructionForDebtorAgent
	 * PaymentComplementaryInformation7.mmInstructionForDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification7#mmInstructionForDebtorAgent
	 * RequestedModification7.mmInstructionForDebtorAgent}</li>
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
	public static final MMBusinessAttribute<Payment, InstructionCode> mmInstructionForDebtorAgent = new MMBusinessAttribute<Payment, InstructionCode>() {
		{
			derivation_lazy = () -> Arrays.asList(DirectDebitTransactionInformation15.mmInstructionForDebtorAgent, CreditTransferTransaction26.mmInstructionForDebtorAgent, PaymentInstruction22.mmInstructionForDebtorAgent,
					PaymentInstruction24.mmInstructionForDebtorAgent, PaymentComplementaryInformation7.mmInstructionForDebtorAgent, RequestedModification7.mmInstructionForDebtorAgent);
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InstructionForDebtorAgent";
			definition = "Further information related to the processing of the payment instruction that may need to be acted upon by the debtor's agent.  \nUsage: The instruction can relate to a level of service, can be an instruction to be executed by the debtor's agent, or can be information required by the debtor's agent to process the instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InstructionCode.mmObject();
		}

		@Override
		public InstructionCode getValue(Payment obj) {
			return obj.getInstructionForDebtorAgent();
		}

		@Override
		public void setValue(Payment obj, InstructionCode value) {
			obj.setInstructionForDebtorAgent(value);
		}
	};
	protected List<PaymentIdentification> paymentRelatedIdentifications;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmPayment
	 * PaymentIdentification.mmPayment}</li>
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
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation15#mmPaymentIdentification
	 * DirectDebitTransactionInformation15.mmPaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RemittanceLocation3#mmReferences
	 * RemittanceLocation3.mmReferences}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#mmPaymentIdentification
	 * CreditTransferTransaction26.mmPaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction22#mmPaymentIdentification
	 * CreditTransferTransaction22.mmPaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#mmPaymentIdentification
	 * DirectDebitTransactionInformation21.mmPaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation7#mmReferences
	 * OriginalPaymentInformation7.mmReferences}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation22#mmPaymentIdentification
	 * DirectDebitTransactionInformation22.mmPaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction27#mmPaymentIdentification
	 * CreditTransferTransaction27.mmPaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction31#mmPaymentIdentification
	 * CreditTransferTransaction31.mmPaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction30#mmPaymentIdentification
	 * CreditTransferTransaction30.mmPaymentIdentification}</li>
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
	public static final MMBusinessAssociationEnd<Payment, List<PaymentIdentification>> mmPaymentRelatedIdentifications = new MMBusinessAssociationEnd<Payment, List<PaymentIdentification>>() {
		{
			derivation_lazy = () -> Arrays.asList(DirectDebitTransactionInformation15.mmPaymentIdentification, RemittanceLocation3.mmReferences, CreditTransferTransaction26.mmPaymentIdentification,
					CreditTransferTransaction22.mmPaymentIdentification, DirectDebitTransactionInformation21.mmPaymentIdentification, OriginalPaymentInformation7.mmReferences, DirectDebitTransactionInformation22.mmPaymentIdentification,
					CreditTransferTransaction27.mmPaymentIdentification, CreditTransferTransaction31.mmPaymentIdentification, CreditTransferTransaction30.mmPaymentIdentification);
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentRelatedIdentifications";
			definition = "Identifications provided to identify a payment at different processing levels.";
			minOccurs = 0;
			opposite_lazy = () -> PaymentIdentification.mmPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PaymentIdentification.mmObject();
		}

		@Override
		public List<PaymentIdentification> getValue(Payment obj) {
			return obj.getPaymentRelatedIdentifications();
		}

		@Override
		public void setValue(Payment obj, List<PaymentIdentification> value) {
			obj.setPaymentRelatedIdentifications(value);
		}
	};
	protected PaymentInvestigationCase relatedInvestigationCase;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase#mmUnderlyingPayment
	 * PaymentInvestigationCase.mmUnderlyingPayment}</li>
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
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction90#mmResolvedCase
	 * PaymentTransaction90.mmResolvedCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction85#mmResolvedCase
	 * PaymentTransaction85.mmResolvedCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction89#mmCase
	 * PaymentTransaction89.mmCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction84#mmResolvedCase
	 * PaymentTransaction84.mmResolvedCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction95#mmCase
	 * PaymentTransaction95.mmCase}</li>
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
	public static final MMBusinessAssociationEnd<Payment, Optional<PaymentInvestigationCase>> mmRelatedInvestigationCase = new MMBusinessAssociationEnd<Payment, Optional<PaymentInvestigationCase>>() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentTransaction90.mmResolvedCase, PaymentTransaction85.mmResolvedCase, PaymentTransaction89.mmCase, PaymentTransaction84.mmResolvedCase, PaymentTransaction95.mmCase);
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestigationCase";
			definition = "Investigation case assigned to the payment.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> PaymentInvestigationCase.mmUnderlyingPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PaymentInvestigationCase.mmObject();
		}

		@Override
		public Optional<PaymentInvestigationCase> getValue(Payment obj) {
			return obj.getRelatedInvestigationCase();
		}

		@Override
		public void setValue(Payment obj, Optional<PaymentInvestigationCase> value) {
			obj.setRelatedInvestigationCase(value.orElse(null));
		}
	};
	protected SettlementTimeRequest settlementTimeRequest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SettlementTimeRequest#mmPayment
	 * SettlementTimeRequest.mmPayment}</li>
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
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation15#mmSettlementTimeRequest
	 * DirectDebitTransactionInformation15.mmSettlementTimeRequest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction31#mmSettlementTimeRequest
	 * CreditTransferTransaction31.mmSettlementTimeRequest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction30#mmSettlementTimeRequest
	 * CreditTransferTransaction30.mmSettlementTimeRequest}</li>
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
	public static final MMBusinessAssociationEnd<Payment, Optional<SettlementTimeRequest>> mmSettlementTimeRequest = new MMBusinessAssociationEnd<Payment, Optional<SettlementTimeRequest>>() {
		{
			derivation_lazy = () -> Arrays.asList(DirectDebitTransactionInformation15.mmSettlementTimeRequest, CreditTransferTransaction31.mmSettlementTimeRequest, CreditTransferTransaction30.mmSettlementTimeRequest);
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementTimeRequest";
			definition = "Information on the requested settlement time of the instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SettlementTimeRequest.mmPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SettlementTimeRequest.mmObject();
		}

		@Override
		public Optional<SettlementTimeRequest> getValue(Payment obj) {
			return obj.getSettlementTimeRequest();
		}

		@Override
		public void setValue(Payment obj, Optional<SettlementTimeRequest> value) {
			obj.setSettlementTimeRequest(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.TransactionCertificate2#mmAmount
	 * TransactionCertificate2.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus5#mmAmount
	 * OriginalItemAndStatus5.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NotificationItem6#mmAmount
	 * NotificationItem6.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference26#mmAmount
	 * OriginalTransactionReference26.mmAmount}</li>
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
	public static final MMBusinessAttribute<Payment, CurrencyAndAmount> mmAmount = new MMBusinessAttribute<Payment, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(TransactionCertificate2.mmAmount, OriginalItemAndStatus5.mmAmount, NotificationItem6.mmAmount, OriginalTransactionReference26.mmAmount);
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Amount of the payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(Payment obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(Payment obj, CurrencyAndAmount value) {
			obj.setAmount(value);
		}
	};
	protected List<CommercialTradeSettlement> tradeSettlement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTradeSettlement#mmPayment
	 * CommercialTradeSettlement.mmPayment}</li>
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
	public static final MMBusinessAssociationEnd<Payment, List<CommercialTradeSettlement>> mmTradeSettlement = new MMBusinessAssociationEnd<Payment, List<CommercialTradeSettlement>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradeSettlement";
			definition = "Specifies the settlement operation which originates the payment.";
			minOccurs = 0;
			opposite_lazy = () -> CommercialTradeSettlement.mmPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CommercialTradeSettlement.mmObject();
		}

		@Override
		public List<CommercialTradeSettlement> getValue(Payment obj) {
			return obj.getTradeSettlement();
		}

		@Override
		public void setValue(Payment obj, List<CommercialTradeSettlement> value) {
			obj.setTradeSettlement(value);
		}
	};
	protected Max140Text standardSettlementInstructions;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<Payment, Max140Text> mmStandardSettlementInstructions = new MMBusinessAttribute<Payment, Max140Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StandardSettlementInstructions";
			definition = "Identifies the standard settlement instructions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Max140Text getValue(Payment obj) {
			return obj.getStandardSettlementInstructions();
		}

		@Override
		public void setValue(Payment obj, Max140Text value) {
			obj.setStandardSettlementInstructions(value);
		}
	};
	protected DebitAuthorisation relatedDebitAuthorisation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DebitAuthorisation#mmAuthorisedReturn
	 * DebitAuthorisation.mmAuthorisedReturn}</li>
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
	public static final MMBusinessAssociationEnd<Payment, Optional<DebitAuthorisation>> mmRelatedDebitAuthorisation = new MMBusinessAssociationEnd<Payment, Optional<DebitAuthorisation>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedDebitAuthorisation";
			definition = "Payment which is the result of the debit authorisation";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> DebitAuthorisation.mmAuthorisedReturn;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> DebitAuthorisation.mmObject();
		}

		@Override
		public Optional<DebitAuthorisation> getValue(Payment obj) {
			return obj.getRelatedDebitAuthorisation();
		}

		@Override
		public void setValue(Payment obj, Optional<DebitAuthorisation> value) {
			obj.setRelatedDebitAuthorisation(value.orElse(null));
		}
	};
	protected PaymentInvestigationCaseResolution relatedInvestigationCaseResolution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#mmPaymentCorrection
	 * PaymentInvestigationCaseResolution.mmPaymentCorrection}</li>
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
	public static final MMBusinessAssociationEnd<Payment, Optional<PaymentInvestigationCaseResolution>> mmRelatedInvestigationCaseResolution = new MMBusinessAssociationEnd<Payment, Optional<PaymentInvestigationCaseResolution>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestigationCaseResolution";
			definition = "Case resolution related to a specific payment.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> PaymentInvestigationCaseResolution.mmPaymentCorrection;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PaymentInvestigationCaseResolution.mmObject();
		}

		@Override
		public Optional<PaymentInvestigationCaseResolution> getValue(Payment obj) {
			return obj.getRelatedInvestigationCaseResolution();
		}

		@Override
		public void setValue(Payment obj, Optional<PaymentInvestigationCaseResolution> value) {
			obj.setRelatedInvestigationCaseResolution(value.orElse(null));
		}
	};
	protected Payment originalPayment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmReturnPayment
	 * Payment.mmReturnPayment}</li>
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
	public static final MMBusinessAssociationEnd<Payment, Payment> mmOriginalPayment = new MMBusinessAssociationEnd<Payment, Payment>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OriginalPayment";
			definition = "Original payment which is returned.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Payment.mmReturnPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Payment.mmObject();
		}

		@Override
		public Payment getValue(Payment obj) {
			return obj.getOriginalPayment();
		}

		@Override
		public void setValue(Payment obj, Payment value) {
			obj.setOriginalPayment(value);
		}
	};
	protected List<Payment> returnPayment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmOriginalPayment
	 * Payment.mmOriginalPayment}</li>
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
	public static final MMBusinessAssociationEnd<Payment, List<Payment>> mmReturnPayment = new MMBusinessAssociationEnd<Payment, List<Payment>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReturnPayment";
			definition = "Payment which offsets an original payment.";
			minOccurs = 0;
			opposite_lazy = () -> Payment.mmOriginalPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Payment.mmObject();
		}

		@Override
		public List<Payment> getValue(Payment obj) {
			return obj.getReturnPayment();
		}

		@Override
		public void setValue(Payment obj, List<Payment> value) {
			obj.setReturnPayment(value);
		}
	};
	protected SecuritiesSettlement relatedSecuritiesSettlement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmPayment
	 * SecuritiesSettlement.mmPayment}</li>
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
	public static final MMBusinessAssociationEnd<Payment, SecuritiesSettlement> mmRelatedSecuritiesSettlement = new MMBusinessAssociationEnd<Payment, SecuritiesSettlement>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedSecuritiesSettlement";
			definition = "Securities settlement process which is the source of the payment.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesSettlement.mmPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesSettlement.mmObject();
		}

		@Override
		public SecuritiesSettlement getValue(Payment obj) {
			return obj.getRelatedSecuritiesSettlement();
		}

		@Override
		public void setValue(Payment obj, SecuritiesSettlement value) {
			obj.setRelatedSecuritiesSettlement(value);
		}
	};
	protected List<Invoice> invoiceReconciliation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Invoice#mmPayment
	 * Invoice.mmPayment}</li>
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
	public static final MMBusinessAssociationEnd<Payment, List<Invoice>> mmInvoiceReconciliation = new MMBusinessAssociationEnd<Payment, List<Invoice>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvoiceReconciliation";
			definition = "Reconciliation of the amounts of an invoice with the amounts included in one or more payments.";
			minOccurs = 0;
			opposite_lazy = () -> Invoice.mmPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Invoice.mmObject();
		}

		@Override
		public List<Invoice> getValue(Payment obj) {
			return obj.getInvoiceReconciliation();
		}

		@Override
		public void setValue(Payment obj, List<Invoice> value) {
			obj.setInvoiceReconciliation(value);
		}
	};
	protected PaymentInstrumentCode paymentInstrument;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.TransactionCertificate2#mmTransactionType
	 * TransactionCertificate2.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionCertificate2#mmLocalInstrument
	 * TransactionCertificate2.mmLocalInstrument}</li>
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
	public static final MMBusinessAttribute<Payment, PaymentInstrumentCode> mmPaymentInstrument = new MMBusinessAttribute<Payment, PaymentInstrumentCode>() {
		{
			derivation_lazy = () -> Arrays.asList(TransactionCertificate2.mmTransactionType, TransactionCertificate2.mmLocalInstrument);
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentInstrument";
			definition = "Payment type at the origin of the cash entry eg, a cheque.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PaymentInstrumentCode.mmObject();
		}

		@Override
		public PaymentInstrumentCode getValue(Payment obj) {
			return obj.getPaymentInstrument();
		}

		@Override
		public void setValue(Payment obj, PaymentInstrumentCode value) {
			obj.setPaymentInstrument(value);
		}
	};
	protected CashAccount account;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmPayment
	 * CashAccount.mmPayment}</li>
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
	public static final MMBusinessAssociationEnd<Payment, CashAccount> mmAccount = new MMBusinessAssociationEnd<Payment, CashAccount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Account";
			definition = "Account debited for the payment.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> CashAccount.mmPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CashAccount.mmObject();
		}

		@Override
		public CashAccount getValue(Payment obj) {
			return obj.getAccount();
		}

		@Override
		public void setValue(Payment obj, CashAccount value) {
			obj.setAccount(value);
		}
	};
	protected Adjustment adjustments;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmPayment
	 * Adjustment.mmPayment}</li>
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
	 * {@linkplain com.tools20022.repository.msg.RemittanceAmount2#mmAdjustmentAmountAndReason
	 * RemittanceAmount2.mmAdjustmentAmountAndReason}</li>
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
	public static final MMBusinessAssociationEnd<Payment, Adjustment> mmAdjustments = new MMBusinessAssociationEnd<Payment, Adjustment>() {
		{
			derivation_lazy = () -> Arrays.asList(RemittanceAmount2.mmAdjustmentAmountAndReason);
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Adjustments";
			definition = "Specifies the charges or the allowance related to a payment.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Adjustment.mmPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Adjustment.mmObject();
		}

		@Override
		public Adjustment getValue(Payment obj) {
			return obj.getAdjustments();
		}

		@Override
		public void setValue(Payment obj, Adjustment value) {
			obj.setAdjustments(value);
		}
	};
	protected RegisteredContract contractRegistration;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmRelatedPayment
	 * RegisteredContract.mmRelatedPayment}</li>
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
	public static final MMBusinessAssociationEnd<Payment, RegisteredContract> mmContractRegistration = new MMBusinessAssociationEnd<Payment, RegisteredContract>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ContractRegistration";
			definition = "Provides the payment of the registered contract.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> RegisteredContract.mmRelatedPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> RegisteredContract.mmObject();
		}

		@Override
		public RegisteredContract getValue(Payment obj) {
			return obj.getContractRegistration();
		}

		@Override
		public void setValue(Payment obj, RegisteredContract value) {
			obj.setContractRegistration(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Payment";
				definition = "Payment information and processes required to transfer cash end to end from the debtor to the creditor.";
				associationDomain_lazy = () -> Arrays.asList(CashAccount.mmPayment, Tax.mmRelatedPaymentSettlement, Adjustment.mmPayment, com.tools20022.repository.entity.PaymentObligation.mmPaymentOffset, Payment.mmOriginalPayment,
						Payment.mmReturnPayment, CreditInstrument.mmRelatedPayment, com.tools20022.repository.entity.PaymentExecution.mmPayment, PaymentIdentification.mmPayment, PaymentPartyRole.mmPayment,
						com.tools20022.repository.entity.PaymentStatus.mmPayment, SecuritiesSettlement.mmPayment, com.tools20022.repository.entity.CurrencyExchange.mmRelatedPayment, Invoice.mmPayment,
						PaymentInvestigationCase.mmUnderlyingPayment, com.tools20022.repository.entity.SettlementTimeRequest.mmPayment, DebitAuthorisation.mmAuthorisedReturn, PaymentInvestigationCaseResolution.mmPaymentCorrection,
						CommercialTradeSettlement.mmPayment, RegisteredContract.mmRelatedPayment);
				derivationElement_lazy = () -> Arrays.asList(OriginalTransactionReference18.mmOriginalTransaction, ContractRegistrationStatement1.mmTransactionJournal, TransactionCertificateRecord1.mmTransaction,
						OriginalItem5.mmOriginalItemReference, OriginalItemAndStatus5.mmOriginalItemReference, OriginalPaymentInstruction24.mmTransactionInformationAndStatus, OriginalPaymentInformation7.mmAmount,
						PaymentTransaction83.mmOriginalTransactionReference, PaymentTransaction87.mmOriginalTransactionReference, PaymentTransaction88.mmOriginalTransactionReference, UnderlyingTransaction4Choice.mmInterbank,
						CorrectiveTransaction3Choice.mmInterbank, PaymentTransaction90.mmOriginalTransactionReference, PaymentTransaction91.mmOriginalTransactionReference, PaymentTransaction85.mmOriginalTransactionReference,
						PaymentTransaction89.mmOriginalTransactionReference, OriginalPaymentInstruction26.mmOriginalGroupInformation, OriginalPaymentInstruction26.mmTransactionInformationAndStatus,
						PaymentTransaction84.mmOriginalTransactionReference, UnderlyingPaymentInstruction4.mmOriginalTransactionReference, UnderlyingPaymentTransaction3.mmOriginalTransactionReference,
						OriginalPaymentInstruction28.mmTransactionInformation, OriginalPaymentInstruction27.mmTransactionInformationAndStatus, OriginalPaymentInstruction29.mmOriginalGroupInformation,
						OriginalPaymentInstruction29.mmTransactionInformation, PaymentTransaction92.mmOriginalTransactionReference, PaymentTransaction95.mmOriginalTransactionReference, PaymentTransaction93.mmOriginalTransactionReference);
				subType_lazy = () -> Arrays.asList(IndividualPayment.mmObject(), BulkPayment.mmObject());
				superType_lazy = () -> ObligationFulfilment.mmObject();
				element_lazy = () -> Arrays.asList(Payment.mmPaymentObligation, Payment.mmCurrencyOfTransfer, Payment.mmCreditMethod, Payment.mmType, Payment.mmInstructedAmount, Payment.mmPriority, Payment.mmValueDate,
						Payment.mmPaymentStatus, Payment.mmPartyRole, Payment.mmTaxOnPayment, Payment.mmPaymentExecution, Payment.mmPoolingAdjustmentDate, Payment.mmEquivalentAmount, Payment.mmCurrencyExchange,
						Payment.mmInstructionForCreditorAgent, Payment.mmInstructionForDebtorAgent, Payment.mmPaymentRelatedIdentifications, Payment.mmRelatedInvestigationCase, Payment.mmSettlementTimeRequest, Payment.mmAmount,
						Payment.mmTradeSettlement, Payment.mmStandardSettlementInstructions, Payment.mmRelatedDebitAuthorisation, Payment.mmRelatedInvestigationCaseResolution, Payment.mmOriginalPayment, Payment.mmReturnPayment,
						Payment.mmRelatedSecuritiesSettlement, Payment.mmInvoiceReconciliation, Payment.mmPaymentInstrument, Payment.mmAccount, Payment.mmAdjustments, Payment.mmContractRegistration);
				derivationComponent_lazy = () -> Arrays.asList(InstructionForCreditorAgent1.mmObject(), CategoryPurpose1Choice.mmObject(), EquivalentAmount2.mmObject(), AmountType3Choice.mmObject(), GroupHeader48.mmObject(),
						GroupHeader55.mmObject(), GroupHeader50.mmObject(), GroupHeader53.mmObject(), InstructionForCreditorAgent2.mmObject(), GroupHeader47.mmObject(), GroupHeader46.mmObject(), GroupHeader45.mmObject(),
						OriginalTransactionReference18.mmObject(), GroupHeader59.mmObject(), CorrectiveInterbankTransaction1.mmObject(), GroupHeader60.mmObject(), PaymentInstrumentType1.mmObject(), GroupHeader63.mmObject(),
						CreditTransferTransaction9.mmObject(), GroupHeader62.mmObject(), AmountType4Choice.mmObject(), TransactionCertificate2.mmObject(), SpecialCondition1.mmObject(), GroupHeader70.mmObject(), GroupHeader72.mmObject(),
						GroupHeader71.mmObject(), OriginalItem5.mmObject(), OriginalItemAndStatus5.mmObject(), OriginalItemReference4.mmObject(), NotificationItem6.mmObject(), OriginalMessage2.mmObject(), OriginalMessage3.mmObject(),
						OriginalGroupInformation27.mmObject(), OriginalPaymentInstruction24.mmObject(), OriginalGroupInformation28.mmObject(), MandateClassification1Choice.mmObject(), OriginalPaymentInformation7.mmObject(),
						PaymentTransaction83.mmObject(), OriginalTransactionReference26.mmObject(), PaymentTransaction87.mmObject(), PaymentTransaction88.mmObject(), UnderlyingTransaction4Choice.mmObject(),
						CorrectiveTransaction3Choice.mmObject(), PaymentTransaction90.mmObject(), PaymentTransaction91.mmObject(), PaymentTransaction85.mmObject(), OriginalTransactionReference27.mmObject(), PaymentTransaction89.mmObject(),
						OriginalPaymentInstruction26.mmObject(), PaymentTransaction84.mmObject(), Compensation1.mmObject(), OriginalPaymentInstruction28.mmObject(), PaymentTransaction94.mmObject(), OriginalPaymentInstruction27.mmObject(),
						OriginalPaymentInstruction29.mmObject(), PaymentTransaction92.mmObject(), PaymentTransaction95.mmObject(), PaymentTransaction93.mmObject(), GroupHeader74.mmObject(), GroupHeader73.mmObject(),
						GroupHeader75.mmObject(), GroupHeader76.mmObject(), OriginalGroupInformation29.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Payment.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<PaymentObligation> getPaymentObligation() {
		return paymentObligation == null ? paymentObligation = new ArrayList<>() : paymentObligation;
	}

	public Payment setPaymentObligation(List<com.tools20022.repository.entity.PaymentObligation> paymentObligation) {
		this.paymentObligation = Objects.requireNonNull(paymentObligation);
		return this;
	}

	public CurrencyCode getCurrencyOfTransfer() {
		return currencyOfTransfer;
	}

	public Payment setCurrencyOfTransfer(CurrencyCode currencyOfTransfer) {
		this.currencyOfTransfer = Objects.requireNonNull(currencyOfTransfer);
		return this;
	}

	public List<CreditInstrument> getCreditMethod() {
		return creditMethod == null ? creditMethod = new ArrayList<>() : creditMethod;
	}

	public Payment setCreditMethod(List<CreditInstrument> creditMethod) {
		this.creditMethod = Objects.requireNonNull(creditMethod);
		return this;
	}

	public PaymentTypeCode getType() {
		return type;
	}

	public Payment setType(PaymentTypeCode type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public CurrencyAndAmount getInstructedAmount() {
		return instructedAmount;
	}

	public Payment setInstructedAmount(CurrencyAndAmount instructedAmount) {
		this.instructedAmount = Objects.requireNonNull(instructedAmount);
		return this;
	}

	public PriorityCode getPriority() {
		return priority;
	}

	public Payment setPriority(PriorityCode priority) {
		this.priority = Objects.requireNonNull(priority);
		return this;
	}

	public ISODate getValueDate() {
		return valueDate;
	}

	public Payment setValueDate(ISODate valueDate) {
		this.valueDate = Objects.requireNonNull(valueDate);
		return this;
	}

	public List<PaymentStatus> getPaymentStatus() {
		return paymentStatus == null ? paymentStatus = new ArrayList<>() : paymentStatus;
	}

	public Payment setPaymentStatus(List<com.tools20022.repository.entity.PaymentStatus> paymentStatus) {
		this.paymentStatus = Objects.requireNonNull(paymentStatus);
		return this;
	}

	public List<PaymentPartyRole> getPartyRole() {
		return partyRole == null ? partyRole = new ArrayList<>() : partyRole;
	}

	public Payment setPartyRole(List<PaymentPartyRole> partyRole) {
		this.partyRole = Objects.requireNonNull(partyRole);
		return this;
	}

	public List<Tax> getTaxOnPayment() {
		return taxOnPayment == null ? taxOnPayment = new ArrayList<>() : taxOnPayment;
	}

	public Payment setTaxOnPayment(List<Tax> taxOnPayment) {
		this.taxOnPayment = Objects.requireNonNull(taxOnPayment);
		return this;
	}

	public List<PaymentExecution> getPaymentExecution() {
		return paymentExecution == null ? paymentExecution = new ArrayList<>() : paymentExecution;
	}

	public Payment setPaymentExecution(List<com.tools20022.repository.entity.PaymentExecution> paymentExecution) {
		this.paymentExecution = Objects.requireNonNull(paymentExecution);
		return this;
	}

	public ISODate getPoolingAdjustmentDate() {
		return poolingAdjustmentDate;
	}

	public Payment setPoolingAdjustmentDate(ISODate poolingAdjustmentDate) {
		this.poolingAdjustmentDate = Objects.requireNonNull(poolingAdjustmentDate);
		return this;
	}

	public ImpliedCurrencyAndAmount getEquivalentAmount() {
		return equivalentAmount;
	}

	public Payment setEquivalentAmount(ImpliedCurrencyAndAmount equivalentAmount) {
		this.equivalentAmount = Objects.requireNonNull(equivalentAmount);
		return this;
	}

	public List<CurrencyExchange> getCurrencyExchange() {
		return currencyExchange == null ? currencyExchange = new ArrayList<>() : currencyExchange;
	}

	public Payment setCurrencyExchange(List<com.tools20022.repository.entity.CurrencyExchange> currencyExchange) {
		this.currencyExchange = Objects.requireNonNull(currencyExchange);
		return this;
	}

	public InstructionCode getInstructionForCreditorAgent() {
		return instructionForCreditorAgent;
	}

	public Payment setInstructionForCreditorAgent(InstructionCode instructionForCreditorAgent) {
		this.instructionForCreditorAgent = Objects.requireNonNull(instructionForCreditorAgent);
		return this;
	}

	public InstructionCode getInstructionForDebtorAgent() {
		return instructionForDebtorAgent;
	}

	public Payment setInstructionForDebtorAgent(InstructionCode instructionForDebtorAgent) {
		this.instructionForDebtorAgent = Objects.requireNonNull(instructionForDebtorAgent);
		return this;
	}

	public List<PaymentIdentification> getPaymentRelatedIdentifications() {
		return paymentRelatedIdentifications == null ? paymentRelatedIdentifications = new ArrayList<>() : paymentRelatedIdentifications;
	}

	public Payment setPaymentRelatedIdentifications(List<PaymentIdentification> paymentRelatedIdentifications) {
		this.paymentRelatedIdentifications = Objects.requireNonNull(paymentRelatedIdentifications);
		return this;
	}

	public Optional<PaymentInvestigationCase> getRelatedInvestigationCase() {
		return relatedInvestigationCase == null ? Optional.empty() : Optional.of(relatedInvestigationCase);
	}

	public Payment setRelatedInvestigationCase(PaymentInvestigationCase relatedInvestigationCase) {
		this.relatedInvestigationCase = relatedInvestigationCase;
		return this;
	}

	public Optional<SettlementTimeRequest> getSettlementTimeRequest() {
		return settlementTimeRequest == null ? Optional.empty() : Optional.of(settlementTimeRequest);
	}

	public Payment setSettlementTimeRequest(com.tools20022.repository.entity.SettlementTimeRequest settlementTimeRequest) {
		this.settlementTimeRequest = settlementTimeRequest;
		return this;
	}

	public CurrencyAndAmount getAmount() {
		return amount;
	}

	public Payment setAmount(CurrencyAndAmount amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}

	public List<CommercialTradeSettlement> getTradeSettlement() {
		return tradeSettlement == null ? tradeSettlement = new ArrayList<>() : tradeSettlement;
	}

	public Payment setTradeSettlement(List<CommercialTradeSettlement> tradeSettlement) {
		this.tradeSettlement = Objects.requireNonNull(tradeSettlement);
		return this;
	}

	public Max140Text getStandardSettlementInstructions() {
		return standardSettlementInstructions;
	}

	public Payment setStandardSettlementInstructions(Max140Text standardSettlementInstructions) {
		this.standardSettlementInstructions = Objects.requireNonNull(standardSettlementInstructions);
		return this;
	}

	public Optional<DebitAuthorisation> getRelatedDebitAuthorisation() {
		return relatedDebitAuthorisation == null ? Optional.empty() : Optional.of(relatedDebitAuthorisation);
	}

	public Payment setRelatedDebitAuthorisation(DebitAuthorisation relatedDebitAuthorisation) {
		this.relatedDebitAuthorisation = relatedDebitAuthorisation;
		return this;
	}

	public Optional<PaymentInvestigationCaseResolution> getRelatedInvestigationCaseResolution() {
		return relatedInvestigationCaseResolution == null ? Optional.empty() : Optional.of(relatedInvestigationCaseResolution);
	}

	public Payment setRelatedInvestigationCaseResolution(PaymentInvestigationCaseResolution relatedInvestigationCaseResolution) {
		this.relatedInvestigationCaseResolution = relatedInvestigationCaseResolution;
		return this;
	}

	public Payment getOriginalPayment() {
		return originalPayment;
	}

	public Payment setOriginalPayment(Payment originalPayment) {
		this.originalPayment = Objects.requireNonNull(originalPayment);
		return this;
	}

	public List<Payment> getReturnPayment() {
		return returnPayment == null ? returnPayment = new ArrayList<>() : returnPayment;
	}

	public Payment setReturnPayment(List<Payment> returnPayment) {
		this.returnPayment = Objects.requireNonNull(returnPayment);
		return this;
	}

	public SecuritiesSettlement getRelatedSecuritiesSettlement() {
		return relatedSecuritiesSettlement;
	}

	public Payment setRelatedSecuritiesSettlement(SecuritiesSettlement relatedSecuritiesSettlement) {
		this.relatedSecuritiesSettlement = Objects.requireNonNull(relatedSecuritiesSettlement);
		return this;
	}

	public List<Invoice> getInvoiceReconciliation() {
		return invoiceReconciliation == null ? invoiceReconciliation = new ArrayList<>() : invoiceReconciliation;
	}

	public Payment setInvoiceReconciliation(List<Invoice> invoiceReconciliation) {
		this.invoiceReconciliation = Objects.requireNonNull(invoiceReconciliation);
		return this;
	}

	public PaymentInstrumentCode getPaymentInstrument() {
		return paymentInstrument;
	}

	public Payment setPaymentInstrument(PaymentInstrumentCode paymentInstrument) {
		this.paymentInstrument = Objects.requireNonNull(paymentInstrument);
		return this;
	}

	public CashAccount getAccount() {
		return account;
	}

	public Payment setAccount(CashAccount account) {
		this.account = Objects.requireNonNull(account);
		return this;
	}

	public Adjustment getAdjustments() {
		return adjustments;
	}

	public Payment setAdjustments(Adjustment adjustments) {
		this.adjustments = Objects.requireNonNull(adjustments);
		return this;
	}

	public RegisteredContract getContractRegistration() {
		return contractRegistration;
	}

	public Payment setContractRegistration(RegisteredContract contractRegistration) {
		this.contractRegistration = Objects.requireNonNull(contractRegistration);
		return this;
	}
}