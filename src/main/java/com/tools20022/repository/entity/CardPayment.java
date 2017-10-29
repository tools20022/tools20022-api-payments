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
import com.tools20022.repository.choice.CardTransaction2Choice;
import com.tools20022.repository.codeset.DebitCreditCode;
import com.tools20022.repository.codeset.ExternalCardTransactionCategoryCode;
import com.tools20022.repository.codeset.TypeOfAmountCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ImpliedCurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.IndividualPayment;
import com.tools20022.repository.msg.CardAggregated1;
import com.tools20022.repository.msg.CardEntry2;
import com.tools20022.repository.msg.CardIndividualTransaction2;
import com.tools20022.repository.msg.CardTransaction2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Payment through an electronic money product.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CardPayment" src="doc-files/CardPayment.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CardPayment#PaymentCard
 * CardPayment.PaymentCard}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CardPayment#Product
 * CardPayment.Product}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CardPayment#DetailedAmount
 * CardPayment.DetailedAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CardPayment#AmountQualifier
 * CardPayment.AmountQualifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPayment#CardPaymentAcquiring
 * CardPayment.CardPaymentAcquiring}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPayment#PaymentCardPartyRole
 * CardPayment.PaymentCardPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPayment#CardPaymentStatus
 * CardPayment.CardPaymentStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPayment#DetailedAmountLabel
 * CardPayment.DetailedAmountLabel}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CardPayment#Reconciliation
 * CardPayment.Reconciliation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPayment#TransactionCategory
 * CardPayment.TransactionCategory}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CardPayment#CashBackAmount
 * CardPayment.CashBackAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CardPayment#Gratuity
 * CardPayment.Gratuity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPayment#DebitCreditDirection
 * CardPayment.DebitCreditDirection}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CardPayment#ATMTotal
 * CardPayment.ATMTotal}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Product#CardPayment
 * Product.CardPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#Payment
 * PaymentCard.Payment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentPartyRole#CardPayment
 * CardPaymentPartyRole.CardPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#RelatedCardPayment
 * CardPaymentAcquiring.RelatedCardPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction#CardPaymentTotal
 * ReconciliationTransaction.CardPaymentTotal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentStatus#CardPayment
 * CardPaymentStatus.CardPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ATMTotal#RelatedCardPayment
 * ATMTotal.RelatedCardPayment}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransaction2#Transaction
 * CardTransaction2.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CardTransaction2Choice#Aggregated
 * CardTransaction2Choice.Aggregated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CardTransaction2Choice#Individual
 * CardTransaction2Choice.Individual}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardEntry2#AggregatedEntry
 * CardEntry2.AggregatedEntry}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry8#CardTransaction
 * ReportEntry8.CardTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#CardTransaction
 * EntryTransaction8.CardTransaction}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.IndividualPayment
 * IndividualPayment}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CardAggregated1
 * CardAggregated1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransaction2
 * CardTransaction2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CardTransaction2Choice
 * CardTransaction2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardIndividualTransaction2
 * CardIndividualTransaction2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardEntry2 CardEntry2}</li>
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
 * "CardPayment"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Payment through an electronic money product."</li>
 * </ul>
 */
