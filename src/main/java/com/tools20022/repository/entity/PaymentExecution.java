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

import com.tools20022.metamodel.ext.OtherSemanticMarkup;
import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.DebitCreditCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Process required for executing an end to end payment. It consists of a
 * payment initiation which may be followed by a series of instructions.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PaymentExecution" src="doc-files/PaymentExecution.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmCreditDebitIndicator
 * PaymentExecution.mmCreditDebitIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmCreationDate
 * PaymentExecution.mmCreationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmAcceptanceDateTime
 * PaymentExecution.mmAcceptanceDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentExecution#mmPayment
 * PaymentExecution.mmPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmProcessingInstructions
 * PaymentExecution.mmProcessingInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmRequestedExecutionDate
 * PaymentExecution.mmRequestedExecutionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmRelatedInvestigationCase
 * PaymentExecution.mmRelatedInvestigationCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmRelatedInvestigationCaseResolution
 * PaymentExecution.mmRelatedInvestigationCaseResolution}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentExecution#mmNext
 * PaymentExecution.mmNext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmCurrencyExchange
 * PaymentExecution.mmCurrencyExchange}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmPaymentExecution
 * Payment.mmPaymentExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#mmPrevious
 * PaymentInstruction.mmPrevious}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#mmPaymentExecution
 * PaymentProcessing.mmPaymentExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmPaymentExecution
 * CurrencyExchange.mmPaymentExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase#mmUnderlyingInstruction
 * PaymentInvestigationCase.mmUnderlyingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#mmPaymentExecutionCorrection
 * PaymentInvestigationCaseResolution.mmPaymentExecutionCorrection}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification7#mmPaymentTypeInformation
 * RequestedModification7.mmPaymentTypeInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentInstruction
 * PaymentInstruction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDates3
 * TransactionDates3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalGroupHeader9
 * OriginalGroupHeader9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalGroupHeader13
 * OriginalGroupHeader13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalGroupHeader12
 * OriginalGroupHeader12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalGroupHeader11
 * OriginalGroupHeader11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalGroupHeader10
 * OriginalGroupHeader10}</li>
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
 * "PaymentExecution"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Process required for executing an end to end payment. It consists of a payment initiation which may be followed by a series of instructions."
 * </li>
 * </ul>
 */
