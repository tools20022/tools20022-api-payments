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
import com.tools20022.repository.choice.CardTransaction3Choice;
import com.tools20022.repository.codeset.DebitCreditCode;
import com.tools20022.repository.codeset.ExternalCardTransactionCategoryCode;
import com.tools20022.repository.codeset.TypeOfAmountCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ImpliedCurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.IndividualPayment
 * IndividualPayment}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CardPayment#mmPaymentCard
 * CardPayment.mmPaymentCard}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CardPayment#mmProduct
 * CardPayment.mmProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPayment#mmDetailedAmount
 * CardPayment.mmDetailedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPayment#mmAmountQualifier
 * CardPayment.mmAmountQualifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPayment#mmCardPaymentAcquiring
 * CardPayment.mmCardPaymentAcquiring}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPayment#mmPaymentCardPartyRole
 * CardPayment.mmPaymentCardPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPayment#mmCardPaymentStatus
 * CardPayment.mmCardPaymentStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPayment#mmDetailedAmountLabel
 * CardPayment.mmDetailedAmountLabel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPayment#mmReconciliation
 * CardPayment.mmReconciliation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPayment#mmTransactionCategory
 * CardPayment.mmTransactionCategory}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPayment#mmCashBackAmount
 * CardPayment.mmCashBackAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CardPayment#mmGratuity
 * CardPayment.mmGratuity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPayment#mmDebitCreditDirection
 * CardPayment.mmDebitCreditDirection}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CardPayment#mmATMTotal
 * CardPayment.mmATMTotal}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Product#mmCardPayment
 * Product.mmCardPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#mmPayment
 * PaymentCard.mmPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentPartyRole#mmCardPayment
 * CardPaymentPartyRole.mmCardPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmRelatedCardPayment
 * CardPaymentAcquiring.mmRelatedCardPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction#mmCardPaymentTotal
 * ReconciliationTransaction.mmCardPaymentTotal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentStatus#mmCardPayment
 * CardPaymentStatus.mmCardPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ATMTotal#mmRelatedCardPayment
 * ATMTotal.mmRelatedCardPayment}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction16#mmTransaction
 * CardTransaction16.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction9#mmCardTransaction
 * EntryTransaction9.mmCardTransaction}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry9#mmCardTransaction
 * ReportEntry9.mmCardTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CardTransaction3Choice#mmAggregated
 * CardTransaction3Choice.mmAggregated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CardTransaction3Choice#mmIndividual
 * CardTransaction3Choice.mmIndividual}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardEntry3#mmAggregatedEntry
 * CardEntry3.mmAggregatedEntry}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CardIndividualTransaction2
 * CardIndividualTransaction2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransaction16
 * CardTransaction16}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CardTransaction3Choice
 * CardTransaction3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAggregated2
 * CardAggregated2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardEntry3 CardEntry3}</li>
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
	protected PaymentCard paymentCard;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard#mmPayment
	 * PaymentCard.mmPayment}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.CardTransaction16#mmCard
	 * CardTransaction16.mmCard}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardEntry3#mmCard
	 * CardEntry3.mmCard}</li>
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
	public static final MMBusinessAssociationEnd<CardPayment, com.tools20022.repository.entity.PaymentCard> mmPaymentCard = new MMBusinessAssociationEnd<CardPayment, com.tools20022.repository.entity.PaymentCard>() {
		{
			derivation_lazy = () -> Arrays.asList(CardTransaction16.mmCard, CardEntry3.mmCard);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPayment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentCard";
			definition = "Specifies the card which is used in a payment by card.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentCard.mmPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentCard.mmObject();
		}

		@Override
		public com.tools20022.repository.entity.PaymentCard getValue(CardPayment obj) {
			return obj.getPaymentCard();
		}

		@Override
		public void setValue(CardPayment obj, com.tools20022.repository.entity.PaymentCard value) {
			obj.setPaymentCard(value);
		}
	};
	protected List<com.tools20022.repository.entity.Product> product;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmCardPayment
	 * Product.mmCardPayment}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction2#mmProduct
	 * CardIndividualTransaction2.mmProduct}</li>
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
	public static final MMBusinessAssociationEnd<CardPayment, List<Product>> mmProduct = new MMBusinessAssociationEnd<CardPayment, List<Product>>() {
		{
			derivation_lazy = () -> Arrays.asList(CardIndividualTransaction2.mmProduct);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPayment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Product";
			definition = "Product purchased with the transaction.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Product.mmCardPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Product.mmObject();
		}

		@Override
		public List<Product> getValue(CardPayment obj) {
			return obj.getProduct();
		}

		@Override
		public void setValue(CardPayment obj, List<Product> value) {
			obj.setProduct(value);
		}
	};
	protected ImpliedCurrencyAndAmount detailedAmount;
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
	public static final MMBusinessAttribute<CardPayment, ImpliedCurrencyAndAmount> mmDetailedAmount = new MMBusinessAttribute<CardPayment, ImpliedCurrencyAndAmount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPayment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DetailedAmount";
			definition = "Detailed amount value.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		@Override
		public ImpliedCurrencyAndAmount getValue(CardPayment obj) {
			return obj.getDetailedAmount();
		}

		@Override
		public void setValue(CardPayment obj, ImpliedCurrencyAndAmount value) {
			obj.setDetailedAmount(value);
		}
	};
	protected TypeOfAmountCode amountQualifier;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<CardPayment, TypeOfAmountCode> mmAmountQualifier = new MMBusinessAttribute<CardPayment, TypeOfAmountCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPayment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AmountQualifier";
			definition = "Identification of the type of amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TypeOfAmountCode.mmObject();
		}

		@Override
		public TypeOfAmountCode getValue(CardPayment obj) {
			return obj.getAmountQualifier();
		}

		@Override
		public void setValue(CardPayment obj, TypeOfAmountCode value) {
			obj.setAmountQualifier(value);
		}
	};
	protected List<com.tools20022.repository.entity.CardPaymentAcquiring> cardPaymentAcquiring;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmRelatedCardPayment
	 * CardPaymentAcquiring.mmRelatedCardPayment}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction2#mmPaymentContext
	 * CardIndividualTransaction2.mmPaymentContext}</li>
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
	public static final MMBusinessAssociationEnd<CardPayment, List<CardPaymentAcquiring>> mmCardPaymentAcquiring = new MMBusinessAssociationEnd<CardPayment, List<CardPaymentAcquiring>>() {
		{
			derivation_lazy = () -> Arrays.asList(CardIndividualTransaction2.mmPaymentContext);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPayment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CardPaymentAcquiring";
			definition = "Parameters of the process of acquiring a card payment.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.mmRelatedCardPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.mmObject();
		}

		@Override
		public List<CardPaymentAcquiring> getValue(CardPayment obj) {
			return obj.getCardPaymentAcquiring();
		}

		@Override
		public void setValue(CardPayment obj, List<CardPaymentAcquiring> value) {
			obj.setCardPaymentAcquiring(value);
		}
	};
	protected List<CardPaymentPartyRole> paymentCardPartyRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentPartyRole#mmCardPayment
	 * CardPaymentPartyRole.mmCardPayment}</li>
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
	public static final MMBusinessAssociationEnd<CardPayment, List<CardPaymentPartyRole>> mmPaymentCardPartyRole = new MMBusinessAssociationEnd<CardPayment, List<CardPaymentPartyRole>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPayment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentCardPartyRole";
			definition = "Specifies each role played by a party in the process of a payment by card.";
			minOccurs = 0;
			opposite_lazy = () -> CardPaymentPartyRole.mmCardPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CardPaymentPartyRole.mmObject();
		}

		@Override
		public List<CardPaymentPartyRole> getValue(CardPayment obj) {
			return obj.getPaymentCardPartyRole();
		}

		@Override
		public void setValue(CardPayment obj, List<CardPaymentPartyRole> value) {
			obj.setPaymentCardPartyRole(value);
		}
	};
	protected List<com.tools20022.repository.entity.CardPaymentStatus> cardPaymentStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentStatus#mmCardPayment
	 * CardPaymentStatus.mmCardPayment}</li>
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
	public static final MMBusinessAssociationEnd<CardPayment, List<CardPaymentStatus>> mmCardPaymentStatus = new MMBusinessAssociationEnd<CardPayment, List<CardPaymentStatus>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPayment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CardPaymentStatus";
			definition = "Status of the payment by card.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CardPaymentStatus.mmCardPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CardPaymentStatus.mmObject();
		}

		@Override
		public List<CardPaymentStatus> getValue(CardPayment obj) {
			return obj.getCardPaymentStatus();
		}

		@Override
		public void setValue(CardPayment obj, List<CardPaymentStatus> value) {
			obj.setCardPaymentStatus(value);
		}
	};
	protected Max35Text detailedAmountLabel;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<CardPayment, Max35Text> mmDetailedAmountLabel = new MMBusinessAttribute<CardPayment, Max35Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPayment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DetailedAmountLabel";
			definition = "Short description of the amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(CardPayment obj) {
			return obj.getDetailedAmountLabel();
		}

		@Override
		public void setValue(CardPayment obj, Max35Text value) {
			obj.setDetailedAmountLabel(value);
		}
	};
	protected ReconciliationTransaction reconciliation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction#mmCardPaymentTotal
	 * ReconciliationTransaction.mmCardPaymentTotal}</li>
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
	public static final MMBusinessAssociationEnd<CardPayment, Optional<ReconciliationTransaction>> mmReconciliation = new MMBusinessAssociationEnd<CardPayment, Optional<ReconciliationTransaction>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPayment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Reconciliation";
			definition = "Total of a certain type of transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> ReconciliationTransaction.mmCardPaymentTotal;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ReconciliationTransaction.mmObject();
		}

		@Override
		public Optional<ReconciliationTransaction> getValue(CardPayment obj) {
			return obj.getReconciliation();
		}

		@Override
		public void setValue(CardPayment obj, Optional<ReconciliationTransaction> value) {
			obj.setReconciliation(value.orElse(null));
		}
	};
	protected ExternalCardTransactionCategoryCode transactionCategory;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<CardPayment, ExternalCardTransactionCategoryCode> mmTransactionCategory = new MMBusinessAttribute<CardPayment, ExternalCardTransactionCategoryCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPayment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransactionCategory";
			definition = "Specifies the category to which the card transaction belongs.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalCardTransactionCategoryCode.mmObject();
		}

		@Override
		public ExternalCardTransactionCategoryCode getValue(CardPayment obj) {
			return obj.getTransactionCategory();
		}

		@Override
		public void setValue(CardPayment obj, ExternalCardTransactionCategoryCode value) {
			obj.setTransactionCategory(value);
		}
	};
	protected CurrencyAndAmount cashBackAmount;
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
	public static final MMBusinessAttribute<CardPayment, CurrencyAndAmount> mmCashBackAmount = new MMBusinessAttribute<CardPayment, CurrencyAndAmount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPayment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashBackAmount";
			definition = "Amount added to the total price of the transaction and received in cash by the customer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(CardPayment obj) {
			return obj.getCashBackAmount();
		}

		@Override
		public void setValue(CardPayment obj, CurrencyAndAmount value) {
			obj.setCashBackAmount(value);
		}
	};
	protected CurrencyAndAmount gratuity;
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
	public static final MMBusinessAttribute<CardPayment, CurrencyAndAmount> mmGratuity = new MMBusinessAttribute<CardPayment, CurrencyAndAmount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPayment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Gratuity";
			definition = "Amount tendered for a service performed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(CardPayment obj) {
			return obj.getGratuity();
		}

		@Override
		public void setValue(CardPayment obj, CurrencyAndAmount value) {
			obj.setGratuity(value);
		}
	};
	protected DebitCreditCode debitCreditDirection;
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
	public static final MMBusinessAttribute<CardPayment, DebitCreditCode> mmDebitCreditDirection = new MMBusinessAttribute<CardPayment, DebitCreditCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPayment.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebitCreditDirection";
			definition = "Specifies the direction of a payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DebitCreditCode.mmObject();
		}

		@Override
		public DebitCreditCode getValue(CardPayment obj) {
			return obj.getDebitCreditDirection();
		}

		@Override
		public void setValue(CardPayment obj, DebitCreditCode value) {
			obj.setDebitCreditDirection(value);
		}
	};
	protected List<com.tools20022.repository.entity.ATMTotal> aTMTotal;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ATMTotal#mmRelatedCardPayment
	 * ATMTotal.mmRelatedCardPayment}</li>
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
	public static final MMBusinessAssociationEnd<CardPayment, List<ATMTotal>> mmATMTotal = new MMBusinessAssociationEnd<CardPayment, List<ATMTotal>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPayment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ATMTotal";
			definition = "Current totals of the ATM.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ATMTotal.mmRelatedCardPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ATMTotal.mmObject();
		}

		@Override
		public List<ATMTotal> getValue(CardPayment obj) {
			return obj.getATMTotal();
		}

		@Override
		public void setValue(CardPayment obj, List<ATMTotal> value) {
			obj.setATMTotal(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardPayment";
				definition = "Payment through an electronic money product.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Product.mmCardPayment, com.tools20022.repository.entity.PaymentCard.mmPayment, CardPaymentPartyRole.mmCardPayment,
						com.tools20022.repository.entity.CardPaymentAcquiring.mmRelatedCardPayment, ReconciliationTransaction.mmCardPaymentTotal, com.tools20022.repository.entity.CardPaymentStatus.mmCardPayment,
						com.tools20022.repository.entity.ATMTotal.mmRelatedCardPayment);
				derivationElement_lazy = () -> Arrays.asList(CardTransaction16.mmTransaction, EntryTransaction9.mmCardTransaction, ReportEntry9.mmCardTransaction, CardTransaction3Choice.mmAggregated, CardTransaction3Choice.mmIndividual,
						CardEntry3.mmAggregatedEntry);
				superType_lazy = () -> IndividualPayment.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CardPayment.mmPaymentCard, com.tools20022.repository.entity.CardPayment.mmProduct, com.tools20022.repository.entity.CardPayment.mmDetailedAmount,
						com.tools20022.repository.entity.CardPayment.mmAmountQualifier, com.tools20022.repository.entity.CardPayment.mmCardPaymentAcquiring, com.tools20022.repository.entity.CardPayment.mmPaymentCardPartyRole,
						com.tools20022.repository.entity.CardPayment.mmCardPaymentStatus, com.tools20022.repository.entity.CardPayment.mmDetailedAmountLabel, com.tools20022.repository.entity.CardPayment.mmReconciliation,
						com.tools20022.repository.entity.CardPayment.mmTransactionCategory, com.tools20022.repository.entity.CardPayment.mmCashBackAmount, com.tools20022.repository.entity.CardPayment.mmGratuity,
						com.tools20022.repository.entity.CardPayment.mmDebitCreditDirection, com.tools20022.repository.entity.CardPayment.mmATMTotal);
				derivationComponent_lazy = () -> Arrays.asList(CardIndividualTransaction2.mmObject(), CardTransaction16.mmObject(), CardTransaction3Choice.mmObject(), CardAggregated2.mmObject(), CardEntry3.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return CardPayment.class;
			}
		});
		return mmObject_lazy.get();
	}

	public PaymentCard getPaymentCard() {
		return paymentCard;
	}

	public CardPayment setPaymentCard(com.tools20022.repository.entity.PaymentCard paymentCard) {
		this.paymentCard = Objects.requireNonNull(paymentCard);
		return this;
	}

	public List<Product> getProduct() {
		return product == null ? product = new ArrayList<>() : product;
	}

	public CardPayment setProduct(List<com.tools20022.repository.entity.Product> product) {
		this.product = Objects.requireNonNull(product);
		return this;
	}

	public ImpliedCurrencyAndAmount getDetailedAmount() {
		return detailedAmount;
	}

	public CardPayment setDetailedAmount(ImpliedCurrencyAndAmount detailedAmount) {
		this.detailedAmount = Objects.requireNonNull(detailedAmount);
		return this;
	}

	public TypeOfAmountCode getAmountQualifier() {
		return amountQualifier;
	}

	public CardPayment setAmountQualifier(TypeOfAmountCode amountQualifier) {
		this.amountQualifier = Objects.requireNonNull(amountQualifier);
		return this;
	}

	public List<CardPaymentAcquiring> getCardPaymentAcquiring() {
		return cardPaymentAcquiring == null ? cardPaymentAcquiring = new ArrayList<>() : cardPaymentAcquiring;
	}

	public CardPayment setCardPaymentAcquiring(List<com.tools20022.repository.entity.CardPaymentAcquiring> cardPaymentAcquiring) {
		this.cardPaymentAcquiring = Objects.requireNonNull(cardPaymentAcquiring);
		return this;
	}

	public List<CardPaymentPartyRole> getPaymentCardPartyRole() {
		return paymentCardPartyRole == null ? paymentCardPartyRole = new ArrayList<>() : paymentCardPartyRole;
	}

	public CardPayment setPaymentCardPartyRole(List<CardPaymentPartyRole> paymentCardPartyRole) {
		this.paymentCardPartyRole = Objects.requireNonNull(paymentCardPartyRole);
		return this;
	}

	public List<CardPaymentStatus> getCardPaymentStatus() {
		return cardPaymentStatus == null ? cardPaymentStatus = new ArrayList<>() : cardPaymentStatus;
	}

	public CardPayment setCardPaymentStatus(List<com.tools20022.repository.entity.CardPaymentStatus> cardPaymentStatus) {
		this.cardPaymentStatus = Objects.requireNonNull(cardPaymentStatus);
		return this;
	}

	public Max35Text getDetailedAmountLabel() {
		return detailedAmountLabel;
	}

	public CardPayment setDetailedAmountLabel(Max35Text detailedAmountLabel) {
		this.detailedAmountLabel = Objects.requireNonNull(detailedAmountLabel);
		return this;
	}

	public Optional<ReconciliationTransaction> getReconciliation() {
		return reconciliation == null ? Optional.empty() : Optional.of(reconciliation);
	}

	public CardPayment setReconciliation(ReconciliationTransaction reconciliation) {
		this.reconciliation = reconciliation;
		return this;
	}

	public ExternalCardTransactionCategoryCode getTransactionCategory() {
		return transactionCategory;
	}

	public CardPayment setTransactionCategory(ExternalCardTransactionCategoryCode transactionCategory) {
		this.transactionCategory = Objects.requireNonNull(transactionCategory);
		return this;
	}

	public CurrencyAndAmount getCashBackAmount() {
		return cashBackAmount;
	}

	public CardPayment setCashBackAmount(CurrencyAndAmount cashBackAmount) {
		this.cashBackAmount = Objects.requireNonNull(cashBackAmount);
		return this;
	}

	public CurrencyAndAmount getGratuity() {
		return gratuity;
	}

	public CardPayment setGratuity(CurrencyAndAmount gratuity) {
		this.gratuity = Objects.requireNonNull(gratuity);
		return this;
	}

	public DebitCreditCode getDebitCreditDirection() {
		return debitCreditDirection;
	}

	public CardPayment setDebitCreditDirection(DebitCreditCode debitCreditDirection) {
		this.debitCreditDirection = Objects.requireNonNull(debitCreditDirection);
		return this;
	}

	public List<ATMTotal> getATMTotal() {
		return aTMTotal == null ? aTMTotal = new ArrayList<>() : aTMTotal;
	}

	public CardPayment setATMTotal(List<com.tools20022.repository.entity.ATMTotal> aTMTotal) {
		this.aTMTotal = Objects.requireNonNull(aTMTotal);
		return this;
	}
}