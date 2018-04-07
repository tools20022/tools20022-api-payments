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
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.CashStandingOrder;
import com.tools20022.repository.entity.IndividualPayment;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Payment made by transferring an amount of money from a debtor to a creditor.
 * The payment flows through one or more financial institutions or systems.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CreditTransfer" src="doc-files/CreditTransfer.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.IndividualPayment
 * IndividualPayment}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CreditTransfer#mmStandingOrder
 * CreditTransfer.mmStandingOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CreditTransfer#mmRelatedStandingOrder
 * CreditTransfer.mmRelatedStandingOrder}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashStandingOrder#mmCreditTransfer
 * CashStandingOrder.mmCreditTransfer}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction23#mmCreditTransferTransaction
 * PaymentInstruction23.mmCreditTransferTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22#mmCreditTransferTransactionInformation
 * PaymentInstruction22.mmCreditTransferTransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction24#mmCreditTransferTransactionInformation
 * PaymentInstruction24.mmCreditTransferTransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BalanceTransfer1#mmBalanceTransferMethod
 * BalanceTransfer1.mmBalanceTransferMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction87#mmReturnChain
 * PaymentTransaction87.mmReturnChain}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction31#mmUnderlyingCustomerCreditTransfer
 * CreditTransferTransaction31.mmUnderlyingCustomerCreditTransfer}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CreditTransferTransaction26
 * CreditTransferTransaction26}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CreditTransferTransaction22
 * CreditTransferTransaction22}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CreditTransferTransaction27
 * CreditTransferTransaction27}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CreditTransferTransaction31
 * CreditTransferTransaction31}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionParties5
 * TransactionParties5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CreditTransferTransaction32
 * CreditTransferTransaction32}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CreditTransferTransaction30
 * CreditTransferTransaction30}</li>
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
 * "CreditTransfer"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Payment made by transferring an amount of money from a debtor to a creditor. The payment flows through one or more financial institutions or systems."
 * </li>
 * </ul>
 */
public class CreditTransfer extends IndividualPayment {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected YesNoIndicator standingOrder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CreditTransfer
	 * CreditTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a standing order. This information is derived from the presence of detailed standing order specification."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CreditTransfer, YesNoIndicator> mmStandingOrder = new MMBusinessAttribute<CreditTransfer, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CreditTransfer.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StandingOrder";
			definition = "Transaction is a standing order. This information is derived from the presence of detailed standing order specification.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(CreditTransfer obj) {
			return obj.getStandingOrder();
		}

		@Override
		public void setValue(CreditTransfer obj, YesNoIndicator value) {
			obj.setStandingOrder(value);
		}
	};
	protected CashStandingOrder relatedStandingOrder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashStandingOrder#mmCreditTransfer
	 * CashStandingOrder.mmCreditTransfer}</li>
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
	 * {@linkplain com.tools20022.repository.entity.CreditTransfer
	 * CreditTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedStandingOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Standing order which creates the credit transfers."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CreditTransfer, Optional<CashStandingOrder>> mmRelatedStandingOrder = new MMBusinessAssociationEnd<CreditTransfer, Optional<CashStandingOrder>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CreditTransfer.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedStandingOrder";
			definition = "Standing order which creates the credit transfers.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> CashStandingOrder.mmCreditTransfer;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CashStandingOrder.mmObject();
		}

		@Override
		public Optional<CashStandingOrder> getValue(CreditTransfer obj) {
			return obj.getRelatedStandingOrder();
		}

		@Override
		public void setValue(CreditTransfer obj, Optional<CashStandingOrder> value) {
			obj.setRelatedStandingOrder(value.orElse(null));
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CreditTransfer";
				definition = "Payment made by transferring an amount of money from a debtor to a creditor. The payment flows through one or more financial institutions or systems.";
				associationDomain_lazy = () -> Arrays.asList(CashStandingOrder.mmCreditTransfer);
				derivationElement_lazy = () -> Arrays.asList(PaymentInstruction23.mmCreditTransferTransaction, PaymentInstruction22.mmCreditTransferTransactionInformation, PaymentInstruction24.mmCreditTransferTransactionInformation,
						BalanceTransfer1.mmBalanceTransferMethod, PaymentTransaction87.mmReturnChain, CreditTransferTransaction31.mmUnderlyingCustomerCreditTransfer);
				superType_lazy = () -> IndividualPayment.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CreditTransfer.mmStandingOrder, com.tools20022.repository.entity.CreditTransfer.mmRelatedStandingOrder);
				derivationComponent_lazy = () -> Arrays.asList(CreditTransferTransaction26.mmObject(), CreditTransferTransaction22.mmObject(), CreditTransferTransaction27.mmObject(), CreditTransferTransaction31.mmObject(),
						TransactionParties5.mmObject(), CreditTransferTransaction32.mmObject(), CreditTransferTransaction30.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return CreditTransfer.class;
			}
		});
		return mmObject_lazy.get();
	}

	public YesNoIndicator getStandingOrder() {
		return standingOrder;
	}

	public CreditTransfer setStandingOrder(YesNoIndicator standingOrder) {
		this.standingOrder = Objects.requireNonNull(standingOrder);
		return this;
	}

	public Optional<CashStandingOrder> getRelatedStandingOrder() {
		return relatedStandingOrder == null ? Optional.empty() : Optional.of(relatedStandingOrder);
	}

	public CreditTransfer setRelatedStandingOrder(CashStandingOrder relatedStandingOrder) {
		this.relatedStandingOrder = relatedStandingOrder;
		return this;
	}
}