public class PaymentExecution {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
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
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection5#mmCreditDebit
	 * AmountAndDirection5.mmCreditDebit}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution
	 * PaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = type=SampleData, SampleData=<?xml version="1.0"
	 * encoding="UTF-8"?> <InstanceInfo> <key KeyValue="Sample1"/> <key
	 * KeyValue="Sample2"/> <key KeyValue="Sample3"/> <key KeyValue="Sample4"/>
	 * <key KeyValue="Sample5"/> <key KeyValue="Sample6"/> <key
	 * KeyValue="Sample7"/> <key KeyValue="Sample8"/> <key KeyValue="Sample9"/>
	 * <key KeyValue="Sample10"/> </InstanceInfo>
	 * 
	 * 
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the payment is a debit or a credit."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PaymentExecution, DebitCreditCode> mmCreditDebitIndicator = new MMBusinessAttribute<PaymentExecution, DebitCreditCode>() {
		{
			derivation_lazy = () -> Arrays.asList(AmountAndDirection5.mmCreditDebit);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentExecution.mmObject();
			semanticMarkup_lazy = () -> Arrays
					.asList(new OtherSemanticMarkup(
							this,
							"SampleData",
							new String[]{
									"SampleData",
									"<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<InstanceInfo>\n<key KeyValue=\"Sample1\"/>\n<key KeyValue=\"Sample2\"/>\n<key KeyValue=\"Sample3\"/>\n<key KeyValue=\"Sample4\"/>\n<key KeyValue=\"Sample5\"/>\n<key KeyValue=\"Sample6\"/>\n<key KeyValue=\"Sample7\"/>\n<key KeyValue=\"Sample8\"/>\n<key KeyValue=\"Sample9\"/>\n<key KeyValue=\"Sample10\"/>\n</InstanceInfo>\n\n\n"}));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates whether the payment is a debit or a credit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DebitCreditCode.mmObject();
		}

		@Override
		public DebitCreditCode getValue(PaymentExecution obj) {
			return obj.getCreditDebitIndicator();
		}

		@Override
		public void setValue(PaymentExecution obj, DebitCreditCode value) {
			obj.setCreditDebitIndicator(value);
		}
	};
	protected ISODateTime creationDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader48#mmCreationDateTime
	 * GroupHeader48.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader55#mmCreationDateTime
	 * GroupHeader55.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader50#mmCreationDateTime
	 * GroupHeader50.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader53#mmCreationDateTime
	 * GroupHeader53.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader47#mmCreationDateTime
	 * GroupHeader47.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader46#mmCreationDateTime
	 * GroupHeader46.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader45#mmCreationDateTime
	 * GroupHeader45.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader59#mmCreationDateTime
	 * GroupHeader59.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader60#mmCreationDateTime
	 * GroupHeader60.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader63#mmCreationDateTime
	 * GroupHeader63.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader62#mmCreationDateTime
	 * GroupHeader62.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader70#mmCreationDateTime
	 * GroupHeader70.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification10#mmOriginalCreationDateTime
	 * OriginalNotification10.mmOriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification9#mmOriginalCreationDateTime
	 * OriginalNotification9.mmOriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader72#mmCreationDateTime
	 * GroupHeader72.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader71#mmCreationDateTime
	 * GroupHeader71.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalMessage2#mmOriginalCreationDateTime
	 * OriginalMessage2.mmOriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalMessage3#mmOriginalCreationDateTime
	 * OriginalMessage3.mmOriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation27#mmOriginalCreationDateTime
	 * OriginalGroupInformation27.mmOriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation28#mmOriginalCreationDateTime
	 * OriginalGroupInformation28.mmOriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader9#mmOriginalCreationDateTime
	 * OriginalGroupHeader9.mmOriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader13#mmOriginalCreationDateTime
	 * OriginalGroupHeader13.mmOriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader74#mmCreationDateTime
	 * GroupHeader74.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader73#mmCreationDateTime
	 * GroupHeader73.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader12#mmOriginalCreationDateTime
	 * OriginalGroupHeader12.mmOriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader11#mmOriginalCreationDateTime
	 * OriginalGroupHeader11.mmOriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader75#mmCreationDateTime
	 * GroupHeader75.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader76#mmCreationDateTime
	 * GroupHeader76.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader10#mmOriginalCreationDateTime
	 * OriginalGroupHeader10.mmOriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation29#mmOriginalCreationDateTime
	 * OriginalGroupInformation29.mmOriginalCreationDateTime}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution
	 * PaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which the payment execution was created by the instructing agent."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PaymentExecution, ISODateTime> mmCreationDate = new MMBusinessAttribute<PaymentExecution, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(GroupHeader48.mmCreationDateTime, GroupHeader55.mmCreationDateTime, GroupHeader50.mmCreationDateTime, GroupHeader53.mmCreationDateTime, GroupHeader47.mmCreationDateTime,
					GroupHeader46.mmCreationDateTime, GroupHeader45.mmCreationDateTime, GroupHeader59.mmCreationDateTime, GroupHeader60.mmCreationDateTime, GroupHeader63.mmCreationDateTime, GroupHeader62.mmCreationDateTime,
					GroupHeader70.mmCreationDateTime, OriginalNotification10.mmOriginalCreationDateTime, OriginalNotification9.mmOriginalCreationDateTime, GroupHeader72.mmCreationDateTime, GroupHeader71.mmCreationDateTime,
					OriginalMessage2.mmOriginalCreationDateTime, OriginalMessage3.mmOriginalCreationDateTime, OriginalGroupInformation27.mmOriginalCreationDateTime, OriginalGroupInformation28.mmOriginalCreationDateTime,
					OriginalGroupHeader9.mmOriginalCreationDateTime, OriginalGroupHeader13.mmOriginalCreationDateTime, GroupHeader74.mmCreationDateTime, GroupHeader73.mmCreationDateTime, OriginalGroupHeader12.mmOriginalCreationDateTime,
					OriginalGroupHeader11.mmOriginalCreationDateTime, GroupHeader75.mmCreationDateTime, GroupHeader76.mmCreationDateTime, OriginalGroupHeader10.mmOriginalCreationDateTime,
					OriginalGroupInformation29.mmOriginalCreationDateTime);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentExecution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreationDate";
			definition = "Date and time at which the payment execution was created by the instructing agent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(PaymentExecution obj) {
			return obj.getCreationDate();
		}

		@Override
		public void setValue(PaymentExecution obj, ISODateTime value) {
			obj.setCreationDate(value);
		}
	};
	protected ISODateTime acceptanceDateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction83#mmAcceptanceDateTime
	 * PaymentTransaction83.mmAcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction91#mmAcceptanceDateTime
	 * PaymentTransaction91.mmAcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDates3#mmAcceptanceDateTime
	 * TransactionDates3.mmAcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction30#mmAcceptanceDateTime
	 * CreditTransferTransaction30.mmAcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction94#mmAcceptanceDateTime
	 * PaymentTransaction94.mmAcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction92#mmAcceptanceDateTime
	 * PaymentTransaction92.mmAcceptanceDateTime}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution
	 * PaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptanceDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which all processing conditions for execution of the payment are met and adequate financial cover is available at the account servicing agent."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PaymentExecution, ISODateTime> mmAcceptanceDateTime = new MMBusinessAttribute<PaymentExecution, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentTransaction83.mmAcceptanceDateTime, PaymentTransaction91.mmAcceptanceDateTime, TransactionDates3.mmAcceptanceDateTime, CreditTransferTransaction30.mmAcceptanceDateTime,
					PaymentTransaction94.mmAcceptanceDateTime, PaymentTransaction92.mmAcceptanceDateTime);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentExecution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AcceptanceDateTime";
			definition = "Date and time at which all processing conditions for execution of the payment are met and adequate financial cover is available at the account servicing agent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(PaymentExecution obj) {
			return obj.getAcceptanceDateTime();
		}

		@Override
		public void setValue(PaymentExecution obj, ISODateTime value) {
			obj.setAcceptanceDateTime(value);
		}
	};
	protected List<Payment> payment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmPaymentExecution
	 * Payment.mmPaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference8#mmOriginalItem
	 * OriginalNotificationReference8.mmOriginalItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference7#mmOriginalItemAndStatus
	 * OriginalNotificationReference7.mmOriginalItemAndStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction20#mmTransactionInformation
	 * UnderlyingTransaction20.mmTransactionInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction19#mmTransactionInformationAndStatus
	 * UnderlyingTransaction19.mmTransactionInformationAndStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction91#mmOriginalGroupInformation
	 * PaymentTransaction91.mmOriginalGroupInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction94#mmOriginalGroupInformation
	 * PaymentTransaction94.mmOriginalGroupInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution
	 * PaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Payment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the end to end payment which is at the origin of the payment instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PaymentExecution, List<Payment>> mmPayment = new MMBusinessAssociationEnd<PaymentExecution, List<Payment>>() {
		{
			derivation_lazy = () -> Arrays.asList(OriginalNotificationReference8.mmOriginalItem, OriginalNotificationReference7.mmOriginalItemAndStatus, UnderlyingTransaction20.mmTransactionInformation,
					UnderlyingTransaction19.mmTransactionInformationAndStatus, PaymentTransaction91.mmOriginalGroupInformation, PaymentTransaction94.mmOriginalGroupInformation);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentExecution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Payment";
			definition = "Specifies the end to end payment which is at the origin of the payment instruction.";
			minOccurs = 0;
			opposite_lazy = () -> Payment.mmPaymentExecution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Payment.mmObject();
		}

		@Override
		public List<Payment> getValue(PaymentExecution obj) {
			return obj.getPayment();
		}

		@Override
		public void setValue(PaymentExecution obj, List<Payment> value) {
			obj.setPayment(value);
		}
	};
	protected List<PaymentProcessing> processingInstructions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#mmPaymentExecution
	 * PaymentProcessing.mmPaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentProcessing
	 * PaymentProcessing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader50#mmPaymentTypeInformation
	 * GroupHeader50.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction9#mmPaymentTypeInformation
	 * CreditTransferTransaction9.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader70#mmPaymentTypeInformation
	 * GroupHeader70.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#mmPaymentTypeInformation
	 * CreditTransferTransaction26.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction22#mmPaymentTypeInformation
	 * CreditTransferTransaction22.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction21#mmPaymentTypeInformation
	 * PaymentInstruction21.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction23#mmPaymentTypeInformation
	 * PaymentInstruction23.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22#mmPaymentTypeInformation
	 * PaymentInstruction22.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation7#mmPaymentTypeInformation
	 * OriginalPaymentInformation7.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference26#mmPaymentTypeInformation
	 * OriginalTransactionReference26.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction24#mmPaymentTypeInformation
	 * PaymentInstruction24.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction27#mmPaymentTypeInformation
	 * CreditTransferTransaction27.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation7#mmPaymentTypeInformation
	 * PaymentComplementaryInformation7.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction31#mmPaymentTypeInformation
	 * CreditTransferTransaction31.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference27#mmPaymentTypeInformation
	 * OriginalTransactionReference27.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction30#mmPaymentTypeInformation
	 * CreditTransferTransaction30.mmPaymentTypeInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution
	 * PaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingInstructions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies how the payment must be processed, for instance through which specific clearing channel."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PaymentExecution, List<PaymentProcessing>> mmProcessingInstructions = new MMBusinessAssociationEnd<PaymentExecution, List<PaymentProcessing>>() {
		{
			derivation_lazy = () -> Arrays.asList(GroupHeader50.mmPaymentTypeInformation, CreditTransferTransaction9.mmPaymentTypeInformation, GroupHeader70.mmPaymentTypeInformation, CreditTransferTransaction26.mmPaymentTypeInformation,
					CreditTransferTransaction22.mmPaymentTypeInformation, PaymentInstruction21.mmPaymentTypeInformation, PaymentInstruction23.mmPaymentTypeInformation, PaymentInstruction22.mmPaymentTypeInformation,
					OriginalPaymentInformation7.mmPaymentTypeInformation, OriginalTransactionReference26.mmPaymentTypeInformation, PaymentInstruction24.mmPaymentTypeInformation, CreditTransferTransaction27.mmPaymentTypeInformation,
					PaymentComplementaryInformation7.mmPaymentTypeInformation, CreditTransferTransaction31.mmPaymentTypeInformation, OriginalTransactionReference27.mmPaymentTypeInformation,
					CreditTransferTransaction30.mmPaymentTypeInformation);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentExecution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProcessingInstructions";
			definition = "Specifies how the payment must be processed, for instance through which specific clearing channel.";
			minOccurs = 0;
			opposite_lazy = () -> PaymentProcessing.mmPaymentExecution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PaymentProcessing.mmObject();
		}

		@Override
		public List<PaymentProcessing> getValue(PaymentExecution obj) {
			return obj.getProcessingInstructions();
		}

		@Override
		public void setValue(PaymentExecution obj, List<PaymentProcessing> value) {
			obj.setProcessingInstructions(value);
		}
	};
	protected ISODateTime requestedExecutionDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction21#mmRequestedCollectionDate
	 * PaymentInstruction21.mmRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction23#mmRequestedExecutionDate
	 * PaymentInstruction23.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22#mmRequestedExecutionDate
	 * PaymentInstruction22.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation7#mmRequestedExecutionDate
	 * OriginalPaymentInformation7.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction24#mmRequestedExecutionDate
	 * PaymentInstruction24.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation7#mmRequestedExecutionDate
	 * PaymentComplementaryInformation7.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation7#mmRequestedCollectionDate
	 * PaymentComplementaryInformation7.mmRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction4#mmRequestedExecutionDate
	 * UnderlyingPaymentInstruction4.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInitiation3#mmRequestedExecutionDate
	 * CorrectivePaymentInitiation3.mmRequestedExecutionDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution
	 * PaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedExecutionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date at which the initiating party requests the clearing agent to process the payment. \r\nUsage: This is the date on which the debtor's account is to be debited. If payment by cheque, the date when the cheque must be generated by the bank."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PaymentExecution, ISODateTime> mmRequestedExecutionDate = new MMBusinessAttribute<PaymentExecution, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentInstruction21.mmRequestedCollectionDate, PaymentInstruction23.mmRequestedExecutionDate, PaymentInstruction22.mmRequestedExecutionDate,
					OriginalPaymentInformation7.mmRequestedExecutionDate, PaymentInstruction24.mmRequestedExecutionDate, PaymentComplementaryInformation7.mmRequestedExecutionDate, PaymentComplementaryInformation7.mmRequestedCollectionDate,
					UnderlyingPaymentInstruction4.mmRequestedExecutionDate, CorrectivePaymentInitiation3.mmRequestedExecutionDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentExecution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RequestedExecutionDate";
			definition = "Date at which the initiating party requests the clearing agent to process the payment. \r\nUsage: This is the date on which the debtor's account is to be debited. If payment by cheque, the date when the cheque must be generated by the bank.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(PaymentExecution obj) {
			return obj.getRequestedExecutionDate();
		}

		@Override
		public void setValue(PaymentExecution obj, ISODateTime value) {
			obj.setRequestedExecutionDate(value);
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
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase#mmUnderlyingInstruction
	 * PaymentInvestigationCase.mmUnderlyingInstruction}</li>
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
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader9#mmResolvedCase
	 * OriginalGroupHeader9.mmResolvedCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader10#mmCase
	 * OriginalGroupHeader10.mmCase}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution
	 * PaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedInvestigationCase"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Investigation case assigned to the payment execution."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PaymentExecution, Optional<PaymentInvestigationCase>> mmRelatedInvestigationCase = new MMBusinessAssociationEnd<PaymentExecution, Optional<PaymentInvestigationCase>>() {
		{
			derivation_lazy = () -> Arrays.asList(OriginalGroupHeader9.mmResolvedCase, OriginalGroupHeader10.mmCase);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentExecution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestigationCase";
			definition = "Investigation case assigned to the payment execution.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> PaymentInvestigationCase.mmUnderlyingInstruction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PaymentInvestigationCase.mmObject();
		}

		@Override
		public Optional<PaymentInvestigationCase> getValue(PaymentExecution obj) {
			return obj.getRelatedInvestigationCase();
		}

		@Override
		public void setValue(PaymentExecution obj, Optional<PaymentInvestigationCase> value) {
			obj.setRelatedInvestigationCase(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#mmPaymentExecutionCorrection
	 * PaymentInvestigationCaseResolution.mmPaymentExecutionCorrection}</li>
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
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution
	 * PaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedInvestigationCaseResolution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment investigation case resolution which is the source of the corrected payment execution."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PaymentExecution, Optional<PaymentInvestigationCaseResolution>> mmRelatedInvestigationCaseResolution = new MMBusinessAssociationEnd<PaymentExecution, Optional<PaymentInvestigationCaseResolution>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentExecution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestigationCaseResolution";
			definition = "Payment investigation case resolution which is the source of the corrected payment execution.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> PaymentInvestigationCaseResolution.mmPaymentExecutionCorrection;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PaymentInvestigationCaseResolution.mmObject();
		}

		@Override
		public Optional<PaymentInvestigationCaseResolution> getValue(PaymentExecution obj) {
			return obj.getRelatedInvestigationCaseResolution();
		}

		@Override
		public void setValue(PaymentExecution obj, Optional<PaymentInvestigationCaseResolution> value) {
			obj.setRelatedInvestigationCaseResolution(value.orElse(null));
		}
	};
	protected PaymentInstruction next;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#mmPrevious
	 * PaymentInstruction.mmPrevious}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentInstruction
	 * PaymentInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution
	 * PaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Next"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the next payment instruction in the payment end-to-end chain."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PaymentExecution, Optional<PaymentInstruction>> mmNext = new MMBusinessAssociationEnd<PaymentExecution, Optional<PaymentInstruction>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentExecution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Next";
			definition = "Specifies the next payment instruction in the payment end-to-end chain.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> PaymentInstruction.mmPrevious;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PaymentInstruction.mmObject();
		}

		@Override
		public Optional<PaymentInstruction> getValue(PaymentExecution obj) {
			return obj.getNext();
		}

		@Override
		public void setValue(PaymentExecution obj, Optional<PaymentInstruction> value) {
			obj.setNext(value.orElse(null));
		}
	};
	protected List<CurrencyExchange> currencyExchange;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmPaymentExecution
	 * CurrencyExchange.mmPaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution
	 * PaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate used to transform the original amount into the credited amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PaymentExecution, List<CurrencyExchange>> mmCurrencyExchange = new MMBusinessAssociationEnd<PaymentExecution, List<CurrencyExchange>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentExecution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchange";
			definition = "Rate used to transform the original amount into the credited amount.";
			minOccurs = 0;
			opposite_lazy = () -> CurrencyExchange.mmPaymentExecution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CurrencyExchange.mmObject();
		}

		@Override
		public List<CurrencyExchange> getValue(PaymentExecution obj) {
			return obj.getCurrencyExchange();
		}

		@Override
		public void setValue(PaymentExecution obj, List<CurrencyExchange> value) {
			obj.setCurrencyExchange(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentExecution";
				definition = "Process required for executing an end to end payment. It consists of a payment initiation which may be followed by a series of instructions.";
				associationDomain_lazy = () -> Arrays.asList(Payment.mmPaymentExecution, PaymentInstruction.mmPrevious, PaymentProcessing.mmPaymentExecution, CurrencyExchange.mmPaymentExecution,
						PaymentInvestigationCase.mmUnderlyingInstruction, PaymentInvestigationCaseResolution.mmPaymentExecutionCorrection);
				derivationElement_lazy = () -> Arrays.asList(RequestedModification7.mmPaymentTypeInformation);
				subType_lazy = () -> Arrays.asList(PaymentInstruction.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentExecution.mmCreditDebitIndicator, com.tools20022.repository.entity.PaymentExecution.mmCreationDate,
						com.tools20022.repository.entity.PaymentExecution.mmAcceptanceDateTime, com.tools20022.repository.entity.PaymentExecution.mmPayment, com.tools20022.repository.entity.PaymentExecution.mmProcessingInstructions,
						com.tools20022.repository.entity.PaymentExecution.mmRequestedExecutionDate, com.tools20022.repository.entity.PaymentExecution.mmRelatedInvestigationCase,
						com.tools20022.repository.entity.PaymentExecution.mmRelatedInvestigationCaseResolution, com.tools20022.repository.entity.PaymentExecution.mmNext, com.tools20022.repository.entity.PaymentExecution.mmCurrencyExchange);
				derivationComponent_lazy = () -> Arrays.asList(TransactionDates3.mmObject(), OriginalGroupHeader9.mmObject(), OriginalGroupHeader13.mmObject(), OriginalGroupHeader12.mmObject(), OriginalGroupHeader11.mmObject(),
						OriginalGroupHeader10.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return PaymentExecution.class;
			}
		});
		return mmObject_lazy.get();
	}

	public DebitCreditCode getCreditDebitIndicator() {
		return creditDebitIndicator;
	}

	public PaymentExecution setCreditDebitIndicator(DebitCreditCode creditDebitIndicator) {
		this.creditDebitIndicator = Objects.requireNonNull(creditDebitIndicator);
		return this;
	}

	public ISODateTime getCreationDate() {
		return creationDate;
	}

	public PaymentExecution setCreationDate(ISODateTime creationDate) {
		this.creationDate = Objects.requireNonNull(creationDate);
		return this;
	}

	public ISODateTime getAcceptanceDateTime() {
		return acceptanceDateTime;
	}

	public PaymentExecution setAcceptanceDateTime(ISODateTime acceptanceDateTime) {
		this.acceptanceDateTime = Objects.requireNonNull(acceptanceDateTime);
		return this;
	}

	public List<Payment> getPayment() {
		return payment == null ? payment = new ArrayList<>() : payment;
	}

	public PaymentExecution setPayment(List<Payment> payment) {
		this.payment = Objects.requireNonNull(payment);
		return this;
	}

	public List<PaymentProcessing> getProcessingInstructions() {
		return processingInstructions == null ? processingInstructions = new ArrayList<>() : processingInstructions;
	}

	public PaymentExecution setProcessingInstructions(List<PaymentProcessing> processingInstructions) {
		this.processingInstructions = Objects.requireNonNull(processingInstructions);
		return this;
	}

	public ISODateTime getRequestedExecutionDate() {
		return requestedExecutionDate;
	}

	public PaymentExecution setRequestedExecutionDate(ISODateTime requestedExecutionDate) {
		this.requestedExecutionDate = Objects.requireNonNull(requestedExecutionDate);
		return this;
	}

	public Optional<PaymentInvestigationCase> getRelatedInvestigationCase() {
		return relatedInvestigationCase == null ? Optional.empty() : Optional.of(relatedInvestigationCase);
	}

	public PaymentExecution setRelatedInvestigationCase(PaymentInvestigationCase relatedInvestigationCase) {
		this.relatedInvestigationCase = relatedInvestigationCase;
		return this;
	}

	public Optional<PaymentInvestigationCaseResolution> getRelatedInvestigationCaseResolution() {
		return relatedInvestigationCaseResolution == null ? Optional.empty() : Optional.of(relatedInvestigationCaseResolution);
	}

	public PaymentExecution setRelatedInvestigationCaseResolution(PaymentInvestigationCaseResolution relatedInvestigationCaseResolution) {
		this.relatedInvestigationCaseResolution = relatedInvestigationCaseResolution;
		return this;
	}

	public Optional<PaymentInstruction> getNext() {
		return next == null ? Optional.empty() : Optional.of(next);
	}

	public PaymentExecution setNext(PaymentInstruction next) {
		this.next = next;
		return this;
	}

	public List<CurrencyExchange> getCurrencyExchange() {
		return currencyExchange == null ? currencyExchange = new ArrayList<>() : currencyExchange;
	}

	public PaymentExecution setCurrencyExchange(List<CurrencyExchange> currencyExchange) {
		this.currencyExchange = Objects.requireNonNull(currencyExchange);
		return this;
	}
}