public class CardPayment extends IndividualPayment {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the card which is used in a payment by card.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard#Payment
	 * PaymentCard.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentCard
	 * PaymentCard}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.CardTransaction2#Card
	 * CardTransaction2.Card}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardEntry2#Card
	 * CardEntry2.Card}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentCard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the card which is used in a payment by card."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PaymentCard = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardTransaction2.Card, com.tools20022.repository.msg.CardEntry2.Card);
			elementContext_lazy = () -> CardPayment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentCard";
			definition = "Specifies the card which is used in a payment by card.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.PaymentCard.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentCard.Payment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Product purchased with the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Product#CardPayment
	 * Product.CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Product Product}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction2#Product
	 * CardIndividualTransaction2.Product}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Product"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Product purchased with the transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Product = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardIndividualTransaction2.Product);
			elementContext_lazy = () -> CardPayment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Product";
			definition = "Product purchased with the transaction.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Product.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Product.CardPayment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Detailed amount value.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DetailedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Detailed amount value."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute DetailedAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CardPayment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DetailedAmount";
			definition = "Detailed amount value.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Identification of the type of amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmountCode
	 * TypeOfAmountCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountQualifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the type of amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AmountQualifier = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CardPayment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AmountQualifier";
			definition = "Identification of the type of amount.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TypeOfAmountCode.mmObject();
		}
	};
	/**
	 * Parameters of the process of acquiring a card payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#RelatedCardPayment
	 * CardPaymentAcquiring.RelatedCardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction2#PaymentContext
	 * CardIndividualTransaction2.PaymentContext}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardPaymentAcquiring"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Parameters of the process of acquiring a card payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CardPaymentAcquiring = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardIndividualTransaction2.PaymentContext);
			elementContext_lazy = () -> CardPayment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CardPaymentAcquiring";
			definition = "Parameters of the process of acquiring a card payment.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.RelatedCardPayment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies each role played by a party in the process of a payment by
	 * card.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentPartyRole#CardPayment
	 * CardPaymentPartyRole.CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentPartyRole
	 * CardPaymentPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentCardPartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies each role played by a party in the process of a payment by card."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PaymentCardPartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CardPayment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentCardPartyRole";
			definition = "Specifies each role played by a party in the process of a payment by card.";
			minOccurs = 0;
			type_lazy = () -> CardPaymentPartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CardPaymentPartyRole.CardPayment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Status of the payment by card.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentStatus#CardPayment
	 * CardPaymentStatus.CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CardPaymentStatus
	 * CardPaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardPaymentStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the payment by card."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CardPaymentStatus = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CardPayment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CardPaymentStatus";
			definition = "Status of the payment by card.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.CardPaymentStatus.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CardPaymentStatus.CardPayment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Short description of the amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DetailedAmountLabel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Short description of the amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute DetailedAmountLabel = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CardPayment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DetailedAmountLabel";
			definition = "Short description of the amount.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Total of a certain type of transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction#CardPaymentTotal
	 * ReconciliationTransaction.CardPaymentTotal}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction
	 * ReconciliationTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reconciliation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total of a certain type of transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Reconciliation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CardPayment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Reconciliation";
			definition = "Total of a certain type of transaction.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> ReconciliationTransaction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ReconciliationTransaction.CardPaymentTotal;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the category to which the card transaction belongs.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExternalCardTransactionCategoryCode
	 * ExternalCardTransactionCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionCategory"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the category to which the card transaction belongs."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TransactionCategory = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CardPayment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransactionCategory";
			definition = "Specifies the category to which the card transaction belongs.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ExternalCardTransactionCategoryCode.mmObject();
		}
	};
	/**
	 * Amount added to the total price of the transaction and received in cash
	 * by the customer.
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
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashBackAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount added to the total price of the transaction and received in cash by the customer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CashBackAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CardPayment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashBackAmount";
			definition = "Amount added to the total price of the transaction and received in cash by the customer.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Amount tendered for a service performed.
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
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Gratuity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount tendered for a service performed."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Gratuity = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CardPayment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Gratuity";
			definition = "Amount tendered for a service performed.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies the direction of a payment.
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
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebitCreditDirection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the direction of a payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute DebitCreditDirection = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CardPayment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebitCreditDirection";
			definition = "Specifies the direction of a payment.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DebitCreditCode.mmObject();
		}
	};
	/**
	 * Current totals of the ATM.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ATMTotal#RelatedCardPayment
	 * ATMTotal.RelatedCardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ATMTotal ATMTotal}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMTotal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Current totals of the ATM."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ATMTotal = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CardPayment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ATMTotal";
			definition = "Current totals of the ATM.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.ATMTotal.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ATMTotal.RelatedCardPayment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CardPayment";
				definition = "Payment through an electronic money product.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Product.CardPayment, com.tools20022.repository.entity.PaymentCard.Payment, com.tools20022.repository.entity.CardPaymentPartyRole.CardPayment,
						com.tools20022.repository.entity.CardPaymentAcquiring.RelatedCardPayment, com.tools20022.repository.entity.ReconciliationTransaction.CardPaymentTotal, com.tools20022.repository.entity.CardPaymentStatus.CardPayment,
						com.tools20022.repository.entity.ATMTotal.RelatedCardPayment);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardTransaction2.Transaction, com.tools20022.repository.choice.CardTransaction2Choice.Aggregated,
						com.tools20022.repository.choice.CardTransaction2Choice.Individual, com.tools20022.repository.msg.CardEntry2.AggregatedEntry, com.tools20022.repository.msg.ReportEntry8.CardTransaction,
						com.tools20022.repository.msg.EntryTransaction8.CardTransaction);
				superType_lazy = () -> IndividualPayment.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CardPayment.PaymentCard, com.tools20022.repository.entity.CardPayment.Product, com.tools20022.repository.entity.CardPayment.DetailedAmount,
						com.tools20022.repository.entity.CardPayment.AmountQualifier, com.tools20022.repository.entity.CardPayment.CardPaymentAcquiring, com.tools20022.repository.entity.CardPayment.PaymentCardPartyRole,
						com.tools20022.repository.entity.CardPayment.CardPaymentStatus, com.tools20022.repository.entity.CardPayment.DetailedAmountLabel, com.tools20022.repository.entity.CardPayment.Reconciliation,
						com.tools20022.repository.entity.CardPayment.TransactionCategory, com.tools20022.repository.entity.CardPayment.CashBackAmount, com.tools20022.repository.entity.CardPayment.Gratuity,
						com.tools20022.repository.entity.CardPayment.DebitCreditDirection, com.tools20022.repository.entity.CardPayment.ATMTotal);
				derivationComponent_lazy = () -> Arrays.asList(CardAggregated1.mmObject(), CardTransaction2.mmObject(), CardTransaction2Choice.mmObject(), CardIndividualTransaction2.mmObject(), CardEntry2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}