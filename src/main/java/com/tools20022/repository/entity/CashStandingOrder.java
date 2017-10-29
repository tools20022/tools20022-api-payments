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
import com.tools20022.repository.codeset.DebitCreditCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.StandingOrder;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Instruction given by a party that has explicit authority to instruct a debit
 * on the account, ie, either the debit account owner or originating party, to a
 * first agent, to process cash transfers at specified intervals during an
 * implicit or explicit period of time. A standing order is given once and is
 * valid for an open or closed period of time.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CashStandingOrder" src="doc-files/CashStandingOrder.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashStandingOrder#ZeroSweepIndicator
 * CashStandingOrder.ZeroSweepIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashStandingOrder#RelatedCashServices
 * CashStandingOrder.RelatedCashServices}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashStandingOrder#CreditDebitIndicator
 * CashStandingOrder.CreditDebitIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashStandingOrder#CreditTransfer
 * CashStandingOrder.CreditTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashStandingOrder#FloorAmount
 * CashStandingOrder.FloorAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashStandingOrder#CashAccount
 * CashStandingOrder.CashAccount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#CashStandingOrder
 * CashAccount.CashStandingOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashManagementService#StandingOrder
 * CashManagementService.StandingOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CreditTransfer#RelatedStandingOrder
 * CreditTransfer.RelatedStandingOrder}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.StandingOrder
 * StandingOrder}</li>
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
 * "CashStandingOrder"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Instruction given by a party that has explicit authority to instruct a debit on the account, ie, either the debit account owner or originating party, to a first agent, to process cash transfers at specified intervals during an implicit or explicit period of time. A standing order is given once and is valid for an open or closed period of time."
 * </li>
 * </ul>
 */
public class CashStandingOrder extends StandingOrder {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates whether the liquidity transfer standing order is defined as a
	 * zero sweeping order. When true, the liquidity transfer standing order
	 * will transfer all amount of money out of the account so the resulting
	 * balance is zero.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashStandingOrder
	 * CashStandingOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ZeroSweepIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the liquidity transfer standing order is defined as a zero sweeping order. When true, the liquidity transfer standing order will transfer all amount of money out of the account so the resulting balance is  zero."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ZeroSweepIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CashStandingOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ZeroSweepIndicator";
			definition = "Indicates whether the liquidity transfer standing order is defined as a zero sweeping order. When true, the liquidity transfer standing order will transfer all amount of money out of the account so the resulting balance is  zero.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	/**
	 * Cash management services which provide standing order facilities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashManagementService#StandingOrder
	 * CashManagementService.StandingOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CashManagementService
	 * CashManagementService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashStandingOrder
	 * CashStandingOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCashServices"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash management services which provide standing order facilities."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedCashServices = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashStandingOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCashServices";
			definition = "Cash management services which provide standing order facilities.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CashManagementService.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashManagementService.StandingOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies if the account is debited or credited by the standing order.
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
	 * {@linkplain com.tools20022.repository.entity.CashStandingOrder
	 * CashStandingOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if the account is debited or credited by the standing order."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CreditDebitIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CashStandingOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Specifies if the account is debited or credited by the standing order.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DebitCreditCode.mmObject();
		}
	};
	/**
	 * Standing order causes a payment instruction at regular intervals, eg, as
	 * specified by its frequency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CreditTransfer#RelatedStandingOrder
	 * CreditTransfer.RelatedStandingOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CreditTransfer
	 * CreditTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashStandingOrder
	 * CashStandingOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Standing order causes a payment instruction at regular intervals, eg, as specified by its frequency."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CreditTransfer = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashStandingOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditTransfer";
			definition = "Standing order causes a payment instruction at regular intervals, eg, as specified by its frequency.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CreditTransfer.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CreditTransfer.RelatedStandingOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Minimum amount of money that should remain on the debtor's account, for
	 * cash management purposes.
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
	 * {@linkplain com.tools20022.repository.entity.CashStandingOrder
	 * CashStandingOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FloorAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum amount of money that should remain on the debtor's account, for cash management purposes."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute FloorAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CashStandingOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FloorAmount";
			definition = "Minimum amount of money that should remain on the debtor's account, for cash management purposes.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Cash account for which a standing order applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#CashStandingOrder
	 * CashAccount.CashStandingOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccount
	 * CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashStandingOrder
	 * CashStandingOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash account for which a standing order applies."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CashAccount = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashStandingOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashAccount";
			definition = "Cash account for which a standing order applies.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CashAccount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.CashStandingOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CashStandingOrder";
				definition = "Instruction given by a party that has explicit authority to instruct a debit on the account, ie, either the debit account owner or originating party, to a first agent, to process cash transfers at specified intervals during an implicit or explicit period of time. A standing order is given once and is valid for an open or closed period of time.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccount.CashStandingOrder, com.tools20022.repository.entity.CashManagementService.StandingOrder,
						com.tools20022.repository.entity.CreditTransfer.RelatedStandingOrder);
				superType_lazy = () -> StandingOrder.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashStandingOrder.ZeroSweepIndicator, com.tools20022.repository.entity.CashStandingOrder.RelatedCashServices,
						com.tools20022.repository.entity.CashStandingOrder.CreditDebitIndicator, com.tools20022.repository.entity.CashStandingOrder.CreditTransfer, com.tools20022.repository.entity.CashStandingOrder.FloorAmount,
						com.tools20022.repository.entity.CashStandingOrder.CashAccount);
			}
		});
		return mmObject_lazy.get();
	}
}